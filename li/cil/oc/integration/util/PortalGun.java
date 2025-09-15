package li.cil.oc.integration.util;

import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001);Q!\001\002\t\0025\t\021\002U8si\006dw)\0368\013\005\r!\021\001B;uS2T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"!\003)peR\fGnR;o'\ty!\003\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\005\0063=!\tAG\001\007y%t\027\016\036 \025\0035A\001\002H\b\t\006\004%I!H\001\017a>\024H/\0317Hk:\034E.Y:t+\005q\002GA\020*!\r\001SeJ\007\002C)\021!eI\001\005Y\006twMC\001%\003\021Q\027M^1\n\005\031\n#!B\"mCN\034\bC\001\025*\031\001!\021BK\026\002\002\003\005)\021A\027\003\005}\002\004\002\003\027\020\021\003\005\013\025\002\020\002\037A|'\017^1m\017Vt7\t\\1tg\002\n\"AL\031\021\005My\023B\001\031\025\005\035qu\016\0365j]\036\004\"a\005\032\n\005M\"\"aA!os\")Qg\004C\001m\005Y\021n\035)peR\fGnR;o)\t9$\b\005\002\024q%\021\021\b\006\002\b\005>|G.Z1o\021\025YD\0071\001=\003\025\031H/Y2l!\tiD)D\001?\025\ty\004)\001\003ji\026l'BA!C\003%i\027N\\3de\0064GOC\001D\003\rqW\r^\005\003\013z\022\021\"\023;f[N#\030mY6\t\013\035{A\021\001%\002'%\0348\013^1oI\006\024H\rU8si\006dw)\0368\025\005]J\005\"B\036G\001\004a\004")
public final class PortalGun {
  public static boolean isStandardPortalGun(ItemStack paramItemStack) {
    return PortalGun$.MODULE$.isStandardPortalGun(paramItemStack);
  }
  
  public static boolean isPortalGun(ItemStack paramItemStack) {
    return PortalGun$.MODULE$.isPortalGun(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\PortalGun.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */