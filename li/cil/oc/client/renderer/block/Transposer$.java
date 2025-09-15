/*     */ package li.cil.oc.client.renderer.block;
/*     */ 
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.client.renderer.RenderBlocks;
/*     */ 
/*     */ public final class Transposer$ {
/*     */   public void render(Block block, int x, int y, int z, RenderBlocks renderer) {
/*   8 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/*   9 */     renderer.field_147837_f = true;
/*     */ 
/*     */     
/*  12 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 0.4375D, 0.4375D, 0.4375D);
/*  13 */     renderer.func_147784_q(block, x, y, z);
/*  14 */     renderer.func_147782_a(0.0D, 0.0D, 0.5625D, 0.4375D, 0.4375D, 1.0D);
/*  15 */     renderer.func_147784_q(block, x, y, z);
/*  16 */     renderer.func_147782_a(0.0D, 0.5625D, 0.0D, 0.4375D, 1.0D, 0.4375D);
/*  17 */     renderer.func_147784_q(block, x, y, z);
/*  18 */     renderer.func_147782_a(0.0D, 0.5625D, 0.5625D, 0.4375D, 1.0D, 1.0D);
/*  19 */     renderer.func_147784_q(block, x, y, z);
/*  20 */     renderer.func_147782_a(0.5625D, 0.0D, 0.0D, 1.0D, 0.4375D, 0.4375D);
/*  21 */     renderer.func_147784_q(block, x, y, z);
/*  22 */     renderer.func_147782_a(0.5625D, 0.0D, 0.5625D, 1.0D, 0.4375D, 1.0D);
/*  23 */     renderer.func_147784_q(block, x, y, z);
/*  24 */     renderer.func_147782_a(0.5625D, 0.5625D, 0.0D, 1.0D, 1.0D, 0.4375D);
/*  25 */     renderer.func_147784_q(block, x, y, z);
/*  26 */     renderer.func_147782_a(0.5625D, 0.5625D, 0.5625D, 1.0D, 1.0D, 1.0D);
/*  27 */     renderer.func_147784_q(block, x, y, z);
/*     */ 
/*     */     
/*  30 */     renderer.func_147782_a(0.0D, 0.0D, 0.4375D, 0.3125D, 0.3125D, 0.5625D);
/*  31 */     renderer.func_147784_q(block, x, y, z);
/*  32 */     renderer.func_147782_a(0.0D, 0.6875D, 0.4375D, 0.3125D, 1.0D, 0.5625D);
/*  33 */     renderer.func_147784_q(block, x, y, z);
/*  34 */     renderer.func_147782_a(0.6875D, 0.0D, 0.4375D, 1.0D, 0.3125D, 0.5625D);
/*  35 */     renderer.func_147784_q(block, x, y, z);
/*  36 */     renderer.func_147782_a(0.6875D, 0.6875D, 0.4375D, 1.0D, 1.0D, 0.5625D);
/*  37 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  39 */     renderer.func_147782_a(0.0D, 0.4375D, 0.0D, 0.3125D, 0.5625D, 0.3125D);
/*  40 */     renderer.func_147784_q(block, x, y, z);
/*  41 */     renderer.func_147782_a(0.0D, 0.4375D, 0.6875D, 0.3125D, 0.5625D, 1.0D);
/*  42 */     renderer.func_147784_q(block, x, y, z);
/*  43 */     renderer.func_147782_a(0.6875D, 0.4375D, 0.0D, 1.0D, 0.5625D, 0.3125D);
/*  44 */     renderer.func_147784_q(block, x, y, z);
/*  45 */     renderer.func_147782_a(0.6875D, 0.4375D, 0.6875D, 1.0D, 0.5625D, 1.0D);
/*  46 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  48 */     renderer.func_147782_a(0.4375D, 0.0D, 0.0D, 0.5625D, 0.3125D, 0.3125D);
/*  49 */     renderer.func_147784_q(block, x, y, z);
/*  50 */     renderer.func_147782_a(0.4375D, 0.0D, 0.6875D, 0.5625D, 0.3125D, 1.0D);
/*  51 */     renderer.func_147784_q(block, x, y, z);
/*  52 */     renderer.func_147782_a(0.4375D, 0.6875D, 0.0D, 0.5625D, 1.0D, 0.3125D);
/*  53 */     renderer.func_147784_q(block, x, y, z);
/*  54 */     renderer.func_147782_a(0.4375D, 0.6875D, 0.6875D, 0.5625D, 1.0D, 1.0D);
/*  55 */     renderer.func_147784_q(block, x, y, z);
/*     */ 
/*     */     
/*  58 */     renderer.func_147782_a(0.0625D, 0.0625D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
/*  59 */     renderer.func_147784_q(block, x, y, z);
/*     */     
/*  61 */     renderer.field_147837_f = previousRenderAllFaces;
/*     */   }
/*     */   public static final Transposer$ MODULE$;
/*     */   
/*     */   public void render(Block block, int metadata, RenderBlocks renderer) {
/*  66 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 0.4375D, 0.4375D, 0.4375D);
/*  67 */     renderAllFaces(block, metadata, renderer);
/*  68 */     renderer.func_147782_a(0.0D, 0.0D, 0.5625D, 0.4375D, 0.4375D, 1.0D);
/*  69 */     renderAllFaces(block, metadata, renderer);
/*  70 */     renderer.func_147782_a(0.0D, 0.5625D, 0.0D, 0.4375D, 1.0D, 0.4375D);
/*  71 */     renderAllFaces(block, metadata, renderer);
/*  72 */     renderer.func_147782_a(0.0D, 0.5625D, 0.5625D, 0.4375D, 1.0D, 1.0D);
/*  73 */     renderAllFaces(block, metadata, renderer);
/*  74 */     renderer.func_147782_a(0.5625D, 0.0D, 0.0D, 1.0D, 0.4375D, 0.4375D);
/*  75 */     renderAllFaces(block, metadata, renderer);
/*  76 */     renderer.func_147782_a(0.5625D, 0.0D, 0.5625D, 1.0D, 0.4375D, 1.0D);
/*  77 */     renderAllFaces(block, metadata, renderer);
/*  78 */     renderer.func_147782_a(0.5625D, 0.5625D, 0.0D, 1.0D, 1.0D, 0.4375D);
/*  79 */     renderAllFaces(block, metadata, renderer);
/*  80 */     renderer.func_147782_a(0.5625D, 0.5625D, 0.5625D, 1.0D, 1.0D, 1.0D);
/*  81 */     renderAllFaces(block, metadata, renderer);
/*     */ 
/*     */     
/*  84 */     renderer.func_147782_a(0.0D, 0.0D, 0.4375D, 0.3125D, 0.3125D, 0.5625D);
/*  85 */     renderAllFaces(block, metadata, renderer);
/*  86 */     renderer.func_147782_a(0.0D, 0.6875D, 0.4375D, 0.3125D, 1.0D, 0.5625D);
/*  87 */     renderAllFaces(block, metadata, renderer);
/*  88 */     renderer.func_147782_a(0.6875D, 0.0D, 0.4375D, 1.0D, 0.3125D, 0.5625D);
/*  89 */     renderAllFaces(block, metadata, renderer);
/*  90 */     renderer.func_147782_a(0.6875D, 0.6875D, 0.4375D, 1.0D, 1.0D, 0.5625D);
/*  91 */     renderAllFaces(block, metadata, renderer);
/*     */     
/*  93 */     renderer.func_147782_a(0.0D, 0.4375D, 0.0D, 0.3125D, 0.5625D, 0.3125D);
/*  94 */     renderAllFaces(block, metadata, renderer);
/*  95 */     renderer.func_147782_a(0.0D, 0.4375D, 0.6875D, 0.3125D, 0.5625D, 1.0D);
/*  96 */     renderAllFaces(block, metadata, renderer);
/*  97 */     renderer.func_147782_a(0.6875D, 0.4375D, 0.0D, 1.0D, 0.5625D, 0.3125D);
/*  98 */     renderAllFaces(block, metadata, renderer);
/*  99 */     renderer.func_147782_a(0.6875D, 0.4375D, 0.6875D, 1.0D, 0.5625D, 1.0D);
/* 100 */     renderAllFaces(block, metadata, renderer);
/*     */     
/* 102 */     renderer.func_147782_a(0.4375D, 0.0D, 0.0D, 0.5625D, 0.3125D, 0.3125D);
/* 103 */     renderAllFaces(block, metadata, renderer);
/* 104 */     renderer.func_147782_a(0.4375D, 0.0D, 0.6875D, 0.5625D, 0.3125D, 1.0D);
/* 105 */     renderAllFaces(block, metadata, renderer);
/* 106 */     renderer.func_147782_a(0.4375D, 0.6875D, 0.0D, 0.5625D, 1.0D, 0.3125D);
/* 107 */     renderAllFaces(block, metadata, renderer);
/* 108 */     renderer.func_147782_a(0.4375D, 0.6875D, 0.6875D, 0.5625D, 1.0D, 1.0D);
/* 109 */     renderAllFaces(block, metadata, renderer);
/*     */ 
/*     */     
/* 112 */     renderer.func_147782_a(0.0625D, 0.0625D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);
/* 113 */     renderAllFaces(block, metadata, renderer);
/*     */   }
/*     */   
/*     */   private void renderAllFaces(Block block, int metadata, RenderBlocks renderer) {
/* 117 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 118 */     BlockRenderer$.MODULE$.renderFaceYNeg(block, metadata, renderer);
/* 119 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 120 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 121 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 122 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*     */   } private Transposer$() {
/* 124 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Transposer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */