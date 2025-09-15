/*    */ package li.cil.oc.client.renderer.markdown.segment;
/*    */ 
/*    */ import scala.None$;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class InteractiveSegment$class
/*    */ {
/*    */   public static void $init$(InteractiveSegment $this) {}
/*    */   
/*    */   public static Option tooltip(InteractiveSegment $this) {
/* 15 */     return (Option)None$.MODULE$;
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
/*    */   public static boolean onMouseClick(InteractiveSegment $this, int mouseX, int mouseY) {
/* 28 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void notifyHover(InteractiveSegment $this) {}
/*    */ 
/*    */   
/*    */   public static Option checkHovered(InteractiveSegment $this, int mouseX, int mouseY, int x, int y, int w, int h) {
/* 36 */     return (mouseX >= x && mouseY >= y && mouseX <= x + w && mouseY <= y + h) ? (Option)new Some($this) : (Option)None$.MODULE$;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\InteractiveSegment$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */