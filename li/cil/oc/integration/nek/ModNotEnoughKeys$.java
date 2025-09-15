/*    */ package li.cil.oc.integration.nek;
/*    */ 
/*    */ import cpw.mods.fml.common.FMLCommonHandler;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import li.cil.oc.integration.Mod;
/*    */ import net.minecraft.client.settings.KeyBinding;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ public final class ModNotEnoughKeys$ implements ModProxy {
/*    */   public static final ModNotEnoughKeys$ MODULE$;
/*    */   
/* 16 */   private ModNotEnoughKeys$() { MODULE$ = this; } public final class ModNotEnoughKeys$$anonfun$initialize$1 extends AbstractFunction1<KeyBinding, Object> implements Serializable {
/* 17 */     public static final long serialVersionUID = 0L; public final boolean apply(KeyBinding kb) { return ModNotEnoughKeys$.MODULE$.isKeyBindingPressed(kb); } } public Mods.SimpleMod getMod() { return li.cil.oc.integration.Mods$.MODULE$.NotEnoughKeys(); }
/*    */   
/*    */   public void initialize() {
/* 20 */     Side side = Side.CLIENT; if (FMLCommonHandler.instance().getSide() == null) { FMLCommonHandler.instance().getSide(); if (side != null) return;  } else { if (FMLCommonHandler.instance().getSide().equals(side))
/* 21 */       { Api.registerMod("OpenComputers", new String[] { li.cil.oc.client.KeyBindings$.MODULE$.clipboardPaste().func_151464_g(), li.cil.oc.client.KeyBindings$.MODULE$.materialCosts().func_151464_g() });
/*    */         
/* 23 */         (new Function1[1])[0] = (Function1)new ModNotEnoughKeys$$anonfun$initialize$1(); li.cil.oc.client.KeyBindings$.MODULE$.keyBindingChecks().append((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Function1[1]));
/* 24 */         (new Function1[1])[0] = (Function1)new ModNotEnoughKeys$$anonfun$initialize$2(); li.cil.oc.client.KeyBindings$.MODULE$.keyBindingNameGetters().prepend((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Function1[1])); return; }  return; }  Api.registerMod("OpenComputers", new String[] { li.cil.oc.client.KeyBindings$.MODULE$.clipboardPaste().func_151464_g(), li.cil.oc.client.KeyBindings$.MODULE$.materialCosts().func_151464_g() }); (new Function1[1])[0] = (Function1)new ModNotEnoughKeys$$anonfun$initialize$1(); li.cil.oc.client.KeyBindings$.MODULE$.keyBindingChecks().append((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Function1[1])); (new Function1[1])[0] = (Function1)new ModNotEnoughKeys$$anonfun$initialize$2(); li.cil.oc.client.KeyBindings$.MODULE$.keyBindingNameGetters().prepend((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Function1[1])); } public final class ModNotEnoughKeys$$anonfun$initialize$2 extends AbstractFunction1<KeyBinding, Option<String>> implements Serializable { public final Option<String> apply(KeyBinding kb) { return ModNotEnoughKeys$.MODULE$.getKeyBindingName(kb); }
/*    */ 
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L; }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isKeyBindingPressed(KeyBinding kb) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokestatic isKeyPressed_KeyBoard : (Lnet/minecraft/client/settings/KeyBinding;)Z
/*    */     //   4: ifeq -> 192
/*    */     //   7: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   10: getstatic modwarriors/notenoughkeys/keys/KeyHelper.alternates : Ljava/util/HashMap;
/*    */     //   13: aload_1
/*    */     //   14: invokevirtual func_151464_g : ()Ljava/lang/String;
/*    */     //   17: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   20: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   23: astore_2
/*    */     //   24: aload_2
/*    */     //   25: instanceof scala/Some
/*    */     //   28: ifeq -> 180
/*    */     //   31: aload_2
/*    */     //   32: checkcast scala/Some
/*    */     //   35: astore_3
/*    */     //   36: aload_3
/*    */     //   37: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   40: checkcast [Z
/*    */     //   43: astore #4
/*    */     //   45: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   48: aload #4
/*    */     //   50: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   53: astore #5
/*    */     //   55: aload #5
/*    */     //   57: invokevirtual isEmpty : ()Z
/*    */     //   60: ifne -> 180
/*    */     //   63: aload #5
/*    */     //   65: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   68: ifnull -> 180
/*    */     //   71: aload #5
/*    */     //   73: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   76: checkcast scala/collection/SeqLike
/*    */     //   79: iconst_3
/*    */     //   80: invokeinterface lengthCompare : (I)I
/*    */     //   85: iconst_0
/*    */     //   86: if_icmpne -> 180
/*    */     //   89: aload #5
/*    */     //   91: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   94: checkcast scala/collection/SeqLike
/*    */     //   97: iconst_0
/*    */     //   98: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   103: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*    */     //   106: istore #6
/*    */     //   108: aload #5
/*    */     //   110: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   113: checkcast scala/collection/SeqLike
/*    */     //   116: iconst_1
/*    */     //   117: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   122: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*    */     //   125: istore #7
/*    */     //   127: aload #5
/*    */     //   129: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   132: checkcast scala/collection/SeqLike
/*    */     //   135: iconst_2
/*    */     //   136: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   141: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*    */     //   144: istore #8
/*    */     //   146: invokestatic isShiftKeyDown : ()Z
/*    */     //   149: iload #6
/*    */     //   151: if_icmpne -> 174
/*    */     //   154: invokestatic isCtrlKeyDown : ()Z
/*    */     //   157: iload #7
/*    */     //   159: if_icmpne -> 174
/*    */     //   162: invokestatic isAltKeyDown : ()Z
/*    */     //   165: iload #8
/*    */     //   167: if_icmpne -> 174
/*    */     //   170: iconst_1
/*    */     //   171: goto -> 175
/*    */     //   174: iconst_0
/*    */     //   175: istore #9
/*    */     //   177: goto -> 183
/*    */     //   180: iconst_1
/*    */     //   181: istore #9
/*    */     //   183: iload #9
/*    */     //   185: ifeq -> 192
/*    */     //   188: iconst_1
/*    */     //   189: goto -> 198
/*    */     //   192: iconst_0
/*    */     //   193: goto -> 198
/*    */     //   196: pop
/*    */     //   197: iconst_1
/*    */     //   198: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 0
/*    */     //   #30	-> 24
/*    */     //   #31	-> 146
/*    */     //   #32	-> 154
/*    */     //   #33	-> 162
/*    */     //   #32	-> 170
/*    */     //   #34	-> 180
/*    */     //   #29	-> 183
/*    */     //   #28	-> 196
/*    */     //   #38	-> 197
/*    */     //   #28	-> 198
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	199	0	this	Lli/cil/oc/integration/nek/ModNotEnoughKeys$;
/*    */     //   0	199	1	kb	Lnet/minecraft/client/settings/KeyBinding;
/*    */     //   108	91	6	shift	Z
/*    */     //   127	72	7	ctrl	Z
/*    */     //   146	53	8	alt	Z
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	196	196	finally
/*    */   }
/*    */ 
/*    */   
/*    */   public Option<String> getKeyBindingName(KeyBinding kb) {
/*    */     // Byte code:
/*    */     //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   3: getstatic modwarriors/notenoughkeys/keys/KeyHelper.alternates : Ljava/util/HashMap;
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual func_151464_g : ()Ljava/lang/String;
/*    */     //   10: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   13: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   16: astore_2
/*    */     //   17: aload_2
/*    */     //   18: instanceof scala/Some
/*    */     //   21: ifeq -> 282
/*    */     //   24: aload_2
/*    */     //   25: checkcast scala/Some
/*    */     //   28: astore_3
/*    */     //   29: aload_3
/*    */     //   30: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   33: checkcast [Z
/*    */     //   36: astore #4
/*    */     //   38: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*    */     //   41: aload #4
/*    */     //   43: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   46: astore #5
/*    */     //   48: aload #5
/*    */     //   50: invokevirtual isEmpty : ()Z
/*    */     //   53: ifne -> 282
/*    */     //   56: aload #5
/*    */     //   58: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   61: ifnull -> 282
/*    */     //   64: aload #5
/*    */     //   66: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   69: checkcast scala/collection/SeqLike
/*    */     //   72: iconst_3
/*    */     //   73: invokeinterface lengthCompare : (I)I
/*    */     //   78: iconst_0
/*    */     //   79: if_icmpne -> 282
/*    */     //   82: aload #5
/*    */     //   84: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   87: checkcast scala/collection/SeqLike
/*    */     //   90: iconst_0
/*    */     //   91: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   96: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*    */     //   99: istore #6
/*    */     //   101: aload #5
/*    */     //   103: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   106: checkcast scala/collection/SeqLike
/*    */     //   109: iconst_1
/*    */     //   110: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   115: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*    */     //   118: istore #7
/*    */     //   120: aload #5
/*    */     //   122: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   125: checkcast scala/collection/SeqLike
/*    */     //   128: iconst_2
/*    */     //   129: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   134: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*    */     //   137: istore #8
/*    */     //   139: aload_1
/*    */     //   140: invokevirtual func_151463_i : ()I
/*    */     //   143: invokestatic func_74298_c : (I)Ljava/lang/String;
/*    */     //   146: astore #10
/*    */     //   148: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   151: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   154: iconst_3
/*    */     //   155: anewarray java/lang/String
/*    */     //   158: dup
/*    */     //   159: iconst_0
/*    */     //   160: iload #7
/*    */     //   162: ifeq -> 173
/*    */     //   165: bipush #29
/*    */     //   167: invokestatic func_74298_c : (I)Ljava/lang/String;
/*    */     //   170: goto -> 174
/*    */     //   173: aconst_null
/*    */     //   174: aastore
/*    */     //   175: dup
/*    */     //   176: iconst_1
/*    */     //   177: iload #8
/*    */     //   179: ifeq -> 190
/*    */     //   182: bipush #56
/*    */     //   184: invokestatic func_74298_c : (I)Ljava/lang/String;
/*    */     //   187: goto -> 191
/*    */     //   190: aconst_null
/*    */     //   191: aastore
/*    */     //   192: dup
/*    */     //   193: iconst_2
/*    */     //   194: iload #6
/*    */     //   196: ifeq -> 207
/*    */     //   199: bipush #42
/*    */     //   201: invokestatic func_74298_c : (I)Ljava/lang/String;
/*    */     //   204: goto -> 208
/*    */     //   207: aconst_null
/*    */     //   208: aastore
/*    */     //   209: checkcast [Ljava/lang/Object;
/*    */     //   212: checkcast [Ljava/lang/Object;
/*    */     //   215: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */     //   218: new li/cil/oc/integration/nek/ModNotEnoughKeys$$anonfun$1
/*    */     //   221: dup
/*    */     //   222: invokespecial <init> : ()V
/*    */     //   225: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*    */     //   230: checkcast [Ljava/lang/Object;
/*    */     //   233: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*    */     //   236: ldc '+'
/*    */     //   238: invokeinterface mkString : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   243: astore #11
/*    */     //   245: new scala/Some
/*    */     //   248: dup
/*    */     //   249: new scala/collection/mutable/StringBuilder
/*    */     //   252: dup
/*    */     //   253: invokespecial <init> : ()V
/*    */     //   256: aload #11
/*    */     //   258: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   261: ldc '+'
/*    */     //   263: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   266: aload #10
/*    */     //   268: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*    */     //   271: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   274: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   277: astore #9
/*    */     //   279: goto -> 287
/*    */     //   282: getstatic scala/None$.MODULE$ : Lscala/None$;
/*    */     //   285: astore #9
/*    */     //   287: aload #9
/*    */     //   289: goto -> 296
/*    */     //   292: pop
/*    */     //   293: getstatic scala/None$.MODULE$ : Lscala/None$;
/*    */     //   296: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 0
/*    */     //   #43	-> 17
/*    */     //   #44	-> 139
/*    */     //   #49	-> 148
/*    */     //   #45	-> 151
/*    */     //   #46	-> 160
/*    */     //   #45	-> 175
/*    */     //   #47	-> 177
/*    */     //   #45	-> 192
/*    */     //   #48	-> 194
/*    */     //   #45	-> 215
/*    */     //   #49	-> 218
/*    */     //   #50	-> 236
/*    */     //   #45	-> 243
/*    */     //   #51	-> 245
/*    */     //   #43	-> 277
/*    */     //   #52	-> 282
/*    */     //   #42	-> 287
/*    */     //   #41	-> 292
/*    */     //   #56	-> 293
/*    */     //   #41	-> 296
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	297	0	this	Lli/cil/oc/integration/nek/ModNotEnoughKeys$;
/*    */     //   0	297	1	kb	Lnet/minecraft/client/settings/KeyBinding;
/*    */     //   101	196	6	shift	Z
/*    */     //   120	177	7	ctrl	Z
/*    */     //   139	158	8	alt	Z
/*    */     //   148	129	10	baseName	Ljava/lang/String;
/*    */     //   245	32	11	modifierNames	Ljava/lang/String;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	292	292	finally
/*    */   }
/*    */ 
/*    */   
/*    */   public final class ModNotEnoughKeys$$anonfun$1
/*    */     extends AbstractFunction1<String, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(String x$1) {
/* 49 */       return !(x$1 == null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nek\ModNotEnoughKeys$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */