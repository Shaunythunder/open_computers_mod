/*   */ package li.cil.oc.integration.ae2fc;
/*   */ 
/*   */ import li.cil.oc.integration.Mod;
/*   */ 
/*   */ public final class ModAe2fc$ implements ModProxy {
/* 6 */   private ModAe2fc$() { MODULE$ = this; } public static final ModAe2fc$ MODULE$; public Mod getMod() {
/* 7 */     return (Mod)li.cil.oc.integration.Mods$.MODULE$.Ae2Fc();
/*   */   } public void initialize() {
/* 9 */     Driver.add(ConverterFluidDrop$.MODULE$);
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ae2fc\ModAe2fc$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */