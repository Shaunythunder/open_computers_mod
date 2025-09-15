/*     */ package li.cil.oc.common.component;
/*     */ 
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.common.component.traits.TextBufferProxy;
/*     */ import li.cil.oc.util.TextBuffer;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class GpuTextBuffer$
/*     */ {
/*     */   public static final GpuTextBuffer$ MODULE$;
/*     */   
/*     */   public GpuTextBuffer wrap(String owner, int id, TextBuffer data) {
/* 103 */     return new GpuTextBuffer(owner, id, data);
/*     */   }
/*     */   public void bitblt(TextBuffer dst, int col, int row, int w, int h, TextBuffer src, int fromCol, int fromRow) {
/* 106 */     int x = col - 1;
/* 107 */     int y = row - 1;
/* 108 */     int fx = fromCol - 1;
/* 109 */     int fy = fromRow - 1;
/* 110 */     int adjustedDstX = x;
/* 111 */     int adjustedDstY = y;
/* 112 */     int adjustedWidth = w;
/* 113 */     int adjustedHeight = h;
/* 114 */     int adjustedSourceX = fx;
/* 115 */     int adjustedSourceY = fy;
/*     */     
/* 117 */     if (x < 0) {
/* 118 */       adjustedWidth += x;
/* 119 */       adjustedSourceX -= x;
/* 120 */       adjustedDstX = 0;
/*     */     } 
/*     */     
/* 123 */     if (y < 0) {
/* 124 */       adjustedHeight += y;
/* 125 */       adjustedSourceY -= y;
/* 126 */       adjustedDstY = 0;
/*     */     } 
/*     */     
/* 129 */     if (adjustedSourceX < 0) {
/* 130 */       adjustedWidth += adjustedSourceX;
/* 131 */       adjustedDstX -= adjustedSourceX;
/* 132 */       adjustedSourceX = 0;
/*     */     } 
/*     */     
/* 135 */     if (adjustedSourceY < 0) {
/* 136 */       adjustedHeight += adjustedSourceY;
/* 137 */       adjustedDstY -= adjustedSourceY;
/* 138 */       adjustedSourceY = 0;
/*     */     } 
/*     */     
/* 141 */     adjustedWidth -= scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(adjustedDstX + adjustedWidth - dst.getWidth()), 0);
/* 142 */     adjustedWidth -= scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(adjustedSourceX + adjustedWidth - src.getWidth()), 0);
/*     */     
/* 144 */     adjustedHeight -= scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(adjustedDstY + adjustedHeight - dst.getHeight()), 0);
/* 145 */     adjustedHeight -= scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(adjustedSourceY + adjustedHeight - src.getHeight()), 0);
/*     */ 
/*     */     
/* 148 */     if (adjustedWidth <= 0 || adjustedHeight <= 0) {
/*     */       return;
/*     */     }
/*     */     
/* 152 */     TextBuffer textBuffer = dst;
/* 153 */     if (textBuffer instanceof TextBuffer) { TextBuffer textBuffer1 = (TextBuffer)textBuffer; TextBuffer textBuffer2 = src;
/* 154 */       if (textBuffer2 instanceof GpuTextBuffer) { GpuTextBuffer gpuTextBuffer = (GpuTextBuffer)textBuffer2; write_vram_to_screen(textBuffer1, adjustedDstX, adjustedDstY, adjustedWidth, adjustedHeight, gpuTextBuffer, adjustedSourceX, adjustedSourceY); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 155 */        throw new UnsupportedOperationException("Source buffer does not support bitblt operations to a screen"); }
/*     */     
/* 157 */     if (textBuffer instanceof GpuTextBuffer) { GpuTextBuffer gpuTextBuffer = (GpuTextBuffer)textBuffer; TextBuffer textBuffer1 = src;
/* 158 */       if (textBuffer1 instanceof TextBufferProxy) { TextBufferProxy textBufferProxy = (TextBufferProxy)textBuffer1; write_to_vram(gpuTextBuffer, adjustedDstX, adjustedDstY, adjustedWidth, adjustedHeight, textBufferProxy, adjustedSourceX, adjustedSourceY); BoxedUnit boxedUnit2 = BoxedUnit.UNIT; BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 159 */        throw new UnsupportedOperationException("Source buffer does not support bitblt operations"); }
/*     */     
/* 161 */     throw new UnsupportedOperationException("Destination buffer does not support bitblt operations");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean write_vram_to_screen(TextBuffer dstScreen, int x, int y, int w, int h, GpuTextBuffer srcRam, int fx, int fy) {
/* 168 */     dstScreen.addBuffer(srcRam);
/* 169 */     dstScreen.onBufferBitBlt(x + 1, y + 1, w, h, srcRam, fx + 1, fy + 1);
/*     */     return dstScreen.data().rawcopy(x + 1, y + 1, w, h, srcRam.data(), fx + 1, fy + 1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean write_to_vram(GpuTextBuffer dstRam, int x, int y, int w, int h, TextBufferProxy src, int fx, int fy) {
/* 176 */     dstRam.dirty_$eq(true);
/*     */     return dstRam.data().rawcopy(x + 1, y + 1, w, h, src.data(), fx + 1, fy + 1);
/*     */   }
/*     */   private GpuTextBuffer$() {
/* 180 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\GpuTextBuffer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */