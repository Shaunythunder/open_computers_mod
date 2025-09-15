/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ 
/*    */ import li.cil.oc.api.manual.ImageRenderer;
/*    */ import li.cil.oc.api.manual.InteractiveImageRenderer;
/*    */ import li.cil.oc.client.Textures$;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001u:Q!\001\002\t\002M\t!C\0217pG.LU.Y4f!J|g/\0333fe*\0211\001B\001\007e\026tG-\032:\013\005\0251\021aB:fO6,g\016\036\006\003\017!\t\001\"\\1sW\022|wO\034\006\003\023)\t\001B]3oI\026\024XM\035\006\003\0271\taa\0317jK:$(BA\007\017\003\ty7M\003\002\020!\005\0311-\0337\013\003E\t!\001\\5\004\001A\021A#F\007\002\005\031)aC\001E\001/\t\021\"\t\\8dW&k\027mZ3Qe>4\030\016Z3s'\r)\002\004\t\t\0033yi\021A\007\006\0037q\tA\001\\1oO*\tQ$\001\003kCZ\f\027BA\020\033\005\031y%M[3diB\021\021EJ\007\002E)\0211\005J\001\007[\006tW/\0317\013\005\025b\021aA1qS&\021qE\t\002\016\0236\fw-\032)s_ZLG-\032:\t\013%*B\021\001\026\002\rqJg.\033;?)\005\031\002\"\002\027\026\t\003j\023\001C4fi&k\027mZ3\025\0059\n\004CA\0210\023\t\001$EA\007J[\006<WMU3oI\026\024XM\035\005\006e-\002\raM\001\005I\006$\030\r\005\0025u9\021Q\007O\007\002m)\tq'A\003tG\006d\027-\003\002:m\0051\001K]3eK\032L!a\017\037\003\rM#(/\0338h\025\tId\007")
/*    */ public final class BlockImageProvider
/*    */ {
/*    */   public static ImageRenderer getImage(String paramString) {
/*    */     return BlockImageProvider$.MODULE$.getImage(paramString);
/*    */   }
/*    */   
/*    */   public final class BlockImageProvider$$anon$1
/*    */     extends TextureImageRenderer
/*    */     implements InteractiveImageRenderer {
/*    */     public BlockImageProvider$$anon$1() {
/* 19 */       super(Textures$.MODULE$.guiManualMissingItem()); } public String getTooltip(String tooltip) {
/* 20 */       return "oc:gui.Manual.Warning.BlockMissing";
/*    */     } public boolean onMouseClick(int mouseX, int mouseY) {
/* 22 */       return false;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\BlockImageProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */