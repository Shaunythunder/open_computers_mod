/*      */ package li.cil.repack.com.naef.jnlua;
/*      */ 
/*      */ import java.beans.BeanInfo;
/*      */ import java.beans.IntrospectionException;
/*      */ import java.beans.Introspector;
/*      */ import java.beans.PropertyDescriptor;
/*      */ import java.lang.reflect.Array;
/*      */ import java.lang.reflect.Constructor;
/*      */ import java.lang.reflect.Field;
/*      */ import java.lang.reflect.InvocationTargetException;
/*      */ import java.lang.reflect.Method;
/*      */ import java.lang.reflect.Modifier;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.NavigableMap;
/*      */ import java.util.Set;
/*      */ import java.util.concurrent.locks.ReadWriteLock;
/*      */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class DefaultJavaReflector
/*      */   implements JavaReflector
/*      */ {
/*   37 */   private static final DefaultJavaReflector INSTANCE = new DefaultJavaReflector();
/*   38 */   private static final Object JAVA_FUNCTION_TYPE = new Object();
/*   39 */   private static final Object[] EMPTY_ARGUMENTS = new Object[0];
/*      */ 
/*      */   
/*   42 */   private Map<Class<?>, Map<String, Accessor>> accessors = new HashMap<>();
/*   43 */   private ReadWriteLock accessorLock = new ReentrantReadWriteLock();
/*   44 */   private Map<LuaCallSignature, Invocable> invocableDispatches = new HashMap<>();
/*   45 */   private ReadWriteLock invocableDispatchLock = new ReentrantReadWriteLock();
/*   46 */   private JavaFunction index = new Index();
/*   47 */   private JavaFunction newIndex = new NewIndex();
/*   48 */   private JavaFunction equal = new Equal();
/*   49 */   private JavaFunction length = new Length();
/*   50 */   private JavaFunction lessThan = new LessThan();
/*   51 */   private JavaFunction lessThanOrEqual = new LessThanOrEqual();
/*   52 */   private JavaFunction toString = new ToString();
/*   53 */   private JavaFunction pairs = new Pairs();
/*   54 */   private JavaFunction ipairs = new IPairs();
/*   55 */   private JavaFunction javaFields = new AccessorPairs(FieldAccessor.class);
/*   56 */   private JavaFunction javaMethods = new AccessorPairs(InvocableAccessor.class);
/*      */   
/*   58 */   private JavaFunction javaProperties = new AccessorPairs(PropertyAccessor.class);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static DefaultJavaReflector getInstance() {
/*   68 */     return INSTANCE;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public JavaFunction getMetamethod(JavaReflector.Metamethod metamethod) {
/*   81 */     switch (metamethod) {
/*      */       case FUNCTION:
/*   83 */         return this.index;
/*      */       case USERDATA:
/*   85 */         return this.newIndex;
/*      */       case null:
/*   87 */         return this.length;
/*      */       case null:
/*   89 */         return this.equal;
/*      */       case null:
/*   91 */         return this.lessThan;
/*      */       case null:
/*   93 */         return this.lessThanOrEqual;
/*      */       case null:
/*   95 */         return this.toString;
/*      */       case null:
/*   97 */         return this.pairs;
/*      */       case null:
/*   99 */         return this.ipairs;
/*      */       case null:
/*  101 */         return this.javaFields;
/*      */       case null:
/*  103 */         return this.javaMethods;
/*      */       case null:
/*  105 */         return this.javaProperties;
/*      */     } 
/*  107 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Map<String, Accessor> getObjectAccessors(Object object) {
/*  117 */     Class<?> clazz = getObjectClass(object);
/*  118 */     this.accessorLock.readLock().lock();
/*      */     try {
/*  120 */       Map<String, Accessor> map = this.accessors.get(clazz);
/*  121 */       if (map != null) {
/*  122 */         return map;
/*      */       }
/*      */     } finally {
/*  125 */       this.accessorLock.readLock().unlock();
/*      */     } 
/*      */ 
/*      */     
/*  129 */     Map<String, Accessor> result = createClassAccessors(clazz);
/*  130 */     this.accessorLock.writeLock().lock();
/*      */     try {
/*  132 */       if (!this.accessors.containsKey(clazz)) {
/*  133 */         this.accessors.put(clazz, result);
/*      */       } else {
/*  135 */         result = this.accessors.get(clazz);
/*      */       } 
/*      */     } finally {
/*  138 */       this.accessorLock.writeLock().unlock();
/*      */     } 
/*  140 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private Map<String, Accessor> createClassAccessors(Class<?> clazz) {
/*      */     BeanInfo beanInfo;
/*  147 */     Map<String, Accessor> result = new HashMap<>();
/*      */ 
/*      */     
/*  150 */     Field[] fields = clazz.getFields();
/*  151 */     for (int i = 0; i < fields.length; i++) {
/*  152 */       result.put(fields[i].getName(), new FieldAccessor(fields[i]));
/*      */     }
/*      */ 
/*      */     
/*  156 */     Map<String, Map<List<Class<?>>, Invocable>> accessibleMethods = new HashMap<>();
/*  157 */     Method[] methods = clazz.getMethods();
/*  158 */     for (int j = 0; j < methods.length; j++) {
/*      */       
/*  160 */       Method method = methods[j];
/*  161 */       if (result.containsKey(method.getName())) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  167 */       if (!Modifier.isPublic(method.getDeclaringClass().getModifiers())) {
/*  168 */         method = getPublicClassMethod(clazz, method.getName(), method
/*  169 */             .getParameterTypes());
/*  170 */         if (method == null) {
/*      */           continue;
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  178 */       Map<List<Class<?>>, Invocable> overloaded = accessibleMethods.get(method.getName());
/*  179 */       if (overloaded == null) {
/*  180 */         overloaded = new HashMap<>();
/*  181 */         accessibleMethods.put(method.getName(), overloaded);
/*      */       } 
/*  183 */       List<Class<?>> parameterTypes = Arrays.asList(method
/*  184 */           .getParameterTypes());
/*  185 */       Invocable currentInvocable = overloaded.get(parameterTypes);
/*  186 */       if (currentInvocable == null || 
/*  187 */         !method.getDeclaringClass().isAssignableFrom(currentInvocable
/*  188 */           .getDeclaringClass()))
/*      */       {
/*      */         
/*  191 */         overloaded.put(parameterTypes, new InvocableMethod(method)); }  continue;
/*      */     } 
/*  193 */     for (Map.Entry<String, Map<List<Class<?>>, Invocable>> entry : accessibleMethods
/*  194 */       .entrySet()) {
/*  195 */       result.put(entry.getKey(), new InvocableAccessor(clazz, ((Map)entry
/*  196 */             .getValue()).values()));
/*      */     }
/*      */ 
/*      */     
/*  200 */     Constructor[] arrayOfConstructor = (Constructor[])clazz.getConstructors();
/*  201 */     List<Invocable> accessibleConstructors = new ArrayList<>(arrayOfConstructor.length);
/*      */     
/*  203 */     for (int k = 0; k < arrayOfConstructor.length; k++) {
/*      */       
/*  205 */       if (Modifier.isPublic(arrayOfConstructor[k].getDeclaringClass()
/*  206 */           .getModifiers()))
/*      */       {
/*      */         
/*  209 */         accessibleConstructors
/*  210 */           .add(new InvocableConstructor(arrayOfConstructor[k])); } 
/*      */     } 
/*  212 */     if (clazz.isInterface()) {
/*  213 */       accessibleConstructors.add(new InvocableProxy(clazz));
/*      */     }
/*  215 */     if (!accessibleConstructors.isEmpty()) {
/*  216 */       result.put("new", new InvocableAccessor(clazz, accessibleConstructors));
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  223 */       beanInfo = Introspector.getBeanInfo(clazz);
/*  224 */     } catch (IntrospectionException e) {
/*  225 */       throw new RuntimeException(e);
/*      */     } 
/*      */     
/*  228 */     PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
/*  229 */     for (int m = 0; m < propertyDescriptors.length; m++) {
/*      */       
/*  231 */       if (!result.containsKey(propertyDescriptors[m].getName())) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  237 */         Method method = propertyDescriptors[m].getReadMethod();
/*  238 */         if (method != null && 
/*  239 */           !Modifier.isPublic(method.getDeclaringClass()
/*  240 */             .getModifiers())) {
/*  241 */           method = getPublicClassMethod(clazz, method.getName(), method
/*  242 */               .getParameterTypes());
/*      */           try {
/*  244 */             propertyDescriptors[m].setReadMethod(method);
/*  245 */           } catch (IntrospectionException introspectionException) {}
/*      */         } 
/*      */         
/*  248 */         method = propertyDescriptors[m].getWriteMethod();
/*  249 */         if (method != null && 
/*  250 */           !Modifier.isPublic(method.getDeclaringClass()
/*  251 */             .getModifiers())) {
/*  252 */           method = getPublicClassMethod(clazz, method.getName(), method
/*  253 */               .getParameterTypes());
/*      */           try {
/*  255 */             propertyDescriptors[m].setWriteMethod(method);
/*  256 */           } catch (IntrospectionException introspectionException) {}
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  261 */         if (propertyDescriptors[m].getReadMethod() != null || propertyDescriptors[m]
/*  262 */           .getWriteMethod() != null)
/*      */         {
/*      */           
/*  265 */           result.put(propertyDescriptors[m].getName(), new PropertyAccessor(clazz, propertyDescriptors[m])); } 
/*      */       } 
/*      */     } 
/*  268 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Method getPublicClassMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {
/*  277 */     Method method = getPublicSuperclassMethod(clazz, methodName, parameterTypes);
/*      */     
/*  279 */     if (method != null) {
/*  280 */       return method;
/*      */     }
/*  282 */     return getInterfaceMethod(clazz, methodName, parameterTypes);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Method getPublicSuperclassMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {
/*  291 */     Class<?> superclass = clazz.getSuperclass();
/*  292 */     while (superclass != null) {
/*      */       
/*  294 */       if (Modifier.isPublic(superclass.getModifiers())) {
/*      */         
/*      */         try {
/*  297 */           Method method = superclass.getDeclaredMethod(methodName, parameterTypes);
/*      */           
/*  299 */           if (Modifier.isPublic(method.getModifiers())) {
/*  300 */             return method;
/*      */           }
/*  302 */         } catch (NoSuchMethodException noSuchMethodException) {}
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  308 */       superclass = superclass.getSuperclass();
/*      */     } 
/*      */ 
/*      */     
/*  312 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Method getInterfaceMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {
/*      */     do {
/*  322 */       Class<?>[] interfaces = clazz.getInterfaces();
/*  323 */       for (int i = 0; i < interfaces.length; i++) {
/*      */         
/*  325 */         if (Modifier.isPublic(interfaces[i].getModifiers())) {
/*      */           
/*      */           try {
/*      */ 
/*      */ 
/*      */             
/*  331 */             return interfaces[i].getDeclaredMethod(methodName, parameterTypes);
/*      */           }
/*  333 */           catch (NoSuchMethodException noSuchMethodException) {
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  338 */             Method method = getInterfaceMethod(interfaces[i], methodName, parameterTypes);
/*      */             
/*  340 */             if (method != null) {
/*  341 */               return method;
/*      */             }
/*      */           } 
/*      */         }
/*      */       } 
/*  346 */       clazz = clazz.getSuperclass();
/*  347 */     } while (clazz != null);
/*      */ 
/*      */     
/*  350 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Class<?> getObjectClass(Object object) {
/*  358 */     return (object instanceof Class) ? (Class)object : 
/*  359 */       object.getClass();
/*      */   }
/*      */ 
/*      */   
/*      */   private class Index
/*      */     implements JavaFunction
/*      */   {
/*      */     private Index() {}
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  369 */       Object object = luaState.toJavaObject(1, Object.class);
/*  370 */       Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*      */ 
/*      */       
/*  373 */       if (objectClass.isArray()) {
/*  374 */         if (!luaState.isNumber(2)) {
/*  375 */           throw new LuaRuntimeException(String.format("attempt to read array with %s accessor", new Object[] { luaState
/*      */                   
/*  377 */                   .typeName(2) }));
/*      */         }
/*  379 */         long index = luaState.toInteger(2);
/*  380 */         int length = Array.getLength(object);
/*  381 */         if (index < 1L || index > length)
/*  382 */           throw new LuaRuntimeException(String.format("attempt to read array of length %d at index %d", new Object[] {
/*      */                   
/*  384 */                   Integer.valueOf(length), Long.valueOf(index)
/*      */                 })); 
/*  386 */         luaState.pushJavaObject(Array.get(object, (int)(index - 1L)));
/*  387 */         return 1;
/*      */       } 
/*      */ 
/*      */       
/*  391 */       Map<String, DefaultJavaReflector.Accessor> objectAccessors = DefaultJavaReflector.this.getObjectAccessors(object);
/*  392 */       String key = luaState.toString(-1);
/*  393 */       if (key == null) {
/*  394 */         throw new LuaRuntimeException(String.format("attempt to read class %s with %s accessor", new Object[] { object
/*      */                 
/*  396 */                 .getClass().getCanonicalName(), luaState
/*  397 */                 .typeName(-1) }));
/*      */       }
/*  399 */       DefaultJavaReflector.Accessor accessor = objectAccessors.get(key);
/*  400 */       if (accessor == null)
/*  401 */         throw new LuaRuntimeException(
/*  402 */             String.format("attempt to read class %s with accessor '%s' (undefined)", new Object[] {
/*      */                 
/*  404 */                 objectClass.getCanonicalName(), key
/*      */               })); 
/*  406 */       accessor.read(luaState, object);
/*  407 */       return 1;
/*      */     }
/*      */   }
/*      */   
/*      */   private class NewIndex
/*      */     implements JavaFunction
/*      */   {
/*      */     private NewIndex() {}
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  417 */       Object object = luaState.toJavaObject(1, Object.class);
/*  418 */       Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*      */ 
/*      */       
/*  421 */       if (objectClass.isArray()) {
/*  422 */         if (!luaState.isNumber(2)) {
/*  423 */           throw new LuaRuntimeException(String.format("attempt to write array with %s accessor", new Object[] { luaState
/*      */                   
/*  425 */                   .typeName(2) }));
/*      */         }
/*  427 */         long index = luaState.toInteger(2);
/*  428 */         int length = Array.getLength(object);
/*  429 */         if (index < 1L || index > length)
/*  430 */           throw new LuaRuntimeException(String.format("attempt to write array of length %d at index %d", new Object[] {
/*      */                   
/*  432 */                   Integer.valueOf(length), Long.valueOf(index)
/*      */                 })); 
/*  434 */         Class<?> componentType = objectClass.getComponentType();
/*  435 */         if (!luaState.isJavaObject(3, componentType))
/*  436 */           throw new LuaRuntimeException(
/*  437 */               String.format("attempt to write array of %s at index %d with %s value", new Object[] {
/*      */                   
/*  439 */                   componentType.getCanonicalName(), luaState
/*  440 */                   .typeName(3)
/*      */                 })); 
/*  442 */         Object value = luaState.toJavaObject(3, componentType);
/*  443 */         Array.set(object, (int)(index - 1L), value);
/*  444 */         return 0;
/*      */       } 
/*      */ 
/*      */       
/*  448 */       Map<String, DefaultJavaReflector.Accessor> objectAccessors = DefaultJavaReflector.this.getObjectAccessors(object);
/*  449 */       String key = luaState.toString(2);
/*  450 */       if (key == null) {
/*  451 */         throw new LuaRuntimeException(String.format("attempt to write class %s with %s accessor", new Object[] { object
/*      */                 
/*  453 */                 .getClass().getCanonicalName(), luaState
/*  454 */                 .typeName(2) }));
/*      */       }
/*  456 */       DefaultJavaReflector.Accessor accessor = objectAccessors.get(key);
/*  457 */       if (accessor == null)
/*  458 */         throw new LuaRuntimeException(
/*  459 */             String.format("attempt to write class %s with accessor '%s' (undefined)", new Object[] {
/*      */                 
/*  461 */                 objectClass.getCanonicalName(), key
/*      */               })); 
/*  463 */       accessor.write(luaState, object);
/*  464 */       return 0;
/*      */     }
/*      */   }
/*      */   
/*      */   private class Length
/*      */     implements JavaFunction
/*      */   {
/*      */     private Length() {}
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  474 */       Object object = luaState.toJavaObject(1, Object.class);
/*  475 */       if (object.getClass().isArray()) {
/*  476 */         luaState.pushInteger(Array.getLength(object));
/*  477 */         return 1;
/*      */       } 
/*  479 */       luaState.pushInteger(0L);
/*  480 */       return 1;
/*      */     }
/*      */   }
/*      */   
/*      */   private class Equal
/*      */     implements JavaFunction
/*      */   {
/*      */     private Equal() {}
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  490 */       Object object1 = luaState.toJavaObject(1, Object.class);
/*  491 */       Object object2 = luaState.toJavaObject(2, Object.class);
/*  492 */       luaState.pushBoolean((object1 == object2 || (object1 != null && object1
/*  493 */           .equals(object2))));
/*  494 */       return 1;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private class LessThan
/*      */     implements JavaFunction
/*      */   {
/*      */     private LessThan() {}
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  505 */       if (!luaState.isJavaObject(1, Comparable.class)) {
/*  506 */         throw new LuaRuntimeException(String.format("class %s does not implement Comparable", new Object[] { luaState
/*      */                 
/*  508 */                 .typeName(1) }));
/*      */       }
/*  510 */       Comparable<Object> comparable = luaState.<Comparable<Object>>toJavaObject(1, (Class)Comparable.class);
/*      */       
/*  512 */       Object object = luaState.toJavaObject(2, Object.class);
/*  513 */       luaState.pushBoolean((comparable.compareTo(object) < 0));
/*  514 */       return 1;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   private class LessThanOrEqual
/*      */     implements JavaFunction
/*      */   {
/*      */     private LessThanOrEqual() {}
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  525 */       if (!luaState.isJavaObject(1, Comparable.class)) {
/*  526 */         throw new LuaRuntimeException(String.format("class %s does not implement Comparable", new Object[] { luaState
/*      */                 
/*  528 */                 .typeName(1) }));
/*      */       }
/*  530 */       Comparable<Object> comparable = luaState.<Comparable<Object>>toJavaObject(1, (Class)Comparable.class);
/*      */       
/*  532 */       Object object = luaState.toJavaObject(2, Object.class);
/*  533 */       luaState.pushBoolean((comparable.compareTo(object) <= 0));
/*  534 */       return 1;
/*      */     }
/*      */   }
/*      */   
/*      */   private class ToString
/*      */     implements JavaFunction
/*      */   {
/*      */     private ToString() {}
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  544 */       Object object = luaState.toJavaObject(1, Object.class);
/*  545 */       luaState.pushString((object != null) ? object.toString() : "null");
/*  546 */       return 1;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class Pairs
/*      */     implements NamedJavaFunction
/*      */   {
/*  559 */     private final JavaFunction navigableMapNext = new NavigableMapNext();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  565 */       Map<Object, Object> map = luaState.<Map<Object, Object>>checkJavaObject(1, (Class)Map.class);
/*  566 */       luaState.checkArg(1, (map != null), 
/*  567 */           String.format("expected map, got %s", new Object[] { luaState.typeName(1) }));
/*  568 */       if (map instanceof NavigableMap) {
/*  569 */         luaState.pushJavaFunction(this.navigableMapNext);
/*      */       } else {
/*  571 */         luaState.pushJavaFunction(new MapNext(map.entrySet().iterator()));
/*      */       } 
/*  573 */       luaState.pushJavaObject(map);
/*  574 */       luaState.pushNil();
/*  575 */       return 3;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/*  580 */       return "pairs";
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     private Pairs() {}
/*      */ 
/*      */     
/*      */     private static class MapNext
/*      */       implements JavaFunction
/*      */     {
/*      */       private Iterator<Map.Entry<Object, Object>> iterator;
/*      */ 
/*      */       
/*      */       public MapNext(Iterator<Map.Entry<Object, Object>> iterator) {
/*  595 */         this.iterator = iterator;
/*      */       }
/*      */ 
/*      */       
/*      */       public int invoke(LuaState luaState) {
/*  600 */         if (this.iterator.hasNext()) {
/*  601 */           Map.Entry<Object, Object> entry = this.iterator.next();
/*  602 */           luaState.pushJavaObject(entry.getKey());
/*  603 */           luaState.pushJavaObject(entry.getValue());
/*  604 */           return 2;
/*      */         } 
/*  606 */         luaState.pushNil();
/*  607 */         return 1;
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     private static class NavigableMapNext
/*      */       implements JavaFunction
/*      */     {
/*      */       private NavigableMapNext() {}
/*      */ 
/*      */       
/*      */       public int invoke(LuaState luaState) {
/*      */         Map.Entry<Object, Object> entry;
/*  620 */         NavigableMap<Object, Object> navigableMap = luaState.<NavigableMap<Object, Object>>checkJavaObject(1, (Class)NavigableMap.class);
/*  621 */         Object key = luaState.checkJavaObject(2, Object.class);
/*      */         
/*  623 */         if (key != null) {
/*  624 */           entry = navigableMap.higherEntry(key);
/*      */         } else {
/*  626 */           entry = navigableMap.firstEntry();
/*      */         } 
/*  628 */         if (entry != null) {
/*  629 */           luaState.pushJavaObject(entry.getKey());
/*  630 */           luaState.pushJavaObject(entry.getValue());
/*  631 */           return 2;
/*      */         } 
/*  633 */         luaState.pushNil();
/*  634 */         return 1;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class IPairs
/*      */     implements NamedJavaFunction
/*      */   {
/*  645 */     private final JavaFunction listNext = new ListNext();
/*  646 */     private final JavaFunction arrayNext = new ArrayNext();
/*      */ 
/*      */ 
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*      */       Object object;
/*  652 */       if (luaState.isJavaObject(1, List.class)) {
/*  653 */         object = luaState.toJavaObject(1, List.class);
/*  654 */         luaState.pushJavaFunction(this.listNext);
/*      */       } else {
/*  656 */         object = luaState.checkJavaObject(1, Object.class);
/*  657 */         luaState.checkArg(1, object.getClass().isArray(), 
/*  658 */             String.format("expected list or array, got %s", new Object[] {
/*  659 */                 luaState.typeName(1) }));
/*  660 */         luaState.pushJavaFunction(this.arrayNext);
/*      */       } 
/*  662 */       luaState.pushJavaObject(object);
/*  663 */       luaState.pushInteger(0L);
/*  664 */       return 3;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/*  669 */       return "ipairs";
/*      */     }
/*      */     
/*      */     private IPairs() {}
/*      */     
/*      */     private static class ListNext implements JavaFunction { private ListNext() {}
/*      */       
/*      */       public int invoke(LuaState luaState) {
/*  677 */         List<?> list = luaState.<List>checkJavaObject(1, List.class);
/*  678 */         int size = list.size();
/*  679 */         long index = luaState.checkInteger(2);
/*  680 */         index++;
/*  681 */         if (index >= 1L && index <= size) {
/*  682 */           luaState.pushInteger(index);
/*  683 */           luaState.pushJavaObject(list.get((int)(index - 1L)));
/*  684 */           return 2;
/*      */         } 
/*  686 */         luaState.pushNil();
/*  687 */         return 1;
/*      */       } }
/*      */ 
/*      */     
/*      */     private static class ArrayNext
/*      */       implements JavaFunction
/*      */     {
/*      */       private ArrayNext() {}
/*      */       
/*      */       public int invoke(LuaState luaState) {
/*  697 */         Object array = luaState.checkJavaObject(1, Object.class);
/*  698 */         int length = Array.getLength(array);
/*  699 */         long index = luaState.checkInteger(2);
/*  700 */         index++;
/*  701 */         if (index >= 1L && index <= length) {
/*  702 */           luaState.pushInteger(index);
/*  703 */           luaState.pushJavaObject(Array.get(array, (int)(index - 1L)));
/*  704 */           return 2;
/*      */         } 
/*  706 */         luaState.pushNil();
/*  707 */         return 1;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class AccessorPairs
/*      */     implements JavaFunction
/*      */   {
/*      */     private Class<?> accessorClass;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public AccessorPairs(Class<?> accessorClass) {
/*  725 */       this.accessorClass = accessorClass;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*  732 */       Object object = luaState.toJavaObject(1, Object.class);
/*  733 */       Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*      */ 
/*      */       
/*  736 */       Map<String, DefaultJavaReflector.Accessor> objectAccessors = DefaultJavaReflector.this.getObjectAccessors(object);
/*      */       
/*  738 */       Iterator<Map.Entry<String, DefaultJavaReflector.Accessor>> iterator = objectAccessors.entrySet().iterator();
/*  739 */       luaState.pushJavaObject(new AccessorNext(iterator, (objectClass == object)));
/*      */       
/*  741 */       luaState.pushJavaObject(object);
/*  742 */       luaState.pushNil();
/*  743 */       return 3;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private class AccessorNext
/*      */       implements JavaFunction
/*      */     {
/*      */       private Iterator<Map.Entry<String, DefaultJavaReflector.Accessor>> iterator;
/*      */ 
/*      */ 
/*      */       
/*      */       private boolean isStatic;
/*      */ 
/*      */ 
/*      */       
/*      */       public AccessorNext(Iterator<Map.Entry<String, DefaultJavaReflector.Accessor>> iterator, boolean isStatic) {
/*  761 */         this.iterator = iterator;
/*  762 */         this.isStatic = isStatic;
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*      */       public int invoke(LuaState luaState) {
/*  768 */         while (this.iterator.hasNext()) {
/*  769 */           Map.Entry<String, DefaultJavaReflector.Accessor> entry = this.iterator.next();
/*  770 */           DefaultJavaReflector.Accessor accessor = entry.getValue();
/*      */ 
/*      */           
/*  773 */           if (accessor.getClass() != DefaultJavaReflector.AccessorPairs.this.accessorClass) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/*  778 */           if (this.isStatic ? 
/*  779 */             !accessor.isStatic() : 
/*      */ 
/*      */ 
/*      */             
/*  783 */             !accessor.isNotStatic()) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */ 
/*      */           
/*  789 */           luaState.pushString(entry.getKey());
/*  790 */           Object object = luaState.toJavaObject(1, Object.class);
/*  791 */           accessor.read(luaState, object);
/*  792 */           return 2;
/*      */         } 
/*      */ 
/*      */         
/*  796 */         return 0;
/*      */       }
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class FieldAccessor
/*      */     implements Accessor
/*      */   {
/*      */     private Field field;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public FieldAccessor(Field field) {
/*  838 */       this.field = field;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void read(LuaState luaState, Object object) {
/*      */       try {
/*  845 */         Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*  846 */         if (objectClass == object) {
/*  847 */           object = null;
/*      */         }
/*  849 */         luaState.pushJavaObject(this.field.get(object));
/*  850 */       } catch (IllegalArgumentException e) {
/*  851 */         throw new RuntimeException(e);
/*  852 */       } catch (IllegalAccessException e) {
/*  853 */         throw new RuntimeException(e);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void write(LuaState luaState, Object object) {
/*      */       try {
/*  860 */         Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*  861 */         if (objectClass == object) {
/*  862 */           object = null;
/*      */         }
/*  864 */         Object value = luaState.checkJavaObject(-1, this.field.getType());
/*  865 */         this.field.set(object, value);
/*  866 */       } catch (IllegalArgumentException e) {
/*  867 */         throw new RuntimeException(e);
/*  868 */       } catch (IllegalAccessException e) {
/*  869 */         throw new RuntimeException(e);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isNotStatic() {
/*  875 */       return !Modifier.isStatic(this.field.getModifiers());
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isStatic() {
/*  880 */       return Modifier.isStatic(this.field.getModifiers());
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class InvocableAccessor
/*      */     implements Accessor, JavaFunction
/*      */   {
/*      */     private Class<?> clazz;
/*      */ 
/*      */     
/*      */     private List<DefaultJavaReflector.Invocable> invocables;
/*      */ 
/*      */ 
/*      */     
/*      */     public InvocableAccessor(Class<?> clazz, Collection<DefaultJavaReflector.Invocable> invocables) {
/*  898 */       this.clazz = clazz;
/*  899 */       this.invocables = new ArrayList<>(invocables);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getName() {
/*  907 */       return ((DefaultJavaReflector.Invocable)this.invocables.get(0)).getName();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getWhat() {
/*  914 */       return ((DefaultJavaReflector.Invocable)this.invocables.get(0)).getWhat();
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void read(LuaState luaState, Object object) {
/*  920 */       Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*  921 */       if (objectClass == object) {
/*  922 */         object = null;
/*      */       }
/*  924 */       luaState.pushJavaFunction(this);
/*      */     }
/*      */ 
/*      */     
/*      */     public void write(LuaState luaState, Object object) {
/*  929 */       Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*  930 */       throw new LuaRuntimeException(String.format("attempt to write class %s with accessor '%s' (a %s)", new Object[] { objectClass
/*      */               
/*  932 */               .getCanonicalName(), getName(), getWhat() }));
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isNotStatic() {
/*  937 */       for (DefaultJavaReflector.Invocable invocable : this.invocables) {
/*  938 */         if (!Modifier.isStatic(invocable.getModifiers())) {
/*  939 */           return true;
/*      */         }
/*      */       } 
/*  942 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isStatic() {
/*  947 */       for (DefaultJavaReflector.Invocable invocable : this.invocables) {
/*  948 */         if (Modifier.isStatic(invocable.getModifiers())) {
/*  949 */           return true;
/*      */         }
/*      */       } 
/*  952 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int invoke(LuaState luaState) {
/*      */       DefaultJavaReflector.Invocable invocable;
/*  959 */       Object result, object = luaState.checkJavaObject(1, Object.class);
/*  960 */       Class<?> objectClass = DefaultJavaReflector.this.getObjectClass(object);
/*  961 */       luaState.checkArg(1, this.clazz.isAssignableFrom(objectClass), 
/*  962 */           String.format("class %s is not a subclass of %s", new Object[] {
/*  963 */               objectClass.getCanonicalName(), this.clazz
/*  964 */               .getCanonicalName() }));
/*  965 */       if (objectClass == object) {
/*  966 */         object = null;
/*      */       }
/*      */ 
/*      */       
/*  970 */       DefaultJavaReflector.LuaCallSignature luaCallSignature = getLuaCallSignature(luaState);
/*      */       
/*  972 */       DefaultJavaReflector.this.invocableDispatchLock.readLock().lock();
/*      */       try {
/*  974 */         invocable = (DefaultJavaReflector.Invocable)DefaultJavaReflector.this.invocableDispatches.get(luaCallSignature);
/*      */       } finally {
/*  976 */         DefaultJavaReflector.this.invocableDispatchLock.readLock().unlock();
/*      */       } 
/*  978 */       if (invocable == null) {
/*  979 */         invocable = dispatchInvocable(luaState, (object == null));
/*  980 */         DefaultJavaReflector.this.invocableDispatchLock.writeLock().lock();
/*      */         try {
/*  982 */           if (!DefaultJavaReflector.this.invocableDispatches.containsKey(luaCallSignature)) {
/*  983 */             DefaultJavaReflector.this.invocableDispatches.put(luaCallSignature, invocable);
/*      */           } else {
/*  985 */             invocable = (DefaultJavaReflector.Invocable)DefaultJavaReflector.this.invocableDispatches.get(luaCallSignature);
/*      */           } 
/*      */         } finally {
/*  988 */           DefaultJavaReflector.this.invocableDispatchLock.writeLock().unlock();
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  993 */       int argCount = luaState.getTop() - 1;
/*  994 */       int parameterCount = invocable.getParameterCount();
/*  995 */       Object[] arguments = new Object[parameterCount];
/*  996 */       if (invocable.isVarArgs()) {
/*  997 */         int i; for (i = 0; i < parameterCount - 1; i++) {
/*  998 */           arguments[i] = luaState.toJavaObject(i + 2, invocable
/*  999 */               .getParameterType(i));
/*      */         }
/* 1001 */         arguments[parameterCount - 1] = Array.newInstance(invocable
/* 1002 */             .getParameterType(parameterCount - 1), argCount - parameterCount - 1);
/*      */         
/* 1004 */         for (i = parameterCount - 1; i < argCount; i++) {
/* 1005 */           Array.set(arguments[parameterCount - 1], i - parameterCount - 1, luaState
/*      */ 
/*      */               
/* 1008 */               .toJavaObject(i + 2, invocable
/* 1009 */                 .getParameterType(i)));
/*      */         }
/*      */       } else {
/* 1012 */         for (int i = 0; i < parameterCount; i++) {
/* 1013 */           arguments[i] = luaState.toJavaObject(i + 2, invocable
/* 1014 */               .getParameterType(i));
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/* 1021 */         result = invocable.invoke(object, arguments);
/* 1022 */       } catch (InstantiationException e) {
/* 1023 */         throw new RuntimeException(e);
/* 1024 */       } catch (IllegalArgumentException e) {
/* 1025 */         throw new RuntimeException(e);
/* 1026 */       } catch (IllegalAccessException e) {
/* 1027 */         throw new RuntimeException(e);
/* 1028 */       } catch (InvocationTargetException e) {
/* 1029 */         throw new RuntimeException(e.getTargetException());
/*      */       } 
/*      */ 
/*      */       
/* 1033 */       if (invocable.getReturnType() != void.class) {
/* 1034 */         if (invocable.isRawReturn()) {
/* 1035 */           luaState.pushJavaObjectRaw(result);
/*      */         } else {
/* 1037 */           luaState.pushJavaObject(result);
/*      */         } 
/* 1039 */         return 1;
/*      */       } 
/* 1041 */       return 0;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private DefaultJavaReflector.LuaCallSignature getLuaCallSignature(LuaState luaState) {
/* 1050 */       int argCount = luaState.getTop() - 1;
/* 1051 */       Object[] types = new Object[argCount];
/* 1052 */       for (int i = 0; i < argCount; i++) {
/* 1053 */         LuaType type = luaState.type(i + 2);
/* 1054 */         switch (type) {
/*      */           case FUNCTION:
/* 1056 */             types[i] = luaState.isJavaFunction(i + 2) ? DefaultJavaReflector.JAVA_FUNCTION_TYPE : 
/* 1057 */               LuaType.FUNCTION;
/*      */             break;
/*      */           case USERDATA:
/* 1060 */             if (luaState.isJavaObjectRaw(i + 2)) {
/* 1061 */               Object object = luaState.toJavaObjectRaw(i + 2);
/* 1062 */               if (object instanceof TypedJavaObject) {
/* 1063 */                 types[i] = ((TypedJavaObject)object).getType(); break;
/*      */               } 
/* 1065 */               types[i] = object.getClass();
/*      */               break;
/*      */             } 
/* 1068 */             types[i] = LuaType.USERDATA;
/*      */             break;
/*      */           
/*      */           default:
/* 1072 */             types[i] = type; break;
/*      */         } 
/*      */       } 
/* 1075 */       return new DefaultJavaReflector.LuaCallSignature(this.clazz, getName(), types);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private DefaultJavaReflector.Invocable dispatchInvocable(LuaState luaState, boolean staticDispatch) {
/* 1084 */       Set<DefaultJavaReflector.Invocable> candidates = new HashSet<>(this.invocables);
/*      */ 
/*      */       
/* 1087 */       for (Iterator<DefaultJavaReflector.Invocable> i = candidates.iterator(); i.hasNext(); ) {
/* 1088 */         DefaultJavaReflector.Invocable invocable = i.next();
/* 1089 */         if (Modifier.isStatic(invocable.getModifiers()) != staticDispatch) {
/* 1090 */           i.remove();
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/* 1095 */       int argCount = luaState.getTop() - 1;
/* 1096 */       for (Iterator<DefaultJavaReflector.Invocable> iterator1 = candidates.iterator(); iterator1.hasNext(); ) {
/* 1097 */         DefaultJavaReflector.Invocable invocable = iterator1.next();
/* 1098 */         if (invocable.isVarArgs()) {
/* 1099 */           if (argCount < invocable.getParameterCount() - 1)
/* 1100 */             iterator1.remove(); 
/*      */           continue;
/*      */         } 
/* 1103 */         if (argCount != invocable.getParameterCount()) {
/* 1104 */           iterator1.remove();
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1110 */       Converter converter = luaState.getConverter();
/* 1111 */       Iterator<DefaultJavaReflector.Invocable> iterator2 = candidates.iterator();
/* 1112 */       while (iterator2.hasNext()) {
/* 1113 */         DefaultJavaReflector.Invocable invocable = iterator2.next();
/* 1114 */         for (int j = 0; j < argCount; j++) {
/* 1115 */           int distance = converter.getTypeDistance(luaState, j + 2, invocable
/* 1116 */               .getParameterType(j));
/* 1117 */           if (distance == Integer.MAX_VALUE) {
/* 1118 */             iterator2.remove();
/*      */ 
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1126 */       boolean haveFixArgs = false;
/* 1127 */       boolean haveVarArgs = false;
/* 1128 */       for (DefaultJavaReflector.Invocable invocable : candidates) {
/* 1129 */         haveFixArgs = (haveFixArgs || !invocable.isVarArgs());
/* 1130 */         haveVarArgs = (haveVarArgs || invocable.isVarArgs());
/*      */       } 
/* 1132 */       if (haveVarArgs && haveFixArgs) {
/* 1133 */         for (Iterator<DefaultJavaReflector.Invocable> iterator = candidates.iterator(); iterator.hasNext(); ) {
/* 1134 */           DefaultJavaReflector.Invocable invocable = iterator.next();
/* 1135 */           if (invocable.isVarArgs()) {
/* 1136 */             iterator.remove();
/*      */           }
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 1142 */       Iterator<DefaultJavaReflector.Invocable> iterator3 = candidates.iterator();
/* 1143 */       while (iterator3.hasNext()) {
/* 1144 */         DefaultJavaReflector.Invocable invocable = iterator3.next();
/* 1145 */         label121: for (DefaultJavaReflector.Invocable other : candidates) {
/* 1146 */           if (other == invocable) {
/*      */             continue;
/*      */           }
/* 1149 */           int parameterCount = Math.min(argCount, 
/*      */               
/* 1151 */               Math.max(invocable.getParameterCount(), other
/* 1152 */                 .getParameterCount()));
/* 1153 */           boolean delta = false;
/* 1154 */           for (int j = 0; j < parameterCount; j++) {
/* 1155 */             int distance = converter.getTypeDistance(luaState, j + 2, invocable
/* 1156 */                 .getParameterType(j));
/* 1157 */             int otherDistance = converter.getTypeDistance(luaState, j + 2, other
/* 1158 */                 .getParameterType(j));
/* 1159 */             if (otherDistance > distance) {
/*      */               continue label121;
/*      */             }
/*      */             
/* 1163 */             delta = (delta || distance != otherDistance);
/*      */           } 
/*      */ 
/*      */           
/* 1167 */           if (!delta) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/* 1172 */           iterator3.remove();
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1178 */       iterator3 = candidates.iterator();
/* 1179 */       while (iterator3.hasNext()) {
/* 1180 */         DefaultJavaReflector.Invocable invocable = iterator3.next();
/* 1181 */         label120: for (DefaultJavaReflector.Invocable other : candidates) {
/* 1182 */           if (other == invocable) {
/*      */             continue;
/*      */           }
/* 1185 */           int parameterCount = Math.min(argCount, 
/*      */               
/* 1187 */               Math.max(invocable.getParameterCount(), other
/* 1188 */                 .getParameterCount()));
/* 1189 */           boolean delta = false;
/* 1190 */           for (int j = 0; j < parameterCount; j++) {
/* 1191 */             Class<?> type = invocable.getParameterType(j);
/* 1192 */             Class<?> otherType = other.getParameterType(j);
/* 1193 */             if (!type.isAssignableFrom(otherType)) {
/*      */               continue label120;
/*      */             }
/*      */             
/* 1197 */             delta = (delta || type != otherType);
/*      */           } 
/*      */ 
/*      */           
/* 1201 */           if (!delta) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/* 1206 */           iterator3.remove();
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1212 */       if (candidates.isEmpty()) {
/* 1213 */         throw getSignatureMismatchException(luaState);
/*      */       }
/* 1215 */       if (candidates.size() > 1) {
/* 1216 */         throw getSignatureAmbivalenceException(luaState, candidates);
/*      */       }
/*      */ 
/*      */       
/* 1220 */       return candidates.iterator().next();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private LuaRuntimeException getSignatureMismatchException(LuaState luaState) {
/* 1229 */       return new LuaRuntimeException(String.format("no %s of class %s matches '%s(%s)'", new Object[] {
/* 1230 */               getWhat(), this.clazz
/* 1231 */               .getCanonicalName(), getName(), 
/* 1232 */               getLuaSignatureString(luaState)
/*      */             }));
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private LuaRuntimeException getSignatureAmbivalenceException(LuaState luaState, Set<DefaultJavaReflector.Invocable> candidates) {
/* 1241 */       StringBuilder sb = new StringBuilder();
/* 1242 */       sb.append(String.format("%s '%s(%s)' on class %s is ambivalent among ", new Object[] {
/* 1243 */               getWhat(), 
/* 1244 */               getName(), getLuaSignatureString(luaState), this.clazz
/* 1245 */               .getCanonicalName() }));
/* 1246 */       boolean first = true;
/* 1247 */       for (DefaultJavaReflector.Invocable invocable : candidates) {
/* 1248 */         if (first) {
/* 1249 */           first = false;
/*      */         } else {
/* 1251 */           sb.append(", ");
/*      */         } 
/* 1253 */         sb.append(String.format("'%s(%s)'", new Object[] { getName(), 
/* 1254 */                 getJavaSignatureString(invocable.getParameterTypes()) }));
/*      */       } 
/* 1256 */       return new LuaRuntimeException(sb.toString());
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String getLuaSignatureString(LuaState luaState) {
/* 1263 */       int argCount = luaState.getTop() - 1;
/* 1264 */       StringBuilder sb = new StringBuilder();
/* 1265 */       for (int i = 0; i < argCount; i++) {
/* 1266 */         if (i > 0) {
/* 1267 */           sb.append(", ");
/*      */         }
/* 1269 */         sb.append(luaState.typeName(i + 2));
/*      */       } 
/* 1271 */       return sb.toString();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String getJavaSignatureString(Class<?>[] types) {
/* 1278 */       StringBuilder sb = new StringBuilder();
/* 1279 */       for (int i = 0; i < types.length; i++) {
/* 1280 */         if (i > 0) {
/* 1281 */           sb.append(", ");
/*      */         }
/* 1283 */         sb.append(types[i].getCanonicalName());
/*      */       } 
/* 1285 */       return sb.toString();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private class PropertyAccessor
/*      */     implements Accessor
/*      */   {
/*      */     private Class<?> clazz;
/*      */ 
/*      */     
/*      */     private PropertyDescriptor propertyDescriptor;
/*      */ 
/*      */ 
/*      */     
/*      */     public PropertyAccessor(Class<?> clazz, PropertyDescriptor propertyDescriptor) {
/* 1303 */       this.clazz = clazz;
/* 1304 */       this.propertyDescriptor = propertyDescriptor;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public void read(LuaState luaState, Object object) {
/* 1310 */       if (this.propertyDescriptor.getReadMethod() == null)
/* 1311 */         throw new LuaRuntimeException(
/* 1312 */             String.format("attempt to read class %s with accessor '%s' (a write-only property)", new Object[] {
/*      */                 
/* 1314 */                 this.clazz.getCanonicalName(), this.propertyDescriptor
/* 1315 */                 .getName()
/*      */               })); 
/*      */       try {
/* 1318 */         luaState.pushJavaObject(this.propertyDescriptor.getReadMethod()
/* 1319 */             .invoke(object, DefaultJavaReflector.EMPTY_ARGUMENTS));
/* 1320 */       } catch (IllegalArgumentException e) {
/* 1321 */         throw new RuntimeException(e);
/* 1322 */       } catch (IllegalAccessException e) {
/* 1323 */         throw new RuntimeException(e);
/* 1324 */       } catch (InvocationTargetException e) {
/* 1325 */         throw new RuntimeException(e.getTargetException());
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/*      */     public void write(LuaState luaState, Object object) {
/* 1331 */       if (this.propertyDescriptor.getWriteMethod() == null)
/* 1332 */         throw new LuaRuntimeException(
/* 1333 */             String.format("attempt to write class %s with acessor '%s' (a read-only property)", new Object[] {
/*      */                 
/* 1335 */                 this.clazz.getCanonicalName(), this.propertyDescriptor
/* 1336 */                 .getName()
/*      */               })); 
/*      */       try {
/* 1339 */         Object value = luaState.checkJavaObject(-1, this.propertyDescriptor
/* 1340 */             .getPropertyType());
/* 1341 */         this.propertyDescriptor.getWriteMethod().invoke(object, new Object[] { value });
/* 1342 */       } catch (IllegalArgumentException e) {
/* 1343 */         throw new RuntimeException(e);
/* 1344 */       } catch (IllegalAccessException e) {
/* 1345 */         throw new RuntimeException(e);
/* 1346 */       } catch (InvocationTargetException e) {
/* 1347 */         throw new RuntimeException(e.getTargetException());
/*      */       } 
/* 1349 */       luaState.pop(1);
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isNotStatic() {
/* 1354 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isStatic() {
/* 1359 */       return false;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static class InvocableMethod
/*      */     implements Invocable
/*      */   {
/*      */     private Method method;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private Class<?>[] parameterTypes;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public InvocableMethod(Method method) {
/* 1437 */       this.method = method;
/* 1438 */       this.parameterTypes = method.getParameterTypes();
/*      */     }
/*      */ 
/*      */     
/*      */     public String getWhat() {
/* 1443 */       return "method";
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getDeclaringClass() {
/* 1448 */       return this.method.getDeclaringClass();
/*      */     }
/*      */ 
/*      */     
/*      */     public int getModifiers() {
/* 1453 */       return this.method.getModifiers();
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/* 1458 */       return this.method.getName();
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getReturnType() {
/* 1463 */       return this.method.getReturnType();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isRawReturn() {
/* 1468 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public int getParameterCount() {
/* 1473 */       return this.parameterTypes.length;
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?>[] getParameterTypes() {
/* 1478 */       return this.parameterTypes;
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getParameterType(int index) {
/* 1483 */       if (this.method.isVarArgs() && index >= this.parameterTypes.length - 1) {
/* 1484 */         return this.parameterTypes[this.parameterTypes.length - 1]
/* 1485 */           .getComponentType();
/*      */       }
/* 1487 */       return this.parameterTypes[index];
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isVarArgs() {
/* 1493 */       return this.method.isVarArgs();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Object invoke(Object obj, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1500 */       return this.method.invoke(obj, args);
/*      */     }
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1505 */       return this.method.toString();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class InvocableConstructor
/*      */     implements Invocable
/*      */   {
/*      */     private Constructor<?> constructor;
/*      */ 
/*      */     
/*      */     private Class<?>[] parameterTypes;
/*      */ 
/*      */     
/*      */     public InvocableConstructor(Constructor<?> constructor) {
/* 1521 */       this.constructor = constructor;
/* 1522 */       this.parameterTypes = constructor.getParameterTypes();
/*      */     }
/*      */ 
/*      */     
/*      */     public String getWhat() {
/* 1527 */       return "constructor";
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getDeclaringClass() {
/* 1532 */       return this.constructor.getDeclaringClass();
/*      */     }
/*      */ 
/*      */     
/*      */     public int getModifiers() {
/* 1537 */       return this.constructor.getModifiers() | 0x8;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/* 1542 */       return "new";
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getReturnType() {
/* 1547 */       return this.constructor.getDeclaringClass();
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isRawReturn() {
/* 1552 */       return false;
/*      */     }
/*      */ 
/*      */     
/*      */     public int getParameterCount() {
/* 1557 */       return this.parameterTypes.length;
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?>[] getParameterTypes() {
/* 1562 */       return this.parameterTypes;
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getParameterType(int index) {
/* 1567 */       if (this.constructor.isVarArgs() && index >= this.parameterTypes.length - 1) {
/* 1568 */         return this.parameterTypes[this.parameterTypes.length - 1]
/* 1569 */           .getComponentType();
/*      */       }
/* 1571 */       return this.parameterTypes[index];
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isVarArgs() {
/* 1577 */       return this.constructor.isVarArgs();
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Object invoke(Object obj, Object... args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1584 */       return this.constructor.newInstance(args);
/*      */     }
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1589 */       return this.constructor.toString();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class InvocableProxy
/*      */     implements Invocable
/*      */   {
/* 1598 */     private static final Class<?>[] PARAMETER_TYPES = new Class[] { LuaValueProxy.class };
/*      */ 
/*      */ 
/*      */     
/*      */     private Class<?> interfaze;
/*      */ 
/*      */ 
/*      */     
/*      */     public InvocableProxy(Class<?> interfaze) {
/* 1607 */       this.interfaze = interfaze;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getWhat() {
/* 1612 */       return "proxy";
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getDeclaringClass() {
/* 1617 */       return this.interfaze;
/*      */     }
/*      */ 
/*      */     
/*      */     public int getModifiers() {
/* 1622 */       return this.interfaze.getModifiers() | 0x8;
/*      */     }
/*      */ 
/*      */     
/*      */     public String getName() {
/* 1627 */       return "new";
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getReturnType() {
/* 1632 */       return this.interfaze;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isRawReturn() {
/* 1637 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public int getParameterCount() {
/* 1642 */       return 1;
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?>[] getParameterTypes() {
/* 1647 */       return PARAMETER_TYPES;
/*      */     }
/*      */ 
/*      */     
/*      */     public Class<?> getParameterType(int index) {
/* 1652 */       return PARAMETER_TYPES[0];
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean isVarArgs() {
/* 1657 */       return false;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Object invoke(Object obj, Object... args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1664 */       LuaValueProxy luaValueProxy = (LuaValueProxy)args[0];
/* 1665 */       luaValueProxy.pushValue();
/* 1666 */       Object proxy = luaValueProxy.getLuaState().getProxy(-1, this.interfaze);
/* 1667 */       luaValueProxy.getLuaState().pop(1);
/* 1668 */       return proxy;
/*      */     }
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1673 */       return this.interfaze.toString();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private static class LuaCallSignature
/*      */   {
/*      */     private Class<?> clazz;
/*      */ 
/*      */     
/*      */     private String invocableName;
/*      */ 
/*      */     
/*      */     private Object[] types;
/*      */     
/*      */     private int hashCode;
/*      */ 
/*      */     
/*      */     public LuaCallSignature(Class<?> clazz, String invocableName, Object[] types) {
/* 1693 */       this.clazz = clazz;
/* 1694 */       this.invocableName = invocableName;
/* 1695 */       this.types = types;
/* 1696 */       this.hashCode = clazz.hashCode();
/* 1697 */       this.hashCode = this.hashCode * 65599 + invocableName.hashCode();
/* 1698 */       for (int i = 0; i < types.length; i++) {
/* 1699 */         this.hashCode = this.hashCode * 65599 + types[i].hashCode();
/*      */       }
/*      */     }
/*      */ 
/*      */     
/*      */     public int hashCode() {
/* 1705 */       return this.hashCode;
/*      */     }
/*      */ 
/*      */     
/*      */     public boolean equals(Object obj) {
/* 1710 */       if (obj == this) {
/* 1711 */         return true;
/*      */       }
/* 1713 */       if (!(obj instanceof LuaCallSignature)) {
/* 1714 */         return false;
/*      */       }
/* 1716 */       LuaCallSignature other = (LuaCallSignature)obj;
/* 1717 */       if (this.clazz != other.clazz || 
/* 1718 */         !this.invocableName.equals(other.invocableName) || this.types.length != other.types.length)
/*      */       {
/* 1720 */         return false;
/*      */       }
/* 1722 */       for (int i = 0; i < this.types.length; i++) {
/* 1723 */         if (this.types[i] != other.types[i]) {
/* 1724 */           return false;
/*      */         }
/*      */       } 
/* 1727 */       return true;
/*      */     }
/*      */ 
/*      */     
/*      */     public String toString() {
/* 1732 */       return this.clazz.getCanonicalName() + ": " + this.invocableName + "(" + 
/* 1733 */         Arrays.<Object>asList(this.types) + ")";
/*      */     }
/*      */   }
/*      */   
/*      */   private static interface Invocable {
/*      */     String getWhat();
/*      */     
/*      */     Class<?> getDeclaringClass();
/*      */     
/*      */     int getModifiers();
/*      */     
/*      */     String getName();
/*      */     
/*      */     Class<?> getReturnType();
/*      */     
/*      */     boolean isRawReturn();
/*      */     
/*      */     int getParameterCount();
/*      */     
/*      */     Class<?>[] getParameterTypes();
/*      */     
/*      */     Class<?> getParameterType(int param1Int);
/*      */     
/*      */     boolean isVarArgs();
/*      */     
/*      */     Object invoke(Object param1Object, Object... param1VarArgs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException;
/*      */   }
/*      */   
/*      */   private static interface Accessor {
/*      */     void read(LuaState param1LuaState, Object param1Object);
/*      */     
/*      */     void write(LuaState param1LuaState, Object param1Object);
/*      */     
/*      */     boolean isNotStatic();
/*      */     
/*      */     boolean isStatic();
/*      */   }
/*      */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\DefaultJavaReflector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */