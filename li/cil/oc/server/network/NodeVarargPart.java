package li.cil.oc.server.network;

import li.cil.oc.api.network.Node;
import scala.collection.Seq;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001-3q!\001\002\021\002\007\005QB\001\bO_\022,g+\031:be\036\004\026M\035;\013\005\r!\021a\0028fi^|'o\033\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022\001\0027b]\036T\021aE\001\005U\0064\030-\003\002\026!\t1qJ\0316fGR\004\"aF\016\016\003aQ!aA\r\013\005i1\021aA1qS&\021A\004\007\002\005\035>$W\rC\003\037\001\021\005q$\001\004%S:LG\017\n\013\002AA\021\021\005J\007\002E)\t1%A\003tG\006d\027-\003\002&E\t!QK\\5u\021\0259\003\001\"\001)\0035\031XM\0343U_\006#GM]3tgR!\001%\013\0325\021\025Qc\0051\001,\003\031!\030M]4fiB\021Af\f\b\003C5J!A\f\022\002\rA\023X\rZ3g\023\t\001\024G\001\004TiJLgn\032\006\003]\tBQa\r\024A\002-\nAA\\1nK\")QG\na\001m\005!A-\031;b!\r\ts'O\005\003q\t\022!\002\020:fa\026\fG/\0323?!\t\t#(\003\002<E\t1\021I\\=SK\032DQ!\020\001\005\002y\nqb]3oIR{g*Z5hQ\n|'o\035\013\004A}\002\005\"B\032=\001\004Y\003\"B\033=\001\0041\004\"\002\"\001\t\003\031\025aD:f]\022$vNU3bG\"\f'\r\\3\025\007\001\"U\tC\0034\003\002\0071\006C\0036\003\002\007a\007C\003H\001\021\005\001*A\007tK:$Gk\034,jg&\024G.\032\013\004A%S\005\"B\032G\001\004Y\003\"B\033G\001\0041\004")
public interface NodeVarargPart extends Node {
  void sendToAddress(String paramString1, String paramString2, Seq<Object> paramSeq);
  
  void sendToNeighbors(String paramString, Seq<Object> paramSeq);
  
  void sendToReachable(String paramString, Seq<Object> paramSeq);
  
  void sendToVisible(String paramString, Seq<Object> paramSeq);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\NodeVarargPart.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */