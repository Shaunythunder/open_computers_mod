/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class RobotEvent
/*    */   extends Event
/*    */ {
/*    */   public final Agent agent;
/*    */   
/*    */   protected RobotEvent(Agent agent) {
/* 16 */     this.agent = agent;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */