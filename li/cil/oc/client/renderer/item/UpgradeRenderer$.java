/*     */ package li.cil.oc.client.renderer.item;
/*     */ 
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.event.RobotRenderEvent;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public final class UpgradeRenderer$ {
/*     */   public static final UpgradeRenderer$ MODULE$;
/*     */   private ItemInfo craftingUpgrade;
/*     */   private ItemInfo generatorUpgrade;
/*     */   private ItemInfo inventoryUpgrade;
/*     */   private final AxisAlignedBB bounds;
/*     */   private volatile byte bitmap$0;
/*     */   
/*  16 */   private ItemInfo craftingUpgrade$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { this.craftingUpgrade = Items.get("craftingUpgrade"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }  return this.craftingUpgrade; }  } public ItemInfo craftingUpgrade() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? craftingUpgrade$lzycompute() : this.craftingUpgrade; }
/*  17 */   private ItemInfo generatorUpgrade$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.generatorUpgrade = Items.get("generatorUpgrade"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return this.generatorUpgrade; }  } public ItemInfo generatorUpgrade() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? generatorUpgrade$lzycompute() : this.generatorUpgrade; }
/*  18 */   private ItemInfo inventoryUpgrade$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.inventoryUpgrade = Items.get("inventoryUpgrade"); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.inventoryUpgrade; }  } public ItemInfo inventoryUpgrade() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? inventoryUpgrade$lzycompute() : this.inventoryUpgrade; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String preferredMountPoint(ItemStack stack, Set availableMountPoints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: astore_3
/*     */     //   5: aload_3
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual craftingUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   10: astore #4
/*     */     //   12: dup
/*     */     //   13: ifnonnull -> 25
/*     */     //   16: pop
/*     */     //   17: aload #4
/*     */     //   19: ifnull -> 89
/*     */     //   22: goto -> 33
/*     */     //   25: aload #4
/*     */     //   27: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   30: ifne -> 89
/*     */     //   33: aload_3
/*     */     //   34: aload_0
/*     */     //   35: invokevirtual generatorUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   38: astore #5
/*     */     //   40: dup
/*     */     //   41: ifnonnull -> 53
/*     */     //   44: pop
/*     */     //   45: aload #5
/*     */     //   47: ifnull -> 89
/*     */     //   50: goto -> 61
/*     */     //   53: aload #5
/*     */     //   55: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   58: ifne -> 89
/*     */     //   61: aload_3
/*     */     //   62: aload_0
/*     */     //   63: invokevirtual inventoryUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   66: astore #6
/*     */     //   68: dup
/*     */     //   69: ifnonnull -> 81
/*     */     //   72: pop
/*     */     //   73: aload #6
/*     */     //   75: ifnull -> 89
/*     */     //   78: goto -> 182
/*     */     //   81: aload #6
/*     */     //   83: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 182
/*     */     //   89: aload_3
/*     */     //   90: aload_0
/*     */     //   91: invokevirtual generatorUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   94: astore #7
/*     */     //   96: dup
/*     */     //   97: ifnonnull -> 109
/*     */     //   100: pop
/*     */     //   101: aload #7
/*     */     //   103: ifnull -> 117
/*     */     //   106: goto -> 133
/*     */     //   109: aload #7
/*     */     //   111: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   114: ifeq -> 133
/*     */     //   117: aload_2
/*     */     //   118: ldc 'bottom_back'
/*     */     //   120: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   125: ifeq -> 133
/*     */     //   128: ldc 'bottom_back'
/*     */     //   130: goto -> 184
/*     */     //   133: aload_3
/*     */     //   134: aload_0
/*     */     //   135: invokevirtual inventoryUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   138: astore #8
/*     */     //   140: dup
/*     */     //   141: ifnonnull -> 153
/*     */     //   144: pop
/*     */     //   145: aload #8
/*     */     //   147: ifnull -> 161
/*     */     //   150: goto -> 177
/*     */     //   153: aload #8
/*     */     //   155: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 177
/*     */     //   161: aload_2
/*     */     //   162: ldc 'top_back'
/*     */     //   164: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   169: ifeq -> 177
/*     */     //   172: ldc 'top_back'
/*     */     //   174: goto -> 184
/*     */     //   177: ldc 'any'
/*     */     //   179: goto -> 184
/*     */     //   182: ldc 'none'
/*     */     //   184: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #21	-> 0
/*     */     //   #23	-> 5
/*     */     //   #24	-> 89
/*     */     //   #25	-> 133
/*     */     //   #26	-> 177
/*     */     //   #28	-> 182
/*     */     //   #20	-> 184
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	185	0	this	Lli/cil/oc/client/renderer/item/UpgradeRenderer$;
/*     */     //   0	185	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	185	2	availableMountPoints	Ljava/util/Set;
/*     */     //   5	180	3	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canRender(ItemStack stack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual craftingUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   10: astore_3
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 23
/*     */     //   15: pop
/*     */     //   16: aload_3
/*     */     //   17: ifnull -> 86
/*     */     //   20: goto -> 30
/*     */     //   23: aload_3
/*     */     //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   27: ifne -> 86
/*     */     //   30: aload_2
/*     */     //   31: aload_0
/*     */     //   32: invokevirtual generatorUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   35: astore #4
/*     */     //   37: dup
/*     */     //   38: ifnonnull -> 50
/*     */     //   41: pop
/*     */     //   42: aload #4
/*     */     //   44: ifnull -> 86
/*     */     //   47: goto -> 58
/*     */     //   50: aload #4
/*     */     //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   55: ifne -> 86
/*     */     //   58: aload_2
/*     */     //   59: aload_0
/*     */     //   60: invokevirtual inventoryUpgrade : ()Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   63: astore #5
/*     */     //   65: dup
/*     */     //   66: ifnonnull -> 78
/*     */     //   69: pop
/*     */     //   70: aload #5
/*     */     //   72: ifnull -> 86
/*     */     //   75: goto -> 90
/*     */     //   78: aload #5
/*     */     //   80: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   83: ifeq -> 90
/*     */     //   86: iconst_1
/*     */     //   87: goto -> 91
/*     */     //   90: iconst_0
/*     */     //   91: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #32	-> 0
/*     */     //   #34	-> 5
/*     */     //   #31	-> 91
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	92	0	this	Lli/cil/oc/client/renderer/item/UpgradeRenderer$;
/*     */     //   0	92	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   5	87	2	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(ItemStack stack, RobotRenderEvent.MountPoint mountPoint) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   4: astore_3
/*     */     //   5: aload_3
/*     */     //   6: ldc 'craftingUpgrade'
/*     */     //   8: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   11: astore #4
/*     */     //   13: dup
/*     */     //   14: ifnonnull -> 26
/*     */     //   17: pop
/*     */     //   18: aload #4
/*     */     //   20: ifnull -> 34
/*     */     //   23: goto -> 92
/*     */     //   26: aload #4
/*     */     //   28: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   31: ifeq -> 92
/*     */     //   34: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   37: invokevirtual func_110434_K : ()Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   40: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   43: invokevirtual upgradeCrafting : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   46: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   49: aload_0
/*     */     //   50: aload_2
/*     */     //   51: aload_0
/*     */     //   52: invokespecial drawSimpleBlock$default$2 : ()F
/*     */     //   55: invokespecial drawSimpleBlock : (Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;F)V
/*     */     //   58: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   61: new scala/collection/mutable/StringBuilder
/*     */     //   64: dup
/*     */     //   65: invokespecial <init> : ()V
/*     */     //   68: aload_0
/*     */     //   69: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   72: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   75: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   78: ldc '.renderItem: crafting upgrade'
/*     */     //   80: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   83: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   86: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   89: goto -> 281
/*     */     //   92: aload_3
/*     */     //   93: ldc 'generatorUpgrade'
/*     */     //   95: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   98: astore #5
/*     */     //   100: dup
/*     */     //   101: ifnonnull -> 113
/*     */     //   104: pop
/*     */     //   105: aload #5
/*     */     //   107: ifnull -> 121
/*     */     //   110: goto -> 197
/*     */     //   113: aload #5
/*     */     //   115: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 197
/*     */     //   121: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   124: invokevirtual func_110434_K : ()Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   127: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   130: invokevirtual upgradeGenerator : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   133: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   136: aload_0
/*     */     //   137: aload_2
/*     */     //   138: getstatic li/cil/oc/integration/opencomputers/Item$.MODULE$ : Lli/cil/oc/integration/opencomputers/Item$;
/*     */     //   141: aload_1
/*     */     //   142: invokevirtual dataTag : (Lnet/minecraft/item/ItemStack;)Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   145: ldc 'remainingTicks'
/*     */     //   147: invokevirtual func_74762_e : (Ljava/lang/String;)I
/*     */     //   150: iconst_0
/*     */     //   151: if_icmple -> 159
/*     */     //   154: ldc 0.5
/*     */     //   156: goto -> 160
/*     */     //   159: fconst_0
/*     */     //   160: invokespecial drawSimpleBlock : (Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;F)V
/*     */     //   163: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   166: new scala/collection/mutable/StringBuilder
/*     */     //   169: dup
/*     */     //   170: invokespecial <init> : ()V
/*     */     //   173: aload_0
/*     */     //   174: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   177: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   180: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   183: ldc '.renderItem: generator upgrade'
/*     */     //   185: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   188: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   191: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   194: goto -> 281
/*     */     //   197: aload_3
/*     */     //   198: ldc 'inventoryUpgrade'
/*     */     //   200: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   203: astore #6
/*     */     //   205: dup
/*     */     //   206: ifnonnull -> 218
/*     */     //   209: pop
/*     */     //   210: aload #6
/*     */     //   212: ifnull -> 226
/*     */     //   215: goto -> 281
/*     */     //   218: aload #6
/*     */     //   220: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   223: ifeq -> 281
/*     */     //   226: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   229: invokevirtual func_110434_K : ()Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   232: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   235: invokevirtual upgradeInventory : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   238: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   241: aload_0
/*     */     //   242: aload_2
/*     */     //   243: aload_0
/*     */     //   244: invokespecial drawSimpleBlock$default$2 : ()F
/*     */     //   247: invokespecial drawSimpleBlock : (Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;F)V
/*     */     //   250: getstatic li/cil/oc/util/RenderState$.MODULE$ : Lli/cil/oc/util/RenderState$;
/*     */     //   253: new scala/collection/mutable/StringBuilder
/*     */     //   256: dup
/*     */     //   257: invokespecial <init> : ()V
/*     */     //   260: aload_0
/*     */     //   261: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   264: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   267: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   270: ldc '.renderItem: inventory upgrade'
/*     */     //   272: invokevirtual append : (Ljava/lang/Object;)Lscala/collection/mutable/StringBuilder;
/*     */     //   275: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   278: invokevirtual checkError : (Ljava/lang/String;)V
/*     */     //   281: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #38	-> 0
/*     */     //   #40	-> 5
/*     */     //   #41	-> 34
/*     */     //   #42	-> 49
/*     */     //   #44	-> 58
/*     */     //   #47	-> 92
/*     */     //   #48	-> 121
/*     */     //   #49	-> 136
/*     */     //   #51	-> 163
/*     */     //   #54	-> 197
/*     */     //   #55	-> 226
/*     */     //   #56	-> 241
/*     */     //   #58	-> 250
/*     */     //   #37	-> 281
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	282	0	this	Lli/cil/oc/client/renderer/item/UpgradeRenderer$;
/*     */     //   0	282	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	282	2	mountPoint	Lli/cil/oc/api/event/RobotRenderEvent$MountPoint;
/*     */     //   5	277	3	descriptor	Lli/cil/oc/api/detail/ItemInfo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private AxisAlignedBB bounds() {
/*  62 */     return this.bounds;
/*     */   }
/*  64 */   private float drawSimpleBlock$default$2() { return 0.0F; } private void drawSimpleBlock(RobotRenderEvent.MountPoint mountPoint, float frontOffset) {
/*  65 */     GL11.glRotatef(mountPoint.rotation.getW(), mountPoint.rotation.getX(), mountPoint.rotation.getY(), mountPoint.rotation.getZ());
/*  66 */     GL11.glTranslatef(mountPoint.offset.getX(), mountPoint.offset.getY(), mountPoint.offset.getZ());
/*     */     
/*  68 */     GL11.glBegin(7);
/*     */ 
/*     */ 
/*     */     
/*  72 */     GL11.glTexCoord2f(frontOffset, 0.5F);
/*  73 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72338_b, (bounds()).field_72334_f);
/*  74 */     GL11.glTexCoord2f(frontOffset + 0.5F, 0.5F);
/*  75 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72338_b, (bounds()).field_72334_f);
/*  76 */     GL11.glTexCoord2f(frontOffset + 0.5F, 0.0F);
/*  77 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72337_e, (bounds()).field_72334_f);
/*  78 */     GL11.glTexCoord2f(frontOffset, 0.0F);
/*  79 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72337_e, (bounds()).field_72334_f);
/*     */ 
/*     */ 
/*     */     
/*  83 */     GL11.glTexCoord2f(1.0F, 0.5F);
/*  84 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72337_e, (bounds()).field_72334_f);
/*  85 */     GL11.glTexCoord2f(1.0F, 1.0F);
/*  86 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72337_e, (bounds()).field_72339_c);
/*  87 */     GL11.glTexCoord2f(0.5F, 1.0F);
/*  88 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72337_e, (bounds()).field_72339_c);
/*  89 */     GL11.glTexCoord2f(0.5F, 0.5F);
/*  90 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72337_e, (bounds()).field_72334_f);
/*     */ 
/*     */ 
/*     */     
/*  94 */     GL11.glTexCoord2f(0.5F, 0.5F);
/*  95 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72338_b, (bounds()).field_72334_f);
/*  96 */     GL11.glTexCoord2f(0.5F, 1.0F);
/*  97 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72338_b, (bounds()).field_72339_c);
/*  98 */     GL11.glTexCoord2f(1.0F, 1.0F);
/*  99 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72338_b, (bounds()).field_72339_c);
/* 100 */     GL11.glTexCoord2f(1.0F, 0.5F);
/* 101 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72338_b, (bounds()).field_72334_f);
/*     */ 
/*     */ 
/*     */     
/* 105 */     GL11.glTexCoord2f(0.0F, 0.5F);
/* 106 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72337_e, (bounds()).field_72334_f);
/* 107 */     GL11.glTexCoord2f(0.0F, 1.0F);
/* 108 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72338_b, (bounds()).field_72334_f);
/* 109 */     GL11.glTexCoord2f(0.5F, 1.0F);
/* 110 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72338_b, (bounds()).field_72339_c);
/* 111 */     GL11.glTexCoord2f(0.5F, 0.5F);
/* 112 */     GL11.glVertex3d((bounds()).field_72336_d, (bounds()).field_72337_e, (bounds()).field_72339_c);
/*     */ 
/*     */ 
/*     */     
/* 116 */     GL11.glTexCoord2f(0.0F, 1.0F);
/* 117 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72338_b, (bounds()).field_72334_f);
/* 118 */     GL11.glTexCoord2f(0.0F, 0.5F);
/* 119 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72337_e, (bounds()).field_72334_f);
/* 120 */     GL11.glTexCoord2f(0.5F, 0.5F);
/* 121 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72337_e, (bounds()).field_72339_c);
/* 122 */     GL11.glTexCoord2f(0.5F, 1.0F);
/* 123 */     GL11.glVertex3d((bounds()).field_72340_a, (bounds()).field_72338_b, (bounds()).field_72339_c);
/*     */     
/* 125 */     GL11.glEnd();
/*     */   } private UpgradeRenderer$() {
/* 127 */     MODULE$ = this;
/*     */     this.bounds = AxisAlignedBB.func_72330_a(-0.1D, -0.1D, -0.1D, 0.1D, 0.1D, 0.1D);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\item\UpgradeRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */