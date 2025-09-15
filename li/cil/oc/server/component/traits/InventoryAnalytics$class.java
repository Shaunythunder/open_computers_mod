/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Callback;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.server.component.package$;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public abstract class InventoryAnalytics$class {
/*    */   @Callback(doc = "function([slot:number]):table -- Get a description of the stack in the specified slot or the selected slot.")
/*    */   public static Object[] getStackInInternalSlot(InventoryAnalytics $this, Context context, Arguments args) {
/* 16 */     int slot = $this.optSlot(args, 0);
/* 17 */     return Settings$.MODULE$.get().allowItemStackInspection() ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { $this.inventory().func_70301_a(slot)
/*    */           
/* 19 */           })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "not enabled in config" }));
/*    */   } public static void $init$(InventoryAnalytics $this) {}
/*    */   @Callback(doc = "function(otherSlot:number):boolean -- Get whether the stack in the selected slot is equivalent to the item in the specified slot (have shared OreDictionary IDs).")
/*    */   public static Object[] isEquivalentTo(InventoryAnalytics $this, Context context, Arguments args) {
/* 23 */     int slot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0);
/* 24 */     Tuple2 tuple2 = new Tuple2($this.stackInSlot($this.selectedSlot()), $this.stackInSlot(slot)); if (tuple2 != null) {
/* 25 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; ItemStack stackA = (ItemStack)some.x(); if (option2 instanceof Some) { Some some1 = (Some)option2; ItemStack stackB = (ItemStack)some1.x(); Boolean bool1 = BoxesRunTime.boxToBoolean(Predef$.MODULE$.intArrayOps((int[])Predef$.MODULE$.intArrayOps(OreDictionary.getOreIDs(stackA)).intersect((GenSeq)Predef$.MODULE$.wrapIntArray(OreDictionary.getOreIDs(stackB)))).nonEmpty()); return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool1 })); }  } 
/* 26 */     }  if (tuple2 != null) { Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (None$.MODULE$.equals(option1) && None$.MODULE$.equals(option2)) { Boolean bool1 = BoxesRunTime.boxToBoolean(true); return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool1 })); }  }
/* 27 */      Boolean bool = BoxesRunTime.boxToBoolean(false);
/*    */     return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { bool }));
/*    */   }
/*    */   
/*    */   @Callback(doc = "function(slot:number, dbAddress:string, dbSlot:number):boolean -- Store an item stack description in the specified slot of the database with the specified address.")
/*    */   public static Object[] storeInternal(InventoryAnalytics $this, Context context, Arguments args) {
/* 33 */     int localSlot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0);
/* 34 */     String dbAddress = args.checkString(1);
/* 35 */     ItemStack localStack = $this.inventory().func_70301_a(localSlot);
/* 36 */     return DatabaseAccess$.MODULE$.withDatabase($this.node(), dbAddress, (Function1)new InventoryAnalytics$$anonfun$storeInternal$1($this, localStack, args));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Callback(doc = "function(slot:number, dbAddress:string, dbSlot:number[, checkNBT:boolean=false]):boolean -- Compare an item in the specified slot with one in the database with the specified address.")
/*    */   public static Object[] compareToDatabase(InventoryAnalytics $this, Context context, Arguments args) {
/* 46 */     int localSlot = ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0);
/* 47 */     String dbAddress = args.checkString(1);
/* 48 */     ItemStack localStack = $this.inventory().func_70301_a(localSlot);
/* 49 */     return DatabaseAccess$.MODULE$.withDatabase($this.node(), dbAddress, (Function1)new InventoryAnalytics$$anonfun$compareToDatabase$1($this, localStack, args));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryAnalytics$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */