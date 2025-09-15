/*    */ package li.cil.oc.util;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001A;Q!\001\002\t\002-\tq\001V8pYRL\007O\003\002\004\t\005!Q\017^5m\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7\001\001\t\003\0315i\021A\001\004\006\035\tA\ta\004\002\b)>|G\016^5q'\ti\001\003\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"C\001\004B]f\024VM\032\005\006/5!\t\001G\001\007y%t\027\016\036 \025\003-AqAG\007C\002\023%1$\001\005nCb<\026\016\032;i+\005a\002CA\t\036\023\tq\"CA\002J]RDa\001I\007!\002\023a\022!C7bq^KG\r\0365!\021\025\021S\002\"\003$\003\0211wN\034;\026\003\021\002\"!\n\030\016\003\031R!a\n\025\002\007\035,\030N\003\002*U\00511\r\\5f]RT!a\013\027\002\0235Lg.Z2sC\032$(\"A\027\002\0079,G/\003\0020M\taai\0348u%\026tG-\032:fe\")\021'\004C\001e\005\031q-\032;\025\007M\n5\tE\0025qij\021!\016\006\003\007YR\021aN\001\005U\0064\030-\003\002:k\t!A*[:u!\tYdH\004\002\022y%\021QHE\001\007!J,G-\0324\n\005}\002%AB*ue&twM\003\002>%!)!\t\ra\001u\005!a.Y7f\021\025!\005\0071\001F\003\021\t'oZ:\021\007E1\005*\003\002H%\tQAH]3qK\006$X\r\032 \021\005EI\025B\001&\023\005\r\te.\037\005\006\0316!\t!T\001\tKb$XM\0343fIR\0311GT(\t\013\t[\005\031\001\036\t\013\021[\005\031A#")
/*    */ public final class Tooltip {
/*    */   public static List<String> extended(String paramString, Seq<Object> paramSeq) {
/*    */     return Tooltip$.MODULE$.extended(paramString, paramSeq);
/*    */   }
/*    */   
/*    */   public static List<String> get(String paramString, Seq<Object> paramSeq) {
/*    */     return Tooltip$.MODULE$.get(paramString, paramSeq);
/*    */   }
/*    */   
/*    */   public final class Tooltip$$anonfun$1 extends AbstractFunction1<Object, String> implements Serializable {
/*    */     public final String apply(Object x$1) {
/* 19 */       return x$1.toString();
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */   }
/*    */   
/*    */   public final class Tooltip$$anonfun$get$1 extends AbstractFunction1<String, Buffer<String>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Buffer<String> apply(String x$2) {
/* 29 */       return (Buffer<String>)WrapAsScala$.MODULE$.asScalaBuffer(Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$font().func_78271_c(x$2, Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$maxWidth())).map((Function1)new Tooltip$$anonfun$get$1$$anonfun$apply$1(this), Buffer$.MODULE$.canBuildFrom()); } public final class Tooltip$$anonfun$get$1$$anonfun$apply$1 extends AbstractFunction1<Object, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Object x$3) { return (new StringBuilder()).append(((String)x$3).trim()).append(" ").toString(); }
/*    */ 
/*    */       
/*    */       public Tooltip$$anonfun$get$1$$anonfun$apply$1(Tooltip$$anonfun$get$1 $outer) {} } }
/*    */   
/*    */   public final class Tooltip$$anonfun$extended$1 extends AbstractFunction1<Object, String> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final String apply(Object x$4) {
/* 37 */       return x$4.toString();
/*    */     } } public final class Tooltip$$anonfun$extended$2 extends AbstractFunction1<String, Buffer<String>> implements Serializable { public static final long serialVersionUID = 0L;
/* 39 */     public final Buffer<String> apply(String x$5) { return (Buffer<String>)WrapAsScala$.MODULE$.asScalaBuffer(Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$font().func_78271_c(x$5, Tooltip$.MODULE$.li$cil$oc$util$Tooltip$$maxWidth())).map((Function1)new Tooltip$$anonfun$extended$2$$anonfun$apply$2(this), Buffer$.MODULE$.canBuildFrom()); } public final class Tooltip$$anonfun$extended$2$$anonfun$apply$2 extends AbstractFunction1<Object, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Object x$6) { return (new StringBuilder()).append(((String)x$6).trim()).append(" ").toString(); }
/*    */ 
/*    */       
/*    */       public Tooltip$$anonfun$extended$2$$anonfun$apply$2(Tooltip$$anonfun$extended$2 $outer) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Tooltip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */