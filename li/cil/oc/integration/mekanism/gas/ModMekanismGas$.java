/*    */ package li.cil.oc.integration.mekanism.gas;
/*    */ 
/*    */ import li.cil.oc.api.Driver;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import li.cil.oc.integration.ModProxy;
/*    */ 
/*    */ public final class ModMekanismGas$ implements ModProxy {
/*  8 */   private ModMekanismGas$() { MODULE$ = this; } public static final ModMekanismGas$ MODULE$; public Mod getMod() {
/*  9 */     return (Mod)li.cil.oc.integration.Mods$.MODULE$.MekanismGas();
/*    */   }
/*    */   public void initialize() {
/* 12 */     Driver.add(ConverterGasStack$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mekanism\gas\ModMekanismGas$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */