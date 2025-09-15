/*    */ package li.cil.oc.integration.enderstorage;
/*    */ 
/*    */ import codechicken.enderstorage.common.TileFrequencyOwner;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverFrequencyOwner
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return TileFrequencyOwner.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((TileFrequencyOwner)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileFrequencyOwner> {
/*    */     public Environment(TileFrequencyOwner tileEntity) {
/* 27 */       super(tileEntity, "ender_storage");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the currently set frequency.")
/*    */     public Object[] getFrequency(Context context, Arguments args) {
/* 32 */       return new Object[] { Integer.valueOf(((TileFrequencyOwner)this.tileEntity).freq) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(value:number) -- Set the frequency. Who would have thought?!")
/*    */     public Object[] setFrequency(Context context, Arguments args) {
/* 37 */       int frequency = args.checkInteger(0);
/* 38 */       if ((frequency & 0xFFF) != frequency) {
/* 39 */         throw new IllegalArgumentException("invalid frequency");
/*    */       }
/* 41 */       ((TileFrequencyOwner)this.tileEntity).setFreq(frequency);
/* 42 */       return null;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string -- Get the name of the owner, which is usually a player's name or 'global'.")
/*    */     public Object[] getOwner(Context context, Arguments args) {
/* 47 */       return new Object[] { ((TileFrequencyOwner)this.tileEntity).owner };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\enderstorage\DriverFrequencyOwner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */