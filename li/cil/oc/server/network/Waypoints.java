/*    */ package li.cil.oc.server.network;@ScalaSignature(bytes = "\006\001\005Er!B\001\003\021\003i\021!C,bsB|\027N\034;t\025\t\031A!A\004oKR<xN]6\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\021bV1za>Lg\016^:\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!9Ad\004b\001\n\003i\022A\0033j[\026t7/[8ogV\ta\004\005\003 I\031JS\"\001\021\013\005\005\022\023aB7vi\006\024G.\032\006\003GQ\t!bY8mY\026\034G/[8o\023\t)\003EA\002NCB\004\"aE\024\n\005!\"\"aA%oiB\031!&L\030\016\003-R!\001\f\004\002\tU$\030\016\\\005\003]-\022QA\025+sK\026\004\"\001M\033\016\003ER!AM\032\002\025QLG.Z3oi&$\030P\003\0025\r\00511m\\7n_:L!AN\031\003\021]\013\027\020]8j]RDa\001O\b!\002\023q\022a\0033j[\026t7/[8og\002BQAO\b\005\002m\nQb\0348X_JdG-\0268m_\006$GC\001\037@!\t\031R(\003\002?)\t!QK\\5u\021\025\001\025\b1\001B\003\005)\007C\001\"O\035\t\031E*D\001E\025\t)e)A\003x_JdGM\003\002H\021\006)QM^3oi*\021\021JS\001\017[&tWm\031:bMR4wN]4f\025\005Y\025a\0018fi&\021Q\nR\001\013/>\024H\016Z#wK:$\030BA(Q\005\031)f\016\\8bI*\021Q\n\022\025\003sI\003\"aU/\016\003QS!!\026,\002\031\0254XM\034;iC:$G.\032:\013\005Q:&B\001-Z\003\r1W\016\034\006\0035n\013A!\\8eg*\tA,A\002da^L!A\030+\003\035M+(m]2sS\n,WI^3oi\")\001m\004C\001C\006YqN\\,pe2$Gj\\1e)\ta$\rC\003A?\002\0071\r\005\002CI&\021Q\r\025\002\005\031>\fG\r\013\002`%\")\001n\004C\001S\006iqN\\\"ik:\\WK\0347pC\022$\"\001\0206\t\013\001;\007\031A6\021\0051|gBA\"n\023\tqG)\001\006DQVt7.\022<f]RL!a\0249\013\0059$\005FA4S\021\025\031x\002\"\001u\003\r\tG\r\032\013\003yUDQA\036:A\002=\n\001b^1za>Lg\016\036\005\006q>!\t!_\001\007e\026lwN^3\025\005qR\b\"\002<x\001\004y\003\"\002?\020\t\003i\030!\0044j]\022<\026-\0379pS:$8\017F\003\003+\ty\002\005\003\000\003\037yc\002BA\001\003\027qA!a\001\002\n5\021\021Q\001\006\004\003\017a\021A\002\037s_>$h(C\001\026\023\r\ti\001F\001\ba\006\0347.Y4f\023\021\t\t\"a\005\003\021%#XM]1cY\026T1!!\004\025\021\035\t9b\037a\001\0033\t1\001]8t!\rQ\0231D\005\004\003;Y#!\004\"m_\016\\\007k\\:ji&|g\016C\004\002\"m\004\r!a\t\002\013I\fgnZ3\021\007M\t)#C\002\002(Q\021a\001R8vE2,\007bBA\026\037\021%\021QF\001\nI&lWM\\:j_:$2AJA\030\021\0311\030\021\006a\001_\001")
/*    */ public final class Waypoints { public static Iterable<Waypoint> findWaypoints(BlockPosition paramBlockPosition, double paramDouble) {
/*    */     return Waypoints$.MODULE$.findWaypoints(paramBlockPosition, paramDouble);
/*    */   }
/*    */   
/*    */   public static void remove(Waypoint paramWaypoint) {
/*    */     Waypoints$.MODULE$.remove(paramWaypoint);
/*    */   }
/*    */   
/*    */   public static void add(Waypoint paramWaypoint) {
/*    */     Waypoints$.MODULE$.add(paramWaypoint);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onChunkUnload(ChunkEvent.Unload paramUnload) {
/*    */     Waypoints$.MODULE$.onChunkUnload(paramUnload);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onWorldLoad(WorldEvent.Load paramLoad) {
/*    */     Waypoints$.MODULE$.onWorldLoad(paramLoad);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onWorldUnload(WorldEvent.Unload paramUnload) {
/*    */     Waypoints$.MODULE$.onWorldUnload(paramUnload);
/*    */   }
/*    */   
/*    */   public static Map<Object, RTree<Waypoint>> dimensions() {
/*    */     return Waypoints$.MODULE$.dimensions();
/*    */   }
/*    */   
/*    */   public final class Waypoints$$anonfun$onChunkUnload$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public final void apply(Object x0$1) {
/* 34 */       Object object = x0$1;
/* 35 */       if (object instanceof Waypoint) { Waypoint waypoint = (Waypoint)object; Waypoints$.MODULE$.remove(waypoint); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 36 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } public static final long serialVersionUID = 0L; }
/*    */   public final class Waypoints$$anonfun$add$1 extends AbstractFunction0<RTree<Waypoint>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final RTree<Waypoint> apply() {
/* 41 */       return new RTree(Settings$.MODULE$.get().rTreeMaxEntries(), (Function1)new Waypoints$$anonfun$add$1$$anonfun$apply$1(this)); } public final class Waypoints$$anonfun$add$1$$anonfun$apply$1 extends AbstractFunction1<Waypoint, Tuple3<Object, Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple3<Object, Object, Object> apply(Waypoint waypoint) { return new Tuple3(BoxesRunTime.boxToDouble(waypoint.x() + 0.5D), BoxesRunTime.boxToDouble(waypoint.y() + 0.5D), BoxesRunTime.boxToDouble(waypoint.z() + 0.5D)); }
/*    */ 
/*    */       
/*    */       public Waypoints$$anonfun$add$1$$anonfun$apply$1(Waypoints$$anonfun$add$1 $outer) {} }
/*    */      }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Waypoints.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */