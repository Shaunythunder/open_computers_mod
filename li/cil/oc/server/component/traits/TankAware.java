package li.cil.oc.server.component.traits;

import li.cil.oc.api.internal.MultiTank;
import li.cil.oc.api.machine.Arguments;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidTank;
import scala.Option;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\r4q!\001\002\021\002\007\005qBA\005UC:\\\027i^1sK*\0211\001B\001\007iJ\f\027\016^:\013\005\0251\021!C2p[B|g.\0328u\025\t9\001\"\001\004tKJ4XM\035\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\tB#D\001\023\025\005\031\022!B:dC2\f\027BA\013\023\005\031\te.\037*fM\")q\003\001C\0011\0051A%\0338ji\022\"\022!\007\t\003#iI!a\007\n\003\tUs\027\016\036\005\006;\0011\tAH\001\005i\006t7.F\001 !\t\001S%D\001\"\025\t\0213%\001\005j]R,'O\\1m\025\t!\003\"A\002ba&L!AJ\021\003\0235+H\016^5UC:\\\007\"\002\025\001\r\003I\023\001D:fY\026\034G/\0323UC:\\W#\001\026\021\005EY\023B\001\027\023\005\rIe\016\036\005\006]\0011\taL\001\021g\026dWm\031;fIR\013gn[0%KF$\"!\007\031\t\013Ej\003\031\001\026\002\013Y\fG.^3\t\013M\002A\021\003\033\002\017=\004H\017V1oWR\031!&N\037\t\013Y\022\004\031A\034\002\t\005\024xm\035\t\003qmj\021!\017\006\003u\r\nq!\\1dQ&tW-\003\002=s\tI\021I]4v[\026tGo\035\005\006}I\002\rAK\001\002]\")\001\t\001C\t\003\0069q-\032;UC:\\GC\001\"P!\r\t2)R\005\003\tJ\021aa\0249uS>t\007C\001$N\033\0059%B\001%J\003\0311G.^5eg*\021!jS\001\017[&tWm\031:bMR4wN]4f\025\005a\025a\0018fi&\021aj\022\002\013\023\032cW/\0333UC:\\\007\"\002)@\001\004Q\023!B5oI\026D\b\"\002*\001\t#\031\026a\0034mk&$\027J\034+b].$\"\001\026-\021\007E\031U\013\005\002G-&\021qk\022\002\013\r2,\030\016Z*uC\016\\\007\"\002)R\001\004Q\003\"\002.\001\t#Y\026!\0055bm\026\034\026-\\3GYVLG\rV=qKR\031AlX1\021\005Ei\026B\0010\023\005\035\021un\0347fC:DQ\001Y-A\002U\013aa\035;bG.\f\005\"\0022Z\001\004)\026AB:uC\016\\'\t")
public interface TankAware {
  MultiTank tank();
  
  int selectedTank();
  
  void selectedTank_$eq(int paramInt);
  
  int optTank(Arguments paramArguments, int paramInt);
  
  Option<IFluidTank> getTank(int paramInt);
  
  Option<FluidStack> fluidInTank(int paramInt);
  
  boolean haveSameFluidType(FluidStack paramFluidStack1, FluidStack paramFluidStack2);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\TankAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */