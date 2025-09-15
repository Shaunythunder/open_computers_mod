/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ 
/*    */ import li.cil.oc.api.manual.ImageRenderer;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001u:Q!\001\002\t\002M\tA\003V3yiV\024X-S7bO\026\004&o\034<jI\026\024(BA\002\005\003\031\021XM\0343fe*\021QAB\001\bg\026<W.\0328u\025\t9\001\"\001\005nCJ\\Gm\\<o\025\tI!\"\001\005sK:$WM]3s\025\tYA\"\001\004dY&,g\016\036\006\003\0339\t!a\\2\013\005=\001\022aA2jY*\t\021#\001\002mS\016\001\001C\001\013\026\033\005\021a!\002\f\003\021\0039\"\001\006+fqR,(/Z%nC\036,\007K]8wS\022,'oE\002\0261\001\002\"!\007\020\016\003iQ!a\007\017\002\t1\fgn\032\006\002;\005!!.\031<b\023\ty\"D\001\004PE*,7\r\036\t\003C\031j\021A\t\006\003G\021\na!\\1ok\006d'BA\023\r\003\r\t\007/[\005\003O\t\022Q\"S7bO\026\004&o\034<jI\026\024\b\"B\025\026\t\003Q\023A\002\037j]&$h\bF\001\024\021\025aS\003\"\021.\003!9W\r^%nC\036,GC\001\0302!\t\ts&\003\0021E\ti\021*\\1hKJ+g\016Z3sKJDQAM\026A\002M\nA\001Z1uCB\021AG\017\b\003kaj\021A\016\006\002o\005)1oY1mC&\021\021HN\001\007!J,G-\0324\n\005mb$AB*ue&twM\003\002:m\001")
/*    */ public final class TextureImageProvider {
/*    */   public static ImageRenderer getImage(String paramString) {
/*    */     return TextureImageProvider$.MODULE$.getImage(paramString);
/*    */   }
/*    */   
/*    */   public final class TextureImageProvider$$anon$1 extends TextureImageRenderer implements InteractiveImageRenderer {
/* 12 */     public TextureImageProvider$$anon$1() { super(Textures$.MODULE$.guiManualMissingItem()); } public String getTooltip(String tooltip) {
/* 13 */       return "oc:gui.Manual.Warning.ImageMissing";
/*    */     } public boolean onMouseClick(int mouseX, int mouseY) {
/* 15 */       return false;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\TextureImageProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */