/*     */ package li.cil.oc.common.recipe;
/*     */ 
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class ExtendedRecipe$ {
/*     */   public static final ExtendedRecipe$ MODULE$;
/*     */   private ItemInfo drone;
/*     */   private ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$eeprom;
/*     */   private ItemInfo luaBios;
/*     */   private ItemInfo mcu;
/*     */   private ItemInfo navigationUpgrade;
/*     */   private ItemInfo linkedCard;
/*     */   private ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$floppy;
/*     */   private ItemInfo[] hdds;
/*     */   private ItemInfo[] cpus;
/*     */   private ItemInfo robot;
/*     */   private ItemInfo tablet;
/*     */   private ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$print;
/*     */   private ItemStack disabled;
/*     */   private volatile int bitmap$0;
/*     */   
/*  29 */   private ItemInfo drone$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x1) == 0) { this.drone = Items.get("drone"); this.bitmap$0 |= 0x1; }  return this.drone; }  } private ItemInfo drone() { return ((this.bitmap$0 & 0x1) == 0) ? drone$lzycompute() : this.drone; }
/*  30 */   private ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$eeprom$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom = Items.get("eeprom"); this.bitmap$0 |= 0x2; }  return this.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom; }  } public ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$eeprom() { return ((this.bitmap$0 & 0x2) == 0) ? li$cil$oc$common$recipe$ExtendedRecipe$$eeprom$lzycompute() : this.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom; }
/*  31 */   private ItemInfo luaBios$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x4) == 0) { this.luaBios = Items.get("luaBios"); this.bitmap$0 |= 0x4; }  return this.luaBios; }  } private ItemInfo luaBios() { return ((this.bitmap$0 & 0x4) == 0) ? luaBios$lzycompute() : this.luaBios; }
/*  32 */   private ItemInfo mcu$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x8) == 0) { this.mcu = Items.get("microcontroller"); this.bitmap$0 |= 0x8; }  return this.mcu; }  } private ItemInfo mcu() { return ((this.bitmap$0 & 0x8) == 0) ? mcu$lzycompute() : this.mcu; }
/*  33 */   private ItemInfo navigationUpgrade$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x10) == 0) { this.navigationUpgrade = Items.get("navigationUpgrade"); this.bitmap$0 |= 0x10; }  return this.navigationUpgrade; }  } private ItemInfo navigationUpgrade() { return ((this.bitmap$0 & 0x10) == 0) ? navigationUpgrade$lzycompute() : this.navigationUpgrade; }
/*  34 */   private ItemInfo linkedCard$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x20) == 0) { this.linkedCard = Items.get("linkedCard"); this.bitmap$0 |= 0x20; }  return this.linkedCard; }  } private ItemInfo linkedCard() { return ((this.bitmap$0 & 0x20) == 0) ? linkedCard$lzycompute() : this.linkedCard; }
/*  35 */   private ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$floppy$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x40) == 0) { this.li$cil$oc$common$recipe$ExtendedRecipe$$floppy = Items.get("floppy"); this.bitmap$0 |= 0x40; }  return this.li$cil$oc$common$recipe$ExtendedRecipe$$floppy; }  } public ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$floppy() { return ((this.bitmap$0 & 0x40) == 0) ? li$cil$oc$common$recipe$ExtendedRecipe$$floppy$lzycompute() : this.li$cil$oc$common$recipe$ExtendedRecipe$$floppy; }
/*  36 */   private ItemInfo[] hdds$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x80) == 0) { (new ItemInfo[3])[0] = 
/*  37 */           Items.get("hdd1");
/*  38 */         (new ItemInfo[3])[1] = Items.get("hdd2");
/*  39 */         (new ItemInfo[3])[2] = Items.get("hdd3"); this.hdds = new ItemInfo[3]; this.bitmap$0 |= 0x80; }  return this.hdds; }
/*     */      } private ItemInfo[] hdds() { return ((this.bitmap$0 & 0x80) == 0) ? hdds$lzycompute() : this.hdds; }
/*  41 */   private ItemInfo[] cpus$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x100) == 0) { (new ItemInfo[5])[0] = 
/*  42 */           Items.get("cpu1");
/*  43 */         (new ItemInfo[5])[1] = Items.get("cpu2");
/*  44 */         (new ItemInfo[5])[2] = Items.get("cpu3");
/*  45 */         (new ItemInfo[5])[3] = Items.get("apu1");
/*  46 */         (new ItemInfo[5])[4] = Items.get("apu2"); this.cpus = new ItemInfo[5]; this.bitmap$0 |= 0x100; }  return this.cpus; }
/*     */      } private ItemInfo[] cpus() { return ((this.bitmap$0 & 0x100) == 0) ? cpus$lzycompute() : this.cpus; }
/*  48 */   private ItemInfo robot$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x200) == 0) { this.robot = Items.get("robot"); this.bitmap$0 |= 0x200; }  return this.robot; }  } private ItemInfo robot() { return ((this.bitmap$0 & 0x200) == 0) ? robot$lzycompute() : this.robot; }
/*  49 */   private ItemInfo tablet$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x400) == 0) { this.tablet = Items.get("tablet"); this.bitmap$0 |= 0x400; }  return this.tablet; }  } private ItemInfo tablet() { return ((this.bitmap$0 & 0x400) == 0) ? tablet$lzycompute() : this.tablet; }
/*  50 */   private ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$print$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x800) == 0) { this.li$cil$oc$common$recipe$ExtendedRecipe$$print = Items.get("print"); this.bitmap$0 |= 0x800; }  return this.li$cil$oc$common$recipe$ExtendedRecipe$$print; }  } public ItemInfo li$cil$oc$common$recipe$ExtendedRecipe$$print() { return ((this.bitmap$0 & 0x800) == 0) ? li$cil$oc$common$recipe$ExtendedRecipe$$print$lzycompute() : this.li$cil$oc$common$recipe$ExtendedRecipe$$print; } private ItemStack disabled() { return ((this.bitmap$0 & 0x1000) == 0) ? disabled$lzycompute() : this.disabled; } public final class ExtendedRecipe$$anonfun$disabled$1 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable {
/*  51 */     public static final long serialVersionUID = 0L; public final NBTTagCompound apply(NBTTagCompound x$1) { (new NBTBase[1])[0] = (NBTBase)li.cil.oc.util.ExtendedNBT$.MODULE$.toNbt("Autocrafting of this item is disabled to avoid exploits."); return li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagCompound(x$1).setNewTagList("Lore", (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new NBTBase[1])); } } private ItemStack disabled$lzycompute() { synchronized (this) { if ((this.bitmap$0 & 0x1000) == 0) {
/*  52 */         ItemStack stack = new ItemStack(Blocks.field_150346_d);
/*  53 */         NBTTagCompound tag = new NBTTagCompound();
/*  54 */         li.cil.oc.util.ExtendedNBT$.MODULE$.extendNBTTagCompound(tag).setNewCompoundTag("display", (Function1)new ExtendedRecipe$$anonfun$disabled$1());
/*  55 */         stack.func_77982_d(tag);
/*  56 */         this.disabled = stack;
/*     */         this.bitmap$0 |= 0x1000;
/*     */       } 
/*     */       return this.disabled; }
/*     */      }
/*     */    public ItemStack addNBTToResult(IRecipe recipe, ItemStack craftedStack, InventoryCrafting inventory) {
/*     */     // Byte code:
/*     */     //   0: new java/lang/Object
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore #4
/*     */     //   9: aload_2
/*     */     //   10: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   13: astore #6
/*     */     //   15: aload #6
/*     */     //   17: aload_0
/*     */     //   18: invokespecial navigationUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   21: astore #7
/*     */     //   23: dup
/*     */     //   24: ifnonnull -> 36
/*     */     //   27: pop
/*     */     //   28: aload #7
/*     */     //   30: ifnull -> 44
/*     */     //   33: goto -> 66
/*     */     //   36: aload #7
/*     */     //   38: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   41: ifeq -> 66
/*     */     //   44: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   47: aload_2
/*     */     //   48: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/driver/Item;
/*     */     //   51: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   54: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2
/*     */     //   57: dup
/*     */     //   58: aload_2
/*     */     //   59: aload_3
/*     */     //   60: invokespecial <init> : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/InventoryCrafting;)V
/*     */     //   63: invokevirtual foreach : (Lscala/Function1;)V
/*     */     //   66: aload #6
/*     */     //   68: aload_0
/*     */     //   69: invokespecial linkedCard : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   72: astore #8
/*     */     //   74: dup
/*     */     //   75: ifnonnull -> 87
/*     */     //   78: pop
/*     */     //   79: aload #8
/*     */     //   81: ifnull -> 95
/*     */     //   84: goto -> 137
/*     */     //   87: aload #8
/*     */     //   89: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 137
/*     */     //   95: aload_0
/*     */     //   96: invokespecial weAreBeingCalledFromAppliedEnergistics2 : ()Z
/*     */     //   99: ifeq -> 110
/*     */     //   102: aload_0
/*     */     //   103: invokespecial disabled : ()Lnet/minecraft/item/ItemStack;
/*     */     //   106: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   109: areturn
/*     */     //   110: invokestatic isServer : ()Z
/*     */     //   113: ifeq -> 137
/*     */     //   116: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   119: aload_2
/*     */     //   120: invokestatic driverFor : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/driver/Item;
/*     */     //   123: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   126: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$3
/*     */     //   129: dup
/*     */     //   130: aload_2
/*     */     //   131: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   134: invokevirtual foreach : (Lscala/Function1;)V
/*     */     //   137: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   140: aload_0
/*     */     //   141: invokespecial cpus : ()[Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   144: checkcast [Ljava/lang/Object;
/*     */     //   147: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   150: aload #6
/*     */     //   152: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   157: ifeq -> 170
/*     */     //   160: getstatic li/cil/oc/server/machine/luac/LuaStateFactory$.MODULE$ : Lli/cil/oc/server/machine/luac/LuaStateFactory$;
/*     */     //   163: aload_2
/*     */     //   164: invokevirtual setDefaultArch : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
/*     */     //   167: goto -> 173
/*     */     //   170: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   173: pop
/*     */     //   174: aload #6
/*     */     //   176: aload_0
/*     */     //   177: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$floppy : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   180: astore #9
/*     */     //   182: dup
/*     */     //   183: ifnonnull -> 195
/*     */     //   186: pop
/*     */     //   187: aload #9
/*     */     //   189: ifnull -> 226
/*     */     //   192: goto -> 203
/*     */     //   195: aload #9
/*     */     //   197: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   200: ifne -> 226
/*     */     //   203: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   206: aload_0
/*     */     //   207: invokespecial hdds : ()[Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   210: checkcast [Ljava/lang/Object;
/*     */     //   213: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   216: aload #6
/*     */     //   218: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   223: ifeq -> 363
/*     */     //   226: aload_2
/*     */     //   227: invokevirtual func_77942_o : ()Z
/*     */     //   230: ifne -> 244
/*     */     //   233: aload_2
/*     */     //   234: new net/minecraft/nbt/NBTTagCompound
/*     */     //   237: dup
/*     */     //   238: invokespecial <init> : ()V
/*     */     //   241: invokevirtual func_77982_d : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   244: aload_2
/*     */     //   245: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   248: astore #10
/*     */     //   250: aload_1
/*     */     //   251: invokeinterface func_77570_a : ()I
/*     */     //   256: iconst_1
/*     */     //   257: if_icmpne -> 324
/*     */     //   260: new scala/collection/mutable/StringBuilder
/*     */     //   263: dup
/*     */     //   264: invokespecial <init> : ()V
/*     */     //   267: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   270: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   273: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   276: ldc_w 'color'
/*     */     //   279: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   282: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   285: astore #11
/*     */     //   287: aload_0
/*     */     //   288: aload_3
/*     */     //   289: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$getItems : (Lnet/minecraft/inventory/InventoryCrafting;)Lscala/collection/immutable/IndexedSeq;
/*     */     //   292: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$4
/*     */     //   295: dup
/*     */     //   296: aload #10
/*     */     //   298: aload #11
/*     */     //   300: invokespecial <init> : (Lnet/minecraft/nbt/NBTTagCompound;Ljava/lang/String;)V
/*     */     //   303: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   308: aload #10
/*     */     //   310: invokevirtual func_82582_d : ()Z
/*     */     //   313: ifeq -> 363
/*     */     //   316: aload_2
/*     */     //   317: aconst_null
/*     */     //   318: invokevirtual func_77982_d : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   321: goto -> 363
/*     */     //   324: aload_0
/*     */     //   325: aload_3
/*     */     //   326: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$getItems : (Lnet/minecraft/inventory/InventoryCrafting;)Lscala/collection/immutable/IndexedSeq;
/*     */     //   329: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$5
/*     */     //   332: dup
/*     */     //   333: invokespecial <init> : ()V
/*     */     //   336: invokeinterface forall : (Lscala/Function1;)Z
/*     */     //   341: ifeq -> 363
/*     */     //   344: aload_0
/*     */     //   345: aload_3
/*     */     //   346: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$getItems : (Lnet/minecraft/inventory/InventoryCrafting;)Lscala/collection/immutable/IndexedSeq;
/*     */     //   349: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$6
/*     */     //   352: dup
/*     */     //   353: aload #10
/*     */     //   355: invokespecial <init> : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   358: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   363: aload #6
/*     */     //   365: aload_0
/*     */     //   366: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$print : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   369: astore #12
/*     */     //   371: dup
/*     */     //   372: ifnonnull -> 384
/*     */     //   375: pop
/*     */     //   376: aload #12
/*     */     //   378: ifnull -> 392
/*     */     //   381: goto -> 574
/*     */     //   384: aload #12
/*     */     //   386: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   389: ifeq -> 574
/*     */     //   392: aload_1
/*     */     //   393: instanceof li/cil/oc/common/recipe/ExtendedShapelessOreRecipe
/*     */     //   396: ifeq -> 574
/*     */     //   399: aload_1
/*     */     //   400: checkcast li/cil/oc/common/recipe/ExtendedShapelessOreRecipe
/*     */     //   403: invokevirtual getInput : ()Ljava/util/ArrayList;
/*     */     //   406: ifnull -> 574
/*     */     //   409: aload_1
/*     */     //   410: checkcast li/cil/oc/common/recipe/ExtendedShapelessOreRecipe
/*     */     //   413: invokevirtual getInput : ()Ljava/util/ArrayList;
/*     */     //   416: invokevirtual size : ()I
/*     */     //   419: iconst_2
/*     */     //   420: if_icmpne -> 574
/*     */     //   423: new li/cil/oc/common/item/data/PrintData
/*     */     //   426: dup
/*     */     //   427: aload_2
/*     */     //   428: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   431: astore #13
/*     */     //   433: aload_0
/*     */     //   434: aload_3
/*     */     //   435: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$getItems : (Lnet/minecraft/inventory/InventoryCrafting;)Lscala/collection/immutable/IndexedSeq;
/*     */     //   438: astore #14
/*     */     //   440: aload #14
/*     */     //   442: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$7
/*     */     //   445: dup
/*     */     //   446: aload #13
/*     */     //   448: invokespecial <init> : (Lli/cil/oc/common/item/data/PrintData;)V
/*     */     //   451: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   456: iconst_4
/*     */     //   457: anewarray net/minecraft/item/ItemStack
/*     */     //   460: dup
/*     */     //   461: iconst_0
/*     */     //   462: new net/minecraft/item/ItemStack
/*     */     //   465: dup
/*     */     //   466: getstatic net/minecraft/init/Blocks.field_150339_S : Lnet/minecraft/block/Block;
/*     */     //   469: invokespecial <init> : (Lnet/minecraft/block/Block;)V
/*     */     //   472: aastore
/*     */     //   473: dup
/*     */     //   474: iconst_1
/*     */     //   475: new net/minecraft/item/ItemStack
/*     */     //   478: dup
/*     */     //   479: getstatic net/minecraft/init/Blocks.field_150340_R : Lnet/minecraft/block/Block;
/*     */     //   482: invokespecial <init> : (Lnet/minecraft/block/Block;)V
/*     */     //   485: aastore
/*     */     //   486: dup
/*     */     //   487: iconst_2
/*     */     //   488: new net/minecraft/item/ItemStack
/*     */     //   491: dup
/*     */     //   492: getstatic net/minecraft/init/Blocks.field_150475_bE : Lnet/minecraft/block/Block;
/*     */     //   495: invokespecial <init> : (Lnet/minecraft/block/Block;)V
/*     */     //   498: aastore
/*     */     //   499: dup
/*     */     //   500: iconst_3
/*     */     //   501: new net/minecraft/item/ItemStack
/*     */     //   504: dup
/*     */     //   505: getstatic net/minecraft/init/Blocks.field_150484_ah : Lnet/minecraft/block/Block;
/*     */     //   508: invokespecial <init> : (Lnet/minecraft/block/Block;)V
/*     */     //   511: aastore
/*     */     //   512: checkcast [Ljava/lang/Object;
/*     */     //   515: checkcast [Lnet/minecraft/item/ItemStack;
/*     */     //   518: astore #15
/*     */     //   520: new net/minecraft/item/ItemStack
/*     */     //   523: dup
/*     */     //   524: getstatic net/minecraft/init/Items.field_151114_aO : Lnet/minecraft/item/Item;
/*     */     //   527: invokespecial <init> : (Lnet/minecraft/item/Item;)V
/*     */     //   530: astore #16
/*     */     //   532: new net/minecraft/item/ItemStack
/*     */     //   535: dup
/*     */     //   536: getstatic net/minecraft/init/Blocks.field_150426_aN : Lnet/minecraft/block/Block;
/*     */     //   539: invokespecial <init> : (Lnet/minecraft/block/Block;)V
/*     */     //   542: astore #17
/*     */     //   544: aload #14
/*     */     //   546: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$8
/*     */     //   549: dup
/*     */     //   550: aload #13
/*     */     //   552: aload #15
/*     */     //   554: aload #16
/*     */     //   556: aload #17
/*     */     //   558: aload #4
/*     */     //   560: invokespecial <init> : (Lli/cil/oc/common/item/data/PrintData;[Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Ljava/lang/Object;)V
/*     */     //   563: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   568: aload #13
/*     */     //   570: aload_2
/*     */     //   571: invokevirtual save : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   574: aload #6
/*     */     //   576: aload_0
/*     */     //   577: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$eeprom : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   580: astore #18
/*     */     //   582: dup
/*     */     //   583: ifnonnull -> 595
/*     */     //   586: pop
/*     */     //   587: aload #18
/*     */     //   589: ifnull -> 603
/*     */     //   592: goto -> 657
/*     */     //   595: aload #18
/*     */     //   597: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   600: ifeq -> 657
/*     */     //   603: aload_2
/*     */     //   604: getfield field_77994_a : I
/*     */     //   607: iconst_2
/*     */     //   608: if_icmpne -> 657
/*     */     //   611: aload_1
/*     */     //   612: instanceof li/cil/oc/common/recipe/ExtendedShapelessOreRecipe
/*     */     //   615: ifeq -> 657
/*     */     //   618: aload_1
/*     */     //   619: checkcast li/cil/oc/common/recipe/ExtendedShapelessOreRecipe
/*     */     //   622: invokevirtual getInput : ()Ljava/util/ArrayList;
/*     */     //   625: ifnull -> 657
/*     */     //   628: aload_1
/*     */     //   629: checkcast li/cil/oc/common/recipe/ExtendedShapelessOreRecipe
/*     */     //   632: invokevirtual getInput : ()Ljava/util/ArrayList;
/*     */     //   635: invokevirtual size : ()I
/*     */     //   638: iconst_2
/*     */     //   639: if_icmpne -> 657
/*     */     //   642: getstatic scala/util/control/Breaks$.MODULE$ : Lscala/util/control/Breaks$;
/*     */     //   645: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$1
/*     */     //   648: dup
/*     */     //   649: aload_2
/*     */     //   650: aload_3
/*     */     //   651: invokespecial <init> : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/InventoryCrafting;)V
/*     */     //   654: invokevirtual breakable : (Lscala/Function0;)V
/*     */     //   657: aload_0
/*     */     //   658: aload_2
/*     */     //   659: aload_3
/*     */     //   660: aload_0
/*     */     //   661: invokespecial mcu : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   664: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$9
/*     */     //   667: dup
/*     */     //   668: invokespecial <init> : ()V
/*     */     //   671: invokespecial recraft : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/InventoryCrafting;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)V
/*     */     //   674: aload_0
/*     */     //   675: aload_2
/*     */     //   676: aload_3
/*     */     //   677: aload_0
/*     */     //   678: invokespecial drone : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   681: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$10
/*     */     //   684: dup
/*     */     //   685: invokespecial <init> : ()V
/*     */     //   688: invokespecial recraft : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/InventoryCrafting;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)V
/*     */     //   691: aload_0
/*     */     //   692: aload_2
/*     */     //   693: aload_3
/*     */     //   694: aload_0
/*     */     //   695: invokespecial robot : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   698: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$11
/*     */     //   701: dup
/*     */     //   702: invokespecial <init> : ()V
/*     */     //   705: invokespecial recraft : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/InventoryCrafting;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)V
/*     */     //   708: aload_0
/*     */     //   709: aload_2
/*     */     //   710: aload_3
/*     */     //   711: aload_0
/*     */     //   712: invokespecial tablet : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   715: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$12
/*     */     //   718: dup
/*     */     //   719: invokespecial <init> : ()V
/*     */     //   722: invokespecial recraft : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/inventory/InventoryCrafting;Lli/cil/oc/api/detail/ItemInfo;Lscala/Function1;)V
/*     */     //   725: aload_2
/*     */     //   726: goto -> 749
/*     */     //   729: astore #5
/*     */     //   731: aload #5
/*     */     //   733: invokevirtual key : ()Ljava/lang/Object;
/*     */     //   736: aload #4
/*     */     //   738: if_acmpne -> 750
/*     */     //   741: aload #5
/*     */     //   743: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   746: checkcast net/minecraft/item/ItemStack
/*     */     //   749: areturn
/*     */     //   750: aload #5
/*     */     //   752: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 0
/*     */     //   #60	-> 9
/*     */     //   #62	-> 15
/*     */     //   #63	-> 44
/*     */     //   #73	-> 66
/*     */     //   #74	-> 95
/*     */     //   #75	-> 110
/*     */     //   #76	-> 116
/*     */     //   #83	-> 137
/*     */     //   #84	-> 160
/*     */     //   #83	-> 170
/*     */     //   #87	-> 174
/*     */     //   #88	-> 226
/*     */     //   #89	-> 233
/*     */     //   #91	-> 244
/*     */     //   #92	-> 250
/*     */     //   #94	-> 260
/*     */     //   #95	-> 287
/*     */     //   #103	-> 308
/*     */     //   #104	-> 316
/*     */     //   #107	-> 324
/*     */     //   #109	-> 344
/*     */     //   #120	-> 363
/*     */     //   #121	-> 392
/*     */     //   #122	-> 399
/*     */     //   #123	-> 409
/*     */     //   #125	-> 423
/*     */     //   #126	-> 433
/*     */     //   #127	-> 440
/*     */     //   #134	-> 456
/*     */     //   #135	-> 462
/*     */     //   #134	-> 473
/*     */     //   #136	-> 475
/*     */     //   #134	-> 486
/*     */     //   #137	-> 488
/*     */     //   #134	-> 499
/*     */     //   #138	-> 501
/*     */     //   #134	-> 518
/*     */     //   #141	-> 520
/*     */     //   #142	-> 532
/*     */     //   #143	-> 544
/*     */     //   #168	-> 568
/*     */     //   #172	-> 574
/*     */     //   #173	-> 603
/*     */     //   #174	-> 611
/*     */     //   #175	-> 618
/*     */     //   #176	-> 628
/*     */     //   #177	-> 645
/*     */     //   #176	-> 654
/*     */     //   #189	-> 657
/*     */     //   #190	-> 674
/*     */     //   #191	-> 691
/*     */     //   #192	-> 708
/*     */     //   #194	-> 725
/*     */     //   #59	-> 729
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	753	0	this	Lli/cil/oc/common/recipe/ExtendedRecipe$;
/*     */     //   0	753	1	recipe	Lnet/minecraft/item/crafting/IRecipe;
/*     */     //   0	753	2	craftedStack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	753	3	inventory	Lnet/minecraft/inventory/InventoryCrafting;
/*     */     //   15	711	6	craftedItemName	Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   250	503	10	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   287	466	11	colorKey	Ljava/lang/String;
/*     */     //   433	141	13	data	Lli/cil/oc/common/item/data/PrintData;
/*     */     //   440	134	14	inputs	Lscala/collection/immutable/IndexedSeq;
/*     */     //   520	54	15	beaconBlocks	[Lnet/minecraft/item/ItemStack;
/*     */     //   532	42	16	glowstoneDust	Lnet/minecraft/item/ItemStack;
/*     */     //   544	30	17	glowstone	Lnet/minecraft/item/ItemStack;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	729	729	scala/runtime/NonLocalReturnControl
/*     */   } public final class ExtendedRecipe$$anonfun$addNBTToResult$2 extends AbstractFunction1<Item, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final ItemStack craftedStack$1; private final InventoryCrafting inventory$1; public ExtendedRecipe$$anonfun$addNBTToResult$2(ItemStack craftedStack$1, InventoryCrafting inventory$1) {} public final void apply(Item driver) {
/*  64 */       ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$getItems(this.inventory$1).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1(this, driver));
/*     */     } public final class ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Item driver$1; public ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1(ExtendedRecipe$$anonfun$addNBTToResult$2 $outer, Item driver$1) {} public final Object apply(ItemStack stack) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */         //   4: getstatic net/minecraft/init/Items.field_151098_aY : Lnet/minecraft/item/ItemMap;
/*     */         //   7: astore_2
/*     */         //   8: dup
/*     */         //   9: ifnonnull -> 20
/*     */         //   12: pop
/*     */         //   13: aload_2
/*     */         //   14: ifnull -> 27
/*     */         //   17: goto -> 90
/*     */         //   20: aload_2
/*     */         //   21: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   24: ifeq -> 90
/*     */         //   27: aload_0
/*     */         //   28: getfield driver$1 : Lli/cil/oc/api/driver/Item;
/*     */         //   31: aload_0
/*     */         //   32: getfield $outer : Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2;
/*     */         //   35: getfield craftedStack$1 : Lnet/minecraft/item/ItemStack;
/*     */         //   38: invokeinterface dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */         //   43: astore_3
/*     */         //   44: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*     */         //   47: aload_3
/*     */         //   48: invokevirtual extendNBTTagCompound : (Lnet/minecraft/nbt/NBTTagCompound;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagCompound;
/*     */         //   51: new scala/collection/mutable/StringBuilder
/*     */         //   54: dup
/*     */         //   55: invokespecial <init> : ()V
/*     */         //   58: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */         //   61: invokevirtual namespace : ()Ljava/lang/String;
/*     */         //   64: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   67: ldc 'map'
/*     */         //   69: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */         //   72: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   75: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1$$anonfun$apply$2
/*     */         //   78: dup
/*     */         //   79: aload_0
/*     */         //   80: aload_1
/*     */         //   81: invokespecial <init> : (Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1;Lnet/minecraft/item/ItemStack;)V
/*     */         //   84: invokevirtual setNewCompoundTag : (Ljava/lang/String;Lscala/Function1;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */         //   87: goto -> 93
/*     */         //   90: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */         //   93: areturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #65	-> 0
/*     */         //   #67	-> 27
/*     */         //   #68	-> 44
/*     */         //   #65	-> 90
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	94	0	this	Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1;
/*     */         //   0	94	1	stack	Lnet/minecraft/item/ItemStack;
/*     */         //   44	43	3	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */       } public final class ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1$$anonfun$apply$2 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final NBTTagCompound apply(NBTTagCompound x$1) {
/*  68 */           return this.stack$1.func_77955_b(x$1);
/*     */         }
/*     */         public ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1$$anonfun$apply$2(ExtendedRecipe$$anonfun$addNBTToResult$2$$anonfun$apply$1 $outer, ItemStack stack$1) {} } } }
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$3 extends AbstractFunction1<Item, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     private final ItemStack craftedStack$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$3(ItemStack craftedStack$1) {}
/*     */     
/*     */     public final void apply(Item driver) {
/*  77 */       NBTTagCompound nbt = driver.dataTag(this.craftedStack$1);
/*  78 */       nbt.func_74778_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("tunnel").toString(), UUID.randomUUID().toString());
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$4
/*     */     extends AbstractFunction1<ItemStack, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final NBTTagCompound nbt$1;
/*     */     
/*     */     private final String colorKey$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$4(NBTTagCompound nbt$1, String colorKey$1) {}
/*     */     
/*     */     public final void apply(ItemStack stack) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   4: ifnull -> 150
/*     */       //   7: aload_1
/*     */       //   8: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   11: getstatic li/cil/oc/common/recipe/ExtendedRecipe$.MODULE$ : Lli/cil/oc/common/recipe/ExtendedRecipe$;
/*     */       //   14: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$floppy : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   17: astore_2
/*     */       //   18: dup
/*     */       //   19: ifnonnull -> 30
/*     */       //   22: pop
/*     */       //   23: aload_2
/*     */       //   24: ifnull -> 68
/*     */       //   27: goto -> 37
/*     */       //   30: aload_2
/*     */       //   31: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   34: ifne -> 68
/*     */       //   37: aload_1
/*     */       //   38: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */       //   41: invokeinterface name : ()Ljava/lang/String;
/*     */       //   46: ldc 'lootDisk'
/*     */       //   48: astore_3
/*     */       //   49: dup
/*     */       //   50: ifnonnull -> 61
/*     */       //   53: pop
/*     */       //   54: aload_3
/*     */       //   55: ifnull -> 68
/*     */       //   58: goto -> 150
/*     */       //   61: aload_3
/*     */       //   62: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   65: ifeq -> 150
/*     */       //   68: aload_1
/*     */       //   69: invokevirtual func_77942_o : ()Z
/*     */       //   72: ifeq -> 150
/*     */       //   75: aload_1
/*     */       //   76: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   79: astore #4
/*     */       //   81: aload #4
/*     */       //   83: aload_0
/*     */       //   84: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   87: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */       //   90: ifeq -> 150
/*     */       //   93: aload #4
/*     */       //   95: aload_0
/*     */       //   96: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   99: invokevirtual func_74762_e : (Ljava/lang/String;)I
/*     */       //   102: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   105: getstatic li/cil/oc/util/Color$.MODULE$ : Lli/cil/oc/util/Color$;
/*     */       //   108: invokevirtual dyes : ()[Ljava/lang/String;
/*     */       //   111: checkcast [Ljava/lang/Object;
/*     */       //   114: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */       //   117: ldc 'lightGray'
/*     */       //   119: invokeinterface indexOf : (Ljava/lang/Object;)I
/*     */       //   124: if_icmpeq -> 150
/*     */       //   127: aload_0
/*     */       //   128: getfield nbt$1 : Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   131: aload_0
/*     */       //   132: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   135: aload #4
/*     */       //   137: aload_0
/*     */       //   138: getfield colorKey$1 : Ljava/lang/String;
/*     */       //   141: invokevirtual func_74781_a : (Ljava/lang/String;)Lnet/minecraft/nbt/NBTBase;
/*     */       //   144: invokevirtual func_74737_b : ()Lnet/minecraft/nbt/NBTBase;
/*     */       //   147: invokevirtual func_74782_a : (Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V
/*     */       //   150: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #96	-> 0
/*     */       //   #97	-> 75
/*     */       //   #98	-> 81
/*     */       //   #99	-> 127
/*     */       //   #96	-> 150
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	151	0	this	Lli/cil/oc/common/recipe/ExtendedRecipe$$anonfun$addNBTToResult$4;
/*     */       //   0	151	1	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   81	70	4	oldData	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$5
/*     */     extends AbstractFunction1<ItemStack, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(ItemStack x$2) {
/* 107 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$floppy(); if (Items.get(x$2) == null) { Items.get(x$2); if (itemInfo != null); } else if (Items.get(x$2).equals(itemInfo))
/*     */       {  }
/*     */     
/* 110 */     } } public final class ExtendedRecipe$$anonfun$addNBTToResult$6 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound nbt$1; public ExtendedRecipe$$anonfun$addNBTToResult$6(NBTTagCompound nbt$1) {} public final void apply(ItemStack stack) { ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$floppy(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo)) { if (stack.func_77942_o())
/* 111 */           { NBTTagCompound oldData = stack.func_77978_p();
/* 112 */             ((IterableLike)scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(oldData.func_150296_c()).map((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3(this), scala.collection.mutable.Set$.MODULE$.canBuildFrom())).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4(this, oldData)); }  return; }  return; }  if (stack.func_77942_o()) { NBTTagCompound nBTTagCompound = stack.func_77978_p(); ((IterableLike)scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet(nBTTagCompound.func_150296_c()).map((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3(this), scala.collection.mutable.Set$.MODULE$.canBuildFrom())).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4(this, nBTTagCompound)); }  } public final class ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3 extends AbstractFunction1<Object, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(Object x$3) { return (String)x$3; } public ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$3(ExtendedRecipe$$anonfun$addNBTToResult$6 $outer) {} } public final class ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound oldData$1; public ExtendedRecipe$$anonfun$addNBTToResult$6$$anonfun$apply$4(ExtendedRecipe$$anonfun$addNBTToResult$6 $outer, NBTTagCompound oldData$1) {} public final void apply(String oldTagName) {
/* 113 */         this.$outer.nbt$1.func_74782_a(oldTagName, this.oldData$1.func_74781_a(oldTagName).func_74737_b());
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$7
/*     */     extends AbstractFunction1<ItemStack, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final PrintData data$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$7(PrintData data$1) {}
/*     */     
/*     */     public final void apply(ItemStack stack) {
/* 128 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$print(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo))
/* 129 */         { this.data$1.load(stack); return; }  return; }  this.data$1.load(stack);
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$8 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final PrintData data$1;
/*     */     private final ItemStack[] beaconBlocks$1;
/*     */     private final ItemStack glowstoneDust$1;
/*     */     private final ItemStack glowstone$1;
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     
/*     */     public ExtendedRecipe$$anonfun$addNBTToResult$8(PrintData data$1, ItemStack[] beaconBlocks$1, ItemStack glowstoneDust$1, ItemStack glowstone$1, Object nonLocalReturnKey1$1) {}
/*     */     
/*     */     public final void apply(ItemStack stack) {
/* 144 */       if (scala.Predef$.MODULE$.refArrayOps((Object[])this.beaconBlocks$1).exists((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$8$$anonfun$apply$5(this, stack))) {
/* 145 */         if (this.data$1.isBeaconBase())
/*     */         {
/* 147 */           throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, null);
/*     */         }
/* 149 */         this.data$1.isBeaconBase_$eq(true);
/*     */       } 
/* 151 */       if (this.glowstoneDust$1.func_77969_a(stack)) {
/* 152 */         if (this.data$1.lightLevel() == 15)
/*     */         {
/* 154 */           throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, null);
/*     */         }
/* 156 */         this.data$1.lightLevel_$eq(scala.math.package$.MODULE$.min(15, this.data$1.lightLevel() + 1));
/*     */       } 
/* 158 */       if (this.glowstone$1.func_77969_a(stack)) {
/* 159 */         if (this.data$1.lightLevel() == 15)
/*     */         {
/* 161 */           throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, null);
/*     */         }
/* 163 */         this.data$1.lightLevel_$eq(scala.math.package$.MODULE$.min(15, this.data$1.lightLevel() + 4));
/*     */       } 
/*     */     }
/*     */     public final class ExtendedRecipe$$anonfun$addNBTToResult$8$$anonfun$apply$5 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$2;
/*     */       public final boolean apply(ItemStack x$4) {
/*     */         return x$4.func_77969_a(this.stack$2);
/*     */       }
/*     */       public ExtendedRecipe$$anonfun$addNBTToResult$8$$anonfun$apply$5(ExtendedRecipe$$anonfun$addNBTToResult$8 $outer, ItemStack stack$2) {} }
/*     */   }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final ItemStack craftedStack$1;
/*     */     private final InventoryCrafting inventory$1;
/*     */     
/* 177 */     public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$getItems(this.inventory$1).foreach((Function1)new ExtendedRecipe$$anonfun$addNBTToResult$1$$anonfun$apply$mcV$sp$1(this)); } public ExtendedRecipe$$anonfun$addNBTToResult$1(ItemStack craftedStack$1, InventoryCrafting inventory$1) {} public final class ExtendedRecipe$$anonfun$addNBTToResult$1$$anonfun$apply$mcV$sp$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public ExtendedRecipe$$anonfun$addNBTToResult$1$$anonfun$apply$mcV$sp$1(ExtendedRecipe$$anonfun$addNBTToResult$1 $outer) {} public final void apply(ItemStack stack) {
/* 178 */         ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo)) { if (stack.func_77942_o())
/* 179 */             { NBTTagCompound copy = (NBTTagCompound)stack.func_77978_p().func_74737_b();
/*     */               
/* 181 */               copy.func_74775_l((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString()).func_74775_l("node").func_82580_o("address");
/* 182 */               this.$outer.craftedStack$1.func_77982_d(copy);
/* 183 */               throw scala.util.control.Breaks$.MODULE$.break(); }  return; }  return; }  if (stack.func_77942_o()) { NBTTagCompound nBTTagCompound = (NBTTagCompound)stack.func_77978_p().func_74737_b(); nBTTagCompound.func_74775_l((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.namespace()).append("data").toString()).func_74775_l("node").func_82580_o("address"); this.$outer.craftedStack$1.func_77982_d(nBTTagCompound); throw scala.util.control.Breaks$.MODULE$.break(); }
/*     */       
/*     */       } } }
/*     */   
/*     */   public final class ExtendedRecipe$$anonfun$addNBTToResult$9 extends AbstractFunction1<ItemStack, ExtendedRecipe.MCUDataWrapper> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/* 189 */     public final ExtendedRecipe.MCUDataWrapper apply(ItemStack stack) { return new ExtendedRecipe.MCUDataWrapper(stack); } } public final class ExtendedRecipe$$anonfun$addNBTToResult$10 extends AbstractFunction1<ItemStack, ExtendedRecipe.DroneDataWrapper> implements Serializable { public static final long serialVersionUID = 0L;
/* 190 */     public final ExtendedRecipe.DroneDataWrapper apply(ItemStack stack) { return new ExtendedRecipe.DroneDataWrapper(stack); } } public final class ExtendedRecipe$$anonfun$addNBTToResult$11 extends AbstractFunction1<ItemStack, ExtendedRecipe.RobotDataWrapper> implements Serializable { public static final long serialVersionUID = 0L;
/* 191 */     public final ExtendedRecipe.RobotDataWrapper apply(ItemStack stack) { return new ExtendedRecipe.RobotDataWrapper(stack); } } public final class ExtendedRecipe$$anonfun$addNBTToResult$12 extends AbstractFunction1<ItemStack, ExtendedRecipe.TabletDataWrapper> implements Serializable { public static final long serialVersionUID = 0L; public final ExtendedRecipe.TabletDataWrapper apply(ItemStack stack) {
/* 192 */       return new ExtendedRecipe.TabletDataWrapper(stack);
/*     */     } }
/*     */ 
/*     */   
/*     */   public IndexedSeq<ItemStack> li$cil$oc$common$recipe$ExtendedRecipe$$getItems(InventoryCrafting inventory) {
/* 197 */     return (IndexedSeq<ItemStack>)((TraversableLike)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), inventory.func_70302_i_()).map((Function1)new ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$1(inventory), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).filter((Function1)new ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$2()); } public final class ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$1 extends AbstractFunction1<Object, ItemStack> implements Serializable { public static final long serialVersionUID = 0L; private final InventoryCrafting inventory$2; public final ItemStack apply(int x$1) { return this.inventory$2.func_70301_a(x$1); } public ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$1(InventoryCrafting inventory$2) {} } public final class ExtendedRecipe$$anonfun$li$cil$oc$common$recipe$ExtendedRecipe$$getItems$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$5) { return !(x$5 == null); }
/*     */      } private void recraft(ItemStack craftedStack, InventoryCrafting inventory, ItemInfo descriptor, Function1 dataFactory) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: aload_3
/*     */     //   5: astore #5
/*     */     //   7: dup
/*     */     //   8: ifnonnull -> 20
/*     */     //   11: pop
/*     */     //   12: aload #5
/*     */     //   14: ifnull -> 28
/*     */     //   17: goto -> 202
/*     */     //   20: aload #5
/*     */     //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   25: ifeq -> 202
/*     */     //   28: aload_0
/*     */     //   29: aload_2
/*     */     //   30: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$getItems : (Lnet/minecraft/inventory/InventoryCrafting;)Lscala/collection/immutable/IndexedSeq;
/*     */     //   33: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$2
/*     */     //   36: dup
/*     */     //   37: aload_3
/*     */     //   38: invokespecial <init> : (Lli/cil/oc/api/detail/ItemInfo;)V
/*     */     //   41: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */     //   46: astore #6
/*     */     //   48: aload #6
/*     */     //   50: instanceof scala/Some
/*     */     //   53: ifeq -> 197
/*     */     //   56: aload #6
/*     */     //   58: checkcast scala/Some
/*     */     //   61: astore #7
/*     */     //   63: aload #7
/*     */     //   65: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   68: checkcast net/minecraft/item/ItemStack
/*     */     //   71: astore #8
/*     */     //   73: aload #4
/*     */     //   75: aload #8
/*     */     //   77: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   82: checkcast li/cil/oc/common/recipe/ExtendedRecipe$ItemDataWrapper
/*     */     //   85: astore #10
/*     */     //   87: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   90: aload #10
/*     */     //   92: invokeinterface components : ()[Lnet/minecraft/item/ItemStack;
/*     */     //   97: checkcast [Ljava/lang/Object;
/*     */     //   100: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   103: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$3
/*     */     //   106: dup
/*     */     //   107: invokespecial <init> : ()V
/*     */     //   110: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   115: checkcast [Lnet/minecraft/item/ItemStack;
/*     */     //   118: astore #11
/*     */     //   120: aload #10
/*     */     //   122: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   125: aload #10
/*     */     //   127: invokeinterface components : ()[Lnet/minecraft/item/ItemStack;
/*     */     //   132: checkcast [Ljava/lang/Object;
/*     */     //   135: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   138: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   141: aload #11
/*     */     //   143: checkcast [Ljava/lang/Object;
/*     */     //   146: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   149: invokeinterface diff : (Lscala/collection/GenSeq;)Ljava/lang/Object;
/*     */     //   154: checkcast [Lnet/minecraft/item/ItemStack;
/*     */     //   157: invokeinterface components_$eq : ([Lnet/minecraft/item/ItemStack;)V
/*     */     //   162: aload_0
/*     */     //   163: aload_2
/*     */     //   164: invokevirtual li$cil$oc$common$recipe$ExtendedRecipe$$getItems : (Lnet/minecraft/inventory/InventoryCrafting;)Lscala/collection/immutable/IndexedSeq;
/*     */     //   167: new li/cil/oc/common/recipe/ExtendedRecipe$$anonfun$recraft$1
/*     */     //   170: dup
/*     */     //   171: aload #10
/*     */     //   173: invokespecial <init> : (Lli/cil/oc/common/recipe/ExtendedRecipe$ItemDataWrapper;)V
/*     */     //   176: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   181: aload #10
/*     */     //   183: aload_1
/*     */     //   184: invokeinterface save : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   189: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   192: astore #9
/*     */     //   194: goto -> 202
/*     */     //   197: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   200: astore #9
/*     */     //   202: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #200	-> 0
/*     */     //   #202	-> 28
/*     */     //   #203	-> 48
/*     */     //   #204	-> 73
/*     */     //   #207	-> 87
/*     */     //   #208	-> 120
/*     */     //   #211	-> 162
/*     */     //   #217	-> 181
/*     */     //   #203	-> 192
/*     */     //   #218	-> 197
/*     */     //   #200	-> 202
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	203	0	this	Lli/cil/oc/common/recipe/ExtendedRecipe$;
/*     */     //   0	203	1	craftedStack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	203	2	inventory	Lnet/minecraft/inventory/InventoryCrafting;
/*     */     //   0	203	3	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   0	203	4	dataFactory	Lscala/Function1;
/*     */     //   73	130	8	oldMcu	Lnet/minecraft/item/ItemStack;
/*     */     //   87	105	10	data	Lli/cil/oc/common/recipe/ExtendedRecipe$ItemDataWrapper;
/*     */     //   120	72	11	oldRom	[Lnet/minecraft/item/ItemStack;
/*     */   } public final class ExtendedRecipe$$anonfun$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final ItemInfo descriptor$1;
/*     */     public final boolean apply(ItemStack x$6) {
/* 202 */       ItemInfo itemInfo = this.descriptor$1; if (Items.get(x$6) == null) { Items.get(x$6); if (itemInfo != null); } else if (Items.get(x$6).equals(itemInfo))
/*     */       {  }
/*     */     
/*     */     } public ExtendedRecipe$$anonfun$2(ItemInfo descriptor$1) {} } public final class ExtendedRecipe$$anonfun$3 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(ItemStack x$7) {
/* 207 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom(); if (Items.get(x$7) == null) { Items.get(x$7); if (itemInfo != null); } else if (Items.get(x$7).equals(itemInfo))
/*     */       {  }
/*     */     
/*     */     } } public final class ExtendedRecipe$$anonfun$recraft$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ExtendedRecipe.ItemDataWrapper data$2; public ExtendedRecipe$$anonfun$recraft$1(ExtendedRecipe.ItemDataWrapper data$2) {}
/*     */     public final void apply(ItemStack stack) {
/* 212 */       ItemInfo itemInfo = ExtendedRecipe$.MODULE$.li$cil$oc$common$recipe$ExtendedRecipe$$eeprom(); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null) return;  } else { if (Items.get(stack).equals(itemInfo))
/* 213 */         { this.data$2.components_$eq((ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])this.data$2.components()).$colon$plus(stack.func_77946_l().func_77979_a(1), scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class))); return; }  return; }  this.data$2.components_$eq((ItemStack[])scala.Predef$.MODULE$.refArrayOps((Object[])this.data$2.components()).$colon$plus(stack.func_77946_l().func_77979_a(1), scala.reflect.ClassTag$.MODULE$.apply(ItemStack.class)));
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean weAreBeingCalledFromAppliedEnergistics2()
/*     */   {
/* 223 */     return (li.cil.oc.integration.Mods$.MODULE$.AppliedEnergistics2().isAvailable() && scala.Predef$.MODULE$.refArrayOps((Object[])(new Exception()).getStackTrace()).exists((Function1)new ExtendedRecipe$$anonfun$weAreBeingCalledFromAppliedEnergistics2$1())); } public final class ExtendedRecipe$$anonfun$weAreBeingCalledFromAppliedEnergistics2$1 extends AbstractFunction1<StackTraceElement, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(StackTraceElement x$8) { String str = "appeng.container.implementations.ContainerPatternTerm"; if (x$8.getClassName() == null) { x$8.getClassName(); if (str != null); } else if (x$8.getClassName().equals(str))
/*     */       {  }
/*     */        }
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
/*     */   private ExtendedRecipe$() {
/* 274 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\recipe\ExtendedRecipe$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */