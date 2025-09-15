/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.Case;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class CaseRenderer$ extends TileEntitySpecialRenderer {
/*    */   private CaseRenderer$() {
/* 13 */     MODULE$ = this;
/*    */   } public static final CaseRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 15 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 17 */     Case computer = (Case)tileEntity;
/* 18 */     GL11.glPushAttrib(1048575);
/*    */     
/* 20 */     li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 21 */     li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 22 */     li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha(1.0F);
/*    */     
/* 24 */     GL11.glPushMatrix();
/*    */     
/* 26 */     GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*    */     
/* 28 */     ForgeDirection forgeDirection = computer.yaw();
/* 29 */     if (ForgeDirection.WEST.equals(forgeDirection)) { GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 30 */     else if (ForgeDirection.NORTH.equals(forgeDirection)) { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 31 */     else if (ForgeDirection.EAST.equals(forgeDirection)) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 32 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */ 
/*    */     
/* 35 */     GL11.glTranslated(-0.5D, 0.5D, 0.505D);
/* 36 */     GL11.glScalef(1.0F, -1.0F, 1.0F);
/*    */     
/* 38 */     if (computer.isRunning()) {
/* 39 */       renderFrontOverlay(li.cil.oc.client.Textures$.MODULE$.blockCaseFrontOn());
/* 40 */       if (System.currentTimeMillis() - computer.lastFileSystemAccess() < 400L && (computer.world()).field_73012_v.nextDouble() > 0.1D) {
/* 41 */         renderFrontOverlay(li.cil.oc.client.Textures$.MODULE$.blockCaseFrontActivity());
/*    */       }
/*    */     }
/* 44 */     else if (computer.hasErrored() && RenderUtil$.MODULE$.shouldShowErrorLight(computer.hashCode())) {
/* 45 */       renderFrontOverlay(li.cil.oc.client.Textures$.MODULE$.blockCaseFrontError());
/*    */     } 
/*    */     
/* 48 */     li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */     
/* 50 */     GL11.glPopMatrix();
/* 51 */     GL11.glPopAttrib();
/*    */     
/* 53 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */   
/*    */   private void renderFrontOverlay(ResourceLocation texture) {
/* 57 */     func_147499_a(texture);
/* 58 */     Tessellator t = Tessellator.field_78398_a;
/* 59 */     t.func_78382_b();
/* 60 */     t.func_78374_a(0.0D, 1.0D, 0.0D, 0.0D, 1.0D);
/* 61 */     t.func_78374_a(1.0D, 1.0D, 0.0D, 1.0D, 1.0D);
/* 62 */     t.func_78374_a(1.0D, 0.0D, 0.0D, 1.0D, 0.0D);
/* 63 */     t.func_78374_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 64 */     t.func_78381_a();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\CaseRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */