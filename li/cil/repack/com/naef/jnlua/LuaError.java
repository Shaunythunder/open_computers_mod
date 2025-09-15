/*    */ package li.cil.repack.com.naef.jnlua;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class LuaError
/*    */ {
/*    */   private String message;
/*    */   private LuaStackTraceElement[] luaStackTrace;
/*    */   private Throwable cause;
/*    */   
/*    */   public LuaError(String message, Throwable cause) {
/* 23 */     this.message = message;
/* 24 */     this.cause = cause;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMessage() {
/* 32 */     return this.message;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public LuaStackTraceElement[] getLuaStackTrace() {
/* 39 */     return this.luaStackTrace;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Throwable getCause() {
/* 46 */     return this.cause;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 52 */     StringBuilder sb = new StringBuilder();
/* 53 */     if (this.message != null) {
/* 54 */       sb.append(this.message);
/*    */     }
/* 56 */     if (this.cause != null) {
/* 57 */       if (this.cause.getMessage() != null) {
/* 58 */         sb.append(this.cause.getMessage());
/*    */       } else {
/*    */         
/* 61 */         sb.append(this.cause);
/*    */       } 
/*    */     }
/* 64 */     return sb.toString();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   void setLuaStackTrace(LuaStackTraceElement[] luaStackTrace) {
/* 72 */     this.luaStackTrace = luaStackTrace;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\LuaError.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */