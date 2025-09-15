/*    */ package li.cil.repack.org.luaj.vm2;
/*    */ 
/*    */ 
/*    */ class NonTableMetatable
/*    */   implements Metatable
/*    */ {
/*    */   private final LuaValue value;
/*    */   
/*    */   public NonTableMetatable(LuaValue value) {
/* 10 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean useWeakKeys() {
/* 15 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean useWeakValues() {
/* 20 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue toLuaValue() {
/* 25 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaTable.Slot entry(LuaValue key, LuaValue value) {
/* 30 */     return LuaTable.defaultEntry(key, value);
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue wrap(LuaValue value) {
/* 35 */     return value;
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue arrayget(LuaValue[] array, int index) {
/* 40 */     return array[index];
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\NonTableMetatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */