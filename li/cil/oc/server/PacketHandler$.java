/*     */ package li.cil.oc.server;
/*     */ 
/*     */ import cpw.mods.fml.common.network.FMLNetworkEvent;
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.api.machine.Machine;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.common.PacketHandler;
/*     */ import li.cil.oc.common.component.TextBuffer;
/*     */ import li.cil.oc.common.container.Database;
/*     */ import li.cil.oc.common.tileentity.Assembler;
/*     */ import li.cil.oc.common.tileentity.RobotProxy;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.network.NetHandlerPlayServer;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.world.WorldServer;
/*     */ import org.apache.logging.log4j.Marker;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class PacketHandler$ extends PacketHandler {
/*     */   public static final PacketHandler$ MODULE$;
/*     */   
/*  30 */   private PacketHandler$() { MODULE$ = this;
/*  31 */     this.securityMarker = MarkerManager.getMarker("SuspiciousPackets"); } private final Marker securityMarker; private Marker securityMarker() { return this.securityMarker; }
/*     */   
/*     */   private void logForgedPacket(EntityPlayerMP player) {
/*  34 */     li.cil.oc.OpenComputers$.MODULE$.log().warn(securityMarker(), "Player {} tried to send GUI packets without opening them", new Object[] { player.func_146103_bH() });
/*     */   }
/*     */   @SubscribeEvent
/*     */   public void onPacket(FMLNetworkEvent.ServerCustomPacketEvent e) {
/*  38 */     onPacketData(e.packet.payload(), (EntityPlayer)((NetHandlerPlayServer)e.handler).field_147369_b);
/*     */   }
/*     */   public Option<WorldServer> world(EntityPlayer player, int dimension) {
/*  41 */     return scala.Option$.MODULE$.apply(DimensionManager.getWorld(dimension));
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
/*     */   public void dispatch(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual packetType : ()Lscala/Enumeration$Value;
/*     */     //   4: astore_2
/*     */     //   5: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   8: invokevirtual ComputerPower : ()Lscala/Enumeration$Value;
/*     */     //   11: aload_2
/*     */     //   12: astore_3
/*     */     //   13: dup
/*     */     //   14: ifnonnull -> 25
/*     */     //   17: pop
/*     */     //   18: aload_3
/*     */     //   19: ifnull -> 32
/*     */     //   22: goto -> 45
/*     */     //   25: aload_3
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 45
/*     */     //   32: aload_0
/*     */     //   33: aload_1
/*     */     //   34: invokevirtual onComputerPower : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   37: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   40: astore #4
/*     */     //   42: goto -> 910
/*     */     //   45: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   48: invokevirtual CopyToAnalyzer : ()Lscala/Enumeration$Value;
/*     */     //   51: aload_2
/*     */     //   52: astore #5
/*     */     //   54: dup
/*     */     //   55: ifnonnull -> 67
/*     */     //   58: pop
/*     */     //   59: aload #5
/*     */     //   61: ifnull -> 75
/*     */     //   64: goto -> 88
/*     */     //   67: aload #5
/*     */     //   69: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   72: ifeq -> 88
/*     */     //   75: aload_0
/*     */     //   76: aload_1
/*     */     //   77: invokevirtual onCopyToAnalyzer : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   80: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   83: astore #4
/*     */     //   85: goto -> 910
/*     */     //   88: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   91: invokevirtual DriveLock : ()Lscala/Enumeration$Value;
/*     */     //   94: aload_2
/*     */     //   95: astore #6
/*     */     //   97: dup
/*     */     //   98: ifnonnull -> 110
/*     */     //   101: pop
/*     */     //   102: aload #6
/*     */     //   104: ifnull -> 118
/*     */     //   107: goto -> 131
/*     */     //   110: aload #6
/*     */     //   112: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 131
/*     */     //   118: aload_0
/*     */     //   119: aload_1
/*     */     //   120: invokevirtual onDriveLock : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   123: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   126: astore #4
/*     */     //   128: goto -> 910
/*     */     //   131: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   134: invokevirtual DriveMode : ()Lscala/Enumeration$Value;
/*     */     //   137: aload_2
/*     */     //   138: astore #7
/*     */     //   140: dup
/*     */     //   141: ifnonnull -> 153
/*     */     //   144: pop
/*     */     //   145: aload #7
/*     */     //   147: ifnull -> 161
/*     */     //   150: goto -> 174
/*     */     //   153: aload #7
/*     */     //   155: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 174
/*     */     //   161: aload_0
/*     */     //   162: aload_1
/*     */     //   163: invokevirtual onDriveMode : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   166: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   169: astore #4
/*     */     //   171: goto -> 910
/*     */     //   174: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   177: invokevirtual DronePower : ()Lscala/Enumeration$Value;
/*     */     //   180: aload_2
/*     */     //   181: astore #8
/*     */     //   183: dup
/*     */     //   184: ifnonnull -> 196
/*     */     //   187: pop
/*     */     //   188: aload #8
/*     */     //   190: ifnull -> 204
/*     */     //   193: goto -> 217
/*     */     //   196: aload #8
/*     */     //   198: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   201: ifeq -> 217
/*     */     //   204: aload_0
/*     */     //   205: aload_1
/*     */     //   206: invokevirtual onDronePower : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   209: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   212: astore #4
/*     */     //   214: goto -> 910
/*     */     //   217: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   220: invokevirtual KeyDown : ()Lscala/Enumeration$Value;
/*     */     //   223: aload_2
/*     */     //   224: astore #9
/*     */     //   226: dup
/*     */     //   227: ifnonnull -> 239
/*     */     //   230: pop
/*     */     //   231: aload #9
/*     */     //   233: ifnull -> 247
/*     */     //   236: goto -> 260
/*     */     //   239: aload #9
/*     */     //   241: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   244: ifeq -> 260
/*     */     //   247: aload_0
/*     */     //   248: aload_1
/*     */     //   249: invokevirtual onKeyDown : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   252: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   255: astore #4
/*     */     //   257: goto -> 910
/*     */     //   260: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   263: invokevirtual KeyUp : ()Lscala/Enumeration$Value;
/*     */     //   266: aload_2
/*     */     //   267: astore #10
/*     */     //   269: dup
/*     */     //   270: ifnonnull -> 282
/*     */     //   273: pop
/*     */     //   274: aload #10
/*     */     //   276: ifnull -> 290
/*     */     //   279: goto -> 303
/*     */     //   282: aload #10
/*     */     //   284: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   287: ifeq -> 303
/*     */     //   290: aload_0
/*     */     //   291: aload_1
/*     */     //   292: invokevirtual onKeyUp : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   295: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   298: astore #4
/*     */     //   300: goto -> 910
/*     */     //   303: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   306: invokevirtual Clipboard : ()Lscala/Enumeration$Value;
/*     */     //   309: aload_2
/*     */     //   310: astore #11
/*     */     //   312: dup
/*     */     //   313: ifnonnull -> 325
/*     */     //   316: pop
/*     */     //   317: aload #11
/*     */     //   319: ifnull -> 333
/*     */     //   322: goto -> 346
/*     */     //   325: aload #11
/*     */     //   327: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   330: ifeq -> 346
/*     */     //   333: aload_0
/*     */     //   334: aload_1
/*     */     //   335: invokevirtual onClipboard : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   338: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   341: astore #4
/*     */     //   343: goto -> 910
/*     */     //   346: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   349: invokevirtual MouseClickOrDrag : ()Lscala/Enumeration$Value;
/*     */     //   352: aload_2
/*     */     //   353: astore #12
/*     */     //   355: dup
/*     */     //   356: ifnonnull -> 368
/*     */     //   359: pop
/*     */     //   360: aload #12
/*     */     //   362: ifnull -> 376
/*     */     //   365: goto -> 389
/*     */     //   368: aload #12
/*     */     //   370: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   373: ifeq -> 389
/*     */     //   376: aload_0
/*     */     //   377: aload_1
/*     */     //   378: invokevirtual onMouseClick : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   381: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   384: astore #4
/*     */     //   386: goto -> 910
/*     */     //   389: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   392: invokevirtual MouseScroll : ()Lscala/Enumeration$Value;
/*     */     //   395: aload_2
/*     */     //   396: astore #13
/*     */     //   398: dup
/*     */     //   399: ifnonnull -> 411
/*     */     //   402: pop
/*     */     //   403: aload #13
/*     */     //   405: ifnull -> 419
/*     */     //   408: goto -> 432
/*     */     //   411: aload #13
/*     */     //   413: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   416: ifeq -> 432
/*     */     //   419: aload_0
/*     */     //   420: aload_1
/*     */     //   421: invokevirtual onMouseScroll : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   424: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   427: astore #4
/*     */     //   429: goto -> 910
/*     */     //   432: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   435: invokevirtual DatabaseSetSlot : ()Lscala/Enumeration$Value;
/*     */     //   438: aload_2
/*     */     //   439: astore #14
/*     */     //   441: dup
/*     */     //   442: ifnonnull -> 454
/*     */     //   445: pop
/*     */     //   446: aload #14
/*     */     //   448: ifnull -> 462
/*     */     //   451: goto -> 475
/*     */     //   454: aload #14
/*     */     //   456: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   459: ifeq -> 475
/*     */     //   462: aload_0
/*     */     //   463: aload_1
/*     */     //   464: invokevirtual onDatabaseSetSlot : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   467: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   470: astore #4
/*     */     //   472: goto -> 910
/*     */     //   475: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   478: invokevirtual MouseUp : ()Lscala/Enumeration$Value;
/*     */     //   481: aload_2
/*     */     //   482: astore #15
/*     */     //   484: dup
/*     */     //   485: ifnonnull -> 497
/*     */     //   488: pop
/*     */     //   489: aload #15
/*     */     //   491: ifnull -> 505
/*     */     //   494: goto -> 518
/*     */     //   497: aload #15
/*     */     //   499: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   502: ifeq -> 518
/*     */     //   505: aload_0
/*     */     //   506: aload_1
/*     */     //   507: invokevirtual onMouseUp : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   510: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   513: astore #4
/*     */     //   515: goto -> 910
/*     */     //   518: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   521: invokevirtual MultiPartPlace : ()Lscala/Enumeration$Value;
/*     */     //   524: aload_2
/*     */     //   525: astore #16
/*     */     //   527: dup
/*     */     //   528: ifnonnull -> 540
/*     */     //   531: pop
/*     */     //   532: aload #16
/*     */     //   534: ifnull -> 548
/*     */     //   537: goto -> 561
/*     */     //   540: aload #16
/*     */     //   542: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   545: ifeq -> 561
/*     */     //   548: aload_0
/*     */     //   549: aload_1
/*     */     //   550: invokevirtual onMultiPartPlace : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   553: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   556: astore #4
/*     */     //   558: goto -> 910
/*     */     //   561: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   564: invokevirtual PetVisibility : ()Lscala/Enumeration$Value;
/*     */     //   567: aload_2
/*     */     //   568: astore #17
/*     */     //   570: dup
/*     */     //   571: ifnonnull -> 583
/*     */     //   574: pop
/*     */     //   575: aload #17
/*     */     //   577: ifnull -> 591
/*     */     //   580: goto -> 604
/*     */     //   583: aload #17
/*     */     //   585: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   588: ifeq -> 604
/*     */     //   591: aload_0
/*     */     //   592: aload_1
/*     */     //   593: invokevirtual onPetVisibility : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   596: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   599: astore #4
/*     */     //   601: goto -> 910
/*     */     //   604: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   607: invokevirtual RackMountableMapping : ()Lscala/Enumeration$Value;
/*     */     //   610: aload_2
/*     */     //   611: astore #18
/*     */     //   613: dup
/*     */     //   614: ifnonnull -> 626
/*     */     //   617: pop
/*     */     //   618: aload #18
/*     */     //   620: ifnull -> 634
/*     */     //   623: goto -> 647
/*     */     //   626: aload #18
/*     */     //   628: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   631: ifeq -> 647
/*     */     //   634: aload_0
/*     */     //   635: aload_1
/*     */     //   636: invokevirtual onRackMountableMapping : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   639: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   642: astore #4
/*     */     //   644: goto -> 910
/*     */     //   647: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   650: invokevirtual RackRelayState : ()Lscala/Enumeration$Value;
/*     */     //   653: aload_2
/*     */     //   654: astore #19
/*     */     //   656: dup
/*     */     //   657: ifnonnull -> 669
/*     */     //   660: pop
/*     */     //   661: aload #19
/*     */     //   663: ifnull -> 677
/*     */     //   666: goto -> 690
/*     */     //   669: aload #19
/*     */     //   671: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   674: ifeq -> 690
/*     */     //   677: aload_0
/*     */     //   678: aload_1
/*     */     //   679: invokevirtual onRackRelayState : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   682: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   685: astore #4
/*     */     //   687: goto -> 910
/*     */     //   690: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   693: invokevirtual RobotAssemblerStart : ()Lscala/Enumeration$Value;
/*     */     //   696: aload_2
/*     */     //   697: astore #20
/*     */     //   699: dup
/*     */     //   700: ifnonnull -> 712
/*     */     //   703: pop
/*     */     //   704: aload #20
/*     */     //   706: ifnull -> 720
/*     */     //   709: goto -> 733
/*     */     //   712: aload #20
/*     */     //   714: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   717: ifeq -> 733
/*     */     //   720: aload_0
/*     */     //   721: aload_1
/*     */     //   722: invokevirtual onRobotAssemblerStart : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   725: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   728: astore #4
/*     */     //   730: goto -> 910
/*     */     //   733: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   736: invokevirtual RobotStateRequest : ()Lscala/Enumeration$Value;
/*     */     //   739: aload_2
/*     */     //   740: astore #21
/*     */     //   742: dup
/*     */     //   743: ifnonnull -> 755
/*     */     //   746: pop
/*     */     //   747: aload #21
/*     */     //   749: ifnull -> 763
/*     */     //   752: goto -> 776
/*     */     //   755: aload #21
/*     */     //   757: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   760: ifeq -> 776
/*     */     //   763: aload_0
/*     */     //   764: aload_1
/*     */     //   765: invokevirtual onRobotStateRequest : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   768: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   771: astore #4
/*     */     //   773: goto -> 910
/*     */     //   776: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   779: invokevirtual ServerPower : ()Lscala/Enumeration$Value;
/*     */     //   782: aload_2
/*     */     //   783: astore #22
/*     */     //   785: dup
/*     */     //   786: ifnonnull -> 798
/*     */     //   789: pop
/*     */     //   790: aload #22
/*     */     //   792: ifnull -> 806
/*     */     //   795: goto -> 819
/*     */     //   798: aload #22
/*     */     //   800: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   803: ifeq -> 819
/*     */     //   806: aload_0
/*     */     //   807: aload_1
/*     */     //   808: invokevirtual onServerPower : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   811: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   814: astore #4
/*     */     //   816: goto -> 910
/*     */     //   819: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   822: invokevirtual TextBufferInit : ()Lscala/Enumeration$Value;
/*     */     //   825: aload_2
/*     */     //   826: astore #23
/*     */     //   828: dup
/*     */     //   829: ifnonnull -> 841
/*     */     //   832: pop
/*     */     //   833: aload #23
/*     */     //   835: ifnull -> 849
/*     */     //   838: goto -> 862
/*     */     //   841: aload #23
/*     */     //   843: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   846: ifeq -> 862
/*     */     //   849: aload_0
/*     */     //   850: aload_1
/*     */     //   851: invokevirtual onTextBufferInit : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   854: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   857: astore #4
/*     */     //   859: goto -> 910
/*     */     //   862: getstatic li/cil/oc/common/PacketType$.MODULE$ : Lli/cil/oc/common/PacketType$;
/*     */     //   865: invokevirtual WaypointLabel : ()Lscala/Enumeration$Value;
/*     */     //   868: aload_2
/*     */     //   869: astore #24
/*     */     //   871: dup
/*     */     //   872: ifnonnull -> 884
/*     */     //   875: pop
/*     */     //   876: aload #24
/*     */     //   878: ifnull -> 892
/*     */     //   881: goto -> 905
/*     */     //   884: aload #24
/*     */     //   886: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   889: ifeq -> 905
/*     */     //   892: aload_0
/*     */     //   893: aload_1
/*     */     //   894: invokevirtual onWaypointLabel : (Lli/cil/oc/common/PacketHandler$PacketParser;)V
/*     */     //   897: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   900: astore #4
/*     */     //   902: goto -> 910
/*     */     //   905: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   908: astore #4
/*     */     //   910: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #44	-> 0
/*     */     //   #45	-> 5
/*     */     //   #46	-> 45
/*     */     //   #47	-> 88
/*     */     //   #48	-> 131
/*     */     //   #49	-> 174
/*     */     //   #50	-> 217
/*     */     //   #51	-> 260
/*     */     //   #52	-> 303
/*     */     //   #53	-> 346
/*     */     //   #54	-> 389
/*     */     //   #55	-> 432
/*     */     //   #56	-> 475
/*     */     //   #57	-> 518
/*     */     //   #58	-> 561
/*     */     //   #59	-> 604
/*     */     //   #60	-> 647
/*     */     //   #61	-> 690
/*     */     //   #62	-> 733
/*     */     //   #63	-> 776
/*     */     //   #64	-> 819
/*     */     //   #65	-> 862
/*     */     //   #66	-> 905
/*     */     //   #44	-> 910
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	911	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	911	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
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
/*     */   public void onComputerPower(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   4: ldc_w li/cil/oc/common/tileentity/traits/Computer
/*     */     //   7: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   10: invokevirtual readTileEntity : (Lscala/reflect/ClassTag;)Lscala/Option;
/*     */     //   13: astore_2
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual readBoolean : ()Z
/*     */     //   18: istore_3
/*     */     //   19: aload_1
/*     */     //   20: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   23: astore #4
/*     */     //   25: aload #4
/*     */     //   27: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   30: ifeq -> 239
/*     */     //   33: aload #4
/*     */     //   35: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   38: astore #5
/*     */     //   40: aload #5
/*     */     //   42: getfield field_71070_bA : Lnet/minecraft/inventory/Container;
/*     */     //   45: astore #7
/*     */     //   47: aload #7
/*     */     //   49: instanceof li/cil/oc/common/container/Player
/*     */     //   52: ifeq -> 220
/*     */     //   55: aload #7
/*     */     //   57: checkcast li/cil/oc/common/container/Player
/*     */     //   60: astore #8
/*     */     //   62: new scala/Tuple2
/*     */     //   65: dup
/*     */     //   66: aload #8
/*     */     //   68: invokevirtual otherInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   71: aload_2
/*     */     //   72: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   75: astore #10
/*     */     //   77: aload #10
/*     */     //   79: ifnull -> 201
/*     */     //   82: aload #10
/*     */     //   84: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   87: checkcast net/minecraft/inventory/IInventory
/*     */     //   90: astore #11
/*     */     //   92: aload #10
/*     */     //   94: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   97: checkcast scala/Option
/*     */     //   100: astore #12
/*     */     //   102: aload #11
/*     */     //   104: instanceof li/cil/oc/common/tileentity/traits/Computer
/*     */     //   107: ifeq -> 201
/*     */     //   110: aload #11
/*     */     //   112: checkcast li/cil/oc/common/tileentity/traits/Computer
/*     */     //   115: astore #13
/*     */     //   117: aload #12
/*     */     //   119: instanceof scala/Some
/*     */     //   122: ifeq -> 201
/*     */     //   125: aload #12
/*     */     //   127: checkcast scala/Some
/*     */     //   130: astore #14
/*     */     //   132: aload #14
/*     */     //   134: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   137: checkcast li/cil/oc/common/tileentity/traits/Computer
/*     */     //   140: astore #15
/*     */     //   142: aload #15
/*     */     //   144: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   149: aload #13
/*     */     //   151: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   156: astore #16
/*     */     //   158: dup
/*     */     //   159: ifnonnull -> 171
/*     */     //   162: pop
/*     */     //   163: aload #16
/*     */     //   165: ifnull -> 179
/*     */     //   168: goto -> 201
/*     */     //   171: aload #16
/*     */     //   173: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   176: ifeq -> 201
/*     */     //   179: aload_0
/*     */     //   180: aload #13
/*     */     //   182: invokeinterface machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   187: iload_3
/*     */     //   188: aload #5
/*     */     //   190: invokespecial trySetComputerPower : (Lli/cil/oc/api/machine/Machine;ZLnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   193: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   196: astore #17
/*     */     //   198: goto -> 212
/*     */     //   201: aload_0
/*     */     //   202: aload #5
/*     */     //   204: invokespecial logForgedPacket : (Lnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   207: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   210: astore #17
/*     */     //   212: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   215: astore #9
/*     */     //   217: goto -> 231
/*     */     //   220: aload_0
/*     */     //   221: aload #5
/*     */     //   223: invokespecial logForgedPacket : (Lnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   226: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   229: astore #9
/*     */     //   231: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   234: astore #6
/*     */     //   236: goto -> 244
/*     */     //   239: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   242: astore #6
/*     */     //   244: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #71	-> 0
/*     */     //   #72	-> 14
/*     */     //   #73	-> 19
/*     */     //   #74	-> 25
/*     */     //   #75	-> 47
/*     */     //   #76	-> 82
/*     */     //   #77	-> 179
/*     */     //   #78	-> 201
/*     */     //   #75	-> 212
/*     */     //   #80	-> 220
/*     */     //   #74	-> 231
/*     */     //   #82	-> 239
/*     */     //   #70	-> 244
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	245	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	245	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   14	231	2	entity	Lscala/Option;
/*     */     //   19	226	3	setPower	Z
/*     */     //   92	153	11	computer	Lnet/minecraft/inventory/IInventory;
/*     */     //   142	103	15	c2	Lli/cil/oc/common/tileentity/traits/Computer;
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
/*     */   public void onServerPower(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   4: ldc_w li/cil/oc/common/tileentity/Rack
/*     */     //   7: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   10: invokevirtual readTileEntity : (Lscala/reflect/ClassTag;)Lscala/Option;
/*     */     //   13: astore_2
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual readInt : ()I
/*     */     //   18: istore_3
/*     */     //   19: aload_2
/*     */     //   20: astore #5
/*     */     //   22: aload #5
/*     */     //   24: instanceof scala/Some
/*     */     //   27: ifeq -> 256
/*     */     //   30: aload #5
/*     */     //   32: checkcast scala/Some
/*     */     //   35: astore #6
/*     */     //   37: aload #6
/*     */     //   39: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   42: checkcast li/cil/oc/common/tileentity/Rack
/*     */     //   45: astore #7
/*     */     //   47: aload #7
/*     */     //   49: iload_3
/*     */     //   50: invokevirtual getMountable : (I)Lli/cil/oc/api/component/RackMountable;
/*     */     //   53: astore #9
/*     */     //   55: aload #9
/*     */     //   57: instanceof li/cil/oc/api/internal/Server
/*     */     //   60: ifeq -> 255
/*     */     //   63: aload #9
/*     */     //   65: checkcast li/cil/oc/api/internal/Server
/*     */     //   68: astore #10
/*     */     //   70: aload #10
/*     */     //   72: astore #11
/*     */     //   74: aload #11
/*     */     //   76: astore #8
/*     */     //   78: aload #8
/*     */     //   80: astore #4
/*     */     //   82: aload_1
/*     */     //   83: invokevirtual readBoolean : ()Z
/*     */     //   86: istore #12
/*     */     //   88: aload_1
/*     */     //   89: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   92: astore #13
/*     */     //   94: aload #13
/*     */     //   96: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   99: ifeq -> 249
/*     */     //   102: aload #13
/*     */     //   104: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   107: astore #14
/*     */     //   109: aload #14
/*     */     //   111: getfield field_71070_bA : Lnet/minecraft/inventory/Container;
/*     */     //   114: astore #16
/*     */     //   116: aload #16
/*     */     //   118: instanceof li/cil/oc/common/container/Server
/*     */     //   121: ifeq -> 230
/*     */     //   124: aload #16
/*     */     //   126: checkcast li/cil/oc/common/container/Server
/*     */     //   129: astore #17
/*     */     //   131: aload #17
/*     */     //   133: invokevirtual server : ()Lscala/Option;
/*     */     //   136: astore #19
/*     */     //   138: aload #19
/*     */     //   140: instanceof scala/Some
/*     */     //   143: ifeq -> 211
/*     */     //   146: aload #19
/*     */     //   148: checkcast scala/Some
/*     */     //   151: astore #20
/*     */     //   153: aload #20
/*     */     //   155: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   158: checkcast li/cil/oc/server/component/Server
/*     */     //   161: astore #21
/*     */     //   163: aload #21
/*     */     //   165: aload #4
/*     */     //   167: astore #22
/*     */     //   169: dup
/*     */     //   170: ifnonnull -> 182
/*     */     //   173: pop
/*     */     //   174: aload #22
/*     */     //   176: ifnull -> 190
/*     */     //   179: goto -> 211
/*     */     //   182: aload #22
/*     */     //   184: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   187: ifeq -> 211
/*     */     //   190: aload_0
/*     */     //   191: aload #21
/*     */     //   193: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   196: iload #12
/*     */     //   198: aload #14
/*     */     //   200: invokespecial trySetComputerPower : (Lli/cil/oc/api/machine/Machine;ZLnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   203: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   206: astore #23
/*     */     //   208: goto -> 222
/*     */     //   211: aload_0
/*     */     //   212: aload #14
/*     */     //   214: invokespecial logForgedPacket : (Lnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   217: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   220: astore #23
/*     */     //   222: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   225: astore #18
/*     */     //   227: goto -> 241
/*     */     //   230: aload_0
/*     */     //   231: aload #14
/*     */     //   233: invokespecial logForgedPacket : (Lnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   236: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   239: astore #18
/*     */     //   241: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   244: astore #15
/*     */     //   246: goto -> 254
/*     */     //   249: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   252: astore #15
/*     */     //   254: return
/*     */     //   255: return
/*     */     //   256: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 0
/*     */     //   #88	-> 14
/*     */     //   #89	-> 19
/*     */     //   #90	-> 22
/*     */     //   #91	-> 47
/*     */     //   #92	-> 55
/*     */     //   #91	-> 74
/*     */     //   #89	-> 78
/*     */     //   #97	-> 82
/*     */     //   #98	-> 88
/*     */     //   #99	-> 94
/*     */     //   #100	-> 116
/*     */     //   #101	-> 138
/*     */     //   #102	-> 190
/*     */     //   #103	-> 211
/*     */     //   #100	-> 222
/*     */     //   #105	-> 230
/*     */     //   #99	-> 241
/*     */     //   #107	-> 249
/*     */     //   #86	-> 254
/*     */     //   #93	-> 255
/*     */     //   #95	-> 256
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	257	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	257	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   14	243	2	entity	Lscala/Option;
/*     */     //   19	238	3	index	I
/*     */     //   47	210	7	t	Lli/cil/oc/common/tileentity/Rack;
/*     */     //   82	175	4	readServer	Lli/cil/oc/api/internal/Server;
/*     */     //   88	169	12	setPower	Z
/*     */     //   163	94	21	server	Lli/cil/oc/server/component/Server;
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
/*     */   public void onCopyToAnalyzer(PacketHandler.PacketParser p) {
/* 112 */     String text = p.readUTF();
/* 113 */     int line = p.readInt();
/* 114 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, text);
/* 115 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer; textBuffer.copyToAnalyzer(line, p.player()); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 116 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
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
/*     */   public void onDriveLock(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   9: ifeq -> 96
/*     */     //   12: aload_2
/*     */     //   13: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   16: astore_3
/*     */     //   17: aload_3
/*     */     //   18: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   21: astore #5
/*     */     //   23: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */     //   26: aload #5
/*     */     //   28: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   31: astore #6
/*     */     //   33: aload #6
/*     */     //   35: instanceof scala/Some
/*     */     //   38: ifeq -> 83
/*     */     //   41: aload #6
/*     */     //   43: checkcast scala/Some
/*     */     //   46: astore #7
/*     */     //   48: aload #7
/*     */     //   50: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   53: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   56: astore #8
/*     */     //   58: aload #8
/*     */     //   60: instanceof li/cil/oc/common/item/traits/FileSystemLike
/*     */     //   63: ifeq -> 83
/*     */     //   66: getstatic li/cil/oc/common/item/data/DriveData$.MODULE$ : Lli/cil/oc/common/item/data/DriveData$;
/*     */     //   69: aload #5
/*     */     //   71: aload_3
/*     */     //   72: invokevirtual lock : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;)V
/*     */     //   75: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   78: astore #9
/*     */     //   80: goto -> 88
/*     */     //   83: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   86: astore #9
/*     */     //   88: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   91: astore #4
/*     */     //   93: goto -> 101
/*     */     //   96: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   99: astore #4
/*     */     //   101: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 0
/*     */     //   #121	-> 5
/*     */     //   #122	-> 17
/*     */     //   #123	-> 23
/*     */     //   #124	-> 33
/*     */     //   #125	-> 83
/*     */     //   #123	-> 88
/*     */     //   #121	-> 91
/*     */     //   #127	-> 96
/*     */     //   #120	-> 101
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	102	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	102	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   23	68	5	heldItem	Lnet/minecraft/item/ItemStack;
/*     */     //   58	44	8	drive	Lli/cil/oc/common/item/traits/Delegate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDriveMode(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual readBoolean : ()Z
/*     */     //   4: istore_2
/*     */     //   5: aload_1
/*     */     //   6: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   9: astore_3
/*     */     //   10: aload_3
/*     */     //   11: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   14: ifeq -> 103
/*     */     //   17: aload_3
/*     */     //   18: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   21: astore #4
/*     */     //   23: aload #4
/*     */     //   25: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   28: astore #6
/*     */     //   30: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*     */     //   33: aload #6
/*     */     //   35: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   38: astore #7
/*     */     //   40: aload #7
/*     */     //   42: instanceof scala/Some
/*     */     //   45: ifeq -> 90
/*     */     //   48: aload #7
/*     */     //   50: checkcast scala/Some
/*     */     //   53: astore #8
/*     */     //   55: aload #8
/*     */     //   57: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   60: checkcast li/cil/oc/common/item/traits/Delegate
/*     */     //   63: astore #9
/*     */     //   65: aload #9
/*     */     //   67: instanceof li/cil/oc/common/item/traits/FileSystemLike
/*     */     //   70: ifeq -> 90
/*     */     //   73: getstatic li/cil/oc/common/item/data/DriveData$.MODULE$ : Lli/cil/oc/common/item/data/DriveData$;
/*     */     //   76: aload #6
/*     */     //   78: iload_2
/*     */     //   79: invokevirtual setUnmanaged : (Lnet/minecraft/item/ItemStack;Z)V
/*     */     //   82: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   85: astore #10
/*     */     //   87: goto -> 95
/*     */     //   90: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   93: astore #10
/*     */     //   95: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   98: astore #5
/*     */     //   100: goto -> 108
/*     */     //   103: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   106: astore #5
/*     */     //   108: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #131	-> 0
/*     */     //   #132	-> 5
/*     */     //   #133	-> 10
/*     */     //   #134	-> 23
/*     */     //   #135	-> 30
/*     */     //   #136	-> 40
/*     */     //   #137	-> 90
/*     */     //   #135	-> 95
/*     */     //   #133	-> 98
/*     */     //   #139	-> 103
/*     */     //   #130	-> 108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	109	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	109	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   5	104	2	unmanaged	Z
/*     */     //   30	68	6	heldItem	Lnet/minecraft/item/ItemStack;
/*     */     //   65	44	9	drive	Lli/cil/oc/common/item/traits/Delegate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDronePower(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   4: ldc_w li/cil/oc/common/entity/Drone
/*     */     //   7: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   10: invokevirtual readEntity : (Lscala/reflect/ClassTag;)Lscala/Option;
/*     */     //   13: astore_2
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual readBoolean : ()Z
/*     */     //   18: istore_3
/*     */     //   19: aload_1
/*     */     //   20: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   23: astore #4
/*     */     //   25: aload #4
/*     */     //   27: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   30: ifeq -> 205
/*     */     //   33: aload #4
/*     */     //   35: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   38: astore #5
/*     */     //   40: new scala/Tuple2
/*     */     //   43: dup
/*     */     //   44: aload #5
/*     */     //   46: getfield field_71070_bA : Lnet/minecraft/inventory/Container;
/*     */     //   49: aload_2
/*     */     //   50: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   53: astore #7
/*     */     //   55: aload #7
/*     */     //   57: ifnull -> 186
/*     */     //   60: aload #7
/*     */     //   62: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   65: checkcast net/minecraft/inventory/Container
/*     */     //   68: astore #8
/*     */     //   70: aload #7
/*     */     //   72: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   75: checkcast scala/Option
/*     */     //   78: astore #9
/*     */     //   80: aload #8
/*     */     //   82: instanceof li/cil/oc/common/container/Drone
/*     */     //   85: ifeq -> 186
/*     */     //   88: aload #8
/*     */     //   90: checkcast li/cil/oc/common/container/Drone
/*     */     //   93: astore #10
/*     */     //   95: aload #9
/*     */     //   97: instanceof scala/Some
/*     */     //   100: ifeq -> 186
/*     */     //   103: aload #9
/*     */     //   105: checkcast scala/Some
/*     */     //   108: astore #11
/*     */     //   110: aload #11
/*     */     //   112: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   115: checkcast li/cil/oc/common/entity/Drone
/*     */     //   118: astore #12
/*     */     //   120: aload #10
/*     */     //   122: invokevirtual drone : ()Lli/cil/oc/common/entity/Drone;
/*     */     //   125: aload #12
/*     */     //   127: astore #13
/*     */     //   129: dup
/*     */     //   130: ifnonnull -> 142
/*     */     //   133: pop
/*     */     //   134: aload #13
/*     */     //   136: ifnull -> 150
/*     */     //   139: goto -> 186
/*     */     //   142: aload #13
/*     */     //   144: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   147: ifeq -> 186
/*     */     //   150: aload #10
/*     */     //   152: invokevirtual drone : ()Lli/cil/oc/common/entity/Drone;
/*     */     //   155: astore #15
/*     */     //   157: iload_3
/*     */     //   158: ifeq -> 166
/*     */     //   161: aload #15
/*     */     //   163: invokevirtual preparePowerUp : ()V
/*     */     //   166: aload_0
/*     */     //   167: aload #15
/*     */     //   169: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   172: iload_3
/*     */     //   173: aload #5
/*     */     //   175: invokespecial trySetComputerPower : (Lli/cil/oc/api/machine/Machine;ZLnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   178: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   181: astore #14
/*     */     //   183: goto -> 197
/*     */     //   186: aload_0
/*     */     //   187: aload #5
/*     */     //   189: invokespecial logForgedPacket : (Lnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   192: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   195: astore #14
/*     */     //   197: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   200: astore #6
/*     */     //   202: goto -> 210
/*     */     //   205: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   208: astore #6
/*     */     //   210: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #144	-> 0
/*     */     //   #145	-> 14
/*     */     //   #146	-> 19
/*     */     //   #147	-> 25
/*     */     //   #148	-> 60
/*     */     //   #149	-> 150
/*     */     //   #150	-> 157
/*     */     //   #151	-> 161
/*     */     //   #153	-> 166
/*     */     //   #148	-> 181
/*     */     //   #154	-> 186
/*     */     //   #147	-> 197
/*     */     //   #156	-> 205
/*     */     //   #143	-> 210
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	211	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	211	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   14	197	2	entity	Lscala/Option;
/*     */     //   19	192	3	power	Z
/*     */     //   70	141	8	c	Lnet/minecraft/inventory/Container;
/*     */     //   120	91	12	readDrone	Lli/cil/oc/common/entity/Drone;
/*     */     //   157	24	15	drone	Lli/cil/oc/common/entity/Drone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void trySetComputerPower(Machine computer, boolean value, EntityPlayerMP player) {
/* 161 */     if (computer.canInteract(player.func_70005_c_()))
/* 162 */       if (value)
/* 163 */       { if (!computer.isPaused()) {
/* 164 */           computer.start();
/* 165 */           String str = computer.lastError();
/* 166 */           if (str == null)
/* 167 */           { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */           else { player.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.LastError(str)); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         
/*     */         }  }
/* 171 */       else { computer.stop(); }
/*     */        
/*     */   }
/*     */   
/*     */   public void onKeyDown(PacketHandler.PacketParser p) {
/* 176 */     String address = p.readUTF();
/* 177 */     char key = p.readChar();
/* 178 */     int code = p.readInt();
/* 179 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, address);
/* 180 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer; textBuffer.keyDown(key, code, p.player()); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 181 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onKeyUp(PacketHandler.PacketParser p) {
/* 186 */     String address = p.readUTF();
/* 187 */     char key = p.readChar();
/* 188 */     int code = p.readInt();
/* 189 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, address);
/* 190 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer; textBuffer.keyUp(key, code, p.player()); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 191 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onClipboard(PacketHandler.PacketParser p) {
/* 196 */     String address = p.readUTF();
/* 197 */     String copy = p.readUTF();
/* 198 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, address);
/* 199 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer; textBuffer.clipboard(copy, p.player()); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 200 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onMouseClick(PacketHandler.PacketParser p) {
/* 205 */     String address = p.readUTF();
/* 206 */     float x = p.readFloat();
/* 207 */     float y = p.readFloat();
/* 208 */     boolean dragging = p.readBoolean();
/* 209 */     byte button = p.readByte();
/* 210 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, address);
/* 211 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer;
/* 212 */         EntityPlayer player = p.player();
/* 213 */         textBuffer.mouseDrag(x, y, button, player);
/* 214 */         textBuffer.mouseDown(x, y, button, player); BoxedUnit boxedUnit1 = dragging ? BoxedUnit.UNIT : BoxedUnit.UNIT; return; }  }
/* 215 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onMouseUp(PacketHandler.PacketParser p) {
/* 220 */     String address = p.readUTF();
/* 221 */     float x = p.readFloat();
/* 222 */     float y = p.readFloat();
/* 223 */     byte button = p.readByte();
/* 224 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, address);
/* 225 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer;
/* 226 */         EntityPlayer player = p.player();
/* 227 */         textBuffer.mouseUp(x, y, button, player); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 228 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onMouseScroll(PacketHandler.PacketParser p) {
/* 233 */     String address = p.readUTF();
/* 234 */     float x = p.readFloat();
/* 235 */     float y = p.readFloat();
/* 236 */     byte button = p.readByte();
/* 237 */     Option option = ComponentTracker$.MODULE$.get((p.player()).field_70170_p, address);
/* 238 */     if (option instanceof Some) { Some some = (Some)option; ManagedEnvironment buffer = (ManagedEnvironment)some.x(); if (buffer instanceof TextBuffer) { TextBuffer textBuffer = (TextBuffer)buffer;
/* 239 */         EntityPlayer player = p.player();
/* 240 */         textBuffer.mouseScroll(x, y, button, player); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 241 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onDatabaseSetSlot(PacketHandler.PacketParser p) {
/* 246 */     byte slot = p.readByte();
/* 247 */     ItemStack stack = p.readItemStack();
/* 248 */     Container container = (p.player()).field_71070_bA;
/* 249 */     if (container instanceof Database) { Database database = (Database)container; database.func_75141_a(slot, stack); BoxedUnit boxedUnit = (slot < database.rows() * database.rows() && slot >= 0) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 250 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public void onMultiPartPlace(PacketHandler.PacketParser p) {
/* 255 */     EntityPlayer entityPlayer = p.player();
/* 256 */     if (entityPlayer instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer; li.cil.oc.integration.fmp.EventHandler$.MODULE$.place((EntityPlayer)entityPlayerMP); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 257 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public void onPetVisibility(PacketHandler.PacketParser p) {
/* 262 */     boolean value = p.readBoolean();
/* 263 */     EntityPlayer entityPlayer = p.player();
/* 264 */     if (entityPlayer instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 272 */       PacketSender$.MODULE$.sendPetVisibility((Option<String>)new Some(entityPlayerMP.func_70005_c_()), PacketSender$.MODULE$.sendPetVisibility$default$2()); BoxedUnit boxedUnit = (value ? PetVisibility$.MODULE$.hidden().remove(entityPlayerMP.func_70005_c_()) : PetVisibility$.MODULE$.hidden().add(entityPlayerMP.func_70005_c_())) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */     else
/* 274 */     { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRackMountableMapping(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   4: ldc_w li/cil/oc/common/tileentity/Rack
/*     */     //   7: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   10: invokevirtual readTileEntity : (Lscala/reflect/ClassTag;)Lscala/Option;
/*     */     //   13: astore_2
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual readInt : ()I
/*     */     //   18: istore_3
/*     */     //   19: aload_1
/*     */     //   20: invokevirtual readInt : ()I
/*     */     //   23: istore #4
/*     */     //   25: aload_1
/*     */     //   26: invokevirtual readDirection : ()Lscala/Option;
/*     */     //   29: astore #5
/*     */     //   31: aload_1
/*     */     //   32: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   35: astore #6
/*     */     //   37: aload #6
/*     */     //   39: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   42: ifeq -> 223
/*     */     //   45: aload #6
/*     */     //   47: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   50: astore #7
/*     */     //   52: new scala/Tuple2
/*     */     //   55: dup
/*     */     //   56: aload #7
/*     */     //   58: getfield field_71070_bA : Lnet/minecraft/inventory/Container;
/*     */     //   61: aload_2
/*     */     //   62: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   65: astore #9
/*     */     //   67: aload #9
/*     */     //   69: ifnull -> 204
/*     */     //   72: aload #9
/*     */     //   74: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   77: checkcast net/minecraft/inventory/Container
/*     */     //   80: astore #10
/*     */     //   82: aload #9
/*     */     //   84: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   87: checkcast scala/Option
/*     */     //   90: astore #11
/*     */     //   92: aload #10
/*     */     //   94: instanceof li/cil/oc/common/container/Rack
/*     */     //   97: ifeq -> 204
/*     */     //   100: aload #10
/*     */     //   102: checkcast li/cil/oc/common/container/Rack
/*     */     //   105: astore #12
/*     */     //   107: aload #11
/*     */     //   109: instanceof scala/Some
/*     */     //   112: ifeq -> 204
/*     */     //   115: aload #11
/*     */     //   117: checkcast scala/Some
/*     */     //   120: astore #13
/*     */     //   122: aload #13
/*     */     //   124: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   127: checkcast li/cil/oc/common/tileentity/Rack
/*     */     //   130: astore #14
/*     */     //   132: aload #14
/*     */     //   134: aload #12
/*     */     //   136: invokevirtual rack : ()Lli/cil/oc/common/tileentity/Rack;
/*     */     //   139: astore #15
/*     */     //   141: dup
/*     */     //   142: ifnonnull -> 154
/*     */     //   145: pop
/*     */     //   146: aload #15
/*     */     //   148: ifnull -> 162
/*     */     //   151: goto -> 204
/*     */     //   154: aload #15
/*     */     //   156: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   159: ifeq -> 204
/*     */     //   162: aload #12
/*     */     //   164: invokevirtual rack : ()Lli/cil/oc/common/tileentity/Rack;
/*     */     //   167: aload #7
/*     */     //   169: invokevirtual func_70300_a : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */     //   172: ifeq -> 196
/*     */     //   175: aload #12
/*     */     //   177: invokevirtual rack : ()Lli/cil/oc/common/tileentity/Rack;
/*     */     //   180: iload_3
/*     */     //   181: iload #4
/*     */     //   183: iconst_1
/*     */     //   184: isub
/*     */     //   185: aload #5
/*     */     //   187: invokevirtual connect : (IILscala/Option;)V
/*     */     //   190: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   193: goto -> 199
/*     */     //   196: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   199: astore #16
/*     */     //   201: goto -> 215
/*     */     //   204: aload_0
/*     */     //   205: aload #7
/*     */     //   207: invokespecial logForgedPacket : (Lnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   210: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   213: astore #16
/*     */     //   215: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   218: astore #8
/*     */     //   220: goto -> 228
/*     */     //   223: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   226: astore #8
/*     */     //   228: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #279	-> 0
/*     */     //   #280	-> 14
/*     */     //   #281	-> 19
/*     */     //   #282	-> 25
/*     */     //   #283	-> 31
/*     */     //   #284	-> 37
/*     */     //   #285	-> 72
/*     */     //   #286	-> 162
/*     */     //   #287	-> 175
/*     */     //   #286	-> 196
/*     */     //   #288	-> 204
/*     */     //   #284	-> 215
/*     */     //   #290	-> 223
/*     */     //   #278	-> 228
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	229	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	229	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   14	215	2	entity	Lscala/Option;
/*     */     //   19	210	3	mountableIndex	I
/*     */     //   25	204	4	nodeIndex	I
/*     */     //   31	198	5	side	Lscala/Option;
/*     */     //   82	147	10	container	Lnet/minecraft/inventory/Container;
/*     */     //   132	97	14	readRack	Lli/cil/oc/common/tileentity/Rack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRackRelayState(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   4: ldc_w li/cil/oc/common/tileentity/Rack
/*     */     //   7: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   10: invokevirtual readTileEntity : (Lscala/reflect/ClassTag;)Lscala/Option;
/*     */     //   13: astore_2
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual readBoolean : ()Z
/*     */     //   18: istore_3
/*     */     //   19: aload_2
/*     */     //   20: astore #4
/*     */     //   22: aload #4
/*     */     //   24: instanceof scala/Some
/*     */     //   27: ifeq -> 105
/*     */     //   30: aload #4
/*     */     //   32: checkcast scala/Some
/*     */     //   35: astore #5
/*     */     //   37: aload #5
/*     */     //   39: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   42: checkcast li/cil/oc/common/tileentity/Rack
/*     */     //   45: astore #6
/*     */     //   47: aload_1
/*     */     //   48: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   58: ifeq -> 92
/*     */     //   61: aload #8
/*     */     //   63: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   66: astore #9
/*     */     //   68: aload #6
/*     */     //   70: aload #9
/*     */     //   72: invokevirtual func_70300_a : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */     //   75: ifeq -> 92
/*     */     //   78: aload #6
/*     */     //   80: iload_3
/*     */     //   81: invokevirtual isRelayEnabled_$eq : (Z)V
/*     */     //   84: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   87: astore #10
/*     */     //   89: goto -> 97
/*     */     //   92: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   95: astore #10
/*     */     //   97: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   100: astore #7
/*     */     //   102: goto -> 110
/*     */     //   105: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   108: astore #7
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #295	-> 0
/*     */     //   #296	-> 14
/*     */     //   #297	-> 19
/*     */     //   #298	-> 22
/*     */     //   #299	-> 53
/*     */     //   #300	-> 78
/*     */     //   #301	-> 92
/*     */     //   #298	-> 97
/*     */     //   #303	-> 105
/*     */     //   #294	-> 110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	111	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	111	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   14	97	2	entity	Lscala/Option;
/*     */     //   19	92	3	enabled	Z
/*     */     //   47	64	6	t	Lli/cil/oc/common/tileentity/Rack;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRobotAssemblerStart(PacketHandler.PacketParser p) {
/* 308 */     Option entity = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(Assembler.class));
/* 309 */     Option option1 = entity;
/* 310 */     if (option1 instanceof Some) { boolean bool; Some some = (Some)option1; Assembler assembler = (Assembler)some.x();
/* 311 */       EntityPlayer entityPlayer = p.player();
/* 312 */       if (entityPlayer instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer; bool = entityPlayerMP.field_71075_bZ.field_75098_d; }
/* 313 */       else { bool = false; }
/* 314 */        assembler.output().foreach((Function1)new PacketHandler$$anonfun$onRobotAssemblerStart$1(p)); BoxedUnit boxedUnit = assembler.start(bool) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/* 315 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public void onRobotStateRequest(PacketHandler.PacketParser p) {
/* 320 */     Option option = p.readTileEntity(scala.reflect.ClassTag$.MODULE$.apply(RobotProxy.class));
/* 321 */     if (option instanceof Some) { Some some = (Some)option; RobotProxy proxy = (RobotProxy)some.x(); proxy.world().func_147471_g(proxy.x(), proxy.y(), proxy.z()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 322 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public final class PacketHandler$$anonfun$onRobotAssemblerStart$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final PacketHandler.PacketParser p$1;
/*     */     
/*     */     public final void apply(ItemStack stack) {
/*     */       li.cil.oc.common.Achievement$.MODULE$.onAssemble(stack, this.p$1.player());
/*     */     }
/*     */     
/*     */     public PacketHandler$$anonfun$onRobotAssemblerStart$1(PacketHandler.PacketParser p$1) {}
/*     */   }
/*     */   
/*     */   public void onTextBufferInit(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual readUTF : ()Ljava/lang/String;
/*     */     //   4: astore_2
/*     */     //   5: aload_1
/*     */     //   6: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   9: astore_3
/*     */     //   10: aload_3
/*     */     //   11: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   14: ifeq -> 232
/*     */     //   17: aload_3
/*     */     //   18: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   21: astore #4
/*     */     //   23: getstatic li/cil/oc/server/ComponentTracker$.MODULE$ : Lli/cil/oc/server/ComponentTracker$;
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   30: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   33: aload_2
/*     */     //   34: invokevirtual get : (Lnet/minecraft/world/World;Ljava/lang/String;)Lscala/Option;
/*     */     //   37: astore #6
/*     */     //   39: aload #6
/*     */     //   41: instanceof scala/Some
/*     */     //   44: ifeq -> 219
/*     */     //   47: aload #6
/*     */     //   49: checkcast scala/Some
/*     */     //   52: astore #7
/*     */     //   54: aload #7
/*     */     //   56: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   59: checkcast li/cil/oc/api/network/ManagedEnvironment
/*     */     //   62: astore #8
/*     */     //   64: aload #8
/*     */     //   66: instanceof li/cil/oc/common/component/TextBuffer
/*     */     //   69: ifeq -> 219
/*     */     //   72: aload #8
/*     */     //   74: checkcast li/cil/oc/common/component/TextBuffer
/*     */     //   77: astore #9
/*     */     //   79: aload #9
/*     */     //   81: invokevirtual host : ()Lli/cil/oc/api/network/EnvironmentHost;
/*     */     //   84: astore #11
/*     */     //   86: aload #11
/*     */     //   88: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   91: ifeq -> 115
/*     */     //   94: aload #11
/*     */     //   96: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   99: astore #12
/*     */     //   101: aload #12
/*     */     //   103: invokevirtual isOrigin : ()Z
/*     */     //   106: ifne -> 115
/*     */     //   109: iconst_0
/*     */     //   110: istore #13
/*     */     //   112: goto -> 118
/*     */     //   115: iconst_1
/*     */     //   116: istore #13
/*     */     //   118: iload #13
/*     */     //   120: ifeq -> 211
/*     */     //   123: new net/minecraft/nbt/NBTTagCompound
/*     */     //   126: dup
/*     */     //   127: invokespecial <init> : ()V
/*     */     //   130: astore #14
/*     */     //   132: aload #9
/*     */     //   134: invokevirtual data : ()Lli/cil/oc/util/TextBuffer;
/*     */     //   137: aload #14
/*     */     //   139: invokevirtual save : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*     */     //   142: aload #14
/*     */     //   144: ldc_w 'maxWidth'
/*     */     //   147: aload #9
/*     */     //   149: invokevirtual getMaximumWidth : ()I
/*     */     //   152: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   155: aload #14
/*     */     //   157: ldc_w 'maxHeight'
/*     */     //   160: aload #9
/*     */     //   162: invokevirtual getMaximumHeight : ()I
/*     */     //   165: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   168: aload #14
/*     */     //   170: ldc_w 'viewportWidth'
/*     */     //   173: aload #9
/*     */     //   175: invokevirtual getViewportWidth : ()I
/*     */     //   178: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   181: aload #14
/*     */     //   183: ldc_w 'viewportHeight'
/*     */     //   186: aload #9
/*     */     //   188: invokevirtual getViewportHeight : ()I
/*     */     //   191: invokevirtual func_74768_a : (Ljava/lang/String;I)V
/*     */     //   194: getstatic li/cil/oc/server/PacketSender$.MODULE$ : Lli/cil/oc/server/PacketSender$;
/*     */     //   197: aload_2
/*     */     //   198: aload #14
/*     */     //   200: aload #4
/*     */     //   202: invokevirtual sendTextBufferInit : (Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/entity/player/EntityPlayerMP;)V
/*     */     //   205: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   208: goto -> 214
/*     */     //   211: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   214: astore #10
/*     */     //   216: goto -> 224
/*     */     //   219: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   222: astore #10
/*     */     //   224: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   227: astore #5
/*     */     //   229: goto -> 237
/*     */     //   232: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   235: astore #5
/*     */     //   237: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #327	-> 0
/*     */     //   #328	-> 5
/*     */     //   #329	-> 10
/*     */     //   #330	-> 23
/*     */     //   #331	-> 39
/*     */     //   #332	-> 79
/*     */     //   #333	-> 86
/*     */     //   #334	-> 115
/*     */     //   #332	-> 118
/*     */     //   #336	-> 123
/*     */     //   #337	-> 132
/*     */     //   #338	-> 142
/*     */     //   #339	-> 155
/*     */     //   #340	-> 168
/*     */     //   #341	-> 181
/*     */     //   #342	-> 194
/*     */     //   #332	-> 211
/*     */     //   #344	-> 219
/*     */     //   #330	-> 224
/*     */     //   #346	-> 232
/*     */     //   #326	-> 237
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	238	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	238	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   5	233	2	address	Ljava/lang/String;
/*     */     //   64	174	8	buffer	Lli/cil/oc/api/network/ManagedEnvironment;
/*     */     //   132	76	14	nbt	Lnet/minecraft/nbt/NBTTagCompound;
/*     */   }
/*     */   
/*     */   public void onWaypointLabel(PacketHandler.PacketParser p) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */     //   4: ldc_w li/cil/oc/common/tileentity/Waypoint
/*     */     //   7: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */     //   10: invokevirtual readTileEntity : (Lscala/reflect/ClassTag;)Lscala/Option;
/*     */     //   13: astore_2
/*     */     //   14: new scala/collection/immutable/StringOps
/*     */     //   17: dup
/*     */     //   18: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   21: aload_1
/*     */     //   22: invokevirtual readUTF : ()Ljava/lang/String;
/*     */     //   25: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   28: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   31: bipush #32
/*     */     //   33: invokevirtual take : (I)Ljava/lang/Object;
/*     */     //   36: checkcast java/lang/String
/*     */     //   39: astore_3
/*     */     //   40: aload_2
/*     */     //   41: astore #4
/*     */     //   43: aload #4
/*     */     //   45: instanceof scala/Some
/*     */     //   48: ifeq -> 201
/*     */     //   51: aload #4
/*     */     //   53: checkcast scala/Some
/*     */     //   56: astore #5
/*     */     //   58: aload #5
/*     */     //   60: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   63: checkcast li/cil/oc/common/tileentity/Waypoint
/*     */     //   66: astore #6
/*     */     //   68: aload_1
/*     */     //   69: invokevirtual player : ()Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   72: astore #8
/*     */     //   74: aload #8
/*     */     //   76: instanceof net/minecraft/entity/player/EntityPlayerMP
/*     */     //   79: ifeq -> 188
/*     */     //   82: aload #8
/*     */     //   84: checkcast net/minecraft/entity/player/EntityPlayerMP
/*     */     //   87: astore #9
/*     */     //   89: aload #9
/*     */     //   91: aload #6
/*     */     //   93: invokevirtual x : ()I
/*     */     //   96: i2d
/*     */     //   97: ldc2_w 0.5
/*     */     //   100: dadd
/*     */     //   101: aload #6
/*     */     //   103: invokevirtual y : ()I
/*     */     //   106: i2d
/*     */     //   107: ldc2_w 0.5
/*     */     //   110: dadd
/*     */     //   111: aload #6
/*     */     //   113: invokevirtual z : ()I
/*     */     //   116: i2d
/*     */     //   117: ldc2_w 0.5
/*     */     //   120: dadd
/*     */     //   121: invokevirtual func_70092_e : (DDD)D
/*     */     //   124: bipush #64
/*     */     //   126: i2d
/*     */     //   127: dcmpg
/*     */     //   128: ifgt -> 188
/*     */     //   131: aload_3
/*     */     //   132: aload #6
/*     */     //   134: invokevirtual label : ()Ljava/lang/String;
/*     */     //   137: astore #11
/*     */     //   139: dup
/*     */     //   140: ifnonnull -> 152
/*     */     //   143: pop
/*     */     //   144: aload #11
/*     */     //   146: ifnull -> 160
/*     */     //   149: goto -> 166
/*     */     //   152: aload #11
/*     */     //   154: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   157: ifeq -> 166
/*     */     //   160: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   163: goto -> 183
/*     */     //   166: aload #6
/*     */     //   168: aload_3
/*     */     //   169: invokevirtual label_$eq : (Ljava/lang/String;)V
/*     */     //   172: getstatic li/cil/oc/server/PacketSender$.MODULE$ : Lli/cil/oc/server/PacketSender$;
/*     */     //   175: aload #6
/*     */     //   177: invokevirtual sendWaypointLabel : (Lli/cil/oc/common/tileentity/Waypoint;)V
/*     */     //   180: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   183: astore #10
/*     */     //   185: goto -> 193
/*     */     //   188: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   191: astore #10
/*     */     //   193: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   196: astore #7
/*     */     //   198: goto -> 206
/*     */     //   201: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   204: astore #7
/*     */     //   206: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #351	-> 0
/*     */     //   #352	-> 14
/*     */     //   #353	-> 40
/*     */     //   #354	-> 43
/*     */     //   #355	-> 74
/*     */     //   #356	-> 131
/*     */     //   #357	-> 166
/*     */     //   #358	-> 172
/*     */     //   #356	-> 183
/*     */     //   #360	-> 188
/*     */     //   #354	-> 193
/*     */     //   #362	-> 201
/*     */     //   #350	-> 206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	207	0	this	Lli/cil/oc/server/PacketHandler$;
/*     */     //   0	207	1	p	Lli/cil/oc/common/PacketHandler$PacketParser;
/*     */     //   14	193	2	entity	Lscala/Option;
/*     */     //   40	167	3	label	Ljava/lang/String;
/*     */     //   68	139	6	waypoint	Lli/cil/oc/common/tileentity/Waypoint;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\PacketHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */