package li.cil.oc.api.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.common.util.ForgeDirection;

public interface SidedEnvironment {
  Node sidedNode(ForgeDirection paramForgeDirection);
  
  @SideOnly(Side.CLIENT)
  boolean canConnect(ForgeDirection paramForgeDirection);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\network\SidedEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */