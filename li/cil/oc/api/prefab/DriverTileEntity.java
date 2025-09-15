/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.driver.Block;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class DriverTileEntity
/*    */   implements Block
/*    */ {
/*    */   public abstract Class<?> getTileEntityClass();
/*    */   
/*    */   public boolean worksWith(World world, int x, int y, int z) {
/* 15 */     Class<?> filter = getTileEntityClass();
/* 16 */     if (filter == null)
/*    */     {
/*    */       
/* 19 */       return false;
/*    */     }
/* 21 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 22 */     return (tileEntity != null && filter.isAssignableFrom(tileEntity.getClass()));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\DriverTileEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */