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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaError
/*     */   extends RuntimeException
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   protected int level;
/*     */   protected String fileline;
/*     */   protected String traceback;
/*     */   protected Throwable cause;
/*     */   private LuaValue object;
/*     */   
/*     */   public String getMessage() {
/*  59 */     if (this.traceback != null)
/*  60 */       return this.traceback; 
/*  61 */     String m = super.getMessage();
/*  62 */     if (m == null)
/*  63 */       return null; 
/*  64 */     if (this.fileline != null)
/*  65 */       return this.fileline + m; 
/*  66 */     return m;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaValue getMessageObject() {
/*  77 */     if (this.object != null)
/*  78 */       return this.object; 
/*  79 */     String m = getMessage();
/*  80 */     return (m != null) ? LuaValue.valueOf(m) : null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaError(Throwable cause) {
/*  91 */     super("vm error: " + cause);
/*  92 */     this.cause = cause;
/*  93 */     this.level = 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaError(String message) {
/* 102 */     super(message);
/* 103 */     this.level = 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaError(String message, int level) {
/* 114 */     super(message);
/* 115 */     this.level = level;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LuaError(LuaValue message_object) {
/* 125 */     super(message_object.tojstring());
/* 126 */     this.object = message_object;
/* 127 */     this.level = 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Throwable getCause() {
/* 134 */     return this.cause;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\LuaError.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */