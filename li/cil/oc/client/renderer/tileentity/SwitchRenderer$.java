/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.traits.SwitchLike;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class SwitchRenderer$ extends TileEntitySpecialRenderer {
/*    */   private SwitchRenderer$() {
/* 12 */     MODULE$ = this;
/*    */   } public static final SwitchRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 14 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 16 */     SwitchLike switch = (SwitchLike)tileEntity;
/* 17 */     double activity = scala.math.package$.MODULE$.max(0.0D, true - (System.currentTimeMillis() - switch.lastMessage()) / 1000.0D);
/* 18 */     if (activity > false) {
/* 19 */       GL11.glPushAttrib(1048575);
/*    */       
/* 21 */       li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 22 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 23 */       li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha((float)activity);
/*    */       
/* 25 */       GL11.glPushMatrix();
/*    */       
/* 27 */       GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/* 28 */       GL11.glScaled(1.0025D, -1.0025D, 1.0025D);
/* 29 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/*    */       
/* 31 */       func_147499_a(TextureMap.field_110575_b);
/* 32 */       Tessellator t = Tessellator.field_78398_a;
/* 33 */       t.func_78382_b();
/*    */       
/* 35 */       IIcon sideActivity = li.cil.oc.client.Textures$Switch$.MODULE$.iconSideActivity();
/* 36 */       t.func_78374_a(1.0D, 1.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 37 */       t.func_78374_a(0.0D, 1.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 38 */       t.func_78374_a(0.0D, 0.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 39 */       t.func_78374_a(1.0D, 0.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       
/* 41 */       t.func_78374_a(0.0D, 1.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 42 */       t.func_78374_a(1.0D, 1.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 43 */       t.func_78374_a(1.0D, 0.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 44 */       t.func_78374_a(0.0D, 0.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       
/* 46 */       t.func_78374_a(1.0D, 1.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 47 */       t.func_78374_a(1.0D, 1.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 48 */       t.func_78374_a(1.0D, 0.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 49 */       t.func_78374_a(1.0D, 0.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       
/* 51 */       t.func_78374_a(0.0D, 1.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 52 */       t.func_78374_a(0.0D, 1.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 53 */       t.func_78374_a(0.0D, 0.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 54 */       t.func_78374_a(0.0D, 0.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       
/* 56 */       t.func_78381_a();
/*    */       
/* 58 */       li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */       
/* 60 */       GL11.glPopMatrix();
/* 61 */       GL11.glPopAttrib();
/*    */     } 
/*    */     
/* 64 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\SwitchRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */