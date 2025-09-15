/*   */ package li.cil.oc.client.renderer.markdown.segment;
/*   */ 
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001\0313Q!\001\002\001\tA\021Ac\025;sS.,G\017\033:pk\036D7+Z4nK:$(BA\002\005\003\035\031XmZ7f]RT!!\002\004\002\0215\f'o\0333po:T!a\002\005\002\021I,g\016Z3sKJT!!\003\006\002\r\rd\027.\0328u\025\tYA\"\001\002pG*\021QBD\001\004G&d'\"A\b\002\0051L7C\001\001\022!\t\0212#D\001\003\023\t!\"AA\006UKb$8+Z4nK:$\b\"\003\f\001\005\003\005\013\021\002\r\034\003\031\001\030M]3oi\016\001\001C\001\n\032\023\tQ\"AA\004TK\036lWM\034;\n\005Y\031\002\"C\017\001\005\003\005\013\021\002\020)\003\021!X\r\037;\021\005})cB\001\021$\033\005\t#\"\001\022\002\013M\034\027\r\\1\n\005\021\n\023A\002)sK\022,g-\003\002'O\t11\013\036:j]\036T!\001J\021\n\005u\031\002\"\002\026\001\t\003Y\023A\002\037j]&$h\bF\002-[9\002\"A\005\001\t\013YI\003\031\001\r\t\013uI\003\031\001\020\t\013A\002A\021K\031\002\r\031|'/\\1u+\005\021\004CA\0329\033\005!$BA\0337\003\021a\027M\\4\013\003]\nAA[1wC&\021a\005\016\005\006u\001!\teO\001\ti>\034FO]5oOR\021a\004\020\005\006ae\002\r!\020\t\003}\ts!a\020!\016\003\021I!!\021\003\002\0315\013'o[;q\r>\024X.\031;\n\005\r#%!\002,bYV,\027BA#\"\005-)e.^7fe\006$\030n\0348")
/*   */ public class StrikethroughSegment extends TextSegment {
/* 6 */   public StrikethroughSegment(Segment parent, String text) { super(parent, text); } public String format() {
/* 7 */     return EnumChatFormatting.STRIKETHROUGH.toString();
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
/*   */     //   42: ldc '~~'
/*   */     //   44: aastore
/*   */     //   45: dup
/*   */     //   46: iconst_1
/*   */     //   47: ldc '~~'
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
/*   */     //   127: ldc '[prefix{m}]'
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
/*   */     //   0	178	0	this	Lli/cil/oc/client/renderer/markdown/segment/StrikethroughSegment;
/*   */     //   0	178	1	format	Lscala/Enumeration$Value;
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\StrikethroughSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */