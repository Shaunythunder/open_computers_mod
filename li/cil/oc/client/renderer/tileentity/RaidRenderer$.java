/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ public final class RaidRenderer$ extends TileEntitySpecialRenderer { public static final RaidRenderer$ MODULE$; private final float u1; private final float fs; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) { li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString()); Raid raid = (Raid)tileEntity; GL11.glPushAttrib(1048575); li.cil.oc.util.RenderState$.MODULE$.disableLighting(); li.cil.oc.util.RenderState$.MODULE$.makeItBlend(); GL11.glPushMatrix(); GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D); ForgeDirection forgeDirection = raid.yaw(); if (ForgeDirection.WEST.equals(forgeDirection)) {
/*    */       GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } else if (ForgeDirection.NORTH.equals(forgeDirection)) {
/*    */       GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } else if (ForgeDirection.EAST.equals(forgeDirection)) {
/*    */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } else {
/*    */       BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     }  GL11.glTranslated(-0.5D, 0.5D, 0.505D); GL11.glScalef(1.0F, -1.0F, 1.0F); scala.runtime.RichInt$.MODULE$.until$extension0(scala.Predef$.MODULE$.intWrapper(0), raid.func_70302_i_()).foreach$mVc$sp((Function1)new RaidRenderer$$anonfun$renderTileEntityAt$1(raid)); li.cil.oc.util.RenderState$.MODULE$.enableLighting(); GL11.glPopMatrix();
/*    */     GL11.glPopAttrib();
/* 12 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString()); } private RaidRenderer$() { MODULE$ = this;
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
/*    */     
/* 56 */     this.u1 = 0.125F;
/* 57 */     this.fs = 0.25F; } private float fs() { return this.fs; } public final class RaidRenderer$$anonfun$renderTileEntityAt$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final Raid raid$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public RaidRenderer$$anonfun$renderTileEntityAt$1(Raid raid$1) {} public void apply$mcVI$sp(int slot) { if (this.raid$1.presence()[slot]) { if (System.currentTimeMillis() - this.raid$1.lastAccess() < 400L && (this.raid$1.world()).field_73012_v.nextDouble() > 0.1D && slot == this.raid$1.lastAccess() % this.raid$1.func_70302_i_()) { RaidRenderer$.MODULE$.protected$bindTexture(RaidRenderer$.MODULE$, li.cil.oc.client.Textures$.MODULE$.blockRaidFrontActivity()); RaidRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RaidRenderer$$renderSlot(slot); }  } else { RaidRenderer$.MODULE$.protected$bindTexture(RaidRenderer$.MODULE$, li.cil.oc.client.Textures$.MODULE$.blockRaidFrontError()); RaidRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RaidRenderer$$renderSlot(slot); }  } }
/*    */   private float u1() { return this.u1; }
/* 60 */   public void li$cil$oc$client$renderer$tileentity$RaidRenderer$$renderSlot(int slot) { float l = u1() + slot * fs();
/* 61 */     float h = u1() + (slot + 1) * fs();
/* 62 */     Tessellator t = Tessellator.field_78398_a;
/* 63 */     t.func_78382_b();
/* 64 */     t.func_78374_a(l, 1.0D, 0.0D, l, 1.0D);
/* 65 */     t.func_78374_a(h, 1.0D, 0.0D, h, 1.0D);
/* 66 */     t.func_78374_a(h, 0.0D, 0.0D, h, 0.0D);
/* 67 */     t.func_78374_a(l, 0.0D, 0.0D, l, 0.0D);
/* 68 */     t.func_78381_a(); }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\RaidRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */