/*     */ package li.cil.oc.server.fs;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.net.URL;
/*     */ import li.cil.oc.api.fs.FileSystem;
/*     */ import li.cil.oc.api.fs.Label;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class FileSystem$ implements FileSystemAPI {
/*     */   public static final FileSystem$ MODULE$;
/*     */   private boolean isCaseInsensitive;
/*     */   private final Set<Object> li$cil$oc$server$fs$FileSystem$$invalidChars;
/*     */   private volatile boolean bitmap$0;
/*     */   
/*  25 */   private FileSystem$() { MODULE$ = this;
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
/*  51 */     this.li$cil$oc$server$fs$FileSystem$$invalidChars = (new StringOps(scala.Predef$.MODULE$.augmentString("\\:*?\"<>|"))).toSet(); } private boolean isCaseInsensitive$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.isCaseInsensitive = (li.cil.oc.Settings$.MODULE$.get().forceCaseInsensitive() || liftedTree1$1()); this.bitmap$0 = true; }  return this.isCaseInsensitive; }  } public Set<Object> li$cil$oc$server$fs$FileSystem$$invalidChars() { return this.li$cil$oc$server$fs$FileSystem$$invalidChars; }
/*     */   public boolean isCaseInsensitive() { return this.bitmap$0 ? this.isCaseInsensitive : isCaseInsensitive$lzycompute(); }
/*  53 */   private final boolean liftedTree1$1() { try { String uuid = UUID.randomUUID().toString(); File lowerCase = new File(DimensionManager.getCurrentSaveRootDirectory(), (new StringBuilder()).append(uuid).append("oc_rox").toString()); File upperCase = new File(DimensionManager.getCurrentSaveRootDirectory(), (new StringBuilder()).append(uuid).append("OC_ROX").toString()); (lowerCase.exists() && lowerCase.delete()) ? 1 : 0; (upperCase.exists() && upperCase.delete()) ? 1 : 0; lowerCase.createNewFile(); boolean insensitive = upperCase.exists(); lowerCase.delete(); } finally { Exception exception = null; }  } public boolean isValidFilename(String name) { return !(new StringOps(scala.Predef$.MODULE$.augmentString(name))).exists((Function1)new FileSystem$$anonfun$isValidFilename$1()); } public final class FileSystem$$anonfun$isValidFilename$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(char elem) { return FileSystem$.MODULE$.li$cil$oc$server$fs$FileSystem$$invalidChars().contains(BoxesRunTime.boxToCharacter(elem)); }
/*     */      }
/*     */   public String validatePath(String path) {
/*  56 */     if (isValidFilename(path))
/*     */     {
/*     */       
/*  59 */       return path; } 
/*     */     throw new IOException("path contains invalid characters");
/*     */   }
/*     */   
/*  63 */   public FileSystem fromClass(Class clazz, String domain, String root) { String innerPath = (new StringBuilder()).append("/assets/").append(domain).append("/").append((new StringBuilder()).append(root.trim()).append("/").toString()).toString().replace("//", "/");
/*     */     
/*  65 */     String codeSource = clazz.getProtectionDomain().getCodeSource().getLocation().getPath();
/*     */     
/*  67 */     Tuple2 tuple2 = (codeSource.contains(".zip!") || codeSource.contains(".jar!")) ? 
/*  68 */       new Tuple2(codeSource.substring(0, codeSource.lastIndexOf('!')), BoxesRunTime.boxToBoolean(true)) : 
/*     */       
/*  70 */       new Tuple2(codeSource, BoxesRunTime.boxToBoolean(false)); if (tuple2 != null) {
/*     */       String codeUrl = (String)tuple2._1(); boolean isArchive = tuple2._2$mcZ$sp(); Tuple2 tuple22 = new Tuple2(codeUrl, BoxesRunTime.boxToBoolean(isArchive)), tuple21 = tuple22; String str1 = (String)tuple21._1(); boolean bool1 = tuple21._2$mcZ$sp();
/*     */     } 
/*  73 */     throw new MatchError(tuple2); } public final class FileSystem$$anonfun$3 extends AbstractFunction0<URL> implements Serializable { public static final long serialVersionUID = 0L; private final String codeUrl$1; public final URL apply() { return new URL(this.codeUrl$1); } public FileSystem$$anonfun$3(String codeUrl$1) {} } public final class FileSystem$$anonfun$1 extends AbstractPartialFunction<Throwable, Try<URL>> implements Serializable { public static final long serialVersionUID = 0L; public final String codeUrl$1; public final <A1 extends Throwable, B1> B1 applyOrElse(Throwable x1, Function1 default) { Object object;
/*  74 */       Throwable throwable = x1;
/*  75 */       if (throwable instanceof java.net.MalformedURLException) { object = scala.util.Try$.MODULE$.apply(
/*  76 */             (Function0)new FileSystem$$anonfun$1$$anonfun$applyOrElse$1(this)); } else { object = default.apply(x1); }  return (B1)object; } public final boolean isDefinedAt(Throwable x1) { boolean bool; Throwable throwable = x1; if (throwable instanceof java.net.MalformedURLException) { bool = true; } else { bool = false; }  return bool; } public FileSystem$$anonfun$1(String codeUrl$1) {} public final class FileSystem$$anonfun$1$$anonfun$applyOrElse$1 extends AbstractFunction0<URL> implements Serializable { public static final long serialVersionUID = 0L; public final URL apply() { return new URL((new StringBuilder()).append("file://").append(this.$outer.codeUrl$1).toString()); }
/*     */        public FileSystem$$anonfun$1$$anonfun$applyOrElse$1(FileSystem$$anonfun$1 $outer) {} } }
/*     */   public final class FileSystem$$anonfun$4 extends AbstractFunction1<URL, File> implements Serializable { public static final long serialVersionUID = 0L;
/*  79 */     public final File apply(URL url) { return new File(url.toURI()); } } public final class FileSystem$$anonfun$2 extends AbstractPartialFunction<Throwable, Try<File>> implements Serializable { public static final long serialVersionUID = 0L; private final Try url$1; public final <A1 extends Throwable, B1> B1 applyOrElse(Throwable x2, Function1 default) { Object object; Throwable throwable = x2;
/*  80 */       if (throwable instanceof java.net.URISyntaxException) { object = this.url$1.map((Function1)new FileSystem$$anonfun$2$$anonfun$applyOrElse$2(this)); } else { object = default.apply(x2); }  return (B1)object; } public final boolean isDefinedAt(Throwable x2) { boolean bool; Throwable throwable = x2; if (throwable instanceof java.net.URISyntaxException) { bool = true; } else { bool = false; }  return bool; } public FileSystem$$anonfun$2(Try url$1) {} public final class FileSystem$$anonfun$2$$anonfun$applyOrElse$2 extends AbstractFunction1<URL, File> implements Serializable { public static final long serialVersionUID = 0L; public final File apply(URL url) { return new File(url.getPath()); } public FileSystem$$anonfun$2$$anonfun$applyOrElse$2(FileSystem$$anonfun$2 $outer) {} } } public final class FileSystem$$anonfun$5 extends AbstractFunction0<File> implements Serializable { public static final long serialVersionUID = 0L; private final String codeSource$1; public final File apply() {
/*  81 */       return new File(this.codeSource$1);
/*     */     }
/*     */     
/*     */     public FileSystem$$anonfun$5(String codeSource$1) {} }
/*     */ 
/*     */   
/*     */   public final class FileSystem$$anonfun$6 extends AbstractFunction1<String, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final String innerPath$1;
/*     */     
/*     */     public FileSystem$$anonfun$6(String innerPath$1) {}
/*     */     
/*     */     public final boolean apply(String cp) {
/*  94 */       File fsp = new File(new File(cp), this.innerPath$1);
/*  95 */       return (fsp.exists() && fsp.isDirectory());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Capacity fromSaveDirectory(String root, long capacity, boolean buffered) {
/* 105 */     File path = new File(DimensionManager.getCurrentSaveRootDirectory(), (new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.savePath()).append(root).toString());
/* 106 */     path.isDirectory() ? BoxedUnit.UNIT : 
/* 107 */       BoxesRunTime.boxToBoolean(path.delete());
/*     */     
/* 109 */     path.mkdirs();
/* 110 */     return (path.exists() && path.isDirectory()) ? (
/* 111 */       buffered ? new FileSystem.BufferedFileSystem(path, capacity) : 
/* 112 */       new FileSystem.ReadWriteFileSystem(path, capacity)) : 
/*     */       
/* 114 */       null;
/*     */   }
/*     */   
/*     */   public boolean removeAddress(ItemStack fsStack) {
/* 118 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(fsStack);
/* 119 */     if (option instanceof Some) { Some some = (Some)option; Delegate drive = (Delegate)some.x(); if (drive instanceof li.cil.oc.common.item.traits.FileSystemLike)
/* 120 */       { NBTTagCompound data = li.cil.oc.integration.opencomputers.Item$.MODULE$.dataTag(fsStack);
/*     */         
/* 122 */         NBTTagCompound nodeData = data.func_74775_l("node");
/* 123 */         if (nodeData.func_74764_b("address")) {
/* 124 */           nodeData.func_82580_o("address");
/* 125 */           return true;
/*     */         } 
/*     */ 
/*     */         
/*     */         BoxedUnit boxedUnit1 = data.func_74764_b("node") ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */         
/* 131 */         return false; }  }  BoxedUnit boxedUnit = BoxedUnit.UNIT; return false;
/*     */   }
/*     */   public FileSystem fromMemory(long capacity) {
/* 134 */     return new FileSystem.RamFileSystem(capacity);
/*     */   }
/*     */   public FileSystem fromComputerCraft(Object mount) {
/* 137 */     return li.cil.oc.integration.Mods$.MODULE$.ComputerCraft().isAvailable() ? 
/* 138 */       (FileSystem)li.cil.oc.integration.computercraft.DriverComputerCraftMedia$.MODULE$.createFileSystem(mount).orNull(scala.Predef$.MODULE$.$conforms()) : 
/*     */       
/* 140 */       null;
/*     */   }
/*     */   public FileSystem asReadOnly(FileSystem fileSystem) {
/* 143 */     return fileSystem.isReadOnly() ? fileSystem : 
/*     */       
/* 145 */       new ReadOnlyWrapper(fileSystem);
/*     */   }
/*     */   
/*     */   public ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, Label label, EnvironmentHost host, String accessSound, int speed) {
/* 149 */     return (ManagedEnvironment)scala.Option$.MODULE$.apply(fileSystem).flatMap((Function1)new FileSystem$$anonfun$asManagedEnvironment$1(label, host, accessSound, speed)).orNull(scala.Predef$.MODULE$.$conforms()); } public final class FileSystem$$anonfun$asManagedEnvironment$1 extends AbstractFunction1<FileSystem, Some<FileSystem>> implements Serializable { public static final long serialVersionUID = 0L; private final Label label$1; private final EnvironmentHost host$1; private final String accessSound$1; private final int speed$1; public final Some<FileSystem> apply(FileSystem fs) { return new Some(new FileSystem(fs, this.label$1, scala.Option$.MODULE$.apply(this.host$1), scala.Option$.MODULE$.apply(this.accessSound$1), scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(scala.runtime.RichInt$.MODULE$.max$extension(scala.Predef$.MODULE$.intWrapper(this.speed$1 - 1), 0)), 5))); }
/*     */      public FileSystem$$anonfun$asManagedEnvironment$1(Label label$1, EnvironmentHost host$1, String accessSound$1, int speed$1) {} }
/*     */   public ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, String label, EnvironmentHost host, String accessSound, int speed) {
/* 152 */     return asManagedEnvironment(fileSystem, new FileSystem.ReadOnlyLabel(label), host, accessSound, speed);
/*     */   }
/*     */   public ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, Label label, EnvironmentHost host, String sound) {
/* 155 */     return asManagedEnvironment(fileSystem, label, host, sound, 1);
/*     */   }
/*     */   public ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, String label, EnvironmentHost host, String sound) {
/* 158 */     return asManagedEnvironment(fileSystem, new FileSystem.ReadOnlyLabel(label), host, sound, 1);
/*     */   }
/*     */   public ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, Label label) {
/* 161 */     return asManagedEnvironment(fileSystem, label, (EnvironmentHost)null, (String)null, 1);
/*     */   }
/*     */   public ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, String label) {
/* 164 */     return asManagedEnvironment(fileSystem, new FileSystem.ReadOnlyLabel(label), (EnvironmentHost)null, (String)null, 1);
/*     */   }
/*     */   public ManagedEnvironment asManagedEnvironment(FileSystem fileSystem) {
/* 167 */     return asManagedEnvironment(fileSystem, (Label)null, (EnvironmentHost)null, (String)null, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\FileSystem$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */