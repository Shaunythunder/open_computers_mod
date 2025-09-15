package li.cil.oc.common.tileentity.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001\005\035aaB\001\003!\003\r\ta\004\002\021!><XM]%oM>\024X.\031;j_:T!a\001\003\002\rQ\024\030-\033;t\025\t)a!\001\006uS2,WM\034;jifT!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\004\001AI\002CA\t\030\033\005\021\"BA\003\024\025\t!R#A\005nS:,7M]1gi*\ta#A\002oKRL!\001\007\n\003\025QKG.Z#oi&$\030\020\005\002\03375\t!!\003\002\031\005!)Q\004\001C\001=\0051A%\0338ji\022\"\022a\b\t\003A\rj\021!\t\006\002E\005)1oY1mC&\021A%\t\002\005+:LG\017C\004'\001\001\007I\021B\024\002\0331\f7\017^*f]R\024\026\r^5p+\005A\003C\001\021*\023\tQ\023E\001\004E_V\024G.\032\005\bY\001\001\r\021\"\003.\003Ea\027m\035;TK:$(+\031;j_~#S-\035\013\003?9BqaL\026\002\002\003\007\001&A\002yIEBa!\r\001!B\023A\023A\0047bgR\034VM\034;SCRLw\016\t\005\bg\001\001\r\021\"\0035\0039!\030nY6t+:$\030\016\\*z]\016,\022!\016\t\003AYJ!aN\021\003\007%sG\017C\004:\001\001\007I\021\002\036\002%QL7m[:V]RLGnU=oG~#S-\035\013\003?mBqa\f\035\002\002\003\007Q\007\003\004>\001\001\006K!N\001\020i&\0347n]+oi&d7+\0378dA!)q\b\001D\001O\005aq\r\\8cC2\024UO\0324fe\")\021\t\001D\001\005\006\001r\r\\8cC2\024UO\0324fe~#S-\035\013\003?\rCQ\001\022!A\002!\nQA^1mk\026DQA\022\001\007\002\035\n\001c\0327pE\006d')\0364gKJ\034\026N_3\t\013!\003a\021A%\002)\035dwNY1m\005V4g-\032:TSj,w\fJ3r)\ty\"\nC\003E\017\002\007\001\006C\003M\001\021Ea$\001\fva\022\fG/\032)po\026\024\030J\0344pe6\fG/[8o\021\025q\005\001\"\003P\003]A\027m]\"iC:<W\rZ*jO:Lg-[2b]Rd\027\020\006\002Q'B\021\001%U\005\003%\006\022qAQ8pY\026\fg\016C\003U\033\002\007\001&A\003sCRLw\016C\003W\001\021%q+\001\006tQ>,H\016Z*z]\016$\"\001\025-\t\013Q+\006\031\001\025\t\013i\003A\021I.\002)I,\027\r\032$s_6t%\t\026$pe\016c\027.\0328u)\tyB\fC\003^3\002\007a,A\002oER\004\"aX1\016\003\001T!!X\n\n\005\t\004'A\004(C)R\013wmQ8na>,h\016\032\025\0053\022$\005\017\005\002f]6\taM\003\002hQ\006Q!/\0327bk:\034\007.\032:\013\005%T\027a\0014nY*\0211\016\\\001\005[>$7OC\001n\003\r\031\007o^\005\003_\032\024\001bU5eK>sG.\037\023\002c&\021!o]\001\007\0072KUI\024+\013\005Q4\027\001B*jI\026DQA\036\001\005B]\f1c\036:ji\026$vN\024\"U\r>\0248\t\\5f]R$\"a\b=\t\013u+\b\031\0010\t\027i\004\001\023aA\001\002\023%10`\001\033gV\004XM\035\023sK\006$gI]8n\035\n#fi\034:DY&,g\016\036\013\003?qDQ!X=A\002yK!AW\016\t\033}\004\001\023aA\001\002\023%\021\021AA\003\003e\031X\017]3sI]\024\030\016^3U_:\023EKR8s\0072LWM\034;\025\007}\t\031\001C\003^}\002\007a,\003\002w7\001")
public interface PowerInformation extends TileEntity {
  double li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio();
  
  @TraitSetter
  void li$cil$oc$common$tileentity$traits$PowerInformation$$lastSentRatio_$eq(double paramDouble);
  
  int li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync();
  
  @TraitSetter
  void li$cil$oc$common$tileentity$traits$PowerInformation$$ticksUntilSync_$eq(int paramInt);
  
  double globalBuffer();
  
  void globalBuffer_$eq(double paramDouble);
  
  double globalBufferSize();
  
  void globalBufferSize_$eq(double paramDouble);
  
  void updatePowerInformation();
  
  @SideOnly(Side.CLIENT)
  void readFromNBTForClient(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForClient(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\PowerInformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */