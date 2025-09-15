/*     */ package li.cil.oc.api;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
/*     */ import li.cil.oc.api.driver.Block;
/*     */ import li.cil.oc.api.driver.Converter;
/*     */ import li.cil.oc.api.driver.EnvironmentProvider;
/*     */ import li.cil.oc.api.driver.InventoryProvider;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.driver.SidedBlock;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Driver
/*     */ {
/*     */   @Deprecated
/*     */   public static void add(Block driver) {
/*  51 */     if (API.driver != null) API.driver.add(driver);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void add(SidedBlock driver) {
/*  67 */     if (API.driver != null) API.driver.add(driver);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void add(Item driver) {
/*  82 */     if (API.driver != null) API.driver.add(driver);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void add(Converter converter) {
/*  97 */     if (API.driver != null) API.driver.add(converter);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void add(EnvironmentProvider provider) {
/* 111 */     if (API.driver != null) API.driver.add(provider);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void add(InventoryProvider provider) {
/* 123 */     if (API.driver != null) API.driver.add(provider);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static Block driverFor(World world, int x, int y, int z) {
/* 145 */     if (API.driver != null) return API.driver.driverFor(world, x, y, z); 
/* 146 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static SidedBlock driverFor(World world, int x, int y, int z, ForgeDirection side) {
/* 165 */     if (API.driver != null) return API.driver.driverFor(world, x, y, z, side); 
/* 166 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Item driverFor(ItemStack stack, Class<? extends EnvironmentHost> host) {
/* 181 */     if (API.driver != null) return API.driver.driverFor(stack, host); 
/* 182 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Item driverFor(ItemStack stack) {
/* 199 */     if (API.driver != null) return API.driver.driverFor(stack); 
/* 200 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static Class<?> environmentFor(ItemStack stack) {
/* 216 */     if (API.driver != null) return API.driver.environmentFor(stack); 
/* 217 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Set<Class<?>> environmentsFor(ItemStack stack) {
/* 231 */     if (API.driver != null) return API.driver.environmentsFor(stack); 
/* 232 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static IInventory inventoryFor(ItemStack stack, EntityPlayer player) {
/* 250 */     if (API.driver != null) return API.driver.inventoryFor(stack, player); 
/* 251 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Collection<Block> blockDrivers() {
/* 265 */     if (API.driver != null) return API.driver.blockDrivers(); 
/* 266 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Collection<Item> itemDrivers() {
/* 280 */     if (API.driver != null) return API.driver.itemDrivers(); 
/* 281 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\Driver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */