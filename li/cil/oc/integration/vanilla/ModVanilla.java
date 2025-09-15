package li.cil.oc.integration.vanilla;

import li.cil.oc.integration.Mods;
import li.cil.oc.util.BlockPosition;
import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0011<Q!\001\002\t\0025\t!\"T8e-\006t\027\016\0347b\025\t\031A!A\004wC:LG\016\\1\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005)iu\016\032,b]&dG.Y\n\005\037IQb\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tYB$D\001\005\023\tiBA\001\005N_\022\004&o\034=z!\ty\022G\004\002!]9\021\021\005\f\b\003E-r!a\t\026\017\005\021JcBA\023)\033\0051#BA\024\r\003\031a$o\\8u}%\t1\"\003\002\n\025%\021q\001C\005\003\013\031I!!\f\003\002\tU$\030\016\\\005\003_A\nqBQ;oI2,GMU3egR|g.\032\006\003[\021I!AM\032\003!I+Gm\035;p]\026\004&o\034<jI\026\024(BA\0301\021\025)t\002\"\0017\003\031a\024N\\5u}Q\tQ\002C\0039\037\021\005\021(\001\004hKRlu\016\032\013\002uA\0211H\020\b\0037qJ!!\020\003\002\t5{Gm]\005\003\001\023\021bU5na2,Wj\0343\013\005u\"\001\"\002\"\020\t\003\031\025AC5oSRL\027\r\\5{KR\tA\t\005\002F\0216\taIC\001H\003\025\0318-\0317b\023\tIeI\001\003V]&$\b\"B&\020\t\003b\025\001D2p[B,H/Z%oaV$HcA'Q/B\021QIT\005\003\037\032\0231!\0238u\021\025\t&\n1\001S\003\r\001xn\035\t\003'Vk\021\001\026\006\003[\031I!A\026+\003\033\tcwnY6Q_NLG/[8o\021\025A&\n1\001Z\003\021\031\030\016Z3\021\005i\023W\"A.\013\0055b&BA/_\003\031\031w.\\7p]*\021q\fY\001\017[&tWm\031:bMR4wN]4f\025\005\t\027a\0018fi&\0211m\027\002\017\r>\024x-\032#je\026\034G/[8o\021\025)w\002\"\021g\003M\031w.\0349vi\026\024UO\0343mK\022Le\016];u)\r9'n\033\t\004\013\"l\025BA5G\005\025\t%O]1z\021\025\tF\r1\001S\021\025AF\r1\001Z\001")
public final class ModVanilla {
  public static int[] computeBundledInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
    return ModVanilla$.MODULE$.computeBundledInput(paramBlockPosition, paramForgeDirection);
  }
  
  public static int computeInput(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection) {
    return ModVanilla$.MODULE$.computeInput(paramBlockPosition, paramForgeDirection);
  }
  
  public static void initialize() {
    ModVanilla$.MODULE$.initialize();
  }
  
  public static Mods.SimpleMod getMod() {
    return ModVanilla$.MODULE$.getMod();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\ModVanilla.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */