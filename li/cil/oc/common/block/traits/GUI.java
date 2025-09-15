package li.cil.oc.common.block.traits;

import li.cil.oc.common.GuiType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00114q!\001\002\021\002\007\005qBA\002H+&S!a\001\003\002\rQ\024\030-\033;t\025\t)a!A\003cY>\0347N\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\t\001\001\003\005\002\022%5\tA!\003\002\024\t\tY1+[7qY\026\024En\\2l\021\025)\002\001\"\001\027\003\031!\023N\\5uIQ\tq\003\005\002\03175\t\021DC\001\033\003\025\0318-\0317b\023\ta\022D\001\003V]&$\b\"\002\020\001\r\003y\022aB4vSRK\b/Z\013\002AA\021\021%\n\b\003E\rj\021AB\005\003I\031\tqaR;j)f\004X-\003\002'O\t9QI\\;n-\006d'B\001\023\007\021\025I\003\001\"\021+\003AygN\0217pG.\f5\r^5wCR,G\r\006\006,]er\004IQ&W7v\003\"\001\007\027\n\0055J\"a\002\"p_2,\027M\034\005\006_!\002\r\001M\001\006o>\024H\016\032\t\003c]j\021A\r\006\003_MR!\001N\033\002\0235Lg.Z2sC\032$(\"\001\034\002\0079,G/\003\0029e\t)qk\034:mI\")!\b\013a\001w\005\t\001\020\005\002\031y%\021Q(\007\002\004\023:$\b\"B )\001\004Y\024!A=\t\013\005C\003\031A\036\002\003iDQa\021\025A\002\021\013a\001\0357bs\026\024\bCA#J\033\0051%BA\"H\025\tA5'\001\004f]RLG/_\005\003\025\032\023A\"\0228uSRL\b\013\\1zKJDQ\001\024\025A\0025\013Aa]5eKB\021a\nV\007\002\037*\021\001+U\001\005kRLGN\003\002\b%*\0211+N\001\017[&tWm\031:bMR4wN]4f\023\t)vJ\001\bG_J<W\rR5sK\016$\030n\0348\t\013]C\003\031\001-\002\t!LG\017\027\t\0031eK!AW\r\003\013\031cw.\031;\t\013qC\003\031\001-\002\t!LG/\027\005\006=\"\002\r\001W\001\005Q&$(\fC\006a\001A\005\031\021!A\005\n\005\\\027AF:va\026\024He\0348CY>\0347.Q2uSZ\fG/\0323\025\025-\0227\rZ3gO\"L'\016C\0030?\002\007\001\007C\003;?\002\0071\bC\003@?\002\0071\bC\003B?\002\0071\bC\003D?\002\007A\tC\003M?\002\007Q\nC\003X?\002\007\001\fC\003]?\002\007\001\fC\003_?\002\007\001,\003\002*%\001")
public interface GUI {
  GuiType.EnumVal guiType();
  
  boolean onBlockActivated(World paramWorld, int paramInt1, int paramInt2, int paramInt3, EntityPlayer paramEntityPlayer, ForgeDirection paramForgeDirection, float paramFloat1, float paramFloat2, float paramFloat3);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\GUI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */