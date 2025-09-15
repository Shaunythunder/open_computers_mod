package li.cil.oc.api.machine;

import li.cil.oc.api.Persistable;

public interface Value extends Persistable {
  Object apply(Context paramContext, Arguments paramArguments);
  
  void unapply(Context paramContext, Arguments paramArguments);
  
  Object[] call(Context paramContext, Arguments paramArguments);
  
  void dispose(Context paramContext);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\Value.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */