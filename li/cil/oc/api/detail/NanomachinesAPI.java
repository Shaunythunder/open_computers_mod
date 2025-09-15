package li.cil.oc.api.detail;

import li.cil.oc.api.nanomachines.BehaviorProvider;
import li.cil.oc.api.nanomachines.Controller;
import net.minecraft.entity.player.EntityPlayer;

public interface NanomachinesAPI {
  void addProvider(BehaviorProvider paramBehaviorProvider);
  
  Iterable<BehaviorProvider> getProviders();
  
  boolean hasController(EntityPlayer paramEntityPlayer);
  
  Controller getController(EntityPlayer paramEntityPlayer);
  
  Controller installController(EntityPlayer paramEntityPlayer);
  
  void uninstallController(EntityPlayer paramEntityPlayer);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\NanomachinesAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */