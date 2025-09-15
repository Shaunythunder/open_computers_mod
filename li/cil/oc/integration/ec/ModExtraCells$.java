/*    */ package li.cil.oc.integration.ec;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModExtraCells$ implements ModProxy {
/*  8 */   private ModExtraCells$() { MODULE$ = this; } public static final ModExtraCells$ MODULE$; public Mod getMod() {
/*  9 */     return (Mod)li.cil.oc.integration.Mods$.MODULE$.ExtraCells();
/*    */   }
/*    */   public void initialize() {
/* 12 */     Driver.add((SidedBlock)DriverController$.MODULE$);
/* 13 */     Driver.add((SidedBlock)DriverBlockInterface$.MODULE$);
/*    */     
/* 15 */     Driver.add(DriverController.Provider$.MODULE$);
/* 16 */     Driver.add(DriverBlockInterface.Provider$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ec\ModExtraCells$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */