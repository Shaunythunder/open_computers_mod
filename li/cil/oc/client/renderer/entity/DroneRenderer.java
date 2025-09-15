package li.cil.oc.client.renderer.entity;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001M;Q!\001\002\t\002=\tQ\002\022:p]\026\024VM\0343fe\026\024(BA\002\005\003\031)g\016^5us*\021QAB\001\te\026tG-\032:fe*\021q\001C\001\007G2LWM\034;\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001\001\005\002\021#5\t!AB\003\023\005!\0051CA\007Ee>tWMU3oI\026\024XM]\n\003#Q\001\"!F\017\016\003YQ!aA\f\013\005\025A\"BA\004\032\025\tQ2$A\005nS:,7M]1gi*\tA$A\002oKRL!A\b\f\003\rI+g\016Z3s\021\025\001\023\003\"\001\"\003\031a\024N\\5u}Q\tq\002C\004$#\t\007I\021\001\023\002\0135|G-\0327\026\003\025\002\"\001\005\024\n\005\035\022!aD'pI\026d\027+^1eG>\004H/\032:\t\r%\n\002\025!\003&\003\031iw\016Z3mA!)1&\005C!Y\005AAm\034*f]\022,'\017F\004.ger\004IQ$\021\0059\nT\"A\030\013\003A\nQa]2bY\006L!AM\030\003\tUs\027\016\036\005\006\007)\002\r\001\016\t\003k]j\021A\016\006\003\007eI!\001\017\034\003\r\025sG/\033;z\021\025Q$\0061\001<\003\005A\bC\001\030=\023\titF\001\004E_V\024G.\032\005\006)\002\raO\001\002s\")\021I\013a\001w\005\t!\020C\003DU\001\007A)A\002zC^\004\"AL#\n\005\031{#!\002$m_\006$\b\"\002%+\001\004!\025A\0013u\021\025Q\025\003\"\021L\003A9W\r^#oi&$\030\020V3yiV\024X\r\006\002M%B\021Q\nU\007\002\035*\021q*G\001\005kRLG.\003\002R\035\n\001\"+Z:pkJ\034W\rT8dCRLwN\034\005\006\007%\003\r\001\016")
public final class DroneRenderer {
  public static ResourceLocation getEntityTexture(Entity paramEntity) {
    return DroneRenderer$.MODULE$.func_110775_a(paramEntity);
  }
  
  public static void doRender(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    DroneRenderer$.MODULE$.func_76986_a(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public static ModelQuadcopter model() {
    return DroneRenderer$.MODULE$.model();
  }
  
  public static void updateIcons(IIconRegister paramIIconRegister) {
    DroneRenderer$.MODULE$.func_94143_a(paramIIconRegister);
  }
  
  public static FontRenderer getFontRendererFromRenderManager() {
    return DroneRenderer$.MODULE$.func_76983_a();
  }
  
  public static void doRenderShadowAndFire(Entity paramEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    DroneRenderer$.MODULE$.func_76979_b(paramEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  public static void setRenderManager(RenderManager paramRenderManager) {
    DroneRenderer$.MODULE$.func_76976_a(paramRenderManager);
  }
  
  public static boolean isStaticEntity() {
    return DroneRenderer$.MODULE$.func_147905_a();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\entity\DroneRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */