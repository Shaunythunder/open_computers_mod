/*    */ package li.cil.oc.integration.forestry;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.common.item.Delegator;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModForestry$ implements ModProxy {
/* 10 */   private ModForestry$() { MODULE$ = this; } public static final ModForestry$ MODULE$; public Mods.SimpleMod getMod() {
/* 11 */     return li.cil.oc.integration.Mods$.MODULE$.Forestry();
/*    */   }
/*    */   public void initialize() {
/* 14 */     Driver.add(new ConverterIAlleles());
/* 15 */     Driver.add(new ConverterIIndividual());
/* 16 */     Driver.add(ConverterItemStack$.MODULE$);
/* 17 */     Driver.add((SidedBlock)new DriverAnalyzer());
/* 18 */     Driver.add((SidedBlock)new DriverBeeHouse());
/* 19 */     Driver.add((Item)DriverUpgradeBeekeeper$.MODULE$);
/* 20 */     Driver.add(DriverUpgradeBeekeeper.Provider$.MODULE$);
/* 21 */     Delegator multi = new Delegator();
/* 22 */     GameRegistry.registerItem((Item)multi, "item.forestry");
/* 23 */     (new String[1])[0] = "oc:beekeeperUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeBeekeeper(multi), "beekeeperUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\ModForestry$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */