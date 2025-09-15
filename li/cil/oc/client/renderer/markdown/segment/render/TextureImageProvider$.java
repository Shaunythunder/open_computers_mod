/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ 
/*    */ import li.cil.oc.api.manual.ImageProvider;
/*    */ import li.cil.oc.api.manual.ImageRenderer;
/*    */ 
/*    */ public final class TextureImageProvider$ implements ImageProvider {
/*    */   public static final TextureImageProvider$ MODULE$;
/*    */   
/*  9 */   private TextureImageProvider$() { MODULE$ = this; } public ImageRenderer getImage(String data) { try {  }
/*    */     finally { Exception exception; }
/* 11 */      return 
/* 12 */       new TextureImageProvider$$anon$1(); } public final class TextureImageProvider$$anon$1 extends TextureImageRenderer implements InteractiveImageRenderer { public TextureImageProvider$$anon$1() { super(li.cil.oc.client.Textures$.MODULE$.guiManualMissingItem()); } public String getTooltip(String tooltip) {
/* 13 */       return "oc:gui.Manual.Warning.ImageMissing";
/*    */     } public boolean onMouseClick(int mouseX, int mouseY) {
/* 15 */       return false;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\TextureImageProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */