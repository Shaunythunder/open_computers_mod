/*    */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*    */ 
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ import li.cil.repack.org.luaj.vm2.lib.VarArgFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class JavaMember
/*    */   extends VarArgFunction
/*    */ {
/*    */   static final int METHOD_MODIFIERS_VARARGS = 128;
/*    */   final CoerceLuaToJava.Coercion[] fixedargs;
/*    */   final CoerceLuaToJava.Coercion varargs;
/*    */   
/*    */   protected JavaMember(Class[] params, int modifiers) {
/* 50 */     boolean isvarargs = ((modifiers & 0x80) != 0);
/* 51 */     this.fixedargs = new CoerceLuaToJava.Coercion[isvarargs ? (params.length - 1) : params.length];
/* 52 */     for (int i = 0; i < this.fixedargs.length; i++)
/* 53 */       this.fixedargs[i] = CoerceLuaToJava.getCoercion(params[i]); 
/* 54 */     this.varargs = isvarargs ? CoerceLuaToJava.getCoercion(params[params.length - 1]) : null;
/*    */   }
/*    */   
/*    */   int score(Varargs args) {
/* 58 */     int n = args.narg();
/* 59 */     int s = (n > this.fixedargs.length) ? (CoerceLuaToJava.SCORE_WRONG_TYPE * (n - this.fixedargs.length)) : 0;
/* 60 */     for (int j = 0; j < this.fixedargs.length; j++)
/* 61 */       s += this.fixedargs[j].score(args.arg(j + 1)); 
/* 62 */     if (this.varargs != null)
/* 63 */       for (int k = this.fixedargs.length; k < n; k++)
/* 64 */         s += this.varargs.score(args.arg(k + 1));  
/* 65 */     return s;
/*    */   }
/*    */   
/*    */   protected Object[] convertArgs(Varargs args) {
/*    */     Object[] a;
/* 70 */     if (this.varargs == null) {
/* 71 */       a = new Object[this.fixedargs.length];
/* 72 */       for (int i = 0; i < a.length; i++)
/* 73 */         a[i] = this.fixedargs[i].coerce(args.arg(i + 1)); 
/*    */     } else {
/* 75 */       int n = Math.max(this.fixedargs.length, args.narg());
/* 76 */       a = new Object[n]; int i;
/* 77 */       for (i = 0; i < this.fixedargs.length; i++)
/* 78 */         a[i] = this.fixedargs[i].coerce(args.arg(i + 1)); 
/* 79 */       for (i = this.fixedargs.length; i < n; i++)
/* 80 */         a[i] = this.varargs.coerce(args.arg(i + 1)); 
/*    */     } 
/* 82 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JavaMember.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */