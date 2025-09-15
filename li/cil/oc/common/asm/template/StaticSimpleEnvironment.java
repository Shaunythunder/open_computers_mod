/*    */ package li.cil.oc.common.asm.template;
/*    */ 
/*    */ import com.google.common.base.Strings;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.network.Visibility;
/*    */ import li.cil.oc.common.asm.SimpleComponentTickHandler;
/*    */ import li.cil.oc.util.SideTracker;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class StaticSimpleEnvironment
/*    */ {
/* 23 */   private static final Map<Environment, Node> nodes = new HashMap<>();
/*    */ 
/*    */ 
/*    */   
/*    */   public static Node node(SimpleComponentImpl self) {
/* 28 */     if (SideTracker.isClient()) {
/* 29 */       return null;
/*    */     }
/* 31 */     String name = self.getComponentName();
/*    */ 
/*    */     
/* 34 */     if (Strings.isNullOrEmpty(name)) {
/* 35 */       Node node = nodes.remove(self);
/* 36 */       if (node != null) {
/* 37 */         node.remove();
/*    */       }
/* 39 */     } else if (!nodes.containsKey(self)) {
/* 40 */       nodes.put(self, 
/*    */           
/* 42 */           Network.newNode(self, Visibility.Network)
/* 43 */           .withComponent(name)
/* 44 */           .create());
/*    */     } 
/* 46 */     return nodes.get(self);
/*    */   }
/*    */   
/*    */   public static void validate(SimpleComponentImpl self) {
/* 50 */     self.validate_OpenComputers();
/* 51 */     SimpleComponentTickHandler.schedule((TileEntity)self);
/*    */   }
/*    */   
/*    */   public static void invalidate(SimpleComponentImpl self) {
/* 55 */     self.invalidate_OpenComputers();
/* 56 */     Node node = node(self);
/* 57 */     if (node != null) {
/* 58 */       node.remove();
/* 59 */       nodes.remove(self);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void onChunkUnload(SimpleComponentImpl self) {
/* 64 */     self.onChunkUnload_OpenComputers();
/* 65 */     Node node = node(self);
/* 66 */     if (node != null) {
/* 67 */       node.remove();
/* 68 */       nodes.remove(self);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void readFromNBT(SimpleComponentImpl self, NBTTagCompound nbt) {
/* 73 */     self.readFromNBT_OpenComputers(nbt);
/* 74 */     Node node = node(self);
/* 75 */     if (node != null) {
/* 76 */       node.load(nbt.func_74775_l("oc:node"));
/*    */     }
/*    */   }
/*    */   
/*    */   public static void writeToNBT(SimpleComponentImpl self, NBTTagCompound nbt) {
/* 81 */     self.writeToNBT_OpenComputers(nbt);
/* 82 */     Node node = node(self);
/* 83 */     if (node != null) {
/* 84 */       NBTTagCompound nodeNbt = new NBTTagCompound();
/* 85 */       node.save(nodeNbt);
/* 86 */       nbt.func_74782_a("oc:node", (NBTBase)nodeNbt);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\asm\template\StaticSimpleEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */