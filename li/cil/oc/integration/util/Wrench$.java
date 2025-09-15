/*    */ package li.cil.oc.integration.util;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class Wrench$ {
/*    */   public static final Wrench$ MODULE$;
/*    */   private final LinkedHashSet<Method> usages;
/*    */   private final LinkedHashSet<Method> checks;
/*    */   
/* 13 */   private LinkedHashSet<Method> usages() { return this.usages; } private LinkedHashSet<Method> checks() {
/* 14 */     return this.checks;
/*    */   } public void addUsage(Method wrench) {
/* 16 */     usages().$plus$eq(wrench);
/*    */   } public void addCheck(Method checker) {
/* 18 */     checks().$plus$eq(checker);
/*    */   }
/* 20 */   public boolean isWrench(ItemStack stack) { return (stack != null && checks().exists((Function1)new Wrench$$anonfun$isWrench$1(stack))); } public final class Wrench$$anonfun$isWrench$1 extends AbstractFunction1<Method, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final boolean apply(Method x$1) { return BoxesRunTime.unboxToBoolean(li.cil.oc.common.IMC$.MODULE$.tryInvokeStatic(x$1, (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.stack$1 }, ), BoxesRunTime.boxToBoolean(false))); }
/*    */     
/*    */     public Wrench$$anonfun$isWrench$1(ItemStack stack$1) {} }
/* 23 */   public boolean holdsApplicableWrench(EntityPlayer player, BlockPosition position) { return (player.func_70694_bm() != null && usages().exists((Function1)new Wrench$$anonfun$holdsApplicableWrench$1(player, position))); } public final class Wrench$$anonfun$holdsApplicableWrench$1 extends AbstractFunction1<Method, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Method x$2) { return BoxesRunTime.unboxToBoolean(li.cil.oc.common.IMC$.MODULE$.tryInvokeStatic(x$2, (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.player$1, BoxesRunTime.boxToInteger(this.position$1.x()), BoxesRunTime.boxToInteger(this.position$1.y()), BoxesRunTime.boxToInteger(this.position$1.z()), BoxesRunTime.boxToBoolean(false) }, ), BoxesRunTime.boxToBoolean(false))); }
/*    */      private final EntityPlayer player$1; private final BlockPosition position$1; public Wrench$$anonfun$holdsApplicableWrench$1(EntityPlayer player$1, BlockPosition position$1) {} }
/*    */   public void wrenchUsed(EntityPlayer player, BlockPosition position) {
/* 26 */     if (player.func_70694_bm() != null) usages().foreach((Function1)new Wrench$$anonfun$wrenchUsed$1(player, position));  } public final class Wrench$$anonfun$wrenchUsed$1 extends AbstractFunction1<Method, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$2; private final BlockPosition position$2; public final void apply(Method x$3) { li.cil.oc.common.IMC$.MODULE$.tryInvokeStaticVoid(x$3, (Seq)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.player$2, BoxesRunTime.boxToInteger(this.position$2.x()), BoxesRunTime.boxToInteger(this.position$2.y()), BoxesRunTime.boxToInteger(this.position$2.z()), BoxesRunTime.boxToBoolean(true) })); } public Wrench$$anonfun$wrenchUsed$1(EntityPlayer player$2, BlockPosition position$2) {} } private Wrench$() {
/* 27 */     MODULE$ = this;
/*    */     this.usages = scala.collection.mutable.LinkedHashSet$.MODULE$.empty();
/*    */     this.checks = scala.collection.mutable.LinkedHashSet$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\Wrench$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */