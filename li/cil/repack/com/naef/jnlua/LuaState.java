/*      */ package li.cil.repack.com.naef.jnlua;
/*      */ 
/*      */ import java.io.ByteArrayInputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.lang.ref.PhantomReference;
/*      */ import java.lang.ref.ReferenceQueue;
/*      */ import java.lang.reflect.InvocationHandler;
/*      */ import java.lang.reflect.Method;
/*      */ import java.lang.reflect.Proxy;
/*      */ import java.nio.charset.StandardCharsets;
/*      */ import java.util.HashSet;
/*      */ import java.util.Locale;
/*      */ import java.util.Set;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class LuaState
/*      */ {
/*      */   public static final int MULTRET = -1;
/*      */   protected final int REGISTRYINDEX;
/*      */   public static final int OK = 0;
/*      */   public static final int YIELD = 1;
/*      */   public static final int RIDX_MAINTHREAD = 1;
/*      */   public static final int RIDX_GLOBALS = 2;
/*      */   public static final String VERSION = "1.1";
/*      */   protected final String LUA_VERSION;
/*      */   protected final int LUA_VERSION_NUM;
/*      */   protected final int INTEGERWIDTH;
/*      */   protected final int POINTERWIDTH;
/*      */   private static final int APIVERSION = 4;
/*      */   private boolean ownState;
/*      */   private long luaState;
/*      */   private long luaThread;
/*      */   private boolean yield;
/*      */   private int luaMemoryTotal;
/*      */   private int luaMemoryUsed;
/*      */   private Object finalizeGuardian;
/*      */   private ClassLoader classLoader;
/*      */   private JavaReflector javaReflector;
/*      */   private Converter converter;
/*      */   
/*      */   protected int arith_operator_id(ArithOperator o) {
/*  142 */     switch (o) { case USERDATA:
/*  143 */         return 0;
/*  144 */       case null: return 1;
/*  145 */       case null: return 2;
/*  146 */       case null: return 3;
/*  147 */       case null: return 4;
/*  148 */       case null: return 5;
/*  149 */       case null: return 6; }
/*  150 */      return -1;
/*      */   }
/*      */ 
/*      */   
/*      */   protected int gc_action_id(GcAction o) {
/*  155 */     switch (o) { case USERDATA:
/*  156 */         return 0;
/*  157 */       case null: return 1;
/*  158 */       case null: return 2;
/*  159 */       case null: return 3;
/*  160 */       case null: return 4;
/*  161 */       case null: return 5;
/*  162 */       case null: return 6;
/*  163 */       case null: return 7;
/*  164 */       case null: return 8;
/*  165 */       case null: return 9;
/*  166 */       case null: return 10;
/*  167 */       case null: return 11; }
/*  168 */      return -1;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  241 */   private Set<LuaValueProxyRef> proxySet = new HashSet<>();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  246 */   private ReferenceQueue<LuaValueProxyImpl> proxyQueue = new ReferenceQueue<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public LuaState() {
/*  263 */     this(0L, 0);
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
/*      */   public LuaState(int memory) {
/*  283 */     this(0L, validateMemory(memory));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private LuaState(long luaState, int memory) {
/*  290 */     this.REGISTRYINDEX = lua_registryindex();
/*  291 */     this.LUA_VERSION = lua_version();
/*  292 */     this.LUA_VERSION_NUM = lua_versionnum();
/*  293 */     this.INTEGERWIDTH = lua_integerwidth();
/*  294 */     this.POINTERWIDTH = lua_pointerwidth();
/*      */     
/*  296 */     this.ownState = (luaState == 0L);
/*  297 */     this.luaMemoryTotal = memory;
/*  298 */     lua_newstate(4, luaState);
/*  299 */     check();
/*      */ 
/*      */     
/*  302 */     this.finalizeGuardian = new Object()
/*      */       {
/*      */         public void finalize() {
/*  305 */           synchronized (LuaState.this) {
/*  306 */             LuaState.this.closeInternal();
/*      */           } 
/*      */         }
/*      */       };
/*      */ 
/*      */     
/*  312 */     for (int i = 0; i < (JavaReflector.Metamethod.values()).length; i++) {
/*      */       
/*  314 */       final JavaReflector.Metamethod metamethod = JavaReflector.Metamethod.values()[i];
/*  315 */       lua_pushjavafunction(new JavaFunction()
/*      */           {
/*      */             public int invoke(LuaState luaState) {
/*  318 */               JavaFunction javaFunction = LuaState.this.getMetamethod(luaState
/*  319 */                   .toJavaObjectRaw(1), metamethod);
/*  320 */               if (javaFunction != null) {
/*  321 */                 return javaFunction.invoke(LuaState.this);
/*      */               }
/*  323 */               throw new UnsupportedOperationException(metamethod
/*  324 */                   .getMetamethodName());
/*      */             }
/*      */           });
/*      */       
/*  328 */       lua_setfield(-2, metamethod.getMetamethodName());
/*      */     } 
/*  330 */     lua_pop(1);
/*      */ 
/*      */     
/*  333 */     this.classLoader = Thread.currentThread().getContextClassLoader();
/*  334 */     this.javaReflector = DefaultJavaReflector.getInstance();
/*  335 */     this.converter = DefaultConverter.getInstance();
/*      */   }
/*      */   
/*      */   public int getRegistryIndex() {
/*  339 */     return this.REGISTRYINDEX;
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
/*      */   public synchronized ClassLoader getClassLoader() {
/*  354 */     return this.classLoader;
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
/*      */   public synchronized void setClassLoader(ClassLoader classLoader) {
/*  369 */     if (classLoader == null) {
/*  370 */       throw new NullPointerException();
/*      */     }
/*  372 */     this.classLoader = classLoader;
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
/*      */   public synchronized JavaReflector getJavaReflector() {
/*  385 */     return this.javaReflector;
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
/*      */   public synchronized void setJavaReflector(JavaReflector javaReflector) {
/*  399 */     if (javaReflector == null) {
/*  400 */       throw new NullPointerException();
/*      */     }
/*  402 */     this.javaReflector = javaReflector;
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
/*      */   public synchronized JavaFunction getMetamethod(Object obj, JavaReflector.Metamethod metamethod) {
/*  423 */     if (obj != null && obj instanceof JavaReflector) {
/*      */       
/*  425 */       JavaFunction javaFunction = ((JavaReflector)obj).getMetamethod(metamethod);
/*  426 */       if (javaFunction != null) {
/*  427 */         return javaFunction;
/*      */       }
/*      */     } 
/*  430 */     return this.javaReflector.getMetamethod(metamethod);
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
/*      */   public synchronized Converter getConverter() {
/*  443 */     return this.converter;
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
/*      */   public synchronized void setConverter(Converter converter) {
/*  457 */     if (converter == null) {
/*  458 */       throw new NullPointerException();
/*      */     }
/*  460 */     this.converter = converter;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized int getTotalMemory() {
/*  471 */     return this.luaMemoryTotal;
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
/*      */   public synchronized void setTotalMemory(int value) {
/*  484 */     if (this.luaMemoryTotal < 1) {
/*  485 */       throw new IllegalStateException("cannot set maximum memory for this state");
/*      */     }
/*  487 */     this.luaMemoryTotal = validateMemory(value);
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
/*      */   public synchronized int getFreeMemory() {
/*  508 */     return Math.max(0, this.luaMemoryTotal - this.luaMemoryUsed);
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
/*      */   public final synchronized boolean isOpen() {
/*  522 */     return isOpenInternal();
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
/*      */   public synchronized void close() {
/*  534 */     closeInternal();
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
/*      */   public synchronized int gc(GcAction what, int data) {
/*  548 */     check();
/*  549 */     return lua_gc(gc_action_id(what), data);
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
/*      */   public synchronized void openLib(Library library) {
/*  561 */     check();
/*  562 */     library.open(this);
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
/*      */   public synchronized void openLibs() {
/*  575 */     check();
/*  576 */     for (Library library : Library.values()) {
/*  577 */       library.open(this);
/*  578 */       pop(1);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void register(NamedJavaFunction namedJavaFunction) {
/*  589 */     check();
/*  590 */     String name = namedJavaFunction.getName();
/*  591 */     if (name == null) {
/*  592 */       throw new IllegalArgumentException("anonymous function");
/*      */     }
/*  594 */     pushJavaFunction(namedJavaFunction);
/*  595 */     setGlobal(name);
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
/*      */   public synchronized void register(String moduleName, NamedJavaFunction[] namedJavaFunctions, boolean global) {
/*  612 */     check();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  618 */     newTable(0, namedJavaFunctions.length);
/*  619 */     for (int i = 0; i < namedJavaFunctions.length; i++) {
/*  620 */       String name = namedJavaFunctions[i].getName();
/*  621 */       if (name == null)
/*  622 */         throw new IllegalArgumentException(String.format("anonymous function at index %d", new Object[] {
/*  623 */                 Integer.valueOf(i)
/*      */               })); 
/*  625 */       pushJavaFunction(namedJavaFunctions[i]);
/*  626 */       setField(-2, name);
/*      */     } 
/*  628 */     lua_getsubtable(this.REGISTRYINDEX, "_LOADED");
/*  629 */     pushValue(-2);
/*  630 */     setField(-2, moduleName);
/*  631 */     pop(1);
/*  632 */     if (global) {
/*  633 */       rawGet(this.REGISTRYINDEX, 2);
/*  634 */       pushValue(-2);
/*  635 */       setField(-2, moduleName);
/*  636 */       pop(1);
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
/*      */   public synchronized void load(InputStream inputStream, String chunkName, String mode) throws IOException {
/*  658 */     check();
/*  659 */     lua_load(inputStream, chunkName, mode);
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
/*      */   public synchronized void load(String chunk, String chunkName) {
/*  672 */     check();
/*      */     try {
/*  674 */       load(new ByteArrayInputStream(chunk.getBytes("UTF-8")), chunkName, "t");
/*      */     }
/*  676 */     catch (IOException e) {
/*  677 */       throw new LuaMemoryAllocationException(e.getMessage(), e);
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
/*      */   public synchronized void dump(OutputStream outputStream) throws IOException {
/*  691 */     check();
/*  692 */     lua_dump(outputStream);
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
/*      */   public synchronized void call(int argCount, int returnCount) {
/*  711 */     check();
/*  712 */     lua_pcall(argCount, returnCount);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void getGlobal(String name) {
/*  723 */     check();
/*  724 */     lua_getglobal(name);
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
/*      */   public synchronized void setGlobal(String name) throws LuaMemoryAllocationException, LuaRuntimeException {
/*  736 */     check();
/*  737 */     lua_setglobal(name);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushBoolean(boolean b) {
/*  748 */     check();
/*  749 */     lua_pushboolean(b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushByteArray(byte[] b) {
/*  759 */     check();
/*  760 */     lua_pushbytearray(b);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushInteger(long n) {
/*  770 */     check();
/*  771 */     if (!areLongsSupported() && (n < -2147483648L || n > 2147483647L)) {
/*      */ 
/*      */       
/*  774 */       lua_pushnumber(n);
/*      */     } else {
/*  776 */       lua_pushinteger(n);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushJavaFunction(JavaFunction javaFunction) {
/*  787 */     check();
/*  788 */     lua_pushjavafunction(javaFunction);
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
/*      */   public synchronized void pushJavaObject(Object object) {
/*  801 */     check();
/*  802 */     getConverter().convertJavaObject(this, object);
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
/*      */   public synchronized void pushJavaObjectRaw(Object object) {
/*  825 */     check();
/*  826 */     lua_pushjavaobject(object);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushNil() {
/*  833 */     check();
/*  834 */     lua_pushnil();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushNumber(double n) {
/*  844 */     check();
/*  845 */     lua_pushnumber(n);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushString(String s) {
/*  855 */     check();
/*  856 */     lua_pushbytearray(s.getBytes(StandardCharsets.UTF_8));
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
/*      */   public synchronized boolean isBoolean(int index) {
/*  872 */     check();
/*  873 */     return lua_isboolean(index);
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
/*      */   public synchronized boolean isCFunction(int index) {
/*  888 */     check();
/*  889 */     return lua_iscfunction(index);
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
/*      */   public synchronized boolean isFunction(int index) {
/*  905 */     check();
/*  906 */     return lua_isfunction(index);
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
/*      */   public synchronized boolean isInteger(int index) {
/*  922 */     return false;
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
/*      */   public synchronized boolean isJavaFunction(int index) {
/*  938 */     check();
/*  939 */     return lua_isjavafunction(index);
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
/*      */   public synchronized boolean isJavaObject(int index, Class<?> type) {
/*  959 */     check();
/*  960 */     return (this.converter.getTypeDistance(this, index, type) != Integer.MAX_VALUE);
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
/*      */   public synchronized boolean isJavaObjectRaw(int index) {
/*  982 */     check();
/*  983 */     return lua_isjavaobject(index);
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
/*      */   public synchronized boolean isNil(int index) {
/*  999 */     check();
/* 1000 */     return lua_isnil(index);
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
/*      */   public synchronized boolean isNone(int index) {
/* 1015 */     check();
/* 1016 */     return lua_isnone(index);
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
/*      */   public synchronized boolean isNoneOrNil(int index) {
/* 1033 */     check();
/* 1034 */     return lua_isnoneornil(index);
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
/*      */   public synchronized boolean isNumber(int index) {
/* 1050 */     check();
/* 1051 */     return lua_isnumber(index);
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
/*      */   public synchronized boolean isString(int index) {
/* 1067 */     check();
/* 1068 */     return lua_isstring(index);
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
/*      */   public synchronized boolean isTable(int index) {
/* 1083 */     check();
/* 1084 */     return lua_istable(index);
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
/*      */   public synchronized boolean isThread(int index) {
/* 1099 */     check();
/* 1100 */     return lua_isthread(index);
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
/*      */   public synchronized boolean compare(int index1, int index2, RelOperator operator) {
/* 1124 */     check();
/* 1125 */     return (lua_compare(index1, index2, operator.ordinal()) != 0);
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
/*      */   public synchronized boolean equal(int index1, int index2) {
/* 1140 */     return compare(index1, index2, RelOperator.EQ);
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
/*      */   public synchronized int length(int index) {
/* 1153 */     return rawLen(index);
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
/*      */   public synchronized boolean lessThan(int index1, int index2) throws LuaMemoryAllocationException, LuaRuntimeException {
/* 1170 */     return compare(index1, index2, RelOperator.LT);
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
/*      */   public synchronized boolean rawEqual(int index1, int index2) {
/* 1189 */     check();
/* 1190 */     return (lua_rawequal(index1, index2) != 0);
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
/*      */   public synchronized int rawLen(int index) {
/* 1204 */     check();
/* 1205 */     return lua_rawlen(index);
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
/*      */   public synchronized boolean toBoolean(int index) {
/* 1219 */     check();
/* 1220 */     return lua_toboolean(index);
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
/*      */   public synchronized byte[] toByteArray(int index) {
/* 1234 */     check();
/* 1235 */     return lua_tobytearray(index);
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
/*      */   public synchronized long toInteger(int index) {
/* 1248 */     check();
/* 1249 */     return lua_tointeger(index);
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
/*      */   public synchronized Long toIntegerX(int index) {
/* 1263 */     check();
/* 1264 */     return lua_tointegerx(index);
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
/*      */   public synchronized JavaFunction toJavaFunction(int index) {
/* 1276 */     check();
/* 1277 */     return lua_tojavafunction(index);
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
/*      */   public synchronized <T> T toJavaObject(int index, Class<T> type) {
/* 1297 */     check();
/* 1298 */     return this.converter.convertLuaValue(this, index, type);
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
/*      */   public synchronized Object toJavaObjectRaw(int index) {
/* 1317 */     check();
/* 1318 */     return lua_tojavaobject(index);
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
/*      */   public synchronized double toNumber(int index) {
/* 1331 */     check();
/* 1332 */     return lua_tonumber(index);
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
/*      */   public synchronized Double toNumberX(int index) {
/* 1346 */     check();
/* 1347 */     return lua_tonumberx(index);
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
/*      */   public synchronized long toPointer(int index) {
/* 1362 */     check();
/* 1363 */     return lua_topointer(index);
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
/*      */   public synchronized String toString(int index) {
/* 1377 */     check();
/* 1378 */     return new String(lua_tobytearray(index), StandardCharsets.UTF_8);
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
/*      */   public synchronized LuaType type(int index) {
/* 1393 */     check();
/* 1394 */     int type = lua_type(index);
/* 1395 */     return (type >= 0) ? LuaType.values()[type] : null;
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
/*      */   public synchronized String typeName(int index) {
/* 1415 */     check();
/* 1416 */     LuaType type = type(index);
/* 1417 */     if (type == null) {
/* 1418 */       return "none";
/*      */     }
/* 1420 */     switch (type) {
/*      */       case USERDATA:
/* 1422 */         if (isJavaObjectRaw(index)) {
/* 1423 */           Class<?> clazz; Object object = toJavaObjectRaw(index);
/*      */           
/* 1425 */           if (object instanceof Class) {
/* 1426 */             clazz = (Class)object;
/*      */           } else {
/* 1428 */             clazz = object.getClass();
/*      */           } 
/* 1430 */           return clazz.getCanonicalName();
/*      */         } 
/*      */         break;
/*      */     } 
/* 1434 */     return type.displayText();
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
/*      */   public synchronized int absIndex(int index) {
/* 1451 */     check();
/* 1452 */     return lua_absindex(index);
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
/*      */   public synchronized void arith(ArithOperator operator) {
/* 1464 */     check();
/* 1465 */     lua_arith(arith_operator_id(operator));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void concat(int n) {
/* 1476 */     check();
/* 1477 */     lua_concat(n);
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
/*      */   public synchronized void copy(int fromIndex, int toIndex) {
/* 1491 */     check();
/* 1492 */     lua_copy(fromIndex, toIndex);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized int getTop() {
/* 1501 */     check();
/* 1502 */     return lua_gettop();
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
/*      */   public synchronized void len(int index) {
/* 1515 */     check();
/* 1516 */     lua_len(index);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void insert(int index) {
/* 1527 */     check();
/* 1528 */     lua_insert(index);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pop(int count) {
/* 1538 */     check();
/* 1539 */     lua_pop(count);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void pushValue(int index) {
/* 1549 */     check();
/* 1550 */     lua_pushvalue(index);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void remove(int index) {
/* 1561 */     check();
/* 1562 */     lua_remove(index);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void replace(int index) {
/* 1573 */     check();
/* 1574 */     lua_replace(index);
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
/*      */   public synchronized void setTop(int index) {
/* 1589 */     check();
/* 1590 */     lua_settop(index);
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
/*      */   public synchronized void getTable(int index) {
/* 1603 */     check();
/* 1604 */     lua_gettable(index);
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
/*      */   public synchronized void getField(int index, String key) {
/* 1617 */     check();
/* 1618 */     lua_getfield(index, key);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void newTable() {
/* 1625 */     check();
/* 1626 */     lua_newtable();
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
/*      */   public synchronized void newTable(int arrayCount, int recordCount) {
/* 1639 */     check();
/* 1640 */     lua_createtable(arrayCount, recordCount);
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
/*      */   public synchronized boolean next(int index) {
/* 1654 */     check();
/* 1655 */     return (lua_next(index) != 0);
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
/*      */   public synchronized void rawGet(int index) {
/* 1667 */     check();
/* 1668 */     lua_rawget(index);
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
/*      */   public synchronized void rawGet(int index, int key) {
/* 1681 */     check();
/* 1682 */     lua_rawgeti(index, key);
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
/*      */   public synchronized void rawSet(int index) {
/* 1695 */     check();
/* 1696 */     lua_rawset(index);
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
/*      */   public synchronized void rawSet(int index, int key) {
/* 1710 */     check();
/* 1711 */     lua_rawseti(index, key);
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
/*      */   public synchronized void setTable(int index) {
/* 1723 */     check();
/* 1724 */     lua_settable(index);
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
/*      */   public synchronized void setField(int index, String key) {
/* 1737 */     check();
/* 1738 */     lua_setfield(index, key);
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
/*      */   public synchronized boolean getMetafield(int index, String key) {
/* 1755 */     check();
/* 1756 */     return (lua_getmetafield(index, key) != 0);
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
/*      */   public synchronized boolean getMetatable(int index) {
/* 1769 */     check();
/* 1770 */     return (lua_getmetatable(index) != 0);
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
/*      */   public synchronized void setMetatable(int index) {
/* 1782 */     check();
/* 1783 */     lua_setmetatable(index);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public synchronized void newThread() {
/* 1793 */     check();
/* 1794 */     lua_newthread();
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
/*      */   public synchronized int resume(int index, int argCount) {
/* 1810 */     check();
/* 1811 */     return lua_resume(index, argCount);
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
/*      */   public synchronized int status(int index) {
/* 1826 */     check();
/* 1827 */     return lua_status(index);
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
/*      */   public synchronized int yield(int returnCount) {
/* 1842 */     check();
/* 1843 */     this.yield = true;
/* 1844 */     return returnCount;
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
/*      */   public synchronized int ref(int index) {
/* 1859 */     check();
/* 1860 */     return lua_ref(index);
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
/*      */   public synchronized void unref(int index, int reference) {
/* 1877 */     check();
/* 1878 */     lua_unref(index, reference);
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
/*      */   public synchronized int tableSize(int index) {
/* 1895 */     check();
/* 1896 */     return lua_tablesize(index);
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
/*      */   public synchronized void tableMove(int index, int from, int to, int count) {
/* 1918 */     check();
/* 1919 */     lua_tablemove(index, from, to, count);
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
/*      */   public synchronized void checkArg(int index, boolean condition, String msg) {
/* 1936 */     check();
/* 1937 */     if (!condition) {
/* 1938 */       throw getArgException(index, msg);
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
/*      */   public synchronized byte[] checkByteArray(int index) {
/* 1953 */     check();
/* 1954 */     if (!isString(index)) {
/* 1955 */       throw getArgTypeException(index, LuaType.STRING);
/*      */     }
/* 1957 */     return toByteArray(index);
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
/*      */   public synchronized byte[] checkByteArray(int index, byte[] d) {
/* 1974 */     check();
/* 1975 */     if (isNoneOrNil(index)) {
/* 1976 */       return d;
/*      */     }
/* 1978 */     return checkByteArray(index);
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
/*      */   public synchronized <T extends Enum<T>> T checkEnum(int index, T[] values) {
/* 1995 */     check();
/* 1996 */     return checkEnum(index, values, null);
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
/*      */   public synchronized <T extends Enum<T>> T checkEnum(int index, T[] values, T d) {
/* 2018 */     check();
/*      */     
/* 2020 */     String s = (d != null) ? checkString(index, d.name()) : checkString(index);
/* 2021 */     for (int i = 0; i < values.length; i++) {
/* 2022 */       if (values[i].name().equals(s)) {
/* 2023 */         return values[i];
/*      */       }
/*      */     } 
/* 2026 */     throw getArgException(index, String.format("invalid option '%s'", new Object[] { s }));
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
/*      */   public synchronized boolean checkBoolean(int index) {
/* 2039 */     check();
/* 2040 */     if (!isBoolean(index)) {
/* 2041 */       throw getArgTypeException(index, LuaType.BOOLEAN);
/*      */     }
/* 2043 */     return toBoolean(index);
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
/*      */   public synchronized int checkInt32(int index) {
/* 2057 */     check();
/* 2058 */     Long value = toIntegerX(index);
/* 2059 */     if (value == null) {
/* 2060 */       if (toNumberX(index) != null) {
/* 2061 */         throw getArgException(index, "number has no integer representation");
/*      */       }
/* 2063 */       throw getArgTypeException(index, LuaType.NUMBER);
/*      */     } 
/*      */     
/* 2066 */     if (value.longValue() < -2147483648L || value.longValue() > 2147483647L) {
/* 2067 */       throw getArgException(index, "out of range");
/*      */     }
/* 2069 */     return value.intValue();
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
/*      */   public synchronized int checkInt32(int index, int d) {
/* 2087 */     check();
/* 2088 */     if (isNoneOrNil(index)) {
/* 2089 */       return d;
/*      */     }
/* 2091 */     return checkInt32(index);
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
/*      */   public synchronized long checkInteger(int index) {
/* 2105 */     check();
/* 2106 */     Long value = toIntegerX(index);
/* 2107 */     if (value == null) {
/* 2108 */       if (toNumberX(index) != null) {
/* 2109 */         throw getArgException(index, "number has no integer representation");
/*      */       }
/* 2111 */       throw getArgTypeException(index, LuaType.NUMBER);
/*      */     } 
/*      */     
/* 2114 */     return value.longValue();
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
/*      */   public synchronized long checkInteger(int index, long d) {
/* 2132 */     check();
/* 2133 */     if (isNoneOrNil(index)) {
/* 2134 */       return d;
/*      */     }
/* 2136 */     return checkInteger(index);
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
/*      */   public synchronized <T> T checkJavaObject(int index, Class<T> clazz) {
/* 2158 */     check();
/* 2159 */     if (!isJavaObject(index, clazz))
/* 2160 */       checkArg(index, false, 
/*      */ 
/*      */           
/* 2163 */           String.format("%s expected, got %s", new Object[] {
/* 2164 */               clazz.getCanonicalName(), typeName(index)
/*      */             })); 
/* 2166 */     return toJavaObject(index, clazz);
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
/*      */   public synchronized <T> T checkJavaObject(int index, Class<T> clazz, T d) {
/* 2186 */     check();
/* 2187 */     if (isNoneOrNil(index)) {
/* 2188 */       return d;
/*      */     }
/* 2190 */     return checkJavaObject(index, clazz);
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
/*      */   public synchronized double checkNumber(int index) {
/* 2204 */     check();
/* 2205 */     Double number = toNumberX(index);
/* 2206 */     if (number == null) {
/* 2207 */       throw getArgTypeException(index, LuaType.NUMBER);
/*      */     }
/* 2209 */     return number.doubleValue();
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
/*      */   public synchronized double checkNumber(int index, double d) {
/* 2227 */     check();
/* 2228 */     if (isNoneOrNil(index)) {
/* 2229 */       return d;
/*      */     }
/* 2231 */     return checkNumber(index);
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
/*      */   public synchronized int checkOption(int index, String[] options) {
/* 2247 */     check();
/* 2248 */     return checkOption(index, options, null);
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
/*      */   public synchronized int checkOption(int index, String[] options, String d) {
/* 2268 */     check();
/* 2269 */     String s = (d != null) ? checkString(index, d) : checkString(index);
/* 2270 */     for (int i = 0; i < options.length; i++) {
/* 2271 */       if (options[i].equals(s)) {
/* 2272 */         return i;
/*      */       }
/*      */     } 
/* 2275 */     throw getArgException(index, String.format("invalid option '%s'", new Object[] { s }));
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
/*      */   public synchronized String checkString(int index) {
/* 2288 */     check();
/* 2289 */     if (!isString(index)) {
/* 2290 */       throw getArgTypeException(index, LuaType.STRING);
/*      */     }
/* 2292 */     return toString(index);
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
/*      */   public synchronized String checkString(int index, String d) {
/* 2309 */     check();
/* 2310 */     if (isNoneOrNil(index)) {
/* 2311 */       return d;
/*      */     }
/* 2313 */     return checkString(index);
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
/*      */   public synchronized void checkType(int index, LuaType type) {
/* 2327 */     check();
/* 2328 */     if (type(index) != type) {
/* 2329 */       throw getArgTypeException(index, type);
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
/*      */   public synchronized LuaValueProxy getProxy(int index) {
/* 2342 */     check();
/* 2343 */     pushValue(index);
/* 2344 */     return new LuaValueProxyImpl(ref(this.REGISTRYINDEX));
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
/*      */   public synchronized <T> T getProxy(int index, Class<T> interfaze) {
/* 2362 */     check();
/* 2363 */     return (T)getProxy(index, new Class[] { interfaze });
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
/*      */   public synchronized LuaValueProxy getProxy(int index, Class<?>[] interfaces) {
/* 2380 */     check();
/* 2381 */     pushValue(index);
/* 2382 */     if (!isTable(index))
/* 2383 */       throw new IllegalArgumentException(String.format("index %d is not a table", new Object[] {
/* 2384 */               Integer.valueOf(index)
/*      */             })); 
/* 2386 */     Class<?>[] allInterfaces = new Class[interfaces.length + 1];
/* 2387 */     System.arraycopy(interfaces, 0, allInterfaces, 0, interfaces.length);
/* 2388 */     allInterfaces[allInterfaces.length - 1] = LuaValueProxy.class;
/* 2389 */     int reference = ref(this.REGISTRYINDEX);
/*      */     try {
/* 2391 */       Object proxy = Proxy.newProxyInstance(this.classLoader, allInterfaces, new LuaInvocationHandler(reference));
/*      */       
/* 2393 */       reference = -1;
/* 2394 */       return (LuaValueProxy)proxy;
/*      */     } finally {
/* 2396 */       if (reference >= 0) {
/* 2397 */         unref(this.REGISTRYINDEX, reference);
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public int getIntegerWidth() {
/* 2403 */     return this.INTEGERWIDTH;
/*      */   }
/*      */   
/*      */   public int getPointerWidth() {
/* 2407 */     return this.POINTERWIDTH;
/*      */   }
/*      */   
/*      */   public boolean areLongsSupported() {
/* 2411 */     return (this.INTEGERWIDTH >= 8);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isOpenInternal() {
/* 2419 */     return (this.luaState != 0L);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void closeInternal() {
/* 2426 */     if (isOpenInternal()) {
/* 2427 */       lua_close(this.ownState);
/* 2428 */       if (isOpenInternal()) {
/* 2429 */         throw new IllegalStateException("cannot close");
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   void check() {
/* 2439 */     if (!isOpenInternal()) {
/* 2440 */       throw new IllegalStateException("Lua state is closed");
/*      */     }
/*      */     
/*      */     LuaValueProxyRef luaValueProxyRef;
/*      */     
/* 2445 */     while ((luaValueProxyRef = (LuaValueProxyRef)this.proxyQueue.poll()) != null) {
/* 2446 */       this.proxySet.remove(luaValueProxyRef);
/* 2447 */       lua_unref(this.REGISTRYINDEX, luaValueProxyRef.getReference());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private LuaRuntimeException getArgTypeException(int index, LuaType type) {
/* 2455 */     LuaType have = type(index);
/* 2456 */     return getArgException(index, 
/* 2457 */         String.format("%s expected, got %s", new Object[] { type.toString()
/* 2458 */             .toLowerCase(Locale.ROOT), (have != null) ? type(index).toString().toLowerCase() : "none" }));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   LuaRuntimeException getArgException(int index, String extraMsg) {
/*      */     String msg;
/* 2468 */     check();
/*      */ 
/*      */     
/* 2471 */     String name = null, nameWhat = null;
/* 2472 */     LuaDebug luaDebug = lua_getstack(0);
/* 2473 */     if (luaDebug != null) {
/* 2474 */       lua_getinfo("n", luaDebug);
/* 2475 */       name = luaDebug.getName();
/* 2476 */       nameWhat = luaDebug.getNameWhat();
/*      */     } 
/*      */ 
/*      */     
/* 2480 */     if ("method".equals(nameWhat)) {
/* 2481 */       index--;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2487 */     String argument = (index > 0) ? String.format("argument #%d", new Object[] { Integer.valueOf(index) }) : "self argument";
/* 2488 */     if (name != null) {
/*      */       
/* 2490 */       msg = String.format("bad %s to '%s' (%s)", new Object[] { argument, name, extraMsg });
/*      */     } else {
/* 2492 */       msg = String.format("bad %s (%s)", new Object[] { argument, extraMsg });
/*      */     } 
/* 2494 */     return new LuaRuntimeException(msg);
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
/*      */   private static int validateMemory(int value) {
/* 2506 */     if (value < 1) {
/* 2507 */       throw new IllegalArgumentException("Maximum memory must be larger than zero.");
/*      */     }
/* 2509 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   protected native int lua_integerwidth();
/*      */ 
/*      */   
/*      */   protected native int lua_pointerwidth();
/*      */ 
/*      */   
/*      */   protected native int lua_registryindex();
/*      */ 
/*      */   
/*      */   protected native String lua_version();
/*      */ 
/*      */   
/*      */   protected native int lua_versionnum();
/*      */ 
/*      */   
/*      */   protected native void lua_newstate(int paramInt, long paramLong);
/*      */ 
/*      */   
/*      */   protected native void lua_close(boolean paramBoolean);
/*      */ 
/*      */   
/*      */   protected native int lua_gc(int paramInt1, int paramInt2);
/*      */ 
/*      */   
/*      */   protected native void lua_openlib(int paramInt);
/*      */ 
/*      */   
/*      */   protected native void lua_load(InputStream paramInputStream, String paramString1, String paramString2) throws IOException;
/*      */ 
/*      */   
/*      */   protected native void lua_dump(OutputStream paramOutputStream) throws IOException;
/*      */ 
/*      */   
/*      */   protected native void lua_pcall(int paramInt1, int paramInt2);
/*      */ 
/*      */   
/*      */   protected native void lua_getglobal(String paramString);
/*      */ 
/*      */   
/*      */   protected native void lua_setglobal(String paramString);
/*      */ 
/*      */   
/*      */   protected native void lua_pushboolean(boolean paramBoolean);
/*      */   
/*      */   protected native void lua_pushbytearray(byte[] paramArrayOfbyte);
/*      */   
/*      */   protected native void lua_pushinteger(long paramLong);
/*      */   
/*      */   protected native void lua_pushjavafunction(JavaFunction paramJavaFunction);
/*      */   
/*      */   protected native void lua_pushjavaobject(Object paramObject);
/*      */   
/*      */   protected native void lua_pushnil();
/*      */   
/*      */   protected native void lua_pushnumber(double paramDouble);
/*      */   
/*      */   protected native boolean lua_isboolean(int paramInt);
/*      */   
/*      */   protected native boolean lua_iscfunction(int paramInt);
/*      */   
/*      */   protected native boolean lua_isfunction(int paramInt);
/*      */   
/*      */   protected native boolean lua_isjavafunction(int paramInt);
/*      */   
/*      */   protected native boolean lua_isjavaobject(int paramInt);
/*      */   
/*      */   protected native boolean lua_isnil(int paramInt);
/*      */   
/*      */   protected native boolean lua_isnone(int paramInt);
/*      */   
/*      */   protected native boolean lua_isnoneornil(int paramInt);
/*      */   
/*      */   protected native boolean lua_isnumber(int paramInt);
/*      */   
/*      */   protected native boolean lua_isstring(int paramInt);
/*      */   
/*      */   protected native boolean lua_istable(int paramInt);
/*      */   
/*      */   protected native boolean lua_isthread(int paramInt);
/*      */   
/*      */   protected native int lua_compare(int paramInt1, int paramInt2, int paramInt3);
/*      */   
/*      */   protected native int lua_rawequal(int paramInt1, int paramInt2);
/*      */   
/*      */   protected native int lua_rawlen(int paramInt);
/*      */   
/*      */   protected native boolean lua_toboolean(int paramInt);
/*      */   
/*      */   protected native byte[] lua_tobytearray(int paramInt);
/*      */   
/*      */   protected native long lua_tointeger(int paramInt);
/*      */   
/*      */   protected native Long lua_tointegerx(int paramInt);
/*      */   
/*      */   protected native JavaFunction lua_tojavafunction(int paramInt);
/*      */   
/*      */   protected native Object lua_tojavaobject(int paramInt);
/*      */   
/*      */   protected native double lua_tonumber(int paramInt);
/*      */   
/*      */   protected native Double lua_tonumberx(int paramInt);
/*      */   
/*      */   protected native long lua_topointer(int paramInt);
/*      */   
/*      */   protected native int lua_type(int paramInt);
/*      */   
/*      */   protected native int lua_absindex(int paramInt);
/*      */   
/*      */   protected native int lua_arith(int paramInt);
/*      */   
/*      */   protected native void lua_concat(int paramInt);
/*      */   
/*      */   protected native int lua_copy(int paramInt1, int paramInt2);
/*      */   
/*      */   protected native int lua_gettop();
/*      */   
/*      */   protected native void lua_len(int paramInt);
/*      */   
/*      */   protected native void lua_insert(int paramInt);
/*      */   
/*      */   protected native void lua_pop(int paramInt);
/*      */   
/*      */   protected native void lua_pushvalue(int paramInt);
/*      */   
/*      */   protected native void lua_remove(int paramInt);
/*      */   
/*      */   protected native void lua_replace(int paramInt);
/*      */   
/*      */   protected native void lua_settop(int paramInt);
/*      */   
/*      */   protected native void lua_createtable(int paramInt1, int paramInt2);
/*      */   
/*      */   protected native int lua_getsubtable(int paramInt, String paramString);
/*      */   
/*      */   protected native void lua_gettable(int paramInt);
/*      */   
/*      */   protected native void lua_getfield(int paramInt, String paramString);
/*      */   
/*      */   protected native void lua_newtable();
/*      */   
/*      */   protected native int lua_next(int paramInt);
/*      */   
/*      */   protected native void lua_rawget(int paramInt);
/*      */   
/*      */   protected native void lua_rawgeti(int paramInt1, int paramInt2);
/*      */   
/*      */   protected native void lua_rawset(int paramInt);
/*      */   
/*      */   protected native void lua_rawseti(int paramInt1, int paramInt2);
/*      */   
/*      */   protected native void lua_settable(int paramInt);
/*      */   
/*      */   protected native void lua_setfield(int paramInt, String paramString);
/*      */   
/*      */   protected native int lua_getmetatable(int paramInt);
/*      */   
/*      */   protected native void lua_setmetatable(int paramInt);
/*      */   
/*      */   protected native int lua_getmetafield(int paramInt, String paramString);
/*      */   
/*      */   protected native void lua_newthread();
/*      */   
/*      */   protected native int lua_resume(int paramInt1, int paramInt2);
/*      */   
/*      */   protected native int lua_status(int paramInt);
/*      */   
/*      */   protected native int lua_ref(int paramInt);
/*      */   
/*      */   protected native void lua_unref(int paramInt1, int paramInt2);
/*      */   
/*      */   protected native LuaDebug lua_getstack(int paramInt);
/*      */   
/*      */   protected native int lua_getinfo(String paramString, LuaDebug paramLuaDebug);
/*      */   
/*      */   protected native int lua_tablesize(int paramInt);
/*      */   
/*      */   protected native void lua_tablemove(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*      */   
/*      */   public enum Library
/*      */   {
/* 2693 */     BASE,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2698 */     PACKAGE,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2705 */     COROUTINE,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2710 */     TABLE,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2715 */     IO,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2720 */     OS,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2725 */     STRING,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2732 */     BIT32,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2737 */     MATH,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2742 */     DEBUG,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2747 */     ERIS,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2754 */     UTF8,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2759 */     JAVA
/*      */     {
/*      */       void open(LuaState luaState) {
/* 2762 */         JavaModule.getInstance().open(luaState);
/*      */       }
/*      */     };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     void open(LuaState luaState) {
/* 2771 */       luaState.lua_openlib(ordinal());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public enum GcAction
/*      */   {
/* 2783 */     STOP,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2788 */     RESTART,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2793 */     COLLECT,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2798 */     COUNT,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2803 */     COUNTB,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2808 */     STEP,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2813 */     SETPAUSE,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2818 */     SETSTEPMUL,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2825 */     SETMAJORINC,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2832 */     ISRUNNING,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2841 */     GEN,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2850 */     INC;
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
/*      */   public enum ArithOperator
/*      */   {
/* 2863 */     ADD,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2868 */     SUB,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2873 */     MUL,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2878 */     DIV,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2883 */     MOD,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2888 */     POW,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2893 */     UNM,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2902 */     IDIV,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2911 */     BAND,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2920 */     BOR,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2929 */     BXOR,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2938 */     SHL,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2947 */     SHR,
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2956 */     BNOT;
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
/*      */   public enum RelOperator
/*      */   {
/* 2969 */     EQ,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2974 */     LT,
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2979 */     LE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class LuaValueProxyRef
/*      */     extends PhantomReference<LuaValueProxyImpl>
/*      */   {
/*      */     private int reference;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public LuaValueProxyRef(LuaState.LuaValueProxyImpl luaProxyImpl, int reference) {
/* 2996 */       super(luaProxyImpl, (luaProxyImpl.getLuaState()).proxyQueue);
/* 2997 */       this.reference = reference;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getReference() {
/* 3005 */       return this.reference;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class LuaValueProxyImpl
/*      */     implements LuaValueProxy
/*      */   {
/*      */     private int reference;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public LuaValueProxyImpl(int reference) {
/* 3021 */       this.reference = reference;
/* 3022 */       LuaState.this.proxySet.add(new LuaState.LuaValueProxyRef(this, reference));
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public LuaState getLuaState() {
/* 3028 */       return LuaState.this;
/*      */     }
/*      */ 
/*      */     
/*      */     public void pushValue() {
/* 3033 */       synchronized (LuaState.this) {
/* 3034 */         LuaState.this.rawGet(LuaState.this.REGISTRYINDEX, this.reference);
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class LuaInvocationHandler
/*      */     extends LuaValueProxyImpl
/*      */     implements InvocationHandler
/*      */   {
/*      */     public LuaInvocationHandler(int reference) {
/* 3049 */       super(reference);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
/* 3057 */       if (method.getDeclaringClass() == LuaValueProxy.class) {
/* 3058 */         return method.invoke(this, args);
/*      */       }
/*      */ 
/*      */       
/* 3062 */       synchronized (LuaState.this) {
/* 3063 */         pushValue();
/* 3064 */         LuaState.this.getField(-1, method.getName());
/* 3065 */         if (!LuaState.this.isFunction(-1)) {
/* 3066 */           LuaState.this.pop(2);
/* 3067 */           throw new UnsupportedOperationException(method.getName());
/*      */         } 
/* 3069 */         LuaState.this.insert(-2);
/* 3070 */         int argCount = (args != null) ? args.length : 0;
/* 3071 */         for (int i = 0; i < argCount; i++) {
/* 3072 */           LuaState.this.pushJavaObject(args[i]);
/*      */         }
/* 3074 */         int retCount = (method.getReturnType() != void.class) ? 1 : 0;
/* 3075 */         LuaState.this.call(argCount + 1, retCount);
/*      */         try {
/* 3077 */           return (retCount == 1) ? LuaState.this.<T>toJavaObject(-1, (Class)method
/* 3078 */               .getReturnType()) : null;
/*      */         } finally {
/* 3080 */           if (retCount == 1) {
/* 3081 */             LuaState.this.pop(1);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected static class LuaDebug
/*      */   {
/*      */     private long luaDebug;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Object finalizeGuardian;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     protected LuaDebug(long luaDebug, boolean ownDebug) {
/* 3109 */       this.luaDebug = luaDebug;
/* 3110 */       if (ownDebug) {
/* 3111 */         this.finalizeGuardian = new Object()
/*      */           {
/*      */             public void finalize() {
/* 3114 */               synchronized (LuaState.LuaDebug.this) {
/* 3115 */                 LuaState.LuaDebug.this.lua_debugfree();
/*      */               } 
/*      */             }
/*      */           };
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getName() {
/* 3128 */       return lua_debugname();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getNameWhat() {
/* 3135 */       return lua_debugnamewhat();
/*      */     }
/*      */     
/*      */     protected native void lua_debugfree();
/*      */     
/*      */     protected native String lua_debugname();
/*      */     
/*      */     protected native String lua_debugnamewhat();
/*      */   }
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\LuaState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */