/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.tileentity.TileEntityFurnace;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverFurnace$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverFurnace$ MODULE$;
/*    */   
/*    */   private DriverFurnace$() {
/* 19 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 20 */     return TileEntityFurnace.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 23 */     return (ManagedEnvironment)new DriverFurnace.Environment((TileEntityFurnace)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverFurnace$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */