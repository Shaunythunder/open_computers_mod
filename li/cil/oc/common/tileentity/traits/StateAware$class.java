/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ 
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.api.util.StateAware;
/*    */ 
/*    */ public abstract class StateAware$class {
/*    */   public static void $init$(StateAware $this) {}
/*    */   
/*    */   @Method(modid = "BuildCraft|Core")
/*    */   public static boolean hasWork(StateAware $this) {
/* 11 */     return ($this.getCurrentState().contains(StateAware.State.CanWork) || $this.getCurrentState().contains(StateAware.State.IsWorking));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\StateAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */