package li.cil.oc.integration.buildcraft.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\031;Q!\001\002\t\002=\ta#\022<f]RD\025M\0343mKJ\024U/\0337e\007J\fg\r\036\006\003\007\021\tQ\001^8pYNT!!\002\004\002\025\t,\030\016\0343de\0064GO\003\002\b\021\005Y\021N\034;fOJ\fG/[8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001\001\t\003!Ei\021A\001\004\006%\tA\ta\005\002\027\013Z,g\016\036%b]\022dWM\035\"vS2$7I]1giN\021\021\003\006\t\003+ai\021A\006\006\002/\005)1oY1mC&\021\021D\006\002\007\003:L(+\0324\t\013m\tB\021\001\017\002\rqJg.\033;?)\005y\001\"\002\020\022\t\003y\022!C;tK^\023XM\\2i)\031\0013\005M\0338sA\021Q#I\005\003EY\021qAQ8pY\026\fg\016C\003%;\001\007Q%\001\004qY\006LXM\035\t\003M9j\021a\n\006\003I!R!!\013\026\002\r\025tG/\033;z\025\tYC&A\005nS:,7M]1gi*\tQ&A\002oKRL!aL\024\003\031\025sG/\033;z!2\f\0270\032:\t\013Ej\002\031\001\032\002\003a\004\"!F\032\n\005Q2\"aA%oi\")a'\ba\001e\005\t\021\020C\0039;\001\007!'A\001{\021\025QT\0041\001!\003A\031\007.\0318hK\022+(/\0312jY&$\030\020C\003=#\021\005Q(\001\005jg^\023XM\\2i)\t\001c\bC\003@w\001\007\001)A\003ti\006\0347\016\005\002B\t6\t!I\003\002DU\005!\021\016^3n\023\t)%IA\005Ji\026l7\013^1dW\002")
public final class EventHandlerBuildCraft {
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerBuildCraft$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerBuildCraft$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\tools\EventHandlerBuildCraft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */