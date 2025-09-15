package li.cil.oc.integration.enderio;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\021;Q!\001\002\t\0025\t1#\022<f]RD\025M\0343mKJ,e\016Z3s\023>S!a\001\003\002\017\025tG-\032:j_*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\0211#\022<f]RD\025M\0343mKJ,e\016Z3s\023>\033\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\003\035\037\021\005Q$A\005vg\026<&/\0328dQR1a$\t\0304k]\002\"aE\020\n\005\001\"\"a\002\"p_2,\027M\034\005\006Em\001\raI\001\007a2\f\0270\032:\021\005\021bS\"A\023\013\005\t2#BA\024)\003\031)g\016^5us*\021\021FK\001\n[&tWm\031:bMRT\021aK\001\004]\026$\030BA\027&\0051)e\016^5usBc\027-_3s\021\025y3\0041\0011\003\005A\bCA\n2\023\t\021DCA\002J]RDQ\001N\016A\002A\n\021!\037\005\006mm\001\r\001M\001\002u\")\001h\007a\001=\005\0012\r[1oO\026$UO]1cS2LG/\037\005\006u=!\taO\001\tSN<&/\0328dQR\021a\004\020\005\006{e\002\rAP\001\006gR\f7m\033\t\003\tk\021\001\021\006\003\003\"\nA!\033;f[&\0211\t\021\002\n\023R,Wn\025;bG.\004")
public final class EventHandlerEnderIO {
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerEnderIO$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerEnderIO$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\enderio\EventHandlerEnderIO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */