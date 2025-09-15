/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.lib.DebugLib;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaClosure
/*     */   extends LuaFunction
/*     */ {
/* 100 */   private static final UpValue[] NOUPVALUES = new UpValue[0];
/*     */ 
/*     */ 
/*     */   
/*     */   public final Prototype p;
/*     */ 
/*     */ 
/*     */   
/*     */   public UpValue[] upValues;
/*     */ 
/*     */ 
/*     */   
/*     */   final Globals globals;
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaClosure(Prototype p, LuaValue env) {
/* 117 */     this.p = p;
/* 118 */     initupvalue1(env);
/* 119 */     this.globals = (env instanceof Globals) ? (Globals)env : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void initupvalue1(LuaValue env) {
/* 124 */     if (this.p.upvalues == null || this.p.upvalues.length == 0) {
/* 125 */       this.upValues = NOUPVALUES;
/*     */     } else {
/* 127 */       this.upValues = new UpValue[this.p.upvalues.length];
/* 128 */       this.upValues[0] = new UpValue(new LuaValue[] { env }, 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isclosure() {
/* 134 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaClosure optclosure(LuaClosure defval) {
/* 139 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaClosure checkclosure() {
/* 144 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public String tojstring() {
/* 149 */     return "function: " + this.p.toString();
/*     */   }
/*     */   
/*     */   private LuaValue[] getNewStack() {
/* 153 */     int max = this.p.maxstacksize;
/* 154 */     LuaValue[] stack = new LuaValue[max];
/* 155 */     System.arraycopy(NILS, 0, stack, 0, max);
/* 156 */     return stack;
/*     */   }
/*     */ 
/*     */   
/*     */   public final LuaValue call() {
/* 161 */     LuaValue[] stack = getNewStack();
/* 162 */     return execute(stack, NONE).arg1();
/*     */   }
/*     */ 
/*     */   
/*     */   public final LuaValue call(LuaValue arg) {
/* 167 */     LuaValue[] stack = getNewStack();
/* 168 */     switch (this.p.numparams)
/*     */     { default:
/* 170 */         stack[0] = arg;
/* 171 */         return execute(stack, NONE).arg1();
/*     */       case 0:
/* 173 */         break; }  return execute(stack, arg).arg1();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 179 */     LuaValue[] stack = getNewStack();
/* 180 */     switch (this.p.numparams)
/*     */     { default:
/* 182 */         stack[0] = arg1;
/* 183 */         stack[1] = arg2;
/* 184 */         return execute(stack, NONE).arg1();
/*     */       case 1:
/* 186 */         stack[0] = arg1;
/* 187 */         return execute(stack, arg2).arg1();
/*     */       case 0:
/* 189 */         break; }  return execute(stack, (this.p.is_vararg != 0) ? varargsOf(arg1, arg2) : NONE).arg1();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
/* 195 */     LuaValue[] stack = getNewStack();
/* 196 */     switch (this.p.numparams)
/*     */     { default:
/* 198 */         stack[0] = arg1;
/* 199 */         stack[1] = arg2;
/* 200 */         stack[2] = arg3;
/* 201 */         return execute(stack, NONE).arg1();
/*     */       case 2:
/* 203 */         stack[0] = arg1;
/* 204 */         stack[1] = arg2;
/* 205 */         return execute(stack, arg3).arg1();
/*     */       case 1:
/* 207 */         stack[0] = arg1;
/* 208 */         return execute(stack, (this.p.is_vararg != 0) ? varargsOf(arg2, arg3) : NONE).arg1();
/*     */       case 0:
/* 210 */         break; }  return execute(stack, (this.p.is_vararg != 0) ? varargsOf(arg1, arg2, arg3) : NONE).arg1();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final Varargs invoke(Varargs varargs) {
/* 216 */     return onInvoke(varargs).eval();
/*     */   }
/*     */ 
/*     */   
/*     */   public final Varargs onInvoke(Varargs varargs) {
/* 221 */     LuaValue[] stack = getNewStack();
/* 222 */     for (int i = 0; i < this.p.numparams; i++)
/* 223 */       stack[i] = varargs.arg(i + 1); 
/* 224 */     return execute(stack, (this.p.is_vararg != 0) ? varargs.subargs(this.p.numparams + 1) : NONE);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Varargs execute(LuaValue[] stack, Varargs varargs) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore #7
/*     */     //   3: iconst_0
/*     */     //   4: istore #8
/*     */     //   6: getstatic li/cil/repack/org/luaj/vm2/LuaClosure.NONE : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   9: astore #10
/*     */     //   11: aload_0
/*     */     //   12: getfield p : Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   15: getfield code : [I
/*     */     //   18: astore #11
/*     */     //   20: aload_0
/*     */     //   21: getfield p : Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   24: getfield k : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   27: astore #12
/*     */     //   29: aload_0
/*     */     //   30: getfield p : Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   33: getfield p : [Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   36: arraylength
/*     */     //   37: ifle -> 48
/*     */     //   40: aload_1
/*     */     //   41: arraylength
/*     */     //   42: anewarray li/cil/repack/org/luaj/vm2/UpValue
/*     */     //   45: goto -> 49
/*     */     //   48: aconst_null
/*     */     //   49: astore #13
/*     */     //   51: aload_0
/*     */     //   52: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   55: ifnull -> 81
/*     */     //   58: aload_0
/*     */     //   59: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   62: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   65: ifnull -> 81
/*     */     //   68: aload_0
/*     */     //   69: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   72: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   75: aload_0
/*     */     //   76: aload_2
/*     */     //   77: aload_1
/*     */     //   78: invokevirtual onCall : (Lli/cil/repack/org/luaj/vm2/LuaClosure;Lli/cil/repack/org/luaj/vm2/Varargs;[Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   81: aload_0
/*     */     //   82: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   85: ifnull -> 114
/*     */     //   88: aload_0
/*     */     //   89: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   92: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   95: ifnull -> 114
/*     */     //   98: aload_0
/*     */     //   99: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   102: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   105: iload #7
/*     */     //   107: aload #10
/*     */     //   109: iload #8
/*     */     //   111: invokevirtual onInstruction : (ILli/cil/repack/org/luaj/vm2/Varargs;I)V
/*     */     //   114: aload #11
/*     */     //   116: iload #7
/*     */     //   118: iaload
/*     */     //   119: istore_3
/*     */     //   120: iload_3
/*     */     //   121: bipush #6
/*     */     //   123: ishr
/*     */     //   124: sipush #255
/*     */     //   127: iand
/*     */     //   128: istore #4
/*     */     //   130: iload_3
/*     */     //   131: bipush #63
/*     */     //   133: iand
/*     */     //   134: tableswitch default -> 3826, 0 -> 308, 1 -> 321, 2 -> 335, 3 -> 439, 4 -> 472, 5 -> 499, 6 -> 518, 7 -> 573, 8 -> 622, 9 -> 700, 10 -> 719, 11 -> 791, 12 -> 817, 13 -> 877, 14 -> 949, 15 -> 1021, 16 -> 1093, 17 -> 1165, 18 -> 1237, 19 -> 1309, 20 -> 1325, 21 -> 1341, 22 -> 1357, 23 -> 1446, 24 -> 1518, 25 -> 1602, 26 -> 1686, 27 -> 1770, 28 -> 1798, 29 -> 1840, 30 -> 2274, 31 -> 2818, 32 -> 3164, 33 -> 3253, 34 -> 3336, 35 -> 3407, 36 -> 3445, 37 -> 3628, 38 -> 3752, 39 -> 3815
/*     */     //   308: aload_1
/*     */     //   309: iload #4
/*     */     //   311: aload_1
/*     */     //   312: iload_3
/*     */     //   313: bipush #23
/*     */     //   315: iushr
/*     */     //   316: aaload
/*     */     //   317: aastore
/*     */     //   318: goto -> 3857
/*     */     //   321: aload_1
/*     */     //   322: iload #4
/*     */     //   324: aload #12
/*     */     //   326: iload_3
/*     */     //   327: bipush #14
/*     */     //   329: iushr
/*     */     //   330: aaload
/*     */     //   331: aastore
/*     */     //   332: goto -> 3857
/*     */     //   335: iinc #7, 1
/*     */     //   338: aload #11
/*     */     //   340: iload #7
/*     */     //   342: iaload
/*     */     //   343: istore_3
/*     */     //   344: iload_3
/*     */     //   345: bipush #63
/*     */     //   347: iand
/*     */     //   348: bipush #39
/*     */     //   350: if_icmpeq -> 425
/*     */     //   353: iload_3
/*     */     //   354: bipush #63
/*     */     //   356: iand
/*     */     //   357: istore #14
/*     */     //   359: new li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   362: dup
/*     */     //   363: new java/lang/StringBuilder
/*     */     //   366: dup
/*     */     //   367: invokespecial <init> : ()V
/*     */     //   370: ldc 'OP_EXTRAARG expected after OP_LOADKX, got '
/*     */     //   372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   375: iload #14
/*     */     //   377: getstatic li/cil/repack/org/luaj/vm2/Print.OPNAMES : [Ljava/lang/String;
/*     */     //   380: arraylength
/*     */     //   381: iconst_1
/*     */     //   382: isub
/*     */     //   383: if_icmpge -> 395
/*     */     //   386: getstatic li/cil/repack/org/luaj/vm2/Print.OPNAMES : [Ljava/lang/String;
/*     */     //   389: iload #14
/*     */     //   391: aaload
/*     */     //   392: goto -> 415
/*     */     //   395: new java/lang/StringBuilder
/*     */     //   398: dup
/*     */     //   399: invokespecial <init> : ()V
/*     */     //   402: ldc 'UNKNOWN_OP_'
/*     */     //   404: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   407: iload #14
/*     */     //   409: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   412: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   418: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   421: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   424: athrow
/*     */     //   425: aload_1
/*     */     //   426: iload #4
/*     */     //   428: aload #12
/*     */     //   430: iload_3
/*     */     //   431: bipush #6
/*     */     //   433: iushr
/*     */     //   434: aaload
/*     */     //   435: aastore
/*     */     //   436: goto -> 3857
/*     */     //   439: aload_1
/*     */     //   440: iload #4
/*     */     //   442: iload_3
/*     */     //   443: bipush #23
/*     */     //   445: iushr
/*     */     //   446: ifeq -> 455
/*     */     //   449: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   452: goto -> 458
/*     */     //   455: getstatic li/cil/repack/org/luaj/vm2/LuaValue.FALSE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*     */     //   458: aastore
/*     */     //   459: iload_3
/*     */     //   460: ldc 8372224
/*     */     //   462: iand
/*     */     //   463: ifeq -> 3857
/*     */     //   466: iinc #7, 1
/*     */     //   469: goto -> 3857
/*     */     //   472: iload_3
/*     */     //   473: bipush #23
/*     */     //   475: iushr
/*     */     //   476: istore #5
/*     */     //   478: iload #5
/*     */     //   480: iinc #5, -1
/*     */     //   483: iflt -> 3857
/*     */     //   486: aload_1
/*     */     //   487: iload #4
/*     */     //   489: iinc #4, 1
/*     */     //   492: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   495: aastore
/*     */     //   496: goto -> 478
/*     */     //   499: aload_1
/*     */     //   500: iload #4
/*     */     //   502: aload_0
/*     */     //   503: getfield upValues : [Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   506: iload_3
/*     */     //   507: bipush #23
/*     */     //   509: iushr
/*     */     //   510: aaload
/*     */     //   511: invokevirtual getValue : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   514: aastore
/*     */     //   515: goto -> 3857
/*     */     //   518: aload_1
/*     */     //   519: iload #4
/*     */     //   521: aload_0
/*     */     //   522: getfield upValues : [Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   525: iload_3
/*     */     //   526: bipush #23
/*     */     //   528: iushr
/*     */     //   529: aaload
/*     */     //   530: invokevirtual getValue : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   533: iload_3
/*     */     //   534: bipush #14
/*     */     //   536: ishr
/*     */     //   537: sipush #511
/*     */     //   540: iand
/*     */     //   541: dup
/*     */     //   542: istore #6
/*     */     //   544: sipush #255
/*     */     //   547: if_icmple -> 562
/*     */     //   550: aload #12
/*     */     //   552: iload #6
/*     */     //   554: sipush #255
/*     */     //   557: iand
/*     */     //   558: aaload
/*     */     //   559: goto -> 566
/*     */     //   562: aload_1
/*     */     //   563: iload #6
/*     */     //   565: aaload
/*     */     //   566: invokevirtual get : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   569: aastore
/*     */     //   570: goto -> 3857
/*     */     //   573: aload_1
/*     */     //   574: iload #4
/*     */     //   576: aload_1
/*     */     //   577: iload_3
/*     */     //   578: bipush #23
/*     */     //   580: iushr
/*     */     //   581: aaload
/*     */     //   582: iload_3
/*     */     //   583: bipush #14
/*     */     //   585: ishr
/*     */     //   586: sipush #511
/*     */     //   589: iand
/*     */     //   590: dup
/*     */     //   591: istore #6
/*     */     //   593: sipush #255
/*     */     //   596: if_icmple -> 611
/*     */     //   599: aload #12
/*     */     //   601: iload #6
/*     */     //   603: sipush #255
/*     */     //   606: iand
/*     */     //   607: aaload
/*     */     //   608: goto -> 615
/*     */     //   611: aload_1
/*     */     //   612: iload #6
/*     */     //   614: aaload
/*     */     //   615: invokevirtual get : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   618: aastore
/*     */     //   619: goto -> 3857
/*     */     //   622: aload_0
/*     */     //   623: getfield upValues : [Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   626: iload #4
/*     */     //   628: aaload
/*     */     //   629: invokevirtual getValue : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   632: iload_3
/*     */     //   633: bipush #23
/*     */     //   635: iushr
/*     */     //   636: dup
/*     */     //   637: istore #5
/*     */     //   639: sipush #255
/*     */     //   642: if_icmple -> 657
/*     */     //   645: aload #12
/*     */     //   647: iload #5
/*     */     //   649: sipush #255
/*     */     //   652: iand
/*     */     //   653: aaload
/*     */     //   654: goto -> 661
/*     */     //   657: aload_1
/*     */     //   658: iload #5
/*     */     //   660: aaload
/*     */     //   661: iload_3
/*     */     //   662: bipush #14
/*     */     //   664: ishr
/*     */     //   665: sipush #511
/*     */     //   668: iand
/*     */     //   669: dup
/*     */     //   670: istore #6
/*     */     //   672: sipush #255
/*     */     //   675: if_icmple -> 690
/*     */     //   678: aload #12
/*     */     //   680: iload #6
/*     */     //   682: sipush #255
/*     */     //   685: iand
/*     */     //   686: aaload
/*     */     //   687: goto -> 694
/*     */     //   690: aload_1
/*     */     //   691: iload #6
/*     */     //   693: aaload
/*     */     //   694: invokevirtual set : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   697: goto -> 3857
/*     */     //   700: aload_0
/*     */     //   701: getfield upValues : [Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   704: iload_3
/*     */     //   705: bipush #23
/*     */     //   707: iushr
/*     */     //   708: aaload
/*     */     //   709: aload_1
/*     */     //   710: iload #4
/*     */     //   712: aaload
/*     */     //   713: invokevirtual setValue : (Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   716: goto -> 3857
/*     */     //   719: aload_1
/*     */     //   720: iload #4
/*     */     //   722: aaload
/*     */     //   723: iload_3
/*     */     //   724: bipush #23
/*     */     //   726: iushr
/*     */     //   727: dup
/*     */     //   728: istore #5
/*     */     //   730: sipush #255
/*     */     //   733: if_icmple -> 748
/*     */     //   736: aload #12
/*     */     //   738: iload #5
/*     */     //   740: sipush #255
/*     */     //   743: iand
/*     */     //   744: aaload
/*     */     //   745: goto -> 752
/*     */     //   748: aload_1
/*     */     //   749: iload #5
/*     */     //   751: aaload
/*     */     //   752: iload_3
/*     */     //   753: bipush #14
/*     */     //   755: ishr
/*     */     //   756: sipush #511
/*     */     //   759: iand
/*     */     //   760: dup
/*     */     //   761: istore #6
/*     */     //   763: sipush #255
/*     */     //   766: if_icmple -> 781
/*     */     //   769: aload #12
/*     */     //   771: iload #6
/*     */     //   773: sipush #255
/*     */     //   776: iand
/*     */     //   777: aaload
/*     */     //   778: goto -> 785
/*     */     //   781: aload_1
/*     */     //   782: iload #6
/*     */     //   784: aaload
/*     */     //   785: invokevirtual set : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   788: goto -> 3857
/*     */     //   791: aload_1
/*     */     //   792: iload #4
/*     */     //   794: new li/cil/repack/org/luaj/vm2/LuaTable
/*     */     //   797: dup
/*     */     //   798: iload_3
/*     */     //   799: bipush #23
/*     */     //   801: iushr
/*     */     //   802: iload_3
/*     */     //   803: bipush #14
/*     */     //   805: ishr
/*     */     //   806: sipush #511
/*     */     //   809: iand
/*     */     //   810: invokespecial <init> : (II)V
/*     */     //   813: aastore
/*     */     //   814: goto -> 3857
/*     */     //   817: aload_1
/*     */     //   818: iload #4
/*     */     //   820: iconst_1
/*     */     //   821: iadd
/*     */     //   822: aload_1
/*     */     //   823: iload_3
/*     */     //   824: bipush #23
/*     */     //   826: iushr
/*     */     //   827: aaload
/*     */     //   828: dup
/*     */     //   829: astore #9
/*     */     //   831: aastore
/*     */     //   832: aload_1
/*     */     //   833: iload #4
/*     */     //   835: aload #9
/*     */     //   837: iload_3
/*     */     //   838: bipush #14
/*     */     //   840: ishr
/*     */     //   841: sipush #511
/*     */     //   844: iand
/*     */     //   845: dup
/*     */     //   846: istore #6
/*     */     //   848: sipush #255
/*     */     //   851: if_icmple -> 866
/*     */     //   854: aload #12
/*     */     //   856: iload #6
/*     */     //   858: sipush #255
/*     */     //   861: iand
/*     */     //   862: aaload
/*     */     //   863: goto -> 870
/*     */     //   866: aload_1
/*     */     //   867: iload #6
/*     */     //   869: aaload
/*     */     //   870: invokevirtual get : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   873: aastore
/*     */     //   874: goto -> 3857
/*     */     //   877: aload_1
/*     */     //   878: iload #4
/*     */     //   880: iload_3
/*     */     //   881: bipush #23
/*     */     //   883: iushr
/*     */     //   884: dup
/*     */     //   885: istore #5
/*     */     //   887: sipush #255
/*     */     //   890: if_icmple -> 905
/*     */     //   893: aload #12
/*     */     //   895: iload #5
/*     */     //   897: sipush #255
/*     */     //   900: iand
/*     */     //   901: aaload
/*     */     //   902: goto -> 909
/*     */     //   905: aload_1
/*     */     //   906: iload #5
/*     */     //   908: aaload
/*     */     //   909: iload_3
/*     */     //   910: bipush #14
/*     */     //   912: ishr
/*     */     //   913: sipush #511
/*     */     //   916: iand
/*     */     //   917: dup
/*     */     //   918: istore #6
/*     */     //   920: sipush #255
/*     */     //   923: if_icmple -> 938
/*     */     //   926: aload #12
/*     */     //   928: iload #6
/*     */     //   930: sipush #255
/*     */     //   933: iand
/*     */     //   934: aaload
/*     */     //   935: goto -> 942
/*     */     //   938: aload_1
/*     */     //   939: iload #6
/*     */     //   941: aaload
/*     */     //   942: invokevirtual add : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   945: aastore
/*     */     //   946: goto -> 3857
/*     */     //   949: aload_1
/*     */     //   950: iload #4
/*     */     //   952: iload_3
/*     */     //   953: bipush #23
/*     */     //   955: iushr
/*     */     //   956: dup
/*     */     //   957: istore #5
/*     */     //   959: sipush #255
/*     */     //   962: if_icmple -> 977
/*     */     //   965: aload #12
/*     */     //   967: iload #5
/*     */     //   969: sipush #255
/*     */     //   972: iand
/*     */     //   973: aaload
/*     */     //   974: goto -> 981
/*     */     //   977: aload_1
/*     */     //   978: iload #5
/*     */     //   980: aaload
/*     */     //   981: iload_3
/*     */     //   982: bipush #14
/*     */     //   984: ishr
/*     */     //   985: sipush #511
/*     */     //   988: iand
/*     */     //   989: dup
/*     */     //   990: istore #6
/*     */     //   992: sipush #255
/*     */     //   995: if_icmple -> 1010
/*     */     //   998: aload #12
/*     */     //   1000: iload #6
/*     */     //   1002: sipush #255
/*     */     //   1005: iand
/*     */     //   1006: aaload
/*     */     //   1007: goto -> 1014
/*     */     //   1010: aload_1
/*     */     //   1011: iload #6
/*     */     //   1013: aaload
/*     */     //   1014: invokevirtual sub : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1017: aastore
/*     */     //   1018: goto -> 3857
/*     */     //   1021: aload_1
/*     */     //   1022: iload #4
/*     */     //   1024: iload_3
/*     */     //   1025: bipush #23
/*     */     //   1027: iushr
/*     */     //   1028: dup
/*     */     //   1029: istore #5
/*     */     //   1031: sipush #255
/*     */     //   1034: if_icmple -> 1049
/*     */     //   1037: aload #12
/*     */     //   1039: iload #5
/*     */     //   1041: sipush #255
/*     */     //   1044: iand
/*     */     //   1045: aaload
/*     */     //   1046: goto -> 1053
/*     */     //   1049: aload_1
/*     */     //   1050: iload #5
/*     */     //   1052: aaload
/*     */     //   1053: iload_3
/*     */     //   1054: bipush #14
/*     */     //   1056: ishr
/*     */     //   1057: sipush #511
/*     */     //   1060: iand
/*     */     //   1061: dup
/*     */     //   1062: istore #6
/*     */     //   1064: sipush #255
/*     */     //   1067: if_icmple -> 1082
/*     */     //   1070: aload #12
/*     */     //   1072: iload #6
/*     */     //   1074: sipush #255
/*     */     //   1077: iand
/*     */     //   1078: aaload
/*     */     //   1079: goto -> 1086
/*     */     //   1082: aload_1
/*     */     //   1083: iload #6
/*     */     //   1085: aaload
/*     */     //   1086: invokevirtual mul : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1089: aastore
/*     */     //   1090: goto -> 3857
/*     */     //   1093: aload_1
/*     */     //   1094: iload #4
/*     */     //   1096: iload_3
/*     */     //   1097: bipush #23
/*     */     //   1099: iushr
/*     */     //   1100: dup
/*     */     //   1101: istore #5
/*     */     //   1103: sipush #255
/*     */     //   1106: if_icmple -> 1121
/*     */     //   1109: aload #12
/*     */     //   1111: iload #5
/*     */     //   1113: sipush #255
/*     */     //   1116: iand
/*     */     //   1117: aaload
/*     */     //   1118: goto -> 1125
/*     */     //   1121: aload_1
/*     */     //   1122: iload #5
/*     */     //   1124: aaload
/*     */     //   1125: iload_3
/*     */     //   1126: bipush #14
/*     */     //   1128: ishr
/*     */     //   1129: sipush #511
/*     */     //   1132: iand
/*     */     //   1133: dup
/*     */     //   1134: istore #6
/*     */     //   1136: sipush #255
/*     */     //   1139: if_icmple -> 1154
/*     */     //   1142: aload #12
/*     */     //   1144: iload #6
/*     */     //   1146: sipush #255
/*     */     //   1149: iand
/*     */     //   1150: aaload
/*     */     //   1151: goto -> 1158
/*     */     //   1154: aload_1
/*     */     //   1155: iload #6
/*     */     //   1157: aaload
/*     */     //   1158: invokevirtual div : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1161: aastore
/*     */     //   1162: goto -> 3857
/*     */     //   1165: aload_1
/*     */     //   1166: iload #4
/*     */     //   1168: iload_3
/*     */     //   1169: bipush #23
/*     */     //   1171: iushr
/*     */     //   1172: dup
/*     */     //   1173: istore #5
/*     */     //   1175: sipush #255
/*     */     //   1178: if_icmple -> 1193
/*     */     //   1181: aload #12
/*     */     //   1183: iload #5
/*     */     //   1185: sipush #255
/*     */     //   1188: iand
/*     */     //   1189: aaload
/*     */     //   1190: goto -> 1197
/*     */     //   1193: aload_1
/*     */     //   1194: iload #5
/*     */     //   1196: aaload
/*     */     //   1197: iload_3
/*     */     //   1198: bipush #14
/*     */     //   1200: ishr
/*     */     //   1201: sipush #511
/*     */     //   1204: iand
/*     */     //   1205: dup
/*     */     //   1206: istore #6
/*     */     //   1208: sipush #255
/*     */     //   1211: if_icmple -> 1226
/*     */     //   1214: aload #12
/*     */     //   1216: iload #6
/*     */     //   1218: sipush #255
/*     */     //   1221: iand
/*     */     //   1222: aaload
/*     */     //   1223: goto -> 1230
/*     */     //   1226: aload_1
/*     */     //   1227: iload #6
/*     */     //   1229: aaload
/*     */     //   1230: invokevirtual mod : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1233: aastore
/*     */     //   1234: goto -> 3857
/*     */     //   1237: aload_1
/*     */     //   1238: iload #4
/*     */     //   1240: iload_3
/*     */     //   1241: bipush #23
/*     */     //   1243: iushr
/*     */     //   1244: dup
/*     */     //   1245: istore #5
/*     */     //   1247: sipush #255
/*     */     //   1250: if_icmple -> 1265
/*     */     //   1253: aload #12
/*     */     //   1255: iload #5
/*     */     //   1257: sipush #255
/*     */     //   1260: iand
/*     */     //   1261: aaload
/*     */     //   1262: goto -> 1269
/*     */     //   1265: aload_1
/*     */     //   1266: iload #5
/*     */     //   1268: aaload
/*     */     //   1269: iload_3
/*     */     //   1270: bipush #14
/*     */     //   1272: ishr
/*     */     //   1273: sipush #511
/*     */     //   1276: iand
/*     */     //   1277: dup
/*     */     //   1278: istore #6
/*     */     //   1280: sipush #255
/*     */     //   1283: if_icmple -> 1298
/*     */     //   1286: aload #12
/*     */     //   1288: iload #6
/*     */     //   1290: sipush #255
/*     */     //   1293: iand
/*     */     //   1294: aaload
/*     */     //   1295: goto -> 1302
/*     */     //   1298: aload_1
/*     */     //   1299: iload #6
/*     */     //   1301: aaload
/*     */     //   1302: invokevirtual pow : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1305: aastore
/*     */     //   1306: goto -> 3857
/*     */     //   1309: aload_1
/*     */     //   1310: iload #4
/*     */     //   1312: aload_1
/*     */     //   1313: iload_3
/*     */     //   1314: bipush #23
/*     */     //   1316: iushr
/*     */     //   1317: aaload
/*     */     //   1318: invokevirtual neg : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1321: aastore
/*     */     //   1322: goto -> 3857
/*     */     //   1325: aload_1
/*     */     //   1326: iload #4
/*     */     //   1328: aload_1
/*     */     //   1329: iload_3
/*     */     //   1330: bipush #23
/*     */     //   1332: iushr
/*     */     //   1333: aaload
/*     */     //   1334: invokevirtual not : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1337: aastore
/*     */     //   1338: goto -> 3857
/*     */     //   1341: aload_1
/*     */     //   1342: iload #4
/*     */     //   1344: aload_1
/*     */     //   1345: iload_3
/*     */     //   1346: bipush #23
/*     */     //   1348: iushr
/*     */     //   1349: aaload
/*     */     //   1350: invokevirtual len : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1353: aastore
/*     */     //   1354: goto -> 3857
/*     */     //   1357: iload_3
/*     */     //   1358: bipush #23
/*     */     //   1360: iushr
/*     */     //   1361: istore #5
/*     */     //   1363: iload_3
/*     */     //   1364: bipush #14
/*     */     //   1366: ishr
/*     */     //   1367: sipush #511
/*     */     //   1370: iand
/*     */     //   1371: istore #6
/*     */     //   1373: iload #6
/*     */     //   1375: iload #5
/*     */     //   1377: iconst_1
/*     */     //   1378: iadd
/*     */     //   1379: if_icmple -> 1426
/*     */     //   1382: aload_1
/*     */     //   1383: iload #6
/*     */     //   1385: aaload
/*     */     //   1386: invokevirtual buffer : ()Lli/cil/repack/org/luaj/vm2/Buffer;
/*     */     //   1389: astore #14
/*     */     //   1391: iinc #6, -1
/*     */     //   1394: iload #6
/*     */     //   1396: iload #5
/*     */     //   1398: if_icmplt -> 1414
/*     */     //   1401: aload #14
/*     */     //   1403: aload_1
/*     */     //   1404: iload #6
/*     */     //   1406: aaload
/*     */     //   1407: invokevirtual concatTo : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/Buffer;
/*     */     //   1410: pop
/*     */     //   1411: goto -> 1391
/*     */     //   1414: aload_1
/*     */     //   1415: iload #4
/*     */     //   1417: aload #14
/*     */     //   1419: invokevirtual value : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1422: aastore
/*     */     //   1423: goto -> 3857
/*     */     //   1426: aload_1
/*     */     //   1427: iload #4
/*     */     //   1429: aload_1
/*     */     //   1430: iload #6
/*     */     //   1432: iconst_1
/*     */     //   1433: isub
/*     */     //   1434: aaload
/*     */     //   1435: aload_1
/*     */     //   1436: iload #6
/*     */     //   1438: aaload
/*     */     //   1439: invokevirtual concat : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1442: aastore
/*     */     //   1443: goto -> 3857
/*     */     //   1446: iload #7
/*     */     //   1448: iload_3
/*     */     //   1449: bipush #14
/*     */     //   1451: iushr
/*     */     //   1452: ldc_w 131071
/*     */     //   1455: isub
/*     */     //   1456: iadd
/*     */     //   1457: istore #7
/*     */     //   1459: iload #4
/*     */     //   1461: ifle -> 3857
/*     */     //   1464: iinc #4, -1
/*     */     //   1467: aload #13
/*     */     //   1469: arraylength
/*     */     //   1470: istore #5
/*     */     //   1472: iinc #5, -1
/*     */     //   1475: iload #5
/*     */     //   1477: iflt -> 3857
/*     */     //   1480: aload #13
/*     */     //   1482: iload #5
/*     */     //   1484: aaload
/*     */     //   1485: ifnull -> 1472
/*     */     //   1488: aload #13
/*     */     //   1490: iload #5
/*     */     //   1492: aaload
/*     */     //   1493: getfield index : I
/*     */     //   1496: iload #4
/*     */     //   1498: if_icmplt -> 1472
/*     */     //   1501: aload #13
/*     */     //   1503: iload #5
/*     */     //   1505: aaload
/*     */     //   1506: invokevirtual close : ()V
/*     */     //   1509: aload #13
/*     */     //   1511: iload #5
/*     */     //   1513: aconst_null
/*     */     //   1514: aastore
/*     */     //   1515: goto -> 1472
/*     */     //   1518: iload_3
/*     */     //   1519: bipush #23
/*     */     //   1521: iushr
/*     */     //   1522: dup
/*     */     //   1523: istore #5
/*     */     //   1525: sipush #255
/*     */     //   1528: if_icmple -> 1543
/*     */     //   1531: aload #12
/*     */     //   1533: iload #5
/*     */     //   1535: sipush #255
/*     */     //   1538: iand
/*     */     //   1539: aaload
/*     */     //   1540: goto -> 1547
/*     */     //   1543: aload_1
/*     */     //   1544: iload #5
/*     */     //   1546: aaload
/*     */     //   1547: iload_3
/*     */     //   1548: bipush #14
/*     */     //   1550: ishr
/*     */     //   1551: sipush #511
/*     */     //   1554: iand
/*     */     //   1555: dup
/*     */     //   1556: istore #6
/*     */     //   1558: sipush #255
/*     */     //   1561: if_icmple -> 1576
/*     */     //   1564: aload #12
/*     */     //   1566: iload #6
/*     */     //   1568: sipush #255
/*     */     //   1571: iand
/*     */     //   1572: aaload
/*     */     //   1573: goto -> 1580
/*     */     //   1576: aload_1
/*     */     //   1577: iload #6
/*     */     //   1579: aaload
/*     */     //   1580: invokevirtual eq_b : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Z
/*     */     //   1583: iload #4
/*     */     //   1585: ifeq -> 1592
/*     */     //   1588: iconst_1
/*     */     //   1589: goto -> 1593
/*     */     //   1592: iconst_0
/*     */     //   1593: if_icmpeq -> 3857
/*     */     //   1596: iinc #7, 1
/*     */     //   1599: goto -> 3857
/*     */     //   1602: iload_3
/*     */     //   1603: bipush #23
/*     */     //   1605: iushr
/*     */     //   1606: dup
/*     */     //   1607: istore #5
/*     */     //   1609: sipush #255
/*     */     //   1612: if_icmple -> 1627
/*     */     //   1615: aload #12
/*     */     //   1617: iload #5
/*     */     //   1619: sipush #255
/*     */     //   1622: iand
/*     */     //   1623: aaload
/*     */     //   1624: goto -> 1631
/*     */     //   1627: aload_1
/*     */     //   1628: iload #5
/*     */     //   1630: aaload
/*     */     //   1631: iload_3
/*     */     //   1632: bipush #14
/*     */     //   1634: ishr
/*     */     //   1635: sipush #511
/*     */     //   1638: iand
/*     */     //   1639: dup
/*     */     //   1640: istore #6
/*     */     //   1642: sipush #255
/*     */     //   1645: if_icmple -> 1660
/*     */     //   1648: aload #12
/*     */     //   1650: iload #6
/*     */     //   1652: sipush #255
/*     */     //   1655: iand
/*     */     //   1656: aaload
/*     */     //   1657: goto -> 1664
/*     */     //   1660: aload_1
/*     */     //   1661: iload #6
/*     */     //   1663: aaload
/*     */     //   1664: invokevirtual lt_b : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Z
/*     */     //   1667: iload #4
/*     */     //   1669: ifeq -> 1676
/*     */     //   1672: iconst_1
/*     */     //   1673: goto -> 1677
/*     */     //   1676: iconst_0
/*     */     //   1677: if_icmpeq -> 3857
/*     */     //   1680: iinc #7, 1
/*     */     //   1683: goto -> 3857
/*     */     //   1686: iload_3
/*     */     //   1687: bipush #23
/*     */     //   1689: iushr
/*     */     //   1690: dup
/*     */     //   1691: istore #5
/*     */     //   1693: sipush #255
/*     */     //   1696: if_icmple -> 1711
/*     */     //   1699: aload #12
/*     */     //   1701: iload #5
/*     */     //   1703: sipush #255
/*     */     //   1706: iand
/*     */     //   1707: aaload
/*     */     //   1708: goto -> 1715
/*     */     //   1711: aload_1
/*     */     //   1712: iload #5
/*     */     //   1714: aaload
/*     */     //   1715: iload_3
/*     */     //   1716: bipush #14
/*     */     //   1718: ishr
/*     */     //   1719: sipush #511
/*     */     //   1722: iand
/*     */     //   1723: dup
/*     */     //   1724: istore #6
/*     */     //   1726: sipush #255
/*     */     //   1729: if_icmple -> 1744
/*     */     //   1732: aload #12
/*     */     //   1734: iload #6
/*     */     //   1736: sipush #255
/*     */     //   1739: iand
/*     */     //   1740: aaload
/*     */     //   1741: goto -> 1748
/*     */     //   1744: aload_1
/*     */     //   1745: iload #6
/*     */     //   1747: aaload
/*     */     //   1748: invokevirtual lteq_b : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Z
/*     */     //   1751: iload #4
/*     */     //   1753: ifeq -> 1760
/*     */     //   1756: iconst_1
/*     */     //   1757: goto -> 1761
/*     */     //   1760: iconst_0
/*     */     //   1761: if_icmpeq -> 3857
/*     */     //   1764: iinc #7, 1
/*     */     //   1767: goto -> 3857
/*     */     //   1770: aload_1
/*     */     //   1771: iload #4
/*     */     //   1773: aaload
/*     */     //   1774: invokevirtual toboolean : ()Z
/*     */     //   1777: iload_3
/*     */     //   1778: ldc 8372224
/*     */     //   1780: iand
/*     */     //   1781: ifeq -> 1788
/*     */     //   1784: iconst_1
/*     */     //   1785: goto -> 1789
/*     */     //   1788: iconst_0
/*     */     //   1789: if_icmpeq -> 3857
/*     */     //   1792: iinc #7, 1
/*     */     //   1795: goto -> 3857
/*     */     //   1798: aload_1
/*     */     //   1799: iload_3
/*     */     //   1800: bipush #23
/*     */     //   1802: iushr
/*     */     //   1803: aaload
/*     */     //   1804: dup
/*     */     //   1805: astore #9
/*     */     //   1807: invokevirtual toboolean : ()Z
/*     */     //   1810: iload_3
/*     */     //   1811: ldc 8372224
/*     */     //   1813: iand
/*     */     //   1814: ifeq -> 1821
/*     */     //   1817: iconst_1
/*     */     //   1818: goto -> 1822
/*     */     //   1821: iconst_0
/*     */     //   1822: if_icmpeq -> 1831
/*     */     //   1825: iinc #7, 1
/*     */     //   1828: goto -> 3857
/*     */     //   1831: aload_1
/*     */     //   1832: iload #4
/*     */     //   1834: aload #9
/*     */     //   1836: aastore
/*     */     //   1837: goto -> 3857
/*     */     //   1840: iload_3
/*     */     //   1841: sipush #-16384
/*     */     //   1844: iand
/*     */     //   1845: lookupswitch default -> 2161, 8388608 -> 1936, 8404992 -> 1989, 8421376 -> 2069, 16777216 -> 1961, 16793600 -> 2000, 16809984 -> 2083, 25182208 -> 2017, 25198592 -> 2103, 33570816 -> 2040, 33587200 -> 2129
/*     */     //   1936: aload_1
/*     */     //   1937: iload #4
/*     */     //   1939: aaload
/*     */     //   1940: getstatic li/cil/repack/org/luaj/vm2/LuaClosure.NONE : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1943: invokevirtual invoke : (Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   1946: astore #10
/*     */     //   1948: iload #4
/*     */     //   1950: aload #10
/*     */     //   1952: invokevirtual narg : ()I
/*     */     //   1955: iadd
/*     */     //   1956: istore #8
/*     */     //   1958: goto -> 3857
/*     */     //   1961: aload_1
/*     */     //   1962: iload #4
/*     */     //   1964: aaload
/*     */     //   1965: aload_1
/*     */     //   1966: iload #4
/*     */     //   1968: iconst_1
/*     */     //   1969: iadd
/*     */     //   1970: aaload
/*     */     //   1971: invokevirtual invoke : (Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   1974: astore #10
/*     */     //   1976: iload #4
/*     */     //   1978: aload #10
/*     */     //   1980: invokevirtual narg : ()I
/*     */     //   1983: iadd
/*     */     //   1984: istore #8
/*     */     //   1986: goto -> 3857
/*     */     //   1989: aload_1
/*     */     //   1990: iload #4
/*     */     //   1992: aaload
/*     */     //   1993: invokevirtual call : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   1996: pop
/*     */     //   1997: goto -> 3857
/*     */     //   2000: aload_1
/*     */     //   2001: iload #4
/*     */     //   2003: aaload
/*     */     //   2004: aload_1
/*     */     //   2005: iload #4
/*     */     //   2007: iconst_1
/*     */     //   2008: iadd
/*     */     //   2009: aaload
/*     */     //   2010: invokevirtual call : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2013: pop
/*     */     //   2014: goto -> 3857
/*     */     //   2017: aload_1
/*     */     //   2018: iload #4
/*     */     //   2020: aaload
/*     */     //   2021: aload_1
/*     */     //   2022: iload #4
/*     */     //   2024: iconst_1
/*     */     //   2025: iadd
/*     */     //   2026: aaload
/*     */     //   2027: aload_1
/*     */     //   2028: iload #4
/*     */     //   2030: iconst_2
/*     */     //   2031: iadd
/*     */     //   2032: aaload
/*     */     //   2033: invokevirtual call : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2036: pop
/*     */     //   2037: goto -> 3857
/*     */     //   2040: aload_1
/*     */     //   2041: iload #4
/*     */     //   2043: aaload
/*     */     //   2044: aload_1
/*     */     //   2045: iload #4
/*     */     //   2047: iconst_1
/*     */     //   2048: iadd
/*     */     //   2049: aaload
/*     */     //   2050: aload_1
/*     */     //   2051: iload #4
/*     */     //   2053: iconst_2
/*     */     //   2054: iadd
/*     */     //   2055: aaload
/*     */     //   2056: aload_1
/*     */     //   2057: iload #4
/*     */     //   2059: iconst_3
/*     */     //   2060: iadd
/*     */     //   2061: aaload
/*     */     //   2062: invokevirtual call : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2065: pop
/*     */     //   2066: goto -> 3857
/*     */     //   2069: aload_1
/*     */     //   2070: iload #4
/*     */     //   2072: aload_1
/*     */     //   2073: iload #4
/*     */     //   2075: aaload
/*     */     //   2076: invokevirtual call : ()Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2079: aastore
/*     */     //   2080: goto -> 3857
/*     */     //   2083: aload_1
/*     */     //   2084: iload #4
/*     */     //   2086: aload_1
/*     */     //   2087: iload #4
/*     */     //   2089: aaload
/*     */     //   2090: aload_1
/*     */     //   2091: iload #4
/*     */     //   2093: iconst_1
/*     */     //   2094: iadd
/*     */     //   2095: aaload
/*     */     //   2096: invokevirtual call : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2099: aastore
/*     */     //   2100: goto -> 3857
/*     */     //   2103: aload_1
/*     */     //   2104: iload #4
/*     */     //   2106: aload_1
/*     */     //   2107: iload #4
/*     */     //   2109: aaload
/*     */     //   2110: aload_1
/*     */     //   2111: iload #4
/*     */     //   2113: iconst_1
/*     */     //   2114: iadd
/*     */     //   2115: aaload
/*     */     //   2116: aload_1
/*     */     //   2117: iload #4
/*     */     //   2119: iconst_2
/*     */     //   2120: iadd
/*     */     //   2121: aaload
/*     */     //   2122: invokevirtual call : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2125: aastore
/*     */     //   2126: goto -> 3857
/*     */     //   2129: aload_1
/*     */     //   2130: iload #4
/*     */     //   2132: aload_1
/*     */     //   2133: iload #4
/*     */     //   2135: aaload
/*     */     //   2136: aload_1
/*     */     //   2137: iload #4
/*     */     //   2139: iconst_1
/*     */     //   2140: iadd
/*     */     //   2141: aaload
/*     */     //   2142: aload_1
/*     */     //   2143: iload #4
/*     */     //   2145: iconst_2
/*     */     //   2146: iadd
/*     */     //   2147: aaload
/*     */     //   2148: aload_1
/*     */     //   2149: iload #4
/*     */     //   2151: iconst_3
/*     */     //   2152: iadd
/*     */     //   2153: aaload
/*     */     //   2154: invokevirtual call : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2157: aastore
/*     */     //   2158: goto -> 3857
/*     */     //   2161: iload_3
/*     */     //   2162: bipush #23
/*     */     //   2164: iushr
/*     */     //   2165: istore #5
/*     */     //   2167: iload_3
/*     */     //   2168: bipush #14
/*     */     //   2170: ishr
/*     */     //   2171: sipush #511
/*     */     //   2174: iand
/*     */     //   2175: istore #6
/*     */     //   2177: aload_1
/*     */     //   2178: iload #4
/*     */     //   2180: aaload
/*     */     //   2181: iload #5
/*     */     //   2183: ifle -> 2201
/*     */     //   2186: aload_1
/*     */     //   2187: iload #4
/*     */     //   2189: iconst_1
/*     */     //   2190: iadd
/*     */     //   2191: iload #5
/*     */     //   2193: iconst_1
/*     */     //   2194: isub
/*     */     //   2195: invokestatic varargsOf : ([Lli/cil/repack/org/luaj/vm2/LuaValue;II)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2198: goto -> 2224
/*     */     //   2201: aload_1
/*     */     //   2202: iload #4
/*     */     //   2204: iconst_1
/*     */     //   2205: iadd
/*     */     //   2206: iload #8
/*     */     //   2208: aload #10
/*     */     //   2210: invokevirtual narg : ()I
/*     */     //   2213: isub
/*     */     //   2214: iload #4
/*     */     //   2216: iconst_1
/*     */     //   2217: iadd
/*     */     //   2218: isub
/*     */     //   2219: aload #10
/*     */     //   2221: invokestatic varargsOf : ([Lli/cil/repack/org/luaj/vm2/LuaValue;IILli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2224: invokevirtual invoke : (Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2227: astore #10
/*     */     //   2229: iload #6
/*     */     //   2231: ifle -> 2254
/*     */     //   2234: aload #10
/*     */     //   2236: aload_1
/*     */     //   2237: iload #4
/*     */     //   2239: iload #6
/*     */     //   2241: iconst_1
/*     */     //   2242: isub
/*     */     //   2243: invokevirtual copyto : ([Lli/cil/repack/org/luaj/vm2/LuaValue;II)V
/*     */     //   2246: getstatic li/cil/repack/org/luaj/vm2/LuaClosure.NONE : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2249: astore #10
/*     */     //   2251: goto -> 3857
/*     */     //   2254: iload #4
/*     */     //   2256: aload #10
/*     */     //   2258: invokevirtual narg : ()I
/*     */     //   2261: iadd
/*     */     //   2262: istore #8
/*     */     //   2264: aload #10
/*     */     //   2266: invokevirtual dealias : ()Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2269: astore #10
/*     */     //   2271: goto -> 3857
/*     */     //   2274: iload_3
/*     */     //   2275: ldc_w -8388608
/*     */     //   2278: iand
/*     */     //   2279: lookupswitch default -> 2685, 8388608 -> 2320, 16777216 -> 2403, 25165824 -> 2489, 33554432 -> 2584
/*     */     //   2320: new li/cil/repack/org/luaj/vm2/TailcallVarargs
/*     */     //   2323: dup
/*     */     //   2324: aload_1
/*     */     //   2325: iload #4
/*     */     //   2327: aaload
/*     */     //   2328: getstatic li/cil/repack/org/luaj/vm2/LuaClosure.NONE : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2331: invokespecial <init> : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)V
/*     */     //   2334: astore #14
/*     */     //   2336: aload #13
/*     */     //   2338: ifnull -> 2373
/*     */     //   2341: aload #13
/*     */     //   2343: arraylength
/*     */     //   2344: istore #15
/*     */     //   2346: iinc #15, -1
/*     */     //   2349: iload #15
/*     */     //   2351: iflt -> 2373
/*     */     //   2354: aload #13
/*     */     //   2356: iload #15
/*     */     //   2358: aaload
/*     */     //   2359: ifnull -> 2346
/*     */     //   2362: aload #13
/*     */     //   2364: iload #15
/*     */     //   2366: aaload
/*     */     //   2367: invokevirtual close : ()V
/*     */     //   2370: goto -> 2346
/*     */     //   2373: aload_0
/*     */     //   2374: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2377: ifnull -> 2400
/*     */     //   2380: aload_0
/*     */     //   2381: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2384: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2387: ifnull -> 2400
/*     */     //   2390: aload_0
/*     */     //   2391: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2394: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2397: invokevirtual onReturn : ()V
/*     */     //   2400: aload #14
/*     */     //   2402: areturn
/*     */     //   2403: new li/cil/repack/org/luaj/vm2/TailcallVarargs
/*     */     //   2406: dup
/*     */     //   2407: aload_1
/*     */     //   2408: iload #4
/*     */     //   2410: aaload
/*     */     //   2411: aload_1
/*     */     //   2412: iload #4
/*     */     //   2414: iconst_1
/*     */     //   2415: iadd
/*     */     //   2416: aaload
/*     */     //   2417: invokespecial <init> : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)V
/*     */     //   2420: astore #14
/*     */     //   2422: aload #13
/*     */     //   2424: ifnull -> 2459
/*     */     //   2427: aload #13
/*     */     //   2429: arraylength
/*     */     //   2430: istore #15
/*     */     //   2432: iinc #15, -1
/*     */     //   2435: iload #15
/*     */     //   2437: iflt -> 2459
/*     */     //   2440: aload #13
/*     */     //   2442: iload #15
/*     */     //   2444: aaload
/*     */     //   2445: ifnull -> 2432
/*     */     //   2448: aload #13
/*     */     //   2450: iload #15
/*     */     //   2452: aaload
/*     */     //   2453: invokevirtual close : ()V
/*     */     //   2456: goto -> 2432
/*     */     //   2459: aload_0
/*     */     //   2460: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2463: ifnull -> 2486
/*     */     //   2466: aload_0
/*     */     //   2467: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2470: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2473: ifnull -> 2486
/*     */     //   2476: aload_0
/*     */     //   2477: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2480: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2483: invokevirtual onReturn : ()V
/*     */     //   2486: aload #14
/*     */     //   2488: areturn
/*     */     //   2489: new li/cil/repack/org/luaj/vm2/TailcallVarargs
/*     */     //   2492: dup
/*     */     //   2493: aload_1
/*     */     //   2494: iload #4
/*     */     //   2496: aaload
/*     */     //   2497: aload_1
/*     */     //   2498: iload #4
/*     */     //   2500: iconst_1
/*     */     //   2501: iadd
/*     */     //   2502: aaload
/*     */     //   2503: aload_1
/*     */     //   2504: iload #4
/*     */     //   2506: iconst_2
/*     */     //   2507: iadd
/*     */     //   2508: aaload
/*     */     //   2509: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2512: invokespecial <init> : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)V
/*     */     //   2515: astore #14
/*     */     //   2517: aload #13
/*     */     //   2519: ifnull -> 2554
/*     */     //   2522: aload #13
/*     */     //   2524: arraylength
/*     */     //   2525: istore #15
/*     */     //   2527: iinc #15, -1
/*     */     //   2530: iload #15
/*     */     //   2532: iflt -> 2554
/*     */     //   2535: aload #13
/*     */     //   2537: iload #15
/*     */     //   2539: aaload
/*     */     //   2540: ifnull -> 2527
/*     */     //   2543: aload #13
/*     */     //   2545: iload #15
/*     */     //   2547: aaload
/*     */     //   2548: invokevirtual close : ()V
/*     */     //   2551: goto -> 2527
/*     */     //   2554: aload_0
/*     */     //   2555: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2558: ifnull -> 2581
/*     */     //   2561: aload_0
/*     */     //   2562: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2565: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2568: ifnull -> 2581
/*     */     //   2571: aload_0
/*     */     //   2572: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2575: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2578: invokevirtual onReturn : ()V
/*     */     //   2581: aload #14
/*     */     //   2583: areturn
/*     */     //   2584: new li/cil/repack/org/luaj/vm2/TailcallVarargs
/*     */     //   2587: dup
/*     */     //   2588: aload_1
/*     */     //   2589: iload #4
/*     */     //   2591: aaload
/*     */     //   2592: aload_1
/*     */     //   2593: iload #4
/*     */     //   2595: iconst_1
/*     */     //   2596: iadd
/*     */     //   2597: aaload
/*     */     //   2598: aload_1
/*     */     //   2599: iload #4
/*     */     //   2601: iconst_2
/*     */     //   2602: iadd
/*     */     //   2603: aaload
/*     */     //   2604: aload_1
/*     */     //   2605: iload #4
/*     */     //   2607: iconst_3
/*     */     //   2608: iadd
/*     */     //   2609: aaload
/*     */     //   2610: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2613: invokespecial <init> : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)V
/*     */     //   2616: astore #14
/*     */     //   2618: aload #13
/*     */     //   2620: ifnull -> 2655
/*     */     //   2623: aload #13
/*     */     //   2625: arraylength
/*     */     //   2626: istore #15
/*     */     //   2628: iinc #15, -1
/*     */     //   2631: iload #15
/*     */     //   2633: iflt -> 2655
/*     */     //   2636: aload #13
/*     */     //   2638: iload #15
/*     */     //   2640: aaload
/*     */     //   2641: ifnull -> 2628
/*     */     //   2644: aload #13
/*     */     //   2646: iload #15
/*     */     //   2648: aaload
/*     */     //   2649: invokevirtual close : ()V
/*     */     //   2652: goto -> 2628
/*     */     //   2655: aload_0
/*     */     //   2656: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2659: ifnull -> 2682
/*     */     //   2662: aload_0
/*     */     //   2663: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2666: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2669: ifnull -> 2682
/*     */     //   2672: aload_0
/*     */     //   2673: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2676: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2679: invokevirtual onReturn : ()V
/*     */     //   2682: aload #14
/*     */     //   2684: areturn
/*     */     //   2685: iload_3
/*     */     //   2686: bipush #23
/*     */     //   2688: iushr
/*     */     //   2689: istore #5
/*     */     //   2691: iload #5
/*     */     //   2693: ifle -> 2711
/*     */     //   2696: aload_1
/*     */     //   2697: iload #4
/*     */     //   2699: iconst_1
/*     */     //   2700: iadd
/*     */     //   2701: iload #5
/*     */     //   2703: iconst_1
/*     */     //   2704: isub
/*     */     //   2705: invokestatic varargsOf : ([Lli/cil/repack/org/luaj/vm2/LuaValue;II)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2708: goto -> 2734
/*     */     //   2711: aload_1
/*     */     //   2712: iload #4
/*     */     //   2714: iconst_1
/*     */     //   2715: iadd
/*     */     //   2716: iload #8
/*     */     //   2718: aload #10
/*     */     //   2720: invokevirtual narg : ()I
/*     */     //   2723: isub
/*     */     //   2724: iload #4
/*     */     //   2726: iconst_1
/*     */     //   2727: iadd
/*     */     //   2728: isub
/*     */     //   2729: aload #10
/*     */     //   2731: invokestatic varargsOf : ([Lli/cil/repack/org/luaj/vm2/LuaValue;IILli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2734: astore #10
/*     */     //   2736: new li/cil/repack/org/luaj/vm2/TailcallVarargs
/*     */     //   2739: dup
/*     */     //   2740: aload_1
/*     */     //   2741: iload #4
/*     */     //   2743: aaload
/*     */     //   2744: aload #10
/*     */     //   2746: invokespecial <init> : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)V
/*     */     //   2749: astore #14
/*     */     //   2751: aload #13
/*     */     //   2753: ifnull -> 2788
/*     */     //   2756: aload #13
/*     */     //   2758: arraylength
/*     */     //   2759: istore #15
/*     */     //   2761: iinc #15, -1
/*     */     //   2764: iload #15
/*     */     //   2766: iflt -> 2788
/*     */     //   2769: aload #13
/*     */     //   2771: iload #15
/*     */     //   2773: aaload
/*     */     //   2774: ifnull -> 2761
/*     */     //   2777: aload #13
/*     */     //   2779: iload #15
/*     */     //   2781: aaload
/*     */     //   2782: invokevirtual close : ()V
/*     */     //   2785: goto -> 2761
/*     */     //   2788: aload_0
/*     */     //   2789: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2792: ifnull -> 2815
/*     */     //   2795: aload_0
/*     */     //   2796: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2799: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2802: ifnull -> 2815
/*     */     //   2805: aload_0
/*     */     //   2806: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2809: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2812: invokevirtual onReturn : ()V
/*     */     //   2815: aload #14
/*     */     //   2817: areturn
/*     */     //   2818: iload_3
/*     */     //   2819: bipush #23
/*     */     //   2821: iushr
/*     */     //   2822: istore #5
/*     */     //   2824: iload #5
/*     */     //   2826: tableswitch default -> 3085, 0 -> 2852, 1 -> 2940, 2 -> 3012
/*     */     //   2852: aload_1
/*     */     //   2853: iload #4
/*     */     //   2855: iload #8
/*     */     //   2857: aload #10
/*     */     //   2859: invokevirtual narg : ()I
/*     */     //   2862: isub
/*     */     //   2863: iload #4
/*     */     //   2865: isub
/*     */     //   2866: aload #10
/*     */     //   2868: invokestatic varargsOf : ([Lli/cil/repack/org/luaj/vm2/LuaValue;IILli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   2871: astore #14
/*     */     //   2873: aload #13
/*     */     //   2875: ifnull -> 2910
/*     */     //   2878: aload #13
/*     */     //   2880: arraylength
/*     */     //   2881: istore #15
/*     */     //   2883: iinc #15, -1
/*     */     //   2886: iload #15
/*     */     //   2888: iflt -> 2910
/*     */     //   2891: aload #13
/*     */     //   2893: iload #15
/*     */     //   2895: aaload
/*     */     //   2896: ifnull -> 2883
/*     */     //   2899: aload #13
/*     */     //   2901: iload #15
/*     */     //   2903: aaload
/*     */     //   2904: invokevirtual close : ()V
/*     */     //   2907: goto -> 2883
/*     */     //   2910: aload_0
/*     */     //   2911: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2914: ifnull -> 2937
/*     */     //   2917: aload_0
/*     */     //   2918: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2921: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2924: ifnull -> 2937
/*     */     //   2927: aload_0
/*     */     //   2928: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2931: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2934: invokevirtual onReturn : ()V
/*     */     //   2937: aload #14
/*     */     //   2939: areturn
/*     */     //   2940: getstatic li/cil/repack/org/luaj/vm2/LuaClosure.NONE : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2943: astore #14
/*     */     //   2945: aload #13
/*     */     //   2947: ifnull -> 2982
/*     */     //   2950: aload #13
/*     */     //   2952: arraylength
/*     */     //   2953: istore #15
/*     */     //   2955: iinc #15, -1
/*     */     //   2958: iload #15
/*     */     //   2960: iflt -> 2982
/*     */     //   2963: aload #13
/*     */     //   2965: iload #15
/*     */     //   2967: aaload
/*     */     //   2968: ifnull -> 2955
/*     */     //   2971: aload #13
/*     */     //   2973: iload #15
/*     */     //   2975: aaload
/*     */     //   2976: invokevirtual close : ()V
/*     */     //   2979: goto -> 2955
/*     */     //   2982: aload_0
/*     */     //   2983: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2986: ifnull -> 3009
/*     */     //   2989: aload_0
/*     */     //   2990: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   2993: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   2996: ifnull -> 3009
/*     */     //   2999: aload_0
/*     */     //   3000: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3003: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   3006: invokevirtual onReturn : ()V
/*     */     //   3009: aload #14
/*     */     //   3011: areturn
/*     */     //   3012: aload_1
/*     */     //   3013: iload #4
/*     */     //   3015: aaload
/*     */     //   3016: astore #14
/*     */     //   3018: aload #13
/*     */     //   3020: ifnull -> 3055
/*     */     //   3023: aload #13
/*     */     //   3025: arraylength
/*     */     //   3026: istore #15
/*     */     //   3028: iinc #15, -1
/*     */     //   3031: iload #15
/*     */     //   3033: iflt -> 3055
/*     */     //   3036: aload #13
/*     */     //   3038: iload #15
/*     */     //   3040: aaload
/*     */     //   3041: ifnull -> 3028
/*     */     //   3044: aload #13
/*     */     //   3046: iload #15
/*     */     //   3048: aaload
/*     */     //   3049: invokevirtual close : ()V
/*     */     //   3052: goto -> 3028
/*     */     //   3055: aload_0
/*     */     //   3056: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3059: ifnull -> 3082
/*     */     //   3062: aload_0
/*     */     //   3063: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3066: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   3069: ifnull -> 3082
/*     */     //   3072: aload_0
/*     */     //   3073: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3076: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   3079: invokevirtual onReturn : ()V
/*     */     //   3082: aload #14
/*     */     //   3084: areturn
/*     */     //   3085: aload_1
/*     */     //   3086: iload #4
/*     */     //   3088: iload #5
/*     */     //   3090: iconst_1
/*     */     //   3091: isub
/*     */     //   3092: invokestatic varargsOf : ([Lli/cil/repack/org/luaj/vm2/LuaValue;II)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   3095: astore #14
/*     */     //   3097: aload #13
/*     */     //   3099: ifnull -> 3134
/*     */     //   3102: aload #13
/*     */     //   3104: arraylength
/*     */     //   3105: istore #15
/*     */     //   3107: iinc #15, -1
/*     */     //   3110: iload #15
/*     */     //   3112: iflt -> 3134
/*     */     //   3115: aload #13
/*     */     //   3117: iload #15
/*     */     //   3119: aaload
/*     */     //   3120: ifnull -> 3107
/*     */     //   3123: aload #13
/*     */     //   3125: iload #15
/*     */     //   3127: aaload
/*     */     //   3128: invokevirtual close : ()V
/*     */     //   3131: goto -> 3107
/*     */     //   3134: aload_0
/*     */     //   3135: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3138: ifnull -> 3161
/*     */     //   3141: aload_0
/*     */     //   3142: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3145: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   3148: ifnull -> 3161
/*     */     //   3151: aload_0
/*     */     //   3152: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3155: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   3158: invokevirtual onReturn : ()V
/*     */     //   3161: aload #14
/*     */     //   3163: areturn
/*     */     //   3164: aload_1
/*     */     //   3165: iload #4
/*     */     //   3167: iconst_1
/*     */     //   3168: iadd
/*     */     //   3169: aaload
/*     */     //   3170: astore #14
/*     */     //   3172: aload_1
/*     */     //   3173: iload #4
/*     */     //   3175: iconst_2
/*     */     //   3176: iadd
/*     */     //   3177: aaload
/*     */     //   3178: astore #15
/*     */     //   3180: aload_1
/*     */     //   3181: iload #4
/*     */     //   3183: aaload
/*     */     //   3184: aload #15
/*     */     //   3186: invokevirtual add : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3189: astore #16
/*     */     //   3191: aload #15
/*     */     //   3193: iconst_0
/*     */     //   3194: invokevirtual gt_b : (I)Z
/*     */     //   3197: ifeq -> 3213
/*     */     //   3200: aload #16
/*     */     //   3202: aload #14
/*     */     //   3204: invokevirtual lteq_b : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Z
/*     */     //   3207: ifeq -> 3250
/*     */     //   3210: goto -> 3223
/*     */     //   3213: aload #16
/*     */     //   3215: aload #14
/*     */     //   3217: invokevirtual gteq_b : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Z
/*     */     //   3220: ifeq -> 3250
/*     */     //   3223: aload_1
/*     */     //   3224: iload #4
/*     */     //   3226: aload #16
/*     */     //   3228: aastore
/*     */     //   3229: aload_1
/*     */     //   3230: iload #4
/*     */     //   3232: iconst_3
/*     */     //   3233: iadd
/*     */     //   3234: aload #16
/*     */     //   3236: aastore
/*     */     //   3237: iload #7
/*     */     //   3239: iload_3
/*     */     //   3240: bipush #14
/*     */     //   3242: iushr
/*     */     //   3243: ldc_w 131071
/*     */     //   3246: isub
/*     */     //   3247: iadd
/*     */     //   3248: istore #7
/*     */     //   3250: goto -> 3857
/*     */     //   3253: aload_1
/*     */     //   3254: iload #4
/*     */     //   3256: aaload
/*     */     //   3257: ldc_w ''for' initial value must be a number'
/*     */     //   3260: invokevirtual checknumber : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaNumber;
/*     */     //   3263: astore #14
/*     */     //   3265: aload_1
/*     */     //   3266: iload #4
/*     */     //   3268: iconst_1
/*     */     //   3269: iadd
/*     */     //   3270: aaload
/*     */     //   3271: ldc_w ''for' limit must be a number'
/*     */     //   3274: invokevirtual checknumber : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaNumber;
/*     */     //   3277: astore #15
/*     */     //   3279: aload_1
/*     */     //   3280: iload #4
/*     */     //   3282: iconst_2
/*     */     //   3283: iadd
/*     */     //   3284: aaload
/*     */     //   3285: ldc_w ''for' step must be a number'
/*     */     //   3288: invokevirtual checknumber : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaNumber;
/*     */     //   3291: astore #16
/*     */     //   3293: aload_1
/*     */     //   3294: iload #4
/*     */     //   3296: aload #14
/*     */     //   3298: aload #16
/*     */     //   3300: invokevirtual sub : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3303: aastore
/*     */     //   3304: aload_1
/*     */     //   3305: iload #4
/*     */     //   3307: iconst_1
/*     */     //   3308: iadd
/*     */     //   3309: aload #15
/*     */     //   3311: aastore
/*     */     //   3312: aload_1
/*     */     //   3313: iload #4
/*     */     //   3315: iconst_2
/*     */     //   3316: iadd
/*     */     //   3317: aload #16
/*     */     //   3319: aastore
/*     */     //   3320: iload #7
/*     */     //   3322: iload_3
/*     */     //   3323: bipush #14
/*     */     //   3325: iushr
/*     */     //   3326: ldc_w 131071
/*     */     //   3329: isub
/*     */     //   3330: iadd
/*     */     //   3331: istore #7
/*     */     //   3333: goto -> 3857
/*     */     //   3336: aload_1
/*     */     //   3337: iload #4
/*     */     //   3339: aaload
/*     */     //   3340: aload_1
/*     */     //   3341: iload #4
/*     */     //   3343: iconst_1
/*     */     //   3344: iadd
/*     */     //   3345: aaload
/*     */     //   3346: aload_1
/*     */     //   3347: iload #4
/*     */     //   3349: iconst_2
/*     */     //   3350: iadd
/*     */     //   3351: aaload
/*     */     //   3352: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   3355: invokevirtual invoke : (Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   3358: astore #10
/*     */     //   3360: iload_3
/*     */     //   3361: bipush #14
/*     */     //   3363: ishr
/*     */     //   3364: sipush #511
/*     */     //   3367: iand
/*     */     //   3368: istore #6
/*     */     //   3370: iinc #6, -1
/*     */     //   3373: iload #6
/*     */     //   3375: iflt -> 3399
/*     */     //   3378: aload_1
/*     */     //   3379: iload #4
/*     */     //   3381: iconst_3
/*     */     //   3382: iadd
/*     */     //   3383: iload #6
/*     */     //   3385: iadd
/*     */     //   3386: aload #10
/*     */     //   3388: iload #6
/*     */     //   3390: iconst_1
/*     */     //   3391: iadd
/*     */     //   3392: invokevirtual arg : (I)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3395: aastore
/*     */     //   3396: goto -> 3370
/*     */     //   3399: getstatic li/cil/repack/org/luaj/vm2/LuaClosure.NONE : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3402: astore #10
/*     */     //   3404: goto -> 3857
/*     */     //   3407: aload_1
/*     */     //   3408: iload #4
/*     */     //   3410: iconst_1
/*     */     //   3411: iadd
/*     */     //   3412: aaload
/*     */     //   3413: invokevirtual isnil : ()Z
/*     */     //   3416: ifne -> 3857
/*     */     //   3419: aload_1
/*     */     //   3420: iload #4
/*     */     //   3422: aload_1
/*     */     //   3423: iload #4
/*     */     //   3425: iconst_1
/*     */     //   3426: iadd
/*     */     //   3427: aaload
/*     */     //   3428: aastore
/*     */     //   3429: iload #7
/*     */     //   3431: iload_3
/*     */     //   3432: bipush #14
/*     */     //   3434: iushr
/*     */     //   3435: ldc_w 131071
/*     */     //   3438: isub
/*     */     //   3439: iadd
/*     */     //   3440: istore #7
/*     */     //   3442: goto -> 3857
/*     */     //   3445: iload_3
/*     */     //   3446: bipush #14
/*     */     //   3448: ishr
/*     */     //   3449: sipush #511
/*     */     //   3452: iand
/*     */     //   3453: dup
/*     */     //   3454: istore #6
/*     */     //   3456: ifne -> 3469
/*     */     //   3459: aload #11
/*     */     //   3461: iinc #7, 1
/*     */     //   3464: iload #7
/*     */     //   3466: iaload
/*     */     //   3467: istore #6
/*     */     //   3469: iload #6
/*     */     //   3471: iconst_1
/*     */     //   3472: isub
/*     */     //   3473: bipush #50
/*     */     //   3475: imul
/*     */     //   3476: istore #14
/*     */     //   3478: aload_1
/*     */     //   3479: iload #4
/*     */     //   3481: aaload
/*     */     //   3482: astore #9
/*     */     //   3484: iload_3
/*     */     //   3485: bipush #23
/*     */     //   3487: iushr
/*     */     //   3488: dup
/*     */     //   3489: istore #5
/*     */     //   3491: ifne -> 3582
/*     */     //   3494: iload #8
/*     */     //   3496: iload #4
/*     */     //   3498: isub
/*     */     //   3499: iconst_1
/*     */     //   3500: isub
/*     */     //   3501: istore #5
/*     */     //   3503: iload #5
/*     */     //   3505: aload #10
/*     */     //   3507: invokevirtual narg : ()I
/*     */     //   3510: isub
/*     */     //   3511: istore #15
/*     */     //   3513: iconst_1
/*     */     //   3514: istore #16
/*     */     //   3516: iload #16
/*     */     //   3518: iload #15
/*     */     //   3520: if_icmpgt -> 3546
/*     */     //   3523: aload #9
/*     */     //   3525: iload #14
/*     */     //   3527: iload #16
/*     */     //   3529: iadd
/*     */     //   3530: aload_1
/*     */     //   3531: iload #4
/*     */     //   3533: iload #16
/*     */     //   3535: iadd
/*     */     //   3536: aaload
/*     */     //   3537: invokevirtual set : (ILli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   3540: iinc #16, 1
/*     */     //   3543: goto -> 3516
/*     */     //   3546: iload #16
/*     */     //   3548: iload #5
/*     */     //   3550: if_icmpgt -> 3579
/*     */     //   3553: aload #9
/*     */     //   3555: iload #14
/*     */     //   3557: iload #16
/*     */     //   3559: iadd
/*     */     //   3560: aload #10
/*     */     //   3562: iload #16
/*     */     //   3564: iload #15
/*     */     //   3566: isub
/*     */     //   3567: invokevirtual arg : (I)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3570: invokevirtual set : (ILli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   3573: iinc #16, 1
/*     */     //   3576: goto -> 3546
/*     */     //   3579: goto -> 3625
/*     */     //   3582: aload #9
/*     */     //   3584: iload #14
/*     */     //   3586: iload #5
/*     */     //   3588: iadd
/*     */     //   3589: invokevirtual presize : (I)V
/*     */     //   3592: iconst_1
/*     */     //   3593: istore #15
/*     */     //   3595: iload #15
/*     */     //   3597: iload #5
/*     */     //   3599: if_icmpgt -> 3625
/*     */     //   3602: aload #9
/*     */     //   3604: iload #14
/*     */     //   3606: iload #15
/*     */     //   3608: iadd
/*     */     //   3609: aload_1
/*     */     //   3610: iload #4
/*     */     //   3612: iload #15
/*     */     //   3614: iadd
/*     */     //   3615: aaload
/*     */     //   3616: invokevirtual set : (ILli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   3619: iinc #15, 1
/*     */     //   3622: goto -> 3595
/*     */     //   3625: goto -> 3857
/*     */     //   3628: aload_0
/*     */     //   3629: getfield p : Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   3632: getfield p : [Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   3635: iload_3
/*     */     //   3636: bipush #14
/*     */     //   3638: iushr
/*     */     //   3639: aaload
/*     */     //   3640: astore #14
/*     */     //   3642: new li/cil/repack/org/luaj/vm2/LuaClosure
/*     */     //   3645: dup
/*     */     //   3646: aload #14
/*     */     //   3648: aload_0
/*     */     //   3649: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3652: invokespecial <init> : (Lli/cil/repack/org/luaj/vm2/Prototype;Lli/cil/repack/org/luaj/vm2/LuaValue;)V
/*     */     //   3655: astore #15
/*     */     //   3657: aload #14
/*     */     //   3659: getfield upvalues : [Lli/cil/repack/org/luaj/vm2/Upvaldesc;
/*     */     //   3662: astore #16
/*     */     //   3664: iconst_0
/*     */     //   3665: istore #17
/*     */     //   3667: aload #16
/*     */     //   3669: arraylength
/*     */     //   3670: istore #18
/*     */     //   3672: iload #17
/*     */     //   3674: iload #18
/*     */     //   3676: if_icmpge -> 3743
/*     */     //   3679: aload #16
/*     */     //   3681: iload #17
/*     */     //   3683: aaload
/*     */     //   3684: getfield instack : Z
/*     */     //   3687: ifeq -> 3716
/*     */     //   3690: aload #15
/*     */     //   3692: getfield upValues : [Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   3695: iload #17
/*     */     //   3697: aload_0
/*     */     //   3698: aload_1
/*     */     //   3699: aload #16
/*     */     //   3701: iload #17
/*     */     //   3703: aaload
/*     */     //   3704: getfield idx : S
/*     */     //   3707: aload #13
/*     */     //   3709: invokespecial findupval : ([Lli/cil/repack/org/luaj/vm2/LuaValue;S[Lli/cil/repack/org/luaj/vm2/UpValue;)Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   3712: aastore
/*     */     //   3713: goto -> 3737
/*     */     //   3716: aload #15
/*     */     //   3718: getfield upValues : [Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   3721: iload #17
/*     */     //   3723: aload_0
/*     */     //   3724: getfield upValues : [Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     //   3727: aload #16
/*     */     //   3729: iload #17
/*     */     //   3731: aaload
/*     */     //   3732: getfield idx : S
/*     */     //   3735: aaload
/*     */     //   3736: aastore
/*     */     //   3737: iinc #17, 1
/*     */     //   3740: goto -> 3672
/*     */     //   3743: aload_1
/*     */     //   3744: iload #4
/*     */     //   3746: aload #15
/*     */     //   3748: aastore
/*     */     //   3749: goto -> 3857
/*     */     //   3752: iload_3
/*     */     //   3753: bipush #23
/*     */     //   3755: iushr
/*     */     //   3756: istore #5
/*     */     //   3758: iload #5
/*     */     //   3760: ifne -> 3781
/*     */     //   3763: iload #4
/*     */     //   3765: aload_2
/*     */     //   3766: invokevirtual narg : ()I
/*     */     //   3769: dup
/*     */     //   3770: istore #5
/*     */     //   3772: iadd
/*     */     //   3773: istore #8
/*     */     //   3775: aload_2
/*     */     //   3776: astore #10
/*     */     //   3778: goto -> 3857
/*     */     //   3781: iconst_1
/*     */     //   3782: istore #14
/*     */     //   3784: iload #14
/*     */     //   3786: iload #5
/*     */     //   3788: if_icmpge -> 3812
/*     */     //   3791: aload_1
/*     */     //   3792: iload #4
/*     */     //   3794: iload #14
/*     */     //   3796: iadd
/*     */     //   3797: iconst_1
/*     */     //   3798: isub
/*     */     //   3799: aload_2
/*     */     //   3800: iload #14
/*     */     //   3802: invokevirtual arg : (I)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3805: aastore
/*     */     //   3806: iinc #14, 1
/*     */     //   3809: goto -> 3784
/*     */     //   3812: goto -> 3857
/*     */     //   3815: new java/lang/IllegalArgumentException
/*     */     //   3818: dup
/*     */     //   3819: ldc_w 'Uexecutable opcode: OP_EXTRAARG'
/*     */     //   3822: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   3825: athrow
/*     */     //   3826: new java/lang/IllegalArgumentException
/*     */     //   3829: dup
/*     */     //   3830: new java/lang/StringBuilder
/*     */     //   3833: dup
/*     */     //   3834: invokespecial <init> : ()V
/*     */     //   3837: ldc_w 'Illegal opcode: '
/*     */     //   3840: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3843: iload_3
/*     */     //   3844: bipush #63
/*     */     //   3846: iand
/*     */     //   3847: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   3850: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   3853: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   3856: athrow
/*     */     //   3857: iinc #7, 1
/*     */     //   3860: goto -> 81
/*     */     //   3863: astore #14
/*     */     //   3865: aload #14
/*     */     //   3867: getfield traceback : Ljava/lang/String;
/*     */     //   3870: ifnonnull -> 3885
/*     */     //   3873: aload_0
/*     */     //   3874: aload #14
/*     */     //   3876: aload_0
/*     */     //   3877: getfield p : Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   3880: iload #7
/*     */     //   3882: invokespecial processErrorHooks : (Lli/cil/repack/org/luaj/vm2/LuaError;Lli/cil/repack/org/luaj/vm2/Prototype;I)V
/*     */     //   3885: aload #14
/*     */     //   3887: athrow
/*     */     //   3888: astore #14
/*     */     //   3890: new li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   3893: dup
/*     */     //   3894: aload #14
/*     */     //   3896: invokespecial <init> : (Ljava/lang/Throwable;)V
/*     */     //   3899: astore #15
/*     */     //   3901: aload_0
/*     */     //   3902: aload #15
/*     */     //   3904: aload_0
/*     */     //   3905: getfield p : Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   3908: iload #7
/*     */     //   3910: invokespecial processErrorHooks : (Lli/cil/repack/org/luaj/vm2/LuaError;Lli/cil/repack/org/luaj/vm2/Prototype;I)V
/*     */     //   3913: aload #15
/*     */     //   3915: athrow
/*     */     //   3916: astore #19
/*     */     //   3918: aload #13
/*     */     //   3920: ifnull -> 3955
/*     */     //   3923: aload #13
/*     */     //   3925: arraylength
/*     */     //   3926: istore #20
/*     */     //   3928: iinc #20, -1
/*     */     //   3931: iload #20
/*     */     //   3933: iflt -> 3955
/*     */     //   3936: aload #13
/*     */     //   3938: iload #20
/*     */     //   3940: aaload
/*     */     //   3941: ifnull -> 3928
/*     */     //   3944: aload #13
/*     */     //   3946: iload #20
/*     */     //   3948: aaload
/*     */     //   3949: invokevirtual close : ()V
/*     */     //   3952: goto -> 3928
/*     */     //   3955: aload_0
/*     */     //   3956: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3959: ifnull -> 3982
/*     */     //   3962: aload_0
/*     */     //   3963: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3966: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   3969: ifnull -> 3982
/*     */     //   3972: aload_0
/*     */     //   3973: getfield globals : Lli/cil/repack/org/luaj/vm2/Globals;
/*     */     //   3976: getfield debuglib : Lli/cil/repack/org/luaj/vm2/lib/DebugLib;
/*     */     //   3979: invokevirtual onReturn : ()V
/*     */     //   3982: aload #19
/*     */     //   3984: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #229	-> 0
/*     */     //   #231	-> 6
/*     */     //   #232	-> 11
/*     */     //   #233	-> 20
/*     */     //   #237	-> 29
/*     */     //   #240	-> 51
/*     */     //   #241	-> 68
/*     */     //   #246	-> 81
/*     */     //   #247	-> 98
/*     */     //   #250	-> 114
/*     */     //   #251	-> 120
/*     */     //   #254	-> 130
/*     */     //   #257	-> 308
/*     */     //   #258	-> 318
/*     */     //   #261	-> 321
/*     */     //   #262	-> 332
/*     */     //   #265	-> 335
/*     */     //   #266	-> 338
/*     */     //   #267	-> 344
/*     */     //   #268	-> 353
/*     */     //   #269	-> 359
/*     */     //   #270	-> 375
/*     */     //   #272	-> 425
/*     */     //   #273	-> 436
/*     */     //   #276	-> 439
/*     */     //   #277	-> 459
/*     */     //   #278	-> 466
/*     */     //   #282	-> 472
/*     */     //   #283	-> 486
/*     */     //   #287	-> 499
/*     */     //   #288	-> 515
/*     */     //   #291	-> 518
/*     */     //   #292	-> 570
/*     */     //   #295	-> 573
/*     */     //   #296	-> 619
/*     */     //   #299	-> 622
/*     */     //   #300	-> 661
/*     */     //   #299	-> 694
/*     */     //   #301	-> 697
/*     */     //   #304	-> 700
/*     */     //   #305	-> 716
/*     */     //   #308	-> 719
/*     */     //   #309	-> 752
/*     */     //   #308	-> 785
/*     */     //   #310	-> 788
/*     */     //   #313	-> 791
/*     */     //   #314	-> 814
/*     */     //   #317	-> 817
/*     */     //   #318	-> 832
/*     */     //   #319	-> 874
/*     */     //   #322	-> 877
/*     */     //   #323	-> 909
/*     */     //   #324	-> 946
/*     */     //   #327	-> 949
/*     */     //   #328	-> 981
/*     */     //   #329	-> 1018
/*     */     //   #332	-> 1021
/*     */     //   #333	-> 1053
/*     */     //   #334	-> 1090
/*     */     //   #337	-> 1093
/*     */     //   #338	-> 1125
/*     */     //   #339	-> 1162
/*     */     //   #342	-> 1165
/*     */     //   #343	-> 1197
/*     */     //   #344	-> 1234
/*     */     //   #347	-> 1237
/*     */     //   #348	-> 1269
/*     */     //   #349	-> 1306
/*     */     //   #352	-> 1309
/*     */     //   #353	-> 1322
/*     */     //   #356	-> 1325
/*     */     //   #357	-> 1338
/*     */     //   #360	-> 1341
/*     */     //   #361	-> 1354
/*     */     //   #364	-> 1357
/*     */     //   #365	-> 1363
/*     */     //   #366	-> 1373
/*     */     //   #367	-> 1382
/*     */     //   #368	-> 1391
/*     */     //   #369	-> 1401
/*     */     //   #370	-> 1414
/*     */     //   #371	-> 1423
/*     */     //   #372	-> 1426
/*     */     //   #375	-> 1443
/*     */     //   #378	-> 1446
/*     */     //   #379	-> 1459
/*     */     //   #380	-> 1464
/*     */     //   #381	-> 1480
/*     */     //   #382	-> 1501
/*     */     //   #383	-> 1509
/*     */     //   #389	-> 1518
/*     */     //   #390	-> 1547
/*     */     //   #391	-> 1596
/*     */     //   #395	-> 1602
/*     */     //   #396	-> 1631
/*     */     //   #397	-> 1680
/*     */     //   #401	-> 1686
/*     */     //   #402	-> 1715
/*     */     //   #403	-> 1764
/*     */     //   #407	-> 1770
/*     */     //   #408	-> 1792
/*     */     //   #413	-> 1798
/*     */     //   #414	-> 1825
/*     */     //   #416	-> 1831
/*     */     //   #417	-> 1837
/*     */     //   #420	-> 1840
/*     */     //   #422	-> 1936
/*     */     //   #423	-> 1948
/*     */     //   #424	-> 1958
/*     */     //   #426	-> 1961
/*     */     //   #427	-> 1976
/*     */     //   #428	-> 1986
/*     */     //   #430	-> 1989
/*     */     //   #431	-> 1997
/*     */     //   #433	-> 2000
/*     */     //   #434	-> 2014
/*     */     //   #436	-> 2017
/*     */     //   #437	-> 2037
/*     */     //   #439	-> 2040
/*     */     //   #440	-> 2066
/*     */     //   #442	-> 2069
/*     */     //   #443	-> 2080
/*     */     //   #445	-> 2083
/*     */     //   #446	-> 2100
/*     */     //   #448	-> 2103
/*     */     //   #449	-> 2126
/*     */     //   #451	-> 2129
/*     */     //   #452	-> 2158
/*     */     //   #454	-> 2161
/*     */     //   #455	-> 2167
/*     */     //   #456	-> 2177
/*     */     //   #457	-> 2201
/*     */     //   #456	-> 2224
/*     */     //   #458	-> 2229
/*     */     //   #459	-> 2234
/*     */     //   #460	-> 2246
/*     */     //   #462	-> 2254
/*     */     //   #463	-> 2264
/*     */     //   #465	-> 2271
/*     */     //   #469	-> 2274
/*     */     //   #471	-> 2320
/*     */     //   #602	-> 2336
/*     */     //   #603	-> 2341
/*     */     //   #604	-> 2354
/*     */     //   #605	-> 2362
/*     */     //   #606	-> 2373
/*     */     //   #607	-> 2390
/*     */     //   #471	-> 2400
/*     */     //   #473	-> 2403
/*     */     //   #602	-> 2422
/*     */     //   #603	-> 2427
/*     */     //   #604	-> 2440
/*     */     //   #605	-> 2448
/*     */     //   #606	-> 2459
/*     */     //   #607	-> 2476
/*     */     //   #473	-> 2486
/*     */     //   #475	-> 2489
/*     */     //   #602	-> 2517
/*     */     //   #603	-> 2522
/*     */     //   #604	-> 2535
/*     */     //   #605	-> 2543
/*     */     //   #606	-> 2554
/*     */     //   #607	-> 2571
/*     */     //   #475	-> 2581
/*     */     //   #477	-> 2584
/*     */     //   #602	-> 2618
/*     */     //   #603	-> 2623
/*     */     //   #604	-> 2636
/*     */     //   #605	-> 2644
/*     */     //   #606	-> 2655
/*     */     //   #607	-> 2672
/*     */     //   #477	-> 2682
/*     */     //   #479	-> 2685
/*     */     //   #480	-> 2691
/*     */     //   #481	-> 2711
/*     */     //   #482	-> 2736
/*     */     //   #602	-> 2751
/*     */     //   #603	-> 2756
/*     */     //   #604	-> 2769
/*     */     //   #605	-> 2777
/*     */     //   #606	-> 2788
/*     */     //   #607	-> 2805
/*     */     //   #482	-> 2815
/*     */     //   #486	-> 2818
/*     */     //   #487	-> 2824
/*     */     //   #489	-> 2852
/*     */     //   #602	-> 2873
/*     */     //   #603	-> 2878
/*     */     //   #604	-> 2891
/*     */     //   #605	-> 2899
/*     */     //   #606	-> 2910
/*     */     //   #607	-> 2927
/*     */     //   #489	-> 2937
/*     */     //   #491	-> 2940
/*     */     //   #602	-> 2945
/*     */     //   #603	-> 2950
/*     */     //   #604	-> 2963
/*     */     //   #605	-> 2971
/*     */     //   #606	-> 2982
/*     */     //   #607	-> 2999
/*     */     //   #491	-> 3009
/*     */     //   #493	-> 3012
/*     */     //   #602	-> 3018
/*     */     //   #603	-> 3023
/*     */     //   #604	-> 3036
/*     */     //   #605	-> 3044
/*     */     //   #606	-> 3055
/*     */     //   #607	-> 3072
/*     */     //   #493	-> 3082
/*     */     //   #495	-> 3085
/*     */     //   #602	-> 3097
/*     */     //   #603	-> 3102
/*     */     //   #604	-> 3115
/*     */     //   #605	-> 3123
/*     */     //   #606	-> 3134
/*     */     //   #607	-> 3151
/*     */     //   #495	-> 3161
/*     */     //   #500	-> 3164
/*     */     //   #501	-> 3172
/*     */     //   #502	-> 3180
/*     */     //   #503	-> 3191
/*     */     //   #504	-> 3223
/*     */     //   #505	-> 3229
/*     */     //   #506	-> 3237
/*     */     //   #509	-> 3250
/*     */     //   #513	-> 3253
/*     */     //   #514	-> 3265
/*     */     //   #515	-> 3279
/*     */     //   #516	-> 3293
/*     */     //   #517	-> 3304
/*     */     //   #518	-> 3312
/*     */     //   #519	-> 3320
/*     */     //   #521	-> 3333
/*     */     //   #524	-> 3336
/*     */     //   #525	-> 3360
/*     */     //   #526	-> 3370
/*     */     //   #527	-> 3378
/*     */     //   #528	-> 3399
/*     */     //   #529	-> 3404
/*     */     //   #532	-> 3407
/*     */     //   #533	-> 3419
/*     */     //   #534	-> 3429
/*     */     //   #540	-> 3445
/*     */     //   #541	-> 3459
/*     */     //   #542	-> 3469
/*     */     //   #543	-> 3478
/*     */     //   #544	-> 3484
/*     */     //   #545	-> 3494
/*     */     //   #546	-> 3503
/*     */     //   #547	-> 3513
/*     */     //   #548	-> 3516
/*     */     //   #549	-> 3523
/*     */     //   #548	-> 3540
/*     */     //   #550	-> 3546
/*     */     //   #551	-> 3553
/*     */     //   #550	-> 3573
/*     */     //   #552	-> 3579
/*     */     //   #553	-> 3582
/*     */     //   #554	-> 3592
/*     */     //   #555	-> 3602
/*     */     //   #554	-> 3619
/*     */     //   #558	-> 3625
/*     */     //   #562	-> 3628
/*     */     //   #563	-> 3642
/*     */     //   #564	-> 3657
/*     */     //   #565	-> 3664
/*     */     //   #566	-> 3679
/*     */     //   #567	-> 3690
/*     */     //   #569	-> 3716
/*     */     //   #565	-> 3737
/*     */     //   #571	-> 3743
/*     */     //   #573	-> 3749
/*     */     //   #576	-> 3752
/*     */     //   #577	-> 3758
/*     */     //   #578	-> 3763
/*     */     //   #579	-> 3775
/*     */     //   #581	-> 3781
/*     */     //   #582	-> 3791
/*     */     //   #581	-> 3806
/*     */     //   #584	-> 3812
/*     */     //   #587	-> 3815
/*     */     //   #590	-> 3826
/*     */     //   #245	-> 3857
/*     */     //   #593	-> 3863
/*     */     //   #594	-> 3865
/*     */     //   #595	-> 3873
/*     */     //   #596	-> 3885
/*     */     //   #597	-> 3888
/*     */     //   #598	-> 3890
/*     */     //   #599	-> 3901
/*     */     //   #600	-> 3913
/*     */     //   #602	-> 3916
/*     */     //   #603	-> 3923
/*     */     //   #604	-> 3936
/*     */     //   #605	-> 3944
/*     */     //   #606	-> 3955
/*     */     //   #607	-> 3972
/*     */     //   #608	-> 3982
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   359	66	14	op	I
/*     */     //   478	21	5	b	I
/*     */     //   544	29	6	c	I
/*     */     //   593	29	6	c	I
/*     */     //   639	61	5	b	I
/*     */     //   672	28	6	c	I
/*     */     //   730	61	5	b	I
/*     */     //   763	28	6	c	I
/*     */     //   848	29	6	c	I
/*     */     //   831	46	9	o	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   887	62	5	b	I
/*     */     //   920	29	6	c	I
/*     */     //   959	62	5	b	I
/*     */     //   992	29	6	c	I
/*     */     //   1031	62	5	b	I
/*     */     //   1064	29	6	c	I
/*     */     //   1103	62	5	b	I
/*     */     //   1136	29	6	c	I
/*     */     //   1175	62	5	b	I
/*     */     //   1208	29	6	c	I
/*     */     //   1247	62	5	b	I
/*     */     //   1280	29	6	c	I
/*     */     //   1391	32	14	sb	Lli/cil/repack/org/luaj/vm2/Buffer;
/*     */     //   1363	83	5	b	I
/*     */     //   1373	73	6	c	I
/*     */     //   1472	46	5	b	I
/*     */     //   1525	77	5	b	I
/*     */     //   1558	44	6	c	I
/*     */     //   1609	77	5	b	I
/*     */     //   1642	44	6	c	I
/*     */     //   1693	77	5	b	I
/*     */     //   1726	44	6	c	I
/*     */     //   1807	33	9	o	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   2167	107	5	b	I
/*     */     //   2177	97	6	c	I
/*     */     //   2346	27	15	u	I
/*     */     //   2432	27	15	u	I
/*     */     //   2527	27	15	u	I
/*     */     //   2628	27	15	u	I
/*     */     //   2761	27	15	u	I
/*     */     //   2691	127	5	b	I
/*     */     //   2883	27	15	u	I
/*     */     //   2955	27	15	u	I
/*     */     //   3028	27	15	u	I
/*     */     //   3107	27	15	u	I
/*     */     //   2824	340	5	b	I
/*     */     //   3172	78	14	limit	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3180	70	15	step	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3191	59	16	idx	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3265	68	14	init	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3279	54	15	limit	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3293	40	16	step	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3370	37	6	c	I
/*     */     //   3513	66	15	m	I
/*     */     //   3516	63	16	j	I
/*     */     //   3595	30	15	j	I
/*     */     //   3478	147	14	offset	I
/*     */     //   3491	137	5	b	I
/*     */     //   3456	172	6	c	I
/*     */     //   3484	144	9	o	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   3667	76	17	j	I
/*     */     //   3672	71	18	nup	I
/*     */     //   3642	107	14	newp	Lli/cil/repack/org/luaj/vm2/Prototype;
/*     */     //   3657	92	15	ncl	Lli/cil/repack/org/luaj/vm2/LuaClosure;
/*     */     //   3664	85	16	uv	[Lli/cil/repack/org/luaj/vm2/Upvaldesc;
/*     */     //   3784	28	14	j	I
/*     */     //   3758	57	5	b	I
/*     */     //   120	3743	3	i	I
/*     */     //   130	3733	4	a	I
/*     */     //   3865	23	14	le	Lli/cil/repack/org/luaj/vm2/LuaError;
/*     */     //   3901	15	15	le	Lli/cil/repack/org/luaj/vm2/LuaError;
/*     */     //   3890	26	14	e	Ljava/lang/Exception;
/*     */     //   3928	27	20	u	I
/*     */     //   0	3985	0	this	Lli/cil/repack/org/luaj/vm2/LuaClosure;
/*     */     //   0	3985	1	stack	[Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   0	3985	2	varargs	Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   3	3982	7	pc	I
/*     */     //   6	3979	8	top	I
/*     */     //   11	3974	10	v	Lli/cil/repack/org/luaj/vm2/Varargs;
/*     */     //   20	3965	11	code	[I
/*     */     //   29	3956	12	k	[Lli/cil/repack/org/luaj/vm2/LuaValue;
/*     */     //   51	3934	13	openups	[Lli/cil/repack/org/luaj/vm2/UpValue;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   81	2336	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   81	2336	3888	java/lang/Exception
/*     */     //   81	2336	3916	finally
/*     */     //   2403	2422	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   2403	2422	3888	java/lang/Exception
/*     */     //   2403	2422	3916	finally
/*     */     //   2489	2517	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   2489	2517	3888	java/lang/Exception
/*     */     //   2489	2517	3916	finally
/*     */     //   2584	2618	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   2584	2618	3888	java/lang/Exception
/*     */     //   2584	2618	3916	finally
/*     */     //   2685	2751	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   2685	2751	3888	java/lang/Exception
/*     */     //   2685	2751	3916	finally
/*     */     //   2818	2873	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   2818	2873	3888	java/lang/Exception
/*     */     //   2818	2873	3916	finally
/*     */     //   2940	2945	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   2940	2945	3888	java/lang/Exception
/*     */     //   2940	2945	3916	finally
/*     */     //   3012	3018	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   3012	3018	3888	java/lang/Exception
/*     */     //   3012	3018	3916	finally
/*     */     //   3085	3097	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   3085	3097	3888	java/lang/Exception
/*     */     //   3085	3097	3916	finally
/*     */     //   3164	3863	3863	li/cil/repack/org/luaj/vm2/LuaError
/*     */     //   3164	3863	3888	java/lang/Exception
/*     */     //   3164	3918	3916	finally
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   String errorHook(String msg, int level) {
/* 617 */     if (this.globals == null)
/* 618 */       return msg; 
/* 619 */     LuaThread r = this.globals.running;
/* 620 */     if (r.errorfunc == null)
/* 621 */       return (this.globals.debuglib != null) ? (msg + "\n" + this.globals.debuglib.traceback(level)) : msg; 
/* 622 */     LuaValue e = r.errorfunc;
/* 623 */     r.errorfunc = null;
/*     */     try {
/* 625 */       return e.call(LuaValue.valueOf(msg)).tojstring();
/* 626 */     } catch (Throwable t) {
/* 627 */       return "error in error handling";
/*     */     } finally {
/* 629 */       r.errorfunc = e;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void processErrorHooks(LuaError le, Prototype p, int pc) {
/* 634 */     String file = "?";
/* 635 */     int line = -1;
/*     */     
/* 637 */     DebugLib.CallFrame frame = null;
/* 638 */     if (this.globals != null && this.globals.debuglib != null) {
/* 639 */       frame = this.globals.debuglib.getCallFrame(le.level);
/* 640 */       if (frame != null) {
/* 641 */         String src = frame.shortsource();
/* 642 */         file = (src != null) ? src : "?";
/* 643 */         line = frame.currentline();
/*     */       } 
/*     */     } 
/* 646 */     if (frame == null) {
/* 647 */       file = (p.source != null) ? p.source.tojstring() : "?";
/* 648 */       line = (p.lineinfo != null && pc >= 0 && pc < p.lineinfo.length) ? p.lineinfo[pc] : -1;
/*     */     } 
/*     */     
/* 651 */     le.fileline = file + ": " + line;
/* 652 */     le.traceback = errorHook(le.getMessage(), le.level);
/*     */   }
/*     */   
/*     */   private UpValue findupval(LuaValue[] stack, short idx, UpValue[] openups) {
/* 656 */     int n = openups.length; int i;
/* 657 */     for (i = 0; i < n; i++) {
/* 658 */       if (openups[i] != null && (openups[i]).index == idx)
/* 659 */         return openups[i]; 
/* 660 */     }  for (i = 0; i < n; i++) {
/* 661 */       if (openups[i] == null)
/* 662 */       { openups[i] = new UpValue(stack, idx); return new UpValue(stack, idx); } 
/* 663 */     }  error("No space for upvalue");
/* 664 */     return null;
/*     */   }
/*     */   
/*     */   protected LuaValue getUpvalue(int i) {
/* 668 */     return this.upValues[i].getValue();
/*     */   }
/*     */   
/*     */   protected void setUpvalue(int i, LuaValue v) {
/* 672 */     this.upValues[i].setValue(v);
/*     */   }
/*     */ 
/*     */   
/*     */   public String name() {
/* 677 */     return "<" + this.p.shortsource() + ":" + this.p.linedefined + ">";
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaClosure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */