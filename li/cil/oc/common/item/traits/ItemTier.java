package li.cil.oc.common.item.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00114\001\"\001\002\021\002\007\005q\002\033\002\t\023R,W\016V5fe*\0211\001B\001\007iJ\f\027\016^:\013\005\0251\021\001B5uK6T!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\004\001A1\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\r\005\002\03015\t!!\003\002\032\005\tAA)\0327fO\006$X\rC\003\034\001\021\005A$\001\004%S:LG\017\n\013\002;A\021\021CH\005\003?I\021A!\0268ji\")\021\005\001C!E\005aAo\\8mi&\004H*\0338fgR)Qd\t\0308\021\")A\005\ta\001K\005)1\017^1dWB\021a\005L\007\002O)\021Q\001\013\006\003S)\n\021\"\\5oK\016\024\030M\032;\013\003-\n1A\\3u\023\tisEA\005Ji\026l7\013^1dW\")q\006\ta\001a\0051\001\017\\1zKJ\004\"!M\033\016\003IR!aL\032\013\005QB\023AB3oi&$\0300\003\0027e\taQI\034;jif\004F.Y=fe\")\001\b\ta\001s\0059Ao\\8mi&\004\bc\001\036@\0036\t1H\003\002={\005!Q\017^5m\025\005q\024\001\0026bm\006L!\001Q\036\003\t1K7\017\036\t\003\005\026s!!E\"\n\005\021\023\022A\002)sK\022,g-\003\002G\017\n11\013\036:j]\036T!\001\022\n\t\013%\003\003\031\001&\002\021\005$g/\0318dK\022\004\"!E&\n\0051\023\"a\002\"p_2,\027M\034\025\005A9S6\f\005\002P16\t\001K\003\002R%\006Q!/\0327bk:\034\007.\032:\013\005M#\026a\0014nY*\021QKV\001\005[>$7OC\001X\003\r\031\007o^\005\0033B\023\001bU5eK>sG._\001\006m\006dW/\032\023\0029&\021QLX\001\007\0072KUI\024+\013\005}\003\026\001B*jI\026D1\"\031\001\021\002\007\005\t\021\"\003cO\006\0212/\0369fe\022\"xn\0347uSBd\025N\\3t)\025i2\rZ3g\021\025!\003\r1\001&\021\025y\003\r1\0011\021\025A\004\r1\001:\021\025I\005\r1\001K\023\t\t\003DE\002jWZ1AA\033\001\001Q\naAH]3gS:,W.\0328u}A\021q\003\001")
public interface ItemTier extends Delegate {
  @SideOnly(Side.CLIENT)
  void tooltipLines(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, List<String> paramList, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\ItemTier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */