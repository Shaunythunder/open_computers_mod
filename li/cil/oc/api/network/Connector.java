package li.cil.oc.api.network;

public interface Connector extends Node {
  double localBuffer();
  
  double localBufferSize();
  
  double globalBuffer();
  
  double globalBufferSize();
  
  double changeBuffer(double paramDouble);
  
  boolean tryChangeBuffer(double paramDouble);
  
  void setLocalBufferSize(double paramDouble);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\Connector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */