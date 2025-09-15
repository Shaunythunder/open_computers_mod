/*    */ package li.cil.oc.integration.buildcraft.transport;
/*    */ 
/*    */ import buildcraft.api.transport.IPipeTile;
/*    */ import buildcraft.api.transport.PipeWire;
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
/*    */ public final class DriverPipeTile
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 18 */     return IPipeTile.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 24 */     return (ManagedEnvironment)new Environment((IPipeTile)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IPipeTile> implements NamedBlock {
/*    */     public Environment(IPipeTile tileEntity) {
/* 29 */       super(tileEntity, "bc_pipe");
/*    */     }
/*    */ 
/*    */     
/*    */     public String preferredName() {
/* 34 */       return "bc_pipe";
/*    */     }
/*    */ 
/*    */     
/*    */     public int priority() {
/* 39 */       return -10;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string --  Returns the type of the pipe.")
/*    */     public Object[] getPipeType(Context context, Arguments args) {
/*    */       try {
/* 45 */         return new Object[] { ((IPipeTile)this.tileEntity).getPipeType().name() };
/* 46 */       } catch (Throwable throwable) {
/*    */         
/* 48 */         return new Object[] { null, "none" };
/*    */       } 
/*    */     }
/*    */ 
/*    */     
/*    */     @Callback(doc = "function(side:number):boolean --  Returns whether the pipe is connected to something on the specified side.")
/*    */     public Object[] isPipeConnected(Context context, Arguments args) {
/*    */       try {
/* 56 */         return new Object[] { Boolean.valueOf(((IPipeTile)this.tileEntity).isPipeConnected(ForgeDirection.getOrientation(args.checkInteger(0)))) };
/* 57 */       } catch (Throwable throwable) {
/*    */         
/* 59 */         return new Object[] { Boolean.valueOf(false) };
/*    */       } 
/*    */     }
/*    */     @Callback(doc = "function(color:string):boolean -- Returns whether the pipe is wired with the given color.")
/*    */     public Object[] isWired(Context context, Arguments args) {
/*    */       try {
/* 65 */         return new Object[] { Boolean.valueOf(((IPipeTile)this.tileEntity).getPipe().isWired(PipeWire.valueOf(args.checkString(0)))) };
/* 66 */       } catch (Throwable throwable) {
/*    */         
/* 68 */         return new Object[] { Boolean.valueOf(false) };
/*    */       } 
/*    */     }
/*    */     @Callback(doc = "function(color:string):boolean -- Returns whether the wired with the given color is active.")
/*    */     public Object[] isWireActive(Context context, Arguments args) {
/*    */       try {
/* 74 */         return new Object[] { Boolean.valueOf(((IPipeTile)this.tileEntity).getPipe().isWireActive(PipeWire.valueOf(args.checkString(0)))) };
/* 75 */       } catch (Throwable throwable) {
/*    */         
/* 77 */         return new Object[] { Boolean.valueOf(false) };
/*    */       } 
/*    */     }
/*    */     @Callback(doc = "function(side:number):boolean -- Returns whether the pipe has a gate on the specified side.")
/*    */     public Object[] hasGate(Context context, Arguments args) {
/*    */       try {
/* 83 */         return new Object[] { Boolean.valueOf(((IPipeTile)this.tileEntity).getPipe().hasGate(ForgeDirection.getOrientation(args.checkInteger(0)))) };
/* 84 */       } catch (Throwable throwable) {
/*    */         
/* 86 */         return new Object[] { Boolean.valueOf(false) };
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\transport\DriverPipeTile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */