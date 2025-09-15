package li.cil.oc.api.internal;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import li.cil.oc.api.network.Environment;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.inventory.ISidedInventory;
import net.minecraftforge.fluids.IFluidHandler;

public interface Robot extends Agent, Environment, EnvironmentHost, Tiered, ISidedInventory, IFluidHandler {
  int componentCount();
  
  Environment getComponentInSlot(int paramInt);
  
  void synchronizeSlot(int paramInt);
  
  @SideOnly(Side.CLIENT)
  boolean shouldAnimate();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Robot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */