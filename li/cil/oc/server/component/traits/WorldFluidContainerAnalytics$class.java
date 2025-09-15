/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.server.component.package$;
/*    */ import net.minecraft.item.Item;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import net.minecraftforge.fluids.FluidContainerRegistry;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ public abstract class WorldFluidContainerAnalytics$class {
/*    */   @Callback(doc = "function(side:number, slot:number):number -- Get the capacity of the fluid container in the specified slot of the inventory on the specified side of the device.")
/*    */   public static Object[] getContainerCapacityInSlot(WorldFluidContainerAnalytics $this, Context context, Arguments args) {
/* 17 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 18 */     return Settings$.MODULE$.get().allowItemStackInspection() ? withInventory($this, facing, (Function1)new WorldFluidContainerAnalytics$$anonfun$getContainerCapacityInSlot$1($this, args)) : 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 23 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*    */   } public static void $init$(WorldFluidContainerAnalytics $this) {}
/*    */   @Callback(doc = "function(side:number, slot:number):number -- Get the capacity the fluid container in the specified slot of the inventory on the specified side of the device.")
/*    */   public static Object[] getContainerLevelInSlot(WorldFluidContainerAnalytics $this, Context context, Arguments args) {
/* 27 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 28 */     return Settings$.MODULE$.get().allowItemStackInspection() ? withInventory($this, facing, (Function1)new WorldFluidContainerAnalytics$$anonfun$getContainerLevelInSlot$1($this, args)) : 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 33 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*    */   }
/*    */   @Callback(doc = "function(side:number, slot:number):table -- Get a description of the fluid in the fluid container in the specified slot of the inventory on the specified side of the device.")
/*    */   public static Object[] getFluidInContainerInSlot(WorldFluidContainerAnalytics $this, Context context, Arguments args) {
/* 37 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 38 */     return Settings$.MODULE$.get().allowItemStackInspection() ? withInventory($this, facing, (Function1)new WorldFluidContainerAnalytics$$anonfun$getFluidInContainerInSlot$1($this, args)) : 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 43 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Object[] li$cil$oc$server$component$traits$WorldFluidContainerAnalytics$$withFluidInfo(WorldFluidContainerAnalytics $this, ItemStack stack, Function2 f) {
/*    */     None$ none$;
/* 52 */     Item item = stack.func_77973_b();
/* 53 */     if (item instanceof IFluidContainerItem) { Item item1 = item; Option option = Option$.MODULE$.apply(new Tuple2(((IFluidContainerItem)item1).getFluid(stack), BoxesRunTime.boxToInteger(((IFluidContainerItem)item1).getCapacity(stack)))); }
/* 54 */     else { none$ = None$.MODULE$; }
/*    */      Option fluidInfo = FluidContainerRegistry.isFilledContainer(stack) ? Option$.MODULE$.apply(new Tuple2(FluidContainerRegistry.getFluidForFilledItem(stack), BoxesRunTime.boxToInteger(FluidContainerRegistry.getContainerCapacity(stack)))) : (FluidContainerRegistry.isEmptyContainer(stack) ? Option$.MODULE$.apply(new Tuple2(null, BoxesRunTime.boxToInteger(FluidContainerRegistry.getContainerCapacity(stack)))) : (Option)none$);
/* 56 */     Option option1 = fluidInfo;
/* 57 */     if (option1 instanceof Some) { Some some = (Some)option1; Tuple2 tuple2 = (Tuple2)some.x(); if (tuple2 != null) { FluidStack fluid = (FluidStack)tuple2._1(); int capacity = tuple2._2$mcI$sp(); return (Object[])f.apply(fluid, BoxesRunTime.boxToInteger(capacity)); }  }
/* 58 */      return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "item is not a fluid container" }));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static Object[] withInventory(WorldFluidContainerAnalytics $this, ForgeDirection side, Function1 f) {
/* 64 */     Option option = InventoryUtils$.MODULE$.inventoryAt($this.position().offset(side));
/* 65 */     if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x(); if (inventory.func_70300_a($this.fakePlayer()) && $this.mayInteract($this.position().offset(side), side.getOpposite())) return (Object[])f.apply(inventory);  }
/* 66 */      return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no inventory" }));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldFluidContainerAnalytics$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */