/*    */ package li.cil.oc.server.command;
/*    */ import cpw.mods.fml.common.event.FMLServerStartingEvent;
/*    */ import net.minecraft.command.ICommand;
/*    */ 
/*    */ public final class CommandHandler$ {
/*    */   public void register(FMLServerStartingEvent e) {
/*  7 */     e.registerServerCommand((ICommand)DebugNanomachinesCommand$.MODULE$);
/*  8 */     e.registerServerCommand((ICommand)LogNanomachinesCommand$.MODULE$);
/*  9 */     e.registerServerCommand((ICommand)NetworkProfilingCommand$.MODULE$);
/* 10 */     e.registerServerCommand((ICommand)NonDisassemblyAgreementCommand$.MODULE$);
/* 11 */     e.registerServerCommand((ICommand)WirelessRenderingCommand$.MODULE$);
/* 12 */     e.registerServerCommand((ICommand)SpawnComputerCommand$.MODULE$);
/* 13 */     e.registerServerCommand((ICommand)DebugWhitelistCommand$.MODULE$);
/* 14 */     e.registerServerCommand((ICommand)SendDebugMessageCommand$.MODULE$);
/*    */   } public static final CommandHandler$ MODULE$; private CommandHandler$() {
/* 16 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\CommandHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */