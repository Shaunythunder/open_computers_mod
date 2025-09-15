package li.cil.oc.client.gui.traits;

import java.util.List;
import net.minecraft.util.ResourceLocation;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;

@ScalaSignature(bytes = "\006\001\005\035baB\001\003!\003\r\ta\004\002\007/&tGm\\<\013\005\r!\021A\002;sC&$8O\003\002\006\r\005\031q-^5\013\005\035A\021AB2mS\026tGO\003\002\n\025\005\021qn\031\006\003\0271\t1aY5m\025\005i\021A\0017j\007\001\031\"\001\001\t\021\005EAR\"\001\n\013\005\025\031\"BA\004\025\025\t)b#A\005nS:,7M]1gi*\tq#A\002oKRL!!\007\n\003\023\035+\030nU2sK\026t\007\"B\016\001\t\003a\022A\002\023j]&$H\005F\001\036!\tq\022%D\001 \025\005\001\023!B:dC2\f\027B\001\022 \005\021)f.\033;\t\017\021\002\001\031!C\001K\0059q-^5MK\032$X#\001\024\021\005y9\023B\001\025 \005\rIe\016\036\005\bU\001\001\r\021\"\001,\003-9W/\033'fMR|F%Z9\025\005ua\003bB\027*\003\003\005\rAJ\001\004q\022\n\004BB\030\001A\003&a%\001\005hk&dUM\032;!\021\035\t\004\0011A\005\002\025\naaZ;j)>\004\bbB\032\001\001\004%\t\001N\001\013OVLGk\0349`I\025\fHCA\0176\021\035i#'!AA\002\031Baa\016\001!B\0231\023aB4vSR{\007\017\t\005\bs\001\001\r\021\"\001&\003\025A8+\033>f\021\035Y\004\0011A\005\002q\n\021\002_*ju\026|F%Z9\025\005ui\004bB\027;\003\003\005\rA\n\005\007\001\001\013\025\002\024\002\ra\034\026N_3!\021\035\t\005\0011A\005\002\025\nQ!_*ju\026Dqa\021\001A\002\023\005A)A\005z'&TXm\030\023fcR\021Q$\022\005\b[\t\013\t\0211\001'\021\0319\005\001)Q\005M\0051\021pU5{K\002Bq!\023\001C\002\023\005Q%A\006xS:$wn^,jIRD\007BB&\001A\003%a%\001\007xS:$wn^,jIRD\007\005C\004N\001\t\007I\021A\023\002\031]Lg\016Z8x\021\026Lw\r\033;\t\r=\003\001\025!\003'\00359\030N\0343po\"+\027n\0325uA!)\021\013\001D\001%\006y!-Y2lOJ|WO\0343J[\006<W-F\001T!\t!v+D\001V\025\t1F#\001\003vi&d\027B\001-V\005A\021Vm]8ve\016,Gj\\2bi&|g\016C\003[\001\021E1,A\002bI\022,\"\001X6\025\007u\003G\017\005\002\037=&\021ql\b\002\b\005>|G.Z1o\021\025\t\027\f1\001c\003\021a\027n\035;\021\007\r<\027.D\001e\025\t1VMC\001g\003\021Q\027M^1\n\005!$'\001\002'jgR\004\"A[6\r\001\021)A.\027b\001[\n\tA+\005\002ocB\021ad\\\005\003a~\021qAT8uQ&tw\r\005\002\037e&\0211o\b\002\004\003:L\b\"B;Z\001\004\t\030!\002<bYV,\007\"B<\001\t\003B\030\001\0053pKN<U/\033)bkN,w)Y7f)\005i\006\"\002>\001\t\003b\022aB5oSR<U/\033\005\006y\002!\t%`\001\013IJ\fwoU2sK\026tGCB\017\003\003\t)\001C\003\000w\002\007a%\001\004n_V\034X\r\027\005\007\003\007Y\b\031\001\024\002\r5|Wo]3Z\021\035\t9a\037a\001\003\023\t!\001\032;\021\007y\tY!C\002\002\016}\021QA\0227pCRDQ\"!\005\001!\003\r\t\021!C\0059\005M\021!D:va\026\024H%\0338ji\036+\030.\003\002{1!q\021q\003\001\021\002\007\005\t\021\"\003\002\032\005\025\022\001E:va\026\024H\005\032:boN\033'/Z3o)\035i\0221DA\017\003CA\001\"LA\013\003\003\005\rA\n\005\n\003?\t)\"!AA\002\031\n1\001\037\0233\021)\t\031#!\006\002\002\003\007\021\021B\001\004q\022\032\024B\001?\031\001")
public interface Window {
  void li$cil$oc$client$gui$traits$Window$_setter_$windowWidth_$eq(int paramInt);
  
  void li$cil$oc$client$gui$traits$Window$_setter_$windowHeight_$eq(int paramInt);
  
  int guiLeft();
  
  @TraitSetter
  void guiLeft_$eq(int paramInt);
  
  int guiTop();
  
  @TraitSetter
  void guiTop_$eq(int paramInt);
  
  int xSize();
  
  @TraitSetter
  void xSize_$eq(int paramInt);
  
  int ySize();
  
  @TraitSetter
  void ySize_$eq(int paramInt);
  
  int windowWidth();
  
  int windowHeight();
  
  ResourceLocation backgroundImage();
  
  <T> boolean add(List<T> paramList, Object paramObject);
  
  boolean doesGuiPauseGame();
  
  void initGui();
  
  void drawScreen(int paramInt1, int paramInt2, float paramFloat);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\traits\Window.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */