/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JseProcess
/*     */ {
/*     */   final Process process;
/*     */   final Thread input;
/*     */   final Thread output;
/*     */   final Thread error;
/*     */   
/*     */   public JseProcess(String[] cmd, InputStream stdin, OutputStream stdout, OutputStream stderr) throws IOException {
/*  51 */     this(Runtime.getRuntime().exec(cmd), stdin, stdout, stderr);
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
/*     */   public JseProcess(String cmd, InputStream stdin, OutputStream stdout, OutputStream stderr) throws IOException {
/*  69 */     this(Runtime.getRuntime().exec(cmd), stdin, stdout, stderr);
/*     */   }
/*     */   
/*     */   private JseProcess(Process process, InputStream stdin, OutputStream stdout, OutputStream stderr) {
/*  73 */     this.process = process;
/*  74 */     this.input = (stdin == null) ? null : copyBytes(stdin, process.getOutputStream(), null, process.getOutputStream());
/*  75 */     this.output = (stdout == null) ? null : copyBytes(process.getInputStream(), stdout, process.getInputStream(), null);
/*  76 */     this.error = (stderr == null) ? null : copyBytes(process.getErrorStream(), stderr, process.getErrorStream(), null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int exitValue() {
/*  81 */     return this.process.exitValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int waitFor() throws InterruptedException {
/*  91 */     int r = this.process.waitFor();
/*  92 */     if (this.input != null)
/*  93 */       this.input.join(); 
/*  94 */     if (this.output != null)
/*  95 */       this.output.join(); 
/*  96 */     if (this.error != null)
/*  97 */       this.error.join(); 
/*  98 */     this.process.destroy();
/*  99 */     return r;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Thread copyBytes(InputStream input, OutputStream output, InputStream ownedInput, OutputStream ownedOutput) {
/* 105 */     Thread t = new CopyThread(output, ownedOutput, ownedInput, input);
/* 106 */     t.start();
/* 107 */     return t;
/*     */   }
/*     */   
/*     */   private static final class CopyThread extends Thread {
/*     */     private final OutputStream output;
/*     */     private final OutputStream ownedOutput;
/*     */     private final InputStream ownedInput;
/*     */     private final InputStream input;
/*     */     
/*     */     private CopyThread(OutputStream output, OutputStream ownedOutput, InputStream ownedInput, InputStream input) {
/* 117 */       this.output = output;
/* 118 */       this.ownedOutput = ownedOutput;
/* 119 */       this.ownedInput = ownedInput;
/* 120 */       this.input = input;
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/*     */       try {
/* 126 */         byte[] buf = new byte[1024];
/*     */         try {
/*     */           int r;
/* 129 */           while ((r = this.input.read(buf)) >= 0) {
/* 130 */             this.output.write(buf, 0, r);
/*     */           }
/*     */         } finally {
/* 133 */           if (this.ownedInput != null)
/* 134 */             this.ownedInput.close(); 
/* 135 */           if (this.ownedOutput != null)
/* 136 */             this.ownedOutput.close(); 
/*     */         } 
/* 138 */       } catch (IOException e) {
/* 139 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JseProcess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */