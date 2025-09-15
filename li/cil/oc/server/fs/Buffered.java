/*     */ package li.cil.oc.server.fs;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.channels.FileChannel;
/*     */ import java.util.concurrent.Future;
/*     */ import java.util.concurrent.ScheduledExecutorService;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ import scala.MatchError;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.mutable.Map;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BooleanRef;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\ru!B\001\003\021\003i\021\001\003\"vM\032,'/\0323\013\005\r!\021A\0014t\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"\001\003\"vM\032,'/\0323\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"AB!osJ+g\rC\003\032\037\021\005!$\001\004=S:LGO\020\013\002\033!9Ad\004b\001\n\003i\022a\0044jY\026\034\026M^3IC:$G.\032:\026\003y\001\"a\b\022\016\003\001R!!\t\004\002\tU$\030\016\\\005\003G\001\022abU1gKRC'/Z1e!>|G\016\003\004&\037\001\006IAH\001\021M&dWmU1wK\"\013g\016\0327fe\0022q\001\005\002\021\002\007\005qeE\002'QA\002\"!\013\030\016\003)R!a\013\027\002\t1\fgn\032\006\002[\005!!.\031<b\023\ty#F\001\004PE*,7\r\036\t\003\035EJ!A\r\002\003-=+H\017];u'R\024X-Y7GS2,7+_:uK6DQ\001\016\024\005\002U\na\001J5oSR$C#\001\034\021\005M9\024B\001\035\025\005\021)f.\033;\t\013i2c\021C\036\002\021\031LG.\032*p_R,\022\001\020\t\003{\001k\021A\020\006\0031\n!![8\n\005\005s$\001\002$jY\026Dqa\021\024C\002\023%A)A\005eK2,G/[8ogV\tQ\t\005\003G\0276#V\"A$\013\005!K\025aB7vi\006\024G.\032\006\003\025R\t!bY8mY\026\034G/[8o\023\tauIA\002NCB\004\"AT)\017\005My\025B\001)\025\003\031\001&/\0323fM&\021!k\025\002\007'R\024\030N\\4\013\005A#\002CA\nV\023\t1FC\001\003M_:<\007B\002-'A\003%Q)\001\006eK2,G/[8og\002BQA\027\024\005Bm\013a\001Z3mKR,GC\001/`!\t\031R,\003\002_)\t9!i\\8mK\006t\007\"\0021Z\001\004i\025\001\0029bi\"DQA\031\024\005B\r\faA]3oC6,Gc\001/eM\")Q-\031a\001\033\006!aM]8n\021\0259\027\r1\001N\003\t!x\016C\004jM\001\007I\021\0026\002\rM\fg/\0338h+\005Y\007cA\nm]&\021Q\016\006\002\007\037B$\030n\03481\005=D\bc\0019um6\t\021O\003\002sg\006Q1m\0348dkJ\024XM\034;\013\005\005b\023BA;r\005\0311U\017^;sKB\021q\017\037\007\001\t)I(0!A\001\002\013\005\0211\001\002\004?\022\n\004BB>'A\003&A0A\004tCZLgn\032\021\021\007MaW\020M\002\003\003\0012\001\035;\000!\r9\030\021\001\003\013sj\f\t\021!A\003\002\005\r\021\003BA\003\003\027\0012aEA\004\023\r\tI\001\006\002\b\035>$\b.\0338h!\r\031\022QB\005\004\003\037!\"aA!os\"I\0211\003\024A\002\023%\021QC\001\013g\0064\030N\\4`I\025\fHc\001\034\002\030!Q\021\021DA\t\003\003\005\r!a\007\002\007a$\023\007\005\003\024Y\006u\001\007BA\020\003G\001B\001\035;\002\"A\031q/a\t\005\025eT\030\021!A\001\006\003\t\031\001C\004\002(\031\"\t%!\013\002\t1|\027\r\032\013\004m\005-\002\002CA\027\003K\001\r!a\f\002\0079\024G\017\005\003\0022\005uRBAA\032\025\021\ti#!\016\013\t\005]\022\021H\001\n[&tWm\031:bMRT!!a\017\002\0079,G/\003\003\002@\005M\"A\004(C)R\013wmQ8na>,h\016\032\005\b\003\0072C\021BA#\003%aw.\0313GS2,7\017F\0027\003\017B\001\"!\f\002B\001\007\021q\006\005\b\003\0272C\021IA'\003\021\031\030M^3\025\007Y\ny\005\003\005\002.\005%\003\031AA\030\021\031\t\031F\nC\001k\005I1/\031<f\r&dWm\035\005\017\003/2\003\023aA\001\002\023%\021\021LA/\0031\031X\017]3sI\021,G.\032;f)\ra\0261\f\005\007A\006U\003\031A'\n\007i\013y&C\002\002b\t\021Q#\0238qkR\034FO]3b[\032KG.Z*zgR,W\016\003\b\002f\031\002\n1!A\001\n\023\t9'!\034\002\031M,\b/\032:%e\026t\027-\\3\025\013q\013I'a\033\t\r\025\f\031\0071\001N\021\0319\0271\ra\001\033&\031!-a\030\t\035\005Ed\005%A\002\002\003%I!a\035\002x\005Q1/\0369fe\022bw.\0313\025\007Y\n)\b\003\005\002.\005=\004\031AA\030\023\r\t9#\r\005\017\003w2\003\023aA\001\002\023%\021QPAA\003)\031X\017]3sIM\fg/\032\013\004m\005}\004\002CA\027\003s\002\r!a\f\n\007\005-\023\007")
/*     */ public interface Buffered extends OutputStreamFileSystem {
/*     */   void li$cil$oc$server$fs$Buffered$_setter_$li$cil$oc$server$fs$Buffered$$deletions_$eq(Map paramMap);
/*     */   
/*     */   File fileRoot();
/*     */   
/*     */   Map<String, Object> li$cil$oc$server$fs$Buffered$$deletions();
/*     */   
/*     */   boolean delete(String paramString);
/*     */   
/*     */   boolean rename(String paramString1, String paramString2);
/*     */   
/*     */   Option<Future<?>> li$cil$oc$server$fs$Buffered$$saving();
/*     */   
/*     */   @TraitSetter
/*     */   void li$cil$oc$server$fs$Buffered$$saving_$eq(Option<Future<?>> paramOption);
/*     */   
/*     */   void load(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   void save(NBTTagCompound paramNBTTagCompound);
/*     */   
/*     */   void saveFiles();
/*     */   
/*     */   public final class Buffered$$anonfun$load$1 extends AbstractFunction1<Future<?>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Object apply(Future f) {
/*     */       
/*     */       try {  }
/*     */       catch (TimeoutException timeoutException)
/*  52 */       { OpenComputers$.MODULE$.log().warn("Waiting for filesystem to save took two minutes! Aborting."); } catch (CancellationException cancellationException) {} return BoxedUnit.UNIT;
/*     */     }
/*     */     
/*     */     public Buffered$$anonfun$load$1(Buffered $outer) {}
/*     */   }
/*     */   
/*     */   public final class Buffered$$anonfun$recurse$1$1
/*     */     extends AbstractFunction1<File, Object> implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public Buffered$$anonfun$recurse$1$1(Buffered $outer) {}
/*     */     
/*  65 */     public final boolean apply(File child) { return FileSystem$.MODULE$.isValidFilename(child.getName()); } } public final class Buffered$$anonfun$recurse$1$2 extends AbstractFunction1<File, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String path$1; private final File directory$1; public Buffered$$anonfun$recurse$1$2(Buffered $outer, String path$1, File directory$1) {} public final Object apply(File child) {
/*  66 */       String childPath = (new StringBuilder()).append(this.path$1).append(child.getName()).toString();
/*  67 */       File childFile = new File(this.directory$1, child.getName());
/*     */       
/*  69 */       Buffered$class.recurse$1(this.$outer, (new StringBuilder()).append(childPath).append("/").toString(), childFile);
/*     */       
/*  71 */       if (this.$outer.exists(childPath) && this.$outer.isDirectory(childPath)) {  }
/*  72 */       else { OutputStreamFileSystem.OutputHandle stream; Option<OutputStreamFileSystem.OutputHandle> option = this.$outer.openOutputHandle(0, childPath, Mode.Write);
/*  73 */         if (option instanceof Some) { Some some = (Some)option; stream = (OutputStreamFileSystem.OutputHandle)some.x();
/*     */           try {
/*  75 */             FileInputStream in = new FileInputStream(childFile);
/*  76 */             byte[] buffer = new byte[8192];
/*  77 */             int read = 0; while (true)
/*  78 */             { read = in.read(buffer);
/*     */               
/*  80 */               if (read > 0)
/*  81 */                 if (read == buffer.length) { stream.write(buffer); }
/*  82 */                 else { stream.write((byte[])Predef$.MODULE$.byteArrayOps(buffer).view(0, read).toArray(ClassTag$.MODULE$.Byte())); }
/*     */                  
/*  84 */               if (read < 0) {
/*  85 */                 in.close();
/*     */               } else {
/*     */                 continue;
/*     */               } 
/*     */               
/*  90 */               stream.close(); } 
/*     */           } catch (FileNotFoundException fileNotFoundException) {} }
/*  92 */         else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */         
/*     */         stream.close(); }
/*     */       
/*     */       return (child.exists() && child.isDirectory() && child.list() != null) ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(this.$outer.setLastModified(childPath, childFile.lastModified()));
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class Buffered$$anonfun$save$1
/*     */     extends AbstractFunction1<ScheduledExecutorService, Future<?>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/* 106 */     public final Future<?> apply(ScheduledExecutorService x$1) { return x$1.submit(new Buffered$$anonfun$save$1$$anon$1(this)); } public Buffered$$anonfun$save$1(Buffered $outer) {} public final class Buffered$$anonfun$save$1$$anon$1 implements Runnable { public Buffered$$anonfun$save$1$$anon$1(Buffered$$anonfun$save$1 $outer) {} public void run() {
/* 107 */         this.$outer.li$cil$oc$server$fs$Buffered$$anonfun$$$outer().saveFiles();
/*     */       } } }
/*     */   public final class Buffered$$anonfun$saveFiles$1 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool;
/* 112 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public Buffered$$anonfun$saveFiles$1(Buffered $outer) {} } public final class Buffered$$anonfun$saveFiles$2 extends AbstractFunction1<Tuple2<String, Object>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Tuple2 x$2) { Tuple2 tuple2 = x$2; if (tuple2 != null) { String path = (String)tuple2._1(); long time = tuple2._2$mcJ$sp();
/* 113 */         File file = new File(this.$outer.fileRoot(), path);
/* 114 */         return FileUtils.isFileOlder(file, time) ? 
/* 115 */           BoxesRunTime.boxToBoolean(FileUtils.deleteQuietly(file)) : BoxedUnit.UNIT; }
/*     */       
/*     */       throw new MatchError(tuple2); }
/*     */     
/*     */     public Buffered$$anonfun$saveFiles$2(Buffered $outer) {} }
/*     */   public final class Buffered$$anonfun$recurse$2$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ByteBuffer buffer$1; private final String path$2; private final BooleanRef dirChanged$1;
/*     */     
/*     */     public Buffered$$anonfun$recurse$2$1(Buffered $outer, ByteBuffer buffer$1, String path$2, BooleanRef dirChanged$1) {}
/*     */     
/*     */     public final void apply(String child) {
/* 125 */       String childPath = (new StringBuilder()).append(this.path$2).append(child).toString();
/* 126 */       if (this.$outer.isDirectory(childPath)) {
/* 127 */         this.dirChanged$1.elem = (Buffered$class.recurse$2(this.$outer, childPath, this.buffer$1) || this.dirChanged$1.elem);
/*     */       } else {
/* 129 */         File childFile = new File(this.$outer.fileRoot(), childPath);
/* 130 */         long time = this.$outer.lastModified(childPath);
/* 131 */         if (time == 0L || !childFile.exists() || FileUtils.isFileOlder(childFile, time)) {
/* 132 */           FileUtils.deleteQuietly(childFile);
/* 133 */           childFile.createNewFile();
/* 134 */           FileChannel out = (new FileOutputStream(childFile)).getChannel();
/* 135 */           InputStreamFileSystem.InputChannel in = (InputStreamFileSystem.InputChannel)this.$outer.openInputChannel(childPath).get();
/*     */           
/* 137 */           this.buffer$1.clear();
/* 138 */           while (in.read(this.buffer$1) != -1) {
/* 139 */             this.buffer$1.flip();
/* 140 */             out.write(this.buffer$1);
/* 141 */             this.buffer$1.compact();
/*     */           } 
/*     */           
/* 144 */           this.buffer$1.flip();
/* 145 */           while (this.buffer$1.hasRemaining()) {
/* 146 */             out.write(this.buffer$1);
/*     */           }
/*     */           
/* 149 */           out.close();
/* 150 */           in.close();
/* 151 */           childFile.setLastModified(time);
/* 152 */           this.dirChanged$1.elem = true;
/*     */         } 
/*     */       } 
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\Buffered.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */