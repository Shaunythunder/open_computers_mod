/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ 
/*    */ import li.cil.oc.api.manual.ImageRenderer;
/*    */ import li.cil.oc.api.manual.InteractiveImageRenderer;
/*    */ import li.cil.oc.client.Textures$;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001u:Q!\001\002\t\002M\t\021#\023;f[&k\027mZ3Qe>4\030\016Z3s\025\t\031A!\001\004sK:$WM\035\006\003\013\031\tqa]3h[\026tGO\003\002\b\021\005AQ.\031:lI><hN\003\002\n\025\005A!/\0328eKJ,'O\003\002\f\031\00511\r\\5f]RT!!\004\b\002\005=\034'BA\b\021\003\r\031\027\016\034\006\002#\005\021A.[\002\001!\t!R#D\001\003\r\0251\"\001#\001\030\005EIE/Z7J[\006<W\r\025:pm&$WM]\n\004+a\001\003CA\r\037\033\005Q\"BA\016\035\003\021a\027M\\4\013\003u\tAA[1wC&\021qD\007\002\007\037\nTWm\031;\021\005\0052S\"\001\022\013\005\r\"\023AB7b]V\fGN\003\002&\031\005\031\021\r]5\n\005\035\022#!D%nC\036,\007K]8wS\022,'\017C\003*+\021\005!&\001\004=S:LGO\020\013\002'!)A&\006C![\005Aq-\032;J[\006<W\r\006\002/cA\021\021eL\005\003a\t\022Q\"S7bO\026\024VM\0343fe\026\024\b\"\002\032,\001\004\031\024\001\0023bi\006\004\"\001\016\036\017\005UBT\"\001\034\013\003]\nQa]2bY\006L!!\017\034\002\rA\023X\rZ3g\023\tYDH\001\004TiJLgn\032\006\003sY\002")
/*    */ public final class ItemImageProvider {
/*    */   public static ImageRenderer getImage(String paramString) {
/*    */     return ItemImageProvider$.MODULE$.getImage(paramString);
/*    */   }
/*    */   
/*    */   public final class ItemImageProvider$$anon$1
/*    */     extends TextureImageRenderer
/*    */     implements InteractiveImageRenderer {
/*    */     public ItemImageProvider$$anon$1() {
/* 18 */       super(Textures$.MODULE$.guiManualMissingItem()); } public String getTooltip(String tooltip) {
/* 19 */       return "oc:gui.Manual.Warning.ItemMissing";
/*    */     } public boolean onMouseClick(int mouseX, int mouseY) {
/* 21 */       return false;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\ItemImageProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */