/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import li.cil.oc.api.internal.Robot;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import li.cil.oc.util.BlockPosition$;
/*    */ import li.cil.oc.util.ExtendedWorld$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.tileentity.TileEntitySign;
/*    */ import net.minecraft.world.WorldServer;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.common.util.FakePlayer;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.None$;
/*    */ import scala.Option;
/*    */ import scala.Option$;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Some;
/*    */ import scala.Unit$;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.reflect.ClassTag$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ub!B\001\003\003\003i!aC+qOJ\fG-Z*jO:T!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\"$D\001\031\025\tI\"#\001\004ee&4XM]\005\0037a\021!\002R3wS\016,\027J\0344p\021\025i\002\001\"\001\037\003\031a\024N\\5u}Q\tq\004\005\002!\0015\t!\001\003\005#\001!\025\r\021\"\004$\003)!WM^5dK&sgm\\\013\002IA!Q\005\f\030/\033\0051#BA\024)\003%IW.\\;uC\ndWM\003\002*U\005Q1m\0347mK\016$\030n\0348\013\003-\nQa]2bY\006L!!\f\024\003\0075\013\007\017\005\0020i5\t\001G\003\0022e\005!A.\0318h\025\005\031\024\001\0026bm\006L!!\016\031\003\rM#(/\0338h\021!9\004\001#A!B\033!\023a\0033fm&\034W-\0238g_\002BQ!\017\001\005Bi\nQbZ3u\t\0264\030nY3J]\032|G#A\036\021\tqz\004\tQ\007\002{)\021aHM\001\005kRLG.\003\002.{A\021\021)\022\b\003\005\016k\021AK\005\003\t*\na\001\025:fI\0264\027BA\033G\025\t!%\006C\003I\001\031\005\021*\001\003i_N$X#\001&\021\005-sU\"\001'\013\0055\023\022a\0028fi^|'o[\005\003\0372\023q\"\0228wSJ|g.\\3oi\"{7\017\036\005\006#\002!\tBU\001\tO\026$h+\0317vKR\0211+\027\t\004\005R3\026BA++\005\025\t%O]1z!\t\021u+\003\002YU\t1\021I\\=SK\032DQA\027)A\002m\013!\002^5mK\026sG/\033;z!\r\021ELX\005\003;*\022aa\0249uS>t\007CA0g\033\005\001'BA1c\003)!\030\016\\3f]RLG/\037\006\003G\022\f\021\"\\5oK\016\024\030M\032;\013\003\025\f1A\\3u\023\t9\007M\001\bUS2,WI\034;jif\034\026n\0328\t\013%\004A\021\0036\002\021M,GOV1mk\026$2aU6m\021\025Q\006\0161\001\\\021\025i\007\0161\001A\003\021!X\r\037;\t\013=\004A\021\0039\002\021\031Lg\016Z*jO:$\"aW9\t\013It\007\031A:\002\tMLG-\032\t\003ijl\021!\036\006\003}YT!a\036=\002\r\r|W.\\8o\025\tIH-\001\bnS:,7M]1gi\032|'oZ3\n\005m,(A\004$pe\036,G)\033:fGRLwN\034\005\006{\002!IA`\001\016G\006t7\t[1oO\026\034\026n\0328\025\017}\f)!a\006\002\032A\031!)!\001\n\007\005\r!FA\004C_>dW-\0318\t\017\005\035A\0201\001\002\n\0051\001\017\\1zKJ\004B!a\003\002\0245\021\021Q\002\006\005\003\017\tyAC\002\002\022\t\fa!\0328uSRL\030\002BA\013\003\033\021A\"\0228uSRL\b\013\\1zKJDQA\027?A\002yCq!a\007}\001\004\ti\"A\003mS:,7\017E\002C)\002Cq!!\t\001\t\003\n\031#A\005p]6+7o]1hKR!\021QEA\026!\r\021\025qE\005\004\003SQ#\001B+oSRD\001\"!\f\002 \001\007\021qF\001\b[\026\0348/Y4f!\rY\025\021G\005\004\003ga%aB'fgN\fw-\032")
/*    */ public abstract class UpgradeSign extends ManagedEnvironment implements DeviceInfo {
/*    */   private Map<String, String> deviceInfo;
/*    */   
/* 32 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/* 33 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/* 34 */         (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Sign upgrade");
/* 35 */         (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 36 */         (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Labelizer Deluxe"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*    */        return this.deviceInfo; }
/*    */      }
/* 39 */   private volatile boolean bitmap$0; private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */   
/*    */   public abstract EnvironmentHost host();
/*    */   public Object[] getValue(Option tileEntity) {
/*    */     Object[] arrayOfObject;
/* 44 */     Option option = tileEntity;
/* 45 */     if (option instanceof Some) { Some some = (Some)option; TileEntitySign sign = (TileEntitySign)some.x(); arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Predef$.MODULE$.refArrayOps((Object[])sign.field_145915_a).mkString("\n") })); }
/* 46 */     else { arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no sign" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */   
/* 51 */   public Object[] setValue(Option tileEntity, String text) { Option option = tileEntity;
/* 52 */     if (option instanceof Some) { FakePlayer fakePlayer2; Some some = (Some)option; TileEntitySign sign = (TileEntitySign)some.x();
/* 53 */       EnvironmentHost environmentHost = host();
/* 54 */       if (environmentHost instanceof Robot) { Robot robot = (Robot)environmentHost; EntityPlayer entityPlayer = robot.player(); }
/* 55 */       else { fakePlayer2 = FakePlayerFactory.get((WorldServer)host().world(), Settings$.MODULE$.get().fakePlayerProfile()); }
/*    */       
/*    */       FakePlayer fakePlayer1 = fakePlayer2;
/* 58 */       String[] lines = (String[])(new StringOps(Predef$.MODULE$.augmentString(text))).lines().padTo(4, "").map((Function1)new UpgradeSign$$anonfun$1(this)).toArray(ClassTag$.MODULE$.apply(String.class));
/*    */       
/* 60 */       if (canChangeSign((EntityPlayer)fakePlayer1, sign, lines))
/*    */       
/*    */       { 
/*    */         
/* 64 */         Predef$.MODULE$.refArrayOps((Object[])lines).copyToArray(sign.field_145915_a);
/* 65 */         host().world().func_147471_g(sign.field_145851_c, sign.field_145848_d, sign.field_145849_e);
/*    */         
/* 67 */         MinecraftForge.EVENT_BUS.post((Event)new SignChangeEvent.Post(sign, lines));
/*    */         
/* 69 */         Object[] arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Predef$.MODULE$.refArrayOps((Object[])sign.field_145915_a).mkString("\n") })); }  return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not allowed" })); }
/* 70 */      return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no sign" })); } public final class UpgradeSign$$anonfun$1 extends AbstractFunction1<String, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final String apply(String line) {
/*    */       return (line.length() > 15) ? line.substring(0, 15) : line;
/*    */     } public UpgradeSign$$anonfun$1(UpgradeSign $outer) {} } public Option<TileEntitySign> findSign(ForgeDirection side) {
/*    */     None$ none$;
/* 75 */     BlockPosition hostPos = BlockPosition$.MODULE$.apply(host());
/* 76 */     TileEntity tileEntity = ExtendedWorld$.MODULE$.extendedWorld(host().world()).getTileEntity(hostPos);
/* 77 */     if (tileEntity instanceof TileEntitySign) { TileEntitySign tileEntitySign = (TileEntitySign)tileEntity; Option option = Option$.MODULE$.apply(tileEntitySign); }
/* 78 */     else { None$ none$1; TileEntity tileEntity1 = ExtendedWorld$.MODULE$.extendedWorld(host().world()).getTileEntity(hostPos.offset(side));
/* 79 */       if (tileEntity1 instanceof TileEntitySign) { TileEntitySign tileEntitySign = (TileEntitySign)tileEntity1; Option option = Option$.MODULE$.apply(tileEntitySign); }
/* 80 */       else { none$1 = None$.MODULE$; }
/*    */       
/*    */       none$ = none$1; }
/*    */     
/*    */     return (Option<TileEntitySign>)none$;
/*    */   }
/*    */   
/*    */   private boolean canChangeSign(EntityPlayer player, TileEntitySign tileEntity, String[] lines) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*    */     //   4: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   9: aload_1
/*    */     //   10: aload_2
/*    */     //   11: getfield field_145851_c : I
/*    */     //   14: aload_2
/*    */     //   15: getfield field_145848_d : I
/*    */     //   18: aload_2
/*    */     //   19: getfield field_145849_e : I
/*    */     //   22: invokevirtual func_72962_a : (Lnet/minecraft/entity/player/EntityPlayer;III)Z
/*    */     //   25: ifeq -> 182
/*    */     //   28: new net/minecraftforge/event/world/BlockEvent$BreakEvent
/*    */     //   31: dup
/*    */     //   32: aload_2
/*    */     //   33: getfield field_145851_c : I
/*    */     //   36: aload_2
/*    */     //   37: getfield field_145848_d : I
/*    */     //   40: aload_2
/*    */     //   41: getfield field_145849_e : I
/*    */     //   44: aload_0
/*    */     //   45: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*    */     //   48: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   53: aload_2
/*    */     //   54: invokevirtual func_145838_q : ()Lnet/minecraft/block/Block;
/*    */     //   57: aload_2
/*    */     //   58: invokevirtual func_145832_p : ()I
/*    */     //   61: aload_1
/*    */     //   62: invokespecial <init> : (IIILnet/minecraft/world/World;Lnet/minecraft/block/Block;ILnet/minecraft/entity/player/EntityPlayer;)V
/*    */     //   65: astore #4
/*    */     //   67: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*    */     //   70: aload #4
/*    */     //   72: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*    */     //   75: pop
/*    */     //   76: aload #4
/*    */     //   78: invokevirtual isCanceled : ()Z
/*    */     //   81: ifne -> 115
/*    */     //   84: aload #4
/*    */     //   86: invokevirtual getResult : ()Lcpw/mods/fml/common/eventhandler/Event$Result;
/*    */     //   89: getstatic cpw/mods/fml/common/eventhandler/Event$Result.DENY : Lcpw/mods/fml/common/eventhandler/Event$Result;
/*    */     //   92: astore #5
/*    */     //   94: dup
/*    */     //   95: ifnonnull -> 107
/*    */     //   98: pop
/*    */     //   99: aload #5
/*    */     //   101: ifnull -> 115
/*    */     //   104: goto -> 117
/*    */     //   107: aload #5
/*    */     //   109: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   112: ifeq -> 117
/*    */     //   115: iconst_0
/*    */     //   116: ireturn
/*    */     //   117: new li/cil/oc/api/event/SignChangeEvent$Pre
/*    */     //   120: dup
/*    */     //   121: aload_2
/*    */     //   122: aload_3
/*    */     //   123: invokespecial <init> : (Lnet/minecraft/tileentity/TileEntitySign;[Ljava/lang/String;)V
/*    */     //   126: astore #6
/*    */     //   128: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*    */     //   131: aload #6
/*    */     //   133: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*    */     //   136: pop
/*    */     //   137: aload #6
/*    */     //   139: invokevirtual isCanceled : ()Z
/*    */     //   142: ifne -> 176
/*    */     //   145: aload #6
/*    */     //   147: invokevirtual getResult : ()Lcpw/mods/fml/common/eventhandler/Event$Result;
/*    */     //   150: getstatic cpw/mods/fml/common/eventhandler/Event$Result.DENY : Lcpw/mods/fml/common/eventhandler/Event$Result;
/*    */     //   153: astore #7
/*    */     //   155: dup
/*    */     //   156: ifnonnull -> 168
/*    */     //   159: pop
/*    */     //   160: aload #7
/*    */     //   162: ifnull -> 176
/*    */     //   165: goto -> 180
/*    */     //   168: aload #7
/*    */     //   170: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   173: ifeq -> 180
/*    */     //   176: iconst_0
/*    */     //   177: goto -> 181
/*    */     //   180: iconst_1
/*    */     //   181: ireturn
/*    */     //   182: iconst_0
/*    */     //   183: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #86	-> 0
/*    */     //   #90	-> 28
/*    */     //   #91	-> 67
/*    */     //   #92	-> 76
/*    */     //   #93	-> 115
/*    */     //   #96	-> 117
/*    */     //   #97	-> 128
/*    */     //   #98	-> 137
/*    */     //   #85	-> 181
/*    */     //   #87	-> 182
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	184	0	this	Lli/cil/oc/server/component/UpgradeSign;
/*    */     //   0	184	1	player	Lnet/minecraft/entity/player/EntityPlayer;
/*    */     //   0	184	2	tileEntity	Lnet/minecraft/tileentity/TileEntitySign;
/*    */     //   0	184	3	lines	[Ljava/lang/String;
/*    */     //   67	117	4	event	Lnet/minecraftforge/event/world/BlockEvent$BreakEvent;
/*    */     //   128	56	6	signEvent	Lli/cil/oc/api/event/SignChangeEvent$Pre;
/*    */   }
/*    */   
/*    */   public void onMessage(Message message) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*    */     //   5: aload_1
/*    */     //   6: invokeinterface name : ()Ljava/lang/String;
/*    */     //   11: ldc_w 'tablet.use'
/*    */     //   14: astore_2
/*    */     //   15: dup
/*    */     //   16: ifnonnull -> 27
/*    */     //   19: pop
/*    */     //   20: aload_2
/*    */     //   21: ifnull -> 34
/*    */     //   24: goto -> 472
/*    */     //   27: aload_2
/*    */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   31: ifeq -> 472
/*    */     //   34: aload_1
/*    */     //   35: invokeinterface source : ()Lli/cil/oc/api/network/Node;
/*    */     //   40: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*    */     //   45: astore_3
/*    */     //   46: aload_3
/*    */     //   47: instanceof li/cil/oc/api/machine/Machine
/*    */     //   50: ifeq -> 467
/*    */     //   53: aload_3
/*    */     //   54: checkcast li/cil/oc/api/machine/Machine
/*    */     //   57: astore #4
/*    */     //   59: new scala/Tuple2
/*    */     //   62: dup
/*    */     //   63: aload #4
/*    */     //   65: invokeinterface host : ()Lli/cil/oc/api/machine/MachineHost;
/*    */     //   70: aload_1
/*    */     //   71: invokeinterface data : ()[Ljava/lang/Object;
/*    */     //   76: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   79: astore #6
/*    */     //   81: aload #6
/*    */     //   83: ifnull -> 454
/*    */     //   86: aload #6
/*    */     //   88: invokevirtual _1 : ()Ljava/lang/Object;
/*    */     //   91: checkcast li/cil/oc/api/machine/MachineHost
/*    */     //   94: astore #7
/*    */     //   96: aload #6
/*    */     //   98: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   101: checkcast [Ljava/lang/Object;
/*    */     //   104: astore #8
/*    */     //   106: aload #7
/*    */     //   108: instanceof li/cil/oc/api/internal/Tablet
/*    */     //   111: ifeq -> 454
/*    */     //   114: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   117: aload #8
/*    */     //   119: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   122: astore #9
/*    */     //   124: aload #9
/*    */     //   126: invokevirtual isEmpty : ()Z
/*    */     //   129: ifne -> 454
/*    */     //   132: aload #9
/*    */     //   134: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   137: ifnull -> 454
/*    */     //   140: aload #9
/*    */     //   142: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   145: checkcast scala/collection/SeqLike
/*    */     //   148: bipush #8
/*    */     //   150: invokeinterface lengthCompare : (I)I
/*    */     //   155: iconst_0
/*    */     //   156: if_icmpne -> 454
/*    */     //   159: aload #9
/*    */     //   161: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   164: checkcast scala/collection/SeqLike
/*    */     //   167: iconst_0
/*    */     //   168: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   173: astore #10
/*    */     //   175: aload #9
/*    */     //   177: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   180: checkcast scala/collection/SeqLike
/*    */     //   183: iconst_1
/*    */     //   184: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   189: astore #11
/*    */     //   191: aload #9
/*    */     //   193: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   196: checkcast scala/collection/SeqLike
/*    */     //   199: iconst_2
/*    */     //   200: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   205: astore #12
/*    */     //   207: aload #9
/*    */     //   209: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   212: checkcast scala/collection/SeqLike
/*    */     //   215: iconst_3
/*    */     //   216: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   221: astore #13
/*    */     //   223: aload #9
/*    */     //   225: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   228: checkcast scala/collection/SeqLike
/*    */     //   231: iconst_4
/*    */     //   232: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   237: astore #14
/*    */     //   239: aload #9
/*    */     //   241: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   244: checkcast scala/collection/SeqLike
/*    */     //   247: iconst_5
/*    */     //   248: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   253: astore #15
/*    */     //   255: aload #9
/*    */     //   257: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   260: checkcast scala/collection/SeqLike
/*    */     //   263: bipush #6
/*    */     //   265: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   270: astore #16
/*    */     //   272: aload #9
/*    */     //   274: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   277: checkcast scala/collection/SeqLike
/*    */     //   280: bipush #7
/*    */     //   282: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   287: astore #17
/*    */     //   289: aload #10
/*    */     //   291: instanceof net/minecraft/nbt/NBTTagCompound
/*    */     //   294: ifeq -> 454
/*    */     //   297: aload #10
/*    */     //   299: checkcast net/minecraft/nbt/NBTTagCompound
/*    */     //   302: astore #18
/*    */     //   304: aload #11
/*    */     //   306: instanceof net/minecraft/item/ItemStack
/*    */     //   309: ifeq -> 454
/*    */     //   312: aload #12
/*    */     //   314: instanceof net/minecraft/entity/player/EntityPlayer
/*    */     //   317: ifeq -> 454
/*    */     //   320: aload #13
/*    */     //   322: instanceof li/cil/oc/util/BlockPosition
/*    */     //   325: ifeq -> 454
/*    */     //   328: aload #13
/*    */     //   330: checkcast li/cil/oc/util/BlockPosition
/*    */     //   333: astore #19
/*    */     //   335: aload #14
/*    */     //   337: instanceof net/minecraftforge/common/util/ForgeDirection
/*    */     //   340: ifeq -> 454
/*    */     //   343: aload #15
/*    */     //   345: instanceof java/lang/Float
/*    */     //   348: ifeq -> 454
/*    */     //   351: aload #16
/*    */     //   353: instanceof java/lang/Float
/*    */     //   356: ifeq -> 454
/*    */     //   359: aload #17
/*    */     //   361: instanceof java/lang/Float
/*    */     //   364: ifeq -> 454
/*    */     //   367: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   370: aload_0
/*    */     //   371: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*    */     //   374: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   379: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   382: aload #19
/*    */     //   384: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   387: astore #21
/*    */     //   389: aload #21
/*    */     //   391: instanceof net/minecraft/tileentity/TileEntitySign
/*    */     //   394: ifeq -> 441
/*    */     //   397: aload #21
/*    */     //   399: checkcast net/minecraft/tileentity/TileEntitySign
/*    */     //   402: astore #22
/*    */     //   404: aload #18
/*    */     //   406: ldc_w 'signText'
/*    */     //   409: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   412: aload #22
/*    */     //   414: getfield field_145915_a : [Ljava/lang/String;
/*    */     //   417: checkcast [Ljava/lang/Object;
/*    */     //   420: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */     //   423: ldc '\\n'
/*    */     //   425: invokeinterface mkString : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   430: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   433: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   436: astore #23
/*    */     //   438: goto -> 446
/*    */     //   441: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   444: astore #23
/*    */     //   446: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   449: astore #20
/*    */     //   451: goto -> 459
/*    */     //   454: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   457: astore #20
/*    */     //   459: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   462: astore #5
/*    */     //   464: goto -> 472
/*    */     //   467: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   470: astore #5
/*    */     //   472: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #102	-> 0
/*    */     //   #103	-> 5
/*    */     //   #104	-> 46
/*    */     //   #105	-> 86
/*    */     //   #106	-> 367
/*    */     //   #107	-> 389
/*    */     //   #108	-> 404
/*    */     //   #109	-> 441
/*    */     //   #106	-> 446
/*    */     //   #111	-> 454
/*    */     //   #104	-> 459
/*    */     //   #113	-> 467
/*    */     //   #101	-> 472
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	473	0	this	Lli/cil/oc/server/component/UpgradeSign;
/*    */     //   0	473	1	message	Lli/cil/oc/api/network/Message;
/*    */     //   96	377	7	tablet	Lli/cil/oc/api/machine/MachineHost;
/*    */     //   175	298	10	nbt	Ljava/lang/Object;
/*    */     //   191	282	11	stack	Ljava/lang/Object;
/*    */     //   207	266	12	player	Ljava/lang/Object;
/*    */     //   223	250	13	blockPos	Ljava/lang/Object;
/*    */     //   239	234	14	side	Ljava/lang/Object;
/*    */     //   255	218	15	hitX	Ljava/lang/Object;
/*    */     //   272	201	16	hitY	Ljava/lang/Object;
/*    */     //   289	184	17	hitZ	Ljava/lang/Object;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeSign.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */