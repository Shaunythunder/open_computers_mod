/*    */ package li.cil.oc.common.item.traits;
/*    */ 
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import java.util.List;
/*    */ import li.cil.oc.Localization$Tooltip$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public abstract class ItemTier$class {
/*    */   public static void $init$(ItemTier $this) {}
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public static void tooltipLines(ItemTier $this, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 15 */     $this.li$cil$oc$common$item$traits$ItemTier$$super$tooltipLines(stack, player, tooltip, advanced);
/* 16 */     if (advanced)
/* 17 */       tooltip.add(Localization$Tooltip$.MODULE$.Tier($this.tierFromDriver(stack) + 1)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\ItemTier$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */