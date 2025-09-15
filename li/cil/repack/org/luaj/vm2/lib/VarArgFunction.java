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
/*    */ public abstract class VarArgFunction
/*    */   extends LibFunction
/*    */ {
/*    */   public LuaValue call() {
/* 58 */     return invoke((Varargs)NONE).arg1();
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue call(LuaValue arg) {
/* 63 */     return invoke((Varargs)arg).arg1();
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 68 */     return invoke(varargsOf(arg1, (Varargs)arg2)).arg1();
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
/* 73 */     return invoke(varargsOf(arg1, arg2, (Varargs)arg3)).arg1();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Varargs invoke(Varargs args) {
/* 85 */     return onInvoke(args).eval();
/*    */   }
/*    */ 
/*    */   
/*    */   public Varargs onInvoke(Varargs args) {
/* 90 */     return invoke(args);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\VarArgFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */