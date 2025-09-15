/*    */ package li.cil.oc.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ExtendedUnicodeHelper
/*    */ {
/*    */   public static int length(String s) {
/* 12 */     return s.codePointCount(0, s.length());
/*    */   }
/*    */   
/*    */   public static String reverse(String s) {
/* 16 */     StringBuilder sb = new StringBuilder();
/* 17 */     for (int i = s.length() - 1; i >= 0; i--) {
/* 18 */       char c = s.charAt(i);
/* 19 */       if (Character.isLowSurrogate(c) && i > 0) {
/* 20 */         i--;
/* 21 */         char c2 = s.charAt(i);
/* 22 */         if (Character.isHighSurrogate(c2)) {
/* 23 */           sb.append(c2).append(c);
/*    */         } else {
/*    */           
/* 26 */           sb.append(c).append(c2);
/*    */         } 
/*    */       } else {
/* 29 */         sb.append(c);
/*    */       } 
/*    */     } 
/* 32 */     return sb.toString();
/*    */   }
/*    */   
/*    */   public static String substring(String s, int start, int end) {
/* 36 */     return s.substring(s
/* 37 */         .offsetByCodePoints(0, start), s
/* 38 */         .offsetByCodePoints(0, end));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ExtendedUnicodeHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */