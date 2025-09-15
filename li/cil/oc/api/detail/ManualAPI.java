package li.cil.oc.api.detail;

import li.cil.oc.api.manual.ContentProvider;
import li.cil.oc.api.manual.ImageProvider;
import li.cil.oc.api.manual.ImageRenderer;
import li.cil.oc.api.manual.PathProvider;
import li.cil.oc.api.manual.TabIconRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface ManualAPI {
  void addTab(TabIconRenderer paramTabIconRenderer, String paramString1, String paramString2);
  
  void addProvider(PathProvider paramPathProvider);
  
  void addProvider(ContentProvider paramContentProvider);
  
  void addProvider(String paramString, ImageProvider paramImageProvider);
  
  String pathFor(ItemStack paramItemStack);
  
  String pathFor(World paramWorld, int paramInt1, int paramInt2, int paramInt3);
  
  Iterable<String> contentFor(String paramString);
  
  ImageRenderer imageFor(String paramString);
  
  void openFor(EntityPlayer paramEntityPlayer);
  
  void reset();
  
  void navigate(String paramString);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\ManualAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */