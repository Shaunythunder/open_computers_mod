package li.cil.oc.api.internal;

import net.minecraft.item.ItemStack;

public interface Database {
  int size();
  
  ItemStack getStackInSlot(int paramInt);
  
  void setStackInSlot(int paramInt, ItemStack paramItemStack);
  
  int findStackWithHash(String paramString);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Database.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */