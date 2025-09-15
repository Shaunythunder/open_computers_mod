/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaFunction;
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*     */ import li.cil.repack.org.luaj.vm2.LuaThread;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
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
/*     */ public class CoroutineLib
/*     */   extends TwoArgFunction
/*     */ {
/*  76 */   static int coroutine_count = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   Globals globals;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/*  92 */     this.globals = env.checkglobals();
/*  93 */     LuaTable coroutine = new LuaTable();
/*  94 */     coroutine.set("create", (LuaValue)new create());
/*  95 */     coroutine.set("resume", (LuaValue)new resume());
/*  96 */     coroutine.set("running", (LuaValue)new running());
/*  97 */     coroutine.set("status", (LuaValue)new status());
/*  98 */     coroutine.set("yield", (LuaValue)new yield());
/*  99 */     coroutine.set("wrap", (LuaValue)new wrap());
/* 100 */     env.set("coroutine", (LuaValue)coroutine);
/* 101 */     if (!env.get("package").isnil())
/* 102 */       env.get("package").get("loaded").set("coroutine", (LuaValue)coroutine); 
/* 103 */     return (LuaValue)coroutine;
/*     */   }
/*     */   
/*     */   final class create
/*     */     extends LibFunction {
/*     */     public LuaValue call(LuaValue f) {
/* 109 */       return (LuaValue)new LuaThread(CoroutineLib.this.globals, (LuaValue)f.checkfunction());
/*     */     }
/*     */   }
/*     */   
/*     */   static final class resume
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 116 */       LuaThread t = args.checkthread(1);
/* 117 */       return t.resume(args.subargs(2));
/*     */     }
/*     */   }
/*     */   
/*     */   final class running
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 124 */       LuaThread r = CoroutineLib.this.globals.running;
/* 125 */       return varargsOf((LuaValue)r, (Varargs)valueOf(r.isMainThread()));
/*     */     }
/*     */   }
/*     */   
/*     */   static final class status
/*     */     extends LibFunction {
/*     */     public LuaValue call(LuaValue t) {
/* 132 */       LuaThread lt = t.checkthread();
/* 133 */       return (LuaValue)valueOf(lt.getStatus());
/*     */     }
/*     */   }
/*     */   
/*     */   final class yield
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 140 */       return CoroutineLib.this.globals.yield(args);
/*     */     }
/*     */   }
/*     */   
/*     */   final class wrap
/*     */     extends LibFunction {
/*     */     public LuaValue call(LuaValue f) {
/* 147 */       LuaFunction luaFunction = f.checkfunction();
/* 148 */       LuaThread thread = new LuaThread(CoroutineLib.this.globals, (LuaValue)luaFunction);
/* 149 */       return (LuaValue)new CoroutineLib.wrapper(thread);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class wrapper extends VarArgFunction {
/*     */     final LuaThread luathread;
/*     */     
/*     */     wrapper(LuaThread luathread) {
/* 157 */       this.luathread = luathread;
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs invoke(Varargs args) {
/* 162 */       Varargs result = this.luathread.resume(args);
/* 163 */       if (result.arg1().toboolean()) {
/* 164 */         return result.subargs(2);
/*     */       }
/* 166 */       return (Varargs)error(result.arg(2).tojstring());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\CoroutineLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */