/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.driver.SidedBlock;
/*     */ import li.cil.oc.api.network.Connector;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.event.BlockChangeHandler$;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t}a\001B\001\003\0015\021\021\"\0269he\006$W-\024$\013\005\r!\021!C2p[B|g.\0328u\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011\003\002\001\017-9\002\"a\004\013\016\003AQ!!\005\n\002\rA\024XMZ1c\025\t\031b!A\002ba&L!!\006\t\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\t\003/-r!\001\007\025\017\005e)cB\001\016$\035\tY\"E\004\002\035C9\021Q\004I\007\002=)\021q\004D\001\007yI|w\016\036 \n\003-I!!\003\006\n\005\035A\021B\001\023\007\003\031\031w.\\7p]&\021aeJ\001\006KZ,g\016\036\006\003I\031I!!\013\026\002%\tcwnY6DQ\006tw-\032%b]\022dWM\035\006\003M\035J!\001L\027\003\035\rC\027M\\4f\031&\034H/\0328fe*\021\021F\013\t\003_Ij\021\001\r\006\003cI\ta\001\032:jm\026\024\030BA\0321\005)!UM^5dK&sgm\034\005\tk\001\021)\031!C\001m\005!\001n\\:u+\0059\004C\001\035<\033\005I$B\001\036\023\003\035qW\r^<pe.L!\001P\035\003\037\025sg/\033:p]6,g\016\036%pgRD\001B\020\001\003\002\003\006IaN\001\006Q>\034H\017\t\005\t\001\002\021)\031!C\001\003\006)1m\\8sIV\t!\t\005\002D\r6\tAI\003\002F\r\005!Q\017^5m\023\t9EIA\007CY>\0347\016U8tSRLwN\034\005\t\023\002\021\t\021)A\005\005\00611m\\8sI\002B\001b\023\001\003\006\004%\t\001T\001\004I&\024X#A'\021\0059+V\"A(\013\005\025\003&B\001\023R\025\t\0216+\001\bnS:,7M]1gi\032|'oZ3\013\003Q\0131A\\3u\023\t1vJ\001\bG_J<W\rR5sK\016$\030n\0348\t\021a\003!\021!Q\001\n5\013A\001Z5sA!)!\f\001C\0017\0061A(\0338jiz\"B\001\0300`AB\021Q\fA\007\002\005!)Q'\027a\001o!)\001)\027a\001\005\")1*\027a\001\033\"9!\r\001b\001\n\003\032\027\001\0028pI\026,\022\001\032\t\003q\025L!AZ\035\003\023\r{gN\\3di>\024\bB\0025\001A\003%A-A\003o_\022,\007\005C\004k\001\001\007I\021B6\002\021=$\b.\032:F]Z,\022\001\034\t\004[B\024X\"\0018\013\003=\fQa]2bY\006L!!\0358\003\r=\003H/[8o!\tA4/\003\002us\tYQI\034<je>tW.\0328u\021\0351\b\0011A\005\n]\fAb\034;iKJ,eN^0%KF$\"\001_>\021\0055L\030B\001>o\005\021)f.\033;\t\017q,\030\021!a\001Y\006\031\001\020J\031\t\ry\004\001\025)\003m\003%yG\017[3s\013:4\b\005C\005\002\002\001\001\r\021\"\003\002\004\005Aq\016\0365fe\022\023h/\006\002\002\006A!Q\016]A\004!\035i\027\021BA\007\003#I1!a\003o\005\031!V\017\0357feA\031\001(a\004\n\005UI\004cA\030\002\024%\031\021Q\003\031\003\025MKG-\0323CY>\0347\016C\005\002\032\001\001\r\021\"\003\002\034\005aq\016\0365fe\022\023ho\030\023fcR\031\0010!\b\t\023q\f9\"!AA\002\005\025\001\002CA\021\001\001\006K!!\002\002\023=$\b.\032:EeZ\004\003\"CA\023\001\001\007I\021BA\024\003%\021Gn\\2l\t\006$\030-\006\002\002*A!Q\016]A\026!\021\ti#a\f\016\003\0011a!!\r\001\t\005M\"!\003\"m_\016\\G)\031;b'\021\ty#!\016\021\0075\f9$C\002\002:9\024a!\0218z%\0264\007bCA\037\003_\021)\031!C\001\003\tAA\\1nKV\021\021\021\t\t\005\003\007\nIED\002n\003\013J1!a\022o\003\031\001&/\0323fM&!\0211JA'\005\031\031FO]5oO*\031\021q\t8\t\027\005E\023q\006B\001B\003%\021\021I\001\006]\006lW\r\t\005\f\003+\nyC!b\001\n\003\t9&\001\003eCR\fWCAA-!\021\tY&!\032\016\005\005u#\002BA0\003C\n1A\0342u\025\r\t\031gU\001\n[&tWm\031:bMRLA!a\032\002^\tqaJ\021+UC\036\034u.\0349pk:$\007bCA6\003_\021\t\021)A\005\0033\nQ\001Z1uC\002BqAWA\030\t\003\ty\007\006\004\002,\005E\0241\017\005\t\003{\ti\0071\001\002B!A\021QKA7\001\004\tI\006C\005\002x\001\001\r\021\"\003\002z\005i!\r\\8dW\022\013G/Y0%KF$2\001_A>\021%a\030QOA\001\002\004\tI\003\003\005\002\000\001\001\013\025BA\025\003)\021Gn\\2l\t\006$\030\r\t\005\n\003\007\003!\031!C!\003\013\013\021bY1o+B$\027\r^3\026\005\005\035\005cA7\002\n&\031\0211\0228\003\017\t{w\016\\3b]\"A\021q\022\001!\002\023\t9)\001\006dC:,\006\017Z1uK\002B!\"a%\001\021\013\007IQBAK\003)!WM^5dK&sgm\\\013\003\003/\003\002\"!'\002$\006\035\026qU\007\003\0037SA!!(\002 \006I\021.\\7vi\006\024G.\032\006\004\003Cs\027AC2pY2,7\r^5p]&!\021QUAN\005\ri\025\r\035\t\005\003S\013\031,\004\002\002,*!\021QVAX\003\021a\027M\\4\013\005\005E\026\001\0026bm\006LA!a\023\002,\"Q\021q\027\001\t\002\003\006k!a&\002\027\021,g/[2f\023:4w\016\t\005\b\003w\003A\021IA_\00359W\r\036#fm&\034W-\0238g_R\021\021q\030\t\t\003\003\f)-!\021\002B5\021\0211\031\006\004\013\006=\026\002BAS\003\007Dq!!3\001\t\023\tY-A\005pi\",'OT8eKR)\0010!4\002^\"A\021qZAd\001\004\t\t.\001\003uS2,\007\003BAj\0033l!!!6\013\t\005]\027\021M\001\013i&dW-\0328uSRL\030\002BAn\003+\024!\002V5mK\026sG/\033;z\021!\ty.a2A\002\005\005\030!\0014\021\r5\f\031/a:y\023\r\t)O\034\002\n\rVt7\r^5p]F\0022\001OAu\023\r\tY/\017\002\005\035>$W\rC\004\002p\002!I!!=\002!U\004H-\031;f\005>,h\016Z*uCR,G#\001=\t\017\005U\b\001\"\003\002r\006QA-[:d_:tWm\031;\t\017\005e\b\001\"\021\002r\006qqN\034\"m_\016\\7\t[1oO\026$\007bBA\001\021\005\023\021_\001\007kB$\027\r^3\t\017\t\005\001\001\"\021\003\004\005IqN\\\"p]:,7\r\036\013\004q\n\025\001b\0022\002\000\002\007\021q\035\005\b\005\023\001A\021\tB\006\0031yg\016R5tG>tg.Z2u)\rA(Q\002\005\bE\n\035\001\031AAt\021\035\021\t\002\001C!\005'\tA\001\\8bIR\031\001P!\006\t\021\005}#q\002a\001\0033BqA!\007\001\t\003\022Y\"\001\003tCZ,Gc\001=\003\036!A\021q\fB\f\001\004\tI\006")
/*     */ public class UpgradeMF extends ManagedEnvironment implements BlockChangeHandler.ChangeListener, DeviceInfo {
/*     */   private final EnvironmentHost host;
/*     */   
/*  30 */   public EnvironmentHost host() { return this.host; } private final BlockPosition coord; private final ForgeDirection dir; public BlockPosition coord() { return this.coord; } public ForgeDirection dir() { return this.dir; }
/*  31 */    private final Connector node = (Connector)Network.newNode((Environment)this, Visibility.None)
/*  32 */     .withConnector()
/*  33 */     .create(); public Connector node() {
/*     */     return this.node;
/*  35 */   } private Option<Environment> li$cil$oc$server$component$UpgradeMF$$otherEnv = (Option<Environment>)None$.MODULE$; private Option<Environment> li$cil$oc$server$component$UpgradeMF$$otherEnv() { return this.li$cil$oc$server$component$UpgradeMF$$otherEnv; } public void li$cil$oc$server$component$UpgradeMF$$otherEnv_$eq(Option<Environment> x$1) { this.li$cil$oc$server$component$UpgradeMF$$otherEnv = x$1; }
/*  36 */    private Option<Tuple2<ManagedEnvironment, SidedBlock>> li$cil$oc$server$component$UpgradeMF$$otherDrv = (Option<Tuple2<ManagedEnvironment, SidedBlock>>)None$.MODULE$; public Option<Tuple2<ManagedEnvironment, SidedBlock>> li$cil$oc$server$component$UpgradeMF$$otherDrv() { return this.li$cil$oc$server$component$UpgradeMF$$otherDrv; } private void li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq(Option<Tuple2<ManagedEnvironment, SidedBlock>> x$1) { this.li$cil$oc$server$component$UpgradeMF$$otherDrv = x$1; }
/*  37 */    private Option<BlockData> blockData = (Option<BlockData>)None$.MODULE$; private Option<BlockData> blockData() { return this.blockData; } private void blockData_$eq(Option<BlockData> x$1) { this.blockData = x$1; }
/*     */    private final boolean canUpdate = true; private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public boolean canUpdate() {
/*  39 */     return this.canUpdate;
/*     */   }
/*  41 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  42 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "bus");
/*  43 */         (new Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Remote Adapter");
/*  44 */         (new Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "Scummtech, Inc.");
/*  45 */         (new Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "ERR NAME NOT FOUND"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  48 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */   
/*     */   private void otherNode(TileEntity tile, Function1 f) {
/*  51 */     Option option = Network$.MODULE$.getNetworkNode(tile, dir());
/*  52 */     if (option instanceof Some) { Some some = (Some)option; Node otherNode = (Node)some.x(); BoxedUnit boxedUnit = (BoxedUnit)f.apply(otherNode); }
/*  53 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } private void updateBoundState() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   4: ifnull -> 1259
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   11: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*     */     //   16: ifnull -> 1259
/*     */     //   19: aload_0
/*     */     //   20: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   23: invokevirtual world : ()Lscala/Option;
/*     */     //   26: new li/cil/oc/server/component/UpgradeMF$$anonfun$updateBoundState$1
/*     */     //   29: dup
/*     */     //   30: aload_0
/*     */     //   31: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   34: invokevirtual exists : (Lscala/Function1;)Z
/*     */     //   37: ifeq -> 1259
/*     */     //   40: aload_0
/*     */     //   41: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   44: invokevirtual toVec3 : ()Lnet/minecraft/util/Vec3;
/*     */     //   47: aload_0
/*     */     //   48: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   51: invokeinterface xPosition : ()D
/*     */     //   56: aload_0
/*     */     //   57: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   60: invokeinterface yPosition : ()D
/*     */     //   65: aload_0
/*     */     //   66: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   69: invokeinterface zPosition : ()D
/*     */     //   74: invokestatic func_72443_a : (DDD)Lnet/minecraft/util/Vec3;
/*     */     //   77: invokevirtual func_72438_d : (Lnet/minecraft/util/Vec3;)D
/*     */     //   80: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   83: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   86: invokevirtual mfuRange : ()I
/*     */     //   89: i2d
/*     */     //   90: dcmpg
/*     */     //   91: ifgt -> 1259
/*     */     //   94: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   97: aload_0
/*     */     //   98: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   101: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   106: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   109: aload_0
/*     */     //   110: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   113: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   116: astore_1
/*     */     //   117: aload_1
/*     */     //   118: instanceof li/cil/oc/api/network/Environment
/*     */     //   121: ifeq -> 364
/*     */     //   124: aload_1
/*     */     //   125: astore_2
/*     */     //   126: aload_0
/*     */     //   127: invokespecial li$cil$oc$server$component$UpgradeMF$$otherEnv : ()Lscala/Option;
/*     */     //   130: astore #4
/*     */     //   132: aload #4
/*     */     //   134: instanceof scala/Some
/*     */     //   137: ifeq -> 201
/*     */     //   140: aload #4
/*     */     //   142: checkcast scala/Some
/*     */     //   145: astore #5
/*     */     //   147: aload #5
/*     */     //   149: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   152: checkcast li/cil/oc/api/network/Environment
/*     */     //   155: astore #6
/*     */     //   157: aload #6
/*     */     //   159: instanceof net/minecraft/tileentity/TileEntity
/*     */     //   162: ifeq -> 201
/*     */     //   165: aload #6
/*     */     //   167: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   170: astore #7
/*     */     //   172: aload_0
/*     */     //   173: aload #7
/*     */     //   175: new li/cil/oc/server/component/UpgradeMF$$anonfun$updateBoundState$2
/*     */     //   178: dup
/*     */     //   179: aload_0
/*     */     //   180: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   183: invokespecial otherNode : (Lnet/minecraft/tileentity/TileEntity;Lscala/Function1;)V
/*     */     //   186: aload_0
/*     */     //   187: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   190: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherEnv_$eq : (Lscala/Option;)V
/*     */     //   193: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   196: astore #8
/*     */     //   198: goto -> 206
/*     */     //   201: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   204: astore #8
/*     */     //   206: aload_0
/*     */     //   207: new scala/Some
/*     */     //   210: dup
/*     */     //   211: aload_2
/*     */     //   212: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   215: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherEnv_$eq : (Lscala/Option;)V
/*     */     //   218: aload_0
/*     */     //   219: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherDrv : ()Lscala/Option;
/*     */     //   222: astore #9
/*     */     //   224: aload #9
/*     */     //   226: instanceof scala/Some
/*     */     //   229: ifeq -> 339
/*     */     //   232: aload #9
/*     */     //   234: checkcast scala/Some
/*     */     //   237: astore #10
/*     */     //   239: aload #10
/*     */     //   241: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   244: checkcast scala/Tuple2
/*     */     //   247: astore #11
/*     */     //   249: aload #11
/*     */     //   251: ifnull -> 339
/*     */     //   254: aload #11
/*     */     //   256: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   259: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   262: astore #12
/*     */     //   264: aload_0
/*     */     //   265: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   268: aload #12
/*     */     //   270: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   275: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   280: aload #12
/*     */     //   282: aload_0
/*     */     //   283: invokespecial blockData : ()Lscala/Option;
/*     */     //   286: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   289: checkcast li/cil/oc/server/component/UpgradeMF$BlockData
/*     */     //   292: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   295: invokeinterface save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   300: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   303: aload #12
/*     */     //   305: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   310: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   313: new li/cil/oc/server/component/UpgradeMF$$anonfun$updateBoundState$3
/*     */     //   316: dup
/*     */     //   317: aload_0
/*     */     //   318: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   321: invokevirtual foreach : (Lscala/Function1;)V
/*     */     //   324: aload_0
/*     */     //   325: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   328: invokespecial li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq : (Lscala/Option;)V
/*     */     //   331: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   334: astore #13
/*     */     //   336: goto -> 344
/*     */     //   339: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   342: astore #13
/*     */     //   344: aload_0
/*     */     //   345: aload_2
/*     */     //   346: new li/cil/oc/server/component/UpgradeMF$$anonfun$updateBoundState$4
/*     */     //   349: dup
/*     */     //   350: aload_0
/*     */     //   351: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   354: invokespecial otherNode : (Lnet/minecraft/tileentity/TileEntity;Lscala/Function1;)V
/*     */     //   357: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   360: astore_3
/*     */     //   361: goto -> 1259
/*     */     //   364: aload_0
/*     */     //   365: invokespecial li$cil$oc$server$component$UpgradeMF$$otherEnv : ()Lscala/Option;
/*     */     //   368: astore #14
/*     */     //   370: aload #14
/*     */     //   372: instanceof scala/Some
/*     */     //   375: ifeq -> 439
/*     */     //   378: aload #14
/*     */     //   380: checkcast scala/Some
/*     */     //   383: astore #15
/*     */     //   385: aload #15
/*     */     //   387: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   390: checkcast li/cil/oc/api/network/Environment
/*     */     //   393: astore #16
/*     */     //   395: aload #16
/*     */     //   397: instanceof net/minecraft/tileentity/TileEntity
/*     */     //   400: ifeq -> 439
/*     */     //   403: aload #16
/*     */     //   405: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   408: astore #17
/*     */     //   410: aload_0
/*     */     //   411: aload #17
/*     */     //   413: new li/cil/oc/server/component/UpgradeMF$$anonfun$updateBoundState$5
/*     */     //   416: dup
/*     */     //   417: aload_0
/*     */     //   418: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   421: invokespecial otherNode : (Lnet/minecraft/tileentity/TileEntity;Lscala/Function1;)V
/*     */     //   424: aload_0
/*     */     //   425: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   428: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherEnv_$eq : (Lscala/Option;)V
/*     */     //   431: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   434: astore #18
/*     */     //   436: goto -> 444
/*     */     //   439: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   442: astore #18
/*     */     //   444: new scala/Tuple4
/*     */     //   447: dup
/*     */     //   448: aload_0
/*     */     //   449: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   452: invokevirtual world : ()Lscala/Option;
/*     */     //   455: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   458: aload_0
/*     */     //   459: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   462: invokevirtual x : ()I
/*     */     //   465: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   468: aload_0
/*     */     //   469: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   472: invokevirtual y : ()I
/*     */     //   475: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   478: aload_0
/*     */     //   479: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   482: invokevirtual z : ()I
/*     */     //   485: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   488: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   491: astore #20
/*     */     //   493: aload #20
/*     */     //   495: ifnull -> 1249
/*     */     //   498: aload #20
/*     */     //   500: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   503: checkcast net/minecraft/world/World
/*     */     //   506: astore #21
/*     */     //   508: aload #20
/*     */     //   510: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   513: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   516: istore #22
/*     */     //   518: aload #20
/*     */     //   520: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   523: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   526: istore #23
/*     */     //   528: aload #20
/*     */     //   530: invokevirtual _4 : ()Ljava/lang/Object;
/*     */     //   533: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   536: istore #24
/*     */     //   538: new scala/Tuple4
/*     */     //   541: dup
/*     */     //   542: aload #21
/*     */     //   544: iload #22
/*     */     //   546: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   549: iload #23
/*     */     //   551: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   554: iload #24
/*     */     //   556: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   559: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   562: astore #25
/*     */     //   564: aload #25
/*     */     //   566: astore #19
/*     */     //   568: aload #19
/*     */     //   570: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   573: checkcast net/minecraft/world/World
/*     */     //   576: astore #26
/*     */     //   578: aload #19
/*     */     //   580: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   583: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   586: istore #27
/*     */     //   588: aload #19
/*     */     //   590: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   593: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   596: istore #28
/*     */     //   598: aload #19
/*     */     //   600: invokevirtual _4 : ()Ljava/lang/Object;
/*     */     //   603: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   606: istore #29
/*     */     //   608: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   611: aload #26
/*     */     //   613: aload_0
/*     */     //   614: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   617: invokevirtual x : ()I
/*     */     //   620: aload_0
/*     */     //   621: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   624: invokevirtual y : ()I
/*     */     //   627: aload_0
/*     */     //   628: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   631: invokevirtual z : ()I
/*     */     //   634: aload_0
/*     */     //   635: invokevirtual dir : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   638: invokestatic driverFor : (Lnet/minecraft/world/World;IIILnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/driver/SidedBlock;
/*     */     //   641: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   644: astore #30
/*     */     //   646: aload #30
/*     */     //   648: instanceof scala/Some
/*     */     //   651: ifeq -> 1111
/*     */     //   654: aload #30
/*     */     //   656: checkcast scala/Some
/*     */     //   659: astore #31
/*     */     //   661: aload #31
/*     */     //   663: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   666: checkcast li/cil/oc/api/driver/SidedBlock
/*     */     //   669: astore #32
/*     */     //   671: aload_0
/*     */     //   672: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherDrv : ()Lscala/Option;
/*     */     //   675: astore #34
/*     */     //   677: aload #34
/*     */     //   679: instanceof scala/Some
/*     */     //   682: ifeq -> 902
/*     */     //   685: aload #34
/*     */     //   687: checkcast scala/Some
/*     */     //   690: astore #35
/*     */     //   692: aload #35
/*     */     //   694: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   697: checkcast scala/Tuple2
/*     */     //   700: astore #36
/*     */     //   702: aload #36
/*     */     //   704: ifnull -> 902
/*     */     //   707: aload #36
/*     */     //   709: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   712: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   715: astore #37
/*     */     //   717: aload #36
/*     */     //   719: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   722: checkcast li/cil/oc/api/driver/SidedBlock
/*     */     //   725: astore #38
/*     */     //   727: aload #32
/*     */     //   729: aload #38
/*     */     //   731: astore #40
/*     */     //   733: dup
/*     */     //   734: ifnonnull -> 746
/*     */     //   737: pop
/*     */     //   738: aload #40
/*     */     //   740: ifnull -> 754
/*     */     //   743: goto -> 760
/*     */     //   746: aload #40
/*     */     //   748: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   751: ifeq -> 760
/*     */     //   754: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   757: goto -> 897
/*     */     //   760: aload_0
/*     */     //   761: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   764: invokespecial li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq : (Lscala/Option;)V
/*     */     //   767: aload_0
/*     */     //   768: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   771: invokespecial blockData_$eq : (Lscala/Option;)V
/*     */     //   774: aload_0
/*     */     //   775: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   778: aload #37
/*     */     //   780: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   785: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   790: aload #32
/*     */     //   792: aload #26
/*     */     //   794: iload #27
/*     */     //   796: iload #28
/*     */     //   798: iload #29
/*     */     //   800: aload_0
/*     */     //   801: invokevirtual dir : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   804: invokeinterface createEnvironment : (Lnet/minecraft/world/World;IIILnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   809: astore #41
/*     */     //   811: aload #41
/*     */     //   813: ifnonnull -> 822
/*     */     //   816: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   819: goto -> 897
/*     */     //   822: aload_0
/*     */     //   823: new scala/Some
/*     */     //   826: dup
/*     */     //   827: new scala/Tuple2
/*     */     //   830: dup
/*     */     //   831: aload #41
/*     */     //   833: aload #32
/*     */     //   835: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   838: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   841: invokespecial li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq : (Lscala/Option;)V
/*     */     //   844: aload_0
/*     */     //   845: new scala/Some
/*     */     //   848: dup
/*     */     //   849: new li/cil/oc/server/component/UpgradeMF$BlockData
/*     */     //   852: dup
/*     */     //   853: aload_0
/*     */     //   854: aload #41
/*     */     //   856: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   859: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   862: new net/minecraft/nbt/NBTTagCompound
/*     */     //   865: dup
/*     */     //   866: invokespecial <init> : ()V
/*     */     //   869: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   872: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   875: invokespecial blockData_$eq : (Lscala/Option;)V
/*     */     //   878: aload_0
/*     */     //   879: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   882: aload #41
/*     */     //   884: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   889: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   894: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   897: astore #39
/*     */     //   899: goto -> 1103
/*     */     //   902: aload #32
/*     */     //   904: aload #26
/*     */     //   906: iload #27
/*     */     //   908: iload #28
/*     */     //   910: iload #29
/*     */     //   912: aload_0
/*     */     //   913: invokevirtual dir : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   916: invokeinterface createEnvironment : (Lnet/minecraft/world/World;IIILnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   921: astore #42
/*     */     //   923: aload #42
/*     */     //   925: ifnonnull -> 934
/*     */     //   928: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   931: goto -> 1101
/*     */     //   934: aload_0
/*     */     //   935: new scala/Some
/*     */     //   938: dup
/*     */     //   939: new scala/Tuple2
/*     */     //   942: dup
/*     */     //   943: aload #42
/*     */     //   945: aload #32
/*     */     //   947: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   950: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   953: invokespecial li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq : (Lscala/Option;)V
/*     */     //   956: aload_0
/*     */     //   957: invokespecial blockData : ()Lscala/Option;
/*     */     //   960: astore #43
/*     */     //   962: aload #43
/*     */     //   964: instanceof scala/Some
/*     */     //   967: ifeq -> 1043
/*     */     //   970: aload #43
/*     */     //   972: checkcast scala/Some
/*     */     //   975: astore #44
/*     */     //   977: aload #44
/*     */     //   979: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   982: checkcast li/cil/oc/server/component/UpgradeMF$BlockData
/*     */     //   985: astore #45
/*     */     //   987: aload #45
/*     */     //   989: invokevirtual name : ()Ljava/lang/String;
/*     */     //   992: aload #42
/*     */     //   994: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   997: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   1000: astore #46
/*     */     //   1002: dup
/*     */     //   1003: ifnonnull -> 1015
/*     */     //   1006: pop
/*     */     //   1007: aload #46
/*     */     //   1009: ifnull -> 1023
/*     */     //   1012: goto -> 1043
/*     */     //   1015: aload #46
/*     */     //   1017: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1020: ifeq -> 1043
/*     */     //   1023: aload #42
/*     */     //   1025: aload #45
/*     */     //   1027: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   1030: invokeinterface load : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   1035: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1038: astore #47
/*     */     //   1040: goto -> 1048
/*     */     //   1043: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1046: astore #47
/*     */     //   1048: aload_0
/*     */     //   1049: new scala/Some
/*     */     //   1052: dup
/*     */     //   1053: new li/cil/oc/server/component/UpgradeMF$BlockData
/*     */     //   1056: dup
/*     */     //   1057: aload_0
/*     */     //   1058: aload #42
/*     */     //   1060: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1063: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   1066: new net/minecraft/nbt/NBTTagCompound
/*     */     //   1069: dup
/*     */     //   1070: invokespecial <init> : ()V
/*     */     //   1073: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   1076: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1079: invokespecial blockData_$eq : (Lscala/Option;)V
/*     */     //   1082: aload_0
/*     */     //   1083: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   1086: aload #42
/*     */     //   1088: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   1093: invokeinterface connect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   1098: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1101: astore #39
/*     */     //   1103: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1106: astore #33
/*     */     //   1108: goto -> 1242
/*     */     //   1111: aload_0
/*     */     //   1112: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherDrv : ()Lscala/Option;
/*     */     //   1115: astore #48
/*     */     //   1117: aload #48
/*     */     //   1119: instanceof scala/Some
/*     */     //   1122: ifeq -> 1232
/*     */     //   1125: aload #48
/*     */     //   1127: checkcast scala/Some
/*     */     //   1130: astore #49
/*     */     //   1132: aload #49
/*     */     //   1134: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1137: checkcast scala/Tuple2
/*     */     //   1140: astore #50
/*     */     //   1142: aload #50
/*     */     //   1144: ifnull -> 1232
/*     */     //   1147: aload #50
/*     */     //   1149: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   1152: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   1155: astore #51
/*     */     //   1157: aload_0
/*     */     //   1158: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   1161: aload #51
/*     */     //   1163: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   1168: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   1173: aload #51
/*     */     //   1175: aload_0
/*     */     //   1176: invokespecial blockData : ()Lscala/Option;
/*     */     //   1179: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1182: checkcast li/cil/oc/server/component/UpgradeMF$BlockData
/*     */     //   1185: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   1188: invokeinterface save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   1193: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   1196: aload #51
/*     */     //   1198: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   1203: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1206: new li/cil/oc/server/component/UpgradeMF$$anonfun$updateBoundState$6
/*     */     //   1209: dup
/*     */     //   1210: aload_0
/*     */     //   1211: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   1214: invokevirtual foreach : (Lscala/Function1;)V
/*     */     //   1217: aload_0
/*     */     //   1218: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   1221: invokespecial li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq : (Lscala/Option;)V
/*     */     //   1224: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1227: astore #52
/*     */     //   1229: goto -> 1237
/*     */     //   1232: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1235: astore #52
/*     */     //   1237: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1240: astore #33
/*     */     //   1242: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1245: astore_3
/*     */     //   1246: goto -> 1259
/*     */     //   1249: new scala/MatchError
/*     */     //   1252: dup
/*     */     //   1253: aload #20
/*     */     //   1255: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1258: athrow
/*     */     //   1259: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #58	-> 0
/*     */     //   #59	-> 40
/*     */     //   #60	-> 94
/*     */     //   #61	-> 117
/*     */     //   #62	-> 126
/*     */     //   #63	-> 132
/*     */     //   #64	-> 172
/*     */     //   #65	-> 186
/*     */     //   #63	-> 196
/*     */     //   #66	-> 201
/*     */     //   #68	-> 206
/*     */     //   #70	-> 218
/*     */     //   #71	-> 224
/*     */     //   #72	-> 264
/*     */     //   #73	-> 280
/*     */     //   #74	-> 300
/*     */     //   #75	-> 324
/*     */     //   #71	-> 334
/*     */     //   #76	-> 339
/*     */     //   #78	-> 344
/*     */     //   #61	-> 360
/*     */     //   #81	-> 364
/*     */     //   #82	-> 370
/*     */     //   #83	-> 410
/*     */     //   #84	-> 424
/*     */     //   #82	-> 434
/*     */     //   #85	-> 439
/*     */     //   #87	-> 444
/*     */     //   #88	-> 608
/*     */     //   #89	-> 646
/*     */     //   #90	-> 671
/*     */     //   #91	-> 677
/*     */     //   #92	-> 727
/*     */     //   #94	-> 760
/*     */     //   #95	-> 767
/*     */     //   #96	-> 774
/*     */     //   #99	-> 790
/*     */     //   #100	-> 811
/*     */     //   #101	-> 822
/*     */     //   #102	-> 844
/*     */     //   #103	-> 878
/*     */     //   #92	-> 897
/*     */     //   #108	-> 902
/*     */     //   #109	-> 923
/*     */     //   #110	-> 934
/*     */     //   #111	-> 956
/*     */     //   #112	-> 962
/*     */     //   #113	-> 1023
/*     */     //   #114	-> 1043
/*     */     //   #116	-> 1048
/*     */     //   #117	-> 1082
/*     */     //   #106	-> 1101
/*     */     //   #90	-> 1103
/*     */     //   #120	-> 1111
/*     */     //   #121	-> 1117
/*     */     //   #123	-> 1157
/*     */     //   #124	-> 1173
/*     */     //   #125	-> 1193
/*     */     //   #126	-> 1217
/*     */     //   #121	-> 1227
/*     */     //   #127	-> 1232
/*     */     //   #120	-> 1237
/*     */     //   #88	-> 1242
/*     */     //   #79	-> 1245
/*     */     //   #87	-> 1249
/*     */     //   #58	-> 1259
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1260	0	this	Lli/cil/oc/server/component/UpgradeMF;
/*     */     //   157	1103	6	environment	Lli/cil/oc/api/network/Environment;
/*     */     //   264	996	12	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   395	865	16	environment	Lli/cil/oc/api/network/Environment;
/*     */     //   508	752	21	world	Lnet/minecraft/world/World;
/*     */     //   518	742	22	x	I
/*     */     //   528	732	23	y	I
/*     */     //   538	722	24	z	I
/*     */     //   578	667	26	world	Lnet/minecraft/world/World;
/*     */     //   588	657	27	x	I
/*     */     //   598	647	28	y	I
/*     */     //   608	637	29	z	I
/*     */     //   671	589	32	newDriver	Lli/cil/oc/api/driver/SidedBlock;
/*     */     //   717	543	37	oldEnvironment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   727	533	38	driver	Lli/cil/oc/api/driver/SidedBlock;
/*     */     //   811	449	41	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   923	337	42	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   987	273	45	data	Lli/cil/oc/server/component/UpgradeMF$BlockData;
/*     */     //   1157	103	51	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */   } public final class UpgradeMF$$anonfun$updateBoundState$1 extends AbstractFunction1<World, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(World x$1) {
/*  58 */       return (x$1.field_73011_w.field_76574_g == (this.$outer.host().world()).field_73011_w.field_76574_g);
/*     */     }
/*     */     public UpgradeMF$$anonfun$updateBoundState$1(UpgradeMF $outer) {} }
/*     */   public final class UpgradeMF$$anonfun$updateBoundState$2 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Node x$1) {
/*  64 */       this.$outer.node().disconnect(x$1);
/*     */     }
/*     */     
/*     */     public UpgradeMF$$anonfun$updateBoundState$2(UpgradeMF $outer) {} }
/*     */ 
/*     */   
/*     */   public final class UpgradeMF$$anonfun$updateBoundState$3 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Node x$2) {
/*  74 */       x$2.remove();
/*     */     } public UpgradeMF$$anonfun$updateBoundState$3(UpgradeMF $outer) {} }
/*     */   public final class UpgradeMF$$anonfun$updateBoundState$4 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final void apply(Node x$1) {
/*  78 */       this.$outer.node().connect(x$1);
/*     */     }
/*     */     public UpgradeMF$$anonfun$updateBoundState$4(UpgradeMF $outer) {} }
/*     */   public final class UpgradeMF$$anonfun$updateBoundState$5 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final void apply(Node x$1) {
/*  83 */       this.$outer.node().disconnect(x$1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public UpgradeMF$$anonfun$updateBoundState$5(UpgradeMF $outer) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class UpgradeMF$$anonfun$updateBoundState$6
/*     */     extends AbstractFunction1<Node, BoxedUnit>
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
/*     */     public final void apply(Node x$4) {
/* 125 */       x$4.remove();
/*     */     }
/*     */     
/*     */     public UpgradeMF$$anonfun$updateBoundState$6(UpgradeMF $outer) {} }
/*     */   
/*     */   private void disconnect() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial li$cil$oc$server$component$UpgradeMF$$otherEnv : ()Lscala/Option;
/*     */     //   4: astore_1
/*     */     //   5: aload_1
/*     */     //   6: instanceof scala/Some
/*     */     //   9: ifeq -> 67
/*     */     //   12: aload_1
/*     */     //   13: checkcast scala/Some
/*     */     //   16: astore_2
/*     */     //   17: aload_2
/*     */     //   18: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   21: checkcast li/cil/oc/api/network/Environment
/*     */     //   24: astore_3
/*     */     //   25: aload_3
/*     */     //   26: instanceof net/minecraft/tileentity/TileEntity
/*     */     //   29: ifeq -> 67
/*     */     //   32: aload_3
/*     */     //   33: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   36: astore #4
/*     */     //   38: aload_0
/*     */     //   39: aload #4
/*     */     //   41: new li/cil/oc/server/component/UpgradeMF$$anonfun$disconnect$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   49: invokespecial otherNode : (Lnet/minecraft/tileentity/TileEntity;Lscala/Function1;)V
/*     */     //   52: aload_0
/*     */     //   53: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   56: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherEnv_$eq : (Lscala/Option;)V
/*     */     //   59: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   62: astore #5
/*     */     //   64: goto -> 72
/*     */     //   67: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   70: astore #5
/*     */     //   72: aload_0
/*     */     //   73: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherDrv : ()Lscala/Option;
/*     */     //   76: astore #6
/*     */     //   78: aload #6
/*     */     //   80: instanceof scala/Some
/*     */     //   83: ifeq -> 193
/*     */     //   86: aload #6
/*     */     //   88: checkcast scala/Some
/*     */     //   91: astore #7
/*     */     //   93: aload #7
/*     */     //   95: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   98: checkcast scala/Tuple2
/*     */     //   101: astore #8
/*     */     //   103: aload #8
/*     */     //   105: ifnull -> 193
/*     */     //   108: aload #8
/*     */     //   110: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   113: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   116: astore #9
/*     */     //   118: aload_0
/*     */     //   119: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   122: aload #9
/*     */     //   124: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   129: invokeinterface disconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   134: aload #9
/*     */     //   136: aload_0
/*     */     //   137: invokespecial blockData : ()Lscala/Option;
/*     */     //   140: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   143: checkcast li/cil/oc/server/component/UpgradeMF$BlockData
/*     */     //   146: invokevirtual data : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   149: invokeinterface save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   154: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   157: aload #9
/*     */     //   159: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   164: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   167: new li/cil/oc/server/component/UpgradeMF$$anonfun$disconnect$2
/*     */     //   170: dup
/*     */     //   171: aload_0
/*     */     //   172: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;)V
/*     */     //   175: invokevirtual foreach : (Lscala/Function1;)V
/*     */     //   178: aload_0
/*     */     //   179: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   182: invokespecial li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq : (Lscala/Option;)V
/*     */     //   185: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   188: astore #10
/*     */     //   190: goto -> 198
/*     */     //   193: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   196: astore #10
/*     */     //   198: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #135	-> 0
/*     */     //   #136	-> 5
/*     */     //   #137	-> 38
/*     */     //   #138	-> 52
/*     */     //   #136	-> 62
/*     */     //   #139	-> 67
/*     */     //   #141	-> 72
/*     */     //   #142	-> 78
/*     */     //   #143	-> 118
/*     */     //   #144	-> 134
/*     */     //   #145	-> 154
/*     */     //   #146	-> 178
/*     */     //   #142	-> 188
/*     */     //   #147	-> 193
/*     */     //   #134	-> 198
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	199	0	this	Lli/cil/oc/server/component/UpgradeMF;
/*     */     //   25	174	3	environment	Lli/cil/oc/api/network/Environment;
/*     */     //   118	81	9	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */   }
/*     */   
/*     */   public final class UpgradeMF$$anonfun$disconnect$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Node x$1) {
/* 137 */       this.$outer.node().disconnect(x$1);
/*     */     }
/*     */     
/*     */     public UpgradeMF$$anonfun$disconnect$1(UpgradeMF $outer) {} }
/*     */   
/*     */   public final class UpgradeMF$$anonfun$disconnect$2 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Node x$5) {
/* 145 */       x$5.remove();
/*     */     }
/*     */     
/*     */     public UpgradeMF$$anonfun$disconnect$2(UpgradeMF $outer) {} }
/*     */   
/*     */   public void onBlockChanged() {
/* 151 */     updateBoundState();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void update() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial update : ()V
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherDrv : ()Lscala/Option;
/*     */     //   8: astore_1
/*     */     //   9: aload_1
/*     */     //   10: instanceof scala/Some
/*     */     //   13: ifeq -> 67
/*     */     //   16: aload_1
/*     */     //   17: checkcast scala/Some
/*     */     //   20: astore_2
/*     */     //   21: aload_2
/*     */     //   22: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   25: checkcast scala/Tuple2
/*     */     //   28: astore_3
/*     */     //   29: aload_3
/*     */     //   30: ifnull -> 67
/*     */     //   33: aload_3
/*     */     //   34: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   37: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   40: astore #4
/*     */     //   42: aload #4
/*     */     //   44: invokeinterface canUpdate : ()Z
/*     */     //   49: ifeq -> 67
/*     */     //   52: aload #4
/*     */     //   54: invokeinterface update : ()V
/*     */     //   59: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   62: astore #5
/*     */     //   64: goto -> 72
/*     */     //   67: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   70: astore #5
/*     */     //   72: aload_0
/*     */     //   73: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   76: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   81: invokevirtual func_82737_E : ()J
/*     */     //   84: l2d
/*     */     //   85: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   88: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   91: invokevirtual tickFrequency : ()D
/*     */     //   94: drem
/*     */     //   95: iconst_0
/*     */     //   96: i2d
/*     */     //   97: dcmpl
/*     */     //   98: ifne -> 178
/*     */     //   101: aload_0
/*     */     //   102: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   105: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   108: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   111: invokevirtual mfuCost : ()D
/*     */     //   114: dneg
/*     */     //   115: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   118: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   121: invokevirtual tickFrequency : ()D
/*     */     //   124: dmul
/*     */     //   125: aload_0
/*     */     //   126: invokevirtual coord : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   129: invokevirtual toVec3 : ()Lnet/minecraft/util/Vec3;
/*     */     //   132: aload_0
/*     */     //   133: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   136: invokeinterface xPosition : ()D
/*     */     //   141: aload_0
/*     */     //   142: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   145: invokeinterface yPosition : ()D
/*     */     //   150: aload_0
/*     */     //   151: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   154: invokeinterface zPosition : ()D
/*     */     //   159: invokestatic func_72443_a : (DDD)Lnet/minecraft/util/Vec3;
/*     */     //   162: invokevirtual func_72438_d : (Lnet/minecraft/util/Vec3;)D
/*     */     //   165: dmul
/*     */     //   166: invokeinterface tryChangeBuffer : (D)Z
/*     */     //   171: ifne -> 178
/*     */     //   174: aload_0
/*     */     //   175: invokespecial disconnect : ()V
/*     */     //   178: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #154	-> 0
/*     */     //   #155	-> 4
/*     */     //   #156	-> 9
/*     */     //   #157	-> 67
/*     */     //   #159	-> 72
/*     */     //   #160	-> 101
/*     */     //   #161	-> 125
/*     */     //   #160	-> 166
/*     */     //   #162	-> 174
/*     */     //   #153	-> 178
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	179	0	this	Lli/cil/oc/server/component/UpgradeMF;
/*     */     //   42	137	4	env	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {
/* 168 */     super.onConnect(node);
/* 169 */     Connector connector = node(); if (node == null) { if (connector != null) return;  } else { if (node.equals(connector))
/*     */       
/* 171 */       { BlockChangeHandler$.MODULE$.addListener(this, coord());
/*     */         
/* 173 */         updateBoundState(); return; }  return; }  BlockChangeHandler$.MODULE$.addListener(this, coord()); updateBoundState();
/*     */   }
/*     */   public void onDisconnect(Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onDisconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   5: aload_0
/*     */     //   6: invokespecial li$cil$oc$server$component$UpgradeMF$$otherEnv : ()Lscala/Option;
/*     */     //   9: astore_2
/*     */     //   10: aload_2
/*     */     //   11: instanceof scala/Some
/*     */     //   14: ifeq -> 69
/*     */     //   17: aload_2
/*     */     //   18: checkcast scala/Some
/*     */     //   21: astore_3
/*     */     //   22: aload_3
/*     */     //   23: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   26: checkcast li/cil/oc/api/network/Environment
/*     */     //   29: astore #4
/*     */     //   31: aload #4
/*     */     //   33: instanceof net/minecraft/tileentity/TileEntity
/*     */     //   36: ifeq -> 69
/*     */     //   39: aload #4
/*     */     //   41: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   44: astore #5
/*     */     //   46: aload_0
/*     */     //   47: aload #5
/*     */     //   49: new li/cil/oc/server/component/UpgradeMF$$anonfun$onDisconnect$1
/*     */     //   52: dup
/*     */     //   53: aload_0
/*     */     //   54: aload_1
/*     */     //   55: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeMF;Lli/cil/oc/api/network/Node;)V
/*     */     //   58: invokespecial otherNode : (Lnet/minecraft/tileentity/TileEntity;Lscala/Function1;)V
/*     */     //   61: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   64: astore #6
/*     */     //   66: goto -> 74
/*     */     //   69: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   72: astore #6
/*     */     //   74: aload_0
/*     */     //   75: invokevirtual li$cil$oc$server$component$UpgradeMF$$otherDrv : ()Lscala/Option;
/*     */     //   78: astore #7
/*     */     //   80: aload #7
/*     */     //   82: instanceof scala/Some
/*     */     //   85: ifeq -> 166
/*     */     //   88: aload #7
/*     */     //   90: checkcast scala/Some
/*     */     //   93: astore #8
/*     */     //   95: aload #8
/*     */     //   97: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   100: checkcast scala/Tuple2
/*     */     //   103: astore #9
/*     */     //   105: aload #9
/*     */     //   107: ifnull -> 166
/*     */     //   110: aload #9
/*     */     //   112: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   115: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   118: astore #10
/*     */     //   120: aload_1
/*     */     //   121: aload #10
/*     */     //   123: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   128: astore #11
/*     */     //   130: dup
/*     */     //   131: ifnonnull -> 143
/*     */     //   134: pop
/*     */     //   135: aload #11
/*     */     //   137: ifnull -> 151
/*     */     //   140: goto -> 166
/*     */     //   143: aload #11
/*     */     //   145: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   148: ifeq -> 166
/*     */     //   151: aload_0
/*     */     //   152: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   155: invokespecial li$cil$oc$server$component$UpgradeMF$$otherDrv_$eq : (Lscala/Option;)V
/*     */     //   158: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   161: astore #12
/*     */     //   163: goto -> 171
/*     */     //   166: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   169: astore #12
/*     */     //   171: aload_1
/*     */     //   172: aload_0
/*     */     //   173: invokevirtual node : ()Lli/cil/oc/api/network/Connector;
/*     */     //   176: astore #13
/*     */     //   178: dup
/*     */     //   179: ifnonnull -> 191
/*     */     //   182: pop
/*     */     //   183: aload #13
/*     */     //   185: ifnull -> 199
/*     */     //   188: goto -> 206
/*     */     //   191: aload #13
/*     */     //   193: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   196: ifeq -> 206
/*     */     //   199: getstatic li/cil/oc/common/event/BlockChangeHandler$.MODULE$ : Lli/cil/oc/common/event/BlockChangeHandler$;
/*     */     //   202: aload_0
/*     */     //   203: invokevirtual removeListener : (Lli/cil/oc/common/event/BlockChangeHandler$ChangeListener;)V
/*     */     //   206: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #178	-> 0
/*     */     //   #179	-> 5
/*     */     //   #180	-> 10
/*     */     //   #181	-> 69
/*     */     //   #183	-> 74
/*     */     //   #184	-> 80
/*     */     //   #185	-> 166
/*     */     //   #187	-> 171
/*     */     //   #188	-> 199
/*     */     //   #177	-> 206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	207	0	this	Lli/cil/oc/server/component/UpgradeMF;
/*     */     //   0	207	1	node	Lli/cil/oc/api/network/Node;
/*     */     //   31	176	4	env	Lli/cil/oc/api/network/Environment;
/*     */     //   120	87	10	env	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */   }
/*     */   public final class UpgradeMF$$anonfun$onDisconnect$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$1;
/*     */     public final void apply(Node otherNode) {
/* 180 */       Node node = otherNode; if (this.node$1 == null) { if (node != null) return;  } else { if (this.node$1.equals(node)) { this.$outer.li$cil$oc$server$component$UpgradeMF$$otherEnv_$eq((Option<Environment>)None$.MODULE$); return; }  return; }  this.$outer.li$cil$oc$server$component$UpgradeMF$$otherEnv_$eq((Option<Environment>)None$.MODULE$);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public UpgradeMF$$anonfun$onDisconnect$1(UpgradeMF $outer, Node node$1) {} }
/*     */ 
/*     */ 
/*     */   
/*     */   public UpgradeMF(EnvironmentHost host, BlockPosition coord, ForgeDirection dir) {}
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 193 */     super.load(nbt);
/* 194 */     Option option = Option$.MODULE$.apply(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("adapter.block").toString()));
/* 195 */     if (option instanceof Some) { Some some = (Some)option; NBTTagCompound blockNbt = (NBTTagCompound)some.x(); if (blockNbt != null) { NBTTagCompound nBTTagCompound = blockNbt;
/*     */         
/* 197 */         blockData_$eq((Option<BlockData>)new Some(new BlockData(this, nBTTagCompound.func_74779_i("name"), nBTTagCompound.func_74775_l("data")))); BoxedUnit boxedUnit1 = (nBTTagCompound.func_74764_b("name") && nBTTagCompound.func_74764_b("data")) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }
/*     */        }
/* 199 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   } public final class UpgradeMF$$anonfun$save$1 extends AbstractFunction1<BlockData, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagCompound blockNbt$1; public UpgradeMF$$anonfun$save$1(UpgradeMF $outer, NBTTagCompound blockNbt$1) {} public final void apply(UpgradeMF.BlockData data) { this.$outer.li$cil$oc$server$component$UpgradeMF$$otherDrv().foreach((Function1)new UpgradeMF$$anonfun$save$1$$anonfun$apply$1(this, data)); this.blockNbt$1.func_74778_a("name", data.name());
/*     */       this.blockNbt$1.func_74782_a("data", (NBTBase)data.data()); } public final class UpgradeMF$$anonfun$save$1$$anonfun$apply$1 extends AbstractFunction1<Tuple2<ManagedEnvironment, SidedBlock>, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final UpgradeMF.BlockData data$1; public final void apply(Tuple2 x$6) { ((Persistable)x$6._1()).save(this.data$1.data()); } public UpgradeMF$$anonfun$save$1$$anonfun$apply$1(UpgradeMF$$anonfun$save$1 $outer, UpgradeMF.BlockData data$1) {} } }
/* 204 */   public void save(NBTTagCompound nbt) { super.save(nbt);
/* 205 */     NBTTagCompound blockNbt = new NBTTagCompound();
/* 206 */     blockData().foreach((Function1)new UpgradeMF$$anonfun$save$1(this, blockNbt));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 211 */     nbt.func_74782_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("adapter.block").toString(), (NBTBase)blockNbt); }
/*     */   
/*     */   public class BlockData { private final String name; private final NBTTagCompound data;
/*     */     
/*     */     public String name() {
/* 216 */       return this.name; } public NBTTagCompound data() { return this.data; }
/*     */ 
/*     */     
/*     */     public BlockData(UpgradeMF $outer, String name, NBTTagCompound data) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeMF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */