/*    */ package li.cil.oc.integration.wrsve;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ 
/*    */ public final class ModWRSVE$ implements ModProxy {
/*  7 */   private ModWRSVE$() { MODULE$ = this; } public static final ModWRSVE$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.WirelessRedstoneSVE();
/*    */   }
/*    */   public void initialize() {
/* 11 */     li.cil.oc.integration.util.WirelessRedstone$.MODULE$.systems().$plus$eq(WirelessRedstoneSVE$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\wrsve\ModWRSVE$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */