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
/*    */ 
/*    */ 
/*    */ public class LocVars
/*    */ {
/*    */   public LuaString varname;
/*    */   public int startpc;
/*    */   public int endpc;
/*    */   
/*    */   public LocVars(LuaString varname, int startpc, int endpc) {
/* 46 */     this.varname = varname;
/* 47 */     this.startpc = startpc;
/* 48 */     this.endpc = endpc;
/*    */   }
/*    */   
/*    */   public String tojstring() {
/* 52 */     return this.varname + " " + this.startpc + "-" + this.endpc;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LocVars.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */