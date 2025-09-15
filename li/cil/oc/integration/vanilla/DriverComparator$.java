/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.tileentity.TileEntityComparator;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverComparator$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverComparator$ MODULE$;
/*    */   
/*    */   private DriverComparator$() {
/* 18 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 19 */     return TileEntityComparator.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new DriverComparator.Environment((TileEntityComparator)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverComparator$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */