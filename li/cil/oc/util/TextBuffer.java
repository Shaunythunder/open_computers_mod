/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BooleanRef;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005uh\001B\001\003\001-\021!\002V3yi\n+hMZ3s\025\t\031A!\001\003vi&d'BA\003\007\003\ty7M\003\002\b\021\005\0311-\0337\013\003%\t!\001\\5\004\001M\021\001\001\004\t\003\033Ai\021A\004\006\002\037\005)1oY1mC&\021\021C\004\002\007\003:L(+\0324\t\021M\001!\0211A\005\002Q\tQa^5ei\",\022!\006\t\003\033YI!a\006\b\003\007%sG\017\003\005\032\001\t\005\r\021\"\001\033\003%9\030\016\032;i?\022*\027\017\006\002\034=A\021Q\002H\005\003;9\021A!\0268ji\"9q\004GA\001\002\004)\022a\001=%c!A\021\005\001B\001B\003&Q#\001\004xS\022$\b\016\t\005\tG\001\021\t\031!C\001)\0051\001.Z5hQRD\001\"\n\001\003\002\004%\tAJ\001\013Q\026Lw\r\033;`I\025\fHCA\016(\021\035yB%!AA\002UA\001\"\013\001\003\002\003\006K!F\001\bQ\026Lw\r\033;!\021!Y\003A!A!\002\023a\023!D5oSRL\027\r\034$pe6\fG\017\005\002.c9\021afL\007\002\005%\021\001GA\001\f!\006\0347.\0323D_2|'/\003\0023g\tY1i\0347pe\032{'/\\1u\025\t\001$\001C\0036\001\021\005a'\001\004=S:LGO\020\013\005oaJ$\b\005\002/\001!)1\003\016a\001+!)1\005\016a\001+!)1\006\016a\001Y!)Q\007\001C\001yQ\031q'\020\"\t\013yZ\004\031A \002\tML'0\032\t\005\033\001+R#\003\002B\035\t1A+\0369mKJBQaQ\036A\0021\naAZ8s[\006$\bbB#\001\001\004%IAR\001\b?\032|'/\\1u+\005a\003b\002%\001\001\004%I!S\001\f?\032|'/\\1u?\022*\027\017\006\002\034\025\"9qdRA\001\002\004a\003B\002'\001A\003&A&\001\005`M>\024X.\031;!\021\035q\005\0011A\005\n=\0131b\0304pe\026<'o\\;oIV\t\001\013\005\002.#&\021!k\r\002\006\007>dwN\035\005\b)\002\001\r\021\"\003V\003=yfm\034:fOJ|WO\0343`I\025\fHCA\016W\021\035y2+!AA\002ACa\001\027\001!B\023\001\026\001D0g_J,wM]8v]\022\004\003b\002.\001\001\004%IaT\001\f?\n\f7m[4s_VtG\rC\004]\001\001\007I\021B/\002\037}\023\027mY6he>,h\016Z0%KF$\"a\0070\t\017}Y\026\021!a\001!\"1\001\r\001Q!\nA\013Ab\0302bG.<'o\\;oI\002BqA\031\001A\002\023%1-\001\004qC\016\\W\rZ\013\002IB\021Q\"Z\005\003M:\021Qa\0255peRDq\001\033\001A\002\023%\021.\001\006qC\016\\W\rZ0%KF$\"a\0076\t\017}9\027\021!a\001I\"1A\016\001Q!\n\021\fq\001]1dW\026$\007\005C\003o\001\021\005q*\001\006g_J,wM]8v]\022DQ\001\035\001\005\002E\faBZ8sK\036\024x.\0368e?\022*\027\017\006\0028e\")1o\034a\001!\006)a/\0317vK\")Q\017\001C\001\037\006Q!-Y2lOJ|WO\0343\t\013]\004A\021\001=\002\035\t\f7m[4s_VtGm\030\023fcR\021q'\037\005\006gZ\004\r\001\025\005\006\007\002!\tA\022\005\006y\002!\t!`\001\013M>\024X.\031;`I\025\fHc\001@\002\004A\021Qb`\005\004\003\003q!a\002\"p_2,\027M\034\005\006gn\004\r\001\f\005\n\003\017\001\001\031!C\001\003\023\tQaY8m_J,\"!a\003\021\0135\ti!!\005\n\007\005=aBA\003BeJ\f\027\020\005\003\016\003\033!\007\"CA\013\001\001\007I\021AA\f\003%\031w\016\\8s?\022*\027\017F\002\034\0033A\021bHA\n\003\003\005\r!a\003\t\021\005u\001\001)Q\005\003\027\taaY8m_J\004\003\"CA\021\001\001\007I\021AA\022\003\031\021WO\0324feV\021\021Q\005\t\006\033\0055\021q\005\t\005\033\0055Q\003C\005\002,\001\001\r\021\"\001\002.\005Q!-\0364gKJ|F%Z9\025\007m\ty\003C\005 \003S\t\t\0211\001\002&!A\0211\007\001!B\023\t)#A\004ck\0324WM\035\021\t\ry\002A\021AA\034+\005y\004bBA\036\001\021\005\021QH\001\tg&TXm\030\023fcR\031a0a\020\t\rM\fI\0041\001@\021\035\t\031\005\001C\001\003\013\n1aZ3u)\025)\022qIA&\021\035\tI%!\021A\002U\t1aY8m\021\035\ti%!\021A\002U\t1A]8x\021\035\t\t\006\001C\001\003'\n1a]3u)%q\030QKA,\0033\nY\007C\004\002J\005=\003\031A\013\t\017\0055\023q\na\001+!A\0211LA(\001\004\ti&A\001t!\021\ty&!\032\017\0075\t\t'C\002\002d9\ta\001\025:fI\0264\027\002BA4\003S\022aa\025;sS:<'bAA2\035!9\021QNA(\001\004q\030\001\003<feRL7-\0317\t\017\005E\004\001\"\001\002t\005!a-\0337m)-q\030QOA<\003s\ni(!!\t\017\005%\023q\016a\001+!9\021QJA8\001\004)\002bBA>\003_\002\r!F\001\002o\"9\021qPA8\001\004)\022!\0015\t\017\005\r\025q\016a\001+\005\t1\rC\004\002\b\002!\t!!#\002\t\r|\007/\037\013\016}\006-\025QRAH\003#\013\031*a&\t\017\005%\023Q\021a\001+!9\021QJAC\001\004)\002bBA>\003\013\003\r!\006\005\b\003\n)\t1\001\026\021\035\t)*!\"A\002U\t!\001\036=\t\017\005e\025Q\021a\001+\005\021A/\037\005\b\003;\003A\021AAP\003\035\021\030m^2paf$rB`AQ\003G\013)+a*\002*\0065\026\021\027\005\b\003\023\nY\n1\001\026\021\035\ti%a'A\002UAq!a\037\002\034\002\007Q\003C\004\002\000\005m\005\031A\013\t\017\005-\0261\024a\001o\005\0311O]2\t\017\005=\0261\024a\001+\0059aM]8n\007>d\007bBAZ\0037\003\r!F\001\bMJ|WNU8x\021\035\t9\f\001C\005\003s\013qa]3u\007\"\f'\017F\005\034\003w\013y,a1\002H\"A\021QXA[\001\004\t9#\001\003mS:,\007\002CAa\003k\003\r!!\005\002\0231Lg.Z\"pY>\024\bbBAc\003k\003\r!F\001\002q\"9\0211QA[\001\004)\002bBAf\001\021\005\021QZ\001\005Y>\fG\rF\002\034\003\037D\001\"!5\002J\002\007\0211[\001\004]\n$\b\003BAk\003Cl!!a6\013\t\005E\027\021\034\006\005\0037\fi.A\005nS:,7M]1gi*\021\021q\\\001\004]\026$\030\002BAr\003/\024aB\024\"U)\006<7i\\7q_VtG\rC\004\002h\002!\t!!;\002\tM\fg/\032\013\0047\005-\b\002CAi\003K\004\r!a5\t\017\005=\b\001\"\001\002r\006aA.\0338f)>\034FO]5oOR!\021QLAz\021\035\t)0!<A\002U\t\021!\037\005\b\003s\004A\021IA~\003!!xn\025;sS:<GCAA/\001")
/*     */ public class TextBuffer {
/*     */   private int width;
/*     */   private int height;
/*     */   private PackedColor.ColorFormat li$cil$oc$util$TextBuffer$$_format;
/*     */   private PackedColor.Color _foreground;
/*     */   private PackedColor.Color _background;
/*     */   private short li$cil$oc$util$TextBuffer$$packed;
/*     */   private short[][] color;
/*     */   private int[][] buffer;
/*     */   
/*  18 */   public int width() { return this.width; } public void width_$eq(int x$1) { this.width = x$1; } public int height() { return this.height; } public void height_$eq(int x$1) { this.height = x$1; }
/*     */   public TextBuffer(Tuple2 size, PackedColor.ColorFormat format) { this(size._1$mcI$sp(), size._2$mcI$sp(), format); }
/*     */   public PackedColor.ColorFormat li$cil$oc$util$TextBuffer$$_format() { return this.li$cil$oc$util$TextBuffer$$_format; }
/*  21 */   private void li$cil$oc$util$TextBuffer$$_format_$eq(PackedColor.ColorFormat x$1) { this.li$cil$oc$util$TextBuffer$$_format = x$1; } private PackedColor.Color _foreground() { return this._foreground; } private void _foreground_$eq(PackedColor.Color x$1) { this._foreground = x$1; } private PackedColor.Color _background() { return this._background; } private void _background_$eq(PackedColor.Color x$1) { this._background = x$1; } public short li$cil$oc$util$TextBuffer$$packed() { return this.li$cil$oc$util$TextBuffer$$packed; } private void li$cil$oc$util$TextBuffer$$packed_$eq(short x$1) { this.li$cil$oc$util$TextBuffer$$packed = x$1; } public PackedColor.Color foreground() { return _foreground(); } public TextBuffer(int width, int height, PackedColor.ColorFormat initialFormat) { this.li$cil$oc$util$TextBuffer$$_format = initialFormat;
/*     */     
/*  23 */     this._foreground = new PackedColor.Color(16777215, PackedColor.Color$.MODULE$.apply$default$2());
/*     */     
/*  25 */     this._background = new PackedColor.Color(0, PackedColor.Color$.MODULE$.apply$default$2());
/*     */     
/*  27 */     this.li$cil$oc$util$TextBuffer$$packed = PackedColor$.MODULE$.pack(_foreground(), _background(), li$cil$oc$util$TextBuffer$$_format());
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
/*  67 */     this.color = (short[][])Array$.MODULE$.fill(height(), width(), (Function0)new TextBuffer$$anonfun$1(this), ClassTag$.MODULE$.Short());
/*     */     
/*  69 */     this.buffer = (int[][])Array$.MODULE$.fill(height(), width(), (Function0)new TextBuffer$$anonfun$2(this), ClassTag$.MODULE$.Int()); } public TextBuffer foreground_$eq(PackedColor.Color value) { format().validate(value); _foreground_$eq(value); li$cil$oc$util$TextBuffer$$packed_$eq(PackedColor$.MODULE$.pack(_foreground(), _background(), li$cil$oc$util$TextBuffer$$_format())); return this; } public PackedColor.Color background() { return _background(); } public TextBuffer background_$eq(PackedColor.Color value) { format().validate(value); _background_$eq(value); li$cil$oc$util$TextBuffer$$packed_$eq(PackedColor$.MODULE$.pack(_foreground(), _background(), li$cil$oc$util$TextBuffer$$_format())); return this; } public PackedColor.ColorFormat format() { return li$cil$oc$util$TextBuffer$$_format(); } public boolean format_$eq(PackedColor.ColorFormat value) { li.cil.oc.api.internal.TextBuffer.ColorDepth colorDepth = value.depth(); if (format().depth() == null) { format().depth(); if (colorDepth != null); } else if (format().depth().equals(colorDepth)) {  }  } public final class TextBuffer$$anonfun$format_$eq$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final PackedColor.ColorFormat value$1; public final void apply(int row) { apply$mcVI$sp(row); } public TextBuffer$$anonfun$format_$eq$1(TextBuffer $outer, PackedColor.ColorFormat value$1) {} public void apply$mcVI$sp(int row) { short[] rowColor = this.$outer.color()[row]; RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.$outer.width()).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$format_$eq$1$$anonfun$apply$mcVI$sp$1(this, rowColor)); } public final class TextBuffer$$anonfun$format_$eq$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final short[] rowColor$1; public final void apply(int col) { apply$mcVI$sp(col); } public TextBuffer$$anonfun$format_$eq$1$$anonfun$apply$mcVI$sp$1(TextBuffer$$anonfun$format_$eq$1 $outer, short[] rowColor$1) {} public void apply$mcVI$sp(int col) { short packed = this.rowColor$1[col]; PackedColor.Color fg = new PackedColor.Color(PackedColor$.MODULE$.unpackForeground(packed, this.$outer.li$cil$oc$util$TextBuffer$$anonfun$$$outer().li$cil$oc$util$TextBuffer$$_format()), PackedColor.Color$.MODULE$.apply$default$2()); PackedColor.Color bg = new PackedColor.Color(PackedColor$.MODULE$.unpackBackground(packed, this.$outer.li$cil$oc$util$TextBuffer$$anonfun$$$outer().li$cil$oc$util$TextBuffer$$_format()), PackedColor.Color$.MODULE$.apply$default$2()); this.rowColor$1[col] = PackedColor$.MODULE$.pack(fg, bg, this.$outer.value$1); } } } public short[][] color() { return this.color; } public void color_$eq(short[][] x$1) { this.color = x$1; } public final class TextBuffer$$anonfun$1 extends AbstractFunction0.mcS.sp implements Serializable { public static final long serialVersionUID = 0L; public final short apply() { return apply$mcS$sp(); } public short apply$mcS$sp() { return this.$outer.li$cil$oc$util$TextBuffer$$packed(); } public TextBuffer$$anonfun$1(TextBuffer $outer) {} } public int[][] buffer() { return this.buffer; } public void buffer_$eq(int[][] x$1) { this.buffer = x$1; } public final class TextBuffer$$anonfun$2 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 32; }
/*     */      public TextBuffer$$anonfun$2(TextBuffer $outer) {} }
/*     */   public Tuple2<Object, Object> size() {
/*  72 */     return (Tuple2<Object, Object>)new Tuple2.mcII.sp(width(), height());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean size_$eq(Tuple2 value) {
/*  82 */     Tuple2 tuple2 = value; if (tuple2 != null) { int iw = tuple2._1$mcI$sp(), ih = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(iw, ih), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/*  83 */       Tuple2.mcII.sp sp3 = new Tuple2.mcII.sp(package$.MODULE$.max(i, 1), package$.MODULE$.max(j, 1)); if (sp3 != null) { int w = sp3._1$mcI$sp(), h = sp3._2$mcI$sp(); Tuple2.mcII.sp sp5 = new Tuple2.mcII.sp(w, h), sp4 = sp5; int k = sp4._1$mcI$sp(), m = sp4._2$mcI$sp();
/*     */         
/*  85 */         int[][] newBuffer = (int[][])Array$.MODULE$.fill(m, k, (Function0)new TextBuffer$$anonfun$3(this), ClassTag$.MODULE$.Int());
/*  86 */         short[][] newColor = (short[][])Array$.MODULE$.fill(m, k, (Function0)new TextBuffer$$anonfun$4(this), ClassTag$.MODULE$.Short()); RichInt$.MODULE$
/*  87 */           .until$extension0(Predef$.MODULE$.intWrapper(0), package$.MODULE$.min(m, height())).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$size_$eq$1(this, k, newBuffer, newColor));
/*     */ 
/*     */ 
/*     */         
/*  91 */         buffer_$eq(newBuffer);
/*  92 */         color_$eq(newColor);
/*  93 */         width_$eq(k);
/*  94 */         height_$eq(m); return (width() != k || height() != m); }  throw new MatchError(sp3); }  throw new MatchError(tuple2);
/*     */   } public final class TextBuffer$$anonfun$3 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { return 32; } public TextBuffer$$anonfun$3(TextBuffer $outer) {} } public final class TextBuffer$$anonfun$4 extends AbstractFunction0.mcS.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final short apply() { return apply$mcS$sp(); } public short apply$mcS$sp() { return this.$outer.li$cil$oc$util$TextBuffer$$packed(); } public TextBuffer$$anonfun$4(TextBuffer $outer) {} } public final class TextBuffer$$anonfun$size_$eq$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int w$3; private final int[][] newBuffer$1; private final short[][] newColor$1;
/*     */     public final void apply(int y) { apply$mcVI$sp(y); }
/*     */     public TextBuffer$$anonfun$size_$eq$1(TextBuffer $outer, int w$3, int[][] newBuffer$1, short[][] newColor$1) {}
/*     */     public void apply$mcVI$sp(int y) { Array$.MODULE$.copy(this.$outer.buffer()[y], 0, this.newBuffer$1[y], 0, package$.MODULE$.min(this.w$3, this.$outer.width())); Array$.MODULE$.copy(this.$outer.color()[y], 0, this.newColor$1[y], 0, package$.MODULE$.min(this.w$3, this.$outer.width())); } }
/* 102 */   public int get(int col, int row) { if (col < 0 || col >= width() || row < 0 || row >= height())
/* 103 */       throw new IndexOutOfBoundsException(); 
/* 104 */     return buffer()[row][col]; }
/*     */ 
/*     */   
/*     */   public boolean set(int col, int row, String s, boolean vertical)
/*     */   {
/* 109 */     int sLength = ExtendedUnicodeHelper.length(s);
/*     */ 
/*     */ 
/*     */     
/* 113 */     BooleanRef changed = BooleanRef.create(false);
/* 114 */     IntRef cx = IntRef.create(0); RichInt$.MODULE$
/* 115 */       .until$extension0(Predef$.MODULE$.intWrapper(row), package$.MODULE$.min(row + sLength, height())).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$set$1(this, col, s, changed, cx));
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
/* 129 */     BooleanRef booleanRef1 = BooleanRef.create(false);
/* 130 */     int[] line = buffer()[row];
/* 131 */     short[] lineColor = color()[row];
/* 132 */     IntRef bx = IntRef.create(package$.MODULE$.max(col, 0));
/* 133 */     IntRef intRef1 = IntRef.create(0); RichInt$.MODULE$
/* 134 */       .until$extension0(Predef$.MODULE$.intWrapper(bx.elem), package$.MODULE$.min(col + sLength, width())).withFilter((Function1)new TextBuffer$$anonfun$set$2(this, line, bx)).foreach((Function1)new TextBuffer$$anonfun$set$3(this, s, booleanRef1, line, lineColor, bx, intRef1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     return vertical ? ((col < 0 || col >= width()) ? false : changed.elem) : ((row < 0 || row >= height()) ? false : booleanRef1.elem);
/*     */   } public final class TextBuffer$$anonfun$set$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int col$1; private final String s$1; private final BooleanRef changed$1; private final IntRef cx$1; public final void apply(int y) { apply$mcVI$sp(y); } public void apply$mcVI$sp(int y) { if (y >= 0) { int[] line = this.$outer.buffer()[y]; short[] lineColor = this.$outer.color()[y]; int c = this.s$1.codePointAt(this.cx$1.elem); this.changed$1.elem = (this.changed$1.elem || line[this.col$1] != c || lineColor[this.col$1] != this.$outer.li$cil$oc$util$TextBuffer$$packed()); this.$outer.li$cil$oc$util$TextBuffer$$setChar(line, lineColor, this.col$1, c); this.cx$1.elem = this.s$1.offsetByCodePoints(this.cx$1.elem, 1); }  } public TextBuffer$$anonfun$set$1(TextBuffer $outer, int col$1, String s$1, BooleanRef changed$1, IntRef cx$1) {} } public final class TextBuffer$$anonfun$set$2 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int[] line$2; private final IntRef bx$1; public final boolean apply(int x) { return apply$mcZI$sp(x); } public boolean apply$mcZI$sp(int x) { return (this.bx$1.elem < this.line$2.length); } public TextBuffer$$anonfun$set$2(TextBuffer $outer, int[] line$2, IntRef bx$1) {} } public final class TextBuffer$$anonfun$set$3 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String s$1; private final BooleanRef changed$2; private final int[] line$2; private final short[] lineColor$2; private final IntRef bx$1; private final IntRef cx$2;
/*     */     public final void apply(int x) { apply$mcVI$sp(x); }
/*     */     public TextBuffer$$anonfun$set$3(TextBuffer $outer, String s$1, BooleanRef changed$2, int[] line$2, short[] lineColor$2, IntRef bx$1, IntRef cx$2) {}
/*     */     public void apply$mcVI$sp(int x) { int c = this.s$1.codePointAt(this.cx$2.elem); this.changed$2.elem = (this.changed$2.elem || this.line$2[this.bx$1.elem] != c || this.lineColor$2[this.bx$1.elem] != this.$outer.li$cil$oc$util$TextBuffer$$packed()); this.$outer.li$cil$oc$util$TextBuffer$$setChar(this.line$2, this.lineColor$2, this.bx$1.elem, c); this.bx$1.elem += package$.MODULE$.max(1, FontUtils$.MODULE$.wcwidth(c)); this.cx$2.elem = this.s$1.offsetByCodePoints(this.cx$2.elem, 1); } }
/* 149 */   public boolean fill(int col, int row, int w, int h, int c) { if (w <= 0 || h <= 0) return false; 
/* 150 */     if (col + w < 0 || row + h < 0 || col >= width() || row >= height()) return false; 
/* 151 */     BooleanRef changed = BooleanRef.create(false); RichInt$.MODULE$
/* 152 */       .until$extension0(Predef$.MODULE$.intWrapper(package$.MODULE$.max(row, 0)), package$.MODULE$.min(row + h, height())).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$fill$1(this, col, w, c, changed));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     return changed.elem; } public final class TextBuffer$$anonfun$fill$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int col$2; private final int w$2; public final int c$1; public final BooleanRef changed$3; public final void apply(int y) { apply$mcVI$sp(y); } public TextBuffer$$anonfun$fill$1(TextBuffer $outer, int col$2, int w$2, int c$1, BooleanRef changed$3) {} public void apply$mcVI$sp(int y) { int[] line = this.$outer.buffer()[y]; short[] lineColor = this.$outer.color()[y]; IntRef bx = IntRef.create(package$.MODULE$.max(this.col$2, 0)); RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(bx.elem), package$.MODULE$.min(this.col$2 + this.w$2, this.$outer.width())).withFilter((Function1)new TextBuffer$$anonfun$fill$1$$anonfun$apply$mcVI$sp$2(this, line, bx)).foreach((Function1)new TextBuffer$$anonfun$fill$1$$anonfun$apply$mcVI$sp$3(this, line, lineColor, bx)); } public final class TextBuffer$$anonfun$fill$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int[] line$3; private final IntRef bx$2; public final boolean apply(int x) { return apply$mcZI$sp(x); } public boolean apply$mcZI$sp(int x) { return (this.bx$2.elem < this.line$3.length); } public TextBuffer$$anonfun$fill$1$$anonfun$apply$mcVI$sp$2(TextBuffer$$anonfun$fill$1 $outer, int[] line$3, IntRef bx$2) {} } public final class TextBuffer$$anonfun$fill$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int[] line$3; private final short[] lineColor$3; private final IntRef bx$2; public final void apply(int x) { apply$mcVI$sp(x); }
/*     */       public TextBuffer$$anonfun$fill$1$$anonfun$apply$mcVI$sp$3(TextBuffer$$anonfun$fill$1 $outer, int[] line$3, short[] lineColor$3, IntRef bx$2) {}
/*     */       public void apply$mcVI$sp(int x) { this.$outer.changed$3.elem = (this.$outer.changed$3.elem || this.line$3[this.bx$2.elem] != this.$outer.c$1 || this.lineColor$3[this.bx$2.elem] != this.$outer.li$cil$oc$util$TextBuffer$$anonfun$$$outer().li$cil$oc$util$TextBuffer$$packed()); this.$outer.li$cil$oc$util$TextBuffer$$anonfun$$$outer().li$cil$oc$util$TextBuffer$$setChar(this.line$3, this.lineColor$3, this.bx$2.elem, this.$outer.c$1); this.bx$2.elem += package$.MODULE$.max(1, FontUtils$.MODULE$.wcwidth(this.$outer.c$1)); } } }
/* 168 */   public boolean copy(int col, int row, int w, int h, int tx, int ty) { Tuple2 tuple22; if (w <= 0 || h <= 0) return false; 
/* 169 */     if (tx == 0 && ty == 0) return false;
/*     */ 
/*     */ 
/*     */     
/* 173 */     Tuple2.mcII.sp sp = new Tuple2.mcII.sp(package$.MODULE$.max(0, package$.MODULE$.min(width() - 1, col + tx + w - 1)), package$.MODULE$.max(0, package$.MODULE$.min(width(), col + tx)));
/* 174 */     if (tx > 0) { Tuple2.mcII.sp sp1 = sp; }
/* 175 */     else { tuple22 = sp.swap$mcII$sp(); }
/*     */      Tuple2 tuple21 = tuple22; if (tuple21 != null)
/* 177 */     { Tuple2 tuple24; int dx0 = tuple21._1$mcI$sp(), dx1 = tuple21._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(dx0, dx1), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp(); int left_edge = package$.MODULE$.min(i, j) - 1;
/* 178 */       if (left_edge >= width() - 1) return false; 
/* 179 */       Tuple2.mcII.sp sp3 = new Tuple2.mcII.sp(package$.MODULE$.max(0, package$.MODULE$.min(height() - 1, row + ty + h - 1)), package$.MODULE$.max(0, package$.MODULE$.min(height(), row + ty)));
/* 180 */       if (ty > 0) { Tuple2.mcII.sp sp4 = sp3; }
/* 181 */       else { tuple24 = sp3.swap$mcII$sp(); }
/*     */        Tuple2 tuple23 = tuple24; if (tuple23 != null)
/* 183 */       { int dy0 = tuple23._1$mcI$sp(), dy1 = tuple23._2$mcI$sp(); Tuple2.mcII.sp sp5 = new Tuple2.mcII.sp(dy0, dy1), sp4 = sp5; int k = sp4._1$mcI$sp(), m = sp4._2$mcI$sp(); Tuple2.mcII.sp sp6 = new Tuple2.mcII.sp((tx > 0) ? -1 : 1, (ty > 0) ? -1 : 1); if (sp6 != null) { int sx = sp6._1$mcI$sp(), sy = sp6._2$mcI$sp(); Tuple2.mcII.sp sp8 = new Tuple2.mcII.sp(sx, sy), sp7 = sp8; int n = sp7._1$mcI$sp(), i1 = sp7._2$mcI$sp();
/*     */           
/* 185 */           BooleanRef changed = BooleanRef.create(false); RichInt$.MODULE$
/* 186 */             .to$extension0(Predef$.MODULE$.intWrapper(k), m).by(i1).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$copy$1(this, tx, ty, i, j, left_edge, n, changed));
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
/* 213 */           return changed.elem; }  throw new MatchError(sp6); }  throw new MatchError(tuple23); }  throw new MatchError(tuple21); } public final class TextBuffer$$anonfun$copy$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final int tx$1; private final int ty$1; private final int dx0$1; private final int dx1$1; private final int left_edge$1; private final int sx$1; public final BooleanRef changed$4; public final void apply(int ny) { apply$mcVI$sp(ny); } public TextBuffer$$anonfun$copy$1(TextBuffer $outer, int tx$1, int ty$1, int dx0$1, int dx1$1, int left_edge$1, int sx$1, BooleanRef changed$4) {} public void apply$mcVI$sp(int ny) { int[] nl = this.$outer.buffer()[ny]; short[] nc = this.$outer.color()[ny]; int i = ny - this.ty$1; switch (i) {  }  if (i >= 0 && i < this.$outer.height()) { int[] ol = this.$outer.buffer()[i]; short[] oc = this.$outer.color()[i]; RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(this.dx0$1), this.dx1$1).by(this.sx$1).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$copy$1$$anonfun$apply$mcVI$sp$4(this, nl, nc, ol, oc)); if (this.left_edge$1 >= 0 && FontUtils$.MODULE$.wcwidth(nl[this.left_edge$1]) > 1) { nl[this.left_edge$1] = 32; this.changed$4.elem = true; }  }  } public final class TextBuffer$$anonfun$copy$1$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int[] nl$1; public final short[] nc$1; private final int[] ol$1; public final short[] oc$1; public final void apply(int nx) { apply$mcVI$sp(nx); } public void apply$mcVI$sp(int nx) { int i = nx - this.$outer.tx$1; switch (i) {  }  if (i >= 0 && i < this.$outer.li$cil$oc$util$TextBuffer$$anonfun$$$outer().width()) { this.$outer.changed$4.elem = (this.$outer.changed$4.elem || this.nl$1[nx] != this.ol$1[i] || this.nc$1[nx] != this.oc$1[i]); this.nl$1[nx] = this.ol$1[i]; this.nc$1[nx] = this.oc$1[i]; RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(1), FontUtils$.MODULE$.wcwidth(this.nl$1[nx])).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$copy$1$$anonfun$apply$mcVI$sp$4$$anonfun$apply$mcVI$sp$5(this, nx)); }  } public TextBuffer$$anonfun$copy$1$$anonfun$apply$mcVI$sp$4(TextBuffer$$anonfun$copy$1 $outer, int[] nl$1, short[] nc$1, int[] ol$1, short[] oc$1) {} public final class TextBuffer$$anonfun$copy$1$$anonfun$apply$mcVI$sp$4$$anonfun$apply$mcVI$sp$5 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */         public static final long serialVersionUID = 0L; private final int nx$1; public final void apply(int offset) { apply$mcVI$sp(offset); } public TextBuffer$$anonfun$copy$1$$anonfun$apply$mcVI$sp$4$$anonfun$apply$mcVI$sp$5(TextBuffer$$anonfun$copy$1$$anonfun$apply$mcVI$sp$4 $outer, int nx$1) {}
/*     */         public void apply$mcVI$sp(int offset) { this.$outer.nl$1[this.nx$1 + offset] = 32; this.$outer.nc$1[this.nx$1 + offset] = this.$outer.oc$1[this.nx$1]; } } } }
/* 218 */   public boolean rawcopy(int col, int row, int w, int h, TextBuffer src, int fromCol, int fromRow) { BooleanRef changed = BooleanRef.create(false);
/* 219 */     int col_index = col - 1;
/* 220 */     int row_index = row - 1; RichInt$.MODULE$
/* 221 */       .until$extension0(Predef$.MODULE$.intWrapper(0), h).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$rawcopy$1(this, w, src, fromCol, fromRow, changed, col_index, row_index));
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
/* 242 */     return changed.elem; } public final class TextBuffer$$anonfun$rawcopy$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int w$1; public final TextBuffer src$1; public final int fromCol$1; public final int fromRow$1; public final BooleanRef changed$5; public final int col_index$1; private final int row_index$1; public final void apply(int yOffset) { apply$mcVI$sp(yOffset); } public TextBuffer$$anonfun$rawcopy$1(TextBuffer $outer, int w$1, TextBuffer src$1, int fromCol$1, int fromRow$1, BooleanRef changed$5, int col_index$1, int row_index$1) {} public void apply$mcVI$sp(int yOffset) { int[] dstCharLine = this.$outer.buffer()[this.row_index$1 + yOffset]; short[] dstColorLine = this.$outer.color()[this.row_index$1 + yOffset]; RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.w$1).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$rawcopy$1$$anonfun$apply$mcVI$sp$6(this, dstCharLine, dstColorLine, yOffset)); } public final class TextBuffer$$anonfun$rawcopy$1$$anonfun$apply$mcVI$sp$6 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int[] dstCharLine$1; private final short[] dstColorLine$1; private final int yOffset$1; public final void apply(int xOffset) { apply$mcVI$sp(xOffset); } public TextBuffer$$anonfun$rawcopy$1$$anonfun$apply$mcVI$sp$6(TextBuffer$$anonfun$rawcopy$1 $outer, int[] dstCharLine$1, short[] dstColorLine$1, int yOffset$1) {}
/*     */       public void apply$mcVI$sp(int xOffset) { // Byte code:
/*     */         //   0: aload_0
/*     */         //   1: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   4: getfield src$1 : Lli/cil/oc/util/TextBuffer;
/*     */         //   7: invokevirtual buffer : ()[[I
/*     */         //   10: aload_0
/*     */         //   11: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   14: getfield fromRow$1 : I
/*     */         //   17: aload_0
/*     */         //   18: getfield yOffset$1 : I
/*     */         //   21: iadd
/*     */         //   22: iconst_1
/*     */         //   23: isub
/*     */         //   24: aaload
/*     */         //   25: aload_0
/*     */         //   26: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   29: getfield fromCol$1 : I
/*     */         //   32: iload_1
/*     */         //   33: iadd
/*     */         //   34: iconst_1
/*     */         //   35: isub
/*     */         //   36: iaload
/*     */         //   37: istore_2
/*     */         //   38: aload_0
/*     */         //   39: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   42: getfield src$1 : Lli/cil/oc/util/TextBuffer;
/*     */         //   45: invokevirtual color : ()[[S
/*     */         //   48: aload_0
/*     */         //   49: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   52: getfield fromRow$1 : I
/*     */         //   55: aload_0
/*     */         //   56: getfield yOffset$1 : I
/*     */         //   59: iadd
/*     */         //   60: iconst_1
/*     */         //   61: isub
/*     */         //   62: aaload
/*     */         //   63: aload_0
/*     */         //   64: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   67: getfield fromCol$1 : I
/*     */         //   70: iload_1
/*     */         //   71: iadd
/*     */         //   72: iconst_1
/*     */         //   73: isub
/*     */         //   74: saload
/*     */         //   75: istore_3
/*     */         //   76: aload_0
/*     */         //   77: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   80: invokevirtual li$cil$oc$util$TextBuffer$$anonfun$$$outer : ()Lli/cil/oc/util/TextBuffer;
/*     */         //   83: invokevirtual format : ()Lli/cil/oc/util/PackedColor$ColorFormat;
/*     */         //   86: invokeinterface depth : ()Lli/cil/oc/api/internal/TextBuffer$ColorDepth;
/*     */         //   91: aload_0
/*     */         //   92: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   95: getfield src$1 : Lli/cil/oc/util/TextBuffer;
/*     */         //   98: invokevirtual format : ()Lli/cil/oc/util/PackedColor$ColorFormat;
/*     */         //   101: invokeinterface depth : ()Lli/cil/oc/api/internal/TextBuffer$ColorDepth;
/*     */         //   106: astore #4
/*     */         //   108: dup
/*     */         //   109: ifnonnull -> 121
/*     */         //   112: pop
/*     */         //   113: aload #4
/*     */         //   115: ifnull -> 214
/*     */         //   118: goto -> 129
/*     */         //   121: aload #4
/*     */         //   123: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   126: ifne -> 214
/*     */         //   129: new li/cil/oc/util/PackedColor$Color
/*     */         //   132: dup
/*     */         //   133: getstatic li/cil/oc/util/PackedColor$.MODULE$ : Lli/cil/oc/util/PackedColor$;
/*     */         //   136: iload_3
/*     */         //   137: aload_0
/*     */         //   138: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   141: getfield src$1 : Lli/cil/oc/util/TextBuffer;
/*     */         //   144: invokevirtual format : ()Lli/cil/oc/util/PackedColor$ColorFormat;
/*     */         //   147: invokevirtual unpackForeground : (SLli/cil/oc/util/PackedColor$ColorFormat;)I
/*     */         //   150: getstatic li/cil/oc/util/PackedColor$Color$.MODULE$ : Lli/cil/oc/util/PackedColor$Color$;
/*     */         //   153: invokevirtual apply$default$2 : ()Z
/*     */         //   156: invokespecial <init> : (IZ)V
/*     */         //   159: astore #5
/*     */         //   161: new li/cil/oc/util/PackedColor$Color
/*     */         //   164: dup
/*     */         //   165: getstatic li/cil/oc/util/PackedColor$.MODULE$ : Lli/cil/oc/util/PackedColor$;
/*     */         //   168: iload_3
/*     */         //   169: aload_0
/*     */         //   170: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   173: getfield src$1 : Lli/cil/oc/util/TextBuffer;
/*     */         //   176: invokevirtual format : ()Lli/cil/oc/util/PackedColor$ColorFormat;
/*     */         //   179: invokevirtual unpackBackground : (SLli/cil/oc/util/PackedColor$ColorFormat;)I
/*     */         //   182: getstatic li/cil/oc/util/PackedColor$Color$.MODULE$ : Lli/cil/oc/util/PackedColor$Color$;
/*     */         //   185: invokevirtual apply$default$2 : ()Z
/*     */         //   188: invokespecial <init> : (IZ)V
/*     */         //   191: astore #6
/*     */         //   193: getstatic li/cil/oc/util/PackedColor$.MODULE$ : Lli/cil/oc/util/PackedColor$;
/*     */         //   196: aload #5
/*     */         //   198: aload #6
/*     */         //   200: aload_0
/*     */         //   201: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   204: invokevirtual li$cil$oc$util$TextBuffer$$anonfun$$$outer : ()Lli/cil/oc/util/TextBuffer;
/*     */         //   207: invokevirtual format : ()Lli/cil/oc/util/PackedColor$ColorFormat;
/*     */         //   210: invokevirtual pack : (Lli/cil/oc/util/PackedColor$Color;Lli/cil/oc/util/PackedColor$Color;Lli/cil/oc/util/PackedColor$ColorFormat;)S
/*     */         //   213: istore_3
/*     */         //   214: iload_2
/*     */         //   215: aload_0
/*     */         //   216: getfield dstCharLine$1 : [I
/*     */         //   219: aload_0
/*     */         //   220: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   223: getfield col_index$1 : I
/*     */         //   226: iload_1
/*     */         //   227: iadd
/*     */         //   228: iaload
/*     */         //   229: if_icmpne -> 250
/*     */         //   232: iload_3
/*     */         //   233: aload_0
/*     */         //   234: getfield dstColorLine$1 : [S
/*     */         //   237: aload_0
/*     */         //   238: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   241: getfield col_index$1 : I
/*     */         //   244: iload_1
/*     */         //   245: iadd
/*     */         //   246: saload
/*     */         //   247: if_icmpeq -> 291
/*     */         //   250: aload_0
/*     */         //   251: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   254: getfield changed$5 : Lscala/runtime/BooleanRef;
/*     */         //   257: iconst_1
/*     */         //   258: putfield elem : Z
/*     */         //   261: aload_0
/*     */         //   262: getfield dstCharLine$1 : [I
/*     */         //   265: aload_0
/*     */         //   266: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   269: getfield col_index$1 : I
/*     */         //   272: iload_1
/*     */         //   273: iadd
/*     */         //   274: iload_2
/*     */         //   275: iastore
/*     */         //   276: aload_0
/*     */         //   277: getfield dstColorLine$1 : [S
/*     */         //   280: aload_0
/*     */         //   281: getfield $outer : Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1;
/*     */         //   284: getfield col_index$1 : I
/*     */         //   287: iload_1
/*     */         //   288: iadd
/*     */         //   289: iload_3
/*     */         //   290: sastore
/*     */         //   291: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #225	-> 0
/*     */         //   #226	-> 38
/*     */         //   #228	-> 76
/*     */         //   #229	-> 129
/*     */         //   #230	-> 161
/*     */         //   #231	-> 193
/*     */         //   #234	-> 214
/*     */         //   #235	-> 250
/*     */         //   #236	-> 261
/*     */         //   #237	-> 276
/*     */         //   #224	-> 291
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	292	0	this	Lli/cil/oc/util/TextBuffer$$anonfun$rawcopy$1$$anonfun$apply$mcVI$sp$6;
/*     */         //   0	292	1	xOffset	I
/*     */         //   38	254	2	srcChar	I
/*     */         //   76	216	3	srcColor	S
/*     */         //   161	53	5	fg	Lli/cil/oc/util/PackedColor$Color;
/*     */         //   193	21	6	bg	Lli/cil/oc/util/PackedColor$Color; } } }
/* 246 */   public void li$cil$oc$util$TextBuffer$$setChar(int[] line, short[] lineColor, int x, int c) { if (FontUtils$.MODULE$.wcwidth(c) > 1 && x >= line.length - 1) {
/*     */       return;
/*     */     }
/*     */     
/* 250 */     line[x] = c;
/* 251 */     lineColor[x] = li$cil$oc$util$TextBuffer$$packed(); RichInt$.MODULE$
/* 252 */       .until$extension0(Predef$.MODULE$.intWrapper(x + 1), x + FontUtils$.MODULE$.wcwidth(c)).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$li$cil$oc$util$TextBuffer$$setChar$1(this, line, lineColor));
/*     */ 
/*     */ 
/*     */     
/* 256 */     if (x > 0 && FontUtils$.MODULE$.wcwidth(line[x - 1]) > 1)
/*     */     {
/* 258 */       line[x - 1] = 32;
/*     */     } } public final class TextBuffer$$anonfun$li$cil$oc$util$TextBuffer$$setChar$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$1; private final short[] lineColor$1; public final void apply(int x1) { apply$mcVI$sp(x1); }
/*     */     public TextBuffer$$anonfun$li$cil$oc$util$TextBuffer$$setChar$1(TextBuffer $outer, int[] line$1, short[] lineColor$1) {}
/*     */     public void apply$mcVI$sp(int x1) { this.line$1[x1] = 32;
/*     */       this.lineColor$1[x1] = this.$outer.li$cil$oc$util$TextBuffer$$packed(); } }
/* 263 */   public void load(NBTTagCompound nbt) { int maxResolution = package$.MODULE$.max(((Tuple2)Predef$.MODULE$.refArrayOps((Object[])Settings$.MODULE$.screenResolutionsByTier()).last())._1$mcI$sp(), ((Tuple2)Predef$.MODULE$.refArrayOps((Object[])Settings$.MODULE$.screenResolutionsByTier()).last())._2$mcI$sp());
/* 264 */     int w = RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(nbt.func_74762_e("width")), maxResolution)), 1);
/* 265 */     int h = RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(nbt.func_74762_e("height")), maxResolution)), 1);
/* 266 */     size_$eq((Tuple2<Object, Object>)new Tuple2.mcII.sp(w, h));
/*     */     
/* 268 */     NBTTagList b = nbt.func_150295_c("buffer", 8); RichInt$.MODULE$
/* 269 */       .until$extension0(Predef$.MODULE$.intWrapper(0), package$.MODULE$.min(h, b.func_74745_c())).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$load$1(this, b));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 279 */     li.cil.oc.api.internal.TextBuffer.ColorDepth depth = li.cil.oc.api.internal.TextBuffer.ColorDepth.values()[RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(nbt.func_74762_e("depth")), (li.cil.oc.api.internal.TextBuffer.ColorDepth.values()).length - 1)), 0)];
/* 280 */     li$cil$oc$util$TextBuffer$$_format_$eq(PackedColor.Depth$.MODULE$.format(depth));
/* 281 */     li$cil$oc$util$TextBuffer$$_format().load(nbt);
/* 282 */     foreground_$eq(new PackedColor.Color(nbt.func_74762_e("foreground"), nbt.func_74767_n("foregroundIsPalette")));
/* 283 */     background_$eq(new PackedColor.Color(nbt.func_74762_e("background"), nbt.func_74767_n("backgroundIsPalette")));
/*     */     
/* 285 */     if (!NbtDataStream$.MODULE$.getShortArray(nbt, "colors", color(), w, h))
/* 286 */       NbtDataStream$.MODULE$.getIntArrayLegacy(nbt, "color", color(), w, h);  } public final class TextBuffer$$anonfun$load$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagList b$1; public final void apply(int i) { apply$mcVI$sp(i); } public TextBuffer$$anonfun$load$1(TextBuffer $outer, NBTTagList b$1) {}
/*     */     public void apply$mcVI$sp(int i) { String value = this.b$1.func_150307_f(i); PrimitiveIterator.OfInt valueIt = value.codePoints().iterator(); int j = 0; while (j < (this.$outer.buffer()[i]).length && valueIt.hasNext()) {
/*     */         this.$outer.buffer()[i][j] = valueIt.nextInt(); j++;
/*     */       }  } }
/* 291 */   public void save(NBTTagCompound nbt) { nbt.func_74768_a("width", width());
/* 292 */     nbt.func_74768_a("height", height());
/*     */     
/* 294 */     NBTTagList b = new NBTTagList(); RichInt$.MODULE$
/* 295 */       .until$extension0(Predef$.MODULE$.intWrapper(0), height()).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$save$1(this, b));
/*     */ 
/*     */     
/* 298 */     nbt.func_74782_a("buffer", (NBTBase)b);
/*     */     
/* 300 */     nbt.func_74768_a("depth", li$cil$oc$util$TextBuffer$$_format().depth().ordinal());
/* 301 */     li$cil$oc$util$TextBuffer$$_format().save(nbt);
/* 302 */     nbt.func_74768_a("foreground", _foreground().value());
/* 303 */     nbt.func_74757_a("foregroundIsPalette", _foreground().isPalette());
/* 304 */     nbt.func_74768_a("background", _background().value());
/* 305 */     nbt.func_74757_a("backgroundIsPalette", _background().isPalette());
/*     */     
/* 307 */     NbtDataStream$.MODULE$.setShortArray(nbt, "colors", (short[])Predef$.MODULE$.shortArrayOps((short[])Predef$.MODULE$.refArrayOps((Object[])color()).flatten((Function1)new TextBuffer$$anonfun$save$2(this), ClassTag$.MODULE$.Short())).map((Function1)new TextBuffer$$anonfun$save$3(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Short()))); } public final class TextBuffer$$anonfun$save$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList b$2; public final void apply(int i) { apply$mcVI$sp(i); } public TextBuffer$$anonfun$save$1(TextBuffer $outer, NBTTagList b$2) {} public void apply$mcVI$sp(int i) { this.b$2.func_74742_a((NBTBase)new NBTTagString(this.$outer.lineToString(i))); } } public final class TextBuffer$$anonfun$save$2 extends AbstractFunction1<short[], WrappedArray<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final WrappedArray<Object> apply(short[] xs) { return Predef$.MODULE$.wrapShortArray(xs); } public TextBuffer$$anonfun$save$2(TextBuffer $outer) {} } public final class TextBuffer$$anonfun$save$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final short apply(short x$6) { return x$6; }
/*     */     
/*     */     public TextBuffer$$anonfun$save$3(TextBuffer $outer) {} }
/*     */   
/* 311 */   public String lineToString(int y) { StringBuilder b = new StringBuilder();
/* 312 */     if ((buffer()).length > 0) RichInt$.MODULE$
/* 313 */         .until$extension0(Predef$.MODULE$.intWrapper(0), width()).foreach((Function1)new TextBuffer$$anonfun$lineToString$1(this, y, b));
/*     */ 
/*     */ 
/*     */     
/* 317 */     return b.toString(); } public final class TextBuffer$$anonfun$lineToString$1 extends AbstractFunction1<Object, StringBuilder> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int y$1; private final StringBuilder b$3; public TextBuffer$$anonfun$lineToString$1(TextBuffer $outer, int y$1, StringBuilder b$3) {} public final StringBuilder apply(int x) {
/*     */       return this.b$3.appendCodePoint(this.$outer.buffer()[this.y$1][x]);
/*     */     } } public String toString() {
/* 321 */     StringBuilder b = new StringBuilder();
/* 322 */     if ((buffer()).length > 0) { RichInt$.MODULE$
/* 323 */         .until$extension0(Predef$.MODULE$.intWrapper(0), width()).foreach((Function1)new TextBuffer$$anonfun$toString$2(this, b)); RichInt$.MODULE$
/*     */ 
/*     */         
/* 326 */         .until$extension0(Predef$.MODULE$.intWrapper(1), height()).foreach$mVc$sp((Function1)new TextBuffer$$anonfun$toString$1(this, b)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 333 */     return b.toString();
/*     */   }
/*     */   
/*     */   public final class TextBuffer$$anonfun$toString$2 extends AbstractFunction1<Object, StringBuilder> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final StringBuilder b$4;
/*     */     
/*     */     public TextBuffer$$anonfun$toString$2(TextBuffer $outer, StringBuilder b$4) {}
/*     */     
/*     */     public final StringBuilder apply(int x) {
/*     */       return this.b$4.appendCodePoint(this.$outer.buffer()[0][x]);
/*     */     }
/*     */   }
/*     */   
/*     */   public final class TextBuffer$$anonfun$toString$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final StringBuilder b$4;
/*     */     
/*     */     public final void apply(int y) {
/*     */       apply$mcVI$sp(y);
/*     */     }
/*     */     
/*     */     public TextBuffer$$anonfun$toString$1(TextBuffer $outer, StringBuilder b$4) {}
/*     */     
/*     */     public void apply$mcVI$sp(int y) {
/*     */       this.b$4.append('\n');
/*     */       RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.$outer.width()).foreach((Function1)new TextBuffer$$anonfun$toString$1$$anonfun$apply$mcVI$sp$7(this, y));
/*     */     }
/*     */     
/*     */     public final class TextBuffer$$anonfun$toString$1$$anonfun$apply$mcVI$sp$7 extends AbstractFunction1<Object, StringBuilder> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final int y$2;
/*     */       
/*     */       public TextBuffer$$anonfun$toString$1$$anonfun$apply$mcVI$sp$7(TextBuffer$$anonfun$toString$1 $outer, int y$2) {}
/*     */       
/*     */       public final StringBuilder apply(int x) {
/*     */         return this.$outer.b$4.appendCodePoint(this.$outer.li$cil$oc$util$TextBuffer$$anonfun$$$outer().buffer()[this.y$2][x]);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\TextBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */