/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import java.util.UUID;
/*    */ import li.cil.oc.server.component.traits.WorldAware;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.reflect.ClassTag;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005mb\001B\001\003\0015\021a\"\0269he\006$W\r\026:bI&twM\003\002\004\t\005I1m\\7q_:,g\016\036\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M!\001A\004\f\035!\tyA#D\001\021\025\t\t\"#\001\004qe\0264\027M\031\006\003'\031\t1!\0319j\023\t)\002C\001\nNC:\fw-\0323F]ZL'o\0348nK:$\bCA\f\033\033\005A\"BA\r\003\003\031!(/Y5ug&\0211\004\007\002\013/>\024H\016Z!xCJ,\007CA\017!\033\005q\"BA\020\023\003\031!'/\033<fe&\021\021E\b\002\013\t\0264\030nY3J]\032|\007\002C\022\001\005\013\007I\021\001\023\002\t!|7\017^\013\002KA\021a%K\007\002O)\021\001FE\001\b]\026$xo\034:l\023\tQsEA\bF]ZL'o\0348nK:$\bj\\:u\021!a\003A!A!\002\023)\023!\0025pgR\004\003\"\002\030\001\t\003y\023A\002\037j]&$h\b\006\0021eA\021\021\007A\007\002\005!)1%\fa\001K!9A\007\001b\001\n\003*\024\001\0028pI\026,\022A\016\t\003M]J!\001O\024\003\023\r{W\016]8oK:$\bB\002\036\001A\003%a'A\003o_\022,\007\005\003\005=\001!\025\r\021\"\004>\003)!WM^5dK&sgm\\\013\002}A!qH\022%I\033\005\001%BA!C\003%IW.\\;uC\ndWM\003\002D\t\006Q1m\0347mK\016$\030n\0348\013\003\025\013Qa]2bY\006L!a\022!\003\0075\013\007\017\005\002J\0356\t!J\003\002L\031\006!A.\0318h\025\005i\025\001\0026bm\006L!a\024&\003\rM#(/\0338h\021!\t\006\001#A!B\033q\024a\0033fm&\034W-\0238g_\002BQa\025\001\005BQ\013QbZ3u\t\0264\030nY3J]\032|G#A+\021\tYK&LW\007\002/*\021\001\fT\001\005kRLG.\003\002H/B\0211l\030\b\0039vk\021\001R\005\003=\022\013a\001\025:fI\0264\027BA(a\025\tqF\tC\003c\001\021\0053-\001\005q_NLG/[8o+\005!\007CA3h\033\0051'B\001-\007\023\tAgMA\007CY>\0347\016U8tSRLwN\034\005\006U\002!\ta[\001\t[\006D(+\0318hKV\tA\016\005\002][&\021a\016\022\002\007\t>,(\r\\3\t\013A\004A\021A9\002\023%\034\030J\034*b]\036,GC\001:v!\ta6/\003\002u\t\n9!i\\8mK\006t\007\"\002<p\001\0049\030AB3oi&$\030\020\005\002y}6\t\021P\003\002wu*\0211\020`\001\n[&tWm\031:bMRT\021!`\001\004]\026$\030BA@z\005\031)e\016^5us\"9\0211\001\001\005\002\005\025\021!C4fiR\023\030\rZ3t)\031\t9!a\005\002$A)A,!\003\002\016%\031\0211\002#\003\013\005\023(/Y=\021\007q\013y!C\002\002\022\021\023a!\0218z%\0264\007\002CA\013\003\003\001\r!a\006\002\017\r|g\016^3yiB!\021\021DA\020\033\t\tYBC\002\002\036I\tq!\\1dQ&tW-\003\003\002\"\005m!aB\"p]R,\007\020\036\005\t\003K\t\t\0011\001\002(\005!\021M]4t!\021\tI\"!\013\n\t\005-\0221\004\002\n\003J<W/\\3oiND\003\"!\001\0020\005U\022q\007\t\005\0033\t\t$\003\003\0024\005m!\001C\"bY2\024\027mY6\002\007\021|7-\t\002\002:\005Ye-\0368di&|g\016K\025;i\006\024G.\032\021.[\001\022V\r^;s]N\004\023\r\t;bE2,\007e\0344!iJ\fG-Z:!S:\004#/\0318hK\002\n7\017I;tKJ$\027\r^1!_\nTWm\031;t]\001")
/*    */ public class UpgradeTrading extends ManagedEnvironment implements WorldAware, DeviceInfo {
/*    */   private final EnvironmentHost host;
/*    */   private final Component node;
/*    */   private Map<String, String> deviceInfo;
/*    */   private volatile boolean bitmap$0;
/*    */   
/* 27 */   public World world() { return WorldAware.class.world(this); } public EntityPlayer fakePlayer() { return WorldAware.class.fakePlayer(this); } public boolean mayInteract(BlockPosition blockPos, ForgeDirection face) { return WorldAware.class.mayInteract(this, blockPos, face); } public <Type extends Entity> Buffer<Type> entitiesInBounds(AxisAlignedBB bounds, ClassTag evidence$1) { return WorldAware.class.entitiesInBounds(this, bounds, evidence$1); } public <Type extends Entity> Buffer<Type> entitiesInBlock(BlockPosition blockPos, ClassTag evidence$2) { return WorldAware.class.entitiesInBlock(this, blockPos, evidence$2); } public <Type extends Entity> Buffer<Type> entitiesOnSide(ForgeDirection side, ClassTag evidence$3) { return WorldAware.class.entitiesOnSide(this, side, evidence$3); } public <Type extends Entity> Option<Type> closestEntity(ForgeDirection side, ClassTag evidence$4) { return WorldAware.class.closestEntity(this, side, evidence$4); } public Tuple2<Object, String> blockContent(ForgeDirection side) { return WorldAware.class.blockContent(this, side); } public EnvironmentHost host() { return this.host; } public UpgradeTrading(EnvironmentHost host) { WorldAware.class.$init$(this);
/* 28 */     this.node = (Component)Network.newNode((Environment)this, Visibility.Network)
/* 29 */       .withComponent("trading")
/* 30 */       .create(); }
/*    */   public Component node() { return this.node; }
/* 32 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/* 33 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/* 34 */         (new Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Trading upgrade");
/* 35 */         (new Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 36 */         (new Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Capitalism H.O. 1200T"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = true; }
/*    */        return this.deviceInfo; }
/*    */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/* 39 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */    public BlockPosition position() {
/* 41 */     return BlockPosition$.MODULE$.apply(host());
/*    */   }
/* 43 */   public double maxRange() { return Settings$.MODULE$.get().tradingRange(); } public final class UpgradeTrading$$anonfun$2 extends AbstractFunction1<Entity, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(Entity entity) { return this.$outer.isInRange(entity); } public UpgradeTrading$$anonfun$2(UpgradeTrading $outer) {} } public final class UpgradeTrading$$anonfun$1 extends AbstractPartialFunction<Entity, Entity> implements Serializable {
/* 45 */     public static final long serialVersionUID = 0L; public final <A1 extends Entity, B1> B1 applyOrElse(Entity x1, Function1 default) { Object object; Entity entity = x1; if (entity instanceof IMerchant) { Entity entity1 = entity; } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Entity x1) { boolean bool; Entity entity = x1; if (entity instanceof IMerchant) { bool = true; } else { bool = false; }  return bool; } public UpgradeTrading$$anonfun$1(UpgradeTrading $outer) {} } public boolean isInRange(Entity entity) { return (Vec3.func_72443_a(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v).func_72438_d(position().toVec3()) <= maxRange()); }
/*    */   public final class UpgradeTrading$$anonfun$getTrades$1 extends AbstractPartialFunction<Entity, UUID> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     public final <A1 extends Entity & IMerchant, B1> B1 applyOrElse(Entity x2, Function1 default) { Object object; Entity entity = x2; if (entity != null) { Entity entity1 = entity; object = entity1.getPersistentID(); } else { object = default.apply(x2); }  return (B1)object; } public final boolean isDefinedAt(Entity x2) { boolean bool; Entity entity = x2; if (entity != null) { bool = true; } else { bool = false; }
/* 49 */        return bool; } public UpgradeTrading$$anonfun$getTrades$1(UpgradeTrading $outer) {} } @Callback(doc = "function():table -- Returns a table of trades in range as userdata objects.") public Object[] getTrades(Context context, Arguments args) { Buffer merchants = (Buffer)((TraversableLike)entitiesInBounds(position().bounds().func_72314_b(maxRange(), maxRange(), maxRange()), ClassTag$.MODULE$.apply(Entity.class))
/* 50 */       .filter((Function1)new UpgradeTrading$$anonfun$2(this)))
/* 51 */       .collect((PartialFunction)new UpgradeTrading$$anonfun$1(this), Buffer$.MODULE$.canBuildFrom());
/* 52 */     IntRef nextId = IntRef.create(1);
/* 53 */     Map idMap = (Map)Map$.MODULE$.apply((Seq)Nil$.MODULE$);
/* 54 */     ((TraversableLike)((SeqLike)merchants.collect((PartialFunction)new UpgradeTrading$$anonfun$getTrades$1(this), Buffer$.MODULE$.canBuildFrom())).sorted(Ordering$.MODULE$.ordered((Function1)Predef$.MODULE$.$conforms()))).withFilter((Function1)new UpgradeTrading$$anonfun$getTrades$2(this)).foreach((Function1)new UpgradeTrading$$anonfun$getTrades$3(this, nextId, idMap));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { ((TraversableLike)merchants.sortBy((Function1)new UpgradeTrading$$anonfun$getTrades$4(this), Ordering$.MODULE$.ordered((Function1)Predef$.MODULE$.$conforms()))).flatMap((Function1)new UpgradeTrading$$anonfun$getTrades$5(this, idMap), Buffer$.MODULE$.canBuildFrom()) })); } public final class UpgradeTrading$$anonfun$getTrades$2 extends AbstractFunction1<UUID, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(UUID check$ifrefutable$1) { boolean bool; UUID uUID = check$ifrefutable$1; if (uUID != null) { bool = true; } else { bool = false; }  return bool; } public UpgradeTrading$$anonfun$getTrades$2(UpgradeTrading $outer) {} } public final class UpgradeTrading$$anonfun$getTrades$3 extends AbstractFunction1<UUID, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef nextId$1; private final Map idMap$1; public UpgradeTrading$$anonfun$getTrades$3(UpgradeTrading $outer, IntRef nextId$1, Map idMap$1) {} public final void apply(UUID id) { this.idMap$1.put(id, BoxesRunTime.boxToInteger(this.nextId$1.elem)); this.nextId$1.elem++; } } public final class UpgradeTrading$$anonfun$getTrades$4 extends AbstractFunction1<Entity, UUID> implements Serializable { public static final long serialVersionUID = 0L; public final UUID apply(Entity m) { return m.getPersistentID(); } public UpgradeTrading$$anonfun$getTrades$4(UpgradeTrading $outer) {} } public final class UpgradeTrading$$anonfun$getTrades$5 extends AbstractFunction1<Entity, IndexedSeq<Trade>> implements Serializable { public static final long serialVersionUID = 0L; public final Map idMap$1; public final IndexedSeq<Trade> apply(Entity merchant) { return (IndexedSeq<Trade>)WrapAsScala$.MODULE$.asScalaBuffer((List)((IMerchant)merchant).func_70934_b(null)).indices().map((Function1)new UpgradeTrading$$anonfun$getTrades$5$$anonfun$apply$1(this, merchant), IndexedSeq$.MODULE$.canBuildFrom()); } public UpgradeTrading$$anonfun$getTrades$5(UpgradeTrading $outer, Map idMap$1) {} public final class UpgradeTrading$$anonfun$getTrades$5$$anonfun$apply$1 extends AbstractFunction1<Object, Trade> implements Serializable { public static final long serialVersionUID = 0L; private final Entity merchant$1; public UpgradeTrading$$anonfun$getTrades$5$$anonfun$apply$1(UpgradeTrading$$anonfun$getTrades$5 $outer, Entity merchant$1) {} public final Trade apply(int index) {
/* 60 */         return new Trade(this.$outer.li$cil$oc$server$component$UpgradeTrading$$anonfun$$$outer(), (IMerchant)this.merchant$1, index, BoxesRunTime.unboxToInt(this.$outer.idMap$1.apply(this.merchant$1.getPersistentID())));
/*    */       } }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeTrading.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */