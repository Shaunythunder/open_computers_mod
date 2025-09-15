/*    */ package li.cil.oc.util;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.RenderHelper;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import org.lwjgl.opengl.GLContext;
/*    */ 
/*    */ public final class RenderState$ {
/*    */   public static final RenderState$ MODULE$;
/*    */   
/*    */   public boolean arb() {
/* 11 */     return this.arb;
/*    */   } private final boolean arb;
/*    */   public void checkError(String where) {
/* 14 */     int error = GL11.glGetError();
/* 15 */     if (error != 0 && li.cil.oc.Settings$.MODULE$.get().logOpenGLErrors()) {
/* 16 */       li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringBuilder()).append("GL ERROR @ ").append(where).append(": ").append(GLU.gluErrorString(error)).toString());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean compilingDisplayList() {
/* 22 */     int mode = GL11.glGetInteger(2864);
/* 23 */     return (GL11.glGetInteger(2867) != 0) ? ((mode == 4864 || mode == 4865)) : false;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void disableLighting() {
/* 29 */     (Minecraft.func_71410_x()).field_71460_t.func_78483_a(0.0D);
/* 30 */     RenderHelper.func_74518_a();
/*    */   }
/*    */   
/*    */   public void enableLighting() {
/* 34 */     (Minecraft.func_71410_x()).field_71460_t.func_78463_b(0.0D);
/* 35 */     RenderHelper.func_74519_b();
/*    */   }
/*    */   
/*    */   public void makeItBlend() {
/* 39 */     GL11.glEnable(3042);
/* 40 */     GL11.glBlendFunc(770, 771);
/*    */   }
/*    */   
/*    */   public void setBlendAlpha(float alpha) {
/* 44 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, alpha);
/* 45 */     GL11.glBlendFunc(770, 1);
/*    */   } private RenderState$() {
/* 47 */     MODULE$ = this;
/*    */     this.arb = ((GLContext.getCapabilities()).GL_ARB_multitexture && !(GLContext.getCapabilities()).OpenGL13);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\RenderState$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */