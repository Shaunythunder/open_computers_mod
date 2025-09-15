/*    */ package li.cil.repack.org.luaj.vm2.lib;
/*    */ 
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
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
/*    */ public abstract class ZeroArgFunction
/*    */   extends LibFunction
/*    */ {
/*    */   public abstract LuaValue call();
/*    */   
/*    */   public LuaValue call(LuaValue arg) {
/* 60 */     return call();
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 65 */     return call();
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
/* 70 */     return call();
/*    */   }
/*    */ 
/*    */   
/*    */   public Varargs invoke(Varargs varargs) {
/* 75 */     return (Varargs)call();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\ZeroArgFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */