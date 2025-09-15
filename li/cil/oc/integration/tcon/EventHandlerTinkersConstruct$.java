/*    */ package li.cil.oc.integration.tcon;
/*    */ import li.cil.oc.api.event.RobotUsedToolEvent;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ public final class EventHandlerTinkersConstruct$ {
/*    */   public boolean isTinkerTool(ItemStack stack) {
/*  8 */     return (stack.func_77942_o() && stack.func_77978_p().func_74764_b("InfiTool"));
/*    */   } public static final EventHandlerTinkersConstruct$ MODULE$;
/*    */   @SubscribeEvent
/*    */   public void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate e) {
/* 12 */     if (isTinkerTool(e.toolBeforeUse)) {
/* 13 */       NBTTagCompound nbtBefore = e.toolBeforeUse.func_77978_p().func_74775_l("InfiTool");
/* 14 */       NBTTagCompound nbtAfter = e.toolAfterUse.func_77978_p().func_74775_l("InfiTool");
/* 15 */       int damage = nbtAfter.func_74762_e("Damage") - nbtBefore.func_74762_e("Damage");
/* 16 */       if (damage > 0) {
/* 17 */         double actualDamage = damage * e.getDamageRate();
/* 18 */         int repairedDamage = 
/* 19 */           (e.agent.player().func_70681_au().nextDouble() > 0.5D) ? (
/* 20 */           damage - (int)scala.math.package$.MODULE$.floor(actualDamage)) : (
/*    */           
/* 22 */           damage - (int)scala.math.package$.MODULE$.ceil(actualDamage));
/* 23 */         nbtAfter.func_74768_a("Damage", nbtAfter.func_74762_e("Damage") - repairedDamage);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public double getDurability(ItemStack stack) {
/* 30 */     NBTTagCompound nbt = stack.func_77978_p().func_74775_l("InfiTool");
/*    */ 
/*    */     
/* 33 */     int damage = nbt.func_74762_e("Damage");
/* 34 */     int maxDamage = nbt.func_74762_e("TotalDurability");
/* 35 */     return isTinkerTool(stack) ? (nbt.func_74767_n("Broken") ? 0.0D : (1.0D - damage / maxDamage)) : 
/*    */ 
/*    */       
/* 38 */       Double.NaN;
/*    */   } private EventHandlerTinkersConstruct$() {
/* 40 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tcon\EventHandlerTinkersConstruct$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */