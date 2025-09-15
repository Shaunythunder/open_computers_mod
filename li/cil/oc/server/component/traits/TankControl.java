package li.cil.oc.server.component.traits;

import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0314q!\001\002\021\002\007\005qBA\006UC:\\7i\0348ue>d'BA\002\005\003\031!(/Y5ug*\021QAB\001\nG>l\007o\0348f]RT!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\004\001A1\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\r\005\002\03015\t!!\003\002\032\005\tIA+\0318l\003^\f'/\032\005\0067\001!\t\001H\001\007I%t\027\016\036\023\025\003u\001\"!\005\020\n\005}\021\"\001B+oSRDQ!\t\001\005\002\t\n\021\002^1oW\016{WO\034;\025\007\r2\003\007E\002\022IAI!!\n\n\003\013\005\023(/Y=\t\013\035\002\003\031\001\025\002\017\r|g\016^3yiB\021\021FL\007\002U)\0211\006L\001\b[\006\034\007.\0338f\025\ti\003\"A\002ba&L!a\f\026\003\017\r{g\016^3yi\")\021\007\ta\001e\005!\021M]4t!\tI3'\003\0025U\tI\021I]4v[\026tGo\035\025\005AYJ$\b\005\002*o%\021\001H\013\002\t\007\006dGNY1dW\006\031Am\\2\"\003m\n\021IZ;oGRLwN\034\025*u9,XNY3sA5j\003\005\0265fA9,XNY3sA=4\007\005^1oWN\004\023N\\:uC2dW\r\032\021j]\002\"\b.\032\021eKZL7-\032\030\t\013u\002A\021\001 \002\025M,G.Z2u)\006t7\016F\002$\001CQa\n\037A\002!BQ!\r\037A\002IBC\001\020\034:\005\006\n1)\0014gk:\034G/[8oQmKg\016Z3yu9,XNY3s;&Rd.^7cKJ\004S&\f\021TK2,7\r\036\021bAQ\fgn\033\021b]\022|sN\035\021hKR\004C\017[3!]Vl'-\032:!_\032\004C\017[3!GV\024(/\0328uYf\0043/\0327fGR,G\r\t;b].t\003\"B#\001\t\0031\025!\003;b].dUM^3m)\r\031s\t\023\005\006O\021\003\r\001\013\005\006c\021\003\rA\r\025\007\tZR5*\017'\002\r\021L'/Z2u3\005\t\021%A'\0025\032,hn\031;j_:D3,\0338eKbTd.^7cKJl\026F\0178v[\n,'\017I\027.A\035+G\017\t;iK\0022G.^5eA\005lw.\0368uA%t\007\005\0365fAM\004XmY5gS\026$\007e\034:!g\026dWm\031;fI\002\"\030M\\6/\021\025y\005\001\"\001Q\003%!\030M\\6Ta\006\034W\rF\002$#JCQa\n(A\002!BQ!\r(A\002IBcA\024\034K\027f\"\026%A+\002M\032,hn\031;j_:D3,\0338eKbTd.^7cKJl\026F\0178v[\n,'\017I\027.A\035+G\017\t;iK\002\022X-\\1j]&tw\r\t4mk&$\007eY1qC\016LG/\037\021j]\002\"\b.\032\021ta\026\034\027NZ5fI\002z'\017I:fY\026\034G/\0323!i\006t7N\f\005\006/\002!\t\001W\001\017G>l\007/\031:f\r2,\030\016\032+p)\r\031\023L\027\005\006OY\003\r\001\013\005\006cY\003\rA\r\025\005-ZJD,I\001^\003Q4WO\\2uS>t\007&\0338eKbTd.^7cKJL#HY8pY\026\fg\016I\027.A\r{W\016]1sKN\004C\017[3!M2,\030\016Z:!S:\004C\017[3!g\026dWm\031;fI\002\ng\016\032\021uQ\026\0043\017]3dS\032LW\r\032\021uC:\\g\006\t*fiV\024hn\035\021ueV,\007%\0334!KF,\030\r\034\030\t\013}\003A\021\0011\002\037Q\024\030M\\:gKJ4E.^5e)>$2aI1c\021\0259c\f1\001)\021\025\td\f1\0013Q\021qf'\0173\"\003\025\f\0211\0034v]\016$\030n\0348)S:$W\r\037\036ok6\024WM].-A\r|WO\034;;]Vl'-\032:>cA\002\004'X\025;E>|G.Z1oA5j\003%T8wK\002\"\b.\032\021ta\026\034\027NZ5fI\002\nWn\\;oi\002zg\r\t4mk&$\007E\032:p[\002\"\b.\032\021tK2,7\r^3eAQ\fgn\033\021j]R|\007\005\0365fAM\004XmY5gS\026$\007\005^1oW:\002")
public interface TankControl extends TankAware {
  @Callback(doc = "function():number -- The number of tanks installed in the device.")
  Object[] tankCount(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function([index:number]):number -- Select a tank and/or get the number of the currently selected tank.")
  Object[] selectTank(Context paramContext, Arguments paramArguments);
  
  @Callback(direct = true, doc = "function([index:number]):number -- Get the fluid amount in the specified or selected tank.")
  Object[] tankLevel(Context paramContext, Arguments paramArguments);
  
  @Callback(direct = true, doc = "function([index:number]):number -- Get the remaining fluid capacity in the specified or selected tank.")
  Object[] tankSpace(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function(index:number):boolean -- Compares the fluids in the selected and the specified tank. Returns true if equal.")
  Object[] compareFluidTo(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function(index:number[, count:number=1000]):boolean -- Move the specified amount of fluid from the selected tank into the specified tank.")
  Object[] transferFluidTo(Context paramContext, Arguments paramArguments);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\TankControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */