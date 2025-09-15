package li.cil.oc.common.asm.template;

import li.cil.oc.api.network.Environment;
import li.cil.oc.api.network.SimpleComponent;
import net.minecraft.nbt.NBTTagCompound;

public interface SimpleComponentImpl extends Environment, SimpleComponent {
  public static final String PostFix = "_OpenComputers";
  
  void validate_OpenComputers();
  
  void invalidate_OpenComputers();
  
  void onChunkUnload_OpenComputers();
  
  void readFromNBT_OpenComputers(NBTTagCompound paramNBTTagCompound);
  
  void writeToNBT_OpenComputers(NBTTagCompound paramNBTTagCompound);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\asm\template\SimpleComponentImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */