/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.Field;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ class JavaClass
/*     */   extends JavaInstance
/*     */   implements CoerceJavaToLua.Coercion
/*     */ {
/*  51 */   static final Map classes = Collections.synchronizedMap(new HashMap<>());
/*     */   
/*  53 */   static final LuaValue NEW = (LuaValue)valueOf("new");
/*     */   
/*     */   Map fields;
/*     */   Map methods;
/*     */   Map innerclasses;
/*     */   
/*     */   static JavaClass forClass(Class<?> c) {
/*  60 */     JavaClass j = (JavaClass)classes.get(c);
/*  61 */     if (j == null)
/*  62 */       classes.put(c, j = new JavaClass(c)); 
/*  63 */     return j;
/*     */   }
/*     */   
/*     */   JavaClass(Class c) {
/*  67 */     super(c);
/*  68 */     this.jclass = this;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue coerce(Object javaValue) {
/*  73 */     return (LuaValue)this;
/*     */   }
/*     */   
/*     */   Field getField(LuaValue key) {
/*  77 */     if (this.fields == null) {
/*  78 */       Map<Object, Object> m = new HashMap<>();
/*  79 */       Field[] f = ((Class)this.m_instance).getFields();
/*  80 */       for (Field fi : f) {
/*  81 */         if (Modifier.isPublic(fi.getModifiers())) {
/*  82 */           m.put(LuaValue.valueOf(fi.getName()), fi);
/*     */           try {
/*  84 */             if (!fi.isAccessible())
/*  85 */               fi.setAccessible(true); 
/*  86 */           } catch (SecurityException securityException) {}
/*     */         } 
/*     */       } 
/*     */       
/*  90 */       this.fields = m;
/*     */     } 
/*  92 */     return (Field)this.fields.get(key);
/*     */   }
/*     */   
/*     */   LuaValue getMethod(LuaValue key) {
/*  96 */     if (this.methods == null) {
/*  97 */       Map<Object, Object> namedlists = new HashMap<>();
/*  98 */       Method[] m = ((Class)this.m_instance).getMethods();
/*  99 */       for (Method mi : m) {
/* 100 */         if (Modifier.isPublic(mi.getModifiers())) {
/* 101 */           String name = mi.getName();
/* 102 */           List<JavaMethod> list1 = (List)namedlists.get(name);
/* 103 */           if (list1 == null)
/* 104 */             namedlists.put(name, list1 = new ArrayList()); 
/* 105 */           list1.add(JavaMethod.forMethod(mi));
/*     */         } 
/*     */       } 
/* 108 */       Map<Object, Object> map = new HashMap<>();
/* 109 */       Constructor[] c = (Constructor[])((Class)this.m_instance).getConstructors();
/* 110 */       List<JavaConstructor> list = new ArrayList();
/* 111 */       for (Constructor element : c) {
/* 112 */         if (Modifier.isPublic(element.getModifiers()))
/* 113 */           list.add(JavaConstructor.forConstructor(element)); 
/* 114 */       }  switch (list.size()) {
/*     */         case 0:
/*     */           break;
/*     */         case 1:
/* 118 */           map.put(NEW, list.get(0));
/*     */           break;
/*     */         default:
/* 121 */           map.put(NEW, 
/* 122 */               JavaConstructor.forConstructors(list.<JavaConstructor>toArray(new JavaConstructor[list.size()])));
/*     */           break;
/*     */       } 
/*     */       
/* 126 */       for (Iterator<Map.Entry> it = namedlists.entrySet().iterator(); it.hasNext(); ) {
/* 127 */         Map.Entry e = it.next();
/* 128 */         String name = (String)e.getKey();
/* 129 */         List methods = (List)e.getValue();
/* 130 */         map.put(LuaValue.valueOf(name), (methods.size() == 1) ? methods.get(0) : 
/* 131 */             JavaMethod.forMethods((JavaMethod[])methods.toArray((Object[])new JavaMethod[methods.size()])));
/*     */       } 
/* 133 */       this.methods = map;
/*     */     } 
/* 135 */     return (LuaValue)this.methods.get(key);
/*     */   }
/*     */   
/*     */   Class getInnerClass(LuaValue key) {
/* 139 */     if (this.innerclasses == null) {
/* 140 */       Map<Object, Object> m = new HashMap<>();
/* 141 */       Class[] c = ((Class)this.m_instance).getClasses();
/* 142 */       for (Class ci : c) {
/* 143 */         String name = ci.getName();
/* 144 */         String stub = name.substring(Math.max(name.lastIndexOf('$'), name.lastIndexOf('.')) + 1);
/* 145 */         m.put(LuaValue.valueOf(stub), ci);
/*     */       } 
/* 147 */       this.innerclasses = m;
/*     */     } 
/* 149 */     return (Class)this.innerclasses.get(key);
/*     */   }
/*     */   public LuaValue getConstructor() {
/* 152 */     return getMethod(NEW);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JavaClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */