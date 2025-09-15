/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.lib.MathLib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.TwoArgFunction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JseMathLib
/*     */   extends MathLib
/*     */ {
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/*  95 */     super.call(modname, env);
/*  96 */     LuaValue math = env.get("math");
/*  97 */     math.set("acos", (LuaValue)new acos());
/*  98 */     math.set("asin", (LuaValue)new asin());
/*  99 */     math.set("atan", (LuaValue)new atan());
/* 100 */     math.set("atan2", (LuaValue)new atan2());
/* 101 */     math.set("cosh", (LuaValue)new cosh());
/* 102 */     math.set("exp", (LuaValue)new exp());
/* 103 */     math.set("log", (LuaValue)new log());
/* 104 */     math.set("pow", (LuaValue)new pow());
/* 105 */     math.set("sinh", (LuaValue)new sinh());
/* 106 */     math.set("tanh", (LuaValue)new tanh());
/* 107 */     return math;
/*     */   }
/*     */   
/*     */   static final class acos extends MathLib.UnaryOp {
/*     */     protected double call(double d) {
/* 112 */       return Math.acos(d);
/*     */     } }
/*     */   
/*     */   static final class asin extends MathLib.UnaryOp {
/*     */     protected double call(double d) {
/* 117 */       return Math.asin(d);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class atan extends TwoArgFunction {
/*     */     public LuaValue call(LuaValue x, LuaValue y) {
/* 123 */       return (LuaValue)valueOf(Math.atan2(x.checkdouble(), y.optdouble(1.0D)));
/*     */     }
/*     */   }
/*     */   
/*     */   static final class atan2
/*     */     extends TwoArgFunction {
/*     */     public LuaValue call(LuaValue x, LuaValue y) {
/* 130 */       return (LuaValue)valueOf(Math.atan2(x.checkdouble(), y.checkdouble()));
/*     */     }
/*     */   }
/*     */   
/*     */   static final class cosh extends MathLib.UnaryOp {
/*     */     protected double call(double d) {
/* 136 */       return Math.cosh(d);
/*     */     } }
/*     */   
/*     */   static final class exp extends MathLib.UnaryOp {
/*     */     protected double call(double d) {
/* 141 */       return Math.exp(d);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class log extends TwoArgFunction {
/*     */     public LuaValue call(LuaValue x, LuaValue base) {
/* 147 */       double nat = Math.log(x.checkdouble());
/* 148 */       double b = base.optdouble(Math.E);
/* 149 */       if (b != Math.E)
/* 150 */         nat /= Math.log(b); 
/* 151 */       return (LuaValue)valueOf(nat);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class pow extends MathLib.BinaryOp {
/*     */     protected double call(double x, double y) {
/* 157 */       return Math.pow(x, y);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class sinh extends MathLib.UnaryOp { protected double call(double d) {
/* 162 */       return Math.sinh(d);
/*     */     } }
/*     */   
/*     */   static final class tanh extends MathLib.UnaryOp {
/*     */     protected double call(double d) {
/* 167 */       return Math.tanh(d);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public double dpow_lib(double a, double b) {
/* 173 */     return Math.pow(a, b);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JseMathLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */