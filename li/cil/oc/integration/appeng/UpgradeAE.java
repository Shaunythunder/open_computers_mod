/*     */ package li.cil.oc.integration.appeng;
/*     */ 
/*     */ import appeng.api.networking.IGrid;
/*     */ import appeng.api.networking.IGridBlock;
/*     */ import appeng.api.networking.IGridHost;
/*     */ import appeng.api.networking.IGridNode;
/*     */ import appeng.api.networking.storage.IStorageGrid;
/*     */ import appeng.api.storage.IMEMonitor;
/*     */ import appeng.api.storage.data.IAEFluidStack;
/*     */ import appeng.api.storage.data.IAEItemStack;
/*     */ import appeng.api.util.DimensionalCoord;
/*     */ import appeng.api.util.WorldCoord;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.fluids.FluidStack;
/*     */ import net.minecraftforge.fluids.IFluidTank;
/*     */ import scala.Predef$;
/*     */ import scala.runtime.RichInt;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\teb\001B\001\003\0015\021\021\"\0269he\006$W-Q#\013\005\r!\021AB1qa\026twM\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\005\001912\005\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\r9\002DG\007\002\005%\021\021D\001\002\017\035\026$xo\034:l\007>tGO]8m!\tY\022%D\001\035\025\tib$\001\003nSN\034'BA\020!\003\021!\030\016\\3\013\003\rI!A\t\017\003\031QKG.Z*fGV\024\030\016^=\021\005\021:S\"A\023\013\005\031\022\022A\0023sSZ,'/\003\002)K\tQA)\032<jG\026LeNZ8\t\021)\002!Q1A\005\002-\nA\001[8tiV\tA\006\005\002.a5\taF\003\0020%\0059a.\032;x_J\\\027BA\031/\005=)eN^5s_:lWM\034;I_N$\b\002C\032\001\005\003\005\013\021\002\027\002\013!|7\017\036\021\t\021U\002!Q1A\005\002Y\nA\001^5feV\tq\007\005\0029w5\t\021HC\001;\003\025\0318-\0317b\023\ta\024HA\002J]RD\001B\020\001\003\002\003\006IaN\001\006i&,'\017\t\005\006\001\002!\t!Q\001\007y%t\027\016\036 \025\007\t\033E\t\005\002\030\001!)!f\020a\001Y!)Qg\020a\001o!9a\t\001b\001\n\003:\025\001\0028pI\026,\022\001\023\t\003[%K!A\023\030\003%\r{W\016]8oK:$8i\0348oK\016$xN\035\005\007\031\002\001\013\021\002%\002\0139|G-\032\021\t\0219\003\001R1A\005\016=\013!\002Z3wS\016,\027J\0344p+\005\001\006\003B)W1bk\021A\025\006\003'R\013\021\"[7nkR\f'\r\\3\013\005UK\024AC2pY2,7\r^5p]&\021qK\025\002\004\033\006\004\bCA-_\033\005Q&BA.]\003\021a\027M\\4\013\003u\013AA[1wC&\021qL\027\002\007'R\024\030N\\4\t\021\005\004\001\022!Q!\016A\0131\002Z3wS\016,\027J\0344pA!)1\r\001C!I\006iq-\032;EKZL7-Z%oM>$\022!\032\t\005M&T'.D\001h\025\tAG,\001\003vi&d\027BA,h!\tYgN\004\0029Y&\021Q.O\001\007!J,G-\0324\n\005}{'BA7:\021\035\t\b\0011A\005\002I\f\001\"[:BGRLg/Z\013\002gB\021\001\b^\005\003kf\022qAQ8pY\026\fg\016C\004x\001\001\007I\021\001=\002\031%\034\030i\031;jm\026|F%Z9\025\005ed\bC\001\035{\023\tY\030H\001\003V]&$\bbB?w\003\003\005\ra]\001\004q\022\n\004BB@\001A\003&1/A\005jg\006\033G/\033<fA!I\0211\001\001C\002\023\005\021QA\001\006C\036,g\016^\013\003\003\017\001B!!\003\002\0205\021\0211\002\006\004\003\033\021\022\001C5oi\026\024h.\0317\n\t\005E\0211\002\002\006\003\036,g\016\036\005\t\003+\001\001\025!\003\002\b\0051\021mZ3oi\002Bq!!\007\001\t\003\tY\"\001\007hKR\034u.\0349p]\026tG/\006\002\002\036A!\021qDA\027\033\t\t\tC\003\003\002$\005\025\022\001B5uK6TA!a\n\002*\005IQ.\0338fGJ\fg\r\036\006\003\003W\t1A\\3u\023\021\ty#!\t\003\023%#X-\\*uC\016\\\007bBA\032\001\021\005\021QG\001\fO\026$8+Z2ve&$\0300\006\002\0028A!\021\021HA!\033\t\tYD\003\003\002>\005}\022A\0038fi^|'o[5oO*\0211\003I\005\005\003\007\nYDA\005J\017JLG\rS8ti\"9\021q\t\001\005\002\005%\023AC2iK\016\\'+\0318hKR)1/a\023\002P!A\021QJA#\001\004\ti\"A\003ti\006\0347\016\003\005\002R\005\025\003\031AA\034\003\r\031Xm\031\005\b\003+\002A\021AA,\003\0359W\r^$sS\022,\"!!\027\021\t\005e\0221L\005\005\003;\nYDA\003J\017JLG\rC\004\002b\001!\t!a\031\002\021\035,G/Q#LKf$B!!\032\002lA\031\001(a\032\n\007\005%\024H\001\003M_:<\007\002CA'\003?\002\r!!\b\t\r}\001A\021IA8+\005Q\002bBA:\001\021\005\021QO\001\022O\026$h\t\\;jI&sg/\0328u_JLXCAA<!\031\tI(a \002\0046\021\0211\020\006\005\003{\ny$A\004ti>\024\030mZ3\n\t\005\005\0251\020\002\013\0236+Uj\0348ji>\024\b\003BAC\003\027k!!a\"\013\t\005%\0251P\001\005I\006$\030-\003\003\002\016\006\035%!D%B\013\032cW/\0333Ti\006\0347\016C\004\002\022\002!\t!a%\002!\035,G/\023;f[&sg/\0328u_JLXCAAK!\031\tI(a \002\030B!\021QQAM\023\021\tY*a\"\003\031%\013U)\023;f[N#\030mY6\t\017\005}\005\001\"\001\002\"\006I1/\0328e\023R,Wn\035\013\007\003G\013y+a0\021\013a\n)+!+\n\007\005\035\026HA\003BeJ\f\027\020E\0029\003WK1!!,:\005\031\te.\037*fM\"A\021\021WAO\001\004\t\031,A\004d_:$X\r\037;\021\t\005U\0261X\007\003\003oS1!!/\023\003\035i\027m\0315j]\026LA!!0\0028\n91i\0348uKb$\b\002CAa\003;\003\r!a1\002\t\005\024xm\035\t\005\003k\013)-\003\003\002H\006]&!C!sOVlWM\034;tQ!\ti*a3\002R\006M\007\003BA[\003\033LA!a4\0028\nA1)\0317mE\006\0347.A\002e_\016\f#!!6\002\035\032,hn\031;j_:D3L\\;nE\026\024((Y7pk:$X,\013\036ok6\024WM\035\021.[\001\"&/\0318tM\026\024\be]3mK\016$X\r\032\021ji\026l7\017\t;pAe|WO\035\021bK\002\032\030p\035;f[:Bq!!7\001\t\003\tY.\001\007sKF,Xm\035;Ji\026l7\017\006\004\002$\006u\027q\034\005\t\003c\0139\0161\001\0024\"A\021\021YAl\001\004\t\031\r\013\005\002X\006-\027\021[ArC\t\t)/\0012gk:\034G/[8oQ\021\fG/\0312bg\026T\024\r\0323sKN\034H\006I3oiJL(H\\;nE\026\0248\f\f\021ok6\024WM\035\036b[>,h\016^/*u9,XNY3sA5j\003eR3uA%$X-\\:!MJ|W\016I=pkJ\004\023-\032\021tsN$X-\034\030\t\017\005%\b\001\"\001\002l\006Q1/\0328e\r2,\030\016Z:\025\r\005\r\026Q^Ax\021!\t\t,a:A\002\005M\006\002CAa\003O\004\r!a1)\021\005\035\0301ZAi\003g\f#!!>\002\035\032,hn\031;j_:D3L\\;nE\026\024((Y7pk:$X,\013\036ok6\024WM\035\021.[\001\"&/\0318tM\026\024\be]3mK\016$X\r\032\021gYVLG\r\t;pAe|WO\035\021bK\002\032\030p\035;f[:Bq!!?\001\t\003\tY0A\007sKF,Xm\035;GYVLGm\035\013\007\003G\013i0a@\t\021\005E\026q\037a\001\003gC\001\"!1\002x\002\007\0211\031\025\t\003o\fY-!5\003\004\005\022!QA\001cMVt7\r^5p]\"\"\027\r^1cCN,'(\0313ee\026\0348\017\f\021f]R\024\030P\0178v[\n,'o\027\027!]Vl'-\032:;C6|WO\034;^SirW/\0342fe\002jS\006I$fi\0022G.^5eA\031\024x.\034\021z_V\024\b%Y3!gf\034H/Z7/\021\035\021I\001\001C\001\005\027\t\001\"[:MS:\\W\r\032\013\007\003G\023iAa\004\t\021\005E&q\001a\001\003gC\001\"!1\003\b\001\007\0211\031\025\t\005\017\tY-!5\003\024\005\022!QC\001LMVt7\r^5p]\"J#HY8pY\026\fg\016I\027.AI+G/\036:oAQ\024X/\032\021jM\002\"\b.\032\021dCJ$\007%[:!Y&t7.\0323!i>\004\023p\\;sA\005,\007E\\3uo>\0248N\f\005\b\0053\001A\021\tB\016\003\031)\b\017Z1uKR\t\021\020C\004\003 \001!IA!\t\002\023\035,G/\0228fe\036LXC\001B\022!\rA$QE\005\004\005OI$A\002#pk\ndW\rC\004\003,\001!\tE!\f\002\023=tW*Z:tC\036,GcA=\0030!A!\021\007B\025\001\004\021\031$A\004nKN\034\030mZ3\021\0075\022)$C\002\00389\022q!T3tg\006<W\r")
/*     */ public class UpgradeAE extends ManagedEnvironment implements NetworkControl<TileSecurity>, DeviceInfo {
/*     */   private final EnvironmentHost host;
/*     */   private final int tier;
/*     */   private final ComponentConnector node;
/*     */   
/*     */   @Callback(doc = "function():table -- Get a list of tables representing the available CPUs in the network.")
/*  32 */   public Object[] getCpus(Context context, Arguments args) { return NetworkControl$class.getCpus(this, context, args); } private Map<String, String> deviceInfo; private boolean isActive; private final Agent agent; private volatile boolean bitmap$0; @Callback(doc = "function([filter:table]):table -- Get a list of known item recipes. These can be used to issue crafting requests.") public Object[] getCraftables(Context context, Arguments args) { return NetworkControl$class.getCraftables(this, context, args); } @Callback(doc = "function([filter:table]):table -- Get a list of the stored items in the network.") public Object[] getItemsInNetwork(Context context, Arguments args) { return NetworkControl$class.getItemsInNetwork(this, context, args); } @Callback(doc = "function(filter:table):table -- Get a list of the stored items in the network matching the filter. Filter is an Array of Item IDs") public Object[] getItemsInNetworkById(Context context, Arguments args) { return NetworkControl$class.getItemsInNetworkById(this, context, args); } @Callback(doc = "function():userdata -- Get an iterator object for the list of the items in the network.") public Object[] allItems(Context context, Arguments args) { return NetworkControl$class.allItems(this, context, args); } @Callback(doc = "function(filter:table, dbAddress:string[, startSlot:number[, count:number]]): Boolean -- Store items in the network matching the specified filter in the database with the specified address.") public Object[] store(Context context, Arguments args) { return NetworkControl$class.store(this, context, args); } @Callback(doc = "function():table -- Get a list of the stored fluids in the network.") public Object[] getFluidsInNetwork(Context context, Arguments args) { return NetworkControl$class.getFluidsInNetwork(this, context, args); } @Callback(doc = "function():number -- Get the average power injection into the network.") public Object[] getAvgPowerInjection(Context context, Arguments args) { return NetworkControl$class.getAvgPowerInjection(this, context, args); } @Callback(doc = "function():number -- Get the average power usage of the network.") public Object[] getAvgPowerUsage(Context context, Arguments args) { return NetworkControl$class.getAvgPowerUsage(this, context, args); } @Callback(doc = "function():number -- Get the idle power usage of the network.") public Object[] getIdlePowerUsage(Context context, Arguments args) { return NetworkControl$class.getIdlePowerUsage(this, context, args); } @Callback(doc = "function():number -- Get the maximum stored power in the network.") public Object[] getMaxStoredPower(Context context, Arguments args) { return NetworkControl$class.getMaxStoredPower(this, context, args); } @Callback(doc = "function():number -- Get the stored power in the network. ") public Object[] getStoredPower(Context context, Arguments args) { return NetworkControl$class.getStoredPower(this, context, args); } public EnvironmentHost host() { return this.host; } public int tier() { return this.tier; } public UpgradeAE(EnvironmentHost host, int tier) { NetworkControl$class.$init$(this);
/*  33 */     this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  34 */       .withConnector()
/*  35 */       .withComponent("upgrade_me", Visibility.Neighbors)
/*  36 */       .create();
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
/*  47 */     this.isActive = false;
/*     */     
/*  49 */     this.agent = (Agent)host; } public ComponentConnector node() { return this.node; } private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic"); (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Robot ME upgrade"); (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG"); (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), ""); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }  return this.deviceInfo; }  } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return JavaConversions$.MODULE$.mapAsJavaMap((Map)deviceInfo()); } public boolean isActive() { return this.isActive; } public void isActive_$eq(boolean x$1) { this.isActive = x$1; } public Agent agent() { return this.agent; }
/*     */   
/*  51 */   public ItemStack getComponent() { Object object = new Object(); try { ItemStack itemStack; EnvironmentHost environmentHost = host();
/*  52 */       if (environmentHost instanceof Robot) { Robot robot = (Robot)environmentHost; itemStack = robot.func_70301_a(robot.componentSlot(node().address())); }
/*  53 */       else if (environmentHost instanceof Drone) { Drone drone = (Drone)environmentHost;
/*  54 */         JavaConversions$.MODULE$.iterableAsScalaIterable(drone.internalComponents()).foreach((Function1)new UpgradeAE$$anonfun$getComponent$1(this, object));
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  59 */         itemStack = null; }
/*  60 */       else { itemStack = null; }  }
/*     */     catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object)
/*     */         return (ItemStack)nonLocalReturnControl.value();  }
/*     */      return itemStack; } public final class UpgradeAE$$anonfun$getComponent$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Object nonLocalReturnKey1$1; public UpgradeAE$$anonfun$getComponent$1(UpgradeAE $outer, Object nonLocalReturnKey1$1) {} public final void apply(ItemStack i) { // Byte code:
/*     */       //   0: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */       //   7: astore_2
/*     */       //   8: aload_2
/*     */       //   9: instanceof scala/Some
/*     */       //   12: ifeq -> 43
/*     */       //   15: aload_2
/*     */       //   16: checkcast scala/Some
/*     */       //   19: astore_3
/*     */       //   20: aload_3
/*     */       //   21: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   24: instanceof li/cil/oc/integration/appeng/ItemUpgradeAE
/*     */       //   27: ifeq -> 43
/*     */       //   30: new scala/runtime/NonLocalReturnControl
/*     */       //   33: dup
/*     */       //   34: aload_0
/*     */       //   35: getfield nonLocalReturnKey1$1 : Ljava/lang/Object;
/*     */       //   38: aload_1
/*     */       //   39: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   42: athrow
/*     */       //   43: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   46: astore #4
/*     */       //   48: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #55	-> 0
/*     */       //   #56	-> 8
/*     */       //   #55	-> 20
/*     */       //   #56	-> 21
/*     */       //   #57	-> 43
/*     */       //   #55	-> 48
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	49	0	this	Lli/cil/oc/integration/appeng/UpgradeAE$$anonfun$getComponent$1;
/*     */       //   0	49	1	i	Lnet/minecraft/item/ItemStack; } }
/*  65 */   public IGridHost getSecurity() { if ((host().world()).field_72995_K) { null; return null; }
/*  66 */      ItemStack component = getComponent();
/*  67 */     IGridHost sec = (IGridHost)AEApi.instance().registries().locatable()
/*  68 */       .getLocatableBy(getAEKey(component));
/*     */     
/*  70 */     return checkRange(component, sec) ? 
/*  71 */       sec : 
/*     */       
/*  73 */       null; }
/*     */   
/*  75 */   public boolean checkRange(ItemStack stack, IGridHost sec) { Object object = new Object(); 
/*  76 */     try { IGridBlock gridBlock; DimensionalCoord loc; IGridBlock iGridBlock1; DimensionalCoord dimensionalCoord1; if (sec == null) return false; 
/*  77 */       IGridNode gridNode = sec.getGridNode(ForgeDirection.UNKNOWN);
/*  78 */       if (gridNode == null) return false; 
/*  79 */       IGrid grid = gridNode.getGrid();
/*  80 */       if (grid == null) return false; 
/*  81 */       int i = stack.func_77960_j(); switch (i)
/*     */       
/*     */       { 
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
/*     */         default:
/* 115 */           iGridBlock1 = gridNode.getGridBlock();
/* 116 */           if (iGridBlock1 == null) return false; 
/* 117 */           dimensionalCoord1 = iGridBlock1.getLocation();
/* 118 */           if (dimensionalCoord1 == null) return false;
/*     */           
/* 120 */           JavaConversions$.MODULE$.iterableAsScalaIterable((Iterable)grid.getMachines(
/* 121 */                 (Class)AEApi.instance().definitions().blocks().wireless().maybeEntity().get())).foreach((Function1)new UpgradeAE$$anonfun$checkRange$2(this, object));case 1: gridBlock = gridNode.getGridBlock(); if (gridBlock == null) return false;  loc = gridBlock.getLocation(); if (loc == null) return false;  JavaConversions$.MODULE$.iterableAsScalaIterable((Iterable)grid.getMachines((Class)AEApi.instance().definitions().blocks().wireless().maybeEntity().get())).foreach((Function1)new UpgradeAE$$anonfun$checkRange$1(this, object));case 0: break; }  } catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object)
/*     */         return nonLocalReturnControl.value$mcZ$sp();  }  return grid.getMachines((Class)AEApi.instance().definitions().blocks().wireless().maybeEntity().get()).iterator().hasNext(); } public final class UpgradeAE$$anonfun$checkRange$1 extends AbstractFunction1<IGridNode, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Object nonLocalReturnKey2$1; public UpgradeAE$$anonfun$checkRange$1(UpgradeAE $outer, Object nonLocalReturnKey2$1) {} public final void apply(IGridNode node) { IWirelessAccessPoint accessPoint = (IWirelessAccessPoint)node.getMachine(); WorldCoord distance = accessPoint.getLocation().subtract((int)this.$outer.agent().xPosition(), (int)this.$outer.agent().yPosition(), (int)this.$outer.agent().zPosition()); int squaredDistance = distance.x * distance.x + distance.y * distance.y + distance.z * distance.z; double range = accessPoint.getRange(); if (squaredDistance <= range * range)
/*     */         throw new NonLocalReturnControl.mcZ.sp(this.nonLocalReturnKey2$1, true);  } } public final class UpgradeAE$$anonfun$checkRange$2 extends AbstractFunction1<IGridNode, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Object nonLocalReturnKey2$1; public UpgradeAE$$anonfun$checkRange$2(UpgradeAE $outer, Object nonLocalReturnKey2$1) {}
/* 125 */     public final void apply(IGridNode node) { IWirelessAccessPoint accessPoint = 
/* 126 */         (IWirelessAccessPoint)node.getMachine();
/* 127 */       WorldCoord distance = accessPoint.getLocation().subtract(
/* 128 */           (int)this.$outer.agent().xPosition(), 
/* 129 */           (int)this.$outer.agent().yPosition(), 
/* 130 */           (int)this.$outer.agent().zPosition());
/*     */ 
/*     */       
/* 133 */       int squaredDistance = distance.x * distance.x + distance.y * distance.y + distance.z * distance.z;
/* 134 */       double range = accessPoint.getRange() / 2;
/* 135 */       if (squaredDistance <= range * range) throw new NonLocalReturnControl.mcZ.sp(this.nonLocalReturnKey2$1, true);
/*     */        }
/*     */      }
/*     */ 
/*     */ 
/*     */   
/*     */   public IGrid getGrid() {
/* 142 */     if ((host().world()).field_72995_K) { null; return null; }
/* 143 */      IGridHost securityTerminal = getSecurity();
/* 144 */     if (securityTerminal == null) { null; return null; }
/* 145 */      IGridNode gridNode = 
/* 146 */       securityTerminal.getGridNode(ForgeDirection.UNKNOWN);
/* 147 */     if (gridNode == null) { null; return null; }
/* 148 */      return gridNode.getGrid();
/*     */   }
/*     */   
/*     */   public long getAEKey(ItemStack stack) {
/*     */     try {
/* 153 */       return (new StringOps(Predef$.MODULE$.augmentString(WirelessHandlerUpgradeAE$.MODULE$.instance().getEncryptionKey(stack)))).toLong();
/*     */     } finally {
/*     */       null;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public TileSecurity tile() {
/* 161 */     IGridHost sec = getSecurity();
/* 162 */     if (sec == null)
/* 163 */       throw new SecurityException("No Security Station"); 
/* 164 */     IGridNode node = sec.getGridNode(ForgeDirection.UNKNOWN);
/* 165 */     if (node == null) throw new SecurityException("No Security Station"); 
/* 166 */     IGridBlock gridBlock = node.getGridBlock();
/* 167 */     if (gridBlock == null) throw new SecurityException("No Security Station"); 
/* 168 */     DimensionalCoord coord = gridBlock.getLocation();
/* 169 */     if (coord == null) throw new SecurityException("No Security Station"); 
/* 170 */     TileSecurity tileSecurity = (TileSecurity)coord.getWorld()
/* 171 */       .func_147438_o(coord.x, coord.y, coord.z);
/*     */     
/* 173 */     if (tileSecurity == null) throw new SecurityException("No Security Station"); 
/* 174 */     return tileSecurity;
/*     */   }
/*     */   
/*     */   public IMEMonitor<IAEFluidStack> getFluidInventory() {
/* 178 */     IGrid grid = getGrid();
/* 179 */     if (grid == null) { null; return null; }
/* 180 */      IStorageGrid storage = (IStorageGrid)grid.getCache(IStorageGrid.class);
/* 181 */     if (storage == null) { null; return null; }
/* 182 */      return storage.getFluidInventory();
/*     */   }
/*     */   
/*     */   public IMEMonitor<IAEItemStack> getItemInventory() {
/* 186 */     IGrid grid = getGrid();
/* 187 */     if (grid == null) { null; return null; }
/* 188 */      IStorageGrid storage = (IStorageGrid)grid.getCache(IStorageGrid.class);
/* 189 */     if (storage == null) { null; return null; }
/* 190 */      return storage.getItemInventory();
/*     */   }
/*     */   
/*     */   @Callback(doc = "function([number:amount]):number -- Transfer selected items to your ae system.")
/*     */   public Object[] sendItems(Context context, Arguments args) {
/* 195 */     int selected = agent().selectedSlot();
/* 196 */     IInventory invRobot = agent().mainInventory();
/* 197 */     if (invRobot.func_70302_i_() <= 0) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 198 */     ItemStack stack = invRobot.func_70301_a(selected);
/* 199 */     IMEMonitor<IAEItemStack> inv = getItemInventory();
/* 200 */     if (stack == null || inv == null) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 201 */     int amount = Math.min(args.optInteger(0, 64), stack.field_77994_a);
/* 202 */     ItemStack stack2 = stack.func_77946_l();
/* 203 */     stack2.field_77994_a = amount;
/* 204 */     IAEItemStack notInjected = (IAEItemStack)inv.injectItems(
/* 205 */         (IAEStack)AEApi.instance().storage().createItemStack(stack2), 
/* 206 */         Actionable.MODULATE, 
/* 207 */         (BaseActionSource)new MachineSource((IActionHost)tile()));
/*     */ 
/*     */     
/* 210 */     stack.field_77994_a -= amount;
/* 211 */     if (stack.field_77994_a <= 0) {
/* 212 */       invRobot.func_70299_a(selected, null);
/*     */     } else {
/* 214 */       invRobot.func_70299_a(selected, stack);
/* 215 */     }  (new Object[1])[0] = (new RichInt(Predef$.MODULE$.intWrapper(amount))).underlying();
/*     */     
/* 217 */     stack.field_77994_a = 
/* 218 */       stack.field_77994_a - amount + (int)notInjected.getStackSize();
/* 219 */     if (stack.field_77994_a <= 0) {
/* 220 */       invRobot.func_70299_a(selected, null);
/*     */     } else {
/* 222 */       invRobot.func_70299_a(selected, stack);
/* 223 */     }  (new Object[1])[0] = (new RichLong(Predef$.MODULE$.longWrapper(stack2.field_77994_a - notInjected.getStackSize()))).underlying(); return (notInjected == null) ? new Object[1] : new Object[1];
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(database:address, entry:number[, number:amount]):number -- Get items from your ae system.")
/*     */   public Object[] requestItems(Context context, Arguments args)
/*     */   {
/* 230 */     String address = args.checkString(0);
/* 231 */     int entry = args.checkInteger(1);
/* 232 */     int amount = args.optInteger(2, 64);
/* 233 */     int selected = agent().selectedSlot();
/* 234 */     IInventory invRobot = agent().mainInventory();
/* 235 */     if (invRobot.func_70302_i_() <= 0) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 236 */     IMEMonitor<IAEItemStack> inv = getItemInventory();
/* 237 */     if (inv == null) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 238 */     Node n = node().network().node(address);
/* 239 */     if (n == null) throw new IllegalArgumentException("no such component"); 
/* 240 */     if (n instanceof li.cil.oc.server.network.Component) {
/*     */       
/* 242 */       Environment env = n.host();
/* 243 */       if (env instanceof Database) {
/*     */         
/* 245 */         Database database = (Database)env;
/* 246 */         ItemStack sel = invRobot.func_70301_a(selected);
/* 247 */         int inSlot = 
/* 248 */           (sel == null) ? 
/* 249 */           0 : 
/*     */           
/* 251 */           sel.field_77994_a;
/* 252 */         int maxSize = 
/* 253 */           (sel == null) ? 
/* 254 */           64 : 
/*     */           
/* 256 */           sel.func_77976_d();
/* 257 */         ItemStack stack = database.getStackInSlot(entry - 1);
/* 258 */         if (stack == null) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 259 */         stack.field_77994_a = Math.min(amount, maxSize - inSlot);
/* 260 */         ItemStack stack2 = stack.func_77946_l();
/* 261 */         stack2.field_77994_a = 1;
/*     */ 
/*     */         
/* 264 */         ItemStack sel3 = sel.func_77946_l();
/* 265 */         sel3.field_77994_a = 1;
/*     */ 
/*     */         
/* 268 */         ItemStack sel2 = (sel == null) ? null : sel3;
/* 269 */         if (sel == null || ItemStack.func_77989_b(sel2, stack2)) {
/*     */           
/* 271 */           IAEItemStack extracted = (IAEItemStack)inv.extractItems(
/* 272 */               (IAEStack)AEApi.instance().storage().createItemStack(stack), 
/* 273 */               Actionable.MODULATE, 
/* 274 */               (BaseActionSource)new MachineSource((IActionHost)tile()));
/*     */           
/* 276 */           if (extracted == null) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 277 */           int ext = (int)extracted.getStackSize();
/* 278 */           stack.field_77994_a = inSlot + ext;
/* 279 */           invRobot.func_70299_a(selected, stack);
/* 280 */           return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(ext))).underlying() };
/*     */         }  return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() };
/*     */       } 
/*     */       throw new IllegalArgumentException("not a database");
/*     */     } 
/* 285 */     throw new IllegalArgumentException("no such component"); } @Callback(doc = "function([number:amount]):number -- Transfer selected fluid to your ae system.") public Object[] sendFluids(Context context, Arguments args) { int selected = agent().selectedTank();
/* 286 */     MultiTank tanks = agent().tank();
/* 287 */     if (tanks.tankCount() <= 0) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 288 */     IFluidTank tank = tanks.getFluidTank(selected);
/* 289 */     IMEMonitor<IAEFluidStack> inv = getFluidInventory();
/* 290 */     if (tank == null || inv == null || tank.getFluid() == null)
/* 291 */       return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 292 */     int amount = 
/* 293 */       Math.min(args.optInteger(0, tank.getCapacity()), tank.getFluidAmount());
/* 294 */     FluidStack fluid = tank.getFluid();
/* 295 */     FluidStack fluid2 = fluid.copy();
/* 296 */     fluid2.amount = amount;
/* 297 */     IAEFluidStack notInjected = (IAEFluidStack)inv.injectItems(
/* 298 */         (IAEStack)AEApi.instance().storage().createFluidStack(fluid2), 
/* 299 */         Actionable.MODULATE, 
/* 300 */         (BaseActionSource)new MachineSource((IActionHost)tile()));
/*     */ 
/*     */     
/* 303 */     tank.drain(amount, true);
/* 304 */     (new Object[1])[0] = (new RichInt(Predef$.MODULE$.intWrapper(amount))).underlying();
/*     */     
/* 306 */     tank.drain(amount - (int)notInjected.getStackSize(), true);
/* 307 */     (new Object[1])[0] = (new RichLong(Predef$.MODULE$.longWrapper(amount - notInjected.getStackSize()))).underlying(); return (notInjected == null) ? new Object[1] : new Object[1]; }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(database:address, entry:number[, number:amount]):number -- Get fluid from your ae system.")
/*     */   public Object[] requestFluids(Context context, Arguments args)
/*     */   {
/* 313 */     String address = args.checkString(0);
/* 314 */     int entry = args.checkInteger(1);
/* 315 */     int amount = args.optInteger(2, 1000);
/* 316 */     MultiTank tanks = agent().tank();
/* 317 */     int selected = agent().selectedTank();
/* 318 */     if (tanks.tankCount() <= 0) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 319 */     IFluidTank tank = tanks.getFluidTank(selected);
/* 320 */     IMEMonitor<IAEFluidStack> inv = getFluidInventory();
/* 321 */     if (tank == null || inv == null) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 322 */     Node n = node().network().node(address);
/* 323 */     if (n == null) throw new IllegalArgumentException("no such component"); 
/* 324 */     if (n instanceof li.cil.oc.server.network.Component) {
/*     */       
/* 326 */       Environment env = n.host();
/* 327 */       if (env instanceof Database) {
/*     */         
/* 329 */         Database database = (Database)env;
/* 330 */         FluidStack fluid = FluidContainerRegistry.getFluidForFilledItem(
/* 331 */             database.getStackInSlot(entry - 1));
/*     */         
/* 333 */         fluid.amount = amount;
/* 334 */         FluidStack fluid2 = fluid.copy();
/* 335 */         fluid2.amount = tank.fill(fluid, false);
/* 336 */         if (fluid2.amount == 0) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 337 */         IAEFluidStack extracted = (IAEFluidStack)inv.extractItems(
/* 338 */             (IAEStack)AEApi.instance().storage().createFluidStack(fluid2), 
/* 339 */             Actionable.MODULATE, 
/* 340 */             (BaseActionSource)new MachineSource((IActionHost)tile()));
/*     */         
/* 342 */         if (extracted == null) return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(0))).underlying() }; 
/* 343 */         return new Object[] { (new RichInt(Predef$.MODULE$.intWrapper(tank.fill(extracted.getFluidStack(), true)))).underlying() };
/*     */       } 
/*     */       throw new IllegalArgumentException("not a database");
/*     */     } 
/*     */     throw new IllegalArgumentException("no such component"); } @Callback(doc = "function():boolean -- Return true if the card is linked to your ae network.")
/*     */   public Object[] isLinked(Context context, Arguments args) {
/* 349 */     boolean isLinked = !(getGrid() == null);
/* 350 */     return new Object[] { Predef$.MODULE$.boolean2Boolean(isLinked) };
/*     */   }
/*     */   
/*     */   public void update() {
/* 354 */     super.update();
/* 355 */     if (host().world().func_82737_E() % 10L == 0L && isActive() && 
/* 356 */       !node().tryChangeBuffer(-getEnergy())) {
/* 357 */       isActive_$eq(false);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private double getEnergy() {
/* 363 */     ItemStack c = getComponent();
/*     */ 
/*     */ 
/*     */     
/* 367 */     int i = c.func_77960_j(); switch (i) { default: case 1: 
/* 368 */       case 0: break; }  return (c == null) ? 0.0D : 0.6D;
/*     */   }
/*     */   
/*     */   public void onMessage(Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokespecial onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   5: aload_1
/*     */     //   6: invokeinterface name : ()Ljava/lang/String;
/*     */     //   11: ldc_w 'computer.stopped'
/*     */     //   14: astore_2
/*     */     //   15: dup
/*     */     //   16: ifnonnull -> 27
/*     */     //   19: pop
/*     */     //   20: aload_2
/*     */     //   21: ifnull -> 34
/*     */     //   24: goto -> 42
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 42
/*     */     //   34: aload_0
/*     */     //   35: iconst_0
/*     */     //   36: invokevirtual isActive_$eq : (Z)V
/*     */     //   39: goto -> 76
/*     */     //   42: aload_1
/*     */     //   43: invokeinterface name : ()Ljava/lang/String;
/*     */     //   48: ldc_w 'computer.started'
/*     */     //   51: astore_3
/*     */     //   52: dup
/*     */     //   53: ifnonnull -> 64
/*     */     //   56: pop
/*     */     //   57: aload_3
/*     */     //   58: ifnull -> 71
/*     */     //   61: goto -> 76
/*     */     //   64: aload_3
/*     */     //   65: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   68: ifeq -> 76
/*     */     //   71: aload_0
/*     */     //   72: iconst_1
/*     */     //   73: invokevirtual isActive_$eq : (Z)V
/*     */     //   76: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #375	-> 0
/*     */     //   #376	-> 5
/*     */     //   #377	-> 34
/*     */     //   #378	-> 42
/*     */     //   #379	-> 71
/*     */     //   #374	-> 76
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	77	0	this	Lli/cil/oc/integration/appeng/UpgradeAE;
/*     */     //   0	77	1	message	Lli/cil/oc/api/network/Message;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\UpgradeAE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */