/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.network.Message;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ 
/*    */ public abstract class ManagedEnvironment
/*    */   implements ManagedEnvironment
/*    */ {
/*    */   private Node _node;
/*    */   
/*    */   public Node node() {
/* 17 */     return this._node;
/*    */   }
/*    */   
/*    */   protected void setNode(Node value) {
/* 21 */     this._node = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canUpdate() {
/* 26 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void update() {}
/*    */ 
/*    */   
/*    */   public void onConnect(Node node) {}
/*    */ 
/*    */   
/*    */   public void onDisconnect(Node node) {}
/*    */ 
/*    */   
/*    */   public void onMessage(Message message) {}
/*    */ 
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 43 */     if (node() != null) {
/* 44 */       node().load(nbt.func_74775_l("node"));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 50 */     if (node() != null)
/*    */     {
/*    */ 
/*    */ 
/*    */       
/* 55 */       if (node().address() == null) {
/* 56 */         Network.joinNewNetwork(node());
/*    */         
/* 58 */         NBTTagCompound nodeTag = new NBTTagCompound();
/* 59 */         node().save(nodeTag);
/* 60 */         nbt.func_74782_a("node", (NBTBase)nodeTag);
/*    */         
/* 62 */         node().remove();
/*    */       } else {
/* 64 */         NBTTagCompound nodeTag = new NBTTagCompound();
/* 65 */         node().save(nodeTag);
/* 66 */         nbt.func_74782_a("node", (NBTBase)nodeTag);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\ManagedEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */