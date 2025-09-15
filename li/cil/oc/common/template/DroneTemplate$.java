/*     */ package li.cil.oc.common.template;
/*     */ 
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.DroneData;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.apache.commons.lang3.tuple.Pair;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class DroneTemplate$ extends Template {
/*     */   public static final DroneTemplate$ MODULE$;
/*     */   private final Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents;
/*     */   
/*  18 */   private DroneTemplate$() { MODULE$ = this;
/*  19 */     (new Tuple2[1])[0] = scala.Predef$ArrowAssoc$.MODULE$
/*  20 */       .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("BIOS"), new DroneTemplate$$anonfun$1()); this.suggestedComponents = (Tuple2<String, Function1<IInventory, Object>>[])new Tuple2[1]; } public Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents() { return this.suggestedComponents; } public final class DroneTemplate$$anonfun$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) { return DroneTemplate$.MODULE$.hasComponent("eeprom", inventory); }
/*     */      } public Class<Drone> hostClass() {
/*  22 */     return Drone.class;
/*     */   }
/*  24 */   public boolean selectTier1(ItemStack stack) { ItemInfo itemInfo = Items.get("droneCase1"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  26 */      } public boolean selectTier2(ItemStack stack) { ItemInfo itemInfo = Items.get("droneCase2"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  28 */      } public boolean selectTierCreative(ItemStack stack) { ItemInfo itemInfo = Items.get("droneCaseCreative"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  30 */      } public Object[] validate(IInventory inventory) { return validateComputer(inventory); }
/*     */   public final class DroneTemplate$$anonfun$2 extends AbstractFunction1<Object, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*  33 */     private final IInventory inventory$1; public final ItemStack apply(int x$1) { return this.inventory$1.func_70301_a(x$1); } public DroneTemplate$$anonfun$2(IInventory inventory$1) {} } public Object[] assemble(IInventory inventory) { IndexedSeq items = (IndexedSeq)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()).map((Function1)new DroneTemplate$$anonfun$2(inventory), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom());
/*  34 */     DroneData data = new DroneData();
/*  35 */     data.tier_$eq(caseTier(inventory));
/*  36 */     data.name_$eq(li.cil.oc.common.item.data.RobotData$.MODULE$.randomName());
/*  37 */     data.components_$eq((ItemStack[])((TraversableOnce)((TraversableLike)items.drop(1)).filter((Function1)new DroneTemplate$$anonfun$assemble$1())).toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*  38 */     data.storedEnergy_$eq((int)li.cil.oc.Settings$.MODULE$.get().bufferDrone());
/*  39 */     ItemStack stack = Items.get("drone").createItemStack(1);
/*  40 */     data.save(stack);
/*  41 */     double energy = li.cil.oc.Settings$.MODULE$.get().droneBaseCost() + complexity(inventory) * li.cil.oc.Settings$.MODULE$.get().droneComplexityCost();
/*     */     
/*  43 */     return new Object[] { stack, BoxesRunTime.boxToDouble(energy) }; }
/*     */   public final class DroneTemplate$$anonfun$assemble$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$1) { return !(x$1 == null); } } public boolean selectDisassembler(ItemStack stack) {
/*  46 */     ItemInfo itemInfo = Items.get("drone"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*     */      } public ItemStack[] disassemble(ItemStack stack, ItemStack[] ingredients) {
/*  49 */     MicrocontrollerData info = new MicrocontrollerData(stack);
/*  50 */     String itemName = li.cil.oc.Constants$ItemName$.MODULE$.DroneCase(info.tier());
/*     */     
/*  52 */     (new ItemStack[1])[0] = Items.get(itemName).createItemStack(1); return (ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])new ItemStack[1]).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])info.components()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*     */   }
/*     */   public final class DroneTemplate$$anonfun$register$1 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return DroneTemplate$.MODULE$.toPair(t);
/*     */     } }
/*     */   public final class DroneTemplate$$anonfun$register$2 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return DroneTemplate$.MODULE$.toPair(t);
/*     */     } }
/*  64 */   public void register() { (new int[2])[0] = 
/*  65 */       1;
/*  66 */     (new int[2])[1] = 0;
/*     */     
/*  68 */     (new Tuple2[7])[0] = 
/*  69 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/*  70 */     (new Tuple2[7])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(0));
/*  71 */     (new Tuple2[7])[2] = null;
/*  72 */     (new Tuple2[7])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(0));
/*  73 */     (new Tuple2[7])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  74 */     (new Tuple2[7])[5] = null;
/*  75 */     (new Tuple2[7])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/*  76 */     IMC.registerAssemblerTemplate("Drone (Tier 1)", "li.cil.oc.common.template.DroneTemplate.selectTier1", "li.cil.oc.common.template.DroneTemplate.validate", "li.cil.oc.common.template.DroneTemplate.assemble", hostClass(), null, new int[2], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7]))).map((Function1)new DroneTemplate$$anonfun$register$1(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     (new int[3])[0] = 
/*  87 */       2;
/*  88 */     (new int[3])[1] = 1;
/*  89 */     (new int[3])[2] = 0;
/*     */     
/*  91 */     (new Tuple2[7])[0] = 
/*  92 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/*  93 */     (new Tuple2[7])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/*  94 */     (new Tuple2[7])[2] = null;
/*  95 */     (new Tuple2[7])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(0));
/*  96 */     (new Tuple2[7])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  97 */     (new Tuple2[7])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  98 */     (new Tuple2[7])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/*  99 */     IMC.registerAssemblerTemplate("Drone (Tier 2)", "li.cil.oc.common.template.DroneTemplate.selectTier2", "li.cil.oc.common.template.DroneTemplate.validate", "li.cil.oc.common.template.DroneTemplate.assemble", hostClass(), null, new int[3], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7]))).map((Function1)new DroneTemplate$$anonfun$register$2(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 109 */     (new int[9])[0] = 
/* 110 */       2;
/* 111 */     (new int[9])[1] = 2;
/* 112 */     (new int[9])[2] = 2;
/* 113 */     (new int[9])[3] = 2;
/* 114 */     (new int[9])[4] = 2;
/* 115 */     (new int[9])[5] = 2;
/* 116 */     (new int[9])[6] = 2;
/* 117 */     (new int[9])[7] = 2;
/* 118 */     (new int[9])[8] = 2;
/*     */     
/* 120 */     (new Tuple2[7])[0] = 
/* 121 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 122 */     (new Tuple2[7])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 123 */     (new Tuple2[7])[2] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 124 */     (new Tuple2[7])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(2));
/* 125 */     (new Tuple2[7])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 126 */     (new Tuple2[7])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 127 */     (new Tuple2[7])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/* 128 */     IMC.registerAssemblerTemplate("Drone (Creative)", "li.cil.oc.common.template.DroneTemplate.selectTierCreative", "li.cil.oc.common.template.DroneTemplate.validate", "li.cil.oc.common.template.DroneTemplate.assemble", hostClass(), null, new int[9], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[7]))).map((Function1)new DroneTemplate$$anonfun$register$3(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */     
/* 131 */     IMC.registerDisassemblerTemplate(
/* 132 */         "Drone", 
/* 133 */         "li.cil.oc.common.template.DroneTemplate.selectDisassembler", 
/* 134 */         "li.cil.oc.common.template.DroneTemplate.disassemble"); } public final class DroneTemplate$$anonfun$register$3 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return DroneTemplate$.MODULE$.toPair(t);
/*     */     } } public int maxComplexity(IInventory inventory) {
/* 138 */     return (caseTier(inventory) == 1) ? 8 : (
/* 139 */       (caseTier(inventory) == 3) ? 9001 : 
/* 140 */       5);
/*     */   } public int caseTier(IInventory inventory) {
/* 142 */     return li.cil.oc.util.ItemUtils$.MODULE$.caseTier(inventory.func_70301_a(0));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\DroneTemplate$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */