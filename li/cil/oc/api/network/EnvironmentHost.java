package li.cil.oc.api.network;

import net.minecraft.world.World;

public interface EnvironmentHost {
  World world();
  
  double xPosition();
  
  double yPosition();
  
  double zPosition();
  
  void markChanged();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\EnvironmentHost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */