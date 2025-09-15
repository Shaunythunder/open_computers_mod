/*     */ package li.cil.oc.client;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.common.inventory.DatabaseInventory;
/*     */ import li.cil.oc.common.inventory.DiskDriveMountableInventory;
/*     */ import li.cil.oc.common.inventory.Inventory;
/*     */ import li.cil.oc.common.inventory.ItemStackInventory;
/*     */ import li.cil.oc.common.inventory.ServerInventory;
/*     */ import li.cil.oc.common.inventory.SimpleInventory;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Option;
/*     */ 
/*     */ public final class GuiHandler$ extends GuiHandler {
/*     */   private GuiHandler$() {
/*  16 */     MODULE$ = this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final GuiHandler$ MODULE$;
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore #7
/*     */     //   3: aconst_null
/*     */     //   4: astore #8
/*     */     //   6: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   9: invokevirtual Categories : ()Lscala/collection/mutable/Map;
/*     */     //   12: iload_1
/*     */     //   13: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   16: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   21: astore #9
/*     */     //   23: aload #9
/*     */     //   25: instanceof scala/Some
/*     */     //   28: ifeq -> 966
/*     */     //   31: iconst_1
/*     */     //   32: istore #7
/*     */     //   34: aload #9
/*     */     //   36: checkcast scala/Some
/*     */     //   39: astore #8
/*     */     //   41: aload #8
/*     */     //   43: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   46: checkcast li/cil/oc/util/ScalaEnum$Value
/*     */     //   49: astore #10
/*     */     //   51: getstatic li/cil/oc/common/GuiType$Category$.MODULE$ : Lli/cil/oc/common/GuiType$Category$;
/*     */     //   54: invokevirtual Block : ()Lli/cil/oc/common/GuiType$Category$EnumVal;
/*     */     //   57: aload #10
/*     */     //   59: astore #11
/*     */     //   61: dup
/*     */     //   62: ifnonnull -> 74
/*     */     //   65: pop
/*     */     //   66: aload #11
/*     */     //   68: ifnull -> 82
/*     */     //   71: goto -> 966
/*     */     //   74: aload #11
/*     */     //   76: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   79: ifeq -> 966
/*     */     //   82: iconst_0
/*     */     //   83: istore #13
/*     */     //   85: aconst_null
/*     */     //   86: invokestatic create : (Ljava/lang/Object;)Lscala/runtime/ObjectRef;
/*     */     //   89: astore #14
/*     */     //   91: aload_3
/*     */     //   92: iload #4
/*     */     //   94: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   97: iload #5
/*     */     //   99: invokevirtual extractY : (I)I
/*     */     //   102: iload #6
/*     */     //   104: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   107: astore #15
/*     */     //   109: aload #15
/*     */     //   111: instanceof li/cil/oc/common/tileentity/Adapter
/*     */     //   114: ifeq -> 157
/*     */     //   117: aload #15
/*     */     //   119: checkcast li/cil/oc/common/tileentity/Adapter
/*     */     //   122: astore #16
/*     */     //   124: iload_1
/*     */     //   125: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   128: invokevirtual Adapter : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   131: invokeinterface id : ()I
/*     */     //   136: if_icmpne -> 157
/*     */     //   139: new li/cil/oc/client/gui/Adapter
/*     */     //   142: dup
/*     */     //   143: aload_2
/*     */     //   144: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   147: aload #16
/*     */     //   149: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Adapter;)V
/*     */     //   152: astore #17
/*     */     //   154: goto -> 959
/*     */     //   157: aload #15
/*     */     //   159: instanceof li/cil/oc/common/tileentity/Assembler
/*     */     //   162: ifeq -> 205
/*     */     //   165: aload #15
/*     */     //   167: checkcast li/cil/oc/common/tileentity/Assembler
/*     */     //   170: astore #18
/*     */     //   172: iload_1
/*     */     //   173: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   176: invokevirtual Assembler : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   179: invokeinterface id : ()I
/*     */     //   184: if_icmpne -> 205
/*     */     //   187: new li/cil/oc/client/gui/Assembler
/*     */     //   190: dup
/*     */     //   191: aload_2
/*     */     //   192: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   195: aload #18
/*     */     //   197: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Assembler;)V
/*     */     //   200: astore #17
/*     */     //   202: goto -> 959
/*     */     //   205: aload #15
/*     */     //   207: instanceof li/cil/oc/common/tileentity/Case
/*     */     //   210: ifeq -> 253
/*     */     //   213: aload #15
/*     */     //   215: checkcast li/cil/oc/common/tileentity/Case
/*     */     //   218: astore #19
/*     */     //   220: iload_1
/*     */     //   221: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   224: invokevirtual Case : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   227: invokeinterface id : ()I
/*     */     //   232: if_icmpne -> 253
/*     */     //   235: new li/cil/oc/client/gui/Case
/*     */     //   238: dup
/*     */     //   239: aload_2
/*     */     //   240: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   243: aload #19
/*     */     //   245: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Case;)V
/*     */     //   248: astore #17
/*     */     //   250: goto -> 959
/*     */     //   253: aload #15
/*     */     //   255: instanceof li/cil/oc/common/tileentity/Charger
/*     */     //   258: ifeq -> 301
/*     */     //   261: aload #15
/*     */     //   263: checkcast li/cil/oc/common/tileentity/Charger
/*     */     //   266: astore #20
/*     */     //   268: iload_1
/*     */     //   269: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   272: invokevirtual Charger : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   275: invokeinterface id : ()I
/*     */     //   280: if_icmpne -> 301
/*     */     //   283: new li/cil/oc/client/gui/Charger
/*     */     //   286: dup
/*     */     //   287: aload_2
/*     */     //   288: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   291: aload #20
/*     */     //   293: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Charger;)V
/*     */     //   296: astore #17
/*     */     //   298: goto -> 959
/*     */     //   301: aload #15
/*     */     //   303: instanceof li/cil/oc/common/tileentity/Disassembler
/*     */     //   306: ifeq -> 349
/*     */     //   309: aload #15
/*     */     //   311: checkcast li/cil/oc/common/tileentity/Disassembler
/*     */     //   314: astore #21
/*     */     //   316: iload_1
/*     */     //   317: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   320: invokevirtual Disassembler : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   323: invokeinterface id : ()I
/*     */     //   328: if_icmpne -> 349
/*     */     //   331: new li/cil/oc/client/gui/Disassembler
/*     */     //   334: dup
/*     */     //   335: aload_2
/*     */     //   336: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   339: aload #21
/*     */     //   341: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Disassembler;)V
/*     */     //   344: astore #17
/*     */     //   346: goto -> 959
/*     */     //   349: aload #15
/*     */     //   351: instanceof li/cil/oc/common/tileentity/DiskDrive
/*     */     //   354: ifeq -> 397
/*     */     //   357: aload #15
/*     */     //   359: checkcast li/cil/oc/common/tileentity/DiskDrive
/*     */     //   362: astore #22
/*     */     //   364: iload_1
/*     */     //   365: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   368: invokevirtual DiskDrive : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   371: invokeinterface id : ()I
/*     */     //   376: if_icmpne -> 397
/*     */     //   379: new li/cil/oc/client/gui/DiskDrive
/*     */     //   382: dup
/*     */     //   383: aload_2
/*     */     //   384: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   387: aload #22
/*     */     //   389: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/inventory/IInventory;)V
/*     */     //   392: astore #17
/*     */     //   394: goto -> 959
/*     */     //   397: aload #15
/*     */     //   399: instanceof li/cil/oc/common/tileentity/Printer
/*     */     //   402: ifeq -> 445
/*     */     //   405: aload #15
/*     */     //   407: checkcast li/cil/oc/common/tileentity/Printer
/*     */     //   410: astore #23
/*     */     //   412: iload_1
/*     */     //   413: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   416: invokevirtual Printer : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   419: invokeinterface id : ()I
/*     */     //   424: if_icmpne -> 445
/*     */     //   427: new li/cil/oc/client/gui/Printer
/*     */     //   430: dup
/*     */     //   431: aload_2
/*     */     //   432: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   435: aload #23
/*     */     //   437: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Printer;)V
/*     */     //   440: astore #17
/*     */     //   442: goto -> 959
/*     */     //   445: aload #15
/*     */     //   447: instanceof li/cil/oc/common/tileentity/Rack
/*     */     //   450: ifeq -> 505
/*     */     //   453: iconst_1
/*     */     //   454: istore #13
/*     */     //   456: aload #14
/*     */     //   458: aload #15
/*     */     //   460: checkcast li/cil/oc/common/tileentity/Rack
/*     */     //   463: putfield elem : Ljava/lang/Object;
/*     */     //   466: iload_1
/*     */     //   467: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   470: invokevirtual Rack : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   473: invokeinterface id : ()I
/*     */     //   478: if_icmpne -> 505
/*     */     //   481: new li/cil/oc/client/gui/Rack
/*     */     //   484: dup
/*     */     //   485: aload_2
/*     */     //   486: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   489: aload #14
/*     */     //   491: getfield elem : Ljava/lang/Object;
/*     */     //   494: checkcast li/cil/oc/common/tileentity/Rack
/*     */     //   497: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Rack;)V
/*     */     //   500: astore #17
/*     */     //   502: goto -> 959
/*     */     //   505: aload #15
/*     */     //   507: instanceof li/cil/oc/common/tileentity/Raid
/*     */     //   510: ifeq -> 553
/*     */     //   513: aload #15
/*     */     //   515: checkcast li/cil/oc/common/tileentity/Raid
/*     */     //   518: astore #24
/*     */     //   520: iload_1
/*     */     //   521: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   524: invokevirtual Raid : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   527: invokeinterface id : ()I
/*     */     //   532: if_icmpne -> 553
/*     */     //   535: new li/cil/oc/client/gui/Raid
/*     */     //   538: dup
/*     */     //   539: aload_2
/*     */     //   540: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   543: aload #24
/*     */     //   545: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Raid;)V
/*     */     //   548: astore #17
/*     */     //   550: goto -> 959
/*     */     //   553: aload #15
/*     */     //   555: instanceof li/cil/oc/common/tileentity/Relay
/*     */     //   558: ifeq -> 601
/*     */     //   561: aload #15
/*     */     //   563: checkcast li/cil/oc/common/tileentity/Relay
/*     */     //   566: astore #25
/*     */     //   568: iload_1
/*     */     //   569: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   572: invokevirtual Relay : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   575: invokeinterface id : ()I
/*     */     //   580: if_icmpne -> 601
/*     */     //   583: new li/cil/oc/client/gui/Relay
/*     */     //   586: dup
/*     */     //   587: aload_2
/*     */     //   588: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   591: aload #25
/*     */     //   593: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Relay;)V
/*     */     //   596: astore #17
/*     */     //   598: goto -> 959
/*     */     //   601: aload #15
/*     */     //   603: instanceof li/cil/oc/common/tileentity/RobotProxy
/*     */     //   606: ifeq -> 652
/*     */     //   609: aload #15
/*     */     //   611: checkcast li/cil/oc/common/tileentity/RobotProxy
/*     */     //   614: astore #26
/*     */     //   616: iload_1
/*     */     //   617: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   620: invokevirtual Robot : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   623: invokeinterface id : ()I
/*     */     //   628: if_icmpne -> 652
/*     */     //   631: new li/cil/oc/client/gui/Robot
/*     */     //   634: dup
/*     */     //   635: aload_2
/*     */     //   636: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   639: aload #26
/*     */     //   641: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*     */     //   644: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Robot;)V
/*     */     //   647: astore #17
/*     */     //   649: goto -> 959
/*     */     //   652: aload #15
/*     */     //   654: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   657: ifeq -> 734
/*     */     //   660: aload #15
/*     */     //   662: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   665: astore #27
/*     */     //   667: iload_1
/*     */     //   668: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   671: invokevirtual Screen : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   674: invokeinterface id : ()I
/*     */     //   679: if_icmpne -> 734
/*     */     //   682: new li/cil/oc/client/gui/Screen
/*     */     //   685: dup
/*     */     //   686: aload #27
/*     */     //   688: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   691: invokevirtual buffer : ()Lli/cil/oc/api/internal/TextBuffer;
/*     */     //   694: aload #27
/*     */     //   696: invokevirtual tier : ()I
/*     */     //   699: iconst_0
/*     */     //   700: if_icmple -> 707
/*     */     //   703: iconst_1
/*     */     //   704: goto -> 708
/*     */     //   707: iconst_0
/*     */     //   708: new li/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$1
/*     */     //   711: dup
/*     */     //   712: aload #27
/*     */     //   714: invokespecial <init> : (Lli/cil/oc/common/tileentity/Screen;)V
/*     */     //   717: new li/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$2
/*     */     //   720: dup
/*     */     //   721: aload #27
/*     */     //   723: invokespecial <init> : (Lli/cil/oc/common/tileentity/Screen;)V
/*     */     //   726: invokespecial <init> : (Lli/cil/oc/api/internal/TextBuffer;ZLscala/Function0;Lscala/Function0;)V
/*     */     //   729: astore #17
/*     */     //   731: goto -> 959
/*     */     //   734: iload #13
/*     */     //   736: ifeq -> 807
/*     */     //   739: iload_1
/*     */     //   740: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   743: invokevirtual ServerInRack : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   746: invokeinterface id : ()I
/*     */     //   751: if_icmpne -> 807
/*     */     //   754: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   757: iload #5
/*     */     //   759: invokevirtual extractSlot : (I)I
/*     */     //   762: istore #28
/*     */     //   764: new li/cil/oc/client/gui/Server
/*     */     //   767: dup
/*     */     //   768: aload_2
/*     */     //   769: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   772: new li/cil/oc/client/GuiHandler$$anon$1
/*     */     //   775: dup
/*     */     //   776: iload #28
/*     */     //   778: aload #14
/*     */     //   780: invokespecial <init> : (ILscala/runtime/ObjectRef;)V
/*     */     //   783: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   786: aload #14
/*     */     //   788: getfield elem : Ljava/lang/Object;
/*     */     //   791: checkcast li/cil/oc/common/tileentity/Rack
/*     */     //   794: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   797: iload #28
/*     */     //   799: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/inventory/ServerInventory;Lscala/Option;I)V
/*     */     //   802: astore #17
/*     */     //   804: goto -> 959
/*     */     //   807: iload #13
/*     */     //   809: ifeq -> 864
/*     */     //   812: iload_1
/*     */     //   813: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   816: invokevirtual DiskDriveMountableInRack : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   819: invokeinterface id : ()I
/*     */     //   824: if_icmpne -> 864
/*     */     //   827: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   830: iload #5
/*     */     //   832: invokevirtual extractSlot : (I)I
/*     */     //   835: istore #29
/*     */     //   837: new li/cil/oc/client/gui/DiskDrive
/*     */     //   840: dup
/*     */     //   841: aload_2
/*     */     //   842: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   845: new li/cil/oc/client/GuiHandler$$anon$2
/*     */     //   848: dup
/*     */     //   849: iload #29
/*     */     //   851: aload #14
/*     */     //   853: invokespecial <init> : (ILscala/runtime/ObjectRef;)V
/*     */     //   856: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/inventory/IInventory;)V
/*     */     //   859: astore #17
/*     */     //   861: goto -> 959
/*     */     //   864: aload #15
/*     */     //   866: instanceof li/cil/oc/common/tileentity/Switch
/*     */     //   869: ifeq -> 912
/*     */     //   872: aload #15
/*     */     //   874: checkcast li/cil/oc/common/tileentity/Switch
/*     */     //   877: astore #30
/*     */     //   879: iload_1
/*     */     //   880: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   883: invokevirtual Switch : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   886: invokeinterface id : ()I
/*     */     //   891: if_icmpne -> 912
/*     */     //   894: new li/cil/oc/client/gui/Switch
/*     */     //   897: dup
/*     */     //   898: aload_2
/*     */     //   899: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   902: aload #30
/*     */     //   904: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Switch;)V
/*     */     //   907: astore #17
/*     */     //   909: goto -> 959
/*     */     //   912: aload #15
/*     */     //   914: instanceof li/cil/oc/common/tileentity/Waypoint
/*     */     //   917: ifeq -> 956
/*     */     //   920: aload #15
/*     */     //   922: checkcast li/cil/oc/common/tileentity/Waypoint
/*     */     //   925: astore #31
/*     */     //   927: iload_1
/*     */     //   928: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   931: invokevirtual Waypoint : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   934: invokeinterface id : ()I
/*     */     //   939: if_icmpne -> 956
/*     */     //   942: new li/cil/oc/client/gui/Waypoint
/*     */     //   945: dup
/*     */     //   946: aload #31
/*     */     //   948: invokespecial <init> : (Lli/cil/oc/common/tileentity/Waypoint;)V
/*     */     //   951: astore #17
/*     */     //   953: goto -> 959
/*     */     //   956: aconst_null
/*     */     //   957: astore #17
/*     */     //   959: aload #17
/*     */     //   961: astore #12
/*     */     //   963: goto -> 2104
/*     */     //   966: iload #7
/*     */     //   968: ifeq -> 1078
/*     */     //   971: aload #8
/*     */     //   973: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   976: checkcast li/cil/oc/util/ScalaEnum$Value
/*     */     //   979: astore #32
/*     */     //   981: getstatic li/cil/oc/common/GuiType$Category$.MODULE$ : Lli/cil/oc/common/GuiType$Category$;
/*     */     //   984: invokevirtual Entity : ()Lli/cil/oc/common/GuiType$Category$EnumVal;
/*     */     //   987: aload #32
/*     */     //   989: astore #33
/*     */     //   991: dup
/*     */     //   992: ifnonnull -> 1004
/*     */     //   995: pop
/*     */     //   996: aload #33
/*     */     //   998: ifnull -> 1012
/*     */     //   1001: goto -> 1078
/*     */     //   1004: aload #33
/*     */     //   1006: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1009: ifeq -> 1078
/*     */     //   1012: aload_3
/*     */     //   1013: iload #4
/*     */     //   1015: invokevirtual func_73045_a : (I)Lnet/minecraft/entity/Entity;
/*     */     //   1018: astore #34
/*     */     //   1020: aload #34
/*     */     //   1022: instanceof li/cil/oc/common/entity/Drone
/*     */     //   1025: ifeq -> 1068
/*     */     //   1028: aload #34
/*     */     //   1030: checkcast li/cil/oc/common/entity/Drone
/*     */     //   1033: astore #35
/*     */     //   1035: iload_1
/*     */     //   1036: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1039: invokevirtual Drone : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1042: invokeinterface id : ()I
/*     */     //   1047: if_icmpne -> 1068
/*     */     //   1050: new li/cil/oc/client/gui/Drone
/*     */     //   1053: dup
/*     */     //   1054: aload_2
/*     */     //   1055: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   1058: aload #35
/*     */     //   1060: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/entity/Drone;)V
/*     */     //   1063: astore #36
/*     */     //   1065: goto -> 1071
/*     */     //   1068: aconst_null
/*     */     //   1069: astore #36
/*     */     //   1071: aload #36
/*     */     //   1073: astore #12
/*     */     //   1075: goto -> 2104
/*     */     //   1078: iload #7
/*     */     //   1080: ifeq -> 2024
/*     */     //   1083: aload #8
/*     */     //   1085: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1088: checkcast li/cil/oc/util/ScalaEnum$Value
/*     */     //   1091: astore #37
/*     */     //   1093: getstatic li/cil/oc/common/GuiType$Category$.MODULE$ : Lli/cil/oc/common/GuiType$Category$;
/*     */     //   1096: invokevirtual Item : ()Lli/cil/oc/common/GuiType$Category$EnumVal;
/*     */     //   1099: aload #37
/*     */     //   1101: astore #38
/*     */     //   1103: dup
/*     */     //   1104: ifnonnull -> 1116
/*     */     //   1107: pop
/*     */     //   1108: aload #38
/*     */     //   1110: ifnull -> 1124
/*     */     //   1113: goto -> 2024
/*     */     //   1116: aload #38
/*     */     //   1118: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1121: ifeq -> 2024
/*     */     //   1124: iconst_0
/*     */     //   1125: istore #39
/*     */     //   1127: aconst_null
/*     */     //   1128: astore #40
/*     */     //   1130: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */     //   1133: aload_2
/*     */     //   1134: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   1137: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   1140: astore #41
/*     */     //   1142: aload #41
/*     */     //   1144: instanceof scala/Some
/*     */     //   1147: ifeq -> 1217
/*     */     //   1150: iconst_1
/*     */     //   1151: istore #39
/*     */     //   1153: aload #41
/*     */     //   1155: checkcast scala/Some
/*     */     //   1158: astore #40
/*     */     //   1160: aload #40
/*     */     //   1162: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1165: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   1168: astore #42
/*     */     //   1170: aload #42
/*     */     //   1172: instanceof li/cil/oc/common/item/traits/FileSystemLike
/*     */     //   1175: ifeq -> 1217
/*     */     //   1178: iload_1
/*     */     //   1179: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1182: invokevirtual Drive : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1185: invokeinterface id : ()I
/*     */     //   1190: if_icmpne -> 1217
/*     */     //   1193: new li/cil/oc/client/gui/Drive
/*     */     //   1196: dup
/*     */     //   1197: aload_2
/*     */     //   1198: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   1201: new li/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$7
/*     */     //   1204: dup
/*     */     //   1205: aload_2
/*     */     //   1206: invokespecial <init> : (Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   1209: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lscala/Function0;)V
/*     */     //   1212: astore #43
/*     */     //   1214: goto -> 2017
/*     */     //   1217: iload #39
/*     */     //   1219: ifeq -> 1279
/*     */     //   1222: aload #40
/*     */     //   1224: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1227: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   1230: astore #44
/*     */     //   1232: aload #44
/*     */     //   1234: instanceof li/cil/oc/common/item/UpgradeDatabase
/*     */     //   1237: ifeq -> 1279
/*     */     //   1240: iload_1
/*     */     //   1241: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1244: invokevirtual Database : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1247: invokeinterface id : ()I
/*     */     //   1252: if_icmpne -> 1279
/*     */     //   1255: new li/cil/oc/client/gui/Database
/*     */     //   1258: dup
/*     */     //   1259: aload_2
/*     */     //   1260: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   1263: new li/cil/oc/client/GuiHandler$$anon$3
/*     */     //   1266: dup
/*     */     //   1267: aload_2
/*     */     //   1268: invokespecial <init> : (Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   1271: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/inventory/DatabaseInventory;)V
/*     */     //   1274: astore #43
/*     */     //   1276: goto -> 2017
/*     */     //   1279: iload #39
/*     */     //   1281: ifeq -> 1353
/*     */     //   1284: aload #40
/*     */     //   1286: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1289: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   1292: astore #45
/*     */     //   1294: aload #45
/*     */     //   1296: instanceof li/cil/oc/common/item/Server
/*     */     //   1299: ifeq -> 1353
/*     */     //   1302: iload_1
/*     */     //   1303: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1306: invokevirtual Server : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1309: invokeinterface id : ()I
/*     */     //   1314: if_icmpne -> 1353
/*     */     //   1317: new li/cil/oc/client/gui/Server
/*     */     //   1320: dup
/*     */     //   1321: aload_2
/*     */     //   1322: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   1325: new li/cil/oc/client/GuiHandler$$anon$4
/*     */     //   1328: dup
/*     */     //   1329: aload_2
/*     */     //   1330: invokespecial <init> : (Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   1333: getstatic li/cil/oc/client/gui/Server$.MODULE$ : Lli/cil/oc/client/gui/Server$;
/*     */     //   1336: invokevirtual $lessinit$greater$default$3 : ()Lscala/Option;
/*     */     //   1339: getstatic li/cil/oc/client/gui/Server$.MODULE$ : Lli/cil/oc/client/gui/Server$;
/*     */     //   1342: invokevirtual $lessinit$greater$default$4 : ()I
/*     */     //   1345: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/inventory/ServerInventory;Lscala/Option;I)V
/*     */     //   1348: astore #43
/*     */     //   1350: goto -> 2017
/*     */     //   1353: iload #39
/*     */     //   1355: ifeq -> 1548
/*     */     //   1358: aload #40
/*     */     //   1360: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1363: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   1366: astore #46
/*     */     //   1368: aload #46
/*     */     //   1370: instanceof li/cil/oc/common/item/Tablet
/*     */     //   1373: ifeq -> 1548
/*     */     //   1376: iload_1
/*     */     //   1377: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1380: invokevirtual Tablet : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1383: invokeinterface id : ()I
/*     */     //   1388: if_icmpne -> 1548
/*     */     //   1391: aload_2
/*     */     //   1392: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   1395: astore #47
/*     */     //   1397: aload #47
/*     */     //   1399: invokevirtual func_77942_o : ()Z
/*     */     //   1402: ifeq -> 1542
/*     */     //   1405: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1408: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1411: getstatic li/cil/oc/common/item/Tablet$.MODULE$ : Lli/cil/oc/common/item/Tablet$;
/*     */     //   1414: aload #47
/*     */     //   1416: aload_2
/*     */     //   1417: invokevirtual get : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/common/item/TabletWrapper;
/*     */     //   1420: invokevirtual components : ()[Lscala/Option;
/*     */     //   1423: checkcast [Ljava/lang/Object;
/*     */     //   1426: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   1429: new li/cil/oc/client/GuiHandler$$anonfun$1
/*     */     //   1432: dup
/*     */     //   1433: invokespecial <init> : ()V
/*     */     //   1436: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1439: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   1442: ldc_w li/cil/oc/api/internal/TextBuffer
/*     */     //   1445: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   1448: invokevirtual canBuildFrom : (Lscala/reflect/ClassTag;)Lscala/collection/generic/CanBuildFrom;
/*     */     //   1451: invokeinterface collect : (Lscala/PartialFunction;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   1456: checkcast [Ljava/lang/Object;
/*     */     //   1459: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   1462: invokeinterface headOption : ()Lscala/Option;
/*     */     //   1467: astore #48
/*     */     //   1469: aload #48
/*     */     //   1471: instanceof scala/Some
/*     */     //   1474: ifeq -> 1534
/*     */     //   1477: aload #48
/*     */     //   1479: checkcast scala/Some
/*     */     //   1482: astore #49
/*     */     //   1484: aload #49
/*     */     //   1486: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1489: checkcast li/cil/oc/api/internal/TextBuffer
/*     */     //   1492: astore #50
/*     */     //   1494: aload #50
/*     */     //   1496: ifnull -> 1534
/*     */     //   1499: aload #50
/*     */     //   1501: astore #51
/*     */     //   1503: new li/cil/oc/client/gui/Screen
/*     */     //   1506: dup
/*     */     //   1507: aload #51
/*     */     //   1509: iconst_1
/*     */     //   1510: new li/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$3
/*     */     //   1513: dup
/*     */     //   1514: invokespecial <init> : ()V
/*     */     //   1517: new li/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$4
/*     */     //   1520: dup
/*     */     //   1521: aload #51
/*     */     //   1523: invokespecial <init> : (Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   1526: invokespecial <init> : (Lli/cil/oc/api/internal/TextBuffer;ZLscala/Function0;Lscala/Function0;)V
/*     */     //   1529: astore #52
/*     */     //   1531: goto -> 1537
/*     */     //   1534: aconst_null
/*     */     //   1535: astore #52
/*     */     //   1537: aload #52
/*     */     //   1539: goto -> 1543
/*     */     //   1542: aconst_null
/*     */     //   1543: astore #43
/*     */     //   1545: goto -> 2017
/*     */     //   1548: iload #39
/*     */     //   1550: ifeq -> 1629
/*     */     //   1553: aload #40
/*     */     //   1555: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1558: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   1561: astore #53
/*     */     //   1563: aload #53
/*     */     //   1565: instanceof li/cil/oc/common/item/Tablet
/*     */     //   1568: ifeq -> 1629
/*     */     //   1571: iload_1
/*     */     //   1572: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1575: invokevirtual TabletInner : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1578: invokeinterface id : ()I
/*     */     //   1583: if_icmpne -> 1629
/*     */     //   1586: aload_2
/*     */     //   1587: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   1590: astore #54
/*     */     //   1592: aload #54
/*     */     //   1594: invokevirtual func_77942_o : ()Z
/*     */     //   1597: ifeq -> 1623
/*     */     //   1600: new li/cil/oc/client/gui/Tablet
/*     */     //   1603: dup
/*     */     //   1604: aload_2
/*     */     //   1605: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   1608: getstatic li/cil/oc/common/item/Tablet$.MODULE$ : Lli/cil/oc/common/item/Tablet$;
/*     */     //   1611: aload #54
/*     */     //   1613: aload_2
/*     */     //   1614: invokevirtual get : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/common/item/TabletWrapper;
/*     */     //   1617: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/item/TabletWrapper;)V
/*     */     //   1620: goto -> 1624
/*     */     //   1623: aconst_null
/*     */     //   1624: astore #43
/*     */     //   1626: goto -> 2017
/*     */     //   1629: iload #39
/*     */     //   1631: ifeq -> 1684
/*     */     //   1634: aload #40
/*     */     //   1636: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1639: instanceof li/cil/oc/common/item/DiskDriveMountable
/*     */     //   1642: ifeq -> 1684
/*     */     //   1645: iload_1
/*     */     //   1646: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1649: invokevirtual DiskDriveMountable : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1652: invokeinterface id : ()I
/*     */     //   1657: if_icmpne -> 1684
/*     */     //   1660: new li/cil/oc/client/gui/DiskDrive
/*     */     //   1663: dup
/*     */     //   1664: aload_2
/*     */     //   1665: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   1668: new li/cil/oc/client/GuiHandler$$anon$5
/*     */     //   1671: dup
/*     */     //   1672: aload_2
/*     */     //   1673: invokespecial <init> : (Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   1676: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/inventory/IInventory;)V
/*     */     //   1679: astore #43
/*     */     //   1681: goto -> 2017
/*     */     //   1684: iload #39
/*     */     //   1686: ifeq -> 2014
/*     */     //   1689: aload #40
/*     */     //   1691: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1694: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   1697: astore #55
/*     */     //   1699: aload #55
/*     */     //   1701: instanceof li/cil/oc/common/item/Terminal
/*     */     //   1704: ifeq -> 2014
/*     */     //   1707: iload_1
/*     */     //   1708: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   1711: invokevirtual Terminal : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   1714: invokeinterface id : ()I
/*     */     //   1719: if_icmpne -> 2014
/*     */     //   1722: aload_2
/*     */     //   1723: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   1726: astore #56
/*     */     //   1728: aload #56
/*     */     //   1730: invokevirtual func_77942_o : ()Z
/*     */     //   1733: ifeq -> 2008
/*     */     //   1736: aload #56
/*     */     //   1738: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   1741: new scala/collection/mutable/StringBuilder
/*     */     //   1744: dup
/*     */     //   1745: invokespecial <init> : ()V
/*     */     //   1748: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   1751: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   1754: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1757: ldc_w 'server'
/*     */     //   1760: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1763: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1766: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1769: astore #57
/*     */     //   1771: aload #56
/*     */     //   1773: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   1776: new scala/collection/mutable/StringBuilder
/*     */     //   1779: dup
/*     */     //   1780: invokespecial <init> : ()V
/*     */     //   1783: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   1786: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   1789: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1792: ldc_w 'key'
/*     */     //   1795: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   1798: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1801: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1804: astore #58
/*     */     //   1806: aload #58
/*     */     //   1808: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
/*     */     //   1811: ifne -> 2008
/*     */     //   1814: aload #57
/*     */     //   1816: invokestatic isNullOrEmpty : (Ljava/lang/String;)Z
/*     */     //   1819: ifne -> 2008
/*     */     //   1822: getstatic li/cil/oc/common/component/TerminalServer$.MODULE$ : Lli/cil/oc/common/component/TerminalServer$;
/*     */     //   1825: invokevirtual loaded : ()Lli/cil/oc/common/component/TerminalServer$TerminalServerCache;
/*     */     //   1828: aload #57
/*     */     //   1830: invokevirtual find : (Ljava/lang/String;)Lscala/Option;
/*     */     //   1833: astore #59
/*     */     //   1835: aload #59
/*     */     //   1837: instanceof scala/Some
/*     */     //   1840: ifeq -> 1993
/*     */     //   1843: aload #59
/*     */     //   1845: checkcast scala/Some
/*     */     //   1848: astore #60
/*     */     //   1850: aload #60
/*     */     //   1852: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   1855: checkcast li/cil/oc/common/component/TerminalServer
/*     */     //   1858: astore #61
/*     */     //   1860: aload #61
/*     */     //   1862: invokevirtual rack : ()Lli/cil/oc/api/internal/Rack;
/*     */     //   1865: astore #63
/*     */     //   1867: aload #63
/*     */     //   1869: instanceof net/minecraft/tileentity/TileEntity
/*     */     //   1872: ifeq -> 1980
/*     */     //   1875: aload #63
/*     */     //   1877: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   1880: astore #64
/*     */     //   1882: aload_0
/*     */     //   1883: aload_2
/*     */     //   1884: aload #61
/*     */     //   1886: aload #64
/*     */     //   1888: invokevirtual li$cil$oc$client$GuiHandler$$inRange$1 : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/common/component/TerminalServer;Lnet/minecraft/tileentity/TileEntity;)Z
/*     */     //   1891: ifeq -> 1962
/*     */     //   1894: aload #61
/*     */     //   1896: invokevirtual sidedKeys : ()Lscala/collection/Seq;
/*     */     //   1899: aload #58
/*     */     //   1901: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   1906: ifeq -> 1946
/*     */     //   1909: new li/cil/oc/client/gui/Screen
/*     */     //   1912: dup
/*     */     //   1913: aload #61
/*     */     //   1915: invokevirtual buffer : ()Lli/cil/oc/api/internal/TextBuffer;
/*     */     //   1918: iconst_1
/*     */     //   1919: new li/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$5
/*     */     //   1922: dup
/*     */     //   1923: invokespecial <init> : ()V
/*     */     //   1926: new li/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$6
/*     */     //   1929: dup
/*     */     //   1930: aload_2
/*     */     //   1931: aload #56
/*     */     //   1933: aload #58
/*     */     //   1935: aload #61
/*     */     //   1937: aload #64
/*     */     //   1939: invokespecial <init> : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;Ljava/lang/String;Lli/cil/oc/common/component/TerminalServer;Lnet/minecraft/tileentity/TileEntity;)V
/*     */     //   1942: invokespecial <init> : (Lli/cil/oc/api/internal/TextBuffer;ZLscala/Function0;Lscala/Function0;)V
/*     */     //   1945: areturn
/*     */     //   1946: aload_2
/*     */     //   1947: getstatic li/cil/oc/Localization$Terminal$.MODULE$ : Lli/cil/oc/Localization$Terminal$;
/*     */     //   1950: invokevirtual InvalidKey : ()Lnet/minecraft/util/ChatComponentStyle;
/*     */     //   1953: invokevirtual func_145747_a : (Lnet/minecraft/util/IChatComponent;)V
/*     */     //   1956: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1959: goto -> 1975
/*     */     //   1962: aload_2
/*     */     //   1963: getstatic li/cil/oc/Localization$Terminal$.MODULE$ : Lli/cil/oc/Localization$Terminal$;
/*     */     //   1966: invokevirtual OutOfRange : ()Lnet/minecraft/util/ChatComponentStyle;
/*     */     //   1969: invokevirtual func_145747_a : (Lnet/minecraft/util/IChatComponent;)V
/*     */     //   1972: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1975: astore #65
/*     */     //   1977: goto -> 1985
/*     */     //   1980: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1983: astore #65
/*     */     //   1985: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1988: astore #62
/*     */     //   1990: goto -> 2008
/*     */     //   1993: aload_2
/*     */     //   1994: getstatic li/cil/oc/Localization$Terminal$.MODULE$ : Lli/cil/oc/Localization$Terminal$;
/*     */     //   1997: invokevirtual OutOfRange : ()Lnet/minecraft/util/ChatComponentStyle;
/*     */     //   2000: invokevirtual func_145747_a : (Lnet/minecraft/util/IChatComponent;)V
/*     */     //   2003: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2006: astore #62
/*     */     //   2008: aconst_null
/*     */     //   2009: astore #43
/*     */     //   2011: goto -> 2017
/*     */     //   2014: aconst_null
/*     */     //   2015: astore #43
/*     */     //   2017: aload #43
/*     */     //   2019: astore #12
/*     */     //   2021: goto -> 2104
/*     */     //   2024: iload #7
/*     */     //   2026: ifeq -> 2101
/*     */     //   2029: aload #8
/*     */     //   2031: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   2034: checkcast li/cil/oc/util/ScalaEnum$Value
/*     */     //   2037: astore #66
/*     */     //   2039: getstatic li/cil/oc/common/GuiType$Category$.MODULE$ : Lli/cil/oc/common/GuiType$Category$;
/*     */     //   2042: invokevirtual None : ()Lli/cil/oc/common/GuiType$Category$EnumVal;
/*     */     //   2045: aload #66
/*     */     //   2047: astore #67
/*     */     //   2049: dup
/*     */     //   2050: ifnonnull -> 2062
/*     */     //   2053: pop
/*     */     //   2054: aload #67
/*     */     //   2056: ifnull -> 2070
/*     */     //   2059: goto -> 2101
/*     */     //   2062: aload #67
/*     */     //   2064: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2067: ifeq -> 2101
/*     */     //   2070: iload_1
/*     */     //   2071: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   2074: invokevirtual Manual : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   2077: invokeinterface id : ()I
/*     */     //   2082: if_icmpne -> 2095
/*     */     //   2085: new li/cil/oc/client/gui/Manual
/*     */     //   2088: dup
/*     */     //   2089: invokespecial <init> : ()V
/*     */     //   2092: goto -> 2096
/*     */     //   2095: aconst_null
/*     */     //   2096: astore #12
/*     */     //   2098: goto -> 2104
/*     */     //   2101: aconst_null
/*     */     //   2102: astore #12
/*     */     //   2104: aload #12
/*     */     //   2106: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #19	-> 0
/*     */     //   #18	-> 6
/*     */     //   #19	-> 23
/*     */     //   #35	-> 82
/*     */     //   #20	-> 91
/*     */     //   #21	-> 109
/*     */     //   #22	-> 139
/*     */     //   #23	-> 157
/*     */     //   #24	-> 187
/*     */     //   #25	-> 205
/*     */     //   #26	-> 235
/*     */     //   #27	-> 253
/*     */     //   #28	-> 283
/*     */     //   #29	-> 301
/*     */     //   #30	-> 331
/*     */     //   #31	-> 349
/*     */     //   #32	-> 379
/*     */     //   #33	-> 397
/*     */     //   #34	-> 427
/*     */     //   #35	-> 445
/*     */     //   #36	-> 481
/*     */     //   #37	-> 505
/*     */     //   #38	-> 535
/*     */     //   #39	-> 553
/*     */     //   #40	-> 583
/*     */     //   #41	-> 601
/*     */     //   #42	-> 631
/*     */     //   #43	-> 652
/*     */     //   #44	-> 682
/*     */     //   #20	-> 734
/*     */     //   #45	-> 739
/*     */     //   #46	-> 754
/*     */     //   #47	-> 764
/*     */     //   #51	-> 783
/*     */     //   #47	-> 799
/*     */     //   #45	-> 802
/*     */     //   #20	-> 807
/*     */     //   #52	-> 812
/*     */     //   #53	-> 827
/*     */     //   #54	-> 837
/*     */     //   #52	-> 859
/*     */     //   #59	-> 864
/*     */     //   #60	-> 894
/*     */     //   #61	-> 912
/*     */     //   #62	-> 942
/*     */     //   #63	-> 956
/*     */     //   #20	-> 959
/*     */     //   #18	-> 966
/*     */     //   #65	-> 971
/*     */     //   #66	-> 1012
/*     */     //   #67	-> 1020
/*     */     //   #68	-> 1050
/*     */     //   #69	-> 1068
/*     */     //   #66	-> 1071
/*     */     //   #18	-> 1078
/*     */     //   #71	-> 1083
/*     */     //   #73	-> 1124
/*     */     //   #72	-> 1130
/*     */     //   #73	-> 1142
/*     */     //   #74	-> 1193
/*     */     //   #72	-> 1217
/*     */     //   #75	-> 1222
/*     */     //   #76	-> 1255
/*     */     //   #72	-> 1279
/*     */     //   #81	-> 1284
/*     */     //   #82	-> 1317
/*     */     //   #72	-> 1353
/*     */     //   #87	-> 1358
/*     */     //   #88	-> 1391
/*     */     //   #89	-> 1397
/*     */     //   #90	-> 1405
/*     */     //   #92	-> 1462
/*     */     //   #93	-> 1469
/*     */     //   #94	-> 1534
/*     */     //   #92	-> 1537
/*     */     //   #97	-> 1542
/*     */     //   #87	-> 1543
/*     */     //   #72	-> 1548
/*     */     //   #98	-> 1553
/*     */     //   #99	-> 1586
/*     */     //   #100	-> 1592
/*     */     //   #101	-> 1600
/*     */     //   #103	-> 1623
/*     */     //   #98	-> 1624
/*     */     //   #72	-> 1629
/*     */     //   #104	-> 1636
/*     */     //   #105	-> 1660
/*     */     //   #72	-> 1684
/*     */     //   #109	-> 1689
/*     */     //   #110	-> 1722
/*     */     //   #111	-> 1728
/*     */     //   #112	-> 1736
/*     */     //   #113	-> 1771
/*     */     //   #114	-> 1806
/*     */     //   #115	-> 1822
/*     */     //   #116	-> 1835
/*     */     //   #117	-> 1867
/*     */     //   #119	-> 1882
/*     */     //   #120	-> 1894
/*     */     //   #131	-> 1946
/*     */     //   #133	-> 1962
/*     */     //   #117	-> 1975
/*     */     //   #134	-> 1980
/*     */     //   #116	-> 1985
/*     */     //   #136	-> 1993
/*     */     //   #140	-> 2008
/*     */     //   #109	-> 2009
/*     */     //   #141	-> 2014
/*     */     //   #72	-> 2017
/*     */     //   #18	-> 2024
/*     */     //   #143	-> 2029
/*     */     //   #144	-> 2070
/*     */     //   #145	-> 2095
/*     */     //   #144	-> 2096
/*     */     //   #146	-> 2101
/*     */     //   #18	-> 2104
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	2107	0	this	Lli/cil/oc/client/GuiHandler$;
/*     */     //   0	2107	1	id	I
/*     */     //   0	2107	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	2107	3	world	Lnet/minecraft/world/World;
/*     */     //   0	2107	4	x	I
/*     */     //   0	2107	5	y	I
/*     */     //   0	2107	6	z	I
/*     */     //   764	38	28	slot	I
/*     */     //   837	22	29	slot	I
/*     */     //   1170	937	42	drive	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   1232	875	44	database	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   1294	813	45	server	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   1368	739	46	tablet	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   1397	710	47	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   1494	613	50	buffer	Lli/cil/oc/api/internal/TextBuffer;
/*     */     //   1563	544	53	tablet	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   1592	515	54	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   1699	408	55	terminal	Lli/cil/oc/common/item/traits/Delegate;
/*     */     //   1728	281	56	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   1771	336	57	address	Ljava/lang/String;
/*     */     //   1806	301	58	key	Ljava/lang/String;
/*     */     //   1860	247	61	term	Lli/cil/oc/common/component/TerminalServer;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class GuiHandler$$anonfun$getClientGuiElement$1
/*     */     extends AbstractFunction0.mcZ.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final Screen x13$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply() {
/*  44 */       return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return this.x13$1.origin().hasKeyboard(); } public GuiHandler$$anonfun$getClientGuiElement$1(Screen x13$1) {} } public final class GuiHandler$$anonfun$getClientGuiElement$2 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; private final Screen x13$1; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return this.x13$1.origin().buffer().isRenderingEnabled(); }
/*     */      public GuiHandler$$anonfun$getClientGuiElement$2(Screen x13$1) {} }
/*     */   public final class GuiHandler$$anon$1 implements ServerInventory { private final int slot$1; private final ObjectRef x9$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*  47 */     public int tier() { return ServerInventory.class.tier(this); } public int func_70302_i_() { return ServerInventory.class.getSizeInventory(this); } public String inventoryName() { return ServerInventory.class.inventoryName(this); } public int func_70297_j_() { return ServerInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return ServerInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$1(int slot$1, ObjectRef x9$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); ServerInventory.class.$init$(this); } public ItemStack container() {
/*  48 */       return ((Rack)this.x9$1.elem).func_70301_a(this.slot$1);
/*     */     } public boolean func_70300_a(EntityPlayer player) {
/*  50 */       return ((Rack)this.x9$1.elem).func_70300_a(player);
/*     */     } }
/*     */   public final class GuiHandler$$anon$2 implements DiskDriveMountableInventory { private final int slot$2; private final ObjectRef x9$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*     */     
/*  54 */     public int tier() { return DiskDriveMountableInventory.class.tier(this); } public int func_70302_i_() { return DiskDriveMountableInventory.class.getSizeInventory(this); } public String inventoryName() { return DiskDriveMountableInventory.class.inventoryName(this); } public int func_70297_j_() { return DiskDriveMountableInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DiskDriveMountableInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$2(int slot$2, ObjectRef x9$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DiskDriveMountableInventory.class.$init$(this); } public ItemStack container() {
/*  55 */       return ((Rack)this.x9$1.elem).func_70301_a(this.slot$2);
/*     */     } public boolean func_70300_a(EntityPlayer player) {
/*  57 */       return ((Rack)this.x9$1.elem).func_70300_a(player);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class GuiHandler$$anonfun$getClientGuiElement$7
/*     */     extends AbstractFunction0<ItemStack>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final EntityPlayer player$1;
/*     */ 
/*     */     
/*     */     public final ItemStack apply() {
/*  74 */       return this.player$1.func_70694_bm();
/*     */     } public GuiHandler$$anonfun$getClientGuiElement$7(EntityPlayer player$1) {} } public final class GuiHandler$$anon$3 implements DatabaseInventory { private final EntityPlayer player$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*  76 */     public int tier() { return DatabaseInventory.class.tier(this); } public int func_70302_i_() { return DatabaseInventory.class.getSizeInventory(this); } public String inventoryName() { return DatabaseInventory.class.inventoryName(this); } public int func_70297_j_() { return DatabaseInventory.class.getInventoryStackLimit(this); } public int getInventoryStackRequired() { return DatabaseInventory.class.getInventoryStackRequired(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DatabaseInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$3(EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DatabaseInventory.class.$init$(this); } public ItemStack container() {
/*  77 */       return this.player$1.func_70694_bm();
/*     */     }
/*  79 */     public boolean func_70300_a(EntityPlayer player) { EntityPlayer entityPlayer = player; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*     */       {  }
/*     */        } } public final class GuiHandler$$anon$4 implements ServerInventory { private final EntityPlayer player$1; private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0;
/*  82 */     public int tier() { return ServerInventory.class.tier(this); } public int func_70302_i_() { return ServerInventory.class.getSizeInventory(this); } public String inventoryName() { return ServerInventory.class.inventoryName(this); } public int func_70297_j_() { return ServerInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return ServerInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$4(EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); ServerInventory.class.$init$(this); } public ItemStack container() {
/*  83 */       return this.player$1.func_70694_bm();
/*     */     } public boolean func_70300_a(EntityPlayer player) {
/*  85 */       EntityPlayer entityPlayer = player; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*     */       {  }
/*     */     
/*     */     } }
/*     */   public final class GuiHandler$$anonfun$1 extends AbstractPartialFunction<Option<ManagedEnvironment>, TextBuffer> implements Serializable { public static final long serialVersionUID = 0L;
/*  90 */     public final <A1 extends Option<ManagedEnvironment>, B1> B1 applyOrElse(Option x1, Function1 default) { Option option = x1;
/*  91 */       if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer; return (B1)(textBuffer = (TextBuffer)buffer); }  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Option x1) { Option option = x1; if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer)
/*     */           return true;  }
/*  93 */        return false; } } public final class GuiHandler$$anonfun$getClientGuiElement$3 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } } public final class GuiHandler$$anonfun$getClientGuiElement$4 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; private final TextBuffer x3$1; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return this.x3$1.isRenderingEnabled(); }
/*     */ 
/*     */     
/*     */     public GuiHandler$$anonfun$getClientGuiElement$4(TextBuffer x3$1) {} }
/*     */ 
/*     */   
/*     */   public final class GuiHandler$$anon$5 implements DiskDriveMountableInventory {
/*     */     private final EntityPlayer player$1;
/*     */     private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory;
/*     */     private volatile boolean bitmap$0;
/*     */     
/*     */     public int tier() {
/* 105 */       return DiskDriveMountableInventory.class.tier(this); } public int func_70302_i_() { return DiskDriveMountableInventory.class.getSizeInventory(this); } public String inventoryName() { return DiskDriveMountableInventory.class.inventoryName(this); } public int func_70297_j_() { return DiskDriveMountableInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DiskDriveMountableInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$5(EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DiskDriveMountableInventory.class.$init$(this); }
/* 106 */     public ItemStack container() { return this.player$1.func_70694_bm(); } public boolean func_70300_a(EntityPlayer activePlayer) {
/* 107 */       EntityPlayer entityPlayer = this.player$1; if (activePlayer == null) { if (entityPlayer != null); } else if (activePlayer.equals(entityPlayer))
/*     */       {  }
/*     */     
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean li$cil$oc$client$GuiHandler$$inRange$1(EntityPlayer player$1, TerminalServer term$1, TileEntity x2$1) {
/* 118 */     return (player$1.func_70089_S() && !x2$1.func_145837_r() && x2$1.func_145835_a(player$1.field_70165_t, player$1.field_70163_u, player$1.field_70161_v) < term$1.range() * term$1.range());
/*     */   } public final class GuiHandler$$anonfun$getClientGuiElement$5 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L;
/* 120 */     public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return true; } } public final class GuiHandler$$anonfun$getClientGuiElement$6 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; private final ItemStack stack$1; private final String key$1; private final TerminalServer term$1; private final TileEntity x2$1; public final boolean apply() { return apply$mcZ$sp(); }
/*     */ 
/*     */     
/*     */     public GuiHandler$$anonfun$getClientGuiElement$6(EntityPlayer player$1, ItemStack stack$1, String key$1, TerminalServer term$1, TileEntity x2$1) {}
/*     */     
/*     */     public boolean apply$mcZ$sp() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield stack$1 : Lnet/minecraft/item/ItemStack;
/*     */       //   4: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   7: new scala/collection/mutable/StringBuilder
/*     */       //   10: dup
/*     */       //   11: invokespecial <init> : ()V
/*     */       //   14: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   17: invokevirtual namespace : ()Ljava/lang/String;
/*     */       //   20: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   23: ldc 'key'
/*     */       //   25: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */       //   28: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   31: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   34: aload_0
/*     */       //   35: getfield key$1 : Ljava/lang/String;
/*     */       //   38: astore_1
/*     */       //   39: dup
/*     */       //   40: ifnonnull -> 51
/*     */       //   43: pop
/*     */       //   44: aload_1
/*     */       //   45: ifnull -> 65
/*     */       //   48: goto -> 58
/*     */       //   51: aload_1
/*     */       //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   55: ifne -> 65
/*     */       //   58: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   61: aconst_null
/*     */       //   62: invokevirtual func_147108_a : (Lnet/minecraft/client/gui/GuiScreen;)V
/*     */       //   65: getstatic li/cil/oc/client/GuiHandler$.MODULE$ : Lli/cil/oc/client/GuiHandler$;
/*     */       //   68: aload_0
/*     */       //   69: getfield player$1 : Lnet/minecraft/entity/player/EntityPlayer;
/*     */       //   72: aload_0
/*     */       //   73: getfield term$1 : Lli/cil/oc/common/component/TerminalServer;
/*     */       //   76: aload_0
/*     */       //   77: getfield x2$1 : Lnet/minecraft/tileentity/TileEntity;
/*     */       //   80: invokevirtual li$cil$oc$client$GuiHandler$$inRange$1 : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/common/component/TerminalServer;Lnet/minecraft/tileentity/TileEntity;)Z
/*     */       //   83: ifne -> 93
/*     */       //   86: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   89: aconst_null
/*     */       //   90: invokevirtual func_147108_a : (Lnet/minecraft/client/gui/GuiScreen;)V
/*     */       //   93: iconst_1
/*     */       //   94: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #122	-> 0
/*     */       //   #123	-> 58
/*     */       //   #126	-> 65
/*     */       //   #127	-> 86
/*     */       //   #129	-> 93
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	95	0	this	Lli/cil/oc/client/GuiHandler$$anonfun$getClientGuiElement$6;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\GuiHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */