/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.tileentity.TileEntityBeacon;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverBeacon$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverBeacon$ MODULE$;
/*    */   
/*    */   private DriverBeacon$() {
/* 20 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 21 */     return TileEntityBeacon.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 24 */     return (ManagedEnvironment)new DriverBeacon.Environment((TileEntityBeacon)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverBeacon$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */