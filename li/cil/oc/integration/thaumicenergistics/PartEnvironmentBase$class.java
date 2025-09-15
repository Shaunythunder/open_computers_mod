/*    */ package li.cil.oc.integration.thaumicenergistics;
/*    */ import appeng.api.parts.IPart;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.util.ExtendedArguments$;
/*    */ import li.cil.oc.util.ResultWrapper$;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.MatchError;
/*    */ import scala.Option;
/*    */ import scala.Option$;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.Unit$;
/*    */ import scala.collection.Seq;
/*    */ import scala.reflect.ClassTag;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import thaumcraft.api.aspects.Aspect;
/*    */ import thaumicenergistics.common.network.IAspectSlotPart;
/*    */ 
/*    */ public abstract class PartEnvironmentBase$class {
/*    */   private static int resolveAspectSlot(PartEnvironmentBase $this, IAspectSlotPart part, int slot) {
/* 22 */     int[] available = part.getAvailableAspectSlots();
/*    */     
/* 24 */     if (slot < 1 || slot > available.length) {
/* 25 */       throw new IllegalArgumentException("invalid slot");
/*    */     }
/* 27 */     return available[slot - 1];
/*    */   }
/*    */   public static void $init$(PartEnvironmentBase $this) {}
/*    */   public static Object[] getSlotSize(PartEnvironmentBase $this, Context context, Arguments args, ClassTag evidence$1) {
/*    */     Object[] arrayOfObject;
/* 32 */     ForgeDirection side = ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/* 33 */     IPart iPart = $this.host().getPart(side);
/* 34 */     Option option = evidence$1.unapply(iPart); if (!option.isEmpty() && option.get() != null)
/* 35 */     { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger((((IAspectSlotPart)iPart).getAvailableAspectSlots()).length) })); }
/* 36 */     else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no matching part" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */   public static Object[] getPartConfig(PartEnvironmentBase $this, Context context, Arguments args, ClassTag evidence$2) {
/*    */     Object[] arrayOfObject;
/* 42 */     ForgeDirection side = ExtendedArguments$.MODULE$.extendedArguments(args).checkSideAny(0);
/* 43 */     IPart iPart = $this.host().getPart(side);
/* 44 */     Option option = evidence$2.unapply(iPart); if (!option.isEmpty() && option.get() != null)
/* 45 */     { Unit$ unit$; int slot = resolveAspectSlot($this, (IAspectSlotPart)iPart, args.optInteger(1, 1));
/* 46 */       Option stack = Option$.MODULE$.apply(((IAspectSlotPart)iPart).getAspect(slot));
/* 47 */       Option option1 = stack;
/* 48 */       if (option1 instanceof Some) { Some some = (Some)option1; Aspect aspect = (Aspect)some.x(); String str = aspect.getTag(); }
/* 49 */       else if (None$.MODULE$.equals(option1)) { unit$ = Unit$.MODULE$; } else { throw new MatchError(option1); }
/*    */        arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { unit$ })); }
/* 51 */     else { arrayOfObject = ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { Unit$.MODULE$, "no matching part" })); }
/*    */     
/*    */     return arrayOfObject;
/*    */   }
/*    */   
/*    */   public static Object[] setPartConfig(PartEnvironmentBase $this, Context context, Arguments args, ClassTag evidence$3) {
/*    */     // Byte code:
/*    */     //   0: getstatic li/cil/oc/util/ExtendedArguments$.MODULE$ : Lli/cil/oc/util/ExtendedArguments$;
/*    */     //   3: aload_2
/*    */     //   4: invokevirtual extendedArguments : (Lli/cil/oc/api/machine/Arguments;)Lli/cil/oc/util/ExtendedArguments$ExtendedArguments;
/*    */     //   7: iconst_0
/*    */     //   8: invokevirtual checkSideAny : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   11: astore #4
/*    */     //   13: aload_0
/*    */     //   14: invokeinterface host : ()Lappeng/api/parts/IPartHost;
/*    */     //   19: aload #4
/*    */     //   21: invokeinterface getPart : (Lnet/minecraftforge/common/util/ForgeDirection;)Lappeng/api/parts/IPart;
/*    */     //   26: astore #5
/*    */     //   28: aload_3
/*    */     //   29: aload #5
/*    */     //   31: invokeinterface unapply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   36: astore #6
/*    */     //   38: aload #6
/*    */     //   40: invokevirtual isEmpty : ()Z
/*    */     //   43: ifne -> 235
/*    */     //   46: aload #6
/*    */     //   48: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   51: ifnull -> 235
/*    */     //   54: aload_2
/*    */     //   55: iconst_1
/*    */     //   56: invokeinterface isString : (I)Z
/*    */     //   61: istore #8
/*    */     //   63: aload_0
/*    */     //   64: aload #5
/*    */     //   66: checkcast thaumicenergistics/common/network/IAspectSlotPart
/*    */     //   69: iload #8
/*    */     //   71: ifeq -> 78
/*    */     //   74: iconst_1
/*    */     //   75: goto -> 86
/*    */     //   78: aload_2
/*    */     //   79: iconst_1
/*    */     //   80: iconst_1
/*    */     //   81: invokeinterface optInteger : (II)I
/*    */     //   86: invokestatic resolveAspectSlot : (Lli/cil/oc/integration/thaumicenergistics/PartEnvironmentBase;Lthaumicenergistics/common/network/IAspectSlotPart;I)I
/*    */     //   89: istore #9
/*    */     //   91: iload #8
/*    */     //   93: ifne -> 106
/*    */     //   96: aload_2
/*    */     //   97: invokeinterface count : ()I
/*    */     //   102: iconst_2
/*    */     //   103: if_icmple -> 155
/*    */     //   106: aload_2
/*    */     //   107: iload #8
/*    */     //   109: ifeq -> 116
/*    */     //   112: iconst_1
/*    */     //   113: goto -> 117
/*    */     //   116: iconst_2
/*    */     //   117: invokeinterface checkString : (I)Ljava/lang/String;
/*    */     //   122: invokestatic getAspect : (Ljava/lang/String;)Lthaumcraft/api/aspects/Aspect;
/*    */     //   125: astore #11
/*    */     //   127: aload #11
/*    */     //   129: ifnull -> 145
/*    */     //   132: aload #11
/*    */     //   134: astore #12
/*    */     //   136: aload #12
/*    */     //   138: astore #13
/*    */     //   140: aload #13
/*    */     //   142: goto -> 156
/*    */     //   145: new java/lang/IllegalArgumentException
/*    */     //   148: dup
/*    */     //   149: ldc 'invalid aspect'
/*    */     //   151: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   154: athrow
/*    */     //   155: aconst_null
/*    */     //   156: astore #10
/*    */     //   158: aload_0
/*    */     //   159: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   164: checkcast net/minecraft/world/WorldServer
/*    */     //   167: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*    */     //   170: invokevirtual get : ()Lli/cil/oc/Settings;
/*    */     //   173: invokevirtual fakePlayerProfile : ()Lcom/mojang/authlib/GameProfile;
/*    */     //   176: invokestatic get : (Lnet/minecraft/world/WorldServer;Lcom/mojang/authlib/GameProfile;)Lnet/minecraftforge/common/util/FakePlayer;
/*    */     //   179: astore #14
/*    */     //   181: aload #5
/*    */     //   183: checkcast thaumicenergistics/common/network/IAspectSlotPart
/*    */     //   186: iload #9
/*    */     //   188: aload #10
/*    */     //   190: aload #14
/*    */     //   192: invokeinterface setAspect : (ILthaumcraft/api/aspects/Aspect;Lnet/minecraft/entity/player/EntityPlayer;)V
/*    */     //   197: aload_1
/*    */     //   198: ldc2_w 0.5
/*    */     //   201: invokeinterface pause : (D)Z
/*    */     //   206: pop
/*    */     //   207: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   210: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   213: iconst_1
/*    */     //   214: anewarray java/lang/Object
/*    */     //   217: dup
/*    */     //   218: iconst_0
/*    */     //   219: iconst_1
/*    */     //   220: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   223: aastore
/*    */     //   224: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   227: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   230: astore #7
/*    */     //   232: goto -> 264
/*    */     //   235: getstatic li/cil/oc/util/ResultWrapper$.MODULE$ : Lli/cil/oc/util/ResultWrapper$;
/*    */     //   238: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   241: iconst_2
/*    */     //   242: anewarray java/lang/Object
/*    */     //   245: dup
/*    */     //   246: iconst_0
/*    */     //   247: getstatic scala/Unit$.MODULE$ : Lscala/Unit$;
/*    */     //   250: aastore
/*    */     //   251: dup
/*    */     //   252: iconst_1
/*    */     //   253: ldc 'no matching part'
/*    */     //   255: aastore
/*    */     //   256: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   259: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*    */     //   262: astore #7
/*    */     //   264: aload #7
/*    */     //   266: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #57	-> 0
/*    */     //   #58	-> 13
/*    */     //   #59	-> 28
/*    */     //   #58	-> 46
/*    */     //   #59	-> 48
/*    */     //   #60	-> 54
/*    */     //   #61	-> 63
/*    */     //   #62	-> 91
/*    */     //   #63	-> 106
/*    */     //   #64	-> 127
/*    */     //   #63	-> 140
/*    */     //   #65	-> 145
/*    */     //   #68	-> 155
/*    */     //   #62	-> 156
/*    */     //   #70	-> 158
/*    */     //   #72	-> 181
/*    */     //   #73	-> 197
/*    */     //   #74	-> 207
/*    */     //   #59	-> 230
/*    */     //   #75	-> 235
/*    */     //   #58	-> 264
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	267	0	$this	Lli/cil/oc/integration/thaumicenergistics/PartEnvironmentBase;
/*    */     //   0	267	1	context	Lli/cil/oc/api/machine/Context;
/*    */     //   0	267	2	args	Lli/cil/oc/api/machine/Arguments;
/*    */     //   0	267	3	evidence$3	Lscala/reflect/ClassTag;
/*    */     //   13	253	4	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   63	167	8	noSlotArg	Z
/*    */     //   91	139	9	slot	I
/*    */     //   158	72	10	aspect	Lthaumcraft/api/aspects/Aspect;
/*    */     //   181	49	14	fakePlayer	Lnet/minecraftforge/common/util/FakePlayer;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\PartEnvironmentBase$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */