/*     */ package li.cil.oc.client.renderer.block;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.RenderBlocks;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ public final class NetSplitter$ {
/*     */   public void render(boolean[] openSides, Block block, int x, int y, int z, RenderBlocks renderer) {
/*   9 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/*  10 */     renderer.field_147837_f = true;
/*     */ 
/*     */     
/*  13 */     renderer.func_147782_a(0.0D, 0.0D, 0.3125D, 0.3125D, 0.3125D, 0.6875D);
/*  14 */     renderer.func_147784_q(block, x, y, z);
/*  15 */     renderer.func_147782_a(0.6875D, 0.0D, 0.3125D, 1.0D, 0.3125D, 0.6875D);
/*  16 */     renderer.func_147784_q(block, x, y, z);
/*  17 */     renderer.func_147782_a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.3125D, 0.3125D);
/*  18 */     renderer.func_147784_q(block, x, y, z);
/*  19 */     renderer.func_147782_a(0.3125D, 0.0D, 0.6875D, 0.6875D, 0.3125D, 1.0D);
/*  20 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  22 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 0.3125D, 1.0D, 0.3125D);
/*  23 */     renderer.func_147784_q(block, x, y, z);
/*  24 */     renderer.func_147782_a(0.6875D, 0.0D, 0.0D, 1.0D, 1.0D, 0.3125D);
/*  25 */     renderer.func_147784_q(block, x, y, z);
/*  26 */     renderer.func_147782_a(0.0D, 0.0D, 0.6875D, 0.3125D, 1.0D, 1.0D);
/*  27 */     renderer.func_147784_q(block, x, y, z);
/*  28 */     renderer.func_147782_a(0.6875D, 0.0D, 0.6875D, 1.0D, 1.0D, 1.0D);
/*  29 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  31 */     renderer.func_147782_a(0.0D, 0.6875D, 0.3125D, 0.3125D, 1.0D, 0.6875D);
/*  32 */     renderer.func_147784_q(block, x, y, z);
/*  33 */     renderer.func_147782_a(0.6875D, 0.6875D, 0.3125D, 1.0D, 1.0D, 0.6875D);
/*  34 */     renderer.func_147784_q(block, x, y, z);
/*  35 */     renderer.func_147782_a(0.3125D, 0.6875D, 0.0D, 0.6875D, 1.0D, 0.3125D);
/*  36 */     renderer.func_147784_q(block, x, y, z);
/*  37 */     renderer.func_147782_a(0.3125D, 0.6875D, 0.6875D, 0.6875D, 1.0D, 1.0D);
/*  38 */     renderer.func_147784_q(block, x, y, z);
/*     */ 
/*     */     
/*  41 */     boolean down = openSides[ForgeDirection.DOWN.ordinal()];
/*  42 */     renderer.func_147782_a(0.3125D, down ? 0.0D : 0.125D, 0.3125D, 0.6875D, 0.3125D, 0.6875D);
/*  43 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  45 */     boolean up = openSides[ForgeDirection.UP.ordinal()];
/*  46 */     renderer.func_147782_a(0.3125D, 0.6875D, 0.3125D, 0.6875D, up ? 1.0D : 0.875D, 0.6875D);
/*  47 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  49 */     boolean north = openSides[ForgeDirection.NORTH.ordinal()];
/*  50 */     renderer.func_147782_a(0.3125D, 0.3125D, north ? 0.0D : 0.125D, 0.6875D, 0.6875D, 0.3125D);
/*  51 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  53 */     boolean south = openSides[ForgeDirection.SOUTH.ordinal()];
/*  54 */     renderer.func_147782_a(0.3125D, 0.3125D, 0.6875D, 0.6875D, 0.6875D, south ? 1.0D : 0.875D);
/*  55 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  57 */     boolean west = openSides[ForgeDirection.WEST.ordinal()];
/*  58 */     renderer.func_147782_a(west ? 0.0D : 0.125D, 0.3125D, 0.3125D, 0.3125D, 0.6875D, 0.6875D);
/*  59 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  61 */     boolean east = openSides[ForgeDirection.EAST.ordinal()];
/*  62 */     renderer.func_147782_a(0.6875D, 0.3125D, 0.3125D, east ? 1.0D : 0.875D, 0.6875D, 0.6875D);
/*  63 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  65 */     renderer.field_147837_f = previousRenderAllFaces;
/*     */   }
/*     */   public static final NetSplitter$ MODULE$;
/*     */   
/*     */   public void render(Block block, int metadata, RenderBlocks renderer) {
/*  70 */     renderer.func_147782_a(0.0D, 0.0D, 0.3125D, 0.3125D, 0.3125D, 0.6875D);
/*  71 */     renderAllFaces(block, metadata, renderer);
/*  72 */     renderer.func_147782_a(0.6875D, 0.0D, 0.3125D, 1.0D, 0.3125D, 0.6875D);
/*  73 */     renderAllFaces(block, metadata, renderer);
/*  74 */     renderer.func_147782_a(0.3125D, 0.0D, 0.0D, 0.6875D, 0.3125D, 0.3125D);
/*  75 */     renderAllFaces(block, metadata, renderer);
/*  76 */     renderer.func_147782_a(0.3125D, 0.0D, 0.6875D, 0.6875D, 0.3125D, 1.0D);
/*  77 */     renderAllFaces(block, metadata, renderer);
/*     */     
/*  79 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 0.3125D, 1.0D, 0.3125D);
/*  80 */     renderAllFaces(block, metadata, renderer);
/*  81 */     renderer.func_147782_a(0.6875D, 0.0D, 0.0D, 1.0D, 1.0D, 0.3125D);
/*  82 */     renderAllFaces(block, metadata, renderer);
/*  83 */     renderer.func_147782_a(0.0D, 0.0D, 0.6875D, 0.3125D, 1.0D, 1.0D);
/*  84 */     renderAllFaces(block, metadata, renderer);
/*  85 */     renderer.func_147782_a(0.6875D, 0.0D, 0.6875D, 1.0D, 1.0D, 1.0D);
/*  86 */     renderAllFaces(block, metadata, renderer);
/*     */     
/*  88 */     renderer.func_147782_a(0.0D, 0.6875D, 0.3125D, 0.3125D, 1.0D, 0.6875D);
/*  89 */     renderAllFaces(block, metadata, renderer);
/*  90 */     renderer.func_147782_a(0.6875D, 0.6875D, 0.3125D, 1.0D, 1.0D, 0.6875D);
/*  91 */     renderAllFaces(block, metadata, renderer);
/*  92 */     renderer.func_147782_a(0.3125D, 0.6875D, 0.0D, 0.6875D, 1.0D, 0.3125D);
/*  93 */     renderAllFaces(block, metadata, renderer);
/*  94 */     renderer.func_147782_a(0.3125D, 0.6875D, 0.6875D, 0.6875D, 1.0D, 1.0D);
/*  95 */     renderAllFaces(block, metadata, renderer);
/*     */ 
/*     */     
/*  98 */     renderer.func_147782_a(0.3125D, 0.125D, 0.3125D, 0.6875D, 0.3125D, 0.6875D);
/*  99 */     renderAllFaces(block, metadata, renderer);
/* 100 */     renderer.func_147782_a(0.3125D, 0.6875D, 0.3125D, 0.6875D, 0.875D, 0.6875D);
/* 101 */     renderAllFaces(block, metadata, renderer);
/* 102 */     renderer.func_147782_a(0.3125D, 0.3125D, 0.125D, 0.6875D, 0.6875D, 0.3125D);
/* 103 */     renderAllFaces(block, metadata, renderer);
/* 104 */     renderer.func_147782_a(0.3125D, 0.3125D, 0.6875D, 0.6875D, 0.6875D, 0.875D);
/* 105 */     renderAllFaces(block, metadata, renderer);
/* 106 */     renderer.func_147782_a(0.125D, 0.3125D, 0.3125D, 0.3125D, 0.6875D, 0.6875D);
/* 107 */     renderAllFaces(block, metadata, renderer);
/* 108 */     renderer.func_147782_a(0.6875D, 0.3125D, 0.3125D, 0.875D, 0.6875D, 0.6875D);
/* 109 */     renderAllFaces(block, metadata, renderer);
/*     */   }
/*     */   
/*     */   private void renderAllFaces(Block block, int metadata, RenderBlocks renderer) {
/* 113 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 114 */     BlockRenderer$.MODULE$.renderFaceYNeg(block, metadata, renderer);
/* 115 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 116 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 117 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 118 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*     */   } private NetSplitter$() {
/* 120 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\NetSplitter$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */