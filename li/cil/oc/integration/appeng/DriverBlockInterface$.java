/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.tile.misc.TileInterface;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverBlockInterface$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverBlockInterface$ MODULE$;
/*    */   
/*    */   private DriverBlockInterface$() {
/* 22 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 23 */     return TileInterface.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 26 */     return (ManagedEnvironment)new DriverBlockInterface.Environment((TileInterface)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\DriverBlockInterface$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */