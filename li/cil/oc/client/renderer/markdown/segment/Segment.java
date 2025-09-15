package li.cil.oc.client.renderer.markdown.segment;

import net.minecraft.client.gui.FontRenderer;
import scala.Enumeration;
import scala.Function2;
import scala.Option;
import scala.collection.Iterable;
import scala.reflect.ScalaSignature;
import scala.runtime.TraitSetter;
import scala.util.matching.Regex;

@ScalaSignature(bytes = "\006\001\005ecaB\001\003!\003\r\t!\005\002\b'\026<W.\0328u\025\t\031A!A\004tK\036lWM\034;\013\005\0251\021\001C7be.$wn\0368\013\005\035A\021\001\003:f]\022,'/\032:\013\005%Q\021AB2mS\026tGO\003\002\f\031\005\021qn\031\006\003\0339\t1aY5m\025\005y\021A\0017j\007\001\031\"\001\001\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025I\002\001\"\001\033\003\031!\023N\\5uIQ\t1\004\005\002\0249%\021Q\004\006\002\005+:LG\017C\003 \001\031\005\001%\001\004qCJ,g\016^\013\002CA\021!\005A\007\002\005!)A\005\001C\003A\005!!o\\8uQ\t\031c\005\005\002(U5\t\001F\003\002*)\005Q\021M\0348pi\006$\030n\0348\n\005-B#a\002;bS2\024Xm\031\005\006[\0011\tAL\001\006]\026DH\017\027\013\005_I\"d\007\005\002\024a%\021\021\007\006\002\004\023:$\b\"B\032-\001\004y\023AB5oI\026tG\017C\0036Y\001\007q&\001\005nCb<\026\016\032;i\021\0259A\0061\0018!\tA\004)D\001:\025\tQ4(A\002hk&T!!\003\037\013\005ur\024!C7j]\026\034'/\0314u\025\005y\024a\0018fi&\021\021)\017\002\r\r>tGOU3oI\026\024XM\035\005\006\007\0021\t\001R\001\006]\026DH/\027\013\005_\0253u\tC\0034\005\002\007q\006C\0036\005\002\007q\006C\003\b\005\002\007q\007C\003J\001\021\005!*\001\004sK:$WM\035\013\t\027F\033VKV,Y5B\0311\003\024(\n\0055#\"AB(qi&|g\016\005\002#\037&\021\001K\001\002\023\023:$XM]1di&4XmU3h[\026tG\017C\003S\021\002\007q&A\001y\021\025!\006\n1\0010\003\005I\b\"B\032I\001\004y\003\"B\033I\001\004y\003\"B\004I\001\0049\004\"B-I\001\004y\023AB7pkN,\007\fC\003\\\021\002\007q&\001\004n_V\034X-\027\005\006;\002!\tAX\001\re\026tG-\032:BgR+\007\020\036\013\003?J\0042\001\0315l\035\t\tgM\004\002cK6\t1M\003\002e!\0051AH]8pizJ\021!F\005\003OR\tq\001]1dW\006<W-\003\002jU\nA\021\n^3sC\ndWM\003\002h)A\021An\034\b\003'5L!A\034\013\002\rA\023X\rZ3g\023\t\001\030O\001\004TiJLgn\032\006\003]RAQa\035/A\002Q\faAZ8s[\006$\bCA;z\035\t1x/D\001\005\023\tAH!\001\007NCJ\\W\017\035$pe6\fG/\003\002{w\n)a+\0317vK&\021A\020\006\002\f\013:,X.\032:bi&|g\016C\003\001\031\005q0\001\005u_N#(/\0338h)\rY\027\021\001\005\006gv\004\r\001\036\005\007}\002!\t%!\002\025\003-D\001\"!\003\001\t\003!\0211B\001\007e\0264\027N\\3\025\r\0055\021qBA\022!\r\001\007.\t\005\t\003#\t9\0011\001\002\024\0059\001/\031;uKJt\007\003BA\013\003?i!!a\006\013\t\005e\0211D\001\t[\006$8\r[5oO*\031\021Q\004\013\002\tU$\030\016\\\005\005\003C\t9BA\003SK\036,\007\020\003\005\002&\005\035\001\031AA\024\003\0351\027m\031;pef\004raEA\025C\0055\022%C\002\002,Q\021\021BR;oGRLwN\034\032\021\t\005=\022Q\007\b\005\003+\t\t$\003\003\0024\005]\021!\002*fO\026D\030\002BA\034\003s\021Q!T1uG\"TA!a\r\002\030!I\021Q\b\001A\002\023\005A\001I\001\005]\026DH\017\003\006\002B\001\001\r\021\"\001\005\003\007\n\001B\\3yi~#S-\035\013\0047\005\025\003\"CA$\003\t\t\0211\001\"\003\rAH%\r\005\b\003\027\002\001\025)\003\"\003\025qW\r\037;!\021!\ty\005\001C\001\t\005E\023AB5t\031\006\034H/\006\002\002TA\0311#!\026\n\007\005]CCA\004C_>dW-\0318")
public interface Segment {
  Segment parent();
  
  Segment root();
  
  int nextX(int paramInt1, int paramInt2, FontRenderer paramFontRenderer);
  
  int nextY(int paramInt1, int paramInt2, FontRenderer paramFontRenderer);
  
  Option<InteractiveSegment> render(int paramInt1, int paramInt2, int paramInt3, int paramInt4, FontRenderer paramFontRenderer, int paramInt5, int paramInt6);
  
  Iterable<String> renderAsText(Enumeration.Value paramValue);
  
  String toString(Enumeration.Value paramValue);
  
  String toString();
  
  Iterable<Segment> refine(Regex paramRegex, Function2<Segment, Regex.Match, Segment> paramFunction2);
  
  Segment next();
  
  @TraitSetter
  void next_$eq(Segment paramSegment);
  
  boolean isLast();
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\markdown\segment\Segment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */