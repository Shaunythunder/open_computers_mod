package li.cil.oc.integration.ic2;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001i<Q!\001\002\t\0025\t1#\0227fGR\024\030nY%uK6l\025M\\1hKJT!a\001\003\002\007%\034'G\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\024\0132,7\r\036:jG&#X-\\'b]\006<WM]\n\004\037IQ\002CA\n\031\033\005!\"BA\013\027\003\021a\027M\\4\013\003]\tAA[1wC&\021\021\004\006\002\007\037\nTWm\031;\021\005m\tS\"\001\017\013\005uq\022\001B5uK6T!a\b\021\002\007\005\004\030NC\001\004\023\t\021CD\001\013J\0132,7\r\036:jG&#X-\\'b]\006<WM\035\005\006I=!\t!J\001\007y%t\027\016\036 \025\0035AQaJ\b\005B!\n\021bZ3u\007\"\f'oZ3\025\005%z\003C\001\026.\033\005Y#\"\001\027\002\013M\034\027\r\\1\n\0059Z#A\002#pk\ndW\rC\0031M\001\007\021'A\003ti\006\0347\016\005\0023q5\t1G\003\002\036i)\021QGN\001\n[&tWm\031:bMRT\021aN\001\004]\026$\030BA\0354\005%IE/Z7Ti\006\0347\016C\003<\037\021\005C(\001\004dQ\006\024x-\032\013\007Sur\004)\022&\t\013AR\004\031A\031\t\013}R\004\031A\025\002\r\005lw.\0368u\021\025\t%\b1\001C\003\021!\030.\032:\021\005)\032\025B\001#,\005\rIe\016\036\005\006\rj\002\raR\001\024S\036twN]3Ue\006t7OZ3s\031&l\027\016\036\t\003U!K!!S\026\003\017\t{w\016\\3b]\")1J\017a\001\017\006A1/[7vY\006$X\rC\003N\037\021\005c*A\005eSN\034\007.\031:hKR9\021f\024)R%N+\006\"\002\031M\001\004\t\004\"B M\001\004I\003\"B!M\001\004\021\005\"\002$M\001\0049\005\"\002+M\001\0049\025AC3yi\026\024h.\0317ms\")1\n\024a\001\017\")qk\004C!1\006y1\r[1sO\0264%o\\7Be6|'\017F\002Z9v\003\"A\013.\n\005m[#\001B+oSRDQ\001\r,A\002EBQA\030,A\002}\013a!\0328uSRL\bC\0011c\033\005\t'B\00105\023\t\031\027M\001\tF]RLG/\037'jm&twMQ1tK\")Qm\004C!M\00611-\0318Vg\026$2aR4i\021\025\001D\r1\0012\021\025yD\r1\001*\021\025Qw\002\"\021l\003\r)8/\032\013\005\0172lg\016C\0031S\002\007\021\007C\003@S\002\007\021\006C\003_S\002\007q\fC\003q\037\021\005\023/\001\006hKR$vn\0347USB$\"A]=\021\005M4hB\001\026u\023\t)8&\001\004Qe\026$WMZ\005\003ob\024aa\025;sS:<'BA;,\021\025\001t\0161\0012\001")
public final class ElectricItemManager {
  public static String getToolTip(ItemStack paramItemStack) {
    return ElectricItemManager$.MODULE$.getToolTip(paramItemStack);
  }
  
  public static boolean use(ItemStack paramItemStack, double paramDouble, EntityLivingBase paramEntityLivingBase) {
    return ElectricItemManager$.MODULE$.use(paramItemStack, paramDouble, paramEntityLivingBase);
  }
  
  public static boolean canUse(ItemStack paramItemStack, double paramDouble) {
    return ElectricItemManager$.MODULE$.canUse(paramItemStack, paramDouble);
  }
  
  public static void chargeFromArmor(ItemStack paramItemStack, EntityLivingBase paramEntityLivingBase) {
    ElectricItemManager$.MODULE$.chargeFromArmor(paramItemStack, paramEntityLivingBase);
  }
  
  public static double discharge(ItemStack paramItemStack, double paramDouble, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    return ElectricItemManager$.MODULE$.discharge(paramItemStack, paramDouble, paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public static double charge(ItemStack paramItemStack, double paramDouble, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    return ElectricItemManager$.MODULE$.charge(paramItemStack, paramDouble, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public static double getCharge(ItemStack paramItemStack) {
    return ElectricItemManager$.MODULE$.getCharge(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\ElectricItemManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */