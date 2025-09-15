/*    */ package li.cil.oc.integration.bloodmagic;
/*    */ 
/*    */ import WayofTime.alchemicalWizardry.api.rituals.IMasterRitualStone;
/*    */ import WayofTime.alchemicalWizardry.common.tileEntity.TEMasterStone;
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
/*    */ public class DriverMasterRitualStone
/*    */   extends DriverSidedTileEntity {
/*    */   public Class<?> getTileEntityClass() {
/* 18 */     return IMasterRitualStone.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 24 */     return (ManagedEnvironment)new Environment((IMasterRitualStone)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static class Environment extends ManagedTileEntityEnvironment<IMasterRitualStone> implements NamedBlock {
/*    */     public Environment(IMasterRitualStone tileEntity) {
/* 29 */       super(tileEntity, "master_ritual_stone");
/*    */     }
/*    */ 
/*    */     
/*    */     public String preferredName() {
/* 34 */       return "master_ritual_stone";
/*    */     }
/*    */ 
/*    */     
/*    */     public int priority() {
/* 39 */       return 0;
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string -- Get the name of the player owning this master ritual stone.")
/*    */     public Object[] getOwner(Context context, Arguments arguments) {
/* 44 */       return new Object[] { ((IMasterRitualStone)this.tileEntity).getOwner() };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string -- Get the current ritual.")
/*    */     public Object[] getCurrentRitual(Context context, Arguments arguments) {
/* 49 */       if (this.tileEntity instanceof TEMasterStone) {
/* 50 */         TEMasterStone masterStone = (TEMasterStone)this.tileEntity;
/* 51 */         return new Object[] { masterStone.getCurrentRitual() };
/*    */       } 
/* 53 */       return new Object[] { "internal error" };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the remaining cooldown.")
/*    */     public Object[] getCooldown(Context context, Arguments arguments) {
/* 58 */       return new Object[] { Integer.valueOf(((IMasterRitualStone)this.tileEntity).getCooldown()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():number -- Get the running time.")
/*    */     public Object[] getRunningTime(Context context, Arguments arguments) {
/* 63 */       return new Object[] { Integer.valueOf(((IMasterRitualStone)this.tileEntity).getRunningTime()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():boolean -- Get whether the tanks are empty.")
/*    */     public Object[] areTanksEmpty(Context context, Arguments arguments) {
/* 68 */       return new Object[] { Boolean.valueOf(((IMasterRitualStone)this.tileEntity).areTanksEmpty()) };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\bloodmagic\DriverMasterRitualStone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */