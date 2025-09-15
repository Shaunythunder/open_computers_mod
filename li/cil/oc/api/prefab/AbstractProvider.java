/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.nanomachines.Behavior;
/*    */ import li.cil.oc.api.nanomachines.BehaviorProvider;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
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
/*    */ public abstract class AbstractProvider
/*    */   implements BehaviorProvider
/*    */ {
/*    */   protected final String id;
/*    */   
/*    */   protected AbstractProvider(String id) {
/* 28 */     if (id == null) throw new NullPointerException("id must not be null"); 
/* 29 */     this.id = id;
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
/*    */   protected void writeBehaviorToNBT(Behavior behavior, NBTTagCompound nbt) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected abstract Behavior readBehaviorFromNBT(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public NBTTagCompound writeToNBT(Behavior behavior) {
/* 59 */     NBTTagCompound nbt = new NBTTagCompound();
/* 60 */     nbt.func_74778_a("provider", this.id);
/* 61 */     writeBehaviorToNBT(behavior, nbt);
/* 62 */     return nbt;
/*    */   }
/*    */ 
/*    */   
/*    */   public Behavior readFromNBT(EntityPlayer player, NBTTagCompound nbt) {
/* 67 */     if (this.id.equals(nbt.func_74779_i("provider"))) {
/* 68 */       return readBehaviorFromNBT(player, nbt);
/*    */     }
/* 70 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\AbstractProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */