/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.Microcontroller;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class MicrocontrollerRenderer$ extends TileEntitySpecialRenderer {
/*    */   private MicrocontrollerRenderer$() {
/* 13 */     MODULE$ = this;
/*    */   } public static final MicrocontrollerRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 15 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 17 */     Microcontroller mcu = (Microcontroller)tileEntity;
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
/* 28 */     ForgeDirection forgeDirection = mcu.yaw();
/* 29 */     if (ForgeDirection.WEST.equals(forgeDirection)) { GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 30 */     else if (ForgeDirection.NORTH.equals(forgeDirection)) { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 31 */     else if (ForgeDirection.EAST.equals(forgeDirection)) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 32 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */ 
/*    */     
/* 35 */     GL11.glTranslated(-0.5D, 0.5D, 0.505D);
/* 36 */     GL11.glScalef(1.0F, -1.0F, 1.0F);
/*    */     
/* 38 */     func_147499_a(li.cil.oc.client.Textures$.MODULE$.blockMicrocontrollerFrontLight());
/* 39 */     Tessellator t = Tessellator.field_78398_a;
/* 40 */     t.func_78382_b();
/* 41 */     t.func_78374_a(0.0D, 1.0D, 0.0D, 0.0D, 1.0D);
/* 42 */     t.func_78374_a(1.0D, 1.0D, 0.0D, 1.0D, 1.0D);
/* 43 */     t.func_78374_a(1.0D, 0.0D, 0.0D, 1.0D, 0.0D);
/* 44 */     t.func_78374_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 45 */     t.func_78381_a();
/*    */     
/* 47 */     if (mcu.isRunning()) {
/* 48 */       renderFrontOverlay(li.cil.oc.client.Textures$.MODULE$.blockMicrocontrollerFrontOn());
/*    */     }
/* 50 */     else if (mcu.hasErrored() && RenderUtil$.MODULE$.shouldShowErrorLight(mcu.hashCode())) {
/* 51 */       renderFrontOverlay(li.cil.oc.client.Textures$.MODULE$.blockMicrocontrollerFrontError());
/*    */     } 
/*    */     
/* 54 */     li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */     
/* 56 */     GL11.glPopMatrix();
/* 57 */     GL11.glPopAttrib();
/*    */     
/* 59 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */   
/*    */   private void renderFrontOverlay(ResourceLocation texture) {
/* 63 */     func_147499_a(texture);
/* 64 */     Tessellator t = Tessellator.field_78398_a;
/* 65 */     t.func_78382_b();
/* 66 */     t.func_78374_a(0.0D, 1.0D, 0.0D, 0.0D, 1.0D);
/* 67 */     t.func_78374_a(1.0D, 1.0D, 0.0D, 1.0D, 1.0D);
/* 68 */     t.func_78374_a(1.0D, 0.0D, 0.0D, 1.0D, 0.0D);
/* 69 */     t.func_78374_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 70 */     t.func_78381_a();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\MicrocontrollerRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */