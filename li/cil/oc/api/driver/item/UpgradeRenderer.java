package li.cil.oc.api.driver.item;

import java.util.Set;
import li.cil.oc.api.event.RobotRenderEvent;
import li.cil.oc.api.internal.Robot;
import net.minecraft.item.ItemStack;

public interface UpgradeRenderer {
  String computePreferredMountPoint(ItemStack paramItemStack, Robot paramRobot, Set<String> paramSet);
  
  void render(ItemStack paramItemStack, RobotRenderEvent.MountPoint paramMountPoint, Robot paramRobot, float paramFloat);
  
  public static final class MountPointName {
    public static final String None = "none";
    
    public static final String Any = "any";
    
    public static final String TopLeft = "top_left";
    
    public static final String TopRight = "top_right";
    
    public static final String TopBack = "top_back";
    
    public static final String BottomLeft = "bottom_left";
    
    public static final String BottomRight = "bottom_right";
    
    public static final String BottomBack = "bottom_back";
    
    public static final String BottomFront = "bottom_front";
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\driver\item\UpgradeRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */