/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import java.util.UUID;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.server.component.traits.WorldAware;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagString;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-e\001B\001\003\0015\021A\"\0269he\006$W\rT3bg\"T!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\t\001qa\003\b\t\003\037Qi\021\001\005\006\003#I\ta\001\035:fM\006\024'BA\n\007\003\r\t\007/[\005\003+A\021!#T1oC\036,G-\0228wSJ|g.\\3oiB\021qCG\007\0021)\021\021DA\001\007iJ\f\027\016^:\n\005mA\"AC,pe2$\027i^1sKB\021Q\004I\007\002=)\021qDE\001\007IJLg/\032:\n\005\005r\"A\003#fm&\034W-\0238g_\"A1\005\001BC\002\023\005A%\001\003i_N$X#A\023\021\005\031jS\"A\024\013\005!J\023AB3oi&$\030P\003\002+W\005IQ.\0338fGJ\fg\r\036\006\002Y\005\031a.\032;\n\0059:#AB#oi&$\030\020\003\0051\001\t\005\t\025!\003&\003\025Awn\035;!\021\025\021\004\001\"\0014\003\031a\024N\\5u}Q\021AG\016\t\003k\001i\021A\001\005\006GE\002\r!\n\005\bq\001\021\r\021\"\021:\003\021qw\016Z3\026\003i\002\"a\017 \016\003qR!!\020\n\002\0179,Go^8sW&\021q\b\020\002\n\007>l\007o\0348f]RDa!\021\001!\002\023Q\024!\0028pI\026\004\003bB\"\001\005\004%)\001R\001\023\033\006DH*Z1tQ\026$WI\034;ji&,7/F\001F\037\0051U$\001\005\t\r!\003\001\025!\004F\003Mi\025\r\037'fCNDW\rZ#oi&$\030.Z:!\021!Q\005\001#b\001\n\033Y\025A\0033fm&\034W-\0238g_V\tA\n\005\003N)Z3V\"\001(\013\005=\003\026!C5n[V$\030M\0317f\025\t\t&+\001\006d_2dWm\031;j_:T\021aU\001\006g\016\fG.Y\005\003+:\0231!T1q!\t9F,D\001Y\025\tI&,\001\003mC:<'\"A.\002\t)\fg/Y\005\003;b\023aa\025;sS:<\007\002C0\001\021\003\005\013U\002'\002\027\021,g/[2f\023:4w\016\t\005\006C\002!\tEY\001\016O\026$H)\032<jG\026LeNZ8\025\003\r\004B\001Z4iQ6\tQM\003\002g5\006!Q\017^5m\023\t)V\r\005\002j[:\021!n[\007\002%&\021ANU\001\007!J,G-\0324\n\005us'B\0017S\021\035\001\bA1A\005\002E\fq\002\\3bg\",G-\0228uSRLWm]\013\002eB\0311O\036=\016\003QT!!\036)\002\0175,H/\0312mK&\021q\017\036\002\004'\026$\bC\0013z\023\tQXM\001\003V+&#\005B\002?\001A\003%!/\001\tmK\006\034\b.\0323F]RLG/[3tA!)a\020\001C!\006A\001o\\:ji&|g.\006\002\002\002A!\0211AA\004\033\t\t)A\003\002g\r%!\021\021BA\003\0055\021En\\2l!>\034\030\016^5p]\"9\021Q\002\001\005\002\005=\021!\0027fCNDGCBA\t\003;\ti\003E\003k\003'\t9\"C\002\002\026I\023Q!\021:sCf\0042A[A\r\023\r\tYB\025\002\007\003:L(+\0324\t\021\005}\0211\002a\001\003C\tqaY8oi\026DH\017\005\003\002$\005%RBAA\023\025\r\t9CE\001\b[\006\034\007.\0338f\023\021\tY#!\n\003\017\r{g\016^3yi\"A\021qFA\006\001\004\t\t$\001\003be\036\034\b\003BA\022\003gIA!!\016\002&\tI\021I]4v[\026tGo\035\025\t\003\027\tI$a\020\002BA!\0211EA\036\023\021\ti$!\n\003\021\r\013G\016\0342bG.\f1\001Z8dC\t\t\031%A5gk:\034G/[8oQMLG-\032\036ok6\024WM]\025;E>|G.Z1oA5j\003\005\026:jKN\004Co\034\021qkR\004\023M\034\021f]RLG/\037\021p]\002\"\b.\032\021ta\026\034\027NZ5fI\002\032\030\016Z3!_\032\004C\017[3!I\0264\030nY3!_:$x\016I1!Y\026\f7\017\033\030\t\017\005\035\003\001\"\001\002J\0059QO\0347fCNDGCBA\t\003\027\ni\005\003\005\002 \005\025\003\031AA\021\021!\ty#!\022A\002\005E\002\006CA#\003s\ty$!\025\"\005\005M\023a\0164v]\016$\030n\0348)S\001jS\006I+oY\026\f7\017[3tA\005dG\016I2veJ,g\016\0367zA1,\027m\0355fI\002*g\016^5uS\026\034h\006C\004\002X\001!\t%!\027\002\031=tG)[:d_:tWm\031;\025\t\005m\023\021\r\t\004U\006u\023bAA0%\n!QK\\5u\021\035A\024Q\013a\001\003G\0022aOA3\023\r\t9\007\020\002\005\035>$W\rC\004\002l\001!I!!\034\002\025UtG.Z1tQ\006cG\016\006\002\002\\!9\021\021\017\001\005B\005M\024\001\0027pC\022$B!a\027\002v!A\021qOA8\001\004\tI(A\002oER\004B!a\037\002\0005\021\021Q\020\006\004\003oJ\023\002BAA\003{\022aB\024\"U)\006<7i\\7q_VtG\rC\004\002\006\002!\t%a\"\002\tM\fg/\032\013\005\0037\nI\t\003\005\002x\005\r\005\031AA=\001")
/*     */ public class UpgradeLeash extends ManagedEnvironment implements WorldAware, DeviceInfo {
/*     */   private final Entity host;
/*     */   private final Component node;
/*     */   private final int MaxLeashedEntities;
/*     */   
/*  31 */   public World world() { return WorldAware.class.world(this); } private Map<String, String> deviceInfo; private final Set<UUID> leashedEntities; private volatile boolean bitmap$0; public EntityPlayer fakePlayer() { return WorldAware.class.fakePlayer(this); } public boolean mayInteract(BlockPosition blockPos, ForgeDirection face) { return WorldAware.class.mayInteract(this, blockPos, face); } public <Type extends Entity> Buffer<Type> entitiesInBounds(AxisAlignedBB bounds, ClassTag evidence$1) { return WorldAware.class.entitiesInBounds(this, bounds, evidence$1); } public <Type extends Entity> Buffer<Type> entitiesInBlock(BlockPosition blockPos, ClassTag evidence$2) { return WorldAware.class.entitiesInBlock(this, blockPos, evidence$2); } public <Type extends Entity> Buffer<Type> entitiesOnSide(ForgeDirection side, ClassTag evidence$3) { return WorldAware.class.entitiesOnSide(this, side, evidence$3); } public <Type extends Entity> Option<Type> closestEntity(ForgeDirection side, ClassTag evidence$4) { return WorldAware.class.closestEntity(this, side, evidence$4); } public Tuple2<Object, String> blockContent(ForgeDirection side) { return WorldAware.class.blockContent(this, side); } public Entity host() { return this.host; } public UpgradeLeash(Entity host) { WorldAware.class.$init$(this);
/*  32 */     this.node = (Component)Network.newNode((Environment)this, Visibility.Network)
/*  33 */       .withComponent("leash")
/*  34 */       .create();
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
/*  48 */     this.leashedEntities = Set$.MODULE$.empty(); } public Component node() { return this.node; } public final int MaxLeashedEntities() { return 8; } private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic"); (new Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Leash"); (new Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG"); (new Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "FlockControl (FC-3LS)"); (new Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToInteger(8).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[5])); this.bitmap$0 = true; }  return this.deviceInfo; }  } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); } public Set<UUID> leashedEntities() { return this.leashedEntities; }
/*     */    public BlockPosition position() {
/*  50 */     return BlockPosition$.MODULE$.apply(host());
/*     */   }
/*     */   @Callback(doc = "function(side:number):boolean -- Tries to put an entity on the specified side of the device onto a leash.")
/*     */   public Object[] leash(Context context, Arguments args) { Object[] arrayOfObject;
/*  54 */     if (leashedEntities().size() >= 8) return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "too many leashed entities" })); 
/*  55 */     ForgeDirection side = ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/*  56 */     AxisAlignedBB nearBounds = position().bounds();
/*  57 */     AxisAlignedBB farBounds = nearBounds.func_72317_d(side.offsetX * 2.0D, side.offsetY * 2.0D, side.offsetZ * 2.0D);
/*  58 */     AxisAlignedBB bounds = nearBounds.func_111270_a(farBounds);
/*  59 */     Option option = entitiesInBounds(bounds, ClassTag$.MODULE$.apply(EntityLiving.class)).find((Function1)new UpgradeLeash$$anonfun$1(this));
/*  60 */     if (option instanceof Some) { Some some = (Some)option; EntityLiving entity = (EntityLiving)some.x();
/*  61 */       entity.func_110162_b(host(), true);
/*  62 */       leashedEntities().$plus$eq(entity.func_110124_au());
/*  63 */       context.pause(0.1D);
/*  64 */       arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) })); }
/*  65 */     else { arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no unleashed entity" })); }
/*     */     
/*     */     return arrayOfObject; } public final class UpgradeLeash$$anonfun$1 extends AbstractFunction1<EntityLiving, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(EntityLiving x$1) { return x$1.func_110164_bC(); } public UpgradeLeash$$anonfun$1(UpgradeLeash $outer) {} }
/*     */   @Callback(doc = "function() -- Unleashes all currently leashed entities.")
/*     */   public Object[] unleash(Context context, Arguments args) {
/*  71 */     unleashAll();
/*  72 */     return null;
/*     */   }
/*     */   
/*     */   public void onDisconnect(Node node) {
/*  76 */     super.onDisconnect(node);
/*  77 */     Component component = node(); if (node == null) { if (component != null) return;  } else { if (node.equals(component))
/*  78 */       { unleashAll(); return; }  return; }  unleashAll();
/*     */   }
/*     */   
/*     */   private void unleashAll()
/*     */   {
/*  83 */     entitiesInBounds(position().bounds().func_72314_b(5.0D, 5.0D, 5.0D), ClassTag$.MODULE$.apply(EntityLiving.class)).foreach((Function1)new UpgradeLeash$$anonfun$unleashAll$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     leashedEntities().clear();
/*     */   } public final class UpgradeLeash$$anonfun$unleashAll$1 extends AbstractFunction1<EntityLiving, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public UpgradeLeash$$anonfun$unleashAll$1(UpgradeLeash $outer) {} public final void apply(EntityLiving entity) { if (this.$outer.leashedEntities().contains(entity.func_110124_au())) { Entity entity1 = this.$outer.host(); if (entity.func_110166_bE() == null) { entity.func_110166_bE(); if (entity1 != null)
/*     */             return;  } else { if (entity.func_110166_bE().equals(entity1)) { entity.func_110160_i(true, false); return; }  return; }  } else { return; }
/*  92 */        entity.func_110160_i(true, false); } } public void load(NBTTagCompound nbt) { super.load(nbt);
/*  93 */     leashedEntities().$plus$plus$eq((TraversableOnce)ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("leashedEntities", 8))
/*  94 */         .map((Function1)new UpgradeLeash$$anonfun$load$2(this)));
/*     */ 
/*     */     
/*  97 */     EventHandler$.MODULE$.scheduleServer((Function0)new UpgradeLeash$$anonfun$load$1(this)); } public final class UpgradeLeash$$anonfun$load$2 extends AbstractFunction1<NBTTagString, UUID> implements Serializable { public static final long serialVersionUID = 0L; public final UUID apply(NBTTagString s) { return UUID.fromString(s.func_150285_a_()); } public UpgradeLeash$$anonfun$load$2(UpgradeLeash $outer) {} } public final class UpgradeLeash$$anonfun$load$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply() { apply$mcV$sp(); } public UpgradeLeash$$anonfun$load$1(UpgradeLeash $outer) {}
/*  98 */     public void apply$mcV$sp() { Set foundEntities = Set$.MODULE$.empty();
/*  99 */       this.$outer.<Entity>entitiesInBounds(this.$outer.position().bounds().func_72314_b(5.0D, 5.0D, 5.0D), ClassTag$.MODULE$.apply(EntityLiving.class)).foreach((Function1)new UpgradeLeash$$anonfun$load$1$$anonfun$apply$mcV$sp$1(this, foundEntities));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 105 */       Set missing = (Set)this.$outer.leashedEntities().diff((GenSet)foundEntities);
/* 106 */       if (missing.nonEmpty()) {
/* 107 */         (new String[2])[0] = "Could not find "; (new String[2])[1] = " leashed entities after loading!"; OpenComputers$.MODULE$.log().info((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(missing.size()) })));
/* 108 */         this.$outer.leashedEntities().$minus$minus$eq((TraversableOnce)missing);
/*     */       }  } public final class UpgradeLeash$$anonfun$load$1$$anonfun$apply$mcV$sp$1 extends AbstractFunction1<EntityLiving, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final Set foundEntities$1; public UpgradeLeash$$anonfun$load$1$$anonfun$apply$mcV$sp$1(UpgradeLeash$$anonfun$load$1 $outer, Set foundEntities$1) {} public final Object apply(EntityLiving entity) {
/*     */         entity.func_110162_b(this.$outer.li$cil$oc$server$component$UpgradeLeash$$anonfun$$$outer().host(), true);
/*     */         return this.$outer.li$cil$oc$server$component$UpgradeLeash$$anonfun$$$outer().leashedEntities().contains(entity.func_110124_au()) ? this.foundEntities$1.$plus$eq(entity.func_110124_au()) : BoxedUnit.UNIT;
/*     */       } } }
/* 114 */   public void save(NBTTagCompound nbt) { super.save(nbt);
/* 115 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("leashedEntities", ExtendedNBT$.MODULE$.stringIterableToNbt((Iterable)leashedEntities().map((Function1)new UpgradeLeash$$anonfun$save$1(this), Set$.MODULE$.canBuildFrom()))); } public final class UpgradeLeash$$anonfun$save$1 extends AbstractFunction1<UUID, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(UUID x$2) { return x$2.toString(); }
/*     */ 
/*     */     
/*     */     public UpgradeLeash$$anonfun$save$1(UpgradeLeash $outer) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeLeash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */