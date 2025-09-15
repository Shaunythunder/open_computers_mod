/*    */ package li.cil.oc.common.block.traits;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.reflect.ClassTag;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public abstract class CustomDrops$class {
/*    */   public static void $init$(CustomDrops $this) {}
/*    */   
/*    */   public static ArrayList getDrops(CustomDrops $this, World world, int x, int y, int z, int metadata, int fortune) {
/* 17 */     return new ArrayList();
/*    */   }
/*    */   public static void onBlockPreDestroy(CustomDrops $this, World world, int x, int y, int z, int metadata) {}
/*    */   
/*    */   public static boolean removedByPlayer(CustomDrops<TileEntity> $this, World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) {
/* 22 */     if (!world.field_72995_K) {
/* 23 */       ClassTag matcher = $this.tileTag();
/* 24 */       TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 25 */       Option option = matcher.unapply(tileEntity); if (option.isEmpty())
/* 26 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */       else { TileEntity tileEntity1 = (TileEntity)option.get(); $this.doCustomDrops(tileEntity1, player, willHarvest); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/* 29 */     }  return $this.li$cil$oc$common$block$traits$CustomDrops$$super$removedByPlayer(world, player, x, y, z, willHarvest);
/*    */   }
/*    */   
/*    */   public static void onBlockPlacedBy(CustomDrops<TileEntity> $this, World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
/* 33 */     $this.li$cil$oc$common$block$traits$CustomDrops$$super$onBlockPlacedBy(world, x, y, z, player, stack);
/* 34 */     ClassTag matcher = $this.tileTag();
/* 35 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 36 */     Option option = matcher.unapply(tileEntity); if (option.isEmpty()) {
/* 37 */       BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } else {
/*    */       TileEntity tileEntity1 = (TileEntity)option.get();
/*    */       $this.doCustomInit(tileEntity1, player, stack);
/*    */       BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void doCustomInit(CustomDrops $this, TileEntity tileEntity, EntityLivingBase player, ItemStack stack) {}
/*    */   
/*    */   public static void doCustomDrops(CustomDrops $this, TileEntity tileEntity, EntityPlayer player, boolean willHarvest) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\CustomDrops$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */