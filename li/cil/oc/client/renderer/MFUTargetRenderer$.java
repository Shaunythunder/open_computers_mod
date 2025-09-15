/*     */ package li.cil.oc.client.renderer;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import net.minecraftforge.client.event.RenderWorldLastEvent;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public final class MFUTargetRenderer$ {
/*     */   public static final MFUTargetRenderer$ MODULE$;
/*     */   private final int color;
/*     */   private ItemInfo mfu;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*     */   private int color() {
/*  16 */     return this.color;
/*  17 */   } private ItemInfo mfu$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.mfu = Items.get("mfu"); this.bitmap$0 = true; }  return this.mfu; }  } private ItemInfo mfu() { return this.bitmap$0 ? this.mfu : mfu$lzycompute(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public void onRenderWorldLastEvent(RenderWorldLastEvent e) {
/*     */     // Byte code:
/*     */     //   0: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   3: astore_2
/*     */     //   4: aload_2
/*     */     //   5: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   8: astore_3
/*     */     //   9: aload_3
/*     */     //   10: ifnonnull -> 14
/*     */     //   13: return
/*     */     //   14: aload_3
/*     */     //   15: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   18: astore #4
/*     */     //   20: aload #4
/*     */     //   22: ifnull -> 786
/*     */     //   25: aload #4
/*     */     //   27: astore #5
/*     */     //   29: aload #5
/*     */     //   31: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   34: aload_0
/*     */     //   35: invokespecial mfu : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   38: astore #6
/*     */     //   40: dup
/*     */     //   41: ifnonnull -> 53
/*     */     //   44: pop
/*     */     //   45: aload #6
/*     */     //   47: ifnull -> 61
/*     */     //   50: goto -> 786
/*     */     //   53: aload #6
/*     */     //   55: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   58: ifeq -> 786
/*     */     //   61: aload #5
/*     */     //   63: invokevirtual func_77942_o : ()Z
/*     */     //   66: ifeq -> 786
/*     */     //   69: aload #5
/*     */     //   71: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   74: astore #8
/*     */     //   76: aload #8
/*     */     //   78: new scala/collection/mutable/StringBuilder
/*     */     //   81: dup
/*     */     //   82: invokespecial <init> : ()V
/*     */     //   85: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   88: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   91: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   94: ldc 'coord'
/*     */     //   96: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   99: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   102: bipush #11
/*     */     //   104: invokevirtual func_150297_b : (Ljava/lang/String;I)Z
/*     */     //   107: ifeq -> 778
/*     */     //   110: aload #8
/*     */     //   112: new scala/collection/mutable/StringBuilder
/*     */     //   115: dup
/*     */     //   116: invokespecial <init> : ()V
/*     */     //   119: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   122: invokevirtual namespace : ()Ljava/lang/String;
/*     */     //   125: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   128: ldc 'coord'
/*     */     //   130: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   133: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   136: invokevirtual func_74759_k : (Ljava/lang/String;)[I
/*     */     //   139: astore #10
/*     */     //   141: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   144: aload #10
/*     */     //   146: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   149: astore #11
/*     */     //   151: aload #11
/*     */     //   153: invokevirtual isEmpty : ()Z
/*     */     //   156: ifne -> 768
/*     */     //   159: aload #11
/*     */     //   161: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   164: ifnull -> 768
/*     */     //   167: aload #11
/*     */     //   169: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   172: checkcast scala/collection/SeqLike
/*     */     //   175: iconst_5
/*     */     //   176: invokeinterface lengthCompare : (I)I
/*     */     //   181: iconst_0
/*     */     //   182: if_icmpne -> 768
/*     */     //   185: aload #11
/*     */     //   187: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   190: checkcast scala/collection/SeqLike
/*     */     //   193: iconst_0
/*     */     //   194: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   199: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   202: istore #12
/*     */     //   204: aload #11
/*     */     //   206: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   209: checkcast scala/collection/SeqLike
/*     */     //   212: iconst_1
/*     */     //   213: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   218: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   221: istore #13
/*     */     //   223: aload #11
/*     */     //   225: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   228: checkcast scala/collection/SeqLike
/*     */     //   231: iconst_2
/*     */     //   232: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   237: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   240: istore #14
/*     */     //   242: aload #11
/*     */     //   244: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   247: checkcast scala/collection/SeqLike
/*     */     //   250: iconst_3
/*     */     //   251: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   256: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   259: istore #15
/*     */     //   261: aload #11
/*     */     //   263: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   266: checkcast scala/collection/SeqLike
/*     */     //   269: iconst_4
/*     */     //   270: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   275: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   278: istore #16
/*     */     //   280: new scala/Tuple5
/*     */     //   283: dup
/*     */     //   284: iload #12
/*     */     //   286: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   289: iload #13
/*     */     //   291: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   294: iload #14
/*     */     //   296: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   299: iload #15
/*     */     //   301: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   304: iload #16
/*     */     //   306: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */     //   309: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   312: astore #17
/*     */     //   314: aload #17
/*     */     //   316: astore #9
/*     */     //   318: aload #9
/*     */     //   320: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   323: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   326: istore #18
/*     */     //   328: aload #9
/*     */     //   330: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   333: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   336: istore #19
/*     */     //   338: aload #9
/*     */     //   340: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   343: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   346: istore #20
/*     */     //   348: aload #9
/*     */     //   350: invokevirtual _4 : ()Ljava/lang/Object;
/*     */     //   353: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   356: istore #21
/*     */     //   358: aload #9
/*     */     //   360: invokevirtual _5 : ()Ljava/lang/Object;
/*     */     //   363: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */     //   366: istore #22
/*     */     //   368: aload_3
/*     */     //   369: invokevirtual func_130014_f_ : ()Lnet/minecraft/world/World;
/*     */     //   372: getfield field_73011_w : Lnet/minecraft/world/WorldProvider;
/*     */     //   375: getfield field_76574_g : I
/*     */     //   378: iload #21
/*     */     //   380: if_icmpeq -> 384
/*     */     //   383: return
/*     */     //   384: aload_3
/*     */     //   385: iload #18
/*     */     //   387: i2d
/*     */     //   388: iload #19
/*     */     //   390: i2d
/*     */     //   391: iload #20
/*     */     //   393: i2d
/*     */     //   394: invokevirtual func_70011_f : (DDD)D
/*     */     //   397: bipush #64
/*     */     //   399: i2d
/*     */     //   400: dcmpl
/*     */     //   401: ifle -> 405
/*     */     //   404: return
/*     */     //   405: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   408: iload #18
/*     */     //   410: iload #19
/*     */     //   412: iload #20
/*     */     //   414: invokevirtual apply : (III)Lli/cil/oc/util/BlockPosition;
/*     */     //   417: invokevirtual bounds : ()Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   420: ldc2_w 0.1
/*     */     //   423: ldc2_w 0.1
/*     */     //   426: ldc2_w 0.1
/*     */     //   429: invokevirtual func_72314_b : (DDD)Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   432: astore #23
/*     */     //   434: aload_3
/*     */     //   435: getfield field_70142_S : D
/*     */     //   438: aload_3
/*     */     //   439: getfield field_70165_t : D
/*     */     //   442: aload_3
/*     */     //   443: getfield field_70142_S : D
/*     */     //   446: dsub
/*     */     //   447: aload_1
/*     */     //   448: getfield partialTicks : F
/*     */     //   451: f2d
/*     */     //   452: dmul
/*     */     //   453: dadd
/*     */     //   454: dstore #24
/*     */     //   456: aload_3
/*     */     //   457: getfield field_70137_T : D
/*     */     //   460: aload_3
/*     */     //   461: getfield field_70163_u : D
/*     */     //   464: aload_3
/*     */     //   465: getfield field_70137_T : D
/*     */     //   468: dsub
/*     */     //   469: aload_1
/*     */     //   470: getfield partialTicks : F
/*     */     //   473: f2d
/*     */     //   474: dmul
/*     */     //   475: dadd
/*     */     //   476: dstore #26
/*     */     //   478: aload_3
/*     */     //   479: getfield field_70136_U : D
/*     */     //   482: aload_3
/*     */     //   483: getfield field_70161_v : D
/*     */     //   486: aload_3
/*     */     //   487: getfield field_70136_U : D
/*     */     //   490: dsub
/*     */     //   491: aload_1
/*     */     //   492: getfield partialTicks : F
/*     */     //   495: f2d
/*     */     //   496: dmul
/*     */     //   497: dadd
/*     */     //   498: dstore #28
/*     */     //   500: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   503: new scala/collection/mutable/StringBuilder
/*     */     //   506: dup
/*     */     //   507: invokespecial <init> : ()V
/*     */     //   510: aload_0
/*     */     //   511: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   514: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   517: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   520: ldc_w '.onRenderWorldLastEvent: entering (aka: wasntme)'
/*     */     //   523: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   526: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   529: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   532: ldc_w 1048575
/*     */     //   535: invokestatic glPushAttrib : (I)V
/*     */     //   538: invokestatic glPushMatrix : ()V
/*     */     //   541: dload #24
/*     */     //   543: dneg
/*     */     //   544: dload #26
/*     */     //   546: dneg
/*     */     //   547: dload #28
/*     */     //   549: dneg
/*     */     //   550: invokestatic glTranslated : (DDD)V
/*     */     //   553: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   556: invokevirtual makeItBlend : ()V
/*     */     //   559: sipush #2896
/*     */     //   562: invokestatic glDisable : (I)V
/*     */     //   565: sipush #3553
/*     */     //   568: invokestatic glDisable : (I)V
/*     */     //   571: sipush #2929
/*     */     //   574: invokestatic glDisable : (I)V
/*     */     //   577: sipush #2884
/*     */     //   580: invokestatic glDisable : (I)V
/*     */     //   583: aload_0
/*     */     //   584: invokespecial color : ()I
/*     */     //   587: bipush #16
/*     */     //   589: ishr
/*     */     //   590: sipush #255
/*     */     //   593: iand
/*     */     //   594: i2f
/*     */     //   595: ldc_w 255.0
/*     */     //   598: fdiv
/*     */     //   599: aload_0
/*     */     //   600: invokespecial color : ()I
/*     */     //   603: bipush #8
/*     */     //   605: ishr
/*     */     //   606: sipush #255
/*     */     //   609: iand
/*     */     //   610: i2f
/*     */     //   611: ldc_w 255.0
/*     */     //   614: fdiv
/*     */     //   615: aload_0
/*     */     //   616: invokespecial color : ()I
/*     */     //   619: iconst_0
/*     */     //   620: ishr
/*     */     //   621: sipush #255
/*     */     //   624: iand
/*     */     //   625: i2f
/*     */     //   626: ldc_w 255.0
/*     */     //   629: fdiv
/*     */     //   630: ldc_w 0.25
/*     */     //   633: invokestatic glColor4f : (FFFF)V
/*     */     //   636: sipush #1032
/*     */     //   639: sipush #6913
/*     */     //   642: invokestatic glPolygonMode : (II)V
/*     */     //   645: aload_0
/*     */     //   646: aload #23
/*     */     //   648: getfield field_72340_a : D
/*     */     //   651: aload #23
/*     */     //   653: getfield field_72338_b : D
/*     */     //   656: aload #23
/*     */     //   658: getfield field_72339_c : D
/*     */     //   661: aload #23
/*     */     //   663: getfield field_72336_d : D
/*     */     //   666: aload #23
/*     */     //   668: getfield field_72337_e : D
/*     */     //   671: aload #23
/*     */     //   673: getfield field_72334_f : D
/*     */     //   676: invokespecial drawBox : (DDDDDD)V
/*     */     //   679: sipush #1032
/*     */     //   682: sipush #6914
/*     */     //   685: invokestatic glPolygonMode : (II)V
/*     */     //   688: aload_0
/*     */     //   689: aload #23
/*     */     //   691: getfield field_72340_a : D
/*     */     //   694: aload #23
/*     */     //   696: getfield field_72338_b : D
/*     */     //   699: aload #23
/*     */     //   701: getfield field_72339_c : D
/*     */     //   704: aload #23
/*     */     //   706: getfield field_72336_d : D
/*     */     //   709: aload #23
/*     */     //   711: getfield field_72337_e : D
/*     */     //   714: aload #23
/*     */     //   716: getfield field_72334_f : D
/*     */     //   719: iload #22
/*     */     //   721: invokespecial drawFace : (DDDDDDI)V
/*     */     //   724: invokestatic glPopMatrix : ()V
/*     */     //   727: invokestatic glPopAttrib : ()V
/*     */     //   730: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   733: new scala/collection/mutable/StringBuilder
/*     */     //   736: dup
/*     */     //   737: invokespecial <init> : ()V
/*     */     //   740: aload_0
/*     */     //   741: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   744: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   747: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   750: ldc_w '.onRenderWorldLastEvent: leaving'
/*     */     //   753: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   756: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   759: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   762: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   765: goto -> 781
/*     */     //   768: new scala/MatchError
/*     */     //   771: dup
/*     */     //   772: aload #10
/*     */     //   774: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   777: athrow
/*     */     //   778: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   781: astore #7
/*     */     //   783: goto -> 791
/*     */     //   786: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   789: astore #7
/*     */     //   791: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #21	-> 0
/*     */     //   #22	-> 4
/*     */     //   #23	-> 9
/*     */     //   #24	-> 14
/*     */     //   #25	-> 20
/*     */     //   #26	-> 69
/*     */     //   #27	-> 76
/*     */     //   #28	-> 110
/*     */     //   #29	-> 368
/*     */     //   #30	-> 384
/*     */     //   #32	-> 405
/*     */     //   #34	-> 434
/*     */     //   #35	-> 456
/*     */     //   #36	-> 478
/*     */     //   #38	-> 500
/*     */     //   #40	-> 532
/*     */     //   #41	-> 538
/*     */     //   #42	-> 541
/*     */     //   #43	-> 553
/*     */     //   #44	-> 559
/*     */     //   #45	-> 565
/*     */     //   #46	-> 571
/*     */     //   #47	-> 577
/*     */     //   #50	-> 583
/*     */     //   #51	-> 599
/*     */     //   #52	-> 615
/*     */     //   #53	-> 630
/*     */     //   #49	-> 633
/*     */     //   #54	-> 636
/*     */     //   #55	-> 645
/*     */     //   #56	-> 679
/*     */     //   #57	-> 688
/*     */     //   #59	-> 724
/*     */     //   #60	-> 727
/*     */     //   #62	-> 730
/*     */     //   #28	-> 768
/*     */     //   #27	-> 778
/*     */     //   #25	-> 781
/*     */     //   #64	-> 786
/*     */     //   #20	-> 791
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	792	0	this	Lli/cil/oc/client/renderer/MFUTargetRenderer$;
/*     */     //   0	792	1	e	Lnet/minecraftforge/client/event/RenderWorldLastEvent;
/*     */     //   4	788	2	mc	Lnet/minecraft/client/Minecraft;
/*     */     //   9	783	3	player	Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   76	716	8	data	Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   204	588	12	x	I
/*     */     //   223	569	13	y	I
/*     */     //   242	550	14	z	I
/*     */     //   261	531	15	dimension	I
/*     */     //   280	512	16	side	I
/*     */     //   328	437	18	x	I
/*     */     //   338	427	19	y	I
/*     */     //   348	417	20	z	I
/*     */     //   358	407	21	dimension	I
/*     */     //   368	397	22	side	I
/*     */     //   434	331	23	bounds	Lnet/minecraft/util/AxisAlignedBB;
/*     */     //   456	309	24	px	D
/*     */     //   478	287	26	py	D
/*     */     //   500	265	28	pz	D
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
/*     */   private void drawBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
/*  69 */     GL11.glBegin(7);
/*  70 */     GL11.glVertex3d(minX, minY, minZ);
/*  71 */     GL11.glVertex3d(minX, minY, maxZ);
/*  72 */     GL11.glVertex3d(maxX, minY, maxZ);
/*  73 */     GL11.glVertex3d(maxX, minY, minZ);
/*  74 */     GL11.glEnd();
/*  75 */     GL11.glBegin(7);
/*  76 */     GL11.glVertex3d(minX, minY, minZ);
/*  77 */     GL11.glVertex3d(maxX, minY, minZ);
/*  78 */     GL11.glVertex3d(maxX, maxY, minZ);
/*  79 */     GL11.glVertex3d(minX, maxY, minZ);
/*  80 */     GL11.glEnd();
/*  81 */     GL11.glBegin(7);
/*  82 */     GL11.glVertex3d(maxX, maxY, minZ);
/*  83 */     GL11.glVertex3d(maxX, maxY, maxZ);
/*  84 */     GL11.glVertex3d(minX, maxY, maxZ);
/*  85 */     GL11.glVertex3d(minX, maxY, minZ);
/*  86 */     GL11.glEnd();
/*  87 */     GL11.glBegin(7);
/*  88 */     GL11.glVertex3d(maxX, maxY, maxZ);
/*  89 */     GL11.glVertex3d(maxX, minY, maxZ);
/*  90 */     GL11.glVertex3d(minX, minY, maxZ);
/*  91 */     GL11.glVertex3d(minX, maxY, maxZ);
/*  92 */     GL11.glEnd();
/*  93 */     GL11.glBegin(7);
/*  94 */     GL11.glVertex3d(minX, minY, minZ);
/*  95 */     GL11.glVertex3d(minX, maxY, minZ);
/*  96 */     GL11.glVertex3d(minX, maxY, maxZ);
/*  97 */     GL11.glVertex3d(minX, minY, maxZ);
/*  98 */     GL11.glEnd();
/*  99 */     GL11.glBegin(7);
/* 100 */     GL11.glVertex3d(maxX, minY, minZ);
/* 101 */     GL11.glVertex3d(maxX, minY, maxZ);
/* 102 */     GL11.glVertex3d(maxX, maxY, maxZ);
/* 103 */     GL11.glVertex3d(maxX, maxY, minZ);
/* 104 */     GL11.glEnd();
/*     */   }
/*     */   
/*     */   private void drawFace(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, int side) {
/* 108 */     int i = side; switch (i)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 5:
/* 145 */         GL11.glBegin(7);
/* 146 */         GL11.glVertex3d(maxX, minY, minZ);
/* 147 */         GL11.glVertex3d(maxX, minY, maxZ);
/* 148 */         GL11.glVertex3d(maxX, maxY, maxZ);
/* 149 */         GL11.glVertex3d(maxX, maxY, minZ);
/* 150 */         GL11.glEnd(); break;
/*     */       case 4: GL11.glBegin(7); GL11.glVertex3d(minX, minY, minZ); GL11.glVertex3d(minX, maxY, minZ); GL11.glVertex3d(minX, maxY, maxZ); GL11.glVertex3d(minX, minY, maxZ); GL11.glEnd(); break;
/*     */       case 3: GL11.glBegin(7); GL11.glVertex3d(maxX, maxY, maxZ); GL11.glVertex3d(maxX, minY, maxZ); GL11.glVertex3d(minX, minY, maxZ); GL11.glVertex3d(minX, maxY, maxZ); GL11.glEnd(); break;
/*     */       case 2: GL11.glBegin(7); GL11.glVertex3d(minX, minY, minZ); GL11.glVertex3d(maxX, minY, minZ); GL11.glVertex3d(maxX, maxY, minZ); GL11.glVertex3d(minX, maxY, minZ); GL11.glEnd(); break;
/*     */       case 1: GL11.glBegin(7); GL11.glVertex3d(maxX, maxY, minZ); GL11.glVertex3d(maxX, maxY, maxZ); GL11.glVertex3d(minX, maxY, maxZ); GL11.glVertex3d(minX, maxY, minZ); GL11.glEnd(); break;
/* 155 */       case 0: GL11.glBegin(7); GL11.glVertex3d(minX, minY, minZ); GL11.glVertex3d(minX, minY, maxZ); GL11.glVertex3d(maxX, minY, maxZ); GL11.glVertex3d(maxX, minY, minZ); GL11.glEnd(); break; }  } private MFUTargetRenderer$() { MODULE$ = this;
/*     */     this.color = 65280; }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\MFUTargetRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */