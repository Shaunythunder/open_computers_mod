/*     */ package li.cil.oc.common.template;
/*     */ 
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.common.item.data.TabletData;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class TabletTemplate$ extends Template {
/*     */   public static final TabletTemplate$ MODULE$;
/*     */   private final Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents;
/*     */   
/*  16 */   private TabletTemplate$() { MODULE$ = this;
/*  17 */     (new Tuple2[4])[0] = scala.Predef$ArrowAssoc$.MODULE$
/*  18 */       .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("BIOS"), new TabletTemplate$$anonfun$1());
/*  19 */     (new Tuple2[4])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("Keyboard"), new TabletTemplate$$anonfun$2());
/*  20 */     (new Tuple2[4])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("GraphicsCard"), new TabletTemplate$$anonfun$3());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  28 */     (new Tuple2[4])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("OS"), new TabletTemplate$$anonfun$4()); this.suggestedComponents = (Tuple2<String, Function1<IInventory, Object>>[])new Tuple2[4]; } public Tuple2<String, Function1<IInventory, Object>>[] suggestedComponents() { return this.suggestedComponents; } public final class TabletTemplate$$anonfun$1 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) { return TabletTemplate$.MODULE$.hasComponent("eeprom", inventory); } } public final class TabletTemplate$$anonfun$2 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) { return TabletTemplate$.MODULE$.hasComponent("keyboard", inventory); } } public final class TabletTemplate$$anonfun$3 extends AbstractFunction1<IInventory, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(IInventory inventory) { (new String[6])[0] = "apuCreative"; (new String[6])[1] = "apu1"; (new String[6])[2] = "apu2"; (new String[6])[3] = "graphicsCard1"; (new String[6])[4] = "graphicsCard2"; (new String[6])[5] = "graphicsCard3"; return scala.Predef$.MODULE$.refArrayOps((Object[])new String[6]).exists((Function1)new TabletTemplate$$anonfun$3$$anonfun$apply$1(this, inventory)); } public final class TabletTemplate$$anonfun$3$$anonfun$apply$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final IInventory inventory$2; public final boolean apply(String name) { return TabletTemplate$.MODULE$.hasComponent(name, this.inventory$2); } public TabletTemplate$$anonfun$3$$anonfun$apply$1(TabletTemplate$$anonfun$3 $outer, IInventory inventory$2) {} } } public final class TabletTemplate$$anonfun$4 extends AbstractFunction1<IInventory, Object> implements Serializable { public final boolean apply(IInventory inventory) { return TabletTemplate$.MODULE$.hasFileSystem(inventory); }
/*     */      public static final long serialVersionUID = 0L; } public Class<Tablet> hostClass() {
/*  30 */     return Tablet.class;
/*     */   }
/*  32 */   public boolean selectTier1(ItemStack stack) { ItemInfo itemInfo = Items.get("tabletCase1"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  34 */      } public boolean selectTier2(ItemStack stack) { ItemInfo itemInfo = Items.get("tabletCase2"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  36 */      } public boolean selectCreative(ItemStack stack) { ItemInfo itemInfo = Items.get("tabletCaseCreative"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*  38 */      } public Object[] validate(IInventory inventory) { return validateComputer(inventory); }
/*     */ 
/*     */   
/*  41 */   public Object[] assemble(IInventory inventory) { IndexedSeq items = (IndexedSeq)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(1), inventory.func_70302_i_()).map((Function1)new TabletTemplate$$anonfun$5(inventory), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom());
/*  42 */     TabletData data = new TabletData();
/*  43 */     data.tier_$eq(li.cil.oc.util.ItemUtils$.MODULE$.caseTier(inventory.func_70301_a(0)));
/*  44 */     data.container_$eq((Option)items.headOption().getOrElse((Function0)new TabletTemplate$$anonfun$assemble$1()));
/*  45 */     (new Option[1])[0] = scala.Option$.MODULE$.apply(Items.get("screen1").createItemStack(1)); data.items_$eq((Option[])scala.Predef$.MODULE$.refArrayOps((Object[])new Option[1]).$plus$plus((GenTraversableOnce)((TraversableLike)items.drop((data.tier() == 0) ? 0 : 1)).filter((Function1)new TabletTemplate$$anonfun$assemble$2()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Option.class))));
/*  46 */     data.energy_$eq(li.cil.oc.Settings$.MODULE$.get().bufferTablet());
/*  47 */     data.maxEnergy_$eq(data.energy());
/*  48 */     ItemStack stack = Items.get("tablet").createItemStack(1);
/*  49 */     data.save(stack);
/*  50 */     double energy = li.cil.oc.Settings$.MODULE$.get().tabletBaseCost() + complexity(inventory) * li.cil.oc.Settings$.MODULE$.get().tabletComplexityCost();
/*     */     
/*  52 */     return new Object[] { stack, BoxesRunTime.boxToDouble(energy) }; } public final class TabletTemplate$$anonfun$5 extends AbstractFunction1<Object, Option<ItemStack>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IInventory inventory$1; public final Option<ItemStack> apply(int slot) { return scala.Option$.MODULE$.apply(this.inventory$1.func_70301_a(slot)); } public TabletTemplate$$anonfun$5(IInventory inventory$1) {} } public final class TabletTemplate$$anonfun$assemble$1 extends AbstractFunction0<scala.None$> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final scala.None$ apply() { return scala.None$.MODULE$; } } public final class TabletTemplate$$anonfun$assemble$2 extends AbstractFunction1<Option<ItemStack>, Object> implements Serializable {
/*  55 */     public static final long serialVersionUID = 0L; public final boolean apply(Option x$1) { return x$1.isDefined(); } } public boolean selectDisassembler(ItemStack stack) { ItemInfo itemInfo = Items.get("tablet"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*     */      }
/*  58 */   public ItemStack[] disassemble(ItemStack stack, ItemStack[] ingredients) { TabletData info = new TabletData(stack);
/*  59 */     String itemName = li.cil.oc.Constants$ItemName$.MODULE$.TabletCase(info.tier());
/*  60 */     (new ItemStack[2])[0] = Items.get(itemName).createItemStack(1); (new ItemStack[2])[1] = (ItemStack)info.container().orNull(scala.Predef$.MODULE$.$conforms()); return (ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])new ItemStack[2]).$plus$plus(
/*     */           
/*  62 */           (GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])info.items()).collect((PartialFunction)new TabletTemplate$$anonfun$disassemble$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)))).drop(1)), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)))).filter((Function1)new TabletTemplate$$anonfun$disassemble$2()); } public final class TabletTemplate$$anonfun$disassemble$1 extends AbstractPartialFunction<Option<ItemStack>, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ItemStack>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1; if (option instanceof Some) { Some some = (Some)option; ItemStack item = (ItemStack)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; } else { bool = false; }  return bool; } } public final class TabletTemplate$$anonfun$disassemble$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$2) { return !(x$2 == null); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void register() {
/*  74 */     (new int[3])[0] = 
/*  75 */       2;
/*  76 */     (new int[3])[1] = 1;
/*  77 */     (new int[3])[2] = 0;
/*     */     
/*  79 */     (new Tuple2[8])[0] = 
/*  80 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/*  81 */     (new Tuple2[8])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/*  82 */     (new Tuple2[8])[2] = null;
/*  83 */     (new Tuple2[8])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(1));
/*  84 */     (new Tuple2[8])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(1));
/*  85 */     (new Tuple2[8])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(1));
/*  86 */     (new Tuple2[8])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/*  87 */     (new Tuple2[8])[7] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(1));
/*  88 */     IMC.registerAssemblerTemplate("Tablet (Tier 1)", "li.cil.oc.common.template.TabletTemplate.selectTier1", "li.cil.oc.common.template.TabletTemplate.validate", "li.cil.oc.common.template.TabletTemplate.assemble", hostClass(), null, new int[3], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[8]))).map((Function1)new TabletTemplate$$anonfun$register$1(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     (new int[1])[0] = 
/*  98 */       1;
/*     */     
/* 100 */     (new int[3])[0] = 
/* 101 */       2;
/* 102 */     (new int[3])[1] = 1;
/* 103 */     (new int[3])[2] = 1;
/*     */     
/* 105 */     (new Tuple2[8])[0] = 
/* 106 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 107 */     (new Tuple2[8])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(1));
/* 108 */     (new Tuple2[8])[2] = null;
/* 109 */     (new Tuple2[8])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(2));
/* 110 */     (new Tuple2[8])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(1));
/* 111 */     (new Tuple2[8])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(1));
/* 112 */     (new Tuple2[8])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/* 113 */     (new Tuple2[8])[7] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(1));
/* 114 */     IMC.registerAssemblerTemplate("Tablet (Tier 2)", "li.cil.oc.common.template.TabletTemplate.selectTier2", "li.cil.oc.common.template.TabletTemplate.validate", "li.cil.oc.common.template.TabletTemplate.assemble", hostClass(), new int[1], new int[3], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[8]))).map((Function1)new TabletTemplate$$anonfun$register$2(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     (new int[1])[0] = 
/* 124 */       2;
/*     */     
/* 126 */     (new int[9])[0] = 
/* 127 */       2;
/* 128 */     (new int[9])[1] = 2;
/* 129 */     (new int[9])[2] = 2;
/* 130 */     (new int[9])[3] = 2;
/* 131 */     (new int[9])[4] = 2;
/* 132 */     (new int[9])[5] = 2;
/* 133 */     (new int[9])[6] = 2;
/* 134 */     (new int[9])[7] = 2;
/* 135 */     (new int[9])[8] = 2;
/*     */     
/* 137 */     (new Tuple2[8])[0] = 
/* 138 */       new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 139 */     (new Tuple2[8])[1] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 140 */     (new Tuple2[8])[2] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Card(), BoxesRunTime.boxToInteger(2));
/* 141 */     (new Tuple2[8])[3] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.CPU(), BoxesRunTime.boxToInteger(2));
/* 142 */     (new Tuple2[8])[4] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 143 */     (new Tuple2[8])[5] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.Memory(), BoxesRunTime.boxToInteger(2));
/* 144 */     (new Tuple2[8])[6] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.EEPROM(), BoxesRunTime.boxToInteger(2147483647));
/* 145 */     (new Tuple2[8])[7] = new Tuple2(li.cil.oc.common.Slot$.MODULE$.HDD(), BoxesRunTime.boxToInteger(2));
/* 146 */     IMC.registerAssemblerTemplate("Tablet (Creative)", "li.cil.oc.common.template.TabletTemplate.selectCreative", "li.cil.oc.common.template.TabletTemplate.validate", "li.cil.oc.common.template.TabletTemplate.assemble", hostClass(), new int[1], new int[9], scala.collection.convert.WrapAsJava$.MODULE$.asJavaIterable((Iterable)((TraversableLike)scala.package$.MODULE$.Iterable().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[8]))).map((Function1)new TabletTemplate$$anonfun$register$3(), scala.collection.Iterable$.MODULE$.canBuildFrom())));
/*     */ 
/*     */     
/* 149 */     IMC.registerDisassemblerTemplate(
/* 150 */         "Tablet", 
/* 151 */         "li.cil.oc.common.template.TabletTemplate.selectDisassembler", 
/* 152 */         "li.cil.oc.common.template.TabletTemplate.disassemble");
/*     */   } public final class TabletTemplate$$anonfun$register$1 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Pair<String, Integer> apply(Tuple2<String, Object> t) { return TabletTemplate$.MODULE$.toPair(t); } } public final class TabletTemplate$$anonfun$register$2 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable {
/* 155 */     public static final long serialVersionUID = 0L; public final Pair<String, Integer> apply(Tuple2<String, Object> t) { return TabletTemplate$.MODULE$.toPair(t); } } public final class TabletTemplate$$anonfun$register$3 extends AbstractFunction1<Tuple2<String, Object>, Pair<String, Integer>> implements Serializable { public static final long serialVersionUID = 0L; public final Pair<String, Integer> apply(Tuple2<String, Object> t) { return TabletTemplate$.MODULE$.toPair(t); } } public int maxComplexity(IInventory inventory) { return super.maxComplexity(inventory) / 2 + 5; }
/*     */    public int caseTier(IInventory inventory) {
/* 157 */     return li.cil.oc.util.ItemUtils$.MODULE$.caseTier(inventory.func_70301_a(0));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\TabletTemplate$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */