/*    */ package li.cil.oc.integration.ic2;
/*    */ 
/*    */ import cpw.mods.fml.common.Loader;
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.IMC;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModIndustrialCraft2$ implements ModProxy {
/* 10 */   private ModIndustrialCraft2$() { MODULE$ = this; } public static final ModIndustrialCraft2$ MODULE$; public Mods.SimpleMod getMod() {
/* 11 */     return li.cil.oc.integration.Mods$.MODULE$.IndustrialCraft2();
/*    */   }
/*    */   public void initialize() {
/* 14 */     IMC.registerToolDurabilityProvider("li.cil.oc.integration.ic2.EventHandlerIndustrialCraft2.getDurability");
/* 15 */     IMC.registerWrenchTool("li.cil.oc.integration.ic2.EventHandlerIndustrialCraft2.useWrench");
/* 16 */     IMC.registerWrenchToolCheck("li.cil.oc.integration.ic2.EventHandlerIndustrialCraft2.isWrench");
/* 17 */     IMC.registerItemCharge(
/* 18 */         "IndustrialCraft2", 
/* 19 */         "li.cil.oc.integration.ic2.EventHandlerIndustrialCraft2.canCharge", 
/* 20 */         "li.cil.oc.integration.ic2.EventHandlerIndustrialCraft2.charge");
/*    */     
/* 22 */     MinecraftForge.EVENT_BUS.register(EventHandlerIndustrialCraft2$.MODULE$);
/*    */     
/* 24 */     if (!Loader.isModLoaded("IC2-Classic-Spmod")) {
/* 25 */       Driver.add((SidedBlock)new DriverReactorRedstonePort());
/* 26 */       Driver.add((SidedBlock)new DriverMassFab());
/*    */     } 
/*    */     
/* 29 */     Driver.add((SidedBlock)new DriverEnergyConductor());
/* 30 */     Driver.add((SidedBlock)new DriverEnergySink());
/* 31 */     Driver.add((SidedBlock)new DriverEnergySource());
/* 32 */     Driver.add((SidedBlock)new DriverEnergyStorage());
/* 33 */     Driver.add((SidedBlock)new DriverReactor());
/* 34 */     Driver.add((SidedBlock)new DriverReactorChamber());
/* 35 */     Driver.add((SidedBlock)new DriverTeleporter());
/*    */     
/* 37 */     Driver.add(new ConverterElectricItem());
/* 38 */     Driver.add(new ConverterBaseSeed());
/* 39 */     Driver.add((SidedBlock)new DriverCrop());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\ModIndustrialCraft2$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */