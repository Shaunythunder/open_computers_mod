/*      */ package li.cil.repack.org.luaj.vm2.lib;
/*      */ 
/*      */ import li.cil.repack.org.luaj.vm2.Globals;
/*      */ import li.cil.repack.org.luaj.vm2.Lua;
/*      */ import li.cil.repack.org.luaj.vm2.LuaBoolean;
/*      */ import li.cil.repack.org.luaj.vm2.LuaClosure;
/*      */ import li.cil.repack.org.luaj.vm2.LuaError;
/*      */ import li.cil.repack.org.luaj.vm2.LuaFunction;
/*      */ import li.cil.repack.org.luaj.vm2.LuaNil;
/*      */ import li.cil.repack.org.luaj.vm2.LuaNumber;
/*      */ import li.cil.repack.org.luaj.vm2.LuaString;
/*      */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*      */ import li.cil.repack.org.luaj.vm2.LuaThread;
/*      */ import li.cil.repack.org.luaj.vm2.LuaUserdata;
/*      */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*      */ import li.cil.repack.org.luaj.vm2.Print;
/*      */ import li.cil.repack.org.luaj.vm2.Prototype;
/*      */ import li.cil.repack.org.luaj.vm2.Varargs;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class DebugLib
/*      */   extends TwoArgFunction
/*      */ {
/*      */   public static boolean CALLS;
/*      */   public static boolean TRACE;
/*      */   
/*      */   static {
/*      */     try {
/*   93 */       CALLS = (null != System.getProperty("CALLS"));
/*   94 */     } catch (Exception exception) {}
/*      */     
/*      */     try {
/*   97 */       TRACE = (null != System.getProperty("TRACE"));
/*   98 */     } catch (Exception exception) {}
/*      */   }
/*      */ 
/*      */   
/*  102 */   static final LuaString LUA = valueOf("Lua");
/*  103 */   private static final LuaString QMARK = valueOf("?");
/*  104 */   private static final LuaString CALL = valueOf("call");
/*  105 */   private static final LuaString LINE = valueOf("line");
/*  106 */   private static final LuaString COUNT = valueOf("count");
/*  107 */   private static final LuaString RETURN = valueOf("return");
/*      */   
/*  109 */   static final LuaString FUNC = valueOf("func");
/*  110 */   static final LuaString ISTAILCALL = valueOf("istailcall");
/*  111 */   static final LuaString ISVARARG = valueOf("isvararg");
/*  112 */   static final LuaString NUPS = valueOf("nups");
/*  113 */   static final LuaString NPARAMS = valueOf("nparams");
/*  114 */   static final LuaString NAME = valueOf("name");
/*  115 */   static final LuaString NAMEWHAT = valueOf("namewhat");
/*  116 */   static final LuaString WHAT = valueOf("what");
/*  117 */   static final LuaString SOURCE = valueOf("source");
/*  118 */   static final LuaString SHORT_SRC = valueOf("short_src");
/*  119 */   static final LuaString LINEDEFINED = valueOf("linedefined");
/*  120 */   static final LuaString LASTLINEDEFINED = valueOf("lastlinedefined");
/*  121 */   static final LuaString CURRENTLINE = valueOf("currentline");
/*  122 */   static final LuaString ACTIVELINES = valueOf("activelines");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   Globals globals;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue call(LuaValue modname, LuaValue env) {
/*  138 */     this.globals = env.checkglobals();
/*  139 */     this.globals.debuglib = this;
/*  140 */     LuaTable debug = new LuaTable();
/*  141 */     debug.set("debug", (LuaValue)new debug());
/*  142 */     debug.set("gethook", (LuaValue)new gethook());
/*  143 */     debug.set("getinfo", (LuaValue)new getinfo());
/*  144 */     debug.set("getlocal", (LuaValue)new getlocal());
/*  145 */     debug.set("getmetatable", (LuaValue)new getmetatable());
/*  146 */     debug.set("getregistry", (LuaValue)new getregistry());
/*  147 */     debug.set("getupvalue", (LuaValue)new getupvalue());
/*  148 */     debug.set("getuservalue", (LuaValue)new getuservalue());
/*  149 */     debug.set("sethook", (LuaValue)new sethook());
/*  150 */     debug.set("setlocal", (LuaValue)new setlocal());
/*  151 */     debug.set("setmetatable", (LuaValue)new setmetatable());
/*  152 */     debug.set("setupvalue", (LuaValue)new setupvalue());
/*  153 */     debug.set("setuservalue", (LuaValue)new setuservalue());
/*  154 */     debug.set("traceback", (LuaValue)new traceback());
/*  155 */     debug.set("upvalueid", (LuaValue)new upvalueid());
/*  156 */     debug.set("upvaluejoin", (LuaValue)new upvaluejoin());
/*  157 */     env.set("debug", (LuaValue)debug);
/*  158 */     if (!env.get("package").isnil())
/*  159 */       env.get("package").get("loaded").set("debug", (LuaValue)debug); 
/*  160 */     return (LuaValue)debug;
/*      */   }
/*      */   
/*      */   static final class debug
/*      */     extends ZeroArgFunction
/*      */   {
/*      */     public LuaValue call() {
/*  167 */       return NONE;
/*      */     }
/*      */   }
/*      */   
/*      */   final class gethook
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  175 */       LuaThread t = (args.narg() > 0) ? args.checkthread(1) : DebugLib.this.globals.running;
/*  176 */       LuaThread.State s = t.state;
/*  177 */       return varargsOf((s.hookfunc != null) ? s.hookfunc : NIL, 
/*  178 */           (LuaValue)valueOf((s.hookcall ? "c" : "") + (s.hookline ? "l" : "") + (s.hookrtrn ? "r" : "")), (Varargs)valueOf(s.hookcount));
/*      */     }
/*      */   }
/*      */   
/*      */   final class getinfo extends VarArgFunction {
/*      */     public Varargs invoke(Varargs args) {
/*      */       LuaFunction luaFunction;
/*      */       DebugLib.CallFrame frame;
/*  186 */       int a = 1;
/*  187 */       LuaThread thread = args.isthread(a) ? args.checkthread(a++) : DebugLib.this.globals.running;
/*  188 */       LuaValue func = args.arg(a++);
/*  189 */       String what = args.optjstring(a++, "flnStu");
/*  190 */       DebugLib.CallStack callstack = DebugLib.this.callstack(thread);
/*      */ 
/*      */ 
/*      */       
/*  194 */       if (func.isnumber()) {
/*  195 */         frame = callstack.getCallFrame(func.toint());
/*  196 */         if (frame == null)
/*  197 */           return (Varargs)NONE; 
/*  198 */         luaFunction = frame.f;
/*  199 */       } else if (luaFunction.isfunction()) {
/*  200 */         frame = callstack.findCallFrame((LuaValue)luaFunction);
/*      */       } else {
/*  202 */         return (Varargs)argerror(a - 2, "function or level");
/*      */       } 
/*      */ 
/*      */       
/*  206 */       DebugLib.DebugInfo ar = callstack.auxgetinfo(what, luaFunction, frame);
/*  207 */       LuaTable info = new LuaTable();
/*  208 */       if (what.indexOf('S') >= 0) {
/*  209 */         info.set((LuaValue)DebugLib.WHAT, (LuaValue)DebugLib.LUA);
/*  210 */         info.set((LuaValue)DebugLib.SOURCE, (LuaValue)valueOf(ar.source));
/*  211 */         info.set((LuaValue)DebugLib.SHORT_SRC, (LuaValue)valueOf(ar.short_src));
/*  212 */         info.set((LuaValue)DebugLib.LINEDEFINED, (LuaValue)valueOf(ar.linedefined));
/*  213 */         info.set((LuaValue)DebugLib.LASTLINEDEFINED, (LuaValue)valueOf(ar.lastlinedefined));
/*      */       } 
/*  215 */       if (what.indexOf('l') >= 0) {
/*  216 */         info.set((LuaValue)DebugLib.CURRENTLINE, (LuaValue)valueOf(ar.currentline));
/*      */       }
/*  218 */       if (what.indexOf('u') >= 0) {
/*  219 */         info.set((LuaValue)DebugLib.NUPS, (LuaValue)valueOf(ar.nups));
/*  220 */         info.set((LuaValue)DebugLib.NPARAMS, (LuaValue)valueOf(ar.nparams));
/*  221 */         info.set((LuaValue)DebugLib.ISVARARG, ar.isvararg ? (LuaValue)ONE : (LuaValue)ZERO);
/*      */       } 
/*  223 */       if (what.indexOf('n') >= 0) {
/*  224 */         info.set((LuaValue)DebugLib.NAME, (LuaValue)LuaValue.valueOf((ar.name != null) ? ar.name : "?"));
/*  225 */         info.set((LuaValue)DebugLib.NAMEWHAT, (LuaValue)LuaValue.valueOf(ar.namewhat));
/*      */       } 
/*  227 */       if (what.indexOf('t') >= 0) {
/*  228 */         info.set((LuaValue)DebugLib.ISTAILCALL, (LuaValue)ZERO);
/*      */       }
/*  230 */       if (what.indexOf('L') >= 0) {
/*  231 */         LuaTable lines = new LuaTable();
/*  232 */         info.set((LuaValue)DebugLib.ACTIVELINES, (LuaValue)lines);
/*      */         DebugLib.CallFrame cf;
/*  234 */         for (int l = 1; (cf = callstack.getCallFrame(l)) != null; l++) {
/*  235 */           if (cf.f == luaFunction)
/*  236 */             lines.insert(-1, (LuaValue)valueOf(cf.currentline())); 
/*      */         } 
/*  238 */       }  if (what.indexOf('f') >= 0 && 
/*  239 */         luaFunction != null) {
/*  240 */         info.set((LuaValue)DebugLib.FUNC, (LuaValue)luaFunction);
/*      */       }
/*  242 */       return (Varargs)info;
/*      */     }
/*      */   }
/*      */   
/*      */   final class getlocal
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  250 */       int a = 1;
/*  251 */       LuaThread thread = args.isthread(a) ? args.checkthread(a++) : DebugLib.this.globals.running;
/*  252 */       LuaValue func = args.arg(a++);
/*  253 */       int local = args.checkint(a);
/*      */       
/*  255 */       if (func.isfunction()) {
/*  256 */         return (Varargs)(func.checkclosure()).p.getlocalname(local, 0);
/*      */       }
/*      */       
/*  259 */       DebugLib.CallFrame frame = DebugLib.this.callstack(thread).getCallFrame(func.checkint());
/*  260 */       if (frame == null)
/*  261 */         return (Varargs)argerror(a, "level out of range"); 
/*  262 */       return frame.getLocal(local);
/*      */     }
/*      */   }
/*      */   
/*      */   static final class getmetatable
/*      */     extends LibFunction
/*      */   {
/*      */     public LuaValue call(LuaValue v) {
/*  270 */       LuaValue mt = v.getmetatable();
/*  271 */       return (mt != null) ? mt : NIL;
/*      */     }
/*      */   }
/*      */   
/*      */   final class getregistry
/*      */     extends ZeroArgFunction
/*      */   {
/*      */     public LuaValue call() {
/*  279 */       return (LuaValue)DebugLib.this.globals;
/*      */     }
/*      */   }
/*      */   
/*      */   static final class getupvalue
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  287 */       LuaFunction luaFunction = args.checkfunction(1);
/*  288 */       int up = args.checkint(2);
/*  289 */       if (luaFunction instanceof LuaClosure) {
/*  290 */         LuaClosure c = (LuaClosure)luaFunction;
/*  291 */         LuaString name = DebugLib.findupvalue(c, up);
/*  292 */         if (name != null) {
/*  293 */           return varargsOf((LuaValue)name, (Varargs)c.upValues[up - 1].getValue());
/*      */         }
/*      */       } 
/*  296 */       return (Varargs)NIL;
/*      */     }
/*      */   }
/*      */   
/*      */   static final class getuservalue
/*      */     extends LibFunction
/*      */   {
/*      */     public LuaValue call(LuaValue u) {
/*  304 */       return u.isuserdata() ? u : NIL;
/*      */     }
/*      */   }
/*      */   
/*      */   final class sethook
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  312 */       int a = 1;
/*  313 */       LuaThread t = args.isthread(a) ? args.checkthread(a++) : DebugLib.this.globals.running;
/*  314 */       LuaFunction luaFunction = args.optfunction(a++, null);
/*  315 */       String str = args.optjstring(a++, "");
/*  316 */       int count = args.optint(a++, 0);
/*  317 */       boolean call = false, line = false, rtrn = false;
/*  318 */       for (int i = 0; i < str.length(); i++) {
/*  319 */         switch (str.charAt(i)) {
/*      */           case 'c':
/*  321 */             call = true;
/*      */             break;
/*      */           case 'l':
/*  324 */             line = true;
/*      */             break;
/*      */           case 'r':
/*  327 */             rtrn = true; break;
/*      */         } 
/*      */       } 
/*  330 */       LuaThread.State s = t.state;
/*  331 */       s.hookfunc = (LuaValue)luaFunction;
/*  332 */       s.hookcall = call;
/*  333 */       s.hookline = line;
/*  334 */       s.hookcount = count;
/*  335 */       s.hookrtrn = rtrn;
/*  336 */       return (Varargs)NONE;
/*      */     }
/*      */   }
/*      */   
/*      */   final class setlocal
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  344 */       int a = 1;
/*  345 */       LuaThread thread = args.isthread(a) ? args.checkthread(a++) : DebugLib.this.globals.running;
/*  346 */       int level = args.checkint(a++);
/*  347 */       int local = args.checkint(a++);
/*  348 */       LuaValue value = args.arg(a++);
/*  349 */       DebugLib.CallFrame f = DebugLib.this.callstack(thread).getCallFrame(level);
/*  350 */       return (f != null) ? f.setLocal(local, value) : (Varargs)NONE;
/*      */     }
/*      */   }
/*      */   
/*      */   static final class setmetatable
/*      */     extends TwoArgFunction
/*      */   {
/*      */     public LuaValue call(LuaValue value, LuaValue table) {
/*  358 */       LuaTable luaTable = table.opttable(null);
/*  359 */       switch (value.type())
/*      */       { case 0:
/*  361 */           LuaNil.s_metatable = (LuaValue)luaTable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  381 */           return value;case 3: LuaNumber.s_metatable = (LuaValue)luaTable; return value;case 1: LuaBoolean.s_metatable = (LuaValue)luaTable; return value;case 4: LuaString.s_metatable = (LuaValue)luaTable; return value;case 6: LuaFunction.s_metatable = (LuaValue)luaTable; return value;case 8: LuaThread.s_metatable = (LuaValue)luaTable; return value; }  value.setmetatable((LuaValue)luaTable); return value;
/*      */     }
/*      */   }
/*      */   
/*      */   static final class setupvalue
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  389 */       LuaValue value = args.checkvalue(3);
/*  390 */       int up = args.checkint(2);
/*  391 */       LuaFunction luaFunction = args.checkfunction(1);
/*  392 */       if (luaFunction instanceof LuaClosure) {
/*  393 */         LuaClosure c = (LuaClosure)luaFunction;
/*  394 */         LuaString name = DebugLib.findupvalue(c, up);
/*  395 */         if (name != null) {
/*  396 */           c.upValues[up - 1].setValue(value);
/*  397 */           return (Varargs)name;
/*      */         } 
/*      */       } 
/*  400 */       return (Varargs)NIL;
/*      */     }
/*      */   }
/*      */   
/*      */   static final class setuservalue
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  408 */       Object o = args.checkuserdata(1);
/*  409 */       LuaValue v = args.checkvalue(2);
/*  410 */       LuaUserdata u = (LuaUserdata)args.arg1();
/*  411 */       u.m_instance = v.checkuserdata();
/*  412 */       u.m_metatable = v.getmetatable();
/*  413 */       return (Varargs)NONE;
/*      */     }
/*      */   }
/*      */   
/*      */   final class traceback
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  421 */       int a = 1;
/*  422 */       LuaThread thread = args.isthread(a) ? args.checkthread(a++) : DebugLib.this.globals.running;
/*  423 */       String message = args.optjstring(a++, null);
/*  424 */       int level = args.optint(a++, 1);
/*  425 */       String tb = DebugLib.this.callstack(thread).traceback(level);
/*  426 */       return (Varargs)valueOf((message != null) ? (message + "\n" + tb) : tb);
/*      */     }
/*      */   }
/*      */   
/*      */   static final class upvalueid
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  434 */       int up = args.checkint(2);
/*  435 */       LuaFunction luaFunction = args.checkfunction(1);
/*  436 */       if (luaFunction instanceof LuaClosure) {
/*  437 */         LuaClosure c = (LuaClosure)luaFunction;
/*  438 */         if (c.upValues != null && up > 0 && up <= c.upValues.length) {
/*  439 */           return (Varargs)valueOf(c.upValues[up - 1].hashCode());
/*      */         }
/*      */       } 
/*  442 */       return (Varargs)NIL;
/*      */     }
/*      */   }
/*      */   
/*      */   static final class upvaluejoin
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  450 */       int n1 = args.checkint(2);
/*  451 */       LuaClosure f1 = args.checkclosure(1);
/*  452 */       int n2 = args.checkint(4);
/*  453 */       LuaClosure f2 = args.checkclosure(3);
/*  454 */       if (n1 < 1 || n1 > f1.upValues.length)
/*  455 */         argerror("index out of range"); 
/*  456 */       if (n2 < 1 || n2 > f2.upValues.length)
/*  457 */         argerror("index out of range"); 
/*  458 */       f1.upValues[n1 - 1] = f2.upValues[n2 - 1];
/*  459 */       return (Varargs)NONE;
/*      */     }
/*      */   }
/*      */   
/*      */   public void onCall(LuaFunction f) {
/*  464 */     LuaThread.State s = this.globals.running.state;
/*  465 */     if (s.inhook)
/*      */       return; 
/*  467 */     callstack().onCall(f);
/*  468 */     if (s.hookcall)
/*  469 */       callHook(s, (LuaValue)CALL, NIL); 
/*      */   }
/*      */   
/*      */   public void onCall(LuaClosure c, Varargs varargs, LuaValue[] stack) {
/*  473 */     LuaThread.State s = this.globals.running.state;
/*  474 */     if (s.inhook)
/*      */       return; 
/*  476 */     callstack().onCall(c, varargs, stack);
/*  477 */     if (s.hookcall)
/*  478 */       callHook(s, (LuaValue)CALL, NIL); 
/*      */   }
/*      */   
/*      */   public void onInstruction(int pc, Varargs v, int top) {
/*  482 */     LuaThread.State s = this.globals.running.state;
/*  483 */     if (s.inhook)
/*      */       return; 
/*  485 */     callstack().onInstruction(pc, v, top);
/*  486 */     if (s.hookfunc == null)
/*      */       return; 
/*  488 */     if (s.hookcount > 0 && 
/*  489 */       ++s.bytecodes % s.hookcount == 0)
/*  490 */       callHook(s, (LuaValue)COUNT, NIL); 
/*  491 */     if (s.hookline) {
/*  492 */       int newline = callstack().currentline();
/*  493 */       if (newline != s.lastline) {
/*  494 */         s.lastline = newline;
/*  495 */         callHook(s, (LuaValue)LINE, (LuaValue)LuaValue.valueOf(newline));
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void onReturn() {
/*  501 */     LuaThread.State s = this.globals.running.state;
/*  502 */     if (s.inhook)
/*      */       return; 
/*  504 */     callstack().onReturn();
/*  505 */     if (s.hookrtrn)
/*  506 */       callHook(s, (LuaValue)RETURN, NIL); 
/*      */   }
/*      */   
/*      */   public String traceback(int level) {
/*  510 */     return callstack().traceback(level);
/*      */   }
/*      */   
/*      */   public CallFrame getCallFrame(int level) {
/*  514 */     return callstack().getCallFrame(level);
/*      */   }
/*      */   
/*      */   void callHook(LuaThread.State s, LuaValue type, LuaValue arg) {
/*  518 */     if (s.inhook || s.hookfunc == null)
/*      */       return; 
/*  520 */     s.inhook = true;
/*      */     try {
/*  522 */       s.hookfunc.call(type, arg);
/*  523 */     } catch (LuaError e) {
/*  524 */       throw e;
/*  525 */     } catch (RuntimeException e) {
/*  526 */       throw new LuaError(e);
/*      */     } finally {
/*  528 */       s.inhook = false;
/*      */     } 
/*      */   }
/*      */   
/*      */   CallStack callstack() {
/*  533 */     return callstack(this.globals.running);
/*      */   }
/*      */   
/*      */   CallStack callstack(LuaThread t) {
/*  537 */     if (t.callstack == null)
/*  538 */       t.callstack = new CallStack(); 
/*  539 */     return (CallStack)t.callstack;
/*      */   }
/*      */   
/*      */   static class DebugInfo {
/*      */     String name;
/*      */     String namewhat;
/*      */     String what;
/*      */     String source;
/*      */     int currentline;
/*      */     int linedefined;
/*      */     int lastlinedefined;
/*      */     short nups;
/*      */     short nparams;
/*      */     boolean isvararg;
/*      */     boolean istailcall;
/*      */     String short_src;
/*      */     DebugLib.CallFrame cf;
/*      */     
/*      */     public void funcinfo(LuaFunction f) {
/*  558 */       if (f.isclosure()) {
/*  559 */         Prototype p = (f.checkclosure()).p;
/*  560 */         this.source = (p.source != null) ? p.source.tojstring() : "=?";
/*  561 */         this.linedefined = p.linedefined;
/*  562 */         this.lastlinedefined = p.lastlinedefined;
/*  563 */         this.what = (this.linedefined == 0) ? "main" : "Lua";
/*  564 */         this.short_src = p.shortsource();
/*      */       } else {
/*  566 */         this.source = "=[Java]";
/*  567 */         this.linedefined = -1;
/*  568 */         this.lastlinedefined = -1;
/*  569 */         this.what = "Java";
/*  570 */         this.short_src = f.name();
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public static class CallStack {
/*  576 */     static final DebugLib.CallFrame[] EMPTY = new DebugLib.CallFrame[0];
/*  577 */     DebugLib.CallFrame[] frame = EMPTY;
/*  578 */     int calls = 0;
/*      */ 
/*      */ 
/*      */     
/*      */     synchronized int currentline() {
/*  583 */       return (this.calls > 0) ? this.frame[this.calls - 1].currentline() : -1;
/*      */     }
/*      */     
/*      */     private synchronized DebugLib.CallFrame pushcall() {
/*  587 */       if (this.calls >= this.frame.length) {
/*  588 */         int n = Math.max(4, this.frame.length * 3 / 2);
/*  589 */         DebugLib.CallFrame[] f = new DebugLib.CallFrame[n];
/*  590 */         System.arraycopy(this.frame, 0, f, 0, this.frame.length); int i;
/*  591 */         for (i = this.frame.length; i < n; i++)
/*  592 */           f[i] = new DebugLib.CallFrame(); 
/*  593 */         this.frame = f;
/*  594 */         for (i = 1; i < n; i++)
/*  595 */           (f[i]).previous = f[i - 1]; 
/*      */       } 
/*  597 */       return this.frame[this.calls++];
/*      */     }
/*      */     
/*      */     final synchronized void onCall(LuaFunction function) {
/*  601 */       pushcall().set(function);
/*      */     }
/*      */     
/*      */     final synchronized void onCall(LuaClosure function, Varargs varargs, LuaValue[] stack) {
/*  605 */       pushcall().set(function, varargs, stack);
/*      */     }
/*      */     
/*      */     final synchronized void onReturn() {
/*  609 */       if (this.calls > 0)
/*  610 */         this.frame[--this.calls].reset(); 
/*      */     }
/*      */     
/*      */     final synchronized void onInstruction(int pc, Varargs v, int top) {
/*  614 */       if (this.calls > 0) {
/*  615 */         this.frame[this.calls - 1].instr(pc, v, top);
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     synchronized String traceback(int level) {
/*  625 */       StringBuffer sb = new StringBuffer();
/*  626 */       sb.append("stack traceback:"); DebugLib.CallFrame c;
/*  627 */       while ((c = getCallFrame(level++)) != null) {
/*  628 */         sb.append("\n\t");
/*  629 */         sb.append(c.shortsource());
/*  630 */         sb.append(':');
/*  631 */         if (c.currentline() > 0)
/*  632 */           sb.append(c.currentline() + ":"); 
/*  633 */         sb.append(" in ");
/*  634 */         DebugLib.DebugInfo ar = auxgetinfo("n", c.f, c);
/*  635 */         if (c.linedefined() == 0) {
/*  636 */           sb.append("main chunk"); continue;
/*  637 */         }  if (ar.name != null) {
/*  638 */           sb.append("function '");
/*  639 */           sb.append(ar.name);
/*  640 */           sb.append('\''); continue;
/*      */         } 
/*  642 */         sb.append("function <");
/*  643 */         sb.append(c.shortsource());
/*  644 */         sb.append(':');
/*  645 */         sb.append(c.linedefined());
/*  646 */         sb.append('>');
/*      */       } 
/*      */       
/*  649 */       sb.append("\n\t[Java]: in ?");
/*  650 */       return sb.toString();
/*      */     }
/*      */     
/*      */     synchronized DebugLib.CallFrame getCallFrame(int level) {
/*  654 */       if (level < 1 || level > this.calls)
/*  655 */         return null; 
/*  656 */       return this.frame[this.calls - level];
/*      */     }
/*      */     
/*      */     synchronized DebugLib.CallFrame findCallFrame(LuaValue func) {
/*  660 */       for (int i = 1; i <= this.calls; i++) {
/*  661 */         if ((this.frame[this.calls - i]).f == func)
/*  662 */           return this.frame[i]; 
/*  663 */       }  return null;
/*      */     }
/*      */     
/*      */     synchronized DebugLib.DebugInfo auxgetinfo(String what, LuaFunction f, DebugLib.CallFrame ci) {
/*  667 */       DebugLib.DebugInfo ar = new DebugLib.DebugInfo();
/*  668 */       for (int i = 0, n = what.length(); i < n; i++) {
/*  669 */         switch (what.charAt(i)) {
/*      */           case 'S':
/*  671 */             ar.funcinfo(f);
/*      */             break;
/*      */           case 'l':
/*  674 */             ar.currentline = (ci != null && ci.f.isclosure()) ? ci.currentline() : -1;
/*      */             break;
/*      */           case 'u':
/*  677 */             if (f != null && f.isclosure()) {
/*  678 */               Prototype p = (f.checkclosure()).p;
/*  679 */               ar.nups = (short)p.upvalues.length;
/*  680 */               ar.nparams = (short)p.numparams;
/*  681 */               ar.isvararg = (p.is_vararg != 0); break;
/*      */             } 
/*  683 */             ar.nups = 0;
/*  684 */             ar.isvararg = true;
/*  685 */             ar.nparams = 0;
/*      */             break;
/*      */           
/*      */           case 't':
/*  689 */             ar.istailcall = false;
/*      */             break;
/*      */           
/*      */           case 'n':
/*  693 */             if (ci != null && ci.previous != null && 
/*  694 */               ci.previous.f.isclosure()) {
/*  695 */               DebugLib.NameWhat nw = DebugLib.getfuncname(ci.previous);
/*  696 */               if (nw != null) {
/*  697 */                 ar.name = nw.name;
/*  698 */                 ar.namewhat = nw.namewhat;
/*      */               } 
/*      */             } 
/*      */             
/*  702 */             if (ar.namewhat == null) {
/*  703 */               ar.namewhat = "";
/*  704 */               ar.name = null;
/*      */             } 
/*      */             break;
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       } 
/*  716 */       return ar;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class CallFrame
/*      */   {
/*      */     public CallFrame() {
/*  728 */       this.stack = EMPTY;
/*      */     }
/*      */     static final LuaValue[] EMPTY = new LuaValue[0]; LuaFunction f; int pc;
/*      */     void set(LuaClosure function, Varargs varargs, LuaValue[] stack) {
/*  732 */       this.f = (LuaFunction)function;
/*  733 */       this.v = varargs;
/*  734 */       this.stack = stack;
/*      */     }
/*      */     int top; Varargs v; LuaValue[] stack; CallFrame previous;
/*      */     public String shortsource() {
/*  738 */       return this.f.isclosure() ? (this.f.checkclosure()).p.shortsource() : "[Java]";
/*      */     }
/*      */     
/*      */     void set(LuaFunction function) {
/*  742 */       this.f = function;
/*      */     }
/*      */     
/*      */     void reset() {
/*  746 */       this.f = null;
/*  747 */       this.v = null;
/*  748 */       this.stack = EMPTY;
/*      */     }
/*      */     
/*      */     void instr(int pc, Varargs v, int top) {
/*  752 */       this.pc = pc;
/*  753 */       this.v = v;
/*  754 */       this.top = top;
/*  755 */       if (DebugLib.TRACE)
/*  756 */         Print.printState(this.f.checkclosure(), pc, this.stack, top, v); 
/*      */     }
/*      */     
/*      */     Varargs getLocal(int i) {
/*  760 */       LuaString name = getlocalname(i);
/*  761 */       if (i >= 1 && i <= this.stack.length && this.stack[i - 1] != null) {
/*  762 */         return LuaValue.varargsOf((name == null) ? LuaValue.NIL : (LuaValue)name, (Varargs)this.stack[i - 1]);
/*      */       }
/*  764 */       return (Varargs)LuaValue.NIL;
/*      */     }
/*      */     
/*      */     Varargs setLocal(int i, LuaValue value) {
/*  768 */       LuaString name = getlocalname(i);
/*  769 */       if (i >= 1 && i <= this.stack.length && this.stack[i - 1] != null) {
/*  770 */         this.stack[i - 1] = value;
/*  771 */         return (name == null) ? (Varargs)LuaValue.NIL : (Varargs)name;
/*      */       } 
/*  773 */       return (Varargs)LuaValue.NIL;
/*      */     }
/*      */ 
/*      */     
/*      */     public int currentline() {
/*  778 */       if (!this.f.isclosure())
/*  779 */         return -1; 
/*  780 */       int[] li = (this.f.checkclosure()).p.lineinfo;
/*  781 */       return (li == null || this.pc < 0 || this.pc >= li.length) ? -1 : li[this.pc];
/*      */     }
/*      */     
/*      */     String sourceline() {
/*  785 */       if (!this.f.isclosure())
/*  786 */         return this.f.tojstring(); 
/*  787 */       return (this.f.checkclosure()).p.shortsource() + ":" + currentline();
/*      */     }
/*      */     
/*      */     int linedefined() {
/*  791 */       return this.f.isclosure() ? (this.f.checkclosure()).p.linedefined : -1;
/*      */     }
/*      */     
/*      */     LuaString getlocalname(int index) {
/*  795 */       if (!this.f.isclosure())
/*  796 */         return null; 
/*  797 */       return (this.f.checkclosure()).p.getlocalname(index, this.pc);
/*      */     }
/*      */   }
/*      */   
/*      */   static LuaString findupvalue(LuaClosure c, int up) {
/*  802 */     if (c.upValues != null && up > 0 && up <= c.upValues.length) {
/*  803 */       if (c.p.upvalues != null && up <= c.p.upvalues.length) {
/*  804 */         return (c.p.upvalues[up - 1]).name;
/*      */       }
/*  806 */       return LuaString.valueOf("." + up);
/*      */     } 
/*  808 */     return null;
/*      */   }
/*      */   
/*      */   static void lua_assert(boolean x) {
/*  812 */     if (!x)
/*  813 */       throw new RuntimeException("lua_assert failed"); 
/*      */   }
/*      */   
/*      */   static class NameWhat {
/*      */     final String name;
/*      */     final String namewhat;
/*      */     
/*      */     NameWhat(String name, String namewhat) {
/*  821 */       this.name = name;
/*  822 */       this.namewhat = namewhat;
/*      */     }
/*      */   }
/*      */   
/*      */   static NameWhat getfuncname(CallFrame frame) {
/*      */     LuaString tm;
/*  828 */     if (!frame.f.isclosure())
/*  829 */       return new NameWhat(frame.f.classnamestub(), "Java"); 
/*  830 */     Prototype p = (frame.f.checkclosure()).p;
/*  831 */     int pc = frame.pc;
/*  832 */     int i = p.code[pc];
/*      */     
/*  834 */     switch (Lua.GET_OPCODE(i)) {
/*      */       case 29:
/*      */       case 30:
/*  837 */         return getobjname(p, pc, Lua.GETARG_A(i));
/*      */       case 34:
/*  839 */         return new NameWhat("(for iterator)", "(for iterator");
/*      */       
/*      */       case 6:
/*      */       case 7:
/*      */       case 12:
/*  844 */         tm = LuaValue.INDEX;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  889 */         return new NameWhat(tm.tojstring(), "metamethod");case 8: case 10: tm = LuaValue.NEWINDEX; return new NameWhat(tm.tojstring(), "metamethod");case 24: tm = LuaValue.EQ; return new NameWhat(tm.tojstring(), "metamethod");case 13: tm = LuaValue.ADD; return new NameWhat(tm.tojstring(), "metamethod");case 14: tm = LuaValue.SUB; return new NameWhat(tm.tojstring(), "metamethod");case 15: tm = LuaValue.MUL; return new NameWhat(tm.tojstring(), "metamethod");case 16: tm = LuaValue.DIV; return new NameWhat(tm.tojstring(), "metamethod");case 17: tm = LuaValue.MOD; return new NameWhat(tm.tojstring(), "metamethod");case 18: tm = LuaValue.POW; return new NameWhat(tm.tojstring(), "metamethod");case 19: tm = LuaValue.UNM; return new NameWhat(tm.tojstring(), "metamethod");case 21: tm = LuaValue.LEN; return new NameWhat(tm.tojstring(), "metamethod");case 25: tm = LuaValue.LT; return new NameWhat(tm.tojstring(), "metamethod");case 26: tm = LuaValue.LE; return new NameWhat(tm.tojstring(), "metamethod");case 22: tm = LuaValue.CONCAT; return new NameWhat(tm.tojstring(), "metamethod");
/*      */     } 
/*      */     return null;
/*      */   }
/*      */   public static NameWhat getobjname(Prototype p, int lastpc, int reg) {
/*  894 */     int pc = lastpc;
/*  895 */     LuaString name = p.getlocalname(reg + 1, pc);
/*  896 */     if (name != null) {
/*  897 */       return new NameWhat(name.tojstring(), "local");
/*      */     }
/*      */     
/*  900 */     pc = findsetreg(p, lastpc, reg);
/*  901 */     if (pc != -1) {
/*  902 */       int a, j, u, b, k, m, t; String jname; LuaString vn; String str1; int i = p.code[pc];
/*  903 */       switch (Lua.GET_OPCODE(i)) {
/*      */         case 0:
/*  905 */           a = Lua.GETARG_A(i);
/*  906 */           m = Lua.GETARG_B(i);
/*  907 */           if (m < a) {
/*  908 */             return getobjname(p, pc, m);
/*      */           }
/*      */           break;
/*      */         case 6:
/*      */         case 7:
/*  913 */           j = Lua.GETARG_C(i);
/*  914 */           t = Lua.GETARG_B(i);
/*      */ 
/*      */           
/*  917 */           vn = (Lua.GET_OPCODE(i) == 7) ? p.getlocalname(t + 1, pc) : ((t < p.upvalues.length) ? (p.upvalues[t]).name : QMARK);
/*  918 */           str1 = kname(p, pc, j);
/*  919 */           return new NameWhat(str1, (vn != null && vn.eq_b((LuaValue)ENV)) ? "global" : "field");
/*      */         
/*      */         case 5:
/*  922 */           u = Lua.GETARG_B(i);
/*  923 */           name = (u < p.upvalues.length) ? (p.upvalues[u]).name : QMARK;
/*  924 */           return (name == null) ? null : new NameWhat(name.tojstring(), "upvalue");
/*      */         
/*      */         case 1:
/*      */         case 2:
/*  928 */           b = (Lua.GET_OPCODE(i) == 1) ? Lua.GETARG_Bx(i) : Lua.GETARG_Ax(p.code[pc + 1]);
/*  929 */           if (p.k[b].isstring()) {
/*  930 */             name = p.k[b].strvalue();
/*  931 */             return new NameWhat(name.tojstring(), "constant");
/*      */           } 
/*      */           break;
/*      */         
/*      */         case 12:
/*  936 */           k = Lua.GETARG_C(i);
/*  937 */           jname = kname(p, pc, k);
/*  938 */           return new NameWhat(jname, "method");
/*      */       } 
/*      */ 
/*      */ 
/*      */     
/*      */     } 
/*  944 */     return null;
/*      */   }
/*      */   
/*      */   static String kname(Prototype p, int pc, int c) {
/*  948 */     if (Lua.ISK(c)) {
/*  949 */       LuaValue k = p.k[Lua.INDEXK(c)];
/*  950 */       if (k.isstring()) {
/*  951 */         return k.tojstring();
/*      */       }
/*      */     } else {
/*  954 */       NameWhat what = getobjname(p, pc, c);
/*  955 */       if (what != null && "constant".equals(what.namewhat)) {
/*  956 */         return what.name;
/*      */       }
/*      */     } 
/*      */     
/*  960 */     return "?";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static int findsetreg(Prototype p, int lastpc, int reg) {
/*  968 */     int setreg = -1;
/*  969 */     for (int pc = 0; pc < lastpc; pc++) {
/*  970 */       int b, dest, i = p.code[pc];
/*  971 */       int op = Lua.GET_OPCODE(i);
/*  972 */       int a = Lua.GETARG_A(i);
/*  973 */       switch (op) {
/*      */         case 4:
/*  975 */           b = Lua.GETARG_B(i);
/*  976 */           if (a <= reg && reg <= a + b) {
/*  977 */             setreg = pc;
/*      */           }
/*      */           break;
/*      */         case 34:
/*  981 */           if (reg >= a + 2) {
/*  982 */             setreg = pc;
/*      */           }
/*      */           break;
/*      */         case 29:
/*      */         case 30:
/*  987 */           if (reg >= a) {
/*  988 */             setreg = pc;
/*      */           }
/*      */           break;
/*      */         case 23:
/*  992 */           b = Lua.GETARG_sBx(i);
/*  993 */           dest = pc + 1 + b;
/*      */           
/*  995 */           if (pc < dest && dest <= lastpc) {
/*  996 */             pc += b;
/*      */           }
/*      */           break;
/*      */         case 27:
/* 1000 */           if (reg == a) {
/* 1001 */             setreg = pc;
/*      */           }
/*      */           break;
/*      */         case 36:
/* 1005 */           if ((i >> 14 & 0x1FF) == 0) {
/* 1006 */             pc++;
/*      */           }
/*      */           break;
/*      */         default:
/* 1010 */           if (Lua.testAMode(op) && reg == a)
/* 1011 */             setreg = pc; 
/*      */           break;
/*      */       } 
/*      */     } 
/* 1015 */     return setreg;
/*      */   }
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\DebugLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */