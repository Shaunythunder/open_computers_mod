/*    */ package li.cil.oc.integration.tmechworks;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import tmechworks.lib.blocks.IDrawbridgeLogicBase;
/*    */ 
/*    */ public class DriverDrawBridge
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 16 */     return IDrawbridgeLogicBase.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 22 */     return (ManagedEnvironment)new Environment((IDrawbridgeLogicBase)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IDrawbridgeLogicBase> {
/*    */     public Environment(IDrawbridgeLogicBase tileEntity) {
/* 27 */       super(tileEntity, "drawbridge");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean -- Whether the draw bridge is currently in its extended state or not.")
/*    */     public Object[] hasExtended(Context context, Arguments args) {
/* 32 */       return new Object[] { Boolean.valueOf(((IDrawbridgeLogicBase)this.tileEntity).hasExtended()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tmechworks\DriverDrawBridge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */