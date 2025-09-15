/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Collections;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import li.cil.repack.org.luaj.vm2.LuaError;
/*     */ import li.cil.repack.org.luaj.vm2.LuaFunction;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
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
/*     */ class JavaMethod
/*     */   extends JavaMember
/*     */ {
/*  48 */   static final Map methods = Collections.synchronizedMap(new HashMap<>());
/*     */   
/*     */   static JavaMethod forMethod(Method m) {
/*  51 */     JavaMethod j = (JavaMethod)methods.get(m);
/*  52 */     if (j == null)
/*  53 */       methods.put(m, j = new JavaMethod(m)); 
/*  54 */     return j;
/*     */   }
/*     */   final Method method;
/*     */   static LuaFunction forMethods(JavaMethod[] m) {
/*  58 */     return new Overload(m);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private JavaMethod(Method m) {
/*  64 */     super(m.getParameterTypes(), m.getModifiers());
/*  65 */     this.method = m;
/*     */     try {
/*  67 */       if (!m.isAccessible())
/*  68 */         m.setAccessible(true); 
/*  69 */     } catch (SecurityException securityException) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue call() {
/*  75 */     return error("method cannot be called without instance");
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue arg) {
/*  80 */     return invokeMethod(arg.checkuserdata(), (Varargs)LuaValue.NONE);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue arg1, LuaValue arg2) {
/*  85 */     return invokeMethod(arg1.checkuserdata(), (Varargs)arg2);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
/*  90 */     return invokeMethod(arg1.checkuserdata(), LuaValue.varargsOf(arg2, (Varargs)arg3));
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs invoke(Varargs args) {
/*  95 */     return (Varargs)invokeMethod(args.checkuserdata(1), args.subargs(2));
/*     */   }
/*     */   
/*     */   LuaValue invokeMethod(Object instance, Varargs args) {
/*  99 */     Object[] a = convertArgs(args);
/*     */     try {
/* 101 */       return CoerceJavaToLua.coerce(this.method.invoke(instance, a));
/* 102 */     } catch (InvocationTargetException e) {
/* 103 */       throw new LuaError(e.getTargetException());
/* 104 */     } catch (Exception e) {
/* 105 */       return LuaValue.error("coercion error " + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static class Overload
/*     */     extends LuaFunction
/*     */   {
/*     */     final JavaMethod[] methods;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Overload(JavaMethod[] methods) {
/* 123 */       this.methods = methods;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call() {
/* 128 */       return error("method cannot be called without instance");
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue arg) {
/* 133 */       return invokeBestMethod(arg.checkuserdata(), (Varargs)LuaValue.NONE);
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue arg1, LuaValue arg2) {
/* 138 */       return invokeBestMethod(arg1.checkuserdata(), (Varargs)arg2);
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue arg1, LuaValue arg2, LuaValue arg3) {
/* 143 */       return invokeBestMethod(arg1.checkuserdata(), LuaValue.varargsOf(arg2, (Varargs)arg3));
/*     */     }
/*     */ 
/*     */     
/*     */     public Varargs invoke(Varargs args) {
/* 148 */       return (Varargs)invokeBestMethod(args.checkuserdata(1), args.subargs(2));
/*     */     }
/*     */     
/*     */     private LuaValue invokeBestMethod(Object instance, Varargs args) {
/* 152 */       JavaMethod best = null;
/* 153 */       int score = CoerceLuaToJava.SCORE_UNCOERCIBLE;
/* 154 */       for (JavaMethod method : this.methods) {
/* 155 */         int s = method.score(args);
/* 156 */         if (s < score) {
/* 157 */           score = s;
/* 158 */           best = method;
/* 159 */           if (score == 0) {
/*     */             break;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 165 */       if (best == null) {
/* 166 */         LuaValue.error("no coercible public method");
/*     */       }
/*     */       
/* 169 */       return best.invokeMethod(instance, args);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JavaMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */