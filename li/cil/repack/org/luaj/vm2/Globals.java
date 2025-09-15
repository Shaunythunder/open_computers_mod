/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.Reader;
/*     */ import li.cil.repack.org.luaj.vm2.lib.BaseLib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.DebugLib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.PackageLib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.ResourceFinder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Globals
/*     */   extends LuaTable
/*     */ {
/* 139 */   public InputStream STDIN = null;
/*     */ 
/*     */   
/* 142 */   public PrintStream STDOUT = System.out;
/*     */ 
/*     */   
/* 145 */   public PrintStream STDERR = System.err;
/*     */ 
/*     */ 
/*     */   
/*     */   public ResourceFinder finder;
/*     */ 
/*     */ 
/*     */   
/* 153 */   public LuaThread running = new LuaThread(this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BaseLib baselib;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PackageLib package_;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public DebugLib debuglib;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Loader loader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Compiler compiler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Undumper undumper;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Globals checkglobals() {
/* 200 */     return this;
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
/*     */   public LuaValue loadfile(String filename) {
/*     */     try {
/* 234 */       return load(this.finder.findResource(filename), "@" + filename, "bt", this);
/* 235 */     } catch (Exception e) {
/* 236 */       return error("load " + filename + ": " + e);
/*     */     } 
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
/*     */   public LuaValue load(String script, String chunkname) {
/* 252 */     return load(new StrReader(script), chunkname);
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
/*     */   public LuaValue load(String script) {
/* 265 */     return load(new StrReader(script), script);
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
/*     */   public LuaValue load(String script, String chunkname, LuaTable environment) {
/* 282 */     return load(new StrReader(script), chunkname, environment);
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
/*     */   public LuaValue load(Reader reader, String chunkname) {
/* 298 */     return load(new UTF8Stream(reader), chunkname, "t", this);
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
/*     */   public LuaValue load(Reader reader, String chunkname, LuaTable environment) {
/* 317 */     return load(new UTF8Stream(reader), chunkname, "t", environment);
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
/*     */   public LuaValue load(InputStream is, String chunkname, String mode, LuaValue environment) {
/*     */     try {
/* 332 */       Prototype p = loadPrototype(is, chunkname, mode);
/* 333 */       return this.loader.load(p, chunkname, environment);
/* 334 */     } catch (LuaError l) {
/* 335 */       throw l;
/* 336 */     } catch (Exception e) {
/* 337 */       return error("load " + chunkname + ": " + e);
/*     */     } 
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
/*     */   public Prototype loadPrototype(InputStream is, String chunkname, String mode) throws IOException {
/* 353 */     if (mode.indexOf('b') >= 0) {
/* 354 */       if (this.undumper == null)
/* 355 */         error("No undumper."); 
/* 356 */       if (!is.markSupported())
/* 357 */         is = new BufferedStream(is); 
/* 358 */       is.mark(4);
/* 359 */       Prototype p = this.undumper.undump(is, chunkname);
/* 360 */       if (p != null)
/* 361 */         return p; 
/* 362 */       is.reset();
/*     */     } 
/* 364 */     if (mode.indexOf('t') >= 0) {
/* 365 */       return compilePrototype(is, chunkname);
/*     */     }
/* 367 */     error("Failed to load prototype " + chunkname + " using mode '" + mode + "'");
/* 368 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Prototype compilePrototype(Reader reader, String chunkname) throws IOException {
/* 378 */     return compilePrototype(new UTF8Stream(reader), chunkname);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Prototype compilePrototype(InputStream stream, String chunkname) throws IOException {
/* 388 */     if (this.compiler == null)
/* 389 */       error("No compiler."); 
/* 390 */     return this.compiler.compile(stream, chunkname);
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
/*     */   public Varargs yield(Varargs args) {
/* 402 */     if (this.running == null || this.running.isMainThread())
/* 403 */       throw new LuaError("cannot yield main thread"); 
/* 404 */     LuaThread.State s = this.running.state;
/* 405 */     return s.lua_yield(args);
/*     */   }
/*     */   
/*     */   static class StrReader
/*     */     extends Reader {
/*     */     final String s;
/* 411 */     int i = 0;
/*     */     final int n;
/*     */     
/*     */     StrReader(String s) {
/* 415 */       this.s = s;
/* 416 */       this.n = s.length();
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 421 */       this.i = this.n;
/*     */     }
/*     */ 
/*     */     
/*     */     public int read() throws IOException {
/* 426 */       return (this.i < this.n) ? this.s.charAt(this.i++) : -1;
/*     */     }
/*     */ 
/*     */     
/*     */     public int read(char[] cbuf, int off, int len) throws IOException {
/* 431 */       int j = 0;
/* 432 */       for (; j < len && this.i < this.n; j++, this.i++)
/* 433 */         cbuf[off + j] = this.s.charAt(this.i); 
/* 434 */       return (j > 0 || len == 0) ? j : -1;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static abstract class AbstractBufferedStream
/*     */     extends InputStream
/*     */   {
/*     */     protected byte[] b;
/* 443 */     protected int i = 0, j = 0;
/*     */     
/*     */     protected AbstractBufferedStream(int buflen) {
/* 446 */       this.b = new byte[buflen];
/*     */     }
/*     */ 
/*     */     
/*     */     protected abstract int avail() throws IOException;
/*     */     
/*     */     public int read() throws IOException {
/* 453 */       int a = avail();
/* 454 */       return (a <= 0) ? -1 : (0xFF & this.b[this.i++]);
/*     */     }
/*     */ 
/*     */     
/*     */     public int read(byte[] b) throws IOException {
/* 459 */       return read(b, 0, b.length);
/*     */     }
/*     */ 
/*     */     
/*     */     public int read(byte[] b, int i0, int n) throws IOException {
/* 464 */       int a = avail();
/* 465 */       if (a <= 0)
/* 466 */         return -1; 
/* 467 */       int n_read = Math.min(a, n);
/* 468 */       System.arraycopy(this.b, this.i, b, i0, n_read);
/* 469 */       this.i += n_read;
/* 470 */       return n_read;
/*     */     }
/*     */ 
/*     */     
/*     */     public long skip(long n) throws IOException {
/* 475 */       long k = Math.min(n, (this.j - this.i));
/* 476 */       this.i = (int)(this.i + k);
/* 477 */       return k;
/*     */     }
/*     */ 
/*     */     
/*     */     public int available() throws IOException {
/* 482 */       return this.j - this.i;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class UTF8Stream
/*     */     extends AbstractBufferedStream
/*     */   {
/* 492 */     private final char[] c = new char[32];
/*     */     private final Reader r;
/*     */     
/*     */     UTF8Stream(Reader r) {
/* 496 */       super(96);
/* 497 */       this.r = r;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int avail() throws IOException {
/* 502 */       if (this.i < this.j)
/* 503 */         return this.j - this.i; 
/* 504 */       int n = this.r.read(this.c);
/* 505 */       if (n < 0)
/* 506 */         return -1; 
/* 507 */       if (n == 0) {
/* 508 */         int u = this.r.read();
/* 509 */         if (u < 0)
/* 510 */           return -1; 
/* 511 */         this.c[0] = (char)u;
/* 512 */         n = 1;
/*     */       } 
/* 514 */       this.j = LuaString.encodeToUtf8(this.c, n, this.b, this.i = 0);
/* 515 */       return this.j;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 520 */       this.r.close();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class BufferedStream
/*     */     extends AbstractBufferedStream
/*     */   {
/*     */     private final InputStream s;
/*     */ 
/*     */ 
/*     */     
/*     */     public BufferedStream(InputStream s) {
/* 535 */       this(128, s);
/*     */     }
/*     */     
/*     */     BufferedStream(int buflen, InputStream s) {
/* 539 */       super(buflen);
/* 540 */       this.s = s;
/*     */     }
/*     */ 
/*     */     
/*     */     protected int avail() throws IOException {
/* 545 */       if (this.i < this.j)
/* 546 */         return this.j - this.i; 
/* 547 */       if (this.j >= this.b.length) {
/* 548 */         this.i = this.j = 0;
/*     */       }
/* 550 */       int n = this.s.read(this.b, this.j, this.b.length - this.j);
/* 551 */       if (n < 0)
/* 552 */         return -1; 
/* 553 */       if (n == 0) {
/* 554 */         int u = this.s.read();
/* 555 */         if (u < 0)
/* 556 */           return -1; 
/* 557 */         this.b[this.j] = (byte)u;
/* 558 */         n = 1;
/*     */       } 
/* 560 */       this.j += n;
/* 561 */       return n;
/*     */     }
/*     */ 
/*     */     
/*     */     public void close() throws IOException {
/* 566 */       this.s.close();
/*     */     }
/*     */ 
/*     */     
/*     */     public synchronized void mark(int n) {
/* 571 */       if (this.i > 0 || n > this.b.length) {
/* 572 */         byte[] dest = (n > this.b.length) ? new byte[n] : this.b;
/* 573 */         System.arraycopy(this.b, this.i, dest, 0, this.j - this.i);
/* 574 */         this.j -= this.i;
/* 575 */         this.i = 0;
/* 576 */         this.b = dest;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean markSupported() {
/* 582 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public synchronized void reset() throws IOException {
/* 587 */       this.i = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface Loader {
/*     */     LuaFunction load(Prototype param1Prototype, String param1String, LuaValue param1LuaValue) throws IOException;
/*     */   }
/*     */   
/*     */   public static interface Undumper {
/*     */     Prototype undump(InputStream param1InputStream, String param1String) throws IOException;
/*     */   }
/*     */   
/*     */   public static interface Compiler {
/*     */     Prototype compile(InputStream param1InputStream, String param1String) throws IOException;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\Globals.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */