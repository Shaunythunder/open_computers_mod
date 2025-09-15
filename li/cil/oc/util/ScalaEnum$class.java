/*    */ package li.cil.oc.util;
/*    */ import java.util.concurrent.atomic.AtomicReference;
/*    */ import scala.Function1;
/*    */ import scala.collection.GenTraversable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.immutable.Nil$;
/*    */ import scala.collection.immutable.Vector;
/*    */ import scala.collection.immutable.Vector$;
/*    */ import scala.package$;
/*    */ 
/*    */ public abstract class ScalaEnum$class {
/*    */   public static void $init$(ScalaEnum $this) {
/* 13 */     $this.li$cil$oc$util$ScalaEnum$_setter_$li$cil$oc$util$ScalaEnum$$_values_$eq(new AtomicReference<>(package$.MODULE$.Vector().apply((Seq)Nil$.MODULE$)));
/*    */   }
/*    */   
/*    */   public static final int li$cil$oc$util$ScalaEnum$$addEnumVal(ScalaEnum $this, ScalaEnum.Value newVal) {
/*    */     while (true) {
/* 18 */       Vector<ScalaEnum.Value> oldVec = $this.li$cil$oc$util$ScalaEnum$$_values().get();
/* 19 */       Vector<ScalaEnum.Value> newVec = (Vector)oldVec.$colon$plus(newVal, Vector$.MODULE$.canBuildFrom());
/* 20 */       if ($this.li$cil$oc$util$ScalaEnum$$_values().get() == oldVec && $this.li$cil$oc$util$ScalaEnum$$_values().compareAndSet(oldVec, newVec)) {
/* 21 */         return newVec.indexWhere((Function1)new ScalaEnum$$anonfun$li$cil$oc$util$ScalaEnum$$addEnumVal$1($this, newVal));
/*    */       }
/* 23 */       newVal = newVal; $this = $this;
/*    */     } 
/*    */   } public static Vector values(ScalaEnum $this) {
/* 26 */     return $this.li$cil$oc$util$ScalaEnum$$_values().get();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ScalaEnum$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */