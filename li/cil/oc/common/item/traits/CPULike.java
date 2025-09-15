package li.cil.oc.common.item.traits;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00154q!\001\002\021\002\007\005qBA\004D!Vc\025n[3\013\005\r!\021A\002;sC&$8O\003\002\006\r\005!\021\016^3n\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011c\001\001\021-A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032\004\"a\006\r\016\003\tI!!\007\002\003\021\021+G.Z4bi\026DQa\007\001\005\002q\ta\001J5oSR$C#A\017\021\005Eq\022BA\020\023\005\021)f.\033;\t\013\005\002a\021\001\022\002\017\r\004X\017V5feV\t1\005\005\002\022I%\021QE\005\002\004\023:$\b\"B\024\001\r\003\021\023\001F2qkRKWM\035$pe\016{W\016]8oK:$8\017C\003*\001\021E#&A\006u_>dG/\0339ECR\fW#A\026\021\0071\"tG\004\002.e9\021a&M\007\002_)\021\001GD\001\007yI|w\016\036 \n\003MI!a\r\n\002\017A\f7m[1hK&\021QG\016\002\004'\026\f(BA\032\023!\t\t\002(\003\002:%\t\031\021I\\=\t\013m\002A\021\013\037\002\037Q|w\016\034;ja\026CH/\0328eK\022$2!H\037I\021\025q$\b1\001@\003\025\031H/Y2l!\t\001e)D\001B\025\t)!I\003\002D\t\006IQ.\0338fGJ\fg\r\036\006\002\013\006\031a.\032;\n\005\035\013%!C%uK6\034F/Y2l\021\025I%\b1\001K\003\035!xn\0347uSB\0042a\023)S\033\005a%BA'O\003\021)H/\0337\013\003=\013AA[1wC&\021\021\013\024\002\005\031&\034H\017\005\002T-:\021\021\003V\005\003+J\ta\001\025:fI\0264\027BA,Y\005\031\031FO]5oO*\021QK\005\005\0065\002!\teW\001\021_:LE/Z7SS\036DGo\0217jG.$Ba\020/^I\")a(\027a\001!)a,\027a\001?\006)qo\034:mIB\021\001MY\007\002C*\021aLQ\005\003G\006\024QaV8sY\022DQ!Z-A\002\031\fa\001\0357bs\026\024\bCA4l\033\005A'BA3j\025\tQ')\001\004f]RLG/_\005\003Y\"\024A\"\0228uSRL\b\013\\1zKJ\004")
public interface CPULike extends Delegate {
  int cpuTier();
  
  int cpuTierForComponents();
  
  Seq<Object> tooltipData();
  
  void tooltipExtended(ItemStack paramItemStack, List<String> paramList);
  
  ItemStack onItemRightClick(ItemStack paramItemStack, World paramWorld, EntityPlayer paramEntityPlayer);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\CPULike.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */