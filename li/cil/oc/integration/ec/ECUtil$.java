/*   */ package li.cil.oc.integration.ec;
/*   */ 
/*   */ import appeng.api.storage.data.IAEFluidStack;
/*   */ import extracells.api.ECApi;
/*   */ 
/*   */ public final class ECUtil$ {
/* 7 */   public boolean canSeeFluidInNetwork(IAEFluidStack fluid) { return (fluid != null && ECApi.instance().canFluidSeeInTerminal(fluid.getFluid())); } public static final ECUtil$ MODULE$; private ECUtil$() {
/* 8 */     MODULE$ = this;
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ec\ECUtil$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */