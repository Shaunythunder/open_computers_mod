/*     */ package li.cil.oc.integration.appeng;
/*     */ 
/*     */ import appeng.api.parts.IPart;
/*     */ import appeng.api.parts.IPartHost;
/*     */ import appeng.api.storage.data.IAEItemStack;
/*     */ import appeng.parts.automation.PartExportBus;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BooleanRef;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005%v!B\001\003\021\003i\021a\004#sSZ,'/\022=q_J$()^:\013\005\r!\021AB1qa\026twM\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\020\tJLg/\032:FqB|'\017\036\"vgN\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"a\007\021\016\003qQ!!\b\020\002\r\021\024\030N^3s\025\tyb!A\002ba&L!!\t\017\003\025MKG-\0323CY>\0347\016C\003$\037\021\005A%\001\004=S:LGO\020\013\002\033!)ae\004C!O\005Iqo\034:lg^KG\017\033\013\007Q9Jd\b\021\"\021\005%bS\"\001\026\013\003-\nQa]2bY\006L!!\f\026\003\017\t{w\016\\3b]\")q&\na\001a\005)qo\034:mIB\021\021gN\007\002e)\021qf\r\006\003iU\n\021\"\\5oK\016\024\030M\032;\013\003Y\n1A\\3u\023\tA$GA\003X_JdG\rC\003;K\001\0071(A\001y!\tIC(\003\002>U\t\031\021J\034;\t\013}*\003\031A\036\002\003eDQ!Q\023A\002m\n\021A\037\005\006\007\026\002\r\001R\001\005g&$W\r\005\002F\0316\taI\003\002H\021\006!Q\017^5m\025\tI%*\001\004d_6lwN\034\006\003\027V\na\"\\5oK\016\024\030M\032;g_J<W-\003\002N\r\nqai\034:hK\022K'/Z2uS>t\007\"B(\020\t\003\002\026!E2sK\006$X-\0228wSJ|g.\\3oiRY\021+!\024\002P\005E\0231KA+!\t\0216+D\001\020\r\021!vBA+\003\027\025sg/\033:p]6,g\016^\n\005'Z\023W\rE\002X1jk\021\001B\005\0033\022\021A$T1oC\036,G\rV5mK\026sG/\033;z\013:4\030N]8o[\026tG\017\005\002\\A6\tAL\003\002^=\006)\001/\031:ug*\021qd\030\006\002\007%\021\021\r\030\002\n\023B\013'\017\036%pgR\004\"aG2\n\005\021d\"A\003(b[\026$'\t\\8dWB\021aBZ\005\003O\n\0211\003U1si\026sg/\033:p]6,g\016\036\"bg\026D\001\"[*\003\006\004%\tA[\001\005Q>\034H/F\001[\021!a7K!A!\002\023Q\026!\0025pgR\004\003\"B\022T\t\003qGCA)p\021\025IW\0161\001[\021\025\t8\013\"\021s\0035\001(/\0324feJ,GMT1nKR\t1\017\005\002\024i&\021Q\017\006\002\007'R\024\030N\\4\t\013]\034F\021\t=\002\021A\024\030n\034:jif$\022a\017\005\006uN#\ta_\001\027O\026$X\t\0379peR\034uN\0344jOV\024\030\r^5p]R)A0!\002\002\026A\031\021&`@\n\005yT#!B!se\006L\bcA\025\002\002%\031\0211\001\026\003\r\005s\027PU3g\021\035\t9!\037a\001\003\023\tqaY8oi\026DH\017\005\003\002\f\005EQBAA\007\025\r\tyAH\001\b[\006\034\007.\0338f\023\021\t\031\"!\004\003\017\r{g\016^3yi\"9\021qC=A\002\005e\021\001B1sON\004B!a\003\002\034%!\021QDA\007\005%\t%oZ;nK:$8\017K\004z\003C\t9#!\013\021\t\005-\0211E\005\005\003K\tiA\001\005DC2d'-Y2l\003\r!wnY\021\003\003W\tQPZ;oGRLwN\034\025tS\022,'H\\;nE\026\024H\006I.!g2|GO\0178v[\n,'/X\025;E>|G.Z1oA5j\003eR3uAQDW\rI2p]\032Lw-\036:bi&|g\016I8gAQDW\rI3ya>\024H\017\t2vg\002\002x.\0338uS:<\007%\0338!i\",\007e\0359fG&4\027.\0323!I&\024Xm\031;j_:t\003bBA\030'\022\005\021\021G\001\027g\026$X\t\0379peR\034uN\0344jOV\024\030\r^5p]R)A0a\r\0026!A\021qAA\027\001\004\tI\001\003\005\002\030\0055\002\031AA\rQ!\ti#!\t\002(\005e\022EAA\036\003\0055e-\0368di&|g\016K:jI\026Td.^7cKJ\\F\006I:m_RTd.^7cKJl6\f\f\021eCR\f'-Y:fu\005$GM]3tg2\002SM\034;ssjrW/\0342fe&R$m\\8mK\006t\007%L\027!\007>tg-[4ve\026\004C\017[3!Kb\004xN\035;!EV\034\b\005]8j]RLgn\032\021j]\002\"\b.\032\021ta\026\034\027NZ5fI\002\"\027N]3di&|g\016\t;pA\025D\bo\034:uA%$X-\034\021ti\006\0347n\035\021nCR\034\007.\0338hAQDW\rI:qK\016Lg-[3eA\021,7o\031:jaR|'O\f\005\b\003\031F\021AA!\0039)\007\020]8si&sGo\\*m_R$R\001`A\"\003\013B\001\"a\002\002>\001\007\021\021\002\005\t\003/\ti\0041\001\002\032!B\021QHA\021\003O\tI%\t\002\002L\005\t9DZ;oGRLwN\034\025tS\022,'H\\;nE\026\024H\006I:m_RTd.^7cKJL#HY8pY\026\fg\016I\027.A5\0137.\032\021uQ\026\004S\r\0379peR\004#-^:!M\006\034\027N\\4!i\",\007e\0359fG&4\027.\0323!I&\024Xm\031;j_:\004\003/\032:g_Jl\007%\031\021tS:<G.\032\021fqB|'\017\036\021pa\026\024\030\r^5p]\002Jg\016^8!i\",\007e\0359fG&4\027.\0323!g2|GO\f\005\006_9\003\r\001\r\005\006u9\003\ra\017\005\0069\003\ra\017\005\006\003:\003\ra\017\005\006\007:\003\r\001R\004\b\0033z\001\022AA.\003!\001&o\034<jI\026\024\bc\001*\002^\0319\021qL\b\t\002\005\005$\001\003)s_ZLG-\032:\024\013\005u##a\031\021\007m\t)'C\002\002hq\0211#\0228wSJ|g.\\3oiB\023xN^5eKJDqaIA/\t\003\tY\007\006\002\002\\!A\021qNA/\t\003\n\t(\001\bhKR,eN^5s_:lWM\034;\025\t\005M\024\021\024\031\005\003k\n9\t\005\004\002x\005u\0241\021\b\004S\005e\024bAA>U\0051\001K]3eK\032LA!a \002\002\n)1\t\\1tg*\031\0211\020\026\021\t\005\025\025q\021\007\001\t1\tI)!\034\002\002\003\005)\021AAF\005\ryFEM\t\005\003\033\013\031\nE\002*\003\037K1!!%+\005\035qu\016\0365j]\036\0042!KAK\023\r\t9J\013\002\004\003:L\b\002CAN\003[\002\r!!(\002\013M$\030mY6\021\t\005}\025QU\007\003\003CS1!a)4\003\021IG/Z7\n\t\005\035\026\021\025\002\n\023R,Wn\025;bG.\004")
/*     */ public final class DriverExportBus {
/*     */   public static Environment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*     */     return DriverExportBus$.MODULE$.createEnvironment(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*     */   }
/*     */   
/*     */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection) {
/*     */     return DriverExportBus$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramForgeDirection);
/*     */   }
/*     */   
/*     */   public final class DriverExportBus$$anonfun$worksWith$3 extends AbstractFunction1<IPart, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*  31 */     public final boolean apply(IPart x$1) { return x$1 instanceof PartExportBus; } } public final class DriverExportBus$$anonfun$worksWith$2 extends AbstractFunction1<IPart, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IPart obj) { return !(obj == null); } } public final class DriverExportBus$$anonfun$worksWith$1 extends AbstractFunction1<ForgeDirection, IPart> implements Serializable { public static final long serialVersionUID = 0L; private final TileEntity x2$1; public final IPart apply(ForgeDirection x$1) { return ((IPartHost)this.x2$1).getPart(x$1); }
/*     */     
/*     */     public DriverExportBus$$anonfun$worksWith$1(TileEntity x2$1) {} }
/*     */   
/*     */   public static final class Environment extends ManagedTileEntityEnvironment<IPartHost> implements NamedBlock, PartEnvironmentBase { private final IPartHost host;
/*     */     
/*  37 */     public <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] getPartConfig(Context context, Arguments args, ClassTag evidence$1) { return PartEnvironmentBase$class.getPartConfig(this, context, args, evidence$1); } public <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] setPartConfig(Context context, Arguments args, ClassTag evidence$2) { return PartEnvironmentBase$class.setPartConfig(this, context, args, evidence$2); } public IPartHost host() { return this.host; } public Environment(IPartHost host) { super(host, "me_exportbus"); PartEnvironmentBase$class.$init$(this); } public String preferredName() {
/*  38 */       return "me_exportbus";
/*     */     } public int priority() {
/*  40 */       return 2;
/*     */     } @Callback(doc = "function(side:number, [ slot:number]):boolean -- Get the configuration of the export bus pointing in the specified direction.")
/*     */     public Object[] getExportConfiguration(Context context, Arguments args) {
/*  43 */       return getPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartExportBus.class));
/*     */     } @Callback(doc = "function(side:number[, slot:number][, database:address, entry:number):boolean -- Configure the export bus pointing in the specified direction to export item stacks matching the specified descriptor.")
/*     */     public Object[] setExportConfiguration(Context context, Arguments args) {
/*  46 */       return setPartConfig(context, args, scala.reflect.ClassTag$.MODULE$.apply(PartExportBus.class));
/*     */     }
/*     */     @Callback(doc = "function(side:number, slot:number):boolean -- Make the export bus facing the specified direction perform a single export operation into the specified slot.")
/*     */     public Object[] exportIntoSlot(Context context, Arguments args) { Object[] arrayOfObject;
/*  50 */       ForgeDirection side = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/*  51 */       IPart iPart = host().getPart(side);
/*  52 */       if (iPart instanceof PartExportBus) { Object[] arrayOfObject1; PartExportBus partExportBus = (PartExportBus)iPart;
/*  53 */         Option option = li.cil.oc.util.InventoryUtils$.MODULE$.inventoryAt(li.cil.oc.util.BlockPosition$.MODULE$.apply(host().getLocation()).offset(side));
/*  54 */         if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x();
/*  55 */           int targetSlot = li.cil.oc.util.ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot(inventory, 1);
/*  56 */           IInventory config = partExportBus.getInventoryByName("config");
/*  57 */           IMEMonitor itemStorage = partExportBus.getProxy().getStorage().getItemInventory();
/*  58 */           int i = partExportBus.getInstalledUpgrades(Upgrades.SPEED); switch (i) { default: case 4: case 3: case 2: case 1: break; }  IntRef count = IntRef.create(
/*  59 */               8);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  67 */           FuzzyMode fuzzyMode = (FuzzyMode)liftedTree1$1(partExportBus)
/*     */             
/*  69 */             .invoke(partExportBus.getConfigManager(), new Object[] { Settings.FUZZY_MODE });
/*  70 */           MachineSource source = new MachineSource((IActionHost)partExportBus);
/*  71 */           BooleanRef didSomething = BooleanRef.create(false); scala.runtime.RichInt$.MODULE$
/*  72 */             .until$extension0(scala.Predef$.MODULE$.intWrapper(0), config.func_70302_i_()).withFilter((Function1)new DriverExportBus$Environment$$anonfun$exportIntoSlot$1(this, count)).foreach((Function1)new DriverExportBus$Environment$$anonfun$exportIntoSlot$2(this, side, inventory, targetSlot, config, itemStorage, count, fuzzyMode, source, didSomething, partExportBus));
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
/*  98 */           didSomething.elem ? 
/*  99 */             BoxesRunTime.boxToBoolean(context.pause(0.25D)) : BoxedUnit.UNIT;
/*     */           
/* 101 */           arrayOfObject1 = li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(didSomething.elem) })); }
/* 102 */         else { arrayOfObject1 = li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no inventory" })); }
/*     */          arrayOfObject = arrayOfObject1; }
/* 104 */       else { arrayOfObject = li.cil.oc.util.ResultWrapper$.MODULE$.result((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { scala.Unit$.MODULE$, "no export bus" })); }  return arrayOfObject; } private final Method liftedTree1$1(PartExportBus x2$2) { try {  } catch (NoSuchMethodException noSuchMethodException) {} return x2$2.getConfigManager().getClass().getMethod("getSetting", new Class[] { Settings.class }); } public final class DriverExportBus$Environment$$anonfun$exportIntoSlot$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final IntRef count$1; public final boolean apply(int slot) { return apply$mcZI$sp(slot); } public boolean apply$mcZI$sp(int slot) { return (this.count$1.elem > 0); } public DriverExportBus$Environment$$anonfun$exportIntoSlot$1(DriverExportBus.Environment $outer, IntRef count$1) {} } public final class DriverExportBus$Environment$$anonfun$exportIntoSlot$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final ForgeDirection side$1; public final IInventory inventory$1; public final int targetSlot$1; private final IInventory config$1; public final IMEMonitor itemStorage$1; public final IntRef count$1; private final FuzzyMode fuzzyMode$1; public final MachineSource source$1; public final BooleanRef didSomething$1; public final PartExportBus x2$2; public final void apply(int slot) { apply$mcVI$sp(slot); } public DriverExportBus$Environment$$anonfun$exportIntoSlot$2(DriverExportBus.Environment $outer, ForgeDirection side$1, IInventory inventory$1, int targetSlot$1, IInventory config$1, IMEMonitor itemStorage$1, IntRef count$1, FuzzyMode fuzzyMode$1, MachineSource source$1, BooleanRef didSomething$1, PartExportBus x2$2) {} public void apply$mcVI$sp(int slot) { IAEItemStack filter = AEApi.instance().storage().createItemStack(this.config$1.func_70301_a(slot)); (new IAEItemStack[1])[0] = (IAEItemStack)this.itemStorage$1.getStorageList().findPrecise((IAEStack)filter); Seq stacks = (this.x2$2.getInstalledUpgrades(Upgrades.FUZZY) > 0) ? scala.collection.convert.WrapAsScala$.MODULE$.collectionAsScalaIterable(this.itemStorage$1.getStorageList().findFuzzy((IAEStack)filter, this.fuzzyMode$1)).toSeq() : (Seq)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new IAEItemStack[1])); ((TraversableLike)((TraversableLike)stacks.filter((Function1)new DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$1(this))).map((Function1)new DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$2(this), scala.collection.Seq$.MODULE$.canBuildFrom())).withFilter((Function1)new DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$3(this)).foreach((Function1)new DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$4(this)); } public final class DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<IAEItemStack, Object> implements Serializable {
/*     */         public static final long serialVersionUID = 0L; public final boolean apply(IAEItemStack x$2) { return !(x$2 == null); } public DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$1(DriverExportBus$Environment$$anonfun$exportIntoSlot$2 $outer) {} } public final class DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1<IAEItemStack, IAEItemStack> implements Serializable {
/*     */         public static final long serialVersionUID = 0L; public final IAEItemStack apply(IAEItemStack x$3) { return x$3.copy(); } public DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$2(DriverExportBus$Environment$$anonfun$exportIntoSlot$2 $outer) {} } public final class DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1<IAEItemStack, Object> implements Serializable {
/*     */         public static final long serialVersionUID = 0L; public final boolean apply(IAEItemStack ais) { return (this.$outer.count$1.elem > 0); } public DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$3(DriverExportBus$Environment$$anonfun$exportIntoSlot$2 $outer) {} } public final class DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1<IAEItemStack, Object> implements Serializable {
/* 109 */         public static final long serialVersionUID = 0L; public DriverExportBus$Environment$$anonfun$exportIntoSlot$2$$anonfun$apply$mcVI$sp$4(DriverExportBus$Environment$$anonfun$exportIntoSlot$2 $outer) {} public final Object apply(IAEItemStack ais) { ItemStack is = ais.getItemStack(); is.field_77994_a = this.$outer.count$1.elem; ais.setStackSize((this.$outer.count$1.elem - is.field_77994_a)); IAEItemStack eais = AEApi.instance().storage().poweredExtraction((IEnergySource)this.$outer.x2$2.getProxy().getEnergy(), (IMEInventory)this.$outer.itemStorage$1, ais, (BaseActionSource)this.$outer.source$1); ItemStack eis = eais.getItemStack(); this.$outer.count$1.elem -= eis.field_77994_a; this.$outer.didSomething$1.elem = true; li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventorySlot(eis, this.$outer.inventory$1, scala.Option$.MODULE$.apply(this.$outer.side$1.getOpposite()), this.$outer.targetSlot$1, li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventorySlot$default$5(), li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventorySlot$default$6()); eais.setStackSize(eis.field_77994_a); return li.cil.oc.util.InventoryUtils$.MODULE$.insertIntoInventorySlot(is, this.$outer.inventory$1, scala.Option$.MODULE$.apply(this.$outer.side$1.getOpposite()), this.$outer.targetSlot$1, this.$outer.count$1.elem, true) ? ((eais == null) ? BoxedUnit.UNIT : ((eis.field_77994_a > 0) ? this.$outer.itemStorage$1.injectItems((IAEStack)ais, Actionable.MODULATE, (BaseActionSource)this.$outer.source$1) : BoxedUnit.UNIT)) : BoxedUnit.UNIT; } } } } public static class Provider$ implements EnvironmentProvider { public Provider$() { MODULE$ = this; }
/*     */      public static final Provider$ MODULE$; public Class<?> getEnvironment(ItemStack stack) {
/* 111 */       return AEUtil$.MODULE$.isExportBus(stack) ? 
/* 112 */         DriverExportBus.Environment.class : 
/* 113 */         null;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverExportBus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */