package li.cil.oc.integration.mfr;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\021;Q!\001\002\t\0025\tq\"\022<f]RD\025M\0343mKJleI\025\006\003\007\021\t1!\0344s\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\tyQI^3oi\"\013g\016\0327fe63%k\005\002\020%A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\013qyA\021A\017\002\023U\034Xm\026:f]\016DGC\002\020\"]M*t\007\005\002\024?%\021\001\005\006\002\b\005>|G.Z1o\021\025\0213\0041\001$\003\031\001H.Y=feB\021A\005L\007\002K)\021!E\n\006\003O!\na!\0328uSRL(BA\025+\003%i\027N\\3de\0064GOC\001,\003\rqW\r^\005\003[\025\022A\"\0228uSRL\b\013\\1zKJDQaL\016A\002A\n\021\001\037\t\003'EJ!A\r\013\003\007%sG\017C\00357\001\007\001'A\001z\021\02514\0041\0011\003\005Q\b\"\002\035\034\001\004q\022\001E2iC:<W\rR;sC\nLG.\033;z\021\025Qt\002\"\001<\003!I7o\026:f]\016DGC\001\020=\021\025i\024\b1\001?\003\025\031H/Y2l!\ty$)D\001A\025\t\t\005&\001\003ji\026l\027BA\"A\005%IE/Z7Ti\006\0347\016")
public final class EventHandlerMFR {
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerMFR$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerMFR$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mfr\EventHandlerMFR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */