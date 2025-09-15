package li.cil.oc.integration.mekanism;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\021;Q!\001\002\t\0025\tA#\022<f]RD\025M\0343mKJlUm[1oSNl'BA\002\005\003!iWm[1oSNl'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\013Fm\026tG\017S1oI2,'/T3lC:L7/\\\n\003\037I\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007\"B\r\020\t\003Q\022A\002\037j]&$h\bF\001\016\021\025ar\002\"\001\036\003%)8/Z,sK:\034\007\016\006\004\037C9\032Tg\016\t\003'}I!\001\t\013\003\017\t{w\016\\3b]\")!e\007a\001G\0051\001\017\\1zKJ\004\"\001\n\027\016\003\025R!A\t\024\013\005\035B\023AB3oi&$\030P\003\002*U\005IQ.\0338fGJ\fg\r\036\006\002W\005\031a.\032;\n\0055*#\001D#oi&$\030\020\0257bs\026\024\b\"B\030\034\001\004\001\024!\001=\021\005M\t\024B\001\032\025\005\rIe\016\036\005\006im\001\r\001M\001\002s\")ag\007a\001a\005\t!\020C\00397\001\007a$\001\tdQ\006tw-\032#ve\006\024\027\016\\5us\")!h\004C\001w\005A\021n],sK:\034\007\016\006\002\037y!)Q(\017a\001}\005)1\017^1dWB\021qHQ\007\002\001*\021\021\tK\001\005SR,W.\003\002D\001\nI\021\n^3n'R\f7m\033")
public final class EventHandlerMekanism {
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerMekanism$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerMekanism$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mekanism\EventHandlerMekanism.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */