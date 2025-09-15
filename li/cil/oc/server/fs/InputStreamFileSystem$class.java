/*    */ package li.cil.oc.server.fs;
/*    */ import li.cil.oc.api.fs.Handle;
/*    */ import li.cil.oc.api.fs.Mode;
/*    */ import net.minecraft.nbt.NBTBase;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.nbt.NBTTagList;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.collection.IterableLike;
/*    */ import scala.collection.immutable.IndexedSeq$;
/*    */ import scala.collection.mutable.Map$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.RichInt$;
/*    */ 
/*    */ public abstract class InputStreamFileSystem$class {
/*    */   public static void $init$(InputStreamFileSystem $this) {
/* 17 */     $this.li$cil$oc$server$fs$InputStreamFileSystem$_setter_$li$cil$oc$server$fs$InputStreamFileSystem$$handles_$eq(Map$.MODULE$.empty());
/*    */   }
/*    */   
/*    */   public static boolean isReadOnly(InputStreamFileSystem $this) {
/* 21 */     return true;
/*    */   } public static boolean delete(InputStreamFileSystem $this, String path) {
/* 23 */     return false;
/*    */   } public static boolean makeDirectory(InputStreamFileSystem $this, String path) {
/* 25 */     return false;
/*    */   } public static boolean rename(InputStreamFileSystem $this, String from, String to) {
/* 27 */     return false;
/*    */   } public static boolean setLastModified(InputStreamFileSystem $this, String path, long time) {
/* 29 */     return false;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static int open(InputStreamFileSystem $this, String path, Mode mode) {
/*    */     // Byte code:
/*    */     //   0: getstatic li/cil/oc/server/fs/FileSystem$.MODULE$ : Lli/cil/oc/server/fs/FileSystem$;
/*    */     //   3: aload_1
/*    */     //   4: invokevirtual validatePath : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   7: pop
/*    */     //   8: aload_0
/*    */     //   9: dup
/*    */     //   10: astore_3
/*    */     //   11: monitorenter
/*    */     //   12: aload_2
/*    */     //   13: getstatic li/cil/oc/api/fs/Mode.Read : Lli/cil/oc/api/fs/Mode;
/*    */     //   16: astore #5
/*    */     //   18: dup
/*    */     //   19: ifnonnull -> 31
/*    */     //   22: pop
/*    */     //   23: aload #5
/*    */     //   25: ifnull -> 39
/*    */     //   28: goto -> 204
/*    */     //   31: aload #5
/*    */     //   33: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   36: ifeq -> 204
/*    */     //   39: aload_0
/*    */     //   40: aload_1
/*    */     //   41: invokeinterface exists : (Ljava/lang/String;)Z
/*    */     //   46: ifeq -> 204
/*    */     //   49: aload_0
/*    */     //   50: aload_1
/*    */     //   51: invokeinterface isDirectory : (Ljava/lang/String;)Z
/*    */     //   56: ifne -> 204
/*    */     //   59: getstatic scala/package$.MODULE$ : Lscala/package$;
/*    */     //   62: invokevirtual Iterator : ()Lscala/collection/Iterator$;
/*    */     //   65: new li/cil/oc/server/fs/InputStreamFileSystem$$anonfun$1
/*    */     //   68: dup
/*    */     //   69: aload_0
/*    */     //   70: invokespecial <init> : (Lli/cil/oc/server/fs/InputStreamFileSystem;)V
/*    */     //   73: invokevirtual continually : (Lscala/Function0;)Lscala/collection/Iterator;
/*    */     //   76: new li/cil/oc/server/fs/InputStreamFileSystem$$anonfun$2
/*    */     //   79: dup
/*    */     //   80: aload_0
/*    */     //   81: invokespecial <init> : (Lli/cil/oc/server/fs/InputStreamFileSystem;)V
/*    */     //   84: invokeinterface filterNot : (Lscala/Function1;)Lscala/collection/Iterator;
/*    */     //   89: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   94: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */     //   97: istore #6
/*    */     //   99: aload_0
/*    */     //   100: aload_1
/*    */     //   101: invokeinterface openInputChannel : (Ljava/lang/String;)Lscala/Option;
/*    */     //   106: astore #7
/*    */     //   108: aload #7
/*    */     //   110: instanceof scala/Some
/*    */     //   113: ifeq -> 195
/*    */     //   116: aload #7
/*    */     //   118: checkcast scala/Some
/*    */     //   121: astore #8
/*    */     //   123: aload #8
/*    */     //   125: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   128: checkcast li/cil/oc/server/fs/InputStreamFileSystem$InputChannel
/*    */     //   131: astore #9
/*    */     //   133: aload_0
/*    */     //   134: invokeinterface li$cil$oc$server$fs$InputStreamFileSystem$$handles : ()Lscala/collection/mutable/Map;
/*    */     //   139: getstatic scala/Predef$ArrowAssoc$.MODULE$ : Lscala/Predef$ArrowAssoc$;
/*    */     //   142: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */     //   145: iload #6
/*    */     //   147: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   150: invokevirtual ArrowAssoc : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   153: new li/cil/oc/server/fs/InputStreamFileSystem$Handle
/*    */     //   156: dup
/*    */     //   157: aload_0
/*    */     //   158: aload_0
/*    */     //   159: iload #6
/*    */     //   161: aload_1
/*    */     //   162: aload #9
/*    */     //   164: invokespecial <init> : (Lli/cil/oc/server/fs/InputStreamFileSystem;Lli/cil/oc/server/fs/InputStreamFileSystem;ILjava/lang/String;Lli/cil/oc/server/fs/InputStreamFileSystem$InputChannel;)V
/*    */     //   167: invokevirtual $minus$greater$extension : (Ljava/lang/Object;Ljava/lang/Object;)Lscala/Tuple2;
/*    */     //   170: invokeinterface $plus$eq : (Lscala/Tuple2;)Lscala/collection/mutable/MapLike;
/*    */     //   175: pop
/*    */     //   176: iload #6
/*    */     //   178: istore #10
/*    */     //   180: iload #10
/*    */     //   182: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*    */     //   185: astore #4
/*    */     //   187: aload_3
/*    */     //   188: monitorexit
/*    */     //   189: aload #4
/*    */     //   191: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */     //   194: ireturn
/*    */     //   195: new java/io/FileNotFoundException
/*    */     //   198: dup
/*    */     //   199: aload_1
/*    */     //   200: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   203: athrow
/*    */     //   204: new java/io/FileNotFoundException
/*    */     //   207: dup
/*    */     //   208: aload_1
/*    */     //   209: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   212: athrow
/*    */     //   213: aload_3
/*    */     //   214: monitorexit
/*    */     //   215: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #35	-> 8
/*    */     //   #36	-> 59
/*    */     //   #37	-> 99
/*    */     //   #38	-> 108
/*    */     //   #39	-> 133
/*    */     //   #40	-> 176
/*    */     //   #38	-> 178
/*    */     //   #37	-> 180
/*    */     //   #35	-> 188
/*    */     //   #41	-> 195
/*    */     //   #43	-> 204
/*    */     //   #35	-> 213
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	216	0	$this	Lli/cil/oc/server/fs/InputStreamFileSystem;
/*    */     //   0	216	1	path	Ljava/lang/String;
/*    */     //   0	216	2	mode	Lli/cil/oc/api/fs/Mode;
/*    */     //   99	86	6	handle	I
/*    */     //   133	83	9	channel	Lli/cil/oc/server/fs/InputStreamFileSystem$InputChannel;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   12	189	213	finally
/*    */     //   195	213	213	finally
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Handle getHandle(InputStreamFileSystem $this, int handle) {
/* 46 */     synchronized ($this) { Object object = $this.li$cil$oc$server$fs$InputStreamFileSystem$$handles().get(BoxesRunTime.boxToInteger(handle)).orNull(Predef$.MODULE$.$conforms()); return (Handle)object; }
/*    */      } public static void close(InputStreamFileSystem $this) {
/* 48 */     synchronized ($this) {
/* 49 */       $this.li$cil$oc$server$fs$InputStreamFileSystem$$handles().values().foreach((Function1)new InputStreamFileSystem$$anonfun$close$1($this));
/*    */       
/* 51 */       $this.li$cil$oc$server$fs$InputStreamFileSystem$$handles().clear();
/*    */       return;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void load(InputStreamFileSystem $this, NBTTagCompound nbt) {
/* 57 */     NBTTagList handlesNbt = nbt.func_150295_c("input", 10); ((IterableLike)RichInt$.MODULE$
/* 58 */       .until$extension0(Predef$.MODULE$.intWrapper(0), handlesNbt.func_74745_c()).map((Function1)new InputStreamFileSystem$$anonfun$load$1($this, handlesNbt), IndexedSeq$.MODULE$.canBuildFrom())).foreach((Function1)new InputStreamFileSystem$$anonfun$load$2($this));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void save(InputStreamFileSystem $this, NBTTagCompound nbt) {
/* 72 */     synchronized ($this) {
/* 73 */       NBTTagList handlesNbt = new NBTTagList();
/* 74 */       $this.li$cil$oc$server$fs$InputStreamFileSystem$$handles().values().foreach((Function1)new InputStreamFileSystem$$anonfun$save$1($this, handlesNbt));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 82 */       nbt.func_74782_a("input", (NBTBase)handlesNbt);
/*    */       return;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\InputStreamFileSystem$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */