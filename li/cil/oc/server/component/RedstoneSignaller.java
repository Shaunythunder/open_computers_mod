package li.cil.oc.server.component;

import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.Component;
import li.cil.oc.common.tileentity.traits.RedstoneChangedEventArgs;
import net.minecraft.nbt.NBTTagCompound;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001\005%baB\001\003!\003\r\t!\004\002\022%\026$7\017^8oKNKwM\\1mY\026\024(BA\002\005\003%\031w.\0349p]\026tGO\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u\021\0259\002\001\"\001\031\003\031!\023N\\5uIQ\t\021\004\005\002\033;5\t1DC\001\035\003\025\0318-\0317b\023\tq2D\001\003V]&$\bb\002\021\001\005\004%\t%I\001\005]>$W-F\001#!\t\031c%D\001%\025\t)##A\004oKR<xN]6\n\005\035\"#!C\"p[B|g.\0328u\021\031I\003\001)A\005E\005)an\0343fA!91\006\001a\001\n\003a\023!D<bW\026$\006N]3tQ>dG-F\001.!\tQb&\003\00207\t\031\021J\034;\t\017E\002\001\031!C\001e\005\tr/Y6f)\"\024Xm\0355pY\022|F%Z9\025\005e\031\004b\002\0331\003\003\005\r!L\001\004q\022\n\004B\002\034\001A\003&Q&\001\bxC.,G\013\033:fg\"|G\016\032\021\t\017a\002\001\031!C\001s\005\tr/Y6f\035\026Lw\r\0332peN|e\016\\=\026\003i\002\"AG\036\n\005qZ\"a\002\"p_2,\027M\034\005\b}\001\001\r\021\"\001@\003U9\030m[3OK&<\007NY8sg>sG._0%KF$\"!\007!\t\017Qj\024\021!a\001u!1!\t\001Q!\ni\n!c^1lK:+\027n\0325c_J\034xJ\0347zA!)A\t\001C\001\013\006\001r-\032;XC.,G\013\033:fg\"|G\016\032\013\004\r2#\006c\001\016H\023&\021\001j\007\002\006\003J\024\030-\037\t\0035)K!aS\016\003\r\005s\027PU3g\021\025i5\t1\001O\003\035\031wN\034;fqR\004\"a\024*\016\003AS!!\025\n\002\0175\f7\r[5oK&\0211\013\025\002\b\007>tG/\032=u\021\025)6\t1\001W\003\021\t'oZ:\021\005=;\026B\001-Q\005%\t%oZ;nK:$8\017\013\004D5vsv\f\031\t\003\037nK!\001\030)\003\021\r\013G\016\0342bG.\fa\001Z5sK\016$\030$A\001\002\007\021|7-I\001b\003]2WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\0043-\036:sK:$\be^1lK6*\b\017\t;ie\026\034\bn\0347e]!)1\r\001C\001I\006\0012/\032;XC.,G\013\033:fg\"|G\016\032\013\004\r\0264\007\"B'c\001\004q\005\"B+c\001\0041\006\006\0022[?\"\f\023![\001@MVt7\r^5p]\"\"\bN]3tQ>dGM\0178v[\n,'/\013\036ok6\024WM\035\021.[\001\032V\r\036\021uQ\026\004s/Y6f[U\004\b\005\0365sKNDw\016\0343/\021\025Y\007\001\"\001m\003EygNU3egR|g.Z\"iC:<W\r\032\013\00335DQ!\0266A\0029\004\"a\034<\016\003AT!!\035:\002\rQ\024\030-\033;t\025\t\031H/\001\006uS2,WM\034;jifT!!\036\004\002\r\r|W.\\8o\023\t9\bO\001\rSK\022\034Ho\0348f\007\"\fgnZ3e\013Z,g\016^!sONDQ!\037\001\005Bi\fA\001\\8bIR\021\021d\037\005\006yb\004\r!`\001\004]\n$\bc\001@\002\n5\tqPC\002}\003\003QA!a\001\002\006\005IQ.\0338fGJ\fg\r\036\006\003\003\017\t1A\\3u\023\r\tYa \002\017\035\n#F+Y4D_6\004x.\0368e\021\035\ty\001\001C!\003#\tAa]1wKR\031\021$a\005\t\rq\fi\0011\001~\0219\t9\002\001I\001\004\003\005I\021BA\r\003;\t!b];qKJ$Cn\\1e)\rI\0221\004\005\ti\005U\021\021!a\001{&\021\021\020\006\005\017\003C\001\001\023aA\001\002\023%\0211EA\024\003)\031X\017]3sIM\fg/\032\013\0043\005\025\002\002\003\033\002 \005\005\t\031A?\n\007\005=A\003")
public interface RedstoneSignaller {
  void li$cil$oc$server$component$RedstoneSignaller$_setter_$node_$eq(Component paramComponent);
  
  Component node();
  
  int wakeThreshold();
  
  @TraitSetter
  void wakeThreshold_$eq(int paramInt);
  
  boolean wakeNeighborsOnly();
  
  @TraitSetter
  void wakeNeighborsOnly_$eq(boolean paramBoolean);
  
  @Callback(direct = true, doc = "function():number -- Get the current wake-up threshold.")
  Object[] getWakeThreshold(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function(threshold:number):number -- Set the wake-up threshold.")
  Object[] setWakeThreshold(Context paramContext, Arguments paramArguments);
  
  void onRedstoneChanged(RedstoneChangedEventArgs paramRedstoneChangedEventArgs);
  
  void load(NBTTagCompound paramNBTTagCompound);
  
  void save(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneSignaller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */