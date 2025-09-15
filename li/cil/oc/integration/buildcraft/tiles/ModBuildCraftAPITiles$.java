/*    */ package li.cil.oc.integration.buildcraft.tiles;
/*    */ 
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModBuildCraftAPITiles$ implements ModProxy {
/*  7 */   private ModBuildCraftAPITiles$() { MODULE$ = this; } public static final ModBuildCraftAPITiles$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.BuildCraftTiles();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((SidedBlock)new DriverControllable());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\tiles\ModBuildCraftAPITiles$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */