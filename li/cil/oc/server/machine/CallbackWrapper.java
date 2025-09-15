/*    */ package li.cil.oc.server.machine;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import org.objectweb.asm.ClassWriter;
/*    */ import scala.Function2;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.runtime.AbstractFunction0;
/*    */ import scala.runtime.AbstractFunction2;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\005u!B\001\003\021\003i\021aD\"bY2\024\027mY6Xe\006\004\b/\032:\013\005\r!\021aB7bG\"Lg.\032\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\ty1)\0317mE\006\0347n\026:baB,'o\005\002\020%A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\017qy!\031!C\007;\005iqJ\0316fGRt\025-\\3B'6+\022A\b\t\003?\021j\021\001\t\006\003C\t\nA\001\\1oO*\t1%\001\003kCZ\f\027BA\023!\005\031\031FO]5oO\"1qe\004Q\001\016y\tab\0242kK\016$h*Y7f\003Nk\005\005C\004*\037\t\007IQB\017\002!\r\013G\016\0342bG.\034\025\r\0347EKN\034\007BB\026\020A\0035a$A\tDC2d'-Y2l\007\006dG\016R3tG\002Bq!L\bC\002\0235a&A\013DC2d'-Y2l\007\006dG.\0238uKJ4\027mY3\026\003=\0022a\005\031\037\023\t\tDCA\003BeJ\f\027\020\003\0044\037\001\006iaL\001\027\007\006dGNY1dW\016\013G\016\\%oi\026\024h-Y2fA!9Qg\004b\001\n\0331\024!D'fi\"|G-\0233DC\016DW-F\0018!\021AThP#\016\003eR!AO\036\002\0175,H/\0312mK*\021A\bF\001\013G>dG.Z2uS>t\027B\001 :\005\ri\025\r\035\t\003\001\016k\021!\021\006\003\005\002\nqA]3gY\026\034G/\003\002E\003\n1Q*\032;i_\022\004\"AR%\017\005M9\025B\001%\025\003\031\001&/\0323fM&\021QE\023\006\003\021RAa\001T\b!\002\0339\024AD'fi\"|G-\0233DC\016DW\r\t\005\b\035>\021\r\021\"\004P\003Q\031\025\r\0347cC\016\\wK]1qa\026\0248)Y2iKV\t\001\013\005\0039{}\n\006C\001\bS\023\t\031&A\001\007DC2d'-Y2l\007\006dG\016\003\004V\037\001\006i\001U\001\026\007\006dGNY1dW^\023\030\r\0359fe\016\0137\r[3!\021\0259v\002\"\001Y\003U\031'/Z1uK\016\013G\016\0342bG.<&/\0319qKJ$\"!U-\t\013i3\006\031A \002\r5,G\017[8e\021\025av\002\"\003^\0035\031'/Z1uK^\023\030\r\0359feR!!C\0301d\021\025y6\f1\001@\003\005i\007\"B1\\\001\004\021\027AC5oi\026\024h-Y2fgB\0311\003M#\t\013\021\\\006\031A3\002\021\025l\027\016^\"pI\026\004Ra\0054@QJL!a\032\013\003\023\031+hn\031;j_:\024\004CA5q\033\005Q'BA6m\003\r\t7/\034\006\003[:\f\021b\0342kK\016$x/\0322\013\003=\f1a\034:h\023\t\t(NA\006DY\006\0348o\026:ji\026\024\bCA\nt\023\t!HC\001\003V]&$\b\"\002<\020\t\0239\030aD3nSR\034uN\\:ueV\034Go\034:\025\005ID\b\"B=v\001\004A\027AA2x\021\025Yx\002\"\003}\003A)W.\033;DC2d'-Y2l\007\006dG\016F\002s{zDQa\030>A\002}BQ!\037>A\002!Dq!!\001\020\t\023\t\031!\001\006hK:,'/\031;f\023\022$2!RA\003\021\025yv\0201\001@\017\035\tIa\004E\005\003\027\tAcR3oKJ\fG/\0323DY\006\0348\017T8bI\026\024\b\003BA\007\003\037i\021a\004\004\b\003#y\001\022BA\n\005Q9UM\\3sCR,Gm\0217bgNdu.\0313feN!\021qBA\013!\ry\022qC\005\004\0033\001#aC\"mCN\034Hj\\1eKJDq!GA\b\t\003\ti\002\006\002\002\f!Q\021\021EA\b\005\004%I!a\t\002!\035+g.\032:bi\026$7\t\\1tg\026\034XCAA\023!\025AT(RA\024a\021\tI#a\r\021\013}\tY#a\f\n\007\0055\002EA\003DY\006\0348\017\005\003\0022\005MB\002\001\003\r\003k\t9$!A\001\002\013\005\0211\b\002\004?\022\n\004\"CA\035\003\037\001\013\021BA\023\003E9UM\\3sCR,Gm\0217bgN,7\017I\t\005\003{\t\031\005E\002\024\003I1!!\021\025\005\035qu\016\0365j]\036\0042aEA#\023\r\t9\005\006\002\004\003:L\b\002CA&\003\037!\t!!\024\002\033\r|g\016^1j]N\034E.Y:t)\021\ty%!\026\021\007M\t\t&C\002\002TQ\021qAQ8pY\026\fg\016C\004\002X\005%\003\031A#\002\t9\fW.\032\005\t\0037\ny\001\"\001\002^\005A\021\r\0323DY\006\0348\017F\003s\003?\n\t\007C\004\002X\005e\003\031A#\t\021\005\r\024\021\fa\001\003K\nQAY=uKN\004Ba\005\031\002hA\0311#!\033\n\007\005-DC\001\003CsR,\007\002CA8\003\037!\t%!\035\002\023\031Lg\016Z\"mCN\034H\003BA:\003\002D!!\036\002|A)a)a\036\002z%\031\021Q\006&\021\t\005E\0221\020\003\r\003{\ni'!A\001\002\013\005\0211\b\002\004?\022\022\004bBA,\003[\002\r!\022")
/*    */ public final class CallbackWrapper {
/*    */   public static CallbackCall createCallbackWrapper(Method paramMethod) {
/*    */     return CallbackWrapper$.MODULE$.createCallbackWrapper(paramMethod);
/*    */   }
/*    */   
/*    */   public final class CallbackWrapper$$anonfun$createCallbackWrapper$1 extends AbstractFunction0<CallbackCall> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Method method$1;
/*    */     
/*    */     public CallbackWrapper$$anonfun$createCallbackWrapper$1(Method method$1) {}
/*    */     
/* 26 */     public final CallbackCall apply() { return (CallbackCall)CallbackWrapper$.MODULE$.li$cil$oc$server$machine$CallbackWrapper$$createWrapper(this.method$1, CallbackWrapper$.MODULE$.li$cil$oc$server$machine$CallbackWrapper$$CallbackCallInterface(), (Function2<Method, ClassWriter, BoxedUnit>)new CallbackWrapper$$anonfun$createCallbackWrapper$1$$anonfun$apply$1(this)); } public final class CallbackWrapper$$anonfun$createCallbackWrapper$1$$anonfun$apply$1 extends AbstractFunction2<Method, ClassWriter, BoxedUnit> implements Serializable { public final void apply(Method m, ClassWriter cw) { CallbackWrapper$.MODULE$.li$cil$oc$server$machine$CallbackWrapper$$emitCallbackCall(m, cw); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       public CallbackWrapper$$anonfun$createCallbackWrapper$1$$anonfun$apply$1(CallbackWrapper$$anonfun$createCallbackWrapper$1 $outer) {} }
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class CallbackWrapper$$anonfun$generateId$1
/*    */     extends AbstractFunction0<String>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     private final Method m$1;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public CallbackWrapper$$anonfun$generateId$1(Method m$1) {}
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final String apply() {
/* 67 */       return (new StringBuilder()).append(this.m$1.getDeclaringClass().getName().replace('.', '_')).append("_").append(this.m$1.getName()).toString();
/*    */     } } public static class GeneratedClassLoader$ extends ClassLoader { public static final GeneratedClassLoader$ MODULE$; private final Map<String, Class<?>> GeneratedClasses; public GeneratedClassLoader$() {
/* 69 */       super(li.cil.oc.OpenComputers$.MODULE$.getClass().getClassLoader()); MODULE$ = this;
/* 70 */       this.GeneratedClasses = scala.collection.mutable.Map$.MODULE$.empty(); } private Map<String, Class<?>> GeneratedClasses() { return this.GeneratedClasses; }
/*    */      public boolean containsClass(String name) {
/* 72 */       return GeneratedClasses().contains(name);
/*    */     }
/*    */     public void addClass(String name, byte[] bytes) {
/* 75 */       GeneratedClasses().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(name), defineClass(name, bytes, 0, bytes.length)));
/*    */     }
/*    */     public Class<?> findClass(String name) {
/*    */       Class<?> clazz;
/* 79 */       Option option = GeneratedClasses().get(name);
/* 80 */       if (option instanceof Some) { Some some = (Some)option; Class clazz1 = (Class)some.x(); }
/* 81 */       else { clazz = super.findClass(name); }
/*    */       
/*    */       return clazz;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\CallbackWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */