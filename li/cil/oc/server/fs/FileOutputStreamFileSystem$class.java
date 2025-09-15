/*    */ package li.cil.oc.server.fs;
/*    */ import java.io.File;
/*    */ import java.nio.file.CopyOption;
/*    */ import java.nio.file.StandardCopyOption;
/*    */ import li.cil.oc.api.fs.Mode;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ 
/*    */ public abstract class FileOutputStreamFileSystem$class {
/*    */   public static long spaceTotal(FileOutputStreamFileSystem $this) {
/* 11 */     return -1L;
/*    */   } public static void $init$(FileOutputStreamFileSystem $this) {} public static long spaceUsed(FileOutputStreamFileSystem $this) {
/* 13 */     return -1L;
/*    */   }
/*    */   
/*    */   public static boolean delete(FileOutputStreamFileSystem $this, String path)
/*    */   {
/* 18 */     File file = new File($this.root(), FileSystem$.MODULE$.validatePath(path));
/* 19 */     File file1 = $this.root(); if (file == null) { if (file1 != null) { if (file.delete()); return false; }  } else if (!file.equals(file1)) { if (file.delete());
/*    */       return false; }
/*    */      } public static boolean makeDirectory(FileOutputStreamFileSystem $this, String path) {
/* 22 */     return (new File($this.root(), FileSystem$.MODULE$.validatePath(path))).mkdir();
/*    */   }
/*    */   public static boolean rename(FileOutputStreamFileSystem $this, String from, String to) {
/*    */     try {
/* 26 */       Files.move((new File($this.root(), FileSystem$.MODULE$.validatePath(from))).toPath(), (new File($this.root(), FileSystem$.MODULE$.validatePath(to))).toPath(), new CopyOption[] { StandardCopyOption.REPLACE_EXISTING });
/*    */     } catch (Exception exception) {}
/*    */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean setLastModified(FileOutputStreamFileSystem $this, String path, long time) {
/* 33 */     return (new File($this.root(), FileSystem$.MODULE$.validatePath(path))).setLastModified(time);
/*    */   }
/*    */   
/*    */   public static Option openOutputHandle(FileOutputStreamFileSystem $this, int id, String path, Mode mode) {
/*    */     boolean bool;
/* 38 */     Mode mode1 = mode;
/* 39 */     if (Mode.Append.equals(mode1)) { bool = true; } else if (Mode.Write.equals(mode1)) { bool = true; } else { bool = false; }  if (bool) String str = "rw"; 
/* 40 */     throw new IllegalArgumentException();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void save(FileOutputStreamFileSystem $this, NBTTagCompound nbt) {
/* 46 */     $this.li$cil$oc$server$fs$FileOutputStreamFileSystem$$super$save(nbt);
/* 47 */     $this.root().mkdirs();
/* 48 */     $this.root().setLastModified(System.currentTimeMillis());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\FileOutputStreamFileSystem$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */