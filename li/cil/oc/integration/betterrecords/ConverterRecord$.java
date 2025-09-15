/*    */ package li.cil.oc.integration.betterrecords;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class ConverterRecord$ implements Converter {
/*    */   public static final ConverterRecord$ MODULE$;
/*    */   private final String UrlRecordClassName;
/*    */   
/* 13 */   private ConverterRecord$() { MODULE$ = this; } private final String UrlMultiRecordClassName; private final String FreqCrystalClassName; public final String UrlRecordClassName() {
/* 14 */     return "com.codingforcookies.betterrecords.src.items.ItemURLRecord"; }
/* 15 */   public final String UrlMultiRecordClassName() { return "com.codingforcookies.betterrecords.src.items.ItemURLMultiRecord"; } public final String FreqCrystalClassName() {
/* 16 */     return "com.codingforcookies.betterrecords.src.items.ItemFreqCrystal";
/*    */   } public void convert(Object value, Map output) {
/*    */     // Byte code:
/*    */     //   0: iconst_0
/*    */     //   1: istore_3
/*    */     //   2: aconst_null
/*    */     //   3: astore #4
/*    */     //   5: aload_1
/*    */     //   6: astore #5
/*    */     //   8: aload #5
/*    */     //   10: instanceof net/minecraft/item/ItemStack
/*    */     //   13: ifeq -> 96
/*    */     //   16: iconst_1
/*    */     //   17: istore_3
/*    */     //   18: aload #5
/*    */     //   20: checkcast net/minecraft/item/ItemStack
/*    */     //   23: astore #4
/*    */     //   25: aload #4
/*    */     //   27: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   30: ifnull -> 96
/*    */     //   33: aload #4
/*    */     //   35: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   38: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   41: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   44: ldc 'com.codingforcookies.betterrecords.src.items.ItemURLRecord'
/*    */     //   46: astore #6
/*    */     //   48: dup
/*    */     //   49: ifnonnull -> 61
/*    */     //   52: pop
/*    */     //   53: aload #6
/*    */     //   55: ifnull -> 69
/*    */     //   58: goto -> 96
/*    */     //   61: aload #6
/*    */     //   63: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   66: ifeq -> 96
/*    */     //   69: aload #4
/*    */     //   71: invokevirtual func_77942_o : ()Z
/*    */     //   74: ifeq -> 96
/*    */     //   77: aload_0
/*    */     //   78: aload #4
/*    */     //   80: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   83: aload_2
/*    */     //   84: invokevirtual li$cil$oc$integration$betterrecords$ConverterRecord$$convertRecord : (Lnet/minecraft/nbt/NBTTagCompound;Ljava/util/Map;)Ljava/util/Map;
/*    */     //   87: pop
/*    */     //   88: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   91: astore #7
/*    */     //   93: goto -> 295
/*    */     //   96: iload_3
/*    */     //   97: ifeq -> 215
/*    */     //   100: aload #4
/*    */     //   102: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   105: ifnull -> 215
/*    */     //   108: aload #4
/*    */     //   110: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   113: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   116: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   119: ldc 'com.codingforcookies.betterrecords.src.items.ItemURLMultiRecord'
/*    */     //   121: astore #8
/*    */     //   123: dup
/*    */     //   124: ifnonnull -> 136
/*    */     //   127: pop
/*    */     //   128: aload #8
/*    */     //   130: ifnull -> 144
/*    */     //   133: goto -> 215
/*    */     //   136: aload #8
/*    */     //   138: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   141: ifeq -> 215
/*    */     //   144: aload #4
/*    */     //   146: invokevirtual func_77942_o : ()Z
/*    */     //   149: ifeq -> 215
/*    */     //   152: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   159: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   162: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   165: ldc 'songs'
/*    */     //   167: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   170: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*    */     //   173: aload #4
/*    */     //   175: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   178: ldc 'songs'
/*    */     //   180: bipush #10
/*    */     //   182: invokevirtual func_150295_c : (Ljava/lang/String;I)Lnet/minecraft/nbt/NBTTagList;
/*    */     //   185: invokevirtual extendNBTTagList : (Lnet/minecraft/nbt/NBTTagList;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagList;
/*    */     //   188: new li/cil/oc/integration/betterrecords/ConverterRecord$$anonfun$convert$1
/*    */     //   191: dup
/*    */     //   192: invokespecial <init> : ()V
/*    */     //   195: invokevirtual map : (Lscala/Function1;)Lscala/collection/IndexedSeq;
/*    */     //   198: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   201: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   206: pop
/*    */     //   207: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   210: astore #7
/*    */     //   212: goto -> 295
/*    */     //   215: iload_3
/*    */     //   216: ifeq -> 290
/*    */     //   219: aload #4
/*    */     //   221: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   224: ifnull -> 290
/*    */     //   227: aload #4
/*    */     //   229: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   232: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   235: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   238: ldc 'com.codingforcookies.betterrecords.src.items.ItemFreqCrystal'
/*    */     //   240: astore #9
/*    */     //   242: dup
/*    */     //   243: ifnonnull -> 255
/*    */     //   246: pop
/*    */     //   247: aload #9
/*    */     //   249: ifnull -> 263
/*    */     //   252: goto -> 290
/*    */     //   255: aload #9
/*    */     //   257: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   260: ifeq -> 290
/*    */     //   263: aload #4
/*    */     //   265: invokevirtual func_77942_o : ()Z
/*    */     //   268: ifeq -> 290
/*    */     //   271: aload_0
/*    */     //   272: aload #4
/*    */     //   274: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*    */     //   277: aload_2
/*    */     //   278: invokevirtual li$cil$oc$integration$betterrecords$ConverterRecord$$convertRecord : (Lnet/minecraft/nbt/NBTTagCompound;Ljava/util/Map;)Ljava/util/Map;
/*    */     //   281: pop
/*    */     //   282: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   285: astore #7
/*    */     //   287: goto -> 295
/*    */     //   290: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   293: astore #7
/*    */     //   295: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 0
/*    */     //   #18	-> 5
/*    */     //   #19	-> 8
/*    */     //   #20	-> 77
/*    */     //   #18	-> 96
/*    */     //   #21	-> 100
/*    */     //   #22	-> 152
/*    */     //   #18	-> 215
/*    */     //   #23	-> 219
/*    */     //   #24	-> 271
/*    */     //   #25	-> 290
/*    */     //   #18	-> 295
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	296	0	this	Lli/cil/oc/integration/betterrecords/ConverterRecord$;
/*    */     //   0	296	1	value	Ljava/lang/Object;
/*    */     //   0	296	2	output	Ljava/util/Map;
/*    */   }
/*    */   public final class ConverterRecord$$anonfun$convert$1 extends AbstractFunction1<NBTTagCompound, Map<Object, Object>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final Map<Object, Object> apply(NBTTagCompound nbt) {
/* 22 */       return ConverterRecord$.MODULE$.li$cil$oc$integration$betterrecords$ConverterRecord$$convertRecord(nbt, new HashMap<>());
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<Object, Object> li$cil$oc$integration$betterrecords$ConverterRecord$$convertRecord(NBTTagCompound nbt, Map<Object, Object> output) {
/* 29 */     nbt.func_150297_b("url", 8) ? 
/* 30 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("url"), nbt.func_74779_i("url"))) : BoxedUnit.UNIT;
/* 31 */     nbt.func_150297_b("name", 8) ? 
/* 32 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("filename"), nbt.func_74779_i("name"))) : BoxedUnit.UNIT;
/* 33 */     nbt.func_150297_b("author", 8) ? 
/* 34 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("author"), nbt.func_74779_i("author"))) : BoxedUnit.UNIT;
/* 35 */     nbt.func_150297_b("local", 8) ? 
/* 36 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(output).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("title"), nbt.func_74779_i("local"))) : BoxedUnit.UNIT;
/*    */     
/* 38 */     return output;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\betterrecords\ConverterRecord$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */