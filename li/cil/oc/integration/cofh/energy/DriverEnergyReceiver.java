/*    */ package li.cil.oc.integration.cofh.energy;
/*    */ 
/*    */ import cofh.api.energy.IEnergyReceiver;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnergyReceiver
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public Class<?> getTileEntityClass() {
/* 17 */     return IEnergyReceiver.class;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean worksWith(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (super.worksWith(world, x, y, z, side) && !(world.func_147438_o(x, y, z) instanceof cofh.api.energy.IEnergyProvider));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 28 */     return (ManagedEnvironment)new Environment((IEnergyReceiver)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IEnergyReceiver> {
/*    */     public Environment(IEnergyReceiver tileEntity) {
/* 33 */       super(tileEntity, "energy_handler");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function([direction:number=6]):number -- Returns the amount of stored energy for the given side.")
/*    */     public Object[] getEnergyStored(Context context, Arguments args) {
/* 41 */       ForgeDirection side = (args.count() > 0) ? ForgeDirection.getOrientation(args.checkInteger(0)) : ForgeDirection.UNKNOWN;
/* 42 */       return new Object[] { Integer.valueOf(((IEnergyReceiver)this.tileEntity).getEnergyStored(side)) };
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function([direction:number=6]):number -- Returns the maximum amount of stored energy for the given side.")
/*    */     public Object[] getMaxEnergyStored(Context context, Arguments args) {
/* 50 */       ForgeDirection side = (args.count() > 0) ? ForgeDirection.getOrientation(args.checkInteger(0)) : ForgeDirection.UNKNOWN;
/* 51 */       return new Object[] { Integer.valueOf(((IEnergyReceiver)this.tileEntity).getMaxEnergyStored(side)) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Returns whether this component can provide energy.")
/*    */     public Object[] isEnergyProvider(Context context, Arguments args) {
/* 56 */       return new Object[] { Boolean.valueOf(false) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Returns whether this component can receive energy.")
/*    */     public Object[] isEnergyReceiver(Context context, Arguments args) {
/* 61 */       return new Object[] { Boolean.valueOf(true) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\DriverEnergyReceiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */