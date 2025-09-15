/*     */ package li.cil.oc.client.renderer.tileentity;
/*     */ 
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import li.cil.oc.common.tileentity.Hologram;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import org.lwjgl.opengl.GL15;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ 
/*     */ public final class HologramRenderer$ extends TileEntitySpecialRenderer implements Callable<Object>, RemovalListener<TileEntity, Object> {
/*     */   public static final HologramRenderer$ MODULE$;
/*     */   private final Random random;
/*     */   private final Cache<Hologram, Object> cache;
/*     */   private int commonBuffer;
/*     */   private IntBuffer dataBuffer;
/*     */   private Hologram li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram;
/*     */   private boolean failed;
/*     */   
/*  25 */   private HologramRenderer$() { MODULE$ = this;
/*  26 */     this.random = new Random();
/*     */ 
/*     */     
/*  29 */     this.cache = CacheBuilder.newBuilder()
/*  30 */       .expireAfterAccess(5L, TimeUnit.SECONDS)
/*  31 */       .removalListener(this)
/*     */       
/*  33 */       .build();
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
/*  47 */     this.commonBuffer = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     this.dataBuffer = null;
/*     */ 
/*     */     
/*  58 */     this.li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     this.failed = false; } private Random random() { return this.random; } private Cache<Hologram, Object> cache() { return this.cache; } private int commonBuffer() { return this.commonBuffer; } private void commonBuffer_$eq(int x$1) { this.commonBuffer = x$1; } private IntBuffer dataBuffer() { return this.dataBuffer; } private void dataBuffer_$eq(IntBuffer x$1) { this.dataBuffer = x$1; } public Hologram li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram() { return this.li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram; } private void li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram_$eq(Hologram x$1) { this.li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram = x$1; } private boolean failed() { return this.failed; } private void failed_$eq(boolean x$1) { this.failed = x$1; }
/*     */   
/*     */   public void func_147500_a(TileEntity te, double x, double y, double z, float f) {
/*  67 */     if (failed()) {
/*  68 */       HologramRendererFallback$.MODULE$.func_147500_a(te, x, y, z, f);
/*     */       
/*     */       return;
/*     */     } 
/*  72 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*     */     
/*  74 */     li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram_$eq((Hologram)te);
/*  75 */     if (li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().hasPower()) {
/*     */       
/*  77 */       GL11.glPushClientAttrib(-1);
/*  78 */       GL11.glPushAttrib(1048575);
/*  79 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/*  80 */       GL11.glBlendFunc(770, 1);
/*     */       
/*  82 */       double playerDistSq = x * x + y * y + z * z;
/*  83 */       double maxDistSq = li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().func_145833_n();
/*  84 */       double fadeDistSq = li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().getFadeStartDistanceSquared();
/*  85 */       li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha(0.75F * ((playerDistSq > fadeDistSq) ? scala.math.package$.MODULE$.max(0.0F, true - (float)((playerDistSq - fadeDistSq) / (maxDistSq - fadeDistSq))) : 1.0F));
/*     */       
/*  87 */       GL11.glPushMatrix();
/*  88 */       GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*     */       
/*  90 */       ForgeDirection forgeDirection1 = li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().yaw();
/*  91 */       if (ForgeDirection.WEST.equals(forgeDirection1)) { GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  92 */       else if (ForgeDirection.NORTH.equals(forgeDirection1)) { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  93 */       else if (ForgeDirection.EAST.equals(forgeDirection1)) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  94 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*  96 */       ForgeDirection forgeDirection2 = li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().pitch();
/*  97 */       if (ForgeDirection.DOWN.equals(forgeDirection2)) { GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  98 */       else if (ForgeDirection.UP.equals(forgeDirection2)) { GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  99 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */       
/* 102 */       GL11.glRotatef(li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationAngle(), li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationX(), li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationY(), li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationZ());
/* 103 */       GL11.glRotatef(li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationSpeed() * (float)((li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().func_145831_w().func_82737_E() % 7199L) + f) / 20.0F, li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationSpeedX(), li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationSpeedY(), li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().rotationSpeedZ());
/*     */       
/* 105 */       GL11.glScaled(1.001D, 1.001D, 1.001D);
/* 106 */       GL11.glTranslated((
/* 107 */           (li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().translation()).field_72450_a * 48 / 16 - 1.5D) * li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale(), 
/* 108 */           (li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().translation()).field_72448_b * 32 / 16 * li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale(), (
/* 109 */           (li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().translation()).field_72449_c * 48 / 16 - 1.5D) * li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale());
/*     */ 
/*     */       
/* 112 */       if (li.cil.oc.Settings$.MODULE$.get().hologramFlickerFrequency() > false && random().nextDouble() < li.cil.oc.Settings$.MODULE$.get().hologramFlickerFrequency()) {
/* 113 */         GL11.glScaled(true + random().nextGaussian() * 0.01D, true + random().nextGaussian() * 0.001D, true + random().nextGaussian() * 0.01D);
/* 114 */         GL11.glTranslated(random().nextGaussian() * 0.01D, random().nextGaussian() * 0.01D, random().nextGaussian() * 0.01D);
/*     */       } 
/*     */ 
/*     */       
/* 118 */       GL11.glScaled(li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale() / 16.0D, li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale() / 16.0D, li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale() / 16.0D);
/*     */       
/* 120 */       func_147499_a(li.cil.oc.client.Textures$.MODULE$.blockHologram());
/*     */ 
/*     */       
/* 123 */       GL11.glEnable(2977);
/*     */       
/* 125 */       double sx = (x + 0.5D) * li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale();
/* 126 */       double sy = -(y + 0.5D) * li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale();
/* 127 */       double sz = (z + 0.5D) * li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().scale();
/* 128 */       if (sx >= -1.5D && sx <= 1.5D && sz >= -1.5D && sz <= 1.5D && sy >= false && sy <= 2) {
/*     */         
/* 130 */         GL11.glDisable(2884);
/*     */       }
/*     */       else {
/*     */         
/* 134 */         GL11.glEnable(2884);
/* 135 */         GL11.glCullFace(1029);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 143 */       int glBuffer = BoxesRunTime.unboxToInt(cache().get(li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram(), this));
/* 144 */       GL11.glColorMask(false, false, false, false);
/* 145 */       GL11.glDepthMask(true);
/* 146 */       draw(glBuffer);
/* 147 */       GL11.glColorMask(true, true, true, true);
/* 148 */       GL11.glDepthFunc(514);
/* 149 */       draw(glBuffer);
/*     */       
/* 151 */       GL11.glPopMatrix();
/* 152 */       GL11.glPopAttrib();
/* 153 */       GL11.glPopClientAttrib();
/*     */       
/* 155 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*     */       return;
/*     */     } 
/*     */   } public void draw(int glBuffer) {
/* 159 */     if (initialize()) {
/* 160 */       validate(glBuffer);
/* 161 */       publish(glBuffer);
/*     */     } 
/*     */   }
/*     */   
/* 165 */   private boolean initialize() { return (!failed() && liftedTree1$1()); }
/*     */   public final void li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(int x, int y, int z, int u, int v, int nx, int ny, int nz, FloatBuffer data$1) { data$1.put(u); data$1.put(v); data$1.put(nx); data$1.put(ny); data$1.put(nz); data$1.put(x); data$1.put(y); data$1.put(z); } private final boolean liftedTree1$1() { 
/* 167 */     try { if (commonBuffer() == 0) {
/* 168 */         dataBuffer_$eq(BufferUtils.createIntBuffer(3538944));
/*     */         
/* 170 */         commonBuffer_$eq(GL15.glGenBuffers());
/*     */         
/* 172 */         FloatBuffer data = BufferUtils.createFloatBuffer(14155776); scala.runtime.RichInt$.MODULE$
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
/* 184 */           .until$extension0(scala.Predef$.MODULE$.intWrapper(0), 48).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$liftedTree1$1$1(data));
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
/* 234 */         data.rewind();
/*     */ 
/*     */         
/* 237 */         GL15.glBindBuffer(34962, commonBuffer());
/* 238 */         GL15.glBufferData(34962, data, 35044);
/*     */       }
/*     */        }
/*     */     
/*     */     catch (OutOfMemoryError outOfMemoryError)
/*     */     
/* 244 */     { HologramRendererFallback$.MODULE$.text_$eq("Not enough memory");
/* 245 */       failed_$eq(true); }  return false; }
/*     */   public final class HologramRenderer$$anonfun$liftedTree1$1$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final FloatBuffer data$1;
/*     */     public final void apply(int x) { apply$mcVI$sp(x); } public HologramRenderer$$anonfun$liftedTree1$1$1(FloatBuffer data$1) {} public void apply$mcVI$sp(int x) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), 48).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1(this, x)); } public final class HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int x$1; public final void apply(int z) { apply$mcVI$sp(z); } public HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1(HologramRenderer$$anonfun$liftedTree1$1$1 $outer, int x$1) {} public void apply$mcVI$sp(int z) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), 32).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(this, z)); } public final class HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/* 251 */         public static final long serialVersionUID = 0L; private final int z$1; public final void apply(int y) { apply$mcVI$sp(y); } public HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1 $outer, int z$1) {} public void apply$mcVI$sp(int y) { HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 1, 0, 0, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 1, 1, 0, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 1, 1, 1, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 1, 0, 1, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 0, 0, 0, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 0, 1, 0, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 0, 1, 1, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 0, 0, 1, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 1, 1, 0, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 1, 1, 1, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 0, 0, 1, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 0, 0, 0, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 1, 1, 0, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 1, 1, 1, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 0, 0, 1, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 0, 0, 0, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 0, 0, 0, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 0, 1, 0, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 1, 1, 1, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 1, 0, 1, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 1, 0, 0, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 1, 1, 0, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 0, 1, 1, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 0, 0, 1, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1); } } } } private void validate(int glBuffer) { if (li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().needsRendering()) {
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
/* 271 */       li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().visibleQuads_$eq(0);
/* 272 */       IntRef index = IntRef.create(0);
/* 273 */       dataBuffer().position(1769472); scala.runtime.RichInt$.MODULE$
/* 274 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), 48).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$validate$1(index));
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
/* 323 */       GL15.glBindBuffer(34962, glBuffer);
/* 324 */       if (li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().visibleQuads() > 0) {
/*     */         
/* 326 */         dataBuffer().flip();
/*     */ 
/*     */         
/* 329 */         GL15.glBufferData(34962, dataBuffer(), 35048);
/*     */       }
/*     */       else {
/*     */         
/* 333 */         GL15.glBufferData(34962, 0L, 35048);
/*     */       } 
/*     */ 
/*     */       
/* 337 */       dataBuffer().clear();
/*     */       
/* 339 */       li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().needsRendering_$eq(false);
/*     */     }  } public final int li$cil$oc$client$renderer$tileentity$HologramRenderer$$value$1(int hx, int hy, int hz) { return (hx >= 0 && hy >= 0 && hz >= 0 && hx < 48 && hy < 32 && hz < 48) ? li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().getColor(hx, hy, hz) : 0; }
/*     */   public final boolean li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(int hx, int hy, int hz) {
/*     */     return (li$cil$oc$client$renderer$tileentity$HologramRenderer$$value$1(hx, hy, hz) != 0);
/*     */   }
/* 344 */   private void publish(int glBuffer) { GL15.glBindBuffer(34962, commonBuffer());
/* 345 */     GL11.glEnableClientState(32884);
/* 346 */     GL11.glEnableClientState(32888);
/* 347 */     GL11.glEnableClientState(32885);
/* 348 */     GL11.glInterleavedArrays(10795, 0, 0L);
/*     */     
/* 350 */     GL15.glBindBuffer(34962, glBuffer);
/* 351 */     GL11.glEnableClientState(32886);
/* 352 */     GL11.glColorPointer(3, 5121, 4, 0L);
/*     */     
/* 354 */     GL15.glBindBuffer(34963, glBuffer);
/* 355 */     GL11.glDrawElements(7, li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().visibleQuads() * 4, 5125, 7077888L); } public final void li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1(int index, int color) { dataBuffer().put(index); dataBuffer().put(index + 1); dataBuffer().put(index + 2); dataBuffer().put(index + 3); dataBuffer().put(index, color); dataBuffer().put(index + 1, color); dataBuffer().put(index + 2, color); dataBuffer().put(index + 3, color); Hologram hologram = li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram(); hologram.visibleQuads_$eq(hologram.visibleQuads() + 1); } public final class HologramRenderer$$anonfun$validate$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final IntRef index$1; public final void apply(int hx) { apply$mcVI$sp(hx); } public HologramRenderer$$anonfun$validate$1(IntRef index$1) {} public void apply$mcVI$sp(int hx) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), 48).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3(this, hx)); } public final class HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int hx$1; public final void apply(int hz) { apply$mcVI$sp(hz); } public HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3(HologramRenderer$$anonfun$validate$1 $outer, int hx$1) {} public void apply$mcVI$sp(int hz) { scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), 32).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4(this, hz)); }
/*     */       public final class HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */         public static final long serialVersionUID = 0L; private final int hz$1;
/*     */         public final void apply(int hy) { apply$mcVI$sp(hy); }
/*     */         public HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4(HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3 $outer, int hz$1) {}
/*     */         public void apply$mcVI$sp(int hy) { if (HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy, this.hz$1)) { int color = HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().colors()[HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$value$1(this.$outer.hx$1, hy, this.hz$1) - 1]; if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy, this.hz$1 + 1)) HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);  (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4; if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy, this.hz$1 - 1)) HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);  (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4; if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1 + 1, hy, this.hz$1)) HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);  (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4; if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1 - 1, hy, this.hz$1)) HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);  (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4; if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy + 1, this.hz$1)) HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);  (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4; if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy - 1, this.hz$1)) HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);  (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4; } else { (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 24; }  } } } }
/* 363 */   public int call() { int glBuffer = GL15.glGenBuffers();
/*     */ 
/*     */     
/* 366 */     li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().needsRendering_$eq(true);
/*     */     
/* 368 */     return glBuffer; }
/*     */ 
/*     */   
/*     */   public void onRemoval(RemovalNotification e) {
/* 372 */     int glBuffer = BoxesRunTime.unboxToInt(e.getValue());
/* 373 */     GL15.glDeleteBuffers(glBuffer);
/* 374 */     dataBuffer().clear();
/*     */   }
/*     */   @SubscribeEvent
/*     */   public void onTick(TickEvent.ClientTickEvent e) {
/* 378 */     cache().cleanUp();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\HologramRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */