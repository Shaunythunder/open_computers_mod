/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
/*     */ import java.util.Random;
/*     */ import li.cil.repack.org.luaj.vm2.LuaDouble;
/*     */ import li.cil.repack.org.luaj.vm2.LuaNumber;
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MathLib
/*     */   extends TwoArgFunction
/*     */ {
/* 103 */   public static MathLib MATHLIB = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MathLib() {
/* 111 */     MATHLIB = this;
/*     */   }
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
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/* 126 */     LuaTable math = new LuaTable(0, 30);
/* 127 */     math.set("abs", (LuaValue)new abs());
/* 128 */     math.set("ceil", (LuaValue)new ceil());
/* 129 */     math.set("cos", (LuaValue)new cos());
/* 130 */     math.set("deg", (LuaValue)new deg());
/* 131 */     math.set("exp", (LuaValue)new exp(this));
/* 132 */     math.set("floor", (LuaValue)new floor());
/* 133 */     math.set("fmod", (LuaValue)new fmod());
/* 134 */     math.set("frexp", (LuaValue)new frexp());
/* 135 */     math.set("huge", (LuaValue)LuaDouble.POSINF);
/* 136 */     math.set("ldexp", (LuaValue)new ldexp());
/* 137 */     math.set("max", (LuaValue)new max());
/* 138 */     math.set("min", (LuaValue)new min());
/* 139 */     math.set("modf", (LuaValue)new modf());
/* 140 */     math.set("pi", Math.PI);
/* 141 */     math.set("pow", (LuaValue)new pow());
/*     */     random r;
/* 143 */     math.set("random", (LuaValue)(r = new random()));
/* 144 */     math.set("randomseed", (LuaValue)new randomseed(r));
/* 145 */     math.set("rad", (LuaValue)new rad());
/* 146 */     math.set("sin", (LuaValue)new sin());
/* 147 */     math.set("sqrt", (LuaValue)new sqrt());
/* 148 */     math.set("tan", (LuaValue)new tan());
/* 149 */     env.set("math", (LuaValue)math);
/* 150 */     if (!env.get("package").isnil())
/* 151 */       env.get("package").get("loaded").set("math", (LuaValue)math); 
/* 152 */     return (LuaValue)math;
/*     */   }
/*     */   
/*     */   protected static abstract class UnaryOp
/*     */     extends OneArgFunction {
/*     */     public LuaValue call(LuaValue arg) {
/* 158 */       return (LuaValue)valueOf(call(arg.checkdouble()));
/*     */     }
/*     */     
/*     */     protected abstract double call(double param1Double);
/*     */   }
/*     */   
/*     */   protected static abstract class BinaryOp
/*     */     extends TwoArgFunction {
/*     */     public LuaValue call(LuaValue x, LuaValue y) {
/* 167 */       return (LuaValue)valueOf(call(x.checkdouble(), y.checkdouble()));
/*     */     }
/*     */     
/*     */     protected abstract double call(double param1Double1, double param1Double2);
/*     */   }
/*     */   
/*     */   static final class abs extends UnaryOp {
/*     */     protected double call(double d) {
/* 175 */       return Math.abs(d);
/*     */     } }
/*     */   
/*     */   static final class ceil extends UnaryOp {
/*     */     protected double call(double d) {
/* 180 */       return Math.ceil(d);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class cos extends UnaryOp { protected double call(double d) {
/* 185 */       return Math.cos(d);
/*     */     } }
/*     */   
/*     */   static final class deg extends UnaryOp {
/*     */     protected double call(double d) {
/* 190 */       return Math.toDegrees(d);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class floor extends UnaryOp { protected double call(double d) {
/* 195 */       return Math.floor(d);
/*     */     } }
/*     */   
/*     */   static final class rad extends UnaryOp {
/*     */     protected double call(double d) {
/* 200 */       return Math.toRadians(d);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class sin extends UnaryOp { protected double call(double d) {
/* 205 */       return Math.sin(d);
/*     */     } }
/*     */   
/*     */   static final class sqrt extends UnaryOp {
/*     */     protected double call(double d) {
/* 210 */       return Math.sqrt(d);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class tan extends UnaryOp { protected double call(double d) {
/* 215 */       return Math.tan(d);
/*     */     } }
/*     */   
/*     */   static final class exp extends UnaryOp {
/*     */     final MathLib mathlib;
/*     */     
/*     */     exp(MathLib mathlib) {
/* 222 */       this.mathlib = mathlib;
/*     */     }
/*     */ 
/*     */     
/*     */     protected double call(double d) {
/* 227 */       return this.mathlib.dpow_lib(Math.E, d);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class fmod
/*     */     extends TwoArgFunction {
/*     */     public LuaValue call(LuaValue xv, LuaValue yv) {
/* 234 */       if (yv.checkdouble() == 0.0D)
/* 235 */         return (LuaValue)LuaDouble.NAN; 
/* 236 */       if (xv.islong() && yv.islong()) {
/* 237 */         return (LuaValue)valueOf((xv.tolong() % yv.tolong()));
/*     */       }
/* 239 */       return (LuaValue)valueOf(xv.checkdouble() % yv.checkdouble());
/*     */     }
/*     */   }
/*     */   
/*     */   static final class ldexp
/*     */     extends BinaryOp
/*     */   {
/*     */     protected double call(double x, double y) {
/* 247 */       return x * Double.longBitsToDouble((long)y + 1023L << 52L);
/*     */     }
/*     */   }
/*     */   
/*     */   static final class pow
/*     */     extends BinaryOp {
/*     */     protected double call(double x, double y) {
/* 254 */       return MathLib.dpow_default(x, y);
/*     */     }
/*     */   }
/*     */   
/*     */   static class frexp
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 261 */       double x = args.checkdouble(1);
/* 262 */       if (x == 0.0D)
/* 263 */         return varargsOf((LuaValue)ZERO, (Varargs)ZERO); 
/* 264 */       long bits = Double.doubleToLongBits(x);
/* 265 */       double m = ((bits & 0xFFFFFFFFFFFFFL) + 4503599627370496L) * ((bits >= 0L) ? 1.1102230246251565E-16D : -1.1102230246251565E-16D);
/* 266 */       double e = (((int)(bits >> 52L) & 0x7FF) - 1022);
/* 267 */       return varargsOf((LuaValue)valueOf(m), (Varargs)valueOf(e));
/*     */     }
/*     */   }
/*     */   
/*     */   static class max
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 274 */       LuaNumber luaNumber = args.checknumber(1);
/* 275 */       for (int i = 2, n = args.narg(); i <= n; i++) {
/* 276 */         LuaNumber luaNumber1 = args.checknumber(i);
/* 277 */         if (luaNumber.lt_b((LuaValue)luaNumber1))
/* 278 */           luaNumber = luaNumber1; 
/*     */       } 
/* 280 */       return (Varargs)luaNumber;
/*     */     }
/*     */   }
/*     */   
/*     */   static class min
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 287 */       LuaNumber luaNumber = args.checknumber(1);
/* 288 */       for (int i = 2, n = args.narg(); i <= n; i++) {
/* 289 */         LuaNumber luaNumber1 = args.checknumber(i);
/* 290 */         if (luaNumber1.lt_b((LuaValue)luaNumber))
/* 291 */           luaNumber = luaNumber1; 
/*     */       } 
/* 293 */       return (Varargs)luaNumber;
/*     */     }
/*     */   }
/*     */   
/*     */   static class modf
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/* 300 */       LuaValue n = args.arg1();
/*     */       
/* 302 */       if (n.islong())
/* 303 */         return varargsOf(n.tonumber(), (Varargs)valueOf(0.0D)); 
/* 304 */       double x = n.checkdouble();
/*     */       
/* 306 */       double intPart = (x > 0.0D) ? Math.floor(x) : Math.ceil(x);
/*     */       
/* 308 */       double fracPart = (x == intPart) ? 0.0D : (x - intPart);
/* 309 */       return varargsOf((LuaValue)valueOf(intPart), (Varargs)valueOf(fracPart));
/*     */     } }
/*     */   
/*     */   static class random extends LibFunction {
/*     */     random() {
/* 314 */       this.random = new Random();
/*     */     }
/*     */     Random random;
/*     */     public LuaValue call() {
/* 318 */       return (LuaValue)valueOf(this.random.nextDouble());
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue a) {
/* 323 */       int m = a.checkint();
/* 324 */       if (m < 1)
/* 325 */         argerror(1, "interval is empty"); 
/* 326 */       return (LuaValue)valueOf(1 + this.random.nextInt(m));
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue a, LuaValue b) {
/* 331 */       int m = a.checkint();
/* 332 */       int n = b.checkint();
/* 333 */       if (n < m)
/* 334 */         argerror(2, "interval is empty"); 
/* 335 */       return (LuaValue)valueOf(m + this.random.nextInt(n + 1 - m));
/*     */     }
/*     */   }
/*     */   
/*     */   static class randomseed
/*     */     extends OneArgFunction {
/*     */     final MathLib.random random;
/*     */     
/*     */     randomseed(MathLib.random random1) {
/* 344 */       this.random = random1;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue arg) {
/* 349 */       long seed = arg.checklong();
/* 350 */       this.random.random = new Random(seed);
/* 351 */       return NONE;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LuaValue dpow(double a, double b) {
/* 360 */     return (LuaValue)LuaDouble.valueOf((MATHLIB != null) ? MATHLIB.dpow_lib(a, b) : dpow_default(a, b));
/*     */   }
/*     */   
/*     */   public static double dpow_d(double a, double b) {
/* 364 */     return (MATHLIB != null) ? MATHLIB.dpow_lib(a, b) : dpow_default(a, b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double dpow_lib(double a, double b) {
/* 371 */     return dpow_default(a, b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static double dpow_default(double a, double b) {
/* 378 */     if (b < 0.0D)
/* 379 */       return 1.0D / dpow_default(a, -b); 
/* 380 */     double p = 1.0D;
/* 381 */     int whole = (int)b; double v;
/* 382 */     for (v = a; whole > 0; whole >>= 1, v *= v) {
/* 383 */       if ((whole & 0x1) != 0)
/* 384 */         p *= v; 
/* 385 */     }  if ((b -= whole) > 0.0D) {
/* 386 */       int frac = (int)(65536.0D * b);
/* 387 */       for (; (frac & 0xFFFF) != 0; frac <<= 1) {
/* 388 */         a = Math.sqrt(a);
/* 389 */         if ((frac & 0x8000) != 0)
/* 390 */           p *= a; 
/*     */       } 
/*     */     } 
/* 393 */     return p;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\MathLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */