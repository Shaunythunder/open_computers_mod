/*     */ package li.cil.oc.util;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class ExtendedNBT$ {
/*     */   public static final ExtendedNBT$ MODULE$;
/*     */   
/*     */   public NBTTagByte toNbt(boolean value) {
/*  18 */     return new NBTTagByte(value ? 1 : 0);
/*     */   } public NBTTagByte toNbt(byte value) {
/*  20 */     return new NBTTagByte(value);
/*     */   } public NBTTagShort toNbt(short value) {
/*  22 */     return new NBTTagShort(value);
/*     */   } public NBTTagInt toNbt(int value) {
/*  24 */     return new NBTTagInt(value);
/*     */   } public NBTTagLong toNbt(long value) {
/*  26 */     return new NBTTagLong(value);
/*     */   } public NBTTagFloat toNbt(float value) {
/*  28 */     return new NBTTagFloat(value);
/*     */   } public NBTTagDouble toNbt(double value) {
/*  30 */     return new NBTTagDouble(value);
/*     */   } public NBTTagByteArray toNbt(byte[] value) {
/*  32 */     return new NBTTagByteArray(value);
/*     */   } public NBTTagIntArray toNbt(int[] value) {
/*  34 */     return new NBTTagIntArray(value);
/*     */   }
/*  36 */   public NBTTagByteArray toNbt(boolean[] value) { return new NBTTagByteArray((byte[])scala.Predef$.MODULE$.booleanArrayOps(value).map((Function1)new ExtendedNBT$$anonfun$toNbt$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Byte()))); } public final class ExtendedNBT$$anonfun$toNbt$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final byte apply(boolean x$1) { return x$1 ? 1 : 0; }
/*     */      } public NBTTagString toNbt(String value) {
/*  38 */     return new NBTTagString(value);
/*     */   }
/*     */   public NBTTagCompound toNbt(ItemStack value) {
/*  41 */     NBTTagCompound nbt = new NBTTagCompound();
/*  42 */     (value == null) ? BoxedUnit.UNIT : 
/*  43 */       value.func_77955_b(nbt);
/*     */     
/*  45 */     return nbt;
/*     */   }
/*     */   
/*     */   public NBTTagCompound toNbt(Function1 value) {
/*  49 */     NBTTagCompound nbt = new NBTTagCompound();
/*  50 */     value.apply(nbt);
/*  51 */     return nbt;
/*     */   } public final class ExtendedNBT$$anonfun$toNbt$2 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; }
/*     */       else { bool = false; }
/*  55 */        return bool; } } public NBTTagCompound toNbt(Map value) { NBTTagCompound nbt = new NBTTagCompound();
/*  56 */     value.withFilter((Function1)new ExtendedNBT$$anonfun$toNbt$2()).foreach((Function1)new ExtendedNBT$$anonfun$toNbt$3(nbt));
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
/*  70 */     return nbt; } public final class ExtendedNBT$$anonfun$toNbt$3 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { String key = (String)tuple2._1(); Object value = tuple2._2(), object1 = value; if (object1 instanceof Boolean) { boolean bool = BoxesRunTime.unboxToBoolean(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(bool)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof Byte) { byte b = BoxesRunTime.unboxToByte(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(b)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof Short) { short s = BoxesRunTime.unboxToShort(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(s)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof Integer) { int i = BoxesRunTime.unboxToInt(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(i)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof Long) { long l = BoxesRunTime.unboxToLong(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(l)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof Float) { float f = BoxesRunTime.unboxToFloat(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(f)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof Double) { double d = BoxesRunTime.unboxToDouble(object1); this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(d)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof byte[]) { byte[] arrayOfByte = (byte[])object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(arrayOfByte)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof int[]) { int[] arrayOfInt = (int[])object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(arrayOfInt)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof String) { String str = (String)object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(str)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1; this.nbt$1.func_74782_a(key, (NBTBase)ExtendedNBT$.MODULE$.toNbt(itemStack)); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */          BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }
/*     */        throw new MatchError(tuple2); } public ExtendedNBT$$anonfun$toNbt$3(NBTTagCompound nbt$1) {}
/*  74 */   } public final class ExtendedNBT$$anonfun$mapToList$1$1 extends AbstractPartialFunction<Tuple2<?, ?>, Tuple2<Number, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Tuple2<?, ?>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) { Tuple2 tuple2 = x1; if (tuple2 != null)
/*     */       
/*  76 */       { Object k = tuple2._1(), v = tuple2._2(); if (k instanceof Number) { Number number = (Number)k; return (B1)scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(number), v); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Tuple2 x1) { Tuple2 tuple2 = x1; if (tuple2 != null) { Object k = tuple2._1(); if (k instanceof Number)
/*  77 */           return true;  }  return false; } } private final Object[] mapToList$1(Tuple2[] value) { return (Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])value).collect((PartialFunction)new ExtendedNBT$$anonfun$mapToList$1$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))).sortBy((Function1)new ExtendedNBT$$anonfun$mapToList$1$2(), (Ordering)scala.math.Ordering$Int$.MODULE$)).map((Function1)new ExtendedNBT$$anonfun$mapToList$1$3(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Any())); } public final class ExtendedNBT$$anonfun$mapToList$1$2 extends AbstractFunction1<Tuple2<Number, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(Tuple2 x$3) { return ((Number)x$3._1()).intValue(); } } public final class ExtendedNBT$$anonfun$mapToList$1$3 extends AbstractFunction1<Tuple2<Number, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Tuple2 x$4) { return x$4._2(); }
/*     */      } private final IndexedSeq asList$1(Option value) {
/*  79 */     boolean bool = false; Some some = null; Option option = value; if (option instanceof Some) { bool = true; some = (Some)option; Object v = some.x(); if (scala.runtime.ScalaRunTime$.MODULE$.isArray(v, 1)) { Object object = v; return (IndexedSeq)scala.Predef$.MODULE$.genericWrapArray(object); }  }
/*  80 */      if (bool) { Object v = some.x(); if (v instanceof Map) { Map map = (Map)v; return (IndexedSeq)scala.Predef$.MODULE$.genericWrapArray(mapToList$1((Tuple2[])map.toArray(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))); }  }
/*  81 */      if (bool) { Object v = some.x(); if (v instanceof Map) { Map map = (Map)v; return (IndexedSeq)scala.Predef$.MODULE$.genericWrapArray(mapToList$1((Tuple2[])map.toArray(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))); }  }
/*  82 */      if (bool) { Object v = some.x(); if (v instanceof Map) { Map map = (Map)v; return (IndexedSeq)scala.Predef$.MODULE$.genericWrapArray(mapToList$1((Tuple2[])scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(map).toArray(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))); }  }
/*  83 */      if (bool) { Object v = some.x(); if (v instanceof String) { String str = (String)v; return (IndexedSeq)scala.Predef$.MODULE$.wrapByteArray(str.getBytes(Charsets.UTF_8)); }  }
/*  84 */      throw new IllegalArgumentException("Illegal or missing value.");
/*     */   }
/*     */   public final Map li$cil$oc$util$ExtendedNBT$$asMap$1(Option value) {
/*  87 */     boolean bool = false; Some some = null; Option option = value; if (option instanceof Some) { bool = true; some = (Some)option; Object v = some.x(); if (v instanceof Map) { Map map; return map = (Map)v; }  }
/*  88 */      if (bool) { Object v = some.x(); if (v instanceof Map) { Map map = (Map)v; return map.toMap(scala.Predef$.MODULE$.$conforms()); }  }
/*  89 */      if (bool) { Object v = some.x(); if (v instanceof Map) { Map map = (Map)v; return scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(map).toMap(scala.Predef$.MODULE$.$conforms()); }  }
/*  90 */      throw new IllegalArgumentException("Illegal value.");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NBTBase typedMapToNbt(Map map) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   8: invokevirtual li$cil$oc$util$ExtendedNBT$$asMap$1 : (Lscala/Option;)Lscala/collection/immutable/Map;
/*     */     //   11: astore_2
/*     */     //   12: aload_2
/*     */     //   13: ldc 'type'
/*     */     //   15: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   20: astore_3
/*     */     //   21: aload_2
/*     */     //   22: ldc 'value'
/*     */     //   24: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   29: astore #4
/*     */     //   31: iconst_0
/*     */     //   32: istore #5
/*     */     //   34: aconst_null
/*     */     //   35: astore #6
/*     */     //   37: aload_3
/*     */     //   38: astore #7
/*     */     //   40: aload #7
/*     */     //   42: instanceof scala/Some
/*     */     //   45: ifeq -> 962
/*     */     //   48: iconst_1
/*     */     //   49: istore #5
/*     */     //   51: aload #7
/*     */     //   53: checkcast scala/Some
/*     */     //   56: astore #6
/*     */     //   58: aload #6
/*     */     //   60: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #8
/*     */     //   67: instanceof java/lang/Number
/*     */     //   70: ifeq -> 962
/*     */     //   73: aload #8
/*     */     //   75: checkcast java/lang/Number
/*     */     //   78: astore #9
/*     */     //   80: aload #9
/*     */     //   82: invokevirtual intValue : ()I
/*     */     //   85: istore #11
/*     */     //   87: iload #11
/*     */     //   89: tableswitch default -> 148, 1 -> 889, 2 -> 818, 3 -> 747, 4 -> 676, 5 -> 605, 6 -> 534, 7 -> 483, 8 -> 362, 9 -> 307, 10 -> 257, 11 -> 206
/*     */     //   148: new java/lang/IllegalArgumentException
/*     */     //   151: dup
/*     */     //   152: new scala/StringContext
/*     */     //   155: dup
/*     */     //   156: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   159: iconst_2
/*     */     //   160: anewarray java/lang/String
/*     */     //   163: dup
/*     */     //   164: iconst_0
/*     */     //   165: ldc_w 'Unsupported NBT type ''
/*     */     //   168: aastore
/*     */     //   169: dup
/*     */     //   170: iconst_1
/*     */     //   171: ldc_w ''.'
/*     */     //   174: aastore
/*     */     //   175: checkcast [Ljava/lang/Object;
/*     */     //   178: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   181: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   184: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   187: iconst_1
/*     */     //   188: anewarray java/lang/Object
/*     */     //   191: dup
/*     */     //   192: iconst_0
/*     */     //   193: aload #9
/*     */     //   195: aastore
/*     */     //   196: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   199: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   202: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   205: athrow
/*     */     //   206: new net/minecraft/nbt/NBTTagIntArray
/*     */     //   209: dup
/*     */     //   210: aload_0
/*     */     //   211: aload #4
/*     */     //   213: invokespecial asList$1 : (Lscala/Option;)Lscala/collection/IndexedSeq;
/*     */     //   216: new li/cil/oc/util/ExtendedNBT$$anonfun$typedMapToNbt$6
/*     */     //   219: dup
/*     */     //   220: invokespecial <init> : ()V
/*     */     //   223: getstatic scala/collection/IndexedSeq$.MODULE$ : Lscala/collection/IndexedSeq$;
/*     */     //   226: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   229: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   234: checkcast scala/collection/TraversableOnce
/*     */     //   237: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   240: invokevirtual Int : ()Lscala/reflect/ClassTag;
/*     */     //   243: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   248: checkcast [I
/*     */     //   251: invokespecial <init> : ([I)V
/*     */     //   254: goto -> 946
/*     */     //   257: new net/minecraft/nbt/NBTTagCompound
/*     */     //   260: dup
/*     */     //   261: invokespecial <init> : ()V
/*     */     //   264: astore #53
/*     */     //   266: aload_0
/*     */     //   267: aload #4
/*     */     //   269: invokevirtual li$cil$oc$util$ExtendedNBT$$asMap$1 : (Lscala/Option;)Lscala/collection/immutable/Map;
/*     */     //   272: astore #54
/*     */     //   274: aload #54
/*     */     //   276: new li/cil/oc/util/ExtendedNBT$$anonfun$typedMapToNbt$4
/*     */     //   279: dup
/*     */     //   280: invokespecial <init> : ()V
/*     */     //   283: invokeinterface withFilter : (Lscala/Function1;)Lscala/collection/generic/FilterMonadic;
/*     */     //   288: new li/cil/oc/util/ExtendedNBT$$anonfun$typedMapToNbt$5
/*     */     //   291: dup
/*     */     //   292: aload #53
/*     */     //   294: invokespecial <init> : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   297: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   302: aload #53
/*     */     //   304: goto -> 946
/*     */     //   307: new net/minecraft/nbt/NBTTagList
/*     */     //   310: dup
/*     */     //   311: invokespecial <init> : ()V
/*     */     //   314: astore #52
/*     */     //   316: aload_0
/*     */     //   317: aload #4
/*     */     //   319: invokespecial asList$1 : (Lscala/Option;)Lscala/collection/IndexedSeq;
/*     */     //   322: new li/cil/oc/util/ExtendedNBT$$anonfun$typedMapToNbt$2
/*     */     //   325: dup
/*     */     //   326: invokespecial <init> : ()V
/*     */     //   329: getstatic scala/collection/IndexedSeq$.MODULE$ : Lscala/collection/IndexedSeq$;
/*     */     //   332: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   335: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   340: checkcast scala/collection/IterableLike
/*     */     //   343: new li/cil/oc/util/ExtendedNBT$$anonfun$typedMapToNbt$3
/*     */     //   346: dup
/*     */     //   347: aload #52
/*     */     //   349: invokespecial <init> : (Lnet/minecraft/nbt/NBTTagList;)V
/*     */     //   352: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   357: aload #52
/*     */     //   359: goto -> 946
/*     */     //   362: new net/minecraft/nbt/NBTTagString
/*     */     //   365: dup
/*     */     //   366: iconst_0
/*     */     //   367: istore #44
/*     */     //   369: aconst_null
/*     */     //   370: astore #45
/*     */     //   372: aload #4
/*     */     //   374: astore #46
/*     */     //   376: aload #46
/*     */     //   378: instanceof scala/Some
/*     */     //   381: ifeq -> 423
/*     */     //   384: iconst_1
/*     */     //   385: istore #44
/*     */     //   387: aload #46
/*     */     //   389: checkcast scala/Some
/*     */     //   392: astore #45
/*     */     //   394: aload #45
/*     */     //   396: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   399: astore #47
/*     */     //   401: aload #47
/*     */     //   403: instanceof java/lang/String
/*     */     //   406: ifeq -> 423
/*     */     //   409: aload #47
/*     */     //   411: checkcast java/lang/String
/*     */     //   414: astore #48
/*     */     //   416: aload #48
/*     */     //   418: astore #49
/*     */     //   420: goto -> 464
/*     */     //   423: iload #44
/*     */     //   425: ifeq -> 472
/*     */     //   428: aload #45
/*     */     //   430: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   433: astore #50
/*     */     //   435: aload #50
/*     */     //   437: instanceof [B
/*     */     //   440: ifeq -> 472
/*     */     //   443: aload #50
/*     */     //   445: checkcast [B
/*     */     //   448: astore #51
/*     */     //   450: new java/lang/String
/*     */     //   453: dup
/*     */     //   454: aload #51
/*     */     //   456: getstatic com/google/common/base/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   459: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */     //   462: astore #49
/*     */     //   464: aload #49
/*     */     //   466: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   469: goto -> 946
/*     */     //   472: new java/lang/IllegalArgumentException
/*     */     //   475: dup
/*     */     //   476: ldc_w 'Illegal or missing value.'
/*     */     //   479: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   482: athrow
/*     */     //   483: new net/minecraft/nbt/NBTTagByteArray
/*     */     //   486: dup
/*     */     //   487: aload_0
/*     */     //   488: aload #4
/*     */     //   490: invokespecial asList$1 : (Lscala/Option;)Lscala/collection/IndexedSeq;
/*     */     //   493: new li/cil/oc/util/ExtendedNBT$$anonfun$typedMapToNbt$1
/*     */     //   496: dup
/*     */     //   497: invokespecial <init> : ()V
/*     */     //   500: getstatic scala/collection/IndexedSeq$.MODULE$ : Lscala/collection/IndexedSeq$;
/*     */     //   503: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   506: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   511: checkcast scala/collection/TraversableOnce
/*     */     //   514: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   517: invokevirtual Byte : ()Lscala/reflect/ClassTag;
/*     */     //   520: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */     //   525: checkcast [B
/*     */     //   528: invokespecial <init> : ([B)V
/*     */     //   531: goto -> 946
/*     */     //   534: new net/minecraft/nbt/NBTTagDouble
/*     */     //   537: dup
/*     */     //   538: aload #4
/*     */     //   540: astore #38
/*     */     //   542: aload #38
/*     */     //   544: instanceof scala/Some
/*     */     //   547: ifeq -> 594
/*     */     //   550: aload #38
/*     */     //   552: checkcast scala/Some
/*     */     //   555: astore #39
/*     */     //   557: aload #39
/*     */     //   559: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   562: astore #40
/*     */     //   564: aload #40
/*     */     //   566: instanceof java/lang/Number
/*     */     //   569: ifeq -> 594
/*     */     //   572: aload #40
/*     */     //   574: checkcast java/lang/Number
/*     */     //   577: astore #41
/*     */     //   579: aload #41
/*     */     //   581: invokevirtual doubleValue : ()D
/*     */     //   584: dstore #42
/*     */     //   586: dload #42
/*     */     //   588: invokespecial <init> : (D)V
/*     */     //   591: goto -> 946
/*     */     //   594: new java/lang/IllegalArgumentException
/*     */     //   597: dup
/*     */     //   598: ldc_w 'Illegal or missing value.'
/*     */     //   601: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   604: athrow
/*     */     //   605: new net/minecraft/nbt/NBTTagFloat
/*     */     //   608: dup
/*     */     //   609: aload #4
/*     */     //   611: astore #33
/*     */     //   613: aload #33
/*     */     //   615: instanceof scala/Some
/*     */     //   618: ifeq -> 665
/*     */     //   621: aload #33
/*     */     //   623: checkcast scala/Some
/*     */     //   626: astore #34
/*     */     //   628: aload #34
/*     */     //   630: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   633: astore #35
/*     */     //   635: aload #35
/*     */     //   637: instanceof java/lang/Number
/*     */     //   640: ifeq -> 665
/*     */     //   643: aload #35
/*     */     //   645: checkcast java/lang/Number
/*     */     //   648: astore #36
/*     */     //   650: aload #36
/*     */     //   652: invokevirtual floatValue : ()F
/*     */     //   655: fstore #37
/*     */     //   657: fload #37
/*     */     //   659: invokespecial <init> : (F)V
/*     */     //   662: goto -> 946
/*     */     //   665: new java/lang/IllegalArgumentException
/*     */     //   668: dup
/*     */     //   669: ldc_w 'Illegal or missing value.'
/*     */     //   672: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   675: athrow
/*     */     //   676: new net/minecraft/nbt/NBTTagLong
/*     */     //   679: dup
/*     */     //   680: aload #4
/*     */     //   682: astore #27
/*     */     //   684: aload #27
/*     */     //   686: instanceof scala/Some
/*     */     //   689: ifeq -> 736
/*     */     //   692: aload #27
/*     */     //   694: checkcast scala/Some
/*     */     //   697: astore #28
/*     */     //   699: aload #28
/*     */     //   701: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   704: astore #29
/*     */     //   706: aload #29
/*     */     //   708: instanceof java/lang/Number
/*     */     //   711: ifeq -> 736
/*     */     //   714: aload #29
/*     */     //   716: checkcast java/lang/Number
/*     */     //   719: astore #30
/*     */     //   721: aload #30
/*     */     //   723: invokevirtual longValue : ()J
/*     */     //   726: lstore #31
/*     */     //   728: lload #31
/*     */     //   730: invokespecial <init> : (J)V
/*     */     //   733: goto -> 946
/*     */     //   736: new java/lang/IllegalArgumentException
/*     */     //   739: dup
/*     */     //   740: ldc_w 'Illegal or missing value.'
/*     */     //   743: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   746: athrow
/*     */     //   747: new net/minecraft/nbt/NBTTagInt
/*     */     //   750: dup
/*     */     //   751: aload #4
/*     */     //   753: astore #22
/*     */     //   755: aload #22
/*     */     //   757: instanceof scala/Some
/*     */     //   760: ifeq -> 807
/*     */     //   763: aload #22
/*     */     //   765: checkcast scala/Some
/*     */     //   768: astore #23
/*     */     //   770: aload #23
/*     */     //   772: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   775: astore #24
/*     */     //   777: aload #24
/*     */     //   779: instanceof java/lang/Number
/*     */     //   782: ifeq -> 807
/*     */     //   785: aload #24
/*     */     //   787: checkcast java/lang/Number
/*     */     //   790: astore #25
/*     */     //   792: aload #25
/*     */     //   794: invokevirtual intValue : ()I
/*     */     //   797: istore #26
/*     */     //   799: iload #26
/*     */     //   801: invokespecial <init> : (I)V
/*     */     //   804: goto -> 946
/*     */     //   807: new java/lang/IllegalArgumentException
/*     */     //   810: dup
/*     */     //   811: ldc_w 'Illegal or missing value.'
/*     */     //   814: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   817: athrow
/*     */     //   818: new net/minecraft/nbt/NBTTagShort
/*     */     //   821: dup
/*     */     //   822: aload #4
/*     */     //   824: astore #17
/*     */     //   826: aload #17
/*     */     //   828: instanceof scala/Some
/*     */     //   831: ifeq -> 878
/*     */     //   834: aload #17
/*     */     //   836: checkcast scala/Some
/*     */     //   839: astore #18
/*     */     //   841: aload #18
/*     */     //   843: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   846: astore #19
/*     */     //   848: aload #19
/*     */     //   850: instanceof java/lang/Number
/*     */     //   853: ifeq -> 878
/*     */     //   856: aload #19
/*     */     //   858: checkcast java/lang/Number
/*     */     //   861: astore #20
/*     */     //   863: aload #20
/*     */     //   865: invokevirtual shortValue : ()S
/*     */     //   868: istore #21
/*     */     //   870: iload #21
/*     */     //   872: invokespecial <init> : (S)V
/*     */     //   875: goto -> 946
/*     */     //   878: new java/lang/IllegalArgumentException
/*     */     //   881: dup
/*     */     //   882: ldc_w 'Illegal or missing value.'
/*     */     //   885: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   888: athrow
/*     */     //   889: new net/minecraft/nbt/NBTTagByte
/*     */     //   892: dup
/*     */     //   893: aload #4
/*     */     //   895: astore #12
/*     */     //   897: aload #12
/*     */     //   899: instanceof scala/Some
/*     */     //   902: ifeq -> 951
/*     */     //   905: aload #12
/*     */     //   907: checkcast scala/Some
/*     */     //   910: astore #13
/*     */     //   912: aload #13
/*     */     //   914: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   917: astore #14
/*     */     //   919: aload #14
/*     */     //   921: instanceof java/lang/Number
/*     */     //   924: ifeq -> 951
/*     */     //   927: aload #14
/*     */     //   929: checkcast java/lang/Number
/*     */     //   932: astore #15
/*     */     //   934: aload #15
/*     */     //   936: invokevirtual byteValue : ()B
/*     */     //   939: istore #16
/*     */     //   941: iload #16
/*     */     //   943: invokespecial <init> : (B)V
/*     */     //   946: astore #10
/*     */     //   948: aload #10
/*     */     //   950: areturn
/*     */     //   951: new java/lang/IllegalArgumentException
/*     */     //   954: dup
/*     */     //   955: ldc_w 'Illegal or missing value.'
/*     */     //   958: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   961: athrow
/*     */     //   962: iload #5
/*     */     //   964: ifeq -> 1032
/*     */     //   967: aload #6
/*     */     //   969: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   972: astore #55
/*     */     //   974: new java/lang/IllegalArgumentException
/*     */     //   977: dup
/*     */     //   978: new scala/StringContext
/*     */     //   981: dup
/*     */     //   982: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   985: iconst_2
/*     */     //   986: anewarray java/lang/String
/*     */     //   989: dup
/*     */     //   990: iconst_0
/*     */     //   991: ldc_w 'Illegal NBT type ''
/*     */     //   994: aastore
/*     */     //   995: dup
/*     */     //   996: iconst_1
/*     */     //   997: ldc_w ''.'
/*     */     //   1000: aastore
/*     */     //   1001: checkcast [Ljava/lang/Object;
/*     */     //   1004: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1007: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   1010: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1013: iconst_1
/*     */     //   1014: anewarray java/lang/Object
/*     */     //   1017: dup
/*     */     //   1018: iconst_0
/*     */     //   1019: aload #55
/*     */     //   1021: aastore
/*     */     //   1022: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1025: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   1028: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1031: athrow
/*     */     //   1032: new java/lang/IllegalArgumentException
/*     */     //   1035: dup
/*     */     //   1036: new scala/StringContext
/*     */     //   1039: dup
/*     */     //   1040: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1043: iconst_1
/*     */     //   1044: anewarray java/lang/String
/*     */     //   1047: dup
/*     */     //   1048: iconst_0
/*     */     //   1049: ldc_w 'Missing NBT type.'
/*     */     //   1052: aastore
/*     */     //   1053: checkcast [Ljava/lang/Object;
/*     */     //   1056: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1059: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   1062: getstatic scala/collection/immutable/Nil$.MODULE$ : Lscala/collection/immutable/Nil$;
/*     */     //   1065: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   1068: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1071: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #92	-> 0
/*     */     //   #93	-> 12
/*     */     //   #94	-> 21
/*     */     //   #96	-> 31
/*     */     //   #95	-> 37
/*     */     //   #96	-> 40
/*     */     //   #159	-> 148
/*     */     //   #154	-> 206
/*     */     //   #157	-> 237
/*     */     //   #154	-> 251
/*     */     //   #144	-> 257
/*     */     //   #145	-> 266
/*     */     //   #146	-> 274
/*     */     //   #151	-> 302
/*     */     //   #139	-> 307
/*     */     //   #140	-> 316
/*     */     //   #141	-> 357
/*     */     //   #132	-> 362
/*     */     //   #133	-> 366
/*     */     //   #132	-> 372
/*     */     //   #133	-> 376
/*     */     //   #132	-> 423
/*     */     //   #134	-> 428
/*     */     //   #132	-> 464
/*     */     //   #135	-> 472
/*     */     //   #127	-> 483
/*     */     //   #130	-> 514
/*     */     //   #127	-> 528
/*     */     //   #122	-> 534
/*     */     //   #123	-> 542
/*     */     //   #122	-> 586
/*     */     //   #124	-> 594
/*     */     //   #117	-> 605
/*     */     //   #118	-> 613
/*     */     //   #117	-> 657
/*     */     //   #119	-> 665
/*     */     //   #112	-> 676
/*     */     //   #113	-> 684
/*     */     //   #112	-> 728
/*     */     //   #114	-> 736
/*     */     //   #107	-> 747
/*     */     //   #108	-> 755
/*     */     //   #107	-> 799
/*     */     //   #109	-> 807
/*     */     //   #102	-> 818
/*     */     //   #103	-> 826
/*     */     //   #102	-> 870
/*     */     //   #104	-> 878
/*     */     //   #97	-> 889
/*     */     //   #98	-> 897
/*     */     //   #97	-> 941
/*     */     //   #96	-> 946
/*     */     //   #95	-> 948
/*     */     //   #99	-> 951
/*     */     //   #95	-> 962
/*     */     //   #161	-> 967
/*     */     //   #162	-> 1032
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1072	0	this	Lli/cil/oc/util/ExtendedNBT$;
/*     */     //   0	1072	1	map	Lscala/collection/immutable/Map;
/*     */     //   12	938	2	typeAndValue	Lscala/collection/immutable/Map;
/*     */     //   21	929	3	nbtType	Lscala/Option;
/*     */     //   31	919	4	nbtValue	Lscala/Option;
/*     */     //   65	1007	8	n	Ljava/lang/Object;
/*     */     //   266	38	53	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   274	30	54	values	Lscala/collection/immutable/Map;
/*     */     //   316	43	52	list	Lnet/minecraft/nbt/NBTTagList;
/*     */     //   401	671	47	v	Ljava/lang/Object;
/*     */     //   435	637	50	v	Ljava/lang/Object;
/*     */     //   564	508	40	v	Ljava/lang/Object;
/*     */     //   635	437	35	v	Ljava/lang/Object;
/*     */     //   706	366	29	v	Ljava/lang/Object;
/*     */     //   777	295	24	v	Ljava/lang/Object;
/*     */     //   848	224	19	v	Ljava/lang/Object;
/*     */     //   919	153	14	v	Ljava/lang/Object;
/*     */     //   974	98	55	t	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$1
/*     */     extends AbstractFunction1<Object, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final byte apply(Object x0$1) {
/* 127 */       Object object = x0$1;
/* 128 */       if (object instanceof Number) { Number number = (Number)object; return number.byteValue(); }
/* 129 */        throw new IllegalArgumentException("Illegal value.");
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$2
/*     */     extends AbstractFunction1<Object, Map<scala.runtime.Nothing$, Object>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Map<scala.runtime.Nothing$, Object> apply(Object v) {
/* 140 */       return ExtendedNBT$.MODULE$.li$cil$oc$util$ExtendedNBT$$asMap$1(scala.Option$.MODULE$.apply(v)); } } public final class ExtendedNBT$$anonfun$typedMapToNbt$3 extends AbstractFunction1<Map<scala.runtime.Nothing$, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagList list$1; public final void apply(Map<?, ?> v) { this.list$1.func_74742_a(ExtendedNBT$.MODULE$.typedMapToNbt(v)); }
/*     */     
/*     */     public ExtendedNBT$$anonfun$typedMapToNbt$3(NBTTagList list$1) {} }
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$4 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool;
/* 146 */       Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class ExtendedNBT$$anonfun$typedMapToNbt$5 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final void apply(Tuple2 x$5) { Tuple2 tuple2 = x$5; if (tuple2 != null) { String name = (String)tuple2._1(); Object entry = tuple2._2(); try { return; }
/* 147 */         finally { Exception exception = null; (new String[3])[0] = "Error converting entry '"; (new String[3])[1] = "': "; (new String[3])[2] = ""; }
/*     */          }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */      public ExtendedNBT$$anonfun$typedMapToNbt$5(NBTTagCompound nbt$2) {} }
/*     */   public final class ExtendedNBT$$anonfun$typedMapToNbt$6 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final int apply(Object x0$2) {
/* 154 */       Object object = x0$2;
/* 155 */       if (object instanceof Number) { Number number = (Number)object; return number.intValue(); }
/* 156 */        throw new IllegalArgumentException();
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterable<NBTTagByte> booleanIterableToNbt(Iterable value)
/*     */   {
/* 166 */     return (Iterable<NBTTagByte>)value.map((Function1)new ExtendedNBT$$anonfun$booleanIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$booleanIterableToNbt$1 extends AbstractFunction1<Object, NBTTagByte> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagByte apply(boolean value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 168 */   public Iterable<NBTTagByte> byteIterableToNbt(Iterable value) { return (Iterable<NBTTagByte>)value.map((Function1)new ExtendedNBT$$anonfun$byteIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$byteIterableToNbt$1 extends AbstractFunction1<Object, NBTTagByte> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagByte apply(byte value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 170 */   public Iterable<NBTTagShort> shortIterableToNbt(Iterable value) { return (Iterable<NBTTagShort>)value.map((Function1)new ExtendedNBT$$anonfun$shortIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$shortIterableToNbt$1 extends AbstractFunction1<Object, NBTTagShort> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagShort apply(short value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 172 */   public Iterable<NBTTagInt> intIterableToNbt(Iterable value) { return (Iterable<NBTTagInt>)value.map((Function1)new ExtendedNBT$$anonfun$intIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$intIterableToNbt$1 extends AbstractFunction1<Object, NBTTagInt> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagInt apply(int value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 174 */   public Iterable<NBTTagIntArray> intArrayIterableToNbt(Iterable value) { return (Iterable<NBTTagIntArray>)value.map((Function1)new ExtendedNBT$$anonfun$intArrayIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$intArrayIterableToNbt$1 extends AbstractFunction1<int[], NBTTagIntArray> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagIntArray apply(int[] value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 176 */   public Iterable<NBTTagLong> longIterableToNbt(Iterable value) { return (Iterable<NBTTagLong>)value.map((Function1)new ExtendedNBT$$anonfun$longIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$longIterableToNbt$1 extends AbstractFunction1<Object, NBTTagLong> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagLong apply(long value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 178 */   public Iterable<NBTTagFloat> floatIterableToNbt(Iterable value) { return (Iterable<NBTTagFloat>)value.map((Function1)new ExtendedNBT$$anonfun$floatIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$floatIterableToNbt$1 extends AbstractFunction1<Object, NBTTagFloat> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagFloat apply(float value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 180 */   public Iterable<NBTTagDouble> doubleIterableToNbt(Iterable value) { return (Iterable<NBTTagDouble>)value.map((Function1)new ExtendedNBT$$anonfun$doubleIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$doubleIterableToNbt$1 extends AbstractFunction1<Object, NBTTagDouble> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagDouble apply(double value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 182 */   public Iterable<NBTTagByteArray> byteArrayIterableToNbt(Iterable value) { return (Iterable<NBTTagByteArray>)value.map((Function1)new ExtendedNBT$$anonfun$byteArrayIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$byteArrayIterableToNbt$1 extends AbstractFunction1<byte[], NBTTagByteArray> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagByteArray apply(byte[] value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 184 */   public Iterable<NBTTagString> stringIterableToNbt(Iterable value) { return (Iterable<NBTTagString>)value.map((Function1)new ExtendedNBT$$anonfun$stringIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$stringIterableToNbt$1 extends AbstractFunction1<String, NBTTagString> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagString apply(String value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 186 */   public Iterable<NBTTagCompound> writableIterableToNbt(Iterable value) { return (Iterable<NBTTagCompound>)value.map((Function1)new ExtendedNBT$$anonfun$writableIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$writableIterableToNbt$1 extends AbstractFunction1<Function1<NBTTagCompound, BoxedUnit>, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(Function1<NBTTagCompound, BoxedUnit> value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      }
/* 188 */   public Iterable<NBTTagCompound> itemStackIterableToNbt(Iterable value) { return (Iterable<NBTTagCompound>)value.map((Function1)new ExtendedNBT$$anonfun$itemStackIterableToNbt$1(), scala.collection.Iterable$.MODULE$.canBuildFrom()); } public final class ExtendedNBT$$anonfun$itemStackIterableToNbt$1 extends AbstractFunction1<ItemStack, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(ItemStack value) { return ExtendedNBT$.MODULE$.toNbt(value); }
/*     */      } public ExtendedNBT.ExtendedNBTBase extendNBTBase(NBTBase nbt) {
/* 190 */     return new ExtendedNBT.ExtendedNBTBase(nbt);
/*     */   } public ExtendedNBT.ExtendedNBTTagCompound extendNBTTagCompound(NBTTagCompound nbt) {
/* 192 */     return new ExtendedNBT.ExtendedNBTTagCompound(nbt);
/*     */   } public ExtendedNBT.ExtendedNBTTagList extendNBTTagList(NBTTagList nbt) {
/* 194 */     return new ExtendedNBT.ExtendedNBTTagList(nbt);
/*     */   }
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
/*     */   private ExtendedNBT$() {
/* 289 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedNBT$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */