/*     */ package li.cil.oc.common.event;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.event.RackMountableRenderEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class RackMountableRenderHandler$
/*     */ {
/*     */   public static final RackMountableRenderHandler$ MODULE$;
/*     */   private ItemInfo DiskDriveMountable;
/*     */   private ItemInfo[] Servers;
/*     */   private ItemInfo TerminalServer;
/*     */   private volatile byte bitmap$0;
/*     */   
/*     */   private ItemInfo DiskDriveMountable$lzycompute() {
/*  21 */     synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.DiskDriveMountable = Items.get("diskDriveMountable"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.DiskDriveMountable; }  } public ItemInfo DiskDriveMountable() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? DiskDriveMountable$lzycompute() : this.DiskDriveMountable; }
/*     */   public ItemInfo[] Servers() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? Servers$lzycompute() : this.Servers; }
/*  23 */   private ItemInfo[] Servers$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { (new ItemInfo[4])[0] = 
/*  24 */           Items.get("server1");
/*  25 */         (new ItemInfo[4])[1] = Items.get("server2");
/*  26 */         (new ItemInfo[4])[2] = Items.get("server3");
/*  27 */         (new ItemInfo[4])[3] = Items.get("serverCreative"); this.Servers = new ItemInfo[4]; this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }
/*     */       
/*     */       return this.Servers; }
/*  30 */      } private ItemInfo TerminalServer$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.TerminalServer = Items.get("terminalServer"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.TerminalServer; }  } public ItemInfo TerminalServer() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? TerminalServer$lzycompute() : this.TerminalServer; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public void onRackMountableRendering(RackMountableRenderEvent.TileEntity e) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   4: ifnull -> 304
/*     */     //   7: aload_0
/*     */     //   8: invokevirtual DiskDriveMountable : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   11: aload_1
/*     */     //   12: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   15: aload_1
/*     */     //   16: getfield mountable : I
/*     */     //   19: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   24: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   27: astore_2
/*     */     //   28: dup
/*     */     //   29: ifnonnull -> 40
/*     */     //   32: pop
/*     */     //   33: aload_2
/*     */     //   34: ifnull -> 47
/*     */     //   37: goto -> 304
/*     */     //   40: aload_2
/*     */     //   41: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   44: ifeq -> 304
/*     */     //   47: aload_1
/*     */     //   48: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   51: ldc 'disk'
/*     */     //   53: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*     */     //   56: ifeq -> 231
/*     */     //   59: aload_1
/*     */     //   60: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   63: ldc 'disk'
/*     */     //   65: invokevirtual func_74775_l : (Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   68: invokestatic func_77949_a : (Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/item/ItemStack;
/*     */     //   71: astore_3
/*     */     //   72: aload_3
/*     */     //   73: ifnull -> 231
/*     */     //   76: invokestatic glPushMatrix : ()V
/*     */     //   79: fconst_1
/*     */     //   80: ldc -1.0
/*     */     //   82: fconst_1
/*     */     //   83: invokestatic glScalef : (FFF)V
/*     */     //   86: ldc 0.625
/*     */     //   88: ldc 3.5
/*     */     //   90: aload_1
/*     */     //   91: getfield mountable : I
/*     */     //   94: i2f
/*     */     //   95: ldc 3.0
/*     */     //   97: fmul
/*     */     //   98: fadd
/*     */     //   99: fneg
/*     */     //   100: ldc 16.0
/*     */     //   102: fdiv
/*     */     //   103: ldc 0.0625
/*     */     //   105: invokestatic glTranslatef : (FFF)V
/*     */     //   108: ldc 90.0
/*     */     //   110: ldc -1.0
/*     */     //   112: fconst_0
/*     */     //   113: fconst_0
/*     */     //   114: invokestatic glRotatef : (FFFF)V
/*     */     //   117: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   120: aload_1
/*     */     //   121: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   124: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   129: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   132: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   135: aload_1
/*     */     //   136: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   139: invokevirtual apply : (Lli/cil/oc/api/network/EnvironmentHost;)Lli/cil/oc/util/BlockPosition;
/*     */     //   142: aload_1
/*     */     //   143: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   146: invokeinterface facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   151: invokevirtual offset : (Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/util/BlockPosition;
/*     */     //   154: iconst_0
/*     */     //   155: invokevirtual getLightBrightnessForSkyBlocks : (Lli/cil/oc/util/BlockPosition;I)I
/*     */     //   158: istore #4
/*     */     //   160: getstatic net/minecraft/client/renderer/OpenGlHelper.field_77476_b : I
/*     */     //   163: iload #4
/*     */     //   165: ldc 65536
/*     */     //   167: irem
/*     */     //   168: i2f
/*     */     //   169: iload #4
/*     */     //   171: ldc 65536
/*     */     //   173: idiv
/*     */     //   174: i2f
/*     */     //   175: invokestatic func_77475_a : (IFF)V
/*     */     //   178: new net/minecraft/entity/item/EntityItem
/*     */     //   181: dup
/*     */     //   182: aload_1
/*     */     //   183: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   186: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   191: dconst_0
/*     */     //   192: dconst_0
/*     */     //   193: dconst_0
/*     */     //   194: aload_3
/*     */     //   195: invokespecial <init> : (Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V
/*     */     //   198: astore #5
/*     */     //   200: aload #5
/*     */     //   202: fconst_0
/*     */     //   203: putfield field_70290_d : F
/*     */     //   206: iconst_1
/*     */     //   207: putstatic net/minecraft/client/renderer/entity/RenderItem.field_82407_g : Z
/*     */     //   210: getstatic net/minecraft/client/renderer/entity/RenderManager.field_78727_a : Lnet/minecraft/client/renderer/entity/RenderManager;
/*     */     //   213: aload #5
/*     */     //   215: dconst_0
/*     */     //   216: dconst_0
/*     */     //   217: dconst_0
/*     */     //   218: fconst_0
/*     */     //   219: fconst_0
/*     */     //   220: invokevirtual func_147940_a : (Lnet/minecraft/entity/Entity;DDDFF)Z
/*     */     //   223: pop
/*     */     //   224: iconst_0
/*     */     //   225: putstatic net/minecraft/client/renderer/entity/RenderItem.field_82407_g : Z
/*     */     //   228: invokestatic glPopMatrix : ()V
/*     */     //   231: invokestatic currentTimeMillis : ()J
/*     */     //   234: aload_1
/*     */     //   235: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   238: ldc 'lastAccess'
/*     */     //   240: invokevirtual func_74763_f : (Ljava/lang/String;)J
/*     */     //   243: lsub
/*     */     //   244: ldc2_w 400
/*     */     //   247: lcmp
/*     */     //   248: ifge -> 684
/*     */     //   251: aload_1
/*     */     //   252: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   255: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   260: getfield field_73012_v : Ljava/util/Random;
/*     */     //   263: invokevirtual nextDouble : ()D
/*     */     //   266: ldc2_w 0.1
/*     */     //   269: dcmpl
/*     */     //   270: ifle -> 684
/*     */     //   273: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   276: invokevirtual disableLighting : ()V
/*     */     //   279: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   282: invokevirtual makeItBlend : ()V
/*     */     //   285: aload_1
/*     */     //   286: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   289: invokevirtual blockRackDiskDriveActivity : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   292: invokevirtual renderOverlay : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   295: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   298: invokevirtual enableLighting : ()V
/*     */     //   301: goto -> 684
/*     */     //   304: aload_1
/*     */     //   305: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   308: ifnull -> 549
/*     */     //   311: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   314: aload_0
/*     */     //   315: invokevirtual Servers : ()[Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   318: checkcast [Ljava/lang/Object;
/*     */     //   321: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   324: aload_1
/*     */     //   325: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   328: aload_1
/*     */     //   329: getfield mountable : I
/*     */     //   332: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   337: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   340: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   345: ifeq -> 549
/*     */     //   348: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   351: invokevirtual disableLighting : ()V
/*     */     //   354: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   357: invokevirtual makeItBlend : ()V
/*     */     //   360: aload_1
/*     */     //   361: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   364: ldc_w 'isRunning'
/*     */     //   367: invokevirtual func_74767_n : (Ljava/lang/String;)Z
/*     */     //   370: ifeq -> 383
/*     */     //   373: aload_1
/*     */     //   374: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   377: invokevirtual blockRackServerOn : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   380: invokevirtual renderOverlay : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   383: aload_1
/*     */     //   384: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   387: ldc_w 'hasErrored'
/*     */     //   390: invokevirtual func_74767_n : (Ljava/lang/String;)Z
/*     */     //   393: ifeq -> 429
/*     */     //   396: getstatic li/cil/oc/client/renderer/tileentity/RenderUtil$.MODULE$ : Lli/cil/oc/client/renderer/tileentity/RenderUtil$;
/*     */     //   399: aload_1
/*     */     //   400: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   403: invokevirtual hashCode : ()I
/*     */     //   406: aload_1
/*     */     //   407: getfield mountable : I
/*     */     //   410: iconst_1
/*     */     //   411: iadd
/*     */     //   412: imul
/*     */     //   413: invokevirtual shouldShowErrorLight : (I)Z
/*     */     //   416: ifeq -> 429
/*     */     //   419: aload_1
/*     */     //   420: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   423: invokevirtual blockRackServerError : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   426: invokevirtual renderOverlay : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   429: invokestatic currentTimeMillis : ()J
/*     */     //   432: aload_1
/*     */     //   433: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   436: ldc_w 'lastFileSystemAccess'
/*     */     //   439: invokevirtual func_74763_f : (Ljava/lang/String;)J
/*     */     //   442: lsub
/*     */     //   443: ldc2_w 400
/*     */     //   446: lcmp
/*     */     //   447: ifge -> 482
/*     */     //   450: aload_1
/*     */     //   451: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   454: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   459: getfield field_73012_v : Ljava/util/Random;
/*     */     //   462: invokevirtual nextDouble : ()D
/*     */     //   465: ldc2_w 0.1
/*     */     //   468: dcmpl
/*     */     //   469: ifle -> 482
/*     */     //   472: aload_1
/*     */     //   473: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   476: invokevirtual blockRackServerActivity : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   479: invokevirtual renderOverlay : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   482: invokestatic currentTimeMillis : ()J
/*     */     //   485: aload_1
/*     */     //   486: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   489: ldc_w 'lastNetworkActivity'
/*     */     //   492: invokevirtual func_74763_f : (Ljava/lang/String;)J
/*     */     //   495: lsub
/*     */     //   496: ldc2_w 300
/*     */     //   499: lcmp
/*     */     //   500: ifge -> 540
/*     */     //   503: invokestatic currentTimeMillis : ()J
/*     */     //   506: ldc2_w 200
/*     */     //   509: lrem
/*     */     //   510: ldc2_w 100
/*     */     //   513: lcmp
/*     */     //   514: ifle -> 540
/*     */     //   517: aload_1
/*     */     //   518: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   521: ldc_w 'isRunning'
/*     */     //   524: invokevirtual func_74767_n : (Ljava/lang/String;)Z
/*     */     //   527: ifeq -> 540
/*     */     //   530: aload_1
/*     */     //   531: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   534: invokevirtual blockRackServerNetworkActivity : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   537: invokevirtual renderOverlay : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   540: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   543: invokevirtual enableLighting : ()V
/*     */     //   546: goto -> 684
/*     */     //   549: aload_1
/*     */     //   550: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   553: ifnull -> 684
/*     */     //   556: aload_0
/*     */     //   557: invokevirtual TerminalServer : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   560: aload_1
/*     */     //   561: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   564: aload_1
/*     */     //   565: getfield mountable : I
/*     */     //   568: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   573: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   576: astore #6
/*     */     //   578: dup
/*     */     //   579: ifnonnull -> 591
/*     */     //   582: pop
/*     */     //   583: aload #6
/*     */     //   585: ifnull -> 599
/*     */     //   588: goto -> 684
/*     */     //   591: aload #6
/*     */     //   593: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   596: ifeq -> 684
/*     */     //   599: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   602: invokevirtual disableLighting : ()V
/*     */     //   605: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   608: invokevirtual makeItBlend : ()V
/*     */     //   611: aload_1
/*     */     //   612: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   615: invokevirtual blockRackTerminalServerOn : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   618: invokevirtual renderOverlay : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   621: aload_1
/*     */     //   622: getfield data : Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   625: ldc_w 'keys'
/*     */     //   628: bipush #8
/*     */     //   630: invokevirtual func_150295_c : (Ljava/lang/String;I)Lnet/minecraft/nbt/NBTTagList;
/*     */     //   633: invokevirtual func_74745_c : ()I
/*     */     //   636: istore #7
/*     */     //   638: iload #7
/*     */     //   640: iconst_0
/*     */     //   641: if_icmple -> 678
/*     */     //   644: ldc_w 0.4375
/*     */     //   647: fstore #8
/*     */     //   649: fload #8
/*     */     //   651: iconst_2
/*     */     //   652: iload #7
/*     */     //   654: imul
/*     */     //   655: iconst_1
/*     */     //   656: isub
/*     */     //   657: i2f
/*     */     //   658: ldc 16.0
/*     */     //   660: fdiv
/*     */     //   661: fadd
/*     */     //   662: fstore #9
/*     */     //   664: aload_1
/*     */     //   665: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   668: invokevirtual blockRackTerminalServerPresence : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   671: fload #8
/*     */     //   673: fload #9
/*     */     //   675: invokevirtual renderOverlay : (Lnet/minecraft/util/ResourceLocation;FF)V
/*     */     //   678: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   681: invokevirtual enableLighting : ()V
/*     */     //   684: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 0
/*     */     //   #37	-> 47
/*     */     //   #38	-> 59
/*     */     //   #39	-> 72
/*     */     //   #40	-> 76
/*     */     //   #41	-> 79
/*     */     //   #42	-> 86
/*     */     //   #43	-> 108
/*     */     //   #45	-> 117
/*     */     //   #46	-> 160
/*     */     //   #49	-> 178
/*     */     //   #50	-> 200
/*     */     //   #51	-> 206
/*     */     //   #52	-> 210
/*     */     //   #53	-> 224
/*     */     //   #54	-> 228
/*     */     //   #58	-> 231
/*     */     //   #59	-> 273
/*     */     //   #60	-> 279
/*     */     //   #62	-> 285
/*     */     //   #64	-> 295
/*     */     //   #67	-> 304
/*     */     //   #69	-> 348
/*     */     //   #70	-> 354
/*     */     //   #72	-> 360
/*     */     //   #73	-> 373
/*     */     //   #75	-> 383
/*     */     //   #76	-> 419
/*     */     //   #78	-> 429
/*     */     //   #79	-> 472
/*     */     //   #81	-> 482
/*     */     //   #82	-> 530
/*     */     //   #85	-> 540
/*     */     //   #87	-> 549
/*     */     //   #89	-> 599
/*     */     //   #90	-> 605
/*     */     //   #92	-> 611
/*     */     //   #93	-> 621
/*     */     //   #95	-> 638
/*     */     //   #96	-> 644
/*     */     //   #97	-> 649
/*     */     //   #98	-> 664
/*     */     //   #101	-> 678
/*     */     //   #34	-> 684
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	685	0	this	Lli/cil/oc/common/event/RackMountableRenderHandler$;
/*     */     //   0	685	1	e	Lli/cil/oc/api/event/RackMountableRenderEvent$TileEntity;
/*     */     //   72	613	3	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   160	71	4	brightness	I
/*     */     //   200	31	5	entity	Lnet/minecraft/entity/item/EntityItem;
/*     */     //   638	46	7	countConnected	I
/*     */     //   649	29	8	u0	F
/*     */     //   664	14	9	u1	F
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
/*     */   @SubscribeEvent
/*     */   public void onRackMountableRendering(RackMountableRenderEvent.Block e) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual DiskDriveMountable : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: aload_1
/*     */     //   5: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   8: aload_1
/*     */     //   9: getfield mountable : I
/*     */     //   12: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   17: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   20: astore_2
/*     */     //   21: dup
/*     */     //   22: ifnonnull -> 33
/*     */     //   25: pop
/*     */     //   26: aload_2
/*     */     //   27: ifnull -> 40
/*     */     //   30: goto -> 53
/*     */     //   33: aload_2
/*     */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   37: ifeq -> 53
/*     */     //   40: aload_1
/*     */     //   41: getstatic li/cil/oc/client/Textures$Rack$.MODULE$ : Lli/cil/oc/client/Textures$Rack$;
/*     */     //   44: invokevirtual diskDrive : ()Lnet/minecraft/util/IIcon;
/*     */     //   47: invokevirtual setFrontTextureOverride : (Lnet/minecraft/util/IIcon;)V
/*     */     //   50: goto -> 153
/*     */     //   53: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   56: aload_0
/*     */     //   57: invokevirtual Servers : ()[Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   60: checkcast [Ljava/lang/Object;
/*     */     //   63: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   66: aload_1
/*     */     //   67: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   70: aload_1
/*     */     //   71: getfield mountable : I
/*     */     //   74: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   79: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   82: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   87: ifeq -> 103
/*     */     //   90: aload_1
/*     */     //   91: getstatic li/cil/oc/client/Textures$Rack$.MODULE$ : Lli/cil/oc/client/Textures$Rack$;
/*     */     //   94: invokevirtual server : ()Lnet/minecraft/util/IIcon;
/*     */     //   97: invokevirtual setFrontTextureOverride : (Lnet/minecraft/util/IIcon;)V
/*     */     //   100: goto -> 153
/*     */     //   103: aload_0
/*     */     //   104: invokevirtual TerminalServer : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   107: aload_1
/*     */     //   108: getfield rack : Lli/cil/oc/api/internal/Rack;
/*     */     //   111: aload_1
/*     */     //   112: getfield mountable : I
/*     */     //   115: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   120: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   123: astore_3
/*     */     //   124: dup
/*     */     //   125: ifnonnull -> 136
/*     */     //   128: pop
/*     */     //   129: aload_3
/*     */     //   130: ifnull -> 143
/*     */     //   133: goto -> 153
/*     */     //   136: aload_3
/*     */     //   137: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   140: ifeq -> 153
/*     */     //   143: aload_1
/*     */     //   144: getstatic li/cil/oc/client/Textures$Rack$.MODULE$ : Lli/cil/oc/client/Textures$Rack$;
/*     */     //   147: invokevirtual terminal : ()Lnet/minecraft/util/IIcon;
/*     */     //   150: invokevirtual setFrontTextureOverride : (Lnet/minecraft/util/IIcon;)V
/*     */     //   153: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 0
/*     */     //   #109	-> 40
/*     */     //   #111	-> 53
/*     */     //   #113	-> 90
/*     */     //   #115	-> 103
/*     */     //   #117	-> 143
/*     */     //   #107	-> 153
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	154	0	this	Lli/cil/oc/common/event/RackMountableRenderHandler$;
/*     */     //   0	154	1	e	Lli/cil/oc/api/event/RackMountableRenderEvent$Block;
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
/*     */   private RackMountableRenderHandler$() {
/* 120 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\RackMountableRenderHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */