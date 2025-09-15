/*    */ package li.cil.oc.client.renderer.markdown.segment;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005}c!B\001\003\001\021\001\"!\004*f]\022,'oU3h[\026tGO\003\002\004\t\00591/Z4nK:$(BA\003\007\003!i\027M]6e_^t'BA\004\t\003!\021XM\0343fe\026\024(BA\005\013\003\031\031G.[3oi*\0211\002D\001\003_\016T!!\004\b\002\007\rLGNC\001\020\003\ta\027nE\002\001#]\001\"AE\013\016\003MQ\021\001F\001\006g\016\fG.Y\005\003-M\021a!\0218z%\0264\007C\001\r\032\033\005\021\021B\001\016\003\005IIe\016^3sC\016$\030N^3TK\036lWM\034;\t\021q\001!Q1A\005\002y\ta\001]1sK:$8\001A\013\002?A\021\001\004I\005\003C\t\021qaU3h[\026tG\017\003\005$\001\t\005\t\025!\003 \003\035\001\030M]3oi\002B\001\"\n\001\003\006\004%\tAJ\001\006i&$H.Z\013\002OA\021\001f\013\b\003%%J!AK\n\002\rA\023X\rZ3g\023\taSF\001\004TiJLgn\032\006\003UMA\001b\f\001\003\002\003\006IaJ\001\007i&$H.\032\021\t\021E\002!Q1A\005\002I\nQ\"[7bO\026\024VM\0343fe\026\024X#A\032\021\005QJT\"A\033\013\005Y:\024AB7b]V\fGN\003\0029\025\005\031\021\r]5\n\005i*$!D%nC\036,'+\0328eKJ,'\017\003\005=\001\t\005\t\025!\0034\0039IW.Y4f%\026tG-\032:fe\002BQA\020\001\005\002}\na\001P5oSRtD\003\002!B\005\016\003\"\001\007\001\t\013qi\004\031A\020\t\013\025j\004\031A\024\t\013Ej\004\031A\032\t\017\025\003\001\031!C\001\r\006)A.Y:u1V\tq\t\005\002\023\021&\021\021j\005\002\004\023:$\bbB&\001\001\004%\t\001T\001\nY\006\034H\017W0%KF$\"!\024)\021\005Iq\025BA(\024\005\021)f.\033;\t\017ES\025\021!a\001\017\006\031\001\020J\031\t\rM\003\001\025)\003H\003\031a\027m\035;YA!9Q\013\001a\001\n\0031\025!\0027bgRL\006bB,\001\001\004%\t\001W\001\nY\006\034H/W0%KF$\"!T-\t\017E3\026\021!a\001\017\"11\f\001Q!\n\035\013a\001\\1tif\003\003\"B/\001\t\003r\026a\002;p_2$\030\016]\013\002?B\031!\003Y\024\n\005\005\034\"AB(qi&|g\016C\003d\001\021\005C-\001\007p]6{Wo]3DY&\0347\016F\002fQ*\004\"A\0054\n\005\035\034\"a\002\"p_2,\027M\034\005\006S\n\004\raR\001\007[>,8/\032-\t\013-\024\007\031A$\002\r5|Wo]3Z\021\025i\007\001\"\003o\003\025\0318-\0317f)\ty'\017\005\002\023a&\021\021o\005\002\006\r2|\027\r\036\005\006g2\004\raR\001\t[\006Dx+\0333uQ\")Q\017\001C\001m\006Q\021.\\1hK^KG\r\0365\025\005\035;\b\"B:u\001\0049\005\"B=\001\t\003Q\030aC5nC\036,\007*Z5hQR$\"aR>\t\013MD\b\031A$\t\013u\004A\021\t@\002\0139,\007\020^-\025\r\035{\0301AA\003\021\031\t\t\001 a\001\017\0061\021N\0343f]RDQa\035?A\002\035Caa\002?A\002\005\035\001\003BA\005\0033i!!a\003\013\t\0055\021qB\001\004OVL'bA\005\002\022)!\0211CA\013\003%i\027N\\3de\0064GO\003\002\002\030\005\031a.\032;\n\t\005m\0211\002\002\r\r>tGOU3oI\026\024XM\035\005\b\003?\001A\021IA\021\003\025qW\r\037;Y)\0359\0251EA\023\003OAq!!\001\002\036\001\007q\t\003\004t\003;\001\ra\022\005\b\017\005u\001\031AA\004\021\035\tY\003\001C!\003[\taA]3oI\026\024H\003EA\030\003c\t)$!\017\002<\005u\022qHA!!\r\021\002m\006\005\b\003g\tI\0031\001H\003\005A\bbBA\034\003S\001\raR\001\002s\"9\021\021AA\025\001\0049\005BB:\002*\001\007q\tC\004\b\003S\001\r!a\002\t\r%\fI\0031\001H\021\031Y\027\021\006a\001\017\"9\021Q\t\001\005B\005\035\023\001\003;p'R\024\030N\\4\025\007\035\nI\005\003\005\002L\005\r\003\031AA'\003\0311wN]7biB!\021qJA,\035\021\t\t&a\025\016\003\021I1!!\026\005\0031i\025M]6va\032{'/\\1u\023\021\tI&a\027\003\013Y\013G.^3\n\007\005u3CA\006F]VlWM]1uS>t\007")
/*    */ public class RenderSegment implements InteractiveSegment {
/*    */   private final Segment parent;
/*    */   private final String title;
/*    */   private final ImageRenderer imageRenderer;
/*    */   
/* 10 */   public void notifyHover() { InteractiveSegment$class.notifyHover(this); } private int lastX; private int lastY; private Segment next; public Option<InteractiveSegment> checkHovered(int mouseX, int mouseY, int x, int y, int w, int h) { return InteractiveSegment$class.checkHovered(this, mouseX, mouseY, x, y, w, h); } public Segment next() { return this.next; } public void next_$eq(Segment x$1) { this.next = x$1; } public final Segment root() { return Segment$class.root(this); } public Iterable<String> renderAsText(Enumeration.Value format) { return Segment$class.renderAsText(this, format); } public String toString() { return Segment$class.toString(this); } public Iterable<Segment> refine(Regex pattern, Function2 factory) { return Segment$class.refine(this, pattern, factory); } public boolean isLast() { return Segment$class.isLast(this); } public Segment parent() { return this.parent; } public String title() { return this.title; } public ImageRenderer imageRenderer() { return this.imageRenderer; } public RenderSegment(Segment parent, String title, ImageRenderer imageRenderer) { Segment$class.$init$(this); InteractiveSegment$class.$init$(this);
/* 11 */     this.lastX = 0;
/* 12 */     this.lastY = 0; } public int lastX() { return this.lastX; } public void lastX_$eq(int x$1) { this.lastX = x$1; } public int lastY() { return this.lastY; } public void lastY_$eq(int x$1) { this.lastY = x$1; }
/*    */   public Option<String> tooltip() { Option<String> option;
/* 14 */     ImageRenderer imageRenderer = imageRenderer();
/* 15 */     if (imageRenderer instanceof InteractiveImageRenderer) { InteractiveImageRenderer interactiveImageRenderer = (InteractiveImageRenderer)imageRenderer; option = Option$.MODULE$.apply(interactiveImageRenderer.getTooltip(title())); }
/* 16 */     else { option = Option$.MODULE$.apply(title()); }
/*    */     
/*    */     return option; } public boolean onMouseClick(int mouseX, int mouseY) { boolean bool;
/* 19 */     ImageRenderer imageRenderer = imageRenderer();
/* 20 */     if (imageRenderer instanceof InteractiveImageRenderer) { InteractiveImageRenderer interactiveImageRenderer = (InteractiveImageRenderer)imageRenderer; bool = interactiveImageRenderer.onMouseClick(mouseX - lastX(), mouseY - lastY()); }
/* 21 */     else { bool = false; }
/*    */     
/*    */     return bool; } private float scale(int maxWidth) {
/* 24 */     return package$.MODULE$.min(1.0F, maxWidth / imageRenderer().getWidth());
/*    */   } public int imageWidth(int maxWidth) {
/* 26 */     return package$.MODULE$.min(maxWidth, imageRenderer().getWidth());
/*    */   } public int imageHeight(int maxWidth) {
/* 28 */     return (int)package$.MODULE$.ceil((imageRenderer().getHeight() * scale(maxWidth))) + 4;
/*    */   } public int nextY(int indent, int maxWidth, FontRenderer renderer) {
/* 30 */     return imageHeight(maxWidth) + ((indent > 0) ? Document$.MODULE$.lineHeight(renderer) : 0);
/*    */   } public int nextX(int indent, int maxWidth, FontRenderer renderer) {
/* 32 */     return 0;
/*    */   }
/*    */   public Option<InteractiveSegment> render(int x, int y, int indent, int maxWidth, FontRenderer renderer, int mouseX, int mouseY) {
/* 35 */     int width = imageWidth(maxWidth);
/* 36 */     int height = imageHeight(maxWidth);
/* 37 */     int xOffset = (maxWidth - width) / 2;
/* 38 */     int yOffset = 2 + ((indent > 0) ? Document$.MODULE$.lineHeight(renderer) : 0);
/* 39 */     float s = scale(maxWidth);
/*    */     
/* 41 */     lastX_$eq(x + xOffset);
/* 42 */     lastY_$eq(y + yOffset);
/*    */     
/* 44 */     Option<InteractiveSegment> hovered = checkHovered(mouseX, mouseY, x + xOffset, y + yOffset, width, height);
/*    */     
/* 46 */     GL11.glPushMatrix();
/* 47 */     GL11.glTranslatef((x + xOffset), (y + yOffset), 0.0F);
/* 48 */     GL11.glScalef(s, s, s);
/*    */     
/* 50 */     GL11.glEnable(3042);
/* 51 */     GL11.glEnable(3008);
/*    */     
/* 53 */     if (hovered.isDefined()) {
/* 54 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.15F);
/* 55 */       GL11.glDisable(3553);
/* 56 */       GL11.glBegin(7);
/* 57 */       GL11.glVertex2f(0.0F, 0.0F);
/* 58 */       GL11.glVertex2f(0.0F, imageRenderer().getHeight());
/* 59 */       GL11.glVertex2f(imageRenderer().getWidth(), imageRenderer().getHeight());
/* 60 */       GL11.glVertex2f(imageRenderer().getWidth(), 0.0F);
/* 61 */       GL11.glEnd();
/* 62 */       GL11.glEnable(3553);
/*    */     } 
/*    */     
/* 65 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */     
/* 67 */     imageRenderer().render(mouseX - x, mouseY - y);
/*    */     
/* 69 */     GL11.glDisable(3042);
/* 70 */     GL11.glDisable(3008);
/* 71 */     GL11.glDisable(2896);
/*    */     
/* 73 */     GL11.glPopMatrix();
/*    */     
/* 75 */     return hovered;
/*    */   }
/*    */   
/*    */   public String toString(Enumeration.Value format) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: astore_2
/*    */     //   2: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*    */     //   5: invokevirtual Markdown : ()Lscala/Enumeration$Value;
/*    */     //   8: aload_2
/*    */     //   9: astore_3
/*    */     //   10: dup
/*    */     //   11: ifnonnull -> 22
/*    */     //   14: pop
/*    */     //   15: aload_3
/*    */     //   16: ifnull -> 29
/*    */     //   19: goto -> 99
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 99
/*    */     //   29: new scala/StringContext
/*    */     //   32: dup
/*    */     //   33: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   36: iconst_3
/*    */     //   37: anewarray java/lang/String
/*    */     //   40: dup
/*    */     //   41: iconst_0
/*    */     //   42: ldc_w '!['
/*    */     //   45: aastore
/*    */     //   46: dup
/*    */     //   47: iconst_1
/*    */     //   48: ldc_w ']('
/*    */     //   51: aastore
/*    */     //   52: dup
/*    */     //   53: iconst_2
/*    */     //   54: ldc_w ')'
/*    */     //   57: aastore
/*    */     //   58: checkcast [Ljava/lang/Object;
/*    */     //   61: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   64: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */     //   67: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   70: iconst_2
/*    */     //   71: anewarray java/lang/Object
/*    */     //   74: dup
/*    */     //   75: iconst_0
/*    */     //   76: aload_0
/*    */     //   77: invokevirtual title : ()Ljava/lang/String;
/*    */     //   80: aastore
/*    */     //   81: dup
/*    */     //   82: iconst_1
/*    */     //   83: aload_0
/*    */     //   84: invokevirtual imageRenderer : ()Lli/cil/oc/api/manual/ImageRenderer;
/*    */     //   87: aastore
/*    */     //   88: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   91: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */     //   94: astore #4
/*    */     //   96: goto -> 134
/*    */     //   99: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*    */     //   102: invokevirtual IGWMod : ()Lscala/Enumeration$Value;
/*    */     //   105: aload_2
/*    */     //   106: astore #5
/*    */     //   108: dup
/*    */     //   109: ifnonnull -> 121
/*    */     //   112: pop
/*    */     //   113: aload #5
/*    */     //   115: ifnull -> 129
/*    */     //   118: goto -> 137
/*    */     //   121: aload #5
/*    */     //   123: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   126: ifeq -> 137
/*    */     //   129: ldc_w '(Sorry, images only work in the OpenComputers manual for now.)'
/*    */     //   132: astore #4
/*    */     //   134: aload #4
/*    */     //   136: areturn
/*    */     //   137: new scala/MatchError
/*    */     //   140: dup
/*    */     //   141: aload_2
/*    */     //   142: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   145: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #78	-> 0
/*    */     //   #79	-> 2
/*    */     //   #80	-> 99
/*    */     //   #78	-> 134
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	146	0	this	Lli/cil/oc/client/renderer/markdown/segment/RenderSegment;
/*    */     //   0	146	1	format	Lscala/Enumeration$Value;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\RenderSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */