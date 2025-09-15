package li.cil.oc.integration.cofh.energy;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import li.cil.oc.api.event.RobotUsedToolEvent;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005<Q!\001\002\t\002=\t\001$\022<f]RD\025M\0343mKJ\024V\rZ:u_:,g\t\\;y\025\t\031A!\001\004f]\026\024x-\037\006\003\013\031\tAaY8gQ*\021q\001C\001\fS:$Xm\032:bi&|gN\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\001\"\001E\t\016\003\t1QA\005\002\t\002M\021\001$\022<f]RD\025M\0343mKJ\024V\rZ:u_:,g\t\\;y'\t\tB\003\005\002\02615\taCC\001\030\003\025\0318-\0317b\023\tIbC\001\004B]f\024VM\032\005\0067E!\t\001H\001\007y%t\027\016\036 \025\003=AQAH\t\005\002}\tac\0348S_\n|G/\0219qYf$\025-\\1hKJ\013G/\032\013\003A\r\002\"!F\021\n\005\t2\"\001B+oSRDQ\001J\017A\002\025\n\021!\032\t\003M9r!a\n\027\016\003!R!!\013\026\002\013\0254XM\034;\013\005-B\021aA1qS&\021Q\006K\001\023%>\024w\016^+tK\022$vn\0347Fm\026tG/\003\0020a\ty\021\t\0359ms\022\013W.Y4f%\006$XM\003\002.Q!\022QD\r\t\003gyj\021\001\016\006\003kY\nA\"\032<f]RD\027M\0343mKJT!a\016\035\002\r\r|W.\\8o\025\tI$(A\002g[2T!a\017\037\002\t5|Gm\035\006\002{\005\0311\r]<\n\005}\"$AD*vEN\034'/\0332f\013Z,g\016\036\005\006\003F!\tAQ\001\016O\026$H)\036:bE&d\027\016^=\025\005\r3\005CA\013E\023\t)eC\001\004E_V\024G.\032\005\006\017\002\003\r\001S\001\006gR\f7m\033\t\003\023Bk\021A\023\006\003\0272\013A!\033;f[*\021QJT\001\n[&tWm\031:bMRT\021aT\001\004]\026$\030BA)K\005%IE/Z7Ti\006\0347\016C\003T#\021\005A+A\005dC:\034\005.\031:hKR\021Q\013\027\t\003+YK!a\026\f\003\017\t{w\016\\3b]\")qI\025a\001\021\")!,\005C\0017\00611\r[1sO\026$Ba\021/^?\")q)\027a\001\021\")a,\027a\001\007\0061\021-\\8v]RDQ\001Y-A\002U\013\001b]5nk2\fG/\032")
public final class EventHandlerRedstoneFlux {
  public static double charge(ItemStack paramItemStack, double paramDouble, boolean paramBoolean) {
    return EventHandlerRedstoneFlux$.MODULE$.charge(paramItemStack, paramDouble, paramBoolean);
  }
  
  public static boolean canCharge(ItemStack paramItemStack) {
    return EventHandlerRedstoneFlux$.MODULE$.canCharge(paramItemStack);
  }
  
  public static double getDurability(ItemStack paramItemStack) {
    return EventHandlerRedstoneFlux$.MODULE$.getDurability(paramItemStack);
  }
  
  @SubscribeEvent
  public static void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate paramApplyDamageRate) {
    EventHandlerRedstoneFlux$.MODULE$.onRobotApplyDamageRate(paramApplyDamageRate);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\EventHandlerRedstoneFlux.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */