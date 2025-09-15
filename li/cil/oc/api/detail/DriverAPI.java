package li.cil.oc.api.detail;

import java.util.Collection;
import java.util.Set;
import li.cil.oc.api.driver.Block;
import li.cil.oc.api.driver.Converter;
import li.cil.oc.api.driver.EnvironmentProvider;
import li.cil.oc.api.driver.InventoryProvider;
import li.cil.oc.api.driver.Item;
import li.cil.oc.api.driver.SidedBlock;
import li.cil.oc.api.network.EnvironmentHost;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public interface DriverAPI {
  @Deprecated
  void add(Block paramBlock);
  
  void add(SidedBlock paramSidedBlock);
  
  void add(Item paramItem);
  
  void add(Converter paramConverter);
  
  void add(EnvironmentProvider paramEnvironmentProvider);
  
  void add(InventoryProvider paramInventoryProvider);
  
  @Deprecated
  Block driverFor(World paramWorld, int paramInt1, int paramInt2, int paramInt3);
  
  SidedBlock driverFor(World paramWorld, int paramInt1, int paramInt2, int paramInt3, ForgeDirection paramForgeDirection);
  
  Item driverFor(ItemStack paramItemStack, Class<? extends EnvironmentHost> paramClass);
  
  Item driverFor(ItemStack paramItemStack);
  
  @Deprecated
  Class<?> environmentFor(ItemStack paramItemStack);
  
  Set<Class<?>> environmentsFor(ItemStack paramItemStack);
  
  IInventory inventoryFor(ItemStack paramItemStack, EntityPlayer paramEntityPlayer);
  
  Collection<Block> blockDrivers();
  
  Collection<Item> itemDrivers();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\DriverAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */