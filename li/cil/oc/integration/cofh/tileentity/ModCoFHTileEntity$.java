/*    */ package li.cil.oc.integration.cofh.tileentity;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ 
/*    */ public final class ModCoFHTileEntity$ implements ModProxy {
/*  7 */   private ModCoFHTileEntity$() { MODULE$ = this; } public static final ModCoFHTileEntity$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.CoFHTileEntity();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((SidedBlock)new DriverEnergyInfo());
/* 12 */     Driver.add((SidedBlock)new DriverRedstoneControl());
/* 13 */     Driver.add((SidedBlock)new DriverSecureTile());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\tileentity\ModCoFHTileEntity$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */