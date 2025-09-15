/*    */ package li.cil.oc.integration.util;
/*    */ 
/*    */ public final class Power$
/*    */ {
/*    */   public static final Power$ MODULE$;
/*    */   
/*    */   public double fromAE(double value) {
/*  8 */     return value * li.cil.oc.Settings$.MODULE$.get().ratioAppliedEnergistics2();
/*    */   } public double toAE(double value) {
/* 10 */     return value / li.cil.oc.Settings$.MODULE$.get().ratioAppliedEnergistics2();
/*    */   }
/*    */   
/*    */   public double fromCharge(double value) {
/* 14 */     return value * li.cil.oc.Settings$.MODULE$.get().ratioFactorization();
/*    */   } public double toCharge(double value) {
/* 16 */     return value / li.cil.oc.Settings$.MODULE$.get().ratioFactorization();
/*    */   }
/*    */   
/*    */   public double fromGC(double value) {
/* 20 */     return value * li.cil.oc.Settings$.MODULE$.get().ratioGalacticraft();
/*    */   } public float toGC(double value) {
/* 22 */     return (float)(value / li.cil.oc.Settings$.MODULE$.get().ratioGalacticraft());
/*    */   }
/*    */   
/*    */   public double fromEU(double value) {
/* 26 */     return value * li.cil.oc.Settings$.MODULE$.get().ratioIndustrialCraft2();
/*    */   } public double toEU(double value) {
/* 28 */     return value / li.cil.oc.Settings$.MODULE$.get().ratioIndustrialCraft2();
/*    */   }
/*    */   
/*    */   public double fromJoules(double value) {
/* 32 */     return value * li.cil.oc.Settings$.MODULE$.get().ratioMekanism();
/*    */   } public double toJoules(double value) {
/* 34 */     return value / li.cil.oc.Settings$.MODULE$.get().ratioMekanism();
/*    */   }
/*    */   
/*    */   public double fromRF(double value) {
/* 38 */     return value * li.cil.oc.Settings$.MODULE$.get().ratioRedstoneFlux();
/*    */   } public int toRF(double value) {
/* 40 */     return (int)(value / li.cil.oc.Settings$.MODULE$.get().ratioRedstoneFlux());
/*    */   }
/*    */   
/*    */   public double fromWA(double value) {
/* 44 */     return value * li.cil.oc.Settings$.MODULE$.get().ratioRotaryCraft();
/*    */   }
/* 46 */   public long toWA(double value) { return (long)(value / li.cil.oc.Settings$.MODULE$.get().ratioRotaryCraft()); } private Power$() {
/* 47 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\Power$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */