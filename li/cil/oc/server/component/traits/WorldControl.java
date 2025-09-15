package li.cil.oc.server.component.traits;

import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001}2q!\001\002\021\002\007\005qB\001\007X_JdGmQ8oiJ|GN\003\002\004\t\0051AO]1jiNT!!\002\004\002\023\r|W\016]8oK:$(BA\004\t\003\031\031XM\035<fe*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\t\001\001bC\007\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\021\005]AR\"\001\002\n\005e\021!AC,pe2$\027i^1sKB\021qcG\005\0039\t\021abU5eKJ+7\017\036:jGR,G\rC\003\037\001\021\005q$\001\004%S:LG\017\n\013\002AA\021\021#I\005\003EI\021A!\0268ji\")A\005\001C\001K\0051A-\032;fGR$2AJ\0254!\r\tr\005E\005\003QI\021Q!\021:sCfDQAK\022A\002-\nqaY8oi\026DH\017\005\002-c5\tQF\003\002/_\0059Q.Y2iS:,'B\001\031\t\003\r\t\007/[\005\003e5\022qaQ8oi\026DH\017C\0035G\001\007Q'\001\003be\036\034\bC\001\0277\023\t9TFA\005Be\036,X.\0328ug\"\"1%\017\037>!\ta#(\003\002<[\tA1)\0317mE\006\0347.A\002e_\016\f\023AP\001{MVt7\r^5p]\"\032\030\016Z3;]Vl'-\032:*u\t|w\016\\3b]2\0023\017\036:j]\036\004S&\f\021DQ\026\0347n\035\021uQ\026\0043m\0348uK:$8\017I8gAQDW\r\t2m_\016\\\007e\0348!i\",\007e\0359fG&4\027.\0323!g&$Wm\035\021b]\022\004#/\032;ve:\034\b\005\0365fA\031Lg\016Z5oONt\003")
public interface WorldControl extends WorldAware, SideRestricted {
  @Callback(doc = "function(side:number):boolean, string -- Checks the contents of the block on the specified sides and returns the findings.")
  Object[] detect(Context paramContext, Arguments paramArguments);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */