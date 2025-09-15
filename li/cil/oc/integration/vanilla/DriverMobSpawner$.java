/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.tileentity.TileEntityMobSpawner;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverMobSpawner$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverMobSpawner$ MODULE$;
/*    */   
/*    */   private DriverMobSpawner$() {
/* 19 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 20 */     return TileEntityMobSpawner.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 23 */     return (ManagedEnvironment)new DriverMobSpawner.Environment((TileEntityMobSpawner)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverMobSpawner$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */