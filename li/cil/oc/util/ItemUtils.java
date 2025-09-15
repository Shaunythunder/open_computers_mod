/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import net.minecraft.item.crafting.ShapedRecipes;
/*     */ import net.minecraft.item.crafting.ShapelessRecipes;
/*     */ import net.minecraftforge.oredict.ShapedOreRecipe;
/*     */ import net.minecraftforge.oredict.ShapelessOreRecipe;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.Buffer$;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001M<Q!\001\002\t\002-\t\021\"\023;f[V#\030\016\\:\013\005\r!\021\001B;uS2T!!\002\004\002\005=\034'BA\004\t\003\r\031\027\016\034\006\002\023\005\021A.[\002\001!\taQ\"D\001\003\r\025q!\001#\001\020\005%IE/Z7Vi&d7o\005\002\016!A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032DQaF\007\005\002a\ta\001P5oSRtD#A\006\t\013iiA\021A\016\002\021\r\f7/\032+jKJ$\"\001H\020\021\005Ei\022B\001\020\023\005\rIe\016\036\005\006Ae\001\r!I\001\006gR\f7m\033\t\003E%j\021a\t\006\003I\025\nA!\033;f[*\021aeJ\001\n[&tWm\031:bMRT\021\001K\001\004]\026$\030B\001\026$\005%IE/Z7Ti\006\0347\016C\003-\033\021\005Q&\001\fdCN,g*Y7f/&$\b\016V5feN+hMZ5y)\rqcG\020\t\003_Qj\021\001\r\006\003cI\nA\001\\1oO*\t1'\001\003kCZ\f\027BA\0331\005\031\031FO]5oO\")qg\013a\001q\005!a.Y7f!\tIDH\004\002\022u%\0211HE\001\007!J,G-\0324\n\005Uj$BA\036\023\021\025y4\0061\001\035\003\021!\030.\032:\t\013\005kA\021\001\"\002\035\035,G/\0238he\026$\027.\0328ugR\0211I\022\t\004#\021\013\023BA#\023\005\025\t%O]1z\021\025\001\003\t1\001\"\021!AU\002#b\001\n\023I\025a\001:oOV\t!\n\005\002L\0336\tAJ\003\002\004e%\021a\n\024\002\007%\006tGm\\7\t\021Ak\001\022!Q!\n)\013AA\0358hA!)!+\004C\005'\006)\"/Z:pYZ,wJ]3ES\016$XI\034;sS\026\034XC\001+k)\t)6\fE\002W3\006j\021a\026\006\0031J\t!bY8mY\026\034G/[8o\023\tQvK\001\005Ji\026\024\030M\0317f\021\025a\026\0131\001^\003\035)g\016\036:jKN\0042A\0304i\035\tyFM\004\002aG6\t\021M\003\002c\025\0051AH]8pizJ\021aE\005\003KJ\tq\001]1dW\006<W-\003\002[O*\021QM\005\t\003S*d\001\001B\003l#\n\007ANA\001U#\ti\007\017\005\002\022]&\021qN\005\002\b\035>$\b.\0338h!\t\t\022/\003\002s%\t\031\021I\\=")
/*     */ public final class ItemUtils
/*     */ {
/*     */   public static ItemStack[] getIngredients(ItemStack paramItemStack) {
/*     */     return ItemUtils$.MODULE$.getIngredients(paramItemStack);
/*     */   }
/*     */   
/*     */   public static String caseNameWithTierSuffix(String paramString, int paramInt) {
/*     */     return ItemUtils$.MODULE$.caseNameWithTierSuffix(paramString, paramInt);
/*     */   }
/*     */   
/*     */   public static int caseTier(ItemStack paramItemStack) {
/*     */     return ItemUtils$.MODULE$.caseTier(paramItemStack);
/*     */   }
/*     */   
/*     */   public final class ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$getFilteredInputs$1$1
/*     */     extends AbstractFunction1<ItemStack, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final int outputSize$1;
/*     */     
/*     */     public ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$getFilteredInputs$1$1(int outputSize$1) {}
/*     */     
/*     */     public final boolean apply(ItemStack input) {
/*  52 */       if (input != null && 
/*  53 */         input.func_77973_b() != null && 
/*  54 */         input.field_77994_a / this.outputSize$1 > 0)
/*     */       {
/*     */ 
/*     */         
/*  58 */         if (!(input.func_77973_b() instanceof net.minecraft.item.ItemBucket));
/*     */       }
/*     */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ItemUtils$$anonfun$3 extends AbstractFunction1<Object, IRecipe> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*  66 */     public final IRecipe apply(Object x$1) { return (IRecipe)x$1; } } public final class ItemUtils$$anonfun$4 extends AbstractFunction1<IRecipe, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1;
/*  67 */     public final boolean apply(IRecipe recipe) { return (recipe.func_77571_b() != null && recipe.func_77571_b().func_77969_a(this.stack$1)); } public ItemUtils$$anonfun$4(ItemStack stack$1) {} } public final class ItemUtils$$anonfun$1 extends AbstractPartialFunction<IRecipe, Tuple2<ItemStack[], Object>> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends IRecipe, B1> B1 applyOrElse(IRecipe x1, Function1 default) { Object object; IRecipe iRecipe = x1;
/*  68 */       if (iRecipe instanceof ShapedRecipes) { ShapedRecipes shapedRecipes = (ShapedRecipes)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1(Predef$.MODULE$.refArrayOps((Object[])shapedRecipes.field_77574_d).toIterable(), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapedRecipes)); }
/*  69 */       else if (iRecipe instanceof ShapelessRecipes) { ShapelessRecipes shapelessRecipes = (ShapelessRecipes)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1((Iterable)WrapAsScala$.MODULE$.asScalaBuffer(shapelessRecipes.field_77579_b).map((Function1)new ItemUtils$$anonfun$1$$anonfun$applyOrElse$1(this), Buffer$.MODULE$.canBuildFrom()), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapelessRecipes)); }
/*  70 */       else if (iRecipe instanceof ShapedOreRecipe) { ShapedOreRecipe shapedOreRecipe = (ShapedOreRecipe)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1(ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$resolveOreDictEntries((Iterable<?>)Predef$.MODULE$.wrapRefArray(shapedOreRecipe.getInput())), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapedOreRecipe)); }
/*  71 */       else if (iRecipe instanceof ShapelessOreRecipe) { ShapelessOreRecipe shapelessOreRecipe = (ShapelessOreRecipe)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1(ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$resolveOreDictEntries((Iterable<?>)WrapAsScala$.MODULE$.asScalaBuffer(shapelessOreRecipe.getInput())), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapelessOreRecipe)); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(IRecipe x1) { boolean bool; IRecipe iRecipe = x1; if (iRecipe instanceof ShapedRecipes) { bool = true; } else if (iRecipe instanceof ShapelessRecipes) { bool = true; } else if (iRecipe instanceof ShapedOreRecipe) { bool = true; } else if (iRecipe instanceof ShapelessOreRecipe) { bool = true; } else { bool = false; }  return bool; } public final class ItemUtils$$anonfun$1$$anonfun$applyOrElse$1 extends AbstractFunction1<Object, ItemStack> implements Serializable {
/*  72 */       public static final long serialVersionUID = 0L; public final ItemStack apply(Object x$2) { return (ItemStack)x$2; } public ItemUtils$$anonfun$1$$anonfun$applyOrElse$1(ItemUtils$$anonfun$1 $outer) {} } } public final class ItemUtils$$anonfun$2 extends AbstractPartialFunction<Tuple2<ItemStack[], Object>, Tuple2<ItemStack[], Object>> implements Serializable { public final <A1 extends Tuple2<ItemStack[], Object>, B1> B1 applyOrElse(Tuple2 x3, Function1 default) { Object object; Tuple2 tuple2 = x3;
/*  73 */       ItemStack[] inputs = (ItemStack[])tuple2._1(); int outputSize = tuple2._2$mcI$sp(); if (tuple2 != null && !Predef$.MODULE$.refArrayOps((Object[])inputs).exists((Function1)new ItemUtils$$anonfun$2$$anonfun$applyOrElse$2(this))) { object = new Tuple2(inputs, BoxesRunTime.boxToInteger(outputSize)); } else { object = default.apply(x3); }  return (B1)object; } public static final long serialVersionUID = 0L; public final boolean isDefinedAt(Tuple2 x3) { boolean bool; Tuple2 tuple2 = x3; ItemStack[] inputs = (ItemStack[])tuple2._1(); if (tuple2 != null && !Predef$.MODULE$.refArrayOps((Object[])inputs).exists((Function1)new ItemUtils$$anonfun$2$$anonfun$isDefinedAt$1(this))) { bool = true; } else { bool = false; }  return bool; } public final class ItemUtils$$anonfun$2$$anonfun$applyOrElse$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$isInputBlacklisted$1(stack); } public ItemUtils$$anonfun$2$$anonfun$applyOrElse$2(ItemUtils$$anonfun$2 $outer) {} } public final class ItemUtils$$anonfun$2$$anonfun$isDefinedAt$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$isInputBlacklisted$1(stack); }
/*     */       
/*     */       public ItemUtils$$anonfun$2$$anonfun$isDefinedAt$1(ItemUtils$$anonfun$2 $outer) {} } }
/*     */   public final class ItemUtils$$anonfun$getIngredients$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ItemStack stack$1;
/*     */     
/*     */     public final boolean apply(ItemStack ingredient) {
/*  80 */       return ingredient.func_77969_a(this.stack$1);
/*     */     }
/*     */     public ItemUtils$$anonfun$getIngredients$1(ItemStack stack$1) {} }
/*     */   public final class ItemUtils$$anonfun$getIngredients$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ArrayBuffer merged$1;
/*     */     public ItemUtils$$anonfun$getIngredients$2(ArrayBuffer merged$1) {}
/*     */     public final Object apply(ItemStack ingredient) { ArrayBuffer arrayBuffer;
/*  86 */       Option option = this.merged$1.find((Function1)new ItemUtils$$anonfun$getIngredients$2$$anonfun$5(this, ingredient));
/*  87 */       if (option instanceof Some) { Some some = (Some)option; ItemStack entry = (ItemStack)some.x(); entry.field_77994_a += ingredient.field_77994_a; BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  88 */       else { arrayBuffer = this.merged$1.$plus$eq(ingredient.func_77946_l()); }
/*     */        return arrayBuffer; } public final class ItemUtils$$anonfun$getIngredients$2$$anonfun$5 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final ItemStack ingredient$1; public final boolean apply(ItemStack x$4) { return x$4.func_77969_a(this.ingredient$1); } public ItemUtils$$anonfun$getIngredients$2$$anonfun$5(ItemUtils$$anonfun$getIngredients$2 $outer, ItemStack ingredient$1) {} } } public final class ItemUtils$$anonfun$getIngredients$3 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final int count$1;
/*  91 */     public final void apply(ItemStack x$5) { x$5.field_77994_a /= this.count$1; }
/*     */      public ItemUtils$$anonfun$getIngredients$3(int count$1) {} }
/*     */   public final class ItemUtils$$anonfun$getIngredients$4 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayBuffer distinct$1;
/*     */     public ItemUtils$$anonfun$getIngredients$4(ArrayBuffer distinct$1) {}
/*  95 */     public final void apply(ItemStack ingredient) { int size = RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(ingredient.field_77994_a), 1);
/*  96 */       ingredient.field_77994_a = 1; RichInt$.MODULE$
/*  97 */         .until$extension0(Predef$.MODULE$.intWrapper(0), size).foreach((Function1)new ItemUtils$$anonfun$getIngredients$4$$anonfun$apply$1(this, ingredient)); } public final class ItemUtils$$anonfun$getIngredients$4$$anonfun$apply$1 extends AbstractFunction1<Object, ArrayBuffer<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack ingredient$2; public ItemUtils$$anonfun$getIngredients$4$$anonfun$apply$1(ItemUtils$$anonfun$getIngredients$4 $outer, ItemStack ingredient$2) {} public final ArrayBuffer<ItemStack> apply(int i) {
/*  98 */         return this.$outer.distinct$1.$plus$eq(this.ingredient$2.func_77946_l());
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$resolveOreDictEntries$1
/*     */     extends AbstractPartialFunction<T, ItemStack>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final <A1 extends T, B1> B1 applyOrElse(Object x2, Function1 default)
/*     */     {
/* 111 */       Object object2, object1 = x2;
/* 112 */       if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1; }
/* 113 */       else { if (object1 instanceof ArrayList) { ArrayList<Object> arrayList = (ArrayList)object1; if (!arrayList.isEmpty()) return (B1)arrayList.get(ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$rng().nextInt(arrayList.size()));  }  object2 = default.apply(x2); }  return (B1)object2; } public final boolean isDefinedAt(Object x2) { boolean bool; Object object = x2; if (object instanceof ItemStack) { bool = true; } else { if (object instanceof ArrayList) { ArrayList arrayList = (ArrayList)object; if (!arrayList.isEmpty())
/*     */             return true;  }
/*     */         
/*     */         bool = false; }
/*     */       
/*     */       return bool; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ItemUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */