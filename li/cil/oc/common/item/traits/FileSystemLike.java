package li.cil.oc.common.item.traits;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import scala.None$;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00154q!\001\002\021\002\007\005qB\001\bGS2,7+_:uK6d\025n[3\013\005\r!\021A\002;sC&$8O\003\002\006\r\005!\021\016^3n\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011c\001\001\021-A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032\004\"a\006\r\016\003\tI!!\007\002\003\021\021+G.Z4bi\026DQa\007\001\005\002q\ta\001J5oSR$C#A\017\021\005Eq\022BA\020\023\005\021)f.\033;\t\013\005\002A\021\013\022\002\027Q|w\016\034;ja:\013W.Z\013\002G9\021\021\003J\005\003KI\tAAT8oK\")q\005\001D\001Q\005I1.\0337p\005f$Xm]\013\002SA\021\021CK\005\003WI\0211!\0238u\021\025i\003\001\"\021/\0031!xn\0347uSBd\025N\\3t)\025irFO\"U\021\025\001D\0061\0012\003\025\031H/Y2l!\t\021\004(D\0014\025\t)AG\003\0026m\005IQ.\0338fGJ\fg\r\036\006\002o\005\031a.\032;\n\005e\032$!C%uK6\034F/Y2l\021\025YD\0061\001=\003\031\001H.Y=feB\021Q(Q\007\002})\0211h\020\006\003\001R\na!\0328uSRL\030B\001\"?\0051)e\016^5usBc\027-_3s\021\025!E\0061\001F\003\035!xn\0347uSB\0042AR&N\033\0059%B\001%J\003\021)H/\0337\013\003)\013AA[1wC&\021Aj\022\002\005\031&\034H\017\005\002O#:\021\021cT\005\003!J\ta\001\025:fI\0264\027B\001*T\005\031\031FO]5oO*\021\001K\005\005\006+2\002\rAV\001\tC\0224\030M\\2fIB\021\021cV\005\0031J\021qAQ8pY\026\fg\016C\003[\001\021\0053,\001\tp]&#X-\034*jO\"$8\t\\5dWR!\021\007X/e\021\025\001\024\f1\0012\021\025q\026\f1\001`\003\0259xN\0357e!\t\001'-D\001b\025\tqF'\003\002dC\n)qk\034:mI\")1(\027a\001y!Ya\r\001I\001\004\003\005I\021B4m\003I\031X\017]3sIQ|w\016\034;ja2Kg.Z:\025\013uA\027N[6\t\013A*\007\031A\031\t\013m*\007\031\001\037\t\013\021+\007\031A#\t\013U+\007\031\001,\n\0055B\002")
public interface FileSystemLike extends Delegate {
  None$ tooltipName();
  
  int kiloBytes();
  
  void tooltipLines(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, List<String> paramList, boolean paramBoolean);
  
  ItemStack onItemRightClick(ItemStack paramItemStack, World paramWorld, EntityPlayer paramEntityPlayer);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\FileSystemLike.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */