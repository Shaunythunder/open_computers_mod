/*     */ package li.cil.repack.com.naef.jnlua;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.io.PrintWriter;
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
/*     */ public class LuaRuntimeException
/*     */   extends LuaException
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*  23 */   private static final LuaStackTraceElement[] EMPTY_LUA_STACK_TRACE = new LuaStackTraceElement[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private LuaStackTraceElement[] luaStackTrace;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaRuntimeException(String msg) {
/*  37 */     super(msg);
/*  38 */     this.luaStackTrace = EMPTY_LUA_STACK_TRACE;
/*     */   }
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
/*     */   public LuaRuntimeException(String msg, Throwable cause) {
/*  51 */     super(msg, cause);
/*  52 */     this.luaStackTrace = EMPTY_LUA_STACK_TRACE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaRuntimeException(Throwable cause) {
/*  63 */     super(cause);
/*  64 */     this.luaStackTrace = EMPTY_LUA_STACK_TRACE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaStackTraceElement[] getLuaStackTrace() {
/*  72 */     return (LuaStackTraceElement[])this.luaStackTrace.clone();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void printLuaStackTrace() {
/*  81 */     printLuaStackTrace(System.err);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void printLuaStackTrace(PrintStream s) {
/*  92 */     synchronized (s) {
/*  93 */       s.println(this);
/*  94 */       for (int i = 0; i < this.luaStackTrace.length; i++) {
/*  95 */         s.print("\tat ");
/*  96 */         s.println(this.luaStackTrace[i]);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void printLuaStackTrace(PrintWriter s) {
/* 109 */     synchronized (s) {
/* 110 */       s.println(this);
/* 111 */       for (int i = 0; i < this.luaStackTrace.length; i++) {
/* 112 */         s.print("\tat ");
/* 113 */         s.println(this.luaStackTrace[i]);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void setLuaError(LuaError luaError) {
/* 124 */     initCause(luaError.getCause());
/* 125 */     this.luaStackTrace = luaError.getLuaStackTrace();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\LuaRuntimeException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */