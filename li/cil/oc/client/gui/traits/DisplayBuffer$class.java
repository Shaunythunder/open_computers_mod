/*    */ package li.cil.oc.client.gui.traits;
/*    */ 
/*    */ import li.cil.oc.client.renderer.gui.BufferRenderer$;
/*    */ import li.cil.oc.util.RenderState$;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DisplayBuffer$class
/*    */ {
/*    */   public static void $init$(DisplayBuffer $this) {
/* 18 */     $this.guiSizeChanged_$eq(false);
/*    */     
/* 20 */     $this.currentWidth_$eq(-1); $this.currentHeight_$eq(-1);
/*    */     
/* 22 */     $this.scale_$eq(0.0D);
/*    */   }
/*    */   public static void initGui(DisplayBuffer $this) {
/* 25 */     $this.li$cil$oc$client$gui$traits$DisplayBuffer$$super$initGui();
/* 26 */     BufferRenderer$.MODULE$.init((Minecraft.func_71410_x()).field_71446_o);
/* 27 */     $this.guiSizeChanged_$eq(true);
/*    */   }
/*    */   
/*    */   public static void drawBufferLayer(DisplayBuffer $this) {
/* 31 */     int oldWidth = $this.currentWidth();
/* 32 */     int oldHeight = $this.currentHeight();
/* 33 */     $this.currentWidth_$eq($this.bufferColumns());
/* 34 */     $this.currentHeight_$eq($this.bufferRows());
/* 35 */     $this.scale_$eq($this.changeSize($this.currentWidth(), $this.currentHeight(), ($this.guiSizeChanged() || oldWidth != $this.currentWidth() || oldHeight != $this.currentHeight())));
/*    */     
/* 37 */     RenderState$.MODULE$.checkError((new StringBuilder()).append($this.getClass().getName()).append(".drawBufferLayer: entering (aka: wasntme)").toString());
/*    */     
/* 39 */     GL11.glPushMatrix();
/* 40 */     RenderState$.MODULE$.disableLighting();
/* 41 */     $this.drawBuffer();
/* 42 */     GL11.glPopMatrix();
/*    */     
/* 44 */     RenderState$.MODULE$.checkError((new StringBuilder()).append($this.getClass().getName()).append(".drawBufferLayer: buffer layer").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\DisplayBuffer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */