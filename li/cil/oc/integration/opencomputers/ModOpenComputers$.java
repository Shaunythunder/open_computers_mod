/*     */ package li.cil.oc.integration.opencomputers;
/*     */ 
/*     */ import li.cil.oc.api.IMC;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.driver.item.Chargeable;
/*     */ import li.cil.oc.api.internal.Wrench;
/*     */ import li.cil.oc.integration.Mod;
/*     */ import li.cil.oc.integration.ModProxy;
/*     */ import li.cil.oc.integration.Mods;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
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
/*     */ public final class ModOpenComputers$
/*     */   implements ModProxy
/*     */ {
/*     */   public static final ModOpenComputers$ MODULE$;
/*     */   
/*     */   private ModOpenComputers$() {
/*  52 */     MODULE$ = this; } public Mods.SimpleMod getMod() {
/*  53 */     return li.cil.oc.integration.Mods$.MODULE$.OpenComputers();
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
/*     */   public void initialize() {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/common/template/DroneTemplate$.MODULE$ : Lli/cil/oc/common/template/DroneTemplate$;
/*     */     //   3: invokevirtual register : ()V
/*     */     //   6: getstatic li/cil/oc/common/template/MicrocontrollerTemplate$.MODULE$ : Lli/cil/oc/common/template/MicrocontrollerTemplate$;
/*     */     //   9: invokevirtual register : ()V
/*     */     //   12: getstatic li/cil/oc/common/template/NavigationUpgradeTemplate$.MODULE$ : Lli/cil/oc/common/template/NavigationUpgradeTemplate$;
/*     */     //   15: invokevirtual register : ()V
/*     */     //   18: getstatic li/cil/oc/common/template/RobotTemplate$.MODULE$ : Lli/cil/oc/common/template/RobotTemplate$;
/*     */     //   21: invokevirtual register : ()V
/*     */     //   24: getstatic li/cil/oc/common/template/ServerTemplate$.MODULE$ : Lli/cil/oc/common/template/ServerTemplate$;
/*     */     //   27: invokevirtual register : ()V
/*     */     //   30: getstatic li/cil/oc/common/template/TabletTemplate$.MODULE$ : Lli/cil/oc/common/template/TabletTemplate$;
/*     */     //   33: invokevirtual register : ()V
/*     */     //   36: getstatic li/cil/oc/common/template/TemplateBlacklist$.MODULE$ : Lli/cil/oc/common/template/TemplateBlacklist$;
/*     */     //   39: invokevirtual register : ()V
/*     */     //   42: ldc 'li.cil.oc.integration.opencomputers.ModOpenComputers.useWrench'
/*     */     //   44: invokestatic registerWrenchTool : (Ljava/lang/String;)V
/*     */     //   47: ldc 'li.cil.oc.integration.opencomputers.ModOpenComputers.isWrench'
/*     */     //   49: invokestatic registerWrenchToolCheck : (Ljava/lang/String;)V
/*     */     //   52: ldc 'OpenComputers'
/*     */     //   54: ldc 'li.cil.oc.integration.opencomputers.ModOpenComputers.canCharge'
/*     */     //   56: ldc 'li.cil.oc.integration.opencomputers.ModOpenComputers.charge'
/*     */     //   58: invokestatic registerItemCharge : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   61: ldc 'li.cil.oc.integration.opencomputers.ModOpenComputers.inkCartridgeInkProvider'
/*     */     //   63: invokestatic registerInkProvider : (Ljava/lang/String;)V
/*     */     //   66: ldc 'li.cil.oc.integration.opencomputers.ModOpenComputers.dyeInkProvider'
/*     */     //   68: invokestatic registerInkProvider : (Ljava/lang/String;)V
/*     */     //   71: ldc 'build'
/*     */     //   73: ldc 'builder'
/*     */     //   75: iconst_3
/*     */     //   76: anewarray java/lang/String
/*     */     //   79: dup
/*     */     //   80: iconst_0
/*     */     //   81: ldc 'Lua 5.2'
/*     */     //   83: aastore
/*     */     //   84: dup
/*     */     //   85: iconst_1
/*     */     //   86: ldc 'Lua 5.3'
/*     */     //   88: aastore
/*     */     //   89: dup
/*     */     //   90: iconst_2
/*     */     //   91: ldc 'LuaJ'
/*     */     //   93: aastore
/*     */     //   94: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   97: ldc 'dig'
/*     */     //   99: ldc 'dig'
/*     */     //   101: iconst_3
/*     */     //   102: anewarray java/lang/String
/*     */     //   105: dup
/*     */     //   106: iconst_0
/*     */     //   107: ldc 'Lua 5.2'
/*     */     //   109: aastore
/*     */     //   110: dup
/*     */     //   111: iconst_1
/*     */     //   112: ldc 'Lua 5.3'
/*     */     //   114: aastore
/*     */     //   115: dup
/*     */     //   116: iconst_2
/*     */     //   117: ldc 'LuaJ'
/*     */     //   119: aastore
/*     */     //   120: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   123: ldc_w 'base64'
/*     */     //   126: ldc_w 'data'
/*     */     //   129: iconst_3
/*     */     //   130: anewarray java/lang/String
/*     */     //   133: dup
/*     */     //   134: iconst_0
/*     */     //   135: ldc 'Lua 5.2'
/*     */     //   137: aastore
/*     */     //   138: dup
/*     */     //   139: iconst_1
/*     */     //   140: ldc 'Lua 5.3'
/*     */     //   142: aastore
/*     */     //   143: dup
/*     */     //   144: iconst_2
/*     */     //   145: ldc 'LuaJ'
/*     */     //   147: aastore
/*     */     //   148: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   151: ldc_w 'deflate'
/*     */     //   154: ldc_w 'data'
/*     */     //   157: iconst_3
/*     */     //   158: anewarray java/lang/String
/*     */     //   161: dup
/*     */     //   162: iconst_0
/*     */     //   163: ldc 'Lua 5.2'
/*     */     //   165: aastore
/*     */     //   166: dup
/*     */     //   167: iconst_1
/*     */     //   168: ldc 'Lua 5.3'
/*     */     //   170: aastore
/*     */     //   171: dup
/*     */     //   172: iconst_2
/*     */     //   173: ldc 'LuaJ'
/*     */     //   175: aastore
/*     */     //   176: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   179: ldc_w 'gpg'
/*     */     //   182: ldc_w 'data'
/*     */     //   185: iconst_3
/*     */     //   186: anewarray java/lang/String
/*     */     //   189: dup
/*     */     //   190: iconst_0
/*     */     //   191: ldc 'Lua 5.2'
/*     */     //   193: aastore
/*     */     //   194: dup
/*     */     //   195: iconst_1
/*     */     //   196: ldc 'Lua 5.3'
/*     */     //   198: aastore
/*     */     //   199: dup
/*     */     //   200: iconst_2
/*     */     //   201: ldc 'LuaJ'
/*     */     //   203: aastore
/*     */     //   204: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   207: ldc_w 'inflate'
/*     */     //   210: ldc_w 'data'
/*     */     //   213: iconst_3
/*     */     //   214: anewarray java/lang/String
/*     */     //   217: dup
/*     */     //   218: iconst_0
/*     */     //   219: ldc 'Lua 5.2'
/*     */     //   221: aastore
/*     */     //   222: dup
/*     */     //   223: iconst_1
/*     */     //   224: ldc 'Lua 5.3'
/*     */     //   226: aastore
/*     */     //   227: dup
/*     */     //   228: iconst_2
/*     */     //   229: ldc 'LuaJ'
/*     */     //   231: aastore
/*     */     //   232: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   235: ldc_w 'md5sum'
/*     */     //   238: ldc_w 'data'
/*     */     //   241: iconst_3
/*     */     //   242: anewarray java/lang/String
/*     */     //   245: dup
/*     */     //   246: iconst_0
/*     */     //   247: ldc 'Lua 5.2'
/*     */     //   249: aastore
/*     */     //   250: dup
/*     */     //   251: iconst_1
/*     */     //   252: ldc 'Lua 5.3'
/*     */     //   254: aastore
/*     */     //   255: dup
/*     */     //   256: iconst_2
/*     */     //   257: ldc 'LuaJ'
/*     */     //   259: aastore
/*     */     //   260: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   263: ldc_w 'sha256sum'
/*     */     //   266: ldc_w 'data'
/*     */     //   269: iconst_3
/*     */     //   270: anewarray java/lang/String
/*     */     //   273: dup
/*     */     //   274: iconst_0
/*     */     //   275: ldc 'Lua 5.2'
/*     */     //   277: aastore
/*     */     //   278: dup
/*     */     //   279: iconst_1
/*     */     //   280: ldc 'Lua 5.3'
/*     */     //   282: aastore
/*     */     //   283: dup
/*     */     //   284: iconst_2
/*     */     //   285: ldc 'LuaJ'
/*     */     //   287: aastore
/*     */     //   288: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   291: ldc_w 'refuel'
/*     */     //   294: ldc_w 'generator'
/*     */     //   297: iconst_3
/*     */     //   298: anewarray java/lang/String
/*     */     //   301: dup
/*     */     //   302: iconst_0
/*     */     //   303: ldc 'Lua 5.2'
/*     */     //   305: aastore
/*     */     //   306: dup
/*     */     //   307: iconst_1
/*     */     //   308: ldc 'Lua 5.3'
/*     */     //   310: aastore
/*     */     //   311: dup
/*     */     //   312: iconst_2
/*     */     //   313: ldc 'LuaJ'
/*     */     //   315: aastore
/*     */     //   316: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   319: ldc_w 'irc'
/*     */     //   322: ldc_w 'irc'
/*     */     //   325: iconst_3
/*     */     //   326: anewarray java/lang/String
/*     */     //   329: dup
/*     */     //   330: iconst_0
/*     */     //   331: ldc 'Lua 5.2'
/*     */     //   333: aastore
/*     */     //   334: dup
/*     */     //   335: iconst_1
/*     */     //   336: ldc 'Lua 5.3'
/*     */     //   338: aastore
/*     */     //   339: dup
/*     */     //   340: iconst_2
/*     */     //   341: ldc 'LuaJ'
/*     */     //   343: aastore
/*     */     //   344: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   347: ldc_w 'maze'
/*     */     //   350: ldc_w 'maze'
/*     */     //   353: iconst_3
/*     */     //   354: anewarray java/lang/String
/*     */     //   357: dup
/*     */     //   358: iconst_0
/*     */     //   359: ldc 'Lua 5.2'
/*     */     //   361: aastore
/*     */     //   362: dup
/*     */     //   363: iconst_1
/*     */     //   364: ldc 'Lua 5.3'
/*     */     //   366: aastore
/*     */     //   367: dup
/*     */     //   368: iconst_2
/*     */     //   369: ldc 'LuaJ'
/*     */     //   371: aastore
/*     */     //   372: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   375: ldc_w 'arp'
/*     */     //   378: ldc_w 'network'
/*     */     //   381: iconst_3
/*     */     //   382: anewarray java/lang/String
/*     */     //   385: dup
/*     */     //   386: iconst_0
/*     */     //   387: ldc 'Lua 5.2'
/*     */     //   389: aastore
/*     */     //   390: dup
/*     */     //   391: iconst_1
/*     */     //   392: ldc 'Lua 5.3'
/*     */     //   394: aastore
/*     */     //   395: dup
/*     */     //   396: iconst_2
/*     */     //   397: ldc 'LuaJ'
/*     */     //   399: aastore
/*     */     //   400: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   403: ldc_w 'ifconfig'
/*     */     //   406: ldc_w 'network'
/*     */     //   409: iconst_3
/*     */     //   410: anewarray java/lang/String
/*     */     //   413: dup
/*     */     //   414: iconst_0
/*     */     //   415: ldc 'Lua 5.2'
/*     */     //   417: aastore
/*     */     //   418: dup
/*     */     //   419: iconst_1
/*     */     //   420: ldc 'Lua 5.3'
/*     */     //   422: aastore
/*     */     //   423: dup
/*     */     //   424: iconst_2
/*     */     //   425: ldc 'LuaJ'
/*     */     //   427: aastore
/*     */     //   428: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   431: ldc_w 'ping'
/*     */     //   434: ldc_w 'network'
/*     */     //   437: iconst_3
/*     */     //   438: anewarray java/lang/String
/*     */     //   441: dup
/*     */     //   442: iconst_0
/*     */     //   443: ldc 'Lua 5.2'
/*     */     //   445: aastore
/*     */     //   446: dup
/*     */     //   447: iconst_1
/*     */     //   448: ldc 'Lua 5.3'
/*     */     //   450: aastore
/*     */     //   451: dup
/*     */     //   452: iconst_2
/*     */     //   453: ldc 'LuaJ'
/*     */     //   455: aastore
/*     */     //   456: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   459: ldc_w 'route'
/*     */     //   462: ldc_w 'network'
/*     */     //   465: iconst_3
/*     */     //   466: anewarray java/lang/String
/*     */     //   469: dup
/*     */     //   470: iconst_0
/*     */     //   471: ldc 'Lua 5.2'
/*     */     //   473: aastore
/*     */     //   474: dup
/*     */     //   475: iconst_1
/*     */     //   476: ldc 'Lua 5.3'
/*     */     //   478: aastore
/*     */     //   479: dup
/*     */     //   480: iconst_2
/*     */     //   481: ldc 'LuaJ'
/*     */     //   483: aastore
/*     */     //   484: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   487: ldc_w 'opl-flash'
/*     */     //   490: ldc_w 'openloader'
/*     */     //   493: iconst_3
/*     */     //   494: anewarray java/lang/String
/*     */     //   497: dup
/*     */     //   498: iconst_0
/*     */     //   499: ldc 'Lua 5.2'
/*     */     //   501: aastore
/*     */     //   502: dup
/*     */     //   503: iconst_1
/*     */     //   504: ldc 'Lua 5.3'
/*     */     //   506: aastore
/*     */     //   507: dup
/*     */     //   508: iconst_2
/*     */     //   509: ldc 'LuaJ'
/*     */     //   511: aastore
/*     */     //   512: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   515: ldc_w 'oppm'
/*     */     //   518: ldc_w 'oppm'
/*     */     //   521: iconst_3
/*     */     //   522: anewarray java/lang/String
/*     */     //   525: dup
/*     */     //   526: iconst_0
/*     */     //   527: ldc 'Lua 5.2'
/*     */     //   529: aastore
/*     */     //   530: dup
/*     */     //   531: iconst_1
/*     */     //   532: ldc 'Lua 5.3'
/*     */     //   534: aastore
/*     */     //   535: dup
/*     */     //   536: iconst_2
/*     */     //   537: ldc 'LuaJ'
/*     */     //   539: aastore
/*     */     //   540: invokestatic registerProgramDiskLabel : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   543: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   546: getstatic li/cil/oc/common/event/ChunkloaderUpgradeHandler$.MODULE$ : Lli/cil/oc/common/event/ChunkloaderUpgradeHandler$;
/*     */     //   549: invokestatic setForcedChunkLoadingCallback : (Ljava/lang/Object;Lnet/minecraftforge/common/ForgeChunkManager$LoadingCallback;)V
/*     */     //   552: invokestatic instance : ()Lcpw/mods/fml/common/FMLCommonHandler;
/*     */     //   555: invokevirtual bus : ()Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   558: getstatic li/cil/oc/common/EventHandler$.MODULE$ : Lli/cil/oc/common/EventHandler$;
/*     */     //   561: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   564: invokestatic instance : ()Lcpw/mods/fml/common/FMLCommonHandler;
/*     */     //   567: invokevirtual bus : ()Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   570: getstatic li/cil/oc/common/event/NanomachinesHandler$Common$.MODULE$ : Lli/cil/oc/common/event/NanomachinesHandler$Common$;
/*     */     //   573: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   576: invokestatic instance : ()Lcpw/mods/fml/common/FMLCommonHandler;
/*     */     //   579: invokevirtual bus : ()Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   582: getstatic li/cil/oc/common/asm/SimpleComponentTickHandler.Instance : Lli/cil/oc/common/asm/SimpleComponentTickHandler;
/*     */     //   585: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   588: invokestatic instance : ()Lcpw/mods/fml/common/FMLCommonHandler;
/*     */     //   591: invokevirtual bus : ()Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   594: getstatic li/cil/oc/common/item/Tablet$.MODULE$ : Lli/cil/oc/common/item/Tablet$;
/*     */     //   597: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   600: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   603: getstatic li/cil/oc/common/item/Analyzer$.MODULE$ : Lli/cil/oc/common/item/Analyzer$;
/*     */     //   606: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   609: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   612: getstatic li/cil/oc/common/event/AngelUpgradeHandler$.MODULE$ : Lli/cil/oc/common/event/AngelUpgradeHandler$;
/*     */     //   615: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   618: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   621: getstatic li/cil/oc/common/event/BlockChangeHandler$.MODULE$ : Lli/cil/oc/common/event/BlockChangeHandler$;
/*     */     //   624: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   627: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   630: getstatic li/cil/oc/common/event/ChunkloaderUpgradeHandler$.MODULE$ : Lli/cil/oc/common/event/ChunkloaderUpgradeHandler$;
/*     */     //   633: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   636: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   639: getstatic li/cil/oc/common/EventHandler$.MODULE$ : Lli/cil/oc/common/EventHandler$;
/*     */     //   642: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   645: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   648: getstatic li/cil/oc/common/event/ExperienceUpgradeHandler$.MODULE$ : Lli/cil/oc/common/event/ExperienceUpgradeHandler$;
/*     */     //   651: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   654: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   657: getstatic li/cil/oc/common/event/FileSystemAccessHandler$.MODULE$ : Lli/cil/oc/common/event/FileSystemAccessHandler$;
/*     */     //   660: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   663: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   666: getstatic li/cil/oc/common/event/HoverBootsHandler$.MODULE$ : Lli/cil/oc/common/event/HoverBootsHandler$;
/*     */     //   669: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   672: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   675: getstatic li/cil/oc/common/Loot$.MODULE$ : Lli/cil/oc/common/Loot$;
/*     */     //   678: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   681: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   684: getstatic li/cil/oc/common/event/NanomachinesHandler$Common$.MODULE$ : Lli/cil/oc/common/event/NanomachinesHandler$Common$;
/*     */     //   687: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   690: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   693: getstatic li/cil/oc/common/event/NetworkActivityHandler$.MODULE$ : Lli/cil/oc/common/event/NetworkActivityHandler$;
/*     */     //   696: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   699: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   702: getstatic li/cil/oc/common/event/RobotCommonHandler$.MODULE$ : Lli/cil/oc/common/event/RobotCommonHandler$;
/*     */     //   705: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   708: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   711: getstatic li/cil/oc/common/SaveHandler$.MODULE$ : Lli/cil/oc/common/SaveHandler$;
/*     */     //   714: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   717: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   720: getstatic li/cil/oc/common/item/Tablet$.MODULE$ : Lli/cil/oc/common/item/Tablet$;
/*     */     //   723: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   726: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   729: getstatic li/cil/oc/server/network/Waypoints$.MODULE$ : Lli/cil/oc/server/network/Waypoints$;
/*     */     //   732: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   735: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   738: getstatic li/cil/oc/server/network/WirelessNetwork$.MODULE$ : Lli/cil/oc/server/network/WirelessNetwork$;
/*     */     //   741: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   744: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   747: getstatic li/cil/oc/common/event/WirelessNetworkCardHandler$.MODULE$ : Lli/cil/oc/common/event/WirelessNetworkCardHandler$;
/*     */     //   750: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   753: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   756: getstatic li/cil/oc/client/ComponentTracker$.MODULE$ : Lli/cil/oc/client/ComponentTracker$;
/*     */     //   759: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   762: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   765: getstatic li/cil/oc/server/ComponentTracker$.MODULE$ : Lli/cil/oc/server/ComponentTracker$;
/*     */     //   768: invokevirtual register : (Ljava/lang/Object;)V
/*     */     //   771: getstatic li/cil/oc/integration/opencomputers/ConverterNanomachines$.MODULE$ : Lli/cil/oc/integration/opencomputers/ConverterNanomachines$;
/*     */     //   774: invokestatic add : (Lli/cil/oc/api/driver/Converter;)V
/*     */     //   777: getstatic li/cil/oc/integration/opencomputers/ConverterLinkedCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/ConverterLinkedCard$;
/*     */     //   780: invokestatic add : (Lli/cil/oc/api/driver/Converter;)V
/*     */     //   783: getstatic li/cil/oc/integration/opencomputers/DriverAPU$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverAPU$;
/*     */     //   786: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   789: getstatic li/cil/oc/integration/opencomputers/DriverComponentBus$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverComponentBus$;
/*     */     //   792: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   795: getstatic li/cil/oc/integration/opencomputers/DriverCPU$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverCPU$;
/*     */     //   798: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   801: getstatic li/cil/oc/integration/opencomputers/DriverDataCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverDataCard$;
/*     */     //   804: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   807: getstatic li/cil/oc/integration/opencomputers/DriverDebugCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverDebugCard$;
/*     */     //   810: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   813: getstatic li/cil/oc/integration/opencomputers/DriverEEPROM$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverEEPROM$;
/*     */     //   816: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   819: getstatic li/cil/oc/integration/opencomputers/DriverFileSystem$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverFileSystem$;
/*     */     //   822: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   825: getstatic li/cil/oc/integration/opencomputers/DriverGraphicsCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverGraphicsCard$;
/*     */     //   828: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   831: getstatic li/cil/oc/integration/opencomputers/DriverInternetCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverInternetCard$;
/*     */     //   834: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   837: getstatic li/cil/oc/integration/opencomputers/DriverLinkedCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverLinkedCard$;
/*     */     //   840: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   843: getstatic li/cil/oc/integration/opencomputers/DriverLootDisk$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverLootDisk$;
/*     */     //   846: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   849: getstatic li/cil/oc/integration/opencomputers/DriverMemory$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverMemory$;
/*     */     //   852: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   855: getstatic li/cil/oc/integration/opencomputers/DriverNetworkCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverNetworkCard$;
/*     */     //   858: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   861: getstatic li/cil/oc/integration/opencomputers/DriverKeyboard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverKeyboard$;
/*     */     //   864: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   867: getstatic li/cil/oc/integration/opencomputers/DriverRedstoneCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverRedstoneCard$;
/*     */     //   870: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   873: getstatic li/cil/oc/integration/opencomputers/DriverTablet$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverTablet$;
/*     */     //   876: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   879: getstatic li/cil/oc/integration/opencomputers/DriverWirelessNetworkCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverWirelessNetworkCard$;
/*     */     //   882: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   885: getstatic li/cil/oc/integration/opencomputers/DriverTpsCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverTpsCard$;
/*     */     //   888: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   891: getstatic li/cil/oc/integration/opencomputers/DriverContainerCard$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverContainerCard$;
/*     */     //   894: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   897: getstatic li/cil/oc/integration/opencomputers/DriverContainerFloppy$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverContainerFloppy$;
/*     */     //   900: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   903: getstatic li/cil/oc/integration/opencomputers/DriverContainerUpgrade$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverContainerUpgrade$;
/*     */     //   906: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   909: getstatic li/cil/oc/integration/opencomputers/DriverGeolyzer$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverGeolyzer$;
/*     */     //   912: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   915: getstatic li/cil/oc/integration/opencomputers/DriverMotionSensor$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverMotionSensor$;
/*     */     //   918: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   921: getstatic li/cil/oc/integration/opencomputers/DriverScreen$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverScreen$;
/*     */     //   924: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   927: getstatic li/cil/oc/integration/opencomputers/DriverTransposer$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverTransposer$;
/*     */     //   930: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   933: getstatic li/cil/oc/integration/opencomputers/DriverDiskDriveMountable$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverDiskDriveMountable$;
/*     */     //   936: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   939: getstatic li/cil/oc/integration/opencomputers/DriverServer$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverServer$;
/*     */     //   942: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   945: getstatic li/cil/oc/integration/opencomputers/DriverTerminalServer$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverTerminalServer$;
/*     */     //   948: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   951: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeAngel$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeAngel$;
/*     */     //   954: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   957: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeBarcodeReader$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeBarcodeReader$;
/*     */     //   960: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   963: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeBattery$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeBattery$;
/*     */     //   966: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   969: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeChunkloader$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeChunkloader$;
/*     */     //   972: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   975: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeCrafting$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeCrafting$;
/*     */     //   978: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   981: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeDatabase$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeDatabase$;
/*     */     //   984: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   987: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeExperience$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeExperience$;
/*     */     //   990: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   993: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeGenerator$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeGenerator$;
/*     */     //   996: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   999: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeHover$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeHover$;
/*     */     //   1002: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1005: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeInventory$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeInventory$;
/*     */     //   1008: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1011: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeInventoryController$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeInventoryController$;
/*     */     //   1014: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1017: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeLeash$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeLeash$;
/*     */     //   1020: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1023: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeNavigation$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeNavigation$;
/*     */     //   1026: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1029: getstatic li/cil/oc/integration/opencomputers/DriverUpgradePiston$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradePiston$;
/*     */     //   1032: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1035: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeRITEG$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeRITEG$;
/*     */     //   1038: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1041: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeSign$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeSign$;
/*     */     //   1044: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1047: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeSolarGenerator$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeSolarGenerator$;
/*     */     //   1050: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1053: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeTank$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeTank$;
/*     */     //   1056: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1059: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeTankController$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeTankController$;
/*     */     //   1062: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1065: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeTractorBeam$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeTractorBeam$;
/*     */     //   1068: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1071: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeTrading$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeTrading$;
/*     */     //   1074: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1077: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeMF$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeMF$;
/*     */     //   1080: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1083: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeConfigurator$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeConfigurator$;
/*     */     //   1086: invokestatic add : (Lli/cil/oc/api/driver/Item;)V
/*     */     //   1089: getstatic li/cil/oc/integration/opencomputers/DriverAPU$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverAPU$Provider$;
/*     */     //   1092: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1095: getstatic li/cil/oc/integration/opencomputers/DriverDataCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverDataCard$Provider$;
/*     */     //   1098: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1101: getstatic li/cil/oc/integration/opencomputers/DriverDebugCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverDebugCard$Provider$;
/*     */     //   1104: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1107: getstatic li/cil/oc/integration/opencomputers/DriverEEPROM$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverEEPROM$Provider$;
/*     */     //   1110: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1113: getstatic li/cil/oc/integration/opencomputers/DriverGraphicsCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverGraphicsCard$Provider$;
/*     */     //   1116: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1119: getstatic li/cil/oc/integration/opencomputers/DriverInternetCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverInternetCard$Provider$;
/*     */     //   1122: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1125: getstatic li/cil/oc/integration/opencomputers/DriverLinkedCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverLinkedCard$Provider$;
/*     */     //   1128: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1131: getstatic li/cil/oc/integration/opencomputers/DriverNetworkCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverNetworkCard$Provider$;
/*     */     //   1134: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1137: getstatic li/cil/oc/integration/opencomputers/DriverRedstoneCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverRedstoneCard$Provider$;
/*     */     //   1140: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1143: getstatic li/cil/oc/integration/opencomputers/DriverWirelessNetworkCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverWirelessNetworkCard$Provider$;
/*     */     //   1146: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1149: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeDatabase$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeDatabase$Provider$;
/*     */     //   1152: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1155: getstatic li/cil/oc/integration/opencomputers/DriverTpsCard$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverTpsCard$Provider$;
/*     */     //   1158: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1161: getstatic li/cil/oc/integration/opencomputers/DriverGeolyzer$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverGeolyzer$Provider$;
/*     */     //   1164: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1167: getstatic li/cil/oc/integration/opencomputers/DriverMotionSensor$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverMotionSensor$Provider$;
/*     */     //   1170: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1173: getstatic li/cil/oc/integration/opencomputers/DriverScreen$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverScreen$Provider$;
/*     */     //   1176: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1179: getstatic li/cil/oc/integration/opencomputers/DriverTransposer$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverTransposer$Provider$;
/*     */     //   1182: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1185: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeChunkloader$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeChunkloader$Provider$;
/*     */     //   1188: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1191: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeCrafting$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeCrafting$Provider$;
/*     */     //   1194: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1197: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeDatabase$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeDatabase$Provider$;
/*     */     //   1200: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1203: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeExperience$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeExperience$Provider$;
/*     */     //   1206: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1209: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeGenerator$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeGenerator$Provider$;
/*     */     //   1212: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1215: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeInventoryController$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeInventoryController$Provider$;
/*     */     //   1218: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1221: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeLeash$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeLeash$Provider$;
/*     */     //   1224: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1227: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeNavigation$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeNavigation$Provider$;
/*     */     //   1230: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1233: getstatic li/cil/oc/integration/opencomputers/DriverUpgradePiston$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradePiston$Provider$;
/*     */     //   1236: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1239: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeSign$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeSign$Provider$;
/*     */     //   1242: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1245: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeTankController$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeTankController$Provider$;
/*     */     //   1248: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1251: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeTractorBeam$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeTractorBeam$Provider$;
/*     */     //   1254: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1257: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeMF$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeMF$Provider$;
/*     */     //   1260: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1263: getstatic li/cil/oc/integration/opencomputers/EnvironmentProviderBlocks$.MODULE$ : Lli/cil/oc/integration/opencomputers/EnvironmentProviderBlocks$;
/*     */     //   1266: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1269: getstatic li/cil/oc/integration/opencomputers/InventoryProviderDatabase$.MODULE$ : Lli/cil/oc/integration/opencomputers/InventoryProviderDatabase$;
/*     */     //   1272: invokestatic add : (Lli/cil/oc/api/driver/InventoryProvider;)V
/*     */     //   1275: getstatic li/cil/oc/integration/opencomputers/InventoryProviderServer$.MODULE$ : Lli/cil/oc/integration/opencomputers/InventoryProviderServer$;
/*     */     //   1278: invokestatic add : (Lli/cil/oc/api/driver/InventoryProvider;)V
/*     */     //   1281: getstatic li/cil/oc/integration/opencomputers/DriverUpgradeConfigurator$Provider$.MODULE$ : Lli/cil/oc/integration/opencomputers/DriverUpgradeConfigurator$Provider$;
/*     */     //   1284: invokestatic add : (Lli/cil/oc/api/driver/EnvironmentProvider;)V
/*     */     //   1287: aload_0
/*     */     //   1288: ldc_w li/cil/oc/api/internal/Adapter
/*     */     //   1291: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1294: bipush #30
/*     */     //   1296: anewarray java/lang/String
/*     */     //   1299: dup
/*     */     //   1300: iconst_0
/*     */     //   1301: ldc_w 'geolyzer'
/*     */     //   1304: aastore
/*     */     //   1305: dup
/*     */     //   1306: iconst_1
/*     */     //   1307: ldc_w 'motionSensor'
/*     */     //   1310: aastore
/*     */     //   1311: dup
/*     */     //   1312: iconst_2
/*     */     //   1313: ldc_w 'keyboard'
/*     */     //   1316: aastore
/*     */     //   1317: dup
/*     */     //   1318: iconst_3
/*     */     //   1319: ldc_w 'screen1'
/*     */     //   1322: aastore
/*     */     //   1323: dup
/*     */     //   1324: iconst_4
/*     */     //   1325: ldc_w 'transposer'
/*     */     //   1328: aastore
/*     */     //   1329: dup
/*     */     //   1330: iconst_5
/*     */     //   1331: ldc_w 'carpetedCapacitor'
/*     */     //   1334: aastore
/*     */     //   1335: dup
/*     */     //   1336: bipush #6
/*     */     //   1338: ldc_w 'analyzer'
/*     */     //   1341: aastore
/*     */     //   1342: dup
/*     */     //   1343: bipush #7
/*     */     //   1345: ldc_w 'angelUpgrade'
/*     */     //   1348: aastore
/*     */     //   1349: dup
/*     */     //   1350: bipush #8
/*     */     //   1352: ldc_w 'batteryUpgrade1'
/*     */     //   1355: aastore
/*     */     //   1356: dup
/*     */     //   1357: bipush #9
/*     */     //   1359: ldc_w 'batteryUpgrade2'
/*     */     //   1362: aastore
/*     */     //   1363: dup
/*     */     //   1364: bipush #10
/*     */     //   1366: ldc_w 'batteryUpgrade3'
/*     */     //   1369: aastore
/*     */     //   1370: dup
/*     */     //   1371: bipush #11
/*     */     //   1373: ldc_w 'chunkloaderUpgrade'
/*     */     //   1376: aastore
/*     */     //   1377: dup
/*     */     //   1378: bipush #12
/*     */     //   1380: ldc_w 'craftingUpgrade'
/*     */     //   1383: aastore
/*     */     //   1384: dup
/*     */     //   1385: bipush #13
/*     */     //   1387: ldc_w 'experienceUpgrade'
/*     */     //   1390: aastore
/*     */     //   1391: dup
/*     */     //   1392: bipush #14
/*     */     //   1394: ldc_w 'generatorUpgrade'
/*     */     //   1397: aastore
/*     */     //   1398: dup
/*     */     //   1399: bipush #15
/*     */     //   1401: ldc_w 'hoverUpgrade1'
/*     */     //   1404: aastore
/*     */     //   1405: dup
/*     */     //   1406: bipush #16
/*     */     //   1408: ldc_w 'hoverUpgrade2'
/*     */     //   1411: aastore
/*     */     //   1412: dup
/*     */     //   1413: bipush #17
/*     */     //   1415: ldc_w 'inventoryUpgrade'
/*     */     //   1418: aastore
/*     */     //   1419: dup
/*     */     //   1420: bipush #18
/*     */     //   1422: ldc_w 'navigationUpgrade'
/*     */     //   1425: aastore
/*     */     //   1426: dup
/*     */     //   1427: bipush #19
/*     */     //   1429: ldc_w 'pistonUpgrade'
/*     */     //   1432: aastore
/*     */     //   1433: dup
/*     */     //   1434: bipush #20
/*     */     //   1436: ldc_w 'solarGeneratorUpgrade'
/*     */     //   1439: aastore
/*     */     //   1440: dup
/*     */     //   1441: bipush #21
/*     */     //   1443: ldc_w 'tankUpgrade'
/*     */     //   1446: aastore
/*     */     //   1447: dup
/*     */     //   1448: bipush #22
/*     */     //   1450: ldc_w 'tractorBeamUpgrade'
/*     */     //   1453: aastore
/*     */     //   1454: dup
/*     */     //   1455: bipush #23
/*     */     //   1457: ldc_w 'leashUpgrade'
/*     */     //   1460: aastore
/*     */     //   1461: dup
/*     */     //   1462: bipush #24
/*     */     //   1464: ldc_w 'tradingUpgrade'
/*     */     //   1467: aastore
/*     */     //   1468: dup
/*     */     //   1469: bipush #25
/*     */     //   1471: ldc_w 'beekeeperUpgrade'
/*     */     //   1474: aastore
/*     */     //   1475: dup
/*     */     //   1476: bipush #26
/*     */     //   1478: ldc_w 'ritegUpgrade'
/*     */     //   1481: aastore
/*     */     //   1482: dup
/*     */     //   1483: bipush #27
/*     */     //   1485: ldc_w 'me_upgrade1'
/*     */     //   1488: aastore
/*     */     //   1489: dup
/*     */     //   1490: bipush #28
/*     */     //   1492: ldc_w 'me_upgrade2'
/*     */     //   1495: aastore
/*     */     //   1496: dup
/*     */     //   1497: bipush #29
/*     */     //   1499: ldc_w 'me_upgrade3'
/*     */     //   1502: aastore
/*     */     //   1503: checkcast [Ljava/lang/Object;
/*     */     //   1506: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1509: invokespecial blacklistHost : (Ljava/lang/Class;Lscala/collection/Seq;)V
/*     */     //   1512: aload_0
/*     */     //   1513: ldc_w li/cil/oc/api/internal/Drone
/*     */     //   1516: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1519: bipush #18
/*     */     //   1521: anewarray java/lang/String
/*     */     //   1524: dup
/*     */     //   1525: iconst_0
/*     */     //   1526: ldc_w 'keyboard'
/*     */     //   1529: aastore
/*     */     //   1530: dup
/*     */     //   1531: iconst_1
/*     */     //   1532: ldc_w 'screen1'
/*     */     //   1535: aastore
/*     */     //   1536: dup
/*     */     //   1537: iconst_2
/*     */     //   1538: ldc_w 'transposer'
/*     */     //   1541: aastore
/*     */     //   1542: dup
/*     */     //   1543: iconst_3
/*     */     //   1544: ldc_w 'carpetedCapacitor'
/*     */     //   1547: aastore
/*     */     //   1548: dup
/*     */     //   1549: iconst_4
/*     */     //   1550: ldc_w 'analyzer'
/*     */     //   1553: aastore
/*     */     //   1554: dup
/*     */     //   1555: iconst_5
/*     */     //   1556: ldc_w 'apu1'
/*     */     //   1559: aastore
/*     */     //   1560: dup
/*     */     //   1561: bipush #6
/*     */     //   1563: ldc_w 'apu2'
/*     */     //   1566: aastore
/*     */     //   1567: dup
/*     */     //   1568: bipush #7
/*     */     //   1570: ldc_w 'graphicsCard1'
/*     */     //   1573: aastore
/*     */     //   1574: dup
/*     */     //   1575: bipush #8
/*     */     //   1577: ldc_w 'graphicsCard2'
/*     */     //   1580: aastore
/*     */     //   1581: dup
/*     */     //   1582: bipush #9
/*     */     //   1584: ldc_w 'graphicsCard3'
/*     */     //   1587: aastore
/*     */     //   1588: dup
/*     */     //   1589: bipush #10
/*     */     //   1591: ldc_w 'lanCard'
/*     */     //   1594: aastore
/*     */     //   1595: dup
/*     */     //   1596: bipush #11
/*     */     //   1598: ldc_w 'redstoneCard1'
/*     */     //   1601: aastore
/*     */     //   1602: dup
/*     */     //   1603: bipush #12
/*     */     //   1605: ldc_w 'angelUpgrade'
/*     */     //   1608: aastore
/*     */     //   1609: dup
/*     */     //   1610: bipush #13
/*     */     //   1612: ldc_w 'craftingUpgrade'
/*     */     //   1615: aastore
/*     */     //   1616: dup
/*     */     //   1617: bipush #14
/*     */     //   1619: ldc_w 'hoverUpgrade1'
/*     */     //   1622: aastore
/*     */     //   1623: dup
/*     */     //   1624: bipush #15
/*     */     //   1626: ldc_w 'hoverUpgrade2'
/*     */     //   1629: aastore
/*     */     //   1630: dup
/*     */     //   1631: bipush #16
/*     */     //   1633: ldc_w 'beekeeperUpgrade'
/*     */     //   1636: aastore
/*     */     //   1637: dup
/*     */     //   1638: bipush #17
/*     */     //   1640: ldc_w 'ritegUpgrade'
/*     */     //   1643: aastore
/*     */     //   1644: checkcast [Ljava/lang/Object;
/*     */     //   1647: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1650: invokespecial blacklistHost : (Ljava/lang/Class;Lscala/collection/Seq;)V
/*     */     //   1653: aload_0
/*     */     //   1654: ldc_w li/cil/oc/api/internal/Microcontroller
/*     */     //   1657: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1660: bipush #30
/*     */     //   1662: anewarray java/lang/String
/*     */     //   1665: dup
/*     */     //   1666: iconst_0
/*     */     //   1667: ldc_w 'keyboard'
/*     */     //   1670: aastore
/*     */     //   1671: dup
/*     */     //   1672: iconst_1
/*     */     //   1673: ldc_w 'screen1'
/*     */     //   1676: aastore
/*     */     //   1677: dup
/*     */     //   1678: iconst_2
/*     */     //   1679: ldc_w 'carpetedCapacitor'
/*     */     //   1682: aastore
/*     */     //   1683: dup
/*     */     //   1684: iconst_3
/*     */     //   1685: ldc_w 'analyzer'
/*     */     //   1688: aastore
/*     */     //   1689: dup
/*     */     //   1690: iconst_4
/*     */     //   1691: ldc_w 'apu1'
/*     */     //   1694: aastore
/*     */     //   1695: dup
/*     */     //   1696: iconst_5
/*     */     //   1697: ldc_w 'apu2'
/*     */     //   1700: aastore
/*     */     //   1701: dup
/*     */     //   1702: bipush #6
/*     */     //   1704: ldc_w 'graphicsCard1'
/*     */     //   1707: aastore
/*     */     //   1708: dup
/*     */     //   1709: bipush #7
/*     */     //   1711: ldc_w 'graphicsCard2'
/*     */     //   1714: aastore
/*     */     //   1715: dup
/*     */     //   1716: bipush #8
/*     */     //   1718: ldc_w 'graphicsCard3'
/*     */     //   1721: aastore
/*     */     //   1722: dup
/*     */     //   1723: bipush #9
/*     */     //   1725: ldc_w 'angelUpgrade'
/*     */     //   1728: aastore
/*     */     //   1729: dup
/*     */     //   1730: bipush #10
/*     */     //   1732: ldc_w 'craftingUpgrade'
/*     */     //   1735: aastore
/*     */     //   1736: dup
/*     */     //   1737: bipush #11
/*     */     //   1739: ldc_w 'databaseUpgrade1'
/*     */     //   1742: aastore
/*     */     //   1743: dup
/*     */     //   1744: bipush #12
/*     */     //   1746: ldc_w 'databaseUpgrade2'
/*     */     //   1749: aastore
/*     */     //   1750: dup
/*     */     //   1751: bipush #13
/*     */     //   1753: ldc_w 'databaseUpgrade3'
/*     */     //   1756: aastore
/*     */     //   1757: dup
/*     */     //   1758: bipush #14
/*     */     //   1760: ldc_w 'experienceUpgrade'
/*     */     //   1763: aastore
/*     */     //   1764: dup
/*     */     //   1765: bipush #15
/*     */     //   1767: ldc_w 'generatorUpgrade'
/*     */     //   1770: aastore
/*     */     //   1771: dup
/*     */     //   1772: bipush #16
/*     */     //   1774: ldc_w 'hoverUpgrade1'
/*     */     //   1777: aastore
/*     */     //   1778: dup
/*     */     //   1779: bipush #17
/*     */     //   1781: ldc_w 'hoverUpgrade2'
/*     */     //   1784: aastore
/*     */     //   1785: dup
/*     */     //   1786: bipush #18
/*     */     //   1788: ldc_w 'inventoryUpgrade'
/*     */     //   1791: aastore
/*     */     //   1792: dup
/*     */     //   1793: bipush #19
/*     */     //   1795: ldc_w 'inventoryControllerUpgrade'
/*     */     //   1798: aastore
/*     */     //   1799: dup
/*     */     //   1800: bipush #20
/*     */     //   1802: ldc_w 'navigationUpgrade'
/*     */     //   1805: aastore
/*     */     //   1806: dup
/*     */     //   1807: bipush #21
/*     */     //   1809: ldc_w 'tankUpgrade'
/*     */     //   1812: aastore
/*     */     //   1813: dup
/*     */     //   1814: bipush #22
/*     */     //   1816: ldc_w 'tankControllerUpgrade'
/*     */     //   1819: aastore
/*     */     //   1820: dup
/*     */     //   1821: bipush #23
/*     */     //   1823: ldc_w 'tractorBeamUpgrade'
/*     */     //   1826: aastore
/*     */     //   1827: dup
/*     */     //   1828: bipush #24
/*     */     //   1830: ldc_w 'leashUpgrade'
/*     */     //   1833: aastore
/*     */     //   1834: dup
/*     */     //   1835: bipush #25
/*     */     //   1837: ldc_w 'tradingUpgrade'
/*     */     //   1840: aastore
/*     */     //   1841: dup
/*     */     //   1842: bipush #26
/*     */     //   1844: ldc_w 'beekeeperUpgrade'
/*     */     //   1847: aastore
/*     */     //   1848: dup
/*     */     //   1849: bipush #27
/*     */     //   1851: ldc_w 'me_upgrade1'
/*     */     //   1854: aastore
/*     */     //   1855: dup
/*     */     //   1856: bipush #28
/*     */     //   1858: ldc_w 'me_upgrade2'
/*     */     //   1861: aastore
/*     */     //   1862: dup
/*     */     //   1863: bipush #29
/*     */     //   1865: ldc_w 'me_upgrade3'
/*     */     //   1868: aastore
/*     */     //   1869: checkcast [Ljava/lang/Object;
/*     */     //   1872: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1875: invokespecial blacklistHost : (Ljava/lang/Class;Lscala/collection/Seq;)V
/*     */     //   1878: aload_0
/*     */     //   1879: ldc_w li/cil/oc/api/internal/Robot
/*     */     //   1882: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1885: iconst_5
/*     */     //   1886: anewarray java/lang/String
/*     */     //   1889: dup
/*     */     //   1890: iconst_0
/*     */     //   1891: ldc_w 'transposer'
/*     */     //   1894: aastore
/*     */     //   1895: dup
/*     */     //   1896: iconst_1
/*     */     //   1897: ldc_w 'carpetedCapacitor'
/*     */     //   1900: aastore
/*     */     //   1901: dup
/*     */     //   1902: iconst_2
/*     */     //   1903: ldc_w 'analyzer'
/*     */     //   1906: aastore
/*     */     //   1907: dup
/*     */     //   1908: iconst_3
/*     */     //   1909: ldc_w 'leashUpgrade'
/*     */     //   1912: aastore
/*     */     //   1913: dup
/*     */     //   1914: iconst_4
/*     */     //   1915: ldc_w 'ritegUpgrade'
/*     */     //   1918: aastore
/*     */     //   1919: checkcast [Ljava/lang/Object;
/*     */     //   1922: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   1925: invokespecial blacklistHost : (Ljava/lang/Class;Lscala/collection/Seq;)V
/*     */     //   1928: aload_0
/*     */     //   1929: ldc_w li/cil/oc/api/internal/Tablet
/*     */     //   1932: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   1935: bipush #26
/*     */     //   1937: anewarray java/lang/String
/*     */     //   1940: dup
/*     */     //   1941: iconst_0
/*     */     //   1942: ldc_w 'screen1'
/*     */     //   1945: aastore
/*     */     //   1946: dup
/*     */     //   1947: iconst_1
/*     */     //   1948: ldc_w 'transposer'
/*     */     //   1951: aastore
/*     */     //   1952: dup
/*     */     //   1953: iconst_2
/*     */     //   1954: ldc_w 'carpetedCapacitor'
/*     */     //   1957: aastore
/*     */     //   1958: dup
/*     */     //   1959: iconst_3
/*     */     //   1960: ldc_w 'lanCard'
/*     */     //   1963: aastore
/*     */     //   1964: dup
/*     */     //   1965: iconst_4
/*     */     //   1966: ldc_w 'redstoneCard1'
/*     */     //   1969: aastore
/*     */     //   1970: dup
/*     */     //   1971: iconst_5
/*     */     //   1972: ldc_w 'angelUpgrade'
/*     */     //   1975: aastore
/*     */     //   1976: dup
/*     */     //   1977: bipush #6
/*     */     //   1979: ldc_w 'chunkloaderUpgrade'
/*     */     //   1982: aastore
/*     */     //   1983: dup
/*     */     //   1984: bipush #7
/*     */     //   1986: ldc_w 'craftingUpgrade'
/*     */     //   1989: aastore
/*     */     //   1990: dup
/*     */     //   1991: bipush #8
/*     */     //   1993: ldc_w 'databaseUpgrade1'
/*     */     //   1996: aastore
/*     */     //   1997: dup
/*     */     //   1998: bipush #9
/*     */     //   2000: ldc_w 'databaseUpgrade2'
/*     */     //   2003: aastore
/*     */     //   2004: dup
/*     */     //   2005: bipush #10
/*     */     //   2007: ldc_w 'databaseUpgrade3'
/*     */     //   2010: aastore
/*     */     //   2011: dup
/*     */     //   2012: bipush #11
/*     */     //   2014: ldc_w 'experienceUpgrade'
/*     */     //   2017: aastore
/*     */     //   2018: dup
/*     */     //   2019: bipush #12
/*     */     //   2021: ldc_w 'generatorUpgrade'
/*     */     //   2024: aastore
/*     */     //   2025: dup
/*     */     //   2026: bipush #13
/*     */     //   2028: ldc_w 'hoverUpgrade1'
/*     */     //   2031: aastore
/*     */     //   2032: dup
/*     */     //   2033: bipush #14
/*     */     //   2035: ldc_w 'hoverUpgrade2'
/*     */     //   2038: aastore
/*     */     //   2039: dup
/*     */     //   2040: bipush #15
/*     */     //   2042: ldc_w 'inventoryUpgrade'
/*     */     //   2045: aastore
/*     */     //   2046: dup
/*     */     //   2047: bipush #16
/*     */     //   2049: ldc_w 'inventoryControllerUpgrade'
/*     */     //   2052: aastore
/*     */     //   2053: dup
/*     */     //   2054: bipush #17
/*     */     //   2056: ldc_w 'tankUpgrade'
/*     */     //   2059: aastore
/*     */     //   2060: dup
/*     */     //   2061: bipush #18
/*     */     //   2063: ldc_w 'tankControllerUpgrade'
/*     */     //   2066: aastore
/*     */     //   2067: dup
/*     */     //   2068: bipush #19
/*     */     //   2070: ldc_w 'leashUpgrade'
/*     */     //   2073: aastore
/*     */     //   2074: dup
/*     */     //   2075: bipush #20
/*     */     //   2077: ldc_w 'tradingUpgrade'
/*     */     //   2080: aastore
/*     */     //   2081: dup
/*     */     //   2082: bipush #21
/*     */     //   2084: ldc_w 'beekeeperUpgrade'
/*     */     //   2087: aastore
/*     */     //   2088: dup
/*     */     //   2089: bipush #22
/*     */     //   2091: ldc_w 'configuratorUpgrade'
/*     */     //   2094: aastore
/*     */     //   2095: dup
/*     */     //   2096: bipush #23
/*     */     //   2098: ldc_w 'me_upgrade1'
/*     */     //   2101: aastore
/*     */     //   2102: dup
/*     */     //   2103: bipush #24
/*     */     //   2105: ldc_w 'me_upgrade2'
/*     */     //   2108: aastore
/*     */     //   2109: dup
/*     */     //   2110: bipush #25
/*     */     //   2112: ldc_w 'me_upgrade3'
/*     */     //   2115: aastore
/*     */     //   2116: checkcast [Ljava/lang/Object;
/*     */     //   2119: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2122: invokespecial blacklistHost : (Ljava/lang/Class;Lscala/collection/Seq;)V
/*     */     //   2125: getstatic li/cil/oc/integration/util/WirelessRedstone$.MODULE$ : Lli/cil/oc/integration/util/WirelessRedstone$;
/*     */     //   2128: invokevirtual isAvailable : ()Z
/*     */     //   2131: ifne -> 2186
/*     */     //   2134: aload_0
/*     */     //   2135: ldc_w li/cil/oc/api/internal/Drone
/*     */     //   2138: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2141: iconst_1
/*     */     //   2142: anewarray java/lang/String
/*     */     //   2145: dup
/*     */     //   2146: iconst_0
/*     */     //   2147: ldc_w 'redstoneCard2'
/*     */     //   2150: aastore
/*     */     //   2151: checkcast [Ljava/lang/Object;
/*     */     //   2154: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2157: invokespecial blacklistHost : (Ljava/lang/Class;Lscala/collection/Seq;)V
/*     */     //   2160: aload_0
/*     */     //   2161: ldc_w li/cil/oc/api/internal/Tablet
/*     */     //   2164: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   2167: iconst_1
/*     */     //   2168: anewarray java/lang/String
/*     */     //   2171: dup
/*     */     //   2172: iconst_0
/*     */     //   2173: ldc_w 'redstoneCard2'
/*     */     //   2176: aastore
/*     */     //   2177: checkcast [Ljava/lang/Object;
/*     */     //   2180: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   2183: invokespecial blacklistHost : (Ljava/lang/Class;Lscala/collection/Seq;)V
/*     */     //   2186: getstatic li/cil/oc/integration/util/BundledRedstone$.MODULE$ : Lli/cil/oc/integration/util/BundledRedstone$;
/*     */     //   2189: invokevirtual isAvailable : ()Z
/*     */     //   2192: ifne -> 2204
/*     */     //   2195: getstatic li/cil/oc/integration/util/WirelessRedstone$.MODULE$ : Lli/cil/oc/integration/util/WirelessRedstone$;
/*     */     //   2198: invokevirtual isAvailable : ()Z
/*     */     //   2201: ifeq -> 2289
/*     */     //   2204: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   2207: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   2210: ldc_w 'Found extended redstone mods, enabling tier two redstone card.'
/*     */     //   2213: invokeinterface info : (Ljava/lang/String;)V
/*     */     //   2218: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */     //   2221: ldc_w 'redstoneCard2'
/*     */     //   2224: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   2227: iconst_1
/*     */     //   2228: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   2233: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   2236: astore_1
/*     */     //   2237: aload_1
/*     */     //   2238: instanceof scala/Some
/*     */     //   2241: ifeq -> 2284
/*     */     //   2244: aload_1
/*     */     //   2245: checkcast scala/Some
/*     */     //   2248: astore_2
/*     */     //   2249: aload_2
/*     */     //   2250: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   2253: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   2256: astore_3
/*     */     //   2257: aload_3
/*     */     //   2258: instanceof li/cil/oc/common/item/RedstoneCard
/*     */     //   2261: ifeq -> 2284
/*     */     //   2264: aload_3
/*     */     //   2265: checkcast li/cil/oc/common/item/RedstoneCard
/*     */     //   2268: astore #4
/*     */     //   2270: aload #4
/*     */     //   2272: iconst_1
/*     */     //   2273: invokevirtual showInItemList_$eq : (Z)V
/*     */     //   2276: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2279: astore #5
/*     */     //   2281: goto -> 2289
/*     */     //   2284: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2287: astore #5
/*     */     //   2289: getstatic li/cil/oc/integration/opencomputers/ModOpenComputers$DefinitionPathProvider$.MODULE$ : Lli/cil/oc/integration/opencomputers/ModOpenComputers$DefinitionPathProvider$;
/*     */     //   2292: invokestatic addProvider : (Lli/cil/oc/api/manual/PathProvider;)V
/*     */     //   2295: new li/cil/oc/api/prefab/ResourceContentProvider
/*     */     //   2298: dup
/*     */     //   2299: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   2302: invokevirtual resourceDomain : ()Ljava/lang/String;
/*     */     //   2305: ldc_w 'doc/'
/*     */     //   2308: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   2311: invokestatic addProvider : (Lli/cil/oc/api/manual/ContentProvider;)V
/*     */     //   2314: ldc_w ''
/*     */     //   2317: getstatic li/cil/oc/client/renderer/markdown/segment/render/TextureImageProvider$.MODULE$ : Lli/cil/oc/client/renderer/markdown/segment/render/TextureImageProvider$;
/*     */     //   2320: invokestatic addProvider : (Ljava/lang/String;Lli/cil/oc/api/manual/ImageProvider;)V
/*     */     //   2323: ldc_w 'item'
/*     */     //   2326: getstatic li/cil/oc/client/renderer/markdown/segment/render/ItemImageProvider$.MODULE$ : Lli/cil/oc/client/renderer/markdown/segment/render/ItemImageProvider$;
/*     */     //   2329: invokestatic addProvider : (Ljava/lang/String;Lli/cil/oc/api/manual/ImageProvider;)V
/*     */     //   2332: ldc_w 'block'
/*     */     //   2335: getstatic li/cil/oc/client/renderer/markdown/segment/render/BlockImageProvider$.MODULE$ : Lli/cil/oc/client/renderer/markdown/segment/render/BlockImageProvider$;
/*     */     //   2338: invokestatic addProvider : (Ljava/lang/String;Lli/cil/oc/api/manual/ImageProvider;)V
/*     */     //   2341: ldc_w 'oredict'
/*     */     //   2344: getstatic li/cil/oc/client/renderer/markdown/segment/render/OreDictImageProvider$.MODULE$ : Lli/cil/oc/client/renderer/markdown/segment/render/OreDictImageProvider$;
/*     */     //   2347: invokestatic addProvider : (Ljava/lang/String;Lli/cil/oc/api/manual/ImageProvider;)V
/*     */     //   2350: new li/cil/oc/api/prefab/TextureTabIconRenderer
/*     */     //   2353: dup
/*     */     //   2354: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   2357: invokevirtual guiManualHome : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   2360: invokespecial <init> : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   2363: ldc_w 'oc:gui.Manual.Home'
/*     */     //   2366: ldc_w '%LANGUAGE%/index.md'
/*     */     //   2369: invokestatic addTab : (Lli/cil/oc/api/manual/TabIconRenderer;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   2372: new li/cil/oc/api/prefab/ItemStackTabIconRenderer
/*     */     //   2375: dup
/*     */     //   2376: ldc_w 'case1'
/*     */     //   2379: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   2382: iconst_1
/*     */     //   2383: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   2388: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   2391: ldc_w 'oc:gui.Manual.Blocks'
/*     */     //   2394: ldc_w '%LANGUAGE%/block/index.md'
/*     */     //   2397: invokestatic addTab : (Lli/cil/oc/api/manual/TabIconRenderer;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   2400: new li/cil/oc/api/prefab/ItemStackTabIconRenderer
/*     */     //   2403: dup
/*     */     //   2404: ldc_w 'cpu1'
/*     */     //   2407: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   2410: iconst_1
/*     */     //   2411: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   2416: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   2419: ldc_w 'oc:gui.Manual.Items'
/*     */     //   2422: ldc_w '%LANGUAGE%/item/index.md'
/*     */     //   2425: invokestatic addTab : (Lli/cil/oc/api/manual/TabIconRenderer;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   2428: getstatic li/cil/oc/common/nanomachines/provider/DisintegrationProvider$.MODULE$ : Lli/cil/oc/common/nanomachines/provider/DisintegrationProvider$;
/*     */     //   2431: invokestatic addProvider : (Lli/cil/oc/api/nanomachines/BehaviorProvider;)V
/*     */     //   2434: getstatic li/cil/oc/common/nanomachines/provider/HungryProvider$.MODULE$ : Lli/cil/oc/common/nanomachines/provider/HungryProvider$;
/*     */     //   2437: invokestatic addProvider : (Lli/cil/oc/api/nanomachines/BehaviorProvider;)V
/*     */     //   2440: getstatic li/cil/oc/common/nanomachines/provider/ParticleProvider$.MODULE$ : Lli/cil/oc/common/nanomachines/provider/ParticleProvider$;
/*     */     //   2443: invokestatic addProvider : (Lli/cil/oc/api/nanomachines/BehaviorProvider;)V
/*     */     //   2446: getstatic li/cil/oc/common/nanomachines/provider/PotionProvider$.MODULE$ : Lli/cil/oc/common/nanomachines/provider/PotionProvider$;
/*     */     //   2449: invokestatic addProvider : (Lli/cil/oc/api/nanomachines/BehaviorProvider;)V
/*     */     //   2452: getstatic li/cil/oc/common/nanomachines/provider/MagnetProvider$.MODULE$ : Lli/cil/oc/common/nanomachines/provider/MagnetProvider$;
/*     */     //   2455: invokestatic addProvider : (Lli/cil/oc/api/nanomachines/BehaviorProvider;)V
/*     */     //   2458: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #56	-> 0
/*     */     //   #57	-> 6
/*     */     //   #58	-> 12
/*     */     //   #59	-> 18
/*     */     //   #60	-> 24
/*     */     //   #61	-> 30
/*     */     //   #62	-> 36
/*     */     //   #64	-> 42
/*     */     //   #65	-> 47
/*     */     //   #67	-> 52
/*     */     //   #68	-> 54
/*     */     //   #69	-> 56
/*     */     //   #66	-> 58
/*     */     //   #71	-> 61
/*     */     //   #72	-> 66
/*     */     //   #74	-> 71
/*     */     //   #75	-> 97
/*     */     //   #76	-> 123
/*     */     //   #77	-> 151
/*     */     //   #78	-> 179
/*     */     //   #79	-> 207
/*     */     //   #80	-> 235
/*     */     //   #81	-> 263
/*     */     //   #82	-> 291
/*     */     //   #83	-> 319
/*     */     //   #84	-> 347
/*     */     //   #85	-> 375
/*     */     //   #86	-> 403
/*     */     //   #87	-> 431
/*     */     //   #88	-> 459
/*     */     //   #89	-> 487
/*     */     //   #90	-> 515
/*     */     //   #92	-> 543
/*     */     //   #94	-> 552
/*     */     //   #95	-> 564
/*     */     //   #96	-> 576
/*     */     //   #97	-> 588
/*     */     //   #99	-> 600
/*     */     //   #100	-> 609
/*     */     //   #101	-> 618
/*     */     //   #102	-> 627
/*     */     //   #103	-> 636
/*     */     //   #104	-> 645
/*     */     //   #105	-> 654
/*     */     //   #106	-> 663
/*     */     //   #107	-> 672
/*     */     //   #108	-> 681
/*     */     //   #109	-> 690
/*     */     //   #110	-> 699
/*     */     //   #111	-> 708
/*     */     //   #112	-> 717
/*     */     //   #113	-> 726
/*     */     //   #114	-> 735
/*     */     //   #115	-> 744
/*     */     //   #116	-> 753
/*     */     //   #117	-> 762
/*     */     //   #119	-> 771
/*     */     //   #120	-> 777
/*     */     //   #122	-> 783
/*     */     //   #123	-> 789
/*     */     //   #124	-> 795
/*     */     //   #125	-> 801
/*     */     //   #126	-> 807
/*     */     //   #127	-> 813
/*     */     //   #128	-> 819
/*     */     //   #129	-> 825
/*     */     //   #130	-> 831
/*     */     //   #131	-> 837
/*     */     //   #132	-> 843
/*     */     //   #133	-> 849
/*     */     //   #134	-> 855
/*     */     //   #135	-> 861
/*     */     //   #136	-> 867
/*     */     //   #137	-> 873
/*     */     //   #138	-> 879
/*     */     //   #139	-> 885
/*     */     //   #141	-> 891
/*     */     //   #142	-> 897
/*     */     //   #143	-> 903
/*     */     //   #145	-> 909
/*     */     //   #146	-> 915
/*     */     //   #147	-> 921
/*     */     //   #148	-> 927
/*     */     //   #150	-> 933
/*     */     //   #151	-> 939
/*     */     //   #152	-> 945
/*     */     //   #154	-> 951
/*     */     //   #155	-> 957
/*     */     //   #156	-> 963
/*     */     //   #157	-> 969
/*     */     //   #158	-> 975
/*     */     //   #159	-> 981
/*     */     //   #160	-> 987
/*     */     //   #161	-> 993
/*     */     //   #162	-> 999
/*     */     //   #163	-> 1005
/*     */     //   #164	-> 1011
/*     */     //   #165	-> 1017
/*     */     //   #166	-> 1023
/*     */     //   #167	-> 1029
/*     */     //   #168	-> 1035
/*     */     //   #169	-> 1041
/*     */     //   #170	-> 1047
/*     */     //   #171	-> 1053
/*     */     //   #172	-> 1059
/*     */     //   #173	-> 1065
/*     */     //   #174	-> 1071
/*     */     //   #175	-> 1077
/*     */     //   #176	-> 1083
/*     */     //   #178	-> 1089
/*     */     //   #179	-> 1095
/*     */     //   #180	-> 1101
/*     */     //   #181	-> 1107
/*     */     //   #182	-> 1113
/*     */     //   #183	-> 1119
/*     */     //   #184	-> 1125
/*     */     //   #185	-> 1131
/*     */     //   #186	-> 1137
/*     */     //   #187	-> 1143
/*     */     //   #188	-> 1149
/*     */     //   #189	-> 1155
/*     */     //   #191	-> 1161
/*     */     //   #192	-> 1167
/*     */     //   #193	-> 1173
/*     */     //   #194	-> 1179
/*     */     //   #196	-> 1185
/*     */     //   #197	-> 1191
/*     */     //   #198	-> 1197
/*     */     //   #199	-> 1203
/*     */     //   #200	-> 1209
/*     */     //   #201	-> 1215
/*     */     //   #202	-> 1221
/*     */     //   #203	-> 1227
/*     */     //   #204	-> 1233
/*     */     //   #205	-> 1239
/*     */     //   #206	-> 1245
/*     */     //   #207	-> 1251
/*     */     //   #208	-> 1257
/*     */     //   #210	-> 1263
/*     */     //   #212	-> 1269
/*     */     //   #213	-> 1275
/*     */     //   #214	-> 1281
/*     */     //   #216	-> 1287
/*     */     //   #217	-> 1301
/*     */     //   #216	-> 1305
/*     */     //   #218	-> 1307
/*     */     //   #216	-> 1311
/*     */     //   #219	-> 1313
/*     */     //   #216	-> 1317
/*     */     //   #220	-> 1319
/*     */     //   #216	-> 1323
/*     */     //   #221	-> 1325
/*     */     //   #216	-> 1329
/*     */     //   #222	-> 1331
/*     */     //   #216	-> 1335
/*     */     //   #223	-> 1338
/*     */     //   #216	-> 1342
/*     */     //   #224	-> 1345
/*     */     //   #216	-> 1349
/*     */     //   #225	-> 1352
/*     */     //   #216	-> 1356
/*     */     //   #226	-> 1359
/*     */     //   #216	-> 1363
/*     */     //   #227	-> 1366
/*     */     //   #216	-> 1370
/*     */     //   #228	-> 1373
/*     */     //   #216	-> 1377
/*     */     //   #229	-> 1380
/*     */     //   #216	-> 1384
/*     */     //   #230	-> 1387
/*     */     //   #216	-> 1391
/*     */     //   #231	-> 1394
/*     */     //   #216	-> 1398
/*     */     //   #232	-> 1401
/*     */     //   #216	-> 1405
/*     */     //   #233	-> 1408
/*     */     //   #216	-> 1412
/*     */     //   #234	-> 1415
/*     */     //   #216	-> 1419
/*     */     //   #235	-> 1422
/*     */     //   #216	-> 1426
/*     */     //   #236	-> 1429
/*     */     //   #216	-> 1433
/*     */     //   #237	-> 1436
/*     */     //   #216	-> 1440
/*     */     //   #238	-> 1443
/*     */     //   #216	-> 1447
/*     */     //   #239	-> 1450
/*     */     //   #216	-> 1454
/*     */     //   #240	-> 1457
/*     */     //   #216	-> 1461
/*     */     //   #241	-> 1464
/*     */     //   #216	-> 1468
/*     */     //   #242	-> 1471
/*     */     //   #216	-> 1475
/*     */     //   #243	-> 1478
/*     */     //   #216	-> 1482
/*     */     //   #244	-> 1485
/*     */     //   #216	-> 1489
/*     */     //   #245	-> 1492
/*     */     //   #216	-> 1496
/*     */     //   #246	-> 1499
/*     */     //   #216	-> 1506
/*     */     //   #248	-> 1512
/*     */     //   #249	-> 1526
/*     */     //   #248	-> 1530
/*     */     //   #250	-> 1532
/*     */     //   #248	-> 1536
/*     */     //   #251	-> 1538
/*     */     //   #248	-> 1542
/*     */     //   #252	-> 1544
/*     */     //   #248	-> 1548
/*     */     //   #253	-> 1550
/*     */     //   #248	-> 1554
/*     */     //   #254	-> 1556
/*     */     //   #248	-> 1560
/*     */     //   #255	-> 1563
/*     */     //   #248	-> 1567
/*     */     //   #256	-> 1570
/*     */     //   #248	-> 1574
/*     */     //   #257	-> 1577
/*     */     //   #248	-> 1581
/*     */     //   #258	-> 1584
/*     */     //   #248	-> 1588
/*     */     //   #259	-> 1591
/*     */     //   #248	-> 1595
/*     */     //   #260	-> 1598
/*     */     //   #248	-> 1602
/*     */     //   #261	-> 1605
/*     */     //   #248	-> 1609
/*     */     //   #262	-> 1612
/*     */     //   #248	-> 1616
/*     */     //   #263	-> 1619
/*     */     //   #248	-> 1623
/*     */     //   #264	-> 1626
/*     */     //   #248	-> 1630
/*     */     //   #265	-> 1633
/*     */     //   #248	-> 1637
/*     */     //   #266	-> 1640
/*     */     //   #248	-> 1647
/*     */     //   #268	-> 1653
/*     */     //   #269	-> 1667
/*     */     //   #268	-> 1671
/*     */     //   #270	-> 1673
/*     */     //   #268	-> 1677
/*     */     //   #271	-> 1679
/*     */     //   #268	-> 1683
/*     */     //   #272	-> 1685
/*     */     //   #268	-> 1689
/*     */     //   #273	-> 1691
/*     */     //   #268	-> 1695
/*     */     //   #274	-> 1697
/*     */     //   #268	-> 1701
/*     */     //   #275	-> 1704
/*     */     //   #268	-> 1708
/*     */     //   #276	-> 1711
/*     */     //   #268	-> 1715
/*     */     //   #277	-> 1718
/*     */     //   #268	-> 1722
/*     */     //   #278	-> 1725
/*     */     //   #268	-> 1729
/*     */     //   #279	-> 1732
/*     */     //   #268	-> 1736
/*     */     //   #280	-> 1739
/*     */     //   #268	-> 1743
/*     */     //   #281	-> 1746
/*     */     //   #268	-> 1750
/*     */     //   #282	-> 1753
/*     */     //   #268	-> 1757
/*     */     //   #283	-> 1760
/*     */     //   #268	-> 1764
/*     */     //   #284	-> 1767
/*     */     //   #268	-> 1771
/*     */     //   #285	-> 1774
/*     */     //   #268	-> 1778
/*     */     //   #286	-> 1781
/*     */     //   #268	-> 1785
/*     */     //   #287	-> 1788
/*     */     //   #268	-> 1792
/*     */     //   #288	-> 1795
/*     */     //   #268	-> 1799
/*     */     //   #289	-> 1802
/*     */     //   #268	-> 1806
/*     */     //   #290	-> 1809
/*     */     //   #268	-> 1813
/*     */     //   #291	-> 1816
/*     */     //   #268	-> 1820
/*     */     //   #292	-> 1823
/*     */     //   #268	-> 1827
/*     */     //   #293	-> 1830
/*     */     //   #268	-> 1834
/*     */     //   #294	-> 1837
/*     */     //   #268	-> 1841
/*     */     //   #295	-> 1844
/*     */     //   #268	-> 1848
/*     */     //   #296	-> 1851
/*     */     //   #268	-> 1855
/*     */     //   #297	-> 1858
/*     */     //   #268	-> 1862
/*     */     //   #298	-> 1865
/*     */     //   #268	-> 1872
/*     */     //   #300	-> 1878
/*     */     //   #301	-> 1891
/*     */     //   #300	-> 1895
/*     */     //   #302	-> 1897
/*     */     //   #300	-> 1901
/*     */     //   #303	-> 1903
/*     */     //   #300	-> 1907
/*     */     //   #304	-> 1909
/*     */     //   #300	-> 1913
/*     */     //   #305	-> 1915
/*     */     //   #300	-> 1922
/*     */     //   #307	-> 1928
/*     */     //   #308	-> 1942
/*     */     //   #307	-> 1946
/*     */     //   #309	-> 1948
/*     */     //   #307	-> 1952
/*     */     //   #310	-> 1954
/*     */     //   #307	-> 1958
/*     */     //   #311	-> 1960
/*     */     //   #307	-> 1964
/*     */     //   #312	-> 1966
/*     */     //   #307	-> 1970
/*     */     //   #313	-> 1972
/*     */     //   #307	-> 1976
/*     */     //   #314	-> 1979
/*     */     //   #307	-> 1983
/*     */     //   #315	-> 1986
/*     */     //   #307	-> 1990
/*     */     //   #316	-> 1993
/*     */     //   #307	-> 1997
/*     */     //   #317	-> 2000
/*     */     //   #307	-> 2004
/*     */     //   #318	-> 2007
/*     */     //   #307	-> 2011
/*     */     //   #319	-> 2014
/*     */     //   #307	-> 2018
/*     */     //   #320	-> 2021
/*     */     //   #307	-> 2025
/*     */     //   #321	-> 2028
/*     */     //   #307	-> 2032
/*     */     //   #322	-> 2035
/*     */     //   #307	-> 2039
/*     */     //   #323	-> 2042
/*     */     //   #307	-> 2046
/*     */     //   #324	-> 2049
/*     */     //   #307	-> 2053
/*     */     //   #325	-> 2056
/*     */     //   #307	-> 2060
/*     */     //   #326	-> 2063
/*     */     //   #307	-> 2067
/*     */     //   #327	-> 2070
/*     */     //   #307	-> 2074
/*     */     //   #328	-> 2077
/*     */     //   #307	-> 2081
/*     */     //   #329	-> 2084
/*     */     //   #307	-> 2088
/*     */     //   #330	-> 2091
/*     */     //   #307	-> 2095
/*     */     //   #331	-> 2098
/*     */     //   #307	-> 2102
/*     */     //   #332	-> 2105
/*     */     //   #307	-> 2109
/*     */     //   #333	-> 2112
/*     */     //   #307	-> 2119
/*     */     //   #336	-> 2125
/*     */     //   #337	-> 2134
/*     */     //   #338	-> 2160
/*     */     //   #344	-> 2186
/*     */     //   #345	-> 2204
/*     */     //   #346	-> 2218
/*     */     //   #347	-> 2237
/*     */     //   #348	-> 2284
/*     */     //   #352	-> 2289
/*     */     //   #353	-> 2295
/*     */     //   #354	-> 2314
/*     */     //   #355	-> 2323
/*     */     //   #356	-> 2332
/*     */     //   #357	-> 2341
/*     */     //   #359	-> 2350
/*     */     //   #360	-> 2372
/*     */     //   #361	-> 2400
/*     */     //   #363	-> 2428
/*     */     //   #364	-> 2434
/*     */     //   #365	-> 2440
/*     */     //   #366	-> 2446
/*     */     //   #367	-> 2452
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	2459	0	this	Lli/cil/oc/integration/opencomputers/ModOpenComputers$;
/*     */     //   2257	202	3	redstone	Lli/cil/oc/common/item/traits/Delegate;
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
/*     */   public boolean useWrench(EntityPlayer player, int x, int y, int z, boolean changeDurability) {
/*     */     boolean bool;
/* 371 */     Item item = player.func_70694_bm().func_77973_b();
/* 372 */     if (item instanceof Wrench) { Item item1 = item; bool = ((Wrench)item1).useWrenchOnBlock(player, player.func_130014_f_(), x, y, z, !changeDurability); }
/* 373 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   }
/* 377 */   public boolean isWrench(ItemStack stack) { return stack.func_77973_b() instanceof Wrench; }
/*     */   public boolean canCharge(ItemStack stack) { boolean bool;
/* 379 */     Item item = stack.func_77973_b();
/* 380 */     if (item instanceof Chargeable) { Item item1 = item; bool = ((Chargeable)item1).canCharge(stack); }
/* 381 */     else { bool = false; }
/*     */     
/*     */     return bool; } public double charge(ItemStack stack, double amount, boolean simulate) {
/*     */     double d;
/* 385 */     Item item = stack.func_77973_b();
/* 386 */     if (item instanceof Chargeable) { Item item1 = item; d = ((Chargeable)item1).charge(stack, amount, simulate); }
/* 387 */     else { d = 0.0D; }
/*     */     
/*     */     return d;
/*     */   }
/*     */   public int inkCartridgeInkProvider(ItemStack stack) {
/* 392 */     ItemInfo itemInfo = Items.get("inkCartridge"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); } else if (Items.get(stack).equals(itemInfo))
/*     */     {  }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public int dyeInkProvider(ItemStack stack) {
/* 399 */     return li.cil.oc.util.Color$.MODULE$.isDye(stack) ? (
/* 400 */       li.cil.oc.Settings$.MODULE$.get().printInkValue() / 10) : 
/*     */       
/* 402 */       0;
/*     */   }
/*     */   
/*     */   private void blacklistHost(Class host, Seq itemNames) {
/* 406 */     itemNames.foreach((Function1)new ModOpenComputers$$anonfun$blacklistHost$1(host)); } public final class ModOpenComputers$$anonfun$blacklistHost$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public final void apply(String itemName) {
/* 407 */       IMC.blacklistHost(itemName, this.host$1, Items.get(itemName).createItemStack(1));
/*     */     }
/*     */     
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Class host$1;
/*     */     
/*     */     public ModOpenComputers$$anonfun$blacklistHost$1(Class host$1) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\ModOpenComputers$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */