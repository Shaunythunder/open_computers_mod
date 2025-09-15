/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ public abstract class RobotMoveEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   public final ForgeDirection direction;
/*    */   
/*    */   protected RobotMoveEvent(Agent agent, ForgeDirection direction) {
/* 14 */     super(agent);
/* 15 */     this.direction = direction;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Cancelable
/*    */   public static class Pre
/*    */     extends RobotMoveEvent
/*    */   {
/*    */     public Pre(Agent agent, ForgeDirection direction) {
/* 26 */       super(agent, direction);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static class Post
/*    */     extends RobotMoveEvent
/*    */   {
/*    */     public Post(Agent agent, ForgeDirection direction) {
/* 35 */       super(agent, direction);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotMoveEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */