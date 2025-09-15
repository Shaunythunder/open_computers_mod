/*     */ package li.cil.oc.common.template;
/*     */ 
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.RobotData;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.apache.commons.lang3.tuple.Pair;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class RobotTemplate$ extends Template {
/*     */   public static final RobotTemplate$ MODULE$;
/*     */   
/*  16 */   private RobotTemplate$() { MODULE$ = this; } public Class<Robot> hostClass() {
/*  17 */     return Robot.class;
/*     */   }
/*  19 */   public boolean selectTier1(ItemStack stack) { ItemInfo itemInfo = Items.get("case1"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  21 */      } public boolean selectTier2(ItemStack stack) { ItemInfo itemInfo = Items.get("case2"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  23 */      } public boolean selectTier3(ItemStack stack) { ItemInfo itemInfo = Items.get("case3"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  25 */      } public boolean selectCreative(ItemStack stack) { ItemInfo itemInfo = Items.get("caseCreative"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  27 */      } public Object[] validate(IInventory inventory) { return validateComputer(inventory); }
/*     */   public final class RobotTemplate$$anonfun$1 extends AbstractFunction1<Object, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IInventory inventory$1; public final ItemStack apply(int x$1) { return this.inventory$1.func_70301_a(x$1); } public RobotTemplate$$anonfun$1(IInventory inventory$1) {} } public final class RobotTemplate$$anonfun$assemble$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*  30 */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$1) { return !(x$1 == null); } } public Object[] assemble(IInventory inventory) { IndexedSeq items = (IndexedSeq)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(1), inventory.func_70302_i_()).map((Function1)new RobotTemplate$$anonfun$1(inventory), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom());
/*  31 */     RobotData data = new RobotData();
/*  32 */     data.tier_$eq(caseTier(inventory));
/*  33 */     data.name_$eq(li.cil.oc.common.item.data.RobotData$.MODULE$.randomName());
/*  34 */     data.robotEnergy_$eq((int)li.cil.oc.Settings$.MODULE$.get().bufferRobot());
/*  35 */     data.totalEnergy_$eq(data.robotEnergy());
/*  36 */     data.containers_$eq((ItemStack[])((TraversableOnce)((TraversableLike)items.take(3)).filter((Function1)new RobotTemplate$$anonfun$assemble$1())).toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*  37 */     data.components_$eq((ItemStack[])((TraversableOnce)((TraversableLike)items.drop(3)).filter((Function1)new RobotTemplate$$anonfun$assemble$2())).toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*  38 */     ItemStack stack = data.createItemStack();
/*  39 */     double energy = li.cil.oc.Settings$.MODULE$.get().robotBaseCost() + complexity(inventory) * li.cil.oc.Settings$.MODULE$.get().robotComplexityCost();
/*     */     
/*  41 */     return new Object[] { stack, BoxesRunTime.boxToDouble(energy) }; }
/*     */   public final class RobotTemplate$$anonfun$assemble$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$2) { return !(x$2 == null); } } public boolean selectDisassembler(ItemStack stack) {
/*  44 */     ItemInfo itemInfo = Items.get("robot"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*     */      } public ItemStack[] disassemble(ItemStack stack, ItemStack[] ingredients) {
/*  47 */     RobotData info = new RobotData(stack);
/*  48 */     String itemName = li.cil.oc.Constants$BlockName$.MODULE$.Case(info.tier());
/*     */     
/*  50 */     (new ItemStack[1])[0] = Items.get(itemName).createItemStack(1); return (ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])new ItemStack[1]).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])info.containers()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])info.components()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void register() {
/*  61 */     (new int[3])[0] = 
/*  62 */       1;
/*  63 */     (new int[3])[1] = 0;
/*  64 */     (new int[3])[2] = 0;
/*     */     
/*  66 */     (new int[3])[0] = 
/*  67 */       0;
/*  68 */     (new int[3])[1] = 0;
/*  69 */     (new int[3])[2] = 0;
/*     */     
/*  71 */     (new Tuple2[8])[0] = 
/*  72 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(0));
/*  73 */     (new Tuple2[8])[1] = null;
/*  74 */     (new Tuple2[8])[2] = null;
/*  75 */     (new Tuple2[8])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(0));
/*  76 */     (new Tuple2[8])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  77 */     (new Tuple2[8])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(0));
/*  78 */     (new Tuple2[8])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/*  79 */     (new Tuple2[8])[7] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(0));
/*  80 */     IMC.registerAssemblerTemplate("Robot (Tier 1)", "li.cil.oc.common.template.RobotTemplate.selectTier1", "li.cil.oc.common.template.RobotTemplate.validate", "li.cil.oc.common.template.RobotTemplate.assemble", hostClass(), new int[3], new int[3], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[8]))).map((Function1)new RobotTemplate$$anonfun$register$1(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     (new int[3])[0] = 
/*  90 */       2;
/*  91 */     (new int[3])[1] = 1;
/*  92 */     (new int[3])[2] = 0;
/*     */     
/*  94 */     (new int[6])[0] = 
/*  95 */       1;
/*  96 */     (new int[6])[1] = 1;
/*  97 */     (new int[6])[2] = 1;
/*  98 */     (new int[6])[3] = 0;
/*  99 */     (new int[6])[4] = 0;
/* 100 */     (new int[6])[5] = 0;
/*     */     
/* 102 */     (new Tuple2[8])[0] = 
/* 103 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/* 104 */     (new Tuple2[8])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(0));
/* 105 */     (new Tuple2[8])[2] = null;
/* 106 */     (new Tuple2[8])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(1));
/* 107 */     (new Tuple2[8])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(1));
/* 108 */     (new Tuple2[8])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(1));
/* 109 */     (new Tuple2[8])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/* 110 */     (new Tuple2[8])[7] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(1));
/* 111 */     IMC.registerAssemblerTemplate("Robot (Tier 2)", "li.cil.oc.common.template.RobotTemplate.selectTier2", "li.cil.oc.common.template.RobotTemplate.validate", "li.cil.oc.common.template.RobotTemplate.assemble", hostClass(), new int[3], new int[6], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[8]))).map((Function1)new RobotTemplate$$anonfun$register$2(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     (new int[3])[0] = 
/* 121 */       2;
/* 122 */     (new int[3])[1] = 1;
/* 123 */     (new int[3])[2] = 1;
/*     */     
/* 125 */     (new int[9])[0] = 
/* 126 */       2;
/* 127 */     (new int[9])[1] = 2;
/* 128 */     (new int[9])[2] = 2;
/* 129 */     (new int[9])[3] = 1;
/* 130 */     (new int[9])[4] = 1;
/* 131 */     (new int[9])[5] = 1;
/* 132 */     (new int[9])[6] = 0;
/* 133 */     (new int[9])[7] = 0;
/* 134 */     (new int[9])[8] = 0;
/*     */     
/* 136 */     (new Tuple2[9])[0] = 
/* 137 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 138 */     (new Tuple2[9])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/* 139 */     (new Tuple2[9])[2] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/* 140 */     (new Tuple2[9])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(2));
/* 141 */     (new Tuple2[9])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 142 */     (new Tuple2[9])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 143 */     (new Tuple2[9])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/* 144 */     (new Tuple2[9])[7] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(2));
/* 145 */     (new Tuple2[9])[8] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(1));
/* 146 */     IMC.registerAssemblerTemplate("Robot (Tier 3)", "li.cil.oc.common.template.RobotTemplate.selectTier3", "li.cil.oc.common.template.RobotTemplate.validate", "li.cil.oc.common.template.RobotTemplate.assemble", hostClass(), new int[3], new int[9], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[9]))).map((Function1)new RobotTemplate$$anonfun$register$3(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     (new int[3])[0] = 
/* 156 */       2;
/* 157 */     (new int[3])[1] = 2;
/* 158 */     (new int[3])[2] = 2;
/*     */     
/* 160 */     (new int[9])[0] = 
/* 161 */       2;
/* 162 */     (new int[9])[1] = 2;
/* 163 */     (new int[9])[2] = 2;
/* 164 */     (new int[9])[3] = 2;
/* 165 */     (new int[9])[4] = 2;
/* 166 */     (new int[9])[5] = 2;
/* 167 */     (new int[9])[6] = 2;
/* 168 */     (new int[9])[7] = 2;
/* 169 */     (new int[9])[8] = 2;
/*     */     
/* 171 */     (new Tuple2[9])[0] = 
/* 172 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 173 */     (new Tuple2[9])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 174 */     (new Tuple2[9])[2] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 175 */     (new Tuple2[9])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(2));
/* 176 */     (new Tuple2[9])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 177 */     (new Tuple2[9])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 178 */     (new Tuple2[9])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/* 179 */     (new Tuple2[9])[7] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(2));
/* 180 */     (new Tuple2[9])[8] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(2));
/* 181 */     IMC.registerAssemblerTemplate("Robot (Creative)", "li.cil.oc.common.template.RobotTemplate.selectCreative", "li.cil.oc.common.template.RobotTemplate.validate", "li.cil.oc.common.template.RobotTemplate.assemble", hostClass(), new int[3], new int[9], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[9]))).map((Function1)new RobotTemplate$$anonfun$register$4(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */     
/* 184 */     IMC.registerDisassemblerTemplate(
/* 185 */         "Robot", 
/* 186 */         "li.cil.oc.common.template.RobotTemplate.selectDisassembler", 
/* 187 */         "li.cil.oc.common.template.RobotTemplate.disassemble");
/*     */   } public final class RobotTemplate$$anonfun$register$1 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Pair<String, Integer> apply(Tuple2<String, Object> t) { return RobotTemplate$.MODULE$.toPair(t); } } public final class RobotTemplate$$anonfun$register$2 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/* 190 */     public static final long serialVersionUID = 0L; public final Pair<String, Integer> apply(Tuple2<String, Object> t) { return RobotTemplate$.MODULE$.toPair(t); } } public int caseTier(IInventory inventory) { return li.cil.oc.util.ItemUtils$.MODULE$.caseTier(inventory.func_70301_a(0)); }
/*     */ 
/*     */   
/*     */   public final class RobotTemplate$$anonfun$register$3 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return RobotTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   }
/*     */   
/*     */   public final class RobotTemplate$$anonfun$register$4 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Pair<String, Integer> apply(Tuple2<String, Object> t) {
/*     */       return RobotTemplate$.MODULE$.toPair(t);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\RobotTemplate$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */