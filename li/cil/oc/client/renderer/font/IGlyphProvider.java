package li.cil.oc.client.renderer.font;

import java.nio.ByteBuffer;

public interface IGlyphProvider {
  void initialize();
  
  ByteBuffer getGlyph(int paramInt);
  
  int getGlyphWidth();
  
  int getGlyphHeight();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\font\IGlyphProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */