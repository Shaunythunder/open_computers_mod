package li.cil.oc.common.tileentity.traits;

import scala.collection.mutable.Buffer;
import scala.collection.mutable.Map;
import scala.collection.mutable.Set;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001y3q!\001\002\021\002\007\005qB\001\006To&$8\r\033'jW\026T!a\001\003\002\rQ\024\030-\033;t\025\t)a!\001\006uS2,WM\034;jifT!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\004\001AI\002CA\t\030\033\005\021\"BA\003\024\025\t!R#A\005nS:,7M]1gi*\ta#A\002oKRL!\001\007\n\003\025QKG.Z#oi&$\030\020\005\002\03375\t!!\003\002\035\005\t\031\001*\0362\t\013y\001A\021A\020\002\r\021Jg.\033;%)\005\001\003CA\021%\033\005\021#\"A\022\002\013M\034\027\r\\1\n\005\025\022#\001B+oSRDQa\n\001\007\002!\n!B]3mCf$U\r\\1z+\005I\003CA\021+\023\tY#EA\002J]RDQ!\f\001\007\0029\n\021#[:XSJ,G.Z:t\013:\f'\r\\3e+\005y\003CA\0211\023\t\t$EA\004C_>dW-\0318\t\013M\002a\021\001\030\002\037%\034H*\0338lK\022,e.\0312mK\022Dq!\016\001C\002\023\005a'A\005d_6\004X\017^3sgV\tq\007E\0029{}j\021!\017\006\003um\nq!\\;uC\ndWM\003\002=E\005Q1m\0347mK\016$\030n\0348\n\005yJ$A\002\"vM\032,'\017\005\002\"\001&\021\021I\t\002\007\003:L(+\0324\t\r\r\003\001\025!\0038\003)\031w.\0349vi\026\0248\017\t\005\b\013\002\021\r\021\"\001G\003%y\007/\0328Q_J$8/F\001H!\021A\004j\020&\n\005%K$aA'baB\031\001hS\025\n\0051K$aA*fi\"1a\n\001Q\001\n\035\013!b\0349f]B{'\017^:!\021\035\001\006\0011A\005\002E\0131\002\\1ti6+7o]1hKV\t!\013\005\002\"'&\021AK\t\002\005\031>tw\rC\004W\001\001\007I\021A,\002\0371\f7\017^'fgN\fw-Z0%KF$\"\001\t-\t\017e+\026\021!a\001%\006\031\001\020J\031\t\rm\003\001\025)\003S\0031a\027m\035;NKN\034\030mZ3!\021\025i\006\001\"\001 \003AygnU<ji\016D\027i\031;jm&$\030\020")
public interface SwitchLike extends Hub {
  void li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$computers_$eq(Buffer paramBuffer);
  
  void li$cil$oc$common$tileentity$traits$SwitchLike$_setter_$openPorts_$eq(Map paramMap);
  
  int relayDelay();
  
  boolean isWirelessEnabled();
  
  boolean isLinkedEnabled();
  
  Buffer<Object> computers();
  
  Map<Object, Set<Object>> openPorts();
  
  long lastMessage();
  
  @TraitSetter
  void lastMessage_$eq(long paramLong);
  
  void onSwitchActivity();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\SwitchLike.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */