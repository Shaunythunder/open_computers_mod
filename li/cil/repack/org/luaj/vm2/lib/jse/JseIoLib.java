/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.EOFException;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.RandomAccessFile;
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaError;
/*     */ import li.cil.repack.org.luaj.vm2.LuaString;
/*     */ import li.cil.repack.org.luaj.vm2.lib.IoLib;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JseIoLib
/*     */   extends IoLib
/*     */ {
/*     */   protected IoLib.File wrapStdin() throws IOException {
/*  89 */     return new StdinFile();
/*     */   }
/*     */ 
/*     */   
/*     */   protected IoLib.File wrapStdout() throws IOException {
/*  94 */     return new StdoutFile(1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected IoLib.File wrapStderr() throws IOException {
/*  99 */     return new StdoutFile(2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected IoLib.File openFile(String filename, boolean readMode, boolean appendMode, boolean updateMode, boolean binaryMode) throws IOException {
/* 105 */     RandomAccessFile f = new RandomAccessFile(filename, readMode ? "r" : "rw");
/* 106 */     if (appendMode) {
/* 107 */       f.seek(f.length());
/*     */     }
/* 109 */     else if (!readMode) {
/* 110 */       f.setLength(0L);
/*     */     } 
/* 112 */     return new FileImpl(f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected IoLib.File openProgram(String prog, String mode) throws IOException {
/* 117 */     Process p = Runtime.getRuntime().exec(prog);
/* 118 */     return "w".equals(mode) ? new FileImpl(p.getOutputStream()) : new FileImpl(p.getInputStream());
/*     */   }
/*     */ 
/*     */   
/*     */   protected IoLib.File tmpFile() throws IOException {
/* 123 */     File f = File.createTempFile(".luaj", "bin");
/* 124 */     f.deleteOnExit();
/* 125 */     return new FileImpl(new RandomAccessFile(f, "rw"));
/*     */   }
/*     */   
/*     */   private static void notimplemented() {
/* 129 */     throw new LuaError("not implemented");
/*     */   }
/*     */ 
/*     */   
/*     */   private final class FileImpl
/*     */     extends IoLib.File
/*     */   {
/*     */     private final RandomAccessFile file;
/*     */     
/*     */     private final InputStream is;
/*     */     
/*     */     private final OutputStream os;
/*     */     
/*     */     private boolean closed = false;
/*     */     private boolean nobuffer = false;
/*     */     
/*     */     private FileImpl(RandomAccessFile f) {
/* 146 */       this(f, (InputStream)null, (OutputStream)null);
/*     */     }
/*     */     
/*     */     private FileImpl(InputStream i) {
/* 150 */       this((RandomAccessFile)null, i, (OutputStream)null);
/*     */     }
/*     */     
/*     */     private FileImpl(OutputStream o) {
/* 154 */       this((RandomAccessFile)null, (InputStream)null, o);
/*     */     }
/*     */ 
/*     */     
/*     */     public String tojstring() {
/* 159 */       return "file (" + (this.closed ? "closed" : String.valueOf(hashCode())) + ")";
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isstdfile() {
/* 164 */       return (this.file == null);
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 169 */       this.closed = true;
/* 170 */       if (this.file != null) {
/* 171 */         this.file.close();
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void flush() throws IOException {
/* 177 */       if (this.os != null) {
/* 178 */         this.os.flush();
/*     */       }
/*     */     }
/*     */     
/*     */     public void write(LuaString s) throws IOException {
/* 183 */       if (this.os != null) {
/* 184 */         this.os.write(s.m_bytes, s.m_offset, s.m_length);
/* 185 */       } else if (this.file != null) {
/* 186 */         this.file.write(s.m_bytes, s.m_offset, s.m_length);
/*     */       } else {
/* 188 */         JseIoLib.notimplemented();
/* 189 */       }  if (this.nobuffer) {
/* 190 */         flush();
/*     */       }
/*     */     }
/*     */     
/*     */     public boolean isclosed() {
/* 195 */       return this.closed;
/*     */     }
/*     */ 
/*     */     
/*     */     public int seek(String option, int pos) throws IOException {
/* 200 */       if (this.file != null) {
/* 201 */         if ("set".equals(option)) {
/* 202 */           this.file.seek(pos);
/* 203 */         } else if ("end".equals(option)) {
/* 204 */           this.file.seek(this.file.length() + pos);
/*     */         } else {
/* 206 */           this.file.seek(this.file.getFilePointer() + pos);
/*     */         } 
/* 208 */         return (int)this.file.getFilePointer();
/*     */       } 
/* 210 */       JseIoLib.notimplemented();
/* 211 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void setvbuf(String mode, int size) {
/* 216 */       this.nobuffer = "no".equals(mode);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int remaining() throws IOException {
/* 222 */       return (this.file != null) ? (int)(this.file.length() - this.file.getFilePointer()) : -1;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int peek() throws IOException {
/* 228 */       if (this.is != null) {
/* 229 */         this.is.mark(1);
/* 230 */         int c = this.is.read();
/* 231 */         this.is.reset();
/* 232 */         return c;
/* 233 */       }  if (this.file != null) {
/* 234 */         long fp = this.file.getFilePointer();
/* 235 */         int c = this.file.read();
/* 236 */         this.file.seek(fp);
/* 237 */         return c;
/*     */       } 
/* 239 */       JseIoLib.notimplemented();
/* 240 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int read() throws IOException
/*     */     {
/* 246 */       if (this.is != null)
/* 247 */         return this.is.read(); 
/* 248 */       if (this.file != null) {
/* 249 */         return this.file.read();
/*     */       }
/* 251 */       JseIoLib.notimplemented();
/* 252 */       return 0;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int read(byte[] bytes, int offset, int length) throws IOException {
/* 258 */       if (this.file != null)
/* 259 */         return this.file.read(bytes, offset, length); 
/* 260 */       if (this.is != null) {
/* 261 */         return this.is.read(bytes, offset, length);
/*     */       }
/* 263 */       JseIoLib.notimplemented();
/*     */       
/* 265 */       return length;
/*     */     } private FileImpl(RandomAccessFile file, InputStream is, OutputStream os) {
/*     */       super(JseIoLib.this);
/*     */       this.file = file;
/*     */       this.is = (is != null) ? (is.markSupported() ? is : new BufferedInputStream(is)) : null;
/*     */       this.os = os;
/*     */     } } private final class StdoutFile extends IoLib.File { private StdoutFile(int file_type) {
/* 272 */       super(JseIoLib.this);
/* 273 */       this.file_type = file_type;
/*     */     }
/*     */     private final int file_type;
/*     */     
/*     */     public String tojstring() {
/* 278 */       return "file (" + hashCode() + ")";
/*     */     }
/*     */     private PrintStream getPrintStream() {
/* 281 */       return (this.file_type == 2) ? JseIoLib.this.globals.STDERR : JseIoLib.this.globals.STDOUT;
/*     */     }
/*     */     
/*     */     public void write(LuaString string) throws IOException {
/* 285 */       getPrintStream().write(string.m_bytes, string.m_offset, string.m_length);
/*     */     }
/*     */ 
/*     */     
/*     */     public void flush() throws IOException {
/* 290 */       getPrintStream().flush();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isstdfile() {
/* 295 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void close() throws IOException {}
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isclosed() {
/* 305 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int seek(String option, int bytecount) throws IOException {
/* 310 */       return 0;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void setvbuf(String mode, int size) {}
/*     */ 
/*     */     
/*     */     public int remaining() throws IOException {
/* 319 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int peek() throws IOException, EOFException {
/* 324 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int read() throws IOException, EOFException {
/* 329 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int read(byte[] bytes, int offset, int length) throws IOException {
/* 334 */       return 0;
/*     */     } }
/*     */   
/*     */   private final class StdinFile extends IoLib.File {
/*     */     private StdinFile() {
/* 339 */       super(JseIoLib.this);
/*     */     }
/*     */ 
/*     */     
/*     */     public String tojstring() {
/* 344 */       return "file (" + hashCode() + ")";
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void write(LuaString string) throws IOException {}
/*     */ 
/*     */ 
/*     */     
/*     */     public void flush() throws IOException {}
/*     */ 
/*     */     
/*     */     public boolean isstdfile() {
/* 357 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void close() throws IOException {}
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isclosed() {
/* 367 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int seek(String option, int bytecount) throws IOException {
/* 372 */       return 0;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void setvbuf(String mode, int size) {}
/*     */ 
/*     */     
/*     */     public int remaining() throws IOException {
/* 381 */       return -1;
/*     */     }
/*     */ 
/*     */     
/*     */     public int peek() throws IOException, EOFException {
/* 386 */       JseIoLib.this.globals.STDIN.mark(1);
/* 387 */       int c = JseIoLib.this.globals.STDIN.read();
/* 388 */       JseIoLib.this.globals.STDIN.reset();
/* 389 */       return c;
/*     */     }
/*     */ 
/*     */     
/*     */     public int read() throws IOException, EOFException {
/* 394 */       return JseIoLib.this.globals.STDIN.read();
/*     */     }
/*     */ 
/*     */     
/*     */     public int read(byte[] bytes, int offset, int length) throws IOException {
/* 399 */       return JseIoLib.this.globals.STDIN.read(bytes, offset, length);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JseIoLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */