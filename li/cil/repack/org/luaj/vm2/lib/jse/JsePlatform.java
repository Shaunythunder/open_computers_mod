/*     */ package li.cil.repack.org.luaj.vm2.lib.jse;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.Globals;
/*     */ import li.cil.repack.org.luaj.vm2.LoadState;
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*     */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*     */ import li.cil.repack.org.luaj.vm2.Varargs;
/*     */ import li.cil.repack.org.luaj.vm2.compiler.LuaC;
/*     */ import li.cil.repack.org.luaj.vm2.lib.Bit32Lib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.CoroutineLib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.DebugLib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.PackageLib;
/*     */ import li.cil.repack.org.luaj.vm2.lib.TableLib;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JsePlatform
/*     */ {
/*     */   public static Globals standardGlobals() {
/* 111 */     Globals globals = new Globals();
/* 112 */     globals.load((LuaValue)new JseBaseLib());
/* 113 */     globals.load((LuaValue)new PackageLib());
/* 114 */     globals.load((LuaValue)new Bit32Lib());
/* 115 */     globals.load((LuaValue)new TableLib());
/* 116 */     globals.load((LuaValue)new JseStringLib());
/* 117 */     globals.load((LuaValue)new CoroutineLib());
/* 118 */     globals.load((LuaValue)new JseMathLib());
/* 119 */     globals.load((LuaValue)new JseIoLib());
/* 120 */     globals.load((LuaValue)new JseOsLib());
/* 121 */     globals.load((LuaValue)new LuajavaLib());
/* 122 */     LoadState.install(globals);
/* 123 */     LuaC.install(globals);
/* 124 */     return globals;
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
/*     */   public static Globals debugGlobals() {
/* 138 */     Globals globals = standardGlobals();
/* 139 */     globals.load((LuaValue)new DebugLib());
/* 140 */     return globals;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Varargs luaMain(LuaValue mainChunk, String[] args) {
/* 151 */     Globals g = standardGlobals();
/* 152 */     int n = args.length;
/* 153 */     LuaValue[] vargs = new LuaValue[args.length];
/* 154 */     for (int i = 0; i < n; i++)
/* 155 */       vargs[i] = (LuaValue)LuaValue.valueOf(args[i]); 
/* 156 */     LuaTable luaTable = LuaValue.listOf(vargs);
/* 157 */     luaTable.set("n", n);
/* 158 */     g.set("arg", (LuaValue)luaTable);
/* 159 */     mainChunk.initupvalue1((LuaValue)g);
/* 160 */     return mainChunk.invoke(LuaValue.varargsOf(vargs));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\jse\JsePlatform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */