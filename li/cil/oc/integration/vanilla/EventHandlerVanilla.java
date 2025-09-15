/*    */ package li.cil.oc.integration.vanilla;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import li.cil.oc.api.event.GeolyzerEvent;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.block.Block;
/*    */ import scala.Predef$;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001];Q!\001\002\t\0025\t1#\022<f]RD\025M\0343mKJ4\026M\\5mY\006T!a\001\003\002\017Y\fg.\0337mC*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\0211#\022<f]RD\025M\0343mKJ4\026M\\5mY\006\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\003\035\037\021\005Q$\001\bp]\036+w\016\\={KJ\0346-\0318\025\005y\t\003CA\n \023\t\001CC\001\003V]&$\b\"\002\022\034\001\004\031\023!A3\021\005\021bcBA\023+\033\0051#BA\024)\003\025)g/\0328u\025\tIc!A\002ba&L!a\013\024\002\033\035+w\016\\={KJ,e/\0328u\023\ticF\001\003TG\006t'BA\026'Q\tY\002\007\005\0022y5\t!G\003\0024i\005aQM^3oi\"\fg\016\0327fe*\021QGN\001\007G>lWn\0348\013\005]B\024a\0014nY*\021\021HO\001\005[>$7OC\001<\003\r\031\007o^\005\003{I\022abU;cg\016\024\030NY3Fm\026tG\017C\003@\037\021%\001)A\004jg\032cW/\0333\025\005\005#\005CA\nC\023\t\031ECA\004C_>dW-\0318\t\013\025s\004\031\001$\002\013\tdwnY6\021\005\035kU\"\001%\013\005\025K%B\001&L\003%i\027N\\3de\0064GOC\001M\003\rqW\r^\005\003\035\"\023QA\0217pG.DQ\001U\b\005\002E\013\021c\0348HK>d\027P_3s\003:\fG.\037>f)\tq\"\013C\003#\037\002\0071\013\005\002%)&\021QK\f\002\b\003:\fG.\037>fQ\ty\005\007")
/*    */ public final class EventHandlerVanilla {
/*    */   @SubscribeEvent
/*    */   public static void onGeolyzerAnalyze(GeolyzerEvent.Analyze paramAnalyze) {
/*    */     EventHandlerVanilla$.MODULE$.onGeolyzerAnalyze(paramAnalyze);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onGeolyzerScan(GeolyzerEvent.Scan paramScan) {
/*    */     EventHandlerVanilla$.MODULE$.onGeolyzerScan(paramScan);
/*    */   }
/*    */   
/*    */   public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final float apply(byte x$1) {
/* 28 */       return x$1 / 128.0F / 33.0F;
/*    */     }
/*    */   }
/*    */   public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final GeolyzerEvent.Scan e$1; public final World world$1;
/* 32 */     public final void apply(int ry) { apply$mcVI$sp(ry); } public final BlockPosition blockPos$1; public final boolean includeReplaceable$1; public final int w$1; public final int d$1; public void apply$mcVI$sp(int ry) { RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(this.e$1.minZ), this.e$1.maxZ).foreach$mVc$sp((Function1)new EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1(this, ry)); } public EventHandlerVanilla$$anonfun$onGeolyzerScan$1(GeolyzerEvent.Scan e$1, World world$1, BlockPosition blockPos$1, boolean includeReplaceable$1, int w$1, int d$1) {} public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int ry$1; public final void apply(int rz) { apply$mcVI$sp(rz); } public void apply$mcVI$sp(int rz) { RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(this.$outer.e$1.minX), this.$outer.e$1.maxX).foreach$mVc$sp((Function1)new EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(this, rz)); } public EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1(EventHandlerVanilla$$anonfun$onGeolyzerScan$1 $outer, int ry$1) {} public final class EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int rz$1; public final void apply(int rx) { apply$mcVI$sp(rx); } public EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(EventHandlerVanilla$$anonfun$onGeolyzerScan$1$$anonfun$apply$mcVI$sp$1 $outer, int rz$1) {} public void apply$mcVI$sp(int rx) {
/* 33 */           int x = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.x() + rx;
/* 34 */           int y = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.y() + this.$outer.ry$1;
/* 35 */           int z = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.z() + this.rz$1;
/* 36 */           int index = rx - (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.minX + (this.rz$1 - (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.minZ + (this.$outer.ry$1 - (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.minY) * (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).d$1) * (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).w$1;
/* 37 */           if ((this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1.func_72899_e(x, y, z) && !(this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1.func_147437_c(x, y, z))
/* 38 */           { Block block = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1.func_147439_a(x, y, z);
/* 39 */             if (block == null || (!(this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).includeReplaceable$1 && !EventHandlerVanilla$.MODULE$.li$cil$oc$integration$vanilla$EventHandlerVanilla$$isFluid(block) && block.isReplaceable((IBlockAccess)(this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1, (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.x(), (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.y(), (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.z())))
/*    */             
/*    */             { 
/*    */ 
/*    */ 
/*    */ 
/*    */               
/* 46 */               (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] = 0.0F; } else { int dx = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.x() - x; int dy = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.y() - y; int dz = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).blockPos$1.z() - z; float distance = (float)package$.MODULE$.sqrt((dx * dx + dy * dy + dz * dz)); (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] = (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] * distance * Settings$.MODULE$.get().geolyzerNoise() + block.func_149712_f((this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).world$1, x, y, z); }
/*    */              }
/* 48 */           else { (this.$outer.li$cil$oc$integration$vanilla$EventHandlerVanilla$$anonfun$$anonfun$$$outer()).e$1.data[index] = 0.0F; }
/*    */         
/*    */         } }
/*    */        }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\vanilla\EventHandlerVanilla.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */