/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ 
/*    */ public final class ConverterNanomachines$ implements Converter {
/*    */   public static final ConverterNanomachines$ MODULE$;
/*    */   private ItemInfo nanomachines;
/*    */   private volatile boolean bitmap$0;
/*    */   
/*    */   private ConverterNanomachines$() {
/* 14 */     MODULE$ = this;
/* 15 */   } private ItemInfo nanomachines$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.nanomachines = Items.get("nanomachines"); this.bitmap$0 = true; }  return this.nanomachines; }  } public ItemInfo nanomachines() { return this.bitmap$0 ? this.nanomachines : nanomachines$lzycompute(); }
/*    */ 
/*    */   
/*    */   public void convert(Object value, Map output) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: astore_3
/*    */     //   2: aload_3
/*    */     //   3: instanceof net/minecraft/item/ItemStack
/*    */     //   6: ifeq -> 115
/*    */     //   9: aload_3
/*    */     //   10: checkcast net/minecraft/item/ItemStack
/*    */     //   13: astore #4
/*    */     //   15: aload #4
/*    */     //   17: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   20: aload_0
/*    */     //   21: invokevirtual nanomachines : ()Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   24: astore #5
/*    */     //   26: dup
/*    */     //   27: ifnonnull -> 39
/*    */     //   30: pop
/*    */     //   31: aload #5
/*    */     //   33: ifnull -> 47
/*    */     //   36: goto -> 115
/*    */     //   39: aload #5
/*    */     //   41: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   44: ifeq -> 115
/*    */     //   47: new li/cil/oc/common/item/data/NanomachineData
/*    */     //   50: dup
/*    */     //   51: aload #4
/*    */     //   53: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*    */     //   56: astore #7
/*    */     //   58: aload #7
/*    */     //   60: invokevirtual uuid : ()Ljava/lang/String;
/*    */     //   63: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
/*    */     //   66: ifeq -> 75
/*    */     //   69: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   72: goto -> 110
/*    */     //   75: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   78: aload_2
/*    */     //   79: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   82: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   85: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   88: ldc 'nanomachines'
/*    */     //   90: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   93: aload #7
/*    */     //   95: invokevirtual uuid : ()Ljava/lang/String;
/*    */     //   98: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   101: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   106: pop
/*    */     //   107: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   110: astore #6
/*    */     //   112: goto -> 120
/*    */     //   115: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   118: astore #6
/*    */     //   120: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 0
/*    */     //   #18	-> 2
/*    */     //   #19	-> 47
/*    */     //   #20	-> 58
/*    */     //   #21	-> 75
/*    */     //   #18	-> 110
/*    */     //   #23	-> 115
/*    */     //   #17	-> 120
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	121	0	this	Lli/cil/oc/integration/opencomputers/ConverterNanomachines$;
/*    */     //   0	121	1	value	Ljava/lang/Object;
/*    */     //   0	121	2	output	Ljava/util/Map;
/*    */     //   58	63	7	data	Lli/cil/oc/common/item/data/NanomachineData;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\ConverterNanomachines$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */