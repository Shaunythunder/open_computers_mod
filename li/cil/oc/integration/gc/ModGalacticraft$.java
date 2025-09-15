/*    */ package li.cil.oc.integration.gc;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModGalacticraft$ implements ModProxy {
/*  7 */   private ModGalacticraft$() { MODULE$ = this; } public static final ModGalacticraft$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.Galacticraft();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add((Item)DriverWorldSensorCard$.MODULE$);
/*    */     
/* 13 */     Driver.add(DriverWorldSensorCard.Provider$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gc\ModGalacticraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */