/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.DiskDrive;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.client.renderer.entity.RenderItem;
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class DiskDriveRenderer$ extends TileEntitySpecialRenderer {
/*    */   private DiskDriveRenderer$() {
/* 16 */     MODULE$ = this;
/*    */   } public static final DiskDriveRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 18 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 20 */     DiskDrive drive = (DiskDrive)tileEntity;
/* 21 */     GL11.glPushAttrib(1048575);
/*    */     
/* 23 */     GL11.glPushMatrix();
/*    */     
/* 25 */     GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*    */     
/* 27 */     ForgeDirection forgeDirection = drive.yaw();
/* 28 */     if (ForgeDirection.WEST.equals(forgeDirection)) { GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 29 */     else if (ForgeDirection.NORTH.equals(forgeDirection)) { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 30 */     else if (ForgeDirection.EAST.equals(forgeDirection)) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 31 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */ 
/*    */     
/* 34 */     Option option = drive.items()[0];
/* 35 */     if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x();
/* 36 */       GL11.glPushMatrix();
/* 37 */       GL11.glTranslatef(0.0F, 0.21875F, 0.5625F);
/* 38 */       GL11.glRotatef(90.0F, -1.0F, 0.0F, 0.0F);
/*    */       
/* 40 */       int brightness = drive.world().func_72802_i(drive.x() + (drive.facing()).offsetX, drive.y() + (drive.facing()).offsetY, drive.z() + (drive.facing()).offsetZ, 0);
/* 41 */       OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, (brightness % 65536), (brightness / 65536));
/*    */ 
/*    */       
/* 44 */       EntityItem entity = new EntityItem(drive.world(), 0.0D, 0.0D, 0.0D, stack);
/* 45 */       entity.field_70290_d = 0.0F;
/* 46 */       RenderItem.field_82407_g = true;
/* 47 */       RenderManager.field_78727_a.func_147940_a((Entity)entity, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
/* 48 */       RenderItem.field_82407_g = false;
/* 49 */       GL11.glPopMatrix(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 50 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */ 
/*    */     
/* 53 */     if (System.currentTimeMillis() - drive.lastAccess() < 400L && (drive.world()).field_73012_v.nextDouble() > 0.1D) {
/* 54 */       GL11.glTranslated(-0.5D, 0.5D, 0.505D);
/* 55 */       GL11.glScalef(1.0F, -1.0F, 1.0F);
/*    */       
/* 57 */       li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 58 */       li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 59 */       li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha(1.0F);
/*    */       
/* 61 */       func_147499_a(li.cil.oc.client.Textures$.MODULE$.blockDiskDriveFrontActivity());
/* 62 */       Tessellator t = Tessellator.field_78398_a;
/* 63 */       t.func_78382_b();
/* 64 */       t.func_78374_a(0.0D, 1.0D, 0.0D, 0.0D, 1.0D);
/* 65 */       t.func_78374_a(1.0D, 1.0D, 0.0D, 1.0D, 1.0D);
/* 66 */       t.func_78374_a(1.0D, 0.0D, 0.0D, 1.0D, 0.0D);
/* 67 */       t.func_78374_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/* 68 */       t.func_78381_a();
/*    */       
/* 70 */       li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */     } 
/*    */     
/* 73 */     GL11.glPopMatrix();
/* 74 */     GL11.glPopAttrib();
/*    */     
/* 76 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\DiskDriveRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */