/*    */ package li.cil.oc.integration.buildcraft.recipes;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModBuildCraftRecipes$ implements ModProxy {
/*  6 */   private ModBuildCraftRecipes$() { MODULE$ = this; } public static final ModBuildCraftRecipes$ MODULE$; public Mods.SimpleMod getMod() {
/*  7 */     return li.cil.oc.integration.Mods$.MODULE$.BuildCraftTiles();
/*    */   }
/*    */   public void initialize() {
/* 10 */     LootDiskProgrammableRecipe$.MODULE$.register();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\recipes\ModBuildCraftRecipes$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */