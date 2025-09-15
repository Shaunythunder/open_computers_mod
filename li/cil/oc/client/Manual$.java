/*     */ package li.cil.oc.client;
/*     */ 
/*     */ import li.cil.oc.api.manual.ContentProvider;
/*     */ import li.cil.oc.api.manual.ImageProvider;
/*     */ import li.cil.oc.api.manual.PathProvider;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.NonLocalReturnControl;
/*     */ 
/*     */ public final class Manual$ implements ManualAPI {
/*     */   public static final Manual$ MODULE$;
/*     */   private final String LanguageKey;
/*     */   private final String FallbackLanguage;
/*     */   private final Buffer<Manual.Tab> tabs;
/*     */   
/*  23 */   private Manual$() { MODULE$ = this;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  32 */     this.tabs = (Buffer<Manual.Tab>)scala.collection.mutable.Buffer$.MODULE$.empty();
/*     */     
/*  34 */     this.pathProviders = (Buffer<PathProvider>)scala.collection.mutable.Buffer$.MODULE$.empty();
/*     */     
/*  36 */     this.contentProviders = (Buffer<ContentProvider>)scala.collection.mutable.Buffer$.MODULE$.empty();
/*     */     
/*  38 */     this.imageProviders = (Buffer<Tuple2<String, ImageProvider>>)scala.collection.mutable.Buffer$.MODULE$.empty();
/*     */     
/*  40 */     this.history = new Stack();
/*     */     
/*  42 */     reset(); }
/*     */   private final Buffer<PathProvider> pathProviders;
/*     */   private final Buffer<ContentProvider> contentProviders;
/*  45 */   private final Buffer<Tuple2<String, ImageProvider>> imageProviders; private final Stack<Manual.History> history; public final String LanguageKey() { return "%LANGUAGE%"; } public final String FallbackLanguage() { return "en_US"; } public Buffer<Manual.Tab> tabs() { return this.tabs; } public void addTab(TabIconRenderer renderer, String tooltip, String path) { tabs().$plus$eq(new Manual.Tab(renderer, scala.Option$.MODULE$.apply(tooltip), path));
/*  46 */     if (tabs().length() > 7)
/*  47 */       li.cil.oc.OpenComputers$.MODULE$.log().warn("Gosh I'm popular! Too many tabs were added to the OpenComputers in-game manual, so some won't be shown. In case this actually happens, let me know and I'll look into making them scrollable or something...");  } public Buffer<PathProvider> pathProviders() { return this.pathProviders; }
/*     */   public Buffer<ContentProvider> contentProviders() { return this.contentProviders; }
/*     */   public Buffer<Tuple2<String, ImageProvider>> imageProviders() { return this.imageProviders; }
/*     */   public Stack<Manual.History> history() { return this.history; }
/*     */   public void addProvider(PathProvider provider) {
/*  52 */     pathProviders().$plus$eq(provider);
/*     */   }
/*     */   
/*     */   public void addProvider(ContentProvider provider) {
/*  56 */     contentProviders().$plus$eq(provider);
/*     */   }
/*     */   
/*     */   public void addProvider(String prefix, ImageProvider provider) {
/*  60 */     imageProviders().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(Strings.isNullOrEmpty(prefix) ? "" : (new StringBuilder()).append(prefix).append(":").toString()), provider));
/*     */   }
/*     */   
/*  63 */   public String pathFor(ItemStack stack) { Object object = new Object(); try {
/*  64 */       pathProviders().foreach((Function1)new Manual$$anonfun$pathFor$1(stack, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (String)nonLocalReturnControl.value();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  72 */     return null; } public final class Manual$$anonfun$pathFor$1 extends AbstractFunction1<PathProvider, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final ItemStack stack$1; private final Object nonLocalReturnKey1$1; public Manual$$anonfun$pathFor$1(ItemStack stack$1, Object nonLocalReturnKey1$1) {} public final void apply(PathProvider provider) { String path; try {  } finally { Exception exception = null; }  if (path == null)
/*     */         return;  throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, path); } }
/*  75 */   public String pathFor(World world, int x, int y, int z) { Object object = new Object(); try {
/*  76 */       pathProviders().foreach((Function1)new Manual$$anonfun$pathFor$2(world, x, y, z, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (String)nonLocalReturnControl.value();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  84 */     return null; } public final class Manual$$anonfun$pathFor$2 extends AbstractFunction1<PathProvider, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final World world$1; private final int x$2; private final int y$1; private final int z$1; private final Object nonLocalReturnKey2$1; public Manual$$anonfun$pathFor$2(World world$1, int x$2, int y$1, int z$1, Object nonLocalReturnKey2$1) {} public final void apply(PathProvider provider) { String path; try {  } finally { Exception exception = null; }
/*     */        if (path == null)
/*     */         return;  throw new NonLocalReturnControl(this.nonLocalReturnKey2$1, path); } }
/*  88 */   public Iterable<String> contentFor(String path) { String cleanPath = Files.simplifyPath(path);
/*  89 */     String language = FMLCommonHandler.instance().getCurrentLanguage();
/*  90 */     return (Iterable<String>)li$cil$oc$client$Manual$$contentForWithRedirects(cleanPath.replaceAll("%LANGUAGE%", language), li$cil$oc$client$Manual$$contentForWithRedirects$default$2())
/*  91 */       .orElse((Function0)new Manual$$anonfun$contentFor$1(cleanPath))
/*  92 */       .orNull(scala.Predef$.MODULE$.$conforms()); } public final class Manual$$anonfun$contentFor$1 extends AbstractFunction0<Option<Iterable<String>>> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String cleanPath$1; public final Option<Iterable<String>> apply() { return Manual$.MODULE$.li$cil$oc$client$Manual$$contentForWithRedirects(this.cleanPath$1.replaceAll("%LANGUAGE%", "en_US"), Manual$.MODULE$.li$cil$oc$client$Manual$$contentForWithRedirects$default$2()); }
/*     */     public Manual$$anonfun$contentFor$1(String cleanPath$1) {} }
/*  95 */   public ImageRenderer imageFor(String href) { Object object = new Object(); try {
/*  96 */       ((TraversableLike)imageProviders().reverse()).withFilter((Function1)new Manual$$anonfun$imageFor$1()).foreach((Function1)new Manual$$anonfun$imageFor$2(href, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (ImageRenderer)nonLocalReturnControl.value();
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     return null; } public final class Manual$$anonfun$imageFor$1 extends AbstractFunction1<Tuple2<String, ImageProvider>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Manual$$anonfun$imageFor$2 extends AbstractFunction1<Tuple2<String, ImageProvider>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final String href$1; private final Object nonLocalReturnKey3$1; public final void apply(Tuple2 x$1) { // Byte code:
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
/*     */       //   34	65	80	finally }
/*     */     public Manual$$anonfun$imageFor$2(String href$1, Object nonLocalReturnKey3$1) {} }
/* 110 */   public void openFor(EntityPlayer player) { if ((player.func_130014_f_()).field_72995_K) {
/* 111 */       player.openGui(li.cil.oc.OpenComputers$.MODULE$, li.cil.oc.common.GuiType$.MODULE$.Manual().id(), player.func_130014_f_(), 0, 0, 0);
/*     */     } }
/*     */ 
/*     */   
/*     */   public void reset() {
/* 116 */     history().clear();
/* 117 */     (new String[2])[0] = ""; (new String[2])[1] = "/index.md"; history().push(new Manual.History((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { "%LANGUAGE%" }, )), Manual.History$.MODULE$.$lessinit$greater$default$2()));
/*     */   }
/*     */   
/*     */   public void navigate(String path) {
/* 121 */     GuiScreen guiScreen = (Minecraft.func_71410_x()).field_71462_r;
/* 122 */     if (guiScreen instanceof Manual) { Manual manual = (Manual)guiScreen; manual.pushPage(path); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 123 */     else { history().push(new Manual.History(path, Manual.History$.MODULE$.$lessinit$greater$default$2())); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String makeRelative(String path, String base) {
/* 130 */     int splitAt = base.lastIndexOf('/');
/* 131 */     return path.startsWith("/") ? path : ((splitAt >= 0) ? (new StringBuilder()).append((new StringOps(scala.Predef$.MODULE$.augmentString(base))).splitAt(splitAt)._1()).append("/").append(path).toString() : 
/* 132 */       path);
/*     */   }
/*     */   public List<String> li$cil$oc$client$Manual$$contentForWithRedirects$default$2() {
/* 135 */     return scala.collection.immutable.List$.MODULE$.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Option<Iterable<String>> li$cil$oc$client$Manual$$contentForWithRedirects(String path, List seen) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: aload_1
/*     */     //   2: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   5: ifeq -> 108
/*     */     //   8: new scala/Some
/*     */     //   11: dup
/*     */     //   12: getstatic scala/collection/convert/WrapAsJava$.MODULE$ : Lscala/collection/convert/WrapAsJava$;
/*     */     //   15: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   18: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   21: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   24: iconst_1
/*     */     //   25: anewarray java/lang/String
/*     */     //   28: dup
/*     */     //   29: iconst_0
/*     */     //   30: ldc_w 'Redirection loop: '
/*     */     //   33: aastore
/*     */     //   34: checkcast [Ljava/lang/Object;
/*     */     //   37: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   40: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   43: checkcast scala/collection/TraversableLike
/*     */     //   46: aload_2
/*     */     //   47: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   50: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   53: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   58: checkcast scala/collection/TraversableLike
/*     */     //   61: getstatic scala/package$.MODULE$ : Lscala/package$;
/*     */     //   64: invokevirtual Iterable : ()Lscala/collection/Iterable$;
/*     */     //   67: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   70: iconst_1
/*     */     //   71: anewarray java/lang/String
/*     */     //   74: dup
/*     */     //   75: iconst_0
/*     */     //   76: aload_1
/*     */     //   77: aastore
/*     */     //   78: checkcast [Ljava/lang/Object;
/*     */     //   81: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   84: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/GenTraversable;
/*     */     //   87: getstatic scala/collection/Iterable$.MODULE$ : Lscala/collection/Iterable$;
/*     */     //   90: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   93: invokeinterface $plus$plus : (Lscala/collection/GenTraversableOnce;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   98: checkcast scala/collection/Iterable
/*     */     //   101: invokevirtual asJavaIterable : (Lscala/collection/Iterable;)Ljava/lang/Iterable;
/*     */     //   104: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   107: areturn
/*     */     //   108: aload_0
/*     */     //   109: aload_1
/*     */     //   110: invokespecial doContentLookup : (Ljava/lang/String;)Lscala/Option;
/*     */     //   113: astore #4
/*     */     //   115: aload #4
/*     */     //   117: instanceof scala/Some
/*     */     //   120: ifeq -> 247
/*     */     //   123: aload #4
/*     */     //   125: checkcast scala/Some
/*     */     //   128: astore #5
/*     */     //   130: aload #5
/*     */     //   132: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   135: checkcast java/lang/Iterable
/*     */     //   138: astore #6
/*     */     //   140: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */     //   143: aload #6
/*     */     //   145: invokevirtual iterableAsScalaIterable : (Ljava/lang/Iterable;)Lscala/collection/Iterable;
/*     */     //   148: invokeinterface headOption : ()Lscala/Option;
/*     */     //   153: astore #8
/*     */     //   155: aload #8
/*     */     //   157: instanceof scala/Some
/*     */     //   160: ifeq -> 229
/*     */     //   163: aload #8
/*     */     //   165: checkcast scala/Some
/*     */     //   168: astore #9
/*     */     //   170: aload #9
/*     */     //   172: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   175: checkcast java/lang/String
/*     */     //   178: astore #10
/*     */     //   180: aload #10
/*     */     //   182: invokevirtual toLowerCase : ()Ljava/lang/String;
/*     */     //   185: ldc_w '#redirect '
/*     */     //   188: invokevirtual startsWith : (Ljava/lang/String;)Z
/*     */     //   191: ifeq -> 229
/*     */     //   194: aload_0
/*     */     //   195: aload #10
/*     */     //   197: ldc_w '#redirect '
/*     */     //   200: invokevirtual length : ()I
/*     */     //   203: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   206: aload_1
/*     */     //   207: invokevirtual makeRelative : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   210: aload_2
/*     */     //   211: aload_1
/*     */     //   212: getstatic scala/collection/immutable/List$.MODULE$ : Lscala/collection/immutable/List$;
/*     */     //   215: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */     //   218: invokevirtual $colon$plus : (Ljava/lang/Object;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */     //   221: checkcast scala/collection/immutable/List
/*     */     //   224: astore_2
/*     */     //   225: astore_1
/*     */     //   226: goto -> 0
/*     */     //   229: new scala/Some
/*     */     //   232: dup
/*     */     //   233: aload #6
/*     */     //   235: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   238: astore #11
/*     */     //   240: aload #11
/*     */     //   242: astore #7
/*     */     //   244: goto -> 252
/*     */     //   247: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   250: astore #7
/*     */     //   252: aload #7
/*     */     //   254: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 0
/*     */     //   #137	-> 108
/*     */     //   #138	-> 115
/*     */     //   #139	-> 155
/*     */     //   #140	-> 194
/*     */     //   #141	-> 229
/*     */     //   #138	-> 240
/*     */     //   #143	-> 247
/*     */     //   #137	-> 252
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	255	0	this	Lli/cil/oc/client/Manual$;
/*     */     //   0	255	1	path	Ljava/lang/String;
/*     */     //   0	255	2	seen	Lscala/collection/immutable/List;
/*     */     //   140	115	6	content	Ljava/lang/Iterable;
/*     */     //   180	75	10	line	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Option<Iterable<String>> doContentLookup(String path) {
/* 147 */     Object object = new Object(); try {
/* 148 */       contentProviders().foreach((Function1)new Manual$$anonfun$doContentLookup$1(path, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         return (Option<Iterable<String>>)nonLocalReturnControl.value();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 156 */     return (Option<Iterable<String>>)scala.None$.MODULE$;
/*     */   }
/*     */   
/*     */   public final class Manual$$anonfun$doContentLookup$1 extends AbstractFunction1<ContentProvider, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String path$1;
/*     */     private final Object nonLocalReturnKey4$1;
/*     */     
/*     */     public Manual$$anonfun$doContentLookup$1(String path$1, Object nonLocalReturnKey4$1) {}
/*     */     
/*     */     public final void apply(ContentProvider provider) {
/*     */       Iterable lines;
/*     */       try {
/*     */       
/*     */       } finally {
/*     */         Exception exception = null;
/*     */       } 
/*     */       if (lines == null)
/*     */         return; 
/*     */       throw new NonLocalReturnControl(this.nonLocalReturnKey4$1, new Some(lines));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\Manual$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */