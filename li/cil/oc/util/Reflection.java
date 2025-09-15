/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ 
/*    */ public final class Reflection
/*    */ {
/*    */   public static Class<?> getClass(String name) {
/*    */     try {
/* 12 */       return Class.forName(name);
/* 13 */     } catch (ClassNotFoundException ignored) {
/* 14 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static Object get(Object instance, String fieldName) {
/*    */     try {
/* 20 */       Field field = instance.getClass().getField(fieldName);
/* 21 */       return field.get(instance);
/* 22 */     } catch (IllegalAccessException ignored) {
/* 23 */       return null;
/* 24 */     } catch (NoSuchFieldException ignored) {
/* 25 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void set(Object instance, String fieldName, Object value) {
/*    */     
/* 31 */     try { Field field = instance.getClass().getField(fieldName);
/* 32 */       field.set(instance, value); }
/* 33 */     catch (IllegalAccessException illegalAccessException) {  }
/* 34 */     catch (NoSuchFieldException noSuchFieldException) {}
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> T invoke(Object instance, String methodName, Object... args) throws Throwable {
/*    */     try {
/* 42 */       for (Method method : instance.getClass().getMethods()) {
/* 43 */         if (method.getName().equals(methodName) && (method.getParameterTypes()).length == args.length) {
/* 44 */           Class<?>[] argTypes = method.getParameterTypes();
/* 45 */           int i = 0; while (true) { if (i < argTypes.length) {
/* 46 */               Class<?> have = argTypes[i];
/* 47 */               Class<?> given = args[i].getClass();
/*    */               
/* 49 */               if (!have.isAssignableFrom(given) && (
/* 50 */                 !have.isPrimitive() || ((
/* 51 */                 !byte.class.equals(have) || !Byte.class.equals(given)) && (
/* 52 */                 !short.class.equals(have) || !Short.class.equals(given)) && (
/* 53 */                 !int.class.equals(have) || !Integer.class.equals(given)) && (
/* 54 */                 !long.class.equals(have) || !Long.class.equals(given)) && (
/* 55 */                 !float.class.equals(have) || !Float.class.equals(given)) && (
/* 56 */                 !double.class.equals(have) || !Double.class.equals(given)) && (
/* 57 */                 !boolean.class.equals(have) || !Boolean.class.equals(given)) && (
/* 58 */                 !char.class.equals(have) || !Character.class.equals(given)))))
/*    */                 break;  i++;
/*    */               continue;
/*    */             } 
/* 62 */             return (T)method.invoke(instance, args); }
/*    */         
/*    */         } 
/* 65 */       }  return null;
/* 66 */     } catch (InvocationTargetException e) {
/* 67 */       throw e.getCause();
/* 68 */     } catch (IllegalAccessException e) {
/* 69 */       return null;
/* 70 */     } catch (ClassCastException e) {
/* 71 */       return null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static <T> T tryInvoke(Object instance, String methodName, Object... args) {
/*    */     try {
/* 77 */       return invoke(instance, methodName, args);
/* 78 */     } catch (Throwable ignored) {
/* 79 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\Reflection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */