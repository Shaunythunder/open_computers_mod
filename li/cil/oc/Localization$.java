/*     */ package li.cil.oc;
/*     */ import net.minecraft.util.ChatComponentTranslation;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ 
/*     */ public final class Localization$ {
/*     */   public static final Localization$ MODULE$;
/*     */   private final String nl;
/*     */   
/*     */   private String nl() {
/*  14 */     return this.nl;
/*     */   }
/*     */   private Option<String> resolveKey(String key) {
/*  17 */     return canLocalize((new StringBuilder()).append(Settings$.MODULE$.namespace()).append(key).toString()) ? scala.Option$.MODULE$.apply((new StringBuilder()).append(Settings$.MODULE$.namespace()).append(key).toString()) : (
/*  18 */       canLocalize(key) ? scala.Option$.MODULE$.apply(key) : 
/*  19 */       scala.Option$.MODULE$.empty());
/*     */   } public boolean canLocalize(String key) {
/*  21 */     return StatCollector.func_94522_b(key);
/*     */   }
/*  23 */   public ChatComponentTranslation localizeLater(String formatKey, Seq values) { return new ChatComponentTranslation((String)resolveKey(formatKey).getOrElse((Function0)new Localization$$anonfun$localizeLater$1(formatKey)), (Object[])values.toArray(scala.reflect.ClassTag$.MODULE$.AnyRef())); } public final class Localization$$anonfun$localizeLater$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; private final String formatKey$1; public final String apply() { return this.formatKey$1; }
/*     */      public Localization$$anonfun$localizeLater$1(String formatKey$1) {} }
/*  25 */   public ChatComponentStyle localizeLater(String key) { return (ChatComponentStyle)resolveKey(key).map((Function1)new Localization$$anonfun$localizeLater$2()).getOrElse((Function0)new Localization$$anonfun$localizeLater$3(key)); } public final class Localization$$anonfun$localizeLater$2 extends AbstractFunction1<String, ChatComponentTranslation> implements Serializable { public static final long serialVersionUID = 0L; public final ChatComponentTranslation apply(String k) { return new ChatComponentTranslation(k, new Object[0]); } } public final class Localization$$anonfun$localizeLater$3 extends AbstractFunction0<ChatComponentText> implements Serializable { public static final long serialVersionUID = 0L; private final String key$1; public final ChatComponentText apply() { return new ChatComponentText(this.key$1); }
/*     */      public Localization$$anonfun$localizeLater$3(String key$1) {} }
/*  27 */   public String localizeImmediately(String formatKey, Seq values) { return scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])StatCollector.func_74837_a((String)resolveKey(formatKey).getOrElse((Function0)new Localization$$anonfun$localizeImmediately$1(formatKey)), (Object[])values.toArray(scala.reflect.ClassTag$.MODULE$.AnyRef())).split(nl())).map((Function1)new Localization$$anonfun$localizeImmediately$2(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(String.class)))).mkString("\n"); } public final class Localization$$anonfun$localizeImmediately$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; private final String formatKey$2; public final String apply() { return this.formatKey$2; } public Localization$$anonfun$localizeImmediately$1(String formatKey$2) {} } public final class Localization$$anonfun$localizeImmediately$2 extends AbstractFunction1<String, String> implements Serializable { public final String apply(String x$1) { return x$1.trim(); }
/*     */      public static final long serialVersionUID = 0L; } public String localizeImmediately(String key) {
/*  29 */     return scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])((String)resolveKey(key).map((Function1)new Localization$$anonfun$localizeImmediately$3()).getOrElse((Function0)new Localization$$anonfun$localizeImmediately$4(key))).split(nl())).map((Function1)new Localization$$anonfun$localizeImmediately$5(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(String.class)))).mkString("\n"); } public final class Localization$$anonfun$localizeImmediately$3 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String k) { return StatCollector.func_74838_a(k); } } public final class Localization$$anonfun$localizeImmediately$4 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; private final String key$2; public final String apply() { return this.key$2; } public Localization$$anonfun$localizeImmediately$4(String key$2) {} } public final class Localization$$anonfun$localizeImmediately$5 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String x$2) { return x$2.trim(); }
/*     */      }
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
/*     */   private Localization$() {
/* 186 */     MODULE$ = this;
/*     */     this.nl = scala.util.matching.Regex$.MODULE$.quote("[nl]");
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\Localization$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */