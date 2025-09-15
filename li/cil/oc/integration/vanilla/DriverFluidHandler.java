/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import net.minecraftforge.fluids.IFluidHandler;
/*    */ 
/*    */ public final class DriverFluidHandler
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IFluidHandler.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IFluidHandler)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IFluidHandler> {
/*    */     public Environment(IFluidHandler tileEntity) {
/* 27 */       super(tileEntity, "fluid_handler");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function([side:number=6]):table -- Get some information about the tank accessible from the specified side.")
/*    */     public Object[] getTankInfo(Context context, Arguments args) {
/* 35 */       ForgeDirection side = (args.count() > 0) ? ForgeDirection.getOrientation(args.checkInteger(0)) : ForgeDirection.UNKNOWN;
/* 36 */       return (Object[])((IFluidHandler)this.tileEntity).getTankInfo(side);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverFluidHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */