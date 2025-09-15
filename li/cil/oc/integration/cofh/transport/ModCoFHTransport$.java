/*    */ package li.cil.oc.integration.cofh.transport;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ 
/*    */ public final class ModCoFHTransport$ implements ModProxy {
/*  7 */   private ModCoFHTransport$() { MODULE$ = this; } public static final ModCoFHTransport$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.CoFHTransport();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((SidedBlock)new DriverEnderEnergy());
/* 12 */     Driver.add((SidedBlock)new DriverEnderFluid());
/* 13 */     Driver.add((SidedBlock)new DriverEnderItem());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\transport\ModCoFHTransport$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */