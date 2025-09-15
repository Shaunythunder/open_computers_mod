/*    */ package li.cil.oc.integration.thaumcraft;
/*    */ 
/*    */ import com.google.common.base.Preconditions;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import thaumcraft.api.aspects.Aspect;
/*    */ import thaumcraft.api.aspects.AspectList;
/*    */ import thaumcraft.api.aspects.IAspectContainer;
/*    */ 
/*    */ public class DriverAspectContainer
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 20 */     return (ManagedEnvironment)new Environment((IAspectContainer)world.func_147438_o(x, y, z));
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<?> getTileEntityClass() {
/* 25 */     return IAspectContainer.class;
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<IAspectContainer> {
/*    */     public Environment(IAspectContainer tileEntity) {
/* 30 */       super(tileEntity, "aspect_container");
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():table -- Get the Aspects stored in the block")
/*    */     public Object[] getAspects(Context context, Arguments args) {
/* 35 */       return new Object[] { this.tileEntity };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function(aspect:string):number -- Get amount of specific aspect stored in this block")
/*    */     public Object[] getAspectCount(Context context, Arguments args) {
/* 40 */       Aspect aspect = Aspect.getAspect(args.checkString(0).toLowerCase());
/* 41 */       Preconditions.checkNotNull(aspect, "Invalid aspect name");
/* 42 */       AspectList list = ((IAspectContainer)this.tileEntity).getAspects();
/* 43 */       return new Object[] { Integer.valueOf(list.getAmount(aspect)) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumcraft\DriverAspectContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */