package li.cil.oc.api.machine;

import li.cil.oc.api.network.Node;

public interface Context {
  Node node();
  
  boolean canInteract(String paramString);
  
  boolean isRunning();
  
  boolean isPaused();
  
  boolean start();
  
  boolean pause(double paramDouble);
  
  boolean stop();
  
  void consumeCallBudget(double paramDouble);
  
  boolean signal(String paramString, Object... paramVarArgs);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\Context.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */