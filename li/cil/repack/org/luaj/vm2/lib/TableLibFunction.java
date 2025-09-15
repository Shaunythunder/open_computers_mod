/*   */ package li.cil.repack.org.luaj.vm2.lib;
/*   */ 
/*   */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*   */ 
/*   */ class TableLibFunction
/*   */   extends LibFunction {
/*   */   public LuaValue call() {
/* 8 */     return argerror(1, "table expected, got no value");
/*   */   }
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\TableLibFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */