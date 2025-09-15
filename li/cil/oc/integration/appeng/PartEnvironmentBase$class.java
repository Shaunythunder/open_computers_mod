/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.api.implementations.tiles.ISegmentedInventory;
/*    */ import appeng.api.parts.IPart;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import li.cil.oc.util.ResultWrapper$;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Unit$;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ClassTag;
/*    */ 
/*    */ public abstract class PartEnvironmentBase$class {
/*    */   public static Object[] getPartConfig(PartEnvironmentBase $this, Context context, Arguments args, ClassTag evidence$1) {
/*    */     Object[] arrayOfObject;
/* 21 */     ForgeDirection side = ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/* 22 */     IPart iPart = $this.host().getPart(side);
/* 23 */     Option option = evidence$1.unapply(iPart); if (!option.isEmpty() && option.get() != null)
/* 24 */     { IInventory config = ((ISegmentedInventory)iPart).getInventoryByName("config");
/* 25 */       int slot = ExtendedArguments$.MODULE$.extendedArguments(args).optSlot(config, 1, 0);
/* 26 */       ItemStack stack = config.func_70301_a(slot);
/* 27 */       arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { stack })); }
/* 28 */     else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no matching part" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */   
/*    */   public static void $init$(PartEnvironmentBase $this) {}
/*    */   
/*    */   public static Object[] setPartConfig(PartEnvironmentBase $this, Context context, Arguments args, ClassTag evidence$2) {
/*    */     // Byte code:
/*    */     //   0: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*    */     //   3: aload_2
/*    */     //   4: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   7: iconst_0
/*    */     //   8: invokevirtual checkSideAny : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   11: astore #4
/*    */     //   13: aload_0
/*    */     //   14: invokeinterface host : ()Lappeng/api/parts/IPartHost;
/*    */     //   19: aload #4
/*    */     //   21: invokeinterface getPart : (Lnet/minecraftforge/common/util/ForgeDirection;)Lappeng/api/parts/IPart;
/*    */     //   26: astore #5
/*    */     //   28: aload_3
/*    */     //   29: aload #5
/*    */     //   31: invokeinterface unapply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   36: astore #6
/*    */     //   38: aload #6
/*    */     //   40: invokevirtual isEmpty : ()Z
/*    */     //   43: ifne -> 483
/*    */     //   46: aload #6
/*    */     //   48: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   51: ifnull -> 483
/*    */     //   54: aload #5
/*    */     //   56: checkcast appeng/api/implementations/tiles/ISegmentedInventory
/*    */     //   59: ldc 'config'
/*    */     //   61: invokeinterface getInventoryByName : (Ljava/lang/String;)Lnet/minecraft/inventory/IInventory;
/*    */     //   66: astore #8
/*    */     //   68: aload_2
/*    */     //   69: iconst_1
/*    */     //   70: invokeinterface isString : (I)Z
/*    */     //   75: ifeq -> 82
/*    */     //   78: iconst_0
/*    */     //   79: goto -> 96
/*    */     //   82: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*    */     //   85: aload_2
/*    */     //   86: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   89: aload #8
/*    */     //   91: iconst_1
/*    */     //   92: iconst_0
/*    */     //   93: invokevirtual optSlot : (Lnet/minecraft/inventory/IInventory;II)I
/*    */     //   96: istore #9
/*    */     //   98: aload_2
/*    */     //   99: invokeinterface count : ()I
/*    */     //   104: iconst_2
/*    */     //   105: if_icmple -> 431
/*    */     //   108: aload_2
/*    */     //   109: iconst_1
/*    */     //   110: invokeinterface isString : (I)Z
/*    */     //   115: ifeq -> 156
/*    */     //   118: new scala/Tuple3
/*    */     //   121: dup
/*    */     //   122: aload_2
/*    */     //   123: iconst_1
/*    */     //   124: invokeinterface checkString : (I)Ljava/lang/String;
/*    */     //   129: aload_2
/*    */     //   130: iconst_2
/*    */     //   131: invokeinterface checkInteger : (I)I
/*    */     //   136: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   139: aload_2
/*    */     //   140: iconst_3
/*    */     //   141: iconst_1
/*    */     //   142: invokeinterface optInteger : (II)I
/*    */     //   147: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   150: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   153: goto -> 191
/*    */     //   156: new scala/Tuple3
/*    */     //   159: dup
/*    */     //   160: aload_2
/*    */     //   161: iconst_2
/*    */     //   162: invokeinterface checkString : (I)Ljava/lang/String;
/*    */     //   167: aload_2
/*    */     //   168: iconst_3
/*    */     //   169: invokeinterface checkInteger : (I)I
/*    */     //   174: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   177: aload_2
/*    */     //   178: iconst_4
/*    */     //   179: iconst_1
/*    */     //   180: invokeinterface optInteger : (II)I
/*    */     //   185: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   188: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   191: astore #12
/*    */     //   193: aload #12
/*    */     //   195: ifnull -> 421
/*    */     //   198: aload #12
/*    */     //   200: invokevirtual _1 : ()Ljava/lang/Object;
/*    */     //   203: checkcast java/lang/String
/*    */     //   206: astore #13
/*    */     //   208: aload #12
/*    */     //   210: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   213: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */     //   216: istore #14
/*    */     //   218: aload #12
/*    */     //   220: invokevirtual _3 : ()Ljava/lang/Object;
/*    */     //   223: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */     //   226: istore #15
/*    */     //   228: new scala/Tuple3
/*    */     //   231: dup
/*    */     //   232: aload #13
/*    */     //   234: iload #14
/*    */     //   236: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   239: iload #15
/*    */     //   241: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   244: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   247: astore #16
/*    */     //   249: aload #16
/*    */     //   251: astore #11
/*    */     //   253: aload #11
/*    */     //   255: invokevirtual _1 : ()Ljava/lang/Object;
/*    */     //   258: checkcast java/lang/String
/*    */     //   261: astore #17
/*    */     //   263: aload #11
/*    */     //   265: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   268: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */     //   271: istore #18
/*    */     //   273: aload #11
/*    */     //   275: invokevirtual _3 : ()Ljava/lang/Object;
/*    */     //   278: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */     //   281: istore #19
/*    */     //   283: aload_0
/*    */     //   284: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*    */     //   289: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */     //   294: aload #17
/*    */     //   296: invokeinterface node : (Ljava/lang/String;)Lli/cil/oc/api/network/Node;
/*    */     //   301: astore #20
/*    */     //   303: aload #20
/*    */     //   305: instanceof li/cil/oc/api/network/Component
/*    */     //   308: ifeq -> 411
/*    */     //   311: aload #20
/*    */     //   313: checkcast li/cil/oc/api/network/Component
/*    */     //   316: astore #21
/*    */     //   318: aload #21
/*    */     //   320: invokeinterface host : ()Lli/cil/oc/api/network/Environment;
/*    */     //   325: astore #23
/*    */     //   327: aload #23
/*    */     //   329: instanceof li/cil/oc/api/internal/Database
/*    */     //   332: ifeq -> 401
/*    */     //   335: aload #23
/*    */     //   337: astore #24
/*    */     //   339: aload #24
/*    */     //   341: checkcast li/cil/oc/api/internal/Database
/*    */     //   344: iload #18
/*    */     //   346: iconst_1
/*    */     //   347: isub
/*    */     //   348: invokeinterface getStackInSlot : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   353: astore #26
/*    */     //   355: aload #26
/*    */     //   357: ifnull -> 366
/*    */     //   360: iload #19
/*    */     //   362: iconst_1
/*    */     //   363: if_icmpge -> 370
/*    */     //   366: aconst_null
/*    */     //   367: goto -> 390
/*    */     //   370: aload #26
/*    */     //   372: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*    */     //   375: iload #19
/*    */     //   377: aload #26
/*    */     //   379: invokevirtual func_77976_d : ()I
/*    */     //   382: invokevirtual min : (II)I
/*    */     //   385: putfield field_77994_a : I
/*    */     //   388: aload #26
/*    */     //   390: astore #25
/*    */     //   392: aload #25
/*    */     //   394: astore #22
/*    */     //   396: aload #22
/*    */     //   398: goto -> 432
/*    */     //   401: new java/lang/IllegalArgumentException
/*    */     //   404: dup
/*    */     //   405: ldc 'not a database'
/*    */     //   407: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   410: athrow
/*    */     //   411: new java/lang/IllegalArgumentException
/*    */     //   414: dup
/*    */     //   415: ldc 'no such component'
/*    */     //   417: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   420: athrow
/*    */     //   421: new scala/MatchError
/*    */     //   424: dup
/*    */     //   425: aload #12
/*    */     //   427: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   430: athrow
/*    */     //   431: aconst_null
/*    */     //   432: astore #10
/*    */     //   434: aload #8
/*    */     //   436: iload #9
/*    */     //   438: aload #10
/*    */     //   440: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*    */     //   445: aload_1
/*    */     //   446: ldc2_w 0.5
/*    */     //   449: invokeinterface pause : (D)Z
/*    */     //   454: pop
/*    */     //   455: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   458: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   461: iconst_1
/*    */     //   462: anewarray java/lang/Object
/*    */     //   465: dup
/*    */     //   466: iconst_0
/*    */     //   467: iconst_1
/*    */     //   468: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   471: aastore
/*    */     //   472: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   475: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   478: astore #7
/*    */     //   480: goto -> 512
/*    */     //   483: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   486: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   489: iconst_2
/*    */     //   490: anewarray java/lang/Object
/*    */     //   493: dup
/*    */     //   494: iconst_0
/*    */     //   495: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*    */     //   498: aastore
/*    */     //   499: dup
/*    */     //   500: iconst_1
/*    */     //   501: ldc 'no matching part'
/*    */     //   503: aastore
/*    */     //   504: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   507: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   510: astore #7
/*    */     //   512: aload #7
/*    */     //   514: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #35	-> 13
/*    */     //   #36	-> 28
/*    */     //   #35	-> 46
/*    */     //   #36	-> 48
/*    */     //   #37	-> 54
/*    */     //   #38	-> 68
/*    */     //   #39	-> 98
/*    */     //   #41	-> 108
/*    */     //   #42	-> 156
/*    */     //   #41	-> 191
/*    */     //   #40	-> 198
/*    */     //   #41	-> 249
/*    */     //   #40	-> 251
/*    */     //   #44	-> 283
/*    */     //   #45	-> 303
/*    */     //   #46	-> 327
/*    */     //   #47	-> 339
/*    */     //   #48	-> 355
/*    */     //   #50	-> 370
/*    */     //   #51	-> 388
/*    */     //   #46	-> 390
/*    */     //   #45	-> 392
/*    */     //   #44	-> 396
/*    */     //   #53	-> 401
/*    */     //   #55	-> 411
/*    */     //   #41	-> 421
/*    */     //   #58	-> 431
/*    */     //   #39	-> 432
/*    */     //   #59	-> 434
/*    */     //   #60	-> 445
/*    */     //   #61	-> 455
/*    */     //   #36	-> 478
/*    */     //   #62	-> 483
/*    */     //   #35	-> 512
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	515	0	$this	Lli/cil/oc/integration/appeng/PartEnvironmentBase;
/*    */     //   0	515	1	context	Lli/cil/oc/api/machine/Context;
/*    */     //   0	515	2	args	Lli/cil/oc/api/machine/Arguments;
/*    */     //   0	515	3	evidence$2	Lscala/reflect/ClassTag;
/*    */     //   13	501	4	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   68	410	8	config	Lnet/minecraft/inventory/IInventory;
/*    */     //   98	380	9	slot	I
/*    */     //   208	307	13	address	Ljava/lang/String;
/*    */     //   218	297	14	entry	I
/*    */     //   228	287	15	size	I
/*    */     //   263	135	17	address	Ljava/lang/String;
/*    */     //   273	125	18	entry	I
/*    */     //   283	115	19	size	I
/*    */     //   355	160	26	dbStack	Lnet/minecraft/item/ItemStack;
/*    */     //   434	44	10	stack	Lnet/minecraft/item/ItemStack;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\PartEnvironmentBase$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */