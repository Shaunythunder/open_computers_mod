package li.cil.oc.common.item.traits;

import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001a2q!\001\002\021\002\007\005qBA\004H!Vc\025n[3\013\005\r!\021A\002;sC&$8O\003\002\006\r\005!\021\016^3n\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011c\001\001\021-A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032\004\"a\006\r\016\003\tI!!\007\002\003\021\021+G.Z4bi\026DQa\007\001\005\002q\ta\001J5oSR$C#A\017\021\005Eq\022BA\020\023\005\021)f.\033;\t\013\005\002a\021\001\022\002\017\035\004X\017V5feV\t1\005\005\002\022I%\021QE\005\002\004\023:$\b\"B\024\001\t#B\023a\003;p_2$\030\016\035#bi\006,\022!\013\t\004UI*dBA\0261\035\tas&D\001.\025\tqc\"\001\004=e>|GOP\005\002'%\021\021GE\001\ba\006\0347.Y4f\023\t\031DGA\002TKFT!!\r\n\021\005E1\024BA\034\023\005\r\te.\037")
public interface GPULike extends Delegate {
  int gpuTier();
  
  Seq<Object> tooltipData();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\GPULike.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */