/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import com.google.common.cache.Cache;
/*     */ import com.google.common.cache.CacheBuilder;
/*     */ import java.io.File;
/*     */ import java.util.Enumeration;
/*     */ import java.util.concurrent.Callable;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipFile;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.StringContext;
/*     */ import scala.collection.GenTraversableOnce;
/*     */ import scala.collection.IterableLike;
/*     */ import scala.collection.immutable.StringOps;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.collection.mutable.SetLike;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ZipFileInputStreamFileSystem$
/*     */ {
/*     */   public static final ZipFileInputStreamFileSystem$ MODULE$;
/*     */   private final Cache<String, ZipFileInputStreamFileSystem.ArchiveDirectory> cache;
/*     */   
/*     */   private Cache<String, ZipFileInputStreamFileSystem.ArchiveDirectory> cache() {
/*  78 */     return this.cache;
/*     */   }
/*     */   
/*     */   public ZipFileInputStreamFileSystem fromFile(File file, String innerPath)
/*     */   {
/*  83 */     synchronized (this) { return 
/*  84 */         liftedTree1$1(file, innerPath); }
/*  85 */      } private final ZipFileInputStreamFileSystem liftedTree1$1(File file$1, String innerPath$1) { try { Object object; Option option = scala.Option$.MODULE$.apply(cache().get((new StringBuilder()).append(file$1.getPath()).append(":").append(innerPath$1).toString(), new ZipFileInputStreamFileSystem$$anon$1(file$1, innerPath$1)));
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
/* 125 */       if (option instanceof Some) { Some some = (Some)option; ZipFileInputStreamFileSystem.ArchiveDirectory archive = (ZipFileInputStreamFileSystem.ArchiveDirectory)some.x(); object = new ZipFileInputStreamFileSystem(archive); }
/* 126 */       else { object = null; }
/*     */        }
/*     */     finally
/*     */     { Exception exception = null; }
/*     */      }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ZipFileInputStreamFileSystem$() {
/* 193 */     MODULE$ = this;
/*     */     this.cache = CacheBuilder.newBuilder().weakValues().build();
/*     */   }
/*     */   
/*     */   public final class ZipFileInputStreamFileSystem$$anon$1 implements Callable<ZipFileInputStreamFileSystem.ArchiveDirectory> {
/*     */     private final File file$1;
/*     */     private final String innerPath$1;
/*     */     
/*     */     public ZipFileInputStreamFileSystem$$anon$1(File file$1, String innerPath$1) {}
/*     */     
/*     */     public ZipFileInputStreamFileSystem.ArchiveDirectory call() {
/*     */       ZipFile zip = new ZipFile(this.file$1.getPath());
/*     */       try {
/*     */         String cleanedPath = (new StringBuilder()).append((new StringOps(scala.Predef$.MODULE$.augmentString((new StringOps(scala.Predef$.MODULE$.augmentString(this.innerPath$1))).stripPrefix("/")))).stripSuffix("/")).append("/").toString();
/*     */         ZipEntry rootEntry = zip.getEntry(cleanedPath);
/*     */         if (rootEntry != null && rootEntry.isDirectory()) {
/*     */           Set directories = scala.collection.mutable.Set$.MODULE$.empty();
/*     */           Set files = scala.collection.mutable.Set$.MODULE$.empty();
/*     */           Enumeration<? extends ZipEntry> iterator = zip.entries();
/*     */           while (iterator.hasMoreElements()) {
/*     */             ZipEntry entry = iterator.nextElement();
/*     */             entry.getName().startsWith(cleanedPath) ? (entry.isDirectory() ? directories.$plus$eq(new ZipFileInputStreamFileSystem.ArchiveDirectory(entry, cleanedPath)) : files.$plus$eq(new ZipFileInputStreamFileSystem.ArchiveFile(zip, entry, cleanedPath))) : BoxedUnit.UNIT;
/*     */           } 
/*     */           ObjectRef root = ObjectRef.create(null);
/*     */           ((IterableLike)directories.$plus$plus((GenTraversableOnce)files, scala.collection.mutable.Set$.MODULE$.canBuildFrom())).foreach((Function1)new ZipFileInputStreamFileSystem$$anon$1$$anonfun$call$1(this, directories, root));
/*     */           return (ZipFileInputStreamFileSystem.ArchiveDirectory)root.elem;
/*     */         } 
/*     */         (new String[3])[0] = "Root path ";
/*     */         (new String[3])[1] = " doesn't exist or is not a directory in ZIP file ";
/*     */         (new String[3])[2] = ".";
/*     */         throw new IllegalArgumentException((new StringContext(scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s(scala.Predef$.MODULE$.genericWrapArray(new Object[] { this.innerPath$1, this.file$1.getName() })));
/*     */       } finally {
/*     */         zip.close();
/*     */       } 
/*     */     }
/*     */     
/*     */     public final class ZipFileInputStreamFileSystem$$anon$1$$anonfun$call$1 extends AbstractFunction1<ZipFileInputStreamFileSystem.Archive, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final Set directories$1;
/*     */       private final ObjectRef root$1;
/*     */       
/*     */       public ZipFileInputStreamFileSystem$$anon$1$$anonfun$call$1(ZipFileInputStreamFileSystem$$anon$1 $outer, Set directories$1, ObjectRef root$1) {}
/*     */       
/*     */       public final Object apply(ZipFileInputStreamFileSystem.Archive entry) {
/*     */         BoxedUnit boxedUnit;
/*     */         String parent = entry.path().substring(0, scala.math.package$.MODULE$.max(entry.path().lastIndexOf('/'), 0));
/*     */         Option option = this.directories$1.find((Function1)new ZipFileInputStreamFileSystem$$anon$1$$anonfun$call$1$$anonfun$3(this, parent));
/*     */         if (option instanceof Some) {
/*     */           Some some = (Some)option;
/*     */           ZipFileInputStreamFileSystem.ArchiveDirectory directory = (ZipFileInputStreamFileSystem.ArchiveDirectory)some.x();
/*     */           SetLike setLike = directory.children().$plus$eq(entry);
/*     */         } else {
/*     */           boxedUnit = BoxedUnit.UNIT;
/*     */         } 
/*     */         scala.Predef$.MODULE$.assert(entry instanceof ZipFileInputStreamFileSystem.ArchiveDirectory);
/*     */         this.root$1.elem = entry;
/*     */         return (entry.path().length() > 0) ? boxedUnit : BoxedUnit.UNIT;
/*     */       }
/*     */       
/*     */       public final class ZipFileInputStreamFileSystem$$anon$1$$anonfun$call$1$$anonfun$3 extends AbstractFunction1<ZipFileInputStreamFileSystem.ArchiveDirectory, Object> implements Serializable {
/*     */         public static final long serialVersionUID = 0L;
/*     */         private final String parent$1;
/*     */         
/*     */         public final boolean apply(ZipFileInputStreamFileSystem.ArchiveDirectory d) {
/*     */           String str = this.parent$1;
/*     */           if (d.path() == null) {
/*     */             d.path();
/*     */             if (str != null);
/*     */           } else if (d.path().equals(str)) {
/*     */           
/*     */           } 
/*     */         }
/*     */         
/*     */         public ZipFileInputStreamFileSystem$$anon$1$$anonfun$call$1$$anonfun$3(ZipFileInputStreamFileSystem$$anon$1$$anonfun$call$1 $outer, String parent$1) {}
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\ZipFileInputStreamFileSystem$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */