/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.tileentity.TileEntityBrewingStand;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverBrewingStand$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverBrewingStand$ MODULE$;
/*    */   
/*    */   private DriverBrewingStand$() {
/* 18 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 19 */     return TileEntityBrewingStand.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new DriverBrewingStand.Environment((TileEntityBrewingStand)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverBrewingStand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */