/*     */ package li.cil.oc.client.renderer.font;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.util.FontUtils$;
/*     */ import li.cil.oc.util.RenderState$;
/*     */ import net.minecraft.client.resources.IReloadableResourceManager;
/*     */ import net.minecraft.client.resources.IResourceManager;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Serializable;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tUb\001B\001\003\001=\0211\003R=oC6L7MR8oiJ+g\016Z3sKJT!a\001\003\002\t\031|g\016\036\006\003\013\031\t\001B]3oI\026\024XM\035\006\003\017!\taa\0317jK:$(BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\031\001\001\005\013\021\005E\021R\"\001\002\n\005M\021!a\005+fqR,(/\032$p]R\024VM\0343fe\026\024\bCA\013\036\033\0051\"BA\f\031\003%\021Xm]8ve\016,7O\003\002\b3)\021!dG\001\n[&tWm\031:bMRT\021\001H\001\004]\026$\030B\001\020\027\005yI%+Z:pkJ\034W-T1oC\036,'OU3m_\006$G*[:uK:,'\017C\003!\001\021\005\021%\001\004=S:LGO\020\013\002EA\021\021\003\001\005\bI\001\021\r\021\"\003&\00359G.\0379i!J|g/\0333feV\ta\005\005\002\022O%\021\001F\001\002\017\023\036c\027\020\0355Qe>4\030\016Z3s\021\031Q\003\001)A\005M\005qq\r\\=qQB\023xN^5eKJ\004\003b\002\027\001\005\004%I!L\001\ti\026DH/\036:fgV\ta\006E\0020maj\021\001\r\006\003cI\nq!\\;uC\ndWM\003\0024i\005Q1m\0347mK\016$\030n\0348\013\003U\nQa]2bY\006L!a\016\031\003\027\005\023(/Y=Ck\0324WM\035\t\003sqs!AO%\017\005mBeB\001\037H\035\tidI\004\002?\013:\021q\b\022\b\003\001\016k\021!\021\006\003\005:\ta\001\020:p_Rt\024\"A\007\n\005-a\021BA\005\013\023\t9\001\"\003\002\006\r%\0211\001B\004\006\025\nA\taS\001\024\tft\027-\\5d\r>tGOU3oI\026\024XM\035\t\003#13Q!\001\002\t\0025\033\"\001\024(\021\005=\003V\"\001\033\n\005E#$AB!osJ+g\rC\003!\031\022\0051\013F\001L\021\035)FJ1A\005\nY\013Aa]5{KV\tq\013\005\002P1&\021\021\f\016\002\004\023:$\bBB.MA\003%q+A\003tSj,\007E\002\003^\031\002q&aC\"iCJ$V\r\037;ve\026\034\"\001\030(\t\021\001d&Q1A\005\002\005\fQa\\<oKJ,\022A\t\005\tGr\023\t\021)A\005E\0051qn\0368fe\002BQ\001\t/\005\002\025$\"A\0325\021\005\035dV\"\001'\t\013\001$\007\031\001\022\t\017)d&\031!C\005-\006\021\021\016\032\005\007Yr\003\013\021B,\002\007%$\007\005C\004o9\n\007I\021\002,\002\023\r,G\016\\,jIRD\007B\0029]A\003%q+\001\006dK2dw+\0333uQ\002BqA\035/C\002\023%a+\001\006dK2d\007*Z5hQRDa\001\036/!\002\0239\026aC2fY2DU-[4ii\002BqA\036/C\002\023%a+\001\003d_2\034\bB\002=]A\003%q+A\003d_2\034\b\005C\004{9\n\007I\021\002,\002\tI|wo\035\005\007yr\003\013\021B,\002\013I|wo\035\021\t\017yd&\031!C\005\006)Qo\025;faV\021\021\021\001\t\004\037\006\r\021bAA\003i\t1Ai\\;cY\026D\001\"!\003]A\003%\021\021A\001\007kN#X\r\035\021\t\021\0055AL1A\005\n}\fQA^*uKBD\001\"!\005]A\003%\021\021A\001\007mN#X\r\035\021\t\021\005UAL1A\005\n}\f1\001]1e\021!\tI\002\030Q\001\n\005\005\021\001\0029bI\002B\001\"!\b]\005\004%IAV\001\tG\006\004\030mY5us\"9\021\021\005/!\002\0239\026!C2ba\006\034\027\016^=!\021!\t)\003\030a\001\n\0231\026!B2iCJ\034\b\"CA\0259\002\007I\021BA\026\003%\031\007.\031:t?\022*\027\017\006\003\002.\005M\002cA(\0020%\031\021\021\007\033\003\tUs\027\016\036\005\n\003k\t9#!AA\002]\0131\001\037\0232\021\035\tI\004\030Q!\n]\013aa\0315beN\004\003bBA\0379\022\005\021qH\001\007I\026dW\r^3\025\005\0055\002bBA\"9\022\005\021qH\001\005E&tG\rC\004\002Hq#\t!!\023\002\r%\034h)\0367m)\021\tY%!\025\021\007=\013i%C\002\002PQ\022qAQ8pY\026\fg\016C\004\002T\005\025\003\031A,\002\t\rD\027M\035\005\b\003/bF\021AA-\003\r\tG\r\032\013\005\0037\n\031\rE\002h\003;2a!a\030M\001\005\005$\001C\"iCJL5m\0348\024\007\005uc\nC\006\002f\005u#Q1A\005\002\005\035\024a\002;fqR,(/Z\013\002M\"Q\0211NA/\005\003\005\013\021\0024\002\021Q,\007\020^;sK\002B!\"a\034\002^\t\025\r\021\"\001W\003\0059\bBCA:\003;\022\t\021)A\005/\006\021q\017\t\005\013\003o\niF!b\001\n\0031\026!\0015\t\025\005m\024Q\fB\001B\003%q+\001\002iA!Q\021qPA/\005\013\007I\021A@\002\005U\f\004bCAB\003;\022\t\021)A\005\003\003\t1!^\031!\021)\t9)!\030\003\006\004%\ta`\001\003mFB1\"a#\002^\t\005\t\025!\003\002\002\005\031a/\r\021\t\025\005=\025Q\fBC\002\023\005q0\001\002ve!Y\0211SA/\005\003\005\013\021BA\001\003\r)(\007\t\005\013\003/\013iF!b\001\n\003y\030A\001<3\021-\tY*!\030\003\002\003\006I!!\001\002\007Y\024\004\005C\004!\003;\"\t!a(\025!\005m\023\021UAR\003K\0139+!+\002,\0065\006bBA3\003;\003\rA\032\005\b\003_\ni\n1\001X\021\035\t9(!(A\002]C\001\"a \002\036\002\007\021\021\001\005\t\003\017\013i\n1\001\002\002!A\021qRAO\001\004\t\t\001\003\005\002\030\006u\005\031AA\001\021!\t\t,!\030\005\002\005M\026\001\0023sC^$b!!\f\0026\006}\006\002CA\\\003_\003\r!!/\002\005QD\bcA(\002<&\031\021Q\030\033\003\013\031cw.\031;\t\021\005\005\027q\026a\001\003s\013!\001^=\t\017\005M\023Q\013a\001/\"9\021q\031\001!\002\023q\023!\003;fqR,(/Z:!\021%\tY\r\001b\001\n\023\ti-A\004dQ\006\024X*\0319\026\005\005=\007CB\030\002R^\013).C\002\002TB\0221!T1q!\021\t9.!\030\017\005EI\005\002CAn\001\001\006I!a4\002\021\rD\027M]'ba\002B1\"a8\001\001\004\005\r\021\"\003\002b\006i\021m\031;jm\026$V\r\037;ve\026,\022\001\017\005\f\003K\004\001\031!a\001\n\023\t9/A\tbGRLg/\032+fqR,(/Z0%KF$B!!\f\002j\"I\021QGAr\003\003\005\r\001\017\005\b\003[\004\001\025)\0039\0039\t7\r^5wKR+\007\020^;sK\002Bq!!=\001\t\003\ty$\001\006j]&$\030.\0317ju\026Dq!!>\001\t\003\t90A\fp]J+7o\\;sG\026l\025M\\1hKJ\024V\r\\8bIR!\021QFA}\021!\tY0a=A\002\005u\030aB7b]\006<WM\035\t\004+\005}\030b\001B\001-\t\001\022JU3t_V\0248-Z'b]\006<WM\035\005\007\005\013\001A\021\013,\002\023\rD\027M],jIRD\007B\002B\005\001\021Ec+\001\006dQ\006\024\b*Z5hQRDaA!\004\001\t#2\026\001\004;fqR,(/Z\"pk:$\bb\002B\t\001\021E#1C\001\fE&tG\rV3yiV\024X\r\006\003\002.\tU\001b\002B\f\005\037\001\raV\001\006S:$W\r\037\005\b\0057\001A\021\013B\017\00319WM\\3sCR,7\t[1s)\021\tiCa\b\t\017\005M#\021\004a\001/\"9!1\005\001\005R\t\025\022\001\0033sC^\034\005.\031:\025\021\0055\"q\005B\025\005WA\001\"a.\003\"\001\007\021\021\030\005\t\003\003\024\t\0031\001\002:\"9\0211\013B\021\001\0049\006b\002B\030\001\021%!\021G\001\017GJ,\027\r^3DQ\006\024\030jY8o)\021\t)Na\r\t\017\005M#Q\006a\001/\002")
/*     */ public class DynamicFontRenderer extends TextureFontRenderer implements IResourceManagerReloadListener {
/*     */   private final IGlyphProvider li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider;
/*     */   private final ArrayBuffer<CharTexture> textures;
/*     */   private final Map<Object, CharIcon> charMap;
/*     */   private CharTexture activeTexture;
/*     */   
/*  21 */   public DynamicFontRenderer() { String str = Settings$.MODULE$.get().fontRenderer();
/*  22 */     FontParserHex fontParserHex = new FontParserHex();
/*     */     
/*     */     this.li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider = fontParserHex;
/*  25 */     this.textures = (ArrayBuffer<CharTexture>)ArrayBuffer$.MODULE$.empty();
/*     */     
/*  27 */     this.charMap = Map$.MODULE$.empty();
/*     */ 
/*     */ 
/*     */     
/*  31 */     initialize();
/*     */     
/*  33 */     IResourceManager iResourceManager = Minecraft.func_71410_x().func_110442_L();
/*  34 */     if (iResourceManager instanceof IReloadableResourceManager) { IReloadableResourceManager iReloadableResourceManager = (IReloadableResourceManager)iResourceManager; iReloadableResourceManager.func_110542_a(this); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  35 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } public IGlyphProvider li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider() { return this.li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider; } private ArrayBuffer<CharTexture> textures() { return this.textures; }
/*     */   private Map<Object, CharIcon> charMap() { return this.charMap; }
/*     */   private CharTexture activeTexture() { return this.activeTexture; }
/*     */   private void activeTexture_$eq(CharTexture x$1) { this.activeTexture = x$1; }
/*  39 */   public void initialize() { textures().foreach((Function1)new DynamicFontRenderer$$anonfun$initialize$1(this));
/*     */ 
/*     */     
/*  42 */     textures().clear();
/*  43 */     charMap().clear();
/*  44 */     textures().$plus$eq(new CharTexture(this));
/*  45 */     activeTexture_$eq((CharTexture)textures().head());
/*  46 */     generateChars("☺☻♥♦♣♠•◘○◙♂♀♪♫☼►◄↕‼¶§▬↨↑↓→←∟↔▲▼ !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜ¢£¥₧ƒáíóúñÑªº¿⌐¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αßΓπΣσµτΦΘΩδ∞φε∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■".toCharArray()); } public final class DynamicFontRenderer$$anonfun$initialize$1 extends AbstractFunction1<CharTexture, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public DynamicFontRenderer$$anonfun$initialize$1(DynamicFontRenderer $outer) {} public final void apply(DynamicFontRenderer.CharTexture texture) {
/*     */       texture.delete();
/*     */     } } public void func_110549_a(IResourceManager manager) {
/*  50 */     li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider().initialize();
/*  51 */     initialize();
/*     */   }
/*     */   public int charWidth() {
/*  54 */     return li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider().getGlyphWidth();
/*     */   } public int charHeight() {
/*  56 */     return li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider().getGlyphHeight();
/*     */   } public int textureCount() {
/*  58 */     return textures().length();
/*     */   }
/*     */   public void bindTexture(int index) {
/*  61 */     activeTexture_$eq((CharTexture)textures().apply(index));
/*  62 */     activeTexture().bind();
/*  63 */     RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".bindTexture").toString());
/*     */   }
/*     */   
/*     */   public void generateChar(int char) {
/*  67 */     charMap().getOrElseUpdate(BoxesRunTime.boxToInteger(char), (Function0)new DynamicFontRenderer$$anonfun$generateChar$1(this, char)); } public final class DynamicFontRenderer$$anonfun$generateChar$1 extends AbstractFunction0<CharIcon> implements Serializable { public static final long serialVersionUID = 0L; private final int char$1; public final DynamicFontRenderer.CharIcon apply() { return this.$outer.li$cil$oc$client$renderer$font$DynamicFontRenderer$$createCharIcon(this.char$1); }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public DynamicFontRenderer$$anonfun$generateChar$1(DynamicFontRenderer $outer, int char$1) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawChar(float tx, float ty, int char) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial charMap : ()Lscala/collection/mutable/Map;
/*     */     //   4: iload_3
/*     */     //   5: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   8: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   13: astore #4
/*     */     //   15: aload #4
/*     */     //   17: instanceof scala/Some
/*     */     //   20: ifeq -> 87
/*     */     //   23: aload #4
/*     */     //   25: checkcast scala/Some
/*     */     //   28: astore #5
/*     */     //   30: aload #5
/*     */     //   32: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   35: checkcast li/cil/oc/client/renderer/font/DynamicFontRenderer$CharIcon
/*     */     //   38: astore #6
/*     */     //   40: aload #6
/*     */     //   42: invokevirtual texture : ()Lli/cil/oc/client/renderer/font/DynamicFontRenderer$CharTexture;
/*     */     //   45: aload_0
/*     */     //   46: invokespecial activeTexture : ()Lli/cil/oc/client/renderer/font/DynamicFontRenderer$CharTexture;
/*     */     //   49: astore #7
/*     */     //   51: dup
/*     */     //   52: ifnonnull -> 64
/*     */     //   55: pop
/*     */     //   56: aload #7
/*     */     //   58: ifnull -> 72
/*     */     //   61: goto -> 87
/*     */     //   64: aload #7
/*     */     //   66: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 87
/*     */     //   72: aload #6
/*     */     //   74: fload_1
/*     */     //   75: fload_2
/*     */     //   76: invokevirtual draw : (FF)V
/*     */     //   79: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   82: astore #8
/*     */     //   84: goto -> 92
/*     */     //   87: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   90: astore #8
/*     */     //   92: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #71	-> 0
/*     */     //   #72	-> 15
/*     */     //   #73	-> 87
/*     */     //   #71	-> 92
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	93	0	this	Lli/cil/oc/client/renderer/font/DynamicFontRenderer;
/*     */     //   0	93	1	tx	F
/*     */     //   0	93	2	ty	F
/*     */     //   0	93	3	char	I
/*     */     //   40	53	6	icon	Lli/cil/oc/client/renderer/font/DynamicFontRenderer$CharIcon;
/*     */   }
/*     */ 
/*     */   
/*     */   public CharIcon li$cil$oc$client$renderer$font$DynamicFontRenderer$$createCharIcon(int char) {
/*  83 */     if (((CharTexture)textures().last()).isFull(char)) {
/*  84 */       textures().$plus$eq(new CharTexture(this));
/*  85 */       ((CharTexture)textures().last()).bind();
/*     */     } 
/*  87 */     return (FontUtils$.MODULE$.wcwidth(char) < 1 || li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider().getGlyph(char) == null) ? ((char == 63) ? null : (CharIcon)charMap().getOrElseUpdate(BoxesRunTime.boxToInteger(63), (Function0)new DynamicFontRenderer$$anonfun$li$cil$oc$client$renderer$font$DynamicFontRenderer$$createCharIcon$1(this))) : ((CharTexture)textures().last()).add(char);
/*     */   } public final class DynamicFontRenderer$$anonfun$li$cil$oc$client$renderer$font$DynamicFontRenderer$$createCharIcon$1 extends AbstractFunction0<CharIcon> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final DynamicFontRenderer.CharIcon apply() {
/*     */       return this.$outer.li$cil$oc$client$renderer$font$DynamicFontRenderer$$createCharIcon(63);
/*     */     }
/*     */     public DynamicFontRenderer$$anonfun$li$cil$oc$client$renderer$font$DynamicFontRenderer$$createCharIcon$1(DynamicFontRenderer $outer) {} }
/*     */   public static class CharTexture { private final DynamicFontRenderer owner;
/*     */     public DynamicFontRenderer owner() {
/*  95 */       return this.owner;
/*  96 */     } private final int id = GL11.glGenTextures(); private final int cellWidth; private final int cellHeight; private final int cols; private final int rows; private final double uStep; private final double vStep; private final double pad; private final int capacity; private int chars; private int id() { return this.id; }
/*  97 */     private int cellWidth() { return this.cellWidth; } private int cellHeight() { return this.cellHeight; } private int cols() { return this.cols; } private int rows() { return this.rows; } public CharTexture(DynamicFontRenderer owner) { GL11.glBindTexture(3553, id());
/*  98 */       if (Settings$.MODULE$.get().textLinearFiltering()) {
/*  99 */         GL11.glTexParameteri(3553, 10241, 9729);
/*     */       } else {
/* 101 */         GL11.glTexParameteri(3553, 10241, 9728);
/*     */       } 
/* 103 */       GL11.glTexParameteri(3553, 10240, 9728);
/* 104 */       GL11.glTexImage2D(3553, 0, 32856, DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size(), DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size(), 0, 6408, 5121, BufferUtils.createByteBuffer(DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size() * DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size() * 4));
/*     */       
/* 106 */       RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".<init>: create texture").toString());
/*     */ 
/*     */       
/* 109 */       this.cellWidth = owner.charWidth() + 2;
/* 110 */       this.cellHeight = owner.charHeight() + 2;
/* 111 */       this.cols = DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size() / cellWidth();
/* 112 */       this.rows = DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size() / cellHeight();
/* 113 */       this.uStep = cellWidth() / DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size();
/* 114 */       this.vStep = cellHeight() / DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size();
/* 115 */       this.pad = 1.0D / DynamicFontRenderer$.MODULE$.li$cil$oc$client$renderer$font$DynamicFontRenderer$$size();
/* 116 */       this.capacity = cols() * rows();
/*     */       
/* 118 */       this.chars = 0; } private double uStep() { return this.uStep; } private double vStep() { return this.vStep; } private double pad() { return this.pad; } private int capacity() { return this.capacity; } private int chars() { return this.chars; } private void chars_$eq(int x$1) { this.chars = x$1; }
/*     */     
/*     */     public void delete() {
/* 121 */       GL11.glDeleteTextures(id());
/*     */     }
/*     */     
/*     */     public void bind() {
/* 125 */       GL11.glBindTexture(3553, id());
/*     */     }
/*     */     public boolean isFull(int char) {
/* 128 */       return (chars() + FontUtils$.MODULE$.wcwidth(char) > capacity());
/*     */     }
/*     */     public DynamicFontRenderer.CharIcon add(int char) {
/* 131 */       int glyphWidth = FontUtils$.MODULE$.wcwidth(char);
/* 132 */       int w = owner().charWidth() * glyphWidth;
/* 133 */       int h = owner().charHeight();
/*     */       
/* 135 */       if (chars() % cols() + glyphWidth > cols()) {
/* 136 */         chars_$eq(chars() + 1);
/*     */       }
/* 138 */       int x = chars() % cols();
/* 139 */       int y = chars() / cols();
/*     */       
/* 141 */       GL11.glBindTexture(3553, id());
/* 142 */       GL11.glTexSubImage2D(3553, 0, 1 + x * cellWidth(), 1 + y * cellHeight(), w, h, 6408, 5121, owner().li$cil$oc$client$renderer$font$DynamicFontRenderer$$glyphProvider().getGlyph(char));
/*     */       
/* 144 */       chars_$eq(chars() + glyphWidth);
/*     */       
/* 146 */       return new DynamicFontRenderer.CharIcon(this, w, h, pad() + x * uStep(), pad() + y * vStep(), (x + glyphWidth) * uStep() - pad(), (y + 1) * vStep() - pad());
/*     */     } }
/*     */   public static class CharIcon { private final DynamicFontRenderer.CharTexture texture; private final int w; private final int h; private final double u1; private final double v1; private final double u2; private final double v2;
/*     */     
/* 150 */     public DynamicFontRenderer.CharTexture texture() { return this.texture; } public int w() { return this.w; } public int h() { return this.h; } public double u1() { return this.u1; } public double v1() { return this.v1; } public double u2() { return this.u2; } public double v2() { return this.v2; }
/*     */      public CharIcon(DynamicFontRenderer.CharTexture texture, int w, int h, double u1, double v1, double u2, double v2) {} public void draw(float tx, float ty) {
/* 152 */       GL11.glTexCoord2d(u1(), v2());
/* 153 */       GL11.glVertex2f(tx, ty + h());
/* 154 */       GL11.glTexCoord2d(u2(), v2());
/* 155 */       GL11.glVertex2f(tx + w(), ty + h());
/* 156 */       GL11.glTexCoord2d(u2(), v1());
/* 157 */       GL11.glVertex2f(tx + w(), ty);
/* 158 */       GL11.glTexCoord2d(u1(), v1());
/* 159 */       GL11.glVertex2f(tx, ty);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\font\DynamicFontRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */