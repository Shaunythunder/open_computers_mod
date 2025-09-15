/*     */ package li.cil.repack.org.luaj.vm2.compiler;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.LocVars;
/*     */ import li.cil.repack.org.luaj.vm2.Lua;
/*     */ import li.cil.repack.org.luaj.vm2.LuaError;
/*     */ import li.cil.repack.org.luaj.vm2.LuaString;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Prototype;
/*     */ import li.cil.repack.org.luaj.vm2.Upvaldesc;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Constants
/*     */   extends Lua
/*     */ {
/*     */   public static final int MAXSTACK = 250;
/*     */   static final int LUAI_MAXUPVAL = 255;
/*     */   static final int LUAI_MAXVARS = 200;
/*     */   static final int NO_REG = 255;
/*     */   static final int iABC = 0;
/*     */   static final int iABx = 1;
/*     */   static final int iAsBx = 2;
/*     */   static final int OpArgN = 0;
/*     */   static final int OpArgU = 1;
/*     */   static final int OpArgR = 2;
/*     */   static final int OpArgK = 3;
/*     */   
/*     */   protected static void _assert(boolean b) {
/*  57 */     if (!b)
/*  58 */       throw new LuaError("compiler assert failed"); 
/*     */   }
/*     */   
/*     */   static void SET_OPCODE(InstructionPtr i, int o) {
/*  62 */     i.set(i.get() & 0xFFFFFFC0 | o << 0 & 0x3F);
/*     */   }
/*     */   
/*     */   static void SETARG_A(int[] code, int index, int u) {
/*  66 */     code[index] = code[index] & 0xFFFFC03F | u << 6 & 0x3FC0;
/*     */   }
/*     */   
/*     */   static void SETARG_A(InstructionPtr i, int u) {
/*  70 */     i.set(i.get() & 0xFFFFC03F | u << 6 & 0x3FC0);
/*     */   }
/*     */   
/*     */   static void SETARG_B(InstructionPtr i, int u) {
/*  74 */     i.set(i.get() & 0x7FFFFF | u << 23 & 0xFF800000);
/*     */   }
/*     */   
/*     */   static void SETARG_C(InstructionPtr i, int u) {
/*  78 */     i.set(i.get() & 0xFF803FFF | u << 14 & 0x7FC000);
/*     */   }
/*     */   
/*     */   static void SETARG_Bx(InstructionPtr i, int u) {
/*  82 */     i.set(i.get() & 0x3FFF | u << 14 & 0xFFFFC000);
/*     */   }
/*     */   
/*     */   static void SETARG_sBx(InstructionPtr i, int u) {
/*  86 */     SETARG_Bx(i, u + 131071);
/*     */   }
/*     */   
/*     */   static int CREATE_ABC(int o, int a, int b, int c) {
/*  90 */     return o << 0 & 0x3F | a << 6 & 0x3FC0 | b << 23 & 0xFF800000 | c << 14 & 0x7FC000;
/*     */   }
/*     */   
/*     */   static int CREATE_ABx(int o, int a, int bc) {
/*  94 */     return o << 0 & 0x3F | a << 6 & 0x3FC0 | bc << 14 & 0xFFFFC000;
/*     */   }
/*     */   
/*     */   static int CREATE_Ax(int o, int a) {
/*  98 */     return o << 0 & 0x3F | a << 6 & 0xFFFFFFC0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static LuaValue[] realloc(LuaValue[] v, int n) {
/* 104 */     LuaValue[] a = new LuaValue[n];
/* 105 */     if (v != null)
/* 106 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 107 */     return a;
/*     */   }
/*     */   
/*     */   static Prototype[] realloc(Prototype[] v, int n) {
/* 111 */     Prototype[] a = new Prototype[n];
/* 112 */     if (v != null)
/* 113 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 114 */     return a;
/*     */   }
/*     */   
/*     */   static LuaString[] realloc(LuaString[] v, int n) {
/* 118 */     LuaString[] a = new LuaString[n];
/* 119 */     if (v != null)
/* 120 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 121 */     return a;
/*     */   }
/*     */   
/*     */   static LocVars[] realloc(LocVars[] v, int n) {
/* 125 */     LocVars[] a = new LocVars[n];
/* 126 */     if (v != null)
/* 127 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 128 */     return a;
/*     */   }
/*     */   
/*     */   static Upvaldesc[] realloc(Upvaldesc[] v, int n) {
/* 132 */     Upvaldesc[] a = new Upvaldesc[n];
/* 133 */     if (v != null)
/* 134 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 135 */     return a;
/*     */   }
/*     */   
/*     */   static LexState.Vardesc[] realloc(LexState.Vardesc[] v, int n) {
/* 139 */     LexState.Vardesc[] a = new LexState.Vardesc[n];
/* 140 */     if (v != null)
/* 141 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 142 */     return a;
/*     */   }
/*     */   
/*     */   static LexState.Labeldesc[] grow(LexState.Labeldesc[] v, int min_n) {
/* 146 */     return (v == null) ? new LexState.Labeldesc[2] : ((v.length < min_n) ? realloc(v, v.length * 2) : v);
/*     */   }
/*     */   
/*     */   static LexState.Labeldesc[] realloc(LexState.Labeldesc[] v, int n) {
/* 150 */     LexState.Labeldesc[] a = new LexState.Labeldesc[n];
/* 151 */     if (v != null)
/* 152 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 153 */     return a;
/*     */   }
/*     */   
/*     */   static int[] realloc(int[] v, int n) {
/* 157 */     int[] a = new int[n];
/* 158 */     if (v != null)
/* 159 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 160 */     return a;
/*     */   }
/*     */   
/*     */   static byte[] realloc(byte[] v, int n) {
/* 164 */     byte[] a = new byte[n];
/* 165 */     if (v != null)
/* 166 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 167 */     return a;
/*     */   }
/*     */   
/*     */   static char[] realloc(char[] v, int n) {
/* 171 */     char[] a = new char[n];
/* 172 */     if (v != null)
/* 173 */       System.arraycopy(v, 0, a, 0, Math.min(v.length, n)); 
/* 174 */     return a;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\compiler\Constants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */