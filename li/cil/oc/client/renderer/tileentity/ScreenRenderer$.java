/*     */ package li.cil.oc.client.renderer.tileentity;
/*     */ 
/*     */ import li.cil.oc.common.tileentity.Screen;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class ScreenRenderer$ extends TileEntitySpecialRenderer {
/*     */   public static final ScreenRenderer$ MODULE$;
/*     */   private final double maxRenderDistanceSq;
/*     */   private final double fadeDistanceSq;
/*     */   private final double fadeRatio;
/*     */   private Screen screen;
/*     */   private Set<ItemInfo> screens;
/*     */   private final boolean canUseBlendColor;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  20 */   private ScreenRenderer$() { MODULE$ = this;
/*  21 */     this.maxRenderDistanceSq = li.cil.oc.Settings$.MODULE$.get().maxScreenTextRenderDistance() * li.cil.oc.Settings$.MODULE$.get().maxScreenTextRenderDistance();
/*     */     
/*  23 */     this.fadeDistanceSq = li.cil.oc.Settings$.MODULE$.get().screenTextFadeStartDistance() * li.cil.oc.Settings$.MODULE$.get().screenTextFadeStartDistance();
/*     */     
/*  25 */     this.fadeRatio = 1.0D / (maxRenderDistanceSq() - fadeDistanceSq());
/*     */     
/*  27 */     this.screen = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  34 */     this.canUseBlendColor = (GLContext.getCapabilities()).OpenGL14; } private double maxRenderDistanceSq() { return this.maxRenderDistanceSq; } private double fadeDistanceSq() { return this.fadeDistanceSq; } private double fadeRatio() { return this.fadeRatio; } private boolean canUseBlendColor() { return this.canUseBlendColor; }
/*     */   
/*     */   private Screen screen() {
/*     */     return this.screen;
/*     */   } private void screen_$eq(Screen x$1) {
/*     */     this.screen = x$1;
/*     */   }
/*  41 */   public void func_147500_a(TileEntity t, double x, double y, double z, float f) { li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*     */     
/*  43 */     screen_$eq((Screen)t);
/*  44 */     if (screen().isOrigin())
/*     */     
/*     */     { 
/*     */       
/*  48 */       double distance = playerDistanceSq() / scala.math.package$.MODULE$.min(screen().width(), screen().height());
/*  49 */       if (distance > maxRenderDistanceSq()) {
/*     */         return;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*  55 */       ForgeDirection screenFacing = screen().facing().getOpposite();
/*  56 */       if (screenFacing.offsetX * (x + 0.5D) + screenFacing.offsetY * (y + 0.5D) + screenFacing.offsetZ * (z + 0.5D) < false) {
/*     */         return;
/*     */       }
/*     */       
/*  60 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: checks").toString());
/*     */       
/*  62 */       GL11.glPushAttrib(1048575);
/*     */       
/*  64 */       OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, 255.0F, 255.0F);
/*  65 */       li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/*  66 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/*     */       
/*  68 */       GL11.glPushMatrix();
/*     */       
/*  70 */       GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*     */       
/*  72 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: setup").toString());
/*     */       
/*  74 */       drawOverlay();
/*     */       
/*  76 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: overlay").toString());
/*     */       
/*  78 */       if (distance > fadeDistanceSq()) {
/*  79 */         float alpha = scala.math.package$.MODULE$.max(0.0F, true - (float)((distance - fadeDistanceSq()) * fadeRatio()));
/*  80 */         if (canUseBlendColor()) {
/*  81 */           GL14.glBlendColor(0.0F, 0.0F, 0.0F, alpha);
/*  82 */           GL11.glBlendFunc(32771, 1);
/*     */         } 
/*     */       } 
/*     */       
/*  86 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: fade").toString());
/*     */       
/*  88 */       if (screen().buffer().isRenderingEnabled()) {
/*  89 */         Profiler profiler = (Minecraft.func_71410_x()).field_71424_I;
/*  90 */         profiler.func_76320_a("opencomputers:screen_text");
/*  91 */         draw();
/*  92 */         profiler.func_76319_b();
/*     */       } 
/*     */       
/*  95 */       li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*     */       
/*  97 */       GL11.glPopMatrix();
/*  98 */       GL11.glPopAttrib();
/*     */       
/* 100 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString()); return; }  }
/*     */   private Set screens$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new ItemInfo[3])[0] = Items.get("screen1"); (new ItemInfo[3])[1] = Items.get("screen2"); (new ItemInfo[3])[2] = Items.get("screen3"); this.screens = (Set<ItemInfo>)scala.Predef$.MODULE$.Set().apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[3])); this.bitmap$0 = true; }
/*     */        return this.screens; }
/*     */      }
/* 104 */   private Set<ItemInfo> screens() { return this.bitmap$0 ? this.screens : screens$lzycompute(); } private void transform() { ForgeDirection forgeDirection1 = screen().yaw();
/* 105 */     if (ForgeDirection.WEST.equals(forgeDirection1)) { GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 106 */     else if (ForgeDirection.NORTH.equals(forgeDirection1)) { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 107 */     else if (ForgeDirection.EAST.equals(forgeDirection1)) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 108 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/* 110 */     ForgeDirection forgeDirection2 = screen().pitch();
/* 111 */     if (ForgeDirection.DOWN.equals(forgeDirection2)) { GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 112 */     else if (ForgeDirection.UP.equals(forgeDirection2)) { GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 113 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */ 
/*     */     
/* 117 */     GL11.glTranslatef(-0.5F, -0.5F, 0.5F);
/* 118 */     GL11.glTranslatef(0.0F, screen().height(), 0.0F);
/*     */ 
/*     */     
/* 121 */     GL11.glScalef(1.0F, -1.0F, 1.0F); }
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
/*     */   private void drawOverlay() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial screen : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   4: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   7: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   10: astore_1
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 23
/*     */     //   15: pop
/*     */     //   16: aload_1
/*     */     //   17: ifnull -> 60
/*     */     //   20: goto -> 30
/*     */     //   23: aload_1
/*     */     //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   27: ifne -> 60
/*     */     //   30: aload_0
/*     */     //   31: invokespecial screen : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   34: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   37: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   40: astore_2
/*     */     //   41: dup
/*     */     //   42: ifnonnull -> 53
/*     */     //   45: pop
/*     */     //   46: aload_2
/*     */     //   47: ifnull -> 60
/*     */     //   50: goto -> 230
/*     */     //   53: aload_2
/*     */     //   54: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 230
/*     */     //   60: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   63: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   66: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   69: astore_3
/*     */     //   70: aload_3
/*     */     //   71: ifnull -> 230
/*     */     //   74: getstatic li/cil/oc/integration/util/Wrench$.MODULE$ : Lli/cil/oc/integration/util/Wrench$;
/*     */     //   77: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   80: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   83: aload_0
/*     */     //   84: invokespecial screen : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   87: invokevirtual position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   90: invokevirtual holdsApplicableWrench : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/util/BlockPosition;)Z
/*     */     //   93: ifne -> 112
/*     */     //   96: aload_0
/*     */     //   97: invokespecial screens : ()Lscala/collection/immutable/Set;
/*     */     //   100: aload_3
/*     */     //   101: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   104: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 230
/*     */     //   112: invokestatic glPushMatrix : ()V
/*     */     //   115: aload_0
/*     */     //   116: invokespecial transform : ()V
/*     */     //   119: aload_0
/*     */     //   120: getstatic li/cil/oc/client/Textures$.MODULE$ : Lli/cil/oc/client/Textures$;
/*     */     //   123: invokevirtual blockScreenUpIndicator : ()Lnet/minecraft/util/ResourceLocation;
/*     */     //   126: invokevirtual func_147499_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   129: iconst_0
/*     */     //   130: invokestatic glDepthMask : (Z)V
/*     */     //   133: aload_0
/*     */     //   134: invokespecial screen : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   137: invokevirtual width : ()I
/*     */     //   140: i2f
/*     */     //   141: fconst_2
/*     */     //   142: fdiv
/*     */     //   143: ldc_w 0.5
/*     */     //   146: fsub
/*     */     //   147: aload_0
/*     */     //   148: invokespecial screen : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   151: invokevirtual height : ()I
/*     */     //   154: i2f
/*     */     //   155: fconst_2
/*     */     //   156: fdiv
/*     */     //   157: ldc_w 0.5
/*     */     //   160: fsub
/*     */     //   161: ldc_w 0.05
/*     */     //   164: invokestatic glTranslatef : (FFF)V
/*     */     //   167: getstatic net/minecraft/client/renderer/Tessellator.field_78398_a : Lnet/minecraft/client/renderer/Tessellator;
/*     */     //   170: astore #4
/*     */     //   172: aload #4
/*     */     //   174: invokevirtual func_78382_b : ()V
/*     */     //   177: aload #4
/*     */     //   179: dconst_0
/*     */     //   180: dconst_1
/*     */     //   181: dconst_0
/*     */     //   182: dconst_0
/*     */     //   183: dconst_1
/*     */     //   184: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   187: aload #4
/*     */     //   189: dconst_1
/*     */     //   190: dconst_1
/*     */     //   191: dconst_0
/*     */     //   192: dconst_1
/*     */     //   193: dconst_1
/*     */     //   194: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   197: aload #4
/*     */     //   199: dconst_1
/*     */     //   200: dconst_0
/*     */     //   201: dconst_0
/*     */     //   202: dconst_1
/*     */     //   203: dconst_0
/*     */     //   204: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   207: aload #4
/*     */     //   209: dconst_0
/*     */     //   210: dconst_0
/*     */     //   211: dconst_0
/*     */     //   212: dconst_0
/*     */     //   213: dconst_0
/*     */     //   214: invokevirtual func_78374_a : (DDDDD)V
/*     */     //   217: aload #4
/*     */     //   219: invokevirtual func_78381_a : ()I
/*     */     //   222: pop
/*     */     //   223: iconst_1
/*     */     //   224: invokestatic glDepthMask : (Z)V
/*     */     //   227: invokestatic glPopMatrix : ()V
/*     */     //   230: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 0
/*     */     //   #126	-> 60
/*     */     //   #127	-> 70
/*     */     //   #128	-> 74
/*     */     //   #129	-> 112
/*     */     //   #130	-> 115
/*     */     //   #131	-> 119
/*     */     //   #132	-> 129
/*     */     //   #133	-> 133
/*     */     //   #134	-> 167
/*     */     //   #135	-> 172
/*     */     //   #136	-> 177
/*     */     //   #137	-> 187
/*     */     //   #138	-> 197
/*     */     //   #139	-> 207
/*     */     //   #140	-> 217
/*     */     //   #141	-> 223
/*     */     //   #142	-> 227
/*     */     //   #124	-> 230
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	231	0	this	Lli/cil/oc/client/renderer/tileentity/ScreenRenderer$;
/*     */     //   70	161	3	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   172	58	4	t	Lnet/minecraft/client/renderer/Tessellator;
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
/*     */   private void draw() {
/* 148 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".draw: entering (aka: wasntme)").toString());
/*     */     
/* 150 */     int sx = screen().width();
/* 151 */     int sy = screen().height();
/* 152 */     float tw = sx * 16.0F;
/* 153 */     float th = sy * 16.0F;
/*     */     
/* 155 */     transform();
/*     */ 
/*     */     
/* 158 */     GL11.glTranslatef(sx * 2.25F / tw, sy * 2.25F / th, 0.0F);
/*     */ 
/*     */     
/* 161 */     float isx = sx - 0.28125F;
/* 162 */     float isy = sy - 0.28125F;
/*     */ 
/*     */     
/* 165 */     int sizeX = screen().buffer().renderWidth();
/* 166 */     int sizeY = screen().buffer().renderHeight();
/* 167 */     float scaleX = isx / sizeX;
/* 168 */     float scaleY = isy / sizeY;
/*     */     
/* 170 */     if (scaleX > scaleY) {
/* 171 */       GL11.glTranslatef(sizeX * 0.5F * (scaleX - scaleY), 0.0F, 0.0F);
/* 172 */       GL11.glScalef(scaleY, scaleY, 1.0F);
/*     */     } else {
/*     */       
/* 175 */       GL11.glTranslatef(0.0F, sizeY * 0.5F * (scaleY - scaleX), 0.0F);
/* 176 */       GL11.glScalef(scaleX, scaleX, 1.0F);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     GL11.glTranslated(0.0D, 0.0D, 0.01D);
/*     */     
/* 187 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".draw: setup").toString());
/*     */ 
/*     */     
/* 190 */     screen().buffer().renderText();
/*     */     
/* 192 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".draw: text").toString());
/*     */   }
/*     */   
/*     */   private double playerDistanceSq() {
/* 196 */     EntityClientPlayerMP player = (Minecraft.func_71410_x()).field_71439_g;
/* 197 */     AxisAlignedBB bounds = screen().getRenderBoundingBox();
/*     */     
/* 199 */     double px = player.field_70165_t;
/* 200 */     double py = player.field_70163_u;
/* 201 */     double pz = player.field_70161_v;
/*     */     
/* 203 */     double ex = bounds.field_72336_d - bounds.field_72340_a;
/* 204 */     double ey = bounds.field_72337_e - bounds.field_72338_b;
/* 205 */     double ez = bounds.field_72334_f - bounds.field_72339_c;
/* 206 */     double cx = bounds.field_72340_a + ex * 0.5D;
/* 207 */     double cy = bounds.field_72338_b + ey * 0.5D;
/* 208 */     double cz = bounds.field_72339_c + ez * 0.5D;
/* 209 */     double dx = px - cx;
/* 210 */     double dy = py - cy;
/* 211 */     double dz = pz - cz;
/*     */ 
/*     */     
/* 214 */     double d = dx + ex;
/*     */ 
/*     */ 
/*     */     
/* 218 */     double d1 = dx - ex;
/*     */ 
/*     */ 
/*     */     
/* 222 */     double d2 = dy + ey;
/*     */ 
/*     */ 
/*     */     
/* 226 */     double d3 = dy - ey;
/*     */ 
/*     */ 
/*     */     
/* 230 */     double d4 = dz + ez;
/*     */ 
/*     */ 
/*     */     
/* 234 */     double d5 = dz - ez;
/* 235 */     return ((dx < -ex) ? (d * d) : ((dx > ex) ? (d1 * d1) : 0.0D)) + ((dy < -ey) ? (d2 * d2) : ((dy > ey) ? (d3 * d3) : 0.0D)) + ((dz < -ez) ? (d4 * d4) : ((dz > ez) ? (d5 * d5) : 
/*     */       
/* 237 */       0.0D));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\ScreenRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */