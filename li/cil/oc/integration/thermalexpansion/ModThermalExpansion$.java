/*    */ package li.cil.oc.integration.thermalexpansion;
/*    */ 
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModThermalExpansion$ implements ModProxy {
/*  7 */   private ModThermalExpansion$() { MODULE$ = this; } public static final ModThermalExpansion$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.ThermalExpansion();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((SidedBlock)new DriverLamp());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thermalexpansion\ModThermalExpansion$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */