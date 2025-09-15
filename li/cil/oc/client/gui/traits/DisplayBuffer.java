package li.cil.oc.client.gui.traits;

import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001)4q!\001\002\021\002\007\005qBA\007ESN\004H.Y=Ck\0324WM\035\006\003\007\021\ta\001\036:bSR\034(BA\003\007\003\r9W/\033\006\003\017!\taa\0317jK:$(BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\021\001\001\005\t\003#ai\021A\005\006\003\013MQ!a\002\013\013\005U1\022!C7j]\026\034'/\0314u\025\0059\022a\0018fi&\021\021D\005\002\n\017VL7k\031:fK:DQa\007\001\005\002q\ta\001J5oSR$C#A\017\021\005y\tS\"A\020\013\003\001\nQa]2bY\006L!AI\020\003\tUs\027\016\036\005\006I\0011\t\"J\001\bEV4g-\032:Y+\0051\003C\001\020(\023\tAsDA\002J]RDQA\013\001\007\022\025\nqAY;gM\026\024\030\fC\003-\001\031EQ%A\007ck\0324WM]\"pYVlgn\035\005\006]\0011\t\"J\001\013EV4g-\032:S_^\034\bb\002\031\001\001\004%\t\"M\001\017OVL7+\033>f\007\"\fgnZ3e+\005\021\004C\001\0204\023\t!tDA\004C_>dW-\0318\t\017Y\002\001\031!C\to\005\021r-^5TSj,7\t[1oO\026$w\fJ3r)\ti\002\bC\004:k\005\005\t\031\001\032\002\007a$\023\007\003\004<\001\001\006KAM\001\020OVL7+\033>f\007\"\fgnZ3eA!9Q\b\001a\001\n#)\023\001D2veJ,g\016^,jIRD\007bB \001\001\004%\t\002Q\001\021GV\024(/\0328u/&$G\017[0%KF$\"!H!\t\017er\024\021!a\001M!11\t\001Q!\n\031\nQbY;se\026tGoV5ei\"\004\003bB#\001\001\004%\t\"J\001\016GV\024(/\0328u\021\026Lw\r\033;\t\017\035\003\001\031!C\t\021\006\t2-\036:sK:$\b*Z5hQR|F%Z9\025\005uI\005bB\035G\003\003\005\rA\n\005\007\027\002\001\013\025\002\024\002\035\r,(O]3oi\"+\027n\0325uA!9Q\n\001a\001\n#q\025!B:dC2,W#A(\021\005y\001\026BA) \005\031!u.\0362mK\"91\013\001a\001\n#!\026!C:dC2,w\fJ3r)\tiR\013C\004:%\006\005\t\031A(\t\r]\003\001\025)\003P\003\031\0318-\0317fA!)\021\f\001C!9\0059\021N\\5u\017VL\007\"B.\001\t#a\022a\0043sC^\024UO\0324fe2\013\0270\032:\t\013u\003a\021\003\017\002\025\021\024\030m\036\"vM\032,'\017C\003`\001\031E\001-\001\006dQ\006tw-Z*ju\026$BaT1dK\")!M\030a\001\037\006\tq\017C\003e=\002\007q*A\001i\021\0251g\f1\0013\003%\021XmY8na&dW\rC\006i\001A\005\031\021!A\005\nqI\027!D:va\026\024H%\0338ji\036+\030.\003\002Z1\001")
public interface DisplayBuffer {
  int bufferX();
  
  int bufferY();
  
  int bufferColumns();
  
  int bufferRows();
  
  boolean guiSizeChanged();
  
  @TraitSetter
  void guiSizeChanged_$eq(boolean paramBoolean);
  
  int currentWidth();
  
  @TraitSetter
  void currentWidth_$eq(int paramInt);
  
  int currentHeight();
  
  @TraitSetter
  void currentHeight_$eq(int paramInt);
  
  double scale();
  
  @TraitSetter
  void scale_$eq(double paramDouble);
  
  void initGui();
  
  void drawBufferLayer();
  
  void drawBuffer();
  
  double changeSize(double paramDouble1, double paramDouble2, boolean paramBoolean);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\DisplayBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */