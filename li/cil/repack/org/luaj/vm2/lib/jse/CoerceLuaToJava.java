/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ public class CoerceLuaToJava
/*     */ {
/*  62 */   static int SCORE_NULL_VALUE = 16;
/*  63 */   static int SCORE_WRONG_TYPE = 256;
/*  64 */   static int SCORE_UNCOERCIBLE = 65536;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object coerce(LuaValue value, Class clazz) {
/*  81 */     return getCoercion(clazz).coerce(value);
/*     */   }
/*     */   
/*  84 */   static final Map COERCIONS = Collections.synchronizedMap(new HashMap<>());
/*     */   
/*     */   static final class BoolCoercion
/*     */     implements Coercion {
/*     */     public String toString() {
/*  89 */       return "BoolCoercion()";
/*     */     }
/*     */ 
/*     */     
/*     */     public int score(LuaValue value) {
/*  94 */       switch (value.type()) {
/*     */         case 1:
/*  96 */           return 0;
/*     */       } 
/*  98 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public Object coerce(LuaValue value) {
/* 103 */       return value.toboolean() ? Boolean.TRUE : Boolean.FALSE;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class NumericCoercion implements Coercion {
/*     */     static final int TARGET_TYPE_BYTE = 0;
/*     */     static final int TARGET_TYPE_CHAR = 1;
/*     */     static final int TARGET_TYPE_SHORT = 2;
/*     */     static final int TARGET_TYPE_INT = 3;
/*     */     static final int TARGET_TYPE_LONG = 4;
/*     */     static final int TARGET_TYPE_FLOAT = 5;
/*     */     static final int TARGET_TYPE_DOUBLE = 6;
/* 115 */     static final String[] TYPE_NAMES = new String[] { "byte", "char", "short", "int", "long", "float", "double" };
/*     */     
/*     */     final int targetType;
/*     */     
/*     */     public String toString() {
/* 120 */       return "NumericCoercion(" + TYPE_NAMES[this.targetType] + ")";
/*     */     }
/*     */     
/*     */     NumericCoercion(int targetType) {
/* 124 */       this.targetType = targetType;
/*     */     }
/*     */ 
/*     */     
/*     */     public int score(LuaValue value) {
/* 129 */       int fromStringPenalty = 0;
/* 130 */       if (value.type() == 4) {
/* 131 */         value = value.tonumber();
/* 132 */         if (value.isnil()) {
/* 133 */           return CoerceLuaToJava.SCORE_UNCOERCIBLE;
/*     */         }
/* 135 */         fromStringPenalty = 4;
/*     */       } 
/* 137 */       if (value.isint()) {
/* 138 */         int i; switch (this.targetType) {
/*     */           case 0:
/* 140 */             i = value.toint();
/* 141 */             return fromStringPenalty + ((i == (byte)i) ? 0 : CoerceLuaToJava.SCORE_WRONG_TYPE);
/*     */           
/*     */           case 1:
/* 144 */             i = value.toint();
/* 145 */             return fromStringPenalty + ((i == (byte)i) ? 1 : ((i == (char)i) ? 0 : CoerceLuaToJava.SCORE_WRONG_TYPE));
/*     */           
/*     */           case 2:
/* 148 */             i = value.toint();
/* 149 */             return fromStringPenalty + ((i == (byte)i) ? 1 : ((i == (short)i) ? 0 : CoerceLuaToJava.SCORE_WRONG_TYPE));
/*     */           
/*     */           case 3:
/* 152 */             i = value.toint();
/* 153 */             return fromStringPenalty + ((i == (byte)i) ? 2 : ((i == (char)i || i == (short)i) ? 1 : 0));
/*     */           
/*     */           case 5:
/* 156 */             return fromStringPenalty + 1;
/*     */           case 4:
/* 158 */             return fromStringPenalty + 1;
/*     */           case 6:
/* 160 */             return fromStringPenalty + 2;
/*     */         } 
/* 162 */         return CoerceLuaToJava.SCORE_WRONG_TYPE;
/*     */       } 
/* 164 */       if (value.isnumber()) {
/* 165 */         double d; switch (this.targetType) {
/*     */           case 0:
/* 167 */             return CoerceLuaToJava.SCORE_WRONG_TYPE;
/*     */           case 1:
/* 169 */             return CoerceLuaToJava.SCORE_WRONG_TYPE;
/*     */           case 2:
/* 171 */             return CoerceLuaToJava.SCORE_WRONG_TYPE;
/*     */           case 3:
/* 173 */             return CoerceLuaToJava.SCORE_WRONG_TYPE;
/*     */           case 4:
/* 175 */             d = value.todouble();
/* 176 */             return fromStringPenalty + ((d == (long)d) ? 0 : CoerceLuaToJava.SCORE_WRONG_TYPE);
/*     */           
/*     */           case 5:
/* 179 */             d = value.todouble();
/* 180 */             return fromStringPenalty + ((d == (float)d) ? 0 : CoerceLuaToJava.SCORE_WRONG_TYPE);
/*     */           
/*     */           case 6:
/* 183 */             d = value.todouble();
/* 184 */             return fromStringPenalty + ((d == (long)d || d == (float)d) ? 1 : 0);
/*     */         } 
/*     */         
/* 187 */         return CoerceLuaToJava.SCORE_WRONG_TYPE;
/*     */       } 
/*     */       
/* 190 */       return CoerceLuaToJava.SCORE_UNCOERCIBLE;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object coerce(LuaValue value) {
/* 196 */       switch (this.targetType) {
/*     */         case 0:
/* 198 */           return Byte.valueOf((byte)value.toint());
/*     */         case 1:
/* 200 */           return Character.valueOf((char)value.toint());
/*     */         case 2:
/* 202 */           return Short.valueOf((short)value.toint());
/*     */         case 3:
/* 204 */           return Integer.valueOf(value.toint());
/*     */         case 4:
/* 206 */           return Long.valueOf((long)value.todouble());
/*     */         case 5:
/* 208 */           return Float.valueOf((float)value.todouble());
/*     */         case 6:
/* 210 */           return Double.valueOf(value.todouble());
/*     */       } 
/* 212 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class StringCoercion
/*     */     implements Coercion {
/*     */     public static final int TARGET_TYPE_STRING = 0;
/*     */     public static final int TARGET_TYPE_BYTES = 1;
/*     */     final int targetType;
/*     */     
/*     */     public StringCoercion(int targetType) {
/* 223 */       this.targetType = targetType;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 228 */       return "StringCoercion(" + ((this.targetType == 0) ? "String" : "byte[]") + ")";
/*     */     }
/*     */ 
/*     */     
/*     */     public int score(LuaValue value) {
/* 233 */       switch (value.type()) {
/*     */         case 4:
/* 235 */           return value.checkstring().isValidUtf8() ? ((this.targetType == 0) ? 0 : 1) : (
/* 236 */             (this.targetType == 1) ? 0 : CoerceLuaToJava.SCORE_WRONG_TYPE);
/*     */         case 0:
/* 238 */           return CoerceLuaToJava.SCORE_NULL_VALUE;
/*     */       } 
/* 240 */       return (this.targetType == 0) ? CoerceLuaToJava.SCORE_WRONG_TYPE : CoerceLuaToJava.SCORE_UNCOERCIBLE;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object coerce(LuaValue value) {
/* 246 */       if (value.isnil())
/* 247 */         return null; 
/* 248 */       if (this.targetType == 0)
/* 249 */         return value.tojstring(); 
/* 250 */       LuaString s = value.checkstring();
/* 251 */       byte[] b = new byte[s.m_length];
/* 252 */       s.copyInto(0, b, 0, b.length);
/* 253 */       return b;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class ArrayCoercion implements Coercion {
/*     */     final Class componentType;
/*     */     final CoerceLuaToJava.Coercion componentCoercion;
/*     */     
/*     */     public ArrayCoercion(Class componentType) {
/* 262 */       this.componentType = componentType;
/* 263 */       this.componentCoercion = CoerceLuaToJava.getCoercion(componentType);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 268 */       return "ArrayCoercion(" + this.componentType.getName() + ")";
/*     */     }
/*     */ 
/*     */     
/*     */     public int score(LuaValue value) {
/* 273 */       switch (value.type()) {
/*     */         case 5:
/* 275 */           return (value.length() == 0) ? 0 : this.componentCoercion.score(value.get(1));
/*     */         case 7:
/* 277 */           return CoerceLuaToJava.inheritanceLevels(this.componentType, value.touserdata().getClass().getComponentType());
/*     */         case 0:
/* 279 */           return CoerceLuaToJava.SCORE_NULL_VALUE;
/*     */       } 
/* 281 */       return CoerceLuaToJava.SCORE_UNCOERCIBLE;
/*     */     }
/*     */     public Object coerce(LuaValue value) {
/*     */       int n;
/*     */       Object a;
/*     */       int i;
/* 287 */       switch (value.type()) {
/*     */         case 5:
/* 289 */           n = value.length();
/* 290 */           a = Array.newInstance(this.componentType, n);
/* 291 */           for (i = 0; i < n; i++)
/* 292 */             Array.set(a, i, this.componentCoercion.coerce(value.get(i + 1))); 
/* 293 */           return a;
/*     */         
/*     */         case 7:
/* 296 */           return value.touserdata();
/*     */         case 0:
/* 298 */           return null;
/*     */       } 
/* 300 */       return null;
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
/*     */   static final int inheritanceLevels(Class baseclass, Class subclass) {
/* 315 */     if (subclass == null)
/* 316 */       return SCORE_UNCOERCIBLE; 
/* 317 */     if (baseclass == subclass)
/* 318 */       return 0; 
/* 319 */     int min = Math.min(SCORE_UNCOERCIBLE, inheritanceLevels(baseclass, subclass.getSuperclass()) + 1);
/* 320 */     Class[] ifaces = subclass.getInterfaces();
/* 321 */     for (Class element : ifaces)
/* 322 */       min = Math.min(min, inheritanceLevels(baseclass, element) + 1); 
/* 323 */     return min;
/*     */   }
/*     */   
/*     */   static final class ObjectCoercion implements Coercion {
/*     */     final Class targetType;
/*     */     
/*     */     ObjectCoercion(Class targetType) {
/* 330 */       this.targetType = targetType;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 335 */       return "ObjectCoercion(" + this.targetType.getName() + ")";
/*     */     }
/*     */ 
/*     */     
/*     */     public int score(LuaValue value) {
/* 340 */       switch (value.type()) {
/*     */         case 3:
/* 342 */           return CoerceLuaToJava.inheritanceLevels(this.targetType, value.isint() ? Integer.class : Double.class);
/*     */         case 1:
/* 344 */           return CoerceLuaToJava.inheritanceLevels(this.targetType, Boolean.class);
/*     */         case 4:
/* 346 */           return CoerceLuaToJava.inheritanceLevels(this.targetType, String.class);
/*     */         case 7:
/* 348 */           return CoerceLuaToJava.inheritanceLevels(this.targetType, value.touserdata().getClass());
/*     */         case 0:
/* 350 */           return CoerceLuaToJava.SCORE_NULL_VALUE;
/*     */       } 
/* 352 */       return CoerceLuaToJava.inheritanceLevels(this.targetType, value.getClass());
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Object coerce(LuaValue value) {
/* 358 */       switch (value.type()) {
/*     */         case 3:
/* 360 */           return value.isint() ? Integer.valueOf(value.toint()) : 
/* 361 */             Double.valueOf(value.todouble());
/*     */         case 1:
/* 363 */           return value.toboolean() ? Boolean.TRUE : Boolean.FALSE;
/*     */         case 4:
/* 365 */           return value.tojstring();
/*     */         case 7:
/* 367 */           return value.optuserdata(this.targetType, null);
/*     */         case 0:
/* 369 */           return null;
/*     */       } 
/* 371 */       return value;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static {
/* 377 */     Coercion boolCoercion = new BoolCoercion();
/* 378 */     Coercion byteCoercion = new NumericCoercion(0);
/* 379 */     Coercion charCoercion = new NumericCoercion(1);
/* 380 */     Coercion shortCoercion = new NumericCoercion(2);
/* 381 */     Coercion intCoercion = new NumericCoercion(3);
/* 382 */     Coercion longCoercion = new NumericCoercion(4);
/* 383 */     Coercion floatCoercion = new NumericCoercion(5);
/* 384 */     Coercion doubleCoercion = new NumericCoercion(6);
/* 385 */     Coercion stringCoercion = new StringCoercion(0);
/* 386 */     Coercion bytesCoercion = new StringCoercion(1);
/*     */     
/* 388 */     COERCIONS.put(boolean.class, boolCoercion);
/* 389 */     COERCIONS.put(Boolean.class, boolCoercion);
/* 390 */     COERCIONS.put(byte.class, byteCoercion);
/* 391 */     COERCIONS.put(Byte.class, byteCoercion);
/* 392 */     COERCIONS.put(char.class, charCoercion);
/* 393 */     COERCIONS.put(Character.class, charCoercion);
/* 394 */     COERCIONS.put(short.class, shortCoercion);
/* 395 */     COERCIONS.put(Short.class, shortCoercion);
/* 396 */     COERCIONS.put(int.class, intCoercion);
/* 397 */     COERCIONS.put(Integer.class, intCoercion);
/* 398 */     COERCIONS.put(long.class, longCoercion);
/* 399 */     COERCIONS.put(Long.class, longCoercion);
/* 400 */     COERCIONS.put(float.class, floatCoercion);
/* 401 */     COERCIONS.put(Float.class, floatCoercion);
/* 402 */     COERCIONS.put(double.class, doubleCoercion);
/* 403 */     COERCIONS.put(Double.class, doubleCoercion);
/* 404 */     COERCIONS.put(String.class, stringCoercion);
/* 405 */     COERCIONS.put(byte[].class, bytesCoercion);
/*     */   }
/*     */   
/*     */   static Coercion getCoercion(Class<?> c) {
/* 409 */     Coercion co = (Coercion)COERCIONS.get(c);
/* 410 */     if (co != null) {
/* 411 */       return co;
/*     */     }
/* 413 */     if (c.isArray()) {
/* 414 */       Class<?> typ = c.getComponentType();
/* 415 */       co = new ArrayCoercion(c.getComponentType());
/*     */     } else {
/* 417 */       co = new ObjectCoercion(c);
/*     */     } 
/* 419 */     COERCIONS.put(c, co);
/* 420 */     return co;
/*     */   }
/*     */   
/*     */   static interface Coercion {
/*     */     int score(LuaValue param1LuaValue);
/*     */     
/*     */     Object coerce(LuaValue param1LuaValue);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\CoerceLuaToJava.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */