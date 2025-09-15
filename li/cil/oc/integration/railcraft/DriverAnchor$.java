/*    */ package li.cil.oc.integration.railcraft;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import mods.railcraft.common.blocks.machine.alpha.TileAnchorWorld;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ public final class DriverAnchor$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverAnchor$ MODULE$;
/*    */   
/*    */   private DriverAnchor$() {
/* 16 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 17 */     return TileAnchorWorld.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 20 */     return (ManagedEnvironment)new DriverAnchor.Environment((TileAnchorWorld)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\railcraft\DriverAnchor$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */