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
/*    */ public abstract class OneArgFunction
/*    */   extends LibFunction
/*    */ {
/*    */   public abstract LuaValue call(LuaValue paramLuaValue);
/*    */   
/*    */   public final LuaValue call() {
/* 62 */     return call(NIL);
/*    */   }
/*    */ 
/*    */   
/*    */   public final LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 67 */     return call(arg1);
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
/* 72 */     return call(arg1);
/*    */   }
/*    */ 
/*    */   
/*    */   public Varargs invoke(Varargs varargs) {
/* 77 */     return (Varargs)call(varargs.arg1());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\OneArgFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */