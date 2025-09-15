/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import net.minecraft.entity.Entity;
/*    */ 
/*    */ 
/*    */ public class RobotAttackEntityEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   public final Entity target;
/*    */   
/*    */   protected RobotAttackEntityEvent(Agent agent, Entity target) {
/* 14 */     super(agent);
/* 15 */     this.target = target;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Cancelable
/*    */   public static class Pre
/*    */     extends RobotAttackEntityEvent
/*    */   {
/*    */     public Pre(Agent agent, Entity target) {
/* 26 */       super(agent, target);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static class Post
/*    */     extends RobotAttackEntityEvent
/*    */   {
/*    */     public Post(Agent agent, Entity target) {
/* 35 */       super(agent, target);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotAttackEntityEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */