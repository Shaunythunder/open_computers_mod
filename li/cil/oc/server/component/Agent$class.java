/*     */ package li.cil.oc.server.component;
/*     */ import li.cil.oc.api.event.RobotPlaceInAirEvent;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.server.agent.Player;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple6;
/*     */ import scala.collection.GenTraversableOnce;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.Iterable$;
/*     */ import scala.collection.Seq;
/*     */ import scala.package$;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ public abstract class Agent$class {
/*     */   public static BlockPosition position(Agent $this) {
/*  30 */     return BlockPosition$.MODULE$.apply((EnvironmentHost)$this.agent());
/*     */   } public static void $init$(Agent $this) {} public static EntityPlayer fakePlayer(Agent $this) {
/*  32 */     return $this.agent().player();
/*     */   }
/*  34 */   public static ForgeDirection rotatedPlayer$default$1(Agent $this) { return $this.agent().facing(); } public static ForgeDirection rotatedPlayer$default$2(Agent $this) { return $this.agent().facing(); } public static Player rotatedPlayer(Agent $this, ForgeDirection facing, ForgeDirection side) {
/*  35 */     Player player = (Player)$this.agent().player();
/*  36 */     Player$.MODULE$.updatePositionAndRotation(player, facing, side);
/*     */ 
/*     */     
/*  39 */     return player;
/*     */   }
/*     */ 
/*     */   
/*     */   public static IInventory inventory(Agent $this) {
/*  44 */     return $this.agent().mainInventory();
/*     */   } public static int selectedSlot(Agent $this) {
/*  46 */     return $this.agent().selectedSlot();
/*     */   } public static void selectedSlot_$eq(Agent $this, int value) {
/*  48 */     $this.agent().setSelectedSlot(value);
/*     */   }
/*     */   
/*     */   public static MultiTank tank(Agent $this) {
/*  52 */     return $this.agent().tank();
/*     */   } public static int selectedTank(Agent $this) {
/*  54 */     return $this.agent().selectedTank();
/*     */   } public static void selectedTank_$eq(Agent $this, int value) {
/*  56 */     $this.agent().setSelectedTank(value);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean canPlaceInAir(Agent $this) {
/*  61 */     RobotPlaceInAirEvent event = new RobotPlaceInAirEvent($this.agent());
/*  62 */     MinecraftForge.EVENT_BUS.post((Event)event);
/*  63 */     return event.isAllowed();
/*     */   }
/*     */   
/*     */   public static void onWorldInteraction(Agent $this, Context context, double duration) {
/*  67 */     context.pause(duration);
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():string -- Get the name of the agent.")
/*     */   public static Object[] name(Agent $this, Context context, Arguments args) {
/*  73 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { $this.agent().name() }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false]]):boolean, string -- Perform a 'left click' towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.")
/*     */   public static Object[] swing(Agent $this, Context context, Arguments args) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/Object
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore_3
/*     */     //   8: aload_0
/*     */     //   9: aload_2
/*     */     //   10: iconst_0
/*     */     //   11: invokeinterface checkSideForAction : (Lli/cil/oc/api/machine/Arguments;I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   16: astore #5
/*     */     //   18: aload_2
/*     */     //   19: iconst_1
/*     */     //   20: invokeinterface isInteger : (I)Z
/*     */     //   25: ifeq -> 69
/*     */     //   28: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   31: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   34: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   37: iconst_1
/*     */     //   38: anewarray net/minecraftforge/common/util/ForgeDirection
/*     */     //   41: dup
/*     */     //   42: iconst_0
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: iconst_1
/*     */     //   46: aload #5
/*     */     //   48: invokeinterface checkSideForFace : (Lli/cil/oc/api/machine/Arguments;ILnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   53: aastore
/*     */     //   54: checkcast [Ljava/lang/Object;
/*     */     //   57: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   60: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   63: checkcast scala/collection/Iterable
/*     */     //   66: goto -> 154
/*     */     //   69: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   72: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   75: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   78: iconst_1
/*     */     //   79: anewarray net/minecraftforge/common/util/ForgeDirection
/*     */     //   82: dup
/*     */     //   83: iconst_0
/*     */     //   84: aload #5
/*     */     //   86: aastore
/*     */     //   87: checkcast [Ljava/lang/Object;
/*     */     //   90: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   93: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   96: checkcast scala/collection/TraversableLike
/*     */     //   99: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   102: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   105: getstatic net/minecraftforge/common/util/ForgeDirection.VALID_DIRECTIONS : [Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   108: checkcast [Ljava/lang/Object;
/*     */     //   111: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   114: new li/cil/oc/server/component/Agent$$anonfun$1
/*     */     //   117: dup
/*     */     //   118: aload_0
/*     */     //   119: aload #5
/*     */     //   121: invokespecial <init> : (Lli/cil/oc/server/component/Agent;Lnet/minecraftforge/common/util/ForgeDirection;)V
/*     */     //   124: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   129: checkcast [Ljava/lang/Object;
/*     */     //   132: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   135: invokeinterface toIterable : ()Lscala/collection/Iterable;
/*     */     //   140: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   143: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   146: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   151: checkcast scala/collection/Iterable
/*     */     //   154: astore #6
/*     */     //   156: aload_2
/*     */     //   157: iconst_2
/*     */     //   158: invokeinterface isBoolean : (I)Z
/*     */     //   163: ifeq -> 180
/*     */     //   166: aload_2
/*     */     //   167: iconst_2
/*     */     //   168: invokeinterface checkBoolean : (I)Z
/*     */     //   173: ifeq -> 180
/*     */     //   176: iconst_1
/*     */     //   177: goto -> 181
/*     */     //   180: iconst_0
/*     */     //   181: istore #7
/*     */     //   183: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   186: invokestatic create : (Ljava/lang/Object;)Lscala/runtime/ObjectRef;
/*     */     //   189: astore #8
/*     */     //   191: aload #6
/*     */     //   193: new li/cil/oc/server/component/Agent$$anonfun$swing$1
/*     */     //   196: dup
/*     */     //   197: aload_0
/*     */     //   198: aload #5
/*     */     //   200: iload #7
/*     */     //   202: aload #8
/*     */     //   204: aload_3
/*     */     //   205: aload_1
/*     */     //   206: invokespecial <init> : (Lli/cil/oc/server/component/Agent;Lnet/minecraftforge/common/util/ForgeDirection;ZLscala/runtime/ObjectRef;Ljava/lang/Object;Lli/cil/oc/api/machine/Context;)V
/*     */     //   209: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   214: aload_0
/*     */     //   215: aload #5
/*     */     //   217: invokeinterface blockContent : (Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Tuple2;
/*     */     //   222: astore #10
/*     */     //   224: aload #10
/*     */     //   226: ifnull -> 461
/*     */     //   229: aload #10
/*     */     //   231: invokevirtual _1$mcZ$sp : ()Z
/*     */     //   234: istore #11
/*     */     //   236: iload #11
/*     */     //   238: istore #12
/*     */     //   240: iload #12
/*     */     //   242: istore #9
/*     */     //   244: iload #9
/*     */     //   246: ifeq -> 415
/*     */     //   249: aload_0
/*     */     //   250: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   255: aload #5
/*     */     //   257: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   260: astore #13
/*     */     //   262: aload_0
/*     */     //   263: aload #5
/*     */     //   265: aload #5
/*     */     //   267: invokeinterface rotatedPlayer : (Lnet/minecraftforge/common/util/ForgeDirection;Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/server/agent/Player;
/*     */     //   272: astore #14
/*     */     //   274: aload #14
/*     */     //   276: iload #7
/*     */     //   278: invokevirtual func_70095_a : (Z)V
/*     */     //   281: aload_0
/*     */     //   282: aload #14
/*     */     //   284: aload #13
/*     */     //   286: invokevirtual x : ()I
/*     */     //   289: aload #13
/*     */     //   291: invokevirtual y : ()I
/*     */     //   294: aload #13
/*     */     //   296: invokevirtual z : ()I
/*     */     //   299: aload #5
/*     */     //   301: invokevirtual ordinal : ()I
/*     */     //   304: aload_1
/*     */     //   305: invokestatic click$1 : (Lli/cil/oc/server/component/Agent;Lli/cil/oc/server/agent/Player;IIIILli/cil/oc/api/machine/Context;)Lscala/Tuple2;
/*     */     //   308: astore #16
/*     */     //   310: aload #16
/*     */     //   312: ifnull -> 405
/*     */     //   315: aload #16
/*     */     //   317: invokevirtual _1$mcZ$sp : ()Z
/*     */     //   320: istore #17
/*     */     //   322: aload #16
/*     */     //   324: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   327: checkcast java/lang/String
/*     */     //   330: astore #18
/*     */     //   332: new scala/Tuple2
/*     */     //   335: dup
/*     */     //   336: iload #17
/*     */     //   338: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   341: aload #18
/*     */     //   343: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   346: astore #19
/*     */     //   348: aload #19
/*     */     //   350: astore #15
/*     */     //   352: aload #15
/*     */     //   354: invokevirtual _1$mcZ$sp : ()Z
/*     */     //   357: istore #20
/*     */     //   359: aload #15
/*     */     //   361: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   364: checkcast java/lang/String
/*     */     //   367: astore #21
/*     */     //   369: aload #14
/*     */     //   371: iconst_0
/*     */     //   372: invokevirtual func_70095_a : (Z)V
/*     */     //   375: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   378: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   381: iconst_2
/*     */     //   382: anewarray java/lang/Object
/*     */     //   385: dup
/*     */     //   386: iconst_0
/*     */     //   387: iload #20
/*     */     //   389: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   392: aastore
/*     */     //   393: dup
/*     */     //   394: iconst_1
/*     */     //   395: aload #21
/*     */     //   397: aastore
/*     */     //   398: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   401: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   404: areturn
/*     */     //   405: new scala/MatchError
/*     */     //   408: dup
/*     */     //   409: aload #16
/*     */     //   411: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   414: athrow
/*     */     //   415: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */     //   418: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   421: iconst_2
/*     */     //   422: anewarray java/lang/Object
/*     */     //   425: dup
/*     */     //   426: iconst_0
/*     */     //   427: iconst_0
/*     */     //   428: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   431: aastore
/*     */     //   432: dup
/*     */     //   433: iconst_1
/*     */     //   434: aload #8
/*     */     //   436: getfield elem : Ljava/lang/Object;
/*     */     //   439: checkcast scala/Option
/*     */     //   442: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   445: invokevirtual $conforms : ()Lscala/Predef$$less$colon$less;
/*     */     //   448: invokevirtual orNull : (Lscala/Predef$$less$colon$less;)Ljava/lang/Object;
/*     */     //   451: aastore
/*     */     //   452: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   455: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   458: goto -> 490
/*     */     //   461: new scala/MatchError
/*     */     //   464: dup
/*     */     //   465: aload #10
/*     */     //   467: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   470: athrow
/*     */     //   471: astore #4
/*     */     //   473: aload #4
/*     */     //   475: invokevirtual key : ()Ljava/lang/Object;
/*     */     //   478: aload_3
/*     */     //   479: if_acmpne -> 491
/*     */     //   482: aload #4
/*     */     //   484: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   487: checkcast [Ljava/lang/Object;
/*     */     //   490: areturn
/*     */     //   491: aload #4
/*     */     //   493: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #76	-> 0
/*     */     //   #78	-> 8
/*     */     //   #80	-> 18
/*     */     //   #81	-> 28
/*     */     //   #85	-> 69
/*     */     //   #79	-> 154
/*     */     //   #87	-> 156
/*     */     //   #116	-> 183
/*     */     //   #117	-> 191
/*     */     //   #154	-> 214
/*     */     //   #155	-> 244
/*     */     //   #156	-> 249
/*     */     //   #157	-> 262
/*     */     //   #158	-> 274
/*     */     //   #159	-> 281
/*     */     //   #160	-> 369
/*     */     //   #161	-> 375
/*     */     //   #159	-> 405
/*     */     //   #164	-> 415
/*     */     //   #154	-> 461
/*     */     //   #76	-> 471
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	494	0	$this	Lli/cil/oc/server/component/Agent;
/*     */     //   0	494	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	494	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   18	440	5	facing	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   156	302	6	sides	Lscala/collection/Iterable;
/*     */     //   183	275	7	sneaky	Z
/*     */     //   191	267	8	reason	Lscala/runtime/ObjectRef;
/*     */     //   236	258	11	hasBlock	Z
/*     */     //   244	214	9	hasBlock	Z
/*     */     //   262	232	13	blockPos	Lli/cil/oc/util/BlockPosition;
/*     */     //   274	220	14	player	Lli/cil/oc/server/agent/Player;
/*     */     //   322	172	17	ok	Z
/*     */     //   332	162	18	why	Ljava/lang/String;
/*     */     //   359	135	20	ok	Z
/*     */     //   369	125	21	why	Ljava/lang/String;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	471	471	scala/runtime/NonLocalReturnControl
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final double triggerDelay$default$1$1(Agent $this)
/*     */   {
/*  89 */     return Settings$.MODULE$.get().swingDelay(); } public static final void triggerDelay$1(Agent $this, double delay, Context context$1) {
/*  90 */     $this.onWorldInteraction(context$1, delay);
/*     */   }
/*     */   public static final Tuple2 attack$1(Agent $this, Player player, Entity entity, Context context$1) {
/*  93 */     $this.beginConsumeDrops(entity);
/*  94 */     player.func_71059_n(entity);
/*     */ 
/*     */     
/*  97 */     Entity entity1 = entity;
/*  98 */     if (entity1 instanceof net.minecraft.entity.item.EntityMinecart) { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 10).withFilter((Function1)new Agent$$anonfun$attack$1$1($this, entity)).foreach((Function1)new Agent$$anonfun$attack$1$2($this, player, entity)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     else
/*     */     
/* 101 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/* 103 */     $this.endConsumeDrops(player, entity);
/* 104 */     triggerDelay$1($this, triggerDelay$default$1$1($this), context$1);
/* 105 */     return new Tuple2(BoxesRunTime.boxToBoolean(true), "entity");
/*     */   }
/*     */   public static final Tuple2 click$1(Agent $this, Player player, int x, int y, int z, int side, Context context$1) {
/* 108 */     double breakTime = player.clickBlock(x, y, z, side, player.clickBlock$default$5());
/* 109 */     boolean broke = (breakTime > false);
/* 110 */     if (broke) {
/* 111 */       triggerDelay$1($this, breakTime, context$1);
/*     */     }
/* 113 */     return new Tuple2(BoxesRunTime.boxToBoolean(broke), "block");
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
/*     */   @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false[, duration:number=0]]]):boolean, string -- Perform a 'right click' towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.")
/*     */   public static Object[] use(Agent $this, Context context, Arguments args) {
/* 168 */     Object object = new Object(); try {
/* 169 */       ForgeDirection facing = $this.checkSideForAction(args, 0);
/*     */ 
/*     */       
/* 172 */       (new ForgeDirection[1])[0] = $this.checkSideForUse(args, 1);
/*     */ 
/*     */ 
/*     */       
/* 176 */       (new ForgeDirection[1])[0] = facing; Iterable sides = args.isInteger(1) ? (Iterable)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[1])) : (Iterable)((TraversableLike)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[1]))).$plus$plus((GenTraversableOnce)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).filter((Function1)new Agent$$anonfun$2($this, facing))).toIterable(), Iterable$.MODULE$.canBuildFrom());
/*     */       
/* 178 */       boolean sneaky = (args.isBoolean(2) && args.checkBoolean(2));
/* 179 */       double duration = 
/* 180 */         args.isDouble(3) ? args.checkDouble(3) : 
/* 181 */         0.0D;
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
/* 206 */       sides.foreach((Function1)new Agent$$anonfun$use$1($this, facing, sneaky, duration, object, context));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (Object[])nonLocalReturnControl.value();
/*     */       }
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
/* 243 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) }));
/*     */   } public static final void triggerDelay$2(Agent $this, Context context$2) { $this.onWorldInteraction(context$2, Settings$.MODULE$.get().useDelay()); } public static final Tuple2 activationResult$1(Agent $this, Enumeration.Value activationType, Context context$2) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_3
/*     */     //   2: getstatic li/cil/oc/server/agent/ActivationType$.MODULE$ : Lli/cil/oc/server/agent/ActivationType$;
/*     */     //   5: invokevirtual BlockActivated : ()Lscala/Enumeration$Value;
/*     */     //   8: aload_3
/*     */     //   9: astore #4
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 24
/*     */     //   15: pop
/*     */     //   16: aload #4
/*     */     //   18: ifnull -> 32
/*     */     //   21: goto -> 56
/*     */     //   24: aload #4
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 56
/*     */     //   32: aload_0
/*     */     //   33: aload_2
/*     */     //   34: invokestatic triggerDelay$2 : (Lli/cil/oc/server/component/Agent;Lli/cil/oc/api/machine/Context;)V
/*     */     //   37: new scala/Tuple2
/*     */     //   40: dup
/*     */     //   41: iconst_1
/*     */     //   42: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   45: ldc_w 'block_activated'
/*     */     //   48: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   51: astore #5
/*     */     //   53: goto -> 180
/*     */     //   56: getstatic li/cil/oc/server/agent/ActivationType$.MODULE$ : Lli/cil/oc/server/agent/ActivationType$;
/*     */     //   59: invokevirtual ItemPlaced : ()Lscala/Enumeration$Value;
/*     */     //   62: aload_3
/*     */     //   63: astore #6
/*     */     //   65: dup
/*     */     //   66: ifnonnull -> 78
/*     */     //   69: pop
/*     */     //   70: aload #6
/*     */     //   72: ifnull -> 86
/*     */     //   75: goto -> 110
/*     */     //   78: aload #6
/*     */     //   80: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   83: ifeq -> 110
/*     */     //   86: aload_0
/*     */     //   87: aload_2
/*     */     //   88: invokestatic triggerDelay$2 : (Lli/cil/oc/server/component/Agent;Lli/cil/oc/api/machine/Context;)V
/*     */     //   91: new scala/Tuple2
/*     */     //   94: dup
/*     */     //   95: iconst_1
/*     */     //   96: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   99: ldc_w 'item_placed'
/*     */     //   102: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   105: astore #5
/*     */     //   107: goto -> 180
/*     */     //   110: getstatic li/cil/oc/server/agent/ActivationType$.MODULE$ : Lli/cil/oc/server/agent/ActivationType$;
/*     */     //   113: invokevirtual ItemUsed : ()Lscala/Enumeration$Value;
/*     */     //   116: aload_3
/*     */     //   117: astore #7
/*     */     //   119: dup
/*     */     //   120: ifnonnull -> 132
/*     */     //   123: pop
/*     */     //   124: aload #7
/*     */     //   126: ifnull -> 140
/*     */     //   129: goto -> 164
/*     */     //   132: aload #7
/*     */     //   134: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   137: ifeq -> 164
/*     */     //   140: aload_0
/*     */     //   141: aload_2
/*     */     //   142: invokestatic triggerDelay$2 : (Lli/cil/oc/server/component/Agent;Lli/cil/oc/api/machine/Context;)V
/*     */     //   145: new scala/Tuple2
/*     */     //   148: dup
/*     */     //   149: iconst_1
/*     */     //   150: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   153: ldc_w 'item_used'
/*     */     //   156: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   159: astore #5
/*     */     //   161: goto -> 180
/*     */     //   164: new scala/Tuple2
/*     */     //   167: dup
/*     */     //   168: iconst_0
/*     */     //   169: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   172: ldc_w ''
/*     */     //   175: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   178: astore #5
/*     */     //   180: aload #5
/*     */     //   182: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #187	-> 0
/*     */     //   #188	-> 2
/*     */     //   #189	-> 32
/*     */     //   #190	-> 37
/*     */     //   #188	-> 51
/*     */     //   #191	-> 56
/*     */     //   #192	-> 86
/*     */     //   #193	-> 91
/*     */     //   #191	-> 105
/*     */     //   #194	-> 110
/*     */     //   #195	-> 140
/*     */     //   #196	-> 145
/*     */     //   #194	-> 159
/*     */     //   #197	-> 164
/*     */     //   #187	-> 180
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	183	0	$this	Lli/cil/oc/server/component/Agent;
/*     */     //   0	183	1	activationType	Lscala/Enumeration$Value;
/*     */     //   0	183	2	context$2	Lli/cil/oc/api/machine/Context; }
/*     */   public static final boolean interact$1(Agent $this, Player player, Entity entity) { $this.beginConsumeDrops(entity); boolean result = player.func_70998_m(entity); $this.endConsumeDrops(player, entity);
/*     */     return result; }
/* 247 */   @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false]]):boolean -- Place a block towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.") public static Object[] place(Agent $this, Context context, Arguments args) { Object object = new Object(); try {
/* 248 */       ForgeDirection facing = $this.checkSideForAction(args, 0);
/*     */ 
/*     */       
/* 251 */       (new ForgeDirection[1])[0] = $this.checkSideForFace(args, 1, facing);
/*     */ 
/*     */ 
/*     */       
/* 255 */       (new ForgeDirection[1])[0] = facing; Iterable sides = args.isInteger(1) ? (Iterable)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[1])) : (Iterable)((TraversableLike)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[1]))).$plus$plus((GenTraversableOnce)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).filter((Function1)new Agent$$anonfun$3($this, facing))).toIterable(), Iterable$.MODULE$.canBuildFrom());
/*     */       
/* 257 */       boolean sneaky = (args.isBoolean(2) && args.checkBoolean(2));
/* 258 */       ItemStack stack = $this.agent().mainInventory().func_70301_a($this.agent().selectedSlot());
/* 259 */       if (stack == null || stack.field_77994_a == 0) {
/* 260 */         return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "nothing selected" }));
/*     */       }
/*     */       
/* 263 */       sides.foreach((Function1)new Agent$$anonfun$place$1($this, facing, sneaky, object, context));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (Object[])nonLocalReturnControl.value();
/*     */       }
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
/* 282 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) })); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void beginConsumeDrops(Agent $this, Entity entity) {
/* 288 */     entity.captureDrops = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void endConsumeDrops(Agent $this, Player player, Entity entity) {
/* 293 */     entity.captureDrops = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 298 */     if (player.field_71071_by.func_70302_i_() > 0) {
/* 299 */       WrapAsScala$.MODULE$.asScalaBuffer(entity.capturedDrops).foreach((Function1)new Agent$$anonfun$endConsumeDrops$1($this, player));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 306 */     entity.capturedDrops.clear();
/*     */   }
/*     */   
/*     */   public static ForgeDirection checkSideForFace(Agent $this, Arguments args, int n, ForgeDirection facing)
/*     */   {
/* 311 */     return $this.agent().toGlobal(ExtendedArguments$.MODULE$.extendedArguments(args).checkSideForFace(n, $this.agent().toLocal(facing))); } public static ForgeDirection checkSideForUse(Agent $this, Arguments args, int n) {
/* 312 */     return ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(n);
/*     */   }
/*     */   public static MovingObjectPosition pick(Agent $this, Player player, double range) {
/* 315 */     Vec3 origin = Vec3.func_72443_a(
/* 316 */         player.field_70165_t + (player.facing()).offsetX * 0.5D, 
/* 317 */         player.field_70163_u + (player.facing()).offsetY * 0.5D, 
/* 318 */         player.field_70161_v + (player.facing()).offsetZ * 0.5D);
/* 319 */     Vec3 blockCenter = origin.func_72441_c(
/* 320 */         (player.facing()).offsetX * 0.51D, 
/* 321 */         (player.facing()).offsetY * 0.51D, 
/* 322 */         (player.facing()).offsetZ * 0.51D);
/* 323 */     Vec3 target = blockCenter.func_72441_c(
/* 324 */         (player.side()).offsetX * range, 
/* 325 */         (player.side()).offsetY * range, 
/* 326 */         (player.side()).offsetZ * range);
/* 327 */     MovingObjectPosition hit = $this.world().func_72933_a(origin, target);
/* 328 */     Option option = player.closestEntity(player.closestEntity$default$1(), ClassTag$.MODULE$.apply(Entity.class));
/* 329 */     if (option instanceof Some) { boolean bool; Some some = (Some)option; Entity entity = (Entity)some.x(); if (entity instanceof net.minecraft.entity.EntityLivingBase) { bool = true; } else if (entity instanceof net.minecraft.entity.item.EntityMinecart) { bool = true; } else if (entity instanceof li.cil.oc.common.entity.Drone) { bool = true; } else { bool = false; }  if (bool && (hit == null || Vec3.func_72443_a(player.field_70165_t, player.field_70163_u, player.field_70161_v).func_72438_d(hit.field_72307_f) > player.func_70032_d(entity))) return new MovingObjectPosition(entity);  }
/* 330 */      return hit;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Tuple6 clickParamsFromHit(Agent $this, MovingObjectPosition hit) {
/* 335 */     return new Tuple6(BoxesRunTime.boxToInteger(hit.field_72311_b), BoxesRunTime.boxToInteger(hit.field_72312_c), BoxesRunTime.boxToInteger(hit.field_72309_d), 
/* 336 */         BoxesRunTime.boxToFloat((float)(hit.field_72307_f.field_72450_a - hit.field_72311_b)), 
/* 337 */         BoxesRunTime.boxToFloat((float)(hit.field_72307_f.field_72448_b - hit.field_72312_c)), 
/* 338 */         BoxesRunTime.boxToFloat((float)(hit.field_72307_f.field_72449_c - hit.field_72309_d)));
/*     */   }
/*     */   
/*     */   public static Tuple6 clickParamsForItemActivate(Agent $this, ForgeDirection facing, ForgeDirection side) {
/* 342 */     BlockPosition blockPos = $this.position().offset(facing);
/* 343 */     return new Tuple6(BoxesRunTime.boxToInteger(blockPos.x()), BoxesRunTime.boxToInteger(blockPos.y()), BoxesRunTime.boxToInteger(blockPos.z()), 
/* 344 */         BoxesRunTime.boxToFloat(0.5F + side.offsetX * 0.5F), 
/* 345 */         BoxesRunTime.boxToFloat(0.5F + side.offsetY * 0.5F), 
/* 346 */         BoxesRunTime.boxToFloat(0.5F + side.offsetZ * 0.5F));
/*     */   }
/*     */   
/*     */   public static Tuple6 clickParamsForItemUse(Agent $this, ForgeDirection facing, ForgeDirection side) {
/* 350 */     BlockPosition blockPos = $this.position().offset(facing).offset(side);
/* 351 */     return new Tuple6(BoxesRunTime.boxToInteger(blockPos.x()), BoxesRunTime.boxToInteger(blockPos.y()), BoxesRunTime.boxToInteger(blockPos.z()), 
/* 352 */         BoxesRunTime.boxToFloat(0.5F - side.offsetX * 0.5F), 
/* 353 */         BoxesRunTime.boxToFloat(0.5F - side.offsetY * 0.5F), 
/* 354 */         BoxesRunTime.boxToFloat(0.5F - side.offsetZ * 0.5F));
/*     */   }
/*     */   
/*     */   public static Tuple6 clickParamsForPlace(Agent $this, ForgeDirection facing) {
/* 358 */     return new Tuple6(BoxesRunTime.boxToInteger($this.position().x()), BoxesRunTime.boxToInteger($this.position().y()), BoxesRunTime.boxToInteger($this.position().z()), 
/* 359 */         BoxesRunTime.boxToFloat(0.5F + facing.offsetX * 0.5F), 
/* 360 */         BoxesRunTime.boxToFloat(0.5F + facing.offsetY * 0.5F), 
/* 361 */         BoxesRunTime.boxToFloat(0.5F + facing.offsetZ * 0.5F));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Agent$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */