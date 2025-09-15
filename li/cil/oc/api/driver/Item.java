package li.cil.oc.api.driver;

import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface Item {
  boolean worksWith(ItemStack paramItemStack);
  
  ManagedEnvironment createEnvironment(ItemStack paramItemStack, EnvironmentHost paramEnvironmentHost);
  
  String slot(ItemStack paramItemStack);
  
  int tier(ItemStack paramItemStack);
  
  NBTTagCompound dataTag(ItemStack paramItemStack);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\driver\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */