/*      */ package li.cil.repack.org.luaj.vm2;
/*      */ 
/*      */ import java.lang.ref.WeakReference;
/*      */ import java.util.Vector;
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
/*      */ public class LuaTable
/*      */   extends LuaValue
/*      */   implements Metatable
/*      */ {
/*      */   private static final int MIN_HASH_CAPACITY = 2;
/*      */   protected LuaValue[] array;
/*      */   protected Slot[] hash;
/*      */   protected int hashEntries;
/*      */   protected Metatable m_metatable;
/*      */   
/*      */   public LuaTable() {
/*   96 */     this.array = NOVALS;
/*   97 */     this.hash = NOBUCKETS;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaTable(int narray, int nhash) {
/*  107 */     presize(narray, nhash);
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
/*      */   public LuaTable(LuaValue[] named, LuaValue[] unnamed, Varargs lastarg) {
/*  119 */     int nn = (named != null) ? named.length : 0;
/*  120 */     int nu = (unnamed != null) ? unnamed.length : 0;
/*  121 */     int nl = (lastarg != null) ? lastarg.narg() : 0;
/*  122 */     presize(nu + nl, nn >> 1); int i;
/*  123 */     for (i = 0; i < nu; i++)
/*  124 */       rawset(i + 1, unnamed[i]); 
/*  125 */     if (lastarg != null) {
/*  126 */       int n; for (i = 1, n = lastarg.narg(); i <= n; i++)
/*  127 */         rawset(nu + i, lastarg.arg(i)); 
/*  128 */     }  for (i = 0; i < nn; i += 2) {
/*  129 */       if (!named[i + 1].isnil()) {
/*  130 */         rawset(named[i], named[i + 1]);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaTable(Varargs varargs) {
/*  139 */     this(varargs, 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaTable(Varargs varargs, int firstarg) {
/*  150 */     int nskip = firstarg - 1;
/*  151 */     int n = Math.max(varargs.narg() - nskip, 0);
/*  152 */     presize(n, 1);
/*  153 */     for (int i = 1; i <= n; i++) {
/*  154 */       set(i, varargs.arg(i + nskip));
/*      */     }
/*      */   }
/*      */   
/*      */   public int type() {
/*  159 */     return 5;
/*      */   }
/*      */ 
/*      */   
/*      */   public String typename() {
/*  164 */     return "table";
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean istable() {
/*  169 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaTable checktable() {
/*  174 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaTable opttable(LuaTable defval) {
/*  179 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public void presize(int narray) {
/*  184 */     if (narray > this.array.length)
/*  185 */       this.array = resize(this.array, 1 << log2(narray)); 
/*      */   }
/*      */   
/*      */   public void presize(int narray, int nhash) {
/*  189 */     if (nhash > 0 && nhash < 2) {
/*  190 */       nhash = 2;
/*      */     }
/*  192 */     this.array = (narray > 0) ? new LuaValue[1 << log2(narray)] : NOVALS;
/*  193 */     this.hash = (nhash > 0) ? new Slot[1 << log2(nhash)] : NOBUCKETS;
/*  194 */     this.hashEntries = 0;
/*      */   }
/*      */ 
/*      */   
/*      */   private static LuaValue[] resize(LuaValue[] old, int n) {
/*  199 */     LuaValue[] v = new LuaValue[n];
/*  200 */     System.arraycopy(old, 0, v, 0, old.length);
/*  201 */     return v;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int getArrayLength() {
/*  210 */     return this.array.length;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected int getHashLength() {
/*  218 */     return this.hash.length;
/*      */   }
/*      */   
/*      */   public LuaValue getmetatable() {
/*  222 */     return (this.m_metatable != null) ? this.m_metatable.toLuaValue() : null;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue setmetatable(LuaValue metatable) {
/*  227 */     boolean hadWeakKeys = (this.m_metatable != null && this.m_metatable.useWeakKeys());
/*  228 */     boolean hadWeakValues = (this.m_metatable != null && this.m_metatable.useWeakValues());
/*  229 */     this.m_metatable = metatableOf(metatable);
/*  230 */     if (hadWeakKeys != ((this.m_metatable != null && this.m_metatable.useWeakKeys())) || hadWeakValues != ((this.m_metatable != null && this.m_metatable
/*  231 */       .useWeakValues())))
/*      */     {
/*  233 */       rehash(0);
/*      */     }
/*  235 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue get(int key) {
/*  240 */     LuaValue v = rawget(key);
/*  241 */     return (v.isnil() && this.m_metatable != null) ? gettable(this, valueOf(key)) : v;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue get(LuaValue key) {
/*  246 */     LuaValue v = rawget(key);
/*  247 */     return (v.isnil() && this.m_metatable != null) ? gettable(this, key) : v;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue rawget(int key) {
/*  252 */     if (key > 0 && key <= this.array.length) {
/*  253 */       LuaValue v = (this.m_metatable == null) ? this.array[key - 1] : this.m_metatable.arrayget(this.array, key - 1);
/*  254 */       return (v != null) ? v : NIL;
/*      */     } 
/*  256 */     return hashget(LuaInteger.valueOf(key));
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue rawget(LuaValue key) {
/*  261 */     if (key.isinttype()) {
/*  262 */       int ikey = key.toint();
/*  263 */       if (ikey > 0 && ikey <= this.array.length) {
/*  264 */         LuaValue v = (this.m_metatable == null) ? this.array[ikey - 1] : this.m_metatable.arrayget(this.array, ikey - 1);
/*  265 */         return (v != null) ? v : NIL;
/*      */       } 
/*      */     } 
/*  268 */     return hashget(key);
/*      */   }
/*      */   
/*      */   protected LuaValue hashget(LuaValue key) {
/*  272 */     if (this.hashEntries > 0) {
/*  273 */       for (Slot slot = this.hash[hashSlot(key)]; slot != null; slot = slot.rest()) {
/*      */         StrongSlot foundSlot;
/*  275 */         if ((foundSlot = slot.find(key)) != null) {
/*  276 */           return foundSlot.value();
/*      */         }
/*      */       } 
/*      */     }
/*  280 */     return NIL;
/*      */   }
/*      */ 
/*      */   
/*      */   public void set(int key, LuaValue value) {
/*  285 */     if (this.m_metatable == null || !rawget(key).isnil() || !settable(this, LuaInteger.valueOf(key), value)) {
/*  286 */       rawset(key, value);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void set(LuaValue key, LuaValue value) {
/*  292 */     if (key == null || (!key.isvalidkey() && !metatag(NEWINDEX).isfunction()))
/*  293 */       throw new LuaError("value ('" + key + "') can not be used as a table index"); 
/*  294 */     if (this.m_metatable == null || !rawget(key).isnil() || !settable(this, key, value)) {
/*  295 */       rawset(key, value);
/*      */     }
/*      */   }
/*      */   
/*      */   public void rawset(int key, LuaValue value) {
/*  300 */     if (!arrayset(key, value)) {
/*  301 */       hashset(LuaInteger.valueOf(key), value);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public void rawset(LuaValue key, LuaValue value) {
/*  307 */     if (!key.isinttype() || !arrayset(key.toint(), value)) {
/*  308 */       hashset(key, value);
/*      */     }
/*      */   }
/*      */   
/*      */   private boolean arrayset(int key, LuaValue value) {
/*  313 */     if (key > 0 && key <= this.array.length) {
/*  314 */       this.array[key - 1] = value.isnil() ? null : ((this.m_metatable != null) ? this.m_metatable.wrap(value) : value);
/*  315 */       return true;
/*      */     } 
/*  317 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue remove(int pos) {
/*  327 */     int n = length();
/*  328 */     if (pos == 0) {
/*  329 */       pos = n;
/*  330 */     } else if (pos > n) {
/*  331 */       return NONE;
/*  332 */     }  LuaValue v = get(pos);
/*  333 */     for (LuaValue r = v; !r.isnil(); ) {
/*  334 */       r = get(pos + 1);
/*  335 */       set(pos++, r);
/*      */     } 
/*  337 */     return v.isnil() ? NONE : v;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void insert(int pos, LuaValue value) {
/*  347 */     if (pos == 0)
/*  348 */       pos = length() + 1; 
/*  349 */     while (!value.isnil()) {
/*  350 */       LuaValue v = get(pos);
/*  351 */       set(pos++, value);
/*  352 */       value = v;
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
/*      */   public LuaValue concat(LuaString sep, int i, int j) {
/*  365 */     Buffer sb = new Buffer();
/*  366 */     if (i <= j) {
/*  367 */       sb.append(get(i).checkstring());
/*  368 */       while (++i <= j) {
/*  369 */         sb.append(sep);
/*  370 */         sb.append(get(i).checkstring());
/*      */       } 
/*      */     } 
/*  373 */     return sb.tostring();
/*      */   }
/*      */ 
/*      */   
/*      */   public int length() {
/*  378 */     if (this.m_metatable != null) {
/*  379 */       LuaValue len = len();
/*  380 */       if (!len.isint())
/*  381 */         throw new LuaError("table length is not an integer: " + len); 
/*  382 */       return len.toint();
/*      */     } 
/*  384 */     return rawlen();
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue len() {
/*  389 */     LuaValue h = metatag(LEN);
/*  390 */     if (h.toboolean())
/*  391 */       return h.call(this); 
/*  392 */     return LuaInteger.valueOf(rawlen());
/*      */   }
/*      */ 
/*      */   
/*      */   public int rawlen() {
/*  397 */     int a = getArrayLength();
/*  398 */     int n = a + 1, m = 0;
/*  399 */     while (!rawget(n).isnil()) {
/*  400 */       m = n;
/*  401 */       n += a + getHashLength() + 1;
/*      */     } 
/*  403 */     while (n > m + 1) {
/*  404 */       int k = (n + m) / 2;
/*  405 */       if (!rawget(k).isnil()) {
/*  406 */         m = k; continue;
/*      */       } 
/*  408 */       n = k;
/*      */     } 
/*  410 */     return m;
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
/*      */   public Varargs next(LuaValue key) {
/*      */     // Byte code:
/*      */     //   0: iconst_0
/*      */     //   1: istore_2
/*      */     //   2: aload_1
/*      */     //   3: invokevirtual isnil : ()Z
/*      */     //   6: ifne -> 182
/*      */     //   9: aload_1
/*      */     //   10: invokevirtual isinttype : ()Z
/*      */     //   13: ifeq -> 37
/*      */     //   16: aload_1
/*      */     //   17: invokevirtual toint : ()I
/*      */     //   20: istore_2
/*      */     //   21: iload_2
/*      */     //   22: ifle -> 37
/*      */     //   25: iload_2
/*      */     //   26: aload_0
/*      */     //   27: getfield array : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   30: arraylength
/*      */     //   31: if_icmpgt -> 37
/*      */     //   34: goto -> 182
/*      */     //   37: aload_0
/*      */     //   38: getfield hash : [Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   41: arraylength
/*      */     //   42: ifne -> 69
/*      */     //   45: new java/lang/StringBuilder
/*      */     //   48: dup
/*      */     //   49: invokespecial <init> : ()V
/*      */     //   52: ldc_w 'invalid key to 'next' 1: '
/*      */     //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   58: aload_1
/*      */     //   59: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   62: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   65: invokestatic error : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   68: pop
/*      */     //   69: aload_0
/*      */     //   70: aload_1
/*      */     //   71: invokespecial hashSlot : (Lli/cil/repack/org/luaj/vm2/LuaValue;)I
/*      */     //   74: istore_2
/*      */     //   75: iconst_0
/*      */     //   76: istore_3
/*      */     //   77: aload_0
/*      */     //   78: getfield hash : [Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   81: iload_2
/*      */     //   82: aaload
/*      */     //   83: astore #4
/*      */     //   85: aload #4
/*      */     //   87: ifnull -> 144
/*      */     //   90: iload_3
/*      */     //   91: ifeq -> 119
/*      */     //   94: aload #4
/*      */     //   96: invokeinterface first : ()Lli/cil/repack/org/luaj/vm2/LuaTable$StrongSlot;
/*      */     //   101: astore #5
/*      */     //   103: aload #5
/*      */     //   105: ifnull -> 116
/*      */     //   108: aload #5
/*      */     //   110: invokeinterface toVarargs : ()Lli/cil/repack/org/luaj/vm2/Varargs;
/*      */     //   115: areturn
/*      */     //   116: goto -> 132
/*      */     //   119: aload #4
/*      */     //   121: aload_1
/*      */     //   122: invokeinterface keyeq : (Lli/cil/repack/org/luaj/vm2/LuaValue;)Z
/*      */     //   127: ifeq -> 132
/*      */     //   130: iconst_1
/*      */     //   131: istore_3
/*      */     //   132: aload #4
/*      */     //   134: invokeinterface rest : ()Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   139: astore #4
/*      */     //   141: goto -> 85
/*      */     //   144: iload_3
/*      */     //   145: ifne -> 172
/*      */     //   148: new java/lang/StringBuilder
/*      */     //   151: dup
/*      */     //   152: invokespecial <init> : ()V
/*      */     //   155: ldc_w 'invalid key to 'next' 2: '
/*      */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   161: aload_1
/*      */     //   162: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   165: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   168: invokestatic error : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   171: pop
/*      */     //   172: iload_2
/*      */     //   173: iconst_1
/*      */     //   174: aload_0
/*      */     //   175: getfield array : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   178: arraylength
/*      */     //   179: iadd
/*      */     //   180: iadd
/*      */     //   181: istore_2
/*      */     //   182: iload_2
/*      */     //   183: aload_0
/*      */     //   184: getfield array : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   187: arraylength
/*      */     //   188: if_icmpge -> 252
/*      */     //   191: aload_0
/*      */     //   192: getfield array : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   195: iload_2
/*      */     //   196: aaload
/*      */     //   197: ifnull -> 246
/*      */     //   200: aload_0
/*      */     //   201: getfield m_metatable : Lli/cil/repack/org/luaj/vm2/Metatable;
/*      */     //   204: ifnonnull -> 216
/*      */     //   207: aload_0
/*      */     //   208: getfield array : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   211: iload_2
/*      */     //   212: aaload
/*      */     //   213: goto -> 230
/*      */     //   216: aload_0
/*      */     //   217: getfield m_metatable : Lli/cil/repack/org/luaj/vm2/Metatable;
/*      */     //   220: aload_0
/*      */     //   221: getfield array : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   224: iload_2
/*      */     //   225: invokeinterface arrayget : ([Lli/cil/repack/org/luaj/vm2/LuaValue;I)Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   230: astore_3
/*      */     //   231: aload_3
/*      */     //   232: ifnull -> 246
/*      */     //   235: iload_2
/*      */     //   236: iconst_1
/*      */     //   237: iadd
/*      */     //   238: invokestatic valueOf : (I)Lli/cil/repack/org/luaj/vm2/LuaInteger;
/*      */     //   241: aload_3
/*      */     //   242: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*      */     //   245: areturn
/*      */     //   246: iinc #2, 1
/*      */     //   249: goto -> 182
/*      */     //   252: iload_2
/*      */     //   253: aload_0
/*      */     //   254: getfield array : [Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   257: arraylength
/*      */     //   258: isub
/*      */     //   259: istore_2
/*      */     //   260: iload_2
/*      */     //   261: aload_0
/*      */     //   262: getfield hash : [Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   265: arraylength
/*      */     //   266: if_icmpge -> 317
/*      */     //   269: aload_0
/*      */     //   270: getfield hash : [Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   273: iload_2
/*      */     //   274: aaload
/*      */     //   275: astore_3
/*      */     //   276: aload_3
/*      */     //   277: ifnull -> 311
/*      */     //   280: aload_3
/*      */     //   281: invokeinterface first : ()Lli/cil/repack/org/luaj/vm2/LuaTable$StrongSlot;
/*      */     //   286: astore #4
/*      */     //   288: aload #4
/*      */     //   290: ifnull -> 301
/*      */     //   293: aload #4
/*      */     //   295: invokeinterface toVarargs : ()Lli/cil/repack/org/luaj/vm2/Varargs;
/*      */     //   300: areturn
/*      */     //   301: aload_3
/*      */     //   302: invokeinterface rest : ()Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   307: astore_3
/*      */     //   308: goto -> 276
/*      */     //   311: iinc #2, 1
/*      */     //   314: goto -> 260
/*      */     //   317: getstatic li/cil/repack/org/luaj/vm2/LuaTable.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   320: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #420	-> 0
/*      */     //   #423	-> 2
/*      */     //   #424	-> 9
/*      */     //   #425	-> 16
/*      */     //   #426	-> 21
/*      */     //   #427	-> 34
/*      */     //   #430	-> 37
/*      */     //   #431	-> 45
/*      */     //   #432	-> 69
/*      */     //   #433	-> 75
/*      */     //   #434	-> 77
/*      */     //   #435	-> 90
/*      */     //   #436	-> 94
/*      */     //   #437	-> 103
/*      */     //   #438	-> 108
/*      */     //   #440	-> 116
/*      */     //   #441	-> 130
/*      */     //   #434	-> 132
/*      */     //   #444	-> 144
/*      */     //   #445	-> 148
/*      */     //   #447	-> 172
/*      */     //   #452	-> 182
/*      */     //   #453	-> 191
/*      */     //   #454	-> 200
/*      */     //   #455	-> 231
/*      */     //   #456	-> 235
/*      */     //   #452	-> 246
/*      */     //   #462	-> 252
/*      */     //   #463	-> 269
/*      */     //   #464	-> 276
/*      */     //   #465	-> 280
/*      */     //   #466	-> 288
/*      */     //   #467	-> 293
/*      */     //   #468	-> 301
/*      */     //   #469	-> 308
/*      */     //   #462	-> 311
/*      */     //   #473	-> 317
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   103	13	5	nextEntry	Lli/cil/repack/org/luaj/vm2/LuaTable$StrongSlot;
/*      */     //   85	59	4	slot	Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   77	105	3	found	Z
/*      */     //   231	15	3	value	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   288	20	4	first	Lli/cil/repack/org/luaj/vm2/LuaTable$StrongSlot;
/*      */     //   276	35	3	slot	Lli/cil/repack/org/luaj/vm2/LuaTable$Slot;
/*      */     //   0	321	0	this	Lli/cil/repack/org/luaj/vm2/LuaTable;
/*      */     //   0	321	1	key	Lli/cil/repack/org/luaj/vm2/LuaValue;
/*      */     //   2	319	2	i	I
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
/*      */   public Varargs inext(LuaValue key) {
/*  484 */     int k = key.checkint() + 1;
/*  485 */     LuaValue v = rawget(k);
/*  486 */     return v.isnil() ? NONE : varargsOf(LuaInteger.valueOf(k), v);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void hashset(LuaValue key, LuaValue value) {
/*  496 */     if (value.isnil()) {
/*  497 */       hashRemove(key);
/*      */     } else {
/*  499 */       int index = 0;
/*  500 */       if (this.hash.length > 0) {
/*  501 */         index = hashSlot(key);
/*  502 */         for (Slot slot = this.hash[index]; slot != null; slot = slot.rest()) {
/*      */           StrongSlot foundSlot;
/*  504 */           if ((foundSlot = slot.find(key)) != null) {
/*  505 */             this.hash[index] = this.hash[index].set(foundSlot, value);
/*      */             return;
/*      */           } 
/*      */         } 
/*      */       } 
/*  510 */       if (checkLoadFactor()) {
/*  511 */         if ((this.m_metatable == null || !this.m_metatable.useWeakValues()) && key.isinttype() && key.toint() > 0) {
/*      */           
/*  513 */           rehash(key.toint());
/*  514 */           if (arrayset(key.toint(), value))
/*      */             return; 
/*      */         } else {
/*  517 */           rehash(-1);
/*      */         } 
/*  519 */         index = hashSlot(key);
/*      */       } 
/*  521 */       Slot entry = (this.m_metatable != null) ? this.m_metatable.entry(key, value) : defaultEntry(key, value);
/*  522 */       this.hash[index] = (this.hash[index] != null) ? this.hash[index].add(entry) : entry;
/*  523 */       this.hashEntries++;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static int hashpow2(int hashCode, int mask) {
/*  528 */     return hashCode & mask;
/*      */   }
/*      */   
/*      */   public static int hashmod(int hashCode, int mask) {
/*  532 */     return (hashCode & Integer.MAX_VALUE) % mask;
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
/*      */   public static int hashSlot(LuaValue key, int hashMask) {
/*  544 */     switch (key.type()) {
/*      */       case 2:
/*      */       case 3:
/*      */       case 5:
/*      */       case 7:
/*      */       case 8:
/*  550 */         return hashmod(key.hashCode(), hashMask);
/*      */     } 
/*  552 */     return hashpow2(key.hashCode(), hashMask);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int hashSlot(LuaValue key) {
/*  563 */     return hashSlot(key, this.hash.length - 1);
/*      */   }
/*      */   
/*      */   private void hashRemove(LuaValue key) {
/*  567 */     if (this.hash.length > 0) {
/*  568 */       int index = hashSlot(key);
/*  569 */       for (Slot slot = this.hash[index]; slot != null; slot = slot.rest()) {
/*      */         StrongSlot foundSlot;
/*  571 */         if ((foundSlot = slot.find(key)) != null) {
/*  572 */           this.hash[index] = this.hash[index].remove(foundSlot);
/*  573 */           this.hashEntries--;
/*      */           return;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean checkLoadFactor() {
/*  581 */     return (this.hashEntries >= this.hash.length);
/*      */   }
/*      */   
/*      */   private int countHashKeys() {
/*  585 */     int keys = 0;
/*  586 */     for (Slot element : this.hash) {
/*  587 */       for (Slot slot = element; slot != null; slot = slot.rest()) {
/*  588 */         if (slot.first() != null)
/*  589 */           keys++; 
/*      */       } 
/*      */     } 
/*  592 */     return keys;
/*      */   }
/*      */   
/*      */   private void dropWeakArrayValues() {
/*  596 */     for (int i = 0; i < this.array.length; i++) {
/*  597 */       this.m_metatable.arrayget(this.array, i);
/*      */     }
/*      */   }
/*      */   
/*      */   private int countIntKeys(int[] nums) {
/*  602 */     int total = 0;
/*  603 */     int i = 1;
/*      */ 
/*      */     
/*  606 */     for (int bit = 0; bit < 31 && 
/*  607 */       i <= this.array.length; bit++) {
/*      */       
/*  609 */       int j = Math.min(this.array.length, 1 << bit);
/*  610 */       int c = 0;
/*  611 */       while (i <= j) {
/*  612 */         if (this.array[i++ - 1] != null)
/*  613 */           c++; 
/*      */       } 
/*  615 */       nums[bit] = c;
/*  616 */       total += c;
/*      */     } 
/*      */ 
/*      */     
/*  620 */     for (i = 0; i < this.hash.length; i++) {
/*  621 */       for (Slot s = this.hash[i]; s != null; s = s.rest()) {
/*      */         int k;
/*  623 */         if ((k = s.arraykey(2147483647)) > 0) {
/*  624 */           nums[log2(k)] = nums[log2(k)] + 1;
/*  625 */           total++;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  630 */     return total;
/*      */   }
/*      */ 
/*      */   
/*      */   static int log2(int x) {
/*  635 */     int lg = 0;
/*  636 */     x--;
/*  637 */     if (x < 0)
/*      */     {
/*  639 */       return Integer.MIN_VALUE; } 
/*  640 */     if ((x & 0xFFFF0000) != 0) {
/*  641 */       lg = 16;
/*  642 */       x >>>= 16;
/*      */     } 
/*  644 */     if ((x & 0xFF00) != 0) {
/*  645 */       lg += 8;
/*  646 */       x >>>= 8;
/*      */     } 
/*  648 */     if ((x & 0xF0) != 0) {
/*  649 */       lg += 4;
/*  650 */       x >>>= 4;
/*      */     } 
/*  652 */     switch (x) {
/*      */       case 0:
/*  654 */         return 0;
/*      */       case 1:
/*  656 */         lg++;
/*      */         break;
/*      */       case 2:
/*  659 */         lg += 2;
/*      */         break;
/*      */       case 3:
/*  662 */         lg += 2;
/*      */         break;
/*      */       case 4:
/*  665 */         lg += 3;
/*      */         break;
/*      */       case 5:
/*  668 */         lg += 3;
/*      */         break;
/*      */       case 6:
/*  671 */         lg += 3;
/*      */         break;
/*      */       case 7:
/*  674 */         lg += 3;
/*      */         break;
/*      */       case 8:
/*  677 */         lg += 4;
/*      */         break;
/*      */       case 9:
/*  680 */         lg += 4;
/*      */         break;
/*      */       case 10:
/*  683 */         lg += 4;
/*      */         break;
/*      */       case 11:
/*  686 */         lg += 4;
/*      */         break;
/*      */       case 12:
/*  689 */         lg += 4;
/*      */         break;
/*      */       case 13:
/*  692 */         lg += 4;
/*      */         break;
/*      */       case 14:
/*  695 */         lg += 4;
/*      */         break;
/*      */       case 15:
/*  698 */         lg += 4;
/*      */         break;
/*      */     } 
/*  701 */     return lg;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void rehash(int newKey) {
/*      */     LuaValue[] newArray;
/*      */     Slot[] newHash;
/*      */     int newHashMask;
/*  710 */     if (this.m_metatable != null && (this.m_metatable.useWeakKeys() || this.m_metatable.useWeakValues())) {
/*      */       
/*  712 */       this.hashEntries = countHashKeys();
/*  713 */       if (this.m_metatable.useWeakValues()) {
/*  714 */         dropWeakArrayValues();
/*      */       }
/*      */     } 
/*  717 */     int[] nums = new int[32];
/*  718 */     int total = countIntKeys(nums);
/*  719 */     if (newKey > 0) {
/*  720 */       total++;
/*  721 */       nums[log2(newKey)] = nums[log2(newKey)] + 1;
/*      */     } 
/*      */ 
/*      */     
/*  725 */     int keys = nums[0];
/*  726 */     int newArraySize = 0;
/*  727 */     for (int log = 1; log < 32; log++) {
/*  728 */       keys += nums[log];
/*  729 */       if (total * 2 < 1 << log) {
/*      */         break;
/*      */       }
/*  732 */       if (keys >= 1 << log - 1) {
/*  733 */         newArraySize = 1 << log;
/*      */       }
/*      */     } 
/*      */     
/*  737 */     LuaValue[] oldArray = this.array;
/*  738 */     Slot[] oldHash = this.hash;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  743 */     int movingToArray = 0;
/*  744 */     if (newKey > 0 && newKey <= newArraySize) {
/*  745 */       movingToArray--;
/*      */     }
/*  747 */     if (newArraySize != oldArray.length) {
/*  748 */       newArray = new LuaValue[newArraySize];
/*  749 */       if (newArraySize > oldArray.length) {
/*  750 */         for (int k = log2(oldArray.length + 1), j = log2(newArraySize) + 1; k < j; k++) {
/*  751 */           movingToArray += nums[k];
/*      */         }
/*  753 */       } else if (oldArray.length > newArraySize) {
/*  754 */         for (int k = log2(newArraySize + 1), j = log2(oldArray.length) + 1; k < j; k++) {
/*  755 */           movingToArray -= nums[k];
/*      */         }
/*      */       } 
/*  758 */       System.arraycopy(oldArray, 0, newArray, 0, Math.min(oldArray.length, newArraySize));
/*      */     } else {
/*  760 */       newArray = this.array;
/*      */     } 
/*      */     
/*  763 */     int newHashSize = this.hashEntries - movingToArray + ((newKey < 0 || newKey > newArraySize) ? 1 : 0);
/*  764 */     int oldCapacity = oldHash.length;
/*      */ 
/*      */ 
/*      */     
/*  768 */     if (newHashSize > 0) {
/*      */       
/*  770 */       int newCapacity = (newHashSize < 2) ? 2 : (1 << log2(newHashSize));
/*  771 */       newHashMask = newCapacity - 1;
/*  772 */       newHash = new Slot[newCapacity];
/*      */     } else {
/*  774 */       int newCapacity = 0;
/*  775 */       newHashMask = 0;
/*  776 */       newHash = NOBUCKETS;
/*      */     } 
/*      */     
/*      */     int i;
/*  780 */     for (i = 0; i < oldCapacity; i++) {
/*  781 */       for (Slot slot = oldHash[i]; slot != null; slot = slot.rest()) {
/*      */         int k;
/*  783 */         if ((k = slot.arraykey(newArraySize)) > 0) {
/*  784 */           StrongSlot entry = slot.first();
/*  785 */           if (entry != null)
/*  786 */             newArray[k - 1] = entry.value(); 
/*  787 */         } else if (!(slot instanceof DeadSlot)) {
/*  788 */           int j = slot.keyindex(newHashMask);
/*  789 */           newHash[j] = slot.relink(newHash[j]);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  795 */     for (i = newArraySize; i < oldArray.length;) {
/*      */       
/*  797 */       if ((v = oldArray[i++]) != null) {
/*  798 */         Slot newEntry; int slot = hashmod(LuaInteger.hashCode(i), newHashMask);
/*      */         
/*  800 */         if (this.m_metatable != null) {
/*  801 */           newEntry = this.m_metatable.entry(valueOf(i), v);
/*  802 */           if (newEntry == null)
/*      */             continue; 
/*      */         } else {
/*  805 */           newEntry = defaultEntry(valueOf(i), v);
/*      */         } 
/*  807 */         newHash[slot] = (newHash[slot] != null) ? newHash[slot].add(newEntry) : newEntry;
/*      */       } 
/*      */     } 
/*      */     
/*  811 */     this.hash = newHash;
/*  812 */     this.array = newArray;
/*  813 */     this.hashEntries -= movingToArray;
/*      */   }
/*      */ 
/*      */   
/*      */   public Slot entry(LuaValue key, LuaValue value) {
/*  818 */     return defaultEntry(key, value);
/*      */   }
/*      */   
/*      */   protected static boolean isLargeKey(LuaValue key) {
/*  822 */     switch (key.type()) {
/*      */       case 4:
/*  824 */         return (key.rawlen() > 32);
/*      */       case 1:
/*      */       case 3:
/*  827 */         return false;
/*      */     } 
/*  829 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   protected static Entry defaultEntry(LuaValue key, LuaValue value) {
/*  834 */     if (key.isinttype())
/*  835 */       return new IntKeyEntry(key.toint(), value); 
/*  836 */     if (value.type() == 3) {
/*  837 */       return new NumberValueEntry(key, value.todouble());
/*      */     }
/*  839 */     return new NormalEntry(key, value);
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
/*      */   public void sort(LuaValue comparator) {
/*  855 */     if (len().tolong() >= 2147483647L)
/*  856 */       throw new LuaError("array too big: " + len().tolong()); 
/*  857 */     if (this.m_metatable != null && this.m_metatable.useWeakValues()) {
/*  858 */       dropWeakArrayValues();
/*      */     }
/*  860 */     int n = length();
/*  861 */     if (n > 1)
/*  862 */       heapSort(n, comparator.isnil() ? null : comparator); 
/*      */   }
/*      */   
/*      */   private void heapSort(int count, LuaValue cmpfunc) {
/*  866 */     heapify(count, cmpfunc);
/*  867 */     for (int end = count; end > 1; ) {
/*  868 */       LuaValue a = get(end);
/*  869 */       set(end, get(1));
/*  870 */       set(1, a);
/*  871 */       siftDown(1, --end, cmpfunc);
/*      */     } 
/*      */   }
/*      */   
/*      */   private void heapify(int count, LuaValue cmpfunc) {
/*  876 */     for (int start = count / 2; start > 0; start--)
/*  877 */       siftDown(start, count, cmpfunc); 
/*      */   }
/*      */   
/*      */   private void siftDown(int start, int end, LuaValue cmpfunc) {
/*  881 */     for (int root = start; root * 2 <= end; ) {
/*  882 */       int child = root * 2;
/*  883 */       if (child < end && compare(child, child + 1, cmpfunc))
/*  884 */         child++; 
/*  885 */       if (compare(root, child, cmpfunc)) {
/*  886 */         LuaValue a = get(root);
/*  887 */         set(root, get(child));
/*  888 */         set(child, a);
/*  889 */         root = child;
/*      */         continue;
/*      */       } 
/*      */       return;
/*      */     } 
/*      */   }
/*      */   private boolean compare(int i, int j, LuaValue cmpfunc) {
/*  896 */     LuaValue a = get(i), b = get(j);
/*  897 */     if (a == null || b == null)
/*  898 */       return false; 
/*  899 */     if (cmpfunc != null) {
/*  900 */       return cmpfunc.call(a, b).toboolean();
/*      */     }
/*  902 */     return a.lt_b(b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int keyCount() {
/*  913 */     LuaValue k = LuaValue.NIL;
/*  914 */     for (int i = 0;; i++) {
/*  915 */       Varargs n = next(k);
/*  916 */       if ((k = n.arg1()).isnil()) {
/*  917 */         return i;
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaValue[] keys() {
/*  928 */     Vector<LuaValue> l = new Vector();
/*  929 */     LuaValue k = LuaValue.NIL;
/*      */     
/*  931 */     Varargs n = next(k);
/*  932 */     while (!(k = n.arg1()).isnil())
/*      */     {
/*  934 */       l.addElement(k);
/*      */     }
/*  936 */     LuaValue[] a = new LuaValue[l.size()];
/*  937 */     l.copyInto((Object[])a);
/*  938 */     return a;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue eq(LuaValue val) {
/*  943 */     return eq_b(val) ? TRUE : FALSE;
/*      */   }
/*      */   
/*      */   public boolean eq_b(LuaValue val) {
/*  947 */     if (this == val)
/*  948 */       return true; 
/*  949 */     if (this.m_metatable == null || !val.istable())
/*  950 */       return false; 
/*  951 */     LuaValue valmt = val.getmetatable();
/*  952 */     return (valmt != null && LuaValue.eqmtcall(this, this.m_metatable.toLuaValue(), val, valmt));
/*      */   }
/*      */ 
/*      */   
/*      */   public Varargs unpack() {
/*  957 */     return unpack(1, rawlen());
/*      */   }
/*      */ 
/*      */   
/*      */   public Varargs unpack(int i) {
/*  962 */     return unpack(i, rawlen());
/*      */   }
/*      */ 
/*      */   
/*      */   public Varargs unpack(int i, int j) {
/*  967 */     if (j < i)
/*  968 */       return NONE; 
/*  969 */     int count = j - i;
/*  970 */     if (count < 0)
/*  971 */       throw new LuaError("too many results to unpack: greater 2147483647"); 
/*  972 */     int max = 16777215;
/*  973 */     if (count >= max)
/*  974 */       throw new LuaError("too many results to unpack: " + count + " (max is " + max + ')'); 
/*  975 */     int n = j + 1 - i;
/*  976 */     switch (n) {
/*      */       case 0:
/*  978 */         return NONE;
/*      */       case 1:
/*  980 */         return get(i);
/*      */       case 2:
/*  982 */         return varargsOf(get(i), get(i + 1));
/*      */     } 
/*  984 */     if (n < 0)
/*  985 */       return NONE; 
/*      */     try {
/*  987 */       LuaValue[] v = new LuaValue[n];
/*  988 */       while (--n >= 0)
/*  989 */         v[n] = get(i + n); 
/*  990 */       return varargsOf(v);
/*  991 */     } catch (OutOfMemoryError e) {
/*  992 */       throw new LuaError("too many results to unpack [out of memory]: " + n);
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
/*      */   private static class LinkSlot
/*      */     implements StrongSlot
/*      */   {
/*      */     private LuaTable.Entry entry;
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
/*      */     private LuaTable.Slot next;
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
/*      */     LinkSlot(LuaTable.Entry entry, LuaTable.Slot next) {
/* 1070 */       this.entry = entry;
/* 1071 */       this.next = next;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue key() {
/* 1076 */       return this.entry.key();
/*      */     }
/*      */ 
/*      */     
/*      */     public int keyindex(int hashMask) {
/* 1081 */       return this.entry.keyindex(hashMask);
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue value() {
/* 1086 */       return this.entry.value();
/*      */     }
/*      */ 
/*      */     
/*      */     public Varargs toVarargs() {
/* 1091 */       return this.entry.toVarargs();
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.StrongSlot first() {
/* 1096 */       return this.entry;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.StrongSlot find(LuaValue key) {
/* 1101 */       return this.entry.keyeq(key) ? this : null;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean keyeq(LuaValue key) {
/* 1106 */       return this.entry.keyeq(key);
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot rest() {
/* 1111 */       return this.next;
/*      */     }
/*      */ 
/*      */     
/*      */     public int arraykey(int max) {
/* 1116 */       return this.entry.arraykey(max);
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot set(LuaTable.StrongSlot target, LuaValue value) {
/* 1121 */       if (target == this) {
/* 1122 */         this.entry = this.entry.set(value);
/* 1123 */         return this;
/*      */       } 
/* 1125 */       return setnext(this.next.set(target, value));
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public LuaTable.Slot add(LuaTable.Slot entry) {
/* 1131 */       return setnext(this.next.add(entry));
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot remove(LuaTable.StrongSlot target) {
/* 1136 */       if (this == target) {
/* 1137 */         return new LuaTable.DeadSlot(key(), this.next);
/*      */       }
/* 1139 */       this.next = this.next.remove(target);
/*      */       
/* 1141 */       return this;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public LuaTable.Slot relink(LuaTable.Slot rest) {
/* 1147 */       return (rest != null) ? new LinkSlot(this.entry, rest) : this.entry;
/*      */     }
/*      */ 
/*      */     
/*      */     private LuaTable.Slot setnext(LuaTable.Slot next) {
/* 1152 */       if (next != null) {
/* 1153 */         this.next = next;
/* 1154 */         return this;
/*      */       } 
/* 1156 */       return this.entry;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1162 */       return this.entry + "; " + this.next;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   static abstract class Entry
/*      */     extends Varargs
/*      */     implements StrongSlot
/*      */   {
/*      */     public abstract LuaValue key();
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract LuaValue value();
/*      */ 
/*      */ 
/*      */     
/*      */     abstract Entry set(LuaValue param1LuaValue);
/*      */ 
/*      */     
/*      */     public abstract boolean keyeq(LuaValue param1LuaValue);
/*      */ 
/*      */     
/*      */     public abstract int keyindex(int param1Int);
/*      */ 
/*      */     
/*      */     public int arraykey(int max) {
/* 1190 */       return 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue arg(int i) {
/* 1195 */       switch (i) {
/*      */         case 1:
/* 1197 */           return key();
/*      */         case 2:
/* 1199 */           return value();
/*      */       } 
/* 1201 */       return LuaValue.NIL;
/*      */     }
/*      */ 
/*      */     
/*      */     public int narg() {
/* 1206 */       return 2;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Varargs toVarargs() {
/* 1214 */       return LuaValue.varargsOf(key(), value());
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue arg1() {
/* 1219 */       return key();
/*      */     }
/*      */ 
/*      */     
/*      */     public Varargs subargs(int start) {
/* 1224 */       switch (start) {
/*      */         case 1:
/* 1226 */           return this;
/*      */         case 2:
/* 1228 */           return value();
/*      */       } 
/* 1230 */       return LuaValue.NONE;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.StrongSlot first() {
/* 1235 */       return this;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot rest() {
/* 1240 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.StrongSlot find(LuaValue key) {
/* 1245 */       return keyeq(key) ? this : null;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot set(LuaTable.StrongSlot target, LuaValue value) {
/* 1250 */       return set(value);
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot add(LuaTable.Slot entry) {
/* 1255 */       return new LuaTable.LinkSlot(this, entry);
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot remove(LuaTable.StrongSlot target) {
/* 1260 */       return new LuaTable.DeadSlot(key(), null);
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot relink(LuaTable.Slot rest) {
/* 1265 */       return (rest != null) ? new LuaTable.LinkSlot(this, rest) : this;
/*      */     }
/*      */   }
/*      */   
/*      */   static class NormalEntry extends Entry {
/*      */     private final LuaValue key;
/*      */     private LuaValue value;
/*      */     
/*      */     NormalEntry(LuaValue key, LuaValue value) {
/* 1274 */       this.key = key;
/* 1275 */       this.value = value;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue key() {
/* 1280 */       return this.key;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue value() {
/* 1285 */       return this.value;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Entry set(LuaValue value) {
/* 1290 */       this.value = value;
/* 1291 */       return this;
/*      */     }
/*      */ 
/*      */     
/*      */     public Varargs toVarargs() {
/* 1296 */       return this;
/*      */     }
/*      */ 
/*      */     
/*      */     public int keyindex(int hashMask) {
/* 1301 */       return LuaTable.hashSlot(this.key, hashMask);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean keyeq(LuaValue key) {
/* 1306 */       return key.raweq(this.key);
/*      */     }
/*      */   }
/*      */   
/*      */   private static class IntKeyEntry extends Entry {
/*      */     private final int key;
/*      */     private LuaValue value;
/*      */     
/*      */     IntKeyEntry(int key, LuaValue value) {
/* 1315 */       this.key = key;
/* 1316 */       this.value = value;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue key() {
/* 1321 */       return LuaValue.valueOf(this.key);
/*      */     }
/*      */ 
/*      */     
/*      */     public int arraykey(int max) {
/* 1326 */       return (this.key >= 1 && this.key <= max) ? this.key : 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue value() {
/* 1331 */       return this.value;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Entry set(LuaValue value) {
/* 1336 */       this.value = value;
/* 1337 */       return this;
/*      */     }
/*      */ 
/*      */     
/*      */     public int keyindex(int mask) {
/* 1342 */       return LuaTable.hashmod(LuaInteger.hashCode(this.key), mask);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean keyeq(LuaValue key) {
/* 1347 */       return key.raweq(this.key);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class NumberValueEntry
/*      */     extends Entry
/*      */   {
/*      */     private double value;
/*      */     
/*      */     private final LuaValue key;
/*      */     
/*      */     NumberValueEntry(LuaValue key, double value) {
/* 1360 */       this.key = key;
/* 1361 */       this.value = value;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue key() {
/* 1366 */       return this.key;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaValue value() {
/* 1371 */       return LuaValue.valueOf(this.value);
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Entry set(LuaValue value) {
/* 1376 */       if (value.type() == 3) {
/* 1377 */         LuaValue n = value.tonumber();
/* 1378 */         if (!n.isnil()) {
/* 1379 */           this.value = n.todouble();
/* 1380 */           return this;
/*      */         } 
/*      */       } 
/* 1383 */       return new LuaTable.NormalEntry(this.key, value);
/*      */     }
/*      */ 
/*      */     
/*      */     public int keyindex(int mask) {
/* 1388 */       return LuaTable.hashSlot(this.key, mask);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean keyeq(LuaValue key) {
/* 1393 */       return key.raweq(this.key);
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private static class DeadSlot
/*      */     implements Slot
/*      */   {
/*      */     private final Object key;
/*      */     
/*      */     private LuaTable.Slot next;
/*      */ 
/*      */     
/*      */     private DeadSlot(LuaValue key, LuaTable.Slot next) {
/* 1407 */       this.key = LuaTable.isLargeKey(key) ? new WeakReference<>(key) : key;
/* 1408 */       this.next = next;
/*      */     }
/*      */     
/*      */     private LuaValue key() {
/* 1412 */       return (this.key instanceof WeakReference) ? ((WeakReference<LuaValue>)this.key).get() : (LuaValue)this.key;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int keyindex(int hashMask) {
/* 1418 */       return 0;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.StrongSlot first() {
/* 1423 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.StrongSlot find(LuaValue key) {
/* 1428 */       return null;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean keyeq(LuaValue key) {
/* 1433 */       LuaValue k = key();
/* 1434 */       return (k != null && key.raweq(k));
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot rest() {
/* 1439 */       return this.next;
/*      */     }
/*      */ 
/*      */     
/*      */     public int arraykey(int max) {
/* 1444 */       return -1;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot set(LuaTable.StrongSlot target, LuaValue value) {
/* 1449 */       LuaTable.Slot next = (this.next != null) ? this.next.set(target, value) : null;
/* 1450 */       if (key() != null) {
/*      */ 
/*      */         
/* 1453 */         this.next = next;
/* 1454 */         return this;
/*      */       } 
/* 1456 */       return next;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public LuaTable.Slot add(LuaTable.Slot newEntry) {
/* 1462 */       return (this.next != null) ? this.next.add(newEntry) : newEntry;
/*      */     }
/*      */ 
/*      */     
/*      */     public LuaTable.Slot remove(LuaTable.StrongSlot target) {
/* 1467 */       if (key() != null) {
/* 1468 */         this.next = this.next.remove(target);
/* 1469 */         return this;
/*      */       } 
/* 1471 */       return this.next;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public LuaTable.Slot relink(LuaTable.Slot rest) {
/* 1477 */       return rest;
/*      */     }
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1482 */       StringBuffer buf = new StringBuffer();
/* 1483 */       buf.append("<dead");
/* 1484 */       LuaValue k = key();
/* 1485 */       if (k != null) {
/* 1486 */         buf.append(": ");
/* 1487 */         buf.append(k.toString());
/*      */       } 
/* 1489 */       buf.append('>');
/* 1490 */       if (this.next != null) {
/* 1491 */         buf.append("; ");
/* 1492 */         buf.append(this.next.toString());
/*      */       } 
/* 1494 */       return buf.toString();
/*      */     }
/*      */   }
/*      */   
/* 1498 */   private static final Slot[] NOBUCKETS = new Slot[0];
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean useWeakKeys() {
/* 1504 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean useWeakValues() {
/* 1509 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue toLuaValue() {
/* 1514 */     return this;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue wrap(LuaValue value) {
/* 1519 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   public LuaValue arrayget(LuaValue[] array, int index) {
/* 1524 */     return array[index];
/*      */   }
/*      */   
/*      */   static interface Slot {
/*      */     int keyindex(int param1Int);
/*      */     
/*      */     LuaTable.StrongSlot first();
/*      */     
/*      */     LuaTable.StrongSlot find(LuaValue param1LuaValue);
/*      */     
/*      */     boolean keyeq(LuaValue param1LuaValue);
/*      */     
/*      */     Slot rest();
/*      */     
/*      */     int arraykey(int param1Int);
/*      */     
/*      */     Slot set(LuaTable.StrongSlot param1StrongSlot, LuaValue param1LuaValue);
/*      */     
/*      */     Slot add(Slot param1Slot);
/*      */     
/*      */     Slot remove(LuaTable.StrongSlot param1StrongSlot);
/*      */     
/*      */     Slot relink(Slot param1Slot);
/*      */   }
/*      */   
/*      */   static interface StrongSlot extends Slot {
/*      */     LuaValue key();
/*      */     
/*      */     LuaValue value();
/*      */     
/*      */     Varargs toVarargs();
/*      */   }
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaTable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */