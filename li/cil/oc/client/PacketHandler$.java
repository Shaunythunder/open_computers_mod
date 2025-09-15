/*     */ package li.cil.oc.client;
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.api.nanomachines.Controller;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.common.PacketHandler;
/*     */ import li.cil.oc.common.nanomachines.ControllerImpl;
/*     */ import li.cil.oc.common.tileentity.Adapter;
/*     */ import li.cil.oc.common.tileentity.Hologram;
/*     */ import li.cil.oc.common.tileentity.NetSplitter;
/*     */ import li.cil.oc.common.tileentity.Rack;
/*     */ import li.cil.oc.common.tileentity.RobotProxy;
/*     */ import li.cil.oc.common.tileentity.traits.Computer;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class PacketHandler$ extends PacketHandler {
/*     */   public static final PacketHandler$ MODULE$;
/*     */   
/*     */   private PacketHandler$() {
/*  32 */     MODULE$ = this;
/*     */   } @SubscribeEvent
/*     */   public void onPacket(FMLNetworkEvent.ClientCustomPacketEvent e) {
/*  35 */     onPacketData(e.packet.payload(), (EntityPlayer)(Minecraft.func_71410_x()).field_71439_g);
/*     */   }
/*     */   public Option<World> world(EntityPlayer player, int dimension) {
/*  38 */     World world = player.field_70170_p;
/*  39 */     return (world.field_73011_w.field_76574_g == dimension) ? (Option<World>)new Some(world) : 
/*  40 */       (Option<World>)scala.None$.MODULE$;
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
/*     */   public void dispatch(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual packetType : ()Lscala/Enumeration$Value;
/*     */     //   4: astore_2
/*     */     //   5: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   8: invokevirtual AbstractBusState : ()Lscala/Enumeration$Value;
/*     */     //   11: aload_2
/*     */     //   12: astore_3
/*     */     //   13: dup
/*     */     //   14: ifnonnull -> 25
/*     */     //   17: pop
/*     */     //   18: aload_3
/*     */     //   19: ifnull -> 32
/*     */     //   22: goto -> 46
/*     */     //   25: aload_3
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 46
/*     */     //   32: aload_0
/*     */     //   33: aload_1
/*     */     //   34: invokevirtual onAbstractBusState : (Lli/cil/oc/common/PacketHandler$PacketParser;)Ljava/lang/Object;
/*     */     //   37: pop
/*     */     //   38: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   41: astore #4
/*     */     //   43: goto -> 2378
/*     */     //   46: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   49: invokevirtual AdapterState : ()Lscala/Enumeration$Value;
/*     */     //   52: aload_2
/*     */     //   53: astore #5
/*     */     //   55: dup
/*     */     //   56: ifnonnull -> 68
/*     */     //   59: pop
/*     */     //   60: aload #5
/*     */     //   62: ifnull -> 76
/*     */     //   65: goto -> 89
/*     */     //   68: aload #5
/*     */     //   70: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   73: ifeq -> 89
/*     */     //   76: aload_0
/*     */     //   77: aload_1
/*     */     //   78: invokevirtual onAdapterState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   81: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   84: astore #4
/*     */     //   86: goto -> 2378
/*     */     //   89: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   92: invokevirtual Analyze : ()Lscala/Enumeration$Value;
/*     */     //   95: aload_2
/*     */     //   96: astore #6
/*     */     //   98: dup
/*     */     //   99: ifnonnull -> 111
/*     */     //   102: pop
/*     */     //   103: aload #6
/*     */     //   105: ifnull -> 119
/*     */     //   108: goto -> 132
/*     */     //   111: aload #6
/*     */     //   113: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   116: ifeq -> 132
/*     */     //   119: aload_0
/*     */     //   120: aload_1
/*     */     //   121: invokevirtual onAnalyze : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   124: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   127: astore #4
/*     */     //   129: goto -> 2378
/*     */     //   132: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   135: invokevirtual ChargerState : ()Lscala/Enumeration$Value;
/*     */     //   138: aload_2
/*     */     //   139: astore #7
/*     */     //   141: dup
/*     */     //   142: ifnonnull -> 154
/*     */     //   145: pop
/*     */     //   146: aload #7
/*     */     //   148: ifnull -> 162
/*     */     //   151: goto -> 175
/*     */     //   154: aload #7
/*     */     //   156: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   159: ifeq -> 175
/*     */     //   162: aload_0
/*     */     //   163: aload_1
/*     */     //   164: invokevirtual onChargerState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   167: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   170: astore #4
/*     */     //   172: goto -> 2378
/*     */     //   175: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   178: invokevirtual ClientLog : ()Lscala/Enumeration$Value;
/*     */     //   181: aload_2
/*     */     //   182: astore #8
/*     */     //   184: dup
/*     */     //   185: ifnonnull -> 197
/*     */     //   188: pop
/*     */     //   189: aload #8
/*     */     //   191: ifnull -> 205
/*     */     //   194: goto -> 218
/*     */     //   197: aload #8
/*     */     //   199: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   202: ifeq -> 218
/*     */     //   205: aload_0
/*     */     //   206: aload_1
/*     */     //   207: invokevirtual onClientLog : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   210: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   213: astore #4
/*     */     //   215: goto -> 2378
/*     */     //   218: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   221: invokevirtual Clipboard : ()Lscala/Enumeration$Value;
/*     */     //   224: aload_2
/*     */     //   225: astore #9
/*     */     //   227: dup
/*     */     //   228: ifnonnull -> 240
/*     */     //   231: pop
/*     */     //   232: aload #9
/*     */     //   234: ifnull -> 248
/*     */     //   237: goto -> 261
/*     */     //   240: aload #9
/*     */     //   242: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   245: ifeq -> 261
/*     */     //   248: aload_0
/*     */     //   249: aload_1
/*     */     //   250: invokevirtual onClipboard : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   253: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   256: astore #4
/*     */     //   258: goto -> 2378
/*     */     //   261: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   264: invokevirtual ColorChange : ()Lscala/Enumeration$Value;
/*     */     //   267: aload_2
/*     */     //   268: astore #10
/*     */     //   270: dup
/*     */     //   271: ifnonnull -> 283
/*     */     //   274: pop
/*     */     //   275: aload #10
/*     */     //   277: ifnull -> 291
/*     */     //   280: goto -> 304
/*     */     //   283: aload #10
/*     */     //   285: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   288: ifeq -> 304
/*     */     //   291: aload_0
/*     */     //   292: aload_1
/*     */     //   293: invokevirtual onColorChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   296: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   299: astore #4
/*     */     //   301: goto -> 2378
/*     */     //   304: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   307: invokevirtual ComputerState : ()Lscala/Enumeration$Value;
/*     */     //   310: aload_2
/*     */     //   311: astore #11
/*     */     //   313: dup
/*     */     //   314: ifnonnull -> 326
/*     */     //   317: pop
/*     */     //   318: aload #11
/*     */     //   320: ifnull -> 334
/*     */     //   323: goto -> 347
/*     */     //   326: aload #11
/*     */     //   328: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   331: ifeq -> 347
/*     */     //   334: aload_0
/*     */     //   335: aload_1
/*     */     //   336: invokevirtual onComputerState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   339: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   342: astore #4
/*     */     //   344: goto -> 2378
/*     */     //   347: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   350: invokevirtual ComputerUserList : ()Lscala/Enumeration$Value;
/*     */     //   353: aload_2
/*     */     //   354: astore #12
/*     */     //   356: dup
/*     */     //   357: ifnonnull -> 369
/*     */     //   360: pop
/*     */     //   361: aload #12
/*     */     //   363: ifnull -> 377
/*     */     //   366: goto -> 390
/*     */     //   369: aload #12
/*     */     //   371: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   374: ifeq -> 390
/*     */     //   377: aload_0
/*     */     //   378: aload_1
/*     */     //   379: invokevirtual onComputerUserList : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   382: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   385: astore #4
/*     */     //   387: goto -> 2378
/*     */     //   390: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   393: invokevirtual ContainerUpdate : ()Lscala/Enumeration$Value;
/*     */     //   396: aload_2
/*     */     //   397: astore #13
/*     */     //   399: dup
/*     */     //   400: ifnonnull -> 412
/*     */     //   403: pop
/*     */     //   404: aload #13
/*     */     //   406: ifnull -> 420
/*     */     //   409: goto -> 433
/*     */     //   412: aload #13
/*     */     //   414: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   417: ifeq -> 433
/*     */     //   420: aload_0
/*     */     //   421: aload_1
/*     */     //   422: invokevirtual onContainerUpdate : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   425: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   428: astore #4
/*     */     //   430: goto -> 2378
/*     */     //   433: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   436: invokevirtual DisassemblerActiveChange : ()Lscala/Enumeration$Value;
/*     */     //   439: aload_2
/*     */     //   440: astore #14
/*     */     //   442: dup
/*     */     //   443: ifnonnull -> 455
/*     */     //   446: pop
/*     */     //   447: aload #14
/*     */     //   449: ifnull -> 463
/*     */     //   452: goto -> 476
/*     */     //   455: aload #14
/*     */     //   457: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   460: ifeq -> 476
/*     */     //   463: aload_0
/*     */     //   464: aload_1
/*     */     //   465: invokevirtual onDisassemblerActiveChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   468: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   471: astore #4
/*     */     //   473: goto -> 2378
/*     */     //   476: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   479: invokevirtual FileSystemActivity : ()Lscala/Enumeration$Value;
/*     */     //   482: aload_2
/*     */     //   483: astore #15
/*     */     //   485: dup
/*     */     //   486: ifnonnull -> 498
/*     */     //   489: pop
/*     */     //   490: aload #15
/*     */     //   492: ifnull -> 506
/*     */     //   495: goto -> 520
/*     */     //   498: aload #15
/*     */     //   500: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   503: ifeq -> 520
/*     */     //   506: aload_0
/*     */     //   507: aload_1
/*     */     //   508: invokevirtual onFileSystemActivity : (Lli/cil/oc/common/PacketHandler$PacketParser;)Ljava/lang/Object;
/*     */     //   511: pop
/*     */     //   512: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   515: astore #4
/*     */     //   517: goto -> 2378
/*     */     //   520: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   523: invokevirtual FloppyChange : ()Lscala/Enumeration$Value;
/*     */     //   526: aload_2
/*     */     //   527: astore #16
/*     */     //   529: dup
/*     */     //   530: ifnonnull -> 542
/*     */     //   533: pop
/*     */     //   534: aload #16
/*     */     //   536: ifnull -> 550
/*     */     //   539: goto -> 563
/*     */     //   542: aload #16
/*     */     //   544: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   547: ifeq -> 563
/*     */     //   550: aload_0
/*     */     //   551: aload_1
/*     */     //   552: invokevirtual onFloppyChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   555: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   558: astore #4
/*     */     //   560: goto -> 2378
/*     */     //   563: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   566: invokevirtual HologramArea : ()Lscala/Enumeration$Value;
/*     */     //   569: aload_2
/*     */     //   570: astore #17
/*     */     //   572: dup
/*     */     //   573: ifnonnull -> 585
/*     */     //   576: pop
/*     */     //   577: aload #17
/*     */     //   579: ifnull -> 593
/*     */     //   582: goto -> 606
/*     */     //   585: aload #17
/*     */     //   587: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   590: ifeq -> 606
/*     */     //   593: aload_0
/*     */     //   594: aload_1
/*     */     //   595: invokevirtual onHologramArea : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   598: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   601: astore #4
/*     */     //   603: goto -> 2378
/*     */     //   606: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   609: invokevirtual HologramClear : ()Lscala/Enumeration$Value;
/*     */     //   612: aload_2
/*     */     //   613: astore #18
/*     */     //   615: dup
/*     */     //   616: ifnonnull -> 628
/*     */     //   619: pop
/*     */     //   620: aload #18
/*     */     //   622: ifnull -> 636
/*     */     //   625: goto -> 649
/*     */     //   628: aload #18
/*     */     //   630: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   633: ifeq -> 649
/*     */     //   636: aload_0
/*     */     //   637: aload_1
/*     */     //   638: invokevirtual onHologramClear : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   641: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   644: astore #4
/*     */     //   646: goto -> 2378
/*     */     //   649: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   652: invokevirtual HologramColor : ()Lscala/Enumeration$Value;
/*     */     //   655: aload_2
/*     */     //   656: astore #19
/*     */     //   658: dup
/*     */     //   659: ifnonnull -> 671
/*     */     //   662: pop
/*     */     //   663: aload #19
/*     */     //   665: ifnull -> 679
/*     */     //   668: goto -> 692
/*     */     //   671: aload #19
/*     */     //   673: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   676: ifeq -> 692
/*     */     //   679: aload_0
/*     */     //   680: aload_1
/*     */     //   681: invokevirtual onHologramColor : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   684: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   687: astore #4
/*     */     //   689: goto -> 2378
/*     */     //   692: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   695: invokevirtual HologramPowerChange : ()Lscala/Enumeration$Value;
/*     */     //   698: aload_2
/*     */     //   699: astore #20
/*     */     //   701: dup
/*     */     //   702: ifnonnull -> 714
/*     */     //   705: pop
/*     */     //   706: aload #20
/*     */     //   708: ifnull -> 722
/*     */     //   711: goto -> 735
/*     */     //   714: aload #20
/*     */     //   716: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   719: ifeq -> 735
/*     */     //   722: aload_0
/*     */     //   723: aload_1
/*     */     //   724: invokevirtual onHologramPowerChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   727: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   730: astore #4
/*     */     //   732: goto -> 2378
/*     */     //   735: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   738: invokevirtual HologramRotation : ()Lscala/Enumeration$Value;
/*     */     //   741: aload_2
/*     */     //   742: astore #21
/*     */     //   744: dup
/*     */     //   745: ifnonnull -> 757
/*     */     //   748: pop
/*     */     //   749: aload #21
/*     */     //   751: ifnull -> 765
/*     */     //   754: goto -> 778
/*     */     //   757: aload #21
/*     */     //   759: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   762: ifeq -> 778
/*     */     //   765: aload_0
/*     */     //   766: aload_1
/*     */     //   767: invokevirtual onHologramRotation : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   770: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   773: astore #4
/*     */     //   775: goto -> 2378
/*     */     //   778: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   781: invokevirtual HologramRotationSpeed : ()Lscala/Enumeration$Value;
/*     */     //   784: aload_2
/*     */     //   785: astore #22
/*     */     //   787: dup
/*     */     //   788: ifnonnull -> 800
/*     */     //   791: pop
/*     */     //   792: aload #22
/*     */     //   794: ifnull -> 808
/*     */     //   797: goto -> 821
/*     */     //   800: aload #22
/*     */     //   802: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   805: ifeq -> 821
/*     */     //   808: aload_0
/*     */     //   809: aload_1
/*     */     //   810: invokevirtual onHologramRotationSpeed : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   813: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   816: astore #4
/*     */     //   818: goto -> 2378
/*     */     //   821: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   824: invokevirtual HologramScale : ()Lscala/Enumeration$Value;
/*     */     //   827: aload_2
/*     */     //   828: astore #23
/*     */     //   830: dup
/*     */     //   831: ifnonnull -> 843
/*     */     //   834: pop
/*     */     //   835: aload #23
/*     */     //   837: ifnull -> 851
/*     */     //   840: goto -> 864
/*     */     //   843: aload #23
/*     */     //   845: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   848: ifeq -> 864
/*     */     //   851: aload_0
/*     */     //   852: aload_1
/*     */     //   853: invokevirtual onHologramScale : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   856: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   859: astore #4
/*     */     //   861: goto -> 2378
/*     */     //   864: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   867: invokevirtual HologramTranslation : ()Lscala/Enumeration$Value;
/*     */     //   870: aload_2
/*     */     //   871: astore #24
/*     */     //   873: dup
/*     */     //   874: ifnonnull -> 886
/*     */     //   877: pop
/*     */     //   878: aload #24
/*     */     //   880: ifnull -> 894
/*     */     //   883: goto -> 907
/*     */     //   886: aload #24
/*     */     //   888: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   891: ifeq -> 907
/*     */     //   894: aload_0
/*     */     //   895: aload_1
/*     */     //   896: invokevirtual onHologramPositionOffsetY : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   899: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   902: astore #4
/*     */     //   904: goto -> 2378
/*     */     //   907: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   910: invokevirtual HologramValues : ()Lscala/Enumeration$Value;
/*     */     //   913: aload_2
/*     */     //   914: astore #25
/*     */     //   916: dup
/*     */     //   917: ifnonnull -> 929
/*     */     //   920: pop
/*     */     //   921: aload #25
/*     */     //   923: ifnull -> 937
/*     */     //   926: goto -> 950
/*     */     //   929: aload #25
/*     */     //   931: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   934: ifeq -> 950
/*     */     //   937: aload_0
/*     */     //   938: aload_1
/*     */     //   939: invokevirtual onHologramValues : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   942: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   945: astore #4
/*     */     //   947: goto -> 2378
/*     */     //   950: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   953: invokevirtual LootDisk : ()Lscala/Enumeration$Value;
/*     */     //   956: aload_2
/*     */     //   957: astore #26
/*     */     //   959: dup
/*     */     //   960: ifnonnull -> 972
/*     */     //   963: pop
/*     */     //   964: aload #26
/*     */     //   966: ifnull -> 980
/*     */     //   969: goto -> 994
/*     */     //   972: aload #26
/*     */     //   974: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   977: ifeq -> 994
/*     */     //   980: aload_0
/*     */     //   981: aload_1
/*     */     //   982: invokevirtual onLootDisk : (Lli/cil/oc/common/PacketHandler$PacketParser;)Ljava/lang/Object;
/*     */     //   985: pop
/*     */     //   986: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   989: astore #4
/*     */     //   991: goto -> 2378
/*     */     //   994: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   997: invokevirtual CyclingDisk : ()Lscala/Enumeration$Value;
/*     */     //   1000: aload_2
/*     */     //   1001: astore #27
/*     */     //   1003: dup
/*     */     //   1004: ifnonnull -> 1016
/*     */     //   1007: pop
/*     */     //   1008: aload #27
/*     */     //   1010: ifnull -> 1024
/*     */     //   1013: goto -> 1038
/*     */     //   1016: aload #27
/*     */     //   1018: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1021: ifeq -> 1038
/*     */     //   1024: aload_0
/*     */     //   1025: aload_1
/*     */     //   1026: invokevirtual onCyclingDisk : (Lli/cil/oc/common/PacketHandler$PacketParser;)Ljava/lang/Object;
/*     */     //   1029: pop
/*     */     //   1030: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1033: astore #4
/*     */     //   1035: goto -> 2378
/*     */     //   1038: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1041: invokevirtual NanomachinesConfiguration : ()Lscala/Enumeration$Value;
/*     */     //   1044: aload_2
/*     */     //   1045: astore #28
/*     */     //   1047: dup
/*     */     //   1048: ifnonnull -> 1060
/*     */     //   1051: pop
/*     */     //   1052: aload #28
/*     */     //   1054: ifnull -> 1068
/*     */     //   1057: goto -> 1081
/*     */     //   1060: aload #28
/*     */     //   1062: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1065: ifeq -> 1081
/*     */     //   1068: aload_0
/*     */     //   1069: aload_1
/*     */     //   1070: invokevirtual onNanomachinesConfiguration : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1073: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1076: astore #4
/*     */     //   1078: goto -> 2378
/*     */     //   1081: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1084: invokevirtual NanomachinesInputs : ()Lscala/Enumeration$Value;
/*     */     //   1087: aload_2
/*     */     //   1088: astore #29
/*     */     //   1090: dup
/*     */     //   1091: ifnonnull -> 1103
/*     */     //   1094: pop
/*     */     //   1095: aload #29
/*     */     //   1097: ifnull -> 1111
/*     */     //   1100: goto -> 1124
/*     */     //   1103: aload #29
/*     */     //   1105: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1108: ifeq -> 1124
/*     */     //   1111: aload_0
/*     */     //   1112: aload_1
/*     */     //   1113: invokevirtual onNanomachinesInputs : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1116: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1119: astore #4
/*     */     //   1121: goto -> 2378
/*     */     //   1124: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1127: invokevirtual NanomachinesPower : ()Lscala/Enumeration$Value;
/*     */     //   1130: aload_2
/*     */     //   1131: astore #30
/*     */     //   1133: dup
/*     */     //   1134: ifnonnull -> 1146
/*     */     //   1137: pop
/*     */     //   1138: aload #30
/*     */     //   1140: ifnull -> 1154
/*     */     //   1143: goto -> 1167
/*     */     //   1146: aload #30
/*     */     //   1148: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1151: ifeq -> 1167
/*     */     //   1154: aload_0
/*     */     //   1155: aload_1
/*     */     //   1156: invokevirtual onNanomachinesPower : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1159: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1162: astore #4
/*     */     //   1164: goto -> 2378
/*     */     //   1167: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1170: invokevirtual NetSplitterState : ()Lscala/Enumeration$Value;
/*     */     //   1173: aload_2
/*     */     //   1174: astore #31
/*     */     //   1176: dup
/*     */     //   1177: ifnonnull -> 1189
/*     */     //   1180: pop
/*     */     //   1181: aload #31
/*     */     //   1183: ifnull -> 1197
/*     */     //   1186: goto -> 1210
/*     */     //   1189: aload #31
/*     */     //   1191: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1194: ifeq -> 1210
/*     */     //   1197: aload_0
/*     */     //   1198: aload_1
/*     */     //   1199: invokevirtual onNetSplitterState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1202: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1205: astore #4
/*     */     //   1207: goto -> 2378
/*     */     //   1210: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1213: invokevirtual NetworkActivity : ()Lscala/Enumeration$Value;
/*     */     //   1216: aload_2
/*     */     //   1217: astore #32
/*     */     //   1219: dup
/*     */     //   1220: ifnonnull -> 1232
/*     */     //   1223: pop
/*     */     //   1224: aload #32
/*     */     //   1226: ifnull -> 1240
/*     */     //   1229: goto -> 1254
/*     */     //   1232: aload #32
/*     */     //   1234: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1237: ifeq -> 1254
/*     */     //   1240: aload_0
/*     */     //   1241: aload_1
/*     */     //   1242: invokevirtual onNetworkActivity : (Lli/cil/oc/common/PacketHandler$PacketParser;)Ljava/lang/Object;
/*     */     //   1245: pop
/*     */     //   1246: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1249: astore #4
/*     */     //   1251: goto -> 2378
/*     */     //   1254: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1257: invokevirtual ParticleEffect : ()Lscala/Enumeration$Value;
/*     */     //   1260: aload_2
/*     */     //   1261: astore #33
/*     */     //   1263: dup
/*     */     //   1264: ifnonnull -> 1276
/*     */     //   1267: pop
/*     */     //   1268: aload #33
/*     */     //   1270: ifnull -> 1284
/*     */     //   1273: goto -> 1297
/*     */     //   1276: aload #33
/*     */     //   1278: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1281: ifeq -> 1297
/*     */     //   1284: aload_0
/*     */     //   1285: aload_1
/*     */     //   1286: invokevirtual onParticleEffect : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1289: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1292: astore #4
/*     */     //   1294: goto -> 2378
/*     */     //   1297: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1300: invokevirtual PetVisibility : ()Lscala/Enumeration$Value;
/*     */     //   1303: aload_2
/*     */     //   1304: astore #34
/*     */     //   1306: dup
/*     */     //   1307: ifnonnull -> 1319
/*     */     //   1310: pop
/*     */     //   1311: aload #34
/*     */     //   1313: ifnull -> 1327
/*     */     //   1316: goto -> 1340
/*     */     //   1319: aload #34
/*     */     //   1321: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1324: ifeq -> 1340
/*     */     //   1327: aload_0
/*     */     //   1328: aload_1
/*     */     //   1329: invokevirtual onPetVisibility : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1332: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1335: astore #4
/*     */     //   1337: goto -> 2378
/*     */     //   1340: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1343: invokevirtual PowerState : ()Lscala/Enumeration$Value;
/*     */     //   1346: aload_2
/*     */     //   1347: astore #35
/*     */     //   1349: dup
/*     */     //   1350: ifnonnull -> 1362
/*     */     //   1353: pop
/*     */     //   1354: aload #35
/*     */     //   1356: ifnull -> 1370
/*     */     //   1359: goto -> 1383
/*     */     //   1362: aload #35
/*     */     //   1364: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1367: ifeq -> 1383
/*     */     //   1370: aload_0
/*     */     //   1371: aload_1
/*     */     //   1372: invokevirtual onPowerState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1375: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1378: astore #4
/*     */     //   1380: goto -> 2378
/*     */     //   1383: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1386: invokevirtual PrinterState : ()Lscala/Enumeration$Value;
/*     */     //   1389: aload_2
/*     */     //   1390: astore #36
/*     */     //   1392: dup
/*     */     //   1393: ifnonnull -> 1405
/*     */     //   1396: pop
/*     */     //   1397: aload #36
/*     */     //   1399: ifnull -> 1413
/*     */     //   1402: goto -> 1426
/*     */     //   1405: aload #36
/*     */     //   1407: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1410: ifeq -> 1426
/*     */     //   1413: aload_0
/*     */     //   1414: aload_1
/*     */     //   1415: invokevirtual onPrinterState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1418: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1421: astore #4
/*     */     //   1423: goto -> 2378
/*     */     //   1426: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1429: invokevirtual RackInventory : ()Lscala/Enumeration$Value;
/*     */     //   1432: aload_2
/*     */     //   1433: astore #37
/*     */     //   1435: dup
/*     */     //   1436: ifnonnull -> 1448
/*     */     //   1439: pop
/*     */     //   1440: aload #37
/*     */     //   1442: ifnull -> 1456
/*     */     //   1445: goto -> 1469
/*     */     //   1448: aload #37
/*     */     //   1450: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1453: ifeq -> 1469
/*     */     //   1456: aload_0
/*     */     //   1457: aload_1
/*     */     //   1458: invokevirtual onRackInventory : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1461: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1464: astore #4
/*     */     //   1466: goto -> 2378
/*     */     //   1469: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1472: invokevirtual RackMountableData : ()Lscala/Enumeration$Value;
/*     */     //   1475: aload_2
/*     */     //   1476: astore #38
/*     */     //   1478: dup
/*     */     //   1479: ifnonnull -> 1491
/*     */     //   1482: pop
/*     */     //   1483: aload #38
/*     */     //   1485: ifnull -> 1499
/*     */     //   1488: goto -> 1512
/*     */     //   1491: aload #38
/*     */     //   1493: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1496: ifeq -> 1512
/*     */     //   1499: aload_0
/*     */     //   1500: aload_1
/*     */     //   1501: invokevirtual onRackMountableData : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1504: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1507: astore #4
/*     */     //   1509: goto -> 2378
/*     */     //   1512: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1515: invokevirtual RaidStateChange : ()Lscala/Enumeration$Value;
/*     */     //   1518: aload_2
/*     */     //   1519: astore #39
/*     */     //   1521: dup
/*     */     //   1522: ifnonnull -> 1534
/*     */     //   1525: pop
/*     */     //   1526: aload #39
/*     */     //   1528: ifnull -> 1542
/*     */     //   1531: goto -> 1555
/*     */     //   1534: aload #39
/*     */     //   1536: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1539: ifeq -> 1555
/*     */     //   1542: aload_0
/*     */     //   1543: aload_1
/*     */     //   1544: invokevirtual onRaidStateChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1547: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1550: astore #4
/*     */     //   1552: goto -> 2378
/*     */     //   1555: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1558: invokevirtual RedstoneState : ()Lscala/Enumeration$Value;
/*     */     //   1561: aload_2
/*     */     //   1562: astore #40
/*     */     //   1564: dup
/*     */     //   1565: ifnonnull -> 1577
/*     */     //   1568: pop
/*     */     //   1569: aload #40
/*     */     //   1571: ifnull -> 1585
/*     */     //   1574: goto -> 1598
/*     */     //   1577: aload #40
/*     */     //   1579: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1582: ifeq -> 1598
/*     */     //   1585: aload_0
/*     */     //   1586: aload_1
/*     */     //   1587: invokevirtual onRedstoneState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1590: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1593: astore #4
/*     */     //   1595: goto -> 2378
/*     */     //   1598: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1601: invokevirtual RobotAnimateSwing : ()Lscala/Enumeration$Value;
/*     */     //   1604: aload_2
/*     */     //   1605: astore #41
/*     */     //   1607: dup
/*     */     //   1608: ifnonnull -> 1620
/*     */     //   1611: pop
/*     */     //   1612: aload #41
/*     */     //   1614: ifnull -> 1628
/*     */     //   1617: goto -> 1641
/*     */     //   1620: aload #41
/*     */     //   1622: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1625: ifeq -> 1641
/*     */     //   1628: aload_0
/*     */     //   1629: aload_1
/*     */     //   1630: invokevirtual onRobotAnimateSwing : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1633: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1636: astore #4
/*     */     //   1638: goto -> 2378
/*     */     //   1641: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1644: invokevirtual RobotAnimateTurn : ()Lscala/Enumeration$Value;
/*     */     //   1647: aload_2
/*     */     //   1648: astore #42
/*     */     //   1650: dup
/*     */     //   1651: ifnonnull -> 1663
/*     */     //   1654: pop
/*     */     //   1655: aload #42
/*     */     //   1657: ifnull -> 1671
/*     */     //   1660: goto -> 1684
/*     */     //   1663: aload #42
/*     */     //   1665: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1668: ifeq -> 1684
/*     */     //   1671: aload_0
/*     */     //   1672: aload_1
/*     */     //   1673: invokevirtual onRobotAnimateTurn : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1676: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1679: astore #4
/*     */     //   1681: goto -> 2378
/*     */     //   1684: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1687: invokevirtual RobotAssemblingState : ()Lscala/Enumeration$Value;
/*     */     //   1690: aload_2
/*     */     //   1691: astore #43
/*     */     //   1693: dup
/*     */     //   1694: ifnonnull -> 1706
/*     */     //   1697: pop
/*     */     //   1698: aload #43
/*     */     //   1700: ifnull -> 1714
/*     */     //   1703: goto -> 1727
/*     */     //   1706: aload #43
/*     */     //   1708: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1711: ifeq -> 1727
/*     */     //   1714: aload_0
/*     */     //   1715: aload_1
/*     */     //   1716: invokevirtual onRobotAssemblingState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1719: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1722: astore #4
/*     */     //   1724: goto -> 2378
/*     */     //   1727: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1730: invokevirtual RobotInventoryChange : ()Lscala/Enumeration$Value;
/*     */     //   1733: aload_2
/*     */     //   1734: astore #44
/*     */     //   1736: dup
/*     */     //   1737: ifnonnull -> 1749
/*     */     //   1740: pop
/*     */     //   1741: aload #44
/*     */     //   1743: ifnull -> 1757
/*     */     //   1746: goto -> 1770
/*     */     //   1749: aload #44
/*     */     //   1751: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1754: ifeq -> 1770
/*     */     //   1757: aload_0
/*     */     //   1758: aload_1
/*     */     //   1759: invokevirtual onRobotInventoryChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1762: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1765: astore #4
/*     */     //   1767: goto -> 2378
/*     */     //   1770: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1773: invokevirtual RobotLightChange : ()Lscala/Enumeration$Value;
/*     */     //   1776: aload_2
/*     */     //   1777: astore #45
/*     */     //   1779: dup
/*     */     //   1780: ifnonnull -> 1792
/*     */     //   1783: pop
/*     */     //   1784: aload #45
/*     */     //   1786: ifnull -> 1800
/*     */     //   1789: goto -> 1813
/*     */     //   1792: aload #45
/*     */     //   1794: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1797: ifeq -> 1813
/*     */     //   1800: aload_0
/*     */     //   1801: aload_1
/*     */     //   1802: invokevirtual onRobotLightChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1805: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1808: astore #4
/*     */     //   1810: goto -> 2378
/*     */     //   1813: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1816: invokevirtual RobotMove : ()Lscala/Enumeration$Value;
/*     */     //   1819: aload_2
/*     */     //   1820: astore #46
/*     */     //   1822: dup
/*     */     //   1823: ifnonnull -> 1835
/*     */     //   1826: pop
/*     */     //   1827: aload #46
/*     */     //   1829: ifnull -> 1843
/*     */     //   1832: goto -> 1857
/*     */     //   1835: aload #46
/*     */     //   1837: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1840: ifeq -> 1857
/*     */     //   1843: aload_0
/*     */     //   1844: aload_1
/*     */     //   1845: invokevirtual onRobotMove : (Lli/cil/oc/common/PacketHandler$PacketParser;)Ljava/lang/Object;
/*     */     //   1848: pop
/*     */     //   1849: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1852: astore #4
/*     */     //   1854: goto -> 2378
/*     */     //   1857: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1860: invokevirtual RobotNameChange : ()Lscala/Enumeration$Value;
/*     */     //   1863: aload_2
/*     */     //   1864: astore #47
/*     */     //   1866: dup
/*     */     //   1867: ifnonnull -> 1879
/*     */     //   1870: pop
/*     */     //   1871: aload #47
/*     */     //   1873: ifnull -> 1887
/*     */     //   1876: goto -> 1900
/*     */     //   1879: aload #47
/*     */     //   1881: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1884: ifeq -> 1900
/*     */     //   1887: aload_0
/*     */     //   1888: aload_1
/*     */     //   1889: invokevirtual onRobotNameChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1892: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1895: astore #4
/*     */     //   1897: goto -> 2378
/*     */     //   1900: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1903: invokevirtual RobotSelectedSlotChange : ()Lscala/Enumeration$Value;
/*     */     //   1906: aload_2
/*     */     //   1907: astore #48
/*     */     //   1909: dup
/*     */     //   1910: ifnonnull -> 1922
/*     */     //   1913: pop
/*     */     //   1914: aload #48
/*     */     //   1916: ifnull -> 1930
/*     */     //   1919: goto -> 1943
/*     */     //   1922: aload #48
/*     */     //   1924: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1927: ifeq -> 1943
/*     */     //   1930: aload_0
/*     */     //   1931: aload_1
/*     */     //   1932: invokevirtual onRobotSelectedSlotChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1935: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1938: astore #4
/*     */     //   1940: goto -> 2378
/*     */     //   1943: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1946: invokevirtual RotatableState : ()Lscala/Enumeration$Value;
/*     */     //   1949: aload_2
/*     */     //   1950: astore #49
/*     */     //   1952: dup
/*     */     //   1953: ifnonnull -> 1965
/*     */     //   1956: pop
/*     */     //   1957: aload #49
/*     */     //   1959: ifnull -> 1973
/*     */     //   1962: goto -> 1986
/*     */     //   1965: aload #49
/*     */     //   1967: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1970: ifeq -> 1986
/*     */     //   1973: aload_0
/*     */     //   1974: aload_1
/*     */     //   1975: invokevirtual onRotatableState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   1978: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1981: astore #4
/*     */     //   1983: goto -> 2378
/*     */     //   1986: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   1989: invokevirtual SwitchActivity : ()Lscala/Enumeration$Value;
/*     */     //   1992: aload_2
/*     */     //   1993: astore #50
/*     */     //   1995: dup
/*     */     //   1996: ifnonnull -> 2008
/*     */     //   1999: pop
/*     */     //   2000: aload #50
/*     */     //   2002: ifnull -> 2016
/*     */     //   2005: goto -> 2029
/*     */     //   2008: aload #50
/*     */     //   2010: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2013: ifeq -> 2029
/*     */     //   2016: aload_0
/*     */     //   2017: aload_1
/*     */     //   2018: invokevirtual onSwitchActivity : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2021: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2024: astore #4
/*     */     //   2026: goto -> 2378
/*     */     //   2029: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2032: invokevirtual TextBufferInit : ()Lscala/Enumeration$Value;
/*     */     //   2035: aload_2
/*     */     //   2036: astore #51
/*     */     //   2038: dup
/*     */     //   2039: ifnonnull -> 2051
/*     */     //   2042: pop
/*     */     //   2043: aload #51
/*     */     //   2045: ifnull -> 2059
/*     */     //   2048: goto -> 2072
/*     */     //   2051: aload #51
/*     */     //   2053: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2056: ifeq -> 2072
/*     */     //   2059: aload_0
/*     */     //   2060: aload_1
/*     */     //   2061: invokevirtual onTextBufferInit : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2064: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2067: astore #4
/*     */     //   2069: goto -> 2378
/*     */     //   2072: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2075: invokevirtual TextBufferPowerChange : ()Lscala/Enumeration$Value;
/*     */     //   2078: aload_2
/*     */     //   2079: astore #52
/*     */     //   2081: dup
/*     */     //   2082: ifnonnull -> 2094
/*     */     //   2085: pop
/*     */     //   2086: aload #52
/*     */     //   2088: ifnull -> 2102
/*     */     //   2091: goto -> 2115
/*     */     //   2094: aload #52
/*     */     //   2096: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2099: ifeq -> 2115
/*     */     //   2102: aload_0
/*     */     //   2103: aload_1
/*     */     //   2104: invokevirtual onTextBufferPowerChange : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2107: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2110: astore #4
/*     */     //   2112: goto -> 2378
/*     */     //   2115: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2118: invokevirtual TextBufferMulti : ()Lscala/Enumeration$Value;
/*     */     //   2121: aload_2
/*     */     //   2122: astore #53
/*     */     //   2124: dup
/*     */     //   2125: ifnonnull -> 2137
/*     */     //   2128: pop
/*     */     //   2129: aload #53
/*     */     //   2131: ifnull -> 2145
/*     */     //   2134: goto -> 2158
/*     */     //   2137: aload #53
/*     */     //   2139: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2142: ifeq -> 2158
/*     */     //   2145: aload_0
/*     */     //   2146: aload_1
/*     */     //   2147: invokevirtual onTextBufferMulti : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2150: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2153: astore #4
/*     */     //   2155: goto -> 2378
/*     */     //   2158: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2161: invokevirtual ScreenTouchMode : ()Lscala/Enumeration$Value;
/*     */     //   2164: aload_2
/*     */     //   2165: astore #54
/*     */     //   2167: dup
/*     */     //   2168: ifnonnull -> 2180
/*     */     //   2171: pop
/*     */     //   2172: aload #54
/*     */     //   2174: ifnull -> 2188
/*     */     //   2177: goto -> 2201
/*     */     //   2180: aload #54
/*     */     //   2182: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2185: ifeq -> 2201
/*     */     //   2188: aload_0
/*     */     //   2189: aload_1
/*     */     //   2190: invokevirtual onScreenTouchMode : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2193: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2196: astore #4
/*     */     //   2198: goto -> 2378
/*     */     //   2201: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2204: invokevirtual Sound : ()Lscala/Enumeration$Value;
/*     */     //   2207: aload_2
/*     */     //   2208: astore #55
/*     */     //   2210: dup
/*     */     //   2211: ifnonnull -> 2223
/*     */     //   2214: pop
/*     */     //   2215: aload #55
/*     */     //   2217: ifnull -> 2231
/*     */     //   2220: goto -> 2244
/*     */     //   2223: aload #55
/*     */     //   2225: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2228: ifeq -> 2244
/*     */     //   2231: aload_0
/*     */     //   2232: aload_1
/*     */     //   2233: invokevirtual onSound : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2236: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2239: astore #4
/*     */     //   2241: goto -> 2378
/*     */     //   2244: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2247: invokevirtual SoundPattern : ()Lscala/Enumeration$Value;
/*     */     //   2250: aload_2
/*     */     //   2251: astore #56
/*     */     //   2253: dup
/*     */     //   2254: ifnonnull -> 2266
/*     */     //   2257: pop
/*     */     //   2258: aload #56
/*     */     //   2260: ifnull -> 2274
/*     */     //   2263: goto -> 2287
/*     */     //   2266: aload #56
/*     */     //   2268: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2271: ifeq -> 2287
/*     */     //   2274: aload_0
/*     */     //   2275: aload_1
/*     */     //   2276: invokevirtual onSoundPattern : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2279: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2282: astore #4
/*     */     //   2284: goto -> 2378
/*     */     //   2287: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2290: invokevirtual TransposerActivity : ()Lscala/Enumeration$Value;
/*     */     //   2293: aload_2
/*     */     //   2294: astore #57
/*     */     //   2296: dup
/*     */     //   2297: ifnonnull -> 2309
/*     */     //   2300: pop
/*     */     //   2301: aload #57
/*     */     //   2303: ifnull -> 2317
/*     */     //   2306: goto -> 2330
/*     */     //   2309: aload #57
/*     */     //   2311: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2314: ifeq -> 2330
/*     */     //   2317: aload_0
/*     */     //   2318: aload_1
/*     */     //   2319: invokevirtual onTransposerActivity : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2322: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2325: astore #4
/*     */     //   2327: goto -> 2378
/*     */     //   2330: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   2333: invokevirtual WaypointLabel : ()Lscala/Enumeration$Value;
/*     */     //   2336: aload_2
/*     */     //   2337: astore #58
/*     */     //   2339: dup
/*     */     //   2340: ifnonnull -> 2352
/*     */     //   2343: pop
/*     */     //   2344: aload #58
/*     */     //   2346: ifnull -> 2360
/*     */     //   2349: goto -> 2373
/*     */     //   2352: aload #58
/*     */     //   2354: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2357: ifeq -> 2373
/*     */     //   2360: aload_0
/*     */     //   2361: aload_1
/*     */     //   2362: invokevirtual onWaypointLabel : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   2365: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2368: astore #4
/*     */     //   2370: goto -> 2378
/*     */     //   2373: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   2376: astore #4
/*     */     //   2378: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #44	-> 0
/*     */     //   #45	-> 5
/*     */     //   #46	-> 46
/*     */     //   #47	-> 89
/*     */     //   #48	-> 132
/*     */     //   #49	-> 175
/*     */     //   #50	-> 218
/*     */     //   #51	-> 261
/*     */     //   #52	-> 304
/*     */     //   #53	-> 347
/*     */     //   #54	-> 390
/*     */     //   #55	-> 433
/*     */     //   #56	-> 476
/*     */     //   #57	-> 520
/*     */     //   #58	-> 563
/*     */     //   #59	-> 606
/*     */     //   #60	-> 649
/*     */     //   #61	-> 692
/*     */     //   #62	-> 735
/*     */     //   #63	-> 778
/*     */     //   #64	-> 821
/*     */     //   #65	-> 864
/*     */     //   #66	-> 907
/*     */     //   #67	-> 950
/*     */     //   #68	-> 994
/*     */     //   #69	-> 1038
/*     */     //   #70	-> 1081
/*     */     //   #71	-> 1124
/*     */     //   #72	-> 1167
/*     */     //   #73	-> 1210
/*     */     //   #74	-> 1254
/*     */     //   #75	-> 1297
/*     */     //   #76	-> 1340
/*     */     //   #77	-> 1383
/*     */     //   #78	-> 1426
/*     */     //   #79	-> 1469
/*     */     //   #80	-> 1512
/*     */     //   #81	-> 1555
/*     */     //   #82	-> 1598
/*     */     //   #83	-> 1641
/*     */     //   #84	-> 1684
/*     */     //   #85	-> 1727
/*     */     //   #86	-> 1770
/*     */     //   #87	-> 1813
/*     */     //   #88	-> 1857
/*     */     //   #89	-> 1900
/*     */     //   #90	-> 1943
/*     */     //   #91	-> 1986
/*     */     //   #92	-> 2029
/*     */     //   #93	-> 2072
/*     */     //   #94	-> 2115
/*     */     //   #95	-> 2158
/*     */     //   #96	-> 2201
/*     */     //   #97	-> 2244
/*     */     //   #98	-> 2287
/*     */     //   #99	-> 2330
/*     */     //   #100	-> 2373
/*     */     //   #44	-> 2378
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	2379	0	this	Lli/cil/oc/client/PacketHandler$;
/*     */     //   0	2379	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
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
/*     */   public Object onAbstractBusState(PacketHandler.PacketParser p) {
/*     */     BoxedUnit boxedUnit;
/* 105 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(AbstractBusAware.class));
/* 106 */     if (option instanceof Some) { Some some = (Some)option; AbstractBusAware t = (AbstractBusAware)some.x(), abstractBusAware1 = t.isAbstractBusAvailable_$eq(p.readBoolean()); }
/* 107 */     else { boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     return boxedUnit;
/*     */   } public void onAdapterState(PacketHandler.PacketParser p) {
/* 111 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Adapter.class));
/* 112 */     if (option instanceof Some) { Some some = (Some)option; Adapter t = (Adapter)some.x();
/* 113 */       t.openSides_$eq(t.uncompressSides(p.readByte()));
/* 114 */       t.world().func_147471_g(t.x(), t.y(), t.z()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 115 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onAnalyze(PacketHandler.PacketParser p) {
/* 119 */     String address = p.readUTF();
/* 120 */     if (Keyboard.isKeyDown(29) || Keyboard.isKeyDown(29)) {
/* 121 */       GuiScreen.func_146275_d(address);
/* 122 */       p.player().func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.AddressCopied());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onChargerState(PacketHandler.PacketParser p) {
/* 127 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Charger.class));
/* 128 */     if (option instanceof Some) { Some some = (Some)option; Charger t = (Charger)some.x();
/* 129 */       t.chargeSpeed_$eq(p.readDouble());
/* 130 */       t.hasPower_$eq(p.readBoolean());
/* 131 */       li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(t.world()).markBlockForUpdate(t.position()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 132 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onClientLog(PacketHandler.PacketParser p) {
/* 136 */     li.cil.oc.OpenComputers$.MODULE$.log().info(p.readUTF());
/*     */   }
/*     */   
/*     */   public void onClipboard(PacketHandler.PacketParser p) {
/* 140 */     GuiScreen.func_146275_d(p.readUTF());
/*     */   }
/*     */   
/*     */   public void onColorChange(PacketHandler.PacketParser p) {
/* 144 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Colored.class));
/* 145 */     if (option instanceof Some) { Some some = (Some)option; Colored t = (Colored)some.x();
/* 146 */       t.color_$eq(p.readInt());
/* 147 */       li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(t.world()).markBlockForUpdate(t.position()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 148 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onComputerState(PacketHandler.PacketParser p) {
/* 152 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Computer.class));
/* 153 */     if (option instanceof Some) { Some some = (Some)option; Computer t = (Computer)some.x();
/* 154 */       t.setRunning(p.readBoolean());
/* 155 */       t.hasErrored_$eq(p.readBoolean()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 156 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/* 160 */   public void onComputerUserList(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Computer.class));
/* 161 */     if (option instanceof Some) { Some some = (Some)option; Computer t = (Computer)some.x();
/* 162 */       int count = p.readInt();
/* 163 */       t.setUsers((Iterable)scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), count).map((Function1)new PacketHandler$$anonfun$onComputerUserList$1(p), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 164 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketHandler$$anonfun$onComputerUserList$1 extends AbstractFunction1<Object, String> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final PacketHandler.PacketParser p$1; public final String apply(int x$1) { return this.p$1.readUTF(); } public PacketHandler$$anonfun$onComputerUserList$1(PacketHandler.PacketParser p$1) {} }
/*     */   public void onContainerUpdate(PacketHandler.PacketParser p) {
/* 168 */     int windowId = p.readUnsignedByte();
/* 169 */     if ((p.player()).field_71070_bA != null && (p.player()).field_71070_bA.field_75152_c == windowId) {
/* 170 */       Container container = (p.player()).field_71070_bA;
/* 171 */       if (container instanceof Player) { Player player = (Player)container; player.updateCustomData(p.readNBT()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 172 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onDisassemblerActiveChange(PacketHandler.PacketParser p) {
/* 178 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Disassembler.class));
/* 179 */     if (option instanceof Some) { Some some = (Some)option; Disassembler t = (Disassembler)some.x(); t.isActive_$eq(p.readBoolean()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 180 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   } public Object onFileSystemActivity(PacketHandler.PacketParser p) {
/*     */     BoxedUnit boxedUnit1, boxedUnit2;
/* 184 */     String sound = p.readUTF();
/* 185 */     NBTTagCompound data = CompressedStreamTools.func_74794_a((DataInputStream)p);
/* 186 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(TileEntity.class));
/* 187 */     if (option instanceof Some) { Some some = (Some)option; TileEntity t = (TileEntity)some.x();
/* 188 */       Boolean bool = BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new FileSystemAccessEvent.Client(sound, t, data))); }
/* 189 */     else { boxedUnit1 = BoxedUnit.UNIT; }
/*     */     
/* 191 */     Option<World> option1 = world(p.player(), p.readInt());
/* 192 */     if (option1 instanceof Some) { Some some = (Some)option1; World world = (World)some.x();
/* 193 */       double x = p.readDouble();
/* 194 */       double y = p.readDouble();
/* 195 */       double z = p.readDouble();
/* 196 */       Boolean bool = BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new FileSystemAccessEvent.Client(sound, world, x, y, z, data))); }
/* 197 */     else { boxedUnit2 = BoxedUnit.UNIT; }
/*     */     
/*     */     return p.readBoolean() ? boxedUnit1 : boxedUnit2;
/*     */   } public Object onNetworkActivity(PacketHandler.PacketParser p) {
/*     */     BoxedUnit boxedUnit1, boxedUnit2;
/* 202 */     NBTTagCompound data = CompressedStreamTools.func_74794_a((DataInputStream)p);
/* 203 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(TileEntity.class));
/* 204 */     if (option instanceof Some) { Some some = (Some)option; TileEntity t = (TileEntity)some.x();
/* 205 */       Boolean bool = BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new NetworkActivityEvent.Client(t, data))); }
/* 206 */     else { boxedUnit1 = BoxedUnit.UNIT; }
/*     */     
/* 208 */     Option<World> option1 = world(p.player(), p.readInt());
/* 209 */     if (option1 instanceof Some) { Some some = (Some)option1; World world = (World)some.x();
/* 210 */       double x = p.readDouble();
/* 211 */       double y = p.readDouble();
/* 212 */       double z = p.readDouble();
/* 213 */       Boolean bool = BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new NetworkActivityEvent.Client(world, x, y, z, data))); }
/* 214 */     else { boxedUnit2 = BoxedUnit.UNIT; }
/*     */     
/*     */     return p.readBoolean() ? boxedUnit1 : boxedUnit2;
/*     */   }
/*     */   public void onFloppyChange(PacketHandler.PacketParser p) {
/* 219 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(DiskDrive.class));
/* 220 */     if (option instanceof Some) { Some some = (Some)option; DiskDrive t = (DiskDrive)some.x(); t.func_70299_a(0, p.readItemStack()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 221 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/* 225 */   public void onHologramClear(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 226 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 227 */       scala.Predef$.MODULE$.intArrayOps(t.volume()).indices().foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onHologramClear$1(t));
/* 228 */       t.needsRendering_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 229 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketHandler$$anonfun$onHologramClear$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Hologram t$2; public final void apply(int i) { apply$mcVI$sp(i); } public void apply$mcVI$sp(int i) { this.t$2.volume()[i] = 0; }
/*     */     public PacketHandler$$anonfun$onHologramClear$1(Hologram t$2) {} }
/* 233 */   public void onHologramColor(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 234 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 235 */       int index = p.readInt();
/* 236 */       int value = p.readInt();
/* 237 */       t.colors()[index] = value & 0xFFFFFF;
/* 238 */       t.needsRendering_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 239 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */   
/*     */   public void onHologramPowerChange(PacketHandler.PacketParser p) {
/* 243 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 244 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x(); t.hasPower_$eq(p.readBoolean()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 245 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onHologramScale(PacketHandler.PacketParser p) {
/* 249 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 250 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 251 */       t.scale_$eq(p.readDouble()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 252 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/* 256 */   public void onHologramArea(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 257 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 258 */       int fromX = p.readByte();
/* 259 */       int untilX = p.readByte();
/* 260 */       int fromZ = p.readByte();
/* 261 */       int untilZ = p.readByte(); scala.runtime.RichInt$.MODULE$
/* 262 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(fromX), untilX).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onHologramArea$1(p, t, fromZ, untilZ));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 268 */       t.needsRendering_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 269 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } public final class PacketHandler$$anonfun$onHologramArea$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final PacketHandler.PacketParser p$2; public final Hologram t$1; private final int fromZ$1; private final int untilZ$1; public final void apply(int x) { apply$mcVI$sp(x); } public PacketHandler$$anonfun$onHologramArea$1(PacketHandler.PacketParser p$2, Hologram t$1, int fromZ$1, int untilZ$1) {} public void apply$mcVI$sp(int x) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(this.fromZ$1), this.untilZ$1).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onHologramArea$1$$anonfun$apply$mcVI$sp$1(this, x)); } public final class PacketHandler$$anonfun$onHologramArea$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int x$11; public final void apply(int z) { apply$mcVI$sp(z); } public PacketHandler$$anonfun$onHologramArea$1$$anonfun$apply$mcVI$sp$1(PacketHandler$$anonfun$onHologramArea$1 $outer, int x$11) {}
/*     */       public void apply$mcVI$sp(int z) { this.$outer.t$1.volume()[this.x$11 + z * 48] = this.$outer.p$2.readInt(); this.$outer.t$1.volume()[this.x$11 + z * 48 + 2304] = this.$outer.p$2.readInt(); } } }
/* 273 */   public void onHologramValues(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 274 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 275 */       int count = p.readInt(); scala.runtime.RichInt$.MODULE$
/* 276 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), count).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onHologramValues$1(p, t));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 283 */       t.needsRendering_$eq(true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 284 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketHandler$$anonfun$onHologramValues$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final PacketHandler.PacketParser p$3; private final Hologram t$3; public final void apply(int i) { apply$mcVI$sp(i); } public PacketHandler$$anonfun$onHologramValues$1(PacketHandler.PacketParser p$3, Hologram t$3) {}
/*     */     public void apply$mcVI$sp(int i) { short xz = this.p$3.readShort(); byte x = (byte)(xz >> 8); byte z = (byte)xz; this.t$3.volume()[x + z * 48] = this.p$3.readInt(); this.t$3.volume()[x + z * 48 + 2304] = this.p$3.readInt(); } }
/* 288 */   public void onHologramPositionOffsetY(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 289 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 290 */       (t.translation()).field_72450_a = p.readDouble();
/* 291 */       (t.translation()).field_72448_b = p.readDouble();
/* 292 */       (t.translation()).field_72449_c = p.readDouble(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 293 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */   
/*     */   public void onHologramRotation(PacketHandler.PacketParser p) {
/* 297 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 298 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 299 */       t.rotationAngle_$eq(p.readFloat());
/* 300 */       t.rotationX_$eq(p.readFloat());
/* 301 */       t.rotationY_$eq(p.readFloat());
/* 302 */       t.rotationZ_$eq(p.readFloat()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 303 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onHologramRotationSpeed(PacketHandler.PacketParser p) {
/* 307 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Hologram.class));
/* 308 */     if (option instanceof Some) { Some some = (Some)option; Hologram t = (Hologram)some.x();
/* 309 */       t.rotationSpeed_$eq(p.readFloat());
/* 310 */       t.rotationSpeedX_$eq(p.readFloat());
/* 311 */       t.rotationSpeedY_$eq(p.readFloat());
/* 312 */       t.rotationSpeedZ_$eq(p.readFloat()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 313 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public Object onLootDisk(PacketHandler.PacketParser p) {
/* 317 */     ItemStack stack = p.readItemStack();
/* 318 */     return (stack == null) ? BoxedUnit.UNIT : 
/* 319 */       li.cil.oc.common.Loot$.MODULE$.disksForClient().$plus$eq(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object onCyclingDisk(PacketHandler.PacketParser p) {
/* 324 */     ItemStack stack = p.readItemStack();
/* 325 */     return (stack == null) ? BoxedUnit.UNIT : 
/* 326 */       li.cil.oc.common.Loot$.MODULE$.disksForCyclingClient().$plus$eq(stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onNanomachinesConfiguration(PacketHandler.PacketParser p) {
/* 331 */     Option option = p.readEntity(scala.reflect.ClassTag$.MODULE$.apply(EntityPlayer.class));
/* 332 */     if (option instanceof Some) { Some some = (Some)option; EntityPlayer player = (EntityPlayer)some.x();
/* 333 */       boolean hasController = p.readBoolean();
/*     */       
/* 335 */       Controller controller = Nanomachines.installController(player);
/* 336 */       if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller; controllerImpl.load(p.readNBT()); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 337 */       else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */ 
/*     */ 
/*     */       
/* 341 */       Nanomachines.uninstallController(player); BoxedUnit boxedUnit = hasController ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */     else
/* 343 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public void onNanomachinesInputs(PacketHandler.PacketParser p) {
/* 348 */     Option option = p.readEntity(scala.reflect.ClassTag$.MODULE$.apply(EntityPlayer.class));
/* 349 */     if (option instanceof Some) { Some some = (Some)option; EntityPlayer player = (EntityPlayer)some.x(); Controller controller = Nanomachines.getController(player);
/* 350 */       if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller;
/* 351 */         byte[] inputs = new byte[p.readInt()];
/* 352 */         p.read(inputs);
/* 353 */         synchronized (controllerImpl.configuration()) {
/* 354 */           scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.byteArrayOps(inputs).zipWithIndex(scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(Tuple2.class)))).withFilter((Function1)new PacketHandler$$anonfun$onNanomachinesInputs$1()).withFilter((Function1)new PacketHandler$$anonfun$onNanomachinesInputs$2(controllerImpl)).foreach((Function1)new PacketHandler$$anonfun$onNanomachinesInputs$3(controllerImpl));
/*     */ 
/*     */           
/* 357 */           controllerImpl.activeBehaviorsDirty_$eq(true); BoxedUnit boxedUnit4 = BoxedUnit.UNIT; BoxedUnit boxedUnit3 = boxedUnit4; BoxedUnit boxedUnit2 = BoxedUnit.UNIT; return;
/*     */         }  }
/* 359 */        BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */     else
/* 361 */     { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   } public final class PacketHandler$$anonfun$onNanomachinesInputs$1 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class PacketHandler$$anonfun$onNanomachinesInputs$2 extends AbstractFunction1<Tuple2<Object, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ControllerImpl x2$1; public final boolean apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { int index = tuple2._2$mcI$sp(); return (index < this.x2$1.configuration().triggers().length()); }  throw new MatchError(tuple2); } public PacketHandler$$anonfun$onNanomachinesInputs$2(ControllerImpl x2$1) {} } public final class PacketHandler$$anonfun$onNanomachinesInputs$3 extends AbstractFunction1<Tuple2<Object, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ControllerImpl x2$1; public final void apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { byte value = BoxesRunTime.unboxToByte(tuple2._1()); int index = tuple2._2$mcI$sp(); ((NeuralNetwork.TriggerNeuron)this.x2$1.configuration().triggers().apply(index)).isActive_$eq((value == 1)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public PacketHandler$$anonfun$onNanomachinesInputs$3(ControllerImpl x2$1) {} }
/* 366 */   public void onNanomachinesPower(PacketHandler.PacketParser p) { Option option = p.readEntity(scala.reflect.ClassTag$.MODULE$.apply(EntityPlayer.class));
/* 367 */     if (option instanceof Some) { Some some = (Some)option; EntityPlayer player = (EntityPlayer)some.x(); Controller controller = Nanomachines.getController(player);
/* 368 */       if (controller instanceof ControllerImpl) { ControllerImpl controllerImpl = (ControllerImpl)controller; controllerImpl.storedEnergy_$eq(p.readDouble()); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 369 */       else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */        BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 371 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */ 
/*     */   
/*     */   public void onNetSplitterState(PacketHandler.PacketParser p) {
/* 376 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(NetSplitter.class));
/* 377 */     if (option instanceof Some) { Some some = (Some)option; NetSplitter t = (NetSplitter)some.x();
/* 378 */       t.isInverted_$eq(p.readBoolean());
/* 379 */       t.openSides_$eq(t.uncompressSides(p.readByte()));
/* 380 */       t.world().func_147471_g(t.x(), t.y(), t.z()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 381 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; } 
/*     */   } public final class PacketHandler$$anonfun$onParticleEffect$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final World world$1; private final int x$10; private final int y$1; private final int z$1; private final double velocity$1; private final Option direction$1; private final String name$1; public final void apply(int i) { apply$mcVI$sp(i); } public PacketHandler$$anonfun$onParticleEffect$1(World world$1, int x$10, int y$1, int z$1, double velocity$1, Option direction$1, String name$1) {} private final double rv$1(Function1 f) { double d; Option option = this.direction$1; if (option instanceof Some) { Some some = (Some)option; ForgeDirection forgeDirection = (ForgeDirection)some.x(); d = this.world$1.field_73012_v.nextFloat() - 0.5D + BoxesRunTime.unboxToInt(f.apply(forgeDirection)) * 0.5D; } else { d = this.world$1.field_73012_v.nextFloat() * 2.0D - true; }  return d; } public void apply$mcVI$sp(int i) { double vx = rv$1((Function1)new PacketHandler$$anonfun$onParticleEffect$1$$anonfun$1(this)); double vy = rv$1((Function1)new PacketHandler$$anonfun$onParticleEffect$1$$anonfun$2(this)); double vz = rv$1((Function1)new PacketHandler$$anonfun$onParticleEffect$1$$anonfun$3(this)); if (vx * vx + vy * vy + vz * vz < true) { double px = rp$1(this.x$10, vx, (Function1)new PacketHandler$$anonfun$onParticleEffect$1$$anonfun$4(this)); double py = rp$1(this.y$1, vy, (Function1)new PacketHandler$$anonfun$onParticleEffect$1$$anonfun$5(this)); double pz = rp$1(this.z$1, vz, (Function1)new PacketHandler$$anonfun$onParticleEffect$1$$anonfun$6(this)); this.world$1.func_72869_a(this.name$1, px, py, pz, vx, vy + this.velocity$1 * 0.25D, vz); }  } public final class PacketHandler$$anonfun$onParticleEffect$1$$anonfun$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$4) { return x$4.offsetX; } public PacketHandler$$anonfun$onParticleEffect$1$$anonfun$1(PacketHandler$$anonfun$onParticleEffect$1 $outer) {} } public final class PacketHandler$$anonfun$onParticleEffect$1$$anonfun$2 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$5) { return x$5.offsetY; } public PacketHandler$$anonfun$onParticleEffect$1$$anonfun$2(PacketHandler$$anonfun$onParticleEffect$1 $outer) {} } public final class PacketHandler$$anonfun$onParticleEffect$1$$anonfun$3 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/* 385 */       public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$6) { return x$6.offsetZ; } public PacketHandler$$anonfun$onParticleEffect$1$$anonfun$3(PacketHandler$$anonfun$onParticleEffect$1 $outer) {} } private final double rp$1(int x, double v, Function1 f) { double d; Option option = this.direction$1; if (option instanceof Some) { Some some = (Some)option; ForgeDirection forgeDirection = (ForgeDirection)some.x(); d = x + 0.5D + v * this.velocity$1 * 0.5D + BoxesRunTime.unboxToInt(f.apply(forgeDirection)) * this.velocity$1; } else { d = x + 0.5D + v * this.velocity$1; }  return d; } public final class PacketHandler$$anonfun$onParticleEffect$1$$anonfun$4 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$7) { return x$7.offsetX; } public PacketHandler$$anonfun$onParticleEffect$1$$anonfun$4(PacketHandler$$anonfun$onParticleEffect$1 $outer) {} } public final class PacketHandler$$anonfun$onParticleEffect$1$$anonfun$5 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$8) { return x$8.offsetY; } public PacketHandler$$anonfun$onParticleEffect$1$$anonfun$5(PacketHandler$$anonfun$onParticleEffect$1 $outer) {} } public final class PacketHandler$$anonfun$onParticleEffect$1$$anonfun$6 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(ForgeDirection x$9) { return x$9.offsetZ; } public PacketHandler$$anonfun$onParticleEffect$1$$anonfun$6(PacketHandler$$anonfun$onParticleEffect$1 $outer) {} } } public void onParticleEffect(PacketHandler.PacketParser p) { int dimension = p.readInt();
/* 386 */     Option<World> option = world(p.player(), dimension);
/* 387 */     if (option instanceof Some) { Some some = (Some)option; World world = (World)some.x();
/* 388 */       int x = p.readInt();
/* 389 */       int y = p.readInt();
/* 390 */       int z = p.readInt();
/* 391 */       double velocity = p.readDouble();
/* 392 */       Option direction = p.readDirection();
/* 393 */       String name = p.readUTF();
/* 394 */       int count = p.readUnsignedByte() / (1 << (Minecraft.func_71410_x()).field_71474_y.field_74362_aa); scala.runtime.RichInt$.MODULE$
/*     */         
/* 396 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), count).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onParticleEffect$1(world, x, y, z, velocity, direction, name)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 415 */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */ 
/*     */   
/*     */   public void onPetVisibility(PacketHandler.PacketParser p) {
/* 420 */     if (!PetRenderer$.MODULE$.isInitialized()) {
/* 421 */       PetRenderer$.MODULE$.isInitialized_$eq(true);
/* 422 */       li.cil.oc.Settings$.MODULE$.get().hideOwnPet() ? 
/* 423 */         PetRenderer$.MODULE$.hidden().$plus$eq((Minecraft.func_71410_x()).field_71439_g.func_70005_c_()) : BoxedUnit.UNIT;
/*     */       
/* 425 */       PacketSender$.MODULE$.sendPetVisibility();
/*     */     } 
/*     */     
/* 428 */     int count = p.readInt(); scala.runtime.RichInt$.MODULE$
/* 429 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), count).foreach((Function1)new PacketHandler$$anonfun$onPetVisibility$1(p)); } public final class PacketHandler$$anonfun$onPetVisibility$1 extends AbstractFunction1<Object, Set<String>> implements Serializable { public static final long serialVersionUID = 0L; private final PacketHandler.PacketParser p$4; public PacketHandler$$anonfun$onPetVisibility$1(PacketHandler.PacketParser p$4) {} public final Set<String> apply(int i) {
/* 430 */       String name = this.p$4.readUTF();
/* 431 */       return this.p$4.readBoolean() ? 
/* 432 */         (Set<String>)PetRenderer$.MODULE$.hidden().$minus$eq(name) : 
/*     */ 
/*     */         
/* 435 */         (Set<String>)PetRenderer$.MODULE$.hidden().$plus$eq(name);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onPowerState(PacketHandler.PacketParser p) {
/* 441 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(PowerInformation.class));
/* 442 */     if (option instanceof Some) { Some some = (Some)option; PowerInformation t = (PowerInformation)some.x();
/* 443 */       t.globalBuffer_$eq(p.readDouble());
/* 444 */       t.globalBufferSize_$eq(p.readDouble()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 445 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onPrinterState(PacketHandler.PacketParser p) {
/* 449 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Printer.class));
/* 450 */     if (option instanceof Some) { Some some = (Some)option; Printer t = (Printer)some.x();
/* 451 */       t.requiredEnergy_$eq(9001.0D);
/* 452 */       t.requiredEnergy_$eq(0.0D); BoxedUnit boxedUnit = p.readBoolean() ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 453 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/* 457 */   public void onRackInventory(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Rack.class));
/* 458 */     if (option instanceof Some) { Some some = (Some)option; Rack t = (Rack)some.x();
/* 459 */       int count = p.readInt(); scala.runtime.RichInt$.MODULE$
/* 460 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), count).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onRackInventory$1(p, t)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     else
/*     */     
/* 464 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketHandler$$anonfun$onRackInventory$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final PacketHandler.PacketParser p$5; private final Rack t$4; public final void apply(int _) { apply$mcVI$sp(_); } public PacketHandler$$anonfun$onRackInventory$1(PacketHandler.PacketParser p$5, Rack t$4) {}
/*     */     public void apply$mcVI$sp(int _) { int slot = this.p$5.readInt(); this.t$4.func_70299_a(slot, this.p$5.readItemStack()); } }
/* 468 */   public void onRackMountableData(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Rack.class));
/* 469 */     if (option instanceof Some) { Some some = (Some)option; Rack t = (Rack)some.x();
/* 470 */       int mountableIndex = p.readInt();
/* 471 */       t.lastData()[mountableIndex] = p.readNBT(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 472 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */ 
/*     */   
/* 476 */   public void onRaidStateChange(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Raid.class));
/* 477 */     if (option instanceof Some) { Some some = (Some)option; Raid t = (Raid)some.x(); scala.runtime.RichInt$.MODULE$
/* 478 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), t.func_70302_i_()).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onRaidStateChange$1(p, t)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     else
/*     */     
/* 481 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketHandler$$anonfun$onRaidStateChange$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final PacketHandler.PacketParser p$6; private final Raid t$5; public final void apply(int slot) { apply$mcVI$sp(slot); } public PacketHandler$$anonfun$onRaidStateChange$1(PacketHandler.PacketParser p$6, Raid t$5) {}
/*     */     public void apply$mcVI$sp(int slot) { this.t$5.presence()[slot] = this.p$6.readBoolean(); } }
/* 485 */   public void onRedstoneState(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RedstoneAware.class));
/* 486 */     if (option instanceof Some) { Some some = (Some)option; RedstoneAware t = (RedstoneAware)some.x();
/* 487 */       t.setOutputEnabled(p.readBoolean());
/* 488 */       scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new PacketHandler$$anonfun$onRedstoneState$1(p, t)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     else
/*     */     
/* 491 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketHandler$$anonfun$onRedstoneState$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final PacketHandler.PacketParser p$7; private final RedstoneAware t$6; public PacketHandler$$anonfun$onRedstoneState$1(PacketHandler.PacketParser p$7, RedstoneAware t$6) {} public final boolean apply(ForgeDirection d) { return this.t$6.setOutput(d, this.p$7.readByte()); } }
/*     */   public void onRobotAnimateSwing(PacketHandler.PacketParser p) {
/* 495 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class));
/* 496 */     if (option instanceof Some) { Some some = (Some)option; RobotProxy t = (RobotProxy)some.x(); t.robot().setAnimateSwing(p.readInt()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 497 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onRobotAnimateTurn(PacketHandler.PacketParser p) {
/* 501 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class));
/* 502 */     if (option instanceof Some) { Some some = (Some)option; RobotProxy t = (RobotProxy)some.x(); t.robot().setAnimateTurn(p.readByte(), p.readInt()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 503 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onRobotAssemblingState(PacketHandler.PacketParser p) {
/* 507 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Assembler.class));
/* 508 */     if (option instanceof Some) { Some some = (Some)option; Assembler t = (Assembler)some.x();
/* 509 */       t.requiredEnergy_$eq(9001.0D);
/* 510 */       t.requiredEnergy_$eq(0.0D); BoxedUnit boxedUnit = p.readBoolean() ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 511 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onRobotInventoryChange(PacketHandler.PacketParser p) {
/* 515 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class));
/* 516 */     if (option instanceof Some) { Some some = (Some)option; RobotProxy t = (RobotProxy)some.x();
/* 517 */       Robot robot = t.robot();
/* 518 */       int slot = p.readInt();
/* 519 */       ItemStack stack = p.readItemStack();
/*     */       
/* 521 */       robot.info().components()[slot - robot.func_70302_i_() - robot.componentCount()] = stack;
/*     */       
/* 523 */       t.robot().func_70299_a(slot, stack); BoxedUnit boxedUnit = (slot >= robot.func_70302_i_() - robot.componentCount()) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 524 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onRobotLightChange(PacketHandler.PacketParser p) {
/* 528 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class));
/* 529 */     if (option instanceof Some) { Some some = (Some)option; RobotProxy t = (RobotProxy)some.x(); t.robot().info().lightColor_$eq(p.readInt()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 530 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/* 534 */   public void onRobotNameChange(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class));
/* 535 */     if (option instanceof Some) { Some some = (Some)option; RobotProxy t = (RobotProxy)some.x();
/* 536 */       short len = p.readShort();
/* 537 */       char[] name = new char[len]; scala.runtime.RichInt$.MODULE$
/* 538 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), len).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onRobotNameChange$1(p, name));
/*     */ 
/*     */       
/* 541 */       t.robot().setName(scala.Predef$.MODULE$.charArrayOps(name).mkString()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     else
/* 543 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      } public final class PacketHandler$$anonfun$onRobotNameChange$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final PacketHandler.PacketParser p$8; private final char[] name$2; public final void apply(int x) { apply$mcVI$sp(x); } public PacketHandler$$anonfun$onRobotNameChange$1(PacketHandler.PacketParser p$8, char[] name$2) {}
/*     */     public void apply$mcVI$sp(int x) { this.name$2[x] = this.p$8.readChar(); } }
/*     */   public Object onRobotMove(PacketHandler.PacketParser p) {
/* 548 */     int dimension = p.readInt();
/* 549 */     int x = p.readInt();
/* 550 */     int y = p.readInt();
/* 551 */     int z = p.readInt();
/* 552 */     Option direction = p.readDirection();
/* 553 */     Tuple2 tuple2 = new Tuple2(p.getTileEntity(dimension, x, y, z, scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class)), direction); if (tuple2 != null) {
/* 554 */       Option option1 = (Option)tuple2._1(), option2 = (Option)tuple2._2(); if (option1 instanceof Some) { Some some = (Some)option1; RobotProxy t = (RobotProxy)some.x(); if (option2 instanceof Some) { Some some1 = (Some)option2; ForgeDirection d = (ForgeDirection)some1.x(); return BoxesRunTime.boxToBoolean(t.robot().move(d)); }  } 
/* 555 */     }  if (tuple2 != null) { Option option = (Option)tuple2._2(); if (option instanceof Some) { Some some = (Some)option; ForgeDirection d = (ForgeDirection)some.x();
/*     */         
/* 557 */         PacketSender$.MODULE$.sendRobotStateRequest(dimension, x + d.offsetX, y + d.offsetY, z + d.offsetZ); return BoxedUnit.UNIT; }  }
/* 558 */      return BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onRobotSelectedSlotChange(PacketHandler.PacketParser p) {
/* 563 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class));
/* 564 */     if (option instanceof Some) { Some some = (Some)option; RobotProxy t = (RobotProxy)some.x(); t.robot().selectedSlot_$eq(p.readInt()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 565 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onRotatableState(PacketHandler.PacketParser p) {
/* 569 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Rotatable.class));
/* 570 */     if (option instanceof Some) { Some some = (Some)option; Rotatable t = (Rotatable)some.x();
/* 571 */       t.pitch_$eq((ForgeDirection)p.readDirection().get());
/* 572 */       t.yaw_$eq((ForgeDirection)p.readDirection().get()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 573 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onSwitchActivity(PacketHandler.PacketParser p) {
/* 577 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(SwitchLike.class));
/* 578 */     if (option instanceof Some) { Some some = (Some)option; SwitchLike t = (SwitchLike)some.x(); t.lastMessage_$eq(System.currentTimeMillis()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 579 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onTextBufferPowerChange(PacketHandler.PacketParser p) {
/* 583 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, p.readUTF());
/* 584 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer;
/* 585 */         textBuffer.setRenderingEnabled(p.readBoolean()); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 586 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */   
/*     */   public void onTextBufferInit(PacketHandler.PacketParser p) {
/* 590 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, p.readUTF());
/* 591 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer;
/* 592 */         NBTTagCompound nbt = p.readNBT();
/* 593 */         if (nbt.func_74764_b("maxWidth")) {
/* 594 */           int maxWidth = nbt.func_74762_e("maxWidth");
/* 595 */           int maxHeight = nbt.func_74762_e("maxHeight");
/* 596 */           textBuffer.setMaximumResolution(maxWidth, maxHeight);
/*     */         } 
/* 598 */         textBuffer.data().load(nbt);
/*     */         
/* 600 */         int viewportWidth = nbt.func_74762_e("viewportWidth");
/* 601 */         int viewportHeight = nbt.func_74762_e("viewportHeight");
/* 602 */         nbt.func_74764_b("viewportWidth") ? BoxesRunTime.boxToBoolean(textBuffer.setViewport(viewportWidth, viewportHeight)) : BoxedUnit.UNIT;
/*     */         
/* 604 */         textBuffer.proxy().markDirty();
/* 605 */         textBuffer.markInitialized(); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 606 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
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
/*     */   public void onTextBufferMulti(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/client/ComponentTracker$.MODULE$ : Lli/cil/oc/client/ComponentTracker$;
/*     */     //   3: aload_1
/*     */     //   4: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   7: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   10: aload_1
/*     */     //   11: invokevirtual readUTF : ()Ljava/lang/String;
/*     */     //   14: invokevirtual get : (Lnet/minecraft/world/World;Ljava/lang/String;)Lscala/Option;
/*     */     //   17: astore_2
/*     */     //   18: aload_2
/*     */     //   19: instanceof scala/Some
/*     */     //   22: ifeq -> 758
/*     */     //   25: aload_2
/*     */     //   26: checkcast scala/Some
/*     */     //   29: astore_3
/*     */     //   30: aload_3
/*     */     //   31: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   34: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   37: astore #4
/*     */     //   39: aload #4
/*     */     //   41: instanceof li/cil/oc/api/internal/TextBuffer
/*     */     //   44: ifeq -> 758
/*     */     //   47: aload #4
/*     */     //   49: checkcast li/cil/oc/api/internal/TextBuffer
/*     */     //   52: astore #5
/*     */     //   54: aload_1
/*     */     //   55: invokevirtual readPacketType : ()Lscala/Enumeration$Value;
/*     */     //   58: astore #8
/*     */     //   60: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   63: invokevirtual TextBufferMultiColorChange : ()Lscala/Enumeration$Value;
/*     */     //   66: aload #8
/*     */     //   68: astore #9
/*     */     //   70: dup
/*     */     //   71: ifnonnull -> 83
/*     */     //   74: pop
/*     */     //   75: aload #9
/*     */     //   77: ifnull -> 91
/*     */     //   80: goto -> 106
/*     */     //   83: aload #9
/*     */     //   85: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   88: ifeq -> 106
/*     */     //   91: aload_0
/*     */     //   92: aload_1
/*     */     //   93: aload #5
/*     */     //   95: invokevirtual onTextBufferMultiColorChange : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   98: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   101: astore #10
/*     */     //   103: goto -> 54
/*     */     //   106: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   109: invokevirtual TextBufferMultiCopy : ()Lscala/Enumeration$Value;
/*     */     //   112: aload #8
/*     */     //   114: astore #11
/*     */     //   116: dup
/*     */     //   117: ifnonnull -> 129
/*     */     //   120: pop
/*     */     //   121: aload #11
/*     */     //   123: ifnull -> 137
/*     */     //   126: goto -> 152
/*     */     //   129: aload #11
/*     */     //   131: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   134: ifeq -> 152
/*     */     //   137: aload_0
/*     */     //   138: aload_1
/*     */     //   139: aload #5
/*     */     //   141: invokevirtual onTextBufferMultiCopy : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   144: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   147: astore #10
/*     */     //   149: goto -> 54
/*     */     //   152: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   155: invokevirtual TextBufferMultiDepthChange : ()Lscala/Enumeration$Value;
/*     */     //   158: aload #8
/*     */     //   160: astore #12
/*     */     //   162: dup
/*     */     //   163: ifnonnull -> 175
/*     */     //   166: pop
/*     */     //   167: aload #12
/*     */     //   169: ifnull -> 183
/*     */     //   172: goto -> 198
/*     */     //   175: aload #12
/*     */     //   177: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   180: ifeq -> 198
/*     */     //   183: aload_0
/*     */     //   184: aload_1
/*     */     //   185: aload #5
/*     */     //   187: invokevirtual onTextBufferMultiDepthChange : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   190: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   193: astore #10
/*     */     //   195: goto -> 54
/*     */     //   198: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   201: invokevirtual TextBufferMultiFill : ()Lscala/Enumeration$Value;
/*     */     //   204: aload #8
/*     */     //   206: astore #13
/*     */     //   208: dup
/*     */     //   209: ifnonnull -> 221
/*     */     //   212: pop
/*     */     //   213: aload #13
/*     */     //   215: ifnull -> 229
/*     */     //   218: goto -> 244
/*     */     //   221: aload #13
/*     */     //   223: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   226: ifeq -> 244
/*     */     //   229: aload_0
/*     */     //   230: aload_1
/*     */     //   231: aload #5
/*     */     //   233: invokevirtual onTextBufferMultiFill : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   236: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   239: astore #10
/*     */     //   241: goto -> 54
/*     */     //   244: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   247: invokevirtual TextBufferMultiPaletteChange : ()Lscala/Enumeration$Value;
/*     */     //   250: aload #8
/*     */     //   252: astore #14
/*     */     //   254: dup
/*     */     //   255: ifnonnull -> 267
/*     */     //   258: pop
/*     */     //   259: aload #14
/*     */     //   261: ifnull -> 275
/*     */     //   264: goto -> 290
/*     */     //   267: aload #14
/*     */     //   269: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   272: ifeq -> 290
/*     */     //   275: aload_0
/*     */     //   276: aload_1
/*     */     //   277: aload #5
/*     */     //   279: invokevirtual onTextBufferMultiPaletteChange : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   282: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   285: astore #10
/*     */     //   287: goto -> 54
/*     */     //   290: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   293: invokevirtual TextBufferMultiResolutionChange : ()Lscala/Enumeration$Value;
/*     */     //   296: aload #8
/*     */     //   298: astore #15
/*     */     //   300: dup
/*     */     //   301: ifnonnull -> 313
/*     */     //   304: pop
/*     */     //   305: aload #15
/*     */     //   307: ifnull -> 321
/*     */     //   310: goto -> 336
/*     */     //   313: aload #15
/*     */     //   315: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   318: ifeq -> 336
/*     */     //   321: aload_0
/*     */     //   322: aload_1
/*     */     //   323: aload #5
/*     */     //   325: invokevirtual onTextBufferMultiResolutionChange : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   328: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   331: astore #10
/*     */     //   333: goto -> 54
/*     */     //   336: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   339: invokevirtual TextBufferMultiViewportResolutionChange : ()Lscala/Enumeration$Value;
/*     */     //   342: aload #8
/*     */     //   344: astore #16
/*     */     //   346: dup
/*     */     //   347: ifnonnull -> 359
/*     */     //   350: pop
/*     */     //   351: aload #16
/*     */     //   353: ifnull -> 367
/*     */     //   356: goto -> 382
/*     */     //   359: aload #16
/*     */     //   361: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   364: ifeq -> 382
/*     */     //   367: aload_0
/*     */     //   368: aload_1
/*     */     //   369: aload #5
/*     */     //   371: invokevirtual onTextBufferMultiViewportResolutionChange : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   374: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   377: astore #10
/*     */     //   379: goto -> 54
/*     */     //   382: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   385: invokevirtual TextBufferMultiMaxResolutionChange : ()Lscala/Enumeration$Value;
/*     */     //   388: aload #8
/*     */     //   390: astore #17
/*     */     //   392: dup
/*     */     //   393: ifnonnull -> 405
/*     */     //   396: pop
/*     */     //   397: aload #17
/*     */     //   399: ifnull -> 413
/*     */     //   402: goto -> 428
/*     */     //   405: aload #17
/*     */     //   407: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   410: ifeq -> 428
/*     */     //   413: aload_0
/*     */     //   414: aload_1
/*     */     //   415: aload #5
/*     */     //   417: invokevirtual onTextBufferMultiMaxResolutionChange : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   420: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   423: astore #10
/*     */     //   425: goto -> 54
/*     */     //   428: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   431: invokevirtual TextBufferMultiSet : ()Lscala/Enumeration$Value;
/*     */     //   434: aload #8
/*     */     //   436: astore #18
/*     */     //   438: dup
/*     */     //   439: ifnonnull -> 451
/*     */     //   442: pop
/*     */     //   443: aload #18
/*     */     //   445: ifnull -> 459
/*     */     //   448: goto -> 474
/*     */     //   451: aload #18
/*     */     //   453: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   456: ifeq -> 474
/*     */     //   459: aload_0
/*     */     //   460: aload_1
/*     */     //   461: aload #5
/*     */     //   463: invokevirtual onTextBufferMultiSet : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   466: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   469: astore #10
/*     */     //   471: goto -> 54
/*     */     //   474: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   477: invokevirtual TextBufferRamInit : ()Lscala/Enumeration$Value;
/*     */     //   480: aload #8
/*     */     //   482: astore #19
/*     */     //   484: dup
/*     */     //   485: ifnonnull -> 497
/*     */     //   488: pop
/*     */     //   489: aload #19
/*     */     //   491: ifnull -> 505
/*     */     //   494: goto -> 520
/*     */     //   497: aload #19
/*     */     //   499: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   502: ifeq -> 520
/*     */     //   505: aload_0
/*     */     //   506: aload_1
/*     */     //   507: aload #5
/*     */     //   509: invokevirtual onTextBufferRamInit : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   512: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   515: astore #10
/*     */     //   517: goto -> 54
/*     */     //   520: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   523: invokevirtual TextBufferBitBlt : ()Lscala/Enumeration$Value;
/*     */     //   526: aload #8
/*     */     //   528: astore #20
/*     */     //   530: dup
/*     */     //   531: ifnonnull -> 543
/*     */     //   534: pop
/*     */     //   535: aload #20
/*     */     //   537: ifnull -> 551
/*     */     //   540: goto -> 566
/*     */     //   543: aload #20
/*     */     //   545: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   548: ifeq -> 566
/*     */     //   551: aload_0
/*     */     //   552: aload_1
/*     */     //   553: aload #5
/*     */     //   555: invokevirtual onTextBufferBitBlt : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   558: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   561: astore #10
/*     */     //   563: goto -> 54
/*     */     //   566: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   569: invokevirtual TextBufferRamDestroy : ()Lscala/Enumeration$Value;
/*     */     //   572: aload #8
/*     */     //   574: astore #21
/*     */     //   576: dup
/*     */     //   577: ifnonnull -> 589
/*     */     //   580: pop
/*     */     //   581: aload #21
/*     */     //   583: ifnull -> 597
/*     */     //   586: goto -> 612
/*     */     //   589: aload #21
/*     */     //   591: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   594: ifeq -> 612
/*     */     //   597: aload_0
/*     */     //   598: aload_1
/*     */     //   599: aload #5
/*     */     //   601: invokevirtual onTextBufferRamDestroy : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   604: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   607: astore #10
/*     */     //   609: goto -> 54
/*     */     //   612: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   615: invokevirtual TextBufferMultiRawSetText : ()Lscala/Enumeration$Value;
/*     */     //   618: aload #8
/*     */     //   620: astore #22
/*     */     //   622: dup
/*     */     //   623: ifnonnull -> 635
/*     */     //   626: pop
/*     */     //   627: aload #22
/*     */     //   629: ifnull -> 643
/*     */     //   632: goto -> 658
/*     */     //   635: aload #22
/*     */     //   637: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   640: ifeq -> 658
/*     */     //   643: aload_0
/*     */     //   644: aload_1
/*     */     //   645: aload #5
/*     */     //   647: invokevirtual onTextBufferMultiRawSetText : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   650: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   653: astore #10
/*     */     //   655: goto -> 54
/*     */     //   658: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   661: invokevirtual TextBufferMultiRawSetBackground : ()Lscala/Enumeration$Value;
/*     */     //   664: aload #8
/*     */     //   666: astore #23
/*     */     //   668: dup
/*     */     //   669: ifnonnull -> 681
/*     */     //   672: pop
/*     */     //   673: aload #23
/*     */     //   675: ifnull -> 689
/*     */     //   678: goto -> 704
/*     */     //   681: aload #23
/*     */     //   683: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   686: ifeq -> 704
/*     */     //   689: aload_0
/*     */     //   690: aload_1
/*     */     //   691: aload #5
/*     */     //   693: invokevirtual onTextBufferMultiRawSetBackground : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   696: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   699: astore #10
/*     */     //   701: goto -> 54
/*     */     //   704: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   707: invokevirtual TextBufferMultiRawSetForeground : ()Lscala/Enumeration$Value;
/*     */     //   710: aload #8
/*     */     //   712: astore #24
/*     */     //   714: dup
/*     */     //   715: ifnonnull -> 727
/*     */     //   718: pop
/*     */     //   719: aload #24
/*     */     //   721: ifnull -> 735
/*     */     //   724: goto -> 750
/*     */     //   727: aload #24
/*     */     //   729: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   732: ifeq -> 750
/*     */     //   735: aload_0
/*     */     //   736: aload_1
/*     */     //   737: aload #5
/*     */     //   739: invokevirtual onTextBufferMultiRawSetForeground : (Lli/cil/oc/common/PacketHandler$PacketParser;Lli/cil/oc/api/internal/TextBuffer;)V
/*     */     //   742: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   745: astore #10
/*     */     //   747: goto -> 54
/*     */     //   750: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   753: astore #10
/*     */     //   755: goto -> 54
/*     */     //   758: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   761: astore #6
/*     */     //   763: goto -> 773
/*     */     //   766: astore #7
/*     */     //   768: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   771: astore #6
/*     */     //   773: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #611	-> 0
/*     */     //   #612	-> 18
/*     */     //   #614	-> 54
/*     */     //   #615	-> 60
/*     */     //   #616	-> 106
/*     */     //   #617	-> 152
/*     */     //   #618	-> 198
/*     */     //   #619	-> 244
/*     */     //   #620	-> 290
/*     */     //   #621	-> 336
/*     */     //   #622	-> 382
/*     */     //   #623	-> 428
/*     */     //   #624	-> 474
/*     */     //   #625	-> 520
/*     */     //   #626	-> 566
/*     */     //   #627	-> 612
/*     */     //   #628	-> 658
/*     */     //   #629	-> 704
/*     */     //   #630	-> 750
/*     */     //   #636	-> 758
/*     */     //   #634	-> 766
/*     */     //   #613	-> 766
/*     */     //   #613	-> 771
/*     */     //   #611	-> 773
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	774	0	this	Lli/cil/oc/client/PacketHandler$;
/*     */     //   0	774	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   39	735	4	buffer	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   54	758	766	java/io/EOFException
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
/*     */   public void onTextBufferMultiColorChange(PacketHandler.PacketParser p, TextBuffer env) {
/* 640 */     TextBuffer textBuffer = env;
/* 641 */     if (textBuffer != null) { TextBuffer textBuffer1 = textBuffer;
/* 642 */       int foreground = p.readInt();
/* 643 */       boolean foregroundIsPalette = p.readBoolean();
/* 644 */       textBuffer1.setForegroundColor(foreground, foregroundIsPalette);
/* 645 */       int background = p.readInt();
/* 646 */       boolean backgroundIsPalette = p.readBoolean();
/* 647 */       textBuffer1.setBackgroundColor(background, backgroundIsPalette); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 648 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiCopy(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 653 */     int col = p.readInt();
/* 654 */     int row = p.readInt();
/* 655 */     int w = p.readInt();
/* 656 */     int h = p.readInt();
/* 657 */     int tx = p.readInt();
/* 658 */     int ty = p.readInt();
/* 659 */     buffer.copy(col, row, w, h, tx, ty);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiDepthChange(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 663 */     buffer.setColorDepth(TextBuffer.ColorDepth.values()[p.readInt()]);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiFill(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 667 */     int col = p.readInt();
/* 668 */     int row = p.readInt();
/* 669 */     int w = p.readInt();
/* 670 */     int h = p.readInt();
/* 671 */     int c = p.readMedium();
/* 672 */     buffer.fill(col, row, w, h, c);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiPaletteChange(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 676 */     int index = p.readInt();
/* 677 */     int color = p.readInt();
/* 678 */     buffer.setPaletteColor(index, color);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiResolutionChange(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 682 */     int w = p.readInt();
/* 683 */     int h = p.readInt();
/* 684 */     buffer.setResolution(w, h);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiViewportResolutionChange(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 688 */     int w = p.readInt();
/* 689 */     int h = p.readInt();
/* 690 */     buffer.setViewport(w, h);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiMaxResolutionChange(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 694 */     int w = p.readInt();
/* 695 */     int h = p.readInt();
/* 696 */     buffer.setMaximumResolution(w, h);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiSet(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 700 */     int col = p.readInt();
/* 701 */     int row = p.readInt();
/* 702 */     String s = p.readUTF();
/* 703 */     boolean vertical = p.readBoolean();
/* 704 */     buffer.set(col, row, s, vertical);
/*     */   }
/*     */   
/*     */   public void onTextBufferRamInit(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 708 */     String owner = p.readUTF();
/* 709 */     int id = p.readInt();
/* 710 */     NBTTagCompound nbt = p.readNBT();
/*     */     
/* 712 */     li.cil.oc.common.component.ClientGpuTextBufferHandler$.MODULE$.loadBuffer(buffer, owner, id, nbt);
/*     */   }
/*     */   
/*     */   public void onTextBufferBitBlt(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 716 */     int col = p.readInt();
/* 717 */     int row = p.readInt();
/* 718 */     int w = p.readInt();
/* 719 */     int h = p.readInt();
/* 720 */     String owner = p.readUTF();
/* 721 */     int id = p.readInt();
/* 722 */     int fromCol = p.readInt();
/* 723 */     int fromRow = p.readInt();
/*     */     
/* 725 */     li.cil.oc.common.component.ClientGpuTextBufferHandler$.MODULE$.bitblt(buffer, col, row, w, h, owner, id, fromCol, fromRow);
/*     */   }
/*     */   
/*     */   public void onTextBufferRamDestroy(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 729 */     String owner = p.readUTF();
/* 730 */     int id = p.readInt();
/*     */     
/* 732 */     li.cil.oc.common.component.ClientGpuTextBufferHandler$.MODULE$.removeBuffer(buffer, owner, id);
/*     */   }
/*     */   
/*     */   public void onTextBufferMultiRawSetText(PacketHandler.PacketParser p, TextBuffer buffer) {
/* 736 */     int col = p.readInt();
/* 737 */     int row = p.readInt();
/*     */     
/* 739 */     short rows = p.readShort();
/* 740 */     int[][] text = new int[rows][]; scala.runtime.RichInt$.MODULE$
/* 741 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), rows).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onTextBufferMultiRawSetText$1(p, text));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 750 */     buffer.rawSetText(col, row, text);
/*     */   } public final class PacketHandler$$anonfun$onTextBufferMultiRawSetText$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final PacketHandler.PacketParser p$9; private final int[][] text$1; public final void apply(int y) { apply$mcVI$sp(y); } public PacketHandler$$anonfun$onTextBufferMultiRawSetText$1(PacketHandler.PacketParser p$9, int[][] text$1) {} public void apply$mcVI$sp(int y) { short cols = this.p$9.readShort(); int[] line = new int[cols]; scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), cols).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onTextBufferMultiRawSetText$1$$anonfun$apply$mcVI$sp$2(this, line)); this.text$1[y] = line; } public final class PacketHandler$$anonfun$onTextBufferMultiRawSetText$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int[] line$1; public final void apply(int x) { apply$mcVI$sp(x); } public PacketHandler$$anonfun$onTextBufferMultiRawSetText$1$$anonfun$apply$mcVI$sp$2(PacketHandler$$anonfun$onTextBufferMultiRawSetText$1 $outer, int[] line$1) {} public void apply$mcVI$sp(int x) { this.line$1[x] = this.$outer.p$9.readMedium(); } } }
/* 754 */   public void onTextBufferMultiRawSetBackground(PacketHandler.PacketParser p, TextBuffer buffer) { int col = p.readInt();
/* 755 */     int row = p.readInt();
/*     */     
/* 757 */     short rows = p.readShort();
/* 758 */     int[][] color = new int[rows][]; scala.runtime.RichInt$.MODULE$
/* 759 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), rows).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onTextBufferMultiRawSetBackground$1(p, color));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 768 */     buffer.rawSetBackground(col, row, color); } public final class PacketHandler$$anonfun$onTextBufferMultiRawSetBackground$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final PacketHandler.PacketParser p$10; private final int[][] color$1; public final void apply(int y) { apply$mcVI$sp(y); } public PacketHandler$$anonfun$onTextBufferMultiRawSetBackground$1(PacketHandler.PacketParser p$10, int[][] color$1) {} public void apply$mcVI$sp(int y) { short cols = this.p$10.readShort(); int[] line = new int[cols]; scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), cols).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onTextBufferMultiRawSetBackground$1$$anonfun$apply$mcVI$sp$3(this, line)); this.color$1[y] = line; } public final class PacketHandler$$anonfun$onTextBufferMultiRawSetBackground$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int[] line$2; public final void apply(int x) { apply$mcVI$sp(x); } public PacketHandler$$anonfun$onTextBufferMultiRawSetBackground$1$$anonfun$apply$mcVI$sp$3(PacketHandler$$anonfun$onTextBufferMultiRawSetBackground$1 $outer, int[] line$2) {}
/*     */       public void apply$mcVI$sp(int x) { this.line$2[x] = this.$outer.p$10.readInt(); } } }
/* 772 */   public void onTextBufferMultiRawSetForeground(PacketHandler.PacketParser p, TextBuffer buffer) { int col = p.readInt();
/* 773 */     int row = p.readInt();
/*     */     
/* 775 */     short rows = p.readShort();
/* 776 */     int[][] color = new int[rows][]; scala.runtime.RichInt$.MODULE$
/* 777 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), rows).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onTextBufferMultiRawSetForeground$1(p, color));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 786 */     buffer.rawSetForeground(col, row, color); } public final class PacketHandler$$anonfun$onTextBufferMultiRawSetForeground$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final PacketHandler.PacketParser p$11; private final int[][] color$2; public final void apply(int y) { apply$mcVI$sp(y); } public PacketHandler$$anonfun$onTextBufferMultiRawSetForeground$1(PacketHandler.PacketParser p$11, int[][] color$2) {} public void apply$mcVI$sp(int y) { short cols = this.p$11.readShort(); int[] line = new int[cols]; scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), cols).foreach$mVc$sp((Function1)new PacketHandler$$anonfun$onTextBufferMultiRawSetForeground$1$$anonfun$apply$mcVI$sp$4(this, line)); this.color$2[y] = line; } public final class PacketHandler$$anonfun$onTextBufferMultiRawSetForeground$1$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final int[] line$3; public final void apply(int x) { apply$mcVI$sp(x); } public PacketHandler$$anonfun$onTextBufferMultiRawSetForeground$1$$anonfun$apply$mcVI$sp$4(PacketHandler$$anonfun$onTextBufferMultiRawSetForeground$1 $outer, int[] line$3) {}
/*     */       public void apply$mcVI$sp(int x) { this.line$3[x] = this.$outer.p$11.readInt(); } } }
/* 790 */   public void onScreenTouchMode(PacketHandler.PacketParser p) { Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Screen.class));
/* 791 */     if (option instanceof Some) { Some some = (Some)option; Screen t = (Screen)some.x(); t.invertTouchMode_$eq(p.readBoolean()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 792 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */      }
/*     */   
/*     */   public void onSound(PacketHandler.PacketParser p) {
/* 796 */     int dimension = p.readInt();
/* 797 */     if (world(p.player(), dimension).isDefined()) {
/* 798 */       int x = p.readInt();
/* 799 */       int y = p.readInt();
/* 800 */       int z = p.readInt();
/* 801 */       short frequency = p.readShort();
/* 802 */       short duration = p.readShort();
/* 803 */       li.cil.oc.util.Audio$.MODULE$.play(x + 0.5F, y + 0.5F, z + 0.5F, frequency, duration);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onSoundPattern(PacketHandler.PacketParser p) {
/* 808 */     int dimension = p.readInt();
/* 809 */     if (world(p.player(), dimension).isDefined()) {
/* 810 */       int x = p.readInt();
/* 811 */       int y = p.readInt();
/* 812 */       int z = p.readInt();
/* 813 */       String pattern = p.readUTF();
/* 814 */       li.cil.oc.util.Audio$.MODULE$.play(x + 0.5F, y + 0.5F, z + 0.5F, pattern, li.cil.oc.util.Audio$.MODULE$.play$default$5(), li.cil.oc.util.Audio$.MODULE$.play$default$6());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void onTransposerActivity(PacketHandler.PacketParser p) {
/* 819 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Transposer.class));
/* 820 */     if (option instanceof Some) { Some some = (Some)option; Transposer transposer = (Transposer)some.x(); transposer.lastOperation_$eq(System.currentTimeMillis()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 821 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   public void onWaypointLabel(PacketHandler.PacketParser p) {
/* 825 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Waypoint.class));
/* 826 */     if (option instanceof Some) { Some some = (Some)option; Waypoint waypoint = (Waypoint)some.x(); waypoint.label_$eq(p.readUTF()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 827 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\PacketHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */