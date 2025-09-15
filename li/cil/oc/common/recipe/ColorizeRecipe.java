/*    */ package li.cil.oc.common.recipe;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.inventory.InventoryCrafting;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.immutable.IndexedSeq;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005ea\001B\001\003\0015\021abQ8m_JL'0\032*fG&\004XM\003\002\004\t\0051!/Z2ja\026T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]\001S\"\001\r\013\005eQ\022\001C2sC\032$\030N\\4\013\005ma\022\001B5uK6T!!\b\020\002\0235Lg.Z2sC\032$(\"A\020\002\0079,G/\003\002\"1\t9\021JU3dSB,\007\002C\022\001\005\003\005\013\021\002\023\002\rQ\f'oZ3u!\t)c%D\001\033\023\t9#D\001\003Ji\026l\007\002C\025\001\005\003\005\013\021\002\026\002\rM|WO]2f!\rYc\006J\007\002Y)\tQ&A\003tG\006d\027-\003\0020Y\t)\021I\035:bs\")\021\007\001C\001e\0051A(\0338jiz\"2aM\0337!\t!\004!D\001\003\021\025\031\003\0071\001%\021\035I\003\007%AA\002)BQ!\r\001\005\002a\"2aM\035A\021\025\031s\0071\001;!\tYd(D\001=\025\tiD$A\003cY>\0347.\003\002@y\t)!\t\\8dW\")\021f\016a\001U!)\021\007\001C\001\005R\0211g\021\005\006G\005\003\rA\017\005\b\013\002\021\r\021\"\001G\003)!\030M]4fi&#X-\\\013\002I!1\001\n\001Q\001\n\021\n1\002^1sO\026$\030\n^3nA!9!\n\001b\001\n\003Y\025aC:pkJ\034W-\023;f[N,\022A\013\005\007\033\002\001\013\021\002\026\002\031M|WO]2f\023R,Wn\035\021\t\013=\003A\021\t)\002\0175\fGo\0315fgR\031\021\013V.\021\005-\022\026BA*-\005\035\021un\0347fC:DQ!\007(A\002U\003\"AV-\016\003]S!\001\027\017\002\023%tg/\0328u_JL\030B\001.X\005EIeN^3oi>\024\030p\021:bMRLgn\032\005\0069:\003\r!X\001\006o>\024H\016\032\t\003=\002l\021a\030\006\0039rI!!Y0\003\013]{'\017\0343\t\013\r\004A\021\t3\002#\035,Go\021:bMRLgn\032*fgVdG\017\006\002fQB\021QEZ\005\003Oj\021\021\"\023;f[N#\030mY6\t\013e\021\007\031A+\t\013)\004A\021I6\002\033\035,GOU3dSB,7+\033>f)\005a\007CA\026n\023\tqGFA\002J]RDQ\001\035\001\005BE\fqbZ3u%\026\034\027\016]3PkR\004X\017\036\013\002eB\0211f]\005\003i2\022AAT;mY\0369aOAA\001\022\0039\030AD\"pY>\024\030N_3SK\016L\007/\032\t\003ia4q!\001\002\002\002#\005\021p\005\002yuB\0211f_\005\003y2\022a!\0218z%\0264\007\"B\031y\t\003qH#A<\t\023\005\005\0010%A\005\002\005\r\021a\007\023mKN\034\030N\\5uI\035\024X-\031;fe\022\"WMZ1vYR$#'\006\002\002\006)\032!&a\002,\005\005%\001\003BA\006\003+i!!!\004\013\t\005=\021\021C\001\nk:\034\007.Z2lK\022T1!a\005-\003)\tgN\\8uCRLwN\\\005\005\003/\tiAA\tv]\016DWmY6fIZ\013'/[1oG\026\004")
/*    */ public class ColorizeRecipe implements IRecipe {
/*    */   private final Item targetItem;
/*    */   private final Item[] sourceItems;
/*    */   
/* 20 */   public ColorizeRecipe(Item target, Item[] source) { this.targetItem = target;
/* 21 */     (new Item[1])[0] = targetItem(); this.sourceItems = (source != null) ? source : new Item[1]; } public ColorizeRecipe(Block target, Item[] source) { this(Item.func_150898_a(target), source); } public ColorizeRecipe(Block target) { this(target, (Item[])null); } public Item targetItem() { return this.targetItem; } public final class ColorizeRecipe$$anonfun$1 extends AbstractFunction1<Object, Iterable<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final InventoryCrafting crafting$1; public final Iterable<ItemStack> apply(int i) { return Option$.MODULE$.option2Iterable(Option$.MODULE$.apply(this.crafting$1.func_70301_a(i))); } public ColorizeRecipe$$anonfun$1(ColorizeRecipe $outer, InventoryCrafting crafting$1) {} } public Item[] sourceItems() { return this.sourceItems; }
/*    */   public final class ColorizeRecipe$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { if (!Predef$.MODULE$.refArrayOps((Object[])this.$outer.sourceItems()).contains(stack.func_77973_b())) { Item item = this.$outer.targetItem(); if (stack.func_77973_b() == null) { stack.func_77973_b(); if (item != null); } else if (stack.func_77973_b().equals(item)) {  }  }
/* 24 */        } public ColorizeRecipe$$anonfun$2(ColorizeRecipe $outer) {} } public boolean func_77569_a(InventoryCrafting crafting, World world) { IndexedSeq stacks = (IndexedSeq)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), crafting.func_70302_i_()).flatMap((Function1)new ColorizeRecipe$$anonfun$1(this, crafting), IndexedSeq$.MODULE$.canBuildFrom());
/* 25 */     IndexedSeq targets = (IndexedSeq)stacks.filter((Function1)new ColorizeRecipe$$anonfun$2(this));
/* 26 */     IndexedSeq other = (IndexedSeq)stacks.filterNot((Function1)new ColorizeRecipe$$anonfun$3(this, targets));
/* 27 */     return (targets.size() == 1 && other.nonEmpty() && other.forall((Function1)new ColorizeRecipe$$anonfun$matches$1(this))); } public final class ColorizeRecipe$$anonfun$3 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IndexedSeq targets$1; public final boolean apply(Object elem) { return this.targets$1.contains(elem); } public ColorizeRecipe$$anonfun$3(ColorizeRecipe $outer, IndexedSeq targets$1) {} } public final class ColorizeRecipe$$anonfun$matches$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { return Color$.MODULE$.isDye(stack); }
/*    */     
/*    */     public ColorizeRecipe$$anonfun$matches$1(ColorizeRecipe $outer) {} }
/*    */   public ItemStack func_77572_b(InventoryCrafting crafting) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/Object
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: astore_2
/*    */     //   8: aconst_null
/*    */     //   9: invokestatic create : (Ljava/lang/Object;)Lscala/runtime/ObjectRef;
/*    */     //   12: astore #4
/*    */     //   14: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   17: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   20: iconst_3
/*    */     //   21: newarray int
/*    */     //   23: dup
/*    */     //   24: iconst_0
/*    */     //   25: iconst_0
/*    */     //   26: iastore
/*    */     //   27: dup
/*    */     //   28: iconst_1
/*    */     //   29: iconst_0
/*    */     //   30: iastore
/*    */     //   31: dup
/*    */     //   32: iconst_2
/*    */     //   33: iconst_0
/*    */     //   34: iastore
/*    */     //   35: invokevirtual wrapIntArray : ([I)Lscala/collection/mutable/WrappedArray;
/*    */     //   38: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */     //   41: invokevirtual Int : ()Lscala/reflect/ClassTag;
/*    */     //   44: invokevirtual apply : (Lscala/collection/Seq;Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*    */     //   47: checkcast [I
/*    */     //   50: astore #5
/*    */     //   52: iconst_0
/*    */     //   53: invokestatic create : (I)Lscala/runtime/IntRef;
/*    */     //   56: astore #6
/*    */     //   58: iconst_0
/*    */     //   59: invokestatic create : (I)Lscala/runtime/IntRef;
/*    */     //   62: astore #7
/*    */     //   64: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*    */     //   67: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   70: iconst_0
/*    */     //   71: invokevirtual intWrapper : (I)I
/*    */     //   74: aload_1
/*    */     //   75: invokevirtual func_70302_i_ : ()I
/*    */     //   78: invokevirtual until$extension0 : (II)Lscala/collection/immutable/Range;
/*    */     //   81: new li/cil/oc/common/recipe/ColorizeRecipe$$anonfun$getCraftingResult$1
/*    */     //   84: dup
/*    */     //   85: aload_0
/*    */     //   86: aload_1
/*    */     //   87: invokespecial <init> : (Lli/cil/oc/common/recipe/ColorizeRecipe;Lnet/minecraft/inventory/InventoryCrafting;)V
/*    */     //   90: getstatic scala/collection/immutable/IndexedSeq$.MODULE$ : Lscala/collection/immutable/IndexedSeq$;
/*    */     //   93: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*    */     //   96: invokevirtual flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */     //   99: checkcast scala/collection/IterableLike
/*    */     //   102: new li/cil/oc/common/recipe/ColorizeRecipe$$anonfun$getCraftingResult$2
/*    */     //   105: dup
/*    */     //   106: aload_0
/*    */     //   107: aload #4
/*    */     //   109: aload #5
/*    */     //   111: aload #6
/*    */     //   113: aload #7
/*    */     //   115: aload_2
/*    */     //   116: invokespecial <init> : (Lli/cil/oc/common/recipe/ColorizeRecipe;Lscala/runtime/ObjectRef;[ILscala/runtime/IntRef;Lscala/runtime/IntRef;Ljava/lang/Object;)V
/*    */     //   119: invokeinterface foreach : (Lscala/Function1;)V
/*    */     //   124: aload #4
/*    */     //   126: getfield elem : Ljava/lang/Object;
/*    */     //   129: checkcast net/minecraft/item/ItemStack
/*    */     //   132: ifnonnull -> 139
/*    */     //   135: aconst_null
/*    */     //   136: pop
/*    */     //   137: aconst_null
/*    */     //   138: areturn
/*    */     //   139: aload_0
/*    */     //   140: invokevirtual targetItem : ()Lnet/minecraft/item/Item;
/*    */     //   143: aload #4
/*    */     //   145: getfield elem : Ljava/lang/Object;
/*    */     //   148: checkcast net/minecraft/item/ItemStack
/*    */     //   151: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   154: astore #8
/*    */     //   156: dup
/*    */     //   157: ifnonnull -> 169
/*    */     //   160: pop
/*    */     //   161: aload #8
/*    */     //   163: ifnull -> 177
/*    */     //   166: goto -> 343
/*    */     //   169: aload #8
/*    */     //   171: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   174: ifeq -> 343
/*    */     //   177: getstatic li/cil/oc/util/ItemColorizer$.MODULE$ : Lli/cil/oc/util/ItemColorizer$;
/*    */     //   180: aload #4
/*    */     //   182: getfield elem : Ljava/lang/Object;
/*    */     //   185: checkcast net/minecraft/item/ItemStack
/*    */     //   188: invokevirtual hasColor : (Lnet/minecraft/item/ItemStack;)Z
/*    */     //   191: ifeq -> 413
/*    */     //   194: getstatic li/cil/oc/util/ItemColorizer$.MODULE$ : Lli/cil/oc/util/ItemColorizer$;
/*    */     //   197: aload #4
/*    */     //   199: getfield elem : Ljava/lang/Object;
/*    */     //   202: checkcast net/minecraft/item/ItemStack
/*    */     //   205: invokevirtual getColor : (Lnet/minecraft/item/ItemStack;)I
/*    */     //   208: istore #9
/*    */     //   210: iload #9
/*    */     //   212: bipush #16
/*    */     //   214: ishr
/*    */     //   215: sipush #255
/*    */     //   218: iand
/*    */     //   219: i2f
/*    */     //   220: ldc 255.0
/*    */     //   222: fdiv
/*    */     //   223: fstore #10
/*    */     //   225: iload #9
/*    */     //   227: bipush #8
/*    */     //   229: ishr
/*    */     //   230: sipush #255
/*    */     //   233: iand
/*    */     //   234: i2f
/*    */     //   235: ldc 255.0
/*    */     //   237: fdiv
/*    */     //   238: fstore #11
/*    */     //   240: iload #9
/*    */     //   242: sipush #255
/*    */     //   245: iand
/*    */     //   246: i2f
/*    */     //   247: ldc 255.0
/*    */     //   249: fdiv
/*    */     //   250: fstore #12
/*    */     //   252: aload #7
/*    */     //   254: aload #7
/*    */     //   256: getfield elem : I
/*    */     //   259: i2f
/*    */     //   260: fload #10
/*    */     //   262: fload #11
/*    */     //   264: fload #12
/*    */     //   266: invokestatic max : (FF)F
/*    */     //   269: invokestatic max : (FF)F
/*    */     //   272: ldc 255.0
/*    */     //   274: fmul
/*    */     //   275: fadd
/*    */     //   276: f2i
/*    */     //   277: putfield elem : I
/*    */     //   280: aload #5
/*    */     //   282: iconst_0
/*    */     //   283: aload #5
/*    */     //   285: iconst_0
/*    */     //   286: iaload
/*    */     //   287: i2f
/*    */     //   288: fload #10
/*    */     //   290: ldc 255.0
/*    */     //   292: fmul
/*    */     //   293: fadd
/*    */     //   294: f2i
/*    */     //   295: iastore
/*    */     //   296: aload #5
/*    */     //   298: iconst_1
/*    */     //   299: aload #5
/*    */     //   301: iconst_1
/*    */     //   302: iaload
/*    */     //   303: i2f
/*    */     //   304: fload #11
/*    */     //   306: ldc 255.0
/*    */     //   308: fmul
/*    */     //   309: fadd
/*    */     //   310: f2i
/*    */     //   311: iastore
/*    */     //   312: aload #5
/*    */     //   314: iconst_2
/*    */     //   315: aload #5
/*    */     //   317: iconst_2
/*    */     //   318: iaload
/*    */     //   319: i2f
/*    */     //   320: fload #12
/*    */     //   322: ldc 255.0
/*    */     //   324: fmul
/*    */     //   325: fadd
/*    */     //   326: f2i
/*    */     //   327: iastore
/*    */     //   328: aload #6
/*    */     //   330: aload #6
/*    */     //   332: getfield elem : I
/*    */     //   335: iconst_1
/*    */     //   336: iadd
/*    */     //   337: putfield elem : I
/*    */     //   340: goto -> 413
/*    */     //   343: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   346: aload_0
/*    */     //   347: invokevirtual sourceItems : ()[Lnet/minecraft/item/Item;
/*    */     //   350: checkcast [Ljava/lang/Object;
/*    */     //   353: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */     //   356: aload #4
/*    */     //   358: getfield elem : Ljava/lang/Object;
/*    */     //   361: checkcast net/minecraft/item/ItemStack
/*    */     //   364: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   367: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   372: ifeq -> 413
/*    */     //   375: aload #4
/*    */     //   377: new net/minecraft/item/ItemStack
/*    */     //   380: dup
/*    */     //   381: aload_0
/*    */     //   382: invokevirtual targetItem : ()Lnet/minecraft/item/Item;
/*    */     //   385: aload #4
/*    */     //   387: getfield elem : Ljava/lang/Object;
/*    */     //   390: checkcast net/minecraft/item/ItemStack
/*    */     //   393: getfield field_77994_a : I
/*    */     //   396: aload #4
/*    */     //   398: getfield elem : Ljava/lang/Object;
/*    */     //   401: checkcast net/minecraft/item/ItemStack
/*    */     //   404: invokevirtual func_77960_j : ()I
/*    */     //   407: invokespecial <init> : (Lnet/minecraft/item/Item;II)V
/*    */     //   410: putfield elem : Ljava/lang/Object;
/*    */     //   413: aload #5
/*    */     //   415: iconst_0
/*    */     //   416: iaload
/*    */     //   417: aload #6
/*    */     //   419: getfield elem : I
/*    */     //   422: idiv
/*    */     //   423: istore #13
/*    */     //   425: aload #5
/*    */     //   427: iconst_1
/*    */     //   428: iaload
/*    */     //   429: aload #6
/*    */     //   431: getfield elem : I
/*    */     //   434: idiv
/*    */     //   435: istore #14
/*    */     //   437: aload #5
/*    */     //   439: iconst_2
/*    */     //   440: iaload
/*    */     //   441: aload #6
/*    */     //   443: getfield elem : I
/*    */     //   446: idiv
/*    */     //   447: istore #15
/*    */     //   449: aload #7
/*    */     //   451: getfield elem : I
/*    */     //   454: i2f
/*    */     //   455: aload #6
/*    */     //   457: getfield elem : I
/*    */     //   460: i2f
/*    */     //   461: fdiv
/*    */     //   462: fstore #16
/*    */     //   464: iload #13
/*    */     //   466: iload #14
/*    */     //   468: iload #15
/*    */     //   470: invokestatic max : (II)I
/*    */     //   473: invokestatic max : (II)I
/*    */     //   476: i2f
/*    */     //   477: fstore #17
/*    */     //   479: iload #13
/*    */     //   481: i2f
/*    */     //   482: fload #16
/*    */     //   484: fmul
/*    */     //   485: fload #17
/*    */     //   487: fdiv
/*    */     //   488: f2i
/*    */     //   489: istore #13
/*    */     //   491: iload #14
/*    */     //   493: i2f
/*    */     //   494: fload #16
/*    */     //   496: fmul
/*    */     //   497: fload #17
/*    */     //   499: fdiv
/*    */     //   500: f2i
/*    */     //   501: istore #14
/*    */     //   503: iload #15
/*    */     //   505: i2f
/*    */     //   506: fload #16
/*    */     //   508: fmul
/*    */     //   509: fload #17
/*    */     //   511: fdiv
/*    */     //   512: f2i
/*    */     //   513: istore #15
/*    */     //   515: getstatic li/cil/oc/util/ItemColorizer$.MODULE$ : Lli/cil/oc/util/ItemColorizer$;
/*    */     //   518: aload #4
/*    */     //   520: getfield elem : Ljava/lang/Object;
/*    */     //   523: checkcast net/minecraft/item/ItemStack
/*    */     //   526: iload #13
/*    */     //   528: bipush #16
/*    */     //   530: ishl
/*    */     //   531: iload #14
/*    */     //   533: bipush #8
/*    */     //   535: ishl
/*    */     //   536: ior
/*    */     //   537: iload #15
/*    */     //   539: ior
/*    */     //   540: invokevirtual setColor : (Lnet/minecraft/item/ItemStack;I)V
/*    */     //   543: aload #4
/*    */     //   545: getfield elem : Ljava/lang/Object;
/*    */     //   548: checkcast net/minecraft/item/ItemStack
/*    */     //   551: goto -> 570
/*    */     //   554: astore_3
/*    */     //   555: aload_3
/*    */     //   556: invokevirtual key : ()Ljava/lang/Object;
/*    */     //   559: aload_2
/*    */     //   560: if_acmpne -> 571
/*    */     //   563: aload_3
/*    */     //   564: invokevirtual value : ()Ljava/lang/Object;
/*    */     //   567: checkcast net/minecraft/item/ItemStack
/*    */     //   570: areturn
/*    */     //   571: aload_3
/*    */     //   572: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 0
/*    */     //   #31	-> 8
/*    */     //   #32	-> 14
/*    */     //   #33	-> 52
/*    */     //   #34	-> 58
/*    */     //   #36	-> 67
/*    */     //   #58	-> 124
/*    */     //   #60	-> 139
/*    */     //   #61	-> 177
/*    */     //   #62	-> 194
/*    */     //   #63	-> 210
/*    */     //   #64	-> 225
/*    */     //   #65	-> 240
/*    */     //   #66	-> 252
/*    */     //   #67	-> 280
/*    */     //   #68	-> 296
/*    */     //   #69	-> 312
/*    */     //   #70	-> 328
/*    */     //   #72	-> 343
/*    */     //   #73	-> 375
/*    */     //   #76	-> 413
/*    */     //   #77	-> 425
/*    */     //   #78	-> 437
/*    */     //   #79	-> 449
/*    */     //   #80	-> 464
/*    */     //   #81	-> 479
/*    */     //   #82	-> 491
/*    */     //   #83	-> 503
/*    */     //   #84	-> 515
/*    */     //   #85	-> 543
/*    */     //   #30	-> 554
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	573	0	this	Lli/cil/oc/common/recipe/ColorizeRecipe;
/*    */     //   0	573	1	crafting	Lnet/minecraft/inventory/InventoryCrafting;
/*    */     //   14	537	4	targetStack	Lscala/runtime/ObjectRef;
/*    */     //   52	499	5	color	[I
/*    */     //   58	493	6	colorCount	Lscala/runtime/IntRef;
/*    */     //   64	487	7	maximum	Lscala/runtime/IntRef;
/*    */     //   210	130	9	itemColor	I
/*    */     //   225	115	10	red	F
/*    */     //   240	100	11	green	F
/*    */     //   252	88	12	blue	F
/*    */     //   425	126	13	red	I
/*    */     //   437	114	14	green	I
/*    */     //   449	102	15	blue	I
/*    */     //   464	87	16	max	F
/*    */     //   479	72	17	div	F
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	554	554	scala/runtime/NonLocalReturnControl
/*    */   }
/*    */   public final class ColorizeRecipe$$anonfun$getCraftingResult$1 extends AbstractFunction1<Object, Iterable<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final InventoryCrafting crafting$2;
/*    */     
/* 36 */     public final Iterable<ItemStack> apply(int i) { return Option$.MODULE$.option2Iterable(Option$.MODULE$.apply(this.crafting$2.func_70301_a(i))); } public ColorizeRecipe$$anonfun$getCraftingResult$1(ColorizeRecipe $outer, InventoryCrafting crafting$2) {} } public final class ColorizeRecipe$$anonfun$getCraftingResult$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ObjectRef targetStack$1; private final int[] color$1; private final IntRef colorCount$1; private final IntRef maximum$1; private final Object nonLocalReturnKey1$1; public ColorizeRecipe$$anonfun$getCraftingResult$2(ColorizeRecipe $outer, ObjectRef targetStack$1, int[] color$1, IntRef colorCount$1, IntRef maximum$1, Object nonLocalReturnKey1$1) {} public final void apply(ItemStack stack) {
/* 37 */       if (!Predef$.MODULE$.refArrayOps((Object[])this.$outer.sourceItems()).contains(stack.func_77973_b())) {
/* 38 */         Item item = this.$outer.targetItem(); if (stack.func_77973_b() == null) { stack.func_77973_b(); if (item != null)
/*    */           {
/*    */ 
/*    */             
/* 42 */             Option dye = Color$.MODULE$.findDye(stack); }  } else { if (stack.func_77973_b().equals(item)) { this.targetStack$1.elem = stack.func_77946_l(); ((ItemStack)this.targetStack$1.elem).field_77994_a = 1; return; }  Option option = Color$.MODULE$.findDye(stack); }
/*    */       
/*    */       } 
/*    */       this.targetStack$1.elem = stack.func_77946_l();
/*    */       ((ItemStack)this.targetStack$1.elem).field_77994_a = 1;
/*    */     } }
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
/*    */ 
/*    */ 
/*    */   
/*    */   public int func_77570_a() {
/* 88 */     return 10;
/*    */   } public Null$ getRecipeOutput() {
/* 90 */     return null;
/*    */   }
/*    */   
/*    */   public static Item[] $lessinit$greater$default$2() {
/*    */     return ColorizeRecipe$.MODULE$.$lessinit$greater$default$2();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\ColorizeRecipe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */