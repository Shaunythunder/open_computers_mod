/*     */ package li.cil.oc.server.machine;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.Set;
/*     */ import scala.collection.mutable.Map;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005uv!B\001\003\021\003i\021!C\"bY2\024\027mY6t\025\t\031A!A\004nC\016D\027N\\3\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\021bQ1mY\n\f7m[:\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!9Ad\004b\001\n\023i\022!B2bG\",W#\001\020\021\t}!c\005P\007\002A)\021\021EI\001\b[V$\030M\0317f\025\t\031C#\001\006d_2dWm\031;j_:L!!\n\021\003\0075\013\007\017\r\002(cA\031\001&L\030\016\003%R!AK\026\002\t1\fgn\032\006\002Y\005!!.\031<b\023\tq\023FA\003DY\006\0348\017\005\0021c1\001A!\003\0324\003\003\005\tQ!\0016\005\ryF%\r\005\007i=\001\013\021\002\020\002\r\r\f7\r[3!#\t1\024\b\005\002\024o%\021\001\b\006\002\b\035>$\b.\0338h!\t\031\"(\003\002<)\t\031\021I\\=\021\tu\002\025\tS\007\002})\021qHI\001\nS6lW\017^1cY\026L!!\n \021\005\t+eBA\nD\023\t!E#\001\004Qe\026$WMZ\005\003\r\036\023aa\025;sS:<'B\001#\025!\tI%*D\001\020\r\025Yu\"!\001M\005!\031\025\r\0347cC\016\\7C\001&\023\021!q%J!b\001\n\003y\025AC1o]>$\030\r^5p]V\t\001\013\005\002R+6\t!K\003\002\004'*\021AKB\001\004CBL\027BA&S\021!9&J!A!\002\023\001\026aC1o]>$\030\r^5p]\002BQ!\007&\005\002e#\"\001\023.\t\0139C\006\031\001)\t\013qSe\021A/\002\013\005\004\b\017\\=\025\ty\0137\r\033\t\004'}\023\022B\0011\025\005\025\t%O]1z\021\025\0217\f1\001\023\003!Ign\035;b]\016,\007\"\0023\\\001\004)\027aB2p]R,\007\020\036\t\003#\032L!a\032*\003\017\r{g\016^3yi\")\021n\027a\001U\006!\021M]4t!\t\t6.\003\002m%\nI\021I]4v[\026tGo\035\005\0069>!\tA\034\013\003y=DQ\001]7A\002e\nA\001[8ti\")!o\004C\001g\006)1\r\\3beR\tA\017\005\002\024k&\021a\017\006\002\005+:LG\017C\003y\037\021\005\0210A\005ge>l7\t\\1tgR\021!p\037\t\005?\021\n\005\nC\003}o\002\007Q0A\006f]ZL'o\0348nK:$\bg\001@\002\004A!!i`A\001\023\tqs\tE\0021\003\007!!\"!\002|\003\003\005\tQ!\0016\005\ryFE\r\005\b\003\023yA\021BA\006\0039!\027P\\1nS\016\fe.\0317zu\026$2\001PA\007\021\031\001\030q\001a\001s!9\021\021C\b\005\n\005M\021!D:uCRL7-\0218bYfTX\rF\004{\003+\t\031#!\017\t\021\005]\021q\002a\001\0033\tAa]3fIB\"\0211DA\020!\021\021u0!\b\021\007A\ny\002B\006\002\"\005U\021\021!A\001\006\003)$aA0%g!Q\021QEA\b!\003\005\r!a\n\002\023MDw.\0367e\003\022$\007#B\n\002*\0055\022bAA\026)\t1q\n\035;j_:\004baEA\030\003\006M\022bAA\031)\tIa)\0368di&|g.\r\t\004'\005U\022bAA\034)\t9!i\\8mK\006t\007BCA\036\003\037\001\n\0211\001\002>\005aq\016\035;DC2d'-Y2lgB!1#!\013{\r\031\t\te\004\001\002D\t\t2i\\7q_:,g\016^\"bY2\024\027mY6\024\007\005}\002\nC\006\002H\005}\"Q1A\005\002\005%\023AB7fi\"|G-\006\002\002LA!\021QJA*\033\t\tyEC\002\002R%\nqA]3gY\026\034G/\003\003\002V\005=#AB'fi\"|G\rC\006\002Z\005}\"\021!Q\001\n\005-\023aB7fi\"|G\r\t\005\013\035\006}\"\021!Q\001\nAk\005bB\r\002@\021\005\021q\f\013\007\003C\n\031'!\032\021\007%\013y\004\003\005\002H\005u\003\031AA&\021\031q\025Q\fa\001!\"Q\021\021NA \005\004%)!a\033\002\027\r\fG\016\\,sCB\004XM]\013\003\003[\0022ADA8\023\r\t\tH\001\002\r\007\006dGNY1dW\016\013G\016\034\005\n\003k\ny\004)A\007\003[\nAbY1mY^\023\030\r\0359fe\002Bq\001XA \t\003\nI\bF\004_\003w\ni(a \t\r\t\f9\b1\001\023\021\031!\027q\017a\001K\"1\021.a\036A\002)4a!a!\020\001\005\025%A\005)fe&\004\b.\032:bY\016\013G\016\0342bG.\0342!!!I\021)\tI)!!\003\002\003\006I!Q\001\005]\006lW\rC\004\032\003\003#\t!!$\025\t\005=\025\021\023\t\004\023\006\005\005bBAE\003\027\003\r!\021\005\b9\006\005E\021IAK)\035q\026qSAM\0037CaAYAJ\001\004\021\002B\0023\002\024\002\007Q\r\003\004j\003'\003\rA\033\005\n\003?{\021\023!C\005\003C\013qc\035;bi&\034\027I\\1msj,G\005Z3gCVdG\017\n\032\026\005\005\r&\006BA\024\003K[#!a*\021\t\005%\026\021W\007\003\003WSA!!,\0020\006IQO\\2iK\016\\W\r\032\006\003\035RIA!a-\002,\n\tRO\\2iK\016\\W\r\032,be&\fgnY3\t\023\005]v\"%A\005\n\005e\026aF:uCRL7-\0218bYfTX\r\n3fM\006,H\016\036\0234+\t\tYL\013\003\002>\005\025\006")
/*     */ public final class Callbacks {
/*     */   public static Map<String, Callback> fromClass(Class<?> paramClass) {
/*     */     return Callbacks$.MODULE$.fromClass(paramClass);
/*     */   }
/*     */   
/*     */   public static void clear() {
/*     */     Callbacks$.MODULE$.clear();
/*     */   }
/*     */   
/*     */   public static Map<String, Callback> apply(Object paramObject) {
/*     */     return Callbacks$.MODULE$.apply(paramObject);
/*     */   }
/*     */   
/*     */   public final class Callbacks$$anonfun$apply$2 extends AbstractFunction0<Map<String, Callback>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Object host$1;
/*     */     
/*     */     public final Map<String, Callbacks.Callback> apply() {
/*  26 */       return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$dynamicAnalyze(this.host$1);
/*     */     }
/*     */ 
/*     */     
/*     */     public Callbacks$$anonfun$apply$2(Object host$1) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Callbacks$$anonfun$whitelist$lzycompute$1$1
/*     */     extends AbstractFunction2<Set<String>, Set<String>, Set<String>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     public final Set<String> apply(Set x$1, Set x$2)
/*     */     {
/*  43 */       return (Set<String>)x$1.intersect((GenSet)x$2); } } public final class Callbacks$$anonfun$whitelist$lzycompute$1$2 extends AbstractFunction0<Set<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Set<String> apply() { return Predef$.MODULE$.Set().empty(); }
/*     */      }
/*     */   
/*     */   public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$1 extends AbstractFunction0<Set<String>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*  48 */     public final Set<String> apply() { return Predef$.MODULE$.Set().empty(); } } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$2 extends AbstractFunction1<String[], Set<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Set<String> apply(String[] x$3) { return Predef$.MODULE$.refArrayOps((Object[])x$3).toSet(); }
/*     */      }
/*     */   public final class Callbacks$$anonfun$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Buffer whitelists$1;
/*     */     private final Map callbacks$2;
/*     */     private final ObjectRef whitelist$lzy$1;
/*     */     private final FilteredEnvironment x2$1;
/*     */     private final VolatileByteRef bitmap$0$1;
/*     */     
/*  56 */     public final boolean apply(String s) { return (Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$shouldAdd$2(s, this.whitelists$1, this.callbacks$2, this.whitelist$lzy$1, this.bitmap$0$1) && this.x2$1.isCallbackEnabled(s)); } public Callbacks$$anonfun$1(Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, FilteredEnvironment x2$1, VolatileByteRef bitmap$0$1) {} } public final class Callbacks$$anonfun$2 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Buffer whitelists$1; private final Map callbacks$2; private final ObjectRef whitelist$lzy$1; private final VolatileByteRef bitmap$0$1; public final boolean apply(String name) {
/*  57 */       return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$shouldAdd$2(name, this.whitelists$1, this.callbacks$2, this.whitelist$lzy$1, this.bitmap$0$1);
/*     */     }
/*     */     public Callbacks$$anonfun$2(Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) {} }
/*     */   public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3 extends AbstractFunction0<Map<String, Callback>> implements Serializable { public static final long serialVersionUID = 0L; public final Map callbacks$2; private final Object environment$1; public final Function1 filter$1; private final ManagedPeripheral x2$2;
/*     */     public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3(Map callbacks$2, Object environment$1, Function1 filter$1, ManagedPeripheral x2$2) {}
/*  62 */     public final Map<String, Callbacks.Callback> apply() { Predef$.MODULE$.refArrayOps((Object[])this.x2$2.methods()).withFilter((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$3(this)).foreach((Function1)new Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$4(this));
/*     */ 
/*     */       
/*  65 */       return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$staticAnalyze(this.environment$1.getClass(), Option$.MODULE$.apply(this.filter$1), Option$.MODULE$.apply(this.callbacks$2)); } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$3 extends AbstractFunction1<String, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(String name) { return BoxesRunTime.unboxToBoolean(this.$outer.filter$1.apply(name)); } public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$3(Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3 $outer) {} } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$4 extends AbstractFunction1<String, Map<String, Callbacks.Callback>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3$$anonfun$apply$4(Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$3 $outer) {} public final Map<String, Callbacks.Callback> apply(String name) { return (Map<String, Callbacks.Callback>)this.$outer.callbacks$2.$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(name), new Callbacks.PeripheralCallback(name))); } } }
/*  68 */    public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$4 extends AbstractFunction0<Map<String, Callback>> implements Serializable { public static final long serialVersionUID = 0L; private final Map callbacks$2; public final Map<String, Callbacks.Callback> apply() { return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$staticAnalyze(this.environment$1.getClass(), Option$.MODULE$.apply(this.filter$1), Option$.MODULE$.apply(this.callbacks$2)); }
/*     */     
/*     */     private final Object environment$1; private final Function1 filter$1;
/*     */     public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$process$1$4(Map callbacks$2, Object environment$1, Function1 filter$1) {} }
/*     */   public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Tuple2<Object, Function0<Map<String, Callback>>>> implements Serializable { public static final long serialVersionUID = 0L; private final Buffer whitelists$1; private final Map callbacks$2; private final ObjectRef whitelist$lzy$1; private final VolatileByteRef bitmap$0$1;
/*     */     
/*     */     public final Tuple2<Object, Function0<Map<String, Callbacks.Callback>>> apply(Tuple2 env) {
/*  75 */       return Callbacks$.MODULE$.li$cil$oc$server$machine$Callbacks$$process$1(env._2(), this.whitelists$1, this.callbacks$2, this.whitelist$lzy$1, this.bitmap$0$1);
/*     */     } public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$1(Buffer whitelists$1, Map callbacks$2, ObjectRef whitelist$lzy$1, VolatileByteRef bitmap$0$1) {} } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$2 extends AbstractFunction1<Tuple2<Object, Function0<Map<String, Callback>>>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*  77 */     public final int apply(Tuple2 x$4) { return -x$4._1$mcI$sp(); } } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$3 extends AbstractFunction1<Tuple2<Object, Function0<Map<String, Callback>>>, Function0<Map<String, Callback>>> implements Serializable { public static final long serialVersionUID = 0L; public final Function0<Map<String, Callbacks.Callback>> apply(Tuple2 x$5) { return (Function0<Map<String, Callbacks.Callback>>)x$5._2(); } } public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$dynamicAnalyze$4 extends AbstractFunction1<Function0<Map<String, Callback>>, Map<String, Callback>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<String, Callbacks.Callback> apply(Function0 x$6) { return (Map<String, Callbacks.Callback>)x$6.apply(); }
/*     */      }
/*     */   
/*     */   public final class Callbacks$$anonfun$3 extends AbstractFunction0<Map<String, Callback>> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Map<String, Callbacks.Callback> apply() {
/*  83 */       return Map$.MODULE$.empty();
/*     */     } }
/*     */   public final class Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$1 extends AbstractFunction1<Method, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Method x$7) {
/*  88 */       return x$7.isAnnotationPresent((Class)li.cil.oc.api.machine.Callback.class);
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
/*     */       public Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2$$anonfun$apply$5(Callbacks$$anonfun$li$cil$oc$server$machine$Callbacks$$staticAnalyze$2 $outer, String name$1) {} }
/*     */      }
/*     */ 
/*     */   
/*     */   public static abstract class Callback
/*     */   {
/*     */     private final li.cil.oc.api.machine.Callback annotation;
/*     */     
/*     */     public li.cil.oc.api.machine.Callback annotation() {
/* 116 */       return this.annotation;
/*     */     } public abstract Object[] apply(Object param1Object, Context param1Context, Arguments param1Arguments);
/*     */     public Callback(li.cil.oc.api.machine.Callback annotation) {} }
/*     */   public static class ComponentCallback extends Callback { private final Method method; private final CallbackCall callWrapper;
/* 120 */     public Method method() { return this.method; } public ComponentCallback(Method method, li.cil.oc.api.machine.Callback annotation) { super(annotation);
/* 121 */       this.callWrapper = CallbackWrapper$.MODULE$.createCallbackWrapper(method); } public final CallbackCall callWrapper() { return this.callWrapper; }
/*     */      public Object[] apply(Object instance, Context context, Arguments args) {
/* 123 */       return callWrapper().call(instance, context, args);
/*     */     } } public static class PeripheralCallback extends Callback { private final String name;
/*     */     public PeripheralCallback(String name) {
/* 126 */       super(new PeripheralAnnotation(name));
/*     */     } public Object[] apply(Object instance, Context context, Arguments args) {
/* 128 */       Object object = instance;
/* 129 */       if (object instanceof ManagedPeripheral) { ManagedPeripheral managedPeripheral = (ManagedPeripheral)object; return managedPeripheral.invoke(this.name, context, args); }
/* 130 */        throw new NoSuchMethodException();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\Callbacks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */