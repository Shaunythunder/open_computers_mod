/*     */ package li.cil.oc.util;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.item.EntityMinecartContainer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple3;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.immutable.Range;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class InventoryUtils$ {
/*     */   public static final InventoryUtils$ MODULE$;
/*     */   
/*     */   public boolean haveSameItemType$default$3() {
/*  23 */     return false;
/*     */   }
/*     */   
/*     */   public boolean haveSameItemType(ItemStack stackA, ItemStack stackB, boolean checkNBT) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull -> 73
/*     */     //   4: aload_2
/*     */     //   5: ifnull -> 73
/*     */     //   8: aload_1
/*     */     //   9: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   12: aload_2
/*     */     //   13: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   16: astore #4
/*     */     //   18: dup
/*     */     //   19: ifnonnull -> 31
/*     */     //   22: pop
/*     */     //   23: aload #4
/*     */     //   25: ifnull -> 39
/*     */     //   28: goto -> 73
/*     */     //   31: aload #4
/*     */     //   33: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   36: ifeq -> 73
/*     */     //   39: aload_1
/*     */     //   40: invokevirtual func_77981_g : ()Z
/*     */     //   43: ifeq -> 57
/*     */     //   46: aload_1
/*     */     //   47: invokevirtual func_77960_j : ()I
/*     */     //   50: aload_2
/*     */     //   51: invokevirtual func_77960_j : ()I
/*     */     //   54: if_icmpne -> 73
/*     */     //   57: iload_3
/*     */     //   58: ifeq -> 69
/*     */     //   61: aload_1
/*     */     //   62: aload_2
/*     */     //   63: invokestatic func_77970_a : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   66: ifeq -> 73
/*     */     //   69: iconst_1
/*     */     //   70: goto -> 74
/*     */     //   73: iconst_0
/*     */     //   74: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #24	-> 0
/*     */     //   #25	-> 8
/*     */     //   #26	-> 39
/*     */     //   #27	-> 57
/*     */     //   #26	-> 69
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	75	0	this	Lli/cil/oc/util/InventoryUtils$;
/*     */     //   0	75	1	stackA	Lnet/minecraft/item/ItemStack;
/*     */     //   0	75	2	stackB	Lnet/minecraft/item/ItemStack;
/*     */     //   0	75	3	checkNBT	Z
/*     */   }
/*     */   
/*     */   public Option<InventorySource> inventorySourceAt(BlockPosition position) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual world : ()Lscala/Option;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: instanceof scala/Some
/*     */     //   9: ifeq -> 294
/*     */     //   12: aload_2
/*     */     //   13: checkcast scala/Some
/*     */     //   16: astore_3
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   21: checkcast net/minecraft/world/World
/*     */     //   24: astore #4
/*     */     //   26: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   29: aload #4
/*     */     //   31: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   34: aload_1
/*     */     //   35: invokevirtual blockExists : (Lli/cil/oc/util/BlockPosition;)Z
/*     */     //   38: ifeq -> 294
/*     */     //   41: new scala/Tuple2
/*     */     //   44: dup
/*     */     //   45: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   48: aload #4
/*     */     //   50: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   53: aload_1
/*     */     //   54: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */     //   57: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   60: aload #4
/*     */     //   62: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   65: aload_1
/*     */     //   66: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   69: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   72: astore #6
/*     */     //   74: aload #6
/*     */     //   76: ifnull -> 173
/*     */     //   79: aload #6
/*     */     //   81: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   84: checkcast net/minecraft/block/Block
/*     */     //   87: astore #7
/*     */     //   89: aload #6
/*     */     //   91: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   94: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   97: astore #8
/*     */     //   99: aload #7
/*     */     //   101: instanceof net/minecraft/block/BlockChest
/*     */     //   104: ifeq -> 173
/*     */     //   107: aload #7
/*     */     //   109: checkcast net/minecraft/block/BlockChest
/*     */     //   112: astore #9
/*     */     //   114: aload #8
/*     */     //   116: instanceof net/minecraft/tileentity/TileEntityChest
/*     */     //   119: ifeq -> 173
/*     */     //   122: aload #8
/*     */     //   124: checkcast net/minecraft/tileentity/TileEntityChest
/*     */     //   127: astore #10
/*     */     //   129: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   132: aload #9
/*     */     //   134: aload #4
/*     */     //   136: aload #10
/*     */     //   138: getfield field_145851_c : I
/*     */     //   141: aload #10
/*     */     //   143: getfield field_145848_d : I
/*     */     //   146: aload #10
/*     */     //   148: getfield field_145849_e : I
/*     */     //   151: invokevirtual func_149951_m : (Lnet/minecraft/world/World;III)Lnet/minecraft/inventory/IInventory;
/*     */     //   154: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   157: new li/cil/oc/util/InventoryUtils$$anonfun$inventorySourceAt$1
/*     */     //   160: dup
/*     */     //   161: aload_1
/*     */     //   162: invokespecial <init> : (Lli/cil/oc/util/BlockPosition;)V
/*     */     //   165: invokevirtual map : (Lscala/Function1;)Lscala/Option;
/*     */     //   168: astore #11
/*     */     //   170: goto -> 287
/*     */     //   173: aload #6
/*     */     //   175: ifnull -> 225
/*     */     //   178: aload #6
/*     */     //   180: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   183: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   186: astore #12
/*     */     //   188: aload #12
/*     */     //   190: instanceof net/minecraft/inventory/IInventory
/*     */     //   193: ifeq -> 225
/*     */     //   196: aload #12
/*     */     //   198: astore #13
/*     */     //   200: new scala/Some
/*     */     //   203: dup
/*     */     //   204: new li/cil/oc/util/BlockInventorySource
/*     */     //   207: dup
/*     */     //   208: aload_1
/*     */     //   209: aload #13
/*     */     //   211: checkcast net/minecraft/inventory/IInventory
/*     */     //   214: invokespecial <init> : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/inventory/IInventory;)V
/*     */     //   217: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   220: astore #11
/*     */     //   222: goto -> 287
/*     */     //   225: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   228: aload #4
/*     */     //   230: ldc net/minecraft/entity/item/EntityMinecartContainer
/*     */     //   232: aload_1
/*     */     //   233: invokevirtual bounds : ()Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   236: invokevirtual func_72872_a : (Ljava/lang/Class;Lnet/minecraft/util/AxisAlignedBB;)Ljava/util/List;
/*     */     //   239: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   242: new li/cil/oc/util/InventoryUtils$$anonfun$inventorySourceAt$2
/*     */     //   245: dup
/*     */     //   246: invokespecial <init> : ()V
/*     */     //   249: getstatic scala/collection/mutable/Buffer$.MODULE$ : Lscala/collection/mutable/Buffer$;
/*     */     //   252: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   255: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   260: checkcast scala/collection/IterableLike
/*     */     //   263: new li/cil/oc/util/InventoryUtils$$anonfun$inventorySourceAt$3
/*     */     //   266: dup
/*     */     //   267: invokespecial <init> : ()V
/*     */     //   270: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   275: new li/cil/oc/util/InventoryUtils$$anonfun$inventorySourceAt$4
/*     */     //   278: dup
/*     */     //   279: invokespecial <init> : ()V
/*     */     //   282: invokevirtual map : (Lscala/Function1;)Lscala/Option;
/*     */     //   285: astore #11
/*     */     //   287: aload #11
/*     */     //   289: astore #5
/*     */     //   291: goto -> 299
/*     */     //   294: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   297: astore #5
/*     */     //   299: aload #5
/*     */     //   301: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 0
/*     */     //   #37	-> 5
/*     */     //   #38	-> 79
/*     */     //   #39	-> 157
/*     */     //   #37	-> 173
/*     */     //   #40	-> 178
/*     */     //   #41	-> 225
/*     */     //   #42	-> 242
/*     */     //   #43	-> 263
/*     */     //   #44	-> 275
/*     */     //   #37	-> 287
/*     */     //   #46	-> 294
/*     */     //   #36	-> 299
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	302	0	this	Lli/cil/oc/util/InventoryUtils$;
/*     */     //   0	302	1	position	Lli/cil/oc/util/BlockPosition;
/*     */     //   26	276	4	world	Lnet/minecraft/world/World;
/*     */     //   89	213	7	block	Lnet/minecraft/block/Block;
/*     */     //   99	203	8	chest	Lnet/minecraft/tileentity/TileEntity;
/*     */     //   188	114	12	inventory	Lnet/minecraft/tileentity/TileEntity;
/*     */   }
/*     */   
/*     */   public final class InventoryUtils$$anonfun$inventorySourceAt$1 extends AbstractFunction1<IInventory, BlockInventorySource> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final BlockPosition position$2;
/*     */     
/*     */     public final BlockInventorySource apply(IInventory a) {
/*  39 */       return new BlockInventorySource(this.position$2, a);
/*     */     } public InventoryUtils$$anonfun$inventorySourceAt$1(BlockPosition position$2) {} }
/*     */   public final class InventoryUtils$$anonfun$inventorySourceAt$2 extends AbstractFunction1<Object, EntityMinecartContainer> implements Serializable { public static final long serialVersionUID = 0L;
/*  42 */     public final EntityMinecartContainer apply(Object x$1) { return (EntityMinecartContainer)x$1; } } public final class InventoryUtils$$anonfun$inventorySourceAt$3 extends AbstractFunction1<EntityMinecartContainer, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  43 */     public final boolean apply(EntityMinecartContainer x$2) { return !x$2.field_70128_L; } } public final class InventoryUtils$$anonfun$inventorySourceAt$4 extends AbstractFunction1<EntityMinecartContainer, EntityInventorySource> implements Serializable { public static final long serialVersionUID = 0L; public final EntityInventorySource apply(EntityMinecartContainer a) {
/*  44 */       return new EntityInventorySource((Entity)a, (IInventory)a);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Option<IInventory> inventoryAt(BlockPosition position)
/*     */   {
/*  56 */     return inventorySourceAt(position).map((Function1)new InventoryUtils$$anonfun$inventoryAt$1()); } public final class InventoryUtils$$anonfun$inventoryAt$1 extends AbstractFunction1<InventorySource, IInventory> implements Serializable { public static final long serialVersionUID = 0L; public final IInventory apply(InventorySource a) { return a.inventory(); }
/*     */      }
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
/*     */   public int insertIntoInventorySlot$default$5()
/*     */   {
/*  79 */     return 64; } public boolean insertIntoInventorySlot$default$6() { return false; }
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
/*     */   public boolean insertIntoInventorySlot(ItemStack stack, IInventory inventory, Option side, int slot, int limit, boolean simulate) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull -> 384
/*     */     //   4: iload #5
/*     */     //   6: iconst_0
/*     */     //   7: if_icmple -> 384
/*     */     //   10: new scala/Tuple2
/*     */     //   13: dup
/*     */     //   14: aload_2
/*     */     //   15: aload_3
/*     */     //   16: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   19: astore #8
/*     */     //   21: aload #8
/*     */     //   23: ifnull -> 106
/*     */     //   26: aload #8
/*     */     //   28: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   31: checkcast net/minecraft/inventory/IInventory
/*     */     //   34: astore #9
/*     */     //   36: aload #8
/*     */     //   38: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   41: checkcast scala/Option
/*     */     //   44: astore #10
/*     */     //   46: aload #9
/*     */     //   48: instanceof net/minecraft/inventory/ISidedInventory
/*     */     //   51: ifeq -> 106
/*     */     //   54: aload #9
/*     */     //   56: checkcast net/minecraft/inventory/ISidedInventory
/*     */     //   59: astore #11
/*     */     //   61: aload #10
/*     */     //   63: instanceof scala/Some
/*     */     //   66: ifeq -> 106
/*     */     //   69: aload #10
/*     */     //   71: checkcast scala/Some
/*     */     //   74: astore #12
/*     */     //   76: aload #12
/*     */     //   78: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   81: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   84: astore #13
/*     */     //   86: aload #11
/*     */     //   88: iload #4
/*     */     //   90: aload_1
/*     */     //   91: aload #13
/*     */     //   93: invokevirtual ordinal : ()I
/*     */     //   96: invokeinterface func_102007_a : (ILnet/minecraft/item/ItemStack;I)Z
/*     */     //   101: istore #14
/*     */     //   103: goto -> 109
/*     */     //   106: iconst_1
/*     */     //   107: istore #14
/*     */     //   109: iload #14
/*     */     //   111: istore #7
/*     */     //   113: aload_1
/*     */     //   114: getfield field_77994_a : I
/*     */     //   117: iconst_0
/*     */     //   118: if_icmple -> 376
/*     */     //   121: aload_2
/*     */     //   122: iload #4
/*     */     //   124: aload_1
/*     */     //   125: invokeinterface func_94041_b : (ILnet/minecraft/item/ItemStack;)Z
/*     */     //   130: ifeq -> 376
/*     */     //   133: iload #7
/*     */     //   135: ifeq -> 376
/*     */     //   138: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   141: aload_2
/*     */     //   142: invokeinterface func_70297_j_ : ()I
/*     */     //   147: aload_1
/*     */     //   148: invokevirtual func_77976_d : ()I
/*     */     //   151: invokevirtual min : (II)I
/*     */     //   154: istore #15
/*     */     //   156: aload_2
/*     */     //   157: iload #4
/*     */     //   159: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   164: astore #16
/*     */     //   166: aload #16
/*     */     //   168: ifnull -> 203
/*     */     //   171: aload #16
/*     */     //   173: getfield field_77994_a : I
/*     */     //   176: iload #15
/*     */     //   178: if_icmpge -> 203
/*     */     //   181: aload #16
/*     */     //   183: aload_1
/*     */     //   184: invokevirtual func_77969_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   187: ifeq -> 203
/*     */     //   190: aload #16
/*     */     //   192: aload_1
/*     */     //   193: invokestatic func_77970_a : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   196: ifeq -> 203
/*     */     //   199: iconst_1
/*     */     //   200: goto -> 204
/*     */     //   203: iconst_0
/*     */     //   204: istore #17
/*     */     //   206: iload #17
/*     */     //   208: ifeq -> 296
/*     */     //   211: iload #15
/*     */     //   213: aload #16
/*     */     //   215: getfield field_77994_a : I
/*     */     //   218: isub
/*     */     //   219: istore #18
/*     */     //   221: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   224: iload #18
/*     */     //   226: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   229: aload_1
/*     */     //   230: getfield field_77994_a : I
/*     */     //   233: iload #5
/*     */     //   235: invokevirtual min : (II)I
/*     */     //   238: invokevirtual min : (II)I
/*     */     //   241: istore #19
/*     */     //   243: aload_1
/*     */     //   244: aload_1
/*     */     //   245: getfield field_77994_a : I
/*     */     //   248: iload #19
/*     */     //   250: isub
/*     */     //   251: putfield field_77994_a : I
/*     */     //   254: iload #6
/*     */     //   256: ifeq -> 273
/*     */     //   259: iload #19
/*     */     //   261: iconst_0
/*     */     //   262: if_icmple -> 269
/*     */     //   265: iconst_1
/*     */     //   266: goto -> 369
/*     */     //   269: iconst_0
/*     */     //   270: goto -> 369
/*     */     //   273: aload #16
/*     */     //   275: aload #16
/*     */     //   277: getfield field_77994_a : I
/*     */     //   280: iload #19
/*     */     //   282: iadd
/*     */     //   283: putfield field_77994_a : I
/*     */     //   286: aload_2
/*     */     //   287: invokeinterface func_70296_d : ()V
/*     */     //   292: iconst_1
/*     */     //   293: goto -> 369
/*     */     //   296: aload #16
/*     */     //   298: ifnonnull -> 368
/*     */     //   301: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   304: iload #15
/*     */     //   306: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   309: aload_1
/*     */     //   310: getfield field_77994_a : I
/*     */     //   313: iload #5
/*     */     //   315: invokevirtual min : (II)I
/*     */     //   318: invokevirtual min : (II)I
/*     */     //   321: istore #20
/*     */     //   323: aload_1
/*     */     //   324: iload #20
/*     */     //   326: invokevirtual func_77979_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   329: astore #21
/*     */     //   331: iload #6
/*     */     //   333: ifeq -> 350
/*     */     //   336: iload #20
/*     */     //   338: iconst_0
/*     */     //   339: if_icmple -> 346
/*     */     //   342: iconst_1
/*     */     //   343: goto -> 361
/*     */     //   346: iconst_0
/*     */     //   347: goto -> 361
/*     */     //   350: aload_2
/*     */     //   351: iload #4
/*     */     //   353: aload #21
/*     */     //   355: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   360: iconst_1
/*     */     //   361: ifeq -> 368
/*     */     //   364: iconst_1
/*     */     //   365: goto -> 369
/*     */     //   368: iconst_0
/*     */     //   369: ifeq -> 376
/*     */     //   372: iconst_1
/*     */     //   373: goto -> 377
/*     */     //   376: iconst_0
/*     */     //   377: ifeq -> 384
/*     */     //   380: iconst_1
/*     */     //   381: goto -> 385
/*     */     //   384: iconst_0
/*     */     //   385: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 0
/*     */     //   #81	-> 10
/*     */     //   #82	-> 26
/*     */     //   #83	-> 106
/*     */     //   #81	-> 109
/*     */     //   #85	-> 113
/*     */     //   #86	-> 138
/*     */     //   #87	-> 156
/*     */     //   #88	-> 166
/*     */     //   #89	-> 181
/*     */     //   #90	-> 206
/*     */     //   #91	-> 211
/*     */     //   #92	-> 221
/*     */     //   #93	-> 243
/*     */     //   #94	-> 254
/*     */     //   #96	-> 273
/*     */     //   #97	-> 286
/*     */     //   #98	-> 292
/*     */     //   #101	-> 296
/*     */     //   #102	-> 301
/*     */     //   #103	-> 323
/*     */     //   #104	-> 331
/*     */     //   #106	-> 350
/*     */     //   #107	-> 360
/*     */     //   #101	-> 364
/*     */     //   #85	-> 372
/*     */     //   #80	-> 380
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	386	0	this	Lli/cil/oc/util/InventoryUtils$;
/*     */     //   0	386	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	386	2	inventory	Lnet/minecraft/inventory/IInventory;
/*     */     //   0	386	3	side	Lscala/Option;
/*     */     //   0	386	4	slot	I
/*     */     //   0	386	5	limit	I
/*     */     //   0	386	6	simulate	Z
/*     */     //   36	350	9	inventory	Lnet/minecraft/inventory/IInventory;
/*     */     //   86	300	13	s	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   113	273	7	isSideValidForSlot	Z
/*     */     //   156	230	15	maxStackSize	I
/*     */     //   166	220	16	existing	Lnet/minecraft/item/ItemStack;
/*     */     //   206	180	17	shouldMerge	Z
/*     */     //   221	165	18	space	I
/*     */     //   243	143	19	amount	I
/*     */     //   323	63	20	amount	I
/*     */     //   331	55	21	inserted	Lnet/minecraft/item/ItemStack;
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
/*     */   public int extractFromInventorySlot$default$5()
/*     */   {
/* 137 */     return 64; } public int extractFromInventorySlot(Function1 consumer, IInventory inventory, ForgeDirection side, int slot, int limit) {
/* 138 */     ItemStack stack = inventory.func_70301_a(slot);
/*     */     
/* 140 */     if (stack == null || limit <= 0) {
/* 141 */       return 0;
/*     */     }
/* 143 */     IInventory iInventory = inventory;
/* 144 */     if (iInventory instanceof ISidedInventory) { ISidedInventory iSidedInventory = (ISidedInventory)iInventory;
/* 145 */       if (iSidedInventory.func_102008_b(slot, stack, side.ordinal())) { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 146 */       else { return 0; }  }
/* 147 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */     
/* 150 */     int maxStackSize = scala.math.package$.MODULE$.min(inventory.func_70297_j_(), stack.func_77976_d());
/* 151 */     int amount = scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(stack.field_77994_a), limit)), maxStackSize);
/* 152 */     ItemStack extracted = stack.func_77979_a(amount);
/* 153 */     consumer.apply(extracted);
/* 154 */     int count = scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(amount - extracted.field_77994_a), 0);
/* 155 */     stack.field_77994_a += extracted.field_77994_a;
/* 156 */     if (stack.field_77994_a == 0) {
/* 157 */       inventory.func_70299_a(slot, null);
/*     */     }
/* 159 */     else if (count > 0) {
/* 160 */       inventory.func_70296_d();
/*     */     } 
/* 162 */     return count;
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
/*     */ 
/*     */   
/*     */   public Option<ForgeDirection> insertIntoInventory$default$3()
/*     */   {
/* 180 */     return (Option<ForgeDirection>)scala.None$.MODULE$; } public int insertIntoInventory$default$4() { return 64; } public boolean insertIntoInventory$default$5() { return false; } public Option<Iterable<Object>> insertIntoInventory$default$6() { return (Option<Iterable<Object>>)scala.None$.MODULE$; } public final class InventoryUtils$$anonfun$1 extends AbstractFunction0<Iterable<Object>> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$2; private final Option side$2; public final Iterable<Object> apply() { Range range; IInventory iInventory = this.inventory$2; if (iInventory instanceof ISidedInventory) { ISidedInventory iSidedInventory = (ISidedInventory)iInventory; Iterable iterable = scala.Predef$.MODULE$.intArrayOps(iSidedInventory.func_94128_d(((Enum)this.side$2.getOrElse((Function0)new InventoryUtils$$anonfun$1$$anonfun$apply$1(this))).ordinal())).toIterable(); } else { range = scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), this.inventory$2.func_70302_i_()); }  return (Iterable<Object>)range; } public InventoryUtils$$anonfun$1(IInventory inventory$2, Option side$2) {} public final class InventoryUtils$$anonfun$1$$anonfun$apply$1 extends AbstractFunction0<ForgeDirection> implements Serializable {
/* 181 */       public static final long serialVersionUID = 0L; public final ForgeDirection apply() { return ForgeDirection.UNKNOWN; } public InventoryUtils$$anonfun$1$$anonfun$apply$1(InventoryUtils$$anonfun$1 $outer) {} } } public final class InventoryUtils$$anonfun$insertIntoInventory$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2; private final IInventory inventory$2; private final Option side$2; private final boolean simulate$2; private final BooleanRef success$1; private final IntRef remaining$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public InventoryUtils$$anonfun$insertIntoInventory$1(ItemStack stack$2, IInventory inventory$2, Option side$2, boolean simulate$2, BooleanRef success$1, IntRef remaining$1) {} public void apply$mcVI$sp(int slot) { int stackSize = this.stack$2.field_77994_a; if (this.inventory$2.func_70301_a(slot) != null && InventoryUtils$.MODULE$.insertIntoInventorySlot(this.stack$2, this.inventory$2, this.side$2, slot, this.remaining$1.elem, this.simulate$2)) { this.remaining$1.elem -= stackSize - this.stack$2.field_77994_a; this.success$1.elem = true; }  } } public boolean insertIntoInventory(ItemStack stack, IInventory inventory, Option<ForgeDirection> side, int limit, boolean simulate, Option slots) { if (stack != null && limit > 0) {
/* 182 */       BooleanRef success = BooleanRef.create(false);
/* 183 */       IntRef remaining = IntRef.create(limit);
/* 184 */       Iterable range = (Iterable)slots.getOrElse((Function0)new InventoryUtils$$anonfun$1(inventory, side));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 189 */       if (range.nonEmpty()) {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 194 */         if (slots.isDefined()) {
/* 195 */           int stackSize = stack.field_77994_a;
/* 196 */           if (inventory.func_70301_a(BoxesRunTime.unboxToInt(range.head())) == null && insertIntoInventorySlot(stack, inventory, side, BoxesRunTime.unboxToInt(range.head()), remaining.elem, simulate)) {
/* 197 */             remaining.elem -= stackSize - stack.field_77994_a;
/* 198 */             success.elem = true;
/*     */           } 
/*     */         } 
/*     */         
/* 202 */         boolean shouldTryMerge = (!stack.func_77984_f() && stack.func_77976_d() > 1 && inventory.func_70297_j_() > 1);
/* 203 */         if (shouldTryMerge) {
/* 204 */           range.foreach((Function1)new InventoryUtils$$anonfun$insertIntoInventory$1(stack, inventory, side, simulate, success, remaining));
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 213 */         range.foreach((Function1)new InventoryUtils$$anonfun$insertIntoInventory$2(stack, inventory, side, simulate, success, remaining));
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 222 */       if (success.elem);
/*     */     } 
/*     */     return false; }
/*     */    public final class InventoryUtils$$anonfun$insertIntoInventory$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$2; private final IInventory inventory$2; private final Option side$2; private final boolean simulate$2; private final BooleanRef success$1; private final IntRef remaining$1; public final void apply(int slot) {
/*     */       apply$mcVI$sp(slot);
/*     */     } public InventoryUtils$$anonfun$insertIntoInventory$2(ItemStack stack$2, IInventory inventory$2, Option side$2, boolean simulate$2, BooleanRef success$1, IntRef remaining$1) {} public void apply$mcVI$sp(int slot) {
/*     */       int stackSize = this.stack$2.field_77994_a;
/*     */       if (this.inventory$2.func_70301_a(slot) == null && InventoryUtils$.MODULE$.insertIntoInventorySlot(this.stack$2, this.inventory$2, this.side$2, slot, this.remaining$1.elem, this.simulate$2)) {
/*     */         this.remaining$1.elem -= stackSize - this.stack$2.field_77994_a;
/*     */         this.success$1.elem = true;
/*     */       } 
/*     */     } }
/*     */   public int extractAnyFromInventory(Function1 consumer, IInventory inventory, ForgeDirection side, int limit) {
/* 236 */     Object object = new Object(); try {
/* 237 */       Range range2; IInventory iInventory = inventory;
/* 238 */       if (iInventory instanceof ISidedInventory) { ISidedInventory iSidedInventory = (ISidedInventory)iInventory; Iterable iterable = scala.Predef$.MODULE$.intArrayOps(iSidedInventory.func_94128_d(side.ordinal())).toIterable(); }
/* 239 */       else { range2 = scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()); }
/*     */        Range range1 = range2;
/* 241 */       range1.foreach((Function1)new InventoryUtils$$anonfun$extractAnyFromInventory$1(consumer, inventory, side, limit, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object)
/*     */         return nonLocalReturnControl.value$mcI$sp(); 
/*     */     } 
/* 246 */     return 0;
/*     */   } public int extractAnyFromInventory$default$4() {
/*     */     return 64;
/*     */   } public final class InventoryUtils$$anonfun$extractAnyFromInventory$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Function1 consumer$1; private final IInventory inventory$4; private final ForgeDirection side$4; private final int limit$4; private final Object nonLocalReturnKey1$1; public final void apply(int slot) {
/*     */       apply$mcVI$sp(slot);
/*     */     }
/*     */     public InventoryUtils$$anonfun$extractAnyFromInventory$1(Function1 consumer$1, IInventory inventory$4, ForgeDirection side$4, int limit$4, Object nonLocalReturnKey1$1) {}
/*     */     public void apply$mcVI$sp(int slot) {
/*     */       int extracted = InventoryUtils$.MODULE$.extractFromInventorySlot(this.consumer$1, this.inventory$4, this.side$4, slot, this.limit$4);
/*     */       if (extracted > 0)
/*     */         throw new NonLocalReturnControl.mcI.sp(this.nonLocalReturnKey1$1, extracted); 
/*     */     } }
/* 259 */   public boolean extractFromInventory$default$4() { return false; } public boolean extractFromInventory$default$5() { return true; } public ItemStack extractFromInventory(ItemStack stack, IInventory inventory, ForgeDirection side, boolean simulate, boolean exact) { Range range2;
/* 260 */     IInventory iInventory = inventory;
/* 261 */     if (iInventory instanceof ISidedInventory) { ISidedInventory iSidedInventory = (ISidedInventory)iInventory; Iterable iterable = scala.Predef$.MODULE$.intArrayOps(iSidedInventory.func_94128_d(side.ordinal())).toIterable(); }
/* 262 */     else { range2 = scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()); }
/*     */      Range range1 = range2;
/* 264 */     ItemStack remaining = stack.func_77946_l();
/* 265 */     range1.withFilter((Function1)new InventoryUtils$$anonfun$extractFromInventory$1(remaining)).foreach((Function1)new InventoryUtils$$anonfun$extractFromInventory$2(inventory, side, simulate, exact, remaining));
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
/* 276 */     return remaining; } public final class InventoryUtils$$anonfun$extractFromInventory$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack remaining$2; public final boolean apply(int slot) { return apply$mcZI$sp(slot); } public boolean apply$mcZI$sp(int slot) { return (this.remaining$2.field_77994_a > 0); } public InventoryUtils$$anonfun$extractFromInventory$1(ItemStack remaining$2) {} } public final class InventoryUtils$$anonfun$extractFromInventory$2 extends AbstractFunction1.mcII.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IInventory inventory$3; private final ForgeDirection side$3; public final boolean simulate$3; public final boolean exact$1; public final ItemStack remaining$2; public final int apply(int slot) { return apply$mcII$sp(slot); } public InventoryUtils$$anonfun$extractFromInventory$2(IInventory inventory$3, ForgeDirection side$3, boolean simulate$3, boolean exact$1, ItemStack remaining$2) {} public int apply$mcII$sp(int slot) { return InventoryUtils$.MODULE$.extractFromInventorySlot((Function1<ItemStack, BoxedUnit>)new InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1(this), this.inventory$3, this.side$3, slot, this.remaining$2.field_77994_a); }
/*     */     public final class InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       public InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1(InventoryUtils$$anonfun$extractFromInventory$2 $outer) {}
/*     */       public final void apply(ItemStack stackInInv) { // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: ifnull -> 135
/*     */         //   4: aload_0
/*     */         //   5: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   8: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   11: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */         //   14: aload_1
/*     */         //   15: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */         //   18: astore_2
/*     */         //   19: dup
/*     */         //   20: ifnonnull -> 31
/*     */         //   23: pop
/*     */         //   24: aload_2
/*     */         //   25: ifnull -> 38
/*     */         //   28: goto -> 135
/*     */         //   31: aload_2
/*     */         //   32: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   35: ifeq -> 135
/*     */         //   38: aload_0
/*     */         //   39: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   42: getfield exact$1 : Z
/*     */         //   45: ifeq -> 66
/*     */         //   48: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */         //   51: aload_0
/*     */         //   52: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   55: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   58: aload_1
/*     */         //   59: iconst_1
/*     */         //   60: invokevirtual haveSameItemType : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Z)Z
/*     */         //   63: ifeq -> 135
/*     */         //   66: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */         //   69: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */         //   72: aload_1
/*     */         //   73: getfield field_77994_a : I
/*     */         //   76: invokevirtual intWrapper : (I)I
/*     */         //   79: aload_0
/*     */         //   80: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   83: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   86: getfield field_77994_a : I
/*     */         //   89: invokevirtual min$extension : (II)I
/*     */         //   92: istore_3
/*     */         //   93: aload_0
/*     */         //   94: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   97: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   100: aload_0
/*     */         //   101: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   104: getfield remaining$2 : Lnet/minecraft/item/ItemStack;
/*     */         //   107: getfield field_77994_a : I
/*     */         //   110: iload_3
/*     */         //   111: isub
/*     */         //   112: putfield field_77994_a : I
/*     */         //   115: aload_0
/*     */         //   116: getfield $outer : Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2;
/*     */         //   119: getfield simulate$3 : Z
/*     */         //   122: ifne -> 135
/*     */         //   125: aload_1
/*     */         //   126: aload_1
/*     */         //   127: getfield field_77994_a : I
/*     */         //   130: iload_3
/*     */         //   131: isub
/*     */         //   132: putfield field_77994_a : I
/*     */         //   135: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #267	-> 0
/*     */         //   #268	-> 69
/*     */         //   #269	-> 93
/*     */         //   #270	-> 115
/*     */         //   #271	-> 125
/*     */         //   #267	-> 135
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	136	0	this	Lli/cil/oc/util/InventoryUtils$$anonfun$extractFromInventory$2$$anonfun$apply$mcII$sp$1;
/*     */         //   0	136	1	stackInInv	Lnet/minecraft/item/ItemStack;
/*     */         //   93	43	3	transferred	I } } }
/* 283 */   public Option<ForgeDirection> insertIntoInventoryAt$default$3() { return (Option<ForgeDirection>)scala.None$.MODULE$; } public int insertIntoInventoryAt$default$4() { return 64; } public boolean insertIntoInventoryAt$default$5() { return false; }
/* 284 */   public boolean insertIntoInventoryAt(ItemStack stack, BlockPosition position, Option side, int limit, boolean simulate) { return inventoryAt(position).exists((Function1)new InventoryUtils$$anonfun$insertIntoInventoryAt$1(stack, side, limit, simulate)); } public final class InventoryUtils$$anonfun$insertIntoInventoryAt$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; private final Option side$1; private final int limit$1; private final boolean simulate$1; public final boolean apply(IInventory x$3) { return InventoryUtils$.MODULE$.insertIntoInventory(this.stack$1, x$3, this.side$1, this.limit$1, this.simulate$1, InventoryUtils$.MODULE$.insertIntoInventory$default$6()); }
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$insertIntoInventoryAt$1(ItemStack stack$1, Option side$1, int limit$1, boolean simulate$1) {} }
/*     */ 
/*     */   
/*     */   public int getExtractorFromInventoryAt$default$4()
/*     */   {
/* 292 */     return 64; } public Function0<Object> getExtractorFromInventoryAt(Function1 consumer, BlockPosition position, ForgeDirection side, int limit) { Function0 function0;
/* 293 */     Option<IInventory> option = inventoryAt(position);
/* 294 */     if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x(); function0 = (Function0)new InventoryUtils$$anonfun$getExtractorFromInventoryAt$1(consumer, side, limit, inventory); }
/* 295 */     else { function0 = null; }
/*     */     
/*     */     return function0; }
/*     */   
/*     */   public final class InventoryUtils$$anonfun$getExtractorFromInventoryAt$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Function1 consumer$2; private final ForgeDirection side$5; private final int limit$5; private final IInventory inventory$5;
/*     */     
/*     */     public final int apply() {
/*     */       return apply$mcI$sp();
/*     */     }
/*     */     
/*     */     public int apply$mcI$sp() {
/*     */       return InventoryUtils$.MODULE$.extractAnyFromInventory(this.consumer$2, this.inventory$5, this.side$5, this.limit$5);
/*     */     }
/*     */     
/*     */     public InventoryUtils$$anonfun$getExtractorFromInventoryAt$1(Function1 consumer$2, ForgeDirection side$5, int limit$5, IInventory inventory$5) {} }
/*     */   
/* 312 */   public int transferBetweenInventories$default$5() { return 64; }
/* 313 */   public int transferBetweenInventories(IInventory source, ForgeDirection sourceSide, IInventory sink, Option sinkSide, int limit) { return extractAnyFromInventory(
/* 314 */         (Function1<ItemStack, BoxedUnit>)new InventoryUtils$$anonfun$transferBetweenInventories$1(sink, sinkSide, limit), source, sourceSide, limit); } public final class InventoryUtils$$anonfun$transferBetweenInventories$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory sink$1; private final Option sinkSide$3; private final int limit$6; public final void apply(ItemStack x$4) { InventoryUtils$.MODULE$.insertIntoInventory(x$4, this.sink$1, this.sinkSide$3, this.limit$6, InventoryUtils$.MODULE$.insertIntoInventory$default$5(), InventoryUtils$.MODULE$.insertIntoInventory$default$6()); }
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$transferBetweenInventories$1(IInventory sink$1, Option sinkSide$3, int limit$6) {} }
/*     */   
/* 319 */   public int transferBetweenInventoriesSlots$default$7() { return 64; } public int transferBetweenInventoriesSlots(IInventory source, ForgeDirection sourceSide, int sourceSlot, IInventory sink, Option sinkSide, Option sinkSlot, int limit) { int i;
/* 320 */     Option option = sinkSlot;
/* 321 */     if (option instanceof Some) { Some some = (Some)option; int explicitSinkSlot = BoxesRunTime.unboxToInt(some.x());
/* 322 */       i = extractFromInventorySlot(
/* 323 */           (Function1<ItemStack, BoxedUnit>)new InventoryUtils$$anonfun$transferBetweenInventoriesSlots$1(sink, sinkSide, limit, explicitSinkSlot), source, sourceSide, sourceSlot, limit); }
/*     */     else
/* 325 */     { i = extractFromInventorySlot(
/* 326 */           (Function1<ItemStack, BoxedUnit>)new InventoryUtils$$anonfun$transferBetweenInventoriesSlots$2(sink, sinkSide, limit), source, sourceSide, sourceSlot, limit); }  return i; } public final class InventoryUtils$$anonfun$transferBetweenInventoriesSlots$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory sink$2; private final Option sinkSide$4; private final int limit$7; private final int explicitSinkSlot$1; public final void apply(ItemStack x$5) { InventoryUtils$.MODULE$.insertIntoInventorySlot(x$5, this.sink$2, this.sinkSide$4, this.explicitSinkSlot$1, this.limit$7, InventoryUtils$.MODULE$.insertIntoInventorySlot$default$6()); } public InventoryUtils$$anonfun$transferBetweenInventoriesSlots$1(IInventory sink$2, Option sinkSide$4, int limit$7, int explicitSinkSlot$1) {} } public final class InventoryUtils$$anonfun$transferBetweenInventoriesSlots$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory sink$2; private final Option sinkSide$4; private final int limit$7; public final void apply(ItemStack x$6) { InventoryUtils$.MODULE$.insertIntoInventory(x$6, this.sink$2, this.sinkSide$4, this.limit$7, InventoryUtils$.MODULE$.insertIntoInventory$default$5(), InventoryUtils$.MODULE$.insertIntoInventory$default$6()); }
/*     */ 
/*     */     
/*     */     public InventoryUtils$$anonfun$transferBetweenInventoriesSlots$2(IInventory sink$2, Option sinkSide$4, int limit$7) {} }
/*     */ 
/*     */   
/*     */   public int getTransferBetweenInventoriesAt$default$5() {
/* 333 */     return 64; } public Function0<Object> getTransferBetweenInventoriesAt(BlockPosition source, ForgeDirection sourceSide, BlockPosition sink, Option sinkSide, int limit) { Function0 function0;
/* 334 */     Option<IInventory> option = inventoryAt(source);
/* 335 */     if (option instanceof Some) { Object object; Some some = (Some)option; IInventory sourceInventory = (IInventory)some.x();
/* 336 */       Option<IInventory> option1 = inventoryAt(sink);
/* 337 */       if (option1 instanceof Some) { Some some1 = (Some)option1; IInventory sinkInventory = (IInventory)some1.x(); object = new InventoryUtils$$anonfun$getTransferBetweenInventoriesAt$1(sourceSide, sinkSide, limit, sourceInventory, sinkInventory); }
/* 338 */       else { object = null; }
/*     */        function0 = (Function0)object; }
/* 340 */     else { function0 = null; }
/*     */     
/*     */     return function0; } public final class InventoryUtils$$anonfun$getTransferBetweenInventoriesAt$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ForgeDirection sourceSide$2; private final Option sinkSide$2; private final int limit$3; private final IInventory sourceInventory$1; private final IInventory sinkInventory$1; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() {
/*     */       return InventoryUtils$.MODULE$.transferBetweenInventories(this.sourceInventory$1, this.sourceSide$2, this.sinkInventory$1, this.sinkSide$2, this.limit$3);
/*     */     }
/*     */     public InventoryUtils$$anonfun$getTransferBetweenInventoriesAt$1(ForgeDirection sourceSide$2, Option sinkSide$2, int limit$3, IInventory sourceInventory$1, IInventory sinkInventory$1) {} }
/* 347 */   public int getTransferBetweenInventoriesSlotsAt$default$7() { return 64; } public Function0<Object> getTransferBetweenInventoriesSlotsAt(BlockPosition sourcePos, ForgeDirection sourceSide, int sourceSlot, BlockPosition sinkPos, Option sinkSide, Option sinkSlot, int limit) { Function0 function0;
/* 348 */     Option<IInventory> option = inventoryAt(sourcePos);
/* 349 */     if (option instanceof Some) { Object object; Some some = (Some)option; IInventory sourceInventory = (IInventory)some.x();
/* 350 */       Option<IInventory> option1 = inventoryAt(sinkPos);
/* 351 */       if (option1 instanceof Some) { Some some1 = (Some)option1; IInventory sinkInventory = (IInventory)some1.x(); object = new InventoryUtils$$anonfun$getTransferBetweenInventoriesSlotsAt$1(sourceSide, sourceSlot, sinkSide, sinkSlot, limit, sourceInventory, sinkInventory); }
/* 352 */       else { object = null; }
/*     */        function0 = (Function0)object; }
/* 354 */     else { function0 = null; }
/*     */     
/*     */     return function0; } public final class InventoryUtils$$anonfun$getTransferBetweenInventoriesSlotsAt$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ForgeDirection sourceSide$1; private final int sourceSlot$1; private final Option sinkSide$1; private final Option sinkSlot$1; private final int limit$2; private final IInventory sourceInventory$2; private final IInventory sinkInventory$2; public final int apply() { return apply$mcI$sp(); } public int apply$mcI$sp() {
/*     */       return InventoryUtils$.MODULE$.transferBetweenInventoriesSlots(this.sourceInventory$2, this.sourceSide$1, this.sourceSlot$1, this.sinkInventory$2, this.sinkSide$1, this.sinkSlot$1, this.limit$2);
/*     */     }
/*     */     public InventoryUtils$$anonfun$getTransferBetweenInventoriesSlotsAt$1(ForgeDirection sourceSide$1, int sourceSlot$1, Option sinkSide$1, Option sinkSlot$1, int limit$2, IInventory sourceInventory$2, IInventory sinkInventory$2) {} }
/* 361 */   public Option<ForgeDirection> dropSlot$default$5() { return (Option<ForgeDirection>)scala.None$.MODULE$; } public boolean dropSlot(BlockPosition position, IInventory inventory, int slot, int count, Option<ForgeDirection> direction) {
/* 362 */     Option option = scala.Option$.MODULE$.apply(inventory.func_70298_a(slot, count));
/* 363 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); if (stack.field_77994_a > 0) { spawnStackInWorld(position, stack, direction, spawnStackInWorld$default$4());
/*     */         return true; }
/*     */        }
/*     */     
/*     */     return false;
/*     */   }
/*     */   
/*     */   public void dropAllSlots(BlockPosition position, IInventory inventory)
/*     */   {
/* 372 */     scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()).foreach((Function1)new InventoryUtils$$anonfun$dropAllSlots$1(position, inventory)); } public final class InventoryUtils$$anonfun$dropAllSlots$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; private final BlockPosition position$1; private final IInventory inventory$1; public InventoryUtils$$anonfun$dropAllSlots$1(BlockPosition position$1, IInventory inventory$1) {} public final Object apply(int slot) {
/* 373 */       Option option = scala.Option$.MODULE$.apply(this.inventory$1.func_70301_a(slot));
/* 374 */       if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); if (stack.field_77994_a > 0)
/* 375 */         { this.inventory$1.func_70299_a(slot, null);
/* 376 */           return InventoryUtils$.MODULE$.spawnStackInWorld(this.position$1, stack, InventoryUtils$.MODULE$.spawnStackInWorld$default$3(), InventoryUtils$.MODULE$.spawnStackInWorld$default$4()); }  }
/* 377 */        return BoxedUnit.UNIT;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean addToPlayerInventory$default$3()
/*     */   {
/* 385 */     return true; } public void addToPlayerInventory(ItemStack stack, EntityPlayer player, boolean spawnInWorld) {
/* 386 */     if (stack != null) {
/* 387 */       if (player.field_71071_by.func_70441_a(stack)) {
/* 388 */         player.field_71071_by.func_70296_d();
/* 389 */         if (player.field_71070_bA != null) {
/* 390 */           player.field_71070_bA.func_75142_b();
/*     */         }
/*     */       } 
/* 393 */       if (stack.field_77994_a > 0 && spawnInWorld) {
/* 394 */         player.func_71019_a(stack, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityItem spawnStackInWorld(BlockPosition position, ItemStack stack, Option direction, Option validator) {
/* 402 */     Option<World> option = position.world();
/* 403 */     if (option instanceof Some) { Some some = (Some)option; World world = (World)some.x(); if (stack != null && stack.field_77994_a > 0)
/* 404 */       { Random rng = world.field_73012_v;
/* 405 */         Tuple3 tuple3 = (Tuple3)direction.fold((Function0)new InventoryUtils$$anonfun$2(), (Function1)new InventoryUtils$$anonfun$3()); if (tuple3 != null) { int ox = BoxesRunTime.unboxToInt(tuple3._1()), oy = BoxesRunTime.unboxToInt(tuple3._2()), oz = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(ox), BoxesRunTime.boxToInteger(oy), BoxesRunTime.boxToInteger(oz)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 406 */           Tuple3 tuple33 = new Tuple3(
/* 407 */               BoxesRunTime.boxToDouble(0.1D * (rng.nextDouble() - 0.5D) + i * 0.65D), 
/* 408 */               BoxesRunTime.boxToDouble(0.1D * (rng.nextDouble() - 0.5D) + j * 0.75D + (i + k) * 0.25D), 
/* 409 */               BoxesRunTime.boxToDouble(0.1D * (rng.nextDouble() - 0.5D) + k * 0.65D)); if (tuple33 != null)
/* 410 */           { double tx = BoxesRunTime.unboxToDouble(tuple33._1()), ty = BoxesRunTime.unboxToDouble(tuple33._2()), tz = BoxesRunTime.unboxToDouble(tuple33._3()); Tuple3 tuple35 = new Tuple3(BoxesRunTime.boxToDouble(tx), BoxesRunTime.boxToDouble(ty), BoxesRunTime.boxToDouble(tz)), tuple34 = tuple35; double d1 = BoxesRunTime.unboxToDouble(tuple34._1()), d2 = BoxesRunTime.unboxToDouble(tuple34._2()), d3 = BoxesRunTime.unboxToDouble(tuple34._3()); Vec3 dropPos = position.offset(0.5D + d1, 0.5D + d2, 0.5D + d3);
/* 411 */             EntityItem entity = new EntityItem(world, dropPos.field_72450_a, dropPos.field_72448_b, dropPos.field_72449_c, stack.func_77946_l());
/* 412 */             ((Entity)entity).field_70159_w = 0.0125D * (rng.nextDouble() - 0.5D) + i * 0.03D;
/* 413 */             ((Entity)entity).field_70181_x = 0.0125D * (rng.nextDouble() - 0.5D) + j * 0.08D + (i + k) * 0.03D;
/* 414 */             ((Entity)entity).field_70179_y = 0.0125D * (rng.nextDouble() - 0.5D) + k * 0.03D;
/* 415 */             entity.field_145804_b = 15;
/*     */             
/* 417 */             world.func_72838_d((Entity)entity);
/* 418 */             EntityItem entityItem1 = BoxesRunTime.unboxToBoolean(validator.fold((Function0)new InventoryUtils$$anonfun$spawnStackInWorld$1(), (Function1)new InventoryUtils$$anonfun$spawnStackInWorld$2(entity))) ? entity : 
/*     */               
/* 420 */               null; }  throw new MatchError(tuple33); }  throw new MatchError(tuple3); }  }
/* 421 */      return null;
/*     */   } public Option<ForgeDirection> spawnStackInWorld$default$3() { return (Option<ForgeDirection>)scala.None$.MODULE$; } public Option<Function1<EntityItem, Object>> spawnStackInWorld$default$4() { return (Option<Function1<EntityItem, Object>>)scala.None$.MODULE$; } public final class InventoryUtils$$anonfun$2 extends AbstractFunction0<Tuple3<Object, Object, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Tuple3<Object, Object, Object> apply() { return new Tuple3(BoxesRunTime.boxToInteger(0), BoxesRunTime.boxToInteger(0), BoxesRunTime.boxToInteger(0)); } } public final class InventoryUtils$$anonfun$3 extends AbstractFunction1<ForgeDirection, Tuple3<Object, Object, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Tuple3<Object, Object, Object> apply(ForgeDirection d) { return new Tuple3(BoxesRunTime.boxToInteger(d.offsetX), BoxesRunTime.boxToInteger(d.offsetY), BoxesRunTime.boxToInteger(d.offsetZ)); } } public final class InventoryUtils$$anonfun$spawnStackInWorld$1 extends AbstractFunction0.mcZ.sp implements Serializable {
/* 425 */     public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } } public final class InventoryUtils$$anonfun$spawnStackInWorld$2 extends AbstractFunction1<Function1<EntityItem, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final EntityItem entity$1; public final boolean apply(Function1 x$9) { return BoxesRunTime.unboxToBoolean(x$9.apply(this.entity$1)); } public InventoryUtils$$anonfun$spawnStackInWorld$2(EntityItem entity$1) {} } private InventoryUtils$() { MODULE$ = this; }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\InventoryUtils$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */