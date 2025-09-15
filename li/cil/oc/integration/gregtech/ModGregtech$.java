/*    */ package li.cil.oc.integration.gregtech;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ 
/*    */ public final class ModGregtech$ implements ModProxy {
/*  9 */   private ModGregtech$() { MODULE$ = this; } public static final ModGregtech$ MODULE$; public Mods.ClassBasedMod getMod() {
/* 10 */     return li.cil.oc.integration.Mods$.MODULE$.GregTech();
/*    */   }
/*    */   public void initialize() {
/* 13 */     IMC.registerToolDurabilityProvider("li.cil.oc.integration.gregtech.EventHandlerGregTech.getDurability");
/*    */     
/* 15 */     MinecraftForge.EVENT_BUS.register(EventHandlerGregTech$.MODULE$);
/*    */     
/* 17 */     Driver.add((SidedBlock)new DriverEnergyContainer());
/* 18 */     Driver.add(new ConverterDataStick());
/*    */     
/* 20 */     RecipeHandler$.MODULE$.init();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gregtech\ModGregtech$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */