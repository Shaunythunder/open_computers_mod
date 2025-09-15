/*     */ package li.cil.oc.server.component;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.common.tileentity.traits.RedstoneAware;
/*     */ import li.cil.oc.common.tileentity.traits.RotationAware;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.BlockPosition$;
/*     */ import li.cil.oc.util.ExtendedWorld$;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Array$;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class RedstoneVanilla$class {
/*     */   public static final Map li$cil$oc$server$component$RedstoneVanilla$$deviceInfo(RedstoneVanilla $this) {
/*  28 */     (new Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$
/*  29 */       .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "communication");
/*  30 */     (new Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Redstone controller");
/*  31 */     (new Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  32 */     (new Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Rs100-V");
/*  33 */     (new Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), "16");
/*  34 */     (new Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), "1");
/*     */     return (Map)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[6]));
/*     */   } public static Map getDeviceInfo(RedstoneVanilla $this) {
/*  37 */     return WrapAsJava$.MODULE$.mapAsJavaMap((Map)$this.li$cil$oc$server$component$RedstoneVanilla$$deviceInfo());
/*     */   } public static void $init$(RedstoneVanilla $this) {
/*  39 */     $this.li$cil$oc$server$component$RedstoneVanilla$_setter_$SIDE_RANGE_$eq(ForgeDirection.VALID_DIRECTIONS);
/*     */   }
/*     */   @Callback(direct = true, doc = "function([side:number]):number or table -- Get the redstone input (all sides, or optionally on the specified side)")
/*     */   public static Object[] getInput(RedstoneVanilla $this, Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  44 */     Option option = getOptionalSide($this, args);
/*  45 */     if (option instanceof Some) { Some some = (Some)option; int side = BoxesRunTime.unboxToInt(some.x()), i = side; arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(((RedstoneAware)$this.redstone()).getInput()[i]) })); }
/*  46 */     else { arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { valuesToMap($this, ((RedstoneAware)$this.redstone()).getInput()) })); }
/*     */     
/*     */     return arrayOfObject;
/*     */   } @Callback(direct = true, doc = "function([side:number]):number or table -- Get the redstone output (all sides, or optionally on the specified side)")
/*     */   public static Object[] getOutput(RedstoneVanilla $this, Context context, Arguments args) {
/*     */     Object[] arrayOfObject;
/*  52 */     Option option = getOptionalSide($this, args);
/*  53 */     if (option instanceof Some) { Some some = (Some)option; int side = BoxesRunTime.unboxToInt(some.x()), i = side; arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(((RedstoneAware)$this.redstone()).getOutput()[i]) })); }
/*  54 */     else { arrayOfObject = package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { valuesToMap($this, ((RedstoneAware)$this.redstone()).getOutput()) })); }
/*     */     
/*     */     return arrayOfObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function([side:number, ]value:number or table):number or table --  Set the redstone output (all sides, or optionally on the specified side). Returns previous values")
/*     */   public static Object[] setOutput(RedstoneVanilla $this, Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore_3
/*     */     //   2: aload_0
/*     */     //   3: aload_2
/*     */     //   4: invokestatic getAssignment : (Lli/cil/oc/server/component/RedstoneVanilla;Lli/cil/oc/api/machine/Arguments;)Lscala/Tuple2;
/*     */     //   7: astore #4
/*     */     //   9: aload #4
/*     */     //   11: ifnull -> 105
/*     */     //   14: aload #4
/*     */     //   16: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   19: astore #5
/*     */     //   21: aload #4
/*     */     //   23: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   26: astore #6
/*     */     //   28: aload #5
/*     */     //   30: instanceof net/minecraftforge/common/util/ForgeDirection
/*     */     //   33: ifeq -> 105
/*     */     //   36: aload #5
/*     */     //   38: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   41: astore #7
/*     */     //   43: aload #6
/*     */     //   45: instanceof java/lang/Integer
/*     */     //   48: ifeq -> 105
/*     */     //   51: aload #6
/*     */     //   53: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   56: istore #8
/*     */     //   58: new java/lang/Integer
/*     */     //   61: dup
/*     */     //   62: aload_0
/*     */     //   63: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   68: checkcast li/cil/oc/common/tileentity/traits/RedstoneAware
/*     */     //   71: aload #7
/*     */     //   73: invokeinterface getOutput : (Lnet/minecraftforge/common/util/ForgeDirection;)I
/*     */     //   78: invokespecial <init> : (I)V
/*     */     //   81: astore_3
/*     */     //   82: aload_0
/*     */     //   83: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   88: checkcast li/cil/oc/common/tileentity/traits/RedstoneAware
/*     */     //   91: aload #7
/*     */     //   93: iload #8
/*     */     //   95: invokeinterface setOutput : (Lnet/minecraftforge/common/util/ForgeDirection;I)Z
/*     */     //   100: istore #9
/*     */     //   102: goto -> 169
/*     */     //   105: aload #4
/*     */     //   107: ifnull -> 241
/*     */     //   110: aload #4
/*     */     //   112: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   115: astore #10
/*     */     //   117: aload #10
/*     */     //   119: instanceof java/util/Map
/*     */     //   122: ifeq -> 241
/*     */     //   125: aload #10
/*     */     //   127: checkcast java/util/Map
/*     */     //   130: astore #11
/*     */     //   132: aload_0
/*     */     //   133: aload_0
/*     */     //   134: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   139: checkcast li/cil/oc/common/tileentity/traits/RedstoneAware
/*     */     //   142: invokeinterface getOutput : ()[I
/*     */     //   147: invokestatic valuesToMap : (Lli/cil/oc/server/component/RedstoneVanilla;[I)Lscala/collection/immutable/Map;
/*     */     //   150: astore_3
/*     */     //   151: aload_0
/*     */     //   152: invokeinterface redstone : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   157: checkcast li/cil/oc/common/tileentity/traits/RedstoneAware
/*     */     //   160: aload #11
/*     */     //   162: invokeinterface setOutput : (Ljava/util/Map;)Z
/*     */     //   167: istore #9
/*     */     //   169: iload #9
/*     */     //   171: ifeq -> 216
/*     */     //   174: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   177: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   180: invokevirtual redstoneDelay : ()D
/*     */     //   183: iconst_0
/*     */     //   184: i2d
/*     */     //   185: dcmpl
/*     */     //   186: ifle -> 210
/*     */     //   189: aload_1
/*     */     //   190: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   193: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   196: invokevirtual redstoneDelay : ()D
/*     */     //   199: invokeinterface pause : (D)Z
/*     */     //   204: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   207: goto -> 219
/*     */     //   210: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   213: goto -> 219
/*     */     //   216: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   219: pop
/*     */     //   220: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   223: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   226: iconst_1
/*     */     //   227: anewarray java/lang/Object
/*     */     //   230: dup
/*     */     //   231: iconst_0
/*     */     //   232: aload_3
/*     */     //   233: aastore
/*     */     //   234: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   237: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   240: areturn
/*     */     //   241: new scala/MatchError
/*     */     //   244: dup
/*     */     //   245: aload #4
/*     */     //   247: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   250: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 0
/*     */     //   #61	-> 2
/*     */     //   #62	-> 14
/*     */     //   #63	-> 58
/*     */     //   #64	-> 82
/*     */     //   #62	-> 100
/*     */     //   #61	-> 105
/*     */     //   #65	-> 110
/*     */     //   #66	-> 132
/*     */     //   #67	-> 151
/*     */     //   #65	-> 167
/*     */     //   #61	-> 169
/*     */     //   #69	-> 174
/*     */     //   #70	-> 189
/*     */     //   #69	-> 210
/*     */     //   #61	-> 216
/*     */     //   #72	-> 220
/*     */     //   #61	-> 241
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	251	0	$this	Lli/cil/oc/server/component/RedstoneVanilla;
/*     */     //   0	251	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	251	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   2	238	3	ret	Ljava/lang/Object;
/*     */     //   21	230	5	side	Ljava/lang/Object;
/*     */     //   28	223	6	value	Ljava/lang/Object;
/*     */     //   117	134	10	value	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(direct = true, doc = "function(side:number):number -- Get the comparator input on the specified side.")
/*     */   public static Object[] getComparatorInput(RedstoneVanilla $this, Context context, Arguments args) {
/*  77 */     ForgeDirection side = $this.checkSide(args, 0);
/*  78 */     BlockPosition blockPos = BlockPosition$.MODULE$.apply($this.redstone()).offset(side);
/*  79 */     if (ExtendedWorld$.MODULE$.extendedWorld(((TileEntity)$this.redstone()).world()).blockExists(blockPos)) {
/*  80 */       Block block = ExtendedWorld$.MODULE$.extendedWorld(((TileEntity)$this.redstone()).world()).getBlock(blockPos);
/*  81 */       if (block.func_149740_M()) {
/*  82 */         int comparatorOverride = ExtendedBlock$.MODULE$.extendedBlock(block).getComparatorInputOverride(blockPos, side.getOpposite());
/*  83 */         return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(comparatorOverride) }));
/*     */       } 
/*     */     } 
/*  86 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(0) }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void onMessage(RedstoneVanilla $this, Message message) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokeinterface li$cil$oc$server$component$RedstoneVanilla$$super$onMessage : (Lli/cil/oc/api/network/Message;)V
/*     */     //   7: aload_1
/*     */     //   8: invokeinterface name : ()Ljava/lang/String;
/*     */     //   13: ldc_w 'redstone.changed'
/*     */     //   16: astore_2
/*     */     //   17: dup
/*     */     //   18: ifnonnull -> 29
/*     */     //   21: pop
/*     */     //   22: aload_2
/*     */     //   23: ifnull -> 36
/*     */     //   26: goto -> 138
/*     */     //   29: aload_2
/*     */     //   30: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   33: ifeq -> 138
/*     */     //   36: aload_1
/*     */     //   37: invokeinterface data : ()[Ljava/lang/Object;
/*     */     //   42: astore_3
/*     */     //   43: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   46: aload_3
/*     */     //   47: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   50: astore #4
/*     */     //   52: aload #4
/*     */     //   54: invokevirtual isEmpty : ()Z
/*     */     //   57: ifne -> 133
/*     */     //   60: aload #4
/*     */     //   62: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   65: ifnull -> 133
/*     */     //   68: aload #4
/*     */     //   70: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   73: checkcast scala/collection/SeqLike
/*     */     //   76: iconst_1
/*     */     //   77: invokeinterface lengthCompare : (I)I
/*     */     //   82: iconst_0
/*     */     //   83: if_icmpne -> 133
/*     */     //   86: aload #4
/*     */     //   88: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   91: checkcast scala/collection/SeqLike
/*     */     //   94: iconst_0
/*     */     //   95: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   100: astore #5
/*     */     //   102: aload #5
/*     */     //   104: instanceof li/cil/oc/common/tileentity/traits/RedstoneChangedEventArgs
/*     */     //   107: ifeq -> 133
/*     */     //   110: aload #5
/*     */     //   112: checkcast li/cil/oc/common/tileentity/traits/RedstoneChangedEventArgs
/*     */     //   115: astore #6
/*     */     //   117: aload_0
/*     */     //   118: aload #6
/*     */     //   120: invokeinterface onRedstoneChanged : (Lli/cil/oc/common/tileentity/traits/RedstoneChangedEventArgs;)V
/*     */     //   125: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   128: astore #7
/*     */     //   130: goto -> 138
/*     */     //   133: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   136: astore #7
/*     */     //   138: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #92	-> 0
/*     */     //   #93	-> 7
/*     */     //   #94	-> 43
/*     */     //   #95	-> 117
/*     */     //   #96	-> 133
/*     */     //   #91	-> 138
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	139	0	$this	Lli/cil/oc/server/component/RedstoneVanilla;
/*     */     //   0	139	1	message	Lli/cil/oc/api/network/Message;
/*     */     //   102	37	5	args	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Option getOptionalSide(RedstoneVanilla $this, Arguments args) {
/* 103 */     return (args.count() == 1) ? 
/* 104 */       Option$.MODULE$.apply(BoxesRunTime.boxToInteger($this.checkSide(args, 0).ordinal())) : 
/*     */       
/* 106 */       (Option)None$.MODULE$;
/*     */   }
/*     */   
/*     */   private static Tuple2 getAssignment(RedstoneVanilla $this, Arguments args) {
/* 110 */     int i = args.count(); switch (i) {
/*     */       
/*     */       default:
/* 113 */         throw new Exception("invalid number of arguments, expected 1 or 2");
/*     */       case 1:
/*     */       
/*     */       case 2:
/*     */         break;
/* 118 */     }  return new Tuple2($this.checkSide(args, 0), BoxesRunTime.boxToInteger(args.checkInteger(1))); } public static ForgeDirection checkSide(RedstoneVanilla $this, Arguments args, int index) { int side = args.checkInteger(index);
/* 119 */     if (side < 0 || side > 5)
/* 120 */       throw new IllegalArgumentException("invalid side"); 
/* 121 */     return ((RotationAware)$this.redstone()).toGlobal(ForgeDirection.getOrientation(side)); }
/*     */   
/*     */   private static Map valuesToMap(RedstoneVanilla $this, int[] ar) {
/* 124 */     return Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.intArrayOps((int[])Predef$.MODULE$.refArrayOps((Object[])$this.SIDE_RANGE()).map((Function1)new RedstoneVanilla$$anonfun$valuesToMap$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int()))).map((Function1)new RedstoneVanilla$$anonfun$valuesToMap$2($this, ar), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Tuple2.class)))).toMap(Predef$.MODULE$.$conforms());
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneVanilla$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */