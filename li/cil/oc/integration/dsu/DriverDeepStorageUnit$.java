/*    */ package li.cil.oc.integration.dsu;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import powercrystals.minefactoryreloaded.api.IDeepStorageUnit;
/*    */ 
/*    */ public final class DriverDeepStorageUnit$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverDeepStorageUnit$ MODULE$;
/*    */   
/*    */   private DriverDeepStorageUnit$() {
/* 15 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 16 */     return IDeepStorageUnit.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 19 */     return (ManagedEnvironment)new DriverDeepStorageUnit.Environment((IDeepStorageUnit)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\dsu\DriverDeepStorageUnit$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */