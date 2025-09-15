/*    */ package li.cil.oc.integration.bluepower;
/*    */ 
/*    */ import li.cil.oc.api.IMC;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModBluePower$ implements ModProxy {
/*  7 */   private ModBluePower$() { MODULE$ = this; } public static final ModBluePower$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.BluePower();
/*    */   }
/*    */   public void initialize() {
/* 11 */     IMC.registerWrenchTool("li.cil.oc.integration.bluepower.EventHandlerBluePower.useWrench");
/* 12 */     IMC.registerWrenchToolCheck("li.cil.oc.integration.bluepower.EventHandlerBluePower.isWrench");
/*    */     
/* 14 */     RedstoneProvider$.MODULE$.init();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\bluepower\ModBluePower$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */