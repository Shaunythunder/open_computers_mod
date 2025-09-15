/*    */ package li.cil.oc.integration.buildcraft.library;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModBuildCraftAPILibrary$ implements ModProxy {
/*  6 */   private ModBuildCraftAPILibrary$() { MODULE$ = this; } public static final ModBuildCraftAPILibrary$ MODULE$; public Mods.SimpleMod getMod() {
/*  7 */     return li.cil.oc.integration.Mods$.MODULE$.BuildCraftLibrary();
/*    */   }
/*    */   public void initialize() {
/* 10 */     HandlerRegistry$.MODULE$.init();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\library\ModBuildCraftAPILibrary$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */