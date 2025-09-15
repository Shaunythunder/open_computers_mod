/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaNil
/*     */   extends LuaValue
/*     */ {
/*  42 */   static final LuaNil _NIL = new LuaNil();
/*     */ 
/*     */   
/*     */   public static LuaValue s_metatable;
/*     */ 
/*     */ 
/*     */   
/*     */   public int type() {
/*  50 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  55 */     return "nil";
/*     */   }
/*     */ 
/*     */   
/*     */   public String typename() {
/*  60 */     return "nil";
/*     */   }
/*     */ 
/*     */   
/*     */   public String tojstring() {
/*  65 */     return "nil";
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue not() {
/*  70 */     return LuaValue.TRUE;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean toboolean() {
/*  75 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isnil() {
/*  80 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue getmetatable() {
/*  85 */     return s_metatable;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/*  90 */     return o instanceof LuaNil;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue checknotnil() {
/*  95 */     return argerror("value");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isvalidkey() {
/* 100 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean optboolean(boolean defval) {
/* 105 */     return defval;
/*     */   }
/*     */   public LuaClosure optclosure(LuaClosure defval) {
/* 108 */     return defval;
/*     */   }
/*     */   public double optdouble(double defval) {
/* 111 */     return defval;
/*     */   }
/*     */   public LuaFunction optfunction(LuaFunction defval) {
/* 114 */     return defval;
/*     */   }
/*     */   public int optint(int defval) {
/* 117 */     return defval;
/*     */   }
/*     */   public LuaInteger optinteger(LuaInteger defval) {
/* 120 */     return defval;
/*     */   }
/*     */   public long optlong(long defval) {
/* 123 */     return defval;
/*     */   }
/*     */   public LuaNumber optnumber(LuaNumber defval) {
/* 126 */     return defval;
/*     */   }
/*     */   public LuaTable opttable(LuaTable defval) {
/* 129 */     return defval;
/*     */   }
/*     */   public LuaThread optthread(LuaThread defval) {
/* 132 */     return defval;
/*     */   }
/*     */   public String optjstring(String defval) {
/* 135 */     return defval;
/*     */   }
/*     */   public LuaString optstring(LuaString defval) {
/* 138 */     return defval;
/*     */   }
/*     */   public Object optuserdata(Object defval) {
/* 141 */     return defval;
/*     */   }
/*     */   public Object optuserdata(Class c, Object defval) {
/* 144 */     return defval;
/*     */   }
/*     */   public LuaValue optvalue(LuaValue defval) {
/* 147 */     return defval;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaNil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */