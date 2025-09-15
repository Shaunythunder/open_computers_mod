/*    */ package li.cil.oc.integration.util;
/*    */ import codechicken.nei.LayoutManager;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.collection.mutable.Set;
/*    */ 
/*    */ public final class NEI$ {
/*    */   public static final NEI$ MODULE$;
/*    */   private final Set<Function0<ItemStack>> hiddenItems;
/*    */   
/*    */   public Set<Function0<ItemStack>> hiddenItems() {
/* 14 */     return this.hiddenItems;
/*    */   }
/* 16 */   public boolean isInputFocused() { return (li.cil.oc.integration.Mods$.MODULE$.NotEnoughItems().isAvailable() && liftedTree1$1()); } private final boolean liftedTree1$1() { try {  } finally {} return false; }
/*    */ 
/*    */   
/*    */   private boolean isInputFocused0() {
/* 20 */     return !(LayoutManager.getInputFocused() == null);
/*    */   }
/*    */   public Option<ItemStack> hoveredStack(GuiContainer container, int mouseX, int mouseY) {
/* 23 */     if (li.cil.oc.integration.Mods$.MODULE$.NotEnoughItems().isAvailable()) { try {  } finally { Exception exception; }  } else {  }  return 
/*    */ 
/*    */       
/* 26 */       (Option<ItemStack>)scala.None$.MODULE$;
/*    */   } private ItemStack hoveredStack0(GuiContainer container, int mouseX, int mouseY) {
/* 28 */     return LayoutManager.instance().getStackUnderMouse(container, mouseX, mouseY);
/*    */   }
/* 30 */   public void hide(Block block) { if (li.cil.oc.integration.Mods$.MODULE$.NotEnoughItems().isAvailable()) hiddenItems().$plus$eq(new NEI$$anonfun$hide$1(block));  } public final class NEI$$anonfun$hide$1 extends AbstractFunction0<ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final Block block$1; public final ItemStack apply() { return new ItemStack(this.block$1); }
/*    */      public NEI$$anonfun$hide$1(Block block$1) {} }
/* 32 */    public void hide(Delegate item) { if (li.cil.oc.integration.Mods$.MODULE$.NotEnoughItems().isAvailable()) hiddenItems().$plus$eq(new NEI$$anonfun$hide$2(item));  } public final class NEI$$anonfun$hide$2 extends AbstractFunction0<ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final Delegate item$1; public final ItemStack apply() { return this.item$1.createItemStack(this.item$1.createItemStack$default$1()); } public NEI$$anonfun$hide$2(Delegate item$1) {} } private NEI$() {
/* 33 */     MODULE$ = this;
/*    */     this.hiddenItems = scala.collection.mutable.Set$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\NEI$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */