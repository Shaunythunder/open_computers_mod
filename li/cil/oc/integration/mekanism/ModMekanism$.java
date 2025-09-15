/*    */ package li.cil.oc.integration.mekanism;
/*    */ 
/*    */ import li.cil.oc.api.IMC;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModMekanism$ implements ModProxy {
/*  7 */   private ModMekanism$() { MODULE$ = this; } public static final ModMekanism$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.Mekanism();
/*    */   }
/*    */   public void initialize() {
/* 11 */     IMC.registerWrenchTool("li.cil.oc.integration.mekanism.EventHandlerMekanism.useWrench");
/* 12 */     IMC.registerWrenchToolCheck("li.cil.oc.integration.mekanism.EventHandlerMekanism.isWrench");
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mekanism\ModMekanism$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */