/*    */ package li.cil.oc.integration.gregtech;
/*    */ 
/*    */ import gregtech.api.interfaces.tileentity.IBasicEnergyContainer;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnergyContainer
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IBasicEnergyContainer.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IBasicEnergyContainer)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IBasicEnergyContainer> {
/*    */     public Environment(IBasicEnergyContainer tileEntity) {
/* 27 */       super(tileEntity, "gt_energyContainer");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the amount of electricity contained in this Block, in EU units!")
/*    */     public Object[] getStoredEU(Context context, Arguments args) {
/* 32 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getStoredEU()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string --  Returns the amount of electricity contained in this Block, in EU units! (As a string for HUGE amounts.)")
/*    */     public Object[] getStoredEUString(Context context, Arguments args) {
/* 37 */       return new Object[] { Long.toUnsignedString(((IBasicEnergyContainer)this.tileEntity).getStoredEU()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the amount of electricity containable in this Block, in EU units!")
/*    */     public Object[] getEUCapacity(Context context, Arguments args) {
/* 42 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getEUCapacity()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the amount of electricity containable in this Block, in EU units! (As a string for HUGE amounts.)")
/*    */     public Object[] getEUCapacityString(Context context, Arguments args) {
/* 47 */       return new Object[] { Long.toUnsignedString(((IBasicEnergyContainer)this.tileEntity).getEUCapacity()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the amount of Steam containable in this Block, in EU units!")
/*    */     public Object[] getSteamCapacity(Context context, Arguments args) {
/* 52 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getSteamCapacity()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the amount of Steam contained in this Block, in EU units!")
/*    */     public Object[] getStoredSteam(Context context, Arguments args) {
/* 57 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getStoredSteam()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Gets the Output in EU/p.")
/*    */     public Object[] getOutputVoltage(Context context, Arguments args) {
/* 62 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getOutputVoltage()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Gets the amount of Energy Packets per tick.")
/*    */     public Object[] getOutputAmperage(Context context, Arguments args) {
/* 67 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getOutputAmperage()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Gets the maximum Input in EU/p.")
/*    */     public Object[] getInputVoltage(Context context, Arguments args) {
/* 72 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getInputVoltage()) };
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function():number -- Returns the amount of Electricity, accepted by this Block the last 5 ticks as Average.")
/*    */     public Object[] getAverageElectricInput(Context context, Arguments args) {
/* 79 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getAverageElectricInput()) };
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function():number -- Returns the amount of Electricity, outputted by this Block the last 5 ticks as Average.")
/*    */     public Object[] getAverageElectricOutput(Context context, Arguments args) {
/* 86 */       return new Object[] { Long.valueOf(((IBasicEnergyContainer)this.tileEntity).getAverageElectricOutput()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gregtech\DriverEnergyContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */