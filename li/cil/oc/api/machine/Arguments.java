package li.cil.oc.api.machine;

import java.util.Map;
import net.minecraft.item.ItemStack;

public interface Arguments extends Iterable<Object> {
  int count();
  
  Object checkAny(int paramInt);
  
  boolean checkBoolean(int paramInt);
  
  int checkInteger(int paramInt);
  
  long checkLong(int paramInt);
  
  double checkDouble(int paramInt);
  
  String checkString(int paramInt);
  
  byte[] checkByteArray(int paramInt);
  
  Map checkTable(int paramInt);
  
  ItemStack checkItemStack(int paramInt);
  
  Object optAny(int paramInt, Object paramObject);
  
  boolean optBoolean(int paramInt, boolean paramBoolean);
  
  int optInteger(int paramInt1, int paramInt2);
  
  long optLong(int paramInt, long paramLong);
  
  double optDouble(int paramInt, double paramDouble);
  
  String optString(int paramInt, String paramString);
  
  byte[] optByteArray(int paramInt, byte[] paramArrayOfbyte);
  
  Map optTable(int paramInt, Map paramMap);
  
  ItemStack optItemStack(int paramInt, ItemStack paramItemStack);
  
  boolean isBoolean(int paramInt);
  
  boolean isInteger(int paramInt);
  
  boolean isLong(int paramInt);
  
  boolean isDouble(int paramInt);
  
  boolean isString(int paramInt);
  
  boolean isByteArray(int paramInt);
  
  boolean isTable(int paramInt);
  
  boolean isItemStack(int paramInt);
  
  Object[] toArray();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\Arguments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */