/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class LibFunction
/*     */   extends LuaFunction
/*     */ {
/*     */   protected int opcode;
/*     */   protected String name;
/*     */   
/*     */   public String tojstring() {
/* 157 */     return (this.name != null) ? ("function: " + this.name) : super.tojstring();
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
/*     */   protected void bind(LuaValue env, Class factory, String[] names) {
/* 172 */     bind(env, factory, names, 0);
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
/*     */   protected void bind(LuaValue env, Class<LibFunction> factory, String[] names, int firstopcode) {
/*     */     try {
/* 189 */       for (int i = 0, n = names.length; i < n; i++) {
/* 190 */         LibFunction f = factory.newInstance();
/* 191 */         f.opcode = firstopcode + i;
/* 192 */         f.name = names[i];
/* 193 */         env.set(f.name, (LuaValue)f);
/*     */       } 
/* 195 */     } catch (Exception e) {
/* 196 */       throw new LuaError("bind failed: " + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static LuaValue[] newupe() {
/* 205 */     return new LuaValue[1];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static LuaValue[] newupn() {
/* 213 */     return new LuaValue[] { NIL };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected static LuaValue[] newupl(LuaValue v) {
/* 221 */     return new LuaValue[] { v };
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue call() {
/* 226 */     return argerror(1, "value expected");
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue a) {
/* 231 */     return call();
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue a, LuaValue b) {
/* 236 */     return call(a);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue call(LuaValue a, LuaValue b, LuaValue c) {
/* 241 */     return call(a, b);
/*     */   }
/*     */   
/*     */   public LuaValue call(LuaValue a, LuaValue b, LuaValue c, LuaValue d) {
/* 245 */     return call(a, b, c);
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs invoke(Varargs args) {
/* 250 */     switch (args.narg()) {
/*     */       case 0:
/* 252 */         return (Varargs)call();
/*     */       case 1:
/* 254 */         return (Varargs)call(args.arg1());
/*     */       case 2:
/* 256 */         return (Varargs)call(args.arg1(), args.arg(2));
/*     */       case 3:
/* 258 */         return (Varargs)call(args.arg1(), args.arg(2), args.arg(3));
/*     */     } 
/* 260 */     return (Varargs)call(args.arg1(), args.arg(2), args.arg(3), args.arg(4));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\LibFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */