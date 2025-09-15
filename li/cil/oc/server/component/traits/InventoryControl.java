package li.cil.oc.server.component.traits;

import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\0314q!\001\002\021\002\007\005qB\001\tJ]Z,g\016^8ss\016{g\016\036:pY*\0211\001B\001\007iJ\f\027\016^:\013\005\0251\021!C2p[B|g.\0328u\025\t9\001\"\001\004tKJ4XM\035\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011c\001\001\021-A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032\004\"a\006\r\016\003\tI!!\007\002\003\035%sg/\0328u_JL\030i^1sK\")1\004\001C\0019\0051A%\0338ji\022\"\022!\b\t\003#yI!a\b\n\003\tUs\027\016\036\005\006C\001!\tAI\001\016S:4XM\034;pef\034\026N_3\025\007\r2\003\007E\002\022IAI!!\n\n\003\013\005\023(/Y=\t\013\035\002\003\031\001\025\002\017\r|g\016^3yiB\021\021FL\007\002U)\0211\006L\001\b[\006\034\007.\0338f\025\ti\003\"A\002ba&L!a\f\026\003\017\r{g\016^3yi\")\021\007\ta\001e\005!\021M]4t!\tI3'\003\0025U\tI\021I]4v[\026tGo\035\025\005AYJ$\b\005\002*o%\021\001H\013\002\t\007\006dGNY1dW\006\031Am\\2\"\003m\n!IZ;oGRLwN\034\025*u9,XNY3sA5j\003\005\0265fAML'0\032\021pM\002\"\b.[:!I\0264\030nY3(g\002Jg\016^3s]\006d\007%\0338wK:$xN]=/\021\025i\004\001\"\001?\003\031\031X\r\\3diR\0311e\020!\t\013\035b\004\031\001\025\t\013Eb\004\031\001\032)\tq2\024HQ\021\002\007\0061g-\0368di&|g\016K.tY>$(H\\;nE\026\024X,\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\0043-\036:sK:$H.\037\021tK2,7\r^3eAMdw\016^\036!g\026$\b\005\0365fAM,G.Z2uK\022\0043\017\\8uA%4\007e\0359fG&4\027.\0323/\021\025)\005\001\"\001G\003\025\031w.\0368u)\r\031s\t\023\005\006O\021\003\r\001\013\005\006c\021\003\rA\r\025\007\tZR5*\017'\002\r\021L'/Z2u3\005\t\021%A'\002a\032,hn\031;j_:D3l\0357pijrW/\0342fevK#H\\;nE\026\024\b%L\027!\017\026$\b\005\0365fA9,XNY3sA=4\007%\033;f[N\004\023N\034\021uQ\026\0043\017]3dS\032LW\r\032\021tY>$H\006I8uQ\026\024x/[:fA%t\007\005\0365fAM,G.Z2uK\022\0043\017\\8u]!)q\n\001C\001!\006)1\017]1dKR\0311%\025*\t\013\035r\005\031\001\025\t\013Er\005\031\001\032)\r93$jS\035UC\005)\026\001\0354v]\016$\030n\0348)7Ndw\016\036\036ok6\024WM]/*u9,XNY3sA5j\003eR3uAQDW\r\t:f[\006Lg.\0338hAM\004\030mY3!S:\004C\017[3!gB,7-\0334jK\022\0043\017\\8uY\001zG\017[3so&\034X\rI5oAQDW\rI:fY\026\034G/\0323!g2|GO\f\005\006/\002!\t\001W\001\nG>l\007/\031:f)>$2aI-[\021\0259c\0131\001)\021\025\td\0131\0013Q\0211f'\017/\"\003u\013\021\021\0054v]\016$\030n\0348)_RDWM]*m_RTd.^7cKJ\\F\006I2iK\016\\gJ\021+;E>|G.Z1o{\031\fGn]3^Si\022wn\0347fC:\004S&\f\021D_6\004\030M]3!i\",\007eY8oi\026tGo\035\021pM\002\"\b.\032\021tK2,7\r^3eAMdw\016\036\021u_\002\"\b.\032\021d_:$XM\034;tA=4\007\005\0365fAM\004XmY5gS\026$\007e\0357pi:BQa\030\001\005\002\001\f!\002\036:b]N4WM\035+p)\r\031\023M\031\005\006Oy\003\r\001\013\005\006cy\003\rA\r\025\005=ZJD-I\001f\003\005ea-\0368di&|g\016\013;p'2|GO\0178v[\n,'o\027\027!C6|WO\034;;]Vl'-\032:^Si\022wn\0347fC:\004S&\f\021N_Z,\007%\0369!i>\004C\017[3!gB,7-\0334jK\022\004\023-\\8v]R\004sN\032\021ji\026l7\017\t4s_6\004C\017[3!g\026dWm\031;fI\002\032Hn\034;!S:$x\016\t;iK\002\032\b/Z2jM&,G\rI:m_Rt\003")
public interface InventoryControl extends InventoryAware {
  @Callback(doc = "function():number -- The size of this device's internal inventory.")
  Object[] inventorySize(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function([slot:number]):number -- Get the currently selected slot; set the selected slot if specified.")
  Object[] select(Context paramContext, Arguments paramArguments);
  
  @Callback(direct = true, doc = "function([slot:number]):number -- Get the number of items in the specified slot, otherwise in the selected slot.")
  Object[] count(Context paramContext, Arguments paramArguments);
  
  @Callback(direct = true, doc = "function([slot:number]):number -- Get the remaining space in the specified slot, otherwise in the selected slot.")
  Object[] space(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function(otherSlot:number[, checkNBT:boolean=false]):boolean -- Compare the contents of the selected slot to the contents of the specified slot.")
  Object[] compareTo(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function(toSlot:number[, amount:number]):boolean -- Move up to the specified amount of items from the selected slot into the specified slot.")
  Object[] transferTo(Context paramContext, Arguments paramArguments);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */