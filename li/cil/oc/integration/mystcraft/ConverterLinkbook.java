/*    */ package li.cil.oc.integration.mystcraft;
/*    */ 
/*    */ import com.google.common.hash.Hashing;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ public class ConverterLinkbook
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 12 */     if (value instanceof ItemStack) {
/* 13 */       ItemStack stack = (ItemStack)value;
/* 14 */       if ("item.myst.linkbook".equals(stack.func_77977_a()) && stack.func_77942_o()) {
/* 15 */         NBTTagCompound tag = stack.func_77978_p();
/* 16 */         if (tag.func_74764_b("Dimension")) output.put("dimensionId", Integer.valueOf(tag.func_74762_e("Dimension"))); 
/* 17 */         if (tag.func_74764_b("DisplayName")) output.put("dimensionName", tag.func_74779_i("DisplayName"));
/*    */         
/* 19 */         if (tag.func_74764_b("SpawnX") && tag.func_74764_b("SpawnY") && tag.func_74764_b("SpawnZ"))
/* 20 */           output.put("spawnId", 
/*    */               
/* 22 */               Integer.valueOf(Hashing.murmur3_32()
/* 23 */                 .newHasher()
/* 24 */                 .putInt(tag.func_74762_e("SpawnX"))
/* 25 */                 .putInt(tag.func_74762_e("SpawnY"))
/* 26 */                 .putInt(tag.func_74762_e("SpawnZ"))
/* 27 */                 .hash()
/* 28 */                 .asInt())); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mystcraft\ConverterLinkbook.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */