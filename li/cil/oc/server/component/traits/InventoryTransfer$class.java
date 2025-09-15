/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.server.component.package$;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import li.cil.oc.util.ExtendedArguments;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function0;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class InventoryTransfer$class {
/*    */   @Callback(doc = "function(sourceSide:number, sinkSide:number[, count:number[, sourceSlot:number[, sinkSlot:number]]]):number -- Transfer some items between two inventories.")
/*    */   public static Object[] transferItem(InventoryTransfer $this, Context context, Arguments args) { Object[] arrayOfObject;
/* 18 */     ForgeDirection sourceSide = $this.checkSideForAction(args, 0);
/* 19 */     BlockPosition sourcePos = $this.position().offset(sourceSide);
/* 20 */     ForgeDirection sinkSide = $this.checkSideForAction(args, 1);
/* 21 */     BlockPosition sinkPos = $this.position().offset(sinkSide);
/* 22 */     ExtendedArguments.ExtendedArguments qual$1 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$1 = 2, x$2 = qual$1.optItemCount$default$2(), count = qual$1.optItemCount(x$1, x$2);
/*    */     
/* 24 */     Option<String> option = $this.onTransferContents();
/* 25 */     if (option instanceof Some) { Some some = (Some)option; String reason = (String)some.x();
/* 26 */       arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, reason })); }
/*    */     else
/*    */     { Object[] arrayOfObject1;
/* 29 */       int sourceSlot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot((IInventory)InventoryUtils$.MODULE$.inventoryAt(sourcePos).getOrElse((Function0)new InventoryTransfer$$anonfun$1($this)), 3);
/* 30 */       int sinkSlot = ExtendedArguments$.MODULE$.extendedArguments(args).optSlot((IInventory)InventoryUtils$.MODULE$.inventoryAt(sinkPos).getOrElse((Function0)new InventoryTransfer$$anonfun$2($this)), 4, -1);
/*    */       
/* 32 */       Function0 extractor = (args.count() > 3) ? InventoryUtils$.MODULE$.getTransferBetweenInventoriesSlotsAt(sourcePos, sourceSide.getOpposite(), sourceSlot, sinkPos, Option$.MODULE$.apply(sinkSide.getOpposite()), (sinkSlot < 0) ? (Option)None$.MODULE$ : Option$.MODULE$.apply(BoxesRunTime.boxToInteger(sinkSlot)), count) : 
/*    */ 
/*    */         
/* 35 */         InventoryUtils$.MODULE$.getTransferBetweenInventoriesAt(sourcePos, sourceSide.getOpposite(), sinkPos, Option$.MODULE$.apply(sinkSide.getOpposite()), count);
/*    */       
/* 37 */       Option option1 = Option$.MODULE$.apply(extractor);
/* 38 */       if (option1 instanceof Some) { Some some = (Some)option1; Function0 ex = (Function0)some.x(); arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(ex.apply$mcI$sp()) })); }
/* 39 */       else { arrayOfObject1 = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no inventory" })); }
/*    */       
/*    */       arrayOfObject = arrayOfObject1; }
/*    */     
/*    */     return arrayOfObject; } public static void $init$(InventoryTransfer $this) {} @Callback(doc = "function(sourceSide:number, sinkSide:number[, count:number [, sourceTank:number]]):boolean, number -- Transfer some fluid between two tanks. Returns operation result and filled amount")
/*    */   public static Object[] transferFluid(InventoryTransfer $this, Context context, Arguments args) {
/*    */     Object[] arrayOfObject;
/* 46 */     ForgeDirection sourceSide = $this.checkSideForAction(args, 0);
/* 47 */     BlockPosition sourcePos = $this.position().offset(sourceSide);
/* 48 */     ForgeDirection sinkSide = $this.checkSideForAction(args, 1);
/* 49 */     BlockPosition sinkPos = $this.position().offset(sinkSide);
/* 50 */     ExtendedArguments.ExtendedArguments qual$2 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$3 = 2, x$4 = qual$2.optFluidCount$default$2(), count = qual$2.optFluidCount(x$3, x$4);
/* 51 */     int sourceTank = args.optInteger(3, -1);
/*    */     
/* 53 */     Option<String> option = $this.onTransferContents();
/* 54 */     if (option instanceof Some) { Some some = (Some)option; String reason = (String)some.x();
/* 55 */       arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, reason })); }
/*    */     else
/* 57 */     { int moved = FluidUtils$.MODULE$.transferBetweenFluidHandlersAt(sourcePos, sourceSide.getOpposite(), sinkPos, sinkSide.getOpposite(), count, sourceTank);
/* 58 */       (moved > 0) ? BoxesRunTime.boxToBoolean(context.pause((moved / Settings$.MODULE$.get().transposerFluidTransferRate()))) : BoxedUnit.UNIT;
/* 59 */       arrayOfObject = package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean((moved > 0)), BoxesRunTime.boxToInteger(moved) })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryTransfer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */