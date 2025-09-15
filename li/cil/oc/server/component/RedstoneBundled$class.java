/*     */ package li.cil.oc.server.component;
/*     */ import java.util.Map;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.common.tileentity.traits.BundledRedstoneAware;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.MatchError;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class RedstoneBundled$class {
/*     */   public static final Map li$cil$oc$server$component$RedstoneBundled$$deviceInfo(RedstoneBundled $this) {
/*  19 */     (new Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$
/*  20 */       .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "communication");
/*  21 */     (new Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Advanced redstone controller");
/*  22 */     (new Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  23 */     (new Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Rb800-M");
/*  24 */     (new Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), "65536");
/*  25 */     (new Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), "16");
/*     */     return (Map)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[6]));
/*     */   } public static Map getDeviceInfo(RedstoneBundled $this) {
/*  28 */     return WrapAsJava$.MODULE$.mapAsJavaMap((Map)$this.li$cil$oc$server$component$RedstoneBundled$$deviceInfo());
/*     */   } public static void $init$(RedstoneBundled $this) {
/*  30 */     $this.li$cil$oc$server$component$RedstoneBundled$_setter_$li$cil$oc$server$component$RedstoneBundled$$COLOR_RANGE_$eq(RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 16));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Tuple2 getBundleKey(RedstoneBundled $this, Arguments args) {
/*  37 */     int i = args.count(); switch (i)
/*     */     
/*     */     { 
/*     */       default:
/*  41 */         throw new Exception("too many arguments, expected 0, 1, or 2");
/*     */       case 0: 
/*     */       case 1:
/*     */       
/*     */       case 2:
/*  46 */         break; }  return new Tuple2(Option$.MODULE$.apply($this.checkSide(args, 0)), Option$.MODULE$.apply(BoxesRunTime.boxToInteger(checkColor($this, args, 1)))); } private static int[] tableToColorValues(RedstoneBundled $this, Map table) { return (int[])((TraversableOnce)$this.li$cil$oc$server$component$RedstoneBundled$$COLOR_RANGE().collect((PartialFunction)new RedstoneBundled$$anonfun$tableToColorValues$1($this, table), IndexedSeq$.MODULE$.canBuildFrom()))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  52 */       .toArray(ClassTag$.MODULE$.Int()); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Map li$cil$oc$server$component$RedstoneBundled$$colorsToMap(RedstoneBundled $this, int[] ar) {
/*  58 */     return ((TraversableOnce)$this.li$cil$oc$server$component$RedstoneBundled$$COLOR_RANGE().map((Function1)new RedstoneBundled$$anonfun$li$cil$oc$server$component$RedstoneBundled$$colorsToMap$1($this, ar), IndexedSeq$.MODULE$.canBuildFrom())).toMap(Predef$.MODULE$.$conforms());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static Map sidesToMap(RedstoneBundled $this, int[][] ar) {
/*  64 */     return Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])$this.SIDE_RANGE()).map((Function1)new RedstoneBundled$$anonfun$sidesToMap$1($this, ar), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).toMap(Predef$.MODULE$.$conforms());
/*     */   }
/*     */   
/*     */   private static Tuple3 getBundleAssignment(RedstoneBundled $this, Arguments args) {
/*  68 */     int i = args.count(); switch (i)
/*     */     
/*     */     { 
/*     */       default:
/*  72 */         throw new Exception("invalid number of arguments, expected 1, 2, or 3");
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */       
/*     */       case 3:
/*  78 */         break; }  return new Tuple3($this.checkSide(args, 0), BoxesRunTime.boxToInteger(checkColor($this, args, 1)), BoxesRunTime.boxToInteger(args.checkInteger(2))); } @Callback(direct = true, doc = "function([side:number[, color:number]]):number or table -- Fewer params returns set of inputs") public static Object[] getBundledInput(RedstoneBundled $this, Context context, Arguments args) { Tuple2 tuple2 = getBundleKey($this, args); if (tuple2 != null) { Option side = (Option)tuple2._1(), color = (Option)tuple2._2(); Tuple2 tuple22 = new Tuple2(side, color), tuple21 = tuple22; Option option1 = (Option)tuple21._1(), option2 = (Option)tuple21._2();
/*     */       
/*  80 */       return option2.isDefined() ? 
/*  81 */         package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(((BundledRedstoneAware)$this.redstone()).getBundledInput((ForgeDirection)option1.get(), BoxesRunTime.unboxToInt(option2.get())))
/*  82 */             })) : (option1.isDefined() ? 
/*  83 */         package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { li$cil$oc$server$component$RedstoneBundled$$colorsToMap($this, ((BundledRedstoneAware)$this.redstone()).getBundledInput((ForgeDirection)option1.get()))
/*     */             
/*  85 */             })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { sidesToMap($this, ((BundledRedstoneAware)$this.redstone()).getBundledInput()) }))); }
/*     */     
/*     */     throw new MatchError(tuple2); }
/*     */   
/*     */   @Callback(direct = true, doc = "function([side:number[, color:number]]):number or table -- Fewer params returns set of outputs")
/*     */   public static Object[] getBundledOutput(RedstoneBundled $this, Context context, Arguments args) {
/*  91 */     Tuple2 tuple2 = getBundleKey($this, args); if (tuple2 != null) { Option side = (Option)tuple2._1(), color = (Option)tuple2._2(); Tuple2 tuple22 = new Tuple2(side, color), tuple21 = tuple22; Option option1 = (Option)tuple21._1(), option2 = (Option)tuple21._2();
/*     */       
/*  93 */       return option2.isDefined() ? 
/*  94 */         package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(((BundledRedstoneAware)$this.redstone()).getBundledOutput((ForgeDirection)option1.get(), BoxesRunTime.unboxToInt(option2.get())))
/*  95 */             })) : (option1.isDefined() ? 
/*  96 */         package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { li$cil$oc$server$component$RedstoneBundled$$colorsToMap($this, ((BundledRedstoneAware)$this.redstone()).getBundledOutput((ForgeDirection)option1.get()))
/*     */             
/*  98 */             })) : package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { sidesToMap($this, ((BundledRedstoneAware)$this.redstone()).getBundledOutput()) }))); }
/*     */     
/*     */     throw new MatchError(tuple2);
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
/*     */   @Callback(doc = "function([side:number[, color:number,]] value:number or table):number or table --  Fewer params to assign set of outputs. Returns previous values")
/*     */   public static Object[] setBundledOutput(RedstoneBundled $this, Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore_3
/*     */     //   2: aload_0
/*     */     //   3: aload_2
/*     */     //   4: invokestatic getBundleAssignment : (Lli/cil/oc/server/component/RedstoneBundled;Lli/cil/oc/api/machine/Arguments;)Lscala/Tuple3;
/*     */     //   7: astore #4
/*     */     //   9: aload #4
/*     */     //   11: ifnull -> 131
/*     */     //   14: aload #4
/*     */     //   16: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   19: astore #5
/*     */     //   21: aload #4
/*     */     //   23: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   26: astore #6
/*     */     //   28: aload #4
/*     */     //   30: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   33: astore #7
/*     */     //   35: aload #5
/*     */     //   37: instanceof net/minecraftforge/common/util/ForgeDirection
/*     */     //   40: ifeq -> 131
/*     */     //   43: aload #5
/*     */     //   45: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   48: astore #8
/*     */     //   50: aload #6
/*     */     //   52: instanceof java/lang/Integer
/*     */     //   55: ifeq -> 131
/*     */     //   58: aload #6
/*     */     //   60: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   63: istore #9
/*     */     //   65: aload #7
/*     */     //   67: instanceof java/lang/Integer
/*     */     //   70: ifeq -> 131
/*     */     //   73: aload #7
/*     */     //   75: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   78: istore #10
/*     */     //   80: new java/lang/Integer
/*     */     //   83: dup
/*     */     //   84: aload_0
/*     */     //   85: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   90: checkcast li/cil/oc/common/tileentity/traits/BundledRedstoneAware
/*     */     //   93: aload #8
/*     */     //   95: iload #9
/*     */     //   97: invokeinterface getBundledOutput : (Lnet/minecraftforge/common/util/ForgeDirection;I)I
/*     */     //   102: invokespecial <init> : (I)V
/*     */     //   105: astore_3
/*     */     //   106: aload_0
/*     */     //   107: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   112: checkcast li/cil/oc/common/tileentity/traits/BundledRedstoneAware
/*     */     //   115: aload #8
/*     */     //   117: iload #9
/*     */     //   119: iload #10
/*     */     //   121: invokeinterface setBundledOutput : (Lnet/minecraftforge/common/util/ForgeDirection;II)Z
/*     */     //   126: istore #11
/*     */     //   128: goto -> 280
/*     */     //   131: aload #4
/*     */     //   133: ifnull -> 220
/*     */     //   136: aload #4
/*     */     //   138: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   141: astore #12
/*     */     //   143: aload #4
/*     */     //   145: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   148: astore #13
/*     */     //   150: aload #12
/*     */     //   152: instanceof net/minecraftforge/common/util/ForgeDirection
/*     */     //   155: ifeq -> 220
/*     */     //   158: aload #12
/*     */     //   160: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   163: astore #14
/*     */     //   165: aload #13
/*     */     //   167: instanceof java/util/Map
/*     */     //   170: ifeq -> 220
/*     */     //   173: aload #13
/*     */     //   175: checkcast java/util/Map
/*     */     //   178: astore #15
/*     */     //   180: aload_0
/*     */     //   181: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   186: checkcast li/cil/oc/common/tileentity/traits/BundledRedstoneAware
/*     */     //   189: aload #14
/*     */     //   191: invokeinterface getBundledOutput : (Lnet/minecraftforge/common/util/ForgeDirection;)[I
/*     */     //   196: astore_3
/*     */     //   197: aload_0
/*     */     //   198: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   203: checkcast li/cil/oc/common/tileentity/traits/BundledRedstoneAware
/*     */     //   206: aload #14
/*     */     //   208: aload #15
/*     */     //   210: invokeinterface setBundledOutput : (Lnet/minecraftforge/common/util/ForgeDirection;Ljava/util/Map;)Z
/*     */     //   215: istore #11
/*     */     //   217: goto -> 280
/*     */     //   220: aload #4
/*     */     //   222: ifnull -> 352
/*     */     //   225: aload #4
/*     */     //   227: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   230: astore #16
/*     */     //   232: aload #16
/*     */     //   234: instanceof java/util/Map
/*     */     //   237: ifeq -> 352
/*     */     //   240: aload #16
/*     */     //   242: checkcast java/util/Map
/*     */     //   245: astore #17
/*     */     //   247: aload_0
/*     */     //   248: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   253: checkcast li/cil/oc/common/tileentity/traits/BundledRedstoneAware
/*     */     //   256: invokeinterface getBundledOutput : ()[[I
/*     */     //   261: astore_3
/*     */     //   262: aload_0
/*     */     //   263: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   268: checkcast li/cil/oc/common/tileentity/traits/BundledRedstoneAware
/*     */     //   271: aload #17
/*     */     //   273: invokeinterface setBundledOutput : (Ljava/util/Map;)Z
/*     */     //   278: istore #11
/*     */     //   280: iload #11
/*     */     //   282: ifeq -> 327
/*     */     //   285: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   288: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   291: invokevirtual redstoneDelay : ()D
/*     */     //   294: iconst_0
/*     */     //   295: i2d
/*     */     //   296: dcmpl
/*     */     //   297: ifle -> 321
/*     */     //   300: aload_1
/*     */     //   301: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   304: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   307: invokevirtual redstoneDelay : ()D
/*     */     //   310: invokeinterface pause : (D)Z
/*     */     //   315: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   318: goto -> 330
/*     */     //   321: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   324: goto -> 330
/*     */     //   327: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   330: pop
/*     */     //   331: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   334: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   337: iconst_1
/*     */     //   338: anewarray java/lang/Object
/*     */     //   341: dup
/*     */     //   342: iconst_0
/*     */     //   343: aload_3
/*     */     //   344: aastore
/*     */     //   345: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   348: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   351: areturn
/*     */     //   352: new scala/MatchError
/*     */     //   355: dup
/*     */     //   356: aload #4
/*     */     //   358: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   361: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #104	-> 0
/*     */     //   #105	-> 2
/*     */     //   #106	-> 14
/*     */     //   #107	-> 80
/*     */     //   #108	-> 106
/*     */     //   #106	-> 126
/*     */     //   #105	-> 131
/*     */     //   #109	-> 136
/*     */     //   #110	-> 180
/*     */     //   #111	-> 197
/*     */     //   #109	-> 215
/*     */     //   #105	-> 220
/*     */     //   #112	-> 225
/*     */     //   #113	-> 247
/*     */     //   #114	-> 262
/*     */     //   #112	-> 278
/*     */     //   #105	-> 280
/*     */     //   #116	-> 285
/*     */     //   #117	-> 300
/*     */     //   #116	-> 321
/*     */     //   #105	-> 327
/*     */     //   #119	-> 331
/*     */     //   #105	-> 352
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	362	0	$this	Lli/cil/oc/server/component/RedstoneBundled;
/*     */     //   0	362	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	362	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   2	349	3	ret	Ljava/lang/Object;
/*     */     //   21	341	5	side	Ljava/lang/Object;
/*     */     //   28	334	6	color	Ljava/lang/Object;
/*     */     //   35	327	7	value	Ljava/lang/Object;
/*     */     //   143	219	12	side	Ljava/lang/Object;
/*     */     //   150	212	13	value	Ljava/lang/Object;
/*     */     //   232	130	16	value	Ljava/lang/Object;
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
/*     */   private static int checkColor(RedstoneBundled $this, Arguments args, int index) {
/* 125 */     int color = args.checkInteger(index);
/* 126 */     if ($this.li$cil$oc$server$component$RedstoneBundled$$COLOR_RANGE().contains(color))
/*     */     {
/* 128 */       return color;
/*     */     }
/*     */     throw new IllegalArgumentException("invalid color");
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneBundled$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */