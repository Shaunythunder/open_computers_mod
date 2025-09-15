/*     */ package li.cil.oc.client.renderer.gui;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Tuple4;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class BufferRenderer$ {
/*     */   public static final BufferRenderer$ MODULE$;
/*     */   private final int margin;
/*     */   
/*     */   public int margin() {
/*  11 */     return this.margin;
/*     */   } private final int innerMargin; private Option<TextureManager> textureManager; private int displayLists; public int innerMargin() {
/*  13 */     return this.innerMargin;
/*     */   }
/*  15 */   private Option<TextureManager> textureManager() { return this.textureManager; } private void textureManager_$eq(Option<TextureManager> x$1) { this.textureManager = x$1; }
/*     */   
/*  17 */   private int displayLists() { return this.displayLists; } private void displayLists_$eq(int x$1) { this.displayLists = x$1; }
/*     */    public synchronized void init(TextureManager tm) {
/*  19 */     if (textureManager().isEmpty()) {
/*  20 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".displayLists: entering (aka: wasntme)").toString());
/*     */       
/*  22 */       textureManager_$eq((Option<TextureManager>)new Some(tm));
/*  23 */       displayLists_$eq(GLAllocation.func_74526_a(2));
/*     */       
/*  25 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".displayLists: leaving").toString());
/*  26 */       li.cil.oc.client.Textures$.MODULE$.init(tm);
/*     */     } 
/*     */   }
/*  29 */   public boolean compileBackground$default$3() { return false; }
/*  30 */   public void compileBackground(int bufferWidth, int bufferHeight, boolean forRobot) { if (textureManager().isDefined()) {
/*  31 */       li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileBackground: entering (aka: wasntme)").toString());
/*     */       
/*  33 */       int innerWidth = innerMargin() * 2 + bufferWidth;
/*  34 */       int innerHeight = innerMargin() * 2 + bufferHeight;
/*     */       
/*  36 */       GL11.glNewList(displayLists(), 4864);
/*     */       
/*  38 */       ((TextureManager)textureManager().get()).func_110577_a(li.cil.oc.client.Textures$.MODULE$.guiBorders());
/*     */       
/*  40 */       GL11.glBegin(7);
/*     */       
/*  42 */       int margin = forRobot ? 2 : 7;
/*  43 */       Tuple4 tuple4 = forRobot ? new Tuple4(BoxesRunTime.boxToInteger(5), BoxesRunTime.boxToInteger(7), BoxesRunTime.boxToInteger(9), BoxesRunTime.boxToInteger(11)) : new Tuple4(BoxesRunTime.boxToInteger(0), BoxesRunTime.boxToInteger(7), BoxesRunTime.boxToInteger(9), BoxesRunTime.boxToInteger(16)); if (tuple4 != null) { int c0 = BoxesRunTime.unboxToInt(tuple4._1()), c1 = BoxesRunTime.unboxToInt(tuple4._2()), c2 = BoxesRunTime.unboxToInt(tuple4._3()), c3 = BoxesRunTime.unboxToInt(tuple4._4()); Tuple4 tuple42 = new Tuple4(BoxesRunTime.boxToInteger(c0), BoxesRunTime.boxToInteger(c1), BoxesRunTime.boxToInteger(c2), BoxesRunTime.boxToInteger(c3)), tuple41 = tuple42; int i = BoxesRunTime.unboxToInt(tuple41._1()), j = BoxesRunTime.unboxToInt(tuple41._2()), k = BoxesRunTime.unboxToInt(tuple41._3()), m = BoxesRunTime.unboxToInt(tuple41._4());
/*     */ 
/*     */         
/*  46 */         drawBorder(
/*  47 */             0.0D, 0.0D, margin, margin, 
/*  48 */             i, i, j, j);
/*  49 */         drawBorder(
/*  50 */             margin, 0.0D, innerWidth, margin, 
/*  51 */             j + 0.25D, i, k - 0.25D, j);
/*  52 */         drawBorder((
/*  53 */             margin + innerWidth), 0.0D, margin, margin, 
/*  54 */             k, i, m, j);
/*     */ 
/*     */         
/*  57 */         drawBorder(
/*  58 */             0.0D, margin, margin, innerHeight, 
/*  59 */             i, j + 0.25D, j, k - 0.25D);
/*  60 */         drawBorder(
/*  61 */             margin, margin, innerWidth, innerHeight, 
/*  62 */             j + 0.25D, j + 0.25D, k - 0.25D, k - 0.25D);
/*  63 */         drawBorder((
/*  64 */             margin + innerWidth), margin, margin, innerHeight, 
/*  65 */             k, j + 0.25D, m, k - 0.25D);
/*     */ 
/*     */         
/*  68 */         drawBorder(
/*  69 */             0.0D, (margin + innerHeight), margin, margin, 
/*  70 */             i, k, j, m);
/*  71 */         drawBorder(
/*  72 */             margin, (margin + innerHeight), innerWidth, margin, 
/*  73 */             j + 0.25D, k, k - 0.25D, m);
/*  74 */         drawBorder((
/*  75 */             margin + innerWidth), (margin + innerHeight), margin, margin, 
/*  76 */             k, k, m, m);
/*     */         
/*  78 */         GL11.glEnd();
/*     */         
/*  80 */         GL11.glEndList();
/*     */         
/*  82 */         li.cil.oc.util.RenderState$.MODULE$.checkError((new StringBuilder()).append(getClass().getName()).append(".compileBackground: leaving").toString()); }
/*     */       else
/*     */       { throw new MatchError(tuple4); }
/*     */     
/*  86 */     }  } public void drawBackground() { if (textureManager().isDefined()) {
/*  87 */       GL11.glCallList(displayLists());
/*     */     } }
/*     */ 
/*     */   
/*     */   public boolean drawText(TextBuffer screen) {
/*  92 */     GL11.glPushAttrib(256);
/*  93 */     GL11.glDepthMask(false);
/*  94 */     boolean changed = screen.renderText();
/*  95 */     GL11.glPopAttrib();
/*  96 */     return textureManager().isDefined() ? changed : false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void drawBorder(double x, double y, double w, double h, double u1, double v1, double u2, double v2) {
/* 101 */     double u1d = u1 / 16.0D;
/* 102 */     double u2d = u2 / 16.0D;
/* 103 */     double v1d = v1 / 16.0D;
/* 104 */     double v2d = v2 / 16.0D;
/* 105 */     GL11.glTexCoord2d(u1d, v2d);
/* 106 */     GL11.glVertex3d(x, y + h, 0.0D);
/* 107 */     GL11.glTexCoord2d(u2d, v2d);
/* 108 */     GL11.glVertex3d(x + w, y + h, 0.0D);
/* 109 */     GL11.glTexCoord2d(u2d, v1d);
/* 110 */     GL11.glVertex3d(x + w, y, 0.0D);
/* 111 */     GL11.glTexCoord2d(u1d, v1d);
/* 112 */     GL11.glVertex3d(x, y, 0.0D);
/*     */   } private BufferRenderer$() {
/* 114 */     MODULE$ = this;
/*     */     this.margin = 7;
/*     */     this.innerMargin = 1;
/*     */     this.textureManager = (Option<TextureManager>)scala.None$.MODULE$;
/*     */     this.displayLists = 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\gui\BufferRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */