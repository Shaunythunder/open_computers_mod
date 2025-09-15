package li.cil.oc.common.tileentity.traits;

import cpw.mods.fml.common.Optional.Method;
import li.cil.oc.api.util.StateAware;
import li.cil.oc.common.asm.Injectable.Interface;
import scala.reflect.ScalaSignature;

@Interface(value = "buildcraft.api.tiles.IHasWork", modid = "BuildCraft|Core")
@ScalaSignature(bytes = "\006\001=3q!\001\002\021\002\007\005qB\001\006Ti\006$X-Q<be\026T!a\001\003\002\rQ\024\030-\033;t\025\t)a!\001\006uS2,WM\034;jifT!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\004\001AA\002CA\t\027\033\005\021\"BA\n\025\003\021a\027M\\4\013\003U\tAA[1wC&\021qC\005\002\007\037\nTWm\031;\021\005eqR\"\001\016\013\005ma\022\001B;uS2T!!\b\005\002\007\005\004\030.\003\002\0025!)\001\005\001C\001C\0051A%\0338ji\022\"\022A\t\t\003G\031j\021\001\n\006\002K\005)1oY1mC&\021q\005\n\002\005+:LG\017C\003*\001\021\005!&A\004iCN<vN]6\026\003-\002\"a\t\027\n\0055\"#a\002\"p_2,\027M\034\025\005Q=rt\b\005\0021w9\021\021'O\007\002e)\021qa\r\006\003iU\n1AZ7m\025\t1t'\001\003n_\022\034(\"\001\035\002\007\r\004x/\003\002;e\005Aq\n\035;j_:\fG.\003\002={\t1Q*\032;i_\022T!A\017\032\002\0135|G-\0333\"\003\001\013qBQ;jY\022\034%/\0314uy\016{'/\032\025\007\001\tcUJP \021\005\rKeB\001#H\033\005)%B\001$\007\003\r\t7/\\\005\003\021\026\013!\"\0238kK\016$\030M\0317f\023\tQ5JA\005J]R,'OZ1dK*\021\001*R\001\006m\006dW/Z\021\002\035\006i\"-^5mI\016\024\030M\032;/CBLg\006^5mKNt\023\nS1t/>\0248\016")
public interface StateAware extends StateAware {
  @Method(modid = "BuildCraft|Core")
  boolean hasWork();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\StateAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */