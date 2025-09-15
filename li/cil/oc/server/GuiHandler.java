package li.cil.oc.server;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import scala.reflect.ScalaSignature;
import scala.runtime.Null$;

@ScalaSignature(bytes = "\006\001\001;Q!\001\002\t\002-\t!bR;j\021\006tG\r\\3s\025\t\031A!\001\004tKJ4XM\035\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\001\001C\001\007\016\033\005\021a!\002\b\003\021\003y!AC$vS\"\013g\016\0327feN\021Q\002\005\t\003#Qi\021A\005\006\003'\021\taaY8n[>t\027B\001\b\023\021\0251R\002\"\001\030\003\031a\024N\\5u}Q\t1\002C\003\032\033\021\005#$A\nhKR\034E.[3oi\036+\030.\0227f[\026tG\017F\004\034C\031\032$\b\020 \021\005qyR\"A\017\013\003y\tQa]2bY\006L!\001I\017\003\t9+H\016\034\005\006Ea\001\raI\001\003S\022\004\"\001\b\023\n\005\025j\"aA%oi\")q\005\007a\001Q\0051\001\017\\1zKJ\004\"!K\031\016\003)R!aJ\026\013\0051j\023AB3oi&$\030P\003\002/_\005IQ.\0338fGJ\fg\r\036\006\002a\005\031a.\032;\n\005IR#\001D#oi&$\030\020\0257bs\026\024\b\"\002\033\031\001\004)\024!B<pe2$\007C\001\0349\033\0059$B\001\033.\023\tItGA\003X_JdG\rC\003<1\001\0071%A\001y\021\025i\004\0041\001$\003\005I\b\"B \031\001\004\031\023!\001>")
public final class GuiHandler {
  public static Null$ getClientGuiElement(int paramInt1, EntityPlayer paramEntityPlayer, World paramWorld, int paramInt2, int paramInt3, int paramInt4) {
    return GuiHandler$.MODULE$.getClientGuiElement(paramInt1, paramEntityPlayer, paramWorld, paramInt2, paramInt3, paramInt4);
  }
  
  public static Object getServerGuiElement(int paramInt1, EntityPlayer paramEntityPlayer, World paramWorld, int paramInt2, int paramInt3, int paramInt4) {
    return GuiHandler$.MODULE$.getServerGuiElement(paramInt1, paramEntityPlayer, paramWorld, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\GuiHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */