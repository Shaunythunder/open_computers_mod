/*    */ package li.cil.oc.integration.util;
/*    */ import java.lang.reflect.Method;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Tuple2;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ItemCharge$ {
/*    */   public static final ItemCharge$ MODULE$;
/*    */   
/*    */   private LinkedHashSet<Tuple2<Method, Method>> chargers() {
/* 11 */     return this.chargers;
/*    */   } private final LinkedHashSet<Tuple2<Method, Method>> chargers; public void add(Method canCharge, Method charge) {
/* 13 */     chargers().$plus$eq(new Tuple2(canCharge, charge));
/*    */   }
/* 15 */   public boolean canCharge(ItemStack stack) { return (stack != null && chargers().exists((Function1)new ItemCharge$$anonfun$canCharge$1(stack))); } public final class ItemCharge$$anonfun$canCharge$1 extends AbstractFunction1<Tuple2<Method, Method>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2; public final boolean apply(Tuple2 charger) { return BoxesRunTime.unboxToBoolean(li.cil.oc.common.IMC$.MODULE$.tryInvokeStatic((Method)charger._1(), (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$2 }, ), BoxesRunTime.boxToBoolean(false))); }
/*    */      public ItemCharge$$anonfun$canCharge$1(ItemStack stack$2) {} }
/*    */   public double charge(ItemStack stack, double amount) { double d;
/* 18 */     Option option = chargers().find((Function1)new ItemCharge$$anonfun$1(stack));
/* 19 */     if (option instanceof Some) { Some some = (Some)option; Tuple2 charger = (Tuple2)some.x(); d = BoxesRunTime.unboxToDouble(li.cil.oc.common.IMC$.MODULE$.tryInvokeStatic((Method)charger._2(), (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { stack, BoxesRunTime.boxToDouble(amount), Boolean.FALSE }, ), BoxesRunTime.boxToDouble(0.0D))); }
/* 20 */     else { d = 0.0D; }
/*    */     
/* 22 */     return (stack == null) ? 0.0D : d; }
/*    */    private ItemCharge$() {
/* 24 */     MODULE$ = this;
/*    */     this.chargers = scala.collection.mutable.LinkedHashSet$.MODULE$.empty();
/*    */   }
/*    */   
/*    */   public final class ItemCharge$$anonfun$1 extends AbstractFunction1<Tuple2<Method, Method>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final ItemStack stack$1;
/*    */     
/*    */     public final boolean apply(Tuple2 charger) {
/*    */       return BoxesRunTime.unboxToBoolean(li.cil.oc.common.IMC$.MODULE$.tryInvokeStatic((Method)charger._1(), (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToBoolean(false)));
/*    */     }
/*    */     
/*    */     public ItemCharge$$anonfun$1(ItemStack stack$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\ItemCharge$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */