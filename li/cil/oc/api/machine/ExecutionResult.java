/*    */ package li.cil.oc.api.machine;
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
/*    */ public abstract class ExecutionResult
/*    */ {
/*    */   public static final class Sleep
/*    */     extends ExecutionResult
/*    */   {
/*    */     public final int ticks;
/*    */     
/*    */     public Sleep(int ticks) {
/* 24 */       this.ticks = ticks;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class Shutdown
/*    */     extends ExecutionResult
/*    */   {
/*    */     public final boolean reboot;
/*    */ 
/*    */ 
/*    */     
/*    */     public Shutdown(boolean reboot) {
/* 38 */       this.reboot = reboot;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class SynchronizedCall
/*    */     extends ExecutionResult {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final class Error
/*    */     extends ExecutionResult
/*    */   {
/*    */     public final String message;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public Error(String message) {
/* 62 */       this.message = message;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\ExecutionResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */