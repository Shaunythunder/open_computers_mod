package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;
import scala.runtime.Null$;

@ScalaSignature(bytes = "\006\001\r<Q!\001\002\t\0025\t1\003\022:jm\026\0248i\0348uC&tWM]\"be\022T!a\001\003\002\033=\004XM\\2p[B,H/\032:t\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t\031BI]5wKJ\034uN\034;bS:,'oQ1sIN!qB\005\016\036!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bC\001\b\034\023\ta\"A\001\003Ji\026l\007C\001\020&\033\005y\"B\001\021\"\003\021IG/Z7\013\005\t\032\023A\0023sSZ,'O\003\002%\r\005\031\021\r]5\n\005\031z\"!C\"p]R\f\027N\\3s\021\025As\002\"\001*\003\031a\024N\\5u}Q\tQ\002C\003,\037\021\005C&A\005x_J\\7oV5uQR\021Qf\r\t\003]Ej\021a\f\006\002a\005)1oY1mC&\021!g\f\002\b\005>|G.Z1o\021\025!$\0061\0016\003\025\031H/Y2l!\t1D(D\0018\025\t\001\003H\003\002:u\005IQ.\0338fGJ\fg\r\036\006\002w\005\031a.\032;\n\005u:$!C%uK6\034F/Y2l\021\025yt\002\"\021A\003E\031'/Z1uK\026sg/\033:p]6,g\016\036\013\004\003\022+\005C\001\030C\023\t\031uF\001\003Ok2d\007\"\002\033?\001\004)\004\"\002$?\001\0049\025\001\0025pgR\004\"\001S&\016\003%S!AS\022\002\0179,Go^8sW&\021A*\023\002\020\013:4\030N]8o[\026tG\017S8ti\")aj\004C!\037\006!1\017\\8u)\t\0016\013\005\002\024#&\021!\013\006\002\007'R\024\030N\\4\t\013Qj\005\031A\033\t\013U{A\021\t,\002\031A\024xN^5eK\022\034Fn\034;\025\005A;\006\"\002\033U\001\004)\004\"B-\020\t\003R\026\001\0049s_ZLG-\0323US\026\024HCA._!\tqC,\003\002^_\t\031\021J\034;\t\013QB\006\031A\033\t\013\001|A\021I1\002\tQLWM\035\013\0037\nDQ\001N0A\002U\002")
public final class DriverContainerCard {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverContainerCard$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverContainerCard$.MODULE$.dataTag(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerCard$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverContainerCard$.MODULE$.tier(paramItemStack);
  }
  
  public static int providedTier(ItemStack paramItemStack) {
    return DriverContainerCard$.MODULE$.providedTier(paramItemStack);
  }
  
  public static String providedSlot(ItemStack paramItemStack) {
    return DriverContainerCard$.MODULE$.providedSlot(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverContainerCard$.MODULE$.slot(paramItemStack);
  }
  
  public static Null$ createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverContainerCard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverContainerCard$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverContainerCard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */