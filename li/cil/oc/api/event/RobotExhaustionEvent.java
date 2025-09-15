/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RobotExhaustionEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   public final double exhaustion;
/*    */   
/*    */   public RobotExhaustionEvent(Agent agent, double exhaustion) {
/* 16 */     super(agent);
/* 17 */     this.exhaustion = exhaustion;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotExhaustionEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */