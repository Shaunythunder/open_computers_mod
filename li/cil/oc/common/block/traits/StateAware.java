package li.cil.oc.common.block.traits;

import net.minecraft.world.World;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001u2q!\001\002\021\002\007\005qB\001\006Ti\006$X-Q<be\026T!a\001\003\002\rQ\024\030-\033;t\025\t)a!A\003cY>\0347N\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\t\001\001\003\005\002\022/5\t!C\003\002\006')\021A#F\001\n[&tWm\031:bMRT\021AF\001\004]\026$\030B\001\r\023\005\025\021En\\2l\021\025Q\002\001\"\001\034\003\031!\023N\\5uIQ\tA\004\005\002\036A5\taDC\001 \003\025\0318-\0317b\023\t\tcD\001\003V]&$\b\"B\022\001\t\003\"\023A\0075bg\016{W\016]1sCR|'/\0238qkR|e/\032:sS\022,G#A\023\021\005u1\023BA\024\037\005\035\021un\0347fC:DQ!\013\001\005B)\n!dZ3u\007>l\007/\031:bi>\024\030J\0349vi>3XM\035:jI\026$ba\013\0306oeZ\004CA\017-\023\ticDA\002J]RDQa\f\025A\002A\nQa^8sY\022\004\"!M\032\016\003IR!aL\n\n\005Q\022$!B,pe2$\007\"\002\034)\001\004Y\023!\001=\t\013aB\003\031A\026\002\003eDQA\017\025A\002-\n\021A\037\005\006y!\002\raK\001\005g&$W\r")
public interface StateAware {
  boolean hasComparatorInputOverride();
  
  int getComparatorInputOverride(World paramWorld, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\StateAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */