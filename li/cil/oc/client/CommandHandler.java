/*    */ package li.cil.oc.client;
/*    */ 
/*    */ import li.cil.oc.common.command.SimpleCommand;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001M;Q!\001\002\t\002-\tabQ8n[\006tG\rS1oI2,'O\003\002\004\t\00511\r\\5f]RT!!\002\004\002\005=\034'BA\004\t\003\r\031\027\016\034\006\002\023\005\021A.[\002\001!\taQ\"D\001\003\r\025q!\001#\001\020\0059\031u.\\7b]\022D\025M\0343mKJ\034\"!\004\t\021\005E!R\"\001\n\013\003M\tQa]2bY\006L!!\006\n\003\r\005s\027PU3g\021\0259R\002\"\001\031\003\031a\024N\\5u}Q\t1\002C\003\033\033\021\0051$\001\005sK\036L7\017^3s)\005a\002CA\t\036\023\tq\"C\001\003V]&$x!\002\021\016\021\003\t\023aE*fi\016c\027\016\0352pCJ$7i\\7nC:$\007C\001\022$\033\005ia!\002\023\016\021\003)#aE*fi\016c\027\016\0352pCJ$7i\\7nC:$7CA\022'!\t9C&D\001)\025\tI#&A\004d_6l\027M\0343\013\005-\"\021AB2p[6|g.\003\002.Q\ti1+[7qY\026\034u.\\7b]\022DQaF\022\005\002=\"\022!\t\005\006c\r\"\tEM\001\020O\026$8i\\7nC:$Wk]1hKR\0211G\017\t\003i]r!!E\033\n\005Y\022\022A\002)sK\022,g-\003\0029s\t11\013\036:j]\036T!A\016\n\t\013m\002\004\031\001\037\002\rM|WO]2f!\ti4)D\001?\025\tIsH\003\002A\003\006IQ.\0338fGJ\fg\r\036\006\002\005\006\031a.\032;\n\005\021s$AD%D_6l\027M\0343TK:$WM\035\005\006\r\016\"\teR\001\017aJ|7-Z:t\007>lW.\0318e)\ra\002*\023\005\006w\025\003\r\001\020\005\006S\025\003\rA\023\t\004#-\033\024B\001'\023\005\025\t%O]1z\021\025q5\005\"\021P\003i9W\r\036*fcVL'/\0323QKJl\027n]:j_:dUM^3m)\005\001\006CA\tR\023\t\021&CA\002J]R\004")
/*    */ public final class CommandHandler {
/*    */   public static void register() {
/*    */     CommandHandler$.MODULE$.register();
/*    */   }
/*    */   
/*    */   public static class SetClipboardCommand$ extends SimpleCommand {
/* 13 */     public SetClipboardCommand$() { super("oc_setclipboard"); MODULE$ = this; } public static final SetClipboardCommand$ MODULE$; public String func_71518_a(ICommandSender source) {
/* 14 */       return (new StringBuilder()).append(name()).append(" <value>").toString();
/*    */     }
/*    */     public void func_71515_b(ICommandSender source, String[] command) {
/* 17 */       if ((source.func_130014_f_()).field_72995_K && command != null && command.length > 0) {
/* 18 */         GuiScreen.func_146275_d(command[0]);
/*    */       }
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public int func_82362_a() {
/* 28 */       return 0;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\CommandHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */