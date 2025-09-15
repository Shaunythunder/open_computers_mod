package li.cil.oc.common.block.traits;

import java.util.ArrayList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import scala.reflect.ClassTag;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005\035daB\001\003!\003\r\ta\004\002\f\007V\034Ho\\7Ee>\0048O\003\002\004\t\0051AO]1jiNT!!\002\004\002\013\tdwnY6\013\005\035A\021AB2p[6|gN\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001)\"\001E\025\024\005\001\t\002C\001\n\024\033\005!\021B\001\013\005\005-\031\026.\0349mK\ncwnY6\t\013Y\001A\021A\f\002\r\021Jg.\033;%)\005A\002CA\r\035\033\005Q\"\"A\016\002\013M\034\027\r\\1\n\005uQ\"\001B+oSRDQa\b\001\007\022\001\nq\001^5mKR\013w-F\001\"!\r\021SeJ\007\002G)\021AEG\001\be\0264G.Z2u\023\t13E\001\005DY\006\0348\017V1h!\tA\023\006\004\001\005\013)\002!\031A\026\003\tQKG.Z\t\003Y=\002\"!G\027\n\0059R\"a\002(pi\"Lgn\032\t\003a]j\021!\r\006\003eM\n!\002^5mK\026tG/\033;z\025\t!T'A\005nS:,7M]1gi*\ta'A\002oKRL!\001O\031\003\025QKG.Z#oi&$\030\020C\003;\001\021\0053(\001\005hKR$%o\0349t)\035a$*\025,Y5r\0032!\020\"E\033\005q$BA A\003\021)H/\0337\013\003\005\013AA[1wC&\0211I\020\002\n\003J\024\030-\037'jgR\004\"!\022%\016\003\031S!aR\032\002\t%$X-\\\005\003\023\032\023\021\"\023;f[N#\030mY6\t\013-K\004\031\001'\002\013]|'\017\0343\021\0055{U\"\001(\013\005-\033\024B\001)O\005\0259vN\0357e\021\025\021\026\b1\001T\003\005A\bCA\rU\023\t)&DA\002J]RDQaV\035A\002M\013\021!\037\005\0063f\002\raU\001\002u\")1,\017a\001'\006AQ.\032;bI\006$\030\rC\003^s\001\0071+A\004g_J$XO\\3\t\013}\003A\021\t1\002#=t'\t\\8dWB\023X\rR3tiJ|\027\020\006\004\031C\n\034G-\032\005\006\027z\003\r\001\024\005\006%z\003\ra\025\005\006/z\003\ra\025\005\0063z\003\ra\025\005\0067z\003\ra\025\005\006O\002!\t\005[\001\020e\026lwN^3e\005f\004F.Y=feR9\021\016\\7wobL\bCA\rk\023\tY'DA\004C_>dW-\0318\t\013-3\007\031\001'\t\01394\007\031A8\002\rAd\027-_3s!\t\001H/D\001r\025\tq'O\003\002tg\0051QM\034;jifL!!^9\003\031\025sG/\033;z!2\f\0270\032:\t\013I3\007\031A*\t\013]3\007\031A*\t\013e3\007\031A*\t\013i4\007\031A5\002\027]LG\016\034%beZ,7\017\036\005\006y\002!\t%`\001\020_:\024En\\2l!2\f7-\0323CsRY\001D`@\002\002\005\r\021QAA\b\021\025Y5\0201\001M\021\025\0216\0201\001T\021\02596\0201\001T\021\025I6\0201\001T\021\031q7\0201\001\002\bA!\021\021BA\006\033\005\021\030bAA\007e\n\001RI\034;jifd\025N^5oO\n\0137/\032\005\007\003#Y\b\031\001#\002\013M$\030mY6\t\017\005U\001\001\"\005\002\030\005aAm\\\"vgR|W.\0238jiR9\001$!\007\002\036\005}\001bBA\016\003'\001\raJ\001\013i&dW-\0228uSRL\bb\0028\002\024\001\007\021q\001\005\b\003#\t\031\0021\001E\021\035\t\031\003\001C\t\003K\tQ\002Z8DkN$x.\034#s_B\034Hc\002\r\002(\005%\0221\006\005\b\0037\t\t\0031\001(\021\031q\027\021\005a\001_\"1!0!\tA\002%Da\"a\f\001!\003\r\t\021!C\005\003c\tY%A\013tkB,'\017\n:f[>4X\r\032\"z!2\f\0270\032:\025\033%\f\031$a\016\002<\005}\0221IA$\021%\t)$!\f\002\002\003\007A*A\002yIEB\021\"!\017\002.\005\005\t\031A8\002\007a$#\007C\005\002>\0055\022\021!a\001'\006\031\001\020J\032\t\023\005\005\023QFA\001\002\004\031\026a\001=%i!I\021QIA\027\003\003\005\raU\001\004q\022*\004\"CA%\003[\t\t\0211\001j\003\rAHEN\005\004O\0065\023\002BA(\003#\022QA\0217pG.T!!B\032\t\035\005U\003\001%A\002\002\003%I!a\026\002f\005)2/\0369fe\022zgN\0217pG.\004F.Y2fI\nKH#\004\r\002Z\005m\023QLA0\003C\n\031\007C\005\0026\005M\023\021!a\001\031\"I\021\021HA*\003\003\005\ra\025\005\n\003{\t\031&!AA\002MC\021\"!\021\002T\005\005\t\031A*\t\025\005\025\0231KA\001\002\004\t9\001C\005\002J\005M\023\021!a\001\t&\031A0!\024")
public interface CustomDrops<Tile extends net.minecraft.tileentity.TileEntity> {
  ClassTag<Tile> tileTag();
  
  ArrayList<ItemStack> getDrops(World paramWorld, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  void onBlockPreDestroy(World paramWorld, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  boolean removedByPlayer(World paramWorld, EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  void onBlockPlacedBy(World paramWorld, int paramInt1, int paramInt2, int paramInt3, EntityLivingBase paramEntityLivingBase, ItemStack paramItemStack);
  
  void doCustomInit(Tile paramTile, EntityLivingBase paramEntityLivingBase, ItemStack paramItemStack);
  
  void doCustomDrops(Tile paramTile, EntityPlayer paramEntityPlayer, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\CustomDrops.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */