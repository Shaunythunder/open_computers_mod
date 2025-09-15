/*    */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ import li.cil.repack.org.luaj.vm2.LuaError;
/*    */ import li.cil.repack.org.luaj.vm2.LuaUserdata;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ class JavaInstance
/*    */   extends LuaUserdata
/*    */ {
/*    */   JavaClass jclass;
/*    */   
/*    */   JavaInstance(Object instance) {
/* 46 */     super(instance);
/*    */   }
/*    */ 
/*    */   
/*    */   public LuaValue get(LuaValue key) {
/* 51 */     if (this.jclass == null)
/* 52 */       this.jclass = JavaClass.forClass(this.m_instance.getClass()); 
/* 53 */     Field f = this.jclass.getField(key);
/* 54 */     if (f != null)
/*    */       try {
/* 56 */         return CoerceJavaToLua.coerce(f.get(this.m_instance));
/* 57 */       } catch (Exception e) {
/* 58 */         throw new LuaError(e);
/*    */       }  
/* 60 */     LuaValue m = this.jclass.getMethod(key);
/* 61 */     if (m != null)
/* 62 */       return m; 
/* 63 */     Class c = this.jclass.getInnerClass(key);
/* 64 */     if (c != null)
/* 65 */       return (LuaValue)JavaClass.forClass(c); 
/* 66 */     return super.get(key);
/*    */   }
/*    */ 
/*    */   
/*    */   public void set(LuaValue key, LuaValue value) {
/* 71 */     if (this.jclass == null)
/* 72 */       this.jclass = JavaClass.forClass(this.m_instance.getClass()); 
/* 73 */     Field f = this.jclass.getField(key);
/* 74 */     if (f != null)
/*    */       try {
/* 76 */         f.set(this.m_instance, CoerceLuaToJava.coerce(value, f.getType()));
/*    */         return;
/* 78 */       } catch (Exception e) {
/* 79 */         throw new LuaError(e);
/*    */       }  
/* 81 */     super.set(key, value);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JavaInstance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */