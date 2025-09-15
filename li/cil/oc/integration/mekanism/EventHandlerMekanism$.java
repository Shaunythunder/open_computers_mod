/*    */ package li.cil.oc.integration.mekanism;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public final class EventHandlerMekanism$ {
/*    */   public boolean useWrench(EntityPlayer player, int x, int y, int z, boolean changeDurability) {
/*    */     boolean bool;
/*  9 */     Item item = player.func_70694_bm().func_77973_b();
/* 10 */     if (item instanceof IMekWrench) { Item item1 = item; bool = ((IMekWrench)item1).canUseWrench(player, x, y, z); }
/* 11 */     else { bool = false; }
/*    */     
/*    */     return bool;
/*    */   } public static final EventHandlerMekanism$ MODULE$; public boolean isWrench(ItemStack stack) {
/* 15 */     return stack.func_77973_b() instanceof IMekWrench; } private EventHandlerMekanism$() {
/* 16 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mekanism\EventHandlerMekanism$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */