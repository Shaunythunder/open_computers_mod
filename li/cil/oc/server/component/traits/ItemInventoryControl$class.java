/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import li.cil.oc.util.ResultWrapper$;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class ItemInventoryControl$class {
/*    */   @Callback(doc = "function(slot:number):number -- The size of an item inventory in the specified slot.")
/*    */   public static Object[] getItemInventorySize(ItemInventoryControl $this, Context context, Arguments args) {
/* 17 */     return withItemInventory($this, ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0), (Function1)new ItemInventoryControl$$anonfun$getItemInventorySize$1($this));
/*    */   }
/*    */   public static void $init$(ItemInventoryControl $this) {}
/*    */   @Callback(doc = "function(inventorySlot:number, slot:number[, count:number=64]):number -- Drops an item into the specified slot in the item inventory.")
/*    */   public static Object[] dropIntoItemInventory(ItemInventoryControl $this, Context context, Arguments args) {
/* 22 */     return withItemInventory($this, ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0), (Function1)new ItemInventoryControl$$anonfun$dropIntoItemInventory$1($this, args));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Callback(doc = "function(inventorySlot:number, slot:number[, count:number=64]):number -- Sucks an item out of the specified slot in the item inventory.")
/*    */   public static Object[] suckFromItemInventory(ItemInventoryControl $this, Context context, Arguments args) {
/* 31 */     return withItemInventory($this, ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0), (Function1)new ItemInventoryControl$$anonfun$suckFromItemInventory$1($this, args));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static Object[] withItemInventory(ItemInventoryControl $this, int slot, Function1 f) {
/*    */     Object[] arrayOfObject;
/* 39 */     ItemStack itemStack = $this.inventory().func_70301_a(slot);
/* 40 */     if (itemStack != null) { Object[] arrayOfObject1; ItemStack itemStack1 = itemStack; IInventory iInventory = Driver.inventoryFor(itemStack1, $this.fakePlayer());
/* 41 */       if (iInventory != null) { IInventory iInventory1 = iInventory; arrayOfObject1 = (Object[])f.apply(iInventory1); }
/* 42 */       else { arrayOfObject1 = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(0), "no item inventory" })); }
/*    */        arrayOfObject = arrayOfObject1; }
/* 44 */     else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(0), "no item inventory" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\ItemInventoryControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */