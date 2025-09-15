package li.cil.oc.api.network;

import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Context;

public interface ManagedPeripheral {
  String[] methods();
  
  Object[] invoke(String paramString, Context paramContext, Arguments paramArguments) throws Exception;
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\ManagedPeripheral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */