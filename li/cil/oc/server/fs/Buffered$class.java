/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.concurrent.Future;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.collection.mutable.Map$;
/*     */ import scala.runtime.BooleanRef;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Buffered$class
/*     */ {
/*     */   public static boolean delete(Buffered $this, String path) {
/*     */     $this.li$cil$oc$server$fs$Buffered$$deletions().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(path), BoxesRunTime.boxToLong(System.currentTimeMillis())));
/*     */     return $this.li$cil$oc$server$fs$Buffered$$super$delete(path);
/*     */   }
/*     */   
/*     */   public static void $init$(Buffered $this) {
/*  27 */     $this.li$cil$oc$server$fs$Buffered$_setter_$li$cil$oc$server$fs$Buffered$$deletions_$eq(Map$.MODULE$.empty());
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
/*  49 */     $this.li$cil$oc$server$fs$Buffered$$saving_$eq((Option<Future<?>>)None$.MODULE$);
/*     */   } public static boolean rename(Buffered $this, String from, String to) { $this.li$cil$oc$server$fs$Buffered$$deletions().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(from), BoxesRunTime.boxToLong(System.currentTimeMillis())));
/*     */     return $this.li$cil$oc$server$fs$Buffered$$super$rename(from, to); } public static void load(Buffered $this, NBTTagCompound nbt) {
/*  52 */     $this.li$cil$oc$server$fs$Buffered$$saving().foreach((Function1)new Buffered$$anonfun$load$1($this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     loadFiles($this, nbt);
/*  59 */     $this.li$cil$oc$server$fs$Buffered$$super$load(nbt);
/*     */   }
/*     */   
/*  62 */   private static void loadFiles(Buffered $this, NBTTagCompound nbt) { synchronized ($this) {
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
/* 101 */       recurse$1($this, "", $this.fileRoot()); ($this.fileRoot().list() == null || Predef$.MODULE$.refArrayOps((Object[])$this.fileRoot().list()).isEmpty()) ? BoxesRunTime.boxToBoolean($this.fileRoot().delete()) : BoxedUnit.UNIT;
/*     */       return;
/*     */     }  }
/*     */   
/* 105 */   public static void save(Buffered $this, NBTTagCompound nbt) { $this.li$cil$oc$server$fs$Buffered$$super$save(nbt);
/* 106 */     $this.li$cil$oc$server$fs$Buffered$$saving_$eq(Buffered$.MODULE$.fileSaveHandler().withPool((Function1)new Buffered$$anonfun$save$1($this), Buffered$.MODULE$.fileSaveHandler().withPool$default$2())); }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void saveFiles(Buffered $this) {
/* 111 */     synchronized ($this) {
/* 112 */       $this.li$cil$oc$server$fs$Buffered$$deletions().withFilter((Function1)new Buffered$$anonfun$saveFiles$1($this)).foreach((Function1)new Buffered$$anonfun$saveFiles$2($this));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 117 */       $this.li$cil$oc$server$fs$Buffered$$deletions().clear();
/*     */       
/* 119 */       ByteBuffer buffer = ByteBuffer.allocateDirect(16384);
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
/* 161 */       ($this.list("") == null || Predef$.MODULE$.refArrayOps((Object[])$this.list("")).isEmpty()) ? 
/* 162 */         BoxesRunTime.boxToBoolean($this.fileRoot().delete()) : 
/*     */         
/* 164 */         BoxesRunTime.boxToBoolean(recurse$2($this, "", buffer));
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static final void recurse$1(Buffered $this, String path, File directory) {
/*     */     $this.makeDirectory(path);
/*     */     Predef$.MODULE$.refArrayOps((Object[])directory.listFiles()).withFilter((Function1)new Buffered$$anonfun$recurse$1$1($this)).foreach((Function1)new Buffered$$anonfun$recurse$1$2($this, path, directory));
/*     */     $this.setLastModified(path, directory.lastModified());
/*     */   }
/*     */   
/*     */   public static final boolean recurse$2(Buffered $this, String path, ByteBuffer buffer$1) {
/*     */     File directory = new File($this.fileRoot(), path);
/*     */     directory.mkdirs();
/*     */     BooleanRef dirChanged = BooleanRef.create(false);
/*     */     Predef$.MODULE$.refArrayOps((Object[])$this.list(path)).foreach((Function1)new Buffered$$anonfun$recurse$2$1($this, buffer$1, path, dirChanged));
/*     */     directory.setLastModified($this.lastModified(path));
/*     */     return dirChanged.elem;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\Buffered$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */