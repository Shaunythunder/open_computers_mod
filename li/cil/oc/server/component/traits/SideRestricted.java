package li.cil.oc.server.component.traits;

import li.cil.oc.api.machine.Arguments;
import net.minecraftforge.common.util.ForgeDirection;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001Q2q!\001\002\021\002G\005qB\001\bTS\022,'+Z:ue&\034G/\0323\013\005\r!\021A\002;sC&$8O\003\002\006\r\005I1m\\7q_:,g\016\036\006\003\017!\taa]3sm\026\024(BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\021\001\001\005\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\t\013]\001a\021\003\r\002%\rDWmY6TS\022,gi\034:BGRLwN\034\013\0043\025z\003C\001\016$\033\005Y\"B\001\017\036\003\021)H/\0337\013\005yy\022AB2p[6|gN\003\002!C\005qQ.\0338fGJ\fg\r\0364pe\036,'\"\001\022\002\0079,G/\003\002%7\tqai\034:hK\022K'/Z2uS>t\007\"\002\024\027\001\0049\023\001B1sON\004\"\001K\027\016\003%R!AK\026\002\0175\f7\r[5oK*\021A\006C\001\004CBL\027B\001\030*\005%\t%oZ;nK:$8\017C\0031-\001\007\021'A\001o!\t\t\"'\003\0024%\t\031\021J\034;")
public interface SideRestricted {
  ForgeDirection checkSideForAction(Arguments paramArguments, int paramInt);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\SideRestricted.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */