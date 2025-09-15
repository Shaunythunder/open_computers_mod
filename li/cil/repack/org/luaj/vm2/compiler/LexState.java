/*      */ package li.cil.repack.org.luaj.vm2.compiler;
/*      */ 
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.util.Hashtable;
/*      */ import li.cil.repack.org.luaj.vm2.LocVars;
/*      */ import li.cil.repack.org.luaj.vm2.Lua;
/*      */ import li.cil.repack.org.luaj.vm2.LuaError;
/*      */ import li.cil.repack.org.luaj.vm2.LuaInteger;
/*      */ import li.cil.repack.org.luaj.vm2.LuaString;
/*      */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*      */ import li.cil.repack.org.luaj.vm2.Prototype;
/*      */ import li.cil.repack.org.luaj.vm2.lib.MathLib;
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
/*      */ public class LexState
/*      */   extends Constants
/*      */ {
/*      */   protected static final String RESERVED_LOCAL_VAR_FOR_CONTROL = "(for control)";
/*      */   protected static final String RESERVED_LOCAL_VAR_FOR_STATE = "(for state)";
/*      */   protected static final String RESERVED_LOCAL_VAR_FOR_GENERATOR = "(for generator)";
/*      */   protected static final String RESERVED_LOCAL_VAR_FOR_STEP = "(for step)";
/*      */   protected static final String RESERVED_LOCAL_VAR_FOR_LIMIT = "(for limit)";
/*      */   protected static final String RESERVED_LOCAL_VAR_FOR_INDEX = "(for index)";
/*   48 */   protected static final String[] RESERVED_LOCAL_VAR_KEYWORDS = new String[] { "(for control)", "(for generator)", "(for index)", "(for limit)", "(for state)", "(for step)" }; private static final int EOZ = -1; private static final int MAX_INT = 2147483645; private static final int UCHAR_MAX = 255; private static final int LUAI_MAXCCALLS = 200; private static final int LUA_COMPAT_LSTR = 1; private static final boolean LUA_COMPAT_VARARG = true; static final int NO_JUMP = -1; static final int OPR_ADD = 0; static final int OPR_SUB = 1;
/*      */   static final int OPR_MUL = 2;
/*      */   static final int OPR_DIV = 3;
/*   51 */   private static final Hashtable RESERVED_LOCAL_VAR_KEYWORDS_TABLE = new Hashtable<>(); static final int OPR_MOD = 4; static final int OPR_POW = 5; static final int OPR_CONCAT = 6; static final int OPR_NE = 7; static final int OPR_EQ = 8; static final int OPR_LT = 9; static final int OPR_LE = 10; static final int OPR_GT = 11; static final int OPR_GE = 12; static final int OPR_AND = 13; static final int OPR_OR = 14;
/*      */   static {
/*   53 */     for (String element : RESERVED_LOCAL_VAR_KEYWORDS)
/*   54 */       RESERVED_LOCAL_VAR_KEYWORDS_TABLE.put(element, Boolean.TRUE); 
/*      */   }
/*      */   static final int OPR_NOBINOPR = 15; static final int OPR_MINUS = 0; static final int OPR_NOT = 1; static final int OPR_LEN = 2; static final int OPR_NOUNOPR = 3; static final int VVOID = 0; static final int VNIL = 1; static final int VTRUE = 2;
/*      */   static final int VFALSE = 3;
/*      */   static final int VK = 4;
/*      */   static final int VKNUM = 5;
/*      */   
/*      */   private static final String LUA_QS(String s) {
/*   62 */     return "'" + s + "'";
/*      */   } static final int VNONRELOC = 6; static final int VLOCAL = 7; static final int VUPVAL = 8; static final int VINDEXED = 9; static final int VJMP = 10; static final int VRELOCABLE = 11; static final int VCALL = 12; static final int VVARARG = 13; int current; int linenumber; int lastline; private static final String LUA_QL(Object o) {
/*   64 */     return LUA_QS(String.valueOf(o));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isReservedKeyword(String varName) {
/*   70 */     return RESERVED_LOCAL_VAR_KEYWORDS_TABLE.containsKey(varName);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class SemInfo
/*      */   {
/*      */     LuaValue r;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     LuaString ts;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private SemInfo() {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class Token
/*      */   {
/*      */     int token;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  109 */     final LexState.SemInfo seminfo = new LexState.SemInfo();
/*      */     
/*      */     public void set(Token other) {
/*  112 */       this.token = other.token;
/*  113 */       this.seminfo.r = other.seminfo.r;
/*  114 */       this.seminfo.ts = other.seminfo.ts;
/*      */     }
/*      */ 
/*      */     
/*      */     private Token() {}
/*      */   }
/*      */   
/*  121 */   final Token t = new Token();
/*  122 */   final Token lookahead = new Token();
/*      */   FuncState fs;
/*      */   LuaC.CompileState L;
/*      */   InputStream z;
/*      */   char[] buff;
/*      */   int nbuff;
/*  128 */   Dyndata dyd = new Dyndata();
/*      */   
/*      */   LuaString source;
/*      */   
/*      */   LuaString envn;
/*      */   byte decpoint;
/*  134 */   static final String[] luaX_tokens = new String[] { "and", "break", "do", "else", "elseif", "end", "false", "for", "function", "goto", "if", "in", "local", "nil", "not", "or", "repeat", "return", "then", "true", "until", "while", "..", "...", "==", ">=", "<=", "~=", "::", "<eof>", "<number>", "<name>", "<string>" }; static final int TK_AND = 257; static final int TK_BREAK = 258; static final int TK_DO = 259; static final int TK_ELSE = 260; static final int TK_ELSEIF = 261; static final int TK_END = 262; static final int TK_FALSE = 263; static final int TK_FOR = 264; static final int TK_FUNCTION = 265; static final int TK_GOTO = 266; static final int TK_IF = 267; static final int TK_IN = 268; static final int TK_LOCAL = 269; static final int TK_NIL = 270;
/*      */   static final int TK_NOT = 271;
/*      */   static final int TK_OR = 272;
/*      */   static final int TK_REPEAT = 273;
/*      */   static final int TK_RETURN = 274;
/*      */   static final int TK_THEN = 275;
/*      */   static final int TK_TRUE = 276;
/*      */   static final int TK_UNTIL = 277;
/*      */   static final int TK_WHILE = 278;
/*      */   static final int TK_CONCAT = 279;
/*      */   static final int TK_DOTS = 280;
/*      */   static final int TK_EQ = 281;
/*      */   static final int TK_GE = 282;
/*      */   static final int TK_LE = 283;
/*      */   static final int TK_NE = 284;
/*      */   static final int TK_DBCOLON = 285;
/*      */   static final int TK_EOF = 286;
/*      */   static final int TK_NUMBER = 287;
/*      */   static final int TK_NAME = 288;
/*      */   static final int TK_STRING = 289;
/*      */   static final int FIRST_RESERVED = 257;
/*      */   static final int NUM_RESERVED = 22;
/*  156 */   static final Hashtable RESERVED = new Hashtable<>();
/*      */   static {
/*  158 */     for (int i = 0; i < 22; i++) {
/*  159 */       LuaString ts = LuaValue.valueOf(luaX_tokens[i]);
/*  160 */       RESERVED.put(ts, Integer.valueOf(257 + i));
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean isalnum(int c) {
/*  165 */     return ((c >= 48 && c <= 57) || (c >= 97 && c <= 122) || (c >= 65 && c <= 90) || c == 95);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean isalpha(int c) {
/*  170 */     return ((c >= 97 && c <= 122) || (c >= 65 && c <= 90));
/*      */   }
/*      */   
/*      */   private boolean isdigit(int c) {
/*  174 */     return (c >= 48 && c <= 57);
/*      */   }
/*      */   
/*      */   private boolean isxdigit(int c) {
/*  178 */     return ((c >= 48 && c <= 57) || (c >= 97 && c <= 102) || (c >= 65 && c <= 70));
/*      */   }
/*      */   
/*      */   private boolean isspace(int c) {
/*  182 */     return (c >= 0 && c <= 32);
/*      */   }
/*      */   
/*      */   public LexState(LuaC.CompileState state, InputStream stream) {
/*  186 */     this.z = stream;
/*  187 */     this.buff = new char[32];
/*  188 */     this.L = state;
/*      */   }
/*      */   
/*      */   void nextChar() {
/*      */     try {
/*  193 */       this.current = this.z.read();
/*  194 */     } catch (IOException e) {
/*  195 */       e.printStackTrace();
/*  196 */       this.current = -1;
/*      */     } 
/*      */   }
/*      */   
/*      */   boolean currIsNewline() {
/*  201 */     return (this.current == 10 || this.current == 13);
/*      */   }
/*      */   
/*      */   void save_and_next() {
/*  205 */     save(this.current);
/*  206 */     nextChar();
/*      */   }
/*      */   
/*      */   void save(int c) {
/*  210 */     if (this.buff == null || this.nbuff + 1 > this.buff.length)
/*  211 */       this.buff = realloc(this.buff, this.nbuff * 2 + 1); 
/*  212 */     this.buff[this.nbuff++] = (char)c;
/*      */   }
/*      */   
/*      */   String token2str(int token) {
/*  216 */     if (token < 257) {
/*  217 */       return iscntrl(token) ? this.L.pushfstring("char(" + token + ")") : this.L.pushfstring(String.valueOf((char)token));
/*      */     }
/*  219 */     return luaX_tokens[token - 257];
/*      */   }
/*      */ 
/*      */   
/*      */   private static boolean iscntrl(int token) {
/*  224 */     return (token < 32);
/*      */   }
/*      */   
/*      */   String txtToken(int token) {
/*  228 */     switch (token) {
/*      */       case 287:
/*      */       case 288:
/*      */       case 289:
/*  232 */         return new String(this.buff, 0, this.nbuff);
/*      */     } 
/*  234 */     return token2str(token);
/*      */   }
/*      */ 
/*      */   
/*      */   void lexerror(String msg, int token) {
/*  239 */     String cid = Lua.chunkid(this.source.tojstring());
/*  240 */     this.L.pushfstring(cid + ":" + this.linenumber + ": " + msg);
/*  241 */     if (token != 0)
/*  242 */       this.L.pushfstring("syntax error: " + msg + " near " + txtToken(token)); 
/*  243 */     throw new LuaError(cid + ":" + this.linenumber + ": " + msg);
/*      */   }
/*      */   
/*      */   void syntaxerror(String msg) {
/*  247 */     lexerror(msg, this.t.token);
/*      */   }
/*      */ 
/*      */   
/*      */   LuaString newstring(String s) {
/*  252 */     return this.L.newTString(s);
/*      */   }
/*      */   
/*      */   LuaString newstring(char[] chars, int offset, int len) {
/*  256 */     return this.L.newTString(new String(chars, offset, len));
/*      */   }
/*      */   
/*      */   void inclinenumber() {
/*  260 */     int old = this.current;
/*  261 */     _assert(currIsNewline());
/*  262 */     nextChar();
/*  263 */     if (currIsNewline() && this.current != old)
/*  264 */       nextChar(); 
/*  265 */     if (++this.linenumber >= 2147483645)
/*  266 */       syntaxerror("chunk has too many lines"); 
/*      */   }
/*      */   
/*      */   void setinput(LuaC.CompileState L, int firstByte, InputStream z, LuaString source) {
/*  270 */     this.decpoint = 46;
/*  271 */     this.L = L;
/*  272 */     this.lookahead.token = 286;
/*  273 */     this.z = z;
/*  274 */     this.fs = null;
/*  275 */     this.linenumber = 1;
/*  276 */     this.lastline = 1;
/*  277 */     this.source = source;
/*  278 */     this.envn = LuaValue.ENV;
/*  279 */     this.nbuff = 0;
/*  280 */     this.current = firstByte;
/*  281 */     skipShebang();
/*      */   }
/*      */   
/*      */   private void skipShebang() {
/*  285 */     if (this.current == 35) {
/*  286 */       while (!currIsNewline() && this.current != -1) {
/*  287 */         nextChar();
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean check_next(String set) {
/*  297 */     if (set.indexOf(this.current) < 0)
/*  298 */       return false; 
/*  299 */     save_and_next();
/*  300 */     return true;
/*      */   }
/*      */   
/*      */   void buffreplace(char from, char to) {
/*  304 */     int n = this.nbuff;
/*  305 */     char[] p = this.buff;
/*  306 */     while (--n >= 0) {
/*  307 */       if (p[n] == from)
/*  308 */         p[n] = to; 
/*      */     } 
/*      */   }
/*      */   LuaValue strx2number(String str, SemInfo seminfo) {
/*  312 */     char[] c = str.toCharArray();
/*  313 */     int s = 0;
/*  314 */     while (s < c.length && isspace(c[s])) {
/*  315 */       s++;
/*      */     }
/*  317 */     double sgn = 1.0D;
/*  318 */     if (s < c.length && c[s] == '-') {
/*  319 */       sgn = -1.0D;
/*  320 */       s++;
/*      */     } 
/*      */     
/*  323 */     if (s + 2 >= c.length || c[s++] != '0' || (c[s] != 'x' && c[s] != 'X'))
/*  324 */       return (LuaValue)LuaValue.ZERO; 
/*  325 */     s++;
/*      */ 
/*      */     
/*  328 */     double m = 0.0D;
/*  329 */     int e = 0;
/*  330 */     while (s < c.length && isxdigit(c[s]))
/*  331 */       m = m * 16.0D + hexvalue(c[s++]); 
/*  332 */     if (s < c.length && c[s] == '.') {
/*  333 */       s++;
/*  334 */       while (s < c.length && isxdigit(c[s])) {
/*  335 */         m = m * 16.0D + hexvalue(c[s++]);
/*  336 */         e -= 4;
/*      */       } 
/*      */     } 
/*  339 */     if (s < c.length && (c[s] == 'p' || c[s] == 'P')) {
/*  340 */       s++;
/*  341 */       int exp1 = 0;
/*  342 */       boolean neg1 = false;
/*  343 */       if (s < c.length && c[s] == '-') {
/*  344 */         neg1 = true;
/*  345 */         s++;
/*      */       } 
/*  347 */       while (s < c.length && isdigit(c[s]))
/*  348 */         exp1 = exp1 * 10 + c[s++] - 48; 
/*  349 */       if (neg1)
/*  350 */         exp1 = -exp1; 
/*  351 */       e += exp1;
/*      */     } 
/*  353 */     return (LuaValue)LuaValue.valueOf(sgn * m * MathLib.dpow_d(2.0D, e));
/*      */   }
/*      */   
/*      */   boolean str2d(String str, SemInfo seminfo) {
/*  357 */     if (str.indexOf('n') >= 0 || str.indexOf('N') >= 0) {
/*  358 */       seminfo.r = (LuaValue)LuaValue.ZERO;
/*  359 */     } else if (str.indexOf('x') >= 0 || str.indexOf('X') >= 0) {
/*  360 */       seminfo.r = strx2number(str, seminfo);
/*      */     } else {
/*      */       try {
/*  363 */         seminfo.r = (LuaValue)LuaValue.valueOf(Double.parseDouble(str.trim()));
/*  364 */       } catch (NumberFormatException e) {
/*  365 */         lexerror("malformed number (" + e.getMessage() + ")", 287);
/*      */       } 
/*      */     } 
/*  368 */     return true;
/*      */   }
/*      */   
/*      */   void read_numeral(SemInfo seminfo) {
/*  372 */     String expo = "Ee";
/*  373 */     int first = this.current;
/*  374 */     _assert(isdigit(this.current));
/*  375 */     save_and_next();
/*  376 */     if (first == 48 && check_next("Xx"))
/*  377 */       expo = "Pp"; 
/*      */     while (true) {
/*  379 */       if (check_next(expo))
/*  380 */         check_next("+-"); 
/*  381 */       if (isxdigit(this.current) || this.current == 46) {
/*  382 */         save_and_next(); continue;
/*      */       } 
/*      */       break;
/*      */     } 
/*  386 */     String str = new String(this.buff, 0, this.nbuff);
/*  387 */     str2d(str, seminfo);
/*      */   }
/*      */   
/*      */   int skip_sep() {
/*  391 */     int count = 0;
/*  392 */     int s = this.current;
/*  393 */     _assert((s == 91 || s == 93));
/*  394 */     save_and_next();
/*  395 */     while (this.current == 61) {
/*  396 */       save_and_next();
/*  397 */       count++;
/*      */     } 
/*  399 */     return (this.current == s) ? count : (-count - 1);
/*      */   }
/*      */   
/*      */   void read_long_string(SemInfo seminfo, int sep) {
/*  403 */     int cont = 0;
/*  404 */     save_and_next();
/*  405 */     if (currIsNewline())
/*  406 */       inclinenumber(); 
/*  407 */     for (boolean endloop = false; !endloop; ) {
/*  408 */       switch (this.current) {
/*      */         case -1:
/*  410 */           lexerror((seminfo != null) ? "unfinished long string" : 
/*  411 */               "unfinished long comment", 286);
/*      */           continue;
/*      */         case 91:
/*  414 */           if (skip_sep() == sep) {
/*  415 */             save_and_next();
/*  416 */             cont++;
/*      */             
/*  418 */             if (sep == 0) {
/*  419 */               lexerror("nesting of [[...]] is deprecated", 91);
/*      */             }
/*      */           } 
/*      */           continue;
/*      */         
/*      */         case 93:
/*  425 */           if (skip_sep() == sep) {
/*  426 */             save_and_next();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  432 */             endloop = true;
/*      */           } 
/*      */           continue;
/*      */         
/*      */         case 10:
/*      */         case 13:
/*  438 */           save(10);
/*  439 */           inclinenumber();
/*  440 */           if (seminfo == null) {
/*  441 */             this.nbuff = 0;
/*      */           }
/*      */           continue;
/*      */       } 
/*  445 */       if (seminfo != null) {
/*  446 */         save_and_next(); continue;
/*      */       } 
/*  448 */       nextChar();
/*      */     } 
/*      */ 
/*      */     
/*  452 */     if (seminfo != null)
/*  453 */       seminfo.ts = this.L.newTString(LuaString.valueOf(this.buff, 2 + sep, this.nbuff - 2 * (2 + sep))); 
/*      */   }
/*      */   
/*      */   int hexvalue(int c) {
/*  457 */     return (c <= 57) ? (c - 48) : ((c <= 70) ? (c + 10 - 65) : (c + 10 - 97));
/*      */   }
/*      */   
/*      */   int readhexaesc() {
/*  461 */     nextChar();
/*  462 */     int c1 = this.current;
/*  463 */     nextChar();
/*  464 */     int c2 = this.current;
/*  465 */     if (!isxdigit(c1) || !isxdigit(c2))
/*  466 */       lexerror("hexadecimal digit expected 'x" + (char)c1 + (char)c2, 289); 
/*  467 */     return (hexvalue(c1) << 4) + hexvalue(c2);
/*      */   }
/*      */   
/*      */   void read_string(int del, SemInfo seminfo) {
/*  471 */     save_and_next();
/*  472 */     while (this.current != del) {
/*  473 */       int c, i; switch (this.current) {
/*      */         case -1:
/*  475 */           lexerror("unfinished string", 286);
/*      */           continue;
/*      */         case 10:
/*      */         case 13:
/*  479 */           lexerror("unfinished string", 289);
/*      */           continue;
/*      */         
/*      */         case 92:
/*  483 */           nextChar();
/*  484 */           switch (this.current) {
/*      */             case 97:
/*  486 */               c = 7;
/*      */               break;
/*      */             case 98:
/*  489 */               c = 8;
/*      */               break;
/*      */             case 102:
/*  492 */               c = 12;
/*      */               break;
/*      */             case 110:
/*  495 */               c = 10;
/*      */               break;
/*      */             case 114:
/*  498 */               c = 13;
/*      */               break;
/*      */             case 116:
/*  501 */               c = 9;
/*      */               break;
/*      */             case 118:
/*  504 */               c = 11;
/*      */               break;
/*      */             case 120:
/*  507 */               c = readhexaesc();
/*      */               break;
/*      */             case 10:
/*      */             case 13:
/*  511 */               save(10);
/*  512 */               inclinenumber();
/*      */               continue;
/*      */             case -1:
/*      */               continue;
/*      */             case 122:
/*  517 */               nextChar();
/*  518 */               while (isspace(this.current)) {
/*  519 */                 if (currIsNewline()) {
/*  520 */                   inclinenumber(); continue;
/*      */                 } 
/*  522 */                 nextChar();
/*      */               } 
/*      */               continue;
/*      */             
/*      */             default:
/*  527 */               if (!isdigit(this.current)) {
/*  528 */                 save_and_next(); continue;
/*      */               } 
/*  530 */               i = 0;
/*  531 */               c = 0;
/*      */               do {
/*  533 */                 c = 10 * c + this.current - 48;
/*  534 */                 nextChar();
/*  535 */               } while (++i < 3 && isdigit(this.current));
/*  536 */               if (c > 255)
/*  537 */                 lexerror("escape sequence too large", 289); 
/*  538 */               save(c);
/*      */               continue;
/*      */           } 
/*      */ 
/*      */           
/*  543 */           save(c);
/*  544 */           nextChar();
/*      */           continue;
/*      */       } 
/*      */       
/*  548 */       save_and_next();
/*      */     } 
/*      */     
/*  551 */     save_and_next();
/*  552 */     seminfo.ts = this.L.newTString(LuaString.valueOf(this.buff, 1, this.nbuff - 2));
/*      */   }
/*      */   
/*      */   int llex(SemInfo seminfo) {
/*  556 */     this.nbuff = 0; while (true) {
/*      */       int sep;
/*  558 */       switch (this.current) {
/*      */         case 10:
/*      */         case 13:
/*  561 */           inclinenumber();
/*      */           continue;
/*      */         
/*      */         case 9:
/*      */         case 11:
/*      */         case 12:
/*      */         case 32:
/*  568 */           nextChar();
/*      */           continue;
/*      */         
/*      */         case 45:
/*  572 */           nextChar();
/*  573 */           if (this.current != 45) {
/*  574 */             return 45;
/*      */           }
/*  576 */           nextChar();
/*  577 */           if (this.current == 91) {
/*  578 */             int i = skip_sep();
/*  579 */             this.nbuff = 0;
/*  580 */             if (i >= 0) {
/*  581 */               read_long_string((SemInfo)null, i);
/*  582 */               this.nbuff = 0;
/*      */               
/*      */               continue;
/*      */             } 
/*      */           } 
/*  587 */           while (!currIsNewline() && this.current != -1) {
/*  588 */             nextChar();
/*      */           }
/*      */           continue;
/*      */         case 91:
/*  592 */           sep = skip_sep();
/*  593 */           if (sep >= 0) {
/*  594 */             read_long_string(seminfo, sep);
/*  595 */             return 289;
/*  596 */           }  if (sep == -1) {
/*  597 */             return 91;
/*      */           }
/*  599 */           lexerror("invalid long string delimiter", 289);
/*      */ 
/*      */           
/*  602 */           nextChar();
/*  603 */           if (this.current != 61) {
/*  604 */             return 61;
/*      */           }
/*  606 */           nextChar();
/*  607 */           return 281;
/*      */         case 61:
/*      */           continue;
/*      */         case 60:
/*  611 */           nextChar();
/*  612 */           if (this.current != 61) {
/*  613 */             return 60;
/*      */           }
/*  615 */           nextChar();
/*  616 */           return 283;
/*      */ 
/*      */         
/*      */         case 62:
/*  620 */           nextChar();
/*  621 */           if (this.current != 61) {
/*  622 */             return 62;
/*      */           }
/*  624 */           nextChar();
/*  625 */           return 282;
/*      */ 
/*      */         
/*      */         case 126:
/*  629 */           nextChar();
/*  630 */           if (this.current != 61) {
/*  631 */             return 126;
/*      */           }
/*  633 */           nextChar();
/*  634 */           return 284;
/*      */ 
/*      */         
/*      */         case 58:
/*  638 */           nextChar();
/*  639 */           if (this.current != 58) {
/*  640 */             return 58;
/*      */           }
/*  642 */           nextChar();
/*  643 */           return 285;
/*      */ 
/*      */         
/*      */         case 34:
/*      */         case 39:
/*  648 */           read_string(this.current, seminfo);
/*  649 */           return 289;
/*      */         
/*      */         case 46:
/*  652 */           save_and_next();
/*  653 */           if (check_next(".")) {
/*  654 */             if (check_next(".")) {
/*  655 */               return 280;
/*      */             }
/*  657 */             return 279;
/*  658 */           }  if (!isdigit(this.current)) {
/*  659 */             return 46;
/*      */           }
/*  661 */           read_numeral(seminfo);
/*  662 */           return 287;
/*      */         case 48: case 49: case 50: case 51: case 52: case 53: case 54:
/*      */         case 55:
/*      */         case 56:
/*      */         case 57:
/*  667 */           read_numeral(seminfo);
/*  668 */           return 287;
/*      */         
/*      */         case -1:
/*  671 */           return 286;
/*      */       }  break;
/*      */     } 
/*  674 */     if (isalpha(this.current) || this.current == 95)
/*      */     {
/*      */       while (true) {
/*      */         
/*  678 */         save_and_next();
/*  679 */         if (!isalnum(this.current)) {
/*  680 */           LuaString ts = newstring(this.buff, 0, this.nbuff);
/*  681 */           if (RESERVED.containsKey(ts)) {
/*  682 */             return ((Integer)RESERVED.get(ts)).intValue();
/*      */           }
/*  684 */           seminfo.ts = ts;
/*  685 */           return 288;
/*      */         } 
/*      */       }  } 
/*  688 */     int c = this.current;
/*  689 */     nextChar();
/*  690 */     return c;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void next() {
/*  698 */     this.lastline = this.linenumber;
/*  699 */     if (this.lookahead.token != 286) {
/*  700 */       this.t.set(this.lookahead);
/*  701 */       this.lookahead.token = 286;
/*      */     } else {
/*  703 */       this.t.token = llex(this.t.seminfo);
/*      */     } 
/*      */   }
/*      */   void lookahead() {
/*  707 */     _assert((this.lookahead.token == 286));
/*  708 */     this.lookahead.token = llex(this.lookahead.seminfo);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final boolean vkisvar(int k) {
/*  720 */     return (7 <= k && k <= 9);
/*      */   }
/*      */   
/*      */   static final boolean vkisinreg(int k) {
/*  724 */     return (k == 6 || k == 7);
/*      */   }
/*      */   
/*      */   static class expdesc { int k;
/*      */     
/*      */     static class U {
/*      */       short ind_idx;
/*      */       short ind_t;
/*      */       short ind_vt;
/*      */       private LuaValue _nval;
/*      */       int info;
/*      */       
/*      */       public void setNval(LuaValue r) {
/*  737 */         this._nval = r;
/*      */       }
/*      */       public LuaValue nval() {
/*  740 */         return (this._nval == null) ? (LuaValue)LuaInteger.valueOf(this.info) : this._nval;
/*      */       }
/*      */     }
/*      */     
/*  744 */     final U u = new U();
/*  745 */     final IntPtr t = new IntPtr();
/*  746 */     final IntPtr f = new IntPtr();
/*      */     
/*      */     void init(int k, int i) {
/*  749 */       this.f.i = -1;
/*  750 */       this.t.i = -1;
/*  751 */       this.k = k;
/*  752 */       this.u.info = i;
/*      */     }
/*      */     
/*      */     boolean hasjumps() {
/*  756 */       return (this.t.i != this.f.i);
/*      */     }
/*      */     
/*      */     boolean isnumeral() {
/*  760 */       return (this.k == 5 && this.t.i == -1 && this.f.i == -1);
/*      */     }
/*      */     
/*      */     public void setvalue(expdesc other) {
/*  764 */       this.f.i = other.f.i;
/*  765 */       this.k = other.k;
/*  766 */       this.t.i = other.t.i;
/*  767 */       this.u._nval = other.u._nval;
/*  768 */       this.u.ind_idx = other.u.ind_idx;
/*  769 */       this.u.ind_t = other.u.ind_t;
/*  770 */       this.u.ind_vt = other.u.ind_vt;
/*  771 */       this.u.info = other.u.info;
/*      */     } } static class U { short ind_idx; short ind_t; short ind_vt; private LuaValue _nval; int info; public void setNval(LuaValue r) {
/*      */       this._nval = r;
/*      */     }
/*      */     public LuaValue nval() {
/*      */       return (this._nval == null) ? (LuaValue)LuaInteger.valueOf(this.info) : this._nval;
/*      */     } }
/*      */   static class Vardesc { final short idx;
/*      */     Vardesc(int idx) {
/*  780 */       this.idx = (short)idx;
/*      */     } }
/*      */ 
/*      */   
/*      */   static class Labeldesc
/*      */   {
/*      */     LuaString name;
/*      */     int pc;
/*      */     int line;
/*      */     short nactvar;
/*      */     
/*      */     public Labeldesc(LuaString name, int pc, int line, short nactvar) {
/*  792 */       this.name = name;
/*  793 */       this.pc = pc;
/*  794 */       this.line = line;
/*  795 */       this.nactvar = nactvar;
/*      */     } }
/*      */   static class Dyndata { LexState.Vardesc[] actvar; int n_actvar; LexState.Labeldesc[] gt; int n_gt;
/*      */     LexState.Labeldesc[] label;
/*      */     int n_label;
/*      */     
/*      */     Dyndata() {
/*  802 */       this.n_actvar = 0;
/*      */       
/*  804 */       this.n_gt = 0;
/*      */       
/*  806 */       this.n_label = 0;
/*      */     } }
/*      */   
/*      */   boolean hasmultret(int k) {
/*  810 */     return (k == 12 || k == 13);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void anchor_token() {
/*  819 */     _assert((this.fs != null || this.t.token == 286));
/*  820 */     if (this.t.token == 288 || this.t.token == 289) {
/*  821 */       LuaString ts = this.t.seminfo.ts;
/*      */       
/*  823 */       this.L.cachedLuaString(this.t.seminfo.ts);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   void semerror(String msg) {
/*  829 */     this.t.token = 0;
/*  830 */     syntaxerror(msg);
/*      */   }
/*      */   
/*      */   void error_expected(int token) {
/*  834 */     syntaxerror(this.L.pushfstring(LUA_QS(token2str(token)) + " expected"));
/*      */   }
/*      */   
/*      */   boolean testnext(int c) {
/*  838 */     if (this.t.token == c) {
/*  839 */       next();
/*  840 */       return true;
/*      */     } 
/*  842 */     return false;
/*      */   }
/*      */   
/*      */   void check(int c) {
/*  846 */     if (this.t.token != c)
/*  847 */       error_expected(c); 
/*      */   }
/*      */   
/*      */   void checknext(int c) {
/*  851 */     check(c);
/*  852 */     next();
/*      */   }
/*      */   
/*      */   void check_condition(boolean c, String msg) {
/*  856 */     if (!c)
/*  857 */       syntaxerror(msg); 
/*      */   }
/*      */   
/*      */   void check_match(int what, int who, int where) {
/*  861 */     if (!testnext(what)) {
/*  862 */       if (where == this.linenumber) {
/*  863 */         error_expected(what);
/*      */       } else {
/*  865 */         syntaxerror(this.L.pushfstring(LUA_QS(token2str(what)) + " expected (to close " + LUA_QS(token2str(who)) + " at line " + where + ")"));
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   LuaString str_checkname() {
/*  873 */     check(288);
/*  874 */     LuaString ts = this.t.seminfo.ts;
/*  875 */     next();
/*  876 */     return ts;
/*      */   }
/*      */   
/*      */   void codestring(expdesc e, LuaString s) {
/*  880 */     e.init(4, this.fs.stringK(s));
/*      */   }
/*      */   
/*      */   void checkname(expdesc e) {
/*  884 */     codestring(e, str_checkname());
/*      */   }
/*      */   
/*      */   int registerlocalvar(LuaString varname) {
/*  888 */     FuncState fs = this.fs;
/*  889 */     Prototype f = fs.f;
/*  890 */     if (f.locvars == null || fs.nlocvars + 1 > f.locvars.length)
/*  891 */       f.locvars = realloc(f.locvars, fs.nlocvars * 2 + 1); 
/*  892 */     f.locvars[fs.nlocvars] = new LocVars(varname, 0, 0);
/*  893 */     fs.nlocvars = (short)(fs.nlocvars + 1); return fs.nlocvars;
/*      */   }
/*      */   
/*      */   void new_localvar(LuaString name) {
/*  897 */     int reg = registerlocalvar(name);
/*  898 */     this.fs.checklimit(this.dyd.n_actvar + 1, 200, "local variables");
/*  899 */     if (this.dyd.actvar == null || this.dyd.n_actvar + 1 > this.dyd.actvar.length)
/*  900 */       this.dyd.actvar = realloc(this.dyd.actvar, Math.max(1, this.dyd.n_actvar * 2)); 
/*  901 */     this.dyd.actvar[this.dyd.n_actvar++] = new Vardesc(reg);
/*      */   }
/*      */   
/*      */   void new_localvarliteral(String v) {
/*  905 */     LuaString ts = newstring(v);
/*  906 */     new_localvar(ts);
/*      */   }
/*      */   
/*      */   void adjustlocalvars(int nvars) {
/*  910 */     FuncState fs = this.fs;
/*  911 */     fs.nactvar = (short)(fs.nactvar + nvars);
/*  912 */     for (; nvars > 0; nvars--) {
/*  913 */       (fs.getlocvar(fs.nactvar - nvars)).startpc = fs.pc;
/*      */     }
/*      */   }
/*      */   
/*      */   void removevars(int tolevel) {
/*  918 */     FuncState fs = this.fs;
/*  919 */     while (fs.nactvar > tolevel)
/*  920 */       (fs.getlocvar(fs.nactvar = (short)(fs.nactvar - 1))).endpc = fs.pc; 
/*      */   }
/*      */   
/*      */   void singlevar(expdesc var) {
/*  924 */     LuaString varname = str_checkname();
/*  925 */     FuncState fs = this.fs;
/*  926 */     if (FuncState.singlevaraux(fs, varname, var, 1) == 0) {
/*  927 */       expdesc key = new expdesc();
/*  928 */       FuncState.singlevaraux(fs, this.envn, var, 1);
/*  929 */       _assert((var.k == 7 || var.k == 8));
/*  930 */       codestring(key, varname);
/*  931 */       fs.indexed(var, key);
/*      */     } 
/*      */   }
/*      */   
/*      */   void adjust_assign(int nvars, int nexps, expdesc e) {
/*  936 */     FuncState fs = this.fs;
/*  937 */     int extra = nvars - nexps;
/*  938 */     if (hasmultret(e.k)) {
/*      */       
/*  940 */       extra++;
/*  941 */       if (extra < 0) {
/*  942 */         extra = 0;
/*      */       }
/*  944 */       fs.setreturns(e, extra);
/*  945 */       if (extra > 1) {
/*  946 */         fs.reserveregs(extra - 1);
/*      */       }
/*      */     } else {
/*  949 */       if (e.k != 0)
/*  950 */         fs.exp2nextreg(e); 
/*  951 */       if (extra > 0) {
/*  952 */         int reg = fs.freereg;
/*  953 */         fs.reserveregs(extra);
/*  954 */         fs.nil(reg, extra);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   void enterlevel() {
/*  960 */     if (++this.L.nCcalls > 200)
/*  961 */       lexerror("chunk has too many syntax levels", 0); 
/*      */   }
/*      */   
/*      */   void leavelevel() {
/*  965 */     this.L.nCcalls--;
/*      */   }
/*      */   
/*      */   void closegoto(int g, Labeldesc label) {
/*  969 */     FuncState fs = this.fs;
/*  970 */     Labeldesc[] gl = this.dyd.gt;
/*  971 */     Labeldesc gt = gl[g];
/*  972 */     _assert(gt.name.eq_b((LuaValue)label.name));
/*  973 */     if (gt.nactvar < label.nactvar) {
/*  974 */       LuaString vname = (fs.getlocvar(gt.nactvar)).varname;
/*  975 */       String msg = this.L.pushfstring("<goto " + gt.name + "> at line " + gt.line + " jumps into the scope of local '" + vname
/*  976 */           .tojstring() + "'");
/*  977 */       semerror(msg);
/*      */     } 
/*  979 */     fs.patchlist(gt.pc, label.pc);
/*      */     
/*  981 */     System.arraycopy(gl, g + 1, gl, g, this.dyd.n_gt - g - 1);
/*  982 */     gl[--this.dyd.n_gt] = null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean findlabel(int g) {
/*  990 */     FuncState.BlockCnt bl = this.fs.bl;
/*  991 */     Dyndata dyd = this.dyd;
/*  992 */     Labeldesc gt = dyd.gt[g];
/*      */     
/*  994 */     for (int i = bl.firstlabel; i < dyd.n_label; i++) {
/*  995 */       Labeldesc lb = dyd.label[i];
/*  996 */       if (lb.name.eq_b((LuaValue)gt.name)) {
/*  997 */         if (gt.nactvar > lb.nactvar && (bl.upval || dyd.n_label > bl.firstlabel))
/*  998 */           this.fs.patchclose(gt.pc, lb.nactvar); 
/*  999 */         closegoto(g, lb);
/* 1000 */         return true;
/*      */       } 
/*      */     } 
/* 1003 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   int newlabelentry(Labeldesc[] l, int index, LuaString name, int line, int pc) {
/* 1008 */     l[index] = new Labeldesc(name, pc, line, this.fs.nactvar);
/* 1009 */     return index;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void findgotos(Labeldesc lb) {
/* 1017 */     Labeldesc[] gl = this.dyd.gt;
/* 1018 */     int i = this.fs.bl.firstgoto;
/* 1019 */     while (i < this.dyd.n_gt) {
/* 1020 */       if ((gl[i]).name.eq_b((LuaValue)lb.name)) {
/* 1021 */         closegoto(i, lb); continue;
/*      */       } 
/* 1023 */       i++;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void breaklabel() {
/* 1031 */     LuaString n = LuaString.valueOf("break");
/* 1032 */     int l = newlabelentry(this.dyd.label = grow(this.dyd.label, this.dyd.n_label + 1), this.dyd.n_label++, n, 0, this.fs.pc);
/* 1033 */     findgotos(this.dyd.label[l]);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void undefgoto(Labeldesc gt) {
/* 1041 */     String msg = this.L.pushfstring(
/* 1042 */         isReservedKeyword(gt.name.tojstring()) ? ("<" + gt.name + "> at line " + gt.line + " not inside a loop") : (
/* 1043 */         "no visible label '" + gt.name + "' for <goto> at line " + gt.line));
/* 1044 */     semerror(msg);
/*      */   }
/*      */ 
/*      */   
/*      */   Prototype addprototype() {
/* 1049 */     Prototype f = this.fs.f;
/* 1050 */     if (f.p == null || this.fs.np >= f.p.length) {
/* 1051 */       f.p = realloc(f.p, Math.max(1, this.fs.np * 2));
/*      */     }
/* 1053 */     Prototype clp = new Prototype();
/* 1054 */     return clp;
/*      */   }
/*      */   
/*      */   void codeclosure(expdesc v) {
/* 1058 */     FuncState fs = this.fs.prev;
/* 1059 */     v.init(11, fs.codeABx(37, 0, fs.np - 1));
/* 1060 */     fs.exp2nextreg(v);
/*      */   }
/*      */   
/*      */   void open_func(FuncState fs, FuncState.BlockCnt bl) {
/* 1064 */     fs.prev = this.fs;
/* 1065 */     fs.ls = this;
/* 1066 */     this.fs = fs;
/* 1067 */     fs.pc = 0;
/* 1068 */     fs.lasttarget = -1;
/* 1069 */     fs.jpc = new IntPtr(-1);
/* 1070 */     fs.freereg = 0;
/* 1071 */     fs.nk = 0;
/* 1072 */     fs.np = 0;
/* 1073 */     fs.nups = 0;
/* 1074 */     fs.nlocvars = 0;
/* 1075 */     fs.nactvar = 0;
/* 1076 */     fs.firstlocal = this.dyd.n_actvar;
/* 1077 */     fs.bl = null;
/* 1078 */     fs.f.source = this.source;
/* 1079 */     fs.f.maxstacksize = 2;
/* 1080 */     fs.enterblock(bl, false);
/*      */   }
/*      */   
/*      */   void close_func() {
/* 1084 */     FuncState fs = this.fs;
/* 1085 */     Prototype f = fs.f;
/* 1086 */     fs.ret(0, 0);
/* 1087 */     fs.leaveblock();
/* 1088 */     f.code = realloc(f.code, fs.pc);
/* 1089 */     f.lineinfo = realloc(f.lineinfo, fs.pc);
/* 1090 */     f.k = realloc(f.k, fs.nk);
/* 1091 */     f.p = realloc(f.p, fs.np);
/* 1092 */     f.locvars = realloc(f.locvars, fs.nlocvars);
/* 1093 */     f.upvalues = realloc(f.upvalues, fs.nups);
/* 1094 */     _assert((fs.bl == null));
/* 1095 */     this.fs = fs.prev;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void fieldsel(expdesc v) {
/* 1106 */     FuncState fs = this.fs;
/* 1107 */     expdesc key = new expdesc();
/* 1108 */     fs.exp2anyregup(v);
/* 1109 */     next();
/* 1110 */     checkname(key);
/* 1111 */     fs.indexed(v, key);
/*      */   }
/*      */ 
/*      */   
/*      */   void yindex(expdesc v) {
/* 1116 */     next();
/* 1117 */     expr(v);
/* 1118 */     this.fs.exp2val(v);
/* 1119 */     checknext(93);
/*      */   }
/*      */   
/*      */   static class ConsControl { LexState.expdesc v;
/*      */     LexState.expdesc t;
/*      */     int nh;
/*      */     int na;
/*      */     int tostore;
/*      */     
/*      */     ConsControl() {
/* 1129 */       this.v = new LexState.expdesc();
/*      */     } }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void recfield(ConsControl cc) {
/* 1138 */     FuncState fs = this.fs;
/* 1139 */     int reg = this.fs.freereg;
/* 1140 */     expdesc key = new expdesc();
/* 1141 */     expdesc val = new expdesc();
/*      */     
/* 1143 */     if (this.t.token == 288) {
/* 1144 */       fs.checklimit(cc.nh, 2147483645, "items in a constructor");
/* 1145 */       checkname(key);
/*      */     } else {
/*      */       
/* 1148 */       yindex(key);
/* 1149 */     }  cc.nh++;
/* 1150 */     checknext(61);
/* 1151 */     int rkkey = fs.exp2RK(key);
/* 1152 */     expr(val);
/* 1153 */     fs.codeABC(10, cc.t.u.info, rkkey, fs.exp2RK(val));
/* 1154 */     fs.freereg = (short)reg;
/*      */   }
/*      */   
/*      */   void listfield(ConsControl cc) {
/* 1158 */     expr(cc.v);
/* 1159 */     this.fs.checklimit(cc.na, 2147483645, "items in a constructor");
/* 1160 */     cc.na++;
/* 1161 */     cc.tostore++;
/*      */   }
/*      */ 
/*      */   
/*      */   void constructor(expdesc t) {
/* 1166 */     FuncState fs = this.fs;
/* 1167 */     int line = this.linenumber;
/* 1168 */     int pc = fs.codeABC(11, 0, 0, 0);
/* 1169 */     ConsControl cc = new ConsControl();
/* 1170 */     cc.na = cc.nh = cc.tostore = 0;
/* 1171 */     cc.t = t;
/* 1172 */     t.init(11, pc);
/* 1173 */     cc.v.init(0, 0);
/* 1174 */     fs.exp2nextreg(t);
/* 1175 */     checknext(123);
/*      */     do {
/* 1177 */       _assert((cc.v.k == 0 || cc.tostore > 0));
/* 1178 */       if (this.t.token == 125)
/*      */         break; 
/* 1180 */       fs.closelistfield(cc);
/* 1181 */       switch (this.t.token) {
/*      */         case 288:
/* 1183 */           lookahead();
/* 1184 */           if (this.lookahead.token != 61) {
/* 1185 */             listfield(cc); break;
/*      */           } 
/* 1187 */           recfield(cc);
/*      */           break;
/*      */         
/*      */         case 91:
/* 1191 */           recfield(cc);
/*      */           break;
/*      */         
/*      */         default:
/* 1195 */           listfield(cc);
/*      */           break;
/*      */       } 
/*      */     
/* 1199 */     } while (testnext(44) || testnext(59));
/* 1200 */     check_match(125, 123, line);
/* 1201 */     fs.lastlistfield(cc);
/* 1202 */     InstructionPtr i = new InstructionPtr(fs.f.code, pc);
/* 1203 */     SETARG_B(i, luaO_int2fb(cc.na));
/* 1204 */     SETARG_C(i, luaO_int2fb(cc.nh));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static int luaO_int2fb(int x) {
/* 1213 */     int e = 0;
/* 1214 */     while (x >= 16) {
/* 1215 */       x = x + 1 >> 1;
/* 1216 */       e++;
/*      */     } 
/* 1218 */     if (x < 8) {
/* 1219 */       return x;
/*      */     }
/* 1221 */     return e + 1 << 3 | x - 8;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void parlist() {
/* 1228 */     FuncState fs = this.fs;
/* 1229 */     Prototype f = fs.f;
/* 1230 */     int nparams = 0;
/* 1231 */     f.is_vararg = 0;
/* 1232 */     if (this.t.token != 41) {
/*      */       do {
/* 1234 */         switch (this.t.token) {
/*      */           case 288:
/* 1236 */             new_localvar(str_checkname());
/* 1237 */             nparams++;
/*      */             break;
/*      */           
/*      */           case 280:
/* 1241 */             next();
/* 1242 */             f.is_vararg = 1;
/*      */             break;
/*      */           
/*      */           default:
/* 1246 */             syntaxerror("<name> or " + LUA_QL("...") + " expected"); break;
/*      */         } 
/* 1248 */       } while (f.is_vararg == 0 && testnext(44));
/*      */     }
/* 1250 */     adjustlocalvars(nparams);
/* 1251 */     f.numparams = fs.nactvar;
/* 1252 */     fs.reserveregs(fs.nactvar);
/*      */   }
/*      */ 
/*      */   
/*      */   void body(expdesc e, boolean needself, int line) {
/* 1257 */     FuncState new_fs = new FuncState();
/* 1258 */     FuncState.BlockCnt bl = new FuncState.BlockCnt();
/* 1259 */     new_fs.f = addprototype();
/* 1260 */     new_fs.f.linedefined = line;
/* 1261 */     open_func(new_fs, bl);
/* 1262 */     checknext(40);
/* 1263 */     if (needself) {
/* 1264 */       new_localvarliteral("self");
/* 1265 */       adjustlocalvars(1);
/*      */     } 
/* 1267 */     parlist();
/* 1268 */     checknext(41);
/* 1269 */     statlist();
/* 1270 */     new_fs.f.lastlinedefined = this.linenumber;
/* 1271 */     check_match(262, 265, line);
/* 1272 */     codeclosure(e);
/* 1273 */     close_func();
/*      */   }
/*      */ 
/*      */   
/*      */   int explist(expdesc v) {
/* 1278 */     int n = 1;
/* 1279 */     expr(v);
/* 1280 */     while (testnext(44)) {
/* 1281 */       this.fs.exp2nextreg(v);
/* 1282 */       expr(v);
/* 1283 */       n++;
/*      */     } 
/* 1285 */     return n;
/*      */   }
/*      */   void funcargs(expdesc f, int line) {
/*      */     int nparams;
/* 1289 */     FuncState fs = this.fs;
/* 1290 */     expdesc args = new expdesc();
/*      */     
/* 1292 */     switch (this.t.token) {
/*      */       case 40:
/* 1294 */         next();
/* 1295 */         if (this.t.token == 41) {
/* 1296 */           args.k = 0;
/*      */         } else {
/* 1298 */           explist(args);
/* 1299 */           fs.setmultret(args);
/*      */         } 
/* 1301 */         check_match(41, 40, line);
/*      */         break;
/*      */       
/*      */       case 123:
/* 1305 */         constructor(args);
/*      */         break;
/*      */       
/*      */       case 289:
/* 1309 */         codestring(args, this.t.seminfo.ts);
/* 1310 */         next();
/*      */         break;
/*      */       
/*      */       default:
/* 1314 */         syntaxerror("function arguments expected");
/*      */         return;
/*      */     } 
/*      */     
/* 1318 */     _assert((f.k == 6));
/* 1319 */     int base = f.u.info;
/* 1320 */     if (hasmultret(args.k)) {
/* 1321 */       nparams = -1;
/*      */     } else {
/* 1323 */       if (args.k != 0)
/* 1324 */         fs.exp2nextreg(args); 
/* 1325 */       nparams = fs.freereg - base + 1;
/*      */     } 
/* 1327 */     f.init(12, fs.codeABC(29, base, nparams + 1, 2));
/* 1328 */     fs.fixline(line);
/* 1329 */     fs.freereg = (short)(base + 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void primaryexp(expdesc v) {
/*      */     int line;
/* 1341 */     switch (this.t.token) {
/*      */       case 40:
/* 1343 */         line = this.linenumber;
/* 1344 */         next();
/* 1345 */         expr(v);
/* 1346 */         check_match(41, 40, line);
/* 1347 */         this.fs.dischargevars(v);
/*      */         return;
/*      */       
/*      */       case 288:
/* 1351 */         singlevar(v);
/*      */         return;
/*      */     } 
/*      */     
/* 1355 */     syntaxerror("unexpected symbol " + this.t.token + " (" + (char)this.t.token + ")");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void suffixedexp(expdesc v) {
/* 1363 */     int line = this.linenumber;
/* 1364 */     primaryexp(v); while (true) {
/*      */       expdesc key;
/* 1366 */       switch (this.t.token) {
/*      */         case 46:
/* 1368 */           fieldsel(v);
/*      */           continue;
/*      */         
/*      */         case 91:
/* 1372 */           key = new expdesc();
/* 1373 */           this.fs.exp2anyregup(v);
/* 1374 */           yindex(key);
/* 1375 */           this.fs.indexed(v, key);
/*      */           continue;
/*      */         
/*      */         case 58:
/* 1379 */           key = new expdesc();
/* 1380 */           next();
/* 1381 */           checkname(key);
/* 1382 */           this.fs.self(v, key);
/* 1383 */           funcargs(v, line);
/*      */           continue;
/*      */         
/*      */         case 40:
/*      */         case 123:
/*      */         case 289:
/* 1389 */           this.fs.exp2nextreg(v);
/* 1390 */           funcargs(v, line);
/*      */           continue;
/*      */       } 
/*      */       break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void simpleexp(expdesc v) {
/*      */     FuncState fs;
/* 1404 */     switch (this.t.token) {
/*      */       case 287:
/* 1406 */         v.init(5, 0);
/* 1407 */         v.u.setNval(this.t.seminfo.r);
/*      */         break;
/*      */       
/*      */       case 289:
/* 1411 */         codestring(v, this.t.seminfo.ts);
/*      */         break;
/*      */       
/*      */       case 270:
/* 1415 */         v.init(1, 0);
/*      */         break;
/*      */       
/*      */       case 276:
/* 1419 */         v.init(2, 0);
/*      */         break;
/*      */       
/*      */       case 263:
/* 1423 */         v.init(3, 0);
/*      */         break;
/*      */       
/*      */       case 280:
/* 1427 */         fs = this.fs;
/* 1428 */         check_condition((fs.f.is_vararg != 0), "cannot use " + LUA_QL("...") + " outside a vararg function");
/* 1429 */         v.init(13, fs.codeABC(38, 0, 1, 0));
/*      */         break;
/*      */       
/*      */       case 123:
/* 1433 */         constructor(v);
/*      */         return;
/*      */       
/*      */       case 265:
/* 1437 */         next();
/* 1438 */         body(v, false, this.linenumber);
/*      */         return;
/*      */       
/*      */       default:
/* 1442 */         suffixedexp(v);
/*      */         return;
/*      */     } 
/*      */     
/* 1446 */     next();
/*      */   }
/*      */   
/*      */   int getunopr(int op) {
/* 1450 */     switch (op) {
/*      */       case 271:
/* 1452 */         return 1;
/*      */       case 45:
/* 1454 */         return 0;
/*      */       case 35:
/* 1456 */         return 2;
/*      */     } 
/* 1458 */     return 3;
/*      */   }
/*      */ 
/*      */   
/*      */   int getbinopr(int op) {
/* 1463 */     switch (op) {
/*      */       case 43:
/* 1465 */         return 0;
/*      */       case 45:
/* 1467 */         return 1;
/*      */       case 42:
/* 1469 */         return 2;
/*      */       case 47:
/* 1471 */         return 3;
/*      */       case 37:
/* 1473 */         return 4;
/*      */       case 94:
/* 1475 */         return 5;
/*      */       case 279:
/* 1477 */         return 6;
/*      */       case 284:
/* 1479 */         return 7;
/*      */       case 281:
/* 1481 */         return 8;
/*      */       case 60:
/* 1483 */         return 9;
/*      */       case 283:
/* 1485 */         return 10;
/*      */       case 62:
/* 1487 */         return 11;
/*      */       case 282:
/* 1489 */         return 12;
/*      */       case 257:
/* 1491 */         return 13;
/*      */       case 272:
/* 1493 */         return 14;
/*      */     } 
/* 1495 */     return 15;
/*      */   }
/*      */ 
/*      */   
/*      */   static class Priority
/*      */   {
/*      */     final byte left;
/*      */     final byte right;
/*      */     
/*      */     public Priority(int i, int j) {
/* 1505 */       this.left = (byte)i;
/* 1506 */       this.right = (byte)j;
/*      */     }
/*      */   }
/*      */   
/* 1510 */   static Priority[] priority = new Priority[] { new Priority(6, 6), new Priority(6, 6), new Priority(7, 7), new Priority(7, 7), new Priority(7, 7), new Priority(10, 9), new Priority(5, 4), new Priority(3, 3), new Priority(3, 3), new Priority(3, 3), new Priority(3, 3), new Priority(3, 3), new Priority(3, 3), new Priority(2, 2), new Priority(1, 1) };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final int UNARY_PRIORITY = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   int subexpr(expdesc v, int limit) {
/* 1528 */     enterlevel();
/* 1529 */     int uop = getunopr(this.t.token);
/* 1530 */     if (uop != 3) {
/* 1531 */       int line = this.linenumber;
/* 1532 */       next();
/* 1533 */       subexpr(v, 8);
/* 1534 */       this.fs.prefix(uop, v, line);
/*      */     } else {
/* 1536 */       simpleexp(v);
/*      */     } 
/* 1538 */     int op = getbinopr(this.t.token);
/* 1539 */     while (op != 15 && (priority[op]).left > limit) {
/* 1540 */       expdesc v2 = new expdesc();
/* 1541 */       int line = this.linenumber;
/* 1542 */       next();
/* 1543 */       this.fs.infix(op, v);
/*      */       
/* 1545 */       int nextop = subexpr(v2, (priority[op]).right);
/* 1546 */       this.fs.posfix(op, v, v2, line);
/* 1547 */       op = nextop;
/*      */     } 
/* 1549 */     leavelevel();
/* 1550 */     return op;
/*      */   }
/*      */   
/*      */   void expr(expdesc v) {
/* 1554 */     subexpr(v, 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean block_follow(boolean withuntil) {
/* 1566 */     switch (this.t.token) { case 260: case 261: case 262:
/*      */       case 286:
/* 1568 */         return true;
/*      */       case 277:
/* 1570 */         return withuntil; }
/* 1571 */      return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   void block() {
/* 1577 */     FuncState fs = this.fs;
/* 1578 */     FuncState.BlockCnt bl = new FuncState.BlockCnt();
/* 1579 */     fs.enterblock(bl, false);
/* 1580 */     statlist();
/* 1581 */     fs.leaveblock();
/*      */   }
/*      */ 
/*      */   
/*      */   static class LHS_assign
/*      */   {
/*      */     LHS_assign prev;
/*      */     LexState.expdesc v;
/*      */     
/*      */     LHS_assign() {
/* 1591 */       this.v = new LexState.expdesc();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void check_conflict(LHS_assign lh, expdesc v) {
/* 1601 */     FuncState fs = this.fs;
/* 1602 */     short extra = fs.freereg;
/* 1603 */     boolean conflict = false;
/* 1604 */     for (; lh != null; lh = lh.prev) {
/* 1605 */       if (lh.v.k == 9) {
/*      */         
/* 1607 */         if (lh.v.u.ind_vt == v.k && lh.v.u.ind_t == v.u.info) {
/* 1608 */           conflict = true;
/* 1609 */           lh.v.u.ind_vt = 7;
/* 1610 */           lh.v.u.ind_t = extra;
/*      */         } 
/*      */         
/* 1613 */         if (v.k == 7 && lh.v.u.ind_idx == v.u.info) {
/* 1614 */           conflict = true;
/* 1615 */           lh.v.u.ind_idx = extra;
/*      */         } 
/*      */       } 
/*      */     } 
/* 1619 */     if (conflict) {
/*      */       
/* 1621 */       int op = (v.k == 7) ? 0 : 5;
/* 1622 */       fs.codeABC(op, extra, v.u.info, 0);
/* 1623 */       fs.reserveregs(1);
/*      */     } 
/*      */   }
/*      */   
/*      */   void assignment(LHS_assign lh, int nvars) {
/* 1628 */     expdesc e = new expdesc();
/* 1629 */     check_condition((7 <= lh.v.k && lh.v.k <= 9), "syntax error");
/* 1630 */     if (testnext(44)) {
/* 1631 */       LHS_assign nv = new LHS_assign();
/* 1632 */       nv.prev = lh;
/* 1633 */       suffixedexp(nv.v);
/* 1634 */       if (nv.v.k != 9)
/* 1635 */         check_conflict(lh, nv.v); 
/* 1636 */       assignment(nv, nvars + 1);
/*      */     } else {
/*      */       
/* 1639 */       checknext(61);
/* 1640 */       int nexps = explist(e);
/* 1641 */       if (nexps != nvars) {
/* 1642 */         adjust_assign(nvars, nexps, e);
/* 1643 */         if (nexps > nvars)
/* 1644 */           this.fs.freereg = (short)(this.fs.freereg - nexps - nvars); 
/*      */       } else {
/* 1646 */         this.fs.setoneret(e);
/* 1647 */         this.fs.storevar(lh.v, e);
/*      */         return;
/*      */       } 
/*      */     } 
/* 1651 */     e.init(6, this.fs.freereg - 1);
/* 1652 */     this.fs.storevar(lh.v, e);
/*      */   }
/*      */ 
/*      */   
/*      */   int cond() {
/* 1657 */     expdesc v = new expdesc();
/*      */     
/* 1659 */     expr(v);
/*      */     
/* 1661 */     if (v.k == 1)
/* 1662 */       v.k = 3; 
/* 1663 */     this.fs.goiftrue(v);
/* 1664 */     return v.f.i;
/*      */   }
/*      */   void gotostat(int pc) {
/*      */     LuaString label;
/* 1668 */     int line = this.linenumber;
/*      */ 
/*      */     
/* 1671 */     if (testnext(266)) {
/* 1672 */       label = str_checkname();
/*      */     } else {
/* 1674 */       next();
/* 1675 */       label = LuaString.valueOf("break");
/*      */     } 
/* 1677 */     int g = newlabelentry(this.dyd.gt = grow(this.dyd.gt, this.dyd.n_gt + 1), this.dyd.n_gt++, label, line, pc);
/* 1678 */     findlabel(g);
/*      */   }
/*      */ 
/*      */   
/*      */   void skipnoopstat() {
/* 1683 */     while (this.t.token == 59 || this.t.token == 285) {
/* 1684 */       statement();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   void labelstat(LuaString label, int line) {
/* 1690 */     this.fs.checkrepeated(this.dyd.label, this.dyd.n_label, label);
/* 1691 */     checknext(285);
/*      */     
/* 1693 */     int l = newlabelentry(this.dyd.label = grow(this.dyd.label, this.dyd.n_label + 1), this.dyd.n_label++, label, line, this.fs.getlabel());
/* 1694 */     skipnoopstat();
/* 1695 */     if (block_follow(false))
/*      */     {
/* 1697 */       (this.dyd.label[l]).nactvar = this.fs.bl.nactvar;
/*      */     }
/* 1699 */     findgotos(this.dyd.label[l]);
/*      */   }
/*      */ 
/*      */   
/*      */   void whilestat(int line) {
/* 1704 */     FuncState fs = this.fs;
/*      */ 
/*      */     
/* 1707 */     FuncState.BlockCnt bl = new FuncState.BlockCnt();
/* 1708 */     next();
/* 1709 */     int whileinit = fs.getlabel();
/* 1710 */     int condexit = cond();
/* 1711 */     fs.enterblock(bl, true);
/* 1712 */     checknext(259);
/* 1713 */     block();
/* 1714 */     fs.patchlist(fs.jump(), whileinit);
/* 1715 */     check_match(262, 278, line);
/* 1716 */     fs.leaveblock();
/* 1717 */     fs.patchtohere(condexit);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   void repeatstat(int line) {
/* 1723 */     FuncState fs = this.fs;
/* 1724 */     int repeat_init = fs.getlabel();
/* 1725 */     FuncState.BlockCnt bl1 = new FuncState.BlockCnt();
/* 1726 */     FuncState.BlockCnt bl2 = new FuncState.BlockCnt();
/* 1727 */     fs.enterblock(bl1, true);
/* 1728 */     fs.enterblock(bl2, false);
/* 1729 */     next();
/* 1730 */     statlist();
/* 1731 */     check_match(277, 273, line);
/* 1732 */     int condexit = cond();
/* 1733 */     if (bl2.upval) {
/* 1734 */       fs.patchclose(condexit, bl2.nactvar);
/*      */     }
/* 1736 */     fs.leaveblock();
/* 1737 */     fs.patchlist(condexit, repeat_init);
/* 1738 */     fs.leaveblock();
/*      */   }
/*      */   
/*      */   int exp1() {
/* 1742 */     expdesc e = new expdesc();
/*      */     
/* 1744 */     expr(e);
/* 1745 */     int k = e.k;
/* 1746 */     this.fs.exp2nextreg(e);
/* 1747 */     return k;
/*      */   }
/*      */   
/*      */   void forbody(int base, int line, int nvars, boolean isnum) {
/*      */     int endfor;
/* 1752 */     FuncState.BlockCnt bl = new FuncState.BlockCnt();
/* 1753 */     FuncState fs = this.fs;
/*      */     
/* 1755 */     adjustlocalvars(3);
/* 1756 */     checknext(259);
/* 1757 */     int prep = isnum ? fs.codeAsBx(33, base, -1) : fs.jump();
/* 1758 */     fs.enterblock(bl, false);
/* 1759 */     adjustlocalvars(nvars);
/* 1760 */     fs.reserveregs(nvars);
/* 1761 */     block();
/* 1762 */     fs.leaveblock();
/* 1763 */     fs.patchtohere(prep);
/* 1764 */     if (isnum) {
/* 1765 */       endfor = fs.codeAsBx(32, base, -1);
/*      */     } else {
/* 1767 */       fs.codeABC(34, base, 0, nvars);
/* 1768 */       fs.fixline(line);
/* 1769 */       endfor = fs.codeAsBx(35, base + 2, -1);
/*      */     } 
/* 1771 */     fs.patchlist(endfor, prep + 1);
/* 1772 */     fs.fixline(line);
/*      */   }
/*      */ 
/*      */   
/*      */   void fornum(LuaString varname, int line) {
/* 1777 */     FuncState fs = this.fs;
/* 1778 */     int base = fs.freereg;
/* 1779 */     new_localvarliteral("(for index)");
/* 1780 */     new_localvarliteral("(for limit)");
/* 1781 */     new_localvarliteral("(for step)");
/* 1782 */     new_localvar(varname);
/* 1783 */     checknext(61);
/* 1784 */     exp1();
/* 1785 */     checknext(44);
/* 1786 */     exp1();
/* 1787 */     if (testnext(44)) {
/* 1788 */       exp1();
/*      */     } else {
/* 1790 */       fs.codeK(fs.freereg, fs.numberK((LuaValue)LuaInteger.valueOf(1)));
/* 1791 */       fs.reserveregs(1);
/*      */     } 
/* 1793 */     forbody(base, line, 1, true);
/*      */   }
/*      */ 
/*      */   
/*      */   void forlist(LuaString indexname) {
/* 1798 */     FuncState fs = this.fs;
/* 1799 */     expdesc e = new expdesc();
/* 1800 */     int nvars = 4;
/*      */     
/* 1802 */     int base = fs.freereg;
/*      */     
/* 1804 */     new_localvarliteral("(for generator)");
/* 1805 */     new_localvarliteral("(for state)");
/* 1806 */     new_localvarliteral("(for control)");
/*      */     
/* 1808 */     new_localvar(indexname);
/* 1809 */     while (testnext(44)) {
/* 1810 */       new_localvar(str_checkname());
/* 1811 */       nvars++;
/*      */     } 
/* 1813 */     checknext(268);
/* 1814 */     int line = this.linenumber;
/* 1815 */     adjust_assign(3, explist(e), e);
/* 1816 */     fs.checkstack(3);
/* 1817 */     forbody(base, line, nvars - 3, false);
/*      */   }
/*      */ 
/*      */   
/*      */   void forstat(int line) {
/* 1822 */     FuncState fs = this.fs;
/*      */     
/* 1824 */     FuncState.BlockCnt bl = new FuncState.BlockCnt();
/* 1825 */     fs.enterblock(bl, true);
/* 1826 */     next();
/* 1827 */     LuaString varname = str_checkname();
/* 1828 */     switch (this.t.token) {
/*      */       case 61:
/* 1830 */         fornum(varname, line);
/*      */         break;
/*      */       case 44:
/*      */       case 268:
/* 1834 */         forlist(varname);
/*      */         break;
/*      */       default:
/* 1837 */         syntaxerror(LUA_QL("=") + " or " + LUA_QL("in") + " expected"); break;
/*      */     } 
/* 1839 */     check_match(262, 264, line);
/* 1840 */     fs.leaveblock();
/*      */   }
/*      */   
/*      */   void test_then_block(IntPtr escapelist) {
/*      */     int jf;
/* 1845 */     expdesc v = new expdesc();
/* 1846 */     FuncState.BlockCnt bl = new FuncState.BlockCnt();
/*      */     
/* 1848 */     next();
/* 1849 */     expr(v);
/* 1850 */     checknext(275);
/* 1851 */     if (this.t.token == 266 || this.t.token == 258) {
/* 1852 */       this.fs.goiffalse(v);
/* 1853 */       this.fs.enterblock(bl, false);
/* 1854 */       gotostat(v.t.i);
/* 1855 */       skipnoopstat();
/* 1856 */       if (block_follow(false)) {
/* 1857 */         this.fs.leaveblock();
/*      */         
/*      */         return;
/*      */       } 
/* 1861 */       jf = this.fs.jump();
/*      */     } else {
/* 1863 */       this.fs.goiftrue(v);
/* 1864 */       this.fs.enterblock(bl, false);
/* 1865 */       jf = v.f.i;
/*      */     } 
/* 1867 */     statlist();
/* 1868 */     this.fs.leaveblock();
/* 1869 */     if (this.t.token == 260 || this.t.token == 261)
/* 1870 */       this.fs.concat(escapelist, this.fs.jump()); 
/* 1871 */     this.fs.patchtohere(jf);
/*      */   }
/*      */   
/*      */   void ifstat(int line) {
/* 1875 */     IntPtr escapelist = new IntPtr(-1);
/* 1876 */     test_then_block(escapelist);
/* 1877 */     while (this.t.token == 261)
/* 1878 */       test_then_block(escapelist); 
/* 1879 */     if (testnext(260))
/* 1880 */       block(); 
/* 1881 */     check_match(262, 267, line);
/* 1882 */     this.fs.patchtohere(escapelist.i);
/*      */   }
/*      */   
/*      */   void localfunc() {
/* 1886 */     expdesc b = new expdesc();
/* 1887 */     FuncState fs = this.fs;
/* 1888 */     new_localvar(str_checkname());
/* 1889 */     adjustlocalvars(1);
/* 1890 */     body(b, false, this.linenumber);
/*      */     
/* 1892 */     (fs.getlocvar(fs.nactvar - 1)).startpc = fs.pc;
/*      */   }
/*      */ 
/*      */   
/*      */   void localstat() {
/* 1897 */     int nvars = 0;
/*      */     
/* 1899 */     expdesc e = new expdesc();
/*      */     while (true) {
/* 1901 */       new_localvar(str_checkname());
/* 1902 */       nvars++;
/* 1903 */       if (!testnext(44)) {
/* 1904 */         int nexps; if (testnext(61)) {
/* 1905 */           nexps = explist(e);
/*      */         } else {
/* 1907 */           e.k = 0;
/* 1908 */           nexps = 0;
/*      */         } 
/* 1910 */         adjust_assign(nvars, nexps, e);
/* 1911 */         adjustlocalvars(nvars);
/*      */         return;
/*      */       } 
/*      */     } 
/*      */   } boolean funcname(expdesc v) {
/* 1916 */     boolean ismethod = false;
/* 1917 */     singlevar(v);
/* 1918 */     while (this.t.token == 46)
/* 1919 */       fieldsel(v); 
/* 1920 */     if (this.t.token == 58) {
/* 1921 */       ismethod = true;
/* 1922 */       fieldsel(v);
/*      */     } 
/* 1924 */     return ismethod;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   void funcstat(int line) {
/* 1930 */     expdesc v = new expdesc();
/* 1931 */     expdesc b = new expdesc();
/* 1932 */     next();
/* 1933 */     boolean needself = funcname(v);
/* 1934 */     body(b, needself, line);
/* 1935 */     this.fs.storevar(v, b);
/* 1936 */     this.fs.fixline(line);
/*      */   }
/*      */ 
/*      */   
/*      */   void exprstat() {
/* 1941 */     FuncState fs = this.fs;
/* 1942 */     LHS_assign v = new LHS_assign();
/* 1943 */     suffixedexp(v.v);
/* 1944 */     if (this.t.token == 61 || this.t.token == 44) {
/* 1945 */       v.prev = null;
/* 1946 */       assignment(v, 1);
/*      */     } else {
/* 1948 */       check_condition((v.v.k == 12), "syntax error");
/* 1949 */       SETARG_C(fs.getcodePtr(v.v), 1);
/*      */     } 
/*      */   }
/*      */   
/*      */   void retstat() {
/*      */     int first, nret;
/* 1955 */     FuncState fs = this.fs;
/* 1956 */     expdesc e = new expdesc();
/*      */     
/* 1958 */     if (block_follow(true) || this.t.token == 59) {
/* 1959 */       first = nret = 0;
/*      */     } else {
/* 1961 */       nret = explist(e);
/* 1962 */       if (hasmultret(e.k)) {
/* 1963 */         fs.setmultret(e);
/* 1964 */         if (e.k == 12 && nret == 1) {
/* 1965 */           SET_OPCODE(fs.getcodePtr(e), 30);
/* 1966 */           _assert((Lua.GETARG_A(fs.getcode(e)) == fs.nactvar));
/*      */         } 
/* 1968 */         first = fs.nactvar;
/* 1969 */         nret = -1;
/*      */       }
/* 1971 */       else if (nret == 1) {
/* 1972 */         first = fs.exp2anyreg(e);
/*      */       } else {
/* 1974 */         fs.exp2nextreg(e);
/* 1975 */         first = fs.nactvar;
/* 1976 */         _assert((nret == fs.freereg - first));
/*      */       } 
/*      */     } 
/*      */     
/* 1980 */     fs.ret(first, nret);
/* 1981 */     testnext(59);
/*      */   }
/*      */   
/*      */   void statement() {
/* 1985 */     int line = this.linenumber;
/* 1986 */     enterlevel();
/* 1987 */     switch (this.t.token) {
/*      */       case 59:
/* 1989 */         next();
/*      */         break;
/*      */       
/*      */       case 267:
/* 1993 */         ifstat(line);
/*      */         break;
/*      */       
/*      */       case 278:
/* 1997 */         whilestat(line);
/*      */         break;
/*      */       
/*      */       case 259:
/* 2001 */         next();
/* 2002 */         block();
/* 2003 */         check_match(262, 259, line);
/*      */         break;
/*      */       
/*      */       case 264:
/* 2007 */         forstat(line);
/*      */         break;
/*      */       
/*      */       case 273:
/* 2011 */         repeatstat(line);
/*      */         break;
/*      */       
/*      */       case 265:
/* 2015 */         funcstat(line);
/*      */         break;
/*      */       
/*      */       case 269:
/* 2019 */         next();
/* 2020 */         if (testnext(265)) {
/* 2021 */           localfunc(); break;
/*      */         } 
/* 2023 */         localstat();
/*      */         break;
/*      */       
/*      */       case 285:
/* 2027 */         next();
/* 2028 */         labelstat(str_checkname(), line);
/*      */         break;
/*      */       
/*      */       case 274:
/* 2032 */         next();
/* 2033 */         retstat();
/*      */         break;
/*      */       
/*      */       case 258:
/*      */       case 266:
/* 2038 */         gotostat(this.fs.jump());
/*      */         break;
/*      */       
/*      */       default:
/* 2042 */         exprstat();
/*      */         break;
/*      */     } 
/*      */     
/* 2046 */     _assert((this.fs.f.maxstacksize >= this.fs.freereg && this.fs.freereg >= this.fs.nactvar));
/* 2047 */     this.fs.freereg = this.fs.nactvar;
/* 2048 */     leavelevel();
/*      */   }
/*      */ 
/*      */   
/*      */   void statlist() {
/* 2053 */     while (!block_follow(true)) {
/* 2054 */       if (this.t.token == 274) {
/* 2055 */         statement();
/*      */         return;
/*      */       } 
/* 2058 */       statement();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void mainfunc(FuncState funcstate) {
/* 2067 */     FuncState.BlockCnt bl = new FuncState.BlockCnt();
/* 2068 */     open_func(funcstate, bl);
/* 2069 */     this.fs.f.is_vararg = 1;
/* 2070 */     expdesc v = new expdesc();
/* 2071 */     v.init(7, 0);
/* 2072 */     this.fs.newupvalue(this.envn, v);
/* 2073 */     next();
/* 2074 */     statlist();
/* 2075 */     check(286);
/* 2076 */     close_func();
/*      */   }
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\compiler\LexState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */