package li.cil.oc.api.network;

public interface Network {
  boolean connect(Node paramNode1, Node paramNode2);
  
  boolean disconnect(Node paramNode1, Node paramNode2);
  
  boolean remove(Node paramNode);
  
  Node node(String paramString);
  
  Iterable<Node> nodes();
  
  Iterable<Node> nodes(Node paramNode);
  
  Iterable<Node> neighbors(Node paramNode);
  
  void sendToAddress(Node paramNode, String paramString1, String paramString2, Object... paramVarArgs);
  
  void sendToNeighbors(Node paramNode, String paramString, Object... paramVarArgs);
  
  void sendToReachable(Node paramNode, String paramString, Object... paramVarArgs);
  
  void sendToVisible(Node paramNode, String paramString, Object... paramVarArgs);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\Network.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */