/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaThread
/*     */   extends LuaValue
/*     */ {
/*     */   public static LuaValue s_metatable;
/*  72 */   public static int coroutine_count = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  82 */   public static long thread_orphan_check_interval = 5000L;
/*     */   
/*     */   public static final int STATUS_INITIAL = 0;
/*     */   public static final int STATUS_SUSPENDED = 1;
/*     */   public static final int STATUS_RUNNING = 2;
/*     */   public static final int STATUS_NORMAL = 3;
/*     */   public static final int STATUS_DEAD = 4;
/*  89 */   public static final String[] STATUS_NAMES = new String[] { "suspended", "suspended", "running", "normal", "dead" };
/*     */ 
/*     */   
/*     */   public final State state;
/*     */ 
/*     */   
/*     */   public static final int MAX_CALLSTACK = 256;
/*     */ 
/*     */   
/*     */   public Object callstack;
/*     */ 
/*     */   
/*     */   public final Globals globals;
/*     */ 
/*     */   
/*     */   public LuaValue errorfunc;
/*     */ 
/*     */   
/*     */   public LuaThread(Globals globals) {
/* 108 */     this.state = new State(globals, this, null);
/* 109 */     this.state.status = 2;
/* 110 */     this.globals = globals;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaThread(Globals globals, LuaValue func) {
/* 119 */     LuaValue.assert_((func != null), "function cannot be null");
/* 120 */     this.state = new State(globals, this, func);
/* 121 */     this.globals = globals;
/*     */   }
/*     */ 
/*     */   
/*     */   public int type() {
/* 126 */     return 8;
/*     */   }
/*     */ 
/*     */   
/*     */   public String typename() {
/* 131 */     return "thread";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isthread() {
/* 136 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaThread optthread(LuaThread defval) {
/* 141 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaThread checkthread() {
/* 146 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue getmetatable() {
/* 151 */     return s_metatable;
/*     */   }
/*     */   public String getStatus() {
/* 154 */     return STATUS_NAMES[this.state.status];
/*     */   } public boolean isMainThread() {
/* 156 */     return (this.state.function == null);
/*     */   }
/*     */   public Varargs resume(Varargs args) {
/* 159 */     State s = this.state;
/* 160 */     if (s.status > 1)
/* 161 */       return LuaValue.varargsOf(LuaValue.FALSE, LuaValue.valueOf("cannot resume " + (
/* 162 */             (s.status == 4) ? "dead" : "non-suspended") + " coroutine")); 
/* 163 */     return s.lua_resume(this, args);
/*     */   }
/*     */   
/*     */   public static class State implements Runnable {
/*     */     private final Globals globals;
/*     */     final WeakReference lua_thread;
/*     */     public final LuaValue function;
/* 170 */     Varargs args = LuaValue.NONE;
/* 171 */     Varargs result = LuaValue.NONE;
/* 172 */     String error = null;
/*     */     
/*     */     public LuaValue hookfunc;
/*     */     
/*     */     public boolean hookline;
/*     */     
/*     */     public boolean hookcall;
/*     */     
/*     */     public boolean hookrtrn;
/*     */     public int hookcount;
/*     */     public boolean inhook;
/*     */     public int lastline;
/*     */     public int bytecodes;
/* 185 */     public int status = 0;
/*     */     
/*     */     State(Globals globals, LuaThread lua_thread, LuaValue function) {
/* 188 */       this.globals = globals;
/* 189 */       this.lua_thread = new WeakReference<>(lua_thread);
/* 190 */       this.function = function;
/*     */     }
/*     */ 
/*     */     
/*     */     public synchronized void run() {
/*     */       try {
/* 196 */         Varargs a = this.args;
/* 197 */         this.args = LuaValue.NONE;
/* 198 */         this.result = this.function.invoke(a);
/* 199 */       } catch (Throwable t) {
/* 200 */         this.error = t.getMessage();
/*     */       } finally {
/* 202 */         this.status = 4;
/* 203 */         notify();
/*     */       } 
/*     */     }
/*     */     
/*     */     public synchronized Varargs lua_resume(LuaThread new_thread, Varargs args) {
/* 208 */       LuaThread previous_thread = this.globals.running;
/*     */       try {
/* 210 */         this.globals.running = new_thread;
/* 211 */         this.args = args;
/* 212 */         if (this.status == 0) {
/* 213 */           this.status = 2;
/* 214 */           (new Thread(this, "Coroutine-" + ++LuaThread.coroutine_count)).start();
/*     */         } else {
/* 216 */           notify();
/*     */         } 
/* 218 */         if (previous_thread != null)
/* 219 */           previous_thread.state.status = 3; 
/* 220 */         this.status = 2;
/* 221 */         wait();
/* 222 */         return (this.error != null) ? LuaValue.varargsOf(LuaValue.FALSE, LuaValue.valueOf(this.error)) : 
/* 223 */           LuaValue.varargsOf(LuaValue.TRUE, this.result);
/* 224 */       } catch (InterruptedException ie) {
/* 225 */         throw new OrphanedThread();
/*     */       } finally {
/* 227 */         this.args = LuaValue.NONE;
/* 228 */         this.result = LuaValue.NONE;
/* 229 */         this.error = null;
/* 230 */         this.globals.running = previous_thread;
/* 231 */         if (previous_thread != null)
/* 232 */           this.globals.running.state.status = 2; 
/*     */       } 
/*     */     }
/*     */     
/*     */     public synchronized Varargs lua_yield(Varargs args) {
/*     */       try {
/* 238 */         this.result = args;
/* 239 */         this.status = 1;
/* 240 */         notify();
/*     */         while (true)
/* 242 */         { wait(LuaThread.thread_orphan_check_interval);
/* 243 */           if (this.lua_thread.get() == null) {
/* 244 */             this.status = 4;
/* 245 */             throw new OrphanedThread();
/*     */           } 
/* 247 */           if (this.status != 1)
/* 248 */             return this.args;  } 
/* 249 */       } catch (InterruptedException ie) {
/* 250 */         this.status = 4;
/* 251 */         throw new OrphanedThread();
/*     */       } finally {
/* 253 */         this.args = LuaValue.NONE;
/* 254 */         this.result = LuaValue.NONE;
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaThread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */