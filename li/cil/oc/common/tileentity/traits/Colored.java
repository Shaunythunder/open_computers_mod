package li.cil.oc.common.tileentity.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import li.cil.oc.api.internal.Colored;
import net.minecraft.nbt.NBTTagCompound;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001\005]aaB\001\003!\003\r\ta\004\002\b\007>dwN]3e\025\t\031A!\001\004ue\006LGo\035\006\003\013\031\t!\002^5mK\026tG/\033;z\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011\003\002\001\0213q\001\"!E\f\016\003IQ!!B\n\013\005Q)\022!C7j]\026\034'/\0314u\025\0051\022a\0018fi&\021\001D\005\002\013)&dW-\0228uSRL\bC\001\016\034\033\005\021\021B\001\r\003!\ti\"%D\001\037\025\ty\002%\001\005j]R,'O\\1m\025\t\t\003\"A\002ba&L!!\001\020\t\013\021\002A\021A\023\002\r\021Jg.\033;%)\0051\003CA\024+\033\005A#\"A\025\002\013M\034\027\r\\1\n\005-B#\001B+oSRDq!\f\001A\002\023%a&\001\004`G>dwN]\013\002_A\021q\005M\005\003c!\0221!\0238u\021\035\031\004\0011A\005\nQ\n!bX2pY>\024x\fJ3r)\t1S\007C\0047e\005\005\t\031A\030\002\007a$\023\007\003\0049\001\001\006KaL\001\b?\016|Gn\034:!\021\025Q\004\001\"\001/\003\025\031w\016\\8s\021\025a\004\001\"\001>\003%\031w\016\\8s?\022*\027\017\006\002'}!)qh\017a\001_\005)a/\0317vK\")\021\t\001C\001\005\006Y1m\0348tk6,7\017R=f+\005\031\005CA\024E\023\t)\005FA\004C_>dW-\0318\t\013\035\003A\021\t%\002\021\035,GoQ8m_J$\022a\f\005\006\025\002!\teS\001\tg\026$8i\0347peR\021a\005\024\005\006%\003\ra\f\005\006\035\002!\t\"J\001\017_:\034u\016\\8s\007\"\fgnZ3e\021\025\001\006\001\"\021R\003Q\021X-\0313Ge>lgJ\021+G_J\034VM\035<feR\021aE\025\005\006'>\003\r\001V\001\004]\n$\bCA+X\033\0051&BA*\024\023\tAfK\001\bO\005R#\026mZ\"p[B|WO\0343\t\013i\003A\021I.\002']\024\030\016^3U_:\023EKR8s'\026\024h/\032:\025\005\031b\006\"B*Z\001\004!\006\"\0020\001\t\003z\026\001\006:fC\0224%o\\7O\005R3uN]\"mS\026tG\017\006\002'A\")1+\030a\001)\"\"QLY o!\t\031G.D\001e\025\t)g-\001\006sK2\fWO\\2iKJT!a\0325\002\007\031lGN\003\002jU\006!Qn\0343t\025\005Y\027aA2qo&\021Q\016\032\002\t'&$Wm\0248ms\022\nq.\003\002qc\00611\tT%F\035RS!A\0353\002\tMKG-\032\005\006i\002!\t%^\001\024oJLG/\032+p\035\n#fi\034:DY&,g\016\036\013\003MYDQaU:A\002QC1\002\037\001\021\002\007\005\t\021\"\003zw\006Q2/\0369fe\022\022X-\0313Ge>lgJ\021+G_J\034VM\035<feR\021aE\037\005\006'^\004\r\001V\005\003!nAA\" \001\021\002\007\005\t\021\"\003\003\003\t\021d];qKJ$sO]5uKR{gJ\021+G_J\034VM\035<feR\021ae \005\006'r\004\r\001V\005\0035nAa\"!\002\001!\003\r\t\021!C\005\003\017\tY!\001\016tkB,'\017\n:fC\0224%o\\7O\005R3uN]\"mS\026tG\017F\002'\003\023AaaUA\002\001\004!\026B\0010\034\0219\ty\001\001I\001\004\003\005I\021BA\t\003+\t\021d];qKJ$sO]5uKR{gJ\021+G_J\034E.[3oiR\031a%a\005\t\rM\013i\0011\001U\023\t!8\004")
public interface Colored extends TileEntity, Colored {
  int li$cil$oc$common$tileentity$traits$Colored$$_color();
  
  @TraitSetter
  void li$cil$oc$common$tileentity$traits$Colored$$_color_$eq(int paramInt);
  
  int color();
  
  void color_$eq(int paramInt);
  
  boolean consumesDye();
  
  int getColor();
  
  void setColor(int paramInt);
  
  void onColorChanged();
  
  void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  @SideOnly(Side.CLIENT)
  void readFromNBTForClient(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForClient(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Colored.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */