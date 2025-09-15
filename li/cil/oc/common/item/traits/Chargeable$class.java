/*    */ package li.cil.oc.common.item.traits;
/*    */ 
/*    */ import appeng.api.config.AccessRestriction;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import ic2.api.item.IElectricItemManager;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.integration.ic2.ElectricItemManager$;
/*    */ import li.cil.oc.integration.util.Power$;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Chargeable$class
/*    */ {
/*    */   public static void $init$(Chargeable $this) {}
/*    */   
/*    */   public static double getAECurrentPower(Chargeable $this, ItemStack stack) {
/* 31 */     return Power$.MODULE$.toAE($this.getCharge(stack));
/*    */   }
/*    */   public static double getAEMaxPower(Chargeable $this, ItemStack stack) {
/* 34 */     return Power$.MODULE$.toAE($this.maxCharge(stack));
/*    */   }
/*    */   public static double injectAEPower(Chargeable $this, ItemStack stack, double value) {
/* 37 */     return Power$.MODULE$.toAE($this.charge(stack, Power$.MODULE$.fromAE(value), false));
/*    */   }
/*    */   public static double extractAEPower(Chargeable $this, ItemStack stack, double value) {
/* 40 */     return value - Power$.MODULE$.toAE($this.charge(stack, Power$.MODULE$.fromAE(-value), false));
/*    */   } @Method(modid = "appliedenergistics2")
/*    */   public static AccessRestriction getPowerFlow(Chargeable $this, ItemStack stack) {
/* 43 */     return AccessRestriction.WRITE;
/*    */   }
/*    */   
/*    */   @Method(modid = "IC2")
/*    */   public static IElectricItemManager getManager(Chargeable $this, ItemStack stack) {
/* 48 */     return (IElectricItemManager)ElectricItemManager$.MODULE$;
/*    */   }
/*    */   public static double getMaxCharge(Chargeable $this, ItemStack stack) {
/* 51 */     return Power$.MODULE$.toEU($this.maxCharge(stack));
/*    */   }
/*    */   public static double getTransferLimit(Chargeable $this, ItemStack stack) {
/* 54 */     return Power$.MODULE$.toEU(Settings$.MODULE$.get().chargeRateTablet());
/*    */   } public static int getTier(Chargeable $this, ItemStack stack) {
/* 56 */     return 1;
/*    */   } public static boolean canProvideEnergy(Chargeable $this, ItemStack stack) {
/* 58 */     return false;
/*    */   } public static Item getEmptyItem(Chargeable $this, ItemStack stack) {
/* 60 */     return stack.func_77973_b();
/*    */   } public static Item getChargedItem(Chargeable $this, ItemStack stack) {
/* 62 */     return stack.func_77973_b();
/*    */   }
/*    */ 
/*    */   
/*    */   public static double getEnergy(Chargeable $this, ItemStack stack) {
/* 67 */     return Power$.MODULE$.toJoules($this.getCharge(stack));
/*    */   }
/*    */   public static void setEnergy(Chargeable $this, ItemStack stack, double amount) {
/* 70 */     $this.setCharge(stack, Power$.MODULE$.fromJoules(amount));
/*    */   }
/*    */   public static double getMaxEnergy(Chargeable $this, ItemStack stack) {
/* 73 */     return Power$.MODULE$.toJoules($this.maxCharge(stack));
/*    */   } public static boolean canSend(Chargeable $this, ItemStack stack) {
/* 75 */     return false;
/*    */   } public static boolean canReceive(Chargeable $this, ItemStack stack) {
/* 77 */     return true;
/*    */   } public static boolean isMetadataSpecific(Chargeable $this, ItemStack stack) {
/* 79 */     return false;
/*    */   }
/*    */   public static double getMaxTransfer(Chargeable $this, ItemStack stack) {
/* 82 */     return Power$.MODULE$.toJoules(Settings$.MODULE$.get().chargeRateTablet());
/*    */   }
/*    */ 
/*    */   
/*    */   public static int getEnergyStored(Chargeable $this, ItemStack stack) {
/* 87 */     return Power$.MODULE$.toRF($this.getCharge(stack));
/*    */   }
/*    */   public static int getMaxEnergyStored(Chargeable $this, ItemStack stack) {
/* 90 */     return Power$.MODULE$.toRF($this.maxCharge(stack));
/*    */   }
/*    */   public static int receiveEnergy(Chargeable $this, ItemStack stack, int maxReceive, boolean simulate) {
/* 93 */     return maxReceive - Power$.MODULE$.toRF($this.charge(stack, Power$.MODULE$.fromRF(maxReceive), simulate));
/*    */   }
/*    */   public static int extractEnergy(Chargeable $this, ItemStack stack, int maxExtract, boolean simulate) {
/* 96 */     return maxExtract - Power$.MODULE$.toRF($this.charge(stack, Power$.MODULE$.fromRF(-maxExtract), simulate));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\Chargeable$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */