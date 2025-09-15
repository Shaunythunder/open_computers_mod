package li.cil.oc.integration.railcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\021;Q!\001\002\t\0025\tQ#\022<f]RD\025M\0343mKJ\024\026-\0337de\0064GO\003\002\004\t\005I!/Y5mGJ\fg\r\036\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003+\0253XM\034;IC:$G.\032:SC&d7M]1giN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001\"\002\017\020\t\003i\022!C;tK^\023XM\\2i)\031q\022EL\0326oA\0211cH\005\003AQ\021qAQ8pY\026\fg\016C\003#7\001\0071%\001\004qY\006LXM\035\t\003I1j\021!\n\006\003E\031R!a\n\025\002\r\025tG/\033;z\025\tI#&A\005nS:,7M]1gi*\t1&A\002oKRL!!L\023\003\031\025sG/\033;z!2\f\0270\032:\t\013=Z\002\031\001\031\002\003a\004\"aE\031\n\005I\"\"aA%oi\")Ag\007a\001a\005\t\021\020C\00377\001\007\001'A\001{\021\025A4\0041\001\037\003A\031\007.\0318hK\022+(/\0312jY&$\030\020C\003;\037\021\0051(\001\005jg^\023XM\\2i)\tqB\bC\003>s\001\007a(A\003ti\006\0347\016\005\002@\0056\t\001I\003\002BQ\005!\021\016^3n\023\t\031\005IA\005Ji\026l7\013^1dW\002")
public final class EventHandlerRailcraft {
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerRailcraft$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerRailcraft$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\railcraft\EventHandlerRailcraft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */