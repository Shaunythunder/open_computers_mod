/*    */ package li.cil.oc.common.block.traits;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.util.Tooltip$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class PowerAcceptor$class
/*    */ {
/*    */   public static void $init$(PowerAcceptor $this) {}
/*    */   
/*    */   public static void tooltipTail(PowerAcceptor $this, int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 16 */     $this.li$cil$oc$common$block$traits$PowerAcceptor$$super$tooltipTail(metadata, stack, player, tooltip, advanced);
/* 17 */     tooltip.addAll(Tooltip$.MODULE$.extended("PowerAcceptor", (Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger((int)$this.energyThroughput()) })));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\traits\PowerAcceptor$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */