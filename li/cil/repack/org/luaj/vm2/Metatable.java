package li.cil.repack.org.luaj.vm2;

interface Metatable {
  boolean useWeakKeys();
  
  boolean useWeakValues();
  
  LuaValue toLuaValue();
  
  LuaTable.Slot entry(LuaValue paramLuaValue1, LuaValue paramLuaValue2);
  
  LuaValue wrap(LuaValue paramLuaValue);
  
  LuaValue arrayget(LuaValue[] paramArrayOfLuaValue, int paramInt);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\repack\org\luaj\vm2\Metatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */