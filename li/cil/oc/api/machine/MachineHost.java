/*    */ package li.cil.oc.api.machine;
/*    */ 
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import net.minecraft.item.ItemStack;
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
/*    */ public interface MachineHost
/*    */   extends EnvironmentHost
/*    */ {
/*    */   Machine machine();
/*    */   
/*    */   Iterable<ItemStack> internalComponents();
/*    */   
/*    */   int componentSlot(String paramString);
/*    */   
/*    */   void onMachineConnect(Node paramNode);
/*    */   
/*    */   void onMachineDisconnect(Node paramNode);
/*    */   
/*    */   default String machinePosition() {
/* 62 */     if (world() != null && (world()).field_73011_w != null) {
/* 63 */       return String.format("(%g, %g, %g, %d)", new Object[] { Double.valueOf(xPosition()), Double.valueOf(yPosition()), Double.valueOf(zPosition()), Integer.valueOf((world()).field_73011_w.field_76574_g) });
/*    */     }
/* 65 */     return String.format("(%g, %g, %g)", new Object[] { Double.valueOf(xPosition()), Double.valueOf(yPosition()), Double.valueOf(zPosition()) });
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\MachineHost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */