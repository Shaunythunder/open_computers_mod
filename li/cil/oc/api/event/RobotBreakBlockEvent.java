/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public abstract class RobotBreakBlockEvent extends RobotEvent {
/*    */   protected RobotBreakBlockEvent(Agent agent) {
/*  9 */     super(agent);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Cancelable
/*    */   public static class Pre
/*    */     extends RobotBreakBlockEvent
/*    */   {
/*    */     public final World world;
/*    */ 
/*    */     
/*    */     public final int x;
/*    */ 
/*    */     
/*    */     public final int y;
/*    */ 
/*    */     
/*    */     public final int z;
/*    */ 
/*    */     
/*    */     private double breakTime;
/*    */ 
/*    */ 
/*    */     
/*    */     public Pre(Agent agent, World world, int x, int y, int z, double breakTime) {
/* 35 */       super(agent);
/* 36 */       this.world = world;
/* 37 */       this.x = x;
/* 38 */       this.y = y;
/* 39 */       this.z = z;
/* 40 */       this.breakTime = breakTime;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void setBreakTime(double breakTime) {
/* 52 */       this.breakTime = Math.max(0.05D, breakTime);
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public double getBreakTime() {
/* 61 */       return this.breakTime;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static class Post
/*    */     extends RobotBreakBlockEvent
/*    */   {
/*    */     public final double experience;
/*    */ 
/*    */ 
/*    */     
/*    */     public Post(Agent agent, double experience) {
/* 75 */       super(agent);
/* 76 */       this.experience = experience;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotBreakBlockEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */