/*    */ package li.cil.oc.client.renderer.markdown.segment.render;
/*    */ 
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.InputStream;
/*    */ import net.minecraft.client.renderer.texture.ITextureObject;
/*    */ import net.minecraft.client.renderer.texture.TextureManager;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\005a\001B\001\003\001M\021A\003V3yiV\024X-S7bO\026\024VM\0343fe\026\024(BA\002\005\003\031\021XM\0343fe*\021QAB\001\bg\026<W.\0328u\025\t9\001\"\001\005nCJ\\Gm\\<o\025\tI!\"\001\005sK:$WM]3s\025\tYA\"\001\004dY&,g\016\036\006\003\0339\t!a\\2\013\005=\001\022aA2jY*\t\021#\001\002mS\016\0011c\001\001\0259A\021QCG\007\002-)\021q\003G\001\005Y\006twMC\001\032\003\021Q\027M^1\n\005m1\"AB(cU\026\034G\017\005\002\036E5\taD\003\002 A\0051Q.\0318vC2T!!\t\007\002\007\005\004\030.\003\002$=\ti\021*\\1hKJ+g\016Z3sKJD\001\"\n\001\003\006\004%\tAJ\001\tY>\034\027\r^5p]V\tq\005\005\002)_5\t\021F\003\002+W\005!Q\017^5m\025\taS&A\005nS:,7M]1gi*\ta&A\002oKRL!\001M\025\003!I+7o\\;sG\026dunY1uS>t\007\002\003\032\001\005\003\005\013\021B\024\002\0231|7-\031;j_:\004\003\"\002\033\001\t\003)\024A\002\037j]&$h\b\006\0027qA\021q\007A\007\002\005!)Qe\ra\001O!9!\b\001b\001\n\023Y\024a\002;fqR,(/Z\013\002yA\021QHP\007\002\001\031!q\b\001\003A\0051IU.Y4f)\026DH/\036:f'\tq\024\t\005\002C\r6\t1I\003\002;\t*\021\021\"\022\006\003\027-J!aR\"\003\037\005\0237\017\036:bGR$V\r\037;ve\026D\001\"\n \003\006\004%\tA\n\005\tey\022\t\021)A\005O!)AG\020C\001\027R\021A\b\024\005\006K)\003\ra\n\005\b\035z\002\r\021\"\001P\003\0259\030\016\032;i+\005\001\006CA)U\033\005\021&\"A*\002\013M\034\027\r\\1\n\005U\023&aA%oi\"9qK\020a\001\n\003A\026!C<jIRDw\fJ3r)\tIF\f\005\002R5&\0211L\025\002\005+:LG\017C\004^-\006\005\t\031\001)\002\007a$\023\007\003\004`}\001\006K\001U\001\007o&$G\017\033\021\t\017\005t\004\031!C\001\037\0061\001.Z5hQRDqa\031 A\002\023\005A-\001\006iK&<\007\016^0%KF$\"!W3\t\017u\023\027\021!a\001!\"1qM\020Q!\nA\013q\001[3jO\"$\b\005C\003j}\021\005#.A\006m_\006$G+\032=ukJ,GCA-l\021\025a\007\0161\001n\003\035i\027M\\1hKJ\004\"A\\9\016\003=T!\001]#\002\023I,7o\\;sG\026\034\030B\001:p\005AI%+Z:pkJ\034W-T1oC\036,'\017\003\004u\001\001\006I\001P\001\ti\026DH/\036:fA!)a\017\001C!o\006Aq-\032;XS\022$\b\016F\001Q\021\025I\b\001\"\021x\003%9W\r\036%fS\036DG\017C\003\004\001\021\0053\020F\002ZyzDQ! >A\002A\013a!\\8vg\026D\006\"B@{\001\004\001\026AB7pkN,\027\f")
/*    */ public class TextureImageRenderer implements ImageRenderer {
/*    */   private final ResourceLocation location;
/*    */   
/* 14 */   public ResourceLocation location() { return this.location; } private final ImageTexture texture; public TextureImageRenderer(ResourceLocation location) {
/*    */     ImageTexture imageTexture;
/* 16 */     TextureManager manager = Minecraft.func_71410_x().func_110434_K();
/* 17 */     ITextureObject iTextureObject = manager.func_110581_b(location);
/* 18 */     if (iTextureObject instanceof ImageTexture) { ImageTexture imageTexture1 = (ImageTexture)iTextureObject; }
/*    */     else
/* 20 */     { if (iTextureObject != null && iTextureObject.func_110552_b() != -1) {
/* 21 */         TextureUtil.func_147942_a(iTextureObject.func_110552_b());
/*    */       }
/* 23 */       ImageTexture image = new ImageTexture(this, location);
/* 24 */       manager.func_110579_a(location, (ITextureObject)image);
/* 25 */       imageTexture = image; }
/*    */     
/*    */     this.texture = imageTexture; } private ImageTexture texture() { return this.texture; }
/*    */   public int getWidth() {
/* 29 */     return texture().width();
/*    */   } public int getHeight() {
/* 31 */     return texture().height();
/*    */   }
/*    */   public void render(int mouseX, int mouseY) {
/* 34 */     Minecraft.func_71410_x().func_110434_K().func_110577_a(location());
/* 35 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 36 */     GL11.glBegin(7);
/* 37 */     GL11.glTexCoord2f(0.0F, 0.0F);
/* 38 */     GL11.glVertex2f(0.0F, 0.0F);
/* 39 */     GL11.glTexCoord2f(0.0F, 1.0F);
/* 40 */     GL11.glVertex2f(0.0F, texture().height());
/* 41 */     GL11.glTexCoord2f(1.0F, 1.0F);
/* 42 */     GL11.glVertex2f(texture().width(), texture().height());
/* 43 */     GL11.glTexCoord2f(1.0F, 0.0F);
/* 44 */     GL11.glVertex2f(texture().width(), 0.0F);
/* 45 */     GL11.glEnd();
/*    */   } public class ImageTexture extends AbstractTexture { private final ResourceLocation location;
/*    */     public ResourceLocation location() {
/* 48 */       return this.location;
/* 49 */     } private int width = 0; public int width() { return this.width; } public void width_$eq(int x$1) { this.width = x$1; }
/* 50 */      private int height = 0; public int height() { return this.height; } public void height_$eq(int x$1) { this.height = x$1; }
/*    */ 
/*    */     
/* 53 */     public void func_110551_a(IResourceManager manager) { func_147631_c();
/*    */       
/* 55 */       InputStream is = null;
/*    */       
/* 57 */       try { IResource resource = manager.func_110536_a(location());
/* 58 */         is = resource.func_110527_b();
/* 59 */         BufferedImage bi = ImageIO.read(is);
/* 60 */         TextureUtil.func_110989_a(func_110552_b(), bi, false, false);
/* 61 */         width_$eq(bi.getWidth());
/* 62 */         height_$eq(bi.getHeight());
/*    */         return; }
/*    */       finally
/* 65 */       { Option$.MODULE$.apply(is).foreach((Function1)new TextureImageRenderer$ImageTexture$$anonfun$loadTexture$1(this)); }  } public ImageTexture(TextureImageRenderer $outer, ResourceLocation location) {} public final class TextureImageRenderer$ImageTexture$$anonfun$loadTexture$1 extends AbstractFunction1<InputStream, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(InputStream x$1) { x$1.close(); }
/*    */ 
/*    */       
/*    */       public TextureImageRenderer$ImageTexture$$anonfun$loadTexture$1(TextureImageRenderer.ImageTexture $outer) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\render\TextureImageRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */