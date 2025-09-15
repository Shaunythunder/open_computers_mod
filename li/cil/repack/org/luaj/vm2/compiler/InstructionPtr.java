/*    */ package li.cil.repack.org.luaj.vm2.compiler;
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
/*    */ class InstructionPtr
/*    */ {
/*    */   final int[] code;
/*    */   final int idx;
/*    */   
/*    */   InstructionPtr(int[] code, int idx) {
/* 29 */     this.code = code;
/* 30 */     this.idx = idx;
/*    */   }
/*    */   
/*    */   int get() {
/* 34 */     return this.code[this.idx];
/*    */   }
/*    */   
/*    */   void set(int value) {
/* 38 */     this.code[this.idx] = value;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\compiler\InstructionPtr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */