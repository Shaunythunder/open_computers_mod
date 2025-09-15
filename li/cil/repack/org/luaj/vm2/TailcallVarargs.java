/*     */ package li.cil.repack.org.luaj.vm2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TailcallVarargs
/*     */   extends Varargs
/*     */ {
/*     */   private LuaValue func;
/*     */   private Varargs args;
/*     */   private Varargs result;
/*     */   
/*     */   public TailcallVarargs(LuaValue f, Varargs args) {
/*  49 */     this.func = f;
/*  50 */     this.args = args;
/*     */   }
/*     */   
/*     */   public TailcallVarargs(LuaValue object, LuaValue methodname, Varargs args) {
/*  54 */     this.func = object.get(methodname);
/*  55 */     this.args = LuaValue.varargsOf(object, args);
/*     */   }
/*     */   
/*     */   public boolean isTailcall() {
/*  59 */     return true;
/*     */   }
/*     */   
/*     */   public Varargs eval() {
/*  63 */     while (this.result == null) {
/*  64 */       Varargs r = this.func.onInvoke(this.args);
/*  65 */       if (r.isTailcall()) {
/*  66 */         TailcallVarargs t = (TailcallVarargs)r;
/*  67 */         this.func = t.func;
/*  68 */         this.args = t.args; continue;
/*     */       } 
/*  70 */       this.result = r;
/*  71 */       this.func = null;
/*  72 */       this.args = null;
/*     */     } 
/*     */     
/*  75 */     return this.result;
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue arg(int i) {
/*  80 */     if (this.result == null)
/*  81 */       eval(); 
/*  82 */     return this.result.arg(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaValue arg1() {
/*  87 */     if (this.result == null)
/*  88 */       eval(); 
/*  89 */     return this.result.arg1();
/*     */   }
/*     */ 
/*     */   
/*     */   public int narg() {
/*  94 */     if (this.result == null)
/*  95 */       eval(); 
/*  96 */     return this.result.narg();
/*     */   }
/*     */ 
/*     */   
/*     */   public Varargs subargs(int start) {
/* 101 */     if (this.result == null)
/* 102 */       eval(); 
/* 103 */     return this.result.subargs(start);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\TailcallVarargs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */