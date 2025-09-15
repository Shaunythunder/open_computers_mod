package li.cil.oc.common.inventory;

import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001)3q!\001\002\021\002\007\005QBA\tECR\f'-Y:f\023:4XM\034;pefT!a\001\003\002\023%tg/\0328u_JL(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9\002$D\001\003\023\tI\"A\001\nJi\026l7\013^1dW&sg/\0328u_JL\b\"B\016\001\t\003a\022A\002\023j]&$H\005F\001\036!\tq\022%D\001 \025\005\001\023!B:dC2\f\027B\001\022 \005\021)f.\033;\t\013\021\002A\021A\023\002\tQLWM]\013\002MA\021adJ\005\003Q}\0211!\0238u\021\025Q\003\001\"\021,\003A9W\r^*ju\026LeN^3oi>\024\030\020F\001'\021\025i\003\001\"\025/\0035IgN^3oi>\024\030PT1nKV\tq\006\005\002\020a%\021\021\007\005\002\007'R\024\030N\\4\t\013M\002A\021I\026\002-\035,G/\0238wK:$xN]=Ti\006\0347\016T5nSRDQ!\016\001\005B\025\n\021dZ3u\023:4XM\034;pef\034F/Y2l%\026\fX/\033:fI\")q\007\001C!q\005\021\022n]%uK64\026\r\\5e\r>\0248\013\\8u)\rIDH\020\t\003=iJ!aO\020\003\017\t{w\016\\3b]\")QH\016a\001M\005!1\017\\8u\021\025yd\0071\001A\003\025\031H/Y2l!\t\t\005*D\001C\025\t\031E)\001\003ji\026l'BA#G\003%i\027N\\3de\0064GOC\001H\003\rqW\r^\005\003\023\n\023\021\"\023;f[N#\030mY6")
public interface DatabaseInventory extends ItemStackInventory {
  int tier();
  
  int func_70302_i_();
  
  String inventoryName();
  
  int func_70297_j_();
  
  int getInventoryStackRequired();
  
  boolean func_94041_b(int paramInt, ItemStack paramItemStack);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\DatabaseInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */