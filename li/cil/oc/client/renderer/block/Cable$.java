/*     */ package li.cil.oc.client.renderer.block;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.RenderBlocks;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function2;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public final class Cable$ {
/*     */   public static final Cable$ MODULE$;
/*     */   private final double li$cil$oc$client$renderer$block$Cable$$baseSize;
/*     */   private final double li$cil$oc$client$renderer$block$Cable$$plugSize;
/*     */   
/*     */   public double li$cil$oc$client$renderer$block$Cable$$baseSize() {
/*  16 */     return this.li$cil$oc$client$renderer$block$Cable$$baseSize;
/*     */   } public double li$cil$oc$client$renderer$block$Cable$$plugSize() {
/*  18 */     return this.li$cil$oc$client$renderer$block$Cable$$plugSize;
/*     */   }
/*     */   
/*     */   public void render(IBlockAccess world, int x, int y, int z, Block block, RenderBlocks renderer) {
/*  22 */     AxisAlignedBB bounds = AxisAlignedBB.func_72330_a(-li$cil$oc$client$renderer$block$Cable$$baseSize(), -li$cil$oc$client$renderer$block$Cable$$baseSize(), -li$cil$oc$client$renderer$block$Cable$$baseSize(), li$cil$oc$client$renderer$block$Cable$$baseSize(), li$cil$oc$client$renderer$block$Cable$$baseSize(), li$cil$oc$client$renderer$block$Cable$$baseSize());
/*  23 */     bounds.func_72317_d(0.5D, 0.5D, 0.5D);
/*  24 */     renderer.func_147782_a(bounds.field_72340_a, bounds.field_72338_b, bounds.field_72339_c, bounds.field_72336_d, bounds.field_72337_e, bounds.field_72334_f);
/*  25 */     renderer.func_147784_q(block, x, y, z);
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
/*  38 */     int mask = li.cil.oc.common.block.Cable$.MODULE$.neighbors(world, x, y, z);
/*  39 */     scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new Cable$$anonfun$render$1(world, x, y, z, block, renderer, bounds, mask));
/*  40 */   } public final void li$cil$oc$client$renderer$block$Cable$$renderPart$1(ForgeDirection side, double size, Function2 boundSetter, int x$1, int y$1, int z$1, Block block$1, RenderBlocks renderer$1, AxisAlignedBB bounds$1) { bounds$1.func_72324_b(-size, -size, -size, size, size, size); bounds$1.func_72317_d(side.offsetX * 0.25D, side.offsetY * 0.25D, side.offsetZ * 0.25D); boundSetter.apply(bounds$1, side); bounds$1.func_72317_d(0.5D, 0.5D, 0.5D); renderer$1.func_147782_a(bounds$1.field_72340_a, bounds$1.field_72338_b, bounds$1.field_72339_c, bounds$1.field_72336_d, bounds$1.field_72337_e, bounds$1.field_72334_f); renderer$1.field_147849_o = false; renderer$1.func_147784_q(block$1, x$1, y$1, z$1); } public final class Cable$$anonfun$render$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IBlockAccess world$1; private final int x$1; private final int y$1; private final int z$1; private final Block block$1; private final RenderBlocks renderer$1; private final AxisAlignedBB bounds$1; private final int mask$1; public Cable$$anonfun$render$1(IBlockAccess world$1, int x$1, int y$1, int z$1, Block block$1, RenderBlocks renderer$1, AxisAlignedBB bounds$1, int mask$1) {} public final class Cable$$anonfun$render$1$$anonfun$apply$1 extends AbstractFunction2<AxisAlignedBB, ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(AxisAlignedBB bounds, ForgeDirection side) { Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$setConnectedBounds(bounds, side); } public Cable$$anonfun$render$1$$anonfun$apply$1(Cable$$anonfun$render$1 $outer) {} } public final class Cable$$anonfun$render$1$$anonfun$apply$2 extends AbstractFunction2<AxisAlignedBB, ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(AxisAlignedBB bounds, ForgeDirection side) { Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$setPlugBounds(bounds, side); } public Cable$$anonfun$render$1$$anonfun$apply$2(Cable$$anonfun$render$1 $outer) {} } public final void apply(ForgeDirection side) { if ((side.flag & this.mask$1) != 0) {
/*  41 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$renderPart$1(side, Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$baseSize(), (Function2)new Cable$$anonfun$render$1$$anonfun$apply$1(this), this.x$1, this.y$1, this.z$1, this.block$1, this.renderer$1, this.bounds$1);
/*     */       }
/*  43 */       this.renderer$1.field_147840_d = li.cil.oc.client.Textures$Cable$.MODULE$.iconCap();
/*  44 */       if ((side.flag & this.mask$1) != 0 && !Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$isCable(this.world$1, this.x$1 + side.offsetX, this.y$1 + side.offsetY, this.z$1 + side.offsetZ)) {
/*  45 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$utilForTrickingTheRendererIntoUsingUnclampedTextureCoordinates(this.renderer$1, 1);
/*  46 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$renderPart$1(side, Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$plugSize(), (Function2)new Cable$$anonfun$render$1$$anonfun$apply$2(this), this.x$1, this.y$1, this.z$1, this.block$1, this.renderer$1, this.bounds$1);
/*  47 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$utilForTrickingTheRendererIntoUsingUnclampedTextureCoordinates(this.renderer$1, 0);
/*     */       }
/*  49 */       else if (((side.getOpposite()).flag & this.mask$1) == this.mask$1 || this.mask$1 == 0) {
/*  50 */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$renderPart$1(side, Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$baseSize(), (Function2)new Cable$$anonfun$render$1$$anonfun$apply$3(this), this.x$1, this.y$1, this.z$1, this.block$1, this.renderer$1, this.bounds$1);
/*     */       } 
/*  52 */       this.renderer$1.func_147771_a(); }
/*     */      public final class Cable$$anonfun$render$1$$anonfun$apply$3 extends AbstractFunction2<AxisAlignedBB, ForgeDirection, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final void apply(AxisAlignedBB bounds, ForgeDirection side) {
/*     */         Cable$.MODULE$.li$cil$oc$client$renderer$block$Cable$$setUnconnectedBounds(bounds, side);
/*     */       } public Cable$$anonfun$render$1$$anonfun$apply$3(Cable$$anonfun$render$1 $outer) {} } } public void render(ItemStack stack, RenderBlocks renderer) {
/*  57 */     Block block = ((ItemBlock)stack.func_77973_b()).field_150939_a;
/*  58 */     int metadata = 0;
/*     */     
/*  60 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/*  61 */     renderer.field_147837_f = true;
/*     */     
/*  63 */     renderer.func_147782_a(0.375D, 0.1875D, 0.375D, 0.625D, 0.8125D, 0.625D);
/*  64 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/*  65 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/*  66 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*  67 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/*     */     
/*  69 */     renderer.field_147840_d = li.cil.oc.client.Textures$Cable$.MODULE$.iconCap();
/*  70 */     renderer.func_147782_a(0.375D, 0.125D, 0.375D, 0.625D, 0.1875D, 0.625D);
/*  71 */     BlockRenderer$.MODULE$.renderFaceYNeg(block, metadata, renderer);
/*  72 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/*  73 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/*  74 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*  75 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/*  76 */     renderer.func_147782_a(0.375D, 0.8125D, 0.375D, 0.625D, 0.875D, 0.625D);
/*  77 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/*  78 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/*  79 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/*  80 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*  81 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/*  82 */     renderer.func_147771_a();
/*     */     
/*  84 */     renderer.field_147837_f = previousRenderAllFaces;
/*     */   }
/*     */   
/*     */   public boolean li$cil$oc$client$renderer$block$Cable$$isCable(IBlockAccess world, int x, int y, int z) {
/*  88 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  89 */     return (tileEntity instanceof li.cil.oc.common.tileentity.Cable || (li.cil.oc.integration.Mods$.MODULE$.ForgeMultipart().isAvailable() && isCableFMP(tileEntity)));
/*     */   }
/*     */   
/*     */   private boolean isCableFMP(TileEntity tileEntity) {
/*  93 */     return tileEntity instanceof codechicken.multipart.TileMultipart;
/*     */   }
/*     */   
/*     */   public void li$cil$oc$client$renderer$block$Cable$$utilForTrickingTheRendererIntoUsingUnclampedTextureCoordinates(RenderBlocks renderer, int value) {
/*  97 */     renderer.field_147865_v = value;
/*  98 */     renderer.field_147875_q = value;
/*  99 */     renderer.field_147869_t = value;
/* 100 */     renderer.field_147871_s = value;
/* 101 */     renderer.field_147867_u = value;
/* 102 */     renderer.field_147873_r = value;
/*     */   }
/*     */   
/*     */   public void li$cil$oc$client$renderer$block$Cable$$setConnectedBounds(AxisAlignedBB bounds, ForgeDirection side) {
/* 106 */     bounds.field_72340_a = scala.math.package$.MODULE$.min(bounds.field_72340_a, side.offsetX * 0.5D);
/* 107 */     bounds.field_72336_d = scala.math.package$.MODULE$.max(bounds.field_72336_d, side.offsetX * 0.5D);
/* 108 */     bounds.field_72338_b = scala.math.package$.MODULE$.min(bounds.field_72338_b, side.offsetY * 0.5D);
/* 109 */     bounds.field_72337_e = scala.math.package$.MODULE$.max(bounds.field_72337_e, side.offsetY * 0.5D);
/* 110 */     bounds.field_72339_c = scala.math.package$.MODULE$.min(bounds.field_72339_c, side.offsetZ * 0.5D);
/* 111 */     bounds.field_72334_f = scala.math.package$.MODULE$.max(bounds.field_72334_f, side.offsetZ * 0.5D);
/*     */   }
/*     */   
/*     */   public void li$cil$oc$client$renderer$block$Cable$$setPlugBounds(AxisAlignedBB bounds, ForgeDirection side) {
/* 115 */     bounds.field_72340_a = scala.math.package$.MODULE$.max(scala.math.package$.MODULE$.min(bounds.field_72340_a + side.offsetX * 10.0D / 16.0D, 0.4375D), -0.5001D);
/* 116 */     bounds.field_72336_d = scala.math.package$.MODULE$.min(scala.math.package$.MODULE$.max(bounds.field_72336_d + side.offsetX * 10.0D / 16.0D, -0.4375D), 0.5001D);
/* 117 */     bounds.field_72338_b = scala.math.package$.MODULE$.max(scala.math.package$.MODULE$.min(bounds.field_72338_b + side.offsetY * 10.0D / 16.0D, 0.4375D), -0.5001D);
/* 118 */     bounds.field_72337_e = scala.math.package$.MODULE$.min(scala.math.package$.MODULE$.max(bounds.field_72337_e + side.offsetY * 10.0D / 16.0D, -0.4375D), 0.5001D);
/* 119 */     bounds.field_72339_c = scala.math.package$.MODULE$.max(scala.math.package$.MODULE$.min(bounds.field_72339_c + side.offsetZ * 10.0D / 16.0D, 0.4375D), -0.5001D);
/* 120 */     bounds.field_72334_f = scala.math.package$.MODULE$.min(scala.math.package$.MODULE$.max(bounds.field_72334_f + side.offsetZ * 10.0D / 16.0D, -0.4375D), 0.5001D);
/*     */   }
/*     */   
/*     */   public void li$cil$oc$client$renderer$block$Cable$$setUnconnectedBounds(AxisAlignedBB bounds, ForgeDirection side) {
/* 124 */     bounds.field_72340_a = scala.math.package$.MODULE$.max(bounds.field_72340_a, -li$cil$oc$client$renderer$block$Cable$$plugSize());
/* 125 */     bounds.field_72336_d = scala.math.package$.MODULE$.min(bounds.field_72336_d, li$cil$oc$client$renderer$block$Cable$$plugSize());
/* 126 */     bounds.field_72338_b = scala.math.package$.MODULE$.max(bounds.field_72338_b, -li$cil$oc$client$renderer$block$Cable$$plugSize());
/* 127 */     bounds.field_72337_e = scala.math.package$.MODULE$.min(bounds.field_72337_e, li$cil$oc$client$renderer$block$Cable$$plugSize());
/* 128 */     bounds.field_72339_c = scala.math.package$.MODULE$.max(bounds.field_72339_c, -li$cil$oc$client$renderer$block$Cable$$plugSize());
/* 129 */     bounds.field_72334_f = scala.math.package$.MODULE$.min(bounds.field_72334_f, li$cil$oc$client$renderer$block$Cable$$plugSize());
/*     */   } private Cable$() {
/* 131 */     MODULE$ = this;
/*     */     this.li$cil$oc$client$renderer$block$Cable$$baseSize = 0.125D;
/*     */     this.li$cil$oc$client$renderer$block$Cable$$plugSize = 0.1874D;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Cable$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */