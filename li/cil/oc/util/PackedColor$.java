/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PackedColor$
/*     */ {
/*     */   public static final PackedColor$ MODULE$;
/*     */   private final int li$cil$oc$util$PackedColor$$rShift32;
/*     */   private final int li$cil$oc$util$PackedColor$$gShift32;
/*     */   private final int li$cil$oc$util$PackedColor$$bShift32;
/*     */   private final int ForegroundShift;
/*     */   private final int BackgroundMask;
/*     */   
/*     */   public int li$cil$oc$util$PackedColor$$rShift32() {
/*  24 */     return this.li$cil$oc$util$PackedColor$$rShift32;
/*  25 */   } public int li$cil$oc$util$PackedColor$$gShift32() { return this.li$cil$oc$util$PackedColor$$gShift32; } public int li$cil$oc$util$PackedColor$$bShift32() {
/*  26 */     return this.li$cil$oc$util$PackedColor$$bShift32;
/*     */   }
/*     */   public Tuple3<Object, Object, Object> li$cil$oc$util$PackedColor$$extract(int value) {
/*  29 */     int r = value >>> li$cil$oc$util$PackedColor$$rShift32() & 0xFF;
/*  30 */     int g = value >>> li$cil$oc$util$PackedColor$$gShift32() & 0xFF;
/*  31 */     int b = value >>> li$cil$oc$util$PackedColor$$bShift32() & 0xFF;
/*  32 */     return new Tuple3(BoxesRunTime.boxToInteger(r), BoxesRunTime.boxToInteger(g), BoxesRunTime.boxToInteger(b));
/*     */   }
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
/*     */   public int ForegroundShift() {
/* 173 */     return this.ForegroundShift; } public int BackgroundMask() {
/* 174 */     return this.BackgroundMask;
/*     */   }
/*     */   public short pack(PackedColor.Color foreground, PackedColor.Color background, PackedColor.ColorFormat format) {
/* 177 */     return (short)((format.deflate(foreground) & 0xFF) << ForegroundShift() | format.deflate(background) & 0xFF);
/*     */   }
/*     */   public int extractForeground(short color) {
/* 180 */     return (color & 0xFFFF) >>> ForegroundShift();
/*     */   } public int extractBackground(short color) {
/* 182 */     return color & BackgroundMask();
/*     */   }
/*     */   public int unpackForeground(short color, PackedColor.ColorFormat format) {
/* 185 */     return format.inflate(extractForeground(color));
/*     */   }
/*     */   
/* 188 */   public int unpackBackground(short color, PackedColor.ColorFormat format) { return format.inflate(extractBackground(color)); } private PackedColor$() {
/* 189 */     MODULE$ = this;
/*     */     this.li$cil$oc$util$PackedColor$$rShift32 = 16;
/*     */     this.li$cil$oc$util$PackedColor$$gShift32 = 8;
/*     */     this.li$cil$oc$util$PackedColor$$bShift32 = 0;
/*     */     this.ForegroundShift = 8;
/*     */     this.BackgroundMask = 255;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\PackedColor$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */