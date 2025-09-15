/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RobotPlaceInAirEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   private boolean isAllowed = false;
/*    */   
/*    */   public RobotPlaceInAirEvent(Agent agent) {
/* 17 */     super(agent);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isAllowed() {
/* 24 */     return this.isAllowed;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setAllowed(boolean value) {
/* 32 */     this.isAllowed = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotPlaceInAirEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */