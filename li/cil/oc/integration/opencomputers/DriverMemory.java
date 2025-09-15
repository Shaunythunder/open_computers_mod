package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.server.component.Memory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0015<Q!\001\002\t\0025\tA\002\022:jm\026\024X*Z7pefT!a\001\003\002\033=\004XM\\2p[B,H/\032:t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\taAI]5wKJlU-\\8ssN)qB\005\016\036OA\0211\003G\007\002))\021QCF\001\005Y\006twMC\001\030\003\021Q\027M^1\n\005e!\"AB(cU\026\034G\017\005\002\0177%\021AD\001\002\005\023R,W\016\005\002\037K5\tqD\003\002!C\005!\021\016^3n\025\t\0213%\001\004ee&4XM\035\006\003I\031\t1!\0319j\023\t1sD\001\004NK6|'/\037\t\003=!J!!K\020\003\025\r\013G\016\034\"vI\036,G\017C\003,\037\021\005A&\001\004=S:LGO\020\013\002\033!)af\004C!_\0051\021-\\8v]R$\"\001\r\034\021\005E\"T\"\001\032\013\003M\nQa]2bY\006L!!\016\032\003\r\021{WO\0317f\021\0259T\0061\0019\003\025\031H/Y2l!\tIt(D\001;\025\t\0013H\003\002={\005IQ.\0338fGJ\fg\r\036\006\002}\005\031a.\032;\n\005\001S$!C%uK6\034F/Y2l\021\025\021u\002\"\021D\003%9xN]6t/&$\b\016\006\002E\017B\021\021'R\005\003\rJ\022qAQ8pY\026\fg\016C\0038\003\002\007\001\bC\003J\037\021\005#*A\tde\026\fG/Z#om&\024xN\\7f]R$2a\023*T!\ta\025+D\001N\025\tqu*A\005d_6\004xN\\3oi*\021\001KB\001\007g\026\024h/\032:\n\005\031j\005\"B\034I\001\004A\004\"\002+I\001\004)\026\001\0025pgR\004\"AV-\016\003]S!\001W\022\002\0179,Go^8sW&\021!l\026\002\020\013:4\030N]8o[\026tG\017S8ti\")Al\004C!;\006!1\017\\8u)\tq\026\r\005\002\024?&\021\001\r\006\002\007'R\024\030N\\4\t\013]Z\006\031\001\035\t\013\r|A\021\t3\002\tQLWM\035\013\003K\"\004\"!\r4\n\005\035\024$aA%oi\")qG\031a\001q!)!n\004C!W\006iq-\032;DC2d')\0363hKR$\"\001\r7\t\013]J\007\031\001\035")
public final class DriverMemory {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverMemory$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverMemory$.MODULE$.dataTag(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverMemory$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static double getCallBudget(ItemStack paramItemStack) {
    return DriverMemory$.MODULE$.getCallBudget(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverMemory$.MODULE$.tier(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverMemory$.MODULE$.slot(paramItemStack);
  }
  
  public static Memory createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverMemory$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverMemory$.MODULE$.worksWith(paramItemStack);
  }
  
  public static double amount(ItemStack paramItemStack) {
    return DriverMemory$.MODULE$.amount(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverMemory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */