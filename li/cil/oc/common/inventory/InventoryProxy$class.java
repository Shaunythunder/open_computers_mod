/*    */ package li.cil.oc.common.inventory;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public abstract class InventoryProxy$class {
/*    */   public static void $init$(InventoryProxy $this) {}
/*    */   
/*    */   public static int offset(InventoryProxy $this) {
/* 10 */     return 0;
/*    */   } public static int getSizeInventory(InventoryProxy $this) {
/* 12 */     return $this.inventory().func_70302_i_();
/*    */   } public static int getInventoryStackLimit(InventoryProxy $this) {
/* 14 */     return $this.inventory().func_70297_j_();
/*    */   } public static String getInventoryName(InventoryProxy $this) {
/* 16 */     return $this.inventory().func_145825_b();
/*    */   } public static boolean hasCustomInventoryName(InventoryProxy $this) {
/* 18 */     return $this.inventory().func_145818_k_();
/*    */   } public static boolean isUseableByPlayer(InventoryProxy $this, EntityPlayer player) {
/* 20 */     return $this.inventory().func_70300_a(player);
/*    */   }
/*    */   public static boolean isItemValidForSlot(InventoryProxy $this, int slot, ItemStack stack) {
/* 23 */     int offsetSlot = slot + $this.offset();
/* 24 */     return (isValidSlot($this, offsetSlot) && $this.inventory().func_94041_b(offsetSlot, stack));
/*    */   }
/*    */   
/*    */   public static ItemStack getStackInSlot(InventoryProxy $this, int slot) {
/* 28 */     int offsetSlot = slot + $this.offset();
/* 29 */     return isValidSlot($this, offsetSlot) ? $this.inventory().func_70301_a(offsetSlot) : 
/* 30 */       null;
/*    */   }
/*    */   
/*    */   public static ItemStack decrStackSize(InventoryProxy $this, int slot, int amount) {
/* 34 */     int offsetSlot = slot + $this.offset();
/* 35 */     return isValidSlot($this, offsetSlot) ? $this.inventory().func_70298_a(offsetSlot, amount) : 
/* 36 */       null;
/*    */   }
/*    */   
/*    */   public static ItemStack getStackInSlotOnClosing(InventoryProxy $this, int slot) {
/* 40 */     int offsetSlot = slot + $this.offset();
/* 41 */     return isValidSlot($this, offsetSlot) ? $this.inventory().func_70304_b(offsetSlot) : 
/* 42 */       null;
/*    */   }
/*    */   
/*    */   public static void setInventorySlotContents(InventoryProxy $this, int slot, ItemStack stack) {
/* 46 */     int offsetSlot = slot + $this.offset();
/* 47 */     if (isValidSlot($this, offsetSlot)) $this.inventory().func_70299_a(offsetSlot, stack); 
/*    */   }
/*    */   public static void markDirty(InventoryProxy $this) {
/* 50 */     $this.inventory().func_70296_d();
/*    */   } public static void openInventory(InventoryProxy $this) {
/* 52 */     $this.inventory().func_70295_k_();
/*    */   } public static void closeInventory(InventoryProxy $this) {
/* 54 */     $this.inventory().func_70305_f();
/*    */   } private static boolean isValidSlot(InventoryProxy $this, int slot) {
/* 56 */     return (slot >= $this.offset() && slot < $this.func_70302_i_() + $this.offset());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\InventoryProxy$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */