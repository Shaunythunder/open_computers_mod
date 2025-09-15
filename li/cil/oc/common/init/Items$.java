/*     */ package li.cil.oc.common.init;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.concurrent.Callable;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.block.SimpleBlock;
/*     */ import li.cil.oc.common.item.ComponentBus;
/*     */ import li.cil.oc.common.item.Delegator;
/*     */ import li.cil.oc.common.item.Memory;
/*     */ import li.cil.oc.common.item.Server;
/*     */ import li.cil.oc.common.item.data.DroneData;
/*     */ import li.cil.oc.common.item.data.HoverBootsData;
/*     */ import li.cil.oc.common.item.data.MicrocontrollerData;
/*     */ import li.cil.oc.common.item.data.RobotData;
/*     */ import li.cil.oc.common.item.data.TabletData;
/*     */ import li.cil.oc.common.item.traits.Delegate;
/*     */ import li.cil.oc.common.item.traits.SimpleItem;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class Items$ implements ItemAPI {
/*     */   public static final Items$ MODULE$;
/*     */   private final Map<String, ItemInfo> descriptors;
/*     */   private final Map<Object, String> names;
/*     */   private final Map<String, String> aliases;
/*     */   private final ArrayBuffer<ItemStack> registeredItems;
/*     */   
/*  39 */   private Items$() { MODULE$ = this;
/*  40 */     this.descriptors = scala.collection.mutable.Map$.MODULE$.empty();
/*     */     
/*  42 */     this.names = scala.collection.mutable.Map$.MODULE$.empty();
/*     */     
/*  44 */     (new Tuple2[2])[0] = scala.Predef$ArrowAssoc$.MODULE$
/*  45 */       .$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("dataCard"), "dataCard1");
/*  46 */     (new Tuple2[2])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc("wlanCard"), "wlanCard2");
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.aliases = (Map<String, String>)scala.Predef$.MODULE$.Map().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[2]));
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
/*     */ 
/*     */ 
/*     */     
/* 143 */     this.registeredItems = (ArrayBuffer<ItemStack>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty(); } public Map<String, ItemInfo> descriptors() { return this.descriptors; } public Map<Object, String> names() { return this.names; } public Map<String, String> aliases() { return this.aliases; } public ItemInfo get(String name) { return (ItemInfo)descriptors().get(name).orNull(scala.Predef$.MODULE$.$conforms()); } public ItemInfo get(ItemStack stack) { ItemInfo itemInfo; Option option = names().get(getBlockOrItem(stack)); if (option instanceof Some) { Some some = (Some)option; String name = (String)some.x(); itemInfo = get(name); } else { itemInfo = null; }  return itemInfo; } public <T extends Block> T registerBlock(Block instance, String id) { BoxedUnit boxedUnit; Block block = instance; if (block instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block; instance.func_149663_c((new StringBuilder()).append("oc.").append(id).toString()); Block block1 = GameRegistry.registerBlock((Block)simpleBlock, Item.class, id); } else { boxedUnit = BoxedUnit.UNIT; }  descriptors().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(id), new Items$$anon$7(instance, id))); names().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(instance), id)); return (T)instance; } public final class Items$$anon$7 implements ItemInfo { private final Block instance$2; private final String id$4; public Items$$anon$7(Block instance$2, String id$4) {} public String name() { return this.id$4; } public T block() { return (T)this.instance$2; } public scala.runtime.Null$ item() { return null; } public ItemStack createItemStack(int size) { ItemStack itemStack; Block block = this.instance$2; if (block instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block; itemStack = simpleBlock.createItemStack(size); } else { itemStack = new ItemStack(this.instance$2, size); }  return itemStack; } } public ArrayBuffer<ItemStack> registeredItems() { return this.registeredItems; }
/*     */   public <T extends Delegate> T registerItem(Delegate delegate, String id) { descriptors().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(id), new Items$$anon$6(delegate, id))); names().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(delegate), id)); return (T)delegate; }
/*     */   public final class Items$$anon$6 implements ItemInfo {
/*     */     private final Delegate delegate$1; private final String id$3; public Items$$anon$6(Delegate delegate$1, String id$3) {} public String name() { return this.id$3; } public scala.runtime.Null$ block() { return null; } public Delegator item() { return this.delegate$1.parent(); } public ItemStack createItemStack(int size) { return this.delegate$1.createItemStack(size); } } public Item registerItem(Item instance, String id) { Item item = instance; if (item instanceof SimpleItem) { SimpleItem simpleItem = (SimpleItem)item; ((Item)simpleItem).func_77655_b((new StringBuilder()).append("oc.").append(id).toString()); GameRegistry.registerItem((Item)simpleItem, id); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  descriptors().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(id), new Items$$anon$5(instance, id))); names().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(instance), id)); return instance; } public final class Items$$anon$5 implements ItemInfo {
/* 147 */     private final Item instance$1; private final String id$2; public Items$$anon$5(Item instance$1, String id$2) {} public String name() { return this.id$2; } public scala.runtime.Null$ block() { return null; } public Item item() { return this.instance$1; } public ItemStack createItemStack(int size) { ItemStack itemStack; Item item = this.instance$1; if (item instanceof SimpleItem) { SimpleItem simpleItem = (SimpleItem)item; itemStack = simpleItem.createItemStack(size); } else { itemStack = new ItemStack(this.instance$1, size); }  return itemStack; } } @Deprecated public ItemStack registerFloppy(String name, int color, Callable<FileSystem> factory) { return registerFloppy(name, color, factory, false); }
/*     */   public ItemStack registerStack(ItemStack stack, String id) { ItemStack immutableStack = stack.func_77946_l(); descriptors().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(id), new Items$$anon$4(id, immutableStack))); return stack; } public final class Items$$anon$4 implements ItemInfo {
/*     */     private final String id$1; private final ItemStack immutableStack$1; public Items$$anon$4(String id$1, ItemStack immutableStack$1) {} public String name() { return this.id$1; } public scala.runtime.Null$ block() { return null; } public ItemStack createItemStack(int size) { ItemStack copy = this.immutableStack$1.func_77946_l(); copy.field_77994_a = size; return copy; } public Item item() { return this.immutableStack$1.func_77973_b(); } } private Object getBlockOrItem(ItemStack stack) { return (stack == null) ? null : li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack).getOrElse((Function0)new Items$$anonfun$getBlockOrItem$1(stack)); } public final class Items$$anonfun$getBlockOrItem$1 extends AbstractFunction0<Object> implements Serializable {
/* 150 */     public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final Object apply() { Item item2, item1 = this.stack$1.func_77973_b(); if (item1 instanceof ItemBlock) { ItemBlock itemBlock = (ItemBlock)item1; Block block = itemBlock.field_150939_a; } else { item2 = item1; }  return item2; } public Items$$anonfun$getBlockOrItem$1(ItemStack stack$1) {} } public ItemStack registerFloppy(String name, int color, Callable factory, boolean doRecipeCycling) { ItemStack stack = li.cil.oc.common.Loot$.MODULE$.registerLootDisk(name, color, factory, doRecipeCycling);
/*     */     
/* 152 */     registeredItems().$plus$eq(stack);
/*     */     
/* 154 */     return stack.func_77946_l(); }
/*     */ 
/*     */   
/*     */   public ItemStack registerEEPROM(String name, byte[] code, byte[] data, boolean readonly) {
/* 158 */     NBTTagCompound nbt = new NBTTagCompound();
/* 159 */     if (name != null) {
/* 160 */       nbt.func_74778_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("label").toString(), (String)(new StringOps(scala.Predef$.MODULE$.augmentString(name.trim()))).take(24));
/*     */     }
/* 162 */     if (code != null) {
/* 163 */       nbt.func_74773_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("eeprom").toString(), (byte[])scala.Predef$.MODULE$.byteArrayOps(code).take(li.cil.oc.Settings$.MODULE$.get().eepromSize()));
/*     */     }
/* 165 */     if (data != null) {
/* 166 */       nbt.func_74773_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("userdata").toString(), (byte[])scala.Predef$.MODULE$.byteArrayOps(data).take(li.cil.oc.Settings$.MODULE$.get().eepromDataSize()));
/*     */     }
/* 168 */     nbt.func_74757_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("readonly").toString(), readonly);
/*     */     
/* 170 */     NBTTagCompound stackNbt = new NBTTagCompound();
/* 171 */     stackNbt.func_74782_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString(), (NBTBase)nbt);
/*     */     
/* 173 */     ItemStack stack = get("eeprom").createItemStack(1);
/* 174 */     stack.func_77982_d(stackNbt);
/*     */     
/* 176 */     registeredItems().$plus$eq(stack);
/*     */     
/* 178 */     return stack.func_77946_l();
/*     */   }
/*     */   
/*     */   private ItemStack safeGetStack(String name)
/*     */   {
/* 183 */     return (ItemStack)scala.Option$.MODULE$.apply(get(name)).map((Function1)new Items$$anonfun$safeGetStack$1()).orNull(scala.Predef$.MODULE$.$conforms()); } public final class Items$$anonfun$safeGetStack$1 extends AbstractFunction1<ItemInfo, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack apply(ItemInfo x$1) { return x$1.createItemStack(1); }
/*     */      }
/*     */   public ItemStack createConfiguredDrone() {
/* 186 */     DroneData data = new DroneData();
/*     */     
/* 188 */     data.name_$eq("Crecopter");
/* 189 */     data.tier_$eq(3);
/* 190 */     data.storedEnergy_$eq((int)li.cil.oc.Settings$.MODULE$.get().bufferDrone());
/* 191 */     (new ItemStack[10])[0] = 
/* 192 */       safeGetStack("inventoryUpgrade");
/* 193 */     (new ItemStack[10])[1] = safeGetStack("inventoryUpgrade");
/* 194 */     (new ItemStack[10])[2] = safeGetStack("inventoryControllerUpgrade");
/* 195 */     (new ItemStack[10])[3] = safeGetStack("tankUpgrade");
/* 196 */     (new ItemStack[10])[4] = safeGetStack("tankControllerUpgrade");
/* 197 */     (new ItemStack[10])[5] = safeGetStack("leashUpgrade");
/*     */     
/* 199 */     (new ItemStack[10])[6] = safeGetStack("wlanCard2");
/*     */     
/* 201 */     (new ItemStack[10])[7] = li.cil.oc.server.machine.luac.LuaStateFactory$.MODULE$.setDefaultArch(safeGetStack("cpu3"));
/* 202 */     (new ItemStack[10])[8] = safeGetStack("ram6");
/* 203 */     (new ItemStack[10])[9] = safeGetStack("ram6");
/*     */     
/*     */     data.components_$eq(new ItemStack[10]);
/* 206 */     return data.createItemStack();
/*     */   }
/*     */   
/*     */   public ItemStack createConfiguredMicrocontroller() {
/* 210 */     MicrocontrollerData data = new MicrocontrollerData(li.cil.oc.common.item.data.MicrocontrollerData$.MODULE$.$lessinit$greater$default$1());
/*     */     
/* 212 */     data.tier_$eq(3);
/* 213 */     data.storedEnergy_$eq((int)li.cil.oc.Settings$.MODULE$.get().bufferMicrocontroller());
/* 214 */     (new ItemStack[7])[0] = 
/* 215 */       safeGetStack("signUpgrade");
/* 216 */     (new ItemStack[7])[1] = safeGetStack("pistonUpgrade");
/*     */     
/* 218 */     (new ItemStack[7])[2] = safeGetStack("redstoneCard2");
/* 219 */     (new ItemStack[7])[3] = safeGetStack("wlanCard2");
/*     */     
/* 221 */     (new ItemStack[7])[4] = li.cil.oc.server.machine.luac.LuaStateFactory$.MODULE$.setDefaultArch(safeGetStack("cpu3"));
/* 222 */     (new ItemStack[7])[5] = safeGetStack("ram6");
/* 223 */     (new ItemStack[7])[6] = safeGetStack("ram6");
/*     */     
/*     */     data.components_$eq(new ItemStack[7]);
/* 226 */     return data.createItemStack();
/*     */   }
/*     */   
/*     */   public ItemStack createConfiguredRobot() {
/* 230 */     RobotData data = new RobotData();
/*     */     
/* 232 */     data.name_$eq("Creatix");
/* 233 */     data.tier_$eq(3);
/* 234 */     data.robotEnergy_$eq((int)li.cil.oc.Settings$.MODULE$.get().bufferRobot());
/* 235 */     data.totalEnergy_$eq(data.robotEnergy());
/* 236 */     (new ItemStack[24])[0] = 
/* 237 */       safeGetStack("screen1");
/* 238 */     (new ItemStack[24])[1] = safeGetStack("keyboard");
/* 239 */     (new ItemStack[24])[2] = safeGetStack("geolyzer");
/* 240 */     (new ItemStack[24])[3] = safeGetStack("inventoryUpgrade");
/* 241 */     (new ItemStack[24])[4] = safeGetStack("inventoryUpgrade");
/* 242 */     (new ItemStack[24])[5] = safeGetStack("inventoryUpgrade");
/* 243 */     (new ItemStack[24])[6] = safeGetStack("inventoryUpgrade");
/* 244 */     (new ItemStack[24])[7] = safeGetStack("inventoryControllerUpgrade");
/* 245 */     (new ItemStack[24])[8] = safeGetStack("tankUpgrade");
/* 246 */     (new ItemStack[24])[9] = safeGetStack("tankControllerUpgrade");
/* 247 */     (new ItemStack[24])[10] = safeGetStack("craftingUpgrade");
/* 248 */     (new ItemStack[24])[11] = safeGetStack("hoverUpgrade2");
/* 249 */     (new ItemStack[24])[12] = safeGetStack("tradingUpgrade");
/* 250 */     (new ItemStack[24])[13] = safeGetStack("experienceUpgrade");
/*     */     
/* 252 */     (new ItemStack[24])[14] = safeGetStack("graphicsCard3");
/* 253 */     (new ItemStack[24])[15] = safeGetStack("redstoneCard2");
/* 254 */     (new ItemStack[24])[16] = safeGetStack("wlanCard2");
/* 255 */     (new ItemStack[24])[17] = safeGetStack("internetCard");
/*     */     
/* 257 */     (new ItemStack[24])[18] = li.cil.oc.server.machine.luac.LuaStateFactory$.MODULE$.setDefaultArch(safeGetStack("cpu3"));
/* 258 */     (new ItemStack[24])[19] = safeGetStack("ram6");
/* 259 */     (new ItemStack[24])[20] = safeGetStack("ram6");
/*     */     
/* 261 */     (new ItemStack[24])[21] = safeGetStack("luaBios");
/* 262 */     (new ItemStack[24])[22] = safeGetStack("openos");
/* 263 */     (new ItemStack[24])[23] = safeGetStack("hdd3");
/*     */     data.components_$eq(new ItemStack[24]);
/* 265 */     (new ItemStack[3])[0] = 
/* 266 */       safeGetStack("cardContainer3");
/* 267 */     (new ItemStack[3])[1] = safeGetStack("upgradeContainer3");
/* 268 */     (new ItemStack[3])[2] = safeGetStack("diskDrive");
/*     */     
/*     */     data.containers_$eq(new ItemStack[3]);
/* 271 */     return data.createItemStack();
/*     */   }
/*     */   
/*     */   public ItemStack createConfiguredTablet() {
/* 275 */     TabletData data = new TabletData();
/*     */     
/* 277 */     data.tier_$eq(3);
/* 278 */     data.energy_$eq(li.cil.oc.Settings$.MODULE$.get().bufferTablet());
/* 279 */     data.maxEnergy_$eq(data.energy());
/* 280 */     (new Option[15])[0] = 
/* 281 */       scala.Option$.MODULE$.apply(safeGetStack("screen1"));
/* 282 */     (new Option[15])[1] = scala.Option$.MODULE$.apply(safeGetStack("keyboard"));
/*     */     
/* 284 */     (new Option[15])[2] = scala.Option$.MODULE$.apply(safeGetStack("signUpgrade"));
/* 285 */     (new Option[15])[3] = scala.Option$.MODULE$.apply(safeGetStack("pistonUpgrade"));
/* 286 */     (new Option[15])[4] = scala.Option$.MODULE$.apply(safeGetStack("geolyzer"));
/* 287 */     (new Option[15])[5] = scala.Option$.MODULE$.apply(safeGetStack("navigationUpgrade"));
/* 288 */     (new Option[15])[6] = scala.Option$.MODULE$.apply(safeGetStack("analyzer"));
/*     */     
/* 290 */     (new Option[15])[7] = scala.Option$.MODULE$.apply(safeGetStack("graphicsCard2"));
/* 291 */     (new Option[15])[8] = scala.Option$.MODULE$.apply(safeGetStack("redstoneCard2"));
/* 292 */     (new Option[15])[9] = scala.Option$.MODULE$.apply(safeGetStack("wlanCard2"));
/*     */     
/* 294 */     (new Option[15])[10] = scala.Option$.MODULE$.apply(li.cil.oc.server.machine.luac.LuaStateFactory$.MODULE$.setDefaultArch(safeGetStack("cpu3")));
/* 295 */     (new Option[15])[11] = scala.Option$.MODULE$.apply(safeGetStack("ram6"));
/* 296 */     (new Option[15])[12] = scala.Option$.MODULE$.apply(safeGetStack("ram6"));
/*     */     
/* 298 */     (new Option[15])[13] = scala.Option$.MODULE$.apply(safeGetStack("luaBios"));
/* 299 */     (new Option[15])[14] = scala.Option$.MODULE$.apply(safeGetStack("hdd3"));
/* 300 */     data.items_$eq((Option[])scala.Predef$.MODULE$.refArrayOps((Object[])new Option[15]).padTo(32, scala.None$.MODULE$, scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Option.class))));
/* 301 */     data.items()[31] = scala.Option$.MODULE$.apply(safeGetStack("openos"));
/* 302 */     data.container_$eq(scala.Option$.MODULE$.apply(safeGetStack("diskDrive")));
/*     */     
/* 304 */     return data.createItemStack();
/*     */   }
/*     */   
/*     */   public ItemStack createChargedHoverBoots() {
/* 308 */     HoverBootsData data = new HoverBootsData();
/* 309 */     data.charge_$eq(li.cil.oc.Settings$.MODULE$.get().bufferHoverBoots());
/*     */     
/* 311 */     return data.createItemStack();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void init()
/*     */   {
/* 318 */     Delegator multi = new Items$$anon$1();
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
/* 335 */     GameRegistry.registerItem((Item)multi, "item");
/*     */     
/* 337 */     (new String[1])[0] = "oc:analyzer"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Analyzer(multi), "analyzer", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 339 */     (new String[1])[0] = "oc:ram1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Memory(multi, 0), "ram1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 340 */     (new String[1])[0] = "oc:ram3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Memory(multi, 2), "ram3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 341 */     (new String[1])[0] = "oc:ram4"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Memory(multi, 3), "ram4", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 343 */     (new String[1])[0] = "oc:floppy"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new FloppyDisk(multi), "floppy", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 344 */     (new String[1])[0] = "oc:hdd1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new HardDiskDrive(multi, 0), "hdd1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 345 */     (new String[1])[0] = "oc:hdd2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new HardDiskDrive(multi, 1), "hdd2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 346 */     (new String[1])[0] = "oc:hdd3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new HardDiskDrive(multi, 2), "hdd3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 348 */     (new String[1])[0] = "oc:graphicsCard1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new GraphicsCard(multi, 0), "graphicsCard1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 349 */     (new String[1])[0] = "oc:graphicsCard2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new GraphicsCard(multi, 1), "graphicsCard2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 350 */     (new String[1])[0] = "oc:graphicsCard3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new GraphicsCard(multi, 2), "graphicsCard3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 351 */     (new String[1])[0] = "oc:lanCard"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new NetworkCard(multi), "lanCard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 352 */     (new String[1])[0] = "oc:redstoneCard2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new RedstoneCard(multi, 1), "redstoneCard2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 353 */     (new String[1])[0] = "oc:wlanCard2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new WirelessNetworkCard(multi, 1), "wlanCard2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 355 */     (new String[1])[0] = "oc:craftingUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeCrafting(multi), "craftingUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 356 */     (new String[1])[0] = "oc:generatorUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeGenerator(multi), "generatorUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 358 */     registerItem(new IronNugget(multi), "nuggetIron");
/*     */     
/* 360 */     (new String[1])[0] = "oc:materialCuttingWire"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new CuttingWire(multi), "cuttingWire", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 361 */     (new String[1])[0] = "oc:materialAcid"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Acid(multi), "acid", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 362 */     (new String[1])[0] = "oc:materialDisk"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Disk(multi), "disk", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 364 */     (new String[1])[0] = "oc:materialButtonGroup"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ButtonGroup(multi), "buttonGroup", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 365 */     (new String[1])[0] = "oc:materialArrowKey"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ArrowKeys(multi), "arrowKeys", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 366 */     (new String[1])[0] = "oc:materialNumPad"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new NumPad(multi), "numPad", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 368 */     (new String[1])[0] = "oc:materialTransistor"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Transistor(multi), "transistor", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 369 */     (new String[1])[0] = "oc:circuitChip1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Microchip(multi, 0), "chip1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 370 */     (new String[1])[0] = "oc:circuitChip2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Microchip(multi, 1), "chip2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 371 */     (new String[1])[0] = "oc:circuitChip3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Microchip(multi, 2), "chip3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 372 */     (new String[1])[0] = "oc:materialALU"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ALU(multi), "alu", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 373 */     (new String[1])[0] = "oc:materialCU"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ControlUnit(multi), "cu", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 374 */     (new String[1])[0] = "oc:cpu1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new CPU(multi, 0), "cpu1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 376 */     (new String[1])[0] = "oc:materialCircuitBoardRaw"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new RawCircuitBoard(multi), "rawCircuitBoard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 377 */     (new String[1])[0] = "oc:materialCircuitBoard"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new CircuitBoard(multi), "circuitBoard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 378 */     (new String[1])[0] = "oc:materialCircuitBoardPrinted"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new PrintedCircuitBoard(multi), "printedCircuitBoard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 379 */     (new String[1])[0] = "oc:materialCard"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new CardBase(multi), "card", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 382 */     (new String[1])[0] = "oc:solarGeneratorUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeSolarGenerator(multi), "solarGeneratorUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 383 */     (new String[1])[0] = "oc:signUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeSign(multi), "signUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 384 */     (new String[1])[0] = "oc:navigationUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeNavigation(multi), "navigationUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 387 */     AbstractBusCard abstractBus = new AbstractBusCard(multi);
/*     */     
/* 389 */     (new String[1])[0] = "oc:abstractBusCard"; li.cil.oc.integration.Mods$.MODULE$.StargateTech2().isAvailable() ? li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)abstractBus, "abstractBusCard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1])) : BoxedUnit.UNIT;
/*     */ 
/*     */     
/* 392 */     (new String[1])[0] = "oc:ram5"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Memory(multi, 4), "ram5", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 393 */     (new String[1])[0] = "oc:ram6"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Memory(multi, 5), "ram6", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 396 */     (new String[1])[0] = "oc:server3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Server(multi, 2), "server3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 397 */     (new String[1])[0] = "oc:terminal"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Terminal(multi), "terminal", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 398 */     (new String[1])[0] = "oc:cpu2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new CPU(multi, 1), "cpu2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 399 */     (new String[1])[0] = "oc:cpu3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new CPU(multi, 2), "cpu3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 400 */     (new String[1])[0] = "oc:internetCard"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new InternetCard(multi), "internetCard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 401 */     (new String[1])[0] = "oc:server1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Server(multi, 0), "server1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 402 */     (new String[1])[0] = "oc:server2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Server(multi, 1), "server2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 405 */     registerItem(new Items$$anon$2(multi), 
/*     */         
/* 407 */         "lootDisk");
/*     */ 
/*     */     
/* 410 */     (new String[1])[0] = "oc:materialInterweb"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Interweb(multi), "interweb", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 411 */     (new String[1])[0] = "oc:angelUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeAngel(multi), "angelUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 412 */     (new String[1])[0] = "oc:ram2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Memory(multi, 1), "ram2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 415 */     (new String[1])[0] = "oc:linkedCard"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new LinkedCard(multi), "linkedCard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 416 */     (new String[1])[0] = "oc:experienceUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeExperience(multi), "experienceUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 417 */     (new String[1])[0] = "oc:inventoryUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeInventory(multi), "inventoryUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 418 */     (new String[1])[0] = "oc:upgradeContainer1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeContainerUpgrade(multi, 0), "upgradeContainer1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 419 */     (new String[1])[0] = "oc:upgradeContainer2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeContainerUpgrade(multi, 1), "upgradeContainer2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 420 */     (new String[1])[0] = "oc:upgradeContainer3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeContainerUpgrade(multi, 2), "upgradeContainer3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 421 */     (new String[1])[0] = "oc:cardContainer1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeContainerCard(multi, 0), "cardContainer1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 422 */     (new String[1])[0] = "oc:cardContainer2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeContainerCard(multi, 1), "cardContainer2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 423 */     (new String[1])[0] = "oc:cardContainer3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeContainerCard(multi, 2), "cardContainer3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 429 */     new Items$$anon$3(multi);
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
/* 440 */     (new String[1])[0] = "oc:inventoryControllerUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeInventoryController(multi), "inventoryControllerUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 441 */     (new String[1])[0] = "oc:chunkloaderUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeChunkloader(multi), "chunkloaderUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 442 */     (new String[1])[0] = "oc:batteryUpgrade1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeBattery(multi, 0), "batteryUpgrade1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 443 */     (new String[1])[0] = "oc:batteryUpgrade2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeBattery(multi, 1), "batteryUpgrade2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 444 */     (new String[1])[0] = "oc:batteryUpgrade3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeBattery(multi, 2), "batteryUpgrade3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 445 */     (new String[1])[0] = "oc:redstoneCard1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new RedstoneCard(multi, 0), "redstoneCard1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 448 */     (new String[1])[0] = "oc:tractorBeamUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeTractorBeam(multi), "tractorBeamUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 451 */     registerItem(new Tablet(multi), "tablet");
/*     */ 
/*     */     
/* 454 */     registerItem(new Server(multi, 3), "serverCreative");
/*     */ 
/*     */     
/* 457 */     (new String[1])[0] = "oc:componentBus1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ComponentBus(multi, 0), "componentBus1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 458 */     (new String[1])[0] = "oc:componentBus2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ComponentBus(multi, 1), "componentBus2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 459 */     (new String[1])[0] = "oc:componentBus3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new ComponentBus(multi, 2), "componentBus3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 460 */     registerItem(new DebugCard(multi), "debugCard");
/*     */ 
/*     */     
/* 463 */     (new String[1])[0] = "oc:tabletCase1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new TabletCase(multi, 0), "tabletCase1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 464 */     (new String[1])[0] = "oc:pistonUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradePiston(multi), "pistonUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 465 */     (new String[1])[0] = "oc:tankUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeTank(multi), "tankUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 466 */     (new String[1])[0] = "oc:tankControllerUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeTankController(multi), "tankControllerUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 469 */     (new String[1])[0] = "oc:databaseUpgrade1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeDatabase(multi, 0), "databaseUpgrade1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 470 */     (new String[1])[0] = "oc:databaseUpgrade2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeDatabase(multi, 1), "databaseUpgrade2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 471 */     (new String[1])[0] = "oc:databaseUpgrade3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeDatabase(multi, 2), "databaseUpgrade3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 472 */     registerItem(new Debugger(multi), "debugger");
/*     */ 
/*     */     
/* 475 */     EEPROM eeprom = new EEPROM();
/* 476 */     (new String[1])[0] = "oc:eeprom"; li.cil.oc.common.recipe.Recipes$.MODULE$.addItem((Item)eeprom, "eeprom", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 478 */     byte[] code = new byte[4096];
/* 479 */     int count = li.cil.oc.OpenComputers$.MODULE$.getClass().getResourceAsStream((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.scriptPath()).append("bios.lua").toString()).read(code);
/* 480 */     ItemStack luaBios = registerEEPROM("EEPROM (Lua BIOS)", (byte[])scala.Predef$.MODULE$.byteArrayOps(code).take(count), null, false);
/*     */     
/* 482 */     li.cil.oc.common.recipe.Recipes$.MODULE$.addStack(luaBios, "luaBios", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[0]));
/*     */     
/* 484 */     (new String[1])[0] = "oc:microcontrollerCase1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new MicrocontrollerCase(multi, 0), "microcontrollerCase1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 487 */     (new String[1])[0] = "oc:droneCase1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new DroneCase(multi, 0), "droneCase1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 488 */     registerItem(new Drone(multi), "drone");
/* 489 */     (new String[1])[0] = "oc:leashUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeLeash(multi), "leashUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 490 */     (new String[1])[0] = "oc:microcontrollerCase2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new MicrocontrollerCase(multi, 1), "microcontrollerCase2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 491 */     (new String[1])[0] = "oc:droneCase2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new DroneCase(multi, 1), "droneCase2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 492 */     registerItem(new Present(multi), "present");
/*     */ 
/*     */     
/* 495 */     WorldSensorCard worldSensorCard = new WorldSensorCard(multi);
/*     */     
/* 497 */     (new String[1])[0] = "oc:worldSensorCard"; li.cil.oc.integration.Mods$.MODULE$.Galacticraft().isAvailable() ? li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)worldSensorCard, "worldSensorCard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1])) : BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */     
/* 501 */     registerItem(new MicrocontrollerCase(multi, 3), "microcontrollerCaseCreative");
/* 502 */     registerItem(new DroneCase(multi, 3), "droneCaseCreative");
/*     */ 
/*     */     
/* 505 */     (new String[1])[0] = "oc:tabletCase2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new TabletCase(multi, 1), "tabletCase2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 506 */     registerItem(new TabletCase(multi, 3), "tabletCaseCreative");
/*     */ 
/*     */     
/* 509 */     (new String[1])[0] = "oc:inkCartridgeEmpty"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new InkCartridgeEmpty(multi), "inkCartridgeEmpty", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 510 */     (new String[1])[0] = "oc:inkCartridge"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new InkCartridge(multi), "inkCartridge", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 511 */     (new String[1])[0] = "oc:chamelium"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Chamelium(multi), "chamelium", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 512 */     (new String[1])[0] = "oc:texturePicker"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new TexturePicker(multi), "texturePicker", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 515 */     (new String[2])[0] = "oc:manual"; (new String[2])[1] = "craftingBook"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Manual(multi), "manual", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]));
/* 516 */     (new String[1])[0] = "oc:wrench"; li.cil.oc.common.recipe.Recipes$.MODULE$.addItem((Item)new Wrench(), "wrench", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 519 */     (new String[1])[0] = "oc:hoverUpgrade1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeHover(multi, 0), "hoverUpgrade1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 520 */     (new String[1])[0] = "oc:hoverUpgrade2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeHover(multi, 1), "hoverUpgrade2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 523 */     (new String[1])[0] = "oc:apu1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new APU(multi, 0), "apu1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 524 */     (new String[1])[0] = "oc:apu2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new APU(multi, 1), "apu2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 527 */     (new String[1])[0] = "oc:hoverBoots"; li.cil.oc.common.recipe.Recipes$.MODULE$.addItem((Item)new HoverBoots(), "hoverBoots", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 530 */     registerItem(new APU(multi, 2), "apuCreative");
/*     */ 
/*     */     
/* 533 */     (new String[1])[0] = "oc:dataCard1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new DataCard(multi, 0), "dataCard1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 536 */     (new String[1])[0] = "oc:dataCard2"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new DataCard(multi, 1), "dataCard2", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 537 */     (new String[1])[0] = "oc:dataCard3"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new DataCard(multi, 2), "dataCard3", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 540 */     (new String[1])[0] = "oc:nanomachines"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new Nanomachines(multi), "nanomachines", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 543 */     (new String[1])[0] = "oc:terminalServer"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new TerminalServer(multi), "terminalServer", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 544 */     (new String[1])[0] = "oc:diskDriveMountable"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new DiskDriveMountable(multi), "diskDriveMountable", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 545 */     (new String[1])[0] = "oc:tradingUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeTrading(multi), "tradingUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 546 */     registerItem(new DiamondChip(multi), "chipDiamond");
/* 547 */     (new String[1])[0] = "oc:mfu"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeMF(multi), "mfu", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 550 */     (new String[1])[0] = "oc:wlanCard1"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new WirelessNetworkCard(multi, 0), "wlanCard1", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/* 551 */     registerItem(new ComponentBus(multi, 3), "componentBusCreative");
/*     */ 
/*     */ 
/*     */     
/* 555 */     (new String[1])[0] = "oc:configuratorUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeConfigurator(multi), "configuratorUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 557 */     (new String[1])[0] = "oc:rtgUpgrade"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new UpgradeRITEG(multi), "ritegUpgrade", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */     
/* 559 */     (new String[1])[0] = "oc:tpsCard"; li.cil.oc.common.recipe.Recipes$.MODULE$.addSubItem((Delegate)new TpsCard(multi), "tpsCard", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]));
/*     */ 
/*     */     
/* 562 */     aliases().withFilter((Function1)new Items$$anonfun$init$1()).foreach((Function1)new Items$$anonfun$init$2()); } public final class Items$$anon$1 extends Delegator { public ItemStack[] additionalItems() { (new ItemStack[5])[0] = Items$.MODULE$.createConfiguredDrone(); (new ItemStack[5])[1] = Items$.MODULE$.createConfiguredMicrocontroller(); (new ItemStack[5])[2] = Items$.MODULE$.createConfiguredRobot(); (new ItemStack[5])[3] = Items$.MODULE$.createConfiguredTablet(); (new ItemStack[5])[4] = Items$.MODULE$.createChargedHoverBoots(); return (ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])new ItemStack[5]).$plus$plus((GenTraversableOnce)li.cil.oc.common.Loot$.MODULE$.disksForClient(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)))).$plus$plus((GenTraversableOnce)Items$.MODULE$.registeredItems(), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class))); } public final boolean li$cil$oc$common$init$Items$$anon$$add$1(List<Object> list, Object value) { return list.add(value); } public void func_150895_a(Item item, CreativeTabs tab, List list) { super.func_150895_a(item, tab, list); scala.Predef$.MODULE$.refArrayOps((Object[])additionalItems()).foreach((Function1)new Items$$anon$1$$anonfun$getSubItems$1(this, list)); } public final class Items$$anon$1$$anonfun$getSubItems$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List list$1; public final boolean apply(ItemStack x$2) { return this.$outer.li$cil$oc$common$init$Items$$anon$$add$1(this.list$1, x$2); } public Items$$anon$1$$anonfun$getSubItems$1(Items$$anon$1 $outer, List list$1) {} } } public final class Items$$anon$2 extends FloppyDisk { public Items$$anon$2(Delegator multi$1) { super(multi$1); showInItemList_$eq(false); } } public final class Items$$anon$3 extends FloppyDisk { public Items$$anon$3(Delegator multi$1) { super(multi$1); showInItemList_$eq(false); } public ItemStack createItemStack(int amount) { return Items$.MODULE$.get("openos").createItemStack(1); } public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) { return player.func_70093_af() ? Items$.MODULE$.get("floppy").createItemStack(1) : FileSystemLike.class.onItemRightClick((FileSystemLike)this, stack, world, player); } } public final class Items$$anonfun$init$1 extends AbstractFunction1<Tuple2<String, String>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Items$$anonfun$init$2 extends AbstractFunction1<Tuple2<String, String>, ItemInfo> implements Serializable { public static final long serialVersionUID = 0L; public final ItemInfo apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { String k = (String)tuple2._1(), v = (String)tuple2._2(); return 
/* 563 */           (ItemInfo)Items$.MODULE$.descriptors().getOrElseUpdate(k, (Function0)new Items$$anonfun$init$2$$anonfun$apply$1(this, v)); }  throw new MatchError(tuple2); } public final class Items$$anonfun$init$2$$anonfun$apply$1 extends AbstractFunction0<ItemInfo> implements Serializable { public static final long serialVersionUID = 0L; private final String v$1; public final ItemInfo apply() { return (ItemInfo)Items$.MODULE$.descriptors().apply(this.v$1); }
/*     */ 
/*     */       
/*     */       public Items$$anonfun$init$2$$anonfun$apply$1(Items$$anonfun$init$2 $outer, String v$1) {} }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\init\Items$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */