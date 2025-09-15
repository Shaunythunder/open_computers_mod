package li.cil.oc.api.driver.item;

import net.minecraft.item.ItemStack;

public interface Chargeable {
  boolean canCharge(ItemStack paramItemStack);
  
  double charge(ItemStack paramItemStack, double paramDouble, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\driver\item\Chargeable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */