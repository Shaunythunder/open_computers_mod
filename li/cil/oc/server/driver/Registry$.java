/*     */ package li.cil.oc.server.driver;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.IdentityHashMap;
/*     */ import java.util.Map;
/*     */ import li.cil.oc.api.driver.Block;
/*     */ import li.cil.oc.api.driver.Converter;
/*     */ import li.cil.oc.api.driver.EnvironmentProvider;
/*     */ import li.cil.oc.api.driver.InventoryProvider;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.oc.api.driver.SidedBlock;
/*     */ import li.cil.oc.api.driver.item.HostAware;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class Registry$ implements DriverAPI {
/*     */   public static final Registry$ MODULE$;
/*     */   private final ArrayBuffer<Block> blocks;
/*     */   private final ArrayBuffer<SidedBlock> sidedBlocks;
/*     */   private final ArrayBuffer<Item> items;
/*     */   private final ArrayBuffer<Converter> converters;
/*     */   private final ArrayBuffer<EnvironmentProvider> environmentProviders;
/*     */   private final ArrayBuffer<InventoryProvider> inventoryProviders;
/*     */   private final ArrayBuffer<Tuple2<ItemStack, Set<Class<?>>>> blacklist;
/*     */   private boolean locked;
/*     */   
/*  39 */   private Registry$() { MODULE$ = this;
/*  40 */     this.blocks = (ArrayBuffer<Block>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     
/*  42 */     this.sidedBlocks = (ArrayBuffer<SidedBlock>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     
/*  44 */     this.items = (ArrayBuffer<Item>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     
/*  46 */     this.converters = (ArrayBuffer<Converter>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     
/*  48 */     this.environmentProviders = (ArrayBuffer<EnvironmentProvider>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     
/*  50 */     this.inventoryProviders = (ArrayBuffer<InventoryProvider>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     
/*  52 */     this.blacklist = (ArrayBuffer<Tuple2<ItemStack, Set<Class<?>>>>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */ 
/*     */     
/*  55 */     this.locked = false; } public ArrayBuffer<Block> blocks() { return this.blocks; } public ArrayBuffer<SidedBlock> sidedBlocks() { return this.sidedBlocks; } public ArrayBuffer<Item> items() { return this.items; } public ArrayBuffer<Converter> converters() { return this.converters; } public ArrayBuffer<EnvironmentProvider> environmentProviders() { return this.environmentProviders; } public ArrayBuffer<InventoryProvider> inventoryProviders() { return this.inventoryProviders; } public ArrayBuffer<Tuple2<ItemStack, Set<Class<?>>>> blacklist() { return this.blacklist; } public boolean locked() { return this.locked; } public void locked_$eq(boolean x$1) { this.locked = x$1; }
/*     */   
/*     */   public void add(Block driver) {
/*  58 */     if (locked()) throw new IllegalStateException("Please register all drivers in the init phase."); 
/*  59 */     if (!blocks().contains(driver)) {
/*  60 */       (new String[2])[0] = "Registering block driver "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().debug((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { driver.getClass().getName() })));
/*  61 */       blocks().$plus$eq(driver);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(SidedBlock driver) {
/*  66 */     if (locked()) throw new IllegalStateException("Please register all drivers in the init phase."); 
/*  67 */     if (!sidedBlocks().contains(driver)) {
/*  68 */       (new String[2])[0] = "Registering block driver "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().debug((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { driver.getClass().getName() })));
/*  69 */       sidedBlocks().$plus$eq(driver);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(Item driver) {
/*  74 */     if (locked()) throw new IllegalStateException("Please register all drivers in the init phase."); 
/*  75 */     if (!items().contains(driver)) {
/*  76 */       (new String[2])[0] = "Registering item driver "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().debug((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { driver.getClass().getName() })));
/*  77 */       items().$plus$eq(driver);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(Converter converter) {
/*  82 */     if (locked()) throw new IllegalStateException("Please register all converters in the init phase."); 
/*  83 */     if (!converters().contains(converter)) {
/*  84 */       (new String[2])[0] = "Registering converter "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().debug((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { converter.getClass().getName() })));
/*  85 */       converters().$plus$eq(converter);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(EnvironmentProvider provider) {
/*  90 */     if (locked()) throw new IllegalStateException("Please register all environment providers in the init phase."); 
/*  91 */     if (!environmentProviders().contains(provider)) {
/*  92 */       (new String[2])[0] = "Registering environment provider "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().debug((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { provider.getClass().getName() })));
/*  93 */       environmentProviders().$plus$eq(provider);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(InventoryProvider provider) {
/*  98 */     if (locked()) throw new IllegalStateException("Please register all inventory providers in the init phase."); 
/*  99 */     if (!inventoryProviders().contains(provider)) {
/* 100 */       (new String[2])[0] = "Registering inventory provider "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().debug((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { provider.getClass().getName() })));
/* 101 */       inventoryProviders().$plus$eq(provider);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Block driverFor(World world, int x, int y, int z) {
/*     */     Block block;
/* 107 */     SidedBlock sidedBlock = driverFor(world, x, y, z, ForgeDirection.UNKNOWN);
/* 108 */     if (sidedBlock != null) { SidedBlock sidedBlock1 = sidedBlock; block = new Registry$$anon$1(sidedBlock1);
/*     */        }
/*     */     
/*     */     else
/*     */     
/* 113 */     { block = null; }
/*     */     
/*     */     return block;
/*     */   } public final class Registry$$anon$1 implements Block {
/*     */     private final SidedBlock x2$1; public Registry$$anon$1(SidedBlock x2$1) {} public boolean worksWith(World world, int x, int y, int z) { return this.x2$1.worksWith(world, x, y, z, ForgeDirection.UNKNOWN); } public ManagedEnvironment createEnvironment(World world, int x, int y, int z) { return this.x2$1.createEnvironment(world, x, y, z, ForgeDirection.UNKNOWN); } }
/* 118 */   public SidedBlock driverFor(World world, int x, int y, int z, ForgeDirection side) { Tuple2 tuple2 = new Tuple2(sidedBlocks().filter((Function1)new Registry$$anonfun$2(world, x, y, z, side)), blocks().filter((Function1)new Registry$$anonfun$3(world, x, y, z))); if (tuple2 != null) {
/* 119 */       ArrayBuffer sidedDrivers = (ArrayBuffer)tuple2._1(), drivers = (ArrayBuffer)tuple2._2(); if (sidedDrivers.nonEmpty() || drivers.nonEmpty()) return new CompoundBlockDriver((SidedBlock[])sidedDrivers.toArray(scala.reflect.ClassTag$.MODULE$.apply(SidedBlock.class)), (Block[])drivers.toArray(scala.reflect.ClassTag$.MODULE$.apply(Block.class))); 
/* 120 */     }  return null; } public final class Registry$$anonfun$2 extends AbstractFunction1<SidedBlock, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final World world$1; private final int x$9; private final int y$1; private final int z$1; private final ForgeDirection side$1; public final boolean apply(SidedBlock x$1) { return x$1.worksWith(this.world$1, this.x$9, this.y$1, this.z$1, this.side$1); } public Registry$$anonfun$2(World world$1, int x$9, int y$1, int z$1, ForgeDirection side$1) {} } public final class Registry$$anonfun$3 extends AbstractFunction1<Block, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final World world$1; private final int x$9; private final int y$1; private final int z$1;
/*     */     public final boolean apply(Block x$2) { return x$2.worksWith(this.world$1, this.x$9, this.y$1, this.z$1); }
/*     */     public Registry$$anonfun$3(World world$1, int x$9, int y$1, int z$1) {} }
/* 125 */   public Item driverFor(ItemStack stack, Class host) { ArrayBuffer hostAware = (ArrayBuffer)items().collect((PartialFunction)new Registry$$anonfun$1(stack), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     return (stack == null) ? null : (hostAware.nonEmpty() ? (Item)hostAware.find((Function1)new Registry$$anonfun$driverFor$1(stack, host)).orNull(scala.Predef$.MODULE$.$conforms()) : driverFor(stack)); }
/*     */   public final class Registry$$anonfun$1 extends AbstractPartialFunction<Item, HostAware> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/* 136 */     private final ItemStack stack$3; public final <A1 extends Item, B1> B1 applyOrElse(Item x1, Function1 default) { Item item = x1; if (item instanceof HostAware) { HostAware hostAware = (HostAware)item; if (hostAware.worksWith(this.stack$3)) return (B1)hostAware;  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Item x1) { Item item = x1; if (item instanceof HostAware) { HostAware hostAware = (HostAware)item; if (hostAware.worksWith(this.stack$3)) return true;  }  return false; } public Registry$$anonfun$1(ItemStack stack$3) {} } public Item driverFor(ItemStack stack) { return (stack == null) ? 
/* 137 */       null : (Item)items().find((Function1)new Registry$$anonfun$driverFor$2(stack)).orNull(scala.Predef$.MODULE$.$conforms()); }
/*     */   public final class Registry$$anonfun$driverFor$1 extends AbstractFunction1<HostAware, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemStack stack$3; private final Class host$1; public final boolean apply(HostAware x$3) { return x$3.worksWith(this.stack$3, this.host$1); } public Registry$$anonfun$driverFor$1(ItemStack stack$3, Class host$1) {} } public final class Registry$$anonfun$driverFor$2 extends AbstractFunction1<Item, Object> implements Serializable {
/* 141 */     public static final long serialVersionUID = 0L; private final ItemStack stack$2; public final boolean apply(Item x$4) { return x$4.worksWith(this.stack$2); } public Registry$$anonfun$driverFor$2(ItemStack stack$2) {} } @Deprecated public Class<?> environmentFor(ItemStack stack) { return (Class)((TraversableOnce)environmentProviders().map((Function1)new Registry$$anonfun$environmentFor$2(stack), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new Registry$$anonfun$environmentFor$1())
/*     */       
/* 143 */       .orNull(scala.Predef$.MODULE$.$conforms()); } public final class Registry$$anonfun$environmentFor$2 extends AbstractFunction1<EnvironmentProvider, Class<?>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$4; public final Class<?> apply(EnvironmentProvider provider) { return provider.getEnvironment(this.stack$4); } public Registry$$anonfun$environmentFor$2(ItemStack stack$4) {} } public final class Registry$$anonfun$environmentFor$1 extends AbstractPartialFunction<Class<?>, Class<?>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final <A1 extends Class<?>, B1> B1 applyOrElse(Class x2, Function1 default) { Object object; Class clazz = x2; if (clazz != null) { Class clazz1 = clazz; } else { object = default.apply(x2); }  return (B1)object; } public final boolean isDefinedAt(Class x2) { boolean bool; Class clazz = x2; if (clazz != null) { bool = true; } else { bool = false; }  return bool; } }
/* 146 */   public Set<Class<?>> environmentsFor(ItemStack stack) { return scala.collection.convert.WrapAsJava$.MODULE$.setAsJavaSet((Set)((TraversableOnce)((TraversableLike)environmentProviders().map((Function1)new Registry$$anonfun$environmentsFor$1(stack), scala.collection.mutable.ArrayBuffer$.MODULE$.canBuildFrom())).filter((Function1)new Registry$$anonfun$environmentsFor$2())).toSet()); } public final class Registry$$anonfun$environmentsFor$1 extends AbstractFunction1<EnvironmentProvider, Class<?>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$5; public final Class<?> apply(EnvironmentProvider x$5) { return x$5.getEnvironment(this.stack$5); } public Registry$$anonfun$environmentsFor$1(ItemStack stack$5) {} } public final class Registry$$anonfun$environmentsFor$2 extends AbstractFunction1<Class<?>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Class x$6) { return !(x$6 == null); }
/*     */      }
/*     */   
/* 149 */   public IInventory inventoryFor(ItemStack stack, EntityPlayer player) { return (IInventory)inventoryProviders().find((Function1)new Registry$$anonfun$inventoryFor$1(stack, player))
/* 150 */       .map((Function1)new Registry$$anonfun$inventoryFor$2(stack, player))
/* 151 */       .orNull(scala.Predef$.MODULE$.$conforms()); } public final class Registry$$anonfun$inventoryFor$1 extends AbstractFunction1<InventoryProvider, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$6; private final EntityPlayer player$1; public final boolean apply(InventoryProvider provider) { return provider.worksWith(this.stack$6, this.player$1); } public Registry$$anonfun$inventoryFor$1(ItemStack stack$6, EntityPlayer player$1) {} } public final class Registry$$anonfun$inventoryFor$2 extends AbstractFunction1<InventoryProvider, IInventory> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$6; private final EntityPlayer player$1; public final IInventory apply(InventoryProvider provider) { return provider.getInventory(this.stack$6, this.player$1); } public Registry$$anonfun$inventoryFor$2(ItemStack stack$6, EntityPlayer player$1) {} }
/* 154 */   public List<Block> blockDrivers() { return scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList(blocks().toSeq()); }
/*     */    public List<Item> itemDrivers() {
/* 156 */     return scala.collection.convert.WrapAsJava$.MODULE$.seqAsJavaList(items().toSeq());
/*     */   }
/*     */   
/* 159 */   public void blacklistHost(ItemStack stack, Class host) { Option option = blacklist().find((Function1)new Registry$$anonfun$4(stack));
/* 160 */     if (option instanceof Some) { Some some = (Some)option; Tuple2 tuple2 = (Tuple2)some.x(); if (tuple2 != null) { Set hosts = (Set)tuple2._2(); hosts.$plus$eq(host); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 161 */      (new Class[1])[0] = host; (new Tuple2[1])[0] = new Tuple2(stack, scala.collection.mutable.Set$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[1]))); blacklist().append((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[1])); BoxedUnit boxedUnit = BoxedUnit.UNIT; } public final class Registry$$anonfun$4 extends AbstractFunction1<Tuple2<ItemStack, Set<Class<?>>>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final boolean apply(Tuple2 x$7) {
/*     */       return ((ItemStack)x$7._1()).func_77969_a(this.stack$1);
/*     */     } public Registry$$anonfun$4(ItemStack stack$1) {} }
/* 165 */   public Object[] convert(Object[] value) { return (value != null) ? (Object[])scala.Predef$.MODULE$.refArrayOps(value).map((Function1)new Registry$$anonfun$convert$1(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.AnyRef())) : null; } public final class Registry$$anonfun$convert$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Object arg) { return Registry$.MODULE$.convertRecursively(arg, new IdentityHashMap<>(), Registry$.MODULE$.convertRecursively$default$3()); }
/*     */      }
/* 167 */   public boolean convertRecursively$default$3() { return false; } public Object convertRecursively(Object value, IdentityHashMap<Object, Object> memo, boolean force) { Object object2; boolean bool;
/* 168 */     Object object4, object1 = value;
/* 169 */     if (object1 instanceof ScalaNumber) { ScalaNumber scalaNumber = (ScalaNumber)object1; object2 = scalaNumber.underlying(); }
/* 170 */     else if (object1 instanceof Object) { Object object = object1; }
/* 171 */     else if (object1 == null) { object2 = null; }
/* 172 */     else { object2 = object1; }
/*     */ 
/*     */     
/*     */     Object valueRef = object2;
/*     */     
/* 177 */     Object object3 = valueRef;
/* 178 */     if (object3 == null) { bool = true; } else if (scala.Unit$.MODULE$.equals(object3)) { bool = true; } else if (scala.None$.MODULE$.equals(object3)) { bool = true; } else { bool = false; }  if (bool) { object4 = null; }
/*     */     
/* 180 */     else if (object3 instanceof Boolean) { Boolean bool1 = (Boolean)object3; }
/* 181 */     else if (object3 instanceof Byte) { Byte byte_ = (Byte)object3; }
/* 182 */     else if (object3 instanceof Character) { Character character = (Character)object3; }
/* 183 */     else if (object3 instanceof Short) { Short short_ = (Short)object3; }
/* 184 */     else if (object3 instanceof Integer) { Integer integer = (Integer)object3; }
/* 185 */     else if (object3 instanceof Long) { Long long_ = (Long)object3; }
/* 186 */     else if (object3 instanceof Float) { Float float_ = (Float)object3; }
/* 187 */     else if (object3 instanceof Double) { Double double_ = (Double)object3; }
/* 188 */     else if (object3 instanceof Number) { Number number = (Number)object3; object4 = BoxesRunTime.boxToDouble(number.doubleValue()); }
/* 189 */     else if (object3 instanceof String) { String str = (String)object3; }
/*     */     
/* 191 */     else if (object3 instanceof boolean[]) { boolean[] arrayOfBoolean = (boolean[])object3; }
/* 192 */     else if (object3 instanceof byte[]) { byte[] arrayOfByte = (byte[])object3; }
/* 193 */     else if (object3 instanceof Character[]) { Character[] arrayOfCharacter = (Character[])object3; }
/* 194 */     else if (object3 instanceof short[]) { short[] arrayOfShort = (short[])object3; }
/* 195 */     else if (object3 instanceof Integer[]) { Integer[] arrayOfInteger = (Integer[])object3; }
/* 196 */     else if (object3 instanceof long[]) { long[] arrayOfLong = (long[])object3; }
/* 197 */     else if (object3 instanceof float[]) { float[] arrayOfFloat = (float[])object3; }
/* 198 */     else if (object3 instanceof double[]) { double[] arrayOfDouble = (double[])object3; }
/* 199 */     else if (object3 instanceof String[]) { String[] arrayOfString = (String[])object3; }
/*     */     
/* 201 */     else if (object3 instanceof Value) { Value value1 = (Value)object3; }
/*     */     
/* 203 */     else if (scala.runtime.ScalaRunTime$.MODULE$.isArray(object3, 1)) { Object object = object3; object4 = convertList(object, scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.genericArrayOps(object).zipWithIndex(scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))).iterator(), memo); }
/* 204 */     else if (object3 instanceof Product) { Object object = object3; object4 = convertList(object, ((Product)object).productIterator().zipWithIndex(), memo); }
/* 205 */     else if (object3 instanceof Seq) { Seq seq = (Seq)object3; object4 = convertList(seq, ((IterableLike)seq.zipWithIndex(scala.collection.Seq$.MODULE$.canBuildFrom())).iterator(), memo); }
/*     */     
/* 207 */     else if (object3 instanceof Map) { Map<?, ?> map = (Map)object3; object4 = convertMap(map, map, memo); }
/* 208 */     else if (object3 instanceof Map) { Map map = (Map)object3; object4 = convertMap(map, map.toMap(scala.Predef$.MODULE$.$conforms()), memo); }
/* 209 */     else if (object3 instanceof Map) { Map map = (Map)object3; object4 = convertMap(map, scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(map).toMap(scala.Predef$.MODULE$.$conforms()), memo); }
/*     */     
/* 211 */     else if (object3 instanceof Iterable) { Iterable iterable = (Iterable)object3; object4 = convertList(iterable, ((IterableLike)iterable.zipWithIndex(scala.collection.Iterable$.MODULE$.canBuildFrom())).toIterator(), memo); }
/* 212 */     else if (object3 instanceof Iterable) { Iterable iterable = (Iterable)object3; object4 = convertList(iterable, ((IterableLike)scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(iterable).zipWithIndex(scala.collection.Iterable$.MODULE$.canBuildFrom())).iterator(), memo); }
/*     */     else
/*     */     
/* 215 */     { HashMap<Object, Object> converted = new HashMap<>();
/* 216 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(memo).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(object3), converted));
/* 217 */       converters().foreach((Function1)new Registry$$anonfun$convertRecursively$1(converted, object3));
/*     */ 
/*     */ 
/*     */       
/* 221 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(memo).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(object3), object3.toString()));
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
/* 233 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(memo).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(converted), converted));
/* 234 */       convertRecursively(converted, memo, true);
/* 235 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(memo).$minus$eq(converted);
/*     */       
/* 237 */       Object object = converted.get("oc:flatten");
/* 238 */       scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(memo).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(object3), object));
/* 239 */       object4 = converted.isEmpty() ? object3.toString() : ((converted.size() == 1 && converted.containsKey("oc:flatten")) ? object : 
/*     */ 
/*     */         
/* 242 */         converted); }
/*     */      return (!force && memo.containsKey(valueRef)) ? memo.get(valueRef) : object4; } public final class Registry$$anonfun$convertRecursively$1 extends AbstractFunction1<Converter, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final HashMap converted$3; private final Object x1$1; public final void apply(Converter converter) { try {
/*     */         converter.convert(this.x1$1, this.converted$3);
/*     */       } finally {
/*     */         Exception exception = null;
/*     */       }  } public Registry$$anonfun$convertRecursively$1(HashMap converted$3, Object x1$1) {} }
/* 249 */   public Object[] convertList(Object obj, Iterator list, IdentityHashMap memo) { ArrayBuffer converted = (ArrayBuffer)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/* 250 */     scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(memo).$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(obj), converted));
/* 251 */     list.withFilter((Function1)new Registry$$anonfun$convertList$1()).foreach((Function1)new Registry$$anonfun$convertList$2(memo, converted));
/*     */ 
/*     */     
/* 254 */     return (Object[])converted.toArray(scala.reflect.ClassTag$.MODULE$.AnyRef()); } public final class Registry$$anonfun$convertList$1 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Registry$$anonfun$convertList$2 extends AbstractFunction1<Tuple2<Object, Object>, ArrayBuffer<Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final IdentityHashMap memo$1; private final ArrayBuffer converted$1; public final ArrayBuffer<Object> apply(Tuple2 x$8) { Tuple2 tuple2 = x$8; if (tuple2 != null) { Object value = tuple2._1(); return this.converted$1.$plus$eq(Registry$.MODULE$.convertRecursively(value, this.memo$1, Registry$.MODULE$.convertRecursively$default$3())); }  throw new MatchError(tuple2); }
/*     */     public Registry$$anonfun$convertList$2(IdentityHashMap memo$1, ArrayBuffer converted$1) {} }
/* 258 */   public Object convertMap(Object obj, Map map, IdentityHashMap memo) { Map map2; Object object = scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(memo).getOrElseUpdate(obj, (Function0)new Registry$$anonfun$5());
/* 259 */     if (object instanceof Map) { Map map3 = (Map)object; }
/* 260 */     else { if (object instanceof Map) { Map map3 = (Map)object; map2 = scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(map3);
/*     */         Map converted = map2;
/* 262 */         map.collect((PartialFunction)new Registry$$anonfun$convertMap$1(memo, converted), scala.collection.immutable.Iterable$.MODULE$.canBuildFrom());
/*     */ 
/*     */         
/* 265 */         return memo.get(obj); }  throw new MatchError(object); }  Map map1 = map2; map.collect((PartialFunction)new Registry$$anonfun$convertMap$1(memo, map1), scala.collection.immutable.Iterable$.MODULE$.canBuildFrom()); return memo.get(obj); }
/*     */ 
/*     */   
/*     */   public final class Registry$$anonfun$5 extends AbstractFunction0<Map<Object, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Map<Object, Object> apply() {
/*     */       return scala.collection.mutable.Map$.MODULE$.empty();
/*     */     }
/*     */   }
/*     */   
/*     */   public final class Registry$$anonfun$convertMap$1 extends AbstractPartialFunction<Tuple2<Object, Object>, Map<Object, Object>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final IdentityHashMap memo$2;
/*     */     private final Map converted$2;
/*     */     
/*     */     public final <A1 extends Tuple2<Object, Object>, B1> B1 applyOrElse(Tuple2 x3, Function1 default) {
/*     */       Tuple2 tuple2 = x3;
/*     */       if (tuple2 != null) {
/*     */         Object key = tuple2._1(), value = tuple2._2();
/*     */         if (key instanceof Object) {
/*     */           Object object = key;
/*     */           if (value instanceof Object) {
/*     */             Object object1 = value;
/*     */             return (B1)this.converted$2.$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(Registry$.MODULE$.convertRecursively(object, this.memo$2, Registry$.MODULE$.convertRecursively$default$3())), Registry$.MODULE$.convertRecursively(object1, this.memo$2, Registry$.MODULE$.convertRecursively$default$3())));
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       return (B1)default.apply(x3);
/*     */     }
/*     */     
/*     */     public final boolean isDefinedAt(Tuple2 x3) {
/*     */       Tuple2 tuple2 = x3;
/*     */       if (tuple2 != null) {
/*     */         Object key = tuple2._1(), value = tuple2._2();
/*     */         if (key instanceof Object && value instanceof Object)
/*     */           return true; 
/*     */       } 
/*     */       return false;
/*     */     }
/*     */     
/*     */     public Registry$$anonfun$convertMap$1(IdentityHashMap memo$2, Map converted$2) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\driver\Registry$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */