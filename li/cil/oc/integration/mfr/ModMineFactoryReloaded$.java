/*    */ package li.cil.oc.integration.mfr;
/*    */ 
/*    */ import li.cil.oc.api.IMC;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ 
/*    */ public final class ModMineFactoryReloaded$ implements ModProxy {
/*  8 */   private ModMineFactoryReloaded$() { MODULE$ = this; } public static final ModMineFactoryReloaded$ MODULE$; public Mods.SimpleMod getMod() {
/*  9 */     return li.cil.oc.integration.Mods$.MODULE$.MineFactoryReloaded();
/*    */   }
/*    */   public void initialize() {
/* 12 */     IMC.registerWrenchTool("li.cil.oc.integration.mfr.EventHandlerMFR.useWrench");
/* 13 */     IMC.registerWrenchToolCheck("li.cil.oc.integration.mfr.EventHandlerMFR.isWrench");
/*    */     
/* 15 */     Driver.add(ConverterSafariNet$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mfr\ModMineFactoryReloaded$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */