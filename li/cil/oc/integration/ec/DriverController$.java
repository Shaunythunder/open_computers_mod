/*    */ package li.cil.oc.integration.ec;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverController$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverController$ MODULE$;
/*    */   
/*    */   private DriverController$() {
/* 17 */     MODULE$ = this;
/*    */   }
/*    */   public Class<?> getTileEntityClass() {
/* 20 */     return li.cil.oc.integration.appeng.AEUtil$.MODULE$.controllerClass();
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 23 */     return (ManagedEnvironment)new DriverController.Environment(world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ec\DriverController$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */