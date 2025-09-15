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
/*    */ public class Upvaldesc
/*    */ {
/*    */   public LuaString name;
/*    */   public final boolean instack;
/*    */   public final short idx;
/*    */   
/*    */   public Upvaldesc(LuaString name, boolean instack, int idx) {
/* 36 */     this.name = name;
/* 37 */     this.instack = instack;
/* 38 */     this.idx = (short)idx;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 43 */     return this.idx + (this.instack ? " instack " : " closed ") + String.valueOf(this.name);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\Upvaldesc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */