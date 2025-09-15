package li.cil.oc.util;

import li.cil.oc.api.network.Node;
import li.cil.oc.server.component.UpgradeDatabase;
import scala.Function1;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001}:Q!\001\002\t\002-\ta\002R1uC\n\f7/Z!dG\026\0348O\003\002\004\t\005!Q\017^5m\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7\001\001\t\003\0315i\021A\001\004\006\035\tA\ta\004\002\017\t\006$\030MY1tK\006\0337-Z:t'\ti\001\003\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"C\001\004B]f\024VM\032\005\006/5!\t\001G\001\007y%t\027\016\036 \025\003-AQAG\007\005\002m\tAb^5uQ\022\013G/\0312bg\026$B\001H\020*eA\031\021#\b\t\n\005y\021\"!B!se\006L\b\"\002\021\032\001\004\t\023\001\0028pI\026\004\"AI\024\016\003\rR!\001J\023\002\0179,Go^8sW*\021a\005B\001\004CBL\027B\001\025$\005\021qu\016Z3\t\013)J\002\031A\026\002\017\005$GM]3tgB\021Af\f\b\003#5J!A\f\n\002\rA\023X\rZ3g\023\t\001\024G\001\004TiJLgn\032\006\003]IAQaM\rA\002Q\n\021A\032\t\005#U:D$\003\0027%\tIa)\0368di&|g.\r\t\003quj\021!\017\006\003um\n\021bY8na>tWM\034;\013\005q\"\021AB:feZ,'/\003\002?s\tyQ\013]4sC\022,G)\031;bE\006\034X\r")
public final class DatabaseAccess {
  public static Object[] withDatabase(Node paramNode, String paramString, Function1<UpgradeDatabase, Object[]> paramFunction1) {
    return DatabaseAccess$.MODULE$.withDatabase(paramNode, paramString, paramFunction1);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\DatabaseAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */