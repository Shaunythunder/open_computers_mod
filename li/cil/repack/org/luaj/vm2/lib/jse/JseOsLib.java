/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
/*     */ import li.cil.repack.org.luaj.vm2.lib.OsLib;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JseOsLib
/*     */   extends OsLib
/*     */ {
/*     */   public static final int EXEC_IOEXCEPTION = 1;
/*     */   public static final int EXEC_INTERRUPTED = -2;
/*     */   public static final int EXEC_ERROR = -3;
/*     */   
/*     */   protected String getenv(String varname) {
/* 104 */     String s = System.getenv(varname);
/* 105 */     return (s != null) ? s : System.getProperty(varname);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Varargs execute(String command) {
/*     */     int exitValue;
/*     */     try {
/* 112 */       exitValue = (new JseProcess(command, null, this.globals.STDOUT, this.globals.STDERR)).waitFor();
/* 113 */     } catch (IOException ioe) {
/* 114 */       exitValue = 1;
/* 115 */     } catch (InterruptedException e) {
/* 116 */       exitValue = -2;
/* 117 */     } catch (Throwable t) {
/* 118 */       exitValue = -3;
/*     */     } 
/* 120 */     if (exitValue == 0)
/* 121 */       return varargsOf((LuaValue)TRUE, (LuaValue)valueOf("exit"), (Varargs)ZERO); 
/* 122 */     return varargsOf(NIL, (LuaValue)valueOf("signal"), (Varargs)valueOf(exitValue));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void remove(String filename) throws IOException {
/* 127 */     File f = new File(filename);
/* 128 */     if (!f.exists())
/* 129 */       throw new IOException("No such file or directory"); 
/* 130 */     if (!f.delete()) {
/* 131 */       throw new IOException("Failed to delete");
/*     */     }
/*     */   }
/*     */   
/*     */   protected void rename(String oldname, String newname) throws IOException {
/* 136 */     File f = new File(oldname);
/* 137 */     if (!f.exists())
/* 138 */       throw new IOException("No such file or directory"); 
/* 139 */     if (!f.renameTo(new File(newname))) {
/* 140 */       throw new IOException("Failed to rename");
/*     */     }
/*     */   }
/*     */   
/*     */   protected String tmpname() {
/*     */     try {
/* 146 */       File f = File.createTempFile(".luaj", "tmp");
/* 147 */       return f.getAbsolutePath();
/* 148 */     } catch (IOException ioe) {
/* 149 */       return super.tmpname();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JseOsLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */