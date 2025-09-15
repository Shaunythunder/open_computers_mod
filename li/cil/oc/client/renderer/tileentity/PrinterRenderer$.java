/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.Printer;
/*    */ import net.minecraft.client.renderer.OpenGlHelper;
/*    */ import net.minecraft.client.renderer.entity.RenderItem;
/*    */ import net.minecraft.entity.item.EntityItem;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ public final class PrinterRenderer$ extends TileEntitySpecialRenderer {
/*    */   private PrinterRenderer$() {
/* 13 */     MODULE$ = this;
/*    */   } public static final PrinterRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 15 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 17 */     Printer printer = (Printer)tileEntity;
/* 18 */     if (printer.data().stateOff().size() > 0) {
/* 19 */       ItemStack stack = printer.data().createItemStack();
/*    */       
/* 21 */       GL11.glPushAttrib(1048575);
/* 22 */       GL11.glPushMatrix();
/*    */       
/* 24 */       GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*    */       
/* 26 */       GL11.glRotated((System.currentTimeMillis() % 20000L) / 20000.0D * 'Ũ', 0.0D, 1.0D, 0.0D);
/*    */       
/* 28 */       int brightness = printer.world().func_72802_i(printer.x(), printer.y(), printer.z(), 0);
/* 29 */       OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, (brightness % 65536), (brightness / 65536));
/*    */ 
/*    */       
/* 32 */       EntityItem entity = new EntityItem(printer.world(), 0.0D, 0.0D, 0.0D, stack);
/* 33 */       entity.field_70290_d = 0.0F;
/* 34 */       RenderItem.field_82407_g = true;
/* 35 */       RenderManager.field_78727_a.func_147940_a((Entity)entity, 0.0D, -0.1D, 0.0D, 0.0F, 0.0F);
/* 36 */       RenderItem.field_82407_g = false;
/*    */       
/* 38 */       GL11.glPopMatrix();
/* 39 */       GL11.glPopAttrib();
/*    */     } 
/*    */     
/* 42 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\PrinterRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */