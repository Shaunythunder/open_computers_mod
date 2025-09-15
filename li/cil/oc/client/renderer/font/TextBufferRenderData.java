package li.cil.oc.client.renderer.font;

import li.cil.oc.util.TextBuffer;
import scala.Tuple2;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001Y2q!\001\002\021\002G\005qB\001\013UKb$()\0364gKJ\024VM\0343fe\022\013G/\031\006\003\007\021\tAAZ8oi*\021QAB\001\te\026tG-\032:fe*\021q\001C\001\007G2LWM\034;\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001a\005\002\001!A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032DQa\006\001\007\002a\tQ\001Z5sif,\022!\007\t\003#iI!a\007\n\003\017\t{w\016\\3b]\")Q\004\001D\001=\005IA-\033:us~#S-\035\013\003?\t\002\"!\005\021\n\005\005\022\"\001B+oSRDQa\t\017A\002e\tQA^1mk\026DQ!\n\001\007\002\031\nA\001Z1uCV\tq\005\005\002)W5\t\021F\003\002+\021\005!Q\017^5m\023\ta\023F\001\006UKb$()\0364gKJDQA\f\001\007\002=\n\001B^5foB|'\017^\013\002aA!\021#M\0324\023\t\021$C\001\004UkBdWM\r\t\003#QJ!!\016\n\003\007%sG\017")
public interface TextBufferRenderData {
  boolean dirty();
  
  void dirty_$eq(boolean paramBoolean);
  
  TextBuffer data();
  
  Tuple2<Object, Object> viewport();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\font\TextBufferRenderData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */