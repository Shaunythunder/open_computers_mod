/*    */ package li.cil.oc.common.block.traits;
/*    */ import li.cil.oc.api.util.StateAware;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public abstract class StateAware$class {
/*    */   public static boolean hasComparatorInputOverride(StateAware $this) {
/*  8 */     return true;
/*    */   } public static void $init$(StateAware $this) {} public static int getComparatorInputOverride(StateAware $this, World world, int x, int y, int z, int side) {
/*    */     boolean bool;
/* 11 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 12 */     if (tileEntity instanceof StateAware) { TileEntity tileEntity1 = tileEntity;
/* 13 */       bool = ((StateAware)tileEntity1).getCurrentState().contains(StateAware.State.IsWorking) ? true : (
/* 14 */         ((StateAware)tileEntity1).getCurrentState().contains(StateAware.State.CanWork) ? true : 
/* 15 */         false); }
/* 16 */     else { bool = false; }
/*    */     
/*    */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\StateAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */