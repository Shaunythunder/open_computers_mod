/*      */ package li.cil.repack.org.luaj.vm2.compiler;
/*      */ 
/*      */ import java.util.Hashtable;
/*      */ import li.cil.repack.org.luaj.vm2.LocVars;
/*      */ import li.cil.repack.org.luaj.vm2.Lua;
/*      */ import li.cil.repack.org.luaj.vm2.LuaInteger;
/*      */ import li.cil.repack.org.luaj.vm2.LuaString;
/*      */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*      */ import li.cil.repack.org.luaj.vm2.Prototype;
/*      */ import li.cil.repack.org.luaj.vm2.Upvaldesc;
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
/*      */ public class FuncState
/*      */   extends Constants
/*      */ {
/*      */   Prototype f;
/*      */   Hashtable h;
/*      */   FuncState prev;
/*      */   LexState ls;
/*      */   BlockCnt bl;
/*      */   int pc;
/*      */   int lasttarget;
/*      */   IntPtr jpc;
/*      */   int nk;
/*      */   int np;
/*      */   int firstlocal;
/*      */   short nlocvars;
/*      */   short nactvar;
/*      */   short nups;
/*      */   short freereg;
/*      */   
/*      */   static class BlockCnt
/*      */   {
/*      */     BlockCnt previous;
/*      */     short firstlabel;
/*      */     short firstgoto;
/*      */     short nactvar;
/*      */     boolean upval;
/*      */     boolean isloop;
/*      */   }
/*      */   
/*      */   InstructionPtr getcodePtr(LexState.expdesc e) {
/*   72 */     return new InstructionPtr(this.f.code, e.u.info);
/*      */   }
/*      */   
/*      */   int getcode(LexState.expdesc e) {
/*   76 */     return this.f.code[e.u.info];
/*      */   }
/*      */   
/*      */   int codeAsBx(int o, int A, int sBx) {
/*   80 */     return codeABx(o, A, sBx + 131071);
/*      */   }
/*      */   
/*      */   void setmultret(LexState.expdesc e) {
/*   84 */     setreturns(e, -1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void checkrepeated(LexState.Labeldesc[] ll, int ll_n, LuaString label) {
/*   94 */     for (int i = this.bl.firstlabel; i < ll_n; i++) {
/*   95 */       if (label.eq_b((LuaValue)(ll[i]).name)) {
/*   96 */         String msg = this.ls.L.pushfstring("label '" + label + " already defined on line " + (ll[i]).line);
/*   97 */         this.ls.semerror(msg);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   void checklimit(int v, int l, String msg) {
/*  103 */     if (v > l) {
/*  104 */       errorlimit(l, msg);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   void errorlimit(int limit, String what) {
/*  110 */     String msg = (this.f.linedefined == 0) ? this.ls.L.pushfstring("main function has more than " + limit + " " + what) : this.ls.L.pushfstring("function at line " + this.f.linedefined + " has more than " + limit + " " + what);
/*  111 */     this.ls.lexerror(msg, 0);
/*      */   }
/*      */   
/*      */   LocVars getlocvar(int i) {
/*  115 */     int idx = (this.ls.dyd.actvar[this.firstlocal + i]).idx;
/*  116 */     _assert((idx < this.nlocvars));
/*  117 */     return this.f.locvars[idx];
/*      */   }
/*      */   
/*      */   void removevars(int tolevel) {
/*  121 */     this.ls.dyd.n_actvar -= this.nactvar - tolevel;
/*  122 */     while (this.nactvar > tolevel) {
/*  123 */       (getlocvar(this.nactvar = (short)(this.nactvar - 1))).endpc = this.pc;
/*      */     }
/*      */   }
/*      */   
/*      */   int searchupvalue(LuaString name) {
/*  128 */     Upvaldesc[] up = this.f.upvalues;
/*  129 */     for (int i = 0; i < this.nups; i++) {
/*  130 */       if ((up[i]).name.eq_b((LuaValue)name))
/*  131 */         return i; 
/*  132 */     }  return -1;
/*      */   }
/*      */   
/*      */   int newupvalue(LuaString name, LexState.expdesc v) {
/*  136 */     checklimit(this.nups + 1, 255, "upvalues");
/*  137 */     if (this.f.upvalues == null || this.nups + 1 > this.f.upvalues.length)
/*  138 */       this.f.upvalues = realloc(this.f.upvalues, (this.nups > 0) ? (this.nups * 2) : 1); 
/*  139 */     this.f.upvalues[this.nups] = new Upvaldesc(name, (v.k == 7), v.u.info);
/*  140 */     this.nups = (short)(this.nups + 1); return this.nups;
/*      */   }
/*      */ 
/*      */   
/*      */   int searchvar(LuaString n) {
/*  145 */     for (int i = this.nactvar - 1; i >= 0; i--) {
/*  146 */       if (n.eq_b((LuaValue)(getlocvar(i)).varname))
/*  147 */         return i; 
/*      */     } 
/*  149 */     return -1;
/*      */   }
/*      */   
/*      */   void markupval(int level) {
/*  153 */     BlockCnt bl = this.bl;
/*  154 */     while (bl.nactvar > level)
/*  155 */       bl = bl.previous; 
/*  156 */     bl.upval = true;
/*      */   }
/*      */   
/*      */   static int singlevaraux(FuncState fs, LuaString n, LexState.expdesc var, int base) {
/*  160 */     if (fs == null)
/*  161 */       return 0; 
/*  162 */     int v = fs.searchvar(n);
/*  163 */     if (v >= 0) {
/*  164 */       var.init(7, v);
/*  165 */       if (base == 0)
/*  166 */         fs.markupval(v); 
/*  167 */       return 7;
/*      */     } 
/*  169 */     int idx = fs.searchupvalue(n);
/*  170 */     if (idx < 0) {
/*  171 */       if (singlevaraux(fs.prev, n, var, 0) == 0) {
/*  172 */         return 0;
/*      */       }
/*  174 */       idx = fs.newupvalue(n, var);
/*      */     } 
/*  176 */     var.init(8, idx);
/*  177 */     return 8;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void movegotosout(BlockCnt bl) {
/*  188 */     int i = bl.firstgoto;
/*  189 */     LexState.Labeldesc[] gl = this.ls.dyd.gt;
/*      */ 
/*      */     
/*  192 */     while (i < this.ls.dyd.n_gt) {
/*  193 */       LexState.Labeldesc gt = gl[i];
/*  194 */       if (gt.nactvar > bl.nactvar) {
/*  195 */         if (bl.upval)
/*  196 */           patchclose(gt.pc, bl.nactvar); 
/*  197 */         gt.nactvar = bl.nactvar;
/*      */       } 
/*  199 */       if (!this.ls.findlabel(i))
/*  200 */         i++; 
/*      */     } 
/*      */   }
/*      */   
/*      */   void enterblock(BlockCnt bl, boolean isloop) {
/*  205 */     bl.isloop = isloop;
/*  206 */     bl.nactvar = this.nactvar;
/*  207 */     bl.firstlabel = (short)this.ls.dyd.n_label;
/*  208 */     bl.firstgoto = (short)this.ls.dyd.n_gt;
/*  209 */     bl.upval = false;
/*  210 */     bl.previous = this.bl;
/*  211 */     this.bl = bl;
/*  212 */     _assert((this.freereg == this.nactvar));
/*      */   }
/*      */   
/*      */   void leaveblock() {
/*  216 */     BlockCnt bl = this.bl;
/*  217 */     if (bl.previous != null && bl.upval) {
/*      */       
/*  219 */       int j = jump();
/*  220 */       patchclose(j, bl.nactvar);
/*  221 */       patchtohere(j);
/*      */     } 
/*  223 */     if (bl.isloop)
/*  224 */       this.ls.breaklabel(); 
/*  225 */     this.bl = bl.previous;
/*  226 */     removevars(bl.nactvar);
/*  227 */     _assert((bl.nactvar == this.nactvar));
/*  228 */     this.freereg = this.nactvar;
/*  229 */     this.ls.dyd.n_label = bl.firstlabel;
/*  230 */     if (bl.previous != null) {
/*  231 */       movegotosout(bl);
/*  232 */     } else if (bl.firstgoto < this.ls.dyd.n_gt) {
/*  233 */       this.ls.undefgoto(this.ls.dyd.gt[bl.firstgoto]);
/*      */     } 
/*      */   }
/*      */   void closelistfield(LexState.ConsControl cc) {
/*  237 */     if (cc.v.k == 0)
/*      */       return; 
/*  239 */     exp2nextreg(cc.v);
/*  240 */     cc.v.k = 0;
/*  241 */     if (cc.tostore == 50) {
/*  242 */       setlist(cc.t.u.info, cc.na, cc.tostore);
/*  243 */       cc.tostore = 0;
/*      */     } 
/*      */   }
/*      */   
/*      */   boolean hasmultret(int k) {
/*  248 */     return (k == 12 || k == 13);
/*      */   }
/*      */   
/*      */   void lastlistfield(LexState.ConsControl cc) {
/*  252 */     if (cc.tostore == 0)
/*      */       return; 
/*  254 */     if (hasmultret(cc.v.k)) {
/*  255 */       setmultret(cc.v);
/*  256 */       setlist(cc.t.u.info, cc.na, -1);
/*  257 */       cc.na--;
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  262 */       if (cc.v.k != 0)
/*  263 */         exp2nextreg(cc.v); 
/*  264 */       setlist(cc.t.u.info, cc.na, cc.tostore);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void nil(int from, int n) {
/*  273 */     int l = from + n - 1;
/*  274 */     if (this.pc > this.lasttarget && this.pc > 0) {
/*  275 */       int previous_code = this.f.code[this.pc - 1];
/*  276 */       if (GET_OPCODE(previous_code) == 4) {
/*  277 */         int pfrom = GETARG_A(previous_code);
/*  278 */         int pl = pfrom + GETARG_B(previous_code);
/*  279 */         if ((pfrom <= from && from <= pl + 1) || (from <= pfrom && pfrom <= l + 1)) {
/*  280 */           if (pfrom < from)
/*  281 */             from = pfrom; 
/*  282 */           if (pl > l)
/*  283 */             l = pl; 
/*  284 */           InstructionPtr previous = new InstructionPtr(this.f.code, this.pc - 1);
/*  285 */           SETARG_A(previous, from);
/*  286 */           SETARG_B(previous, l - from);
/*      */           return;
/*      */         } 
/*      */       } 
/*      */     } 
/*  291 */     codeABC(4, from, n - 1, 0);
/*      */   }
/*      */   
/*      */   int jump() {
/*  295 */     int jpc = this.jpc.i;
/*  296 */     this.jpc.i = -1;
/*  297 */     IntPtr j = new IntPtr(codeAsBx(23, 0, -1));
/*  298 */     concat(j, jpc);
/*  299 */     return j.i;
/*      */   }
/*      */   
/*      */   void ret(int first, int nret) {
/*  303 */     codeABC(31, first, nret + 1, 0);
/*      */   }
/*      */   
/*      */   int condjump(int op, int A, int B, int C) {
/*  307 */     codeABC(op, A, B, C);
/*  308 */     return jump();
/*      */   }
/*      */   
/*      */   void fixjump(int pc, int dest) {
/*  312 */     InstructionPtr jmp = new InstructionPtr(this.f.code, pc);
/*  313 */     int offset = dest - pc + 1;
/*  314 */     _assert((dest != -1));
/*  315 */     if (Math.abs(offset) > 131071)
/*  316 */       this.ls.syntaxerror("control structure too long"); 
/*  317 */     SETARG_sBx(jmp, offset);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   int getlabel() {
/*  325 */     this.lasttarget = this.pc;
/*  326 */     return this.pc;
/*      */   }
/*      */   
/*      */   int getjump(int pc) {
/*  330 */     int offset = GETARG_sBx(this.f.code[pc]);
/*      */     
/*  332 */     if (offset == -1)
/*      */     {
/*  334 */       return -1;
/*      */     }
/*      */     
/*  337 */     return pc + 1 + offset;
/*      */   }
/*      */   
/*      */   InstructionPtr getjumpcontrol(int pc) {
/*  341 */     InstructionPtr pi = new InstructionPtr(this.f.code, pc);
/*  342 */     if (pc >= 1 && testTMode(GET_OPCODE(pi.code[pi.idx - 1]))) {
/*  343 */       return new InstructionPtr(pi.code, pi.idx - 1);
/*      */     }
/*  345 */     return pi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   boolean need_value(int list) {
/*  353 */     for (; list != -1; list = getjump(list)) {
/*  354 */       int i = getjumpcontrol(list).get();
/*  355 */       if (GET_OPCODE(i) != 28)
/*  356 */         return true; 
/*      */     } 
/*  358 */     return false;
/*      */   }
/*      */   
/*      */   boolean patchtestreg(int node, int reg) {
/*  362 */     InstructionPtr i = getjumpcontrol(node);
/*  363 */     if (GET_OPCODE(i.get()) != 28)
/*      */     {
/*  365 */       return false; } 
/*  366 */     if (reg != 255 && reg != GETARG_B(i.get())) {
/*  367 */       SETARG_A(i, reg);
/*      */     } else {
/*      */       
/*  370 */       i.set(CREATE_ABC(27, GETARG_B(i.get()), 0, Lua.GETARG_C(i.get())));
/*      */     } 
/*  372 */     return true;
/*      */   }
/*      */   
/*      */   void removevalues(int list) {
/*  376 */     for (; list != -1; list = getjump(list))
/*  377 */       patchtestreg(list, 255); 
/*      */   }
/*      */   
/*      */   void patchlistaux(int list, int vtarget, int reg, int dtarget) {
/*  381 */     while (list != -1) {
/*  382 */       int next = getjump(list);
/*  383 */       if (patchtestreg(list, reg)) {
/*  384 */         fixjump(list, vtarget);
/*      */       } else {
/*  386 */         fixjump(list, dtarget);
/*  387 */       }  list = next;
/*      */     } 
/*      */   }
/*      */   
/*      */   void dischargejpc() {
/*  392 */     patchlistaux(this.jpc.i, this.pc, 255, this.pc);
/*  393 */     this.jpc.i = -1;
/*      */   }
/*      */   
/*      */   void patchlist(int list, int target) {
/*  397 */     if (target == this.pc) {
/*  398 */       patchtohere(list);
/*      */     } else {
/*  400 */       _assert((target < this.pc));
/*  401 */       patchlistaux(list, target, 255, target);
/*      */     } 
/*      */   }
/*      */   
/*      */   void patchclose(int list, int level) {
/*  406 */     level++;
/*  407 */     while (list != -1) {
/*  408 */       int next = getjump(list);
/*  409 */       _assert((
/*  410 */           GET_OPCODE(this.f.code[list]) == 23 && (GETARG_A(this.f.code[list]) == 0 || GETARG_A(this.f.code[list]) >= level)));
/*  411 */       SETARG_A(this.f.code, list, level);
/*  412 */       list = next;
/*      */     } 
/*      */   }
/*      */   
/*      */   void patchtohere(int list) {
/*  417 */     getlabel();
/*  418 */     concat(this.jpc, list);
/*      */   }
/*      */   
/*      */   void concat(IntPtr l1, int l2) {
/*  422 */     if (l2 == -1)
/*      */       return; 
/*  424 */     if (l1.i == -1) {
/*  425 */       l1.i = l2;
/*      */     } else {
/*  427 */       int list = l1.i;
/*      */       int next;
/*  429 */       while ((next = getjump(list)) != -1)
/*      */       {
/*  431 */         list = next; } 
/*  432 */       fixjump(list, l2);
/*      */     } 
/*      */   }
/*      */   
/*      */   void checkstack(int n) {
/*  437 */     int newstack = this.freereg + n;
/*  438 */     if (newstack > this.f.maxstacksize) {
/*  439 */       if (newstack >= 250)
/*  440 */         this.ls.syntaxerror("function or expression too complex"); 
/*  441 */       this.f.maxstacksize = newstack;
/*      */     } 
/*      */   }
/*      */   
/*      */   void reserveregs(int n) {
/*  446 */     checkstack(n);
/*  447 */     this.freereg = (short)(this.freereg + n);
/*      */   }
/*      */   
/*      */   void freereg(int reg) {
/*  451 */     if (!ISK(reg) && reg >= this.nactvar) {
/*  452 */       this.freereg = (short)(this.freereg - 1);
/*  453 */       _assert((reg == this.freereg));
/*      */     } 
/*      */   }
/*      */   
/*      */   void freeexp(LexState.expdesc e) {
/*  458 */     if (e.k == 6)
/*  459 */       freereg(e.u.info); 
/*      */   }
/*      */   
/*      */   int addk(LuaValue v) {
/*  463 */     if (this.h == null) {
/*  464 */       this.h = new Hashtable<>();
/*  465 */     } else if (this.h.containsKey(v)) {
/*  466 */       return ((Integer)this.h.get(v)).intValue();
/*      */     } 
/*  468 */     int idx = this.nk;
/*  469 */     this.h.put(v, Integer.valueOf(idx));
/*  470 */     Prototype f = this.f;
/*  471 */     if (f.k == null || this.nk + 1 >= f.k.length)
/*  472 */       f.k = realloc(f.k, this.nk * 2 + 1); 
/*  473 */     f.k[this.nk++] = v;
/*  474 */     return idx;
/*      */   }
/*      */   
/*      */   int stringK(LuaString s) {
/*  478 */     return addk((LuaValue)s);
/*      */   }
/*      */   int numberK(LuaValue r) {
/*      */     LuaInteger luaInteger;
/*  482 */     if (r instanceof li.cil.repack.org.luaj.vm2.LuaDouble) {
/*  483 */       double d = r.todouble();
/*  484 */       int i = (int)d;
/*  485 */       if (d == i)
/*  486 */         luaInteger = LuaInteger.valueOf(i); 
/*      */     } 
/*  488 */     return addk((LuaValue)luaInteger);
/*      */   }
/*      */   
/*      */   int boolK(boolean b) {
/*  492 */     return addk(b ? (LuaValue)LuaValue.TRUE : (LuaValue)LuaValue.FALSE);
/*      */   }
/*      */   
/*      */   int nilK() {
/*  496 */     return addk(LuaValue.NIL);
/*      */   }
/*      */   
/*      */   void setreturns(LexState.expdesc e, int nresults) {
/*  500 */     if (e.k == 12) {
/*  501 */       SETARG_C(getcodePtr(e), nresults + 1);
/*  502 */     } else if (e.k == 13) {
/*  503 */       SETARG_B(getcodePtr(e), nresults + 1);
/*  504 */       SETARG_A(getcodePtr(e), this.freereg);
/*  505 */       reserveregs(1);
/*      */     } 
/*      */   }
/*      */   
/*      */   void setoneret(LexState.expdesc e) {
/*  510 */     if (e.k == 12) {
/*  511 */       e.k = 6;
/*  512 */       e.u.info = GETARG_A(getcode(e));
/*  513 */     } else if (e.k == 13) {
/*  514 */       SETARG_B(getcodePtr(e), 2);
/*  515 */       e.k = 11;
/*      */     } 
/*      */   }
/*      */   void dischargevars(LexState.expdesc e) {
/*      */     int op;
/*  520 */     switch (e.k) {
/*      */       case 7:
/*  522 */         e.k = 6;
/*      */         break;
/*      */       
/*      */       case 8:
/*  526 */         e.u.info = codeABC(5, 0, e.u.info, 0);
/*  527 */         e.k = 11;
/*      */         break;
/*      */       
/*      */       case 9:
/*  531 */         op = 6;
/*  532 */         freereg(e.u.ind_idx);
/*  533 */         if (e.u.ind_vt == 7) {
/*  534 */           freereg(e.u.ind_t);
/*  535 */           op = 7;
/*      */         } 
/*  537 */         e.u.info = codeABC(op, 0, e.u.ind_t, e.u.ind_idx);
/*  538 */         e.k = 11;
/*      */         break;
/*      */       
/*      */       case 12:
/*      */       case 13:
/*  543 */         setoneret(e);
/*      */         break;
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   int code_label(int A, int b, int jump) {
/*  552 */     getlabel();
/*  553 */     return codeABC(3, A, b, jump);
/*      */   }
/*      */   void discharge2reg(LexState.expdesc e, int reg) {
/*      */     InstructionPtr pc;
/*  557 */     dischargevars(e);
/*  558 */     switch (e.k) {
/*      */       case 1:
/*  560 */         nil(reg, 1);
/*      */         break;
/*      */       
/*      */       case 2:
/*      */       case 3:
/*  565 */         codeABC(3, reg, (e.k == 2) ? 1 : 0, 0);
/*      */         break;
/*      */       
/*      */       case 4:
/*  569 */         codeK(reg, e.u.info);
/*      */         break;
/*      */       
/*      */       case 5:
/*  573 */         codeK(reg, numberK(e.u.nval()));
/*      */         break;
/*      */       
/*      */       case 11:
/*  577 */         pc = getcodePtr(e);
/*  578 */         SETARG_A(pc, reg);
/*      */         break;
/*      */       
/*      */       case 6:
/*  582 */         if (reg != e.u.info) {
/*  583 */           codeABC(0, reg, e.u.info, 0);
/*      */         }
/*      */         break;
/*      */       default:
/*  587 */         _assert((e.k == 0 || e.k == 10));
/*      */         return;
/*      */     } 
/*      */     
/*  591 */     e.u.info = reg;
/*  592 */     e.k = 6;
/*      */   }
/*      */   
/*      */   void discharge2anyreg(LexState.expdesc e) {
/*  596 */     if (e.k != 6) {
/*  597 */       reserveregs(1);
/*  598 */       discharge2reg(e, this.freereg - 1);
/*      */     } 
/*      */   }
/*      */   
/*      */   void exp2reg(LexState.expdesc e, int reg) {
/*  603 */     discharge2reg(e, reg);
/*  604 */     if (e.k == 10)
/*  605 */       concat(e.t, e.u.info); 
/*  606 */     if (e.hasjumps()) {
/*      */       
/*  608 */       int p_f = -1;
/*  609 */       int p_t = -1;
/*  610 */       if (need_value(e.t.i) || need_value(e.f.i)) {
/*  611 */         int fj = (e.k == 10) ? -1 : jump();
/*  612 */         p_f = code_label(reg, 0, 1);
/*  613 */         p_t = code_label(reg, 1, 0);
/*  614 */         patchtohere(fj);
/*      */       } 
/*  616 */       int _final = getlabel();
/*  617 */       patchlistaux(e.f.i, _final, reg, p_f);
/*  618 */       patchlistaux(e.t.i, _final, reg, p_t);
/*      */     } 
/*  620 */     e.t.i = -1;
/*  621 */     e.u.info = reg;
/*  622 */     e.k = 6;
/*      */   }
/*      */   
/*      */   void exp2nextreg(LexState.expdesc e) {
/*  626 */     dischargevars(e);
/*  627 */     freeexp(e);
/*  628 */     reserveregs(1);
/*  629 */     exp2reg(e, this.freereg - 1);
/*      */   }
/*      */   
/*      */   int exp2anyreg(LexState.expdesc e) {
/*  633 */     dischargevars(e);
/*  634 */     if (e.k == 6) {
/*  635 */       if (!e.hasjumps())
/*  636 */         return e.u.info; 
/*  637 */       if (e.u.info >= this.nactvar) {
/*  638 */         exp2reg(e, e.u.info);
/*  639 */         return e.u.info;
/*      */       } 
/*      */     } 
/*  642 */     exp2nextreg(e);
/*  643 */     return e.u.info;
/*      */   }
/*      */   
/*      */   void exp2anyregup(LexState.expdesc e) {
/*  647 */     if (e.k != 8 || e.hasjumps())
/*  648 */       exp2anyreg(e); 
/*      */   }
/*      */   
/*      */   void exp2val(LexState.expdesc e) {
/*  652 */     if (e.hasjumps()) {
/*  653 */       exp2anyreg(e);
/*      */     } else {
/*  655 */       dischargevars(e);
/*      */     } 
/*      */   }
/*      */   int exp2RK(LexState.expdesc e) {
/*  659 */     exp2val(e);
/*  660 */     switch (e.k) {
/*      */       case 1:
/*      */       case 2:
/*      */       case 3:
/*  664 */         if (this.nk <= 255) {
/*  665 */           e.u.info = (e.k == 1) ? nilK() : boolK((e.k == 2));
/*  666 */           e.k = 4;
/*  667 */           return RKASK(e.u.info);
/*      */         } 
/*      */         break;
/*      */       
/*      */       case 5:
/*  672 */         e.u.info = numberK(e.u.nval());
/*  673 */         e.k = 4;
/*      */ 
/*      */       
/*      */       case 4:
/*  677 */         if (e.u.info <= 255) {
/*  678 */           return RKASK(e.u.info);
/*      */         }
/*      */         break;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  686 */     return exp2anyreg(e);
/*      */   }
/*      */   void storevar(LexState.expdesc var, LexState.expdesc ex) {
/*      */     int e, op, i;
/*  690 */     switch (var.k) {
/*      */       case 7:
/*  692 */         freeexp(ex);
/*  693 */         exp2reg(ex, var.u.info);
/*      */         return;
/*      */       
/*      */       case 8:
/*  697 */         e = exp2anyreg(ex);
/*  698 */         codeABC(9, e, var.u.info, 0);
/*      */         break;
/*      */       
/*      */       case 9:
/*  702 */         op = (var.u.ind_vt == 7) ? 10 : 8;
/*  703 */         i = exp2RK(ex);
/*  704 */         codeABC(op, var.u.ind_t, var.u.ind_idx, i);
/*      */         break;
/*      */       
/*      */       default:
/*  708 */         _assert(false);
/*      */         break;
/*      */     } 
/*      */     
/*  712 */     freeexp(ex);
/*      */   }
/*      */ 
/*      */   
/*      */   void self(LexState.expdesc e, LexState.expdesc key) {
/*  717 */     exp2anyreg(e);
/*  718 */     freeexp(e);
/*  719 */     int func = this.freereg;
/*  720 */     reserveregs(2);
/*  721 */     codeABC(12, func, e.u.info, exp2RK(key));
/*  722 */     freeexp(key);
/*  723 */     e.u.info = func;
/*  724 */     e.k = 6;
/*      */   }
/*      */   
/*      */   void invertjump(LexState.expdesc e) {
/*  728 */     InstructionPtr pc = getjumpcontrol(e.u.info);
/*  729 */     _assert((testTMode(GET_OPCODE(pc.get())) && GET_OPCODE(pc.get()) != 28 && 
/*  730 */         Lua.GET_OPCODE(pc.get()) != 27));
/*      */     
/*  732 */     int a = GETARG_A(pc.get());
/*  733 */     int nota = (a != 0) ? 0 : 1;
/*  734 */     SETARG_A(pc, nota);
/*      */   }
/*      */   
/*      */   int jumponcond(LexState.expdesc e, int cond) {
/*  738 */     if (e.k == 11) {
/*  739 */       int ie = getcode(e);
/*  740 */       if (GET_OPCODE(ie) == 20) {
/*  741 */         this.pc--;
/*  742 */         return condjump(27, GETARG_B(ie), 0, (cond != 0) ? 0 : 1);
/*      */       } 
/*      */     } 
/*      */     
/*  746 */     discharge2anyreg(e);
/*  747 */     freeexp(e);
/*  748 */     return condjump(28, 255, e.u.info, cond);
/*      */   }
/*      */   
/*      */   void goiftrue(LexState.expdesc e) {
/*      */     int pc;
/*  753 */     dischargevars(e);
/*  754 */     switch (e.k) {
/*      */       case 10:
/*  756 */         invertjump(e);
/*  757 */         pc = e.u.info;
/*      */         break;
/*      */       
/*      */       case 2:
/*      */       case 4:
/*      */       case 5:
/*  763 */         pc = -1;
/*      */         break;
/*      */       
/*      */       default:
/*  767 */         pc = jumponcond(e, 0);
/*      */         break;
/*      */     } 
/*      */     
/*  771 */     concat(e.f, pc);
/*  772 */     patchtohere(e.t.i);
/*  773 */     e.t.i = -1;
/*      */   }
/*      */   
/*      */   void goiffalse(LexState.expdesc e) {
/*      */     int pc;
/*  778 */     dischargevars(e);
/*  779 */     switch (e.k) {
/*      */       case 10:
/*  781 */         pc = e.u.info;
/*      */         break;
/*      */       
/*      */       case 1:
/*      */       case 3:
/*  786 */         pc = -1;
/*      */         break;
/*      */       
/*      */       default:
/*  790 */         pc = jumponcond(e, 1);
/*      */         break;
/*      */     } 
/*      */     
/*  794 */     concat(e.t, pc);
/*  795 */     patchtohere(e.f.i);
/*  796 */     e.f.i = -1;
/*      */   }
/*      */   
/*      */   void codenot(LexState.expdesc e) {
/*  800 */     dischargevars(e);
/*  801 */     switch (e.k) {
/*      */       case 1:
/*      */       case 3:
/*  804 */         e.k = 2;
/*      */         break;
/*      */       
/*      */       case 2:
/*      */       case 4:
/*      */       case 5:
/*  810 */         e.k = 3;
/*      */         break;
/*      */       
/*      */       case 10:
/*  814 */         invertjump(e);
/*      */         break;
/*      */       
/*      */       case 6:
/*      */       case 11:
/*  819 */         discharge2anyreg(e);
/*  820 */         freeexp(e);
/*  821 */         e.u.info = codeABC(20, 0, e.u.info, 0);
/*  822 */         e.k = 11;
/*      */         break;
/*      */       
/*      */       default:
/*  826 */         _assert(false);
/*      */         break;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  832 */     int temp = e.f.i;
/*  833 */     e.f.i = e.t.i;
/*  834 */     e.t.i = temp;
/*      */     
/*  836 */     removevalues(e.f.i);
/*  837 */     removevalues(e.t.i);
/*      */   }
/*      */   
/*      */   static boolean vkisinreg(int k) {
/*  841 */     return (k == 6 || k == 7);
/*      */   }
/*      */   
/*      */   void indexed(LexState.expdesc t, LexState.expdesc k) {
/*  845 */     t.u.ind_t = (short)t.u.info;
/*  846 */     t.u.ind_idx = (short)exp2RK(k);
/*  847 */     Constants._assert((t.k == 8 || vkisinreg(t.k)));
/*  848 */     t.u.ind_vt = (short)((t.k == 8) ? 8 : 7);
/*  849 */     t.k = 9;
/*      */   }
/*      */   
/*      */   boolean constfolding(int op, LexState.expdesc e1, LexState.expdesc e2) {
/*      */     LuaValue r;
/*  854 */     if (!e1.isnumeral() || !e2.isnumeral())
/*  855 */       return false; 
/*  856 */     if ((op == 16 || op == 17) && e2.u.nval().eq_b((LuaValue)LuaValue.ZERO))
/*  857 */       return false; 
/*  858 */     LuaValue v1 = e1.u.nval();
/*  859 */     LuaValue v2 = e2.u.nval();
/*  860 */     switch (op) {
/*      */       case 13:
/*  862 */         r = v1.add(v2);
/*      */         break;
/*      */       case 14:
/*  865 */         r = v1.sub(v2);
/*      */         break;
/*      */       case 15:
/*  868 */         r = v1.mul(v2);
/*      */         break;
/*      */       case 16:
/*  871 */         r = v1.div(v2);
/*      */         break;
/*      */       case 17:
/*  874 */         r = v1.mod(v2);
/*      */         break;
/*      */       case 18:
/*  877 */         r = v1.pow(v2);
/*      */         break;
/*      */       case 19:
/*  880 */         r = v1.neg();
/*      */         break;
/*      */ 
/*      */       
/*      */       case 21:
/*  885 */         return false;
/*      */       default:
/*  887 */         _assert(false);
/*  888 */         r = null;
/*      */         break;
/*      */     } 
/*  891 */     if (Double.isNaN(r.todouble()))
/*  892 */       return false; 
/*  893 */     e1.u.setNval(r);
/*  894 */     return true;
/*      */   }
/*      */   
/*      */   void codearith(int op, LexState.expdesc e1, LexState.expdesc e2, int line) {
/*  898 */     if (!constfolding(op, e1, e2)) {
/*      */       
/*  900 */       int o2 = (op != 19 && op != 21) ? exp2RK(e2) : 0;
/*  901 */       int o1 = exp2RK(e1);
/*  902 */       if (o1 > o2) {
/*  903 */         freeexp(e1);
/*  904 */         freeexp(e2);
/*      */       } else {
/*  906 */         freeexp(e2);
/*  907 */         freeexp(e1);
/*      */       } 
/*  909 */       e1.u.info = codeABC(op, 0, o1, o2);
/*  910 */       e1.k = 11;
/*  911 */       fixline(line);
/*      */     } 
/*      */   }
/*      */   
/*      */   void codecomp(int op, int cond, LexState.expdesc e1, LexState.expdesc e2) {
/*  916 */     int o1 = exp2RK(e1);
/*  917 */     int o2 = exp2RK(e2);
/*  918 */     freeexp(e2);
/*  919 */     freeexp(e1);
/*  920 */     if (cond == 0 && op != 24) {
/*      */       
/*  922 */       int temp = o1;
/*  923 */       o1 = o2;
/*  924 */       o2 = temp;
/*  925 */       cond = 1;
/*      */     } 
/*  927 */     e1.u.info = condjump(op, cond, o1, o2);
/*  928 */     e1.k = 10;
/*      */   }
/*      */   
/*      */   void prefix(int op, LexState.expdesc e, int line) {
/*  932 */     LexState.expdesc e2 = new LexState.expdesc();
/*  933 */     e2.init(5, 0);
/*  934 */     switch (op) {
/*      */       case 0:
/*  936 */         if (e.isnumeral()) {
/*  937 */           e.u.setNval(e.u.nval().neg());
/*      */         } else {
/*  939 */           exp2anyreg(e);
/*  940 */           codearith(19, e, e2, line);
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 1:
/*  945 */         codenot(e);
/*      */         return;
/*      */       case 2:
/*  948 */         exp2anyreg(e);
/*  949 */         codearith(21, e, e2, line);
/*      */         return;
/*      */     } 
/*      */     
/*  953 */     _assert(false);
/*      */   }
/*      */ 
/*      */   
/*      */   void infix(int op, LexState.expdesc v) {
/*  958 */     switch (op) {
/*      */       case 13:
/*  960 */         goiftrue(v);
/*      */         return;
/*      */       
/*      */       case 14:
/*  964 */         goiffalse(v);
/*      */         return;
/*      */       
/*      */       case 6:
/*  968 */         exp2nextreg(v);
/*      */         return;
/*      */       
/*      */       case 0:
/*      */       case 1:
/*      */       case 2:
/*      */       case 3:
/*      */       case 4:
/*      */       case 5:
/*  977 */         if (!v.isnumeral()) {
/*  978 */           exp2RK(v);
/*      */         }
/*      */         return;
/*      */     } 
/*  982 */     exp2RK(v);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void posfix(int op, LexState.expdesc e1, LexState.expdesc e2, int line) {
/*  989 */     switch (op) {
/*      */       case 13:
/*  991 */         _assert((e1.t.i == -1));
/*  992 */         dischargevars(e2);
/*  993 */         concat(e2.f, e1.f.i);
/*      */         
/*  995 */         e1.setvalue(e2);
/*      */         return;
/*      */       
/*      */       case 14:
/*  999 */         _assert((e1.f.i == -1));
/* 1000 */         dischargevars(e2);
/* 1001 */         concat(e2.t, e1.t.i);
/*      */         
/* 1003 */         e1.setvalue(e2);
/*      */         return;
/*      */       
/*      */       case 6:
/* 1007 */         exp2val(e2);
/* 1008 */         if (e2.k == 11 && GET_OPCODE(getcode(e2)) == 22) {
/* 1009 */           _assert((e1.u.info == GETARG_B(getcode(e2)) - 1));
/* 1010 */           freeexp(e1);
/* 1011 */           SETARG_B(getcodePtr(e2), e1.u.info);
/* 1012 */           e1.k = 11;
/* 1013 */           e1.u.info = e2.u.info;
/*      */         } else {
/* 1015 */           exp2nextreg(e2);
/* 1016 */           codearith(22, e1, e2, line);
/*      */         } 
/*      */         return;
/*      */       
/*      */       case 0:
/* 1021 */         codearith(13, e1, e2, line);
/*      */         return;
/*      */       case 1:
/* 1024 */         codearith(14, e1, e2, line);
/*      */         return;
/*      */       case 2:
/* 1027 */         codearith(15, e1, e2, line);
/*      */         return;
/*      */       case 3:
/* 1030 */         codearith(16, e1, e2, line);
/*      */         return;
/*      */       case 4:
/* 1033 */         codearith(17, e1, e2, line);
/*      */         return;
/*      */       case 5:
/* 1036 */         codearith(18, e1, e2, line);
/*      */         return;
/*      */       case 8:
/* 1039 */         codecomp(24, 1, e1, e2);
/*      */         return;
/*      */       case 7:
/* 1042 */         codecomp(24, 0, e1, e2);
/*      */         return;
/*      */       case 9:
/* 1045 */         codecomp(25, 1, e1, e2);
/*      */         return;
/*      */       case 10:
/* 1048 */         codecomp(26, 1, e1, e2);
/*      */         return;
/*      */       case 11:
/* 1051 */         codecomp(25, 0, e1, e2);
/*      */         return;
/*      */       case 12:
/* 1054 */         codecomp(26, 0, e1, e2);
/*      */         return;
/*      */     } 
/* 1057 */     _assert(false);
/*      */   }
/*      */ 
/*      */   
/*      */   void fixline(int line) {
/* 1062 */     this.f.lineinfo[this.pc - 1] = line;
/*      */   }
/*      */   
/*      */   int code(int instruction, int line) {
/* 1066 */     Prototype f = this.f;
/* 1067 */     dischargejpc();
/*      */     
/* 1069 */     if (f.code == null || this.pc + 1 > f.code.length)
/* 1070 */       f.code = Constants.realloc(f.code, this.pc * 2 + 1); 
/* 1071 */     f.code[this.pc] = instruction;
/*      */     
/* 1073 */     if (f.lineinfo == null || this.pc + 1 > f.lineinfo.length)
/* 1074 */       f.lineinfo = Constants.realloc(f.lineinfo, this.pc * 2 + 1); 
/* 1075 */     f.lineinfo[this.pc] = line;
/* 1076 */     return this.pc++;
/*      */   }
/*      */   
/*      */   int codeABC(int o, int a, int b, int c) {
/* 1080 */     _assert((getOpMode(o) == 0));
/* 1081 */     _assert((getBMode(o) != 0 || b == 0));
/* 1082 */     _assert((getCMode(o) != 0 || c == 0));
/* 1083 */     return code(CREATE_ABC(o, a, b, c), this.ls.lastline);
/*      */   }
/*      */   
/*      */   int codeABx(int o, int a, int bc) {
/* 1087 */     _assert((getOpMode(o) == 1 || getOpMode(o) == 2));
/* 1088 */     _assert((getCMode(o) == 0));
/* 1089 */     _assert((bc >= 0 && bc <= 262143));
/* 1090 */     return code(CREATE_ABx(o, a, bc), this.ls.lastline);
/*      */   }
/*      */   
/*      */   int codeextraarg(int a) {
/* 1094 */     _assert((a <= 67108863));
/* 1095 */     return code(CREATE_Ax(39, a), this.ls.lastline);
/*      */   }
/*      */   
/*      */   int codeK(int reg, int k) {
/* 1099 */     if (k <= 262143) {
/* 1100 */       return codeABx(1, reg, k);
/*      */     }
/* 1102 */     int p = codeABx(2, reg, 0);
/* 1103 */     codeextraarg(k);
/* 1104 */     return p;
/*      */   }
/*      */ 
/*      */   
/*      */   void setlist(int base, int nelems, int tostore) {
/* 1109 */     int c = (nelems - 1) / 50 + 1;
/* 1110 */     int b = (tostore == -1) ? 0 : tostore;
/* 1111 */     _assert((tostore != 0));
/* 1112 */     if (c <= 511) {
/* 1113 */       codeABC(36, base, b, c);
/*      */     } else {
/* 1115 */       codeABC(36, base, b, 0);
/* 1116 */       code(c, this.ls.lastline);
/*      */     } 
/* 1118 */     this.freereg = (short)(base + 1);
/*      */   }
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\compiler\FuncState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */