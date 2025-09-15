package li.cil.oc.api.nanomachines;

public interface Controller {
  Controller reconfigure();
  
  int getTotalInputCount();
  
  int getSafeActiveInputs();
  
  int getMaxActiveInputs();
  
  boolean getInput(int paramInt);
  
  boolean setInput(int paramInt, boolean paramBoolean);
  
  Iterable<Behavior> getActiveBehaviors();
  
  int getInputCount(Behavior paramBehavior);
  
  double getLocalBuffer();
  
  double getLocalBufferSize();
  
  double changeBuffer(double paramDouble);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\nanomachines\Controller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */