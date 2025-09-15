/*    */ package li.cil.oc.client.renderer.markdown.segment;@ScalaSignature(bytes = "\006\001\005\035baB\001\003!\003\r\t!\005\002\021\005\006\034\030n\031+fqR\034VmZ7f]RT!a\001\003\002\017M,w-\\3oi*\021QAB\001\t[\006\0248\016Z8x]*\021q\001C\001\te\026tG-\032:fe*\021\021BC\001\007G2LWM\034;\013\005-a\021AA8d\025\tia\"A\002dS2T\021aD\001\003Y&\034\001aE\002\001%a\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007CA\r\033\033\005\021\021BA\016\003\005\035\031VmZ7f]RDQ!\b\001\005\002y\ta\001J5oSR$C#A\020\021\005M\001\023BA\021\025\005\021)f.\033;\t\017\r\002!\031!C\013I\0051!M]3bWN,\022!\n\t\004M-jS\"A\024\013\005!J\023!C5n[V$\030M\0317f\025\tQC#\001\006d_2dWm\031;j_:L!\001L\024\003\007M+G\017\005\002\024]%\021q\006\006\002\005\007\"\f'\017\003\0042\001\001\006i!J\001\bEJ,\027m[:!\021\035\031\004A1A\005\026Q\nQ\001\\5tiN,\022!\016\t\004M-2\004CA\034=\033\005A$BA\035;\003\021a\027M\\4\013\003m\nAA[1wC&\021Q\b\017\002\007'R\024\030N\\4\t\r}\002\001\025!\0046\003\031a\027n\035;tA!A\021\t\001EC\002\023E!)\001\006s_>$\bK]3gSb,\022a\021\t\003\t\036s!aE#\n\005\031#\022A\002)sK\022,g-\003\002>\021*\021a\t\006\005\t\025\002A\t\021)Q\005\007\006Y!o\\8u!J,g-\033=!\021\025a\005\001\"\021N\003\025qW\r\037;Y)\021q\025kU+\021\005My\025B\001)\025\005\rIe\016\036\005\006%.\003\rAT\001\007S:$WM\034;\t\013Q[\005\031\001(\002\0215\f\007pV5ei\"DQaB&A\002Y\003\"aV0\016\003aS!!\027.\002\007\035,\030N\003\002\n7*\021A,X\001\n[&tWm\031:bMRT\021AX\001\004]\026$\030B\0011Y\00511uN\034;SK:$WM]3s\021\025\021\007\001\"\021d\003\025qW\r\037;Z)\021qE-\0324\t\013I\013\007\031\001(\t\013Q\013\007\031\001(\t\013\035\t\007\031\001,\t\013!\004A\021I5\002\021Q|7\013\036:j]\036$\"a\0216\t\013-<\007\031\0017\002\r\031|'/\\1u!\ti\027O\004\002o_6\tA!\003\002q\t\005aQ*\031:lkB4uN]7bi&\021!o\035\002\006-\006dW/Z\005\003iR\0211\"\0228v[\026\024\030\r^5p]\")a\017\001D\t\005\006!A/\032=u\021\025A\b\001\"\005z\003]IwM\\8sK2+\027\rZ5oO^C\027\016^3ta\006\034W-F\001{!\t\03120\003\002})\t9!i\\8mK\006t\007\"\002@\001\t#y\030A\0037j]\026DU-[4iiR\031a*!\001\t\013\035i\b\031\001,\t\017\005\025\001A\"\005\002\b\005Y1\017\036:j]\036<\026\016\032;i)\025q\025\021BA\007\021\035\tY!a\001A\002\r\013\021a\035\005\007\017\005\r\001\031\001,\t\017\005E\001\001\"\005\002\024\005AQ.\031=DQ\006\0248\017F\005O\003+\t9\"!\007\002\036!9\0211BA\b\001\004\031\005B\002+\002\020\001\007a\nC\004\002\034\005=\001\031\001(\002\0315\f\007\020T5oK^KG\r\0365\t\r\035\ty\0011\001W\021\035\t\t\003\001C\t\003G\t\021cY8naV$Xm\026:ba&sG-\0328u)\rq\025Q\005\005\007\017\005}\001\031\001,")
/*    */ public interface BasicTextSegment extends Segment { void li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$breaks_$eq(Set paramSet); void li$cil$oc$client$renderer$markdown$segment$BasicTextSegment$_setter_$lists_$eq(Set paramSet); Set<Object> breaks();
/*    */   Set<String> lists();
/*    */   String rootPrefix();
/*    */   int nextX(int paramInt1, int paramInt2, FontRenderer paramFontRenderer);
/*    */   int nextY(int paramInt1, int paramInt2, FontRenderer paramFontRenderer);
/*    */   String toString(Enumeration.Value paramValue);
/*    */   String text();
/*    */   boolean ignoreLeadingWhitespace();
/*    */   int lineHeight(FontRenderer paramFontRenderer);
/*    */   int stringWidth(String paramString, FontRenderer paramFontRenderer);
/*    */   int maxChars(String paramString, int paramInt1, int paramInt2, FontRenderer paramFontRenderer);
/*    */   int computeWrapIndent(FontRenderer paramFontRenderer);
/*    */   public final class BasicTextSegment$$anonfun$nextX$1 extends AbstractFunction1<Object, Object> implements Serializable { public final boolean apply(char x$1) {
/* 15 */       return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$1));
/*    */     } public static final long serialVersionUID = 0L; public BasicTextSegment$$anonfun$nextX$1(BasicTextSegment $outer) {} }
/*    */   public final class BasicTextSegment$$anonfun$nextX$2 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final boolean apply(char x$2) {
/* 19 */       return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$2));
/*    */     }
/*    */     
/*    */     public BasicTextSegment$$anonfun$nextX$2(BasicTextSegment $outer) {} }
/*    */ 
/*    */   
/*    */   public final class BasicTextSegment$$anonfun$nextY$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(char x$3) {
/* 29 */       return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$3));
/*    */     }
/*    */     public BasicTextSegment$$anonfun$nextY$1(BasicTextSegment $outer) {} }
/*    */   public final class BasicTextSegment$$anonfun$nextY$2 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final boolean apply(char x$4) {
/* 34 */       return RichChar$.MODULE$.isWhitespace$extension(Predef$.MODULE$.charWrapper(x$4));
/*    */     }
/*    */     
/*    */     public BasicTextSegment$$anonfun$nextY$2(BasicTextSegment $outer) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\BasicTextSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */