/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
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
/*     */ public class Bit32Lib
/*     */   extends TwoArgFunction
/*     */ {
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/*  84 */     LuaTable t = new LuaTable();
/*  85 */     bind((LuaValue)t, Bit32LibV.class, new String[] { "band", "bnot", "bor", "btest", "bxor", "extract", "replace" });
/*  86 */     bind((LuaValue)t, Bit32Lib2.class, new String[] { "arshift", "lrotate", "lshift", "rrotate", "rshift" });
/*  87 */     env.set("bit32", (LuaValue)t);
/*  88 */     if (!env.get("package").isnil())
/*  89 */       env.get("package").get("loaded").set("bit32", (LuaValue)t); 
/*  90 */     return (LuaValue)t;
/*     */   }
/*     */   
/*     */   static final class Bit32LibV
/*     */     extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/*  96 */       switch (this.opcode) {
/*     */         case 0:
/*  98 */           return Bit32Lib.band(args);
/*     */         case 1:
/* 100 */           return Bit32Lib.bnot(args);
/*     */         case 2:
/* 102 */           return Bit32Lib.bor(args);
/*     */         case 3:
/* 104 */           return Bit32Lib.btest(args);
/*     */         case 4:
/* 106 */           return Bit32Lib.bxor(args);
/*     */         case 5:
/* 108 */           return (Varargs)Bit32Lib.extract(args.checkint(1), args.checkint(2), args.optint(3, 1));
/*     */         case 6:
/* 110 */           return (Varargs)Bit32Lib.replace(args.checkint(1), args.checkint(2), args.checkint(3), args.optint(4, 1));
/*     */       } 
/* 112 */       return (Varargs)NIL;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class Bit32Lib2
/*     */     extends TwoArgFunction
/*     */   {
/*     */     public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 120 */       switch (this.opcode) {
/*     */         case 0:
/* 122 */           return Bit32Lib.arshift(arg1.checkint(), arg2.checkint());
/*     */         case 1:
/* 124 */           return Bit32Lib.lrotate(arg1.checkint(), arg2.checkint());
/*     */         case 2:
/* 126 */           return Bit32Lib.lshift(arg1.checkint(), arg2.checkint());
/*     */         case 3:
/* 128 */           return Bit32Lib.rrotate(arg1.checkint(), arg2.checkint());
/*     */         case 4:
/* 130 */           return Bit32Lib.rshift(arg1.checkint(), arg2.checkint());
/*     */       } 
/* 132 */       return NIL;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static LuaValue arshift(int x, int disp) {
/* 138 */     if (disp >= 0) {
/* 139 */       return bitsToValue(x >> disp);
/*     */     }
/* 141 */     return bitsToValue(x << -disp);
/*     */   }
/*     */ 
/*     */   
/*     */   static LuaValue rshift(int x, int disp) {
/* 146 */     if (disp >= 32 || disp <= -32)
/* 147 */       return (LuaValue)ZERO; 
/* 148 */     if (disp >= 0) {
/* 149 */       return bitsToValue(x >>> disp);
/*     */     }
/* 151 */     return bitsToValue(x << -disp);
/*     */   }
/*     */ 
/*     */   
/*     */   static LuaValue lshift(int x, int disp) {
/* 156 */     if (disp >= 32 || disp <= -32)
/* 157 */       return (LuaValue)ZERO; 
/* 158 */     if (disp >= 0) {
/* 159 */       return bitsToValue(x << disp);
/*     */     }
/* 161 */     return bitsToValue(x >>> -disp);
/*     */   }
/*     */ 
/*     */   
/*     */   static Varargs band(Varargs args) {
/* 166 */     int result = -1;
/* 167 */     for (int i = 1; i <= args.narg(); i++) {
/* 168 */       result &= args.checkint(i);
/*     */     }
/* 170 */     return (Varargs)bitsToValue(result);
/*     */   }
/*     */   
/*     */   static Varargs bnot(Varargs args) {
/* 174 */     return (Varargs)bitsToValue(args.checkint(1) ^ 0xFFFFFFFF);
/*     */   }
/*     */   
/*     */   static Varargs bor(Varargs args) {
/* 178 */     int result = 0;
/* 179 */     for (int i = 1; i <= args.narg(); i++) {
/* 180 */       result |= args.checkint(i);
/*     */     }
/* 182 */     return (Varargs)bitsToValue(result);
/*     */   }
/*     */   
/*     */   static Varargs btest(Varargs args) {
/* 186 */     int bits = -1;
/* 187 */     for (int i = 1; i <= args.narg(); i++) {
/* 188 */       bits &= args.checkint(i);
/*     */     }
/* 190 */     return (Varargs)valueOf((bits != 0));
/*     */   }
/*     */   
/*     */   static Varargs bxor(Varargs args) {
/* 194 */     int result = 0;
/* 195 */     for (int i = 1; i <= args.narg(); i++) {
/* 196 */       result ^= args.checkint(i);
/*     */     }
/* 198 */     return (Varargs)bitsToValue(result);
/*     */   }
/*     */   
/*     */   static LuaValue lrotate(int x, int disp) {
/* 202 */     if (disp < 0) {
/* 203 */       return rrotate(x, -disp);
/*     */     }
/* 205 */     disp &= 0x1F;
/* 206 */     return bitsToValue(x << disp | x >>> 32 - disp);
/*     */   }
/*     */ 
/*     */   
/*     */   static LuaValue rrotate(int x, int disp) {
/* 211 */     if (disp < 0) {
/* 212 */       return lrotate(x, -disp);
/*     */     }
/* 214 */     disp &= 0x1F;
/* 215 */     return bitsToValue(x >>> disp | x << 32 - disp);
/*     */   }
/*     */ 
/*     */   
/*     */   static LuaValue extract(int n, int field, int width) {
/* 220 */     if (field < 0) {
/* 221 */       argerror(2, "field cannot be negative");
/*     */     }
/* 223 */     if (width < 0) {
/* 224 */       argerror(3, "width must be postive");
/*     */     }
/* 226 */     if (field + width > 32) {
/* 227 */       error("trying to access non-existent bits");
/*     */     }
/* 229 */     return bitsToValue(n >>> field & -1 >>> 32 - width);
/*     */   }
/*     */   
/*     */   static LuaValue replace(int n, int v, int field, int width) {
/* 233 */     if (field < 0) {
/* 234 */       argerror(3, "field cannot be negative");
/*     */     }
/* 236 */     if (width < 0) {
/* 237 */       argerror(4, "width must be postive");
/*     */     }
/* 239 */     if (field + width > 32) {
/* 240 */       error("trying to access non-existent bits");
/*     */     }
/* 242 */     int mask = -1 >>> 32 - width << field;
/* 243 */     n = n & (mask ^ 0xFFFFFFFF) | v << field & mask;
/* 244 */     return bitsToValue(n);
/*     */   }
/*     */   
/*     */   private static LuaValue bitsToValue(int x) {
/* 248 */     return (x < 0) ? (LuaValue)valueOf((x & 0xFFFFFFFFL)) : (LuaValue)valueOf(x);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\Bit32Lib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */