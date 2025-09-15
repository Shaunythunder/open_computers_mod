/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.driver.DeviceInfo;
/*    */ import li.cil.oc.api.network.Component;
/*    */ import li.cil.oc.api.network.ComponentConnector;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.nbt.NBTTagList;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001q4A!\001\002\001\033\t!R\013]4sC\022,')\031:d_\022,'+Z1eKJT!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\"$D\001\031\025\tI\"#\001\004ee&4XM]\005\0037a\021!\002R3wS\016,\027J\0344p\021!i\002A!b\001\n\003q\022\001\0025pgR,\022a\b\t\003A\rj\021!\t\006\003EI\tqA\\3uo>\0248.\003\002%C\tyQI\034<je>tW.\0328u\021>\034H\017\003\005'\001\t\005\t\025!\003 \003\025Awn\035;!\021\025A\003\001\"\001*\003\031a\024N\\5u}Q\021!\006\f\t\003W\001i\021A\001\005\006;\035\002\ra\b\005\b]\001\021\r\021\"\0210\003\021qw\016Z3\026\003A\002\"\001I\031\n\005I\n#AE\"p[B|g.\0328u\007>tg.Z2u_JDa\001\016\001!\002\023\001\024!\0028pI\026\004\003\002\003\034\001\021\013\007IQB\034\002\025\021,g/[2f\023:4w.F\0019!\021I\004I\021\"\016\003iR!a\017\037\002\023%lW.\036;bE2,'BA\037?\003)\031w\016\0347fGRLwN\034\006\002\005)1oY1mC&\021\021I\017\002\004\033\006\004\bCA\"I\033\005!%BA#G\003\021a\027M\\4\013\003\035\013AA[1wC&\021\021\n\022\002\007'R\024\030N\\4\t\021-\003\001\022!Q!\016a\n1\002Z3wS\016,\027J\0344pA!)Q\n\001C!\035\006iq-\032;EKZL7-Z%oM>$\022a\024\t\005!N#F+D\001R\025\t\021f)\001\003vi&d\027BA!R!\t)\026L\004\002W/6\ta(\003\002Y}\0051\001K]3eK\032L!!\023.\013\005as\004\"\002/\001\t\003j\026!C8o\033\026\0348/Y4f)\tq\026\r\005\002W?&\021\001M\020\002\005+:LG\017C\003c7\002\0071-A\004nKN\034\030mZ3\021\005\001\"\027BA3\"\005\035iUm]:bO\026DQa\032\001\005\n!\fA\002\035:pG\026\0348OT8eKN$2AX5r\021\025Qg\r1\001l\003\025qw\016Z3t!\r1FN\\\005\003[z\022Q!\021:sCf\004\"\001I8\n\005A\f#\001\002(pI\026DQA\0354A\002M\f1A\0342u!\t!(0D\001v\025\t\021hO\003\002xq\006IQ.\0338fGJ\fg\r\036\006\002s\006\031a.\032;\n\005m,(A\004(C)R\013wmQ8na>,h\016\032")
/*    */ public class UpgradeBarcodeReader extends ManagedEnvironment implements DeviceInfo {
/*    */   public EnvironmentHost host() {
/* 24 */     return this.host;
/* 25 */   } private final EnvironmentHost host; private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/* 26 */     .withComponent("barcode_reader")
/* 27 */     .withConnector()
/* 28 */     .create(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0;
/*    */   public ComponentConnector node() { return this.node; }
/* 30 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/* 31 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/* 32 */         (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Barcode reader upgrade");
/* 33 */         (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 34 */         (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Readerizer Deluxe"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 37 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Map<String, String> deviceInfo() {
/*    */     return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onMessage(Message message) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*    */     //   5: aload_1
/*    */     //   6: invokeinterface name : ()Ljava/lang/String;
/*    */     //   11: ldc 'tablet.use'
/*    */     //   13: astore_2
/*    */     //   14: dup
/*    */     //   15: ifnonnull -> 26
/*    */     //   18: pop
/*    */     //   19: aload_2
/*    */     //   20: ifnull -> 33
/*    */     //   23: goto -> 621
/*    */     //   26: aload_2
/*    */     //   27: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   30: ifeq -> 621
/*    */     //   33: aload_1
/*    */     //   34: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*    */     //   39: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*    */     //   44: astore_3
/*    */     //   45: aload_3
/*    */     //   46: instanceof li/cil/oc/api/machine/Machine
/*    */     //   49: ifeq -> 616
/*    */     //   52: aload_3
/*    */     //   53: checkcast li/cil/oc/api/machine/Machine
/*    */     //   56: astore #4
/*    */     //   58: new scala/Tuple2
/*    */     //   61: dup
/*    */     //   62: aload #4
/*    */     //   64: invokeinterface host : ()Lli/cil/oc/api/machine/MachineHost;
/*    */     //   69: aload_1
/*    */     //   70: invokeinterface data : ()[Ljava/lang/Object;
/*    */     //   75: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   78: astore #6
/*    */     //   80: aload #6
/*    */     //   82: ifnull -> 603
/*    */     //   85: aload #6
/*    */     //   87: invokevirtual _1 : ()Ljava/lang/Object;
/*    */     //   90: checkcast li/cil/oc/api/machine/MachineHost
/*    */     //   93: astore #7
/*    */     //   95: aload #6
/*    */     //   97: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   100: checkcast [Ljava/lang/Object;
/*    */     //   103: astore #8
/*    */     //   105: aload #7
/*    */     //   107: instanceof li/cil/oc/api/internal/Tablet
/*    */     //   110: ifeq -> 603
/*    */     //   113: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   116: aload #8
/*    */     //   118: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   121: astore #9
/*    */     //   123: aload #9
/*    */     //   125: invokevirtual isEmpty : ()Z
/*    */     //   128: ifne -> 603
/*    */     //   131: aload #9
/*    */     //   133: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   136: ifnull -> 603
/*    */     //   139: aload #9
/*    */     //   141: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   144: checkcast scala/collection/SeqLike
/*    */     //   147: bipush #8
/*    */     //   149: invokeinterface lengthCompare : (I)I
/*    */     //   154: iconst_0
/*    */     //   155: if_icmpne -> 603
/*    */     //   158: aload #9
/*    */     //   160: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   163: checkcast scala/collection/SeqLike
/*    */     //   166: iconst_0
/*    */     //   167: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   172: astore #10
/*    */     //   174: aload #9
/*    */     //   176: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   179: checkcast scala/collection/SeqLike
/*    */     //   182: iconst_1
/*    */     //   183: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   188: astore #11
/*    */     //   190: aload #9
/*    */     //   192: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   195: checkcast scala/collection/SeqLike
/*    */     //   198: iconst_2
/*    */     //   199: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   204: astore #12
/*    */     //   206: aload #9
/*    */     //   208: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   211: checkcast scala/collection/SeqLike
/*    */     //   214: iconst_3
/*    */     //   215: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   220: astore #13
/*    */     //   222: aload #9
/*    */     //   224: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   227: checkcast scala/collection/SeqLike
/*    */     //   230: iconst_4
/*    */     //   231: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   236: astore #14
/*    */     //   238: aload #9
/*    */     //   240: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   243: checkcast scala/collection/SeqLike
/*    */     //   246: iconst_5
/*    */     //   247: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   252: astore #15
/*    */     //   254: aload #9
/*    */     //   256: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   259: checkcast scala/collection/SeqLike
/*    */     //   262: bipush #6
/*    */     //   264: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   269: astore #16
/*    */     //   271: aload #9
/*    */     //   273: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   276: checkcast scala/collection/SeqLike
/*    */     //   279: bipush #7
/*    */     //   281: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   286: astore #17
/*    */     //   288: aload #10
/*    */     //   290: instanceof net/minecraft/nbt/NBTTagCompound
/*    */     //   293: ifeq -> 603
/*    */     //   296: aload #10
/*    */     //   298: checkcast net/minecraft/nbt/NBTTagCompound
/*    */     //   301: astore #18
/*    */     //   303: aload #11
/*    */     //   305: instanceof net/minecraft/item/ItemStack
/*    */     //   308: ifeq -> 603
/*    */     //   311: aload #12
/*    */     //   313: instanceof net/minecraft/entity/player/EntityPlayer
/*    */     //   316: ifeq -> 603
/*    */     //   319: aload #12
/*    */     //   321: checkcast net/minecraft/entity/player/EntityPlayer
/*    */     //   324: astore #19
/*    */     //   326: aload #13
/*    */     //   328: instanceof li/cil/oc/util/BlockPosition
/*    */     //   331: ifeq -> 603
/*    */     //   334: aload #13
/*    */     //   336: checkcast li/cil/oc/util/BlockPosition
/*    */     //   339: astore #20
/*    */     //   341: aload #14
/*    */     //   343: instanceof net/minecraftforge/common/util/ForgeDirection
/*    */     //   346: ifeq -> 603
/*    */     //   349: aload #14
/*    */     //   351: checkcast net/minecraftforge/common/util/ForgeDirection
/*    */     //   354: astore #21
/*    */     //   356: aload #15
/*    */     //   358: instanceof java/lang/Float
/*    */     //   361: ifeq -> 603
/*    */     //   364: aload #15
/*    */     //   366: checkcast java/lang/Float
/*    */     //   369: astore #22
/*    */     //   371: aload #16
/*    */     //   373: instanceof java/lang/Float
/*    */     //   376: ifeq -> 603
/*    */     //   379: aload #16
/*    */     //   381: checkcast java/lang/Float
/*    */     //   384: astore #23
/*    */     //   386: aload #17
/*    */     //   388: instanceof java/lang/Float
/*    */     //   391: ifeq -> 603
/*    */     //   394: aload #17
/*    */     //   396: checkcast java/lang/Float
/*    */     //   399: astore #24
/*    */     //   401: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   404: aload_0
/*    */     //   405: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*    */     //   408: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   413: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   416: aload #20
/*    */     //   418: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   421: astore #26
/*    */     //   423: aload #26
/*    */     //   425: instanceof li/cil/oc/api/network/Analyzable
/*    */     //   428: ifeq -> 490
/*    */     //   431: aload #26
/*    */     //   433: astore #27
/*    */     //   435: aload_0
/*    */     //   436: aload #27
/*    */     //   438: checkcast li/cil/oc/api/network/Analyzable
/*    */     //   441: aload #19
/*    */     //   443: aload #21
/*    */     //   445: invokevirtual ordinal : ()I
/*    */     //   448: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   451: aload #22
/*    */     //   453: invokevirtual Float2float : (Ljava/lang/Float;)F
/*    */     //   456: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   459: aload #23
/*    */     //   461: invokevirtual Float2float : (Ljava/lang/Float;)F
/*    */     //   464: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   467: aload #24
/*    */     //   469: invokevirtual Float2float : (Ljava/lang/Float;)F
/*    */     //   472: invokeinterface onAnalyze : (Lnet/minecraft/entity/player/EntityPlayer;IFFF)[Lli/cil/oc/api/network/Node;
/*    */     //   477: aload #18
/*    */     //   479: invokespecial processNodes : ([Lli/cil/oc/api/network/Node;Lnet/minecraft/nbt/NBTTagCompound;)V
/*    */     //   482: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   485: astore #28
/*    */     //   487: goto -> 595
/*    */     //   490: aload #26
/*    */     //   492: instanceof li/cil/oc/api/network/SidedEnvironment
/*    */     //   495: ifeq -> 541
/*    */     //   498: aload #26
/*    */     //   500: astore #29
/*    */     //   502: aload_0
/*    */     //   503: iconst_1
/*    */     //   504: anewarray li/cil/oc/api/network/Node
/*    */     //   507: dup
/*    */     //   508: iconst_0
/*    */     //   509: aload #29
/*    */     //   511: checkcast li/cil/oc/api/network/SidedEnvironment
/*    */     //   514: aload #21
/*    */     //   516: invokeinterface sidedNode : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/Node;
/*    */     //   521: aastore
/*    */     //   522: checkcast [Ljava/lang/Object;
/*    */     //   525: checkcast [Lli/cil/oc/api/network/Node;
/*    */     //   528: aload #18
/*    */     //   530: invokespecial processNodes : ([Lli/cil/oc/api/network/Node;Lnet/minecraft/nbt/NBTTagCompound;)V
/*    */     //   533: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   536: astore #28
/*    */     //   538: goto -> 595
/*    */     //   541: aload #26
/*    */     //   543: instanceof li/cil/oc/api/network/Environment
/*    */     //   546: ifeq -> 590
/*    */     //   549: aload #26
/*    */     //   551: astore #30
/*    */     //   553: aload_0
/*    */     //   554: iconst_1
/*    */     //   555: anewarray li/cil/oc/api/network/Node
/*    */     //   558: dup
/*    */     //   559: iconst_0
/*    */     //   560: aload #30
/*    */     //   562: checkcast li/cil/oc/api/network/Environment
/*    */     //   565: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*    */     //   570: aastore
/*    */     //   571: checkcast [Ljava/lang/Object;
/*    */     //   574: checkcast [Lli/cil/oc/api/network/Node;
/*    */     //   577: aload #18
/*    */     //   579: invokespecial processNodes : ([Lli/cil/oc/api/network/Node;Lnet/minecraft/nbt/NBTTagCompound;)V
/*    */     //   582: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   585: astore #28
/*    */     //   587: goto -> 595
/*    */     //   590: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   593: astore #28
/*    */     //   595: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   598: astore #25
/*    */     //   600: goto -> 608
/*    */     //   603: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   606: astore #25
/*    */     //   608: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   611: astore #5
/*    */     //   613: goto -> 621
/*    */     //   616: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   619: astore #5
/*    */     //   621: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 0
/*    */     //   #41	-> 5
/*    */     //   #42	-> 45
/*    */     //   #43	-> 85
/*    */     //   #44	-> 401
/*    */     //   #45	-> 423
/*    */     //   #46	-> 435
/*    */     //   #47	-> 490
/*    */     //   #48	-> 502
/*    */     //   #49	-> 541
/*    */     //   #50	-> 553
/*    */     //   #51	-> 590
/*    */     //   #44	-> 595
/*    */     //   #53	-> 603
/*    */     //   #42	-> 608
/*    */     //   #55	-> 616
/*    */     //   #39	-> 621
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	622	0	this	Lli/cil/oc/server/component/UpgradeBarcodeReader;
/*    */     //   0	622	1	message	Lli/cil/oc/api/network/Message;
/*    */     //   95	527	7	tablet	Lli/cil/oc/api/machine/MachineHost;
/*    */     //   174	448	10	nbt	Ljava/lang/Object;
/*    */     //   190	432	11	stack	Ljava/lang/Object;
/*    */     //   206	416	12	player	Ljava/lang/Object;
/*    */     //   222	400	13	blockPos	Ljava/lang/Object;
/*    */     //   238	384	14	side	Ljava/lang/Object;
/*    */     //   254	368	15	hitX	Ljava/lang/Object;
/*    */     //   271	351	16	hitY	Ljava/lang/Object;
/*    */     //   288	334	17	hitZ	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void processNodes(Node[] nodes, NBTTagCompound nbt) {
/* 59 */     if (nodes != null) {
/* 60 */       NBTTagList readerNBT = new NBTTagList();
/*    */       
/* 62 */       Predef$.MODULE$.refArrayOps((Object[])nodes).withFilter((Function1)new UpgradeBarcodeReader$$anonfun$processNodes$1(this)).foreach((Function1)new UpgradeBarcodeReader$$anonfun$processNodes$2(this, readerNBT));
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
/* 78 */       nbt.func_74782_a("analyzed", (NBTBase)readerNBT);
/*    */     } 
/*    */   }
/*    */   
/*    */   public UpgradeBarcodeReader(EnvironmentHost host) {}
/*    */   
/*    */   public final class UpgradeBarcodeReader$$anonfun$processNodes$1 extends AbstractFunction1<Node, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Node node) {
/*    */       return !(node == null);
/*    */     }
/*    */     
/*    */     public UpgradeBarcodeReader$$anonfun$processNodes$1(UpgradeBarcodeReader $outer) {}
/*    */   }
/*    */   
/*    */   public final class UpgradeBarcodeReader$$anonfun$processNodes$2 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final NBTTagList readerNBT$1;
/*    */     
/*    */     public UpgradeBarcodeReader$$anonfun$processNodes$2(UpgradeBarcodeReader $outer, NBTTagList readerNBT$1) {}
/*    */     
/*    */     public final void apply(Node node) {
/*    */       NBTTagCompound nodeNBT = new NBTTagCompound();
/*    */       Node node1 = node;
/*    */       if (node1 instanceof Component) {
/*    */         Component component = (Component)node1;
/*    */         nodeNBT.func_74778_a("type", component.name());
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */       } else {
/*    */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */       } 
/*    */       String address = node.address();
/*    */       if (address != null && !address.isEmpty())
/*    */         nodeNBT.func_74778_a("address", node.address()); 
/*    */       this.readerNBT$1.func_74742_a((NBTBase)nodeNBT);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeBarcodeReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */