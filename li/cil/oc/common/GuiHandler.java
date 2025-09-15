/*    */ package li.cil.oc.common;
/*    */ 
/*    */ import cpw.mods.fml.common.network.IGuiHandler;
/*    */ import li.cil.oc.common.inventory.DatabaseInventory;
/*    */ import li.cil.oc.common.inventory.DiskDriveMountableInventory;
/*    */ import li.cil.oc.common.inventory.Inventory;
/*    */ import li.cil.oc.common.inventory.ItemStackInventory;
/*    */ import li.cil.oc.common.inventory.ServerInventory;
/*    */ import li.cil.oc.common.inventory.SimpleInventory;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00193Q!\001\002\002\002-\021!bR;j\021\006tG\r\\3s\025\t\031A!\001\004d_6lwN\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\0011c\001\001\r)A\021QBE\007\002\035)\021q\002E\001\005Y\006twMC\001\022\003\021Q\027M^1\n\005Mq!AB(cU\026\034G\017\005\002\026?5\taC\003\002\0301\0059a.\032;x_J\\'BA\002\032\025\tQ2$A\002g[2T!\001H\017\002\t5|Gm\035\006\002=\005\0311\r]<\n\005\0012\"aC%Hk&D\025M\0343mKJDQA\t\001\005\002\r\na\001P5oSRtD#\001\023\021\005\025\002Q\"\001\002\t\013\035\002A\021\t\025\002'\035,GoU3sm\026\024x)^5FY\026lWM\034;\025\017%zC'\021%K\031B\021!&L\007\002W)\tA&A\003tG\006d\027-\003\002/W\t1\021I\\=SK\032DQ\001\r\024A\002E\n!!\0333\021\005)\022\024BA\032,\005\rIe\016\036\005\006k\031\002\rAN\001\007a2\f\0270\032:\021\005]zT\"\001\035\013\005UJ$B\001\036<\003\031)g\016^5us*\021A(P\001\n[&tWm\031:bMRT\021AP\001\004]\026$\030B\001!9\0051)e\016^5usBc\027-_3s\021\025\021e\0051\001D\003\0259xN\0357e!\t!e)D\001F\025\t\0215(\003\002H\013\n)qk\034:mI\")\021J\na\001c\005\t\001\020C\003LM\001\007\021'A\001z\021\025ie\0051\0012\003\005Q\b")
/*    */ public abstract class GuiHandler
/*    */   implements IGuiHandler
/*    */ {
/*    */   public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
/*    */     // Byte code:
/*    */     //   0: iconst_0
/*    */     //   1: istore #7
/*    */     //   3: aconst_null
/*    */     //   4: astore #8
/*    */     //   6: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   9: invokevirtual Categories : ()Lscala/collection/mutable/Map;
/*    */     //   12: iload_1
/*    */     //   13: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   16: invokeinterface get : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   21: astore #9
/*    */     //   23: aload #9
/*    */     //   25: instanceof scala/Some
/*    */     //   28: ifeq -> 826
/*    */     //   31: iconst_1
/*    */     //   32: istore #7
/*    */     //   34: aload #9
/*    */     //   36: checkcast scala/Some
/*    */     //   39: astore #8
/*    */     //   41: aload #8
/*    */     //   43: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   46: checkcast li/cil/oc/util/ScalaEnum$Value
/*    */     //   49: astore #10
/*    */     //   51: getstatic li/cil/oc/common/GuiType$Category$.MODULE$ : Lli/cil/oc/common/GuiType$Category$;
/*    */     //   54: invokevirtual Block : ()Lli/cil/oc/common/GuiType$Category$EnumVal;
/*    */     //   57: aload #10
/*    */     //   59: astore #11
/*    */     //   61: dup
/*    */     //   62: ifnonnull -> 74
/*    */     //   65: pop
/*    */     //   66: aload #11
/*    */     //   68: ifnull -> 82
/*    */     //   71: goto -> 826
/*    */     //   74: aload #11
/*    */     //   76: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   79: ifeq -> 826
/*    */     //   82: iconst_0
/*    */     //   83: istore #13
/*    */     //   85: aconst_null
/*    */     //   86: astore #14
/*    */     //   88: aload_3
/*    */     //   89: iload #4
/*    */     //   91: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   94: iload #5
/*    */     //   96: invokevirtual extractY : (I)I
/*    */     //   99: iload #6
/*    */     //   101: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   104: astore #15
/*    */     //   106: aload #15
/*    */     //   108: instanceof li/cil/oc/common/tileentity/Adapter
/*    */     //   111: ifeq -> 154
/*    */     //   114: aload #15
/*    */     //   116: checkcast li/cil/oc/common/tileentity/Adapter
/*    */     //   119: astore #16
/*    */     //   121: iload_1
/*    */     //   122: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   125: invokevirtual Adapter : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   128: invokeinterface id : ()I
/*    */     //   133: if_icmpne -> 154
/*    */     //   136: new li/cil/oc/common/container/Adapter
/*    */     //   139: dup
/*    */     //   140: aload_2
/*    */     //   141: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   144: aload #16
/*    */     //   146: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Adapter;)V
/*    */     //   149: astore #17
/*    */     //   151: goto -> 819
/*    */     //   154: aload #15
/*    */     //   156: instanceof li/cil/oc/common/tileentity/Assembler
/*    */     //   159: ifeq -> 202
/*    */     //   162: aload #15
/*    */     //   164: checkcast li/cil/oc/common/tileentity/Assembler
/*    */     //   167: astore #18
/*    */     //   169: iload_1
/*    */     //   170: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   173: invokevirtual Assembler : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   176: invokeinterface id : ()I
/*    */     //   181: if_icmpne -> 202
/*    */     //   184: new li/cil/oc/common/container/Assembler
/*    */     //   187: dup
/*    */     //   188: aload_2
/*    */     //   189: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   192: aload #18
/*    */     //   194: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Assembler;)V
/*    */     //   197: astore #17
/*    */     //   199: goto -> 819
/*    */     //   202: aload #15
/*    */     //   204: instanceof li/cil/oc/common/tileentity/Charger
/*    */     //   207: ifeq -> 250
/*    */     //   210: aload #15
/*    */     //   212: checkcast li/cil/oc/common/tileentity/Charger
/*    */     //   215: astore #19
/*    */     //   217: iload_1
/*    */     //   218: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   221: invokevirtual Charger : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   224: invokeinterface id : ()I
/*    */     //   229: if_icmpne -> 250
/*    */     //   232: new li/cil/oc/common/container/Charger
/*    */     //   235: dup
/*    */     //   236: aload_2
/*    */     //   237: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   240: aload #19
/*    */     //   242: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Charger;)V
/*    */     //   245: astore #17
/*    */     //   247: goto -> 819
/*    */     //   250: aload #15
/*    */     //   252: instanceof li/cil/oc/common/tileentity/Case
/*    */     //   255: ifeq -> 298
/*    */     //   258: aload #15
/*    */     //   260: checkcast li/cil/oc/common/tileentity/Case
/*    */     //   263: astore #20
/*    */     //   265: iload_1
/*    */     //   266: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   269: invokevirtual Case : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   272: invokeinterface id : ()I
/*    */     //   277: if_icmpne -> 298
/*    */     //   280: new li/cil/oc/common/container/Case
/*    */     //   283: dup
/*    */     //   284: aload_2
/*    */     //   285: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   288: aload #20
/*    */     //   290: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Case;)V
/*    */     //   293: astore #17
/*    */     //   295: goto -> 819
/*    */     //   298: aload #15
/*    */     //   300: instanceof li/cil/oc/common/tileentity/Disassembler
/*    */     //   303: ifeq -> 346
/*    */     //   306: aload #15
/*    */     //   308: checkcast li/cil/oc/common/tileentity/Disassembler
/*    */     //   311: astore #21
/*    */     //   313: iload_1
/*    */     //   314: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   317: invokevirtual Disassembler : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   320: invokeinterface id : ()I
/*    */     //   325: if_icmpne -> 346
/*    */     //   328: new li/cil/oc/common/container/Disassembler
/*    */     //   331: dup
/*    */     //   332: aload_2
/*    */     //   333: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   336: aload #21
/*    */     //   338: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Disassembler;)V
/*    */     //   341: astore #17
/*    */     //   343: goto -> 819
/*    */     //   346: aload #15
/*    */     //   348: instanceof li/cil/oc/common/tileentity/DiskDrive
/*    */     //   351: ifeq -> 394
/*    */     //   354: aload #15
/*    */     //   356: checkcast li/cil/oc/common/tileentity/DiskDrive
/*    */     //   359: astore #22
/*    */     //   361: iload_1
/*    */     //   362: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   365: invokevirtual DiskDrive : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   368: invokeinterface id : ()I
/*    */     //   373: if_icmpne -> 394
/*    */     //   376: new li/cil/oc/common/container/DiskDrive
/*    */     //   379: dup
/*    */     //   380: aload_2
/*    */     //   381: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   384: aload #22
/*    */     //   386: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/inventory/IInventory;)V
/*    */     //   389: astore #17
/*    */     //   391: goto -> 819
/*    */     //   394: aload #15
/*    */     //   396: instanceof li/cil/oc/common/tileentity/Printer
/*    */     //   399: ifeq -> 442
/*    */     //   402: aload #15
/*    */     //   404: checkcast li/cil/oc/common/tileentity/Printer
/*    */     //   407: astore #23
/*    */     //   409: iload_1
/*    */     //   410: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   413: invokevirtual Printer : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   416: invokeinterface id : ()I
/*    */     //   421: if_icmpne -> 442
/*    */     //   424: new li/cil/oc/common/container/Printer
/*    */     //   427: dup
/*    */     //   428: aload_2
/*    */     //   429: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   432: aload #23
/*    */     //   434: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Printer;)V
/*    */     //   437: astore #17
/*    */     //   439: goto -> 819
/*    */     //   442: aload #15
/*    */     //   444: instanceof li/cil/oc/common/tileentity/Raid
/*    */     //   447: ifeq -> 490
/*    */     //   450: aload #15
/*    */     //   452: checkcast li/cil/oc/common/tileentity/Raid
/*    */     //   455: astore #24
/*    */     //   457: iload_1
/*    */     //   458: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   461: invokevirtual Raid : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   464: invokeinterface id : ()I
/*    */     //   469: if_icmpne -> 490
/*    */     //   472: new li/cil/oc/common/container/Raid
/*    */     //   475: dup
/*    */     //   476: aload_2
/*    */     //   477: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   480: aload #24
/*    */     //   482: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Raid;)V
/*    */     //   485: astore #17
/*    */     //   487: goto -> 819
/*    */     //   490: aload #15
/*    */     //   492: instanceof li/cil/oc/common/tileentity/Relay
/*    */     //   495: ifeq -> 538
/*    */     //   498: aload #15
/*    */     //   500: checkcast li/cil/oc/common/tileentity/Relay
/*    */     //   503: astore #25
/*    */     //   505: iload_1
/*    */     //   506: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   509: invokevirtual Relay : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   512: invokeinterface id : ()I
/*    */     //   517: if_icmpne -> 538
/*    */     //   520: new li/cil/oc/common/container/Relay
/*    */     //   523: dup
/*    */     //   524: aload_2
/*    */     //   525: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   528: aload #25
/*    */     //   530: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Relay;)V
/*    */     //   533: astore #17
/*    */     //   535: goto -> 819
/*    */     //   538: aload #15
/*    */     //   540: instanceof li/cil/oc/common/tileentity/RobotProxy
/*    */     //   543: ifeq -> 589
/*    */     //   546: aload #15
/*    */     //   548: checkcast li/cil/oc/common/tileentity/RobotProxy
/*    */     //   551: astore #26
/*    */     //   553: iload_1
/*    */     //   554: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   557: invokevirtual Robot : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   560: invokeinterface id : ()I
/*    */     //   565: if_icmpne -> 589
/*    */     //   568: new li/cil/oc/common/container/Robot
/*    */     //   571: dup
/*    */     //   572: aload_2
/*    */     //   573: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   576: aload #26
/*    */     //   578: invokevirtual robot : ()Lli/cil/oc/common/tileentity/Robot;
/*    */     //   581: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Robot;)V
/*    */     //   584: astore #17
/*    */     //   586: goto -> 819
/*    */     //   589: aload #15
/*    */     //   591: instanceof li/cil/oc/common/tileentity/Rack
/*    */     //   594: ifeq -> 640
/*    */     //   597: iconst_1
/*    */     //   598: istore #13
/*    */     //   600: aload #15
/*    */     //   602: checkcast li/cil/oc/common/tileentity/Rack
/*    */     //   605: astore #14
/*    */     //   607: iload_1
/*    */     //   608: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   611: invokevirtual Rack : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   614: invokeinterface id : ()I
/*    */     //   619: if_icmpne -> 640
/*    */     //   622: new li/cil/oc/common/container/Rack
/*    */     //   625: dup
/*    */     //   626: aload_2
/*    */     //   627: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   630: aload #14
/*    */     //   632: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Rack;)V
/*    */     //   635: astore #17
/*    */     //   637: goto -> 819
/*    */     //   640: iload #13
/*    */     //   642: ifeq -> 708
/*    */     //   645: iload_1
/*    */     //   646: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   649: invokevirtual ServerInRack : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   652: invokeinterface id : ()I
/*    */     //   657: if_icmpne -> 708
/*    */     //   660: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   663: iload #5
/*    */     //   665: invokevirtual extractSlot : (I)I
/*    */     //   668: istore #27
/*    */     //   670: aload #14
/*    */     //   672: iload #27
/*    */     //   674: invokevirtual getMountable : (I)Lli/cil/oc/api/component/RackMountable;
/*    */     //   677: checkcast li/cil/oc/server/component/Server
/*    */     //   680: astore #28
/*    */     //   682: new li/cil/oc/common/container/Server
/*    */     //   685: dup
/*    */     //   686: aload_2
/*    */     //   687: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   690: aload #28
/*    */     //   692: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   695: aload #28
/*    */     //   697: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   700: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/inventory/ServerInventory;Lscala/Option;)V
/*    */     //   703: astore #17
/*    */     //   705: goto -> 819
/*    */     //   708: iload #13
/*    */     //   710: ifeq -> 768
/*    */     //   713: iload_1
/*    */     //   714: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   717: invokevirtual DiskDriveMountableInRack : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   720: invokeinterface id : ()I
/*    */     //   725: if_icmpne -> 768
/*    */     //   728: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   731: iload #5
/*    */     //   733: invokevirtual extractSlot : (I)I
/*    */     //   736: istore #29
/*    */     //   738: aload #14
/*    */     //   740: iload #29
/*    */     //   742: invokevirtual getMountable : (I)Lli/cil/oc/api/component/RackMountable;
/*    */     //   745: checkcast li/cil/oc/server/component/DiskDriveMountable
/*    */     //   748: astore #30
/*    */     //   750: new li/cil/oc/common/container/DiskDrive
/*    */     //   753: dup
/*    */     //   754: aload_2
/*    */     //   755: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   758: aload #30
/*    */     //   760: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/inventory/IInventory;)V
/*    */     //   763: astore #17
/*    */     //   765: goto -> 819
/*    */     //   768: aload #15
/*    */     //   770: instanceof li/cil/oc/common/tileentity/Switch
/*    */     //   773: ifeq -> 816
/*    */     //   776: aload #15
/*    */     //   778: checkcast li/cil/oc/common/tileentity/Switch
/*    */     //   781: astore #31
/*    */     //   783: iload_1
/*    */     //   784: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   787: invokevirtual Switch : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   790: invokeinterface id : ()I
/*    */     //   795: if_icmpne -> 816
/*    */     //   798: new li/cil/oc/common/container/Switch
/*    */     //   801: dup
/*    */     //   802: aload_2
/*    */     //   803: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   806: aload #31
/*    */     //   808: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/tileentity/Switch;)V
/*    */     //   811: astore #17
/*    */     //   813: goto -> 819
/*    */     //   816: aconst_null
/*    */     //   817: astore #17
/*    */     //   819: aload #17
/*    */     //   821: astore #12
/*    */     //   823: goto -> 1304
/*    */     //   826: iload #7
/*    */     //   828: ifeq -> 938
/*    */     //   831: aload #8
/*    */     //   833: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   836: checkcast li/cil/oc/util/ScalaEnum$Value
/*    */     //   839: astore #32
/*    */     //   841: getstatic li/cil/oc/common/GuiType$Category$.MODULE$ : Lli/cil/oc/common/GuiType$Category$;
/*    */     //   844: invokevirtual Entity : ()Lli/cil/oc/common/GuiType$Category$EnumVal;
/*    */     //   847: aload #32
/*    */     //   849: astore #33
/*    */     //   851: dup
/*    */     //   852: ifnonnull -> 864
/*    */     //   855: pop
/*    */     //   856: aload #33
/*    */     //   858: ifnull -> 872
/*    */     //   861: goto -> 938
/*    */     //   864: aload #33
/*    */     //   866: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   869: ifeq -> 938
/*    */     //   872: aload_3
/*    */     //   873: iload #4
/*    */     //   875: invokevirtual func_73045_a : (I)Lnet/minecraft/entity/Entity;
/*    */     //   878: astore #34
/*    */     //   880: aload #34
/*    */     //   882: instanceof li/cil/oc/common/entity/Drone
/*    */     //   885: ifeq -> 928
/*    */     //   888: aload #34
/*    */     //   890: checkcast li/cil/oc/common/entity/Drone
/*    */     //   893: astore #35
/*    */     //   895: iload_1
/*    */     //   896: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   899: invokevirtual Drone : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   902: invokeinterface id : ()I
/*    */     //   907: if_icmpne -> 928
/*    */     //   910: new li/cil/oc/common/container/Drone
/*    */     //   913: dup
/*    */     //   914: aload_2
/*    */     //   915: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   918: aload #35
/*    */     //   920: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/entity/Drone;)V
/*    */     //   923: astore #36
/*    */     //   925: goto -> 931
/*    */     //   928: aconst_null
/*    */     //   929: astore #36
/*    */     //   931: aload #36
/*    */     //   933: astore #12
/*    */     //   935: goto -> 1304
/*    */     //   938: iload #7
/*    */     //   940: ifeq -> 1301
/*    */     //   943: aload #8
/*    */     //   945: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   948: checkcast li/cil/oc/util/ScalaEnum$Value
/*    */     //   951: astore #37
/*    */     //   953: getstatic li/cil/oc/common/GuiType$Category$.MODULE$ : Lli/cil/oc/common/GuiType$Category$;
/*    */     //   956: invokevirtual Item : ()Lli/cil/oc/common/GuiType$Category$EnumVal;
/*    */     //   959: aload #37
/*    */     //   961: astore #38
/*    */     //   963: dup
/*    */     //   964: ifnonnull -> 976
/*    */     //   967: pop
/*    */     //   968: aload #38
/*    */     //   970: ifnull -> 984
/*    */     //   973: goto -> 1301
/*    */     //   976: aload #38
/*    */     //   978: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   981: ifeq -> 1301
/*    */     //   984: iconst_0
/*    */     //   985: istore #39
/*    */     //   987: aconst_null
/*    */     //   988: astore #40
/*    */     //   990: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
/*    */     //   993: aload_2
/*    */     //   994: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*    */     //   997: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*    */     //   1000: astore #41
/*    */     //   1002: aload #41
/*    */     //   1004: instanceof scala/Some
/*    */     //   1007: ifeq -> 1078
/*    */     //   1010: iconst_1
/*    */     //   1011: istore #39
/*    */     //   1013: aload #41
/*    */     //   1015: checkcast scala/Some
/*    */     //   1018: astore #40
/*    */     //   1020: aload #40
/*    */     //   1022: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   1025: checkcast li/cil/oc/common/item/traits/Delegate
/*    */     //   1028: astore #42
/*    */     //   1030: aload #42
/*    */     //   1032: instanceof li/cil/oc/common/item/UpgradeDatabase
/*    */     //   1035: ifeq -> 1078
/*    */     //   1038: iload_1
/*    */     //   1039: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   1042: invokevirtual Database : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   1045: invokeinterface id : ()I
/*    */     //   1050: if_icmpne -> 1078
/*    */     //   1053: new li/cil/oc/common/container/Database
/*    */     //   1056: dup
/*    */     //   1057: aload_2
/*    */     //   1058: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   1061: new li/cil/oc/common/GuiHandler$$anon$1
/*    */     //   1064: dup
/*    */     //   1065: aload_0
/*    */     //   1066: aload_2
/*    */     //   1067: invokespecial <init> : (Lli/cil/oc/common/GuiHandler;Lnet/minecraft/entity/player/EntityPlayer;)V
/*    */     //   1070: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/inventory/DatabaseInventory;)V
/*    */     //   1073: astore #43
/*    */     //   1075: goto -> 1294
/*    */     //   1078: iload #39
/*    */     //   1080: ifeq -> 1147
/*    */     //   1083: aload #40
/*    */     //   1085: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   1088: checkcast li/cil/oc/common/item/traits/Delegate
/*    */     //   1091: astore #44
/*    */     //   1093: aload #44
/*    */     //   1095: instanceof li/cil/oc/common/item/Server
/*    */     //   1098: ifeq -> 1147
/*    */     //   1101: iload_1
/*    */     //   1102: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   1105: invokevirtual Server : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   1108: invokeinterface id : ()I
/*    */     //   1113: if_icmpne -> 1147
/*    */     //   1116: new li/cil/oc/common/container/Server
/*    */     //   1119: dup
/*    */     //   1120: aload_2
/*    */     //   1121: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   1124: new li/cil/oc/common/GuiHandler$$anon$2
/*    */     //   1127: dup
/*    */     //   1128: aload_0
/*    */     //   1129: aload_2
/*    */     //   1130: invokespecial <init> : (Lli/cil/oc/common/GuiHandler;Lnet/minecraft/entity/player/EntityPlayer;)V
/*    */     //   1133: getstatic li/cil/oc/common/container/Server$.MODULE$ : Lli/cil/oc/common/container/Server$;
/*    */     //   1136: invokevirtual $lessinit$greater$default$3 : ()Lscala/Option;
/*    */     //   1139: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/inventory/ServerInventory;Lscala/Option;)V
/*    */     //   1142: astore #43
/*    */     //   1144: goto -> 1294
/*    */     //   1147: iload #39
/*    */     //   1149: ifeq -> 1228
/*    */     //   1152: aload #40
/*    */     //   1154: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   1157: checkcast li/cil/oc/common/item/traits/Delegate
/*    */     //   1160: astore #45
/*    */     //   1162: aload #45
/*    */     //   1164: instanceof li/cil/oc/common/item/Tablet
/*    */     //   1167: ifeq -> 1228
/*    */     //   1170: iload_1
/*    */     //   1171: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   1174: invokevirtual TabletInner : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   1177: invokeinterface id : ()I
/*    */     //   1182: if_icmpne -> 1228
/*    */     //   1185: aload_2
/*    */     //   1186: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*    */     //   1189: astore #46
/*    */     //   1191: aload #46
/*    */     //   1193: invokevirtual func_77942_o : ()Z
/*    */     //   1196: ifeq -> 1222
/*    */     //   1199: new li/cil/oc/common/container/Tablet
/*    */     //   1202: dup
/*    */     //   1203: aload_2
/*    */     //   1204: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   1207: getstatic li/cil/oc/common/item/Tablet$.MODULE$ : Lli/cil/oc/common/item/Tablet$;
/*    */     //   1210: aload #46
/*    */     //   1212: aload_2
/*    */     //   1213: invokevirtual get : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/common/item/TabletWrapper;
/*    */     //   1216: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lli/cil/oc/common/item/TabletWrapper;)V
/*    */     //   1219: goto -> 1223
/*    */     //   1222: aconst_null
/*    */     //   1223: astore #43
/*    */     //   1225: goto -> 1294
/*    */     //   1228: iload #39
/*    */     //   1230: ifeq -> 1291
/*    */     //   1233: aload #40
/*    */     //   1235: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   1238: checkcast li/cil/oc/common/item/traits/Delegate
/*    */     //   1241: astore #47
/*    */     //   1243: aload #47
/*    */     //   1245: instanceof li/cil/oc/common/item/DiskDriveMountable
/*    */     //   1248: ifeq -> 1291
/*    */     //   1251: iload_1
/*    */     //   1252: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*    */     //   1255: invokevirtual DiskDriveMountable : ()Lli/cil/oc/common/GuiType$EnumVal;
/*    */     //   1258: invokeinterface id : ()I
/*    */     //   1263: if_icmpne -> 1291
/*    */     //   1266: new li/cil/oc/common/container/DiskDrive
/*    */     //   1269: dup
/*    */     //   1270: aload_2
/*    */     //   1271: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*    */     //   1274: new li/cil/oc/common/GuiHandler$$anon$3
/*    */     //   1277: dup
/*    */     //   1278: aload_0
/*    */     //   1279: aload_2
/*    */     //   1280: invokespecial <init> : (Lli/cil/oc/common/GuiHandler;Lnet/minecraft/entity/player/EntityPlayer;)V
/*    */     //   1283: invokespecial <init> : (Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/inventory/IInventory;)V
/*    */     //   1286: astore #43
/*    */     //   1288: goto -> 1294
/*    */     //   1291: aconst_null
/*    */     //   1292: astore #43
/*    */     //   1294: aload #43
/*    */     //   1296: astore #12
/*    */     //   1298: goto -> 1304
/*    */     //   1301: aconst_null
/*    */     //   1302: astore #12
/*    */     //   1304: aload #12
/*    */     //   1306: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     //   #13	-> 6
/*    */     //   #14	-> 23
/*    */     //   #36	-> 82
/*    */     //   #15	-> 88
/*    */     //   #16	-> 106
/*    */     //   #17	-> 136
/*    */     //   #18	-> 154
/*    */     //   #19	-> 184
/*    */     //   #20	-> 202
/*    */     //   #21	-> 232
/*    */     //   #22	-> 250
/*    */     //   #23	-> 280
/*    */     //   #24	-> 298
/*    */     //   #25	-> 328
/*    */     //   #26	-> 346
/*    */     //   #27	-> 376
/*    */     //   #28	-> 394
/*    */     //   #29	-> 424
/*    */     //   #30	-> 442
/*    */     //   #31	-> 472
/*    */     //   #32	-> 490
/*    */     //   #33	-> 520
/*    */     //   #34	-> 538
/*    */     //   #35	-> 568
/*    */     //   #36	-> 589
/*    */     //   #37	-> 622
/*    */     //   #15	-> 640
/*    */     //   #38	-> 645
/*    */     //   #39	-> 660
/*    */     //   #40	-> 670
/*    */     //   #41	-> 682
/*    */     //   #38	-> 703
/*    */     //   #15	-> 708
/*    */     //   #42	-> 713
/*    */     //   #43	-> 728
/*    */     //   #44	-> 738
/*    */     //   #45	-> 750
/*    */     //   #42	-> 763
/*    */     //   #46	-> 768
/*    */     //   #47	-> 798
/*    */     //   #48	-> 816
/*    */     //   #15	-> 819
/*    */     //   #13	-> 826
/*    */     //   #50	-> 831
/*    */     //   #51	-> 872
/*    */     //   #52	-> 880
/*    */     //   #53	-> 910
/*    */     //   #54	-> 928
/*    */     //   #51	-> 931
/*    */     //   #13	-> 938
/*    */     //   #56	-> 943
/*    */     //   #58	-> 984
/*    */     //   #57	-> 990
/*    */     //   #58	-> 1002
/*    */     //   #59	-> 1053
/*    */     //   #57	-> 1078
/*    */     //   #64	-> 1083
/*    */     //   #65	-> 1116
/*    */     //   #57	-> 1147
/*    */     //   #70	-> 1152
/*    */     //   #71	-> 1185
/*    */     //   #72	-> 1191
/*    */     //   #73	-> 1199
/*    */     //   #75	-> 1222
/*    */     //   #70	-> 1223
/*    */     //   #57	-> 1228
/*    */     //   #76	-> 1233
/*    */     //   #77	-> 1266
/*    */     //   #82	-> 1291
/*    */     //   #57	-> 1294
/*    */     //   #84	-> 1301
/*    */     //   #13	-> 1304
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	1307	0	this	Lli/cil/oc/common/GuiHandler;
/*    */     //   0	1307	1	id	I
/*    */     //   0	1307	2	player	Lnet/minecraft/entity/player/EntityPlayer;
/*    */     //   0	1307	3	world	Lnet/minecraft/world/World;
/*    */     //   0	1307	4	x	I
/*    */     //   0	1307	5	y	I
/*    */     //   0	1307	6	z	I
/*    */     //   670	33	27	slot	I
/*    */     //   682	21	28	server	Lli/cil/oc/server/component/Server;
/*    */     //   738	25	29	slot	I
/*    */     //   750	13	30	drive	Lli/cil/oc/server/component/DiskDriveMountable;
/*    */     //   1030	277	42	database	Lli/cil/oc/common/item/traits/Delegate;
/*    */     //   1093	214	44	server	Lli/cil/oc/common/item/traits/Delegate;
/*    */     //   1162	145	45	tablet	Lli/cil/oc/common/item/traits/Delegate;
/*    */     //   1191	116	46	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   1243	64	47	drive	Lli/cil/oc/common/item/traits/Delegate;
/*    */   }
/*    */   
/*    */   public final class GuiHandler$$anon$1
/*    */     implements DatabaseInventory
/*    */   {
/*    */     private final EntityPlayer player$1;
/*    */     private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory;
/*    */     private volatile boolean bitmap$0;
/*    */     
/*    */     public int tier() {
/* 59 */       return DatabaseInventory.class.tier(this); } public int func_70302_i_() { return DatabaseInventory.class.getSizeInventory(this); } public String inventoryName() { return DatabaseInventory.class.inventoryName(this); } public int func_70297_j_() { return DatabaseInventory.class.getInventoryStackLimit(this); } public int getInventoryStackRequired() { return DatabaseInventory.class.getInventoryStackRequired(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DatabaseInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$1(GuiHandler $outer, EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DatabaseInventory.class.$init$(this); } public ItemStack container() {
/* 60 */       return this.player$1.func_70694_bm();
/*    */     }
/* 62 */     public boolean func_70300_a(EntityPlayer player) { EntityPlayer entityPlayer = player; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*    */       {  }
/*    */        }
/* 65 */   } public final class GuiHandler$$anon$2 implements ServerInventory { private final EntityPlayer player$1; public int tier() { return ServerInventory.class.tier(this); } private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory; private volatile boolean bitmap$0; public int func_70302_i_() { return ServerInventory.class.getSizeInventory(this); } public String inventoryName() { return ServerInventory.class.inventoryName(this); } public int func_70297_j_() { return ServerInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return ServerInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$2(GuiHandler $outer, EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); ServerInventory.class.$init$(this); } public ItemStack container() {
/* 66 */       return this.player$1.func_70694_bm();
/*    */     } public boolean func_70300_a(EntityPlayer player) {
/* 68 */       EntityPlayer entityPlayer = player; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*    */       {  }
/*    */     
/*    */     } }
/*    */   
/*    */   public final class GuiHandler$$anon$3 implements DiskDriveMountableInventory { private final EntityPlayer player$1;
/*    */     private final Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory;
/*    */     private volatile boolean bitmap$0;
/*    */     
/* 77 */     public int tier() { return DiskDriveMountableInventory.class.tier(this); } public int func_70302_i_() { return DiskDriveMountableInventory.class.getSizeInventory(this); } public String inventoryName() { return DiskDriveMountableInventory.class.inventoryName(this); } public int func_70297_j_() { return DiskDriveMountableInventory.class.getInventoryStackLimit(this); } public boolean func_94041_b(int slot, ItemStack stack) { return DiskDriveMountableInventory.class.isItemValidForSlot(this, slot, stack); } private Option[] li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.li$cil$oc$common$inventory$ItemStackInventory$$inventory = (Option<ItemStack>[])ItemStackInventory.class.li$cil$oc$common$inventory$ItemStackInventory$$inventory((ItemStackInventory)this); this.bitmap$0 = true; }  return (Option[])this.li$cil$oc$common$inventory$ItemStackInventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$inventory$ItemStackInventory$$inventory() { return this.bitmap$0 ? this.li$cil$oc$common$inventory$ItemStackInventory$$inventory : (Option<ItemStack>[])li$cil$oc$common$inventory$ItemStackInventory$$inventory$lzycompute(); } public Option<ItemStack>[] items() { return (Option<ItemStack>[])ItemStackInventory.class.items((ItemStackInventory)this); } public void reinitialize() { ItemStackInventory.class.reinitialize((ItemStackInventory)this); } public void func_70296_d() { ItemStackInventory.class.markDirty((ItemStackInventory)this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public GuiHandler$$anon$3(GuiHandler $outer, EntityPlayer player$1) { SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); ItemStackInventory.class.$init$((ItemStackInventory)this); DiskDriveMountableInventory.class.$init$(this); } public ItemStack container() {
/* 78 */       return this.player$1.func_70694_bm();
/*    */     } public boolean func_70300_a(EntityPlayer player) {
/* 80 */       EntityPlayer entityPlayer = player; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*    */       {  }
/*    */     
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\GuiHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */