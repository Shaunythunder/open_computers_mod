/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import java.lang.reflect.Array;
/*     */ import java.lang.reflect.InvocationHandler;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Proxy;
/*     */ import li.cil.repack.org.luaj.vm2.LuaError;
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
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
/*     */ public class LuajavaLib
/*     */   extends VarArgFunction
/*     */ {
/*     */   static final int INIT = 0;
/*     */   static final int BINDCLASS = 1;
/*     */   static final int NEWINSTANCE = 2;
/*     */   static final int NEW = 3;
/*     */   static final int CREATEPROXY = 4;
/*     */   static final int LOADLIB = 5;
/* 104 */   static final String[] NAMES = new String[] { "bindClass", "newInstance", "new", "createProxy", "loadLib" }; public Varargs invoke(Varargs args) { try {
/*     */       LuaValue env; Class clazz; LuaValue c; int niface; String classname; LuaTable t; Class clazz1; LuaTable luaTable1; String methodname;
/*     */       Varargs consargs;
/*     */       Class[] ifaces;
/*     */       Class clazz2;
/*     */       int i;
/*     */       InvocationHandler handler;
/*     */       Method method;
/*     */       Object proxy;
/*     */       Object result;
/* 114 */       switch (this.opcode) {
/*     */         
/*     */         case 0:
/* 117 */           env = args.arg(2);
/* 118 */           t = new LuaTable();
/* 119 */           bind((LuaValue)t, getClass(), NAMES, 1);
/* 120 */           env.set("luajava", (LuaValue)t);
/* 121 */           if (!env.get("package").isnil())
/* 122 */             env.get("package").get("loaded").set("luajava", (LuaValue)t); 
/* 123 */           return (Varargs)t;
/*     */         
/*     */         case 1:
/* 126 */           clazz = classForName(args.checkjstring(1));
/* 127 */           return (Varargs)JavaClass.forClass(clazz);
/*     */ 
/*     */         
/*     */         case 2:
/*     */         case 3:
/* 132 */           c = args.checkvalue(1);
/*     */           
/* 134 */           clazz1 = (this.opcode == 2) ? classForName(c.tojstring()) : (Class)c.checkuserdata(Class.class);
/* 135 */           consargs = args.subargs(2);
/* 136 */           return JavaClass.forClass(clazz1).getConstructor().invoke(consargs);
/*     */ 
/*     */         
/*     */         case 4:
/* 140 */           niface = args.narg() - 1;
/* 141 */           if (niface <= 0)
/* 142 */             throw new LuaError("no interfaces"); 
/* 143 */           luaTable1 = args.checktable(niface + 1);
/*     */ 
/*     */           
/* 146 */           ifaces = new Class[niface];
/* 147 */           for (i = 0; i < niface; i++) {
/* 148 */             ifaces[i] = classForName(args.checkjstring(i + 1));
/*     */           }
/*     */           
/* 151 */           handler = new ProxyInvocationHandler((LuaValue)luaTable1);
/*     */ 
/*     */           
/* 154 */           proxy = Proxy.newProxyInstance(getClass().getClassLoader(), ifaces, handler);
/*     */ 
/*     */           
/* 157 */           return (Varargs)LuaValue.userdataOf(proxy);
/*     */ 
/*     */         
/*     */         case 5:
/* 161 */           classname = args.checkjstring(1);
/* 162 */           methodname = args.checkjstring(2);
/* 163 */           clazz2 = classForName(classname);
/* 164 */           method = clazz2.getMethod(methodname, new Class[0]);
/* 165 */           result = method.invoke(clazz2, new Object[0]);
/* 166 */           if (result instanceof LuaValue) {
/* 167 */             return (Varargs)result;
/*     */           }
/* 169 */           return (Varargs)NIL;
/*     */       } 
/*     */ 
/*     */       
/* 173 */       throw new LuaError("not yet supported: " + this);
/*     */     }
/* 175 */     catch (LuaError e) {
/* 176 */       throw e;
/* 177 */     } catch (InvocationTargetException ite) {
/* 178 */       throw new LuaError(ite.getTargetException());
/* 179 */     } catch (Exception e) {
/* 180 */       throw new LuaError(e);
/*     */     }  }
/*     */   
/*     */   static final int METHOD_MODIFIERS_VARARGS = 128;
/*     */   
/*     */   protected Class classForName(String name) throws ClassNotFoundException {
/* 186 */     return Class.forName(name, true, ClassLoader.getSystemClassLoader());
/*     */   }
/*     */   
/*     */   private static final class ProxyInvocationHandler implements InvocationHandler {
/*     */     private final LuaValue lobj;
/*     */     
/*     */     private ProxyInvocationHandler(LuaValue lobj) {
/* 193 */       this.lobj = lobj;
/*     */     }
/*     */     
/*     */     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
/*     */       LuaValue[] v;
/* 198 */       String name = method.getName();
/* 199 */       LuaValue func = this.lobj.get(name);
/* 200 */       if (func.isnil())
/* 201 */         return null; 
/* 202 */       boolean isvarargs = ((method.getModifiers() & 0x80) != 0);
/* 203 */       int n = (args != null) ? args.length : 0;
/*     */       
/* 205 */       if (isvarargs) {
/* 206 */         Object o = args[--n];
/* 207 */         int m = Array.getLength(o);
/* 208 */         v = new LuaValue[n + m]; int i;
/* 209 */         for (i = 0; i < n; i++)
/* 210 */           v[i] = CoerceJavaToLua.coerce(args[i]); 
/* 211 */         for (i = 0; i < m; i++)
/* 212 */           v[i + n] = CoerceJavaToLua.coerce(Array.get(o, i)); 
/*     */       } else {
/* 214 */         v = new LuaValue[n];
/* 215 */         for (int i = 0; i < n; i++)
/* 216 */           v[i] = CoerceJavaToLua.coerce(args[i]); 
/*     */       } 
/* 218 */       LuaValue result = func.invoke(v).arg1();
/* 219 */       return CoerceLuaToJava.coerce(result, method.getReturnType());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\LuajavaLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */