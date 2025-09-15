/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import li.cil.oc.common.block.traits.CustomDrops;
/*     */ import li.cil.oc.common.block.traits.PowerAcceptor;
/*     */ import li.cil.oc.common.block.traits.StateAware;
/*     */ import li.cil.oc.common.item.data.MicrocontrollerData;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005ee\001B\001\003\0015\021q\"T5de>\034wN\034;s_2dWM\035\006\003\007\021\tQA\0317pG.T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\006\0019\021\002d\007\t\003\037Ai\021AA\005\003#\t\021QBU3egR|g.Z!xCJ,\007CA\n\027\033\005!\"BA\013\003\003\031!(/Y5ug&\021q\003\006\002\016!><XM]!dG\026\004Ho\034:\021\005MI\022B\001\016\025\005)\031F/\031;f\003^\f'/\032\t\004'qq\022BA\017\025\005-\031Uo\035;p[\022\023x\016]:\021\005}\021S\"\001\021\013\005\005\"\021A\003;jY\026,g\016^5us&\021\021\001\t\005\tI\001\021)\031!C\nK\0059A/\0337f)\006<W#\001\024\021\007\035bc$D\001)\025\tI#&A\004sK\032dWm\031;\013\003-\nQa]2bY\006L!!\f\025\003\021\rc\027m]:UC\036D\001b\f\001\003\002\003\006IAJ\001\ti&dW\rV1hA!)\021\007\001C\001e\0051A(\0338jiz\"\022a\r\013\003iU\002\"a\004\001\t\013\021\002\0049\001\024\t\013]\002A\021\013\035\002\035\r,8\017^8n)\026DH/\036:fgV\t\021\bE\002;wuj\021AK\005\003y)\022Q!\021:sCf\0042A\017 A\023\ty$F\001\004PaRLwN\034\t\003\003\022s!A\017\"\n\005\rS\023A\002)sK\022,g-\003\002F\r\n11\013\036:j]\036T!a\021\026\t\013!\003A\021I%\002\031\035,G\017U5dW\ncwnY6\025\r)#Fl\0315k!\tY%+D\001M\025\tie*\001\003ji\026l'BA(Q\003%i\027N\\3de\0064GOC\001R\003\rqW\r^\005\003'2\023\021\"\023;f[N#\030mY6\t\013U;\005\031\001,\002\rQ\f'oZ3u!\t9&,D\001Y\025\tIf*\001\003vi&d\027BA.Y\005QiuN^5oO>\023'.Z2u!>\034\030\016^5p]\")Ql\022a\001=\006)qo\034:mIB\021q,Y\007\002A*\021QLT\005\003E\002\024QaV8sY\022DQ\001Z$A\002\025\f\021\001\037\t\003u\031L!a\032\026\003\007%sG\017C\003j\017\002\007Q-A\001z\021\025Yw\t1\001f\003\005Q\b\"B7\001\t#r\027a\003;p_2$\030\016\035+bS2$ra\034:um~\f\t\002\005\002;a&\021\021O\013\002\005+:LG\017C\003tY\002\007Q-\001\005nKR\fG-\031;b\021\025)H\0161\001K\003\025\031H/Y2l\021\0259H\0161\001y\003\031\001H.Y=feB\021\0210`\007\002u*\021qo\037\006\003y:\013a!\0328uSRL\030B\001@{\0051)e\016^5usBc\027-_3s\021\035\t\t\001\034a\001\003\007\tq\001^8pYRL\007\017E\003\002\006\0055\001)\004\002\002\b)\031\021,!\003\013\005\005-\021\001\0026bm\006LA!a\004\002\b\t!A*[:u\021\035\t\031\002\034a\001\003+\t\001\"\0313wC:\034W\r\032\t\004u\005]\021bAA\rU\t9!i\\8mK\006t\007bBA\017\001\021\005\023qD\001\007e\006\024\030\016^=\025\t\005\005\022q\005\t\004\027\006\r\022bAA\023\031\nQQI\\;n%\006\024\030\016^=\t\rU\fY\0021\001K\021\035\tY\003\001C!\003[\t\001#\0328fe\036LH\013\033:pk\036D\007/\036;\026\005\005=\002c\001\036\0022%\031\0211\007\026\003\r\021{WO\0317f\021\035\t9\004\001C!\003s\t\001c\031:fCR,G+\0337f\013:$\030\016^=\025\013y\tY$!\020\t\ru\013)\0041\001_\021\031\031\030Q\007a\001K\"9\021\021\t\001\005B\005\r\023\001E8o\0052|7m[!di&4\030\r^3e)Q\t)\"!\022\002H\005%\0231JA'\003\037\n\031'!\034\002r!1Q,a\020A\002yCa\001ZA \001\004)\007BB5\002@\001\007Q\r\003\004l\003\001\r!\032\005\007o\006}\002\031\001=\t\021\005E\023q\ba\001\003'\nAa]5eKB!\021QKA0\033\t\t9FC\002Z\0033R1!BA.\025\r\ti\006U\001\017[&tWm\031:bMR4wN]4f\023\021\t\t'a\026\003\035\031{'oZ3ESJ,7\r^5p]\"A\021QMA \001\004\t9'\001\003iSRD\006c\001\036\002j%\031\0211\016\026\003\013\031cw.\031;\t\021\005=\024q\ba\001\003O\nA\001[5u3\"A\0211OA \001\004\t9'\001\003iSRT\006bBA<\001\021E\023\021P\001\rI>\034Uo\035;p[&s\027\016\036\013\b_\006m\024qPAE\021\035\ti(!\036A\002y\t!\002^5mK\026sG/\033;z\021\0359\030Q\017a\001\003\003\003B!a!\002\0066\t10C\002\002\bn\024\001#\0228uSRLH*\033<j]\036\024\025m]3\t\rU\f)\b1\001K\021\035\ti\t\001C)\003\037\013Q\002Z8DkN$x.\034#s_B\034HcB8\002\022\006M\025Q\023\005\b\003{\nY\t1\001\037\021\0319\0301\022a\001q\"A\021qSAF\001\004\t)\"A\006xS2d\007*\031:wKN$\b")
/*     */ public class Microcontroller extends RedstoneAware implements PowerAcceptor, StateAware, CustomDrops<Microcontroller> {
/*  26 */   public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) { return CustomDrops.class.getDrops(this, world, x, y, z, metadata, fortune); } private final ClassTag<Microcontroller> tileTag; public void func_149725_f(World world, int x, int y, int z, int metadata) { CustomDrops.class.onBlockPreDestroy(this, world, x, y, z, metadata); } public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) { return CustomDrops.class.removedByPlayer(this, world, player, x, y, z, willHarvest); } public void func_149689_a(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) { CustomDrops.class.onBlockPlacedBy(this, world, x, y, z, player, stack); } public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public ClassTag<Microcontroller> tileTag() { return this.tileTag; } public Microcontroller(ClassTag<Microcontroller> tileTag) { PowerAcceptor.class.$init$(this); StateAware.class.$init$(this); CustomDrops.class.$init$(this);
/*  27 */     func_149647_a(null);
/*  28 */     NEI$.MODULE$.hide(this); }
/*     */    public Option<String>[] customTextures() {
/*  30 */     (new Option[6])[0] = 
/*  31 */       (Option)new Some("MicrocontrollerTop");
/*  32 */     (new Option[6])[1] = (Option)new Some("MicrocontrollerTop");
/*  33 */     (new Option[6])[2] = (Option)new Some("MicrocontrollerSide");
/*  34 */     (new Option[6])[3] = (Option)new Some("MicrocontrollerFront");
/*  35 */     (new Option[6])[4] = (Option)new Some("MicrocontrollerSide");
/*  36 */     (new Option[6])[5] = (Option)new Some("MicrocontrollerSide");
/*     */     return (Option<String>[])new Option[6];
/*     */   }
/*     */   
/*     */   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
/*     */     ItemStack itemStack;
/*  42 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  43 */     if (tileEntity instanceof Microcontroller) { Microcontroller microcontroller = (Microcontroller)tileEntity; itemStack = microcontroller.info().copyItemStack(); }
/*  44 */     else { itemStack = null; }
/*     */     
/*     */     return itemStack;
/*     */   }
/*     */   
/*     */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/*  50 */     PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced);
/*  51 */     if (KeyBindings$.MODULE$.showExtendedTooltips())
/*  52 */     { MicrocontrollerData info = new MicrocontrollerData(stack);
/*  53 */       Predef$.MODULE$.refArrayOps((Object[])info.components()).withFilter((Function1)new Microcontroller$$anonfun$tooltipTail$1(this)).foreach((Function1)new Microcontroller$$anonfun$tooltipTail$2(this, tooltip)); }  } public final class Microcontroller$$anonfun$tooltipTail$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack component) { return !(component == null); } public Microcontroller$$anonfun$tooltipTail$1(Microcontroller $outer) {} } public final class Microcontroller$$anonfun$tooltipTail$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public Microcontroller$$anonfun$tooltipTail$2(Microcontroller $outer, List tooltip$1) {} public final boolean apply(ItemStack component) {
/*  54 */       return this.tooltip$1.add((new StringBuilder()).append("- ").append(component.func_82833_r()).toString());
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumRarity rarity(ItemStack stack) {
/*  60 */     MicrocontrollerData data = new MicrocontrollerData(stack);
/*  61 */     return Rarity$.MODULE$.byTier(data.tier());
/*     */   }
/*     */ 
/*     */   
/*     */   public double energyThroughput() {
/*  66 */     return Settings$.MODULE$.get().caseRate()[0];
/*     */   } public Microcontroller createTileEntity(World world, int metadata) {
/*  68 */     return new Microcontroller();
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
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/integration/util/Wrench$.MODULE$ : Lli/cil/oc/integration/util/Wrench$;
/*     */     //   3: aload #5
/*     */     //   5: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   8: iload_2
/*     */     //   9: iload_3
/*     */     //   10: iload #4
/*     */     //   12: invokevirtual apply : (III)Lli/cil/oc/util/BlockPosition;
/*     */     //   15: invokevirtual holdsApplicableWrench : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/util/BlockPosition;)Z
/*     */     //   18: ifeq -> 25
/*     */     //   21: iconst_0
/*     */     //   22: goto -> 301
/*     */     //   25: aload #5
/*     */     //   27: invokevirtual func_70093_af : ()Z
/*     */     //   30: ifeq -> 207
/*     */     //   33: aload #5
/*     */     //   35: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   38: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   41: ldc_w 'eeprom'
/*     */     //   44: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   47: astore #13
/*     */     //   49: dup
/*     */     //   50: ifnonnull -> 62
/*     */     //   53: pop
/*     */     //   54: aload #13
/*     */     //   56: ifnull -> 70
/*     */     //   59: goto -> 203
/*     */     //   62: aload #13
/*     */     //   64: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   67: ifeq -> 203
/*     */     //   70: aload_1
/*     */     //   71: getfield field_72995_K : Z
/*     */     //   74: ifne -> 189
/*     */     //   77: aload_1
/*     */     //   78: iload_2
/*     */     //   79: iload_3
/*     */     //   80: iload #4
/*     */     //   82: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   85: astore #14
/*     */     //   87: aload #14
/*     */     //   89: instanceof li/cil/oc/common/tileentity/Microcontroller
/*     */     //   92: ifeq -> 193
/*     */     //   95: aload #14
/*     */     //   97: checkcast li/cil/oc/common/tileentity/Microcontroller
/*     */     //   100: astore #15
/*     */     //   102: aload #5
/*     */     //   104: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   107: aload #5
/*     */     //   109: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   112: getfield field_70461_c : I
/*     */     //   115: iconst_1
/*     */     //   116: invokevirtual func_70298_a : (II)Lnet/minecraft/item/ItemStack;
/*     */     //   119: astore #17
/*     */     //   121: aload #15
/*     */     //   123: aload #17
/*     */     //   125: invokevirtual changeEEPROM : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   128: astore #18
/*     */     //   130: aload #18
/*     */     //   132: instanceof scala/Some
/*     */     //   135: ifeq -> 179
/*     */     //   138: aload #18
/*     */     //   140: checkcast scala/Some
/*     */     //   143: astore #19
/*     */     //   145: aload #19
/*     */     //   147: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   150: checkcast net/minecraft/item/ItemStack
/*     */     //   153: astore #20
/*     */     //   155: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   158: aload #20
/*     */     //   160: aload #5
/*     */     //   162: getstatic li/cil/oc/util/InventoryUtils$.MODULE$ : Lli/cil/oc/util/InventoryUtils$;
/*     */     //   165: invokevirtual addToPlayerInventory$default$3 : ()Z
/*     */     //   168: invokevirtual addToPlayerInventory : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Z)V
/*     */     //   171: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   174: astore #21
/*     */     //   176: goto -> 184
/*     */     //   179: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   182: astore #21
/*     */     //   184: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   187: astore #16
/*     */     //   189: iconst_1
/*     */     //   190: goto -> 301
/*     */     //   193: new scala/MatchError
/*     */     //   196: dup
/*     */     //   197: aload #14
/*     */     //   199: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   202: athrow
/*     */     //   203: iconst_0
/*     */     //   204: goto -> 301
/*     */     //   207: aload_1
/*     */     //   208: getfield field_72995_K : Z
/*     */     //   211: ifeq -> 220
/*     */     //   214: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   217: goto -> 299
/*     */     //   220: aload_1
/*     */     //   221: iload_2
/*     */     //   222: iload_3
/*     */     //   223: iload #4
/*     */     //   225: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   228: astore #10
/*     */     //   230: aload #10
/*     */     //   232: instanceof li/cil/oc/common/tileentity/Microcontroller
/*     */     //   235: ifeq -> 292
/*     */     //   238: aload #10
/*     */     //   240: checkcast li/cil/oc/common/tileentity/Microcontroller
/*     */     //   243: astore #11
/*     */     //   245: aload #11
/*     */     //   247: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   250: invokeinterface isRunning : ()Z
/*     */     //   255: ifeq -> 274
/*     */     //   258: aload #11
/*     */     //   260: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   263: invokeinterface stop : ()Z
/*     */     //   268: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   271: goto -> 287
/*     */     //   274: aload #11
/*     */     //   276: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   279: invokeinterface start : ()Z
/*     */     //   284: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   287: astore #12
/*     */     //   289: goto -> 297
/*     */     //   292: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   295: astore #12
/*     */     //   297: aload #12
/*     */     //   299: pop
/*     */     //   300: iconst_1
/*     */     //   301: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 0
/*     */     //   #101	-> 21
/*     */     //   #75	-> 25
/*     */     //   #86	-> 33
/*     */     //   #87	-> 70
/*     */     //   #88	-> 77
/*     */     //   #89	-> 87
/*     */     //   #90	-> 102
/*     */     //   #91	-> 121
/*     */     //   #92	-> 130
/*     */     //   #93	-> 179
/*     */     //   #91	-> 184
/*     */     //   #89	-> 187
/*     */     //   #97	-> 189
/*     */     //   #88	-> 193
/*     */     //   #99	-> 203
/*     */     //   #76	-> 207
/*     */     //   #77	-> 220
/*     */     //   #78	-> 230
/*     */     //   #79	-> 245
/*     */     //   #80	-> 274
/*     */     //   #79	-> 287
/*     */     //   #81	-> 292
/*     */     //   #77	-> 297
/*     */     //   #76	-> 299
/*     */     //   #84	-> 300
/*     */     //   #74	-> 301
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	302	0	this	Lli/cil/oc/common/block/Microcontroller;
/*     */     //   0	302	1	world	Lnet/minecraft/world/World;
/*     */     //   0	302	2	x	I
/*     */     //   0	302	3	y	I
/*     */     //   0	302	4	z	I
/*     */     //   0	302	5	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	302	6	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   0	302	7	hitX	F
/*     */     //   0	302	8	hitY	F
/*     */     //   0	302	9	hitZ	F
/*     */     //   121	66	17	newEeprom	Lnet/minecraft/item/ItemStack;
/*     */     //   155	147	20	oldEeprom	Lnet/minecraft/item/ItemStack;
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
/*     */   public void doCustomInit(Microcontroller tileEntity, EntityLivingBase player, ItemStack stack) {
/* 105 */     CustomDrops.class.doCustomInit(this, (TileEntity)tileEntity, player, stack);
/* 106 */     if (!(tileEntity.world()).field_72995_K) {
/* 107 */       tileEntity.info().load(stack);
/* 108 */       tileEntity.snooperNode().changeBuffer(tileEntity.info().storedEnergy() - tileEntity.snooperNode().localBuffer());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void doCustomDrops(Microcontroller tileEntity, EntityPlayer player, boolean willHarvest) {
/* 113 */     CustomDrops.class.doCustomDrops(this, (TileEntity)tileEntity, player, willHarvest);
/* 114 */     tileEntity.saveComponents();
/* 115 */     tileEntity.info().storedEnergy_$eq((int)tileEntity.snooperNode().localBuffer());
/* 116 */     func_149642_a(tileEntity.world(), tileEntity.x(), tileEntity.y(), tileEntity.z(), tileEntity.info().createItemStack());
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Microcontroller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */