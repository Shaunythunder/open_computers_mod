/*    */ package li.cil.oc.common.inventory;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.integration.opencomputers.DriverUpgradeDatabase$;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public abstract class DatabaseInventory$class {
/*    */   public static int tier(DatabaseInventory $this) {
/*  8 */     return DriverUpgradeDatabase$.MODULE$.tier($this.container());
/*    */   } public static void $init$(DatabaseInventory $this) {} public static int getSizeInventory(DatabaseInventory $this) {
/* 10 */     return Settings$.MODULE$.get().databaseEntriesPerTier()[$this.tier()];
/*    */   } public static String inventoryName(DatabaseInventory $this) {
/* 12 */     return "Database";
/*    */   } public static int getInventoryStackLimit(DatabaseInventory $this) {
/* 14 */     return 0;
/*    */   } public static int getInventoryStackRequired(DatabaseInventory $this) {
/* 16 */     return 0;
/*    */   } public static boolean isItemValidForSlot(DatabaseInventory $this, int slot, ItemStack stack) {
/* 18 */     ItemStack itemStack = $this.container(); if (stack == null) { if (itemStack != null); } else if (stack.equals(itemStack))
/*    */     {  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\DatabaseInventory$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */