/*     */ package li.cil.oc.api.prefab;
/*     */ 
/*     */ import li.cil.oc.api.Network;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.SidedEnvironment;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class TileEntitySidedEnvironment
/*     */   extends TileEntity
/*     */   implements SidedEnvironment
/*     */ {
/*  23 */   protected Node[] nodes = new Node[6];
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
/*     */   protected boolean addedToNetwork = false;
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
/*     */   protected TileEntitySidedEnvironment(Node... nodes) {
/*  63 */     System.arraycopy(nodes, 0, this.nodes, 0, Math.min(nodes.length, this.nodes.length));
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
/*     */   public Node sidedNode(ForgeDirection side) {
/*  75 */     return (side == ForgeDirection.UNKNOWN) ? null : this.nodes[side.ordinal()];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145845_h() {
/*  82 */     super.func_145845_h();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     if (!this.addedToNetwork) {
/*  89 */       this.addedToNetwork = true;
/*     */ 
/*     */       
/*  92 */       Network.joinOrCreateNetwork(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChunkUnload() {
/*  98 */     super.onChunkUnload();
/*     */ 
/*     */     
/* 101 */     for (Node node : this.nodes) {
/* 102 */       if (node != null) node.remove();
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public void func_145843_s() {
/* 108 */     super.func_145843_s();
/*     */ 
/*     */     
/* 111 */     for (Node node : this.nodes) {
/* 112 */       if (node != null) node.remove();
/*     */     
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_145839_a(NBTTagCompound nbt) {
/* 120 */     super.func_145839_a(nbt);
/* 121 */     int index = 0;
/* 122 */     for (Node node : this.nodes) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 127 */       if (node != null && node.host() == this)
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 132 */         node.load(nbt.func_74775_l("oc:node" + index));
/*     */       }
/* 134 */       index++;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_145841_b(NBTTagCompound nbt) {
/* 140 */     super.func_145841_b(nbt);
/* 141 */     int index = 0;
/* 142 */     for (Node node : this.nodes) {
/*     */       
/* 144 */       if (node != null && node.host() == this) {
/* 145 */         NBTTagCompound nodeNbt = new NBTTagCompound();
/* 146 */         node.save(nodeNbt);
/* 147 */         nbt.func_74782_a("oc:node" + index, (NBTBase)nodeNbt);
/*     */       } 
/* 149 */       index++;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\TileEntitySidedEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */