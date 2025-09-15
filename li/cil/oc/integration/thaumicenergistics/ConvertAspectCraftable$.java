/*   */ package li.cil.oc.integration.thaumicenergistics;
/*   */ 
/*   */ import net.minecraft.item.Item;
/*   */ 
/*   */ public final class ConvertAspectCraftable$ implements Converter {
/*   */   public static final ConvertAspectCraftable$ MODULE$;
/*   */   
/* 8 */   private ConvertAspectCraftable$() { MODULE$ = this;
/* 9 */     this.DistillationPattern = GameRegistry.findItem("thaumicenergistics", "crafting.aspect"); } private final Item DistillationPattern; private Item DistillationPattern() { return this.DistillationPattern; }
/*   */ 
/*   */   
/*   */   public void convert(Object value, Map output) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: astore_3
/*   */     //   2: aload_3
/*   */     //   3: instanceof net/minecraft/item/ItemStack
/*   */     //   6: ifeq -> 100
/*   */     //   9: aload_3
/*   */     //   10: checkcast net/minecraft/item/ItemStack
/*   */     //   13: astore #4
/*   */     //   15: aload #4
/*   */     //   17: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*   */     //   20: aload_0
/*   */     //   21: invokespecial DistillationPattern : ()Lnet/minecraft/item/Item;
/*   */     //   24: astore #5
/*   */     //   26: dup
/*   */     //   27: ifnonnull -> 39
/*   */     //   30: pop
/*   */     //   31: aload #5
/*   */     //   33: ifnull -> 47
/*   */     //   36: goto -> 100
/*   */     //   39: aload #5
/*   */     //   41: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   44: ifeq -> 100
/*   */     //   47: aload #4
/*   */     //   49: invokevirtual func_77942_o : ()Z
/*   */     //   52: ifeq -> 100
/*   */     //   55: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*   */     //   58: aload_2
/*   */     //   59: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*   */     //   62: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*   */     //   65: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*   */     //   68: ldc 'aspect'
/*   */     //   70: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   73: aload #4
/*   */     //   75: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*   */     //   78: ldc 'Aspect'
/*   */     //   80: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*   */     //   83: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*   */     //   86: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*   */     //   91: pop
/*   */     //   92: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*   */     //   95: astore #6
/*   */     //   97: goto -> 105
/*   */     //   100: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*   */     //   103: astore #6
/*   */     //   105: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #10	-> 0
/*   */     //   #11	-> 2
/*   */     //   #12	-> 55
/*   */     //   #13	-> 100
/*   */     //   #10	-> 105
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   0	106	0	this	Lli/cil/oc/integration/thaumicenergistics/ConvertAspectCraftable$;
/*   */     //   0	106	1	value	Ljava/lang/Object;
/*   */     //   0	106	2	output	Ljava/util/Map;
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\thaumicenergistics\ConvertAspectCraftable$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */