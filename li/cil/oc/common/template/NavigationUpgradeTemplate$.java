/*    */ package li.cil.oc.common.template;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.common.item.data.NavigationUpgradeData;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ public final class NavigationUpgradeTemplate$ {
/*    */   public static final NavigationUpgradeTemplate$ MODULE$;
/*    */   
/* 11 */   public boolean selectDisassembler(ItemStack stack) { ItemInfo itemInfo = Items.get("navigationUpgrade"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*    */     {  }
/*    */      }
/* 14 */   public ItemStack[] disassemble(ItemStack stack, ItemStack[] ingredients) { NavigationUpgradeData info = new NavigationUpgradeData(stack);
/* 15 */     return (ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])ingredients).map((Function1)new NavigationUpgradeTemplate$$anonfun$disassemble$1(info), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class))); } public final class NavigationUpgradeTemplate$$anonfun$disassemble$1 extends AbstractFunction1<ItemStack, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(ItemStack x0$1) { ItemStack itemStack = x0$1;
/* 16 */       ItemMap itemMap = Items.field_151098_aY; if (itemStack.func_77973_b() == null) { itemStack.func_77973_b(); if (itemMap != null)
/* 17 */           ItemStack itemStack1 = itemStack;  } else { if (itemStack.func_77973_b().equals(itemMap)) return this.info$1.map();  ItemStack itemStack1 = itemStack; }
/*    */       
/*    */       return this.info$1.map(); }
/*    */      private final NavigationUpgradeData info$1;
/*    */     public NavigationUpgradeTemplate$$anonfun$disassemble$1(NavigationUpgradeData info$1) {} }
/*    */   public void register() {
/* 23 */     IMC.registerDisassemblerTemplate(
/* 24 */         "Navigation Upgrade", 
/* 25 */         "li.cil.oc.common.template.NavigationUpgradeTemplate.selectDisassembler", 
/* 26 */         "li.cil.oc.common.template.NavigationUpgradeTemplate.disassemble");
/*    */   } private NavigationUpgradeTemplate$() {
/* 28 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\NavigationUpgradeTemplate$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */