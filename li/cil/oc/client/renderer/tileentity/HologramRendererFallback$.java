/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ 
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ 
/*    */ public final class HologramRendererFallback$ extends TileEntitySpecialRenderer {
/*    */   public static final HologramRendererFallback$ MODULE$;
/*    */   
/*  9 */   private HologramRendererFallback$() { MODULE$ = this;
/* 10 */     this.text = "Requires OpenGL 1.5"; } private String text; public String text() { return this.text; } public void text_$eq(String x$1) { this.text = x$1; }
/*    */   
/*    */   public void func_147500_a(TileEntity te, double x, double y, double z, float f) {
/* 13 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 15 */     FontRenderer fontRenderer = (Minecraft.func_71410_x()).field_71466_p;
/*    */     
/* 17 */     GL11.glPushMatrix();
/* 18 */     GL11.glTranslated(x + 0.5D, y + 0.75D, z + 0.5D);
/*    */     
/* 20 */     GL11.glScalef(0.0078125F, -0.0078125F, 0.0078125F);
/* 21 */     GL11.glDisable(2884);
/* 22 */     fontRenderer.func_78276_b(text(), -fontRenderer.func_78256_a(text()) / 2, 0, -1);
/*    */     
/* 24 */     GL11.glPopMatrix();
/*    */     
/* 26 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\HologramRendererFallback$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */