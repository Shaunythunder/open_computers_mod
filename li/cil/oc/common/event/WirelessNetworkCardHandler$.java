/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import li.cil.oc.api.event.RobotMoveEvent;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.server.component.WirelessNetworkCard;
/*    */ import scala.Function1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class WirelessNetworkCardHandler$ {
/*    */   @SubscribeEvent
/* 13 */   public void onMove(RobotMoveEvent.Post e) { Node machineNode = e.agent.machine().node();
/* 14 */     scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(machineNode.reachableNodes()).foreach((Function1)new WirelessNetworkCardHandler$$anonfun$onMove$1()); } public static final WirelessNetworkCardHandler$ MODULE$; public final class WirelessNetworkCardHandler$$anonfun$onMove$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Node x$1) { Environment environment = x$1.host();
/* 15 */       if (environment instanceof WirelessNetworkCard) { WirelessNetworkCard wirelessNetworkCard = (WirelessNetworkCard)environment; Network.updateWirelessNetwork((WirelessEndpoint)wirelessNetworkCard); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 16 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */        }
/*    */      } private WirelessNetworkCardHandler$() {
/* 19 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\WirelessNetworkCardHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */