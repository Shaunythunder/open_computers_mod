/*    */ package li.cil.oc.integration.buildcraft.recipes;
/*    */ 
/*    */ import buildcraft.api.recipes.BuildcraftRecipeRegistry;
/*    */ import buildcraft.api.recipes.IProgrammingRecipe;
/*    */ import java.util.List;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ public final class LootDiskProgrammableRecipe$ implements IProgrammingRecipe {
/*    */   public static final LootDiskProgrammableRecipe$ MODULE$;
/*    */   
/* 18 */   private LootDiskProgrammableRecipe$() { MODULE$ = this; } public void register() {
/* 19 */     BuildcraftRecipeRegistry.programmingTable.addRecipe(this);
/*    */   }
/* 21 */   public String getId() { return "OpenComputers:loot_disk"; }
/*    */   public final class LootDiskProgrammableRecipe$$anonfun$getOptions$1 extends AbstractFunction1<ItemStack, ArrayBuffer<ItemStack>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final ArrayBuffer options$1; public LootDiskProgrammableRecipe$$anonfun$getOptions$1(ArrayBuffer options$1) {} public final ArrayBuffer<ItemStack> apply(ItemStack stack) { return this.options$1.$plus$eq(stack.func_77946_l()); } } public List<ItemStack> getOptions(int width, int height) {
/* 24 */     ArrayBuffer options = (ArrayBuffer)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/* 25 */     options.sizeHint(width * height);
/*    */     
/* 27 */     li.cil.oc.common.Loot$.MODULE$.disksForCycling().foreach((Function1)new LootDiskProgrammableRecipe$$anonfun$getOptions$1(options));
/*    */ 
/*    */ 
/*    */     
/* 31 */     return scala.collection.convert.WrapAsJava$.MODULE$.bufferAsJavaList((Buffer)options);
/*    */   }
/*    */   public int getEnergyCost(ItemStack option) {
/* 34 */     return li.cil.oc.integration.util.Power$.MODULE$.toRF(li.cil.oc.Settings$.MODULE$.get().costProgrammingTable());
/*    */   }
/* 36 */   public boolean canCraft(ItemStack input) { ItemInfo itemInfo = Items.get("floppy"); if (Items.get(input) == null) { Items.get(input); if (itemInfo != null); } else if (Items.get(input).equals(itemInfo))
/*    */     {  }
/* 38 */      } public ItemStack craft(ItemStack input, ItemStack option) { return option.func_77946_l(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\recipes\LootDiskProgrammableRecipe$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */