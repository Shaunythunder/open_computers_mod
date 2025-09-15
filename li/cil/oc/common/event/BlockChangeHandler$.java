/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraftforge.event.world.WorldEvent;
/*    */ import scala.Function0;
/*    */ import scala.Serializable;
/*    */ import scala.collection.mutable.WeakHashMap;
/*    */ import scala.runtime.AbstractFunction0;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ 
/*    */ public final class BlockChangeHandler$
/*    */ {
/*    */   public static final BlockChangeHandler$ MODULE$;
/*    */   private final WeakHashMap<BlockChangeHandler.ChangeListener, BlockPosition> li$cil$oc$common$event$BlockChangeHandler$$changeListeners;
/*    */   
/*    */   public void addListener(BlockChangeHandler.ChangeListener listener, BlockPosition coord) {
/* 19 */     li.cil.oc.common.EventHandler$.MODULE$.scheduleServer((Function0)new BlockChangeHandler$$anonfun$addListener$1(listener, coord)); } public final class BlockChangeHandler$$anonfun$addListener$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply() { apply$mcV$sp(); } private final BlockChangeHandler.ChangeListener listener$1; private final BlockPosition coord$1; public void apply$mcV$sp() { BlockChangeHandler$.MODULE$.li$cil$oc$common$event$BlockChangeHandler$$changeListeners().put(this.listener$1, this.coord$1); }
/*    */     
/*    */     public BlockChangeHandler$$anonfun$addListener$1(BlockChangeHandler.ChangeListener listener$1, BlockPosition coord$1) {} }
/*    */   
/* 23 */   public void removeListener(BlockChangeHandler.ChangeListener listener) { li.cil.oc.common.EventHandler$.MODULE$.scheduleServer((Function0)new BlockChangeHandler$$anonfun$removeListener$1(listener)); } public final class BlockChangeHandler$$anonfun$removeListener$1 extends AbstractFunction0.mcV.sp implements Serializable { public static final long serialVersionUID = 0L; private final BlockChangeHandler.ChangeListener listener$2; public final void apply() { apply$mcV$sp(); } public void apply$mcV$sp() { BlockChangeHandler$.MODULE$.li$cil$oc$common$event$BlockChangeHandler$$changeListeners().remove(this.listener$2); }
/*    */      public BlockChangeHandler$$anonfun$removeListener$1(BlockChangeHandler.ChangeListener listener$2) {} }
/*    */   public WeakHashMap<BlockChangeHandler.ChangeListener, BlockPosition> li$cil$oc$common$event$BlockChangeHandler$$changeListeners() {
/* 26 */     return this.li$cil$oc$common$event$BlockChangeHandler$$changeListeners;
/*    */   }
/*    */   @SubscribeEvent
/*    */   public void onWorldLoad(WorldEvent.Load e) {
/* 30 */     e.world.func_72954_a(new BlockChangeHandler.Listener(e.world));
/*    */   }
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
/*    */   private BlockChangeHandler$() {
/* 71 */     MODULE$ = this;
/*    */     this.li$cil$oc$common$event$BlockChangeHandler$$changeListeners = scala.collection.mutable.WeakHashMap$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\BlockChangeHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */