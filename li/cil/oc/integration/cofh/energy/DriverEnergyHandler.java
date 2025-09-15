/*    */ package li.cil.oc.integration.cofh.energy;
/*    */ 
/*    */ import cofh.api.energy.IEnergyHandler;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnergyHandler
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IEnergyHandler.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IEnergyHandler)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IEnergyHandler> {
/*    */     public Environment(IEnergyHandler tileEntity) {
/* 27 */       super(tileEntity, "energy_handler");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function([direction:number=6]):number --  Returns the amount of stored energy for the given side.")
/*    */     public Object[] getEnergyStored(Context context, Arguments args) {
/* 35 */       ForgeDirection side = (args.count() > 0) ? ForgeDirection.getOrientation(args.checkInteger(0)) : ForgeDirection.UNKNOWN;
/* 36 */       return new Object[] { Integer.valueOf(((IEnergyHandler)this.tileEntity).getEnergyStored(side)) };
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function([direction:number=6]):number --  Returns the maximum amount of stored energy for the given side.")
/*    */     public Object[] getMaxEnergyStored(Context context, Arguments args) {
/* 44 */       ForgeDirection side = (args.count() > 0) ? ForgeDirection.getOrientation(args.checkInteger(0)) : ForgeDirection.UNKNOWN;
/* 45 */       return new Object[] { Integer.valueOf(((IEnergyHandler)this.tileEntity).getMaxEnergyStored(side)) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\DriverEnergyHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */