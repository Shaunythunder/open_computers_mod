package li.cil.oc.api.detail;

import li.cil.oc.api.fs.FileSystem;
import li.cil.oc.api.fs.Label;
import li.cil.oc.api.network.EnvironmentHost;
import li.cil.oc.api.network.ManagedEnvironment;

public interface FileSystemAPI {
  FileSystem fromClass(Class<?> paramClass, String paramString1, String paramString2);
  
  FileSystem fromSaveDirectory(String paramString, long paramLong, boolean paramBoolean);
  
  FileSystem fromMemory(long paramLong);
  
  FileSystem fromComputerCraft(Object paramObject);
  
  FileSystem asReadOnly(FileSystem paramFileSystem);
  
  ManagedEnvironment asManagedEnvironment(FileSystem paramFileSystem, Label paramLabel, EnvironmentHost paramEnvironmentHost, String paramString, int paramInt);
  
  ManagedEnvironment asManagedEnvironment(FileSystem paramFileSystem, String paramString1, EnvironmentHost paramEnvironmentHost, String paramString2, int paramInt);
  
  @Deprecated
  ManagedEnvironment asManagedEnvironment(FileSystem paramFileSystem, Label paramLabel, EnvironmentHost paramEnvironmentHost, String paramString);
  
  @Deprecated
  ManagedEnvironment asManagedEnvironment(FileSystem paramFileSystem, String paramString1, EnvironmentHost paramEnvironmentHost, String paramString2);
  
  @Deprecated
  ManagedEnvironment asManagedEnvironment(FileSystem paramFileSystem, Label paramLabel);
  
  @Deprecated
  ManagedEnvironment asManagedEnvironment(FileSystem paramFileSystem, String paramString);
  
  @Deprecated
  ManagedEnvironment asManagedEnvironment(FileSystem paramFileSystem);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\detail\FileSystemAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */