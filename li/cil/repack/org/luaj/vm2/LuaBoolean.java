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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class LuaBoolean
/*     */   extends LuaValue
/*     */ {
/*  45 */   static final LuaBoolean _TRUE = new LuaBoolean(true);
/*     */ 
/*     */   
/*  48 */   static final LuaBoolean _FALSE = new LuaBoolean(false);
/*     */ 
/*     */   
/*     */   public static LuaValue s_metatable;
/*     */   
/*     */   public final boolean v;
/*     */ 
/*     */   
/*     */   LuaBoolean(boolean b) {
/*  57 */     this.v = b;
/*     */   }
/*     */ 
/*     */   
/*     */   public int type() {
/*  62 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String typename() {
/*  67 */     return "boolean";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isboolean() {
/*  72 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue not() {
/*  77 */     return this.v ? FALSE : LuaValue.TRUE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean booleanValue() {
/*  86 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean toboolean() {
/*  91 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public String tojstring() {
/*  96 */     return this.v ? "true" : "false";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean optboolean(boolean defval) {
/* 101 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean checkboolean() {
/* 106 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue getmetatable() {
/* 111 */     return s_metatable;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaBoolean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */