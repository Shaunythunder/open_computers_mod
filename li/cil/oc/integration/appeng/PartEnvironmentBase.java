package li.cil.oc.integration.appeng;

import appeng.api.parts.IPartHost;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.ManagedEnvironment;
import scala.reflect.ClassTag;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\00194q!\001\002\021\002\007\005QBA\nQCJ$XI\034<je>tW.\0328u\005\006\034XM\003\002\004\t\0051\021\r\0359f]\036T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017-A\021q\002F\007\002!)\021\021CE\001\005Y\006twMC\001\024\003\021Q\027M^1\n\005U\001\"AB(cU\026\034G\017\005\002\03095\t\001D\003\002\0325\0059a.\032;x_J\\'BA\016\007\003\r\t\007/[\005\003;a\021!#T1oC\036,G-\0228wSJ|g.\\3oi\")q\004\001C\001A\0051A%\0338ji\022\"\022!\t\t\003E\025j\021a\t\006\002I\005)1oY1mC&\021ae\t\002\005+:LG\017C\003)\001\031\005\021&\001\003i_N$X#\001\026\021\005-\002T\"\001\027\013\0055r\023!\0029beR\034(BA\0160\025\005\031\021BA\031-\005%I\005+\031:u\021>\034H\017C\0034\001\021\005A'A\007hKR\004\026M\035;D_:4\027nZ\013\003k\035#2AN+^)\t9T\bE\002#qiJ!!O\022\003\013\005\023(/Y=\021\005\tZ\024B\001\037$\005\031\te.\037*fM\"9aHMA\001\002\by\024AC3wS\022,gnY3%cA\031\001iQ#\016\003\005S!AQ\022\002\017I,g\r\\3di&\021A)\021\002\t\0072\f7o\035+bOB\021ai\022\007\001\t\025A%G1\001J\005!\001\026M\035;UsB,\027C\001&N!\t\0213*\003\002MG\t9aj\034;iS:<\007C\001(T\033\005y%B\001)R\003\025!\030\016\\3t\025\t\021f&A\bj[BdW-\\3oi\006$\030n\0348t\023\t!vJA\nJ'\026<W.\0328uK\022LeN^3oi>\024\030\020C\003We\001\007q+A\004d_:$X\r\037;\021\005a[V\"A-\013\005iS\022aB7bG\"Lg.Z\005\0039f\023qaQ8oi\026DH\017C\003_e\001\007q,\001\003be\036\034\bC\001-a\023\t\t\027LA\005Be\036,X.\0328ug\")1\r\001C\001I\006i1/\032;QCJ$8i\0348gS\036,\"!Z6\025\007\031dW\016\006\0028O\"9\001NYA\001\002\bI\027AC3wS\022,gnY3%eA\031\001i\0216\021\005\031[G!\002%c\005\004I\005\"\002,c\001\0049\006\"\0020c\001\004y\006")
public interface PartEnvironmentBase extends ManagedEnvironment {
  IPartHost host();
  
  <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] getPartConfig(Context paramContext, Arguments paramArguments, ClassTag<PartType> paramClassTag);
  
  <PartType extends appeng.api.implementations.tiles.ISegmentedInventory> Object[] setPartConfig(Context paramContext, Arguments paramArguments, ClassTag<PartType> paramClassTag);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\PartEnvironmentBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */