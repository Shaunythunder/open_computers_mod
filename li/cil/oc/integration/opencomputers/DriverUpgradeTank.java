package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001Q;Q!\001\002\t\0025\t\021\003\022:jm\026\024X\013]4sC\022,G+\0318l\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003#\021\023\030N^3s+B<'/\0313f)\006t7n\005\003\020%ii\002CA\n\031\033\005!\"BA\013\027\003\021a\027M\\4\013\003]\tAA[1wC&\021\021\004\006\002\007\037\nTWm\031;\021\0059Y\022B\001\017\003\005\021IE/Z7\021\005y)S\"A\020\013\005\001\n\023\001B5uK6T!AI\022\002\r\021\024\030N^3s\025\t!c!A\002ba&L!AJ\020\003\023!{7\017^!xCJ,\007\"\002\025\020\t\003I\023A\002\037j]&$h\bF\001\016\021\025Ys\002\"\021-\003%9xN]6t/&$\b\016\006\002.gA\021a&M\007\002_)\t\001'A\003tG\006d\027-\003\0023_\t9!i\\8mK\006t\007\"\002\033+\001\004)\024!B:uC\016\\\007C\001\034=\033\0059$B\001\0219\025\tI$(A\005nS:,7M]1gi*\t1(A\002oKRL!!P\034\003\023%#X-\\*uC\016\\\007\"B \020\t\003\002\025!E2sK\006$X-\0228wSJ|g.\\3oiR\031\021i\022%\021\005\t+U\"A\"\013\005\021\033\023a\0028fi^|'o[\005\003\r\016\023!#T1oC\036,G-\0228wSJ|g.\\3oi\")AG\020a\001k!)\021J\020a\001\025\006!\001n\\:u!\t\0215*\003\002M\007\nyQI\034<je>tW.\0328u\021>\034H\017C\003O\037\021\005s*\001\003tY>$HC\001)T!\t\031\022+\003\002S)\t11\013\036:j]\036DQ\001N'A\002U\002")
public final class DriverUpgradeTank {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverUpgradeTank$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverUpgradeTank$.MODULE$.dataTag(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverUpgradeTank$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeTank$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverUpgradeTank$.MODULE$.slot(paramItemStack);
  }
  
  public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverUpgradeTank$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverUpgradeTank$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeTank.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */