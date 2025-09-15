/*     */ package li.cil.oc.server.network;
/*     */ import li.cil.oc.api.network.WirelessEndpoint;
/*     */ import li.cil.oc.util.RTree;
/*     */ import net.minecraft.util.Vec3;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class WirelessNetwork$ {
/*     */   public static final WirelessNetwork$ MODULE$;
/*     */   private final Map<Object, RTree<WirelessEndpoint>> dimensions;
/*     */   
/*     */   public Map<Object, RTree<WirelessEndpoint>> dimensions() {
/*  15 */     return this.dimensions;
/*     */   }
/*     */   @SubscribeEvent
/*     */   public void onWorldUnload(WorldEvent.Unload e) {
/*  19 */     if (!e.world.field_72995_K) {
/*  20 */       dimensions().remove(BoxesRunTime.boxToInteger(e.world.field_73011_w.field_76574_g));
/*     */     }
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onWorldLoad(WorldEvent.Load e) {
/*  26 */     if (!e.world.field_72995_K) {
/*  27 */       dimensions().remove(BoxesRunTime.boxToInteger(e.world.field_73011_w.field_76574_g));
/*     */     }
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onChunkUnload(ChunkEvent.Unload e)
/*     */   {
/*  34 */     scala.collection.convert.WrapAsScala$.MODULE$.collectionAsScalaIterable((e.getChunk()).field_150816_i.values()).foreach((Function1)new WirelessNetwork$$anonfun$onChunkUnload$1()); } public final class WirelessNetwork$$anonfun$onChunkUnload$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Object x0$2) { BoxedUnit boxedUnit; Object object = x0$2;
/*  35 */       if (object instanceof WirelessEndpoint) { Object object1 = object; Boolean bool = BoxesRunTime.boxToBoolean(WirelessNetwork$.MODULE$.remove((WirelessEndpoint)object1)); }
/*  36 */       else { boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*     */       return boxedUnit; }
/*     */      }
/*     */   
/*  41 */   public void add(WirelessEndpoint endpoint) { ((RTree)dimensions().getOrElseUpdate(BoxesRunTime.boxToInteger(dimension(endpoint)), (Function0)new WirelessNetwork$$anonfun$add$1())).add(endpoint); } public final class WirelessNetwork$$anonfun$add$1 extends AbstractFunction0<RTree<WirelessEndpoint>> implements Serializable { public static final long serialVersionUID = 0L; public final RTree<WirelessEndpoint> apply() { return new RTree(li.cil.oc.Settings$.MODULE$.get().rTreeMaxEntries(), (Function1)new WirelessNetwork$$anonfun$add$1$$anonfun$apply$1(this)); } public final class WirelessNetwork$$anonfun$add$1$$anonfun$apply$1 extends AbstractFunction1<WirelessEndpoint, Tuple3<Object, Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple3<Object, Object, Object> apply(WirelessEndpoint endpoint) { return new Tuple3(BoxesRunTime.boxToDouble(endpoint.x() + 0.5D), BoxesRunTime.boxToDouble(endpoint.y() + 0.5D), BoxesRunTime.boxToDouble(endpoint.z() + 0.5D)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public WirelessNetwork$$anonfun$add$1$$anonfun$apply$1(WirelessNetwork$$anonfun$add$1 $outer) {} }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void update(WirelessEndpoint endpoint) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual dimensions : ()Lscala/collection/mutable/Map;
/*     */     //   4: aload_0
/*     */     //   5: aload_1
/*     */     //   6: invokespecial dimension : (Lli/cil/oc/api/network/WirelessEndpoint;)I
/*     */     //   9: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   12: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   17: astore_2
/*     */     //   18: aload_2
/*     */     //   19: instanceof scala/Some
/*     */     //   22: ifeq -> 241
/*     */     //   25: aload_2
/*     */     //   26: checkcast scala/Some
/*     */     //   29: astore_3
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   34: checkcast li/cil/oc/util/RTree
/*     */     //   37: astore #4
/*     */     //   39: aload #4
/*     */     //   41: aload_1
/*     */     //   42: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   45: astore #6
/*     */     //   47: aload #6
/*     */     //   49: instanceof scala/Some
/*     */     //   52: ifeq -> 228
/*     */     //   55: aload #6
/*     */     //   57: checkcast scala/Some
/*     */     //   60: astore #7
/*     */     //   62: aload #7
/*     */     //   64: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   67: checkcast scala/Tuple3
/*     */     //   70: astore #8
/*     */     //   72: aload #8
/*     */     //   74: ifnull -> 228
/*     */     //   77: aload #8
/*     */     //   79: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   82: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   85: dstore #9
/*     */     //   87: aload #8
/*     */     //   89: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   92: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   95: dstore #11
/*     */     //   97: aload #8
/*     */     //   99: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   102: invokestatic unboxToDouble : (Ljava/lang/Object;)D
/*     */     //   105: dstore #13
/*     */     //   107: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   110: aload_1
/*     */     //   111: invokeinterface x : ()I
/*     */     //   116: i2d
/*     */     //   117: ldc2_w 0.5
/*     */     //   120: dadd
/*     */     //   121: dload #9
/*     */     //   123: dsub
/*     */     //   124: invokevirtual abs : (D)D
/*     */     //   127: dstore #16
/*     */     //   129: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   132: aload_1
/*     */     //   133: invokeinterface y : ()I
/*     */     //   138: i2d
/*     */     //   139: ldc2_w 0.5
/*     */     //   142: dadd
/*     */     //   143: dload #11
/*     */     //   145: dsub
/*     */     //   146: invokevirtual abs : (D)D
/*     */     //   149: dstore #18
/*     */     //   151: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   154: aload_1
/*     */     //   155: invokeinterface z : ()I
/*     */     //   160: i2d
/*     */     //   161: ldc2_w 0.5
/*     */     //   164: dadd
/*     */     //   165: dload #13
/*     */     //   167: dsub
/*     */     //   168: invokevirtual abs : (D)D
/*     */     //   171: dstore #20
/*     */     //   173: dload #16
/*     */     //   175: ldc2_w 0.5
/*     */     //   178: dcmpl
/*     */     //   179: ifgt -> 200
/*     */     //   182: dload #18
/*     */     //   184: ldc2_w 0.5
/*     */     //   187: dcmpl
/*     */     //   188: ifgt -> 200
/*     */     //   191: dload #20
/*     */     //   193: ldc2_w 0.5
/*     */     //   196: dcmpl
/*     */     //   197: ifle -> 220
/*     */     //   200: aload #4
/*     */     //   202: aload_1
/*     */     //   203: invokevirtual remove : (Ljava/lang/Object;)Z
/*     */     //   206: pop
/*     */     //   207: aload #4
/*     */     //   209: aload_1
/*     */     //   210: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   213: pop
/*     */     //   214: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   217: goto -> 223
/*     */     //   220: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   223: astore #15
/*     */     //   225: goto -> 233
/*     */     //   228: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   231: astore #15
/*     */     //   233: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   236: astore #5
/*     */     //   238: goto -> 246
/*     */     //   241: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   244: astore #5
/*     */     //   246: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 0
/*     */     //   #46	-> 18
/*     */     //   #47	-> 39
/*     */     //   #48	-> 47
/*     */     //   #49	-> 107
/*     */     //   #50	-> 129
/*     */     //   #51	-> 151
/*     */     //   #52	-> 173
/*     */     //   #53	-> 200
/*     */     //   #54	-> 207
/*     */     //   #52	-> 220
/*     */     //   #48	-> 223
/*     */     //   #56	-> 228
/*     */     //   #47	-> 233
/*     */     //   #58	-> 241
/*     */     //   #45	-> 246
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	247	0	this	Lli/cil/oc/server/network/WirelessNetwork$;
/*     */     //   0	247	1	endpoint	Lli/cil/oc/api/network/WirelessEndpoint;
/*     */     //   39	208	4	tree	Lli/cil/oc/util/RTree;
/*     */     //   87	160	9	x	D
/*     */     //   97	150	11	y	D
/*     */     //   107	140	13	z	D
/*     */     //   129	118	16	dx	D
/*     */     //   151	96	18	dy	D
/*     */     //   173	74	20	dz	D
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean remove(WirelessEndpoint endpoint, int dimension) {
/*     */     boolean bool;
/*  63 */     Option option = dimensions().get(BoxesRunTime.boxToInteger(dimension));
/*  64 */     if (option instanceof Some) { Some some = (Some)option; RTree set = (RTree)some.x(); bool = set.remove(endpoint); }
/*  65 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   } public boolean remove(WirelessEndpoint endpoint) {
/*     */     boolean bool;
/*  70 */     Option option = dimensions().get(BoxesRunTime.boxToInteger(dimension(endpoint)));
/*  71 */     if (option instanceof Some) { Some some = (Some)option; RTree set = (RTree)some.x(); bool = set.remove(endpoint); }
/*  72 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   }
/*     */   
/*  77 */   public Iterable<WirelessEndpoint> computeReachableFrom(WirelessEndpoint endpoint, double strength) { Option option = dimensions().get(BoxesRunTime.boxToInteger(dimension(endpoint)));
/*  78 */     if (option instanceof Some) { Some some = (Some)option; RTree tree = (RTree)some.x(); if (strength > false)
/*  79 */       { double range = strength + true;
/*  80 */         return (Iterable)((TraversableLike)((TraversableLike)((TraversableLike)((TraversableLike)((TraversableLike)tree.query(offset(endpoint, -range), offset(endpoint, range))
/*  81 */           .filter((Function1)new WirelessNetwork$$anonfun$computeReachableFrom$1(endpoint)))
/*  82 */           .map((Function1)new WirelessNetwork$$anonfun$computeReachableFrom$2(endpoint), scala.collection.Iterable$.MODULE$.canBuildFrom()))
/*  83 */           .filter((Function1)new WirelessNetwork$$anonfun$computeReachableFrom$3(range)))
/*  84 */           .map((Function1)new WirelessNetwork$$anonfun$computeReachableFrom$4(), scala.collection.Iterable$.MODULE$.canBuildFrom()))
/*     */           
/*  86 */           .filter((Function1)new WirelessNetwork$$anonfun$computeReachableFrom$5(endpoint, strength))).map((Function1)new WirelessNetwork$$anonfun$computeReachableFrom$6(), scala.collection.Iterable$.MODULE$.canBuildFrom()); }  }
/*  87 */      return (Iterable)scala.package$.MODULE$.Iterable().empty(); } public final class WirelessNetwork$$anonfun$computeReachableFrom$1 extends AbstractFunction1<WirelessEndpoint, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final WirelessEndpoint endpoint$1; public final boolean apply(WirelessEndpoint x$1) { WirelessEndpoint wirelessEndpoint = this.endpoint$1; if (x$1 == null) { if (wirelessEndpoint != null); } else if (x$1.equals(wirelessEndpoint)) {  }  } public WirelessNetwork$$anonfun$computeReachableFrom$1(WirelessEndpoint endpoint$1) {} } public final class WirelessNetwork$$anonfun$computeReachableFrom$2 extends AbstractFunction1<WirelessEndpoint, Tuple2<WirelessEndpoint, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final WirelessEndpoint endpoint$1; public final Tuple2<WirelessEndpoint, Object> apply(WirelessEndpoint endpoint) { return WirelessNetwork$.MODULE$.li$cil$oc$server$network$WirelessNetwork$$zipWithSquaredDistance(this.endpoint$1, endpoint); } public WirelessNetwork$$anonfun$computeReachableFrom$2(WirelessEndpoint endpoint$1) {} } public final class WirelessNetwork$$anonfun$computeReachableFrom$3 extends AbstractFunction1<Tuple2<WirelessEndpoint, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final double range$1; public final boolean apply(Tuple2 x$2) { return (x$2._2$mcI$sp() <= this.range$1 * this.range$1); } public WirelessNetwork$$anonfun$computeReachableFrom$3(double range$1) {} }
/*  91 */   private int dimension(WirelessEndpoint endpoint) { return (endpoint.world()).field_73011_w.field_76574_g; } public final class WirelessNetwork$$anonfun$computeReachableFrom$4 extends AbstractFunction1<Tuple2<WirelessEndpoint, Object>, Tuple2<WirelessEndpoint, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Tuple2<WirelessEndpoint, Object> apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) { WirelessEndpoint c = (WirelessEndpoint)tuple2._1(); int distance = tuple2._2$mcI$sp(); return new Tuple2(c, BoxesRunTime.boxToDouble(Math.sqrt(distance))); }  throw new MatchError(tuple2); } } public final class WirelessNetwork$$anonfun$computeReachableFrom$5 extends AbstractFunction1<Tuple2<WirelessEndpoint, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final WirelessEndpoint endpoint$1; private final double strength$1; public final boolean apply(Tuple2<WirelessEndpoint, Object> info) { return WirelessNetwork$.MODULE$.li$cil$oc$server$network$WirelessNetwork$$isUnobstructed(this.endpoint$1, this.strength$1, info); } public WirelessNetwork$$anonfun$computeReachableFrom$5(WirelessEndpoint endpoint$1, double strength$1) {} } public final class WirelessNetwork$$anonfun$computeReachableFrom$6 extends AbstractFunction1<Tuple2<WirelessEndpoint, Object>, WirelessEndpoint> implements Serializable {
/*  94 */     public static final long serialVersionUID = 0L; public final WirelessEndpoint apply(Tuple2 x$3) { return (WirelessEndpoint)x$3._1(); } } private Tuple3<Object, Object, Object> offset(WirelessEndpoint endpoint, double value) { return new Tuple3(BoxesRunTime.boxToDouble(endpoint.x() + 0.5D + value), BoxesRunTime.boxToDouble(endpoint.y() + 0.5D + value), BoxesRunTime.boxToDouble(endpoint.z() + 0.5D + value)); }
/*     */ 
/*     */   
/*     */   public Tuple2<WirelessEndpoint, Object> li$cil$oc$server$network$WirelessNetwork$$zipWithSquaredDistance(WirelessEndpoint reference, WirelessEndpoint endpoint) {
/*  98 */     int dx = endpoint.x() - reference.x();
/*  99 */     int dy = endpoint.y() - reference.y();
/* 100 */     int dz = endpoint.z() - reference.z();
/* 101 */     return new Tuple2(endpoint, BoxesRunTime.boxToInteger(dx * dx + dy * dy + dz * dz));
/*     */   }
/*     */   public final class WirelessNetwork$$anonfun$li$cil$oc$server$network$WirelessNetwork$$isUnobstructed$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final double gap$1; private final World world$1; private final Vec3 origin$1; private final Vec3 v$1; private final Vec3 side$1; private final Vec3 top$1; private final DoubleRef hardness$1; public final void apply(int i) { apply$mcVI$sp(i); } public WirelessNetwork$$anonfun$li$cil$oc$server$network$WirelessNetwork$$isUnobstructed$1(double gap$1, World world$1, Vec3 origin$1, Vec3 v$1, Vec3 side$1, Vec3 top$1, DoubleRef hardness$1) {} public void apply$mcVI$sp(int i) { double rGap = this.world$1.field_73012_v.nextDouble() * this.gap$1; int rSide = this.world$1.field_73012_v.nextInt(3) - 1; int rTop = this.world$1.field_73012_v.nextInt(3) - 1; int x = (int)(this.origin$1.field_72450_a + this.v$1.field_72450_a * rGap + this.side$1.field_72450_a * rSide + this.top$1.field_72450_a * rTop); int y = (int)(this.origin$1.field_72448_b + this.v$1.field_72448_b * rGap + this.side$1.field_72448_b * rSide + this.top$1.field_72448_b * rTop); int z = (int)(this.origin$1.field_72449_c + this.v$1.field_72449_c * rGap + this.side$1.field_72449_c * rSide + this.top$1.field_72449_c * rTop); if (this.world$1.func_72899_e(x, y, z)) { Option option = scala.Option$.MODULE$.apply(this.world$1.func_147439_a(x, y, z)); if (option instanceof Some) { Some some = (Some)option; Block block = (Block)some.x(); this.hardness$1.elem += block.func_149712_f(this.world$1, x, y, z); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  }
/* 105 */        } } public boolean li$cil$oc$server$network$WirelessNetwork$$isUnobstructed(WirelessEndpoint reference, double strength, Tuple2 info) { Tuple2 tuple2 = info; if (tuple2 != null) { WirelessEndpoint endpoint = (WirelessEndpoint)tuple2._1(); double distance = tuple2._2$mcD$sp(); Tuple2 tuple22 = new Tuple2(endpoint, BoxesRunTime.boxToDouble(distance)), tuple21 = tuple22; WirelessEndpoint wirelessEndpoint1 = (WirelessEndpoint)tuple21._1(); double d1 = tuple21._2$mcD$sp();
/* 106 */       double gap = d1 - true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 115 */       World world = wirelessEndpoint1.world();
/*     */       
/* 117 */       Vec3 origin = Vec3.func_72443_a(reference.x(), reference.y(), reference.z());
/* 118 */       Vec3 target = Vec3.func_72443_a(wirelessEndpoint1.x(), wirelessEndpoint1.y(), wirelessEndpoint1.z());
/*     */ 
/*     */       
/* 121 */       Vec3 delta = subtract(target, origin);
/* 122 */       Vec3 v = delta.func_72432_b();
/*     */ 
/*     */ 
/*     */       
/* 126 */       scala.Predef$.MODULE$.assert((v.field_72448_b != false));
/* 127 */       Vec3 up = (v.field_72450_a == false && v.field_72449_c == false) ? Vec3.func_72443_a(1.0D, 0.0D, 0.0D) : 
/*     */ 
/*     */         
/* 130 */         Vec3.func_72443_a(0.0D, 1.0D, 0.0D);
/*     */       
/* 132 */       Vec3 side = crossProduct(v, up);
/* 133 */       Vec3 top = crossProduct(v, side);
/*     */ 
/*     */       
/* 136 */       DoubleRef hardness = DoubleRef.create(0.0D);
/* 137 */       int samples = scala.math.package$.MODULE$.max(1, (int)scala.math.package$.MODULE$.sqrt(gap)); scala.runtime.RichInt$.MODULE$
/*     */         
/* 139 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), samples).foreach$mVc$sp((Function1)new WirelessNetwork$$anonfun$li$cil$oc$server$network$WirelessNetwork$$isUnobstructed$1(gap, world, origin, v, side, top, hardness));
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
/* 155 */       hardness.elem *= gap / samples;
/*     */ 
/*     */       
/* 158 */       return (gap > false) ? ((strength - gap > hardness.elem)) : true; }
/*     */     
/*     */     throw new MatchError(tuple2); }
/*     */   
/*     */   private Vec3 subtract(Vec3 v1, Vec3 v2) {
/* 163 */     return Vec3.func_72443_a(v1.field_72450_a - v2.field_72450_a, v1.field_72448_b - v2.field_72448_b, v1.field_72449_c - v2.field_72449_c);
/*     */   }
/* 165 */   private Vec3 crossProduct(Vec3 v1, Vec3 v2) { return Vec3.func_72443_a(v1.field_72448_b * v2.field_72449_c - v1.field_72449_c * v2.field_72448_b, v1.field_72449_c * v2.field_72450_a - v1.field_72450_a * v2.field_72449_c, v1.field_72450_a * v2.field_72448_b - v1.field_72448_b * v2.field_72450_a); } private WirelessNetwork$() {
/* 166 */     MODULE$ = this;
/*     */     this.dimensions = scala.collection.mutable.Map$.MODULE$.empty();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\WirelessNetwork$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */