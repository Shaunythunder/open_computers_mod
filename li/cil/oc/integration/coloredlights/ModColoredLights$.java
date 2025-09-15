/*    */ package li.cil.oc.integration.coloredlights;
/*    */ import coloredlightscore.src.api.CLApi;
/*    */ import net.minecraft.block.Block;
/*    */ import scala.math.Ordering;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ModColoredLights$ {
/*    */   public static final ModColoredLights$ MODULE$;
/*    */   
/*    */   public void setLightLevel(Block block, int r, int g, int b) {
/* 11 */     if (li.cil.oc.integration.Mods$.MODULE$.ColoredLights().isAvailable()) {
/* 12 */       setColoredLightLevel(block, r, g, b);
/*    */     } else {
/* 14 */       setPlainLightLevel(block, r, g, b);
/*    */     } 
/*    */   }
/*    */   private void setColoredLightLevel(Block block, int r, int g, int b) {
/* 18 */     CLApi.setBlockColorRGB(block, r, g, b);
/*    */   }
/*    */   
/*    */   private void setPlainLightLevel(Block block, int r, int g, int b) {
/* 22 */     int brightness = BoxesRunTime.unboxToInt(scala.Predef$.MODULE$.intArrayOps(new int[] { r, g, b }).max((Ordering)scala.math.Ordering$Int$.MODULE$));
/* 23 */     block.func_149715_a((brightness + 0.1F) / 15.0F);
/*    */   } private ModColoredLights$() {
/* 25 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\coloredlights\ModColoredLights$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */