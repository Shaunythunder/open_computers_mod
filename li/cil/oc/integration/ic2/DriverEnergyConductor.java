/*    */ package li.cil.oc.integration.ic2;
/*    */ 
/*    */ import ic2.api.energy.tile.IEnergyConductor;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnergyConductor
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IEnergyConductor.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IEnergyConductor)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IEnergyConductor> {
/*    */     public Environment(IEnergyConductor tileEntity) {
/* 27 */       super(tileEntity, "energy_conductor");
/*    */     }
/*    */     
/*    */     @Callback
/*    */     public Object[] getConductionLoss(Context context, Arguments args) {
/* 32 */       return new Object[] { Double.valueOf(((IEnergyConductor)this.tileEntity).getConductionLoss()) };
/*    */     }
/*    */     
/*    */     @Callback
/*    */     public Object[] getConductorBreakdownEnergy(Context context, Arguments args) {
/* 37 */       return new Object[] { Double.valueOf(((IEnergyConductor)this.tileEntity).getConductorBreakdownEnergy()) };
/*    */     }
/*    */     
/*    */     @Callback
/*    */     public Object[] getInsulationBreakdownEnergy(Context context, Arguments args) {
/* 42 */       return new Object[] { Double.valueOf(((IEnergyConductor)this.tileEntity).getInsulationBreakdownEnergy()) };
/*    */     }
/*    */     
/*    */     @Callback
/*    */     public Object[] getInsulationEnergyAbsorption(Context context, Arguments args) {
/* 47 */       return new Object[] { Double.valueOf(((IEnergyConductor)this.tileEntity).getInsulationEnergyAbsorption()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\DriverEnergyConductor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */