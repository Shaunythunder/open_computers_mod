/*     */ package li.cil.oc.api;
/*     */ 
/*     */ import li.cil.oc.api.fs.FileSystem;
/*     */ import li.cil.oc.api.fs.Label;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
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
/*     */ public final class FileSystem
/*     */ {
/*     */   public static FileSystem fromClass(Class<?> clazz, String domain, String root) {
/*  46 */     if (API.fileSystem != null) return API.fileSystem.fromClass(clazz, domain, root); 
/*  47 */     return null;
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
/*     */   public static FileSystem fromSaveDirectory(String root, long capacity, boolean buffered) {
/*  75 */     if (API.fileSystem != null) return API.fileSystem.fromSaveDirectory(root, capacity, buffered); 
/*  76 */     return null;
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
/*     */   public static FileSystem fromSaveDirectory(String root, long capacity) {
/*  89 */     return fromSaveDirectory(root, capacity, true);
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
/*     */   public static FileSystem fromMemory(long capacity) {
/* 104 */     if (API.fileSystem != null) return API.fileSystem.fromMemory(capacity); 
/* 105 */     return null;
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
/*     */   public static FileSystem fromComputerCraft(Object mount) {
/* 121 */     if (API.fileSystem != null) return API.fileSystem.fromComputerCraft(mount); 
/* 122 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static FileSystem asReadOnly(FileSystem fileSystem) {
/* 133 */     if (API.fileSystem != null) return API.fileSystem.asReadOnly(fileSystem); 
/* 134 */     return null;
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
/*     */   public static ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, Label label, EnvironmentHost host, String accessSound, int speed) {
/* 181 */     if (API.fileSystem != null)
/* 182 */       return API.fileSystem.asManagedEnvironment(fileSystem, label, host, accessSound, speed); 
/* 183 */     return null;
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
/*     */   public static ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, String label, EnvironmentHost host, String accessSound, int speed) {
/* 209 */     if (API.fileSystem != null)
/* 210 */       return API.fileSystem.asManagedEnvironment(fileSystem, label, host, accessSound, speed); 
/* 211 */     return null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, Label label, EnvironmentHost host, String accessSound) {
/* 235 */     return asManagedEnvironment(fileSystem, label, host, accessSound, 1);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, String label, EnvironmentHost host, String accessSound) {
/* 259 */     return asManagedEnvironment(fileSystem, label, host, accessSound, 1);
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
/*     */   public static ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, Label label) {
/* 275 */     return asManagedEnvironment(fileSystem, label, (EnvironmentHost)null, (String)null, 1);
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
/*     */   public static ManagedEnvironment asManagedEnvironment(FileSystem fileSystem, String label) {
/* 291 */     return asManagedEnvironment(fileSystem, label, (EnvironmentHost)null, (String)null, 1);
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
/*     */   public static ManagedEnvironment asManagedEnvironment(FileSystem fileSystem) {
/* 306 */     return asManagedEnvironment(fileSystem, (Label)null, (EnvironmentHost)null, (String)null, 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\FileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */