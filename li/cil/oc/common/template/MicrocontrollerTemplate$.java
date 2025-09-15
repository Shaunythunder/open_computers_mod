/*     */ package li.cil.oc.common.template;
/*     */ 
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.MicrocontrollerData;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class MicrocontrollerTemplate$ extends Template {
/*     */   public static final MicrocontrollerTemplate$ MODULE$;
/*     */   private final Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents;
/*     */   
/*  16 */   private MicrocontrollerTemplate$() { MODULE$ = this;
/*  17 */     (new Tuple2[1])[0] = scala.Predef$ArrowAssoc$.MODULE$
/*  18 */       .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("BIOS"), new MicrocontrollerTemplate$$anonfun$1()); this.suggestedComponents = (Tuple2<String, Function1<IInventory, Object>>[])new Tuple2[1]; } public Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents() { return this.suggestedComponents; } public final class MicrocontrollerTemplate$$anonfun$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) { return MicrocontrollerTemplate$.MODULE$.hasComponent("eeprom", inventory); }
/*     */      } public Class<Microcontroller> hostClass() {
/*  20 */     return Microcontroller.class;
/*     */   }
/*  22 */   public boolean selectTier1(ItemStack stack) { ItemInfo itemInfo = Items.get("microcontrollerCase1"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  24 */      } public boolean selectTier2(ItemStack stack) { ItemInfo itemInfo = Items.get("microcontrollerCase2"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  26 */      } public boolean selectTierCreative(ItemStack stack) { ItemInfo itemInfo = Items.get("microcontrollerCaseCreative"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  28 */      } public Object[] validate(IInventory inventory) { return validateComputer(inventory); }
/*     */   public final class MicrocontrollerTemplate$$anonfun$2 extends AbstractFunction1<Object, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*  31 */     private final IInventory inventory$1; public final ItemStack apply(int x$1) { return this.inventory$1.func_70301_a(x$1); } public MicrocontrollerTemplate$$anonfun$2(IInventory inventory$1) {} } public Object[] assemble(IInventory inventory) { IndexedSeq items = (IndexedSeq)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()).map((Function1)new MicrocontrollerTemplate$$anonfun$2(inventory), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom());
/*  32 */     MicrocontrollerData data = new MicrocontrollerData(li.cil.oc.common.item.data.MicrocontrollerData$.MODULE$.$lessinit$greater$default$1());
/*  33 */     data.tier_$eq(caseTier(inventory));
/*  34 */     data.components_$eq((ItemStack[])((TraversableOnce)((TraversableLike)items.drop(1)).filter((Function1)new MicrocontrollerTemplate$$anonfun$assemble$1())).toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*  35 */     data.storedEnergy_$eq((int)li.cil.oc.Settings$.MODULE$.get().bufferMicrocontroller());
/*  36 */     ItemStack stack = data.createItemStack();
/*  37 */     double energy = li.cil.oc.Settings$.MODULE$.get().microcontrollerBaseCost() + complexity(inventory) * li.cil.oc.Settings$.MODULE$.get().microcontrollerComplexityCost();
/*     */     
/*  39 */     return new Object[] { stack, BoxesRunTime.boxToDouble(energy) }; }
/*     */   public final class MicrocontrollerTemplate$$anonfun$assemble$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$1) { return !(x$1 == null); } } public boolean selectDisassembler(ItemStack stack) {
/*  42 */     ItemInfo itemInfo = Items.get("microcontroller"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*     */      } public ItemStack[] disassemble(ItemStack stack, ItemStack[] ingredients) {
/*  45 */     MicrocontrollerData info = new MicrocontrollerData(stack);
/*  46 */     String itemName = li.cil.oc.Constants$ItemName$.MODULE$.MicrocontrollerCase(info.tier());
/*     */     
/*  48 */     (new ItemStack[1])[0] = Items.get(itemName).createItemStack(1); return (ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])new ItemStack[1]).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])info.components()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*     */   }
/*     */   public final class MicrocontrollerTemplate$$anonfun$register$1 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return MicrocontrollerTemplate$.MODULE$.toPair(t);
/*     */     } }
/*     */   public final class MicrocontrollerTemplate$$anonfun$register$2 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return MicrocontrollerTemplate$.MODULE$.toPair(t);
/*     */     } }
/*  60 */   public void register() { (new int[1])[0] = 
/*  61 */       1;
/*     */     
/*  63 */     (new Tuple2[7])[0] = 
/*  64 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(0));
/*  65 */     (new Tuple2[7])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(0));
/*  66 */     (new Tuple2[7])[2] = null;
/*  67 */     (new Tuple2[7])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(0));
/*  68 */     (new Tuple2[7])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  69 */     (new Tuple2[7])[5] = null;
/*  70 */     (new Tuple2[7])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/*  71 */     IMC.registerAssemblerTemplate("Microcontroller (Tier 1)", "li.cil.oc.common.template.MicrocontrollerTemplate.selectTier1", "li.cil.oc.common.template.MicrocontrollerTemplate.validate", "li.cil.oc.common.template.MicrocontrollerTemplate.assemble", hostClass(), null, new int[1], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7]))).map((Function1)new MicrocontrollerTemplate$$anonfun$register$1(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     (new int[2])[0] = 
/*  82 */       2;
/*  83 */     (new int[2])[1] = 1;
/*     */     
/*  85 */     (new Tuple2[7])[0] = 
/*  86 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/*  87 */     (new Tuple2[7])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(0));
/*  88 */     (new Tuple2[7])[2] = null;
/*  89 */     (new Tuple2[7])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(0));
/*  90 */     (new Tuple2[7])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  91 */     (new Tuple2[7])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  92 */     (new Tuple2[7])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/*  93 */     IMC.registerAssemblerTemplate("Microcontroller (Tier 2)", "li.cil.oc.common.template.MicrocontrollerTemplate.selectTier2", "li.cil.oc.common.template.MicrocontrollerTemplate.validate", "li.cil.oc.common.template.MicrocontrollerTemplate.assemble", hostClass(), null, new int[2], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7]))).map((Function1)new MicrocontrollerTemplate$$anonfun$register$2(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     (new int[9])[0] = 
/* 104 */       2;
/* 105 */     (new int[9])[1] = 2;
/* 106 */     (new int[9])[2] = 2;
/* 107 */     (new int[9])[3] = 2;
/* 108 */     (new int[9])[4] = 2;
/* 109 */     (new int[9])[5] = 2;
/* 110 */     (new int[9])[6] = 2;
/* 111 */     (new int[9])[7] = 2;
/* 112 */     (new int[9])[8] = 2;
/*     */     
/* 114 */     (new Tuple2[7])[0] = 
/* 115 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 116 */     (new Tuple2[7])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 117 */     (new Tuple2[7])[2] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 118 */     (new Tuple2[7])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(2));
/* 119 */     (new Tuple2[7])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 120 */     (new Tuple2[7])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 121 */     (new Tuple2[7])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/* 122 */     IMC.registerAssemblerTemplate("Microcontroller (Creative)", "li.cil.oc.common.template.MicrocontrollerTemplate.selectTierCreative", "li.cil.oc.common.template.MicrocontrollerTemplate.validate", "li.cil.oc.common.template.MicrocontrollerTemplate.assemble", hostClass(), null, new int[9], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7]))).map((Function1)new MicrocontrollerTemplate$$anonfun$register$3(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */     
/* 125 */     IMC.registerDisassemblerTemplate(
/* 126 */         "Microcontroller", 
/* 127 */         "li.cil.oc.common.template.MicrocontrollerTemplate.selectDisassembler", 
/* 128 */         "li.cil.oc.common.template.MicrocontrollerTemplate.disassemble"); } public final class MicrocontrollerTemplate$$anonfun$register$3 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return MicrocontrollerTemplate$.MODULE$.toPair(t);
/*     */     } } public int maxComplexity(IInventory inventory) {
/* 132 */     return (caseTier(inventory) == 1) ? 5 : (
/* 133 */       (caseTier(inventory) == 3) ? 9001 : 
/* 134 */       4);
/*     */   } public int caseTier(IInventory inventory) {
/* 136 */     return li.cil.oc.util.ItemUtils$.MODULE$.caseTier(inventory.func_70301_a(0));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\MicrocontrollerTemplate$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */