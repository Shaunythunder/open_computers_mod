/*     */ package li.cil.repack.org.luaj.vm2.lib;
/*     */ 
/*     */ import li.cil.repack.org.luaj.vm2.LuaTable;
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
/*     */ public class TableLib
/*     */   extends TwoArgFunction
/*     */ {
/*     */   public LuaValue call(LuaValue modname, LuaValue env) {
/*  82 */     LuaTable table = new LuaTable();
/*  83 */     table.set("concat", (LuaValue)new concat());
/*  84 */     table.set("insert", (LuaValue)new insert());
/*  85 */     table.set("pack", (LuaValue)new pack());
/*  86 */     table.set("remove", (LuaValue)new remove());
/*  87 */     table.set("sort", (LuaValue)new sort());
/*  88 */     table.set("unpack", (LuaValue)new unpack());
/*  89 */     env.set("table", (LuaValue)table);
/*  90 */     if (!env.get("package").isnil())
/*  91 */       env.get("package").get("loaded").set("table", (LuaValue)table); 
/*  92 */     return NIL;
/*     */   }
/*     */   
/*     */   static class concat
/*     */     extends TableLibFunction
/*     */   {
/*     */     public LuaValue call(LuaValue list) {
/*  99 */       return list.checktable().concat(EMPTYSTRING, 1, list.length());
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue list, LuaValue sep) {
/* 104 */       return list.checktable().concat(sep.checkstring(), 1, list.length());
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue list, LuaValue sep, LuaValue i) {
/* 109 */       return list.checktable().concat(sep.checkstring(), i.checkint(), list.length());
/*     */     }
/*     */ 
/*     */     
/*     */     public LuaValue call(LuaValue list, LuaValue sep, LuaValue i, LuaValue j) {
/* 114 */       return list.checktable().concat(sep.checkstring(), i.checkint(), j.checkint());
/*     */     } }
/*     */   
/*     */   static class insert extends VarArgFunction {
/*     */     public Varargs invoke(Varargs args) {
/*     */       LuaTable table;
/*     */       int pos;
/*     */       int max;
/* 122 */       switch (args.narg()) {
/*     */         case 2:
/* 124 */           table = args.checktable(1);
/* 125 */           table.insert(table.length() + 1, args.arg(2));
/* 126 */           return (Varargs)NONE;
/*     */         
/*     */         case 3:
/* 129 */           table = args.checktable(1);
/* 130 */           pos = args.checkint(2);
/* 131 */           max = table.length() + 1;
/* 132 */           if (pos < 1 || pos > max)
/* 133 */             argerror(2, "position out of bounds: " + pos + " not between 1 and " + max); 
/* 134 */           table.insert(pos, args.arg(3));
/* 135 */           return (Varargs)NONE;
/*     */       } 
/*     */       
/* 138 */       return (Varargs)error("wrong number of arguments to 'table.insert': " + args.narg() + " (must be 2 or 3)");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static class pack
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 148 */       LuaTable luaTable = tableOf(args, 1);
/* 149 */       luaTable.set("n", args.narg());
/* 150 */       return (Varargs)luaTable;
/*     */     }
/*     */   }
/*     */   
/*     */   static class remove
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 158 */       LuaTable table = args.checktable(1);
/* 159 */       int size = table.length();
/* 160 */       int pos = args.optint(2, size);
/* 161 */       if (pos != size && (pos < 1 || pos > size + 1)) {
/* 162 */         argerror(2, "position out of bounds: " + pos + " not between 1 and " + (size + 1));
/*     */       }
/* 164 */       return (Varargs)table.remove(pos);
/*     */     }
/*     */   }
/*     */   
/*     */   static class sort
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 172 */       args.checktable(1).sort(args.isnil(2) ? NIL : (LuaValue)args.checkfunction(2));
/* 173 */       return (Varargs)NONE;
/*     */     }
/*     */   }
/*     */   
/*     */   static class unpack
/*     */     extends VarArgFunction
/*     */   {
/*     */     public Varargs invoke(Varargs args) {
/* 181 */       LuaTable t = args.checktable(1);
/*     */       
/* 183 */       int len = args.arg(3).isnil() ? t.length() : 0;
/* 184 */       return t.unpack(args.optint(2, 1), args.optint(3, len));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\lib\TableLib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */