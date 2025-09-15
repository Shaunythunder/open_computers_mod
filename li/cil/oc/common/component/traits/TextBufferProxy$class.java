/*     */ package li.cil.oc.common.component.traits;
/*     */ import li.cil.oc.util.PackedColor;
/*     */ import li.cil.oc.util.PackedColor$;
/*     */ import scala.Predef$;
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.RichInt$;
/*     */ 
/*     */ public abstract class TextBufferProxy$class {
/*     */   public static int getWidth(TextBufferProxy $this) {
/*  11 */     return $this.data().width();
/*     */   } public static void $init$(TextBufferProxy $this) {} public static int getHeight(TextBufferProxy $this) {
/*  13 */     return $this.data().height();
/*     */   }
/*     */   public static boolean setColorDepth(TextBufferProxy $this, TextBuffer.ColorDepth depth) {
/*  16 */     if (depth.ordinal() > $this.getMaximumColorDepth().ordinal())
/*  17 */       throw new IllegalArgumentException("unsupported depth"); 
/*  18 */     return $this.data().format_$eq(PackedColor$Depth$.MODULE$.format(depth));
/*     */   }
/*     */   public static TextBuffer.ColorDepth getColorDepth(TextBufferProxy $this) {
/*  21 */     return $this.data().format().depth();
/*     */   }
/*     */   public static void onBufferPaletteChange(TextBufferProxy $this, int index) {}
/*     */   public static void setPaletteColor(TextBufferProxy $this, int index, int color) {
/*  25 */     PackedColor.ColorFormat colorFormat = $this.data().format();
/*  26 */     if (colorFormat instanceof PackedColor.MutablePaletteFormat) { PackedColor.MutablePaletteFormat mutablePaletteFormat = (PackedColor.MutablePaletteFormat)colorFormat;
/*  27 */       mutablePaletteFormat.update(index, color);
/*  28 */       $this.onBufferPaletteChange(index); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }
/*  29 */      throw new Exception("palette not available");
/*     */   }
/*     */   public static int getPaletteColor(TextBufferProxy $this, int index) {
/*  32 */     PackedColor.ColorFormat colorFormat = $this.data().format();
/*  33 */     if (colorFormat instanceof PackedColor.MutablePaletteFormat) { PackedColor.MutablePaletteFormat mutablePaletteFormat = (PackedColor.MutablePaletteFormat)colorFormat; return mutablePaletteFormat.apply(index); }
/*  34 */      throw new Exception("palette not available");
/*     */   }
/*     */   public static void onBufferColorChange(TextBufferProxy $this) {}
/*     */   
/*     */   public static void setForegroundColor(TextBufferProxy $this, int color) {
/*  39 */     $this.setForegroundColor(color, false);
/*     */   }
/*     */   public static void setForegroundColor(TextBufferProxy $this, int color, boolean isFromPalette) {
/*  42 */     PackedColor.Color value = new PackedColor.Color(color, isFromPalette);
/*  43 */     PackedColor.Color color1 = value; if ($this.data().foreground() == null) { $this.data().foreground(); if (color1 != null)
/*  44 */       { $this.data().foreground_$eq(value);
/*  45 */         $this.onBufferColorChange(); return; }  } else if (!$this.data().foreground().equals(color1)) { $this.data().foreground_$eq(value); $this.onBufferColorChange();
/*     */       return; }
/*     */   
/*     */   } public static int getForegroundColor(TextBufferProxy $this) {
/*  49 */     return $this.data().foreground().value();
/*     */   } public static boolean isForegroundFromPalette(TextBufferProxy $this) {
/*  51 */     return $this.data().foreground().isPalette();
/*     */   } public static void setBackgroundColor(TextBufferProxy $this, int color) {
/*  53 */     $this.setBackgroundColor(color, false);
/*     */   }
/*     */   public static void setBackgroundColor(TextBufferProxy $this, int color, boolean isFromPalette) {
/*  56 */     PackedColor.Color value = new PackedColor.Color(color, isFromPalette);
/*  57 */     PackedColor.Color color1 = value; if ($this.data().background() == null) { $this.data().background(); if (color1 != null)
/*  58 */       { $this.data().background_$eq(value);
/*  59 */         $this.onBufferColorChange(); return; }  } else if (!$this.data().background().equals(color1)) { $this.data().background_$eq(value); $this.onBufferColorChange();
/*     */       return; }
/*     */   
/*     */   } public static int getBackgroundColor(TextBufferProxy $this) {
/*  63 */     return $this.data().background().value();
/*     */   } public static boolean isBackgroundFromPalette(TextBufferProxy $this) {
/*  65 */     return $this.data().background().isPalette();
/*     */   }
/*     */   public static void onBufferCopy(TextBufferProxy $this, int col, int row, int w, int h, int tx, int ty) {}
/*     */   
/*     */   public static void copy(TextBufferProxy $this, int col, int row, int w, int h, int tx, int ty) {
/*  70 */     if ($this.data().copy(col, row, w, h, tx, ty))
/*  71 */       $this.onBufferCopy(col, row, w, h, tx, ty); 
/*     */   }
/*     */   public static void onBufferFill(TextBufferProxy $this, int col, int row, int w, int h, int c) {}
/*     */   
/*     */   public static void fill(TextBufferProxy $this, int col, int row, int w, int h, char c) {
/*  76 */     $this.fill(col, row, w, h, c);
/*     */   }
/*     */   public static void fill(TextBufferProxy $this, int col, int row, int w, int h, int c) {
/*  79 */     if ($this.data().fill(col, row, w, h, c))
/*  80 */       $this.onBufferFill(col, row, w, h, c); 
/*     */   }
/*     */   public static void onBufferSet(TextBufferProxy $this, int col, int row, String s, boolean vertical) {}
/*     */   
/*     */   private static String truncate(TextBufferProxy $this, String s, int sLength, int leftOffset, int maxWidth) {
/*  85 */     int subFrom = s.offsetByCodePoints(0, leftOffset);
/*  86 */     int width = package$.MODULE$.min(sLength, maxWidth);
/*  87 */     return (width <= 0) ? "" : (
/*  88 */       (sLength - leftOffset <= width) ? s : 
/*  89 */       s.substring(subFrom, s.offsetByCodePoints(subFrom, width)));
/*     */   }
/*     */   
/*     */   public static void set(TextBufferProxy $this, int col, int row, String s, boolean vertical) {
/*  93 */     int sLength = ExtendedUnicodeHelper.length(s);
/*  94 */     if (col < $this.data().width() && (col >= 0 || -col < sLength)) {
/*     */ 
/*     */ 
/*     */       
/*  98 */       Tuple3 tuple3 = vertical ? (
/*  99 */         (row < 0) ? new Tuple3(BoxesRunTime.boxToInteger(col), BoxesRunTime.boxToInteger(0), truncate($this, s, sLength, -row, $this.data().height())) : 
/* 100 */         new Tuple3(BoxesRunTime.boxToInteger(col), BoxesRunTime.boxToInteger(row), truncate($this, s, sLength, 0, $this.data().height() - row))) : (
/*     */ 
/*     */         
/* 103 */         (col < 0) ? new Tuple3(BoxesRunTime.boxToInteger(0), BoxesRunTime.boxToInteger(row), truncate($this, s, sLength, -col, $this.data().width())) : 
/* 104 */         new Tuple3(BoxesRunTime.boxToInteger(col), BoxesRunTime.boxToInteger(row), truncate($this, s, sLength, 0, $this.data().width() - col))); if (tuple3 != null) {
/*     */         int x = BoxesRunTime.unboxToInt(tuple3._1()), y = BoxesRunTime.unboxToInt(tuple3._2()); String truncated = (String)tuple3._3();
/*     */         Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(y), truncated), tuple31 = tuple32;
/*     */         int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2());
/*     */         String str1 = (String)tuple31._3();
/*     */       } 
/*     */       throw new MatchError(tuple3);
/* 111 */     }  } public static char get(TextBufferProxy $this, int col, int row) { return (char)$this.data().get(col, row); }
/*     */    public static int getCodePoint(TextBufferProxy $this, int col, int row) {
/* 113 */     return $this.data().get(col, row);
/*     */   }
/*     */   public static int getForegroundColor(TextBufferProxy $this, int column, int row) {
/* 116 */     return $this.isForegroundFromPalette(column, row) ? 
/* 117 */       PackedColor$.MODULE$.extractForeground(color($this, column, row)) : 
/*     */ 
/*     */       
/* 120 */       PackedColor$.MODULE$.unpackForeground(color($this, column, row), $this.data().format());
/*     */   }
/*     */   
/*     */   public static boolean isForegroundFromPalette(TextBufferProxy $this, int column, int row) {
/* 124 */     return $this.data().format().isFromPalette(PackedColor$.MODULE$.extractForeground(color($this, column, row)));
/*     */   }
/*     */   public static int getBackgroundColor(TextBufferProxy $this, int column, int row) {
/* 127 */     return $this.isBackgroundFromPalette(column, row) ? 
/* 128 */       PackedColor$.MODULE$.extractBackground(color($this, column, row)) : 
/*     */ 
/*     */       
/* 131 */       PackedColor$.MODULE$.unpackBackground(color($this, column, row), $this.data().format());
/*     */   }
/*     */   
/*     */   public static boolean isBackgroundFromPalette(TextBufferProxy $this, int column, int row) {
/* 135 */     return $this.data().format().isFromPalette(PackedColor$.MODULE$.extractBackground(color($this, column, row)));
/*     */   }
/*     */   public static void rawSetText(TextBufferProxy $this, int col, int row, char[][] text) {
/* 138 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(row), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(row + text.length), $this.data().height())).foreach$mVc$sp((Function1)new TextBufferProxy$$anonfun$rawSetText$1($this, col, row, text));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void rawSetText(TextBufferProxy $this, int col, int row, int[][] text) {
/* 145 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(row), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(row + text.length), $this.data().height())).foreach$mVc$sp((Function1)new TextBufferProxy$$anonfun$rawSetText$2($this, col, row, text));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void rawSetForeground(TextBufferProxy $this, int col, int row, int[][] color) {
/* 152 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(row), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(row + color.length), $this.data().height())).foreach$mVc$sp((Function1)new TextBufferProxy$$anonfun$rawSetForeground$1($this, col, row, color));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void rawSetBackground(TextBufferProxy $this, int col, int row, int[][] color) {
/* 163 */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(row), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(row + color.length), $this.data().height())).foreach$mVc$sp((Function1)new TextBufferProxy$$anonfun$rawSetBackground$1($this, col, row, color));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static short color(TextBufferProxy $this, int column, int row) {
/* 174 */     if (column < 0 || column >= $this.getWidth() || row < 0 || row >= $this.getHeight())
/* 175 */       throw new IndexOutOfBoundsException(); 
/* 176 */     return $this.data().color()[row][column];
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\traits\TextBufferProxy$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */