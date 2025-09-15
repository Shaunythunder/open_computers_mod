package li.cil.oc.api.internal;

import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.util.Vec3;

public interface Drone extends Agent, EnvironmentHost, Rotatable, Tiered {
  Vec3 getTarget();
  
  void setTarget(Vec3 paramVec3);
  
  Vec3 getVelocity();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Drone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */