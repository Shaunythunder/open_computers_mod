/*     */ package li.cil.oc.server.component.traits;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.ExtendedArguments;
/*     */ import li.cil.oc.util.ExtendedArguments$;
/*     */ import li.cil.oc.util.InventoryUtils$;
/*     */ import li.cil.oc.util.ResultWrapper$;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.NonLocalReturnControl;
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
/*     */ public abstract class InventoryWorldControl$class
/*     */ {
/*     */   public static void $init$(InventoryWorldControl $this) {}
/*     */   
/*     */   @Callback(doc = "function(side:number[, fuzzy:boolean=false]):boolean -- Compare the block on the specified side with the one in the selected slot. Returns true if equal.")
/*     */   public static Object[] compare(InventoryWorldControl $this, Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_2
/*     */     //   2: iconst_0
/*     */     //   3: invokeinterface checkSideForAction : (Lli/cil/oc/api/machine/Arguments;I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   8: astore_3
/*     */     //   9: aload_0
/*     */     //   10: aload_0
/*     */     //   11: invokeinterface selectedSlot : ()I
/*     */     //   16: invokeinterface stackInSlot : (I)Lscala/Option;
/*     */     //   21: astore #4
/*     */     //   23: aload #4
/*     */     //   25: instanceof scala/Some
/*     */     //   28: ifeq -> 272
/*     */     //   31: aload #4
/*     */     //   33: checkcast scala/Some
/*     */     //   36: astore #5
/*     */     //   38: aload #5
/*     */     //   40: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   43: checkcast net/minecraft/item/ItemStack
/*     */     //   46: astore #6
/*     */     //   48: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   51: aload #6
/*     */     //   53: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   56: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   59: astore #8
/*     */     //   61: aload #8
/*     */     //   63: instanceof scala/Some
/*     */     //   66: ifeq -> 259
/*     */     //   69: aload #8
/*     */     //   71: checkcast scala/Some
/*     */     //   74: astore #9
/*     */     //   76: aload #9
/*     */     //   78: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   81: checkcast net/minecraft/item/Item
/*     */     //   84: astore #10
/*     */     //   86: aload #10
/*     */     //   88: instanceof net/minecraft/item/ItemBlock
/*     */     //   91: ifeq -> 259
/*     */     //   94: aload #10
/*     */     //   96: checkcast net/minecraft/item/ItemBlock
/*     */     //   99: astore #11
/*     */     //   101: aload_0
/*     */     //   102: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   107: aload_3
/*     */     //   108: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   111: astore #13
/*     */     //   113: aload #11
/*     */     //   115: getfield field_150939_a : Lnet/minecraft/block/Block;
/*     */     //   118: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   121: aload_0
/*     */     //   122: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   127: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   130: aload #13
/*     */     //   132: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */     //   135: astore #15
/*     */     //   137: dup
/*     */     //   138: ifnonnull -> 150
/*     */     //   141: pop
/*     */     //   142: aload #15
/*     */     //   144: ifnull -> 158
/*     */     //   147: goto -> 162
/*     */     //   150: aload #15
/*     */     //   152: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   155: ifeq -> 162
/*     */     //   158: iconst_1
/*     */     //   159: goto -> 163
/*     */     //   162: iconst_0
/*     */     //   163: istore #14
/*     */     //   165: aload_2
/*     */     //   166: iconst_1
/*     */     //   167: iconst_0
/*     */     //   168: invokeinterface optBoolean : (IZ)Z
/*     */     //   173: ifne -> 218
/*     */     //   176: aload #11
/*     */     //   178: invokevirtual func_77614_k : ()Z
/*     */     //   181: ifeq -> 218
/*     */     //   184: aload #11
/*     */     //   186: aload #6
/*     */     //   188: invokevirtual func_77960_j : ()I
/*     */     //   191: invokevirtual func_77647_b : (I)I
/*     */     //   194: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   197: aload_0
/*     */     //   198: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   203: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   206: aload #13
/*     */     //   208: invokevirtual getBlockMetadata : (Lli/cil/oc/util/BlockPosition;)I
/*     */     //   211: if_icmpeq -> 218
/*     */     //   214: iconst_0
/*     */     //   215: goto -> 219
/*     */     //   218: iconst_1
/*     */     //   219: istore #16
/*     */     //   221: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*     */     //   224: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   227: iconst_1
/*     */     //   228: anewarray java/lang/Object
/*     */     //   231: dup
/*     */     //   232: iconst_0
/*     */     //   233: iload #14
/*     */     //   235: ifeq -> 247
/*     */     //   238: iload #16
/*     */     //   240: ifeq -> 247
/*     */     //   243: iconst_1
/*     */     //   244: goto -> 248
/*     */     //   247: iconst_0
/*     */     //   248: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   251: aastore
/*     */     //   252: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   255: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   258: areturn
/*     */     //   259: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   262: astore #12
/*     */     //   264: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   267: astore #7
/*     */     //   269: goto -> 277
/*     */     //   272: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   275: astore #7
/*     */     //   277: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*     */     //   280: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   283: iconst_1
/*     */     //   284: anewarray java/lang/Object
/*     */     //   287: dup
/*     */     //   288: iconst_0
/*     */     //   289: iconst_0
/*     */     //   290: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   293: aastore
/*     */     //   294: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   297: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   300: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #21	-> 0
/*     */     //   #22	-> 9
/*     */     //   #23	-> 23
/*     */     //   #24	-> 61
/*     */     //   #25	-> 101
/*     */     //   #26	-> 113
/*     */     //   #27	-> 165
/*     */     //   #28	-> 221
/*     */     //   #29	-> 259
/*     */     //   #23	-> 264
/*     */     //   #31	-> 272
/*     */     //   #33	-> 277
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	301	0	$this	Lli/cil/oc/server/component/traits/InventoryWorldControl;
/*     */     //   0	301	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	301	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   9	291	3	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   48	253	6	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   86	215	10	item	Lnet/minecraft/item/Item;
/*     */     //   113	188	13	blockPos	Lli/cil/oc/util/BlockPosition;
/*     */     //   165	136	14	idMatches	Z
/*     */     //   221	80	16	subTypeMatches	Z
/*     */   }
/*     */   
/*     */   @Callback(doc = "function(side:number[, count:number=64]):boolean -- Drops items from the selected slot towards the specified side.")
/*     */   public static Object[] drop(InventoryWorldControl $this, Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_2
/*     */     //   2: iconst_0
/*     */     //   3: invokeinterface checkSideForAction : (Lli/cil/oc/api/machine/Arguments;I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   8: astore_3
/*     */     //   9: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*     */     //   12: aload_2
/*     */     //   13: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*     */     //   16: astore #5
/*     */     //   18: iconst_1
/*     */     //   19: istore #6
/*     */     //   21: aload #5
/*     */     //   23: invokevirtual optItemCount$default$2 : ()I
/*     */     //   26: istore #7
/*     */     //   28: aload #5
/*     */     //   30: iload #6
/*     */     //   32: iload #7
/*     */     //   34: invokevirtual optItemCount : (II)I
/*     */     //   37: istore #4
/*     */     //   39: aload_0
/*     */     //   40: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   45: aload_0
/*     */     //   46: invokeinterface selectedSlot : ()I
/*     */     //   51: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   56: astore #8
/*     */     //   58: aload #8
/*     */     //   60: ifnull -> 424
/*     */     //   63: aload #8
/*     */     //   65: getfield field_77994_a : I
/*     */     //   68: iconst_0
/*     */     //   69: if_icmple -> 424
/*     */     //   72: aload_0
/*     */     //   73: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   78: aload_3
/*     */     //   79: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   82: astore #9
/*     */     //   84: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   87: aload #9
/*     */     //   89: invokevirtual inventoryAt : (Lli/cil/oc/util/BlockPosition;)Lscala/Option;
/*     */     //   92: astore #10
/*     */     //   94: aload #10
/*     */     //   96: instanceof scala/Some
/*     */     //   99: ifeq -> 269
/*     */     //   102: aload #10
/*     */     //   104: checkcast scala/Some
/*     */     //   107: astore #11
/*     */     //   109: aload #11
/*     */     //   111: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   114: checkcast net/minecraft/inventory/IInventory
/*     */     //   117: astore #12
/*     */     //   119: aload #12
/*     */     //   121: aload_0
/*     */     //   122: invokeinterface fakePlayer : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   127: invokeinterface func_70300_a : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */     //   132: ifeq -> 269
/*     */     //   135: aload_0
/*     */     //   136: aload #9
/*     */     //   138: aload_3
/*     */     //   139: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   142: invokeinterface mayInteract : (Lli/cil/oc/util/BlockPosition;Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */     //   147: ifeq -> 269
/*     */     //   150: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   153: aload #8
/*     */     //   155: aload #12
/*     */     //   157: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   160: aload_3
/*     */     //   161: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   164: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   167: iload #4
/*     */     //   169: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   172: invokevirtual insertIntoInventory$default$5 : ()Z
/*     */     //   175: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   178: invokevirtual insertIntoInventory$default$6 : ()Lscala/Option;
/*     */     //   181: invokevirtual insertIntoInventory : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/IInventory;Lscala/Option;IZLscala/Option;)Z
/*     */     //   184: ifeq -> 239
/*     */     //   187: aload #8
/*     */     //   189: getfield field_77994_a : I
/*     */     //   192: iconst_0
/*     */     //   193: if_icmpne -> 220
/*     */     //   196: aload_0
/*     */     //   197: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   202: aload_0
/*     */     //   203: invokeinterface selectedSlot : ()I
/*     */     //   208: aconst_null
/*     */     //   209: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   214: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   217: goto -> 234
/*     */     //   220: aload_0
/*     */     //   221: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   226: invokeinterface func_70296_d : ()V
/*     */     //   231: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   234: astore #13
/*     */     //   236: goto -> 379
/*     */     //   239: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*     */     //   242: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   245: iconst_2
/*     */     //   246: anewarray java/lang/Object
/*     */     //   249: dup
/*     */     //   250: iconst_0
/*     */     //   251: iconst_0
/*     */     //   252: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   255: aastore
/*     */     //   256: dup
/*     */     //   257: iconst_1
/*     */     //   258: ldc_w 'inventory full'
/*     */     //   261: aastore
/*     */     //   262: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   265: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   268: areturn
/*     */     //   269: aload_0
/*     */     //   270: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   275: aload_0
/*     */     //   276: invokeinterface selectedSlot : ()I
/*     */     //   281: iload #4
/*     */     //   283: invokeinterface func_70298_a : (II)Lnet/minecraft/item/ItemStack;
/*     */     //   288: astore #14
/*     */     //   290: new li/cil/oc/server/component/traits/InventoryWorldControl$$anonfun$1
/*     */     //   293: dup
/*     */     //   294: aload_0
/*     */     //   295: invokespecial <init> : (Lli/cil/oc/server/component/traits/InventoryWorldControl;)V
/*     */     //   298: astore #15
/*     */     //   300: aload #14
/*     */     //   302: ifnull -> 374
/*     */     //   305: aload #14
/*     */     //   307: getfield field_77994_a : I
/*     */     //   310: iconst_0
/*     */     //   311: if_icmple -> 374
/*     */     //   314: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   317: aload_0
/*     */     //   318: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   323: aload #14
/*     */     //   325: new scala/Some
/*     */     //   328: dup
/*     */     //   329: aload_3
/*     */     //   330: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   333: new scala/Some
/*     */     //   336: dup
/*     */     //   337: aload #15
/*     */     //   339: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   342: invokevirtual spawnStackInWorld : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/item/ItemStack;Lscala/Option;Lscala/Option;)Lnet/minecraft/entity/item/EntityItem;
/*     */     //   345: ifnonnull -> 368
/*     */     //   348: aload_0
/*     */     //   349: invokeinterface fakePlayer : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   354: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   357: aload #14
/*     */     //   359: invokevirtual func_70441_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   362: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   365: goto -> 377
/*     */     //   368: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   371: goto -> 377
/*     */     //   374: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   377: astore #13
/*     */     //   379: aload #13
/*     */     //   381: pop
/*     */     //   382: aload_1
/*     */     //   383: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   386: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   389: invokevirtual dropDelay : ()D
/*     */     //   392: invokeinterface pause : (D)Z
/*     */     //   397: pop
/*     */     //   398: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*     */     //   401: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   404: iconst_1
/*     */     //   405: anewarray java/lang/Object
/*     */     //   408: dup
/*     */     //   409: iconst_0
/*     */     //   410: iconst_1
/*     */     //   411: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   414: aastore
/*     */     //   415: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   418: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   421: goto -> 447
/*     */     //   424: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*     */     //   427: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   430: iconst_1
/*     */     //   431: anewarray java/lang/Object
/*     */     //   434: dup
/*     */     //   435: iconst_0
/*     */     //   436: iconst_0
/*     */     //   437: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   440: aastore
/*     */     //   441: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   444: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   447: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #38	-> 0
/*     */     //   #39	-> 9
/*     */     //   #40	-> 39
/*     */     //   #41	-> 58
/*     */     //   #42	-> 72
/*     */     //   #43	-> 84
/*     */     //   #44	-> 94
/*     */     //   #45	-> 150
/*     */     //   #49	-> 187
/*     */     //   #51	-> 196
/*     */     //   #55	-> 220
/*     */     //   #45	-> 234
/*     */     //   #47	-> 239
/*     */     //   #59	-> 269
/*     */     //   #60	-> 290
/*     */     //   #66	-> 300
/*     */     //   #67	-> 314
/*     */     //   #68	-> 348
/*     */     //   #67	-> 368
/*     */     //   #66	-> 374
/*     */     //   #57	-> 377
/*     */     //   #43	-> 379
/*     */     //   #72	-> 382
/*     */     //   #74	-> 398
/*     */     //   #76	-> 424
/*     */     //   #37	-> 447
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	448	0	$this	Lli/cil/oc/server/component/traits/InventoryWorldControl;
/*     */     //   0	448	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	448	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   9	439	3	facing	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   18	19	5	qual$3	Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*     */     //   21	16	6	x$2	I
/*     */     //   28	9	7	x$3	I
/*     */     //   39	409	4	count	I
/*     */     //   58	390	8	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   84	337	9	blockPos	Lli/cil/oc/util/BlockPosition;
/*     */     //   119	329	12	inv	Lnet/minecraft/inventory/IInventory;
/*     */     //   290	158	14	dropped	Lnet/minecraft/item/ItemStack;
/*     */     //   300	148	15	validator	Lscala/Function1;
/*     */   }
/*     */   
/*     */   public static int suckFromItems(InventoryWorldControl $this, ForgeDirection facing) {
/*  83 */     Object object = new Object(); try {
/*  84 */       $this.suckableItems(facing).withFilter((Function1)new InventoryWorldControl$$anonfun$suckFromItems$1($this)).foreach((Function1)new InventoryWorldControl$$anonfun$suckFromItems$2($this, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return nonLocalReturnControl.value$mcI$sp();
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  93 */     return 0;
/*     */   }
/*     */   @Callback(doc = "function(side:number[, count:number=64]):boolean -- Suck up items from the specified side.")
/*     */   public static Object[] suck(InventoryWorldControl $this, Context context, Arguments args) {
/*     */     boolean bool;
/*  98 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/*  99 */     ExtendedArguments.ExtendedArguments qual$4 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$4 = 1, x$5 = qual$4.optItemCount$default$2(), count = qual$4.optItemCount(x$4, x$5);
/*     */     
/* 101 */     BlockPosition blockPos = $this.position().offset(facing);
/* 102 */     Option option = InventoryUtils$.MODULE$.inventoryAt(blockPos);
/* 103 */     if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x(); (inventory.func_70300_a($this.fakePlayer()) && $this.mayInteract(blockPos, facing.getOpposite())) ? 1 : 0; bool = 
/* 104 */         InventoryUtils$.MODULE$.extractAnyFromInventory((Function1)new InventoryWorldControl$$anonfun$2($this), inventory, facing.getOpposite(), count); }
/* 105 */     else { bool = false; }
/*     */      int extracted = bool;
/* 107 */     if (extracted <= 0) {
/* 108 */       extracted = $this.suckFromItems(facing);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 113 */     context.pause(Settings$.MODULE$.get().suckDelay());
/* 114 */     return (extracted <= 0) ? ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })) : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(extracted) }));
/*     */   }
/*     */   
/*     */   public static Buffer suckableItems(InventoryWorldControl $this, ForgeDirection side) {
/* 118 */     return $this.entitiesOnSide(side, ClassTag$.MODULE$.apply(EntityItem.class));
/*     */   } public static void onSuckCollect(InventoryWorldControl $this, EntityItem entity) {
/* 120 */     entity.func_70100_b_($this.fakePlayer());
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryWorldControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */