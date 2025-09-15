/*    */ package li.cil.oc.integration.cofh.tileentity;
/*    */ 
/*    */ import cofh.api.tileentity.IEnergyInfo;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnergyInfo
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IEnergyInfo.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IEnergyInfo)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IEnergyInfo> {
/*    */     public Environment(IEnergyInfo tileEntity) {
/* 27 */       super(tileEntity, "energy_info");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the amount of stored energy.")
/*    */     public Object[] getEnergy(Context context, Arguments args) {
/* 32 */       return new Object[] { Integer.valueOf(((IEnergyInfo)this.tileEntity).getInfoEnergyStored()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the energy per tick.")
/*    */     public Object[] getEnergyPerTick(Context context, Arguments args) {
/* 37 */       return new Object[] { Integer.valueOf(((IEnergyInfo)this.tileEntity).getInfoEnergyPerTick()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the maximum energy.")
/*    */     public Object[] getMaxEnergy(Context context, Arguments args) {
/* 42 */       return new Object[] { Integer.valueOf(((IEnergyInfo)this.tileEntity).getInfoMaxEnergyStored()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the maximum energy per tick.")
/*    */     public Object[] getMaxEnergyPerTick(Context context, Arguments args) {
/* 47 */       return new Object[] { Integer.valueOf(((IEnergyInfo)this.tileEntity).getInfoMaxEnergyPerTick()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\tileentity\DriverEnergyInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */