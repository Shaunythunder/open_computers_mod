package li.cil.oc.api.driver.item;

import java.util.Collection;
import li.cil.oc.api.machine.Architecture;
import net.minecraft.item.ItemStack;

public interface MutableProcessor extends Processor {
  Collection<Class<? extends Architecture>> allArchitectures();
  
  void setArchitecture(ItemStack paramItemStack, Class<? extends Architecture> paramClass);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\driver\item\MutableProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */