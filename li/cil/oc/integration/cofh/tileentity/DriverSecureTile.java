/*    */ package li.cil.oc.integration.cofh.tileentity;
/*    */ 
/*    */ import cofh.api.tileentity.ISecurable;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import org.apache.commons.lang3.text.WordUtils;
/*    */ 
/*    */ 
/*    */ public final class DriverSecureTile
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public Class<?> getTileEntityClass() {
/* 21 */     return ISecurable.class;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 27 */     return (ManagedEnvironment)new Environment((ISecurable)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public static final class Environment extends ManagedTileEntityEnvironment<ISecurable> {
/*    */     public Environment(ISecurable tileEntity) {
/* 32 */       super(tileEntity, "secure_tile");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     @Callback(doc = "function(name:string):boolean --  Returns whether the player with the given name can access the component")
/*    */     public Object[] canPlayerAccess(Context context, Arguments args) {
/* 39 */       return new Object[] { Boolean.valueOf(((ISecurable)this.tileEntity).canPlayerAccess((EntityPlayer)MinecraftServer.func_71276_C().func_71203_ab().func_152612_a(args.checkString(0)))) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string --  Returns the type of the access.")
/*    */     public Object[] getAccess(Context context, Arguments args) {
/* 44 */       return new Object[] { WordUtils.capitalize(((ISecurable)this.tileEntity).getAccess().name()) };
/*    */     }
/*    */     
/*    */     @Callback(doc = "function():string --  Returns the name of the owner.")
/*    */     public Object[] getOwnerName(Context context, Arguments args) {
/* 49 */       return new Object[] { ((ISecurable)this.tileEntity).getOwnerName() };
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\tileentity\DriverSecureTile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */