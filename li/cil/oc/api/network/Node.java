package li.cil.oc.api.network;

import li.cil.oc.api.Persistable;

public interface Node extends Persistable {
  Environment host();
  
  Visibility reachability();
  
  String address();
  
  Network network();
  
  boolean isNeighborOf(Node paramNode);
  
  boolean canBeReachedFrom(Node paramNode);
  
  Iterable<Node> neighbors();
  
  Iterable<Node> reachableNodes();
  
  void connect(Node paramNode);
  
  void disconnect(Node paramNode);
  
  void remove();
  
  void sendToAddress(String paramString1, String paramString2, Object... paramVarArgs);
  
  void sendToNeighbors(String paramString, Object... paramVarArgs);
  
  void sendToReachable(String paramString, Object... paramVarArgs);
  
  void sendToVisible(String paramString, Object... paramVarArgs);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\Node.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */