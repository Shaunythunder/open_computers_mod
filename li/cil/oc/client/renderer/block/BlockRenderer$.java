/*     */ package li.cil.oc.client.renderer.block;
/*     */ 
/*     */ 
/*     */ @ThreadSafeISBRH(perThread = false)
/*     */ public final class BlockRenderer$ implements ISimpleBlockRenderingHandler {
/*     */   public static final BlockRenderer$ MODULE$;
/*     */   private final ThreadLocal<BlockRenderer.PatchedRenderBlocks> patchedRenderBlocksThreadLocal;
/*     */   
/*     */   public int getRenderId() {
/*     */     return li.cil.oc.Settings$.MODULE$.blockRenderId();
/*     */   }
/*     */   
/*     */   public boolean shouldRender3DInInventory(int modelID) {
/*     */     return true;
/*     */   }
/*     */   
/*  17 */   private BlockRenderer$() { MODULE$ = this;
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
/* 140 */     this.patchedRenderBlocksThreadLocal = new BlockRenderer$$anon$1(); } public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks realRenderer) { Integer integer; RenderBlocks renderer = patchedRenderer(realRenderer, block); Tessellator tessellator = Tessellator.field_78398_a; GL11.glPushMatrix(); Block block1 = block; if (block1 instanceof li.cil.oc.common.block.Assembler) { GL11.glTranslatef(-0.5F, -0.5F, -0.5F); tessellator.func_78382_b(); Assembler$.MODULE$.render(block, metadata, renderer); integer = BoxesRunTime.boxToInteger(tessellator.func_78381_a()); } else if (block1 instanceof li.cil.oc.common.block.Hologram) { GL11.glTranslatef(-0.5F, -0.5F, -0.5F); tessellator.func_78382_b(); Hologram$.MODULE$.render(block, metadata, renderer); integer = BoxesRunTime.boxToInteger(tessellator.func_78381_a()); } else if (block1 instanceof li.cil.oc.common.block.Printer) { GL11.glTranslatef(-0.5F, -0.5F, -0.5F); tessellator.func_78382_b(); Printer$.MODULE$.render(block, metadata, renderer); integer = BoxesRunTime.boxToInteger(tessellator.func_78381_a()); } else { boolean bool; if (block1 instanceof li.cil.oc.common.block.RobotProxy) { bool = true; } else if (block1 instanceof li.cil.oc.common.block.RobotAfterimage) { bool = true; } else { bool = false; }  if (bool) { GL11.glScalef(1.5F, 1.5F, 1.5F); GL11.glTranslatef(-0.5F, -0.4F, -0.5F); li.cil.oc.client.renderer.tileentity.RobotRenderer$.MODULE$.renderChassis(li.cil.oc.client.renderer.tileentity.RobotRenderer$.MODULE$.renderChassis$default$1(), li.cil.oc.client.renderer.tileentity.RobotRenderer$.MODULE$.renderChassis$default$2(), li.cil.oc.client.renderer.tileentity.RobotRenderer$.MODULE$.renderChassis$default$3()); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else if (block1 instanceof li.cil.oc.common.block.NetSplitter) { GL11.glTranslatef(-0.5F, -0.5F, -0.5F); tessellator.func_78382_b(); NetSplitter$.MODULE$.render(block, metadata, renderer); integer = BoxesRunTime.boxToInteger(tessellator.func_78381_a()); } else if (block1 instanceof li.cil.oc.common.block.Transposer) { GL11.glTranslatef(-0.5F, -0.5F, -0.5F); tessellator.func_78382_b(); Transposer$.MODULE$.render(block, metadata, renderer); integer = BoxesRunTime.boxToInteger(tessellator.func_78381_a()); } else { Block block2 = block; if (block2 instanceof SimpleBlock) { SimpleBlock simpleBlock = (SimpleBlock)block2; simpleBlock.setBlockBoundsForItemRender(metadata); simpleBlock.preItemRender(metadata); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { block.func_149683_g(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }  renderer.func_147775_a(block); GL11.glTranslatef(-0.5F, -0.5F, -0.5F); tessellator.func_78382_b(); renderFaceYNeg(block, metadata, renderer); renderFaceYPos(block, metadata, renderer); renderFaceZNeg(block, metadata, renderer); renderFaceZPos(block, metadata, renderer); renderFaceXNeg(block, metadata, renderer); renderFaceXPos(block, metadata, renderer); integer = BoxesRunTime.boxToInteger(tessellator.func_78381_a()); }  }  GL11.glPopMatrix(); } public ThreadLocal<BlockRenderer.PatchedRenderBlocks> patchedRenderBlocksThreadLocal() { return this.patchedRenderBlocksThreadLocal; } public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks realRenderer) { boolean bool; RenderBlocks renderer = patchedRenderer(realRenderer, block); TileEntity tileEntity = world.func_147438_o(x, y, z); if (tileEntity instanceof Assembler) { Assembler assembler = (Assembler)tileEntity; Assembler$.MODULE$.render(assembler.block(), assembler.func_145832_p(), x, y, z, renderer); bool = true; } else if (tileEntity instanceof li.cil.oc.common.tileentity.Cable) { Cable$.MODULE$.render(world, x, y, z, block, renderer); bool = true; } else if (tileEntity instanceof Hologram) { Hologram hologram = (Hologram)tileEntity; Hologram$.MODULE$.render(hologram.block(), hologram.func_145832_p(), x, y, z, renderer); bool = true; } else if (tileEntity instanceof Keyboard) { Keyboard keyboard = (Keyboard)tileEntity; boolean result = Keyboard$.MODULE$.render(keyboard, x, y, z, block, renderer); bool = result; } else if (tileEntity instanceof Print) { Print print = (Print)tileEntity; Print$.MODULE$.render(print.data(), print.state(), print.facing(), x, y, z, block, renderer); bool = true; } else if (tileEntity instanceof li.cil.oc.common.tileentity.Printer) { Printer$.MODULE$.render(block, x, y, z, renderer); bool = true; } else if (tileEntity instanceof Rack) { Rack rack = (Rack)tileEntity; Rack$.MODULE$.render(rack, x, y, z, (Rack)block, renderer); bool = true; } else if (tileEntity instanceof NetSplitter) { NetSplitter netSplitter = (NetSplitter)tileEntity; NetSplitter$.MODULE$.render((boolean[])scala.Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).map((Function1)new BlockRenderer$$anonfun$renderWorldBlock$1(netSplitter), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.Boolean())), block, x, y, z, renderer); bool = true; } else if (tileEntity instanceof li.cil.oc.common.tileentity.Transposer) { Transposer$.MODULE$.render(block, x, y, z, renderer); bool = true; } else { boolean result = renderer.func_147784_q(block, x, y, z); bool = result; }  return bool; } public final class BlockRenderer$$anonfun$renderWorldBlock$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/* 141 */     public static final long serialVersionUID = 0L; private final NetSplitter x9$1; public final boolean apply(ForgeDirection side) { return this.x9$1.isSideOpen(side); } public BlockRenderer$$anonfun$renderWorldBlock$1(NetSplitter x9$1) {} } private boolean needsFlipping(Block block) { return (block instanceof li.cil.oc.common.block.Hologram || block instanceof li.cil.oc.common.block.Printer || block instanceof li.cil.oc.common.block.Print || block instanceof li.cil.oc.common.block.NetSplitter || block instanceof li.cil.oc.common.block.Transposer); } public final class BlockRenderer$$anon$1 extends ThreadLocal<BlockRenderer.PatchedRenderBlocks> { public BlockRenderer.PatchedRenderBlocks initialValue() { return new BlockRenderer.PatchedRenderBlocks(); }
/*     */      }
/*     */ 
/*     */   
/*     */   public RenderBlocks patchedRenderer(RenderBlocks renderer, Block block) {
/* 146 */     BlockRenderer.PatchedRenderBlocks patchedRenderBlocks = patchedRenderBlocksThreadLocal().get();
/* 147 */     patchedRenderBlocks.field_147845_a = renderer.field_147845_a;
/* 148 */     patchedRenderBlocks.field_147840_d = renderer.field_147840_d;
/* 149 */     patchedRenderBlocks.field_147842_e = renderer.field_147842_e;
/* 150 */     patchedRenderBlocks.field_147837_f = renderer.field_147837_f;
/* 151 */     patchedRenderBlocks.field_147844_c = renderer.field_147844_c;
/* 152 */     patchedRenderBlocks.field_147838_g = renderer.field_147838_g;
/* 153 */     patchedRenderBlocks.field_147859_h = renderer.field_147859_h;
/* 154 */     patchedRenderBlocks.field_147861_i = renderer.field_147861_i;
/* 155 */     patchedRenderBlocks.field_147855_j = renderer.field_147855_j;
/* 156 */     patchedRenderBlocks.field_147857_k = renderer.field_147857_k;
/* 157 */     patchedRenderBlocks.field_147851_l = renderer.field_147851_l;
/* 158 */     patchedRenderBlocks.field_147853_m = renderer.field_147853_m;
/* 159 */     patchedRenderBlocks.field_147847_n = renderer.field_147847_n;
/* 160 */     patchedRenderBlocks.field_147849_o = renderer.field_147849_o;
/* 161 */     patchedRenderBlocks.field_147875_q = renderer.field_147875_q;
/* 162 */     patchedRenderBlocks.field_147873_r = renderer.field_147873_r;
/* 163 */     patchedRenderBlocks.field_147871_s = renderer.field_147871_s;
/* 164 */     patchedRenderBlocks.field_147869_t = renderer.field_147869_t;
/* 165 */     patchedRenderBlocks.field_147867_u = renderer.field_147867_u;
/* 166 */     patchedRenderBlocks.field_147865_v = renderer.field_147865_v;
/* 167 */     return needsFlipping(block) ? patchedRenderBlocks : 
/*     */       
/* 169 */       renderer;
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
/*     */   public void renderFaceXPos(Block block, int metadata, RenderBlocks renderer) {
/* 186 */     Tessellator.field_78398_a.func_78375_b(1.0F, 0.0F, 0.0F);
/* 187 */     renderer.func_147764_f(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, ForgeDirection.EAST.ordinal(), metadata));
/*     */   }
/*     */   
/*     */   public void renderFaceXNeg(Block block, int metadata, RenderBlocks renderer) {
/* 191 */     Tessellator.field_78398_a.func_78375_b(-1.0F, 0.0F, 0.0F);
/* 192 */     renderer.func_147798_e(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, ForgeDirection.WEST.ordinal(), metadata));
/*     */   }
/*     */   
/*     */   public void renderFaceYPos(Block block, int metadata, RenderBlocks renderer) {
/* 196 */     Tessellator.field_78398_a.func_78375_b(0.0F, 1.0F, 0.0F);
/* 197 */     renderer.func_147806_b(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, ForgeDirection.UP.ordinal(), metadata));
/*     */   }
/*     */   
/*     */   public void renderFaceYNeg(Block block, int metadata, RenderBlocks renderer) {
/* 201 */     Tessellator.field_78398_a.func_78375_b(0.0F, -1.0F, 0.0F);
/* 202 */     renderer.func_147768_a(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, ForgeDirection.DOWN.ordinal(), metadata));
/*     */   }
/*     */   
/*     */   public void renderFaceZPos(Block block, int metadata, RenderBlocks renderer) {
/* 206 */     Tessellator.field_78398_a.func_78375_b(0.0F, 0.0F, 1.0F);
/* 207 */     renderer.func_147734_d(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, ForgeDirection.SOUTH.ordinal(), metadata));
/*     */   }
/*     */   
/*     */   public void renderFaceZNeg(Block block, int metadata, RenderBlocks renderer) {
/* 211 */     Tessellator.field_78398_a.func_78375_b(0.0F, 0.0F, -1.0F);
/* 212 */     renderer.func_147761_c(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, ForgeDirection.NORTH.ordinal(), metadata));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\BlockRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */