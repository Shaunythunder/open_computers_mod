/*   */ package li.cil.oc.client.renderer.tileentity;
/*   */ 
/*   */ public final class RenderUtil$ {
/*   */   public boolean shouldShowErrorLight(int hash) {
/* 5 */     long time = System.currentTimeMillis() + hash;
/* 6 */     long timeSlice = time / 500L;
/* 7 */     return (timeSlice % 2L == 0L);
/*   */   } public static final RenderUtil$ MODULE$; private RenderUtil$() {
/* 9 */     MODULE$ = this;
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\RenderUtil$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */