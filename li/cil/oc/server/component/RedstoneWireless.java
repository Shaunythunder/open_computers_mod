package li.cil.oc.server.component;

import codechicken.lib.vec.Vector3;
import codechicken.wirelessredstone.core.WirelessReceivingDevice;
import codechicken.wirelessredstone.core.WirelessTransmittingDevice;
import cpw.mods.fml.common.Optional.Interface;
import cpw.mods.fml.common.Optional.InterfaceList;
import cpw.mods.fml.common.Optional.Method;
import java.util.Map;
import li.cil.oc.api.driver.DeviceInfo;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.Node;
import net.minecraft.nbt.NBTTagCompound;
import scala.collection.immutable.Map;
import scala.reflect.ScalaSignature;
import scala.runtime.Null$;
import scala.runtime.TraitSetter;

@InterfaceList({@Interface(iface = "codechicken.wirelessredstone.core.WirelessReceivingDevice", modid = "WR-CBE|Core"), @Interface(iface = "codechicken.wirelessredstone.core.WirelessTransmittingDevice", modid = "WR-CBE|Core")})
@ScalaSignature(bytes = "\006\001\tMdaB\001\003!\003\r\t!\004\002\021%\026$7\017^8oK^K'/\0327fgNT!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\r\001qaC\007\023(!\tyA#D\001\021\025\t\t\"#\001\004qe\0264\027M\031\006\003'\031\t1!\0319j\023\t)\002C\001\nNC:\fw-\0323F]ZL'o\0348nK:$\bCA\f\031\033\005\021\021BA\r\003\005E\021V\rZ:u_:,7+[4oC2dWM\035\t\0037\tj\021\001\b\006\003;y\tAaY8sK*\021q\004I\001\021o&\024X\r\\3tgJ,Gm\035;p]\026T\021!I\001\fG>$Wm\0315jG.,g.\003\002$9\t9r+\033:fY\026\0348OU3dK&4\030N\\4EKZL7-\032\t\0037\025J!A\n\017\0035]K'/\0327fgN$&/\0318t[&$H/\0338h\t\0264\030nY3\021\005!ZS\"A\025\013\005)\022\022A\0023sSZ,'/\003\002-S\tQA)\032<jG\026LeNZ8\t\0139\002A\021A\030\002\r\021Jg.\033;%)\005\001\004CA\0315\033\005\021$\"A\032\002\013M\034\027\r\\1\n\005U\022$\001B+oSRDQa\016\001\007\002a\n\001B]3egR|g.Z\013\002sA\021!(P\007\002w)\021AHE\001\b]\026$xo\034:l\023\tq4HA\bF]ZL'o\0348nK:$\bj\\:u\021\035\001\005\0011A\005\002\005\013\021c^5sK2,7o\035$sKF,XM\\2z+\005\021\005CA\031D\023\t!%GA\002J]RDqA\022\001A\002\023\005q)A\013xSJ,G.Z:t\rJ,\027/^3oGf|F%Z9\025\005AB\005bB%F\003\003\005\rAQ\001\004q\022\n\004BB&\001A\003&!)\001\nxSJ,G.Z:t\rJ,\027/^3oGf\004\003bB'\001\001\004%\tAT\001\016o&\024X\r\\3tg&s\007/\036;\026\003=\003\"!\r)\n\005E\023$a\002\"p_2,\027M\034\005\b'\002\001\r\021\"\001U\003E9\030N]3mKN\034\030J\0349vi~#S-\035\013\003aUCq!\023*\002\002\003\007q\n\003\004X\001\001\006KaT\001\017o&\024X\r\\3tg&s\007/\036;!\021\035I\006\0011A\005\0029\013ab^5sK2,7o](viB,H\017C\004\\\001\001\007I\021\001/\002%]L'/\0327fgN|U\017\0369vi~#S-\035\013\003auCq!\023.\002\002\003\007q\n\003\004`\001\001\006KaT\001\020o&\024X\r\\3tg>+H\017];uA!A\021\r\001EC\002\0235!-\001\006eKZL7-Z%oM>,\022a\031\t\005I&\\7.D\001f\025\t1w-A\005j[6,H/\0312mK*\021\001NM\001\013G>dG.Z2uS>t\027B\0016f\005\ri\025\r\035\t\003YFl\021!\034\006\003]>\fA\001\\1oO*\t\001/\001\003kCZ\f\027B\001:n\005\031\031FO]5oO\"AA\017\001E\001B\00361-A\006eKZL7-Z%oM>\004\003\"\002<\001\t\003:\030!D4fi\022+g/[2f\023:4w\016F\001y!\021IH0`?\016\003iT!a_8\002\tU$\030\016\\\005\003Uj\0042A`A\002\035\t\tt0C\002\002\002I\na\001\025:fI\0264\027b\001:\002\006)\031\021\021\001\032\t\017\005%\001\001\"\001\002\f\005\001r-\032;XSJ,G.Z:t\023:\004X\017\036\013\007\003\033\tI\"!\013\021\013E\ny!a\005\n\007\005E!GA\003BeJ\f\027\020E\0022\003+I1!a\0063\005\031\te.\037*fM\"A\0211DA\004\001\004\ti\"A\004d_:$X\r\037;\021\t\005}\021QE\007\003\003CQ1!a\t\023\003\035i\027m\0315j]\026LA!a\n\002\"\t91i\0348uKb$\b\002CA\026\003\017\001\r!!\f\002\t\005\024xm\035\t\005\003?\ty#\003\003\0022\005\005\"!C!sOVlWM\034;tQ!\t9!!\016\002<\005u\002\003BA\020\003oIA!!\017\002\"\tA1)\0317mE\006\0347.A\002e_\016\f#!a\020\002k\031,hn\031;j_:D\023F\0178v[\n,'\017I\027.A\035+G\017\t;iK\002:\030N]3mKN\034\bE]3egR|g.\032\021j]B,HO\f\005\b\003\007\002A\021AA#\003E9W\r^,je\026dWm]:PkR\004X\017\036\013\007\003\033\t9%!\023\t\021\005m\021\021\ta\001\003;A\001\"a\013\002B\001\007\021Q\006\025\r\003\003\n)$!\024\002P\005m\022\021K\001\007I&\024Xm\031;\032\003\005\t#!a\025\002o\031,hn\031;j_:D\023F\0172p_2,\027M\034\021.[\001:U\r\036\021uQ\026\004s/\033:fY\026\0348\017\t:fIN$xN\\3!_V$\b/\036;/\021\035\t9\006\001C\001\0033\n\021c]3u/&\024X\r\\3tg>+H\017];u)\031\ti!a\027\002^!A\0211DA+\001\004\ti\002\003\005\002,\005U\003\031AA\027Q!\t)&!\016\002<\005\005\024EAA2\003\0213WO\\2uS>t\007F^1mk\026T$m\\8mK\006t\027F\0172p_2,\027M\034\021.[\001\032V\r\036\021uQ\026\004s/\033:fY\026\0348\017\t:fIN$xN\\3!_V$\b/\036;/\021\035\t9\007\001C\001\003S\nAcZ3u/&\024X\r\\3tg\032\023X-];f]\016LHCBA\007\003W\ni\007\003\005\002\034\005\025\004\031AA\017\021!\tY#!\032A\002\0055\002\006DA3\003k\ti%a\024\002<\005E\024EAA:\003\0353WO\\2uS>t\007&\013\036ok6\024WM\035\021.[\001:U\r\036\021uQ\026\0043-\036:sK:$H.\037\021tKR\004s/\033:fY\026\0348\017\t:fIN$xN\\3!MJ,\027/^3oGft\003bBA<\001\021\005\021\021P\001\025g\026$x+\033:fY\026\0348O\022:fcV,gnY=\025\r\0055\0211PA?\021!\tY\"!\036A\002\005u\001\002CA\026\003k\002\r!!\f)\021\005U\024QGA\036\003\003\013#!a!\002!\032,hn\031;j_:DcM]3rk\026t7-\037\036ok6\024WM]\025;]Vl'-\032:![5\0023+\032;!i\",\007e^5sK2,7o\035\021sK\022\034Ho\0348fA\031\024X-];f]\016L\b\005^8!kN,g\006C\004\002\b\002!\t%!#\002\031U\004H-\031;f\t\0264\030nY3\025\013A\nY)a$\t\017\0055\025Q\021a\001\005\006IaM]3rk\026t7-\037\005\b\003#\013)\t1\001P\003\tyg\016\013\005\002\006\006U\025QWA\\!\021\t9*a,\017\t\005e\0251V\007\003\0037SA!!(\002 \00611m\\7n_:TA!!)\002$\006\031a-\0347\013\t\005\025\026qU\001\005[>$7O\003\002\002*\006\0311\r]<\n\t\0055\0261T\001\t\037B$\030n\0348bY&!\021\021WAZ\005\031iU\r\0365pI*!\021QVAN\003\025iw\016Z5eC\t\tI,A\006X%6\032%)\022?D_J,\007bBA_\001\021\005\023qX\001\fO\026$\bk\\:ji&|g\016\006\002\002BB!\0211YAg\033\t\t)M\003\003\002H\006%\027a\001<fG*\031\0211\032\021\002\0071L'-\003\003\002P\006\025'a\002,fGR|'o\r\025\t\003w\013)*!.\0028\"9\021Q\033\001\005B\005]\027\001D4fi\022KW.\0328tS>tG#\001\")\021\005M\027QSA[\003oCq!!8\001\t\003\n9.A\004hKR4%/Z9)\021\005m\027QSA[\003oCq!a9\001\t\003\n)/A\thKR\fE\017^1dQ\026$WI\034;jif$\"!a:\021\007E\nI/C\002\002lJ\022AAT;mY\"B\021\021]AK\003k\0139\fC\004\002r\002!\t%a=\002\023=t7i\0348oK\016$Hc\001\031\002v\"A\021q_Ax\001\004\tI0\001\003o_\022,\007c\001\036\002|&\031\021Q`\036\003\t9{G-\032\005\b\005\003\001A\021\tB\002\0031yg\016R5tG>tg.Z2u)\r\001$Q\001\005\t\003o\fy\0201\001\002z\"9!\021\002\001\005B\t-\021\001\0027pC\022$2\001\rB\007\021!\021yAa\002A\002\tE\021a\0018ciB!!1\003B\020\033\t\021)B\003\003\003\020\t]!\002\002B\r\0057\t\021\"\\5oK\016\024\030M\032;\013\005\tu\021a\0018fi&!!\021\005B\013\0059q%\t\026+bO\016{W\016]8v]\022DqA!\n\001\t\003\0229#\001\003tCZ,Gc\001\031\003*!A!q\002B\022\001\004\021\t\002\003\b\003.\001\001\n1!A\001\n\023\021yCa\r\002\037M,\b/\032:%_:\034uN\0348fGR$2\001\rB\031\021%I%1FA\001\002\004\tI0C\002\002rRAaBa\016\001!\003\r\t\021!C\005\005s\021i$\001\ntkB,'\017J8o\t&\0348m\0348oK\016$Hc\001\031\003<!I\021J!\016\002\002\003\007\021\021`\005\004\005\003!\002B\004B!\001A\005\031\021!A\005\n\t\r#qI\001\013gV\004XM\035\023m_\006$Gc\001\031\003F!A!q\002B \001\004\021\t\"C\002\003\naAaBa\023\001!\003\r\t\021!C\005\005\033\022\t&\001\006tkB,'\017J:bm\026$2\001\rB(\021!\021yA!\023A\002\tE\021b\001B\0231!:\001A!\026\003\\\tu\003\003BAL\005/JAA!\027\0024\ni\021J\034;fe\032\f7-\032'jgR\fQA^1mk\026dCAa\030\003n-R!\021\rB4\005S\n),a.\021\t\005]%1M\005\005\005K\n\031LA\005J]R,'OZ1dK\006)\021NZ1dK\006\022!1N\001:G>$Wm\0315jG.,gNL<je\026dWm]:sK\022\034Ho\0348f]\r|'/\032\030XSJ,G.Z:t%\026\034W-\033<j]\036$UM^5dK.R!\021\rB4\005_\n),a.\"\005\tE\024\001P2pI\026\034\007.[2lK:ts/\033:fY\026\0348O]3egR|g.\032\030d_J,gfV5sK2,7o\035+sC:\034X.\033;uS:<G)\032<jG\026\004")
public interface RedstoneWireless extends RedstoneSignaller, WirelessReceivingDevice, WirelessTransmittingDevice, DeviceInfo {
  EnvironmentHost redstone();
  
  int wirelessFrequency();
  
  @TraitSetter
  void wirelessFrequency_$eq(int paramInt);
  
  boolean wirelessInput();
  
  @TraitSetter
  void wirelessInput_$eq(boolean paramBoolean);
  
  boolean wirelessOutput();
  
  @TraitSetter
  void wirelessOutput_$eq(boolean paramBoolean);
  
  Map<String, String> li$cil$oc$server$component$RedstoneWireless$$deviceInfo();
  
  Map<String, String> getDeviceInfo();
  
  @Callback(doc = "function():number -- Get the wireless redstone input.")
  Object[] getWirelessInput(Context paramContext, Arguments paramArguments);
  
  @Callback(direct = true, doc = "function():boolean -- Get the wireless redstone output.")
  Object[] getWirelessOutput(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function(value:boolean):boolean -- Set the wireless redstone output.")
  Object[] setWirelessOutput(Context paramContext, Arguments paramArguments);
  
  @Callback(direct = true, doc = "function():number -- Get the currently set wireless redstone frequency.")
  Object[] getWirelessFrequency(Context paramContext, Arguments paramArguments);
  
  @Callback(doc = "function(frequency:number):number -- Set the wireless redstone frequency to use.")
  Object[] setWirelessFrequency(Context paramContext, Arguments paramArguments);
  
  @Method(modid = "WR-CBE|Core")
  void updateDevice(int paramInt, boolean paramBoolean);
  
  @Method(modid = "WR-CBE|Core")
  Vector3 getPosition();
  
  @Method(modid = "WR-CBE|Core")
  int getDimension();
  
  @Method(modid = "WR-CBE|Core")
  int getFreq();
  
  @Method(modid = "WR-CBE|Core")
  Null$ getAttachedEntity();
  
  void onConnect(Node paramNode);
  
  void onDisconnect(Node paramNode);
  
  void load(NBTTagCompound paramNBTTagCompound);
  
  void save(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneWireless.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */