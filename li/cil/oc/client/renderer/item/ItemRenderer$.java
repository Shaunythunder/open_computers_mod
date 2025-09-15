/*     */ package li.cil.oc.client.renderer.item;
/*     */ 
/*     */ import com.google.common.base.Strings;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.renderer.entity.RenderItem;
/*     */ import net.minecraft.client.renderer.entity.RenderManager;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraftforge.client.IItemRenderer;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class ItemRenderer$ implements IItemRenderer {
/*     */   public static final ItemRenderer$ MODULE$;
/*     */   private final RenderItem renderItem;
/*     */   private ItemInfo drone;
/*     */   private ItemInfo floppy;
/*     */   
/*  30 */   private ItemRenderer$() { MODULE$ = this;
/*  31 */     this.renderItem = new RenderItem();
/*  32 */     renderItem().func_76976_a(RenderManager.field_78727_a); }
/*     */   private ItemInfo lootDisk; private ItemInfo print; private ItemInfo cable; private PrintData.Shape nullShape; private volatile byte bitmap$0; public RenderItem renderItem() { return this.renderItem; } private ItemInfo drone$lzycompute() {
/*  34 */     synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.drone = Items.get("drone"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.drone; }  } public ItemInfo drone() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? drone$lzycompute() : this.drone; }
/*     */   
/*  36 */   private ItemInfo floppy$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.floppy = Items.get("floppy"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.floppy; }  } public ItemInfo floppy() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? floppy$lzycompute() : this.floppy; }
/*  37 */   private ItemInfo lootDisk$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.lootDisk = Items.get("lootDisk"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.lootDisk; }  } public ItemInfo lootDisk() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? lootDisk$lzycompute() : this.lootDisk; }
/*  38 */   private ItemInfo print$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x8) == 0) { this.print = Items.get("print"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x8); }  return this.print; }  } public ItemInfo print() { return ((byte)(this.bitmap$0 & 0x8) == 0) ? print$lzycompute() : this.print; }
/*  39 */   private ItemInfo cable$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x10) == 0) { this.cable = Items.get("cable"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x10); }  return this.cable; }  } public ItemInfo cable() { return ((byte)(this.bitmap$0 & 0x10) == 0) ? cable$lzycompute() : this.cable; }
/*     */   
/*  41 */   private PrintData.Shape nullShape$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x20) == 0) { this.nullShape = new PrintData.Shape(li.cil.oc.util.ExtendedAABB$.MODULE$.unitBounds(), (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":White").toString(), (Option)new Some(BoxesRunTime.boxToInteger(li.cil.oc.util.Color$.MODULE$.Lime()))); this.bitmap$0 = (byte)(this.bitmap$0 | 0x20); }  return this.nullShape; }  } public PrintData.Shape nullShape() { return ((byte)(this.bitmap$0 & 0x20) == 0) ? nullShape$lzycompute() : this.nullShape; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isFloppy(ItemInfo descriptor) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_0
/*     */     //   2: invokevirtual floppy : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   5: astore_2
/*     */     //   6: dup
/*     */     //   7: ifnonnull -> 18
/*     */     //   10: pop
/*     */     //   11: aload_2
/*     */     //   12: ifnull -> 50
/*     */     //   15: goto -> 25
/*     */     //   18: aload_2
/*     */     //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   22: ifne -> 50
/*     */     //   25: aload_1
/*     */     //   26: aload_0
/*     */     //   27: invokevirtual lootDisk : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   30: astore_3
/*     */     //   31: dup
/*     */     //   32: ifnonnull -> 43
/*     */     //   35: pop
/*     */     //   36: aload_3
/*     */     //   37: ifnull -> 50
/*     */     //   40: goto -> 54
/*     */     //   43: aload_3
/*     */     //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   47: ifeq -> 54
/*     */     //   50: iconst_1
/*     */     //   51: goto -> 55
/*     */     //   54: iconst_0
/*     */     //   55: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #43	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	56	0	this	Lli/cil/oc/client/renderer/item/ItemRenderer$;
/*     */     //   0	56	1	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean handleRenderType(ItemStack stack, IItemRenderer.ItemRenderType renderType) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: astore_3
/*     */     //   5: aload_2
/*     */     //   6: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.INVENTORY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   9: astore #4
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 24
/*     */     //   15: pop
/*     */     //   16: aload #4
/*     */     //   18: ifnull -> 32
/*     */     //   21: goto -> 43
/*     */     //   24: aload #4
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 43
/*     */     //   32: aload_0
/*     */     //   33: aload_1
/*     */     //   34: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   37: invokevirtual isFloppy : (Lli/cil/oc/api/detail/ItemInfo;)Z
/*     */     //   40: ifne -> 454
/*     */     //   43: aload_2
/*     */     //   44: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.INVENTORY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   47: astore #5
/*     */     //   49: dup
/*     */     //   50: ifnonnull -> 62
/*     */     //   53: pop
/*     */     //   54: aload #5
/*     */     //   56: ifnull -> 151
/*     */     //   59: goto -> 70
/*     */     //   62: aload #5
/*     */     //   64: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   67: ifne -> 151
/*     */     //   70: aload_2
/*     */     //   71: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.ENTITY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   74: astore #6
/*     */     //   76: dup
/*     */     //   77: ifnonnull -> 89
/*     */     //   80: pop
/*     */     //   81: aload #6
/*     */     //   83: ifnull -> 151
/*     */     //   86: goto -> 97
/*     */     //   89: aload #6
/*     */     //   91: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   94: ifne -> 151
/*     */     //   97: aload_2
/*     */     //   98: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   101: astore #7
/*     */     //   103: dup
/*     */     //   104: ifnonnull -> 116
/*     */     //   107: pop
/*     */     //   108: aload #7
/*     */     //   110: ifnull -> 151
/*     */     //   113: goto -> 124
/*     */     //   116: aload #7
/*     */     //   118: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   121: ifne -> 151
/*     */     //   124: aload_2
/*     */     //   125: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED_FIRST_PERSON : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   128: astore #8
/*     */     //   130: dup
/*     */     //   131: ifnonnull -> 143
/*     */     //   134: pop
/*     */     //   135: aload #8
/*     */     //   137: ifnull -> 151
/*     */     //   140: goto -> 179
/*     */     //   143: aload #8
/*     */     //   145: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   148: ifeq -> 179
/*     */     //   151: aload_3
/*     */     //   152: aload_0
/*     */     //   153: invokevirtual drone : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   156: astore #9
/*     */     //   158: dup
/*     */     //   159: ifnonnull -> 171
/*     */     //   162: pop
/*     */     //   163: aload #9
/*     */     //   165: ifnull -> 454
/*     */     //   168: goto -> 179
/*     */     //   171: aload #9
/*     */     //   173: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   176: ifne -> 454
/*     */     //   179: aload_2
/*     */     //   180: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.INVENTORY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   183: astore #10
/*     */     //   185: dup
/*     */     //   186: ifnonnull -> 198
/*     */     //   189: pop
/*     */     //   190: aload #10
/*     */     //   192: ifnull -> 287
/*     */     //   195: goto -> 206
/*     */     //   198: aload #10
/*     */     //   200: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   203: ifne -> 287
/*     */     //   206: aload_2
/*     */     //   207: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.ENTITY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   210: astore #11
/*     */     //   212: dup
/*     */     //   213: ifnonnull -> 225
/*     */     //   216: pop
/*     */     //   217: aload #11
/*     */     //   219: ifnull -> 287
/*     */     //   222: goto -> 233
/*     */     //   225: aload #11
/*     */     //   227: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   230: ifne -> 287
/*     */     //   233: aload_2
/*     */     //   234: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   237: astore #12
/*     */     //   239: dup
/*     */     //   240: ifnonnull -> 252
/*     */     //   243: pop
/*     */     //   244: aload #12
/*     */     //   246: ifnull -> 287
/*     */     //   249: goto -> 260
/*     */     //   252: aload #12
/*     */     //   254: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   257: ifne -> 287
/*     */     //   260: aload_2
/*     */     //   261: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED_FIRST_PERSON : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   264: astore #13
/*     */     //   266: dup
/*     */     //   267: ifnonnull -> 279
/*     */     //   270: pop
/*     */     //   271: aload #13
/*     */     //   273: ifnull -> 287
/*     */     //   276: goto -> 315
/*     */     //   279: aload #13
/*     */     //   281: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   284: ifeq -> 315
/*     */     //   287: aload_3
/*     */     //   288: aload_0
/*     */     //   289: invokevirtual cable : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   292: astore #14
/*     */     //   294: dup
/*     */     //   295: ifnonnull -> 307
/*     */     //   298: pop
/*     */     //   299: aload #14
/*     */     //   301: ifnull -> 454
/*     */     //   304: goto -> 315
/*     */     //   307: aload #14
/*     */     //   309: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   312: ifne -> 454
/*     */     //   315: aload_2
/*     */     //   316: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.INVENTORY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   319: astore #15
/*     */     //   321: dup
/*     */     //   322: ifnonnull -> 334
/*     */     //   325: pop
/*     */     //   326: aload #15
/*     */     //   328: ifnull -> 423
/*     */     //   331: goto -> 342
/*     */     //   334: aload #15
/*     */     //   336: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   339: ifne -> 423
/*     */     //   342: aload_2
/*     */     //   343: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.ENTITY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   346: astore #16
/*     */     //   348: dup
/*     */     //   349: ifnonnull -> 361
/*     */     //   352: pop
/*     */     //   353: aload #16
/*     */     //   355: ifnull -> 423
/*     */     //   358: goto -> 369
/*     */     //   361: aload #16
/*     */     //   363: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   366: ifne -> 423
/*     */     //   369: aload_2
/*     */     //   370: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   373: astore #17
/*     */     //   375: dup
/*     */     //   376: ifnonnull -> 388
/*     */     //   379: pop
/*     */     //   380: aload #17
/*     */     //   382: ifnull -> 423
/*     */     //   385: goto -> 396
/*     */     //   388: aload #17
/*     */     //   390: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   393: ifne -> 423
/*     */     //   396: aload_2
/*     */     //   397: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED_FIRST_PERSON : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   400: astore #18
/*     */     //   402: dup
/*     */     //   403: ifnonnull -> 415
/*     */     //   406: pop
/*     */     //   407: aload #18
/*     */     //   409: ifnull -> 423
/*     */     //   412: goto -> 458
/*     */     //   415: aload #18
/*     */     //   417: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   420: ifeq -> 458
/*     */     //   423: aload_1
/*     */     //   424: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   427: aload_0
/*     */     //   428: invokevirtual print : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   431: astore #19
/*     */     //   433: dup
/*     */     //   434: ifnonnull -> 446
/*     */     //   437: pop
/*     */     //   438: aload #19
/*     */     //   440: ifnull -> 454
/*     */     //   443: goto -> 458
/*     */     //   446: aload #19
/*     */     //   448: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   451: ifeq -> 458
/*     */     //   454: iconst_1
/*     */     //   455: goto -> 459
/*     */     //   458: iconst_0
/*     */     //   459: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 0
/*     */     //   #47	-> 5
/*     */     //   #48	-> 43
/*     */     //   #49	-> 179
/*     */     //   #50	-> 315
/*     */     //   #49	-> 454
/*     */     //   #45	-> 459
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	460	0	this	Lli/cil/oc/client/renderer/item/ItemRenderer$;
/*     */     //   0	460	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	460	2	renderType	Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   5	455	3	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType renderType, ItemStack stack, IItemRenderer.ItemRendererHelper helper) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.ENTITY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   4: astore #4
/*     */     //   6: dup
/*     */     //   7: ifnonnull -> 19
/*     */     //   10: pop
/*     */     //   11: aload #4
/*     */     //   13: ifnull -> 27
/*     */     //   16: goto -> 31
/*     */     //   19: aload #4
/*     */     //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   24: ifeq -> 31
/*     */     //   27: iconst_1
/*     */     //   28: goto -> 191
/*     */     //   31: aload_1
/*     */     //   32: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.INVENTORY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   35: astore #5
/*     */     //   37: dup
/*     */     //   38: ifnonnull -> 50
/*     */     //   41: pop
/*     */     //   42: aload #5
/*     */     //   44: ifnull -> 58
/*     */     //   47: goto -> 124
/*     */     //   50: aload #5
/*     */     //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   55: ifeq -> 124
/*     */     //   58: aload_2
/*     */     //   59: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   62: aload_0
/*     */     //   63: invokevirtual print : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   66: astore #6
/*     */     //   68: dup
/*     */     //   69: ifnonnull -> 81
/*     */     //   72: pop
/*     */     //   73: aload #6
/*     */     //   75: ifnull -> 89
/*     */     //   78: goto -> 124
/*     */     //   81: aload #6
/*     */     //   83: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 124
/*     */     //   89: aload_3
/*     */     //   90: getstatic net/minecraftforge/client/IItemRenderer$ItemRendererHelper.INVENTORY_BLOCK : Lnet/minecraftforge/client/IItemRenderer$ItemRendererHelper;
/*     */     //   93: astore #7
/*     */     //   95: dup
/*     */     //   96: ifnonnull -> 108
/*     */     //   99: pop
/*     */     //   100: aload #7
/*     */     //   102: ifnull -> 116
/*     */     //   105: goto -> 120
/*     */     //   108: aload #7
/*     */     //   110: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   113: ifeq -> 120
/*     */     //   116: iconst_1
/*     */     //   117: goto -> 191
/*     */     //   120: iconst_0
/*     */     //   121: goto -> 191
/*     */     //   124: aload_2
/*     */     //   125: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   128: aload_0
/*     */     //   129: invokevirtual cable : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   132: astore #8
/*     */     //   134: dup
/*     */     //   135: ifnonnull -> 147
/*     */     //   138: pop
/*     */     //   139: aload #8
/*     */     //   141: ifnull -> 155
/*     */     //   144: goto -> 159
/*     */     //   147: aload #8
/*     */     //   149: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   152: ifeq -> 159
/*     */     //   155: iconst_1
/*     */     //   156: goto -> 191
/*     */     //   159: aload_3
/*     */     //   160: getstatic net/minecraftforge/client/IItemRenderer$ItemRendererHelper.EQUIPPED_BLOCK : Lnet/minecraftforge/client/IItemRenderer$ItemRendererHelper;
/*     */     //   163: astore #9
/*     */     //   165: dup
/*     */     //   166: ifnonnull -> 178
/*     */     //   169: pop
/*     */     //   170: aload #9
/*     */     //   172: ifnull -> 186
/*     */     //   175: goto -> 190
/*     */     //   178: aload #9
/*     */     //   180: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   183: ifeq -> 190
/*     */     //   186: iconst_1
/*     */     //   187: goto -> 191
/*     */     //   190: iconst_0
/*     */     //   191: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #54	-> 0
/*     */     //   #55	-> 31
/*     */     //   #56	-> 124
/*     */     //   #59	-> 159
/*     */     //   #54	-> 191
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	192	0	this	Lli/cil/oc/client/renderer/item/ItemRenderer$;
/*     */     //   0	192	1	renderType	Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   0	192	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	192	3	helper	Lnet/minecraftforge/client/IItemRenderer$ItemRendererHelper;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderItem(IItemRenderer.ItemRenderType renderType, ItemStack stack, Seq data) {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   3: new scala/collection/mutable/StringBuilder
/*     */     //   6: dup
/*     */     //   7: invokespecial <init> : ()V
/*     */     //   10: aload_0
/*     */     //   11: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   14: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   17: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   20: ldc '.renderItem: entering (aka: wasntme)'
/*     */     //   22: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   25: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   28: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   31: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   34: astore #4
/*     */     //   36: aload #4
/*     */     //   38: invokevirtual func_110434_K : ()Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   41: astore #5
/*     */     //   43: aload_2
/*     */     //   44: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   47: astore #6
/*     */     //   49: aload_0
/*     */     //   50: aload #6
/*     */     //   52: invokevirtual isFloppy : (Lli/cil/oc/api/detail/ItemInfo;)Z
/*     */     //   55: ifeq -> 433
/*     */     //   58: ldc 1048575
/*     */     //   60: invokestatic glPushAttrib : (I)V
/*     */     //   63: aload_0
/*     */     //   64: invokevirtual renderItem : ()Lnet/minecraft/client/renderer/entity/RenderItem;
/*     */     //   67: aconst_null
/*     */     //   68: aload #5
/*     */     //   70: aload_2
/*     */     //   71: iconst_0
/*     */     //   72: iconst_0
/*     */     //   73: invokevirtual func_77015_a : (Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/item/ItemStack;II)V
/*     */     //   76: new net/minecraft/client/gui/ScaledResolution
/*     */     //   79: dup
/*     */     //   80: aload #4
/*     */     //   82: aload #4
/*     */     //   84: getfield field_71443_c : I
/*     */     //   87: aload #4
/*     */     //   89: getfield field_71440_d : I
/*     */     //   92: invokespecial <init> : (Lnet/minecraft/client/Minecraft;II)V
/*     */     //   95: astore #7
/*     */     //   97: aload_0
/*     */     //   98: invokevirtual renderItem : ()Lnet/minecraft/client/renderer/entity/RenderItem;
/*     */     //   101: invokevirtual func_76983_a : ()Lnet/minecraft/client/gui/FontRenderer;
/*     */     //   104: astore #8
/*     */     //   106: aload #8
/*     */     //   108: ifnull -> 418
/*     */     //   111: aload #7
/*     */     //   113: invokevirtual func_78325_e : ()I
/*     */     //   116: iconst_1
/*     */     //   117: if_icmple -> 418
/*     */     //   120: invokestatic glPushMatrix : ()V
/*     */     //   123: ldc_w 4.0
/*     */     //   126: fconst_2
/*     */     //   127: aload #7
/*     */     //   129: invokevirtual func_78325_e : ()I
/*     */     //   132: i2f
/*     */     //   133: fdiv
/*     */     //   134: fadd
/*     */     //   135: ldc_w 9.0
/*     */     //   138: fconst_2
/*     */     //   139: aload #7
/*     */     //   141: invokevirtual func_78325_e : ()I
/*     */     //   144: i2f
/*     */     //   145: fdiv
/*     */     //   146: fadd
/*     */     //   147: fconst_0
/*     */     //   148: invokestatic glTranslatef : (FFF)V
/*     */     //   151: fconst_1
/*     */     //   152: aload #7
/*     */     //   154: invokevirtual func_78325_e : ()I
/*     */     //   157: i2f
/*     */     //   158: fdiv
/*     */     //   159: fconst_1
/*     */     //   160: aload #7
/*     */     //   162: invokevirtual func_78325_e : ()I
/*     */     //   165: i2f
/*     */     //   166: fdiv
/*     */     //   167: fconst_1
/*     */     //   168: invokestatic glScalef : (FFF)V
/*     */     //   171: aload #7
/*     */     //   173: invokevirtual func_78325_e : ()I
/*     */     //   176: i2d
/*     */     //   177: ldc2_w 7.5
/*     */     //   180: dmul
/*     */     //   181: d2i
/*     */     //   182: istore #9
/*     */     //   184: aload_2
/*     */     //   185: invokevirtual func_77942_o : ()Z
/*     */     //   188: ifeq -> 352
/*     */     //   191: aload_2
/*     */     //   192: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   195: new scala/collection/mutable/StringBuilder
/*     */     //   198: dup
/*     */     //   199: invokespecial <init> : ()V
/*     */     //   202: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   205: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   208: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   211: ldc_w 'data'
/*     */     //   214: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   217: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   220: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   223: ifeq -> 352
/*     */     //   226: aload_2
/*     */     //   227: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   230: new scala/collection/mutable/StringBuilder
/*     */     //   233: dup
/*     */     //   234: invokespecial <init> : ()V
/*     */     //   237: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   240: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   243: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   246: ldc_w 'data'
/*     */     //   249: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   252: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   255: invokevirtual func_74775_l : (Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   258: new scala/collection/mutable/StringBuilder
/*     */     //   261: dup
/*     */     //   262: invokespecial <init> : ()V
/*     */     //   265: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   268: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   271: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   274: ldc_w 'fs.label'
/*     */     //   277: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   280: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   283: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   286: ifeq -> 352
/*     */     //   289: aload_2
/*     */     //   290: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   293: new scala/collection/mutable/StringBuilder
/*     */     //   296: dup
/*     */     //   297: invokespecial <init> : ()V
/*     */     //   300: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   303: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   306: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   309: ldc_w 'data'
/*     */     //   312: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   315: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   318: invokevirtual func_74775_l : (Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   321: new scala/collection/mutable/StringBuilder
/*     */     //   324: dup
/*     */     //   325: invokespecial <init> : ()V
/*     */     //   328: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   331: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   334: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   337: ldc_w 'fs.label'
/*     */     //   340: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   343: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   346: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   349: goto -> 355
/*     */     //   352: ldc_w 'disk'
/*     */     //   355: astore #10
/*     */     //   357: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   360: aload #8
/*     */     //   362: aload #10
/*     */     //   364: invokestatic func_110646_a : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   367: iload #9
/*     */     //   369: invokevirtual func_78271_c : (Ljava/lang/String;I)Ljava/util/List;
/*     */     //   372: invokevirtual asScalaBuffer : (Ljava/util/List;)Lscala/collection/mutable/Buffer;
/*     */     //   375: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   378: iconst_1
/*     */     //   379: aload #7
/*     */     //   381: invokevirtual func_78325_e : ()I
/*     */     //   384: iconst_2
/*     */     //   385: idiv
/*     */     //   386: invokevirtual max : (II)I
/*     */     //   389: invokeinterface take : (I)Ljava/lang/Object;
/*     */     //   394: checkcast scala/collection/mutable/Buffer
/*     */     //   397: astore #11
/*     */     //   399: aload #11
/*     */     //   401: new li/cil/oc/client/renderer/item/ItemRenderer$$anonfun$renderItem$1
/*     */     //   404: dup
/*     */     //   405: aload #8
/*     */     //   407: invokespecial <init> : (Lnet/minecraft/client/gui/FontRenderer;)V
/*     */     //   410: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   415: invokestatic glPopMatrix : ()V
/*     */     //   418: invokestatic glPopAttrib : ()V
/*     */     //   421: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   424: ldc_w 'ItemRenderer.renderItem: floppy'
/*     */     //   427: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   430: goto -> 1023
/*     */     //   433: aload #6
/*     */     //   435: aload_0
/*     */     //   436: invokevirtual drone : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   439: astore #12
/*     */     //   441: dup
/*     */     //   442: ifnonnull -> 454
/*     */     //   445: pop
/*     */     //   446: aload #12
/*     */     //   448: ifnull -> 462
/*     */     //   451: goto -> 687
/*     */     //   454: aload #12
/*     */     //   456: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   459: ifeq -> 687
/*     */     //   462: ldc 1048575
/*     */     //   464: invokestatic glPushAttrib : (I)V
/*     */     //   467: invokestatic glPushMatrix : ()V
/*     */     //   470: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   473: getfield field_71446_o : Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   476: getstatic li/cil/oc/client/renderer/entity/DroneRenderer$.MODULE$ : Lli/cil/oc/client/renderer/entity/DroneRenderer$;
/*     */     //   479: invokevirtual model : ()Lli/cil/oc/client/renderer/entity/ModelQuadcopter;
/*     */     //   482: invokevirtual texture : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   485: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   488: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   491: invokevirtual makeItBlend : ()V
/*     */     //   494: aload_1
/*     */     //   495: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.INVENTORY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   498: astore #13
/*     */     //   500: dup
/*     */     //   501: ifnonnull -> 513
/*     */     //   504: pop
/*     */     //   505: aload #13
/*     */     //   507: ifnull -> 521
/*     */     //   510: goto -> 564
/*     */     //   513: aload #13
/*     */     //   515: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   518: ifeq -> 564
/*     */     //   521: ldc_w 8.0
/*     */     //   524: ldc_w 9.0
/*     */     //   527: fconst_0
/*     */     //   528: invokestatic glTranslatef : (FFF)V
/*     */     //   531: ldc_w -30.0
/*     */     //   534: fconst_1
/*     */     //   535: fconst_0
/*     */     //   536: fconst_0
/*     */     //   537: invokestatic glRotatef : (FFFF)V
/*     */     //   540: ldc_w 60.0
/*     */     //   543: fconst_0
/*     */     //   544: fconst_1
/*     */     //   545: fconst_0
/*     */     //   546: invokestatic glRotatef : (FFFF)V
/*     */     //   549: ldc_w 13.0
/*     */     //   552: ldc_w -13.0
/*     */     //   555: ldc_w 13.0
/*     */     //   558: invokestatic glScalef : (FFF)V
/*     */     //   561: goto -> 660
/*     */     //   564: aload_1
/*     */     //   565: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   568: astore #14
/*     */     //   570: dup
/*     */     //   571: ifnonnull -> 583
/*     */     //   574: pop
/*     */     //   575: aload #14
/*     */     //   577: ifnull -> 618
/*     */     //   580: goto -> 591
/*     */     //   583: aload #14
/*     */     //   585: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   588: ifne -> 618
/*     */     //   591: aload_1
/*     */     //   592: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.EQUIPPED_FIRST_PERSON : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   595: astore #15
/*     */     //   597: dup
/*     */     //   598: ifnonnull -> 610
/*     */     //   601: pop
/*     */     //   602: aload #15
/*     */     //   604: ifnull -> 618
/*     */     //   607: goto -> 660
/*     */     //   610: aload #15
/*     */     //   612: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   615: ifeq -> 660
/*     */     //   618: ldc_w 0.4
/*     */     //   621: ldc_w 1.05
/*     */     //   624: ldc_w 0.75
/*     */     //   627: invokestatic glTranslatef : (FFF)V
/*     */     //   630: ldc_w -30.0
/*     */     //   633: fconst_0
/*     */     //   634: fconst_1
/*     */     //   635: fconst_0
/*     */     //   636: invokestatic glRotatef : (FFFF)V
/*     */     //   639: ldc_w 80.0
/*     */     //   642: fconst_0
/*     */     //   643: fconst_0
/*     */     //   644: fconst_1
/*     */     //   645: invokestatic glRotatef : (FFFF)V
/*     */     //   648: ldc_w 1.5
/*     */     //   651: ldc_w 1.5
/*     */     //   654: ldc_w 1.5
/*     */     //   657: invokestatic glScalef : (FFF)V
/*     */     //   660: getstatic li/cil/oc/client/renderer/entity/DroneRenderer$.MODULE$ : Lli/cil/oc/client/renderer/entity/DroneRenderer$;
/*     */     //   663: invokevirtual model : ()Lli/cil/oc/client/renderer/entity/ModelQuadcopter;
/*     */     //   666: invokevirtual render : ()V
/*     */     //   669: invokestatic glPopMatrix : ()V
/*     */     //   672: invokestatic glPopAttrib : ()V
/*     */     //   675: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   678: ldc_w 'ItemRenderer.renderItem: drone'
/*     */     //   681: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   684: goto -> 1023
/*     */     //   687: aload #6
/*     */     //   689: aload_0
/*     */     //   690: invokevirtual print : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   693: astore #16
/*     */     //   695: dup
/*     */     //   696: ifnonnull -> 708
/*     */     //   699: pop
/*     */     //   700: aload #16
/*     */     //   702: ifnull -> 716
/*     */     //   705: goto -> 865
/*     */     //   708: aload #16
/*     */     //   710: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   713: ifeq -> 865
/*     */     //   716: ldc 1048575
/*     */     //   718: invokestatic glPushAttrib : (I)V
/*     */     //   721: invokestatic glPushMatrix : ()V
/*     */     //   724: aload_1
/*     */     //   725: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.ENTITY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   728: astore #17
/*     */     //   730: dup
/*     */     //   731: ifnonnull -> 743
/*     */     //   734: pop
/*     */     //   735: aload #17
/*     */     //   737: ifnull -> 751
/*     */     //   740: goto -> 761
/*     */     //   743: aload #17
/*     */     //   745: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   748: ifeq -> 761
/*     */     //   751: ldc_w -0.5
/*     */     //   754: fconst_0
/*     */     //   755: ldc_w -0.5
/*     */     //   758: invokestatic glTranslatef : (FFF)V
/*     */     //   761: new li/cil/oc/common/item/data/PrintData
/*     */     //   764: dup
/*     */     //   765: aload_2
/*     */     //   766: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   769: astore #18
/*     */     //   771: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   774: getfield field_71446_o : Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   777: getstatic net/minecraft/client/renderer/texture/TextureMap.field_110575_b : Lnet/minecraft/util/ResourceLocation;
/*     */     //   780: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   783: aload #18
/*     */     //   785: invokevirtual hasActiveState : ()Z
/*     */     //   788: ifeq -> 808
/*     */     //   791: getstatic li/cil/oc/client/KeyBindings$.MODULE$ : Lli/cil/oc/client/KeyBindings$;
/*     */     //   794: invokevirtual showExtendedTooltips : ()Z
/*     */     //   797: ifeq -> 808
/*     */     //   800: aload #18
/*     */     //   802: invokevirtual stateOn : ()Lscala/collection/mutable/Set;
/*     */     //   805: goto -> 813
/*     */     //   808: aload #18
/*     */     //   810: invokevirtual stateOff : ()Lscala/collection/mutable/Set;
/*     */     //   813: astore #19
/*     */     //   815: aload #19
/*     */     //   817: new li/cil/oc/client/renderer/item/ItemRenderer$$anonfun$renderItem$2
/*     */     //   820: dup
/*     */     //   821: invokespecial <init> : ()V
/*     */     //   824: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   829: aload #19
/*     */     //   831: invokeinterface isEmpty : ()Z
/*     */     //   836: ifeq -> 847
/*     */     //   839: aload_0
/*     */     //   840: aload_0
/*     */     //   841: invokevirtual nullShape : ()Lli/cil/oc/common/item/data/PrintData$Shape;
/*     */     //   844: invokevirtual li$cil$oc$client$renderer$item$ItemRenderer$$drawShape : (Lli/cil/oc/common/item/data/PrintData$Shape;)V
/*     */     //   847: invokestatic glPopMatrix : ()V
/*     */     //   850: invokestatic glPopAttrib : ()V
/*     */     //   853: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   856: ldc_w 'ItemRenderer.renderItem: print'
/*     */     //   859: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   862: goto -> 1023
/*     */     //   865: aload #6
/*     */     //   867: aload_0
/*     */     //   868: invokevirtual cable : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   871: astore #20
/*     */     //   873: dup
/*     */     //   874: ifnonnull -> 886
/*     */     //   877: pop
/*     */     //   878: aload #20
/*     */     //   880: ifnull -> 894
/*     */     //   883: goto -> 1023
/*     */     //   886: aload #20
/*     */     //   888: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   891: ifeq -> 1023
/*     */     //   894: ldc 1048575
/*     */     //   896: invokestatic glPushAttrib : (I)V
/*     */     //   899: invokestatic glPushMatrix : ()V
/*     */     //   902: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   905: getfield field_71446_o : Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   908: getstatic net/minecraft/client/renderer/texture/TextureMap.field_110575_b : Lnet/minecraft/util/ResourceLocation;
/*     */     //   911: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   914: ldc_w 1.5
/*     */     //   917: ldc_w 1.5
/*     */     //   920: ldc_w 1.5
/*     */     //   923: invokestatic glScalef : (FFF)V
/*     */     //   926: aload_1
/*     */     //   927: getstatic net/minecraftforge/client/IItemRenderer$ItemRenderType.ENTITY : Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   930: astore #21
/*     */     //   932: dup
/*     */     //   933: ifnonnull -> 945
/*     */     //   936: pop
/*     */     //   937: aload #21
/*     */     //   939: ifnull -> 953
/*     */     //   942: goto -> 963
/*     */     //   945: aload #21
/*     */     //   947: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   950: ifeq -> 963
/*     */     //   953: ldc_w -0.5
/*     */     //   956: fconst_0
/*     */     //   957: ldc_w -0.5
/*     */     //   960: invokestatic glTranslatef : (FFF)V
/*     */     //   963: getstatic net/minecraft/client/renderer/Tessellator.field_78398_a : Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   966: invokevirtual func_78382_b : ()V
/*     */     //   969: getstatic net/minecraft/client/renderer/Tessellator.field_78398_a : Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   972: aload_2
/*     */     //   973: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   976: aload_2
/*     */     //   977: iconst_0
/*     */     //   978: invokevirtual func_82790_a : (Lnet/minecraft/item/ItemStack;I)I
/*     */     //   981: invokevirtual func_78378_d : (I)V
/*     */     //   984: getstatic li/cil/oc/client/renderer/block/Cable$.MODULE$ : Lli/cil/oc/client/renderer/block/Cable$;
/*     */     //   987: aload_2
/*     */     //   988: aload_3
/*     */     //   989: iconst_0
/*     */     //   990: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   995: checkcast net/minecraft/client/renderer/RenderBlocks
/*     */     //   998: invokevirtual render : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/RenderBlocks;)V
/*     */     //   1001: getstatic net/minecraft/client/renderer/Tessellator.field_78398_a : Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   1004: invokevirtual func_78381_a : ()I
/*     */     //   1007: pop
/*     */     //   1008: invokestatic glPopMatrix : ()V
/*     */     //   1011: invokestatic glPopAttrib : ()V
/*     */     //   1014: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   1017: ldc_w 'ItemRenderer.renderItem: print'
/*     */     //   1020: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   1023: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   1026: ldc_w 'ItemRenderer.renderItem: leaving'
/*     */     //   1029: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   1032: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 0
/*     */     //   #64	-> 31
/*     */     //   #65	-> 36
/*     */     //   #66	-> 43
/*     */     //   #68	-> 49
/*     */     //   #69	-> 58
/*     */     //   #70	-> 63
/*     */     //   #71	-> 76
/*     */     //   #72	-> 97
/*     */     //   #73	-> 106
/*     */     //   #74	-> 120
/*     */     //   #75	-> 123
/*     */     //   #76	-> 151
/*     */     //   #77	-> 171
/*     */     //   #79	-> 184
/*     */     //   #80	-> 289
/*     */     //   #82	-> 352
/*     */     //   #78	-> 355
/*     */     //   #83	-> 357
/*     */     //   #84	-> 399
/*     */     //   #88	-> 415
/*     */     //   #90	-> 418
/*     */     //   #92	-> 421
/*     */     //   #95	-> 433
/*     */     //   #96	-> 462
/*     */     //   #97	-> 467
/*     */     //   #99	-> 470
/*     */     //   #100	-> 488
/*     */     //   #102	-> 494
/*     */     //   #103	-> 521
/*     */     //   #104	-> 531
/*     */     //   #105	-> 540
/*     */     //   #106	-> 549
/*     */     //   #108	-> 564
/*     */     //   #109	-> 618
/*     */     //   #110	-> 630
/*     */     //   #111	-> 639
/*     */     //   #112	-> 648
/*     */     //   #115	-> 660
/*     */     //   #117	-> 669
/*     */     //   #118	-> 672
/*     */     //   #120	-> 675
/*     */     //   #123	-> 687
/*     */     //   #124	-> 716
/*     */     //   #125	-> 721
/*     */     //   #127	-> 724
/*     */     //   #128	-> 751
/*     */     //   #131	-> 761
/*     */     //   #132	-> 771
/*     */     //   #134	-> 783
/*     */     //   #135	-> 800
/*     */     //   #137	-> 808
/*     */     //   #133	-> 813
/*     */     //   #138	-> 815
/*     */     //   #141	-> 829
/*     */     //   #142	-> 839
/*     */     //   #145	-> 847
/*     */     //   #146	-> 850
/*     */     //   #148	-> 853
/*     */     //   #151	-> 865
/*     */     //   #152	-> 894
/*     */     //   #153	-> 899
/*     */     //   #155	-> 902
/*     */     //   #157	-> 914
/*     */     //   #158	-> 926
/*     */     //   #159	-> 953
/*     */     //   #162	-> 963
/*     */     //   #163	-> 969
/*     */     //   #164	-> 984
/*     */     //   #165	-> 1001
/*     */     //   #167	-> 1008
/*     */     //   #168	-> 1011
/*     */     //   #170	-> 1014
/*     */     //   #173	-> 1023
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1033	0	this	Lli/cil/oc/client/renderer/item/ItemRenderer$;
/*     */     //   0	1033	1	renderType	Lnet/minecraftforge/client/IItemRenderer$ItemRenderType;
/*     */     //   0	1033	2	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	1033	3	data	Lscala/collection/Seq;
/*     */     //   36	996	4	mc	Lnet/minecraft/client/Minecraft;
/*     */     //   43	989	5	tm	Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   49	983	6	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   97	333	7	res	Lnet/minecraft/client/gui/ScaledResolution;
/*     */     //   106	324	8	fontRenderer	Lnet/minecraft/client/gui/FontRenderer;
/*     */     //   184	234	9	maxLength	I
/*     */     //   357	61	10	label	Ljava/lang/String;
/*     */     //   399	19	11	lines	Lscala/collection/mutable/Buffer;
/*     */     //   771	91	18	data	Lli/cil/oc/common/item/data/PrintData;
/*     */     //   815	47	19	state	Lscala/collection/mutable/Set;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ItemRenderer$$anonfun$renderItem$1
/*     */     extends AbstractFunction1<Object, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final FontRenderer fontRenderer$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public ItemRenderer$$anonfun$renderItem$1(FontRenderer fontRenderer$1) {}
/*     */ 
/*     */     
/*     */     public final void apply(Object line) {
/*  85 */       this.fontRenderer$1.func_78276_b((String)line, 0, 0, 0);
/*  86 */       GL11.glTranslatef(0.0F, this.fontRenderer$1.field_78288_b, 0.0F);
/*     */     }
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
/*     */   public final class ItemRenderer$$anonfun$renderItem$2
/*     */     extends AbstractFunction1<PrintData.Shape, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
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
/*     */     public final void apply(PrintData.Shape shape) {
/* 139 */       ItemRenderer$.MODULE$.li$cil$oc$client$renderer$item$ItemRenderer$$drawShape(shape);
/*     */     }
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
/*     */   public void li$cil$oc$client$renderer$item$ItemRenderer$$drawShape(PrintData.Shape shape) {
/* 177 */     AxisAlignedBB bounds = shape.bounds();
/* 178 */     IIcon texture = li.cil.oc.client.renderer.block.Print$.MODULE$.resolveTexture(shape.texture());
/*     */     
/* 180 */     if (Strings.isNullOrEmpty(shape.texture())) {
/* 181 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 182 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.25F);
/*     */     } 
/*     */     
/* 185 */     shape.tint().foreach((Function1)new ItemRenderer$$anonfun$li$cil$oc$client$renderer$item$ItemRenderer$$drawShape$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 192 */     GL11.glBegin(7);
/* 193 */     GL11.glDisable(2884);
/*     */ 
/*     */ 
/*     */     
/* 197 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 198 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72334_f);
/* 199 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 200 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72338_b, bounds.field_72334_f);
/* 201 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 202 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72337_e, bounds.field_72334_f);
/* 203 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 204 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72337_e, bounds.field_72334_f);
/*     */ 
/*     */ 
/*     */     
/* 208 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 209 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72338_b, bounds.field_72339_c);
/* 210 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 211 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72339_c);
/* 212 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 213 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72337_e, bounds.field_72339_c);
/* 214 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 215 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72337_e, bounds.field_72339_c);
/*     */ 
/*     */ 
/*     */     
/* 219 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(bounds.field_72334_f * 16));
/* 220 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72337_e, bounds.field_72334_f);
/* 221 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(bounds.field_72339_c * 16));
/* 222 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72337_e, bounds.field_72339_c);
/* 223 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(bounds.field_72339_c * 16));
/* 224 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72337_e, bounds.field_72339_c);
/* 225 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(bounds.field_72334_f * 16));
/* 226 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72337_e, bounds.field_72334_f);
/*     */ 
/*     */ 
/*     */     
/* 230 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(bounds.field_72334_f * 16));
/* 231 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72334_f);
/* 232 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72340_a * 16), texture.func_94207_b(bounds.field_72339_c * 16));
/* 233 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72339_c);
/* 234 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(bounds.field_72339_c * 16));
/* 235 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72338_b, bounds.field_72339_c);
/* 236 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72336_d * 16), texture.func_94207_b(bounds.field_72334_f * 16));
/* 237 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72338_b, bounds.field_72334_f);
/*     */ 
/*     */ 
/*     */     
/* 241 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72334_f * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 242 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72337_e, bounds.field_72334_f);
/* 243 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72334_f * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 244 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72338_b, bounds.field_72334_f);
/* 245 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72339_c * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 246 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72338_b, bounds.field_72339_c);
/* 247 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72339_c * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 248 */     GL11.glVertex3d(bounds.field_72336_d, bounds.field_72337_e, bounds.field_72339_c);
/*     */ 
/*     */ 
/*     */     
/* 252 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72334_f * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 253 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72334_f);
/* 254 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72334_f * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 255 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72337_e, bounds.field_72334_f);
/* 256 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72339_c * 16), texture.func_94207_b(16 - bounds.field_72337_e * 16));
/* 257 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72337_e, bounds.field_72339_c);
/* 258 */     GL11.glTexCoord2f(texture.func_94214_a(bounds.field_72339_c * 16), texture.func_94207_b(16 - bounds.field_72338_b * 16));
/* 259 */     GL11.glVertex3d(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72339_c);
/*     */     
/* 261 */     GL11.glEnd();
/* 262 */     GL11.glEnable(2884);
/*     */     
/* 264 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public final class ItemRenderer$$anonfun$li$cil$oc$client$renderer$item$ItemRenderer$$drawShape$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(int color) {
/*     */       apply$mcVI$sp(color);
/*     */     }
/*     */     
/*     */     public void apply$mcVI$sp(int color) {
/*     */       byte r = (byte)(color >> 16);
/*     */       byte g = (byte)(color >> 8);
/*     */       byte b = (byte)color;
/*     */       GL11.glColor3ub(r, g, b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\item\ItemRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */