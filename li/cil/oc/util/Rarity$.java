/*   */ package li.cil.oc.util;
/*   */ public final class Rarity$ {
/*   */   public static final Rarity$ MODULE$;
/*   */   
/*   */   private EnumRarity[] lookup() {
/* 6 */     return this.lookup;
/*   */   } private final EnumRarity[] lookup; public EnumRarity byTier(int tier) {
/* 8 */     return lookup()[scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(tier), 0)), (lookup()).length - 1)]; } private Rarity$() {
/* 9 */     MODULE$ = this;
/*   */     (new EnumRarity[4])[0] = EnumRarity.common;
/*   */     (new EnumRarity[4])[1] = EnumRarity.uncommon;
/*   */     (new EnumRarity[4])[2] = EnumRarity.rare;
/*   */     (new EnumRarity[4])[3] = EnumRarity.epic;
/*   */     this.lookup = new EnumRarity[4];
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Rarity$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */