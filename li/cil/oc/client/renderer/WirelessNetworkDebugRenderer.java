/*    */ package li.cil.oc.client.renderer;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import net.minecraftforge.client.event.RenderWorldLastEvent;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.MatchError;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.Tuple3;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!;Q!\001\002\t\0025\tAdV5sK2,7o\035(fi^|'o\033#fEV<'+\0328eKJ,'O\003\002\004\t\005A!/\0328eKJ,'O\003\002\006\r\00511\r\\5f]RT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005q9\026N]3mKN\034h*\032;x_J\\G)\0322vOJ+g\016Z3sKJ\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\004\035\037\t\007I\021A\017\002\r\r|Gn\034:t+\005q\002cA\n C%\021\001\005\006\002\006\003J\024\030-\037\t\003'\tJ!a\t\013\003\007%sG\017\003\004&\037\001\006IAH\001\bG>dwN]:!\021\0259s\002\"\001)\003YygNU3oI\026\024xk\034:mI2\0137\017^#wK:$HCA\025-!\t\031\"&\003\002,)\t!QK\\5u\021\025ic\0051\001/\003\005)\007CA\0308\033\005\001$BA\0313\003\025)g/\0328u\025\t)1G\003\0025k\005qQ.\0338fGJ\fg\r\0364pe\036,'\"\001\034\002\0079,G/\003\0029a\t!\"+\0328eKJ<vN\0357e\031\006\034H/\022<f]RD#A\n\036\021\005m2U\"\001\037\013\005ur\024\001D3wK:$\b.\0318eY\026\024(BA A\003\031\031w.\\7p]*\021\021IQ\001\004M6d'BA\"E\003\021iw\016Z:\013\003\025\0131a\0319x\023\t9EH\001\bTk\n\0348M]5cK\0263XM\034;")
/*    */ public final class WirelessNetworkDebugRenderer
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onRenderWorldLastEvent(RenderWorldLastEvent paramRenderWorldLastEvent) {
/*    */     WirelessNetworkDebugRenderer$.MODULE$.onRenderWorldLastEvent(paramRenderWorldLastEvent);
/*    */   }
/*    */   
/*    */   public static int[] colors() {
/*    */     return WirelessNetworkDebugRenderer$.MODULE$.colors();
/*    */   }
/*    */   
/*    */   public final class WirelessNetworkDebugRenderer$$anonfun$onRenderWorldLastEvent$1
/*    */     extends AbstractFunction1<Tuple2<Tuple2<Tuple3<Object, Object, Object>, Tuple3<Object, Object, Object>>, Object>, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/* 79 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { Tuple2 tuple21 = (Tuple2)tuple2._1(); if (tuple21 != null) return true;  }  return false; } } public final class WirelessNetworkDebugRenderer$$anonfun$onRenderWorldLastEvent$2 extends AbstractFunction1<Tuple2<Tuple2<Tuple3<Object, Object, Object>, Tuple3<Object, Object, Object>>, Object>, BoxedUnit> implements Serializable { public final void apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { Tuple2 tuple21 = (Tuple2)tuple2._1(); int level = tuple2._2$mcI$sp(); if (tuple21 != null) { Tuple3 min = (Tuple3)tuple21._1(), max = (Tuple3)tuple21._2();
/* 80 */           Tuple3 tuple31 = min; if (tuple31 != null) { double minX = BoxesRunTime.unboxToDouble(tuple31._1()), minY = BoxesRunTime.unboxToDouble(tuple31._2()), minZ = BoxesRunTime.unboxToDouble(tuple31._3()); Tuple3 tuple33 = new Tuple3(BoxesRunTime.boxToDouble(minX), BoxesRunTime.boxToDouble(minY), BoxesRunTime.boxToDouble(minZ)), tuple32 = tuple33; double d1 = BoxesRunTime.unboxToDouble(tuple32._1()), d2 = BoxesRunTime.unboxToDouble(tuple32._2()), d3 = BoxesRunTime.unboxToDouble(tuple32._3());
/* 81 */             Tuple3 tuple34 = max; if (tuple34 != null) { double maxX = BoxesRunTime.unboxToDouble(tuple34._1()), maxY = BoxesRunTime.unboxToDouble(tuple34._2()), maxZ = BoxesRunTime.unboxToDouble(tuple34._3()); Tuple3 tuple36 = new Tuple3(BoxesRunTime.boxToDouble(maxX), BoxesRunTime.boxToDouble(maxY), BoxesRunTime.boxToDouble(maxZ)), tuple35 = tuple36; double d4 = BoxesRunTime.unboxToDouble(tuple35._1()), d5 = BoxesRunTime.unboxToDouble(tuple35._2()), d6 = BoxesRunTime.unboxToDouble(tuple35._3());
/* 82 */               int color = WirelessNetworkDebugRenderer$.MODULE$.colors()[level % (WirelessNetworkDebugRenderer$.MODULE$.colors()).length];
/* 83 */               GL11.glColor4f((
/* 84 */                   color >> 16 & 0xFF) / 255.0F, (
/* 85 */                   color >> 8 & 0xFF) / 255.0F, (
/* 86 */                   color >> 0 & 0xFF) / 255.0F, 
/* 87 */                   0.25F);
/* 88 */               double size = 0.5D - level * 0.05D;
/* 89 */               WirelessNetworkDebugRenderer$.MODULE$.li$cil$oc$client$renderer$WirelessNetworkDebugRenderer$$drawBox$1(d1 - size, d2 - size, d3 - size, d4 + size, d5 + size, d6 + size); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */             
/*    */             throw new MatchError(tuple34); }
/*    */           
/*    */           throw new MatchError(tuple31); }
/*    */          }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\WirelessNetworkDebugRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */