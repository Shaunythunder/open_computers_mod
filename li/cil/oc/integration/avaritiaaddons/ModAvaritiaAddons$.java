/*   */ package li.cil.oc.integration.avaritiaaddons;
/*   */ 
/*   */ import li.cil.oc.integration.Mod;
/*   */ 
/*   */ public final class ModAvaritiaAddons$ implements ModProxy {
/* 6 */   private ModAvaritiaAddons$() { MODULE$ = this; } public static final ModAvaritiaAddons$ MODULE$; public Mods.SimpleMod getMod() {
/* 7 */     return li.cil.oc.integration.Mods$.MODULE$.AvaritiaAddons();
/*   */   } public void initialize() {
/* 9 */     Driver.add((SidedBlock)DriverExtremeAutocrafter$.MODULE$);
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\avaritiaaddons\ModAvaritiaAddons$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */