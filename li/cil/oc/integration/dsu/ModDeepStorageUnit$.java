/*    */ package li.cil.oc.integration.dsu;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ 
/*    */ public final class ModDeepStorageUnit$ implements ModProxy {
/*  9 */   private ModDeepStorageUnit$() { MODULE$ = this; } public static final ModDeepStorageUnit$ MODULE$; public Mods.ClassBasedMod getMod() {
/* 10 */     return li.cil.oc.integration.Mods$.MODULE$.DeepStorageUnit();
/*    */   }
/*    */   public void initialize() {
/* 13 */     Driver.add((SidedBlock)DriverDeepStorageUnit$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\dsu\ModDeepStorageUnit$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */