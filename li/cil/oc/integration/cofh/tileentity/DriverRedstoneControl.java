/*    */ package li.cil.oc.integration.cofh.tileentity;
/*    */ 
/*    */ import cofh.api.tileentity.IRedstoneControl;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverRedstoneControl
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IRedstoneControl.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IRedstoneControl)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IRedstoneControl> {
/*    */     public Environment(IRedstoneControl tileEntity) {
/* 27 */       super(tileEntity, "redstone_control");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean --  Returns whether the control is disabled.")
/*    */     public Object[] getControlDisable(Context context, Arguments args) {
/* 32 */       return new Object[] { Boolean.valueOf((((IRedstoneControl)this.tileEntity).getControl() == IRedstoneControl.ControlMode.DISABLED)) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():int --  Returns the control status.")
/*    */     public Object[] getControlSetting(Context context, Arguments args) {
/* 37 */       return new Object[] { Integer.valueOf(((IRedstoneControl)this.tileEntity).getControl().ordinal()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string --  Returns the control status.")
/*    */     public Object[] getControlSettingName(Context context, Arguments args) {
/* 42 */       return new Object[] { ((IRedstoneControl)this.tileEntity).getControl().name() };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(int):string --  Returns the name of the given control")
/*    */     public Object[] getControlName(Context context, Arguments args) {
/* 47 */       IRedstoneControl.ControlMode m = IRedstoneControl.ControlMode.values()[args.checkInteger(0)];
/* 48 */       return new Object[] { m.name() };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean --  Returns whether the component is powered.")
/*    */     public Object[] isPowered(Context context, Arguments args) {
/* 53 */       return new Object[] { Boolean.valueOf(((IRedstoneControl)this.tileEntity).isPowered()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean --  Sets whether the control tp disabled.")
/*    */     public Object[] setControlDisable(Context context, Arguments args) {
/* 58 */       ((IRedstoneControl)this.tileEntity).setControl(IRedstoneControl.ControlMode.DISABLED);
/* 59 */       return new Object[] { Boolean.valueOf(true) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(state:int):boolean --  Sets the control status to the given value.")
/*    */     public Object[] setControlSetting(Context context, Arguments args) {
/* 64 */       if (args.isInteger(0)) {
/* 65 */         ((IRedstoneControl)this.tileEntity).setControl(IRedstoneControl.ControlMode.values()[args.checkInteger(0)]);
/* 66 */         return new Object[] { Boolean.valueOf(true) };
/*    */       } 
/* 68 */       ((IRedstoneControl)this.tileEntity).setControl(IRedstoneControl.ControlMode.valueOf(args.checkString(0)));
/* 69 */       return new Object[] { Boolean.valueOf(true) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\tileentity\DriverRedstoneControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */