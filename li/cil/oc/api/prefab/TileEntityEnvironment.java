/*     */ package li.cil.oc.api.prefab;
/*     */ 
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.Message;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class TileEntityEnvironment
/*     */   extends TileEntity
/*     */   implements Environment
/*     */ {
/*     */   protected Node node;
/*     */   protected boolean addedToNetwork = false;
/*     */   
/*     */   public Node node() {
/*  65 */     return this.node;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onConnect(Node node) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDisconnect(Node node) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onMessage(Message message) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145845_h() {
/* 105 */     if (!this.addedToNetwork) {
/* 106 */       this.addedToNetwork = true;
/* 107 */       Network.joinOrCreateNetwork(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChunkUnload() {
/* 113 */     super.onChunkUnload();
/*     */ 
/*     */     
/* 116 */     if (this.node != null) this.node.remove();
/*     */   
/*     */   }
/*     */   
/*     */   public void func_145843_s() {
/* 121 */     super.func_145843_s();
/*     */ 
/*     */     
/* 124 */     if (this.node != null) this.node.remove();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145839_a(NBTTagCompound nbt) {
/* 131 */     super.func_145839_a(nbt);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     if (this.node != null && this.node.host() == this)
/*     */     {
/*     */ 
/*     */ 
/*     */       
/* 141 */       this.node.load(nbt.func_74775_l("oc:node"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_145841_b(NBTTagCompound nbt) {
/* 147 */     super.func_145841_b(nbt);
/*     */     
/* 149 */     if (this.node != null && this.node.host() == this) {
/* 150 */       NBTTagCompound nodeNbt = new NBTTagCompound();
/* 151 */       this.node.save(nodeNbt);
/* 152 */       nbt.func_74782_a("oc:node", (NBTBase)nodeNbt);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\TileEntityEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */