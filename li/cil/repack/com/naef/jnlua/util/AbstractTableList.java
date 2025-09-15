/*     */ package li.cil.repack.com.naef.jnlua.util;
/*     */ 
/*     */ import java.util.AbstractList;
/*     */ import java.util.RandomAccess;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ import li.cil.repack.com.naef.jnlua.LuaValueProxy;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractTableList
/*     */   extends AbstractList<Object>
/*     */   implements RandomAccess, LuaValueProxy
/*     */ {
/*     */   public void add(int index, Object element) {
/*  29 */     LuaState luaState = getLuaState();
/*  30 */     synchronized (luaState) {
/*  31 */       int size = size();
/*  32 */       if (index < 0 || index > size) {
/*  33 */         throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
/*     */       }
/*     */       
/*  36 */       pushValue();
/*  37 */       luaState.tableMove(-1, index + 1, index + 2, size - index);
/*  38 */       luaState.pushJavaObject(element);
/*  39 */       luaState.rawSet(-2, index + 1);
/*  40 */       luaState.pop(1);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object get(int index) {
/*  46 */     LuaState luaState = getLuaState();
/*  47 */     synchronized (luaState) {
/*  48 */       int size = size();
/*  49 */       if (index < 0 || index >= size) {
/*  50 */         throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
/*     */       }
/*     */       
/*  53 */       pushValue();
/*  54 */       luaState.rawGet(-1, index + 1);
/*     */       try {
/*  56 */         return luaState.toJavaObject(-1, Object.class);
/*     */       } finally {
/*  58 */         luaState.pop(2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object remove(int index) {
/*  65 */     LuaState luaState = getLuaState();
/*  66 */     synchronized (luaState) {
/*  67 */       int size = size();
/*  68 */       if (index < 0 || index >= size) {
/*  69 */         throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
/*     */       }
/*     */       
/*  72 */       Object oldValue = get(index);
/*  73 */       pushValue();
/*  74 */       luaState.tableMove(-1, index + 2, index + 1, size - index - 1);
/*  75 */       luaState.pushNil();
/*  76 */       luaState.rawSet(-2, size);
/*  77 */       luaState.pop(1);
/*  78 */       return oldValue;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object set(int index, Object element) {
/*  84 */     LuaState luaState = getLuaState();
/*  85 */     synchronized (luaState) {
/*  86 */       int size = size();
/*  87 */       if (index < 0 || index >= size) {
/*  88 */         throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
/*     */       }
/*     */       
/*  91 */       Object oldValue = get(index);
/*  92 */       pushValue();
/*  93 */       luaState.pushJavaObject(element);
/*  94 */       luaState.rawSet(-2, index + 1);
/*  95 */       luaState.pop(1);
/*  96 */       return oldValue;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 102 */     LuaState luaState = getLuaState();
/* 103 */     synchronized (luaState) {
/* 104 */       pushValue();
/*     */       try {
/* 106 */         return luaState.rawLen(-1);
/*     */       } finally {
/* 108 */         luaState.pop(1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlu\\util\AbstractTableList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */