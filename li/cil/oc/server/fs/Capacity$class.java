/*     */ package li.cil.oc.server.fs;
/*     */ import li.cil.oc.Settings$;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function2;
/*     */ import scala.math.package$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class Capacity$class {
/*     */   public static void $init$(Capacity $this) {
/*  10 */     $this.li$cil$oc$server$fs$Capacity$$used_$eq(li$cil$oc$server$fs$Capacity$$computeSize($this, "/"));
/*     */ 
/*     */ 
/*     */     
/*  14 */     $this.li$cil$oc$server$fs$Capacity$$ignoreCapacity_$eq(false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static long spaceTotal(Capacity $this) {
/*  20 */     return $this.capacity();
/*     */   } public static long spaceUsed(Capacity $this) {
/*  22 */     return $this.li$cil$oc$server$fs$Capacity$$used();
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean delete(Capacity $this, String path) {
/*  27 */     long freed = Settings$.MODULE$.get().fileCost() + $this.size(path);
/*     */     
/*  29 */     $this.li$cil$oc$server$fs$Capacity$$used_$eq(package$.MODULE$.max(0L, $this.li$cil$oc$server$fs$Capacity$$used() - freed));
/*     */     return $this.li$cil$oc$server$fs$Capacity$$super$delete(path);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean rename(Capacity $this, String from, String to) {
/*  37 */     long freed = Settings$.MODULE$.get().fileCost() + $this.size(to);
/*     */     
/*  39 */     $this.li$cil$oc$server$fs$Capacity$$used_$eq(package$.MODULE$.max(0L, $this.li$cil$oc$server$fs$Capacity$$used() - freed));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  44 */     return $this.exists(to) ? ($this.li$cil$oc$server$fs$Capacity$$super$rename(from, to)) : $this.li$cil$oc$server$fs$Capacity$$super$rename(from, to);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean makeDirectory(Capacity $this, String path) {
/*  49 */     if ($this.capacity() - $this.li$cil$oc$server$fs$Capacity$$used() < Settings$.MODULE$.get().fileCost() && !$this.li$cil$oc$server$fs$Capacity$$ignoreCapacity()) {
/*  50 */       throw new IOException("not enough space");
/*     */     }
/*     */     
/*  53 */     $this.li$cil$oc$server$fs$Capacity$$used_$eq($this.li$cil$oc$server$fs$Capacity$$used() + Settings$.MODULE$.get().fileCost());
/*     */     return $this.li$cil$oc$server$fs$Capacity$$super$makeDirectory(path);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void close(Capacity $this) {
/*  62 */     $this.li$cil$oc$server$fs$Capacity$$super$close();
/*  63 */     $this.li$cil$oc$server$fs$Capacity$$used_$eq(li$cil$oc$server$fs$Capacity$$computeSize($this, "/"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void load(Capacity $this, NBTTagCompound nbt) {
/*     */     
/*  70 */     try { $this.li$cil$oc$server$fs$Capacity$$ignoreCapacity_$eq(true);
/*  71 */       $this.li$cil$oc$server$fs$Capacity$$super$load(nbt);
/*     */       
/*  73 */       $this.li$cil$oc$server$fs$Capacity$$ignoreCapacity_$eq(false); return; } finally { $this.li$cil$oc$server$fs$Capacity$$ignoreCapacity_$eq(false); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void save(Capacity $this, NBTTagCompound nbt) {
/*  80 */     $this.li$cil$oc$server$fs$Capacity$$super$save(nbt);
/*     */ 
/*     */     
/*  83 */     nbt.func_74772_a("capacity.used", $this.li$cil$oc$server$fs$Capacity$$used());
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
/*     */ 
/*     */   
/*     */   public static Option openOutputHandle(Capacity $this, int id, String path, Mode mode) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_2
/*     */     //   2: invokeinterface exists : (Ljava/lang/String;)Z
/*     */     //   7: ifeq -> 52
/*     */     //   10: aload_3
/*     */     //   11: getstatic li/cil/oc/api/fs/Mode.Write : Lli/cil/oc/api/fs/Mode;
/*     */     //   14: astore #6
/*     */     //   16: dup
/*     */     //   17: ifnonnull -> 29
/*     */     //   20: pop
/*     */     //   21: aload #6
/*     */     //   23: ifnull -> 37
/*     */     //   26: goto -> 48
/*     */     //   29: aload #6
/*     */     //   31: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 48
/*     */     //   37: aload_0
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface size : (Ljava/lang/String;)J
/*     */     //   44: lneg
/*     */     //   45: goto -> 62
/*     */     //   48: lconst_0
/*     */     //   49: goto -> 62
/*     */     //   52: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   55: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   58: invokevirtual fileCost : ()I
/*     */     //   61: i2l
/*     */     //   62: lstore #4
/*     */     //   64: aload_0
/*     */     //   65: invokeinterface capacity : ()J
/*     */     //   70: aload_0
/*     */     //   71: invokeinterface li$cil$oc$server$fs$Capacity$$used : ()J
/*     */     //   76: lsub
/*     */     //   77: lload #4
/*     */     //   79: lcmp
/*     */     //   80: ifge -> 102
/*     */     //   83: aload_0
/*     */     //   84: invokeinterface li$cil$oc$server$fs$Capacity$$ignoreCapacity : ()Z
/*     */     //   89: ifne -> 102
/*     */     //   92: new java/io/IOException
/*     */     //   95: dup
/*     */     //   96: ldc 'not enough space'
/*     */     //   98: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   101: athrow
/*     */     //   102: aload_0
/*     */     //   103: iload_1
/*     */     //   104: aload_2
/*     */     //   105: aload_3
/*     */     //   106: invokeinterface li$cil$oc$server$fs$Capacity$$super$openOutputHandle : (ILjava/lang/String;Lli/cil/oc/api/fs/Mode;)Lscala/Option;
/*     */     //   111: astore #7
/*     */     //   113: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   116: aload #7
/*     */     //   118: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   121: ifeq -> 132
/*     */     //   124: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   127: astore #8
/*     */     //   129: goto -> 246
/*     */     //   132: aload #7
/*     */     //   134: instanceof scala/Some
/*     */     //   137: ifeq -> 249
/*     */     //   140: aload #7
/*     */     //   142: checkcast scala/Some
/*     */     //   145: astore #9
/*     */     //   147: aload #9
/*     */     //   149: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   152: checkcast li/cil/oc/server/fs/OutputStreamFileSystem$OutputHandle
/*     */     //   155: astore #10
/*     */     //   157: aload_0
/*     */     //   158: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   161: lconst_0
/*     */     //   162: aload_0
/*     */     //   163: invokeinterface li$cil$oc$server$fs$Capacity$$used : ()J
/*     */     //   168: lload #4
/*     */     //   170: ladd
/*     */     //   171: invokevirtual max : (JJ)J
/*     */     //   174: invokeinterface li$cil$oc$server$fs$Capacity$$used_$eq : (J)V
/*     */     //   179: aload_3
/*     */     //   180: getstatic li/cil/oc/api/fs/Mode.Append : Lli/cil/oc/api/fs/Mode;
/*     */     //   183: astore #11
/*     */     //   185: dup
/*     */     //   186: ifnonnull -> 198
/*     */     //   189: pop
/*     */     //   190: aload #11
/*     */     //   192: ifnull -> 206
/*     */     //   195: goto -> 222
/*     */     //   198: aload #11
/*     */     //   200: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   203: ifeq -> 222
/*     */     //   206: aload #10
/*     */     //   208: aload #10
/*     */     //   210: invokevirtual length : ()J
/*     */     //   213: invokevirtual seek : (J)J
/*     */     //   216: invokestatic boxToLong : (J)Ljava/lang/Long;
/*     */     //   219: goto -> 225
/*     */     //   222: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   225: pop
/*     */     //   226: new scala/Some
/*     */     //   229: dup
/*     */     //   230: new li/cil/oc/server/fs/Capacity$CountingOutputHandle
/*     */     //   233: dup
/*     */     //   234: aload_0
/*     */     //   235: aload_0
/*     */     //   236: aload #10
/*     */     //   238: invokespecial <init> : (Lli/cil/oc/server/fs/Capacity;Lli/cil/oc/server/fs/Capacity;Lli/cil/oc/server/fs/OutputStreamFileSystem$OutputHandle;)V
/*     */     //   241: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   244: astore #8
/*     */     //   246: aload #8
/*     */     //   248: areturn
/*     */     //   249: new scala/MatchError
/*     */     //   252: dup
/*     */     //   253: aload #7
/*     */     //   255: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   258: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 0
/*     */     //   #91	-> 10
/*     */     //   #92	-> 37
/*     */     //   #94	-> 48
/*     */     //   #96	-> 52
/*     */     //   #89	-> 62
/*     */     //   #97	-> 64
/*     */     //   #98	-> 92
/*     */     //   #100	-> 102
/*     */     //   #101	-> 113
/*     */     //   #102	-> 132
/*     */     //   #103	-> 157
/*     */     //   #104	-> 179
/*     */     //   #105	-> 206
/*     */     //   #104	-> 222
/*     */     //   #107	-> 226
/*     */     //   #102	-> 244
/*     */     //   #100	-> 246
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	259	0	$this	Lli/cil/oc/server/fs/Capacity;
/*     */     //   0	259	1	id	I
/*     */     //   0	259	2	path	Ljava/lang/String;
/*     */     //   0	259	3	mode	Lli/cil/oc/api/fs/Mode;
/*     */     //   64	184	4	delta	J
/*     */     //   157	102	10	stream	Lli/cil/oc/server/fs/OutputStreamFileSystem$OutputHandle;
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
/*     */ 
/*     */   
/*     */   public static long li$cil$oc$server$fs$Capacity$$computeSize(Capacity $this, String path) {
/* 115 */     return Settings$.MODULE$.get().fileCost() + $this.size(path) + (
/* 116 */       $this.isDirectory(path) ? 
/* 117 */       BoxesRunTime.unboxToLong(Predef$.MODULE$.refArrayOps((Object[])$this.list(path)).foldLeft(BoxesRunTime.boxToLong(0L), (Function2)new Capacity$$anonfun$li$cil$oc$server$fs$Capacity$$computeSize$1($this, path))) : 
/* 118 */       0L);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\Capacity$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */