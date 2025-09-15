package li.cil.oc.api.component;

import li.cil.oc.api.network.Environment;
import li.cil.oc.api.network.Packet;

public interface RackBusConnectable extends Environment {
  void receivePacket(Packet paramPacket);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\component\RackBusConnectable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */