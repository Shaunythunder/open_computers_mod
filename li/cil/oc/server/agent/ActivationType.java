package li.cil.oc.server.agent;

import scala.Enumeration;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001A:Q!\001\002\t\0025\ta\"Q2uSZ\fG/[8o)f\004XM\003\002\004\t\005)\021mZ3oi*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\bBGRLg/\031;j_:$\026\020]3\024\005=\021\002CA\n\027\033\005!\"\"A\013\002\013M\034\027\r\\1\n\005]!\"aC#ok6,'/\031;j_:DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\017qy!\031!C\001;\005!aj\0348f+\005q\002CA\020!\033\005y\021BA\021\027\005\0251\026\r\\;f\021\031\031s\002)A\005=\005)aj\0348fA!9Qe\004b\001\n\003i\022\001C%uK6,6/\0323\t\r\035z\001\025!\003\037\003%IE/Z7Vg\026$\007\005C\004*\037\t\007I\021A\017\002\025%#X-\034)mC\016,G\r\003\004,\037\001\006IAH\001\f\023R,W\016\0257bG\026$\007\005C\004.\037\t\007I\021A\017\002\035\tcwnY6BGRLg/\031;fI\"1qf\004Q\001\ny\tqB\0217pG.\f5\r^5wCR,G\r\t")
public final class ActivationType {
  public static Enumeration.Value BlockActivated() {
    return ActivationType$.MODULE$.BlockActivated();
  }
  
  public static Enumeration.Value ItemPlaced() {
    return ActivationType$.MODULE$.ItemPlaced();
  }
  
  public static Enumeration.Value ItemUsed() {
    return ActivationType$.MODULE$.ItemUsed();
  }
  
  public static Enumeration.Value None() {
    return ActivationType$.MODULE$.None();
  }
  
  public static Enumeration.Value withName(String paramString) {
    return ActivationType$.MODULE$.withName(paramString);
  }
  
  public static Enumeration.Value apply(int paramInt) {
    return ActivationType$.MODULE$.apply(paramInt);
  }
  
  public static int maxId() {
    return ActivationType$.MODULE$.maxId();
  }
  
  public static Enumeration.ValueSet values() {
    return ActivationType$.MODULE$.values();
  }
  
  public static String toString() {
    return ActivationType$.MODULE$.toString();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\agent\ActivationType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */