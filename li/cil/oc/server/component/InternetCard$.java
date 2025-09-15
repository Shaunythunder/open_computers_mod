/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import com.google.common.net.InetAddresses;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.net.Inet4Address;
/*     */ import java.net.Inet6Address;
/*     */ import java.net.InetAddress;
/*     */ import java.util.concurrent.ScheduledExecutorService;
/*     */ import li.cil.oc.Settings;
/*     */ import li.cil.oc.util.InternetFilteringRule;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.Option;
/*     */ import scala.PartialFunction;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class InternetCard$
/*     */ {
/*     */   public static final InternetCard$ MODULE$;
/*     */   private final ScheduledExecutorService li$cil$oc$server$component$InternetCard$$threadPool;
/*     */   
/*     */   public ScheduledExecutorService li$cil$oc$server$component$InternetCard$$threadPool() {
/* 190 */     return this.li$cil$oc$server$component$InternetCard$$threadPool;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRequestAllowed(Settings settings, InetAddress inetAddress, String host) {
/*     */     boolean bool;
/* 373 */     InternetFilteringRule[] rules = settings.internetFilteringRules();
/* 374 */     InetAddress inetAddress1 = inetAddress;
/*     */     
/* 376 */     if (inetAddress1 instanceof Inet6Address) { Inet6Address inet6Address = (Inet6Address)inetAddress1;
/*     */ 
/*     */ 
/*     */       
/* 380 */       Inet4Address inet4in6Address = InetAddresses.getEmbeddedIPv4ClientAddress(inet6Address);
/* 381 */       if (InetAddresses.hasEmbeddedIPv4ClientAddress(inet6Address) && !BoxesRunTime.unboxToBoolean(scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])rules).map((Function1)new InternetCard$$anonfun$isRequestAllowed$7(host, inet4in6Address), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Option.class)))).collectFirst((PartialFunction)new InternetCard$$anonfun$isRequestAllowed$4()).getOrElse((Function0)new InternetCard$$anonfun$isRequestAllowed$1()))) {
/* 382 */         return false;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 387 */       bool = BoxesRunTime.unboxToBoolean(scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])rules).map((Function1)new InternetCard$$anonfun$isRequestAllowed$8(host, inet6Address), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Option.class)))).collectFirst((PartialFunction)new InternetCard$$anonfun$isRequestAllowed$5()).getOrElse((Function0)new InternetCard$$anonfun$isRequestAllowed$2())); }
/*     */     
/* 389 */     else if (inetAddress1 instanceof Inet4Address) { Inet4Address inet4Address = (Inet4Address)inetAddress1;
/*     */       
/* 391 */       bool = BoxesRunTime.unboxToBoolean(scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])rules).map((Function1)new InternetCard$$anonfun$isRequestAllowed$9(host, inet4Address), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Option.class)))).collectFirst((PartialFunction)new InternetCard$$anonfun$isRequestAllowed$6()).getOrElse((Function0)new InternetCard$$anonfun$isRequestAllowed$3())); }
/*     */     else
/*     */     
/* 394 */     { li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringBuilder()).append("Internet Card blocked unrecognized address type: ").append(inetAddress.toString()).toString());
/* 395 */       bool = false; }
/*     */     
/*     */     return settings.internetAccessAllowed() ? bool : false;
/*     */   }
/*     */   
/*     */   public void checkLists(InetAddress inetAddress, String host) {
/* 401 */     if (isRequestAllowed(li.cil.oc.Settings$.MODULE$.get(), inetAddress, host))
/* 402 */       return;  throw new FileNotFoundException("address is not allowed");
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$7 extends AbstractFunction1<InternetFilteringRule, Option<Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String host$1;
/*     */     private final Inet4Address inet4in6Address$1;
/*     */     
/*     */     public final Option<Object> apply(InternetFilteringRule r) {
/*     */       return r.apply(this.inet4in6Address$1, this.host$1);
/*     */     }
/*     */     
/*     */     public InternetCard$$anonfun$isRequestAllowed$7(String host$1, Inet4Address inet4in6Address$1) {} }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$4 extends AbstractPartialFunction<Option<Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final <A1 extends Option<Object>, B1> B1 applyOrElse(Option x2, Function1 default) {
/*     */       Object object;
/*     */       Option option = x2;
/*     */       if (option instanceof Some) {
/*     */         Some some = (Some)option;
/*     */         boolean r = BoxesRunTime.unboxToBoolean(some.x());
/*     */         object = BoxesRunTime.boxToBoolean(r);
/*     */       } else {
/*     */         object = default.apply(x2);
/*     */       } 
/*     */       return (B1)object;
/*     */     }
/*     */     
/*     */     public final boolean isDefinedAt(Option x2) {
/*     */       boolean bool;
/*     */       Option option = x2;
/*     */       if (option instanceof Some) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     } }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$1 extends AbstractFunction0.mcZ.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply() {
/*     */       return apply$mcZ$sp();
/*     */     }
/*     */     
/*     */     public boolean apply$mcZ$sp() {
/*     */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$8 extends AbstractFunction1<InternetFilteringRule, Option<Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String host$1;
/*     */     private final Inet6Address x2$1;
/*     */     
/*     */     public final Option<Object> apply(InternetFilteringRule r) {
/*     */       return r.apply(this.x2$1, this.host$1);
/*     */     }
/*     */     
/*     */     public InternetCard$$anonfun$isRequestAllowed$8(String host$1, Inet6Address x2$1) {}
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$5 extends AbstractPartialFunction<Option<Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final <A1 extends Option<Object>, B1> B1 applyOrElse(Option x3, Function1 default) {
/*     */       Object object;
/*     */       Option option = x3;
/*     */       if (option instanceof Some) {
/*     */         Some some = (Some)option;
/*     */         boolean r = BoxesRunTime.unboxToBoolean(some.x());
/*     */         object = BoxesRunTime.boxToBoolean(r);
/*     */       } else {
/*     */         object = default.apply(x3);
/*     */       } 
/*     */       return (B1)object;
/*     */     }
/*     */     
/*     */     public final boolean isDefinedAt(Option x3) {
/*     */       boolean bool;
/*     */       Option option = x3;
/*     */       if (option instanceof Some) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$2 extends AbstractFunction0.mcZ.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply() {
/*     */       return apply$mcZ$sp();
/*     */     }
/*     */     
/*     */     public boolean apply$mcZ$sp() {
/*     */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$9 extends AbstractFunction1<InternetFilteringRule, Option<Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String host$1;
/*     */     private final Inet4Address x3$1;
/*     */     
/*     */     public final Option<Object> apply(InternetFilteringRule r) {
/*     */       return r.apply(this.x3$1, this.host$1);
/*     */     }
/*     */     
/*     */     public InternetCard$$anonfun$isRequestAllowed$9(String host$1, Inet4Address x3$1) {}
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$6 extends AbstractPartialFunction<Option<Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final <A1 extends Option<Object>, B1> B1 applyOrElse(Option x4, Function1 default) {
/*     */       Object object;
/*     */       Option option = x4;
/*     */       if (option instanceof Some) {
/*     */         Some some = (Some)option;
/*     */         boolean r = BoxesRunTime.unboxToBoolean(some.x());
/*     */         object = BoxesRunTime.boxToBoolean(r);
/*     */       } else {
/*     */         object = default.apply(x4);
/*     */       } 
/*     */       return (B1)object;
/*     */     }
/*     */     
/*     */     public final boolean isDefinedAt(Option x4) {
/*     */       boolean bool;
/*     */       Option option = x4;
/*     */       if (option instanceof Some) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class InternetCard$$anonfun$isRequestAllowed$3 extends AbstractFunction0.mcZ.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply() {
/*     */       return apply$mcZ$sp();
/*     */     }
/*     */     
/*     */     public boolean apply$mcZ$sp() {
/*     */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private InternetCard$() {
/*     */     int i;
/* 561 */     MODULE$ = this;
/*     */     Option option = scala.Option$.MODULE$.apply(li.cil.oc.Settings$.MODULE$.get());
/*     */     if (scala.None$.MODULE$.equals(option)) {
/*     */       i = 1;
/*     */     } else if (option instanceof Some) {
/*     */       Some some = (Some)option;
/*     */       Settings settings = (Settings)some.x();
/*     */       i = settings.internetThreads();
/*     */     } else {
/*     */       throw new MatchError(option);
/*     */     } 
/*     */     this.li$cil$oc$server$component$InternetCard$$threadPool = li.cil.oc.util.ThreadPoolFactory$.MODULE$.create("Internet", i);
/*     */     InternetCard.TCPNotifier$.MODULE$.start();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\InternetCard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */