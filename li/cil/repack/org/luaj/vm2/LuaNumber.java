/*    */ package li.cil.repack.org.luaj.vm2;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class LuaNumber
/*    */   extends LuaValue
/*    */ {
/*    */   public static LuaValue s_metatable;
/*    */   
/*    */   public int type() {
/* 42 */     return 3;
/*    */   }
/*    */ 
/*    */   
/*    */   public String typename() {
/* 47 */     return "number";
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaNumber checknumber() {
/* 52 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaNumber checknumber(String errmsg) {
/* 57 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaNumber optnumber(LuaNumber defval) {
/* 62 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue tonumber() {
/* 67 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isnumber() {
/* 72 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isstring() {
/* 77 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue getmetatable() {
/* 82 */     return s_metatable;
/*    */   }
/*    */   
/*    */   public LuaValue concat(LuaValue rhs) {
/* 86 */     return rhs.concatTo(this);
/*    */   }
/*    */   public Buffer concat(Buffer rhs) {
/* 89 */     return rhs.concatTo(this);
/*    */   }
/*    */   public LuaValue concatTo(LuaNumber lhs) {
/* 92 */     return strvalue().concatTo(lhs.strvalue());
/*    */   }
/*    */   public LuaValue concatTo(LuaString lhs) {
/* 95 */     return strvalue().concatTo(lhs);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaNumber.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */