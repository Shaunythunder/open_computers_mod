/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ 
/*    */ import li.cil.oc.client.Textures$Assembler$;
/*    */ import li.cil.oc.common.tileentity.Assembler;
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import net.minecraft.client.renderer.Tessellator;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.world.World;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.Serializable;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\001;Q!\001\002\t\002=\t\021#Q:tK6\024G.\032:SK:$WM]3s\025\t\031A!\001\006uS2,WM\034;jifT!!\002\004\002\021I,g\016Z3sKJT!a\002\005\002\r\rd\027.\0328u\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001\001\t\003!Ei\021A\001\004\006%\tA\ta\005\002\022\003N\034X-\0342mKJ\024VM\0343fe\026\0248CA\t\025!\t)R$D\001\027\025\t\031qC\003\002\0061)\021q!\007\006\0035m\t\021\"\\5oK\016\024\030M\032;\013\003q\t1A\\3u\023\tqbCA\rUS2,WI\034;jif\034\006/Z2jC2\024VM\0343fe\026\024\b\"\002\021\022\t\003\t\023A\002\037j]&$h\bF\001\020\021\025\031\023\003\"\021%\003I\021XM\0343feRKG.Z#oi&$\0300\021;\025\r\025Z#gN\035<!\t1\023&D\001(\025\005A\023!B:dC2\f\027B\001\026(\005\021)f.\033;\t\0131\022\003\031A\027\002\025QLG.Z#oi&$\030\020\005\002/a5\tqF\003\002\0043%\021\021g\f\002\013)&dW-\0228uSRL\b\"B\032#\001\004!\024!\001=\021\005\031*\024B\001\034(\005\031!u.\0362mK\")\001H\ta\001i\005\t\021\020C\003;E\001\007A'A\001{\021\025a$\0051\001>\003\0051\007C\001\024?\023\tytEA\003GY>\fG\017")
/*    */ public final class AssemblerRenderer {
/*    */   public static void renderTileEntityAt(TileEntity paramTileEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*    */     AssemblerRenderer$.MODULE$.func_147500_a(paramTileEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*    */   }
/*    */   
/*    */   public static FontRenderer func_147498_b() {
/*    */     return AssemblerRenderer$.MODULE$.func_147498_b();
/*    */   }
/*    */   
/*    */   public static void func_147496_a(World paramWorld) {
/*    */     AssemblerRenderer$.MODULE$.func_147496_a(paramWorld);
/*    */   }
/*    */   
/*    */   public static void func_147497_a(TileEntityRendererDispatcher paramTileEntityRendererDispatcher) {
/*    */     AssemblerRenderer$.MODULE$.func_147497_a(paramTileEntityRendererDispatcher);
/*    */   }
/*    */   
/*    */   public final class AssemblerRenderer$$anonfun$renderTileEntityAt$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Assembler assembler$1;
/*    */     private final Tessellator t$1;
/*    */     private final double indent$1;
/*    */     
/* 42 */     public final void apply(int i) { apply$mcVI$sp(i); } public void apply$mcVI$sp(int i) {
/* 43 */       this.t$1.func_78382_b();
/*    */       
/* 45 */       if (this.assembler$1.isAssembling()) {
/* 46 */         IIcon iIcon = Textures$Assembler$.MODULE$.iconSideAssembling();
/* 47 */         this.t$1.func_78374_a(this.indent$1, 0.5D, -this.indent$1, iIcon.func_94214_a((0.5D - this.indent$1) * 16), iIcon.func_94210_h());
/* 48 */         this.t$1.func_78374_a(this.indent$1, 0.5D, this.indent$1, iIcon.func_94214_a((0.5D + this.indent$1) * 16), iIcon.func_94210_h());
/* 49 */         this.t$1.func_78374_a(this.indent$1, -0.5D, this.indent$1, iIcon.func_94214_a((0.5D + this.indent$1) * 16), iIcon.func_94206_g());
/* 50 */         this.t$1.func_78374_a(this.indent$1, -0.5D, -this.indent$1, iIcon.func_94214_a((0.5D - this.indent$1) * 16), iIcon.func_94206_g());
/*    */       } 
/*    */ 
/*    */       
/* 54 */       IIcon icon = Textures$Assembler$.MODULE$.iconSideOn();
/* 55 */       this.t$1.func_78374_a(0.5005D, 0.5D, -0.5D, icon.func_94209_e(), icon.func_94210_h());
/* 56 */       this.t$1.func_78374_a(0.5005D, 0.5D, 0.5D, icon.func_94212_f(), icon.func_94210_h());
/* 57 */       this.t$1.func_78374_a(0.5005D, -0.5D, 0.5D, icon.func_94212_f(), icon.func_94206_g());
/* 58 */       this.t$1.func_78374_a(0.5005D, -0.5D, -0.5D, icon.func_94209_e(), icon.func_94206_g());
/*    */ 
/*    */       
/* 61 */       this.t$1.func_78381_a();
/*    */       
/* 63 */       GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/*    */     }
/*    */     
/*    */     public AssemblerRenderer$$anonfun$renderTileEntityAt$1(Assembler assembler$1, Tessellator t$1, double indent$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\AssemblerRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */