/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.common.tileentity.Assembler;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class AssemblerRenderer$ extends TileEntitySpecialRenderer {
/*    */   private AssemblerRenderer$() {
/* 12 */     MODULE$ = this;
/*    */   } public static final AssemblerRenderer$ MODULE$; public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
/* 14 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: entering (aka: wasntme)").toString());
/*    */     
/* 16 */     Assembler assembler = (Assembler)tileEntity;
/*    */     
/* 18 */     GL11.glPushAttrib(1048575);
/*    */     
/* 20 */     li.cil.oc.util.RenderState$.MODULE$.disableLighting();
/* 21 */     li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/* 22 */     li.cil.oc.util.RenderState$.MODULE$.setBlendAlpha(1.0F);
/*    */     
/* 24 */     GL11.glPushMatrix();
/* 25 */     GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
/*    */     
/* 27 */     func_147499_a(TextureMap.field_110575_b);
/* 28 */     Tessellator t = Tessellator.field_78398_a;
/* 29 */     t.func_78382_b();
/*    */ 
/*    */     
/* 32 */     IIcon icon = li.cil.oc.client.Textures$Assembler$.MODULE$.iconTopOn();
/* 33 */     t.func_78374_a(-0.5D, 0.55D, 0.5D, icon.func_94209_e(), icon.func_94210_h());
/* 34 */     t.func_78374_a(0.5D, 0.55D, 0.5D, icon.func_94212_f(), icon.func_94210_h());
/* 35 */     t.func_78374_a(0.5D, 0.55D, -0.5D, icon.func_94212_f(), icon.func_94206_g());
/* 36 */     t.func_78374_a(-0.5D, 0.55D, -0.5D, icon.func_94209_e(), icon.func_94206_g());
/*    */ 
/*    */     
/* 39 */     t.func_78381_a();
/*    */     
/* 41 */     double indent = 0.38D; scala.runtime.RichInt$.MODULE$
/* 42 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), 4).foreach$mVc$sp((Function1)new AssemblerRenderer$$anonfun$renderTileEntityAt$1(assembler, t, indent));
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
/* 66 */     li.cil.oc.util.RenderState$.MODULE$.enableLighting();
/*    */     
/* 68 */     GL11.glPopMatrix();
/* 69 */     GL11.glPopAttrib();
/*    */     
/* 71 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".renderTileEntityAt: leaving").toString());
/*    */   }
/*    */   
/*    */   public final class AssemblerRenderer$$anonfun$renderTileEntityAt$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Assembler assembler$1;
/*    */     private final Tessellator t$1;
/*    */     private final double indent$1;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public AssemblerRenderer$$anonfun$renderTileEntityAt$1(Assembler assembler$1, Tessellator t$1, double indent$1) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       this.t$1.func_78382_b();
/*    */       if (this.assembler$1.isAssembling()) {
/*    */         IIcon iIcon = li.cil.oc.client.Textures$Assembler$.MODULE$.iconSideAssembling();
/*    */         this.t$1.func_78374_a(this.indent$1, 0.5D, -this.indent$1, iIcon.func_94214_a((0.5D - this.indent$1) * 16), iIcon.func_94210_h());
/*    */         this.t$1.func_78374_a(this.indent$1, 0.5D, this.indent$1, iIcon.func_94214_a((0.5D + this.indent$1) * 16), iIcon.func_94210_h());
/*    */         this.t$1.func_78374_a(this.indent$1, -0.5D, this.indent$1, iIcon.func_94214_a((0.5D + this.indent$1) * 16), iIcon.func_94206_g());
/*    */         this.t$1.func_78374_a(this.indent$1, -0.5D, -this.indent$1, iIcon.func_94214_a((0.5D - this.indent$1) * 16), iIcon.func_94206_g());
/*    */       } 
/*    */       IIcon icon = li.cil.oc.client.Textures$Assembler$.MODULE$.iconSideOn();
/*    */       this.t$1.func_78374_a(0.5005D, 0.5D, -0.5D, icon.func_94209_e(), icon.func_94210_h());
/*    */       this.t$1.func_78374_a(0.5005D, 0.5D, 0.5D, icon.func_94212_f(), icon.func_94210_h());
/*    */       this.t$1.func_78374_a(0.5005D, -0.5D, 0.5D, icon.func_94212_f(), icon.func_94206_g());
/*    */       this.t$1.func_78374_a(0.5005D, -0.5D, -0.5D, icon.func_94209_e(), icon.func_94206_g());
/*    */       this.t$1.func_78381_a();
/*    */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\AssemblerRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */