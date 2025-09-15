/*     */ package li.cil.repack.com.naef.jnlua;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import li.cil.repack.com.naef.jnlua.util.AbstractTableList;
/*     */ import li.cil.repack.com.naef.jnlua.util.AbstractTableMap;
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
/*     */ public class DefaultConverter
/*     */   implements Converter
/*     */ {
/*     */   private static final boolean RAW_BYTE_ARRAY = false;
/*  34 */   private static final DefaultConverter INSTANCE = new DefaultConverter();
/*     */   
/*     */   public static boolean isTypeSupported(Class<?> clazz) {
/*  37 */     return (JAVA_OBJECT_CONVERTERS.get(clazz) != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  43 */   private static final Map<Class<?>, Integer> BOOLEAN_DISTANCE_MAP = new HashMap<>();
/*     */   static {
/*  45 */     BOOLEAN_DISTANCE_MAP.put(Boolean.class, Integer.valueOf(1));
/*  46 */     BOOLEAN_DISTANCE_MAP.put(boolean.class, Integer.valueOf(1));
/*  47 */     BOOLEAN_DISTANCE_MAP.put(Object.class, Integer.valueOf(2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  53 */   private static final Map<Class<?>, Integer> NUMBER_DISTANCE_MAP = new HashMap<>();
/*     */   static {
/*  55 */     NUMBER_DISTANCE_MAP.put(Byte.class, Integer.valueOf(1));
/*  56 */     NUMBER_DISTANCE_MAP.put(byte.class, Integer.valueOf(1));
/*  57 */     NUMBER_DISTANCE_MAP.put(Short.class, Integer.valueOf(1));
/*  58 */     NUMBER_DISTANCE_MAP.put(short.class, Integer.valueOf(1));
/*  59 */     NUMBER_DISTANCE_MAP.put(Integer.class, Integer.valueOf(1));
/*  60 */     NUMBER_DISTANCE_MAP.put(int.class, Integer.valueOf(1));
/*  61 */     NUMBER_DISTANCE_MAP.put(Long.class, Integer.valueOf(1));
/*  62 */     NUMBER_DISTANCE_MAP.put(long.class, Integer.valueOf(1));
/*  63 */     NUMBER_DISTANCE_MAP.put(Float.class, Integer.valueOf(1));
/*  64 */     NUMBER_DISTANCE_MAP.put(float.class, Integer.valueOf(1));
/*  65 */     NUMBER_DISTANCE_MAP.put(Double.class, Integer.valueOf(1));
/*  66 */     NUMBER_DISTANCE_MAP.put(double.class, Integer.valueOf(1));
/*  67 */     NUMBER_DISTANCE_MAP.put(BigInteger.class, Integer.valueOf(1));
/*  68 */     NUMBER_DISTANCE_MAP.put(BigDecimal.class, Integer.valueOf(1));
/*  69 */     NUMBER_DISTANCE_MAP.put(Character.class, Integer.valueOf(1));
/*  70 */     NUMBER_DISTANCE_MAP.put(char.class, Integer.valueOf(1));
/*  71 */     NUMBER_DISTANCE_MAP.put(Object.class, Integer.valueOf(2));
/*  72 */     NUMBER_DISTANCE_MAP.put(String.class, Integer.valueOf(3));
/*     */     
/*  74 */     NUMBER_DISTANCE_MAP.put(byte[].class, Integer.valueOf(3));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  81 */   private static final Map<Class<?>, Integer> STRING_DISTANCE_MAP = new HashMap<>();
/*     */   static {
/*  83 */     STRING_DISTANCE_MAP.put(String.class, Integer.valueOf(1));
/*     */     
/*  85 */     STRING_DISTANCE_MAP.put(byte[].class, Integer.valueOf(1));
/*     */     
/*  87 */     STRING_DISTANCE_MAP.put(Object.class, Integer.valueOf(2));
/*  88 */     STRING_DISTANCE_MAP.put(Byte.class, Integer.valueOf(3));
/*  89 */     STRING_DISTANCE_MAP.put(byte.class, Integer.valueOf(3));
/*  90 */     STRING_DISTANCE_MAP.put(Short.class, Integer.valueOf(3));
/*  91 */     STRING_DISTANCE_MAP.put(short.class, Integer.valueOf(3));
/*  92 */     STRING_DISTANCE_MAP.put(Integer.class, Integer.valueOf(3));
/*  93 */     STRING_DISTANCE_MAP.put(int.class, Integer.valueOf(3));
/*  94 */     STRING_DISTANCE_MAP.put(Long.class, Integer.valueOf(3));
/*  95 */     STRING_DISTANCE_MAP.put(long.class, Integer.valueOf(3));
/*  96 */     STRING_DISTANCE_MAP.put(Float.class, Integer.valueOf(3));
/*  97 */     STRING_DISTANCE_MAP.put(float.class, Integer.valueOf(3));
/*  98 */     STRING_DISTANCE_MAP.put(Double.class, Integer.valueOf(3));
/*  99 */     STRING_DISTANCE_MAP.put(double.class, Integer.valueOf(3));
/* 100 */     STRING_DISTANCE_MAP.put(BigInteger.class, Integer.valueOf(3));
/* 101 */     STRING_DISTANCE_MAP.put(BigDecimal.class, Integer.valueOf(3));
/* 102 */     STRING_DISTANCE_MAP.put(Character.class, Integer.valueOf(3));
/* 103 */     STRING_DISTANCE_MAP.put(char.class, Integer.valueOf(3));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 109 */   private static final Map<Class<?>, Integer> FUNCTION_DISTANCE_MAP = new HashMap<>();
/*     */   static {
/* 111 */     FUNCTION_DISTANCE_MAP.put(JavaFunction.class, Integer.valueOf(1));
/* 112 */     FUNCTION_DISTANCE_MAP.put(Object.class, Integer.valueOf(2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 118 */   private static final Map<Class<?>, LuaValueConverter<?>> LUA_VALUE_CONVERTERS = new HashMap<>();
/*     */   static {
/* 120 */     LuaValueConverter<Boolean> luaValueConverter = (luaState, index) -> Boolean.valueOf(luaState.toBoolean(index));
/* 121 */     LUA_VALUE_CONVERTERS.put(Boolean.class, luaValueConverter);
/* 122 */     LUA_VALUE_CONVERTERS.put(boolean.class, luaValueConverter);
/*     */     
/* 124 */     LuaValueConverter<Byte> byteConverter = (luaState, index) -> Byte.valueOf((byte)(int)luaState.toInteger(index));
/* 125 */     LUA_VALUE_CONVERTERS.put(Byte.class, byteConverter);
/* 126 */     LUA_VALUE_CONVERTERS.put(byte.class, byteConverter);
/* 127 */     LuaValueConverter<Short> shortConverter = (luaState, index) -> Short.valueOf((short)(int)luaState.toInteger(index));
/* 128 */     LUA_VALUE_CONVERTERS.put(Short.class, shortConverter);
/* 129 */     LUA_VALUE_CONVERTERS.put(short.class, shortConverter);
/* 130 */     LuaValueConverter<Integer> luaValueConverter1 = (luaState, index) -> Integer.valueOf((int)luaState.toInteger(index));
/* 131 */     LUA_VALUE_CONVERTERS.put(Integer.class, luaValueConverter1);
/* 132 */     LUA_VALUE_CONVERTERS.put(int.class, luaValueConverter1);
/* 133 */     LuaValueConverter<Long> longConverter = (luaState, index) -> Long.valueOf(luaState.toInteger(index));
/* 134 */     LUA_VALUE_CONVERTERS.put(Long.class, longConverter);
/* 135 */     LUA_VALUE_CONVERTERS.put(long.class, longConverter);
/* 136 */     LuaValueConverter<Float> floatConverter = (luaState, index) -> Float.valueOf((float)luaState.toNumber(index));
/* 137 */     LUA_VALUE_CONVERTERS.put(Float.class, floatConverter);
/* 138 */     LUA_VALUE_CONVERTERS.put(float.class, floatConverter);
/* 139 */     LuaValueConverter<Double> doubleConverter = (luaState, index) -> Double.valueOf(luaState.toNumber(index));
/* 140 */     LUA_VALUE_CONVERTERS.put(Double.class, doubleConverter);
/* 141 */     LUA_VALUE_CONVERTERS.put(double.class, doubleConverter);
/* 142 */     LuaValueConverter<BigInteger> luaValueConverter2 = (luaState, index) -> BigDecimal.valueOf(luaState.toNumber(index)).setScale(0, 6).toBigInteger();
/*     */     
/* 144 */     LUA_VALUE_CONVERTERS.put(BigInteger.class, luaValueConverter2);
/* 145 */     LuaValueConverter<BigDecimal> bigDecimalConverter = (luaState, index) -> BigDecimal.valueOf(luaState.toNumber(index));
/* 146 */     LUA_VALUE_CONVERTERS.put(BigDecimal.class, bigDecimalConverter);
/* 147 */     LuaValueConverter<Character> luaValueConverter3 = (luaState, index) -> Character.valueOf((char)(int)luaState.toInteger(index));
/* 148 */     LUA_VALUE_CONVERTERS.put(Character.class, luaValueConverter3);
/* 149 */     LUA_VALUE_CONVERTERS.put(char.class, luaValueConverter3);
/* 150 */     LuaValueConverter<String> luaValueConverter4 = (luaState, index) -> luaState.toString(index);
/* 151 */     LUA_VALUE_CONVERTERS.put(String.class, luaValueConverter4);
/*     */     
/* 153 */     LuaValueConverter<byte[]> luaValueConverter5 = (luaState, index) -> luaState.toByteArray(index);
/* 154 */     LUA_VALUE_CONVERTERS.put(byte[].class, luaValueConverter5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 161 */   private static final Map<Class<?>, JavaObjectConverter<?>> JAVA_OBJECT_CONVERTERS = new HashMap<>();
/*     */   static {
/* 163 */     JavaObjectConverter<Boolean> booleanConverter = (luaState, booleanValue) -> luaState.pushBoolean(booleanValue.booleanValue());
/* 164 */     JAVA_OBJECT_CONVERTERS.put(Boolean.class, booleanConverter);
/* 165 */     JAVA_OBJECT_CONVERTERS.put(boolean.class, booleanConverter);
/* 166 */     JavaObjectConverter<Number> integerConverter = (luaState, number) -> luaState.pushInteger(number.longValue());
/* 167 */     JAVA_OBJECT_CONVERTERS.put(Byte.class, integerConverter);
/* 168 */     JAVA_OBJECT_CONVERTERS.put(byte.class, integerConverter);
/* 169 */     JAVA_OBJECT_CONVERTERS.put(Short.class, integerConverter);
/* 170 */     JAVA_OBJECT_CONVERTERS.put(short.class, integerConverter);
/* 171 */     JAVA_OBJECT_CONVERTERS.put(Integer.class, integerConverter);
/* 172 */     JAVA_OBJECT_CONVERTERS.put(int.class, integerConverter);
/* 173 */     JAVA_OBJECT_CONVERTERS.put(Long.class, integerConverter);
/* 174 */     JAVA_OBJECT_CONVERTERS.put(long.class, integerConverter);
/* 175 */     JavaObjectConverter<Number> numberConverter = (luaState, number) -> luaState.pushNumber(number.doubleValue());
/* 176 */     JAVA_OBJECT_CONVERTERS.put(Float.class, numberConverter);
/* 177 */     JAVA_OBJECT_CONVERTERS.put(float.class, numberConverter);
/* 178 */     JAVA_OBJECT_CONVERTERS.put(Double.class, numberConverter);
/* 179 */     JAVA_OBJECT_CONVERTERS.put(double.class, numberConverter);
/* 180 */     JAVA_OBJECT_CONVERTERS.put(BigDecimal.class, numberConverter);
/* 181 */     JavaObjectConverter<BigInteger> bigIntegerConverter = (luaState, number) -> {
/*     */         try {
/*     */           luaState.pushInteger(number.longValueExact());
/* 184 */         } catch (ArithmeticException e) {
/*     */           luaState.pushNumber(number.doubleValue());
/*     */         } 
/*     */       };
/* 188 */     JAVA_OBJECT_CONVERTERS.put(BigInteger.class, bigIntegerConverter);
/* 189 */     JavaObjectConverter<Character> characterConverter = (luaState, character) -> luaState.pushInteger(character.charValue());
/* 190 */     JAVA_OBJECT_CONVERTERS.put(Character.class, characterConverter);
/* 191 */     JAVA_OBJECT_CONVERTERS.put(char.class, characterConverter);
/* 192 */     JavaObjectConverter<String> stringConverter = (luaState, string) -> luaState.pushString(string);
/* 193 */     JAVA_OBJECT_CONVERTERS.put(String.class, stringConverter);
/*     */     
/* 195 */     JavaObjectConverter<byte[]> byteArrayConverter = (luaState, byteArray) -> luaState.pushByteArray(byteArray);
/* 196 */     JAVA_OBJECT_CONVERTERS.put(byte[].class, byteArrayConverter);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DefaultConverter getInstance() {
/* 207 */     return INSTANCE;
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
/*     */   public int getTypeDistance(LuaState luaState, int index, Class<?> formalType) {
/*     */     Integer distance;
/*     */     Object object;
/* 221 */     LuaType luaType = luaState.type(index);
/* 222 */     if (luaType == null) {
/* 223 */       return Integer.MAX_VALUE;
/*     */     }
/*     */ 
/*     */     
/* 227 */     if (formalType == void.class) {
/* 228 */       return Integer.MAX_VALUE;
/*     */     }
/*     */ 
/*     */     
/* 232 */     if (formalType == LuaValueProxy.class) {
/* 233 */       return 0;
/*     */     }
/*     */ 
/*     */     
/* 237 */     switch (luaType) {
/*     */       case NIL:
/* 239 */         return 1;
/*     */       case BOOLEAN:
/* 241 */         distance = BOOLEAN_DISTANCE_MAP.get(formalType);
/* 242 */         if (distance != null) {
/* 243 */           return distance.intValue();
/*     */         }
/*     */         break;
/*     */       case NUMBER:
/* 247 */         distance = NUMBER_DISTANCE_MAP.get(formalType);
/* 248 */         if (distance != null) {
/* 249 */           return distance.intValue();
/*     */         }
/*     */         break;
/*     */       case STRING:
/* 253 */         distance = STRING_DISTANCE_MAP.get(formalType);
/* 254 */         if (distance != null) {
/* 255 */           return distance.intValue();
/*     */         }
/*     */         break;
/*     */       case TABLE:
/* 259 */         if (formalType == Map.class || formalType == List.class || formalType
/* 260 */           .isArray()) {
/* 261 */           return 1;
/*     */         }
/* 263 */         if (formalType == Object.class) {
/* 264 */           return 2;
/*     */         }
/*     */         break;
/*     */       case FUNCTION:
/* 268 */         if (luaState.isJavaFunction(index)) {
/* 269 */           distance = FUNCTION_DISTANCE_MAP.get(formalType);
/* 270 */           if (distance != null) {
/* 271 */             return distance.intValue();
/*     */           }
/*     */         } 
/*     */         break;
/*     */       case USERDATA:
/* 276 */         object = luaState.toJavaObjectRaw(index);
/* 277 */         if (object != null) {
/*     */           Class<?> type;
/* 279 */           if (object instanceof TypedJavaObject) {
/* 280 */             TypedJavaObject typedJavaObject = (TypedJavaObject)object;
/* 281 */             if (typedJavaObject.isStrong() && 
/* 282 */               formalType.isAssignableFrom(typedJavaObject
/* 283 */                 .getClass())) {
/* 284 */               return 1;
/*     */             }
/*     */             
/* 287 */             type = typedJavaObject.getType();
/*     */           } else {
/* 289 */             type = object.getClass();
/*     */           } 
/* 291 */           if (formalType.isAssignableFrom(type)) {
/* 292 */             return 1;
/*     */           }
/*     */         } 
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/* 299 */     if (formalType == Object.class) {
/* 300 */       return 2147483646;
/*     */     }
/*     */ 
/*     */     
/* 304 */     return Integer.MAX_VALUE;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> T convertLuaValue(LuaState luaState, int index, Class<T> formalType) {
/*     */     LuaValueConverter<?> luaValueConverter;
/*     */     Object object;
/* 312 */     LuaType luaType = luaState.type(index);
/* 313 */     if (luaType == null) {
/* 314 */       throw new IllegalArgumentException("undefined index: " + index);
/*     */     }
/*     */ 
/*     */     
/* 318 */     if (formalType == void.class) {
/* 319 */       throw new ClassCastException(String.format("cannot convert %s to %s", new Object[] { luaState
/* 320 */               .typeName(index), formalType
/* 321 */               .getCanonicalName() }));
/*     */     }
/*     */ 
/*     */     
/* 325 */     if (formalType == LuaValueProxy.class) {
/* 326 */       return (T)luaState.getProxy(index);
/*     */     }
/*     */ 
/*     */     
/* 330 */     switch (luaType) {
/*     */       case NIL:
/* 332 */         return null;
/*     */       
/*     */       case BOOLEAN:
/* 335 */         luaValueConverter = LUA_VALUE_CONVERTERS.get(formalType);
/* 336 */         if (luaValueConverter != null) {
/* 337 */           return (T)luaValueConverter.convert(luaState, index);
/*     */         }
/* 339 */         if (formalType == Object.class) {
/* 340 */           return (T)Boolean.valueOf(luaState.toBoolean(index));
/*     */         }
/*     */         break;
/*     */       case NUMBER:
/* 344 */         luaValueConverter = LUA_VALUE_CONVERTERS.get(formalType);
/* 345 */         if (luaValueConverter != null) {
/* 346 */           return (T)luaValueConverter.convert(luaState, index);
/*     */         }
/* 348 */         if (formalType == Object.class) {
/* 349 */           if (luaState.isInteger(index)) {
/* 350 */             return (T)Long.valueOf(luaState.toInteger(index));
/*     */           }
/* 352 */           return (T)Double.valueOf(luaState.toNumber(index));
/*     */         } 
/*     */         break;
/*     */       
/*     */       case STRING:
/* 357 */         luaValueConverter = LUA_VALUE_CONVERTERS.get(formalType);
/* 358 */         if (luaValueConverter != null) {
/* 359 */           return (T)luaValueConverter.convert(luaState, index);
/*     */         }
/* 361 */         if (formalType == Object.class) {
/* 362 */           byte[] result = luaState.toByteArray(index);
/* 363 */           String string = new String(result, StandardCharsets.UTF_8);
/* 364 */           if ((string.getBytes(StandardCharsets.UTF_8)).length != result.length) {
/* 365 */             return (T)result;
/*     */           }
/* 367 */           return (T)string;
/*     */         } 
/*     */         break;
/*     */       case TABLE:
/* 371 */         if (formalType == Map.class || formalType == Object.class) {
/* 372 */           final LuaValueProxy luaValueProxy = luaState.getProxy(index);
/* 373 */           return (T)new AbstractTableMap<Object>()
/*     */             {
/*     */               protected Object convertKey(int index) {
/* 376 */                 return getLuaState().toJavaObject(index, Object.class);
/*     */               }
/*     */ 
/*     */               
/*     */               public LuaState getLuaState() {
/* 381 */                 return luaValueProxy.getLuaState();
/*     */               }
/*     */ 
/*     */               
/*     */               public void pushValue() {
/* 386 */                 luaValueProxy.pushValue();
/*     */               }
/*     */             };
/*     */         } 
/* 390 */         if (formalType == List.class) {
/* 391 */           final LuaValueProxy luaValueProxy = luaState.getProxy(index);
/* 392 */           return (T)new AbstractTableList()
/*     */             {
/*     */               public LuaState getLuaState() {
/* 395 */                 return luaValueProxy.getLuaState();
/*     */               }
/*     */ 
/*     */               
/*     */               public void pushValue() {
/* 400 */                 luaValueProxy.pushValue();
/*     */               }
/*     */             };
/*     */         } 
/* 404 */         if (formalType.isArray()) {
/* 405 */           int length = luaState.rawLen(index);
/* 406 */           Class<?> componentType = formalType.getComponentType();
/* 407 */           Object array = Array.newInstance(formalType.getComponentType(), length);
/*     */           
/* 409 */           for (int i = 0; i < length; i++) {
/* 410 */             luaState.rawGet(index, i + 1);
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 418 */           return (T)array;
/*     */         } 
/*     */         break;
/*     */       case FUNCTION:
/* 422 */         if (luaState.isJavaFunction(index) && (
/* 423 */           formalType == JavaFunction.class || formalType == Object.class))
/*     */         {
/* 425 */           return (T)luaState.toJavaFunction(index);
/*     */         }
/*     */         break;
/*     */       
/*     */       case USERDATA:
/* 430 */         object = luaState.toJavaObjectRaw(index);
/* 431 */         if (object != null) {
/* 432 */           if (object instanceof TypedJavaObject) {
/* 433 */             TypedJavaObject typedJavaObject = (TypedJavaObject)object;
/* 434 */             if (typedJavaObject.isStrong() && 
/* 435 */               formalType.isAssignableFrom(typedJavaObject
/* 436 */                 .getClass())) {
/* 437 */               return (T)typedJavaObject;
/*     */             }
/*     */             
/* 440 */             return (T)((TypedJavaObject)object).getObject();
/*     */           } 
/* 442 */           return (T)object;
/*     */         } 
/*     */         break;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 449 */     if (formalType == Object.class) {
/* 450 */       return (T)luaState.getProxy(index);
/*     */     }
/*     */ 
/*     */     
/* 454 */     throw new ClassCastException(String.format("cannot convert %s to %s", new Object[] { luaState
/* 455 */             .typeName(index), formalType.getCanonicalName() }));
/*     */   }
/*     */   @FunctionalInterface
/*     */   private static interface LuaValueConverter<T> {
/*     */     T convert(LuaState param1LuaState, int param1Int); }
/*     */   
/*     */   public void convertJavaObject(LuaState luaState, Object object) {
/* 462 */     if (object == null) {
/* 463 */       luaState.pushNil();
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 469 */     JavaObjectConverter<Object> javaObjectConverter = (JavaObjectConverter<Object>)JAVA_OBJECT_CONVERTERS.get(object.getClass());
/* 470 */     if (javaObjectConverter != null) {
/* 471 */       javaObjectConverter.convert(luaState, object);
/*     */       return;
/*     */     } 
/* 474 */     if (object instanceof JavaFunction) {
/* 475 */       luaState.pushJavaFunction((JavaFunction)object);
/*     */       return;
/*     */     } 
/* 478 */     if (object instanceof LuaValueProxy) {
/* 479 */       LuaValueProxy luaValueProxy = (LuaValueProxy)object;
/* 480 */       if (!luaValueProxy.getLuaState().equals(luaState)) {
/* 481 */         throw new IllegalArgumentException("Lua value proxy is from a different Lua state");
/*     */       }
/*     */       
/* 484 */       luaValueProxy.pushValue();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 489 */     luaState.pushJavaObjectRaw(object);
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   private static interface JavaObjectConverter<T> {
/*     */     void convert(LuaState param1LuaState, T param1T);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\DefaultConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */