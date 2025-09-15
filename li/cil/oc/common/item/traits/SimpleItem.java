package li.cil.oc.common.item.traits;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.common.ChestGenHooks;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005\035daB\001\003!\003\r\ta\004\002\013'&l\007\017\\3Ji\026l'BA\002\005\003\031!(/Y5ug*\021QAB\001\005SR,WN\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\t\001\001\003\005\002\022/5\t!C\003\002\006')\021A#F\001\n[&tWm\031:bMRT\021AF\001\004]\026$\030B\001\r\023\005\021IE/Z7\t\013i\001A\021A\016\002\r\021Jg.\033;%)\005a\002CA\017!\033\005q\"\"A\020\002\013M\034\027\r\\1\n\005\005r\"\001B+oSRDQa\t\001\005\002\021\nqb\031:fCR,\027\n^3n'R\f7m\033\013\003K!\002\"!\005\024\n\005\035\022\"!C%uK6\034F/Y2l\021\035I#\005%AA\002)\na!Y7pk:$\bCA\017,\023\tacDA\002J]RDQA\f\001\005B=\n\021#[:C_>\\WI\\2iC:$\030M\0317f)\r\0014'\016\t\003;EJ!A\r\020\003\017\t{w\016\\3b]\")A'\fa\001K\005)1\017^1dW\")a'\fa\001K\005!!m\\8l\021\025A\004\001\"\021:\003=9W\r^\"iKN$x)\0328CCN,G\003\002\036A\023J\003\"a\017 \016\003qR!!P\n\002\tU$\030\016\\\005\003q\022!dV3jO\"$X\r\032*b]\022|Wn\0215fgR\034uN\034;f]RDQ!Q\034A\002\t\013Qa\0315fgR\004\"aQ$\016\003\021S!aB#\013\005\031+\022AD7j]\026\034'/\0314uM>\024x-Z\005\003\021\022\023Qb\0215fgR<UM\034%p_.\034\b\"\002&8\001\004Y\025a\001:oIB\021A\nU\007\002\033*\021QH\024\006\002\037\006!!.\031<b\023\t\tVJ\001\004SC:$w.\034\005\006'^\002\rAO\001\t_JLw-\0338bY\")Q\013\001C!-\006\021Bm\\3t':,\027m\033\"za\006\0348/V:f)\031\001tK\0301cI\")\001\f\026a\0013\006)qo\034:mIB\021!\fX\007\0027*\021\001lE\005\003;n\023QaV8sY\022DQa\030+A\002)\n\021\001\037\005\006CR\003\rAK\001\002s\")1\r\026a\001U\005\t!\020C\003f)\002\007a-\001\004qY\006LXM\035\t\003O.l\021\001\033\006\003K&T!A[\n\002\r\025tG/\033;z\023\ta\007N\001\007F]RLG/\037)mCf,'\017C\003o\001\021\005s.\001\bbI\022LeNZ8s[\006$\030n\0348\025\rq\001\030O]A\004\021\025!T\0161\001&\021\025)W\0161\001g\021\025\031X\0161\001u\003\035!xn\0347uSB\004$!\036>\021\00713\b0\003\002x\033\n!A*[:u!\tI(\020\004\001\005\023m\024\030\021!A\001\006\003a(aA0%cE\031Q0!\001\021\005uq\030BA@\037\005\035qu\016\0365j]\036\0042!HA\002\023\r\t)A\b\002\004\003:L\bBBA\005[\002\007\001'\001\005bIZ\fgnY3eQ\035i\027QBA\023\003O\001B!a\004\002\"5\021\021\021\003\006\005\003'\t)\"\001\006sK2\fWO\\2iKJTA!a\006\002\032\005\031a-\0347\013\t\005m\021QD\001\005[>$7O\003\002\002 \005\0311\r]<\n\t\005\r\022\021\003\002\t'&$Wm\0248ms\006)a/\0317vK\022\022\021\021F\005\005\003W\ti#\001\004D\031&+e\n\026\006\005\003_\t\t\"\001\003TS\022,\007\"CA\032\001E\005I\021AA\033\003e\031'/Z1uK&#X-\\*uC\016\\G\005Z3gCVdG\017J\031\026\005\005]\"f\001\026\002:-\022\0211\b\t\005\003{\t9%\004\002\002@)!\021\021IA\"\003%)hn\0315fG.,GMC\002\002Fy\t!\"\0318o_R\fG/[8o\023\021\tI%a\020\003#Ut7\r[3dW\026$g+\031:jC:\034W\r\003\b\002N\001\001\n1!A\001\n\023\ty%!\032\0021M,\b/\032:%I>,7o\0258fC.\024\025\020]1tgV\033X\rF\0061\003#\n)&!\027\002^\005\005\004\"CA*\003\027\n\t\0211\001Z\003\rAH%\r\005\n\003/\nY%!AA\002)\n1\001\037\0233\021%\tY&a\023\002\002\003\007!&A\002yIMB\021\"a\030\002L\005\005\t\031\001\026\002\007a$C\007C\005\002d\005-\023\021!a\001M\006\031\001\020J\033\n\005U;\002")
public interface SimpleItem {
  ItemStack createItemStack(int paramInt);
  
  int createItemStack$default$1();
  
  boolean isBookEnchantable(ItemStack paramItemStack1, ItemStack paramItemStack2);
  
  WeightedRandomChestContent getChestGenBase(ChestGenHooks paramChestGenHooks, Random paramRandom, WeightedRandomChestContent paramWeightedRandomChestContent);
  
  boolean doesSneakBypassUse(World paramWorld, int paramInt1, int paramInt2, int paramInt3, EntityPlayer paramEntityPlayer);
  
  @SideOnly(Side.CLIENT)
  void addInformation(ItemStack paramItemStack, EntityPlayer paramEntityPlayer, List<?> paramList, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\SimpleItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */