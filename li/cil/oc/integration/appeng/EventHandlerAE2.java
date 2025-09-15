package li.cil.oc.integration.appeng;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\021;Q!\001\002\t\0025\tq\"\022<f]RD\025M\0343mKJ\fUI\r\006\003\007\021\ta!\0319qK:<'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021CA\bFm\026tG\017S1oI2,'/Q#3'\ty!\003\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\005\0063=!\tAG\001\007y%t\027\016\036 \025\0035AQ\001H\b\005\002u\t\021\"^:f/J,gn\0315\025\ry\tcfM\0338!\t\031r$\003\002!)\t9!i\\8mK\006t\007\"\002\022\034\001\004\031\023A\0029mCf,'\017\005\002%Y5\tQE\003\002#M)\021q\005K\001\007K:$\030\016^=\013\005%R\023!C7j]\026\034'/\0314u\025\005Y\023a\0018fi&\021Q&\n\002\r\013:$\030\016^=QY\006LXM\035\005\006_m\001\r\001M\001\002qB\0211#M\005\003eQ\0211!\0238u\021\025!4\0041\0011\003\005I\b\"\002\034\034\001\004\001\024!\001>\t\013aZ\002\031\001\020\002!\rD\027M\\4f\tV\024\030MY5mSRL\b\"\002\036\020\t\003Y\024\001C5t/J,gn\0315\025\005ya\004\"B\037:\001\004q\024!B:uC\016\\\007CA C\033\005\001%BA!)\003\021IG/Z7\n\005\r\003%!C%uK6\034F/Y2l\001")
public final class EventHandlerAE2 {
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerAE2$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerAE2$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\EventHandlerAE2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */