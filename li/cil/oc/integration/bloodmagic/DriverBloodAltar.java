/*    */ package li.cil.oc.integration.bloodmagic;
/*    */ 
/*    */ import WayofTime.alchemicalWizardry.api.tile.IBloodAltar;
/*    */ import li.cil.oc.api.driver.NamedBlock;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public class DriverBloodAltar
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 17 */     return IBloodAltar.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 23 */     return (ManagedEnvironment)new Environment((IBloodAltar)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IBloodAltar> implements NamedBlock {
/*    */     public Environment(IBloodAltar tileEntity) {
/* 28 */       super(tileEntity, "blood_altar");
/*    */     }
/*    */ 
/*    */     
/*    */     public String preferredName() {
/* 33 */       return "blood_altar";
/*    */     }
/*    */ 
/*    */     
/*    */     public int priority() {
/* 38 */       return 0;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the capacity.")
/*    */     public Object[] getCapacity(Context context, Arguments arguments) {
/* 43 */       return new Object[] { Integer.valueOf(((IBloodAltar)this.tileEntity).getCapacity()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the amount of blood currently contained by this altar.")
/*    */     public Object[] getCurrentBlood(Context context, Arguments arguments) {
/* 48 */       return new Object[] { Integer.valueOf(((IBloodAltar)this.tileEntity).getCurrentBlood()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the current tier.")
/*    */     public Object[] getTier(Context context, Arguments arguments) {
/* 53 */       return new Object[] { Integer.valueOf(((IBloodAltar)this.tileEntity).getTier()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the progress.")
/*    */     public Object[] getProgress(Context context, Arguments arguments) {
/* 58 */       return new Object[] { Integer.valueOf(((IBloodAltar)this.tileEntity).getProgress()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the sacrifice multiplier.")
/*    */     public Object[] getSacrificeMultiplier(Context context, Arguments arguments) {
/* 63 */       return new Object[] { Integer.valueOf(((IBloodAltar)this.tileEntity).getCapacity()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the self sacrifice multiplier.")
/*    */     public Object[] getSelfSacrificeMultiplier(Context context, Arguments arguments) {
/* 68 */       return new Object[] { Float.valueOf(((IBloodAltar)this.tileEntity).getSelfSacrificeMultiplier()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the orb multiplier.")
/*    */     public Object[] getOrbMultiplier(Context context, Arguments arguments) {
/* 73 */       return new Object[] { Float.valueOf(((IBloodAltar)this.tileEntity).getOrbMultiplier()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the dislocation multiplier.")
/*    */     public Object[] getDislocationMultiplier(Context context, Arguments arguments) {
/* 78 */       return new Object[] { Float.valueOf(((IBloodAltar)this.tileEntity).getDislocationMultiplier()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get IO buffer capacity.")
/*    */     public Object[] getBufferCapacity(Context context, Arguments arguments) {
/* 83 */       return new Object[] { Integer.valueOf(((IBloodAltar)this.tileEntity).getBufferCapacity()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\bloodmagic\DriverBloodAltar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */