/*    */ package li.cil.oc.server.fs;
/*    */ import java.io.File;
/*    */ import scala.Function2;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class FileInputStreamFileSystem$class {
/*    */   public static long spaceTotal(FileInputStreamFileSystem $this) {
/* 10 */     return $this.spaceUsed();
/*    */   } public static void $init$(FileInputStreamFileSystem $this) {} public static long spaceUsed(FileInputStreamFileSystem $this) {
/* 12 */     return $this.li$cil$oc$server$fs$FileInputStreamFileSystem$$spaceUsed_();
/*    */   }
/*    */   
/*    */   public static final long recurse$1(FileInputStreamFileSystem $this, File path) {
/* 16 */     return path.isDirectory() ? 
/* 17 */       BoxesRunTime.unboxToLong(Predef$.MODULE$.refArrayOps((Object[])path.listFiles()).foldLeft(BoxesRunTime.boxToLong(0L), (Function2)new FileInputStreamFileSystem$$anonfun$recurse$1$1($this))) : 
/*    */       
/* 19 */       path.length();
/*    */   } public static long li$cil$oc$server$fs$FileInputStreamFileSystem$$spaceUsed_(FileInputStreamFileSystem $this) {
/* 21 */     return recurse$1($this, $this.root());
/*    */   }
/*    */   
/*    */   public static boolean exists(FileInputStreamFileSystem $this, String path)
/*    */   {
/* 26 */     return (new File($this.root(), FileSystem$.MODULE$.validatePath(path))).exists();
/*    */   } public static long size(FileInputStreamFileSystem $this, String path) { long l;
/* 28 */     File file = new File($this.root(), FileSystem$.MODULE$.validatePath(path));
/* 29 */     if (file.isFile()) { l = file.length(); }
/* 30 */     else { l = 0L; }
/*    */     
/*    */     return l; } public static boolean isDirectory(FileInputStreamFileSystem $this, String path) {
/* 33 */     return (new File($this.root(), FileSystem$.MODULE$.validatePath(path))).isDirectory();
/*    */   } public static long lastModified(FileInputStreamFileSystem $this, String path) {
/* 35 */     return (new File($this.root(), FileSystem$.MODULE$.validatePath(path))).lastModified();
/*    */   } public static String[] list(FileInputStreamFileSystem $this, String path) {
/* 37 */     File file = new File($this.root(), FileSystem$.MODULE$.validatePath(path));
/* 38 */     if (file.exists() && file.isFile()) { (new String[1])[0] = file.getName(); String[] arrayOfString = new String[1]; }
/* 39 */     else { if (file.exists() && file.isDirectory() && file.list() != null)
/* 40 */         return (String[])Predef$.MODULE$.refArrayOps((Object[])file.listFiles()).map((Function1)new FileInputStreamFileSystem$$anonfun$list$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(String.class))); 
/* 41 */       throw new FileNotFoundException((new StringBuilder()).append("no such file or directory: ").append(path).toString()); }
/*    */     
/*    */     return (String[])SYNTHETIC_LOCAL_VARIABLE_3;
/*    */   }
/*    */   public static Some openInputChannel(FileInputStreamFileSystem $this, String path) {
/* 46 */     return new Some(new FileInputStreamFileSystem.FileChannel($this, new File($this.root(), path)));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\FileInputStreamFileSystem$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */