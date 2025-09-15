/*    */ package li.cil.oc.integration.buildcraft.tiles;
/*    */ 
/*    */ import buildcraft.api.tiles.IControllable;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverControllable
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IControllable.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IControllable)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IControllable> {
/*    */     public Environment(IControllable tileEntity) {
/* 27 */       super(tileEntity, "bc_controllable");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string -- Get the current control mode.")
/*    */     public Object[] getControlMode(Context context, Arguments args) {
/* 32 */       return new Object[] { ((IControllable)this.tileEntity).getControlMode().name() };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(mode:string):boolean -- Test whether the specified control mode is acceptable.")
/*    */     public Object[] acceptsControlMode(Context context, Arguments args) {
/* 37 */       return new Object[] { Boolean.valueOf(((IControllable)this.tileEntity).acceptsControlMode(IControllable.Mode.valueOf(args.checkString(0)))) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(mode:string):boolean -- Sets the control mode to the specified value.")
/*    */     public Object[] setControlMode(Context context, Arguments args) {
/* 42 */       ((IControllable)this.tileEntity).setControlMode(IControllable.Mode.valueOf(args.checkString(0)));
/* 43 */       return null;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\tiles\DriverControllable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */