/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.Tuple2;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class InventoryControl$class {
/*    */   @Callback(doc = "function():number -- The size of this device's internal inventory.")
/*    */   public static Object[] inventorySize(InventoryControl $this, Context context, Arguments args) {
/* 12 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger($this.inventory().func_70302_i_()) }));
/*    */   } public static void $init$(InventoryControl $this) {}
/*    */   @Callback(doc = "function([slot:number]):number -- Get the currently selected slot; set the selected slot if specified.")
/*    */   public static Object[] select(InventoryControl $this, Context context, Arguments args) {
/* 16 */     int slot = $this.optSlot(args, 0);
/* 17 */     if (slot != $this.selectedSlot()) {
/* 18 */       $this.selectedSlot_$eq(slot);
/*    */     }
/* 20 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger($this.selectedSlot() + 1) }));
/*    */   }
/*    */   @Callback(direct = true, doc = "function([slot:number]):number -- Get the number of items in the specified slot, otherwise in the selected slot.")
/*    */   public static Object[] count(InventoryControl $this, Context context, Arguments args) {
/*    */     Integer integer;
/* 25 */     int slot = $this.optSlot(args, 0);
/* 26 */     Option<ItemStack> option = $this.stackInSlot(slot);
/* 27 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); integer = BoxesRunTime.boxToInteger(stack.field_77994_a); }
/* 28 */     else { integer = BoxesRunTime.boxToInteger(0); }
/*    */     
/*    */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { integer }));
/*    */   } @Callback(direct = true, doc = "function([slot:number]):number -- Get the remaining space in the specified slot, otherwise in the selected slot.")
/*    */   public static Object[] space(InventoryControl $this, Context context, Arguments args) {
/*    */     Integer integer;
/* 34 */     int slot = $this.optSlot(args, 0);
/* 35 */     Option<ItemStack> option = $this.stackInSlot(slot);
/* 36 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); integer = BoxesRunTime.boxToInteger(package$.MODULE$.min($this.inventory().func_70297_j_(), stack.func_77976_d()) - stack.field_77994_a); }
/* 37 */     else { integer = BoxesRunTime.boxToInteger($this.inventory().func_70297_j_()); }
/*    */     
/*    */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { integer }));
/*    */   }
/*    */   @Callback(doc = "function(otherSlot:number[, checkNBT:boolean=false]):boolean -- Compare the contents of the selected slot to the contents of the specified slot.")
/*    */   public static Object[] compareTo(InventoryControl $this, Context context, Arguments args) {
/* 43 */     int slot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0);
/* 44 */     Tuple2 tuple2 = new Tuple2($this.stackInSlot($this.selectedSlot()), $this.stackInSlot(slot)); if (tuple2 != null) {
/* 45 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; ItemStack stackA = (ItemStack)some.x(); if (option2 instanceof Some) { Some some1 = (Some)option2; ItemStack stackB = (ItemStack)some1.x(); Boolean bool1 = BoxesRunTime.boxToBoolean(InventoryUtils$.MODULE$.haveSameItemType(stackA, stackB, args.optBoolean(1, false))); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool1 })); }  } 
/* 46 */     }  if (tuple2 != null) { Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (None$.MODULE$.equals(option1) && None$.MODULE$.equals(option2)) { Boolean bool1 = BoxesRunTime.boxToBoolean(true); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool1 })); }  }
/* 47 */      Boolean bool = BoxesRunTime.boxToBoolean(false);
/*    */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool }));
/*    */   }
/*    */   
/*    */   @Callback(doc = "function(toSlot:number[, amount:number]):boolean -- Move up to the specified amount of items from the selected slot into the specified slot.")
/*    */   public static Object[] transferTo(InventoryControl $this, Context context, Arguments args) {
/*    */     // Byte code:
/*    */     //   0: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*    */     //   3: aload_2
/*    */     //   4: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   7: aload_0
/*    */     //   8: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   13: iconst_0
/*    */     //   14: invokevirtual checkSlot : (Lnet/minecraft/inventory/IInventory;I)I
/*    */     //   17: istore_3
/*    */     //   18: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*    */     //   21: aload_2
/*    */     //   22: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   25: astore #5
/*    */     //   27: iconst_1
/*    */     //   28: istore #6
/*    */     //   30: aload #5
/*    */     //   32: invokevirtual optItemCount$default$2 : ()I
/*    */     //   35: istore #7
/*    */     //   37: aload #5
/*    */     //   39: iload #6
/*    */     //   41: iload #7
/*    */     //   43: invokevirtual optItemCount : (II)I
/*    */     //   46: istore #4
/*    */     //   48: iload_3
/*    */     //   49: aload_0
/*    */     //   50: invokeinterface selectedSlot : ()I
/*    */     //   55: if_icmpeq -> 64
/*    */     //   58: iload #4
/*    */     //   60: iconst_0
/*    */     //   61: if_icmpne -> 90
/*    */     //   64: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   67: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   70: iconst_1
/*    */     //   71: anewarray java/lang/Object
/*    */     //   74: dup
/*    */     //   75: iconst_0
/*    */     //   76: iconst_1
/*    */     //   77: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   80: aastore
/*    */     //   81: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   84: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   87: goto -> 534
/*    */     //   90: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   93: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   96: iconst_1
/*    */     //   97: anewarray java/lang/Object
/*    */     //   100: dup
/*    */     //   101: iconst_0
/*    */     //   102: new scala/Tuple2
/*    */     //   105: dup
/*    */     //   106: aload_0
/*    */     //   107: aload_0
/*    */     //   108: invokeinterface selectedSlot : ()I
/*    */     //   113: invokeinterface stackInSlot : (I)Lscala/Option;
/*    */     //   118: aload_0
/*    */     //   119: iload_3
/*    */     //   120: invokeinterface stackInSlot : (I)Lscala/Option;
/*    */     //   125: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   128: astore #8
/*    */     //   130: aload #8
/*    */     //   132: ifnull -> 435
/*    */     //   135: aload #8
/*    */     //   137: invokevirtual _1 : ()Ljava/lang/Object;
/*    */     //   140: checkcast scala/Option
/*    */     //   143: astore #9
/*    */     //   145: aload #8
/*    */     //   147: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   150: checkcast scala/Option
/*    */     //   153: astore #10
/*    */     //   155: aload #9
/*    */     //   157: instanceof scala/Some
/*    */     //   160: ifeq -> 435
/*    */     //   163: aload #9
/*    */     //   165: checkcast scala/Some
/*    */     //   168: astore #11
/*    */     //   170: aload #11
/*    */     //   172: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   175: checkcast net/minecraft/item/ItemStack
/*    */     //   178: astore #12
/*    */     //   180: aload #10
/*    */     //   182: instanceof scala/Some
/*    */     //   185: ifeq -> 435
/*    */     //   188: aload #10
/*    */     //   190: checkcast scala/Some
/*    */     //   193: astore #13
/*    */     //   195: aload #13
/*    */     //   197: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   200: checkcast net/minecraft/item/ItemStack
/*    */     //   203: astore #14
/*    */     //   205: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   208: aload #12
/*    */     //   210: aload #14
/*    */     //   212: iconst_1
/*    */     //   213: invokevirtual haveSameItemType : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Z)Z
/*    */     //   216: ifeq -> 376
/*    */     //   219: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*    */     //   222: aload_0
/*    */     //   223: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   228: invokeinterface func_70297_j_ : ()I
/*    */     //   233: aload #14
/*    */     //   235: invokevirtual func_77976_d : ()I
/*    */     //   238: invokevirtual min : (II)I
/*    */     //   241: aload #14
/*    */     //   243: getfield field_77994_a : I
/*    */     //   246: isub
/*    */     //   247: istore #16
/*    */     //   249: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*    */     //   252: iload #4
/*    */     //   254: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*    */     //   257: iload #16
/*    */     //   259: aload #12
/*    */     //   261: getfield field_77994_a : I
/*    */     //   264: invokevirtual min : (II)I
/*    */     //   267: invokevirtual min : (II)I
/*    */     //   270: istore #17
/*    */     //   272: iload #17
/*    */     //   274: iconst_0
/*    */     //   275: if_icmple -> 369
/*    */     //   278: aload #12
/*    */     //   280: aload #12
/*    */     //   282: getfield field_77994_a : I
/*    */     //   285: iload #17
/*    */     //   287: isub
/*    */     //   288: putfield field_77994_a : I
/*    */     //   291: aload #14
/*    */     //   293: aload #14
/*    */     //   295: getfield field_77994_a : I
/*    */     //   298: iload #17
/*    */     //   300: iadd
/*    */     //   301: putfield field_77994_a : I
/*    */     //   304: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   307: aload #12
/*    */     //   309: getfield field_77994_a : I
/*    */     //   312: iconst_0
/*    */     //   313: if_icmplt -> 320
/*    */     //   316: iconst_1
/*    */     //   317: goto -> 321
/*    */     //   320: iconst_0
/*    */     //   321: invokevirtual assert : (Z)V
/*    */     //   324: aload #12
/*    */     //   326: getfield field_77994_a : I
/*    */     //   329: iconst_0
/*    */     //   330: if_icmpne -> 351
/*    */     //   333: aload_0
/*    */     //   334: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   339: aload_0
/*    */     //   340: invokeinterface selectedSlot : ()I
/*    */     //   345: aconst_null
/*    */     //   346: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*    */     //   351: aload_0
/*    */     //   352: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   357: invokeinterface func_70296_d : ()V
/*    */     //   362: iconst_1
/*    */     //   363: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   366: goto -> 430
/*    */     //   369: iconst_0
/*    */     //   370: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   373: goto -> 430
/*    */     //   376: iload #4
/*    */     //   378: aload #12
/*    */     //   380: getfield field_77994_a : I
/*    */     //   383: if_icmplt -> 426
/*    */     //   386: aload_0
/*    */     //   387: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   392: iload_3
/*    */     //   393: aload #12
/*    */     //   395: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*    */     //   400: aload_0
/*    */     //   401: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   406: aload_0
/*    */     //   407: invokeinterface selectedSlot : ()I
/*    */     //   412: aload #14
/*    */     //   414: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*    */     //   419: iconst_1
/*    */     //   420: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   423: goto -> 430
/*    */     //   426: iconst_0
/*    */     //   427: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   430: astore #15
/*    */     //   432: goto -> 525
/*    */     //   435: aload #8
/*    */     //   437: ifnull -> 519
/*    */     //   440: aload #8
/*    */     //   442: invokevirtual _1 : ()Ljava/lang/Object;
/*    */     //   445: checkcast scala/Option
/*    */     //   448: astore #18
/*    */     //   450: aload #8
/*    */     //   452: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   455: checkcast scala/Option
/*    */     //   458: astore #19
/*    */     //   460: aload #18
/*    */     //   462: instanceof scala/Some
/*    */     //   465: ifeq -> 519
/*    */     //   468: getstatic scala/None$.MODULE$ : Lscala/None$;
/*    */     //   471: aload #19
/*    */     //   473: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   476: ifeq -> 519
/*    */     //   479: aload_0
/*    */     //   480: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   485: iload_3
/*    */     //   486: aload_0
/*    */     //   487: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*    */     //   492: aload_0
/*    */     //   493: invokeinterface selectedSlot : ()I
/*    */     //   498: iload #4
/*    */     //   500: invokeinterface func_70298_a : (II)Lnet/minecraft/item/ItemStack;
/*    */     //   505: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*    */     //   510: iconst_1
/*    */     //   511: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   514: astore #15
/*    */     //   516: goto -> 525
/*    */     //   519: iconst_0
/*    */     //   520: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   523: astore #15
/*    */     //   525: aload #15
/*    */     //   527: aastore
/*    */     //   528: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   531: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   534: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #53	-> 0
/*    */     //   #54	-> 18
/*    */     //   #55	-> 48
/*    */     //   #56	-> 64
/*    */     //   #58	-> 90
/*    */     //   #59	-> 135
/*    */     //   #60	-> 205
/*    */     //   #61	-> 219
/*    */     //   #62	-> 249
/*    */     //   #63	-> 272
/*    */     //   #64	-> 278
/*    */     //   #65	-> 291
/*    */     //   #66	-> 304
/*    */     //   #67	-> 324
/*    */     //   #68	-> 333
/*    */     //   #70	-> 351
/*    */     //   #71	-> 362
/*    */     //   #73	-> 369
/*    */     //   #75	-> 376
/*    */     //   #76	-> 386
/*    */     //   #77	-> 400
/*    */     //   #78	-> 419
/*    */     //   #80	-> 426
/*    */     //   #60	-> 430
/*    */     //   #58	-> 435
/*    */     //   #81	-> 440
/*    */     //   #82	-> 479
/*    */     //   #83	-> 510
/*    */     //   #81	-> 514
/*    */     //   #84	-> 519
/*    */     //   #58	-> 525
/*    */     //   #52	-> 534
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	535	0	$this	Lli/cil/oc/server/component/traits/InventoryControl;
/*    */     //   0	535	1	context	Lli/cil/oc/api/machine/Context;
/*    */     //   0	535	2	args	Lli/cil/oc/api/machine/Arguments;
/*    */     //   18	517	3	slot	I
/*    */     //   27	19	5	qual$1	Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   30	16	6	x$1	I
/*    */     //   37	9	7	x$2	I
/*    */     //   48	487	4	count	I
/*    */     //   180	355	12	from	Lnet/minecraft/item/ItemStack;
/*    */     //   205	330	14	to	Lnet/minecraft/item/ItemStack;
/*    */     //   249	286	16	space	I
/*    */     //   272	263	17	amount	I
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */