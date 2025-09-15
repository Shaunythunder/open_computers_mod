/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaError;
/*     */ import li.cil.repack.org.luaj.vm2.LuaString;
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*     */ import li.cil.repack.org.luaj.vm2.LuaThread;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BaseLib
/*     */   extends TwoArgFunction
/*     */   implements ResourceFinder
/*     */ {
/*     */   Globals globals;
/*     */   
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/* 103 */     this.globals = env.checkglobals();
/* 104 */     this.globals.finder = this;
/* 105 */     this.globals.baselib = this;
/* 106 */     env.set("_G", env);
/* 107 */     env.set("_VERSION", "Luaj 0.0");
/* 108 */     env.set("assert", (LuaValue)new _assert());
/* 109 */     env.set("collectgarbage", (LuaValue)new collectgarbage());
/* 110 */     env.set("dofile", (LuaValue)new dofile());
/* 111 */     env.set("error", (LuaValue)new error());
/* 112 */     env.set("getmetatable", (LuaValue)new getmetatable());
/* 113 */     env.set("load", (LuaValue)new load());
/* 114 */     env.set("loadfile", (LuaValue)new loadfile());
/* 115 */     env.set("pcall", (LuaValue)new pcall());
/* 116 */     env.set("print", (LuaValue)new print(this));
/* 117 */     env.set("rawequal", (LuaValue)new rawequal());
/* 118 */     env.set("rawget", (LuaValue)new rawget());
/* 119 */     env.set("rawlen", (LuaValue)new rawlen());
/* 120 */     env.set("rawset", (LuaValue)new rawset());
/* 121 */     env.set("select", (LuaValue)new select());
/* 122 */     env.set("setmetatable", (LuaValue)new setmetatable());
/* 123 */     env.set("tonumber", (LuaValue)new tonumber());
/* 124 */     env.set("tostring", (LuaValue)new tostring());
/* 125 */     env.set("type", (LuaValue)new type());
/* 126 */     env.set("xpcall", (LuaValue)new xpcall());
/*     */     
/*     */     next next;
/* 129 */     env.set("next", (LuaValue)(next = new next()));
/* 130 */     env.set("pairs", (LuaValue)new pairsbase(PAIRS, NIL, next));
/* 131 */     env.set("ipairs", (LuaValue)new pairsbase(IPAIRS, (LuaValue)ZERO, new inext()));
/*     */     
/* 133 */     return env;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream findResource(String filename) {
/* 141 */     return getClass().getResourceAsStream(filename.startsWith("/") ? filename : ("/" + filename));
/*     */   }
/*     */   
/*     */   static final class _assert
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 148 */       if (!args.arg1().toboolean())
/* 149 */         error((args.narg() > 1) ? args.optjstring(2, "assertion failed!") : "assertion failed!"); 
/* 150 */       return args;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class collectgarbage
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 157 */       String s = args.optjstring(1, "collect");
/* 158 */       if ("collect".equals(s)) {
/* 159 */         System.gc();
/* 160 */         return (Varargs)ZERO;
/* 161 */       }  if ("count".equals(s)) {
/* 162 */         Runtime rt = Runtime.getRuntime();
/* 163 */         long used = rt.totalMemory() - rt.freeMemory();
/* 164 */         return varargsOf((LuaValue)valueOf(used / 1024.0D), (Varargs)valueOf((used % 1024L)));
/* 165 */       }  if ("step".equals(s)) {
/* 166 */         System.gc();
/* 167 */         return (Varargs)LuaValue.TRUE;
/*     */       } 
/* 169 */       argerror(1, "invalid option '" + s + "'");
/*     */       
/* 171 */       return (Varargs)NIL;
/*     */     }
/*     */   }
/*     */   
/*     */   final class dofile
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 178 */       args.argcheck((args.isstring(1) || args.isnil(1)), 1, "filename must be string or nil");
/* 179 */       String filename = args.isstring(1) ? args.tojstring(1) : null;
/*     */ 
/*     */       
/* 182 */       Varargs v = (filename == null) ? BaseLib.this.loadStream(BaseLib.this.globals.STDIN, "=stdin", "bt", (LuaValue)BaseLib.this.globals) : BaseLib.this.loadFile(args.checkjstring(1), "bt", (LuaValue)BaseLib.this.globals);
/* 183 */       return v.isnil(1) ? (Varargs)error(v.tojstring(2)) : v.arg1().invoke();
/*     */     }
/*     */   }
/*     */   
/*     */   static final class error
/*     */     extends TwoArgFunction {
/*     */     public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 190 */       if (arg1.isnil()) throw new LuaError(NIL); 
/* 191 */       if (!arg1.isstring() || arg2.optint(1) == 0) throw new LuaError(arg1); 
/* 192 */       throw new LuaError(arg1.tojstring(), arg2.optint(1));
/*     */     }
/*     */   }
/*     */   
/*     */   static final class getmetatable
/*     */     extends LibFunction {
/*     */     public LuaValue call() {
/* 199 */       return argerror(1, "value expected");
/*     */     }
/*     */     public LuaValue call(LuaValue arg) {
/* 202 */       LuaValue mt = arg.getmetatable();
/* 203 */       return (mt != null) ? mt.rawget((LuaValue)METATABLE).optvalue(mt) : NIL;
/*     */     }
/*     */   }
/*     */   
/*     */   final class load extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 209 */       LuaValue ld = args.arg1();
/* 210 */       if (!ld.isstring() && !ld.isfunction()) {
/* 211 */         throw new LuaError("bad argument #1 to 'load' (string or function expected, got " + ld.typename() + ")");
/*     */       }
/* 213 */       String source = args.optjstring(2, ld.isstring() ? ld.tojstring() : "=(load)");
/* 214 */       String mode = args.optjstring(3, "bt");
/* 215 */       LuaValue env = args.optvalue(4, (LuaValue)BaseLib.this.globals);
/* 216 */       return BaseLib.this.loadStream(ld.isstring() ? ld.strvalue().toInputStream() : 
/* 217 */           new BaseLib.StringInputStream((LuaValue)ld.checkfunction()), source, mode, env);
/*     */     }
/*     */   }
/*     */   
/*     */   final class loadfile
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 225 */       args.argcheck((args.isstring(1) || args.isnil(1)), 1, "filename must be string or nil");
/* 226 */       String filename = args.isstring(1) ? args.tojstring(1) : null;
/* 227 */       String mode = args.optjstring(2, "bt");
/* 228 */       LuaValue env = args.optvalue(3, (LuaValue)BaseLib.this.globals);
/* 229 */       return (filename == null) ? 
/* 230 */         BaseLib.this.loadStream(BaseLib.this.globals.STDIN, "=stdin", mode, env) : 
/* 231 */         BaseLib.this.loadFile(filename, mode, env);
/*     */     }
/*     */   }
/*     */   
/*     */   final class pcall
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 239 */       LuaValue func = args.checkvalue(1);
/* 240 */       if (BaseLib.this.globals != null && BaseLib.this.globals.debuglib != null)
/* 241 */         BaseLib.this.globals.debuglib.onCall(this); 
/*     */       try {
/* 243 */         return varargsOf((LuaValue)TRUE, func.invoke(args.subargs(2)));
/* 244 */       } catch (LuaError le) {
/* 245 */         LuaValue m = le.getMessageObject();
/* 246 */         return varargsOf((LuaValue)FALSE, (m != null) ? (Varargs)m : (Varargs)NIL);
/* 247 */       } catch (Exception e) {
/* 248 */         String m = e.getMessage();
/* 249 */         return varargsOf((LuaValue)FALSE, (Varargs)valueOf((m != null) ? m : e.toString()));
/*     */       } finally {
/* 251 */         if (BaseLib.this.globals != null && BaseLib.this.globals.debuglib != null)
/* 252 */           BaseLib.this.globals.debuglib.onReturn(); 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   final class print extends VarArgFunction {
/*     */     final BaseLib baselib;
/*     */     
/*     */     print(BaseLib baselib) {
/* 261 */       this.baselib = baselib;
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs invoke(Varargs args) {
/* 266 */       LuaValue tostring = BaseLib.this.globals.get("tostring");
/* 267 */       for (int i = 1, n = args.narg(); i <= n; i++) {
/* 268 */         if (i > 1) BaseLib.this.globals.STDOUT.print('\t'); 
/* 269 */         LuaString s = tostring.call(args.arg(i)).strvalue();
/* 270 */         BaseLib.this.globals.STDOUT.print(s.tojstring());
/*     */       } 
/* 272 */       BaseLib.this.globals.STDOUT.print('\n');
/* 273 */       return (Varargs)NONE;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class rawequal
/*     */     extends LibFunction {
/*     */     public LuaValue call() {
/* 280 */       return argerror(1, "value expected");
/*     */     }
/*     */     public LuaValue call(LuaValue arg) {
/* 283 */       return argerror(2, "value expected");
/*     */     }
/*     */     public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 286 */       return (LuaValue)valueOf(arg1.raweq(arg2));
/*     */     }
/*     */   }
/*     */   
/*     */   static final class rawget
/*     */     extends TableLibFunction {
/*     */     public LuaValue call() {
/* 293 */       return argerror(1, "value expected");
/*     */     }
/*     */     public LuaValue call(LuaValue arg) {
/* 296 */       return argerror(2, "value expected");
/*     */     }
/*     */     public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 299 */       return arg1.checktable().rawget(arg2);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class rawlen
/*     */     extends LibFunction
/*     */   {
/*     */     public LuaValue call(LuaValue arg) {
/* 307 */       return (LuaValue)valueOf(arg.rawlen());
/*     */     }
/*     */   }
/*     */   
/*     */   static final class rawset
/*     */     extends TableLibFunction {
/*     */     public LuaValue call(LuaValue table) {
/* 314 */       return argerror(2, "value expected");
/*     */     }
/*     */     public LuaValue call(LuaValue table, LuaValue index) {
/* 317 */       return argerror(3, "value expected");
/*     */     }
/*     */     public LuaValue call(LuaValue table, LuaValue index, LuaValue value) {
/* 320 */       LuaTable t = table.checktable();
/* 321 */       if (!index.isvalidkey()) argerror(2, "table index is nil"); 
/* 322 */       t.rawset(index, value);
/* 323 */       return (LuaValue)t;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class select
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 330 */       int n = args.narg() - 1;
/* 331 */       if (args.arg1().equals(valueOf("#")))
/* 332 */         return (Varargs)valueOf(n); 
/* 333 */       int i = args.checkint(1);
/* 334 */       if (i == 0 || i < -n)
/* 335 */         argerror(1, "index out of range"); 
/* 336 */       return args.subargs((i < 0) ? (n + i + 2) : (i + 1));
/*     */     }
/*     */   }
/*     */   
/*     */   static final class setmetatable
/*     */     extends TableLibFunction {
/*     */     public LuaValue call(LuaValue table) {
/* 343 */       return argerror(2, "nil or table expected");
/*     */     }
/*     */     public LuaValue call(LuaValue table, LuaValue metatable) {
/* 346 */       LuaValue mt0 = table.checktable().getmetatable();
/* 347 */       if (mt0 != null && !mt0.rawget((LuaValue)METATABLE).isnil())
/* 348 */         error("cannot change a protected metatable"); 
/* 349 */       return table.setmetatable(metatable.isnil() ? null : (LuaValue)metatable.checktable());
/*     */     }
/*     */   }
/*     */   
/*     */   static final class tonumber
/*     */     extends LibFunction {
/*     */     public LuaValue call(LuaValue e) {
/* 356 */       return e.tonumber();
/*     */     }
/*     */     public LuaValue call(LuaValue e, LuaValue base) {
/* 359 */       if (base.isnil())
/* 360 */         return e.tonumber(); 
/* 361 */       int b = base.checkint();
/* 362 */       if (b < 2 || b > 36)
/* 363 */         argerror(2, "base out of range"); 
/* 364 */       return e.checkstring().tonumber(b);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class tostring
/*     */     extends LibFunction {
/*     */     public LuaValue call(LuaValue arg) {
/* 371 */       LuaValue h = arg.metatag((LuaValue)TOSTRING);
/* 372 */       if (!h.isnil()) {
/* 373 */         LuaValue luaValue1 = h.call(arg);
/* 374 */         LuaValue vs = luaValue1.tostring();
/* 375 */         return !vs.isnil() ? vs : luaValue1;
/*     */       } 
/* 377 */       LuaValue v = arg.tostring();
/* 378 */       if (!v.isnil())
/* 379 */         return v; 
/* 380 */       return (LuaValue)valueOf(arg.tojstring());
/*     */     }
/*     */   }
/*     */   
/*     */   static final class type
/*     */     extends LibFunction
/*     */   {
/*     */     public LuaValue call(LuaValue arg) {
/* 388 */       return (LuaValue)valueOf(arg.typename());
/*     */     }
/*     */   }
/*     */   
/*     */   final class xpcall
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 396 */       LuaThread t = BaseLib.this.globals.running;
/* 397 */       LuaValue preverror = t.errorfunc;
/* 398 */       t.errorfunc = args.checkvalue(2);
/*     */       try {
/* 400 */         if (BaseLib.this.globals != null && BaseLib.this.globals.debuglib != null) {
/* 401 */           BaseLib.this.globals.debuglib.onCall(this);
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */       finally {
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 415 */         t.errorfunc = preverror;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static final class pairsbase
/*     */     extends VarArgFunction {
/*     */     final LuaString method;
/*     */     final LuaValue initial;
/*     */     final VarArgFunction iter;
/*     */     
/*     */     pairsbase(LuaString method, LuaValue initial, VarArgFunction iter) {
/* 427 */       this.method = method;
/* 428 */       this.initial = initial;
/* 429 */       this.iter = iter;
/*     */     }
/*     */     
/*     */     public Varargs invoke(Varargs args) {
/* 433 */       LuaValue arg = args.arg1();
/* 434 */       LuaValue t = arg.metatag((LuaValue)this.method);
/* 435 */       if (!t.isnil())
/*     */       {
/* 437 */         return t.invoke(args.isvalue(1) ? (Varargs)arg : (Varargs)t); } 
/* 438 */       return varargsOf((LuaValue)this.iter, (LuaValue)args.checktable(1), (Varargs)this.initial);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class next
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 445 */       return args.checktable(1).next(args.arg(2));
/*     */     }
/*     */   }
/*     */   
/*     */   static final class inext
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 453 */       return args.checktable(1).inext(args.arg(2));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Varargs loadFile(String filename, String mode, LuaValue env) {
/* 464 */     InputStream is = this.globals.finder.findResource(filename);
/* 465 */     if (is == null)
/* 466 */       return varargsOf(NIL, (Varargs)valueOf("cannot open " + filename + ": No such file or directory")); 
/*     */     try {
/* 468 */       return loadStream(is, "@" + filename, mode, env);
/*     */     } finally {
/*     */       try {
/* 471 */         is.close();
/* 472 */       } catch (Exception e) {
/* 473 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Varargs loadStream(InputStream is, String chunkname, String mode, LuaValue env) {
/*     */     try {
/* 480 */       if (is == null)
/* 481 */         return varargsOf(NIL, (Varargs)valueOf("not found: " + chunkname)); 
/* 482 */       return (Varargs)this.globals.load(is, chunkname, mode, env);
/* 483 */     } catch (Exception e) {
/* 484 */       return varargsOf(NIL, (Varargs)valueOf(e.getMessage()));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static class StringInputStream extends InputStream { final LuaValue func;
/*     */     byte[] bytes;
/*     */     int offset;
/* 491 */     int remaining = 0;
/*     */     StringInputStream(LuaValue func) {
/* 493 */       this.func = func;
/*     */     }
/*     */     public int read() throws IOException {
/* 496 */       if (this.remaining < 0)
/* 497 */         return -1; 
/* 498 */       if (this.remaining == 0) {
/* 499 */         LuaValue s = this.func.call();
/* 500 */         if (s.isnil())
/* 501 */           return this.remaining = -1; 
/* 502 */         LuaString ls = s.strvalue();
/* 503 */         this.bytes = ls.m_bytes;
/* 504 */         this.offset = ls.m_offset;
/* 505 */         this.remaining = ls.m_length;
/* 506 */         if (this.remaining <= 0)
/* 507 */           return -1; 
/*     */       } 
/* 509 */       this.remaining--;
/* 510 */       return 0xFF & this.bytes[this.offset++];
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\BaseLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */