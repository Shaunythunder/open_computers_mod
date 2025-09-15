/*    */ package li.cil.oc.integration.util;
/*    */ 
/*    */ import scala.Function1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class Waila$ {
/*    */   public static final Waila$ MODULE$;
/*    */   
/*  9 */   public boolean isSavingForTooltip() { return (li.cil.oc.integration.Mods$.MODULE$.Waila().isAvailable() && scala.Predef$.MODULE$.refArrayOps((Object[])(new Exception()).getStackTrace()).exists((Function1)new Waila$$anonfun$isSavingForTooltip$1())); } public final class Waila$$anonfun$isSavingForTooltip$1 extends AbstractFunction1<StackTraceElement, Object> implements Serializable { public final boolean apply(StackTraceElement x$1) { return x$1.getClassName().startsWith("mcp.mobius.waila"); } public static final long serialVersionUID = 0L; } private Waila$() {
/* 10 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\Waila$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */