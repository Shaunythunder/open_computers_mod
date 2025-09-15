/*     */ package li.cil.oc.server.machine;
/*     */ 
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.immutable.Set;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ import scala.runtime.VolatileByteRef;
/*     */ 
/*     */ public final class Callbacks$ {
/*     */   public static final Callbacks$ MODULE$;
/*     */   private final Map<Class<?>, Map<String, Callbacks.Callback>> cache;
/*     */   
/*  20 */   private Map<Class<?>, Map<String, Callbacks.Callback>> cache() { return this.cache; }
/*     */   public Map<String, Callbacks.Callback> apply(Object host) { Map<String, Callbacks.Callback> map;
/*  22 */     Object object = host;
/*  23 */     if (object instanceof CompoundBlockEnvironment) { map = li$cil$oc$server$machine$Callbacks$$dynamicAnalyze(host); }
/*  24 */     else if (object instanceof ManagedPeripheral) { map = li$cil$oc$server$machine$Callbacks$$dynamicAnalyze(host); }
/*  25 */     else if (object instanceof FilteredEnvironment) { map = li$cil$oc$server$machine$Callbacks$$dynamicAnalyze(host); }
/*  26 */     else { map = (Map)cache().getOrElseUpdate(host.getClass(), (Function0)new Callbacks$$anonfun$apply$2(host)); }  return map; } public final class Callbacks$$anonfun$apply$2 extends AbstractFunction0<Map<String, Callbacks.Callback>> implements Serializable { public static final long serialVersionUID = 0L; private final Object host$1; public final Map<String, Callbacks.Callback> apply() { return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$dynamicAnalyze(this.host$1); }
/*     */ 
/*     */     
/*     */     public Callbacks$$anonfun$apply$2(Object host$1) {} }
/*     */   
/*     */   public void clear() {
/*  32 */     cache().clear();
/*     */   }
/*     */   
/*  35 */   public Map<String, Callbacks.Callback> fromClass(Class<?> environment) { return li$cil$oc$server$machine$Callbacks$$staticAnalyze(environment, staticAnalyze$default$2(), staticAnalyze$default$3()); } private final Set whitelist$lzycompute$1(Buffer whitelists$1, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x1) == 0) { whitelist$lzy$1.elem = whitelists$1.reduceOption((Function2)new Callbacks$$anonfun$whitelist$lzycompute$1$1()).getOrElse((Function0)new Callbacks$$anonfun$whitelist$lzycompute$1$2()); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x1); }  return (Set)whitelist$lzy$1.elem; }  } private final Set whitelist$1(Buffer whitelists$1, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x1) == 0) ? whitelist$lzycompute$1(whitelists$1, whitelist$lzy$1, bitmap$0$1) : (Set)whitelist$lzy$1.elem; } public final class Callbacks$$anonfun$whitelist$lzycompute$1$1 extends AbstractFunction2<Set<String>, Set<String>, Set<String>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Set<String> apply(Set x$1, Set x$2) { return (Set<String>)x$1.intersect((GenSet)x$2); } } public final class Callbacks$$anonfun$whitelist$lzycompute$1$2 extends AbstractFunction0<Set<String>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Set<String> apply() { return scala.Predef$.MODULE$.Set().empty(); } } public final boolean li$cil$oc$server$machine$Callbacks$$shouldAdd$2(String name, Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) { return (!callbacks$2.contains(name) && (whitelist$1(whitelists$1, whitelist$lzy$1, bitmap$0$1).isEmpty() || whitelist$1(whitelists$1, whitelist$lzy$1, bitmap$0$1).contains(name))); } public final Tuple2 li$cil$oc$server$machine$Callbacks$$process$1(Object environment, Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) { BoxedUnit boxedUnit; boolean bool; Callbacks$$anonfun$2 callbacks$$anonfun$22; Tuple2 tuple2; Object object1 = environment; if (object1 instanceof MethodWhitelist) { MethodWhitelist methodWhitelist = (MethodWhitelist)object1; Buffer buffer = whitelists$1.$plus$eq(scala.Option$.MODULE$.apply(methodWhitelist.whitelistedMethods()).fold((Function0)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$1(), (Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$2())); } else { boxedUnit = BoxedUnit.UNIT; }  Object object2 = environment; if (object2 instanceof NamedBlock) { NamedBlock namedBlock = (NamedBlock)object2; bool = namedBlock.priority(); } else { bool = false; }  int priority = bool; Object object3 = environment; if (object3 instanceof FilteredEnvironment) { FilteredEnvironment filteredEnvironment = (FilteredEnvironment)object3; Callbacks$$anonfun$1 callbacks$$anonfun$1 = new Callbacks$$anonfun$1(whitelists$1, callbacks$2, whitelist$lzy$1, filteredEnvironment, bitmap$0$1); } else { callbacks$$anonfun$22 = new Callbacks$$anonfun$2(whitelists$1, callbacks$2, whitelist$lzy$1, bitmap$0$1); }  Callbacks$$anonfun$2 callbacks$$anonfun$21 = callbacks$$anonfun$22; Object object4 = environment; if (object4 instanceof ManagedPeripheral) { ManagedPeripheral managedPeripheral = (ManagedPeripheral)object4; tuple2 = new Tuple2(BoxesRunTime.boxToInteger(priority), new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3(callbacks$2, environment, (Function1)callbacks$$anonfun$21, managedPeripheral)); } else { tuple2 = new Tuple2(BoxesRunTime.boxToInteger(priority), new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$4(callbacks$2, environment, (Function1)callbacks$$anonfun$21)); }  return tuple2; } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$1 extends AbstractFunction0<Set<String>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final Set<String> apply() { return scala.Predef$.MODULE$.Set().empty(); } }
/*     */   public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$2 extends AbstractFunction1<String[], Set<String>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final Set<String> apply(String[] x$3) { return scala.Predef$.MODULE$.refArrayOps((Object[])x$3).toSet(); } }
/*  43 */   public Map<String, Callbacks.Callback> li$cil$oc$server$machine$Callbacks$$dynamicAnalyze(Object host) { Seq seq; ObjectRef whitelist$lzy = ObjectRef.zero();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     VolatileByteRef bitmap$0 = VolatileByteRef.create((byte)0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Buffer whitelists = (Buffer)scala.collection.mutable.Buffer$.MODULE$.empty();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Map callbacks = scala.collection.mutable.Map$.MODULE$.empty();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     Object object = host;
/*  75 */     if (object instanceof CompoundBlockEnvironment) { CompoundBlockEnvironment compoundBlockEnvironment = (CompoundBlockEnvironment)object; seq = (Seq)compoundBlockEnvironment.environments().map((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$1(whitelists, callbacks, whitelist$lzy, bitmap$0), scala.collection.Seq$.MODULE$.canBuildFrom()); }
/*  76 */     else { (new Tuple2[1])[0] = li$cil$oc$server$machine$Callbacks$$process$1(object, whitelists, callbacks, whitelist$lzy, bitmap$0); seq = (Seq)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[1])); }
/*  77 */      ((IterableLike)((TraversableLike)seq.sortBy((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$2(), (Ordering)scala.math.Ordering$Int$.MODULE$)).map((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$3(), scala.collection.Seq$.MODULE$.canBuildFrom())).foreach((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$4());
/*     */     
/*  79 */     return callbacks.toMap(scala.Predef$.MODULE$.$conforms()); } public final class Callbacks$$anonfun$1 extends AbstractFunction1<String, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Buffer whitelists$1; private final Map callbacks$2; private final ObjectRef whitelist$lzy$1; private final FilteredEnvironment x2$1; private final VolatileByteRef bitmap$0$1; public final boolean apply(String s) { return (Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$shouldAdd$2(s, this.whitelists$1, this.callbacks$2, this.whitelist$lzy$1, this.bitmap$0$1) && this.x2$1.isCallbackEnabled(s)); } public Callbacks$$anonfun$1(Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, FilteredEnvironment x2$1, VolatileByteRef bitmap$0$1) {} } public final class Callbacks$$anonfun$2 extends AbstractFunction1<String, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Buffer whitelists$1; private final Map callbacks$2; private final ObjectRef whitelist$lzy$1; private final VolatileByteRef bitmap$0$1; public final boolean apply(String name) { return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$shouldAdd$2(name, this.whitelists$1, this.callbacks$2, this.whitelist$lzy$1, this.bitmap$0$1); } public Callbacks$$anonfun$2(Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) {} } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3 extends AbstractFunction0<Map<String, Callbacks.Callback>> implements Serializable { public static final long serialVersionUID = 0L; public final Map callbacks$2; private final Object environment$1; public final Function1 filter$1; private final ManagedPeripheral x2$2; public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3(Map callbacks$2, Object environment$1, Function1 filter$1, ManagedPeripheral x2$2) {} public final Map<String, Callbacks.Callback> apply() { scala.Predef$.MODULE$.refArrayOps((Object[])this.x2$2.methods()).withFilter((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$3(this)).foreach((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$4(this)); return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$staticAnalyze(this.environment$1.getClass(), scala.Option$.MODULE$.apply(this.filter$1), scala.Option$.MODULE$.apply(this.callbacks$2)); } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$3 extends AbstractFunction1<String, Object> implements Serializable {
/*  82 */       public static final long serialVersionUID = 0L; public final boolean apply(String name) { return BoxesRunTime.unboxToBoolean(this.$outer.filter$1.apply(name)); } public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$3(Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3 $outer) {} } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$4 extends AbstractFunction1<String, Map<String, Callbacks.Callback>> implements Serializable { public static final long serialVersionUID = 0L; public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$4(Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3 $outer) {} public final Map<String, Callbacks.Callback> apply(String name) { return (Map<String, Callbacks.Callback>)this.$outer.callbacks$2.$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(name), new Callbacks.PeripheralCallback(name))); } } } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$4 extends AbstractFunction0<Map<String, Callbacks.Callback>> implements Serializable { public static final long serialVersionUID = 0L; private final Map callbacks$2; private final Object environment$1; private final Function1 filter$1; public final Map<String, Callbacks.Callback> apply() { return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$staticAnalyze(this.environment$1.getClass(), scala.Option$.MODULE$.apply(this.filter$1), scala.Option$.MODULE$.apply(this.callbacks$2)); } public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$4(Map callbacks$2, Object environment$1, Function1 filter$1) {} } private Option<Function1<String, Object>> staticAnalyze$default$2() { return (Option<Function1<String, Object>>)scala.None$.MODULE$; } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Tuple2<Object, Function0<Map<String, Callbacks.Callback>>>> implements Serializable { public static final long serialVersionUID = 0L; private final Buffer whitelists$1; private final Map callbacks$2; private final ObjectRef whitelist$lzy$1; private final VolatileByteRef bitmap$0$1; public final Tuple2<Object, Function0<Map<String, Callbacks.Callback>>> apply(Tuple2 env) { return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$process$1(env._2(), this.whitelists$1, this.callbacks$2, this.whitelist$lzy$1, this.bitmap$0$1); } public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$1(Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) {} } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$2 extends AbstractFunction1<Tuple2<Object, Function0<Map<String, Callbacks.Callback>>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(Tuple2 x$4) { return -x$4._1$mcI$sp(); } } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$3 extends AbstractFunction1<Tuple2<Object, Function0<Map<String, Callbacks.Callback>>>, Function0<Map<String, Callbacks.Callback>>> implements Serializable { public static final long serialVersionUID = 0L; public final Function0<Map<String, Callbacks.Callback>> apply(Tuple2 x$5) { return (Function0<Map<String, Callbacks.Callback>>)x$5._2(); } } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$4 extends AbstractFunction1<Function0<Map<String, Callbacks.Callback>>, Map<String, Callbacks.Callback>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<String, Callbacks.Callback> apply(Function0 x$6) { return (Map<String, Callbacks.Callback>)x$6.apply(); } } private Option<Map<String, Callbacks.Callback>> staticAnalyze$default$3() { return (Option<Map<String, Callbacks.Callback>>)scala.None$.MODULE$; } public Map<String, Callbacks.Callback> li$cil$oc$server$machine$Callbacks$$staticAnalyze(Class seed, Option shouldAdd, Option optCallbacks) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: new li/cil/oc/server/machine/Callbacks$$anonfun$3
/*     */     //   4: dup
/*     */     //   5: invokespecial <init> : ()V
/*     */     //   8: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*     */     //   11: checkcast scala/collection/mutable/Map
/*     */     //   14: astore #4
/*     */     //   16: aload_1
/*     */     //   17: astore #5
/*     */     //   19: aload #5
/*     */     //   21: ifnull -> 51
/*     */     //   24: aload #5
/*     */     //   26: ldc java/lang/Object
/*     */     //   28: astore #6
/*     */     //   30: dup
/*     */     //   31: ifnonnull -> 43
/*     */     //   34: pop
/*     */     //   35: aload #6
/*     */     //   37: ifnull -> 51
/*     */     //   40: goto -> 54
/*     */     //   43: aload #6
/*     */     //   45: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   48: ifeq -> 54
/*     */     //   51: aload #4
/*     */     //   53: areturn
/*     */     //   54: aload #5
/*     */     //   56: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
/*     */     //   59: astore #7
/*     */     //   61: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   64: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   67: aload #7
/*     */     //   69: checkcast [Ljava/lang/Object;
/*     */     //   72: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   75: new li/cil/oc/server/machine/Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$1
/*     */     //   78: dup
/*     */     //   79: invokespecial <init> : ()V
/*     */     //   82: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   87: checkcast [Ljava/lang/Object;
/*     */     //   90: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   93: new li/cil/oc/server/machine/Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2
/*     */     //   96: dup
/*     */     //   97: aload_2
/*     */     //   98: aload #4
/*     */     //   100: invokespecial <init> : (Lscala/Option;Lscala/collection/mutable/Map;)V
/*     */     //   103: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   108: aload #5
/*     */     //   110: invokevirtual getSuperclass : ()Ljava/lang/Class;
/*     */     //   113: astore #5
/*     */     //   115: goto -> 19
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #83	-> 0
/*     */     //   #84	-> 16
/*     */     //   #85	-> 19
/*     */     //   #111	-> 51
/*     */     //   #86	-> 54
/*     */     //   #88	-> 61
/*     */     //   #109	-> 108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	118	0	this	Lli/cil/oc/server/machine/Callbacks$;
/*     */     //   0	118	1	seed	Ljava/lang/Class;
/*     */     //   0	118	2	shouldAdd	Lscala/Option;
/*     */     //   0	118	3	optCallbacks	Lscala/Option;
/*     */     //   16	37	4	callbacks	Lscala/collection/mutable/Map;
/*     */     //   19	34	5	c	Ljava/lang/Class;
/*     */     //   61	54	7	ms	[Ljava/lang/reflect/Method; } public final class Callbacks$$anonfun$3 extends AbstractFunction0<Map<String, Callbacks.Callback>> implements Serializable { public static final long serialVersionUID = 0L;
/*  83 */     public final Map<String, Callbacks.Callback> apply() { return scala.collection.mutable.Map$.MODULE$.empty(); }
/*     */      }
/*     */   public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$1 extends AbstractFunction1<Method, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Method x$7) {
/*  88 */       return x$7.isAnnotationPresent((Class)Callback.class);
/*     */     } }
/*     */   
/*     */   public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2 extends AbstractFunction1<Method, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final Option shouldAdd$1;
/*     */     private final Map callbacks$1;
/*     */     
/*     */     public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2(Option shouldAdd$1, Map callbacks$1) {}
/*     */     
/*     */     public final Object apply(Method m) {
/*     */       // Byte code:
/*     */       //   0: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   3: aload_1
/*     */       //   4: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
/*     */       //   7: checkcast [Ljava/lang/Object;
/*     */       //   10: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   13: invokeinterface size : ()I
/*     */       //   18: iconst_2
/*     */       //   19: if_icmpne -> 426
/*     */       //   22: aload_1
/*     */       //   23: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
/*     */       //   26: iconst_0
/*     */       //   27: aaload
/*     */       //   28: ldc li/cil/oc/api/machine/Context
/*     */       //   30: astore_2
/*     */       //   31: dup
/*     */       //   32: ifnonnull -> 43
/*     */       //   35: pop
/*     */       //   36: aload_2
/*     */       //   37: ifnull -> 50
/*     */       //   40: goto -> 426
/*     */       //   43: aload_2
/*     */       //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   47: ifeq -> 426
/*     */       //   50: aload_1
/*     */       //   51: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
/*     */       //   54: iconst_1
/*     */       //   55: aaload
/*     */       //   56: ldc li/cil/oc/api/machine/Arguments
/*     */       //   58: astore_3
/*     */       //   59: dup
/*     */       //   60: ifnonnull -> 71
/*     */       //   63: pop
/*     */       //   64: aload_3
/*     */       //   65: ifnull -> 78
/*     */       //   68: goto -> 426
/*     */       //   71: aload_3
/*     */       //   72: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   75: ifeq -> 426
/*     */       //   78: aload_1
/*     */       //   79: invokevirtual getReturnType : ()Ljava/lang/Class;
/*     */       //   82: ldc [Ljava/lang/Object;
/*     */       //   84: astore #4
/*     */       //   86: dup
/*     */       //   87: ifnonnull -> 99
/*     */       //   90: pop
/*     */       //   91: aload #4
/*     */       //   93: ifnull -> 107
/*     */       //   96: goto -> 344
/*     */       //   99: aload #4
/*     */       //   101: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   104: ifeq -> 344
/*     */       //   107: aload_1
/*     */       //   108: invokevirtual getModifiers : ()I
/*     */       //   111: invokestatic isPublic : (I)Z
/*     */       //   114: ifeq -> 262
/*     */       //   117: aload_1
/*     */       //   118: ldc li/cil/oc/api/machine/Callback
/*     */       //   120: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/*     */       //   123: checkcast li/cil/oc/api/machine/Callback
/*     */       //   126: astore #5
/*     */       //   128: aload #5
/*     */       //   130: invokeinterface value : ()Ljava/lang/String;
/*     */       //   135: ifnull -> 173
/*     */       //   138: aload #5
/*     */       //   140: invokeinterface value : ()Ljava/lang/String;
/*     */       //   145: invokevirtual trim : ()Ljava/lang/String;
/*     */       //   148: ldc ''
/*     */       //   150: astore #7
/*     */       //   152: dup
/*     */       //   153: ifnonnull -> 165
/*     */       //   156: pop
/*     */       //   157: aload #7
/*     */       //   159: ifnull -> 173
/*     */       //   162: goto -> 180
/*     */       //   165: aload #7
/*     */       //   167: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   170: ifeq -> 180
/*     */       //   173: aload_1
/*     */       //   174: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   177: goto -> 187
/*     */       //   180: aload #5
/*     */       //   182: invokeinterface value : ()Ljava/lang/String;
/*     */       //   187: astore #6
/*     */       //   189: aload_0
/*     */       //   190: getfield shouldAdd$1 : Lscala/Option;
/*     */       //   193: new li/cil/oc/server/machine/Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2$$anonfun$apply$1
/*     */       //   196: dup
/*     */       //   197: aload_0
/*     */       //   198: invokespecial <init> : (Lli/cil/oc/server/machine/Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2;)V
/*     */       //   201: new li/cil/oc/server/machine/Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2$$anonfun$apply$5
/*     */       //   204: dup
/*     */       //   205: aload_0
/*     */       //   206: aload #6
/*     */       //   208: invokespecial <init> : (Lli/cil/oc/server/machine/Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2;Ljava/lang/String;)V
/*     */       //   211: invokevirtual fold : (Lscala/Function0;Lscala/Function1;)Ljava/lang/Object;
/*     */       //   214: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*     */       //   217: ifeq -> 256
/*     */       //   220: aload_0
/*     */       //   221: getfield callbacks$1 : Lscala/collection/mutable/Map;
/*     */       //   224: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */       //   227: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   230: aload #6
/*     */       //   232: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   235: new li/cil/oc/server/machine/Callbacks$ComponentCallback
/*     */       //   238: dup
/*     */       //   239: aload_1
/*     */       //   240: aload #5
/*     */       //   242: invokespecial <init> : (Ljava/lang/reflect/Method;Lli/cil/oc/api/machine/Callback;)V
/*     */       //   245: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */       //   248: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*     */       //   253: goto -> 505
/*     */       //   256: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   259: goto -> 505
/*     */       //   262: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   265: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   268: new scala/StringContext
/*     */       //   271: dup
/*     */       //   272: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   275: iconst_3
/*     */       //   276: anewarray java/lang/String
/*     */       //   279: dup
/*     */       //   280: iconst_0
/*     */       //   281: ldc 'Invalid use of Callback annotation on '
/*     */       //   283: aastore
/*     */       //   284: dup
/*     */       //   285: iconst_1
/*     */       //   286: ldc '.'
/*     */       //   288: aastore
/*     */       //   289: dup
/*     */       //   290: iconst_2
/*     */       //   291: ldc ': method must be public.'
/*     */       //   293: aastore
/*     */       //   294: checkcast [Ljava/lang/Object;
/*     */       //   297: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   300: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   303: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   306: iconst_2
/*     */       //   307: anewarray java/lang/Object
/*     */       //   310: dup
/*     */       //   311: iconst_0
/*     */       //   312: aload_1
/*     */       //   313: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
/*     */       //   316: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   319: aastore
/*     */       //   320: dup
/*     */       //   321: iconst_1
/*     */       //   322: aload_1
/*     */       //   323: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   326: aastore
/*     */       //   327: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   330: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   333: invokeinterface error : (Ljava/lang/String;)V
/*     */       //   338: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   341: goto -> 505
/*     */       //   344: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   347: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   350: new scala/StringContext
/*     */       //   353: dup
/*     */       //   354: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   357: iconst_3
/*     */       //   358: anewarray java/lang/String
/*     */       //   361: dup
/*     */       //   362: iconst_0
/*     */       //   363: ldc 'Invalid use of Callback annotation on '
/*     */       //   365: aastore
/*     */       //   366: dup
/*     */       //   367: iconst_1
/*     */       //   368: ldc '.'
/*     */       //   370: aastore
/*     */       //   371: dup
/*     */       //   372: iconst_2
/*     */       //   373: ldc ': invalid return type.'
/*     */       //   375: aastore
/*     */       //   376: checkcast [Ljava/lang/Object;
/*     */       //   379: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   382: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   385: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   388: iconst_2
/*     */       //   389: anewarray java/lang/Object
/*     */       //   392: dup
/*     */       //   393: iconst_0
/*     */       //   394: aload_1
/*     */       //   395: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
/*     */       //   398: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   401: aastore
/*     */       //   402: dup
/*     */       //   403: iconst_1
/*     */       //   404: aload_1
/*     */       //   405: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   408: aastore
/*     */       //   409: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   412: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   415: invokeinterface error : (Ljava/lang/String;)V
/*     */       //   420: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   423: goto -> 505
/*     */       //   426: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   429: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   432: new scala/StringContext
/*     */       //   435: dup
/*     */       //   436: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   439: iconst_3
/*     */       //   440: anewarray java/lang/String
/*     */       //   443: dup
/*     */       //   444: iconst_0
/*     */       //   445: ldc 'Invalid use of Callback annotation on '
/*     */       //   447: aastore
/*     */       //   448: dup
/*     */       //   449: iconst_1
/*     */       //   450: ldc '.'
/*     */       //   452: aastore
/*     */       //   453: dup
/*     */       //   454: iconst_2
/*     */       //   455: ldc ': invalid argument types or count.'
/*     */       //   457: aastore
/*     */       //   458: checkcast [Ljava/lang/Object;
/*     */       //   461: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   464: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   467: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   470: iconst_2
/*     */       //   471: anewarray java/lang/Object
/*     */       //   474: dup
/*     */       //   475: iconst_0
/*     */       //   476: aload_1
/*     */       //   477: invokevirtual getDeclaringClass : ()Ljava/lang/Class;
/*     */       //   480: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   483: aastore
/*     */       //   484: dup
/*     */       //   485: iconst_1
/*     */       //   486: aload_1
/*     */       //   487: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   490: aastore
/*     */       //   491: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   494: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   497: invokeinterface error : (Ljava/lang/String;)V
/*     */       //   502: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   505: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #89	-> 0
/*     */       //   #90	-> 22
/*     */       //   #91	-> 50
/*     */       //   #94	-> 78
/*     */       //   #97	-> 107
/*     */       //   #101	-> 117
/*     */       //   #102	-> 128
/*     */       //   #103	-> 189
/*     */       //   #104	-> 220
/*     */       //   #103	-> 256
/*     */       //   #98	-> 262
/*     */       //   #95	-> 344
/*     */       //   #92	-> 426
/*     */       //   #89	-> 505
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	506	0	this	Lli/cil/oc/server/machine/Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2;
/*     */       //   0	506	1	m	Ljava/lang/reflect/Method;
/*     */       //   128	378	5	a	Lli/cil/oc/api/machine/Callback;
/*     */       //   189	317	6	name	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2$$anonfun$apply$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */       
/* 103 */       public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2$$anonfun$apply$1(Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2 $outer) {} } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2$$anonfun$apply$5 extends AbstractFunction1<Function1<String, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String name$1; public final boolean apply(Function1 x$8) { return BoxesRunTime.unboxToBoolean(x$8.apply(this.name$1)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2$$anonfun$apply$5(Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2 $outer, String name$1) {} }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Callbacks$() {
/* 134 */     MODULE$ = this;
/*     */     this.cache = scala.collection.mutable.Map$.MODULE$.empty();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\Callbacks$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */