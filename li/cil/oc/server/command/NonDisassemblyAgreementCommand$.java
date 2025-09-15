/*    */ package li.cil.oc.server.command;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class NonDisassemblyAgreementCommand$ extends SimpleCommand {
/*    */   private NonDisassemblyAgreementCommand$() {
/* 11 */     super("oc_preventDisassembling"); MODULE$ = this;
/* 12 */     aliases().$plus$eq("oc_nodis");
/* 13 */     aliases().$plus$eq("oc_prevdis");
/*    */   } public static final NonDisassemblyAgreementCommand$ MODULE$; public String func_71518_a(ICommandSender source) {
/* 15 */     return (new StringBuilder()).append(name()).append(" <boolean>").toString();
/*    */   }
/*    */   public void func_71515_b(ICommandSender source, String[] command) {
/* 18 */     ICommandSender iCommandSender = source;
/* 19 */     if (iCommandSender instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)iCommandSender;
/* 20 */       ItemStack stack = entityPlayer.func_70694_bm();
/*    */       
/* 22 */       if (!stack.func_77942_o()) {
/* 23 */         stack.func_77982_d(new NBTTagCompound());
/*    */       }
/* 25 */       NBTTagCompound nbt = stack.func_77978_p();
/* 26 */       boolean preventDisassembly = 
/* 27 */         (command != null && command.length > 0) ? 
/* 28 */         CommandBase.func_110662_c(source, command[0]) : (
/*    */         
/* 30 */         !nbt.func_74767_n((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("undisassemblable").toString()));
/* 31 */       if (preventDisassembly) {
/* 32 */         nbt.func_74757_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("undisassemblable").toString(), true);
/*    */       } else {
/* 34 */         nbt.func_82580_o((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("undisassemblable").toString());
/* 35 */       }  stack.func_77982_d(null); BoxedUnit boxedUnit = (stack == null) ? BoxedUnit.UNIT : (nbt.func_82582_d() ? BoxedUnit.UNIT : BoxedUnit.UNIT); return; }
/*    */     
/* 37 */     throw new WrongUsageException("Can only be used by players.", new Object[0]);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_82362_a() {
/* 47 */     return 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\NonDisassemblyAgreementCommand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */