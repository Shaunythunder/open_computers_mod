package li.cil.oc.common.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import li.cil.oc.api.detail.ItemInfo;
import li.cil.oc.api.event.RackMountableRenderEvent;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001i;Q!\001\002\t\0025\t!DU1dW6{WO\034;bE2,'+\0328eKJD\025M\0343mKJT!a\001\003\002\013\0254XM\034;\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021!DU1dW6{WO\034;bE2,'+\0328eKJD\025M\0343mKJ\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002\003\005\035\037!\025\r\021\"\001\036\003I!\025n]6Ee&4X-T8v]R\f'\r\\3\026\003y\001\"a\b\023\016\003\001R!!\t\022\002\r\021,G/Y5m\025\t\031c!A\002ba&L!!\n\021\003\021%#X-\\%oM>D\001bJ\b\t\002\003\006KAH\001\024\t&\0348\016\022:jm\026lu.\0368uC\ndW\r\t\005\tS=A)\031!C\001U\00591+\032:wKJ\034X#A\026\021\007Mac$\003\002.)\t)\021I\035:bs\"Aqf\004E\001B\003&1&\001\005TKJ4XM]:!\021!\tt\002#b\001\n\003i\022A\004+fe6Lg.\0317TKJ4XM\035\005\tg=A\t\021)Q\005=\005yA+\032:nS:\fGnU3sm\026\024\b\005C\0036\037\021\005a'\001\rp]J\0137m['pk:$\030M\0317f%\026tG-\032:j]\036$\"a\016\036\021\005MA\024BA\035\025\005\021)f.\033;\t\013m\"\004\031\001\037\002\003\025\004\"!\020\"\017\005y\002U\"A \013\005\r\021\023BA!@\003a\021\026mY6N_VtG/\0312mKJ+g\016Z3s\013Z,g\016^\005\003\007\022\023!\002V5mK\026sG/\033;z\025\t\tu\b\013\0025\rB\021q)U\007\002\021*\021\021JS\001\rKZ,g\016\0365b]\022dWM\035\006\003\013-S!\001T'\002\007\031lGN\003\002O\037\006!Qn\0343t\025\005\001\026aA2qo&\021!\013\023\002\017'V\0247o\031:jE\026,e/\0328u\021\025)t\002\"\001U)\t9T\013C\003<'\002\007a\013\005\002>/&\021\001\f\022\002\006\0052|7m\033\025\003'\032\003")
public final class RackMountableRenderHandler {
  @SubscribeEvent
  public static void onRackMountableRendering(RackMountableRenderEvent.Block paramBlock) {
    RackMountableRenderHandler$.MODULE$.onRackMountableRendering(paramBlock);
  }
  
  @SubscribeEvent
  public static void onRackMountableRendering(RackMountableRenderEvent.TileEntity paramTileEntity) {
    RackMountableRenderHandler$.MODULE$.onRackMountableRendering(paramTileEntity);
  }
  
  public static ItemInfo TerminalServer() {
    return RackMountableRenderHandler$.MODULE$.TerminalServer();
  }
  
  public static ItemInfo[] Servers() {
    return RackMountableRenderHandler$.MODULE$.Servers();
  }
  
  public static ItemInfo DiskDriveMountable() {
    return RackMountableRenderHandler$.MODULE$.DiskDriveMountable();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\RackMountableRenderHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */