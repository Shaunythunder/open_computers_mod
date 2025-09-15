/*    */ package li.cil.oc.integration.thermalexpansion;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import li.cil.oc.util.Reflection;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public final class DriverLamp extends DriverSidedTileEntity {
/* 15 */   private static final Class<?> TileLamp = Reflection.getClass("thermalexpansion.block.lamp.TileLamp");
/*    */ 
/*    */   
/*    */   public Class<?> getTileEntityClass() {
/* 19 */     return TileLamp;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 25 */     return (ManagedEnvironment)new Environment(world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<TileEntity> {
/*    */     public Environment(TileEntity tileEntity) {
/* 30 */       super(tileEntity, "lamp");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(color:number):boolean --  Sets the color of the lamp to the given color.")
/*    */     public Object[] setColor(Context context, Arguments args) {
/* 35 */       return new Object[] { Reflection.tryInvoke(this.tileEntity, "setColor", new Object[] { Integer.valueOf(args.checkInteger(0)) }) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thermalexpansion\DriverLamp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */