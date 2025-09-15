package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0015;Q!\001\002\t\0025\ta\002\022:jm\026\024Hj\\8u\t&\0348N\003\002\004\t\005iq\016]3oG>l\007/\036;feNT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"A\004#sSZ,'\017T8pi\022K7o[\n\004\037IQ\002CA\n\031\033\005!\"BA\013\027\003\021a\027M\\4\013\003]\tAA[1wC&\021\021\004\006\002\007\037\nTWm\031;\021\0059Y\022B\001\017\003\005\021IE/Z7\t\013yyA\021A\020\002\rqJg.\033;?)\005i\001\"B\021\020\t\003\022\023!C<pe.\034x+\033;i)\t\031\023\006\005\002%O5\tQEC\001'\003\025\0318-\0317b\023\tASEA\004C_>dW-\0318\t\013)\002\003\031A\026\002\013M$\030mY6\021\0051\032T\"A\027\013\0059z\023\001B5uK6T!\001M\031\002\0235Lg.Z2sC\032$(\"\001\032\002\0079,G/\003\0025[\tI\021\n^3n'R\f7m\033\005\006m=!\teN\001\022GJ,\027\r^3F]ZL'o\0348nK:$Hc\001\035A\003B\021\021HP\007\002u)\0211\bP\001\b]\026$xo\034:l\025\tid!A\002ba&L!a\020\036\003%5\013g.Y4fI\026sg/\033:p]6,g\016\036\005\006UU\002\ra\013\005\006\005V\002\raQ\001\005Q>\034H\017\005\002:\t&\021QI\017\002\020\013:4\030N]8o[\026tG\017S8ti\")qi\004C!\021\006!1\017\\8u)\tIE\n\005\002\024\025&\0211\n\006\002\007'R\024\030N\\4\t\013)2\005\031A\026")
public final class DriverLootDisk {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverLootDisk$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverLootDisk$.MODULE$.dataTag(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverLootDisk$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverLootDisk$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverLootDisk$.MODULE$.slot(paramItemStack);
  }
  
  public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverLootDisk$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverLootDisk$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverLootDisk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */