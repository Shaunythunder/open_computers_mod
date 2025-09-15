/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemBlock;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.CraftingManager;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import net.minecraft.item.crafting.ShapedRecipes;
/*     */ import net.minecraft.item.crafting.ShapelessRecipes;
/*     */ import net.minecraftforge.oredict.ShapedOreRecipe;
/*     */ import net.minecraftforge.oredict.ShapelessOreRecipe;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.PartialFunction;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.TraversableLike;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.AbstractPartialFunction;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ItemUtils$
/*     */ {
/*     */   public static final ItemUtils$ MODULE$;
/*     */   private Random li$cil$oc$util$ItemUtils$$rng;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*     */   public int caseTier(ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: ldc 'case1'
/*     */     //   8: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   11: astore_3
/*     */     //   12: dup
/*     */     //   13: ifnonnull -> 24
/*     */     //   16: pop
/*     */     //   17: aload_3
/*     */     //   18: ifnull -> 31
/*     */     //   21: goto -> 35
/*     */     //   24: aload_3
/*     */     //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   28: ifeq -> 35
/*     */     //   31: iconst_0
/*     */     //   32: goto -> 564
/*     */     //   35: aload_2
/*     */     //   36: ldc 'case2'
/*     */     //   38: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   41: astore #4
/*     */     //   43: dup
/*     */     //   44: ifnonnull -> 56
/*     */     //   47: pop
/*     */     //   48: aload #4
/*     */     //   50: ifnull -> 64
/*     */     //   53: goto -> 68
/*     */     //   56: aload #4
/*     */     //   58: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   61: ifeq -> 68
/*     */     //   64: iconst_1
/*     */     //   65: goto -> 564
/*     */     //   68: aload_2
/*     */     //   69: ldc 'case3'
/*     */     //   71: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   74: astore #5
/*     */     //   76: dup
/*     */     //   77: ifnonnull -> 89
/*     */     //   80: pop
/*     */     //   81: aload #5
/*     */     //   83: ifnull -> 97
/*     */     //   86: goto -> 101
/*     */     //   89: aload #5
/*     */     //   91: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   94: ifeq -> 101
/*     */     //   97: iconst_2
/*     */     //   98: goto -> 564
/*     */     //   101: aload_2
/*     */     //   102: ldc 'caseCreative'
/*     */     //   104: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   107: astore #6
/*     */     //   109: dup
/*     */     //   110: ifnonnull -> 122
/*     */     //   113: pop
/*     */     //   114: aload #6
/*     */     //   116: ifnull -> 130
/*     */     //   119: goto -> 134
/*     */     //   122: aload #6
/*     */     //   124: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   127: ifeq -> 134
/*     */     //   130: iconst_3
/*     */     //   131: goto -> 564
/*     */     //   134: aload_2
/*     */     //   135: ldc 'microcontrollerCase1'
/*     */     //   137: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   140: astore #7
/*     */     //   142: dup
/*     */     //   143: ifnonnull -> 155
/*     */     //   146: pop
/*     */     //   147: aload #7
/*     */     //   149: ifnull -> 163
/*     */     //   152: goto -> 167
/*     */     //   155: aload #7
/*     */     //   157: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   160: ifeq -> 167
/*     */     //   163: iconst_0
/*     */     //   164: goto -> 564
/*     */     //   167: aload_2
/*     */     //   168: ldc 'microcontrollerCase2'
/*     */     //   170: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   173: astore #8
/*     */     //   175: dup
/*     */     //   176: ifnonnull -> 188
/*     */     //   179: pop
/*     */     //   180: aload #8
/*     */     //   182: ifnull -> 196
/*     */     //   185: goto -> 200
/*     */     //   188: aload #8
/*     */     //   190: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   193: ifeq -> 200
/*     */     //   196: iconst_1
/*     */     //   197: goto -> 564
/*     */     //   200: aload_2
/*     */     //   201: ldc 'microcontrollerCaseCreative'
/*     */     //   203: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   206: astore #9
/*     */     //   208: dup
/*     */     //   209: ifnonnull -> 221
/*     */     //   212: pop
/*     */     //   213: aload #9
/*     */     //   215: ifnull -> 229
/*     */     //   218: goto -> 233
/*     */     //   221: aload #9
/*     */     //   223: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   226: ifeq -> 233
/*     */     //   229: iconst_3
/*     */     //   230: goto -> 564
/*     */     //   233: aload_2
/*     */     //   234: ldc 'droneCase1'
/*     */     //   236: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   239: astore #10
/*     */     //   241: dup
/*     */     //   242: ifnonnull -> 254
/*     */     //   245: pop
/*     */     //   246: aload #10
/*     */     //   248: ifnull -> 262
/*     */     //   251: goto -> 266
/*     */     //   254: aload #10
/*     */     //   256: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   259: ifeq -> 266
/*     */     //   262: iconst_0
/*     */     //   263: goto -> 564
/*     */     //   266: aload_2
/*     */     //   267: ldc 'droneCase2'
/*     */     //   269: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   272: astore #11
/*     */     //   274: dup
/*     */     //   275: ifnonnull -> 287
/*     */     //   278: pop
/*     */     //   279: aload #11
/*     */     //   281: ifnull -> 295
/*     */     //   284: goto -> 299
/*     */     //   287: aload #11
/*     */     //   289: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   292: ifeq -> 299
/*     */     //   295: iconst_1
/*     */     //   296: goto -> 564
/*     */     //   299: aload_2
/*     */     //   300: ldc 'droneCaseCreative'
/*     */     //   302: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   305: astore #12
/*     */     //   307: dup
/*     */     //   308: ifnonnull -> 320
/*     */     //   311: pop
/*     */     //   312: aload #12
/*     */     //   314: ifnull -> 328
/*     */     //   317: goto -> 332
/*     */     //   320: aload #12
/*     */     //   322: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   325: ifeq -> 332
/*     */     //   328: iconst_3
/*     */     //   329: goto -> 564
/*     */     //   332: aload_2
/*     */     //   333: ldc 'server1'
/*     */     //   335: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   338: astore #13
/*     */     //   340: dup
/*     */     //   341: ifnonnull -> 353
/*     */     //   344: pop
/*     */     //   345: aload #13
/*     */     //   347: ifnull -> 361
/*     */     //   350: goto -> 365
/*     */     //   353: aload #13
/*     */     //   355: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   358: ifeq -> 365
/*     */     //   361: iconst_0
/*     */     //   362: goto -> 564
/*     */     //   365: aload_2
/*     */     //   366: ldc 'server2'
/*     */     //   368: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   371: astore #14
/*     */     //   373: dup
/*     */     //   374: ifnonnull -> 386
/*     */     //   377: pop
/*     */     //   378: aload #14
/*     */     //   380: ifnull -> 394
/*     */     //   383: goto -> 398
/*     */     //   386: aload #14
/*     */     //   388: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   391: ifeq -> 398
/*     */     //   394: iconst_1
/*     */     //   395: goto -> 564
/*     */     //   398: aload_2
/*     */     //   399: ldc 'server3'
/*     */     //   401: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   404: astore #15
/*     */     //   406: dup
/*     */     //   407: ifnonnull -> 419
/*     */     //   410: pop
/*     */     //   411: aload #15
/*     */     //   413: ifnull -> 427
/*     */     //   416: goto -> 431
/*     */     //   419: aload #15
/*     */     //   421: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   424: ifeq -> 431
/*     */     //   427: iconst_2
/*     */     //   428: goto -> 564
/*     */     //   431: aload_2
/*     */     //   432: ldc 'serverCreative'
/*     */     //   434: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   437: astore #16
/*     */     //   439: dup
/*     */     //   440: ifnonnull -> 452
/*     */     //   443: pop
/*     */     //   444: aload #16
/*     */     //   446: ifnull -> 460
/*     */     //   449: goto -> 464
/*     */     //   452: aload #16
/*     */     //   454: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   457: ifeq -> 464
/*     */     //   460: iconst_3
/*     */     //   461: goto -> 564
/*     */     //   464: aload_2
/*     */     //   465: ldc 'tabletCase1'
/*     */     //   467: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   470: astore #17
/*     */     //   472: dup
/*     */     //   473: ifnonnull -> 485
/*     */     //   476: pop
/*     */     //   477: aload #17
/*     */     //   479: ifnull -> 493
/*     */     //   482: goto -> 497
/*     */     //   485: aload #17
/*     */     //   487: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   490: ifeq -> 497
/*     */     //   493: iconst_0
/*     */     //   494: goto -> 564
/*     */     //   497: aload_2
/*     */     //   498: ldc 'tabletCase2'
/*     */     //   500: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   503: astore #18
/*     */     //   505: dup
/*     */     //   506: ifnonnull -> 518
/*     */     //   509: pop
/*     */     //   510: aload #18
/*     */     //   512: ifnull -> 526
/*     */     //   515: goto -> 530
/*     */     //   518: aload #18
/*     */     //   520: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   523: ifeq -> 530
/*     */     //   526: iconst_1
/*     */     //   527: goto -> 564
/*     */     //   530: aload_2
/*     */     //   531: ldc 'tabletCaseCreative'
/*     */     //   533: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   536: astore #19
/*     */     //   538: dup
/*     */     //   539: ifnonnull -> 551
/*     */     //   542: pop
/*     */     //   543: aload #19
/*     */     //   545: ifnull -> 559
/*     */     //   548: goto -> 563
/*     */     //   551: aload #19
/*     */     //   553: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   556: ifeq -> 563
/*     */     //   559: iconst_3
/*     */     //   560: goto -> 564
/*     */     //   563: iconst_m1
/*     */     //   564: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #27	-> 0
/*     */     //   #28	-> 5
/*     */     //   #29	-> 35
/*     */     //   #30	-> 68
/*     */     //   #31	-> 101
/*     */     //   #32	-> 134
/*     */     //   #33	-> 167
/*     */     //   #34	-> 200
/*     */     //   #35	-> 233
/*     */     //   #36	-> 266
/*     */     //   #37	-> 299
/*     */     //   #38	-> 332
/*     */     //   #39	-> 365
/*     */     //   #40	-> 398
/*     */     //   #41	-> 431
/*     */     //   #42	-> 464
/*     */     //   #43	-> 497
/*     */     //   #44	-> 530
/*     */     //   #45	-> 563
/*     */     //   #26	-> 564
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	565	0	this	Lli/cil/oc/util/ItemUtils$;
/*     */     //   0	565	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   5	560	2	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */   }
/*     */   
/*     */   public String caseNameWithTierSuffix(String name, int tier) {
/*  48 */     return (new StringBuilder()).append(name).append((tier == 3) ? "Creative" : BoxesRunTime.boxToInteger(tier + 1).toString()).toString();
/*     */   }
/*     */   
/*  51 */   public final Tuple2 li$cil$oc$util$ItemUtils$$getFilteredInputs$1(Iterable inputs, int outputSize) { return new Tuple2(((TraversableOnce)inputs.filter((Function1)new ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$getFilteredInputs$1$1(outputSize)))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  58 */         .toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)), BoxesRunTime.boxToInteger(outputSize)); } public final class ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$getFilteredInputs$1$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final int outputSize$1; public ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$getFilteredInputs$1$1(int outputSize$1) {} public final boolean apply(ItemStack input) { if (input != null && input.func_77973_b() != null && input.field_77994_a / this.outputSize$1 > 0) if (!(input.func_77973_b() instanceof net.minecraft.item.ItemBucket)); 
/*  59 */       return false; } } public final int li$cil$oc$util$ItemUtils$$getOutputSize$1(IRecipe recipe) { return (recipe.func_77571_b()).field_77994_a; } public final class ItemUtils$$anonfun$3 extends AbstractFunction1<Object, IRecipe> implements Serializable {
/*  60 */     public static final long serialVersionUID = 0L; public final IRecipe apply(Object x$1) { return (IRecipe)x$1; } } public final class ItemUtils$$anonfun$4 extends AbstractFunction1<IRecipe, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final boolean apply(IRecipe recipe) { return (recipe.func_77571_b() != null && recipe.func_77571_b().func_77969_a(this.stack$1)); } public ItemUtils$$anonfun$4(ItemStack stack$1) {} } public final boolean li$cil$oc$util$ItemUtils$$isInputBlacklisted$1(ItemStack stack) { boolean bool; Item item = stack.func_77973_b();
/*  61 */     if (item instanceof ItemBlock) { ItemBlock itemBlock = (ItemBlock)item; bool = li.cil.oc.Settings$.MODULE$.get().disassemblerInputBlacklist().contains(Block.field_149771_c.func_148750_c(itemBlock.field_150939_a)); }
/*  62 */     else if (item != null) { Item item1 = item; bool = li.cil.oc.Settings$.MODULE$.get().disassemblerInputBlacklist().contains(Item.field_150901_e.func_148750_c(item1)); }
/*  63 */     else { bool = false; }  return bool; }
/*     */   public final class ItemUtils$$anonfun$1 extends AbstractPartialFunction<IRecipe, Tuple2<ItemStack[], Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final <A1 extends IRecipe, B1> B1 applyOrElse(IRecipe x1, Function1 default) { Object object; IRecipe iRecipe = x1; if (iRecipe instanceof ShapedRecipes) { ShapedRecipes shapedRecipes = (ShapedRecipes)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1(scala.Predef$.MODULE$.refArrayOps((Object[])shapedRecipes.field_77574_d).toIterable(), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapedRecipes)); } else if (iRecipe instanceof ShapelessRecipes) { ShapelessRecipes shapelessRecipes = (ShapelessRecipes)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1((Iterable)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(shapelessRecipes.field_77579_b).map((Function1)new ItemUtils$$anonfun$1$$anonfun$applyOrElse$1(this), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom()), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapelessRecipes)); } else if (iRecipe instanceof ShapedOreRecipe) { ShapedOreRecipe shapedOreRecipe = (ShapedOreRecipe)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1(ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$resolveOreDictEntries((Iterable<?>)scala.Predef$.MODULE$.wrapRefArray(shapedOreRecipe.getInput())), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapedOreRecipe)); } else if (iRecipe instanceof ShapelessOreRecipe) { ShapelessOreRecipe shapelessOreRecipe = (ShapelessOreRecipe)iRecipe; object = ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getFilteredInputs$1(ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$resolveOreDictEntries((Iterable<?>)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(shapelessOreRecipe.getInput())), ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$getOutputSize$1((IRecipe)shapelessOreRecipe)); } else { object = default.apply(x1); }  return (B1)object; }
/*     */     public final boolean isDefinedAt(IRecipe x1) { boolean bool; IRecipe iRecipe = x1; if (iRecipe instanceof ShapedRecipes) { bool = true; } else if (iRecipe instanceof ShapelessRecipes) { bool = true; } else if (iRecipe instanceof ShapedOreRecipe) { bool = true; } else if (iRecipe instanceof ShapelessOreRecipe) { bool = true; } else { bool = false; }  return bool; }
/*     */     public final class ItemUtils$$anonfun$1$$anonfun$applyOrElse$1 extends AbstractFunction1<Object, ItemStack> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final ItemStack apply(Object x$2) { return (ItemStack)x$2; } public ItemUtils$$anonfun$1$$anonfun$applyOrElse$1(ItemUtils$$anonfun$1 $outer) {} } } public final class ItemUtils$$anonfun$2 extends AbstractPartialFunction<Tuple2<ItemStack[], Object>, Tuple2<ItemStack[], Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends Tuple2<ItemStack[], Object>, B1> B1 applyOrElse(Tuple2 x3, Function1 default) { Object object; Tuple2 tuple2 = x3; ItemStack[] inputs = (ItemStack[])tuple2._1(); int outputSize = tuple2._2$mcI$sp(); if (tuple2 != null && !scala.Predef$.MODULE$.refArrayOps((Object[])inputs).exists((Function1)new ItemUtils$$anonfun$2$$anonfun$applyOrElse$2(this))) { object = new Tuple2(inputs, BoxesRunTime.boxToInteger(outputSize)); } else { object = default.apply(x3); }  return (B1)object; } public final boolean isDefinedAt(Tuple2 x3) { boolean bool; Tuple2 tuple2 = x3; ItemStack[] inputs = (ItemStack[])tuple2._1(); if (tuple2 != null && !scala.Predef$.MODULE$.refArrayOps((Object[])inputs).exists((Function1)new ItemUtils$$anonfun$2$$anonfun$isDefinedAt$1(this))) { bool = true; } else { bool = false; }  return bool; } public final class ItemUtils$$anonfun$2$$anonfun$applyOrElse$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$isInputBlacklisted$1(stack); } public ItemUtils$$anonfun$2$$anonfun$applyOrElse$2(ItemUtils$$anonfun$2 $outer) {} } public final class ItemUtils$$anonfun$2$$anonfun$isDefinedAt$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*  72 */       public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$isInputBlacklisted$1(stack); } public ItemUtils$$anonfun$2$$anonfun$isDefinedAt$1(ItemUtils$$anonfun$2 $outer) {} } } public ItemStack[] getIngredients(ItemStack stack) { try { Option option = ((TraversableOnce)((TraversableLike)((TraversableLike)scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(CraftingManager.func_77594_a().func_77592_b()).map((Function1)new ItemUtils$$anonfun$3(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom())).filter((Function1)new ItemUtils$$anonfun$4(stack))).collect((PartialFunction)new ItemUtils$$anonfun$1(), scala.collection.mutable.Buffer$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new ItemUtils$$anonfun$2());
/*     */ 
/*     */ 
/*     */       
/*  76 */       return (ItemStack[])scala.Array$.MODULE$.empty(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)); }
/*     */     finally
/*     */     { Exception exception = null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     return (ItemStack[])scala.Array$.MODULE$.empty(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)); } public final class ItemUtils$$anonfun$getIngredients$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final boolean apply(ItemStack ingredient) { return ingredient.func_77969_a(this.stack$1); } public ItemUtils$$anonfun$getIngredients$1(ItemStack stack$1) {} } public final class ItemUtils$$anonfun$getIngredients$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ArrayBuffer merged$1; public ItemUtils$$anonfun$getIngredients$2(ArrayBuffer merged$1) {} public final Object apply(ItemStack ingredient) { ArrayBuffer arrayBuffer; Option option = this.merged$1.find((Function1)new ItemUtils$$anonfun$getIngredients$2$$anonfun$5(this, ingredient)); if (option instanceof Some) { Some some = (Some)option; ItemStack entry = (ItemStack)some.x(); entry.field_77994_a += ingredient.field_77994_a; BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { arrayBuffer = this.merged$1.$plus$eq(ingredient.func_77946_l()); }  return arrayBuffer; } public final class ItemUtils$$anonfun$getIngredients$2$$anonfun$5 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/* 109 */       public static final long serialVersionUID = 0L; private final ItemStack ingredient$1; public final boolean apply(ItemStack x$4) { return x$4.func_77969_a(this.ingredient$1); } public ItemUtils$$anonfun$getIngredients$2$$anonfun$5(ItemUtils$$anonfun$getIngredients$2 $outer, ItemStack ingredient$1) {} } } public final class ItemUtils$$anonfun$getIngredients$3 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final int count$1; public final void apply(ItemStack x$5) { x$5.field_77994_a /= this.count$1; } public ItemUtils$$anonfun$getIngredients$3(int count$1) {} } public final class ItemUtils$$anonfun$getIngredients$4 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayBuffer distinct$1; public ItemUtils$$anonfun$getIngredients$4(ArrayBuffer distinct$1) {} public final void apply(ItemStack ingredient) { int size = scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(ingredient.field_77994_a), 1); ingredient.field_77994_a = 1; scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), size).foreach((Function1)new ItemUtils$$anonfun$getIngredients$4$$anonfun$apply$1(this, ingredient)); } public final class ItemUtils$$anonfun$getIngredients$4$$anonfun$apply$1 extends AbstractFunction1<Object, ArrayBuffer<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack ingredient$2; public ItemUtils$$anonfun$getIngredients$4$$anonfun$apply$1(ItemUtils$$anonfun$getIngredients$4 $outer, ItemStack ingredient$2) {} public final ArrayBuffer<ItemStack> apply(int i) { return this.$outer.distinct$1.$plus$eq(this.ingredient$2.func_77946_l()); } } } private Random li$cil$oc$util$ItemUtils$$rng$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$util$ItemUtils$$rng = new Random(); this.bitmap$0 = true; }  return this.li$cil$oc$util$ItemUtils$$rng; }  } public Random li$cil$oc$util$ItemUtils$$rng() { return this.bitmap$0 ? this.li$cil$oc$util$ItemUtils$$rng : li$cil$oc$util$ItemUtils$$rng$lzycompute(); }
/*     */   
/* 111 */   public <T> Iterable<ItemStack> li$cil$oc$util$ItemUtils$$resolveOreDictEntries(Iterable entries) { return (Iterable<ItemStack>)entries.collect((PartialFunction)new ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$resolveOreDictEntries$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ItemUtils$$anonfun$li$cil$oc$util$ItemUtils$$resolveOreDictEntries$1 extends AbstractPartialFunction<T, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends T, B1> B1 applyOrElse(Object x2, Function1 default) { Object object2, object1 = x2;
/* 112 */       if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1; }
/* 113 */       else { if (object1 instanceof ArrayList) { ArrayList<Object> arrayList = (ArrayList)object1; if (!arrayList.isEmpty()) return (B1)arrayList.get(ItemUtils$.MODULE$.li$cil$oc$util$ItemUtils$$rng().nextInt(arrayList.size()));  }  object2 = default.apply(x2); }  return (B1)object2; } public final boolean isDefinedAt(Object x2) { boolean bool; Object object = x2; if (object instanceof ItemStack) { bool = true; } else { if (object instanceof ArrayList) { ArrayList arrayList = (ArrayList)object; if (!arrayList.isEmpty())
/*     */             return true;  }
/*     */          bool = false; }
/* 116 */        return bool; } } private ItemUtils$() { MODULE$ = this; }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ItemUtils$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */