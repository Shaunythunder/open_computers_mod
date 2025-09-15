/*    */ package li.cil.oc.server.command;
/*    */ import li.cil.oc.common.command.SimpleCommand;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class NetworkProfilingCommand$ extends SimpleCommand {
/*    */   private NetworkProfilingCommand$() {
/*  8 */     super("oc_profileNetwork"); MODULE$ = this;
/*  9 */     aliases().$plus$eq("oc_pn");
/*    */   } public static final NetworkProfilingCommand$ MODULE$; public String func_71518_a(ICommandSender source) {
/* 11 */     return (new StringBuilder()).append(name()).append(" <boolean>").toString();
/*    */   }
/*    */   public void func_71515_b(ICommandSender source, String[] command) {
/* 14 */     li.cil.oc.common.PacketBuilder$.MODULE$.isProfilingEnabled_$eq((
/* 15 */         command != null && command.length > 0) ? 
/* 16 */         CommandBase.func_110662_c(source, command[0]) : (
/*    */         
/* 18 */         !li.cil.oc.common.PacketBuilder$.MODULE$.isProfilingEnabled()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_82362_a() {
/* 27 */     return 3;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\NetworkProfilingCommand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */