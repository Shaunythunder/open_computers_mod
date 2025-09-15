/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import li.cil.oc.api.manual.InteractiveImageRenderer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractInteractiveImageRenderer
/*    */   implements InteractiveImageRenderer
/*    */ {
/*    */   public String getTooltip(String tooltip) {
/* 12 */     return tooltip;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onMouseClick(int mouseX, int mouseY) {
/* 17 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\AbstractInteractiveImageRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */