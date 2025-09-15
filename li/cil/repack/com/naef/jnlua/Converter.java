package li.cil.repack.com.naef.jnlua;

public interface Converter {
  int getTypeDistance(LuaState paramLuaState, int paramInt, Class<?> paramClass);
  
  <T> T convertLuaValue(LuaState paramLuaState, int paramInt, Class<T> paramClass);
  
  void convertJavaObject(LuaState paramLuaState, Object paramObject);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\com\naef\jnlua\Converter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */