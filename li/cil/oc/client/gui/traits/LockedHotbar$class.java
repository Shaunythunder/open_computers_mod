/*    */ package li.cil.oc.client.gui.traits;
/*    */ 
/*    */ import net.minecraft.inventory.Slot;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public abstract class LockedHotbar$class
/*    */ {
/*    */   public static void $init$(LockedHotbar $this) {}
/*    */   
/*    */   public static void handleMouseClick(LockedHotbar $this, Slot slot, int slotNumber, int button, int shift) {
/* 11 */     if (slot != null) { ItemStack itemStack = $this.lockedStack(); if (slot.func_75211_c() == null) { slot.func_75211_c(); if (itemStack != null)
/* 12 */         { $this.li$cil$oc$client$gui$traits$LockedHotbar$$super$handleMouseClick(slot, slotNumber, button, shift); return; }  } else if (!slot.func_75211_c().equals(itemStack)) { $this.li$cil$oc$client$gui$traits$LockedHotbar$$super$handleMouseClick(slot, slotNumber, button, shift); return; }  return; }  $this.li$cil$oc$client$gui$traits$LockedHotbar$$super$handleMouseClick(slot, slotNumber, button, shift);
/*    */   }
/*    */   
/*    */   public static boolean checkHotbarKeys(LockedHotbar $this, int keyCode) {
/* 16 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\LockedHotbar$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */