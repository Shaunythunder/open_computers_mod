/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.internal.Agent;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ComponentConnector;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005}e\001B\001\003\0015\021\021#\0269he\006$W-\022=qKJLWM\\2f\025\t\031A!A\005d_6\004xN\\3oi*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\rA\024XMZ1c\025\t\031b!A\002ba&L!!\006\t\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\t\003/ii\021\001\007\006\0033I\ta\001\032:jm\026\024\030BA\016\031\005)!UM^5dK&sgm\034\005\t;\001\021)\031!C\001=\005!\001n\\:u+\005y\"c\001\021#Q\031!\021\005\001\001 \0051a$/\0324j]\026lWM\034;?!\t\031c%D\001%\025\t)##A\004oKR<xN]6\n\005\035\"#aD#om&\024xN\\7f]RDun\035;\021\005%bS\"\001\026\013\005-\022\022\001C5oi\026\024h.\0317\n\0055R#!B!hK:$\b\002C\030\001\005\003\005\013\021B\020\002\013!|7\017\036\021\t\013E\002A\021\001\032\002\rqJg.\033;?)\t\031T\007\005\0025\0015\t!\001C\003\036a\001\007aGE\0028E!2A!\t\001\001m!9\021\b\001b\001\n\013Q\024\001C'bq2+g/\0327\026\003mz\021\001P\017\002=!1a\b\001Q\001\016m\n\021\"T1y\031\0264X\r\034\021\t\017\001\003!\031!C!\003\006!an\0343f+\005\021\005CA\022D\023\t!EE\001\nD_6\004xN\\3oi\016{gN\\3di>\024\bB\002$\001A\003%!)A\003o_\022,\007\005\003\005I\001!\025\r\021\"\004J\003)!WM^5dK&sgm\\\013\002\025B!1J\025+U\033\005a%BA'O\003%IW.\\;uC\ndWM\003\002P!\006Q1m\0347mK\016$\030n\0348\013\003E\013Qa]2bY\006L!a\025'\003\0075\013\007\017\005\002V56\taK\003\002X1\006!A.\0318h\025\005I\026\001\0026bm\006L!a\027,\003\rM#(/\0338h\021!i\006\001#A!B\033Q\025a\0033fm&\034W-\0238g_\002BQa\030\001\005B\001\fQbZ3u\t\0264\030nY3J]\032|G#A1\021\t\t,gMZ\007\002G*\021A\rW\001\005kRLG.\003\002TGB\021qm\033\b\003Q&l\021\001U\005\003UB\013a\001\025:fI\0264\027BA.m\025\tQ\007\013C\004o\001\001\007I\021A8\002\025\025D\b/\032:jK:\034W-F\001q!\tA\027/\003\002s!\n1Ai\\;cY\026Dq\001\036\001A\002\023\005Q/\001\bfqB,'/[3oG\026|F%Z9\025\005YL\bC\0015x\023\tA\bK\001\003V]&$\bb\002>t\003\003\005\r\001]\001\004q\022\n\004B\002?\001A\003&\001/A\006fqB,'/[3oG\026\004\003b\002@\001\001\004%\ta`\001\006Y\0264X\r\\\013\003\003\003\0012\001[A\002\023\r\t)\001\025\002\004\023:$\b\"CA\005\001\001\007I\021AA\006\003%aWM^3m?\022*\027\017F\002w\003\033A\021B_A\004\003\003\005\r!!\001\t\021\005E\001\001)Q\005\003\003\ta\001\\3wK2\004\003bBA\013\001\021\005\021qC\001\013qB4uN\035'fm\026dGc\0019\002\032!9a0a\005A\002\005\005\001BBA\017\001\021\005q.\001\bya\032{'OT3yi2+g/\0327\t\017\005\005\002\001\"\001\002$\005i\021\r\0323FqB,'/[3oG\026$2A^A\023\021\035\t9#a\bA\002A\fQA^1mk\026Dq!a\013\001\t\003\ti#\001\007va\022\fG/\032-q\023:4w\016F\001w\021\031q\b\001\"\001\0022Q1\0211GA \003\037\002R\001[A\033\003sI1!a\016Q\005\025\t%O]1z!\rA\0271H\005\004\003{\001&AB!osJ+g\r\003\005\002B\005=\002\031AA\"\003\035\031wN\034;fqR\004B!!\022\002L5\021\021q\t\006\004\003\023\022\022aB7bG\"Lg.Z\005\005\003\033\n9EA\004D_:$X\r\037;\t\021\005E\023q\006a\001\003'\nA!\031:hgB!\021QIA+\023\021\t9&a\022\003\023\005\023x-^7f]R\034\b\006DA\030\0037\n\t'a\031\002f\005\035\004\003BA#\003;JA!a\030\002H\tA1)\0317mE\006\0347.\001\004eSJ,7\r^\r\002\003\005\031Am\\2\"\005\005%\024a\0264v]\016$\030n\0348)SirW/\0342fe\002jS\006\t+iK\002\032WO\035:f]R\004C.\032<fY\002zg\rI3ya\026\024\030.\0328dK\002\032Ho\034:fI\002Jg\016\t;iSN\004S\r\0379fe&,gnY3!kB<'/\0313f]!9\021Q\016\001\005\002\005=\024aB2p]N,X.\032\013\007\003g\t\t(a\035\t\021\005\005\0231\016a\001\003\007B\001\"!\025\002l\001\007\0211\013\025\t\003W\nY&!\032\002x\005\022\021\021P\001[MVt7\r^5p]\"J#HY8pY\026\fg\016I\027.AQ\023\030.Z:!i>\0043m\0348tk6,\007%\0318!K:\034\007.\0318uK\022\004\023\016^3nAQ|\007%\0313eA\025D\b/\032:jK:\034W\r\t;pAQDW\rI;qOJ\fG-\032\030\t\017\005u\004\001\"\021\002\000\005!1/\031<f)\r1\030\021\021\005\t\003\007\013Y\b1\001\002\006\006\031aN\031;\021\t\005\035\0251S\007\003\003\023SA!a!\002\f*!\021QRAH\003%i\027N\\3de\0064GO\003\002\002\022\006\031a.\032;\n\t\005U\025\021\022\002\017\035\n#F+Y4D_6\004x.\0368e\021\035\tI\n\001C!\0037\013A\001\\8bIR\031a/!(\t\021\005\r\025q\023a\001\003\013\003")
/*     */ public class UpgradeExperience extends ManagedEnvironment implements DeviceInfo {
/*     */   private final Agent host;
/*     */   
/*  26 */   public Agent host() { return this.host; } private final int MaxLevel; public final int MaxLevel() {
/*  27 */     return 30;
/*     */   }
/*  29 */   private final ComponentConnector node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  30 */     .withComponent("experience")
/*  31 */     .withConnector(30 * Settings$.MODULE$.get().bufferPerLevel())
/*  32 */     .create(); private Map<String, String> deviceInfo;
/*     */   public ComponentConnector node() { return this.node; }
/*  34 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/*  35 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  36 */         (new Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Knowledge database");
/*  37 */         (new Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  38 */         (new Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "ERSO (Event Recorder and Self-Optimizer)");
/*  39 */         (new Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), "30"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[5])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  42 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */   
/*  44 */   private double experience = 0.0D; public double experience() { return this.experience; } public void experience_$eq(double x$1) { this.experience = x$1; }
/*     */   
/*  46 */   private int level = 0; private volatile boolean bitmap$0; public int level() { return this.level; } public void level_$eq(int x$1) { this.level = x$1; }
/*     */   
/*     */   public double xpForLevel(int level) {
/*  49 */     return (level == 0) ? 0.0D : (
/*  50 */       Settings$.MODULE$.get().baseXpToLevel() + Math.pow(level * Settings$.MODULE$.get().constantXpGrowth(), Settings$.MODULE$.get().exponentialXpGrowth()));
/*     */   } public double xpForNextLevel() {
/*  52 */     return xpForLevel(level() + 1);
/*     */   }
/*     */   public void addExperience(double value) {
/*  55 */     if (level() < 30) {
/*  56 */       experience_$eq(experience() + value);
/*  57 */       if (experience() >= xpForNextLevel()) {
/*  58 */         updateXpInfo();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateXpInfo() {
/*  66 */     level_$eq(package$.MODULE$.min((int)(Math.pow(experience() - Settings$.MODULE$.get().baseXpToLevel(), true / Settings$.MODULE$.get().exponentialXpGrowth()) / Settings$.MODULE$.get().constantXpGrowth()), 30));
/*  67 */     if (node() != null) {
/*  68 */       node().setLocalBufferSize(Settings$.MODULE$.get().bufferPerLevel() * level());
/*     */     }
/*     */   }
/*     */   
/*     */   @Callback(direct = true, doc = "function():number -- The current level of experience stored in this experience upgrade.")
/*     */   public Object[] level(Context context, Arguments args) {
/*  74 */     double xpNeeded = xpForNextLevel() - xpForLevel(level());
/*  75 */     double xpProgress = package$.MODULE$.max(0.0D, experience() - xpForLevel(level()));
/*  76 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(level() + xpProgress / xpNeeded) }));
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():boolean -- Tries to consume an enchanted item to add experience to the upgrade.")
/*     */   public Object[] consume(Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual level : ()I
/*     */     //   4: bipush #30
/*     */     //   6: if_icmplt -> 38
/*     */     //   9: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   12: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   15: iconst_2
/*     */     //   16: anewarray java/lang/Object
/*     */     //   19: dup
/*     */     //   20: iconst_0
/*     */     //   21: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   24: aastore
/*     */     //   25: dup
/*     */     //   26: iconst_1
/*     */     //   27: ldc_w 'max level'
/*     */     //   30: aastore
/*     */     //   31: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   34: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   37: areturn
/*     */     //   38: aload_0
/*     */     //   39: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   42: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   47: aload_0
/*     */     //   48: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   51: invokeinterface selectedSlot : ()I
/*     */     //   56: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   61: astore_3
/*     */     //   62: aload_3
/*     */     //   63: ifnull -> 74
/*     */     //   66: aload_3
/*     */     //   67: getfield field_77994_a : I
/*     */     //   70: iconst_1
/*     */     //   71: if_icmpge -> 103
/*     */     //   74: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   77: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   80: iconst_2
/*     */     //   81: anewarray java/lang/Object
/*     */     //   84: dup
/*     */     //   85: iconst_0
/*     */     //   86: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   89: aastore
/*     */     //   90: dup
/*     */     //   91: iconst_1
/*     */     //   92: ldc_w 'no item'
/*     */     //   95: aastore
/*     */     //   96: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   99: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   102: areturn
/*     */     //   103: iconst_0
/*     */     //   104: invokestatic create : (I)Lscala/runtime/IntRef;
/*     */     //   107: astore #4
/*     */     //   109: aload_3
/*     */     //   110: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   113: getstatic net/minecraft/init/Items.field_151062_by : Lnet/minecraft/item/Item;
/*     */     //   116: astore #5
/*     */     //   118: dup
/*     */     //   119: ifnonnull -> 131
/*     */     //   122: pop
/*     */     //   123: aload #5
/*     */     //   125: ifnull -> 139
/*     */     //   128: goto -> 188
/*     */     //   131: aload #5
/*     */     //   133: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   136: ifeq -> 188
/*     */     //   139: aload #4
/*     */     //   141: aload #4
/*     */     //   143: getfield elem : I
/*     */     //   146: iconst_3
/*     */     //   147: aload_0
/*     */     //   148: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   151: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   156: getfield field_73012_v : Ljava/util/Random;
/*     */     //   159: iconst_5
/*     */     //   160: invokevirtual nextInt : (I)I
/*     */     //   163: iadd
/*     */     //   164: aload_0
/*     */     //   165: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   168: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   173: getfield field_73012_v : Ljava/util/Random;
/*     */     //   176: iconst_5
/*     */     //   177: invokevirtual nextInt : (I)I
/*     */     //   180: iadd
/*     */     //   181: iadd
/*     */     //   182: putfield elem : I
/*     */     //   185: goto -> 264
/*     */     //   188: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   191: aload_3
/*     */     //   192: invokestatic func_82781_a : (Lnet/minecraft/item/ItemStack;)Ljava/util/Map;
/*     */     //   195: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*     */     //   198: new li/cil/oc/server/component/UpgradeExperience$$anonfun$consume$1
/*     */     //   201: dup
/*     */     //   202: aload_0
/*     */     //   203: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeExperience;)V
/*     */     //   206: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   211: new li/cil/oc/server/component/UpgradeExperience$$anonfun$consume$2
/*     */     //   214: dup
/*     */     //   215: aload_0
/*     */     //   216: aload #4
/*     */     //   218: invokespecial <init> : (Lli/cil/oc/server/component/UpgradeExperience;Lscala/runtime/IntRef;)V
/*     */     //   221: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   226: aload #4
/*     */     //   228: getfield elem : I
/*     */     //   231: iconst_0
/*     */     //   232: if_icmpgt -> 264
/*     */     //   235: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   238: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   241: iconst_2
/*     */     //   242: anewarray java/lang/Object
/*     */     //   245: dup
/*     */     //   246: iconst_0
/*     */     //   247: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   250: aastore
/*     */     //   251: dup
/*     */     //   252: iconst_1
/*     */     //   253: ldc_w 'could not extract experience from item'
/*     */     //   256: aastore
/*     */     //   257: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   260: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   263: areturn
/*     */     //   264: aload_0
/*     */     //   265: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   268: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   273: aload_0
/*     */     //   274: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   277: invokeinterface selectedSlot : ()I
/*     */     //   282: iconst_1
/*     */     //   283: invokeinterface func_70298_a : (II)Lnet/minecraft/item/ItemStack;
/*     */     //   288: astore #6
/*     */     //   290: aload #6
/*     */     //   292: ifnull -> 304
/*     */     //   295: aload #6
/*     */     //   297: getfield field_77994_a : I
/*     */     //   300: iconst_1
/*     */     //   301: if_icmpge -> 333
/*     */     //   304: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   307: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   310: iconst_2
/*     */     //   311: anewarray java/lang/Object
/*     */     //   314: dup
/*     */     //   315: iconst_0
/*     */     //   316: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   319: aastore
/*     */     //   320: dup
/*     */     //   321: iconst_1
/*     */     //   322: ldc_w 'could not consume item'
/*     */     //   325: aastore
/*     */     //   326: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   329: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   332: areturn
/*     */     //   333: aload_0
/*     */     //   334: aload #4
/*     */     //   336: getfield elem : I
/*     */     //   339: i2d
/*     */     //   340: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   343: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   346: invokevirtual constantXpGrowth : ()D
/*     */     //   349: dmul
/*     */     //   350: invokevirtual addExperience : (D)V
/*     */     //   353: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   356: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   359: iconst_1
/*     */     //   360: anewarray java/lang/Object
/*     */     //   363: dup
/*     */     //   364: iconst_0
/*     */     //   365: iconst_1
/*     */     //   366: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   369: aastore
/*     */     //   370: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   373: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   376: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 0
/*     */     //   #82	-> 9
/*     */     //   #84	-> 38
/*     */     //   #85	-> 62
/*     */     //   #86	-> 74
/*     */     //   #88	-> 103
/*     */     //   #89	-> 109
/*     */     //   #90	-> 139
/*     */     //   #93	-> 188
/*     */     //   #99	-> 226
/*     */     //   #100	-> 235
/*     */     //   #103	-> 264
/*     */     //   #104	-> 290
/*     */     //   #105	-> 304
/*     */     //   #107	-> 333
/*     */     //   #108	-> 353
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	377	0	this	Lli/cil/oc/server/component/UpgradeExperience;
/*     */     //   0	377	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	377	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   62	314	3	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   109	267	4	xp	Lscala/runtime/IntRef;
/*     */     //   290	86	6	consumed	Lnet/minecraft/item/ItemStack;
/*     */   }
/*     */   
/*     */   public final class UpgradeExperience$$anonfun$consume$1
/*     */     extends AbstractFunction1<Tuple2<Object, Object>, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1)
/*     */     {
/*  93 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { Object id = tuple2._1(), level = tuple2._2(); if (id instanceof Integer && level instanceof Integer) return true;  }  return false; } public UpgradeExperience$$anonfun$consume$1(UpgradeExperience $outer) {} } public final class UpgradeExperience$$anonfun$consume$2 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef xp$1; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { Object id = tuple2._1(), level = tuple2._2(); if (id instanceof Integer) { int i = BoxesRunTime.unboxToInt(id); if (level instanceof Integer) { int j = BoxesRunTime.unboxToInt(level);
/*  94 */             Enchantment enchantment = Enchantment.field_77331_b[i];
/*     */             
/*  96 */             this.xp$1.elem += enchantment.func_77321_a(j); BoxedUnit boxedUnit = (enchantment == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */             return; }
/*     */            }
/*     */          }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public UpgradeExperience$$anonfun$consume$2(UpgradeExperience $outer, IntRef xp$1) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/* 112 */     super.save(nbt);
/* 113 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("xp").toString(), experience());
/*     */   }
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 117 */     super.load(nbt);
/* 118 */     experience_$eq(RichDouble$.MODULE$.max$extension(Predef$.MODULE$.doubleWrapper(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("xp").toString())), 0.0D));
/* 119 */     updateXpInfo();
/*     */   }
/*     */   
/*     */   public UpgradeExperience(Agent host) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeExperience.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */