/*    */ package li.cil.oc.integration.rotarycraft;
/*    */ 
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ public class ConverterPumpItem implements Converter {
/* 11 */   final Item Pump = GameRegistry.findItem("RotaryCraft", "rotarycraft_item_pump");
/*    */ 
/*    */   
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 15 */     if (value instanceof ItemStack) {
/* 16 */       ItemStack stack = (ItemStack)value;
/* 17 */       Item item = stack.func_77973_b();
/* 18 */       if (item != null && item == this.Pump) {
/* 19 */         NBTTagCompound tag = stack.func_77978_p();
/*    */         
/* 21 */         if (tag != null && tag.func_74764_b("liquid")) {
/* 22 */           output.put("liquid", stack.field_77990_d.func_74779_i("liquid"));
/*    */         } else {
/* 24 */           output.put("liquid", "empty");
/*    */         } 
/*    */         
/* 27 */         if (tag != null && tag.func_74764_b("lvl")) {
/* 28 */           output.put("fluidAmount", Integer.valueOf(stack.field_77990_d.func_74762_e("lvl")));
/*    */         } else {
/* 30 */           output.put("fluidAmount", Integer.valueOf(0));
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\rotarycraft\ConverterPumpItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */