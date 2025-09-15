package li.cil.oc.api.network;

import java.util.Collection;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;

public interface Component extends Node {
  String name();
  
  Visibility visibility();
  
  void setVisibility(Visibility paramVisibility);
  
  boolean canBeSeenFrom(Node paramNode);
  
  Collection<String> methods();
  
  Callback annotation(String paramString);
  
  Object[] invoke(String paramString, Context paramContext, Object... paramVarArgs) throws Exception;
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\Component.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */