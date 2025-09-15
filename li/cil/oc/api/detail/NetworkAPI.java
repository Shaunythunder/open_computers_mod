package li.cil.oc.api.detail;

import li.cil.oc.api.network.Environment;
import li.cil.oc.api.network.Node;
import li.cil.oc.api.network.Packet;
import li.cil.oc.api.network.Visibility;
import li.cil.oc.api.network.WirelessEndpoint;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public interface NetworkAPI {
  void joinOrCreateNetwork(TileEntity paramTileEntity);
  
  void joinNewNetwork(Node paramNode);
  
  void joinWirelessNetwork(WirelessEndpoint paramWirelessEndpoint);
  
  void updateWirelessNetwork(WirelessEndpoint paramWirelessEndpoint);
  
  void leaveWirelessNetwork(WirelessEndpoint paramWirelessEndpoint);
  
  void leaveWirelessNetwork(WirelessEndpoint paramWirelessEndpoint, int paramInt);
  
  void sendWirelessPacket(WirelessEndpoint paramWirelessEndpoint, double paramDouble, Packet paramPacket);
  
  Builder.NodeBuilder newNode(Environment paramEnvironment, Visibility paramVisibility);
  
  Packet newPacket(String paramString1, String paramString2, int paramInt, Object[] paramArrayOfObject);
  
  Packet newPacket(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\NetworkAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */