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
/*    */ 
/*    */ public final class UpValue
/*    */ {
/*    */   LuaValue[] array;
/*    */   int index;
/*    */   
/*    */   public UpValue(LuaValue[] stack, int index) {
/* 43 */     this.array = stack;
/* 44 */     this.index = index;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 49 */     return this.index + "/" + this.array.length + " " + this.array[this.index];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String tojstring() {
/* 59 */     return this.array[this.index].tojstring();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public LuaValue getValue() {
/* 67 */     return this.array[this.index];
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValue(LuaValue value) {
/* 74 */     this.array[this.index] = value;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void close() {
/* 80 */     LuaValue[] old = this.array;
/* 81 */     this.array = new LuaValue[] { old[this.index] };
/* 82 */     old[this.index] = null;
/* 83 */     this.index = 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\UpValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */