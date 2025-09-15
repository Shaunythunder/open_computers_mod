package li.cil.oc.integration.opencomputers;

import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;
import scala.runtime.Null$;

@ScalaSignature(bytes = "\006\001};Q!\001\002\t\0025\tQ\003\022:jm\026\0248i\0348uC&tWM\035$m_B\004\030P\003\002\004\t\005iq\016]3oG>l\007/\036;feNT!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"!\006#sSZ,'oQ8oi\006Lg.\032:GY>\004\b/_\n\005\037IQR\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tq1$\003\002\035\005\t!\021\n^3n!\tqR%D\001 \025\t\001\023%\001\003ji\026l'B\001\022$\003\031!'/\033<fe*\021AEB\001\004CBL\027B\001\024 \005%\031uN\034;bS:,'\017C\003)\037\021\005\021&\001\004=S:LGO\020\013\002\033!)1f\004C!Y\005Iqo\034:lg^KG\017\033\013\003[M\002\"AL\031\016\003=R\021\001M\001\006g\016\fG.Y\005\003e=\022qAQ8pY\026\fg\016C\0035U\001\007Q'A\003ti\006\0347\016\005\0027y5\tqG\003\002!q)\021\021HO\001\n[&tWm\031:bMRT\021aO\001\004]\026$\030BA\0378\005%IE/Z7Ti\006\0347\016C\003@\037\021\005\003)A\tde\026\fG/Z#om&\024xN\\7f]R$2!\021#F!\tq#)\003\002D_\t!a*\0367m\021\025!d\b1\0016\021\0251e\b1\001H\003\021Awn\035;\021\005![U\"A%\013\005)\033\023a\0028fi^|'o[\005\003\031&\023q\"\0228wSJ|g.\\3oi\"{7\017\036\005\006\035>!\teT\001\005g2|G\017\006\002Q'B\0211#U\005\003%R\021aa\025;sS:<\007\"\002\033N\001\004)\004\"B+\020\t\0032\026\001\0049s_ZLG-\0323TY>$HC\001)X\021\025!D\0131\0016\021\025Iv\002\"\021[\0031\001(o\034<jI\026$G+[3s)\tYf\f\005\002/9&\021Ql\f\002\004\023:$\b\"\002\033Y\001\004)\004")
public final class DriverContainerFloppy {
  public static boolean isDrone(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isDrone(paramClass);
  }
  
  public static boolean isMicrocontroller(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isMicrocontroller(paramClass);
  }
  
  public static boolean isTablet(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isTablet(paramClass);
  }
  
  public static boolean isServer(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isServer(paramClass);
  }
  
  public static boolean isRotatable(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isRotatable(paramClass);
  }
  
  public static boolean isRobot(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isRobot(paramClass);
  }
  
  public static boolean isComputer(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isComputer(paramClass);
  }
  
  public static boolean isAdapter(Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.isAdapter(paramClass);
  }
  
  public static boolean isOneOf(ItemStack paramItemStack, Seq<ItemInfo> paramSeq) {
    return DriverContainerFloppy$.MODULE$.isOneOf(paramItemStack, paramSeq);
  }
  
  public static NBTTagCompound dataTag(ItemStack paramItemStack) {
    return DriverContainerFloppy$.MODULE$.dataTag(paramItemStack);
  }
  
  public static int tier(ItemStack paramItemStack) {
    return DriverContainerFloppy$.MODULE$.tier(paramItemStack);
  }
  
  public static boolean worksWith(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass) {
    return DriverContainerFloppy$.MODULE$.worksWith(paramItemStack, paramClass);
  }
  
  public static int providedTier(ItemStack paramItemStack) {
    return DriverContainerFloppy$.MODULE$.providedTier(paramItemStack);
  }
  
  public static String providedSlot(ItemStack paramItemStack) {
    return DriverContainerFloppy$.MODULE$.providedSlot(paramItemStack);
  }
  
  public static String slot(ItemStack paramItemStack) {
    return DriverContainerFloppy$.MODULE$.slot(paramItemStack);
  }
  
  public static Null$ createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost) {
    return DriverContainerFloppy$.MODULE$.createEnvironment(paramItemStack, paramEnvironmentHost);
  }
  
  public static boolean worksWith(ItemStack paramItemStack) {
    return DriverContainerFloppy$.MODULE$.worksWith(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverContainerFloppy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */