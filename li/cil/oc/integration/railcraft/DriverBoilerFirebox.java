/*    */ package li.cil.oc.integration.railcraft;
/*    */ 
/*    */ import li.cil.oc.api.driver.NamedBlock;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import mods.railcraft.common.blocks.machine.beta.TileBoilerFirebox;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public class DriverBoilerFirebox
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 18 */     return (ManagedEnvironment)new Environment((TileBoilerFirebox)world.func_147438_o(x, y, z));
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<?> getTileEntityClass() {
/* 23 */     return TileBoilerFirebox.class;
/*    */   }
/*    */   
/*    */   public static final class Environment
/*    */     extends ManagedTileEntityEnvironment<TileBoilerFirebox> implements NamedBlock {
/*    */     public Environment(TileBoilerFirebox tileEntity) {
/* 29 */       super(tileEntity, "boiler_firebox");
/*    */     }
/*    */ 
/*    */     
/*    */     public String preferredName() {
/* 34 */       return "boiler_firebox";
/*    */     }
/*    */ 
/*    */     
/*    */     public int priority() {
/* 39 */       return 0;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean -- Get whether the boiler is active or not.")
/*    */     public Object[] isBurning(Context context, Arguments args) {
/* 44 */       return new Object[] { Boolean.valueOf(((TileBoilerFirebox)this.tileEntity).isBurning()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the temperature of the boiler.")
/*    */     public Object[] getTemperature(Context context, Arguments args) {
/* 49 */       return new Object[] { Float.valueOf(((TileBoilerFirebox)this.tileEntity).getTemperature()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the maximum temperature of the boiler.")
/*    */     public Object[] getMaxHeat(Context context, Arguments args) {
/* 54 */       return new Object[] { Float.valueOf(((TileBoilerFirebox)this.tileEntity).getMaxHeat()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\railcraft\DriverBoilerFirebox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */