/*    */ package li.cil.oc.util;
/*    */ import scala.Function1;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ public final class Tooltip$ {
/*    */   public static final Tooltip$ MODULE$;
/*    */   private final int li$cil$oc$util$Tooltip$$maxWidth;
/*    */   
/*    */   public int li$cil$oc$util$Tooltip$$maxWidth() {
/* 12 */     return this.li$cil$oc$util$Tooltip$$maxWidth;
/*    */   }
/* 14 */   public FontRenderer li$cil$oc$util$Tooltip$$font() { return (Minecraft.func_71410_x()).field_71466_p; }
/*    */   public final class Tooltip$$anonfun$1 extends AbstractFunction1<Object, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/* 17 */     public final String apply(Object x$1) { return x$1.toString(); } } public List<String> get(String name, Seq args) { if (li.cil.oc.Localization$.MODULE$.canLocalize((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("tooltip.").append(name).toString()))
/* 18 */     { String tooltip = (new StringOps(scala.Predef$.MODULE$.augmentString(li.cil.oc.Localization$.MODULE$.localizeImmediately((new StringBuilder()).append("tooltip.").append(name).toString()))))
/* 19 */         .format((Seq)args.map((Function1)new Tooltip$$anonfun$1(), scala.collection.Seq$.MODULE$.canBuildFrom()));
/* 20 */       if (li$cil$oc$util$Tooltip$$font() == null) return scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList((Seq)(new StringOps(scala.Predef$.MODULE$.augmentString(tooltip))).lines().toList()); 
/* 21 */       boolean isSubTooltip = name.contains(".");
/* 22 */       boolean shouldShorten = ((isSubTooltip || li$cil$oc$util$Tooltip$$font().func_78256_a(tooltip) > li$cil$oc$util$Tooltip$$maxWidth()) && !li.cil.oc.client.KeyBindings$.MODULE$.showExtendedTooltips());
/*    */ 
/*    */       
/* 25 */       (new String[1])[0] = li.cil.oc.Localization$.MODULE$.localizeImmediately("tooltip.TooLong", (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { li.cil.oc.client.KeyBindings$.MODULE$.getKeyBindingName(li.cil.oc.client.KeyBindings$.MODULE$.extendedTooltip()) })); return shouldShorten ? (isSubTooltip ? scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList((Seq)scala.collection.Seq$.MODULE$.empty()) : scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList((Seq)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1])))) : 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 31 */         scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList((Seq)scala.collection.TraversableOnce$.MODULE$.flattenTraversableOnce((TraversableOnce)(new StringOps(scala.Predef$.MODULE$.augmentString(tooltip))).lines().map((Function1)new Tooltip$$anonfun$get$1()), (Function1)scala.Predef$.MODULE$.$conforms()).flatten().toList()); }  return scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList((Seq)scala.collection.Seq$.MODULE$.empty()); }
/*    */   public final class Tooltip$$anonfun$get$1 extends AbstractFunction1<String, Buffer<String>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     public final Buffer<String> apply(String x$2) { return (Buffer<String>)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$font().func_78271_c(x$2, Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$maxWidth())).map((Function1)new Tooltip$$anonfun$get$1$$anonfun$apply$1(this), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()); } public final class Tooltip$$anonfun$get$1$$anonfun$apply$1 extends AbstractFunction1<Object, String> implements Serializable {
/* 35 */       public static final long serialVersionUID = 0L; public final String apply(Object x$3) { return (new StringBuilder()).append(((String)x$3).trim()).append(" ").toString(); } public Tooltip$$anonfun$get$1$$anonfun$apply$1(Tooltip$$anonfun$get$1 $outer) {} } } public List<String> extended(String name, Seq args) { return li.cil.oc.client.KeyBindings$.MODULE$.showExtendedTooltips() ? 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 41 */       scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList((Seq)scala.collection.TraversableOnce$.MODULE$.flattenTraversableOnce((TraversableOnce)(new StringOps(scala.Predef$.MODULE$.augmentString((new StringOps(scala.Predef$.MODULE$.augmentString(li.cil.oc.Localization$.MODULE$.localizeImmediately((new StringBuilder()).append("tooltip.").append(name).toString())))).format((Seq)args.map((Function1)new Tooltip$$anonfun$extended$1(), scala.collection.Seq$.MODULE$.canBuildFrom()))))).lines().map((Function1)new Tooltip$$anonfun$extended$2()), (Function1)scala.Predef$.MODULE$.$conforms()).flatten().toList()) : 
/*    */       
/* 43 */       scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList((Seq)scala.collection.Seq$.MODULE$.empty()); } public final class Tooltip$$anonfun$extended$1 extends AbstractFunction1<Object, String> implements Serializable {
/* 44 */     public static final long serialVersionUID = 0L; public final String apply(Object x$4) { return x$4.toString(); } } private Tooltip$() { MODULE$ = this;
/*    */     this.li$cil$oc$util$Tooltip$$maxWidth = 220; }
/*    */ 
/*    */   
/*    */   public final class Tooltip$$anonfun$extended$2 extends AbstractFunction1<String, Buffer<String>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Buffer<String> apply(String x$5) {
/*    */       return (Buffer<String>)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$font().func_78271_c(x$5, Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$maxWidth())).map((Function1)new Tooltip$$anonfun$extended$2$$anonfun$apply$2(this), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom());
/*    */     }
/*    */     
/*    */     public final class Tooltip$$anonfun$extended$2$$anonfun$apply$2 extends AbstractFunction1<Object, String> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final String apply(Object x$6) {
/*    */         return (new StringBuilder()).append(((String)x$6).trim()).append(" ").toString();
/*    */       }
/*    */       
/*    */       public Tooltip$$anonfun$extended$2$$anonfun$apply$2(Tooltip$$anonfun$extended$2 $outer) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Tooltip$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */