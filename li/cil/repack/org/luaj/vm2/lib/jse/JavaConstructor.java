/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.lang.reflect.Constructor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import li.cil.repack.org.luaj.vm2.LuaError;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
/*     */ import li.cil.repack.org.luaj.vm2.lib.VarArgFunction;
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
/*     */ class JavaConstructor
/*     */   extends JavaMember
/*     */ {
/*  49 */   static final Map constructors = Collections.synchronizedMap(new HashMap<>());
/*     */   
/*     */   static JavaConstructor forConstructor(Constructor c) {
/*  52 */     JavaConstructor j = (JavaConstructor)constructors.get(c);
/*  53 */     if (j == null)
/*  54 */       constructors.put(c, j = new JavaConstructor(c)); 
/*  55 */     return j;
/*     */   }
/*     */   final Constructor constructor;
/*     */   public static LuaValue forConstructors(JavaConstructor[] array) {
/*  59 */     return (LuaValue)new Overload(array);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private JavaConstructor(Constructor c) {
/*  65 */     super(c.getParameterTypes(), c.getModifiers());
/*  66 */     this.constructor = c;
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs invoke(Varargs args) {
/*  71 */     Object[] a = convertArgs(args);
/*     */     try {
/*  73 */       return (Varargs)CoerceJavaToLua.coerce(this.constructor.newInstance(a));
/*  74 */     } catch (InvocationTargetException e) {
/*  75 */       throw new LuaError(e.getTargetException());
/*  76 */     } catch (Exception e) {
/*  77 */       return (Varargs)LuaValue.error("coercion error " + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class Overload
/*     */     extends VarArgFunction
/*     */   {
/*     */     final JavaConstructor[] constructors;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Overload(JavaConstructor[] c) {
/*  94 */       this.constructors = c;
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs invoke(Varargs args) {
/*  99 */       JavaConstructor best = null;
/* 100 */       int score = CoerceLuaToJava.SCORE_UNCOERCIBLE;
/* 101 */       for (JavaConstructor constructor : this.constructors) {
/* 102 */         int s = constructor.score(args);
/* 103 */         if (s < score) {
/* 104 */           score = s;
/* 105 */           best = constructor;
/* 106 */           if (score == 0) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 112 */       if (best == null) {
/* 113 */         LuaValue.error("no coercible public method");
/*     */       }
/*     */       
/* 116 */       return best.invoke(args);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JavaConstructor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */