package li.cil.oc.integration.thaumicenergistics;

import appeng.api.parts.IPartHost;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.world.World;
import scala.reflect.ClassTag;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005\rbaB\001\003!\003\r\t!\004\002\024!\006\024H/\0228wSJ|g.\\3oi\n\0137/\032\006\003\007\021\t!\003\0365bk6L7-\0328fe\036L7\017^5dg*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\027!\tyA#D\001\021\025\t\t\"#\001\003mC:<'\"A\n\002\t)\fg/Y\005\003+A\021aa\0242kK\016$\bCA\f\035\033\005A\"BA\r\033\003\035qW\r^<pe.T!a\007\004\002\007\005\004\030.\003\002\0361\t\021R*\0318bO\026$WI\034<je>tW.\0328u\021\025y\002\001\"\001!\003\031!\023N\\5uIQ\t\021\005\005\002#K5\t1EC\001%\003\025\0318-\0317b\023\t13E\001\003V]&$\b\"\002\025\001\r\003I\023!B<pe2$W#\001\026\021\005-\nT\"\001\027\013\005!j#B\001\0300\003%i\027N\\3de\0064GOC\0011\003\rqW\r^\005\003e1\022QaV8sY\022DQ\001\016\001\007\002U\nA\001[8tiV\ta\007\005\0028{5\t\001H\003\002:u\005)\001/\031:ug*\0211d\017\006\002y\0051\021\r\0359f]\036L!A\020\035\003\023%\003\026M\035;I_N$\b\"\002!\001\t\023\t\025!\005:fg>dg/Z!ta\026\034Go\0257piR\031!)R(\021\005\t\032\025B\001#$\005\rIe\016\036\005\006\r~\002\raR\001\005a\006\024H\017\005\002I\0336\t\021J\003\002\032\025*\0211\nT\001\007G>lWn\0348\013\003\rI!AT%\003\037%\0135\017]3diNcw\016\036)beRDQ\001U A\002\t\013Aa\0357pi\")!\013\001C\001'\006Yq-\032;TY>$8+\033>f+\t!f\rF\002VYR$\"A\026/\021\007\t:\026,\003\002YG\t)\021I\035:bsB\021!EW\005\0037\016\022a!\0218z%\0264\007bB/R\003\003\005\035AX\001\013KZLG-\0328dK\022\n\004cA0cI6\t\001M\003\002bG\0059!/\0324mK\016$\030BA2a\005!\031E.Y:t)\006<\007CA3g\031\001!QaZ)C\002!\024\001\002U1siRK\b/Z\t\003S\036\003\"A\t6\n\005-\034#a\002(pi\"Lgn\032\005\006[F\003\rA\\\001\bG>tG/\032=u!\ty'/D\001q\025\t\t($A\004nC\016D\027N\\3\n\005M\004(aB\"p]R,\007\020\036\005\006kF\003\rA^\001\005CJ<7\017\005\002po&\021\001\020\035\002\n\003J<W/\\3oiNDQA\037\001\005\002m\fQbZ3u!\006\024HoQ8oM&<Wc\001?\002\006Q)Q0a\002\002\nQ\021aK \005\tf\f\t\021q\001\002\002\005QQM^5eK:\034W\r\n\032\021\t}\023\0271\001\t\004K\006\025A!B4z\005\004A\007\"B7z\001\004q\007\"B;z\001\0041\bbBA\007\001\021\005\021qB\001\016g\026$\b+\031:u\007>tg-[4\026\t\005E\021Q\004\013\007\003'\ty\"!\t\025\007Y\013)\002\003\006\002\030\005-\021\021!a\002\0033\t!\"\032<jI\026t7-\032\0234!\021y&-a\007\021\007\025\fi\002\002\004h\003\027\021\r\001\033\005\007[\006-\001\031\0018\t\rU\fY\0011\001w\001")
public interface PartEnvironmentBase extends ManagedEnvironment {
  World world();
  
  IPartHost host();
  
  <PartType extends thaumicenergistics.common.network.IAspectSlotPart> Object[] getSlotSize(Context paramContext, Arguments paramArguments, ClassTag<PartType> paramClassTag);
  
  <PartType extends thaumicenergistics.common.network.IAspectSlotPart> Object[] getPartConfig(Context paramContext, Arguments paramArguments, ClassTag<PartType> paramClassTag);
  
  <PartType extends thaumicenergistics.common.network.IAspectSlotPart> Object[] setPartConfig(Context paramContext, Arguments paramArguments, ClassTag<PartType> paramClassTag);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\PartEnvironmentBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */