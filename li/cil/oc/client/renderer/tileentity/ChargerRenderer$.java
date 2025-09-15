/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.Charger;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class ChargerRenderer$ extends TileEntitySpecialRenderer {
/*    */   private ChargerRenderer$() {
/* 13 */     MODULE$ = this;
/*    */   } public static final ChargerRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 15 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 17 */     Charger charger = (Charger)tileEntity;
/* 18 */     if (charger.chargeSpeed() > false) {
/* 19 */       GL11.glPushAttrib(1048575);
/*    */       
/* 21 */       li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 22 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 23 */       li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha(1.0F);
/*    */       
/* 25 */       GL11.glPushMatrix();
/*    */       
/* 27 */       GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*    */       
/* 29 */       ForgeDirection forgeDirection = charger.yaw();
/* 30 */       if (ForgeDirection.WEST.equals(forgeDirection)) { GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 31 */       else if (ForgeDirection.NORTH.equals(forgeDirection)) { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 32 */       else if (ForgeDirection.EAST.equals(forgeDirection)) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 33 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */ 
/*    */       
/* 36 */       GL11.glTranslatef(-0.5F, 0.5F, 0.5F);
/* 37 */       GL11.glScalef(1.0F, -1.0F, 1.0F);
/*    */       
/* 39 */       Tessellator t = Tessellator.field_78398_a;
/*    */       
/* 41 */       IIcon frontIcon = li.cil.oc.client.Textures$Charger$.MODULE$.iconFrontCharging();
/* 42 */       func_147499_a(TextureMap.field_110575_b);
/* 43 */       t.func_78382_b();
/*    */       
/* 45 */       double inverse = true - charger.chargeSpeed();
/* 46 */       t.func_78374_a(0.0D, 1.0D, 0.005D, frontIcon.func_94209_e(), frontIcon.func_94210_h());
/* 47 */       t.func_78374_a(1.0D, 1.0D, 0.005D, frontIcon.func_94212_f(), frontIcon.func_94210_h());
/* 48 */       t.func_78374_a(1.0D, inverse, 0.005D, frontIcon.func_94212_f(), frontIcon.func_94207_b(inverse * 16));
/* 49 */       t.func_78374_a(0.0D, inverse, 0.005D, frontIcon.func_94209_e(), frontIcon.func_94207_b(inverse * 16));
/*    */       
/* 51 */       if (charger.hasPower()) {
/* 52 */         IIcon sideIcon = li.cil.oc.client.Textures$Charger$.MODULE$.iconSideCharging();
/* 53 */         t.func_78374_a(-0.005D, 1.0D, -1.0D, sideIcon.func_94209_e(), sideIcon.func_94210_h());
/* 54 */         t.func_78374_a(-0.005D, 1.0D, 0.0D, sideIcon.func_94212_f(), sideIcon.func_94210_h());
/* 55 */         t.func_78374_a(-0.005D, 0.0D, 0.0D, sideIcon.func_94212_f(), sideIcon.func_94206_g());
/* 56 */         t.func_78374_a(-0.005D, 0.0D, -1.0D, sideIcon.func_94209_e(), sideIcon.func_94206_g());
/*    */         
/* 58 */         t.func_78374_a(1.0D, 1.0D, -1.005D, sideIcon.func_94209_e(), sideIcon.func_94210_h());
/* 59 */         t.func_78374_a(0.0D, 1.0D, -1.005D, sideIcon.func_94212_f(), sideIcon.func_94210_h());
/* 60 */         t.func_78374_a(0.0D, 0.0D, -1.005D, sideIcon.func_94212_f(), sideIcon.func_94206_g());
/* 61 */         t.func_78374_a(1.0D, 0.0D, -1.005D, sideIcon.func_94209_e(), sideIcon.func_94206_g());
/*    */         
/* 63 */         t.func_78374_a(1.005D, 1.0D, 0.0D, sideIcon.func_94209_e(), sideIcon.func_94210_h());
/* 64 */         t.func_78374_a(1.005D, 1.0D, -1.0D, sideIcon.func_94212_f(), sideIcon.func_94210_h());
/* 65 */         t.func_78374_a(1.005D, 0.0D, -1.0D, sideIcon.func_94212_f(), sideIcon.func_94206_g());
/* 66 */         t.func_78374_a(1.005D, 0.0D, 0.0D, sideIcon.func_94209_e(), sideIcon.func_94206_g());
/*    */       } 
/*    */       
/* 69 */       t.func_78381_a();
/*    */       
/* 71 */       li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */       
/* 73 */       GL11.glPopMatrix();
/* 74 */       GL11.glPopAttrib();
/*    */     } 
/*    */     
/* 77 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\ChargerRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */