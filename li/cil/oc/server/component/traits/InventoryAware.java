package li.cil.oc.server.component.traits;

import li.cil.oc.api.machine.Arguments;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import scala.Option;
import scala.collection.immutable.IndexedSeq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0314q!\001\002\021\002\007\005qB\001\bJ]Z,g\016^8ss\006;\030M]3\013\005\r!\021A\002;sC&$8O\003\002\006\r\005I1m\\7q_:,g\016\036\006\003\017!\taa]3sm\026\024(BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\021\001\001\005\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\t\013]\001A\021\001\r\002\r\021Jg.\033;%)\005I\002CA\t\033\023\tY\"C\001\003V]&$\b\"B\017\001\r\003q\022A\0034bW\026\004F.Y=feV\tq\004\005\002!S5\t\021E\003\002#G\0051\001\017\\1zKJT!\001J\023\002\r\025tG/\033;z\025\t1s%A\005nS:,7M]1gi*\t\001&A\002oKRL!AK\021\003\031\025sG/\033;z!2\f\0270\032:\t\0131\002a\021A\027\002\023%tg/\0328u_JLX#\001\030\021\005=\nT\"\001\031\013\0051*\023B\001\0321\005)I\025J\034<f]R|'/\037\005\006i\0011\t!N\001\rg\026dWm\031;fINcw\016^\013\002mA\021\021cN\005\003qI\0211!\0238u\021\025Q\004A\"\001<\003A\031X\r\\3di\026$7\013\\8u?\022*\027\017\006\002\032y!)Q(\017a\001m\005)a/\0317vK\")q\b\001C\001\001\006q\021N\\:feRLwN\\*m_R\034X#A!\021\007\t;e'D\001D\025\t!U)A\005j[6,H/\0312mK*\021aIE\001\013G>dG.Z2uS>t\027B\001%D\005)Ie\016Z3yK\022\034V-\035\005\006\025\002!\tbS\001\b_B$8\013\\8u)\r1DJ\026\005\006\033&\003\rAT\001\005CJ<7\017\005\002P)6\t\001K\003\002R%\0069Q.Y2iS:,'BA*\t\003\r\t\007/[\005\003+B\023\021\"\021:hk6,g\016^:\t\013]K\005\031\001\034\002\0039DQ!\027\001\005\022i\0131b\035;bG.Len\0257piR\0211\f\032\t\004#qs\026BA/\023\005\031y\005\017^5p]B\021qLY\007\002A*\021\021-J\001\005SR,W.\003\002dA\nI\021\n^3n'R\f7m\033\005\006Kb\003\rAN\001\005g2|G\017")
public interface InventoryAware {
  EntityPlayer fakePlayer();
  
  IInventory inventory();
  
  int selectedSlot();
  
  void selectedSlot_$eq(int paramInt);
  
  IndexedSeq<Object> insertionSlots();
  
  int optSlot(Arguments paramArguments, int paramInt);
  
  Option<ItemStack> stackInSlot(int paramInt);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */