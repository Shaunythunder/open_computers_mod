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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ThreeArgFunction
/*    */   extends LibFunction
/*    */ {
/*    */   public abstract LuaValue call(LuaValue paramLuaValue1, LuaValue paramLuaValue2, LuaValue paramLuaValue3);
/*    */   
/*    */   public final LuaValue call() {
/* 63 */     return call(NIL, NIL, NIL);
/*    */   }
/*    */ 
/*    */   
/*    */   public final LuaValue call(LuaValue arg) {
/* 68 */     return call(arg, NIL, NIL);
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 73 */     return call(arg1, arg2, NIL);
/*    */   }
/*    */ 
/*    */   
/*    */   public Varargs invoke(Varargs varargs) {
/* 78 */     return (Varargs)call(varargs.arg1(), varargs.arg(2), varargs.arg(3));
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\ThreeArgFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */