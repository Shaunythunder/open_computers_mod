/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RobotAnalyzeEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   public final EntityPlayer player;
/*    */   
/*    */   public RobotAnalyzeEvent(Agent agent, EntityPlayer player) {
/* 18 */     super(agent);
/* 19 */     this.player = player;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotAnalyzeEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */