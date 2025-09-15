package li.cil.oc.api.manual;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface PathProvider {
  String pathFor(ItemStack paramItemStack);
  
  String pathFor(World paramWorld, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\manual\PathProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */