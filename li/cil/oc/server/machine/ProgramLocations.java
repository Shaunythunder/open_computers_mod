/*    */ package li.cil.oc.server.machine;
/*    */ @ScalaSignature(bytes = "\006\001A;Q!\001\002\t\0025\t\001\003\025:pOJ\fW\016T8dCRLwN\\:\013\005\r!\021aB7bG\"Lg.\032\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t\001\002K]8he\006lGj\\2bi&|gn]\n\003\037I\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007\"B\r\020\t\003Q\022A\002\037j]&$h\bF\001\016\021\035arB1A\005\006u\tQ#\031:dQ&$Xm\031;ve\026dunY1uS>t7/F\001\037!\021yBEJ\027\016\003\001R!!\t\022\002\0175,H/\0312mK*\0211\005F\001\013G>dG.Z2uS>t\027BA\023!\005\ri\025\r\035\t\003O)r!a\005\025\n\005%\"\022A\002)sK\022,g-\003\002,Y\t11\013\036:j]\036T!!\013\013\021\t}!cE\n\005\007_=\001\013Q\002\020\002-\005\0248\r[5uK\016$XO]3M_\016\fG/[8og\002Bq!M\bC\002\023\025!'A\bhY>\024\027\r\034'pG\006$\030n\0348t+\005i\003B\002\033\020A\0035Q&\001\thY>\024\027\r\034'pG\006$\030n\0348tA!)ag\004C\001o\005Q\021\r\0323NCB\004\030N\\4\025\taZTh\020\t\003'eJ!A\017\013\003\tUs\027\016\036\005\006yU\002\rAJ\001\baJ|wM]1n\021\025qT\0071\001'\003\025a\027MY3m\021\025\001U\0071\001B\0035\t'o\0315ji\026\034G/\036:fgB\0311C\021\024\n\005\r#\"A\003\037sKB,\027\r^3e}!)Qi\004C\001\r\006Yq-\032;NCB\004\030N\\4t)\t9e\nE\002I\023.k\021AI\005\003\025\n\022\001\"\023;fe\006\024G.\032\t\005'13c%\003\002N)\t1A+\0369mKJBQa\024#A\002\031\nA\"\031:dQ&$Xm\031;ve\026\004")
/*    */ public final class ProgramLocations { public static Iterable<Tuple2<String, String>> getMappings(String paramString) {
/*    */     return ProgramLocations$.MODULE$.getMappings(paramString);
/*    */   } public static void addMapping(String paramString1, String paramString2, Seq<String> paramSeq) {
/*    */     ProgramLocations$.MODULE$.addMapping(paramString1, paramString2, paramSeq);
/*    */   } public static Map<String, String> globalLocations() {
/*    */     return ProgramLocations$.MODULE$.globalLocations();
/*    */   }
/*    */   public static Map<String, Map<String, String>> architectureLocations() {
/*    */     return ProgramLocations$.MODULE$.architectureLocations();
/*    */   }
/*    */   public final class ProgramLocations$$anonfun$addMapping$1 extends AbstractFunction1<String, Map<String, String>> implements Serializable { public static final long serialVersionUID = 0L;
/* 14 */     public final Map<String, String> apply(String x$1) { return (Map<String, String>)((MapLike)ProgramLocations$.MODULE$.architectureLocations().getOrElseUpdate(x$1, (Function0)new ProgramLocations$$anonfun$addMapping$1$$anonfun$apply$1(this))).$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(this.program$1), this.label$1)); } private final String program$1; private final String label$1; public ProgramLocations$$anonfun$addMapping$1(String program$1, String label$1) {} public final class ProgramLocations$$anonfun$addMapping$1$$anonfun$apply$1 extends AbstractFunction0<Map<String, String>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<String, String> apply() { return Map$.MODULE$.empty(); }
/*    */        public ProgramLocations$$anonfun$addMapping$1$$anonfun$apply$1(ProgramLocations$$anonfun$addMapping$1 $outer) {} } }
/*    */   public final class ProgramLocations$$anonfun$getMappings$1 extends AbstractFunction0<Iterable<Nothing$>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final Iterable<Nothing$> apply() {
/* 18 */       return (Iterable<Nothing$>)package$.MODULE$.Iterable().empty();
/*    */     } }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\ProgramLocations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */