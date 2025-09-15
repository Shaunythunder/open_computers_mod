/*    */ package li.cil.oc.common.event;
/*    */ import li.cil.oc.api.event.RobotPlaceInAirEvent;
/*    */ import li.cil.oc.api.network.Node;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001a:Q!\001\002\t\0025\t1#\0218hK2,\006o\032:bI\026D\025M\0343mKJT!a\001\003\002\013\0254XM\034;\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\0211#\0218hK2,\006o\032:bI\026D\025M\0343mKJ\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\003\035\037\021\005Q$\001\007p]Bc\027mY3J]\006K'\017\006\002\037CA\0211cH\005\003AQ\021A!\0268ji\")!e\007a\001G\005\tQ\r\005\002%Q5\tQE\003\002\004M)\021qEB\001\004CBL\027BA\025&\005Q\021vNY8u!2\f7-Z%o\003&\024XI^3oi\"\0221d\013\t\003YYj\021!\f\006\003]=\nA\"\032<f]RD\027M\0343mKJT!!\002\031\013\005E\022\024a\0014nY*\0211\007N\001\005[>$7OC\0016\003\r\031\007o^\005\003o5\022abU;cg\016\024\030NY3Fm\026tG\017")
/*    */ public final class AngelUpgradeHandler {
/*    */   @SubscribeEvent
/*    */   public static void onPlaceInAir(RobotPlaceInAirEvent paramRobotPlaceInAirEvent) {
/*    */     AngelUpgradeHandler$.MODULE$.onPlaceInAir(paramRobotPlaceInAirEvent);
/*    */   }
/*    */   
/*    */   public final class AngelUpgradeHandler$$anonfun$onPlaceInAir$1 extends AbstractFunction1<Node, Object> implements Serializable {
/*    */     public final boolean apply(Node x0$1) {
/* 14 */       Node node = x0$1;
/* 15 */       if (node != null) { Node node1 = node; if (node1.canBeReachedFrom(this.machineNode$1))
/* 16 */           return node1.host() instanceof li.cil.oc.server.component.UpgradeAngel;  }
/*    */       
/*    */       return false;
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Node machineNode$1;
/*    */     
/*    */     public AngelUpgradeHandler$$anonfun$onPlaceInAir$1(Node machineNode$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\AngelUpgradeHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */