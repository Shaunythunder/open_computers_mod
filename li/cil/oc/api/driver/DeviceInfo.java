package li.cil.oc.api.driver;

import java.util.Map;

public interface DeviceInfo {
  Map<String, String> getDeviceInfo();
  
  public static final class DeviceAttribute {
    public static final String Class = "class";
    
    public static final String Description = "description";
    
    public static final String Vendor = "vendor";
    
    public static final String Product = "product";
    
    public static final String Version = "version";
    
    public static final String Serial = "serial";
    
    public static final String Capacity = "capacity";
    
    public static final String Size = "size";
    
    public static final String Clock = "clock";
    
    public static final String Width = "width";
  }
  
  public static final class DeviceClass {
    public static final String System = "system";
    
    public static final String Bridge = "bridge";
    
    public static final String Memory = "memory";
    
    public static final String Processor = "processor";
    
    public static final String Address = "address";
    
    public static final String Storage = "storage";
    
    public static final String Disk = "disk";
    
    public static final String Tape = "tape";
    
    public static final String Bus = "bus";
    
    public static final String Network = "network";
    
    public static final String Display = "display";
    
    public static final String Input = "input";
    
    public static final String Printer = "printer";
    
    public static final String Multimedia = "multimedia";
    
    public static final String Communication = "communication";
    
    public static final String Power = "power";
    
    public static final String Volume = "volume";
    
    public static final String Generic = "generic";
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\driver\DeviceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */