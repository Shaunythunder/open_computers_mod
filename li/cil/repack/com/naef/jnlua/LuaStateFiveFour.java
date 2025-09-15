/*     */ package li.cil.repack.com.naef.jnlua;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ public class LuaStateFiveFour
/*     */   extends LuaStateFiveThree
/*     */ {
/*     */   public LuaStateFiveFour() {}
/*     */   
/*     */   public LuaStateFiveFour(int memory) {
/*  13 */     super(memory);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected native boolean lua_isinteger(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   protected native int lua_integerwidth();
/*     */ 
/*     */ 
/*     */   
/*     */   protected native int lua_pointerwidth();
/*     */ 
/*     */ 
/*     */   
/*     */   protected native int lua_registryindex();
/*     */ 
/*     */ 
/*     */   
/*     */   protected native String lua_version();
/*     */ 
/*     */ 
/*     */   
/*     */   protected native int lua_versionnum();
/*     */ 
/*     */ 
/*     */   
/*     */   protected native void lua_newstate(int paramInt, long paramLong);
/*     */ 
/*     */ 
/*     */   
/*     */   protected native void lua_close(boolean paramBoolean);
/*     */ 
/*     */   
/*     */   protected native int lua_gc(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native void lua_openlib(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_load(InputStream paramInputStream, String paramString1, String paramString2) throws IOException;
/*     */ 
/*     */   
/*     */   protected native void lua_dump(OutputStream paramOutputStream) throws IOException;
/*     */ 
/*     */   
/*     */   protected native void lua_pcall(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native void lua_getglobal(String paramString);
/*     */ 
/*     */   
/*     */   protected native void lua_setglobal(String paramString);
/*     */ 
/*     */   
/*     */   protected native void lua_pushboolean(boolean paramBoolean);
/*     */ 
/*     */   
/*     */   protected native void lua_pushbytearray(byte[] paramArrayOfbyte);
/*     */ 
/*     */   
/*     */   protected native void lua_pushinteger(long paramLong);
/*     */ 
/*     */   
/*     */   protected native void lua_pushjavafunction(JavaFunction paramJavaFunction);
/*     */ 
/*     */   
/*     */   protected native void lua_pushjavaobject(Object paramObject);
/*     */ 
/*     */   
/*     */   protected native void lua_pushnil();
/*     */ 
/*     */   
/*     */   protected native void lua_pushnumber(double paramDouble);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isboolean(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_iscfunction(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isfunction(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isjavafunction(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isjavaobject(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isnil(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isnone(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isnoneornil(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isnumber(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isstring(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_istable(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_isthread(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_compare(int paramInt1, int paramInt2, int paramInt3);
/*     */ 
/*     */   
/*     */   protected native int lua_rawequal(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native int lua_rawlen(int paramInt);
/*     */ 
/*     */   
/*     */   protected native boolean lua_toboolean(int paramInt);
/*     */ 
/*     */   
/*     */   protected native byte[] lua_tobytearray(int paramInt);
/*     */ 
/*     */   
/*     */   protected native long lua_tointeger(int paramInt);
/*     */ 
/*     */   
/*     */   protected native Long lua_tointegerx(int paramInt);
/*     */ 
/*     */   
/*     */   protected native JavaFunction lua_tojavafunction(int paramInt);
/*     */ 
/*     */   
/*     */   protected native Object lua_tojavaobject(int paramInt);
/*     */ 
/*     */   
/*     */   protected native double lua_tonumber(int paramInt);
/*     */ 
/*     */   
/*     */   protected native Double lua_tonumberx(int paramInt);
/*     */ 
/*     */   
/*     */   protected native long lua_topointer(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_type(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_absindex(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_arith(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_concat(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_copy(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native int lua_gettop();
/*     */ 
/*     */   
/*     */   protected native void lua_len(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_insert(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_pop(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_pushvalue(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_remove(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_replace(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_settop(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_createtable(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native int lua_getsubtable(int paramInt, String paramString);
/*     */ 
/*     */   
/*     */   protected native void lua_gettable(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_getfield(int paramInt, String paramString);
/*     */ 
/*     */   
/*     */   protected native void lua_newtable();
/*     */ 
/*     */   
/*     */   protected native int lua_next(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_rawget(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_rawgeti(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native void lua_rawset(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_rawseti(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native void lua_settable(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_setfield(int paramInt, String paramString);
/*     */ 
/*     */   
/*     */   protected native int lua_getmetatable(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_setmetatable(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_getmetafield(int paramInt, String paramString);
/*     */ 
/*     */   
/*     */   protected native void lua_newthread();
/*     */ 
/*     */   
/*     */   protected native int lua_resume(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native int lua_status(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_ref(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_unref(int paramInt1, int paramInt2);
/*     */ 
/*     */   
/*     */   protected native LuaState.LuaDebug lua_getstack(int paramInt);
/*     */ 
/*     */   
/*     */   protected native int lua_getinfo(String paramString, LuaState.LuaDebug paramLuaDebug);
/*     */ 
/*     */   
/*     */   protected native int lua_tablesize(int paramInt);
/*     */ 
/*     */   
/*     */   protected native void lua_tablemove(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */ 
/*     */   
/*     */   protected static class LuaDebug
/*     */     extends LuaState.LuaDebug
/*     */   {
/*     */     protected LuaDebug(long luaDebug, boolean ownDebug) {
/* 278 */       super(luaDebug, ownDebug);
/*     */     }
/*     */     
/*     */     protected native void lua_debugfree();
/*     */     
/*     */     protected native String lua_debugname();
/*     */     
/*     */     protected native String lua_debugnamewhat();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\LuaStateFiveFour.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */