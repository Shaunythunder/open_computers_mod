/*    */ package li.cil.oc.integration.railcraft;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModRailcraft$ implements ModProxy {
/*  8 */   private ModRailcraft$() { MODULE$ = this; } public static final ModRailcraft$ MODULE$; public Mods.SimpleMod getMod() {
/*  9 */     return li.cil.oc.integration.Mods$.MODULE$.Railcraft();
/*    */   }
/*    */   public void initialize() {
/* 12 */     IMC.registerWrenchTool("li.cil.oc.integration.railcraft.EventHandlerRailcraft.useWrench");
/* 13 */     IMC.registerWrenchToolCheck("li.cil.oc.integration.railcraft.EventHandlerRailcraft.isWrench");
/*    */     
/* 15 */     Driver.add((SidedBlock)new DriverBoilerFirebox());
/* 16 */     Driver.add((SidedBlock)new DriverSteamTurbine());
/* 17 */     Driver.add((SidedBlock)DriverAnchor$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\railcraft\ModRailcraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */