/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class InternetFilteringRule$
/*     */ {
/*     */   public static final InternetFilteringRule$ MODULE$;
/*     */   private final InternetFilteringRule[] li$cil$oc$util$InternetFilteringRule$$defaultRules;
/*     */   private final InetAddressRange[] li$cil$oc$util$InternetFilteringRule$$bogonMatchingRules;
/*     */   
/*     */   public InternetFilteringRule[] li$cil$oc$util$InternetFilteringRule$$defaultRules() {
/*  94 */     return this.li$cil$oc$util$InternetFilteringRule$$defaultRules;
/*     */   }
/*     */ 
/*     */   
/*     */   public InetAddressRange[] li$cil$oc$util$InternetFilteringRule$$bogonMatchingRules() {
/*  99 */     return this.li$cil$oc$util$InternetFilteringRule$$bogonMatchingRules;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class InternetFilteringRule$$anonfun$1
/*     */     extends AbstractFunction1<String, String[]>
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
/*     */     public final String[] apply(String s)
/*     */     {
/* 124 */       return s.split("/", 2); } } public final class InternetFilteringRule$$anonfun$2 extends AbstractFunction1<String[], InetAddressRange> implements Serializable { public final InetAddressRange apply(String[] s) { return InetAddressRange.parse(s[0], s[1]); } public static final long serialVersionUID = 0L; } private InternetFilteringRule$() {
/* 125 */     MODULE$ = this;
/*     */     (new InternetFilteringRule[3])[0] = new InternetFilteringRule("deny private");
/*     */     (new InternetFilteringRule[3])[1] = new InternetFilteringRule("deny bogon");
/*     */     (new InternetFilteringRule[3])[2] = new InternetFilteringRule("allow all");
/*     */     this.li$cil$oc$util$InternetFilteringRule$$defaultRules = new InternetFilteringRule[3];
/*     */     (new String[24])[0] = "0.0.0.0/8";
/*     */     (new String[24])[1] = "10.0.0.0/8";
/*     */     (new String[24])[2] = "100.64.0.0/10";
/*     */     (new String[24])[3] = "127.0.0.0/8";
/*     */     (new String[24])[4] = "169.254.0.0/16";
/*     */     (new String[24])[5] = "172.16.0.0/12";
/*     */     (new String[24])[6] = "192.0.0.0/24";
/*     */     (new String[24])[7] = "192.0.2.0/24";
/*     */     (new String[24])[8] = "192.168.0.0/16";
/*     */     (new String[24])[9] = "198.18.0.0/15";
/*     */     (new String[24])[10] = "198.51.100.0/24";
/*     */     (new String[24])[11] = "203.0.113.0/24";
/*     */     (new String[24])[12] = "224.0.0.0/3";
/*     */     (new String[24])[13] = "::/128";
/*     */     (new String[24])[14] = "::1/128";
/*     */     (new String[24])[15] = "::ffff:0:0/96";
/*     */     (new String[24])[16] = "::/96";
/*     */     (new String[24])[17] = "100::/64";
/*     */     (new String[24])[18] = "2001:10::/28";
/*     */     (new String[24])[19] = "2001:db8::/32";
/*     */     (new String[24])[20] = "fc00::/7";
/*     */     (new String[24])[21] = "fe80::/10";
/*     */     (new String[24])[22] = "fec0::/10";
/*     */     (new String[24])[23] = "ff00::/8";
/*     */     this.li$cil$oc$util$InternetFilteringRule$$bogonMatchingRules = (InetAddressRange[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])new String[24]).map((Function1)new InternetFilteringRule$$anonfun$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(scala.runtime.ScalaRunTime$.MODULE$.arrayClass(String.class))))).map((Function1)new InternetFilteringRule$$anonfun$2(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(InetAddressRange.class)));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\InternetFilteringRule$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */