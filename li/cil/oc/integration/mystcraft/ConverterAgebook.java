/*    */ package li.cil.oc.integration.mystcraft;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ public class ConverterAgebook
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 12 */     if (value instanceof ItemStack) {
/* 13 */       ItemStack stack = (ItemStack)value;
/* 14 */       if ("item.myst.agebook".equals(stack.func_77977_a()) && stack.func_77942_o()) {
/* 15 */         NBTTagCompound tag = stack.func_77978_p();
/* 16 */         if (tag.func_74764_b("Dimension")) output.put("dimensionId", Integer.valueOf(tag.func_74762_e("Dimension"))); 
/* 17 */         if (tag.func_74764_b("DisplayName")) output.put("dimensionName", tag.func_74779_i("DisplayName"));
/*    */         
/* 19 */         if (tag.func_74764_b("Flags")) {
/* 20 */           HashMap<String, Boolean> flags = new HashMap<>();
/* 21 */           output.put("flags", flags);
/*    */           
/* 23 */           NBTTagCompound flagsNbt = tag.func_74775_l("Flags");
/* 24 */           for (Object flag : flagsNbt.func_150296_c()) {
/* 25 */             String key = (String)flag;
/* 26 */             flags.put(key, Boolean.valueOf(flagsNbt.func_74767_n(key)));
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mystcraft\ConverterAgebook.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */