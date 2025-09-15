package li.cil.oc.api.component;

import li.cil.oc.api.network.ManagedEnvironment;
import li.cil.oc.api.util.StateAware;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public interface RackMountable extends ManagedEnvironment, StateAware {
  NBTTagCompound getData();
  
  int getConnectableCount();
  
  RackBusConnectable getConnectableAt(int paramInt);
  
  boolean onActivate(EntityPlayer paramEntityPlayer, float paramFloat1, float paramFloat2);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\component\RackMountable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */