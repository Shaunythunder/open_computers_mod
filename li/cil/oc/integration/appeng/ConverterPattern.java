/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.util.Platform;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.nbt.NBTTagList;
/*    */ 
/*    */ 
/*    */ public final class ConverterPattern
/*    */   implements Converter
/*    */ {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 16 */     if (value instanceof ItemStack) {
/* 17 */       ItemStack is = (ItemStack)value;
/*    */       try {
/* 19 */         NBTTagCompound encodedValue = is.func_77978_p();
/* 20 */         if (encodedValue != null) {
/* 21 */           NBTTagList inTag = encodedValue.func_150295_c("in", 10);
/* 22 */           NBTTagList outTag = encodedValue.func_150295_c("out", 10);
/*    */           
/* 24 */           Map[] inputs = new Map[inTag.func_74745_c()];
/* 25 */           for (int i = 0; i < inTag.func_74745_c(); i++) {
/* 26 */             inputs[i] = new HashMap<>();
/* 27 */             NBTTagCompound tag = inTag.func_150305_b(i);
/* 28 */             ItemStack inputItem = Platform.loadItemStackFromNBT(tag);
/* 29 */             if (inputItem != null) {
/* 30 */               inputs[i].put("name", inputItem.func_77973_b().func_77653_i(inputItem));
/* 31 */               if (tag.func_74763_f("Cnt") > 0L) {
/* 32 */                 inputs[i].put("count", Long.valueOf(tag.func_74763_f("Cnt")));
/*    */               } else {
/* 34 */                 inputs[i].put("count", Integer.valueOf(inputItem.field_77994_a));
/*    */               } 
/*    */             } 
/*    */           } 
/*    */           
/* 39 */           Map[] results = new Map[outTag.func_74745_c()];
/* 40 */           for (int j = 0; j < outTag.func_74745_c(); j++) {
/* 41 */             results[j] = new HashMap<>();
/* 42 */             NBTTagCompound tag = outTag.func_150305_b(j);
/* 43 */             ItemStack outputItem = Platform.loadItemStackFromNBT(tag);
/* 44 */             if (outputItem != null) {
/* 45 */               results[j].put("name", outputItem.func_77973_b().func_77653_i(outputItem));
/* 46 */               if (tag.func_74763_f("Cnt") > 0L) {
/* 47 */                 results[j].put("count", Long.valueOf(tag.func_74763_f("Cnt")));
/*    */               } else {
/* 49 */                 results[j].put("count", Integer.valueOf(outputItem.field_77994_a));
/*    */               } 
/*    */             } 
/*    */           } 
/* 53 */           output.put("inputs", inputs);
/* 54 */           output.put("outputs", results);
/* 55 */           output.put("isCraftable", Boolean.valueOf(encodedValue.func_74767_n("crafting")));
/*    */         } 
/* 57 */       } catch (Throwable throwable) {}
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\ConverterPattern.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */