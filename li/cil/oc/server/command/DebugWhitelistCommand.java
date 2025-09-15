package li.cil.oc.server.command;

import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\0015;Q!\001\002\t\0025\tQ\003R3ck\036<\006.\033;fY&\034HoQ8n[\006tGM\003\002\004\t\00591m\\7nC:$'BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003+\021+'-^4XQ&$X\r\\5ti\016{W.\\1oIN\021qB\005\t\003']i\021\001\006\006\003\007UQ!A\006\004\002\r\r|W.\\8o\023\tABCA\007TS6\004H.Z\"p[6\fg\016\032\005\0065=!\taG\001\007y%t\027\016\036 \025\0035AQ!H\b\005By\t!dZ3u%\026\fX/\033:fIB+'/\\5tg&|g\016T3wK2$\022a\b\t\003A\rj\021!\t\006\002E\005)1oY1mC&\021A%\t\002\004\023:$\b\"\002\024\020\t\0039\023\001B5t\037B$\"\001K\026\021\005\001J\023B\001\026\"\005\035\021un\0347fC:DQ\001L\023A\0025\naa]3oI\026\024\bC\001\0305\033\005y#BA\0021\025\t\t$'A\005nS:,7M]1gi*\t1'A\002oKRL!!N\030\003\035%\033u.\\7b]\022\034VM\0343fe\")qg\004C!q\005yq-\032;D_6l\027M\0343Vg\006<W\r\006\002:\001B\021!(\020\b\003AmJ!\001P\021\002\rA\023X\rZ3g\023\tqtH\001\004TiJLgn\032\006\003y\005BQ\001\f\034A\0025BQAQ\b\005B\r\013a\002\035:pG\026\0348oQ8n[\006tG\rF\002E\017\"\003\"\001I#\n\005\031\013#\001B+oSRDQ\001L!A\0025BQ!S!A\002)\013A!\031:hgB\031\001eS\035\n\0051\013#!B!se\006L\b")
public final class DebugWhitelistCommand {
  public static void processCommand(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    DebugWhitelistCommand$.MODULE$.func_71515_b(paramICommandSender, paramArrayOfString);
  }
  
  public static String getCommandUsage(ICommandSender paramICommandSender) {
    return DebugWhitelistCommand$.MODULE$.func_71518_a(paramICommandSender);
  }
  
  public static boolean isOp(ICommandSender paramICommandSender) {
    return DebugWhitelistCommand$.MODULE$.isOp(paramICommandSender);
  }
  
  public static int getRequiredPermissionLevel() {
    return DebugWhitelistCommand$.MODULE$.func_82362_a();
  }
  
  public static List<Object> addTabCompletionOptions(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    return DebugWhitelistCommand$.MODULE$.func_71516_a(paramICommandSender, paramArrayOfString);
  }
  
  public static boolean isUsernameIndex(String[] paramArrayOfString, int paramInt) {
    return DebugWhitelistCommand$.MODULE$.func_82358_a(paramArrayOfString, paramInt);
  }
  
  public static boolean canCommandSenderUseCommand(ICommandSender paramICommandSender) {
    return DebugWhitelistCommand$.MODULE$.func_71519_b(paramICommandSender);
  }
  
  public static List<String> getCommandAliases() {
    return DebugWhitelistCommand$.MODULE$.func_71514_a();
  }
  
  public static String getCommandName() {
    return DebugWhitelistCommand$.MODULE$.func_71517_b();
  }
  
  public static String name() {
    return DebugWhitelistCommand$.MODULE$.name();
  }
  
  public static int compareTo(Object paramObject) {
    return DebugWhitelistCommand$.MODULE$.compareTo(paramObject);
  }
  
  public static int compareTo(ICommand paramICommand) {
    return DebugWhitelistCommand$.MODULE$.compareTo(paramICommand);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\DebugWhitelistCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */