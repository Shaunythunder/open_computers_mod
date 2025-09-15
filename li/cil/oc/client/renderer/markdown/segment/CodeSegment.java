/*    */ package li.cil.oc.client.renderer.markdown.segment;
/*    */ @ScalaSignature(bytes = "\006\001Q4Q!\001\002\001\tA\0211bQ8eKN+w-\\3oi*\0211\001B\001\bg\026<W.\0328u\025\t)a!\001\005nCJ\\Gm\\<o\025\t9\001\"\001\005sK:$WM]3s\025\tI!\"\001\004dY&,g\016\036\006\003\0271\t!a\\2\013\0055q\021aA2jY*\tq\"\001\002mSN\031\001!E\f\021\005I)R\"A\n\013\003Q\tQa]2bY\006L!AF\n\003\r\005s\027PU3g!\tA\022$D\001\003\023\tQ\"A\001\tCCNL7\rV3yiN+w-\\3oi\"AA\004\001BC\002\023\005a$\001\004qCJ,g\016^\002\001+\005y\002C\001\r!\023\t\t#AA\004TK\036lWM\034;\t\021\r\002!\021!Q\001\n}\tq\001]1sK:$\b\005\003\005&\001\t\025\r\021\"\001'\003\021!X\r\037;\026\003\035\002\"\001K\026\017\005II\023B\001\026\024\003\031\001&/\0323fM&\021A&\f\002\007'R\024\030N\\4\013\005)\032\002\002C\030\001\005\003\005\013\021B\024\002\013Q,\007\020\036\021\t\013E\002A\021\001\032\002\rqJg.\033;?)\r\031D'\016\t\0031\001AQ\001\b\031A\002}AQ!\n\031A\002\035BQa\016\001\005Ba\naA]3oI\026\024H\003C\035@\t\032C%J\026-\021\007IQD(\003\002<'\t1q\n\035;j_:\004\"\001G\037\n\005y\022!AE%oi\026\024\030m\031;jm\026\034VmZ7f]RDQ\001\021\034A\002\005\013\021\001\037\t\003%\tK!aQ\n\003\007%sG\017C\003Fm\001\007\021)A\001z\021\0259e\0071\001B\003\031Ig\016Z3oi\")\021J\016a\001\003\006AQ.\031=XS\022$\b\016C\003\bm\001\0071\n\005\002M)6\tQJ\003\002O\037\006\031q-^5\013\005%\001&BA)S\003%i\027N\\3de\0064GOC\001T\003\rqW\r^\005\003+6\023ABR8oiJ+g\016Z3sKJDQa\026\034A\002\005\013a!\\8vg\026D\006\"B-7\001\004\t\025AB7pkN,\027\fC\003\\\001\021EC,A\fjO:|'/\032'fC\022LgnZ,iSR,7\017]1dKV\tQ\f\005\002\023=&\021ql\005\002\b\005>|G.Z1o\021\025\t\007\001\"\025c\003-\031HO]5oO^KG\r\0365\025\007\005\033W\rC\003eA\002\007q%A\001t\021\0259\001\r1\001L\021\0259\007\001\"\021i\003!!xn\025;sS:<GCA\024j\021\025Qg\r1\001l\003\0311wN]7biB\021A\016\035\b\003[:l\021\001B\005\003_\022\tA\"T1sWV\004hi\034:nCRL!!\035:\003\013Y\013G.^3\n\005M\034\"aC#ok6,'/\031;j_:\004")
/*    */ public class CodeSegment implements BasicTextSegment {
/*    */   private final Segment parent;
/*    */   private final String text;
/*    */   private final Set<Object> breaks;
/*    */   
/*  8 */   public final Set<Object> breaks() { return this.breaks; } private final Set<String> lists; private final String rootPrefix; private Segment next; private volatile boolean bitmap$0; public final Set<String> lists() { return this.lists; } private String rootPrefix$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.rootPrefix = BasicTextSegment$class.rootPrefix(this); this.bitmap$0 = true; }  return this.rootPrefix; }  } public String rootPrefix() { return this.bitmap$0 ? this.rootPrefix : rootPrefix$lzycompute(); } public final void li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$breaks_$eq(Set<Object> x$1) { this.breaks = x$1; } public final void li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$lists_$eq(Set<String> x$1) { this.lists = x$1; } public int nextX(int indent, int maxWidth, FontRenderer renderer) { return BasicTextSegment$class.nextX(this, indent, maxWidth, renderer); } public int nextY(int indent, int maxWidth, FontRenderer renderer) { return BasicTextSegment$class.nextY(this, indent, maxWidth, renderer); } public int lineHeight(FontRenderer renderer) { return BasicTextSegment$class.lineHeight(this, renderer); } public int maxChars(String s, int maxWidth, int maxLineWidth, FontRenderer renderer) { return BasicTextSegment$class.maxChars(this, s, maxWidth, maxLineWidth, renderer); } public int computeWrapIndent(FontRenderer renderer) { return BasicTextSegment$class.computeWrapIndent(this, renderer); } public Segment next() { return this.next; } public void next_$eq(Segment x$1) { this.next = x$1; } public final Segment root() { return Segment$class.root(this); } public Iterable<String> renderAsText(Enumeration.Value format) { return Segment$class.renderAsText(this, format); } public String toString() { return Segment$class.toString(this); } public Iterable<Segment> refine(Regex pattern, Function2 factory) { return Segment$class.refine(this, pattern, factory); } public boolean isLast() { return Segment$class.isLast(this); } public Segment parent() { return this.parent; } public String text() { return this.text; } public CodeSegment(Segment parent, String text) { Segment$class.$init$(this); BasicTextSegment$class.$init$(this); }
/*    */   
/* 10 */   public Option<InteractiveSegment> render(int x, int y, int indent, int maxWidth, FontRenderer renderer, int mouseX, int mouseY) { TextBufferRenderCache$.MODULE$.renderer().generateChars(text().toCharArray());
/*    */     
/* 12 */     int currentX = x + indent;
/* 13 */     int currentY = y;
/* 14 */     String chars = text();
/* 15 */     int wrapIndent = computeWrapIndent(renderer);
/* 16 */     int numChars = maxChars(chars, maxWidth - indent, maxWidth - wrapIndent, renderer);
/* 17 */     while (chars.length() > 0) {
/* 18 */       String part = (String)(new StringOps(Predef$.MODULE$.augmentString(chars))).take(numChars);
/* 19 */       GL11.glColor4f(0.75F, 0.8F, 1.0F, 1.0F);
/* 20 */       TextBufferRenderCache$.MODULE$.renderer().drawString(part, currentX, currentY);
/* 21 */       currentX = x + wrapIndent;
/* 22 */       currentY += lineHeight(renderer);
/* 23 */       chars = (String)(new StringOps(Predef$.MODULE$.augmentString((String)(new StringOps(Predef$.MODULE$.augmentString(chars))).drop(numChars)))).dropWhile((Function1)new CodeSegment$$anonfun$render$1(this));
/* 24 */       numChars = maxChars(chars, maxWidth - wrapIndent, maxWidth - wrapIndent, renderer);
/*    */     } 
/*    */     
/* 27 */     return (Option<InteractiveSegment>)None$.MODULE$; } public final class CodeSegment$$anonfun$render$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(char x$1) { return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$1)); } public CodeSegment$$anonfun$render$1(CodeSegment $outer) {} }
/*    */   public boolean ignoreLeadingWhitespace() {
/* 30 */     return false;
/*    */   } public int stringWidth(String s, FontRenderer renderer) {
/* 32 */     return s.length() * TextBufferRenderCache$.MODULE$.renderer().charRenderWidth();
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
/*    */     //   19: goto -> 84
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 84
/*    */     //   29: new scala/StringContext
/*    */     //   32: dup
/*    */     //   33: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   36: iconst_2
/*    */     //   37: anewarray java/lang/String
/*    */     //   40: dup
/*    */     //   41: iconst_0
/*    */     //   42: ldc '`'
/*    */     //   44: aastore
/*    */     //   45: dup
/*    */     //   46: iconst_1
/*    */     //   47: ldc '`'
/*    */     //   49: aastore
/*    */     //   50: checkcast [Ljava/lang/Object;
/*    */     //   53: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   56: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */     //   59: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   62: iconst_1
/*    */     //   63: anewarray java/lang/Object
/*    */     //   66: dup
/*    */     //   67: iconst_0
/*    */     //   68: aload_0
/*    */     //   69: invokevirtual text : ()Ljava/lang/String;
/*    */     //   72: aastore
/*    */     //   73: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   76: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */     //   79: astore #4
/*    */     //   81: goto -> 168
/*    */     //   84: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*    */     //   87: invokevirtual IGWMod : ()Lscala/Enumeration$Value;
/*    */     //   90: aload_2
/*    */     //   91: astore #5
/*    */     //   93: dup
/*    */     //   94: ifnonnull -> 106
/*    */     //   97: pop
/*    */     //   98: aload #5
/*    */     //   100: ifnull -> 114
/*    */     //   103: goto -> 171
/*    */     //   106: aload #5
/*    */     //   108: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   111: ifeq -> 171
/*    */     //   114: new scala/StringContext
/*    */     //   117: dup
/*    */     //   118: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   121: iconst_2
/*    */     //   122: anewarray java/lang/String
/*    */     //   125: dup
/*    */     //   126: iconst_0
/*    */     //   127: ldc_w '[prefix{1}]'
/*    */     //   130: aastore
/*    */     //   131: dup
/*    */     //   132: iconst_1
/*    */     //   133: ldc_w ' [prefix{}]'
/*    */     //   136: aastore
/*    */     //   137: checkcast [Ljava/lang/Object;
/*    */     //   140: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   143: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */     //   146: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   149: iconst_1
/*    */     //   150: anewarray java/lang/Object
/*    */     //   153: dup
/*    */     //   154: iconst_0
/*    */     //   155: aload_0
/*    */     //   156: invokevirtual text : ()Ljava/lang/String;
/*    */     //   159: aastore
/*    */     //   160: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   163: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */     //   166: astore #4
/*    */     //   168: aload #4
/*    */     //   170: areturn
/*    */     //   171: new scala/MatchError
/*    */     //   174: dup
/*    */     //   175: aload_2
/*    */     //   176: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   179: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #35	-> 2
/*    */     //   #36	-> 84
/*    */     //   #34	-> 168
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	180	0	this	Lli/cil/oc/client/renderer/markdown/segment/CodeSegment;
/*    */     //   0	180	1	format	Lscala/Enumeration$Value;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\CodeSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */