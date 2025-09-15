/*    */ package li.cil.oc.server.command;
/*    */ import li.cil.oc.api.network.Packet;
/*    */ import li.cil.oc.server.network.DebugNetwork;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import scala.Predef$;
/*    */ @ScalaSignature(bytes = "\006\001\031;Q!\001\002\t\0025\tqcU3oI\022+'-^4NKN\034\030mZ3D_6l\027M\0343\013\005\r!\021aB2p[6\fg\016\032\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t92+\0328e\t\026\024WoZ'fgN\fw-Z\"p[6\fg\016Z\n\003\037I\001\"aE\f\016\003QQ!aA\013\013\005Y1\021AB2p[6|g.\003\002\031)\ti1+[7qY\026\034u.\\7b]\022DQAG\b\005\002m\ta\001P5oSRtD#A\007\t\013uyA\021\t\020\002\037\035,GoQ8n[\006tG-V:bO\026$\"aH\025\021\005\0012cBA\021%\033\005\021#\"A\022\002\013M\034\027\r\\1\n\005\025\022\023A\002)sK\022,g-\003\002(Q\t11\013\036:j]\036T!!\n\022\t\013)b\002\031A\026\002\rM,g\016Z3s!\ta#'D\001.\025\t\031aF\003\0020a\005IQ.\0338fGJ\fg\r\036\006\002c\005\031a.\032;\n\005Mj#AD%D_6l\027M\0343TK:$WM\035\005\006k=!\tEN\001\017aJ|7-Z:t\007>lW.\0318e)\r9$h\017\t\003CaJ!!\017\022\003\tUs\027\016\036\005\006UQ\002\ra\013\005\006yQ\002\r!P\001\005CJ<7\017E\002\"}}I!a\020\022\003\013\005\023(/Y=\t\013\005{A\021\t\"\0025\035,GOU3rk&\024X\r\032)fe6L7o]5p]2+g/\0327\025\003\r\003\"!\t#\n\005\025\023#aA%oi\002")
/*    */ public final class SendDebugMessageCommand { public static int getRequiredPermissionLevel() { return SendDebugMessageCommand$.MODULE$.func_82362_a(); } public static void processCommand(ICommandSender paramICommandSender, String[] paramArrayOfString) { SendDebugMessageCommand$.MODULE$.func_71515_b(paramICommandSender, paramArrayOfString); } public static String getCommandUsage(ICommandSender paramICommandSender) { return SendDebugMessageCommand$.MODULE$.func_71518_a(paramICommandSender); } public static List<Object> addTabCompletionOptions(ICommandSender paramICommandSender, String[] paramArrayOfString) { return SendDebugMessageCommand$.MODULE$.func_71516_a(paramICommandSender, paramArrayOfString); } public static boolean isUsernameIndex(String[] paramArrayOfString, int paramInt) { return SendDebugMessageCommand$.MODULE$.func_82358_a(paramArrayOfString, paramInt); } public static boolean canCommandSenderUseCommand(ICommandSender paramICommandSender) {
/*    */     return SendDebugMessageCommand$.MODULE$.func_71519_b(paramICommandSender);
/*    */   } public static List<String> getCommandAliases() {
/*    */     return SendDebugMessageCommand$.MODULE$.func_71514_a();
/*    */   } public static String getCommandName() {
/*    */     return SendDebugMessageCommand$.MODULE$.func_71517_b();
/*    */   } public static String name() {
/*    */     return SendDebugMessageCommand$.MODULE$.name();
/*    */   } public static int compareTo(Object paramObject) {
/*    */     return SendDebugMessageCommand$.MODULE$.compareTo(paramObject);
/*    */   } public static int compareTo(ICommand paramICommand) {
/*    */     return SendDebugMessageCommand$.MODULE$.compareTo(paramICommand);
/*    */   } public final class SendDebugMessageCommand$$anonfun$processCommand$1 extends AbstractFunction1<DebugNetwork.DebugNode, BoxedUnit> implements Serializable { public final void apply(DebugNetwork.DebugNode endpoint) {
/* 20 */       Packet packet = Network.newPacket(this.sender$1.func_70005_c_(), this.destination$1, 0, (Object[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])this.args$1).drop(1)).toList().toArray(ClassTag$.MODULE$.AnyRef()));
/* 21 */       endpoint.receivePacket(packet);
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ICommandSender sender$1;
/*    */     private final String[] args$1;
/*    */     private final String destination$1;
/*    */     
/*    */     public SendDebugMessageCommand$$anonfun$processCommand$1(ICommandSender sender$1, String[] args$1, String destination$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\SendDebugMessageCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */