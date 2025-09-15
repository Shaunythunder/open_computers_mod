package li.cil.oc.server.command;

import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0011;Q!\001\002\t\0025\taDT8o\t&\034\030m]:f[\nd\0270Q4sK\026lWM\034;D_6l\027M\0343\013\005\r!\021aB2p[6\fg\016\032\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\tqbj\0348ESN\f7o]3nE2L\030i\032:fK6,g\016^\"p[6\fg\016Z\n\003\037I\001\"aE\f\016\003QQ!aA\013\013\005Y1\021AB2p[6|g.\003\002\031)\ti1+[7qY\026\034u.\\7b]\022DQAG\b\005\002m\ta\001P5oSRtD#A\007\t\013uyA\021\t\020\002\037\035,GoQ8n[\006tG-V:bO\026$\"aH\024\021\005\001*S\"A\021\013\005\t\032\023\001\0027b]\036T\021\001J\001\005U\0064\030-\003\002'C\t11\013\036:j]\036DQ\001\013\017A\002%\naa]8ve\016,\007C\001\0261\033\005Y#BA\002-\025\tic&A\005nS:,7M]1gi*\tq&A\002oKRL!!M\026\003\035%\033u.\\7b]\022\034VM\0343fe\")1g\004C!i\005q\001O]8dKN\0348i\\7nC:$GcA\033<yA\021a'O\007\002o)\t\001(A\003tG\006d\027-\003\002;o\t!QK\\5u\021\025A#\0071\001*\021\025\031!\0071\001>!\r1d\bQ\005\003]\022Q!\021:sCf\004\"!\021#\017\005Y\022\025BA\"8\003\031\001&/\0323fM&\021a%\022\006\003\007^BQaR\b\005B!\013!dZ3u%\026\fX/\033:fIB+'/\\5tg&|g\016T3wK2$\022!\023\t\003m)K!aS\034\003\007%sG\017")
public final class NonDisassemblyAgreementCommand {
  public static int getRequiredPermissionLevel() {
    return NonDisassemblyAgreementCommand$.MODULE$.func_82362_a();
  }
  
  public static void processCommand(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    NonDisassemblyAgreementCommand$.MODULE$.func_71515_b(paramICommandSender, paramArrayOfString);
  }
  
  public static String getCommandUsage(ICommandSender paramICommandSender) {
    return NonDisassemblyAgreementCommand$.MODULE$.func_71518_a(paramICommandSender);
  }
  
  public static List<Object> addTabCompletionOptions(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    return NonDisassemblyAgreementCommand$.MODULE$.func_71516_a(paramICommandSender, paramArrayOfString);
  }
  
  public static boolean isUsernameIndex(String[] paramArrayOfString, int paramInt) {
    return NonDisassemblyAgreementCommand$.MODULE$.func_82358_a(paramArrayOfString, paramInt);
  }
  
  public static boolean canCommandSenderUseCommand(ICommandSender paramICommandSender) {
    return NonDisassemblyAgreementCommand$.MODULE$.func_71519_b(paramICommandSender);
  }
  
  public static List<String> getCommandAliases() {
    return NonDisassemblyAgreementCommand$.MODULE$.func_71514_a();
  }
  
  public static String getCommandName() {
    return NonDisassemblyAgreementCommand$.MODULE$.func_71517_b();
  }
  
  public static String name() {
    return NonDisassemblyAgreementCommand$.MODULE$.name();
  }
  
  public static int compareTo(Object paramObject) {
    return NonDisassemblyAgreementCommand$.MODULE$.compareTo(paramObject);
  }
  
  public static int compareTo(ICommand paramICommand) {
    return NonDisassemblyAgreementCommand$.MODULE$.compareTo(paramICommand);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\NonDisassemblyAgreementCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */