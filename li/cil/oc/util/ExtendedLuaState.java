/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import java.util.IdentityHashMap;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ import li.cil.repack.com.naef.jnlua.LuaType;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-s!B\001\003\021\003Y\021\001E#yi\026tG-\0323Mk\006\034F/\031;f\025\t\031A!\001\003vi&d'BA\003\007\003\ty7M\003\002\b\021\005\0311-\0337\013\003%\t!\001\\5\004\001A\021A\"D\007\002\005\031)aB\001E\001\037\t\001R\t\037;f]\022,G\rT;b'R\fG/Z\n\003\033A\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007\"B\f\016\t\003A\022A\002\037j]&$h\bF\001\f\021\025QR\002b\001\034\0039)\007\020^3oI2+\030m\025;bi\026$2\001HA$!\tib$D\001\016\r\021qQ\002A\020\024\005y\001\002\002C\021\037\005\013\007I\021\001\022\002\0071,\030-F\001$!\t!S&D\001&\025\t1s%A\003k]2,\030M\003\002)S\005!a.Y3g\025\tQ3&A\002d_6T!\001\f\004\002\rI,\007/Y2l\023\tqSE\001\005Mk\006\034F/\031;f\021!\001dD!A!\002\023\031\023\001\0027vC\002BQa\006\020\005\002I\"\"\001H\032\t\013\005\n\004\031A\022\t\013UrB\021\001\034\002#A,8\017[*dC2\fg)\0368di&|g\016\006\0028uA\021\021\003O\005\003sI\021A!\0268ji\")1\b\016a\001y\005\ta\r\005\003\022{\rz\024B\001 \023\005%1UO\\2uS>t\027\007\005\002\022\001&\021\021I\005\002\004\023:$\b\"B\"\037\t\003!\025!\0039vg\"4\026\r\\;f)\r9TI\023\005\006\r\n\003\raR\001\006m\006dW/\032\t\003#!K!!\023\n\003\007\005s\027\020C\004L\005B\005\t\031\001'\002\t5,Wn\034\t\005\033F;u(D\001O\025\t\031qJC\001Q\003\021Q\027M^1\n\005Is%aD%eK:$\030\016^=ICNDW*\0319\t\013QsB\021A+\002\021A,8\017\033'jgR$Ba\016,YS\")qk\025a\001!\005\031qN\0316\t\013e\033\006\031\001.\002\t1L7\017\036\t\0047\0164gB\001/b\035\ti\006-D\001_\025\ty&\"\001\004=e>|GOP\005\002'%\021!ME\001\ba\006\0347.Y4f\023\t!WM\001\005Ji\026\024\030\r^8s\025\t\021'\003\005\003\022O\036{\024B\0015\023\005\031!V\017\0357fe!)1j\025a\001\031\")1N\bC\001Y\006I\001/^:i)\006\024G.\032\013\006o5t\027q\001\005\006/*\004\r\001\005\005\006_*\004\r\001]\001\004[\006\004\b\007B9{\003\007\001RA];y\003\003q!!E:\n\005Q\024\022A\002)sK\022,g-\003\002wo\n\031Q*\0319\013\005Q\024\002CA={\031\001!\021b\0378\002\002\003\005)\021\001?\003\007}#\023'\005\002~\017B\021\021C`\005\003J\021qAT8uQ&tw\rE\002z\003\007!!\"!\002o\003\003\005\tQ!\001}\005\ryFE\r\005\006\027*\004\r\001\024\005\b\003\027qB\021AA\007\003I!xnU5na2,'*\031<b\037\nTWm\031;\025\007A\ty\001C\004\002\022\005%\001\031A \002\013%tG-\032=\t\017\005Ua\004\"\001\002\030\005\031Bo\\*j[BdWMS1wC>\023'.Z2ugR!\021\021DA\025!\025\tY\"!\n\021\033\t\tiB\003\003\002 \005\005\022!C5n[V$\030M\0317f\025\r\t\031CE\001\013G>dG.Z2uS>t\027\002BA\024\003;\021!\"\0238eKb,GmU3r\021\035\tY#a\005A\002}\nQa\035;beRD\021\"a\f\037#\003%\t!!\r\002'A,8\017\033,bYV,G\005Z3gCVdG\017\n\032\026\005\005M\"f\001'\0026-\022\021q\007\t\005\003s\t\031%\004\002\002<)!\021QHA \003%)hn\0315fG.,GMC\002\002BI\t!\"\0318o_R\fG/[8o\023\021\t)%a\017\003#Ut7\r[3dW\026$g+\031:jC:\034W\r\003\004\002Je\001\raI\001\006gR\fG/\032")
/*     */ public final class ExtendedLuaState {
/*     */   public static ExtendedLuaState extendLuaState(LuaState paramLuaState) {
/*     */     return ExtendedLuaState$.MODULE$.extendLuaState(paramLuaState);
/*     */   }
/*     */   
/*     */   public static class ExtendedLuaState {
/*     */     private final LuaState lua;
/*     */     
/*  22 */     public LuaState lua() { return this.lua; } public ExtendedLuaState(LuaState lua) {}
/*  23 */     public void pushScalaFunction(Function1 f) { lua().pushJavaFunction(new ExtendedLuaState$ExtendedLuaState$$anon$1(this, f)); } public final class ExtendedLuaState$ExtendedLuaState$$anon$1 implements JavaFunction { private final Function1 f$1; public ExtendedLuaState$ExtendedLuaState$$anon$1(ExtendedLuaState.ExtendedLuaState $outer, Function1 f$1) {} public int invoke(LuaState state) {
/*  24 */         return BoxesRunTime.unboxToInt(this.f$1.apply(state));
/*     */       } }
/*     */     public IdentityHashMap<Object, Object> pushValue$default$2() {
/*  27 */       return new IdentityHashMap<>();
/*     */     }
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
/*     */ 
/*     */     
/*     */     public void pushValue(Object value, IdentityHashMap memo) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: invokevirtual size : ()I
/*     */       //   4: iconst_0
/*     */       //   5: if_icmple -> 12
/*     */       //   8: iconst_1
/*     */       //   9: goto -> 13
/*     */       //   12: iconst_0
/*     */       //   13: istore_3
/*     */       //   14: aload_0
/*     */       //   15: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   18: invokevirtual getTop : ()I
/*     */       //   21: istore #4
/*     */       //   23: aload_2
/*     */       //   24: aload_1
/*     */       //   25: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*     */       //   28: ifeq -> 49
/*     */       //   31: aload_0
/*     */       //   32: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   35: aload_2
/*     */       //   36: aload_1
/*     */       //   37: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   40: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   43: invokevirtual pushValue : (I)V
/*     */       //   46: goto -> 931
/*     */       //   49: aload_1
/*     */       //   50: astore #6
/*     */       //   52: aload #6
/*     */       //   54: instanceof scala/math/ScalaNumber
/*     */       //   57: ifeq -> 77
/*     */       //   60: aload #6
/*     */       //   62: checkcast scala/math/ScalaNumber
/*     */       //   65: astore #7
/*     */       //   67: aload #7
/*     */       //   69: invokevirtual underlying : ()Ljava/lang/Object;
/*     */       //   72: astore #8
/*     */       //   74: goto -> 111
/*     */       //   77: aload #6
/*     */       //   79: instanceof java/lang/Object
/*     */       //   82: ifeq -> 96
/*     */       //   85: aload #6
/*     */       //   87: astore #9
/*     */       //   89: aload #9
/*     */       //   91: astore #8
/*     */       //   93: goto -> 111
/*     */       //   96: aload #6
/*     */       //   98: ifnonnull -> 107
/*     */       //   101: aconst_null
/*     */       //   102: astore #8
/*     */       //   104: goto -> 111
/*     */       //   107: aload #6
/*     */       //   109: astore #8
/*     */       //   111: aload #8
/*     */       //   113: astore #5
/*     */       //   115: aload #5
/*     */       //   117: ifnonnull -> 126
/*     */       //   120: iconst_1
/*     */       //   121: istore #10
/*     */       //   123: goto -> 160
/*     */       //   126: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*     */       //   129: aload #5
/*     */       //   131: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   134: ifeq -> 143
/*     */       //   137: iconst_1
/*     */       //   138: istore #10
/*     */       //   140: goto -> 160
/*     */       //   143: aload #5
/*     */       //   145: instanceof scala/runtime/BoxedUnit
/*     */       //   148: ifeq -> 157
/*     */       //   151: iconst_1
/*     */       //   152: istore #10
/*     */       //   154: goto -> 160
/*     */       //   157: iconst_0
/*     */       //   158: istore #10
/*     */       //   160: iload #10
/*     */       //   162: ifeq -> 180
/*     */       //   165: aload_0
/*     */       //   166: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   169: invokevirtual pushNil : ()V
/*     */       //   172: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   175: astore #11
/*     */       //   177: goto -> 916
/*     */       //   180: aload #5
/*     */       //   182: instanceof java/lang/Boolean
/*     */       //   185: ifeq -> 215
/*     */       //   188: aload #5
/*     */       //   190: checkcast java/lang/Boolean
/*     */       //   193: astore #12
/*     */       //   195: aload_0
/*     */       //   196: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   199: aload #12
/*     */       //   201: invokevirtual booleanValue : ()Z
/*     */       //   204: invokevirtual pushBoolean : (Z)V
/*     */       //   207: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   210: astore #11
/*     */       //   212: goto -> 916
/*     */       //   215: aload #5
/*     */       //   217: instanceof java/lang/Byte
/*     */       //   220: ifeq -> 251
/*     */       //   223: aload #5
/*     */       //   225: checkcast java/lang/Byte
/*     */       //   228: astore #13
/*     */       //   230: aload_0
/*     */       //   231: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   234: aload #13
/*     */       //   236: invokevirtual byteValue : ()B
/*     */       //   239: i2l
/*     */       //   240: invokevirtual pushInteger : (J)V
/*     */       //   243: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   246: astore #11
/*     */       //   248: goto -> 916
/*     */       //   251: aload #5
/*     */       //   253: instanceof java/lang/Character
/*     */       //   256: ifeq -> 286
/*     */       //   259: aload #5
/*     */       //   261: checkcast java/lang/Character
/*     */       //   264: astore #14
/*     */       //   266: aload_0
/*     */       //   267: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   270: aload #14
/*     */       //   272: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   275: invokevirtual pushString : (Ljava/lang/String;)V
/*     */       //   278: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   281: astore #11
/*     */       //   283: goto -> 916
/*     */       //   286: aload #5
/*     */       //   288: instanceof java/lang/Short
/*     */       //   291: ifeq -> 322
/*     */       //   294: aload #5
/*     */       //   296: checkcast java/lang/Short
/*     */       //   299: astore #15
/*     */       //   301: aload_0
/*     */       //   302: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   305: aload #15
/*     */       //   307: invokevirtual shortValue : ()S
/*     */       //   310: i2l
/*     */       //   311: invokevirtual pushInteger : (J)V
/*     */       //   314: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   317: astore #11
/*     */       //   319: goto -> 916
/*     */       //   322: aload #5
/*     */       //   324: instanceof java/lang/Integer
/*     */       //   327: ifeq -> 358
/*     */       //   330: aload #5
/*     */       //   332: checkcast java/lang/Integer
/*     */       //   335: astore #16
/*     */       //   337: aload_0
/*     */       //   338: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   341: aload #16
/*     */       //   343: invokevirtual intValue : ()I
/*     */       //   346: i2l
/*     */       //   347: invokevirtual pushInteger : (J)V
/*     */       //   350: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   353: astore #11
/*     */       //   355: goto -> 916
/*     */       //   358: aload #5
/*     */       //   360: instanceof java/lang/Long
/*     */       //   363: ifeq -> 393
/*     */       //   366: aload #5
/*     */       //   368: checkcast java/lang/Long
/*     */       //   371: astore #17
/*     */       //   373: aload_0
/*     */       //   374: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   377: aload #17
/*     */       //   379: invokevirtual longValue : ()J
/*     */       //   382: invokevirtual pushInteger : (J)V
/*     */       //   385: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   388: astore #11
/*     */       //   390: goto -> 916
/*     */       //   393: aload #5
/*     */       //   395: instanceof java/lang/Float
/*     */       //   398: ifeq -> 429
/*     */       //   401: aload #5
/*     */       //   403: checkcast java/lang/Float
/*     */       //   406: astore #18
/*     */       //   408: aload_0
/*     */       //   409: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   412: aload #18
/*     */       //   414: invokevirtual floatValue : ()F
/*     */       //   417: f2d
/*     */       //   418: invokevirtual pushNumber : (D)V
/*     */       //   421: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   424: astore #11
/*     */       //   426: goto -> 916
/*     */       //   429: aload #5
/*     */       //   431: instanceof java/lang/Double
/*     */       //   434: ifeq -> 464
/*     */       //   437: aload #5
/*     */       //   439: checkcast java/lang/Double
/*     */       //   442: astore #19
/*     */       //   444: aload_0
/*     */       //   445: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   448: aload #19
/*     */       //   450: invokevirtual doubleValue : ()D
/*     */       //   453: invokevirtual pushNumber : (D)V
/*     */       //   456: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   459: astore #11
/*     */       //   461: goto -> 916
/*     */       //   464: aload #5
/*     */       //   466: instanceof java/lang/String
/*     */       //   469: ifeq -> 496
/*     */       //   472: aload #5
/*     */       //   474: checkcast java/lang/String
/*     */       //   477: astore #20
/*     */       //   479: aload_0
/*     */       //   480: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   483: aload #20
/*     */       //   485: invokevirtual pushString : (Ljava/lang/String;)V
/*     */       //   488: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   491: astore #11
/*     */       //   493: goto -> 916
/*     */       //   496: aload #5
/*     */       //   498: instanceof [B
/*     */       //   501: ifeq -> 528
/*     */       //   504: aload #5
/*     */       //   506: checkcast [B
/*     */       //   509: astore #21
/*     */       //   511: aload_0
/*     */       //   512: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   515: aload #21
/*     */       //   517: invokevirtual pushByteArray : ([B)V
/*     */       //   520: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   523: astore #11
/*     */       //   525: goto -> 916
/*     */       //   528: getstatic scala/runtime/ScalaRunTime$.MODULE$ : Lscala/runtime/ScalaRunTime$;
/*     */       //   531: aload #5
/*     */       //   533: iconst_1
/*     */       //   534: invokevirtual isArray : (Ljava/lang/Object;I)Z
/*     */       //   537: ifeq -> 600
/*     */       //   540: aload #5
/*     */       //   542: astore #22
/*     */       //   544: aload_0
/*     */       //   545: aload #22
/*     */       //   547: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   550: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   553: aload #22
/*     */       //   555: invokevirtual genericArrayOps : (Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   558: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */       //   561: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */       //   564: ldc scala/Tuple2
/*     */       //   566: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */       //   569: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */       //   572: invokeinterface zipWithIndex : (Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */       //   577: checkcast [Ljava/lang/Object;
/*     */       //   580: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   583: invokeinterface iterator : ()Lscala/collection/Iterator;
/*     */       //   588: aload_2
/*     */       //   589: invokevirtual pushList : (Ljava/lang/Object;Lscala/collection/Iterator;Ljava/util/IdentityHashMap;)V
/*     */       //   592: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   595: astore #11
/*     */       //   597: goto -> 916
/*     */       //   600: aload #5
/*     */       //   602: instanceof li/cil/oc/api/machine/Value
/*     */       //   605: ifeq -> 644
/*     */       //   608: aload #5
/*     */       //   610: checkcast li/cil/oc/api/machine/Value
/*     */       //   613: astore #23
/*     */       //   615: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   618: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   621: invokevirtual allowUserdata : ()Z
/*     */       //   624: ifeq -> 644
/*     */       //   627: aload_0
/*     */       //   628: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   631: aload #23
/*     */       //   633: invokevirtual pushJavaObjectRaw : (Ljava/lang/Object;)V
/*     */       //   636: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   639: astore #11
/*     */       //   641: goto -> 916
/*     */       //   644: aload #5
/*     */       //   646: instanceof scala/Product
/*     */       //   649: ifeq -> 686
/*     */       //   652: aload #5
/*     */       //   654: astore #24
/*     */       //   656: aload_0
/*     */       //   657: aload #24
/*     */       //   659: aload #24
/*     */       //   661: checkcast scala/Product
/*     */       //   664: invokeinterface productIterator : ()Lscala/collection/Iterator;
/*     */       //   669: invokeinterface zipWithIndex : ()Lscala/collection/Iterator;
/*     */       //   674: aload_2
/*     */       //   675: invokevirtual pushList : (Ljava/lang/Object;Lscala/collection/Iterator;Ljava/util/IdentityHashMap;)V
/*     */       //   678: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   681: astore #11
/*     */       //   683: goto -> 916
/*     */       //   686: aload #5
/*     */       //   688: instanceof scala/collection/Seq
/*     */       //   691: ifeq -> 737
/*     */       //   694: aload #5
/*     */       //   696: checkcast scala/collection/Seq
/*     */       //   699: astore #25
/*     */       //   701: aload_0
/*     */       //   702: aload #25
/*     */       //   704: aload #25
/*     */       //   706: getstatic scala/collection/Seq$.MODULE$ : Lscala/collection/Seq$;
/*     */       //   709: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */       //   712: invokeinterface zipWithIndex : (Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */       //   717: checkcast scala/collection/IterableLike
/*     */       //   720: invokeinterface iterator : ()Lscala/collection/Iterator;
/*     */       //   725: aload_2
/*     */       //   726: invokevirtual pushList : (Ljava/lang/Object;Lscala/collection/Iterator;Ljava/util/IdentityHashMap;)V
/*     */       //   729: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   732: astore #11
/*     */       //   734: goto -> 916
/*     */       //   737: aload #5
/*     */       //   739: instanceof java/util/Map
/*     */       //   742: ifeq -> 786
/*     */       //   745: aload #5
/*     */       //   747: checkcast java/util/Map
/*     */       //   750: astore #26
/*     */       //   752: aload_0
/*     */       //   753: aload #26
/*     */       //   755: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */       //   758: aload #26
/*     */       //   760: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*     */       //   763: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   766: invokevirtual $conforms : ()Lscala/Predef$$less$colon$less;
/*     */       //   769: invokeinterface toMap : (Lscala/Predef$$less$colon$less;)Lscala/collection/immutable/Map;
/*     */       //   774: aload_2
/*     */       //   775: invokevirtual pushTable : (Ljava/lang/Object;Lscala/collection/immutable/Map;Ljava/util/IdentityHashMap;)V
/*     */       //   778: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   781: astore #11
/*     */       //   783: goto -> 916
/*     */       //   786: aload #5
/*     */       //   788: instanceof scala/collection/immutable/Map
/*     */       //   791: ifeq -> 818
/*     */       //   794: aload #5
/*     */       //   796: checkcast scala/collection/immutable/Map
/*     */       //   799: astore #27
/*     */       //   801: aload_0
/*     */       //   802: aload #27
/*     */       //   804: aload #27
/*     */       //   806: aload_2
/*     */       //   807: invokevirtual pushTable : (Ljava/lang/Object;Lscala/collection/immutable/Map;Ljava/util/IdentityHashMap;)V
/*     */       //   810: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   813: astore #11
/*     */       //   815: goto -> 916
/*     */       //   818: aload #5
/*     */       //   820: instanceof scala/collection/mutable/Map
/*     */       //   823: ifeq -> 861
/*     */       //   826: aload #5
/*     */       //   828: checkcast scala/collection/mutable/Map
/*     */       //   831: astore #28
/*     */       //   833: aload_0
/*     */       //   834: aload #28
/*     */       //   836: aload #28
/*     */       //   838: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   841: invokevirtual $conforms : ()Lscala/Predef$$less$colon$less;
/*     */       //   844: invokeinterface toMap : (Lscala/Predef$$less$colon$less;)Lscala/collection/immutable/Map;
/*     */       //   849: aload_2
/*     */       //   850: invokevirtual pushTable : (Ljava/lang/Object;Lscala/collection/immutable/Map;Ljava/util/IdentityHashMap;)V
/*     */       //   853: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   856: astore #11
/*     */       //   858: goto -> 916
/*     */       //   861: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   864: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   867: new scala/collection/mutable/StringBuilder
/*     */       //   870: dup
/*     */       //   871: invokespecial <init> : ()V
/*     */       //   874: ldc_w 'Tried to push an unsupported value of type to Lua: '
/*     */       //   877: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   880: aload_1
/*     */       //   881: invokevirtual getClass : ()Ljava/lang/Class;
/*     */       //   884: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   887: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   890: ldc_w '.'
/*     */       //   893: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   896: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   899: invokeinterface warn : (Ljava/lang/String;)V
/*     */       //   904: aload_0
/*     */       //   905: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   908: invokevirtual pushNil : ()V
/*     */       //   911: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   914: astore #11
/*     */       //   916: iload_3
/*     */       //   917: ifne -> 931
/*     */       //   920: aload_0
/*     */       //   921: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */       //   924: iload #4
/*     */       //   926: iconst_1
/*     */       //   927: iadd
/*     */       //   928: invokevirtual setTop : (I)V
/*     */       //   931: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #28	-> 0
/*     */       //   #29	-> 14
/*     */       //   #30	-> 23
/*     */       //   #31	-> 31
/*     */       //   #34	-> 49
/*     */       //   #35	-> 52
/*     */       //   #36	-> 77
/*     */       //   #37	-> 96
/*     */       //   #38	-> 107
/*     */       //   #34	-> 111
/*     */       //   #40	-> 115
/*     */       //   #41	-> 180
/*     */       //   #42	-> 215
/*     */       //   #43	-> 251
/*     */       //   #44	-> 286
/*     */       //   #45	-> 322
/*     */       //   #46	-> 358
/*     */       //   #47	-> 393
/*     */       //   #48	-> 429
/*     */       //   #49	-> 464
/*     */       //   #50	-> 496
/*     */       //   #51	-> 528
/*     */       //   #52	-> 600
/*     */       //   #53	-> 644
/*     */       //   #54	-> 686
/*     */       //   #55	-> 737
/*     */       //   #56	-> 786
/*     */       //   #57	-> 818
/*     */       //   #59	-> 861
/*     */       //   #60	-> 904
/*     */       //   #58	-> 914
/*     */       //   #65	-> 916
/*     */       //   #66	-> 920
/*     */       //   #27	-> 931
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	932	0	this	Lli/cil/oc/util/ExtendedLuaState$ExtendedLuaState;
/*     */       //   0	932	1	value	Ljava/lang/Object;
/*     */       //   0	932	2	memo	Ljava/util/IdentityHashMap;
/*     */       //   14	918	3	recursive	Z
/*     */       //   23	909	4	oldTop	I
/*     */     }
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
/*     */     
/*     */     public void pushList(Object obj, Iterator list, IdentityHashMap memo) {
/*  72 */       lua().newTable();
/*  73 */       int tableIndex = lua().getTop();
/*  74 */       WrapAsScala$.MODULE$.mapAsScalaMap(memo).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(obj), BoxesRunTime.boxToInteger(tableIndex)));
/*  75 */       IntRef count = IntRef.create(0);
/*  76 */       list.foreach((Function1)new ExtendedLuaState$ExtendedLuaState$$anonfun$pushList$1(this, memo, tableIndex, count));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  83 */       lua().pushValue(tableIndex);
/*     */     } public final class ExtendedLuaState$ExtendedLuaState$$anonfun$pushList$1 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final IdentityHashMap memo$1; private final int tableIndex$1; private final IntRef count$1; public final void apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) {
/*     */           Object value = tuple2._1(); int index = tuple2._2$mcI$sp(); this.$outer.pushValue(value, this.memo$1); this.$outer.lua().rawSet(this.tableIndex$1, index + 1); this.count$1.elem++; BoxedUnit boxedUnit = BoxedUnit.UNIT; return;
/*  87 */         }  throw new MatchError(tuple2); } public ExtendedLuaState$ExtendedLuaState$$anonfun$pushList$1(ExtendedLuaState.ExtendedLuaState $outer, IdentityHashMap memo$1, int tableIndex$1, IntRef count$1) {} } public void pushTable(Object obj, Map map, IdentityHashMap memo) { lua().newTable(0, map.size());
/*  88 */       int tableIndex = lua().getTop();
/*  89 */       WrapAsScala$.MODULE$.mapAsScalaMap(memo).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(obj), BoxesRunTime.boxToInteger(tableIndex)));
/*  90 */       map.withFilter((Function1)new ExtendedLuaState$ExtendedLuaState$$anonfun$pushTable$1(this)).foreach((Function1)new ExtendedLuaState$ExtendedLuaState$$anonfun$pushTable$2(this, memo, tableIndex));
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
/* 103 */       lua().pushValue(tableIndex); }
/*     */     public final class ExtendedLuaState$ExtendedLuaState$$anonfun$pushTable$1 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof Object && value instanceof Object)
/* 106 */             return true;  }  return false; } public ExtendedLuaState$ExtendedLuaState$$anonfun$pushTable$1(ExtendedLuaState.ExtendedLuaState $outer) {} } public Object toSimpleJavaObject(int index) { Object object; LuaType luaType = lua().type(index);
/* 107 */       if (LuaType.BOOLEAN.equals(luaType)) { object = BoxesRunTime.boxToBoolean(lua().toBoolean(index)); }
/* 108 */       else if (LuaType.NUMBER.equals(luaType)) { object = lua().isInteger(index) ? BoxesRunTime.boxToLong(lua().toInteger(index)) : BoxesRunTime.boxToDouble(lua().toNumber(index)); }
/* 109 */       else if (LuaType.STRING.equals(luaType)) { object = lua().toByteArray(index); }
/* 110 */       else if (LuaType.TABLE.equals(luaType)) { object = lua().toJavaObject(index, Map.class); }
/* 111 */       else if (LuaType.USERDATA.equals(luaType)) { object = lua().toJavaObjectRaw(index); }
/* 112 */       else { object = null; }  return object; }
/*     */     public final class ExtendedLuaState$ExtendedLuaState$$anonfun$pushTable$2 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final IdentityHashMap memo$2; private final int tableIndex$2; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { Object key = tuple2._1(), value = tuple2._2(); if (key instanceof Object) { Object object = key; if (value instanceof Object) { Object object1 = value; this.$outer.pushValue(object, this.memo$2); int keyIndex = this.$outer.lua().getTop(); this.$outer.pushValue(object1, this.memo$2); this.$outer.lua().pushValue(keyIndex); this.$outer.lua().insert(-2); this.$outer.lua().setTable(this.tableIndex$2); BoxedUnit boxedUnit = (object == null || object instanceof BoxedUnit) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }  }
/*     */            }
/* 116 */          throw new MatchError(tuple2); } public ExtendedLuaState$ExtendedLuaState$$anonfun$pushTable$2(ExtendedLuaState.ExtendedLuaState $outer, IdentityHashMap memo$2, int tableIndex$2) {} } public IndexedSeq<Object> toSimpleJavaObjects(int start) { return (IndexedSeq<Object>)RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(start), lua().getTop()).map((Function1)new ExtendedLuaState$ExtendedLuaState$$anonfun$toSimpleJavaObjects$1(this), IndexedSeq$.MODULE$.canBuildFrom()); } public final class ExtendedLuaState$ExtendedLuaState$$anonfun$toSimpleJavaObjects$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(int index) { return this.$outer.toSimpleJavaObject(index); }
/*     */ 
/*     */       
/*     */       public ExtendedLuaState$ExtendedLuaState$$anonfun$toSimpleJavaObjects$1(ExtendedLuaState.ExtendedLuaState $outer) {} }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedLuaState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */