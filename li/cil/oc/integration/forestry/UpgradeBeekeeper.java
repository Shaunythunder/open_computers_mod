/*     */ package li.cil.oc.integration.forestry;
/*     */ 
/*     */ import forestry.api.apiculture.IBeeHousing;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.server.component.package$;
/*     */ import li.cil.oc.server.component.traits.WorldAware;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Predef$;
/*     */ import scala.collection.Seq;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005ug\001B\001\003\0015\021\001#\0269he\006$WMQ3fW\026,\007/\032:\013\005\r!\021\001\0034pe\026\034HO]=\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\031\001aB\006\017'SA\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017\005\002\03055\t\001D\003\002\032%\0051AM]5wKJL!a\007\r\003\025\021+g/[2f\023:4w\016\005\002\036I5\taD\003\002 A\0051AO]1jiNT!!\t\022\002\023\r|W\016]8oK:$(BA\022\007\003\031\031XM\035<fe&\021QE\b\002\013/>\024H\016Z!xCJ,\007CA\017(\023\tAcD\001\bTS\022,'+Z:ue&\034G/\0323\021\005uQ\023BA\026\037\0051qU\r^<pe.\fu/\031:f\021!i\003A!b\001\n\003q\023\001\0025pgR,\022a\f\n\004aIBd\001B\031\001\001=\022A\002\020:fM&tW-\\3oiz\002\"a\r\034\016\003QR!!\016\n\002\0179,Go^8sW&\021q\007\016\002\020\013:4\030N]8o[\026tG\017S8tiB\021\021\bP\007\002u)\0211HE\001\tS:$XM\0358bY&\021QH\017\002\006\003\036,g\016\036\005\t\001\021\t\021)A\005_\005)\001n\\:uA!)\021\t\001C\001\005\0061A(\0338jiz\"\"aQ#\021\005\021\003Q\"\001\002\t\0135\002\005\031\001$\023\007\035\023\004H\002\0032\001\0011\005bB%\001\005\004%\tES\001\005]>$W-F\001L!\t\031D*\003\002Ni\t!aj\0343f\021\031y\005\001)A\005\027\006)an\0343fA!A\021\013\001EC\002\0235!+\001\006eKZL7-Z%oM>,\022a\025\t\005)nkV,D\001V\025\t1v+A\005j[6,H/\0312mK*\021\001,W\001\013G>dG.Z2uS>t'\"\001.\002\013M\034\027\r\\1\n\005q+&aA'baB\021alY\007\002?*\021\001-Y\001\005Y\006twMC\001c\003\021Q\027M^1\n\005\021|&AB*ue&tw\r\003\005g\001!\005\t\025)\004T\003-!WM^5dK&sgm\034\021\t\017!\004!\031!C\007S\006\001B-\0324bk2$8\013^1dWNK'0Z\013\002U>\t1.H\001A\021\031i\007\001)A\007U\006\tB-\0324bk2$8\013^1dWNK'0\032\021\t\013=\004A\021\t9\002\033\035,G\017R3wS\016,\027J\0344p)\005\t\b\003\002:vmZl\021a\035\006\003i\006\fA!\036;jY&\021Al\035\t\003ont!\001_=\016\003eK!A_-\002\rA\023X\rZ3g\023\t!GP\003\002{3\")a\020\001C!\006A\001o\\:ji&|g.\006\002\002\002A!\0211AA\004\033\t\t)A\003\002u\r%!\021\021BA\003\0055\021En\\2l!>\034\030\016^5p]\"9\021Q\002\001\005R\005=\021AE2iK\016\\7+\0333f\r>\024\030i\031;j_:$b!!\005\002(\005]\002\003BA\n\003Gi!!!\006\013\007Q\f9B\003\003\002\032\005m\021AB2p[6|gN\003\003\002\036\005}\021AD7j]\026\034'/\0314uM>\024x-\032\006\003\003C\t1A\\3u\023\021\t)#!\006\003\035\031{'oZ3ESJ,7\r^5p]\"A\021\021FA\006\001\004\tY#\001\003be\036\034\b\003BA\027\003gi!!a\f\013\007\005E\"#A\004nC\016D\027N\\3\n\t\005U\022q\006\002\n\003J<W/\\3oiND\001\"!\017\002\f\001\007\0211H\001\002]B\031\0010!\020\n\007\005}\022LA\002J]RDq!a\021\001\t\003\t)%A\005to\006\004\030+^3f]R1\021qIA*\003;\002R\001_A%\003\033J1!a\023Z\005\025\t%O]1z!\rA\030qJ\005\004\003#J&AB!osJ+g\r\003\005\002V\005\005\003\031AA,\003\035\031wN\034;fqR\004B!!\f\002Z%!\0211LA\030\005\035\031uN\034;fqRD\001\"!\013\002B\001\007\0211\006\025\t\003\003\n\t'a\032\002jA!\021QFA2\023\021\t)'a\f\003\021\r\013G\016\0342bG.\f1\001Z8dC\t\tY'A7gk:\034G/[8oQMLG-\032\036ok6\024WM]\025;E>|G.Z1oA5j\003eU<ba\002\"\b.\032\021rk\026,g\016\t4s_6\004C\017[3!g\026dWm\031;fI\002\032Hn\034;!o&$\b\016\t;iK\002\n\007/[1ss\002\nG\017\t;iK\002\032\b/Z2jM&,G\rI:jI\026t\003bBA8\001\021\005\021\021O\001\ng^\f\007\017\022:p]\026$b!a\022\002t\005U\004\002CA+\003[\002\r!a\026\t\021\005%\022Q\016a\001\003WA\003\"!\034\002b\005\035\024\021P\021\003\003w\nQNZ;oGRLwN\034\025tS\022,'H\\;nE\026\024\030F\0172p_2,\027M\034\021.[\001\032v/\0319!i\",\007\005\032:p]\026\004cM]8nAQDW\rI:fY\026\034G/\0323!g2|G\017I<ji\"\004C\017[3!CBL\027M]=!CR\004C\017[3!gB,7-\0334jK\022\0043/\0333f]!9\021q\020\001\005\002\005\005\025AD4fi\n+W\r\025:pOJ,7o\035\013\007\003\017\n\031)!\"\t\021\005U\023Q\020a\001\003/B\001\"!\013\002~\001\007\0211\006\025\t\003{\n\t'a\032\002\n\006\022\0211R\001cMVt7\r^5p]\"\032\030\016Z3;]Vl'-\032:*u9,XNY3sA5j\003eR3uA\r,(O]3oi\002\002(o\\4sKN\034\b\005]3sG\026tG\017\t4pe\002\"\b.\032\021ba&\f'/\037\021bi\002\"\b.\032\021ta\026\034\027NZ5fI\002\032\030\016Z3/\021\035\ty\t\001C\001\003#\013qaY1o/>\0248\016\006\004\002H\005M\025Q\023\005\t\003+\ni\t1\001\002X!A\021\021FAG\001\004\tY\003\013\005\002\016\006\005\024qMAMC\t\tY*\0015gk:\034G/[8oQMLG-\032\036ok6\024WM]\025;E>|G.Z1oA5j\003e\0215fG.\034\b%\0334!GV\024(/\0328uA\t,W\rI5oAQDW\rI1qS\006\024\030\020I1uAQDW\rI:qK\016Lg-[3eAMLG-\032\021dC:\004so\034:lA9|wO\f\005\b\003?\003A\021AAQ\003\035\tg.\0317zu\026$b!a\022\002$\006\025\006\002CA+\003;\003\r!a\026\t\021\005%\022Q\024a\001\003WA\003\"!(\002b\005\035\024\021V\021\003\003W\013\001NZ;oGRLwN\034\025i_:,\027p\0357pijrW/\0342fe&R$m\\8mK\006t\007%L\027!\003:\fG.\037>fg\002\022W-\032\021j]\002\032X\r\\3di\026$\007e\0357pi2\002So]3tA!|g.Z=!MJ|W\016\t;iK\002\032\b/Z2jM&,G\rI:m_Rt\003bBAX\001\021\005\021\021W\001\025C\022$\027J\0343vgR\024\030.\0317Va\036\024\030\rZ3\025\r\005\035\0231WA[\021!\t)&!,A\002\005]\003\002CA\025\003[\003\r!a\013)\021\0055\026\021MA4\003s\013#!a/\002\003\0132WO\\2uS>t\007f]5eKjrW/\0342fenc\023-\\8v]RTd.^7cKJl\026F\0178v[\n,'\017I\027.AQ\023\030.Z:!i>\004\023\r\0323!C6|WO\034;![\006t\027\020I8sA\005dG\016I5oIV\034HO]5bY\002*\bo\032:bI\026\034\bE\032:p[\002\"\b.\032\021tK2,7\r^3eAMdw\016\036\021u_\002Jg\016Z;tiJL\027\r\034\021ba&\f'/\037\021bi\002\"\b.\032\021hSZ,g\016I:jI\026t\003bBA`\001\021\005\021\021Y\001\025O\026$\030J\0343vgR\024\030.\0317Va\036\024\030\rZ3\025\r\005\035\0231YAc\021!\t)&!0A\002\005]\003\002CA\025\003{\003\r!a\013)\021\005u\026\021MA4\003\023\f#!a3\002\003\0071WO\\2uS>t\007f]5eKjrW/\0342fe2\0023\017\\8uu\001rW/\0342fe&RD/\0312mK\002jS\006I$fi\002Jg\016Z;tiJL\027\r\034\021va\036\024\030\rZ3!S:\004C\017[3!O&4XM\034\021tY>$\be\0344!i\",\007%\0338ekN$(/[1mA\005\004\030.\031:zA\005$\b\005\0365fA\035Lg/\0328!g&$WM\f\005\b\003\037\004A\021AAi\003]\021X-\\8wK&sG-^:ue&\fG.\0269he\006$W\r\006\004\002H\005M\027Q\033\005\t\003+\ni\r1\001\002X!A\021\021FAg\001\004\tY\003\013\005\002N\006\005\024qMAmC\t\tY.AA\033MVt7\r^5p]\"\032\030\016Z3;]Vl'-\032:-AMdw\016\036\036!]Vl'-\032:\\Y\001\nWn\\;oij\002c.^7cKJl\026F\0172p_2,\027M\034\021.[\001\022V-\\8wK\002Jg\016Z;tiJL\027\r\034\021va\036\024\030\rZ3!MJ|W\016\t;iK\002:\027N^3oAMdw\016\036\021pM\002\"\b.\032\021j]\022,8\017\036:jC2\004\023\r]5bef\004\023\r\036\021uQ\026\004s-\033<f]\002\032\030\016Z3/\001")
/*     */ public class UpgradeBeekeeper extends ManagedEnvironment implements DeviceInfo, WorldAware, SideRestricted, NetworkAware {
/*     */   private final Agent host;
/*     */   private final Node node;
/*     */   
/*  21 */   public World world() { return WorldAware.class.world(this); } private Map<String, String> deviceInfo; private final int defaultStackSize; private volatile boolean bitmap$0; public EntityPlayer fakePlayer() { return WorldAware.class.fakePlayer(this); } public boolean mayInteract(BlockPosition blockPos, ForgeDirection face) { return WorldAware.class.mayInteract(this, blockPos, face); } public <Type extends net.minecraft.entity.Entity> Buffer<Type> entitiesInBounds(AxisAlignedBB bounds, ClassTag evidence$1) { return WorldAware.class.entitiesInBounds(this, bounds, evidence$1); } public <Type extends net.minecraft.entity.Entity> Buffer<Type> entitiesInBlock(BlockPosition blockPos, ClassTag evidence$2) { return WorldAware.class.entitiesInBlock(this, blockPos, evidence$2); } public <Type extends net.minecraft.entity.Entity> Buffer<Type> entitiesOnSide(ForgeDirection side, ClassTag evidence$3) { return WorldAware.class.entitiesOnSide(this, side, evidence$3); } public <Type extends net.minecraft.entity.Entity> Option<Type> closestEntity(ForgeDirection side, ClassTag evidence$4) { return WorldAware.class.closestEntity(this, side, evidence$4); } public Tuple2<Object, String> blockContent(ForgeDirection side) { return WorldAware.class.blockContent(this, side); } public Agent host() { return this.host; } public UpgradeBeekeeper(Agent host) { WorldAware.class.$init$(this);
/*  22 */     this.node = Network.newNode((Environment)this, Visibility.Network)
/*  23 */       .withComponent("beekeeper", Visibility.Neighbors)
/*  24 */       .withConnector()
/*  25 */       .create(); }
/*     */   public Node node() { return this.node; }
/*  27 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  28 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  29 */         (new Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "BeeKeeper");
/*  30 */         (new Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  31 */         (new Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Breeding bees for you (almost)"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = true; }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/*  34 */   private final int defaultStackSize() { return 64; }
/*     */   
/*  36 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*  37 */   public BlockPosition position() { return BlockPosition$.MODULE$.apply((EnvironmentHost)host()); } public ForgeDirection checkSideForAction(Arguments args, int n) {
/*  38 */     return ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(n);
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number):boolean -- Swap the queen from the selected slot with the apiary at the specified side.")
/*     */   public Object[] swapQueen(Context context, Arguments args) {
/*  43 */     ForgeDirection facing = checkSideForAction(args, 0);
/*  44 */     BlockPosition pos = position().offset(facing);
/*  45 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(UpgradeBeekeeperUtil.swapQueen(pos, host().mainInventory(), host().selectedSlot())) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number):boolean -- Swap the drone from the selected slot with the apiary at the specified side.")
/*     */   public Object[] swapDrone(Context context, Arguments args) {
/*  50 */     ForgeDirection facing = checkSideForAction(args, 0);
/*  51 */     BlockPosition pos = position().offset(facing);
/*  52 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(UpgradeBeekeeperUtil.swapDrone(pos, host().mainInventory(), host().selectedSlot())) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number):number -- Get current progress percent for the apiary at the specified side.")
/*     */   public Object[] getBeeProgress(Context context, Arguments args) {
/*  57 */     ForgeDirection facing = checkSideForAction(args, 0);
/*  58 */     IBeeHousing housing = UpgradeBeekeeperUtil.getBeeHousingAt(position().offset(facing));
/*  59 */     if (housing == null)
/*  60 */       return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "No bee housing found" })); 
/*  61 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(housing.getBeekeepingLogic().getBeeProgressPercent()) }));
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number):boolean -- Checks if current bee in the apiary at the specified side can work now.")
/*     */   public Object[] canWork(Context context, Arguments args) {
/*  66 */     ForgeDirection facing = checkSideForAction(args, 0);
/*  67 */     IBeeHousing housing = UpgradeBeekeeperUtil.getBeeHousingAt(position().offset(facing));
/*  68 */     if (housing == null)
/*  69 */       return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "No bee housing found" })); 
/*  70 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(housing.getBeekeepingLogic().canWork()) }));
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
/*     */   @Callback(doc = "function(honeyslot:number):boolean -- Analyzes bee in selected slot, uses honey from the specified slot.")
/*     */   public Object[] analyze(Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   4: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   9: astore_3
/*     */     //   10: aload_0
/*     */     //   11: invokevirtual host : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   14: invokeinterface selectedSlot : ()I
/*     */     //   19: istore #4
/*     */     //   21: aload_3
/*     */     //   22: iload #4
/*     */     //   24: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   29: astore #5
/*     */     //   31: getstatic forestry/api/apiculture/BeeManager.beeRoot : Lforestry/api/apiculture/IBeeRoot;
/*     */     //   34: aload #5
/*     */     //   36: invokeinterface isMember : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   41: ifeq -> 291
/*     */     //   44: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*     */     //   47: aload_2
/*     */     //   48: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*     */     //   51: aload_3
/*     */     //   52: iconst_0
/*     */     //   53: invokevirtual checkSlot : (Lnet/minecraft/inventory/IInventory;I)I
/*     */     //   56: istore #6
/*     */     //   58: aload_3
/*     */     //   59: iload #6
/*     */     //   61: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   66: astore #7
/*     */     //   68: aload #7
/*     */     //   70: ifnull -> 261
/*     */     //   73: aload #7
/*     */     //   75: getfield field_77994_a : I
/*     */     //   78: iconst_0
/*     */     //   79: if_icmpeq -> 261
/*     */     //   82: aload #7
/*     */     //   84: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   87: getstatic forestry/plugins/PluginApiculture.items : Lforestry/apiculture/items/ItemRegistryApiculture;
/*     */     //   90: getfield honeydew : Lforestry/core/items/ItemForestry;
/*     */     //   93: astore #8
/*     */     //   95: dup
/*     */     //   96: ifnonnull -> 108
/*     */     //   99: pop
/*     */     //   100: aload #8
/*     */     //   102: ifnull -> 150
/*     */     //   105: goto -> 116
/*     */     //   108: aload #8
/*     */     //   110: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   113: ifne -> 150
/*     */     //   116: aload #7
/*     */     //   118: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   121: getstatic forestry/plugins/PluginApiculture.items : Lforestry/apiculture/items/ItemRegistryApiculture;
/*     */     //   124: getfield honeyDrop : Lforestry/core/items/ItemOverlay;
/*     */     //   127: astore #9
/*     */     //   129: dup
/*     */     //   130: ifnonnull -> 142
/*     */     //   133: pop
/*     */     //   134: aload #9
/*     */     //   136: ifnull -> 150
/*     */     //   139: goto -> 261
/*     */     //   142: aload #9
/*     */     //   144: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   147: ifeq -> 261
/*     */     //   150: getstatic forestry/api/apiculture/BeeManager.beeRoot : Lforestry/api/apiculture/IBeeRoot;
/*     */     //   153: aload #5
/*     */     //   155: invokeinterface getMember : (Lnet/minecraft/item/ItemStack;)Lforestry/api/apiculture/IBee;
/*     */     //   160: astore #10
/*     */     //   162: aload #10
/*     */     //   164: invokeinterface isAnalyzed : ()Z
/*     */     //   169: ifne -> 237
/*     */     //   172: aload #10
/*     */     //   174: invokeinterface analyze : ()Z
/*     */     //   179: pop
/*     */     //   180: new net/minecraft/nbt/NBTTagCompound
/*     */     //   183: dup
/*     */     //   184: invokespecial <init> : ()V
/*     */     //   187: astore #11
/*     */     //   189: aload #10
/*     */     //   191: aload #11
/*     */     //   193: invokeinterface writeToNBT : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   198: aload #5
/*     */     //   200: aload #11
/*     */     //   202: invokevirtual func_77982_d : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   205: aload_3
/*     */     //   206: iload #4
/*     */     //   208: aload #5
/*     */     //   210: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   215: aload #7
/*     */     //   217: aload #7
/*     */     //   219: getfield field_77994_a : I
/*     */     //   222: iconst_1
/*     */     //   223: isub
/*     */     //   224: putfield field_77994_a : I
/*     */     //   227: aload_3
/*     */     //   228: iload #6
/*     */     //   230: aload #7
/*     */     //   232: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   237: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   240: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   243: iconst_1
/*     */     //   244: anewarray java/lang/Object
/*     */     //   247: dup
/*     */     //   248: iconst_0
/*     */     //   249: iconst_1
/*     */     //   250: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   253: aastore
/*     */     //   254: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   257: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   260: areturn
/*     */     //   261: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   264: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   267: iconst_2
/*     */     //   268: anewarray java/lang/Object
/*     */     //   271: dup
/*     */     //   272: iconst_0
/*     */     //   273: iconst_0
/*     */     //   274: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   277: aastore
/*     */     //   278: dup
/*     */     //   279: iconst_1
/*     */     //   280: ldc_w 'No honey!'
/*     */     //   283: aastore
/*     */     //   284: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   287: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   290: areturn
/*     */     //   291: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   294: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   297: iconst_2
/*     */     //   298: anewarray java/lang/Object
/*     */     //   301: dup
/*     */     //   302: iconst_0
/*     */     //   303: iconst_0
/*     */     //   304: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   307: aastore
/*     */     //   308: dup
/*     */     //   309: iconst_1
/*     */     //   310: ldc_w 'Not a bee'
/*     */     //   313: aastore
/*     */     //   314: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   317: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   320: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #75	-> 0
/*     */     //   #76	-> 10
/*     */     //   #77	-> 21
/*     */     //   #78	-> 31
/*     */     //   #81	-> 44
/*     */     //   #82	-> 58
/*     */     //   #83	-> 68
/*     */     //   #86	-> 150
/*     */     //   #87	-> 162
/*     */     //   #88	-> 172
/*     */     //   #89	-> 180
/*     */     //   #90	-> 189
/*     */     //   #91	-> 198
/*     */     //   #92	-> 205
/*     */     //   #93	-> 215
/*     */     //   #94	-> 227
/*     */     //   #96	-> 237
/*     */     //   #84	-> 261
/*     */     //   #79	-> 291
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	321	0	this	Lli/cil/oc/integration/forestry/UpgradeBeekeeper;
/*     */     //   0	321	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	321	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   10	250	3	inventory	Lnet/minecraft/inventory/IInventory;
/*     */     //   21	239	4	specimenSlot	I
/*     */     //   31	229	5	specimen	Lnet/minecraft/item/ItemStack;
/*     */     //   58	202	6	honeySlot	I
/*     */     //   68	192	7	honeyStack	Lnet/minecraft/item/ItemStack;
/*     */     //   162	98	10	individual	Lforestry/api/apiculture/IBee;
/*     */     //   189	48	11	nbttagcompound	Lnet/minecraft/nbt/NBTTagCompound;
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
/*     */   @Callback(doc = "function(side:number[,amount:number]):number -- Tries to add amount many or all industrial upgrades from the selected slot to industrial apiary at the given side.")
/*     */   public Object[] addIndustrialUpgrade(Context context, Arguments args) {
/* 101 */     ForgeDirection facing = checkSideForAction(args, 0);
/* 102 */     BlockPosition pos = position().offset(facing);
/* 103 */     int amount = 64;
/* 104 */     if (args.count() > 1)
/* 105 */       amount = args.checkInteger(1); 
/* 106 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(UpgradeBeekeeperUtil.addIndustrialUpgrade(pos, host().mainInventory(), host().selectedSlot(), amount)) }));
/*     */   }
/*     */   @Callback(doc = "function(side:number, slot: number):table -- Get industrial upgrade in the given slot of the industrial apiary at the given side.")
/*     */   public Object[] getIndustrialUpgrade(Context context, Arguments args) {
/* 110 */     ForgeDirection facing = checkSideForAction(args, 0);
/* 111 */     BlockPosition pos = position().offset(facing);
/* 112 */     int slot = args.checkInteger(1);
/* 113 */     int maxIndex = UpgradeBeekeeperUtil.getMaxIndustrialUpgradeCount();
/* 114 */     if (slot < 1 || slot > maxIndex)
/* 115 */       return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, (new StringBuilder()).append("Wrong slot index (should be 1-").append(BoxesRunTime.boxToInteger(maxIndex)).append(")").toString() })); 
/* 116 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { UpgradeBeekeeperUtil.getIndustrialUpgrade(pos, slot) }));
/*     */   }
/*     */   @Callback(doc = "function(side:number, slot: number[, amount: number]):boolean -- Remove industrial upgrade from the given slot of the industrial apiary at the given side.")
/*     */   public Object[] removeIndustrialUpgrade(Context context, Arguments args) {
/* 120 */     ForgeDirection facing = checkSideForAction(args, 0);
/* 121 */     BlockPosition pos = position().offset(facing);
/* 122 */     int slot = args.checkInteger(1);
/* 123 */     int maxIndex = UpgradeBeekeeperUtil.getMaxIndustrialUpgradeCount();
/* 124 */     int amount = 64;
/* 125 */     if (args.count() > 2)
/* 126 */       amount = args.checkInteger(2); 
/* 127 */     if (slot < 1 || slot > maxIndex)
/* 128 */       return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), (new StringBuilder()).append("Wrong slot index (should be 1-").append(BoxesRunTime.boxToInteger(maxIndex)).append(")").toString() })); 
/* 129 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(UpgradeBeekeeperUtil.removeIndustrialUpgrade(pos, host().mainInventory(), host().selectedSlot(), slot, amount)) }));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\UpgradeBeekeeper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */