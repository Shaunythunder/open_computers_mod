package li.cil.oc.server.command;

import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0011;Q!\001\002\t\0025\t\001dV5sK2,7o\035*f]\022,'/\0338h\007>lW.\0318e\025\t\031A!A\004d_6l\027M\0343\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\001dV5sK2,7o\035*f]\022,'/\0338h\007>lW.\0318e'\ty!\003\005\002\024/5\tAC\003\002\004+)\021aCB\001\007G>lWn\0348\n\005a!\"!D*j[BdWmQ8n[\006tG\rC\003\033\037\021\0051$\001\004=S:LGO\020\013\002\033!)Qd\004C!=\005yq-\032;D_6l\027M\0343Vg\006<W\r\006\002 OA\021\001%J\007\002C)\021!eI\001\005Y\006twMC\001%\003\021Q\027M^1\n\005\031\n#AB*ue&tw\rC\003)9\001\007\021&\001\004t_V\0248-\032\t\003UAj\021a\013\006\003\0071R!!\f\030\002\0235Lg.Z2sC\032$(\"A\030\002\0079,G/\003\0022W\tq\021jQ8n[\006tGmU3oI\026\024\b\"B\032\020\t\003\"\024A\0049s_\016,7o]\"p[6\fg\016\032\013\004kmb\004C\001\034:\033\0059$\"\001\035\002\013M\034\027\r\\1\n\005i:$\001B+oSRDQ\001\013\032A\002%BQa\001\032A\002u\0022A\016 A\023\tytGA\003BeJ\f\027\020\005\002B\t:\021aGQ\005\003\007^\na\001\025:fI\0264\027B\001\024F\025\t\031u\007C\003H\037\021\005\003*\001\016hKR\024V-];je\026$\007+\032:nSN\034\030n\0348MKZ,G\016F\001J!\t1$*\003\002Lo\t\031\021J\034;")
public final class WirelessRenderingCommand {
  public static int getRequiredPermissionLevel() {
    return WirelessRenderingCommand$.MODULE$.func_82362_a();
  }
  
  public static void processCommand(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    WirelessRenderingCommand$.MODULE$.func_71515_b(paramICommandSender, paramArrayOfString);
  }
  
  public static String getCommandUsage(ICommandSender paramICommandSender) {
    return WirelessRenderingCommand$.MODULE$.func_71518_a(paramICommandSender);
  }
  
  public static List<Object> addTabCompletionOptions(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    return WirelessRenderingCommand$.MODULE$.func_71516_a(paramICommandSender, paramArrayOfString);
  }
  
  public static boolean isUsernameIndex(String[] paramArrayOfString, int paramInt) {
    return WirelessRenderingCommand$.MODULE$.func_82358_a(paramArrayOfString, paramInt);
  }
  
  public static boolean canCommandSenderUseCommand(ICommandSender paramICommandSender) {
    return WirelessRenderingCommand$.MODULE$.func_71519_b(paramICommandSender);
  }
  
  public static List<String> getCommandAliases() {
    return WirelessRenderingCommand$.MODULE$.func_71514_a();
  }
  
  public static String getCommandName() {
    return WirelessRenderingCommand$.MODULE$.func_71517_b();
  }
  
  public static String name() {
    return WirelessRenderingCommand$.MODULE$.name();
  }
  
  public static int compareTo(Object paramObject) {
    return WirelessRenderingCommand$.MODULE$.compareTo(paramObject);
  }
  
  public static int compareTo(ICommand paramICommand) {
    return WirelessRenderingCommand$.MODULE$.compareTo(paramICommand);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\WirelessRenderingCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */