package li.cil.oc.server.component.traits;

import li.cil.oc.api.network.Node;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0052q!\001\002\021\002G\005qB\001\007OKR<xN]6Bo\006\024XM\003\002\004\t\0051AO]1jiNT!!\002\004\002\023\r|W\016]8oK:$(BA\004\t\003\031\031XM\035<fe*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\001\031\005\001$\001\003o_\022,W#A\r\021\005iyR\"A\016\013\005qi\022a\0028fi^|'o\033\006\003=!\t1!\0319j\023\t\0013D\001\003O_\022,\007")
public interface NetworkAware {
  Node node();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\NetworkAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */