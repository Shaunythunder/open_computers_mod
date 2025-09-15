/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*    */ import net.minecraft.tileentity.TileEntityNote;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DriverNoteBlock$
/*    */   extends DriverSidedTileEntity
/*    */ {
/*    */   public static final DriverNoteBlock$ MODULE$;
/*    */   
/*    */   private DriverNoteBlock$() {
/* 20 */     MODULE$ = this; } public Class<?> getTileEntityClass() {
/* 21 */     return TileEntityNote.class;
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/* 24 */     return (ManagedEnvironment)new DriverNoteBlock.Environment((TileEntityNote)world.func_147438_o(x, y, z));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\DriverNoteBlock$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */