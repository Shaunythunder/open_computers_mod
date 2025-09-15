package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.server.component.Keyboard;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001e;Q!\001\002\t\0025\ta\002\022:jm\026\0248*Z=c_\006\024HM\003\002\004\t\005iq\016]3oG>l\007/\036;feNT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"A\004#sSZ,'oS3zE>\f'\017Z\n\005\037IQR\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tq1$\003\002\035\005\t!\021\n^3n!\tqR%D\001 \025\t\001\023%\001\003ji\026l'B\001\022$\003\031!'/\033<fe*\021AEB\001\004CBL\027B\001\024 \005%Aun\035;Bo\006\024X\rC\003)\037\021\005\021&\001\004=S:LGO\020\013\002\033!)1f\004C!Y\005Iqo\034:lg^KG\017\033\013\003[M\002\"AL\031\016\003=R\021\001M\001\006g\016\fG.Y\005\003e=\022qAQ8pY\026\fg\016C\0035U\001\007Q'A\003ti\006\0347\016\005\0027y5\tqG\003\002!q)\021\021HO\001\n[&tWm\031:bMRT\021aO\001\004]\026$\030BA\0378\005%IE/Z7Ti\006\0347\016C\003@\037\021\005\003)A\tde\026\fG/Z#om&\024xN\\7f]R$2!Q%K!\t\021u)D\001D\025\t!U)A\005d_6\004xN\\3oi*\021aIB\001\007g\026\024h/\032:\n\005!\033%\001C&fs\n|\027M\0353\t\013Qr\004\031A\033\t\013-s\004\031\001'\002\t!|7\017\036\t\003\033Bk\021A\024\006\003\037\016\nqA\\3uo>\0248.\003\002R\035\nyQI\034<je>tW.\0328u\021>\034H\017C\003T\037\021\005C+\001\003tY>$HCA+Y!\t\031b+\003\002X)\t11\013\036:j]\036DQ\001\016*A\002U\002")
public final class DriverKeyboard {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverKeyboard$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverKeyboard$.MODULE$.dataTag(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverKeyboard$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverKeyboard$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverKeyboard$.MODULE$.slot(paramItemStack);
  }
  
  public static Keyboard createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverKeyboard$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverKeyboard$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverKeyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */