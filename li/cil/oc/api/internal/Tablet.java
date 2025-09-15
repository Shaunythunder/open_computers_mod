package li.cil.oc.api.internal;

import li.cil.oc.api.machine.MachineHost;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.entity.player.EntityPlayer;

public interface Tablet extends EnvironmentHost, MachineHost, Rotatable {
  EntityPlayer player();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Tablet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */