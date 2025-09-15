/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import com.typesafe.config.Config;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.ObjectRef;
/*    */ 
/*    */ public final class RecipeHandler$ {
/*    */   public static final RecipeHandler$ MODULE$;
/*    */   
/* 18 */   public void init() { li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("shaped", (Function2)new RecipeHandler$$anonfun$init$1());
/* 19 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("shapeless", (Function2)new RecipeHandler$$anonfun$init$2());
/* 20 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("furnace", (Function2)new RecipeHandler$$anonfun$init$3()); } public final class RecipeHandler$$anonfun$init$1 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addShapedRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$2 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addShapelessRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$3 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addFurnaceRecipe(output, recipe); } }
/*    */   
/*    */   public final class RecipeHandler$$anonfun$1 extends AbstractFunction1<Object, Buffer<Object>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final Buffer<Object> apply(Object x0$1) { Object object = x0$1; if (object instanceof List) { List list = (List)object; return (Buffer)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(list).map((Function1)new RecipeHandler$$anonfun$1$$anonfun$apply$1(this), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()); }  (new String[2])[0] = "Invalid row entry for shaped recipe (not a list: "; (new String[2])[1] = ")."; throw new Recipes.RecipeException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { object }))); } public final class RecipeHandler$$anonfun$1$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Object entry) { return li.cil.oc.common.recipe.Recipes$.MODULE$.parseIngredient(entry); } public RecipeHandler$$anonfun$1$$anonfun$apply$1(RecipeHandler$$anonfun$1 $outer) {} }
/* 24 */   } public void addShapedRecipe(ItemStack output, Config recipe) { Buffer rows = (Buffer)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(recipe.getList("input").unwrapped()).map((Function1)new RecipeHandler$$anonfun$1(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom());
/*    */ 
/*    */ 
/*    */     
/* 28 */     output.field_77994_a = li.cil.oc.common.recipe.Recipes$.MODULE$.tryGetCount(recipe);
/*    */     
/* 30 */     IntRef number = IntRef.create(-1);
/* 31 */     ObjectRef shape = ObjectRef.create(scala.collection.mutable.ArrayBuffer$.MODULE$.empty());
/* 32 */     ArrayBuffer input = (ArrayBuffer)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/* 33 */     rows.foreach((Function1)new RecipeHandler$$anonfun$addShapedRecipe$1(number, shape, input));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     if (input.nonEmpty() && output.field_77994_a > 0)
/* 47 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapedOreRecipe(output, (Seq)((ArrayBuffer)shape.elem).$plus$plus((GenTraversableOnce)input, scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())));  }
/*    */   public final class RecipeHandler$$anonfun$addShapedRecipe$1 extends AbstractFunction1<Buffer<Object>, ArrayBuffer<Object>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     public final IntRef number$1; private final ObjectRef shape$1; private final ArrayBuffer input$1; public RecipeHandler$$anonfun$addShapedRecipe$1(IntRef number$1, ObjectRef shape$1, ArrayBuffer input$1) {} public final ArrayBuffer<Object> apply(Buffer row) { Tuple2 tuple2 = (Tuple2)row.foldLeft(new Tuple2(new StringBuilder(), scala.package$.MODULE$.Iterable().empty()), (Function2)new RecipeHandler$$anonfun$addShapedRecipe$1$$anonfun$2(this)); if (tuple2 != null) { StringBuilder pattern = (StringBuilder)tuple2._1(); Iterable ingredients = (Iterable)tuple2._2(); Tuple2 tuple22 = new Tuple2(pattern, ingredients), tuple21 = tuple22; StringBuilder stringBuilder1 = (StringBuilder)tuple21._1(); Iterable iterable1 = (Iterable)tuple21._2(); ((ArrayBuffer)this.shape$1.elem).$plus$eq(stringBuilder1.toString()); return this.input$1.$plus$plus$eq((TraversableOnce)iterable1); }  throw new MatchError(tuple2); } public final class RecipeHandler$$anonfun$addShapedRecipe$1$$anonfun$2 extends AbstractFunction2<Tuple2<StringBuilder, Iterable<Object>>, Object, Tuple2<StringBuilder, Iterable<Object>>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public RecipeHandler$$anonfun$addShapedRecipe$1$$anonfun$2(RecipeHandler$$anonfun$addShapedRecipe$1 $outer) {} public final Tuple2<StringBuilder, Iterable<Object>> apply(Tuple2 acc, Object ingredient) { Tuple2 tuple2 = acc; if (tuple2 != null) { boolean bool; Tuple2<StringBuilder, Iterable<Object>> tuple23; StringBuilder pattern = (StringBuilder)tuple2._1(); Iterable ingredients = (Iterable)tuple2._2(); Tuple2 tuple22 = new Tuple2(pattern, ingredients), tuple21 = tuple22; StringBuilder stringBuilder1 = (StringBuilder)tuple21._1(); Iterable iterable1 = (Iterable)tuple21._2(); Object object = ingredient; if (object instanceof ItemStack) { bool = true; } else if (object instanceof String) { bool = true; } else { bool = false; }  if (bool) { this.$outer.number$1.elem++; tuple23 = new Tuple2(stringBuilder1.append((char)(97 + this.$outer.number$1.elem)), iterable1.$plus$plus((GenTraversableOnce)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { BoxesRunTime.boxToCharacter((char)(97 + this.$outer.number$1.elem)), ingredient }, )), scala.collection.Iterable$.MODULE$.canBuildFrom())); } else { tuple23 = new Tuple2(stringBuilder1.append(' '), iterable1); }  return tuple23; }
/* 52 */          throw new MatchError(tuple2); } } } public void addShapelessRecipe(ItemStack output, Config recipe) { Seq seq1; Object object = recipe.getValue("input").unwrapped();
/* 53 */     if (object instanceof List) { List list = (List)object; seq1 = (Seq)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(list).map((Function1)new RecipeHandler$$anonfun$3(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()); }
/* 54 */     else { seq1 = (Seq)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { li.cil.oc.common.recipe.Recipes$.MODULE$.parseIngredient(object) })); }
/*    */      Seq input = seq1;
/* 56 */     output.field_77994_a = li.cil.oc.common.recipe.Recipes$.MODULE$.tryGetCount(recipe);
/*    */     
/* 58 */     if (input.nonEmpty() && output.field_77994_a > 0)
/* 59 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(output, input));  }
/*    */    public final class RecipeHandler$$anonfun$3 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final Object apply(Object entry) {
/*    */       return li.cil.oc.common.recipe.Recipes$.MODULE$.parseIngredient(entry);
/*    */     } }
/* 64 */   public void addFurnaceRecipe(ItemStack output, Config recipe) { Object input = li.cil.oc.common.recipe.Recipes$.MODULE$.parseIngredient(recipe.getValue("input").unwrapped());
/* 65 */     output.field_77994_a = li.cil.oc.common.recipe.Recipes$.MODULE$.tryGetCount(recipe);
/*    */     
/* 67 */     Object object1 = input;
/* 68 */     if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1;
/* 69 */       FurnaceRecipes.func_77602_a().func_151394_a(itemStack, output, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 70 */     else if (object1 instanceof String) { String str = (String)object1;
/* 71 */       scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(OreDictionary.getOres(str)).foreach((Function1)new RecipeHandler$$anonfun$addFurnaceRecipe$1(output)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     else
/*    */     
/* 74 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */      } public final class RecipeHandler$$anonfun$addFurnaceRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final ItemStack output$1; public RecipeHandler$$anonfun$addFurnaceRecipe$1(ItemStack output$1) {} public final void apply(ItemStack stack) { FurnaceRecipes.func_77602_a().func_151394_a(stack, this.output$1, 0.0F); } }
/* 77 */   private RecipeHandler$() { MODULE$ = this; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\RecipeHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */