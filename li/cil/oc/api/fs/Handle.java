package li.cil.oc.api.fs;

import java.io.IOException;

public interface Handle {
  long position();
  
  long length();
  
  void close();
  
  int read(byte[] paramArrayOfbyte) throws IOException;
  
  long seek(long paramLong) throws IOException;
  
  void write(byte[] paramArrayOfbyte) throws IOException;
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\fs\Handle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */