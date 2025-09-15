/*    */ package li.cil.oc.integration.rotarycraft;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ 
/*    */ public final class ModRotaryCraft$ implements ModProxy {
/*  7 */   private ModRotaryCraft$() { MODULE$ = this; } public static final ModRotaryCraft$ MODULE$; public Mods.SimpleMod getMod() {
/*  8 */     return li.cil.oc.integration.Mods$.MODULE$.RotaryCraft();
/*    */   }
/*    */   public void initialize() {
/* 11 */     Driver.add(new ConverterJetpackItem());
/* 12 */     Driver.add(new ConverterPumpItem());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\rotarycraft\ModRotaryCraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */