package li.cil.oc.api.fs;

import java.io.FileNotFoundException;
import li.cil.oc.api.Persistable;

public interface FileSystem extends Persistable {
  boolean isReadOnly();
  
  long spaceTotal();
  
  long spaceUsed();
  
  boolean exists(String paramString);
  
  long size(String paramString);
  
  boolean isDirectory(String paramString);
  
  long lastModified(String paramString);
  
  String[] list(String paramString);
  
  boolean delete(String paramString);
  
  boolean makeDirectory(String paramString);
  
  boolean rename(String paramString1, String paramString2) throws FileNotFoundException;
  
  boolean setLastModified(String paramString, long paramLong);
  
  int open(String paramString, Mode paramMode) throws FileNotFoundException;
  
  Handle getHandle(int paramInt);
  
  void close();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\fs\FileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */