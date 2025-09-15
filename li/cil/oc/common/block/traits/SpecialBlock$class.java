/*    */ package li.cil.oc.common.block.traits;
/*    */ import li.cil.oc.common.block.SimpleBlock;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ public abstract class SpecialBlock$class {
/*    */   public static boolean isOpaqueCube(SpecialBlock $this) {
/*  8 */     return false;
/*    */   } public static void $init$(SpecialBlock $this) {} public static boolean renderAsNormalBlock(SpecialBlock $this) {
/* 10 */     return false;
/*    */   } public static final boolean isBlockSolid(SpecialBlock $this, IBlockAccess world, int x, int y, int z, int side) {
/* 12 */     return $this.isBlockSolid(world, x, y, z, ((SimpleBlock)$this).toLocal(world, x, y, z, ForgeDirection.getOrientation(side)));
/*    */   } public static boolean isBlockSolid(SpecialBlock $this, IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 14 */     return $this.li$cil$oc$common$block$traits$SpecialBlock$$super$isBlockSolid(world, x, y, z, side.ordinal());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\SpecialBlock$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */