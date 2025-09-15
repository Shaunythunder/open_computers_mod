/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ 
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Some;
/*    */ import scala.Tuple4;
/*    */ import scala.runtime.AbstractFunction4;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class RedstoneChangedEventArgs$
/*    */   extends AbstractFunction4<ForgeDirection, Object, Object, Object, RedstoneChangedEventArgs>
/*    */   implements Serializable
/*    */ {
/*    */   public static final RedstoneChangedEventArgs$ MODULE$;
/*    */   
/*    */   public final String toString() {
/* 21 */     return "RedstoneChangedEventArgs"; } public RedstoneChangedEventArgs apply(ForgeDirection side, int oldValue, int newValue, int color) { return new RedstoneChangedEventArgs(side, oldValue, newValue, color); } public Option<Tuple4<ForgeDirection, Object, Object, Object>> unapply(RedstoneChangedEventArgs x$0) { return (x$0 == null) ? (Option<Tuple4<ForgeDirection, Object, Object, Object>>)scala.None$.MODULE$ : (Option<Tuple4<ForgeDirection, Object, Object, Object>>)new Some(new Tuple4(x$0.side(), BoxesRunTime.boxToInteger(x$0.oldValue()), BoxesRunTime.boxToInteger(x$0.newValue()), BoxesRunTime.boxToInteger(x$0.color()))); } public int apply$default$4() { return -1; } public int $lessinit$greater$default$4() { return -1; } private Object readResolve() { return MODULE$; } private RedstoneChangedEventArgs$() { MODULE$ = this; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\RedstoneChangedEventArgs$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */