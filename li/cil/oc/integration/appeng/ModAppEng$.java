/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.IMC;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.common.item.Delegator;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.ModProxy;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class ModAppEng$ implements ModProxy {
/* 14 */   private ModAppEng$() { MODULE$ = this; } public static final ModAppEng$ MODULE$; public Mods.SimpleMod getMod() {
/* 15 */     return li.cil.oc.integration.Mods$.MODULE$.AppliedEnergistics2();
/*    */   }
/*    */   public void initialize() {
/* 18 */     IMC.registerWrenchTool("li.cil.oc.integration.appeng.EventHandlerAE2.useWrench");
/* 19 */     IMC.registerWrenchToolCheck("li.cil.oc.integration.appeng.EventHandlerAE2.isWrench");
/*    */     
/* 21 */     AEApi.instance().registries().movable().whiteListTileEntity(Print.class);
/*    */     
/* 23 */     Driver.add((SidedBlock)DriverController$.MODULE$);
/* 24 */     Driver.add(DriverExportBus$.MODULE$);
/* 25 */     Driver.add(DriverImportBus$.MODULE$);
/* 26 */     Driver.add(DriverPartInterface$.MODULE$);
/* 27 */     Driver.add((SidedBlock)DriverBlockInterface$.MODULE$);
/* 28 */     Driver.add((Item)DriverUpgradeAE$.MODULE$);
/*    */     
/* 30 */     Driver.add(new ConverterCellInventory());
/* 31 */     Driver.add(new ConverterPattern());
/*    */     
/* 33 */     Driver.add(DriverController.Provider$.MODULE$);
/* 34 */     Driver.add(DriverExportBus.Provider$.MODULE$);
/* 35 */     Driver.add(DriverImportBus.Provider$.MODULE$);
/* 36 */     Driver.add(DriverPartInterface.Provider$.MODULE$);
/* 37 */     Driver.add(DriverBlockInterface.Provider$.MODULE$);
/* 38 */     Driver.add(DriverUpgradeAE.Provider$.MODULE$);
/*    */     
/* 40 */     WirelessHandlerUpgradeAE$.MODULE$.register();
/* 41 */     Delegator multi = new Delegator();
/* 42 */     GameRegistry.registerItem((Item)multi, "item.ae");
/* 43 */     (new String[1])[0] = "oc:me_upgrade1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ItemUpgradeAE(multi, 0), "me_upgrade1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 44 */     (new String[1])[0] = "oc:me_upgrade2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ItemUpgradeAE(multi, 1), "me_upgrade2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 45 */     (new String[1])[0] = "oc:me_upgrade3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ItemUpgradeAE(multi, 2), "me_upgrade3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\ModAppEng$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */