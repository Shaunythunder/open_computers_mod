/*     */ package li.cil.oc.client.renderer;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.common.item.data.PrintData;
/*     */ import li.cil.oc.common.tileentity.Print;
/*     */ import li.cil.oc.util.ExtendedAABB$;
/*     */ import net.minecraft.client.renderer.RenderGlobal;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraftforge.client.event.DrawBlockHighlightEvent;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001U;Q!\001\002\t\0025\t\021\003S5hQ2Lw\r\033;SK:$WM]3s\025\t\031A!\001\005sK:$WM]3s\025\t)a!\001\004dY&,g\016\036\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"!\005%jO\"d\027n\0325u%\026tG-\032:feN\021qB\005\t\003'Yi\021\001\006\006\002+\005)1oY1mC&\021q\003\006\002\007\003:L(+\0324\t\013eyA\021\001\016\002\rqJg.\033;?)\005i\001b\002\017\020\005\004%I!H\001\007e\006tGm\\7\026\003y\001\"a\b\022\016\003\001R!!\t\013\002\tU$\030\016\\\005\003G\001\022aAU1oI>l\007BB\023\020A\003%a$A\004sC:$w.\034\021\t\021\035z\001R1A\005\002!\na\001^1cY\026$X#A\025\021\005)zS\"A\026\013\0051j\023A\0023fi\006LGN\003\002/\r\005\031\021\r]5\n\005AZ#\001C%uK6LeNZ8\t\021Iz\001\022!Q!\n%\nq\001^1cY\026$\b\005C\0035\037\021\005Q'\001\013p]\022\023\030m\036\"m_\016\\\007*[4iY&<\007\016\036\013\003me\002\"aE\034\n\005a\"\"\001B+oSRDQAO\032A\002m\n\021!\032\t\003y\021k\021!\020\006\003}}\nQ!\032<f]RT!!\002!\013\005\005\023\025AD7j]\026\034'/\0314uM>\024x-\032\006\002\007\006\031a.\032;\n\005\025k$a\006#sC^\024En\\2l\021&<\007\016\\5hQR,e/\0328uQ\t\031t\t\005\002I'6\t\021J\003\002K\027\006aQM^3oi\"\fg\016\0327fe*\021A*T\001\007G>lWn\0348\013\0059{\025a\0014nY*\021\001+U\001\005[>$7OC\001S\003\r\031\007o^\005\003)&\023abU;cg\016\024\030NY3Fm\026tG\017")
/*     */ public final class HighlightRenderer
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onDrawBlockHighlight(DrawBlockHighlightEvent paramDrawBlockHighlightEvent) {
/*     */     HighlightRenderer$.MODULE$.onDrawBlockHighlight(paramDrawBlockHighlightEvent);
/*     */   }
/*     */   
/*     */   public static ItemInfo tablet() {
/*     */     return HighlightRenderer$.MODULE$.tablet();
/*     */   }
/*     */   
/*     */   public final class HighlightRenderer$$anonfun$onDrawBlockHighlight$1
/*     */     extends AbstractFunction1<PrintData.Shape, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final DrawBlockHighlightEvent e$1;
/*     */     private final Vec3 pos$1;
/*     */     private final float expansion$1;
/*     */     private final Print x2$1;
/*     */     
/*     */     public HighlightRenderer$$anonfun$onDrawBlockHighlight$1(DrawBlockHighlightEvent e$1, Vec3 pos$1, float expansion$1, Print x2$1) {}
/*     */     
/*     */     public final void apply(PrintData.Shape shape) {
/* 117 */       AxisAlignedBB bounds = ExtendedAABB$.MODULE$.extendedAABB(shape.bounds()).rotateTowards(this.x2$1.facing());
/* 118 */       RenderGlobal.func_147590_a(bounds.func_72329_c().func_72314_b(this.expansion$1, this.expansion$1, this.expansion$1)
/* 119 */           .func_72317_d(this.e$1.target.field_72311_b, this.e$1.target.field_72312_c, this.e$1.target.field_72309_d)
/* 120 */           .func_72317_d(-this.pos$1.field_72450_a, -this.pos$1.field_72448_b, -this.pos$1.field_72449_c), -1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\HighlightRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */