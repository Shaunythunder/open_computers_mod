/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.Disassembler;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class DisassemblerRenderer$ extends TileEntitySpecialRenderer {
/*    */   private DisassemblerRenderer$() {
/* 12 */     MODULE$ = this;
/*    */   } public static final DisassemblerRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 14 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 16 */     Disassembler disassembler = (Disassembler)tileEntity;
/* 17 */     if (disassembler.isActive()) {
/* 18 */       GL11.glPushAttrib(1048575);
/*    */       
/* 20 */       li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 21 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/*    */       
/* 23 */       GL11.glPushMatrix();
/*    */       
/* 25 */       GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/* 26 */       GL11.glScaled(1.0025D, -1.0025D, 1.0025D);
/* 27 */       GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
/*    */       
/* 29 */       func_147499_a(TextureMap.field_110575_b);
/* 30 */       Tessellator t = Tessellator.field_78398_a;
/* 31 */       t.func_78382_b();
/*    */       
/* 33 */       IIcon topOn = li.cil.oc.client.Textures$Disassembler$.MODULE$.iconTopOn();
/* 34 */       t.func_78374_a(0.0D, 0.0D, 1.0D, topOn.func_94209_e(), topOn.func_94210_h());
/* 35 */       t.func_78374_a(1.0D, 0.0D, 1.0D, topOn.func_94212_f(), topOn.func_94210_h());
/* 36 */       t.func_78374_a(1.0D, 0.0D, 0.0D, topOn.func_94212_f(), topOn.func_94206_g());
/* 37 */       t.func_78374_a(0.0D, 0.0D, 0.0D, topOn.func_94209_e(), topOn.func_94206_g());
/*    */       
/* 39 */       IIcon sideOn = li.cil.oc.client.Textures$Disassembler$.MODULE$.iconSideOn();
/* 40 */       t.func_78374_a(1.0D, 1.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 41 */       t.func_78374_a(0.0D, 1.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 42 */       t.func_78374_a(0.0D, 0.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 43 */       t.func_78374_a(1.0D, 0.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 45 */       t.func_78374_a(0.0D, 1.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 46 */       t.func_78374_a(1.0D, 1.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 47 */       t.func_78374_a(1.0D, 0.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 48 */       t.func_78374_a(0.0D, 0.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 50 */       t.func_78374_a(1.0D, 1.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 51 */       t.func_78374_a(1.0D, 1.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 52 */       t.func_78374_a(1.0D, 0.0D, 0.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 53 */       t.func_78374_a(1.0D, 0.0D, 1.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 55 */       t.func_78374_a(0.0D, 1.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94210_h());
/* 56 */       t.func_78374_a(0.0D, 1.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94210_h());
/* 57 */       t.func_78374_a(0.0D, 0.0D, 1.0D, sideOn.func_94212_f(), sideOn.func_94206_g());
/* 58 */       t.func_78374_a(0.0D, 0.0D, 0.0D, sideOn.func_94209_e(), sideOn.func_94206_g());
/*    */       
/* 60 */       t.func_78381_a();
/*    */       
/* 62 */       li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */       
/* 64 */       GL11.glPopMatrix();
/* 65 */       GL11.glPopAttrib();
/*    */     } 
/*    */     
/* 68 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\DisassemblerRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */