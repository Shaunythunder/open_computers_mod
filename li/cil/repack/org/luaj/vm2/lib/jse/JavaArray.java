/*    */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*    */ 
/*    */ import java.lang.reflect.Array;
/*    */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*    */ import li.cil.repack.org.luaj.vm2.LuaUserdata;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.lib.OneArgFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class JavaArray
/*    */   extends LuaUserdata
/*    */ {
/*    */   private static final class LenFunction
/*    */     extends OneArgFunction
/*    */   {
/*    */     private LenFunction() {}
/*    */     
/*    */     public LuaValue call(LuaValue u) {
/* 47 */       return (LuaValue)LuaValue.valueOf(Array.getLength(((LuaUserdata)u).m_instance));
/*    */     }
/*    */   }
/*    */   
/* 51 */   static final LuaValue LENGTH = (LuaValue)valueOf("length");
/*    */ 
/*    */ 
/*    */   
/* 55 */   static final LuaTable array_metatable = new LuaTable(); static {
/* 56 */     array_metatable.rawset((LuaValue)LuaValue.LEN, (LuaValue)new LenFunction());
/*    */   }
/*    */   
/*    */   JavaArray(Object instance) {
/* 60 */     super(instance);
/* 61 */     setmetatable((LuaValue)array_metatable);
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue get(LuaValue key) {
/* 66 */     if (key.equals(LENGTH))
/* 67 */       return (LuaValue)valueOf(Array.getLength(this.m_instance)); 
/* 68 */     if (key.isint()) {
/* 69 */       int i = key.toint() - 1;
/* 70 */       return (i >= 0 && i < Array.getLength(this.m_instance)) ? 
/* 71 */         CoerceJavaToLua.coerce(Array.get(this.m_instance, key.toint() - 1)) : 
/* 72 */         NIL;
/*    */     } 
/* 74 */     return super.get(key);
/*    */   }
/*    */ 
/*    */   
/*    */   public void set(LuaValue key, LuaValue value) {
/* 79 */     if (key.isint())
/* 80 */     { int i = key.toint() - 1;
/* 81 */       if (i >= 0 && i < Array.getLength(this.m_instance)) {
/* 82 */         Array.set(this.m_instance, i, CoerceLuaToJava.coerce(value, this.m_instance.getClass().getComponentType()));
/* 83 */       } else if (this.m_metatable == null || !settable((LuaValue)this, key, value)) {
/* 84 */         error("array index out of bounds");
/*    */       }  }
/* 86 */     else { super.set(key, value); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JavaArray.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */