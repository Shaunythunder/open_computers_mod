/*    */ package li.cil.oc.integration.cofh.energy;
/*    */ 
/*    */ import cofh.api.energy.IEnergyProvider;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnergyProvider
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public Class<?> getTileEntityClass() {
/* 17 */     return IEnergyProvider.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 23 */     return (ManagedEnvironment)new Environment((IEnergyProvider)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IEnergyProvider> {
/*    */     public Environment(IEnergyProvider tileEntity) {
/* 28 */       super(tileEntity, "energy_handler");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function([direction:number=6]):number -- Returns the amount of stored energy for the given side.")
/*    */     public Object[] getEnergyStored(Context context, Arguments args) {
/* 36 */       ForgeDirection side = (args.count() > 0) ? ForgeDirection.getOrientation(args.checkInteger(0)) : ForgeDirection.UNKNOWN;
/* 37 */       return new Object[] { Integer.valueOf(((IEnergyProvider)this.tileEntity).getEnergyStored(side)) };
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function([direction:number=6]):number -- Returns the maximum amount of stored energy for the given side.")
/*    */     public Object[] getMaxEnergyStored(Context context, Arguments args) {
/* 45 */       ForgeDirection side = (args.count() > 0) ? ForgeDirection.getOrientation(args.checkInteger(0)) : ForgeDirection.UNKNOWN;
/* 46 */       return new Object[] { Integer.valueOf(((IEnergyProvider)this.tileEntity).getMaxEnergyStored(side)) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Returns whether this component can provide energy.")
/*    */     public Object[] isEnergyProvider(Context context, Arguments args) {
/* 51 */       return new Object[] { Boolean.valueOf(true) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Returns whether this component can receive energy.")
/*    */     public Object[] isEnergyReceiver(Context context, Arguments args) {
/* 56 */       return new Object[] { Boolean.valueOf(this.tileEntity instanceof cofh.api.energy.IEnergyReceiver) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\DriverEnergyProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */