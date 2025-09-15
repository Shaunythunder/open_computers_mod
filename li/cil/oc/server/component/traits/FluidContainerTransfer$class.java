/*     */ package li.cil.oc.server.component.traits;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.util.ExtendedArguments;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Function2;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class FluidContainerTransfer$class {
/*     */   @Callback(doc = "function(tankSide:number, inventorySide:number, inventorySlot:number [, count:number [, sourceTank:number [, outputSide:number[, outputSlot:number]]]]):boolean, number -- Transfer some fluid from the tank to the container. Returns operation result and filled amount")
/*     */   public static Object[] transferFluidFromTankToContainer(FluidContainerTransfer $this, Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  18 */     ForgeDirection tankSide = $this.checkSideForAction(args, 0);
/*  19 */     BlockPosition tankPos = $this.position().offset(tankSide);
/*  20 */     ForgeDirection inventorySide = $this.checkSideForAction(args, 1);
/*  21 */     FluidContainerTransfer$$anonfun$3 fluidContainerTransfer$$anonfun$3 = new FluidContainerTransfer$$anonfun$3($this, args);
/*  22 */     ExtendedArguments.ExtendedArguments qual$1 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$1 = 3, x$2 = qual$1.optFluidCount$default$2(), count = qual$1.optFluidCount(x$1, x$2);
/*  23 */     int sourceTank = args.optInteger(4, -1);
/*  24 */     ForgeDirection outputSide = (args.count() > 5) ? $this.checkSideForAction(args, 5) : inventorySide;
/*  25 */     FluidContainerTransfer$$anonfun$4 fluidContainerTransfer$$anonfun$4 = new FluidContainerTransfer$$anonfun$4($this, args);
/*     */     
/*  27 */     Option<String> option = $this.onTransferContents();
/*  28 */     if (option instanceof Some) { Some some = (Some)option; String reason = (String)some.x();
/*  29 */       arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, reason })); }
/*     */     else
/*  31 */     { arrayOfObject = li$cil$oc$server$component$traits$FluidContainerTransfer$$withInventory($this, inventorySide, (Function1)new FluidContainerTransfer$$anonfun$transferFluidFromTankToContainer$1($this, tankSide, tankPos, inventorySide, (Function1)fluidContainerTransfer$$anonfun$3, count, sourceTank, outputSide, (Function1)fluidContainerTransfer$$anonfun$4)); }
/*     */     
/*     */     return arrayOfObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void $init$(FluidContainerTransfer $this) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(inventorySide:number, inventorySlot:number, tankSide:number [, count:number [, outputSide:number[, outputSlot:number]]]):boolean, number -- Transfer some fluid from the container to the tank. Returns operation result and filled amount")
/*     */   public static Object[] transferFluidFromContainerToTank(FluidContainerTransfer $this, Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  55 */     ForgeDirection inventorySide = $this.checkSideForAction(args, 0);
/*  56 */     FluidContainerTransfer$$anonfun$5 fluidContainerTransfer$$anonfun$5 = new FluidContainerTransfer$$anonfun$5($this, args);
/*  57 */     ForgeDirection tankSide = $this.checkSideForAction(args, 2);
/*  58 */     BlockPosition tankPos = $this.position().offset(tankSide);
/*  59 */     ExtendedArguments.ExtendedArguments qual$2 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$15 = 3, x$16 = qual$2.optFluidCount$default$2(), count = qual$2.optFluidCount(x$15, x$16);
/*  60 */     ForgeDirection outputSide = (args.count() > 4) ? $this.checkSideForAction(args, 4) : inventorySide;
/*  61 */     FluidContainerTransfer$$anonfun$6 fluidContainerTransfer$$anonfun$6 = new FluidContainerTransfer$$anonfun$6($this, args);
/*     */     
/*  63 */     Option<String> option = $this.onTransferContents();
/*  64 */     if (option instanceof Some) { Some some = (Some)option; String reason = (String)some.x();
/*  65 */       arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, reason })); }
/*     */     else
/*  67 */     { arrayOfObject = li$cil$oc$server$component$traits$FluidContainerTransfer$$withInventory($this, inventorySide, (Function1)new FluidContainerTransfer$$anonfun$transferFluidFromContainerToTank$1($this, inventorySide, (Function1)fluidContainerTransfer$$anonfun$5, tankSide, tankPos, count, outputSide, (Function1)fluidContainerTransfer$$anonfun$6)); }
/*     */     
/*     */     return arrayOfObject;
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
/*     */   @Callback(doc = "function(sourceSide:number, sourceSlot:number, sinkSide:number, sinkSlot:number[, count:number [, sourceOutputSide:number[, sinkOutputSide:number[, sourceOutputSlot:number[, sinkOutputSlot:number]]]]]):boolean, number -- Transfer some fluid from a container to another container. Returns operation result and filled amount")
/*     */   public static Object[] transferFluidBetweenContainers(FluidContainerTransfer $this, Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  91 */     ForgeDirection sourceSide = $this.checkSideForAction(args, 0);
/*  92 */     FluidContainerTransfer$$anonfun$7 fluidContainerTransfer$$anonfun$7 = new FluidContainerTransfer$$anonfun$7($this, args);
/*  93 */     ForgeDirection sinkSide = $this.checkSideForAction(args, 2);
/*  94 */     FluidContainerTransfer$$anonfun$8 fluidContainerTransfer$$anonfun$8 = new FluidContainerTransfer$$anonfun$8($this, args);
/*  95 */     ExtendedArguments.ExtendedArguments qual$3 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$17 = 4, x$18 = qual$3.optFluidCount$default$2(), count = qual$3.optFluidCount(x$17, x$18);
/*  96 */     ForgeDirection sourceOutputSide = (args.count() > 5) ? $this.checkSideForAction(args, 5) : sourceSide;
/*  97 */     ForgeDirection sinkOutputSide = (args.count() > 6) ? $this.checkSideForAction(args, 6) : sinkSide;
/*  98 */     FluidContainerTransfer$$anonfun$9 fluidContainerTransfer$$anonfun$9 = new FluidContainerTransfer$$anonfun$9($this, args);
/*  99 */     FluidContainerTransfer$$anonfun$10 fluidContainerTransfer$$anonfun$10 = new FluidContainerTransfer$$anonfun$10($this, args);
/*     */     
/* 101 */     Option<String> option = $this.onTransferContents();
/* 102 */     if (option instanceof Some) { Some some = (Some)option; String reason = (String)some.x();
/* 103 */       arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, reason })); }
/*     */     else
/* 105 */     { arrayOfObject = li$cil$oc$server$component$traits$FluidContainerTransfer$$withInventory($this, sourceSide, (Function1)new FluidContainerTransfer$$anonfun$transferFluidBetweenContainers$1($this, sourceSide, (Function1)fluidContainerTransfer$$anonfun$7, sinkSide, (Function1)fluidContainerTransfer$$anonfun$8, count, sourceOutputSide, sinkOutputSide, (Function1)fluidContainerTransfer$$anonfun$9, (Function1)fluidContainerTransfer$$anonfun$10)); }
/*     */     
/*     */     return arrayOfObject;
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
/*     */   public static boolean li$cil$oc$server$component$traits$FluidContainerTransfer$$syncResult$default$8(FluidContainerTransfer $this) {
/* 135 */     return false;
/* 136 */   } public static boolean li$cil$oc$server$component$traits$FluidContainerTransfer$$syncResult(FluidContainerTransfer $this, IInventory inventory, ForgeDirection inventorySide, int inventorySlot, IInventory output, ForgeDirection outputSide, Option outputSlot, ItemStack result, boolean simulate) { ItemStack stack = simulate ? result.func_77946_l() : result;
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
/* 152 */     Option option = outputSlot;
/* 153 */     if (None$.MODULE$.equals(option)) {
/* 154 */       boolean bool = replaceOr$1($this, 
/* 155 */           (Function0)new FluidContainerTransfer$$anonfun$li$cil$oc$server$component$traits$FluidContainerTransfer$$syncResult$1($this, inventory, inventorySlot, output, outputSide, simulate, stack), inventory, inventorySide, inventorySlot, outputSide, outputSlot, simulate, stack);
/*     */     } else {
/* 157 */       if (option instanceof Some) { Some some = (Some)option; int slot = BoxesRunTime.unboxToInt(some.x());
/* 158 */         return replaceOr$1($this, 
/* 159 */             (Function0)new FluidContainerTransfer$$anonfun$li$cil$oc$server$component$traits$FluidContainerTransfer$$syncResult$2($this, inventory, inventorySlot, output, outputSide, simulate, stack, slot), inventory, inventorySide, inventorySlot, outputSide, outputSlot, simulate, stack); }
/*     */        throw new MatchError(option);
/*     */     } 
/*     */     return SYNTHETIC_LOCAL_VARIABLE_11; } public static final boolean decrStackSizeIfInserted$1(FluidContainerTransfer $this, boolean inserted, IInventory inventory$1, int inventorySlot$1, boolean simulate$1) { (inserted && !simulate$1) ? inventory$1.func_70298_a(inventorySlot$1, 1) : BoxedUnit.UNIT;
/*     */     return inserted; }
/*     */   private static final boolean replaceOr$1(FluidContainerTransfer $this, Function0 f, IInventory inventory$1, ForgeDirection inventorySide$2, int inventorySlot$1, ForgeDirection outputSide$2, Option outputSlot$1, boolean simulate$1, ItemStack stack$1) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: aload #5
/*     */     //   3: astore #9
/*     */     //   5: dup
/*     */     //   6: ifnonnull -> 18
/*     */     //   9: pop
/*     */     //   10: aload #9
/*     */     //   12: ifnull -> 26
/*     */     //   15: goto -> 83
/*     */     //   18: aload #9
/*     */     //   20: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   23: ifeq -> 83
/*     */     //   26: aload #6
/*     */     //   28: new li/cil/oc/server/component/traits/FluidContainerTransfer$$anonfun$replaceOr$1$1
/*     */     //   31: dup
/*     */     //   32: aload_0
/*     */     //   33: iload #4
/*     */     //   35: invokespecial <init> : (Lli/cil/oc/server/component/traits/FluidContainerTransfer;I)V
/*     */     //   38: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*     */     //   41: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   44: iload #4
/*     */     //   46: if_icmpne -> 83
/*     */     //   49: aload_2
/*     */     //   50: iload #4
/*     */     //   52: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   57: getfield field_77994_a : I
/*     */     //   60: iconst_1
/*     */     //   61: if_icmpne -> 83
/*     */     //   64: iload #7
/*     */     //   66: ifne -> 79
/*     */     //   69: aload_2
/*     */     //   70: iload #4
/*     */     //   72: aload #8
/*     */     //   74: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   79: iconst_1
/*     */     //   80: goto -> 89
/*     */     //   83: aload_1
/*     */     //   84: invokeinterface apply$mcZ$sp : ()Z
/*     */     //   89: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #145	-> 0
/*     */     //   #146	-> 64
/*     */     //   #147	-> 79
/*     */     //   #149	-> 83
/*     */     //   #145	-> 89
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	90	0	$this	Lli/cil/oc/server/component/traits/FluidContainerTransfer;
/*     */     //   0	90	1	f	Lscala/Function0;
/*     */     //   0	90	2	inventory$1	Lnet/minecraft/inventory/IInventory;
/*     */     //   0	90	3	inventorySide$2	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   0	90	4	inventorySlot$1	I
/*     */     //   0	90	5	outputSide$2	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   0	90	6	outputSlot$1	Lscala/Option;
/*     */     //   0	90	7	simulate$1	Z
/*     */     //   0	90	8	stack$1	Lnet/minecraft/item/ItemStack; }
/* 165 */   public static Object[] li$cil$oc$server$component$traits$FluidContainerTransfer$$withReplayableMove(FluidContainerTransfer $this, Option handlerA, Option handlerB, Function2 moveFunc, Function4 afterMovedFunc) { int moved = BoxesRunTime.unboxToInt(handlerA.fold((Function0)new FluidContainerTransfer$$anonfun$1($this), (Function1)new FluidContainerTransfer$$anonfun$11($this, handlerB, moveFunc, afterMovedFunc)));
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
/* 176 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((moved > 0)), BoxesRunTime.boxToInteger(moved) })); }
/*     */ 
/*     */   
/*     */   public static Object[] li$cil$oc$server$component$traits$FluidContainerTransfer$$withMove(FluidContainerTransfer $this, Option handlerA, Option handlerB, Function2 moveFunc, Function2 afterMovedFunc) {
/* 180 */     int moved = BoxesRunTime.unboxToInt(handlerA.fold((Function0)new FluidContainerTransfer$$anonfun$2($this), (Function1)new FluidContainerTransfer$$anonfun$12($this, handlerB, moveFunc, afterMovedFunc)));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 189 */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((moved > 0)), BoxesRunTime.boxToInteger(moved) }));
/*     */   }
/*     */   
/*     */   public static Object[] li$cil$oc$server$component$traits$FluidContainerTransfer$$withInventory(FluidContainerTransfer $this, ForgeDirection side, Function1 f) {
/* 193 */     Option option = InventoryUtils$.MODULE$.inventoryAt($this.position().offset(side));
/* 194 */     if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x(); if (inventory.func_70300_a($this.fakePlayer()) && $this.mayInteract($this.position().offset(side), side.getOpposite())) return (Object[])f.apply(inventory);  }
/* 195 */      return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no inventory" }));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\FluidContainerTransfer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */