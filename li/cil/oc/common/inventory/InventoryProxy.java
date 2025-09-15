package li.cil.oc.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001]4q!\001\002\021\002\007\005QB\001\bJ]Z,g\016^8ssB\023x\016_=\013\005\r!\021!C5om\026tGo\034:z\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017-A\021q\002F\007\002!)\021\021CE\001\005Y\006twMC\001\024\003\021Q\027M^1\n\005U\001\"AB(cU\026\034G\017\005\002\030;5\t\001D\003\002\0043)\021!dG\001\n[&tWm\031:bMRT\021\001H\001\004]\026$\030B\001\020\031\005)I\025J\034<f]R|'/\037\005\006A\001!\t!I\001\007I%t\027\016\036\023\025\003\t\002\"a\t\024\016\003\021R\021!J\001\006g\016\fG.Y\005\003O\021\022A!\0268ji\")1\001\001D\001SU\ta\003C\003,\001\021\005A&\001\004pM\032\034X\r^\013\002[A\0211EL\005\003_\021\0221!\0238u\021\025\t\004\001\"\0213\003A9W\r^*ju\026LeN^3oi>\024\030\020F\001.\021\025!\004\001\"\0213\003Y9W\r^%om\026tGo\034:z'R\f7m\033'j[&$\b\"\002\034\001\t\003:\024\001E4fi&sg/\0328u_JLh*Y7f)\005A\004CA\b:\023\tQ\004C\001\004TiJLgn\032\005\006y\001!\t%P\001\027Q\006\0348)^:u_6LeN^3oi>\024\030PT1nKR\ta\b\005\002$%\021\001\t\n\002\b\005>|G.Z1o\021\025\021\005\001\"\021D\003EI7/V:fC\ndWMQ=QY\006LXM\035\013\003}\021CQ!R!A\002\031\013a\001\0357bs\026\024\bCA$L\033\005A%BA#J\025\tQ\025$\001\004f]RLG/_\005\003\031\"\023A\"\0228uSRL\b\013\\1zKJDQA\024\001\005B=\013!#[:Ji\026lg+\0317jI\032{'o\0257piR\031a\b\025*\t\013Ek\005\031A\027\002\tMdw\016\036\005\006'6\003\r\001V\001\006gR\f7m\033\t\003+bk\021A\026\006\003/f\tA!\033;f[&\021\021L\026\002\n\023R,Wn\025;bG.DQa\027\001\005Bq\013abZ3u'R\f7m[%o'2|G\017\006\002U;\")\021K\027a\001[!)q\f\001C!A\006iA-Z2s'R\f7m[*ju\026$2\001V1c\021\025\tf\f1\001.\021\025\031g\f1\001.\003\031\tWn\\;oi\")Q\r\001C!M\0069r-\032;Ti\006\0347.\0238TY>$xJ\\\"m_NLgn\032\013\003)\036DQ!\0253A\0025BQ!\033\001\005B)\f\001d]3u\023:4XM\034;pef\034Fn\034;D_:$XM\034;t)\r\0213\016\034\005\006#\"\004\r!\f\005\006'\"\004\r\001\026\005\006]\002!\t%I\001\n[\006\0248\016R5sifDQ\001\035\001\005B\005\nQb\0349f]&sg/\0328u_JL\b\"\002:\001\t\003\n\023AD2m_N,\027J\034<f]R|'/\037\005\006i\002!I!^\001\fSN4\026\r\\5e'2|G\017\006\002?m\")\021k\035a\001[\001")
public interface InventoryProxy extends IInventory {
  IInventory inventory();
  
  int offset();
  
  int func_70302_i_();
  
  int func_70297_j_();
  
  String func_145825_b();
  
  boolean func_145818_k_();
  
  boolean func_70300_a(EntityPlayer paramEntityPlayer);
  
  boolean func_94041_b(int paramInt, ItemStack paramItemStack);
  
  ItemStack func_70301_a(int paramInt);
  
  ItemStack func_70298_a(int paramInt1, int paramInt2);
  
  ItemStack func_70304_b(int paramInt);
  
  void func_70299_a(int paramInt, ItemStack paramItemStack);
  
  void func_70296_d();
  
  void func_70295_k_();
  
  void func_70305_f();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\InventoryProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */