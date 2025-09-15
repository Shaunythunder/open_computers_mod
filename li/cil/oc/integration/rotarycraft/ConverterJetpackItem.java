/*    */ package li.cil.oc.integration.rotarycraft;
/*    */ 
/*    */ import cpw.mods.fml.common.registry.GameRegistry;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ public class ConverterJetpackItem implements Converter {
/* 12 */   final Item BedrockJetPack = GameRegistry.findItem("RotaryCraft", "rotarycraft_item_bedpack");
/* 13 */   final Item SteelJetPack = GameRegistry.findItem("RotaryCraft", "rotarycraft_item_steelpack");
/* 14 */   final Item JetPack = GameRegistry.findItem("RotaryCraft", "rotarycraft_item_jetpack");
/*    */ 
/*    */   
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 18 */     if (value instanceof ItemStack) {
/* 19 */       ItemStack stack = (ItemStack)value;
/* 20 */       Item item = stack.func_77973_b();
/* 21 */       if ((item != null && item == this.BedrockJetPack) || item == this.SteelJetPack || item == this.JetPack) {
/* 22 */         NBTTagCompound tag = stack.func_77978_p();
/*    */         
/* 24 */         if (tag != null && tag.func_74764_b("fuel")) {
/* 25 */           output.put("fuel", Integer.valueOf(stack.field_77990_d.func_74762_e("fuel")));
/*    */         } else {
/* 27 */           output.put("fuel", Integer.valueOf(0));
/*    */         } 
/*    */         
/* 30 */         if (tag != null && tag.func_74764_b("liquid")) {
/* 31 */           output.put("fuelType", tag.func_74779_i("liquid"));
/*    */         } else {
/* 33 */           output.put("fuelType", "empty");
/*    */         } 
/*    */         
/* 36 */         if (item == this.BedrockJetPack) {
/* 37 */           output.put("chestplateMaterial", "bedrock");
/* 38 */         } else if (item == this.SteelJetPack) {
/* 39 */           output.put("chestplateMaterial", "steel");
/*    */         } else {
/* 41 */           output.put("chestplateMaterial", "none");
/*    */         } 
/*    */         
/* 44 */         HashMap<String, Boolean> upgrades = new HashMap<>();
/* 45 */         upgrades.put("cooling", Boolean.valueOf((tag != null && tag.func_74767_n("cooling"))));
/* 46 */         upgrades.put("thrustBoost", Boolean.valueOf((tag != null && tag.func_74767_n("jet"))));
/* 47 */         upgrades.put("winged", Boolean.valueOf((tag != null && tag.func_74767_n("wing"))));
/* 48 */         output.put("upgrades", upgrades);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\rotarycraft\ConverterJetpackItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */