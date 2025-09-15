/*    */ package li.cil.oc.client.renderer.block;
/*    */ 
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.client.renderer.RenderBlocks;
/*    */ import net.minecraft.client.renderer.RenderHelper;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ public final class Assembler$ {
/*    */   public static final Assembler$ MODULE$;
/*    */   
/*    */   public void render(Block block, int metadata, int x, int y, int z, RenderBlocks renderer) {
/* 12 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/* 13 */     renderer.field_147837_f = true;
/*    */ 
/*    */     
/* 16 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D);
/* 17 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 19 */     renderer.func_147782_a(0.125D, 0.4375D, 0.125D, 0.875D, 0.5625D, 0.875D);
/* 20 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 22 */     renderer.func_147782_a(0.0D, 0.5625D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 23 */     renderer.func_147784_q(block, x, y, z);
/*    */     
/* 25 */     renderer.field_147837_f = previousRenderAllFaces;
/*    */   }
/*    */ 
/*    */   
/*    */   public void render(Block block, int metadata, RenderBlocks renderer) {
/* 30 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D);
/* 31 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 32 */     BlockRenderer$.MODULE$.renderFaceYNeg(block, metadata, renderer);
/* 33 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 34 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 35 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 36 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*    */ 
/*    */     
/* 39 */     boolean previousRenderAllFaces = renderer.field_147837_f;
/* 40 */     renderer.field_147837_f = true;
/* 41 */     renderer.func_147782_a(0.125D, 0.4375D, 0.125D, 0.875D, 0.5625D, 0.875D);
/* 42 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 43 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 44 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 45 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/* 46 */     renderer.field_147837_f = previousRenderAllFaces;
/*    */ 
/*    */     
/* 49 */     renderer.func_147782_a(0.0D, 0.5625D, 0.0D, 1.0D, 1.0D, 1.0D);
/* 50 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/* 51 */     BlockRenderer$.MODULE$.renderFaceYNeg(block, metadata, renderer);
/* 52 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 53 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 54 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 55 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*    */     
/* 57 */     GL11.glPushAttrib(1048575);
/* 58 */     li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 59 */     RenderHelper.func_74518_a();
/*    */     
/* 61 */     renderer.func_147757_a(li.cil.oc.client.Textures$Assembler$.MODULE$.iconTopOn());
/* 62 */     renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 1.05D, 1.0D);
/* 63 */     BlockRenderer$.MODULE$.renderFaceYPos(block, metadata, renderer);
/*    */     
/* 65 */     renderer.func_147757_a(li.cil.oc.client.Textures$Assembler$.MODULE$.iconSideOn());
/* 66 */     renderer.func_147782_a(-0.005D, 0.0D, 0.0D, 1.005D, 1.0D, 1.0D);
/* 67 */     BlockRenderer$.MODULE$.renderFaceXPos(block, metadata, renderer);
/* 68 */     BlockRenderer$.MODULE$.renderFaceXNeg(block, metadata, renderer);
/* 69 */     renderer.func_147782_a(0.0D, 0.0D, -0.005D, 1.0D, 1.0D, 1.005D);
/* 70 */     BlockRenderer$.MODULE$.renderFaceZPos(block, metadata, renderer);
/* 71 */     BlockRenderer$.MODULE$.renderFaceZNeg(block, metadata, renderer);
/*    */     
/* 73 */     renderer.func_147771_a();
/* 74 */     RenderHelper.func_74519_b();
/* 75 */     GL11.glPopAttrib();
/*    */   } private Assembler$() {
/* 77 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\block\Assembler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */