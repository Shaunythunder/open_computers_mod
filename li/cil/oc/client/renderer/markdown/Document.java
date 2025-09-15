/*     */ package li.cil.oc.client.renderer.markdown;
/*     */ 
/*     */ import li.cil.oc.client.renderer.markdown.segment.InteractiveSegment;
/*     */ import li.cil.oc.client.renderer.markdown.segment.Segment;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import scala.Function2;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.util.matching.Regex;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Ut!B\001\003\021\003y\021\001\003#pGVlWM\034;\013\005\r!\021\001C7be.$wn\0368\013\005\0251\021\001\003:f]\022,'/\032:\013\005\035A\021AB2mS\026tGO\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\001\"\001E\t\016\003\t1QA\005\002\t\002M\021\001\002R8dk6,g\016^\n\003#Q\001\"!\006\r\016\003YQ\021aF\001\006g\016\fG.Y\005\0033Y\021a!\0218z%\0264\007\"B\016\022\t\003a\022A\002\037j]&$h\bF\001\020\021\025q\022\003\"\001 \003\025\001\030M]:f)\t\001c\005\005\002\"I5\t!E\003\002$\005\00591/Z4nK:$\030BA\023#\005\035\031VmZ7f]RDQaJ\017A\002!\n\001\002Z8dk6,g\016\036\t\004S1rS\"\001\026\013\005-2\022AC2pY2,7\r^5p]&\021QF\013\002\t\023R,'/\0312mKB\021qF\r\b\003+AJ!!\r\f\002\rA\023X\rZ3g\023\t\031DG\001\004TiJLgn\032\006\003cYAQAN\t\005\002]\na\001[3jO\"$H\003\002\035<yy\002\"!F\035\n\005i2\"aA%oi\")q%\016a\001A!)Q(\016a\001q\005AQ.\031=XS\022$\b\016C\003\006k\001\007q\b\005\002A\0216\t\021I\003\002C\007\006\031q-^5\013\005\035!%BA#G\003%i\027N\\3de\0064GOC\001H\003\rqW\r^\005\003\023\006\023ABR8oiJ+g\016Z3sKJDQaS\t\005\0021\013!\002\\5oK\"+\027n\0325u)\tAT\nC\003\006\025\002\007q\bC\003P#\021\005\001+\001\004sK:$WM\035\013\013#^C&\fX/`C\n$\007cA\013S)&\0211K\006\002\007\037B$\030n\0348\021\005\005*\026B\001,#\005IIe\016^3sC\016$\030N^3TK\036lWM\034;\t\013\035r\005\031\001\021\t\013es\005\031\001\035\002\003aDQa\027(A\002a\n\021!\037\005\006{9\003\r\001\017\005\006=:\003\r\001O\001\n[\006D\b*Z5hQRDQ\001\031(A\002a\nq!_(gMN,G\017C\003\006\035\002\007q\bC\003d\035\002\007\001(\001\004n_V\034X\r\027\005\006K:\003\r\001O\001\007[>,8/Z-\t\013\035\fB\021\0025\002\033!+\027\rZ3s'\026<W.\0328u)\rIGN\034\t\003C)L!a\033\022\003\033!+\027\rZ3s'\026<W.\0328u\021\025ig\r1\001!\003\005\031\b\"B8g\001\004\001\030!A7\021\005ELhB\001:x\033\005\031(B\001;v\003!i\027\r^2iS:<'B\001<\027\003\021)H/\0337\n\005a\034\030!\002*fO\026D\030B\001>|\005\025i\025\r^2i\025\tA8\017C\003~#\021%a0A\006D_\022,7+Z4nK:$H#B@\002\006\005\035\001cA\021\002\002%\031\0211\001\022\003\027\r{G-Z*fO6,g\016\036\005\006[r\004\r\001\t\005\006_r\004\r\001\035\005\b\003\027\tB\021BA\007\003-a\025N\\6TK\036lWM\034;\025\r\005=\021QCA\f!\r\t\023\021C\005\004\003'\021#a\003'j].\034VmZ7f]RDa!\\A\005\001\004\001\003BB8\002\n\001\007\001\017C\004\002\034E!I!!\b\002\027\t{G\016Z*fO6,g\016\036\013\007\003?\t)#a\n\021\007\005\n\t#C\002\002$\t\0221BQ8mIN+w-\\3oi\"1Q.!\007A\002\001Baa\\A\r\001\004\001\bbBA\026#\021%\021QF\001\016\023R\fG.[2TK\036lWM\034;\025\r\005=\022QGA\034!\r\t\023\021G\005\004\003g\021#!D%uC2L7mU3h[\026tG\017\003\004n\003S\001\r\001\t\005\007_\006%\002\031\0019\t\017\005m\022\003\"\003\002>\005!2\013\036:jW\026$\bN]8vO\"\034VmZ7f]R$b!a\020\002F\005\035\003cA\021\002B%\031\0211\t\022\003)M#(/[6fi\"\024x.^4i'\026<W.\0328u\021\031i\027\021\ba\001A!1q.!\017A\002ADq!a\023\022\t\023\ti%\001\007J[\006<WmU3h[\026tG\017F\003!\003\037\n\t\006\003\004n\003\023\002\r\001\t\005\007_\006%\003\031\0019\t\023\005U\023C1A\005\n\005]\023\001D:fO6,g\016\036+za\026\034XCAA-!\025)\0221LA0\023\r\tiF\006\002\006\003J\024\030-\037\t\b+\005\005\024QMA6\023\r\t\031G\006\002\007)V\004H.\032\032\021\007I\f9'C\002\002jM\024QAU3hKb\004b!FA7AA\004\023bAA8-\tIa)\0368di&|gN\r\005\t\003g\n\002\025!\003\002Z\005i1/Z4nK:$H+\0379fg\002\002")
/*     */ public final class Document {
/*     */   public static Option<InteractiveSegment> render(Segment paramSegment, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, FontRenderer paramFontRenderer, int paramInt6, int paramInt7) {
/*     */     return Document$.MODULE$.render(paramSegment, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramFontRenderer, paramInt6, paramInt7);
/*     */   }
/*     */   
/*     */   public static int lineHeight(FontRenderer paramFontRenderer) {
/*     */     return Document$.MODULE$.lineHeight(paramFontRenderer);
/*     */   }
/*     */   
/*     */   public static int height(Segment paramSegment, int paramInt, FontRenderer paramFontRenderer) {
/*     */     return Document$.MODULE$.height(paramSegment, paramInt, paramFontRenderer);
/*     */   }
/*     */   
/*     */   public static Segment parse(Iterable<String> paramIterable) {
/*     */     return Document$.MODULE$.parse(paramIterable);
/*     */   }
/*     */   
/*     */   public final class Document$$anonfun$1 extends AbstractFunction1<String, TextSegment> implements Serializable {
/*  34 */     public final TextSegment apply(String line) { return new TextSegment(null, (String)Option$.MODULE$.apply(line).fold((Function0)new Document$$anonfun$1$$anonfun$apply$1(this), (Function1)new Document$$anonfun$1$$anonfun$apply$2(this))); } public static final long serialVersionUID = 0L; public final class Document$$anonfun$1$$anonfun$apply$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply() { return ""; } public Document$$anonfun$1$$anonfun$apply$1(Document$$anonfun$1 $outer) {} } public final class Document$$anonfun$1$$anonfun$apply$2 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String x$1) { return (String)(new StringOps(Predef$.MODULE$.augmentString((String)(new StringOps(Predef$.MODULE$.augmentString((String)(new StringOps(Predef$.MODULE$.augmentString(x$1))).reverse()))).dropWhile((Function1)new Document$$anonfun$1$$anonfun$apply$2$$anonfun$apply$3(this))))).reverse(); } public Document$$anonfun$1$$anonfun$apply$2(Document$$anonfun$1 $outer) {} public final class Document$$anonfun$1$$anonfun$apply$2$$anonfun$apply$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(char x$2) { return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$2)); } public Document$$anonfun$1$$anonfun$apply$2$$anonfun$apply$3(Document$$anonfun$1$$anonfun$apply$2 $outer) {} } } } public final class Document$$anonfun$parse$1 extends AbstractFunction1<Tuple2<Regex, Function2<Segment, Regex.Match, Segment>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool;
/*  35 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Document$$anonfun$parse$2 extends AbstractFunction1<Tuple2<Regex, Function2<Segment, Regex.Match, Segment>>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ObjectRef segments$1; public final void apply(Tuple2 x$4) { Tuple2 tuple2 = x$4; if (tuple2 != null) { Regex pattern = (Regex)tuple2._1(); Function2 factory = (Function2)tuple2._2();
/*  36 */         this.segments$1.elem = ((Iterable)this.segments$1.elem).flatMap((Function1)new Document$$anonfun$parse$2$$anonfun$apply$4(this, pattern, factory), Iterable$.MODULE$.canBuildFrom()); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Document$$anonfun$parse$2(ObjectRef segments$1) {} public final class Document$$anonfun$parse$2$$anonfun$apply$4 extends AbstractFunction1<Segment, Iterable<Segment>> implements Serializable { public static final long serialVersionUID = 0L; private final Regex pattern$1; private final Function2 factory$1; public final Iterable<Segment> apply(Segment x$3) { return x$3.refine(this.pattern$1, this.factory$1); }
/*     */        public Document$$anonfun$parse$2$$anonfun$apply$4(Document$$anonfun$parse$2 $outer, Regex pattern$1, Function2 factory$1) {} } } public final class Document$$anonfun$parse$3 extends AbstractFunction1<Iterable<Segment>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  38 */     public final boolean apply(Iterable window) { return (window.size() == 2); } } public final class Document$$anonfun$parse$4 extends AbstractFunction1<Iterable<Segment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Iterable window) {
/*  39 */       ((Segment)window.head()).next_$eq((Segment)window.last());
/*     */     } }
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
/*     */   public final class Document$$anonfun$render$1
/*     */     extends AbstractFunction0<Option<InteractiveSegment>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
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
/*     */     private final Option result$1;
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
/*     */     public final Option<InteractiveSegment> apply() {
/* 113 */       return this.result$1;
/*     */     }
/*     */     public Document$$anonfun$render$1(Option result$1) {} }
/*     */   
/*     */   public final class Document$$anonfun$render$2 extends AbstractFunction1<InteractiveSegment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(InteractiveSegment x$5) {
/* 120 */       x$5.notifyHover();
/*     */     } }
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
/*     */   public final class Document$$anonfun$li$cil$oc$client$renderer$markdown$Document$$ImageSegment$1
/*     */     extends AbstractFunction0<String>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final String apply() {
/* 146 */       return "Unknown error.";
/*     */     }
/*     */   }
/*     */   
/*     */   public final class Document$$anonfun$2 extends AbstractFunction2<Segment, Regex.Match, HeaderSegment> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/* 153 */     public final HeaderSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$HeaderSegment(s, m); } } public final class Document$$anonfun$3 extends AbstractFunction2<Segment, Regex.Match, CodeSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 154 */     public final CodeSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$CodeSegment(s, m); } } public final class Document$$anonfun$4 extends AbstractFunction2<Segment, Regex.Match, Segment> implements Serializable { public static final long serialVersionUID = 0L;
/* 155 */     public final Segment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$ImageSegment(s, m); } } public final class Document$$anonfun$5 extends AbstractFunction2<Segment, Regex.Match, LinkSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 156 */     public final LinkSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$LinkSegment(s, m); } } public final class Document$$anonfun$6 extends AbstractFunction2<Segment, Regex.Match, BoldSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 157 */     public final BoldSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$BoldSegment(s, m); } } public final class Document$$anonfun$7 extends AbstractFunction2<Segment, Regex.Match, ItalicSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 158 */     public final ItalicSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$ItalicSegment(s, m); } } public final class Document$$anonfun$8 extends AbstractFunction2<Segment, Regex.Match, StrikethroughSegment> implements Serializable { public static final long serialVersionUID = 0L; public final StrikethroughSegment apply(Segment s, Regex.Match m) {
/* 159 */       return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$StrikethroughSegment(s, m);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\Document.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */