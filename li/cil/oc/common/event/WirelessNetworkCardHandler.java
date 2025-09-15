/*    */ package li.cil.oc.common.event;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001q:Q!\001\002\t\0025\t!dV5sK2,7o\035(fi^|'o[\"be\022D\025M\0343mKJT!a\001\003\002\013\0254XM\034;\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021!dV5sK2,7o\035(fi^|'o[\"be\022D\025M\0343mKJ\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\003\035\037\021\005Q$\001\004p]6{g/\032\013\003=\005\002\"aE\020\n\005\001\"\"\001B+oSRDQAI\016A\002\r\n\021!\032\t\003I-r!!J\025\016\003\031R!aA\024\013\005!2\021aA1qS&\021!FJ\001\017%>\024w\016^'pm\026,e/\0328u\023\taSF\001\003Q_N$(B\001\026'Q\tYr\006\005\0021u5\t\021G\003\0023g\005aQM^3oi\"\fg\016\0327fe*\021Q\001\016\006\003kY\n1AZ7m\025\t9\004(\001\003n_\022\034(\"A\035\002\007\r\004x/\003\002<c\tq1+\0362tGJL'-Z#wK:$\b")
/*    */ public final class WirelessNetworkCardHandler {
/*    */   @SubscribeEvent
/*    */   public static void onMove(RobotMoveEvent.Post paramPost) {
/*    */     WirelessNetworkCardHandler$.MODULE$.onMove(paramPost);
/*    */   }
/*    */   
/*    */   public final class WirelessNetworkCardHandler$$anonfun$onMove$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable {
/*    */     public final void apply(Node x$1) {
/* 14 */       Environment environment = x$1.host();
/* 15 */       if (environment instanceof WirelessNetworkCard) { WirelessNetworkCard wirelessNetworkCard = (WirelessNetworkCard)environment; Network.updateWirelessNetwork((WirelessEndpoint)wirelessNetworkCard); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 16 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\WirelessNetworkCardHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */