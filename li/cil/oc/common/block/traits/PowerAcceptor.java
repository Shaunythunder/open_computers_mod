package li.cil.oc.common.block.traits;

import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001}3q!\001\002\021\002\007\005qBA\007Q_^,'/Q2dKB$xN\035\006\003\007\021\ta\001\036:bSR\034(BA\003\007\003\025\021Gn\\2l\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\t\"#D\001\005\023\t\031BAA\006TS6\004H.\032\"m_\016\\\007\"B\013\001\t\0031\022A\002\023j]&$H\005F\001\030!\tA2$D\001\032\025\005Q\022!B:dC2\f\027B\001\017\032\005\021)f.\033;\t\013y\001a\021A\020\002!\025tWM]4z)\"\024x.^4iaV$X#\001\021\021\005a\t\023B\001\022\032\005\031!u.\0362mK\")A\005\001C)K\005YAo\\8mi&\004H+Y5m)\0319beK\034A#\")qe\ta\001Q\005AQ.\032;bI\006$\030\r\005\002\031S%\021!&\007\002\004\023:$\b\"\002\027$\001\004i\023!B:uC\016\\\007C\001\0306\033\005y#B\001\0312\003\021IG/Z7\013\005I\032\024!C7j]\026\034'/\0314u\025\005!\024a\0018fi&\021ag\f\002\n\023R,Wn\025;bG.DQ\001O\022A\002e\na\001\0357bs\026\024\bC\001\036?\033\005Y$B\001\035=\025\ti\024'\001\004f]RLG/_\005\003m\022A\"\0228uSRL\b\013\\1zKJDQ!Q\022A\002\t\013q\001^8pYRL\007\017E\002D\021*k\021\001\022\006\003\013\032\013A!\036;jY*\tq)\001\003kCZ\f\027BA%E\005\021a\025n\035;\021\005-seB\001\rM\023\ti\025$\001\004Qe\026$WMZ\005\003\037B\023aa\025;sS:<'BA'\032\021\025\0216\0051\001T\003!\tGM^1oG\026$\007C\001\rU\023\t)\026DA\004C_>dW-\0318\t\027]\003\001\023aA\001\002\023%\001LX\001\022gV\004XM\035\023u_>dG/\0339UC&dGCB\fZ5ncV\fC\003(-\002\007\001\006C\003--\002\007Q\006C\0039-\002\007\021\bC\003B-\002\007!\tC\003S-\002\0071+\003\002%%\001")
public interface PowerAcceptor {
  double energyThroughput();
  
  void tooltipTail(int paramInt, ItemStack paramItemStack, EntityPlayer paramEntityPlayer, List<String> paramList, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\PowerAcceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */