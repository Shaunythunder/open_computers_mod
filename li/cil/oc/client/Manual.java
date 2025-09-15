/*     */ package li.cil.oc.client;
/*     */ import li.cil.oc.api.manual.ContentProvider;
/*     */ import li.cil.oc.api.manual.ImageProvider;
/*     */ import li.cil.oc.api.manual.PathProvider;
/*     */ import li.cil.oc.api.manual.TabIconRenderer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ @ScalaSignature(bytes = "\006\001\tet!B\001\003\021\003Y\021AB'b]V\fGN\003\002\004\t\00511\r\\5f]RT!!\002\004\002\005=\034'BA\004\t\003\r\031\027\016\034\006\002\023\005\021A.[\002\001!\taQ\"D\001\003\r\025q!\001#\001\020\005\031i\025M\\;bYN\031Q\002\005\r\021\005E1R\"\001\n\013\005M!\022\001\0027b]\036T\021!F\001\005U\0064\030-\003\002\030%\t1qJ\0316fGR\004\"!\007\020\016\003iQ!a\007\017\002\r\021,G/Y5m\025\tiB!A\002ba&L!a\b\016\003\0235\013g.^1m\003BK\005\"B\021\016\t\003\021\023A\002\037j]&$h\bF\001\f\021\035!SB1A\005\006\025\n1\002T1oOV\fw-Z&fsV\taeD\001(C\005A\023AC\023M\003:;U+Q$FK!1!&\004Q\001\016\031\nA\002T1oOV\fw-Z&fs\002Bq\001L\007C\002\023\025Q&\001\tGC2d'-Y2l\031\006tw-^1hKV\tafD\0010C\005\001\024!B3o?V\033\006B\002\032\016A\0035a&A\tGC2d'-Y2l\031\006tw-^1hK\0022A\001N\007\001k\t9\001*[:u_JL8CA\0327!\t9$(D\0019\025\005I\024!B:dC2\f\027BA\0369\005\031\te.\037*fM\"AQh\rBC\002\023\005a(\001\003qCRDW#A \021\005\001\033eBA\034B\023\t\021\005(\001\004Qe\026$WMZ\005\003\t\026\023aa\025;sS:<'B\001\"9\021!95G!A!\002\023y\024!\0029bi\"\004\003\002C%4\005\003\007I\021\001&\002\r=4gm]3u+\005Y\005CA\034M\023\ti\005HA\002J]RD\001bT\032\003\002\004%\t\001U\001\013_\03247/\032;`I\025\fHCA)U!\t9$+\003\002Tq\t!QK\\5u\021\035)f*!AA\002-\0131\001\037\0232\021!96G!A!B\023Y\025aB8gMN,G\017\t\005\006CM\"\t!\027\013\0045rk\006CA.4\033\005i\001\"B\037Y\001\004y\004bB%Y!\003\005\raS\004\b?6\t\t\021#\001a\003\035A\025n\035;pef\004\"aW1\007\017Qj\021\021!E\001EN\021\021M\016\005\006C\005$\t\001\032\013\002A\"9a-YI\001\n\0039\027a\007\023mKN\034\030N\\5uI\035\024X-\031;fe\022\"WMZ1vYR$#'F\001iU\tY\025nK\001k!\tY\007/D\001m\025\tig.A\005v]\016DWmY6fI*\021q\016O\001\013C:tw\016^1uS>t\027BA9m\005E)hn\0315fG.,GMV1sS\006t7-\032\004\005g6\001AOA\002UC\n\034\"A\035\034\t\021Y\024(Q1A\005\002]\f\001B]3oI\026\024XM]\013\002qB\021\021\020`\007\002u*\0211\020H\001\007[\006tW/\0317\n\005uT(a\004+bE&\033wN\034*f]\022,'/\032:\t\021}\024(\021!Q\001\na\f\021B]3oI\026\024XM\035\021\t\025\005\r!O!b\001\n\003\t)!A\004u_>dG/\0339\026\005\005\035\001\003B\034\002\n}J1!a\0039\005\031y\005\017^5p]\"Q\021q\002:\003\002\003\006I!a\002\002\021Q|w\016\034;ja\002B\001\"\020:\003\006\004%\tA\020\005\t\017J\024\t\021)A\005!1\021E\035C\001\003/!\002\"!\007\002\034\005u\021q\004\t\0037JDaA^A\013\001\004A\b\002CA\002\003+\001\r!a\002\t\ru\n)\0021\001@\021%\t\031#\004b\001\n\003\t)#\001\003uC\n\034XCAA\024!\031\tI#a\r\002\0325\021\0211\006\006\005\003[\ty#A\004nkR\f'\r\\3\013\007\005E\002(\001\006d_2dWm\031;j_:LA!!\016\002,\t1!)\0364gKJD\001\"!\017\016A\003%\021qE\001\006i\006\0247\017\t\005\n\003{i!\031!C\001\003\tQ\002]1uQB\023xN^5eKJ\034XCAA!!\031\tI#a\r\002DA\031\0210!\022\n\007\005\035#P\001\007QCRD\007K]8wS\022,'\017\003\005\002L5\001\013\021BA!\0039\001\030\r\0365Qe>4\030\016Z3sg\002B\021\"a\024\016\005\004%\t!!\025\002!\r|g\016^3oiB\023xN^5eKJ\034XCAA*!\031\tI#a\r\002VA\031\0210a\026\n\007\005e#PA\bD_:$XM\034;Qe>4\030\016Z3s\021!\ti&\004Q\001\n\005M\023!E2p]R,g\016\036)s_ZLG-\032:tA!I\021\021M\007C\002\023\005\0211M\001\017S6\fw-\032)s_ZLG-\032:t+\t\t)\007\005\004\002*\005M\022q\r\t\007o\005%t(!\034\n\007\005-\004H\001\004UkBdWM\r\t\004s\006=\024bAA9u\ni\021*\\1hKB\023xN^5eKJD\001\"!\036\016A\003%\021QM\001\020S6\fw-\032)s_ZLG-\032:tA!I\021\021P\007C\002\023\005\0211P\001\bQ&\034Ho\034:z+\t\ti\bE\003\002*\005}$,\003\003\002\002\006-\"!B*uC\016\\\007\002CAC\033\001\006I!! \002\021!L7\017^8ss\002Bq!!#\016\t\003\nY)\001\004bI\022$\026M\031\013\b#\0065\025qRAI\021\0311\030q\021a\001q\"9\0211AAD\001\004y\004BB\037\002\b\002\007q\bC\004\002\0266!\t%a&\002\027\005$G\r\025:pm&$WM\035\013\004#\006e\005\002CAN\003'\003\r!a\021\002\021A\024xN^5eKJDq!!&\016\t\003\ny\nF\002R\003CC\001\"a'\002\036\002\007\021Q\013\005\b\003+kA\021IAS)\025\t\026qUAV\021\035\tI+a)A\002}\na\001\035:fM&D\b\002CAN\003G\003\r!!\034\t\017\005=V\002\"\021\0022\0069\001/\031;i\r>\024HcA \0024\"A\021QWAW\001\004\t9,A\003ti\006\0347\016\005\003\002:\006\035WBAA^\025\021\ti,a0\002\t%$X-\034\006\005\003\003\f\031-A\005nS:,7M]1gi*\021\021QY\001\004]\026$\030\002BAe\003w\023\021\"\023;f[N#\030mY6\t\017\005=V\002\"\021\002NRIq(a4\002^\006\005\030Q\035\005\t\003#\fY\r1\001\002T\006)qo\034:mIB!\021Q[Am\033\t\t9N\003\003\002R\006}\026\002BAn\003/\024QaV8sY\022Dq!a8\002L\002\0071*A\001y\021\035\t\031/a3A\002-\013\021!\037\005\b\003O\fY\r1\001L\003\005Q\bbBAv\033\021\005\023Q^\001\013G>tG/\0328u\r>\024H\003BAx\003k\004B!EAy%\031\0211\037\n\003\021%#XM]1cY\026Da!PAu\001\004y\004bBA}\033\021\005\0231`\001\tS6\fw-\032$peR!\021Q B\002!\rI\030q`\005\004\005\003Q(!D%nC\036,'+\0328eKJ,'\017C\004\003\006\005]\b\031A \002\t!\024XM\032\005\b\005\023iA\021\tB\006\003\035y\007/\0328G_J$2!\025B\007\021!\021yAa\002A\002\tE\021A\0029mCf,'\017\005\003\003\024\tmQB\001B\013\025\021\021yAa\006\013\t\te\021qX\001\007K:$\030\016^=\n\t\tu!Q\003\002\r\013:$\030\016^=QY\006LXM\035\005\b\005CiA\021\001B\022\003\025\021Xm]3u)\005\t\006b\002B\024\033\021\005#\021F\001\t]\0064\030nZ1uKR\031\021Ka\013\t\ru\022)\0031\001@\021\035\021y#\004C\001\005c\tA\"\\1lKJ+G.\031;jm\026$Ra\020B\032\005kAa!\020B\027\001\004y\004b\002B\034\005[\001\raP\001\005E\006\034X\rC\004\003<5!IA!\020\002/\r|g\016^3oi\032{'oV5uQJ+G-\033:fGR\034HC\002B \005\003\022\031\005E\0038\003\023\ty\017\003\004>\005s\001\ra\020\005\013\005\013\022I\004%AA\002\t\035\023\001B:fK:\004RA!\023\003Z}rAAa\023\003V9!!Q\nB*\033\t\021yEC\002\003R)\ta\001\020:p_Rt\024\"A\035\n\007\t]\003(A\004qC\016\\\027mZ3\n\t\tm#Q\f\002\005\031&\034HOC\002\003XaBCA!\017\003bA!!1\rB3\033\005q\027b\001B4]\n9A/Y5me\026\034\007b\002B6\033\021%!QN\001\020I>\034uN\034;f]Rdun\\6vaR!!q\bB8\021\031i$\021\016a\001!I!1O\007\022\002\023%!QO\001\"G>tG/\0328u\r>\024x+\033;i%\026$\027N]3diN$C-\0324bk2$HEM\013\003\005oR3Aa\022j\001")
/*     */ public final class Manual { public static String makeRelative(String paramString1, String paramString2) { return Manual$.MODULE$.makeRelative(paramString1, paramString2); } public static void navigate(String paramString) { Manual$.MODULE$.navigate(paramString); } public static void reset() { Manual$.MODULE$.reset(); } public static void openFor(EntityPlayer paramEntityPlayer) { Manual$.MODULE$.openFor(paramEntityPlayer); } public static ImageRenderer imageFor(String paramString) { return Manual$.MODULE$.imageFor(paramString); } public static Iterable<String> contentFor(String paramString) { return Manual$.MODULE$.contentFor(paramString); } public static String pathFor(World paramWorld, int paramInt1, int paramInt2, int paramInt3) { return Manual$.MODULE$.pathFor(paramWorld, paramInt1, paramInt2, paramInt3); } public static String pathFor(ItemStack paramItemStack) { return Manual$.MODULE$.pathFor(paramItemStack); } public static void addProvider(String paramString, ImageProvider paramImageProvider) { Manual$.MODULE$.addProvider(paramString, paramImageProvider); } public static void addProvider(ContentProvider paramContentProvider) { Manual$.MODULE$.addProvider(paramContentProvider); } public static void addProvider(PathProvider paramPathProvider) { Manual$.MODULE$.addProvider(paramPathProvider); } public static void addTab(TabIconRenderer paramTabIconRenderer, String paramString1, String paramString2) { Manual$.MODULE$.addTab(paramTabIconRenderer, paramString1, paramString2); } public static Stack<History> history() { return Manual$.MODULE$.history(); } public static Buffer<Tuple2<String, ImageProvider>> imageProviders() {
/*     */     return Manual$.MODULE$.imageProviders();
/*     */   } public static Buffer<ContentProvider> contentProviders() {
/*     */     return Manual$.MODULE$.contentProviders();
/*     */   } public static Buffer<PathProvider> pathProviders() {
/*     */     return Manual$.MODULE$.pathProviders();
/*     */   } public static Buffer<Tab> tabs() {
/*     */     return Manual$.MODULE$.tabs();
/*     */   } public static String FallbackLanguage() {
/*     */     return Manual$.MODULE$.FallbackLanguage();
/*     */   } public static String LanguageKey() {
/*     */     return Manual$.MODULE$.LanguageKey();
/*  28 */   } public static class History { private final String path; public String path() { return this.path; } private int offset; public int offset() { return this.offset; } public void offset_$eq(int x$1) { this.offset = x$1; } public History(String path, int offset) {} } public static class History$ { public static final History$ MODULE$; public int $lessinit$greater$default$2() { return 0; } public History$() { MODULE$ = this; }
/*     */      } public static class Tab { private final TabIconRenderer renderer; private final Option<String> tooltip; private final String path;
/*  30 */     public TabIconRenderer renderer() { return this.renderer; } public Option<String> tooltip() { return this.tooltip; } public String path() { return this.path; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Tab(TabIconRenderer renderer, Option<String> tooltip, String path) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Manual$$anonfun$pathFor$1
/*     */     extends AbstractFunction1<PathProvider, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final ItemStack stack$1;
/*     */ 
/*     */     
/*     */     private final Object nonLocalReturnKey1$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public Manual$$anonfun$pathFor$1(ItemStack stack$1, Object nonLocalReturnKey1$1) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(PathProvider provider) {
/*     */       String path;
/*     */       try {
/*     */       
/*     */       } finally {
/*  66 */         Exception exception = null;
/*     */       } 
/*     */ 
/*     */       
/*  70 */       if (path == null) return;  throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, path);
/*     */     } } public final class Manual$$anonfun$pathFor$2 extends AbstractFunction1<PathProvider, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final World world$1; private final int x$2; private final int y$1; private final int z$1; private final Object nonLocalReturnKey2$1;
/*     */     public Manual$$anonfun$pathFor$2(World world$1, int x$2, int y$1, int z$1, Object nonLocalReturnKey2$1) {}
/*     */     public final void apply(PathProvider provider) {
/*     */       String path;
/*     */       try {
/*     */       
/*     */       } finally {
/*  78 */         Exception exception = null;
/*     */       } 
/*     */ 
/*     */       
/*  82 */       if (path == null) return;  throw new NonLocalReturnControl(this.nonLocalReturnKey2$1, path);
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class Manual$$anonfun$contentFor$1 extends AbstractFunction0<Option<Iterable<String>>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String cleanPath$1;
/*     */     
/*     */     public final Option<Iterable<String>> apply() {
/*  91 */       return Manual$.MODULE$.li$cil$oc$client$Manual$$contentForWithRedirects(this.cleanPath$1.replaceAll("%LANGUAGE%", "en_US"), Manual$.MODULE$.li$cil$oc$client$Manual$$contentForWithRedirects$default$2());
/*     */     } public Manual$$anonfun$contentFor$1(String cleanPath$1) {} }
/*     */   public final class Manual$$anonfun$imageFor$1 extends AbstractFunction1<Tuple2<String, ImageProvider>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/*     */       boolean bool;
/*  96 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Manual$$anonfun$imageFor$2
/*     */     extends AbstractFunction1<Tuple2<String, ImageProvider>, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final String href$1;
/*     */ 
/*     */     
/*     */     private final Object nonLocalReturnKey3$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(Tuple2 x$1) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: astore_2
/*     */       //   2: aload_2
/*     */       //   3: ifnull -> 71
/*     */       //   6: aload_2
/*     */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   10: checkcast java/lang/String
/*     */       //   13: astore_3
/*     */       //   14: aload_2
/*     */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   18: checkcast li/cil/oc/api/manual/ImageProvider
/*     */       //   21: astore #4
/*     */       //   23: aload_0
/*     */       //   24: getfield href$1 : Ljava/lang/String;
/*     */       //   27: aload_3
/*     */       //   28: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */       //   31: ifeq -> 65
/*     */       //   34: aload #4
/*     */       //   36: new scala/collection/immutable/StringOps
/*     */       //   39: dup
/*     */       //   40: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   43: aload_0
/*     */       //   44: getfield href$1 : Ljava/lang/String;
/*     */       //   47: invokevirtual augmentString : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   50: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   53: aload_3
/*     */       //   54: invokevirtual stripPrefix : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   57: invokeinterface getImage : (Ljava/lang/String;)Lli/cil/oc/api/manual/ImageRenderer;
/*     */       //   62: goto -> 98
/*     */       //   65: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   68: goto -> 108
/*     */       //   71: new scala/MatchError
/*     */       //   74: dup
/*     */       //   75: aload_2
/*     */       //   76: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   79: athrow
/*     */       //   80: astore #7
/*     */       //   82: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */       //   85: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */       //   88: ldc 'An image provider threw an error when queried.'
/*     */       //   90: aload #7
/*     */       //   92: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   97: aconst_null
/*     */       //   98: astore #6
/*     */       //   100: aload #6
/*     */       //   102: ifnonnull -> 111
/*     */       //   105: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   108: astore #5
/*     */       //   110: return
/*     */       //   111: new scala/runtime/NonLocalReturnControl
/*     */       //   114: dup
/*     */       //   115: aload_0
/*     */       //   116: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   119: aload #6
/*     */       //   121: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   124: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #96	-> 0
/*     */       //   #97	-> 23
/*     */       //   #98	-> 34
/*     */       //   #97	-> 65
/*     */       //   #96	-> 71
/*     */       //   #99	-> 80
/*     */       //   #98	-> 80
/*     */       //   #100	-> 82
/*     */       //   #101	-> 97
/*     */       //   #98	-> 98
/*     */       //   #103	-> 100
/*     */       //   #97	-> 108
/*     */       //   #96	-> 110
/*     */       //   #103	-> 111
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	125	0	this	Lli/cil/oc/client/Manual$$anonfun$imageFor$2;
/*     */       //   0	125	1	x$1	Lscala/Tuple2;
/*     */       //   14	111	3	prefix	Ljava/lang/String;
/*     */       //   23	102	4	provider	Lli/cil/oc/api/manual/ImageProvider;
/*     */       //   100	25	6	image	Lli/cil/oc/api/manual/ImageRenderer;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   34	65	80	finally
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Manual$$anonfun$imageFor$2(String href$1, Object nonLocalReturnKey3$1) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Manual$$anonfun$doContentLookup$1
/*     */     extends AbstractFunction1<ContentProvider, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final String path$1;
/*     */ 
/*     */     
/*     */     private final Object nonLocalReturnKey4$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public Manual$$anonfun$doContentLookup$1(String path$1, Object nonLocalReturnKey4$1) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(ContentProvider provider) {
/*     */       Iterable lines;
/*     */       try {
/*     */       
/*     */       } finally {
/* 150 */         Exception exception = null;
/*     */       } 
/*     */ 
/*     */       
/* 154 */       if (lines == null) return;  throw new NonLocalReturnControl(this.nonLocalReturnKey4$1, new Some(lines));
/*     */     }
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\Manual.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */