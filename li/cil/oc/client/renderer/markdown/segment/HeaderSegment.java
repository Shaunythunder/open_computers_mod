/*    */ package li.cil.oc.client.renderer.markdown.segment;
/*    */ @ScalaSignature(bytes = "\006\001u3Q!\001\002\001\tA\021Q\002S3bI\026\0248+Z4nK:$(BA\002\005\003\035\031XmZ7f]RT!!\002\004\002\0215\f'o\0333po:T!a\002\005\002\021I,g\016Z3sKJT!!\003\006\002\r\rd\027.\0328u\025\tYA\"\001\002pG*\021QBD\001\004G&d'\"A\b\002\0051L7C\001\001\022!\t\0212#D\001\003\023\t!\"AA\006UKb$8+Z4nK:$\b\"\003\f\001\005\003\005\013\021\002\r\034\003\031\001\030M]3oi\016\001\001C\001\n\032\023\tQ\"AA\004TK\036lWM\034;\n\005Y\031\002\"C\017\001\005\003\005\013\021\002\020)\003\021!X\r\037;\021\005})cB\001\021$\033\005\t#\"\001\022\002\013M\034\027\r\\1\n\005\021\n\023A\002)sK\022,g-\003\002'O\t11\013\036:j]\036T!\001J\021\n\005u\031\002\002\003\026\001\005\013\007I\021A\026\002\0131,g/\0327\026\0031\002\"\001I\027\n\0059\n#aA%oi\"A\001\007\001B\001B\003%A&\001\004mKZ,G\016\t\005\006e\001!\taM\001\007y%t\027\016\036 \025\tQ*dg\016\t\003%\001AQAF\031A\002aAQ!H\031A\002yAQAK\031A\0021Bq!\017\001C\002\023%!(A\005g_:$8kY1mKV\t1\b\005\002!y%\021Q(\t\002\006\r2|\027\r\036\005\007\001\001\013\021B\036\002\025\031|g\016^*dC2,\007\005C\003B\001\021E#)A\003tG\006dW-F\001D!\r\001CiO\005\003\013\006\022AaU8nK\")q\t\001C)\021\0061am\034:nCR,\022!\023\t\003\025>k\021a\023\006\003\0316\013A\001\\1oO*\ta*\001\003kCZ\f\027B\001\024L\021\025\t\006\001\"\021S\003!!xn\025;sS:<GC\001\020T\021\0259\005\0131\001U!\t)\026L\004\002W/6\tA!\003\002Y\t\005aQ*\031:lkB4uN]7bi&\021!l\027\002\006-\006dW/Z\005\0039\006\0221\"\0228v[\026\024\030\r^5p]\002")
/*    */ public class HeaderSegment extends TextSegment {
/*    */   private final int level;
/*    */   
/*  6 */   public int level() { return this.level; } private final float fontScale; public HeaderSegment(Segment parent, String text, int level) { super(parent, text);
/*  7 */     this.fontScale = package$.MODULE$.max(2, 5 - level) / 2.0F; } private float fontScale() { return this.fontScale; }
/*    */    public Some<Object> scale() {
/*  9 */     return new Some(BoxesRunTime.boxToFloat(fontScale()));
/*    */   } public String format() {
/* 11 */     return EnumChatFormatting.UNDERLINE.toString();
/*    */   }
/*    */   
/*    */   public String toString(Enumeration.Value format) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: astore_2
/*    */     //   2: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*    */     //   5: invokevirtual Markdown : ()Lscala/Enumeration$Value;
/*    */     //   8: aload_2
/*    */     //   9: astore_3
/*    */     //   10: dup
/*    */     //   11: ifnonnull -> 22
/*    */     //   14: pop
/*    */     //   15: aload_3
/*    */     //   16: ifnull -> 29
/*    */     //   19: goto -> 114
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 114
/*    */     //   29: new scala/StringContext
/*    */     //   32: dup
/*    */     //   33: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   36: iconst_3
/*    */     //   37: anewarray java/lang/String
/*    */     //   40: dup
/*    */     //   41: iconst_0
/*    */     //   42: ldc ''
/*    */     //   44: aastore
/*    */     //   45: dup
/*    */     //   46: iconst_1
/*    */     //   47: ldc ' '
/*    */     //   49: aastore
/*    */     //   50: dup
/*    */     //   51: iconst_2
/*    */     //   52: ldc ''
/*    */     //   54: aastore
/*    */     //   55: checkcast [Ljava/lang/Object;
/*    */     //   58: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   61: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */     //   64: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   67: iconst_2
/*    */     //   68: anewarray java/lang/Object
/*    */     //   71: dup
/*    */     //   72: iconst_0
/*    */     //   73: new scala/collection/immutable/StringOps
/*    */     //   76: dup
/*    */     //   77: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   80: ldc '#'
/*    */     //   82: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   85: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   88: aload_0
/*    */     //   89: invokevirtual level : ()I
/*    */     //   92: invokevirtual $times : (I)Ljava/lang/String;
/*    */     //   95: aastore
/*    */     //   96: dup
/*    */     //   97: iconst_1
/*    */     //   98: aload_0
/*    */     //   99: invokespecial text : ()Ljava/lang/String;
/*    */     //   102: aastore
/*    */     //   103: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   106: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */     //   109: astore #4
/*    */     //   111: goto -> 196
/*    */     //   114: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*    */     //   117: invokevirtual IGWMod : ()Lscala/Enumeration$Value;
/*    */     //   120: aload_2
/*    */     //   121: astore #5
/*    */     //   123: dup
/*    */     //   124: ifnonnull -> 136
/*    */     //   127: pop
/*    */     //   128: aload #5
/*    */     //   130: ifnull -> 144
/*    */     //   133: goto -> 199
/*    */     //   136: aload #5
/*    */     //   138: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   141: ifeq -> 199
/*    */     //   144: new scala/StringContext
/*    */     //   147: dup
/*    */     //   148: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   151: iconst_2
/*    */     //   152: anewarray java/lang/String
/*    */     //   155: dup
/*    */     //   156: iconst_0
/*    */     //   157: ldc '[prefix{l}]'
/*    */     //   159: aastore
/*    */     //   160: dup
/*    */     //   161: iconst_1
/*    */     //   162: ldc ' [prefix{}]'
/*    */     //   164: aastore
/*    */     //   165: checkcast [Ljava/lang/Object;
/*    */     //   168: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   171: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */     //   174: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   177: iconst_1
/*    */     //   178: anewarray java/lang/Object
/*    */     //   181: dup
/*    */     //   182: iconst_0
/*    */     //   183: aload_0
/*    */     //   184: invokespecial text : ()Ljava/lang/String;
/*    */     //   187: aastore
/*    */     //   188: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   191: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */     //   194: astore #4
/*    */     //   196: aload #4
/*    */     //   198: areturn
/*    */     //   199: new scala/MatchError
/*    */     //   202: dup
/*    */     //   203: aload_2
/*    */     //   204: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   207: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 0
/*    */     //   #14	-> 2
/*    */     //   #15	-> 114
/*    */     //   #13	-> 196
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	208	0	this	Lli/cil/oc/client/renderer/markdown/segment/HeaderSegment;
/*    */     //   0	208	1	format	Lscala/Enumeration$Value;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\HeaderSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */