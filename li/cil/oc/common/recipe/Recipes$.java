/*     */ package li.cil.oc.common.recipe;
/*     */ 
/*     */ import com.typesafe.config.Config;
/*     */ import com.typesafe.config.ConfigIncluder;
/*     */ import cpw.mods.fml.common.registry.GameRegistry;
/*     */ import java.io.File;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import li.cil.oc.common.item.traits.Delegate;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.crafting.IRecipe;
/*     */ import net.minecraftforge.oredict.RecipeSorter;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.StringContext;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ import scala.runtime.VolatileByteRef;
/*     */ 
/*     */ public final class Recipes$ {
/*     */   public static final Recipes$ MODULE$;
/*     */   private final LinkedHashMap<ItemStack, String> list;
/*     */   private final LinkedHashMap<String, ItemStack> oreDictEntries;
/*     */   private boolean hadErrors;
/*     */   private final LinkedHashMap<String, Function2<ItemStack, Config, BoxedUnit>> recipeHandlers;
/*     */   
/*  36 */   public LinkedHashMap<ItemStack, String> list() { return this.list; }
/*  37 */   public LinkedHashMap<String, ItemStack> oreDictEntries() { return this.oreDictEntries; }
/*  38 */   public boolean hadErrors() { return this.hadErrors; } public void hadErrors_$eq(boolean x$1) { this.hadErrors = x$1; } public LinkedHashMap<String, Function2<ItemStack, Config, BoxedUnit>> recipeHandlers() {
/*  39 */     return this.recipeHandlers;
/*     */   }
/*     */   public void registerRecipeHandler(String name, Function2 recipe) {
/*  42 */     recipeHandlers().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(name), recipe));
/*     */   }
/*     */   public Block addBlock(Block instance, String name, Seq<String> oreDict) {
/*     */     ItemStack itemStack;
/*  46 */     li.cil.oc.common.init.Items$.MODULE$.registerBlock(instance, name);
/*  47 */     addRecipe(new ItemStack(instance), name);
/*  48 */     Block block = instance;
/*  49 */     if (block instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block; itemStack = simpleBlock.createItemStack(simpleBlock.createItemStack$default$1()); }
/*  50 */     else { itemStack = new ItemStack(instance); }
/*  51 */      register(itemStack, oreDict);
/*  52 */     return instance;
/*     */   }
/*     */   
/*     */   public <T extends Delegate> T addSubItem(Delegate delegate, String name, Seq<String> oreDict) {
/*  56 */     li.cil.oc.common.init.Items$.MODULE$.registerItem(delegate, name);
/*  57 */     addRecipe(delegate.createItemStack(delegate.createItemStack$default$1()), name);
/*  58 */     register(delegate.createItemStack(delegate.createItemStack$default$1()), oreDict);
/*  59 */     return (T)delegate;
/*     */   }
/*     */   public Item addItem(Item instance, String name, Seq<String> oreDict) {
/*     */     ItemStack itemStack;
/*  63 */     li.cil.oc.common.init.Items$.MODULE$.registerItem(instance, name);
/*  64 */     addRecipe(new ItemStack(instance), name);
/*  65 */     Item item = instance;
/*  66 */     if (item instanceof SimpleItem) { SimpleItem simpleItem = (SimpleItem)item; itemStack = simpleItem.createItemStack(simpleItem.createItemStack$default$1()); }
/*  67 */     else { itemStack = new ItemStack(instance); }
/*  68 */      register(itemStack, oreDict);
/*  69 */     return instance;
/*     */   }
/*     */   
/*     */   public ItemStack addStack(ItemStack stack, String name, Seq<String> oreDict) {
/*  73 */     li.cil.oc.common.init.Items$.MODULE$.registerStack(stack, name);
/*  74 */     addRecipe(stack, name);
/*  75 */     register(stack, oreDict);
/*  76 */     return stack;
/*     */   }
/*     */   
/*     */   public void addRecipe(ItemStack stack, String name) {
/*  80 */     list().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(stack), name));
/*     */   }
/*     */   
/*     */   private void register(ItemStack item, Seq names) {
/*  84 */     names.withFilter((Function1)new Recipes$$anonfun$register$1()).foreach((Function1)new Recipes$$anonfun$register$2(item)); } public final class Recipes$$anonfun$register$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(String name) { return !(name == null); } }
/*  85 */    public final class Recipes$$anonfun$register$2 extends AbstractFunction1<String, LinkedHashMap<String, ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack item$1; public Recipes$$anonfun$register$2(ItemStack item$1) {} public final LinkedHashMap<String, ItemStack> apply(String name) { return Recipes$.MODULE$.oreDictEntries().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(name), this.item$1)); } } public final class Recipes$$anonfun$init$1 extends AbstractFunction1<Tuple2<String, ItemStack>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; }
/*     */   } public final class Recipes$$anonfun$init$2 extends AbstractFunction1<Tuple2<String, ItemStack>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { String name = (String)tuple2._1(); ItemStack stack = (ItemStack)tuple2._2(); OreDictionary.registerOre(name, stack); BoxedUnit boxedUnit = OreDictionary.getOres(name).contains(stack) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } } public final class Recipes$$anonfun$init$3 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final File recipeDirectory$1; public Recipes$$anonfun$init$3(File recipeDirectory$1) {} public final void apply(String recipeSet) { (new String[2])[0] = "/assets/opencomputers/recipes/"; (new String[2])[1] = ".recipes"; (new String[2])[0] = ""; (new String[2])[1] = ".recipes"; FileUtils.copyURLToFile(Recipes$.MODULE$.getClass().getResource((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { recipeSet }, ))), new File(this.recipeDirectory$1, (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { recipeSet })))); }
/*  89 */   } private final ConfigParseOptions config$lzycompute$1(File userRecipes$1, ObjectRef config$lzy$1, VolatileByteRef bitmap$0$1) { synchronized (this) { if ((byte)(bitmap$0$1.elem & 0x1) == 0) { config$lzy$1.elem = ConfigParseOptions.defaults().setSyntax(ConfigSyntax.CONF).setIncluder(new Recipes$$anon$1(userRecipes$1, config$lzy$1, bitmap$0$1)); bitmap$0$1.elem = (byte)(bitmap$0$1.elem | 0x1); }  return (ConfigParseOptions)config$lzy$1.elem; }  } public final ConfigParseOptions li$cil$oc$common$recipe$Recipes$$config$1(File userRecipes$1, ObjectRef config$lzy$1, VolatileByteRef bitmap$0$1) { return ((byte)(bitmap$0$1.elem & 0x1) == 0) ? config$lzycompute$1(userRecipes$1, config$lzy$1, bitmap$0$1) : (ConfigParseOptions)config$lzy$1.elem; } public final class Recipes$$anon$1 implements ConfigIncluder, ConfigIncluderFile { private ConfigIncluder fallback; private final File userRecipes$1; private final ObjectRef config$lzy$1; private final VolatileByteRef bitmap$0$1; public Recipes$$anon$1(File userRecipes$1, ObjectRef config$lzy$1, VolatileByteRef bitmap$0$1) {} private ConfigIncluder fallback() { return this.fallback; } private void fallback_$eq(ConfigIncluder x$1) { this.fallback = x$1; } public Recipes$$anon$1 withFallback(ConfigIncluder fallback) { fallback_$eq(fallback); return this; } public ConfigObject include(ConfigIncludeContext context, String what) { return fallback().include(context, what); } public ConfigObject includeFile(ConfigIncludeContext context, File what) { FileReader in = what.isAbsolute() ? new FileReader(what) : new FileReader(new File(this.userRecipes$1.getParentFile(), what.getPath())); Config result = ConfigFactory.parseReader(in, Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$config$1(this.userRecipes$1, this.config$lzy$1, this.bitmap$0$1)); in.close(); return result.root(); } } public final class Recipes$$anonfun$init$4 extends AbstractFunction1<Tuple2<ItemStack, String>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool; Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Recipes$$anonfun$init$5 extends AbstractFunction1<Tuple2<ItemStack, String>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Config recipes$1; public final void apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); String name = (String)tuple2._2(); ConfigValue value = this.recipes$1.getValue(name); ConfigValueType configValueType = value.valueType(); if (ConfigValueType.OBJECT.equals(configValueType)) { (new String[2])[0] = "'"; (new String[2])[1] = "'"; Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$addRecipe(stack, this.recipes$1.getConfig(name), (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name }))); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; } else if (ConfigValueType.BOOLEAN.equals(configValueType)) { Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$hide(stack); BoxedUnit boxedUnit1 = BoxesRunTime.unboxToBoolean(value.unwrapped()) ? BoxedUnit.UNIT : BoxedUnit.UNIT; } else { (new String[2])[0] = "Failed adding recipe for '"; (new String[2])[1] = "', you will not be able to craft this item. The error was: Invalid value for recipe."; li.cil.oc.OpenComputers$.MODULE$.log().error((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name }))); Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }  (new String[2])[0] = "No recipe for '"; (new String[2])[1] = "', you will not be able to craft this item. To suppress this warning, disable the recipe (assign `false` to it)."; li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name }))); Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit = this.recipes$1.hasPath(name) ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Recipes$$anonfun$init$5(Config recipes$1) {} } public void init() { VolatileByteRef bitmap$0 = VolatileByteRef.create((byte)0);
/*  90 */     RecipeSorter.register((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("extshaped").toString(), ExtendedShapedOreRecipe.class, RecipeSorter.Category.SHAPED, "after:forge:shapedore");
/*  91 */     RecipeSorter.register((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("extshapeless").toString(), ExtendedShapelessOreRecipe.class, RecipeSorter.Category.SHAPELESS, "after:forge:shapelessore");
/*  92 */     RecipeSorter.register((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("colorizer").toString(), ColorizeRecipe.class, RecipeSorter.Category.SHAPELESS, "after:forge:shapelessore");
/*  93 */     RecipeSorter.register((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("decolorizer").toString(), DecolorizeRecipe.class, RecipeSorter.Category.SHAPELESS, "after:oc:colorizer");
/*  94 */     RecipeSorter.register((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("lootcycler").toString(), LootDiskCyclingRecipe.class, RecipeSorter.Category.SHAPELESS, "after:forge:shapelessore");
/*     */     
/*  96 */     oreDictEntries().withFilter((Function1)new Recipes$$anonfun$init$1()).foreach((Function1)new Recipes$$anonfun$init$2());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 101 */     oreDictEntries().clear();
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
/* 114 */     try { ObjectRef config$lzy = ObjectRef.zero();
/*     */       
/*     */       (new String[4])[0] = "default";
/*     */       
/*     */       (new String[4])[1] = "hardmode";
/*     */       
/*     */       (new String[4])[2] = "gregtech";
/*     */       
/*     */       (new String[4])[3] = "peaceful";
/*     */       
/*     */       String[] recipeSets = new String[4];
/*     */       
/*     */       File recipeDirectory = new File((new StringBuilder()).append(scala.Predef$any2stringadd$.MODULE$.$plus$extension(scala.Predef$.MODULE$.any2stringadd(Loader.instance().getConfigDir()), File.separator)).append("opencomputers").toString());
/*     */       File userRecipes = new File(recipeDirectory, "user.recipes");
/*     */       userRecipes.getParentFile().mkdirs();
/*     */       if (!userRecipes.exists()) {
/*     */         FileUtils.copyURLToFile(getClass().getResource("/assets/opencomputers/recipes/user.recipes"), userRecipes);
/*     */       }
/*     */       scala.Predef$.MODULE$.refArrayOps((Object[])recipeSets).foreach((Function1)new Recipes$$anonfun$init$3(recipeDirectory));
/* 133 */       Config recipes = ConfigFactory.parseFile(userRecipes, li$cil$oc$common$recipe$Recipes$$config$1(userRecipes, config$lzy, bitmap$0));
/*     */ 
/*     */       
/* 136 */       list().withFilter((Function1)new Recipes$$anonfun$init$4()).foreach((Function1)new Recipes$$anonfun$init$5(recipes));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 159 */       if (recipes.hasPath("lootDisks")) {
/* 160 */         try { List lootRecipes = recipes.getConfigList("lootDisks");
/* 161 */           ArrayBuffer lootStacks = (ArrayBuffer)li.cil.oc.common.Loot$.MODULE$.globalDisks().map((Function1)new Recipes$$anonfun$1(), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom());
/* 162 */           scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(lootRecipes).foreach((Function1)new Recipes$$anonfun$init$6(lootStacks)); }
/*     */         finally
/*     */         { Exception exception = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 174 */           li.cil.oc.OpenComputers$.MODULE$.log().warn("Failed parsing loot disk recipes.", exception); }
/*     */       
/*     */       }
/*     */       
/* 178 */       if (recipes.hasPath("generic")) {
/* 179 */         try { List genericRecipes = recipes.getConfigList("generic");
/* 180 */           scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(genericRecipes).foreach((Function1)new Recipes$$anonfun$init$7()); }
/*     */         finally
/*     */         { Exception exception = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 192 */           li.cil.oc.OpenComputers$.MODULE$.log().warn("Failed parsing generic recipes.", exception); }
/*     */       
/*     */       }
/*     */ 
/*     */       
/* 197 */       ItemInfo accessPoint = Items.get("accessPoint");
/* 198 */       ItemInfo cable = Items.get("cable");
/* 199 */       ItemInfo chamelium = Items.get("chamelium");
/* 200 */       ItemInfo chameliumBlock = Items.get("chameliumBlock");
/* 201 */       ItemInfo drone = Items.get("drone");
/* 202 */       ItemInfo eeprom = Items.get("eeprom");
/* 203 */       ItemInfo floppy = Items.get("floppy");
/* 204 */       ItemInfo hoverBoots = Items.get("hoverBoots");
/* 205 */       ItemInfo lootDisk = Items.get("lootDisk");
/* 206 */       ItemInfo mcu = Items.get("microcontroller");
/* 207 */       ItemInfo navigationUpgrade = Items.get("navigationUpgrade");
/* 208 */       ItemInfo print = Items.get("print");
/* 209 */       ItemInfo relay = Items.get("relay");
/* 210 */       ItemInfo robot = Items.get("robot");
/* 211 */       ItemInfo switch = Items.get("switch");
/* 212 */       ItemInfo tablet = Items.get("tablet");
/* 213 */       ItemInfo linkedCard = Items.get("linkedCard");
/*     */ 
/*     */       
/* 216 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 217 */             navigationUpgrade.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 218 */                 navigationUpgrade.createItemStack(1), new ItemStack((Item)Items.field_151098_aY, 1, 32767)
/*     */               })));
/*     */       
/* 221 */       scala.Predef$.MODULE$.refArrayOps((Object[])li.cil.oc.util.Color$.MODULE$.dyes()).foreach((Function1)new Recipes$$anonfun$init$8(floppy));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 230 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 231 */             mcu.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 232 */                 mcu.createItemStack(1), eeprom.createItemStack(1)
/*     */               })));
/*     */       
/* 235 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 236 */             drone.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 237 */                 drone.createItemStack(1), eeprom.createItemStack(1)
/*     */               })));
/*     */       
/* 240 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 241 */             eeprom.createItemStack(2), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 242 */                 eeprom.createItemStack(1), eeprom.createItemStack(1)
/*     */               })));
/*     */       
/* 245 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 246 */             robot.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 247 */                 robot.createItemStack(1), eeprom.createItemStack(1)
/*     */               })));
/*     */       
/* 250 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 251 */             tablet.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 252 */                 tablet.createItemStack(1), eeprom.createItemStack(1)
/*     */               })));
/*     */       
/* 255 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 256 */             chamelium.createItemStack(9), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 257 */                 chameliumBlock.createItemStack(1)
/*     */               })));
/*     */       
/* 260 */       scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])li.cil.oc.util.Color$.MODULE$.dyes()).zipWithIndex(scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))).withFilter((Function1)new Recipes$$anonfun$init$9()).foreach((Function1)new Recipes$$anonfun$init$10(chameliumBlock));
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
/* 271 */       ItemStack beaconPrint = print.createItemStack(1);
/*     */ 
/*     */       
/* 274 */       PrintData printData = new PrintData(beaconPrint);
/* 275 */       printData.isBeaconBase_$eq(true);
/* 276 */       printData.save(beaconPrint);
/*     */ 
/*     */       
/* 279 */       (new Block[4])[0] = 
/* 280 */         Blocks.field_150339_S;
/* 281 */       (new Block[4])[1] = Blocks.field_150340_R;
/* 282 */       (new Block[4])[2] = Blocks.field_150475_bE;
/* 283 */       (new Block[4])[3] = Blocks.field_150484_ah;
/*     */ 
/*     */ 
/*     */       
/*     */       scala.Predef$.MODULE$.refArrayOps((Object[])new Block[4]).foreach((Function1)new Recipes$$anonfun$init$11(print, beaconPrint));
/*     */ 
/*     */ 
/*     */       
/* 291 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(floppy.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { floppy.createItemStack(1) })));
/* 292 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(floppy.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { lootDisk.createItemStack(1) })));
/*     */ 
/*     */       
/* 295 */       (new ItemInfo[3])[0] = 
/* 296 */         Items.get("hdd1");
/* 297 */       (new ItemInfo[3])[1] = Items.get("hdd2");
/* 298 */       (new ItemInfo[3])[2] = Items.get("hdd3");
/*     */       ItemInfo[] hdds = new ItemInfo[3];
/* 300 */       scala.Predef$.MODULE$.refArrayOps((Object[])hdds).foreach((Function1)new Recipes$$anonfun$init$12());
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 305 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(eeprom.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { eeprom.createItemStack(1) })));
/*     */ 
/*     */       
/* 308 */       ItemStack lightPrint = print.createItemStack(1);
/*     */ 
/*     */       
/* 311 */       PrintData printData1 = new PrintData(lightPrint);
/* 312 */       printData1.lightLevel_$eq(1);
/* 313 */       printData1.save(lightPrint);
/*     */ 
/*     */       
/* 316 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 317 */             lightPrint, (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 318 */                 print.createItemStack(1), new ItemStack(Items.field_151114_aO)
/*     */               })));
/*     */       
/* 321 */       PrintData printData2 = new PrintData(lightPrint);
/* 322 */       printData2.lightLevel_$eq(4);
/* 323 */       printData2.save(lightPrint);
/*     */ 
/*     */       
/* 326 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 327 */             lightPrint, (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 328 */                 print.createItemStack(1), new ItemStack(Blocks.field_150426_aN)
/*     */               })));
/*     */       
/* 331 */       GameRegistry.addShapelessRecipe(relay.createItemStack(1), new Object[] { accessPoint.createItemStack(1) });
/* 332 */       GameRegistry.addShapelessRecipe(relay.createItemStack(1), new Object[] { switch.createItemStack(1) });
/*     */ 
/*     */       
/* 335 */       GameRegistry.addRecipe(new ColorizeRecipe(hoverBoots.item(), ColorizeRecipe$.MODULE$.$lessinit$greater$default$2()));
/* 336 */       GameRegistry.addRecipe(new DecolorizeRecipe(hoverBoots.item()));
/*     */ 
/*     */       
/* 339 */       GameRegistry.addRecipe(new ColorizeRecipe(cable.block()));
/* 340 */       GameRegistry.addRecipe(new DecolorizeRecipe(cable.block()));
/*     */ 
/*     */       
/* 343 */       if (li.cil.oc.Settings$.MODULE$.get().lootRecrafting()) {
/* 344 */         GameRegistry.addRecipe(new LootDiskCyclingRecipe());
/*     */       }
/*     */ 
/*     */       
/* 348 */       GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(
/* 349 */             linkedCard.createItemStack(2), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] {
/* 350 */                 linkedCard.createItemStack(1), linkedCard.createItemStack(1) }))); } finally { Exception exception = null; }  }
/*     */   public final class Recipes$$anonfun$1 extends AbstractFunction1<Tuple2<ItemStack, Object>, ItemStack> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final ItemStack apply(Tuple2 x$3) { return (ItemStack)x$3._1(); } } public final class Recipes$$anonfun$init$6 extends AbstractFunction1<Config, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ArrayBuffer lootStacks$1; public Recipes$$anonfun$init$6(ArrayBuffer lootStacks$1) {} public final void apply(Config recipe) { String name = recipe.getString("name"); Option option = this.lootStacks$1.find((Function1)new Recipes$$anonfun$init$6$$anonfun$2(this, name)); if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); (new String[2])[0] = "loot disk '"; (new String[2])[1] = "'"; Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$addRecipe(stack, recipe, (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name }))); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { (new String[2])[0] = "Failed adding recipe for loot disk '"; (new String[2])[1] = "': No such global loot disk."; li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name }))); Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } public final class Recipes$$anonfun$init$6$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final String name$1; public final boolean apply(ItemStack s) { String str = this.name$1; if (s.func_77978_p().func_74779_i((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("lootFactory").toString()) == null) { s.func_77978_p().func_74779_i((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("lootFactory").toString()); if (str != null); } else if (s.func_77978_p().func_74779_i((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("lootFactory").toString()).equals(str)) {  }  } public Recipes$$anonfun$init$6$$anonfun$2(Recipes$$anonfun$init$6 $outer, String name$1) {} } } public final class Recipes$$anonfun$init$7 extends AbstractFunction1<Config, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(Config recipe) { Object result = recipe.getValue("result").unwrapped(); Object object1 = Recipes$.MODULE$.parseIngredient(result); if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1; (new String[2])[0] = "'"; (new String[2])[1] = "'"; Recipes$.MODULE$.li$cil$oc$common$recipe$Recipes$$addRecipe(itemStack, recipe, (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { result }))); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { (new String[2])[0] = "Failed adding generic recipe for '"; (new String[2])[1] = "': Invalid output (make sure it's not an OreDictionary name)."; li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { result }))); Recipes$.MODULE$.hadErrors_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } } public final class Recipes$$anonfun$init$8 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemInfo floppy$1; public Recipes$$anonfun$init$8(ItemInfo floppy$1) {} public final void apply(String dye) { ItemStack result = this.floppy$1.createItemStack(1); NBTTagCompound tag = new NBTTagCompound(); tag.func_74768_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("color").toString(), scala.Predef$.MODULE$.refArrayOps((Object[])li.cil.oc.util.Color$.MODULE$.dyes()).indexOf(dye)); result.func_77982_d(tag); GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(result, (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.floppy$1.createItemStack(1), dye }))); } } public final class Recipes$$anonfun$init$9 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$3) { boolean bool; Tuple2 tuple2 = check$ifrefutable$3; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Recipes$$anonfun$init$10 extends AbstractFunction1<Tuple2<String, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemInfo chameliumBlock$1; public final void apply(Tuple2 x$4) { Tuple2 tuple2 = x$4; if (tuple2 != null) { String dye = (String)tuple2._1(); int meta = tuple2._2$mcI$sp(); ItemStack result = this.chameliumBlock$1.createItemStack(1); result.func_77964_b(meta); ItemStack input = this.chameliumBlock$1.createItemStack(1); input.func_77964_b(32767); GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(result, (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { input, dye }))); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Recipes$$anonfun$init$10(ItemInfo chameliumBlock$1) {} } public final class Recipes$$anonfun$init$11 extends AbstractFunction1<Block, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemInfo print$1; private final ItemStack beaconPrint$1; public Recipes$$anonfun$init$11(ItemInfo print$1, ItemStack beaconPrint$1) {} public final void apply(Block block) { GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(this.beaconPrint$1, (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { this.print$1.createItemStack(1), new ItemStack(block) }))); } } public final class Recipes$$anonfun$init$12 extends AbstractFunction1<ItemInfo, BoxedUnit> implements Serializable {
/* 360 */     public static final long serialVersionUID = 0L; public final void apply(ItemInfo hdd) { GameRegistry.addRecipe((IRecipe)new ExtendedShapelessOreRecipe(hdd.createItemStack(1), (Seq<Object>)scala.Predef$.MODULE$.wrapRefArray(new Object[] { hdd.createItemStack(1) }))); } } public void li$cil$oc$common$recipe$Recipes$$addRecipe(ItemStack output, Config recipe, String name) { try { String recipeType = tryGetType(recipe);
/* 361 */       Option option = recipeHandlers().get(recipeType);
/* 362 */       if (option instanceof Some) { Some some = (Some)option; Function2 recipeHandler = (Function2)some.x(); BoxedUnit boxedUnit = (BoxedUnit)recipeHandler.apply(output, recipe); }
/*     */       else
/* 364 */       { (new String[3])[0] = "Failed adding recipe for "; (new String[3])[1] = ", you will not be able to craft this item. The error was: Invalid recipe type '"; (new String[3])[2] = "'."; li.cil.oc.OpenComputers$.MODULE$.log().error((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name, recipeType })));
/* 365 */         hadErrors_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*     */        }
/*     */     catch (RecipeException recipeException)
/*     */     
/* 370 */     { (new String[2])[0] = "Failed adding recipe for "; (new String[2])[1] = ", you will not be able to craft this item."; li.cil.oc.OpenComputers$.MODULE$.log().error((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name }, )), recipeException);
/* 371 */       hadErrors_$eq(true); }
/*     */      }
/*     */    public int tryGetCount(Config recipe) {
/* 374 */     return recipe.hasPath("output") ? recipe.getInt("output") : 1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object parseIngredient(Object entry) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_2
/*     */     //   2: aload_2
/*     */     //   3: instanceof java/util/Map
/*     */     //   6: ifeq -> 678
/*     */     //   9: aload_2
/*     */     //   10: checkcast java/util/Map
/*     */     //   13: astore_3
/*     */     //   14: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*     */     //   21: ldc_w 'oreDict'
/*     */     //   24: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 125
/*     */     //   32: aload_3
/*     */     //   33: ldc_w 'oreDict'
/*     */     //   36: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   41: astore #5
/*     */     //   43: aload #5
/*     */     //   45: instanceof java/lang/String
/*     */     //   48: ifeq -> 67
/*     */     //   51: aload #5
/*     */     //   53: checkcast java/lang/String
/*     */     //   56: astore #6
/*     */     //   58: aload #6
/*     */     //   60: astore #7
/*     */     //   62: aload #7
/*     */     //   64: goto -> 604
/*     */     //   67: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   70: dup
/*     */     //   71: new scala/StringContext
/*     */     //   74: dup
/*     */     //   75: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   78: iconst_2
/*     */     //   79: anewarray java/lang/String
/*     */     //   82: dup
/*     */     //   83: iconst_0
/*     */     //   84: ldc_w 'Invalid name in recipe (not a string: '
/*     */     //   87: aastore
/*     */     //   88: dup
/*     */     //   89: iconst_1
/*     */     //   90: ldc_w ').'
/*     */     //   93: aastore
/*     */     //   94: checkcast [Ljava/lang/Object;
/*     */     //   97: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   100: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   103: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   106: iconst_1
/*     */     //   107: anewarray java/lang/Object
/*     */     //   110: dup
/*     */     //   111: iconst_0
/*     */     //   112: aload #5
/*     */     //   114: aastore
/*     */     //   115: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   118: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   121: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   124: athrow
/*     */     //   125: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   128: aload_3
/*     */     //   129: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*     */     //   132: ldc_w 'item'
/*     */     //   135: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   140: ifeq -> 395
/*     */     //   143: aload_3
/*     */     //   144: ldc_w 'item'
/*     */     //   147: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   152: astore #8
/*     */     //   154: aload #8
/*     */     //   156: instanceof java/lang/String
/*     */     //   159: ifeq -> 296
/*     */     //   162: aload #8
/*     */     //   164: checkcast java/lang/String
/*     */     //   167: astore #9
/*     */     //   169: aload_0
/*     */     //   170: aload #9
/*     */     //   172: invokespecial findItem : (Ljava/lang/String;)Lscala/Option;
/*     */     //   175: astore #11
/*     */     //   177: aload #11
/*     */     //   179: instanceof scala/Some
/*     */     //   182: ifeq -> 238
/*     */     //   185: aload #11
/*     */     //   187: checkcast scala/Some
/*     */     //   190: astore #12
/*     */     //   192: aload #12
/*     */     //   194: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   197: astore #13
/*     */     //   199: aload #13
/*     */     //   201: instanceof net/minecraft/item/Item
/*     */     //   204: ifeq -> 238
/*     */     //   207: aload #13
/*     */     //   209: checkcast net/minecraft/item/Item
/*     */     //   212: astore #14
/*     */     //   214: new net/minecraft/item/ItemStack
/*     */     //   217: dup
/*     */     //   218: aload #14
/*     */     //   220: iconst_1
/*     */     //   221: aload_0
/*     */     //   222: aload_3
/*     */     //   223: invokespecial tryGetId : (Ljava/util/Map;)I
/*     */     //   226: invokespecial <init> : (Lnet/minecraft/item/Item;II)V
/*     */     //   229: astore #15
/*     */     //   231: aload #15
/*     */     //   233: astore #10
/*     */     //   235: goto -> 332
/*     */     //   238: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   241: dup
/*     */     //   242: new scala/StringContext
/*     */     //   245: dup
/*     */     //   246: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   249: iconst_2
/*     */     //   250: anewarray java/lang/String
/*     */     //   253: dup
/*     */     //   254: iconst_0
/*     */     //   255: ldc_w 'No item found with name ''
/*     */     //   258: aastore
/*     */     //   259: dup
/*     */     //   260: iconst_1
/*     */     //   261: ldc_w ''.'
/*     */     //   264: aastore
/*     */     //   265: checkcast [Ljava/lang/Object;
/*     */     //   268: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   271: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   274: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   277: iconst_1
/*     */     //   278: anewarray java/lang/Object
/*     */     //   281: dup
/*     */     //   282: iconst_0
/*     */     //   283: aload #9
/*     */     //   285: aastore
/*     */     //   286: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   289: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   292: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   295: athrow
/*     */     //   296: aload #8
/*     */     //   298: instanceof java/lang/Number
/*     */     //   301: ifeq -> 337
/*     */     //   304: aload #8
/*     */     //   306: checkcast java/lang/Number
/*     */     //   309: astore #16
/*     */     //   311: new net/minecraft/item/ItemStack
/*     */     //   314: dup
/*     */     //   315: aload_0
/*     */     //   316: aload #16
/*     */     //   318: invokespecial validateItemId : (Ljava/lang/Number;)Lnet/minecraft/item/Item;
/*     */     //   321: iconst_1
/*     */     //   322: aload_0
/*     */     //   323: aload_3
/*     */     //   324: invokespecial tryGetId : (Ljava/util/Map;)I
/*     */     //   327: invokespecial <init> : (Lnet/minecraft/item/Item;II)V
/*     */     //   330: astore #10
/*     */     //   332: aload #10
/*     */     //   334: goto -> 604
/*     */     //   337: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   340: dup
/*     */     //   341: new scala/StringContext
/*     */     //   344: dup
/*     */     //   345: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   348: iconst_2
/*     */     //   349: anewarray java/lang/String
/*     */     //   352: dup
/*     */     //   353: iconst_0
/*     */     //   354: ldc_w 'Invalid item name in recipe (not a string: '
/*     */     //   357: aastore
/*     */     //   358: dup
/*     */     //   359: iconst_1
/*     */     //   360: ldc_w ').'
/*     */     //   363: aastore
/*     */     //   364: checkcast [Ljava/lang/Object;
/*     */     //   367: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   370: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   373: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   376: iconst_1
/*     */     //   377: anewarray java/lang/Object
/*     */     //   380: dup
/*     */     //   381: iconst_0
/*     */     //   382: aload #8
/*     */     //   384: aastore
/*     */     //   385: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   388: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   391: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   394: athrow
/*     */     //   395: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   398: aload_3
/*     */     //   399: invokevirtual mapAsScalaMap : (Ljava/util/Map;)Lscala/collection/mutable/Map;
/*     */     //   402: ldc_w 'block'
/*     */     //   405: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   410: ifeq -> 667
/*     */     //   413: aload_3
/*     */     //   414: ldc_w 'block'
/*     */     //   417: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   422: astore #17
/*     */     //   424: aload #17
/*     */     //   426: instanceof java/lang/String
/*     */     //   429: ifeq -> 566
/*     */     //   432: aload #17
/*     */     //   434: checkcast java/lang/String
/*     */     //   437: astore #18
/*     */     //   439: aload_0
/*     */     //   440: aload #18
/*     */     //   442: invokespecial findBlock : (Ljava/lang/String;)Lscala/Option;
/*     */     //   445: astore #20
/*     */     //   447: aload #20
/*     */     //   449: instanceof scala/Some
/*     */     //   452: ifeq -> 508
/*     */     //   455: aload #20
/*     */     //   457: checkcast scala/Some
/*     */     //   460: astore #21
/*     */     //   462: aload #21
/*     */     //   464: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   467: astore #22
/*     */     //   469: aload #22
/*     */     //   471: instanceof net/minecraft/block/Block
/*     */     //   474: ifeq -> 508
/*     */     //   477: aload #22
/*     */     //   479: checkcast net/minecraft/block/Block
/*     */     //   482: astore #23
/*     */     //   484: new net/minecraft/item/ItemStack
/*     */     //   487: dup
/*     */     //   488: aload #23
/*     */     //   490: iconst_1
/*     */     //   491: aload_0
/*     */     //   492: aload_3
/*     */     //   493: invokespecial tryGetId : (Ljava/util/Map;)I
/*     */     //   496: invokespecial <init> : (Lnet/minecraft/block/Block;II)V
/*     */     //   499: astore #24
/*     */     //   501: aload #24
/*     */     //   503: astore #19
/*     */     //   505: goto -> 602
/*     */     //   508: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   511: dup
/*     */     //   512: new scala/StringContext
/*     */     //   515: dup
/*     */     //   516: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   519: iconst_2
/*     */     //   520: anewarray java/lang/String
/*     */     //   523: dup
/*     */     //   524: iconst_0
/*     */     //   525: ldc_w 'No block found with name ''
/*     */     //   528: aastore
/*     */     //   529: dup
/*     */     //   530: iconst_1
/*     */     //   531: ldc_w ''.'
/*     */     //   534: aastore
/*     */     //   535: checkcast [Ljava/lang/Object;
/*     */     //   538: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   541: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   544: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   547: iconst_1
/*     */     //   548: anewarray java/lang/Object
/*     */     //   551: dup
/*     */     //   552: iconst_0
/*     */     //   553: aload #18
/*     */     //   555: aastore
/*     */     //   556: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   559: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   562: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   565: athrow
/*     */     //   566: aload #17
/*     */     //   568: instanceof java/lang/Number
/*     */     //   571: ifeq -> 609
/*     */     //   574: aload #17
/*     */     //   576: checkcast java/lang/Number
/*     */     //   579: astore #25
/*     */     //   581: new net/minecraft/item/ItemStack
/*     */     //   584: dup
/*     */     //   585: aload_0
/*     */     //   586: aload #25
/*     */     //   588: invokespecial validateBlockId : (Ljava/lang/Number;)Lnet/minecraft/block/Block;
/*     */     //   591: iconst_1
/*     */     //   592: aload_0
/*     */     //   593: aload_3
/*     */     //   594: invokespecial tryGetId : (Ljava/util/Map;)I
/*     */     //   597: invokespecial <init> : (Lnet/minecraft/block/Block;II)V
/*     */     //   600: astore #19
/*     */     //   602: aload #19
/*     */     //   604: astore #4
/*     */     //   606: goto -> 920
/*     */     //   609: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   612: dup
/*     */     //   613: new scala/StringContext
/*     */     //   616: dup
/*     */     //   617: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   620: iconst_2
/*     */     //   621: anewarray java/lang/String
/*     */     //   624: dup
/*     */     //   625: iconst_0
/*     */     //   626: ldc_w 'Invalid block name (not a string: '
/*     */     //   629: aastore
/*     */     //   630: dup
/*     */     //   631: iconst_1
/*     */     //   632: ldc_w ').'
/*     */     //   635: aastore
/*     */     //   636: checkcast [Ljava/lang/Object;
/*     */     //   639: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   642: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   645: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   648: iconst_1
/*     */     //   649: anewarray java/lang/Object
/*     */     //   652: dup
/*     */     //   653: iconst_0
/*     */     //   654: aload #17
/*     */     //   656: aastore
/*     */     //   657: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   660: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   663: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   666: athrow
/*     */     //   667: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   670: dup
/*     */     //   671: ldc_w 'Invalid ingredient type (no oreDict, item or block entry).'
/*     */     //   674: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   677: athrow
/*     */     //   678: aload_2
/*     */     //   679: instanceof java/lang/String
/*     */     //   682: ifeq -> 923
/*     */     //   685: aload_2
/*     */     //   686: checkcast java/lang/String
/*     */     //   689: astore #26
/*     */     //   691: aload #26
/*     */     //   693: ifnull -> 707
/*     */     //   696: aload #26
/*     */     //   698: invokevirtual trim : ()Ljava/lang/String;
/*     */     //   701: invokevirtual isEmpty : ()Z
/*     */     //   704: ifeq -> 711
/*     */     //   707: aconst_null
/*     */     //   708: goto -> 918
/*     */     //   711: aload #26
/*     */     //   713: invokestatic getOres : (Ljava/lang/String;)Ljava/util/ArrayList;
/*     */     //   716: ifnull -> 730
/*     */     //   719: aload #26
/*     */     //   721: invokestatic getOres : (Ljava/lang/String;)Ljava/util/ArrayList;
/*     */     //   724: invokevirtual isEmpty : ()Z
/*     */     //   727: ifeq -> 916
/*     */     //   730: aload_0
/*     */     //   731: aload #26
/*     */     //   733: invokespecial findItem : (Ljava/lang/String;)Lscala/Option;
/*     */     //   736: astore #27
/*     */     //   738: aload #27
/*     */     //   740: instanceof scala/Some
/*     */     //   743: ifeq -> 791
/*     */     //   746: aload #27
/*     */     //   748: checkcast scala/Some
/*     */     //   751: astore #28
/*     */     //   753: aload #28
/*     */     //   755: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   758: astore #29
/*     */     //   760: aload #29
/*     */     //   762: instanceof net/minecraft/item/Item
/*     */     //   765: ifeq -> 791
/*     */     //   768: aload #29
/*     */     //   770: checkcast net/minecraft/item/Item
/*     */     //   773: astore #30
/*     */     //   775: new net/minecraft/item/ItemStack
/*     */     //   778: dup
/*     */     //   779: aload #30
/*     */     //   781: iconst_1
/*     */     //   782: iconst_0
/*     */     //   783: invokespecial <init> : (Lnet/minecraft/item/Item;II)V
/*     */     //   786: astore #31
/*     */     //   788: goto -> 853
/*     */     //   791: aload_0
/*     */     //   792: aload #26
/*     */     //   794: invokespecial findBlock : (Ljava/lang/String;)Lscala/Option;
/*     */     //   797: astore #32
/*     */     //   799: aload #32
/*     */     //   801: instanceof scala/Some
/*     */     //   804: ifeq -> 858
/*     */     //   807: aload #32
/*     */     //   809: checkcast scala/Some
/*     */     //   812: astore #33
/*     */     //   814: aload #33
/*     */     //   816: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   819: astore #34
/*     */     //   821: aload #34
/*     */     //   823: instanceof net/minecraft/block/Block
/*     */     //   826: ifeq -> 858
/*     */     //   829: aload #34
/*     */     //   831: checkcast net/minecraft/block/Block
/*     */     //   834: astore #35
/*     */     //   836: new net/minecraft/item/ItemStack
/*     */     //   839: dup
/*     */     //   840: aload #35
/*     */     //   842: iconst_1
/*     */     //   843: iconst_0
/*     */     //   844: invokespecial <init> : (Lnet/minecraft/block/Block;II)V
/*     */     //   847: astore #36
/*     */     //   849: aload #36
/*     */     //   851: astore #31
/*     */     //   853: aload #31
/*     */     //   855: goto -> 918
/*     */     //   858: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   861: dup
/*     */     //   862: new scala/StringContext
/*     */     //   865: dup
/*     */     //   866: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   869: iconst_2
/*     */     //   870: anewarray java/lang/String
/*     */     //   873: dup
/*     */     //   874: iconst_0
/*     */     //   875: ldc_w 'No ore dictionary entry, item or block found for ingredient with name ''
/*     */     //   878: aastore
/*     */     //   879: dup
/*     */     //   880: iconst_1
/*     */     //   881: ldc_w ''.'
/*     */     //   884: aastore
/*     */     //   885: checkcast [Ljava/lang/Object;
/*     */     //   888: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   891: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   894: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   897: iconst_1
/*     */     //   898: anewarray java/lang/Object
/*     */     //   901: dup
/*     */     //   902: iconst_0
/*     */     //   903: aload #26
/*     */     //   905: aastore
/*     */     //   906: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   909: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   912: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   915: athrow
/*     */     //   916: aload #26
/*     */     //   918: astore #4
/*     */     //   920: aload #4
/*     */     //   922: areturn
/*     */     //   923: new li/cil/oc/common/recipe/Recipes$RecipeException
/*     */     //   926: dup
/*     */     //   927: new scala/StringContext
/*     */     //   930: dup
/*     */     //   931: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   934: iconst_2
/*     */     //   935: anewarray java/lang/String
/*     */     //   938: dup
/*     */     //   939: iconst_0
/*     */     //   940: ldc_w 'Invalid ingredient type (not a map or string): '
/*     */     //   943: aastore
/*     */     //   944: dup
/*     */     //   945: iconst_1
/*     */     //   946: ldc_w ''
/*     */     //   949: aastore
/*     */     //   950: checkcast [Ljava/lang/Object;
/*     */     //   953: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   956: invokespecial <init> : (Lscala/collection/Seq;)V
/*     */     //   959: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   962: iconst_1
/*     */     //   963: anewarray java/lang/Object
/*     */     //   966: dup
/*     */     //   967: iconst_0
/*     */     //   968: aload_2
/*     */     //   969: aastore
/*     */     //   970: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   973: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*     */     //   976: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   979: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #376	-> 0
/*     */     //   #377	-> 2
/*     */     //   #378	-> 14
/*     */     //   #379	-> 32
/*     */     //   #380	-> 43
/*     */     //   #379	-> 62
/*     */     //   #381	-> 67
/*     */     //   #384	-> 125
/*     */     //   #385	-> 143
/*     */     //   #386	-> 154
/*     */     //   #387	-> 169
/*     */     //   #388	-> 177
/*     */     //   #387	-> 231
/*     */     //   #389	-> 238
/*     */     //   #391	-> 296
/*     */     //   #385	-> 332
/*     */     //   #392	-> 337
/*     */     //   #395	-> 395
/*     */     //   #396	-> 413
/*     */     //   #397	-> 424
/*     */     //   #398	-> 439
/*     */     //   #399	-> 447
/*     */     //   #398	-> 501
/*     */     //   #400	-> 508
/*     */     //   #402	-> 566
/*     */     //   #396	-> 602
/*     */     //   #378	-> 604
/*     */     //   #403	-> 609
/*     */     //   #406	-> 667
/*     */     //   #407	-> 678
/*     */     //   #408	-> 691
/*     */     //   #409	-> 711
/*     */     //   #411	-> 730
/*     */     //   #412	-> 738
/*     */     //   #414	-> 791
/*     */     //   #415	-> 799
/*     */     //   #414	-> 849
/*     */     //   #411	-> 853
/*     */     //   #416	-> 858
/*     */     //   #409	-> 916
/*     */     //   #408	-> 918
/*     */     //   #376	-> 920
/*     */     //   #420	-> 923
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	980	0	this	Lli/cil/oc/common/recipe/Recipes$;
/*     */     //   0	980	1	entry	Ljava/lang/Object;
/*     */     //   199	781	13	item	Ljava/lang/Object;
/*     */     //   469	511	22	block	Ljava/lang/Object;
/*     */     //   760	220	29	item	Ljava/lang/Object;
/*     */     //   821	159	34	block	Ljava/lang/Object;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Option<FluidStack> parseFluidIngredient(Config entry) {
/* 424 */     Fluid fluid = FluidRegistry.getFluid(entry.getString("name"));
/* 425 */     int amount = 
/* 426 */       entry.hasPath("amount") ? entry.getInt("amount") : 
/* 427 */       1000;
/* 428 */     return scala.Option$.MODULE$.apply(new FluidStack(fluid, amount));
/*     */   }
/*     */   
/* 431 */   private Option<Object> findItem(String name) { return getObjectWithoutFallback(Item.field_150901_e, name).orElse((Function0)new Recipes$$anonfun$findItem$1(name)); } public final class Recipes$$anonfun$findItem$1 extends AbstractFunction0<Option<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final String name$2; public final Option<Object> apply() { return scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)Item.field_150901_e).find((Function1)new Recipes$$anonfun$findItem$1$$anonfun$apply$1(this)); }
/*     */      public Recipes$$anonfun$findItem$1(String name$2) {} public final class Recipes$$anonfun$findItem$1$$anonfun$apply$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(Object x0$1) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: astore_2
/*     */         //   2: aload_2
/*     */         //   3: instanceof net/minecraft/item/Item
/*     */         //   6: ifeq -> 110
/*     */         //   9: aload_2
/*     */         //   10: checkcast net/minecraft/item/Item
/*     */         //   13: astore_3
/*     */         //   14: aload_3
/*     */         //   15: invokevirtual func_77658_a : ()Ljava/lang/String;
/*     */         //   18: aload_0
/*     */         //   19: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findItem$1;
/*     */         //   22: getfield name$2 : Ljava/lang/String;
/*     */         //   25: astore #5
/*     */         //   27: dup
/*     */         //   28: ifnonnull -> 40
/*     */         //   31: pop
/*     */         //   32: aload #5
/*     */         //   34: ifnull -> 100
/*     */         //   37: goto -> 48
/*     */         //   40: aload #5
/*     */         //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   45: ifne -> 100
/*     */         //   48: aload_3
/*     */         //   49: invokevirtual func_77658_a : ()Ljava/lang/String;
/*     */         //   52: new scala/collection/mutable/StringBuilder
/*     */         //   55: dup
/*     */         //   56: invokespecial <init> : ()V
/*     */         //   59: ldc 'item.'
/*     */         //   61: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   64: aload_0
/*     */         //   65: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findItem$1;
/*     */         //   68: getfield name$2 : Ljava/lang/String;
/*     */         //   71: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   77: astore #6
/*     */         //   79: dup
/*     */         //   80: ifnonnull -> 92
/*     */         //   83: pop
/*     */         //   84: aload #6
/*     */         //   86: ifnull -> 100
/*     */         //   89: goto -> 104
/*     */         //   92: aload #6
/*     */         //   94: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   97: ifeq -> 104
/*     */         //   100: iconst_1
/*     */         //   101: goto -> 105
/*     */         //   104: iconst_0
/*     */         //   105: istore #4
/*     */         //   107: goto -> 113
/*     */         //   110: iconst_0
/*     */         //   111: istore #4
/*     */         //   113: iload #4
/*     */         //   115: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #431	-> 0
/*     */         //   #432	-> 2
/*     */         //   #433	-> 110
/*     */         //   #431	-> 113
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	116	0	this	Lli/cil/oc/common/recipe/Recipes$$anonfun$findItem$1$$anonfun$apply$1;
/*     */         //   0	116	1	x0$1	Ljava/lang/Object;
/*     */       } public Recipes$$anonfun$findItem$1$$anonfun$apply$1(Recipes$$anonfun$findItem$1 $outer) {} } }
/* 436 */   private Option<Object> findBlock(String name) { return getObjectWithoutFallback(Block.field_149771_c, name).orElse((Function0)new Recipes$$anonfun$findBlock$1(name)); } public final class Recipes$$anonfun$findBlock$1 extends AbstractFunction0<Option<Object>> implements Serializable { public static final long serialVersionUID = 0L; public final String name$3; public final Option<Object> apply() { return scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable((Iterable)Block.field_149771_c).find((Function1)new Recipes$$anonfun$findBlock$1$$anonfun$apply$2(this)); }
/*     */      public Recipes$$anonfun$findBlock$1(String name$3) {} public final class Recipes$$anonfun$findBlock$1$$anonfun$apply$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final boolean apply(Object x0$2) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: astore_2
/*     */         //   2: aload_2
/*     */         //   3: instanceof net/minecraft/block/Block
/*     */         //   6: ifeq -> 110
/*     */         //   9: aload_2
/*     */         //   10: checkcast net/minecraft/block/Block
/*     */         //   13: astore_3
/*     */         //   14: aload_3
/*     */         //   15: invokevirtual func_149739_a : ()Ljava/lang/String;
/*     */         //   18: aload_0
/*     */         //   19: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findBlock$1;
/*     */         //   22: getfield name$3 : Ljava/lang/String;
/*     */         //   25: astore #5
/*     */         //   27: dup
/*     */         //   28: ifnonnull -> 40
/*     */         //   31: pop
/*     */         //   32: aload #5
/*     */         //   34: ifnull -> 100
/*     */         //   37: goto -> 48
/*     */         //   40: aload #5
/*     */         //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   45: ifne -> 100
/*     */         //   48: aload_3
/*     */         //   49: invokevirtual func_149739_a : ()Ljava/lang/String;
/*     */         //   52: new scala/collection/mutable/StringBuilder
/*     */         //   55: dup
/*     */         //   56: invokespecial <init> : ()V
/*     */         //   59: ldc 'tile.'
/*     */         //   61: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   64: aload_0
/*     */         //   65: getfield $outer : Lli/cil/oc/common/recipe/Recipes$$anonfun$findBlock$1;
/*     */         //   68: getfield name$3 : Ljava/lang/String;
/*     */         //   71: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   74: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   77: astore #6
/*     */         //   79: dup
/*     */         //   80: ifnonnull -> 92
/*     */         //   83: pop
/*     */         //   84: aload #6
/*     */         //   86: ifnull -> 100
/*     */         //   89: goto -> 104
/*     */         //   92: aload #6
/*     */         //   94: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   97: ifeq -> 104
/*     */         //   100: iconst_1
/*     */         //   101: goto -> 105
/*     */         //   104: iconst_0
/*     */         //   105: istore #4
/*     */         //   107: goto -> 113
/*     */         //   110: iconst_0
/*     */         //   111: istore #4
/*     */         //   113: iload #4
/*     */         //   115: ireturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #436	-> 0
/*     */         //   #437	-> 2
/*     */         //   #438	-> 110
/*     */         //   #436	-> 113
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	116	0	this	Lli/cil/oc/common/recipe/Recipes$$anonfun$findBlock$1$$anonfun$apply$2;
/*     */         //   0	116	1	x0$2	Ljava/lang/Object;
/*     */       } public Recipes$$anonfun$findBlock$1$$anonfun$apply$2(Recipes$$anonfun$findBlock$1 $outer) {} } }
/*     */   private Option<Object> getObjectWithoutFallback(RegistryNamespaced registry, String key) {
/* 442 */     return registry.func_148741_d(key) ? scala.Option$.MODULE$.apply(registry.func_82594_a(key)) : 
/* 443 */       (Option<Object>)scala.None$.MODULE$;
/*     */   } private String tryGetType(Config recipe) {
/* 445 */     return recipe.hasPath("type") ? recipe.getString("type") : "shaped";
/*     */   } private int tryGetId(Map ingredient) {
/*     */     boolean bool;
/* 448 */     Object object = ingredient.get("subID");
/* 449 */     if (object instanceof Number) { Number number = (Number)object; bool = number.intValue(); }
/* 450 */     else if ("any".equals(object)) { bool = true; }
/* 451 */     else if (object instanceof String) { String str = (String)object; bool = scala.Predef$.MODULE$.Integer2int(Integer.valueOf(str)); }
/* 452 */     else { bool = false; }
/* 453 */      return scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(ingredient).contains("subID") ? bool : 0;
/*     */   }
/*     */   private Block validateBlockId(Number id) {
/* 456 */     int index = id.intValue();
/* 457 */     Block block = Block.func_149729_e(index);
/* 458 */     if (block == null) { (new String[2])[0] = "Invalid block ID: "; (new String[2])[1] = ""; throw new Recipes.RecipeException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index) }))); }
/* 459 */      return block;
/*     */   }
/*     */   
/*     */   private Item validateItemId(Number id) {
/* 463 */     int index = id.intValue();
/* 464 */     Item item = Item.func_150899_d(index);
/* 465 */     if (item == null) { (new String[2])[0] = "Invalid item ID: "; (new String[2])[1] = ""; throw new Recipes.RecipeException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(index) }))); }
/* 466 */      return item;
/*     */   }
/*     */   
/*     */   public void li$cil$oc$common$recipe$Recipes$$hide(ItemStack value) {
/* 470 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(value);
/* 471 */     if (option instanceof Some) { Some some = (Some)option; Delegate stack = (Delegate)some.x(); stack.showInItemList_$eq(false); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 472 */     else { Item item = value.func_77973_b();
/* 473 */       if (item instanceof ItemBlock) { ItemBlock itemBlock = (ItemBlock)item; Block block = itemBlock.field_150939_a;
/* 474 */         if (block instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block;
/* 475 */           simpleBlock.func_149647_a(null);
/* 476 */           li.cil.oc.integration.util.NEI$.MODULE$.hide((Block)simpleBlock); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; }
/* 477 */         else { BoxedUnit boxedUnit2 = BoxedUnit.UNIT; }
/*     */          BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 479 */       else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */       
/*     */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   private Recipes$() {
/* 486 */     MODULE$ = this;
/*     */     this.list = scala.collection.mutable.LinkedHashMap$.MODULE$.empty();
/*     */     this.oreDictEntries = scala.collection.mutable.LinkedHashMap$.MODULE$.empty();
/*     */     this.hadErrors = false;
/*     */     this.recipeHandlers = scala.collection.mutable.LinkedHashMap$.MODULE$.empty();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\Recipes$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */