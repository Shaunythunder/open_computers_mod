/*    */ package li.cil.oc.common.recipe;
/*    */ 
/*    */ import net.minecraft.inventory.InventoryCrafting;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\r4A!\001\002\001\033\t)Bj\\8u\t&\0348nQ=dY&twMU3dSB,'BA\002\005\003\031\021XmY5qK*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/\001j\021\001\007\006\0033i\t\001b\031:bMRLgn\032\006\0037q\tA!\033;f[*\021QDH\001\n[&tWm\031:bMRT\021aH\001\004]\026$\030BA\021\031\005\035I%+Z2ja\026DQa\t\001\005\002\021\na\001P5oSRtD#A\023\021\005\031\002Q\"\001\002\t\013!\002A\021I\025\002\0175\fGo\0315fgR\031!\006M\034\021\005-rS\"\001\027\013\0035\nQa]2bY\006L!a\f\027\003\017\t{w\016\\3b]\")\021d\na\001cA\021!'N\007\002g)\021A\007H\001\nS:4XM\034;pefL!AN\032\003#%sg/\0328u_JL8I]1gi&tw\rC\0039O\001\007\021(A\003x_JdG\r\005\002;y5\t1H\003\00299%\021Qh\017\002\006/>\024H\016\032\005\006\001!\t\005Q\001\022O\026$8I]1gi&twMU3tk2$HCA!F!\t\0215)D\001\033\023\t!%DA\005Ji\026l7\013^1dW\")\021D\020a\001c!)q\t\001C\001\021\006\021r-\032;M_>$h)Y2u_JLh*Y7f)\tIE\n\005\002\020\025&\0211\n\005\002\007'R\024\030N\\4\t\01353\005\031A!\002\013M$\030mY6\t\013=\003A\021\001)\002\033\r|G\016\\3diN#\030mY6t)\t\t\026\fE\002S/\006k\021a\025\006\003)V\013\021\"[7nkR\f'\r\\3\013\005Yc\023AC2pY2,7\r^5p]&\021\001l\025\002\013\023:$W\r_3e'\026\f\b\"B\rO\001\004\t\004\"B.\001\t\003b\026!D4fiJ+7-\0339f'&TX\rF\001^!\tYc,\003\002`Y\t\031\021J\034;\t\013\005\004A\021\t2\002\037\035,GOU3dSB,w*\036;qkR$\022!\021")
/*    */ public class LootDiskCyclingRecipe implements IRecipe {
/* 13 */   public boolean func_77569_a(InventoryCrafting crafting, World world) { ItemStack[] stacks = (ItemStack[])collectStacks(crafting).toArray(ClassTag$.MODULE$.apply(ItemStack.class));
/* 14 */     return (stacks.length == 2 && Predef$.MODULE$.refArrayOps((Object[])stacks).exists((Function1)new LootDiskCyclingRecipe$$anonfun$matches$1(this)) && Predef$.MODULE$.refArrayOps((Object[])stacks).exists((Function1)new LootDiskCyclingRecipe$$anonfun$matches$2(this))); } public final class LootDiskCyclingRecipe$$anonfun$matches$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return Loot$.MODULE$.isLootDisk(stack); } public LootDiskCyclingRecipe$$anonfun$matches$1(LootDiskCyclingRecipe $outer) {} } public final class LootDiskCyclingRecipe$$anonfun$matches$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return Wrench$.MODULE$.isWrench(stack); }
/*    */     
/*    */     public LootDiskCyclingRecipe$$anonfun$matches$2(LootDiskCyclingRecipe $outer) {} }
/*    */   
/* 18 */   public ItemStack func_77572_b(InventoryCrafting crafting) { ArrayBuffer lootDiskStacks = Loot$.MODULE$.disksForCycling();
/* 19 */     Option option = collectStacks(crafting).find((Function1)new LootDiskCyclingRecipe$$anonfun$1(this));
/* 20 */     if (option instanceof Some) { Some some = (Some)option; ItemStack lootDisk = (ItemStack)some.x(); if (lootDiskStacks.nonEmpty())
/* 21 */       { String lootFactoryName = getLootFactoryName(lootDisk);
/* 22 */         int oldIndex = lootDiskStacks.indexWhere((Function1)new LootDiskCyclingRecipe$$anonfun$2(this, lootFactoryName));
/* 23 */         int newIndex = (oldIndex + 1) % lootDiskStacks.length();
/* 24 */         return ((ItemStack)lootDiskStacks.apply(newIndex)).func_77946_l(); }  }
/* 25 */      return null; }
/*    */   public final class LootDiskCyclingRecipe$$anonfun$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) {
/*    */       return Loot$.MODULE$.isLootDisk(stack);
/* 29 */     } public LootDiskCyclingRecipe$$anonfun$1(LootDiskCyclingRecipe $outer) {} } public String getLootFactoryName(ItemStack stack) { return stack.func_77978_p().func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("lootFactory").toString()); }
/*    */   public final class LootDiskCyclingRecipe$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/* 31 */     public static final long serialVersionUID = 0L; private final String lootFactoryName$1; public final boolean apply(ItemStack s) { String str = this.lootFactoryName$1; if (this.$outer.getLootFactoryName(s) == null) { this.$outer.getLootFactoryName(s); if (str != null); } else if (this.$outer.getLootFactoryName(s).equals(str)) {  }  } public LootDiskCyclingRecipe$$anonfun$2(LootDiskCyclingRecipe $outer, String lootFactoryName$1) {} } public IndexedSeq<ItemStack> collectStacks(InventoryCrafting crafting) { return (IndexedSeq<ItemStack>)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), crafting.func_70302_i_()).flatMap((Function1)new LootDiskCyclingRecipe$$anonfun$collectStacks$1(this, crafting), IndexedSeq$.MODULE$.canBuildFrom()); } public final class LootDiskCyclingRecipe$$anonfun$collectStacks$1 extends AbstractFunction1<Object, Iterable<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final InventoryCrafting crafting$1; public final Iterable<ItemStack> apply(int i) { return Option$.MODULE$.option2Iterable(Option$.MODULE$.apply(this.crafting$1.func_70301_a(i))); }
/*    */      public LootDiskCyclingRecipe$$anonfun$collectStacks$1(LootDiskCyclingRecipe $outer, InventoryCrafting crafting$1) {} } public int func_77570_a() {
/* 33 */     return 2;
/*    */   } public ItemStack func_77571_b() {
/* 35 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\LootDiskCyclingRecipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */