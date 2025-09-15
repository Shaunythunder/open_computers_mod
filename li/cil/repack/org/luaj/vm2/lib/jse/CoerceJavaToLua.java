/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import li.cil.repack.org.luaj.vm2.LuaDouble;
/*     */ import li.cil.repack.org.luaj.vm2.LuaInteger;
/*     */ import li.cil.repack.org.luaj.vm2.LuaString;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CoerceJavaToLua
/*     */ {
/*     */   static interface Coercion
/*     */   {
/*     */     LuaValue coerce(Object param1Object);
/*     */   }
/*     */   
/*     */   private static final class BoolCoercion
/*     */     implements Coercion
/*     */   {
/*     */     private BoolCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/*  74 */       Boolean b = (Boolean)javaValue;
/*  75 */       return b.booleanValue() ? (LuaValue)LuaValue.TRUE : (LuaValue)LuaValue.FALSE;
/*     */     } }
/*     */   
/*     */   private static final class IntCoercion implements Coercion {
/*     */     private IntCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/*  82 */       Number n = (Number)javaValue;
/*  83 */       return (LuaValue)LuaInteger.valueOf(n.intValue());
/*     */     }
/*     */   }
/*     */   
/*     */   private static final class CharCoercion
/*     */     implements Coercion {
/*     */     public LuaValue coerce(Object javaValue) {
/*  90 */       Character c = (Character)javaValue;
/*  91 */       return (LuaValue)LuaInteger.valueOf(c.charValue());
/*     */     }
/*     */     private CharCoercion() {} }
/*     */   
/*     */   private static final class DoubleCoercion implements Coercion { private DoubleCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/*  98 */       Number n = (Number)javaValue;
/*  99 */       return (LuaValue)LuaDouble.valueOf(n.doubleValue());
/*     */     } }
/*     */ 
/*     */   
/*     */   private static final class StringCoercion implements Coercion { private StringCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/* 106 */       return (LuaValue)LuaString.valueOf(javaValue.toString());
/*     */     } }
/*     */   
/*     */   private static final class BytesCoercion implements Coercion {
/*     */     private BytesCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/* 113 */       return (LuaValue)LuaValue.valueOf((byte[])javaValue);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final class ClassCoercion implements Coercion { private ClassCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/* 120 */       return (LuaValue)JavaClass.forClass((Class)javaValue);
/*     */     } }
/*     */   
/*     */   private static final class InstanceCoercion implements Coercion {
/*     */     private InstanceCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/* 127 */       return (LuaValue)new JavaInstance(javaValue);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final class ArrayCoercion implements Coercion {
/*     */     private ArrayCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/* 135 */       return (LuaValue)new JavaArray(javaValue);
/*     */     } }
/*     */   
/*     */   private static final class LuaCoercion implements Coercion {
/*     */     private LuaCoercion() {}
/*     */     
/*     */     public LuaValue coerce(Object javaValue) {
/* 142 */       return (LuaValue)javaValue;
/*     */     }
/*     */   }
/*     */   
/* 146 */   static final Map COERCIONS = Collections.synchronizedMap(new HashMap<>());
/*     */   
/*     */   static {
/* 149 */     Coercion boolCoercion = new BoolCoercion();
/* 150 */     Coercion intCoercion = new IntCoercion();
/* 151 */     Coercion charCoercion = new CharCoercion();
/* 152 */     Coercion doubleCoercion = new DoubleCoercion();
/* 153 */     Coercion stringCoercion = new StringCoercion();
/* 154 */     Coercion bytesCoercion = new BytesCoercion();
/* 155 */     Coercion classCoercion = new ClassCoercion();
/* 156 */     COERCIONS.put(Boolean.class, boolCoercion);
/* 157 */     COERCIONS.put(Byte.class, intCoercion);
/* 158 */     COERCIONS.put(Character.class, charCoercion);
/* 159 */     COERCIONS.put(Short.class, intCoercion);
/* 160 */     COERCIONS.put(Integer.class, intCoercion);
/* 161 */     COERCIONS.put(Long.class, doubleCoercion);
/* 162 */     COERCIONS.put(Float.class, doubleCoercion);
/* 163 */     COERCIONS.put(Double.class, doubleCoercion);
/* 164 */     COERCIONS.put(String.class, stringCoercion);
/* 165 */     COERCIONS.put(byte[].class, bytesCoercion);
/* 166 */     COERCIONS.put(Class.class, classCoercion);
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
/*     */   public static LuaValue coerce(Object o) {
/* 188 */     if (o == null)
/* 189 */       return LuaValue.NIL; 
/* 190 */     Class<?> clazz = o.getClass();
/* 191 */     Coercion c = (Coercion)COERCIONS.get(clazz);
/* 192 */     if (c == null) {
/* 193 */       c = clazz.isArray() ? arrayCoercion : ((o instanceof LuaValue) ? luaCoercion : instanceCoercion);
/* 194 */       COERCIONS.put(clazz, c);
/*     */     } 
/* 196 */     return c.coerce(o);
/*     */   }
/*     */   
/* 199 */   static final Coercion instanceCoercion = new InstanceCoercion();
/*     */   
/* 201 */   static final Coercion arrayCoercion = new ArrayCoercion();
/*     */   
/* 203 */   static final Coercion luaCoercion = new LuaCoercion();
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\CoerceJavaToLua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */