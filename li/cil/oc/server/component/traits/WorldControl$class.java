/*    */ package li.cil.oc.server.component.traits;
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.MatchError;
/*    */ import scala.Tuple2;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class WorldControl$class {
/*    */   @Callback(doc = "function(side:number):boolean, string -- Checks the contents of the block on the specified sides and returns the findings.")
/*    */   public static Object[] detect(WorldControl $this, Context context, Arguments args) {
/* 11 */     ForgeDirection side = $this.checkSideForAction(args, 0);
/* 12 */     Tuple2<Object, String> tuple2 = $this.blockContent(side); if (tuple2 != null) { boolean something = tuple2._1$mcZ$sp(); String what = (String)tuple2._2(); Tuple2 tuple22 = new Tuple2(BoxesRunTime.boxToBoolean(something), what), tuple21 = tuple22; boolean bool1 = tuple21._1$mcZ$sp(); String str1 = (String)tuple21._2();
/* 13 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(bool1), str1 })); }
/*    */     
/*    */     throw new MatchError(tuple2);
/*    */   }
/*    */   
/*    */   public static void $init$(WorldControl $this) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldControl$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */