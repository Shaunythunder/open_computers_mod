/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Print
/*     */   extends Lua
/*     */ {
/*     */   private static final String STRING_FOR_NULL = "null";
/*  37 */   public static PrintStream ps = System.out;
/*     */ 
/*     */   
/*  40 */   public static final String[] OPNAMES = new String[] { "MOVE", "LOADK", "LOADKX", "LOADBOOL", "LOADNIL", "GETUPVAL", "GETTABUP", "GETTABLE", "SETTABUP", "SETUPVAL", "SETTABLE", "NEWTABLE", "SELF", "ADD", "SUB", "MUL", "DIV", "MOD", "POW", "UNM", "NOT", "LEN", "CONCAT", "JMP", "EQ", "LT", "LE", "TEST", "TESTSET", "CALL", "TAILCALL", "RETURN", "FORLOOP", "FORPREP", "TFORCALL", "TFORLOOP", "SETLIST", "CLOSURE", "VARARG", "EXTRAARG", null };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void printString(PrintStream ps, LuaString s) {
/*  47 */     ps.print('"');
/*  48 */     for (int i = 0, n = s.m_length; i < n; i++) {
/*  49 */       int c = s.m_bytes[s.m_offset + i];
/*  50 */       if (c >= 32 && c <= 126 && c != 34 && c != 92) {
/*  51 */         ps.print((char)c);
/*     */       } else {
/*  53 */         switch (c) {
/*     */           case 34:
/*  55 */             ps.print("\\\"");
/*     */             break;
/*     */           case 92:
/*  58 */             ps.print("\\\\");
/*     */             break;
/*     */           case 7:
/*  61 */             ps.print("\\a");
/*     */             break;
/*     */           case 8:
/*  64 */             ps.print("\\b");
/*     */             break;
/*     */           case 12:
/*  67 */             ps.print("\\f");
/*     */             break;
/*     */           case 9:
/*  70 */             ps.print("\\t");
/*     */             break;
/*     */           case 13:
/*  73 */             ps.print("\\r");
/*     */             break;
/*     */           case 10:
/*  76 */             ps.print("\\n");
/*     */             break;
/*     */           case 11:
/*  79 */             ps.print("\\v");
/*     */             break;
/*     */           default:
/*  82 */             ps.print('\\');
/*  83 */             ps.print(Integer.toString(0x4E7 & c).substring(1));
/*     */             break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  88 */     ps.print('"');
/*     */   }
/*     */   
/*     */   static void printValue(PrintStream ps, LuaValue v) {
/*  92 */     if (v == null) {
/*  93 */       ps.print("null");
/*     */       return;
/*     */     } 
/*  96 */     switch (v.type()) {
/*     */       case 4:
/*  98 */         printString(ps, (LuaString)v);
/*     */         return;
/*     */     } 
/* 101 */     ps.print(v.tojstring());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static void printConstant(PrintStream ps, Prototype f, int i) {
/* 107 */     printValue(ps, (i < f.k.length) ? f.k[i] : LuaValue.valueOf("UNKNOWN_CONST_" + i));
/*     */   }
/*     */   
/*     */   static void printUpvalue(PrintStream ps, Upvaldesc u) {
/* 111 */     ps.print(u.idx + " ");
/* 112 */     printValue(ps, u.name);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void printCode(Prototype f) {
/* 121 */     int[] code = f.code;
/* 122 */     int n = code.length;
/* 123 */     for (int pc = 0; pc < n; pc++) {
/* 124 */       pc = printOpCode(f, pc);
/* 125 */       ps.println();
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
/*     */   public static int printOpCode(Prototype f, int pc) {
/* 137 */     return printOpCode(ps, f, pc);
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
/*     */   public static int printOpCode(PrintStream ps, Prototype f, int pc) {
/* 149 */     int[] code = f.code;
/* 150 */     int i = code[pc];
/* 151 */     int o = GET_OPCODE(i);
/* 152 */     int a = GETARG_A(i);
/* 153 */     int b = GETARG_B(i);
/* 154 */     int c = GETARG_C(i);
/* 155 */     int bx = GETARG_Bx(i);
/* 156 */     int sbx = GETARG_sBx(i);
/* 157 */     int line = getline(f, pc);
/* 158 */     ps.print("  " + (pc + 1) + "  ");
/* 159 */     if (line > 0) {
/* 160 */       ps.print("[" + line + "]  ");
/*     */     } else {
/* 162 */       ps.print("[-]  ");
/* 163 */     }  if (o >= OPNAMES.length - 1) {
/* 164 */       ps.print("UNKNOWN_OP_" + o + "  ");
/*     */     } else {
/* 166 */       ps.print(OPNAMES[o] + "  ");
/* 167 */       switch (getOpMode(o)) {
/*     */         case 0:
/* 169 */           ps.print(a);
/* 170 */           if (getBMode(o) != 0)
/* 171 */             ps.print(" " + (ISK(b) ? (-1 - INDEXK(b)) : b)); 
/* 172 */           if (getCMode(o) != 0)
/* 173 */             ps.print(" " + (ISK(c) ? (-1 - INDEXK(c)) : c)); 
/*     */           break;
/*     */         case 1:
/* 176 */           if (getBMode(o) == 3) {
/* 177 */             ps.print(a + " " + (-1 - bx)); break;
/*     */           } 
/* 179 */           ps.print(a + " " + bx);
/*     */           break;
/*     */         
/*     */         case 2:
/* 183 */           if (o == 23) {
/* 184 */             ps.print(sbx); break;
/*     */           } 
/* 186 */           ps.print(a + " " + sbx);
/*     */           break;
/*     */       } 
/* 189 */       switch (o) {
/*     */         case 1:
/* 191 */           ps.print("  ; ");
/* 192 */           printConstant(ps, f, bx);
/*     */           break;
/*     */         case 5:
/*     */         case 9:
/* 196 */           ps.print("  ; ");
/* 197 */           if (b < f.upvalues.length) {
/* 198 */             printUpvalue(ps, f.upvalues[b]); break;
/*     */           } 
/* 200 */           ps.print("UNKNOWN_UPVALUE_" + b);
/*     */           break;
/*     */         
/*     */         case 6:
/* 204 */           ps.print("  ; ");
/* 205 */           if (b < f.upvalues.length) {
/* 206 */             printUpvalue(ps, f.upvalues[b]);
/*     */           } else {
/* 208 */             ps.print("UNKNOWN_UPVALUE_" + b);
/*     */           } 
/* 210 */           ps.print(" ");
/* 211 */           if (ISK(c)) {
/* 212 */             printConstant(ps, f, INDEXK(c)); break;
/*     */           } 
/* 214 */           ps.print("-");
/*     */           break;
/*     */         case 8:
/* 217 */           ps.print("  ; ");
/* 218 */           if (a < f.upvalues.length) {
/* 219 */             printUpvalue(ps, f.upvalues[a]);
/*     */           } else {
/* 221 */             ps.print("UNKNOWN_UPVALUE_" + a);
/*     */           } 
/* 223 */           ps.print(" ");
/* 224 */           if (ISK(b)) {
/* 225 */             printConstant(ps, f, INDEXK(b));
/*     */           } else {
/* 227 */             ps.print("-");
/* 228 */           }  ps.print(" ");
/* 229 */           if (ISK(c)) {
/* 230 */             printConstant(ps, f, INDEXK(c)); break;
/*     */           } 
/* 232 */           ps.print("-");
/*     */           break;
/*     */         case 7:
/*     */         case 12:
/* 236 */           if (ISK(c)) {
/* 237 */             ps.print("  ; ");
/* 238 */             printConstant(ps, f, INDEXK(c));
/*     */           } 
/*     */           break;
/*     */         case 10:
/*     */         case 13:
/*     */         case 14:
/*     */         case 15:
/*     */         case 16:
/*     */         case 18:
/*     */         case 24:
/*     */         case 25:
/*     */         case 26:
/* 250 */           if (ISK(b) || ISK(c)) {
/* 251 */             ps.print("  ; ");
/* 252 */             if (ISK(b)) {
/* 253 */               printConstant(ps, f, INDEXK(b));
/*     */             } else {
/* 255 */               ps.print("-");
/* 256 */             }  ps.print(" ");
/* 257 */             if (ISK(c)) {
/* 258 */               printConstant(ps, f, INDEXK(c)); break;
/*     */             } 
/* 260 */             ps.print("-");
/*     */           } 
/*     */           break;
/*     */         case 23:
/*     */         case 32:
/*     */         case 33:
/* 266 */           ps.print("  ; to " + (sbx + pc + 2));
/*     */           break;
/*     */         case 37:
/* 269 */           if (bx < f.p.length) {
/* 270 */             ps.print("  ; " + f.p[bx].getClass().getName()); break;
/*     */           } 
/* 272 */           ps.print("  ; UNKNOWN_PROTYPE_" + bx);
/*     */           break;
/*     */         
/*     */         case 36:
/* 276 */           if (c == 0) {
/* 277 */             ps.print("  ; " + code[++pc] + " (stored in the next OP)"); break;
/*     */           } 
/* 279 */           ps.print("  ; " + c);
/*     */           break;
/*     */         case 38:
/* 282 */           ps.print("  ; is_vararg=" + f.is_vararg);
/*     */           break;
/*     */       } 
/*     */ 
/*     */     
/*     */     } 
/* 288 */     return pc;
/*     */   }
/*     */   
/*     */   private static int getline(Prototype f, int pc) {
/* 292 */     return (pc > 0 && f.lineinfo != null && pc < f.lineinfo.length) ? f.lineinfo[pc] : -1;
/*     */   }
/*     */   
/*     */   static void printHeader(Prototype f) {
/* 296 */     String s = String.valueOf(f.source);
/* 297 */     if (s.startsWith("@") || s.startsWith("=")) {
/* 298 */       s = s.substring(1);
/* 299 */     } else if ("\033Lua".equals(s)) {
/* 300 */       s = "(bstring)";
/*     */     } else {
/* 302 */       s = "(string)";
/* 303 */     }  String a = (f.linedefined == 0) ? "main" : "function";
/* 304 */     ps.print("\n%" + a + " <" + s + ":" + f.linedefined + "," + f.lastlinedefined + "> (" + f.code.length + " instructions, " + (f.code.length * 4) + " bytes at " + 
/* 305 */         id(f) + ")\n");
/* 306 */     ps.print(f.numparams + " param, " + f.maxstacksize + " slot, " + f.upvalues.length + " upvalue, ");
/* 307 */     ps.print(f.locvars.length + " local, " + f.k.length + " constant, " + f.p.length + " function\n");
/*     */   }
/*     */   
/*     */   static void printConstants(Prototype f) {
/* 311 */     int n = f.k.length;
/* 312 */     ps.print("constants (" + n + ") for " + id(f) + ":\n");
/* 313 */     for (int i = 0; i < n; i++) {
/* 314 */       ps.print("  " + (i + 1) + "  ");
/* 315 */       printValue(ps, f.k[i]);
/* 316 */       ps.print("\n");
/*     */     } 
/*     */   }
/*     */   
/*     */   static void printLocals(Prototype f) {
/* 321 */     int n = f.locvars.length;
/* 322 */     ps.print("locals (" + n + ") for " + id(f) + ":\n");
/* 323 */     for (int i = 0; i < n; i++) {
/* 324 */       ps.println("  " + i + "  " + (f.locvars[i]).varname + " " + ((f.locvars[i]).startpc + 1) + " " + ((f.locvars[i]).endpc + 1));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static void printUpValues(Prototype f) {
/* 330 */     int n = f.upvalues.length;
/* 331 */     ps.print("upvalues (" + n + ") for " + id(f) + ":\n");
/* 332 */     for (int i = 0; i < n; i++) {
/* 333 */       ps.print("  " + i + "  " + f.upvalues[i] + "\n");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void print(Prototype prototype) {
/* 343 */     printFunction(prototype, true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void printFunction(Prototype prototype, boolean full) {
/* 353 */     int n = prototype.p.length;
/* 354 */     printHeader(prototype);
/* 355 */     printCode(prototype);
/* 356 */     if (full) {
/* 357 */       printConstants(prototype);
/* 358 */       printLocals(prototype);
/* 359 */       printUpValues(prototype);
/*     */     } 
/* 361 */     for (int i = 0; i < n; i++)
/* 362 */       printFunction(prototype.p[i], full); 
/*     */   }
/*     */   
/*     */   private static void format(String s, int maxcols) {
/* 366 */     int n = s.length();
/* 367 */     if (n > maxcols) {
/* 368 */       ps.print(s.substring(0, maxcols));
/*     */     } else {
/* 370 */       ps.print(s);
/* 371 */       for (int i = maxcols - n; --i >= 0;)
/* 372 */         ps.print(' '); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String id(Prototype f) {
/* 377 */     return "Proto";
/*     */   }
/*     */   
/*     */   private void _assert(boolean b) {
/* 381 */     if (!b) {
/* 382 */       throw new NullPointerException("_assert failed");
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
/*     */   public static void printState(LuaClosure cl, int pc, LuaValue[] stack, int top, Varargs varargs) {
/* 396 */     PrintStream previous = ps;
/* 397 */     ByteArrayOutputStream baos = new ByteArrayOutputStream();
/* 398 */     ps = new PrintStream(baos);
/* 399 */     printOpCode(cl.p, pc);
/* 400 */     ps.flush();
/* 401 */     ps.close();
/* 402 */     ps = previous;
/* 403 */     format(baos.toString(), 50);
/* 404 */     printStack(stack, top, varargs);
/* 405 */     ps.println();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void printStack(LuaValue[] stack, int top, Varargs varargs) {
/* 410 */     ps.print('[');
/* 411 */     for (int i = 0; i < stack.length; i++) {
/* 412 */       LuaValue v = stack[i];
/* 413 */       if (v == null) {
/* 414 */         ps.print("null");
/*     */       } else {
/* 416 */         LuaString s; Object o; switch (v.type()) {
/*     */           case 4:
/* 418 */             s = v.checkstring();
/* 419 */             ps.print((s.length() < 48) ? s.tojstring() : (
/* 420 */                 s.substring(0, 32).tojstring() + "...+" + (s.length() - 32) + "b"));
/*     */             break;
/*     */           case 6:
/* 423 */             ps.print(v.tojstring());
/*     */             break;
/*     */           case 7:
/* 426 */             o = v.touserdata();
/* 427 */             if (o != null) {
/* 428 */               String n = o.getClass().getName();
/* 429 */               n = n.substring(n.lastIndexOf('.') + 1);
/* 430 */               ps.print(n + ": " + Integer.toHexString(o.hashCode())); break;
/*     */             } 
/* 432 */             ps.print(v.toString());
/*     */             break;
/*     */           
/*     */           default:
/* 436 */             ps.print(v.tojstring()); break;
/*     */         } 
/* 438 */       }  if (i + 1 == top)
/* 439 */         ps.print(']'); 
/* 440 */       ps.print(" | ");
/*     */     } 
/* 442 */     ps.print(varargs);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\Print.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */