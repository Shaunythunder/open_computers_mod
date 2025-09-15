/*     */ package li.cil.oc.integration.gregtech;
/*     */ import com.typesafe.config.Config;
/*     */ import gregtech.api.util.GTRecipe;
/*     */ import gregtech.api.util.GTRecipeBuilder;
/*     */ import java.util.Collection;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.fluids.FluidStack;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.runtime.BoxedUnit;
/*     */ @ScalaSignature(bytes = "\006\001\005=r!B\001\003\021\003i\021!\004*fG&\004X\rS1oI2,'O\003\002\004\t\005AqM]3hi\026\034\007N\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\016%\026\034\027\016]3IC:$G.\032:\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!)Ad\004C\001;\005!\021N\\5u)\005q\002CA\n \023\t\001CC\001\003V]&$\b\"\002\022\020\t\003\031\023aF1eI\036#\026\t\0347psNkW\r\034;feJ+7-\0339f)\rqB\005\r\005\006K\005\002\rAJ\001\007_V$\b/\036;\021\005\035rS\"\001\025\013\005%R\023\001B5uK6T!a\013\027\002\0235Lg.Z2sC\032$(\"A\027\002\0079,G/\003\0020Q\tI\021\n^3n'R\f7m\033\005\006c\005\002\rAM\001\007e\026\034\027\016]3\021\005MRT\"\001\033\013\005U2\024AB2p]\032LwM\003\0028q\005AA/\0379fg\0064WMC\001:\003\r\031w.\\\005\003wQ\022aaQ8oM&<\007\"B\037\020\t\003q\024\001H1eI\036#\026i]:f[\nd\027N\\4NC\016D\027N\\3SK\016L\007/\032\013\004=}\002\005\"B\023=\001\0041\003\"B\031=\001\004\021\004\"\002\"\020\t\003\031\025!E1eI\036#&)\0328eKJ\024VmY5qKR\031a\004R#\t\013\025\n\005\031\001\024\t\013E\n\005\031\001\032\t\013\035{A\021\001%\002#\005$Gm\022+DC:tWM\035*fG&\004X\rF\002\037\023*CQ!\n$A\002\031BQ!\r$A\002IBQ\001T\b\005\0025\0131#\0313e\017R\033\005.Z7jG\006d'+Z2ja\026$2A\b(P\021\025)3\n1\001'\021\025\t4\n1\0013\021\025\tv\002\"\001S\003E\tG\rZ$U\007V$H/\032:SK\016L\007/\032\013\004=M#\006\"B\023Q\001\0041\003\"B\031Q\001\004\021\004\"\002,\020\t\0039\026AF1eI\036#f\t\\;jI\016\013gN\\3s%\026\034\027\016]3\025\007yA\026\fC\003&+\002\007a\005C\0032+\002\007!\007C\003\\\037\021\005A,A\fbI\022<EKR8s[&tw\r\025:fgN\024VmY5qKR\031a$\0300\t\013\025R\006\031\001\024\t\013ER\006\031\001\032\t\013\001|A\021A1\002!\005$Gm\022+MCRDWMU3dSB,Gc\001\020cG\")Qe\030a\001M!)\021g\030a\001e!)Qm\004C\001M\006A\022\r\0323H)2\0137/\032:F]\036\024\030M^3s%\026\034\027\016]3\025\007y9\007\016C\003&I\002\007a\005C\0032I\002\007!\007C\003k\037\021\0051.A\nbI\022<EkV5sK6KG\016\034*fG&\004X\rF\002\037Y6DQ!J5A\002\031BQ!M5A\002IBQa\\\b\005\nA\f1\002]1sg\026\024VmY5qKR)\021/!\007\002\034Aa1C\035;xuj\f9!a\005\002\024%\0211\017\006\002\007)V\004H.Z\034\021\007M)h%\003\002w)\t)\021I\035:bsB\0311\003\037;\n\005e$\"AB(qi&|g\016E\002\024qn\0042\001`A\002\033\005i(B\001@\000\003\0311G.^5eg*\031\021\021\001\027\002\0355Lg.Z2sC\032$hm\034:hK&\031\021QA?\003\025\031cW/\0333Ti\006\0347\016E\003\002\n\005=a%\004\002\002\f)\031\021Q\002\013\002\025\r|G\016\\3di&|g.\003\003\002\022\005-!\001C%uKJ\f'\r\\3\021\007M\t)\"C\002\002\030Q\0211!\0238u\021\025)c\0161\001'\021\025\td\0161\0013\021\035\tyb\004C\005\003C\t1\003]1sg\026Len\032:fI&,g\016\036'jgR$B!a\t\002&A)\021\021BA\bi\"A\021qEA\017\001\004\tI#\001\003mSN$\bcA\032\002,%\031\021Q\006\033\003\027\r{gNZ5h-\006dW/\032")
/*     */ public final class RecipeHandler { public static void addGTWireMillRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTWireMillRecipe(paramItemStack, paramConfig); } public static void addGTLaserEngraverRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTLaserEngraverRecipe(paramItemStack, paramConfig); } public static void addGTLatheRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTLatheRecipe(paramItemStack, paramConfig); } public static void addGTFormingPressRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTFormingPressRecipe(paramItemStack, paramConfig); } public static void addGTFluidCannerRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTFluidCannerRecipe(paramItemStack, paramConfig); } public static void addGTCutterRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTCutterRecipe(paramItemStack, paramConfig); } public static void addGTChemicalRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTChemicalRecipe(paramItemStack, paramConfig); } public static void addGTCannerRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTCannerRecipe(paramItemStack, paramConfig); } public static void addGTBenderRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTBenderRecipe(paramItemStack, paramConfig); } public static void addGTAssemblingMachineRecipe(ItemStack paramItemStack, Config paramConfig) { RecipeHandler$.MODULE$.addGTAssemblingMachineRecipe(paramItemStack, paramConfig); } public static void addGTAlloySmelterRecipe(ItemStack paramItemStack, Config paramConfig) {
/*     */     RecipeHandler$.MODULE$.addGTAlloySmelterRecipe(paramItemStack, paramConfig);
/*     */   } public static void init() {
/*     */     RecipeHandler$.MODULE$.init();
/*  17 */   } public final class RecipeHandler$$anonfun$init$1 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTAlloySmelterRecipe(output, recipe); } public static final long serialVersionUID = 0L; } public final class RecipeHandler$$anonfun$init$2 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) {
/*  18 */       RecipeHandler$.MODULE$.addGTAssemblingMachineRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$3 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  19 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTBenderRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$4 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  20 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTCannerRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$5 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  21 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTChemicalRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$6 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  22 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTCutterRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$7 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  23 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTFluidCannerRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$8 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  24 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTFormingPressRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$9 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  25 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTLatheRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$10 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*  26 */     public final void apply(ItemStack output, Config recipe) { RecipeHandler$.MODULE$.addGTLaserEngraverRecipe(output, recipe); } } public final class RecipeHandler$$anonfun$init$11 extends AbstractFunction2<ItemStack, Config, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack output, Config recipe) {
/*  27 */       RecipeHandler$.MODULE$.addGTWireMillRecipe(output, recipe);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack output$1; public final int eu$1;
/*     */     public final int duration$1;
/*     */     private final ItemStack[] value$1;
/*     */     
/*     */     public final void apply(ItemStack primaryInput) {
/*  34 */       Predef$.MODULE$.refArrayOps((Object[])this.value$1).foreach((Function1)new RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1$$anonfun$apply$1(this, primaryInput));
/*     */     } public RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1(ItemStack output$1, int eu$1, int duration$1, ItemStack[] value$1) {} public final class RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1$$anonfun$apply$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack primaryInput$1; public RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1$$anonfun$apply$1(RecipeHandler$$anonfun$addGTAlloySmelterRecipe$1 $outer, ItemStack primaryInput$1) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) {
/*  36 */         return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$1, secondaryInput }).itemOutputs(new ItemStack[] { this.$outer.output$1 }).duration(this.$outer.duration$1).eut(this.$outer.eu$1).addTo((IRecipeMap)RecipeMaps.alloySmelterRecipes);
/*     */       } } }
/*     */   public final class RecipeHandler$$anonfun$addGTAlloySmelterRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$1; private final int eu$1; private final int duration$1;
/*     */     public RecipeHandler$$anonfun$addGTAlloySmelterRecipe$2(ItemStack output$1, int eu$1, int duration$1) {}
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/*  41 */       return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput }).itemOutputs(new ItemStack[] { this.output$1 }).duration(this.duration$1).eut(this.eu$1).addTo((IRecipeMap)RecipeMaps.alloySmelterRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final ItemStack output$2;
/*     */     public final Option fluidInput$1;
/*     */     public final int eu$2;
/*     */     public final int duration$2;
/*     */     private final ItemStack[] value$2;
/*     */     
/*  50 */     public final void apply(ItemStack primaryInput) { Predef$.MODULE$.refArrayOps((Object[])this.value$2).foreach((Function1)new RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1$$anonfun$apply$2(this, primaryInput)); } public RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1(ItemStack output$2, Option fluidInput$1, int eu$2, int duration$2, ItemStack[] value$2) {} public final class RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1$$anonfun$apply$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack primaryInput$2; public RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1$$anonfun$apply$2(RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$1 $outer, ItemStack primaryInput$2) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) {
/*  51 */         GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$2, secondaryInput });
/*  52 */         Option option = this.$outer.fluidInput$1;
/*  53 */         if (option instanceof Some) { Some some = (Some)option; FluidStack fluidStack = (FluidStack)some.x();
/*  54 */           recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  55 */         else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         
/*  57 */         return recipe.itemOutputs(new ItemStack[] { this.$outer.output$2 }).duration(this.$outer.duration$2).eut(this.$outer.eu$2).addTo((IRecipeMap)RecipeMaps.assemblerRecipes);
/*     */       } } } public final class RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$2; private final Option fluidInput$1; private final int eu$2; private final int duration$2;
/*     */     public RecipeHandler$$anonfun$addGTAssemblingMachineRecipe$2(ItemStack output$2, Option fluidInput$1, int eu$2, int duration$2) {}
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/*  61 */       GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/*  62 */       Option option = this.fluidInput$1;
/*  63 */       if (option instanceof Some) { Some some = (Some)option; FluidStack fluidStack = (FluidStack)some.x();
/*  64 */         recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  65 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*  67 */       return recipe.itemOutputs(new ItemStack[] { this.output$2 }).duration(this.duration$2).eut(this.eu$2).addTo((IRecipeMap)RecipeMaps.assemblerRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTBenderRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$3;
/*     */     private final int eu$3;
/*     */     private final int duration$3;
/*     */     
/*     */     public RecipeHandler$$anonfun$addGTBenderRecipe$1(ItemStack output$3, int eu$3, int duration$3) {}
/*     */     
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/*  76 */       return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput }).itemOutputs(new ItemStack[] { this.output$3 }).duration(this.duration$3).eut(this.eu$3).addTo((IRecipeMap)RecipeMaps.benderRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTCannerRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final ItemStack output$4;
/*     */     public final int eu$4;
/*     */     public final int duration$4;
/*     */     public final Option secondaryOutput$1;
/*     */     private final ItemStack[] value$3;
/*     */     
/*  85 */     public final void apply(ItemStack primaryInput) { Predef$.MODULE$.refArrayOps((Object[])this.value$3).foreach((Function1)new RecipeHandler$$anonfun$addGTCannerRecipe$1$$anonfun$apply$3(this, primaryInput)); } public RecipeHandler$$anonfun$addGTCannerRecipe$1(ItemStack output$4, int eu$4, int duration$4, Option secondaryOutput$1, ItemStack[] value$3) {} public final class RecipeHandler$$anonfun$addGTCannerRecipe$1$$anonfun$apply$3 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack primaryInput$3; public RecipeHandler$$anonfun$addGTCannerRecipe$1$$anonfun$apply$3(RecipeHandler$$anonfun$addGTCannerRecipe$1 $outer, ItemStack primaryInput$3) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) {
/*  86 */         GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$3, secondaryInput });
/*  87 */         Option option = this.$outer.secondaryOutput$1;
/*  88 */         if (option instanceof Some) { Some some = (Some)option; ItemStack itemStack = (ItemStack)some.x();
/*  89 */           recipe = recipe.itemOutputs(new ItemStack[] { this.$outer.output$4, itemStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         else
/*  91 */         { recipe = recipe.itemOutputs(new ItemStack[] { this.$outer.output$4 }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         
/*  93 */         return recipe.duration(this.$outer.duration$4).eut(this.$outer.eu$4).addTo((IRecipeMap)RecipeMaps.cannerRecipes);
/*     */       } } } public final class RecipeHandler$$anonfun$addGTCannerRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$4; private final int eu$4; private final int duration$4; private final Option secondaryOutput$1;
/*     */     public RecipeHandler$$anonfun$addGTCannerRecipe$2(ItemStack output$4, int eu$4, int duration$4, Option secondaryOutput$1) {}
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/*  97 */       GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/*  98 */       Option option = this.secondaryOutput$1;
/*  99 */       if (option instanceof Some) { Some some = (Some)option; ItemStack itemStack = (ItemStack)some.x();
/* 100 */         recipe = recipe.itemOutputs(new ItemStack[] { this.output$4, itemStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 102 */       { recipe = recipe.itemOutputs(new ItemStack[] { this.output$4 }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 104 */       return recipe.duration(this.duration$4).eut(this.eu$4).addTo((IRecipeMap)RecipeMaps.cannerRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTChemicalRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack output$5;
/*     */     public final Option fluidInput$2;
/*     */     public final Option fluidOutput$1;
/*     */     public final int eu$5;
/*     */     public final int duration$5;
/*     */     private final ItemStack[] value$4;
/*     */     
/* 113 */     public final void apply(ItemStack primaryInput) { Predef$.MODULE$.refArrayOps((Object[])this.value$4).foreach((Function1)new RecipeHandler$$anonfun$addGTChemicalRecipe$1$$anonfun$apply$4(this, primaryInput)); } public RecipeHandler$$anonfun$addGTChemicalRecipe$1(ItemStack output$5, Option fluidInput$2, Option fluidOutput$1, int eu$5, int duration$5, ItemStack[] value$4) {} public final class RecipeHandler$$anonfun$addGTChemicalRecipe$1$$anonfun$apply$4 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack primaryInput$4; public RecipeHandler$$anonfun$addGTChemicalRecipe$1$$anonfun$apply$4(RecipeHandler$$anonfun$addGTChemicalRecipe$1 $outer, ItemStack primaryInput$4) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) {
/* 114 */         GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$4, secondaryInput });
/* 115 */         Option option1 = this.$outer.fluidInput$2;
/* 116 */         if (option1 instanceof Some) { Some some = (Some)option1; FluidStack fluidStack = (FluidStack)some.x();
/* 117 */           recipe = recipe.fluidInputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 118 */         else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         
/* 120 */         Option option2 = this.$outer.fluidOutput$1;
/* 121 */         if (option2 instanceof Some) { Some some = (Some)option2; FluidStack fluidStack = (FluidStack)some.x();
/* 122 */           recipe = recipe.fluidOutputs(new FluidStack[] { fluidStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 123 */         else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         
/* 125 */         return recipe.itemOutputs(new ItemStack[] { this.$outer.output$5 }).duration(this.$outer.duration$5).eut(this.$outer.eu$5).addTo((IRecipeMap)RecipeMaps.chemicalReactorRecipes);
/*     */       } } } public final class RecipeHandler$$anonfun$addGTChemicalRecipe$2 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$5; private final Option fluidInput$2; private final Option fluidOutput$1; private final int eu$5; private final int duration$5;
/*     */     public RecipeHandler$$anonfun$addGTChemicalRecipe$2(ItemStack output$5, Option fluidInput$2, Option fluidOutput$1, int eu$5, int duration$5) {}
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/* 129 */       GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
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
/* 140 */       return recipe.itemOutputs(new ItemStack[] { this.output$5 }).duration(this.duration$5).eut(this.eu$5).addTo((IRecipeMap)RecipeMaps.chemicalReactorRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTCutterRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$6; private final Option fluidInput$3; private final int eu$6;
/*     */     private final int duration$6;
/*     */     private final Option secondaryOutput$2;
/*     */     
/*     */     public RecipeHandler$$anonfun$addGTCutterRecipe$1(ItemStack output$6, Option fluidInput$3, int eu$6, int duration$6, Option secondaryOutput$2) {}
/*     */     
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/* 149 */       GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
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
/* 161 */       return recipe.duration(this.duration$6).eut(this.eu$6).addTo((IRecipeMap)RecipeMaps.cutterRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTFluidCannerRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack output$7; private final Option fluidInput$4; private final Option fluidOutput$2; private final int eu$7; private final int duration$7;
/*     */     
/*     */     public RecipeHandler$$anonfun$addGTFluidCannerRecipe$1(ItemStack output$7, Option fluidInput$4, Option fluidOutput$2, int eu$7, int duration$7) {}
/*     */     
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/* 168 */       GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
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
/* 179 */       return recipe.itemOutputs(new ItemStack[] { this.output$7 }).duration(this.duration$7).eut(this.eu$7).addTo((IRecipeMap)RecipeMaps.fluidCannerRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTFormingPressRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack output$8;
/*     */     public final int eu$8;
/*     */     public final int duration$8;
/*     */     private final ItemStack[] value$5;
/*     */     
/*     */     public final void apply(ItemStack primaryInput) {
/* 187 */       Predef$.MODULE$.refArrayOps((Object[])this.value$5).foreach((Function1)new RecipeHandler$$anonfun$addGTFormingPressRecipe$1$$anonfun$apply$5(this, primaryInput));
/*     */     } public RecipeHandler$$anonfun$addGTFormingPressRecipe$1(ItemStack output$8, int eu$8, int duration$8, ItemStack[] value$5) {} public final class RecipeHandler$$anonfun$addGTFormingPressRecipe$1$$anonfun$apply$5 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack primaryInput$5; public RecipeHandler$$anonfun$addGTFormingPressRecipe$1$$anonfun$apply$5(RecipeHandler$$anonfun$addGTFormingPressRecipe$1 $outer, ItemStack primaryInput$5) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) {
/* 189 */         return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$5, secondaryInput }).itemOutputs(new ItemStack[] { this.$outer.output$8 }).duration(this.$outer.duration$8).eut(this.$outer.eu$8).addTo((IRecipeMap)RecipeMaps.formingPressRecipes);
/*     */       } } }
/*     */   public final class RecipeHandler$$anonfun$addGTLatheRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ItemStack output$9;
/*     */     private final int eu$9;
/*     */     private final int duration$9;
/*     */     private final Option secondaryOutput$3;
/*     */     
/*     */     public RecipeHandler$$anonfun$addGTLatheRecipe$1(ItemStack output$9, int eu$9, int duration$9, Option secondaryOutput$3) {}
/*     */     
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/* 200 */       GTRecipeBuilder recipe = GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput });
/* 201 */       Option option = this.secondaryOutput$3;
/* 202 */       if (option instanceof Some) { Some some = (Some)option; ItemStack itemStack = (ItemStack)some.x();
/* 203 */         recipe = recipe.itemOutputs(new ItemStack[] { this.output$9, itemStack }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/* 205 */       { recipe = recipe.itemOutputs(new ItemStack[] { this.output$9 }); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/* 207 */       return recipe.duration(this.duration$9).eut(this.eu$9).addTo((IRecipeMap)RecipeMaps.latheRecipes);
/*     */     } }
/*     */   public final class RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack output$10;
/*     */     public final int eu$10;
/*     */     public final int duration$10;
/*     */     private final ItemStack[] value$6;
/*     */     
/*     */     public final void apply(ItemStack primaryInput) {
/* 215 */       Predef$.MODULE$.refArrayOps((Object[])this.value$6).foreach((Function1)new RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1$$anonfun$apply$6(this, primaryInput));
/*     */     } public RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1(ItemStack output$10, int eu$10, int duration$10, ItemStack[] value$6) {} public final class RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1$$anonfun$apply$6 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack primaryInput$6; public RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1$$anonfun$apply$6(RecipeHandler$$anonfun$addGTLaserEngraverRecipe$1 $outer, ItemStack primaryInput$6) {} public final Collection<GTRecipe> apply(ItemStack secondaryInput) {
/* 217 */         return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { this.primaryInput$6, secondaryInput }).itemOutputs(new ItemStack[] { this.$outer.output$10 }).duration(this.$outer.duration$10).eut(this.$outer.eu$10).addTo((IRecipeMap)RecipeMaps.laserEngraverRecipes);
/*     */       } } }
/*     */   public final class RecipeHandler$$anonfun$addGTWireMillRecipe$1 extends AbstractFunction1<ItemStack, Collection<GTRecipe>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ItemStack output$11;
/*     */     private final int eu$11;
/*     */     private final int duration$11;
/*     */     
/*     */     public RecipeHandler$$anonfun$addGTWireMillRecipe$1(ItemStack output$11, int eu$11, int duration$11) {}
/*     */     
/*     */     public final Collection<GTRecipe> apply(ItemStack primaryInput) {
/* 227 */       return GTValues.RA.stdBuilder().itemInputs(new ItemStack[] { primaryInput }).itemOutputs(new ItemStack[] { this.output$11 }).duration(this.duration$11).eut(this.eu$11).addTo((IRecipeMap)RecipeMaps.wiremillRecipes);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class RecipeHandler$$anonfun$parseRecipe$1
/*     */     extends AbstractFunction1<List<Integer>, Buffer<Integer>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Buffer<Integer> apply(List l) {
/* 244 */       return WrapAsScala$.MODULE$.asScalaBuffer(l);
/* 245 */     } } public final class RecipeHandler$$anonfun$parseRecipe$2 extends AbstractFunction2<ItemStack[], Integer, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack[] stacks, Integer count) { Predef$.MODULE$.refArrayOps((Object[])stacks).foreach((Function1)new RecipeHandler$$anonfun$parseRecipe$2$$anonfun$apply$7(this, count)); } public final class RecipeHandler$$anonfun$parseRecipe$2$$anonfun$apply$7 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Integer count$1; public RecipeHandler$$anonfun$parseRecipe$2$$anonfun$apply$7(RecipeHandler$$anonfun$parseRecipe$2 $outer, Integer count$1) {} public final void apply(ItemStack stack) {
/* 246 */         if (stack != null && Predef$.MODULE$.Integer2int(this.count$1) > 0)
/* 247 */           stack.field_77994_a = RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(stack.func_77976_d()), Predef$.MODULE$.Integer2int(this.count$1)); 
/*     */       } } }
/*     */   
/*     */   public final class RecipeHandler$$anonfun$2 extends AbstractFunction1<ItemStack[], Option<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Option<ItemStack> apply(ItemStack[] x$12) {
/* 253 */       return Predef$.MODULE$.refArrayOps((Object[])x$12).headOption();
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class RecipeHandler$$anonfun$3 extends AbstractFunction1<List<Integer>, Buffer<Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/* 260 */     public final Buffer<Integer> apply(List l) { return WrapAsScala$.MODULE$.asScalaBuffer(l); } } public final class RecipeHandler$$anonfun$4 extends AbstractFunction2<Option<ItemStack>, Integer, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/* 261 */     public final void apply(Option stack, Integer count) { if (Predef$.MODULE$.Integer2int(count) > 0) stack.foreach((Function1)new RecipeHandler$$anonfun$4$$anonfun$apply$8(this, count));  } public final class RecipeHandler$$anonfun$4$$anonfun$apply$8 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Integer count$2; public final void apply(ItemStack s) { s.field_77994_a = RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(s.func_77976_d()), Predef$.MODULE$.Integer2int(this.count$2)); } public RecipeHandler$$anonfun$4$$anonfun$apply$8(RecipeHandler$$anonfun$4 $outer, Integer count$2) {} } } public final class RecipeHandler$$anonfun$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object;
/* 262 */       Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class RecipeHandler$$anonfun$parseIngredientList$1
/*     */     extends AbstractFunction1<Object, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object apply(Object entry) {
/* 282 */       return Recipes$.MODULE$.parseIngredient(entry);
/*     */     } } public final class RecipeHandler$$anonfun$parseIngredientList$2 extends AbstractFunction1<Object, ItemStack[]> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack[] apply(Object x0$1) {
/* 284 */       Object object = x0$1;
/* 285 */       if (object == null) { ItemStack[] arrayOfItemStack = (ItemStack[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(ItemStack.class)); }
/* 286 */       else if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; (new ItemStack[1])[0] = itemStack; ItemStack[] arrayOfItemStack = new ItemStack[1]; }
/* 287 */       else { if (object instanceof String) { String str = (String)object; return (ItemStack[])Array$.MODULE$.apply((Seq)WrapAsScala$.MODULE$.asScalaBuffer(OreDictionary.getOres(str)), ClassTag$.MODULE$.apply(ItemStack.class)); }
/* 288 */          (new String[2])[0] = "Invalid ingredient type: "; (new String[2])[1] = "."; throw new Recipes.RecipeException((new StringContext(Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(Predef$.MODULE$.genericWrapArray(new Object[] { object }))); }
/*     */       
/*     */       return (ItemStack[])SYNTHETIC_LOCAL_VARIABLE_3;
/*     */     } }
/*     */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\gregtech\RecipeHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */