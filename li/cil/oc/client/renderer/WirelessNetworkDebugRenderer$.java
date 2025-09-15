/*     */ package li.cil.oc.client.renderer;
/*     */ import net.minecraft.client.entity.EntityClientPlayerMP;
/*     */ import net.minecraftforge.client.event.RenderWorldLastEvent;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class WirelessNetworkDebugRenderer$ {
/*     */   public static final WirelessNetworkDebugRenderer$ MODULE$;
/*     */   
/*     */   public int[] colors() {
/*  14 */     return this.colors;
/*     */   } private final int[] colors;
/*     */   @SubscribeEvent
/*     */   public void onRenderWorldLastEvent(RenderWorldLastEvent e) {
/*  18 */     if (li.cil.oc.Settings$.MODULE$.rTreeDebugRenderer()) {
/*  19 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".onRenderWorldLastEvent: entering (aka: wasntme)").toString());
/*     */       
/*  21 */       World world = (World)ObfuscationReflectionHelper.getPrivateValue(RenderGlobal.class, e.context, new String[] { "theWorld", "field_72769_h", "r" });
/*  22 */       Option option = li.cil.oc.server.network.WirelessNetwork$.MODULE$.dimensions().get(BoxesRunTime.boxToInteger(world.field_73011_w.field_76574_g));
/*  23 */       if (option instanceof Some) { Some some = (Some)option; RTree tree = (RTree)some.x();
/*  24 */         Minecraft mc = Minecraft.func_71410_x();
/*  25 */         EntityClientPlayerMP player = mc.field_71439_g;
/*  26 */         double px = player.field_70142_S + (player.field_70165_t - player.field_70142_S) * e.partialTicks;
/*  27 */         double py = player.field_70137_T + (player.field_70163_u - player.field_70137_T) * e.partialTicks;
/*  28 */         double pz = player.field_70136_U + (player.field_70161_v - player.field_70136_U) * e.partialTicks;
/*     */         
/*  30 */         GL11.glPushAttrib(1048575);
/*  31 */         GL11.glPushMatrix();
/*  32 */         GL11.glTranslated(-px, -py, -pz);
/*  33 */         li.cil.oc.util.RenderState$.MODULE$.makeItBlend();
/*  34 */         GL11.glDisable(2896);
/*  35 */         GL11.glDisable(3553);
/*  36 */         GL11.glDisable(2929);
/*  37 */         GL11.glDisable(2884);
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
/*  78 */         GL11.glPolygonMode(1032, 6913);
/*  79 */         tree.allBounds().withFilter((Function1)new WirelessNetworkDebugRenderer$$anonfun$onRenderWorldLastEvent$1()).foreach((Function1)new WirelessNetworkDebugRenderer$$anonfun$onRenderWorldLastEvent$2());
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
/*  91 */         GL11.glPolygonMode(1032, 6914);
/*     */         
/*  93 */         GL11.glPopMatrix();
/*  94 */         GL11.glPopAttrib(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  95 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */ 
/*     */       
/*  98 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".onRenderWorldLastEvent: leaving").toString());
/*     */     } 
/*     */   }
/*     */   private WirelessNetworkDebugRenderer$() {
/* 102 */     MODULE$ = this;
/*     */     this.colors = new int[] { 16711680, 65535, 65280, 255, 16711935, 16776960, 16777215, 0 };
/*     */   }
/*     */   
/*     */   public final void li$cil$oc$client$renderer$WirelessNetworkDebugRenderer$$drawBox$1(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
/*     */     GL11.glBegin(7);
/*     */     GL11.glVertex3d(minX, minY, minZ);
/*     */     GL11.glVertex3d(minX, minY, maxZ);
/*     */     GL11.glVertex3d(maxX, minY, maxZ);
/*     */     GL11.glVertex3d(maxX, minY, minZ);
/*     */     GL11.glEnd();
/*     */     GL11.glBegin(7);
/*     */     GL11.glVertex3d(minX, minY, minZ);
/*     */     GL11.glVertex3d(maxX, minY, minZ);
/*     */     GL11.glVertex3d(maxX, maxY, minZ);
/*     */     GL11.glVertex3d(minX, maxY, minZ);
/*     */     GL11.glEnd();
/*     */     GL11.glBegin(7);
/*     */     GL11.glVertex3d(maxX, maxY, minZ);
/*     */     GL11.glVertex3d(maxX, maxY, maxZ);
/*     */     GL11.glVertex3d(minX, maxY, maxZ);
/*     */     GL11.glVertex3d(minX, maxY, minZ);
/*     */     GL11.glEnd();
/*     */     GL11.glBegin(7);
/*     */     GL11.glVertex3d(maxX, maxY, maxZ);
/*     */     GL11.glVertex3d(maxX, minY, maxZ);
/*     */     GL11.glVertex3d(minX, minY, maxZ);
/*     */     GL11.glVertex3d(minX, maxY, maxZ);
/*     */     GL11.glEnd();
/*     */     GL11.glBegin(7);
/*     */     GL11.glVertex3d(minX, minY, minZ);
/*     */     GL11.glVertex3d(minX, maxY, minZ);
/*     */     GL11.glVertex3d(minX, maxY, maxZ);
/*     */     GL11.glVertex3d(minX, minY, maxZ);
/*     */     GL11.glEnd();
/*     */     GL11.glBegin(7);
/*     */     GL11.glVertex3d(maxX, minY, minZ);
/*     */     GL11.glVertex3d(maxX, minY, maxZ);
/*     */     GL11.glVertex3d(maxX, maxY, maxZ);
/*     */     GL11.glVertex3d(maxX, maxY, minZ);
/*     */     GL11.glEnd();
/*     */   }
/*     */   
/*     */   public final class WirelessNetworkDebugRenderer$$anonfun$onRenderWorldLastEvent$1 extends AbstractFunction1<Tuple2<Tuple2<Tuple3<Object, Object, Object>, Tuple3<Object, Object, Object>>, Object>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/*     */       Tuple2 tuple2 = check$ifrefutable$1;
/*     */       if (tuple2 != null) {
/*     */         Tuple2 tuple21 = (Tuple2)tuple2._1();
/*     */         if (tuple21 != null)
/*     */           return true; 
/*     */       } 
/*     */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class WirelessNetworkDebugRenderer$$anonfun$onRenderWorldLastEvent$2 extends AbstractFunction1<Tuple2<Tuple2<Tuple3<Object, Object, Object>, Tuple3<Object, Object, Object>>, Object>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(Tuple2 x$3) {
/*     */       Tuple2 tuple2 = x$3;
/*     */       if (tuple2 != null) {
/*     */         Tuple2 tuple21 = (Tuple2)tuple2._1();
/*     */         int level = tuple2._2$mcI$sp();
/*     */         if (tuple21 != null) {
/*     */           Tuple3 min = (Tuple3)tuple21._1(), max = (Tuple3)tuple21._2();
/*     */           Tuple3 tuple31 = min;
/*     */           if (tuple31 != null) {
/*     */             double minX = BoxesRunTime.unboxToDouble(tuple31._1()), minY = BoxesRunTime.unboxToDouble(tuple31._2()), minZ = BoxesRunTime.unboxToDouble(tuple31._3());
/*     */             Tuple3 tuple33 = new Tuple3(BoxesRunTime.boxToDouble(minX), BoxesRunTime.boxToDouble(minY), BoxesRunTime.boxToDouble(minZ)), tuple32 = tuple33;
/*     */             double d1 = BoxesRunTime.unboxToDouble(tuple32._1()), d2 = BoxesRunTime.unboxToDouble(tuple32._2()), d3 = BoxesRunTime.unboxToDouble(tuple32._3());
/*     */             Tuple3 tuple34 = max;
/*     */             if (tuple34 != null) {
/*     */               double maxX = BoxesRunTime.unboxToDouble(tuple34._1()), maxY = BoxesRunTime.unboxToDouble(tuple34._2()), maxZ = BoxesRunTime.unboxToDouble(tuple34._3());
/*     */               Tuple3 tuple36 = new Tuple3(BoxesRunTime.boxToDouble(maxX), BoxesRunTime.boxToDouble(maxY), BoxesRunTime.boxToDouble(maxZ)), tuple35 = tuple36;
/*     */               double d4 = BoxesRunTime.unboxToDouble(tuple35._1()), d5 = BoxesRunTime.unboxToDouble(tuple35._2()), d6 = BoxesRunTime.unboxToDouble(tuple35._3());
/*     */               int color = WirelessNetworkDebugRenderer$.MODULE$.colors()[level % (WirelessNetworkDebugRenderer$.MODULE$.colors()).length];
/*     */               GL11.glColor4f((color >> 16 & 0xFF) / 255.0F, (color >> 8 & 0xFF) / 255.0F, (color >> 0 & 0xFF) / 255.0F, 0.25F);
/*     */               double size = 0.5D - level * 0.05D;
/*     */               WirelessNetworkDebugRenderer$.MODULE$.li$cil$oc$client$renderer$WirelessNetworkDebugRenderer$$drawBox$1(d1 - size, d2 - size, d3 - size, d4 + size, d5 + size, d6 + size);
/*     */               BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */             } 
/*     */             throw new MatchError(tuple34);
/*     */           } 
/*     */           throw new MatchError(tuple31);
/*     */         } 
/*     */       } 
/*     */       throw new MatchError(tuple2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\WirelessNetworkDebugRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */