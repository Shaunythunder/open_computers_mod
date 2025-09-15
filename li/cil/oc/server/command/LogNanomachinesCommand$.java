/*    */ package li.cil.oc.server.command;
/*    */ import li.cil.oc.api.nanomachines.Controller;
/*    */ import li.cil.oc.common.nanomachines.ControllerImpl;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.server.management.ServerConfigurationManager;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class LogNanomachinesCommand$ extends SimpleCommand {
/*    */   private LogNanomachinesCommand$() {
/* 11 */     super("oc_nanomachines"); MODULE$ = this;
/* 12 */     aliases().$plus$eq("oc_nm");
/*    */   } public static final LogNanomachinesCommand$ MODULE$; public String func_71518_a(ICommandSender source) {
/* 14 */     return (new StringBuilder()).append(name()).append(" [player]").toString();
/*    */   }
/*    */   
/*    */   public void func_71515_b(ICommandSender source, String[] command) {
/* 18 */     String player = command[0];
/* 19 */     ServerConfigurationManager config = MinecraftServer.func_71276_C().func_71203_ab();
/* 20 */     EntityPlayer entityPlayer = (EntityPlayer)((command.length > 0) ? config.func_152612_a(player) : 
/* 21 */       source);
/* 22 */     if (entityPlayer instanceof EntityPlayer) { EntityPlayer entityPlayer1 = entityPlayer;
/* 23 */       Controller controller = Nanomachines.installController(entityPlayer1);
/* 24 */       if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller; controllerImpl.print(); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 25 */       else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*    */        BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }
/* 27 */      throw new WrongUsageException("Player entity not found.", new Object[0]);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_82362_a() {
/* 37 */     return 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\LogNanomachinesCommand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */