/*    */ package li.cil.oc.client.renderer.entity;
/*    */ 
/*    */ 
/*    */ public final class DroneRenderer$ extends Render {
/*    */   public static final DroneRenderer$ MODULE$;
/*    */   
/*  7 */   private DroneRenderer$() { MODULE$ = this;
/*  8 */     this.model = new ModelQuadcopter(); } private final ModelQuadcopter model; public ModelQuadcopter model() { return this.model; }
/*    */   
/*    */   public void func_76986_a(Entity entity, double x, double y, double z, float yaw, float dt) {
/* 11 */     func_110777_b(entity);
/* 12 */     GL11.glPushMatrix();
/* 13 */     GL11.glPushAttrib(1048575);
/*    */     
/* 15 */     GL11.glTranslated(x, y + 0.125D, z);
/*    */     
/* 17 */     model().func_78088_a(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, dt);
/*    */     
/* 19 */     GL11.glPopAttrib();
/* 20 */     GL11.glPopMatrix();
/*    */   }
/*    */   public ResourceLocation func_110775_a(Entity entity) {
/* 23 */     return model().texture();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\entity\DroneRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */