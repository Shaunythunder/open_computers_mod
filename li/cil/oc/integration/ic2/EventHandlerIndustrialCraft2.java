package li.cil.oc.integration.ic2;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import li.cil.oc.api.event.GeolyzerEvent;
import li.cil.oc.api.event.RobotUsedToolEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0055q!B\001\003\021\003i\021\001H#wK:$\b*\0318eY\026\024\030J\0343vgR\024\030.\0317De\0064GO\r\006\003\007\021\t1![23\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\taRI^3oi\"\013g\016\0327fe&sG-^:ue&\fGn\021:bMR\0244CA\b\023!\t\031b#D\001\025\025\005)\022!B:dC2\f\027BA\f\025\005\031\te.\037*fM\")\021d\004C\0015\0051A(\0338jiz\"\022!\004\005\0069=!\t!H\001\022_:<Um\0347zu\026\024\030I\\1msj,GC\001\020\"!\t\031r$\003\002!)\t!QK\\5u\021\025\0213\0041\001$\003\005)\007C\001\023-\035\t)#&D\001'\025\t9\003&A\003fm\026tGO\003\002*\r\005\031\021\r]5\n\005-2\023!D$f_2L(0\032:Fm\026tG/\003\002.]\t9\021I\\1msj,'BA\026'Q\tY\002\007\005\0022y5\t!G\003\0024i\005aQM^3oi\"\fg\016\0327fe*\021QGN\001\007G>lWn\0348\013\005]B\024a\0014nY*\021\021HO\001\005[>$7OC\001<\003\r\031\007o^\005\003{I\022abU;cg\016\024\030NY3Fm\026tG\017C\003@\037\021\005\001)\001\fp]J{'m\034;BaBd\027\020R1nC\036,'+\031;f)\tq\022\tC\003#}\001\007!\t\005\002D\r:\021Q\005R\005\003\013\032\n!CU8c_R,6/\0323U_>dWI^3oi&\021q\t\023\002\020\003B\004H.\037#b[\006<WMU1uK*\021QI\n\025\003}ABQaS\b\005\0021\013QbZ3u\tV\024\030MY5mSRLHCA'Q!\t\031b*\003\002P)\t1Ai\\;cY\026DQ!\025&A\002I\013Qa\035;bG.\004\"a\025.\016\003QS!!\026,\002\t%$X-\034\006\003/b\013\021\"\\5oK\016\024\030M\032;\013\003e\0131A\\3u\023\tYFKA\005Ji\026l7\013^1dW\")Ql\004C\001=\006IQo]3Xe\026t7\r\033\013\007?\n\\\007O\035;\021\005M\001\027BA1\025\005\035\021un\0347fC:DQa\031/A\002\021\fa\001\0357bs\026\024\bCA3j\033\0051'BA2h\025\tAg+\001\004f]RLG/_\005\003U\032\024A\"\0228uSRL\b\013\\1zKJDQ\001\034/A\0025\f\021\001\037\t\003'9L!a\034\013\003\007%sG\017C\003r9\002\007Q.A\001z\021\025\031H\f1\001n\003\005Q\b\"B;]\001\004y\026\001E2iC:<W\rR;sC\nLG.\033;z\021\0259x\002\"\001y\003!I7o\026:f]\016DGCA0z\021\025\tf\0171\001S\021\025Yx\002\"\001}\003%\031\027M\\\"iCJ<W\r\006\002`{\")\021K\037a\001%\"1qp\004C\001\003\003\taa\0315be\036,GcB'\002\004\005\025\021\021\002\005\006#z\004\rA\025\005\007\003\017q\b\031A'\002\r\005lw.\0368u\021\031\tYA a\001?\006A1/[7vY\006$X\r")
public final class EventHandlerIndustrialCraft2 {
  public static double charge(ItemStack paramItemStack, double paramDouble, boolean paramBoolean) {
    return EventHandlerIndustrialCraft2$.MODULE$.charge(paramItemStack, paramDouble, paramBoolean);
  }
  
  public static boolean canCharge(ItemStack paramItemStack) {
    return EventHandlerIndustrialCraft2$.MODULE$.canCharge(paramItemStack);
  }
  
  public static boolean isWrench(ItemStack paramItemStack) {
    return EventHandlerIndustrialCraft2$.MODULE$.isWrench(paramItemStack);
  }
  
  public static boolean useWrench(EntityPlayer paramEntityPlayer, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    return EventHandlerIndustrialCraft2$.MODULE$.useWrench(paramEntityPlayer, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public static double getDurability(ItemStack paramItemStack) {
    return EventHandlerIndustrialCraft2$.MODULE$.getDurability(paramItemStack);
  }
  
  @SubscribeEvent
  public static void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate paramApplyDamageRate) {
    EventHandlerIndustrialCraft2$.MODULE$.onRobotApplyDamageRate(paramApplyDamageRate);
  }
  
  @SubscribeEvent
  public static void onGeolyzerAnalyze(GeolyzerEvent.Analyze paramAnalyze) {
    EventHandlerIndustrialCraft2$.MODULE$.onGeolyzerAnalyze(paramAnalyze);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\EventHandlerIndustrialCraft2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */