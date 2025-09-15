package li.cil.oc.server.command;

import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\025;Q!\001\002\t\0025\t\001\004R3ck\036t\025M\\8nC\016D\027N\\3t\007>lW.\0318e\025\t\031A!A\004d_6l\027M\0343\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\001\004R3ck\036t\025M\\8nC\016D\027N\\3t\007>lW.\0318e'\ty!\003\005\002\024/5\tAC\003\002\004+)\021aCB\001\007G>lWn\0348\n\005a!\"!D*j[BdWmQ8n[\006tG\rC\003\033\037\021\0051$\001\004=S:LGO\020\013\002\033!)Qd\004C!=\005yq-\032;D_6l\027M\0343Vg\006<W\r\006\002 SA\021\001E\n\b\003C\021j\021A\t\006\002G\005)1oY1mC&\021QEI\001\007!J,G-\0324\n\005\035B#AB*ue&twM\003\002&E!)!\006\ba\001W\00511o\\;sG\026\004\"\001\f\032\016\0035R!a\001\030\013\005=\002\024!C7j]\026\034'/\0314u\025\005\t\024a\0018fi&\0211'\f\002\017\023\016{W.\\1oIN+g\016Z3s\021\025)t\002\"\0217\0039\001(o\\2fgN\034u.\\7b]\022$2a\016\036<!\t\t\003(\003\002:E\t!QK\\5u\021\025QC\0071\001,\021\025\031A\0071\001=!\r\tShH\005\003}\t\022Q!\021:sCfDQ\001Q\b\005B\005\013!dZ3u%\026\fX/\033:fIB+'/\\5tg&|g\016T3wK2$\022A\021\t\003C\rK!\001\022\022\003\007%sG\017")
public final class DebugNanomachinesCommand {
  public static int getRequiredPermissionLevel() {
    return DebugNanomachinesCommand$.MODULE$.func_82362_a();
  }
  
  public static void processCommand(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    DebugNanomachinesCommand$.MODULE$.func_71515_b(paramICommandSender, paramArrayOfString);
  }
  
  public static String getCommandUsage(ICommandSender paramICommandSender) {
    return DebugNanomachinesCommand$.MODULE$.func_71518_a(paramICommandSender);
  }
  
  public static List<Object> addTabCompletionOptions(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    return DebugNanomachinesCommand$.MODULE$.func_71516_a(paramICommandSender, paramArrayOfString);
  }
  
  public static boolean isUsernameIndex(String[] paramArrayOfString, int paramInt) {
    return DebugNanomachinesCommand$.MODULE$.func_82358_a(paramArrayOfString, paramInt);
  }
  
  public static boolean canCommandSenderUseCommand(ICommandSender paramICommandSender) {
    return DebugNanomachinesCommand$.MODULE$.func_71519_b(paramICommandSender);
  }
  
  public static List<String> getCommandAliases() {
    return DebugNanomachinesCommand$.MODULE$.func_71514_a();
  }
  
  public static String getCommandName() {
    return DebugNanomachinesCommand$.MODULE$.func_71517_b();
  }
  
  public static String name() {
    return DebugNanomachinesCommand$.MODULE$.name();
  }
  
  public static int compareTo(Object paramObject) {
    return DebugNanomachinesCommand$.MODULE$.compareTo(paramObject);
  }
  
  public static int compareTo(ICommand paramICommand) {
    return DebugNanomachinesCommand$.MODULE$.compareTo(paramICommand);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\DebugNanomachinesCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */