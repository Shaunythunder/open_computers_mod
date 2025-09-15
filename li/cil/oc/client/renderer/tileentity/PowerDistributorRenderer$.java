/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.PowerDistributor;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class PowerDistributorRenderer$ extends TileEntitySpecialRenderer {
/*    */   private PowerDistributorRenderer$() {
/* 12 */     MODULE$ = this;
/*    */   } public static final PowerDistributorRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 14 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 16 */     PowerDistributor distributor = (PowerDistributor)tileEntity;
/* 17 */     if (distributor.globalBuffer() > false) {
/* 18 */       GL11.glPushAttrib(1048575);
/*    */       
/* 20 */       li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 21 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 22 */       li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha((float)(distributor.globalBuffer() / distributor.globalBufferSize()));
/*    */       
/* 24 */       GL11.glPushMatrix();
/*    */       
/* 26 */       GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/* 27 */       GL11.glScaled(1.0025D, -1.0025D, 1.0025D);
/* 28 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/*    */       
/* 30 */       func_147499_a(TextureMap.field_110575_b);
/* 31 */       Tessellator t = Tessellator.field_78398_a;
/* 32 */       t.func_78382_b();
/*    */       
/* 34 */       IIcon topOn = li.cil.oc.client.Textures$PowerDistributor$.MODULE$.iconTopOn();
/* 35 */       t.func_78374_a(0.0D, 0.0D, 1.0D, topOn.func_94209_e(), topOn.func_94210_h());
/* 36 */       t.func_78374_a(1.0D, 0.0D, 1.0D, topOn.func_94212_f(), topOn.func_94210_h());
/* 37 */       t.func_78374_a(1.0D, 0.0D, 0.0D, topOn.func_94212_f(), topOn.func_94206_g());
/* 38 */       t.func_78374_a(0.0D, 0.0D, 0.0D, topOn.func_94209_e(), topOn.func_94206_g());
/*    */       
/* 40 */       IIcon sideOn = li.cil.oc.client.Textures$PowerDistributor$.MODULE$.iconSideOn();
/* 41 */       t.func_78374_a(1.0D, 1.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 42 */       t.func_78374_a(0.0D, 1.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 43 */       t.func_78374_a(0.0D, 0.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 44 */       t.func_78374_a(1.0D, 0.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 46 */       t.func_78374_a(0.0D, 1.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 47 */       t.func_78374_a(1.0D, 1.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 48 */       t.func_78374_a(1.0D, 0.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 49 */       t.func_78374_a(0.0D, 0.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 51 */       t.func_78374_a(1.0D, 1.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 52 */       t.func_78374_a(1.0D, 1.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 53 */       t.func_78374_a(1.0D, 0.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 54 */       t.func_78374_a(1.0D, 0.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 56 */       t.func_78374_a(0.0D, 1.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 57 */       t.func_78374_a(0.0D, 1.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 58 */       t.func_78374_a(0.0D, 0.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 59 */       t.func_78374_a(0.0D, 0.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 61 */       t.func_78381_a();
/*    */       
/* 63 */       li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */       
/* 65 */       GL11.glPopMatrix();
/* 66 */       GL11.glPopAttrib();
/*    */     } 
/*    */     
/* 69 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\PowerDistributorRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */