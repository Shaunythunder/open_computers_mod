/*    */ package li.cil.oc.integration.mystcraft;
/*    */ 
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ public class ConverterPage
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 11 */     if (value instanceof ItemStack) {
/* 12 */       ItemStack stack = (ItemStack)value;
/* 13 */       if ("item.myst.page".equals(stack.func_77977_a()) && stack.func_77942_o()) {
/* 14 */         NBTTagCompound tag = stack.func_77978_p();
/* 15 */         output.put("symbol", tag.func_74779_i("symbol"));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mystcraft\ConverterPage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */