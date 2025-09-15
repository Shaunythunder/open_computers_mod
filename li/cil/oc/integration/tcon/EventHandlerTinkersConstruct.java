package li.cil.oc.integration.tcon;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import li.cil.oc.api.event.RobotUsedToolEvent;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001];Q!\001\002\t\0025\tA$\022<f]RD\025M\0343mKJ$\026N\\6feN\034uN\\:ueV\034GO\003\002\004\t\005!AoY8o\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\taRI^3oi\"\013g\016\0327feRKgn[3sg\016{gn\035;sk\016$8CA\b\023!\t\031b#D\001\025\025\005)\022!B:dC2\f\027BA\f\025\005\031\te.\037*fM\")\021d\004C\0015\0051A(\0338jiz\"\022!\004\005\0069=!\t!H\001\rSN$\026N\\6feR{w\016\034\013\003=\005\002\"aE\020\n\005\001\"\"a\002\"p_2,\027M\034\005\006Em\001\raI\001\006gR\f7m\033\t\003I-j\021!\n\006\003M\035\nA!\033;f[*\021\001&K\001\n[&tWm\031:bMRT\021AK\001\004]\026$\030B\001\027&\005%IE/Z7Ti\006\0347\016C\003/\037\021\005q&\001\fp]J{'m\034;BaBd\027\020R1nC\036,'+\031;f)\t\0014\007\005\002\024c%\021!\007\006\002\005+:LG\017C\0035[\001\007Q'A\001f!\t1dH\004\0028y5\t\001H\003\002:u\005)QM^3oi*\0211HB\001\004CBL\027BA\0379\003I\021vNY8u+N,G\rV8pY\0263XM\034;\n\005}\002%aD!qa2LH)Y7bO\026\024\026\r^3\013\005uB\004FA\027C!\t\031e*D\001E\025\t)e)\001\007fm\026tG\017[1oI2,'O\003\002H\021\00611m\\7n_:T!!\023&\002\007\031lGN\003\002L\031\006!Qn\0343t\025\005i\025aA2qo&\021q\n\022\002\017'V\0247o\031:jE\026,e/\0328u\021\025\tv\002\"\001S\00359W\r\036#ve\006\024\027\016\\5usR\0211K\026\t\003'QK!!\026\013\003\r\021{WO\0317f\021\025\021\003\0131\001$\001")
public final class EventHandlerTinkersConstruct {
  public static double getDurability(ItemStack paramItemStack) {
    return EventHandlerTinkersConstruct$.MODULE$.getDurability(paramItemStack);
  }
  
  @SubscribeEvent
  public static void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate paramApplyDamageRate) {
    EventHandlerTinkersConstruct$.MODULE$.onRobotApplyDamageRate(paramApplyDamageRate);
  }
  
  public static boolean isTinkerTool(ItemStack paramItemStack) {
    return EventHandlerTinkersConstruct$.MODULE$.isTinkerTool(paramItemStack);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tcon\EventHandlerTinkersConstruct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */