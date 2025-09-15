/*     */ package li.cil.oc.common;
/*     */ 
/*     */ import cpw.mods.fml.common.event.FMLInterModComms;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.util.List;
/*     */ import net.minecraft.nbt.NBTTagString;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.StringContext;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class IMC$
/*     */ {
/*     */   public static final IMC$ MODULE$;
/*     */   
/*     */   public void handleEvent(FMLInterModComms.IMCEvent e) {
/*  26 */     scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer((List)e.getMessages()).foreach((Function1)new IMC$$anonfun$handleEvent$1());
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
/*     */   public final class IMC$$anonfun$handleEvent$1
/*     */     extends AbstractFunction1<FMLInterModComms.IMCMessage, Object>
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object apply(FMLInterModComms.IMCMessage message) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: getfield key : Ljava/lang/String;
/*     */       //   4: ldc 'registerAssemblerTemplate'
/*     */       //   6: astore_2
/*     */       //   7: dup
/*     */       //   8: ifnonnull -> 19
/*     */       //   11: pop
/*     */       //   12: aload_2
/*     */       //   13: ifnull -> 26
/*     */       //   16: goto -> 205
/*     */       //   19: aload_2
/*     */       //   20: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   23: ifeq -> 205
/*     */       //   26: aload_1
/*     */       //   27: invokevirtual isNBTMessage : ()Z
/*     */       //   30: ifeq -> 205
/*     */       //   33: aload_1
/*     */       //   34: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   37: ldc 'name'
/*     */       //   39: bipush #8
/*     */       //   41: invokevirtual func_150297_b : (Ljava/lang/String;I)Z
/*     */       //   44: ifeq -> 128
/*     */       //   47: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   50: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   53: new scala/StringContext
/*     */       //   56: dup
/*     */       //   57: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   60: iconst_3
/*     */       //   61: anewarray java/lang/String
/*     */       //   64: dup
/*     */       //   65: iconst_0
/*     */       //   66: ldc 'Registering new assembler template ''
/*     */       //   68: aastore
/*     */       //   69: dup
/*     */       //   70: iconst_1
/*     */       //   71: ldc '' from mod '
/*     */       //   73: aastore
/*     */       //   74: dup
/*     */       //   75: iconst_2
/*     */       //   76: ldc '.'
/*     */       //   78: aastore
/*     */       //   79: checkcast [Ljava/lang/Object;
/*     */       //   82: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   85: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   88: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   91: iconst_2
/*     */       //   92: anewarray java/lang/Object
/*     */       //   95: dup
/*     */       //   96: iconst_0
/*     */       //   97: aload_1
/*     */       //   98: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   101: ldc 'name'
/*     */       //   103: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   106: aastore
/*     */       //   107: dup
/*     */       //   108: iconst_1
/*     */       //   109: aload_1
/*     */       //   110: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   113: aastore
/*     */       //   114: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   117: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   120: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   125: goto -> 189
/*     */       //   128: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   131: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   134: new scala/StringContext
/*     */       //   137: dup
/*     */       //   138: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   141: iconst_2
/*     */       //   142: anewarray java/lang/String
/*     */       //   145: dup
/*     */       //   146: iconst_0
/*     */       //   147: ldc 'Registering new, unnamed assembler template from mod '
/*     */       //   149: aastore
/*     */       //   150: dup
/*     */       //   151: iconst_1
/*     */       //   152: ldc '.'
/*     */       //   154: aastore
/*     */       //   155: checkcast [Ljava/lang/Object;
/*     */       //   158: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   161: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   164: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   167: iconst_1
/*     */       //   168: anewarray java/lang/Object
/*     */       //   171: dup
/*     */       //   172: iconst_0
/*     */       //   173: aload_1
/*     */       //   174: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   177: aastore
/*     */       //   178: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   181: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   184: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   189: getstatic li/cil/oc/common/template/AssemblerTemplates$.MODULE$ : Lli/cil/oc/common/template/AssemblerTemplates$;
/*     */       //   192: aload_1
/*     */       //   193: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   196: invokevirtual add : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */       //   199: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   202: goto -> 2209
/*     */       //   205: aload_1
/*     */       //   206: getfield key : Ljava/lang/String;
/*     */       //   209: ldc 'registerDisassemblerTemplate'
/*     */       //   211: astore #4
/*     */       //   213: dup
/*     */       //   214: ifnonnull -> 226
/*     */       //   217: pop
/*     */       //   218: aload #4
/*     */       //   220: ifnull -> 234
/*     */       //   223: goto -> 413
/*     */       //   226: aload #4
/*     */       //   228: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   231: ifeq -> 413
/*     */       //   234: aload_1
/*     */       //   235: invokevirtual isNBTMessage : ()Z
/*     */       //   238: ifeq -> 413
/*     */       //   241: aload_1
/*     */       //   242: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   245: ldc 'name'
/*     */       //   247: bipush #8
/*     */       //   249: invokevirtual func_150297_b : (Ljava/lang/String;I)Z
/*     */       //   252: ifeq -> 336
/*     */       //   255: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   258: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   261: new scala/StringContext
/*     */       //   264: dup
/*     */       //   265: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   268: iconst_3
/*     */       //   269: anewarray java/lang/String
/*     */       //   272: dup
/*     */       //   273: iconst_0
/*     */       //   274: ldc 'Registering new disassembler template ''
/*     */       //   276: aastore
/*     */       //   277: dup
/*     */       //   278: iconst_1
/*     */       //   279: ldc '' from mod '
/*     */       //   281: aastore
/*     */       //   282: dup
/*     */       //   283: iconst_2
/*     */       //   284: ldc '.'
/*     */       //   286: aastore
/*     */       //   287: checkcast [Ljava/lang/Object;
/*     */       //   290: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   293: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   296: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   299: iconst_2
/*     */       //   300: anewarray java/lang/Object
/*     */       //   303: dup
/*     */       //   304: iconst_0
/*     */       //   305: aload_1
/*     */       //   306: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   309: ldc 'name'
/*     */       //   311: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   314: aastore
/*     */       //   315: dup
/*     */       //   316: iconst_1
/*     */       //   317: aload_1
/*     */       //   318: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   321: aastore
/*     */       //   322: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   325: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   328: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   333: goto -> 397
/*     */       //   336: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   339: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   342: new scala/StringContext
/*     */       //   345: dup
/*     */       //   346: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   349: iconst_2
/*     */       //   350: anewarray java/lang/String
/*     */       //   353: dup
/*     */       //   354: iconst_0
/*     */       //   355: ldc 'Registering new, unnamed disassembler template from mod '
/*     */       //   357: aastore
/*     */       //   358: dup
/*     */       //   359: iconst_1
/*     */       //   360: ldc '.'
/*     */       //   362: aastore
/*     */       //   363: checkcast [Ljava/lang/Object;
/*     */       //   366: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   369: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   372: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   375: iconst_1
/*     */       //   376: anewarray java/lang/Object
/*     */       //   379: dup
/*     */       //   380: iconst_0
/*     */       //   381: aload_1
/*     */       //   382: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   385: aastore
/*     */       //   386: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   389: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   392: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   397: getstatic li/cil/oc/common/template/DisassemblerTemplates$.MODULE$ : Lli/cil/oc/common/template/DisassemblerTemplates$;
/*     */       //   400: aload_1
/*     */       //   401: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   404: invokevirtual add : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */       //   407: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   410: goto -> 2209
/*     */       //   413: aload_1
/*     */       //   414: getfield key : Ljava/lang/String;
/*     */       //   417: ldc 'registerToolDurabilityProvider'
/*     */       //   419: astore #6
/*     */       //   421: dup
/*     */       //   422: ifnonnull -> 434
/*     */       //   425: pop
/*     */       //   426: aload #6
/*     */       //   428: ifnull -> 442
/*     */       //   431: goto -> 562
/*     */       //   434: aload #6
/*     */       //   436: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   439: ifeq -> 562
/*     */       //   442: aload_1
/*     */       //   443: invokevirtual isStringMessage : ()Z
/*     */       //   446: ifeq -> 562
/*     */       //   449: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   452: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   455: new scala/StringContext
/*     */       //   458: dup
/*     */       //   459: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   462: iconst_3
/*     */       //   463: anewarray java/lang/String
/*     */       //   466: dup
/*     */       //   467: iconst_0
/*     */       //   468: ldc 'Registering new tool durability provider ''
/*     */       //   470: aastore
/*     */       //   471: dup
/*     */       //   472: iconst_1
/*     */       //   473: ldc '' from mod '
/*     */       //   475: aastore
/*     */       //   476: dup
/*     */       //   477: iconst_2
/*     */       //   478: ldc '.'
/*     */       //   480: aastore
/*     */       //   481: checkcast [Ljava/lang/Object;
/*     */       //   484: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   487: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   490: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   493: iconst_2
/*     */       //   494: anewarray java/lang/Object
/*     */       //   497: dup
/*     */       //   498: iconst_0
/*     */       //   499: aload_1
/*     */       //   500: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   503: aastore
/*     */       //   504: dup
/*     */       //   505: iconst_1
/*     */       //   506: aload_1
/*     */       //   507: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   510: aastore
/*     */       //   511: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   514: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   517: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   522: getstatic li/cil/oc/common/ToolDurabilityProviders$.MODULE$ : Lli/cil/oc/common/ToolDurabilityProviders$;
/*     */       //   525: getstatic li/cil/oc/common/IMC$.MODULE$ : Lli/cil/oc/common/IMC$;
/*     */       //   528: aload_1
/*     */       //   529: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   532: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   535: iconst_1
/*     */       //   536: anewarray java/lang/Class
/*     */       //   539: dup
/*     */       //   540: iconst_0
/*     */       //   541: ldc net/minecraft/item/ItemStack
/*     */       //   543: aastore
/*     */       //   544: checkcast [Ljava/lang/Object;
/*     */       //   547: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   550: invokevirtual getStaticMethod : (Ljava/lang/String;Lscala/collection/Seq;)Ljava/lang/reflect/Method;
/*     */       //   553: invokevirtual add : (Ljava/lang/reflect/Method;)V
/*     */       //   556: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   559: goto -> 2209
/*     */       //   562: aload_1
/*     */       //   563: getfield key : Ljava/lang/String;
/*     */       //   566: ldc 'registerWrenchTool'
/*     */       //   568: astore #8
/*     */       //   570: dup
/*     */       //   571: ifnonnull -> 583
/*     */       //   574: pop
/*     */       //   575: aload #8
/*     */       //   577: ifnull -> 591
/*     */       //   580: goto -> 735
/*     */       //   583: aload #8
/*     */       //   585: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   588: ifeq -> 735
/*     */       //   591: aload_1
/*     */       //   592: invokevirtual isStringMessage : ()Z
/*     */       //   595: ifeq -> 735
/*     */       //   598: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   601: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   604: new scala/StringContext
/*     */       //   607: dup
/*     */       //   608: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   611: iconst_3
/*     */       //   612: anewarray java/lang/String
/*     */       //   615: dup
/*     */       //   616: iconst_0
/*     */       //   617: ldc 'Registering new wrench tool usage ''
/*     */       //   619: aastore
/*     */       //   620: dup
/*     */       //   621: iconst_1
/*     */       //   622: ldc '' from mod '
/*     */       //   624: aastore
/*     */       //   625: dup
/*     */       //   626: iconst_2
/*     */       //   627: ldc '.'
/*     */       //   629: aastore
/*     */       //   630: checkcast [Ljava/lang/Object;
/*     */       //   633: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   636: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   639: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   642: iconst_2
/*     */       //   643: anewarray java/lang/Object
/*     */       //   646: dup
/*     */       //   647: iconst_0
/*     */       //   648: aload_1
/*     */       //   649: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   652: aastore
/*     */       //   653: dup
/*     */       //   654: iconst_1
/*     */       //   655: aload_1
/*     */       //   656: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   659: aastore
/*     */       //   660: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   663: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   666: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   671: getstatic li/cil/oc/integration/util/Wrench$.MODULE$ : Lli/cil/oc/integration/util/Wrench$;
/*     */       //   674: getstatic li/cil/oc/common/IMC$.MODULE$ : Lli/cil/oc/common/IMC$;
/*     */       //   677: aload_1
/*     */       //   678: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   681: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   684: iconst_5
/*     */       //   685: anewarray java/lang/Class
/*     */       //   688: dup
/*     */       //   689: iconst_0
/*     */       //   690: ldc net/minecraft/entity/player/EntityPlayer
/*     */       //   692: aastore
/*     */       //   693: dup
/*     */       //   694: iconst_1
/*     */       //   695: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*     */       //   698: aastore
/*     */       //   699: dup
/*     */       //   700: iconst_2
/*     */       //   701: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*     */       //   704: aastore
/*     */       //   705: dup
/*     */       //   706: iconst_3
/*     */       //   707: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*     */       //   710: aastore
/*     */       //   711: dup
/*     */       //   712: iconst_4
/*     */       //   713: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
/*     */       //   716: aastore
/*     */       //   717: checkcast [Ljava/lang/Object;
/*     */       //   720: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   723: invokevirtual getStaticMethod : (Ljava/lang/String;Lscala/collection/Seq;)Ljava/lang/reflect/Method;
/*     */       //   726: invokevirtual addUsage : (Ljava/lang/reflect/Method;)V
/*     */       //   729: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   732: goto -> 2209
/*     */       //   735: aload_1
/*     */       //   736: getfield key : Ljava/lang/String;
/*     */       //   739: ldc 'registerWrenchToolCheck'
/*     */       //   741: astore #10
/*     */       //   743: dup
/*     */       //   744: ifnonnull -> 756
/*     */       //   747: pop
/*     */       //   748: aload #10
/*     */       //   750: ifnull -> 764
/*     */       //   753: goto -> 884
/*     */       //   756: aload #10
/*     */       //   758: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   761: ifeq -> 884
/*     */       //   764: aload_1
/*     */       //   765: invokevirtual isStringMessage : ()Z
/*     */       //   768: ifeq -> 884
/*     */       //   771: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   774: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   777: new scala/StringContext
/*     */       //   780: dup
/*     */       //   781: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   784: iconst_3
/*     */       //   785: anewarray java/lang/String
/*     */       //   788: dup
/*     */       //   789: iconst_0
/*     */       //   790: ldc 'Registering new wrench tool check ''
/*     */       //   792: aastore
/*     */       //   793: dup
/*     */       //   794: iconst_1
/*     */       //   795: ldc '' from mod '
/*     */       //   797: aastore
/*     */       //   798: dup
/*     */       //   799: iconst_2
/*     */       //   800: ldc '.'
/*     */       //   802: aastore
/*     */       //   803: checkcast [Ljava/lang/Object;
/*     */       //   806: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   809: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   812: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   815: iconst_2
/*     */       //   816: anewarray java/lang/Object
/*     */       //   819: dup
/*     */       //   820: iconst_0
/*     */       //   821: aload_1
/*     */       //   822: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   825: aastore
/*     */       //   826: dup
/*     */       //   827: iconst_1
/*     */       //   828: aload_1
/*     */       //   829: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   832: aastore
/*     */       //   833: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   836: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   839: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   844: getstatic li/cil/oc/integration/util/Wrench$.MODULE$ : Lli/cil/oc/integration/util/Wrench$;
/*     */       //   847: getstatic li/cil/oc/common/IMC$.MODULE$ : Lli/cil/oc/common/IMC$;
/*     */       //   850: aload_1
/*     */       //   851: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   854: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   857: iconst_1
/*     */       //   858: anewarray java/lang/Class
/*     */       //   861: dup
/*     */       //   862: iconst_0
/*     */       //   863: ldc net/minecraft/item/ItemStack
/*     */       //   865: aastore
/*     */       //   866: checkcast [Ljava/lang/Object;
/*     */       //   869: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   872: invokevirtual getStaticMethod : (Ljava/lang/String;Lscala/collection/Seq;)Ljava/lang/reflect/Method;
/*     */       //   875: invokevirtual addCheck : (Ljava/lang/reflect/Method;)V
/*     */       //   878: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   881: goto -> 2209
/*     */       //   884: aload_1
/*     */       //   885: getfield key : Ljava/lang/String;
/*     */       //   888: ldc 'registerItemCharge'
/*     */       //   890: astore #12
/*     */       //   892: dup
/*     */       //   893: ifnonnull -> 905
/*     */       //   896: pop
/*     */       //   897: aload #12
/*     */       //   899: ifnull -> 913
/*     */       //   902: goto -> 1088
/*     */       //   905: aload #12
/*     */       //   907: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   910: ifeq -> 1088
/*     */       //   913: aload_1
/*     */       //   914: invokevirtual isNBTMessage : ()Z
/*     */       //   917: ifeq -> 1088
/*     */       //   920: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   923: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   926: new scala/StringContext
/*     */       //   929: dup
/*     */       //   930: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   933: iconst_3
/*     */       //   934: anewarray java/lang/String
/*     */       //   937: dup
/*     */       //   938: iconst_0
/*     */       //   939: ldc 'Registering new item charge implementation ''
/*     */       //   941: aastore
/*     */       //   942: dup
/*     */       //   943: iconst_1
/*     */       //   944: ldc '' from mod '
/*     */       //   946: aastore
/*     */       //   947: dup
/*     */       //   948: iconst_2
/*     */       //   949: ldc '.'
/*     */       //   951: aastore
/*     */       //   952: checkcast [Ljava/lang/Object;
/*     */       //   955: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   958: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   961: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   964: iconst_2
/*     */       //   965: anewarray java/lang/Object
/*     */       //   968: dup
/*     */       //   969: iconst_0
/*     */       //   970: aload_1
/*     */       //   971: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   974: ldc 'name'
/*     */       //   976: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   979: aastore
/*     */       //   980: dup
/*     */       //   981: iconst_1
/*     */       //   982: aload_1
/*     */       //   983: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   986: aastore
/*     */       //   987: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   990: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   993: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   998: getstatic li/cil/oc/integration/util/ItemCharge$.MODULE$ : Lli/cil/oc/integration/util/ItemCharge$;
/*     */       //   1001: getstatic li/cil/oc/common/IMC$.MODULE$ : Lli/cil/oc/common/IMC$;
/*     */       //   1004: aload_1
/*     */       //   1005: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1008: ldc 'canCharge'
/*     */       //   1010: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1013: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1016: iconst_1
/*     */       //   1017: anewarray java/lang/Class
/*     */       //   1020: dup
/*     */       //   1021: iconst_0
/*     */       //   1022: ldc net/minecraft/item/ItemStack
/*     */       //   1024: aastore
/*     */       //   1025: checkcast [Ljava/lang/Object;
/*     */       //   1028: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1031: invokevirtual getStaticMethod : (Ljava/lang/String;Lscala/collection/Seq;)Ljava/lang/reflect/Method;
/*     */       //   1034: getstatic li/cil/oc/common/IMC$.MODULE$ : Lli/cil/oc/common/IMC$;
/*     */       //   1037: aload_1
/*     */       //   1038: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1041: ldc 'charge'
/*     */       //   1043: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1046: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1049: iconst_3
/*     */       //   1050: anewarray java/lang/Class
/*     */       //   1053: dup
/*     */       //   1054: iconst_0
/*     */       //   1055: ldc net/minecraft/item/ItemStack
/*     */       //   1057: aastore
/*     */       //   1058: dup
/*     */       //   1059: iconst_1
/*     */       //   1060: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
/*     */       //   1063: aastore
/*     */       //   1064: dup
/*     */       //   1065: iconst_2
/*     */       //   1066: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
/*     */       //   1069: aastore
/*     */       //   1070: checkcast [Ljava/lang/Object;
/*     */       //   1073: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1076: invokevirtual getStaticMethod : (Ljava/lang/String;Lscala/collection/Seq;)Ljava/lang/reflect/Method;
/*     */       //   1079: invokevirtual add : (Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
/*     */       //   1082: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1085: goto -> 2209
/*     */       //   1088: aload_1
/*     */       //   1089: getfield key : Ljava/lang/String;
/*     */       //   1092: ldc 'blacklistPeripheral'
/*     */       //   1094: astore #14
/*     */       //   1096: dup
/*     */       //   1097: ifnonnull -> 1109
/*     */       //   1100: pop
/*     */       //   1101: aload #14
/*     */       //   1103: ifnull -> 1117
/*     */       //   1106: goto -> 1248
/*     */       //   1109: aload #14
/*     */       //   1111: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   1114: ifeq -> 1248
/*     */       //   1117: aload_1
/*     */       //   1118: invokevirtual isStringMessage : ()Z
/*     */       //   1121: ifeq -> 1248
/*     */       //   1124: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   1127: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   1130: new scala/StringContext
/*     */       //   1133: dup
/*     */       //   1134: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1137: iconst_3
/*     */       //   1138: anewarray java/lang/String
/*     */       //   1141: dup
/*     */       //   1142: iconst_0
/*     */       //   1143: ldc 'Blacklisting CC peripheral ''
/*     */       //   1145: aastore
/*     */       //   1146: dup
/*     */       //   1147: iconst_1
/*     */       //   1148: ldc '' as requested by mod '
/*     */       //   1150: aastore
/*     */       //   1151: dup
/*     */       //   1152: iconst_2
/*     */       //   1153: ldc '.'
/*     */       //   1155: aastore
/*     */       //   1156: checkcast [Ljava/lang/Object;
/*     */       //   1159: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1162: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   1165: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1168: iconst_2
/*     */       //   1169: anewarray java/lang/Object
/*     */       //   1172: dup
/*     */       //   1173: iconst_0
/*     */       //   1174: aload_1
/*     */       //   1175: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   1178: aastore
/*     */       //   1179: dup
/*     */       //   1180: iconst_1
/*     */       //   1181: aload_1
/*     */       //   1182: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   1185: aastore
/*     */       //   1186: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1189: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   1192: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   1197: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   1200: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   1203: invokevirtual peripheralBlacklist : ()Ljava/util/List;
/*     */       //   1206: aload_1
/*     */       //   1207: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   1210: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   1215: ifeq -> 1224
/*     */       //   1218: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1221: goto -> 2209
/*     */       //   1224: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   1227: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   1230: invokevirtual peripheralBlacklist : ()Ljava/util/List;
/*     */       //   1233: aload_1
/*     */       //   1234: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   1237: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   1242: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   1245: goto -> 2209
/*     */       //   1248: aload_1
/*     */       //   1249: getfield key : Ljava/lang/String;
/*     */       //   1252: ldc_w 'blacklistHost'
/*     */       //   1255: astore #15
/*     */       //   1257: dup
/*     */       //   1258: ifnonnull -> 1270
/*     */       //   1261: pop
/*     */       //   1262: aload #15
/*     */       //   1264: ifnull -> 1278
/*     */       //   1267: goto -> 1421
/*     */       //   1270: aload #15
/*     */       //   1272: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   1275: ifeq -> 1421
/*     */       //   1278: aload_1
/*     */       //   1279: invokevirtual isNBTMessage : ()Z
/*     */       //   1282: ifeq -> 1421
/*     */       //   1285: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   1288: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   1291: new scala/StringContext
/*     */       //   1294: dup
/*     */       //   1295: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1298: iconst_4
/*     */       //   1299: anewarray java/lang/String
/*     */       //   1302: dup
/*     */       //   1303: iconst_0
/*     */       //   1304: ldc_w 'Blacklisting component ''
/*     */       //   1307: aastore
/*     */       //   1308: dup
/*     */       //   1309: iconst_1
/*     */       //   1310: ldc_w '' for host ''
/*     */       //   1313: aastore
/*     */       //   1314: dup
/*     */       //   1315: iconst_2
/*     */       //   1316: ldc '' as requested by mod '
/*     */       //   1318: aastore
/*     */       //   1319: dup
/*     */       //   1320: iconst_3
/*     */       //   1321: ldc '.'
/*     */       //   1323: aastore
/*     */       //   1324: checkcast [Ljava/lang/Object;
/*     */       //   1327: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1330: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   1333: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1336: iconst_3
/*     */       //   1337: anewarray java/lang/Object
/*     */       //   1340: dup
/*     */       //   1341: iconst_0
/*     */       //   1342: aload_1
/*     */       //   1343: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1346: ldc 'name'
/*     */       //   1348: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1351: aastore
/*     */       //   1352: dup
/*     */       //   1353: iconst_1
/*     */       //   1354: aload_1
/*     */       //   1355: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1358: ldc_w 'host'
/*     */       //   1361: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1364: aastore
/*     */       //   1365: dup
/*     */       //   1366: iconst_2
/*     */       //   1367: aload_1
/*     */       //   1368: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   1371: aastore
/*     */       //   1372: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1375: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   1378: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   1383: getstatic li/cil/oc/server/driver/Registry$.MODULE$ : Lli/cil/oc/server/driver/Registry$;
/*     */       //   1386: aload_1
/*     */       //   1387: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1390: ldc_w 'item'
/*     */       //   1393: invokevirtual func_74775_l : (Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1396: invokestatic func_77949_a : (Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/item/ItemStack;
/*     */       //   1399: aload_1
/*     */       //   1400: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1403: ldc_w 'host'
/*     */       //   1406: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1409: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*     */       //   1412: invokevirtual blacklistHost : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)V
/*     */       //   1415: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1418: goto -> 2209
/*     */       //   1421: aload_1
/*     */       //   1422: getfield key : Ljava/lang/String;
/*     */       //   1425: ldc_w 'registerAssemblerFilter'
/*     */       //   1428: astore #17
/*     */       //   1430: dup
/*     */       //   1431: ifnonnull -> 1443
/*     */       //   1434: pop
/*     */       //   1435: aload #17
/*     */       //   1437: ifnull -> 1451
/*     */       //   1440: goto -> 1548
/*     */       //   1443: aload #17
/*     */       //   1445: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   1448: ifeq -> 1548
/*     */       //   1451: aload_1
/*     */       //   1452: invokevirtual isStringMessage : ()Z
/*     */       //   1455: ifeq -> 1548
/*     */       //   1458: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   1461: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   1464: new scala/StringContext
/*     */       //   1467: dup
/*     */       //   1468: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1471: iconst_3
/*     */       //   1472: anewarray java/lang/String
/*     */       //   1475: dup
/*     */       //   1476: iconst_0
/*     */       //   1477: ldc_w 'Registering new assembler template filter ''
/*     */       //   1480: aastore
/*     */       //   1481: dup
/*     */       //   1482: iconst_1
/*     */       //   1483: ldc '' from mod '
/*     */       //   1485: aastore
/*     */       //   1486: dup
/*     */       //   1487: iconst_2
/*     */       //   1488: ldc '.'
/*     */       //   1490: aastore
/*     */       //   1491: checkcast [Ljava/lang/Object;
/*     */       //   1494: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1497: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   1500: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1503: iconst_2
/*     */       //   1504: anewarray java/lang/Object
/*     */       //   1507: dup
/*     */       //   1508: iconst_0
/*     */       //   1509: aload_1
/*     */       //   1510: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   1513: aastore
/*     */       //   1514: dup
/*     */       //   1515: iconst_1
/*     */       //   1516: aload_1
/*     */       //   1517: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   1520: aastore
/*     */       //   1521: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1524: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   1527: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   1532: getstatic li/cil/oc/common/template/AssemblerTemplates$.MODULE$ : Lli/cil/oc/common/template/AssemblerTemplates$;
/*     */       //   1535: aload_1
/*     */       //   1536: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   1539: invokevirtual addFilter : (Ljava/lang/String;)V
/*     */       //   1542: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1545: goto -> 2209
/*     */       //   1548: aload_1
/*     */       //   1549: getfield key : Ljava/lang/String;
/*     */       //   1552: ldc_w 'registerInkProvider'
/*     */       //   1555: astore #19
/*     */       //   1557: dup
/*     */       //   1558: ifnonnull -> 1570
/*     */       //   1561: pop
/*     */       //   1562: aload #19
/*     */       //   1564: ifnull -> 1578
/*     */       //   1567: goto -> 1699
/*     */       //   1570: aload #19
/*     */       //   1572: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   1575: ifeq -> 1699
/*     */       //   1578: aload_1
/*     */       //   1579: invokevirtual isStringMessage : ()Z
/*     */       //   1582: ifeq -> 1699
/*     */       //   1585: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   1588: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   1591: new scala/StringContext
/*     */       //   1594: dup
/*     */       //   1595: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1598: iconst_3
/*     */       //   1599: anewarray java/lang/String
/*     */       //   1602: dup
/*     */       //   1603: iconst_0
/*     */       //   1604: ldc_w 'Registering new ink provider ''
/*     */       //   1607: aastore
/*     */       //   1608: dup
/*     */       //   1609: iconst_1
/*     */       //   1610: ldc '' from mod '
/*     */       //   1612: aastore
/*     */       //   1613: dup
/*     */       //   1614: iconst_2
/*     */       //   1615: ldc '.'
/*     */       //   1617: aastore
/*     */       //   1618: checkcast [Ljava/lang/Object;
/*     */       //   1621: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1624: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   1627: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1630: iconst_2
/*     */       //   1631: anewarray java/lang/Object
/*     */       //   1634: dup
/*     */       //   1635: iconst_0
/*     */       //   1636: aload_1
/*     */       //   1637: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   1640: aastore
/*     */       //   1641: dup
/*     */       //   1642: iconst_1
/*     */       //   1643: aload_1
/*     */       //   1644: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   1647: aastore
/*     */       //   1648: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1651: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   1654: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   1659: getstatic li/cil/oc/common/item/data/PrintData$.MODULE$ : Lli/cil/oc/common/item/data/PrintData$;
/*     */       //   1662: getstatic li/cil/oc/common/IMC$.MODULE$ : Lli/cil/oc/common/IMC$;
/*     */       //   1665: aload_1
/*     */       //   1666: invokevirtual getStringValue : ()Ljava/lang/String;
/*     */       //   1669: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1672: iconst_1
/*     */       //   1673: anewarray java/lang/Class
/*     */       //   1676: dup
/*     */       //   1677: iconst_0
/*     */       //   1678: ldc net/minecraft/item/ItemStack
/*     */       //   1680: aastore
/*     */       //   1681: checkcast [Ljava/lang/Object;
/*     */       //   1684: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1687: invokevirtual getStaticMethod : (Ljava/lang/String;Lscala/collection/Seq;)Ljava/lang/reflect/Method;
/*     */       //   1690: invokevirtual addInkProvider : (Ljava/lang/reflect/Method;)V
/*     */       //   1693: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1696: goto -> 2209
/*     */       //   1699: aload_1
/*     */       //   1700: getfield key : Ljava/lang/String;
/*     */       //   1703: ldc_w 'registerProgramDiskLabel'
/*     */       //   1706: astore #21
/*     */       //   1708: dup
/*     */       //   1709: ifnonnull -> 1721
/*     */       //   1712: pop
/*     */       //   1713: aload #21
/*     */       //   1715: ifnull -> 1729
/*     */       //   1718: goto -> 1918
/*     */       //   1721: aload #21
/*     */       //   1723: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   1726: ifeq -> 1918
/*     */       //   1729: aload_1
/*     */       //   1730: invokevirtual isNBTMessage : ()Z
/*     */       //   1733: ifeq -> 1918
/*     */       //   1736: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   1739: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   1742: new scala/StringContext
/*     */       //   1745: dup
/*     */       //   1746: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1749: iconst_4
/*     */       //   1750: anewarray java/lang/String
/*     */       //   1753: dup
/*     */       //   1754: iconst_0
/*     */       //   1755: ldc_w 'Registering new program location mapping for program ''
/*     */       //   1758: aastore
/*     */       //   1759: dup
/*     */       //   1760: iconst_1
/*     */       //   1761: ldc_w '' being on disk ''
/*     */       //   1764: aastore
/*     */       //   1765: dup
/*     */       //   1766: iconst_2
/*     */       //   1767: ldc '' from mod '
/*     */       //   1769: aastore
/*     */       //   1770: dup
/*     */       //   1771: iconst_3
/*     */       //   1772: ldc '.'
/*     */       //   1774: aastore
/*     */       //   1775: checkcast [Ljava/lang/Object;
/*     */       //   1778: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1781: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   1784: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1787: iconst_3
/*     */       //   1788: anewarray java/lang/Object
/*     */       //   1791: dup
/*     */       //   1792: iconst_0
/*     */       //   1793: aload_1
/*     */       //   1794: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1797: ldc_w 'program'
/*     */       //   1800: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1803: aastore
/*     */       //   1804: dup
/*     */       //   1805: iconst_1
/*     */       //   1806: aload_1
/*     */       //   1807: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1810: ldc_w 'label'
/*     */       //   1813: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1816: aastore
/*     */       //   1817: dup
/*     */       //   1818: iconst_2
/*     */       //   1819: aload_1
/*     */       //   1820: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   1823: aastore
/*     */       //   1824: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1827: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   1830: invokeinterface debug : (Ljava/lang/String;)V
/*     */       //   1835: getstatic li/cil/oc/server/machine/ProgramLocations$.MODULE$ : Lli/cil/oc/server/machine/ProgramLocations$;
/*     */       //   1838: aload_1
/*     */       //   1839: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1842: ldc_w 'program'
/*     */       //   1845: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1848: aload_1
/*     */       //   1849: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1852: ldc_w 'label'
/*     */       //   1855: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1858: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1861: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*     */       //   1864: aload_1
/*     */       //   1865: invokevirtual getNBTValue : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   1868: ldc_w 'architectures'
/*     */       //   1871: bipush #8
/*     */       //   1873: invokevirtual func_150295_c : (Ljava/lang/String;I)Lnet/minecraft/nbt/NBTTagList;
/*     */       //   1876: invokevirtual extendNBTTagList : (Lnet/minecraft/nbt/NBTTagList;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagList;
/*     */       //   1879: new li/cil/oc/common/IMC$$anonfun$handleEvent$1$$anonfun$apply$1
/*     */       //   1882: dup
/*     */       //   1883: aload_0
/*     */       //   1884: invokespecial <init> : (Lli/cil/oc/common/IMC$$anonfun$handleEvent$1;)V
/*     */       //   1887: invokevirtual map : (Lscala/Function1;)Lscala/collection/IndexedSeq;
/*     */       //   1890: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */       //   1893: ldc java/lang/String
/*     */       //   1895: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */       //   1898: invokeinterface toArray : (Lscala/reflect/ClassTag;)Ljava/lang/Object;
/*     */       //   1903: checkcast [Ljava/lang/Object;
/*     */       //   1906: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1909: invokevirtual addMapping : (Ljava/lang/String;Ljava/lang/String;Lscala/collection/Seq;)V
/*     */       //   1912: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1915: goto -> 2209
/*     */       //   1918: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   1921: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   1924: new scala/StringContext
/*     */       //   1927: dup
/*     */       //   1928: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1931: iconst_3
/*     */       //   1932: anewarray java/lang/String
/*     */       //   1935: dup
/*     */       //   1936: iconst_0
/*     */       //   1937: ldc_w 'Got an unrecognized or invalid IMC message ''
/*     */       //   1940: aastore
/*     */       //   1941: dup
/*     */       //   1942: iconst_1
/*     */       //   1943: ldc '' from mod '
/*     */       //   1945: aastore
/*     */       //   1946: dup
/*     */       //   1947: iconst_2
/*     */       //   1948: ldc '.'
/*     */       //   1950: aastore
/*     */       //   1951: checkcast [Ljava/lang/Object;
/*     */       //   1954: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1957: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */       //   1960: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1963: iconst_2
/*     */       //   1964: anewarray java/lang/Object
/*     */       //   1967: dup
/*     */       //   1968: iconst_0
/*     */       //   1969: aload_1
/*     */       //   1970: getfield key : Ljava/lang/String;
/*     */       //   1973: aastore
/*     */       //   1974: dup
/*     */       //   1975: iconst_1
/*     */       //   1976: aload_1
/*     */       //   1977: invokevirtual getSender : ()Ljava/lang/String;
/*     */       //   1980: aastore
/*     */       //   1981: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1984: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */       //   1987: invokeinterface warn : (Ljava/lang/String;)V
/*     */       //   1992: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1995: goto -> 2209
/*     */       //   1998: astore_3
/*     */       //   1999: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2002: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2005: ldc_w 'Failed registering assembler template.'
/*     */       //   2008: aload_3
/*     */       //   2009: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2014: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2017: goto -> 2209
/*     */       //   2020: astore #5
/*     */       //   2022: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2025: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2028: ldc_w 'Failed registering disassembler template.'
/*     */       //   2031: aload #5
/*     */       //   2033: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2038: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2041: goto -> 2209
/*     */       //   2044: astore #7
/*     */       //   2046: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2049: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2052: ldc_w 'Failed registering tool durability provider.'
/*     */       //   2055: aload #7
/*     */       //   2057: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2062: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2065: goto -> 2209
/*     */       //   2068: astore #9
/*     */       //   2070: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2073: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2076: ldc_w 'Failed registering wrench usage.'
/*     */       //   2079: aload #9
/*     */       //   2081: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2086: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2089: goto -> 2209
/*     */       //   2092: astore #11
/*     */       //   2094: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2097: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2100: ldc_w 'Failed registering wrench check.'
/*     */       //   2103: aload #11
/*     */       //   2105: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2110: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2113: goto -> 2209
/*     */       //   2116: astore #13
/*     */       //   2118: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2121: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2124: ldc_w 'Failed registering item charge implementation.'
/*     */       //   2127: aload #13
/*     */       //   2129: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2134: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2137: goto -> 2209
/*     */       //   2140: astore #16
/*     */       //   2142: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2145: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2148: ldc_w 'Failed blacklisting component.'
/*     */       //   2151: aload #16
/*     */       //   2153: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2158: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2161: goto -> 2209
/*     */       //   2164: astore #18
/*     */       //   2166: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2169: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2172: ldc_w 'Failed registering assembler template filter.'
/*     */       //   2175: aload #18
/*     */       //   2177: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2182: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2185: goto -> 2209
/*     */       //   2188: astore #20
/*     */       //   2190: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   2193: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   2196: ldc_w 'Failed registering ink provider.'
/*     */       //   2199: aload #20
/*     */       //   2201: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   2206: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   2209: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #27	-> 0
/*     */       //   #28	-> 33
/*     */       //   #29	-> 47
/*     */       //   #31	-> 128
/*     */       //   #32	-> 189
/*     */       //   #36	-> 205
/*     */       //   #37	-> 241
/*     */       //   #38	-> 255
/*     */       //   #40	-> 336
/*     */       //   #41	-> 397
/*     */       //   #45	-> 413
/*     */       //   #46	-> 449
/*     */       //   #47	-> 522
/*     */       //   #51	-> 562
/*     */       //   #52	-> 598
/*     */       //   #53	-> 671
/*     */       //   #57	-> 735
/*     */       //   #58	-> 771
/*     */       //   #59	-> 844
/*     */       //   #63	-> 884
/*     */       //   #64	-> 920
/*     */       //   #65	-> 998
/*     */       //   #66	-> 1001
/*     */       //   #67	-> 1034
/*     */       //   #65	-> 1079
/*     */       //   #72	-> 1088
/*     */       //   #73	-> 1124
/*     */       //   #74	-> 1197
/*     */       //   #75	-> 1224
/*     */       //   #78	-> 1248
/*     */       //   #79	-> 1285
/*     */       //   #80	-> 1383
/*     */       //   #84	-> 1421
/*     */       //   #85	-> 1458
/*     */       //   #86	-> 1532
/*     */       //   #90	-> 1548
/*     */       //   #91	-> 1585
/*     */       //   #92	-> 1659
/*     */       //   #96	-> 1699
/*     */       //   #97	-> 1736
/*     */       //   #98	-> 1835
/*     */       //   #101	-> 1918
/*     */       //   #33	-> 1998
/*     */       //   #32	-> 1998
/*     */       //   #42	-> 2020
/*     */       //   #41	-> 2020
/*     */       //   #48	-> 2044
/*     */       //   #47	-> 2044
/*     */       //   #54	-> 2068
/*     */       //   #53	-> 2068
/*     */       //   #60	-> 2092
/*     */       //   #59	-> 2092
/*     */       //   #69	-> 2116
/*     */       //   #65	-> 2116
/*     */       //   #81	-> 2140
/*     */       //   #80	-> 2140
/*     */       //   #87	-> 2164
/*     */       //   #86	-> 2164
/*     */       //   #93	-> 2188
/*     */       //   #92	-> 2188
/*     */       //   #27	-> 2209
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	2210	0	this	Lli/cil/oc/common/IMC$$anonfun$handleEvent$1;
/*     */       //   0	2210	1	message	Lcpw/mods/fml/common/event/FMLInterModComms$IMCMessage;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   189	205	1998	finally
/*     */       //   397	413	2020	finally
/*     */       //   522	562	2044	finally
/*     */       //   671	735	2068	finally
/*     */       //   844	884	2092	finally
/*     */       //   998	1088	2116	finally
/*     */       //   1383	1421	2140	finally
/*     */       //   1532	1548	2164	finally
/*     */       //   1659	1699	2188	finally
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
/*     */     public final class IMC$$anonfun$handleEvent$1$$anonfun$apply$1
/*     */       extends AbstractFunction1<NBTTagString, String>
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
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
/*     */       public final String apply(NBTTagString tag) {
/*  98 */         return tag.func_150285_a_();
/*     */       }
/*     */ 
/*     */       
/*     */       public IMC$$anonfun$handleEvent$1$$anonfun$apply$1(IMC$$anonfun$handleEvent$1 $outer) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public Method getStaticMethod(String name, Seq signature) {
/* 107 */     int nameSplit = name.lastIndexOf('.');
/* 108 */     String className = name.substring(0, nameSplit);
/* 109 */     String methodName = name.substring(nameSplit + 1);
/* 110 */     Class<?> clazz = Class.forName(className);
/* 111 */     Method method = clazz.getDeclaredMethod(methodName, (Class[])signature.toArray(scala.reflect.ClassTag$.MODULE$.apply(Class.class)));
/* 112 */     if (Modifier.isStatic(method.getModifiers()))
/* 113 */       return method;  (new String[2])[0] = "Method "; (new String[2])[1] = " is not static.";
/*     */     throw new IllegalArgumentException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { name }))); } public <T> T tryInvokeStatic(Method method, Seq args, Object default) { try {
/*     */     
/*     */     } finally {
/* 117 */       Exception exception = null;
/* 118 */       (new String[2])[0] = "Error invoking callback "; (new String[2])[1] = ".";
/* 119 */     }  return (T)default; }
/*     */   
/*     */   public void tryInvokeStaticVoid(Method method, Seq args) { 
/* 122 */     try { method.invoke(null, (Object[])args.toArray(scala.reflect.ClassTag$.MODULE$.AnyRef())); }
/* 123 */     finally { Exception exception = null;
/* 124 */       (new String[2])[0] = "Error invoking callback "; (new String[2])[1] = "."; }
/*     */      } private IMC$() {
/* 126 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\IMC$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */