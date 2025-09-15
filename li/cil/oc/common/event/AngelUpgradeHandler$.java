/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import li.cil.oc.api.event.RobotPlaceInAirEvent;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import scala.Function1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class AngelUpgradeHandler$ {
/*    */   public static final AngelUpgradeHandler$ MODULE$;
/*    */   
/*    */   @SubscribeEvent
/* 13 */   public void onPlaceInAir(RobotPlaceInAirEvent e) { Node machineNode = e.agent.machine().node();
/* 14 */     e.setAllowed(scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(machineNode.reachableNodes()).exists((Function1)new AngelUpgradeHandler$$anonfun$onPlaceInAir$1(machineNode))); } public final class AngelUpgradeHandler$$anonfun$onPlaceInAir$1 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Node x0$1) { Node node = x0$1;
/* 15 */       if (node != null) { Node node1 = node; if (node1.canBeReachedFrom(this.machineNode$1))
/* 16 */           return node1.host() instanceof li.cil.oc.server.component.UpgradeAngel;  }
/*    */       
/*    */       return false; }
/*    */      private final Node machineNode$1; public AngelUpgradeHandler$$anonfun$onPlaceInAir$1(Node machineNode$1) {} } private AngelUpgradeHandler$() {
/* 20 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\AngelUpgradeHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */