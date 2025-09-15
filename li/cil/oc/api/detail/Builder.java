package li.cil.oc.api.detail;

import li.cil.oc.api.network.Component;
import li.cil.oc.api.network.ComponentConnector;
import li.cil.oc.api.network.Connector;
import li.cil.oc.api.network.Node;
import li.cil.oc.api.network.Visibility;

public interface Builder<T extends Node> {
  T create();
  
  public static interface ComponentConnectorBuilder extends Builder<ComponentConnector> {}
  
  public static interface ConnectorBuilder extends Builder<Connector> {
    Builder.ComponentConnectorBuilder withComponent(String param1String, Visibility param1Visibility);
    
    Builder.ComponentConnectorBuilder withComponent(String param1String);
  }
  
  public static interface ComponentBuilder extends Builder<Component> {
    Builder.ComponentConnectorBuilder withConnector(double param1Double);
    
    Builder.ComponentConnectorBuilder withConnector();
  }
  
  public static interface NodeBuilder extends Builder<Node> {
    Builder.ComponentBuilder withComponent(String param1String, Visibility param1Visibility);
    
    Builder.ComponentBuilder withComponent(String param1String);
    
    Builder.ConnectorBuilder withConnector(double param1Double);
    
    Builder.ConnectorBuilder withConnector();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */