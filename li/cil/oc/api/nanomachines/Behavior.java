package li.cil.oc.api.nanomachines;

public interface Behavior {
  String getNameHint();
  
  void onEnable();
  
  void onDisable(DisableReason paramDisableReason);
  
  void update();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\nanomachines\Behavior.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */