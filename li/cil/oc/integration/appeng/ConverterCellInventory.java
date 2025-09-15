/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.api.AEApi;
/*    */ import appeng.api.storage.ICellInventory;
/*    */ import appeng.api.storage.ICellInventoryHandler;
/*    */ import appeng.api.storage.IMEInventoryHandler;
/*    */ import appeng.api.storage.StorageChannel;
/*    */ import appeng.util.IterationCounter;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ 
/*    */ public final class ConverterCellInventory
/*    */   implements Converter
/*    */ {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 18 */     if (value instanceof ICellInventory) {
/* 19 */       ICellInventory cell = (ICellInventory)value;
/* 20 */       output.put("storedItemTypes", Long.valueOf(cell.getStoredItemTypes()));
/* 21 */       output.put("storedItemCount", Long.valueOf(cell.getStoredItemCount()));
/* 22 */       output.put("remainingItemCount", Long.valueOf(cell.getRemainingItemCount()));
/* 23 */       output.put("remainingItemTypes", Long.valueOf(cell.getRemainingItemTypes()));
/*    */       
/* 25 */       output.put("getTotalItemTypes", Long.valueOf(cell.getTotalItemTypes()));
/* 26 */       output.put("getAvailableItems", cell
/*    */           
/* 28 */           .getAvailableItems(AEApi.instance().storage().createItemList(), IterationCounter.fetchNewId()));
/*    */       
/* 30 */       output.put("totalBytes", Long.valueOf(cell.getTotalBytes()));
/* 31 */       output.put("freeBytes", Long.valueOf(cell.getFreeBytes()));
/* 32 */       output.put("usedBytes", Long.valueOf(cell.getUsedBytes()));
/* 33 */       output.put("unusedItemCount", Integer.valueOf(cell.getUnusedItemCount()));
/* 34 */       output.put("canHoldNewItem", Boolean.valueOf(cell.canHoldNewItem()));
/*    */ 
/*    */       
/* 37 */       output.put("fuzzyMode", cell.getFuzzyMode().toString());
/* 38 */       output.put("name", cell.getItemStack().func_82833_r());
/* 39 */     } else if (value instanceof ICellInventoryHandler) {
/* 40 */       convert(((ICellInventoryHandler)value).getCellInv(), output);
/* 41 */     } else if (value instanceof ItemStack && ((ItemStack)value).func_77973_b() instanceof appeng.api.implementations.items.IStorageCell) {
/*    */ 
/*    */ 
/*    */       
/* 45 */       IMEInventoryHandler<?> inventory = AEApi.instance().registries().cell().getCellInventory((ItemStack)value, null, StorageChannel.ITEMS);
/* 46 */       if (inventory instanceof ICellInventoryHandler)
/* 47 */         convert(((ICellInventoryHandler)inventory).getCellInv(), output); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\ConverterCellInventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */