/*    */ package li.cil.oc.server.command;@ScalaSignature(bytes = "\006\0011;Q!\001\002\t\0025\tAc\0259bo:\034u.\0349vi\026\0248i\\7nC:$'BA\002\005\003\035\031w.\\7b]\022T!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\025'B\fwO\\\"p[B,H/\032:D_6l\027M\0343\024\005=\021\002CA\n\030\033\005!\"BA\002\026\025\t1b!\001\004d_6lwN\\\005\0031Q\021QbU5na2,7i\\7nC:$\007\"\002\016\020\t\003Y\022A\002\037j]&$h\bF\001\016\021\035irB1A\005\006y\t1\"T1y\t&\034H/\0318dKV\tqdD\001!;\005\001\002B\002\022\020A\0035q$\001\007NCb$\025n\035;b]\016,\007\005C\003%\037\021\005S%A\bhKR\034u.\\7b]\022,6/Y4f)\t1\003\007\005\002([9\021\001fK\007\002S)\t!&A\003tG\006d\027-\003\002-S\0051\001K]3eK\032L!AL\030\003\rM#(/\0338h\025\ta\023\006C\0032G\001\007!'\001\004t_V\0248-\032\t\003gej\021\001\016\006\003\007UR!AN\034\002\0235Lg.Z2sC\032$(\"\001\035\002\0079,G/\003\002;i\tq\021jQ8n[\006tGmU3oI\026\024\b\"\002\037\020\t\003j\024A\0049s_\016,7o]\"p[6\fg\016\032\013\004}\005\023\005C\001\025@\023\t\001\025F\001\003V]&$\b\"B\031<\001\004\021\004\"B\002<\001\004\031\005c\001\025EM%\021Q)\013\002\006\003J\024\030-\037\005\006\017>!\t\005S\001\033O\026$(+Z9vSJ,G\rU3s[&\0348/[8o\031\0264X\r\034\013\002\023B\021\001FS\005\003\027&\0221!\0238u\001")
/*    */ public final class SpawnComputerCommand { public static int getRequiredPermissionLevel() {
/*    */     return SpawnComputerCommand$.MODULE$.func_82362_a();
/*    */   }
/*    */   public static void processCommand(ICommandSender paramICommandSender, String[] paramArrayOfString) {
/*    */     SpawnComputerCommand$.MODULE$.func_71515_b(paramICommandSender, paramArrayOfString);
/*    */   }
/*    */   
/*    */   public static String getCommandUsage(ICommandSender paramICommandSender) {
/*    */     return SpawnComputerCommand$.MODULE$.func_71518_a(paramICommandSender);
/*    */   }
/*    */   
/*    */   public static int MaxDistance() {
/*    */     return SpawnComputerCommand$.MODULE$.MaxDistance();
/*    */   }
/*    */   
/*    */   public static List<Object> addTabCompletionOptions(ICommandSender paramICommandSender, String[] paramArrayOfString) {
/*    */     return SpawnComputerCommand$.MODULE$.func_71516_a(paramICommandSender, paramArrayOfString);
/*    */   }
/*    */   
/*    */   public static boolean isUsernameIndex(String[] paramArrayOfString, int paramInt) {
/*    */     return SpawnComputerCommand$.MODULE$.func_82358_a(paramArrayOfString, paramInt);
/*    */   }
/*    */   
/*    */   public static boolean canCommandSenderUseCommand(ICommandSender paramICommandSender) {
/*    */     return SpawnComputerCommand$.MODULE$.func_71519_b(paramICommandSender);
/*    */   }
/*    */   
/*    */   public static List<String> getCommandAliases() {
/*    */     return SpawnComputerCommand$.MODULE$.func_71514_a();
/*    */   }
/*    */   
/*    */   public static String getCommandName() {
/*    */     return SpawnComputerCommand$.MODULE$.func_71517_b();
/*    */   }
/*    */   
/*    */   public static String name() {
/*    */     return SpawnComputerCommand$.MODULE$.name();
/*    */   }
/*    */   
/*    */   public static int compareTo(Object paramObject) {
/*    */     return SpawnComputerCommand$.MODULE$.compareTo(paramObject);
/*    */   }
/*    */   
/*    */   public static int compareTo(ICommand paramICommand) {
/*    */     return SpawnComputerCommand$.MODULE$.compareTo(paramICommand);
/*    */   }
/*    */   
/*    */   public final class SpawnComputerCommand$$anonfun$rotateProperly$1$1 extends AbstractFunction0<ForgeDirection> implements Serializable { public final ForgeDirection apply() {
/* 50 */       return ForgeDirection.NORTH;
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L; }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\SpawnComputerCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */