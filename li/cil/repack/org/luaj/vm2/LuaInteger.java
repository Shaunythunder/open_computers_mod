/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.lib.MathLib;
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
/*     */ public class LuaInteger
/*     */   extends LuaNumber
/*     */ {
/*  45 */   private static final LuaInteger[] intValues = new LuaInteger[512];
/*     */   static {
/*  47 */     for (int i = 0; i < 512; i++)
/*  48 */       intValues[i] = new LuaInteger(i - 256); 
/*     */   }
/*     */   public final int v;
/*     */   public static LuaInteger valueOf(int i) {
/*  52 */     return (i <= 255 && i >= -256) ? intValues[i + 256] : new LuaInteger(i);
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
/*     */   public static LuaNumber valueOf(long l) {
/*  65 */     int i = (int)l;
/*  66 */     return (l == i) ? ((i <= 255 && i >= -256) ? intValues[i + 256] : new LuaInteger(i)) : 
/*  67 */       LuaDouble.valueOf(l);
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
/*     */   LuaInteger(int i) {
/*  79 */     this.v = i;
/*     */   }
/*     */   
/*     */   public boolean isint() {
/*  83 */     return true;
/*     */   }
/*     */   public boolean isinttype() {
/*  86 */     return true;
/*     */   }
/*     */   public boolean islong() {
/*  89 */     return true;
/*     */   }
/*     */   public byte tobyte() {
/*  92 */     return (byte)this.v;
/*     */   }
/*     */   public char tochar() {
/*  95 */     return (char)this.v;
/*     */   }
/*     */   public double todouble() {
/*  98 */     return this.v;
/*     */   }
/*     */   public float tofloat() {
/* 101 */     return this.v;
/*     */   }
/*     */   public int toint() {
/* 104 */     return this.v;
/*     */   }
/*     */   public long tolong() {
/* 107 */     return this.v;
/*     */   }
/*     */   public short toshort() {
/* 110 */     return (short)this.v;
/*     */   }
/*     */   public double optdouble(double defval) {
/* 113 */     return this.v;
/*     */   }
/*     */   public int optint(int defval) {
/* 116 */     return this.v;
/*     */   }
/*     */   public LuaInteger optinteger(LuaInteger defval) {
/* 119 */     return this;
/*     */   }
/*     */   public long optlong(long defval) {
/* 122 */     return this.v;
/*     */   }
/*     */   
/*     */   public String tojstring() {
/* 126 */     return Integer.toString(this.v);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaString strvalue() {
/* 131 */     return LuaString.valueOf(Integer.toString(this.v));
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaString optstring(LuaString defval) {
/* 136 */     return LuaString.valueOf(Integer.toString(this.v));
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue tostring() {
/* 141 */     return LuaString.valueOf(Integer.toString(this.v));
/*     */   }
/*     */ 
/*     */   
/*     */   public String optjstring(String defval) {
/* 146 */     return Integer.toString(this.v);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaInteger checkinteger() {
/* 151 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isstring() {
/* 156 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 161 */     return this.v;
/*     */   }
/*     */   
/*     */   public static int hashCode(int x) {
/* 165 */     return x;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue neg() {
/* 170 */     return valueOf(-(this.v));
/*     */   }
/*     */   
/*     */   public boolean equals(Object o) {
/* 174 */     return (o instanceof LuaInteger) ? ((((LuaInteger)o).v == this.v)) : false;
/*     */   }
/*     */   
/*     */   public LuaValue eq(LuaValue val) {
/* 178 */     return val.raweq(this.v) ? TRUE : FALSE;
/*     */   }
/*     */   public boolean eq_b(LuaValue val) {
/* 181 */     return val.raweq(this.v);
/*     */   }
/*     */   
/*     */   public boolean raweq(LuaValue val) {
/* 185 */     return val.raweq(this.v);
/*     */   }
/*     */   public boolean raweq(double val) {
/* 188 */     return (this.v == val);
/*     */   }
/*     */   public boolean raweq(int val) {
/* 191 */     return (this.v == val);
/*     */   }
/*     */   
/*     */   public LuaValue add(LuaValue rhs) {
/* 195 */     return rhs.add(this.v);
/*     */   }
/*     */   public LuaValue add(double lhs) {
/* 198 */     return LuaDouble.valueOf(lhs + this.v);
/*     */   }
/*     */   public LuaValue add(int lhs) {
/* 201 */     return valueOf(lhs + this.v);
/*     */   }
/*     */   public LuaValue sub(LuaValue rhs) {
/* 204 */     return rhs.subFrom(this.v);
/*     */   }
/*     */   public LuaValue sub(double rhs) {
/* 207 */     return LuaDouble.valueOf(this.v - rhs);
/*     */   }
/*     */   public LuaValue sub(int rhs) {
/* 210 */     return LuaValue.valueOf(this.v - rhs);
/*     */   }
/*     */   public LuaValue subFrom(double lhs) {
/* 213 */     return LuaDouble.valueOf(lhs - this.v);
/*     */   }
/*     */   public LuaValue subFrom(int lhs) {
/* 216 */     return valueOf(lhs - this.v);
/*     */   }
/*     */   public LuaValue mul(LuaValue rhs) {
/* 219 */     return rhs.mul(this.v);
/*     */   }
/*     */   public LuaValue mul(double lhs) {
/* 222 */     return LuaDouble.valueOf(lhs * this.v);
/*     */   }
/*     */   public LuaValue mul(int lhs) {
/* 225 */     return valueOf(lhs * this.v);
/*     */   }
/*     */   public LuaValue pow(LuaValue rhs) {
/* 228 */     return rhs.powWith(this.v);
/*     */   }
/*     */   public LuaValue pow(double rhs) {
/* 231 */     return MathLib.dpow(this.v, rhs);
/*     */   }
/*     */   public LuaValue pow(int rhs) {
/* 234 */     return MathLib.dpow(this.v, rhs);
/*     */   }
/*     */   public LuaValue powWith(double lhs) {
/* 237 */     return MathLib.dpow(lhs, this.v);
/*     */   }
/*     */   public LuaValue powWith(int lhs) {
/* 240 */     return MathLib.dpow(lhs, this.v);
/*     */   }
/*     */   public LuaValue div(LuaValue rhs) {
/* 243 */     return rhs.divInto(this.v);
/*     */   }
/*     */   public LuaValue div(double rhs) {
/* 246 */     return LuaDouble.ddiv(this.v, rhs);
/*     */   }
/*     */   public LuaValue div(int rhs) {
/* 249 */     return LuaDouble.ddiv(this.v, rhs);
/*     */   }
/*     */   public LuaValue divInto(double lhs) {
/* 252 */     return LuaDouble.ddiv(lhs, this.v);
/*     */   }
/*     */   public LuaValue mod(LuaValue rhs) {
/* 255 */     return rhs.modFrom(this.v);
/*     */   }
/*     */   public LuaValue mod(double rhs) {
/* 258 */     return LuaDouble.dmod(this.v, rhs);
/*     */   }
/*     */   public LuaValue mod(int rhs) {
/* 261 */     return LuaDouble.dmod(this.v, rhs);
/*     */   }
/*     */   public LuaValue modFrom(double lhs) {
/* 264 */     return LuaDouble.dmod(lhs, this.v);
/*     */   }
/*     */   
/*     */   public LuaValue lt(LuaValue rhs) {
/* 268 */     return (rhs instanceof LuaNumber) ? (rhs.gt_b(this.v) ? TRUE : FALSE) : super.lt(rhs);
/*     */   }
/*     */   public LuaValue lt(double rhs) {
/* 271 */     return (this.v < rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public LuaValue lt(int rhs) {
/* 274 */     return (this.v < rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public boolean lt_b(LuaValue rhs) {
/* 277 */     return (rhs instanceof LuaNumber) ? rhs.gt_b(this.v) : super.lt_b(rhs);
/*     */   }
/*     */   public boolean lt_b(int rhs) {
/* 280 */     return (this.v < rhs);
/*     */   }
/*     */   public boolean lt_b(double rhs) {
/* 283 */     return (this.v < rhs);
/*     */   }
/*     */   
/*     */   public LuaValue lteq(LuaValue rhs) {
/* 287 */     return (rhs instanceof LuaNumber) ? (rhs.gteq_b(this.v) ? TRUE : FALSE) : super.lteq(rhs);
/*     */   }
/*     */   
/*     */   public LuaValue lteq(double rhs) {
/* 291 */     return (this.v <= rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public LuaValue lteq(int rhs) {
/* 294 */     return (this.v <= rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public boolean lteq_b(LuaValue rhs) {
/* 297 */     return (rhs instanceof LuaNumber) ? rhs.gteq_b(this.v) : super.lteq_b(rhs);
/*     */   }
/*     */   public boolean lteq_b(int rhs) {
/* 300 */     return (this.v <= rhs);
/*     */   }
/*     */   public boolean lteq_b(double rhs) {
/* 303 */     return (this.v <= rhs);
/*     */   }
/*     */   public LuaValue gt(LuaValue rhs) {
/* 306 */     return (rhs instanceof LuaNumber) ? (rhs.lt_b(this.v) ? TRUE : FALSE) : super.gt(rhs);
/*     */   }
/*     */   public LuaValue gt(double rhs) {
/* 309 */     return (this.v > rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public LuaValue gt(int rhs) {
/* 312 */     return (this.v > rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public boolean gt_b(LuaValue rhs) {
/* 315 */     return (rhs instanceof LuaNumber) ? rhs.lt_b(this.v) : super.gt_b(rhs);
/*     */   }
/*     */   public boolean gt_b(int rhs) {
/* 318 */     return (this.v > rhs);
/*     */   }
/*     */   public boolean gt_b(double rhs) {
/* 321 */     return (this.v > rhs);
/*     */   }
/*     */   
/*     */   public LuaValue gteq(LuaValue rhs) {
/* 325 */     return (rhs instanceof LuaNumber) ? (rhs.lteq_b(this.v) ? TRUE : FALSE) : super.gteq(rhs);
/*     */   }
/*     */   
/*     */   public LuaValue gteq(double rhs) {
/* 329 */     return (this.v >= rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public LuaValue gteq(int rhs) {
/* 332 */     return (this.v >= rhs) ? TRUE : FALSE;
/*     */   }
/*     */   public boolean gteq_b(LuaValue rhs) {
/* 335 */     return (rhs instanceof LuaNumber) ? rhs.lteq_b(this.v) : super.gteq_b(rhs);
/*     */   }
/*     */   public boolean gteq_b(int rhs) {
/* 338 */     return (this.v >= rhs);
/*     */   }
/*     */   public boolean gteq_b(double rhs) {
/* 341 */     return (this.v >= rhs);
/*     */   }
/*     */   
/*     */   public int strcmp(LuaString rhs) {
/* 345 */     typerror("attempt to compare number with string"); return 0;
/*     */   }
/*     */   
/*     */   public int checkint() {
/* 349 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public long checklong() {
/* 354 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public double checkdouble() {
/* 359 */     return this.v;
/*     */   }
/*     */ 
/*     */   
/*     */   public String checkjstring() {
/* 364 */     return String.valueOf(this.v);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaString checkstring() {
/* 369 */     return valueOf(String.valueOf(this.v));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaInteger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */