/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import java.util.concurrent.atomic.AtomicReference;
/*    */ import scala.Serializable;
/*    */ import scala.collection.immutable.Vector;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.ScalaRunTime$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001i4q!\001\002\021\002\007\0051BA\005TG\006d\027-\0228v[*\0211\001B\001\005kRLGN\003\002\006\r\005\021qn\031\006\003\017!\t1aY5m\025\005I\021A\0017j\007\001\031\"\001\001\007\021\0055\001R\"\001\b\013\003=\tQa]2bY\006L!!\005\b\003\r\005s\027PU3g\021\025\031\002\001\"\001\025\003\031!\023N\\5uIQ\tQ\003\005\002\016-%\021qC\004\002\005+:LG\017B\003\032\001\t\005!DA\004F]Vlg+\0317\022\005mq\002CA\007\035\023\tibBA\004O_RD\027N\\4\021\005}\001S\"\001\001\007\021\005\002\001\023aA\tE\035\023QAV1mk\026\034\"\001\t\007\t\013M\001C\021\001\013\t\017\025\002#\031!C\003M\0059qN\0353j]\006dW#A\024\021\0055A\023BA\025\017\005\rIe\016\036\005\007W\001\002\013QB\024\002\021=\024H-\0338bY\002BQ!\f\021\007\0029\nAA\\1nKV\tq\006\005\0021g9\021Q\"M\005\003e9\ta\001\025:fI\0264\027B\001\0336\005\031\031FO]5oO*\021!G\004\005\006o\001\"\t\005O\001\ti>\034FO]5oOR\tq\006C\003;A\021\0053(\001\004fcV\fGn\035\013\003y}\002\"!D\037\n\005yr!a\002\"p_2,\027M\034\005\006\001f\002\r!Q\001\006_RDWM\035\t\003\033\tK!a\021\b\003\007\005s\027\020C\003FA\021\005c)\001\005iCND7i\0343f)\0059\003CA\020\031\021\035I\005A1A\005\n)\013qa\030<bYV,7/F\001L!\raEKV\007\002\033*\021ajT\001\007CR|W.[2\013\005A\013\026AC2p]\016,(O]3oi*\0211A\025\006\002'\006!!.\031<b\023\t)VJA\bBi>l\027n\031*fM\026\024XM\\2f!\r9FlR\007\0021*\021\021LW\001\nS6lW\017^1cY\026T!a\027\b\002\025\r|G\016\\3di&|g.\003\002^1\n1a+Z2u_JDaa\030\001!\002\023Y\025\001C0wC2,Xm\035\021\t\013\005\004AQ\0022\002\025\005$G-\0228v[Z\013G\016\006\002(G\")A\r\031a\001\017\0061a.Z<WC2D#\001\0314\021\005\035TW\"\0015\013\005%t\021AC1o]>$\030\r^5p]&\0211\016\033\002\bi\006LGN]3d\021\025i\007\001\"\001o\003\0311\030\r\\;fgV\tq\016E\002qq\036s!!\035<\017\005I,X\"A:\013\005QT\021A\002\037s_>$h(C\001\020\023\t9h\"A\004qC\016\\\027mZ3\n\005uK(BA<\017\001")
/*    */ public interface ScalaEnum {
/*    */   void li$cil$oc$util$ScalaEnum$_setter_$li$cil$oc$util$ScalaEnum$$_values_$eq(AtomicReference paramAtomicReference);
/*    */   
/*    */   AtomicReference<Vector<Value>> li$cil$oc$util$ScalaEnum$$_values();
/*    */   
/*    */   Vector<Value> values();
/*    */   
/*    */   public final class ScalaEnum$$anonfun$li$cil$oc$util$ScalaEnum$$addEnumVal$1 extends AbstractFunction1<Value, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(ScalaEnum.Value x$1) {
/* 21 */       return (x$1 == this.newVal$1);
/*    */     }
/*    */     
/*    */     private final ScalaEnum.Value newVal$1;
/*    */     
/*    */     public ScalaEnum$$anonfun$li$cil$oc$util$ScalaEnum$$addEnumVal$1(ScalaEnum $outer, ScalaEnum.Value newVal$1) {} }
/*    */   
/*    */   public abstract class Value$class {
/*    */     public static void $init$(ScalaEnum.Value $this) {
/* 30 */       $this.li$cil$oc$util$ScalaEnum$Value$_setter_$ordinal_$eq(ScalaEnum$class.li$cil$oc$util$ScalaEnum$$addEnumVal($this.li$cil$oc$util$ScalaEnum$Value$$$outer(), $this));
/*    */     }
/*    */     
/*    */     public static String toString(ScalaEnum.Value $this) {
/* 34 */       return $this.name();
/*    */     } public static boolean equals(ScalaEnum.Value $this, Object other) {
/* 36 */       return ($this == other);
/*    */     } public static int hashCode(ScalaEnum.Value $this) {
/* 38 */       return 31 * (ScalaRunTime$.MODULE$.hash($this.getClass()) + ScalaRunTime$.MODULE$.hash($this.name()) + $this.ordinal());
/*    */     }
/*    */   }
/*    */   
/*    */   public interface Value {
/*    */     void li$cil$oc$util$ScalaEnum$Value$_setter_$ordinal_$eq(int param1Int);
/*    */     
/*    */     int ordinal();
/*    */     
/*    */     String name();
/*    */     
/*    */     String toString();
/*    */     
/*    */     boolean equals(Object param1Object);
/*    */     
/*    */     int hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ScalaEnum.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */