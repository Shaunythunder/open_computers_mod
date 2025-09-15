package li.cil.oc.integration.cofh.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\025;Q!\001\002\t\002=\t\001#\022<f]RD\025M\0343mKJ\034uN\022%\013\005\r!\021\001B5uK6T!!\002\004\002\t\r|g\r\033\006\003\017!\t1\"\0338uK\036\024\030\r^5p]*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\021\005A\tR\"\001\002\007\013I\021\001\022A\n\003!\0253XM\034;IC:$G.\032:D_\032C5CA\t\025!\t)\002$D\001\027\025\0059\022!B:dC2\f\027BA\r\027\005\031\te.\037*fM\")1$\005C\0019\0051A(\0338jiz\"\022a\004\005\006=E!\taH\001\nkN,wK]3oG\"$b\001I\0221k]J\004CA\013\"\023\t\021cCA\004C_>dW-\0318\t\013\021j\002\031A\023\002\rAd\027-_3s!\t1c&D\001(\025\t!\003F\003\002*U\0051QM\034;jifT!a\013\027\002\0235Lg.Z2sC\032$(\"A\027\002\0079,G/\003\0020O\taQI\034;jif\004F.Y=fe\")\021'\ba\001e\005\t\001\020\005\002\026g%\021AG\006\002\004\023:$\b\"\002\034\036\001\004\021\024!A=\t\013aj\002\031\001\032\002\003iDQAO\017A\002\001\n\001c\0315b]\036,G)\036:bE&d\027\016^=\t\013q\nB\021A\037\002\021%\034xK]3oG\"$\"\001\t \t\013}Z\004\031\001!\002\013M$\030mY6\021\005\005\033U\"\001\"\013\005\rQ\023B\001#C\005%IE/Z7Ti\006\0347\016")
public final class EventHandlerCoFH {
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerCoFH$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerCoFH$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\item\EventHandlerCoFH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */