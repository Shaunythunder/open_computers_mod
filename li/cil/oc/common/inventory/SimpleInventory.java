package li.cil.oc.common.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00113q!\001\002\021\002\007\005QBA\bTS6\004H.Z%om\026tGo\034:z\025\t\031A!A\005j]Z,g\016^8ss*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/ui\021\001\007\006\003\007eQ!AG\016\002\0235Lg.Z2sC\032$(\"\001\017\002\0079,G/\003\002\0371\tQ\021*\0238wK:$xN]=\t\013\001\002A\021A\021\002\r\021Jg.\033;%)\005\021\003CA\022'\033\005!#\"A\023\002\013M\034\027\r\\1\n\005\035\"#\001B+oSRDQ!\013\001\005B)\na\003[1t\007V\034Ho\\7J]Z,g\016^8ss:\013W.\032\013\002WA\0211\005L\005\003[\021\022qAQ8pY\026\fg\016C\0030\001\021\005\003'\001\fhKRLeN^3oi>\024\030p\025;bG.d\025.\\5u)\005\t\004CA\0223\023\t\031DEA\002J]RDQ!\016\001\005\002Y\n\021dZ3u\023:4XM\034;pef\034F/Y2l%\026\fX/\033:fIV\t\021\007C\0039\001\021\005\023%A\007pa\026t\027J\034<f]R|'/\037\005\006u\001!\t%I\001\017G2|7/Z%om\026tGo\034:z\021\025a\004\001\"\021>\0035!Wm\031:Ti\006\0347nU5{KR\031a\b\022$\021\005}\022U\"\001!\013\005\005K\022\001B5uK6L!a\021!\003\023%#X-\\*uC\016\\\007\"B#<\001\004\t\024\001B:m_RDQaR\036A\002E\na!Y7pk:$\b\"B%\001\t\003R\025aF4fiN#\030mY6J]Ncw\016^(o\0072|7/\0338h)\tq4\nC\003F\021\002\007\021\007")
public interface SimpleInventory extends IInventory {
  boolean func_145818_k_();
  
  int func_70297_j_();
  
  int getInventoryStackRequired();
  
  void func_70295_k_();
  
  void func_70305_f();
  
  ItemStack func_70298_a(int paramInt1, int paramInt2);
  
  ItemStack func_70304_b(int paramInt);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\SimpleInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */