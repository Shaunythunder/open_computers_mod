/*     */ package li.cil.oc.server.component.traits;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.server.component.package$;
/*     */ import li.cil.oc.util.InventoryUtils$;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.fluids.FluidStack;
/*     */ import net.minecraftforge.fluids.IFluidTank;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Unit$;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class TankInventoryControl$class {
/*     */   @Callback(doc = "function([slot:number]):number -- Get the amount of fluid in the tank item in the specified slot or the selected slot.")
/*     */   public static Object[] getTankLevelInSlot(TankInventoryControl $this, Context context, Arguments args) {
/*  18 */     return withFluidInfo($this, $this.optSlot(args, 0), (Function2)new TankInventoryControl$$anonfun$getTankLevelInSlot$1($this));
/*     */   } public static void $init$(TankInventoryControl $this) {}
/*     */   @Callback(doc = "function([slot:number]):number -- Get the capacity of the tank item in the specified slot of the robot or the selected slot.")
/*     */   public static Object[] getTankCapacityInSlot(TankInventoryControl $this, Context context, Arguments args) {
/*  22 */     return withFluidInfo($this, $this.optSlot(args, 0), (Function2)new TankInventoryControl$$anonfun$getTankCapacityInSlot$1($this));
/*     */   } @Callback(doc = "function([slot:number]):table -- Get a description of the fluid in the tank item in the specified slot or the selected slot.")
/*     */   public static Object[] getFluidInTankInSlot(TankInventoryControl $this, Context context, Arguments args) {
/*  25 */     return Settings$.MODULE$.get().allowItemStackInspection() ? 
/*  26 */       withFluidInfo($this, $this.optSlot(args, 0), (Function2)new TankInventoryControl$$anonfun$getFluidInTankInSlot$1($this)) : 
/*     */       
/*  28 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*     */   } @Callback(doc = "function([tank:number]):table -- Get a description of the fluid in the tank in the specified slot or the selected slot.")
/*     */   public static Object[] getFluidInInternalTank(TankInventoryControl $this, Context context, Arguments args) {
/*  31 */     return Settings$.MODULE$.get().allowItemStackInspection() ? 
/*  32 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Option$.MODULE$.apply($this.tank().getFluidTank($this.optTank(args, 0))).map((Function1)new TankInventoryControl$$anonfun$getFluidInInternalTank$1($this)).orNull(Predef$.MODULE$.$conforms())
/*     */           
/*  34 */           })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*     */   } @Callback(doc = "function([amount:number]):boolean -- Transfers fluid from a tank in the selected inventory slot to the selected tank.")
/*     */   public static Object[] drain(TankInventoryControl $this, Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  38 */     ExtendedArguments.ExtendedArguments qual$1 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$5 = 0, x$6 = qual$1.optFluidCount$default$2(), amount = qual$1.optFluidCount(x$5, x$6);
/*  39 */     Option option = Option$.MODULE$.apply($this.tank().getFluidTank($this.selectedTank()));
/*  40 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidTank into = (IFluidTank)some.x(); ItemStack itemStack = $this.inventory().func_70301_a($this.selectedSlot());
/*  41 */       if (itemStack != null) { Object[] arrayOfObject2; ItemStack itemStack1 = itemStack;
/*     */         
/*  43 */         FluidStack contents = FluidContainerRegistry.getFluidForFilledItem(itemStack1);
/*  44 */         ItemStack container = itemStack1.func_77973_b().getContainerItem(itemStack1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  52 */         into.fill(contents, true);
/*  53 */         $this.inventory().func_70298_a($this.selectedSlot(), 1);
/*  54 */         ItemStack x$7 = container; IInventory x$8 = $this.inventory(); Option x$9 = Option$.MODULE$.apply($this.insertionSlots()), x$10 = InventoryUtils$.MODULE$.insertIntoInventory$default$3(); int x$11 = InventoryUtils$.MODULE$.insertIntoInventory$default$4(); boolean x$12 = InventoryUtils$.MODULE$.insertIntoInventory$default$5(); InventoryUtils$.MODULE$.insertIntoInventory(x$7, x$8, x$10, x$11, x$12, x$9);
/*  55 */         (container.field_77994_a > 0) ? 
/*  56 */           InventoryUtils$.MODULE$.spawnStackInWorld($this.position(), container, InventoryUtils$.MODULE$.spawnStackInWorld$default$3(), InventoryUtils$.MODULE$.spawnStackInWorld$default$4()) : BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  61 */         Item item = itemStack1.func_77973_b();
/*  62 */         if (item instanceof IFluidContainerItem) { Item item1 = item;
/*  63 */           FluidStack drained = ((IFluidContainerItem)item1).drain(itemStack1, amount, false);
/*  64 */           int transferred = into.fill(drained, true);
/*     */           
/*  66 */           ((IFluidContainerItem)item1).drain(itemStack1, transferred, true);
/*  67 */           arrayOfObject2 = (transferred > 0) ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), BoxesRunTime.boxToInteger(transferred)
/*     */                 
/*  69 */                 })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "incompatible or no fluid" })); }
/*  70 */         else { arrayOfObject2 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "item is empty or not a fluid container" })); }
/*     */          arrayOfObject1 = FluidContainerRegistry.isFilledContainer(itemStack1) ? ((into.getCapacity() - into.getFluidAmount() < contents.amount) ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "tank is full" })) : ((into.fill(contents, false) < contents.amount) ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "incompatible fluid" })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), BoxesRunTime.boxToInteger(contents.amount) })))) : arrayOfObject2; }
/*  72 */       else { arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "nothing selected" })); }
/*     */        arrayOfObject = arrayOfObject1; }
/*  74 */     else { arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank" })); }
/*     */     
/*     */     return arrayOfObject;
/*     */   } @Callback(doc = "function([amount:number]):boolean -- Transfers fluid from the selected tank to a tank in the selected inventory slot.")
/*     */   public static Object[] fill(TankInventoryControl $this, Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  80 */     ExtendedArguments.ExtendedArguments qual$2 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$13 = 0, x$14 = qual$2.optFluidCount$default$2(), amount = qual$2.optFluidCount(x$13, x$14);
/*  81 */     Option option = Option$.MODULE$.apply($this.tank().getFluidTank($this.selectedTank()));
/*  82 */     if (option instanceof Some) { Object[] arrayOfObject1; Some some = (Some)option; IFluidTank from = (IFluidTank)some.x(); ItemStack itemStack = $this.inventory().func_70301_a($this.selectedSlot());
/*  83 */       if (itemStack != null) { Object[] arrayOfObject2; ItemStack itemStack1 = itemStack;
/*     */         
/*  85 */         FluidStack drained = from.drain(amount, false);
/*  86 */         ItemStack filled = FluidContainerRegistry.fillFluidContainer(drained, itemStack1);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  91 */         int i = (FluidContainerRegistry.getFluidForFilledItem(filled)).amount;
/*  92 */         from.drain(i, true);
/*  93 */         $this.inventory().func_70298_a($this.selectedSlot(), 1);
/*  94 */         ItemStack x$15 = filled; IInventory x$16 = $this.inventory(); Option x$17 = Option$.MODULE$.apply($this.insertionSlots()), x$18 = InventoryUtils$.MODULE$.insertIntoInventory$default$3(); int x$19 = InventoryUtils$.MODULE$.insertIntoInventory$default$4(); boolean x$20 = InventoryUtils$.MODULE$.insertIntoInventory$default$5(); InventoryUtils$.MODULE$.insertIntoInventory(x$15, x$16, x$18, x$19, x$20, x$17);
/*  95 */         (filled.field_77994_a > 0) ? 
/*  96 */           InventoryUtils$.MODULE$.spawnStackInWorld($this.position(), filled, InventoryUtils$.MODULE$.spawnStackInWorld$default$3(), InventoryUtils$.MODULE$.spawnStackInWorld$default$4()) : BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 101 */         Item item = itemStack1.func_77973_b();
/* 102 */         if (item instanceof IFluidContainerItem) { Item item1 = item;
/* 103 */           FluidStack fluidStack = from.drain(amount, false);
/* 104 */           int transferred = ((IFluidContainerItem)item1).fill(itemStack1, fluidStack, true);
/*     */           
/* 106 */           from.drain(transferred, true);
/* 107 */           arrayOfObject2 = (transferred > 0) ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), BoxesRunTime.boxToInteger(transferred)
/*     */                 
/* 109 */                 })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "incompatible or no fluid" })); }
/* 110 */         else { arrayOfObject2 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "item is full or not a fluid container" })); }
/*     */          arrayOfObject1 = FluidContainerRegistry.isEmptyContainer(itemStack1) ? ((filled == null) ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "tank is empty" })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), BoxesRunTime.boxToInteger(i) }))) : arrayOfObject2; }
/* 112 */       else { arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "nothing selected" })); }
/*     */        arrayOfObject = arrayOfObject1; }
/* 114 */     else { arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no tank" })); }
/*     */     
/*     */     return arrayOfObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Option fluidInfo$1(TankInventoryControl $this, ItemStack stack) {
/*     */     None$ none$;
/* 126 */     Item item = stack.func_77973_b();
/* 127 */     if (item instanceof IFluidContainerItem) { Item item1 = item; Option option = Option$.MODULE$.apply(new Tuple2(((IFluidContainerItem)item1).getFluid(stack), BoxesRunTime.boxToInteger(((IFluidContainerItem)item1).getCapacity(stack)))); }
/* 128 */     else { none$ = None$.MODULE$; }
/*     */     
/*     */     return FluidContainerRegistry.isFilledContainer(stack) ? Option$.MODULE$.apply(new Tuple2(FluidContainerRegistry.getFluidForFilledItem(stack), BoxesRunTime.boxToInteger(FluidContainerRegistry.getContainerCapacity(stack)))) : (FluidContainerRegistry.isEmptyContainer(stack) ? Option$.MODULE$.apply(new Tuple2(new FluidStack(0, 0), BoxesRunTime.boxToInteger(FluidContainerRegistry.getContainerCapacity(stack)))) : (Option)none$);
/*     */   }
/*     */   
/*     */   private static Object[] withFluidInfo(TankInventoryControl $this, int slot, Function2 f) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokeinterface inventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   6: iload_1
/*     */     //   7: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   12: astore_3
/*     */     //   13: aload_3
/*     */     //   14: ifnull -> 133
/*     */     //   17: aload_3
/*     */     //   18: astore #4
/*     */     //   20: aload_0
/*     */     //   21: aload #4
/*     */     //   23: invokestatic fluidInfo$1 : (Lli/cil/oc/server/component/traits/TankInventoryControl;Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   26: astore #6
/*     */     //   28: aload #6
/*     */     //   30: instanceof scala/Some
/*     */     //   33: ifeq -> 96
/*     */     //   36: aload #6
/*     */     //   38: checkcast scala/Some
/*     */     //   41: astore #7
/*     */     //   43: aload #7
/*     */     //   45: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   48: checkcast scala/Tuple2
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: ifnull -> 96
/*     */     //   58: aload #8
/*     */     //   60: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   63: checkcast net/minecraftforge/fluids/FluidStack
/*     */     //   66: astore #9
/*     */     //   68: aload #8
/*     */     //   70: invokevirtual _2$mcI$sp : ()I
/*     */     //   73: istore #10
/*     */     //   75: aload_2
/*     */     //   76: aload #9
/*     */     //   78: iload #10
/*     */     //   80: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   83: invokeinterface apply : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   88: checkcast [Ljava/lang/Object;
/*     */     //   91: astore #11
/*     */     //   93: goto -> 126
/*     */     //   96: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   99: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   102: iconst_2
/*     */     //   103: anewarray java/lang/Object
/*     */     //   106: dup
/*     */     //   107: iconst_0
/*     */     //   108: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */     //   111: aastore
/*     */     //   112: dup
/*     */     //   113: iconst_1
/*     */     //   114: ldc_w 'item is not a fluid container'
/*     */     //   117: aastore
/*     */     //   118: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   121: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   124: astore #11
/*     */     //   126: aload #11
/*     */     //   128: astore #5
/*     */     //   130: aload #5
/*     */     //   132: areturn
/*     */     //   133: new scala/MatchError
/*     */     //   136: dup
/*     */     //   137: aload_3
/*     */     //   138: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   141: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #131	-> 0
/*     */     //   #132	-> 13
/*     */     //   #133	-> 28
/*     */     //   #134	-> 96
/*     */     //   #132	-> 126
/*     */     //   #131	-> 130
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	142	0	$this	Lli/cil/oc/server/component/traits/TankInventoryControl;
/*     */     //   0	142	1	slot	I
/*     */     //   0	142	2	f	Lscala/Function2;
/*     */     //   68	74	9	fluid	Lnet/minecraftforge/fluids/FluidStack;
/*     */     //   75	67	10	capacity	I
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\TankInventoryControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */