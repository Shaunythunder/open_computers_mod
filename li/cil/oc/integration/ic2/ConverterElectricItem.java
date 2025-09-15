/*    */ package li.cil.oc.integration.ic2;
/*    */ 
/*    */ import ic2.api.item.ElectricItem;
/*    */ import ic2.api.item.IElectricItem;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ConverterElectricItem
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 13 */     if (value instanceof ItemStack) {
/* 14 */       ItemStack stack = (ItemStack)value;
/* 15 */       Item item = stack.func_77973_b();
/* 16 */       if (item instanceof IElectricItem) {
/* 17 */         IElectricItem electricItem = (IElectricItem)item;
/* 18 */         output.put("canProvideEnergy", Boolean.valueOf(electricItem.canProvideEnergy(stack)));
/* 19 */         output.put("charge", Double.valueOf(ElectricItem.manager.getCharge(stack)));
/* 20 */         output.put("maxCharge", Double.valueOf(electricItem.getMaxCharge(stack)));
/* 21 */         output.put("tier", Integer.valueOf(electricItem.getTier(stack)));
/* 22 */         output.put("transferLimit", Double.valueOf(electricItem.getTransferLimit(stack)));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\ConverterElectricItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */