/*    */ package li.cil.oc.integration.cofh.transport;
/*    */ 
/*    */ import cofh.api.transport.IEnderEnergyHandler;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnderEnergy
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IEnderEnergyHandler.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IEnderEnergyHandler)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IEnderEnergyHandler> {
/*    */     public Environment(IEnderEnergyHandler tileEntity) {
/* 27 */       super(tileEntity, "ender_energy");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean --  Returns whether the tile entity can receive energy.")
/*    */     public Object[] canReceiveEnergy(Context context, Arguments args) {
/* 32 */       return new Object[] { Boolean.valueOf(((IEnderEnergyHandler)this.tileEntity).canReceiveEnergy()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean --  Returns whether the tile entity can send energy.")
/*    */     public Object[] canSendEnergy(Context context, Arguments args) {
/* 37 */       return new Object[] { Boolean.valueOf(((IEnderEnergyHandler)this.tileEntity).canSendEnergy()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the frequency.")
/*    */     public Object[] getFrequency(Context context, Arguments args) {
/* 42 */       return new Object[] { Integer.valueOf(((IEnderEnergyHandler)this.tileEntity).getFrequency()) };
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function(frequency:number):boolean --  Sets the frequency to the given value. Returns whether the frequency change was successful")
/*    */     public Object[] setFrequency(Context context, Arguments args) {
/* 49 */       return new Object[] { Boolean.valueOf(((IEnderEnergyHandler)this.tileEntity).setFrequency(args.checkInteger(0))) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string --  Returns the name of the channel.")
/*    */     public Object[] getChannelString(Context context, Arguments args) {
/* 54 */       return new Object[] { ((IEnderEnergyHandler)this.tileEntity).getChannelString() };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\transport\DriverEnderEnergy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */