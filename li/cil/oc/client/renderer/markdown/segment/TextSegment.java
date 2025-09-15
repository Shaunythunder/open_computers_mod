/*    */ package li.cil.oc.client.renderer.markdown.segment;@ScalaSignature(bytes = "\006\001\005]c!B\001\003\001\021\001\"a\003+fqR\034VmZ7f]RT!a\001\003\002\017M,w-\\3oi*\021QAB\001\t[\006\0248\016Z8x]*\021q\001C\001\te\026tG-\032:fe*\021\021BC\001\007G2LWM\034;\013\005-a\021AA8d\025\tia\"A\002dS2T\021aD\001\003Y&\0342\001A\t\030!\t\021R#D\001\024\025\005!\022!B:dC2\f\027B\001\f\024\005\031\te.\037*fMB\021\001$G\007\002\005%\021!D\001\002\021\005\006\034\030n\031+fqR\034VmZ7f]RD\001\002\b\001\003\006\004%\tAH\001\007a\006\024XM\034;\004\001U\tq\004\005\002\031A%\021\021E\001\002\b'\026<W.\0328u\021!\031\003A!A!\002\023y\022a\0029be\026tG\017\t\005\tK\001\021)\031!C\001M\005!A/\032=u+\0059\003C\001\025,\035\t\021\022&\003\002+'\0051\001K]3eK\032L!\001L\027\003\rM#(/\0338h\025\tQ3\003\003\0050\001\t\005\t\025!\003(\003\025!X\r\037;!\021\025\t\004\001\"\0013\003\031a\024N\\5u}Q\0311\007N\033\021\005a\001\001\"\002\0171\001\004y\002\"B\0231\001\0049\003\"B\034\001\t\003B\024A\002:f]\022,'\017\006\005:\0213\005J\023,Y!\r\021\"\bP\005\003wM\021aa\0249uS>t\007C\001\r>\023\tq$A\001\nJ]R,'/Y2uSZ,7+Z4nK:$\b\"\002!7\001\004\t\025!\001=\021\005I\021\025BA\"\024\005\rIe\016\036\005\006\013Z\002\r!Q\001\002s\")qI\016a\001\003\0061\021N\0343f]RDQ!\023\034A\002\005\013\001\"\\1y/&$G\017\033\005\006\017Y\002\ra\023\t\003\031Rk\021!\024\006\003\035>\0131aZ;j\025\tI\001K\003\002R%\006IQ.\0338fGJ\fg\r\036\006\002'\006\031a.\032;\n\005Uk%\001\004$p]R\024VM\0343fe\026\024\b\"B,7\001\004\t\025AB7pkN,\007\fC\003Zm\001\007\021)\001\004n_V\034X-\027\005\0067\002!\t\005X\001\007e\0264\027N\\3\025\007uK7\017E\002_M~q!a\0303\017\005\001\034W\"A1\013\005\tl\022A\002\037s_>$h(C\001\025\023\t)7#A\004qC\016\\\027mZ3\n\005\035D'\001C%uKJ\f'\r\\3\013\005\025\034\002\"\0026[\001\004Y\027a\0029biR,'O\034\t\003YFl\021!\034\006\003]>\f\001\"\\1uG\"Lgn\032\006\003aN\tA!\036;jY&\021!/\034\002\006%\026<W\r\037\005\006ij\003\r!^\001\bM\006\034Go\034:z!\025\021bo\b= \023\t98CA\005Gk:\034G/[8oeA\021\021\020 \b\003YjL!a_7\002\013I+w-\032=\n\005ut(!B'bi\016D'BA>n\021\035\t\t\001\001C)\003\007\t!\002\\5oK\"+\027n\0325u)\r\t\025Q\001\005\006\017}\004\ra\023\005\b\003\023\001A\021KA\006\003-\031HO]5oO^KG\r\0365\025\013\005\013i!!\005\t\017\005=\021q\001a\001O\005\t1\017\003\004\b\003\017\001\ra\023\005\b\003+\001A\021CA\f\003\025\031w\016\\8s+\t\tI\002E\002\023u\005Cq!!\b\001\t#\ty\"A\003tG\006dW-\006\002\002\"A!!COA\022!\r\021\022QE\005\004\003O\031\"!\002$m_\006$\bbBA\026\001\021E\021QF\001\007M>\024X.\031;\026\005\005=\002\003BA\031\003wi!!a\r\013\t\005U\022qG\001\005Y\006twM\003\002\002:\005!!.\031<b\023\ra\0231\007\005\b\003\001A\021BA!\0035\021Xm]8mm\026$7i\0347peV\t\021\tC\004\002F\001!I!a\022\002\033I,7o\0347wK\022\0346-\0317f+\t\t\031\003\003\004\002L\001!IAJ\001\017e\026\034x\016\034<fI\032{'/\\1u\021)\ty\005\001EC\002\023%\021\021K\001\024e\026\034x\016\034<fI&sG/\032:bGRLg/Z\013\002s!I\021Q\013\001\t\002\003\006K!O\001\025e\026\034x\016\034<fI&sG/\032:bGRLg/\032\021")
/*    */ public class TextSegment implements BasicTextSegment { private final Segment parent; private final String text;
/*    */   private Option<InteractiveSegment> li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive;
/*    */   private final Set<Object> breaks;
/*    */   private final Set<String> lists;
/*    */   private final String rootPrefix;
/*    */   private Segment next;
/*    */   private volatile byte bitmap$0;
/*    */   
/* 10 */   public final Set<Object> breaks() { return this.breaks; } public final Set<String> lists() { return this.lists; } private String rootPrefix$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.rootPrefix = BasicTextSegment$class.rootPrefix(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.rootPrefix; }  } public String rootPrefix() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? rootPrefix$lzycompute() : this.rootPrefix; } public final void li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$breaks_$eq(Set<Object> x$1) { this.breaks = x$1; } public final void li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$lists_$eq(Set<String> x$1) { this.lists = x$1; } public int nextX(int indent, int maxWidth, FontRenderer renderer) { return BasicTextSegment$class.nextX(this, indent, maxWidth, renderer); } public int nextY(int indent, int maxWidth, FontRenderer renderer) { return BasicTextSegment$class.nextY(this, indent, maxWidth, renderer); } public String toString(Enumeration.Value format) { return BasicTextSegment$class.toString(this, format); } public boolean ignoreLeadingWhitespace() { return BasicTextSegment$class.ignoreLeadingWhitespace(this); } public int maxChars(String s, int maxWidth, int maxLineWidth, FontRenderer renderer) { return BasicTextSegment$class.maxChars(this, s, maxWidth, maxLineWidth, renderer); } public int computeWrapIndent(FontRenderer renderer) { return BasicTextSegment$class.computeWrapIndent(this, renderer); } public Segment next() { return this.next; } public void next_$eq(Segment x$1) { this.next = x$1; } public final Segment root() { return Segment$class.root(this); } public Iterable<String> renderAsText(Enumeration.Value format) { return Segment$class.renderAsText(this, format); } public String toString() { return Segment$class.toString(this); } public boolean isLast() { return Segment$class.isLast(this); } public Segment parent() { return this.parent; } public String text() { return this.text; } public TextSegment(Segment parent, String text) { Segment$class.$init$(this); BasicTextSegment$class.$init$(this); } public final class TextSegment$$anonfun$render$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(char x$1) { return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$1)); } public TextSegment$$anonfun$render$1(TextSegment $outer) {} } public final class TextSegment$$anonfun$render$2 extends AbstractFunction0<Option<InteractiveSegment>> implements Serializable { public static final long serialVersionUID = 0L; public final FontRenderer renderer$1; public final int mouseX$1; public final int mouseY$1; public final IntRef currentX$1; public final IntRef currentY$1; public final String part$1; public final Option<InteractiveSegment> apply() { return (Option<InteractiveSegment>)this.$outer.li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive().fold((Function0)new TextSegment$$anonfun$render$2$$anonfun$apply$1(this), (Function1)new TextSegment$$anonfun$render$2$$anonfun$apply$2(this)); } public TextSegment$$anonfun$render$2(TextSegment $outer, FontRenderer renderer$1, int mouseX$1, int mouseY$1, IntRef currentX$1, IntRef currentY$1, String part$1) {} public final class TextSegment$$anonfun$render$2$$anonfun$apply$1 extends AbstractFunction0<Option<InteractiveSegment>> implements Serializable {
/* 12 */       public static final long serialVersionUID = 0L; public final Option<InteractiveSegment> apply() { return (Option<InteractiveSegment>)None$.MODULE$; } public TextSegment$$anonfun$render$2$$anonfun$apply$1(TextSegment$$anonfun$render$2 $outer) {} } public final class TextSegment$$anonfun$render$2$$anonfun$apply$2 extends AbstractFunction1<InteractiveSegment, Option<InteractiveSegment>> implements Serializable { public static final long serialVersionUID = 0L; public final Option<InteractiveSegment> apply(InteractiveSegment x$2) { return x$2.checkHovered(this.$outer.mouseX$1, this.$outer.mouseY$1, this.$outer.currentX$1.elem, this.$outer.currentY$1.elem, this.$outer.li$cil$oc$client$renderer$markdown$segment$TextSegment$$anonfun$$$outer().stringWidth(this.$outer.part$1, this.$outer.renderer$1), (int)(Document$.MODULE$.lineHeight(this.$outer.renderer$1) * this.$outer.li$cil$oc$client$renderer$markdown$segment$TextSegment$$anonfun$$$outer().li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale())); } public TextSegment$$anonfun$render$2$$anonfun$apply$2(TextSegment$$anonfun$render$2 $outer) {} } } public Option<InteractiveSegment> render(int x, int y, int indent, int maxWidth, FontRenderer renderer, int mouseX, int mouseY) { Option<InteractiveSegment> option; IntRef currentX = IntRef.create(x + indent);
/* 13 */     IntRef currentY = IntRef.create(y);
/* 14 */     String chars = text();
/* 15 */     if (indent == 0) chars = (String)(new StringOps(Predef$.MODULE$.augmentString(chars))).dropWhile((Function1)new TextSegment$$anonfun$render$1(this)); 
/* 16 */     int wrapIndent = computeWrapIndent(renderer);
/* 17 */     int numChars = maxChars(chars, maxWidth - indent, maxWidth - wrapIndent, renderer);
/* 18 */     None$ none$ = None$.MODULE$;
/* 19 */     while (chars.length() > 0) {
/* 20 */       String part = (String)(new StringOps(Predef$.MODULE$.augmentString(chars))).take(numChars);
/* 21 */       option = none$.orElse((Function0)new TextSegment$$anonfun$render$2(this, renderer, mouseX, mouseY, currentX, currentY, part));
/* 22 */       GL11.glPushMatrix();
/* 23 */       GL11.glTranslatef(currentX.elem, currentY.elem, 0.0F);
/* 24 */       GL11.glScalef(li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale(), li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale(), li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale());
/* 25 */       GL11.glTranslatef(-currentX.elem, -currentY.elem, 0.0F);
/* 26 */       renderer.func_78276_b((new StringBuilder()).append(resolvedFormat()).append(part).toString(), currentX.elem, currentY.elem, li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedColor());
/* 27 */       GL11.glPopMatrix();
/* 28 */       currentX.elem = x + wrapIndent;
/* 29 */       currentY.elem += lineHeight(renderer);
/* 30 */       chars = (String)(new StringOps(Predef$.MODULE$.augmentString((String)(new StringOps(Predef$.MODULE$.augmentString(chars))).drop(numChars)))).dropWhile((Function1)new TextSegment$$anonfun$render$3(this));
/* 31 */       numChars = maxChars(chars, maxWidth - wrapIndent, maxWidth - wrapIndent, renderer);
/*    */     } 
/*    */     
/* 34 */     return option; } public final class TextSegment$$anonfun$render$3 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(char x$3) {
/*    */       return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$3));
/*    */     } public TextSegment$$anonfun$render$3(TextSegment $outer) {} } public Iterable<Segment> refine(Regex pattern, Function2 factory) {
/* 38 */     Buffer result = (Buffer)Buffer$.MODULE$.empty();
/*    */ 
/*    */     
/* 41 */     IntRef textStart = IntRef.create(0);
/* 42 */     pattern.findAllMatchIn(text()).foreach((Function1)new TextSegment$$anonfun$refine$1(this, factory, result, textStart));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 54 */     (textStart.elem == 0) ? 
/* 55 */       result.$plus$eq(this) : (
/*    */       
/* 57 */       (textStart.elem < text().length()) ? 
/* 58 */       result.$plus$eq(new TextSegment(this, text().substring(textStart.elem))) : BoxedUnit.UNIT);
/*    */     
/* 60 */     return (Iterable<Segment>)result; } public final class TextSegment$$anonfun$refine$1 extends AbstractFunction1<Regex.Match, Buffer<Segment>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final Function2 factory$1; private final Buffer result$1; private final IntRef textStart$1; public TextSegment$$anonfun$refine$1(TextSegment $outer, Function2 factory$1, Buffer result$1, IntRef textStart$1) {} public final Buffer<Segment> apply(Regex.Match m) { (m.start() > this.textStart$1.elem) ? this.result$1.$plus$eq(new TextSegment(this.$outer, this.$outer.text().substring(this.textStart$1.elem, m.start()))) : BoxedUnit.UNIT;
/*    */       this.textStart$1.elem = m.end();
/*    */       return this.result$1.$plus$eq(this.factory$1.apply(this.$outer, m)); } }
/*    */   public int lineHeight(FontRenderer renderer) {
/* 65 */     return (int)(BasicTextSegment$class.lineHeight(this, renderer) * li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale());
/*    */   } public int stringWidth(String s, FontRenderer renderer) {
/* 67 */     return (int)(renderer.func_78256_a((new StringBuilder()).append(resolvedFormat()).append(s).toString()) * li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale());
/*    */   }
/*    */   
/*    */   public Option<Object> color() {
/* 71 */     return (Option<Object>)None$.MODULE$;
/*    */   } public Option<Object> scale() {
/* 73 */     return (Option<Object>)None$.MODULE$;
/*    */   } public String format() {
/* 75 */     return "";
/*    */   }
/* 77 */   public int li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedColor() { return BoxesRunTime.unboxToInt(color().getOrElse((Function0)new TextSegment$$anonfun$li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedColor$1(this))); } public final class TextSegment$$anonfun$li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedColor$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() { int i; Segment segment = this.$outer.parent();
/* 78 */       if (segment instanceof TextSegment) { TextSegment textSegment = (TextSegment)segment; i = textSegment.li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedColor(); }
/* 79 */       else { i = 14540253; }
/*    */       
/*    */       return i; } public TextSegment$$anonfun$li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedColor$1(TextSegment $outer) {} } public float li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale() { float f;
/* 82 */     Segment segment = parent();
/* 83 */     if (segment instanceof TextSegment) { TextSegment textSegment = (TextSegment)segment; f = BoxesRunTime.unboxToFloat(scale().getOrElse((Function0)new TextSegment$$anonfun$li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale$1(this))) * textSegment.li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale(); }
/* 84 */     else { f = 1.0F; }  return f; } public final class TextSegment$$anonfun$li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale$1 extends AbstractFunction0.mcF.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final float apply() { return apply$mcF$sp(); } public float apply$mcF$sp() { return 1.0F; }
/*    */     public TextSegment$$anonfun$li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedScale$1(TextSegment $outer) {} }
/* 87 */   private String resolvedFormat() { String str; Segment segment = parent();
/* 88 */     if (segment instanceof TextSegment) { TextSegment textSegment = (TextSegment)segment; str = (new StringBuilder()).append(textSegment.resolvedFormat()).append(format()).toString(); }
/* 89 */     else { str = format(); }
/*    */     
/*    */     return str; } private Option li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive$lzycompute() {
/* 92 */     synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { None$ none$; TextSegment textSegment = this;
/* 93 */         if (textSegment instanceof InteractiveSegment) { TextSegment textSegment1 = textSegment; Some some = new Some(textSegment1); }
/* 94 */         else { None$ none$1; Segment segment = parent();
/* 95 */           if (segment instanceof TextSegment) { TextSegment textSegment1 = (TextSegment)segment; Option<InteractiveSegment> option = textSegment1.li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive(); }
/* 96 */           else { none$1 = None$.MODULE$; }
/*    */           
/*    */           none$ = none$1; }
/*    */         
/*    */         this.li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive = (Option<InteractiveSegment>)none$;
/*    */         this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }
/*    */       
/*    */       return this.li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive; }
/*    */   
/*    */   }
/*    */   
/*    */   public Option<InteractiveSegment> li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive() {
/*    */     return ((byte)(this.bitmap$0 & 0x1) == 0) ? li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive$lzycompute() : this.li$cil$oc$client$renderer$markdown$segment$TextSegment$$resolvedInteractive;
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\TextSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */