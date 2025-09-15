/*    */ package li.cil.oc.integration.bloodmagic;
/*    */ 
/*    */ import WayofTime.alchemicalWizardry.api.items.interfaces.IBloodOrb;
/*    */ import WayofTime.alchemicalWizardry.api.soulNetwork.SoulNetworkHandler;
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public class ConverterBloodOrb
/*    */   implements Converter {
/*    */   public void convert(Object value, Map<Object, Object> output) {
/* 13 */     if (value instanceof ItemStack) {
/* 14 */       ItemStack stack = (ItemStack)value;
/* 15 */       Item item = stack.func_77973_b();
/* 16 */       if (item instanceof IBloodOrb && stack.field_77990_d != null) {
/* 17 */         IBloodOrb bloodOrb = (IBloodOrb)item;
/* 18 */         String ownerName = stack.field_77990_d.func_74779_i("ownerName");
/* 19 */         int maxOrbTier = SoulNetworkHandler.getCurrentMaxOrb(ownerName);
/* 20 */         output.put("ownerName", ownerName);
/* 21 */         output.put("networkOrbTier", Integer.valueOf(maxOrbTier));
/* 22 */         output.put("networkEssence", Integer.valueOf(SoulNetworkHandler.getCurrentEssence(ownerName)));
/* 23 */         output.put("maxNetworkEssence", Integer.valueOf(SoulNetworkHandler.getMaximumForOrbTier(maxOrbTier)));
/* 24 */         output.put("maxEssence", Integer.valueOf(bloodOrb.getMaxEssence()));
/* 25 */         output.put("orbTier", Integer.valueOf(bloodOrb.getOrbLevel()));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\bloodmagic\ConverterBloodOrb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */