/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ import java.util.zip.ZipEntry;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t-c\001B\001\003\0015\021ADW5q\r&dW-\0238qkR\034FO]3b[\032KG.Z*zgR,WN\003\002\004\t\005\021am\035\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022\001\0027b]\036T\021aE\001\005U\0064\030-\003\002\026!\t1qJ\0316fGR\004\"a\006\r\016\003\tI!!\007\002\003+%s\007/\036;TiJ,\027-\034$jY\026\034\026p\035;f[\"A1\004\001BC\002\023%A$A\004be\016D\027N^3\026\003u\001\"AH)\017\005}acB\001\021,\035\t\t#F\004\002#S9\0211\005\013\b\003I\035j\021!\n\006\003M1\ta\001\020:p_Rt\024\"A\006\n\005%Q\021BA\004\t\023\t)a!\003\002\004\t\035)QF\001E\001]\005a\",\0339GS2,\027J\0349viN#(/Z1n\r&dWmU=ti\026l\007CA\f0\r\025\t!\001#\0011'\ty\023\007\005\0023k5\t1GC\0015\003\025\0318-\0317b\023\t14G\001\004B]f\024VM\032\005\006q=\"\t!O\001\007y%t\027\016\036 \025\0039BqaO\030C\002\023%A(A\003dC\016DW-F\001>!\021qd\tS(\016\003}R!a\017!\013\005\005\023\025AB2p[6|gN\003\002D\t\0061qm\\8hY\026T\021!R\001\004G>l\027BA$@\005\025\031\025m\0315f!\tIEJ\004\0023\025&\0211jM\001\007!J,G-\0324\n\0055s%AB*ue&twM\003\002LgA\021\001+U\007\002_\031!!k\f\003T\005A\t%o\0315jm\026$\025N]3di>\024\030p\005\002R)B\021\001+\026\004\006->\n\ta\026\002\b\003J\034\007.\033<f'\t)\026\007\003\005Z+\n\005\t\025!\003[\003\025)g\016\036:z!\tY\006-D\001]\025\tif,A\002{SBT!a\030\n\002\tU$\030\016\\\005\003Cr\023\001BW5q\013:$(/\037\005\tGV\023\t\021)A\005\021\006!!o\\8u\021\025AT\013\"\001f)\r!fm\032\005\0063\022\004\rA\027\005\006G\022\004\r\001\023\005\bSV\023\r\021\"\001k\003\021\001\030\r\0365\026\003-\004\"a\0047\n\0055\003\002B\0028VA\003%1.A\003qCRD\007\005C\004q+\n\007I\021\0016\002\t9\fW.\032\005\007eV\003\013\021B6\002\0139\fW.\032\021\t\017Q,&\031!C\001k\006aA.Y:u\033>$\027NZ5fIV\ta\017\005\0023o&\021\001p\r\002\005\031>tw\r\003\004{+\002\006IA^\001\016Y\006\034H/T8eS\032LW\r\032\021\t\017q,&\031!C\001{\006Y\021n\035#je\026\034Go\034:z+\005q\bC\001\032\000\023\r\t\ta\r\002\b\005>|G.Z1o\021\035\t)!\026Q\001\ny\fA\"[:ESJ,7\r^8ss\002Bq!!\003V\r\003\tY!\001\003tSj,WCAA\007!\r\021\024qB\005\004\003#\031$aA%oi\"9\021QC+\007\002\005]\021\001\0027jgR$\"!!\007\021\tI\nY\002S\005\004\003;\031$!B!se\006L\bbBA\021+\032\005\0211E\001\013_B,gn\025;sK\006lGCAA\023!\021\t9#!\f\016\005\005%\"bAA\026%\005\021\021n\\\005\005\003_\tICA\006J]B,Ho\025;sK\006l\007bBA\032+\032\005\021QG\001\005M&tG\r\006\003\0028\005u\002\003\002\032\002:QK1!a\0174\005\031y\005\017^5p]\"9\021.!\rA\002\005}\002#BA!\003\027Be\002BA\"\003\017r1\001JA#\023\005!\024bAA%g\0059\001/Y2lC\036,\027\002BA'\003\037\022\001\"\023;fe\006\024G.\032\006\004\003\023\032\004\002C-R\005\003\005\013\021\002.\t\021\r\f&\021!Q\001\n!Ca\001O)\005\002\005]C#B(\002Z\005m\003BB-\002V\001\007!\f\003\004d\003+\002\r\001\023\005\n\003?\n&\031!C\001\003C\n\001b\0315jY\022\024XM\\\013\003\003G\002R!!\032\002pQk!!a\032\013\t\005%\0241N\001\b[V$\030M\0317f\025\r\tigM\001\013G>dG.Z2uS>t\027\002BA9\003O\0221aU3u\021!\t)(\025Q\001\n\005\r\024!C2iS2$'/\0328!\021%\tI!\025b\001\n\003\tY\001\003\005\002|E\003\013\021BA\007\003\025\031\030N_3!\021\035\t)\"\025C\001\003\"\"!!!\021\tI\nYb\033\005\b\003C\tF\021AAC)\t\t9\tE\0023\003\023K1!a#4\005\021qU\017\0347\t\017\005M\022\013\"\001\002\020R!\021qGAI\021\035I\027Q\022a\001\003Aq!!&0A\003%Q(\001\004dC\016DW\r\t\005\b\0033{C\021AAN\003!1'o\\7GS2,GCBAO\003?\013I\013\005\002\030\001!A\021\021UAL\001\004\t\031+\001\003gS2,\007\003BA\024\003KKA!a*\002*\t!a)\0337f\021\035\tY+a&A\002!\013\021\"\0338oKJ\004\026\r\0365\007\r\005=v\006BAY\005-\t%o\0315jm\0264\025\016\\3\024\007\0055F\013\003\006^\003[\023\t\021)A\005\003k\0032aWA\\\023\r\tI\f\030\002\b5&\004h)\0337f\021%I\026Q\026B\001B\003%!\fC\005d\003[\023\t\021)A\005\021\"9\001(!,\005\002\005\005G\003CAb\003\013\f9-!3\021\007A\013i\013C\004^\003\003\r!!.\t\re\013y\f1\001[\021\031\031\027q\030a\001\021\"Q\021QZAW\005\004%\t!a4\002\t\021\fG/Y\013\003\003#\004RAMA\016\003'\0042AMAk\023\r\t9n\r\002\005\005f$X\rC\005\002\\\0065\006\025!\003\002R\006)A-\031;bA!Q\021\021BAW\005\004%\t!a\003\t\023\005m\024Q\026Q\001\n\0055\001\002CA\013\003[#\t!!\"\t\021\005\005\022Q\026C\001\003K$\"!a:\021\t\005\035\022\021^\005\005\003W\fIC\001\013CsR,\027I\035:bs&s\007/\036;TiJ,\027-\034\005\t\003g\ti\013\"\001\002pR!\021qGAy\021\035I\027Q\036a\001\003A\021\"!>\001\005\003\005\013\021B\017\002\021\005\0248\r[5wK\002Ba\001\017\001\005\002\005eH\003BAO\003wDaaGA|\001\004i\002bBA\000\001\021\005!\021A\001\013gB\f7-\032+pi\006dG#\001<\t\017\t\025\001\001\"\001\003\002\005I1\017]1dKV\033X\r\032\005\n\005\023\001\001R1A\005\nU\f!b\0359bG\026,6/\0323`\021%\021i\001\001E\001B\003&a/A\006ta\006\034W-V:fI~\003\003b\002B\t\001\021\005#1C\001\007KbL7\017^:\025\007y\024)\002\003\004j\005\037\001\r\001\023\005\b\003\023\001A\021\tB\r)\r1(1\004\005\007S\n]\001\031\001%\t\rq\004A\021\tB\020)\rq(\021\005\005\007S\nu\001\031\001%\t\rQ\004A\021\001B\023)\r1(q\005\005\007S\n\r\002\031\001%\t\017\005U\001\001\"\021\003,Q!\021\021\021B\027\021\031I'\021\006a\001\021\"9!\021\007\001\005R\tM\022\001E8qK:Le\016];u\007\"\fgN\\3m)\021\021)Da\020\021\013I\nIDa\016\021\t\te\"1H\007\002\001%\031!Q\b\r\003%%s\007/\036;TiJ,\027-\\\"iC:tW\r\034\005\007S\n=\002\031\001%\t\re\003A\021\002B\")\021\021)E!\023\021\013I\nIDa\022\021\005y)\006BB5\003B\001\007\001\n")
/*     */ public class ZipFileInputStreamFileSystem implements InputStreamFileSystem {
/*     */   private final ArchiveDirectory archive;
/*     */   private long spaceUsed_;
/*     */   private final Map<Object, InputStreamFileSystem.Handle> li$cil$oc$server$fs$InputStreamFileSystem$$handles;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  17 */   public Map<Object, InputStreamFileSystem.Handle> li$cil$oc$server$fs$InputStreamFileSystem$$handles() { return this.li$cil$oc$server$fs$InputStreamFileSystem$$handles; } public void li$cil$oc$server$fs$InputStreamFileSystem$_setter_$li$cil$oc$server$fs$InputStreamFileSystem$$handles_$eq(Map<Object, InputStreamFileSystem.Handle> x$1) { this.li$cil$oc$server$fs$InputStreamFileSystem$$handles = x$1; } public boolean isReadOnly() { return InputStreamFileSystem$class.isReadOnly(this); } public boolean delete(String path) { return InputStreamFileSystem$class.delete(this, path); } public boolean makeDirectory(String path) { return InputStreamFileSystem$class.makeDirectory(this, path); } public boolean rename(String from, String to) { return InputStreamFileSystem$class.rename(this, from, to); } public boolean setLastModified(String path, long time) { return InputStreamFileSystem$class.setLastModified(this, path, time); } public int open(String path, Mode mode) { return InputStreamFileSystem$class.open(this, path, mode); } public Handle getHandle(int handle) { return InputStreamFileSystem$class.getHandle(this, handle); } public void close() { InputStreamFileSystem$class.close(this); } public void load(NBTTagCompound nbt) { InputStreamFileSystem$class.load(this, nbt); } public void save(NBTTagCompound nbt) { InputStreamFileSystem$class.save(this, nbt); } private ArchiveDirectory archive() { return this.archive; } public ZipFileInputStreamFileSystem(ArchiveDirectory archive) { InputStreamFileSystem$class.$init$(this); }
/*     */    public long spaceTotal() {
/*  19 */     return spaceUsed();
/*     */   } public long spaceUsed() {
/*  21 */     return spaceUsed_();
/*     */   }
/*  23 */   private long spaceUsed_$lzycompute() { synchronized (this) { if (!this.bitmap$0) synchronized (ZipFileInputStreamFileSystem$.MODULE$) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  28 */           Long long_ = BoxesRunTime.boxToLong(li$cil$oc$server$fs$ZipFileInputStreamFileSystem$$recurse$1(archive())); this.spaceUsed_ = BoxesRunTime.unboxToLong(long_); this.bitmap$0 = true;
/*     */           return this.spaceUsed_;
/*     */         }  
/*     */       return this.spaceUsed_; }
/*     */      }
/*  33 */   private long spaceUsed_() { return this.bitmap$0 ? this.spaceUsed_ : spaceUsed_$lzycompute(); } public boolean exists(String path) { synchronized (ZipFileInputStreamFileSystem$.MODULE$) {
/*  34 */       Boolean bool = BoxesRunTime.boxToBoolean(entry(path).isDefined()); return BoxesRunTime.unboxToBoolean(bool);
/*     */     }  }
/*     */   public final long li$cil$oc$server$fs$ZipFileInputStreamFileSystem$$recurse$1(ArchiveDirectory d) { return BoxesRunTime.unboxToLong(d.children().foldLeft(BoxesRunTime.boxToLong(0L), (Function2)new ZipFileInputStreamFileSystem$$anonfun$li$cil$oc$server$fs$ZipFileInputStreamFileSystem$$recurse$1$1(this))); }
/*     */   public final class ZipFileInputStreamFileSystem$$anonfun$li$cil$oc$server$fs$ZipFileInputStreamFileSystem$$recurse$1$1 extends AbstractFunction2<Object, Archive, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final long apply(long acc, ZipFileInputStreamFileSystem.Archive c) { long l; ZipFileInputStreamFileSystem.Archive archive = c; if (archive instanceof ZipFileInputStreamFileSystem.ArchiveDirectory) { ZipFileInputStreamFileSystem.ArchiveDirectory archiveDirectory = (ZipFileInputStreamFileSystem.ArchiveDirectory)archive; l = this.$outer.li$cil$oc$server$fs$ZipFileInputStreamFileSystem$$recurse$1(archiveDirectory); }
/*     */       else
/*     */       { if (archive instanceof ZipFileInputStreamFileSystem.ArchiveFile) {
/*     */           ZipFileInputStreamFileSystem.ArchiveFile archiveFile = (ZipFileInputStreamFileSystem.ArchiveFile)archive; l = archiveFile.size(); return acc + l;
/*     */         }  throw new MatchError(archive); }
/*     */        return acc + l; } public ZipFileInputStreamFileSystem$$anonfun$li$cil$oc$server$fs$ZipFileInputStreamFileSystem$$recurse$1$1(ZipFileInputStreamFileSystem $outer) {} } public long size(String path) { // Byte code:
/*     */     //   0: getstatic li/cil/oc/server/fs/ZipFileInputStreamFileSystem$.MODULE$ : Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$;
/*     */     //   3: dup
/*     */     //   4: astore_2
/*     */     //   5: monitorenter
/*     */     //   6: aload_0
/*     */     //   7: aload_1
/*     */     //   8: invokespecial entry : (Ljava/lang/String;)Lscala/Option;
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: instanceof scala/Some
/*     */     //   18: ifeq -> 57
/*     */     //   21: aload #4
/*     */     //   23: checkcast scala/Some
/*     */     //   26: astore #5
/*     */     //   28: aload #5
/*     */     //   30: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   33: checkcast li/cil/oc/server/fs/ZipFileInputStreamFileSystem$Archive
/*     */     //   36: astore #6
/*     */     //   38: aload #6
/*     */     //   40: invokevirtual isDirectory : ()Z
/*     */     //   43: ifne -> 57
/*     */     //   46: aload #6
/*     */     //   48: invokevirtual size : ()I
/*     */     //   51: i2l
/*     */     //   52: lstore #7
/*     */     //   54: goto -> 60
/*     */     //   57: lconst_0
/*     */     //   58: lstore #7
/*     */     //   60: lload #7
/*     */     //   62: invokestatic boxToLong : (J)Ljava/lang/Long;
/*     */     //   65: astore_3
/*     */     //   66: aload_2
/*     */     //   67: monitorexit
/*     */     //   68: aload_3
/*     */     //   69: invokestatic unboxToLong : (Ljava/lang/Object;)J
/*     */     //   72: lreturn
/*     */     //   73: aload_2
/*     */     //   74: monitorexit
/*     */     //   75: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 0
/*     */     //   #38	-> 6
/*     */     //   #39	-> 13
/*     */     //   #40	-> 57
/*     */     //   #38	-> 60
/*     */     //   #37	-> 67
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	76	0	this	Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem;
/*     */     //   0	76	1	path	Ljava/lang/String;
/*     */     //   38	38	6	file	Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$Archive;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*  44 */     //   6	68	73	finally } public boolean isDirectory(String path) { synchronized (ZipFileInputStreamFileSystem$.MODULE$)
/*  45 */     { Boolean bool = BoxesRunTime.boxToBoolean(entry(path).exists((Function1)new ZipFileInputStreamFileSystem$$anonfun$isDirectory$1(this))); return BoxesRunTime.unboxToBoolean(bool); }  } public final class ZipFileInputStreamFileSystem$$anonfun$isDirectory$1 extends AbstractFunction1<Archive, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ZipFileInputStreamFileSystem.Archive x$1) { return x$1.isDirectory(); }
/*     */      public ZipFileInputStreamFileSystem$$anonfun$isDirectory$1(ZipFileInputStreamFileSystem $outer) {} }
/*     */   public long lastModified(String path) {
/*  48 */     synchronized (ZipFileInputStreamFileSystem$.MODULE$) {
/*  49 */       long l; Option<Archive> option = entry(path);
/*  50 */       if (option instanceof Some) { Some some = (Some)option; Archive file = (Archive)some.x(); l = file.lastModified(); }
/*  51 */       else { l = 0L; }
/*     */       
/*     */       Long long_ = BoxesRunTime.boxToLong(l);
/*     */       return BoxesRunTime.unboxToLong(long_);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String[] list(String path) {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/server/fs/ZipFileInputStreamFileSystem$.MODULE$ : Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$;
/*     */     //   3: dup
/*     */     //   4: astore_2
/*     */     //   5: monitorenter
/*     */     //   6: aload_0
/*     */     //   7: aload_1
/*     */     //   8: invokespecial entry : (Ljava/lang/String;)Lscala/Option;
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: instanceof scala/Some
/*     */     //   18: ifeq -> 56
/*     */     //   21: aload #4
/*     */     //   23: checkcast scala/Some
/*     */     //   26: astore #5
/*     */     //   28: aload #5
/*     */     //   30: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   33: checkcast li/cil/oc/server/fs/ZipFileInputStreamFileSystem$Archive
/*     */     //   36: astore #6
/*     */     //   38: aload #6
/*     */     //   40: invokevirtual isDirectory : ()Z
/*     */     //   43: ifeq -> 56
/*     */     //   46: aload #6
/*     */     //   48: invokevirtual list : ()[Ljava/lang/String;
/*     */     //   51: astore #7
/*     */     //   53: goto -> 59
/*     */     //   56: aconst_null
/*     */     //   57: astore #7
/*     */     //   59: aload #7
/*     */     //   61: astore_3
/*     */     //   62: aload_2
/*     */     //   63: monitorexit
/*     */     //   64: aload_3
/*     */     //   65: checkcast [Ljava/lang/String;
/*     */     //   68: areturn
/*     */     //   69: aload_2
/*     */     //   70: monitorexit
/*     */     //   71: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 0
/*     */     //   #56	-> 6
/*     */     //   #57	-> 13
/*     */     //   #58	-> 56
/*     */     //   #56	-> 59
/*     */     //   #55	-> 63
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	72	0	this	Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem;
/*     */     //   0	72	1	path	Ljava/lang/String;
/*     */     //   38	34	6	entry	Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$Archive;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   6	64	69	finally
/*     */   }
/*     */   
/*     */   public Option<InputStreamFileSystem.InputStreamChannel> openInputChannel(String path)
/*     */   {
/*  64 */     synchronized (ZipFileInputStreamFileSystem$.MODULE$) { return 
/*  65 */         entry(path).map((Function1)new ZipFileInputStreamFileSystem$$anonfun$openInputChannel$1(this)); }  } public final class ZipFileInputStreamFileSystem$$anonfun$openInputChannel$1 extends AbstractFunction1<Archive, InputStreamFileSystem.InputStreamChannel> implements Serializable { public static final long serialVersionUID = 0L; public final InputStreamFileSystem.InputStreamChannel apply(ZipFileInputStreamFileSystem.Archive entry) { return new InputStreamFileSystem.InputStreamChannel(this.$outer, entry.openStream()); }
/*     */ 
/*     */     
/*     */     public ZipFileInputStreamFileSystem$$anonfun$openInputChannel$1(ZipFileInputStreamFileSystem $outer) {} }
/*     */   
/*     */   private Option<Archive> entry(String path) {
/*  71 */     String cleanPath = (new StringBuilder()).append("/").append((new StringOps(Predef$.MODULE$.augmentString((new StringOps(Predef$.MODULE$.augmentString(path.replace("\\", "/").replace("//", "/")))).stripPrefix("/")))).stripSuffix("/")).toString();
/*  72 */     String str1 = "/"; if (cleanPath == null) { if (str1 != null); } else if (cleanPath.equals(str1))
/*     */     {  }
/*     */   
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
/*     */   public static ZipFileInputStreamFileSystem fromFile(File paramFile, String paramString) {
/*     */     return ZipFileInputStreamFileSystem$.MODULE$.fromFile(paramFile, paramString);
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
/*     */   public static abstract class Archive
/*     */   {
/*     */     private final String path;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final String name;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final long lastModified;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final boolean isDirectory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String path() {
/* 137 */       return this.path;
/*     */     } public String name() {
/* 139 */       return this.name;
/*     */     } public long lastModified() {
/* 141 */       return this.lastModified;
/*     */     }
/* 143 */     public boolean isDirectory() { return this.isDirectory; } public abstract int size(); public abstract String[] list(); public abstract InputStream openStream(); public abstract Option<Archive> find(Iterable<String> param1Iterable); public Archive(ZipEntry entry, String root) { this.path = (new StringOps(Predef$.MODULE$.augmentString((new StringOps(Predef$.MODULE$.augmentString(entry.getName()))).stripPrefix(root)))).stripSuffix("/"); this.name = path().substring(path().lastIndexOf('/') + 1); this.lastModified = entry.getTime(); this.isDirectory = entry.isDirectory(); }
/*     */   
/*     */   } public static class ArchiveFile extends Archive { private final byte[] data; private final int size; public byte[] data() {
/*     */       return this.data;
/*     */     } public final class ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$1 extends AbstractFunction0.mcI.sp implements Serializable { public static final long serialVersionUID = 0L; private final InputStream in$1; public final int apply() {
/*     */         return apply$mcI$sp();
/*     */       }
/*     */       public int apply$mcI$sp() {
/*     */         return this.in$1.read();
/*     */       }
/*     */       public ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$1(ZipFileInputStreamFileSystem.ArchiveFile $outer, InputStream in$1) {} }
/* 154 */     public ArchiveFile(ZipFile zip, ZipEntry entry, String root) { super(entry, root);
/*     */       
/* 156 */       InputStream in = zip.getInputStream(entry);
/* 157 */       this.data = (byte[])package$.MODULE$.Iterator().continually((Function0)new ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$1(this, in)).takeWhile((Function1)new ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$2(this)).map((Function1)new ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$4(this)).toArray(ClassTag$.MODULE$.Byte());
/*     */ 
/*     */       
/* 160 */       this.size = (data()).length; } public final class ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$2 extends AbstractFunction1.mcZI.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(int x) { return apply$mcZI$sp(x); } public boolean apply$mcZI$sp(int x) { return (-1 != x); } public ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$2(ZipFileInputStreamFileSystem.ArchiveFile $outer) {} } public final class ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$4 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final byte apply(int x$2) { return (byte)x$2; } public ZipFileInputStreamFileSystem$ArchiveFile$$anonfun$4(ZipFileInputStreamFileSystem.ArchiveFile $outer) {} } public int size() { return this.size; }
/*     */      public Null$ list() {
/* 162 */       return null;
/*     */     } public ByteArrayInputStream openStream() {
/* 164 */       return new ByteArrayInputStream(data());
/*     */     }
/*     */     public Option<ZipFileInputStreamFileSystem.Archive> find(Iterable path) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokeinterface size : ()I
/*     */       //   6: iconst_1
/*     */       //   7: if_icmpne -> 51
/*     */       //   10: aload_1
/*     */       //   11: invokeinterface head : ()Ljava/lang/Object;
/*     */       //   16: aload_0
/*     */       //   17: invokevirtual name : ()Ljava/lang/String;
/*     */       //   20: astore_2
/*     */       //   21: dup
/*     */       //   22: ifnonnull -> 33
/*     */       //   25: pop
/*     */       //   26: aload_2
/*     */       //   27: ifnull -> 40
/*     */       //   30: goto -> 51
/*     */       //   33: aload_2
/*     */       //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   37: ifeq -> 51
/*     */       //   40: new scala/Some
/*     */       //   43: dup
/*     */       //   44: aload_0
/*     */       //   45: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   48: goto -> 54
/*     */       //   51: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */       //   54: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #167	-> 0
/*     */       //   #168	-> 51
/*     */       //   #167	-> 54
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	55	0	this	Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$ArchiveFile;
/*     */       //   0	55	1	path	Lscala/collection/Iterable;
/*     */     } }
/*     */   public static class ArchiveDirectory extends Archive { private final Set<ZipFileInputStreamFileSystem.Archive> children; private final int size;
/*     */     
/* 171 */     public ArchiveDirectory(ZipEntry entry, String root) { super(entry, root);
/* 172 */       this.children = Set$.MODULE$.empty();
/*     */       
/* 174 */       this.size = 0; } public Set<ZipFileInputStreamFileSystem.Archive> children() { return this.children; } public int size() { return this.size; }
/*     */     
/* 176 */     public String[] list() { return (String[])((TraversableOnce)children().map((Function1)new ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$list$1(this), Set$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(String.class)); } public final class ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$list$1 extends AbstractFunction1<ZipFileInputStreamFileSystem.Archive, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(ZipFileInputStreamFileSystem.Archive c) { return (new StringBuilder()).append(c.name()).append(c.isDirectory() ? "/" : "").toString(); }
/*     */        public ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$list$1(ZipFileInputStreamFileSystem.ArchiveDirectory $outer) {} } public Null$ openStream() {
/* 178 */       return null;
/*     */     }
/*     */     public Option<ZipFileInputStreamFileSystem.Archive> find(Iterable path) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: invokeinterface head : ()Ljava/lang/Object;
/*     */       //   6: aload_0
/*     */       //   7: invokevirtual name : ()Ljava/lang/String;
/*     */       //   10: astore_2
/*     */       //   11: dup
/*     */       //   12: ifnonnull -> 23
/*     */       //   15: pop
/*     */       //   16: aload_2
/*     */       //   17: ifnull -> 30
/*     */       //   20: goto -> 105
/*     */       //   23: aload_2
/*     */       //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   27: ifeq -> 105
/*     */       //   30: aload_1
/*     */       //   31: invokeinterface size : ()I
/*     */       //   36: iconst_1
/*     */       //   37: if_icmpne -> 51
/*     */       //   40: new scala/Some
/*     */       //   43: dup
/*     */       //   44: aload_0
/*     */       //   45: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   48: goto -> 108
/*     */       //   51: aload_1
/*     */       //   52: iconst_1
/*     */       //   53: invokeinterface drop : (I)Ljava/lang/Object;
/*     */       //   58: checkcast scala/collection/Iterable
/*     */       //   61: astore_3
/*     */       //   62: aload_0
/*     */       //   63: invokevirtual children : ()Lscala/collection/mutable/Set;
/*     */       //   66: new li/cil/oc/server/fs/ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$find$2
/*     */       //   69: dup
/*     */       //   70: aload_0
/*     */       //   71: aload_3
/*     */       //   72: invokespecial <init> : (Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$ArchiveDirectory;Lscala/collection/Iterable;)V
/*     */       //   75: getstatic scala/collection/mutable/Set$.MODULE$ : Lscala/collection/mutable/Set$;
/*     */       //   78: invokevirtual canBuildFrom : ()Lscala/collection/generic/CanBuildFrom;
/*     */       //   81: invokeinterface map : (Lscala/Function1;Lscala/collection/generic/CanBuildFrom;)Ljava/lang/Object;
/*     */       //   86: checkcast scala/collection/TraversableOnce
/*     */       //   89: new li/cil/oc/server/fs/ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$find$1
/*     */       //   92: dup
/*     */       //   93: aload_0
/*     */       //   94: invokespecial <init> : (Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$ArchiveDirectory;)V
/*     */       //   97: invokeinterface collectFirst : (Lscala/PartialFunction;)Lscala/Option;
/*     */       //   102: goto -> 108
/*     */       //   105: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */       //   108: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #181	-> 0
/*     */       //   #182	-> 30
/*     */       //   #184	-> 51
/*     */       //   #185	-> 62
/*     */       //   #190	-> 105
/*     */       //   #181	-> 108
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	109	0	this	Lli/cil/oc/server/fs/ZipFileInputStreamFileSystem$ArchiveDirectory;
/*     */       //   0	109	1	path	Lscala/collection/Iterable;
/*     */       //   62	40	3	subPath	Lscala/collection/Iterable;
/*     */     }
/*     */     public final class ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$find$2 extends AbstractFunction1<ZipFileInputStreamFileSystem.Archive, Option<ZipFileInputStreamFileSystem.Archive>> implements Serializable { public static final long serialVersionUID = 0L; private final Iterable subPath$1;
/*     */       
/* 185 */       public final Option<ZipFileInputStreamFileSystem.Archive> apply(ZipFileInputStreamFileSystem.Archive x$3) { return x$3.find(this.subPath$1); } public ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$find$2(ZipFileInputStreamFileSystem.ArchiveDirectory $outer, Iterable subPath$1) {} } public final class ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$find$1 extends AbstractPartialFunction<Option<ZipFileInputStreamFileSystem.Archive>, ZipFileInputStreamFileSystem.Archive> implements Serializable { public static final long serialVersionUID = 0L; public final <A1 extends Option<ZipFileInputStreamFileSystem.Archive>, B1> B1 applyOrElse(Option x1, Function1 default) { Object object; Option option = x1;
/* 186 */         if (option instanceof Some) { Some some = (Some)option; ZipFileInputStreamFileSystem.Archive a = (ZipFileInputStreamFileSystem.Archive)some.x(); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Option x1) { boolean bool; Option option = x1; if (option instanceof Some) { bool = true; }
/*     */         else
/*     */         { bool = false; }
/*     */         
/*     */         return bool; }
/*     */ 
/*     */       
/*     */       public ZipFileInputStreamFileSystem$ArchiveDirectory$$anonfun$find$1(ZipFileInputStreamFileSystem.ArchiveDirectory $outer) {} }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\ZipFileInputStreamFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */