/*     */ package li.cil.oc.server.machine.luaj;
/*     */ 
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.machine.Signal;
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaFunction;
/*     */ import li.cil.repack.org.luaj.vm2.LuaThread;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function0;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @Name("LuaJ")
/*     */ @ScalaSignature(bytes = "\006\001\005ug\001B\001\003\001=\0211\003T;b\0252+\030-\021:dQ&$Xm\031;ve\026T!a\001\003\002\t1,\030M\033\006\003\013\031\tq!\\1dQ&tWM\003\002\b\021\00511/\032:wKJT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\r\001\001\003\007\t\003#Yi\021A\005\006\003'Q\tA\001\\1oO*\tQ#\001\003kCZ\f\027BA\f\023\005\031y%M[3diB\021\021$H\007\0025)\021Qa\007\006\0039!\t1!\0319j\023\tq\"D\001\007Be\016D\027\016^3diV\024X\r\003\005\006\001\t\025\r\021\"\001!+\005\t\003CA\r#\023\t\031#DA\004NC\016D\027N\\3\t\021\025\002!\021!Q\001\n\005\n\001\"\\1dQ&tW\r\t\005\006O\001!\t\001K\001\007y%t\027\016\036 \025\005%Z\003C\001\026\001\033\005\021\001\"B\003'\001\004\t\003BC\027\001\001\004\005\r\021\"\001\005]\005\031A.^1\026\003=\002\"\001\r\035\016\003ER!AM\032\002\007Yl'G\003\002\004i)\021QGN\001\004_J<'BA\034\013\003\031\021X\r]1dW&\021\021(\r\002\b\0172|'-\0317t\021)Y\004\0011AA\002\023\005A\001P\001\bYV\fw\fJ3r)\ti4\t\005\002?\0036\tqHC\001A\003\025\0318-\0317b\023\t\021uH\001\003V]&$\bb\002#;\003\003\005\raL\001\004q\022\n\004B\002$\001A\003&q&\001\003mk\006\004\003\"\003%\001\001\004\005\r\021\"\003J\003\031!\bN]3bIV\t!\n\005\0021\027&\021A*\r\002\n\031V\fG\013\033:fC\022D\021B\024\001A\002\003\007I\021B(\002\025QD'/Z1e?\022*\027\017\006\002>!\"9A)TA\001\002\004Q\005B\002*\001A\003&!*A\004uQJ,\027\r\032\021\t\023Q\003\001\031!a\001\n\023)\026\001E:z]\016D'o\0348ju\026$7)\0317m+\0051\006C\001\031X\023\tA\026GA\006Mk\0064UO\\2uS>t\007\"\003.\001\001\004\005\r\021\"\003\\\003Q\031\030P\\2ie>t\027N_3e\007\006dGn\030\023fcR\021Q\b\030\005\b\tf\013\t\0211\001W\021\031q\006\001)Q\005-\006\t2/\0378dQJ|g.\033>fI\016\013G\016\034\021\t\023\001\004\001\031!a\001\n\023\t\027AE:z]\016D'o\0348ju\026$'+Z:vYR,\022A\031\t\003a\rL!\001Z\031\003\0211+\030MV1mk\026D\021B\032\001A\002\003\007I\021B4\002-MLhn\0315s_:L'0\0323SKN,H\016^0%KF$\"!\0205\t\017\021+\027\021!a\001E\"1!\016\001Q!\n\t\f1c]=oG\"\024xN\\5{K\022\024Vm];mi\002Bq\001\034\001A\002\023%Q.A\be_:,w+\033;i\023:LGOU;o+\005q\007C\001 p\023\t\001xHA\004C_>dW-\0318\t\017I\004\001\031!C\005g\006\031Bm\0348f/&$\b.\0238jiJ+hn\030\023fcR\021Q\b\036\005\b\tF\f\t\0211\001o\021\0311\b\001)Q\005]\006\001Bm\0348f/&$\b.\0238jiJ+h\016\t\005\tq\002\001\r\021\"\001\005s\0061Q.Z7pef,\022A\037\t\003}mL!\001` \003\007%sG\017\003\005\001\001\007I\021\001\003\000\003)iW-\\8ss~#S-\035\013\004{\005\005\001b\002#~\003\003\005\rA\037\005\b\003\013\001\001\025)\003{\003\035iW-\\8ss\002B\021\"!\003\001\005\004%I!a\003\002\t\005\004\030n]\013\003\003\033\001RAPA\b\003'I1!!\005@\005\025\t%O]1z!\rQ\023QC\005\004\003/\021!a\002'vC*\013\005+\023\005\t\0037\001\001\025!\003\002\016\005)\021\r]5tA!A\021q\004\001\005\002\021\t\t#\001\004j]Z|7.\032\013\005\003G\tI\003E\0021\003KI1!a\n2\005\0351\026M]1sOND\001\"a\013\002\036\001\007\021QF\001\002MB)a(a\f\0024%\031\021\021G \003\023\031+hn\031;j_:\004\004#\002 \002\020\005U\002c\001 \0028%\031\021\021H \003\r\005s\027PU3g\021!\ti\004\001C\001\t\005}\022!\0043pGVlWM\034;bi&|g\016\006\003\002$\005\005\003\002CA\026\003w\001\r!a\021\021\013y\ny#!\022\021\t\005\035\023Q\n\b\004}\005%\023bAA&\0051\001K]3eK\032LA!a\024\002R\t11\013\036:j]\036T1!a\023@\021\035\t)\006\001C!\003/\nQ\"[:J]&$\030.\0317ju\026$G#\0018\t\017\005m\003\001\"\021\002^\005y!/Z2p[B,H/Z'f[>\024\030\020F\002o\003?B\001\"!\031\002Z\001\007\0211M\001\013G>l\007o\0348f]R\034\b#B\t\002f\005%\024bAA4%\tA\021\n^3sC\ndW\r\005\003\002l\005eTBAA7\025\021\ty'!\035\002\t%$X-\034\006\005\003g\n)(A\005nS:,7M]1gi*\021\021qO\001\004]\026$\030\002BA>\003[\022\021\"\023;f[N#\030mY6\t\017\005}\004\001\"\003\002\002\006iQ.Z7pefLeNQ=uKN$2A_AB\021!\t\t'! A\002\005\r\004bBAD\001\021\005\023\021R\001\020eVt7+\0378dQJ|g.\033>fIR\tQ\bC\004\002\016\002!\t%a$\002\027I,h\016\0265sK\006$W\r\032\013\005\003#\0139\nE\002\032\003'K1!!&\033\005=)\0050Z2vi&|gNU3tk2$\bbBAM\003\027\003\rA\\\001\025SN\034\026P\\2ie>t\027N_3e%\026$XO\0358\t\017\005u\005\001\"\021\002\n\006AqN\\*jO:\fG\016C\004\002\"\002!\t%a\026\002\025%t\027\016^5bY&TX\rC\004\002&\002!\t%!#\002\023=t7i\0348oK\016$\bbBAU\001\021\005\023\021R\001\006G2|7/\032\005\b\003[\003A\021IAX\003\021aw.\0313\025\007u\n\t\f\003\005\0024\006-\006\031AA[\003\rq'\r\036\t\005\003o\013Y,\004\002\002:*!\0211WA9\023\021\ti,!/\003\0359\023E\013V1h\007>l\007o\\;oI\"9\021\021\031\001\005B\005\r\027\001B:bm\026$2!PAc\021!\t\031,a0A\002\005U\006f\002\001\002J\006]\027\021\034\t\005\003\027\f\tND\002\032\003\033L1!a4\033\0031\t%o\0315ji\026\034G/\036:f\023\021\t\031.!6\003\t9\013W.\032\006\004\003\037T\022!\002<bYV,\027EAAn\003\021aU/\031&")
/*     */ public class LuaJLuaArchitecture implements Architecture {
/*     */   private final Machine machine;
/*     */   private Globals lua;
/*     */   private LuaThread thread;
/*     */   private LuaFunction synchronizedCall;
/*     */   
/*  25 */   public Machine machine() { return this.machine; }
/*     */   private LuaValue synchronizedResult;
/*     */   private boolean doneWithInitRun;
/*     */   private int memory;
/*     */   private final LuaJAPI[] apis;
/*     */   public Globals lua() { return this.lua; }
/*     */   public void lua_$eq(Globals x$1) { this.lua = x$1; } private LuaThread thread() { return this.thread; } private void thread_$eq(LuaThread x$1) { this.thread = x$1; } private LuaFunction synchronizedCall() { return this.synchronizedCall; } private void synchronizedCall_$eq(LuaFunction x$1) { this.synchronizedCall = x$1; } private LuaValue synchronizedResult() {
/*     */     return this.synchronizedResult;
/*     */   } public LuaJLuaArchitecture(Machine machine) {
/*  34 */     this.doneWithInitRun = false;
/*     */     
/*  36 */     this.memory = 0;
/*     */     
/*  38 */     (new LuaJAPI[6])[0] = 
/*  39 */       new ComponentAPI(this);
/*  40 */     (new LuaJAPI[6])[1] = new ComputerAPI(this);
/*  41 */     (new LuaJAPI[6])[2] = new OSAPI(this);
/*  42 */     (new LuaJAPI[6])[3] = new SystemAPI(this);
/*  43 */     (new LuaJAPI[6])[4] = new UnicodeAPI(this);
/*  44 */     (new LuaJAPI[6])[5] = new UserdataAPI(this); this.apis = new LuaJAPI[6]; } private void synchronizedResult_$eq(LuaValue x$1) { this.synchronizedResult = x$1; } private boolean doneWithInitRun() { return this.doneWithInitRun; } private void doneWithInitRun_$eq(boolean x$1) { this.doneWithInitRun = x$1; }
/*     */   public int memory() { return this.memory; }
/*     */   public void memory_$eq(int x$1) { this.memory = x$1; }
/*     */   private LuaJAPI[] apis() { return this.apis; }
/*     */   public Varargs invoke(Function0 f) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface apply : ()Ljava/lang/Object;
/*     */     //   6: checkcast [Ljava/lang/Object;
/*     */     //   9: astore #9
/*     */     //   11: aload #9
/*     */     //   13: ifnull -> 116
/*     */     //   16: aload #9
/*     */     //   18: astore #10
/*     */     //   20: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   23: iconst_1
/*     */     //   24: anewarray li/cil/repack/org/luaj/vm2/LuaBoolean
/*     */     //   27: dup
/*     */     //   28: iconst_0
/*     */     //   29: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   32: aastore
/*     */     //   33: checkcast [Ljava/lang/Object;
/*     */     //   36: checkcast [Ljava/lang/Object;
/*     */     //   39: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   42: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   45: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   48: aload #10
/*     */     //   50: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   53: new li/cil/oc/server/machine/luaj/LuaJLuaArchitecture$$anonfun$invoke$1
/*     */     //   56: dup
/*     */     //   57: aload_0
/*     */     //   58: invokespecial <init> : (Lli/cil/oc/server/machine/luaj/LuaJLuaArchitecture;)V
/*     */     //   61: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   64: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   67: ldc li/cil/repack/org/luaj/vm2/LuaValue
/*     */     //   69: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   72: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */     //   75: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   80: checkcast [Ljava/lang/Object;
/*     */     //   83: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   86: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   89: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   92: ldc li/cil/repack/org/luaj/vm2/LuaValue
/*     */     //   94: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   97: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */     //   100: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   105: checkcast [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   108: invokestatic varargsOf : ([Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   111: astore #11
/*     */     //   113: goto -> 121
/*     */     //   116: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   119: astore #11
/*     */     //   121: aload #11
/*     */     //   123: goto -> 458
/*     */     //   126: astore_2
/*     */     //   127: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   130: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   133: invokevirtual logLuaCallbackErrors : ()Z
/*     */     //   136: ifeq -> 160
/*     */     //   139: aload_2
/*     */     //   140: instanceof li/cil/oc/api/machine/LimitReachedException
/*     */     //   143: ifne -> 160
/*     */     //   146: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   149: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   152: ldc 'Exception in Lua callback.'
/*     */     //   154: aload_2
/*     */     //   155: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   160: iconst_0
/*     */     //   161: istore_3
/*     */     //   162: aconst_null
/*     */     //   163: astore #4
/*     */     //   165: aload_2
/*     */     //   166: astore #5
/*     */     //   168: aload #5
/*     */     //   170: instanceof li/cil/oc/api/machine/LimitReachedException
/*     */     //   173: ifeq -> 184
/*     */     //   176: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NONE : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   179: astore #6
/*     */     //   181: goto -> 456
/*     */     //   184: aload #5
/*     */     //   186: instanceof java/lang/IllegalArgumentException
/*     */     //   189: ifeq -> 228
/*     */     //   192: iconst_1
/*     */     //   193: istore_3
/*     */     //   194: aload #5
/*     */     //   196: checkcast java/lang/IllegalArgumentException
/*     */     //   199: astore #4
/*     */     //   201: aload #4
/*     */     //   203: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   206: ifnull -> 228
/*     */     //   209: getstatic li/cil/repack/org/luaj/vm2/LuaValue.FALSE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   212: aload #4
/*     */     //   214: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   217: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   220: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   223: astore #6
/*     */     //   225: goto -> 456
/*     */     //   228: aload #5
/*     */     //   230: ifnull -> 267
/*     */     //   233: aload #5
/*     */     //   235: astore #7
/*     */     //   237: aload #7
/*     */     //   239: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   242: ifnull -> 267
/*     */     //   245: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   248: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   251: aload #7
/*     */     //   253: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   256: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   259: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   262: astore #6
/*     */     //   264: goto -> 456
/*     */     //   267: aload #5
/*     */     //   269: instanceof java/lang/IndexOutOfBoundsException
/*     */     //   272: ifeq -> 291
/*     */     //   275: getstatic li/cil/repack/org/luaj/vm2/LuaValue.FALSE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   278: ldc 'index out of bounds'
/*     */     //   280: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   283: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   286: astore #6
/*     */     //   288: goto -> 456
/*     */     //   291: iload_3
/*     */     //   292: ifeq -> 311
/*     */     //   295: getstatic li/cil/repack/org/luaj/vm2/LuaValue.FALSE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   298: ldc 'bad argument'
/*     */     //   300: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   303: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   306: astore #6
/*     */     //   308: goto -> 456
/*     */     //   311: aload #5
/*     */     //   313: instanceof java/lang/NoSuchMethodException
/*     */     //   316: ifeq -> 335
/*     */     //   319: getstatic li/cil/repack/org/luaj/vm2/LuaValue.FALSE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   322: ldc 'no such method'
/*     */     //   324: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   327: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   330: astore #6
/*     */     //   332: goto -> 456
/*     */     //   335: aload #5
/*     */     //   337: instanceof java/io/FileNotFoundException
/*     */     //   340: ifeq -> 362
/*     */     //   343: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   346: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   349: ldc 'file not found'
/*     */     //   351: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   354: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   357: astore #6
/*     */     //   359: goto -> 456
/*     */     //   362: aload #5
/*     */     //   364: instanceof java/lang/SecurityException
/*     */     //   367: ifeq -> 389
/*     */     //   370: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   373: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   376: ldc 'access denied'
/*     */     //   378: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   381: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   384: astore #6
/*     */     //   386: goto -> 456
/*     */     //   389: aload #5
/*     */     //   391: instanceof java/io/IOException
/*     */     //   394: ifeq -> 416
/*     */     //   397: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   400: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   403: ldc 'i/o error'
/*     */     //   405: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   408: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   411: astore #6
/*     */     //   413: goto -> 456
/*     */     //   416: aload #5
/*     */     //   418: ifnull -> 459
/*     */     //   421: aload #5
/*     */     //   423: astore #8
/*     */     //   425: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   428: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   431: ldc 'Unexpected error in Lua callback.'
/*     */     //   433: aload #8
/*     */     //   435: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   440: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   443: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   446: ldc 'unknown error'
/*     */     //   448: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*     */     //   451: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   454: astore #6
/*     */     //   456: aload #6
/*     */     //   458: areturn
/*     */     //   459: new scala/MatchError
/*     */     //   462: dup
/*     */     //   463: aload #5
/*     */     //   465: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   468: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #47	-> 0
/*     */     //   #48	-> 11
/*     */     //   #49	-> 20
/*     */     //   #51	-> 116
/*     */     //   #47	-> 121
/*     */     //   #55	-> 126
/*     */     //   #46	-> 126
/*     */     //   #56	-> 127
/*     */     //   #57	-> 146
/*     */     //   #62	-> 160
/*     */     //   #59	-> 165
/*     */     //   #60	-> 168
/*     */     //   #61	-> 176
/*     */     //   #62	-> 184
/*     */     //   #63	-> 209
/*     */     //   #64	-> 228
/*     */     //   #65	-> 245
/*     */     //   #66	-> 267
/*     */     //   #67	-> 275
/*     */     //   #59	-> 291
/*     */     //   #69	-> 295
/*     */     //   #70	-> 311
/*     */     //   #71	-> 319
/*     */     //   #72	-> 335
/*     */     //   #73	-> 343
/*     */     //   #74	-> 362
/*     */     //   #75	-> 370
/*     */     //   #76	-> 389
/*     */     //   #77	-> 397
/*     */     //   #78	-> 416
/*     */     //   #79	-> 425
/*     */     //   #80	-> 440
/*     */     //   #78	-> 454
/*     */     //   #59	-> 456
/*     */     //   #46	-> 458
/*     */     //   #59	-> 459
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	469	0	this	Lli/cil/oc/server/machine/luaj/LuaJLuaArchitecture;
/*     */     //   0	469	1	f	Lscala/Function0;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	126	126	finally }
/*  49 */   public final class LuaJLuaArchitecture$$anonfun$invoke$1 extends AbstractFunction1<Object, LuaValue> implements Serializable { public final LuaValue apply(Object value) { return ScalaClosure$.MODULE$.toLuaValue(value); }
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
/*     */     public static final long serialVersionUID = 0L;
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
/*     */     public LuaJLuaArchitecture$$anonfun$invoke$1(LuaJLuaArchitecture $outer) {} }
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
/*     */   public Varargs documentation(Function0 f) {
/*     */     try {
/*  85 */       String doc = (String)f.apply();
/*     */     } catch (NoSuchMethodException noSuchMethodException) {
/*     */     
/*     */     } finally {
/*     */       Exception exception;
/*     */     } 
/*     */ 
/*     */     
/*  93 */     return LuaValue.varargsOf(LuaValue.NIL, (Varargs)LuaValue.valueOf((exception.getMessage() == null) ? exception.toString() : exception.getMessage()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInitialized() {
/*  98 */     return doneWithInitRun();
/*     */   }
/*     */   public boolean recomputeMemory(Iterable<ItemStack> components) {
/* 101 */     memory_$eq(memoryInBytes(components));
/* 102 */     return (memory() > 0);
/*     */   }
/*     */   public final class LuaJLuaArchitecture$$anonfun$memoryInBytes$1 extends AbstractFunction2<Object, ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/* 105 */     public final double apply(double acc, ItemStack stack) { Option option = Option$.MODULE$.apply(Driver.driverFor(stack));
/* 106 */       if (option instanceof Some) { Some some = (Some)option; Item driver = (Item)some.x(); if (driver instanceof Memory) { Memory memory = (Memory)driver; double d1 = memory.amount(stack) * 'Ѐ'; return acc + d1; }  }
/* 107 */        double d = 0.0D;
/* 108 */       return acc + d; } public LuaJLuaArchitecture$$anonfun$memoryInBytes$1(LuaJLuaArchitecture $outer) {} } private int memoryInBytes(Iterable components) { return RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper((int)BoxesRunTime.unboxToDouble(WrapAsScala$.MODULE$.iterableAsScalaIterable(components).foldLeft(BoxesRunTime.boxToDouble(0.0D), (Function2)new LuaJLuaArchitecture$$anonfun$memoryInBytes$1(this)))), 0)), Settings$.MODULE$.get().maxTotalRam()); }
/*     */ 
/*     */ 
/*     */   
/*     */   public void runSynchronized() {
/* 113 */     synchronizedResult_$eq(synchronizedCall().call());
/* 114 */     synchronizedCall_$eq(null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ExecutionResult runThreaded(boolean isSynchronizedReturn) {
/*     */     try {
/* 122 */       Varargs varargs2, result = thread().resume((Varargs)synchronizedResult());
/* 123 */       synchronizedResult_$eq(null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 142 */       Signal signal = machine().popSignal();
/* 143 */       if (signal == null) {
/*     */ 
/*     */         
/* 146 */         varargs2 = thread().resume((Varargs)LuaValue.NONE);
/*     */       } else {
/*     */         (new li.cil.repack.org.luaj.vm2.LuaString[1])[0] = LuaValue.valueOf(signal.name());
/*     */         
/*     */         varargs2 = thread().resume(LuaValue.varargsOf((LuaValue[])Predef$.MODULE$.refArrayOps((Object[])new li.cil.repack.org.luaj.vm2.LuaString[1]).$plus$plus((GenTraversableOnce)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps(signal.args()).map((Function1)new LuaJLuaArchitecture$$anonfun$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(LuaValue.class)))), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(LuaValue.class)))));
/*     */       } 
/*     */       
/*     */       Varargs varargs1 = thread().resume((Varargs)LuaValue.NONE);
/*     */       
/*     */       doneWithInitRun_$eq(true);
/*     */       Varargs results = isSynchronizedReturn ? result : (doneWithInitRun() ? varargs2 : ((varargs1.narg() != 1) ? varargs1 : LuaValue.varargsOf((LuaValue)LuaValue.TRUE, (Varargs)LuaValue.valueOf(0))));
/* 157 */       synchronizedCall_$eq(results.checkfunction(2));
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
/* 171 */       int ticks = (results.narg() == 2 && results.isnumber(2)) ? (int)(results.todouble(2) * 20) : Integer.MAX_VALUE;
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
/* 184 */       if (results.type(1) != 1 || !isInnerError$1(results) || !isOuterError$1(results)) {
/* 185 */         OpenComputers$.MODULE$.log().warn("Kernel returned unexpected results.");
/*     */       }
/*     */ 
/*     */       
/* 189 */       OpenComputers$.MODULE$.log().warn("Kernel stopped unexpectedly.");
/*     */ 
/*     */ 
/*     */       
/* 193 */       String error = 
/* 194 */         isInnerError$1(results) ? (
/* 195 */         results.isuserdata(3) ? results.touserdata(3).toString() : 
/* 196 */         results.tojstring(3)) : (
/*     */         
/* 198 */         results.isuserdata(2) ? results.touserdata(2).toString() : 
/* 199 */         results.tojstring(2));
/*     */     } catch (LuaError luaError) {
/*     */     
/*     */     } finally {
/*     */       Exception exception = null;
/*     */     } 
/*     */   }
/*     */   public final class LuaJLuaArchitecture$$anonfun$1 extends AbstractFunction1<Object, LuaValue> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final LuaValue apply(Object value) {
/*     */       return ScalaClosure$.MODULE$.toLuaValue(value);
/*     */     }
/*     */     public LuaJLuaArchitecture$$anonfun$1(LuaJLuaArchitecture $outer) {} }
/*     */   private final boolean isInnerError$1(Varargs results$1) {
/*     */     return (results$1.type(2) == 1 && (results$1.isstring(3) || results$1.isnoneornil(3)));
/*     */   }
/*     */   private final boolean isOuterError$1(Varargs results$1) {
/*     */     return (results$1.isstring(2) || results$1.isnoneornil(2));
/*     */   }
/*     */   public void onSignal() {}
/*     */   public boolean initialize() {
/* 220 */     lua_$eq(JsePlatform.debugGlobals());
/* 221 */     lua().set("package", LuaValue.NIL);
/* 222 */     lua().set("require", LuaValue.NIL);
/* 223 */     lua().set("io", LuaValue.NIL);
/* 224 */     lua().set("os", LuaValue.NIL);
/* 225 */     lua().set("luajava", LuaValue.NIL);
/*     */ 
/*     */     
/* 228 */     lua().set("dofile", LuaValue.NIL);
/* 229 */     lua().set("loadfile", LuaValue.NIL);
/*     */     
/* 231 */     Predef$.MODULE$.refArrayOps((Object[])apis()).foreach((Function1)new LuaJLuaArchitecture$$anonfun$initialize$1(this));
/*     */     
/* 233 */     recomputeMemory(machine().host().internalComponents());
/*     */     
/* 235 */     LuaValue kernel = lua().load(Machine.class.getResourceAsStream((new StringBuilder()).append(Settings$.MODULE$.scriptPath()).append("machine.lua").toString()), "=machine", "t", (LuaValue)lua());
/* 236 */     thread_$eq(new LuaThread(lua(), kernel));
/*     */     
/* 238 */     return true;
/*     */   } public final class LuaJLuaArchitecture$$anonfun$initialize$1 extends AbstractFunction1<LuaJAPI, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(LuaJAPI x$1) {
/*     */       x$1.initialize();
/*     */     } public LuaJLuaArchitecture$$anonfun$initialize$1(LuaJLuaArchitecture $outer) {} }
/*     */   public void onConnect() {}
/*     */   public void close() {
/* 245 */     lua_$eq(null);
/* 246 */     thread_$eq(null);
/* 247 */     synchronizedCall_$eq(null);
/* 248 */     synchronizedResult_$eq(null);
/* 249 */     doneWithInitRun_$eq(false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/* 255 */     if (machine().isRunning()) {
/* 256 */       machine().stop();
/* 257 */       machine().start();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void save(NBTTagCompound nbt) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\LuaJLuaArchitecture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */