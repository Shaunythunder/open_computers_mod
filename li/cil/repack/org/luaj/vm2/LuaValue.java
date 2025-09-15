/*      */ package li.cil.repack.org.luaj.vm2;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class LuaValue
/*      */   extends Varargs
/*      */ {
/*      */   public static final int TINT = -2;
/*      */   public static final int TNONE = -1;
/*      */   public static final int TNIL = 0;
/*      */   public static final int TBOOLEAN = 1;
/*      */   public static final int TLIGHTUSERDATA = 2;
/*      */   public static final int TNUMBER = 3;
/*      */   public static final int TSTRING = 4;
/*      */   public static final int TTABLE = 5;
/*      */   public static final int TFUNCTION = 6;
/*      */   public static final int TUSERDATA = 7;
/*      */   public static final int TTHREAD = 8;
/*      */   public static final int TVALUE = 9;
/*  152 */   public static final String[] TYPE_NAMES = new String[] { "nil", "boolean", "lightuserdata", "number", "string", "table", "function", "userdata", "thread", "value" };
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
/*  166 */   public static final LuaValue NIL = LuaNil._NIL;
/*      */ 
/*      */   
/*  169 */   public static final LuaBoolean TRUE = LuaBoolean._TRUE;
/*      */ 
/*      */   
/*  172 */   public static final LuaBoolean FALSE = LuaBoolean._FALSE;
/*      */ 
/*      */   
/*  175 */   public static final LuaValue NONE = None._NONE;
/*      */ 
/*      */   
/*  178 */   public static final LuaNumber ZERO = LuaInteger.valueOf(0);
/*      */ 
/*      */   
/*  181 */   public static final LuaNumber ONE = LuaInteger.valueOf(1);
/*      */ 
/*      */   
/*  184 */   public static final LuaNumber MINUSONE = LuaInteger.valueOf(-1);
/*      */ 
/*      */   
/*  187 */   public static final LuaValue[] NOVALS = new LuaValue[0];
/*      */ 
/*      */   
/*  190 */   public static LuaString ENV = valueOf("_ENV");
/*      */ 
/*      */   
/*  193 */   public static final LuaString INDEX = valueOf("__index");
/*      */ 
/*      */   
/*  196 */   public static final LuaString NEWINDEX = valueOf("__newindex");
/*      */ 
/*      */   
/*  199 */   public static final LuaString CALL = valueOf("__call");
/*      */ 
/*      */   
/*  202 */   public static final LuaString MODE = valueOf("__mode");
/*      */ 
/*      */   
/*  205 */   public static final LuaString METATABLE = valueOf("__metatable");
/*      */ 
/*      */   
/*  208 */   public static final LuaString ADD = valueOf("__add");
/*      */ 
/*      */   
/*  211 */   public static final LuaString SUB = valueOf("__sub");
/*      */ 
/*      */   
/*  214 */   public static final LuaString DIV = valueOf("__div");
/*      */ 
/*      */   
/*  217 */   public static final LuaString MUL = valueOf("__mul");
/*      */ 
/*      */   
/*  220 */   public static final LuaString POW = valueOf("__pow");
/*      */ 
/*      */   
/*  223 */   public static final LuaString MOD = valueOf("__mod");
/*      */ 
/*      */   
/*  226 */   public static final LuaString UNM = valueOf("__unm");
/*      */ 
/*      */   
/*  229 */   public static final LuaString LEN = valueOf("__len");
/*      */ 
/*      */   
/*  232 */   public static final LuaString EQ = valueOf("__eq");
/*      */ 
/*      */   
/*  235 */   public static final LuaString LT = valueOf("__lt");
/*      */ 
/*      */   
/*  238 */   public static final LuaString LE = valueOf("__le");
/*      */ 
/*      */   
/*  241 */   public static final LuaString TOSTRING = valueOf("__tostring");
/*      */ 
/*      */   
/*  244 */   public static final LuaString CONCAT = valueOf("__concat");
/*      */ 
/*      */   
/*  247 */   public static final LuaString PAIRS = valueOf("__pairs");
/*      */ 
/*      */   
/*  250 */   public static final LuaString IPAIRS = valueOf("__ipairs");
/*      */ 
/*      */   
/*  253 */   public static final LuaString EMPTYSTRING = valueOf("");
/*      */ 
/*      */   
/*  256 */   private static int MAXSTACK = 250;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  261 */   public static final LuaValue[] NILS = new LuaValue[MAXSTACK]; private static final int MAXTAGLOOP = 100;
/*      */   static {
/*  263 */     for (int i = 0; i < MAXSTACK; i++) {
/*  264 */       NILS[i] = NIL;
/*      */     }
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
/*      */   public boolean isboolean() {
/*  301 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isclosure() {
/*  311 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isfunction() {
/*  320 */     return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isint() {
/*  336 */     return false;
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
/*      */   public boolean isinttype() {
/*  348 */     return false;
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
/*      */ 
/*      */   
/*      */   public boolean islong() {
/*  362 */     return false;
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
/*      */   public boolean isnil() {
/*  374 */     return false;
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
/*      */   public boolean isnumber() {
/*  386 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isstring() {
/*  397 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isthread() {
/*  405 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean istable() {
/*  413 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isuserdata() {
/*  423 */     return false;
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
/*      */   
/*      */   public boolean isuserdata(Class c) {
/*  436 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean toboolean() {
/*  445 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte tobyte() {
/*  455 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public char tochar() {
/*  465 */     return Character.MIN_VALUE;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public double todouble() {
/*  480 */     return 0.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float tofloat() {
/*  490 */     return 0.0F;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public int toint() {
/*  505 */     return 0;
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
/*      */   
/*      */   public long tolong() {
/*  518 */     return 0L;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public short toshort() {
/*  528 */     return 0;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String tojstring() {
/*  538 */     return typename() + ": 0x" + Integer.toHexString(hashCode());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object touserdata() {
/*  547 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object touserdata(Class c) {
/*  557 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String toString() {
/*  568 */     return tojstring();
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
/*      */   public LuaValue tonumber() {
/*  590 */     return NIL;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue tostring() {
/*  608 */     return NIL;
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
/*      */   public boolean optboolean(boolean defval) {
/*  620 */     argerror("boolean"); return false;
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
/*      */ 
/*      */   
/*      */   public LuaClosure optclosure(LuaClosure defval) {
/*  634 */     argerror("function"); return null;
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double optdouble(double defval) {
/*  650 */     argerror("number"); return 0.0D;
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaFunction optfunction(LuaFunction defval) {
/*  666 */     argerror("function"); return null;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int optint(int defval) {
/*  683 */     argerror("int"); return 0;
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaInteger optinteger(LuaInteger defval) {
/*  699 */     argerror("integer"); return null;
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public long optlong(long defval) {
/*  715 */     argerror("long"); return 0L;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaNumber optnumber(LuaNumber defval) {
/*  732 */     argerror("number"); return null;
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
/*      */ 
/*      */   
/*      */   public String optjstring(String defval) {
/*  746 */     argerror("string"); return null;
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
/*      */ 
/*      */   
/*      */   public LuaString optstring(LuaString defval) {
/*  760 */     argerror("string"); return null;
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
/*      */   public LuaTable opttable(LuaTable defval) {
/*  772 */     argerror("table"); return null;
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
/*      */   public LuaThread optthread(LuaThread defval) {
/*  784 */     argerror("thread"); return null;
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
/*      */   
/*      */   public Object optuserdata(Object defval) {
/*  797 */     argerror("object"); return null;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public Object optuserdata(Class c, Object defval) {
/*  812 */     argerror(c.getName()); return null;
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
/*      */   public LuaValue optvalue(LuaValue defval) {
/*  824 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean checkboolean() {
/*  834 */     argerror("boolean"); return false;
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
/*      */   
/*      */   public LuaClosure checkclosure() {
/*  847 */     argerror("closure"); return null;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public double checkdouble() {
/*  862 */     argerror("number"); return 0.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaFunction checkfunction() {
/*  873 */     argerror("function"); return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Globals checkglobals() {
/*  882 */     argerror("globals"); return null;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public int checkint() {
/*  897 */     argerror("number"); return 0;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaInteger checkinteger() {
/*  912 */     argerror("integer"); return null;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public long checklong() {
/*  927 */     argerror("long"); return 0L;
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
/*      */ 
/*      */   
/*      */   public LuaNumber checknumber() {
/*  941 */     argerror("number"); return null;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaNumber checknumber(String msg) {
/*  956 */     throw new LuaError(msg);
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
/*      */ 
/*      */   
/*      */   public String checkjstring() {
/*  970 */     argerror("string"); return null;
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaString checkstring() {
/*  986 */     argerror("string"); return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaTable checktable() {
/*  995 */     argerror("table"); return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaThread checkthread() {
/* 1004 */     argerror("thread"); return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object checkuserdata() {
/* 1014 */     argerror("userdata"); return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Object checkuserdata(Class c) {
/* 1024 */     argerror("userdata"); return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue checknotnil() {
/* 1031 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isvalidkey() {
/* 1038 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaValue error(String message) {
/* 1045 */     throw new LuaError(message);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void assert_(boolean b, String msg) {
/* 1055 */     if (!b) throw new LuaError(msg);
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue argerror(String expected) {
/* 1062 */     throw new LuaError("bad argument (" + expected + " expected, got " + typename() + ")");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaValue argerror(int iarg, String msg) {
/* 1070 */     throw new LuaError("bad argument #" + iarg + ": " + msg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue typerror(String expected) {
/* 1077 */     throw new LuaError(expected + " expected, got " + typename());
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue unimplemented(String fun) {
/* 1083 */     throw new LuaError("'" + fun + "' not implemented for " + typename());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue illegal(String op, String typename) {
/* 1090 */     throw new LuaError("illegal operation '" + op + "' for " + typename);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue lenerror() {
/* 1097 */     throw new LuaError("attempt to get length of " + typename());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue aritherror() {
/* 1104 */     throw new LuaError("attempt to perform arithmetic on " + typename());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue aritherror(String fun) {
/* 1112 */     throw new LuaError("attempt to perform arithmetic '" + fun + "' on " + typename());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue compareerror(String rhs) {
/* 1120 */     throw new LuaError("attempt to compare " + typename() + " with " + rhs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue compareerror(LuaValue rhs) {
/* 1128 */     throw new LuaError("attempt to compare " + typename() + " with " + rhs.typename());
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
/*      */   public LuaValue get(LuaValue key) {
/* 1140 */     return gettable(this, key);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue get(int key) {
/* 1150 */     return get(LuaInteger.valueOf(key));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue get(String key) {
/* 1160 */     return get(valueOf(key));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void set(LuaValue key, LuaValue value) {
/* 1169 */     settable(this, key, value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void set(int key, LuaValue value) {
/* 1177 */     set(LuaInteger.valueOf(key), value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void set(int key, String value) {
/* 1185 */     set(key, valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void set(String key, LuaValue value) {
/* 1193 */     set(valueOf(key), value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void set(String key, double value) {
/* 1201 */     set(valueOf(key), valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void set(String key, int value) {
/* 1209 */     set(valueOf(key), valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void set(String key, String value) {
/* 1217 */     set(valueOf(key), valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue rawget(LuaValue key) {
/* 1224 */     return unimplemented("rawget");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue rawget(int key) {
/* 1231 */     return rawget(valueOf(key));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue rawget(String key) {
/* 1238 */     return rawget(valueOf(key));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawset(LuaValue key, LuaValue value) {
/* 1245 */     unimplemented("rawset");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawset(int key, LuaValue value) {
/* 1252 */     rawset(valueOf(key), value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawset(int key, String value) {
/* 1259 */     rawset(key, valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawset(String key, LuaValue value) {
/* 1266 */     rawset(valueOf(key), value);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawset(String key, double value) {
/* 1273 */     rawset(valueOf(key), valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawset(String key, int value) {
/* 1280 */     rawset(valueOf(key), valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawset(String key, String value) {
/* 1287 */     rawset(valueOf(key), valueOf(value));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void rawsetlist(int key0, Varargs values) {
/* 1296 */     for (int i = 0, n = values.narg(); i < n; ) { rawset(key0 + i, values.arg(i + 1)); i++; }
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void presize(int i) {
/* 1304 */     typerror("table");
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
/*      */   public Varargs next(LuaValue index) {
/* 1331 */     return typerror("table");
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
/*      */   public Varargs inext(LuaValue index) {
/* 1359 */     return typerror("table");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue load(LuaValue library) {
/* 1368 */     return library.call(EMPTYSTRING, this);
/*      */   }
/*      */   
/* 1371 */   public LuaValue arg(int index) { return (index == 1) ? this : NIL; }
/* 1372 */   public int narg() { return 1; } public LuaValue arg1() {
/* 1373 */     return this;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue getmetatable() {
/* 1388 */     return null;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue setmetatable(LuaValue metatable) {
/* 1403 */     return argerror("table");
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
/*      */   public LuaValue call() {
/* 1428 */     return callmt().call(this);
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
/*      */   public LuaValue call(LuaValue arg) {
/* 1454 */     return callmt().call(this, arg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue call(String arg) {
/* 1461 */     return call(valueOf(arg));
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
/*      */   public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 1488 */     return callmt().call(this, arg1, arg2);
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
/*      */   public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
/* 1516 */     return callmt().invoke(new LuaValue[] { this, arg1, arg2, arg3 }).arg1();
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
/*      */   public LuaValue method(String name) {
/* 1542 */     return get(name).call(this);
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
/*      */   public LuaValue method(LuaValue name) {
/* 1568 */     return get(name).call(this);
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
/*      */   public LuaValue method(String name, LuaValue arg) {
/* 1595 */     return get(name).call(this, arg);
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
/*      */   public LuaValue method(LuaValue name, LuaValue arg) {
/* 1622 */     return get(name).call(this, arg);
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
/*      */   public LuaValue method(String name, LuaValue arg1, LuaValue arg2) {
/* 1649 */     return get(name).call(this, arg1, arg2);
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
/*      */   public LuaValue method(LuaValue name, LuaValue arg1, LuaValue arg2) {
/* 1676 */     return get(name).call(this, arg1, arg2);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Varargs invoke() {
/* 1697 */     return invoke(NONE);
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
/*      */   public Varargs invoke(Varargs args) {
/* 1721 */     return callmt().invoke(this, args);
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
/*      */   public Varargs invoke(LuaValue arg, Varargs varargs) {
/* 1745 */     return invoke(varargsOf(arg, varargs));
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
/*      */   public Varargs invoke(LuaValue arg1, LuaValue arg2, Varargs varargs) {
/* 1770 */     return invoke(varargsOf(arg1, arg2, varargs));
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
/*      */   public Varargs invoke(LuaValue[] args) {
/* 1793 */     return invoke(varargsOf(args));
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
/*      */   public Varargs invoke(LuaValue[] args, Varargs varargs) {
/* 1819 */     return invoke(varargsOf(args, varargs));
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
/*      */   public Varargs invokemethod(String name) {
/* 1847 */     return get(name).invoke(this);
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
/*      */   public Varargs invokemethod(LuaValue name) {
/* 1875 */     return get(name).invoke(this);
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
/*      */   public Varargs invokemethod(String name, Varargs args) {
/* 1904 */     return get(name).invoke(varargsOf(this, args));
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
/*      */   public Varargs invokemethod(LuaValue name, Varargs args) {
/* 1933 */     return get(name).invoke(varargsOf(this, args));
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
/*      */   public Varargs invokemethod(String name, LuaValue[] args) {
/* 1963 */     return get(name).invoke(varargsOf(this, varargsOf(args)));
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
/*      */   public Varargs invokemethod(LuaValue name, LuaValue[] args) {
/* 1993 */     return get(name).invoke(varargsOf(this, varargsOf(args)));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected LuaValue callmt() {
/* 2001 */     return checkmetatag(CALL, "attempt to call ");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue not() {
/* 2007 */     return FALSE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue neg() {
/* 2015 */     return checkmetatag(UNM, "attempt to perform arithmetic on ").call(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue len() {
/* 2022 */     return checkmetatag(LEN, "attempt to get length of ").call(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int length() {
/* 2029 */     return len().toint();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int rawlen() {
/* 2035 */     typerror("table or string"); return 0;
/*      */   }
/*      */   public boolean equals(Object obj) {
/* 2038 */     return (this == obj);
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
/*      */ 
/*      */   
/*      */   public LuaValue eq(LuaValue val) {
/* 2052 */     return eq_b(val) ? TRUE : FALSE;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean eq_b(LuaValue val) {
/* 2067 */     return (this == val);
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
/*      */   
/*      */   public LuaValue neq(LuaValue val) {
/* 2080 */     return eq_b(val) ? FALSE : TRUE;
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
/*      */   
/*      */   public boolean neq_b(LuaValue val) {
/* 2093 */     return !eq_b(val);
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
/*      */   
/*      */   public boolean raweq(LuaValue val) {
/* 2106 */     return (this == val);
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
/*      */   public boolean raweq(LuaUserdata val) {
/* 2118 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean raweq(LuaString val) {
/* 2127 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean raweq(double val) {
/* 2136 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean raweq(int val) {
/* 2145 */     return false;
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
/*      */ 
/*      */ 
/*      */   
/*      */   public static final boolean eqmtcall(LuaValue lhs, LuaValue lhsmt, LuaValue rhs, LuaValue rhsmt) {
/* 2160 */     LuaValue h = lhsmt.rawget(EQ);
/* 2161 */     return (h.isnil() || h != rhsmt.rawget(EQ)) ? false : h.call(lhs, rhs).toboolean();
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue add(LuaValue rhs) {
/* 2177 */     return arithmt(ADD, rhs);
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
/*      */   
/*      */   public LuaValue add(double rhs) {
/* 2190 */     return arithmtwith(ADD, rhs);
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
/*      */   
/*      */   public LuaValue add(int rhs) {
/* 2203 */     return add(rhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue sub(LuaValue rhs) {
/* 2219 */     return arithmt(SUB, rhs);
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
/*      */   
/*      */   public LuaValue sub(double rhs) {
/* 2232 */     return aritherror("sub");
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
/*      */   
/*      */   public LuaValue sub(int rhs) {
/* 2245 */     return aritherror("sub");
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue subFrom(double lhs) {
/* 2260 */     return arithmtwith(SUB, lhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue subFrom(int lhs) {
/* 2277 */     return subFrom(lhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue mul(LuaValue rhs) {
/* 2293 */     return arithmt(MUL, rhs);
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
/*      */   
/*      */   public LuaValue mul(double rhs) {
/* 2306 */     return arithmtwith(MUL, rhs);
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
/*      */   
/*      */   public LuaValue mul(int rhs) {
/* 2319 */     return mul(rhs);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue pow(LuaValue rhs) {
/* 2334 */     return arithmt(POW, rhs);
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
/*      */   
/*      */   public LuaValue pow(double rhs) {
/* 2347 */     return aritherror("pow");
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
/*      */   
/*      */   public LuaValue pow(int rhs) {
/* 2360 */     return aritherror("pow");
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue powWith(double lhs) {
/* 2375 */     return arithmtwith(POW, lhs);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue powWith(int lhs) {
/* 2390 */     return powWith(lhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue div(LuaValue rhs) {
/* 2406 */     return arithmt(DIV, rhs);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue div(double rhs) {
/* 2421 */     return aritherror("div");
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue div(int rhs) {
/* 2436 */     return aritherror("div");
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue divInto(double lhs) {
/* 2451 */     return arithmtwith(DIV, lhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue mod(LuaValue rhs) {
/* 2467 */     return arithmt(MOD, rhs);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue mod(double rhs) {
/* 2482 */     return aritherror("mod");
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue mod(int rhs) {
/* 2497 */     return aritherror("mod");
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
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue modFrom(double lhs) {
/* 2512 */     return arithmtwith(MOD, lhs);
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
/*      */   protected LuaValue arithmt(LuaValue tag, LuaValue op2) {
/* 2536 */     LuaValue h = metatag(tag);
/* 2537 */     if (h.isnil()) {
/* 2538 */       h = op2.metatag(tag);
/* 2539 */       if (h.isnil())
/* 2540 */         error("attempt to perform arithmetic " + tag + " on " + typename() + " and " + op2.typename()); 
/*      */     } 
/* 2542 */     return h.call(this, op2);
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
/*      */   protected LuaValue arithmtwith(LuaValue tag, double op1) {
/* 2567 */     LuaValue h = metatag(tag);
/* 2568 */     if (h.isnil())
/* 2569 */       error("attempt to perform arithmetic " + tag + " on number and " + typename()); 
/* 2570 */     return h.call(valueOf(op1), this);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue lt(LuaValue rhs) {
/* 2588 */     return comparemt(LT, rhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue lt(double rhs) {
/* 2604 */     return compareerror("number");
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue lt(int rhs) {
/* 2620 */     return compareerror("number");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean lt_b(LuaValue rhs) {
/* 2637 */     return comparemt(LT, rhs).toboolean();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean lt_b(int rhs) {
/* 2654 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean lt_b(double rhs) {
/* 2671 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue lteq(LuaValue rhs) {
/* 2688 */     return comparemt(LE, rhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue lteq(double rhs) {
/* 2704 */     return compareerror("number");
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue lteq(int rhs) {
/* 2720 */     return compareerror("number");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean lteq_b(LuaValue rhs) {
/* 2737 */     return comparemt(LE, rhs).toboolean();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean lteq_b(int rhs) {
/* 2754 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean lteq_b(double rhs) {
/* 2771 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue gt(LuaValue rhs) {
/* 2788 */     return rhs.comparemt(LE, this);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue gt(double rhs) {
/* 2804 */     return compareerror("number");
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue gt(int rhs) {
/* 2820 */     return compareerror("number");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gt_b(LuaValue rhs) {
/* 2837 */     return rhs.comparemt(LE, this).toboolean();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gt_b(int rhs) {
/* 2854 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gt_b(double rhs) {
/* 2871 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue gteq(LuaValue rhs) {
/* 2888 */     return rhs.comparemt(LT, this);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue gteq(double rhs) {
/* 2904 */     return compareerror("number");
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue gteq(int rhs) {
/* 2920 */     return valueOf((todouble() >= rhs));
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gteq_b(LuaValue rhs) {
/* 2937 */     return rhs.comparemt(LT, this).toboolean();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gteq_b(int rhs) {
/* 2954 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean gteq_b(double rhs) {
/* 2971 */     compareerror("number"); return false;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue comparemt(LuaValue tag, LuaValue op1) {
/*      */     LuaValue h;
/* 2990 */     if (!(h = metatag(tag)).isnil() || !(h = op1.metatag(tag)).isnil())
/* 2991 */       return h.call(this, op1); 
/* 2992 */     if (LE.raweq(tag) && (!(h = metatag(LT)).isnil() || !(h = op1.metatag(LT)).isnil()))
/* 2993 */       return h.call(op1, this).not(); 
/* 2994 */     return error("bad argument: attempt to compare " + tag + " on " + typename() + " and " + op1.typename());
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
/*      */ 
/*      */   
/*      */   public int strcmp(LuaValue rhs) {
/* 3008 */     error("attempt to compare " + typename()); return 0;
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
/*      */   
/*      */   public int strcmp(LuaString rhs) {
/* 3021 */     error("attempt to compare " + typename()); return 0;
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
/*      */   
/*      */   public LuaValue concat(LuaValue rhs) {
/* 3034 */     return concatmt(rhs);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue concatTo(LuaValue lhs) {
/* 3050 */     return lhs.concatmt(this);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue concatTo(LuaNumber lhs) {
/* 3066 */     return lhs.concatmt(this);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue concatTo(LuaString lhs) {
/* 3082 */     return lhs.concatmt(this);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Buffer buffer() {
/* 3088 */     return new Buffer(this);
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
/*      */   
/*      */   public Buffer concat(Buffer rhs) {
/* 3101 */     return rhs.concatTo(this);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue concatmt(LuaValue rhs) {
/* 3112 */     LuaValue h = metatag(CONCAT);
/* 3113 */     if (h.isnil() && (h = rhs.metatag(CONCAT)).isnil())
/* 3114 */       error("attempt to concatenate " + typename() + " and " + rhs.typename()); 
/* 3115 */     return h.call(this, rhs);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue and(LuaValue rhs) {
/* 3124 */     return toboolean() ? rhs : this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue or(LuaValue rhs) {
/* 3132 */     return toboolean() ? this : rhs;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean testfor_b(LuaValue limit, LuaValue step) {
/* 3142 */     return step.gt_b(0) ? lteq_b(limit) : gteq_b(limit);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaString strvalue() {
/* 3150 */     typerror("string or number"); return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue strongvalue() {
/* 3156 */     return this;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaBoolean valueOf(boolean b) {
/* 3163 */     return b ? TRUE : FALSE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaInteger valueOf(int i) {
/* 3170 */     return LuaInteger.valueOf(i);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaNumber valueOf(double d) {
/* 3179 */     return LuaDouble.valueOf(d);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaString valueOf(String s) {
/* 3186 */     return LuaString.valueOf(s);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaString valueOf(byte[] bytes) {
/* 3193 */     return LuaString.valueOf(bytes);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaString valueOf(byte[] bytes, int off, int len) {
/* 3203 */     return LuaString.valueOf(bytes, off, len);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaTable tableOf() {
/* 3209 */     return new LuaTable();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaTable tableOf(Varargs varargs, int firstarg) {
/* 3216 */     return new LuaTable(varargs, firstarg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaTable tableOf(int narray, int nhash) {
/* 3223 */     return new LuaTable(narray, nhash);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaTable listOf(LuaValue[] unnamedValues) {
/* 3229 */     return new LuaTable(null, unnamedValues, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaTable listOf(LuaValue[] unnamedValues, Varargs lastarg) {
/* 3237 */     return new LuaTable(null, unnamedValues, lastarg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaTable tableOf(LuaValue[] namedValues) {
/* 3244 */     return new LuaTable(namedValues, null, null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaTable tableOf(LuaValue[] namedValues, LuaValue[] unnamedValues) {
/* 3255 */     return new LuaTable(namedValues, unnamedValues, null);
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
/*      */   
/*      */   public static LuaTable tableOf(LuaValue[] namedValues, LuaValue[] unnamedValues, Varargs lastarg) {
/* 3268 */     return new LuaTable(namedValues, unnamedValues, lastarg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaUserdata userdataOf(Object o) {
/* 3275 */     return new LuaUserdata(o);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static LuaUserdata userdataOf(Object o, LuaValue metatable) {
/* 3283 */     return new LuaUserdata(o, metatable);
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
/*      */ 
/*      */ 
/*      */   
/*      */   protected static LuaValue gettable(LuaValue t, LuaValue key) {
/* 3298 */     int loop = 0; while (true) {
/*      */       LuaValue tm;
/* 3300 */       if (t.istable()) {
/* 3301 */         LuaValue res = t.rawget(key);
/* 3302 */         if (!res.isnil() || (tm = t.metatag(INDEX)).isnil())
/* 3303 */           return res; 
/* 3304 */       } else if ((tm = t.metatag(INDEX)).isnil()) {
/* 3305 */         t.indexerror(key.tojstring());
/* 3306 */       }  if (tm.isfunction())
/* 3307 */         return tm.call(t, key); 
/* 3308 */       t = tm;
/*      */       
/* 3310 */       if (++loop >= 100) {
/* 3311 */         error("loop in gettable");
/* 3312 */         return NIL;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected static boolean settable(LuaValue t, LuaValue key, LuaValue value) {
/* 3325 */     int loop = 0; while (true) {
/*      */       LuaValue tm;
/* 3327 */       if (t.istable()) {
/* 3328 */         if (!t.rawget(key).isnil() || (tm = t.metatag(NEWINDEX)).isnil()) {
/* 3329 */           t.rawset(key, value);
/* 3330 */           return true;
/*      */         } 
/* 3332 */       } else if ((tm = t.metatag(NEWINDEX)).isnil()) {
/* 3333 */         throw new LuaError("table expected for set index ('" + key + "') value, got " + t.typename());
/* 3334 */       }  if (tm.isfunction()) {
/* 3335 */         tm.call(t, key, value);
/* 3336 */         return true;
/*      */       } 
/* 3338 */       t = tm;
/*      */       
/* 3340 */       if (++loop >= 100) {
/* 3341 */         error("loop in settable");
/* 3342 */         return false;
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue metatag(LuaValue tag) {
/* 3352 */     LuaValue mt = getmetatable();
/* 3353 */     if (mt == null)
/* 3354 */       return NIL; 
/* 3355 */     return mt.rawget(tag);
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
/*      */   protected LuaValue checkmetatag(LuaValue tag, String reason) {
/* 3367 */     LuaValue h = metatag(tag);
/* 3368 */     if (h.isnil())
/* 3369 */       throw new LuaError(reason + "a " + typename() + " value"); 
/* 3370 */     return h;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static Metatable metatableOf(LuaValue mt) {
/* 3375 */     if (mt != null && mt.istable()) {
/* 3376 */       LuaValue mode = mt.rawget(MODE);
/* 3377 */       if (mode.isstring()) {
/* 3378 */         String m = mode.tojstring();
/* 3379 */         boolean weakkeys = (m.indexOf('k') >= 0);
/* 3380 */         boolean weakvalues = (m.indexOf('v') >= 0);
/* 3381 */         if (weakkeys || weakvalues) {
/* 3382 */           return new WeakTable(weakkeys, weakvalues, mt);
/*      */         }
/*      */       } 
/* 3385 */       return (LuaTable)mt;
/* 3386 */     }  if (mt != null) {
/* 3387 */       return new NonTableMetatable(mt);
/*      */     }
/* 3389 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void indexerror(String key) {
/* 3397 */     error("attempt to index ? (a " + typename() + " value) with key '" + key + "'");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Varargs varargsOf(LuaValue[] v) {
/* 3408 */     switch (v.length) { case 0:
/* 3409 */         return NONE;
/* 3410 */       case 1: return v[0];
/* 3411 */       case 2: return new Varargs.PairVarargs(v[0], v[1]); }
/* 3412 */      return new Varargs.ArrayVarargs(v, NONE);
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
/*      */   
/*      */   public static Varargs varargsOf(LuaValue[] v, Varargs r) {
/* 3425 */     switch (v.length) { case 0:
/* 3426 */         return r;
/* 3427 */       case 1: return (r.narg() > 0) ? 
/* 3428 */           new Varargs.PairVarargs(v[0], r) : 
/* 3429 */           v[0];
/* 3430 */       case 2: return (r.narg() > 0) ? 
/* 3431 */           new Varargs.ArrayVarargs(v, r) : 
/* 3432 */           new Varargs.PairVarargs(v[0], v[1]); }
/* 3433 */      return new Varargs.ArrayVarargs(v, r);
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
/*      */ 
/*      */   
/*      */   public static Varargs varargsOf(LuaValue[] v, int offset, int length) {
/* 3447 */     switch (length) { case 0:
/* 3448 */         return NONE;
/* 3449 */       case 1: return v[offset];
/* 3450 */       case 2: return new Varargs.PairVarargs(v[offset + 0], v[offset + 1]); }
/* 3451 */      return new Varargs.ArrayPartVarargs(v, offset, length, NONE);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Varargs varargsOf(LuaValue[] v, int offset, int length, Varargs more) {
/* 3469 */     switch (length) { case 0:
/* 3470 */         return more;
/* 3471 */       case 1: return (more.narg() > 0) ? 
/* 3472 */           new Varargs.PairVarargs(v[offset], more) : 
/* 3473 */           v[offset];
/* 3474 */       case 2: return (more.narg() > 0) ? 
/* 3475 */           new Varargs.ArrayPartVarargs(v, offset, length, more) : 
/* 3476 */           new Varargs.PairVarargs(v[offset], v[offset + 1]); }
/* 3477 */      return new Varargs.ArrayPartVarargs(v, offset, length, more);
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
/*      */ 
/*      */ 
/*      */   
/*      */   public static Varargs varargsOf(LuaValue v, Varargs r) {
/* 3492 */     switch (r.narg()) { case 0:
/* 3493 */         return v; }
/* 3494 */      return new Varargs.PairVarargs(v, r);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Varargs varargsOf(LuaValue v1, LuaValue v2, Varargs v3) {
/* 3510 */     switch (v3.narg()) { case 0:
/* 3511 */         return new Varargs.PairVarargs(v1, v2); }
/* 3512 */      return new Varargs.ArrayPartVarargs(new LuaValue[] { v1, v2 }, 0, 2, v3);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Varargs tailcallOf(LuaValue func, Varargs args) {
/* 3533 */     return new TailcallVarargs(func, args);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Varargs onInvoke(Varargs args) {
/* 3551 */     return invoke(args);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void initupvalue1(LuaValue env) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static final class None
/*      */     extends LuaNil
/*      */   {
/* 3569 */     static None _NONE = new None();
/* 3570 */     public LuaValue arg(int i) { return NIL; }
/* 3571 */     public int narg() { return 0; }
/* 3572 */     public LuaValue arg1() { return NIL; }
/* 3573 */     public String tojstring() { return "none"; }
/* 3574 */     public Varargs subargs(int start) { return (start > 0) ? this : argerror(1, "start must be > 0"); } void copyto(LuaValue[] dest, int offset, int length) {
/* 3575 */       while (length > 0) { dest[offset++] = NIL; length--; }
/*      */     
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Varargs subargs(int start) {
/* 3584 */     if (start == 1)
/* 3585 */       return this; 
/* 3586 */     if (start > 1)
/* 3587 */       return NONE; 
/* 3588 */     return argerror(1, "start must be > 0");
/*      */   }
/*      */   
/*      */   public abstract int type();
/*      */   
/*      */   public abstract String typename();
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */