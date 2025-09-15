package li.cil.oc.common.tileentity.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import li.cil.oc.util.BlockPosition;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.world.World;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005]daB\001\003!\003\r\ta\004\002\013)&dW-\0228uSRL(BA\002\005\003\031!(/Y5ug*\021QAB\001\013i&dW-\0328uSRL(BA\004\t\003\031\031w.\\7p]*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\030\033\005\021\"BA\003\024\025\t!R#A\005nS:,7M]1gi*\ta#A\002oKRL!!\001\n\t\013e\001A\021\001\016\002\r\021Jg.\033;%)\005Y\002C\001\017 \033\005i\"\"\001\020\002\013M\034\027\r\\1\n\005\001j\"\001B+oSRDQA\t\001\005\002\r\nQa^8sY\022,\022\001\n\t\003K\035j\021A\n\006\003EMI!\001\013\024\003\013]{'\017\0343\t\013)\002A\021A\026\002\003a,\022\001\f\t\00395J!AL\017\003\007%sG\017C\0031\001\021\0051&A\001z\021\025\021\004\001\"\001,\003\005Q\b\"\002\033\001\t\003)\024\001\0039pg&$\030n\0348\026\003Y\002\"a\016\036\016\003aR!!\017\005\002\tU$\030\016\\\005\003wa\022QB\0217pG.\004vn]5uS>t\007\"B\037\001\t\003q\024!\0022m_\016\\W#A \021\005\001\023U\"A!\013\005u\032\022BA\"B\005\025\021En\\2l\021\025)\005\001\"\001G\003!I7o\0217jK:$X#A$\021\005qA\025BA%\036\005\035\021un\0347fC:DQa\023\001\005\002\031\013\001\"[:TKJ4XM\035\005\006\033\002!\tEG\001\rkB$\027\r^3F]RLG/\037\005\006\037\002!\tEG\001\tm\006d\027\016Z1uK\")\021\013\001C!5\005Q\021N\034<bY&$\027\r^3\t\013M\003A\021\t\016\002\033=t7\t[;oWVsGn\\1e\021\025)\006\001\"\005\033\003)Ig.\033;jC2L'0\032\005\006/\002!\tAG\001\bI&\034\bo\\:f\021\025I\006\001\"\001[\003Q\021X-\0313Ge>lgJ\021+G_J\034VM\035<feR\0211d\027\005\0069b\003\r!X\001\004]\n$\bC\0010a\033\005y&B\001/\024\023\t\twL\001\bO\005R#\026mZ\"p[B|WO\0343\t\013\r\004A\021\0013\002']\024\030\016^3U_:\023EKR8s'\026\024h/\032:\025\005m)\007\"\002/c\001\004i\006\"B4\001\t\003A\027\001\006:fC\0224%o\\7O\005R3uN]\"mS\026tG\017\006\002\034S\")AL\032a\001;\"\"am[<y!\taW/D\001n\025\tqw.\001\006sK2\fWO\\2iKJT!\001]9\002\007\031lGN\003\002sg\006!Qn\0343t\025\005!\030aA2qo&\021a/\034\002\t'&$Wm\0248ms\006)a/\0317vK\022\n\0210\003\002{w\00611\tT%F\035RS!\001`7\002\tMKG-\032\005\006}\002!\ta`\001\024oJLG/\032+p\035\n#fi\034:DY&,g\016\036\013\0047\005\005\001\"\002/~\001\004i\006bBA\003\001\021\005\023qA\001\fe\026\fGM\022:p[:\023E\013F\002\034\003\023Aa\001XA\002\001\004i\006bBA\007\001\021\005\023qB\001\013oJLG/\032+p\035\n#FcA\016\002\022!1A,a\003A\002uCq!!\006\001\t\003\n9\"\001\013hKR$Um]2sSB$\030n\0348QC\016\\W\r\036\013\003\0033\001B!a\007\002\"5\021\021Q\004\006\004\003?\031\022a\0028fi^|'o[\005\005\003G\tiB\001\004QC\016\\W\r\036\005\b\003O\001A\021IA\025\0031yg\016R1uCB\0137m[3u)\025Y\0221FA\033\021!\ti#!\nA\002\005=\022aB7b]\006<WM\035\t\005\0037\t\t$\003\003\0024\005u!A\004(fi^|'o['b]\006<WM\035\005\t\003o\t)\0031\001\002:\0051\001/Y2lKR\004B!a\017\002F5\021\021Q\b\006\005\003\t\t%\001\004tKJ4XM\035\006\005\003\007\ni\"\001\003qY\006L\030\002BA$\003{\021\021dU\0326!\006\0347.\032;Va\022\fG/\032+jY\026,e\016^5us\"i\0211\n\001\021\002\007\005\t\021\"\003\033\003\033\n!c];qKJ$S\017\0353bi\026,e\016^5us&\021Qj\006\005\016\003#\002\001\023aA\001\002\023%!$a\025\002\035M,\b/\032:%m\006d\027\016Z1uK&\021qj\006\005\016\003/\002\001\023aA\001\002\023%!$!\027\002!M,\b/\032:%S:4\030\r\\5eCR,\027BA)\030\0215\ti\006\001I\001\004\003\005I\021\002\016\002`\005\0312/\0369fe\022zgn\0215v].,f\016\\8bI&\0211k\006\005\017\003G\002\001\023aA\001\002\023%\021QMA6\003E\031X\017]3sII,\027\r\032$s_6t%\t\026\013\0047\005\035\004\"CA5\003C\n\t\0211\001^\003\rAH%M\005\004\003\0139\002BDA8\001A\005\031\021!A\005\n\005E\024QO\001\021gV\004XM\035\023xe&$X\rV8O\005R#2aGA:\021%\tI'!\034\002\002\003\007Q,C\002\002\016]\001")
public interface TileEntity {
  World world();
  
  int x();
  
  int y();
  
  int z();
  
  BlockPosition position();
  
  Block block();
  
  boolean isClient();
  
  boolean isServer();
  
  void updateEntity();
  
  void validate();
  
  void invalidate();
  
  void onChunkUnload();
  
  void initialize();
  
  void dispose();
  
  void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
  
  @SideOnly(Side.CLIENT)
  void readFromNBTForClient(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBTForClient(NBTTagCompound paramNBTTagCompound);
  
  void readFromNBT(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBT(NBTTagCompound paramNBTTagCompound);
  
  Packet getDescriptionPacket();
  
  void onDataPacket(NetworkManager paramNetworkManager, S35PacketUpdateTileEntity paramS35PacketUpdateTileEntity);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\TileEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */