package li.cil.oc.common.inventory;

import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001!3q!\001\002\021\002\007\005QBA\016ESN\\GI]5wK6{WO\034;bE2,\027J\034<f]R|'/\037\006\003\007\021\t\021\"\0338wK:$xN]=\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\027!\tyA#D\001\021\025\t\t\"#\001\003mC:<'\"A\n\002\t)\fg/Y\005\003+A\021aa\0242kK\016$\bCA\f\031\033\005\021\021BA\r\003\005IIE/Z7Ti\006\0347.\0238wK:$xN]=\t\013m\001A\021\001\017\002\r\021Jg.\033;%)\005i\002C\001\020\"\033\005y\"\"\001\021\002\013M\034\027\r\\1\n\005\tz\"\001B+oSRDQ\001\n\001\005\002\025\nA\001^5feV\ta\005\005\002\037O%\021\001f\b\002\004\023:$\b\"\002\026\001\t\003Z\023\001E4fiNK'0Z%om\026tGo\034:z)\0051\003\"B\027\001\t#r\023!D5om\026tGo\034:z\035\006lW-F\0010!\ty\001'\003\0022!\t11\013\036:j]\036DQa\r\001\005B-\nacZ3u\023:4XM\034;pef\034F/Y2l\031&l\027\016\036\005\006k\001!\tEN\001\023SNLE/Z7WC2LGMR8s'2|G\017F\0028uq\002\"A\b\035\n\005ez\"a\002\"p_2,\027M\034\005\006wQ\002\rAJ\001\005g2|G\017C\003>i\001\007a(A\003ti\006\0347\016\005\002@\r6\t\001I\003\002B\005\006!\021\016^3n\025\t\031E)A\005nS:,7M]1gi*\tQ)A\002oKRL!a\022!\003\023%#X-\\*uC\016\\\007")
public interface DiskDriveMountableInventory extends ItemStackInventory {
  int tier();
  
  int func_70302_i_();
  
  String inventoryName();
  
  int func_70297_j_();
  
  boolean func_94041_b(int paramInt, ItemStack paramItemStack);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\DiskDriveMountableInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */