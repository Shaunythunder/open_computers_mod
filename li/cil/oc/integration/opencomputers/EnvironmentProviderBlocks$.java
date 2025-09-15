/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.driver.EnvironmentProvider;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class EnvironmentProviderBlocks$
/*    */   implements EnvironmentProvider
/*    */ {
/*    */   public static final EnvironmentProviderBlocks$ MODULE$;
/*    */   
/*    */   private EnvironmentProviderBlocks$() {
/* 22 */     MODULE$ = this;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Class<?> getEnvironment(ItemStack stack) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   4: astore_2
/*    */     //   5: aload_2
/*    */     //   6: instanceof net/minecraft/item/ItemBlock
/*    */     //   9: ifeq -> 414
/*    */     //   12: aload_2
/*    */     //   13: checkcast net/minecraft/item/ItemBlock
/*    */     //   16: astore_3
/*    */     //   17: aload_3
/*    */     //   18: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   21: ifnull -> 414
/*    */     //   24: aload_0
/*    */     //   25: aload_3
/*    */     //   26: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   29: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   32: iconst_1
/*    */     //   33: anewarray java/lang/String
/*    */     //   36: dup
/*    */     //   37: iconst_0
/*    */     //   38: ldc 'accessPoint'
/*    */     //   40: aastore
/*    */     //   41: checkcast [Ljava/lang/Object;
/*    */     //   44: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   47: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   50: ifeq -> 58
/*    */     //   53: ldc li/cil/oc/common/tileentity/AccessPoint
/*    */     //   55: goto -> 409
/*    */     //   58: aload_0
/*    */     //   59: aload_3
/*    */     //   60: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   63: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   66: iconst_1
/*    */     //   67: anewarray java/lang/String
/*    */     //   70: dup
/*    */     //   71: iconst_0
/*    */     //   72: ldc 'assembler'
/*    */     //   74: aastore
/*    */     //   75: checkcast [Ljava/lang/Object;
/*    */     //   78: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   81: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   84: ifeq -> 92
/*    */     //   87: ldc li/cil/oc/common/tileentity/Assembler
/*    */     //   89: goto -> 409
/*    */     //   92: aload_0
/*    */     //   93: aload_3
/*    */     //   94: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   97: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   100: iconst_5
/*    */     //   101: anewarray java/lang/String
/*    */     //   104: dup
/*    */     //   105: iconst_0
/*    */     //   106: ldc 'case1'
/*    */     //   108: aastore
/*    */     //   109: dup
/*    */     //   110: iconst_1
/*    */     //   111: ldc 'case2'
/*    */     //   113: aastore
/*    */     //   114: dup
/*    */     //   115: iconst_2
/*    */     //   116: ldc 'case3'
/*    */     //   118: aastore
/*    */     //   119: dup
/*    */     //   120: iconst_3
/*    */     //   121: ldc 'caseCreative'
/*    */     //   123: aastore
/*    */     //   124: dup
/*    */     //   125: iconst_4
/*    */     //   126: ldc 'microcontroller'
/*    */     //   128: aastore
/*    */     //   129: checkcast [Ljava/lang/Object;
/*    */     //   132: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   135: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   138: ifeq -> 146
/*    */     //   141: ldc li/cil/oc/server/machine/Machine
/*    */     //   143: goto -> 409
/*    */     //   146: aload_0
/*    */     //   147: aload_3
/*    */     //   148: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   151: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   154: iconst_2
/*    */     //   155: anewarray java/lang/String
/*    */     //   158: dup
/*    */     //   159: iconst_0
/*    */     //   160: ldc 'hologram1'
/*    */     //   162: aastore
/*    */     //   163: dup
/*    */     //   164: iconst_1
/*    */     //   165: ldc 'hologram2'
/*    */     //   167: aastore
/*    */     //   168: checkcast [Ljava/lang/Object;
/*    */     //   171: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   174: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   177: ifeq -> 185
/*    */     //   180: ldc li/cil/oc/common/tileentity/Hologram
/*    */     //   182: goto -> 409
/*    */     //   185: aload_0
/*    */     //   186: aload_3
/*    */     //   187: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   190: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   193: iconst_1
/*    */     //   194: anewarray java/lang/String
/*    */     //   197: dup
/*    */     //   198: iconst_0
/*    */     //   199: ldc 'printer'
/*    */     //   201: aastore
/*    */     //   202: checkcast [Ljava/lang/Object;
/*    */     //   205: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   208: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   211: ifeq -> 219
/*    */     //   214: ldc li/cil/oc/common/tileentity/Printer
/*    */     //   216: goto -> 409
/*    */     //   219: aload_0
/*    */     //   220: aload_3
/*    */     //   221: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   224: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   227: iconst_1
/*    */     //   228: anewarray java/lang/String
/*    */     //   231: dup
/*    */     //   232: iconst_0
/*    */     //   233: ldc 'redstone'
/*    */     //   235: aastore
/*    */     //   236: checkcast [Ljava/lang/Object;
/*    */     //   239: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   242: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   245: ifeq -> 267
/*    */     //   248: getstatic li/cil/oc/integration/util/BundledRedstone$.MODULE$ : Lli/cil/oc/integration/util/BundledRedstone$;
/*    */     //   251: invokevirtual isAvailable : ()Z
/*    */     //   254: ifeq -> 262
/*    */     //   257: ldc li/cil/oc/server/component/Redstone$Bundled
/*    */     //   259: goto -> 409
/*    */     //   262: ldc li/cil/oc/server/component/Redstone$Vanilla
/*    */     //   264: goto -> 409
/*    */     //   267: aload_0
/*    */     //   268: aload_3
/*    */     //   269: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   272: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   275: iconst_1
/*    */     //   276: anewarray java/lang/String
/*    */     //   279: dup
/*    */     //   280: iconst_0
/*    */     //   281: ldc 'screen1'
/*    */     //   283: aastore
/*    */     //   284: checkcast [Ljava/lang/Object;
/*    */     //   287: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   290: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   293: ifeq -> 301
/*    */     //   296: ldc li/cil/oc/common/component/TextBuffer
/*    */     //   298: goto -> 409
/*    */     //   301: aload_0
/*    */     //   302: aload_3
/*    */     //   303: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   306: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   309: iconst_2
/*    */     //   310: anewarray java/lang/String
/*    */     //   313: dup
/*    */     //   314: iconst_0
/*    */     //   315: ldc 'screen2'
/*    */     //   317: aastore
/*    */     //   318: dup
/*    */     //   319: iconst_1
/*    */     //   320: ldc 'screen3'
/*    */     //   322: aastore
/*    */     //   323: checkcast [Ljava/lang/Object;
/*    */     //   326: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   329: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   332: ifeq -> 340
/*    */     //   335: ldc li/cil/oc/common/component/Screen
/*    */     //   337: goto -> 409
/*    */     //   340: aload_0
/*    */     //   341: aload_3
/*    */     //   342: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   345: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   348: iconst_1
/*    */     //   349: anewarray java/lang/String
/*    */     //   352: dup
/*    */     //   353: iconst_0
/*    */     //   354: ldc 'robot'
/*    */     //   356: aastore
/*    */     //   357: checkcast [Ljava/lang/Object;
/*    */     //   360: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   363: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   366: ifeq -> 374
/*    */     //   369: ldc li/cil/oc/server/component/Robot
/*    */     //   371: goto -> 409
/*    */     //   374: aload_0
/*    */     //   375: aload_3
/*    */     //   376: getfield field_150939_a : Lnet/minecraft/block/Block;
/*    */     //   379: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   382: iconst_1
/*    */     //   383: anewarray java/lang/String
/*    */     //   386: dup
/*    */     //   387: iconst_0
/*    */     //   388: ldc 'waypoint'
/*    */     //   390: aastore
/*    */     //   391: checkcast [Ljava/lang/Object;
/*    */     //   394: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   397: invokespecial isOneOf : (Lnet/minecraft/block/Block;Lscala/collection/Seq;)Z
/*    */     //   400: ifeq -> 408
/*    */     //   403: ldc li/cil/oc/common/tileentity/Waypoint
/*    */     //   405: goto -> 409
/*    */     //   408: aconst_null
/*    */     //   409: astore #4
/*    */     //   411: goto -> 454
/*    */     //   414: aload_1
/*    */     //   415: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   418: ldc 'drone'
/*    */     //   420: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   423: astore #5
/*    */     //   425: dup
/*    */     //   426: ifnonnull -> 438
/*    */     //   429: pop
/*    */     //   430: aload #5
/*    */     //   432: ifnull -> 446
/*    */     //   435: goto -> 451
/*    */     //   438: aload #5
/*    */     //   440: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   443: ifeq -> 451
/*    */     //   446: ldc li/cil/oc/server/component/Drone
/*    */     //   448: goto -> 452
/*    */     //   451: aconst_null
/*    */     //   452: astore #4
/*    */     //   454: aload #4
/*    */     //   456: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 0
/*    */     //   #24	-> 5
/*    */     //   #25	-> 24
/*    */     //   #26	-> 58
/*    */     //   #27	-> 92
/*    */     //   #28	-> 146
/*    */     //   #29	-> 185
/*    */     //   #30	-> 219
/*    */     //   #31	-> 267
/*    */     //   #32	-> 301
/*    */     //   #33	-> 340
/*    */     //   #34	-> 374
/*    */     //   #35	-> 408
/*    */     //   #25	-> 409
/*    */     //   #37	-> 414
/*    */     //   #38	-> 451
/*    */     //   #37	-> 452
/*    */     //   #23	-> 454
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	457	0	this	Lli/cil/oc/integration/opencomputers/EnvironmentProviderBlocks$;
/*    */     //   0	457	1	stack	Lnet/minecraft/item/ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private boolean isOneOf(Block block, Seq names)
/*    */   {
/* 41 */     return names.exists((Function1)new EnvironmentProviderBlocks$$anonfun$isOneOf$1(block)); } public final class EnvironmentProviderBlocks$$anonfun$isOneOf$1 extends AbstractFunction1<String, Object> implements Serializable { public final boolean apply(String x$1) { Block block = this.block$1; if (Items.get(x$1).block() == null) { Items.get(x$1).block(); if (block != null); } else if (Items.get(x$1).block().equals(block))
/*    */       {  }
/*    */        }
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Block block$1;
/*    */     
/*    */     public EnvironmentProviderBlocks$$anonfun$isOneOf$1(Block block$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\EnvironmentProviderBlocks$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */