/*    */ package li.cil.oc.integration.ic2;
/*    */ 
/*    */ import ic2.core.block.machine.tileentity.TileEntityMatter;
/*    */ import li.cil.oc.api.driver.NamedBlock;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverMassFab extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 17 */     return TileEntityMatter.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 23 */     return (ManagedEnvironment)new Environment((TileEntityMatter)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntityMatter> implements NamedBlock {
/*    */     public Environment(TileEntityMatter tileEntity) {
/* 28 */       super(tileEntity, "mass_fab");
/*    */     }
/*    */ 
/*    */     
/*    */     public String preferredName() {
/* 33 */       return "mass_fab";
/*    */     }
/*    */ 
/*    */     
/*    */     public int priority() {
/* 38 */       return 0;
/*    */     }
/*    */     
/*    */     @Callback
/*    */     public Object[] getProgress(Context context, Arguments args) {
/* 43 */       return new Object[] { Double.valueOf(100.0D * ((TileEntityMatter)this.tileEntity).getEnergy() / ((TileEntityMatter)this.tileEntity).getDemandedEnergy()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\ic2\DriverMassFab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */