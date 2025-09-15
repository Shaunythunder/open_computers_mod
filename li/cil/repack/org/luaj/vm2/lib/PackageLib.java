/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.file.FileSystems;
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaBoolean;
/*     */ import li.cil.repack.org.luaj.vm2.LuaFunction;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PackageLib
/*     */   extends TwoArgFunction
/*     */ {
/*     */   public static final String DEFAULT_LUA_PATH;
/*     */   
/*     */   static {
/* 104 */     String path = null;
/*     */     try {
/* 106 */       path = System.getProperty("luaj.package.path");
/* 107 */     } catch (Exception e) {
/* 108 */       System.out.println(e.toString());
/*     */     } 
/* 110 */     if (path == null) {
/* 111 */       path = "?.lua";
/*     */     }
/* 113 */     DEFAULT_LUA_PATH = path;
/*     */   }
/*     */   
/* 116 */   static final LuaString _LOADED = valueOf("loaded");
/* 117 */   private static final LuaString _LOADLIB = valueOf("loadlib");
/* 118 */   static final LuaString _PRELOAD = valueOf("preload");
/* 119 */   static final LuaString _PATH = valueOf("path");
/* 120 */   static final LuaString _SEARCHPATH = valueOf("searchpath");
/* 121 */   static final LuaString _SEARCHERS = valueOf("searchers");
/* 122 */   static final LuaString _SEEALL = valueOf("seeall");
/*     */ 
/*     */ 
/*     */   
/*     */   Globals globals;
/*     */ 
/*     */ 
/*     */   
/*     */   LuaTable package_;
/*     */ 
/*     */ 
/*     */   
/*     */   public preload_searcher preload_searcher;
/*     */ 
/*     */ 
/*     */   
/*     */   public lua_searcher lua_searcher;
/*     */ 
/*     */ 
/*     */   
/*     */   public java_searcher java_searcher;
/*     */ 
/*     */   
/* 145 */   private static final LuaString _SENTINEL = valueOf("\001");
/*     */   
/* 147 */   private static final String FILE_SEP = FileSystems.getDefault().getSeparator();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/* 163 */     this.globals = env.checkglobals();
/* 164 */     this.globals.set("require", (LuaValue)new require());
/* 165 */     this.package_ = new LuaTable();
/* 166 */     this.package_.set((LuaValue)_LOADED, (LuaValue)new LuaTable());
/* 167 */     this.package_.set((LuaValue)_PRELOAD, (LuaValue)new LuaTable());
/* 168 */     this.package_.set((LuaValue)_PATH, (LuaValue)LuaValue.valueOf(DEFAULT_LUA_PATH));
/* 169 */     this.package_.set((LuaValue)_LOADLIB, (LuaValue)new loadlib());
/* 170 */     this.package_.set((LuaValue)_SEARCHPATH, (LuaValue)new searchpath());
/* 171 */     this.package_.set((LuaValue)_SEEALL, (LuaValue)new seeall());
/* 172 */     LuaTable searchers = new LuaTable();
/* 173 */     searchers.set(1, (LuaValue)(this.preload_searcher = new preload_searcher()));
/* 174 */     searchers.set(2, (LuaValue)(this.lua_searcher = new lua_searcher()));
/* 175 */     searchers.set(3, (LuaValue)(this.java_searcher = new java_searcher()));
/* 176 */     this.package_.set((LuaValue)_SEARCHERS, (LuaValue)searchers);
/* 177 */     this.package_.set("config", FILE_SEP + "\n;\n?\n!\n-\n");
/* 178 */     this.package_.get((LuaValue)_LOADED).set("package", (LuaValue)this.package_);
/* 179 */     env.set("package", (LuaValue)this.package_);
/* 180 */     this.globals.package_ = this;
/* 181 */     return env;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIsLoaded(String name, LuaTable value) {
/* 186 */     this.package_.get((LuaValue)_LOADED).set(name, (LuaValue)value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLuaPath(String newLuaPath) {
/* 194 */     this.package_.set((LuaValue)_PATH, (LuaValue)LuaValue.valueOf(newLuaPath));
/*     */   }
/*     */ 
/*     */   
/*     */   public String tojstring() {
/* 199 */     return "package";
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
/*     */   public class require
/*     */     extends OneArgFunction
/*     */   {
/*     */     public LuaValue call(LuaValue arg) {
/*     */       LuaBoolean luaBoolean;
/* 239 */       LuaString name = arg.checkstring();
/* 240 */       LuaValue loaded = PackageLib.this.package_.get((LuaValue)PackageLib._LOADED);
/* 241 */       LuaValue result = loaded.get((LuaValue)name);
/* 242 */       if (result.toboolean()) {
/* 243 */         if (result == PackageLib._SENTINEL)
/* 244 */           error("loop or previous error loading module '" + name + "'"); 
/* 245 */         return result;
/*     */       } 
/*     */ 
/*     */       
/* 249 */       LuaTable tbl = PackageLib.this.package_.get((LuaValue)PackageLib._SEARCHERS).checktable();
/* 250 */       StringBuffer sb = new StringBuffer();
/* 251 */       Varargs loader = null;
/* 252 */       for (int i = 1;; i++) {
/* 253 */         LuaValue searcher = tbl.get(i);
/* 254 */         if (searcher.isnil()) {
/* 255 */           error("module '" + name + "' not found: " + name + sb);
/*     */         }
/*     */ 
/*     */         
/* 259 */         loader = searcher.invoke((Varargs)name);
/* 260 */         if (loader.isfunction(1))
/*     */           break; 
/* 262 */         if (loader.isstring(1)) {
/* 263 */           sb.append(loader.tojstring(1));
/*     */         }
/*     */       } 
/*     */       
/* 267 */       loaded.set((LuaValue)name, (LuaValue)PackageLib._SENTINEL);
/* 268 */       result = loader.arg1().call((LuaValue)name, loader.arg(2));
/* 269 */       if (!result.isnil()) {
/* 270 */         loaded.set((LuaValue)name, result);
/* 271 */       } else if ((result = loaded.get((LuaValue)name)) == PackageLib._SENTINEL) {
/* 272 */         loaded.set((LuaValue)name, (LuaValue)(luaBoolean = LuaValue.TRUE));
/* 273 */       }  return (LuaValue)luaBoolean;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class loadlib
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 280 */       args.checkstring(1);
/* 281 */       return varargsOf(NIL, (LuaValue)valueOf("dynamic libraries not enabled"), (Varargs)valueOf("absent"));
/*     */     }
/*     */   }
/*     */   
/*     */   public class preload_searcher
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 288 */       LuaString name = args.checkstring(1);
/* 289 */       LuaValue val = PackageLib.this.package_.get((LuaValue)PackageLib._PRELOAD).get((LuaValue)name);
/* 290 */       return val.isnil() ? (Varargs)valueOf("\n\tno field package.preload['" + name + "']") : (Varargs)val;
/*     */     }
/*     */   }
/*     */   
/*     */   public class lua_searcher
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 297 */       LuaString name = args.checkstring(1);
/*     */ 
/*     */       
/* 300 */       LuaValue path = PackageLib.this.package_.get((LuaValue)PackageLib._PATH);
/* 301 */       if (!path.isstring()) {
/* 302 */         return (Varargs)valueOf("package.path is not a string");
/*     */       }
/*     */       
/* 305 */       Varargs v = PackageLib.this.package_.get((LuaValue)PackageLib._SEARCHPATH).invoke(varargsOf((LuaValue)name, (Varargs)path));
/*     */ 
/*     */       
/* 308 */       if (!v.isstring(1))
/* 309 */         return (Varargs)v.arg(2).tostring(); 
/* 310 */       LuaString filename = v.arg1().strvalue();
/*     */ 
/*     */       
/* 313 */       LuaValue luaValue1 = PackageLib.this.globals.loadfile(filename.tojstring());
/* 314 */       if (luaValue1.arg1().isfunction()) {
/* 315 */         return LuaValue.varargsOf(luaValue1.arg1(), (Varargs)filename);
/*     */       }
/*     */       
/* 318 */       return varargsOf(NIL, (Varargs)valueOf("'" + filename + "': " + luaValue1.arg(2).tojstring()));
/*     */     }
/*     */   }
/*     */   
/*     */   public class searchpath
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 325 */       String name = args.checkjstring(1);
/* 326 */       String path = args.checkjstring(2);
/* 327 */       String sep = args.optjstring(3, ".");
/* 328 */       String rep = args.optjstring(4, PackageLib.FILE_SEP);
/*     */ 
/*     */       
/* 331 */       int e = -1;
/* 332 */       int n = path.length();
/* 333 */       StringBuffer sb = null;
/* 334 */       name = name.replace(sep.charAt(0), rep.charAt(0));
/* 335 */       while (e < n) {
/*     */ 
/*     */         
/* 338 */         int b = e + 1;
/* 339 */         e = path.indexOf(';', b);
/* 340 */         if (e < 0)
/* 341 */           e = path.length(); 
/* 342 */         String template = path.substring(b, e);
/*     */ 
/*     */         
/* 345 */         int q = template.indexOf('?');
/* 346 */         String filename = template;
/* 347 */         if (q >= 0) {
/* 348 */           filename = template.substring(0, q) + name + template.substring(q + 1);
/*     */         }
/*     */ 
/*     */         
/* 352 */         InputStream is = PackageLib.this.globals.finder.findResource(filename);
/* 353 */         if (is != null) {
/*     */           try {
/* 355 */             is.close();
/* 356 */           } catch (IOException iOException) {}
/*     */           
/* 358 */           return (Varargs)valueOf(filename);
/*     */         } 
/*     */ 
/*     */         
/* 362 */         if (sb == null)
/* 363 */           sb = new StringBuffer(); 
/* 364 */         sb.append("\n\t" + filename);
/*     */       } 
/* 366 */       return varargsOf(NIL, (Varargs)valueOf(sb.toString()));
/*     */     }
/*     */   }
/*     */   
/*     */   public class seeall
/*     */     extends OneArgFunction {
/*     */     public LuaValue call(LuaValue arg) {
/* 373 */       LuaTable mt = new LuaTable();
/* 374 */       mt.set((LuaValue)LuaValue.INDEX, (LuaValue)PackageLib.this.globals);
/* 375 */       arg.checktable().setmetatable((LuaValue)mt);
/* 376 */       return LuaValue.NONE;
/*     */     }
/*     */   }
/*     */   
/*     */   public class java_searcher
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 383 */       String name = args.checkjstring(1);
/* 384 */       String classname = PackageLib.toClassname(name);
/* 385 */       Class<?> c = null;
/* 386 */       LuaValue v = null;
/*     */       try {
/* 388 */         c = Class.forName(classname);
/* 389 */         v = (LuaValue)c.newInstance();
/* 390 */         if (v.isfunction())
/* 391 */           ((LuaFunction)v).initupvalue1((LuaValue)PackageLib.this.globals); 
/* 392 */         return varargsOf(v, (Varargs)PackageLib.this.globals);
/* 393 */       } catch (ClassNotFoundException cnfe) {
/* 394 */         return (Varargs)valueOf("\n\tno class '" + classname + "'");
/* 395 */       } catch (Exception e) {
/* 396 */         return (Varargs)valueOf("\n\tjava load failed on '" + classname + "', " + e);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static final String toClassname(String filename) {
/* 403 */     int n = filename.length();
/* 404 */     int j = n;
/* 405 */     if (filename.endsWith(".lua"))
/* 406 */       j -= 4; 
/* 407 */     for (int k = 0; k < j; k++) {
/* 408 */       char c = filename.charAt(k);
/* 409 */       if (!isClassnamePart(c) || c == '/' || c == '\\') {
/* 410 */         StringBuffer sb = new StringBuffer(j);
/* 411 */         for (int i = 0; i < j; i++) {
/* 412 */           c = filename.charAt(i);
/* 413 */           sb.append(isClassnamePart(c) ? c : ((c == '/' || c == '\\') ? 46 : 95));
/*     */         } 
/* 415 */         return sb.toString();
/*     */       } 
/*     */     } 
/* 418 */     return (n == j) ? filename : filename.substring(0, j);
/*     */   }
/*     */   
/*     */   private static final boolean isClassnamePart(char c) {
/* 422 */     if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
/* 423 */       return true; 
/* 424 */     switch (c) {
/*     */       case '$':
/*     */       case '.':
/*     */       case '_':
/* 428 */         return true;
/*     */     } 
/* 430 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\PackageLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */