/*    */ package li.cil.oc.integration.cofh.energy;
/*    */ import cofh.api.energy.IEnergyContainerItem;
/*    */ import li.cil.oc.api.event.RobotUsedToolEvent;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Tuple2;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class EventHandlerRedstoneFlux$ {
/*    */   @SubscribeEvent
/*    */   public void onRobotApplyDamageRate(RobotUsedToolEvent.ApplyDamageRate e) {
/* 12 */     Tuple2 tuple2 = new Tuple2(e.toolBeforeUse.func_77973_b(), e.toolAfterUse.func_77973_b()); if (tuple2 != null) {
/* 13 */       Item energyBefore = (Item)tuple2._1(), energyAfter = (Item)tuple2._2(); if (energyBefore instanceof IEnergyContainerItem) { Item item = energyBefore; if (energyAfter instanceof IEnergyContainerItem) { Item item1 = energyAfter;
/* 14 */           int damage = ((IEnergyContainerItem)item).getEnergyStored(e.toolBeforeUse) - ((IEnergyContainerItem)item1).getEnergyStored(e.toolAfterUse);
/*    */           
/* 16 */           double actualDamage = damage * e.getDamageRate();
/* 17 */           int repairedDamage = 
/* 18 */             (e.agent.player().func_70681_au().nextDouble() > 0.5D) ? (
/* 19 */             damage - (int)scala.math.package$.MODULE$.floor(actualDamage)) : (
/*    */             
/* 21 */             damage - (int)scala.math.package$.MODULE$.ceil(actualDamage));
/* 22 */           ((IEnergyContainerItem)item1).receiveEnergy(e.toolAfterUse, repairedDamage, false); BoxedUnit boxedUnit1 = (damage > 0) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }  }
/*    */     
/* 24 */     }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */   }
/*    */   public static final EventHandlerRedstoneFlux$ MODULE$;
/*    */   public double getDurability(ItemStack stack) {
/*    */     double d;
/* 29 */     Item item = stack.func_77973_b();
/* 30 */     if (item instanceof IEnergyContainerItem) { Item item1 = item; d = ((IEnergyContainerItem)item1).getEnergyStored(stack) / ((IEnergyContainerItem)item1).getMaxEnergyStored(stack); }
/* 31 */     else { d = Double.NaN; }
/*    */     
/*    */     return d;
/*    */   } public boolean canCharge(ItemStack stack) { boolean bool;
/* 35 */     Item item = stack.func_77973_b();
/* 36 */     if (item instanceof IEnergyContainerItem) { Item item1 = item; bool = (((IEnergyContainerItem)item1).getMaxEnergyStored(stack) > 0) ? true : false; }
/* 37 */     else { bool = false; }
/*    */     
/*    */     return bool; }
/*    */   public double charge(ItemStack stack, double amount, boolean simulate) { double d;
/* 41 */     Item item = stack.func_77973_b();
/* 42 */     if (item instanceof IEnergyContainerItem) { Item item1 = item; d = amount - li.cil.oc.integration.util.Power$.MODULE$.fromRF(((IEnergyContainerItem)item1).receiveEnergy(stack, li.cil.oc.integration.util.Power$.MODULE$.toRF(amount), simulate)); }
/* 43 */     else { d = amount; }
/*    */     
/*    */     return d; } private EventHandlerRedstoneFlux$() {
/* 46 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\EventHandlerRedstoneFlux$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */