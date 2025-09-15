/*     */ package li.cil.repack.com.naef.jnlua;
/*     */ 
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface JavaReflector
/*     */ {
/*     */   JavaFunction getMetamethod(Metamethod paramMetamethod);
/*     */   
/*     */   public enum Metamethod
/*     */   {
/*  43 */     INDEX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     NEWINDEX,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     LEN,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     EQ,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     LT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  68 */     LE,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     UNM,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     ADD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     SUB,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     MUL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     DIV,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     MOD,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     POW,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     CONCAT,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     CALL,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     TOSTRING,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     PAIRS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 128 */     IPAIRS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 133 */     JAVAFIELDS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     JAVAMETHODS,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     JAVAPROPERTIES;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getMetamethodName() {
/* 152 */       return "__" + toString().toLowerCase(Locale.ROOT);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\JavaReflector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */