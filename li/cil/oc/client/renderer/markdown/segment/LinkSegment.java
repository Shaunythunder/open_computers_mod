/*    */ package li.cil.oc.client.renderer.markdown.segment;@ScalaSignature(bytes = "\006\001\005Ec!B\001\003\001\021\001\"a\003'j].\034VmZ7f]RT!a\001\003\002\017M,w-\\3oi*\021QAB\001\t[\006\0248\016Z8x]*\021q\001C\001\te\026tG-\032:fe*\021\021BC\001\007G2LWM\034;\013\005-a\021AA8d\025\tia\"A\002dS2T\021aD\001\003Y&\0342\001A\t\026!\t\0212#D\001\003\023\t!\"AA\006UKb$8+Z4nK:$\bC\001\n\027\023\t9\"A\001\nJ]R,'/Y2uSZ,7+Z4nK:$\b\"C\r\001\005\003\005\013\021B\016\037\003\031\001\030M]3oi\016\001\001C\001\n\035\023\ti\"AA\004TK\036lWM\034;\n\005e\031\002\"\003\021\001\005\003\005\013\021B\021,\003\021!X\r\037;\021\005\tBcBA\022'\033\005!#\"A\023\002\013M\034\027\r\\1\n\005\035\"\023A\002)sK\022,g-\003\002*U\t11\013\036:j]\036T!a\n\023\n\005\001\032\002\002C\027\001\005\013\007I\021\001\030\002\007U\024H.F\001\"\021!\001\004A!A!\002\023\t\023\001B;sY\002BQA\r\001\005\002M\na\001P5oSRtD\003\002\0336m]\002\"A\005\001\t\013e\t\004\031A\016\t\013\001\n\004\031A\021\t\0135\n\004\031A\021\t\017e\002!\031!C\007u\005Yan\034:nC2\034u\016\\8s+\005Yt\"\001\037\036\007\031|p\r\003\004?\001\001\006iaO\001\r]>\024X.\0317D_2|'\017\t\005\b\001\002\021\r\021\"\004B\003AqwN]7bY\"{g/\032:D_2|'/F\001C\037\005\031U\004\002\001+\000,Fa!\022\001!\002\033\021\025!\0058pe6\fG\016S8wKJ\034u\016\\8sA!9q\t\001b\001\n\033A\025AC3se>\0248i\0347peV\t\021jD\001K;\021\001q`\0324\t\r1\003\001\025!\004J\003-)'O]8s\007>dwN\035\021\t\0179\003!\031!C\007\037\006yQM\035:pe\"{g/\032:D_2|'/F\001Q\037\005\tV\004\002\001\000V+Faa\025\001!\002\033\001\026\001E3se>\024\bj\034<fe\016{Gn\034:!\021\035)\006A1A\005\016Y\013\001BZ1eKRKW.Z\013\002/>\t\001,\b\002\002i$1!\f\001Q\001\016]\013\021BZ1eKRKW.\032\021\t\021q\003\001R1A\005\nu\0131\"[:MS:\\g+\0317jIV\ta\f\005\002$?&\021\001\r\n\002\b\005>|G.Z1o\021!\021\007\001#A!B\023q\026\001D5t\031&t7NV1mS\022\004\003b\0023\001\001\004%I!Z\001\fY\006\034H\017S8wKJ,G-F\001g!\t\031s-\003\002iI\t!Aj\0348h\021\035Q\007\0011A\005\n-\fq\002\\1ti\"{g/\032:fI~#S-\035\013\003Y>\004\"aI7\n\0059$#\001B+oSRDq\001]5\002\002\003\007a-A\002yIEBaA\035\001!B\0231\027\001\0047bgRDuN^3sK\022\004\003\"\002;\001\t#*\030!B2pY>\024X#\001<\021\007\r:\0300\003\002yI\t1q\n\035;j_:\004\"a\t>\n\005m$#aA%oi\")Q\020\001C!}\0069Ao\\8mi&\004X#A@\021\007\r:\030\005C\004\002\004\001!\t%!\002\002\031=tWj\\;tK\016c\027nY6\025\013y\0139!a\003\t\017\005%\021\021\001a\001s\0061Qn\\;tKbCq!!\004\002\002\001\007\0210\001\004n_V\034X-\027\005\t\003#\001A\021\t\003\002\024\005Yan\034;jMfDuN^3s)\005a\007bBA\f\001\021%\021\021D\001\nM\006$WmQ8m_J$r!_A\016\003?\t\031\003C\004\002\036\005U\001\031A=\002\005\r\f\004bBA\021\003+\001\r!_\001\003GJB\001\"!\n\002\026\001\007\021qE\001\002iB\0311%!\013\n\007\005-BEA\003GY>\fG\017C\004\0020\001!I!!\r\002\023!\fg\016\0327f+JdGc\0017\0024!1Q&!\fA\002\005Bq!a\016\001\t\003\nI$\001\005u_N#(/\0338h)\r\t\0231\b\005\t\003{\t)\0041\001\002@\0051am\034:nCR\004B!!\021\002J9!\0211IA#\033\005!\021bAA$\t\005aQ*\031:lkB4uN]7bi&!\0211JA'\005\0251\026\r\\;f\023\r\ty\005\n\002\f\013:,X.\032:bi&|g\016")
/*    */ public class LinkSegment extends TextSegment implements InteractiveSegment { private final String url;
/*    */   private final int normalColor;
/*    */   private final int normalHoverColor;
/*    */   private final int errorColor;
/*    */   private final int errorHoverColor;
/*    */   private final int fadeTime;
/*    */   private boolean isLinkValid;
/*    */   private long lastHovered;
/*    */   private volatile boolean bitmap$0;
/*    */   
/* 12 */   public Option<InteractiveSegment> checkHovered(int mouseX, int mouseY, int x, int y, int w, int h) { return InteractiveSegment$class.checkHovered(this, mouseX, mouseY, x, y, w, h); } public String url() { return this.url; } public LinkSegment(Segment parent, String text, String url) { super(parent, text); InteractiveSegment$class.$init$(this);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     this.lastHovered = System.currentTimeMillis() - 500L; } private final int normalColor() { return 6750054; } private final int normalHoverColor() { return 11206570; } private final int errorColor() { return 16737894; } private long lastHovered() { return this.lastHovered; } private final int errorHoverColor() { return 16755370; } private final int fadeTime() { return 500; } private boolean isLinkValid$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.isLinkValid = !(!url().startsWith("http://") && !url().startsWith("https://") && Manual.contentFor(Manual$.MODULE$.makeRelative(url(), ((Manual.History)Manual$.MODULE$.history().top()).path())) == null); this.bitmap$0 = true; }  return this.isLinkValid; }  } private boolean isLinkValid() { return this.bitmap$0 ? this.isLinkValid : isLinkValid$lzycompute(); } private void lastHovered_$eq(long x$1) { this.lastHovered = x$1; }
/*    */ 
/*    */   
/* 24 */   public Option<Object> color() { Tuple2.mcII.sp sp = isLinkValid() ? new Tuple2.mcII.sp(6750054, 11206570) : new Tuple2.mcII.sp(16737894, 16755370); if (sp != null) { int color = sp._1$mcI$sp(), hoverColor = sp._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(color, hoverColor), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 25 */       int timeSinceHover = (int)(System.currentTimeMillis() - lastHovered());
/* 26 */       return (timeSinceHover > 500) ? (Option<Object>)new Some(BoxesRunTime.boxToInteger(i)) : 
/* 27 */         (Option<Object>)new Some(BoxesRunTime.boxToInteger(fadeColor(j, i, timeSinceHover / 'Ǵ'))); }
/*    */     
/*    */     throw new MatchError(sp); } public Option<String> tooltip() {
/* 30 */     return Option$.MODULE$.apply(url());
/*    */   }
/*    */   public boolean onMouseClick(int mouseX, int mouseY) {
/* 33 */     if (url().startsWith("http://") || url().startsWith("https://")) { handleUrl(url()); }
/* 34 */     else { Manual$.MODULE$.navigate(Manual$.MODULE$.makeRelative(url(), ((Manual.History)Manual$.MODULE$.history().top()).path())); }
/* 35 */      return true;
/*    */   }
/*    */   public void notifyHover() {
/* 38 */     lastHovered_$eq(System.currentTimeMillis());
/*    */   }
/*    */   
/* 41 */   private int fadeColor(int c1, int c2, float t) { Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(c1 >>> 16 & 0xFF), BoxesRunTime.boxToInteger(c1 >>> 8 & 0xFF), BoxesRunTime.boxToInteger(c1 & 0xFF)); if (tuple3 != null) { int r1 = BoxesRunTime.unboxToInt(tuple3._1()), g1 = BoxesRunTime.unboxToInt(tuple3._2()), b1 = BoxesRunTime.unboxToInt(tuple3._3()); Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(r1), BoxesRunTime.boxToInteger(g1), BoxesRunTime.boxToInteger(b1)), tuple31 = tuple32; int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/* 42 */       Tuple3 tuple33 = new Tuple3(BoxesRunTime.boxToInteger(c2 >>> 16 & 0xFF), BoxesRunTime.boxToInteger(c2 >>> 8 & 0xFF), BoxesRunTime.boxToInteger(c2 & 0xFF)); if (tuple33 != null) { int r2 = BoxesRunTime.unboxToInt(tuple33._1()), g2 = BoxesRunTime.unboxToInt(tuple33._2()), b2 = BoxesRunTime.unboxToInt(tuple33._3()); Tuple3 tuple35 = new Tuple3(BoxesRunTime.boxToInteger(r2), BoxesRunTime.boxToInteger(g2), BoxesRunTime.boxToInteger(b2)), tuple34 = tuple35; int m = BoxesRunTime.unboxToInt(tuple34._1()), n = BoxesRunTime.unboxToInt(tuple34._2()), i1 = BoxesRunTime.unboxToInt(tuple34._3());
/* 43 */         Tuple3 tuple36 = new Tuple3(BoxesRunTime.boxToInteger((int)(i + (m - i) * t)), BoxesRunTime.boxToInteger((int)(j + (n - j) * t)), BoxesRunTime.boxToInteger((int)(k + (i1 - k) * t))); if (tuple36 != null) { int r = BoxesRunTime.unboxToInt(tuple36._1()), g = BoxesRunTime.unboxToInt(tuple36._2()), b = BoxesRunTime.unboxToInt(tuple36._3()); Tuple3 tuple38 = new Tuple3(BoxesRunTime.boxToInteger(r), BoxesRunTime.boxToInteger(g), BoxesRunTime.boxToInteger(b)), tuple37 = tuple38; int i2 = BoxesRunTime.unboxToInt(tuple37._1()), i3 = BoxesRunTime.unboxToInt(tuple37._2()), i4 = BoxesRunTime.unboxToInt(tuple37._3());
/* 44 */           return i2 << 16 | i3 << 8 | i4; }
/*    */          throw new MatchError(tuple36); }
/*    */       
/*    */       throw new MatchError(tuple33); }
/*    */     
/*    */     throw new MatchError(tuple3); } private void handleUrl(String url) { try {
/* 50 */       Class<?> desktop = Class.forName("java.awt.Desktop");
/* 51 */       Object instance = desktop.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
/* 52 */       desktop.getMethod("browse", new Class[] { URI.class }).invoke(instance, new Object[] { new URI(url) });
/*    */     } finally {
/*    */       Exception exception = null;
/*    */     }  }
/*    */ 
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
/*    */     //   19: goto -> 99
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   26: ifeq -> 99
/*    */     //   29: new scala/StringContext
/*    */     //   32: dup
/*    */     //   33: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   36: iconst_3
/*    */     //   37: anewarray java/lang/String
/*    */     //   40: dup
/*    */     //   41: iconst_0
/*    */     //   42: ldc_w '['
/*    */     //   45: aastore
/*    */     //   46: dup
/*    */     //   47: iconst_1
/*    */     //   48: ldc_w ']('
/*    */     //   51: aastore
/*    */     //   52: dup
/*    */     //   53: iconst_2
/*    */     //   54: ldc_w ')'
/*    */     //   57: aastore
/*    */     //   58: checkcast [Ljava/lang/Object;
/*    */     //   61: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   64: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */     //   67: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   70: iconst_2
/*    */     //   71: anewarray java/lang/Object
/*    */     //   74: dup
/*    */     //   75: iconst_0
/*    */     //   76: aload_0
/*    */     //   77: invokespecial text : ()Ljava/lang/String;
/*    */     //   80: aastore
/*    */     //   81: dup
/*    */     //   82: iconst_1
/*    */     //   83: aload_0
/*    */     //   84: invokevirtual url : ()Ljava/lang/String;
/*    */     //   87: aastore
/*    */     //   88: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   91: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */     //   94: astore #4
/*    */     //   96: goto -> 239
/*    */     //   99: getstatic li/cil/oc/client/renderer/markdown/MarkupFormat$.MODULE$ : Lli/cil/oc/client/renderer/markdown/MarkupFormat$;
/*    */     //   102: invokevirtual IGWMod : ()Lscala/Enumeration$Value;
/*    */     //   105: aload_2
/*    */     //   106: astore #5
/*    */     //   108: dup
/*    */     //   109: ifnonnull -> 121
/*    */     //   112: pop
/*    */     //   113: aload #5
/*    */     //   115: ifnull -> 129
/*    */     //   118: goto -> 242
/*    */     //   121: aload #5
/*    */     //   123: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   126: ifeq -> 242
/*    */     //   129: aload_0
/*    */     //   130: invokevirtual url : ()Ljava/lang/String;
/*    */     //   133: ldc 'http://'
/*    */     //   135: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   138: ifne -> 153
/*    */     //   141: aload_0
/*    */     //   142: invokevirtual url : ()Ljava/lang/String;
/*    */     //   145: ldc 'https://'
/*    */     //   147: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   150: ifeq -> 160
/*    */     //   153: aload_0
/*    */     //   154: invokespecial text : ()Ljava/lang/String;
/*    */     //   157: goto -> 237
/*    */     //   160: new scala/StringContext
/*    */     //   163: dup
/*    */     //   164: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   167: iconst_4
/*    */     //   168: anewarray java/lang/String
/*    */     //   171: dup
/*    */     //   172: iconst_0
/*    */     //   173: ldc_w '[link{'
/*    */     //   176: aastore
/*    */     //   177: dup
/*    */     //   178: iconst_1
/*    */     //   179: ldc_w ':'
/*    */     //   182: aastore
/*    */     //   183: dup
/*    */     //   184: iconst_2
/*    */     //   185: ldc_w '}]'
/*    */     //   188: aastore
/*    */     //   189: dup
/*    */     //   190: iconst_3
/*    */     //   191: ldc_w ' [link{}]'
/*    */     //   194: aastore
/*    */     //   195: checkcast [Ljava/lang/Object;
/*    */     //   198: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   201: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */     //   204: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   207: iconst_3
/*    */     //   208: anewarray java/lang/Object
/*    */     //   211: dup
/*    */     //   212: iconst_0
/*    */     //   213: ldc_w 'OpenComputers'
/*    */     //   216: aastore
/*    */     //   217: dup
/*    */     //   218: iconst_1
/*    */     //   219: aload_0
/*    */     //   220: invokevirtual url : ()Ljava/lang/String;
/*    */     //   223: aastore
/*    */     //   224: dup
/*    */     //   225: iconst_2
/*    */     //   226: aload_0
/*    */     //   227: invokespecial text : ()Ljava/lang/String;
/*    */     //   230: aastore
/*    */     //   231: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */     //   234: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */     //   237: astore #4
/*    */     //   239: aload #4
/*    */     //   241: areturn
/*    */     //   242: new scala/MatchError
/*    */     //   245: dup
/*    */     //   246: aload_2
/*    */     //   247: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   250: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 0
/*    */     //   #60	-> 2
/*    */     //   #61	-> 99
/*    */     //   #62	-> 129
/*    */     //   #63	-> 160
/*    */     //   #62	-> 237
/*    */     //   #59	-> 239
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	251	0	this	Lli/cil/oc/client/renderer/markdown/segment/LinkSegment;
/*    */     //   0	251	1	format	Lscala/Enumeration$Value;
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\LinkSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */