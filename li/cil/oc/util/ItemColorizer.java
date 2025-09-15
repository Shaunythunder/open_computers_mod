package li.cil.oc.util;

import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001}:Q!\001\002\t\002-\tQ\"\023;f[\016{Gn\034:ju\026\024(BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001\001\005\002\r\0335\t!AB\003\017\005!\005qBA\007Ji\026l7i\0347pe&TXM]\n\003\033A\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007\"B\f\016\t\003A\022A\002\037j]&$h\bF\001\f\021\025QR\002\"\001\034\003!A\027m]\"pY>\024HC\001\017 !\t\tR$\003\002\037%\t9!i\\8mK\006t\007\"\002\021\032\001\004\t\023!B:uC\016\\\007C\001\022*\033\005\031#B\001\023&\003\021IG/Z7\013\005\031:\023!C7j]\026\034'/\0314u\025\005A\023a\0018fi&\021!f\t\002\n\023R,Wn\025;bG.DQ\001L\007\005\0025\n\001bZ3u\007>dwN\035\013\003]E\002\"!E\030\n\005A\022\"aA%oi\")\001e\013a\001C!)1'\004C\001i\005Y!/Z7pm\026\034u\016\\8s)\t)\004\b\005\002\022m%\021qG\005\002\005+:LG\017C\003!e\001\007\021\005C\003;\033\021\0051(\001\005tKR\034u\016\\8s)\r)D(\020\005\006Ae\002\r!\t\005\006}e\002\rAL\001\006G>dwN\035")
public final class ItemColorizer {
  public static void setColor(ItemStack paramItemStack, int paramInt) {
    ItemColorizer$.MODULE$.setColor(paramItemStack, paramInt);
  }
  
  public static void removeColor(ItemStack paramItemStack) {
    ItemColorizer$.MODULE$.removeColor(paramItemStack);
  }
  
  public static int getColor(ItemStack paramItemStack) {
    return ItemColorizer$.MODULE$.getColor(paramItemStack);
  }
  
  public static boolean hasColor(ItemStack paramItemStack) {
    return ItemColorizer$.MODULE$.hasColor(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ItemColorizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */