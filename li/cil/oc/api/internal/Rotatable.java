package li.cil.oc.api.internal;

import net.minecraftforge.common.util.ForgeDirection;

public interface Rotatable {
  ForgeDirection facing();
  
  ForgeDirection toGlobal(ForgeDirection paramForgeDirection);
  
  ForgeDirection toLocal(ForgeDirection paramForgeDirection);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Rotatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */