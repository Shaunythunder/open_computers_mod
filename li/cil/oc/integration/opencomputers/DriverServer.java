package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\t<Q!\001\002\t\0025\tA\002\022:jm\026\0248+\032:wKJT!a\001\003\002\033=\004XM\\2p[B,H/\032:t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\taAI]5wKJ\034VM\035<feN!qB\005\016\036!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bC\001\b\034\023\ta\"A\001\003Ji\026l\007C\001\020&\033\005y\"B\001\021\"\003\021IG/Z7\013\005\t\032\023A\0023sSZ,'O\003\002%\r\005\031\021\r]5\n\005\031z\"!\003%pgR\fu/\031:f\021\025As\002\"\001*\003\031a\024N\\5u}Q\tQ\002C\003,\037\021\005C&A\005x_J\\7oV5uQR\021Qf\r\t\003]Ej\021a\f\006\002a\005)1oY1mC&\021!g\f\002\b\005>|G.Z1o\021\025!$\0061\0016\003\025\031H/Y2l!\t1D(D\0018\025\t\001\003H\003\002:u\005IQ.\0338fGJ\fg\r\036\006\002w\005\031a.\032;\n\005u:$!C%uK6\034F/Y2l\021\025yt\002\"\021A\003E\031'/Z1uK\026sg/\033:p]6,g\016\036\013\004\003\036C\005C\001\"F\033\005\031%B\001#$\003\035qW\r^<pe.L!AR\"\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\006iy\002\r!\016\005\006\023z\002\rAS\001\005Q>\034H\017\005\002C\027&\021Aj\021\002\020\013:4\030N]8o[\026tG\017S8ti\")aj\004C!\037\006!1\017\\8u)\t\001v\013\005\002R):\021aFU\005\003'>\na\001\025:fI\0264\027BA+W\005\031\031FO]5oO*\0211k\f\005\006i5\003\r!\016\005\0063>!\tEW\001\bI\006$\030\rV1h)\tY\026\r\005\002]?6\tQL\003\002_q\005\031aN\031;\n\005\001l&A\004(C)R\013wmQ8na>,h\016\032\005\006ia\003\r!\016")
public final class DriverServer {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverServer$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverServer$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverServer$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverServer$.MODULE$.dataTag(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverServer$.MODULE$.slot(paramItemStack);
  }
  
  public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverServer$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverServer$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */