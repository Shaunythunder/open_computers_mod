/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.driver.SidedBlock;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DriverSidedTileEntity
/*    */   implements SidedBlock
/*    */ {
/*    */   public abstract Class<?> getTileEntityClass();
/*    */   
/*    */   public boolean worksWith(World world, int x, int y, int z, ForgeDirection side) {
/* 16 */     Class<?> filter = getTileEntityClass();
/* 17 */     if (filter == null)
/*    */     {
/*    */       
/* 20 */       return false;
/*    */     }
/* 22 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 23 */     return (tileEntity != null && filter.isAssignableFrom(tileEntity.getClass()));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\DriverSidedTileEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */