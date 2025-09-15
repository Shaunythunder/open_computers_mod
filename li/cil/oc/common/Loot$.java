/*     */ package li.cil.oc.common;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.util.Properties;
/*     */ import java.util.concurrent.Callable;
/*     */ import li.cil.oc.api.FileSystem;
/*     */ import li.cil.oc.api.fs.FileSystem;
/*     */ import li.cil.oc.common.init.Items$;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.event.world.WorldEvent;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.SeqLike;
/*     */ import scala.collection.immutable.StringOps;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class Loot$ {
/*     */   public static final Loot$ MODULE$;
/*     */   private final String[] containers;
/*     */   private final Map<String, Callable<FileSystem>> factories;
/*     */   private final ArrayBuffer<Tuple2<ItemStack, Object>> globalDisks;
/*     */   private final ArrayBuffer<Tuple2<ItemStack, Object>> worldDisks;
/*     */   private final ArrayBuffer<ItemStack> disksForCyclingServer;
/*     */   private final ArrayBuffer<ItemStack> disksForCyclingClient;
/*     */   private final ArrayBuffer<ItemStack> disksForSampling;
/*     */   private final ArrayBuffer<ItemStack> disksForClient;
/*     */   
/*     */   public String[] containers() {
/*  37 */     return this.containers;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<String, Callable<FileSystem>> factories() {
/*  43 */     return this.factories;
/*     */   } public ArrayBuffer<Tuple2<ItemStack, Object>> globalDisks() {
/*  45 */     return this.globalDisks;
/*     */   } public ArrayBuffer<Tuple2<ItemStack, Object>> worldDisks() {
/*  47 */     return this.worldDisks;
/*     */   } public ArrayBuffer<ItemStack> disksForCycling() {
/*  49 */     return disksForCyclingClient().nonEmpty() ? disksForCyclingClient() : disksForCyclingServer();
/*     */   } public ArrayBuffer<ItemStack> disksForCyclingServer() {
/*  51 */     return this.disksForCyclingServer;
/*     */   } public ArrayBuffer<ItemStack> disksForCyclingClient() {
/*  53 */     return this.disksForCyclingClient;
/*     */   } public ArrayBuffer<ItemStack> disksForSampling() {
/*  55 */     return this.disksForSampling;
/*     */   } public ArrayBuffer<ItemStack> disksForClient() {
/*  57 */     return this.disksForClient;
/*     */   } public boolean isLootDisk(ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: ldc 'floppy'
/*     */     //   6: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   9: astore_2
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 22
/*     */     //   14: pop
/*     */     //   15: aload_2
/*     */     //   16: ifnull -> 29
/*     */     //   19: goto -> 76
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   26: ifeq -> 76
/*     */     //   29: aload_1
/*     */     //   30: invokevirtual func_77942_o : ()Z
/*     */     //   33: ifeq -> 76
/*     */     //   36: aload_1
/*     */     //   37: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   40: new scala/collection/mutable/StringBuilder
/*     */     //   43: dup
/*     */     //   44: invokespecial <init> : ()V
/*     */     //   47: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   50: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   53: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   56: ldc 'lootFactory'
/*     */     //   58: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   61: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   64: bipush #8
/*     */     //   66: invokevirtual func_150297_b : (Ljava/lang/String;I)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_1
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_0
/*     */     //   77: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	78	0	this	Lli/cil/oc/common/Loot$;
/*     */     //   0	78	1	stack	Lnet/minecraft/item/ItemStack;
/*     */   }
/*     */   public ItemStack registerLootDisk(String name, int color, Callable factory, boolean doRecipeCycling) {
/*  62 */     String mod = Loader.instance().activeModContainer().getModId();
/*     */     
/*  64 */     (new String[3])[0] = "Registering loot disk '"; (new String[3])[1] = "' from mod "; (new String[3])[2] = "."; li.cil.oc.OpenComputers$.MODULE$.log().debug((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name, mod })));
/*     */     
/*  66 */     String modSpecificName = (new StringBuilder()).append(mod).append(":").append(name).toString();
/*     */     
/*  68 */     NBTTagCompound data = new NBTTagCompound();
/*  69 */     data.func_74778_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("fs.label").toString(), name);
/*     */     
/*  71 */     NBTTagCompound nbt = new NBTTagCompound();
/*  72 */     nbt.func_74782_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString(), (NBTBase)data);
/*     */ 
/*     */     
/*  75 */     nbt.func_74778_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("lootFactory").toString(), modSpecificName);
/*  76 */     nbt.func_74768_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("color").toString(), scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(color), 0)), 15));
/*     */     
/*  78 */     ItemStack stack = Items$.MODULE$.get("floppy").createItemStack(1);
/*  79 */     stack.func_77982_d(nbt);
/*     */     
/*  81 */     factories().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(modSpecificName), factory));
/*     */     
/*  83 */     doRecipeCycling ? 
/*  84 */       disksForCyclingServer().$plus$eq(stack) : BoxedUnit.UNIT;
/*     */ 
/*     */     
/*  87 */     return stack.func_77946_l();
/*     */   }
/*     */   
/*     */   public void init() {
/*  91 */     scala.Predef$.MODULE$.refArrayOps((Object[])containers()).foreach((Function1)new Loot$$anonfun$init$1());
/*     */ 
/*     */ 
/*     */     
/*  95 */     Properties list = new Properties();
/*  96 */     InputStream listStream = getClass().getResourceAsStream((new StringBuilder()).append("/assets/").append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append("/loot/loot.properties").toString());
/*  97 */     list.load(listStream);
/*  98 */     listStream.close();
/*  99 */     parseLootDisks(list, globalDisks(), false);
/*     */   } public final class Loot$$anonfun$init$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(String container) { ChestGenHooks.addItem(container, new Loot()); } }
/*     */   @SubscribeEvent
/* 103 */   public void initForWorld(WorldEvent.Load e) { if (!e.world.field_72995_K && e.world.field_73011_w.field_76574_g == 0)
/* 104 */     { worldDisks().clear();
/* 105 */       disksForSampling().clear();
/* 106 */       File path = new File(DimensionManager.getCurrentSaveRootDirectory(), (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.savePath()).append("loot/").toString());
/* 107 */       if (path.exists() && path.isDirectory()) {
/* 108 */         File listFile = new File(path, "loot.properties");
/* 109 */         if (listFile.exists() && listFile.isFile()) {
/*     */           try {
/* 111 */             FileInputStream listStream = new FileInputStream(listFile);
/* 112 */             Properties list = new Properties();
/* 113 */             list.load(listStream);
/* 114 */             listStream.close();
/* 115 */             parseLootDisks(list, worldDisks(), true);
/*     */           } finally {
/*     */             Exception exception = null;
/*     */           } 
/*     */         }
/*     */       } 
/*     */       
/* 122 */       globalDisks().withFilter((Function1)new Loot$$anonfun$initForWorld$1()).foreach((Function1)new Loot$$anonfun$initForWorld$2());
/*     */ 
/*     */       
/* 125 */       worldDisks().withFilter((Function1)new Loot$$anonfun$initForWorld$3()).foreach((Function1)new Loot$$anonfun$initForWorld$4()); }  } public final class Loot$$anonfun$initForWorld$1 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 entry) { return !Loot$.MODULE$.worldDisks().contains(entry); } } public final class Loot$$anonfun$initForWorld$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, ArrayBuffer<Tuple2<ItemStack, Object>>> implements Serializable { public static final long serialVersionUID = 0L; public final ArrayBuffer<Tuple2<ItemStack, Object>> apply(Tuple2 entry) { return Loot$.MODULE$.worldDisks().$plus$eq(entry); } } public final class Loot$$anonfun$initForWorld$3 extends AbstractFunction1<Tuple2<ItemStack, Object>, Object> implements Serializable { public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public static final long serialVersionUID = 0L; } public final class Loot$$anonfun$initForWorld$4 extends AbstractFunction1<Tuple2<ItemStack, Object>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); int count = tuple2._2$mcI$sp(); scala.runtime.RichInt$.MODULE$
/* 126 */           .until$extension0(scala.Predef$.MODULE$.intWrapper(0), count).foreach((Function1)new Loot$$anonfun$initForWorld$4$$anonfun$apply$1(this, stack)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }
/* 127 */        throw new MatchError(tuple2); } public final class Loot$$anonfun$initForWorld$4$$anonfun$apply$1 extends AbstractFunction1<Object, ArrayBuffer<ItemStack>> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public Loot$$anonfun$initForWorld$4$$anonfun$apply$1(Loot$$anonfun$initForWorld$4 $outer, ItemStack stack$1) {} public final ArrayBuffer<ItemStack> apply(int i) { return Loot$.MODULE$.disksForSampling().$plus$eq(this.stack$1); }
/*     */        }
/*     */      }
/*     */ 
/*     */   
/*     */   private void parseLootDisks(Properties list, ArrayBuffer acc, boolean external) {
/* 133 */     scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(list.stringPropertyNames()).foreach((Function1)new Loot$$anonfun$parseLootDisks$1(list, acc, external)); } public final class Loot$$anonfun$parseLootDisks$1 extends AbstractFunction1<String, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Properties list$1; private final ArrayBuffer acc$1; private final boolean external$1; public Loot$$anonfun$parseLootDisks$1(Properties list$1, ArrayBuffer acc$1, boolean external$1) {} public final Object apply(String key) {
/* 134 */       String value = this.list$1.getProperty(key); 
/* 135 */       try { ArrayBuffer arrayBuffer; String[] arrayOfString = value.split(":");
/* 136 */         Option option = scala.Array$.MODULE$.unapplySeq(arrayOfString); if (!option.isEmpty() && option.get() != null && ((SeqLike)option.get()).lengthCompare(3) == 0) { String name = (String)((SeqLike)option.get()).apply(0), count = (String)((SeqLike)option.get()).apply(1), color = (String)((SeqLike)option.get()).apply(2);
/* 137 */           arrayBuffer = this.acc$1.$plus$eq(new Tuple2(Loot$.MODULE$.createLootDisk(name, key, this.external$1, (Option<Object>)new Some(BoxesRunTime.boxToInteger(scala.Predef$.MODULE$.refArrayOps((Object[])li.cil.oc.util.Color$.MODULE$.dyes()).indexOf(color)))), BoxesRunTime.boxToInteger((new StringOps(scala.Predef$.MODULE$.augmentString(count))).toInt()))); }
/* 138 */         else { Option option1 = scala.Array$.MODULE$.unapplySeq(arrayOfString); if (!option1.isEmpty() && option1.get() != null && ((SeqLike)option1.get()).lengthCompare(2) == 0) { String name = (String)((SeqLike)option1.get()).apply(0), count = (String)((SeqLike)option1.get()).apply(1);
/* 139 */             arrayBuffer = this.acc$1.$plus$eq(new Tuple2(Loot$.MODULE$.createLootDisk(name, key, this.external$1, Loot$.MODULE$.createLootDisk$default$4()), BoxesRunTime.boxToInteger((new StringOps(scala.Predef$.MODULE$.augmentString(count))).toInt()))); }
/*     */           else
/* 141 */           { arrayBuffer = this.acc$1.$plus$eq(new Tuple2(Loot$.MODULE$.createLootDisk(value, key, this.external$1, Loot$.MODULE$.createLootDisk$default$4()), BoxesRunTime.boxToInteger(1))); }
/*     */            }
/*     */          }
/* 144 */       finally { Exception exception = null; }
/*     */     
/*     */     } }
/*     */ 
/*     */   
/* 149 */   public Option<Object> createLootDisk$default$4() { return (Option<Object>)scala.None$.MODULE$; }
/* 150 */   public ItemStack createLootDisk(String name, String path, boolean external, Option color) { Callable<FileSystem> callable = external ? new Loot$$anon$1(path) : 
/*     */       
/* 152 */       new Loot$$anon$2(path);
/*     */ 
/*     */     
/* 155 */     ItemStack stack = registerLootDisk(path, BoxesRunTime.unboxToInt(color.getOrElse((Function0)new Loot$$anonfun$1())), callable, true);
/* 156 */     stack.func_151001_c(name);
/* 157 */     external ? BoxedUnit.UNIT : 
/* 158 */       Items$.MODULE$.registerStack(stack, path);
/*     */     
/* 160 */     return stack; } public final class Loot$$anon$1 implements Callable<FileSystem> {
/*     */     private final String path$1; public Loot$$anon$1(String path$1) {} public FileSystem call() { return FileSystem.asReadOnly(FileSystem.fromSaveDirectory((new StringBuilder()).append("loot/").append(this.path$1).toString(), 0L, false)); } }
/* 162 */   private Loot$() { MODULE$ = this;
/*     */     (new String[4])[0] = "dungeonChest";
/*     */     (new String[4])[1] = "pyramidDesertyChest";
/*     */     (new String[4])[2] = "pyramidJungleChest";
/*     */     (new String[4])[3] = "strongholdLibrary";
/*     */     this.containers = new String[4];
/*     */     this.factories = scala.collection.mutable.Map$.MODULE$.empty();
/*     */     this.globalDisks = (ArrayBuffer<Tuple2<ItemStack, Object>>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     this.worldDisks = (ArrayBuffer<Tuple2<ItemStack, Object>>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     this.disksForCyclingServer = (ArrayBuffer<ItemStack>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     this.disksForCyclingClient = (ArrayBuffer<ItemStack>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     this.disksForSampling = (ArrayBuffer<ItemStack>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*     */     this.disksForClient = (ArrayBuffer<ItemStack>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty(); }
/*     */ 
/*     */   
/*     */   public final class Loot$$anon$2 implements Callable<FileSystem> {
/*     */     private final String path$1;
/*     */     
/*     */     public Loot$$anon$2(String path$1) {}
/*     */     
/*     */     public FileSystem call() {
/*     */       return FileSystem.fromClass(li.cil.oc.OpenComputers$.MODULE$.getClass(), li.cil.oc.Settings$.MODULE$.resourceDomain(), (new StringBuilder()).append("loot/").append(this.path$1).toString());
/*     */     }
/*     */   }
/*     */   
/*     */   public final class Loot$$anonfun$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final int apply() {
/*     */       return apply$mcI$sp();
/*     */     }
/*     */     
/*     */     public int apply$mcI$sp() {
/*     */       return 8;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\Loot$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */