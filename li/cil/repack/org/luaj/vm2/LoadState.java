/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import java.io.DataInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LoadState
/*     */ {
/* 109 */   public static final Globals.Undumper instance = new GlobalsUndumper();
/*     */ 
/*     */   
/*     */   public static final int NUMBER_FORMAT_FLOATS_OR_DOUBLES = 0;
/*     */ 
/*     */   
/*     */   public static final int NUMBER_FORMAT_INTS_ONLY = 1;
/*     */ 
/*     */   
/*     */   public static final int NUMBER_FORMAT_NUM_PATCH_INT32 = 4;
/*     */   
/*     */   public static final int LUA_TINT = -2;
/*     */   
/*     */   public static final int LUA_TNONE = -1;
/*     */   
/*     */   public static final int LUA_TNIL = 0;
/*     */   
/*     */   public static final int LUA_TBOOLEAN = 1;
/*     */   
/*     */   public static final int LUA_TLIGHTUSERDATA = 2;
/*     */   
/*     */   public static final int LUA_TNUMBER = 3;
/*     */   
/*     */   public static final int LUA_TSTRING = 4;
/*     */   
/*     */   public static final int LUA_TTABLE = 5;
/*     */   
/*     */   public static final int LUA_TFUNCTION = 6;
/*     */   
/*     */   public static final int LUA_TUSERDATA = 7;
/*     */   
/*     */   public static final int LUA_TTHREAD = 8;
/*     */   
/*     */   public static final int LUA_TVALUE = 9;
/*     */   
/* 144 */   public static String encoding = null;
/*     */ 
/*     */   
/* 147 */   public static final byte[] LUA_SIGNATURE = new byte[] { 27, 76, 117, 97 };
/*     */ 
/*     */   
/* 150 */   public static final byte[] LUAC_TAIL = new byte[] { 25, -109, 13, 10, 26, 10 };
/*     */   
/*     */   public static final String SOURCE_BINARY_STRING = "binary string";
/*     */   
/*     */   public static final int LUAC_VERSION = 82;
/*     */   
/*     */   public static final int LUAC_FORMAT = 0;
/*     */   
/*     */   public static final int LUAC_HEADERSIZE = 12;
/*     */   
/*     */   private int luacVersion;
/*     */   
/*     */   private int luacFormat;
/*     */   
/*     */   private boolean luacLittleEndian;
/*     */   
/*     */   private int luacSizeofInt;
/*     */   
/*     */   private int luacSizeofSizeT;
/*     */   
/*     */   private int luacSizeofInstruction;
/*     */   
/*     */   private int luacSizeofLuaNumber;
/*     */   
/*     */   private int luacNumberFormat;
/*     */   
/*     */   public final DataInputStream is;
/*     */   
/*     */   String name;
/*     */   
/* 180 */   private static final LuaValue[] NOVALUES = new LuaValue[0];
/* 181 */   private static final Prototype[] NOPROTOS = new Prototype[0];
/* 182 */   private static final LocVars[] NOLOCVARS = new LocVars[0];
/* 183 */   private static final Upvaldesc[] NOUPVALDESCS = new Upvaldesc[0];
/* 184 */   private static final int[] NOINTS = new int[0];
/*     */ 
/*     */   
/* 187 */   private byte[] buf = new byte[512];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void install(Globals globals) {
/* 194 */     globals.undumper = instance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int loadInt() throws IOException {
/* 203 */     this.is.readFully(this.buf, 0, 4);
/* 204 */     return this.luacLittleEndian ? (this.buf[3] << 24 | (0xFF & this.buf[2]) << 16 | (0xFF & this.buf[1]) << 8 | 0xFF & this.buf[0]) : (
/* 205 */       this.buf[0] << 24 | (0xFF & this.buf[1]) << 16 | (0xFF & this.buf[2]) << 8 | 0xFF & this.buf[3]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int[] loadIntArray() throws IOException {
/* 214 */     int n = loadInt();
/* 215 */     if (n == 0) {
/* 216 */       return NOINTS;
/*     */     }
/*     */     
/* 219 */     int m = n << 2;
/* 220 */     if (this.buf.length < m)
/* 221 */       this.buf = new byte[m]; 
/* 222 */     this.is.readFully(this.buf, 0, m);
/* 223 */     int[] array = new int[n];
/* 224 */     for (int i = 0, j = 0; i < n; i++, j += 4) {
/* 225 */       array[i] = this.luacLittleEndian ? (this.buf[j + 3] << 24 | (0xFF & this.buf[j + 2]) << 16 | (0xFF & this.buf[j + 1]) << 8 | 0xFF & this.buf[j + 0]) : (
/* 226 */         this.buf[j + 0] << 24 | (0xFF & this.buf[j + 1]) << 16 | (0xFF & this.buf[j + 2]) << 8 | 0xFF & this.buf[j + 3]);
/*     */     }
/* 228 */     return array;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   long loadInt64() throws IOException {
/*     */     int a;
/*     */     int b;
/* 238 */     if (this.luacLittleEndian) {
/* 239 */       a = loadInt();
/* 240 */       b = loadInt();
/*     */     } else {
/* 242 */       b = loadInt();
/* 243 */       a = loadInt();
/*     */     } 
/* 245 */     return b << 32L | a & 0xFFFFFFFFL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   LuaString loadString() throws IOException {
/* 254 */     int size = (this.luacSizeofSizeT == 8) ? (int)loadInt64() : loadInt();
/* 255 */     if (size == 0)
/* 256 */       return null; 
/* 257 */     byte[] bytes = new byte[size];
/* 258 */     this.is.readFully(bytes, 0, size);
/* 259 */     return LuaString.valueUsing(bytes, 0, bytes.length - 1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static LuaValue longBitsToLuaNumber(long bits) {
/* 270 */     if ((bits & Long.MAX_VALUE) == 0L) {
/* 271 */       return LuaValue.ZERO;
/*     */     }
/*     */     
/* 274 */     int e = (int)(bits >> 52L & 0x7FFL) - 1023;
/*     */     
/* 276 */     if (e >= 0 && e < 31) {
/* 277 */       long f = bits & 0xFFFFFFFFFFFFFL;
/* 278 */       int shift = 52 - e;
/* 279 */       long intPrecMask = (1L << shift) - 1L;
/* 280 */       if ((f & intPrecMask) == 0L) {
/* 281 */         int intValue = (int)(f >> shift) | 1 << e;
/* 282 */         return LuaInteger.valueOf((bits >> 63L != 0L) ? -intValue : intValue);
/*     */       } 
/*     */     } 
/*     */     
/* 286 */     return LuaValue.valueOf(Double.longBitsToDouble(bits));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   LuaValue loadNumber() throws IOException {
/* 296 */     if (this.luacNumberFormat == 1) {
/* 297 */       return LuaInteger.valueOf(loadInt());
/*     */     }
/* 299 */     return longBitsToLuaNumber(loadInt64());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void loadConstants(Prototype f) throws IOException {
/* 310 */     int n = loadInt();
/* 311 */     LuaValue[] values = (n > 0) ? new LuaValue[n] : NOVALUES;
/* 312 */     for (int i = 0; i < n; i++) {
/* 313 */       switch (this.is.readByte()) {
/*     */         case 0:
/* 315 */           values[i] = LuaValue.NIL;
/*     */           break;
/*     */         case 1:
/* 318 */           values[i] = (0 != this.is.readUnsignedByte()) ? LuaValue.TRUE : LuaValue.FALSE;
/*     */           break;
/*     */         case -2:
/* 321 */           values[i] = LuaInteger.valueOf(loadInt());
/*     */           break;
/*     */         case 3:
/* 324 */           values[i] = loadNumber();
/*     */           break;
/*     */         case 4:
/* 327 */           values[i] = loadString();
/*     */           break;
/*     */         default:
/* 330 */           throw new IllegalStateException("bad constant");
/*     */       } 
/*     */     } 
/* 333 */     f.k = values;
/*     */     
/* 335 */     n = loadInt();
/* 336 */     Prototype[] protos = (n > 0) ? new Prototype[n] : NOPROTOS;
/* 337 */     for (int j = 0; j < n; j++)
/* 338 */       protos[j] = loadFunction(f.source); 
/* 339 */     f.p = protos;
/*     */   }
/*     */   
/*     */   void loadUpvalues(Prototype f) throws IOException {
/* 343 */     int n = loadInt();
/* 344 */     f.upvalues = (n > 0) ? new Upvaldesc[n] : NOUPVALDESCS;
/* 345 */     for (int i = 0; i < n; i++) {
/* 346 */       boolean instack = (this.is.readByte() != 0);
/* 347 */       int idx = this.is.readByte() & 0xFF;
/* 348 */       f.upvalues[i] = new Upvaldesc(null, instack, idx);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   void loadDebug(Prototype f) throws IOException {
/* 359 */     f.source = loadString();
/* 360 */     f.lineinfo = loadIntArray();
/* 361 */     int n = loadInt();
/* 362 */     f.locvars = (n > 0) ? new LocVars[n] : NOLOCVARS; int i;
/* 363 */     for (i = 0; i < n; i++) {
/* 364 */       LuaString varname = loadString();
/* 365 */       int startpc = loadInt();
/* 366 */       int endpc = loadInt();
/* 367 */       f.locvars[i] = new LocVars(varname, startpc, endpc);
/*     */     } 
/*     */     
/* 370 */     n = loadInt();
/* 371 */     for (i = 0; i < n; i++) {
/* 372 */       (f.upvalues[i]).name = loadString();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Prototype loadFunction(LuaString p) throws IOException {
/* 383 */     Prototype f = new Prototype();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 388 */     f.linedefined = loadInt();
/* 389 */     f.lastlinedefined = loadInt();
/* 390 */     f.numparams = this.is.readUnsignedByte();
/* 391 */     f.is_vararg = this.is.readUnsignedByte();
/* 392 */     f.maxstacksize = this.is.readUnsignedByte();
/* 393 */     f.code = loadIntArray();
/* 394 */     loadConstants(f);
/* 395 */     loadUpvalues(f);
/* 396 */     loadDebug(f);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 403 */     return f;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void loadHeader() throws IOException {
/* 412 */     this.luacVersion = this.is.readByte();
/* 413 */     this.luacFormat = this.is.readByte();
/* 414 */     this.luacLittleEndian = (0 != this.is.readByte());
/* 415 */     this.luacSizeofInt = this.is.readByte();
/* 416 */     this.luacSizeofSizeT = this.is.readByte();
/* 417 */     this.luacSizeofInstruction = this.is.readByte();
/* 418 */     this.luacSizeofLuaNumber = this.is.readByte();
/* 419 */     this.luacNumberFormat = this.is.readByte();
/* 420 */     for (int i = 0; i < LUAC_TAIL.length; i++) {
/* 421 */       if (this.is.readByte() != LUAC_TAIL[i]) {
/* 422 */         throw new LuaError("Unexpeted byte in luac tail of header, index=" + i);
/*     */       }
/*     */     } 
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
/*     */   public static Prototype undump(InputStream stream, String chunkname) throws IOException {
/* 438 */     if (stream.read() != LUA_SIGNATURE[0] || stream.read() != LUA_SIGNATURE[1] || stream.read() != LUA_SIGNATURE[2] || stream
/* 439 */       .read() != LUA_SIGNATURE[3]) {
/* 440 */       return null;
/*     */     }
/*     */     
/* 443 */     String sname = getSourceName(chunkname);
/* 444 */     LoadState s = new LoadState(stream, sname);
/* 445 */     s.loadHeader();
/*     */ 
/*     */     
/* 448 */     switch (s.luacNumberFormat) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 0:
/*     */       case 1:
/*     */       case 4:
/* 456 */         return s.loadFunction(LuaString.valueOf(sname));
/*     */     } 
/*     */     throw new LuaError("unsupported int size");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getSourceName(String name) {
/* 466 */     String sname = name;
/* 467 */     if (name.startsWith("@") || name.startsWith("=")) {
/* 468 */       sname = name.substring(1);
/* 469 */     } else if (name.startsWith("\033")) {
/* 470 */       sname = "binary string";
/* 471 */     }  return sname;
/*     */   }
/*     */ 
/*     */   
/*     */   private LoadState(InputStream stream, String name) {
/* 476 */     this.name = name;
/* 477 */     this.is = new DataInputStream(stream);
/*     */   }
/*     */   
/*     */   private static final class GlobalsUndumper implements Globals.Undumper { private GlobalsUndumper() {}
/*     */     
/*     */     public Prototype undump(InputStream stream, String chunkname) throws IOException {
/* 483 */       return LoadState.undump(stream, chunkname);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LoadState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */