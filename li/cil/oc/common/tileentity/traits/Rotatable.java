package li.cil.oc.common.tileentity.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import li.cil.oc.api.internal.Rotatable;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001\005}eaB\001\003!\003\r\ta\004\002\n%>$\030\r^1cY\026T!a\001\003\002\rQ\024\030-\033;t\025\t)a!\001\006uS2,WM\034;jifT!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\005\001AIR\004\005\002\022/5\t!C\003\002\006')\021A#F\001\n[&tWm\031:bMRT\021AF\001\004]\026$\030B\001\r\023\005)!\026\016\\3F]RLG/\037\t\0035mi\021AA\005\0039\t\021QBU8uCRLwN\\!xCJ,\007C\001\020$\033\005y\"B\001\021\"\003!Ig\016^3s]\006d'B\001\022\t\003\r\t\007/[\005\003\003}AQ!\n\001\005\002\031\na\001J5oSR$C#A\024\021\005!ZS\"A\025\013\003)\nQa]2bY\006L!\001L\025\003\tUs\027\016\036\005\b]\001\021\r\021\"\0030\003=\001\030\016^2ie\021K'/Z2uS>tW#\001\031\021\007!\n4'\003\0023S\t)\021I\035:bsB\021AGO\007\002k)\021agN\001\005kRLGN\003\002\bq)\021\021(F\001\017[&tWm\031:bMR4wN]4f\023\tYTG\001\bG_J<W\rR5sK\016$\030n\0348\t\ru\002\001\025!\0031\003A\001\030\016^2ie\021K'/Z2uS>t\007\005C\004@\001\t\007I\021B\030\002\033e\fwO\r#je\026\034G/[8o\021\031\t\005\001)A\005a\005q\0210Y<3\t&\024Xm\031;j_:\004\003bB\"\001\001\004%I\001R\001\007?BLGo\0315\026\003MBqA\022\001A\002\023%q)\001\006`a&$8\r[0%KF$\"a\n%\t\017%+\025\021!a\001g\005\031\001\020J\031\t\r-\003\001\025)\0034\003\035y\006/\033;dQ\002Bq!\024\001A\002\023%A)\001\003`s\006<\bbB(\001\001\004%I\001U\001\t?f\fwo\030\023fcR\021q%\025\005\b\023:\013\t\0211\0014\021\031\031\006\001)Q\005g\005)q,_1xA!)Q\013\001C\001\t\006)\001/\033;dQ\")q\013\001C\0011\006I\001/\033;dQ~#S-\035\013\003OeCQA\027,A\002M\nQA^1mk\026DQ\001\030\001\005\002\021\0131!_1x\021\025q\006\001\"\001`\003\035I\030m^0%KF$\"a\n1\t\013ik\006\031A\032\t\013\t\004A\021A2\0021M,GO\022:p[\026sG/\033;z!&$8\r[!oIf\013w\017\006\002eOB\021\001&Z\005\003M&\022qAQ8pY\026\fg\016C\003iC\002\007\021.\001\004f]RLG/\037\t\003U2l\021a\033\006\003QNI!!\\6\003\r\025sG/\033;z\021\025y\007\001\"\001q\0035\031X\r\036$s_64\025mY5oOR\021A-\035\005\0065:\004\ra\r\005\006g\002!\t\001^\001\017S:4XM\035;S_R\fG/[8o)\005!\007\"\002<\001\t\003:\030A\0024bG&tw\rF\0014\021\025I\b\001\"\001{\003\031\021x\016^1uKR\021Am\037\005\006yb\004\raM\001\005CbL7\017C\003\001\021\005s0A\004u_2{7-\0317\025\007M\n\t\001C\003[{\002\0071\007C\004\002\006\001!\t%a\002\002\021Q|w\t\\8cC2$2aMA\005\021\031Q\0261\001a\001g!1\021Q\002\001\005\002=\nAB^1mS\0224\025mY5oONDa!!\005\001\t#1\023!E8o%>$\030\r^5p]\016C\027M\\4fI\"9\021Q\003\001\005B\005]\021\001\006:fC\0224%o\\7O\005R3uN]*feZ,'\017F\002(\0033A\001\"a\007\002\024\001\007\021QD\001\004]\n$\b\003BA\020\003Gi!!!\t\013\007\005m1#\003\003\002&\005\005\"A\004(C)R\013wmQ8na>,h\016\032\005\b\003S\001A\021IA\026\003M9(/\033;f)>t%\t\026$peN+'O^3s)\r9\023Q\006\005\t\0037\t9\0031\001\002\036!9\021\021\007\001\005B\005M\022\001\006:fC\0224%o\\7O\005R3uN]\"mS\026tG\017F\002(\003kA\001\"a\007\0020\001\007\021Q\004\025\b\003_\tIDWA)!\021\tY$!\024\016\005\005u\"\002BA \003\003\n!B]3mCVt7\r[3s\025\021\t\031%!\022\002\007\031lGN\003\003\002H\005%\023\001B7pINT!!a\023\002\007\r\004x/\003\003\002P\005u\"\001C*jI\026|e\016\\=%\005\005M\023\002BA+\003/\naa\021'J\013:#&\002BA-\003{\tAaU5eK\"9\021Q\f\001\005B\005}\023aE<sSR,Gk\034(C)\032{'o\0217jK:$HcA\024\002b!A\0211DA.\001\004\ti\002\003\004\002f\001!IAJ\001\024m\006d\027\016Z1uKBKGo\0315B]\022L\026m\036\005\007\003S\002A\021\002\024\002#U\004H-\031;f)J\fgn\0357bi&|g\016C\004\002n\001!I!a\034\002\035Q\024\030pU3u!&$8\r[-boR)A-!\035\002t!1Q+a\033A\002MBa\001XA6\001\004\031\004BDA<\001A\005\031\021!A\005\n\005e\024QP\001\033gV\004XM\035\023sK\006$gI]8n\035\n#fi\034:TKJ4XM\035\013\004O\005m\004\002CA\016\003k\002\r!!\b\n\t\005U\021qP\005\0031\tAa\"a!\001!\003\r\t\021!C\005\003\013\013I)A\rtkB,'\017J<sSR,Gk\034(C)\032{'oU3sm\026\024HcA\024\002\b\"A\0211DAA\001\004\ti\"\003\003\002*\005}\004BDAG\001A\005\031\021!A\005\n\005=\0251S\001\033gV\004XM\035\023sK\006$gI]8n\035\n#fi\034:DY&,g\016\036\013\004O\005E\005\002CA\016\003\027\003\r!!\b\n\t\005E\022q\020\005\017\003/\003\001\023aA\001\002\023%\021\021TAO\003e\031X\017]3sI]\024\030\016^3U_:\023EKR8s\0072LWM\034;\025\007\035\nY\n\003\005\002\034\005U\005\031AA\017\023\021\ti&a ")
public interface Rotatable extends RotationAware, Rotatable {
  void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(ForgeDirection[] paramArrayOfForgeDirection);
  
  void li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(ForgeDirection[] paramArrayOfForgeDirection);
  
  ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction();
  
  ForgeDirection[] li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction();
  
  ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_pitch();
  
  @TraitSetter
  void li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection paramForgeDirection);
  
  ForgeDirection li$cil$oc$common$tileentity$traits$Rotatable$$_yaw();
  
  @TraitSetter
  void li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection paramForgeDirection);
  
  ForgeDirection pitch();
  
  void pitch_$eq(ForgeDirection paramForgeDirection);
  
  ForgeDirection yaw();
  
  void yaw_$eq(ForgeDirection paramForgeDirection);
  
  boolean setFromEntityPitchAndYaw(Entity paramEntity);
  
  boolean setFromFacing(ForgeDirection paramForgeDirection);
  
  boolean invertRotation();
  
  ForgeDirection facing();
  
  boolean rotate(ForgeDirection paramForgeDirection);
  
  ForgeDirection toLocal(ForgeDirection paramForgeDirection);
  
  ForgeDirection toGlobal(ForgeDirection paramForgeDirection);
  
  ForgeDirection[] validFacings();
  
  void onRotationChanged();
  
  void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  @SideOnly(Side.CLIENT)
  void readFromNBTForClient(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForClient(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Rotatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */