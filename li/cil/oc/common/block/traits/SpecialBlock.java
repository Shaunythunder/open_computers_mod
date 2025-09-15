package li.cil.oc.common.block.traits;

import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001}3q!\001\002\021\002\007\005qB\001\007Ta\026\034\027.\0317CY>\0347N\003\002\004\t\0051AO]1jiNT!!\002\004\002\013\tdwnY6\013\005\035A\021AB2p[6|gN\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\031\"\001\001\t\021\005E\021R\"\001\003\n\005M!!aC*j[BdWM\0217pG.DQ!\006\001\005\002Y\ta\001J5oSR$C#A\f\021\005aYR\"A\r\013\003i\tQa]2bY\006L!\001H\r\003\tUs\027\016\036\005\006=\001!\teH\001\rSN|\005/Y9vK\016+(-\032\013\002AA\021\001$I\005\003Ee\021qAQ8pY\026\fg\016C\003%\001\021\005s$A\nsK:$WM]!t\035>\024X.\0317CY>\0347\016C\003'\001\021\025s%\001\007jg\ncwnY6T_2LG\r\006\004!QMB$\b\020\005\006S\025\002\rAK\001\006o>\024H\016\032\t\003WEj\021\001\f\006\003S5R!AL\030\002\0235Lg.Z2sC\032$(\"\001\031\002\0079,G/\003\0023Y\ta\021J\0217pG.\f5mY3tg\")A'\na\001k\005\t\001\020\005\002\031m%\021q'\007\002\004\023:$\b\"B\035&\001\004)\024!A=\t\013m*\003\031A\033\002\003iDQ!P\023A\002U\nAa]5eK\")a\005\001C\001Q1\001\005Q!C\007\022CQ!\013 A\002)BQ\001\016 A\002UBQ!\017 A\002UBQa\017 A\002UBQ!\020 A\002\025\003\"A\022'\016\003\035S!\001S%\002\tU$\030\016\034\006\003\017)S!aS\030\002\0355Lg.Z2sC\032$hm\034:hK&\021Qj\022\002\017\r>\024x-\032#je\026\034G/[8o\021-y\005\001%A\002\002\003%I\001U.\002%M,\b/\032:%SN\024En\\2l'>d\027\016\032\013\007AE\033VkV-\t\017Is\025\021!a\001U\005\031\001\020J\031\t\017Qs\025\021!a\001k\005\031\001\020\n\032\t\017Ys\025\021!a\001k\005\031\001\020J\032\t\017as\025\021!a\001k\005\031\001\020\n\033\t\017is\025\021!a\001k\005\031\001\020J\033\n\005\031b\026BA/_\005\025\021En\\2l\025\t)Q\006")
public interface SpecialBlock {
  boolean isOpaqueCube();
  
  boolean renderAsNormalBlock();
  
  boolean isBlockSolid(IBlockAccess paramIBlockAccess, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  boolean isBlockSolid(IBlockAccess paramIBlockAccess, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\SpecialBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */