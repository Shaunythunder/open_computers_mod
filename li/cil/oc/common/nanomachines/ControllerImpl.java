/*     */ package li.cil.oc.common.nanomachines;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.nanomachines.Behavior;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.ObjectRef;
/*     */ import scala.runtime.VolatileByteRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\re\001B\001\003\0015\021abQ8oiJ|G\016\\3s\0236\004HN\003\002\004\t\005aa.\0318p[\006\034\007.\0338fg*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\003\001\035Yi\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]YR\"\001\r\013\005\rI\"B\001\016\007\003\r\t\007/[\005\0039a\021!bQ8oiJ|G\016\\3s!\tq\022%D\001 \025\t\001\023$A\004oKR<xN]6\n\005\tz\"\001E,je\026dWm]:F]\022\004x.\0338u\021!!\003A!b\001\n\003)\023A\0029mCf,'/F\001'!\t9s&D\001)\025\t!\023F\003\002+W\0051QM\034;jifT!\001L\027\002\0235Lg.Z2sC\032$(\"\001\030\002\0079,G/\003\0021Q\taQI\034;jif\004F.Y=fe\"A!\007\001B\001B\003%a%A\004qY\006LXM\035\021\t\013Q\002A\021A\033\002\rqJg.\033;?)\t1\004\b\005\0028\0015\t!\001C\003%g\001\007a\005C\004;\001\001\007I\021A\036\002#A\024XM^5pkN$\025.\\3og&|g.F\001=!\ti\004)D\001?\025\005y\024!B:dC2\f\027BA!?\005\rIe\016\036\005\b\007\002\001\r\021\"\001E\003U\001(/\032<j_V\034H)[7f]NLwN\\0%KF$\"!\022%\021\005u2\025BA$?\005\021)f.\033;\t\017%\023\025\021!a\001y\005\031\001\020J\031\t\r-\003\001\025)\003=\003I\001(/\032<j_V\034H)[7f]NLwN\034\021\t\0215\003\001R1A\005\0029\013AbQ8n[\006tGMU1oO\026,\022a\024\t\003{AK!!\025 \003\r\021{WO\0317f\021!\031\006\001#A!B\023y\025!D\"p[6\fg\016\032*b]\036,\007\005C\004V\001\t\007IQ\001,\002!\031+H\016\\*z]\016Le\016^3sm\006dW#A,\020\003ak\"\001\002Y\t\ri\003\001\025!\004X\003E1U\017\0347Ts:\034\027J\034;feZ\fG\016\t\005\b9\002\021\r\021\"\002^\0039ye/\032:m_\006$G)Y7bO\026,\022A\030\t\003?\nl\021\001\031\006\003C.\nA!\036;jY&\0211\r\031\002\r\t\006l\027mZ3T_V\0248-\032\005\007K\002\001\013Q\0020\002\037=3XM\0357pC\022$\025-\\1hK\002Bqa\032\001A\002\023\005\001.\001\003vk&$W#A5\021\005=Q\027BA6\021\005\031\031FO]5oO\"9Q\016\001a\001\n\003q\027\001C;vS\022|F%Z9\025\005\025{\007bB%m\003\003\005\r!\033\005\007c\002\001\013\025B5\002\013U,\030\016\032\021\t\017M\004\001\031!C\001w\005a!/Z:q_:\034X\rU8si\"9Q\017\001a\001\n\0031\030\001\005:fgB|gn]3Q_J$x\fJ3r)\t)u\017C\004Ji\006\005\t\031\001\037\t\re\004\001\025)\003=\0035\021Xm\0359p]N,\007k\034:uA!91\020\001a\001\n\003Y\024\001D2p[6\fg\016\032#fY\006L\bbB?\001\001\004%\tA`\001\021G>lW.\0318e\t\026d\027-_0%KF$\"!R@\t\017%c\030\021!a\001y!9\0211\001\001!B\023a\024!D2p[6\fg\016\032#fY\006L\b\005C\005\002\b\001\001\r\021\"\001\002\n\005i\021/^3vK\022\034u.\\7b]\022,\"!a\003\021\013u\ni!!\005\n\007\005=aH\001\004PaRLwN\034\t\005{\005MQ)C\002\002\026y\022\021BR;oGRLwN\034\031\t\023\005e\001\0011A\005\002\005m\021!E9vKV,GmQ8n[\006tGm\030\023fcR\031Q)!\b\t\023%\0139\"!AA\002\005-\001\002CA\021\001\001\006K!a\003\002\035E,X-^3e\007>lW.\0318eA!A\021Q\005\001A\002\023\005a*\001\007ti>\024X\rZ#oKJ<\027\020C\005\002*\001\001\r\021\"\001\002,\005\0012\017^8sK\022,e.\032:hs~#S-\035\013\004\013\0065\002\002C%\002(\005\005\t\031A(\t\017\005E\002\001)Q\005\037\006i1\017^8sK\022,e.\032:hs\002B\021\"!\016\001\001\004%\t!a\016\002\021!\fG\rU8xKJ,\"!!\017\021\007u\nY$C\002\002>y\022qAQ8pY\026\fg\016C\005\002B\001\001\r\021\"\001\002D\005a\001.\0313Q_^,'o\030\023fcR\031Q)!\022\t\023%\013y$!AA\002\005e\002\002CA%\001\001\006K!!\017\002\023!\fG\rU8xKJ\004\003\"CA'\001\t\007I\021AA(\0035\031wN\0344jOV\024\030\r^5p]V\021\021\021\013\t\004o\005M\023bAA+\005\tia*Z;sC2tU\r^<pe.D\001\"!\027\001A\003%\021\021K\001\017G>tg-[4ve\006$\030n\0348!\021%\ti\006\001b\001\n\003\ty&A\bbGRLg/\032\"fQ\0064\030n\034:t+\t\t\t\007\005\004\002d\0055\024\021O\007\003\003KRA!a\032\002j\0059Q.\036;bE2,'bAA6}\005Q1m\0347mK\016$\030n\0348\n\t\005=\024Q\r\002\004'\026$\bcA\f\002t%\031\021Q\017\r\003\021\t+\007.\031<j_JD\001\"!\037\001A\003%\021\021M\001\021C\016$\030N^3CK\"\fg/[8sg\002B\021\"! \001\001\004%\t!a\016\002)\005\034G/\033<f\005\026D\027M^5peN$\025N\035;z\021%\t\t\t\001a\001\n\003\t\031)\001\rbGRLg/\032\"fQ\0064\030n\034:t\t&\024H/_0%KF$2!RAC\021%I\025qPA\001\002\004\tI\004\003\005\002\n\002\001\013\025BA\035\003U\t7\r^5wK\n+\007.\031<j_J\034H)\033:us\002B\021\"!$\001\001\004%\t!a\016\002)!\f7oU3oi\016{gNZ5hkJ\fG/[8o\021%\t\t\n\001a\001\n\003\t\031*\001\riCN\034VM\034;D_:4\027nZ;sCRLwN\\0%KF$2!RAK\021%I\025qRA\001\002\004\tI\004\003\005\002\032\002\001\013\025BA\035\003UA\027m]*f]R\034uN\0344jOV\024\030\r^5p]\002Bq!!(\001\t\003\ny*A\003x_JdG\r\006\002\002\"B!\0211UAT\033\t\t)KC\002\002\036.JA!!+\002&\n)qk\034:mI\"9\021Q\026\001\005B\005=\026!\001=\025\003qBq!a-\001\t\003\ny+A\001z\021\035\t9\f\001C!\003_\013\021A\037\005\b\003w\003A\021IA_\0035\021XmY3jm\026\004\026mY6fiR)Q)a0\002J\"A\021\021YA]\001\004\t\031-\001\004qC\016\\W\r\036\t\004=\005\025\027bAAd?\t1\001+Y2lKRDq!a3\002:\002\007Q$\001\004tK:$WM\035\005\b\003\037\004A\021AAi\003\035\021Xm\0359p]\022$R!RAj\003/Dq!!6\002N\002\007Q$\001\005f]\022\004x.\0338u\021!\tI.!4A\002\005m\027\001\0023bi\006\004R!PAo\003CL1!a8?\005)a$/\0329fCR,GM\020\t\004{\005\r\030bAAs}\t\031\021I\\=\t\017\005%\b\001\"\021\002l\006Y!/Z2p]\032Lw-\036:f)\0051\004bBAx\001\021\005\023qV\001\023O\026$Hk\034;bY&s\007/\036;D_VtG\017C\004\002t\002!\t%a,\002'\035,GoU1gK\006\033G/\033<f\023:\004X\017^:\t\017\005]\b\001\"\021\0020\006\021r-\032;NCb\f5\r^5wK&s\007/\036;t\021\035\tY\020\001C!\003{\f\001bZ3u\023:\004X\017\036\013\005\003s\ty\020C\004\003\002\005e\b\031\001\037\002\013%tG-\032=\t\017\t\025\001\001\"\021\003\b\005A1/\032;J]B,H\017\006\004\002:\t%!1\002\005\b\005\003\021\031\0011\001=\021!\021iAa\001A\002\005e\022!\002<bYV,\007b\002B\t\001\021\005#1C\001\023O\026$\030i\031;jm\026\024U\r[1wS>\0248\017\006\002\003\026A)qBa\006\002r%\031!\021\004\t\003\021%#XM]1cY\026DqA!\b\001\t\003\022y\"A\007hKRLe\016];u\007>,h\016\036\013\004y\t\005\002\002\003B\022\0057\001\r!!\035\002\021\t,\007.\031<j_JDqAa\n\001\t\003\022I#\001\bhKRdunY1m\005V4g-\032:\025\003=CqA!\f\001\t\003\022I#\001\nhKRdunY1m\005V4g-\032:TSj,\007b\002B\031\001\021\005#1G\001\rG\"\fgnZ3Ck\0324WM\035\013\004\037\nU\002b\002B\034\005_\001\raT\001\006I\026dG/\031\005\b\005w\001A\021\001B\037\003\031)\b\017Z1uKR\tQ\tC\004\003B\001!\tA!\020\002\013I,7/\032;\t\017\t\025\003\001\"\001\003>\0059A-[:q_N,\007b\002B%\001\021\005!QH\001\006I\026\024Wo\032\005\b\005\033\002A\021\001B\037\003\025\001(/\0338u\021\035\021\t\006\001C\001\005'\nAa]1wKR\031QI!\026\t\021\t]#q\na\001\0053\n1A\0342u!\021\021YFa\030\016\005\tu#b\001B,W%!!\021\rB/\0059q%\t\026+bO\016{W\016]8v]\022DqA!\032\001\t\003\0219'\001\003m_\006$GcA#\003j!A!q\013B2\001\004\021I\006C\004\003n\001!I!a\016\002\021%\0348\t\\5f]RDqA!\035\001\t\023\t9$\001\005jgN+'O^3s\021\035\021)\b\001C\005\005o\nAc\0317fC:\f5\r^5wK\n+\007.\031<j_J\034HcA#\003z!A!1\020B:\001\004\021i(\001\004sK\006\034xN\034\t\004/\t}\024b\001BA1\tiA)[:bE2,'+Z1t_:\004")
/*     */ public class ControllerImpl implements Controller, WirelessEndpoint {
/*     */   private final EntityPlayer player;
/*     */   private int previousDimension;
/*     */   private double CommandRange;
/*     */   private final int FullSyncInterval;
/*     */   private final DamageSource OverloadDamage;
/*     */   private String uuid;
/*     */   private int responsePort;
/*     */   private int commandDelay;
/*     */   private Option<Function0<BoxedUnit>> queuedCommand;
/*     */   private double storedEnergy;
/*     */   private boolean hadPower;
/*     */   private final NeuralNetwork configuration;
/*     */   private final Set<Behavior> activeBehaviors;
/*     */   private boolean activeBehaviorsDirty;
/*     */   private boolean hasSentConfiguration;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  35 */   public EntityPlayer player() { return this.player; }
/*  36 */   public int previousDimension() { return this.previousDimension; } public void previousDimension_$eq(int x$1) { this.previousDimension = x$1; } private double CommandRange$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.CommandRange = Settings$.MODULE$.get().nanomachinesCommandRange() * Settings$.MODULE$.get().nanomachinesCommandRange(); this.bitmap$0 = true; }  return this.CommandRange; }  } public double CommandRange() { return this.bitmap$0 ? this.CommandRange : CommandRange$lzycompute(); } public final int FullSyncInterval() { return 1200; } public final DamageSource OverloadDamage() { return this.OverloadDamage; } public String uuid() { return this.uuid; } public void uuid_$eq(String x$1) { this.uuid = x$1; } public int responsePort() { return this.responsePort; } public void responsePort_$eq(int x$1) { this.responsePort = x$1; } public int commandDelay() { return this.commandDelay; } public ControllerImpl(EntityPlayer player) { if (isServer()) Network.joinWirelessNetwork(this); 
/*  37 */     this.previousDimension = player.field_70170_p.field_73011_w.field_76574_g;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.OverloadDamage = (new DamageSourceWithRandomCause("oc.nanomachinesOverload", 3))
/*  43 */       .func_76348_h()
/*  44 */       .func_151518_m();
/*     */     
/*  46 */     this.uuid = UUID.randomUUID().toString();
/*  47 */     this.responsePort = 0;
/*  48 */     this.commandDelay = 0;
/*  49 */     this.queuedCommand = (Option<Function0<BoxedUnit>>)None$.MODULE$;
/*  50 */     this.storedEnergy = Settings$.MODULE$.get().bufferNanomachines() * 0.25D;
/*  51 */     this.hadPower = true;
/*  52 */     this.configuration = new NeuralNetwork(this);
/*  53 */     this.activeBehaviors = Set$.MODULE$.empty();
/*  54 */     this.activeBehaviorsDirty = true;
/*  55 */     this.hasSentConfiguration = false; } public void commandDelay_$eq(int x$1) { this.commandDelay = x$1; } public Option<Function0<BoxedUnit>> queuedCommand() { return this.queuedCommand; } public void queuedCommand_$eq(Option<Function0<BoxedUnit>> x$1) { this.queuedCommand = x$1; } public double storedEnergy() { return this.storedEnergy; } public void storedEnergy_$eq(double x$1) { this.storedEnergy = x$1; } public boolean hadPower() { return this.hadPower; } public void hadPower_$eq(boolean x$1) { this.hadPower = x$1; } public NeuralNetwork configuration() { return this.configuration; } public Set<Behavior> activeBehaviors() { return this.activeBehaviors; } public boolean activeBehaviorsDirty() { return this.activeBehaviorsDirty; } public void activeBehaviorsDirty_$eq(boolean x$1) { this.activeBehaviorsDirty = x$1; } public boolean hasSentConfiguration() { return this.hasSentConfiguration; } public void hasSentConfiguration_$eq(boolean x$1) { this.hasSentConfiguration = x$1; }
/*     */    public World world() {
/*  57 */     return player().func_130014_f_();
/*     */   } public int x() {
/*  59 */     return BlockPosition$.MODULE$.apply((Entity)player()).x();
/*     */   } public int y() {
/*  61 */     return BlockPosition$.MODULE$.apply((Entity)player()).y();
/*     */   } public int z() {
/*  63 */     return BlockPosition$.MODULE$.apply((Entity)player()).z();
/*     */   }
/*     */   public void receivePacket(Packet packet, WirelessEndpoint sender) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getLocalBuffer : ()D
/*     */     //   4: iconst_0
/*     */     //   5: i2d
/*     */     //   6: dcmpl
/*     */     //   7: ifle -> 2650
/*     */     //   10: aload_0
/*     */     //   11: invokevirtual commandDelay : ()I
/*     */     //   14: iconst_1
/*     */     //   15: if_icmpge -> 2650
/*     */     //   18: aload_0
/*     */     //   19: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   22: getfield field_70128_L : Z
/*     */     //   25: ifne -> 2650
/*     */     //   28: new scala/Tuple3
/*     */     //   31: dup
/*     */     //   32: aload_2
/*     */     //   33: invokeinterface x : ()I
/*     */     //   38: i2d
/*     */     //   39: ldc2_w 0.5
/*     */     //   42: dadd
/*     */     //   43: aload_0
/*     */     //   44: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   47: getfield field_70165_t : D
/*     */     //   50: dsub
/*     */     //   51: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   54: aload_2
/*     */     //   55: invokeinterface y : ()I
/*     */     //   60: i2d
/*     */     //   61: ldc2_w 0.5
/*     */     //   64: dadd
/*     */     //   65: aload_0
/*     */     //   66: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   69: getfield field_70163_u : D
/*     */     //   72: dsub
/*     */     //   73: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   76: aload_2
/*     */     //   77: invokeinterface z : ()I
/*     */     //   82: i2d
/*     */     //   83: ldc2_w 0.5
/*     */     //   86: dadd
/*     */     //   87: aload_0
/*     */     //   88: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   91: getfield field_70161_v : D
/*     */     //   94: dsub
/*     */     //   95: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   98: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   101: astore #4
/*     */     //   103: aload #4
/*     */     //   105: ifnull -> 2523
/*     */     //   108: aload #4
/*     */     //   110: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   113: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   116: dstore #5
/*     */     //   118: aload #4
/*     */     //   120: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   123: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   126: dstore #7
/*     */     //   128: aload #4
/*     */     //   130: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   133: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   136: dstore #9
/*     */     //   138: new scala/Tuple3
/*     */     //   141: dup
/*     */     //   142: dload #5
/*     */     //   144: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   147: dload #7
/*     */     //   149: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   152: dload #9
/*     */     //   154: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   157: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   160: astore #11
/*     */     //   162: aload #11
/*     */     //   164: astore_3
/*     */     //   165: aload_3
/*     */     //   166: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   169: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   172: dstore #12
/*     */     //   174: aload_3
/*     */     //   175: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   178: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   181: dstore #14
/*     */     //   183: aload_3
/*     */     //   184: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   187: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   190: dstore #16
/*     */     //   192: dload #12
/*     */     //   194: dload #12
/*     */     //   196: dmul
/*     */     //   197: dload #14
/*     */     //   199: dload #14
/*     */     //   201: dmul
/*     */     //   202: dadd
/*     */     //   203: dload #16
/*     */     //   205: dload #16
/*     */     //   207: dmul
/*     */     //   208: dadd
/*     */     //   209: invokestatic sqrt : (D)D
/*     */     //   212: dstore #18
/*     */     //   214: dload #18
/*     */     //   216: aload_0
/*     */     //   217: invokevirtual CommandRange : ()D
/*     */     //   220: dcmpg
/*     */     //   221: ifgt -> 2650
/*     */     //   224: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   227: aload_1
/*     */     //   228: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   233: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   236: invokeinterface headOption : ()Lscala/Option;
/*     */     //   241: astore #20
/*     */     //   243: aload #20
/*     */     //   245: instanceof scala/Some
/*     */     //   248: ifeq -> 2515
/*     */     //   251: aload #20
/*     */     //   253: checkcast scala/Some
/*     */     //   256: astore #21
/*     */     //   258: aload #21
/*     */     //   260: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   263: astore #22
/*     */     //   265: aload #22
/*     */     //   267: instanceof [B
/*     */     //   270: ifeq -> 2515
/*     */     //   273: aload #22
/*     */     //   275: checkcast [B
/*     */     //   278: astore #23
/*     */     //   280: new java/lang/String
/*     */     //   283: dup
/*     */     //   284: aload #23
/*     */     //   286: getstatic com/google/common/base/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   289: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   292: ldc_w 'nanomachines'
/*     */     //   295: astore #24
/*     */     //   297: dup
/*     */     //   298: ifnonnull -> 310
/*     */     //   301: pop
/*     */     //   302: aload #24
/*     */     //   304: ifnull -> 318
/*     */     //   307: goto -> 2515
/*     */     //   310: aload #24
/*     */     //   312: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   315: ifeq -> 2515
/*     */     //   318: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   321: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   324: aload_1
/*     */     //   325: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   330: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   333: iconst_1
/*     */     //   334: invokeinterface drop : (I)Ljava/lang/Object;
/*     */     //   339: checkcast [Ljava/lang/Object;
/*     */     //   342: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   345: new li/cil/oc/common/nanomachines/ControllerImpl$$anonfun$1
/*     */     //   348: dup
/*     */     //   349: aload_0
/*     */     //   350: invokespecial <init> : (Lli/cil/oc/common/nanomachines/ControllerImpl;)V
/*     */     //   353: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   356: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   359: invokevirtual Object : ()Lscala/reflect/ClassTag;
/*     */     //   362: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */     //   365: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   370: checkcast [Ljava/lang/Object;
/*     */     //   373: astore #26
/*     */     //   375: aload #26
/*     */     //   377: astore #27
/*     */     //   379: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   382: aload #27
/*     */     //   384: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   387: astore #28
/*     */     //   389: aload #28
/*     */     //   391: invokevirtual isEmpty : ()Z
/*     */     //   394: ifne -> 557
/*     */     //   397: aload #28
/*     */     //   399: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   402: ifnull -> 557
/*     */     //   405: aload #28
/*     */     //   407: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   410: checkcast scala/collection/SeqLike
/*     */     //   413: iconst_2
/*     */     //   414: invokeinterface lengthCompare : (I)I
/*     */     //   419: iconst_0
/*     */     //   420: if_icmpne -> 557
/*     */     //   423: aload #28
/*     */     //   425: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   428: checkcast scala/collection/SeqLike
/*     */     //   431: iconst_0
/*     */     //   432: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   437: astore #29
/*     */     //   439: aload #28
/*     */     //   441: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   444: checkcast scala/collection/SeqLike
/*     */     //   447: iconst_1
/*     */     //   448: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   453: astore #30
/*     */     //   455: ldc_w 'setResponsePort'
/*     */     //   458: aload #29
/*     */     //   460: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   463: ifeq -> 557
/*     */     //   466: aload #30
/*     */     //   468: instanceof java/lang/Number
/*     */     //   471: ifeq -> 557
/*     */     //   474: aload #30
/*     */     //   476: checkcast java/lang/Number
/*     */     //   479: astore #31
/*     */     //   481: aload_0
/*     */     //   482: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */     //   485: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   488: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */     //   491: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   494: aload #31
/*     */     //   496: invokevirtual intValue : ()I
/*     */     //   499: invokevirtual intWrapper : (I)I
/*     */     //   502: iconst_0
/*     */     //   503: invokevirtual max$extension : (II)I
/*     */     //   506: invokevirtual intWrapper : (I)I
/*     */     //   509: ldc_w 65535
/*     */     //   512: invokevirtual min$extension : (II)I
/*     */     //   515: invokevirtual responsePort_$eq : (I)V
/*     */     //   518: aload_0
/*     */     //   519: aload_2
/*     */     //   520: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   523: iconst_2
/*     */     //   524: anewarray java/lang/Object
/*     */     //   527: dup
/*     */     //   528: iconst_0
/*     */     //   529: ldc_w 'port'
/*     */     //   532: aastore
/*     */     //   533: dup
/*     */     //   534: iconst_1
/*     */     //   535: aload_0
/*     */     //   536: invokevirtual responsePort : ()I
/*     */     //   539: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   542: aastore
/*     */     //   543: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   546: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   549: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   552: astore #32
/*     */     //   554: goto -> 2645
/*     */     //   557: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   560: aload #27
/*     */     //   562: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   565: astore #33
/*     */     //   567: aload #33
/*     */     //   569: invokevirtual isEmpty : ()Z
/*     */     //   572: ifne -> 677
/*     */     //   575: aload #33
/*     */     //   577: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   580: ifnull -> 677
/*     */     //   583: aload #33
/*     */     //   585: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   588: checkcast scala/collection/SeqLike
/*     */     //   591: iconst_1
/*     */     //   592: invokeinterface lengthCompare : (I)I
/*     */     //   597: iconst_0
/*     */     //   598: if_icmpne -> 677
/*     */     //   601: aload #33
/*     */     //   603: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   606: checkcast scala/collection/SeqLike
/*     */     //   609: iconst_0
/*     */     //   610: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   615: astore #34
/*     */     //   617: ldc_w 'getPowerState'
/*     */     //   620: aload #34
/*     */     //   622: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   625: ifeq -> 677
/*     */     //   628: aload_0
/*     */     //   629: aload_2
/*     */     //   630: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   633: iconst_3
/*     */     //   634: anewarray java/lang/Object
/*     */     //   637: dup
/*     */     //   638: iconst_0
/*     */     //   639: ldc_w 'power'
/*     */     //   642: aastore
/*     */     //   643: dup
/*     */     //   644: iconst_1
/*     */     //   645: aload_0
/*     */     //   646: invokevirtual getLocalBuffer : ()D
/*     */     //   649: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   652: aastore
/*     */     //   653: dup
/*     */     //   654: iconst_2
/*     */     //   655: aload_0
/*     */     //   656: invokevirtual getLocalBufferSize : ()D
/*     */     //   659: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   662: aastore
/*     */     //   663: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   666: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   669: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   672: astore #32
/*     */     //   674: goto -> 2645
/*     */     //   677: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   680: aload #27
/*     */     //   682: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   685: astore #35
/*     */     //   687: aload #35
/*     */     //   689: invokevirtual isEmpty : ()Z
/*     */     //   692: ifne -> 944
/*     */     //   695: aload #35
/*     */     //   697: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   700: ifnull -> 944
/*     */     //   703: aload #35
/*     */     //   705: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   708: checkcast scala/collection/SeqLike
/*     */     //   711: iconst_1
/*     */     //   712: invokeinterface lengthCompare : (I)I
/*     */     //   717: iconst_0
/*     */     //   718: if_icmpne -> 944
/*     */     //   721: aload #35
/*     */     //   723: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   726: checkcast scala/collection/SeqLike
/*     */     //   729: iconst_0
/*     */     //   730: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   735: astore #36
/*     */     //   737: ldc_w 'saveConfiguration'
/*     */     //   740: aload #36
/*     */     //   742: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   745: ifeq -> 944
/*     */     //   748: ldc_w 'nanomachines'
/*     */     //   751: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   754: astore #37
/*     */     //   756: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   759: aload_0
/*     */     //   760: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   763: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   766: getfield field_70462_a : [Lnet/minecraft/item/ItemStack;
/*     */     //   769: checkcast [Ljava/lang/Object;
/*     */     //   772: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   775: new li/cil/oc/common/nanomachines/ControllerImpl$$anonfun$2
/*     */     //   778: dup
/*     */     //   779: aload_0
/*     */     //   780: aload #37
/*     */     //   782: invokespecial <init> : (Lli/cil/oc/common/nanomachines/ControllerImpl;Lli/cil/oc/api/detail/ItemInfo;)V
/*     */     //   785: invokeinterface indexWhere : (Lscala/Function1;)I
/*     */     //   790: istore #38
/*     */     //   792: iload #38
/*     */     //   794: iconst_0
/*     */     //   795: if_icmplt -> 904
/*     */     //   798: aload_0
/*     */     //   799: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   802: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   805: iload #38
/*     */     //   807: iconst_1
/*     */     //   808: invokevirtual func_70298_a : (II)Lnet/minecraft/item/ItemStack;
/*     */     //   811: astore #39
/*     */     //   813: new li/cil/oc/common/item/data/NanomachineData
/*     */     //   816: dup
/*     */     //   817: aload_0
/*     */     //   818: invokespecial <init> : (Lli/cil/oc/common/nanomachines/ControllerImpl;)V
/*     */     //   821: aload #39
/*     */     //   823: invokevirtual save : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   826: aload_0
/*     */     //   827: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   830: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   833: aload #39
/*     */     //   835: invokevirtual func_70441_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   838: pop
/*     */     //   839: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   842: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   845: aload_0
/*     */     //   846: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   849: invokevirtual apply : (Lnet/minecraft/entity/Entity;)Lli/cil/oc/util/BlockPosition;
/*     */     //   852: aload #39
/*     */     //   854: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   857: invokevirtual spawnStackInWorld$default$3 : ()Lscala/Option;
/*     */     //   860: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   863: invokevirtual spawnStackInWorld$default$4 : ()Lscala/Option;
/*     */     //   866: invokevirtual spawnStackInWorld : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/item/ItemStack;Lscala/Option;Lscala/Option;)Lnet/minecraft/entity/item/EntityItem;
/*     */     //   869: pop
/*     */     //   870: aload_0
/*     */     //   871: aload_2
/*     */     //   872: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   875: iconst_2
/*     */     //   876: anewarray java/lang/Object
/*     */     //   879: dup
/*     */     //   880: iconst_0
/*     */     //   881: ldc_w 'saved'
/*     */     //   884: aastore
/*     */     //   885: dup
/*     */     //   886: iconst_1
/*     */     //   887: iconst_1
/*     */     //   888: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   891: aastore
/*     */     //   892: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   895: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   898: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   901: goto -> 2571
/*     */     //   904: aload_0
/*     */     //   905: aload_2
/*     */     //   906: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   909: iconst_3
/*     */     //   910: anewarray java/lang/Object
/*     */     //   913: dup
/*     */     //   914: iconst_0
/*     */     //   915: ldc_w 'saved'
/*     */     //   918: aastore
/*     */     //   919: dup
/*     */     //   920: iconst_1
/*     */     //   921: iconst_0
/*     */     //   922: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   925: aastore
/*     */     //   926: dup
/*     */     //   927: iconst_2
/*     */     //   928: ldc_w 'no nanomachines'
/*     */     //   931: aastore
/*     */     //   932: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   935: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   938: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   941: goto -> 2571
/*     */     //   944: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   947: aload #27
/*     */     //   949: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   952: astore #40
/*     */     //   954: aload #40
/*     */     //   956: invokevirtual isEmpty : ()Z
/*     */     //   959: ifne -> 1070
/*     */     //   962: aload #40
/*     */     //   964: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   967: ifnull -> 1070
/*     */     //   970: aload #40
/*     */     //   972: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   975: checkcast scala/collection/SeqLike
/*     */     //   978: iconst_1
/*     */     //   979: invokeinterface lengthCompare : (I)I
/*     */     //   984: iconst_0
/*     */     //   985: if_icmpne -> 1070
/*     */     //   988: aload #40
/*     */     //   990: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   993: checkcast scala/collection/SeqLike
/*     */     //   996: iconst_0
/*     */     //   997: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1002: astore #41
/*     */     //   1004: ldc_w 'getHealth'
/*     */     //   1007: aload #41
/*     */     //   1009: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1012: ifeq -> 1070
/*     */     //   1015: aload_0
/*     */     //   1016: aload_2
/*     */     //   1017: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1020: iconst_3
/*     */     //   1021: anewarray java/lang/Object
/*     */     //   1024: dup
/*     */     //   1025: iconst_0
/*     */     //   1026: ldc_w 'health'
/*     */     //   1029: aastore
/*     */     //   1030: dup
/*     */     //   1031: iconst_1
/*     */     //   1032: aload_0
/*     */     //   1033: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1036: invokevirtual func_110143_aJ : ()F
/*     */     //   1039: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */     //   1042: aastore
/*     */     //   1043: dup
/*     */     //   1044: iconst_2
/*     */     //   1045: aload_0
/*     */     //   1046: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1049: invokevirtual func_110138_aP : ()F
/*     */     //   1052: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */     //   1055: aastore
/*     */     //   1056: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1059: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1062: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1065: astore #32
/*     */     //   1067: goto -> 2645
/*     */     //   1070: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1073: aload #27
/*     */     //   1075: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1078: astore #42
/*     */     //   1080: aload #42
/*     */     //   1082: invokevirtual isEmpty : ()Z
/*     */     //   1085: ifne -> 1202
/*     */     //   1088: aload #42
/*     */     //   1090: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1093: ifnull -> 1202
/*     */     //   1096: aload #42
/*     */     //   1098: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1101: checkcast scala/collection/SeqLike
/*     */     //   1104: iconst_1
/*     */     //   1105: invokeinterface lengthCompare : (I)I
/*     */     //   1110: iconst_0
/*     */     //   1111: if_icmpne -> 1202
/*     */     //   1114: aload #42
/*     */     //   1116: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1119: checkcast scala/collection/SeqLike
/*     */     //   1122: iconst_0
/*     */     //   1123: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1128: astore #43
/*     */     //   1130: ldc_w 'getHunger'
/*     */     //   1133: aload #43
/*     */     //   1135: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1138: ifeq -> 1202
/*     */     //   1141: aload_0
/*     */     //   1142: aload_2
/*     */     //   1143: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1146: iconst_3
/*     */     //   1147: anewarray java/lang/Object
/*     */     //   1150: dup
/*     */     //   1151: iconst_0
/*     */     //   1152: ldc_w 'hunger'
/*     */     //   1155: aastore
/*     */     //   1156: dup
/*     */     //   1157: iconst_1
/*     */     //   1158: aload_0
/*     */     //   1159: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1162: invokevirtual func_71024_bL : ()Lnet/minecraft/util/FoodStats;
/*     */     //   1165: invokevirtual func_75116_a : ()I
/*     */     //   1168: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   1171: aastore
/*     */     //   1172: dup
/*     */     //   1173: iconst_2
/*     */     //   1174: aload_0
/*     */     //   1175: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1178: invokevirtual func_71024_bL : ()Lnet/minecraft/util/FoodStats;
/*     */     //   1181: invokevirtual func_75115_e : ()F
/*     */     //   1184: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */     //   1187: aastore
/*     */     //   1188: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1191: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1194: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1197: astore #32
/*     */     //   1199: goto -> 2645
/*     */     //   1202: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1205: aload #27
/*     */     //   1207: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1210: astore #44
/*     */     //   1212: aload #44
/*     */     //   1214: invokevirtual isEmpty : ()Z
/*     */     //   1217: ifne -> 1321
/*     */     //   1220: aload #44
/*     */     //   1222: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1225: ifnull -> 1321
/*     */     //   1228: aload #44
/*     */     //   1230: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1233: checkcast scala/collection/SeqLike
/*     */     //   1236: iconst_1
/*     */     //   1237: invokeinterface lengthCompare : (I)I
/*     */     //   1242: iconst_0
/*     */     //   1243: if_icmpne -> 1321
/*     */     //   1246: aload #44
/*     */     //   1248: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1251: checkcast scala/collection/SeqLike
/*     */     //   1254: iconst_0
/*     */     //   1255: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1260: astore #45
/*     */     //   1262: ldc_w 'getAge'
/*     */     //   1265: aload #45
/*     */     //   1267: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1270: ifeq -> 1321
/*     */     //   1273: aload_0
/*     */     //   1274: aload_2
/*     */     //   1275: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1278: iconst_2
/*     */     //   1279: anewarray java/lang/Object
/*     */     //   1282: dup
/*     */     //   1283: iconst_0
/*     */     //   1284: ldc_w 'age'
/*     */     //   1287: aastore
/*     */     //   1288: dup
/*     */     //   1289: iconst_1
/*     */     //   1290: aload_0
/*     */     //   1291: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1294: invokevirtual func_70654_ax : ()I
/*     */     //   1297: i2f
/*     */     //   1298: ldc_w 20.0
/*     */     //   1301: fdiv
/*     */     //   1302: f2i
/*     */     //   1303: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   1306: aastore
/*     */     //   1307: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1310: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1313: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1316: astore #32
/*     */     //   1318: goto -> 2645
/*     */     //   1321: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1324: aload #27
/*     */     //   1326: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1329: astore #46
/*     */     //   1331: aload #46
/*     */     //   1333: invokevirtual isEmpty : ()Z
/*     */     //   1336: ifne -> 1431
/*     */     //   1339: aload #46
/*     */     //   1341: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1344: ifnull -> 1431
/*     */     //   1347: aload #46
/*     */     //   1349: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1352: checkcast scala/collection/SeqLike
/*     */     //   1355: iconst_1
/*     */     //   1356: invokeinterface lengthCompare : (I)I
/*     */     //   1361: iconst_0
/*     */     //   1362: if_icmpne -> 1431
/*     */     //   1365: aload #46
/*     */     //   1367: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1370: checkcast scala/collection/SeqLike
/*     */     //   1373: iconst_0
/*     */     //   1374: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1379: astore #47
/*     */     //   1381: ldc_w 'getName'
/*     */     //   1384: aload #47
/*     */     //   1386: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1389: ifeq -> 1431
/*     */     //   1392: aload_0
/*     */     //   1393: aload_2
/*     */     //   1394: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1397: iconst_2
/*     */     //   1398: anewarray java/lang/Object
/*     */     //   1401: dup
/*     */     //   1402: iconst_0
/*     */     //   1403: ldc_w 'name'
/*     */     //   1406: aastore
/*     */     //   1407: dup
/*     */     //   1408: iconst_1
/*     */     //   1409: aload_0
/*     */     //   1410: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1413: invokevirtual getDisplayName : ()Ljava/lang/String;
/*     */     //   1416: aastore
/*     */     //   1417: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1420: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1423: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1426: astore #32
/*     */     //   1428: goto -> 2645
/*     */     //   1431: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1434: aload #27
/*     */     //   1436: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1439: astore #48
/*     */     //   1441: aload #48
/*     */     //   1443: invokevirtual isEmpty : ()Z
/*     */     //   1446: ifne -> 1544
/*     */     //   1449: aload #48
/*     */     //   1451: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1454: ifnull -> 1544
/*     */     //   1457: aload #48
/*     */     //   1459: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1462: checkcast scala/collection/SeqLike
/*     */     //   1465: iconst_1
/*     */     //   1466: invokeinterface lengthCompare : (I)I
/*     */     //   1471: iconst_0
/*     */     //   1472: if_icmpne -> 1544
/*     */     //   1475: aload #48
/*     */     //   1477: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1480: checkcast scala/collection/SeqLike
/*     */     //   1483: iconst_0
/*     */     //   1484: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1489: astore #49
/*     */     //   1491: ldc_w 'getExperience'
/*     */     //   1494: aload #49
/*     */     //   1496: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1499: ifeq -> 1544
/*     */     //   1502: aload_0
/*     */     //   1503: aload_2
/*     */     //   1504: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1507: iconst_2
/*     */     //   1508: anewarray java/lang/Object
/*     */     //   1511: dup
/*     */     //   1512: iconst_0
/*     */     //   1513: ldc_w 'experience'
/*     */     //   1516: aastore
/*     */     //   1517: dup
/*     */     //   1518: iconst_1
/*     */     //   1519: aload_0
/*     */     //   1520: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1523: getfield field_71068_ca : I
/*     */     //   1526: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   1529: aastore
/*     */     //   1530: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1533: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1536: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1539: astore #32
/*     */     //   1541: goto -> 2645
/*     */     //   1544: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1547: aload #27
/*     */     //   1549: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1552: astore #50
/*     */     //   1554: aload #50
/*     */     //   1556: invokevirtual isEmpty : ()Z
/*     */     //   1559: ifne -> 1654
/*     */     //   1562: aload #50
/*     */     //   1564: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1567: ifnull -> 1654
/*     */     //   1570: aload #50
/*     */     //   1572: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1575: checkcast scala/collection/SeqLike
/*     */     //   1578: iconst_1
/*     */     //   1579: invokeinterface lengthCompare : (I)I
/*     */     //   1584: iconst_0
/*     */     //   1585: if_icmpne -> 1654
/*     */     //   1588: aload #50
/*     */     //   1590: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1593: checkcast scala/collection/SeqLike
/*     */     //   1596: iconst_0
/*     */     //   1597: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1602: astore #51
/*     */     //   1604: ldc_w 'getTotalInputCount'
/*     */     //   1607: aload #51
/*     */     //   1609: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1612: ifeq -> 1654
/*     */     //   1615: aload_0
/*     */     //   1616: aload_2
/*     */     //   1617: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1620: iconst_2
/*     */     //   1621: anewarray java/lang/Object
/*     */     //   1624: dup
/*     */     //   1625: iconst_0
/*     */     //   1626: ldc_w 'totalInputCount'
/*     */     //   1629: aastore
/*     */     //   1630: dup
/*     */     //   1631: iconst_1
/*     */     //   1632: aload_0
/*     */     //   1633: invokevirtual getTotalInputCount : ()I
/*     */     //   1636: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   1639: aastore
/*     */     //   1640: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1643: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1646: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1649: astore #32
/*     */     //   1651: goto -> 2645
/*     */     //   1654: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1657: aload #27
/*     */     //   1659: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1662: astore #52
/*     */     //   1664: aload #52
/*     */     //   1666: invokevirtual isEmpty : ()Z
/*     */     //   1669: ifne -> 1764
/*     */     //   1672: aload #52
/*     */     //   1674: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1677: ifnull -> 1764
/*     */     //   1680: aload #52
/*     */     //   1682: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1685: checkcast scala/collection/SeqLike
/*     */     //   1688: iconst_1
/*     */     //   1689: invokeinterface lengthCompare : (I)I
/*     */     //   1694: iconst_0
/*     */     //   1695: if_icmpne -> 1764
/*     */     //   1698: aload #52
/*     */     //   1700: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1703: checkcast scala/collection/SeqLike
/*     */     //   1706: iconst_0
/*     */     //   1707: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1712: astore #53
/*     */     //   1714: ldc_w 'getSafeActiveInputs'
/*     */     //   1717: aload #53
/*     */     //   1719: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1722: ifeq -> 1764
/*     */     //   1725: aload_0
/*     */     //   1726: aload_2
/*     */     //   1727: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1730: iconst_2
/*     */     //   1731: anewarray java/lang/Object
/*     */     //   1734: dup
/*     */     //   1735: iconst_0
/*     */     //   1736: ldc_w 'safeActiveInputs'
/*     */     //   1739: aastore
/*     */     //   1740: dup
/*     */     //   1741: iconst_1
/*     */     //   1742: aload_0
/*     */     //   1743: invokevirtual getSafeActiveInputs : ()I
/*     */     //   1746: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   1749: aastore
/*     */     //   1750: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1753: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1756: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1759: astore #32
/*     */     //   1761: goto -> 2645
/*     */     //   1764: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1767: aload #27
/*     */     //   1769: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1772: astore #54
/*     */     //   1774: aload #54
/*     */     //   1776: invokevirtual isEmpty : ()Z
/*     */     //   1779: ifne -> 1874
/*     */     //   1782: aload #54
/*     */     //   1784: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1787: ifnull -> 1874
/*     */     //   1790: aload #54
/*     */     //   1792: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1795: checkcast scala/collection/SeqLike
/*     */     //   1798: iconst_1
/*     */     //   1799: invokeinterface lengthCompare : (I)I
/*     */     //   1804: iconst_0
/*     */     //   1805: if_icmpne -> 1874
/*     */     //   1808: aload #54
/*     */     //   1810: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1813: checkcast scala/collection/SeqLike
/*     */     //   1816: iconst_0
/*     */     //   1817: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1822: astore #55
/*     */     //   1824: ldc_w 'getMaxActiveInputs'
/*     */     //   1827: aload #55
/*     */     //   1829: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1832: ifeq -> 1874
/*     */     //   1835: aload_0
/*     */     //   1836: aload_2
/*     */     //   1837: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1840: iconst_2
/*     */     //   1841: anewarray java/lang/Object
/*     */     //   1844: dup
/*     */     //   1845: iconst_0
/*     */     //   1846: ldc_w 'maxActiveInputs'
/*     */     //   1849: aastore
/*     */     //   1850: dup
/*     */     //   1851: iconst_1
/*     */     //   1852: aload_0
/*     */     //   1853: invokevirtual getMaxActiveInputs : ()I
/*     */     //   1856: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   1859: aastore
/*     */     //   1860: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1863: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   1866: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1869: astore #32
/*     */     //   1871: goto -> 2645
/*     */     //   1874: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1877: aload #27
/*     */     //   1879: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1882: astore #56
/*     */     //   1884: aload #56
/*     */     //   1886: invokevirtual isEmpty : ()Z
/*     */     //   1889: ifne -> 2035
/*     */     //   1892: aload #56
/*     */     //   1894: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1897: ifnull -> 2035
/*     */     //   1900: aload #56
/*     */     //   1902: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1905: checkcast scala/collection/SeqLike
/*     */     //   1908: iconst_2
/*     */     //   1909: invokeinterface lengthCompare : (I)I
/*     */     //   1914: iconst_0
/*     */     //   1915: if_icmpne -> 2035
/*     */     //   1918: aload #56
/*     */     //   1920: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1923: checkcast scala/collection/SeqLike
/*     */     //   1926: iconst_0
/*     */     //   1927: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1932: astore #57
/*     */     //   1934: aload #56
/*     */     //   1936: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1939: checkcast scala/collection/SeqLike
/*     */     //   1942: iconst_1
/*     */     //   1943: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1948: astore #58
/*     */     //   1950: ldc_w 'getInput'
/*     */     //   1953: aload #57
/*     */     //   1955: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1958: ifeq -> 2035
/*     */     //   1961: aload #58
/*     */     //   1963: instanceof java/lang/Number
/*     */     //   1966: ifeq -> 2035
/*     */     //   1969: aload #58
/*     */     //   1971: checkcast java/lang/Number
/*     */     //   1974: astore #59
/*     */     //   1976: aload_0
/*     */     //   1977: aload #59
/*     */     //   1979: invokevirtual intValue : ()I
/*     */     //   1982: iconst_1
/*     */     //   1983: isub
/*     */     //   1984: invokevirtual getInput : (I)Z
/*     */     //   1987: istore #60
/*     */     //   1989: aload_0
/*     */     //   1990: aload_2
/*     */     //   1991: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1994: iconst_3
/*     */     //   1995: anewarray java/lang/Object
/*     */     //   1998: dup
/*     */     //   1999: iconst_0
/*     */     //   2000: ldc_w 'input'
/*     */     //   2003: aastore
/*     */     //   2004: dup
/*     */     //   2005: iconst_1
/*     */     //   2006: aload #59
/*     */     //   2008: invokevirtual intValue : ()I
/*     */     //   2011: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   2014: aastore
/*     */     //   2015: dup
/*     */     //   2016: iconst_2
/*     */     //   2017: iload #60
/*     */     //   2019: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   2022: aastore
/*     */     //   2023: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2026: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   2029: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2032: goto -> 2607
/*     */     //   2035: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   2038: aload #27
/*     */     //   2040: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   2043: astore #61
/*     */     //   2045: aload #61
/*     */     //   2047: invokevirtual isEmpty : ()Z
/*     */     //   2050: ifne -> 2275
/*     */     //   2053: aload #61
/*     */     //   2055: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2058: ifnull -> 2275
/*     */     //   2061: aload #61
/*     */     //   2063: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2066: checkcast scala/collection/SeqLike
/*     */     //   2069: iconst_3
/*     */     //   2070: invokeinterface lengthCompare : (I)I
/*     */     //   2075: iconst_0
/*     */     //   2076: if_icmpne -> 2275
/*     */     //   2079: aload #61
/*     */     //   2081: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2084: checkcast scala/collection/SeqLike
/*     */     //   2087: iconst_0
/*     */     //   2088: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2093: astore #62
/*     */     //   2095: aload #61
/*     */     //   2097: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2100: checkcast scala/collection/SeqLike
/*     */     //   2103: iconst_1
/*     */     //   2104: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2109: astore #63
/*     */     //   2111: aload #61
/*     */     //   2113: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2116: checkcast scala/collection/SeqLike
/*     */     //   2119: iconst_2
/*     */     //   2120: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2125: astore #64
/*     */     //   2127: ldc_w 'setInput'
/*     */     //   2130: aload #62
/*     */     //   2132: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2135: ifeq -> 2275
/*     */     //   2138: aload #63
/*     */     //   2140: instanceof java/lang/Number
/*     */     //   2143: ifeq -> 2275
/*     */     //   2146: aload #63
/*     */     //   2148: checkcast java/lang/Number
/*     */     //   2151: astore #65
/*     */     //   2153: aload #64
/*     */     //   2155: instanceof java/lang/Boolean
/*     */     //   2158: ifeq -> 2275
/*     */     //   2161: aload #64
/*     */     //   2163: checkcast java/lang/Boolean
/*     */     //   2166: astore #66
/*     */     //   2168: aload_0
/*     */     //   2169: aload #65
/*     */     //   2171: invokevirtual intValue : ()I
/*     */     //   2174: iconst_1
/*     */     //   2175: isub
/*     */     //   2176: aload #66
/*     */     //   2178: invokevirtual booleanValue : ()Z
/*     */     //   2181: invokevirtual setInput : (IZ)Z
/*     */     //   2184: ifeq -> 2242
/*     */     //   2187: aload_0
/*     */     //   2188: aload_2
/*     */     //   2189: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2192: iconst_3
/*     */     //   2193: anewarray java/lang/Object
/*     */     //   2196: dup
/*     */     //   2197: iconst_0
/*     */     //   2198: ldc_w 'input'
/*     */     //   2201: aastore
/*     */     //   2202: dup
/*     */     //   2203: iconst_1
/*     */     //   2204: aload #65
/*     */     //   2206: invokevirtual intValue : ()I
/*     */     //   2209: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   2212: aastore
/*     */     //   2213: dup
/*     */     //   2214: iconst_2
/*     */     //   2215: aload_0
/*     */     //   2216: aload #65
/*     */     //   2218: invokevirtual intValue : ()I
/*     */     //   2221: iconst_1
/*     */     //   2222: isub
/*     */     //   2223: invokevirtual getInput : (I)Z
/*     */     //   2226: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   2229: aastore
/*     */     //   2230: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2233: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   2236: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2239: goto -> 2643
/*     */     //   2242: aload_0
/*     */     //   2243: aload_2
/*     */     //   2244: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2247: iconst_2
/*     */     //   2248: anewarray java/lang/Object
/*     */     //   2251: dup
/*     */     //   2252: iconst_0
/*     */     //   2253: ldc_w 'input'
/*     */     //   2256: aastore
/*     */     //   2257: dup
/*     */     //   2258: iconst_1
/*     */     //   2259: ldc_w 'too many active inputs'
/*     */     //   2262: aastore
/*     */     //   2263: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2266: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   2269: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2272: goto -> 2643
/*     */     //   2275: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   2278: aload #27
/*     */     //   2280: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   2283: astore #67
/*     */     //   2285: aload #67
/*     */     //   2287: invokevirtual isEmpty : ()Z
/*     */     //   2290: ifne -> 2507
/*     */     //   2293: aload #67
/*     */     //   2295: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2298: ifnull -> 2507
/*     */     //   2301: aload #67
/*     */     //   2303: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2306: checkcast scala/collection/SeqLike
/*     */     //   2309: iconst_1
/*     */     //   2310: invokeinterface lengthCompare : (I)I
/*     */     //   2315: iconst_0
/*     */     //   2316: if_icmpne -> 2507
/*     */     //   2319: aload #67
/*     */     //   2321: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2324: checkcast scala/collection/SeqLike
/*     */     //   2327: iconst_0
/*     */     //   2328: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2333: astore #68
/*     */     //   2335: ldc_w 'getActiveEffects'
/*     */     //   2338: aload #68
/*     */     //   2340: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2343: ifeq -> 2507
/*     */     //   2346: aload_0
/*     */     //   2347: invokevirtual configuration : ()Lli/cil/oc/common/nanomachines/NeuralNetwork;
/*     */     //   2350: dup
/*     */     //   2351: astore #69
/*     */     //   2353: monitorenter
/*     */     //   2354: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   2357: aload_0
/*     */     //   2358: invokevirtual getActiveBehaviors : ()Ljava/lang/Iterable;
/*     */     //   2361: invokevirtual iterableAsScalaIterable : (Ljava/lang/Iterable;)Lscala/collection/Iterable;
/*     */     //   2364: new li/cil/oc/common/nanomachines/ControllerImpl$$anonfun$3
/*     */     //   2367: dup
/*     */     //   2368: aload_0
/*     */     //   2369: invokespecial <init> : (Lli/cil/oc/common/nanomachines/ControllerImpl;)V
/*     */     //   2372: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   2375: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   2378: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   2383: checkcast scala/collection/TraversableLike
/*     */     //   2386: new li/cil/oc/common/nanomachines/ControllerImpl$$anonfun$4
/*     */     //   2389: dup
/*     */     //   2390: aload_0
/*     */     //   2391: invokespecial <init> : (Lli/cil/oc/common/nanomachines/ControllerImpl;)V
/*     */     //   2394: invokeinterface filterNot : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   2399: checkcast scala/collection/Iterable
/*     */     //   2402: astore #71
/*     */     //   2404: new scala/collection/mutable/StringBuilder
/*     */     //   2407: dup
/*     */     //   2408: invokespecial <init> : ()V
/*     */     //   2411: ldc_w '{'
/*     */     //   2414: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   2417: aload #71
/*     */     //   2419: new li/cil/oc/common/nanomachines/ControllerImpl$$anonfun$5
/*     */     //   2422: dup
/*     */     //   2423: aload_0
/*     */     //   2424: invokespecial <init> : (Lli/cil/oc/common/nanomachines/ControllerImpl;)V
/*     */     //   2427: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   2430: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   2433: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   2438: checkcast scala/collection/TraversableOnce
/*     */     //   2441: ldc_w ','
/*     */     //   2444: invokeinterface mkString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   2449: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   2452: ldc_w '}'
/*     */     //   2455: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   2458: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   2461: astore #72
/*     */     //   2463: aload_0
/*     */     //   2464: aload_2
/*     */     //   2465: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2468: iconst_2
/*     */     //   2469: anewarray java/lang/Object
/*     */     //   2472: dup
/*     */     //   2473: iconst_0
/*     */     //   2474: ldc_w 'effects'
/*     */     //   2477: aastore
/*     */     //   2478: dup
/*     */     //   2479: iconst_1
/*     */     //   2480: aload #72
/*     */     //   2482: aastore
/*     */     //   2483: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2486: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   2489: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2492: astore #70
/*     */     //   2494: aload #69
/*     */     //   2496: monitorexit
/*     */     //   2497: aload #70
/*     */     //   2499: checkcast scala/runtime/BoxedUnit
/*     */     //   2502: astore #32
/*     */     //   2504: goto -> 2645
/*     */     //   2507: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2510: astore #32
/*     */     //   2512: goto -> 2645
/*     */     //   2515: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2518: astore #25
/*     */     //   2520: goto -> 2650
/*     */     //   2523: new scala/MatchError
/*     */     //   2526: dup
/*     */     //   2527: aload #4
/*     */     //   2529: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2532: athrow
/*     */     //   2533: pop
/*     */     //   2534: aload_0
/*     */     //   2535: aload_2
/*     */     //   2536: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2539: iconst_3
/*     */     //   2540: anewarray java/lang/Object
/*     */     //   2543: dup
/*     */     //   2544: iconst_0
/*     */     //   2545: ldc_w 'saved'
/*     */     //   2548: aastore
/*     */     //   2549: dup
/*     */     //   2550: iconst_1
/*     */     //   2551: iconst_0
/*     */     //   2552: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   2555: aastore
/*     */     //   2556: dup
/*     */     //   2557: iconst_2
/*     */     //   2558: ldc_w 'error'
/*     */     //   2561: aastore
/*     */     //   2562: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2565: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   2568: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2571: astore #32
/*     */     //   2573: goto -> 2645
/*     */     //   2576: pop
/*     */     //   2577: aload_0
/*     */     //   2578: aload_2
/*     */     //   2579: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2582: iconst_2
/*     */     //   2583: anewarray java/lang/Object
/*     */     //   2586: dup
/*     */     //   2587: iconst_0
/*     */     //   2588: ldc_w 'input'
/*     */     //   2591: aastore
/*     */     //   2592: dup
/*     */     //   2593: iconst_1
/*     */     //   2594: ldc_w 'error'
/*     */     //   2597: aastore
/*     */     //   2598: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2601: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   2604: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2607: astore #32
/*     */     //   2609: goto -> 2645
/*     */     //   2612: pop
/*     */     //   2613: aload_0
/*     */     //   2614: aload_2
/*     */     //   2615: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2618: iconst_2
/*     */     //   2619: anewarray java/lang/Object
/*     */     //   2622: dup
/*     */     //   2623: iconst_0
/*     */     //   2624: ldc_w 'input'
/*     */     //   2627: aastore
/*     */     //   2628: dup
/*     */     //   2629: iconst_1
/*     */     //   2630: ldc_w 'error'
/*     */     //   2633: aastore
/*     */     //   2634: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2637: invokevirtual respond : (Lli/cil/oc/api/network/WirelessEndpoint;Lscala/collection/Seq;)V
/*     */     //   2640: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2643: astore #32
/*     */     //   2645: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2648: astore #25
/*     */     //   2650: return
/*     */     //   2651: aload #69
/*     */     //   2653: monitorexit
/*     */     //   2654: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 0
/*     */     //   #67	-> 28
/*     */     //   #68	-> 192
/*     */     //   #69	-> 214
/*     */     //   #70	-> 243
/*     */     //   #71	-> 318
/*     */     //   #75	-> 375
/*     */     //   #76	-> 379
/*     */     //   #77	-> 481
/*     */     //   #78	-> 518
/*     */     //   #76	-> 552
/*     */     //   #79	-> 557
/*     */     //   #80	-> 628
/*     */     //   #81	-> 677
/*     */     //   #82	-> 748
/*     */     //   #84	-> 756
/*     */     //   #85	-> 792
/*     */     //   #86	-> 798
/*     */     //   #87	-> 813
/*     */     //   #88	-> 826
/*     */     //   #89	-> 839
/*     */     //   #90	-> 870
/*     */     //   #92	-> 904
/*     */     //   #98	-> 944
/*     */     //   #99	-> 1015
/*     */     //   #100	-> 1070
/*     */     //   #101	-> 1141
/*     */     //   #102	-> 1202
/*     */     //   #103	-> 1273
/*     */     //   #104	-> 1321
/*     */     //   #105	-> 1392
/*     */     //   #106	-> 1431
/*     */     //   #107	-> 1502
/*     */     //   #109	-> 1544
/*     */     //   #110	-> 1615
/*     */     //   #111	-> 1654
/*     */     //   #112	-> 1725
/*     */     //   #113	-> 1764
/*     */     //   #114	-> 1835
/*     */     //   #115	-> 1874
/*     */     //   #117	-> 1976
/*     */     //   #118	-> 1989
/*     */     //   #124	-> 2035
/*     */     //   #126	-> 2168
/*     */     //   #127	-> 2187
/*     */     //   #130	-> 2242
/*     */     //   #137	-> 2275
/*     */     //   #138	-> 2346
/*     */     //   #139	-> 2354
/*     */     //   #140	-> 2404
/*     */     //   #141	-> 2463
/*     */     //   #138	-> 2496
/*     */     //   #143	-> 2507
/*     */     //   #145	-> 2515
/*     */     //   #67	-> 2523
/*     */     //   #83	-> 2533
/*     */     //   #96	-> 2534
/*     */     //   #81	-> 2571
/*     */     //   #116	-> 2576
/*     */     //   #122	-> 2577
/*     */     //   #116	-> 2607
/*     */     //   #125	-> 2612
/*     */     //   #135	-> 2613
/*     */     //   #125	-> 2643
/*     */     //   #75	-> 2645
/*     */     //   #70	-> 2648
/*     */     //   #66	-> 2650
/*     */     //   #138	-> 2651
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	2655	0	this	Lli/cil/oc/common/nanomachines/ControllerImpl;
/*     */     //   0	2655	1	packet	Lli/cil/oc/api/network/Packet;
/*     */     //   0	2655	2	sender	Lli/cil/oc/api/network/WirelessEndpoint;
/*     */     //   118	2537	5	dx	D
/*     */     //   128	2527	7	dy	D
/*     */     //   138	2517	9	dz	D
/*     */     //   174	2481	12	dx	D
/*     */     //   183	2472	14	dy	D
/*     */     //   192	2463	16	dz	D
/*     */     //   214	2441	18	dSquared	D
/*     */     //   265	2390	22	header	Ljava/lang/Object;
/*     */     //   375	2273	26	command	[Ljava/lang/Object;
/*     */     //   455	2200	30	port	Ljava/lang/Object;
/*     */     //   756	1899	37	nanomachines	Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   792	1863	38	index	I
/*     */     //   813	88	39	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   1950	705	58	index	Ljava/lang/Object;
/*     */     //   1989	43	60	trigger	Z
/*     */     //   2111	544	63	index	Ljava/lang/Object;
/*     */     //   2127	528	64	value	Ljava/lang/Object;
/*     */     //   2404	88	71	names	Lscala/collection/Iterable;
/*     */     //   2463	29	72	joined	Ljava/lang/String;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   756	944	2533	finally
/*     */     //   1976	2035	2576	finally
/*     */     //   2168	2275	2612	finally
/*     */     //   2354	2497	2651	finally
/*     */   }
/*     */   public final class ControllerImpl$$anonfun$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Object apply(Object x0$1) {
/*  71 */       Object object2, object1 = x0$1;
/*  72 */       if (object1 instanceof byte[]) { byte[] arrayOfByte = (byte[])object1; object2 = new String(arrayOfByte, Charsets.UTF_8); }
/*  73 */       else { object2 = object1; }
/*     */       
/*     */       return object2;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ControllerImpl$$anonfun$1(ControllerImpl $outer) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ControllerImpl$$anonfun$2
/*     */     extends AbstractFunction1<ItemStack, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final ItemInfo nanomachines$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(ItemStack stack) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   4: aload_0
/*     */       //   5: getfield nanomachines$1 : Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   8: astore_2
/*     */       //   9: dup
/*     */       //   10: ifnonnull -> 21
/*     */       //   13: pop
/*     */       //   14: aload_2
/*     */       //   15: ifnull -> 28
/*     */       //   18: goto -> 49
/*     */       //   21: aload_2
/*     */       //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   25: ifeq -> 49
/*     */       //   28: new li/cil/oc/common/item/data/NanomachineData
/*     */       //   31: dup
/*     */       //   32: aload_1
/*     */       //   33: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */       //   36: invokevirtual configuration : ()Lscala/Option;
/*     */       //   39: invokevirtual isEmpty : ()Z
/*     */       //   42: ifeq -> 49
/*     */       //   45: iconst_1
/*     */       //   46: goto -> 50
/*     */       //   49: iconst_0
/*     */       //   50: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #84	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	51	0	this	Lli/cil/oc/common/nanomachines/ControllerImpl$$anonfun$2;
/*     */       //   0	51	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ControllerImpl$$anonfun$2(ControllerImpl $outer, ItemInfo nanomachines$1) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ControllerImpl$$anonfun$3
/*     */     extends AbstractFunction1<Behavior, String>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final String apply(Behavior x$2)
/*     */     {
/* 139 */       return x$2.getNameHint(); } public ControllerImpl$$anonfun$3(ControllerImpl $outer) {} } public final class ControllerImpl$$anonfun$4 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(String x$1) { return Strings.isNullOrEmpty(x$1); } public ControllerImpl$$anonfun$4(ControllerImpl $outer) {} } public final class ControllerImpl$$anonfun$5 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(String x$3) {
/* 140 */       return x$3.replace(',', '_').replace('"', '_');
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ControllerImpl$$anonfun$5(ControllerImpl $outer) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void respond(WirelessEndpoint endpoint, Seq data) {
/* 151 */     queuedCommand_$eq(Option$.MODULE$.apply(new ControllerImpl$$anonfun$respond$1(this, data)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     commandDelay_$eq((int)(Settings$.MODULE$.get().nanomachinesCommandDelay() * 20));
/*     */   } public final class ControllerImpl$$anonfun$respond$1 extends AbstractFunction0.mcV.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Seq data$1; public final void apply() {
/*     */       apply$mcV$sp();
/*     */     } public ControllerImpl$$anonfun$respond$1(ControllerImpl $outer, Seq data$1) {} public void apply$mcV$sp() {
/*     */       if (this.$outer.responsePort() > 0) {
/*     */         double cost = Settings$.MODULE$.get().wirelessCostPerRange()[1] * this.$outer.CommandRange();
/*     */         double epsilon = 0.1D;
/*     */         if (this.$outer.changeBuffer(-cost) > -epsilon) {
/*     */           (new String[1])[0] = "nanomachines";
/*     */           Packet packet = Network.newPacket(this.$outer.uuid(), null, this.$outer.responsePort(), (Object[])((TraversableOnce)((TraversableLike)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[1]))).$plus$plus((GenTraversableOnce)this.data$1.map((Function1)new ControllerImpl$$anonfun$respond$1$$anonfun$6(this), Seq$.MODULE$.canBuildFrom()), Iterable$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.AnyRef()));
/*     */           Network.sendWirelessPacket(this.$outer, this.$outer.CommandRange(), packet);
/*     */         } 
/*     */       } 
/*     */     }
/*     */     public final class ControllerImpl$$anonfun$respond$1$$anonfun$6 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       public final Object apply(Object x$4) {
/*     */         return x$4;
/*     */       }
/*     */       public ControllerImpl$$anonfun$respond$1$$anonfun$6(ControllerImpl$$anonfun$respond$1 $outer) {} } }
/*     */   public ControllerImpl reconfigure() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial isServer : ()Z
/*     */     //   4: ifeq -> 163
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual configuration : ()Lli/cil/oc/common/nanomachines/NeuralNetwork;
/*     */     //   11: dup
/*     */     //   12: astore_1
/*     */     //   13: monitorenter
/*     */     //   14: aload_0
/*     */     //   15: invokevirtual configuration : ()Lli/cil/oc/common/nanomachines/NeuralNetwork;
/*     */     //   18: invokevirtual reconfigure : ()V
/*     */     //   21: aload_0
/*     */     //   22: iconst_1
/*     */     //   23: invokevirtual activeBehaviorsDirty_$eq : (Z)V
/*     */     //   26: aload_0
/*     */     //   27: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   30: astore_3
/*     */     //   31: aload_3
/*     */     //   32: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   35: ifeq -> 148
/*     */     //   38: aload_3
/*     */     //   39: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   42: astore #4
/*     */     //   44: aload #4
/*     */     //   46: getfield field_71135_a : Lnet/minecraft/network/NetHandlerPlayServer;
/*     */     //   49: ifnull -> 148
/*     */     //   52: aload_0
/*     */     //   53: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   56: new net/minecraft/potion/PotionEffect
/*     */     //   59: dup
/*     */     //   60: getstatic net/minecraft/potion/Potion.field_76440_q : Lnet/minecraft/potion/Potion;
/*     */     //   63: getfield field_76415_H : I
/*     */     //   66: bipush #100
/*     */     //   68: invokespecial <init> : (II)V
/*     */     //   71: invokevirtual func_70690_d : (Lnet/minecraft/potion/PotionEffect;)V
/*     */     //   74: aload_0
/*     */     //   75: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   78: new net/minecraft/potion/PotionEffect
/*     */     //   81: dup
/*     */     //   82: getstatic net/minecraft/potion/Potion.field_76436_u : Lnet/minecraft/potion/Potion;
/*     */     //   85: getfield field_76415_H : I
/*     */     //   88: sipush #150
/*     */     //   91: invokespecial <init> : (II)V
/*     */     //   94: invokevirtual func_70690_d : (Lnet/minecraft/potion/PotionEffect;)V
/*     */     //   97: aload_0
/*     */     //   98: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   101: new net/minecraft/potion/PotionEffect
/*     */     //   104: dup
/*     */     //   105: getstatic net/minecraft/potion/Potion.field_76421_d : Lnet/minecraft/potion/Potion;
/*     */     //   108: getfield field_76415_H : I
/*     */     //   111: sipush #200
/*     */     //   114: invokespecial <init> : (II)V
/*     */     //   117: invokevirtual func_70690_d : (Lnet/minecraft/potion/PotionEffect;)V
/*     */     //   120: aload_0
/*     */     //   121: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   124: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   127: invokevirtual nanomachineReconfigureCost : ()D
/*     */     //   130: dneg
/*     */     //   131: invokevirtual changeBuffer : (D)D
/*     */     //   134: pop2
/*     */     //   135: aload_0
/*     */     //   136: iconst_0
/*     */     //   137: invokevirtual hasSentConfiguration_$eq : (Z)V
/*     */     //   140: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   143: astore #5
/*     */     //   145: goto -> 153
/*     */     //   148: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   151: astore #5
/*     */     //   153: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   156: astore_2
/*     */     //   157: aload_1
/*     */     //   158: monitorexit
/*     */     //   159: aload_2
/*     */     //   160: goto -> 166
/*     */     //   163: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   166: pop
/*     */     //   167: aload_0
/*     */     //   168: areturn
/*     */     //   169: aload_1
/*     */     //   170: monitorexit
/*     */     //   171: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #167	-> 0
/*     */     //   #168	-> 14
/*     */     //   #169	-> 21
/*     */     //   #171	-> 26
/*     */     //   #172	-> 31
/*     */     //   #173	-> 52
/*     */     //   #174	-> 74
/*     */     //   #175	-> 97
/*     */     //   #176	-> 120
/*     */     //   #178	-> 135
/*     */     //   #172	-> 143
/*     */     //   #179	-> 148
/*     */     //   #171	-> 153
/*     */     //   #167	-> 158
/*     */     //   #182	-> 167
/*     */     //   #167	-> 169
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	172	0	this	Lli/cil/oc/common/nanomachines/ControllerImpl;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	159	169	finally
/*     */   }
/* 185 */   public int getTotalInputCount() { synchronized (configuration()) { Integer integer = BoxesRunTime.boxToInteger(configuration().triggers().length()); return BoxesRunTime.unboxToInt(integer); }
/*     */      } public int getSafeActiveInputs() {
/* 187 */     return Settings$.MODULE$.get().nanomachinesSafeInputsActive();
/*     */   } public int getMaxActiveInputs() {
/* 189 */     return Settings$.MODULE$.get().nanomachinesMaxInputsActive();
/*     */   }
/* 191 */   public boolean getInput(int index) { synchronized (configuration()) { Boolean bool = BoxesRunTime.boxToBoolean(((NeuralNetwork.TriggerNeuron)configuration().triggers().apply(index)).isActive()); return BoxesRunTime.unboxToBoolean(bool); }
/*     */      } public boolean setInput(int index, boolean value) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial isServer : ()Z
/*     */     //   4: ifeq -> 99
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual configuration : ()Lli/cil/oc/common/nanomachines/NeuralNetwork;
/*     */     //   11: dup
/*     */     //   12: astore_3
/*     */     //   13: monitorenter
/*     */     //   14: iload_2
/*     */     //   15: ifeq -> 48
/*     */     //   18: aload_0
/*     */     //   19: invokevirtual configuration : ()Lli/cil/oc/common/nanomachines/NeuralNetwork;
/*     */     //   22: invokevirtual triggers : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   25: new li/cil/oc/common/nanomachines/ControllerImpl$$anonfun$setInput$1
/*     */     //   28: dup
/*     */     //   29: aload_0
/*     */     //   30: invokespecial <init> : (Lli/cil/oc/common/nanomachines/ControllerImpl;)V
/*     */     //   33: invokevirtual count : (Lscala/Function1;)I
/*     */     //   36: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   39: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   42: invokevirtual nanomachinesMaxInputsActive : ()I
/*     */     //   45: if_icmpge -> 79
/*     */     //   48: aload_0
/*     */     //   49: invokevirtual configuration : ()Lli/cil/oc/common/nanomachines/NeuralNetwork;
/*     */     //   52: invokevirtual triggers : ()Lscala/collection/mutable/ArrayBuffer;
/*     */     //   55: iload_1
/*     */     //   56: invokevirtual apply : (I)Ljava/lang/Object;
/*     */     //   59: checkcast li/cil/oc/common/nanomachines/NeuralNetwork$TriggerNeuron
/*     */     //   62: iload_2
/*     */     //   63: invokevirtual isActive_$eq : (Z)V
/*     */     //   66: aload_0
/*     */     //   67: iconst_1
/*     */     //   68: invokevirtual activeBehaviorsDirty_$eq : (Z)V
/*     */     //   71: iconst_1
/*     */     //   72: ifeq -> 79
/*     */     //   75: iconst_1
/*     */     //   76: goto -> 80
/*     */     //   79: iconst_0
/*     */     //   80: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   83: astore #4
/*     */     //   85: aload_3
/*     */     //   86: monitorexit
/*     */     //   87: aload #4
/*     */     //   89: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 99
/*     */     //   95: iconst_1
/*     */     //   96: goto -> 100
/*     */     //   99: iconst_0
/*     */     //   100: ireturn
/*     */     //   101: aload_3
/*     */     //   102: monitorexit
/*     */     //   103: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #194	-> 0
/*     */     //   #195	-> 14
/*     */     //   #196	-> 48
/*     */     //   #197	-> 66
/*     */     //   #198	-> 71
/*     */     //   #195	-> 75
/*     */     //   #194	-> 86
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	104	0	this	Lli/cil/oc/common/nanomachines/ControllerImpl;
/*     */     //   0	104	1	index	I
/*     */     //   0	104	2	value	Z
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	87	101	finally
/*     */   } public final class ControllerImpl$$anonfun$setInput$1 extends AbstractFunction1<NeuralNetwork.TriggerNeuron, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(NeuralNetwork.TriggerNeuron x$5) {
/* 195 */       return x$5.isActive();
/*     */     }
/*     */ 
/*     */     
/*     */     public ControllerImpl$$anonfun$setInput$1(ControllerImpl $outer) {} }
/*     */ 
/*     */   
/*     */   public Iterable<Behavior> getActiveBehaviors() {
/* 203 */     synchronized (configuration()) {
/* 204 */       cleanActiveBehaviors(DisableReason.InputChanged);
/* 205 */       return WrapAsJava$.MODULE$.mutableSetAsJavaSet(activeBehaviors());
/*     */     } 
/*     */   } public int getInputCount(Behavior behavior) {
/* 208 */     synchronized (configuration()) { Integer integer = BoxesRunTime.boxToInteger(configuration().inputs(behavior)); return BoxesRunTime.unboxToInt(integer); }
/*     */   
/*     */   }
/*     */   public double getLocalBuffer() {
/* 212 */     return storedEnergy();
/*     */   } public double getLocalBufferSize() {
/* 214 */     return Settings$.MODULE$.get().bufferNanomachines();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public double changeBuffer(double delta) {
/* 220 */     double newValue = storedEnergy() + delta;
/* 221 */     storedEnergy_$eq(package$.MODULE$.min(package$.MODULE$.max(newValue, 0.0D), getLocalBufferSize()));
/* 222 */     return isClient() ? delta : ((delta < false && (Settings$.MODULE$.get().ignorePower() || (player()).field_71075_bZ.field_75098_d)) ? 0.0D : (newValue - storedEnergy()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ControllerImpl$$anonfun$update$1
/*     */     extends AbstractFunction1<Function0<BoxedUnit>, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(Function0 x$6) {
/* 237 */       x$6.apply$mcV$sp();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ControllerImpl$$anonfun$update$1(ControllerImpl $outer) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void update() {
/* 257 */     ObjectRef active$lzy = ObjectRef.zero();
/* 258 */     IntRef activeInputs$lzy = IntRef.zero(); VolatileByteRef bitmap$0 = VolatileByteRef.create((byte)0); if ((player()).field_70128_L)
/*     */       return;  if (isServer()) { if (commandDelay() > 0) { commandDelay_$eq(commandDelay() - 1); if (commandDelay() == 0) { queuedCommand().foreach((Function1)new ControllerImpl$$anonfun$update$1(this)); queuedCommand_$eq((Option<Function0<BoxedUnit>>)None$.MODULE$); }  }  if ((player()).field_70170_p.field_73011_w.field_76574_g != previousDimension()) { Network.leaveWirelessNetwork(this, previousDimension()); Network.joinWirelessNetwork(this); previousDimension_$eq((player()).field_70170_p.field_73011_w.field_76574_g); } else { Network.updateWirelessNetwork(this); }  }
/* 260 */      boolean hasPower = (getLocalBuffer() > false || Settings$.MODULE$.get().ignorePower()); if (hasPower != hadPower())
/* 261 */       if (hasPower) {
/*     */ 
/*     */ 
/*     */         
/* 265 */         active$1(active$lzy, bitmap$0).foreach((Function1)new ControllerImpl$$anonfun$update$3(this));
/*     */       } else {
/*     */         active$1(active$lzy, bitmap$0).foreach((Function1)new ControllerImpl$$anonfun$update$2(this)); hasPower = (getLocalBuffer() > false || Settings$.MODULE$.get().ignorePower());
/* 268 */       }   if (hasPower) {
/* 269 */       active$1(active$lzy, bitmap$0).foreach((Function1)new ControllerImpl$$anonfun$update$4(this));
/*     */ 
/*     */       
/* 272 */       if (player().func_130014_f_().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 273 */         changeBuffer(-Settings$.MODULE$.get().nanomachineCost() * Settings$.MODULE$.get().tickFrequency() * (activeInputs$1(activeInputs$lzy, bitmap$0) + 0.5D));
/* 274 */         PacketSender$.MODULE$.sendNanomachinePower(player());
/*     */       } 
/*     */       
/* 277 */       int overload = activeInputs$1(activeInputs$lzy, bitmap$0) - getSafeActiveInputs();
/* 278 */       isServer() ? ((!(player()).field_71075_bZ.field_75098_d && overload > 0 && player().func_130014_f_().func_82737_E() % 20L == 0L) ? 
/* 279 */         BoxesRunTime.boxToBoolean(player().func_70097_a(OverloadDamage(), overload)) : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */       
/* 283 */       if (isClient() && Settings$.MODULE$.get().enableNanomachinePfx()) {
/* 284 */         double energyRatio = getLocalBuffer() / (getLocalBufferSize() + true);
/* 285 */         int triggerRatio = activeInputs$1(activeInputs$lzy, bitmap$0) / (configuration().triggers().length() + 1);
/* 286 */         double intensity = (energyRatio + triggerRatio) * 0.25D;
/* 287 */         PlayerUtils$.MODULE$.spawnParticleAround(player(), "portal", intensity);
/*     */       } 
/*     */     } 
/*     */     
/* 291 */     if (isServer()) {
/*     */       
/* 293 */       if (hadPower() != hasPower) {
/* 294 */         PacketSender$.MODULE$.sendNanomachinePower(player());
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 300 */       if (!hasSentConfiguration() || player().func_130014_f_().func_82737_E() % 1200L == 0L) {
/* 301 */         hasSentConfiguration_$eq(true);
/* 302 */         PacketSender$.MODULE$.sendNanomachineConfiguration(player());
/*     */       } 
/*     */     } 
/*     */     
/* 306 */     hadPower_$eq(hasPower);
/*     */   } private final Iterable active$lzycompute$1(ObjectRef active$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x1) == 0) { active$lzy$1.elem = WrapAsScala$.MODULE$.iterableAsScalaIterable(getActiveBehaviors()).toIterable(); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x1); }  return (Iterable)active$lzy$1.elem; }  } private final Iterable active$1(ObjectRef active$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x1) == 0) ? active$lzycompute$1(active$lzy$1, bitmap$0$1) : (Iterable)active$lzy$1.elem; } private final int activeInputs$lzycompute$1(IntRef activeInputs$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x2) == 0) { activeInputs$lzy$1.elem = configuration().triggers().count((Function1)new ControllerImpl$$anonfun$activeInputs$lzycompute$1$1(this)); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x2); }  return activeInputs$lzy$1.elem; }  } private final int activeInputs$1(IntRef activeInputs$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x2) == 0) ? activeInputs$lzycompute$1(activeInputs$lzy$1, bitmap$0$1) : activeInputs$lzy$1.elem; } public final class ControllerImpl$$anonfun$activeInputs$lzycompute$1$1 extends AbstractFunction1<NeuralNetwork.TriggerNeuron, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(NeuralNetwork.TriggerNeuron x$7) { return x$7.isActive(); } public ControllerImpl$$anonfun$activeInputs$lzycompute$1$1(ControllerImpl $outer) {} } public final class ControllerImpl$$anonfun$update$2 extends AbstractFunction1<Behavior, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(Behavior x$8) { x$8.onDisable(DisableReason.OutOfEnergy); } public ControllerImpl$$anonfun$update$2(ControllerImpl $outer) {} } public final class ControllerImpl$$anonfun$update$3 extends AbstractFunction1<Behavior, BoxedUnit> implements Serializable {
/* 310 */     public static final long serialVersionUID = 0L; public final void apply(Behavior x$9) { x$9.onEnable(); } public ControllerImpl$$anonfun$update$3(ControllerImpl $outer) {} } public final class ControllerImpl$$anonfun$update$4 extends AbstractFunction1<Behavior, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Behavior x$10) { x$10.update(); } public ControllerImpl$$anonfun$update$4(ControllerImpl $outer) {} } public void reset() { synchronized (configuration()) { RichInt$.MODULE$
/* 311 */         .until$extension0(Predef$.MODULE$.intWrapper(0), getTotalInputCount()).foreach$mVc$sp((Function1)new ControllerImpl$$anonfun$reset$1(this));
/*     */ 
/*     */ 
/*     */       
/* 315 */       cleanActiveBehaviors(DisableReason.Default); return; }
/*     */      } public final class ControllerImpl$$anonfun$reset$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(int index) { apply$mcVI$sp(index); } public ControllerImpl$$anonfun$reset$1(ControllerImpl $outer) {}
/*     */     public void apply$mcVI$sp(int index) { ((NeuralNetwork.TriggerNeuron)this.$outer.configuration().triggers().apply(index)).isActive_$eq(false);
/*     */       this.$outer.activeBehaviorsDirty_$eq(true); } }
/* 320 */   public void dispose() { reset();
/* 321 */     if (isServer()) {
/* 322 */       Network.leaveWirelessNetwork(this);
/*     */     } }
/*     */ 
/*     */   
/*     */   public void debug() {
/* 327 */     if (isServer()) {
/* 328 */       configuration().debug();
/* 329 */       activeBehaviorsDirty_$eq(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void print() {
/* 334 */     if (isServer()) {
/* 335 */       configuration().print(player());
/*     */     }
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt)
/*     */   {
/* 341 */     synchronized (configuration())
/* 342 */     { nbt.func_74778_a("uuid", uuid());
/* 343 */       nbt.func_74768_a("port", responsePort());
/* 344 */       nbt.func_74780_a("energy", storedEnergy());
/* 345 */       ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag("configuration", (Function1)new ControllerImpl$$anonfun$save$1(this)); return; }  } public final class ControllerImpl$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(NBTTagCompound nbt) { this.$outer.configuration().save(nbt); }
/*     */      public ControllerImpl$$anonfun$save$1(ControllerImpl $outer) {} }
/*     */   public void load(NBTTagCompound nbt) {
/* 348 */     synchronized (configuration()) {
/* 349 */       uuid_$eq(nbt.func_74779_i("uuid"));
/* 350 */       responsePort_$eq(nbt.func_74762_e("port"));
/* 351 */       storedEnergy_$eq(nbt.func_74769_h("energy"));
/* 352 */       configuration().load(nbt.func_74775_l("configuration"));
/* 353 */       activeBehaviorsDirty_$eq(true);
/*     */       return;
/*     */     } 
/*     */   }
/*     */   private boolean isClient() {
/* 358 */     return (world()).field_72995_K;
/*     */   } private boolean isServer() {
/* 360 */     return !isClient();
/*     */   }
/*     */   private void cleanActiveBehaviors(DisableReason reason) {
/* 363 */     if (activeBehaviorsDirty())
/* 364 */       synchronized (configuration()) {
/* 365 */         ArrayBuffer newBehaviors = (ArrayBuffer)((TraversableLike)configuration().behaviors().filter((Function1)new ControllerImpl$$anonfun$7(this))).map((Function1)new ControllerImpl$$anonfun$8(this), ArrayBuffer$.MODULE$.canBuildFrom());
/* 366 */         ArrayBuffer addedBehaviors = (ArrayBuffer)newBehaviors.$minus$minus((GenTraversableOnce)activeBehaviors());
/* 367 */         Set removedBehaviors = activeBehaviors().$minus$minus((GenTraversableOnce)newBehaviors);
/* 368 */         activeBehaviors().clear();
/* 369 */         activeBehaviors().$plus$plus$eq((TraversableOnce)newBehaviors);
/* 370 */         activeBehaviorsDirty_$eq(false);
/* 371 */         addedBehaviors.foreach((Function1)new ControllerImpl$$anonfun$cleanActiveBehaviors$1(this));
/* 372 */         removedBehaviors.foreach((Function1)new ControllerImpl$$anonfun$cleanActiveBehaviors$2(this, reason));
/*     */ 
/*     */         
/* 375 */         PacketSender$.MODULE$.sendNanomachineInputs(player()); activeBehaviorsDirty() ? (isServer() ? BoxedUnit.UNIT : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*     */         return;
/*     */       }  
/*     */   }
/*     */   
/*     */   public final class ControllerImpl$$anonfun$7 extends AbstractFunction1<NeuralNetwork.BehaviorNeuron, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(NeuralNetwork.BehaviorNeuron x$11) {
/*     */       return x$11.isActive();
/*     */     }
/*     */     
/*     */     public ControllerImpl$$anonfun$7(ControllerImpl $outer) {}
/*     */   }
/*     */   
/*     */   public final class ControllerImpl$$anonfun$8 extends AbstractFunction1<NeuralNetwork.BehaviorNeuron, Behavior> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Behavior apply(NeuralNetwork.BehaviorNeuron x$12) {
/*     */       return x$12.behavior();
/*     */     }
/*     */     
/*     */     public ControllerImpl$$anonfun$8(ControllerImpl $outer) {}
/*     */   }
/*     */   
/*     */   public final class ControllerImpl$$anonfun$cleanActiveBehaviors$1 extends AbstractFunction1<Behavior, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Behavior x$13) {
/*     */       x$13.onEnable();
/*     */     }
/*     */     
/*     */     public ControllerImpl$$anonfun$cleanActiveBehaviors$1(ControllerImpl $outer) {}
/*     */   }
/*     */   
/*     */   public final class ControllerImpl$$anonfun$cleanActiveBehaviors$2 extends AbstractFunction1<Behavior, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final DisableReason reason$1;
/*     */     
/*     */     public final void apply(Behavior x$14) {
/*     */       x$14.onDisable(this.reason$1);
/*     */     }
/*     */     
/*     */     public ControllerImpl$$anonfun$cleanActiveBehaviors$2(ControllerImpl $outer, DisableReason reason$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\ControllerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */