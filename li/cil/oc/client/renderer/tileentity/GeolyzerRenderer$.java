/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class GeolyzerRenderer$ extends TileEntitySpecialRenderer {
/*    */   private GeolyzerRenderer$() {
/* 11 */     MODULE$ = this;
/*    */   } public static final GeolyzerRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 13 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 15 */     GL11.glPushAttrib(1048575);
/*    */     
/* 17 */     li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 18 */     li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 19 */     li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha(1.0F);
/*    */     
/* 21 */     GL11.glPushMatrix();
/*    */     
/* 23 */     GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/* 24 */     GL11.glScaled(1.0025D, -1.0025D, 1.0025D);
/* 25 */     GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/*    */     
/* 27 */     func_147499_a(TextureMap.field_110575_b);
/* 28 */     Tessellator t = Tessellator.field_78398_a;
/* 29 */     t.func_78382_b();
/*    */     
/* 31 */     IIcon topOn = li.cil.oc.client.Textures$Geolyzer$.MODULE$.iconTopOn();
/* 32 */     t.func_78374_a(0.0D, 0.0D, 1.0D, topOn.func_94209_e(), topOn.func_94210_h());
/* 33 */     t.func_78374_a(1.0D, 0.0D, 1.0D, topOn.func_94212_f(), topOn.func_94210_h());
/* 34 */     t.func_78374_a(1.0D, 0.0D, 0.0D, topOn.func_94212_f(), topOn.func_94206_g());
/* 35 */     t.func_78374_a(0.0D, 0.0D, 0.0D, topOn.func_94209_e(), topOn.func_94206_g());
/*    */     
/* 37 */     t.func_78381_a();
/*    */     
/* 39 */     li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */     
/* 41 */     GL11.glPopMatrix();
/* 42 */     GL11.glPopAttrib();
/*    */     
/* 44 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\GeolyzerRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */