/*     */ package li.cil.oc.integration.fmp;
/*     */ 
/*     */ import codechicken.lib.vec.BlockCoord;
/*     */ import codechicken.multipart.TMultiPart;
/*     */ import codechicken.multipart.TileMultipart;
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*     */ import scala.Function2;
/*     */ import scala.MatchError;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.runtime.AbstractFunction2;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class EventHandler$ {
/*     */   public static final EventHandler$ MODULE$;
/*     */   
/*  25 */   private boolean currentlyPlacing() { return this.currentlyPlacing; } private boolean currentlyPlacing; private final ForgeDirection[] yaw2Direction; private void currentlyPlacing_$eq(boolean x$1) { this.currentlyPlacing = x$1; }
/*     */    private ForgeDirection[] yaw2Direction() {
/*  27 */     return this.yaw2Direction;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public synchronized void playerInteract(PlayerInteractEvent event) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial currentlyPlacing : ()Z
/*     */     //   4: ifeq -> 8
/*     */     //   7: return
/*     */     //   8: aload_0
/*     */     //   9: iconst_1
/*     */     //   10: invokespecial currentlyPlacing_$eq : (Z)V
/*     */     //   13: aload_1
/*     */     //   14: getfield entityPlayer : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   17: astore_3
/*     */     //   18: aload_1
/*     */     //   19: getfield action : Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$Action;
/*     */     //   22: getstatic net/minecraftforge/event/entity/player/PlayerInteractEvent$Action.RIGHT_CLICK_BLOCK : Lnet/minecraftforge/event/entity/player/PlayerInteractEvent$Action;
/*     */     //   25: astore #4
/*     */     //   27: dup
/*     */     //   28: ifnonnull -> 40
/*     */     //   31: pop
/*     */     //   32: aload #4
/*     */     //   34: ifnull -> 48
/*     */     //   37: goto -> 71
/*     */     //   40: aload #4
/*     */     //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   45: ifeq -> 71
/*     */     //   48: aload_3
/*     */     //   49: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   52: getfield field_72995_K : Z
/*     */     //   55: ifeq -> 71
/*     */     //   58: aload_0
/*     */     //   59: aload_3
/*     */     //   60: invokevirtual place : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: aload_1
/*     */     //   67: iconst_1
/*     */     //   68: invokevirtual setCanceled : (Z)V
/*     */     //   71: aload_0
/*     */     //   72: iconst_0
/*     */     //   73: invokespecial currentlyPlacing_$eq : (Z)V
/*     */     //   76: return
/*     */     //   77: astore_2
/*     */     //   78: aload_0
/*     */     //   79: iconst_0
/*     */     //   80: invokespecial currentlyPlacing_$eq : (Z)V
/*     */     //   83: aload_2
/*     */     //   84: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #32	-> 0
/*     */     //   #34	-> 8
/*     */     //   #35	-> 13
/*     */     //   #36	-> 18
/*     */     //   #37	-> 58
/*     */     //   #38	-> 66
/*     */     //   #43	-> 71
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	85	0	this	Lli/cil/oc/integration/fmp/EventHandler$;
/*     */     //   0	85	1	event	Lnet/minecraftforge/event/entity/player/PlayerInteractEvent;
/*     */     //   18	67	3	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   8	71	77	finally
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean place(EntityPlayer player) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: aload_1
/*     */     //   7: invokestatic reTrace : (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/util/MovingObjectPosition;
/*     */     //   10: astore_3
/*     */     //   11: aload_3
/*     */     //   12: ifnull -> 22
/*     */     //   15: aload_1
/*     */     //   16: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   19: ifnonnull -> 26
/*     */     //   22: iconst_0
/*     */     //   23: goto -> 262
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   30: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   33: astore #4
/*     */     //   35: aload #4
/*     */     //   37: instanceof net/minecraft/item/ItemBlock
/*     */     //   40: ifeq -> 257
/*     */     //   43: aload #4
/*     */     //   45: checkcast net/minecraft/item/ItemBlock
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield field_150939_a : Lnet/minecraft/block/Block;
/*     */     //   55: astore #7
/*     */     //   57: aload #7
/*     */     //   59: instanceof li/cil/oc/common/block/SimpleBlock
/*     */     //   62: ifeq -> 247
/*     */     //   65: aload #7
/*     */     //   67: checkcast li/cil/oc/common/block/SimpleBlock
/*     */     //   70: astore #8
/*     */     //   72: aload #8
/*     */     //   74: ldc 'cable'
/*     */     //   76: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   79: invokeinterface block : ()Lnet/minecraft/block/Block;
/*     */     //   84: astore #10
/*     */     //   86: dup
/*     */     //   87: ifnonnull -> 99
/*     */     //   90: pop
/*     */     //   91: aload #10
/*     */     //   93: ifnull -> 107
/*     */     //   96: goto -> 129
/*     */     //   99: aload #10
/*     */     //   101: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 129
/*     */     //   107: aload_0
/*     */     //   108: aload_1
/*     */     //   109: aload_3
/*     */     //   110: new li/cil/oc/integration/fmp/CablePart
/*     */     //   113: dup
/*     */     //   114: getstatic li/cil/oc/integration/fmp/CablePart$.MODULE$ : Lli/cil/oc/integration/fmp/CablePart$;
/*     */     //   117: invokevirtual $lessinit$greater$default$1 : ()Lscala/Option;
/*     */     //   120: invokespecial <init> : (Lscala/Option;)V
/*     */     //   123: invokevirtual placeDelegatePart : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/MovingObjectPosition;Lli/cil/oc/integration/fmp/SimpleBlockPart;)Z
/*     */     //   126: goto -> 242
/*     */     //   129: aload #8
/*     */     //   131: ldc 'print'
/*     */     //   133: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   136: invokeinterface block : ()Lnet/minecraft/block/Block;
/*     */     //   141: astore #11
/*     */     //   143: dup
/*     */     //   144: ifnonnull -> 156
/*     */     //   147: pop
/*     */     //   148: aload #11
/*     */     //   150: ifnull -> 164
/*     */     //   153: goto -> 241
/*     */     //   156: aload #11
/*     */     //   158: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   161: ifeq -> 241
/*     */     //   164: new li/cil/oc/integration/fmp/PrintPart
/*     */     //   167: dup
/*     */     //   168: getstatic li/cil/oc/integration/fmp/PrintPart$.MODULE$ : Lli/cil/oc/integration/fmp/PrintPart$;
/*     */     //   171: invokevirtual $lessinit$greater$default$1 : ()Lscala/Option;
/*     */     //   174: invokespecial <init> : (Lscala/Option;)V
/*     */     //   177: astore #12
/*     */     //   179: aload #12
/*     */     //   181: invokevirtual data : ()Lli/cil/oc/common/item/data/PrintData;
/*     */     //   184: aload_1
/*     */     //   185: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   188: invokevirtual load : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   191: aload #12
/*     */     //   193: aload_0
/*     */     //   194: invokespecial yaw2Direction : ()[Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   197: getstatic scala/runtime/RichFloat$.MODULE$ : Lscala/runtime/RichFloat$;
/*     */     //   200: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   203: aload_1
/*     */     //   204: getfield field_70177_z : F
/*     */     //   207: sipush #360
/*     */     //   210: i2f
/*     */     //   211: fdiv
/*     */     //   212: iconst_4
/*     */     //   213: i2f
/*     */     //   214: fmul
/*     */     //   215: invokevirtual floatWrapper : (F)F
/*     */     //   218: invokevirtual round$extension : (F)I
/*     */     //   221: iconst_3
/*     */     //   222: iand
/*     */     //   223: aaload
/*     */     //   224: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   227: invokevirtual facing_$eq : (Lnet/minecraftforge/common/util/ForgeDirection;)V
/*     */     //   230: aload_0
/*     */     //   231: aload_1
/*     */     //   232: aload_3
/*     */     //   233: aload #12
/*     */     //   235: invokevirtual placeDelegatePart : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/MovingObjectPosition;Lli/cil/oc/integration/fmp/SimpleBlockPart;)Z
/*     */     //   238: goto -> 242
/*     */     //   241: iconst_0
/*     */     //   242: istore #9
/*     */     //   244: goto -> 250
/*     */     //   247: iconst_0
/*     */     //   248: istore #9
/*     */     //   250: iload #9
/*     */     //   252: istore #6
/*     */     //   254: goto -> 260
/*     */     //   257: iconst_0
/*     */     //   258: istore #6
/*     */     //   260: iload #6
/*     */     //   262: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 0
/*     */     //   #50	-> 5
/*     */     //   #51	-> 11
/*     */     //   #69	-> 22
/*     */     //   #51	-> 26
/*     */     //   #52	-> 35
/*     */     //   #53	-> 50
/*     */     //   #54	-> 57
/*     */     //   #55	-> 72
/*     */     //   #56	-> 107
/*     */     //   #58	-> 129
/*     */     //   #59	-> 164
/*     */     //   #60	-> 179
/*     */     //   #61	-> 191
/*     */     //   #62	-> 230
/*     */     //   #64	-> 241
/*     */     //   #55	-> 242
/*     */     //   #65	-> 247
/*     */     //   #53	-> 250
/*     */     //   #67	-> 257
/*     */     //   #51	-> 260
/*     */     //   #48	-> 262
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	263	0	this	Lli/cil/oc/integration/fmp/EventHandler$;
/*     */     //   0	263	1	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   5	258	2	world	Lnet/minecraft/world/World;
/*     */     //   11	252	3	hit	Lnet/minecraft/util/MovingObjectPosition;
/*     */     //   179	59	12	part	Lli/cil/oc/integration/fmp/PrintPart;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean placeDelegatePart(EntityPlayer player, MovingObjectPosition hit, SimpleBlockPart part) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   4: astore #4
/*     */     //   6: aload #4
/*     */     //   8: getfield field_72995_K : Z
/*     */     //   11: ifeq -> 195
/*     */     //   14: aload_1
/*     */     //   15: invokevirtual func_70093_af : ()Z
/*     */     //   18: ifne -> 195
/*     */     //   21: new codechicken/lib/vec/Vector3
/*     */     //   24: dup
/*     */     //   25: aload_2
/*     */     //   26: getfield field_72307_f : Lnet/minecraft/util/Vec3;
/*     */     //   29: getfield field_72450_a : D
/*     */     //   32: aload_2
/*     */     //   33: getfield field_72311_b : I
/*     */     //   36: i2d
/*     */     //   37: dsub
/*     */     //   38: aload_2
/*     */     //   39: getfield field_72307_f : Lnet/minecraft/util/Vec3;
/*     */     //   42: getfield field_72448_b : D
/*     */     //   45: aload_2
/*     */     //   46: getfield field_72312_c : I
/*     */     //   49: i2d
/*     */     //   50: dsub
/*     */     //   51: aload_2
/*     */     //   52: getfield field_72307_f : Lnet/minecraft/util/Vec3;
/*     */     //   55: getfield field_72449_c : D
/*     */     //   58: aload_2
/*     */     //   59: getfield field_72309_d : I
/*     */     //   62: i2d
/*     */     //   63: dsub
/*     */     //   64: invokespecial <init> : (DDD)V
/*     */     //   67: astore #5
/*     */     //   69: aload #4
/*     */     //   71: aload_2
/*     */     //   72: getfield field_72311_b : I
/*     */     //   75: aload_2
/*     */     //   76: getfield field_72312_c : I
/*     */     //   79: aload_2
/*     */     //   80: getfield field_72309_d : I
/*     */     //   83: invokevirtual func_147439_a : (III)Lnet/minecraft/block/Block;
/*     */     //   86: astore #6
/*     */     //   88: aload #6
/*     */     //   90: ifnull -> 195
/*     */     //   93: aload #6
/*     */     //   95: aload #4
/*     */     //   97: aload_2
/*     */     //   98: getfield field_72311_b : I
/*     */     //   101: aload_2
/*     */     //   102: getfield field_72312_c : I
/*     */     //   105: aload_2
/*     */     //   106: getfield field_72309_d : I
/*     */     //   109: aload_1
/*     */     //   110: aload_2
/*     */     //   111: getfield field_72310_e : I
/*     */     //   114: aload #5
/*     */     //   116: getfield x : D
/*     */     //   119: d2f
/*     */     //   120: aload #5
/*     */     //   122: getfield y : D
/*     */     //   125: d2f
/*     */     //   126: aload #5
/*     */     //   128: getfield z : D
/*     */     //   131: d2f
/*     */     //   132: invokevirtual func_149727_a : (Lnet/minecraft/world/World;IIILnet/minecraft/entity/player/EntityPlayer;IFFF)Z
/*     */     //   135: ifeq -> 195
/*     */     //   138: aload_1
/*     */     //   139: invokevirtual func_71038_i : ()V
/*     */     //   142: new net/minecraft/network/play/client/C08PacketPlayerBlockPlacement
/*     */     //   145: dup
/*     */     //   146: aload_2
/*     */     //   147: getfield field_72311_b : I
/*     */     //   150: aload_2
/*     */     //   151: getfield field_72312_c : I
/*     */     //   154: aload_2
/*     */     //   155: getfield field_72309_d : I
/*     */     //   158: aload_2
/*     */     //   159: getfield field_72310_e : I
/*     */     //   162: aload_1
/*     */     //   163: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   166: invokevirtual func_70448_g : ()Lnet/minecraft/item/ItemStack;
/*     */     //   169: aload #5
/*     */     //   171: getfield x : D
/*     */     //   174: d2f
/*     */     //   175: aload #5
/*     */     //   177: getfield y : D
/*     */     //   180: d2f
/*     */     //   181: aload #5
/*     */     //   183: getfield z : D
/*     */     //   186: d2f
/*     */     //   187: invokespecial <init> : (IIIILnet/minecraft/item/ItemStack;FFF)V
/*     */     //   190: invokestatic sendToServer : (Lnet/minecraft/network/Packet;)V
/*     */     //   193: iconst_1
/*     */     //   194: ireturn
/*     */     //   195: new codechicken/lib/vec/BlockCoord
/*     */     //   198: dup
/*     */     //   199: aload_2
/*     */     //   200: getfield field_72311_b : I
/*     */     //   203: aload_2
/*     */     //   204: getfield field_72312_c : I
/*     */     //   207: aload_2
/*     */     //   208: getfield field_72309_d : I
/*     */     //   211: invokespecial <init> : (III)V
/*     */     //   214: astore #7
/*     */     //   216: aload #7
/*     */     //   218: invokevirtual copy : ()Lcodechicken/lib/vec/BlockCoord;
/*     */     //   221: aload_2
/*     */     //   222: getfield field_72310_e : I
/*     */     //   225: invokevirtual offset : (I)Lcodechicken/lib/vec/BlockCoord;
/*     */     //   228: astore #8
/*     */     //   230: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   233: getstatic codechicken/multipart/TileMultipart$.MODULE$ : Lcodechicken/multipart/TileMultipart$;
/*     */     //   236: aload #4
/*     */     //   238: aload #7
/*     */     //   240: invokevirtual getOrConvertTile : (Lnet/minecraft/world/World;Lcodechicken/lib/vec/BlockCoord;)Lcodechicken/multipart/TileMultipart;
/*     */     //   243: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   246: astore #9
/*     */     //   248: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   251: getstatic codechicken/multipart/TileMultipart$.MODULE$ : Lcodechicken/multipart/TileMultipart$;
/*     */     //   254: aload #4
/*     */     //   256: aload #8
/*     */     //   258: invokevirtual getOrConvertTile : (Lnet/minecraft/world/World;Lcodechicken/lib/vec/BlockCoord;)Lcodechicken/multipart/TileMultipart;
/*     */     //   261: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   264: astore #10
/*     */     //   266: aload #9
/*     */     //   268: astore #11
/*     */     //   270: aload #11
/*     */     //   272: instanceof scala/Some
/*     */     //   275: ifeq -> 327
/*     */     //   278: aload #11
/*     */     //   280: checkcast scala/Some
/*     */     //   283: astore #12
/*     */     //   285: aload #12
/*     */     //   287: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   290: checkcast codechicken/multipart/TileMultipart
/*     */     //   293: astore #13
/*     */     //   295: aload #13
/*     */     //   297: aload_3
/*     */     //   298: invokevirtual canAddPart : (Lcodechicken/multipart/TMultiPart;)Z
/*     */     //   301: ifeq -> 327
/*     */     //   304: aload_0
/*     */     //   305: aload #13
/*     */     //   307: aload_3
/*     */     //   308: invokevirtual canAddPrint : (Lcodechicken/multipart/TileMultipart;Lli/cil/oc/integration/fmp/SimpleBlockPart;)Z
/*     */     //   311: ifeq -> 327
/*     */     //   314: aload_0
/*     */     //   315: aload_1
/*     */     //   316: aload_3
/*     */     //   317: aload #7
/*     */     //   319: invokevirtual placeMultiPart : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/integration/fmp/SimpleBlockPart;Lcodechicken/lib/vec/BlockCoord;)Z
/*     */     //   322: istore #14
/*     */     //   324: goto -> 395
/*     */     //   327: aload #10
/*     */     //   329: astore #15
/*     */     //   331: aload #15
/*     */     //   333: instanceof scala/Some
/*     */     //   336: ifeq -> 388
/*     */     //   339: aload #15
/*     */     //   341: checkcast scala/Some
/*     */     //   344: astore #16
/*     */     //   346: aload #16
/*     */     //   348: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   351: checkcast codechicken/multipart/TileMultipart
/*     */     //   354: astore #17
/*     */     //   356: aload #17
/*     */     //   358: aload_3
/*     */     //   359: invokevirtual canAddPart : (Lcodechicken/multipart/TMultiPart;)Z
/*     */     //   362: ifeq -> 388
/*     */     //   365: aload_0
/*     */     //   366: aload #17
/*     */     //   368: aload_3
/*     */     //   369: invokevirtual canAddPrint : (Lcodechicken/multipart/TileMultipart;Lli/cil/oc/integration/fmp/SimpleBlockPart;)Z
/*     */     //   372: ifeq -> 388
/*     */     //   375: aload_0
/*     */     //   376: aload_1
/*     */     //   377: aload_3
/*     */     //   378: aload #8
/*     */     //   380: invokevirtual placeMultiPart : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/integration/fmp/SimpleBlockPart;Lcodechicken/lib/vec/BlockCoord;)Z
/*     */     //   383: istore #18
/*     */     //   385: goto -> 391
/*     */     //   388: iconst_0
/*     */     //   389: istore #18
/*     */     //   391: iload #18
/*     */     //   393: istore #14
/*     */     //   395: iload #14
/*     */     //   397: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 0
/*     */     //   #75	-> 6
/*     */     //   #77	-> 21
/*     */     //   #78	-> 69
/*     */     //   #79	-> 88
/*     */     //   #80	-> 138
/*     */     //   #81	-> 142
/*     */     //   #82	-> 146
/*     */     //   #83	-> 162
/*     */     //   #84	-> 169
/*     */     //   #81	-> 187
/*     */     //   #85	-> 193
/*     */     //   #89	-> 195
/*     */     //   #90	-> 216
/*     */     //   #91	-> 230
/*     */     //   #92	-> 248
/*     */     //   #93	-> 266
/*     */     //   #94	-> 270
/*     */     //   #95	-> 327
/*     */     //   #96	-> 331
/*     */     //   #97	-> 388
/*     */     //   #95	-> 391
/*     */     //   #93	-> 395
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	398	0	this	Lli/cil/oc/integration/fmp/EventHandler$;
/*     */     //   0	398	1	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	398	2	hit	Lnet/minecraft/util/MovingObjectPosition;
/*     */     //   0	398	3	part	Lli/cil/oc/integration/fmp/SimpleBlockPart;
/*     */     //   6	391	4	world	Lnet/minecraft/world/World;
/*     */     //   69	329	5	f	Lcodechicken/lib/vec/Vector3;
/*     */     //   88	310	6	block	Lnet/minecraft/block/Block;
/*     */     //   216	181	7	pos	Lcodechicken/lib/vec/BlockCoord;
/*     */     //   230	167	8	posOutside	Lcodechicken/lib/vec/BlockCoord;
/*     */     //   248	149	9	inside	Lscala/Option;
/*     */     //   266	131	10	outside	Lscala/Option;
/*     */     //   295	103	13	t	Lcodechicken/multipart/TileMultipart;
/*     */     //   356	42	17	t	Lcodechicken/multipart/TileMultipart;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class EventHandler$$anonfun$1
/*     */     extends AbstractFunction2<Tuple2<Object, Object>, TMultiPart, Tuple2<Object, Object>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Tuple2<Object, Object> apply(Tuple2 acc, TMultiPart part) {
/*     */       Tuple2 tuple2 = acc;
/*     */       if (tuple2 != null) {
/*     */         Tuple2.mcII.sp sp4;
/*     */         int offAcc = tuple2._1$mcI$sp(), onAcc = tuple2._2$mcI$sp();
/*     */         Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(offAcc, onAcc), sp1 = sp2;
/*     */         int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/*     */         TMultiPart tMultiPart = part;
/*     */         if (tMultiPart instanceof PrintPart) {
/*     */           PrintPart printPart = (PrintPart)tMultiPart;
/*     */           sp4 = new Tuple2.mcII.sp(printPart.data().stateOff().size(), printPart.data().stateOn().size());
/*     */         } else {
/*     */           sp4 = new Tuple2.mcII.sp(0, 0);
/*     */         } 
/*     */         Tuple2.mcII.sp sp3 = sp4;
/*     */         if (sp3 != null) {
/*     */           int offCount = sp3._1$mcI$sp(), onCount = sp3._2$mcI$sp();
/*     */           Tuple2.mcII.sp sp6 = new Tuple2.mcII.sp(offCount, onCount), sp5 = sp6;
/*     */           int k = sp5._1$mcI$sp(), m = sp5._2$mcI$sp();
/*     */           return (Tuple2<Object, Object>)new Tuple2.mcII.sp(i + k, j + m);
/*     */         } 
/*     */         throw new MatchError(sp3);
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canAddPrint(TileMultipart t, SimpleBlockPart p)
/*     */   {
/* 102 */     SimpleBlockPart simpleBlockPart = p;
/* 103 */     if (simpleBlockPart instanceof PrintPart) { PrintPart printPart = (PrintPart)simpleBlockPart;
/* 104 */       Tuple2 tuple2 = (Tuple2)t.partList().foldLeft(new Tuple2.mcII.sp(printPart.data().stateOff().size(), printPart.data().stateOn().size()), (Function2)new EventHandler$$anonfun$1()); if (tuple2 != null) { int offSum = tuple2._1$mcI$sp(), onSum = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(offSum, onSum), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 112 */         boolean bool = (i <= li.cil.oc.Settings$.MODULE$.get().maxPrintComplexity() && j <= li.cil.oc.Settings$.MODULE$.get().maxPrintComplexity()) ? true : false; }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */     
/*     */     return true; } public boolean placeMultiPart(EntityPlayer player, SimpleBlockPart part, BlockCoord pos) {
/* 117 */     World world = player.func_130014_f_();
/*     */     
/* 119 */     player.func_71038_i();
/* 120 */     li.cil.oc.client.PacketSender$.MODULE$.sendMultiPlace();
/*     */ 
/*     */     
/* 123 */     codechicken.multipart.TileMultipart$.MODULE$.addPart(world, pos, part);
/* 124 */     world.func_72908_a(pos.x + 0.5D, pos.y + 0.5D, pos.z + 0.5D, 
/* 125 */         (part.simpleBlock()).field_149762_H.func_150496_b(), (
/* 126 */         (part.simpleBlock()).field_149762_H.func_150497_c() + 1.0F) / 2.0F, 
/* 127 */         (part.simpleBlock()).field_149762_H.func_150494_d() * 0.8F);
/*     */     
/* 129 */     ItemStack held = player.func_70694_bm();
/* 130 */     held.field_77994_a--;
/*     */     
/* 132 */     player.field_71071_by.field_70462_a[player.field_71071_by.field_70461_c] = null;
/* 133 */     world.field_72995_K ? BoxedUnit.UNIT : (player.field_71075_bZ.field_75098_d ? BoxedUnit.UNIT : ((held.field_77994_a == 0) ? BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new PlayerDestroyItemEvent(player, held))) : BoxedUnit.UNIT));
/*     */ 
/*     */ 
/*     */     
/* 137 */     return true;
/*     */   } private EventHandler$() {
/* 139 */     MODULE$ = this;
/*     */     this.currentlyPlacing = false;
/*     */     (new ForgeDirection[4])[0] = ForgeDirection.SOUTH;
/*     */     (new ForgeDirection[4])[1] = ForgeDirection.WEST;
/*     */     (new ForgeDirection[4])[2] = ForgeDirection.NORTH;
/*     */     (new ForgeDirection[4])[3] = ForgeDirection.EAST;
/*     */     this.yaw2Direction = new ForgeDirection[4];
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\EventHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */