/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.util.ExtendedArguments;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.runtime.NonLocalReturnControl;
/*    */ 
/*    */ public abstract class InventoryWorldControlMk2$class {
/*    */   @Callback(doc = "function(facing:number, slot:number[, count:number[, fromSide:number]]):boolean -- Drops the selected item stack into the specified slot of an inventory.")
/*    */   public static Object[] dropIntoSlot(InventoryWorldControlMk2 $this, Context context, Arguments args) {
/* 16 */     Object object = new Object(); 
/* 17 */     try { ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 18 */       ExtendedArguments.ExtendedArguments qual$1 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$2 = 2, x$3 = qual$1.optItemCount$default$2(), count = qual$1.optItemCount(x$2, x$3);
/* 19 */       ForgeDirection fromSide = ExtendedArguments$.MODULE$.extendedArguments(args).optSideAny(3, facing.getOpposite());
/* 20 */       ItemStack stack = $this.inventory().func_70301_a($this.selectedSlot()); } catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object)
/* 21 */         return (Object[])nonLocalReturnControl.value();  }  return (stack != null && stack.field_77994_a > 0) ? 
/* 22 */       withInventory($this, $this.position().offset(facing), fromSide, (Function1)new InventoryWorldControlMk2$$anonfun$dropIntoSlot$1($this, count, fromSide, stack, object, context, args)) : 
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
/* 42 */       package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) }));
/*    */   }
/*    */   public static void $init$(InventoryWorldControlMk2 $this) {}
/*    */   @Callback(doc = "function(facing:number, slot:number[, count:number[, fromSide:number]]):boolean -- Sucks items from the specified slot of an inventory.")
/*    */   public static Object[] suckFromSlot(InventoryWorldControlMk2 $this, Context context, Arguments args) {
/* 47 */     ForgeDirection facing = $this.checkSideForAction(args, 0);
/* 48 */     ExtendedArguments.ExtendedArguments qual$2 = ExtendedArguments$.MODULE$.extendedArguments(args); int x$4 = 2, x$5 = qual$2.optItemCount$default$2(), count = qual$2.optItemCount(x$4, x$5);
/* 49 */     ForgeDirection fromSide = ExtendedArguments$.MODULE$.extendedArguments(args).optSideAny(3, facing.getOpposite());
/* 50 */     return withInventory($this, $this.position().offset(facing), fromSide, (Function1)new InventoryWorldControlMk2$$anonfun$suckFromSlot$1($this, count, fromSide, context, args));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static Object[] withInventory(InventoryWorldControlMk2 $this, BlockPosition blockPos, ForgeDirection fromSide, Function1 f) {
/* 62 */     Option option = InventoryUtils$.MODULE$.inventoryAt(blockPos);
/* 63 */     if (option instanceof Some) { Some some = (Some)option; IInventory inventory = (IInventory)some.x(); if (inventory.func_70300_a($this.fakePlayer()) && $this.mayInteract(blockPos, fromSide)) return (Object[])f.apply(inventory);  }
/* 64 */      return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no inventory" }));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryWorldControlMk2$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */