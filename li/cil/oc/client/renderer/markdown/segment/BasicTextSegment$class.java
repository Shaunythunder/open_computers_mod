/*    */ package li.cil.oc.client.renderer.markdown.segment;
/*    */ 
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import scala.Predef$;
/*    */ 
/*    */ public abstract class BasicTextSegment$class {
/*  7 */   public static void $init$(BasicTextSegment $this) { $this.li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$breaks_$eq((Set)Predef$.MODULE$.Set().apply((Seq)Predef$.MODULE$.wrapCharArray(new char[] { ' ', '.', ',', ':', ';', '!', '?', '_', '=', '-', '+', '*', '/', '\\' })));
/*  8 */     (new String[2])[0] = "- "; (new String[2])[1] = "* "; $this.li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$lists_$eq((Set)Predef$.MODULE$.Set().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[2]))); } public static String rootPrefix(BasicTextSegment $this) {
/*  9 */     return (String)(new StringOps(Predef$.MODULE$.augmentString(((TextSegment)$this.root()).text()))).take(2);
/*    */   }
/*    */   public static int nextX(BasicTextSegment $this, int indent, int maxWidth, FontRenderer renderer) {
/* 12 */     if ($this.isLast()) return 0; 
/* 13 */     int currentX = indent;
/* 14 */     String chars = $this.text();
/* 15 */     if ($this.ignoreLeadingWhitespace() && indent == 0) chars = (String)(new StringOps(Predef$.MODULE$.augmentString(chars))).dropWhile((Function1)new BasicTextSegment$$anonfun$nextX$1($this)); 
/* 16 */     int wrapIndent = $this.computeWrapIndent(renderer);
/* 17 */     int numChars = $this.maxChars(chars, maxWidth - indent, maxWidth - wrapIndent, renderer);
/* 18 */     while (chars.length() > numChars) {
/* 19 */       chars = (String)(new StringOps(Predef$.MODULE$.augmentString((String)(new StringOps(Predef$.MODULE$.augmentString(chars))).drop(numChars)))).dropWhile((Function1)new BasicTextSegment$$anonfun$nextX$2($this));
/* 20 */       numChars = $this.maxChars(chars, maxWidth - wrapIndent, maxWidth - wrapIndent, renderer);
/* 21 */       currentX = wrapIndent;
/*    */     } 
/* 23 */     return currentX + $this.stringWidth(chars, renderer);
/*    */   }
/*    */   
/*    */   public static int nextY(BasicTextSegment $this, int indent, int maxWidth, FontRenderer renderer) {
/* 27 */     int lines = 0;
/* 28 */     String chars = $this.text();
/* 29 */     if ($this.ignoreLeadingWhitespace() && indent == 0) chars = (String)(new StringOps(Predef$.MODULE$.augmentString(chars))).dropWhile((Function1)new BasicTextSegment$$anonfun$nextY$1($this)); 
/* 30 */     int wrapIndent = $this.computeWrapIndent(renderer);
/* 31 */     int numChars = $this.maxChars(chars, maxWidth - indent, maxWidth - wrapIndent, renderer);
/* 32 */     while (chars.length() > numChars) {
/* 33 */       lines++;
/* 34 */       chars = (String)(new StringOps(Predef$.MODULE$.augmentString((String)(new StringOps(Predef$.MODULE$.augmentString(chars))).drop(numChars)))).dropWhile((Function1)new BasicTextSegment$$anonfun$nextY$2($this));
/* 35 */       numChars = $this.maxChars(chars, maxWidth - wrapIndent, maxWidth - wrapIndent, renderer);
/*    */     } 
/* 37 */     if ($this.isLast()) lines++; 
/* 38 */     return lines * $this.lineHeight(renderer);
/*    */   }
/*    */   public static String toString(BasicTextSegment $this, Enumeration.Value format) {
/* 41 */     return $this.text();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean ignoreLeadingWhitespace(BasicTextSegment $this) {
/* 47 */     return true;
/*    */   } public static int lineHeight(BasicTextSegment $this, FontRenderer renderer) {
/* 49 */     return Document$.MODULE$.lineHeight(renderer);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int maxChars(BasicTextSegment $this, String s, int maxWidth, int maxLineWidth, FontRenderer renderer) {
/* 54 */     int pos = -1;
/* 55 */     int lastBreak = -1;
/* 56 */     int fullWidth = $this.stringWidth(s, renderer);
/* 57 */     while (pos < s.length()) {
/* 58 */       pos++;
/* 59 */       int width = $this.stringWidth((String)(new StringOps(Predef$.MODULE$.augmentString(s))).take(pos), renderer);
/* 60 */       boolean exceedsLineLength = (width >= maxWidth);
/* 61 */       if (exceedsLineLength) {
/* 62 */         boolean mayUseFullLine = (maxWidth == maxLineWidth);
/* 63 */         boolean canFitInLine = (fullWidth <= maxLineWidth);
/* 64 */         boolean matchesFullLine = (fullWidth == maxLineWidth);
/* 65 */         if (lastBreak >= 0) {
/* 66 */           return lastBreak + 1;
/*    */         }
/* 68 */         if (mayUseFullLine && matchesFullLine) {
/* 69 */           return s.length();
/*    */         }
/* 71 */         if (canFitInLine && !mayUseFullLine) {
/* 72 */           return 0;
/*    */         }
/* 74 */         return pos - 1;
/*    */       } 
/* 76 */       if (pos < s.length() && $this.breaks().contains(BoxesRunTime.boxToCharacter(s.charAt(pos)))) lastBreak = pos; 
/*    */     } 
/* 78 */     return pos;
/*    */   }
/*    */   public static int computeWrapIndent(BasicTextSegment $this, FontRenderer renderer) {
/* 81 */     return $this.lists().contains($this.rootPrefix()) ? renderer.func_78256_a($this.rootPrefix()) : 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\BasicTextSegment$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */