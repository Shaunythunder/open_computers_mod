package li.cil.oc.api.internal;

import java.util.UUID;
import li.cil.oc.api.machine.MachineHost;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;

public interface Agent extends MachineHost, Rotatable {
  IInventory equipmentInventory();
  
  IInventory mainInventory();
  
  MultiTank tank();
  
  int selectedSlot();
  
  void setSelectedSlot(int paramInt);
  
  int selectedTank();
  
  void setSelectedTank(int paramInt);
  
  EntityPlayer player();
  
  String name();
  
  void setName(String paramString);
  
  String ownerName();
  
  UUID ownerUUID();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\Agent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */