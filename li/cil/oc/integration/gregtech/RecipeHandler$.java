/*     */ package li.cil.oc.integration.gregtech;
/*     */ 
/*     */ import com.typesafe.config.Config;
/*     */ import gregtech.api.util.GTRecipeBuilder;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.fluids.FluidStack;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.Tuple7;
/*     */ import scala.collection.Iterable;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class RecipeHandler$ {
/*     */   public static final RecipeHandler$ MODULE$;
/*     */   
/*  17 */   public void init() { li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_alloySmelter", (Function2)new RecipeHandler$$anonfun$init$1());
/*  18 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_assembler", (Function2)new RecipeHandler$$anonfun$init$2());
/*  19 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_bender", (Function2)new RecipeHandler$$anonfun$init$3());
/*  20 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_canner", (Function2)new RecipeHandler$$anonfun$init$4());
/*  21 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_chemical", (Function2)new RecipeHandler$$anonfun$init$5());
/*  22 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_cutter", (Function2)new RecipeHandler$$anonfun$init$6());
/*  23 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_fluidCanner", (Function2)new RecipeHandler$$anonfun$init$7());
/*  24 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_formingPress", (Function2)new RecipeHandler$$anonfun$init$8());
/*  25 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_lathe", (Function2)new RecipeHandler$$anonfun$init$9());
/*  26 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_laserEngraver", (Function2)new RecipeHandler$$anonfun$init$10());
/*  27 */     li.cil.oc.common.recipe.Recipes$.MODULE$.registerRecipeHandler("gt_wiremill", (Function2)new RecipeHandler$$anonfun$init$11()); } public final class RecipeHandler$$anonfun$init$1 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTAlloySmelterRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$2 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTAssemblingMachineRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$3 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTBenderRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$4 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTCannerRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$5 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTChemicalRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$6 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTCutterRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$7 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTFluidCannerRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$8 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTFormingPressRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$9 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTLatheRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$10 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTLaserEngraverRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$11 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTWireMillRecipe(output, recipe); }
/*     */     
/*     */     public static final long serialVersionUID = 0L; }
/*     */   public void addGTAlloySmelterRecipe(ItemStack output, Config recipe) {
/*  31 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option secondaryInputs = (Option)tuple7._2(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple4 tuple42 = new Tuple4(primaryInputs, secondaryInputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple41 = tuple42; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple41._1(); Option option1 = (Option)tuple41._2(); int i = BoxesRunTime.unboxToInt(tuple41._3()), j = BoxesRunTime.unboxToInt(tuple41._4());
/*  32 */       Option option2 = option1;
/*  33 */       if (option2 instanceof Some) { Some some = (Some)option2; ItemStack[] value = (ItemStack[])some.x();
/*  34 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1(output, i, j, value)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */          }
/*     */       
/*     */       else
/*     */       
/*  39 */       { scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTAlloySmelterRecipe$2(output, i, j)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return; }  throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ItemStack output$1; public final int eu$1; public final int duration$1; private final ItemStack[] value$1; public final void apply(ItemStack primaryInput) { scala.Predef$.MODULE$.refArrayOps((Object[])this.value$1).foreach((Function1)new RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1$$anonfun$apply$1(this, primaryInput)); } public RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1(ItemStack output$1, int eu$1, int duration$1, ItemStack[] value$1) {} public final class RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1$$anonfun$apply$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable {
/*  41 */       public static final long serialVersionUID = 0L; private final ItemStack primaryInput$1; public RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1$$anonfun$apply$1(RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1 $outer, ItemStack primaryInput$1) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) { return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$1, secondaryInput }).itemOutputs(new ItemStack[] { this.$outer.output$1 }).duration(this.$outer.duration$1).eut(this.$outer.eu$1).addTo((IRecipeMap)RecipeMaps.alloySmelterRecipes); } } } public final class RecipeHandler$$anonfun$addGTAlloySmelterRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$1; private final int eu$1; private final int duration$1; public RecipeHandler$$anonfun$addGTAlloySmelterRecipe$2(ItemStack output$1, int eu$1, int duration$1) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput }).itemOutputs(new ItemStack[] { this.output$1 }).duration(this.duration$1).eut(this.eu$1).addTo((IRecipeMap)RecipeMaps.alloySmelterRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTAssemblingMachineRecipe(ItemStack output, Config recipe)
/*     */   {
/*  47 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option secondaryInputs = (Option)tuple7._2(), fluidInput = (Option)tuple7._3(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple5 tuple52 = new Tuple5(primaryInputs, secondaryInputs, fluidInput, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple51 = tuple52; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple51._1(); Option option1 = (Option)tuple51._2(), option2 = (Option)tuple51._3(); int i = BoxesRunTime.unboxToInt(tuple51._4()), j = BoxesRunTime.unboxToInt(tuple51._5());
/*  48 */       Option option3 = option1;
/*  49 */       if (option3 instanceof Some) { Some some = (Some)option3; ItemStack[] value = (ItemStack[])some.x();
/*  50 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1(output, option2, i, j, value)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */ 
/*     */         
/*     */          }
/*     */       
/*     */       else
/*     */       
/*     */       { 
/*     */ 
/*     */         
/*  60 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$2(output, option2, i, j)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return; }  throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack output$2; public final Option fluidInput$1; public final int eu$2; public final int duration$2; private final ItemStack[] value$2; public final void apply(ItemStack primaryInput) { scala.Predef$.MODULE$.refArrayOps((Object[])this.value$2).foreach((Function1)new RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1$$anonfun$apply$2(this, primaryInput)); } public RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1(ItemStack output$2, Option fluidInput$1, int eu$2, int duration$2, ItemStack[] value$2) {} public final class RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1$$anonfun$apply$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable {
/*  61 */       public static final long serialVersionUID = 0L; private final ItemStack primaryInput$2; public RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1$$anonfun$apply$2(RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1 $outer, ItemStack primaryInput$2) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$2, secondaryInput }); Option option = this.$outer.fluidInput$1; if (option instanceof Some) { Some some = (Some)option; FluidStack fluidStack = (FluidStack)some.x(); recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return recipe.itemOutputs(new ItemStack[] { this.$outer.output$2 }).duration(this.$outer.duration$2).eut(this.$outer.eu$2).addTo((IRecipeMap)RecipeMaps.assemblerRecipes); } } } public final class RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$2; private final Option fluidInput$1; private final int eu$2; private final int duration$2; public RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$2(ItemStack output$2, Option fluidInput$1, int eu$2, int duration$2) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/*  62 */       Option option = this.fluidInput$1;
/*  63 */       if (option instanceof Some) { Some some = (Some)option; FluidStack fluidStack = (FluidStack)some.x();
/*  64 */         recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  65 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*  67 */       return recipe.itemOutputs(new ItemStack[] { this.output$2 }).duration(this.duration$2).eut(this.eu$2).addTo((IRecipeMap)RecipeMaps.assemblerRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTBenderRecipe(ItemStack output, Config recipe)
/*     */   {
/*  73 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple3 tuple32 = new Tuple3(primaryInputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple31 = tuple32; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple31._1(); int i = BoxesRunTime.unboxToInt(tuple31._2()), j = BoxesRunTime.unboxToInt(tuple31._3());
/*  74 */       scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTBenderRecipe$1(output, i, j)); return; }
/*     */     
/*  76 */     throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTBenderRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$3; private final int eu$3; private final int duration$3; public RecipeHandler$$anonfun$addGTBenderRecipe$1(ItemStack output$3, int eu$3, int duration$3) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput }).itemOutputs(new ItemStack[] { this.output$3 }).duration(this.duration$3).eut(this.eu$3).addTo((IRecipeMap)RecipeMaps.benderRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTCannerRecipe(ItemStack output, Config recipe) {
/*  81 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option secondaryInputs = (Option)tuple7._2(); Iterable secondaryOutputs = (Iterable)tuple7._5(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple5 tuple52 = new Tuple5(primaryInputs, secondaryInputs, secondaryOutputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple51 = tuple52; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple51._1(); Option option1 = (Option)tuple51._2(); Iterable iterable1 = (Iterable)tuple51._3(); int i = BoxesRunTime.unboxToInt(tuple51._4()), j = BoxesRunTime.unboxToInt(tuple51._5());
/*  82 */       Option secondaryOutput = iterable1.headOption();
/*  83 */       Option option2 = option1;
/*  84 */       if (option2 instanceof Some) { Some some = (Some)option2; ItemStack[] value = (ItemStack[])some.x();
/*  85 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTCannerRecipe$1(output, i, j, secondaryOutput, value)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */ 
/*     */         
/*     */          }
/*     */       
/*     */       else
/*     */       
/*     */       { 
/*     */ 
/*     */         
/*  95 */         if (scala.None$.MODULE$.equals(option2))
/*  96 */         { scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTCannerRecipe$2(output, i, j, secondaryOutput)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(option2); }  return; }  throw new MatchError(tuple7);
/*  97 */   } public final class RecipeHandler$$anonfun$addGTCannerRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack output$4; public final int eu$4; public final int duration$4; public final Option secondaryOutput$1; private final ItemStack[] value$3; public final void apply(ItemStack primaryInput) { scala.Predef$.MODULE$.refArrayOps((Object[])this.value$3).foreach((Function1)new RecipeHandler$$anonfun$addGTCannerRecipe$1$$anonfun$apply$3(this, primaryInput)); } public RecipeHandler$$anonfun$addGTCannerRecipe$1(ItemStack output$4, int eu$4, int duration$4, Option secondaryOutput$1, ItemStack[] value$3) {} public final class RecipeHandler$$anonfun$addGTCannerRecipe$1$$anonfun$apply$3 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack primaryInput$3; public RecipeHandler$$anonfun$addGTCannerRecipe$1$$anonfun$apply$3(RecipeHandler$$anonfun$addGTCannerRecipe$1 $outer, ItemStack primaryInput$3) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$3, secondaryInput }); Option option = this.$outer.secondaryOutput$1; if (option instanceof Some) { Some some = (Some)option; ItemStack itemStack = (ItemStack)some.x(); recipe = recipe.itemOutputs(new ItemStack[] { this.$outer.output$4, itemStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { recipe = recipe.itemOutputs(new ItemStack[] { this.$outer.output$4 }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return recipe.duration(this.$outer.duration$4).eut(this.$outer.eu$4).addTo((IRecipeMap)RecipeMaps.cannerRecipes); } } } public final class RecipeHandler$$anonfun$addGTCannerRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$4; private final int eu$4; private final int duration$4; private final Option secondaryOutput$1; public RecipeHandler$$anonfun$addGTCannerRecipe$2(ItemStack output$4, int eu$4, int duration$4, Option secondaryOutput$1) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/*  98 */       Option option = this.secondaryOutput$1;
/*  99 */       if (option instanceof Some) { Some some = (Some)option; ItemStack itemStack = (ItemStack)some.x();
/* 100 */         recipe = recipe.itemOutputs(new ItemStack[] { this.output$4, itemStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 102 */       { recipe = recipe.itemOutputs(new ItemStack[] { this.output$4 }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 104 */       return recipe.duration(this.duration$4).eut(this.eu$4).addTo((IRecipeMap)RecipeMaps.cannerRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTChemicalRecipe(ItemStack output, Config recipe)
/*     */   {
/* 110 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option secondaryInputs = (Option)tuple7._2(), fluidInput = (Option)tuple7._3(), fluidOutput = (Option)tuple7._4(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple6 tuple62 = new Tuple6(primaryInputs, secondaryInputs, fluidInput, fluidOutput, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple61 = tuple62; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple61._1(); Option option1 = (Option)tuple61._2(), option2 = (Option)tuple61._3(), option3 = (Option)tuple61._4(); int i = BoxesRunTime.unboxToInt(tuple61._5()), j = BoxesRunTime.unboxToInt(tuple61._6());
/* 111 */       Option option4 = option1;
/* 112 */       if (option4 instanceof Some) { Some some = (Some)option4; ItemStack[] value = (ItemStack[])some.x();
/* 113 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTChemicalRecipe$1(output, option2, option3, i, j, value)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */          }
/*     */       
/*     */       else
/*     */       
/*     */       { 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 128 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTChemicalRecipe$2(output, option2, option3, i, j)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return; }  throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTChemicalRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack output$5; public final Option fluidInput$2; public final Option fluidOutput$1; public final int eu$5; public final int duration$5; private final ItemStack[] value$4; public final void apply(ItemStack primaryInput) { scala.Predef$.MODULE$.refArrayOps((Object[])this.value$4).foreach((Function1)new RecipeHandler$$anonfun$addGTChemicalRecipe$1$$anonfun$apply$4(this, primaryInput)); } public RecipeHandler$$anonfun$addGTChemicalRecipe$1(ItemStack output$5, Option fluidInput$2, Option fluidOutput$1, int eu$5, int duration$5, ItemStack[] value$4) {} public final class RecipeHandler$$anonfun$addGTChemicalRecipe$1$$anonfun$apply$4 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable {
/* 129 */       public static final long serialVersionUID = 0L; private final ItemStack primaryInput$4; public RecipeHandler$$anonfun$addGTChemicalRecipe$1$$anonfun$apply$4(RecipeHandler$$anonfun$addGTChemicalRecipe$1 $outer, ItemStack primaryInput$4) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$4, secondaryInput }); Option option1 = this.$outer.fluidInput$2; if (option1 instanceof Some) { Some some = (Some)option1; FluidStack fluidStack = (FluidStack)some.x(); recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  Option option2 = this.$outer.fluidOutput$1; if (option2 instanceof Some) { Some some = (Some)option2; FluidStack fluidStack = (FluidStack)some.x(); recipe = recipe.fluidOutputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return recipe.itemOutputs(new ItemStack[] { this.$outer.output$5 }).duration(this.$outer.duration$5).eut(this.$outer.eu$5).addTo((IRecipeMap)RecipeMaps.chemicalReactorRecipes); } } } public final class RecipeHandler$$anonfun$addGTChemicalRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$5; private final Option fluidInput$2; private final Option fluidOutput$1; private final int eu$5; private final int duration$5; public RecipeHandler$$anonfun$addGTChemicalRecipe$2(ItemStack output$5, Option fluidInput$2, Option fluidOutput$1, int eu$5, int duration$5) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/* 130 */       Option option1 = this.fluidInput$2;
/* 131 */       if (option1 instanceof Some) { Some some = (Some)option1; FluidStack fluidStack = (FluidStack)some.x();
/* 132 */         recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 133 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 135 */       Option option2 = this.fluidOutput$1;
/* 136 */       if (option2 instanceof Some) { Some some = (Some)option2; FluidStack fluidStack = (FluidStack)some.x();
/* 137 */         recipe = recipe.fluidOutputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 138 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 140 */       return recipe.itemOutputs(new ItemStack[] { this.output$5 }).duration(this.duration$5).eut(this.eu$5).addTo((IRecipeMap)RecipeMaps.chemicalReactorRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTCutterRecipe(ItemStack output, Config recipe)
/*     */   {
/* 146 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option fluidInput = (Option)tuple7._3(); Iterable secondaryOutputs = (Iterable)tuple7._5(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple5 tuple52 = new Tuple5(primaryInputs, fluidInput, secondaryOutputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple51 = tuple52; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple51._1(); Option option1 = (Option)tuple51._2(); Iterable iterable1 = (Iterable)tuple51._3(); int i = BoxesRunTime.unboxToInt(tuple51._4()), j = BoxesRunTime.unboxToInt(tuple51._5());
/* 147 */       Option secondaryOutput = iterable1.headOption();
/* 148 */       scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTCutterRecipe$1(output, option1, i, j, secondaryOutput)); return; }
/* 149 */      throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTCutterRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$6; private final Option fluidInput$3; private final int eu$6; private final int duration$6; private final Option secondaryOutput$2; public RecipeHandler$$anonfun$addGTCutterRecipe$1(ItemStack output$6, Option fluidInput$3, int eu$6, int duration$6, Option secondaryOutput$2) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/* 150 */       Option option1 = this.fluidInput$3;
/* 151 */       if (option1 instanceof Some) { Some some = (Some)option1; FluidStack fluidStack = (FluidStack)some.x();
/* 152 */         recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 153 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 155 */       Option option2 = this.secondaryOutput$2;
/* 156 */       if (option2 instanceof Some) { Some some = (Some)option2; ItemStack itemStack = (ItemStack)some.x();
/* 157 */         recipe = recipe.itemOutputs(new ItemStack[] { this.output$6, itemStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 159 */       { recipe = recipe.itemOutputs(new ItemStack[] { this.output$6 }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 161 */       return recipe.duration(this.duration$6).eut(this.eu$6).addTo((IRecipeMap)RecipeMaps.cutterRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTFluidCannerRecipe(ItemStack output, Config recipe) {
/* 166 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option fluidInput = (Option)tuple7._3(), fluidOutput = (Option)tuple7._4(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple5 tuple52 = new Tuple5(primaryInputs, fluidInput, fluidOutput, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple51 = tuple52; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple51._1(); Option option1 = (Option)tuple51._2(), option2 = (Option)tuple51._3(); int i = BoxesRunTime.unboxToInt(tuple51._4()), j = BoxesRunTime.unboxToInt(tuple51._5());
/* 167 */       scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTFluidCannerRecipe$1(output, option1, option2, i, j)); return; }
/* 168 */      throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTFluidCannerRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$7; private final Option fluidInput$4; private final Option fluidOutput$2; private final int eu$7; private final int duration$7; public RecipeHandler$$anonfun$addGTFluidCannerRecipe$1(ItemStack output$7, Option fluidInput$4, Option fluidOutput$2, int eu$7, int duration$7) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/* 169 */       Option option1 = this.fluidInput$4;
/* 170 */       if (option1 instanceof Some) { Some some = (Some)option1; FluidStack fluidStack = (FluidStack)some.x();
/* 171 */         recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 172 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 174 */       Option option2 = this.fluidOutput$2;
/* 175 */       if (option2 instanceof Some) { Some some = (Some)option2; FluidStack fluidStack = (FluidStack)some.x();
/* 176 */         recipe = recipe.fluidOutputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 177 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 179 */       return recipe.itemOutputs(new ItemStack[] { this.output$7 }).duration(this.duration$7).eut(this.eu$7).addTo((IRecipeMap)RecipeMaps.fluidCannerRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTFormingPressRecipe(ItemStack output, Config recipe) {
/* 184 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option secondaryInputs = (Option)tuple7._2(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple4 tuple42 = new Tuple4(primaryInputs, secondaryInputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple41 = tuple42; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple41._1(); Option option1 = (Option)tuple41._2(); int i = BoxesRunTime.unboxToInt(tuple41._3()), j = BoxesRunTime.unboxToInt(tuple41._4());
/* 185 */       Option option2 = option1;
/* 186 */       if (option2 instanceof Some) { Some some = (Some)option2; ItemStack[] value = (ItemStack[])some.x();
/* 187 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTFormingPressRecipe$1(output, i, j, value)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */          }
/*     */       
/*     */       else
/*     */       
/* 192 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return; }
/*     */      throw new MatchError(tuple7);
/*     */   } public final class RecipeHandler$$anonfun$addGTFormingPressRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ItemStack output$8; public final int eu$8; public final int duration$8; private final ItemStack[] value$5; public final void apply(ItemStack primaryInput) { scala.Predef$.MODULE$.refArrayOps((Object[])this.value$5).foreach((Function1)new RecipeHandler$$anonfun$addGTFormingPressRecipe$1$$anonfun$apply$5(this, primaryInput)); } public RecipeHandler$$anonfun$addGTFormingPressRecipe$1(ItemStack output$8, int eu$8, int duration$8, ItemStack[] value$5) {} public final class RecipeHandler$$anonfun$addGTFormingPressRecipe$1$$anonfun$apply$5 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final ItemStack primaryInput$5; public RecipeHandler$$anonfun$addGTFormingPressRecipe$1$$anonfun$apply$5(RecipeHandler$$anonfun$addGTFormingPressRecipe$1 $outer, ItemStack primaryInput$5) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) { return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$5, secondaryInput }).itemOutputs(new ItemStack[] { this.$outer.output$8 }).duration(this.$outer.duration$8).eut(this.$outer.eu$8).addTo((IRecipeMap)RecipeMaps.formingPressRecipes); } } }
/* 197 */   public void addGTLatheRecipe(ItemStack output, Config recipe) { Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Iterable secondaryOutputs = (Iterable)tuple7._5(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple4 tuple42 = new Tuple4(primaryInputs, secondaryOutputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple41 = tuple42; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple41._1(); Iterable iterable1 = (Iterable)tuple41._2(); int i = BoxesRunTime.unboxToInt(tuple41._3()), j = BoxesRunTime.unboxToInt(tuple41._4());
/* 198 */       Option secondaryOutput = iterable1.headOption();
/* 199 */       scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTLatheRecipe$1(output, i, j, secondaryOutput)); return; }
/* 200 */      throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTLatheRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$9; private final int eu$9; private final int duration$9; private final Option secondaryOutput$3; public RecipeHandler$$anonfun$addGTLatheRecipe$1(ItemStack output$9, int eu$9, int duration$9, Option secondaryOutput$3) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/* 201 */       Option option = this.secondaryOutput$3;
/* 202 */       if (option instanceof Some) { Some some = (Some)option; ItemStack itemStack = (ItemStack)some.x();
/* 203 */         recipe = recipe.itemOutputs(new ItemStack[] { this.output$9, itemStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 205 */       { recipe = recipe.itemOutputs(new ItemStack[] { this.output$9 }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 207 */       return recipe.duration(this.duration$9).eut(this.eu$9).addTo((IRecipeMap)RecipeMaps.latheRecipes); }
/*     */      }
/*     */ 
/*     */   
/*     */   public void addGTLaserEngraverRecipe(ItemStack output, Config recipe) {
/* 212 */     Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); Option secondaryInputs = (Option)tuple7._2(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple4 tuple42 = new Tuple4(primaryInputs, secondaryInputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple41 = tuple42; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple41._1(); Option option1 = (Option)tuple41._2(); int i = BoxesRunTime.unboxToInt(tuple41._3()), j = BoxesRunTime.unboxToInt(tuple41._4());
/* 213 */       Option option2 = option1;
/* 214 */       if (option2 instanceof Some) { Some some = (Some)option2; ItemStack[] value = (ItemStack[])some.x();
/* 215 */         scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1(output, i, j, value)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*     */       else
/*     */       
/* 219 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  return; }
/*     */      throw new MatchError(tuple7);
/*     */   } public final class RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ItemStack output$10; public final int eu$10; public final int duration$10; private final ItemStack[] value$6; public final void apply(ItemStack primaryInput) { scala.Predef$.MODULE$.refArrayOps((Object[])this.value$6).foreach((Function1)new RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1$$anonfun$apply$6(this, primaryInput)); } public RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1(ItemStack output$10, int eu$10, int duration$10, ItemStack[] value$6) {} public final class RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1$$anonfun$apply$6 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final ItemStack primaryInput$6; public RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1$$anonfun$apply$6(RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1 $outer, ItemStack primaryInput$6) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) { return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$6, secondaryInput }).itemOutputs(new ItemStack[] { this.$outer.output$10 }).duration(this.$outer.duration$10).eut(this.$outer.eu$10).addTo((IRecipeMap)RecipeMaps.laserEngraverRecipes); } } }
/* 224 */   public void addGTWireMillRecipe(ItemStack output, Config recipe) { Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> tuple7 = parseRecipe(output, recipe); if (tuple7 != null) { ItemStack[] primaryInputs = (ItemStack[])tuple7._1(); int eu = BoxesRunTime.unboxToInt(tuple7._6()), duration = BoxesRunTime.unboxToInt(tuple7._7()); Tuple3 tuple32 = new Tuple3(primaryInputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)), tuple31 = tuple32; ItemStack[] arrayOfItemStack1 = (ItemStack[])tuple31._1(); int i = BoxesRunTime.unboxToInt(tuple31._2()), j = BoxesRunTime.unboxToInt(tuple31._3());
/* 225 */       scala.Predef$.MODULE$.refArrayOps((Object[])arrayOfItemStack1).foreach((Function1)new RecipeHandler$$anonfun$addGTWireMillRecipe$1(output, i, j)); return; }
/*     */     
/* 227 */     throw new MatchError(tuple7); } public final class RecipeHandler$$anonfun$addGTWireMillRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$11; private final int eu$11; private final int duration$11; public RecipeHandler$$anonfun$addGTWireMillRecipe$1(ItemStack output$11, int eu$11, int duration$11) {} public final Collection<GTRecipe> apply(ItemStack primaryInput) { return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput }).itemOutputs(new ItemStack[] { this.output$11 }).duration(this.duration$11).eut(this.eu$11).addTo((IRecipeMap)RecipeMaps.wiremillRecipes); } } public final class RecipeHandler$$anonfun$parseRecipe$1 extends AbstractFunction1<List<Integer>, Buffer<Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Buffer<Integer> apply(List l) { return scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(l); }
/*     */   } public final class RecipeHandler$$anonfun$parseRecipe$2 extends AbstractFunction2<ItemStack[], Integer, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack[] stacks, Integer count) { scala.Predef$.MODULE$.refArrayOps((Object[])stacks).foreach((Function1)new RecipeHandler$$anonfun$parseRecipe$2$$anonfun$apply$7(this, count)); } public final class RecipeHandler$$anonfun$parseRecipe$2$$anonfun$apply$7 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Integer count$1; public RecipeHandler$$anonfun$parseRecipe$2$$anonfun$apply$7(RecipeHandler$$anonfun$parseRecipe$2 $outer, Integer count$1) {} public final void apply(ItemStack stack) { if (stack != null && scala.Predef$.MODULE$.Integer2int(this.count$1) > 0) stack.field_77994_a = scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(stack.func_77976_d()), scala.Predef$.MODULE$.Integer2int(this.count$1));  } } }
/*     */   public final class RecipeHandler$$anonfun$2 extends AbstractFunction1<ItemStack[], Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final Option<ItemStack> apply(ItemStack[] x$12) { return scala.Predef$.MODULE$.refArrayOps((Object[])x$12).headOption(); } }
/* 232 */   private Tuple7<ItemStack[], Option<ItemStack[]>, Option<FluidStack>, Option<FluidStack>, Iterable<ItemStack>, Object, Object> parseRecipe(ItemStack output, Config recipe) { Buffer inputs = parseIngredientList(recipe.getValue("input")).toBuffer();
/* 233 */     output.field_77994_a = li.cil.oc.common.recipe.Recipes$.MODULE$.tryGetCount(recipe);
/*     */     
/* 235 */     if (inputs.size() < 1 || inputs.size() > 2) {
/* 236 */       (new String[2])[0] = "Invalid recipe length: "; (new String[2])[1] = ", should be 1 or 2."; throw new Recipes.RecipeException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(inputs.size()) })));
/*     */     } 
/*     */     
/* 239 */     List inputCount = recipe.getIntList("count");
/* 240 */     if (inputCount.size() != inputs.size())
/* 241 */     { (new String[3])[0] = "Mismatched ingredient count: "; (new String[3])[1] = " != "; (new String[3])[2] = "."; throw new Recipes.RecipeException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(inputs.size()), BoxesRunTime.boxToInteger(inputCount.size()) }))); }  scala.runtime.Tuple2Zipped$.MODULE$
/*     */ 
/*     */       
/* 244 */       .foreach$extension(scala.runtime.Tuple2Zipped$Ops$.MODULE$.zipped$extension(scala.Predef$.MODULE$.tuple2ToZippedOps(new Tuple2(inputs, inputCount)), (Function1)scala.Predef$.MODULE$.$conforms(), (Function1)new RecipeHandler$$anonfun$parseRecipe$1()), (Function2)new RecipeHandler$$anonfun$parseRecipe$2());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 249 */     inputs.padTo(2, null, scala.collection.mutable.Buffer$.MODULE$.canBuildFrom());
/*     */ 
/*     */ 
/*     */     
/* 253 */     Iterable secondaryOutput = (Iterable)parseIngredientList(recipe.getValue("secondaryOutput")).map((Function1)new RecipeHandler$$anonfun$2(), scala.collection.Iterable$.MODULE$.canBuildFrom());
/*     */     
/* 255 */     List outputCount = recipe.getIntList("secondaryOutputCount");
/* 256 */     if (outputCount.size() != secondaryOutput.size())
/* 257 */     { (new String[3])[0] = "Mismatched secondary output count: "; (new String[3])[1] = " != "; (new String[3])[2] = "."; throw new Recipes.RecipeException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(secondaryOutput.size()), BoxesRunTime.boxToInteger(outputCount.size()) }))); }  scala.runtime.Tuple2Zipped$.MODULE$
/*     */ 
/*     */       
/* 260 */       .foreach$extension(scala.runtime.Tuple2Zipped$Ops$.MODULE$.zipped$extension(scala.Predef$.MODULE$.tuple2ToZippedOps(new Tuple2(secondaryOutput, outputCount)), (Function1)scala.Predef$.MODULE$.$conforms(), (Function1)new RecipeHandler$$anonfun$3()), (Function2)new RecipeHandler$$anonfun$4());
/*     */     
/* 262 */     Iterable outputs = recipe.hasPath("secondaryOutput") ? (Iterable)secondaryOutput.collect((PartialFunction)new RecipeHandler$$anonfun$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()) : 
/*     */       
/* 264 */       (Iterable)scala.package$.MODULE$.Iterable().empty();
/*     */     
/* 266 */     Option inputFluidStack = 
/* 267 */       recipe.hasPath("inputFluid") ? li.cil.oc.common.recipe.Recipes$.MODULE$.parseFluidIngredient(recipe.getConfig("inputFluid")) : 
/* 268 */       (Option)scala.None$.MODULE$;
/*     */     
/* 270 */     Option outputFluidStack = 
/* 271 */       recipe.hasPath("outputFluid") ? li.cil.oc.common.recipe.Recipes$.MODULE$.parseFluidIngredient(recipe.getConfig("outputFluid")) : 
/* 272 */       (Option)scala.None$.MODULE$;
/*     */     
/* 274 */     int eu = recipe.getInt("eu");
/* 275 */     int duration = recipe.getInt("time");
/*     */     
/* 277 */     return new Tuple7(inputs.head(), scala.Option$.MODULE$.apply(inputs.last()), inputFluidStack, outputFluidStack, outputs, BoxesRunTime.boxToInteger(eu), BoxesRunTime.boxToInteger(duration)); } public final class RecipeHandler$$anonfun$3 extends AbstractFunction1<List<Integer>, Buffer<Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Buffer<Integer> apply(List l) { return scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(l); } } public final class RecipeHandler$$anonfun$4 extends AbstractFunction2<Option<ItemStack>, Integer, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(Option stack, Integer count) { if (scala.Predef$.MODULE$.Integer2int(count) > 0) stack.foreach((Function1)new RecipeHandler$$anonfun$4$$anonfun$apply$8(this, count));  } public final class RecipeHandler$$anonfun$4$$anonfun$apply$8 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final Integer count$2; public final void apply(ItemStack s) { s.field_77994_a = scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(s.func_77976_d()), scala.Predef$.MODULE$.Integer2int(this.count$2)); } public RecipeHandler$$anonfun$4$$anonfun$apply$8(RecipeHandler$$anonfun$4 $outer, Integer count$2) {} } } public final class RecipeHandler$$anonfun$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable {
/* 281 */     public static final long serialVersionUID = 0L; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } } private Iterable<ItemStack[]> parseIngredientList(ConfigValue list) { Iterable iterable; Object object = list.unwrapped();
/* 282 */     if (object instanceof List) { List list1 = (List)object; iterable = (Iterable)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(list1).map((Function1)new RecipeHandler$$anonfun$parseIngredientList$1(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()); }
/* 283 */     else { iterable = (Iterable)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { li.cil.oc.common.recipe.Recipes$.MODULE$.parseIngredient(object) })); }
/* 284 */      return (Iterable<ItemStack[]>)iterable.map((Function1)new RecipeHandler$$anonfun$parseIngredientList$2(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class RecipeHandler$$anonfun$parseIngredientList$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Object entry) { return li.cil.oc.common.recipe.Recipes$.MODULE$.parseIngredient(entry); } } public final class RecipeHandler$$anonfun$parseIngredientList$2 extends AbstractFunction1<Object, ItemStack[]> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack[] apply(Object x0$1) { Object object = x0$1;
/* 285 */       if (object == null) { ItemStack[] arrayOfItemStack = (ItemStack[])scala.Array$.MODULE$.empty(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)); }
/* 286 */       else if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; (new ItemStack[1])[0] = itemStack; ItemStack[] arrayOfItemStack = new ItemStack[1]; }
/* 287 */       else { if (object instanceof String) { String str = (String)object; return (ItemStack[])scala.Array$.MODULE$.apply((Seq)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(OreDictionary.getOres(str)), scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)); }
/* 288 */          (new String[2])[0] = "Invalid ingredient type: "; (new String[2])[1] = "."; throw new Recipes.RecipeException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { object }))); }
/*     */       
/* 290 */       return (ItemStack[])SYNTHETIC_LOCAL_VARIABLE_3; } } private RecipeHandler$() { MODULE$ = this; }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gregtech\RecipeHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */