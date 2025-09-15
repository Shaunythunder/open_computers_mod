/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WeakTable
/*     */   implements Metatable
/*     */ {
/*     */   private final boolean weakkeys;
/*     */   private final boolean weakvalues;
/*     */   private final LuaValue backing;
/*     */   
/*     */   public static LuaTable make(boolean weakkeys, boolean weakvalues) {
/*     */     LuaString mode;
/*  45 */     if (weakkeys && weakvalues) {
/*  46 */       mode = LuaString.valueOf("kv");
/*  47 */     } else if (weakkeys) {
/*  48 */       mode = LuaString.valueOf("k");
/*  49 */     } else if (weakvalues) {
/*  50 */       mode = LuaString.valueOf("v");
/*     */     } else {
/*  52 */       return LuaValue.tableOf();
/*     */     } 
/*  54 */     LuaTable table = LuaValue.tableOf();
/*  55 */     LuaTable mt = LuaValue.tableOf(new LuaValue[] { LuaValue.MODE, mode });
/*  56 */     table.setmetatable(mt);
/*  57 */     return table;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WeakTable(boolean weakkeys, boolean weakvalues, LuaValue backing) {
/*  67 */     this.weakkeys = weakkeys;
/*  68 */     this.weakvalues = weakvalues;
/*  69 */     this.backing = backing;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean useWeakKeys() {
/*  74 */     return this.weakkeys;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean useWeakValues() {
/*  79 */     return this.weakvalues;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue toLuaValue() {
/*  84 */     return this.backing;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaTable.Slot entry(LuaValue key, LuaValue value) {
/*  89 */     value = value.strongvalue();
/*  90 */     if (value == null)
/*  91 */       return null; 
/*  92 */     if (this.weakkeys && !key.isnumber() && !key.isstring() && !key.isboolean()) {
/*  93 */       if (this.weakvalues && !value.isnumber() && !value.isstring() && !value.isboolean()) {
/*  94 */         return new WeakKeyAndValueSlot(key, value, null);
/*     */       }
/*  96 */       return new WeakKeySlot(key, value, null);
/*     */     } 
/*     */     
/*  99 */     if (this.weakvalues && !value.isnumber() && !value.isstring() && !value.isboolean()) {
/* 100 */       return new WeakValueSlot(key, value, null);
/*     */     }
/* 102 */     return LuaTable.defaultEntry(key, value);
/*     */   }
/*     */   
/*     */   public static abstract class WeakSlot
/*     */     implements LuaTable.Slot {
/*     */     protected Object key;
/*     */     protected Object value;
/*     */     protected LuaTable.Slot next;
/*     */     
/*     */     protected WeakSlot(Object key, Object value, LuaTable.Slot next) {
/* 112 */       this.key = key;
/* 113 */       this.value = value;
/* 114 */       this.next = next;
/*     */     }
/*     */ 
/*     */     
/*     */     public abstract int keyindex(int param1Int);
/*     */ 
/*     */     
/*     */     public abstract LuaTable.Slot set(LuaValue param1LuaValue);
/*     */     
/*     */     public LuaTable.StrongSlot first() {
/* 124 */       LuaValue key = strongkey();
/* 125 */       LuaValue value = strongvalue();
/* 126 */       if (key != null && value != null) {
/* 127 */         return new LuaTable.NormalEntry(key, value);
/*     */       }
/* 129 */       this.key = null;
/* 130 */       this.value = null;
/* 131 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LuaTable.StrongSlot find(LuaValue key) {
/* 137 */       LuaTable.StrongSlot first = first();
/* 138 */       return (first != null) ? first.find(key) : null;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean keyeq(LuaValue key) {
/* 143 */       LuaTable.StrongSlot first = first();
/* 144 */       return (first != null && first.keyeq(key));
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaTable.Slot rest() {
/* 149 */       return this.next;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int arraykey(int max) {
/* 155 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaTable.Slot set(LuaTable.StrongSlot target, LuaValue value) {
/* 160 */       LuaValue key = strongkey();
/* 161 */       if (key != null && target.find(key) != null)
/* 162 */         return set(value); 
/* 163 */       if (key != null) {
/*     */         
/* 165 */         this.next = this.next.set(target, value);
/* 166 */         return this;
/*     */       } 
/*     */       
/* 169 */       return this.next.set(target, value);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LuaTable.Slot add(LuaTable.Slot entry) {
/* 175 */       this.next = (this.next != null) ? this.next.add(entry) : entry;
/* 176 */       if (strongkey() != null && strongvalue() != null) {
/* 177 */         return this;
/*     */       }
/* 179 */       return this.next;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LuaTable.Slot remove(LuaTable.StrongSlot target) {
/* 185 */       LuaValue key = strongkey();
/* 186 */       if (key == null)
/* 187 */         return this.next.remove(target); 
/* 188 */       if (target.keyeq(key)) {
/* 189 */         this.value = null;
/* 190 */         return this;
/*     */       } 
/* 192 */       this.next = this.next.remove(target);
/* 193 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public LuaTable.Slot relink(LuaTable.Slot rest) {
/* 199 */       if (strongkey() != null && strongvalue() != null) {
/* 200 */         if (rest == null && this.next == null) {
/* 201 */           return this;
/*     */         }
/* 203 */         return copy(rest);
/*     */       } 
/*     */       
/* 206 */       return rest;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue strongkey() {
/* 211 */       return (LuaValue)this.key;
/*     */     }
/*     */     
/*     */     public LuaValue strongvalue() {
/* 215 */       return (LuaValue)this.value;
/*     */     }
/*     */     
/*     */     protected abstract WeakSlot copy(LuaTable.Slot param1Slot);
/*     */   }
/*     */   
/*     */   static class WeakKeySlot
/*     */     extends WeakSlot {
/*     */     private final int keyhash;
/*     */     
/*     */     protected WeakKeySlot(LuaValue key, LuaValue value, LuaTable.Slot next) {
/* 226 */       super(WeakTable.weaken(key), value, next);
/* 227 */       this.keyhash = key.hashCode();
/*     */     }
/*     */     
/*     */     protected WeakKeySlot(WeakKeySlot copyFrom, LuaTable.Slot next) {
/* 231 */       super(copyFrom.key, copyFrom.value, next);
/* 232 */       this.keyhash = copyFrom.keyhash;
/*     */     }
/*     */ 
/*     */     
/*     */     public int keyindex(int mask) {
/* 237 */       return LuaTable.hashmod(this.keyhash, mask);
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaTable.Slot set(LuaValue value) {
/* 242 */       this.value = value;
/* 243 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue strongkey() {
/* 248 */       return WeakTable.strengthen(this.key);
/*     */     }
/*     */ 
/*     */     
/*     */     protected WeakTable.WeakSlot copy(LuaTable.Slot rest) {
/* 253 */       return new WeakKeySlot(this, rest);
/*     */     }
/*     */   }
/*     */   
/*     */   static class WeakValueSlot
/*     */     extends WeakSlot {
/*     */     protected WeakValueSlot(LuaValue key, LuaValue value, LuaTable.Slot next) {
/* 260 */       super(key, WeakTable.weaken(value), next);
/*     */     }
/*     */     
/*     */     protected WeakValueSlot(WeakValueSlot copyFrom, LuaTable.Slot next) {
/* 264 */       super(copyFrom.key, copyFrom.value, next);
/*     */     }
/*     */ 
/*     */     
/*     */     public int keyindex(int mask) {
/* 269 */       return LuaTable.hashSlot(strongkey(), mask);
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaTable.Slot set(LuaValue value) {
/* 274 */       this.value = WeakTable.weaken(value);
/* 275 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue strongvalue() {
/* 280 */       return WeakTable.strengthen(this.value);
/*     */     }
/*     */ 
/*     */     
/*     */     protected WeakTable.WeakSlot copy(LuaTable.Slot next) {
/* 285 */       return new WeakValueSlot(this, next);
/*     */     }
/*     */   }
/*     */   
/*     */   static class WeakKeyAndValueSlot
/*     */     extends WeakSlot {
/*     */     private final int keyhash;
/*     */     
/*     */     protected WeakKeyAndValueSlot(LuaValue key, LuaValue value, LuaTable.Slot next) {
/* 294 */       super(WeakTable.weaken(key), WeakTable.weaken(value), next);
/* 295 */       this.keyhash = key.hashCode();
/*     */     }
/*     */     
/*     */     protected WeakKeyAndValueSlot(WeakKeyAndValueSlot copyFrom, LuaTable.Slot next) {
/* 299 */       super(copyFrom.key, copyFrom.value, next);
/* 300 */       this.keyhash = copyFrom.keyhash;
/*     */     }
/*     */ 
/*     */     
/*     */     public int keyindex(int hashMask) {
/* 305 */       return LuaTable.hashmod(this.keyhash, hashMask);
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaTable.Slot set(LuaValue value) {
/* 310 */       this.value = WeakTable.weaken(value);
/* 311 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue strongkey() {
/* 316 */       return WeakTable.strengthen(this.key);
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue strongvalue() {
/* 321 */       return WeakTable.strengthen(this.value);
/*     */     }
/*     */ 
/*     */     
/*     */     protected WeakTable.WeakSlot copy(LuaTable.Slot next) {
/* 326 */       return new WeakKeyAndValueSlot(this, next);
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
/*     */   protected static LuaValue weaken(LuaValue value) {
/* 338 */     switch (value.type()) {
/*     */       case 5:
/*     */       case 6:
/*     */       case 8:
/* 342 */         return new WeakValue(value);
/*     */       case 7:
/* 344 */         return new WeakUserdata(value);
/*     */     } 
/* 346 */     return value;
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
/*     */   protected static LuaValue strengthen(Object ref) {
/* 358 */     if (ref instanceof WeakReference) {
/* 359 */       ref = ((WeakReference)ref).get();
/*     */     }
/* 361 */     if (ref instanceof WeakValue) {
/* 362 */       return ((WeakValue)ref).strongvalue();
/*     */     }
/* 364 */     return (LuaValue)ref;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static class WeakValue
/*     */     extends LuaValue
/*     */   {
/*     */     WeakReference ref;
/*     */ 
/*     */     
/*     */     protected WeakValue(LuaValue value) {
/* 376 */       this.ref = new WeakReference<>(value);
/*     */     }
/*     */ 
/*     */     
/*     */     public int type() {
/* 381 */       illegal("type", "weak value");
/* 382 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public String typename() {
/* 387 */       illegal("typename", "weak value");
/* 388 */       return null;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 393 */       return "weak<" + this.ref.get() + ">";
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue strongvalue() {
/* 398 */       Object o = this.ref.get();
/* 399 */       return (LuaValue)o;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean raweq(LuaValue rhs) {
/* 404 */       Object o = this.ref.get();
/* 405 */       return (o != null && rhs.raweq((LuaValue)o));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static final class WeakUserdata
/*     */     extends WeakValue
/*     */   {
/*     */     private final WeakReference ob;
/*     */     
/*     */     private final LuaValue mt;
/*     */ 
/*     */     
/*     */     private WeakUserdata(LuaValue value) {
/* 419 */       super(value);
/* 420 */       this.ob = new WeakReference(value.touserdata());
/* 421 */       this.mt = value.getmetatable();
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue strongvalue() {
/* 426 */       Object u = this.ref.get();
/* 427 */       if (u != null)
/* 428 */         return (LuaValue)u; 
/* 429 */       Object o = this.ob.get();
/* 430 */       if (o != null) {
/* 431 */         LuaValue ud = LuaValue.userdataOf(o, this.mt);
/* 432 */         this.ref = new WeakReference<>(ud);
/* 433 */         return ud;
/*     */       } 
/* 435 */       return null;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue wrap(LuaValue value) {
/* 442 */     return this.weakvalues ? weaken(value) : value;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue arrayget(LuaValue[] array, int index) {
/* 447 */     LuaValue value = array[index];
/* 448 */     if (value != null) {
/* 449 */       value = strengthen(value);
/* 450 */       if (value == null) {
/* 451 */         array[index] = null;
/*     */       }
/*     */     } 
/* 454 */     return value;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\WeakTable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */