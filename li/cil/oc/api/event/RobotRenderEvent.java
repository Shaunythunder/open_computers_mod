/*    */ package li.cil.oc.api.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*    */ import li.cil.oc.api.internal.Agent;
/*    */ import org.lwjgl.util.vector.Vector3f;
/*    */ import org.lwjgl.util.vector.Vector4f;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Cancelable
/*    */ public class RobotRenderEvent
/*    */   extends RobotEvent
/*    */ {
/*    */   public final MountPoint[] mountPoints;
/*    */   
/*    */   public RobotRenderEvent(Agent agent, MountPoint[] mountPoints) {
/* 37 */     super(agent);
/* 38 */     this.mountPoints = mountPoints;
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
/*    */ 
/*    */   
/*    */   public static class MountPoint
/*    */   {
/* 53 */     public final Vector3f offset = new Vector3f(0.0F, 0.0F, 0.0F);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     public final Vector4f rotation = new Vector4f(0.0F, 0.0F, 0.0F, 0.0F);
/*    */ 
/*    */ 
/*    */     
/*    */     public final String name;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public MountPoint() {
/* 73 */       this.name = null;
/*    */     }
/*    */     
/*    */     public MountPoint(String name) {
/* 77 */       this.name = name;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RobotRenderEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */