package li.cil.oc.api.machine;

import java.util.Map;
import li.cil.oc.api.network.ManagedEnvironment;

public interface Machine extends ManagedEnvironment, Context {
  MachineHost host();
  
  void onHostChanged();
  
  Architecture architecture();
  
  Map<String, String> components();
  
  int componentCount();
  
  int maxComponents();
  
  double getCostPerTick();
  
  void setCostPerTick(double paramDouble);
  
  String tmpAddress();
  
  String lastError();
  
  long worldTime();
  
  double upTime();
  
  double cpuTime();
  
  void beep(short paramShort1, short paramShort2);
  
  void beep(String paramString);
  
  boolean crash(String paramString);
  
  Signal popSignal();
  
  Map<String, Callback> methods(Object paramObject);
  
  Object[] invoke(String paramString1, String paramString2, Object[] paramArrayOfObject) throws Exception;
  
  Object[] invoke(Value paramValue, String paramString, Object[] paramArrayOfObject) throws Exception;
  
  String[] users();
  
  void addUser(String paramString) throws Exception;
  
  boolean removeUser(String paramString);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\Machine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */