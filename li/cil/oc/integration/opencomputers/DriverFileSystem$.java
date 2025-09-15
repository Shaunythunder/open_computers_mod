/*     */ package li.cil.oc.integration.opencomputers;
/*     */ 
/*     */ import java.util.UUID;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.common.item.HardDiskDrive;
/*     */ import li.cil.oc.common.item.traits.Delegate;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.collection.LinearSeqOptimized;
/*     */ import scala.collection.Seq;
/*     */ import scala.util.matching.Regex;
/*     */ 
/*     */ public final class DriverFileSystem$ implements Item {
/*     */   public static final DriverFileSystem$ MODULE$;
/*     */   
/*  20 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } private final Regex UUIDVerifier; public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverFileSystem$() { MODULE$ = this; Item$class.$init$(this);
/*  21 */     this.UUIDVerifier = (new StringOps(scala.Predef$.MODULE$.augmentString("^([0-9a-f]{8}-(?:[0-9a-f]{4}-){3}[0-9a-f]{12})$"))).r(); } public Regex UUIDVerifier() { return this.UUIDVerifier; }
/*     */    public boolean worksWith(ItemStack stack) {
/*  23 */     (new ItemInfo[4])[0] = 
/*  24 */       Items.get("hdd1");
/*  25 */     (new ItemInfo[4])[1] = Items.get("hdd2");
/*  26 */     (new ItemInfo[4])[2] = Items.get("hdd3");
/*  27 */     (new ItemInfo[4])[3] = Items.get("floppy");
/*     */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[4]));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   6: ifnull -> 25
/*     */     //   9: aload_2
/*     */     //   10: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   15: getfield field_72995_K : Z
/*     */     //   18: ifeq -> 25
/*     */     //   21: aconst_null
/*     */     //   22: goto -> 166
/*     */     //   25: iconst_0
/*     */     //   26: istore_3
/*     */     //   27: aconst_null
/*     */     //   28: astore #4
/*     */     //   30: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */     //   33: aload_1
/*     */     //   34: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   37: astore #5
/*     */     //   39: aload #5
/*     */     //   41: instanceof scala/Some
/*     */     //   44: ifeq -> 113
/*     */     //   47: iconst_1
/*     */     //   48: istore_3
/*     */     //   49: aload #5
/*     */     //   51: checkcast scala/Some
/*     */     //   54: astore #4
/*     */     //   56: aload #4
/*     */     //   58: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   61: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   64: astore #6
/*     */     //   66: aload #6
/*     */     //   68: instanceof li/cil/oc/common/item/HardDiskDrive
/*     */     //   71: ifeq -> 113
/*     */     //   74: aload #6
/*     */     //   76: checkcast li/cil/oc/common/item/HardDiskDrive
/*     */     //   79: astore #7
/*     */     //   81: aload_0
/*     */     //   82: aload_1
/*     */     //   83: aload #7
/*     */     //   85: invokevirtual kiloBytes : ()I
/*     */     //   88: sipush #1024
/*     */     //   91: imul
/*     */     //   92: aload #7
/*     */     //   94: invokevirtual platterCount : ()I
/*     */     //   97: aload_2
/*     */     //   98: aload #7
/*     */     //   100: invokevirtual tier : ()I
/*     */     //   103: iconst_2
/*     */     //   104: iadd
/*     */     //   105: invokespecial createEnvironment : (Lnet/minecraft/item/ItemStack;IILli/cil/oc/api/network/EnvironmentHost;I)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   108: astore #8
/*     */     //   110: goto -> 164
/*     */     //   113: iload_3
/*     */     //   114: ifeq -> 161
/*     */     //   117: aload #4
/*     */     //   119: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   122: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   125: astore #9
/*     */     //   127: aload #9
/*     */     //   129: instanceof li/cil/oc/common/item/FloppyDisk
/*     */     //   132: ifeq -> 161
/*     */     //   135: aload_0
/*     */     //   136: aload_1
/*     */     //   137: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   140: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   143: invokevirtual floppySize : ()I
/*     */     //   146: sipush #1024
/*     */     //   149: imul
/*     */     //   150: iconst_1
/*     */     //   151: aload_2
/*     */     //   152: iconst_1
/*     */     //   153: invokespecial createEnvironment : (Lnet/minecraft/item/ItemStack;IILli/cil/oc/api/network/EnvironmentHost;I)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   156: astore #8
/*     */     //   158: goto -> 164
/*     */     //   161: aconst_null
/*     */     //   162: astore #8
/*     */     //   164: aload #8
/*     */     //   166: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #30	-> 0
/*     */     //   #32	-> 25
/*     */     //   #31	-> 30
/*     */     //   #32	-> 39
/*     */     //   #31	-> 113
/*     */     //   #33	-> 117
/*     */     //   #34	-> 161
/*     */     //   #31	-> 164
/*     */     //   #30	-> 166
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	167	0	this	Lli/cil/oc/integration/opencomputers/DriverFileSystem$;
/*     */     //   0	167	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	167	2	host	Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   66	101	6	hdd	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   127	40	9	disk	Lli/cil/oc/common/item/traits/Delegate;
/*     */   }
/*     */ 
/*     */   
/*     */   public String slot(ItemStack stack) {
/*  39 */     boolean bool = false; Some some = null; Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack); if (option instanceof Some) { bool = true; some = (Some)option; Delegate hdd = (Delegate)some.x(); if (hdd instanceof HardDiskDrive) return li.cil.oc.common.Slot$.MODULE$.HDD();  }
/*  40 */      if (bool) { Delegate disk = (Delegate)some.x(); if (disk instanceof li.cil.oc.common.item.FloppyDisk) return li.cil.oc.common.Slot$.MODULE$.Floppy();  }
/*  41 */      throw new IllegalArgumentException();
/*     */   }
/*     */   
/*     */   public int tier(ItemStack stack) {
/*  45 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/*  46 */     if (option instanceof Some) { Some some = (Some)option; Delegate hdd = (Delegate)some.x(); if (hdd instanceof HardDiskDrive) { HardDiskDrive hardDiskDrive = (HardDiskDrive)hdd; return hardDiskDrive.tier(); }  }
/*  47 */      return 0;
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
/*     */   private ManagedEnvironment createEnvironment(ItemStack stack, int capacity, int platterCount, EnvironmentHost host, int speed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual func_77942_o : ()Z
/*     */     //   4: ifeq -> 240
/*     */     //   7: aload_1
/*     */     //   8: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   11: new scala/collection/mutable/StringBuilder
/*     */     //   14: dup
/*     */     //   15: invokespecial <init> : ()V
/*     */     //   18: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   21: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   24: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   27: ldc 'lootFactory'
/*     */     //   29: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   32: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   35: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   38: ifeq -> 240
/*     */     //   41: getstatic li/cil/oc/common/Loot$.MODULE$ : Lli/cil/oc/common/Loot$;
/*     */     //   44: invokevirtual factories : ()Lscala/collection/mutable/Map;
/*     */     //   47: aload_1
/*     */     //   48: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   51: new scala/collection/mutable/StringBuilder
/*     */     //   54: dup
/*     */     //   55: invokespecial <init> : ()V
/*     */     //   58: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   61: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   64: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   67: ldc 'lootFactory'
/*     */     //   69: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   72: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   75: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   78: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   83: astore #6
/*     */     //   85: aload #6
/*     */     //   87: instanceof scala/Some
/*     */     //   90: ifeq -> 232
/*     */     //   93: aload #6
/*     */     //   95: checkcast scala/Some
/*     */     //   98: astore #7
/*     */     //   100: aload #7
/*     */     //   102: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   105: checkcast java/util/concurrent/Callable
/*     */     //   108: astore #8
/*     */     //   110: aload_0
/*     */     //   111: aload_1
/*     */     //   112: invokevirtual dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   115: new scala/collection/mutable/StringBuilder
/*     */     //   118: dup
/*     */     //   119: invokespecial <init> : ()V
/*     */     //   122: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   125: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   128: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   131: ldc_w 'fs.label'
/*     */     //   134: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   137: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   140: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   143: ifeq -> 182
/*     */     //   146: aload_0
/*     */     //   147: aload_1
/*     */     //   148: invokevirtual dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   151: new scala/collection/mutable/StringBuilder
/*     */     //   154: dup
/*     */     //   155: invokespecial <init> : ()V
/*     */     //   158: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   161: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   164: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   167: ldc_w 'fs.label'
/*     */     //   170: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   173: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   176: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   179: goto -> 183
/*     */     //   182: aconst_null
/*     */     //   183: astore #10
/*     */     //   185: aload #8
/*     */     //   187: invokeinterface call : ()Ljava/lang/Object;
/*     */     //   192: checkcast li/cil/oc/api/fs/FileSystem
/*     */     //   195: aload #10
/*     */     //   197: aload #4
/*     */     //   199: new scala/collection/mutable/StringBuilder
/*     */     //   202: dup
/*     */     //   203: invokespecial <init> : ()V
/*     */     //   206: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   209: invokevirtual resourceDomain : ()Ljava/lang/String;
/*     */     //   212: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   215: ldc_w ':floppy_access'
/*     */     //   218: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   221: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   224: invokestatic asManagedEnvironment : (Lli/cil/oc/api/fs/FileSystem;Ljava/lang/String;Lli/cil/oc/api/network/EnvironmentHost;Ljava/lang/String;)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   227: astore #9
/*     */     //   229: goto -> 235
/*     */     //   232: aconst_null
/*     */     //   233: astore #9
/*     */     //   235: aload #9
/*     */     //   237: goto -> 523
/*     */     //   240: aload_0
/*     */     //   241: aload_0
/*     */     //   242: aload_1
/*     */     //   243: invokevirtual dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   246: invokespecial addressFromTag : (Lnet/minecraft/nbt/NBTTagCompound;)Ljava/lang/String;
/*     */     //   249: astore #11
/*     */     //   251: new li/cil/oc/integration/opencomputers/DriverFileSystem$ReadWriteItemLabel
/*     */     //   254: dup
/*     */     //   255: aload_1
/*     */     //   256: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   259: astore #12
/*     */     //   261: aload_1
/*     */     //   262: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   265: ldc 'floppy'
/*     */     //   267: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   270: astore #14
/*     */     //   272: dup
/*     */     //   273: ifnonnull -> 285
/*     */     //   276: pop
/*     */     //   277: aload #14
/*     */     //   279: ifnull -> 293
/*     */     //   282: goto -> 297
/*     */     //   285: aload #14
/*     */     //   287: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   290: ifeq -> 297
/*     */     //   293: iconst_1
/*     */     //   294: goto -> 298
/*     */     //   297: iconst_0
/*     */     //   298: istore #13
/*     */     //   300: new scala/collection/mutable/StringBuilder
/*     */     //   303: dup
/*     */     //   304: invokespecial <init> : ()V
/*     */     //   307: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   310: invokevirtual resourceDomain : ()Ljava/lang/String;
/*     */     //   313: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   316: ldc_w ':'
/*     */     //   319: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   322: iload #13
/*     */     //   324: ifeq -> 333
/*     */     //   327: ldc_w 'floppy_access'
/*     */     //   330: goto -> 336
/*     */     //   333: ldc_w 'hdd_access'
/*     */     //   336: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   339: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   342: astore #15
/*     */     //   344: new li/cil/oc/common/item/data/DriveData
/*     */     //   347: dup
/*     */     //   348: aload_1
/*     */     //   349: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   352: astore #16
/*     */     //   354: aload #16
/*     */     //   356: invokevirtual isUnmanaged : ()Z
/*     */     //   359: ifeq -> 412
/*     */     //   362: new li/cil/oc/server/component/Drive
/*     */     //   365: dup
/*     */     //   366: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */     //   369: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   372: iload_2
/*     */     //   373: invokevirtual intWrapper : (I)I
/*     */     //   376: iconst_0
/*     */     //   377: invokevirtual max$extension : (II)I
/*     */     //   380: iload_3
/*     */     //   381: aload #12
/*     */     //   383: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   386: aload #4
/*     */     //   388: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   391: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   394: aload #15
/*     */     //   396: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   399: iload #5
/*     */     //   401: aload #16
/*     */     //   403: invokevirtual isLocked : ()Z
/*     */     //   406: invokespecial <init> : (IILli/cil/oc/api/fs/Label;Lscala/Option;Lscala/Option;IZ)V
/*     */     //   409: goto -> 487
/*     */     //   412: aload #11
/*     */     //   414: getstatic scala/runtime/RichInt$.MODULE$ : Lscala/runtime/RichInt$;
/*     */     //   417: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   420: iload_2
/*     */     //   421: invokevirtual intWrapper : (I)I
/*     */     //   424: iconst_0
/*     */     //   425: invokevirtual max$extension : (II)I
/*     */     //   428: i2l
/*     */     //   429: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   432: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   435: invokevirtual bufferChanges : ()Z
/*     */     //   438: invokestatic fromSaveDirectory : (Ljava/lang/String;JZ)Lli/cil/oc/api/fs/FileSystem;
/*     */     //   441: astore #18
/*     */     //   443: aload #16
/*     */     //   445: invokevirtual isLocked : ()Z
/*     */     //   448: ifeq -> 474
/*     */     //   451: aload #18
/*     */     //   453: invokestatic asReadOnly : (Lli/cil/oc/api/fs/FileSystem;)Lli/cil/oc/api/fs/FileSystem;
/*     */     //   456: astore #18
/*     */     //   458: new li/cil/oc/server/fs/FileSystem$ReadOnlyLabel
/*     */     //   461: dup
/*     */     //   462: aload #12
/*     */     //   464: invokeinterface getLabel : ()Ljava/lang/String;
/*     */     //   469: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   472: astore #12
/*     */     //   474: aload #18
/*     */     //   476: aload #12
/*     */     //   478: aload #4
/*     */     //   480: aload #15
/*     */     //   482: iload #5
/*     */     //   484: invokestatic asManagedEnvironment : (Lli/cil/oc/api/fs/FileSystem;Lli/cil/oc/api/fs/Label;Lli/cil/oc/api/network/EnvironmentHost;Ljava/lang/String;I)Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   487: astore #17
/*     */     //   489: aload #17
/*     */     //   491: ifnull -> 521
/*     */     //   494: aload #17
/*     */     //   496: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   501: ifnull -> 521
/*     */     //   504: aload #17
/*     */     //   506: invokeinterface node : ()Lli/cil/oc/api/network/Node;
/*     */     //   511: checkcast li/cil/oc/server/network/Node
/*     */     //   514: aload #11
/*     */     //   516: invokeinterface address_$eq : (Ljava/lang/String;)V
/*     */     //   521: aload #17
/*     */     //   523: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 0
/*     */     //   #53	-> 41
/*     */     //   #54	-> 85
/*     */     //   #56	-> 110
/*     */     //   #57	-> 146
/*     */     //   #58	-> 182
/*     */     //   #55	-> 183
/*     */     //   #59	-> 185
/*     */     //   #54	-> 227
/*     */     //   #60	-> 232
/*     */     //   #53	-> 235
/*     */     //   #67	-> 240
/*     */     //   #68	-> 251
/*     */     //   #69	-> 261
/*     */     //   #70	-> 300
/*     */     //   #71	-> 344
/*     */     //   #72	-> 354
/*     */     //   #73	-> 362
/*     */     //   #76	-> 412
/*     */     //   #77	-> 443
/*     */     //   #78	-> 451
/*     */     //   #79	-> 458
/*     */     //   #81	-> 474
/*     */     //   #72	-> 487
/*     */     //   #83	-> 489
/*     */     //   #84	-> 504
/*     */     //   #86	-> 521
/*     */     //   #51	-> 523
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	524	0	this	Lli/cil/oc/integration/opencomputers/DriverFileSystem$;
/*     */     //   0	524	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	524	2	capacity	I
/*     */     //   0	524	3	platterCount	I
/*     */     //   0	524	4	host	Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   0	524	5	speed	I
/*     */     //   110	414	8	factory	Ljava/util/concurrent/Callable;
/*     */     //   185	42	10	label	Ljava/lang/String;
/*     */     //   251	272	11	address	Ljava/lang/String;
/*     */     //   261	262	12	label	Lli/cil/oc/api/fs/Label;
/*     */     //   300	223	13	isFloppy	Z
/*     */     //   344	179	15	sound	Ljava/lang/String;
/*     */     //   354	169	16	drive	Lli/cil/oc/common/item/data/DriveData;
/*     */     //   443	44	18	fs	Lli/cil/oc/api/fs/FileSystem;
/*     */     //   489	34	17	environment	Lli/cil/oc/api/network/ManagedEnvironment;
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
/*     */   private String addressFromTag(NBTTagCompound tag) {
/*  92 */     String str2, str1 = tag.func_74775_l("node").func_74779_i("address");
/*  93 */     Option option = UUIDVerifier().unapplySeq(str1); if (!option.isEmpty() && option.get() != null && ((LinearSeqOptimized)option.get()).lengthCompare(1) == 0) { String address = (String)((LinearSeqOptimized)option.get()).apply(0); }
/*     */     else
/*  95 */     { String newAddress = UUID.randomUUID().toString();
/*  96 */       tag.func_74775_l("node").func_74778_a("address", newAddress);
/*  97 */       (new String[2])[0] = "Generated new address for disk '"; (new String[2])[1] = "'."; li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { newAddress })));
/*  98 */       str2 = newAddress; }
/*     */ 
/*     */     
/* 101 */     return (tag.func_74764_b("node") && tag.func_74775_l("node").func_74764_b("address")) ? str2 : UUID.randomUUID().toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverFileSystem$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */