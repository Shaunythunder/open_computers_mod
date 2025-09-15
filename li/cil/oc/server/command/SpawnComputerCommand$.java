/*    */ package li.cil.oc.server.command;
/*    */ import li.cil.oc.common.command.SimpleCommand;
/*    */ import li.cil.oc.common.tileentity.traits.Rotatable;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Function0;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction0;
/*    */ 
/*    */ public final class SpawnComputerCommand$ extends SimpleCommand {
/*    */   public static final SpawnComputerCommand$ MODULE$;
/*    */   
/*    */   private SpawnComputerCommand$() {
/* 19 */     super("oc_spawnComputer"); MODULE$ = this;
/* 20 */     aliases().$plus$eq("oc_sc");
/*    */   } private final int MaxDistance; public final int MaxDistance() {
/* 22 */     return 16;
/*    */   } public String func_71518_a(ICommandSender source) {
/* 24 */     return name();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void func_71515_b(ICommandSender source, String[] command) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: astore_3
/*    */     //   2: aload_3
/*    */     //   3: instanceof net/minecraft/entity/player/EntityPlayer
/*    */     //   6: ifeq -> 779
/*    */     //   9: aload_3
/*    */     //   10: checkcast net/minecraft/entity/player/EntityPlayer
/*    */     //   13: astore #4
/*    */     //   15: aload #4
/*    */     //   17: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*    */     //   20: astore #6
/*    */     //   22: aload #4
/*    */     //   24: getfield field_70165_t : D
/*    */     //   27: aload #4
/*    */     //   29: getfield field_70163_u : D
/*    */     //   32: aload #4
/*    */     //   34: invokevirtual func_70047_e : ()F
/*    */     //   37: f2d
/*    */     //   38: dadd
/*    */     //   39: aload #4
/*    */     //   41: getfield field_70161_v : D
/*    */     //   44: invokestatic func_72443_a : (DDD)Lnet/minecraft/util/Vec3;
/*    */     //   47: astore #7
/*    */     //   49: aload #4
/*    */     //   51: invokevirtual func_70040_Z : ()Lnet/minecraft/util/Vec3;
/*    */     //   54: astore #8
/*    */     //   56: aload #7
/*    */     //   58: aload #8
/*    */     //   60: getfield field_72450_a : D
/*    */     //   63: bipush #16
/*    */     //   65: i2d
/*    */     //   66: dmul
/*    */     //   67: aload #8
/*    */     //   69: getfield field_72448_b : D
/*    */     //   72: bipush #16
/*    */     //   74: i2d
/*    */     //   75: dmul
/*    */     //   76: aload #8
/*    */     //   78: getfield field_72449_c : D
/*    */     //   81: bipush #16
/*    */     //   83: i2d
/*    */     //   84: dmul
/*    */     //   85: invokevirtual func_72441_c : (DDD)Lnet/minecraft/util/Vec3;
/*    */     //   88: astore #9
/*    */     //   90: aload #6
/*    */     //   92: aload #7
/*    */     //   94: aload #9
/*    */     //   96: invokevirtual func_72933_a : (Lnet/minecraft/util/Vec3;Lnet/minecraft/util/Vec3;)Lnet/minecraft/util/MovingObjectPosition;
/*    */     //   99: astore #10
/*    */     //   101: aload #10
/*    */     //   103: ifnull -> 753
/*    */     //   106: aload #10
/*    */     //   108: astore #11
/*    */     //   110: aload #11
/*    */     //   112: getfield field_72313_a : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*    */     //   115: getstatic net/minecraft/util/MovingObjectPosition$MovingObjectType.BLOCK : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*    */     //   118: astore #12
/*    */     //   120: dup
/*    */     //   121: ifnonnull -> 133
/*    */     //   124: pop
/*    */     //   125: aload #12
/*    */     //   127: ifnull -> 141
/*    */     //   130: goto -> 753
/*    */     //   133: aload #12
/*    */     //   135: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   138: ifeq -> 753
/*    */     //   141: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*    */     //   144: aload #11
/*    */     //   146: getfield field_72311_b : I
/*    */     //   149: aload #11
/*    */     //   151: getfield field_72312_c : I
/*    */     //   154: aload #11
/*    */     //   156: getfield field_72309_d : I
/*    */     //   159: aload #6
/*    */     //   161: invokevirtual apply : (IIILnet/minecraft/world/World;)Lli/cil/oc/util/BlockPosition;
/*    */     //   164: astore #14
/*    */     //   166: aload #14
/*    */     //   168: aload #11
/*    */     //   170: getfield field_72310_e : I
/*    */     //   173: invokestatic getOrientation : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   176: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*    */     //   179: astore #15
/*    */     //   181: aload #15
/*    */     //   183: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   186: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*    */     //   189: astore #16
/*    */     //   191: aload #16
/*    */     //   193: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   196: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*    */     //   199: astore #17
/*    */     //   201: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   204: aload #6
/*    */     //   206: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   209: aload #15
/*    */     //   211: invokevirtual isAirBlock : (Lli/cil/oc/util/BlockPosition;)Z
/*    */     //   214: ifeq -> 737
/*    */     //   217: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   220: aload #6
/*    */     //   222: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   225: aload #16
/*    */     //   227: invokevirtual isAirBlock : (Lli/cil/oc/util/BlockPosition;)Z
/*    */     //   230: ifeq -> 737
/*    */     //   233: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   236: aload #6
/*    */     //   238: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   241: aload #17
/*    */     //   243: invokevirtual isAirBlock : (Lli/cil/oc/util/BlockPosition;)Z
/*    */     //   246: ifeq -> 737
/*    */     //   249: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   252: aload #6
/*    */     //   254: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   257: aload #15
/*    */     //   259: ldc 'caseCreative'
/*    */     //   261: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   264: invokeinterface block : ()Lnet/minecraft/block/Block;
/*    */     //   269: invokevirtual setBlock : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/block/Block;)Z
/*    */     //   272: pop
/*    */     //   273: aload_0
/*    */     //   274: aload #15
/*    */     //   276: aload #6
/*    */     //   278: aload #4
/*    */     //   280: invokespecial rotateProperly$1 : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/common/tileentity/traits/Rotatable;
/*    */     //   283: pop
/*    */     //   284: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   287: aload #6
/*    */     //   289: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   292: aload #16
/*    */     //   294: ldc 'screen2'
/*    */     //   296: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   299: invokeinterface block : ()Lnet/minecraft/block/Block;
/*    */     //   304: invokevirtual setBlock : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/block/Block;)Z
/*    */     //   307: pop
/*    */     //   308: aload_0
/*    */     //   309: aload #16
/*    */     //   311: aload #6
/*    */     //   313: aload #4
/*    */     //   315: invokespecial rotateProperly$1 : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lli/cil/oc/common/tileentity/traits/Rotatable;
/*    */     //   318: astore #18
/*    */     //   320: aload #18
/*    */     //   322: ifnull -> 411
/*    */     //   325: aload #18
/*    */     //   327: astore #19
/*    */     //   329: aload #19
/*    */     //   331: invokeinterface pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   336: astore #21
/*    */     //   338: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   341: aload #21
/*    */     //   343: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   346: ifeq -> 355
/*    */     //   349: iconst_1
/*    */     //   350: istore #22
/*    */     //   352: goto -> 375
/*    */     //   355: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   358: aload #21
/*    */     //   360: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   363: ifeq -> 372
/*    */     //   366: iconst_1
/*    */     //   367: istore #22
/*    */     //   369: goto -> 375
/*    */     //   372: iconst_0
/*    */     //   373: istore #22
/*    */     //   375: iload #22
/*    */     //   377: ifeq -> 398
/*    */     //   380: aload #19
/*    */     //   382: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   385: invokeinterface pitch_$eq : (Lnet/minecraftforge/common/util/ForgeDirection;)V
/*    */     //   390: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   393: astore #23
/*    */     //   395: goto -> 403
/*    */     //   398: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   401: astore #23
/*    */     //   403: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   406: astore #20
/*    */     //   408: goto -> 416
/*    */     //   411: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   414: astore #20
/*    */     //   416: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   419: aload #6
/*    */     //   421: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   424: aload #17
/*    */     //   426: ldc 'keyboard'
/*    */     //   428: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   431: invokeinterface block : ()Lnet/minecraft/block/Block;
/*    */     //   436: invokevirtual setBlock : (Lli/cil/oc/util/BlockPosition;Lnet/minecraft/block/Block;)Z
/*    */     //   439: pop
/*    */     //   440: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   443: aload #6
/*    */     //   445: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   448: aload #17
/*    */     //   450: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   453: astore #24
/*    */     //   455: aload #24
/*    */     //   457: instanceof li/cil/oc/common/tileentity/traits/Rotatable
/*    */     //   460: ifeq -> 498
/*    */     //   463: aload #24
/*    */     //   465: checkcast li/cil/oc/common/tileentity/traits/Rotatable
/*    */     //   468: astore #25
/*    */     //   470: aload #25
/*    */     //   472: aload #4
/*    */     //   474: invokeinterface setFromEntityPitchAndYaw : (Lnet/minecraft/entity/Entity;)Z
/*    */     //   479: pop
/*    */     //   480: aload #25
/*    */     //   482: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   485: invokeinterface setFromFacing : (Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*    */     //   490: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   493: astore #26
/*    */     //   495: goto -> 503
/*    */     //   498: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   501: astore #26
/*    */     //   503: aload #26
/*    */     //   505: pop
/*    */     //   506: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*    */     //   509: aload #6
/*    */     //   511: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*    */     //   514: aload #15
/*    */     //   516: invokevirtual getTileEntity : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   519: invokestatic joinOrCreateNetwork : (Lnet/minecraft/tileentity/TileEntity;)V
/*    */     //   522: ldc 'apuCreative'
/*    */     //   524: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   527: iconst_1
/*    */     //   528: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   533: astore #27
/*    */     //   535: getstatic li/cil/oc/server/machine/luac/LuaStateFactory$.MODULE$ : Lli/cil/oc/server/machine/luac/LuaStateFactory$;
/*    */     //   538: aload #27
/*    */     //   540: invokevirtual setDefaultArch : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;
/*    */     //   543: pop
/*    */     //   544: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   547: aload #27
/*    */     //   549: aload #15
/*    */     //   551: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   554: invokevirtual insertIntoInventoryAt$default$3 : ()Lscala/Option;
/*    */     //   557: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   560: invokevirtual insertIntoInventoryAt$default$4 : ()I
/*    */     //   563: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   566: invokevirtual insertIntoInventoryAt$default$5 : ()Z
/*    */     //   569: invokevirtual insertIntoInventoryAt : (Lnet/minecraft/item/ItemStack;Lli/cil/oc/util/BlockPosition;Lscala/Option;IZ)Z
/*    */     //   572: pop
/*    */     //   573: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   576: ldc_w 'ram6'
/*    */     //   579: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   582: iconst_2
/*    */     //   583: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   588: aload #15
/*    */     //   590: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   593: invokevirtual insertIntoInventoryAt$default$3 : ()Lscala/Option;
/*    */     //   596: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   599: invokevirtual insertIntoInventoryAt$default$4 : ()I
/*    */     //   602: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   605: invokevirtual insertIntoInventoryAt$default$5 : ()Z
/*    */     //   608: invokevirtual insertIntoInventoryAt : (Lnet/minecraft/item/ItemStack;Lli/cil/oc/util/BlockPosition;Lscala/Option;IZ)Z
/*    */     //   611: pop
/*    */     //   612: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   615: ldc_w 'hdd3'
/*    */     //   618: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   621: iconst_1
/*    */     //   622: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   627: aload #15
/*    */     //   629: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   632: invokevirtual insertIntoInventoryAt$default$3 : ()Lscala/Option;
/*    */     //   635: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   638: invokevirtual insertIntoInventoryAt$default$4 : ()I
/*    */     //   641: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   644: invokevirtual insertIntoInventoryAt$default$5 : ()Z
/*    */     //   647: invokevirtual insertIntoInventoryAt : (Lnet/minecraft/item/ItemStack;Lli/cil/oc/util/BlockPosition;Lscala/Option;IZ)Z
/*    */     //   650: pop
/*    */     //   651: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   654: ldc_w 'luaBios'
/*    */     //   657: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   660: iconst_1
/*    */     //   661: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   666: aload #15
/*    */     //   668: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   671: invokevirtual insertIntoInventoryAt$default$3 : ()Lscala/Option;
/*    */     //   674: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   677: invokevirtual insertIntoInventoryAt$default$4 : ()I
/*    */     //   680: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   683: invokevirtual insertIntoInventoryAt$default$5 : ()Z
/*    */     //   686: invokevirtual insertIntoInventoryAt : (Lnet/minecraft/item/ItemStack;Lli/cil/oc/util/BlockPosition;Lscala/Option;IZ)Z
/*    */     //   689: pop
/*    */     //   690: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   693: ldc_w 'openos'
/*    */     //   696: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   699: iconst_1
/*    */     //   700: invokeinterface createItemStack : (I)Lnet/minecraft/item/ItemStack;
/*    */     //   705: aload #15
/*    */     //   707: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   710: invokevirtual insertIntoInventoryAt$default$3 : ()Lscala/Option;
/*    */     //   713: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   716: invokevirtual insertIntoInventoryAt$default$4 : ()I
/*    */     //   719: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*    */     //   722: invokevirtual insertIntoInventoryAt$default$5 : ()Z
/*    */     //   725: invokevirtual insertIntoInventoryAt : (Lnet/minecraft/item/ItemStack;Lli/cil/oc/util/BlockPosition;Lscala/Option;IZ)Z
/*    */     //   728: pop
/*    */     //   729: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   732: astore #13
/*    */     //   734: goto -> 773
/*    */     //   737: aload #4
/*    */     //   739: new net/minecraft/util/ChatComponentText
/*    */     //   742: dup
/*    */     //   743: ldc_w 'Target position obstructed.'
/*    */     //   746: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   749: invokevirtual func_145747_a : (Lnet/minecraft/util/IChatComponent;)V
/*    */     //   752: return
/*    */     //   753: aload #4
/*    */     //   755: new net/minecraft/util/ChatComponentText
/*    */     //   758: dup
/*    */     //   759: ldc_w 'You need to be looking at a nearby block.'
/*    */     //   762: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   765: invokevirtual func_145747_a : (Lnet/minecraft/util/IChatComponent;)V
/*    */     //   768: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   771: astore #13
/*    */     //   773: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   776: astore #5
/*    */     //   778: return
/*    */     //   779: new net/minecraft/command/WrongUsageException
/*    */     //   782: dup
/*    */     //   783: ldc_w 'Can only be used by players.'
/*    */     //   786: iconst_0
/*    */     //   787: anewarray java/lang/Object
/*    */     //   790: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/Object;)V
/*    */     //   793: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 0
/*    */     //   #28	-> 2
/*    */     //   #29	-> 15
/*    */     //   #30	-> 22
/*    */     //   #31	-> 49
/*    */     //   #32	-> 56
/*    */     //   #33	-> 90
/*    */     //   #34	-> 101
/*    */     //   #35	-> 141
/*    */     //   #36	-> 166
/*    */     //   #37	-> 181
/*    */     //   #38	-> 191
/*    */     //   #40	-> 201
/*    */     //   #58	-> 249
/*    */     //   #59	-> 273
/*    */     //   #60	-> 284
/*    */     //   #61	-> 308
/*    */     //   #62	-> 320
/*    */     //   #63	-> 338
/*    */     //   #64	-> 380
/*    */     //   #65	-> 398
/*    */     //   #62	-> 403
/*    */     //   #67	-> 411
/*    */     //   #69	-> 416
/*    */     //   #70	-> 440
/*    */     //   #71	-> 455
/*    */     //   #72	-> 470
/*    */     //   #73	-> 480
/*    */     //   #71	-> 493
/*    */     //   #74	-> 498
/*    */     //   #70	-> 503
/*    */     //   #77	-> 506
/*    */     //   #79	-> 522
/*    */     //   #80	-> 535
/*    */     //   #82	-> 544
/*    */     //   #83	-> 573
/*    */     //   #84	-> 612
/*    */     //   #85	-> 651
/*    */     //   #86	-> 690
/*    */     //   #34	-> 732
/*    */     //   #41	-> 737
/*    */     //   #42	-> 752
/*    */     //   #87	-> 753
/*    */     //   #33	-> 773
/*    */     //   #28	-> 776
/*    */     //   #27	-> 778
/*    */     //   #89	-> 779
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	794	0	this	Lli/cil/oc/server/command/SpawnComputerCommand$;
/*    */     //   0	794	1	source	Lnet/minecraft/command/ICommandSender;
/*    */     //   0	794	2	command	[Ljava/lang/String;
/*    */     //   22	754	6	world	Lnet/minecraft/world/World;
/*    */     //   49	727	7	origin	Lnet/minecraft/util/Vec3;
/*    */     //   56	720	8	direction	Lnet/minecraft/util/Vec3;
/*    */     //   90	686	9	lookAt	Lnet/minecraft/util/Vec3;
/*    */     //   166	566	14	hitPos	Lli/cil/oc/util/BlockPosition;
/*    */     //   181	551	15	casePos	Lli/cil/oc/util/BlockPosition;
/*    */     //   191	541	16	screenPos	Lli/cil/oc/util/BlockPosition;
/*    */     //   201	531	17	keyboardPos	Lli/cil/oc/util/BlockPosition;
/*    */     //   535	197	27	apu	Lnet/minecraft/item/ItemStack;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Rotatable rotateProperly$1(BlockPosition pos, World world$1, EntityPlayer x2$1) {
/*    */     Rotatable rotatable;
/* 46 */     TileEntity tileEntity = li.cil.oc.util.ExtendedWorld$.MODULE$.extendedWorld(world$1).getTileEntity(pos);
/* 47 */     if (tileEntity instanceof Rotatable) { Rotatable rotatable1 = (Rotatable)tileEntity;
/* 48 */       rotatable1.setFromEntityPitchAndYaw((Entity)x2$1);
/* 49 */       if (!scala.Predef$.MODULE$.refArrayOps((Object[])rotatable1.validFacings()).contains(rotatable1.pitch())) {
/* 50 */         rotatable1.pitch_$eq((ForgeDirection)scala.Predef$.MODULE$.refArrayOps((Object[])rotatable1.validFacings()).headOption().getOrElse((Function0)new SpawnComputerCommand$$anonfun$rotateProperly$1$1()));
/*    */       }
/* 52 */       rotatable1.invertRotation();
/* 53 */       rotatable = rotatable1; }
/* 54 */     else { rotatable = null; }
/*    */     
/*    */     return rotatable;
/*    */   }
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
/*    */   public final class SpawnComputerCommand$$anonfun$rotateProperly$1$1
/*    */     extends AbstractFunction0<ForgeDirection>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
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
/*    */     public final ForgeDirection apply() {
/*    */       return ForgeDirection.NORTH;
/*    */     }
/*    */   }
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
/*    */   public int func_82362_a() {
/* 99 */     return 2;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\SpawnComputerCommand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */