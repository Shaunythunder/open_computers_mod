/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import scala.Option;
/*    */ import scala.Option$;
/*    */ import scala.Predef$;
/*    */ import scala.collection.GenTraversableOnce;
/*    */ import scala.collection.immutable.IndexedSeq;
/*    */ import scala.collection.immutable.IndexedSeq$;
/*    */ import scala.runtime.RichInt$;
/*    */ 
/*    */ public abstract class InventoryAware$class {
/*    */   public static void $init$(InventoryAware $this) {}
/*    */   
/*    */   public static IndexedSeq insertionSlots(InventoryAware $this) {
/* 17 */     return (IndexedSeq)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper($this.selectedSlot()), $this.inventory().func_70302_i_()).$plus$plus((GenTraversableOnce)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), $this.selectedSlot()), IndexedSeq$.MODULE$.canBuildFrom());
/*    */   }
/*    */ 
/*    */   
/*    */   public static int optSlot(InventoryAware $this, Arguments args, int n) {
/* 22 */     return (args.count() > 0 && args.checkAny(0) != null) ? ExtendedArguments$.MODULE$.extendedArguments(args).checkSlot($this.inventory(), 0) : 
/* 23 */       $this.selectedSlot();
/*    */   } public static Option stackInSlot(InventoryAware $this, int slot) {
/* 25 */     return Option$.MODULE$.apply($this.inventory().func_70301_a(slot));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryAware$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */