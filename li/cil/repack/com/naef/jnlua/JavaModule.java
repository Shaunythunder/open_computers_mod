/*     */ package li.cil.repack.com.naef.jnlua;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class JavaModule
/*     */ {
/*  22 */   private static final JavaModule INSTANCE = new JavaModule();
/*  23 */   private static final Map<String, Class<?>> PRIMITIVE_TYPES = new HashMap<>();
/*     */   static {
/*  25 */     PRIMITIVE_TYPES.put("boolean", boolean.class);
/*  26 */     PRIMITIVE_TYPES.put("byte", byte.class);
/*  27 */     PRIMITIVE_TYPES.put("char", char.class);
/*  28 */     PRIMITIVE_TYPES.put("double", double.class);
/*  29 */     PRIMITIVE_TYPES.put("float", float.class);
/*  30 */     PRIMITIVE_TYPES.put("int", int.class);
/*  31 */     PRIMITIVE_TYPES.put("long", long.class);
/*  32 */     PRIMITIVE_TYPES.put("short", short.class);
/*  33 */     PRIMITIVE_TYPES.put("void", void.class);
/*     */   }
/*     */ 
/*     */   
/*  37 */   private final NamedJavaFunction[] functions = new NamedJavaFunction[] { new Require(), new New(), new InstanceOf(), new Cast(), new Proxy(), new Pairs(), new IPairs(), new ToTable(), new Elements(), new Fields(), new Methods(), new Properties() };
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
/*     */   public static JavaModule getInstance() {
/*  49 */     return INSTANCE;
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
/*     */   public void open(LuaState luaState) {
/*  71 */     luaState.register("java", this.functions, true);
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
/*     */   public TypedJavaObject toTable(Map<?, ?> map) {
/*  84 */     return ToTable.toTable(map);
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
/*     */   public TypedJavaObject toTable(List<?> list) {
/*  97 */     return ToTable.toTable(list);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static Class<?> loadType(LuaState luaState, String typeName) {
/*     */     Class<?> clazz;
/* 106 */     if ((clazz = PRIMITIVE_TYPES.get(typeName)) != null) {
/* 107 */       return clazz;
/*     */     }
/*     */     try {
/* 110 */       clazz = luaState.getClassLoader().loadClass(typeName);
/* 111 */       return clazz;
/* 112 */     } catch (ClassNotFoundException e) {
/* 113 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static class Require
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Require() {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 129 */       String className = luaState.checkString(1);
/* 130 */       boolean doImport = luaState.toBoolean(2);
/*     */ 
/*     */       
/* 133 */       Class<?> clazz = JavaModule.loadType(luaState, className);
/* 134 */       luaState.pushJavaObject(clazz);
/*     */ 
/*     */       
/* 137 */       if (doImport) {
/* 138 */         luaState.rawGet(luaState.getRegistryIndex(), 2);
/* 139 */         String name = clazz.getName();
/* 140 */         int index = name.indexOf('.');
/* 141 */         while (index >= 0) {
/* 142 */           String part = name.substring(0, index);
/* 143 */           luaState.getField(-1, part);
/* 144 */           if (!luaState.isTable(-1)) {
/* 145 */             luaState.pop(1);
/* 146 */             luaState.newTable();
/* 147 */             luaState.pushValue(-1);
/* 148 */             luaState.setField(-3, part);
/*     */           } 
/* 150 */           luaState.remove(-2);
/* 151 */           name = name.substring(index + 1);
/* 152 */           index = name.indexOf('.');
/*     */         } 
/* 154 */         luaState.pushValue(-2);
/* 155 */         luaState.setField(-2, name);
/* 156 */         luaState.pop(1);
/*     */       } 
/* 158 */       luaState.pushBoolean(doImport);
/*     */ 
/*     */       
/* 161 */       return 2;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 166 */       return "require";
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class New
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private New() {}
/*     */ 
/*     */ 
/*     */     
/*     */     public int invoke(LuaState luaState) {
/*     */       Class<?> clazz;
/* 181 */       if (luaState.isJavaObject(1, Class.class)) {
/* 182 */         clazz = luaState.<Class<?>>checkJavaObject(1, Class.class);
/*     */       } else {
/* 184 */         String className = luaState.checkString(1);
/* 185 */         clazz = JavaModule.loadType(luaState, className);
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 190 */       int dimensionCount = luaState.getTop() - 1;
/* 191 */       switch (dimensionCount)
/*     */       { case 0:
/*     */           try {
/* 194 */             object = clazz.newInstance();
/* 195 */           } catch (InstantiationException e) {
/* 196 */             throw new RuntimeException(e);
/* 197 */           } catch (IllegalAccessException e) {
/* 198 */             throw new RuntimeException(e);
/*     */           } 
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
/* 213 */           luaState.pushJavaObject(object);
/* 214 */           return 1;case 1: object = Array.newInstance(clazz, luaState.checkInt32(2)); luaState.pushJavaObject(object); return 1; }  int[] dimensions = new int[dimensionCount]; for (int i = 0; i < dimensionCount; i++) dimensions[i] = luaState.checkInt32(i + 2);  Object object = Array.newInstance(clazz, dimensions); luaState.pushJavaObject(object); return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 219 */       return "new";
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class InstanceOf
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private InstanceOf() {}
/*     */ 
/*     */     
/*     */     public int invoke(LuaState luaState) {
/*     */       Class<?> clazz;
/* 233 */       Object object = luaState.checkJavaObject(1, Object.class);
/*     */ 
/*     */ 
/*     */       
/* 237 */       if (luaState.isJavaObject(2, Class.class)) {
/* 238 */         clazz = luaState.<Class<?>>checkJavaObject(2, Class.class);
/*     */       } else {
/* 240 */         String className = luaState.checkString(2);
/* 241 */         clazz = JavaModule.loadType(luaState, className);
/*     */       } 
/*     */ 
/*     */       
/* 245 */       luaState.pushBoolean(clazz.isInstance(object));
/* 246 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 251 */       return "instanceof";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Cast
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Cast() {}
/*     */ 
/*     */     
/*     */     public int invoke(LuaState luaState) {
/*     */       final Class<?> clazz;
/* 264 */       if (luaState.isJavaObject(2, Class.class)) {
/* 265 */         clazz = luaState.<Class<?>>checkJavaObject(2, Class.class);
/*     */       } else {
/* 267 */         String className = luaState.checkString(2);
/* 268 */         clazz = JavaModule.loadType(luaState, className);
/*     */       } 
/*     */ 
/*     */       
/* 272 */       final Object object = luaState.checkJavaObject(1, clazz);
/*     */ 
/*     */       
/* 275 */       luaState.pushJavaObject(new TypedJavaObject()
/*     */           {
/*     */             public Object getObject() {
/* 278 */               return object;
/*     */             }
/*     */ 
/*     */             
/*     */             public Class<?> getType() {
/* 283 */               return clazz;
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean isStrong() {
/* 288 */               return false;
/*     */             }
/*     */           });
/* 291 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 296 */       return "cast";
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class Proxy
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Proxy() {}
/*     */ 
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 309 */       luaState.checkType(1, LuaType.TABLE);
/*     */ 
/*     */       
/* 312 */       int interfaceCount = luaState.getTop() - 1;
/* 313 */       luaState.checkArg(2, (interfaceCount > 0), "no interface specified");
/* 314 */       Class<?>[] interfaces = new Class[interfaceCount];
/* 315 */       for (int i = 0; i < interfaceCount; i++) {
/* 316 */         if (luaState.isJavaObject(i + 2, Class.class)) {
/* 317 */           interfaces[i] = luaState
/* 318 */             .<Class<?>>checkJavaObject(i + 2, Class.class);
/*     */         } else {
/* 320 */           String interfaceName = luaState.checkString(i + 2);
/* 321 */           interfaces[i] = JavaModule.loadType(luaState, interfaceName);
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 326 */       luaState.pushJavaObjectRaw(luaState.getProxy(1, interfaces));
/* 327 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 332 */       return "proxy";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Pairs
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Pairs() {}
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 343 */       luaState.checkArg(1, luaState
/*     */           
/* 345 */           .isJavaObjectRaw(1), 
/* 346 */           String.format("Java object expected, got %s", new Object[] {
/* 347 */               luaState.typeName(1) }));
/* 348 */       JavaFunction metamethod = luaState.getMetamethod(luaState
/* 349 */           .toJavaObjectRaw(1), JavaReflector.Metamethod.PAIRS);
/* 350 */       return metamethod.invoke(luaState);
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 355 */       return "pairs";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class IPairs
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private IPairs() {}
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 366 */       luaState.checkArg(1, luaState
/*     */           
/* 368 */           .isJavaObjectRaw(1), 
/* 369 */           String.format("Java object expected, got %s", new Object[] {
/* 370 */               luaState.typeName(1) }));
/* 371 */       JavaFunction metamethod = luaState.getMetamethod(luaState
/* 372 */           .toJavaObjectRaw(1), JavaReflector.Metamethod.IPAIRS);
/* 373 */       return metamethod.invoke(luaState);
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 378 */       return "ipairs";
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static class ToTable
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private ToTable() {}
/*     */ 
/*     */ 
/*     */     
/*     */     public static TypedJavaObject toTable(Map<?, ?> map) {
/* 392 */       return new LuaMap((Map)map);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static TypedJavaObject toTable(List<?> list) {
/* 400 */       return new LuaList((List)list);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 407 */       if (luaState.isJavaObject(1, Map.class)) {
/* 408 */         Map<Object, Object> map = luaState.<Map<Object, Object>>toJavaObject(1, (Class)Map.class);
/* 409 */         luaState.pushJavaObject(new LuaMap(map));
/* 410 */       } else if (luaState.isJavaObject(1, List.class)) {
/* 411 */         List<Object> list = luaState.<List<Object>>toJavaObject(1, (Class)List.class);
/* 412 */         luaState.pushJavaObject(new LuaList(list));
/*     */       } else {
/* 414 */         luaState.checkArg(1, false, 
/*     */ 
/*     */             
/* 417 */             String.format("expected map or list, got %s", new Object[] {
/* 418 */                 luaState.typeName(1) }));
/*     */       } 
/* 420 */       return 1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 425 */       return "totable";
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static class LuaMap
/*     */       implements JavaReflector, TypedJavaObject
/*     */     {
/* 434 */       private static final JavaFunction INDEX = new Index();
/* 435 */       private static final JavaFunction NEW_INDEX = new NewIndex();
/*     */ 
/*     */ 
/*     */       
/*     */       private Map<Object, Object> map;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public LuaMap(Map<Object, Object> map) {
/* 445 */         this.map = map;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Map<Object, Object> getMap() {
/* 453 */         return this.map;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public JavaFunction getMetamethod(JavaReflector.Metamethod metamethod) {
/* 459 */         switch (metamethod) {
/*     */           case INDEX:
/* 461 */             return INDEX;
/*     */           case NEWINDEX:
/* 463 */             return NEW_INDEX;
/*     */         } 
/* 465 */         return null;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Object getObject() {
/* 472 */         return this.map;
/*     */       }
/*     */ 
/*     */       
/*     */       public Class<?> getType() {
/* 477 */         return Map.class;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean isStrong() {
/* 482 */         return true;
/*     */       }
/*     */ 
/*     */       
/*     */       private static class Index
/*     */         implements JavaFunction
/*     */       {
/*     */         private Index() {}
/*     */ 
/*     */         
/*     */         public int invoke(LuaState luaState) {
/* 493 */           JavaModule.ToTable.LuaMap luaMap = (JavaModule.ToTable.LuaMap)luaState.toJavaObjectRaw(1);
/* 494 */           Object key = luaState.toJavaObject(2, Object.class);
/* 495 */           if (key == null) {
/* 496 */             throw new LuaRuntimeException(String.format("attempt to read map with %s accessor", new Object[] { luaState
/*     */                     
/* 498 */                     .typeName(2) }));
/*     */           }
/* 500 */           luaState.pushJavaObject(luaMap.getMap().get(key));
/* 501 */           return 1;
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       private static class NewIndex
/*     */         implements JavaFunction
/*     */       {
/*     */         private NewIndex() {}
/*     */         
/*     */         public int invoke(LuaState luaState) {
/* 512 */           JavaModule.ToTable.LuaMap luaMap = (JavaModule.ToTable.LuaMap)luaState.toJavaObjectRaw(1);
/* 513 */           Object key = luaState.toJavaObject(2, Object.class);
/* 514 */           if (key == null) {
/* 515 */             throw new LuaRuntimeException(String.format("attempt to write map with %s accessor", new Object[] { luaState
/*     */                     
/* 517 */                     .typeName(2) }));
/*     */           }
/* 519 */           Object value = luaState.toJavaObject(3, Object.class);
/* 520 */           if (value != null) {
/* 521 */             luaMap.getMap().put(key, value);
/*     */           } else {
/* 523 */             luaMap.getMap().remove(key);
/*     */           } 
/* 525 */           return 0;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static class LuaList
/*     */       implements JavaReflector, TypedJavaObject
/*     */     {
/* 535 */       private static final JavaFunction INDEX = new Index();
/* 536 */       private static final JavaFunction NEW_INDEX = new NewIndex();
/* 537 */       private static final JavaFunction LENGTH = new Length();
/*     */ 
/*     */ 
/*     */       
/*     */       private List<Object> list;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public LuaList(List<Object> list) {
/* 547 */         this.list = list;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public List<Object> getList() {
/* 555 */         return this.list;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public JavaFunction getMetamethod(JavaReflector.Metamethod metamethod) {
/* 561 */         switch (metamethod) {
/*     */           case INDEX:
/* 563 */             return INDEX;
/*     */           case NEWINDEX:
/* 565 */             return NEW_INDEX;
/*     */           case LEN:
/* 567 */             return LENGTH;
/*     */         } 
/* 569 */         return null;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Object getObject() {
/* 576 */         return this.list;
/*     */       }
/*     */ 
/*     */       
/*     */       public Class<?> getType() {
/* 581 */         return List.class;
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean isStrong() {
/* 586 */         return true;
/*     */       }
/*     */ 
/*     */       
/*     */       private static class Index
/*     */         implements JavaFunction
/*     */       {
/*     */         private Index() {}
/*     */ 
/*     */         
/*     */         public int invoke(LuaState luaState) {
/* 597 */           JavaModule.ToTable.LuaList luaList = (JavaModule.ToTable.LuaList)luaState.toJavaObjectRaw(1);
/* 598 */           if (!luaState.isNumber(2)) {
/* 599 */             throw new LuaRuntimeException(String.format("attempt to read list with %s accessor", new Object[] { luaState
/*     */                     
/* 601 */                     .typeName(2) }));
/*     */           }
/* 603 */           long index = luaState.toInteger(2);
/* 604 */           luaState.pushJavaObject(luaList.getList().get((int)(index - 1L)));
/* 605 */           return 1;
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       private static class NewIndex
/*     */         implements JavaFunction
/*     */       {
/*     */         private NewIndex() {}
/*     */         
/*     */         public int invoke(LuaState luaState) {
/* 616 */           JavaModule.ToTable.LuaList luaList = (JavaModule.ToTable.LuaList)luaState.toJavaObjectRaw(1);
/* 617 */           if (!luaState.isNumber(2)) {
/* 618 */             throw new LuaRuntimeException(String.format("attempt to write list with %s accessor", new Object[] { luaState
/*     */                     
/* 620 */                     .typeName(2) }));
/*     */           }
/* 622 */           long index = luaState.toInteger(2);
/* 623 */           Object value = luaState.toJavaObject(3, Object.class);
/* 624 */           if (value != null) {
/* 625 */             int size = luaList.getList().size();
/* 626 */             if (index - 1L != size) {
/* 627 */               luaList.getList().set((int)(index - 1L), value);
/*     */             } else {
/* 629 */               luaList.getList().add(value);
/*     */             } 
/*     */           } else {
/* 632 */             luaList.getList().remove((int)(index - 1L));
/*     */           } 
/* 634 */           return 0;
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       private static class Length
/*     */         implements JavaFunction
/*     */       {
/*     */         private Length() {}
/*     */         
/*     */         public int invoke(LuaState luaState) {
/* 645 */           JavaModule.ToTable.LuaList luaList = (JavaModule.ToTable.LuaList)luaState.toJavaObjectRaw(1);
/* 646 */           luaState.pushInteger(luaList.getList().size());
/* 647 */           return 1;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Elements
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Elements() {}
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 660 */       Iterable<?> iterable = luaState.<Iterable>checkJavaObject(1, Iterable.class);
/* 661 */       luaState.pushJavaObject(new ElementIterator(iterable.iterator()));
/* 662 */       luaState.pushJavaObject(iterable);
/* 663 */       luaState.pushNil();
/* 664 */       return 3;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 669 */       return "elements";
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static class ElementIterator
/*     */       implements JavaFunction
/*     */     {
/*     */       private Iterator<?> iterator;
/*     */ 
/*     */ 
/*     */       
/*     */       public ElementIterator(Iterator<?> iterator) {
/* 682 */         this.iterator = iterator;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public int invoke(LuaState luaState) {
/* 688 */         if (this.iterator.hasNext()) {
/* 689 */           luaState.pushJavaObject(this.iterator.next());
/*     */         } else {
/* 691 */           luaState.pushNil();
/*     */         } 
/* 693 */         return 1;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Fields
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Fields() {}
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 705 */       luaState.checkArg(1, luaState
/*     */           
/* 707 */           .isJavaObjectRaw(1), 
/* 708 */           String.format("expected Java object, got %s", new Object[] {
/* 709 */               luaState.typeName(1) }));
/* 710 */       JavaFunction metamethod = luaState.getMetamethod(luaState
/* 711 */           .toJavaObjectRaw(1), JavaReflector.Metamethod.JAVAFIELDS);
/* 712 */       return metamethod.invoke(luaState);
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 717 */       return "fields";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Methods
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Methods() {}
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 728 */       luaState.checkArg(1, luaState
/*     */           
/* 730 */           .isJavaObjectRaw(1), 
/* 731 */           String.format("expected Java object, got %s", new Object[] {
/* 732 */               luaState.typeName(1) }));
/* 733 */       JavaFunction metamethod = luaState.getMetamethod(luaState
/* 734 */           .toJavaObjectRaw(1), JavaReflector.Metamethod.JAVAMETHODS);
/* 735 */       return metamethod.invoke(luaState);
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 740 */       return "methods";
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Properties
/*     */     implements NamedJavaFunction
/*     */   {
/*     */     private Properties() {}
/*     */     
/*     */     public int invoke(LuaState luaState) {
/* 751 */       luaState.checkArg(1, luaState
/*     */           
/* 753 */           .isJavaObjectRaw(1), 
/* 754 */           String.format("expected Java object, got %s", new Object[] {
/* 755 */               luaState.typeName(1) }));
/* 756 */       JavaFunction metamethod = luaState.getMetamethod(luaState
/* 757 */           .toJavaObjectRaw(1), JavaReflector.Metamethod.JAVAPROPERTIES);
/* 758 */       return metamethod.invoke(luaState);
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 763 */       return "properties";
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\JavaModule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */