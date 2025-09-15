/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import net.minecraftforge.fluids.FluidStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class TankControl$class {
/*    */   @Callback(doc = "function():number -- The number of tanks installed in the device.")
/*    */   public static Object[] tankCount(TankControl $this, Context context, Arguments args) {
/* 11 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger($this.tank().tankCount()) }));
/*    */   } public static void $init$(TankControl $this) {}
/*    */   @Callback(doc = "function([index:number]):number -- Select a tank and/or get the number of the currently selected tank.")
/*    */   public static Object[] selectTank(TankControl $this, Context context, Arguments args) {
/* 15 */     if (args.count() > 0 && args.checkAny(0) != null) {
/* 16 */       $this.selectedTank_$eq(ExtendedArguments$.MODULE$.extendedArguments(args).checkTank($this.tank(), 0));
/*    */     }
/* 18 */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger($this.selectedTank() + 1) }));
/*    */   }
/*    */   @Callback(direct = true, doc = "function([index:number]):number -- Get the fluid amount in the specified or selected tank.")
/*    */   public static Object[] tankLevel(TankControl $this, Context context, Arguments args) {
/*    */     Integer integer;
/* 23 */     int index = 
/* 24 */       (args.count() > 0 && args.checkAny(0) != null) ? ExtendedArguments$.MODULE$.extendedArguments(args).checkTank($this.tank(), 0) : 
/* 25 */       $this.selectedTank();
/* 26 */     Option<FluidStack> option = $this.fluidInTank(index);
/* 27 */     if (option instanceof Some) { Some some = (Some)option; FluidStack fluid = (FluidStack)some.x(); integer = BoxesRunTime.boxToInteger(fluid.amount); }
/* 28 */     else { integer = BoxesRunTime.boxToInteger(0); }
/*    */     
/*    */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { integer }));
/*    */   } @Callback(direct = true, doc = "function([index:number]):number -- Get the remaining fluid capacity in the specified or selected tank.")
/*    */   public static Object[] tankSpace(TankControl $this, Context context, Arguments args) {
/*    */     Integer integer;
/* 34 */     int index = 
/* 35 */       (args.count() > 0 && args.checkAny(0) != null) ? ExtendedArguments$.MODULE$.extendedArguments(args).checkTank($this.tank(), 0) : 
/* 36 */       $this.selectedTank();
/* 37 */     Option<IFluidTank> option = $this.getTank(index);
/* 38 */     if (option instanceof Some) { Some some = (Some)option; IFluidTank tank = (IFluidTank)some.x(); integer = BoxesRunTime.boxToInteger(tank.getCapacity() - tank.getFluidAmount()); }
/* 39 */     else { integer = BoxesRunTime.boxToInteger(0); }
/*    */     
/*    */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { integer }));
/*    */   }
/*    */   @Callback(doc = "function(index:number):boolean -- Compares the fluids in the selected and the specified tank. Returns true if equal.")
/*    */   public static Object[] compareFluidTo(TankControl $this, Context context, Arguments args) {
/* 45 */     int index = ExtendedArguments$.MODULE$.extendedArguments(args).checkTank($this.tank(), 0);
/* 46 */     Tuple2 tuple2 = new Tuple2($this.fluidInTank($this.selectedTank()), $this.fluidInTank(index)); if (tuple2 != null) {
/* 47 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; FluidStack stackA = (FluidStack)some.x(); if (option2 instanceof Some) { Some some1 = (Some)option2; FluidStack stackB = (FluidStack)some1.x(); Boolean bool1 = BoxesRunTime.boxToBoolean($this.haveSameFluidType(stackA, stackB)); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool1 })); }  } 
/* 48 */     }  if (tuple2 != null) { Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (None$.MODULE$.equals(option1) && None$.MODULE$.equals(option2)) { Boolean bool1 = BoxesRunTime.boxToBoolean(true); return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool1 })); }  }
/* 49 */      Boolean bool = BoxesRunTime.boxToBoolean(false);
/*    */     return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool }));
/*    */   }
/*    */   
/*    */   @Callback(doc = "function(index:number[, count:number=1000]):boolean -- Move the specified amount of fluid from the selected tank into the specified tank.")
/*    */   public static Object[] transferFluidTo(TankControl $this, Context context, Arguments args) {
/*    */     // Byte code:
/*    */     //   0: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*    */     //   3: aload_2
/*    */     //   4: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   7: aload_0
/*    */     //   8: invokeinterface tank : ()Lli/cil/oc/api/internal/MultiTank;
/*    */     //   13: iconst_0
/*    */     //   14: invokevirtual checkTank : (Lli/cil/oc/api/internal/MultiTank;I)I
/*    */     //   17: istore_3
/*    */     //   18: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*    */     //   21: aload_2
/*    */     //   22: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   25: astore #5
/*    */     //   27: iconst_1
/*    */     //   28: istore #6
/*    */     //   30: aload #5
/*    */     //   32: invokevirtual optFluidCount$default$2 : ()I
/*    */     //   35: istore #7
/*    */     //   37: aload #5
/*    */     //   39: iload #6
/*    */     //   41: iload #7
/*    */     //   43: invokevirtual optFluidCount : (II)I
/*    */     //   46: istore #4
/*    */     //   48: iload_3
/*    */     //   49: aload_0
/*    */     //   50: invokeinterface selectedTank : ()I
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
/*    */     //   87: goto -> 447
/*    */     //   90: new scala/Tuple2
/*    */     //   93: dup
/*    */     //   94: aload_0
/*    */     //   95: aload_0
/*    */     //   96: invokeinterface selectedTank : ()I
/*    */     //   101: invokeinterface getTank : (I)Lscala/Option;
/*    */     //   106: aload_0
/*    */     //   107: iload_3
/*    */     //   108: invokeinterface getTank : (I)Lscala/Option;
/*    */     //   113: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   116: astore #8
/*    */     //   118: aload #8
/*    */     //   120: ifnull -> 416
/*    */     //   123: aload #8
/*    */     //   125: invokevirtual _1 : ()Ljava/lang/Object;
/*    */     //   128: checkcast scala/Option
/*    */     //   131: astore #9
/*    */     //   133: aload #8
/*    */     //   135: invokevirtual _2 : ()Ljava/lang/Object;
/*    */     //   138: checkcast scala/Option
/*    */     //   141: astore #10
/*    */     //   143: aload #9
/*    */     //   145: instanceof scala/Some
/*    */     //   148: ifeq -> 416
/*    */     //   151: aload #9
/*    */     //   153: checkcast scala/Some
/*    */     //   156: astore #11
/*    */     //   158: aload #11
/*    */     //   160: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   163: checkcast net/minecraftforge/fluids/IFluidTank
/*    */     //   166: astore #12
/*    */     //   168: aload #10
/*    */     //   170: instanceof scala/Some
/*    */     //   173: ifeq -> 416
/*    */     //   176: aload #10
/*    */     //   178: checkcast scala/Some
/*    */     //   181: astore #13
/*    */     //   183: aload #13
/*    */     //   185: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   188: checkcast net/minecraftforge/fluids/IFluidTank
/*    */     //   191: astore #14
/*    */     //   193: aload #12
/*    */     //   195: iload #4
/*    */     //   197: iconst_0
/*    */     //   198: invokeinterface drain : (IZ)Lnet/minecraftforge/fluids/FluidStack;
/*    */     //   203: astore #16
/*    */     //   205: aload #14
/*    */     //   207: aload #16
/*    */     //   209: iconst_1
/*    */     //   210: invokeinterface fill : (Lnet/minecraftforge/fluids/FluidStack;Z)I
/*    */     //   215: istore #17
/*    */     //   217: iload #17
/*    */     //   219: iconst_0
/*    */     //   220: if_icmple -> 260
/*    */     //   223: aload #12
/*    */     //   225: iload #17
/*    */     //   227: iconst_1
/*    */     //   228: invokeinterface drain : (IZ)Lnet/minecraftforge/fluids/FluidStack;
/*    */     //   233: pop
/*    */     //   234: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   237: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   240: iconst_1
/*    */     //   241: anewarray java/lang/Object
/*    */     //   244: dup
/*    */     //   245: iconst_0
/*    */     //   246: iconst_1
/*    */     //   247: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   250: aastore
/*    */     //   251: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   254: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   257: goto -> 411
/*    */     //   260: iload #4
/*    */     //   262: aload #12
/*    */     //   264: invokeinterface getFluidAmount : ()I
/*    */     //   269: if_icmplt -> 384
/*    */     //   272: aload #14
/*    */     //   274: invokeinterface getCapacity : ()I
/*    */     //   279: aload #12
/*    */     //   281: invokeinterface getFluidAmount : ()I
/*    */     //   286: if_icmplt -> 384
/*    */     //   289: aload #12
/*    */     //   291: invokeinterface getCapacity : ()I
/*    */     //   296: aload #14
/*    */     //   298: invokeinterface getFluidAmount : ()I
/*    */     //   303: if_icmplt -> 384
/*    */     //   306: aload #14
/*    */     //   308: aload #14
/*    */     //   310: invokeinterface getFluidAmount : ()I
/*    */     //   315: iconst_1
/*    */     //   316: invokeinterface drain : (IZ)Lnet/minecraftforge/fluids/FluidStack;
/*    */     //   321: astore #18
/*    */     //   323: aload #14
/*    */     //   325: aload #12
/*    */     //   327: aload #12
/*    */     //   329: invokeinterface getFluidAmount : ()I
/*    */     //   334: iconst_1
/*    */     //   335: invokeinterface drain : (IZ)Lnet/minecraftforge/fluids/FluidStack;
/*    */     //   340: iconst_1
/*    */     //   341: invokeinterface fill : (Lnet/minecraftforge/fluids/FluidStack;Z)I
/*    */     //   346: pop
/*    */     //   347: aload #12
/*    */     //   349: aload #18
/*    */     //   351: iconst_1
/*    */     //   352: invokeinterface fill : (Lnet/minecraftforge/fluids/FluidStack;Z)I
/*    */     //   357: pop
/*    */     //   358: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   361: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   364: iconst_1
/*    */     //   365: anewarray java/lang/Object
/*    */     //   368: dup
/*    */     //   369: iconst_0
/*    */     //   370: iconst_1
/*    */     //   371: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   374: aastore
/*    */     //   375: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   378: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   381: goto -> 411
/*    */     //   384: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   387: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   390: iconst_2
/*    */     //   391: anewarray java/lang/Object
/*    */     //   394: dup
/*    */     //   395: iconst_0
/*    */     //   396: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*    */     //   399: aastore
/*    */     //   400: dup
/*    */     //   401: iconst_1
/*    */     //   402: ldc 'incompatible or no fluid'
/*    */     //   404: aastore
/*    */     //   405: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   408: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   411: astore #15
/*    */     //   413: goto -> 445
/*    */     //   416: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   419: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   422: iconst_2
/*    */     //   423: anewarray java/lang/Object
/*    */     //   426: dup
/*    */     //   427: iconst_0
/*    */     //   428: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*    */     //   431: aastore
/*    */     //   432: dup
/*    */     //   433: iconst_1
/*    */     //   434: ldc 'invalid index'
/*    */     //   436: aastore
/*    */     //   437: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   440: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   443: astore #15
/*    */     //   445: aload #15
/*    */     //   447: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #55	-> 0
/*    */     //   #56	-> 18
/*    */     //   #57	-> 48
/*    */     //   #58	-> 64
/*    */     //   #60	-> 90
/*    */     //   #61	-> 123
/*    */     //   #62	-> 193
/*    */     //   #63	-> 205
/*    */     //   #64	-> 217
/*    */     //   #65	-> 223
/*    */     //   #66	-> 234
/*    */     //   #68	-> 260
/*    */     //   #70	-> 306
/*    */     //   #71	-> 323
/*    */     //   #72	-> 347
/*    */     //   #73	-> 358
/*    */     //   #75	-> 384
/*    */     //   #61	-> 411
/*    */     //   #76	-> 416
/*    */     //   #60	-> 445
/*    */     //   #54	-> 447
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	448	0	$this	Lli/cil/oc/server/component/traits/TankControl;
/*    */     //   0	448	1	context	Lli/cil/oc/api/machine/Context;
/*    */     //   0	448	2	args	Lli/cil/oc/api/machine/Arguments;
/*    */     //   18	430	3	index	I
/*    */     //   27	19	5	qual$1	Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   30	16	6	x$1	I
/*    */     //   37	9	7	x$2	I
/*    */     //   48	400	4	count	I
/*    */     //   168	280	12	from	Lnet/minecraftforge/fluids/IFluidTank;
/*    */     //   193	255	14	to	Lnet/minecraftforge/fluids/IFluidTank;
/*    */     //   205	243	16	drained	Lnet/minecraftforge/fluids/FluidStack;
/*    */     //   217	231	17	transferred	I
/*    */     //   323	58	18	tmp	Lnet/minecraftforge/fluids/FluidStack;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\TankControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */