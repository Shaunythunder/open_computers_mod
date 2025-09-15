/*     */ package li.cil.oc.api;
/*     */ 
/*     */ import li.cil.oc.api.detail.Builder;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.Packet;
/*     */ import li.cil.oc.api.network.Visibility;
/*     */ import li.cil.oc.api.network.WirelessEndpoint;
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
/*     */ public final class Network
/*     */ {
/*     */   public static void joinOrCreateNetwork(TileEntity tileEntity) {
/*  47 */     if (API.network != null) API.network.joinOrCreateNetwork(tileEntity);
/*     */   
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
/*     */   
/*     */   public static void joinNewNetwork(Node node) {
/*  61 */     if (API.network != null) API.network.joinNewNetwork(node);
/*     */   
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void joinWirelessNetwork(WirelessEndpoint endpoint) {
/*  80 */     if (API.network != null) API.network.joinWirelessNetwork(endpoint);
/*     */   
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
/*     */ 
/*     */   
/*     */   public static void updateWirelessNetwork(WirelessEndpoint endpoint) {
/*  95 */     if (API.network != null) API.network.updateWirelessNetwork(endpoint);
/*     */   
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
/*     */   
/*     */   public static void leaveWirelessNetwork(WirelessEndpoint endpoint) {
/* 109 */     if (API.network != null) API.network.leaveWirelessNetwork(endpoint);
/*     */   
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
/*     */ 
/*     */   
/*     */   public static void leaveWirelessNetwork(WirelessEndpoint endpoint, int dimension) {
/* 124 */     if (API.network != null) API.network.leaveWirelessNetwork(endpoint, dimension);
/*     */   
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void sendWirelessPacket(WirelessEndpoint source, double strength, Packet packet) {
/* 141 */     if (API.network != null) API.network.sendWirelessPacket(source, strength, packet);
/*     */   
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
/*     */   public static Builder.NodeBuilder newNode(Environment host, Visibility reachability) {
/* 184 */     if (API.network != null) return API.network.newNode(host, reachability); 
/* 185 */     return null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Packet newPacket(String source, String destination, int port, Object[] data) {
/* 204 */     if (API.network != null) return API.network.newPacket(source, destination, port, data); 
/* 205 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Packet newPacket(NBTTagCompound nbt) {
/* 215 */     if (API.network != null) return API.network.newPacket(nbt); 
/* 216 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\Network.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */