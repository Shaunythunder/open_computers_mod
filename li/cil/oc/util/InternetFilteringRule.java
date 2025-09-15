/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001%4A!\001\002\001\027\t)\022J\034;fe:,GOR5mi\026\024\030N\\4Sk2,'BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001a\005\002\001\031A\021Q\002E\007\002\035)\tq\"A\003tG\006d\027-\003\002\022\035\t1\021I\\=SK\032D\001b\005\001\003\006\004%\t\001F\001\013eVdWm\025;sS:<W#A\013\021\005YIbBA\007\030\023\tAb\"\001\004Qe\026$WMZ\005\0035m\021aa\025;sS:<'B\001\r\017\021!i\002A!A!\002\023)\022a\003:vY\026\034FO]5oO\002BQa\b\001\005\002\001\na\001P5oSRtDCA\021$!\t\021\003!D\001\003\021\025\031b\0041\001\026\021\035)\003\0011A\005\n\031\n\001bX5om\006d\027\016Z\013\002OA\021Q\002K\005\003S9\021qAQ8pY\026\fg\016C\004,\001\001\007I\021\002\027\002\031}KgN^1mS\022|F%Z9\025\0055\002\004CA\007/\023\tycB\001\003V]&$\bbB\031+\003\003\005\raJ\001\004q\022\n\004BB\032\001A\003&q%A\005`S:4\030\r\\5eA!9Q\007\001b\001\n\0231\024!\003<bY&$\027\r^8s+\0059\004#B\0079uU\021\025BA\035\017\005%1UO\\2uS>t'\007\005\002<\0016\tAH\003\002>}\005\031a.\032;\013\003}\nAA[1wC&\021\021\t\020\002\f\023:,G/\0213ee\026\0348\017E\002\016\007\036J!\001\022\b\003\r=\003H/[8o\021\0311\005\001)A\005o\005Qa/\0317jI\006$xN\035\021\t\013!\003A\021A%\002\017%tg/\0317jIR\tq\005C\003L\001\021\005A*A\003baBd\027\020F\002C\033>CQA\024&A\002i\n1\"\0338fi\006#GM]3tg\")\001K\023a\001+\005!\001n\\:u\017\025\021&\001#\001T\003UIe\016^3s]\026$h)\0337uKJLgn\032*vY\026\004\"A\t+\007\013\005\021\001\022A+\024\005Qc\001\"B\020U\t\0039F#A*\t\017e#&\031!C\0055\006aA-\0324bk2$(+\0367fgV\t1\fE\002\0169\006J!!\030\b\003\013\005\023(/Y=\t\r}#\006\025!\003\\\0035!WMZ1vYR\024V\017\\3tA!9\021\r\026b\001\n\023\021\027A\0052pO>tW*\031;dQ&twMU;mKN,\022a\031\t\004\033q#\007C\001\022f\023\t1'A\001\tJ]\026$\030\t\0323sKN\034(+\0318hK\"1\001\016\026Q\001\n\r\f1CY8h_:l\025\r^2iS:<'+\0367fg\002\002")
/*    */ public class InternetFilteringRule {
/*    */   private final String ruleString;
/*    */   
/*  9 */   public String ruleString() { return this.ruleString; } private boolean _invalid = false;
/* 10 */   private boolean _invalid() { return this._invalid; } private void _invalid_$eq(boolean x$1) { this._invalid = x$1; } private Function2<InetAddress, String, Option<Object>> validator() {
/* 11 */     return this.validator;
/* 12 */   } private final Function2<InetAddress, String, Option<Object>> validator = liftedTree1$1(); private final Function2 liftedTree1$1() { try {
/* 13 */       InternetFilteringRule$$anonfun$liftedTree1$1$3 internetFilteringRule$$anonfun$liftedTree1$1$3; String[] ruleParts = (new StringOps(Predef$.MODULE$.augmentString(ruleString()))).split(' ');
/* 14 */       String str = (String)Predef$.MODULE$.refArrayOps((Object[])ruleParts).head();
/*    */     } finally {
/*    */       Exception exception = null;
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
/* 82 */       OpenComputers$.MODULE$.log().error((new StringBuilder()).append("Invalid Internet filteringRules rule in configuration: \"").append(ruleString()).append("\".").toString(), exception);
/*    */     } 
/* 84 */     return (Function2)new InternetFilteringRule$$anonfun$liftedTree1$1$4(this); } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final boolean value$1; private final MutableList predicates$1; public InternetFilteringRule$$anonfun$liftedTree1$1$1(InternetFilteringRule $outer, boolean value$1, MutableList predicates$1) {} public final Object apply(String f) { String[] filter = f.split(":", 2); String str = (String)Predef$.MODULE$.refArrayOps((Object[])filter).head(); if ("default".equals(str)) { MutableList mutableList = this.value$1 ? this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4(this)) : this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$3(this)); } else if ("private".equals(str)) { MutableList mutableList = this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$6(this)); } else if ("bogon".equals(str)) { MutableList mutableList = this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$7(this)); } else if ("ipv4".equals(str)) { MutableList mutableList = this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$9(this)); } else if ("ipv6".equals(str)) { MutableList mutableList = this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$10(this)); } else if ("ipv4-embedded-ipv6".equals(str)) { MutableList mutableList = this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$11(this)); } else if ("domain".equals(str)) { String domain = filter[1]; InetAddress[] addresses = InetAddress.getAllByName(domain); MutableList mutableList = this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12(this, domain, addresses)); } else if ("ip".equals(str)) { String[] ipStringParts = filter[1].split("/", 2); InetAddressRange ipRange = InetAddressRange.parse(ipStringParts[0], ipStringParts[1]); InetAddress ipAddress = InetAddresses.forString(ipStringParts[0]); (ipStringParts.length == 2) ? this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$14(this, ipRange)) : this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$15(this, ipAddress)); MutableList mutableList = this.predicates$1.$plus$eq(new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$16(this)); } else { if ("all".equals(str)) return BoxedUnit.UNIT;  throw new MatchError(str); }  return SYNTHETIC_LOCAL_VARIABLE_4; } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$3 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(InetAddress x$1, String x$2) { return false; } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$3(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(InetAddress inetAddress, String host) { return BoxesRunTime.unboxToBoolean(Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])InternetFilteringRule$.MODULE$.li$cil$oc$util$InternetFilteringRule$$defaultRules()).map((Function1)new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$5(this, inetAddress, host), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Option.class)))).collectFirst((PartialFunction)new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$2(this)).getOrElse((Function0)new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$1(this))); } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$5 extends AbstractFunction1<InternetFilteringRule, Option<Object>> implements Serializable { public static final long serialVersionUID = 0L; private final InetAddress inetAddress$1; private final String host$1; public final Option<Object> apply(InternetFilteringRule r) { return r.apply(this.inetAddress$1, this.host$1); } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$5(InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4 $outer, InetAddress inetAddress$1, String host$1) {} } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$2 extends AbstractPartialFunction<Option<Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<Object>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; boolean r = BoxesRunTime.unboxToBoolean(some.x()); object = BoxesRunTime.boxToBoolean(r); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$2(InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4 $outer) {} } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4$$anonfun$apply$1(InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$4 $outer) {} } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$6 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$6(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(InetAddress inetAddress, String x$3) { return (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isSiteLocalAddress()); } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$7 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$7(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(InetAddress inetAddress, String x$4) { return Predef$.MODULE$.refArrayOps((Object[])InternetFilteringRule$.MODULE$.li$cil$oc$util$InternetFilteringRule$$bogonMatchingRules()).exists((Function1)new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$7$$anonfun$apply$8(this, inetAddress)); } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$7$$anonfun$apply$8 extends AbstractFunction1<InetAddressRange, Object> implements Serializable { public static final long serialVersionUID = 0L; private final InetAddress inetAddress$2; public final boolean apply(InetAddressRange rule) { return rule.matches(this.inetAddress$2); } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$7$$anonfun$apply$8(InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$7 $outer, InetAddress inetAddress$2) {} } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$9 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$9(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(InetAddress inetAddress, String x$5) { return inetAddress instanceof java.net.Inet4Address; } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$10 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$10(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(InetAddress inetAddress, String x$6) { return inetAddress instanceof Inet6Address; } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$11 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$11(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(InetAddress inetAddress, String x$7) { return (inetAddress instanceof Inet6Address && InetAddresses.hasEmbeddedIPv4ClientAddress((Inet6Address)inetAddress)); } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String domain$1; private final InetAddress[] addresses$1; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer, String domain$1, InetAddress[] addresses$1) {} public final boolean apply(InetAddress inetAddress, String host) { String str = this.domain$1; if (host == null) { if (str != null) { if (Predef$.MODULE$.refArrayOps((Object[])this.addresses$1).exists((Function1)new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12$$anonfun$apply$13(this, inetAddress))); return false; }  } else if (!host.equals(str)) { if (Predef$.MODULE$.refArrayOps((Object[])this.addresses$1).exists((Function1)new InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12$$anonfun$apply$13(this, inetAddress))); return false; }  } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12$$anonfun$apply$13 extends AbstractFunction1<InetAddress, Object> implements Serializable { public static final long serialVersionUID = 0L; private final InetAddress inetAddress$3; public final boolean apply(InetAddress a) { return a.equals(this.inetAddress$3); } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12$$anonfun$apply$13(InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$12 $outer, InetAddress inetAddress$3) {} } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$14 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final InetAddressRange ipRange$1; public final boolean apply(InetAddress inetAddress, String x$8) { return this.ipRange$1.matches(inetAddress); } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$14(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer, InetAddressRange ipRange$1) {} } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$15 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final InetAddress ipAddress$1; public final boolean apply(InetAddress inetAddress, String x$9) { return this.ipAddress$1.equals(inetAddress); } public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$15(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer, InetAddress ipAddress$1) {} } public final class InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$16 extends AbstractFunction2<InetAddress, String, Object> implements Serializable { public static final long serialVersionUID = 0L; public InternetFilteringRule$$anonfun$liftedTree1$1$1$$anonfun$apply$16(InternetFilteringRule$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(InetAddress inetAddress, String x$10) { return (inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isSiteLocalAddress()); } } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$2 extends AbstractFunction2<InetAddress, String, Option<Object>> implements Serializable { public static final long serialVersionUID = 0L; private final boolean value$1; private final MutableList predicates$1; public InternetFilteringRule$$anonfun$liftedTree1$1$2(InternetFilteringRule $outer, boolean value$1, MutableList predicates$1) {} public final Option<Object> apply(InetAddress inetAddress, String host) { return this.predicates$1.forall((Function1)new InternetFilteringRule$$anonfun$liftedTree1$1$2$$anonfun$apply$17(this, inetAddress, host)) ? (Option<Object>)new Some(BoxesRunTime.boxToBoolean(this.value$1)) : (Option<Object>)None$.MODULE$; } public final class InternetFilteringRule$$anonfun$liftedTree1$1$2$$anonfun$apply$17 extends AbstractFunction1<Function2<InetAddress, String, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final InetAddress inetAddress$4; private final String host$2; public final boolean apply(Function2 p) { return BoxesRunTime.unboxToBoolean(p.apply(this.inetAddress$4, this.host$2)); } public InternetFilteringRule$$anonfun$liftedTree1$1$2$$anonfun$apply$17(InternetFilteringRule$$anonfun$liftedTree1$1$2 $outer, InetAddress inetAddress$4, String host$2) {} } } public final class InternetFilteringRule$$anonfun$liftedTree1$1$3 extends AbstractFunction2<InetAddress, String, None$> implements Serializable { public static final long serialVersionUID = 0L; public final None$ apply(InetAddress x$11, String x$12) { return None$.MODULE$; } public InternetFilteringRule$$anonfun$liftedTree1$1$3(InternetFilteringRule $outer) {} } public final class InternetFilteringRule$$anonfun$liftedTree1$1$4 extends AbstractFunction2<InetAddress, String, Some<Object>> implements Serializable { public final Some<Object> apply(InetAddress x$13, String x$14) { return new Some(BoxesRunTime.boxToBoolean(false)); }
/*    */      public static final long serialVersionUID = 0L;
/*    */     public InternetFilteringRule$$anonfun$liftedTree1$1$4(InternetFilteringRule $outer) {} }
/*    */   public boolean invalid() {
/* 88 */     return _invalid();
/*    */   } public Option<Object> apply(InetAddress inetAddress, String host) {
/* 90 */     return (Option<Object>)validator().apply(inetAddress, host);
/*    */   }
/*    */   
/*    */   public InternetFilteringRule(String ruleString) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\InternetFilteringRule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */