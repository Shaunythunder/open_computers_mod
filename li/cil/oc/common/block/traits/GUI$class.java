/*    */ package li.cil.oc.common.block.traits;
/*    */ 
/*    */ import li.cil.oc.OpenComputers$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class GUI$class
/*    */ {
/*    */   public static void $init$(GUI $this) {}
/*    */   
/*    */   public static boolean onBlockActivated(GUI $this, World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/* 15 */     if (!world.field_72995_K) {
/* 16 */       player.openGui(OpenComputers$.MODULE$, $this.guiType().id(), world, x, y, z);
/*    */     }
/*    */ 
/*    */     
/* 20 */     return player.func_70093_af() ? $this.li$cil$oc$common$block$traits$GUI$$super$onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ) : true;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\GUI$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */