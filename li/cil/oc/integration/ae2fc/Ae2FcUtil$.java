/*   */ package li.cil.oc.integration.ae2fc;
/*   */ 
/*   */ import appeng.api.storage.data.IAEFluidStack;
/*   */ import com.glodblock.github.api.FluidCraftAPI;
/*   */ 
/*   */ public final class Ae2FcUtil$ {
/* 7 */   public boolean canSeeFluidInNetwork(IAEFluidStack fluid) { return !(fluid == null || fluid.getFluid() == null || FluidCraftAPI.instance().isBlacklistedInDisplay(fluid.getFluid().getClass())); } public static final Ae2FcUtil$ MODULE$; private Ae2FcUtil$() {
/* 8 */     MODULE$ = this;
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ae2fc\Ae2FcUtil$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */