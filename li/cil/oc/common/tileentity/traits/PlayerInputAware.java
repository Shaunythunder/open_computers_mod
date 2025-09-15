package li.cil.oc.common.tileentity.traits;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0053q!\001\002\021\002G\005qB\001\tQY\006LXM]%oaV$\030i^1sK*\0211\001B\001\007iJ\f\027\016^:\013\005\0251\021A\003;jY\026,g\016^5us*\021q\001C\001\007G>lWn\0348\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001aE\002\001!a\001\"!\005\f\016\003IQ!a\005\013\002\t1\fgn\032\006\002+\005!!.\031<b\023\t9\"C\001\004PE*,7\r\036\t\0033\001j\021A\007\006\0037q\t\021\"\0338wK:$xN]=\013\005uq\022!C7j]\026\034'/\0314u\025\005y\022a\0018fi&\021\021E\007\002\013\023&sg/\0328u_JL\b\"B\022\001\r\003!\023AG8o'\026$\030J\034<f]R|'/_*m_R\034uN\034;f]R\034H\003B\023,ie\002\"AJ\025\016\003\035R\021\001K\001\006g\016\fG.Y\005\003U\035\022A!\0268ji\")AF\ta\001[\0051\001\017\\1zKJ\004\"A\f\032\016\003=R!\001\f\031\013\005Eb\022AB3oi&$\0300\003\0024_\taQI\034;jif\004F.Y=fe\")QG\ta\001m\005!1\017\\8u!\t1s'\003\0029O\t\031\021J\034;\t\013i\022\003\031A\036\002\013M$\030mY6\021\005qzT\"A\037\013\005yb\022\001B5uK6L!\001Q\037\003\023%#X-\\*uC\016\\\007")
public interface PlayerInputAware extends IInventory {
  void onSetInventorySlotContents(EntityPlayer paramEntityPlayer, int paramInt, ItemStack paramItemStack);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\PlayerInputAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */