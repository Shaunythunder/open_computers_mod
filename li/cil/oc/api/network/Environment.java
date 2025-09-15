package li.cil.oc.api.network;

public interface Environment {
  Node node();
  
  void onConnect(Node paramNode);
  
  void onDisconnect(Node paramNode);
  
  void onMessage(Message paramMessage);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\Environment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */