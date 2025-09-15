package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;
import scala.runtime.Null$;

@ScalaSignature(bytes = "\006\001y;Q!\001\002\t\0025\ta\003\022:jm\026\024X\013]4sC\022,\027J\034<f]R|'/\037\006\003\007\021\tQb\0349f]\016|W\016];uKJ\034(BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\fEe&4XM]+qOJ\fG-Z%om\026tGo\034:z'\025y!CG\017(!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bC\001\b\034\023\ta\"A\001\003Ji\026l\007C\001\020&\033\005y\"B\001\021\"\003\021IG/Z7\013\005\t\032\023A\0023sSZ,'O\003\002%\r\005\031\021\r]5\n\005\031z\"!C%om\026tGo\034:z!\tq\002&\003\002*?\tI\001j\\:u\003^\f'/\032\005\006W=!\t\001L\001\007y%t\027\016\036 \025\0035AQAL\b\005B=\n\021b^8sWN<\026\016\0365\025\005A2\004CA\0315\033\005\021$\"A\032\002\013M\034\027\r\\1\n\005U\022$a\002\"p_2,\027M\034\005\006o5\002\r\001O\001\006gR\f7m\033\t\003s}j\021A\017\006\003AmR!\001P\037\002\0235Lg.Z2sC\032$(\"\001 \002\0079,G/\003\002Au\tI\021\n^3n'R\f7m\033\005\006\005>!\teQ\001\022GJ,\027\r^3F]ZL'o\0348nK:$Hc\001#H\021B\021\021'R\005\003\rJ\022AAT;mY\")q'\021a\001q!)\021*\021a\001\025\006!\001n\\:u!\tYe*D\001M\025\ti5%A\004oKR<xN]6\n\005=c%aD#om&\024xN\\7f]RDun\035;\t\013E{A\021\t*\002\tMdw\016\036\013\003'Z\003\"a\005+\n\005U#\"AB*ue&tw\rC\0038!\002\007\001\bC\003Y\037\021\005\023,A\tj]Z,g\016^8ss\016\013\007/Y2jif$\"AW/\021\005EZ\026B\001/3\005\rIe\016\036\005\006o]\003\r\001\017")
public final class DriverUpgradeInventory {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverUpgradeInventory$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverUpgradeInventory$.MODULE$.dataTag(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverUpgradeInventory$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverUpgradeInventory$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static int inventoryCapacity(ItemStack paramItemStack) {
    return DriverUpgradeInventory$.MODULE$.inventoryCapacity(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverUpgradeInventory$.MODULE$.slot(paramItemStack);
  }
  
  public static Null$ createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverUpgradeInventory$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverUpgradeInventory$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverUpgradeInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */