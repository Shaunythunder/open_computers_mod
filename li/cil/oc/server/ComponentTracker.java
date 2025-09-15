package li.cil.oc.server;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent;
import scala.Option;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0011:Q!\001\002\t\002-\t\001cQ8na>tWM\034;Ue\006\0347.\032:\013\005\r!\021AB:feZ,'O\003\002\006\r\005\021qn\031\006\003\017!\t1aY5m\025\005I\021A\0017j\007\001\001\"\001D\007\016\003\t1QA\004\002\t\002=\021\001cQ8na>tWM\034;Ue\006\0347.\032:\024\0055\001\002CA\t\025\033\005\021\"BA\n\005\003\031\031w.\\7p]&\021aB\005\005\006-5!\taF\001\007y%t\027\016\036 \025\003-AQ!G\007\005Ri\tQa\0317fCJ$\"aG\021\021\005qyR\"A\017\013\003y\tQa]2bY\006L!\001I\017\003\tUs\027\016\036\005\006Ea\001\raI\001\006o>\024H\016\032\t\003I)j\021!\n\006\003E\031R!a\n\025\002\0235Lg.Z2sC\032$(\"A\025\002\0079,G/\003\002,K\t)qk\034:mI\002")
public final class ComponentTracker {
  @SubscribeEvent
  public static void onWorldUnload(WorldEvent.Unload paramUnload) {
    ComponentTracker$.MODULE$.onWorldUnload(paramUnload);
  }
  
  public static Option<ManagedEnvironment> get(World paramWorld, String paramString) {
    return ComponentTracker$.MODULE$.get(paramWorld, paramString);
  }
  
  public static void remove(World paramWorld, ManagedEnvironment paramManagedEnvironment) {
    ComponentTracker$.MODULE$.remove(paramWorld, paramManagedEnvironment);
  }
  
  public static void add(World paramWorld, String paramString, ManagedEnvironment paramManagedEnvironment) {
    ComponentTracker$.MODULE$.add(paramWorld, paramString, paramManagedEnvironment);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\ComponentTracker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */