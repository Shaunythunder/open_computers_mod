/*    */ package li.cil.oc.integration.ic2;
/*    */ 
/*    */ import ic2.core.block.machine.tileentity.TileEntityTeleporter;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public class DriverTeleporter
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return TileEntityTeleporter.class;
/*    */   }
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 21 */     return (ManagedEnvironment)new Environment((TileEntityTeleporter)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityTeleporter> {
/*    */     public Environment(TileEntityTeleporter tileEntity) {
/* 26 */       super(tileEntity, "ic2_teleporter");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(X:number, Y:number, Z:number)")
/*    */     public Object[] setCoords(Context context, Arguments args) {
/* 31 */       if (args.isInteger(0) && args.isInteger(1) && args.isInteger(2)) {
/* 32 */         ((TileEntityTeleporter)this.tileEntity).setTarget(args.checkInteger(0), args.checkInteger(1), args.checkInteger(2));
/*    */       }
/* 34 */       return new Object[0];
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\DriverTeleporter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */