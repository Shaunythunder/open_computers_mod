/*     */ package li.cil.repack.com.naef.jnlua.util;
/*     */ 
/*     */ import java.util.AbstractMap;
/*     */ import java.util.AbstractSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.NoSuchElementException;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ public abstract class AbstractTableMap<K>
/*     */   extends AbstractMap<K, Object>
/*     */   implements LuaValueProxy
/*     */ {
/*     */   private Set<Map.Entry<K, Object>> entrySet;
/*     */   
/*     */   public Set<Map.Entry<K, Object>> entrySet() {
/*  36 */     if (this.entrySet == null) {
/*  37 */       this.entrySet = new EntrySet();
/*     */     }
/*  39 */     return this.entrySet;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/*  44 */     return entrySet().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsKey(Object key) {
/*  49 */     checkKey(key);
/*  50 */     LuaState luaState = getLuaState();
/*  51 */     synchronized (luaState) {
/*  52 */       pushValue();
/*  53 */       luaState.pushJavaObject(key);
/*  54 */       luaState.getTable(-2);
/*     */       try {
/*  56 */         return !luaState.isNil(-1);
/*     */       } finally {
/*  58 */         luaState.pop(2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object get(Object key) {
/*  65 */     checkKey(key);
/*  66 */     LuaState luaState = getLuaState();
/*  67 */     synchronized (luaState) {
/*  68 */       pushValue();
/*  69 */       luaState.pushJavaObject(key);
/*  70 */       luaState.getTable(-2);
/*     */       try {
/*  72 */         return luaState.toJavaObject(-1, Object.class);
/*     */       } finally {
/*  74 */         luaState.pop(2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object put(K key, Object value) {
/*  81 */     checkKey(key);
/*  82 */     LuaState luaState = getLuaState();
/*  83 */     synchronized (luaState) {
/*  84 */       Object oldValue = get(key);
/*  85 */       pushValue();
/*  86 */       luaState.pushJavaObject(key);
/*  87 */       luaState.pushJavaObject(value);
/*  88 */       luaState.setTable(-3);
/*  89 */       luaState.pop(1);
/*  90 */       return oldValue;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object remove(Object key) {
/*  96 */     checkKey(key);
/*  97 */     LuaState luaState = getLuaState();
/*  98 */     synchronized (luaState) {
/*  99 */       Object oldValue = get(key);
/* 100 */       pushValue();
/* 101 */       luaState.pushJavaObject(key);
/* 102 */       luaState.pushNil();
/* 103 */       luaState.setTable(-3);
/* 104 */       luaState.pop(1);
/* 105 */       return oldValue;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkKey(Object key) {
/* 126 */     if (key == null) {
/* 127 */       throw new NullPointerException("key must not be null");
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
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean filterKeys() {
/* 145 */     return false;
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
/*     */   protected boolean acceptKey(int index) {
/* 165 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract K convertKey(int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private class EntrySet
/*     */     extends AbstractSet<Map.Entry<K, Object>>
/*     */   {
/*     */     private EntrySet() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Iterator<Map.Entry<K, Object>> iterator() {
/* 189 */       return new AbstractTableMap.EntryIterator();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 194 */       LuaState luaState = AbstractTableMap.this.getLuaState();
/* 195 */       synchronized (luaState) {
/* 196 */         AbstractTableMap.this.pushValue();
/* 197 */         luaState.pushNil();
/* 198 */         while (luaState.next(-2)) {
/* 199 */           if (!AbstractTableMap.this.filterKeys() || AbstractTableMap.this.acceptKey(-2)) {
/* 200 */             luaState.pop(3);
/* 201 */             return false;
/*     */           } 
/*     */         } 
/* 204 */         luaState.pop(1);
/* 205 */         return true;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public int size() {
/* 211 */       LuaState luaState = AbstractTableMap.this.getLuaState();
/* 212 */       synchronized (luaState) {
/* 213 */         int count = 0;
/* 214 */         AbstractTableMap.this.pushValue();
/* 215 */         if (AbstractTableMap.this.filterKeys()) {
/* 216 */           luaState.pushNil();
/* 217 */           while (luaState.next(-2)) {
/* 218 */             if (AbstractTableMap.this.acceptKey(-2)) {
/* 219 */               count++;
/*     */             }
/* 221 */             luaState.pop(1);
/*     */           } 
/*     */         } else {
/* 224 */           count = luaState.tableSize(-1);
/*     */         } 
/* 226 */         luaState.pop(1);
/* 227 */         return count;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object object) {
/* 233 */       AbstractTableMap.this.checkKey(object);
/* 234 */       if (!(object instanceof AbstractTableMap.Entry)) {
/* 235 */         return false;
/*     */       }
/*     */       
/* 238 */       AbstractTableMap<K>.Entry luaTableEntry = (AbstractTableMap.Entry)object;
/* 239 */       if (luaTableEntry.getLuaState() != AbstractTableMap.this.getLuaState()) {
/* 240 */         return false;
/*     */       }
/* 242 */       return AbstractTableMap.this.containsKey(luaTableEntry.key);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean remove(Object object) {
/* 247 */       if (!(object instanceof AbstractTableMap.Entry)) {
/* 248 */         return false;
/*     */       }
/*     */       
/* 251 */       AbstractTableMap<K>.Entry luaTableEntry = (AbstractTableMap.Entry)object;
/* 252 */       if (luaTableEntry.getLuaState() != AbstractTableMap.this.getLuaState()) {
/* 253 */         return false;
/*     */       }
/* 255 */       LuaState luaState = AbstractTableMap.this.getLuaState();
/* 256 */       synchronized (luaState) {
/* 257 */         AbstractTableMap.this.pushValue();
/* 258 */         luaState.pushJavaObject(object);
/* 259 */         luaState.getTable(-2);
/* 260 */         boolean contains = !luaState.isNil(-1);
/* 261 */         luaState.pop(1);
/* 262 */         if (contains) {
/* 263 */           luaState.pushJavaObject(object);
/* 264 */           luaState.pushNil();
/* 265 */           luaState.setTable(-3);
/*     */         } 
/* 267 */         luaState.pop(1);
/* 268 */         return contains;
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private class EntryIterator
/*     */     implements Iterator<Map.Entry<K, Object>>
/*     */   {
/*     */     private K key;
/*     */ 
/*     */     
/*     */     private EntryIterator() {}
/*     */     
/*     */     public boolean hasNext() {
/* 283 */       LuaState luaState = AbstractTableMap.this.getLuaState();
/* 284 */       synchronized (luaState) {
/* 285 */         AbstractTableMap.this.pushValue();
/* 286 */         luaState.pushJavaObject(this.key);
/* 287 */         while (luaState.next(-2)) {
/* 288 */           if (!AbstractTableMap.this.filterKeys() || AbstractTableMap.this.acceptKey(-2)) {
/* 289 */             luaState.pop(3);
/* 290 */             return true;
/*     */           } 
/*     */         } 
/* 293 */         luaState.pop(1);
/* 294 */         return false;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public Map.Entry<K, Object> next() {
/* 300 */       LuaState luaState = AbstractTableMap.this.getLuaState();
/* 301 */       synchronized (luaState) {
/* 302 */         AbstractTableMap.this.pushValue();
/* 303 */         luaState.pushJavaObject(this.key);
/* 304 */         while (luaState.next(-2)) {
/* 305 */           if (!AbstractTableMap.this.filterKeys() || AbstractTableMap.this.acceptKey(-2)) {
/* 306 */             this.key = AbstractTableMap.this.convertKey(-2);
/* 307 */             luaState.pop(3);
/* 308 */             return new AbstractTableMap.Entry(this.key);
/*     */           } 
/*     */         } 
/* 311 */         luaState.pop(1);
/* 312 */         throw new NoSuchElementException();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void remove() {
/* 318 */       LuaState luaState = AbstractTableMap.this.getLuaState();
/* 319 */       synchronized (luaState) {
/* 320 */         AbstractTableMap.this.pushValue();
/* 321 */         luaState.pushJavaObject(this.key);
/* 322 */         luaState.pushNil();
/* 323 */         luaState.setTable(-3);
/* 324 */         luaState.pop(1);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private class Entry
/*     */     implements Map.Entry<K, Object>
/*     */   {
/*     */     private K key;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Entry(K key) {
/* 341 */       this.key = key;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public K getKey() {
/* 347 */       return this.key;
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getValue() {
/* 352 */       return AbstractTableMap.this.get(this.key);
/*     */     }
/*     */ 
/*     */     
/*     */     public Object setValue(Object value) {
/* 357 */       return AbstractTableMap.this.put(this.key, value);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean equals(Object obj) {
/* 363 */       if (!(obj instanceof Entry)) {
/* 364 */         return false;
/*     */       }
/*     */       
/* 367 */       Entry other = (Entry)obj;
/* 368 */       return (getLuaState() == other.getLuaState() && this.key
/* 369 */         .equals(other.key));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 374 */       return getLuaState().hashCode() * 65599 + this.key.hashCode();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 379 */       return this.key.toString();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private LuaState getLuaState() {
/* 387 */       return AbstractTableMap.this.getLuaState();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlu\\util\AbstractTableMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */