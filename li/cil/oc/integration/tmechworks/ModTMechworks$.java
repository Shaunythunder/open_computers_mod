/*    */ package li.cil.oc.integration.tmechworks;
/*    */ 
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModTMechworks$ implements ModProxy {
/*  7 */   private ModTMechworks$() { MODULE$ = this; } public static final ModTMechworks$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.TMechWorks();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((SidedBlock)new DriverDrawBridge());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tmechworks\ModTMechworks$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */