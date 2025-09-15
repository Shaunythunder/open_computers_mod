package li.cil.oc.api.nanomachines;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public interface BehaviorProvider {
  Iterable<Behavior> createBehaviors(EntityPlayer paramEntityPlayer);
  
  NBTTagCompound writeToNBT(Behavior paramBehavior);
  
  Behavior readFromNBT(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\nanomachines\BehaviorProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */