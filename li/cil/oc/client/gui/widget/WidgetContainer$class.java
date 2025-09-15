/*    */ package li.cil.oc.client.gui.widget;
/*    */ import scala.Function1;
/*    */ 
/*    */ public abstract class WidgetContainer$class {
/*    */   public static void $init$(WidgetContainer $this) {
/*  6 */     $this.li$cil$oc$client$gui$widget$WidgetContainer$_setter_$widgets_$eq((ArrayBuffer)ArrayBuffer$.MODULE$.empty());
/*    */   }
/*    */   public static Widget addWidget(WidgetContainer $this, Widget widget) {
/*  9 */     $this.widgets().$plus$eq(widget);
/* 10 */     widget.owner_$eq($this);
/* 11 */     return widget;
/*    */   }
/*    */   public static int windowX(WidgetContainer $this) {
/* 14 */     return 0;
/*    */   } public static int windowY(WidgetContainer $this) {
/* 16 */     return 0;
/*    */   } public static float windowZ(WidgetContainer $this) {
/* 18 */     return 0.0F;
/*    */   }
/*    */   public static void drawWidgets(WidgetContainer $this) {
/* 21 */     $this.widgets().foreach((Function1)new WidgetContainer$$anonfun$drawWidgets$1($this));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\widget\WidgetContainer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */