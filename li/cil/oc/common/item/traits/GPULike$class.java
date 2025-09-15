/*    */ package li.cil.oc.common.item.traits;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.Seq;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class GPULike$class {
/*    */   public static void $init$(GPULike $this) {}
/*    */   
/*    */   public static Seq tooltipData(GPULike $this) {
/* 10 */     Tuple2 tuple2 = Settings$.MODULE$.screenResolutionsByTier()[$this.gpuTier()]; if (tuple2 != null) { int w = tuple2._1$mcI$sp(), h = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(w, h), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 11 */       int depth = PackedColor$Depth$.MODULE$.bits(Settings$.MODULE$.screenDepthsByTier()[$this.gpuTier()]);
/* 12 */       (new Object[4])[0] = BoxesRunTime.boxToInteger(i); (new Object[4])[1] = BoxesRunTime.boxToInteger(j); (new Object[4])[2] = BoxesRunTime.boxToInteger(depth);
/* 13 */       int k = $this.gpuTier(); switch (k) { default: throw new MatchError(BoxesRunTime.boxToInteger(k));case 2: case 1: 
/* 14 */         case 0: break; }  return (Seq)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { null, null, null, "1/1/4/2/2" })); }
/*    */     
/*    */     throw new MatchError(tuple2);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\traits\GPULike$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */