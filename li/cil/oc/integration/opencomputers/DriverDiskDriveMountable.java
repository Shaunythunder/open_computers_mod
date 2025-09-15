package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\t<Q!\001\002\t\0025\t\001\004\022:jm\026\024H)[:l\tJLg/Z'pk:$\030M\0317f\025\t\031A!A\007pa\026t7m\\7qkR,'o\035\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\0031\021\023\030N^3s\t&\0348\016\022:jm\026lu.\0368uC\ndWm\005\003\020%ii\002CA\n\031\033\005!\"BA\013\027\003\021a\027M\\4\013\003]\tAA[1wC&\021\021\004\006\002\007\037\nTWm\031;\021\0059Y\022B\001\017\003\005\021IE/Z7\021\005y)S\"A\020\013\005\001\n\023\001B5uK6T!AI\022\002\r\021\024\030N^3s\025\t!c!A\002ba&L!AJ\020\003\023!{7\017^!xCJ,\007\"\002\025\020\t\003I\023A\002\037j]&$h\bF\001\016\021\025Ys\002\"\021-\003%9xN]6t/&$\b\016\006\002.gA\021a&M\007\002_)\t\001'A\003tG\006d\027-\003\0023_\t9!i\\8mK\006t\007\"\002\033+\001\004)\024!B:uC\016\\\007C\001\034=\033\0059$B\001\0219\025\tI$(A\005nS:,7M]1gi*\t1(A\002oKRL!!P\034\003\023%#X-\\*uC\016\\\007\"B \020\t\003\002\025!E2sK\006$X-\0228wSJ|g.\\3oiR\031\021i\022%\021\005\t+U\"A\"\013\005\021\033\023a\0028fi^|'o[\005\003\r\016\023!#T1oC\036,G-\0228wSJ|g.\\3oi\")AG\020a\001k!)\021J\020a\001\025\006!\001n\\:u!\t\0215*\003\002M\007\nyQI\034<je>tW.\0328u\021>\034H\017C\003O\037\021\005s*\001\003tY>$HC\001)X!\t\tFK\004\002/%&\0211kL\001\007!J,G-\0324\n\005U3&AB*ue&twM\003\002T_!)A'\024a\001k!)\021l\004C!5\0069A-\031;b)\006<GCA.b!\tav,D\001^\025\tq\006(A\002oERL!\001Y/\003\0359\023E\013V1h\007>l\007o\\;oI\")A\007\027a\001k\001")
public final class DriverDiskDriveMountable {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverDiskDriveMountable$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverDiskDriveMountable$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverDiskDriveMountable$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverDiskDriveMountable$.MODULE$.dataTag(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverDiskDriveMountable$.MODULE$.slot(paramItemStack);
  }
  
  public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverDiskDriveMountable$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverDiskDriveMountable$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverDiskDriveMountable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */