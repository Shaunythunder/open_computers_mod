/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import li.cil.oc.api.fs.Mode;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Some;
/*     */ import scala.collection.Iterable;
/*     */ 
/*     */ public abstract class VirtualFileSystem$class {
/*     */   public static void $init$(VirtualFileSystem $this) {
/*  14 */     $this.li$cil$oc$server$fs$VirtualFileSystem$_setter_$root_$eq(new VirtualFileSystem.VirtualDirectory($this));
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean exists(VirtualFileSystem $this, String path) {
/*  19 */     return $this.root().get((Iterable<String>)Predef$.MODULE$.wrapRefArray((Object[])$this.segments(path))).isDefined();
/*     */   }
/*     */   public static boolean isDirectory(VirtualFileSystem $this, String path) { boolean bool;
/*  22 */     Option<VirtualFileSystem.VirtualObject> option = $this.root().get((Iterable<String>)Predef$.MODULE$.wrapRefArray((Object[])$this.segments(path)));
/*  23 */     if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject obj = (VirtualFileSystem.VirtualObject)some.x(); bool = obj.isDirectory(); }
/*  24 */     else { bool = false; }
/*     */     
/*     */     return bool; }
/*     */   public static long size(VirtualFileSystem $this, String path) { long l;
/*  28 */     Option<VirtualFileSystem.VirtualObject> option = $this.root().get((Iterable<String>)Predef$.MODULE$.wrapRefArray((Object[])$this.segments(path)));
/*  29 */     if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject obj = (VirtualFileSystem.VirtualObject)some.x(); l = obj.size(); }
/*  30 */     else { l = 0L; }
/*     */     
/*     */     return l; } public static long lastModified(VirtualFileSystem $this, String path) {
/*     */     long l;
/*  34 */     Option<VirtualFileSystem.VirtualObject> option = $this.root().get((Iterable<String>)Predef$.MODULE$.wrapRefArray((Object[])$this.segments(path)));
/*  35 */     if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject obj = (VirtualFileSystem.VirtualObject)some.x(); l = obj.lastModified(); }
/*  36 */     else { l = 0L; }
/*     */     
/*     */     return l;
/*     */   } public static String[] list(VirtualFileSystem $this, String path) {
/*  40 */     Option<VirtualFileSystem.VirtualObject> option = $this.root().get((Iterable<String>)Predef$.MODULE$.wrapRefArray((Object[])$this.segments(path)));
/*  41 */     if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject obj = (VirtualFileSystem.VirtualObject)some.x(); if (obj instanceof VirtualFileSystem.VirtualDirectory) { VirtualFileSystem.VirtualDirectory virtualDirectory = (VirtualFileSystem.VirtualDirectory)obj; return virtualDirectory.list(); }  }
/*  42 */      return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean delete(VirtualFileSystem $this, String path) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokeinterface segments : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   7: astore_2
/*     */     //   8: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   11: aload_2
/*     */     //   12: checkcast [Ljava/lang/Object;
/*     */     //   15: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   18: invokeinterface isEmpty : ()Z
/*     */     //   23: ifeq -> 30
/*     */     //   26: iconst_1
/*     */     //   27: goto -> 136
/*     */     //   30: aload_0
/*     */     //   31: invokeinterface root : ()Lli/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory;
/*     */     //   36: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   39: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   42: aload_2
/*     */     //   43: checkcast [Ljava/lang/Object;
/*     */     //   46: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   49: iconst_1
/*     */     //   50: invokeinterface dropRight : (I)Ljava/lang/Object;
/*     */     //   55: checkcast [Ljava/lang/Object;
/*     */     //   58: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   61: invokevirtual get : (Lscala/collection/Iterable;)Lscala/Option;
/*     */     //   64: astore_3
/*     */     //   65: aload_3
/*     */     //   66: instanceof scala/Some
/*     */     //   69: ifeq -> 131
/*     */     //   72: aload_3
/*     */     //   73: checkcast scala/Some
/*     */     //   76: astore #4
/*     */     //   78: aload #4
/*     */     //   80: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   83: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualObject
/*     */     //   86: astore #5
/*     */     //   88: aload #5
/*     */     //   90: instanceof li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   93: ifeq -> 131
/*     */     //   96: aload #5
/*     */     //   98: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   101: astore #6
/*     */     //   103: aload #6
/*     */     //   105: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   108: aload_2
/*     */     //   109: checkcast [Ljava/lang/Object;
/*     */     //   112: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   115: invokeinterface last : ()Ljava/lang/Object;
/*     */     //   120: checkcast java/lang/String
/*     */     //   123: invokevirtual delete : (Ljava/lang/String;)Z
/*     */     //   126: istore #7
/*     */     //   128: goto -> 134
/*     */     //   131: iconst_0
/*     */     //   132: istore #7
/*     */     //   134: iload #7
/*     */     //   136: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 0
/*     */     //   #49	-> 8
/*     */     //   #51	-> 30
/*     */     //   #52	-> 65
/*     */     //   #53	-> 131
/*     */     //   #51	-> 134
/*     */     //   #47	-> 136
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	137	0	$this	Lli/cil/oc/server/fs/VirtualFileSystem;
/*     */     //   0	137	1	path	Ljava/lang/String;
/*     */     //   8	129	2	parts	[Ljava/lang/String;
/*     */     //   88	49	5	parent	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean makeDirectory(VirtualFileSystem $this, String path) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokeinterface segments : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   7: astore_2
/*     */     //   8: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   11: aload_2
/*     */     //   12: checkcast [Ljava/lang/Object;
/*     */     //   15: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   18: invokeinterface isEmpty : ()Z
/*     */     //   23: ifeq -> 30
/*     */     //   26: iconst_0
/*     */     //   27: goto -> 136
/*     */     //   30: aload_0
/*     */     //   31: invokeinterface root : ()Lli/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory;
/*     */     //   36: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   39: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   42: aload_2
/*     */     //   43: checkcast [Ljava/lang/Object;
/*     */     //   46: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   49: iconst_1
/*     */     //   50: invokeinterface dropRight : (I)Ljava/lang/Object;
/*     */     //   55: checkcast [Ljava/lang/Object;
/*     */     //   58: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   61: invokevirtual get : (Lscala/collection/Iterable;)Lscala/Option;
/*     */     //   64: astore_3
/*     */     //   65: aload_3
/*     */     //   66: instanceof scala/Some
/*     */     //   69: ifeq -> 131
/*     */     //   72: aload_3
/*     */     //   73: checkcast scala/Some
/*     */     //   76: astore #4
/*     */     //   78: aload #4
/*     */     //   80: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   83: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualObject
/*     */     //   86: astore #5
/*     */     //   88: aload #5
/*     */     //   90: instanceof li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   93: ifeq -> 131
/*     */     //   96: aload #5
/*     */     //   98: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   101: astore #6
/*     */     //   103: aload #6
/*     */     //   105: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   108: aload_2
/*     */     //   109: checkcast [Ljava/lang/Object;
/*     */     //   112: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   115: invokeinterface last : ()Ljava/lang/Object;
/*     */     //   120: checkcast java/lang/String
/*     */     //   123: invokevirtual makeDirectory : (Ljava/lang/String;)Z
/*     */     //   126: istore #7
/*     */     //   128: goto -> 134
/*     */     //   131: iconst_0
/*     */     //   132: istore #7
/*     */     //   134: iload #7
/*     */     //   136: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 0
/*     */     //   #60	-> 8
/*     */     //   #62	-> 30
/*     */     //   #63	-> 65
/*     */     //   #64	-> 131
/*     */     //   #62	-> 134
/*     */     //   #58	-> 136
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	137	0	$this	Lli/cil/oc/server/fs/VirtualFileSystem;
/*     */     //   0	137	1	path	Ljava/lang/String;
/*     */     //   8	129	2	parts	[Ljava/lang/String;
/*     */     //   88	49	5	parent	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean rename(VirtualFileSystem $this, String from, String to) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc ''
/*     */     //   3: astore_3
/*     */     //   4: dup
/*     */     //   5: ifnonnull -> 16
/*     */     //   8: pop
/*     */     //   9: aload_3
/*     */     //   10: ifnull -> 360
/*     */     //   13: goto -> 23
/*     */     //   16: aload_3
/*     */     //   17: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   20: ifne -> 360
/*     */     //   23: aload_0
/*     */     //   24: aload_1
/*     */     //   25: invokeinterface exists : (Ljava/lang/String;)Z
/*     */     //   30: ifeq -> 360
/*     */     //   33: aload_0
/*     */     //   34: aload_2
/*     */     //   35: invokeinterface segments : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   40: astore #4
/*     */     //   42: aload_0
/*     */     //   43: invokeinterface root : ()Lli/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory;
/*     */     //   48: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   51: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   54: aload #4
/*     */     //   56: checkcast [Ljava/lang/Object;
/*     */     //   59: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   62: iconst_1
/*     */     //   63: invokeinterface dropRight : (I)Ljava/lang/Object;
/*     */     //   68: checkcast [Ljava/lang/Object;
/*     */     //   71: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   74: invokevirtual get : (Lscala/collection/Iterable;)Lscala/Option;
/*     */     //   77: astore #5
/*     */     //   79: aload #5
/*     */     //   81: instanceof scala/Some
/*     */     //   84: ifeq -> 354
/*     */     //   87: aload #5
/*     */     //   89: checkcast scala/Some
/*     */     //   92: astore #6
/*     */     //   94: aload #6
/*     */     //   96: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   99: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualObject
/*     */     //   102: astore #7
/*     */     //   104: aload #7
/*     */     //   106: instanceof li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   109: ifeq -> 354
/*     */     //   112: aload #7
/*     */     //   114: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   117: astore #8
/*     */     //   119: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   122: aload #4
/*     */     //   124: checkcast [Ljava/lang/Object;
/*     */     //   127: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   130: invokeinterface last : ()Ljava/lang/Object;
/*     */     //   135: checkcast java/lang/String
/*     */     //   138: astore #10
/*     */     //   140: aload_0
/*     */     //   141: aload_1
/*     */     //   142: invokeinterface segments : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   147: astore #11
/*     */     //   149: aload_0
/*     */     //   150: invokeinterface root : ()Lli/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory;
/*     */     //   155: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   158: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   161: aload #11
/*     */     //   163: checkcast [Ljava/lang/Object;
/*     */     //   166: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   169: iconst_1
/*     */     //   170: invokeinterface dropRight : (I)Ljava/lang/Object;
/*     */     //   175: checkcast [Ljava/lang/Object;
/*     */     //   178: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   181: invokevirtual get : (Lscala/collection/Iterable;)Lscala/Option;
/*     */     //   184: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   187: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   190: astore #12
/*     */     //   192: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   195: aload #11
/*     */     //   197: checkcast [Ljava/lang/Object;
/*     */     //   200: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   203: invokeinterface last : ()Ljava/lang/Object;
/*     */     //   208: checkcast java/lang/String
/*     */     //   211: astore #13
/*     */     //   213: aload #12
/*     */     //   215: invokevirtual children : ()Lscala/collection/mutable/Map;
/*     */     //   218: aload #13
/*     */     //   220: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   225: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualObject
/*     */     //   228: astore #14
/*     */     //   230: aload #8
/*     */     //   232: getstatic scala/collection/immutable/List$.MODULE$ : Lscala/collection/immutable/List$;
/*     */     //   235: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   238: iconst_1
/*     */     //   239: anewarray java/lang/String
/*     */     //   242: dup
/*     */     //   243: iconst_0
/*     */     //   244: aload #10
/*     */     //   246: aastore
/*     */     //   247: checkcast [Ljava/lang/Object;
/*     */     //   250: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   253: invokevirtual apply : (Lscala/collection/Seq;)Lscala/collection/immutable/List;
/*     */     //   256: invokevirtual get : (Lscala/collection/Iterable;)Lscala/Option;
/*     */     //   259: invokevirtual isDefined : ()Z
/*     */     //   262: ifeq -> 278
/*     */     //   265: aload #8
/*     */     //   267: aload #10
/*     */     //   269: invokevirtual delete : (Ljava/lang/String;)Z
/*     */     //   272: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   275: goto -> 281
/*     */     //   278: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   281: pop
/*     */     //   282: aload #12
/*     */     //   284: invokevirtual children : ()Lscala/collection/mutable/Map;
/*     */     //   287: aload #13
/*     */     //   289: invokeinterface $minus$eq : (Ljava/lang/Object;)Lscala/collection/mutable/MapLike;
/*     */     //   294: pop
/*     */     //   295: aload #12
/*     */     //   297: invokestatic currentTimeMillis : ()J
/*     */     //   300: invokevirtual lastModified_$eq : (J)V
/*     */     //   303: aload #8
/*     */     //   305: invokevirtual children : ()Lscala/collection/mutable/Map;
/*     */     //   308: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*     */     //   311: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   314: aload #10
/*     */     //   316: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   319: aload #14
/*     */     //   321: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*     */     //   324: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*     */     //   329: pop
/*     */     //   330: aload #8
/*     */     //   332: invokestatic currentTimeMillis : ()J
/*     */     //   335: invokevirtual lastModified_$eq : (J)V
/*     */     //   338: aload #14
/*     */     //   340: invokestatic currentTimeMillis : ()J
/*     */     //   343: invokeinterface lastModified_$eq : (J)V
/*     */     //   348: iconst_1
/*     */     //   349: istore #9
/*     */     //   351: goto -> 357
/*     */     //   354: iconst_0
/*     */     //   355: istore #9
/*     */     //   357: iload #9
/*     */     //   359: ireturn
/*     */     //   360: new java/io/FileNotFoundException
/*     */     //   363: dup
/*     */     //   364: aload_1
/*     */     //   365: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   368: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 0
/*     */     //   #72	-> 33
/*     */     //   #73	-> 42
/*     */     //   #74	-> 79
/*     */     //   #75	-> 119
/*     */     //   #76	-> 140
/*     */     //   #77	-> 149
/*     */     //   #78	-> 192
/*     */     //   #79	-> 213
/*     */     //   #81	-> 230
/*     */     //   #82	-> 265
/*     */     //   #81	-> 278
/*     */     //   #85	-> 282
/*     */     //   #86	-> 295
/*     */     //   #88	-> 303
/*     */     //   #89	-> 330
/*     */     //   #91	-> 338
/*     */     //   #92	-> 348
/*     */     //   #74	-> 349
/*     */     //   #93	-> 354
/*     */     //   #73	-> 357
/*     */     //   #70	-> 359
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	369	0	$this	Lli/cil/oc/server/fs/VirtualFileSystem;
/*     */     //   0	369	1	from	Ljava/lang/String;
/*     */     //   0	369	2	to	Ljava/lang/String;
/*     */     //   42	317	4	segmentsTo	[Ljava/lang/String;
/*     */     //   104	265	7	toParent	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualObject;
/*     */     //   140	209	10	toName	Ljava/lang/String;
/*     */     //   149	200	11	segmentsFrom	[Ljava/lang/String;
/*     */     //   192	157	12	fromParent	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory;
/*     */     //   213	136	13	fromName	Ljava/lang/String;
/*     */     //   230	119	14	obj	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean setLastModified(VirtualFileSystem $this, String path, long time) {
/*  98 */     Option<VirtualFileSystem.VirtualObject> option = $this.root().get((Iterable<String>)Predef$.MODULE$.wrapRefArray((Object[])$this.segments(path)));
/*  99 */     if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject obj = (VirtualFileSystem.VirtualObject)some.x(); if (time >= 0L) {
/* 100 */         obj.lastModified_$eq(time);
/*     */         return true;
/*     */       }  }
/*     */     
/*     */     return false;
/*     */   }
/*     */   
/*     */   public static Option openInputChannel(VirtualFileSystem $this, String path) {
/* 108 */     Option<VirtualFileSystem.VirtualObject> option = $this.root().get((Iterable<String>)Predef$.MODULE$.wrapRefArray((Object[])$this.segments(path)));
/* 109 */     if (option instanceof Some) { Some some = (Some)option; VirtualFileSystem.VirtualObject obj = (VirtualFileSystem.VirtualObject)some.x(); if (obj instanceof VirtualFileSystem.VirtualFile) { VirtualFileSystem.VirtualFile virtualFile = (VirtualFileSystem.VirtualFile)obj; return virtualFile.openInputStream().map((Function1)new VirtualFileSystem$$anonfun$openInputChannel$1($this)); }  }
/* 110 */      return (Option)None$.MODULE$;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Option openOutputHandle(VirtualFileSystem $this, int id, String path, Mode mode) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_2
/*     */     //   2: invokeinterface segments : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   7: astore #4
/*     */     //   9: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   12: aload #4
/*     */     //   14: checkcast [Ljava/lang/Object;
/*     */     //   17: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   20: invokeinterface isEmpty : ()Z
/*     */     //   25: ifeq -> 34
/*     */     //   28: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   31: goto -> 204
/*     */     //   34: aload_0
/*     */     //   35: invokeinterface root : ()Lli/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory;
/*     */     //   40: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   43: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   46: aload #4
/*     */     //   48: checkcast [Ljava/lang/Object;
/*     */     //   51: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   54: iconst_1
/*     */     //   55: invokeinterface dropRight : (I)Ljava/lang/Object;
/*     */     //   60: checkcast [Ljava/lang/Object;
/*     */     //   63: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   66: invokevirtual get : (Lscala/collection/Iterable;)Lscala/Option;
/*     */     //   69: astore #5
/*     */     //   71: aload #5
/*     */     //   73: instanceof scala/Some
/*     */     //   76: ifeq -> 197
/*     */     //   79: aload #5
/*     */     //   81: checkcast scala/Some
/*     */     //   84: astore #6
/*     */     //   86: aload #6
/*     */     //   88: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   91: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualObject
/*     */     //   94: astore #7
/*     */     //   96: aload #7
/*     */     //   98: instanceof li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   101: ifeq -> 197
/*     */     //   104: aload #7
/*     */     //   106: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualDirectory
/*     */     //   109: astore #8
/*     */     //   111: aload #8
/*     */     //   113: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   116: aload #4
/*     */     //   118: checkcast [Ljava/lang/Object;
/*     */     //   121: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   124: invokeinterface last : ()Ljava/lang/Object;
/*     */     //   129: checkcast java/lang/String
/*     */     //   132: invokevirtual touch : (Ljava/lang/String;)Lscala/Option;
/*     */     //   135: astore #10
/*     */     //   137: aload #10
/*     */     //   139: instanceof scala/Some
/*     */     //   142: ifeq -> 185
/*     */     //   145: aload #10
/*     */     //   147: checkcast scala/Some
/*     */     //   150: astore #11
/*     */     //   152: aload #11
/*     */     //   154: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   157: checkcast li/cil/oc/server/fs/VirtualFileSystem$VirtualFile
/*     */     //   160: astore #12
/*     */     //   162: aload #12
/*     */     //   164: ifnull -> 185
/*     */     //   167: aload #12
/*     */     //   169: astore #13
/*     */     //   171: aload #13
/*     */     //   173: aload_0
/*     */     //   174: iload_1
/*     */     //   175: aload_2
/*     */     //   176: aload_3
/*     */     //   177: invokevirtual openOutputHandle : (Lli/cil/oc/server/fs/OutputStreamFileSystem;ILjava/lang/String;Lli/cil/oc/api/fs/Mode;)Lscala/Option;
/*     */     //   180: astore #14
/*     */     //   182: goto -> 190
/*     */     //   185: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   188: astore #14
/*     */     //   190: aload #14
/*     */     //   192: astore #9
/*     */     //   194: goto -> 202
/*     */     //   197: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   200: astore #9
/*     */     //   202: aload #9
/*     */     //   204: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #114	-> 0
/*     */     //   #115	-> 9
/*     */     //   #117	-> 34
/*     */     //   #118	-> 71
/*     */     //   #119	-> 137
/*     */     //   #120	-> 185
/*     */     //   #118	-> 190
/*     */     //   #122	-> 197
/*     */     //   #117	-> 202
/*     */     //   #113	-> 204
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	205	0	$this	Lli/cil/oc/server/fs/VirtualFileSystem;
/*     */     //   0	205	1	id	I
/*     */     //   0	205	2	path	Ljava/lang/String;
/*     */     //   0	205	3	mode	Lli/cil/oc/api/fs/Mode;
/*     */     //   9	196	4	parts	[Ljava/lang/String;
/*     */     //   96	109	7	directory	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualObject;
/*     */     //   162	43	12	file	Lli/cil/oc/server/fs/VirtualFileSystem$VirtualFile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void load(VirtualFileSystem $this, NBTTagCompound nbt) {
/* 130 */     if (!($this instanceof Buffered)) $this.root().load(nbt); 
/* 131 */     $this.li$cil$oc$server$fs$VirtualFileSystem$$super$load(nbt);
/*     */   }
/*     */   
/*     */   public static void save(VirtualFileSystem $this, NBTTagCompound nbt) {
/* 135 */     $this.li$cil$oc$server$fs$VirtualFileSystem$$super$save(nbt);
/* 136 */     if (!($this instanceof Buffered)) $this.root().save(nbt);
/*     */   
/*     */   }
/*     */   
/*     */   public static String[] segments(VirtualFileSystem $this, String path) {
/* 141 */     return (String[])Predef$.MODULE$.refArrayOps((Object[])FileSystem$.MODULE$.validatePath(path).split("/")).filter((Function1)new VirtualFileSystem$$anonfun$segments$1($this));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\VirtualFileSystem$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */