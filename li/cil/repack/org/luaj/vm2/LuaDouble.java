/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.compat.JavaCompat;
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
/*     */ public class LuaDouble
/*     */   extends LuaNumber
/*     */ {
/*  58 */   public static final LuaDouble NAN = new LuaDouble(Double.NaN);
/*     */ 
/*     */   
/*  61 */   public static final LuaDouble NEGNAN = new LuaDouble(Double.NaN);
/*     */ 
/*     */   
/*  64 */   public static final LuaDouble POSINF = new LuaDouble(Double.POSITIVE_INFINITY);
/*     */ 
/*     */   
/*  67 */   public static final LuaDouble NEGINF = new LuaDouble(Double.NEGATIVE_INFINITY);
/*     */ 
/*     */   
/*     */   public static final String JSTR_NAN = "nan";
/*     */ 
/*     */   
/*     */   public static final String JSTR_NEGNAN = "-nan";
/*     */ 
/*     */   
/*     */   public static final String JSTR_POSINF = "inf";
/*     */ 
/*     */   
/*     */   public static final String JSTR_NEGINF = "-inf";
/*     */   
/*     */   final double v;
/*     */ 
/*     */   
/*     */   public static LuaNumber valueOf(double d) {
/*  85 */     int id = (int)d;
/*  86 */     return (d == id) ? LuaInteger.valueOf(id) : new LuaDouble(d);
/*     */   }
/*     */ 
/*     */   
/*     */   private LuaDouble(double d) {
/*  91 */     this.v = d;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  95 */     long l = Double.doubleToLongBits(this.v + 1.0D);
/*  96 */     return (int)(l >> 32L) + (int)l;
/*     */   }
/*     */   
/*     */   public boolean islong() {
/* 100 */     return (this.v == (long)this.v);
/*     */   }
/*     */   
/* 103 */   public byte tobyte() { return (byte)(int)(long)this.v; }
/* 104 */   public char tochar() { return (char)(int)(long)this.v; }
/* 105 */   public double todouble() { return this.v; }
/* 106 */   public float tofloat() { return (float)this.v; }
/* 107 */   public int toint() { return (int)(long)this.v; }
/* 108 */   public long tolong() { return (long)this.v; } public short toshort() {
/* 109 */     return (short)(int)(long)this.v;
/*     */   }
/* 111 */   public double optdouble(double defval) { return this.v; }
/* 112 */   public int optint(int defval) { return (int)(long)this.v; }
/* 113 */   public LuaInteger optinteger(LuaInteger defval) { return LuaInteger.valueOf((int)(long)this.v); } public long optlong(long defval) {
/* 114 */     return (long)this.v;
/*     */   } public LuaInteger checkinteger() {
/* 116 */     return LuaInteger.valueOf((int)(long)this.v);
/*     */   }
/*     */   public LuaValue neg() {
/* 119 */     return valueOf(-this.v);
/*     */   }
/*     */   public boolean equals(Object o) {
/* 122 */     return (o instanceof LuaDouble) ? ((((LuaDouble)o).v == this.v)) : false;
/*     */   }
/*     */   
/* 125 */   public LuaValue eq(LuaValue val) { return val.raweq(this.v) ? TRUE : FALSE; } public boolean eq_b(LuaValue val) {
/* 126 */     return val.raweq(this.v);
/*     */   }
/*     */   
/* 129 */   public boolean raweq(LuaValue val) { return val.raweq(this.v); }
/* 130 */   public boolean raweq(double val) { return (this.v == val); } public boolean raweq(int val) {
/* 131 */     return (this.v == val);
/*     */   }
/*     */   
/* 134 */   public LuaValue add(LuaValue rhs) { return rhs.add(this.v); }
/* 135 */   public LuaValue add(double lhs) { return valueOf(lhs + this.v); }
/* 136 */   public LuaValue sub(LuaValue rhs) { return rhs.subFrom(this.v); }
/* 137 */   public LuaValue sub(double rhs) { return valueOf(this.v - rhs); }
/* 138 */   public LuaValue sub(int rhs) { return valueOf(this.v - rhs); }
/* 139 */   public LuaValue subFrom(double lhs) { return valueOf(lhs - this.v); }
/* 140 */   public LuaValue mul(LuaValue rhs) { return rhs.mul(this.v); }
/* 141 */   public LuaValue mul(double lhs) { return valueOf(lhs * this.v); }
/* 142 */   public LuaValue mul(int lhs) { return valueOf(lhs * this.v); }
/* 143 */   public LuaValue pow(LuaValue rhs) { return rhs.powWith(this.v); }
/* 144 */   public LuaValue pow(double rhs) { return MathLib.dpow(this.v, rhs); }
/* 145 */   public LuaValue pow(int rhs) { return MathLib.dpow(this.v, rhs); }
/* 146 */   public LuaValue powWith(double lhs) { return MathLib.dpow(lhs, this.v); }
/* 147 */   public LuaValue powWith(int lhs) { return MathLib.dpow(lhs, this.v); }
/* 148 */   public LuaValue div(LuaValue rhs) { return rhs.divInto(this.v); }
/* 149 */   public LuaValue div(double rhs) { return ddiv(this.v, rhs); }
/* 150 */   public LuaValue div(int rhs) { return ddiv(this.v, rhs); }
/* 151 */   public LuaValue divInto(double lhs) { return ddiv(lhs, this.v); }
/* 152 */   public LuaValue mod(LuaValue rhs) { return rhs.modFrom(this.v); }
/* 153 */   public LuaValue mod(double rhs) { return dmod(this.v, rhs); }
/* 154 */   public LuaValue mod(int rhs) { return dmod(this.v, rhs); } public LuaValue modFrom(double lhs) {
/* 155 */     return dmod(lhs, this.v);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LuaValue ddiv(double lhs, double rhs) {
/* 166 */     return (rhs != 0.0D) ? valueOf(lhs / rhs) : ((lhs > 0.0D) ? POSINF : ((lhs == 0.0D) ? NAN : NEGINF));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double ddiv_d(double lhs, double rhs) {
/* 176 */     return (rhs != 0.0D) ? (lhs / rhs) : ((lhs > 0.0D) ? Double.POSITIVE_INFINITY : ((lhs == 0.0D) ? Double.NaN : Double.NEGATIVE_INFINITY));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LuaValue dmod(double lhs, double rhs) {
/* 187 */     if (rhs == 0.0D || lhs == Double.POSITIVE_INFINITY || lhs == Double.NEGATIVE_INFINITY) return NAN; 
/* 188 */     if (rhs == Double.POSITIVE_INFINITY) {
/* 189 */       return (lhs < 0.0D) ? POSINF : valueOf(lhs);
/*     */     }
/* 191 */     if (rhs == Double.NEGATIVE_INFINITY) {
/* 192 */       return (lhs > 0.0D) ? NEGINF : valueOf(lhs);
/*     */     }
/* 194 */     return valueOf(lhs - rhs * Math.floor(lhs / rhs));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static double dmod_d(double lhs, double rhs) {
/* 205 */     if (rhs == 0.0D || lhs == Double.POSITIVE_INFINITY || lhs == Double.NEGATIVE_INFINITY) return Double.NaN; 
/* 206 */     if (rhs == Double.POSITIVE_INFINITY) {
/* 207 */       return (lhs < 0.0D) ? Double.POSITIVE_INFINITY : lhs;
/*     */     }
/* 209 */     if (rhs == Double.NEGATIVE_INFINITY) {
/* 210 */       return (lhs > 0.0D) ? Double.NEGATIVE_INFINITY : lhs;
/*     */     }
/* 212 */     return lhs - rhs * Math.floor(lhs / rhs);
/*     */   }
/*     */   
/*     */   public LuaValue lt(LuaValue rhs) {
/* 216 */     return (rhs instanceof LuaNumber) ? (rhs.gt_b(this.v) ? TRUE : FALSE) : super.lt(rhs);
/* 217 */   } public LuaValue lt(double rhs) { return (this.v < rhs) ? TRUE : FALSE; }
/* 218 */   public LuaValue lt(int rhs) { return (this.v < rhs) ? TRUE : FALSE; }
/* 219 */   public boolean lt_b(LuaValue rhs) { return (rhs instanceof LuaNumber) ? rhs.gt_b(this.v) : super.lt_b(rhs); }
/* 220 */   public boolean lt_b(int rhs) { return (this.v < rhs); }
/* 221 */   public boolean lt_b(double rhs) { return (this.v < rhs); }
/* 222 */   public LuaValue lteq(LuaValue rhs) { return (rhs instanceof LuaNumber) ? (rhs.gteq_b(this.v) ? TRUE : FALSE) : super.lteq(rhs); }
/* 223 */   public LuaValue lteq(double rhs) { return (this.v <= rhs) ? TRUE : FALSE; }
/* 224 */   public LuaValue lteq(int rhs) { return (this.v <= rhs) ? TRUE : FALSE; }
/* 225 */   public boolean lteq_b(LuaValue rhs) { return (rhs instanceof LuaNumber) ? rhs.gteq_b(this.v) : super.lteq_b(rhs); }
/* 226 */   public boolean lteq_b(int rhs) { return (this.v <= rhs); }
/* 227 */   public boolean lteq_b(double rhs) { return (this.v <= rhs); }
/* 228 */   public LuaValue gt(LuaValue rhs) { return (rhs instanceof LuaNumber) ? (rhs.lt_b(this.v) ? TRUE : FALSE) : super.gt(rhs); }
/* 229 */   public LuaValue gt(double rhs) { return (this.v > rhs) ? TRUE : FALSE; }
/* 230 */   public LuaValue gt(int rhs) { return (this.v > rhs) ? TRUE : FALSE; }
/* 231 */   public boolean gt_b(LuaValue rhs) { return (rhs instanceof LuaNumber) ? rhs.lt_b(this.v) : super.gt_b(rhs); }
/* 232 */   public boolean gt_b(int rhs) { return (this.v > rhs); }
/* 233 */   public boolean gt_b(double rhs) { return (this.v > rhs); }
/* 234 */   public LuaValue gteq(LuaValue rhs) { return (rhs instanceof LuaNumber) ? (rhs.lteq_b(this.v) ? TRUE : FALSE) : super.gteq(rhs); }
/* 235 */   public LuaValue gteq(double rhs) { return (this.v >= rhs) ? TRUE : FALSE; }
/* 236 */   public LuaValue gteq(int rhs) { return (this.v >= rhs) ? TRUE : FALSE; }
/* 237 */   public boolean gteq_b(LuaValue rhs) { return (rhs instanceof LuaNumber) ? rhs.lteq_b(this.v) : super.gteq_b(rhs); }
/* 238 */   public boolean gteq_b(int rhs) { return (this.v >= rhs); } public boolean gteq_b(double rhs) {
/* 239 */     return (this.v >= rhs);
/*     */   }
/*     */   public int strcmp(LuaString rhs) {
/* 242 */     typerror("attempt to compare number with string"); return 0;
/*     */   }
/*     */   public String tojstring() {
/* 245 */     if (this.v == 0.0D)
/* 246 */       return (JavaCompat.INSTANCE.doubleToRawLongBits(this.v) < 0L) ? "-0" : "0"; 
/* 247 */     long l = (long)this.v;
/* 248 */     if (l == this.v)
/* 249 */       return Long.toString(l); 
/* 250 */     if (Double.isNaN(this.v))
/* 251 */       return (JavaCompat.INSTANCE.doubleToRawLongBits(this.v) < 0L) ? "-nan" : "nan"; 
/* 252 */     if (Double.isInfinite(this.v))
/* 253 */       return (this.v < 0.0D) ? "-inf" : "inf"; 
/* 254 */     return Float.toString((float)this.v);
/*     */   }
/*     */   
/*     */   public LuaString strvalue() {
/* 258 */     return LuaString.valueOf(tojstring());
/*     */   }
/*     */   
/*     */   public LuaString optstring(LuaString defval) {
/* 262 */     return LuaString.valueOf(tojstring());
/*     */   }
/*     */   
/*     */   public LuaValue tostring() {
/* 266 */     return LuaString.valueOf(tojstring());
/*     */   }
/*     */   
/*     */   public String optjstring(String defval) {
/* 270 */     return tojstring();
/*     */   }
/*     */   
/*     */   public LuaNumber optnumber(LuaNumber defval) {
/* 274 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isnumber() {
/* 278 */     return true;
/*     */   }
/*     */   
/*     */   public boolean isstring() {
/* 282 */     return true;
/*     */   }
/*     */   
/*     */   public LuaValue tonumber() {
/* 286 */     return this;
/*     */   }
/* 288 */   public int checkint() { return (int)(long)this.v; }
/* 289 */   public long checklong() { return (long)this.v; }
/* 290 */   public LuaNumber checknumber() { return this; } public double checkdouble() {
/* 291 */     return this.v;
/*     */   }
/*     */   public String checkjstring() {
/* 294 */     return tojstring();
/*     */   }
/*     */   public LuaString checkstring() {
/* 297 */     return LuaString.valueOf(tojstring());
/*     */   }
/*     */   
/*     */   public boolean isvalidkey() {
/* 301 */     return !Double.isNaN(this.v);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaDouble.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */