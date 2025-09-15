/*    */ package li.cil.oc.server.machine;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import org.objectweb.asm.ClassWriter;
/*    */ import org.objectweb.asm.MethodVisitor;
/*    */ import scala.Function2;
/*    */ import scala.Serializable;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class CallbackWrapper$ {
/*    */   public static final CallbackWrapper$ MODULE$;
/*    */   private final String ObjectNameASM;
/*    */   private final String CallbackCallDesc;
/*    */   private final String[] li$cil$oc$server$machine$CallbackWrapper$$CallbackCallInterface;
/*    */   private final Map<Method, String> MethodIdCache;
/*    */   private final Map<Method, CallbackCall> CallbackWrapperCache;
/*    */   
/* 19 */   private final String ObjectNameASM() { return this.ObjectNameASM; }
/* 20 */   private final String CallbackCallDesc() { return this.CallbackCallDesc; }
/* 21 */   public final String[] li$cil$oc$server$machine$CallbackWrapper$$CallbackCallInterface() { return this.li$cil$oc$server$machine$CallbackWrapper$$CallbackCallInterface; }
/* 22 */   private final Map<Method, String> MethodIdCache() { return this.MethodIdCache; } private final Map<Method, CallbackCall> CallbackWrapperCache() {
/* 23 */     return this.CallbackWrapperCache;
/*    */   }
/*    */   
/* 26 */   public synchronized CallbackCall createCallbackWrapper(Method method) { return (CallbackCall)CallbackWrapperCache().getOrElseUpdate(method, (Function0)new CallbackWrapper$$anonfun$createCallbackWrapper$1(method)); } public final class CallbackWrapper$$anonfun$createCallbackWrapper$1 extends AbstractFunction0<CallbackCall> implements Serializable { public static final long serialVersionUID = 0L; private final Method method$1; public final CallbackCall apply() { return (CallbackCall)CallbackWrapper$.MODULE$.li$cil$oc$server$machine$CallbackWrapper$$createWrapper(this.method$1, CallbackWrapper$.MODULE$.li$cil$oc$server$machine$CallbackWrapper$$CallbackCallInterface(), (Function2<Method, ClassWriter, BoxedUnit>)new CallbackWrapper$$anonfun$createCallbackWrapper$1$$anonfun$apply$1(this)); } public CallbackWrapper$$anonfun$createCallbackWrapper$1(Method method$1) {} public final class CallbackWrapper$$anonfun$createCallbackWrapper$1$$anonfun$apply$1 extends AbstractFunction2<Method, ClassWriter, BoxedUnit> implements Serializable { public final void apply(Method m, ClassWriter cw) { CallbackWrapper$.MODULE$.li$cil$oc$server$machine$CallbackWrapper$$emitCallbackCall(m, cw); }
/*    */        public static final long serialVersionUID = 0L;
/*    */       public CallbackWrapper$$anonfun$createCallbackWrapper$1$$anonfun$apply$1(CallbackWrapper$$anonfun$createCallbackWrapper$1 $outer) {} } }
/*    */   public Object li$cil$oc$server$machine$CallbackWrapper$$createWrapper(Method m, String[] interfaces, Function2 emitCode) {
/* 30 */     String className = (new StringBuilder()).append("generated.li.cil.oc.CallWrapper_").append(generateId(m)).toString();
/* 31 */     if (!CallbackWrapper.GeneratedClassLoader$.MODULE$.containsClass(className)) {
/* 32 */       ClassWriter cw = new ClassWriter(3);
/* 33 */       cw.visit(50, 33, className.replace('.', '/'), null, ObjectNameASM(), interfaces);
/* 34 */       emitConstructor(cw);
/* 35 */       emitCode.apply(m, cw);
/* 36 */       cw.visitEnd();
/* 37 */       CallbackWrapper.GeneratedClassLoader$.MODULE$.addClass(className, cw.toByteArray());
/*    */     } 
/*    */     
/* 40 */     return CallbackWrapper.GeneratedClassLoader$.MODULE$.findClass(className).newInstance();
/*    */   }
/*    */   
/*    */   private void emitConstructor(ClassWriter cw) {
/* 44 */     MethodVisitor mv = cw.visitMethod(1, "<init>", "()V", null, null);
/* 45 */     mv.visitCode();
/* 46 */     mv.visitVarInsn(25, 0);
/* 47 */     mv.visitMethodInsn(183, ObjectNameASM(), "<init>", "()V", false);
/* 48 */     mv.visitInsn(177);
/* 49 */     mv.visitMaxs(1, 1);
/* 50 */     mv.visitEnd();
/*    */   }
/*    */   
/*    */   public void li$cil$oc$server$machine$CallbackWrapper$$emitCallbackCall(Method m, ClassWriter cw) {
/* 54 */     String className = m.getDeclaringClass().getName().replace('.', '/');
/* 55 */     MethodVisitor mv = cw.visitMethod(1, "call", CallbackCallDesc(), null, null);
/* 56 */     mv.visitCode();
/* 57 */     mv.visitVarInsn(25, 1);
/* 58 */     mv.visitTypeInsn(192, className);
/* 59 */     mv.visitVarInsn(25, 2);
/* 60 */     mv.visitVarInsn(25, 3);
/* 61 */     mv.visitMethodInsn(182, className, m.getName(), Type.getMethodDescriptor(m), false);
/* 62 */     mv.visitInsn(176);
/* 63 */     mv.visitMaxs(3, 3);
/* 64 */     mv.visitEnd();
/*    */   }
/*    */   
/* 67 */   private String generateId(Method m) { return (String)MethodIdCache().getOrElseUpdate(m, (Function0)new CallbackWrapper$$anonfun$generateId$1(m)); } public final class CallbackWrapper$$anonfun$generateId$1 extends AbstractFunction0<String> implements Serializable { public static final long serialVersionUID = 0L; private final Method m$1; public final String apply() { return (new StringBuilder()).append(this.m$1.getDeclaringClass().getName().replace('.', '_')).append("_").append(this.m$1.getName()).toString(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public CallbackWrapper$$anonfun$generateId$1(Method m$1) {} }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private CallbackWrapper$() {
/* 86 */     MODULE$ = this;
/*    */     this.ObjectNameASM = Object.class.getName().replace('.', '/');
/*    */     this.CallbackCallDesc = Type.getMethodDescriptor(CallbackCall.class.getMethod("call", new Class[] { Object.class, Context.class, Arguments.class }));
/*    */     (new String[1])[0] = CallbackCall.class.getName().replace('.', '/');
/*    */     this.li$cil$oc$server$machine$CallbackWrapper$$CallbackCallInterface = new String[1];
/*    */     this.MethodIdCache = scala.collection.mutable.Map$.MODULE$.empty();
/*    */     this.CallbackWrapperCache = scala.collection.mutable.Map$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\CallbackWrapper$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */