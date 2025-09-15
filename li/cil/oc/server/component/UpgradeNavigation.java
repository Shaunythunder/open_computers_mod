/*     */ package li.cil.oc.server.component;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.item.data.NavigationUpgradeData;
/*     */ import li.cil.oc.common.tileentity.Waypoint;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.storage.MapData;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Unit$;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.math.package$;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichDouble$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\0055e\001B\001\003\0015\021\021#\0269he\006$WMT1wS\036\fG/[8o\025\t\031A!A\005d_6\004xN\\3oi*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\rA\024XMZ1c\025\t\031b!A\002ba&L!!\006\t\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\t\003/ii\021\001\007\006\0033I\ta\001\032:jm\026\024\030BA\016\031\005)!UM^5dK&sgm\034\005\t;\001\021)\031!C\001=\005!\001n\\:u+\005y\"c\001\021#Q\031!\021\005\001\001 \0051a$/\0324j]\026lWM\034;?!\t\031c%D\001%\025\t)##A\004oKR<xN]6\n\005\035\"#aD#om&\024xN\\7f]RDun\035;\021\005%bS\"\001\026\013\005-\022\022\001C5oi\026\024h.\0317\n\0055R#!\003*pi\006$\030M\0317f\021!y\003A!A!\002\023y\022!\0025pgR\004\003\"B\031\001\t\003\021\024A\002\037j]&$h\b\006\0024kA\021A\007A\007\002\005!)Q\004\ra\001mI\031qG\t\025\007\t\005\002\001A\016\005\bs\001\021\r\021\"\021;\003\021qw\016Z3\026\003m\002\"a\t\037\n\005u\"#AE\"p[B|g.\0328u\007>tg.Z2u_JDaa\020\001!\002\023Y\024!\0028pI\026\004\003bB!\001\005\004%\tAQ\001\005I\006$\030-F\001D!\t!%*D\001F\025\t\teI\003\002H\021\006!\021\016^3n\025\tIe!\001\004d_6lwN\\\005\003\027\026\023QCT1wS\036\fG/[8o+B<'/\0313f\t\006$\030\r\003\004N\001\001\006IaQ\001\006I\006$\030\r\t\005\t\037\002A)\031!C\007!\006QA-\032<jG\026LeNZ8\026\003E\003BAU-\\76\t1K\003\002U+\006I\021.\\7vi\006\024G.\032\006\003-^\013!bY8mY\026\034G/[8o\025\005A\026!B:dC2\f\027B\001.T\005\ri\025\r\035\t\0039\006l\021!\030\006\003=~\013A\001\\1oO*\t\001-\001\003kCZ\f\027B\0012^\005\031\031FO]5oO\"AA\r\001E\001B\0036\021+A\006eKZL7-Z%oM>\004\003\"\0024\001\t\003:\027!D4fi\022+g/[2f\023:4w\016F\001i!\021IG.\\7\016\003)T!a[0\002\tU$\030\016\\\005\0035*\004\"A\034:\017\005=\004X\"A,\n\005E<\026A\002)sK\022,g-\003\002cg*\021\021o\026\005\006k\002!\tA^\001\fO\026$\bk\\:ji&|g\016\006\003x{\006-\001cA8yu&\021\021p\026\002\006\003J\024\030-\037\t\003_nL!\001`,\003\r\005s\027PU3g\021\025qH\0171\001\000\003\035\031wN\034;fqR\004B!!\001\002\b5\021\0211\001\006\004\003\013\021\022aB7bG\"Lg.Z\005\005\003\023\t\031AA\004D_:$X\r\037;\t\017\0055A\0171\001\002\020\005!\021M]4t!\021\t\t!!\005\n\t\005M\0211\001\002\n\003J<W/\\3oiNDs\001^A\f\003;\ty\002\005\003\002\002\005e\021\002BA\016\003\007\021\001bQ1mY\n\f7m[\001\004I>\034\027EAA\021\003Q3WO\\2uS>t\007&\013\036ok6\024WM\035\027!]Vl'-\032:-A9,XNY3sA5j\003eR3uAQDW\rI2veJ,g\016\036\021sK2\fG/\033<fAA|7/\033;j_:\004sN\032\021uQ\026\004#o\0342pi:Bq!!\n\001\t\003\t9#A\005hKR4\025mY5oOR)q/!\013\002,!1a0a\tA\002}D\001\"!\004\002$\001\007\021q\002\025\t\003G\t9\"!\b\0020\005\022\021\021G\001?MVt7\r^5p]\"J#H\\;nE\026\024\b%L\027!\017\026$\b\005\0365fA\r,(O]3oi\002z'/[3oi\006$\030n\0348!_\032\004C\017[3!e>\024w\016\036\030\t\017\005U\002\001\"\001\0028\005Aq-\032;SC:<W\rF\003x\003s\tY\004\003\004\003g\001\ra \005\t\003\033\t\031\0041\001\002\020!B\0211GA\f\003;\ty$\t\002\002B\005Ie-\0368di&|g\016K\025;]Vl'-\032:![5\002s)\032;!i\",\007e\0349fe\006$\030n\0348bY\002\022\030M\\4fA=4\007\005\0365fA9\fg/[4bi&|g\016I;qOJ\fG-\032\030\t\017\005\025\003\001\"\001\002H\005ia-\0338e/\006L\bo\\5oiN$Ra^A%\003\027BaA`A\"\001\004y\b\002CA\007\003\007\002\r!a\004)\021\005\r\023qCA\017\003\037\n#!!\025\002\r\032,hn\031;j_:D#/\0318hKjrW/\0342fe&RD/\0312mK\002jS\006\t$j]\022\004s/Y=q_&tGo\035\021j]\002\"\b.\032\021ta\026\034\027NZ5fI\002\022\030M\\4f]!9\021Q\013\001\005B\005]\023!C8o\033\026\0348/Y4f)\021\tI&a\030\021\007=\fY&C\002\002^]\023A!\0268ji\"A\021\021MA*\001\004\t\031'A\004nKN\034\030mZ3\021\007\r\n)'C\002\002h\021\022q!T3tg\006<W\rC\004\002l\001!\t%!\034\002\t1|\027\r\032\013\005\0033\ny\007\003\005\002r\005%\004\031AA:\003\rq'\r\036\t\005\003k\n\t)\004\002\002x)!\021\021OA=\025\021\tY(! \002\0235Lg.Z2sC\032$(BAA@\003\rqW\r^\005\005\003\007\0139H\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\005\035\005\001\"\021\002\n\006!1/\031<f)\021\tI&a#\t\021\005E\024Q\021a\001\003g\002")
/*     */ public class UpgradeNavigation extends ManagedEnvironment implements DeviceInfo {
/*     */   public EnvironmentHost host() {
/*  31 */     return this.host;
/*  32 */   } private final EnvironmentHost host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  33 */     .withComponent("navigation", Visibility.Neighbors)
/*  34 */     .withConnector()
/*  35 */     .create(); public ComponentConnector node() {
/*     */     return this.node;
/*  37 */   } private final NavigationUpgradeData data = new NavigationUpgradeData(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public NavigationUpgradeData data() { return this.data; }
/*     */   
/*  39 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  40 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  41 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Navigation upgrade");
/*  42 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  43 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "PathFinder v3");
/*  44 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(data().getSize(host().world())).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  47 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():number, number, number -- Get the current relative position of the robot.")
/*     */   public Object[] getPosition(Context context, Arguments args) {
/*  53 */     MapData info = data().mapData(host().world());
/*  54 */     int size = data().getSize(host().world());
/*  55 */     double relativeX = host().xPosition() - info.field_76201_a;
/*  56 */     double relativeZ = host().zPosition() - info.field_76199_b;
/*     */     
/*  58 */     return (package$.MODULE$.abs(relativeX) <= (size / 2) && package$.MODULE$.abs(relativeZ) <= (size / 2)) ? 
/*  59 */       package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(relativeX), BoxesRunTime.boxToDouble(host().yPosition()), BoxesRunTime.boxToDouble(relativeZ)
/*     */           
/*  61 */           })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "out of range" }));
/*     */   }
/*     */   @Callback(doc = "function():number -- Get the current orientation of the robot.")
/*     */   public Object[] getFacing(Context context, Arguments args) {
/*  65 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(((Rotatable)host()).facing().ordinal()) }));
/*     */   } @Callback(doc = "function():number -- Get the operational range of the navigation upgrade.")
/*     */   public Object[] getRange(Context context, Arguments args) {
/*  68 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(data().getSize(host().world()) / 2) }));
/*     */   }
/*     */   @Callback(doc = "function(range:number):table -- Find waypoints in the specified range.")
/*     */   public Object[] findWaypoints(Context context, Arguments args) {
/*  72 */     double range = RichDouble$.MODULE$.min$extension(Predef$.MODULE$.doubleWrapper(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(args.checkDouble(0)), 0.0D)), Settings$.MODULE$.get().maxWirelessRange()[1]);
/*  73 */     if (range <= false) return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Array$.MODULE$.empty(ClassTag$.MODULE$.Nothing()) })); 
/*  74 */     if (node().tryChangeBuffer(-range * Settings$.MODULE$.get().wirelessCostPerRange()[1] * 0.25D)) {
/*  75 */       context.pause(0.5D);
/*  76 */       BlockPosition position = BlockPosition$.MODULE$.apply(host());
/*  77 */       Vec3 positionVec = position.toVec3();
/*  78 */       double rangeSq = range * range;
/*  79 */       Iterable waypoints = (Iterable)Waypoints$.MODULE$.findWaypoints(position, range)
/*  80 */         .filter((Function1)new UpgradeNavigation$$anonfun$1(this, positionVec, rangeSq));
/*  81 */       return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableOnce)waypoints.map((Function1)new UpgradeNavigation$$anonfun$findWaypoints$1(this, positionVec), Iterable$.MODULE$.canBuildFrom()))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  89 */               .toArray(ClassTag$.MODULE$.apply(Map.class)) }));
/*     */     } 
/*     */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enough energy" }));
/*     */   } public final class UpgradeNavigation$$anonfun$1 extends AbstractFunction1<Waypoint, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Vec3 positionVec$1; private final double rangeSq$1; public final boolean apply(Waypoint waypoint) {
/*     */       return (waypoint.func_145835_a(this.positionVec$1.field_72450_a, this.positionVec$1.field_72448_b, this.positionVec$1.field_72449_c) <= this.rangeSq$1);
/*     */     } public UpgradeNavigation$$anonfun$1(UpgradeNavigation $outer, Vec3 positionVec$1, double rangeSq$1) {} } public final class UpgradeNavigation$$anonfun$findWaypoints$1 extends AbstractFunction1<Waypoint, Map<String, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Vec3 positionVec$1;
/*     */     public UpgradeNavigation$$anonfun$findWaypoints$1(UpgradeNavigation $outer, Vec3 positionVec$1) {}
/*     */     public final Map<String, Object> apply(Waypoint waypoint) {
/*     */       Vec3 delta = this.positionVec$1.func_72444_a(waypoint.position().offset(waypoint.facing()).toVec3());
/*     */       (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("position"), new double[] { delta.field_72450_a, delta.field_72448_b, delta.field_72449_c });
/*     */       (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("redstone"), BoxesRunTime.boxToInteger(waypoint.maxInput()));
/*     */       (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("label"), waypoint.label());
/*     */       (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("address"), waypoint.node().address());
/*     */       return (Map<String, Object>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4]));
/*     */     } }
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface name : ()Ljava/lang/String;
/*     */     //   11: ldc_w 'tablet.use'
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 34
/*     */     //   24: goto -> 462
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 462
/*     */     //   34: aload_1
/*     */     //   35: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*     */     //   40: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: instanceof li/cil/oc/api/machine/Machine
/*     */     //   50: ifeq -> 457
/*     */     //   53: aload_3
/*     */     //   54: checkcast li/cil/oc/api/machine/Machine
/*     */     //   57: astore #4
/*     */     //   59: new scala/Tuple2
/*     */     //   62: dup
/*     */     //   63: aload #4
/*     */     //   65: invokeinterface host : ()Lli/cil/oc/api/machine/MachineHost;
/*     */     //   70: aload_1
/*     */     //   71: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   76: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   79: astore #6
/*     */     //   81: aload #6
/*     */     //   83: ifnull -> 444
/*     */     //   86: aload #6
/*     */     //   88: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   91: checkcast li/cil/oc/api/machine/MachineHost
/*     */     //   94: astore #7
/*     */     //   96: aload #6
/*     */     //   98: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   101: checkcast [Ljava/lang/Object;
/*     */     //   104: astore #8
/*     */     //   106: aload #7
/*     */     //   108: instanceof li/cil/oc/api/internal/Tablet
/*     */     //   111: ifeq -> 444
/*     */     //   114: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   117: aload #8
/*     */     //   119: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   122: astore #9
/*     */     //   124: aload #9
/*     */     //   126: invokevirtual isEmpty : ()Z
/*     */     //   129: ifne -> 444
/*     */     //   132: aload #9
/*     */     //   134: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   137: ifnull -> 444
/*     */     //   140: aload #9
/*     */     //   142: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   145: checkcast scala/collection/SeqLike
/*     */     //   148: bipush #8
/*     */     //   150: invokeinterface lengthCompare : (I)I
/*     */     //   155: iconst_0
/*     */     //   156: if_icmpne -> 444
/*     */     //   159: aload #9
/*     */     //   161: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   164: checkcast scala/collection/SeqLike
/*     */     //   167: iconst_0
/*     */     //   168: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   173: astore #10
/*     */     //   175: aload #9
/*     */     //   177: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   180: checkcast scala/collection/SeqLike
/*     */     //   183: iconst_1
/*     */     //   184: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   189: astore #11
/*     */     //   191: aload #9
/*     */     //   193: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   196: checkcast scala/collection/SeqLike
/*     */     //   199: iconst_2
/*     */     //   200: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   205: astore #12
/*     */     //   207: aload #9
/*     */     //   209: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   212: checkcast scala/collection/SeqLike
/*     */     //   215: iconst_3
/*     */     //   216: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   221: astore #13
/*     */     //   223: aload #9
/*     */     //   225: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   228: checkcast scala/collection/SeqLike
/*     */     //   231: iconst_4
/*     */     //   232: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   237: astore #14
/*     */     //   239: aload #9
/*     */     //   241: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   244: checkcast scala/collection/SeqLike
/*     */     //   247: iconst_5
/*     */     //   248: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   253: astore #15
/*     */     //   255: aload #9
/*     */     //   257: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   260: checkcast scala/collection/SeqLike
/*     */     //   263: bipush #6
/*     */     //   265: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   270: astore #16
/*     */     //   272: aload #9
/*     */     //   274: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   277: checkcast scala/collection/SeqLike
/*     */     //   280: bipush #7
/*     */     //   282: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   287: astore #17
/*     */     //   289: aload #10
/*     */     //   291: instanceof net/minecraft/nbt/NBTTagCompound
/*     */     //   294: ifeq -> 444
/*     */     //   297: aload #10
/*     */     //   299: checkcast net/minecraft/nbt/NBTTagCompound
/*     */     //   302: astore #18
/*     */     //   304: aload #11
/*     */     //   306: instanceof net/minecraft/item/ItemStack
/*     */     //   309: ifeq -> 444
/*     */     //   312: aload #12
/*     */     //   314: instanceof net/minecraft/entity/player/EntityPlayer
/*     */     //   317: ifeq -> 444
/*     */     //   320: aload #13
/*     */     //   322: instanceof li/cil/oc/util/BlockPosition
/*     */     //   325: ifeq -> 444
/*     */     //   328: aload #13
/*     */     //   330: checkcast li/cil/oc/util/BlockPosition
/*     */     //   333: astore #19
/*     */     //   335: aload #14
/*     */     //   337: instanceof net/minecraftforge/common/util/ForgeDirection
/*     */     //   340: ifeq -> 444
/*     */     //   343: aload #15
/*     */     //   345: instanceof java/lang/Float
/*     */     //   348: ifeq -> 444
/*     */     //   351: aload #16
/*     */     //   353: instanceof java/lang/Float
/*     */     //   356: ifeq -> 444
/*     */     //   359: aload #17
/*     */     //   361: instanceof java/lang/Float
/*     */     //   364: ifeq -> 444
/*     */     //   367: aload_0
/*     */     //   368: invokevirtual data : ()Lli/cil/oc/common/item/data/NavigationUpgradeData;
/*     */     //   371: aload_0
/*     */     //   372: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   375: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   380: invokevirtual mapData : (Lnet/minecraft/world/World;)Lnet/minecraft/world/storage/MapData;
/*     */     //   383: astore #21
/*     */     //   385: aload #18
/*     */     //   387: ldc_w 'posX'
/*     */     //   390: aload #19
/*     */     //   392: invokevirtual x : ()I
/*     */     //   395: aload #21
/*     */     //   397: getfield field_76201_a : I
/*     */     //   400: isub
/*     */     //   401: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   404: aload #18
/*     */     //   406: ldc_w 'posY'
/*     */     //   409: aload #19
/*     */     //   411: invokevirtual y : ()I
/*     */     //   414: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   417: aload #18
/*     */     //   419: ldc_w 'posZ'
/*     */     //   422: aload #19
/*     */     //   424: invokevirtual z : ()I
/*     */     //   427: aload #21
/*     */     //   429: getfield field_76199_b : I
/*     */     //   432: isub
/*     */     //   433: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   436: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   439: astore #20
/*     */     //   441: goto -> 449
/*     */     //   444: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   447: astore #20
/*     */     //   449: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   452: astore #5
/*     */     //   454: goto -> 462
/*     */     //   457: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   460: astore #5
/*     */     //   462: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #93	-> 0
/*     */     //   #94	-> 5
/*     */     //   #95	-> 46
/*     */     //   #96	-> 86
/*     */     //   #97	-> 367
/*     */     //   #98	-> 385
/*     */     //   #99	-> 404
/*     */     //   #100	-> 417
/*     */     //   #96	-> 439
/*     */     //   #101	-> 444
/*     */     //   #95	-> 449
/*     */     //   #103	-> 457
/*     */     //   #92	-> 462
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	463	0	this	Lli/cil/oc/server/component/UpgradeNavigation;
/*     */     //   0	463	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   96	367	7	tablet	Lli/cil/oc/api/machine/MachineHost;
/*     */     //   175	288	10	nbt	Ljava/lang/Object;
/*     */     //   191	272	11	stack	Ljava/lang/Object;
/*     */     //   207	256	12	player	Ljava/lang/Object;
/*     */     //   223	240	13	blockPos	Ljava/lang/Object;
/*     */     //   239	224	14	side	Ljava/lang/Object;
/*     */     //   255	208	15	hitX	Ljava/lang/Object;
/*     */     //   272	191	16	hitY	Ljava/lang/Object;
/*     */     //   289	174	17	hitZ	Ljava/lang/Object;
/*     */     //   385	54	21	info	Lnet/minecraft/world/storage/MapData;
/*     */   }
/*     */   public void load(NBTTagCompound nbt) {
/* 110 */     super.load(nbt);
/* 111 */     data().load(nbt);
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 115 */     super.save(nbt);
/* 116 */     data().save(nbt);
/*     */   }
/*     */   
/*     */   public UpgradeNavigation(EnvironmentHost host) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeNavigation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */