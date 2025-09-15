/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.collection.immutable.StringOps;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class RobotData$
/*    */ {
/*    */   public static final RobotData$ MODULE$;
/*    */   private final String[] names;
/*    */   
/*    */   public String[] names() {
/* 18 */     return this.names; } private final String[] liftedTree1$1() { try {  } finally { Exception exception = null; }
/*    */      }
/*    */    public final class RobotData$$anonfun$liftedTree1$1$1 extends AbstractFunction1<String, String> implements Serializable { public static final long serialVersionUID = 0L;
/* 21 */     public final String apply(String x$1) { return ((String)(new StringOps(scala.Predef$.MODULE$.augmentString(x$1))).takeWhile((Function1)new RobotData$$anonfun$liftedTree1$1$1$$anonfun$apply$1(this))).trim(); } public final class RobotData$$anonfun$liftedTree1$1$1$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public RobotData$$anonfun$liftedTree1$1$1$$anonfun$apply$1(RobotData$$anonfun$liftedTree1$1$1 $outer) {} public final boolean apply(char x$2) { return (x$2 != '#'); } } } public final class RobotData$$anonfun$liftedTree1$1$2 extends AbstractFunction1<String, Object> implements Serializable { public final boolean apply(String x$3) { String str = ""; if (x$3 == null) { if (str != null); } else if (x$3.equals(str))
/*    */       {  }
/*    */        }
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L; }
/*    */   
/*    */   public String randomName() {
/* 29 */     return ((names()).length > 0) ? names()[(int)(scala.math.package$.MODULE$.random() * (names()).length)] : "Robot";
/*    */   }
/*    */   private RobotData$() {
/* 32 */     MODULE$ = this;
/*    */     this.names = liftedTree1$1();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\RobotData$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */