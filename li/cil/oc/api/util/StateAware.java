/*    */ package li.cil.oc.api.util;
/*    */ 
/*    */ import java.util.EnumSet;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface StateAware
/*    */ {
/*    */   EnumSet<State> getCurrentState();
/*    */   
/*    */   public enum State
/*    */   {
/* 28 */     None,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     CanWork,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 40 */     IsWorking;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\ap\\util\StateAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */