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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Prototype
/*     */ {
/*     */   public LuaValue[] k;
/*     */   public int[] code;
/*     */   public Prototype[] p;
/*     */   public int[] lineinfo;
/*     */   public LocVars[] locvars;
/*     */   public Upvaldesc[] upvalues;
/*     */   public LuaString source;
/*     */   public int linedefined;
/*     */   public int lastlinedefined;
/*     */   public int numparams;
/*     */   public int is_vararg;
/*     */   public int maxstacksize;
/* 135 */   private static final Upvaldesc[] NOUPVALUES = new Upvaldesc[0];
/* 136 */   private static final Prototype[] NOSUBPROTOS = new Prototype[0];
/*     */   
/*     */   public Prototype() {
/* 139 */     this.p = NOSUBPROTOS;
/* 140 */     this.upvalues = NOUPVALUES;
/*     */   }
/*     */   
/*     */   public Prototype(int n_upvalues) {
/* 144 */     this.p = NOSUBPROTOS;
/* 145 */     this.upvalues = new Upvaldesc[n_upvalues];
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 150 */     return this.source + ":" + this.linedefined + "-" + this.lastlinedefined;
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
/*     */   public LuaString getlocalname(int number, int pc) {
/* 162 */     for (int i = 0; i < this.locvars.length && (this.locvars[i]).startpc <= pc; i++) {
/*     */       
/* 164 */       number--;
/* 165 */       if (pc < (this.locvars[i]).endpc && number == 0) {
/* 166 */         return (this.locvars[i]).varname;
/*     */       }
/*     */     } 
/* 169 */     return null;
/*     */   }
/*     */   
/*     */   public String shortsource() {
/* 173 */     String name = this.source.tojstring();
/* 174 */     if (name.startsWith("@") || name.startsWith("=")) {
/* 175 */       name = name.substring(1);
/* 176 */     } else if (name.startsWith("\033")) {
/* 177 */       name = "binary string";
/* 178 */     }  return name;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\Prototype.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */