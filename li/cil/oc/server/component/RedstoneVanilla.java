/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import java.util.Map;
/*     */ import li.cil.oc.api.driver.DeviceInfo;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Message;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.MatchError;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005MfaB\001\003!\003\r\t!\004\002\020%\026$7\017^8oKZ\013g.\0337mC*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\005\00191\"\004\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\002$D\001\003\023\tI\"AA\tSK\022\034Ho\0348f'&<g.\0317mKJ\004\"a\007\020\016\003qQ!!\b\n\002\r\021\024\030N^3s\023\tyBD\001\006EKZL7-Z%oM>DQ!\t\001\005\002\t\na\001J5oSR$C#A\022\021\005\021:S\"A\023\013\003\031\nQa]2bY\006L!\001K\023\003\tUs\027\016\036\005\006U\0011\taK\001\te\026$7\017^8oKV\tAFE\002._U2AA\f\001\001Y\taAH]3gS:,W.\0328u}A\021\001gM\007\002c)\021!GE\001\b]\026$xo\034:l\023\t!\024GA\bF]ZL'o\0348nK:$\bj\\:u!\t1T(D\0018\025\tA\024(\001\004ue\006LGo\035\006\003um\n!\002^5mK\026tG/\033;z\025\tad!\001\004d_6lwN\\\005\003}]\022QBU3egR|g.Z!xCJ,\007\002\003!\001\021\013\007IQB!\002\025\021,g/[2f\023:4w.F\001C!\021\031\005J\023&\016\003\021S!!\022$\002\023%lW.\036;bE2,'BA$&\003)\031w\016\0347fGRLwN\\\005\003\023\022\0231!T1q!\tY\005+D\001M\025\tie*\001\003mC:<'\"A(\002\t)\fg/Y\005\003#2\023aa\025;sS:<\007\002C*\001\021\003\005\013U\002\"\002\027\021,g/[2f\023:4w\016\t\005\006+\002!\tEV\001\016O\026$H)\032<jG\026LeNZ8\025\003]\003B\001W.]96\t\021L\003\002[\035\006!Q\017^5m\023\tI\025\f\005\002^A:\021AEX\005\003?\026\na\001\025:fI\0264\027BA)b\025\tyV\005C\004d\001\t\007I\021\0033\002\025MKE)R0S\003:;U)F\001f!\r!c\r[\005\003O\026\022Q!\021:sCf\004\"!\0339\016\003)T!AW6\013\005qb'BA7o\0039i\027N\\3de\0064GOZ8sO\026T\021a\\\001\004]\026$\030BA9k\00591uN]4f\t&\024Xm\031;j_:Daa\035\001!\002\023)\027aC*J\t\026{&+\021(H\013\002BQ!\036\001\005\002Y\f\001bZ3u\023:\004X\017\036\013\005on\f9\001E\002%Mb\004\"\001J=\n\005i,#AB!osJ+g\rC\003}i\002\007Q0A\004d_:$X\r\037;\021\007y\f\031!D\001\000\025\r\t\tAE\001\b[\006\034\007.\0338f\023\r\t)a \002\b\007>tG/\032=u\021\035\tI\001\036a\001\003\027\tA!\031:hgB\031a0!\004\n\007\005=qPA\005Be\036,X.\0328ug\"ZA/a\005\002\032\005m\021QDA\020!\rq\030QC\005\004\003/y(\001C\"bY2\024\027mY6\002\r\021L'/Z2u3\005\t\021a\0013pG\006\022\021\021E\001sMVt7\r^5p]\"Z6/\0333fu9,XNY3s;&Rd.^7cKJ\004sN\035\021uC\ndW\rI\027.A\035+G\017\t;iK\002\022X\rZ:u_:,\007%\0338qkR\004\003&\0317mAMLG-Z:-A=\024\be\0349uS>t\027\r\0347zA=t\007\005\0365fAM\004XmY5gS\026$\007e]5eK&Bq!!\n\001\t\003\t9#A\005hKR|U\017\0369viR)q/!\013\002,!1A0a\tA\002uD\001\"!\003\002$\001\007\0211\002\025\r\003G\t\031\"!\007\002\034\005u\021qF\021\003\003c\t1OZ;oGRLwN\034\025\\g&$WM\0178v[\n,'/X\025;]Vl'-\032:!_J\004C/\0312mK\002jS\006I$fi\002\"\b.\032\021sK\022\034Ho\0348fA=,H\017];uA!\nG\016\034\021tS\022,7\017\f\021pe\002z\007\017^5p]\006dG.\037\021p]\002\"\b.\032\021ta\026\034\027NZ5fI\002\032\030\016Z3*\021\035\t)\004\001C\001\003o\t\021b]3u\037V$\b/\036;\025\013]\fI$a\017\t\rq\f\031\0041\001~\021!\tI!a\rA\002\005-\001\006CA\032\003'\ti\"a\020\"\005\005\005\023!!\023gk:\034G/[8oQm\033\030\016Z3;]Vl'-\032:-Au3\030\r\\;fu9,XNY3sA=\024\b\005^1cY\026L#H\\;nE\026\024\be\034:!i\006\024G.\032\021.[\001\0023+\032;!i\",\007E]3egR|g.\032\021pkR\004X\017\036\021)C2d\007e]5eKNd\003e\034:!_B$\030n\0348bY2L\be\0348!i\",\007e\0359fG&4\027.\0323!g&$W-\013\030!%\026$XO\0358tAA\024XM^5pkN\004c/\0317vKNDq!!\022\001\t\003\t9%\001\nhKR\034u.\0349be\006$xN]%oaV$H#B<\002J\005-\003B\002?\002D\001\007Q\020\003\005\002\n\005\r\003\031AA\006Q1\t\031%a\005\002\032\005m\021QDA(C\t\t\t&A(gk:\034G/[8oQMLG-\032\036ok6\024WM]\025;]Vl'-\032:![5\002s)\032;!i\",\007eY8na\006\024\030\r^8sA%t\007/\036;!_:\004C\017[3!gB,7-\0334jK\022\0043/\0333f]!9\021Q\013\001\005B\005]\023!C8o\033\026\0348/Y4f)\r\031\023\021\f\005\t\0037\n\031\0061\001\002^\0059Q.Z:tC\036,\007c\001\031\002`%\031\021\021M\031\003\0175+7o]1hK\"9\021Q\r\001\005\n\005\035\024aD4fi>\003H/[8oC2\034\026\016Z3\025\t\005%\024Q\017\t\006I\005-\024qN\005\004\003[*#AB(qi&|g\016E\002%\003cJ1!a\035&\005\rIe\016\036\005\t\003\023\t\031\0071\001\002\f!9\021\021\020\001\005\n\005m\024!D4fi\006\0338/[4o[\026tG\017\006\003\002~\005%\005c\002\023\002\000\005\r\0251Q\005\004\003\003+#A\002+va2,'\007E\002%\003\013K1!a\"&\005\r\te.\037\005\t\003\023\t9\b1\001\002\f!9\021Q\022\001\005\022\005=\025!C2iK\016\\7+\0333f)\025A\027\021SAJ\021!\tI!a#A\002\005-\001\002CAK\003\027\003\r!a\034\002\013%tG-\032=\t\017\005e\005\001\"\003\002\034\006Ya/\0317vKN$v.T1q)\021\ti*!)\021\017u\013y*a\034\002p%\021\021*\031\005\t\003G\0139\n1\001\002&\006\021\021M\035\t\005I\031\fy\007\003\b\002*\002\001\n1!A\001\n\023\tY+!-\002\037M,\b/\032:%_:lUm]:bO\026$2aIAW\021)\ty+a*\002\002\003\007\021QL\001\004q\022\n\024bAA+)\001")
/*     */ public interface RedstoneVanilla
/*     */   extends RedstoneSignaller, DeviceInfo
/*     */ {
/*     */   void li$cil$oc$server$component$RedstoneVanilla$_setter_$SIDE_RANGE_$eq(ForgeDirection[] paramArrayOfForgeDirection);
/*     */   
/*     */   EnvironmentHost redstone();
/*     */   
/*     */   Map<String, String> li$cil$oc$server$component$RedstoneVanilla$$deviceInfo();
/*     */   
/*     */   Map<String, String> getDeviceInfo();
/*     */   
/*     */   ForgeDirection[] SIDE_RANGE();
/*     */   
/*     */   @Callback(direct = true, doc = "function([side:number]):number or table -- Get the redstone input (all sides, or optionally on the specified side)")
/*     */   Object[] getInput(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(direct = true, doc = "function([side:number]):number or table -- Get the redstone output (all sides, or optionally on the specified side)")
/*     */   Object[] getOutput(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function([side:number, ]value:number or table):number or table --  Set the redstone output (all sides, or optionally on the specified side). Returns previous values")
/*     */   Object[] setOutput(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(direct = true, doc = "function(side:number):number -- Get the comparator input on the specified side.")
/*     */   Object[] getComparatorInput(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   void onMessage(Message paramMessage);
/*     */   
/*     */   ForgeDirection checkSide(Arguments paramArguments, int paramInt);
/*     */   
/*     */   public final class RedstoneVanilla$$anonfun$valuesToMap$1
/*     */     extends AbstractFunction1<ForgeDirection, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public RedstoneVanilla$$anonfun$valuesToMap$1(RedstoneVanilla $outer) {}
/*     */     
/*     */     public final int apply(ForgeDirection x$1) {
/* 124 */       return x$1.ordinal(); } } public final class RedstoneVanilla$$anonfun$valuesToMap$2 extends AbstractFunction1<Object, Tuple2<Object, Object>> implements Serializable { public final Tuple2<Object, Object> apply(int x0$1) { int i = x0$1; if (i < this.ar$1.length) return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(i)), BoxesRunTime.boxToInteger(this.ar$1[i]));  throw new MatchError(BoxesRunTime.boxToInteger(i)); }
/*     */ 
/*     */     
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final int[] ar$1;
/*     */     
/*     */     public RedstoneVanilla$$anonfun$valuesToMap$2(RedstoneVanilla $outer, int[] ar$1) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneVanilla.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */