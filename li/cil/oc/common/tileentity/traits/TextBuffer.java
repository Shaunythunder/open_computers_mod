package li.cil.oc.common.tileentity.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import li.cil.oc.api.network.Node;
import net.minecraft.nbt.NBTTagCompound;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005%aaB\001\003!\003\r\ta\004\002\013)\026DHOQ;gM\026\024(BA\002\005\003\031!(/Y5ug*\021QAB\001\013i&dW-\0328uSRL(BA\004\t\003\031\031w.\\7p]*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\007\001\001\022\004\005\002\022/5\t!C\003\002\006')\021A#F\001\n[&tWm\031:bMRT\021AF\001\004]\026$\030B\001\r\023\005)!\026\016\\3F]RLG/\037\t\0035mi\021AA\005\0039\t\0211\"\0228wSJ|g.\\3oi\")a\004\001C\001?\0051A%\0338ji\022\"\022\001\t\t\003C\021j\021A\t\006\002G\005)1oY1mC&\021QE\t\002\005+:LG\017\003\005(\001!\025\r\021\"\001)\003\031\021WO\0324feV\t\021\006\005\002+_5\t1F\003\002-[\005A\021N\034;fe:\fGN\003\002/\021\005\031\021\r]5\n\005\005Y\003\002C\031\001\021\003\005\013\025B\025\002\017\t,hMZ3sA!)1\007\001C!i\005!an\0343f)\005)\004C\001\034:\033\0059$B\001\035.\003\035qW\r^<pe.L!AO\034\003\t9{G-\032\005\006y\0011\t!P\001\005i&,'/F\001?!\t\ts(\003\002AE\t\031\021J\034;\t\013\t\003A\021I\020\002\031U\004H-\031;f\013:$\030\016^=\t\013\021\003A\021I#\002)I,\027\r\032$s_6t%\t\026$peN+'O^3s)\t\001c\tC\003H\007\002\007\001*A\002oER\004\"!S&\016\003)S!aR\n\n\0051S%A\004(C)R\013wmQ8na>,h\016\032\005\006\035\002!\teT\001\024oJLG/\032+p\035\n#fi\034:TKJ4XM\035\013\003AACQaR'A\002!CQA\025\001\005BM\013AC]3bI\032\023x.\034(C)\032{'o\0217jK:$HC\001\021U\021\0259\025\0131\001IQ\021\tfKY2\021\005]\003W\"\001-\013\005eS\026A\003:fY\006,hn\0315fe*\0211\fX\001\004M6d'BA/_\003\021iw\016Z:\013\003}\0131a\0319x\023\t\t\007L\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\005!\027BA3g\003\031\031E*S#O)*\021q\rW\001\005'&$W\rC\003j\001\021\005#.A\nxe&$X\rV8O\005R3uN]\"mS\026tG\017\006\002!W\")q\t\033a\001\021\"YQ\016\001I\001\004\003\005I\021B\020o\003I\031X\017]3sIU\004H-\031;f\013:$\030\016^=\n\005\t[\002b\0039\001!\003\r\t\021!C\005cN\f!d];qKJ$#/Z1e\rJ|WN\024\"U\r>\0248+\032:wKJ$\"\001\t:\t\013\035{\007\031\001%\n\005\021[\002bC;\001!\003\r\t\021!C\005mb\f\021d];qKJ$sO]5uKR{gJ\021+G_J\034VM\035<feR\021\001e\036\005\006\017R\004\r\001S\005\003\035nA1B\037\001\021\002\007\005\t\021\"\003|{\006Q2/\0369fe\022\022X-\0313Ge>lgJ\021+G_J\034E.[3oiR\021\001\005 \005\006\017f\004\r\001S\005\003%zL!\001\007\002\t\035\005\005\001\001%A\002\002\003%I!a\001\002\b\005I2/\0369fe\022:(/\033;f)>t%\t\026$pe\016c\027.\0328u)\r\001\023Q\001\005\006\017~\004\r\001S\005\003Sz\004")
public interface TextBuffer extends Environment {
  li.cil.oc.api.internal.TextBuffer buffer();
  
  Node node();
  
  int tier();
  
  void updateEntity();
  
  void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  @SideOnly(Side.CLIENT)
  void readFromNBTForClient(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForClient(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\TextBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */