/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ 
/*    */ public final class Printer$ {
/*    */   public void render(Block block, int x, int y, int z, RenderBlocks renderer) {
/*  8 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/*  9 */     renderer.field_147837_f = true;
/*    */ 
/*    */     
/* 12 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
/* 13 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 15 */     renderer.func_147782_a(0.0D, 0.5D, 0.0D, 0.1875D, 1.0D, 0.1875D);
/* 16 */     renderer.func_147784_q(block, x, y, z);
/* 17 */     renderer.func_147782_a(0.8125D, 0.5D, 0.0D, 1.0D, 1.0D, 0.1875D);
/* 18 */     renderer.func_147784_q(block, x, y, z);
/* 19 */     renderer.func_147782_a(0.0D, 0.5D, 0.8125D, 0.1875D, 1.0D, 1.0D);
/* 20 */     renderer.func_147784_q(block, x, y, z);
/* 21 */     renderer.func_147782_a(0.8125D, 0.5D, 0.8125D, 1.0D, 1.0D, 1.0D);
/* 22 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 24 */     renderer.func_147782_a(0.1875D, 0.8125D, 0.0D, 0.8125D, 1.0D, 0.1875D);
/* 25 */     renderer.func_147784_q(block, x, y, z);
/* 26 */     renderer.func_147782_a(0.1875D, 0.8125D, 0.8125D, 0.8125D, 1.0D, 1.0D);
/* 27 */     renderer.func_147784_q(block, x, y, z);
/* 28 */     renderer.func_147782_a(0.0D, 0.8125D, 0.1875D, 0.1875D, 1.0D, 0.8125D);
/* 29 */     renderer.func_147784_q(block, x, y, z);
/* 30 */     renderer.func_147782_a(0.8125D, 0.8125D, 0.1875D, 1.0D, 1.0D, 0.8125D);
/* 31 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 33 */     renderer.field_147837_f = previousRenderAllFaces;
/*    */   }
/*    */   public static final Printer$ MODULE$;
/*    */   
/*    */   public void render(Block block, int metadata, RenderBlocks renderer) {
/* 38 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
/* 39 */     renderAllFaces(block, metadata, renderer);
/*    */     
/* 41 */     renderer.func_147782_a(0.0D, 0.5D, 0.0D, 0.1875D, 1.0D, 0.1875D);
/* 42 */     renderAllFaces(block, metadata, renderer);
/* 43 */     renderer.func_147782_a(0.8125D, 0.5D, 0.0D, 1.0D, 1.0D, 0.1875D);
/* 44 */     renderAllFaces(block, metadata, renderer);
/* 45 */     renderer.func_147782_a(0.0D, 0.5D, 0.8125D, 0.1875D, 1.0D, 1.0D);
/* 46 */     renderAllFaces(block, metadata, renderer);
/* 47 */     renderer.func_147782_a(0.8125D, 0.5D, 0.8125D, 1.0D, 1.0D, 1.0D);
/* 48 */     renderAllFaces(block, metadata, renderer);
/*    */     
/* 50 */     renderer.func_147782_a(0.1875D, 0.8125D, 0.0D, 0.8125D, 1.0D, 0.1875D);
/* 51 */     renderAllFaces(block, metadata, renderer);
/* 52 */     renderer.func_147782_a(0.1875D, 0.8125D, 0.8125D, 0.8125D, 1.0D, 1.0D);
/* 53 */     renderAllFaces(block, metadata, renderer);
/* 54 */     renderer.func_147782_a(0.0D, 0.8125D, 0.1875D, 0.1875D, 1.0D, 0.8125D);
/* 55 */     renderAllFaces(block, metadata, renderer);
/* 56 */     renderer.func_147782_a(0.8125D, 0.8125D, 0.1875D, 1.0D, 1.0D, 0.8125D);
/* 57 */     renderAllFaces(block, metadata, renderer);
/*    */   }
/*    */   
/*    */   private void renderAllFaces(Block block, int metadata, RenderBlocks renderer) {
/* 61 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 62 */     BlockRenderer$.MODULE$.renderFaceYNeg(block, metadata, renderer);
/* 63 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 64 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 65 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 66 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*    */   } private Printer$() {
/* 68 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Printer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */