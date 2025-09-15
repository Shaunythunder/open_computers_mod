package li.cil.oc.api.driver;

import li.cil.oc.api.network.ManagedEnvironment;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public interface SidedBlock {
  boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection);
  
  ManagedEnvironment createEnvironment(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\driver\SidedBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */