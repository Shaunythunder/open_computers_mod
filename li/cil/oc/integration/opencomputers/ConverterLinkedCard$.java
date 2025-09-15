/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import java.util.Map;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.Converter;
/*    */ 
/*    */ public final class ConverterLinkedCard$ implements Converter {
/*    */   public static final ConverterLinkedCard$ MODULE$;
/*    */   private ItemInfo linkedCard;
/*    */   private volatile boolean bitmap$0;
/*    */   
/*    */   private ConverterLinkedCard$() {
/* 14 */     MODULE$ = this;
/* 15 */   } private ItemInfo linkedCard$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.linkedCard = Items.get("linkedCard"); this.bitmap$0 = true; }  return this.linkedCard; }  } public ItemInfo linkedCard() { return this.bitmap$0 ? this.linkedCard : linkedCard$lzycompute(); }
/*    */ 
/*    */   
/*    */   public void convert(Object value, Map output) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: astore_3
/*    */     //   2: aload_3
/*    */     //   3: instanceof net/minecraft/item/ItemStack
/*    */     //   6: ifeq -> 96
/*    */     //   9: aload_3
/*    */     //   10: checkcast net/minecraft/item/ItemStack
/*    */     //   13: astore #4
/*    */     //   15: aload #4
/*    */     //   17: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   20: aload_0
/*    */     //   21: invokevirtual linkedCard : ()Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   24: astore #5
/*    */     //   26: dup
/*    */     //   27: ifnonnull -> 39
/*    */     //   30: pop
/*    */     //   31: aload #5
/*    */     //   33: ifnull -> 47
/*    */     //   36: goto -> 96
/*    */     //   39: aload #5
/*    */     //   41: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   44: ifeq -> 96
/*    */     //   47: new li/cil/oc/server/component/LinkedCard
/*    */     //   50: dup
/*    */     //   51: invokespecial <init> : ()V
/*    */     //   54: astore #7
/*    */     //   56: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */     //   59: aload_2
/*    */     //   60: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*    */     //   63: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   66: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   69: ldc 'linkChannel'
/*    */     //   71: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   74: aload #7
/*    */     //   76: invokevirtual tunnel : ()Ljava/lang/String;
/*    */     //   79: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   82: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   87: pop
/*    */     //   88: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   91: astore #6
/*    */     //   93: goto -> 101
/*    */     //   96: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   99: astore #6
/*    */     //   101: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 0
/*    */     //   #18	-> 2
/*    */     //   #19	-> 47
/*    */     //   #20	-> 56
/*    */     //   #18	-> 91
/*    */     //   #21	-> 96
/*    */     //   #17	-> 101
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	102	0	this	Lli/cil/oc/integration/opencomputers/ConverterLinkedCard$;
/*    */     //   0	102	1	value	Ljava/lang/Object;
/*    */     //   0	102	2	output	Ljava/util/Map;
/*    */     //   56	35	7	card	Lli/cil/oc/server/component/LinkedCard;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\ConverterLinkedCard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */