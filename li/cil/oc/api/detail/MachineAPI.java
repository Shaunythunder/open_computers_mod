package li.cil.oc.api.detail;

import java.util.Collection;
import li.cil.oc.api.machine.Architecture;
import li.cil.oc.api.machine.Machine;
import li.cil.oc.api.machine.MachineHost;

public interface MachineAPI {
  void add(Class<? extends Architecture> paramClass);
  
  Collection<Class<? extends Architecture>> architectures();
  
  String getArchitectureName(Class<? extends Architecture> paramClass);
  
  Machine create(MachineHost paramMachineHost);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\MachineAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */