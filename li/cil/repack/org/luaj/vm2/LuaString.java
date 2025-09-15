/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaString
/*     */   extends LuaValue
/*     */ {
/*     */   public static LuaValue s_metatable;
/*     */   public final byte[] m_bytes;
/*     */   public final int m_offset;
/*     */   public final int m_length;
/*     */   private final int m_hashcode;
/*     */   static final int RECENT_STRINGS_CACHE_SIZE = 128;
/*     */   static final int RECENT_STRINGS_MAX_LENGTH = 32;
/*     */   
/*     */   private static final class RecentShortStrings
/*     */   {
/* 103 */     private static final LuaString[] recent_short_strings = new LuaString[128];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LuaString valueOf(String string) {
/* 114 */     char[] c = string.toCharArray();
/* 115 */     byte[] b = new byte[lengthAsUtf8(c)];
/* 116 */     encodeToUtf8(c, c.length, b, 0);
/* 117 */     return valueUsing(b, 0, b.length);
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
/*     */   
/*     */   public static LuaString valueOf(byte[] bytes, int off, int len) {
/* 133 */     if (len > 32)
/* 134 */       return valueFromCopy(bytes, off, len); 
/* 135 */     int hash = hashCode(bytes, off, len);
/* 136 */     int bucket = hash & 0x7F;
/* 137 */     LuaString t = RecentShortStrings.recent_short_strings[bucket];
/* 138 */     if (t != null && t.m_hashcode == hash && t.byteseq(bytes, off, len)) return t; 
/* 139 */     LuaString s = valueFromCopy(bytes, off, len);
/* 140 */     RecentShortStrings.recent_short_strings[bucket] = s;
/* 141 */     return s;
/*     */   }
/*     */ 
/*     */   
/*     */   private static LuaString valueFromCopy(byte[] bytes, int off, int len) {
/* 146 */     byte[] copy = new byte[len];
/* 147 */     System.arraycopy(bytes, off, copy, 0, len);
/* 148 */     return new LuaString(copy, 0, len);
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
/*     */   public static LuaString valueUsing(byte[] bytes, int off, int len) {
/* 162 */     if (bytes.length > 32)
/* 163 */       return new LuaString(bytes, off, len); 
/* 164 */     int hash = hashCode(bytes, off, len);
/* 165 */     int bucket = hash & 0x7F;
/* 166 */     LuaString t = RecentShortStrings.recent_short_strings[bucket];
/* 167 */     if (t != null && t.m_hashcode == hash && t.byteseq(bytes, off, len)) return t; 
/* 168 */     LuaString s = new LuaString(bytes, off, len);
/* 169 */     RecentShortStrings.recent_short_strings[bucket] = s;
/* 170 */     return s;
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
/*     */   public static LuaString valueOf(char[] bytes) {
/* 182 */     return valueOf(bytes, 0, bytes.length);
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
/*     */   public static LuaString valueOf(char[] bytes, int off, int len) {
/* 194 */     byte[] b = new byte[len];
/* 195 */     for (int i = 0; i < len; i++)
/* 196 */       b[i] = (byte)bytes[i + off]; 
/* 197 */     return valueUsing(b, 0, len);
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
/*     */   public static LuaString valueOf(byte[] bytes) {
/* 209 */     return valueOf(bytes, 0, bytes.length);
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
/*     */   public static LuaString valueUsing(byte[] bytes) {
/* 224 */     return valueUsing(bytes, 0, bytes.length);
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
/*     */   private LuaString(byte[] bytes, int offset, int length) {
/* 237 */     this.m_bytes = bytes;
/* 238 */     this.m_offset = offset;
/* 239 */     this.m_length = length;
/* 240 */     this.m_hashcode = hashCode(bytes, offset, length);
/*     */   }
/*     */   
/*     */   public boolean isstring() {
/* 244 */     return true;
/*     */   }
/*     */   
/*     */   public LuaValue getmetatable() {
/* 248 */     return s_metatable;
/*     */   }
/*     */   
/*     */   public int type() {
/* 252 */     return 4;
/*     */   }
/*     */   
/*     */   public String typename() {
/* 256 */     return "string";
/*     */   }
/*     */   
/*     */   public String tojstring() {
/* 260 */     return decodeAsUtf8(this.m_bytes, this.m_offset, this.m_length);
/*     */   }
/*     */   
/*     */   public LuaValue neg() {
/* 264 */     double d = scannumber(); return Double.isNaN(d) ? super.neg() : valueOf(-d);
/*     */   }
/*     */   
/* 267 */   public LuaValue add(LuaValue rhs) { double d = scannumber(); return Double.isNaN(d) ? arithmt(ADD, rhs) : rhs.add(d); }
/* 268 */   public LuaValue add(double rhs) { return valueOf(checkarith() + rhs); }
/* 269 */   public LuaValue add(int rhs) { return valueOf(checkarith() + rhs); }
/* 270 */   public LuaValue sub(LuaValue rhs) { double d = scannumber(); return Double.isNaN(d) ? arithmt(SUB, rhs) : rhs.subFrom(d); }
/* 271 */   public LuaValue sub(double rhs) { return valueOf(checkarith() - rhs); }
/* 272 */   public LuaValue sub(int rhs) { return valueOf(checkarith() - rhs); }
/* 273 */   public LuaValue subFrom(double lhs) { return valueOf(lhs - checkarith()); }
/* 274 */   public LuaValue mul(LuaValue rhs) { double d = scannumber(); return Double.isNaN(d) ? arithmt(MUL, rhs) : rhs.mul(d); }
/* 275 */   public LuaValue mul(double rhs) { return valueOf(checkarith() * rhs); }
/* 276 */   public LuaValue mul(int rhs) { return valueOf(checkarith() * rhs); }
/* 277 */   public LuaValue pow(LuaValue rhs) { double d = scannumber(); return Double.isNaN(d) ? arithmt(POW, rhs) : rhs.powWith(d); }
/* 278 */   public LuaValue pow(double rhs) { return MathLib.dpow(checkarith(), rhs); }
/* 279 */   public LuaValue pow(int rhs) { return MathLib.dpow(checkarith(), rhs); }
/* 280 */   public LuaValue powWith(double lhs) { return MathLib.dpow(lhs, checkarith()); }
/* 281 */   public LuaValue powWith(int lhs) { return MathLib.dpow(lhs, checkarith()); }
/* 282 */   public LuaValue div(LuaValue rhs) { double d = scannumber(); return Double.isNaN(d) ? arithmt(DIV, rhs) : rhs.divInto(d); }
/* 283 */   public LuaValue div(double rhs) { return LuaDouble.ddiv(checkarith(), rhs); }
/* 284 */   public LuaValue div(int rhs) { return LuaDouble.ddiv(checkarith(), rhs); }
/* 285 */   public LuaValue divInto(double lhs) { return LuaDouble.ddiv(lhs, checkarith()); }
/* 286 */   public LuaValue mod(LuaValue rhs) { double d = scannumber(); return Double.isNaN(d) ? arithmt(MOD, rhs) : rhs.modFrom(d); }
/* 287 */   public LuaValue mod(double rhs) { return LuaDouble.dmod(checkarith(), rhs); }
/* 288 */   public LuaValue mod(int rhs) { return LuaDouble.dmod(checkarith(), rhs); } public LuaValue modFrom(double lhs) {
/* 289 */     return LuaDouble.dmod(lhs, checkarith());
/*     */   }
/*     */   
/* 292 */   public LuaValue lt(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) > 0) ? LuaValue.TRUE : FALSE) : super.lt(rhs); }
/* 293 */   public boolean lt_b(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) > 0)) : super.lt_b(rhs); }
/* 294 */   public boolean lt_b(int rhs) { typerror("attempt to compare string with number"); return false; }
/* 295 */   public boolean lt_b(double rhs) { typerror("attempt to compare string with number"); return false; }
/* 296 */   public LuaValue lteq(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) >= 0) ? LuaValue.TRUE : FALSE) : super.lteq(rhs); }
/* 297 */   public boolean lteq_b(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) >= 0)) : super.lteq_b(rhs); }
/* 298 */   public boolean lteq_b(int rhs) { typerror("attempt to compare string with number"); return false; }
/* 299 */   public boolean lteq_b(double rhs) { typerror("attempt to compare string with number"); return false; }
/* 300 */   public LuaValue gt(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) < 0) ? LuaValue.TRUE : FALSE) : super.gt(rhs); }
/* 301 */   public boolean gt_b(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) < 0)) : super.gt_b(rhs); }
/* 302 */   public boolean gt_b(int rhs) { typerror("attempt to compare string with number"); return false; }
/* 303 */   public boolean gt_b(double rhs) { typerror("attempt to compare string with number"); return false; }
/* 304 */   public LuaValue gteq(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) <= 0) ? LuaValue.TRUE : FALSE) : super.gteq(rhs); }
/* 305 */   public boolean gteq_b(LuaValue rhs) { return rhs.isstring() ? ((rhs.strcmp(this) <= 0)) : super.gteq_b(rhs); }
/* 306 */   public boolean gteq_b(int rhs) { typerror("attempt to compare string with number"); return false; } public boolean gteq_b(double rhs) {
/* 307 */     typerror("attempt to compare string with number"); return false;
/*     */   }
/*     */   
/* 310 */   public LuaValue concat(LuaValue rhs) { return rhs.concatTo(this); }
/* 311 */   public Buffer concat(Buffer rhs) { return rhs.concatTo(this); } public LuaValue concatTo(LuaNumber lhs) {
/* 312 */     return concatTo(lhs.strvalue());
/*     */   } public LuaValue concatTo(LuaString lhs) {
/* 314 */     byte[] b = new byte[lhs.m_length + this.m_length];
/* 315 */     System.arraycopy(lhs.m_bytes, lhs.m_offset, b, 0, lhs.m_length);
/* 316 */     System.arraycopy(this.m_bytes, this.m_offset, b, lhs.m_length, this.m_length);
/* 317 */     return valueUsing(b, 0, b.length);
/*     */   }
/*     */   
/*     */   public int strcmp(LuaValue lhs) {
/* 321 */     return -lhs.strcmp(this);
/*     */   } public int strcmp(LuaString rhs) {
/* 323 */     for (int i = 0, j = 0; i < this.m_length && j < rhs.m_length; i++, j++) {
/* 324 */       if (this.m_bytes[this.m_offset + i] != rhs.m_bytes[rhs.m_offset + j]) {
/* 325 */         return this.m_bytes[this.m_offset + i] - rhs.m_bytes[rhs.m_offset + j];
/*     */       }
/*     */     } 
/* 328 */     return this.m_length - rhs.m_length;
/*     */   }
/*     */ 
/*     */   
/*     */   private double checkarith() {
/* 333 */     double d = scannumber();
/* 334 */     if (Double.isNaN(d))
/* 335 */       aritherror(); 
/* 336 */     return d;
/*     */   }
/*     */   
/*     */   public int checkint() {
/* 340 */     return (int)(long)checkdouble();
/*     */   }
/*     */   public LuaInteger checkinteger() {
/* 343 */     return valueOf(checkint());
/*     */   }
/*     */   public long checklong() {
/* 346 */     return (long)checkdouble();
/*     */   }
/*     */   public double checkdouble() {
/* 349 */     double d = scannumber();
/* 350 */     if (Double.isNaN(d))
/* 351 */       argerror("number"); 
/* 352 */     return d;
/*     */   }
/*     */   public LuaNumber checknumber() {
/* 355 */     return valueOf(checkdouble());
/*     */   }
/*     */   public LuaNumber checknumber(String msg) {
/* 358 */     double d = scannumber();
/* 359 */     if (Double.isNaN(d))
/* 360 */       error(msg); 
/* 361 */     return valueOf(d);
/*     */   }
/*     */   
/*     */   public boolean isnumber() {
/* 365 */     double d = scannumber();
/* 366 */     return !Double.isNaN(d);
/*     */   }
/*     */   
/*     */   public boolean isint() {
/* 370 */     double d = scannumber();
/* 371 */     if (Double.isNaN(d))
/* 372 */       return false; 
/* 373 */     int i = (int)d;
/* 374 */     return (i == d);
/*     */   }
/*     */   
/*     */   public boolean islong() {
/* 378 */     double d = scannumber();
/* 379 */     if (Double.isNaN(d))
/* 380 */       return false; 
/* 381 */     long l = (long)d;
/* 382 */     return (l == d);
/*     */   }
/*     */   
/* 385 */   public byte tobyte() { return (byte)toint(); }
/* 386 */   public char tochar() { return (char)toint(); }
/* 387 */   public double todouble() { double d = scannumber(); return Double.isNaN(d) ? 0.0D : d; }
/* 388 */   public float tofloat() { return (float)todouble(); }
/* 389 */   public int toint() { return (int)tolong(); }
/* 390 */   public long tolong() { return (long)todouble(); } public short toshort() {
/* 391 */     return (short)toint();
/*     */   }
/*     */   public double optdouble(double defval) {
/* 394 */     return checkdouble();
/*     */   }
/*     */   
/*     */   public int optint(int defval) {
/* 398 */     return checkint();
/*     */   }
/*     */   
/*     */   public LuaInteger optinteger(LuaInteger defval) {
/* 402 */     return checkinteger();
/*     */   }
/*     */   
/*     */   public long optlong(long defval) {
/* 406 */     return checklong();
/*     */   }
/*     */   
/*     */   public LuaNumber optnumber(LuaNumber defval) {
/* 410 */     return checknumber();
/*     */   }
/*     */   
/*     */   public LuaString optstring(LuaString defval) {
/* 414 */     return this;
/*     */   }
/*     */   
/*     */   public LuaValue tostring() {
/* 418 */     return this;
/*     */   }
/*     */   
/*     */   public String optjstring(String defval) {
/* 422 */     return tojstring();
/*     */   }
/*     */   
/*     */   public LuaString strvalue() {
/* 426 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaString substring(int beginIndex, int endIndex) {
/* 436 */     int off = this.m_offset + beginIndex;
/* 437 */     int len = endIndex - beginIndex;
/* 438 */     return (len >= this.m_length / 2) ? 
/* 439 */       valueUsing(this.m_bytes, off, len) : 
/* 440 */       valueOf(this.m_bytes, off, len);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 444 */     return this.m_hashcode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int hashCode(byte[] bytes, int offset, int length) {
/* 455 */     int h = length;
/* 456 */     int step = (length >> 5) + 1; int l1;
/* 457 */     for (l1 = length; l1 >= step; l1 -= step)
/* 458 */       h ^= (h << 5) + (h >> 2) + (bytes[offset + l1 - 1] & 0xFF); 
/* 459 */     return h;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object o) {
/* 464 */     if (o instanceof LuaString) {
/* 465 */       return raweq((LuaString)o);
/*     */     }
/* 467 */     return false;
/*     */   }
/*     */   
/*     */   public LuaValue eq(LuaValue val) {
/* 471 */     return val.raweq(this) ? TRUE : FALSE; } public boolean eq_b(LuaValue val) {
/* 472 */     return val.raweq(this);
/*     */   }
/*     */   
/*     */   public boolean raweq(LuaValue val) {
/* 476 */     return val.raweq(this);
/*     */   }
/*     */   
/*     */   public boolean raweq(LuaString s) {
/* 480 */     if (this == s)
/* 481 */       return true; 
/* 482 */     if (s.m_length != this.m_length)
/* 483 */       return false; 
/* 484 */     if (s.m_bytes == this.m_bytes && s.m_offset == this.m_offset)
/* 485 */       return true; 
/* 486 */     if (s.hashCode() != hashCode())
/* 487 */       return false; 
/* 488 */     for (int i = 0; i < this.m_length; i++) {
/* 489 */       if (s.m_bytes[s.m_offset + i] != this.m_bytes[this.m_offset + i])
/* 490 */         return false; 
/* 491 */     }  return true;
/*     */   }
/*     */   
/*     */   public static boolean equals(LuaString a, int i, LuaString b, int j, int n) {
/* 495 */     return equals(a.m_bytes, a.m_offset + i, b.m_bytes, b.m_offset + j, n);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean byteseq(byte[] bytes, int off, int len) {
/* 500 */     return (this.m_length == len && equals(this.m_bytes, this.m_offset, bytes, off, len));
/*     */   }
/*     */   
/*     */   public static boolean equals(byte[] a, int i, byte[] b, int j, int n) {
/* 504 */     if (a.length < i + n || b.length < j + n)
/* 505 */       return false; 
/* 506 */     while (--n >= 0) {
/* 507 */       if (a[i++] != b[j++])
/* 508 */         return false; 
/* 509 */     }  return true;
/*     */   }
/*     */   
/*     */   public void write(DataOutputStream writer, int i, int len) throws IOException {
/* 513 */     writer.write(this.m_bytes, this.m_offset + i, len);
/*     */   }
/*     */   
/*     */   public LuaValue len() {
/* 517 */     return LuaInteger.valueOf(this.m_length);
/*     */   }
/*     */   
/*     */   public int length() {
/* 521 */     return this.m_length;
/*     */   }
/*     */   
/*     */   public int rawlen() {
/* 525 */     return this.m_length;
/*     */   }
/*     */   
/*     */   public int luaByte(int index) {
/* 529 */     return this.m_bytes[this.m_offset + index] & 0xFF;
/*     */   }
/*     */   
/*     */   public int charAt(int index) {
/* 533 */     if (index < 0 || index >= this.m_length)
/* 534 */       throw new IndexOutOfBoundsException(); 
/* 535 */     return luaByte(index);
/*     */   }
/*     */   
/*     */   public String checkjstring() {
/* 539 */     return tojstring();
/*     */   }
/*     */   
/*     */   public LuaString checkstring() {
/* 543 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InputStream toInputStream() {
/* 551 */     return new ByteArrayInputStream(this.m_bytes, this.m_offset, this.m_length);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void copyInto(int strOffset, byte[] bytes, int arrayOffset, int len) {
/* 562 */     System.arraycopy(this.m_bytes, this.m_offset + strOffset, bytes, arrayOffset, len);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int indexOfAny(LuaString accept) {
/* 570 */     int ilimit = this.m_offset + this.m_length;
/* 571 */     int jlimit = accept.m_offset + accept.m_length;
/* 572 */     for (int i = this.m_offset; i < ilimit; i++) {
/* 573 */       for (int j = accept.m_offset; j < jlimit; j++) {
/* 574 */         if (this.m_bytes[i] == accept.m_bytes[j]) {
/* 575 */           return i - this.m_offset;
/*     */         }
/*     */       } 
/*     */     } 
/* 579 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int indexOf(byte b, int start) {
/* 589 */     for (int i = start; i < this.m_length; i++) {
/* 590 */       if (this.m_bytes[this.m_offset + i] == b)
/* 591 */         return i; 
/*     */     } 
/* 593 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int indexOf(LuaString s, int start) {
/* 603 */     int slen = s.length();
/* 604 */     int limit = this.m_length - slen;
/* 605 */     for (int i = start; i <= limit; i++) {
/* 606 */       if (equals(this.m_bytes, this.m_offset + i, s.m_bytes, s.m_offset, slen))
/* 607 */         return i; 
/*     */     } 
/* 609 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int lastIndexOf(LuaString s) {
/* 618 */     int slen = s.length();
/* 619 */     int limit = this.m_length - slen;
/* 620 */     for (int i = limit; i >= 0; i--) {
/* 621 */       if (equals(this.m_bytes, this.m_offset + i, s.m_bytes, s.m_offset, slen))
/* 622 */         return i; 
/*     */     } 
/* 624 */     return -1;
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
/*     */   
/*     */   public static String decodeAsUtf8(byte[] bytes, int offset, int length) {
/*     */     int i, j, n;
/* 641 */     for (i = offset, j = offset + length, n = 0; i < j; n++) {
/* 642 */       byte v = bytes[i++];
/* 643 */       if ((v & 0xC0) == 192) {
/* 644 */         i++;
/* 645 */         if ((v & 0xE0) == 224) {
/* 646 */           i++;
/* 647 */           if ((v & 0xF0) == 240) {
/* 648 */             i++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 653 */     char[] chars = new char[n];
/* 654 */     for (i = offset, j = offset + length, n = 0; i < j;) {
/* 655 */       chars[n++] = 
/*     */ 
/*     */         
/* 658 */         (char)(((b = bytes[i++]) >= 0 || i >= j) ? b : ((b < -32 || i + 1 >= j) ? ((b & 0x3F) << 6 | bytes[i++] & 0x3F) : ((b & 0xF) << 12 | (bytes[i++] & 0x3F) << 6 | bytes[i++] & 0x3F)));
/*     */     }
/* 660 */     return new String(chars);
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
/*     */   public static int lengthAsUtf8(char[] chars) {
/*     */     int b;
/* 674 */     for (int i = 0; i < chars.length; i++) {
/* 675 */       char c; if ((c = chars[i]) < '' || (c >= '?' && c < '')) {
/* 676 */         b++;
/* 677 */       } else if (c < 'ࠀ') {
/* 678 */         b += 2;
/* 679 */       } else if (c >= '?' && c < '?') {
/* 680 */         if (i + 1 < chars.length && chars[i + 1] >= '?' && chars[i + 1] < '') {
/* 681 */           b += 4;
/* 682 */           i++;
/*     */         } else {
/* 684 */           b++;
/*     */         } 
/*     */       } else {
/* 687 */         b += 3;
/*     */       } 
/*     */     } 
/* 690 */     return b;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int encodeToUtf8(char[] chars, int nchars, byte[] bytes, int off) {
/* 710 */     int j = off;
/* 711 */     for (int i = 0; i < nchars; i++) {
/* 712 */       char c; if ((c = chars[i]) < '') {
/* 713 */         bytes[j++] = (byte)c;
/* 714 */       } else if (c < 'ࠀ') {
/* 715 */         bytes[j++] = (byte)(0xC0 | c >> 6);
/* 716 */         bytes[j++] = (byte)(0x80 | c & 0x3F);
/* 717 */       } else if (c >= '?' && c < '?') {
/* 718 */         if (i + 1 < nchars && chars[i + 1] >= '?' && chars[i + 1] < '') {
/* 719 */           int uc = 65536 + ((c & 0x3FF) << 10 | chars[++i] & 0x3FF);
/* 720 */           bytes[j++] = (byte)(0xF0 | uc >> 18);
/* 721 */           bytes[j++] = (byte)(0x80 | uc >> 12 & 0x3F);
/* 722 */           bytes[j++] = (byte)(0x80 | uc >> 6 & 0x3F);
/* 723 */           bytes[j++] = (byte)(0x80 | uc & 0x3F);
/*     */         } else {
/* 725 */           bytes[j++] = 63;
/*     */         } 
/* 727 */       } else if (c >= '?' && c < '') {
/* 728 */         bytes[j++] = 63;
/*     */       } else {
/* 730 */         bytes[j++] = (byte)(0xE0 | c >> 12);
/* 731 */         bytes[j++] = (byte)(0x80 | c >> 6 & 0x3F);
/* 732 */         bytes[j++] = (byte)(0x80 | c & 0x3F);
/*     */       } 
/*     */     } 
/* 735 */     return j - off;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isValidUtf8() {
/* 745 */     for (int i = this.m_offset, j = this.m_offset + this.m_length; i < j; ) {
/* 746 */       int c = this.m_bytes[i++];
/* 747 */       if (c >= 0)
/*     */         continue; 
/* 749 */       if ((c & 0xE0) == 192 && i < j && (this.m_bytes[i++] & 0xC0) == 128)
/*     */         continue; 
/* 751 */       if ((c & 0xF0) == 224 && i + 1 < j && (this.m_bytes[i++] & 0xC0) == 128 && (this.m_bytes[i++] & 0xC0) == 128)
/*     */         continue; 
/* 753 */       if ((c & 0xF8) == 240 && i + 2 < j && (this.m_bytes[i++] & 0xC0) == 128 && (this.m_bytes[i++] & 0xC0) == 128 && (this.m_bytes[i++] & 0xC0) == 128)
/*     */         continue; 
/* 755 */       return false;
/*     */     } 
/* 757 */     return true;
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
/*     */   public LuaValue tonumber() {
/* 769 */     double d = scannumber();
/* 770 */     return Double.isNaN(d) ? NIL : valueOf(d);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue tonumber(int base) {
/* 780 */     double d = scannumber(base);
/* 781 */     return Double.isNaN(d) ? NIL : valueOf(d);
/*     */   }
/*     */   
/*     */   private boolean isspace(byte c) {
/* 785 */     return (c == 32 || (c >= 9 && c <= 13));
/*     */   }
/*     */   
/*     */   private boolean isdigit(byte c) {
/* 789 */     return (c >= 48 && c <= 57);
/*     */   }
/*     */   
/*     */   private boolean isxdigit(byte c) {
/* 793 */     return ((c >= 48 && c <= 57) || (c >= 97 && c <= 102) || (c >= 65 && c <= 70));
/*     */   }
/*     */   
/*     */   private int hexvalue(byte c) {
/* 797 */     return (c <= 57) ? (c - 48) : ((c <= 70) ? (c + 10 - 65) : (c + 10 - 97));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double scannumber() {
/* 806 */     int i = this.m_offset, j = this.m_offset + this.m_length;
/* 807 */     while (i < j && isspace(this.m_bytes[i]))
/* 808 */       i++; 
/* 809 */     while (i < j && isspace(this.m_bytes[j - 1]))
/* 810 */       j--; 
/* 811 */     if (i >= j)
/* 812 */       return Double.NaN; 
/* 813 */     if (indexOf((byte)120, i - this.m_offset) != -1 || indexOf((byte)88, i - this.m_offset) != -1)
/* 814 */       return strx2number(i, j); 
/* 815 */     return scandouble(i, j);
/*     */   }
/*     */   
/*     */   private double strx2number(int start, int end) {
/* 819 */     double sgn = (this.m_bytes[start] == 45) ? -1.0D : 1.0D;
/* 820 */     if (sgn == -1.0D || this.m_bytes[start] == 43)
/* 821 */       start++; 
/* 822 */     if (start + 2 >= end)
/* 823 */       return Double.NaN; 
/* 824 */     if (this.m_bytes[start++] != 48)
/* 825 */       return Double.NaN; 
/* 826 */     if (this.m_bytes[start] != 120 && this.m_bytes[start] != 88)
/* 827 */       return Double.NaN; 
/* 828 */     start++;
/* 829 */     double m = 0.0D;
/* 830 */     int e = 0;
/* 831 */     boolean i = isxdigit(this.m_bytes[start]);
/* 832 */     while (start < end && isxdigit(this.m_bytes[start]))
/* 833 */       m = m * 16.0D + hexvalue(this.m_bytes[start++]); 
/* 834 */     if (start < end && this.m_bytes[start] == 46) {
/* 835 */       start++;
/* 836 */       while (start < end && isxdigit(this.m_bytes[start])) {
/* 837 */         m = m * 16.0D + hexvalue(this.m_bytes[start++]);
/* 838 */         e -= 4;
/*     */       } 
/*     */     } 
/* 841 */     if (!i && e == 0)
/* 842 */       return Double.NaN; 
/* 843 */     if (start < end && (this.m_bytes[start] == 112 || this.m_bytes[start] == 80)) {
/* 844 */       start++;
/* 845 */       int exp1 = 0;
/* 846 */       boolean neg1 = false;
/* 847 */       if (start < end) {
/* 848 */         if (this.m_bytes[start] == 45)
/* 849 */           neg1 = true; 
/* 850 */         if (neg1 || this.m_bytes[start] == 43)
/* 851 */           start++; 
/*     */       } 
/* 853 */       if (start >= end || !isdigit(this.m_bytes[start]))
/* 854 */         return Double.NaN; 
/* 855 */       while (start < end && isdigit(this.m_bytes[start]))
/* 856 */         exp1 = exp1 * 10 + this.m_bytes[start++] - 48; 
/* 857 */       if (neg1)
/* 858 */         exp1 = -exp1; 
/* 859 */       e += exp1;
/*     */     } 
/* 861 */     if (start != end)
/* 862 */       return Double.NaN; 
/* 863 */     return sgn * m * MathLib.dpow_d(2.0D, e);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double scannumber(int base) {
/* 872 */     if (base < 2 || base > 36)
/* 873 */       return Double.NaN; 
/* 874 */     int i = this.m_offset, j = this.m_offset + this.m_length;
/* 875 */     for (; i < j && isspace(this.m_bytes[i]); i++);
/* 876 */     for (; i < j && isspace(this.m_bytes[j - 1]); j--);
/* 877 */     if (i >= j)
/* 878 */       return Double.NaN; 
/* 879 */     return scanlong(base, i, j);
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
/*     */   private double scanlong(int base, int start, int end) {
/* 891 */     long x = 0L;
/* 892 */     boolean neg = (this.m_bytes[start] == 45);
/* 893 */     if (neg || this.m_bytes[start] == 43) start++; 
/* 894 */     for (int i = start; i < end; i++) {
/*     */       
/* 896 */       int digit = this.m_bytes[i] - ((base <= 10 || (this.m_bytes[i] >= 48 && this.m_bytes[i] <= 57)) ? 48 : ((this.m_bytes[i] >= 65 && this.m_bytes[i] <= 90) ? 55 : 87));
/* 897 */       if (digit < 0 || digit >= base)
/* 898 */         return Double.NaN; 
/* 899 */       x = x * base + digit;
/* 900 */       if (x < 0L)
/* 901 */         return Double.NaN; 
/*     */     } 
/* 903 */     return neg ? -x : x;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private double scandouble(int start, int end) {
/* 914 */     if (end > start + 64) end = start + 64; 
/* 915 */     for (int i = start; i < end; i++) {
/* 916 */       switch (this.m_bytes[i]) { case 43: case 45: case 46: case 48: case 49: case 50: case 51: case 52: case 53:
/*     */         case 54:
/*     */         case 55:
/*     */         case 56:
/*     */         case 57:
/*     */         case 69:
/*     */         case 101:
/*     */           break;
/*     */         default:
/* 925 */           return Double.NaN; }
/*     */     
/*     */     } 
/* 928 */     char[] c = new char[end - start];
/* 929 */     for (int j = start; j < end; j++)
/* 930 */       c[j - start] = (char)this.m_bytes[j]; 
/*     */     try {
/* 932 */       return Double.parseDouble(new String(c));
/* 933 */     } catch (Exception e) {
/* 934 */       return Double.NaN;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void printToStream(PrintStream ps) {
/* 944 */     for (int i = 0, n = this.m_length; i < n; i++) {
/* 945 */       int c = this.m_bytes[this.m_offset + i];
/* 946 */       ps.print((char)c);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */