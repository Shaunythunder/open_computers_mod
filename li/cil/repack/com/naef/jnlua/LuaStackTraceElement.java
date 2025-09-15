/*     */ package li.cil.repack.com.naef.jnlua;
/*     */ 
/*     */ import java.util.Objects;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaStackTraceElement
/*     */ {
/*     */   private String functionName;
/*     */   private String sourceName;
/*     */   private int lineNumber;
/*     */   
/*     */   public LuaStackTraceElement(String functionName, String sourceName, int lineNumber) {
/*  32 */     this.functionName = functionName;
/*  33 */     this.sourceName = sourceName;
/*  34 */     this.lineNumber = lineNumber;
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
/*     */   public String getFunctionName() {
/*  47 */     return this.functionName;
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
/*     */   public String getSourceName() {
/*  61 */     return this.sourceName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLineNumber() {
/*  72 */     return this.lineNumber;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  78 */     int result = (this.functionName != null) ? this.functionName.hashCode() : 0;
/*     */     
/*  80 */     result = result * 65599 + ((this.sourceName != null) ? this.sourceName.hashCode() : 0);
/*  81 */     result = result * 65599 + this.lineNumber;
/*  82 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/*  87 */     if (obj == this) {
/*  88 */       return true;
/*     */     }
/*  90 */     if (!(obj instanceof LuaStackTraceElement)) {
/*  91 */       return false;
/*     */     }
/*  93 */     LuaStackTraceElement other = (LuaStackTraceElement)obj;
/*  94 */     return (Objects.equals(this.functionName, other.functionName) && 
/*  95 */       Objects.equals(this.sourceName, other.sourceName) && this.lineNumber == other.lineNumber);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 101 */     StringBuilder sb = new StringBuilder();
/* 102 */     if (this.functionName != null) {
/* 103 */       sb.append(this.functionName);
/*     */     } else {
/* 105 */       sb.append("(Unknown Function)");
/*     */     } 
/* 107 */     sb.append(" (");
/* 108 */     if (this.sourceName != null) {
/* 109 */       sb.append(this.sourceName);
/* 110 */       if (this.lineNumber >= 0) {
/* 111 */         sb.append(':');
/* 112 */         sb.append(this.lineNumber);
/*     */       } 
/*     */     } else {
/* 115 */       sb.append("External Function");
/*     */     } 
/* 117 */     sb.append(')');
/* 118 */     return sb.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\LuaStackTraceElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */