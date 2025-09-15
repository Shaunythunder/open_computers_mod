/*    */ package li.cil.oc.server.command;
/*    */ import li.cil.oc.api.nanomachines.Controller;
/*    */ import li.cil.oc.common.nanomachines.ControllerImpl;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.ChatComponentText;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class DebugNanomachinesCommand$ extends SimpleCommand {
/*    */   private DebugNanomachinesCommand$() {
/* 11 */     super("oc_debugNanomachines"); MODULE$ = this;
/* 12 */     aliases().$plus$eq("oc_dn");
/*    */   } public static final DebugNanomachinesCommand$ MODULE$; public String func_71518_a(ICommandSender source) {
/* 14 */     return name();
/*    */   }
/*    */   public void func_71515_b(ICommandSender source, String[] command) {
/* 17 */     ICommandSender iCommandSender = source;
/* 18 */     if (iCommandSender instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)iCommandSender;
/* 19 */       Controller controller = Nanomachines.installController(entityPlayer);
/* 20 */       if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller;
/* 21 */         controllerImpl.debug();
/* 22 */         entityPlayer.func_145747_a((IChatComponent)new ChatComponentText("Debug configuration created, see log for mappings.")); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 23 */       else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*    */        BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }
/* 25 */      throw new WrongUsageException("Can only be used by players.", new Object[0]);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_82362_a() {
/* 35 */     return 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\DebugNanomachinesCommand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */