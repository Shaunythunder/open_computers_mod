/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Buffer
/*     */ {
/*     */   private static final int DEFAULT_CAPACITY = 64;
/*  44 */   private static final byte[] NOBYTES = new byte[0];
/*     */ 
/*     */ 
/*     */   
/*     */   private byte[] bytes;
/*     */ 
/*     */ 
/*     */   
/*     */   private int length;
/*     */ 
/*     */ 
/*     */   
/*     */   private int offset;
/*     */ 
/*     */   
/*     */   private LuaValue value;
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer() {
/*  64 */     this(64);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer(int initialCapacity) {
/*  73 */     this.bytes = new byte[initialCapacity];
/*  74 */     this.length = 0;
/*  75 */     this.offset = 0;
/*  76 */     this.value = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer(LuaValue value) {
/*  85 */     this.bytes = NOBYTES;
/*  86 */     this.length = this.offset = 0;
/*  87 */     this.value = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue value() {
/*  96 */     return (this.value != null) ? this.value : tostring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer setvalue(LuaValue value) {
/* 105 */     this.bytes = NOBYTES;
/* 106 */     this.offset = this.length = 0;
/* 107 */     this.value = value;
/* 108 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaString tostring() {
/* 117 */     realloc(this.length, 0);
/* 118 */     return LuaString.valueOf(this.bytes, this.offset, this.length);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String tojstring() {
/* 127 */     return value().tojstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 137 */     return tojstring();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer append(byte b) {
/* 146 */     makeroom(0, 1);
/* 147 */     this.bytes[this.offset + this.length++] = b;
/* 148 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer append(LuaValue val) {
/* 157 */     append(val.strvalue());
/* 158 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer append(LuaString str) {
/* 167 */     int n = str.m_length;
/* 168 */     makeroom(0, n);
/* 169 */     str.copyInto(0, this.bytes, this.offset + this.length, n);
/* 170 */     this.length += n;
/* 171 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer append(String str) {
/* 182 */     char[] c = str.toCharArray();
/* 183 */     int n = LuaString.lengthAsUtf8(c);
/* 184 */     makeroom(0, n);
/* 185 */     LuaString.encodeToUtf8(c, c.length, this.bytes, this.offset + this.length);
/* 186 */     this.length += n;
/* 187 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer concatTo(LuaValue lhs) {
/* 198 */     return setvalue(lhs.concat(value()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer concatTo(LuaString lhs) {
/* 209 */     return (this.value != null && !this.value.isstring()) ? setvalue(lhs.concat(this.value)) : prepend(lhs);
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
/*     */   public Buffer concatTo(LuaNumber lhs) {
/* 222 */     return (this.value != null && !this.value.isstring()) ? setvalue(lhs.concat(this.value)) : prepend(lhs.strvalue());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Buffer prepend(LuaString s) {
/* 233 */     int n = s.m_length;
/* 234 */     makeroom(n, 0);
/* 235 */     System.arraycopy(s.m_bytes, s.m_offset, this.bytes, this.offset - n, n);
/* 236 */     this.offset -= n;
/* 237 */     this.length += n;
/* 238 */     this.value = null;
/* 239 */     return this;
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
/*     */   public void makeroom(int nbefore, int nafter) {
/* 251 */     if (this.value != null) {
/* 252 */       LuaString s = this.value.strvalue();
/* 253 */       this.value = null;
/* 254 */       this.length = s.m_length;
/* 255 */       this.offset = nbefore;
/* 256 */       this.bytes = new byte[nbefore + this.length + nafter];
/* 257 */       System.arraycopy(s.m_bytes, s.m_offset, this.bytes, this.offset, this.length);
/* 258 */     } else if (this.offset + this.length + nafter > this.bytes.length || this.offset < nbefore) {
/* 259 */       int n = nbefore + this.length + nafter;
/* 260 */       int m = (n < 32) ? 32 : ((n < this.length * 2) ? (this.length * 2) : n);
/* 261 */       realloc(m, (nbefore == 0) ? 0 : (m - this.length - nafter));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void realloc(int newSize, int newOffset) {
/* 272 */     if (newSize != this.bytes.length) {
/* 273 */       byte[] newBytes = new byte[newSize];
/* 274 */       System.arraycopy(this.bytes, this.offset, newBytes, newOffset, this.length);
/* 275 */       this.bytes = newBytes;
/* 276 */       this.offset = newOffset;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\Buffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */