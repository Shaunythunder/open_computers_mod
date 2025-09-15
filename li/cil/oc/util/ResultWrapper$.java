/*    */ package li.cil.oc.util;
/*    */ 
/*    */ 
/*    */ public final class ResultWrapper$ {
/*    */   public static final ResultWrapper$ MODULE$;
/*    */   
/*  7 */   public final Object li$cil$oc$util$ResultWrapper$$unwrap$1(Object arg) { Object object2, object1 = arg;
/*  8 */     if (object1 instanceof ScalaNumber) { ScalaNumber scalaNumber = (ScalaNumber)object1; object2 = scalaNumber.underlying(); }
/*  9 */     else { object2 = object1; }
/*    */     
/* 11 */     return object2; } public Object[] result(Seq args) { return (Object[])scala.Array$.MODULE$.apply((Seq)args.map((Function1)new ResultWrapper$$anonfun$result$1(), scala.collection.Seq$.MODULE$.canBuildFrom()), scala.reflect.ClassTag$.MODULE$.AnyRef()); } public final class ResultWrapper$$anonfun$result$1 extends AbstractFunction1<Object, Object> implements Serializable { public final Object apply(Object arg) { return ResultWrapper$.MODULE$.li$cil$oc$util$ResultWrapper$$unwrap$1(arg); }
/*    */      public static final long serialVersionUID = 0L; } private ResultWrapper$() {
/* 13 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ResultWrapper$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */