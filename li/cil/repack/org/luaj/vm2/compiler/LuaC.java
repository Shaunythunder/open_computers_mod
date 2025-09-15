/*     */ package li.cil.repack.org.luaj.vm2.compiler;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Hashtable;
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LuaClosure;
/*     */ import li.cil.repack.org.luaj.vm2.LuaFunction;
/*     */ import li.cil.repack.org.luaj.vm2.LuaString;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Prototype;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LuaC
/*     */   extends Constants
/*     */   implements Globals.Compiler, Globals.Loader
/*     */ {
/*  85 */   public static final LuaC instance = new LuaC();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void install(Globals globals) {
/*  94 */     globals.compiler = instance;
/*  95 */     globals.loader = instance;
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
/*     */   public Prototype compile(InputStream stream, String chunkname) throws IOException {
/* 111 */     return (new CompileState()).luaY_parser(stream, chunkname);
/*     */   }
/*     */ 
/*     */   
/*     */   public LuaFunction load(Prototype prototype, String chunkname, LuaValue env) throws IOException {
/* 116 */     return (LuaFunction)new LuaClosure(prototype, env);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public LuaValue load(InputStream stream, String chunkname, Globals globals) throws IOException {
/* 126 */     return (LuaValue)new LuaClosure(compile(stream, chunkname), (LuaValue)globals);
/*     */   }
/*     */   
/*     */   static class CompileState {
/* 130 */     int nCcalls = 0;
/* 131 */     private final Hashtable strings = new Hashtable<>();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Prototype luaY_parser(InputStream z, String name) throws IOException {
/* 137 */       LexState lexstate = new LexState(this, z);
/* 138 */       FuncState funcstate = new FuncState();
/*     */       
/* 140 */       lexstate.fs = funcstate;
/* 141 */       lexstate.setinput(this, z.read(), z, LuaValue.valueOf(name));
/*     */       
/* 143 */       funcstate.f = new Prototype();
/* 144 */       funcstate.f.source = LuaValue.valueOf(name);
/* 145 */       lexstate.mainfunc(funcstate);
/* 146 */       Constants._assert((funcstate.prev == null));
/*     */       
/* 148 */       Constants._assert((lexstate.dyd == null || (lexstate.dyd.n_actvar == 0 && lexstate.dyd.n_gt == 0 && lexstate.dyd.n_label == 0)));
/*     */       
/* 150 */       return funcstate.f;
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaString newTString(String s) {
/* 155 */       return cachedLuaString(LuaString.valueOf(s));
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaString newTString(LuaString s) {
/* 160 */       return cachedLuaString(s);
/*     */     }
/*     */     
/*     */     public LuaString cachedLuaString(LuaString s) {
/* 164 */       LuaString c = (LuaString)this.strings.get(s);
/* 165 */       if (c != null)
/* 166 */         return c; 
/* 167 */       this.strings.put(s, s);
/* 168 */       return s;
/*     */     }
/*     */     
/*     */     public String pushfstring(String string) {
/* 172 */       return string;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\compiler\LuaC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */