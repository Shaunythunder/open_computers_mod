package li.cil.oc.server.command;

import java.util.List;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\025;Q!\001\002\t\0025\ta\003T8h\035\006tw.\\1dQ&tWm]\"p[6\fg\016\032\006\003\007\021\tqaY8n[\006tGM\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005Yaun\032(b]>l\027m\0315j]\026\0348i\\7nC:$7CA\b\023!\t\031r#D\001\025\025\t\031QC\003\002\027\r\00511m\\7n_:L!\001\007\013\003\033MKW\016\0357f\007>lW.\0318e\021\025Qr\002\"\001\034\003\031a\024N\\5u}Q\tQ\002C\003\036\037\021\005c$A\bhKR\034u.\\7b]\022,6/Y4f)\ty\022\006\005\002!M9\021\021\005J\007\002E)\t1%A\003tG\006d\027-\003\002&E\0051\001K]3eK\032L!a\n\025\003\rM#(/\0338h\025\t)#\005C\003+9\001\0071&\001\004t_V\0248-\032\t\003YIj\021!\f\006\003\0079R!a\f\031\002\0235Lg.Z2sC\032$(\"A\031\002\0079,G/\003\0024[\tq\021jQ8n[\006tGmU3oI\026\024\b\"B\033\020\t\0032\024A\0049s_\016,7o]\"p[6\fg\016\032\013\004oiZ\004CA\0219\023\tI$E\001\003V]&$\b\"\002\0265\001\004Y\003\"B\0025\001\004a\004cA\021>?%\021aH\t\002\006\003J\024\030-\037\005\006\001>!\t%Q\001\033O\026$(+Z9vSJ,G\rU3s[&\0348/[8o\031\0264X\r\034\013\002\005B\021\021eQ\005\003\t\n\0221!\0238u\001")
public final class LogNanomachinesCommand {
  public static int getRequiredPermissionLevel() {
    return LogNanomachinesCommand$.MODULE$.func_82362_a();
  }
  
  public static void processCommand(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    LogNanomachinesCommand$.MODULE$.func_71515_b(paramICommandSender, paramArrayOfString);
  }
  
  public static String getCommandUsage(ICommandSender paramICommandSender) {
    return LogNanomachinesCommand$.MODULE$.func_71518_a(paramICommandSender);
  }
  
  public static List<Object> addTabCompletionOptions(ICommandSender paramICommandSender, String[] paramArrayOfString) {
    return LogNanomachinesCommand$.MODULE$.func_71516_a(paramICommandSender, paramArrayOfString);
  }
  
  public static boolean isUsernameIndex(String[] paramArrayOfString, int paramInt) {
    return LogNanomachinesCommand$.MODULE$.func_82358_a(paramArrayOfString, paramInt);
  }
  
  public static boolean canCommandSenderUseCommand(ICommandSender paramICommandSender) {
    return LogNanomachinesCommand$.MODULE$.func_71519_b(paramICommandSender);
  }
  
  public static List<String> getCommandAliases() {
    return LogNanomachinesCommand$.MODULE$.func_71514_a();
  }
  
  public static String getCommandName() {
    return LogNanomachinesCommand$.MODULE$.func_71517_b();
  }
  
  public static String name() {
    return LogNanomachinesCommand$.MODULE$.name();
  }
  
  public static int compareTo(Object paramObject) {
    return LogNanomachinesCommand$.MODULE$.compareTo(paramObject);
  }
  
  public static int compareTo(ICommand paramICommand) {
    return LogNanomachinesCommand$.MODULE$.compareTo(paramICommand);
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\LogNanomachinesCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */