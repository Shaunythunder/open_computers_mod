/*    */ package li.cil.oc.integration.betterrecords;
/*    */ 
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.Mods;
/*    */ 
/*    */ public final class ModBetterRecords$ implements ModProxy {
/*  7 */   private ModBetterRecords$() { MODULE$ = this; } public static final ModBetterRecords$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.BetterRecords();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add(ConverterRecord$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\betterrecords\ModBetterRecords$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */