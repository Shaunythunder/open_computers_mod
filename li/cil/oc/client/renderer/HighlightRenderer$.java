/*     */ package li.cil.oc.client.renderer;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import li.cil.oc.common.tileentity.Print;
/*     */ import net.minecraft.client.renderer.RenderGlobal;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraftforge.client.event.DrawBlockHighlightEvent;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.util.Random;
/*     */ 
/*     */ 
/*     */ public final class HighlightRenderer$
/*     */ {
/*     */   public static final HighlightRenderer$ MODULE$;
/*     */   private final Random random;
/*     */   private ItemInfo tablet;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*     */   private Random random() {
/*  26 */     return this.random;
/*     */   }
/*  28 */   private ItemInfo tablet$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.tablet = Items.get("tablet"); this.bitmap$0 = true; }  return this.tablet; }  } public ItemInfo tablet() { return this.bitmap$0 ? this.tablet : tablet$lzycompute(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onDrawBlockHighlight(DrawBlockHighlightEvent e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield target : Lnet/minecraft/util/MovingObjectPosition;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: getfield field_72313_a : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */     //   9: getstatic net/minecraft/util/MovingObjectPosition$MovingObjectType.BLOCK : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */     //   12: astore_3
/*     */     //   13: dup
/*     */     //   14: ifnonnull -> 25
/*     */     //   17: pop
/*     */     //   18: aload_3
/*     */     //   19: ifnull -> 32
/*     */     //   22: goto -> 1733
/*     */     //   25: aload_3
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 1733
/*     */     //   32: aload_1
/*     */     //   33: getfield currentItem : Lnet/minecraft/item/ItemStack;
/*     */     //   36: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   39: aload_0
/*     */     //   40: invokevirtual tablet : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   43: astore #4
/*     */     //   45: dup
/*     */     //   46: ifnonnull -> 58
/*     */     //   49: pop
/*     */     //   50: aload #4
/*     */     //   52: ifnull -> 66
/*     */     //   55: goto -> 1733
/*     */     //   58: aload #4
/*     */     //   60: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 1733
/*     */     //   66: aload_1
/*     */     //   67: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   70: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   73: astore #5
/*     */     //   75: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   78: aload_2
/*     */     //   79: getfield field_72311_b : I
/*     */     //   82: aload_2
/*     */     //   83: getfield field_72312_c : I
/*     */     //   86: aload_2
/*     */     //   87: getfield field_72309_d : I
/*     */     //   90: aload #5
/*     */     //   92: invokevirtual apply : (IIILnet/minecraft/world/World;)Lli/cil/oc/util/BlockPosition;
/*     */     //   95: astore #6
/*     */     //   97: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   100: aload #5
/*     */     //   102: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   105: aload #6
/*     */     //   107: invokevirtual isAirBlock : (Lli/cil/oc/util/BlockPosition;)Z
/*     */     //   110: istore #7
/*     */     //   112: iload #7
/*     */     //   114: ifne -> 1733
/*     */     //   117: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   120: aload #5
/*     */     //   122: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   125: aload #6
/*     */     //   127: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */     //   130: astore #8
/*     */     //   132: getstatic li/cil/oc/util/ExtendedBlock$.MODULE$ : Lli/cil/oc/util/ExtendedBlock$;
/*     */     //   135: aload #8
/*     */     //   137: invokevirtual extendedBlock : (Lnet/minecraft/block/Block;)Lli/cil/oc/util/ExtendedBlock$ExtendedBlock;
/*     */     //   140: aload #6
/*     */     //   142: invokevirtual setBlockBoundsBasedOnState : (Lli/cil/oc/util/BlockPosition;)V
/*     */     //   145: getstatic li/cil/oc/util/ExtendedBlock$.MODULE$ : Lli/cil/oc/util/ExtendedBlock$;
/*     */     //   148: aload #8
/*     */     //   150: invokevirtual extendedBlock : (Lnet/minecraft/block/Block;)Lli/cil/oc/util/ExtendedBlock$ExtendedBlock;
/*     */     //   153: aload #6
/*     */     //   155: invokevirtual getSelectedBoundingBoxFromPool : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   158: aload #6
/*     */     //   160: invokevirtual x : ()I
/*     */     //   163: ineg
/*     */     //   164: i2d
/*     */     //   165: aload #6
/*     */     //   167: invokevirtual y : ()I
/*     */     //   170: ineg
/*     */     //   171: i2d
/*     */     //   172: aload #6
/*     */     //   174: invokevirtual z : ()I
/*     */     //   177: ineg
/*     */     //   178: i2d
/*     */     //   179: invokevirtual func_72325_c : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   182: astore #9
/*     */     //   184: aload_2
/*     */     //   185: getfield field_72310_e : I
/*     */     //   188: invokestatic getOrientation : (I)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   191: astore #10
/*     */     //   193: aload_1
/*     */     //   194: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   197: aload_1
/*     */     //   198: getfield partialTicks : F
/*     */     //   201: invokevirtual func_70666_h : (F)Lnet/minecraft/util/Vec3;
/*     */     //   204: astore #11
/*     */     //   206: aload #6
/*     */     //   208: aload #11
/*     */     //   210: getfield field_72450_a : D
/*     */     //   213: dneg
/*     */     //   214: aload #11
/*     */     //   216: getfield field_72448_b : D
/*     */     //   219: dneg
/*     */     //   220: aload #11
/*     */     //   222: getfield field_72449_c : D
/*     */     //   225: dneg
/*     */     //   226: invokevirtual offset : (DDD)Lnet/minecraft/util/Vec3;
/*     */     //   229: astore #12
/*     */     //   231: invokestatic glPushMatrix : ()V
/*     */     //   234: ldc 1048575
/*     */     //   236: invokestatic glPushAttrib : (I)V
/*     */     //   239: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   242: invokevirtual makeItBlend : ()V
/*     */     //   245: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   248: getfield field_71446_o : Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   251: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   254: invokevirtual blockHologram : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   257: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   260: sipush #770
/*     */     //   263: iconst_1
/*     */     //   264: iconst_1
/*     */     //   265: iconst_0
/*     */     //   266: invokestatic func_148821_a : (IIII)V
/*     */     //   269: fconst_0
/*     */     //   270: fconst_1
/*     */     //   271: fconst_0
/*     */     //   272: ldc_w 0.4
/*     */     //   275: invokestatic glColor4f : (FFFF)V
/*     */     //   278: aload #12
/*     */     //   280: getfield field_72450_a : D
/*     */     //   283: aload #12
/*     */     //   285: getfield field_72448_b : D
/*     */     //   288: aload #12
/*     */     //   290: getfield field_72449_c : D
/*     */     //   293: invokestatic glTranslated : (DDD)V
/*     */     //   296: ldc2_w 1.002
/*     */     //   299: ldc2_w 1.002
/*     */     //   302: ldc2_w 1.002
/*     */     //   305: invokestatic glScaled : (DDD)V
/*     */     //   308: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   311: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   314: invokevirtual hologramFlickerFrequency : ()D
/*     */     //   317: iconst_0
/*     */     //   318: i2d
/*     */     //   319: dcmpl
/*     */     //   320: ifle -> 599
/*     */     //   323: aload_0
/*     */     //   324: invokespecial random : ()Lscala/util/Random;
/*     */     //   327: invokevirtual nextDouble : ()D
/*     */     //   330: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   333: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   336: invokevirtual hologramFlickerFrequency : ()D
/*     */     //   339: dcmpg
/*     */     //   340: ifge -> 599
/*     */     //   343: new scala/Tuple3
/*     */     //   346: dup
/*     */     //   347: iconst_1
/*     */     //   348: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   351: aload #10
/*     */     //   353: getfield offsetX : I
/*     */     //   356: invokevirtual abs : (I)I
/*     */     //   359: isub
/*     */     //   360: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   363: iconst_1
/*     */     //   364: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   367: aload #10
/*     */     //   369: getfield offsetY : I
/*     */     //   372: invokevirtual abs : (I)I
/*     */     //   375: isub
/*     */     //   376: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   379: iconst_1
/*     */     //   380: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   383: aload #10
/*     */     //   385: getfield offsetZ : I
/*     */     //   388: invokevirtual abs : (I)I
/*     */     //   391: isub
/*     */     //   392: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   395: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   398: astore #14
/*     */     //   400: aload #14
/*     */     //   402: ifnull -> 589
/*     */     //   405: aload #14
/*     */     //   407: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   410: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   413: istore #15
/*     */     //   415: aload #14
/*     */     //   417: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   420: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   423: istore #16
/*     */     //   425: aload #14
/*     */     //   427: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   430: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   433: istore #17
/*     */     //   435: new scala/Tuple3
/*     */     //   438: dup
/*     */     //   439: iload #15
/*     */     //   441: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   444: iload #16
/*     */     //   446: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   449: iload #17
/*     */     //   451: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   454: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   457: astore #18
/*     */     //   459: aload #18
/*     */     //   461: astore #13
/*     */     //   463: aload #13
/*     */     //   465: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   468: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   471: istore #19
/*     */     //   473: aload #13
/*     */     //   475: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   478: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   481: istore #20
/*     */     //   483: aload #13
/*     */     //   485: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   488: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   491: istore #21
/*     */     //   493: iconst_1
/*     */     //   494: i2d
/*     */     //   495: aload_0
/*     */     //   496: invokespecial random : ()Lscala/util/Random;
/*     */     //   499: invokevirtual nextGaussian : ()D
/*     */     //   502: ldc2_w 0.01
/*     */     //   505: dmul
/*     */     //   506: dadd
/*     */     //   507: iconst_1
/*     */     //   508: i2d
/*     */     //   509: aload_0
/*     */     //   510: invokespecial random : ()Lscala/util/Random;
/*     */     //   513: invokevirtual nextGaussian : ()D
/*     */     //   516: ldc2_w 0.001
/*     */     //   519: dmul
/*     */     //   520: dadd
/*     */     //   521: iconst_1
/*     */     //   522: i2d
/*     */     //   523: aload_0
/*     */     //   524: invokespecial random : ()Lscala/util/Random;
/*     */     //   527: invokevirtual nextGaussian : ()D
/*     */     //   530: ldc2_w 0.01
/*     */     //   533: dmul
/*     */     //   534: dadd
/*     */     //   535: invokestatic glScaled : (DDD)V
/*     */     //   538: aload_0
/*     */     //   539: invokespecial random : ()Lscala/util/Random;
/*     */     //   542: invokevirtual nextGaussian : ()D
/*     */     //   545: ldc2_w 0.01
/*     */     //   548: dmul
/*     */     //   549: iload #19
/*     */     //   551: i2d
/*     */     //   552: dmul
/*     */     //   553: aload_0
/*     */     //   554: invokespecial random : ()Lscala/util/Random;
/*     */     //   557: invokevirtual nextGaussian : ()D
/*     */     //   560: ldc2_w 0.01
/*     */     //   563: dmul
/*     */     //   564: iload #20
/*     */     //   566: i2d
/*     */     //   567: dmul
/*     */     //   568: aload_0
/*     */     //   569: invokespecial random : ()Lscala/util/Random;
/*     */     //   572: invokevirtual nextGaussian : ()D
/*     */     //   575: ldc2_w 0.01
/*     */     //   578: dmul
/*     */     //   579: iload #21
/*     */     //   581: i2d
/*     */     //   582: dmul
/*     */     //   583: invokestatic glTranslated : (DDD)V
/*     */     //   586: goto -> 599
/*     */     //   589: new scala/MatchError
/*     */     //   592: dup
/*     */     //   593: aload #14
/*     */     //   595: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   598: athrow
/*     */     //   599: getstatic net/minecraft/client/renderer/Tessellator.field_78398_a : Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   602: astore #22
/*     */     //   604: aload #22
/*     */     //   606: invokevirtual func_78382_b : ()V
/*     */     //   609: aload #10
/*     */     //   611: astore #23
/*     */     //   613: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   616: aload #23
/*     */     //   618: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   621: ifeq -> 800
/*     */     //   624: aload #22
/*     */     //   626: aload #9
/*     */     //   628: getfield field_72336_d : D
/*     */     //   631: aload #9
/*     */     //   633: getfield field_72337_e : D
/*     */     //   636: ldc2_w 0.002
/*     */     //   639: dadd
/*     */     //   640: aload #9
/*     */     //   642: getfield field_72334_f : D
/*     */     //   645: aload #9
/*     */     //   647: getfield field_72334_f : D
/*     */     //   650: bipush #16
/*     */     //   652: i2d
/*     */     //   653: dmul
/*     */     //   654: aload #9
/*     */     //   656: getfield field_72336_d : D
/*     */     //   659: bipush #16
/*     */     //   661: i2d
/*     */     //   662: dmul
/*     */     //   663: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   666: aload #22
/*     */     //   668: aload #9
/*     */     //   670: getfield field_72336_d : D
/*     */     //   673: aload #9
/*     */     //   675: getfield field_72337_e : D
/*     */     //   678: ldc2_w 0.002
/*     */     //   681: dadd
/*     */     //   682: aload #9
/*     */     //   684: getfield field_72339_c : D
/*     */     //   687: aload #9
/*     */     //   689: getfield field_72339_c : D
/*     */     //   692: bipush #16
/*     */     //   694: i2d
/*     */     //   695: dmul
/*     */     //   696: aload #9
/*     */     //   698: getfield field_72336_d : D
/*     */     //   701: bipush #16
/*     */     //   703: i2d
/*     */     //   704: dmul
/*     */     //   705: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   708: aload #22
/*     */     //   710: aload #9
/*     */     //   712: getfield field_72340_a : D
/*     */     //   715: aload #9
/*     */     //   717: getfield field_72337_e : D
/*     */     //   720: ldc2_w 0.002
/*     */     //   723: dadd
/*     */     //   724: aload #9
/*     */     //   726: getfield field_72339_c : D
/*     */     //   729: aload #9
/*     */     //   731: getfield field_72339_c : D
/*     */     //   734: bipush #16
/*     */     //   736: i2d
/*     */     //   737: dmul
/*     */     //   738: aload #9
/*     */     //   740: getfield field_72340_a : D
/*     */     //   743: bipush #16
/*     */     //   745: i2d
/*     */     //   746: dmul
/*     */     //   747: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   750: aload #22
/*     */     //   752: aload #9
/*     */     //   754: getfield field_72340_a : D
/*     */     //   757: aload #9
/*     */     //   759: getfield field_72337_e : D
/*     */     //   762: ldc2_w 0.002
/*     */     //   765: dadd
/*     */     //   766: aload #9
/*     */     //   768: getfield field_72334_f : D
/*     */     //   771: aload #9
/*     */     //   773: getfield field_72334_f : D
/*     */     //   776: bipush #16
/*     */     //   778: i2d
/*     */     //   779: dmul
/*     */     //   780: aload #9
/*     */     //   782: getfield field_72340_a : D
/*     */     //   785: bipush #16
/*     */     //   787: i2d
/*     */     //   788: dmul
/*     */     //   789: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   792: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   795: astore #24
/*     */     //   797: goto -> 1721
/*     */     //   800: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   803: aload #23
/*     */     //   805: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   808: ifeq -> 987
/*     */     //   811: aload #22
/*     */     //   813: aload #9
/*     */     //   815: getfield field_72336_d : D
/*     */     //   818: aload #9
/*     */     //   820: getfield field_72338_b : D
/*     */     //   823: ldc2_w 0.002
/*     */     //   826: dsub
/*     */     //   827: aload #9
/*     */     //   829: getfield field_72339_c : D
/*     */     //   832: aload #9
/*     */     //   834: getfield field_72339_c : D
/*     */     //   837: bipush #16
/*     */     //   839: i2d
/*     */     //   840: dmul
/*     */     //   841: aload #9
/*     */     //   843: getfield field_72336_d : D
/*     */     //   846: bipush #16
/*     */     //   848: i2d
/*     */     //   849: dmul
/*     */     //   850: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   853: aload #22
/*     */     //   855: aload #9
/*     */     //   857: getfield field_72336_d : D
/*     */     //   860: aload #9
/*     */     //   862: getfield field_72338_b : D
/*     */     //   865: ldc2_w 0.002
/*     */     //   868: dsub
/*     */     //   869: aload #9
/*     */     //   871: getfield field_72334_f : D
/*     */     //   874: aload #9
/*     */     //   876: getfield field_72334_f : D
/*     */     //   879: bipush #16
/*     */     //   881: i2d
/*     */     //   882: dmul
/*     */     //   883: aload #9
/*     */     //   885: getfield field_72336_d : D
/*     */     //   888: bipush #16
/*     */     //   890: i2d
/*     */     //   891: dmul
/*     */     //   892: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   895: aload #22
/*     */     //   897: aload #9
/*     */     //   899: getfield field_72340_a : D
/*     */     //   902: aload #9
/*     */     //   904: getfield field_72338_b : D
/*     */     //   907: ldc2_w 0.002
/*     */     //   910: dsub
/*     */     //   911: aload #9
/*     */     //   913: getfield field_72334_f : D
/*     */     //   916: aload #9
/*     */     //   918: getfield field_72334_f : D
/*     */     //   921: bipush #16
/*     */     //   923: i2d
/*     */     //   924: dmul
/*     */     //   925: aload #9
/*     */     //   927: getfield field_72340_a : D
/*     */     //   930: bipush #16
/*     */     //   932: i2d
/*     */     //   933: dmul
/*     */     //   934: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   937: aload #22
/*     */     //   939: aload #9
/*     */     //   941: getfield field_72340_a : D
/*     */     //   944: aload #9
/*     */     //   946: getfield field_72338_b : D
/*     */     //   949: ldc2_w 0.002
/*     */     //   952: dsub
/*     */     //   953: aload #9
/*     */     //   955: getfield field_72339_c : D
/*     */     //   958: aload #9
/*     */     //   960: getfield field_72339_c : D
/*     */     //   963: bipush #16
/*     */     //   965: i2d
/*     */     //   966: dmul
/*     */     //   967: aload #9
/*     */     //   969: getfield field_72340_a : D
/*     */     //   972: bipush #16
/*     */     //   974: i2d
/*     */     //   975: dmul
/*     */     //   976: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   979: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   982: astore #24
/*     */     //   984: goto -> 1721
/*     */     //   987: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   990: aload #23
/*     */     //   992: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   995: ifeq -> 1174
/*     */     //   998: aload #22
/*     */     //   1000: aload #9
/*     */     //   1002: getfield field_72336_d : D
/*     */     //   1005: ldc2_w 0.002
/*     */     //   1008: dadd
/*     */     //   1009: aload #9
/*     */     //   1011: getfield field_72337_e : D
/*     */     //   1014: aload #9
/*     */     //   1016: getfield field_72339_c : D
/*     */     //   1019: aload #9
/*     */     //   1021: getfield field_72339_c : D
/*     */     //   1024: bipush #16
/*     */     //   1026: i2d
/*     */     //   1027: dmul
/*     */     //   1028: aload #9
/*     */     //   1030: getfield field_72337_e : D
/*     */     //   1033: bipush #16
/*     */     //   1035: i2d
/*     */     //   1036: dmul
/*     */     //   1037: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1040: aload #22
/*     */     //   1042: aload #9
/*     */     //   1044: getfield field_72336_d : D
/*     */     //   1047: ldc2_w 0.002
/*     */     //   1050: dadd
/*     */     //   1051: aload #9
/*     */     //   1053: getfield field_72337_e : D
/*     */     //   1056: aload #9
/*     */     //   1058: getfield field_72334_f : D
/*     */     //   1061: aload #9
/*     */     //   1063: getfield field_72334_f : D
/*     */     //   1066: bipush #16
/*     */     //   1068: i2d
/*     */     //   1069: dmul
/*     */     //   1070: aload #9
/*     */     //   1072: getfield field_72337_e : D
/*     */     //   1075: bipush #16
/*     */     //   1077: i2d
/*     */     //   1078: dmul
/*     */     //   1079: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1082: aload #22
/*     */     //   1084: aload #9
/*     */     //   1086: getfield field_72336_d : D
/*     */     //   1089: ldc2_w 0.002
/*     */     //   1092: dadd
/*     */     //   1093: aload #9
/*     */     //   1095: getfield field_72338_b : D
/*     */     //   1098: aload #9
/*     */     //   1100: getfield field_72334_f : D
/*     */     //   1103: aload #9
/*     */     //   1105: getfield field_72334_f : D
/*     */     //   1108: bipush #16
/*     */     //   1110: i2d
/*     */     //   1111: dmul
/*     */     //   1112: aload #9
/*     */     //   1114: getfield field_72338_b : D
/*     */     //   1117: bipush #16
/*     */     //   1119: i2d
/*     */     //   1120: dmul
/*     */     //   1121: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1124: aload #22
/*     */     //   1126: aload #9
/*     */     //   1128: getfield field_72336_d : D
/*     */     //   1131: ldc2_w 0.002
/*     */     //   1134: dadd
/*     */     //   1135: aload #9
/*     */     //   1137: getfield field_72338_b : D
/*     */     //   1140: aload #9
/*     */     //   1142: getfield field_72339_c : D
/*     */     //   1145: aload #9
/*     */     //   1147: getfield field_72339_c : D
/*     */     //   1150: bipush #16
/*     */     //   1152: i2d
/*     */     //   1153: dmul
/*     */     //   1154: aload #9
/*     */     //   1156: getfield field_72338_b : D
/*     */     //   1159: bipush #16
/*     */     //   1161: i2d
/*     */     //   1162: dmul
/*     */     //   1163: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1166: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1169: astore #24
/*     */     //   1171: goto -> 1721
/*     */     //   1174: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1177: aload #23
/*     */     //   1179: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1182: ifeq -> 1361
/*     */     //   1185: aload #22
/*     */     //   1187: aload #9
/*     */     //   1189: getfield field_72340_a : D
/*     */     //   1192: ldc2_w 0.002
/*     */     //   1195: dsub
/*     */     //   1196: aload #9
/*     */     //   1198: getfield field_72337_e : D
/*     */     //   1201: aload #9
/*     */     //   1203: getfield field_72334_f : D
/*     */     //   1206: aload #9
/*     */     //   1208: getfield field_72334_f : D
/*     */     //   1211: bipush #16
/*     */     //   1213: i2d
/*     */     //   1214: dmul
/*     */     //   1215: aload #9
/*     */     //   1217: getfield field_72337_e : D
/*     */     //   1220: bipush #16
/*     */     //   1222: i2d
/*     */     //   1223: dmul
/*     */     //   1224: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1227: aload #22
/*     */     //   1229: aload #9
/*     */     //   1231: getfield field_72340_a : D
/*     */     //   1234: ldc2_w 0.002
/*     */     //   1237: dsub
/*     */     //   1238: aload #9
/*     */     //   1240: getfield field_72337_e : D
/*     */     //   1243: aload #9
/*     */     //   1245: getfield field_72339_c : D
/*     */     //   1248: aload #9
/*     */     //   1250: getfield field_72339_c : D
/*     */     //   1253: bipush #16
/*     */     //   1255: i2d
/*     */     //   1256: dmul
/*     */     //   1257: aload #9
/*     */     //   1259: getfield field_72337_e : D
/*     */     //   1262: bipush #16
/*     */     //   1264: i2d
/*     */     //   1265: dmul
/*     */     //   1266: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1269: aload #22
/*     */     //   1271: aload #9
/*     */     //   1273: getfield field_72340_a : D
/*     */     //   1276: ldc2_w 0.002
/*     */     //   1279: dsub
/*     */     //   1280: aload #9
/*     */     //   1282: getfield field_72338_b : D
/*     */     //   1285: aload #9
/*     */     //   1287: getfield field_72339_c : D
/*     */     //   1290: aload #9
/*     */     //   1292: getfield field_72339_c : D
/*     */     //   1295: bipush #16
/*     */     //   1297: i2d
/*     */     //   1298: dmul
/*     */     //   1299: aload #9
/*     */     //   1301: getfield field_72338_b : D
/*     */     //   1304: bipush #16
/*     */     //   1306: i2d
/*     */     //   1307: dmul
/*     */     //   1308: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1311: aload #22
/*     */     //   1313: aload #9
/*     */     //   1315: getfield field_72340_a : D
/*     */     //   1318: ldc2_w 0.002
/*     */     //   1321: dsub
/*     */     //   1322: aload #9
/*     */     //   1324: getfield field_72338_b : D
/*     */     //   1327: aload #9
/*     */     //   1329: getfield field_72334_f : D
/*     */     //   1332: aload #9
/*     */     //   1334: getfield field_72334_f : D
/*     */     //   1337: bipush #16
/*     */     //   1339: i2d
/*     */     //   1340: dmul
/*     */     //   1341: aload #9
/*     */     //   1343: getfield field_72338_b : D
/*     */     //   1346: bipush #16
/*     */     //   1348: i2d
/*     */     //   1349: dmul
/*     */     //   1350: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1353: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1356: astore #24
/*     */     //   1358: goto -> 1721
/*     */     //   1361: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1364: aload #23
/*     */     //   1366: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1369: ifeq -> 1548
/*     */     //   1372: aload #22
/*     */     //   1374: aload #9
/*     */     //   1376: getfield field_72336_d : D
/*     */     //   1379: aload #9
/*     */     //   1381: getfield field_72337_e : D
/*     */     //   1384: aload #9
/*     */     //   1386: getfield field_72334_f : D
/*     */     //   1389: ldc2_w 0.002
/*     */     //   1392: dadd
/*     */     //   1393: aload #9
/*     */     //   1395: getfield field_72336_d : D
/*     */     //   1398: bipush #16
/*     */     //   1400: i2d
/*     */     //   1401: dmul
/*     */     //   1402: aload #9
/*     */     //   1404: getfield field_72337_e : D
/*     */     //   1407: bipush #16
/*     */     //   1409: i2d
/*     */     //   1410: dmul
/*     */     //   1411: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1414: aload #22
/*     */     //   1416: aload #9
/*     */     //   1418: getfield field_72340_a : D
/*     */     //   1421: aload #9
/*     */     //   1423: getfield field_72337_e : D
/*     */     //   1426: aload #9
/*     */     //   1428: getfield field_72334_f : D
/*     */     //   1431: ldc2_w 0.002
/*     */     //   1434: dadd
/*     */     //   1435: aload #9
/*     */     //   1437: getfield field_72340_a : D
/*     */     //   1440: bipush #16
/*     */     //   1442: i2d
/*     */     //   1443: dmul
/*     */     //   1444: aload #9
/*     */     //   1446: getfield field_72337_e : D
/*     */     //   1449: bipush #16
/*     */     //   1451: i2d
/*     */     //   1452: dmul
/*     */     //   1453: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1456: aload #22
/*     */     //   1458: aload #9
/*     */     //   1460: getfield field_72340_a : D
/*     */     //   1463: aload #9
/*     */     //   1465: getfield field_72338_b : D
/*     */     //   1468: aload #9
/*     */     //   1470: getfield field_72334_f : D
/*     */     //   1473: ldc2_w 0.002
/*     */     //   1476: dadd
/*     */     //   1477: aload #9
/*     */     //   1479: getfield field_72340_a : D
/*     */     //   1482: bipush #16
/*     */     //   1484: i2d
/*     */     //   1485: dmul
/*     */     //   1486: aload #9
/*     */     //   1488: getfield field_72338_b : D
/*     */     //   1491: bipush #16
/*     */     //   1493: i2d
/*     */     //   1494: dmul
/*     */     //   1495: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1498: aload #22
/*     */     //   1500: aload #9
/*     */     //   1502: getfield field_72336_d : D
/*     */     //   1505: aload #9
/*     */     //   1507: getfield field_72338_b : D
/*     */     //   1510: aload #9
/*     */     //   1512: getfield field_72334_f : D
/*     */     //   1515: ldc2_w 0.002
/*     */     //   1518: dadd
/*     */     //   1519: aload #9
/*     */     //   1521: getfield field_72336_d : D
/*     */     //   1524: bipush #16
/*     */     //   1526: i2d
/*     */     //   1527: dmul
/*     */     //   1528: aload #9
/*     */     //   1530: getfield field_72338_b : D
/*     */     //   1533: bipush #16
/*     */     //   1535: i2d
/*     */     //   1536: dmul
/*     */     //   1537: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1540: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1543: astore #24
/*     */     //   1545: goto -> 1721
/*     */     //   1548: aload #22
/*     */     //   1550: aload #9
/*     */     //   1552: getfield field_72340_a : D
/*     */     //   1555: aload #9
/*     */     //   1557: getfield field_72337_e : D
/*     */     //   1560: aload #9
/*     */     //   1562: getfield field_72339_c : D
/*     */     //   1565: ldc2_w 0.002
/*     */     //   1568: dsub
/*     */     //   1569: aload #9
/*     */     //   1571: getfield field_72340_a : D
/*     */     //   1574: bipush #16
/*     */     //   1576: i2d
/*     */     //   1577: dmul
/*     */     //   1578: aload #9
/*     */     //   1580: getfield field_72337_e : D
/*     */     //   1583: bipush #16
/*     */     //   1585: i2d
/*     */     //   1586: dmul
/*     */     //   1587: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1590: aload #22
/*     */     //   1592: aload #9
/*     */     //   1594: getfield field_72336_d : D
/*     */     //   1597: aload #9
/*     */     //   1599: getfield field_72337_e : D
/*     */     //   1602: aload #9
/*     */     //   1604: getfield field_72339_c : D
/*     */     //   1607: ldc2_w 0.002
/*     */     //   1610: dsub
/*     */     //   1611: aload #9
/*     */     //   1613: getfield field_72336_d : D
/*     */     //   1616: bipush #16
/*     */     //   1618: i2d
/*     */     //   1619: dmul
/*     */     //   1620: aload #9
/*     */     //   1622: getfield field_72337_e : D
/*     */     //   1625: bipush #16
/*     */     //   1627: i2d
/*     */     //   1628: dmul
/*     */     //   1629: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1632: aload #22
/*     */     //   1634: aload #9
/*     */     //   1636: getfield field_72336_d : D
/*     */     //   1639: aload #9
/*     */     //   1641: getfield field_72338_b : D
/*     */     //   1644: aload #9
/*     */     //   1646: getfield field_72339_c : D
/*     */     //   1649: ldc2_w 0.002
/*     */     //   1652: dsub
/*     */     //   1653: aload #9
/*     */     //   1655: getfield field_72336_d : D
/*     */     //   1658: bipush #16
/*     */     //   1660: i2d
/*     */     //   1661: dmul
/*     */     //   1662: aload #9
/*     */     //   1664: getfield field_72338_b : D
/*     */     //   1667: bipush #16
/*     */     //   1669: i2d
/*     */     //   1670: dmul
/*     */     //   1671: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1674: aload #22
/*     */     //   1676: aload #9
/*     */     //   1678: getfield field_72340_a : D
/*     */     //   1681: aload #9
/*     */     //   1683: getfield field_72338_b : D
/*     */     //   1686: aload #9
/*     */     //   1688: getfield field_72339_c : D
/*     */     //   1691: ldc2_w 0.002
/*     */     //   1694: dsub
/*     */     //   1695: aload #9
/*     */     //   1697: getfield field_72340_a : D
/*     */     //   1700: bipush #16
/*     */     //   1702: i2d
/*     */     //   1703: dmul
/*     */     //   1704: aload #9
/*     */     //   1706: getfield field_72338_b : D
/*     */     //   1709: bipush #16
/*     */     //   1711: i2d
/*     */     //   1712: dmul
/*     */     //   1713: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   1716: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1719: astore #24
/*     */     //   1721: aload #22
/*     */     //   1723: invokevirtual func_78381_a : ()I
/*     */     //   1726: pop
/*     */     //   1727: invokestatic glPopAttrib : ()V
/*     */     //   1730: invokestatic glPopMatrix : ()V
/*     */     //   1733: aload_2
/*     */     //   1734: getfield field_72313_a : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */     //   1737: getstatic net/minecraft/util/MovingObjectPosition$MovingObjectType.BLOCK : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */     //   1740: astore #25
/*     */     //   1742: dup
/*     */     //   1743: ifnonnull -> 1755
/*     */     //   1746: pop
/*     */     //   1747: aload #25
/*     */     //   1749: ifnull -> 1763
/*     */     //   1752: goto -> 1940
/*     */     //   1755: aload #25
/*     */     //   1757: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1760: ifeq -> 1940
/*     */     //   1763: aload_1
/*     */     //   1764: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1767: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   1770: aload_2
/*     */     //   1771: getfield field_72311_b : I
/*     */     //   1774: aload_2
/*     */     //   1775: getfield field_72312_c : I
/*     */     //   1778: aload_2
/*     */     //   1779: getfield field_72309_d : I
/*     */     //   1782: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   1785: astore #26
/*     */     //   1787: aload #26
/*     */     //   1789: instanceof li/cil/oc/common/tileentity/Print
/*     */     //   1792: ifeq -> 1935
/*     */     //   1795: aload #26
/*     */     //   1797: checkcast li/cil/oc/common/tileentity/Print
/*     */     //   1800: astore #27
/*     */     //   1802: aload_1
/*     */     //   1803: getfield player : Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   1806: aload_1
/*     */     //   1807: getfield partialTicks : F
/*     */     //   1810: invokevirtual func_70666_h : (F)Lnet/minecraft/util/Vec3;
/*     */     //   1813: astore #29
/*     */     //   1815: ldc_w 0.002
/*     */     //   1818: fstore #30
/*     */     //   1820: sipush #3042
/*     */     //   1823: invokestatic glEnable : (I)V
/*     */     //   1826: sipush #770
/*     */     //   1829: sipush #771
/*     */     //   1832: iconst_1
/*     */     //   1833: iconst_0
/*     */     //   1834: invokestatic func_148821_a : (IIII)V
/*     */     //   1837: fconst_0
/*     */     //   1838: fconst_0
/*     */     //   1839: fconst_0
/*     */     //   1840: ldc_w 0.4
/*     */     //   1843: invokestatic glColor4f : (FFFF)V
/*     */     //   1846: fconst_2
/*     */     //   1847: invokestatic glLineWidth : (F)V
/*     */     //   1850: sipush #3553
/*     */     //   1853: invokestatic glDisable : (I)V
/*     */     //   1856: iconst_0
/*     */     //   1857: invokestatic glDepthMask : (Z)V
/*     */     //   1860: aload #27
/*     */     //   1862: invokevirtual state : ()Z
/*     */     //   1865: ifeq -> 1879
/*     */     //   1868: aload #27
/*     */     //   1870: invokevirtual data : ()Lli/cil/oc/common/item/data/PrintData;
/*     */     //   1873: invokevirtual stateOn : ()Lscala/collection/mutable/Set;
/*     */     //   1876: goto -> 1887
/*     */     //   1879: aload #27
/*     */     //   1881: invokevirtual data : ()Lli/cil/oc/common/item/data/PrintData;
/*     */     //   1884: invokevirtual stateOff : ()Lscala/collection/mutable/Set;
/*     */     //   1887: new li/cil/oc/client/renderer/HighlightRenderer$$anonfun$onDrawBlockHighlight$1
/*     */     //   1890: dup
/*     */     //   1891: aload_1
/*     */     //   1892: aload #29
/*     */     //   1894: fload #30
/*     */     //   1896: aload #27
/*     */     //   1898: invokespecial <init> : (Lnet/minecraftforge/client/event/DrawBlockHighlightEvent;Lnet/minecraft/util/Vec3;FLli/cil/oc/common/tileentity/Print;)V
/*     */     //   1901: invokeinterface foreach : (Lscala/Function1;)V
/*     */     //   1906: iconst_1
/*     */     //   1907: invokestatic glDepthMask : (Z)V
/*     */     //   1910: sipush #3553
/*     */     //   1913: invokestatic glEnable : (I)V
/*     */     //   1916: sipush #3042
/*     */     //   1919: invokestatic glDisable : (I)V
/*     */     //   1922: aload_1
/*     */     //   1923: iconst_1
/*     */     //   1924: invokevirtual setCanceled : (Z)V
/*     */     //   1927: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1930: astore #28
/*     */     //   1932: goto -> 1940
/*     */     //   1935: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   1938: astore #28
/*     */     //   1940: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #32	-> 0
/*     */     //   #33	-> 5
/*     */     //   #34	-> 66
/*     */     //   #35	-> 75
/*     */     //   #36	-> 97
/*     */     //   #37	-> 112
/*     */     //   #38	-> 117
/*     */     //   #39	-> 132
/*     */     //   #40	-> 145
/*     */     //   #41	-> 184
/*     */     //   #42	-> 193
/*     */     //   #43	-> 206
/*     */     //   #45	-> 231
/*     */     //   #46	-> 234
/*     */     //   #47	-> 239
/*     */     //   #48	-> 245
/*     */     //   #50	-> 260
/*     */     //   #51	-> 269
/*     */     //   #53	-> 278
/*     */     //   #54	-> 296
/*     */     //   #56	-> 308
/*     */     //   #57	-> 343
/*     */     //   #58	-> 493
/*     */     //   #59	-> 538
/*     */     //   #57	-> 589
/*     */     //   #62	-> 599
/*     */     //   #63	-> 604
/*     */     //   #64	-> 609
/*     */     //   #65	-> 613
/*     */     //   #66	-> 624
/*     */     //   #67	-> 666
/*     */     //   #68	-> 708
/*     */     //   #69	-> 750
/*     */     //   #65	-> 795
/*     */     //   #70	-> 800
/*     */     //   #71	-> 811
/*     */     //   #72	-> 853
/*     */     //   #73	-> 895
/*     */     //   #74	-> 937
/*     */     //   #70	-> 982
/*     */     //   #75	-> 987
/*     */     //   #76	-> 998
/*     */     //   #77	-> 1040
/*     */     //   #78	-> 1082
/*     */     //   #79	-> 1124
/*     */     //   #75	-> 1169
/*     */     //   #80	-> 1174
/*     */     //   #81	-> 1185
/*     */     //   #82	-> 1227
/*     */     //   #83	-> 1269
/*     */     //   #84	-> 1311
/*     */     //   #80	-> 1356
/*     */     //   #85	-> 1361
/*     */     //   #86	-> 1372
/*     */     //   #87	-> 1414
/*     */     //   #88	-> 1456
/*     */     //   #89	-> 1498
/*     */     //   #85	-> 1543
/*     */     //   #91	-> 1548
/*     */     //   #92	-> 1590
/*     */     //   #93	-> 1632
/*     */     //   #94	-> 1674
/*     */     //   #90	-> 1719
/*     */     //   #96	-> 1721
/*     */     //   #98	-> 1727
/*     */     //   #99	-> 1730
/*     */     //   #103	-> 1733
/*     */     //   #104	-> 1787
/*     */     //   #105	-> 1802
/*     */     //   #106	-> 1815
/*     */     //   #109	-> 1820
/*     */     //   #110	-> 1826
/*     */     //   #111	-> 1837
/*     */     //   #112	-> 1846
/*     */     //   #113	-> 1850
/*     */     //   #114	-> 1856
/*     */     //   #116	-> 1860
/*     */     //   #123	-> 1906
/*     */     //   #124	-> 1910
/*     */     //   #125	-> 1916
/*     */     //   #127	-> 1922
/*     */     //   #104	-> 1930
/*     */     //   #128	-> 1935
/*     */     //   #31	-> 1940
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1941	0	this	Lli/cil/oc/client/renderer/HighlightRenderer$;
/*     */     //   0	1941	1	e	Lnet/minecraftforge/client/event/DrawBlockHighlightEvent;
/*     */     //   5	1936	2	hitInfo	Lnet/minecraft/util/MovingObjectPosition;
/*     */     //   75	1866	5	world	Lnet/minecraft/world/World;
/*     */     //   97	1844	6	blockPos	Lli/cil/oc/util/BlockPosition;
/*     */     //   112	1829	7	isAir	Z
/*     */     //   132	1601	8	block	Lnet/minecraft/block/Block;
/*     */     //   184	1549	9	bounds	Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   193	1540	10	sideHit	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   206	1527	11	playerPos	Lnet/minecraft/util/Vec3;
/*     */     //   231	1502	12	renderPos	Lnet/minecraft/util/Vec3;
/*     */     //   415	1526	15	sx	I
/*     */     //   425	1516	16	sy	I
/*     */     //   435	1506	17	sz	I
/*     */     //   473	113	19	sx	I
/*     */     //   483	103	20	sy	I
/*     */     //   493	93	21	sz	I
/*     */     //   604	1129	22	t	Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   1815	115	29	pos	Lnet/minecraft/util/Vec3;
/*     */     //   1820	110	30	expansion	F
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
/*     */   public final class HighlightRenderer$$anonfun$onDrawBlockHighlight$1
/*     */     extends AbstractFunction1<PrintData.Shape, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final DrawBlockHighlightEvent e$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Vec3 pos$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final float expansion$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final Print x2$1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public HighlightRenderer$$anonfun$onDrawBlockHighlight$1(DrawBlockHighlightEvent e$1, Vec3 pos$1, float expansion$1, Print x2$1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(PrintData.Shape shape) {
/* 117 */       AxisAlignedBB bounds = li.cil.oc.util.ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.x2$1.facing());
/* 118 */       RenderGlobal.func_147590_a(bounds.func_72329_c().func_72314_b(this.expansion$1, this.expansion$1, this.expansion$1)
/* 119 */           .func_72317_d(this.e$1.target.field_72311_b, this.e$1.target.field_72312_c, this.e$1.target.field_72309_d)
/* 120 */           .func_72317_d(-this.pos$1.field_72450_a, -this.pos$1.field_72448_b, -this.pos$1.field_72449_c), -1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private HighlightRenderer$() {
/* 131 */     MODULE$ = this;
/*     */     this.random = new Random();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\HighlightRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */