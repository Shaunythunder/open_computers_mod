/*    */ package li.cil.oc.common.nanomachines.provider;
/*    */ 
/*    */ import li.cil.oc.api.nanomachines.Behavior;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class MagnetProvider$ extends ScalaProvider {
/*    */   public static final MagnetProvider$ MODULE$;
/*    */   
/*    */   private MagnetProvider$() {
/* 13 */     super("9324d5ec-71f1-41c2-b51c-406e527668fc"); MODULE$ = this; } public Iterable<MagnetProvider.MagnetBehavior> createScalaBehaviors(EntityPlayer player) {
/* 14 */     (new MagnetProvider.MagnetBehavior[1])[0] = new MagnetProvider.MagnetBehavior(player); return (Iterable<MagnetProvider.MagnetBehavior>)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new MagnetProvider.MagnetBehavior[1]));
/*    */   } public MagnetProvider.MagnetBehavior readBehaviorFromNBT(EntityPlayer player, NBTTagCompound nbt) {
/* 16 */     return new MagnetProvider.MagnetBehavior(player);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\MagnetProvider$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */