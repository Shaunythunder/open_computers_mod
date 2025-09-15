/*    */ package li.cil.oc.integration.projectred;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public final class EventHandlerProjectRed$ {
/*    */   public boolean useWrench(EntityPlayer player, int x, int y, int z, boolean changeDurability) {
/*    */     boolean bool;
/*  9 */     Item item = player.func_70694_bm().func_77973_b();
/* 10 */     if (item instanceof IScrewdriver) { Item item1 = item;
/*    */       
/* 12 */       ((IScrewdriver)item1).damageScrewdriver(player, player.func_70694_bm());
/* 13 */       bool = changeDurability ? true : 
/*    */         
/* 15 */         true; }
/* 16 */     else { bool = false; }
/*    */     
/*    */     return bool;
/*    */   } public static final EventHandlerProjectRed$ MODULE$; public boolean isWrench(ItemStack stack) {
/* 20 */     return stack.func_77973_b() instanceof IScrewdriver; } private EventHandlerProjectRed$() {
/* 21 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\projectred\EventHandlerProjectRed$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */