/*     */ package li.cil.repack.org.luaj.vm2.compiler;
/*     */ 
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import li.cil.repack.org.luaj.vm2.LoadState;
/*     */ import li.cil.repack.org.luaj.vm2.LocVars;
/*     */ import li.cil.repack.org.luaj.vm2.LuaString;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Prototype;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DumpState
/*     */ {
/*     */   public static boolean ALLOW_INTEGER_CASTING = false;
/*     */   public static final int NUMBER_FORMAT_FLOATS_OR_DOUBLES = 0;
/*     */   public static final int NUMBER_FORMAT_INTS_ONLY = 1;
/*     */   public static final int NUMBER_FORMAT_NUM_PATCH_INT32 = 4;
/*     */   public static final int NUMBER_FORMAT_DEFAULT = 0;
/*     */   private boolean IS_LITTLE_ENDIAN = true;
/* 107 */   private int NUMBER_FORMAT = 0;
/* 108 */   private int SIZEOF_LUA_NUMBER = 8;
/*     */   
/*     */   private static final int SIZEOF_INT = 4;
/*     */   private static final int SIZEOF_SIZET = 4;
/*     */   private static final int SIZEOF_INSTRUCTION = 4;
/*     */   DataOutputStream writer;
/*     */   boolean strip;
/*     */   int status;
/*     */   
/*     */   public DumpState(OutputStream w, boolean strip) {
/* 118 */     this.writer = new DataOutputStream(w);
/* 119 */     this.strip = strip;
/* 120 */     this.status = 0;
/*     */   }
/*     */   
/*     */   void dumpBlock(byte[] b, int size) throws IOException {
/* 124 */     this.writer.write(b, 0, size);
/*     */   }
/*     */   
/*     */   void dumpChar(int b) throws IOException {
/* 128 */     this.writer.write(b);
/*     */   }
/*     */   
/*     */   void dumpInt(int x) throws IOException {
/* 132 */     if (this.IS_LITTLE_ENDIAN) {
/* 133 */       this.writer.writeByte(x & 0xFF);
/* 134 */       this.writer.writeByte(x >> 8 & 0xFF);
/* 135 */       this.writer.writeByte(x >> 16 & 0xFF);
/* 136 */       this.writer.writeByte(x >> 24 & 0xFF);
/*     */     } else {
/* 138 */       this.writer.writeInt(x);
/*     */     } 
/*     */   }
/*     */   
/*     */   void dumpString(LuaString s) throws IOException {
/* 143 */     int len = s.len().toint();
/* 144 */     dumpInt(len + 1);
/* 145 */     s.write(this.writer, 0, len);
/* 146 */     this.writer.write(0);
/*     */   }
/*     */   
/*     */   void dumpDouble(double d) throws IOException {
/* 150 */     long l = Double.doubleToLongBits(d);
/* 151 */     if (this.IS_LITTLE_ENDIAN) {
/* 152 */       dumpInt((int)l);
/* 153 */       dumpInt((int)(l >> 32L));
/*     */     } else {
/* 155 */       this.writer.writeLong(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   void dumpCode(Prototype f) throws IOException {
/* 160 */     int[] code = f.code;
/* 161 */     int n = code.length;
/* 162 */     dumpInt(n);
/* 163 */     for (int i = 0; i < n; i++)
/* 164 */       dumpInt(code[i]); 
/*     */   }
/*     */   
/*     */   void dumpConstants(Prototype f) throws IOException {
/* 168 */     LuaValue[] k = f.k;
/* 169 */     int n = k.length;
/* 170 */     dumpInt(n); int i;
/* 171 */     for (i = 0; i < n; i++) {
/* 172 */       LuaValue o = k[i];
/* 173 */       switch (o.type()) {
/*     */         case 0:
/* 175 */           this.writer.write(0);
/*     */           break;
/*     */         case 1:
/* 178 */           this.writer.write(1);
/* 179 */           dumpChar(o.toboolean() ? 1 : 0);
/*     */           break;
/*     */         case 3:
/* 182 */           switch (this.NUMBER_FORMAT) {
/*     */             case 0:
/* 184 */               this.writer.write(3);
/* 185 */               dumpDouble(o.todouble());
/*     */               break;
/*     */             case 1:
/* 188 */               if (!ALLOW_INTEGER_CASTING && !o.isint())
/* 189 */                 throw new IllegalArgumentException("not an integer: " + o); 
/* 190 */               this.writer.write(3);
/* 191 */               dumpInt(o.toint());
/*     */               break;
/*     */             case 4:
/* 194 */               if (o.isint()) {
/* 195 */                 this.writer.write(-2);
/* 196 */                 dumpInt(o.toint()); break;
/*     */               } 
/* 198 */               this.writer.write(3);
/* 199 */               dumpDouble(o.todouble());
/*     */               break;
/*     */           } 
/*     */           
/* 203 */           throw new IllegalArgumentException("number format not supported: " + this.NUMBER_FORMAT);
/*     */ 
/*     */         
/*     */         case 4:
/* 207 */           this.writer.write(4);
/* 208 */           dumpString((LuaString)o);
/*     */           break;
/*     */         default:
/* 211 */           throw new IllegalArgumentException("bad type for " + o);
/*     */       } 
/*     */     } 
/* 214 */     n = f.p.length;
/* 215 */     dumpInt(n);
/* 216 */     for (i = 0; i < n; i++)
/* 217 */       dumpFunction(f.p[i]); 
/*     */   }
/*     */   
/*     */   void dumpUpvalues(Prototype f) throws IOException {
/* 221 */     int n = f.upvalues.length;
/* 222 */     dumpInt(n);
/* 223 */     for (int i = 0; i < n; i++) {
/* 224 */       this.writer.writeByte((f.upvalues[i]).instack ? 1 : 0);
/* 225 */       this.writer.writeByte((f.upvalues[i]).idx);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   void dumpDebug(Prototype f) throws IOException {
/* 231 */     if (this.strip) {
/* 232 */       dumpInt(0);
/*     */     } else {
/* 234 */       dumpString(f.source);
/* 235 */     }  int n = this.strip ? 0 : f.lineinfo.length;
/* 236 */     dumpInt(n); int i;
/* 237 */     for (i = 0; i < n; i++)
/* 238 */       dumpInt(f.lineinfo[i]); 
/* 239 */     n = this.strip ? 0 : f.locvars.length;
/* 240 */     dumpInt(n);
/* 241 */     for (i = 0; i < n; i++) {
/* 242 */       LocVars lvi = f.locvars[i];
/* 243 */       dumpString(lvi.varname);
/* 244 */       dumpInt(lvi.startpc);
/* 245 */       dumpInt(lvi.endpc);
/*     */     } 
/* 247 */     n = this.strip ? 0 : f.upvalues.length;
/* 248 */     dumpInt(n);
/* 249 */     for (i = 0; i < n; i++)
/* 250 */       dumpString((f.upvalues[i]).name); 
/*     */   }
/*     */   
/*     */   void dumpFunction(Prototype f) throws IOException {
/* 254 */     dumpInt(f.linedefined);
/* 255 */     dumpInt(f.lastlinedefined);
/* 256 */     dumpChar(f.numparams);
/* 257 */     dumpChar(f.is_vararg);
/* 258 */     dumpChar(f.maxstacksize);
/* 259 */     dumpCode(f);
/* 260 */     dumpConstants(f);
/* 261 */     dumpUpvalues(f);
/* 262 */     dumpDebug(f);
/*     */   }
/*     */   
/*     */   void dumpHeader() throws IOException {
/* 266 */     this.writer.write(LoadState.LUA_SIGNATURE);
/* 267 */     this.writer.write(82);
/* 268 */     this.writer.write(0);
/* 269 */     this.writer.write(this.IS_LITTLE_ENDIAN ? 1 : 0);
/* 270 */     this.writer.write(4);
/* 271 */     this.writer.write(4);
/* 272 */     this.writer.write(4);
/* 273 */     this.writer.write(this.SIZEOF_LUA_NUMBER);
/* 274 */     this.writer.write(this.NUMBER_FORMAT);
/* 275 */     this.writer.write(LoadState.LUAC_TAIL);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int dump(Prototype f, OutputStream w, boolean strip) throws IOException {
/* 282 */     DumpState D = new DumpState(w, strip);
/* 283 */     D.dumpHeader();
/* 284 */     D.dumpFunction(f);
/* 285 */     return D.status;
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
/*     */   public static int dump(Prototype f, OutputStream w, boolean stripDebug, int numberFormat, boolean littleendian) throws IOException {
/* 304 */     switch (numberFormat) {
/*     */       case 0:
/*     */       case 1:
/*     */       case 4:
/*     */         break;
/*     */       default:
/* 310 */         throw new IllegalArgumentException("number format not supported: " + numberFormat);
/*     */     } 
/* 312 */     DumpState D = new DumpState(w, stripDebug);
/* 313 */     D.IS_LITTLE_ENDIAN = littleendian;
/* 314 */     D.NUMBER_FORMAT = numberFormat;
/* 315 */     D.SIZEOF_LUA_NUMBER = (numberFormat == 1) ? 4 : 8;
/* 316 */     D.dumpHeader();
/* 317 */     D.dumpFunction(f);
/* 318 */     return D.status;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\compiler\DumpState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */