package li.cil.oc.common.tileentity.traits;

import li.cil.oc.api.network.Analyzable;
import li.cil.oc.api.network.Node;
import net.minecraft.entity.player.EntityPlayer;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00153q!\001\002\021\002\007\005qBA\007O_R\fe.\0317zu\006\024G.\032\006\003\007\021\ta\001\036:bSR\034(BA\003\007\003)!\030\016\\3f]RLG/\037\006\003\017!\taaY8n[>t'BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\031\001\001\005\r\021\005E1R\"\001\n\013\005M!\022\001\0027b]\036T\021!F\001\005U\0064\030-\003\002\030%\t1qJ\0316fGR\004\"!\007\020\016\003iQ!a\007\017\002\0179,Go^8sW*\021Q\004C\001\004CBL\027BA\020\033\005)\te.\0317zu\006\024G.\032\005\006C\001!\tAI\001\007I%t\027\016\036\023\025\003\r\002\"\001J\024\016\003\025R\021AJ\001\006g\016\fG.Y\005\003Q\025\022A!\0268ji\")!\006\001C!W\005IqN\\!oC2L(0\032\013\007YIzD)S&\021\007\021js&\003\002/K\t)\021I\035:bsB\021\021\004M\005\003ci\021AAT8eK\")1'\013a\001i\0051\001\017\\1zKJ\004\"!N\037\016\003YR!aM\034\013\005aJ\024AB3oi&$\030P\003\002;w\005IQ.\0338fGJ\fg\r\036\006\002y\005\031a.\032;\n\005y2$\001D#oi&$\030\020\0257bs\026\024\b\"\002!*\001\004\t\025\001B:jI\026\004\"\001\n\"\n\005\r+#aA%oi\")Q)\013a\001\r\006!\001.\033;Y!\t!s)\003\002IK\t)a\t\\8bi\")!*\013a\001\r\006!\001.\033;Z\021\025a\025\0061\001G\003\021A\027\016\036.")
public interface NotAnalyzable extends Analyzable {
  Node[] onAnalyze(EntityPlayer paramEntityPlayer, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\NotAnalyzable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */