/*     */ package li.cil.oc.client.renderer;
/*     */ import com.google.common.cache.Cache;
/*     */ import com.google.common.cache.RemovalNotification;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import java.util.concurrent.Callable;
/*     */ import li.cil.oc.client.renderer.font.TextBufferRenderData;
/*     */ import li.cil.oc.client.renderer.font.TextureFontRenderer;
/*     */ import net.minecraft.client.renderer.GLAllocation;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class TextBufferRenderCache$ implements Callable<Object>, RemovalListener<TileEntity, Object> {
/*     */   public static final TextBufferRenderCache$ MODULE$;
/*     */   private final TextureFontRenderer renderer;
/*     */   
/*     */   public TextureFontRenderer renderer() {
/*  19 */     return this.renderer;
/*     */   } private final Cache<TextBufferRenderData, Object> cache; private TextBufferRenderData currentBuffer; private TextBufferRenderCache$() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial <init> : ()V
/*     */     //   4: aload_0
/*     */     //   5: putstatic li/cil/oc/client/renderer/TextBufferRenderCache$.MODULE$ : Lli/cil/oc/client/renderer/TextBufferRenderCache$;
/*     */     //   8: aload_0
/*     */     //   9: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   12: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   15: invokevirtual fontRenderer : ()Ljava/lang/String;
/*     */     //   18: ldc_w 'texture'
/*     */     //   21: astore_1
/*     */     //   22: dup
/*     */     //   23: ifnonnull -> 34
/*     */     //   26: pop
/*     */     //   27: aload_1
/*     */     //   28: ifnull -> 41
/*     */     //   31: goto -> 51
/*     */     //   34: aload_1
/*     */     //   35: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   38: ifeq -> 51
/*     */     //   41: new li/cil/oc/client/renderer/font/StaticFontRenderer
/*     */     //   44: dup
/*     */     //   45: invokespecial <init> : ()V
/*     */     //   48: goto -> 58
/*     */     //   51: new li/cil/oc/client/renderer/font/DynamicFontRenderer
/*     */     //   54: dup
/*     */     //   55: invokespecial <init> : ()V
/*     */     //   58: putfield renderer : Lli/cil/oc/client/renderer/font/TextureFontRenderer;
/*     */     //   61: aload_0
/*     */     //   62: invokestatic newBuilder : ()Lcom/google/common/cache/CacheBuilder;
/*     */     //   65: ldc2_w 2
/*     */     //   68: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   71: invokevirtual expireAfterAccess : (JLjava/util/concurrent/TimeUnit;)Lcom/google/common/cache/CacheBuilder;
/*     */     //   74: aload_0
/*     */     //   75: invokevirtual removalListener : (Lcom/google/common/cache/RemovalListener;)Lcom/google/common/cache/CacheBuilder;
/*     */     //   78: invokevirtual build : ()Lcom/google/common/cache/Cache;
/*     */     //   81: putfield cache : Lcom/google/common/cache/Cache;
/*     */     //   84: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #18	-> 0
/*     */     //   #19	-> 8
/*     */     //   #20	-> 9
/*     */     //   #21	-> 51
/*     */     //   #19	-> 58
/*     */     //   #23	-> 61
/*     */     //   #24	-> 65
/*     */     //   #25	-> 74
/*     */     //   #27	-> 78
/*     */     //   #23	-> 81
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	85	0	this	Lli/cil/oc/client/renderer/TextBufferRenderCache$;
/*     */   } private Cache<TextBufferRenderData, Object> cache() {
/*  23 */     return this.cache;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private TextBufferRenderData currentBuffer()
/*     */   {
/*  30 */     return this.currentBuffer; } private void currentBuffer_$eq(TextBufferRenderData x$1) { this.currentBuffer = x$1; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(TextBufferRenderData buffer) {
/*  37 */     currentBuffer_$eq(buffer);
/*  38 */     compileOrDraw(BoxesRunTime.unboxToInt(cache().get(currentBuffer(), this)));
/*     */   }
/*     */ 
/*     */   
/*     */   private Object compileOrDraw(int list) {
/*  43 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileOrDraw: entering (aka: wasntme)").toString());
/*     */     
/*  45 */     scala.Predef$.MODULE$.refArrayOps((Object[])currentBuffer().data().buffer()).foreach((Function1)new TextBufferRenderCache$$anonfun$compileOrDraw$1());
/*     */ 
/*     */ 
/*     */     
/*  49 */     boolean doCompile = !li.cil.oc.util.RenderState$.MODULE$.compilingDisplayList();
/*  50 */     if (doCompile) {
/*  51 */       currentBuffer().dirty_$eq(false);
/*  52 */       GL11.glNewList(list, 4865);
/*     */       
/*  54 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileOrDraw: glNewList").toString());
/*     */     } 
/*     */     
/*  57 */     renderer().drawBuffer(currentBuffer().data(), currentBuffer().viewport()._1$mcI$sp(), currentBuffer().viewport()._2$mcI$sp());
/*     */     
/*  59 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileOrDraw: drawString").toString());
/*     */     
/*  61 */     if (doCompile) {
/*  62 */       GL11.glEndList();
/*     */       
/*  64 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileOrDraw: glEndList").toString());
/*     */     } 
/*     */ 
/*     */     
/*  68 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileOrDraw: leaving").toString());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     GL11.glCallList(list);
/*     */     
/*  75 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileOrDraw: glCallList").toString()); return currentBuffer().dirty() ? BoxesRunTime.boxToBoolean(true) : BoxedUnit.UNIT;
/*     */   }
/*     */   public final class TextBufferRenderCache$$anonfun$compileOrDraw$1 extends AbstractFunction1<int[], BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final void apply(int[] line) {
/*     */       TextBufferRenderCache$.MODULE$.renderer().generateChars(line);
/*     */     } }
/*     */   
/*     */   public int call() {
/*  84 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".call: entering (aka: wasntme)").toString());
/*     */     
/*  86 */     int list = GLAllocation.func_74526_a(1);
/*  87 */     currentBuffer().dirty_$eq(true);
/*     */     
/*  89 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".call: leaving").toString());
/*     */     
/*  91 */     return list;
/*     */   }
/*     */   
/*     */   public void onRemoval(RemovalNotification e) {
/*  95 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".onRemoval: entering (aka: wasntme)").toString());
/*     */     
/*  97 */     GLAllocation.func_74523_b(BoxesRunTime.unboxToInt(e.getValue()));
/*     */     
/*  99 */     li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".onRemoval: leaving").toString());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onTick(TickEvent.ClientTickEvent e) {
/* 107 */     cache().cleanUp();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\TextBufferRenderCache$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */