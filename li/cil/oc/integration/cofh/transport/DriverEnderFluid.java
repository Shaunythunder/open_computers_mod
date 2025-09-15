/*    */ package li.cil.oc.integration.cofh.transport;
/*    */ 
/*    */ import cofh.api.transport.IEnderFluidHandler;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverEnderFluid
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IEnderFluidHandler.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IEnderFluidHandler)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IEnderFluidHandler> {
/*    */     public Environment(IEnderFluidHandler tileEntity) {
/* 27 */       super(tileEntity, "ender_fluid");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean --  Returns whether the tile entity can receive fluids.")
/*    */     public Object[] canReceiveFluid(Context context, Arguments args) {
/* 32 */       return new Object[] { Boolean.valueOf(((IEnderFluidHandler)this.tileEntity).canReceiveFluid()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean --  Returns whether the tile entity can send fluids.")
/*    */     public Object[] canSendFluid(Context context, Arguments args) {
/* 37 */       return new Object[] { Boolean.valueOf(((IEnderFluidHandler)this.tileEntity).canSendFluid()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number --  Returns the frequency.")
/*    */     public Object[] getFrequency(Context context, Arguments args) {
/* 42 */       return new Object[] { Integer.valueOf(((IEnderFluidHandler)this.tileEntity).getFrequency()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string --  Returns the name of the channel.")
/*    */     public Object[] getChannelString(Context context, Arguments args) {
/* 47 */       return new Object[] { ((IEnderFluidHandler)this.tileEntity).getChannelString() };
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function(frequency:number):boolean --  Sets the frequency to the given value. Returns whether the frequency change was successful")
/*    */     public Object[] setFrequency(Context context, Arguments args) {
/* 54 */       return new Object[] { Boolean.valueOf(((IEnderFluidHandler)this.tileEntity).setFrequency(args.checkInteger(0))) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\transport\DriverEnderFluid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */