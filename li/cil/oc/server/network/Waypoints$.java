/*    */ package li.cil.oc.server.network;
/*    */ import li.cil.oc.common.tileentity.Waypoint;
/*    */ import li.cil.oc.util.RTree;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraftforge.event.world.WorldEvent;
/*    */ import scala.Option;
/*    */ import scala.collection.Iterable;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class Waypoints$ {
/*    */   public static final Waypoints$ MODULE$;
/*    */   
/*    */   public Map<Object, RTree<Waypoint>> dimensions() {
/* 15 */     return this.dimensions;
/*    */   } private final Map<Object, RTree<Waypoint>> dimensions;
/*    */   @SubscribeEvent
/*    */   public void onWorldUnload(WorldEvent.Unload e) {
/* 19 */     if (!e.world.field_72995_K) {
/* 20 */       dimensions().remove(BoxesRunTime.boxToInteger(e.world.field_73011_w.field_76574_g));
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onWorldLoad(WorldEvent.Load e) {
/* 26 */     if (!e.world.field_72995_K) {
/* 27 */       dimensions().remove(BoxesRunTime.boxToInteger(e.world.field_73011_w.field_76574_g));
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onChunkUnload(ChunkEvent.Unload e)
/*    */   {
/* 34 */     scala.collection.convert.WrapAsScala$.MODULE$.collectionAsScalaIterable((e.getChunk()).field_150816_i.values()).foreach((Function1)new Waypoints$$anonfun$onChunkUnload$1()); } public final class Waypoints$$anonfun$onChunkUnload$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Object x0$1) { Object object = x0$1;
/* 35 */       if (object instanceof Waypoint) { Waypoint waypoint = (Waypoint)object; Waypoints$.MODULE$.remove(waypoint); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 36 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */        }
/*    */      }
/*    */   
/* 40 */   public void add(Waypoint waypoint) { if (!waypoint.func_145837_r() && waypoint.world() != null && !(waypoint.world()).field_72995_K)
/* 41 */       ((RTree)dimensions().getOrElseUpdate(BoxesRunTime.boxToInteger(dimension(waypoint)), (Function0)new Waypoints$$anonfun$add$1())).add(waypoint);  } public final class Waypoints$$anonfun$add$1 extends AbstractFunction0<RTree<Waypoint>> implements Serializable { public static final long serialVersionUID = 0L; public final RTree<Waypoint> apply() { return new RTree(li.cil.oc.Settings$.MODULE$.get().rTreeMaxEntries(), (Function1)new Waypoints$$anonfun$add$1$$anonfun$apply$1(this)); } public final class Waypoints$$anonfun$add$1$$anonfun$apply$1 extends AbstractFunction1<Waypoint, Tuple3<Object, Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple3<Object, Object, Object> apply(Waypoint waypoint) { return new Tuple3(BoxesRunTime.boxToDouble(waypoint.x() + 0.5D), BoxesRunTime.boxToDouble(waypoint.y() + 0.5D), BoxesRunTime.boxToDouble(waypoint.z() + 0.5D)); }
/*    */        public Waypoints$$anonfun$add$1$$anonfun$apply$1(Waypoints$$anonfun$add$1 $outer) {} } }
/*    */   public void remove(Waypoint waypoint) {
/* 44 */     if (waypoint.world() != null && !(waypoint.world()).field_72995_K) {
/* 45 */       Option option = dimensions().get(BoxesRunTime.boxToInteger(dimension(waypoint)));
/* 46 */       if (option instanceof Some) { Some some = (Some)option; RTree set = (RTree)some.x(); set.remove(waypoint); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 47 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } 
/*    */   } public Iterable<Waypoint> findWaypoints(BlockPosition pos, double range) {
/*    */     Iterable<Waypoint> iterable;
/* 52 */     Option option = dimensions().get(BoxesRunTime.boxToInteger(((World)pos.world().get()).field_73011_w.field_76574_g));
/* 53 */     if (option instanceof Some) { Some some = (Some)option; RTree set = (RTree)some.x();
/* 54 */       AxisAlignedBB bounds = pos.bounds().func_72314_b(range * 0.5D, range * 0.5D, range * 0.5D);
/* 55 */       iterable = set.query(new Tuple3(BoxesRunTime.boxToDouble(bounds.field_72340_a), BoxesRunTime.boxToDouble(bounds.field_72338_b), BoxesRunTime.boxToDouble(bounds.field_72339_c)), new Tuple3(BoxesRunTime.boxToDouble(bounds.field_72336_d), BoxesRunTime.boxToDouble(bounds.field_72337_e), BoxesRunTime.boxToDouble(bounds.field_72334_f))); }
/* 56 */     else { iterable = (Iterable)scala.package$.MODULE$.Iterable().empty(); }
/*    */     
/*    */     return iterable;
/*    */   }
/* 60 */   private int dimension(Waypoint waypoint) { return (waypoint.world()).field_73011_w.field_76574_g; } private Waypoints$() {
/* 61 */     MODULE$ = this;
/*    */     this.dimensions = scala.collection.mutable.Map$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Waypoints$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */