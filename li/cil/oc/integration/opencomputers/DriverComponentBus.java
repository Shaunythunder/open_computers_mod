package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;
import scala.runtime.Null$;

@ScalaSignature(bytes = "\006\001\r<Q!\001\002\t\0025\t!\003\022:jm\026\0248i\\7q_:,g\016\036\"vg*\0211\001B\001\016_B,gnY8naV$XM]:\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005I!%/\033<fe\016{W\016]8oK:$()^:\024\t=\021\"$\b\t\003'ai\021\001\006\006\003+Y\tA\001\\1oO*\tq#\001\003kCZ\f\027BA\r\025\005\031y%M[3diB\021abG\005\0039\t\021A!\023;f[B\021a$J\007\002?)\021\001%I\001\005SR,WN\003\002#G\0051AM]5wKJT!\001\n\004\002\007\005\004\030.\003\002'?\tI\001K]8dKN\034xN\035\005\006Q=!\t!K\001\007y%t\027\016\036 \025\0035AQaK\b\005B1\n\021b^8sWN<\026\016\0365\025\0055\032\004C\001\0302\033\005y#\"\001\031\002\013M\034\027\r\\1\n\005Iz#a\002\"p_2,\027M\034\005\006i)\002\r!N\001\006gR\f7m\033\t\003mqj\021a\016\006\003AaR!!\017\036\002\0235Lg.Z2sC\032$(\"A\036\002\0079,G/\003\002>o\tI\021\n^3n'R\f7m\033\005\006=!\t\005Q\001\022GJ,\027\r^3F]ZL'o\0348nK:$HcA!E\013B\021aFQ\005\003\007>\022AAT;mY\")AG\020a\001k!)aI\020a\001\017\006!\001n\\:u!\tA5*D\001J\025\tQ5%A\004oKR<xN]6\n\0051K%aD#om&\024xN\\7f]RDun\035;\t\0139{A\021I(\002\tMdw\016\036\013\003!N\003\"aE)\n\005I#\"AB*ue&tw\rC\0035\033\002\007Q\007C\003V\037\021\005c+\001\003uS\026\024HCA,[!\tq\003,\003\002Z_\t\031\021J\034;\t\013Q\"\006\031A\033\t\013q{A\021I/\002'M,\b\017]8si\026$7i\\7q_:,g\016^:\025\005]s\006\"\002\033\\\001\004)\004\"\0021\020\t\003\n\027\001D1sG\"LG/Z2ukJ,GCA!c\021\025!t\f1\0016\001")
public final class DriverComponentBus {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverComponentBus$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverComponentBus$.MODULE$.dataTag(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverComponentBus$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static Null$ architecture(ItemStack paramItemStack) {
    return DriverComponentBus$.MODULE$.architecture(paramItemStack);
  }
  
  public static int supportedComponents(ItemStack paramItemStack) {
    return DriverComponentBus$.MODULE$.supportedComponents(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverComponentBus$.MODULE$.tier(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverComponentBus$.MODULE$.slot(paramItemStack);
  }
  
  public static Null$ createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverComponentBus$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverComponentBus$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverComponentBus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */