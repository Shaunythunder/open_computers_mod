/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ public class RobotUsedToolEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   public final ItemStack toolBeforeUse;
/*    */   public final ItemStack toolAfterUse;
/*    */   protected double damageRate;
/*    */   
/*    */   protected RobotUsedToolEvent(Agent agent, ItemStack toolBeforeUse, ItemStack toolAfterUse, double damageRate) {
/* 15 */     super(agent);
/* 16 */     this.toolBeforeUse = toolBeforeUse;
/* 17 */     this.toolAfterUse = toolAfterUse;
/* 18 */     this.damageRate = damageRate;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double getDamageRate() {
/* 29 */     return this.damageRate;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class ComputeDamageRate
/*    */     extends RobotUsedToolEvent
/*    */   {
/*    */     public ComputeDamageRate(Agent agent, ItemStack toolBeforeUse, ItemStack toolAfterUse, double damageRate) {
/* 40 */       super(agent, toolBeforeUse, toolAfterUse, damageRate);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void setDamageRate(double damageRate) {
/* 51 */       this.damageRate = Math.max(0.0D, Math.min(1.0D, damageRate));
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class ApplyDamageRate
/*    */     extends RobotUsedToolEvent
/*    */   {
/*    */     public ApplyDamageRate(Agent agent, ItemStack toolBeforeUse, ItemStack toolAfterUse, double damageRate) {
/* 67 */       super(agent, toolBeforeUse, toolAfterUse, damageRate);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotUsedToolEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */