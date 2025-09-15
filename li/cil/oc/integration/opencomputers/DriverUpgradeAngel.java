package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001m;Q!\001\002\t\0025\t!\003\022:jm\026\024X\013]4sC\022,\027I\\4fY*\0211\001B\001\016_B,gnY8naV$XM]:\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005I!%/\033<feV\003xM]1eK\006sw-\0327\024\t=\021\"$\b\t\003'ai\021\001\006\006\003+Y\tA\001\\1oO*\tq#\001\003kCZ\f\027BA\r\025\005\031y%M[3diB\021abG\005\0039\t\021A!\023;f[B\021a$J\007\002?)\021\001%I\001\005SR,WN\003\002#G\0051AM]5wKJT!\001\n\004\002\007\005\004\030.\003\002'?\tI\001j\\:u\003^\f'/\032\005\006Q=!\t!K\001\007y%t\027\016\036 \025\0035AQaK\b\005B1\n\021b^8sWN<\026\016\0365\025\0055\032\004C\001\0302\033\005y#\"\001\031\002\013M\034\027\r\\1\n\005Iz#a\002\"p_2,\027M\034\005\006i)\002\r!N\001\006gR\f7m\033\t\003mqj\021a\016\006\003AaR!!\017\036\002\0235Lg.Z2sC\032$(\"A\036\002\0079,G/\003\002>o\tI\021\n^3n'R\f7m\033\005\006=!\t\005Q\001\022GJ,\027\r^3F]ZL'o\0348nK:$HcA!H\021B\021!)R\007\002\007*\021AiI\001\b]\026$xo\034:l\023\t15I\001\nNC:\fw-\0323F]ZL'o\0348nK:$\b\"\002\033?\001\004)\004\"B%?\001\004Q\025\001\0025pgR\004\"AQ&\n\0051\033%aD#om&\024xN\\7f]RDun\035;\t\0139{A\021I(\002\tMdw\016\036\013\003!N\003\"aE)\n\005I#\"AB*ue&tw\rC\0035\033\002\007Q\007C\003V\037\021\005c+\001\003uS\026\024HCA,[!\tq\003,\003\002Z_\t\031\021J\034;\t\013Q\"\006\031A\033")
public final class DriverUpgradeAngel {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverUpgradeAngel$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverUpgradeAngel$.MODULE$.dataTag(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeAngel$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverUpgradeAngel$.MODULE$.tier(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverUpgradeAngel$.MODULE$.slot(paramItemStack);
  }
  
  public static ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverUpgradeAngel$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverUpgradeAngel$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeAngel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */