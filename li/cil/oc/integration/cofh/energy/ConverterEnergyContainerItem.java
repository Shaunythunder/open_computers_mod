/*    */ package li.cil.oc.integration.cofh.energy;
/*    */ 
/*    */ import cofh.api.energy.IEnergyContainerItem;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public final class ConverterEnergyContainerItem
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 12 */     if (value instanceof ItemStack) {
/* 13 */       ItemStack stack = (ItemStack)value;
/* 14 */       Item item = stack.func_77973_b();
/* 15 */       if (item instanceof IEnergyContainerItem) {
/* 16 */         IEnergyContainerItem energyItem = (IEnergyContainerItem)item;
/* 17 */         output.put("energy", Integer.valueOf(energyItem.getEnergyStored(stack)));
/* 18 */         output.put("maxEnergy", Integer.valueOf(energyItem.getMaxEnergyStored(stack)));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\ConverterEnergyContainerItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */