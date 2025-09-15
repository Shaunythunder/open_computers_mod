/*   */ package li.cil.oc.client.renderer.markdown.segment;
/*   */ 
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001\0313Q!\001\002\001\tA\0211BQ8mIN+w-\\3oi*\0211\001B\001\bg\026<W.\0328u\025\t)a!\001\005nCJ\\Gm\\<o\025\t9\001\"\001\005sK:$WM]3s\025\tI!\"\001\004dY&,g\016\036\006\003\0271\t!a\\2\013\0055q\021aA2jY*\tq\"\001\002mSN\021\001!\005\t\003%Mi\021AA\005\003)\t\0211\002V3yiN+w-\\3oi\"Ia\003\001B\001B\003%\001dG\001\007a\006\024XM\034;\004\001A\021!#G\005\0035\t\021qaU3h[\026tG/\003\002\027'!IQ\004\001B\001B\003%a\004K\001\005i\026DH\017\005\002 K9\021\001eI\007\002C)\t!%A\003tG\006d\027-\003\002%C\0051\001K]3eK\032L!AJ\024\003\rM#(/\0338h\025\t!\023%\003\002\036'!)!\006\001C\001W\0051A(\0338jiz\"2\001L\027/!\t\021\002\001C\003\027S\001\007\001\004C\003\036S\001\007a\004C\0031\001\021E\023'\001\004g_Jl\027\r^\013\002eA\0211\007O\007\002i)\021QGN\001\005Y\006twMC\0018\003\021Q\027M^1\n\005\031\"\004\"\002\036\001\t\003Z\024\001\003;p'R\024\030N\\4\025\005ya\004\"\002\031:\001\004i\004C\001 C\035\ty\004)D\001\005\023\t\tE!\001\007NCJ\\W\017\035$pe6\fG/\003\002D\t\n)a+\0317vK&\021Q)\t\002\f\013:,X.\032:bi&|g\016")
/*   */ public class BoldSegment extends TextSegment {
/* 6 */   public BoldSegment(Segment parent, String text) { super(parent, text); } public String format() {
/* 7 */     return EnumChatFormatting.BOLD.toString();
/*   */   }
/*   */   
/*   */   public String toString(Enumeration.Value format) {
/*   */     // Byte code:
/*   */     //   0: aload_1
/*   */     //   1: astore_2
/*   */     //   2: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*   */     //   5: invokevirtual Markdown : ()Lscala/Enumeration$Value;
/*   */     //   8: aload_2
/*   */     //   9: astore_3
/*   */     //   10: dup
/*   */     //   11: ifnonnull -> 22
/*   */     //   14: pop
/*   */     //   15: aload_3
/*   */     //   16: ifnull -> 29
/*   */     //   19: goto -> 84
/*   */     //   22: aload_3
/*   */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   26: ifeq -> 84
/*   */     //   29: new scala/StringContext
/*   */     //   32: dup
/*   */     //   33: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*   */     //   36: iconst_2
/*   */     //   37: anewarray java/lang/String
/*   */     //   40: dup
/*   */     //   41: iconst_0
/*   */     //   42: ldc '**'
/*   */     //   44: aastore
/*   */     //   45: dup
/*   */     //   46: iconst_1
/*   */     //   47: ldc '**'
/*   */     //   49: aastore
/*   */     //   50: checkcast [Ljava/lang/Object;
/*   */     //   53: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*   */     //   56: invokespecial <init> : (Lscala/collection/Seq;)V
/*   */     //   59: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*   */     //   62: iconst_1
/*   */     //   63: anewarray java/lang/Object
/*   */     //   66: dup
/*   */     //   67: iconst_0
/*   */     //   68: aload_0
/*   */     //   69: invokespecial text : ()Ljava/lang/String;
/*   */     //   72: aastore
/*   */     //   73: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*   */     //   76: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*   */     //   79: astore #4
/*   */     //   81: goto -> 166
/*   */     //   84: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*   */     //   87: invokevirtual IGWMod : ()Lscala/Enumeration$Value;
/*   */     //   90: aload_2
/*   */     //   91: astore #5
/*   */     //   93: dup
/*   */     //   94: ifnonnull -> 106
/*   */     //   97: pop
/*   */     //   98: aload #5
/*   */     //   100: ifnull -> 114
/*   */     //   103: goto -> 169
/*   */     //   106: aload #5
/*   */     //   108: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   111: ifeq -> 169
/*   */     //   114: new scala/StringContext
/*   */     //   117: dup
/*   */     //   118: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*   */     //   121: iconst_2
/*   */     //   122: anewarray java/lang/String
/*   */     //   125: dup
/*   */     //   126: iconst_0
/*   */     //   127: ldc '[prefix{l}]'
/*   */     //   129: aastore
/*   */     //   130: dup
/*   */     //   131: iconst_1
/*   */     //   132: ldc ' [prefix{}]'
/*   */     //   134: aastore
/*   */     //   135: checkcast [Ljava/lang/Object;
/*   */     //   138: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*   */     //   141: invokespecial <init> : (Lscala/collection/Seq;)V
/*   */     //   144: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*   */     //   147: iconst_1
/*   */     //   148: anewarray java/lang/Object
/*   */     //   151: dup
/*   */     //   152: iconst_0
/*   */     //   153: aload_0
/*   */     //   154: invokespecial text : ()Ljava/lang/String;
/*   */     //   157: aastore
/*   */     //   158: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*   */     //   161: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*   */     //   164: astore #4
/*   */     //   166: aload #4
/*   */     //   168: areturn
/*   */     //   169: new scala/MatchError
/*   */     //   172: dup
/*   */     //   173: aload_2
/*   */     //   174: invokespecial <init> : (Ljava/lang/Object;)V
/*   */     //   177: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #9	-> 0
/*   */     //   #10	-> 2
/*   */     //   #11	-> 84
/*   */     //   #9	-> 166
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   0	178	0	this	Lli/cil/oc/client/renderer/markdown/segment/BoldSegment;
/*   */     //   0	178	1	format	Lscala/Enumeration$Value;
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\BoldSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */