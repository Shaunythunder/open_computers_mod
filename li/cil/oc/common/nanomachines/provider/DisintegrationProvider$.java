/*    */ package li.cil.oc.common.nanomachines.provider;
/*    */ 
/*    */ import li.cil.oc.api.nanomachines.Behavior;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DisintegrationProvider$
/*    */   extends ScalaProvider
/*    */ {
/*    */   public static final DisintegrationProvider$ MODULE$;
/*    */   
/*    */   private DisintegrationProvider$() {
/* 22 */     super("c4e7e3c2-8069-4fbb-b08e-74b1bddcdfe7"); MODULE$ = this; } public Iterable<DisintegrationProvider.DisintegrationBehavior> createScalaBehaviors(EntityPlayer player) {
/* 23 */     (new DisintegrationProvider.DisintegrationBehavior[1])[0] = new DisintegrationProvider.DisintegrationBehavior(player); return (Iterable<DisintegrationProvider.DisintegrationBehavior>)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new DisintegrationProvider.DisintegrationBehavior[1]));
/*    */   } public DisintegrationProvider.DisintegrationBehavior readBehaviorFromNBT(EntityPlayer player, NBTTagCompound nbt) {
/* 25 */     return new DisintegrationProvider.DisintegrationBehavior(player);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\DisintegrationProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */