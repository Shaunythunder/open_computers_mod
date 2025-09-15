/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ 
/*    */ import li.cil.oc.api.event.RackMountableRenderEvent;
/*    */ import li.cil.oc.common.tileentity.Rack;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class RackRenderer$ extends TileEntitySpecialRenderer {
/*    */   public static final RackRenderer$ MODULE$;
/*    */   
/* 12 */   private RackRenderer$() { MODULE$ = this; } private final float vOffset; private final float vSize; private final float vOffset() {
/* 13 */     return 0.125F; } private final float vSize() {
/* 14 */     return 0.1875F;
/*    */   }
/*    */   public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 17 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 19 */     Rack rack = (Rack)tileEntity;
/* 20 */     GL11.glPushAttrib(1048575);
/*    */     
/* 22 */     GL11.glPushMatrix();
/*    */     
/* 24 */     GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*    */     
/* 26 */     ForgeDirection forgeDirection = rack.yaw();
/* 27 */     if (ForgeDirection.WEST.equals(forgeDirection)) { GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 28 */     else if (ForgeDirection.NORTH.equals(forgeDirection)) { GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 29 */     else if (ForgeDirection.EAST.equals(forgeDirection)) { GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 30 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */ 
/*    */     
/* 33 */     GL11.glTranslated(-0.5D, 0.5D, 0.4425D);
/* 34 */     GL11.glScalef(1.0F, -1.0F, 1.0F); scala.runtime.RichInt$.MODULE$
/*    */ 
/*    */       
/* 37 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), rack.func_70302_i_()).foreach$mVc$sp((Function1)new RackRenderer$$anonfun$renderTileEntityAt$1(rack));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     GL11.glPopMatrix();
/* 53 */     GL11.glPopAttrib();
/*    */     
/* 55 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */   
/*    */   public final class RackRenderer$$anonfun$renderTileEntityAt$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Rack rack$1;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public RackRenderer$$anonfun$renderTileEntityAt$1(Rack rack$1) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       if (this.rack$1.func_70301_a(i) != null) {
/*    */         GL11.glPushMatrix();
/*    */         GL11.glPushAttrib(1048575);
/*    */         float v0 = 0.125F + i * 0.1875F;
/*    */         float v1 = 0.125F + (i + 1) * 0.1875F;
/*    */         RackMountableRenderEvent.TileEntity event = new RackMountableRenderEvent.TileEntity((Rack)this.rack$1, i, this.rack$1.lastData()[i], v0, v1);
/*    */         MinecraftForge.EVENT_BUS.post((Event)event);
/*    */         GL11.glPopAttrib();
/*    */         GL11.glPopMatrix();
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\RackRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */