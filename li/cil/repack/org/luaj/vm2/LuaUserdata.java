/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaUserdata
/*     */   extends LuaValue
/*     */ {
/*     */   public Object m_instance;
/*     */   public LuaValue m_metatable;
/*     */   
/*     */   public LuaUserdata(Object obj) {
/*  30 */     this.m_instance = obj;
/*     */   }
/*     */   
/*     */   public LuaUserdata(Object obj, LuaValue metatable) {
/*  34 */     this.m_instance = obj;
/*  35 */     this.m_metatable = metatable;
/*     */   }
/*     */ 
/*     */   
/*     */   public String tojstring() {
/*  40 */     return String.valueOf(this.m_instance);
/*     */   }
/*     */ 
/*     */   
/*     */   public int type() {
/*  45 */     return 7;
/*     */   }
/*     */ 
/*     */   
/*     */   public String typename() {
/*  50 */     return "userdata";
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  55 */     return this.m_instance.hashCode();
/*     */   }
/*     */   
/*     */   public Object userdata() {
/*  59 */     return this.m_instance;
/*     */   }
/*     */   
/*     */   public boolean isuserdata() {
/*  63 */     return true;
/*     */   }
/*     */   public boolean isuserdata(Class c) {
/*  66 */     return c.isAssignableFrom(this.m_instance.getClass());
/*     */   }
/*     */   public Object touserdata() {
/*  69 */     return this.m_instance;
/*     */   }
/*     */   public Object touserdata(Class c) {
/*  72 */     return c.isAssignableFrom(this.m_instance.getClass()) ? this.m_instance : null;
/*     */   }
/*     */   public Object optuserdata(Object defval) {
/*  75 */     return this.m_instance;
/*     */   }
/*     */   
/*     */   public Object optuserdata(Class c, Object defval) {
/*  79 */     if (!c.isAssignableFrom(this.m_instance.getClass()))
/*  80 */       typerror(c.getName()); 
/*  81 */     return this.m_instance;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue getmetatable() {
/*  86 */     return this.m_metatable;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue setmetatable(LuaValue metatable) {
/*  91 */     this.m_metatable = metatable;
/*  92 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object checkuserdata() {
/*  97 */     return this.m_instance;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object checkuserdata(Class c) {
/* 102 */     if (c.isAssignableFrom(this.m_instance.getClass()))
/* 103 */       return this.m_instance; 
/* 104 */     return typerror(c.getName());
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue get(LuaValue key) {
/* 109 */     return (this.m_metatable != null) ? gettable(this, key) : NIL;
/*     */   }
/*     */ 
/*     */   
/*     */   public void set(LuaValue key, LuaValue value) {
/* 114 */     if (this.m_metatable == null || !settable(this, key, value)) {
/* 115 */       error("cannot set " + key + " for userdata");
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean equals(Object val) {
/* 120 */     if (this == val)
/* 121 */       return true; 
/* 122 */     if (!(val instanceof LuaUserdata))
/* 123 */       return false; 
/* 124 */     LuaUserdata u = (LuaUserdata)val;
/* 125 */     return this.m_instance.equals(u.m_instance);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue eq(LuaValue val) {
/* 130 */     return eq_b(val) ? TRUE : FALSE;
/*     */   }
/*     */   
/*     */   public boolean eq_b(LuaValue val) {
/* 134 */     if (val.raweq(this))
/* 135 */       return true; 
/* 136 */     if (this.m_metatable == null || !val.isuserdata())
/* 137 */       return false; 
/* 138 */     LuaValue valmt = val.getmetatable();
/* 139 */     return (valmt != null && LuaValue.eqmtcall(this, this.m_metatable, val, valmt));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean raweq(LuaValue val) {
/* 144 */     return val.raweq(this);
/*     */   }
/*     */   
/*     */   public boolean raweq(LuaUserdata val) {
/* 148 */     return (this == val || (this.m_metatable == val.m_metatable && this.m_instance.equals(val.m_instance)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean eqmt(LuaValue val) {
/* 153 */     return (this.m_metatable != null && val.isuserdata()) ? LuaValue.eqmtcall(this, this.m_metatable, val, val.getmetatable()) : false;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaUserdata.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */