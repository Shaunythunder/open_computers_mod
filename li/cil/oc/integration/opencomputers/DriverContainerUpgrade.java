package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;
import scala.runtime.Null$;

@ScalaSignature(bytes = "\006\001\r<Q!\001\002\t\0025\ta\003\022:jm\026\0248i\0348uC&tWM]+qOJ\fG-\032\006\003\007\021\tQb\0349f]\016|W\016];uKJ\034(BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\fEe&4XM]\"p]R\f\027N\\3s+B<'/\0313f'\021y!CG\017\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"AD\016\n\005q\021!\001B%uK6\004\"AH\023\016\003}Q!\001I\021\002\t%$X-\034\006\003E\r\na\001\032:jm\026\024(B\001\023\007\003\r\t\007/[\005\003M}\021\021bQ8oi\006Lg.\032:\t\013!zA\021A\025\002\rqJg.\033;?)\005i\001\"B\026\020\t\003b\023!C<pe.\034x+\033;i)\ti3\007\005\002/c5\tqFC\0011\003\025\0318-\0317b\023\t\021tFA\004C_>dW-\0318\t\013QR\003\031A\033\002\013M$\030mY6\021\005YbT\"A\034\013\005\001B$BA\035;\003%i\027N\\3de\0064GOC\001<\003\rqW\r^\005\003{]\022\021\"\023;f[N#\030mY6\t\013}zA\021\t!\002#\r\024X-\031;f\013:4\030N]8o[\026tG\017F\002B\t\026\003\"A\f\"\n\005\r{#\001\002(vY2DQ\001\016 A\002UBQA\022 A\002\035\013A\001[8tiB\021\001jS\007\002\023*\021!jI\001\b]\026$xo\034:l\023\ta\025JA\bF]ZL'o\0348nK:$\bj\\:u\021\025qu\002\"\021P\003\021\031Hn\034;\025\005A\033\006CA\nR\023\t\021FC\001\004TiJLgn\032\005\006i5\003\r!\016\005\006+>!\tEV\001\raJ|g/\0333fINcw\016\036\013\003!^CQ\001\016+A\002UBQ!W\b\005Bi\013A\002\035:pm&$W\r\032+jKJ$\"a\0270\021\0059b\026BA/0\005\rIe\016\036\005\006ia\003\r!\016\005\006A>!\t%Y\001\005i&,'\017\006\002\\E\")Ag\030a\001k\001")
public final class DriverContainerUpgrade {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverContainerUpgrade$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverContainerUpgrade$.MODULE$.dataTag(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerUpgrade$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverContainerUpgrade$.MODULE$.tier(paramItemStack);
  }
  
  public static int providedTier(ItemStack paramItemStack) {
    return DriverContainerUpgrade$.MODULE$.providedTier(paramItemStack);
  }
  
  public static String providedSlot(ItemStack paramItemStack) {
    return DriverContainerUpgrade$.MODULE$.providedSlot(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverContainerUpgrade$.MODULE$.slot(paramItemStack);
  }
  
  public static Null$ createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverContainerUpgrade$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverContainerUpgrade$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverContainerUpgrade.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */