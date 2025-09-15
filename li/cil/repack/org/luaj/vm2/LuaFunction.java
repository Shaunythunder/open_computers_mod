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
/*     */ public abstract class LuaFunction
/*     */   extends LuaValue
/*     */ {
/*     */   public static LuaValue s_metatable;
/*     */   
/*     */   public int type() {
/*  43 */     return 6;
/*     */   }
/*     */ 
/*     */   
/*     */   public String typename() {
/*  48 */     return "function";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isfunction() {
/*  53 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaFunction checkfunction() {
/*  58 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaFunction optfunction(LuaFunction defval) {
/*  63 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue getmetatable() {
/*  68 */     return s_metatable;
/*     */   }
/*     */ 
/*     */   
/*     */   public String tojstring() {
/*  73 */     return "function: " + classnamestub();
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaString strvalue() {
/*  78 */     return valueOf(tojstring());
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
/*     */   public String classnamestub() {
/*  90 */     String s = getClass().getName();
/*  91 */     int offset = Math.max(s.lastIndexOf('.'), s.lastIndexOf('$')) + 1;
/*  92 */     if (s.charAt(offset) == '_')
/*  93 */       offset++; 
/*  94 */     return s.substring(offset);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String name() {
/* 105 */     return classnamestub();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */