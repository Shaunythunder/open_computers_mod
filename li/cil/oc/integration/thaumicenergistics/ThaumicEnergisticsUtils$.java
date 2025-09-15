/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ import appeng.api.storage.data.IAEFluidStack;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ 
/*    */ public final class ThaumicEnergisticsUtils$ {
/*    */   public FluidStack getAspect(IAEFluidStack fluid) {
/*  7 */     FluidStack aspect = fluid.getFluidStack().copy();
/*  8 */     aspect.amount = (int)(fluid.getStackSize() / 128L);
/*  9 */     return aspect;
/*    */   } public static final ThaumicEnergisticsUtils$ MODULE$; private ThaumicEnergisticsUtils$() {
/* 11 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\ThaumicEnergisticsUtils$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */