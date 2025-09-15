/*    */ package li.cil.oc.client.renderer.block;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ 
/*    */ public final class Hologram$ {
/*    */   public static final Hologram$ MODULE$;
/*    */   
/*    */   public void render(Block block, int metadata, int x, int y, int z, RenderBlocks renderer) {
/*  9 */     renderer.func_147782_a(0.25D, 0.0D, 0.25D, 0.75D, 0.1875D, 0.75D);
/* 10 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 12 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/* 13 */     renderer.field_147837_f = true;
/*    */ 
/*    */     
/* 16 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 0.125D, 0.4375D, 1.0D);
/* 17 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 19 */     renderer.func_147782_a(0.875D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D);
/* 20 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 22 */     renderer.func_147782_a(0.125D, 0.0D, 0.0D, 0.875D, 0.4375D, 0.125D);
/* 23 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 25 */     renderer.func_147782_a(0.125D, 0.0D, 0.875D, 0.875D, 0.4375D, 1.0D);
/* 26 */     renderer.func_147784_q(block, x, y, z);
/*    */ 
/*    */     
/* 29 */     renderer.func_147782_a(0.125D, 0.125D, 0.125D, 0.25D, 0.3125D, 0.875D);
/* 30 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 32 */     renderer.func_147782_a(0.75D, 0.125D, 0.125D, 0.875D, 0.3125D, 0.875D);
/* 33 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 35 */     renderer.func_147782_a(0.25D, 0.125D, 0.125D, 0.75D, 0.3125D, 0.25D);
/* 36 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 38 */     renderer.func_147782_a(0.25D, 0.125D, 0.75D, 0.75D, 0.3125D, 0.875D);
/* 39 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 41 */     renderer.field_147837_f = previousRenderAllFaces;
/*    */   }
/*    */   
/*    */   public void render(Block block, int metadata, RenderBlocks renderer) {
/* 45 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/* 46 */     renderer.field_147837_f = true;
/*    */ 
/*    */     
/* 49 */     renderer.func_147782_a(0.25D, 0.0D, 0.25D, 0.75D, 0.1875D, 0.75D);
/* 50 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/*    */     
/* 52 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D);
/* 53 */     BlockRenderer$.MODULE$.renderFaceYNeg(block, metadata, renderer);
/* 54 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 55 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 56 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 57 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*    */ 
/*    */     
/* 60 */     renderer.func_147782_a(0.125D, 0.1875D, 0.125D, 0.25D, 0.3125D, 0.875D);
/* 61 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 62 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/*    */     
/* 64 */     renderer.func_147782_a(0.75D, 0.1875D, 0.125D, 0.875D, 0.3125D, 0.875D);
/* 65 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 66 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/*    */     
/* 68 */     renderer.func_147782_a(0.25D, 0.1875D, 0.125D, 0.75D, 0.3125D, 0.25D);
/* 69 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 70 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/*    */     
/* 72 */     renderer.func_147782_a(0.25D, 0.1875D, 0.75D, 0.75D, 0.3125D, 0.875D);
/* 73 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 74 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*    */ 
/*    */     
/* 77 */     renderer.func_147782_a(0.0D, 0.1875D, 0.0D, 0.125D, 0.4375D, 1.0D);
/* 78 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 79 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/*    */     
/* 81 */     renderer.func_147782_a(0.875D, 0.1875D, 0.0D, 1.0D, 0.4375D, 1.0D);
/* 82 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 83 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/*    */     
/* 85 */     renderer.func_147782_a(0.125D, 0.1875D, 0.0D, 0.875D, 0.4375D, 0.125D);
/* 86 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 87 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/*    */     
/* 89 */     renderer.func_147782_a(0.125D, 0.1875D, 0.875D, 0.875D, 0.4375D, 1.0D);
/* 90 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 91 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*    */     
/* 93 */     renderer.field_147837_f = previousRenderAllFaces;
/*    */   } private Hologram$() {
/* 95 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Hologram$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */