/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class RobotPlaceBlockEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   public final ItemStack stack;
/*    */   public final World world;
/*    */   public final int x;
/*    */   public final int y;
/*    */   public final int z;
/*    */   
/*    */   protected RobotPlaceBlockEvent(Agent agent, ItemStack stack, World world, int x, int y, int z) {
/* 25 */     super(agent);
/* 26 */     this.stack = stack;
/* 27 */     this.world = world;
/* 28 */     this.x = x;
/* 29 */     this.y = y;
/* 30 */     this.z = z;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Cancelable
/*    */   public static class Pre
/*    */     extends RobotPlaceBlockEvent
/*    */   {
/*    */     public Pre(Agent agent, ItemStack stack, World world, int x, int y, int z) {
/* 41 */       super(agent, stack, world, x, y, z);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public static class Post
/*    */     extends RobotPlaceBlockEvent
/*    */   {
/*    */     public Post(Agent agent, ItemStack stack, World world, int x, int y, int z) {
/* 50 */       super(agent, stack, world, x, y, z);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotPlaceBlockEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */