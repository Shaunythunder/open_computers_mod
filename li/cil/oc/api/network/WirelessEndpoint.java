package li.cil.oc.api.network;

import net.minecraft.world.World;

public interface WirelessEndpoint {
  int x();
  
  int y();
  
  int z();
  
  World world();
  
  void receivePacket(Packet paramPacket, WirelessEndpoint paramWirelessEndpoint);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\WirelessEndpoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */