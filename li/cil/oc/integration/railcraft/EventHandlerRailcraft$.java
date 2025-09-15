/*    */ package li.cil.oc.integration.railcraft;
/*    */ import mods.railcraft.api.core.items.IToolCrowbar;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ 
/*    */ public final class EventHandlerRailcraft$ {
/*    */   public boolean useWrench(EntityPlayer player, int x, int y, int z, boolean changeDurability) {
/*    */     boolean bool;
/*  9 */     Item item = player.func_70694_bm().func_77973_b();
/* 10 */     if (item instanceof IToolCrowbar) { Item item1 = item;
/*    */       
/* 12 */       ((IToolCrowbar)item1).onWhack(player, player.func_70694_bm(), x, y, z);
/* 13 */       bool = changeDurability ? true : (
/*    */         
/* 15 */         (IToolCrowbar)item1).canWhack(player, player.func_70694_bm(), x, y, z); }
/* 16 */     else { bool = false; }
/*    */     
/*    */     return bool;
/*    */   } public static final EventHandlerRailcraft$ MODULE$; public boolean isWrench(ItemStack stack) {
/* 20 */     return stack.func_77973_b() instanceof IToolCrowbar; } private EventHandlerRailcraft$() {
/* 21 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\railcraft\EventHandlerRailcraft$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */