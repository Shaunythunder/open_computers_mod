package li.cil.oc.util;

import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001\005;Q!\001\002\t\002-\t1BU3oI\026\0248\013^1uK*\0211\001B\001\005kRLGN\003\002\006\r\005\021qn\031\006\003\017!\t1aY5m\025\005I\021A\0017j\007\001\001\"\001D\007\016\003\t1QA\004\002\t\002=\0211BU3oI\026\0248\013^1uKN\021Q\002\005\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\t\013]iA\021\001\r\002\rqJg.\033;?)\005Y\001b\002\016\016\005\004%\taG\001\004CJ\024W#\001\017\021\005Ei\022B\001\020\023\005\035\021un\0347fC:Da\001I\007!\002\023a\022\001B1sE\002BQAI\007\005\002\r\n!b\0315fG.,%O]8s)\t!s\005\005\002\022K%\021aE\005\002\005+:LG\017C\003)C\001\007\021&A\003xQ\026\024X\r\005\002+[9\021\021cK\005\003YI\ta\001\025:fI\0264\027B\001\0300\005\031\031FO]5oO*\021AF\005\005\006c5!\taG\001\025G>l\007/\0337j]\036$\025n\0359mCfd\025n\035;\t\013MjA\021\001\033\002\037\021L7/\0312mK2Kw\r\033;j]\036$\022\001\n\005\006m5!\t\001N\001\017K:\f'\r\\3MS\036DG/\0338h\021\025AT\002\"\0015\003-i\027m[3Ji\ncWM\0343\t\013ijA\021A\036\002\033M,GO\0217f]\022\fE\016\0355b)\t!C\bC\003>s\001\007a(A\003bYBD\027\r\005\002\022%\021\001I\005\002\006\r2|\027\r\036")
public final class RenderState {
  public static void setBlendAlpha(float paramFloat) {
    RenderState$.MODULE$.setBlendAlpha(paramFloat);
  }
  
  public static void makeItBlend() {
    RenderState$.MODULE$.makeItBlend();
  }
  
  public static void enableLighting() {
    RenderState$.MODULE$.enableLighting();
  }
  
  public static void disableLighting() {
    RenderState$.MODULE$.disableLighting();
  }
  
  public static boolean compilingDisplayList() {
    return RenderState$.MODULE$.compilingDisplayList();
  }
  
  public static void checkError(String paramString) {
    RenderState$.MODULE$.checkError(paramString);
  }
  
  public static boolean arb() {
    return RenderState$.MODULE$.arb();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\RenderState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */