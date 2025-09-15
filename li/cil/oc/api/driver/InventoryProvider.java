package li.cil.oc.api.driver;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public interface InventoryProvider {
  boolean worksWith(ItemStack paramItemStack, EntityPlayer paramEntityPlayer);
  
  IInventory getInventory(ItemStack paramItemStack, EntityPlayer paramEntityPlayer);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\driver\InventoryProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */