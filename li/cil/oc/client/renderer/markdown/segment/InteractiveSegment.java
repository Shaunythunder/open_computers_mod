package li.cil.oc.client.renderer.markdown.segment;

import scala.Option;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00153q!\001\002\021\002\007\005\021C\001\nJ]R,'/Y2uSZ,7+Z4nK:$(BA\002\005\003\035\031XmZ7f]RT!!\002\004\002\0215\f'o\0333po:T!a\002\005\002\021I,g\016Z3sKJT!!\003\006\002\r\rd\027.\0328u\025\tYA\"\001\002pG*\021QBD\001\004G&d'\"A\b\002\0051L7\001A\n\004\001IA\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\r\005\002\03255\t!!\003\002\034\005\t91+Z4nK:$\b\"B\017\001\t\003q\022A\002\023j]&$H\005F\001 !\t\031\002%\003\002\")\t!QK\\5u\021\025\031\003\001\"\001%\003\035!xn\0347uSB,\022!\n\t\004'\031B\023BA\024\025\005\031y\005\017^5p]B\021\021\006\f\b\003')J!a\013\013\002\rA\023X\rZ3g\023\ticF\001\004TiJLgn\032\006\003WQAQ\001\r\001\005\002E\nAb\0348N_V\034Xm\0217jG.$2AM\033;!\t\0312'\003\0025)\t9!i\\8mK\006t\007\"\002\0340\001\0049\024AB7pkN,\007\f\005\002\024q%\021\021\b\006\002\004\023:$\b\"B\0360\001\0049\024AB7pkN,\027\f\003\004>\001\021\005AAH\001\f]>$\030NZ=I_Z,'\017\003\004@\001\021\005A\001Q\001\rG\",7m\033%pm\026\024X\r\032\013\b\003\016#UiR%L!\r\031bE\021\t\0033\001AQA\016 A\002]BQa\017 A\002]BQA\022 A\002]\n\021\001\037\005\006\021z\002\raN\001\002s\")!J\020a\001o\005\tq\017C\003M}\001\007q'A\001i\001")
public interface InteractiveSegment extends Segment {
  Option<String> tooltip();
  
  boolean onMouseClick(int paramInt1, int paramInt2);
  
  void notifyHover();
  
  Option<InteractiveSegment> checkHovered(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\InteractiveSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */