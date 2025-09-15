/*    */ package li.cil.oc.integration.vanilla;
/*    */ 
/*    */ import li.cil.oc.api.event.GeolyzerEvent;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class EventHandlerVanilla$ {
/*    */   public static final EventHandlerVanilla$ MODULE$;
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onGeolyzerScan(GeolyzerEvent.Scan e) { boolean bool;
/* 18 */     World world = e.host.world();
/* 19 */     BlockPosition blockPos = li.cil.oc.util.BlockPosition$.MODULE$.apply(e.host);
/* 20 */     Object object = e.options.get("includeReplaceable");
/* 21 */     if (object instanceof Boolean) { Boolean bool1 = (Boolean)object; bool = bool1.booleanValue(); }
/* 22 */     else { bool = true; }
/*    */     
/*    */     boolean includeReplaceable = bool;
/* 25 */     byte[] noise = new byte[e.data.length];
/* 26 */     world.field_73012_v.nextBytes(noise);
/*    */     
/* 28 */     scala.Predef$.MODULE$.floatArrayOps((float[])scala.Predef$.MODULE$.byteArrayOps(noise).map((Function1)new EventHandlerVanilla$$anonfun$onGeolyzerScan$2(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Float()))).copyToArray(e.data);
/*    */     
/* 30 */     int w = e.maxX - e.minX + 1;
/* 31 */     int d = e.maxZ - e.minZ + 1; scala.runtime.RichInt$.MODULE$
/* 32 */       .to$extension0(scala.Predef$.MODULE$.intWrapper(e.minY), e.maxY).foreach$mVc$sp((Function1)new EventHandlerVanilla$$anonfun$onGeolyzerScan$1(e, world, blockPos, includeReplaceable, w, d)); } public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$2 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final float apply(byte x$1) { return x$1 / 128.0F / 33.0F; } } public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final GeolyzerEvent.Scan e$1; public final World world$1; public final void apply(int ry) { apply$mcVI$sp(ry); } public final BlockPosition blockPos$1; public final boolean includeReplaceable$1; public final int w$1; public final int d$1; public void apply$mcVI$sp(int ry) { scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(this.e$1.minZ), this.e$1.maxZ).foreach$mVc$sp((Function1)new EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1(this, ry)); } public EventHandlerVanilla$$anonfun$onGeolyzerScan$1(GeolyzerEvent.Scan e$1, World world$1, BlockPosition blockPos$1, boolean includeReplaceable$1, int w$1, int d$1) {} public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int ry$1; public final void apply(int rz) { apply$mcVI$sp(rz); } public void apply$mcVI$sp(int rz) { scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(this.$outer.e$1.minX), this.$outer.e$1.maxX).foreach$mVc$sp((Function1)new EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(this, rz)); } public EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1(EventHandlerVanilla$$anonfun$onGeolyzerScan$1 $outer, int ry$1) {} public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int rz$1; public final void apply(int rx) { apply$mcVI$sp(rx); } public EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1 $outer, int rz$1) {} public void apply$mcVI$sp(int rx) {
/* 33 */           int x = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.x() + rx;
/* 34 */           int y = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.y() + this.$outer.ry$1;
/* 35 */           int z = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.z() + this.rz$1;
/* 36 */           int index = rx - (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.minX + (this.rz$1 - (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.minZ + (this.$outer.ry$1 - (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.minY) * (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).d$1) * (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).w$1;
/* 37 */           if ((this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1.func_72899_e(x, y, z) && !(this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1.func_147437_c(x, y, z))
/* 38 */           { Block block = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1.func_147439_a(x, y, z);
/* 39 */             if (block == null || (!(this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).includeReplaceable$1 && !EventHandlerVanilla$.MODULE$.li$cil$oc$integration$vanilla$EventHandlerVanilla$$isFluid(block) && block.isReplaceable((IBlockAccess)(this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1, (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.x(), (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.y(), (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.z())))
/*    */             
/*    */             { 
/*    */ 
/*    */ 
/*    */ 
/*    */               
/* 46 */               (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] = 0.0F; } else { int dx = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.x() - x; int dy = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.y() - y; int dz = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.z() - z; float distance = (float)scala.math.package$.MODULE$.sqrt((dx * dx + dy * dy + dz * dz)); (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] * distance * li.cil.oc.Settings$.MODULE$.get().geolyzerNoise() + block.func_149712_f((this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1, x, y, z); }
/*    */              }
/* 48 */           else { (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] = 0.0F; }
/*    */         
/*    */         } } } }
/*    */   public boolean li$cil$oc$integration$vanilla$EventHandlerVanilla$$isFluid(Block block) {
/* 52 */     return !(FluidRegistry.lookupFluidForBlock(block) == null);
/*    */   }
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
/*    */   @SubscribeEvent
/*    */   public void onGeolyzerAnalyze(GeolyzerEvent.Analyze e) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield host : Lli/cil/oc/api/network/EnvironmentHost;
/*    */     //   4: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   9: astore_2
/*    */     //   10: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*    */     //   13: aload_1
/*    */     //   14: getfield x : I
/*    */     //   17: aload_1
/*    */     //   18: getfield y : I
/*    */     //   21: aload_1
/*    */     //   22: getfield z : I
/*    */     //   25: aload_2
/*    */     //   26: invokevirtual apply : (IIILnet/minecraft/world/World;)Lli/cil/oc/util/BlockPosition;
/*    */     //   29: astore_3
/*    */     //   30: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   33: aload_2
/*    */     //   34: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   37: aload_3
/*    */     //   38: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*    */     //   41: astore #4
/*    */     //   43: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   46: aload_1
/*    */     //   47: getfield data : Ljava/util/Map;
/*    */     //   50: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   53: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   56: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   59: ldc 'name'
/*    */     //   61: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   64: getstatic net/minecraft/block/Block.field_149771_c : Lnet/minecraft/util/RegistryNamespaced;
/*    */     //   67: aload #4
/*    */     //   69: invokevirtual func_148750_c : (Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   72: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   75: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   80: pop
/*    */     //   81: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   84: aload_1
/*    */     //   85: getfield data : Ljava/util/Map;
/*    */     //   88: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   91: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   94: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   97: ldc_w 'metadata'
/*    */     //   100: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   103: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   106: aload_2
/*    */     //   107: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   110: aload_3
/*    */     //   111: invokevirtual getBlockMetadata : (Lli/cil/oc/util/BlockPosition;)I
/*    */     //   114: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   117: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   120: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   125: pop
/*    */     //   126: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   129: aload_1
/*    */     //   130: getfield data : Ljava/util/Map;
/*    */     //   133: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   136: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   139: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   142: ldc_w 'hardness'
/*    */     //   145: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   148: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   151: aload_2
/*    */     //   152: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   155: aload_3
/*    */     //   156: invokevirtual getBlockHardness : (Lli/cil/oc/util/BlockPosition;)F
/*    */     //   159: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*    */     //   162: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   165: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   170: pop
/*    */     //   171: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   174: aload_1
/*    */     //   175: getfield data : Ljava/util/Map;
/*    */     //   178: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   181: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   184: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   187: ldc_w 'harvestLevel'
/*    */     //   190: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   193: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   196: aload_2
/*    */     //   197: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   200: aload_3
/*    */     //   201: invokevirtual getBlockHarvestLevel : (Lli/cil/oc/util/BlockPosition;)I
/*    */     //   204: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   207: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   210: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   215: pop
/*    */     //   216: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   219: aload_1
/*    */     //   220: getfield data : Ljava/util/Map;
/*    */     //   223: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   226: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   229: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   232: ldc_w 'harvestTool'
/*    */     //   235: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   238: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   241: aload_2
/*    */     //   242: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   245: aload_3
/*    */     //   246: invokevirtual getBlockHarvestTool : (Lli/cil/oc/util/BlockPosition;)Ljava/lang/String;
/*    */     //   249: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   252: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   257: pop
/*    */     //   258: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   261: aload_1
/*    */     //   262: getfield data : Ljava/util/Map;
/*    */     //   265: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   268: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   271: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   274: ldc_w 'color'
/*    */     //   277: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   280: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   283: aload_2
/*    */     //   284: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   287: aload_3
/*    */     //   288: invokevirtual getBlockMapColor : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/material/MapColor;
/*    */     //   291: getfield field_76291_p : I
/*    */     //   294: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   297: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   300: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   305: pop
/*    */     //   306: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */     //   309: invokevirtual get : ()Lli/cil/oc/Settings;
/*    */     //   312: invokevirtual insertIdsInConverters : ()Z
/*    */     //   315: ifeq -> 359
/*    */     //   318: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   321: aload_1
/*    */     //   322: getfield data : Ljava/util/Map;
/*    */     //   325: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   328: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   331: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   334: ldc_w 'id'
/*    */     //   337: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   340: aload #4
/*    */     //   342: invokestatic func_149682_b : (Lnet/minecraft/block/Block;)I
/*    */     //   345: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   348: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   351: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   356: goto -> 362
/*    */     //   359: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   362: pop
/*    */     //   363: aload #4
/*    */     //   365: instanceof net/minecraft/block/BlockCrops
/*    */     //   368: ifne -> 483
/*    */     //   371: aload #4
/*    */     //   373: getstatic net/minecraft/init/Blocks.field_150394_bc : Lnet/minecraft/block/Block;
/*    */     //   376: astore #5
/*    */     //   378: dup
/*    */     //   379: ifnonnull -> 391
/*    */     //   382: pop
/*    */     //   383: aload #5
/*    */     //   385: ifnull -> 483
/*    */     //   388: goto -> 399
/*    */     //   391: aload #5
/*    */     //   393: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   396: ifne -> 483
/*    */     //   399: aload #4
/*    */     //   401: getstatic net/minecraft/init/Blocks.field_150393_bb : Lnet/minecraft/block/Block;
/*    */     //   404: astore #6
/*    */     //   406: dup
/*    */     //   407: ifnonnull -> 419
/*    */     //   410: pop
/*    */     //   411: aload #6
/*    */     //   413: ifnull -> 483
/*    */     //   416: goto -> 427
/*    */     //   419: aload #6
/*    */     //   421: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   424: ifne -> 483
/*    */     //   427: aload #4
/*    */     //   429: getstatic net/minecraft/init/Blocks.field_150459_bM : Lnet/minecraft/block/Block;
/*    */     //   432: astore #7
/*    */     //   434: dup
/*    */     //   435: ifnonnull -> 447
/*    */     //   438: pop
/*    */     //   439: aload #7
/*    */     //   441: ifnull -> 483
/*    */     //   444: goto -> 455
/*    */     //   447: aload #7
/*    */     //   449: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   452: ifne -> 483
/*    */     //   455: aload #4
/*    */     //   457: getstatic net/minecraft/init/Blocks.field_150469_bN : Lnet/minecraft/block/Block;
/*    */     //   460: astore #8
/*    */     //   462: dup
/*    */     //   463: ifnonnull -> 475
/*    */     //   466: pop
/*    */     //   467: aload #8
/*    */     //   469: ifnull -> 483
/*    */     //   472: goto -> 566
/*    */     //   475: aload #8
/*    */     //   477: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   480: ifeq -> 566
/*    */     //   483: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   486: aload_1
/*    */     //   487: getfield data : Ljava/util/Map;
/*    */     //   490: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   493: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   496: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   499: ldc_w 'growth'
/*    */     //   502: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   505: getstatic scala/runtime/RichFloat$.MODULE$ : Lscala/runtime/RichFloat$;
/*    */     //   508: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   511: getstatic scala/runtime/RichFloat$.MODULE$ : Lscala/runtime/RichFloat$;
/*    */     //   514: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   517: aload_2
/*    */     //   518: aload_1
/*    */     //   519: getfield x : I
/*    */     //   522: aload_1
/*    */     //   523: getfield y : I
/*    */     //   526: aload_1
/*    */     //   527: getfield z : I
/*    */     //   530: invokevirtual func_72805_g : (III)I
/*    */     //   533: i2f
/*    */     //   534: ldc_w 7.0
/*    */     //   537: fdiv
/*    */     //   538: invokevirtual floatWrapper : (F)F
/*    */     //   541: fconst_0
/*    */     //   542: invokevirtual max$extension : (FF)F
/*    */     //   545: invokevirtual floatWrapper : (F)F
/*    */     //   548: fconst_1
/*    */     //   549: invokevirtual min$extension : (FF)F
/*    */     //   552: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*    */     //   555: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   558: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   563: goto -> 569
/*    */     //   566: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   569: pop
/*    */     //   570: aload #4
/*    */     //   572: getstatic net/minecraft/init/Blocks.field_150375_by : Lnet/minecraft/block/Block;
/*    */     //   575: astore #9
/*    */     //   577: dup
/*    */     //   578: ifnonnull -> 590
/*    */     //   581: pop
/*    */     //   582: aload #9
/*    */     //   584: ifnull -> 598
/*    */     //   587: goto -> 681
/*    */     //   590: aload #9
/*    */     //   592: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   595: ifeq -> 681
/*    */     //   598: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   601: aload_1
/*    */     //   602: getfield data : Ljava/util/Map;
/*    */     //   605: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   608: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   611: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   614: ldc_w 'growth'
/*    */     //   617: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   620: getstatic scala/runtime/RichFloat$.MODULE$ : Lscala/runtime/RichFloat$;
/*    */     //   623: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   626: getstatic scala/runtime/RichFloat$.MODULE$ : Lscala/runtime/RichFloat$;
/*    */     //   629: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   632: aload_2
/*    */     //   633: aload_1
/*    */     //   634: getfield x : I
/*    */     //   637: aload_1
/*    */     //   638: getfield y : I
/*    */     //   641: aload_1
/*    */     //   642: getfield z : I
/*    */     //   645: invokevirtual func_72805_g : (III)I
/*    */     //   648: iconst_2
/*    */     //   649: ishr
/*    */     //   650: i2f
/*    */     //   651: fconst_2
/*    */     //   652: fdiv
/*    */     //   653: invokevirtual floatWrapper : (F)F
/*    */     //   656: fconst_0
/*    */     //   657: invokevirtual max$extension : (FF)F
/*    */     //   660: invokevirtual floatWrapper : (F)F
/*    */     //   663: fconst_1
/*    */     //   664: invokevirtual min$extension : (FF)F
/*    */     //   667: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*    */     //   670: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   673: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   678: goto -> 684
/*    */     //   681: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   684: pop
/*    */     //   685: aload #4
/*    */     //   687: getstatic net/minecraft/init/Blocks.field_150388_bm : Lnet/minecraft/block/Block;
/*    */     //   690: astore #10
/*    */     //   692: dup
/*    */     //   693: ifnonnull -> 705
/*    */     //   696: pop
/*    */     //   697: aload #10
/*    */     //   699: ifnull -> 713
/*    */     //   702: goto -> 796
/*    */     //   705: aload #10
/*    */     //   707: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   710: ifeq -> 796
/*    */     //   713: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   716: aload_1
/*    */     //   717: getfield data : Ljava/util/Map;
/*    */     //   720: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   723: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   726: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   729: ldc_w 'growth'
/*    */     //   732: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   735: getstatic scala/runtime/RichFloat$.MODULE$ : Lscala/runtime/RichFloat$;
/*    */     //   738: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   741: getstatic scala/runtime/RichFloat$.MODULE$ : Lscala/runtime/RichFloat$;
/*    */     //   744: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   747: aload_2
/*    */     //   748: aload_1
/*    */     //   749: getfield x : I
/*    */     //   752: aload_1
/*    */     //   753: getfield y : I
/*    */     //   756: aload_1
/*    */     //   757: getfield z : I
/*    */     //   760: invokevirtual func_72805_g : (III)I
/*    */     //   763: i2f
/*    */     //   764: ldc_w 3.0
/*    */     //   767: fdiv
/*    */     //   768: invokevirtual floatWrapper : (F)F
/*    */     //   771: fconst_0
/*    */     //   772: invokevirtual max$extension : (FF)F
/*    */     //   775: invokevirtual floatWrapper : (F)F
/*    */     //   778: fconst_1
/*    */     //   779: invokevirtual min$extension : (FF)F
/*    */     //   782: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*    */     //   785: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   788: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   793: goto -> 799
/*    */     //   796: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   799: pop
/*    */     //   800: aload #4
/*    */     //   802: getstatic net/minecraft/init/Blocks.field_150440_ba : Lnet/minecraft/block/Block;
/*    */     //   805: astore #11
/*    */     //   807: dup
/*    */     //   808: ifnonnull -> 820
/*    */     //   811: pop
/*    */     //   812: aload #11
/*    */     //   814: ifnull -> 912
/*    */     //   817: goto -> 828
/*    */     //   820: aload #11
/*    */     //   822: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   825: ifne -> 912
/*    */     //   828: aload #4
/*    */     //   830: getstatic net/minecraft/init/Blocks.field_150423_aK : Lnet/minecraft/block/Block;
/*    */     //   833: astore #12
/*    */     //   835: dup
/*    */     //   836: ifnonnull -> 848
/*    */     //   839: pop
/*    */     //   840: aload #12
/*    */     //   842: ifnull -> 912
/*    */     //   845: goto -> 856
/*    */     //   848: aload #12
/*    */     //   850: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   853: ifne -> 912
/*    */     //   856: aload #4
/*    */     //   858: getstatic net/minecraft/init/Blocks.field_150434_aF : Lnet/minecraft/block/Block;
/*    */     //   861: astore #13
/*    */     //   863: dup
/*    */     //   864: ifnonnull -> 876
/*    */     //   867: pop
/*    */     //   868: aload #13
/*    */     //   870: ifnull -> 912
/*    */     //   873: goto -> 884
/*    */     //   876: aload #13
/*    */     //   878: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   881: ifne -> 912
/*    */     //   884: aload #4
/*    */     //   886: getstatic net/minecraft/init/Blocks.field_150436_aH : Lnet/minecraft/block/Block;
/*    */     //   889: astore #14
/*    */     //   891: dup
/*    */     //   892: ifnonnull -> 904
/*    */     //   895: pop
/*    */     //   896: aload #14
/*    */     //   898: ifnull -> 912
/*    */     //   901: goto -> 947
/*    */     //   904: aload #14
/*    */     //   906: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   909: ifeq -> 947
/*    */     //   912: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   915: aload_1
/*    */     //   916: getfield data : Ljava/util/Map;
/*    */     //   919: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   922: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   925: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   928: ldc_w 'growth'
/*    */     //   931: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   934: fconst_1
/*    */     //   935: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*    */     //   938: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   941: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   946: pop
/*    */     //   947: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 0
/*    */     //   #57	-> 10
/*    */     //   #58	-> 30
/*    */     //   #60	-> 43
/*    */     //   #61	-> 81
/*    */     //   #62	-> 126
/*    */     //   #63	-> 171
/*    */     //   #64	-> 216
/*    */     //   #65	-> 258
/*    */     //   #67	-> 306
/*    */     //   #68	-> 318
/*    */     //   #67	-> 359
/*    */     //   #71	-> 363
/*    */     //   #72	-> 483
/*    */     //   #71	-> 566
/*    */     //   #74	-> 570
/*    */     //   #75	-> 598
/*    */     //   #74	-> 681
/*    */     //   #77	-> 685
/*    */     //   #78	-> 713
/*    */     //   #77	-> 796
/*    */     //   #80	-> 800
/*    */     //   #81	-> 912
/*    */     //   #55	-> 947
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	948	0	this	Lli/cil/oc/integration/vanilla/EventHandlerVanilla$;
/*    */     //   0	948	1	e	Lli/cil/oc/api/event/GeolyzerEvent$Analyze;
/*    */     //   10	938	2	world	Lnet/minecraft/world/World;
/*    */     //   30	918	3	blockPos	Lli/cil/oc/util/BlockPosition;
/*    */     //   43	905	4	block	Lnet/minecraft/block/Block;
/*    */   }
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
/*    */   private EventHandlerVanilla$() {
/* 84 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\EventHandlerVanilla$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */