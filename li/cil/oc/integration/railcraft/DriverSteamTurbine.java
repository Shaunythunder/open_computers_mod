/*    */ package li.cil.oc.integration.railcraft;
/*    */ 
/*    */ import li.cil.oc.api.driver.NamedBlock;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import mods.railcraft.common.blocks.machine.alpha.TileSteamTurbine;
/*    */ import mods.railcraft.common.util.inventory.StandaloneInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverSteamTurbine
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 19 */     return TileSteamTurbine.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 25 */     return (ManagedEnvironment)new Environment((TileSteamTurbine)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileSteamTurbine> implements NamedBlock {
/*    */     public Environment(TileSteamTurbine tileEntity) {
/* 30 */       super(tileEntity, "steam_turbine");
/*    */     }
/*    */ 
/*    */     
/*    */     public String preferredName() {
/* 35 */       return "steam_turbine";
/*    */     }
/*    */ 
/*    */     
/*    */     public int priority() {
/* 40 */       return 0;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the output of the steam turbine")
/*    */     public Object[] getTurbineOutput(Context context, Arguments args) {
/* 45 */       return new Object[] { Float.valueOf(((TileSteamTurbine)this.tileEntity).getOutput()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Returns the durability of the rotor in percent.")
/*    */     public Object[] getTurbineRotorStatus(Context context, Arguments args) {
/* 50 */       StandaloneInventory standaloneInventory = ((TileSteamTurbine)this.tileEntity).getInventory();
/* 51 */       if (standaloneInventory != null && standaloneInventory.func_70302_i_() > 0) {
/* 52 */         ItemStack itemStack = standaloneInventory.func_70301_a(0);
/* 53 */         if (itemStack != null) {
/* 54 */           return new Object[] { Integer.valueOf(100 - (int)(itemStack.func_77960_j() * 100.0D / itemStack.func_77958_k())) };
/*    */         }
/*    */       } 
/* 57 */       return new Object[] { Integer.valueOf(0) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\railcraft\DriverSteamTurbine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */