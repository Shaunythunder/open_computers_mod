/*     */ package li.cil.oc.client.renderer.font;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\005a!B\001\003\003\003y!a\005+fqR,(/\032$p]R\024VM\0343fe\026\024(BA\002\005\003\0211wN\034;\013\005\0251\021\001\003:f]\022,'/\032:\013\005\035A\021AB2mS\026tGO\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\031\"\001\001\t\021\005E!R\"\001\n\013\003M\tQa]2bY\006L!!\006\n\003\r\005s\027PU3g\021\0259\002\001\"\001\031\003\031a\024N\\5u}Q\t\021\004\005\002\033\0015\t!\001C\004\035\001\t\007IQC\017\002\025\t\f7/[2DQ\006\0248/F\001\037\037\005y\022%\001\021\002\007g\024\017T/r\031x\013PZUyM'Fh\035+='Qc\002\013\026\023'r\030\030\013@\032TyM\003Fh\005)='Vc4/\026\017\0240r\027v\013@JQ9D\026F\004e,Y.b(F\\e+]\"Uc\016G\025oq%r\007&\0138\tS9E F\034%*]&Zc.s\006\023EI\022%K\031:\003&\013\026,Y5rs\006M\0313gQ*dg\016\035:umbTHP A\003\n\033E)\022$H\021&S5\nT'O\037B\013&k\025+V-^C\026LW.];z{\006-\0312dI\0264w\r[5kW2lgn\0349reN$XO^<ysj\\H0 @c\032\013\035}q1_DT\017\027;\031jb!\b\030\036}u1VDX\017G;ylb/\b4\036MqqCD\024\0177;Ybb5\b\\\036-wq^Dt\017<Yfb\035\006\f\026=UqSc\006\0376-sqQD\\\017\037<Yob2\bH\025-V1^C\000\013h\tS1WC|\013g,9)b,\006p\026o3%r\027&\0138:S9K\003FT%+=fQc,\013\026_S&r\026,\0130:UyK\022FX=*=fOc,s\025_s'r\025\"\013(JS9K5FTe+\035&Oc*\003\025O\0230r\026>\0130zTyK\033FX%*=fUc,\033\026_\023)r\026\"\0130JVyK(FXE+=&Sc,\027\026_3'r\0262\0130*SyK\024FX]+=&Vc*c\025O\023$r\027\022\0138JQ9L\rF\\\005*]&AOd\017jzeh\001\036\020~=Qq[P\n;7k\032'h*\036T\026\017Rhh\007\036X\026\0172+r\nD\013\017,=cSc\024\023\026O\022)r\rD\017?,=#ECb\013H\031Tq\\c\022k\025\037q0b3F\\\005\013B\002\022\001A\0035a$A\006cCNL7m\0215beN\004\003\"\002\023\001\t\003)\023aD2iCJ\024VM\0343fe^KG\r\0365\026\003\031\002\"!E\024\n\005!\022\"aA%oi\")!\006\001C\001K\005\0012\r[1s%\026tG-\032:IK&<\007\016\036\005\006Y\001!\t!L\001\016O\026tWM]1uK\016C\027M]:\025\0059\n\004CA\t0\023\t\001$C\001\003V]&$\b\"\002\032,\001\004\031\024!B2iCJ\034\bcA\t5m%\021QG\005\002\006\003J\024\030-\037\t\003#]J!\001\017\n\003\t\rC\027M\035\005\006Y\001!\tA\017\013\003]mBQAM\035A\002q\0022!\005\033'\021\025q\004\001\"\001@\003)!'/Y<Ck\0324WM\035\013\005]\001C%\nC\003B{\001\007!)\001\004ck\0324WM\035\t\003\007\032k\021\001\022\006\003\013\"\tA!\036;jY&\021q\t\022\002\013)\026DHOQ;gM\026\024\b\"B%>\001\0041\023!\004<jK^\004xN\035;XS\022$\b\016C\003L{\001\007a%\001\bwS\026<\bo\034:u\021\026Lw\r\033;\t\0135\003A\021\001(\002\025\021\024\030m^*ue&tw\r\006\003/\037bS\006\"\002)M\001\004\t\026!A:\021\005I+fBA\tT\023\t!&#\001\004Qe\026$WMZ\005\003-^\023aa\025;sS:<'B\001+\023\021\025IF\n1\001'\003\005A\b\"B.M\001\0041\023!A=\t\013u\003a\021C\023\002\023\rD\027M],jIRD\007\"B0\001\r#)\023AC2iCJDU-[4ii\")\021\r\001D\tK\005aA/\032=ukJ,7i\\;oi\")1\r\001D\tI\006Y!-\0338e)\026DH/\036:f)\tqS\rC\003gE\002\007a%A\003j]\022,\007\020C\003i\001\031E\021.\001\007hK:,'/\031;f\007\"\f'\017\006\002/U\")1n\032a\001M\005!1\r[1s\021\025i\007A\"\005o\003!!'/Y<DQ\006\024H\003\002\030piZDQ\001\0357A\002E\f!\001\036=\021\005E\021\030BA:\023\005\0251En\\1u\021\025)H\0161\001r\003\t!\030\020C\003lY\002\007a\005C\003y\001\021%\0210\001\005ee\006<\030+^1e)\025q#\020`?\021\025Yx\0171\001'\003\025\031w\016\\8s\021\025Iv\0171\001'\021\025Yv\0171\001'\021\025yx\0171\001'\003\0259\030\016\032;i\001")
/*     */ public abstract class TextureFontRenderer {
/*     */   private final String basicChars;
/*     */   
/*     */   public final String basicChars() {
/*  14 */     return "☺☻♥♦♣♠•◘○◙♂♀♪♫☼►◄↕‼¶§▬↨↑↓→←∟↔▲▼ !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~⌂ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜ¢£¥₧ƒáíóúñÑªº¿⌐¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αßΓπΣσµτΦΘΩδ∞φε∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■";
/*     */   } public int charRenderWidth() {
/*  16 */     return charWidth() / 2;
/*     */   } public int charRenderHeight() {
/*  18 */     return charHeight() / 2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void generateChars(char[] chars)
/*     */   {
/*  26 */     Predef$.MODULE$.charArrayOps(chars).foreach((Function1)new TextureFontRenderer$$anonfun$generateChars$2(this)); } public final class TextureFontRenderer$$anonfun$generateChars$2 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public TextureFontRenderer$$anonfun$generateChars$2(TextureFontRenderer $outer) {} public final void apply(char char) {
/*  27 */       this.$outer.generateChar(char);
/*     */     } }
/*     */ 
/*     */   
/*     */   public void generateChars(int[] chars) {
/*  32 */     Predef$.MODULE$.intArrayOps(chars).foreach((Function1)new TextureFontRenderer$$anonfun$generateChars$1(this)); } public final class TextureFontRenderer$$anonfun$generateChars$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int char) { apply$mcVI$sp(char); }
/*  33 */     public TextureFontRenderer$$anonfun$generateChars$1(TextureFontRenderer $outer) {} public void apply$mcVI$sp(int char) { this.$outer.generateChar(char); } }
/*     */    public final class TextureFontRenderer$$anonfun$drawBuffer$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TextBuffer buffer$1; public final int viewportWidth$1; public final PackedColor.ColorFormat format$1; public final void apply(int y) { apply$mcVI$sp(y); } public TextureFontRenderer$$anonfun$drawBuffer$1(TextureFontRenderer $outer, TextBuffer buffer$1, int viewportWidth$1, PackedColor.ColorFormat format$1) {} public void apply$mcVI$sp(int y) { short[] color = this.buffer$1.color()[y]; IntRef cbg = IntRef.create(0); IntRef x = IntRef.create(0); IntRef width = IntRef.create(0); Predef$.MODULE$.intArrayOps((int[])Predef$.MODULE$.shortArrayOps(color).map((Function1)new TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$6(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))).withFilter((Function1)new TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$1(this, x, width)).foreach((Function1)new TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$2(this, cbg, x, width, y)); this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$drawQuad(cbg.elem, x.elem, y, width.elem); } public final class TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$6 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(short x$1) { return PackedColor$.MODULE$.unpackBackground(x$1, this.$outer.format$1); } public TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$6(TextureFontRenderer$$anonfun$drawBuffer$1 $outer) {} } public final class TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final IntRef x$2; private final IntRef width$1; public final boolean apply(int col) { return apply$mcZI$sp(col); } public boolean apply$mcZI$sp(int col) { return (this.x$2.elem + this.width$1.elem < this.$outer.viewportWidth$1); } public TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$1(TextureFontRenderer$$anonfun$drawBuffer$1 $outer, IntRef x$2, IntRef width$1) {}
/*     */     } public final class TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final IntRef cbg$1; private final IntRef x$2; private final IntRef width$1; private final int y$1; public final void apply(int col) { apply$mcVI$sp(col); } public TextureFontRenderer$$anonfun$drawBuffer$1$$anonfun$apply$mcVI$sp$2(TextureFontRenderer$$anonfun$drawBuffer$1 $outer, IntRef cbg$1, IntRef x$2, IntRef width$1, int y$1) {} public void apply$mcVI$sp(int col) { if (col != this.cbg$1.elem) { this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$$outer().li$cil$oc$client$renderer$font$TextureFontRenderer$$drawQuad(this.cbg$1.elem, this.x$2.elem, this.y$1, this.width$1.elem); this.cbg$1.elem = col; this.x$2.elem += this.width$1.elem; this.width$1.elem = 0; }  this.width$1.elem++; } }
/*  38 */   } public void drawBuffer(TextBuffer buffer, int viewportWidth, int viewportHeight) { PackedColor.ColorFormat format = buffer.format();
/*     */     
/*  40 */     GL11.glPushMatrix();
/*  41 */     GL11.glPushAttrib(1048575);
/*     */     
/*  43 */     GL11.glScalef(0.5F, 0.5F, 1.0F);
/*     */     
/*  45 */     GL11.glDepthMask(false);
/*  46 */     GL11.glDisable(3553);
/*     */     
/*  48 */     RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".drawBuffer: configure state").toString());
/*     */ 
/*     */ 
/*     */     
/*  52 */     GL11.glBegin(7); RichInt$.MODULE$
/*  53 */       .until$extension0(Predef$.MODULE$.intWrapper(0), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(viewportHeight), buffer.height())).foreach$mVc$sp((Function1)new TextureFontRenderer$$anonfun$drawBuffer$1(this, buffer, viewportWidth, format));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     GL11.glEnd();
/*     */     
/*  71 */     RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".drawBuffer: background").toString());
/*     */     
/*  73 */     GL11.glEnable(3553);
/*     */     
/*  75 */     if (Settings$.MODULE$.get().textLinearFiltering())
/*  76 */       GL11.glTexParameteri(3553, 10241, 9729);  RichInt$.MODULE$
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  81 */       .until$extension0(Predef$.MODULE$.intWrapper(0), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(viewportHeight), buffer.height())).foreach$mVc$sp((Function1)new TextureFontRenderer$$anonfun$drawBuffer$2(this, buffer, viewportWidth, format));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".drawBuffer: foreground").toString());
/*     */     
/* 113 */     GL11.glPopAttrib();
/* 114 */     GL11.glPopMatrix();
/*     */     
/* 116 */     RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".drawBuffer: leaving").toString()); }
/*     */   public final class TextureFontRenderer$$anonfun$drawBuffer$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final TextBuffer buffer$1; public final int viewportWidth$1; public final PackedColor.ColorFormat format$1; public final void apply(int y) { apply$mcVI$sp(y); } public TextureFontRenderer$$anonfun$drawBuffer$2(TextureFontRenderer $outer, TextBuffer buffer$1, int viewportWidth$1, PackedColor.ColorFormat format$1) {} public void apply$mcVI$sp(int y) { int[] line = this.buffer$1.buffer()[y]; short[] color = this.buffer$1.color()[y]; int ty = y * this.$outer.charHeight(); RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.$outer.textureCount()).foreach$mVc$sp((Function1)new TextureFontRenderer$$anonfun$drawBuffer$2$$anonfun$apply$mcVI$sp$3(this, line, color, ty)); } public final class TextureFontRenderer$$anonfun$drawBuffer$2$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int[] line$1; public final short[] color$1; public final int ty$1; public final void apply(int i) { apply$mcVI$sp(i); } public TextureFontRenderer$$anonfun$drawBuffer$2$$anonfun$apply$mcVI$sp$3(TextureFontRenderer$$anonfun$drawBuffer$2 $outer, int[] line$1, short[] color$1, int ty$1) {} public void apply$mcVI$sp(int i) { this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$$outer().bindTexture(i); GL11.glBegin(7); IntRef cfg = IntRef.create(-1); FloatRef tx = FloatRef.create(0.0F); RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.$outer.viewportWidth$1).foreach$mVc$sp((Function1)new TextureFontRenderer$$anonfun$drawBuffer$2$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4(this, cfg, tx)); GL11.glEnd(); } public final class TextureFontRenderer$$anonfun$drawBuffer$2$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable {
/* 120 */         public static final long serialVersionUID = 0L; private final IntRef cfg$1; private final FloatRef tx$1; public final void apply(int n) { apply$mcVI$sp(n); } public TextureFontRenderer$$anonfun$drawBuffer$2$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4(TextureFontRenderer$$anonfun$drawBuffer$2$$anonfun$apply$mcVI$sp$3 $outer, IntRef cfg$1, FloatRef tx$1) {} public void apply$mcVI$sp(int n) { int ch = this.$outer.line$1[n]; int col = PackedColor$.MODULE$.unpackForeground(this.$outer.color$1[n], (this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$anonfun$$$outer()).format$1); if (col != this.cfg$1.elem) { this.cfg$1.elem = col; GL11.glColor3ub((byte)((this.cfg$1.elem & 0xFF0000) >> 16), (byte)((this.cfg$1.elem & 0xFF00) >> 8), (byte)((this.cfg$1.elem & 0xFF) >> 0)); }  if (ch != 32) this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$anonfun$$$outer().li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$$outer().drawChar(this.tx$1.elem, this.$outer.ty$1, ch);  this.tx$1.elem += this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$anonfun$$$outer().li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$$outer().charWidth(); } } } } public void drawString(String s, int x, int y) { int sLength = ExtendedUnicodeHelper.length(s);
/*     */     
/* 122 */     GL11.glPushMatrix();
/* 123 */     GL11.glPushAttrib(1048575);
/*     */     
/* 125 */     GL11.glTranslatef(x, y, 0.0F);
/* 126 */     GL11.glScalef(0.5F, 0.5F, 1.0F);
/* 127 */     GL11.glDepthMask(false); RichInt$.MODULE$
/*     */       
/* 129 */       .until$extension0(Predef$.MODULE$.intWrapper(0), textureCount()).foreach$mVc$sp((Function1)new TextureFontRenderer$$anonfun$drawString$1(this, s, sLength));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     GL11.glPopAttrib();
/* 147 */     GL11.glPopMatrix(); } public abstract int charWidth(); public abstract int charHeight(); public abstract int textureCount(); public abstract void bindTexture(int paramInt); public abstract void generateChar(int paramInt); public abstract void drawChar(float paramFloat1, float paramFloat2, int paramInt); public final class TextureFontRenderer$$anonfun$drawString$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final String s$1; private final int sLength$1; public final void apply(int i) { apply$mcVI$sp(i); } public TextureFontRenderer$$anonfun$drawString$1(TextureFontRenderer $outer, String s$1, int sLength$1) {} public void apply$mcVI$sp(int i) { this.$outer.bindTexture(i);
/*     */       GL11.glBegin(7);
/*     */       FloatRef tx = FloatRef.create(0.0F);
/*     */       IntRef cx = IntRef.create(0);
/*     */       RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.sLength$1).foreach$mVc$sp((Function1)new TextureFontRenderer$$anonfun$drawString$1$$anonfun$apply$mcVI$sp$5(this, tx, cx));
/*     */       GL11.glEnd(); } public final class TextureFontRenderer$$anonfun$drawString$1$$anonfun$apply$mcVI$sp$5 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final FloatRef tx$2; private final IntRef cx$1;
/*     */       public final void apply(int n) { apply$mcVI$sp(n); }
/*     */       public TextureFontRenderer$$anonfun$drawString$1$$anonfun$apply$mcVI$sp$5(TextureFontRenderer$$anonfun$drawString$1 $outer, FloatRef tx$2, IntRef cx$1) {}
/*     */       public void apply$mcVI$sp(int n) { int ch = this.$outer.s$1.codePointAt(this.cx$1.elem);
/*     */         if (ch != 32)
/*     */           this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$$outer().drawChar(this.tx$2.elem, 0.0F, ch); 
/*     */         this.tx$2.elem += this.$outer.li$cil$oc$client$renderer$font$TextureFontRenderer$$anonfun$$$outer().charWidth();
/*     */         this.cx$1.elem = this.$outer.s$1.offsetByCodePoints(this.cx$1.elem, 1); } } }
/* 162 */   public void li$cil$oc$client$renderer$font$TextureFontRenderer$$drawQuad(int color, int x, int y, int width) { if (color != 0 && width > 0) {
/* 163 */       int x0 = x * charWidth();
/* 164 */       int x1 = (x + width) * charWidth();
/* 165 */       int y0 = y * charHeight();
/* 166 */       int y1 = (y + 1) * charHeight();
/* 167 */       GL11.glColor3ub((byte)(color >> 16 & 0xFF), (byte)(color >> 8 & 0xFF), (byte)(color & 0xFF));
/* 168 */       GL11.glVertex3d(x0, y1, 0.0D);
/* 169 */       GL11.glVertex3d(x1, y1, 0.0D);
/* 170 */       GL11.glVertex3d(x1, y0, 0.0D);
/* 171 */       GL11.glVertex3d(x0, y0, 0.0D);
/*     */     }  }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\font\TextureFontRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */