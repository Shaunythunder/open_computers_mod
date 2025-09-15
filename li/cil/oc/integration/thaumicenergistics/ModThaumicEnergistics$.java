/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModThaumicEnergistics$ implements ModProxy {
/*  8 */   private ModThaumicEnergistics$() { MODULE$ = this; } public static final ModThaumicEnergistics$ MODULE$; public Mod getMod() {
/*  9 */     return (Mod)li.cil.oc.integration.Mods$.MODULE$.ThaumicEnergistics();
/*    */   }
/*    */   public void initialize() {
/* 12 */     Driver.add((SidedBlock)DriverController$.MODULE$);
/* 13 */     Driver.add((SidedBlock)DriverBlockInterface$.MODULE$);
/* 14 */     Driver.add(DriverEssentiaExportBus$.MODULE$);
/* 15 */     Driver.add(DriverEssentiaImportBus$.MODULE$);
/*    */     
/* 17 */     Driver.add(DriverController.Provider$.MODULE$);
/* 18 */     Driver.add(DriverBlockInterface.Provider$.MODULE$);
/* 19 */     Driver.add(DriverEssentiaExportBus.Provider$.MODULE$);
/* 20 */     Driver.add(DriverEssentiaImportBus.Provider$.MODULE$);
/* 21 */     Driver.add(ConvertAspectCraftable$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\ModThaumicEnergistics$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */