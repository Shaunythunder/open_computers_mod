/*     */ package li.cil.oc.integration.computercraft;
/*     */ 
/*     */ import dan200.computercraft.api.lua.ILuaContext;
/*     */ import dan200.computercraft.api.peripheral.IComputerAccess;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005=g\001B\001\003\0015\021\001cU<ji\016D\007+\032:ja\",'/\0317\013\005\r!\021!D2p[B,H/\032:de\0064GO\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]yR\"\001\r\013\005eQ\022A\0039fe&\004\b.\032:bY*\0211\004H\001\004CBL'BA\002\036\025\005q\022A\0023b]J\002\004'\003\002!1\tY\021\nU3sSBDWM]1m\021!\021\003A!b\001\n\003\031\023AB:xSR\034\007.F\001%!\t)C&D\001'\025\t9\003&\001\004ue\006LGo\035\006\003S)\n!\002^5mK\026tG/\033;z\025\tYc!\001\004d_6lwN\\\005\003[\031\022!bU<ji\016DG*[6f\021!y\003A!A!\002\023!\023aB:xSR\034\007\016\t\005\006c\001!\tAM\001\007y%t\027\016\036 \025\005M*\004C\001\033\001\033\005\021\001\"\002\0221\001\004!\003bB\034\001\005\004%I\001O\001\b[\026$\bn\0343t+\005I\004\003\002\036B\007.k\021a\017\006\003yu\n\021\"[7nkR\f'\r\\3\013\005yz\024AC2pY2,7\r^5p]*\t\001)A\003tG\006d\027-\003\002Cw\t\031Q*\0319\021\005\021CeBA#G\033\005y\024BA$@\003\031\001&/\0323fM&\021\021J\023\002\007'R\024\030N\\4\013\005\035{\004CB#M\035F;v+\003\002N\tIa)\0368di&|gn\r\t\003/=K!\001\025\r\003\037%\033u.\0349vi\026\024\030iY2fgN\004\"AU+\016\003MS!\001\026\016\002\0071,\030-\003\002W'\nY\021\nT;b\007>tG/\032=u!\r)\005LW\005\0033~\022Q!\021:sCf\004\"!R.\n\005q{$AB!osJ+g\r\003\004_\001\001\006I!O\001\t[\026$\bn\0343tA!9\001\r\001b\001\n\023\t\027aC7fi\"|GMT1nKN,\022A\031\t\004\013b\033\005B\0023\001A\003%!-\001\007nKRDw\016\032(b[\026\034\b\005C\003g\001\021\005s-A\004hKR$\026\020]3\025\003!\004\"aD5\n\005%\003\002\"B6\001\t\003b\027AB1ui\006\034\007\016\006\002naB\021QI\\\005\003_~\022A!\0268ji\")\021O\033a\001\035\006A1m\\7qkR,'\017C\003t\001\021\005C/\001\004eKR\f7\r\033\013\003[VDQ!\035:A\0029CQa\036\001\005Ba\fabZ3u\033\026$\bn\0343OC6,7\017F\001c\021\025Q\b\001\"\021|\003)\031\027\r\0347NKRDw\016\032\013\byvt\030\021AA\006!\r)\005L\004\005\006cf\004\rA\024\005\006f\004\r!U\001\bG>tG/\032=u\021\035\t\031!\037a\001\003\013\ta!\\3uQ>$\007cA#\002\b%\031\021\021B \003\007%sG\017\003\004\002\016e\004\raV\001\nCJ<W/\\3oiNDq!!\005\001\t\003\n\031\"\001\004fcV\fGn\035\013\005\003+\tY\002E\002F\003/I1!!\007@\005\035\021un\0347fC:Dq!!\b\002\020\001\007a#A\003pi\",'\017C\004\002\"\001!I!a\t\002\023\rDWmY6Q_J$HCBA\003\003K\tI\003C\004\002(\005}\001\031A,\002\t\005\024xm\035\005\t\003W\ty\0021\001\002\006\005)\021N\0343fq\"9\021q\006\001\005\n\005E\022aC2iK\016\\7\013\036:j]\036$RaQA\032\003kAq!a\n\002.\001\007q\013\003\005\002,\0055\002\031AA\003\021\035\tI\004\001C\005\003w\t\021C^5tS\ndWmQ8na>tWM\034;t+\t\ti\004\005\003F1\006}\002\003BA!\003\023j!!a\021\013\t\005\025\023qI\001\b]\026$xo\034:l\025\tYb!\003\003\002L\005\r#!C\"p[B|g.\0328u\r\031\ty\005\001\001\002R\tI1iQ\"p]R,\007\020^\n\006\003\033r\0211\013\t\005\003+\nY&\004\002\002X)!\021\021LA$\003\035i\027m\0315j]\026LA!!\030\002X\t91i\0348uKb$\bBC9\002N\t\025\r\021\"\001\002bU\ta\n\003\006\002f\0055#\021!Q\001\n9\013\021bY8naV$XM\035\021\t\025}\fiE!b\001\n\003\tI'F\001R\021)\ti'!\024\003\002\003\006I!U\001\tG>tG/\032=uA!9\021'!\024\005\002\005EDCBA:\003o\nI\b\005\003\002v\0055S\"\001\001\t\rE\fy\0071\001O\021\031y\030q\016a\001#\"A\021QPA'\t\003\ny(\001\003o_\022,GCAAA!\021\t\t%a!\n\t\005\025\0251\t\002\005\035>$W\r\003\005\002\n\0065C\021IAF\003!I7\017U1vg\026$GCAA\013\021!\ty)!\024\005B\005-\025\001B:u_BD\001\"a%\002N\021\005\023QS\001\fG\006t\027J\034;fe\006\034G\017\006\003\002\026\005]\005bBAM\003#\003\raQ\001\007a2\f\0270\032:\t\021\005u\025Q\nC!\003?\013aa]5h]\006dGCBA\013\003C\013)\013C\004\002$\006m\005\031A\"\002\t9\fW.\032\005\t\003O\tY\n1\001\002(B!Q)!+[\023\r\tYk\020\002\013yI,\007/Z1uK\022t\004\002CAX\003\033\"\t%!-\002\013A\fWo]3\025\t\005U\0211\027\005\t\003k\013i\0131\001\0028\00691/Z2p]\022\034\bcA#\002:&\031\0211X \003\r\021{WO\0317f\021!\ty,!\024\005B\005-\025!C5t%Vtg.\0338h\021!\t\031-!\024\005B\005-\025!B:uCJ$\b\002CAd\003\033\"\t%!3\002#\r|gn];nK\016\013G\016\034\"vI\036,G\017F\002n\003\027D\001\"!4\002F\002\007\021qW\001\tG\006dGnQ8ti\002")
/*     */ public class SwitchPeripheral implements IPeripheral {
/*     */   private final SwitchLike switch;
/*     */   private final Map<String, Function3<IComputerAccess, ILuaContext, Object[], Object[]>> methods;
/*     */   private final String[] methodNames;
/*     */   
/*  19 */   public SwitchLike switch() { return this.switch; }
/*  20 */   public SwitchPeripheral(SwitchLike switch) { (new Tuple2[14])[0] = Predef$ArrowAssoc$.MODULE$
/*     */       
/*  22 */       .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("open"), new SwitchPeripheral$$anonfun$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  28 */     (new Tuple2[14])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("isOpen"), new SwitchPeripheral$$anonfun$2(this));
/*     */ 
/*     */ 
/*     */     
/*  32 */     (new Tuple2[14])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("close"), new SwitchPeripheral$$anonfun$3(this));
/*     */ 
/*     */ 
/*     */     
/*  36 */     (new Tuple2[14])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("closeAll"), new SwitchPeripheral$$anonfun$4(this));
/*     */ 
/*     */ 
/*     */     
/*  40 */     (new Tuple2[14])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("transmit"), new SwitchPeripheral$$anonfun$5(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     (new Tuple2[14])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("isWireless"), new SwitchPeripheral$$anonfun$6(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     (new Tuple2[14])[6] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("callRemote"), new SwitchPeripheral$$anonfun$7(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     (new Tuple2[14])[7] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("getMethodsRemote"), new SwitchPeripheral$$anonfun$9(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     (new Tuple2[14])[8] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("getNamesRemote"), new SwitchPeripheral$$anonfun$11(this));
/*     */ 
/*     */     
/*  74 */     (new Tuple2[14])[9] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("getTypeRemote"), new SwitchPeripheral$$anonfun$12(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     (new Tuple2[14])[10] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("isPresentRemote"), new SwitchPeripheral$$anonfun$14(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     (new Tuple2[14])[11] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("isAccessPoint"), new SwitchPeripheral$$anonfun$15(this));
/*     */ 
/*     */     
/*  90 */     (new Tuple2[14])[12] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("isTunnel"), new SwitchPeripheral$$anonfun$16(this));
/*     */ 
/*     */     
/*  93 */     (new Tuple2[14])[13] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("maxPacketSize"), new SwitchPeripheral$$anonfun$17(this));
/*     */ 
/*     */     
/*     */     this.methods = (Map<String, Function3<IComputerAccess, ILuaContext, Object[], Object[]>>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[14]));
/*     */     
/*  98 */     this.methodNames = (String[])Predef$.MODULE$.refArrayOps((Object[])methods().keys().toArray(ClassTag$.MODULE$.apply(String.class))).sorted((Ordering)Ordering$String$.MODULE$); } private Map<String, Function3<IComputerAccess, ILuaContext, Object[], Object[]>> methods() { return this.methods; } public final class SwitchPeripheral$$anonfun$1 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$1(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { int port = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkPort(arguments, 0); if (((TraversableOnce)this.$outer.switch().openPorts().apply(computer)).size() >= 128) throw new IllegalArgumentException("too many open channels");  return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(((SetLike)this.$outer.switch().openPorts().apply(computer)).add(BoxesRunTime.boxToInteger(port))) })); } } public final class SwitchPeripheral$$anonfun$2 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$2(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { int port = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkPort(arguments, 0); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(((SetLike)this.$outer.switch().openPorts().apply(computer)).contains(BoxesRunTime.boxToInteger(port))) })); } } public final class SwitchPeripheral$$anonfun$3 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$3(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { int port = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkPort(arguments, 0); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(((SetLike)this.$outer.switch().openPorts().apply(computer)).remove(BoxesRunTime.boxToInteger(port))) })); } } public final class SwitchPeripheral$$anonfun$4 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Null$> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$4(SwitchPeripheral $outer) {} public final Null$ apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { ((SetLike)this.$outer.switch().openPorts().apply(computer)).clear(); return null; } } public final class SwitchPeripheral$$anonfun$5 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$5(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { int sendPort = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkPort(arguments, 0); int answerPort = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkPort(arguments, 1); (new Integer[1])[0] = BoxesRunTime.boxToInteger(answerPort); Object[] data = (Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps(arguments).drop(2)).$plus$plus((GenTraversableOnce)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Integer[1])), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.AnyRef())); (new String[3])[0] = "cc"; (new String[3])[1] = "_"; (new String[3])[2] = ""; Packet packet = Network.newPacket((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(computer.getID()), computer.getAttachmentName() }, )), null, sendPort, (Object[])Predef$.MODULE$.refArrayOps(data).toArray(ClassTag$.MODULE$.AnyRef())); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(this.$outer.switch().tryEnqueuePacket((Option)None$.MODULE$, packet)) })); } } public final class SwitchPeripheral$$anonfun$6 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$6(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })); } } private String[] methodNames() { return this.methodNames; } public final class SwitchPeripheral$$anonfun$7 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$7(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { Object[] arrayOfObject; String address = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkString(arguments, 0); Option option = Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents()).find((Function1)new SwitchPeripheral$$anonfun$7$$anonfun$8(this, address)); if (option instanceof Some) { Some some = (Some)option; Component component = (Component)some.x(); String method = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkString(arguments, 1); SwitchPeripheral.CCContext fakeContext = new SwitchPeripheral.CCContext(this.$outer, computer, context); arrayOfObject = component.invoke(method, fakeContext, (Object[])Predef$.MODULE$.refArrayOps(arguments).drop(2)); } else { arrayOfObject = null; }  return arrayOfObject; } public final class SwitchPeripheral$$anonfun$7$$anonfun$8 extends AbstractFunction1<Component, Object> implements Serializable {
/* 100 */       public static final long serialVersionUID = 0L; private final String address$1; public final boolean apply(Component x$1) { String str = this.address$1; if (x$1.address() == null) { x$1.address(); if (str != null); } else if (x$1.address().equals(str)) {  }  } public SwitchPeripheral$$anonfun$7$$anonfun$8(SwitchPeripheral$$anonfun$7 $outer, String address$1) {} } } public final class SwitchPeripheral$$anonfun$9 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$9(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { Object[] arrayOfObject; String address = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkString(arguments, 0); Option option = Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents()).find((Function1)new SwitchPeripheral$$anonfun$9$$anonfun$10(this, address)); if (option instanceof Some) { Some some = (Some)option; Component component = (Component)some.x(); arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { WrapAsJava$.MODULE$.mapAsJavaMap((Map)((TraversableOnce)((TraversableLike)WrapAsScala$.MODULE$.collectionAsScalaIterable(component.methods()).zipWithIndex(Iterable$.MODULE$.canBuildFrom())).map((Function1)new SwitchPeripheral$$anonfun$9$$anonfun$apply$2(this), Iterable$.MODULE$.canBuildFrom())).toMap(Predef$.MODULE$.$conforms())) })); } else { arrayOfObject = null; }  return arrayOfObject; } public final class SwitchPeripheral$$anonfun$9$$anonfun$10 extends AbstractFunction1<Component, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String address$2; public final boolean apply(Component x$2) { String str = this.address$2; if (x$2.address() == null) { x$2.address(); if (str != null); } else if (x$2.address().equals(str)) {  }  } public SwitchPeripheral$$anonfun$9$$anonfun$10(SwitchPeripheral$$anonfun$9 $outer, String address$2) {} } public final class SwitchPeripheral$$anonfun$9$$anonfun$apply$2 extends AbstractFunction1<Tuple2<String, Object>, Tuple2<Object, String>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<Object, String> apply(Tuple2 t) { return new Tuple2(BoxesRunTime.boxToInteger(t._2$mcI$sp() + 1), t._1()); } public SwitchPeripheral$$anonfun$9$$anonfun$apply$2(SwitchPeripheral$$anonfun$9 $outer) {} } } public String getType() { return "modem"; } public final class SwitchPeripheral$$anonfun$11 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$11(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { WrapAsJava$.MODULE$.mapAsJavaMap((Map)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents()).map((Function1)new SwitchPeripheral$$anonfun$11$$anonfun$apply$3(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(String.class)))).zipWithIndex(Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).map((Function1)new SwitchPeripheral$$anonfun$11$$anonfun$apply$4(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).toMap(Predef$.MODULE$.$conforms())) })); } public final class SwitchPeripheral$$anonfun$11$$anonfun$apply$3 extends AbstractFunction1<Component, String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final String apply(Component x$3) { return x$3.address(); } public SwitchPeripheral$$anonfun$11$$anonfun$apply$3(SwitchPeripheral$$anonfun$11 $outer) {} } public final class SwitchPeripheral$$anonfun$11$$anonfun$apply$4 extends AbstractFunction1<Tuple2<String, Object>, Tuple2<Object, String>> implements Serializable {
/* 103 */       public static final long serialVersionUID = 0L; public final Tuple2<Object, String> apply(Tuple2 t) { return new Tuple2(BoxesRunTime.boxToInteger(t._2$mcI$sp() + 1), t._1()); } public SwitchPeripheral$$anonfun$11$$anonfun$apply$4(SwitchPeripheral$$anonfun$11 $outer) {} } } public final class SwitchPeripheral$$anonfun$12 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$12(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { Object[] arrayOfObject; String address = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkString(arguments, 0); Option option = Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents()).find((Function1)new SwitchPeripheral$$anonfun$12$$anonfun$13(this, address)); if (option instanceof Some) { Some some = (Some)option; Component component = (Component)some.x(); arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { component.name() })); } else { arrayOfObject = null; }  return arrayOfObject; } public final class SwitchPeripheral$$anonfun$12$$anonfun$13 extends AbstractFunction1<Component, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String address$3; public final boolean apply(Component x$4) { String str = this.address$3; if (x$4.address() == null) { x$4.address(); if (str != null); } else if (x$4.address().equals(str)) {  }  } public SwitchPeripheral$$anonfun$12$$anonfun$13(SwitchPeripheral$$anonfun$12 $outer, String address$3) {} } } public final class SwitchPeripheral$$anonfun$14 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$14(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { String address = this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$checkString(arguments, 0); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents()).exists((Function1)new SwitchPeripheral$$anonfun$14$$anonfun$apply$5(this, address))) })); } public final class SwitchPeripheral$$anonfun$14$$anonfun$apply$5 extends AbstractFunction1<Component, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String address$4; public final boolean apply(Component x$5) { String str = this.address$4; if (x$5.address() == null) { x$5.address(); if (str != null); } else if (x$5.address().equals(str)) {  }  } public SwitchPeripheral$$anonfun$14$$anonfun$apply$5(SwitchPeripheral$$anonfun$14 $outer, String address$4) {} } } public final class SwitchPeripheral$$anonfun$15 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$15(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(this.$outer.switch().isWirelessEnabled()) })); } } public final class SwitchPeripheral$$anonfun$16 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$16(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(this.$outer.switch().isLinkedEnabled()) })); } } public final class SwitchPeripheral$$anonfun$17 extends AbstractFunction3<IComputerAccess, ILuaContext, Object[], Object[]> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$17(SwitchPeripheral $outer) {} public final Object[] apply(IComputerAccess computer, ILuaContext context, Object[] arguments) { return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(Settings$.MODULE$.get().maxNetworkPacketSize()) })); } } public void attach(IComputerAccess computer) { switch().computers().$plus$eq(computer);
/* 104 */     switch().openPorts().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(computer), Set$.MODULE$.empty())); }
/*     */ 
/*     */   
/*     */   public void detach(IComputerAccess computer) {
/* 108 */     switch().computers().$minus$eq(computer);
/* 109 */     switch().openPorts().$minus$eq(computer);
/*     */   }
/*     */   public String[] getMethodNames() {
/* 112 */     return methodNames();
/*     */   } public Object[] callMethod(IComputerAccess computer, ILuaContext context, int method, Object[] arguments) {
/*     */     
/* 115 */     try { return (Object[])((Function3)methods().apply(methodNames()[method])).apply(computer, context, arguments); } catch (LuaException luaException) { throw luaException; }
/*     */     finally
/* 117 */     { Exception exception = null; }
/*     */   
/*     */   }
/*     */   
/*     */   public boolean equals(IPeripheral other) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_2
/*     */     //   2: aload_2
/*     */     //   3: instanceof li/cil/oc/integration/computercraft/SwitchPeripheral
/*     */     //   6: ifeq -> 55
/*     */     //   9: aload_2
/*     */     //   10: checkcast li/cil/oc/integration/computercraft/SwitchPeripheral
/*     */     //   13: astore_3
/*     */     //   14: aload_3
/*     */     //   15: invokevirtual switch : ()Lli/cil/oc/common/tileentity/traits/SwitchLike;
/*     */     //   18: aload_0
/*     */     //   19: invokevirtual switch : ()Lli/cil/oc/common/tileentity/traits/SwitchLike;
/*     */     //   22: astore #5
/*     */     //   24: dup
/*     */     //   25: ifnonnull -> 37
/*     */     //   28: pop
/*     */     //   29: aload #5
/*     */     //   31: ifnull -> 45
/*     */     //   34: goto -> 49
/*     */     //   37: aload #5
/*     */     //   39: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   42: ifeq -> 49
/*     */     //   45: iconst_1
/*     */     //   46: goto -> 50
/*     */     //   49: iconst_0
/*     */     //   50: istore #4
/*     */     //   52: goto -> 58
/*     */     //   55: iconst_0
/*     */     //   56: istore #4
/*     */     //   58: iload #4
/*     */     //   60: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 0
/*     */     //   #121	-> 2
/*     */     //   #122	-> 55
/*     */     //   #120	-> 58
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	61	0	this	Lli/cil/oc/integration/computercraft/SwitchPeripheral;
/*     */     //   0	61	1	other	Ldan200/computercraft/api/peripheral/IPeripheral;
/*     */   }
/*     */   
/*     */   public int li$cil$oc$integration$computercraft$SwitchPeripheral$$checkPort(Object[] args, int index) {
/* 126 */     if (args.length >= index - 1 && args[index] instanceof Number) {
/*     */       
/* 128 */       int port = (int)BoxesRunTime.unboxToDouble(args[index]);
/* 129 */       if (port < 0 || port > 65535) {
/* 130 */         (new String[2])[0] = "bad argument #"; (new String[2])[1] = " (number in [1, 65535] expected)"; throw new IllegalArgumentException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index + 1) })));
/* 131 */       }  return port;
/*     */     } 
/*     */     (new String[2])[0] = "bad argument #";
/*     */     (new String[2])[1] = " (number expected)";
/* 135 */     throw new IllegalArgumentException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index + 1) }))); } public String li$cil$oc$integration$computercraft$SwitchPeripheral$$checkString(Object[] args, int index) { if (args.length >= index - 1 && args[index] instanceof String)
/*     */     {
/* 137 */       return (String)args[index]; } 
/*     */     (new String[2])[0] = "bad argument #";
/*     */     (new String[2])[1] = " (string expected)";
/*     */     throw new IllegalArgumentException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index + 1) }))); }
/* 141 */   public Component[] li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents() { return (Component[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).flatMap((Function1)new SwitchPeripheral$$anonfun$li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Component.class))); } public final class SwitchPeripheral$$anonfun$li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents$1 extends AbstractFunction1<ForgeDirection, Iterable<Component>> implements Serializable { public static final long serialVersionUID = 0L; public SwitchPeripheral$$anonfun$li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents$1(SwitchPeripheral $outer) {}
/* 142 */     public final Iterable<Component> apply(ForgeDirection side) { Node node = this.$outer.switch().sidedNode(side);
/* 143 */       return (Iterable<Component>)WrapAsScala$.MODULE$.iterableAsScalaIterable(node.reachableNodes()).collect((PartialFunction)new SwitchPeripheral$$anonfun$li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents$1$$anonfun$apply$1(this, node), Iterable$.MODULE$.canBuildFrom()); } public final class SwitchPeripheral$$anonfun$li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents$1$$anonfun$apply$1 extends AbstractPartialFunction<Node, Component> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$1; public final <A1 extends Node, B1> B1 applyOrElse(Node x1, Function1 default) { Node node = x1;
/* 144 */         if (node instanceof Component) { Component component = (Component)node; if (component.canBeSeenFrom(this.node$1)) return (B1)component;  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Node x1) { Node node = x1; if (node instanceof Component) { Component component = (Component)node; if (component.canBeSeenFrom(this.node$1))
/*     */             return true;  }
/*     */         
/*     */         return false; }
/*     */        public SwitchPeripheral$$anonfun$li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents$1$$anonfun$apply$1(SwitchPeripheral$$anonfun$li$cil$oc$integration$computercraft$SwitchPeripheral$$visibleComponents$1 $outer, Node node$1) {} } } public class CCContext implements Context { private final IComputerAccess computer; private final ILuaContext context;
/* 149 */     public IComputerAccess computer() { return this.computer; } public ILuaContext context() { return this.context; } public CCContext(SwitchPeripheral $outer, IComputerAccess computer, ILuaContext context) {} public Node node() {
/* 150 */       return li$cil$oc$integration$computercraft$SwitchPeripheral$CCContext$$$outer().switch().node();
/*     */     } public boolean isPaused() {
/* 152 */       return false;
/*     */     } public boolean stop() {
/* 154 */       return false;
/*     */     } public boolean canInteract(String player) {
/* 156 */       return true;
/*     */     }
/*     */     public boolean signal(String name, Seq args) {
/* 159 */       computer().queueEvent(name, (Object[])args.toArray(ClassTag$.MODULE$.AnyRef()));
/* 160 */       return true;
/*     */     }
/*     */     public boolean pause(double seconds) {
/* 163 */       return false;
/*     */     } public boolean isRunning() {
/* 165 */       return true;
/*     */     } public boolean start() {
/* 167 */       return false;
/*     */     }
/*     */     
/*     */     public void consumeCallBudget(double callCost) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\computercraft\SwitchPeripheral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */