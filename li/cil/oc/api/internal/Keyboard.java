package li.cil.oc.api.internal;

import li.cil.oc.api.Persistable;
import li.cil.oc.api.network.Environment;
import net.minecraft.entity.player.EntityPlayer;

public interface Keyboard extends Environment, Persistable {
  void setUsableOverride(UsabilityChecker paramUsabilityChecker);
  
  public static interface UsabilityChecker {
    boolean isUsableByPlayer(Keyboard param1Keyboard, EntityPlayer param1EntityPlayer);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Keyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */