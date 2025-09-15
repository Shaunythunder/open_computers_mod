package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001a;Q!\001\002\t\0025\tA\003\022:jm\026\024H+\032:nS:\fGnU3sm\026\024(BA\002\005\0035y\007/\0328d_6\004X\017^3sg*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021A\003\022:jm\026\024H+\032:nS:\fGnU3sm\026\0248\003B\b\0235u\001\"a\005\r\016\003QQ!!\006\f\002\t1\fgn\032\006\002/\005!!.\031<b\023\tIBC\001\004PE*,7\r\036\t\003\035mI!\001\b\002\003\t%#X-\034\t\003=\025j\021a\b\006\003A\005\nA!\033;f[*\021!eI\001\007IJLg/\032:\013\005\0212\021aA1qS&\021ae\b\002\n\021>\034H/Q<be\026DQ\001K\b\005\002%\na\001P5oSRtD#A\007\t\013-zA\021\t\027\002\023]|'o[:XSRDGCA\0274!\tq\023'D\0010\025\005\001\024!B:dC2\f\027B\001\0320\005\035\021un\0347fC:DQ\001\016\026A\002U\nQa\035;bG.\004\"A\016\037\016\003]R!\001\t\035\013\005eR\024!C7j]\026\034'/\0314u\025\005Y\024a\0018fi&\021Qh\016\002\n\023R,Wn\025;bG.DQaP\b\005B\001\013\021c\031:fCR,WI\034<je>tW.\0328u)\r\tu\t\023\t\003\005\026k\021a\021\006\003\t\016\nqA\\3uo>\0248.\003\002G\007\n\021R*\0318bO\026$WI\034<je>tW.\0328u\021\025!d\b1\0016\021\025Ie\b1\001K\003\021Awn\035;\021\005\t[\025B\001'D\005=)eN^5s_:lWM\034;I_N$\b\"\002(\020\t\003z\025\001B:m_R$\"\001U,\021\005E#fB\001\030S\023\t\031v&\001\004Qe\026$WMZ\005\003+Z\023aa\025;sS:<'BA*0\021\025!T\n1\0016\001")
public final class DriverTerminalServer {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverTerminalServer$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverTerminalServer$.MODULE$.dataTag(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverTerminalServer$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverTerminalServer$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverTerminalServer$.MODULE$.slot(paramItemStack);
  }
  
  public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverTerminalServer$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverTerminalServer$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverTerminalServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */