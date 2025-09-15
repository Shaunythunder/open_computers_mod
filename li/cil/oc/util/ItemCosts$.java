/*     */ package li.cil.oc.util;
/*     */ import java.util.List;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class ItemCosts$ {
/*     */   public static final ItemCosts$ MODULE$;
/*     */   private final int Timeout;
/*     */   
/*     */   private final int Timeout() {
/*  23 */     return 500;
/*     */   } private final Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> li$cil$oc$util$ItemCosts$$cache; private long started; public Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> li$cil$oc$util$ItemCosts$$cache() {
/*  25 */     return this.li$cil$oc$util$ItemCosts$$cache;
/*     */   }
/*  27 */   private long started() { return this.started; } private void started_$eq(long x$1) { this.started = x$1; }
/*     */ 
/*     */   
/*     */   public Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> terminate(Item item, int meta) {
/*  31 */     (new Tuple2[1])[0] = new Tuple2(new ItemStack(item, 1, meta), BoxesRunTime.boxToDouble(1.0D)); return (Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>)li$cil$oc$util$ItemCosts$$cache().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(new ItemStackWrapper(new ItemStack(item, 1, meta))), scala.collection.mutable.Iterable$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[1])))); } public int terminate$default$2() { return 0; }
/*     */    public Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> terminate(Block block) {
/*  33 */     (new Tuple2[1])[0] = new Tuple2(new ItemStack(block), BoxesRunTime.boxToDouble(1.0D)); return (Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>)li$cil$oc$util$ItemCosts$$cache().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(new ItemStackWrapper(new ItemStack(block))), scala.collection.mutable.Iterable$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[1]))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ItemCosts$$anonfun$1
/*     */     extends AbstractFunction1<Object, Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final Map<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>> apply(int i) {
/*  46 */       return ItemCosts$.MODULE$.terminate(Items.field_151100_aR, i);
/*     */     }
/*     */   }
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
/*     */   public boolean hasCosts(ItemStack stack) {
/*  62 */     if (!li.cil.oc.integration.Mods$.MODULE$.CraftingCosts().isAvailable()) {
/*  63 */       Iterable<Tuple2<ItemStack, Object>> ingredients = computeIngredients(stack);
/*  64 */       if ((ingredients.size() > 0 && (ingredients.size() > 1 || !((ItemStack)((Tuple2)ingredients.head())._1()).func_77969_a(stack))));
/*     */     } 
/*     */     return false;
/*     */   }
/*  68 */   public void addTooltip(ItemStack stack, List<String> tooltip) { tooltip.add(li.cil.oc.Localization$Tooltip$.MODULE$.Materials());
/*  69 */     computeIngredients(stack).withFilter((Function1)new ItemCosts$$anonfun$addTooltip$1()).foreach((Function1)new ItemCosts$$anonfun$addTooltip$2(tooltip)); } public final class ItemCosts$$anonfun$addTooltip$1 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class ItemCosts$$anonfun$addTooltip$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public final boolean apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { ItemStack ingredient = (ItemStack)tuple2._1(); double count = tuple2._2$mcD$sp();
/*  70 */         String line = (new StringBuilder()).append((int)scala.math.package$.MODULE$.ceil(count)).append("x ").append(ingredient.func_82833_r()).toString();
/*  71 */         return this.tooltip$1.add(line); }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      public ItemCosts$$anonfun$addTooltip$2(List tooltip$1) {} }
/*  75 */   public Iterable<Tuple2<ItemStack, Object>> computeIngredients(ItemStack what) { synchronized (li$cil$oc$util$ItemCosts$$cache()) {
/*  76 */       started_$eq(System.currentTimeMillis());
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
/* 144 */       return li$cil$oc$util$ItemCosts$$accumulate$1(what, accumulate$default$2$1());
/*     */     }  } private final Iterable deflate$1(Iterable list) {
/*     */     Map counts = scala.collection.mutable.Map$.MODULE$.empty();
/*     */     list.withFilter((Function1)new ItemCosts$$anonfun$deflate$1$1()).foreach((Function1)new ItemCosts$$anonfun$deflate$1$2(counts));
/*     */     return (Iterable)counts;
/*     */   } public final class ItemCosts$$anonfun$deflate$1$1 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$2) {
/*     */       boolean bool;
/*     */       Tuple2 tuple2 = check$ifrefutable$2;
/*     */       if (tuple2 != null) {
/*     */         bool = true;
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     } } private ItemCosts$() {
/* 160 */     MODULE$ = this;
/*     */     this.li$cil$oc$util$ItemCosts$$cache = scala.collection.mutable.Map$.MODULE$.empty();
/*     */     this.started = 0L;
/*     */     (new Tuple2[1])[0] = new Tuple2(new ItemStack(Items.field_151042_j), BoxesRunTime.boxToDouble(0.1111111111111111D));
/*     */     li$cil$oc$util$ItemCosts$$cache().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(new ItemStackWrapper(Items.get("nuggetIron").createItemStack(1))), scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[1]))));
/*     */     terminate(Blocks.field_150435_aG);
/*     */     terminate(Blocks.field_150347_e);
/*     */     terminate(Blocks.field_150359_w);
/*     */     terminate(Blocks.field_150344_f);
/*     */     terminate((Block)Blocks.field_150354_m);
/*     */     terminate(Blocks.field_150348_b);
/*     */     terminate(Items.field_151072_bj, terminate$default$2());
/*     */     terminate(Items.field_151133_ar, terminate$default$2());
/*     */     terminate(Items.field_151119_aD, terminate$default$2());
/*     */     terminate(Items.field_151044_h, terminate$default$2());
/*     */     terminate(Items.field_151045_i, terminate$default$2());
/*     */     scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(0), 15).foreach((Function1)new ItemCosts$$anonfun$1());
/*     */     terminate(Items.field_151166_bC, terminate$default$2());
/*     */     terminate(Items.field_151079_bi, terminate$default$2());
/*     */     terminate(Items.field_151061_bv, terminate$default$2());
/*     */     terminate(Items.field_151073_bk, terminate$default$2());
/*     */     terminate(Items.field_151114_aO, terminate$default$2());
/*     */     terminate(Items.field_151043_k, terminate$default$2());
/*     */     terminate(Items.field_151042_j, terminate$default$2());
/*     */     terminate(Items.field_151128_bU, terminate$default$2());
/*     */     terminate(Items.field_151156_bN, terminate$default$2());
/*     */     terminate(Items.field_151121_aF, terminate$default$2());
/*     */     terminate(Items.field_151137_ax, terminate$default$2());
/*     */     terminate(Items.field_151007_F, terminate$default$2());
/*     */     terminate(Items.field_151123_aH, terminate$default$2());
/*     */     terminate(Items.field_151055_y, terminate$default$2());
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$deflate$1$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Map counts$1;
/*     */     
/*     */     public final Object apply(Tuple2 x$2) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: ifnull -> 150
/*     */       //   6: aload_2
/*     */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   10: checkcast net/minecraft/item/ItemStack
/*     */       //   13: astore_3
/*     */       //   14: aload_2
/*     */       //   15: invokevirtual _2$mcD$sp : ()D
/*     */       //   18: dstore #4
/*     */       //   20: aload_0
/*     */       //   21: getfield counts$1 : Lscala/collection/mutable/Map;
/*     */       //   24: new li/cil/oc/util/ItemCosts$$anonfun$deflate$1$2$$anonfun$2
/*     */       //   27: dup
/*     */       //   28: aload_0
/*     */       //   29: aload_3
/*     */       //   30: invokespecial <init> : (Lli/cil/oc/util/ItemCosts$$anonfun$deflate$1$2;Lnet/minecraft/item/ItemStack;)V
/*     */       //   33: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */       //   38: astore #7
/*     */       //   40: aload #7
/*     */       //   42: instanceof scala/Some
/*     */       //   45: ifeq -> 114
/*     */       //   48: aload #7
/*     */       //   50: checkcast scala/Some
/*     */       //   53: astore #8
/*     */       //   55: aload #8
/*     */       //   57: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   60: checkcast scala/Tuple2
/*     */       //   63: astore #9
/*     */       //   65: aload #9
/*     */       //   67: ifnull -> 114
/*     */       //   70: aload #9
/*     */       //   72: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   75: checkcast net/minecraft/item/ItemStack
/*     */       //   78: astore #10
/*     */       //   80: aload #9
/*     */       //   82: invokevirtual _2$mcD$sp : ()D
/*     */       //   85: dstore #11
/*     */       //   87: aload_0
/*     */       //   88: getfield counts$1 : Lscala/collection/mutable/Map;
/*     */       //   91: aload #10
/*     */       //   93: dload #11
/*     */       //   95: dload #4
/*     */       //   97: dadd
/*     */       //   98: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */       //   101: invokeinterface update : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   106: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   109: astore #13
/*     */       //   111: goto -> 143
/*     */       //   114: aload_0
/*     */       //   115: getfield counts$1 : Lscala/collection/mutable/Map;
/*     */       //   118: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */       //   121: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   124: aload_3
/*     */       //   125: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   128: dload #4
/*     */       //   130: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */       //   133: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */       //   136: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*     */       //   141: astore #13
/*     */       //   143: aload #13
/*     */       //   145: astore #6
/*     */       //   147: aload #6
/*     */       //   149: areturn
/*     */       //   150: new scala/MatchError
/*     */       //   153: dup
/*     */       //   154: aload_2
/*     */       //   155: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   158: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #79	-> 0
/*     */       //   #80	-> 20
/*     */       //   #83	-> 40
/*     */       //   #84	-> 114
/*     */       //   #80	-> 143
/*     */       //   #79	-> 147
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	159	0	this	Lli/cil/oc/util/ItemCosts$$anonfun$deflate$1$2;
/*     */       //   0	159	1	x$2	Lscala/Tuple2;
/*     */       //   14	145	3	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   20	139	4	count	D
/*     */       //   80	79	10	key	Lnet/minecraft/item/ItemStack;
/*     */       //   87	72	11	value	D
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$deflate$1$2(Map counts$1) {}
/*     */     
/*     */     public final class ItemCosts$$anonfun$deflate$1$2$$anonfun$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final ItemStack stack$1;
/*     */       
/*     */       public final boolean apply(Tuple2 x0$1) {
/*     */         Tuple2 tuple2 = x0$1;
/*     */         if (tuple2 != null) {
/*     */           ItemStack key = (ItemStack)tuple2._1();
/*     */           return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(key, this.stack$1);
/*     */         } 
/*     */         throw new MatchError(tuple2);
/*     */       }
/*     */       
/*     */       public ItemCosts$$anonfun$deflate$1$2$$anonfun$2(ItemCosts$$anonfun$deflate$1$2 $outer, ItemStack stack$1) {}
/*     */     }
/*     */   }
/*     */   
/*     */   private final Seq accumulate$default$2$1() {
/*     */     return (Seq)scala.collection.Seq$.MODULE$.empty();
/*     */   }
/*     */   
/*     */   public final Iterable li$cil$oc$util$ItemCosts$$accumulate$1(Object input, Seq path) {
/*     */     // Byte code:
/*     */     //   0: invokestatic currentTimeMillis : ()J
/*     */     //   3: aload_0
/*     */     //   4: invokespecial started : ()J
/*     */     //   7: lsub
/*     */     //   8: lstore_3
/*     */     //   9: lload_3
/*     */     //   10: ldc2_w 500
/*     */     //   13: lcmp
/*     */     //   14: ifle -> 32
/*     */     //   17: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   20: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   23: invokevirtual empty : ()Lscala/collection/GenTraversable;
/*     */     //   26: checkcast scala/collection/Iterable
/*     */     //   29: goto -> 1244
/*     */     //   32: aload_1
/*     */     //   33: astore #5
/*     */     //   35: aload #5
/*     */     //   37: instanceof net/minecraft/item/ItemStack
/*     */     //   40: ifeq -> 1107
/*     */     //   43: aload #5
/*     */     //   45: checkcast net/minecraft/item/ItemStack
/*     */     //   48: astore #6
/*     */     //   50: aload_0
/*     */     //   51: invokevirtual li$cil$oc$util$ItemCosts$$cache : ()Lscala/collection/mutable/Map;
/*     */     //   54: new li/cil/oc/util/ItemCosts$$anonfun$3
/*     */     //   57: dup
/*     */     //   58: aload #6
/*     */     //   60: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   63: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   68: astore #8
/*     */     //   70: aload #8
/*     */     //   72: instanceof scala/Some
/*     */     //   75: ifeq -> 117
/*     */     //   78: aload #8
/*     */     //   80: checkcast scala/Some
/*     */     //   83: astore #9
/*     */     //   85: aload #9
/*     */     //   87: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   90: checkcast scala/Tuple2
/*     */     //   93: astore #10
/*     */     //   95: aload #10
/*     */     //   97: ifnull -> 117
/*     */     //   100: aload #10
/*     */     //   102: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   105: checkcast scala/collection/Iterable
/*     */     //   108: astore #11
/*     */     //   110: aload #11
/*     */     //   112: astore #12
/*     */     //   114: goto -> 1090
/*     */     //   117: aload_2
/*     */     //   118: new li/cil/oc/util/ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$1
/*     */     //   121: dup
/*     */     //   122: aload #6
/*     */     //   124: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   127: invokeinterface exists : (Lscala/Function1;)Z
/*     */     //   132: ifeq -> 179
/*     */     //   135: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   138: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   141: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   144: iconst_1
/*     */     //   145: anewarray scala/Tuple2
/*     */     //   148: dup
/*     */     //   149: iconst_0
/*     */     //   150: new scala/Tuple2
/*     */     //   153: dup
/*     */     //   154: aload #6
/*     */     //   156: dconst_1
/*     */     //   157: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   160: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   163: aastore
/*     */     //   164: checkcast [Ljava/lang/Object;
/*     */     //   167: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   170: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   173: checkcast scala/collection/Iterable
/*     */     //   176: goto -> 1088
/*     */     //   179: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   182: invokestatic func_77594_a : ()Lnet/minecraft/item/crafting/CraftingManager;
/*     */     //   185: invokevirtual func_77592_b : ()Ljava/util/List;
/*     */     //   188: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   191: new li/cil/oc/util/ItemCosts$$anonfun$4
/*     */     //   194: dup
/*     */     //   195: invokespecial <init> : ()V
/*     */     //   198: getstatic scala/collection/mutable/Buffer$.MODULE$ : Lscala/collection/mutable/Buffer$;
/*     */     //   201: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   204: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   209: checkcast scala/collection/mutable/Buffer
/*     */     //   212: astore #13
/*     */     //   214: aload #13
/*     */     //   216: ifnonnull -> 263
/*     */     //   219: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   222: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   225: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   228: iconst_1
/*     */     //   229: anewarray scala/Tuple2
/*     */     //   232: dup
/*     */     //   233: iconst_0
/*     */     //   234: new scala/Tuple2
/*     */     //   237: dup
/*     */     //   238: aload #6
/*     */     //   240: dconst_1
/*     */     //   241: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   244: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   247: aastore
/*     */     //   248: checkcast [Ljava/lang/Object;
/*     */     //   251: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   254: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   257: checkcast scala/collection/Iterable
/*     */     //   260: goto -> 1088
/*     */     //   263: aload #13
/*     */     //   265: new li/cil/oc/util/ItemCosts$$anonfun$5
/*     */     //   268: dup
/*     */     //   269: invokespecial <init> : ()V
/*     */     //   272: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   277: checkcast scala/collection/IterableLike
/*     */     //   280: new li/cil/oc/util/ItemCosts$$anonfun$6
/*     */     //   283: dup
/*     */     //   284: aload #6
/*     */     //   286: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   289: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   294: astore #14
/*     */     //   296: iconst_0
/*     */     //   297: istore #17
/*     */     //   299: aconst_null
/*     */     //   300: astore #18
/*     */     //   302: aload #14
/*     */     //   304: astore #19
/*     */     //   306: aload #19
/*     */     //   308: instanceof scala/Some
/*     */     //   311: ifeq -> 429
/*     */     //   314: iconst_1
/*     */     //   315: istore #17
/*     */     //   317: aload #19
/*     */     //   319: checkcast scala/Some
/*     */     //   322: astore #18
/*     */     //   324: aload #18
/*     */     //   326: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   329: checkcast net/minecraft/item/crafting/IRecipe
/*     */     //   332: astore #20
/*     */     //   334: aload #20
/*     */     //   336: instanceof net/minecraft/item/crafting/ShapedRecipes
/*     */     //   339: ifeq -> 429
/*     */     //   342: aload #20
/*     */     //   344: checkcast net/minecraft/item/crafting/ShapedRecipes
/*     */     //   347: astore #21
/*     */     //   349: new scala/Tuple2
/*     */     //   352: dup
/*     */     //   353: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   356: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   359: aload #21
/*     */     //   361: getfield field_77574_d : [Lnet/minecraft/item/ItemStack;
/*     */     //   364: checkcast [Ljava/lang/Object;
/*     */     //   367: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   370: new li/cil/oc/util/ItemCosts$$anonfun$7
/*     */     //   373: dup
/*     */     //   374: aload_2
/*     */     //   375: aload #6
/*     */     //   377: invokespecial <init> : (Lscala/collection/Seq;Lnet/minecraft/item/ItemStack;)V
/*     */     //   380: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   383: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   386: ldc scala/Tuple2
/*     */     //   388: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   391: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */     //   394: invokeinterface flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   399: checkcast [Ljava/lang/Object;
/*     */     //   402: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   405: invokeinterface toIterable : ()Lscala/collection/Iterable;
/*     */     //   410: aload #21
/*     */     //   412: invokevirtual func_77571_b : ()Lnet/minecraft/item/ItemStack;
/*     */     //   415: getfield field_77994_a : I
/*     */     //   418: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   421: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   424: astore #22
/*     */     //   426: goto -> 898
/*     */     //   429: iload #17
/*     */     //   431: ifeq -> 522
/*     */     //   434: aload #18
/*     */     //   436: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   439: checkcast net/minecraft/item/crafting/IRecipe
/*     */     //   442: astore #23
/*     */     //   444: aload #23
/*     */     //   446: instanceof net/minecraft/item/crafting/ShapelessRecipes
/*     */     //   449: ifeq -> 522
/*     */     //   452: aload #23
/*     */     //   454: checkcast net/minecraft/item/crafting/ShapelessRecipes
/*     */     //   457: astore #24
/*     */     //   459: new scala/Tuple2
/*     */     //   462: dup
/*     */     //   463: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   466: aload #24
/*     */     //   468: getfield field_77579_b : Ljava/util/List;
/*     */     //   471: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   474: new li/cil/oc/util/ItemCosts$$anonfun$8
/*     */     //   477: dup
/*     */     //   478: aload_2
/*     */     //   479: aload #6
/*     */     //   481: invokespecial <init> : (Lscala/collection/Seq;Lnet/minecraft/item/ItemStack;)V
/*     */     //   484: getstatic scala/collection/mutable/Buffer$.MODULE$ : Lscala/collection/mutable/Buffer$;
/*     */     //   487: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   490: invokeinterface flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   495: checkcast scala/collection/IterableLike
/*     */     //   498: invokeinterface toIterable : ()Lscala/collection/Iterable;
/*     */     //   503: aload #24
/*     */     //   505: invokevirtual func_77571_b : ()Lnet/minecraft/item/ItemStack;
/*     */     //   508: getfield field_77994_a : I
/*     */     //   511: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   514: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   517: astore #22
/*     */     //   519: goto -> 898
/*     */     //   522: iload #17
/*     */     //   524: ifeq -> 629
/*     */     //   527: aload #18
/*     */     //   529: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   532: checkcast net/minecraft/item/crafting/IRecipe
/*     */     //   535: astore #25
/*     */     //   537: aload #25
/*     */     //   539: instanceof net/minecraftforge/oredict/ShapedOreRecipe
/*     */     //   542: ifeq -> 629
/*     */     //   545: aload #25
/*     */     //   547: checkcast net/minecraftforge/oredict/ShapedOreRecipe
/*     */     //   550: astore #26
/*     */     //   552: new scala/Tuple2
/*     */     //   555: dup
/*     */     //   556: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   559: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   562: aload #26
/*     */     //   564: invokevirtual getInput : ()[Ljava/lang/Object;
/*     */     //   567: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   570: new li/cil/oc/util/ItemCosts$$anonfun$9
/*     */     //   573: dup
/*     */     //   574: aload_2
/*     */     //   575: aload #6
/*     */     //   577: invokespecial <init> : (Lscala/collection/Seq;Lnet/minecraft/item/ItemStack;)V
/*     */     //   580: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   583: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   586: ldc scala/Tuple2
/*     */     //   588: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   591: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */     //   594: invokeinterface flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   599: checkcast [Ljava/lang/Object;
/*     */     //   602: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   605: invokeinterface toIterable : ()Lscala/collection/Iterable;
/*     */     //   610: aload #26
/*     */     //   612: invokevirtual func_77571_b : ()Lnet/minecraft/item/ItemStack;
/*     */     //   615: getfield field_77994_a : I
/*     */     //   618: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   621: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   624: astore #22
/*     */     //   626: goto -> 898
/*     */     //   629: iload #17
/*     */     //   631: ifeq -> 722
/*     */     //   634: aload #18
/*     */     //   636: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   639: checkcast net/minecraft/item/crafting/IRecipe
/*     */     //   642: astore #27
/*     */     //   644: aload #27
/*     */     //   646: instanceof net/minecraftforge/oredict/ShapelessOreRecipe
/*     */     //   649: ifeq -> 722
/*     */     //   652: aload #27
/*     */     //   654: checkcast net/minecraftforge/oredict/ShapelessOreRecipe
/*     */     //   657: astore #28
/*     */     //   659: new scala/Tuple2
/*     */     //   662: dup
/*     */     //   663: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   666: aload #28
/*     */     //   668: invokevirtual getInput : ()Ljava/util/ArrayList;
/*     */     //   671: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   674: new li/cil/oc/util/ItemCosts$$anonfun$10
/*     */     //   677: dup
/*     */     //   678: aload_2
/*     */     //   679: aload #6
/*     */     //   681: invokespecial <init> : (Lscala/collection/Seq;Lnet/minecraft/item/ItemStack;)V
/*     */     //   684: getstatic scala/collection/mutable/Buffer$.MODULE$ : Lscala/collection/mutable/Buffer$;
/*     */     //   687: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   690: invokeinterface flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   695: checkcast scala/collection/IterableLike
/*     */     //   698: invokeinterface toIterable : ()Lscala/collection/Iterable;
/*     */     //   703: aload #28
/*     */     //   705: invokevirtual func_77571_b : ()Lnet/minecraft/item/ItemStack;
/*     */     //   708: getfield field_77994_a : I
/*     */     //   711: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   714: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   717: astore #22
/*     */     //   719: goto -> 898
/*     */     //   722: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   725: invokestatic func_77602_a : ()Lnet/minecraft/item/crafting/FurnaceRecipes;
/*     */     //   728: invokevirtual func_77599_b : ()Ljava/util/Map;
/*     */     //   731: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*     */     //   734: new li/cil/oc/util/ItemCosts$$anonfun$11
/*     */     //   737: dup
/*     */     //   738: aload #6
/*     */     //   740: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   743: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   748: astore #29
/*     */     //   750: aload #29
/*     */     //   752: instanceof scala/Some
/*     */     //   755: ifeq -> 843
/*     */     //   758: aload #29
/*     */     //   760: checkcast scala/Some
/*     */     //   763: astore #30
/*     */     //   765: aload #30
/*     */     //   767: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   770: checkcast scala/Tuple2
/*     */     //   773: astore #31
/*     */     //   775: aload #31
/*     */     //   777: ifnull -> 843
/*     */     //   780: aload #31
/*     */     //   782: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   785: checkcast net/minecraft/item/ItemStack
/*     */     //   788: astore #32
/*     */     //   790: aload #31
/*     */     //   792: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   795: checkcast net/minecraft/item/ItemStack
/*     */     //   798: astore #33
/*     */     //   800: new scala/Tuple2
/*     */     //   803: dup
/*     */     //   804: aload_0
/*     */     //   805: aload #32
/*     */     //   807: aload_2
/*     */     //   808: aload #6
/*     */     //   810: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*     */     //   813: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   816: invokeinterface $colon$plus : (Ljava/lang/Object;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   821: checkcast scala/collection/Seq
/*     */     //   824: invokevirtual li$cil$oc$util$ItemCosts$$accumulate$1 : (Ljava/lang/Object;Lscala/collection/Seq;)Lscala/collection/Iterable;
/*     */     //   827: aload #33
/*     */     //   829: getfield field_77994_a : I
/*     */     //   832: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   835: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   838: astore #34
/*     */     //   840: goto -> 894
/*     */     //   843: new scala/Tuple2
/*     */     //   846: dup
/*     */     //   847: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   850: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   853: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   856: iconst_1
/*     */     //   857: anewarray scala/Tuple2
/*     */     //   860: dup
/*     */     //   861: iconst_0
/*     */     //   862: new scala/Tuple2
/*     */     //   865: dup
/*     */     //   866: aload #6
/*     */     //   868: dconst_1
/*     */     //   869: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   872: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   875: aastore
/*     */     //   876: checkcast [Ljava/lang/Object;
/*     */     //   879: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   882: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   885: iconst_1
/*     */     //   886: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   889: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   892: astore #34
/*     */     //   894: aload #34
/*     */     //   896: astore #22
/*     */     //   898: aload #22
/*     */     //   900: astore #16
/*     */     //   902: aload #16
/*     */     //   904: ifnull -> 1097
/*     */     //   907: aload #16
/*     */     //   909: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   912: checkcast scala/collection/Iterable
/*     */     //   915: astore #35
/*     */     //   917: aload #16
/*     */     //   919: invokevirtual _2$mcI$sp : ()I
/*     */     //   922: istore #36
/*     */     //   924: new scala/Tuple2
/*     */     //   927: dup
/*     */     //   928: aload #35
/*     */     //   930: iload #36
/*     */     //   932: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   935: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   938: astore #37
/*     */     //   940: aload #37
/*     */     //   942: astore #15
/*     */     //   944: aload #15
/*     */     //   946: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   949: checkcast scala/collection/Iterable
/*     */     //   952: astore #38
/*     */     //   954: aload #15
/*     */     //   956: invokevirtual _2$mcI$sp : ()I
/*     */     //   959: istore #39
/*     */     //   961: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   964: aload_0
/*     */     //   965: aload #38
/*     */     //   967: new li/cil/oc/util/ItemCosts$$anonfun$12
/*     */     //   970: dup
/*     */     //   971: iload #39
/*     */     //   973: invokespecial <init> : (I)V
/*     */     //   976: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   979: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   982: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   987: checkcast scala/collection/Iterable
/*     */     //   990: invokespecial deflate$1 : (Lscala/collection/Iterable;)Lscala/collection/Iterable;
/*     */     //   993: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   996: ldc scala/Tuple2
/*     */     //   998: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   1001: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   1006: checkcast [Ljava/lang/Object;
/*     */     //   1009: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   1012: new li/cil/oc/util/ItemCosts$$anonfun$13
/*     */     //   1015: dup
/*     */     //   1016: invokespecial <init> : ()V
/*     */     //   1019: getstatic scala/math/Ordering$String$.MODULE$ : Lscala/math/Ordering$String$;
/*     */     //   1022: invokeinterface sortBy : (Lscala/Function1;Lscala/math/Ordering;)Ljava/lang/Object;
/*     */     //   1027: checkcast [Lscala/Tuple2;
/*     */     //   1030: astore #40
/*     */     //   1032: aload_0
/*     */     //   1033: invokevirtual li$cil$oc$util$ItemCosts$$cache : ()Lscala/collection/mutable/Map;
/*     */     //   1036: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   1039: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1042: new li/cil/oc/util/ItemStackWrapper
/*     */     //   1045: dup
/*     */     //   1046: aload #6
/*     */     //   1048: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   1051: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   1054: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1057: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1060: aload #40
/*     */     //   1062: checkcast [Ljava/lang/Object;
/*     */     //   1065: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1068: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   1071: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*     */     //   1076: pop
/*     */     //   1077: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1080: aload #40
/*     */     //   1082: checkcast [Ljava/lang/Object;
/*     */     //   1085: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1088: astore #12
/*     */     //   1090: aload #12
/*     */     //   1092: astore #7
/*     */     //   1094: goto -> 1242
/*     */     //   1097: new scala/MatchError
/*     */     //   1100: dup
/*     */     //   1101: aload #16
/*     */     //   1103: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1106: athrow
/*     */     //   1107: aload #5
/*     */     //   1109: instanceof java/util/ArrayList
/*     */     //   1112: ifeq -> 1228
/*     */     //   1115: aload #5
/*     */     //   1117: checkcast java/util/ArrayList
/*     */     //   1120: astore #41
/*     */     //   1122: aload #41
/*     */     //   1124: invokevirtual isEmpty : ()Z
/*     */     //   1127: ifne -> 1228
/*     */     //   1130: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   1133: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   1136: invokevirtual empty : ()Lscala/collection/GenTraversable;
/*     */     //   1139: checkcast scala/collection/Iterable
/*     */     //   1142: invokestatic create : (Ljava/lang/Object;)Lscala/runtime/ObjectRef;
/*     */     //   1145: astore #42
/*     */     //   1147: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   1150: aload #41
/*     */     //   1152: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   1155: new li/cil/oc/util/ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$2
/*     */     //   1158: dup
/*     */     //   1159: aload #42
/*     */     //   1161: invokespecial <init> : (Lscala/runtime/ObjectRef;)V
/*     */     //   1164: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   1169: new li/cil/oc/util/ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3
/*     */     //   1172: dup
/*     */     //   1173: aload #42
/*     */     //   1175: invokespecial <init> : (Lscala/runtime/ObjectRef;)V
/*     */     //   1178: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   1183: aload #42
/*     */     //   1185: getfield elem : Ljava/lang/Object;
/*     */     //   1188: checkcast scala/collection/Iterable
/*     */     //   1191: invokeinterface isEmpty : ()Z
/*     */     //   1196: ifeq -> 1215
/*     */     //   1199: aload #42
/*     */     //   1201: aload_0
/*     */     //   1202: aload #41
/*     */     //   1204: iconst_0
/*     */     //   1205: invokevirtual get : (I)Ljava/lang/Object;
/*     */     //   1208: aload_2
/*     */     //   1209: invokevirtual li$cil$oc$util$ItemCosts$$accumulate$1 : (Ljava/lang/Object;Lscala/collection/Seq;)Lscala/collection/Iterable;
/*     */     //   1212: putfield elem : Ljava/lang/Object;
/*     */     //   1215: aload #42
/*     */     //   1217: getfield elem : Ljava/lang/Object;
/*     */     //   1220: checkcast scala/collection/Iterable
/*     */     //   1223: astore #7
/*     */     //   1225: goto -> 1242
/*     */     //   1228: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   1231: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   1234: invokevirtual empty : ()Lscala/collection/GenTraversable;
/*     */     //   1237: checkcast scala/collection/Iterable
/*     */     //   1240: astore #7
/*     */     //   1242: aload #7
/*     */     //   1244: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 0
/*     */     //   #91	-> 9
/*     */     //   #92	-> 32
/*     */     //   #93	-> 35
/*     */     //   #94	-> 50
/*     */     //   #97	-> 70
/*     */     //   #99	-> 117
/*     */     //   #100	-> 135
/*     */     //   #103	-> 179
/*     */     //   #104	-> 214
/*     */     //   #106	-> 263
/*     */     //   #108	-> 296
/*     */     //   #107	-> 302
/*     */     //   #108	-> 306
/*     */     //   #107	-> 429
/*     */     //   #109	-> 434
/*     */     //   #107	-> 522
/*     */     //   #110	-> 527
/*     */     //   #107	-> 629
/*     */     //   #111	-> 634
/*     */     //   #112	-> 722
/*     */     //   #115	-> 750
/*     */     //   #116	-> 843
/*     */     //   #112	-> 894
/*     */     //   #107	-> 898
/*     */     //   #121	-> 961
/*     */     //   #119	-> 964
/*     */     //   #121	-> 993
/*     */     //   #119	-> 1030
/*     */     //   #122	-> 1032
/*     */     //   #123	-> 1077
/*     */     //   #99	-> 1088
/*     */     //   #94	-> 1090
/*     */     //   #107	-> 1097
/*     */     //   #127	-> 1107
/*     */     //   #128	-> 1130
/*     */     //   #129	-> 1147
/*     */     //   #137	-> 1183
/*     */     //   #138	-> 1199
/*     */     //   #140	-> 1215
/*     */     //   #127	-> 1223
/*     */     //   #141	-> 1228
/*     */     //   #92	-> 1242
/*     */     //   #89	-> 1244
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1245	0	this	Lli/cil/oc/util/ItemCosts$;
/*     */     //   0	1245	1	input	Ljava/lang/Object;
/*     */     //   0	1245	2	path	Lscala/collection/Seq;
/*     */     //   9	1236	3	passed	J
/*     */     //   110	1135	11	value	Lscala/collection/Iterable;
/*     */     //   214	1031	13	recipes	Lscala/collection/mutable/Buffer;
/*     */     //   296	792	14	recipe	Lscala/Option;
/*     */     //   334	911	20	recipe	Lnet/minecraft/item/crafting/IRecipe;
/*     */     //   444	801	23	recipe	Lnet/minecraft/item/crafting/IRecipe;
/*     */     //   537	708	25	recipe	Lnet/minecraft/item/crafting/IRecipe;
/*     */     //   644	601	27	recipe	Lnet/minecraft/item/crafting/IRecipe;
/*     */     //   790	455	32	rein	Lnet/minecraft/item/ItemStack;
/*     */     //   800	445	33	raus	Lnet/minecraft/item/ItemStack;
/*     */     //   917	328	35	ingredients	Lscala/collection/Iterable;
/*     */     //   924	321	36	output	I
/*     */     //   954	134	38	ingredients	Lscala/collection/Iterable;
/*     */     //   961	127	39	output	I
/*     */     //   1032	56	40	scaled	[Lscala/Tuple2;
/*     */     //   1147	76	42	result	Lscala/runtime/ObjectRef;
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$3 extends AbstractFunction1<Tuple2<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final boolean apply(Tuple2 x0$2) {
/*     */       Tuple2 tuple2 = x0$2;
/*     */       if (tuple2 != null) {
/*     */         ItemStackWrapper key = (ItemStackWrapper)tuple2._1();
/*     */         return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(key.inner(), this.x2$1);
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$3(ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final boolean apply(ItemStack value) {
/*     */       return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(value, this.x2$1);
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$1(ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$4 extends AbstractFunction1<Object, IRecipe> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final IRecipe apply(Object x$3) {
/*     */       return (IRecipe)x$3;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$5 extends AbstractFunction1<IRecipe, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(IRecipe x$4) {
/*     */       return !(x$4 == null);
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$6 extends AbstractFunction1<IRecipe, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final boolean apply(IRecipe recipe) {
/*     */       return (recipe.func_77571_b() != null && ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(this.x2$1, recipe.func_77571_b()));
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$6(ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$7 extends AbstractFunction1<ItemStack, Iterable<Tuple2<ItemStack, Object>>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Seq path$1;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final Iterable<Tuple2<ItemStack, Object>> apply(ItemStack x$5) {
/*     */       return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$5, (Seq)this.path$1.$colon$plus(this.x2$1, scala.collection.Seq$.MODULE$.canBuildFrom()));
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$7(Seq path$1, ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$8 extends AbstractFunction1<Object, Iterable<Tuple2<ItemStack, Object>>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Seq path$1;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final Iterable<Tuple2<ItemStack, Object>> apply(Object x$6) {
/*     */       return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$6, (Seq)this.path$1.$colon$plus(this.x2$1, scala.collection.Seq$.MODULE$.canBuildFrom()));
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$8(Seq path$1, ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$9 extends AbstractFunction1<Object, Iterable<Tuple2<ItemStack, Object>>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Seq path$1;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final Iterable<Tuple2<ItemStack, Object>> apply(Object x$7) {
/*     */       return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$7, (Seq)this.path$1.$colon$plus(this.x2$1, scala.collection.Seq$.MODULE$.canBuildFrom()));
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$9(Seq path$1, ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$10 extends AbstractFunction1<Object, Iterable<Tuple2<ItemStack, Object>>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Seq path$1;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final Iterable<Tuple2<ItemStack, Object>> apply(Object x$8) {
/*     */       return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$accumulate$1(x$8, (Seq)this.path$1.$colon$plus(this.x2$1, scala.collection.Seq$.MODULE$.canBuildFrom()));
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$10(Seq path$1, ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$11 extends AbstractFunction1<Tuple2<ItemStack, ItemStack>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack x2$1;
/*     */     
/*     */     public final boolean apply(Tuple2 x0$3) {
/*     */       Tuple2 tuple2 = x0$3;
/*     */       if (tuple2 != null) {
/*     */         ItemStack value = (ItemStack)tuple2._2();
/*     */         return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(this.x2$1, value);
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$11(ItemStack x2$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$12 extends AbstractFunction1<Tuple2<ItemStack, Object>, Tuple2<ItemStack, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final int output$1;
/*     */     
/*     */     public final Tuple2<ItemStack, Object> apply(Tuple2 x0$4) {
/*     */       Tuple2 tuple2 = x0$4;
/*     */       if (tuple2 != null) {
/*     */         ItemStack ingredient = (ItemStack)tuple2._1();
/*     */         double count = tuple2._2$mcD$sp();
/*     */         return new Tuple2(ingredient.func_77946_l(), BoxesRunTime.boxToDouble(count / this.output$1));
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$12(int output$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$13 extends AbstractFunction1<Tuple2<ItemStack, Object>, String> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final String apply(Tuple2 x$10) {
/*     */       return ((ItemStack)x$10._1()).func_77977_a();
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ObjectRef result$1;
/*     */     
/*     */     public final boolean apply(ItemStack stack) {
/*     */       return ((Iterable)this.result$1.elem).isEmpty();
/*     */     }
/*     */     
/*     */     public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$2(ObjectRef result$1) {}
/*     */   }
/*     */   
/*     */   public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ObjectRef result$1;
/*     */     
/*     */     public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3(ObjectRef result$1) {}
/*     */     
/*     */     public final void apply(ItemStack stack) {
/*     */       Option option = ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$cache().find((Function1)new ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3$$anonfun$14(this, stack));
/*     */       if (option instanceof Some) {
/*     */         Some some = (Some)option;
/*     */         Tuple2 tuple2 = (Tuple2)some.x();
/*     */         if (tuple2 != null) {
/*     */           Iterable value = (Iterable)tuple2._2();
/*     */           BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*     */           return;
/*     */         } 
/*     */       } 
/*     */       BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */     }
/*     */     
/*     */     public final class ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3$$anonfun$14 extends AbstractFunction1<Tuple2<ItemStackWrapper, Iterable<Tuple2<ItemStack, Object>>>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final ItemStack stack$2;
/*     */       
/*     */       public final boolean apply(Tuple2 x0$5) {
/*     */         Tuple2 tuple2 = x0$5;
/*     */         if (tuple2 != null) {
/*     */           ItemStackWrapper key = (ItemStackWrapper)tuple2._1();
/*     */           return ItemCosts$.MODULE$.li$cil$oc$util$ItemCosts$$fuzzyEquals(key.inner(), this.stack$2);
/*     */         } 
/*     */         throw new MatchError(tuple2);
/*     */       }
/*     */       
/*     */       public ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3$$anonfun$14(ItemCosts$$anonfun$li$cil$oc$util$ItemCosts$$accumulate$1$3 $outer, ItemStack stack$2) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean li$cil$oc$util$ItemCosts$$fuzzyEquals(ItemStack stack1, ItemStack stack2) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_2
/*     */     //   2: astore_3
/*     */     //   3: dup
/*     */     //   4: ifnonnull -> 15
/*     */     //   7: pop
/*     */     //   8: aload_3
/*     */     //   9: ifnull -> 102
/*     */     //   12: goto -> 22
/*     */     //   15: aload_3
/*     */     //   16: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   19: ifne -> 102
/*     */     //   22: aload_1
/*     */     //   23: ifnull -> 106
/*     */     //   26: aload_2
/*     */     //   27: ifnull -> 106
/*     */     //   30: aload_1
/*     */     //   31: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   34: aload_2
/*     */     //   35: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   38: astore #4
/*     */     //   40: dup
/*     */     //   41: ifnonnull -> 53
/*     */     //   44: pop
/*     */     //   45: aload #4
/*     */     //   47: ifnull -> 61
/*     */     //   50: goto -> 106
/*     */     //   53: aload #4
/*     */     //   55: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 106
/*     */     //   61: aload_1
/*     */     //   62: invokevirtual func_77960_j : ()I
/*     */     //   65: aload_2
/*     */     //   66: invokevirtual func_77960_j : ()I
/*     */     //   69: if_icmpeq -> 102
/*     */     //   72: aload_1
/*     */     //   73: invokevirtual func_77960_j : ()I
/*     */     //   76: sipush #32767
/*     */     //   79: if_icmpeq -> 102
/*     */     //   82: aload_2
/*     */     //   83: invokevirtual func_77960_j : ()I
/*     */     //   86: sipush #32767
/*     */     //   89: if_icmpeq -> 102
/*     */     //   92: aload_1
/*     */     //   93: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   96: invokevirtual func_77645_m : ()Z
/*     */     //   99: ifeq -> 106
/*     */     //   102: iconst_1
/*     */     //   103: goto -> 107
/*     */     //   106: iconst_0
/*     */     //   107: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #153	-> 0
/*     */     //   #154	-> 30
/*     */     //   #155	-> 61
/*     */     //   #156	-> 72
/*     */     //   #157	-> 82
/*     */     //   #158	-> 92
/*     */     //   #153	-> 102
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	108	0	this	Lli/cil/oc/util/ItemCosts$;
/*     */     //   0	108	1	stack1	Lnet/minecraft/item/ItemStack;
/*     */     //   0	108	2	stack2	Lnet/minecraft/item/ItemStack;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ItemCosts$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */