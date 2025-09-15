/*     */ package li.cil.oc.common.component;
/*     */ 
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.common.component.traits.VideoRamRasterizer;
/*     */ import net.minecraft.nbt.NBTTagCompound;
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
/*     */ public final class ClientGpuTextBufferHandler$
/*     */ {
/*     */   public static final ClientGpuTextBufferHandler$ MODULE$;
/*     */   
/*     */   public void bitblt(TextBuffer dst, int col, int row, int w, int h, String owner, int srcId, int fromCol, int fromRow) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore #10
/*     */     //   3: aload #10
/*     */     //   5: instanceof li/cil/oc/common/component/traits/VideoRamRasterizer
/*     */     //   8: ifeq -> 105
/*     */     //   11: aload #10
/*     */     //   13: astore #11
/*     */     //   15: aload #11
/*     */     //   17: checkcast li/cil/oc/common/component/traits/VideoRamRasterizer
/*     */     //   20: aload #6
/*     */     //   22: iload #7
/*     */     //   24: invokeinterface getBuffer : (Ljava/lang/String;I)Lscala/Option;
/*     */     //   29: astore #13
/*     */     //   31: aload #13
/*     */     //   33: instanceof scala/Some
/*     */     //   36: ifeq -> 92
/*     */     //   39: aload #13
/*     */     //   41: checkcast scala/Some
/*     */     //   44: astore #14
/*     */     //   46: aload #14
/*     */     //   48: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   51: checkcast li/cil/oc/common/component/GpuTextBuffer
/*     */     //   54: astore #15
/*     */     //   56: aload #15
/*     */     //   58: ifnull -> 92
/*     */     //   61: aload #15
/*     */     //   63: astore #16
/*     */     //   65: getstatic li/cil/oc/common/component/GpuTextBuffer$.MODULE$ : Lli/cil/oc/common/component/GpuTextBuffer$;
/*     */     //   68: aload_1
/*     */     //   69: iload_2
/*     */     //   70: iload_3
/*     */     //   71: iload #4
/*     */     //   73: iload #5
/*     */     //   75: aload #16
/*     */     //   77: iload #8
/*     */     //   79: iload #9
/*     */     //   81: invokevirtual bitblt : (Lli/cil/oc/api/internal/TextBuffer;IIIILli/cil/oc/api/internal/TextBuffer;II)V
/*     */     //   84: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   87: astore #17
/*     */     //   89: goto -> 97
/*     */     //   92: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   95: astore #17
/*     */     //   97: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   100: astore #12
/*     */     //   102: goto -> 110
/*     */     //   105: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   108: astore #12
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #76	-> 0
/*     */     //   #77	-> 3
/*     */     //   #78	-> 31
/*     */     //   #79	-> 65
/*     */     //   #81	-> 92
/*     */     //   #77	-> 97
/*     */     //   #83	-> 105
/*     */     //   #76	-> 110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	111	0	this	Lli/cil/oc/common/component/ClientGpuTextBufferHandler$;
/*     */     //   0	111	1	dst	Lli/cil/oc/api/internal/TextBuffer;
/*     */     //   0	111	2	col	I
/*     */     //   0	111	3	row	I
/*     */     //   0	111	4	w	I
/*     */     //   0	111	5	h	I
/*     */     //   0	111	6	owner	Ljava/lang/String;
/*     */     //   0	111	7	srcId	I
/*     */     //   0	111	8	fromCol	I
/*     */     //   0	111	9	fromRow	I
/*     */     //   56	55	15	buffer	Lli/cil/oc/common/component/GpuTextBuffer;
/*     */   }
/*     */   
/*     */   public boolean removeBuffer(TextBuffer buffer, String owner, int id) {
/*     */     boolean bool;
/*  88 */     TextBuffer textBuffer = buffer;
/*  89 */     if (textBuffer instanceof VideoRamRasterizer) { TextBuffer textBuffer1 = textBuffer; bool = ((VideoRamRasterizer)textBuffer1).removeBuffer(owner, id); }
/*  90 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   } public boolean loadBuffer(TextBuffer buffer, String owner, int id, NBTTagCompound nbt) {
/*     */     boolean bool;
/*  95 */     TextBuffer textBuffer = buffer;
/*  96 */     if (textBuffer instanceof VideoRamRasterizer) { TextBuffer textBuffer1 = textBuffer; bool = ((VideoRamRasterizer)textBuffer1).loadBuffer(owner, id, nbt); }
/*  97 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   }
/*     */   private ClientGpuTextBufferHandler$() {
/* 102 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\ClientGpuTextBufferHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */