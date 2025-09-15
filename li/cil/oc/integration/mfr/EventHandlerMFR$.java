/*    */ package li.cil.oc.integration.mfr;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public final class EventHandlerMFR$ {
/*    */   public boolean useWrench(EntityPlayer player, int x, int y, int z, boolean changeDurability) {
/*    */     boolean bool;
/*  9 */     Item item = player.func_70694_bm().func_77973_b();
/* 10 */     if (item instanceof powercrystals.minefactoryreloaded.api.IMFRHammer) { bool = true; }
/* 11 */     else { bool = false; }
/*    */     
/*    */     return bool;
/*    */   } public static final EventHandlerMFR$ MODULE$; public boolean isWrench(ItemStack stack) {
/* 15 */     return stack.func_77973_b() instanceof powercrystals.minefactoryreloaded.api.IMFRHammer; } private EventHandlerMFR$() {
/* 16 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\mfr\EventHandlerMFR$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */