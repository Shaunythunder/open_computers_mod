/*    */ package li.cil.oc.integration.nei;
/*    */ 
/*    */ import li.cil.oc.api.driver.Block;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.Iterable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001]4A!\001\002\001\033\t\0212)\0317mE\006\0347\016R8d\021\006tG\r\\3s\025\t\031A!A\002oK&T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\ty\001#D\001\003\023\t\t\"AA\tQC\036,G-V:bO\026D\025M\0343mKJD\021b\005\001\003\002\003\006I\001\006\023\002\013A\fw-Z:\021\007UA\"$D\001\027\025\0059\022!B:dC2\f\027BA\r\027\005\031y\005\017^5p]B\031QcG\017\n\005q1\"!B!se\006L\bC\001\020\"\035\t)r$\003\002!-\0051\001K]3eK\032L!AI\022\003\rM#(/\0338h\025\t\001c#\003\002\024!!)a\005\001C\001O\0051A(\0338jiz\"\"\001K\025\021\005=\001\001\"B\n&\001\004!\002\"\002\024\001\t\003YC#\001\025\t\0175\002!\031!C\005]\005QAi\\2QCR$XM\0358\026\003=\002\"\001M\033\016\003ER!AM\032\002\0215\fGo\0315j]\036T!\001\016\f\002\tU$\030\016\\\005\003mE\022QAU3hKbDa\001\017\001!\002\023y\023a\003#pGB\013G\017^3s]\002BqA\017\001C\002\023%a&\001\006WKb\004\026\r\036;fe:Da\001\020\001!\002\023y\023a\003,fqB\013G\017^3s]\002BQA\020\001\005B}\nQbZ3u%\026\034\027\016]3OC6,G#\001!\021\005\0053U\"\001\"\013\005\r#\025\001\0027b]\036T\021!R\001\005U\0064\030-\003\002#\005\")\001\n\001C!\023\006yq-\032;Vg\006<W\rS1oI2,'\017F\002K'V\003\"aS)\016\0031S!!\024(\002\rI,7-\0339f\025\t\031qJC\001Q\003-\031w\016Z3dQ&\0347.\0328\n\005Ic%!D%Vg\006<W\rS1oI2,'\017C\003U\017\002\007Q$A\003j]B,H\017C\003W\017\002\007q+A\006j]\036\024X\rZ5f]R\034\bcA\013Y5&\021\021L\006\002\013yI,\007/Z1uK\022t\004CA\013\\\023\tafC\001\004B]f\024VM\032\005\006=\002!IaX\001\rO\026$8)\0317mE\006\0347n\035\013\003A\032\0042!\0313\036\033\005\021'BA2\027\003)\031w\016\0347fGRLwN\\\005\003K\n\024\001\"\023;fe\006\024G.\032\005\006Ov\003\r\001[\001\004K:4\bGA5o!\rq\"\016\\\005\003W\016\022Qa\0217bgN\004\"!\0348\r\001\021IqNZA\001\002\003\025\t\001\035\002\004?\022\n\024CA9u!\t)\"/\003\002t-\t9aj\034;iS:<\007CA\013v\023\t1hCA\002B]f\004")
/*    */ public class CallbackDocHandler extends PagedUsageHandler {
/*    */   private final Regex li$cil$oc$integration$nei$CallbackDocHandler$$DocPattern;
/*    */   
/* 15 */   public CallbackDocHandler(Option<String[]> pages) { super(pages);
/*    */ 
/*    */     
/* 18 */     this.li$cil$oc$integration$nei$CallbackDocHandler$$DocPattern = (new StringOps(Predef$.MODULE$.augmentString("(?s)^function(\\(.*?\\).*?) -- (.*)$"))).r();
/*    */     
/* 20 */     this.li$cil$oc$integration$nei$CallbackDocHandler$$VexPattern = (new StringOps(Predef$.MODULE$.augmentString("(?s)^function(\\(.*?\\).*?); (.*)$"))).r(); } private final Regex li$cil$oc$integration$nei$CallbackDocHandler$$VexPattern; public CallbackDocHandler() { this((Option<String[]>)None$.MODULE$); } public Regex li$cil$oc$integration$nei$CallbackDocHandler$$DocPattern() { return this.li$cil$oc$integration$nei$CallbackDocHandler$$DocPattern; } public Regex li$cil$oc$integration$nei$CallbackDocHandler$$VexPattern() { return this.li$cil$oc$integration$nei$CallbackDocHandler$$VexPattern; }
/*    */   
/* 22 */   public String getRecipeName() { return "OpenComputers API"; } public IUsageHandler getUsageHandler(String input, Seq ingredients) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'item'
/*    */     //   3: astore_3
/*    */     //   4: dup
/*    */     //   5: ifnonnull -> 16
/*    */     //   8: pop
/*    */     //   9: aload_3
/*    */     //   10: ifnull -> 23
/*    */     //   13: goto -> 76
/*    */     //   16: aload_3
/*    */     //   17: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   20: ifeq -> 76
/*    */     //   23: aload_2
/*    */     //   24: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1
/*    */     //   27: dup
/*    */     //   28: aload_0
/*    */     //   29: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler;)V
/*    */     //   32: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*    */     //   35: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*    */     //   38: invokeinterface collect : (Lscala/PartialFunction;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */     //   43: checkcast scala/collection/TraversableOnce
/*    */     //   46: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$2
/*    */     //   49: dup
/*    */     //   50: aload_0
/*    */     //   51: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler;)V
/*    */     //   54: invokeinterface collectFirst : (Lscala/PartialFunction;)Lscala/Option;
/*    */     //   59: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$3
/*    */     //   62: dup
/*    */     //   63: aload_0
/*    */     //   64: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler;)V
/*    */     //   67: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*    */     //   70: checkcast codechicken/nei/recipe/IUsageHandler
/*    */     //   73: goto -> 77
/*    */     //   76: aload_0
/*    */     //   77: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 0
/*    */     //   #26	-> 23
/*    */     //   #51	-> 46
/*    */     //   #53	-> 59
/*    */     //   #55	-> 76
/*    */     //   #25	-> 77
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	78	0	this	Lli/cil/oc/integration/nei/CallbackDocHandler;
/*    */     //   0	78	1	input	Ljava/lang/String;
/*    */     //   0	78	2	ingredients	Lscala/collection/Seq; } public final class CallbackDocHandler$$anonfun$getUsageHandler$1 extends AbstractPartialFunction<Object, Option<CallbackDocHandler>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final <A1, B1> B1 applyOrElse(Object x1, Function1 default) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: astore_3
/*    */       //   2: aload_3
/*    */       //   3: instanceof net/minecraft/item/ItemStack
/*    */       //   6: ifeq -> 380
/*    */       //   9: aload_3
/*    */       //   10: checkcast net/minecraft/item/ItemStack
/*    */       //   13: astore #4
/*    */       //   15: aload #4
/*    */       //   17: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */       //   20: ifnull -> 380
/*    */       //   23: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */       //   26: aload #4
/*    */       //   28: invokestatic environmentsFor : (Lnet/minecraft/item/ItemStack;)Ljava/util/Set;
/*    */       //   31: invokevirtual asScalaSet : (Ljava/util/Set;)Lscala/collection/mutable/Set;
/*    */       //   34: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$1
/*    */       //   37: dup
/*    */       //   38: aload_0
/*    */       //   39: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1;)V
/*    */       //   42: getstatic scala/collection/mutable/Set$.MODULE$ : Lscala/collection/mutable/Set$;
/*    */       //   45: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*    */       //   48: invokeinterface flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */       //   53: checkcast scala/collection/SetLike
/*    */       //   56: invokeinterface toBuffer : ()Lscala/collection/mutable/Buffer;
/*    */       //   61: astore #6
/*    */       //   63: aload #6
/*    */       //   65: invokeinterface isEmpty : ()Z
/*    */       //   70: ifeq -> 230
/*    */       //   73: aload #6
/*    */       //   75: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */       //   78: getstatic li/cil/oc/server/driver/Registry$.MODULE$ : Lli/cil/oc/server/driver/Registry$;
/*    */       //   81: aload #4
/*    */       //   83: invokevirtual driverFor : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/driver/Item;
/*    */       //   86: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */       //   89: astore #7
/*    */       //   91: aload #7
/*    */       //   93: instanceof scala/Some
/*    */       //   96: ifeq -> 152
/*    */       //   99: aload #7
/*    */       //   101: checkcast scala/Some
/*    */       //   104: astore #8
/*    */       //   106: aload #8
/*    */       //   108: invokevirtual x : ()Ljava/lang/Object;
/*    */       //   111: checkcast li/cil/oc/api/driver/Item
/*    */       //   114: astore #9
/*    */       //   116: aload #9
/*    */       //   118: instanceof li/cil/oc/api/driver/EnvironmentAware
/*    */       //   121: ifeq -> 152
/*    */       //   124: aload #9
/*    */       //   126: astore #10
/*    */       //   128: aload_0
/*    */       //   129: getfield $outer : Lli/cil/oc/integration/nei/CallbackDocHandler;
/*    */       //   132: aload #10
/*    */       //   134: checkcast li/cil/oc/api/driver/EnvironmentAware
/*    */       //   137: aload #4
/*    */       //   139: invokeinterface providedEnvironment : (Lnet/minecraft/item/ItemStack;)Ljava/lang/Class;
/*    */       //   144: invokevirtual li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks : (Ljava/lang/Class;)Lscala/collection/Iterable;
/*    */       //   147: astore #11
/*    */       //   149: goto -> 220
/*    */       //   152: getstatic li/cil/oc/server/driver/Registry$.MODULE$ : Lli/cil/oc/server/driver/Registry$;
/*    */       //   155: invokevirtual blocks : ()Lscala/collection/mutable/ArrayBuffer;
/*    */       //   158: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$1
/*    */       //   161: dup
/*    */       //   162: aload_0
/*    */       //   163: aload #4
/*    */       //   165: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1;Lnet/minecraft/item/ItemStack;)V
/*    */       //   168: getstatic scala/collection/mutable/ArrayBuffer$.MODULE$ : Lscala/collection/mutable/ArrayBuffer$;
/*    */       //   171: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*    */       //   174: invokevirtual collect : (Lscala/PartialFunction;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */       //   177: checkcast scala/collection/TraversableLike
/*    */       //   180: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$2
/*    */       //   183: dup
/*    */       //   184: aload_0
/*    */       //   185: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1;)V
/*    */       //   188: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*    */       //   193: checkcast scala/collection/TraversableLike
/*    */       //   196: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$3
/*    */       //   199: dup
/*    */       //   200: aload_0
/*    */       //   201: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1;)V
/*    */       //   204: getstatic scala/collection/mutable/ArrayBuffer$.MODULE$ : Lscala/collection/mutable/ArrayBuffer$;
/*    */       //   207: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*    */       //   210: invokeinterface flatMap : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*    */       //   215: checkcast scala/collection/TraversableOnce
/*    */       //   218: astore #11
/*    */       //   220: aload #11
/*    */       //   222: invokeinterface $plus$plus$eq : (Lscala/collection/TraversableOnce;)Lscala/collection/generic/Growable;
/*    */       //   227: goto -> 233
/*    */       //   230: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */       //   233: pop
/*    */       //   234: aload #6
/*    */       //   236: invokeinterface nonEmpty : ()Z
/*    */       //   241: ifeq -> 372
/*    */       //   244: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   247: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   250: aload #6
/*    */       //   252: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */       //   255: ldc java/lang/String
/*    */       //   257: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*    */       //   260: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*    */       //   265: checkcast [Ljava/lang/Object;
/*    */       //   268: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */       //   271: getstatic scala/math/Ordering$String$.MODULE$ : Lscala/math/Ordering$String$;
/*    */       //   274: invokeinterface sorted : (Lscala/math/Ordering;)Ljava/lang/Object;
/*    */       //   279: checkcast [Ljava/lang/Object;
/*    */       //   282: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */       //   285: ldc '\\n\\n'
/*    */       //   287: invokeinterface mkString : (Ljava/lang/String;)Ljava/lang/String;
/*    */       //   292: astore #12
/*    */       //   294: new scala/collection/immutable/StringOps
/*    */       //   297: dup
/*    */       //   298: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   301: aload #12
/*    */       //   303: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*    */       //   306: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   309: invokevirtual lines : ()Lscala/collection/Iterator;
/*    */       //   312: bipush #12
/*    */       //   314: invokeinterface grouped : (I)Lscala/collection/Iterator$GroupedIterator;
/*    */       //   319: new li/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$2
/*    */       //   322: dup
/*    */       //   323: aload_0
/*    */       //   324: invokespecial <init> : (Lli/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1;)V
/*    */       //   327: invokevirtual map : (Lscala/Function1;)Lscala/collection/Iterator;
/*    */       //   330: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*    */       //   333: ldc java/lang/String
/*    */       //   335: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*    */       //   338: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*    */       //   343: checkcast [Ljava/lang/String;
/*    */       //   346: astore #13
/*    */       //   348: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */       //   351: new li/cil/oc/integration/nei/CallbackDocHandler
/*    */       //   354: dup
/*    */       //   355: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */       //   358: aload #13
/*    */       //   360: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */       //   363: invokespecial <init> : (Lscala/Option;)V
/*    */       //   366: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */       //   369: goto -> 375
/*    */       //   372: getstatic scala/None$.MODULE$ : Lscala/None$;
/*    */       //   375: astore #5
/*    */       //   377: goto -> 389
/*    */       //   380: aload_2
/*    */       //   381: aload_1
/*    */       //   382: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   387: astore #5
/*    */       //   389: aload #5
/*    */       //   391: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #26	-> 0
/*    */       //   #27	-> 2
/*    */       //   #28	-> 23
/*    */       //   #31	-> 63
/*    */       //   #32	-> 73
/*    */       //   #33	-> 91
/*    */       //   #34	-> 128
/*    */       //   #35	-> 152
/*    */       //   #41	-> 180
/*    */       //   #32	-> 220
/*    */       //   #31	-> 230
/*    */       //   #45	-> 234
/*    */       //   #46	-> 244
/*    */       //   #47	-> 294
/*    */       //   #48	-> 348
/*    */       //   #50	-> 372
/*    */       //   #27	-> 375
/*    */       //   #26	-> 380
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	392	0	this	Lli/cil/oc/integration/nei/CallbackDocHandler$$anonfun$getUsageHandler$1;
/*    */       //   0	392	1	x1	Ljava/lang/Object;
/*    */       //   0	392	2	default	Lscala/Function1;
/*    */       //   63	329	6	callbacks	Lscala/collection/mutable/Buffer;
/*    */       //   116	276	9	driver	Lli/cil/oc/api/driver/Item;
/*    */       //   294	75	12	fullDocumentation	Ljava/lang/String;
/*    */       //   348	21	13	pages	[Ljava/lang/String;
/*    */     }
/* 26 */     public final boolean isDefinedAt(Object x1) { Object object = x1;
/* 27 */       if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; if (itemStack.func_77973_b() != null)
/* 28 */           return true;  }  return false; } public CallbackDocHandler$$anonfun$getUsageHandler$1(CallbackDocHandler $outer) {} public final class CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$1 extends AbstractFunction1<Class<?>, Iterable<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<String> apply(Class<?> env) { return this.$outer.li$cil$oc$integration$nei$CallbackDocHandler$$anonfun$$$outer().li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks(env); }
/*    */       
/*    */       public CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$1(CallbackDocHandler$$anonfun$getUsageHandler$1 $outer) {} }
/*    */     public final class CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$1 extends AbstractPartialFunction<Block, Class<? extends Environment>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */       private final ItemStack x2$1;
/*    */       
/*    */       public final <A1 extends Block, B1> B1 applyOrElse(Block x2, Function1 default) { Object object;
/* 35 */         Block block = x2;
/* 36 */         if (block instanceof DriverTileEntity && block instanceof EnvironmentAware) { DriverTileEntity driverTileEntity = (DriverTileEntity)block;
/* 37 */           object = (driverTileEntity.getTileEntityClass() == null || driverTileEntity.getTileEntityClass().isInterface()) ? 
/*    */             
/* 39 */             null : ((EnvironmentAware)driverTileEntity).providedEnvironment(this.x2$1); }
/* 40 */         else if (block instanceof EnvironmentAware) { Block block1 = block; object = ((EnvironmentAware)block1).providedEnvironment(this.x2$1); } else { object = default.apply(x2); }  return (B1)object; } public final boolean isDefinedAt(Block x2) { boolean bool; Block block = x2; if (block instanceof DriverTileEntity && block instanceof EnvironmentAware) { bool = true; } else if (block instanceof EnvironmentAware) { bool = true; } else { bool = false; }
/* 41 */          return bool; } public CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$1(CallbackDocHandler$$anonfun$getUsageHandler$1 $outer, ItemStack x2$1) {} } public final class CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$2 extends AbstractFunction1<Class<? extends Environment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Class x$1) { return !(x$1 == null); } public CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$2(CallbackDocHandler$$anonfun$getUsageHandler$1 $outer) {} } public final class CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$3 extends AbstractFunction1<Class<?>, Iterable<String>> implements Serializable { public static final long serialVersionUID = 0L; public final Iterable<String> apply(Class<?> env) { return this.$outer.li$cil$oc$integration$nei$CallbackDocHandler$$anonfun$$$outer().li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks(env); }
/*    */       
/*    */       public CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$applyOrElse$3(CallbackDocHandler$$anonfun$getUsageHandler$1 $outer) {} }
/*    */     public final class CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$2 extends AbstractFunction1<Seq<String>, String> implements Serializable { public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final String apply(Seq x$2) {
/* 47 */         return x$2.mkString("\n");
/*    */       } public CallbackDocHandler$$anonfun$getUsageHandler$1$$anonfun$2(CallbackDocHandler$$anonfun$getUsageHandler$1 $outer) {} } }
/*    */   public final class CallbackDocHandler$$anonfun$getUsageHandler$2 extends AbstractPartialFunction<Option<CallbackDocHandler>, CallbackDocHandler> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final <A1 extends Option<CallbackDocHandler>, B1> B1 applyOrElse(Option x3, Function1 default) { Object object;
/* 51 */       Option option = x3;
/* 52 */       if (option instanceof Some) { Some some = (Some)option; CallbackDocHandler handler = (CallbackDocHandler)some.x(); } else { object = default.apply(x3); }  return (B1)object; } public final boolean isDefinedAt(Option x3) { boolean bool; Option option = x3; if (option instanceof Some) { bool = true; } else { bool = false; }
/* 53 */        return bool; } public CallbackDocHandler$$anonfun$getUsageHandler$2(CallbackDocHandler $outer) {} } public final class CallbackDocHandler$$anonfun$getUsageHandler$3 extends AbstractFunction0<CallbackDocHandler> implements Serializable { public static final long serialVersionUID = 0L; public final CallbackDocHandler apply() { return this.$outer; }
/*    */     
/*    */     public CallbackDocHandler$$anonfun$getUsageHandler$3(CallbackDocHandler $outer) {} }
/*    */   
/*    */   public Iterable<String> li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks(Class env) {
/* 58 */     return (env == null) ? 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 75 */       (Iterable<String>)Seq$.MODULE$.empty() : (Iterable<String>)Callbacks$.MODULE$.fromClass(env).map((Function1)new CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1(this), Iterable$.MODULE$.canBuildFrom());
/*    */   }
/*    */   
/*    */   public final class CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1 extends AbstractFunction1<Tuple2<String, Callbacks.Callback>, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final String apply(Tuple2 x0$1) {
/*    */       Tuple2 tuple2 = x0$1;
/*    */       if (tuple2 != null) {
/*    */         Tuple2 tuple22;
/*    */         String name = (String)tuple2._1();
/*    */         Callbacks.Callback callback = (Callbacks.Callback)tuple2._2();
/*    */         String doc = callback.annotation().doc();
/*    */         String str1 = doc;
/*    */         Option option = this.$outer.li$cil$oc$integration$nei$CallbackDocHandler$$DocPattern().unapplySeq(str1);
/*    */         if (!option.isEmpty() && option.get() != null && ((LinearSeqOptimized)option.get()).lengthCompare(2) == 0) {
/*    */           String head = (String)((LinearSeqOptimized)option.get()).apply(0), tail = (String)((LinearSeqOptimized)option.get()).apply(1);
/*    */           tuple22 = new Tuple2((new StringBuilder()).append(name).append(head).toString(), tail);
/*    */         } else {
/*    */           Option option1 = this.$outer.li$cil$oc$integration$nei$CallbackDocHandler$$VexPattern().unapplySeq(str1);
/*    */           if (!option1.isEmpty() && option1.get() != null && ((LinearSeqOptimized)option1.get()).lengthCompare(2) == 0) {
/*    */             String head = (String)((LinearSeqOptimized)option1.get()).apply(0), tail = (String)((LinearSeqOptimized)option1.get()).apply(1);
/*    */             tuple22 = new Tuple2((new StringBuilder()).append(name).append(head).toString(), tail);
/*    */           } else {
/*    */             tuple22 = new Tuple2(name, doc);
/*    */           } 
/*    */         } 
/*    */         Tuple2 tuple21 = tuple22;
/*    */         if (tuple21 != null) {
/*    */           String signature = (String)tuple21._1(), documentation = (String)tuple21._2();
/*    */           Tuple2 tuple24 = new Tuple2(signature, documentation), tuple23 = tuple24;
/*    */           String str2 = (String)tuple23._1(), str3 = (String)tuple23._2();
/*    */         } else {
/*    */           throw new MatchError(tuple21);
/*    */         } 
/*    */         return Strings.isNullOrEmpty(doc) ? name : "JD-Core does not support Kotlin";
/*    */       } 
/*    */       throw new MatchError(tuple2);
/*    */     }
/*    */     
/*    */     public CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1(CallbackDocHandler $outer) {}
/*    */     
/*    */     public final class CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1$$anonfun$apply$1 extends AbstractFunction1<Object, String> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final String apply(Object x$4) {
/*    */         return (new StringBuilder()).append(EnumChatFormatting.BLACK.toString()).append(x$4).toString();
/*    */       }
/*    */       
/*    */       public CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1$$anonfun$apply$1(CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1 $outer) {}
/*    */     }
/*    */     
/*    */     public final class CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1$$anonfun$apply$2 extends AbstractFunction1<Object, String> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final String apply(Object x$5) {
/*    */         return (new StringBuilder()).append("  ").append(x$5).toString();
/*    */       }
/*    */       
/*    */       public CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1$$anonfun$apply$2(CallbackDocHandler$$anonfun$li$cil$oc$integration$nei$CallbackDocHandler$$getCallbacks$1 $outer) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nei\CallbackDocHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */