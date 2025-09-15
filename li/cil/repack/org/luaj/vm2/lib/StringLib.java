/*      */ package li.cil.repack.org.luaj.vm2.lib;
/*      */ 
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.IOException;
/*      */ import li.cil.repack.org.luaj.vm2.Buffer;
/*      */ import li.cil.repack.org.luaj.vm2.LuaClosure;
/*      */ import li.cil.repack.org.luaj.vm2.LuaFunction;
/*      */ import li.cil.repack.org.luaj.vm2.LuaString;
/*      */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*      */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*      */ import li.cil.repack.org.luaj.vm2.Varargs;
/*      */ import li.cil.repack.org.luaj.vm2.compat.JavaCompat;
/*      */ import li.cil.repack.org.luaj.vm2.compiler.DumpState;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class StringLib
/*      */   extends TwoArgFunction
/*      */ {
/*      */   private static final String FLAGS = "-+ #0";
/*      */   private static final int L_ESC = 37;
/*      */   
/*      */   public LuaValue call(LuaValue modname, LuaValue env) {
/*   81 */     LuaTable string = new LuaTable();
/*   82 */     string.set("byte", (LuaValue)new _byte());
/*   83 */     string.set("char", (LuaValue)new _char());
/*   84 */     string.set("dump", (LuaValue)new dump());
/*   85 */     string.set("find", (LuaValue)new find());
/*   86 */     string.set("format", (LuaValue)new format());
/*   87 */     string.set("gmatch", (LuaValue)new gmatch());
/*   88 */     string.set("gsub", (LuaValue)new gsub());
/*   89 */     string.set("len", (LuaValue)new len());
/*   90 */     string.set("lower", (LuaValue)new lower());
/*   91 */     string.set("match", (LuaValue)new match());
/*   92 */     string.set("rep", (LuaValue)new rep());
/*   93 */     string.set("reverse", (LuaValue)new reverse());
/*   94 */     string.set("sub", (LuaValue)new sub());
/*   95 */     string.set("upper", (LuaValue)new upper());
/*      */     
/*   97 */     env.set("string", (LuaValue)string);
/*   98 */     if (!env.get("package").isnil()) env.get("package").get("loaded").set("string", (LuaValue)string); 
/*   99 */     if (LuaString.s_metatable == null) {
/*  100 */       LuaString.s_metatable = (LuaValue)LuaValue.tableOf(new LuaValue[] { (LuaValue)INDEX, (LuaValue)string });
/*      */     }
/*  102 */     return (LuaValue)string;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class _byte
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  118 */       LuaString s = args.checkstring(1);
/*  119 */       int l = s.m_length;
/*  120 */       int posi = StringLib.posrelat(args.optint(2, 1), l);
/*  121 */       int pose = StringLib.posrelat(args.optint(3, posi), l);
/*      */       
/*  123 */       if (posi <= 0) posi = 1; 
/*  124 */       if (pose > l) pose = l; 
/*  125 */       if (posi > pose) return (Varargs)NONE; 
/*  126 */       int n = pose - posi + 1;
/*  127 */       if (posi + n <= pose)
/*  128 */         error("string slice too long"); 
/*  129 */       LuaValue[] v = new LuaValue[n];
/*  130 */       for (int i = 0; i < n; i++)
/*  131 */         v[i] = (LuaValue)valueOf(s.luaByte(posi + i - 1)); 
/*  132 */       return varargsOf(v);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class _char
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  149 */       int n = args.narg();
/*  150 */       byte[] bytes = new byte[n];
/*  151 */       for (int i = 0, a = 1; i < n; i++, a++) {
/*  152 */         int c = args.checkint(a);
/*  153 */         if (c < 0 || c >= 256) argerror(a, "invalid value for string.char [0; 255]: " + c); 
/*  154 */         bytes[i] = (byte)c;
/*      */       } 
/*  156 */       return (Varargs)LuaString.valueUsing(bytes);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class dump
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  173 */       LuaFunction luaFunction = args.checkfunction(1);
/*  174 */       ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*      */       try {
/*  176 */         DumpState.dump(((LuaClosure)luaFunction).p, baos, args.optboolean(2, true));
/*  177 */         return (Varargs)LuaString.valueUsing(baos.toByteArray());
/*  178 */       } catch (IOException e) {
/*  179 */         return (Varargs)error(e.getMessage());
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class find
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  202 */       return StringLib.str_find_aux(args, true);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   final class format
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  231 */       LuaString fmt = args.checkstring(1);
/*  232 */       int n = fmt.length();
/*  233 */       Buffer result = new Buffer(n);
/*  234 */       int arg = 1;
/*      */ 
/*      */       
/*  237 */       for (int i = 0; i < n;) {
/*  238 */         switch (c = fmt.luaByte(i++)) {
/*      */           case 10:
/*  240 */             result.append("\n");
/*      */             break;
/*      */ 
/*      */ 
/*      */           
/*      */           case 37:
/*  246 */             if (i < n) {
/*  247 */               double j; LuaValue argv; LuaString s; LuaValue h, v; if ((c = fmt.luaByte(i)) == 37) {
/*  248 */                 i++;
/*  249 */                 result.append((byte)37); break;
/*      */               } 
/*  251 */               arg++;
/*  252 */               StringLib.FormatDesc fdsc = new StringLib.FormatDesc(args, fmt, i);
/*  253 */               i += fdsc.length;
/*  254 */               switch (fdsc.conversion) {
/*      */                 case 99:
/*  256 */                   fdsc.format(result, (byte)args.checkint(arg));
/*      */                   break;
/*      */                 case 100:
/*      */                 case 105:
/*  260 */                   fdsc.format(result, args.checklong(arg));
/*      */                   break;
/*      */                 case 88:
/*      */                 case 111:
/*      */                 case 117:
/*      */                 case 120:
/*  266 */                   fdsc.format(result, args.checklong(arg));
/*      */                   break;
/*      */                 case 65:
/*      */                 case 69:
/*      */                 case 71:
/*      */                 case 97:
/*      */                 case 101:
/*      */                 case 102:
/*      */                 case 103:
/*  275 */                   j = args.checkdouble(arg);
/*  276 */                   if (Double.isNaN(j) || Double.isInfinite(j)) {
/*  277 */                     String nprefix = "";
/*  278 */                     if (JavaCompat.INSTANCE.doubleToRawLongBits(j) < 0L) {
/*  279 */                       nprefix = "-";
/*  280 */                     } else if (fdsc.explicitPlus) {
/*  281 */                       nprefix = "+";
/*  282 */                     } else if (fdsc.space) {
/*  283 */                       nprefix = " ";
/*  284 */                     }  String bstr = Double.isNaN(j) ? "nan" : "inf";
/*  285 */                     if (fdsc.conversion == 69 || fdsc.conversion == 71)
/*  286 */                       bstr = bstr.toUpperCase(); 
/*  287 */                     fdsc.precision = -1;
/*  288 */                     fdsc.zeroPad = false;
/*  289 */                     fdsc.format(result, valueOf(nprefix + bstr)); break;
/*  290 */                   }  if ((fdsc.conversion == 103 || fdsc.conversion == 71) && fdsc.precision == -1) {
/*      */                     
/*  292 */                     String nprefix = "";
/*  293 */                     if (j >= 0.0D)
/*  294 */                       if (fdsc.explicitPlus) {
/*  295 */                         nprefix = "+";
/*  296 */                       } else if (fdsc.space) {
/*  297 */                         nprefix = " ";
/*      */                       }  
/*  299 */                     String bstr = Double.toString(j);
/*  300 */                     if (fdsc.conversion == 71) {
/*  301 */                       bstr = bstr.toUpperCase();
/*      */                     } else {
/*  303 */                       bstr = bstr.toLowerCase();
/*  304 */                     }  fdsc.format(result, valueOf(nprefix + bstr)); break;
/*      */                   } 
/*  306 */                   fdsc.format(result, args.checkdouble(arg));
/*      */                   break;
/*      */                 case 113:
/*  309 */                   StringLib.addquoted(result, args.checkstring(arg));
/*      */                   break;
/*      */                 case 115:
/*  312 */                   argv = args.checkvalue(arg);
/*      */                   
/*  314 */                   h = argv.metatag((LuaValue)TOSTRING);
/*  315 */                   if (!h.isnil()) {
/*  316 */                     LuaValue luaValue = h.call(argv).tostring();
/*  317 */                     return !luaValue.isnil() ? (Varargs)luaValue : (Varargs)StringLib.valueOf("(null)");
/*      */                   } 
/*  319 */                   v = argv.tostring();
/*  320 */                   if (!v.isnil()) {
/*  321 */                     s = v.checkstring();
/*      */                   } else {
/*  323 */                     s = StringLib.valueOf(argv.tojstring());
/*      */                   } 
/*      */                   
/*  326 */                   if (fdsc.precision == -1 && s.length() >= 100) {
/*  327 */                     result.append(s); break;
/*      */                   } 
/*  329 */                   fdsc.zeroPad = false;
/*  330 */                   fdsc.format(result, s);
/*      */                   break;
/*      */               } 
/*      */               
/*  334 */               error("invalid option '%" + (char)fdsc.conversion + "' to 'format'");
/*      */             } 
/*      */             break;
/*      */         } 
/*      */ 
/*      */ 
/*      */       
/*      */       } 
/*  342 */       return (Varargs)result.tostring();
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   static void addquoted(Buffer buf, LuaString s) {
/*  348 */     buf.append((byte)34);
/*  349 */     for (int i = 0, n = s.length(); i < n; i++) {
/*  350 */       int c; switch (c = s.luaByte(i)) { case 10: case 34:
/*      */         case 92:
/*  352 */           buf.append((byte)92);
/*  353 */           buf.append((byte)c);
/*      */           break;
/*      */         default:
/*  356 */           if (c <= 31 || c == 127) {
/*  357 */             buf.append((byte)92);
/*  358 */             if (i + 1 == n || s.luaByte(i + 1) < 48 || s.luaByte(i + 1) > 57) {
/*  359 */               buf.append(Integer.toString(c)); break;
/*      */             } 
/*  361 */             buf.append((byte)48);
/*  362 */             buf.append((byte)(char)(48 + c / 10));
/*  363 */             buf.append((byte)(char)(48 + c % 10));
/*      */             break;
/*      */           } 
/*  366 */           buf.append((byte)c);
/*      */           break; }
/*      */ 
/*      */     
/*      */     } 
/*  371 */     buf.append((byte)34);
/*      */   }
/*      */ 
/*      */   
/*      */   class FormatDesc
/*      */   {
/*      */     private boolean leftAdjust;
/*      */     
/*      */     private boolean zeroPad;
/*      */     
/*      */     private boolean explicitPlus;
/*      */     
/*      */     private boolean space;
/*      */     
/*      */     private boolean alternateForm;
/*      */     private static final int MAX_FLAGS = 5;
/*      */     private int width;
/*      */     int precision;
/*      */     public final int conversion;
/*      */     public final int length;
/*      */     public final String src;
/*      */     
/*      */     public FormatDesc(Varargs args, LuaString strfrmt, int start) {
/*  394 */       int p = start, n = strfrmt.length();
/*  395 */       int c = 0;
/*      */       
/*  397 */       boolean moreFlags = true;
/*  398 */       while (moreFlags) {
/*  399 */         switch (c = (p < n) ? strfrmt.luaByte(p++) : 0) { case 45:
/*  400 */             this.leftAdjust = true; continue;
/*  401 */           case 43: this.explicitPlus = true; continue;
/*  402 */           case 32: this.space = true; continue;
/*  403 */           case 35: this.alternateForm = true; continue;
/*  404 */           case 48: this.zeroPad = true; continue; }
/*  405 */          moreFlags = false;
/*      */       } 
/*      */       
/*  408 */       if (p - start > 5) {
/*  409 */         LuaValue.error("invalid format (repeated flags)");
/*      */       }
/*  411 */       this.width = -1;
/*  412 */       if (Character.isDigit((char)c)) {
/*  413 */         this.width = c - 48;
/*  414 */         c = (p < n) ? strfrmt.luaByte(p++) : 0;
/*  415 */         if (Character.isDigit((char)c)) {
/*  416 */           this.width = this.width * 10 + c - 48;
/*  417 */           c = (p < n) ? strfrmt.luaByte(p++) : 0;
/*      */         } 
/*      */       } 
/*      */       
/*  421 */       if (c == 46) {
/*  422 */         this.precision = 0;
/*  423 */         c = (p < n) ? strfrmt.luaByte(p++) : 0;
/*  424 */         if (Character.isDigit((char)c)) {
/*  425 */           this.precision = c - 48;
/*  426 */           c = (p < n) ? strfrmt.luaByte(p++) : 0;
/*  427 */           if (Character.isDigit((char)c)) {
/*  428 */             this.precision = this.precision * 10 + c - 48;
/*  429 */             c = (p < n) ? strfrmt.luaByte(p++) : 0;
/*      */           } 
/*      */         } 
/*      */       } else {
/*  433 */         this.precision = -1;
/*      */       } 
/*  435 */       if (Character.isDigit((char)c)) {
/*  436 */         LuaValue.error("invalid format (width or precision too long)");
/*      */       }
/*  438 */       if (this.width == -1) {
/*      */         
/*  440 */         this.leftAdjust = false;
/*  441 */         this.zeroPad = false;
/*      */       } else {
/*  443 */         this.zeroPad &= !this.leftAdjust ? 1 : 0;
/*  444 */       }  this.space &= !this.explicitPlus ? 1 : 0;
/*  445 */       this.conversion = c;
/*  446 */       this.length = p - start;
/*  447 */       this.src = strfrmt.substring(start - 1, p).tojstring();
/*      */     }
/*      */     
/*      */     public void format(Buffer buf, byte c) {
/*  451 */       if (!this.leftAdjust) {
/*  452 */         pad(buf, ' ', this.width - 1);
/*      */       }
/*  454 */       buf.append(c);
/*      */       
/*  456 */       if (this.leftAdjust)
/*  457 */         pad(buf, ' ', this.width - 1); 
/*      */     }
/*      */     
/*      */     public void format(Buffer buf, long number) {
/*      */       String digits;
/*      */       int nzeros;
/*  463 */       if (number == 0L && this.precision == 0) {
/*  464 */         digits = "";
/*      */       } else {
/*      */         int radix;
/*  467 */         switch (this.conversion) {
/*      */           case 88:
/*      */           case 120:
/*  470 */             radix = 16;
/*      */             break;
/*      */           case 111:
/*  473 */             radix = 8;
/*      */             break;
/*      */           default:
/*  476 */             radix = 10;
/*      */             break;
/*      */         } 
/*  479 */         digits = Long.toString(number, radix);
/*  480 */         if (this.conversion == 88) {
/*  481 */           digits = digits.toUpperCase();
/*      */         }
/*      */       } 
/*  484 */       int minwidth = digits.length();
/*  485 */       int ndigits = minwidth;
/*      */ 
/*      */       
/*  488 */       boolean allowPlusSpace = (this.conversion == 100 || this.conversion == 105);
/*      */       
/*  490 */       if (number < 0L) {
/*  491 */         ndigits--;
/*  492 */       } else if (allowPlusSpace && (this.explicitPlus || this.space)) {
/*  493 */         minwidth++;
/*      */       } 
/*      */       
/*  496 */       if (this.precision > ndigits) {
/*  497 */         nzeros = this.precision - ndigits;
/*  498 */       } else if (this.precision == -1 && this.zeroPad && this.width > minwidth) {
/*  499 */         nzeros = this.width - minwidth;
/*      */       } else {
/*  501 */         nzeros = 0;
/*      */       } 
/*  503 */       minwidth += nzeros;
/*  504 */       int nspaces = (this.width > minwidth) ? (this.width - minwidth) : 0;
/*      */       
/*  506 */       if (!this.leftAdjust) {
/*  507 */         pad(buf, ' ', nspaces);
/*      */       }
/*  509 */       if (number < 0L) {
/*  510 */         if (nzeros > 0) {
/*  511 */           buf.append((byte)45);
/*  512 */           digits = digits.substring(1);
/*      */         } 
/*  514 */       } else if (allowPlusSpace && this.explicitPlus) {
/*  515 */         buf.append((byte)43);
/*  516 */       } else if (allowPlusSpace && this.space) {
/*  517 */         buf.append((byte)32);
/*      */       } 
/*      */       
/*  520 */       if (this.alternateForm) {
/*  521 */         switch (this.conversion) {
/*      */           case 111:
/*  523 */             buf.append((byte)48);
/*      */             break;
/*      */           case 120:
/*  526 */             buf.append("0x");
/*      */             break;
/*      */           case 88:
/*  529 */             buf.append("0X");
/*      */             break;
/*      */         } 
/*      */       
/*      */       }
/*  534 */       if (nzeros > 0) {
/*  535 */         pad(buf, '0', nzeros);
/*      */       }
/*  537 */       buf.append(digits);
/*      */       
/*  539 */       if (this.leftAdjust) {
/*  540 */         pad(buf, ' ', nspaces);
/*      */       }
/*      */     }
/*      */     
/*      */     public void format(Buffer buf, double x) {
/*  545 */       String sFormat = "%";
/*  546 */       if (this.leftAdjust)
/*  547 */         sFormat = sFormat + "-"; 
/*  548 */       if (this.explicitPlus)
/*  549 */         sFormat = sFormat + "+"; 
/*  550 */       if (this.space)
/*  551 */         sFormat = sFormat + " "; 
/*  552 */       if (this.alternateForm && this.conversion != 103 && this.conversion != 71)
/*  553 */         sFormat = sFormat + "#"; 
/*  554 */       if (this.zeroPad)
/*  555 */         sFormat = sFormat + "0"; 
/*  556 */       if (this.width != -1)
/*  557 */         sFormat = sFormat + this.width; 
/*  558 */       if (this.precision != -1)
/*  559 */         sFormat = sFormat + "." + this.precision; 
/*  560 */       sFormat = sFormat + (char)this.conversion;
/*  561 */       buf.append(StringLib.this.format(sFormat, x));
/*      */     }
/*      */     
/*      */     public void format(Buffer buf, LuaString s) {
/*  565 */       int nullindex = s.indexOf((byte)0, 0);
/*  566 */       if (nullindex != -1) {
/*  567 */         s = s.substring(0, nullindex);
/*      */       }
/*  569 */       int newLength = (this.precision == -1) ? s.length() : Math.min(this.precision, s.length());
/*      */       
/*  571 */       if (!this.leftAdjust) {
/*  572 */         pad(buf, this.zeroPad ? 48 : 32, this.width - newLength);
/*      */       }
/*  574 */       buf.append(s);
/*      */       
/*  576 */       if (this.leftAdjust)
/*  577 */         pad(buf, ' ', this.width - newLength); 
/*      */     }
/*      */     
/*      */     public final void pad(Buffer buf, char c, int n) {
/*  581 */       byte b = (byte)c;
/*  582 */       while (n-- > 0)
/*  583 */         buf.append(b); 
/*      */     }
/*      */   }
/*      */   
/*      */   protected String format(String src, double x) {
/*  588 */     return String.valueOf(x);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class gmatch
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  617 */       LuaString src = args.checkstring(1);
/*  618 */       LuaString pat = args.checkstring(2);
/*  619 */       return (Varargs)new StringLib.GMatchAux(args, src, pat);
/*      */     } }
/*      */   
/*      */   static class GMatchAux extends VarArgFunction {
/*      */     private final int srclen;
/*      */     private final StringLib.MatchState ms;
/*      */     private int soffset;
/*      */     private int lastmatch;
/*      */     
/*      */     public GMatchAux(Varargs args, LuaString src, LuaString pat) {
/*  629 */       this.srclen = src.length();
/*  630 */       this.ms = new StringLib.MatchState(args, src, pat);
/*  631 */       this.soffset = 0;
/*  632 */       this.lastmatch = -1;
/*      */     }
/*      */     public Varargs invoke(Varargs args) {
/*  635 */       for (; this.soffset <= this.srclen; this.soffset++) {
/*  636 */         this.ms.reset();
/*  637 */         int res = this.ms.match(this.soffset, 0);
/*  638 */         if (res >= 0 && res != this.lastmatch) {
/*  639 */           int soff = this.soffset;
/*  640 */           this.lastmatch = this.soffset = res;
/*  641 */           return this.ms.push_captures(true, soff, res);
/*      */         } 
/*      */       } 
/*  644 */       return (Varargs)NIL;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class gsub
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  696 */       LuaString src = args.checkstring(1);
/*  697 */       int srclen = src.length();
/*  698 */       LuaString p = args.checkstring(2);
/*  699 */       int lastmatch = -1;
/*  700 */       LuaValue repl = args.arg(3);
/*  701 */       int max_s = args.optint(4, srclen + 1);
/*  702 */       if (max_s < 0)
/*  703 */         max_s = srclen + 1; 
/*  704 */       boolean anchor = (p.length() > 0 && p.charAt(0) == 94);
/*      */       
/*  706 */       Buffer lbuf = new Buffer(srclen);
/*  707 */       StringLib.MatchState ms = new StringLib.MatchState(args, src, p);
/*      */       
/*  709 */       int soffset = 0;
/*  710 */       int n = 0;
/*  711 */       while (n < max_s) {
/*  712 */         ms.reset();
/*  713 */         int res = ms.match(soffset, anchor ? 1 : 0);
/*  714 */         if (res != -1 && res != lastmatch)
/*  715 */         { n++;
/*  716 */           ms.add_value(lbuf, soffset, res, repl);
/*  717 */           soffset = lastmatch = res; }
/*      */         
/*  719 */         else if (soffset < srclen)
/*  720 */         { lbuf.append((byte)src.luaByte(soffset++)); }
/*      */         else { break; }
/*  722 */          if (anchor)
/*      */           break; 
/*  724 */       }  lbuf.append(src.substring(soffset, srclen));
/*  725 */       return varargsOf((LuaValue)lbuf.tostring(), (Varargs)valueOf(n));
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class len
/*      */     extends OneArgFunction
/*      */   {
/*      */     public LuaValue call(LuaValue arg) {
/*  737 */       return arg.checkstring().len();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class lower
/*      */     extends OneArgFunction
/*      */   {
/*      */     public LuaValue call(LuaValue arg) {
/*  750 */       return (LuaValue)valueOf(arg.checkjstring().toLowerCase());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class match
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  765 */       return StringLib.str_find_aux(args, false);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class rep
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  778 */       LuaString s = args.checkstring(1);
/*  779 */       int n = args.checkint(2);
/*  780 */       LuaString sep = args.optstring(3, EMPTYSTRING);
/*  781 */       if (n <= 0)
/*  782 */         return (Varargs)EMPTYSTRING; 
/*  783 */       int len = s.length();
/*  784 */       int lsep = sep.length();
/*  785 */       byte[] bytes = new byte[len * n + lsep * (n - 1)];
/*  786 */       int offset = 0;
/*  787 */       while (n-- > 1) {
/*  788 */         s.copyInto(0, bytes, offset, len);
/*  789 */         offset += len;
/*  790 */         if (lsep > 0) {
/*  791 */           sep.copyInto(0, bytes, offset, lsep);
/*  792 */           offset += lsep;
/*      */         } 
/*      */       } 
/*  795 */       s.copyInto(0, bytes, offset, len);
/*  796 */       return (Varargs)LuaString.valueUsing(bytes);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class reverse
/*      */     extends OneArgFunction
/*      */   {
/*      */     public LuaValue call(LuaValue arg) {
/*  807 */       LuaString s = arg.checkstring();
/*  808 */       int n = s.length();
/*  809 */       byte[] b = new byte[n];
/*  810 */       for (int i = 0, j = n - 1; i < n; i++, j--)
/*  811 */         b[j] = (byte)s.luaByte(i); 
/*  812 */       return (LuaValue)LuaString.valueUsing(b);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class sub
/*      */     extends VarArgFunction
/*      */   {
/*      */     public Varargs invoke(Varargs args) {
/*  829 */       LuaString s = args.checkstring(1);
/*  830 */       int l = s.length();
/*      */       
/*  832 */       int start = StringLib.posrelat(args.checkint(2), l);
/*  833 */       int end = StringLib.posrelat(args.optint(3, -1), l);
/*      */       
/*  835 */       if (start < 1)
/*  836 */         start = 1; 
/*  837 */       if (end > l) {
/*  838 */         end = l;
/*      */       }
/*  840 */       if (start <= end) {
/*  841 */         return (Varargs)s.substring(start - 1, end);
/*      */       }
/*  843 */       return (Varargs)EMPTYSTRING;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static final class upper
/*      */     extends OneArgFunction
/*      */   {
/*      */     public LuaValue call(LuaValue arg) {
/*  857 */       return (LuaValue)valueOf(arg.checkjstring().toUpperCase());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static Varargs str_find_aux(Varargs args, boolean find) {
/*  865 */     LuaString s = args.checkstring(1);
/*  866 */     LuaString pat = args.checkstring(2);
/*  867 */     int init = args.optint(3, 1);
/*      */     
/*  869 */     if (init > 0) {
/*  870 */       init = Math.min(init - 1, s.length());
/*  871 */     } else if (init < 0) {
/*  872 */       init = Math.max(0, s.length() + init);
/*      */     } 
/*      */     
/*  875 */     boolean fastMatch = (find && (args.arg(4).toboolean() || pat.indexOfAny(SPECIALS) == -1));
/*      */     
/*  877 */     if (fastMatch) {
/*  878 */       int result = s.indexOf(pat, init);
/*  879 */       if (result != -1) {
/*  880 */         return varargsOf((LuaValue)valueOf(result + 1), (Varargs)valueOf(result + pat.length()));
/*      */       }
/*      */     } else {
/*  883 */       MatchState ms = new MatchState(args, s, pat);
/*      */       
/*  885 */       boolean anchor = false;
/*  886 */       int poff = 0;
/*  887 */       if (pat.length() > 0 && pat.luaByte(0) == 94) {
/*  888 */         anchor = true;
/*  889 */         poff = 1;
/*      */       } 
/*      */       
/*  892 */       int soff = init;
/*      */       
/*      */       do {
/*  895 */         ms.reset(); int res;
/*  896 */         if ((res = ms.match(soff, poff)) != -1) {
/*  897 */           if (find) {
/*  898 */             return varargsOf((LuaValue)valueOf(soff + 1), (LuaValue)valueOf(res), ms.push_captures(false, soff, res));
/*      */           }
/*  900 */           return ms.push_captures(true, soff, res);
/*      */         }
/*      */       
/*  903 */       } while (soff++ < s.length() && !anchor);
/*      */     } 
/*  905 */     return (Varargs)NIL;
/*      */   }
/*      */   
/*      */   static int posrelat(int pos, int len) {
/*  909 */     return (pos >= 0) ? pos : (len + pos + 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  915 */   private static final LuaString SPECIALS = valueOf("^$*+?.([%-");
/*      */   
/*      */   private static final int MAX_CAPTURES = 32;
/*      */   
/*      */   private static final int MAXCCALLS = 200;
/*      */   
/*      */   private static final int CAP_UNFINISHED = -1;
/*      */   
/*      */   private static final int CAP_POSITION = -2;
/*      */   
/*      */   private static final byte MASK_ALPHA = 1;
/*      */   
/*      */   private static final byte MASK_LOWERCASE = 2;
/*      */   
/*      */   private static final byte MASK_UPPERCASE = 4;
/*      */   private static final byte MASK_DIGIT = 8;
/*      */   private static final byte MASK_PUNCT = 16;
/*      */   private static final byte MASK_SPACE = 32;
/*      */   private static final byte MASK_CONTROL = 64;
/*      */   private static final byte MASK_HEXDIGIT = -128;
/*  935 */   static final byte[] CHAR_TABLE = new byte[256];
/*      */   static {
/*  937 */     for (int i = 0; i < 128; i++) {
/*  938 */       char c = (char)i;
/*  939 */       CHAR_TABLE[i] = 
/*      */ 
/*      */         
/*  942 */         (byte)((Character.isDigit(c) ? true : false) | (Character.isLowerCase(c) ? true : false) | (Character.isUpperCase(c) ? 4 : 0) | ((c < ' ' || c == '') ? 64 : 0));
/*  943 */       if ((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') || (c >= '0' && c <= '9')) {
/*  944 */         CHAR_TABLE[i] = (byte)(CHAR_TABLE[i] | Byte.MIN_VALUE);
/*      */       }
/*  946 */       if ((c >= '!' && c <= '/') || (c >= ':' && c <= '@') || (c >= '[' && c <= '`') || (c >= '{' && c <= '~')) {
/*  947 */         CHAR_TABLE[i] = (byte)(CHAR_TABLE[i] | 0x10);
/*      */       }
/*  949 */       if ((CHAR_TABLE[i] & 0x6) != 0) {
/*  950 */         CHAR_TABLE[i] = (byte)(CHAR_TABLE[i] | 0x1);
/*      */       }
/*      */     } 
/*      */     
/*  954 */     CHAR_TABLE[32] = 32;
/*  955 */     CHAR_TABLE[13] = (byte)(CHAR_TABLE[13] | 0x20);
/*  956 */     CHAR_TABLE[10] = (byte)(CHAR_TABLE[10] | 0x20);
/*  957 */     CHAR_TABLE[9] = (byte)(CHAR_TABLE[9] | 0x20);
/*  958 */     CHAR_TABLE[11] = (byte)(CHAR_TABLE[11] | 0x20);
/*  959 */     CHAR_TABLE[12] = (byte)(CHAR_TABLE[12] | 0x20);
/*      */   }
/*      */   
/*      */   static class MatchState {
/*      */     int matchdepth;
/*      */     final LuaString s;
/*      */     final LuaString p;
/*      */     final Varargs args;
/*      */     int level;
/*      */     int[] cinit;
/*      */     int[] clen;
/*      */     
/*      */     MatchState(Varargs args, LuaString s, LuaString pattern) {
/*  972 */       this.s = s;
/*  973 */       this.p = pattern;
/*  974 */       this.args = args;
/*  975 */       this.level = 0;
/*  976 */       this.cinit = new int[32];
/*  977 */       this.clen = new int[32];
/*  978 */       this.matchdepth = 200;
/*      */     }
/*      */     
/*      */     void reset() {
/*  982 */       this.level = 0;
/*  983 */       this.matchdepth = 200;
/*      */     }
/*      */     
/*      */     private void add_s(Buffer lbuf, LuaString news, int soff, int e) {
/*  987 */       int l = news.length();
/*  988 */       for (int i = 0; i < l; i++) {
/*  989 */         byte b = (byte)news.luaByte(i);
/*  990 */         if (b != 37) {
/*  991 */           lbuf.append(b);
/*      */         } else {
/*  993 */           i++;
/*  994 */           b = (byte)((i < l) ? news.luaByte(i) : 0);
/*  995 */           if (!Character.isDigit((char)b)) {
/*  996 */             if (b != 37) LuaValue.error("invalid use of '%' in replacement string: after '%' must be '0'-'9' or '%', but found " + (
/*      */ 
/*      */                   
/*  999 */                   (i < l) ? (
/* 1000 */                   "symbol '" + (char)b + "' with code " + b + " at pos " + (i + 1)) : 
/* 1001 */                   "end of string")); 
/* 1002 */             lbuf.append(b);
/* 1003 */           } else if (b == 48) {
/* 1004 */             lbuf.append(this.s.substring(soff, e));
/*      */           } else {
/* 1006 */             lbuf.append(push_onecapture(b - 49, soff, e).strvalue());
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */     public void add_value(Buffer lbuf, int soffset, int end, LuaValue repl) {
/*      */       LuaString luaString;
/* 1013 */       switch (repl.type()) {
/*      */         case 3:
/*      */         case 4:
/* 1016 */           add_s(lbuf, repl.strvalue(), soffset, end);
/*      */           return;
/*      */         
/*      */         case 6:
/* 1020 */           repl = repl.invoke(push_captures(true, soffset, end)).arg1();
/*      */           break;
/*      */ 
/*      */         
/*      */         case 5:
/* 1025 */           repl = repl.get(push_onecapture(0, soffset, end));
/*      */           break;
/*      */         
/*      */         default:
/* 1029 */           LuaValue.error("bad argument: string/function/table expected");
/*      */           return;
/*      */       } 
/*      */       
/* 1033 */       if (!repl.toboolean()) {
/* 1034 */         luaString = this.s.substring(soffset, end);
/* 1035 */       } else if (!luaString.isstring()) {
/* 1036 */         LuaValue.error("invalid replacement value (a " + luaString.typename() + ")");
/*      */       } 
/* 1038 */       lbuf.append(luaString.strvalue());
/*      */     }
/*      */     
/*      */     Varargs push_captures(boolean wholeMatch, int soff, int end) {
/* 1042 */       int nlevels = (this.level == 0 && wholeMatch) ? 1 : this.level;
/* 1043 */       switch (nlevels) { case 0:
/* 1044 */           return (Varargs)LuaValue.NONE;
/* 1045 */         case 1: return (Varargs)push_onecapture(0, soff, end); }
/*      */       
/* 1047 */       LuaValue[] v = new LuaValue[nlevels];
/* 1048 */       for (int i = 0; i < nlevels; i++)
/* 1049 */         v[i] = push_onecapture(i, soff, end); 
/* 1050 */       return LuaValue.varargsOf(v);
/*      */     }
/*      */     
/*      */     private LuaValue push_onecapture(int i, int soff, int end) {
/* 1054 */       if (i >= this.level) {
/* 1055 */         if (i == 0) {
/* 1056 */           return (LuaValue)this.s.substring(soff, end);
/*      */         }
/* 1058 */         return LuaValue.error("invalid capture index %" + (i + 1));
/*      */       } 
/*      */       
/* 1061 */       int l = this.clen[i];
/* 1062 */       if (l == -1) {
/* 1063 */         return LuaValue.error("unfinished capture");
/*      */       }
/* 1065 */       if (l == -2) {
/* 1066 */         return (LuaValue)LuaValue.valueOf(this.cinit[i] + 1);
/*      */       }
/* 1068 */       int begin = this.cinit[i];
/* 1069 */       return (LuaValue)this.s.substring(begin, begin + l);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private int check_capture(int l) {
/* 1075 */       l -= 49;
/* 1076 */       if (l < 0 || l >= this.level || this.clen[l] == -1) {
/* 1077 */         LuaValue.error("invalid capture index %" + (l + 1));
/*      */       }
/* 1079 */       return l;
/*      */     }
/*      */     
/*      */     private int capture_to_close() {
/* 1083 */       int level = this.level;
/* 1084 */       for (; --level >= 0; level--) {
/* 1085 */         if (this.clen[level] == -1)
/* 1086 */           return level; 
/* 1087 */       }  LuaValue.error("invalid pattern capture");
/* 1088 */       return 0;
/*      */     }
/*      */     
/*      */     int classend(int poffset) {
/* 1092 */       switch (this.p.luaByte(poffset++)) {
/*      */         case 37:
/* 1094 */           if (poffset == this.p.length()) {
/* 1095 */             LuaValue.error("malformed pattern (ends with '%')");
/*      */           }
/* 1097 */           return poffset + 1;
/*      */         
/*      */         case 91:
/* 1100 */           if (poffset != this.p.length() && this.p.luaByte(poffset) == 94) poffset++; 
/*      */           while (true) {
/* 1102 */             if (poffset == this.p.length()) {
/* 1103 */               LuaValue.error("malformed pattern (missing ']')");
/*      */             }
/* 1105 */             if (this.p.luaByte(poffset++) == 37 && poffset < this.p.length())
/* 1106 */               poffset++; 
/* 1107 */             if (poffset != this.p.length() && this.p.luaByte(poffset) == 93)
/* 1108 */               return poffset + 1; 
/*      */           } 
/* 1110 */       }  return poffset;
/*      */     }
/*      */     
/*      */     static boolean match_class(int c, int cl) {
/*      */       boolean res;
/* 1115 */       char lcl = Character.toLowerCase((char)cl);
/* 1116 */       int cdata = StringLib.CHAR_TABLE[c];
/*      */ 
/*      */       
/* 1119 */       switch (lcl) { case 'a':
/* 1120 */           res = ((cdata & 0x1) != 0); break;
/* 1121 */         case 'd': res = ((cdata & 0x8) != 0); break;
/* 1122 */         case 'l': res = ((cdata & 0x2) != 0); break;
/* 1123 */         case 'u': res = ((cdata & 0x4) != 0); break;
/* 1124 */         case 'c': res = ((cdata & 0x40) != 0); break;
/* 1125 */         case 'p': res = ((cdata & 0x10) != 0); break;
/* 1126 */         case 's': res = ((cdata & 0x20) != 0); break;
/* 1127 */         case 'g': res = ((cdata & 0x19) != 0); break;
/* 1128 */         case 'w': res = ((cdata & 0x9) != 0); break;
/* 1129 */         case 'x': res = ((cdata & 0xFFFFFF80) != 0); break;
/* 1130 */         case 'z': res = (c == 0); break;
/* 1131 */         default: return (cl == c); }
/*      */       
/* 1133 */       return (lcl == cl) ? res : (!res);
/*      */     }
/*      */     
/*      */     boolean matchbracketclass(int c, int poff, int ec) {
/* 1137 */       boolean sig = true;
/* 1138 */       if (this.p.luaByte(poff + 1) == 94) {
/* 1139 */         sig = false;
/* 1140 */         poff++;
/*      */       } 
/* 1142 */       while (++poff < ec) {
/* 1143 */         if (this.p.luaByte(poff) == 37) {
/* 1144 */           poff++;
/* 1145 */           if (match_class(c, this.p.luaByte(poff)))
/* 1146 */             return sig;  continue;
/*      */         } 
/* 1148 */         if (this.p.luaByte(poff + 1) == 45 && poff + 2 < ec) {
/* 1149 */           poff += 2;
/* 1150 */           if (this.p.luaByte(poff - 2) <= c && c <= this.p.luaByte(poff))
/* 1151 */             return sig;  continue;
/*      */         } 
/* 1153 */         if (this.p.luaByte(poff) == c) return sig; 
/*      */       } 
/* 1155 */       return !sig;
/*      */     }
/*      */     
/*      */     boolean singlematch(int c, int poff, int ep) {
/* 1159 */       switch (this.p.luaByte(poff)) { case 46:
/* 1160 */           return true;
/* 1161 */         case 37: return match_class(c, this.p.luaByte(poff + 1));
/* 1162 */         case 91: return matchbracketclass(c, poff, ep - 1); }
/* 1163 */        return (this.p.luaByte(poff) == c);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int match(int soffset, int poffset) {
/*      */       // Byte code:
/*      */       //   0: aload_0
/*      */       //   1: dup
/*      */       //   2: getfield matchdepth : I
/*      */       //   5: dup_x1
/*      */       //   6: iconst_1
/*      */       //   7: isub
/*      */       //   8: putfield matchdepth : I
/*      */       //   11: ifne -> 20
/*      */       //   14: ldc 'pattern too complex'
/*      */       //   16: invokestatic error : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */       //   19: pop
/*      */       //   20: iload_2
/*      */       //   21: aload_0
/*      */       //   22: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   25: invokevirtual length : ()I
/*      */       //   28: if_icmpne -> 45
/*      */       //   31: iload_1
/*      */       //   32: istore_3
/*      */       //   33: aload_0
/*      */       //   34: dup
/*      */       //   35: getfield matchdepth : I
/*      */       //   38: iconst_1
/*      */       //   39: iadd
/*      */       //   40: putfield matchdepth : I
/*      */       //   43: iload_3
/*      */       //   44: ireturn
/*      */       //   45: aload_0
/*      */       //   46: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   49: iload_2
/*      */       //   50: invokevirtual luaByte : (I)I
/*      */       //   53: tableswitch default -> 517, 36 -> 475, 37 -> 183, 38 -> 517, 39 -> 517, 40 -> 92, 41 -> 162
/*      */       //   92: iinc #2, 1
/*      */       //   95: iload_2
/*      */       //   96: aload_0
/*      */       //   97: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   100: invokevirtual length : ()I
/*      */       //   103: if_icmpge -> 142
/*      */       //   106: aload_0
/*      */       //   107: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   110: iload_2
/*      */       //   111: invokevirtual luaByte : (I)I
/*      */       //   114: bipush #41
/*      */       //   116: if_icmpne -> 142
/*      */       //   119: aload_0
/*      */       //   120: iload_1
/*      */       //   121: iload_2
/*      */       //   122: iconst_1
/*      */       //   123: iadd
/*      */       //   124: bipush #-2
/*      */       //   126: invokevirtual start_capture : (III)I
/*      */       //   129: istore_3
/*      */       //   130: aload_0
/*      */       //   131: dup
/*      */       //   132: getfield matchdepth : I
/*      */       //   135: iconst_1
/*      */       //   136: iadd
/*      */       //   137: putfield matchdepth : I
/*      */       //   140: iload_3
/*      */       //   141: ireturn
/*      */       //   142: aload_0
/*      */       //   143: iload_1
/*      */       //   144: iload_2
/*      */       //   145: iconst_m1
/*      */       //   146: invokevirtual start_capture : (III)I
/*      */       //   149: istore_3
/*      */       //   150: aload_0
/*      */       //   151: dup
/*      */       //   152: getfield matchdepth : I
/*      */       //   155: iconst_1
/*      */       //   156: iadd
/*      */       //   157: putfield matchdepth : I
/*      */       //   160: iload_3
/*      */       //   161: ireturn
/*      */       //   162: aload_0
/*      */       //   163: iload_1
/*      */       //   164: iload_2
/*      */       //   165: iconst_1
/*      */       //   166: iadd
/*      */       //   167: invokevirtual end_capture : (II)I
/*      */       //   170: istore_3
/*      */       //   171: aload_0
/*      */       //   172: dup
/*      */       //   173: getfield matchdepth : I
/*      */       //   176: iconst_1
/*      */       //   177: iadd
/*      */       //   178: putfield matchdepth : I
/*      */       //   181: iload_3
/*      */       //   182: ireturn
/*      */       //   183: iload_2
/*      */       //   184: iconst_1
/*      */       //   185: iadd
/*      */       //   186: aload_0
/*      */       //   187: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   190: invokevirtual length : ()I
/*      */       //   193: if_icmpne -> 202
/*      */       //   196: ldc 'malformed pattern (ends with '%')'
/*      */       //   198: invokestatic error : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */       //   201: pop
/*      */       //   202: aload_0
/*      */       //   203: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   206: iload_2
/*      */       //   207: iconst_1
/*      */       //   208: iadd
/*      */       //   209: invokevirtual luaByte : (I)I
/*      */       //   212: lookupswitch default -> 405, 98 -> 240, 102 -> 274
/*      */       //   240: aload_0
/*      */       //   241: iload_1
/*      */       //   242: iload_2
/*      */       //   243: iconst_2
/*      */       //   244: iadd
/*      */       //   245: invokevirtual matchbalance : (II)I
/*      */       //   248: istore_1
/*      */       //   249: iload_1
/*      */       //   250: iconst_m1
/*      */       //   251: if_icmpne -> 268
/*      */       //   254: iconst_m1
/*      */       //   255: istore_3
/*      */       //   256: aload_0
/*      */       //   257: dup
/*      */       //   258: getfield matchdepth : I
/*      */       //   261: iconst_1
/*      */       //   262: iadd
/*      */       //   263: putfield matchdepth : I
/*      */       //   266: iload_3
/*      */       //   267: ireturn
/*      */       //   268: iinc #2, 4
/*      */       //   271: goto -> 20
/*      */       //   274: iinc #2, 2
/*      */       //   277: iload_2
/*      */       //   278: aload_0
/*      */       //   279: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   282: invokevirtual length : ()I
/*      */       //   285: if_icmpeq -> 301
/*      */       //   288: aload_0
/*      */       //   289: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   292: iload_2
/*      */       //   293: invokevirtual luaByte : (I)I
/*      */       //   296: bipush #91
/*      */       //   298: if_icmpeq -> 307
/*      */       //   301: ldc 'missing '[' after '%f' in pattern'
/*      */       //   303: invokestatic error : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */       //   306: pop
/*      */       //   307: aload_0
/*      */       //   308: iload_2
/*      */       //   309: invokevirtual classend : (I)I
/*      */       //   312: istore_3
/*      */       //   313: iload_1
/*      */       //   314: ifne -> 321
/*      */       //   317: iconst_0
/*      */       //   318: goto -> 331
/*      */       //   321: aload_0
/*      */       //   322: getfield s : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   325: iload_1
/*      */       //   326: iconst_1
/*      */       //   327: isub
/*      */       //   328: invokevirtual luaByte : (I)I
/*      */       //   331: istore #4
/*      */       //   333: iload_1
/*      */       //   334: aload_0
/*      */       //   335: getfield s : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   338: invokevirtual length : ()I
/*      */       //   341: if_icmpne -> 348
/*      */       //   344: iconst_0
/*      */       //   345: goto -> 356
/*      */       //   348: aload_0
/*      */       //   349: getfield s : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   352: iload_1
/*      */       //   353: invokevirtual luaByte : (I)I
/*      */       //   356: istore #5
/*      */       //   358: aload_0
/*      */       //   359: iload #4
/*      */       //   361: iload_2
/*      */       //   362: iload_3
/*      */       //   363: iconst_1
/*      */       //   364: isub
/*      */       //   365: invokevirtual matchbracketclass : (III)Z
/*      */       //   368: ifne -> 384
/*      */       //   371: aload_0
/*      */       //   372: iload #5
/*      */       //   374: iload_2
/*      */       //   375: iload_3
/*      */       //   376: iconst_1
/*      */       //   377: isub
/*      */       //   378: invokevirtual matchbracketclass : (III)Z
/*      */       //   381: ifne -> 400
/*      */       //   384: iconst_m1
/*      */       //   385: istore #6
/*      */       //   387: aload_0
/*      */       //   388: dup
/*      */       //   389: getfield matchdepth : I
/*      */       //   392: iconst_1
/*      */       //   393: iadd
/*      */       //   394: putfield matchdepth : I
/*      */       //   397: iload #6
/*      */       //   399: ireturn
/*      */       //   400: iload_3
/*      */       //   401: istore_2
/*      */       //   402: goto -> 20
/*      */       //   405: aload_0
/*      */       //   406: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   409: iload_2
/*      */       //   410: iconst_1
/*      */       //   411: iadd
/*      */       //   412: invokevirtual luaByte : (I)I
/*      */       //   415: istore_3
/*      */       //   416: iload_3
/*      */       //   417: i2c
/*      */       //   418: invokestatic isDigit : (C)Z
/*      */       //   421: ifeq -> 475
/*      */       //   424: aload_0
/*      */       //   425: iload_1
/*      */       //   426: iload_3
/*      */       //   427: invokevirtual match_capture : (II)I
/*      */       //   430: istore_1
/*      */       //   431: iload_1
/*      */       //   432: iconst_m1
/*      */       //   433: if_icmpne -> 452
/*      */       //   436: iconst_m1
/*      */       //   437: istore #4
/*      */       //   439: aload_0
/*      */       //   440: dup
/*      */       //   441: getfield matchdepth : I
/*      */       //   444: iconst_1
/*      */       //   445: iadd
/*      */       //   446: putfield matchdepth : I
/*      */       //   449: iload #4
/*      */       //   451: ireturn
/*      */       //   452: aload_0
/*      */       //   453: iload_1
/*      */       //   454: iload_2
/*      */       //   455: iconst_2
/*      */       //   456: iadd
/*      */       //   457: invokevirtual match : (II)I
/*      */       //   460: istore #4
/*      */       //   462: aload_0
/*      */       //   463: dup
/*      */       //   464: getfield matchdepth : I
/*      */       //   467: iconst_1
/*      */       //   468: iadd
/*      */       //   469: putfield matchdepth : I
/*      */       //   472: iload #4
/*      */       //   474: ireturn
/*      */       //   475: iload_2
/*      */       //   476: iconst_1
/*      */       //   477: iadd
/*      */       //   478: aload_0
/*      */       //   479: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   482: invokevirtual length : ()I
/*      */       //   485: if_icmpne -> 517
/*      */       //   488: iload_1
/*      */       //   489: aload_0
/*      */       //   490: getfield s : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   493: invokevirtual length : ()I
/*      */       //   496: if_icmpne -> 503
/*      */       //   499: iload_1
/*      */       //   500: goto -> 504
/*      */       //   503: iconst_m1
/*      */       //   504: istore_3
/*      */       //   505: aload_0
/*      */       //   506: dup
/*      */       //   507: getfield matchdepth : I
/*      */       //   510: iconst_1
/*      */       //   511: iadd
/*      */       //   512: putfield matchdepth : I
/*      */       //   515: iload_3
/*      */       //   516: ireturn
/*      */       //   517: aload_0
/*      */       //   518: iload_2
/*      */       //   519: invokevirtual classend : (I)I
/*      */       //   522: istore_3
/*      */       //   523: iload_1
/*      */       //   524: aload_0
/*      */       //   525: getfield s : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   528: invokevirtual length : ()I
/*      */       //   531: if_icmpge -> 555
/*      */       //   534: aload_0
/*      */       //   535: aload_0
/*      */       //   536: getfield s : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   539: iload_1
/*      */       //   540: invokevirtual luaByte : (I)I
/*      */       //   543: iload_2
/*      */       //   544: iload_3
/*      */       //   545: invokevirtual singlematch : (III)Z
/*      */       //   548: ifeq -> 555
/*      */       //   551: iconst_1
/*      */       //   552: goto -> 556
/*      */       //   555: iconst_0
/*      */       //   556: istore #4
/*      */       //   558: iload_3
/*      */       //   559: aload_0
/*      */       //   560: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   563: invokevirtual length : ()I
/*      */       //   566: if_icmpge -> 580
/*      */       //   569: aload_0
/*      */       //   570: getfield p : Lli/cil/repack/org/luaj/vm2/LuaString;
/*      */       //   573: iload_3
/*      */       //   574: invokevirtual luaByte : (I)I
/*      */       //   577: goto -> 581
/*      */       //   580: iconst_0
/*      */       //   581: istore #5
/*      */       //   583: iload #5
/*      */       //   585: lookupswitch default -> 751, 42 -> 674, 43 -> 696, 45 -> 729, 63 -> 628
/*      */       //   628: iload #4
/*      */       //   630: ifeq -> 667
/*      */       //   633: aload_0
/*      */       //   634: iload_1
/*      */       //   635: iconst_1
/*      */       //   636: iadd
/*      */       //   637: iload_3
/*      */       //   638: iconst_1
/*      */       //   639: iadd
/*      */       //   640: invokevirtual match : (II)I
/*      */       //   643: dup
/*      */       //   644: istore #6
/*      */       //   646: iconst_m1
/*      */       //   647: if_icmpeq -> 667
/*      */       //   650: iload #6
/*      */       //   652: istore #7
/*      */       //   654: aload_0
/*      */       //   655: dup
/*      */       //   656: getfield matchdepth : I
/*      */       //   659: iconst_1
/*      */       //   660: iadd
/*      */       //   661: putfield matchdepth : I
/*      */       //   664: iload #7
/*      */       //   666: ireturn
/*      */       //   667: iload_3
/*      */       //   668: iconst_1
/*      */       //   669: iadd
/*      */       //   670: istore_2
/*      */       //   671: goto -> 20
/*      */       //   674: aload_0
/*      */       //   675: iload_1
/*      */       //   676: iload_2
/*      */       //   677: iload_3
/*      */       //   678: invokevirtual max_expand : (III)I
/*      */       //   681: istore #7
/*      */       //   683: aload_0
/*      */       //   684: dup
/*      */       //   685: getfield matchdepth : I
/*      */       //   688: iconst_1
/*      */       //   689: iadd
/*      */       //   690: putfield matchdepth : I
/*      */       //   693: iload #7
/*      */       //   695: ireturn
/*      */       //   696: iload #4
/*      */       //   698: ifeq -> 713
/*      */       //   701: aload_0
/*      */       //   702: iload_1
/*      */       //   703: iconst_1
/*      */       //   704: iadd
/*      */       //   705: iload_2
/*      */       //   706: iload_3
/*      */       //   707: invokevirtual max_expand : (III)I
/*      */       //   710: goto -> 714
/*      */       //   713: iconst_m1
/*      */       //   714: istore #7
/*      */       //   716: aload_0
/*      */       //   717: dup
/*      */       //   718: getfield matchdepth : I
/*      */       //   721: iconst_1
/*      */       //   722: iadd
/*      */       //   723: putfield matchdepth : I
/*      */       //   726: iload #7
/*      */       //   728: ireturn
/*      */       //   729: aload_0
/*      */       //   730: iload_1
/*      */       //   731: iload_2
/*      */       //   732: iload_3
/*      */       //   733: invokevirtual min_expand : (III)I
/*      */       //   736: istore #7
/*      */       //   738: aload_0
/*      */       //   739: dup
/*      */       //   740: getfield matchdepth : I
/*      */       //   743: iconst_1
/*      */       //   744: iadd
/*      */       //   745: putfield matchdepth : I
/*      */       //   748: iload #7
/*      */       //   750: ireturn
/*      */       //   751: iload #4
/*      */       //   753: ifne -> 772
/*      */       //   756: iconst_m1
/*      */       //   757: istore #7
/*      */       //   759: aload_0
/*      */       //   760: dup
/*      */       //   761: getfield matchdepth : I
/*      */       //   764: iconst_1
/*      */       //   765: iadd
/*      */       //   766: putfield matchdepth : I
/*      */       //   769: iload #7
/*      */       //   771: ireturn
/*      */       //   772: iinc #1, 1
/*      */       //   775: iload_3
/*      */       //   776: istore_2
/*      */       //   777: goto -> 20
/*      */       //   780: astore #8
/*      */       //   782: aload_0
/*      */       //   783: dup
/*      */       //   784: getfield matchdepth : I
/*      */       //   787: iconst_1
/*      */       //   788: iadd
/*      */       //   789: putfield matchdepth : I
/*      */       //   792: aload #8
/*      */       //   794: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #1172	-> 0
/*      */       //   #1178	-> 20
/*      */       //   #1179	-> 31
/*      */       //   #1251	-> 33
/*      */       //   #1179	-> 43
/*      */       //   #1180	-> 45
/*      */       //   #1182	-> 92
/*      */       //   #1183	-> 119
/*      */       //   #1251	-> 130
/*      */       //   #1183	-> 140
/*      */       //   #1185	-> 142
/*      */       //   #1251	-> 150
/*      */       //   #1185	-> 160
/*      */       //   #1187	-> 162
/*      */       //   #1251	-> 171
/*      */       //   #1187	-> 181
/*      */       //   #1189	-> 183
/*      */       //   #1190	-> 196
/*      */       //   #1191	-> 202
/*      */       //   #1193	-> 240
/*      */       //   #1194	-> 249
/*      */       //   #1251	-> 256
/*      */       //   #1194	-> 266
/*      */       //   #1195	-> 268
/*      */       //   #1196	-> 271
/*      */       //   #1198	-> 274
/*      */       //   #1199	-> 277
/*      */       //   #1200	-> 301
/*      */       //   #1202	-> 307
/*      */       //   #1203	-> 313
/*      */       //   #1204	-> 333
/*      */       //   #1205	-> 358
/*      */       //   #1206	-> 378
/*      */       //   #1207	-> 384
/*      */       //   #1251	-> 387
/*      */       //   #1207	-> 397
/*      */       //   #1208	-> 400
/*      */       //   #1209	-> 402
/*      */       //   #1212	-> 405
/*      */       //   #1213	-> 416
/*      */       //   #1214	-> 424
/*      */       //   #1215	-> 431
/*      */       //   #1216	-> 436
/*      */       //   #1251	-> 439
/*      */       //   #1216	-> 449
/*      */       //   #1217	-> 452
/*      */       //   #1251	-> 462
/*      */       //   #1217	-> 472
/*      */       //   #1222	-> 475
/*      */       //   #1223	-> 488
/*      */       //   #1251	-> 505
/*      */       //   #1223	-> 515
/*      */       //   #1225	-> 517
/*      */       //   #1226	-> 523
/*      */       //   #1227	-> 558
/*      */       //   #1229	-> 583
/*      */       //   #1232	-> 628
/*      */       //   #1233	-> 650
/*      */       //   #1251	-> 654
/*      */       //   #1233	-> 664
/*      */       //   #1234	-> 667
/*      */       //   #1235	-> 671
/*      */       //   #1237	-> 674
/*      */       //   #1251	-> 683
/*      */       //   #1237	-> 693
/*      */       //   #1239	-> 696
/*      */       //   #1251	-> 716
/*      */       //   #1239	-> 726
/*      */       //   #1241	-> 729
/*      */       //   #1251	-> 738
/*      */       //   #1241	-> 748
/*      */       //   #1243	-> 751
/*      */       //   #1244	-> 756
/*      */       //   #1251	-> 759
/*      */       //   #1244	-> 769
/*      */       //   #1245	-> 772
/*      */       //   #1246	-> 775
/*      */       //   #1247	-> 777
/*      */       //   #1251	-> 780
/*      */       //   #1252	-> 792
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   313	92	3	ep	I
/*      */       //   333	72	4	previous	I
/*      */       //   358	47	5	next	I
/*      */       //   416	59	3	c	I
/*      */       //   646	21	6	res	I
/*      */       //   523	257	3	ep	I
/*      */       //   558	222	4	m	Z
/*      */       //   583	197	5	pc	I
/*      */       //   0	795	0	this	Lli/cil/repack/org/luaj/vm2/lib/StringLib$MatchState;
/*      */       //   0	795	1	soffset	I
/*      */       //   0	795	2	poffset	I
/*      */       // Exception table:
/*      */       //   from	to	target	type
/*      */       //   20	33	780	finally
/*      */       //   45	130	780	finally
/*      */       //   142	150	780	finally
/*      */       //   162	171	780	finally
/*      */       //   183	256	780	finally
/*      */       //   268	387	780	finally
/*      */       //   400	439	780	finally
/*      */       //   452	462	780	finally
/*      */       //   475	505	780	finally
/*      */       //   517	654	780	finally
/*      */       //   667	683	780	finally
/*      */       //   696	716	780	finally
/*      */       //   729	738	780	finally
/*      */       //   751	759	780	finally
/*      */       //   772	782	780	finally
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int max_expand(int soff, int poff, int ep) {
/* 1256 */       int i = 0;
/* 1257 */       while (soff + i < this.s.length() && 
/* 1258 */         singlematch(this.s.luaByte(soff + i), poff, ep))
/* 1259 */         i++; 
/* 1260 */       while (i >= 0) {
/* 1261 */         int res = match(soff + i, ep + 1);
/* 1262 */         if (res != -1)
/* 1263 */           return res; 
/* 1264 */         i--;
/*      */       } 
/* 1266 */       return -1;
/*      */     }
/*      */     
/*      */     int min_expand(int soff, int poff, int ep) {
/*      */       while (true) {
/* 1271 */         int res = match(soff, ep + 1);
/* 1272 */         if (res != -1)
/* 1273 */           return res; 
/* 1274 */         if (soff < this.s.length() && singlematch(this.s.luaByte(soff), poff, ep))
/* 1275 */         { soff++; continue; }  break;
/* 1276 */       }  return -1;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     int start_capture(int soff, int poff, int what) {
/* 1282 */       int level = this.level;
/* 1283 */       if (level >= 32) {
/* 1284 */         LuaValue.error("too many captures");
/*      */       }
/* 1286 */       this.cinit[level] = soff;
/* 1287 */       this.clen[level] = what;
/* 1288 */       this.level = level + 1; int res;
/* 1289 */       if ((res = match(soff, poff)) == -1)
/* 1290 */         this.level--; 
/* 1291 */       return res;
/*      */     }
/*      */     
/*      */     int end_capture(int soff, int poff) {
/* 1295 */       int l = capture_to_close();
/*      */       
/* 1297 */       this.clen[l] = soff - this.cinit[l]; int res;
/* 1298 */       if ((res = match(soff, poff)) == -1)
/* 1299 */         this.clen[l] = -1; 
/* 1300 */       return res;
/*      */     }
/*      */     
/*      */     int match_capture(int soff, int l) {
/* 1304 */       l = check_capture(l);
/* 1305 */       int len = this.clen[l];
/* 1306 */       if (this.s.length() - soff >= len && 
/* 1307 */         LuaString.equals(this.s, this.cinit[l], this.s, soff, len)) {
/* 1308 */         return soff + len;
/*      */       }
/* 1310 */       return -1;
/*      */     }
/*      */     
/*      */     int matchbalance(int soff, int poff) {
/* 1314 */       int plen = this.p.length();
/* 1315 */       if (poff == plen || poff + 1 == plen) {
/* 1316 */         LuaValue.error("malformed pattern (missing arguments to '%b')");
/*      */       }
/* 1318 */       int slen = this.s.length();
/* 1319 */       if (soff >= slen)
/* 1320 */         return -1; 
/* 1321 */       int b = this.p.luaByte(poff);
/* 1322 */       if (this.s.luaByte(soff) != b)
/* 1323 */         return -1; 
/* 1324 */       int e = this.p.luaByte(poff + 1);
/* 1325 */       int cont = 1;
/* 1326 */       while (++soff < slen) {
/* 1327 */         if (this.s.luaByte(soff) == e) {
/* 1328 */           if (--cont == 0) return soff + 1;  continue;
/*      */         } 
/* 1330 */         if (this.s.luaByte(soff) == b) cont++; 
/*      */       } 
/* 1332 */       return -1;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\StringLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */