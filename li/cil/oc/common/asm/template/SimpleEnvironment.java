/*    */ package li.cil.oc.common.asm.template;
/*    */ 
/*    */ import li.cil.oc.api.network.Message;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SimpleEnvironment
/*    */   extends TileEntity
/*    */   implements SimpleComponentImpl
/*    */ {
/*    */   public Node node() {
/* 15 */     return StaticSimpleEnvironment.node(this);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void onConnect(Node node) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void onDisconnect(Node node) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void onMessage(Message message) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_145829_t() {
/* 34 */     StaticSimpleEnvironment.validate(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_145843_s() {
/* 39 */     StaticSimpleEnvironment.invalidate(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onChunkUnload() {
/* 44 */     StaticSimpleEnvironment.onChunkUnload(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_145839_a(NBTTagCompound nbt) {
/* 49 */     StaticSimpleEnvironment.readFromNBT(this, nbt);
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_145841_b(NBTTagCompound nbt) {
/* 54 */     StaticSimpleEnvironment.writeToNBT(this, nbt);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void validate_OpenComputers() {
/* 64 */     super.func_145829_t();
/*    */   }
/*    */   
/*    */   public void invalidate_OpenComputers() {
/* 68 */     super.func_145843_s();
/*    */   }
/*    */   
/*    */   public void onChunkUnload_OpenComputers() {
/* 72 */     super.onChunkUnload();
/*    */   }
/*    */   
/*    */   public void readFromNBT_OpenComputers(NBTTagCompound nbt) {
/* 76 */     super.func_145839_a(nbt);
/*    */   }
/*    */   
/*    */   public void writeToNBT_OpenComputers(NBTTagCompound nbt) {
/* 80 */     super.func_145841_b(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\asm\template\SimpleEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */