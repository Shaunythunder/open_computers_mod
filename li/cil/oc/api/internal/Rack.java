package li.cil.oc.api.internal;

import li.cil.oc.api.component.RackMountable;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.SidedEnvironment;
import net.minecraft.inventory.IInventory;
import net.minecraft.nbt.NBTTagCompound;

public interface Rack extends SidedEnvironment, EnvironmentHost, Rotatable, IInventory {
  int indexOfMountable(RackMountable paramRackMountable);
  
  RackMountable getMountable(int paramInt);
  
  NBTTagCompound getMountableData(int paramInt);
  
  void markChanged(int paramInt);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Rack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */