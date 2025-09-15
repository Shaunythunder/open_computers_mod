package li.cil.oc.api.detail;

import java.util.concurrent.Callable;
import li.cil.oc.api.fs.FileSystem;
import net.minecraft.item.ItemStack;

public interface ItemAPI {
  ItemInfo get(String paramString);
  
  ItemInfo get(ItemStack paramItemStack);
  
  @Deprecated
  ItemStack registerFloppy(String paramString, int paramInt, Callable<FileSystem> paramCallable);
  
  ItemStack registerFloppy(String paramString, int paramInt, Callable<FileSystem> paramCallable, boolean paramBoolean);
  
  ItemStack registerEEPROM(String paramString, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\ItemAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */