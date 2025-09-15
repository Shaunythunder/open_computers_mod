/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import java.util.Random;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class Present$ {
/*     */   public static final Present$ MODULE$;
/*     */   private ItemStack[] Presents;
/*     */   private final Random rng;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*     */   private ItemStack[] Presents() {
/*     */     return this.bitmap$0 ? this.Presents : Presents$lzycompute();
/*     */   }
/*     */   
/*     */   private final void add$1(String name, int weight, ArrayBuffer result$1) {
/*     */     ItemInfo item = Items.get(name);
/*     */     if (item == null) {
/*     */       (new String[2])[0] = "Oops, trying to add '";
/*     */       (new String[2])[1] = "' as a present even though it doesn't exist!";
/*     */       li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { name })));
/*     */     } else {
/*     */       ItemStack stack = item.createItemStack(1);
/*     */       if (scala.Predef$.MODULE$.refArrayOps((Object[])li.cil.oc.util.ItemUtils$.MODULE$.getIngredients(stack)).nonEmpty())
/*     */         scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), weight).foreach((Function1)new Present$$anonfun$add$1$1(result$1, stack)); 
/*     */     } 
/*     */   }
/*     */   
/*  33 */   private ItemStack[] Presents$lzycompute() { synchronized (this) { if (!this.bitmap$0) {
/*  34 */         ArrayBuffer result = (ArrayBuffer)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
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
/*  50 */         add$1("arrowKeys", 520, result);
/*  51 */         add$1("buttonGroup", 460, result);
/*  52 */         add$1("numPad", 410, result);
/*  53 */         add$1("disk", 370, result);
/*  54 */         add$1("transistor", 350, result);
/*  55 */         add$1("floppy", 340, result);
/*  56 */         add$1("printedCircuitBoard", 320, result);
/*  57 */         add$1("chip1", 290, result);
/*  58 */         add$1("eeprom", 250, result);
/*  59 */         add$1("interweb", 220, result);
/*  60 */         add$1("card", 190, result);
/*  61 */         add$1("analyzer", 170, result);
/*  62 */         add$1("signUpgrade", 150, result);
/*  63 */         add$1("inventoryUpgrade", 130, result);
/*  64 */         add$1("craftingUpgrade", 110, result);
/*  65 */         add$1("tankUpgrade", 90, result);
/*  66 */         add$1("pistonUpgrade", 80, result);
/*  67 */         add$1("leashUpgrade", 70, result);
/*  68 */         add$1("angelUpgrade", 55, result);
/*  69 */         add$1("redstoneCard1", 50, result);
/*  70 */         add$1("ram1", 48, result);
/*  71 */         add$1("cu", 46, result);
/*  72 */         add$1("alu", 45, result);
/*  73 */         add$1("batteryUpgrade1", 43, result);
/*  74 */         add$1("lanCard", 38, result);
/*  75 */         add$1("wlanCard1", 37, result);
/*  76 */         add$1("hdd1", 36, result);
/*  77 */         add$1("generatorUpgrade", 35, result);
/*  78 */         add$1("cpu1", 31, result);
/*  79 */         add$1("microcontrollerCase1", 30, result);
/*  80 */         add$1("droneCase1", 25, result);
/*  81 */         add$1("upgradeContainer1", 23, result);
/*  82 */         add$1("cardContainer1", 23, result);
/*  83 */         add$1("graphicsCard1", 19, result);
/*  84 */         add$1("redstoneCard2", 17, result);
/*  85 */         add$1("ram2", 15, result);
/*  86 */         add$1("databaseUpgrade1", 15, result);
/*  87 */         add$1("chip2", 15, result);
/*  88 */         add$1("componentBus1", 13, result);
/*  89 */         add$1("batteryUpgrade2", 12, result);
/*  90 */         add$1("wlanCard2", 11, result);
/*  91 */         add$1("ram3", 10, result);
/*  92 */         add$1("server1", 10, result);
/*  93 */         add$1("internetCard", 9, result);
/*  94 */         add$1("terminal", 9, result);
/*  95 */         add$1("solarGeneratorUpgrade", 9, result);
/*  96 */         add$1("hdd2", 7, result);
/*  97 */         add$1("navigationUpgrade", 7, result);
/*  98 */         add$1("inventoryControllerUpgrade", 7, result);
/*  99 */         add$1("tankControllerUpgrade", 7, result);
/* 100 */         add$1("cpu2", 6, result);
/* 101 */         add$1("microcontrollerCase2", 6, result);
/* 102 */         add$1("componentBus2", 6, result);
/* 103 */         add$1("tabletCase1", 5, result);
/* 104 */         add$1("upgradeContainer2", 5, result);
/* 105 */         add$1("cardContainer2", 5, result);
/* 106 */         add$1("graphicsCard2", 4, result);
/* 107 */         add$1("ram4", 4, result);
/* 108 */         add$1("droneCase2", 4, result);
/* 109 */         add$1("databaseUpgrade2", 4, result);
/* 110 */         add$1("server2", 4, result);
/* 111 */         add$1("chip3", 3, result);
/* 112 */         add$1("componentBus3", 3, result);
/* 113 */         add$1("tractorBeamUpgrade", 3, result);
/* 114 */         add$1("batteryUpgrade3", 3, result);
/* 115 */         add$1("experienceUpgrade", 2, result);
/* 116 */         add$1("ram5", 2, result);
/* 117 */         add$1("upgradeContainer3", 2, result);
/* 118 */         add$1("cardContainer3", 2, result);
/* 119 */         add$1("tabletCase2", 1, result);
/* 120 */         add$1("hdd3", 1, result);
/* 121 */         add$1("chunkloaderUpgrade", 1, result);
/* 122 */         add$1("cpu3", 1, result);
/* 123 */         add$1("graphicsCard3", 1, result);
/* 124 */         add$1("server3", 1, result);
/* 125 */         add$1("databaseUpgrade3", 1, result);
/* 126 */         add$1("ram6", 1, result);
/*     */         
/* 128 */         this.Presents = (ItemStack[])result.toArray(scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)); this.bitmap$0 = true;
/*     */       } 
/*     */       return this.Presents; }
/* 131 */      } private Random rng() { return this.rng; }
/*     */   public final class Present$$anonfun$add$1$1 extends AbstractFunction1<Object, ArrayBuffer<ItemStack>> implements Serializable {
/* 133 */     public static final long serialVersionUID = 0L; private final ArrayBuffer result$1; private final ItemStack stack$1; public final ArrayBuffer<ItemStack> apply(int i) { return this.result$1.$plus$eq(this.stack$1); } public Present$$anonfun$add$1$1(ArrayBuffer result$1, ItemStack stack$1) {} } public ItemStack nextPresent() { return Presents()[rng().nextInt((Presents()).length)].func_77946_l(); } private Present$() {
/* 134 */     MODULE$ = this;
/*     */     this.rng = new Random();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Present$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */