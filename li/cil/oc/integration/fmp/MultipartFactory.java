package li.cil.oc.integration.fmp;

import codechicken.multipart.TMultiPart;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001!;Q!\001\002\t\0025\t\001#T;mi&\004\030M\035;GC\016$xN]=\013\005\r!\021a\0014na*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\001#T;mi&\004\030M\035;GC\016$xN]=\024\007=\021\002\004\005\002\024-5\tACC\001\026\003\025\0318-\0317b\023\t9BC\001\004B]f\024VM\032\t\0033\035r!A\007\023\017\005m\tcB\001\017 \033\005i\"B\001\020\r\003\031a$o\\8u}%\t\001%A\006d_\022,7\r[5dW\026t\027B\001\022$\003%iW\017\034;ja\006\024HOC\001!\023\t)c%A\tNk2$\030\016U1siJ+w-[:uefT!AI\022\n\005!J#\001D%QCJ$h)Y2u_JL(BA\023'\021\025Ys\002\"\001-\003\031a\024N\\5u}Q\tQ\002C\003/\037\021\005q&\001\003j]&$H#\001\031\021\005M\t\024B\001\032\025\005\021)f.\033;\t\013QzA\021I\033\002\025\r\024X-\031;f!\006\024H\017F\0027u\r\003\"a\016\035\016\003\031J!!\017\024\003\025QkU\017\034;j!\006\024H\017C\003<g\001\007A(\001\003oC6,\007CA\037A\035\t\031b(\003\002@)\0051\001K]3eK\032L!!\021\"\003\rM#(/\0338h\025\tyD\003C\003Eg\001\007Q)\001\004dY&,g\016\036\t\003'\031K!a\022\013\003\017\t{w\016\\3b]\002")
public final class MultipartFactory {
  public static TMultiPart createPart(String paramString, boolean paramBoolean) {
    return MultipartFactory$.MODULE$.createPart(paramString, paramBoolean);
  }
  
  public static void init() {
    MultipartFactory$.MODULE$.init();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\MultipartFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */