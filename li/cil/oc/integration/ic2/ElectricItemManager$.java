/*    */ package li.cil.oc.integration.ic2;
/*    */ import ic2.api.item.IElectricItemManager;
/*    */ import li.cil.oc.api.driver.item.Chargeable;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public final class ElectricItemManager$ implements IElectricItemManager {
/*    */   private ElectricItemManager$() {
/* 10 */     MODULE$ = this;
/*    */   } public static final ElectricItemManager$ MODULE$; public double getCharge(ItemStack stack) {
/*    */     double d;
/* 13 */     Item item = stack.func_77973_b();
/* 14 */     if (item instanceof Chargeable) { Item item1 = item;
/* 15 */       d = li.cil.oc.integration.util.Power$.MODULE$.toEU(2147483647 + ((Chargeable)item1).charge(stack, -2.147483647E9D, true)); }
/* 16 */     else { d = 0.0D; }
/*    */     
/*    */     return (stack == null) ? 0.0D : d;
/*    */   }
/*    */   public double charge(ItemStack stack, double amount, int tier, boolean ignoreTransferLimit, boolean simulate) {
/*    */     double d;
/* 22 */     Item item = stack.func_77973_b();
/* 23 */     if (item instanceof Chargeable) { Item item1 = item;
/* 24 */       double limitedAmount = ignoreTransferLimit ? scala.math.package$.MODULE$.min(2.147483647E9D, amount) : scala.math.package$.MODULE$.min(amount, li.cil.oc.Settings$.MODULE$.get().chargeRateTablet());
/* 25 */       d = limitedAmount - li.cil.oc.integration.util.Power$.MODULE$.toEU(((Chargeable)item1).charge(stack, li.cil.oc.integration.util.Power$.MODULE$.fromEU(limitedAmount), simulate)); }
/* 26 */     else { d = 0.0D; }
/*    */     
/*    */     return (stack == null) ? 0.0D : d;
/*    */   }
/*    */   public double discharge(ItemStack stack, double amount, int tier, boolean ignoreTransferLimit, boolean externally, boolean simulate) {
/* 31 */     return 0.0D;
/*    */   }
/*    */   public void chargeFromArmor(ItemStack stack, EntityLivingBase entity) {}
/*    */   
/*    */   public boolean canUse(ItemStack stack, double amount) {
/* 36 */     return (getCharge(stack) >= amount);
/*    */   } public boolean use(ItemStack stack, double amount, EntityLivingBase entity) {
/* 38 */     return (canUse(stack, amount) && false);
/*    */   }
/*    */   
/*    */   public String getToolTip(ItemStack stack) {
/* 42 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\ElectricItemManager$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */