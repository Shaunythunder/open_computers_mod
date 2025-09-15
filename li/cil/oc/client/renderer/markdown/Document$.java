/*     */ package li.cil.oc.client.renderer.markdown;
/*     */ import li.cil.oc.client.renderer.markdown.segment.Segment;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Serializable;
/*     */ import scala.util.matching.Regex;
/*     */ public final class Document$ { public static final Document$ MODULE$; private final Tuple2<Regex, Function2<Segment, Regex.Match, Segment>>[] segmentTypes;
/*     */   public final class Document$$anonfun$1 extends AbstractFunction1<String, TextSegment> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final TextSegment apply(String line) {
/*     */       return new TextSegment(null, (String)scala.Option$.MODULE$.apply(line).fold((Function0)new Document$$anonfun$1$$anonfun$apply$1(this), (Function1)new Document$$anonfun$1$$anonfun$apply$2(this)));
/*     */     }
/*     */     public final class Document$$anonfun$1$$anonfun$apply$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L;
/*     */       public final String apply() {
/*     */         return "";
/*     */       }
/*     */       
/*     */       public Document$$anonfun$1$$anonfun$apply$1(Document$$anonfun$1 $outer) {} }
/*     */     
/*     */     public final class Document$$anonfun$1$$anonfun$apply$2 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final String apply(String x$1) {
/*     */         return (String)(new StringOps(scala.Predef$.MODULE$.augmentString((String)(new StringOps(scala.Predef$.MODULE$.augmentString((String)(new StringOps(scala.Predef$.MODULE$.augmentString(x$1))).reverse()))).dropWhile((Function1)new Document$$anonfun$1$$anonfun$apply$2$$anonfun$apply$3(this))))).reverse();
/*     */       }
/*     */       
/*     */       public Document$$anonfun$1$$anonfun$apply$2(Document$$anonfun$1 $outer) {}
/*     */       
/*     */       public final class Document$$anonfun$1$$anonfun$apply$2$$anonfun$apply$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */         
/*     */         public final boolean apply(char x$2) {
/*     */           return scala.runtime.RichChar$.MODULE$.isWhitespace$extension(scala.Predef$.MODULE$.charWrapper(x$2));
/*     */         }
/*     */         
/*     */         public Document$$anonfun$1$$anonfun$apply$2$$anonfun$apply$3(Document$$anonfun$1$$anonfun$apply$2 $outer) {} } } }
/*     */   
/*  34 */   public Segment parse(Iterable document) { ObjectRef segments = ObjectRef.create(document.map((Function1)new Document$$anonfun$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()));
/*  35 */     scala.Predef$.MODULE$.refArrayOps((Object[])segmentTypes()).withFilter((Function1)new Document$$anonfun$parse$1()).foreach((Function1)new Document$$anonfun$parse$2(segments));
/*     */ 
/*     */     
/*  38 */     ((Iterable)segments.elem).sliding(2).withFilter((Function1)new Document$$anonfun$parse$3()).foreach((Function1)new Document$$anonfun$parse$4());
/*     */ 
/*     */     
/*  41 */     return (Segment)((Iterable)segments.elem).head(); }
/*     */   public final class Document$$anonfun$parse$1 extends AbstractFunction1<Tuple2<Regex, Function2<Segment, Regex.Match, Segment>>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*  48 */       return bool; } } public int height(Segment document, int maxWidth, FontRenderer renderer) { int currentX = 0;
/*  49 */     int currentY = 0;
/*  50 */     Segment segment = document; while (true)
/*  51 */     { if (segment == null)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  56 */         return currentY; }  currentY += segment.nextY(currentX, maxWidth, renderer); currentX = segment.nextX(currentX, maxWidth, renderer); segment = segment.next(); }  } public final class Document$$anonfun$parse$2 extends AbstractFunction1<Tuple2<Regex, Function2<Segment, Regex.Match, Segment>>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ObjectRef segments$1; public final void apply(Tuple2 x$4) { Tuple2 tuple2 = x$4; if (tuple2 != null) { Regex pattern = (Regex)tuple2._1(); Function2 factory = (Function2)tuple2._2(); this.segments$1.elem = ((Iterable)this.segments$1.elem).flatMap((Function1)new Document$$anonfun$parse$2$$anonfun$apply$4(this, pattern, factory), scala.collection.Iterable$.MODULE$.canBuildFrom()); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Document$$anonfun$parse$2(ObjectRef segments$1) {} public final class Document$$anonfun$parse$2$$anonfun$apply$4 extends AbstractFunction1<Segment, Iterable<Segment>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final Regex pattern$1; private final Function2 factory$1; public final Iterable<Segment> apply(Segment x$3) { return x$3.refine(this.pattern$1, this.factory$1); } public Document$$anonfun$parse$2$$anonfun$apply$4(Document$$anonfun$parse$2 $outer, Regex pattern$1, Function2 factory$1) {} } } public final class Document$$anonfun$parse$3 extends AbstractFunction1<Iterable<Segment>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Iterable window) { return (window.size() == 2); } } public final class Document$$anonfun$parse$4 extends AbstractFunction1<Iterable<Segment>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final void apply(Iterable window) { ((Segment)window.head()).next_$eq((Segment)window.last()); } }
/*  62 */   public int lineHeight(FontRenderer renderer) { return renderer.field_78288_b + 1; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Option<InteractiveSegment> render(Segment document, int x, int y, int maxWidth, int maxHeight, int yOffset, FontRenderer renderer, int mouseX, int mouseY) {
/*  69 */     Minecraft mc = Minecraft.func_71410_x();
/*     */     
/*  71 */     GL11.glPushAttrib(1048575);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     GL11.glDisable(3008);
/*     */ 
/*     */     
/*  80 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  81 */     GL11.glClear(256);
/*  82 */     GL11.glEnable(2929);
/*  83 */     GL11.glDepthFunc(515);
/*  84 */     GL11.glDepthMask(true);
/*  85 */     GL11.glColorMask(false, false, false, false);
/*     */     
/*  87 */     GL11.glPushMatrix();
/*  88 */     GL11.glTranslatef(0.0F, 0.0F, 300.0F);
/*  89 */     GL11.glBegin(7);
/*  90 */     GL11.glVertex2f(0.0F, y);
/*  91 */     GL11.glVertex2f(mc.field_71443_c, y);
/*  92 */     GL11.glVertex2f(mc.field_71443_c, 0.0F);
/*  93 */     GL11.glVertex2f(0.0F, 0.0F);
/*  94 */     GL11.glVertex2f(0.0F, mc.field_71440_d);
/*  95 */     GL11.glVertex2f(mc.field_71443_c, mc.field_71440_d);
/*  96 */     GL11.glVertex2f(mc.field_71443_c, (y + maxHeight));
/*  97 */     GL11.glVertex2f(0.0F, (y + maxHeight));
/*  98 */     GL11.glEnd();
/*  99 */     GL11.glPopMatrix();
/* 100 */     GL11.glColorMask(true, true, true, true);
/*     */ 
/*     */     
/* 103 */     scala.None$ none$ = scala.None$.MODULE$;
/* 104 */     int indent = 0;
/* 105 */     int currentY = y - yOffset;
/* 106 */     int minY = y - lineHeight(renderer);
/* 107 */     int maxY = y + maxHeight + lineHeight(renderer);
/* 108 */     Segment segment = document; while (true) {
/* 109 */       if (segment == null)
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 119 */         if (mouseX < x || mouseX > x + maxWidth || mouseY < y || mouseY > y + maxHeight) none$ = scala.None$.MODULE$; 
/* 120 */         none$.foreach((Function1)new Document$$anonfun$render$2());
/*     */         
/* 122 */         GL11.glPopAttrib();
/*     */         
/* 124 */         return (Option<InteractiveSegment>)none$; }  int segmentHeight = segment.nextY(indent, maxWidth, renderer); if (currentY + segmentHeight >= minY && currentY <= maxY) { Option result = segment.render(x, currentY, indent, maxWidth, renderer, mouseX, mouseY); Option option1 = none$.orElse((Function0)new Document$$anonfun$render$1(result)); }  currentY += segmentHeight; indent = segment.nextX(indent, maxWidth, renderer); segment = segment.next();
/*     */     } 
/*     */   } public final class Document$$anonfun$render$1 extends AbstractFunction0<Option<InteractiveSegment>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Option result$1; public final Option<InteractiveSegment> apply() { return this.result$1; } public Document$$anonfun$render$1(Option result$1) {} } public final class Document$$anonfun$render$2 extends AbstractFunction1<InteractiveSegment, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(InteractiveSegment x$5) { x$5.notifyHover(); } }
/* 129 */   public HeaderSegment li$cil$oc$client$renderer$markdown$Document$$HeaderSegment(Segment s, Regex.Match m) { return new HeaderSegment(s, m.group(2), m.group(1).length()); }
/*     */    public CodeSegment li$cil$oc$client$renderer$markdown$Document$$CodeSegment(Segment s, Regex.Match m) {
/* 131 */     return new CodeSegment(s, m.group(2));
/*     */   } public LinkSegment li$cil$oc$client$renderer$markdown$Document$$LinkSegment(Segment s, Regex.Match m) {
/* 133 */     return new LinkSegment(s, m.group(1), m.group(2));
/*     */   } public BoldSegment li$cil$oc$client$renderer$markdown$Document$$BoldSegment(Segment s, Regex.Match m) {
/* 135 */     return new BoldSegment(s, m.group(2));
/*     */   } public ItalicSegment li$cil$oc$client$renderer$markdown$Document$$ItalicSegment(Segment s, Regex.Match m) {
/* 137 */     return new ItalicSegment(s, m.group(2));
/*     */   }
/* 139 */   public StrikethroughSegment li$cil$oc$client$renderer$markdown$Document$$StrikethroughSegment(Segment s, Regex.Match m) { return new StrikethroughSegment(s, m.group(1)); }
/*     */   public Segment li$cil$oc$client$renderer$markdown$Document$$ImageSegment(Segment s, Regex.Match m) { 
/*     */     try { TextSegment textSegment;
/* 142 */       Option option = scala.Option$.MODULE$.apply(Manual.imageFor(m.group(2)));
/* 143 */       if (option instanceof Some) { Some some = (Some)option; ImageRenderer renderer = (ImageRenderer)some.x(); RenderSegment renderSegment = new RenderSegment(s, m.group(1), renderer); }
/* 144 */       else { textSegment = new TextSegment(s, (new StringBuilder()).append("No renderer found for: ").append(m.group(2)).toString()); }  }
/*     */     finally { Exception exception; }
/* 146 */      return (Segment)new TextSegment(s, (String)scala.Option$.MODULE$.apply(exception.toString()).getOrElse((Function0)new Document$$anonfun$li$cil$oc$client$renderer$markdown$Document$$ImageSegment$1())); } public final class Document$$anonfun$li$cil$oc$client$renderer$markdown$Document$$ImageSegment$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply() { return "Unknown error."; }
/*     */      }
/*     */ 
/*     */   
/*     */   private Tuple2<Regex, Function2<Segment, Regex.Match, Segment>>[] segmentTypes()
/*     */   {
/* 152 */     return this.segmentTypes;
/* 153 */   } public final class Document$$anonfun$2 extends AbstractFunction2<Segment, Regex.Match, HeaderSegment> implements Serializable { public static final long serialVersionUID = 0L; public final HeaderSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$HeaderSegment(s, m); } } public final class Document$$anonfun$3 extends AbstractFunction2<Segment, Regex.Match, CodeSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 154 */     public final CodeSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$CodeSegment(s, m); } } public final class Document$$anonfun$4 extends AbstractFunction2<Segment, Regex.Match, Segment> implements Serializable { public static final long serialVersionUID = 0L;
/* 155 */     public final Segment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$ImageSegment(s, m); } } public final class Document$$anonfun$5 extends AbstractFunction2<Segment, Regex.Match, LinkSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 156 */     public final LinkSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$LinkSegment(s, m); } } public final class Document$$anonfun$6 extends AbstractFunction2<Segment, Regex.Match, BoldSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 157 */     public final BoldSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$BoldSegment(s, m); } } public final class Document$$anonfun$7 extends AbstractFunction2<Segment, Regex.Match, ItalicSegment> implements Serializable { public static final long serialVersionUID = 0L;
/* 158 */     public final ItalicSegment apply(Segment s, Regex.Match m) { return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$ItalicSegment(s, m); } } public final class Document$$anonfun$8 extends AbstractFunction2<Segment, Regex.Match, StrikethroughSegment> implements Serializable { public static final long serialVersionUID = 0L; public final StrikethroughSegment apply(Segment s, Regex.Match m) {
/* 159 */       return Document$.MODULE$.li$cil$oc$client$renderer$markdown$Document$$StrikethroughSegment(s, m);
/*     */     } } private Document$() {
/* 161 */     MODULE$ = this;
/*     */     (new Tuple2[7])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc((new StringOps(scala.Predef$.MODULE$.augmentString("^(#+)\\s(.*)"))).r()), new Document$$anonfun$2());
/*     */     (new Tuple2[7])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc((new StringOps(scala.Predef$.MODULE$.augmentString("(`)(.*?)\\1"))).r()), new Document$$anonfun$3());
/*     */     (new Tuple2[7])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc((new StringOps(scala.Predef$.MODULE$.augmentString("!\\[([^\\[]*)\\]\\(([^\\)]+)\\)"))).r()), new Document$$anonfun$4());
/*     */     (new Tuple2[7])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc((new StringOps(scala.Predef$.MODULE$.augmentString("\\[([^\\[]+)\\]\\(([^\\)]+)\\)"))).r()), new Document$$anonfun$5());
/*     */     (new Tuple2[7])[4] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc((new StringOps(scala.Predef$.MODULE$.augmentString("(\\*\\*|__)(\\S.*?\\S|$)\\1"))).r()), new Document$$anonfun$6());
/*     */     (new Tuple2[7])[5] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc((new StringOps(scala.Predef$.MODULE$.augmentString("(\\*|_)(\\S.*?\\S|$)\\1"))).r()), new Document$$anonfun$7());
/*     */     (new Tuple2[7])[6] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc((new StringOps(scala.Predef$.MODULE$.augmentString("~~(\\S.*?\\S|$)~~"))).r()), new Document$$anonfun$8());
/*     */     this.segmentTypes = (Tuple2<Regex, Function2<Segment, Regex.Match, Segment>>[])new Tuple2[7];
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\Document$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */