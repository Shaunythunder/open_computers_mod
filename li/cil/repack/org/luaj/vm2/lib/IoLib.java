/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaString;
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class IoLib
/*     */   extends TwoArgFunction
/*     */ {
/*     */   protected static final int FTYPE_STDIN = 0;
/*     */   protected static final int FTYPE_STDOUT = 1;
/*     */   protected static final int FTYPE_STDERR = 2;
/*     */   protected static final int FTYPE_NAMED = 3;
/*     */   
/*     */   protected abstract class File
/*     */     extends LuaValue
/*     */   {
/*     */     public abstract void write(LuaString param1LuaString) throws IOException;
/*     */     
/*     */     public abstract void flush() throws IOException;
/*     */     
/*     */     public abstract boolean isstdfile();
/*     */     
/*     */     public abstract void close() throws IOException;
/*     */     
/*     */     public abstract boolean isclosed();
/*     */     
/*     */     public abstract int seek(String param1String, int param1Int) throws IOException;
/*     */     
/*     */     public abstract void setvbuf(String param1String, int param1Int);
/*     */     
/*     */     public abstract int remaining() throws IOException;
/*     */     
/*     */     public abstract int peek() throws IOException, EOFException;
/*     */     
/*     */     public abstract int read() throws IOException, EOFException;
/*     */     
/*     */     public abstract int read(byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) throws IOException;
/*     */     
/*     */     public boolean eof() throws IOException {
/*     */       try {
/* 121 */         return (peek() < 0);
/* 122 */       } catch (EOFException e) {
/* 123 */         return true;
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LuaValue get(LuaValue key) {
/* 130 */       return IoLib.this.filemethods.get(key);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int type() {
/* 136 */       return 7;
/*     */     }
/*     */ 
/*     */     
/*     */     public String typename() {
/* 141 */       return "userdata";
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public String tojstring() {
/* 147 */       return "file: " + Integer.toHexString(hashCode());
/*     */     }
/*     */ 
/*     */     
/*     */     public void finalize() {
/* 152 */       if (!isclosed()) {
/*     */         try {
/* 154 */           close();
/* 155 */         } catch (IOException iOException) {}
/*     */       }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 226 */   private File infile = null;
/* 227 */   private File outfile = null;
/* 228 */   private File errfile = null;
/*     */   
/* 230 */   private static final LuaValue STDIN = (LuaValue)valueOf("stdin");
/* 231 */   private static final LuaValue STDOUT = (LuaValue)valueOf("stdout");
/* 232 */   private static final LuaValue STDERR = (LuaValue)valueOf("stderr");
/* 233 */   private static final LuaValue FILE = (LuaValue)valueOf("file");
/* 234 */   private static final LuaValue CLOSED_FILE = (LuaValue)valueOf("closed file");
/*     */   
/*     */   private static final int IO_CLOSE = 0;
/*     */   
/*     */   private static final int IO_FLUSH = 1;
/*     */   
/*     */   private static final int IO_INPUT = 2;
/*     */   
/*     */   private static final int IO_LINES = 3;
/*     */   private static final int IO_OPEN = 4;
/*     */   private static final int IO_OUTPUT = 5;
/*     */   private static final int IO_POPEN = 6;
/*     */   private static final int IO_READ = 7;
/*     */   private static final int IO_TMPFILE = 8;
/*     */   private static final int IO_TYPE = 9;
/*     */   private static final int IO_WRITE = 10;
/*     */   private static final int FILE_CLOSE = 11;
/*     */   private static final int FILE_FLUSH = 12;
/*     */   private static final int FILE_LINES = 13;
/*     */   private static final int FILE_READ = 14;
/*     */   private static final int FILE_SEEK = 15;
/*     */   private static final int FILE_SETVBUF = 16;
/*     */   private static final int FILE_WRITE = 17;
/*     */   private static final int IO_INDEX = 18;
/*     */   private static final int LINES_ITER = 19;
/* 259 */   public static final String[] IO_NAMES = new String[] { "close", "flush", "input", "lines", "open", "output", "popen", "read", "tmpfile", "type", "write" };
/*     */ 
/*     */   
/* 262 */   public static final String[] FILE_NAMES = new String[] { "close", "flush", "lines", "read", "seek", "setvbuf", "write" }; LuaTable filemethods;
/*     */   protected Globals globals;
/*     */   
/*     */   protected abstract File wrapStdin() throws IOException;
/*     */   
/*     */   protected abstract File wrapStdout() throws IOException;
/*     */   
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/* 270 */     this.globals = env.checkglobals();
/*     */ 
/*     */     
/* 273 */     LuaTable t = new LuaTable();
/* 274 */     bind((LuaValue)t, IoLibV.class, IO_NAMES);
/*     */ 
/*     */     
/* 277 */     this.filemethods = new LuaTable();
/* 278 */     bind((LuaValue)this.filemethods, IoLibV.class, FILE_NAMES, 11);
/*     */ 
/*     */     
/* 281 */     LuaTable mt = new LuaTable();
/* 282 */     bind((LuaValue)mt, IoLibV.class, new String[] { "__index" }, 18);
/* 283 */     t.setmetatable((LuaValue)mt);
/*     */ 
/*     */     
/* 286 */     setLibInstance(t);
/* 287 */     setLibInstance(this.filemethods);
/* 288 */     setLibInstance(mt);
/*     */ 
/*     */     
/* 291 */     env.set("io", (LuaValue)t);
/* 292 */     if (!env.get("package").isnil())
/* 293 */       env.get("package").get("loaded").set("io", (LuaValue)t); 
/* 294 */     return (LuaValue)t;
/*     */   } protected abstract File wrapStderr() throws IOException; protected abstract File openFile(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) throws IOException; protected abstract File tmpFile() throws IOException;
/*     */   protected abstract File openProgram(String paramString1, String paramString2) throws IOException;
/*     */   private void setLibInstance(LuaTable t) {
/* 298 */     LuaValue[] k = t.keys();
/* 299 */     for (int i = 0, n = k.length; i < n; i++)
/* 300 */       ((IoLibV)t.get(k[i])).iolib = this; 
/*     */   }
/*     */   
/*     */   static final class IoLibV
/*     */     extends VarArgFunction {
/*     */     private IoLib.File f;
/*     */     public IoLib iolib;
/*     */     private boolean toclose;
/*     */     private Varargs args;
/*     */     
/*     */     public IoLibV() {}
/*     */     
/*     */     public IoLibV(IoLib.File f, String name, int opcode, IoLib iolib, boolean toclose, Varargs args) {
/* 313 */       this(f, name, opcode, iolib);
/* 314 */       this.toclose = toclose;
/* 315 */       this.args = args.dealias();
/*     */     }
/*     */     
/*     */     public IoLibV(IoLib.File f, String name, int opcode, IoLib iolib) {
/* 319 */       this.f = f;
/* 320 */       this.name = name;
/* 321 */       this.opcode = opcode;
/* 322 */       this.iolib = iolib;
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs invoke(Varargs args) {
/*     */       try {
/* 328 */         switch (this.opcode) {
/*     */           case 1:
/* 330 */             return this.iolib._io_flush();
/*     */           case 8:
/* 332 */             return this.iolib._io_tmpfile();
/*     */           case 0:
/* 334 */             return this.iolib._io_close(args.arg1());
/*     */           case 2:
/* 336 */             return this.iolib._io_input(args.arg1());
/*     */           case 5:
/* 338 */             return this.iolib._io_output(args.arg1());
/*     */           case 9:
/* 340 */             return this.iolib._io_type(args.arg1());
/*     */           case 6:
/* 342 */             return this.iolib._io_popen(args.checkjstring(1), args.optjstring(2, "r"));
/*     */           case 4:
/* 344 */             return this.iolib._io_open(args.checkjstring(1), args.optjstring(2, "r"));
/*     */           case 3:
/* 346 */             return this.iolib._io_lines(args);
/*     */           case 7:
/* 348 */             return this.iolib._io_read(args);
/*     */           case 10:
/* 350 */             return this.iolib._io_write(args);
/*     */           
/*     */           case 11:
/* 353 */             return this.iolib._file_close(args.arg1());
/*     */           case 12:
/* 355 */             return this.iolib._file_flush(args.arg1());
/*     */           case 16:
/* 357 */             return this.iolib._file_setvbuf(args.arg1(), args.checkjstring(2), args.optint(3, 8192));
/*     */           case 13:
/* 359 */             return this.iolib._file_lines(args);
/*     */           case 14:
/* 361 */             return this.iolib._file_read(args.arg1(), args.subargs(2));
/*     */           case 15:
/* 363 */             return this.iolib._file_seek(args.arg1(), args.optjstring(2, "cur"), args.optint(3, 0));
/*     */           case 17:
/* 365 */             return this.iolib._file_write(args.arg1(), args.subargs(2));
/*     */           
/*     */           case 18:
/* 368 */             return this.iolib._io_index(args.arg(2));
/*     */           case 19:
/* 370 */             return this.iolib._lines_iter(this.f, this.toclose, this.args);
/*     */         } 
/* 372 */       } catch (IOException ioe) {
/* 373 */         if (this.opcode == 19) {
/* 374 */           String s = ioe.getMessage();
/* 375 */           error((s != null) ? s : ioe.toString());
/*     */         } 
/* 377 */         return IoLib.errorresult(ioe);
/*     */       } 
/* 379 */       return (Varargs)NONE;
/*     */     }
/*     */   }
/*     */   
/*     */   private File input() {
/* 384 */     return (this.infile != null) ? this.infile : (this.infile = ioopenfile(0, "-", "r"));
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_flush() throws IOException {
/* 389 */     checkopen(output());
/* 390 */     this.outfile.flush();
/* 391 */     return (Varargs)LuaValue.TRUE;
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_tmpfile() throws IOException {
/* 396 */     return (Varargs)tmpFile();
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_close(LuaValue file) throws IOException {
/* 401 */     File f = file.isnil() ? output() : checkfile(file);
/* 402 */     checkopen(f);
/* 403 */     return ioclose(f);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_input(LuaValue file) {
/* 408 */     this
/* 409 */       .infile = file.isnil() ? input() : (file.isstring() ? ioopenfile(3, file.checkjstring(), "r") : checkfile(file));
/* 410 */     return (Varargs)this.infile;
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_output(LuaValue filename) {
/* 415 */     this
/* 416 */       .outfile = filename.isnil() ? output() : (filename.isstring() ? ioopenfile(3, filename.checkjstring(), "w") : checkfile(filename));
/* 417 */     return (Varargs)this.outfile;
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_type(LuaValue obj) {
/* 422 */     File f = optfile(obj);
/* 423 */     return (f != null) ? (f.isclosed() ? (Varargs)CLOSED_FILE : (Varargs)FILE) : (Varargs)NIL;
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_popen(String prog, String mode) throws IOException {
/* 428 */     if (!"r".equals(mode) && !"w".equals(mode))
/* 429 */       argerror(2, "invalid value: '" + mode + "'; must be one of 'r' or 'w'"); 
/* 430 */     return (Varargs)openProgram(prog, mode);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_open(String filename, String mode) throws IOException {
/* 435 */     return (Varargs)rawopenfile(3, filename, mode);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_lines(Varargs args) {
/* 440 */     String filename = args.optjstring(1, null);
/* 441 */     File infile = (filename == null) ? input() : ioopenfile(3, filename, "r");
/* 442 */     checkopen(infile);
/* 443 */     return lines(infile, (filename != null), args.subargs(2));
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_read(Varargs args) throws IOException {
/* 448 */     checkopen(input());
/* 449 */     return ioread(this.infile, args);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_write(Varargs args) throws IOException {
/* 454 */     checkopen(output());
/* 455 */     return iowrite(this.outfile, args);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _file_close(LuaValue file) throws IOException {
/* 460 */     return ioclose(checkfile(file));
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _file_flush(LuaValue file) throws IOException {
/* 465 */     checkfile(file).flush();
/* 466 */     return (Varargs)LuaValue.TRUE;
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _file_setvbuf(LuaValue file, String mode, int size) {
/* 471 */     if (!"no".equals(mode) && 
/* 472 */       !"full".equals(mode) && 
/* 473 */       !"line".equals(mode))
/*     */     {
/* 475 */       argerror(1, "invalid value: '" + mode + "'; must be one of 'no', 'full' or 'line'");
/*     */     }
/* 477 */     checkfile(file).setvbuf(mode, size);
/* 478 */     return (Varargs)LuaValue.TRUE;
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _file_lines(Varargs args) {
/* 483 */     return lines(checkfile(args.arg1()), false, args.subargs(2));
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _file_read(LuaValue file, Varargs subargs) throws IOException {
/* 488 */     return ioread(checkfile(file), subargs);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _file_seek(LuaValue file, String whence, int offset) throws IOException {
/* 493 */     if (!"set".equals(whence) && 
/* 494 */       !"end".equals(whence) && 
/* 495 */       !"cur".equals(whence))
/*     */     {
/* 497 */       argerror(1, "invalid value: '" + whence + "'; must be one of 'set', 'cur' or 'end'");
/*     */     }
/* 499 */     return (Varargs)valueOf(checkfile(file).seek(whence, offset));
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _file_write(LuaValue file, Varargs subargs) throws IOException {
/* 504 */     return iowrite(checkfile(file), subargs);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _io_index(LuaValue v) {
/* 509 */     return v.equals(STDOUT) ? (Varargs)output() : (v.equals(STDIN) ? (Varargs)input() : (v.equals(STDERR) ? (Varargs)errput() : (Varargs)NIL));
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs _lines_iter(LuaValue file, boolean toclose, Varargs args) throws IOException {
/* 514 */     File f = optfile(file);
/* 515 */     if (f == null)
/* 516 */       argerror(1, "not a file: " + file); 
/* 517 */     if (f.isclosed())
/* 518 */       error("file is already closed"); 
/* 519 */     Varargs ret = ioread(f, args);
/* 520 */     if (toclose && ret.isnil(1) && f.eof())
/* 521 */       f.close(); 
/* 522 */     return ret;
/*     */   }
/*     */   
/*     */   private File output() {
/* 526 */     return (this.outfile != null) ? this.outfile : (this.outfile = ioopenfile(1, "-", "w"));
/*     */   }
/*     */   
/*     */   private File errput() {
/* 530 */     return (this.errfile != null) ? this.errfile : (this.errfile = ioopenfile(2, "-", "w"));
/*     */   }
/*     */   
/*     */   private File ioopenfile(int filetype, String filename, String mode) {
/*     */     try {
/* 535 */       return rawopenfile(filetype, filename, mode);
/* 536 */     } catch (Exception e) {
/* 537 */       error("io error: " + e.getMessage());
/* 538 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Varargs ioclose(File f) throws IOException {
/* 543 */     if (f.isstdfile()) {
/* 544 */       return errorresult("cannot close standard file");
/*     */     }
/* 546 */     f.close();
/* 547 */     return successresult();
/*     */   }
/*     */ 
/*     */   
/*     */   private static Varargs successresult() {
/* 552 */     return (Varargs)LuaValue.TRUE;
/*     */   }
/*     */   
/*     */   static Varargs errorresult(Exception ioe) {
/* 556 */     String s = ioe.getMessage();
/* 557 */     return errorresult("io error: " + ((s != null) ? s : ioe.toString()));
/*     */   }
/*     */   
/*     */   private static Varargs errorresult(String errortext) {
/* 561 */     return varargsOf(NIL, (Varargs)valueOf(errortext));
/*     */   }
/*     */   
/*     */   private Varargs lines(File f, boolean toclose, Varargs args) {
/*     */     try {
/* 566 */       return (Varargs)new IoLibV(f, "lnext", 19, this, toclose, args);
/* 567 */     } catch (Exception e) {
/* 568 */       return (Varargs)error("lines: " + e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Varargs iowrite(File f, Varargs args) throws IOException {
/* 573 */     for (int i = 1, n = args.narg(); i <= n; i++)
/* 574 */       f.write(args.checkstring(i)); 
/* 575 */     return (Varargs)f;
/*     */   }
/*     */   
/*     */   private Varargs ioread(File f, Varargs args) throws IOException {
/* 579 */     int n = args.narg();
/* 580 */     if (n == 0)
/* 581 */       return (Varargs)freadline(f, false); 
/* 582 */     LuaValue[] v = new LuaValue[n];
/*     */     
/*     */     int i;
/* 585 */     for (i = 0; i < n; ) {
/* 586 */       LuaValue vi; LuaString fmt; LuaValue ai; switch ((ai = args.arg(i + 1)).type()) {
/*     */         case 3:
/* 588 */           vi = freadbytes(f, ai.toint());
/*     */           break;
/*     */         case 4:
/* 591 */           fmt = ai.checkstring();
/* 592 */           if (fmt.m_length >= 2 && fmt.m_bytes[fmt.m_offset] == 42) {
/* 593 */             switch (fmt.m_bytes[fmt.m_offset + 1]) {
/*     */               case 110:
/* 595 */                 vi = freadnumber(f);
/*     */                 break;
/*     */               case 108:
/* 598 */                 vi = freadline(f, false);
/*     */                 break;
/*     */               case 76:
/* 601 */                 vi = freadline(f, true);
/*     */                 break;
/*     */               case 97:
/* 604 */                 vi = freadall(f);
/*     */                 break;
/*     */             } 
/*     */           }
/*     */         default:
/* 609 */           return (Varargs)argerror(i + 1, "(invalid format)");
/*     */       } 
/* 611 */       v[i++] = vi; if (vi.isnil())
/*     */         break; 
/*     */     } 
/* 614 */     return (i == 0) ? (Varargs)NIL : varargsOf(v, 0, i);
/*     */   }
/*     */   
/*     */   private static File checkfile(LuaValue val) {
/* 618 */     File f = optfile(val);
/* 619 */     if (f == null)
/* 620 */       argerror(1, "file"); 
/* 621 */     checkopen(f);
/* 622 */     return f;
/*     */   }
/*     */   
/*     */   private static File optfile(LuaValue val) {
/* 626 */     return (val instanceof File) ? (File)val : null;
/*     */   }
/*     */   
/*     */   private static File checkopen(File file) {
/* 630 */     if (file.isclosed())
/* 631 */       error("attempt to use a closed file"); 
/* 632 */     return file;
/*     */   }
/*     */   
/*     */   private File rawopenfile(int filetype, String filename, String mode) throws IOException {
/* 636 */     int len = mode.length();
/* 637 */     for (int i = 0; i < len; i++) {
/* 638 */       char ch = mode.charAt(i);
/* 639 */       if ((i != 0 || "rwa".indexOf(ch) < 0) && (i != 1 || ch != '+'))
/*     */       {
/* 641 */         if (i < 1 || ch != 'b') {
/*     */           
/* 643 */           len = -1; break;
/*     */         }  } 
/*     */     } 
/* 646 */     if (len <= 0) {
/* 647 */       argerror(2, "invalid mode: '" + mode + "'");
/*     */     }
/* 649 */     switch (filetype) {
/*     */       case 0:
/* 651 */         return wrapStdin();
/*     */       case 1:
/* 653 */         return wrapStdout();
/*     */       case 2:
/* 655 */         return wrapStderr();
/*     */     } 
/* 657 */     boolean isreadmode = mode.startsWith("r");
/* 658 */     boolean isappend = mode.startsWith("a");
/* 659 */     boolean isupdate = (mode.indexOf('+') > 0);
/* 660 */     boolean isbinary = mode.endsWith("b");
/* 661 */     return openFile(filename, isreadmode, isappend, isupdate, isbinary);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static LuaValue freadbytes(File f, int count) throws IOException {
/* 667 */     if (count == 0)
/* 668 */       return f.eof() ? NIL : (LuaValue)EMPTYSTRING; 
/* 669 */     byte[] b = new byte[count];
/*     */     int r;
/* 671 */     if ((r = f.read(b, 0, b.length)) < 0)
/* 672 */       return NIL; 
/* 673 */     return (LuaValue)LuaString.valueUsing(b, 0, r);
/*     */   }
/*     */   public static LuaValue freaduntil(File f, boolean lineonly, boolean withend) throws IOException {
/*     */     int c;
/* 677 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */     
/*     */     try {
/* 680 */       if (lineonly) {
/* 681 */         while ((c = f.read()) >= 0) {
/* 682 */           switch (c) {
/*     */             case 13:
/* 684 */               if (withend)
/* 685 */                 baos.write(c); 
/*     */               continue;
/*     */             case 10:
/* 688 */               if (withend)
/* 689 */                 baos.write(c); 
/*     */               break;
/*     */           } 
/* 692 */           baos.write(c);
/*     */         }
/*     */       
/*     */       } else {
/*     */         
/* 697 */         while ((c = f.read()) >= 0)
/* 698 */           baos.write(c); 
/*     */       } 
/* 700 */     } catch (EOFException e) {
/* 701 */       c = -1;
/*     */     } 
/* 703 */     return (c < 0 && baos.size() == 0) ? NIL : (LuaValue)LuaString.valueUsing(baos.toByteArray());
/*     */   }
/*     */   
/*     */   public static LuaValue freadline(File f, boolean withend) throws IOException {
/* 707 */     return freaduntil(f, true, withend);
/*     */   }
/*     */   
/*     */   public static LuaValue freadall(File f) throws IOException {
/* 711 */     int n = f.remaining();
/* 712 */     if (n >= 0) {
/* 713 */       return (n == 0) ? (LuaValue)EMPTYSTRING : freadbytes(f, n);
/*     */     }
/* 715 */     return freaduntil(f, false, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public static LuaValue freadnumber(File f) throws IOException {
/* 720 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/* 721 */     freadchars(f, " \t\r\n", (ByteArrayOutputStream)null);
/* 722 */     freadchars(f, "-+", baos);
/*     */ 
/*     */     
/* 725 */     freadchars(f, "0123456789", baos);
/* 726 */     freadchars(f, ".", baos);
/* 727 */     freadchars(f, "0123456789", baos);
/*     */ 
/*     */ 
/*     */     
/* 731 */     String s = baos.toString();
/* 732 */     return (s.length() > 0) ? (LuaValue)valueOf(Double.parseDouble(s)) : NIL;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void freadchars(File f, String chars, ByteArrayOutputStream baos) throws IOException {
/*     */     while (true) {
/* 738 */       int c = f.peek();
/* 739 */       if (chars.indexOf(c) < 0) {
/*     */         return;
/*     */       }
/* 742 */       f.read();
/* 743 */       if (baos != null)
/* 744 */         baos.write(c); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\IoLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */