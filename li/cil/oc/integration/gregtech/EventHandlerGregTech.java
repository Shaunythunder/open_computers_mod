package li.cil.oc.integration.gregtech;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import li.cil.oc.api.event.GeolyzerEvent;
import li.cil.oc.api.event.RobotUsedToolEvent;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001q;Q!\001\002\t\0025\tA#\022<f]RD\025M\0343mKJ<%/Z4UK\016D'BA\002\005\003!9'/Z4uK\016D'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\013Fm\026tG\017S1oI2,'o\022:fOR+7\r[\n\003\037I\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007\"B\r\020\t\003Q\022A\002\037j]&$h\bF\001\016\021\025ar\002\"\001\036\003EygnR3pYfTXM]!oC2L(0\032\013\003=\005\002\"aE\020\n\005\001\"\"\001B+oSRDQAI\016A\002\r\n\021!\032\t\003I1r!!\n\026\016\003\031R!a\n\025\002\013\0254XM\034;\013\005%2\021aA1qS&\0211FJ\001\016\017\026|G.\037>fe\0263XM\034;\n\0055r#aB!oC2L(0\032\006\003W\031B#a\007\031\021\005EbT\"\001\032\013\005M\"\024\001D3wK:$\b.\0318eY\026\024(BA\0337\003\031\031w.\\7p]*\021q\007O\001\004M6d'BA\035;\003\021iw\016Z:\013\003m\n1a\0319x\023\ti$G\001\bTk\n\0348M]5cK\0263XM\034;\t\013}zA\021\001!\002-=t'k\0342pi\006\003\b\017\\=EC6\fw-\032*bi\026$\"AH!\t\013\tr\004\031\001\"\021\005\r3eBA\023E\023\t)e%\001\nS_\n|G/V:fIR{w\016\\#wK:$\030BA$I\005=\t\005\017\0357z\t\006l\027mZ3SCR,'BA#'Q\tq\004\007C\003L\037\021\005A*A\007hKR$UO]1cS2LG/\037\013\003\033B\003\"a\005(\n\005=#\"A\002#pk\ndW\rC\003R\025\002\007!+A\003ti\006\0347\016\005\002T56\tAK\003\002V-\006!\021\016^3n\025\t9\006,A\005nS:,7M]1gi*\t\021,A\002oKRL!a\027+\003\023%#X-\\*uC\016\\\007")
public final class EventHandlerGregTech {
  public static double getDurability(ItemStack paramItemStack) {
    return EventHandlerGregTech$.MODULE$.getDurability(paramItemStack);
  }
  
  @SubscribeEvent
  public static void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate paramApplyDamageRate) {
    EventHandlerGregTech$.MODULE$.onRobotApplyDamageRate(paramApplyDamageRate);
  }
  
  @SubscribeEvent
  public static void onGeolyzerAnalyze(GeolyzerEvent.Analyze paramAnalyze) {
    EventHandlerGregTech$.MODULE$.onGeolyzerAnalyze(paramAnalyze);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gregtech\EventHandlerGregTech.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */