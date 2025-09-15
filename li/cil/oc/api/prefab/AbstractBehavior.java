/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.nanomachines.Behavior;
/*    */ import li.cil.oc.api.nanomachines.DisableReason;
/*    */ import net.minecraft.entity.player.EntityPlayer;
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
/*    */ public abstract class AbstractBehavior
/*    */   implements Behavior
/*    */ {
/*    */   public final EntityPlayer player;
/*    */   
/*    */   protected AbstractBehavior(EntityPlayer player) {
/* 26 */     this.player = player;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected AbstractBehavior() {
/* 33 */     this(null);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getNameHint() {
/* 38 */     return null;
/*    */   }
/*    */   
/*    */   public void onEnable() {}
/*    */   
/*    */   public void onDisable(DisableReason reason) {}
/*    */   
/*    */   public void update() {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\AbstractBehavior.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */