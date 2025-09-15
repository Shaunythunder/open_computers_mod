/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.Adapter;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class AdapterRenderer$ extends TileEntitySpecialRenderer {
/*    */   private AdapterRenderer$() {
/* 13 */     MODULE$ = this;
/*    */   } public static final AdapterRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 15 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 17 */     Adapter adapter = (Adapter)tileEntity;
/* 18 */     if (scala.Predef$.MODULE$.booleanArrayOps(adapter.openSides()).contains(BoxesRunTime.boxToBoolean(true))) {
/* 19 */       GL11.glPushAttrib(1048575);
/*    */       
/* 21 */       li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 22 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
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
/* 34 */       IIcon sideActivity = li.cil.oc.client.Textures$Adapter$.MODULE$.iconOn();
/*    */       
/* 36 */       if (adapter.isSideOpen(ForgeDirection.DOWN)) {
/* 37 */         t.func_78374_a(0.0D, 1.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 38 */         t.func_78374_a(1.0D, 1.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/* 39 */         t.func_78374_a(1.0D, 1.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 40 */         t.func_78374_a(0.0D, 1.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/*    */       } 
/*    */       
/* 43 */       if (adapter.isSideOpen(ForgeDirection.UP)) {
/* 44 */         t.func_78374_a(0.0D, 0.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 45 */         t.func_78374_a(0.0D, 0.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 46 */         t.func_78374_a(1.0D, 0.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/* 47 */         t.func_78374_a(1.0D, 0.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/*    */       } 
/*    */       
/* 50 */       if (adapter.isSideOpen(ForgeDirection.NORTH)) {
/* 51 */         t.func_78374_a(1.0D, 1.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 52 */         t.func_78374_a(0.0D, 1.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 53 */         t.func_78374_a(0.0D, 0.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 54 */         t.func_78374_a(1.0D, 0.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       } 
/*    */       
/* 57 */       if (adapter.isSideOpen(ForgeDirection.SOUTH)) {
/* 58 */         t.func_78374_a(0.0D, 1.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 59 */         t.func_78374_a(1.0D, 1.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 60 */         t.func_78374_a(1.0D, 0.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 61 */         t.func_78374_a(0.0D, 0.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       } 
/*    */       
/* 64 */       if (adapter.isSideOpen(ForgeDirection.WEST)) {
/* 65 */         t.func_78374_a(0.0D, 1.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 66 */         t.func_78374_a(0.0D, 1.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 67 */         t.func_78374_a(0.0D, 0.0D, 1.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 68 */         t.func_78374_a(0.0D, 0.0D, 0.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       } 
/*    */       
/* 71 */       if (adapter.isSideOpen(ForgeDirection.EAST)) {
/* 72 */         t.func_78374_a(1.0D, 1.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94210_h());
/* 73 */         t.func_78374_a(1.0D, 1.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94210_h());
/* 74 */         t.func_78374_a(1.0D, 0.0D, 0.0D, sideActivity.func_94212_f(), sideActivity.func_94206_g());
/* 75 */         t.func_78374_a(1.0D, 0.0D, 1.0D, sideActivity.func_94209_e(), sideActivity.func_94206_g());
/*    */       } 
/*    */       
/* 78 */       t.func_78381_a();
/*    */       
/* 80 */       li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */       
/* 82 */       GL11.glPopMatrix();
/* 83 */       GL11.glPopAttrib();
/*    */     } 
/*    */     
/* 86 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\AdapterRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */