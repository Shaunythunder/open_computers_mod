/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ 
/*    */ public final class ItemColorizer$
/*    */ {
/*    */   public static final ItemColorizer$ MODULE$;
/*    */   
/*    */   public boolean hasColor(ItemStack stack) {
/* 13 */     return (stack.func_77942_o() && stack.func_77978_p().func_74764_b("display") && stack.func_77978_p().func_74775_l("display").func_74764_b("color"));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getColor(ItemStack stack) {
/* 19 */     NBTTagCompound tag = stack.func_77978_p();
/*    */     
/* 21 */     NBTTagCompound displayTag = tag.func_74775_l("display");
/*    */ 
/*    */     
/* 24 */     return (tag == null) ? -1 : ((displayTag == null) ? -1 : (displayTag.func_74764_b("color") ? displayTag.func_74762_e("color") : -1));
/*    */   }
/*    */   
/*    */   public void removeColor(ItemStack stack) {
/* 28 */     NBTTagCompound tag = stack.func_77978_p();
/* 29 */     if (tag != null) {
/* 30 */       NBTTagCompound displayTag = tag.func_74775_l("display");
/* 31 */       if (displayTag.func_74764_b("color")) displayTag.func_82580_o("color"); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void setColor(ItemStack stack, int color) {
/* 36 */     NBTTagCompound tag = stack.func_77978_p();
/* 37 */     if (tag == null) {
/* 38 */       tag = new NBTTagCompound();
/* 39 */       stack.func_77982_d(tag);
/*    */     } 
/* 41 */     NBTTagCompound displayTag = tag.func_74775_l("display");
/* 42 */     if (!tag.func_74764_b("display")) {
/* 43 */       tag.func_74782_a("display", (NBTBase)displayTag);
/*    */     }
/* 45 */     displayTag.func_74768_a("color", color);
/*    */   } private ItemColorizer$() {
/* 47 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ItemColorizer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */