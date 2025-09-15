package li.cil.oc.integration.appeng;

import cpw.mods.fml.common.versioning.VersionRange;
import li.cil.oc.common.item.data.DroneData;
import li.cil.oc.common.item.data.RobotData;
import net.minecraft.item.ItemStack;
import scala.Serializable;
import scala.reflect.ScalaSignature;
import scala.runtime.AbstractFunction1;
import scala.runtime.BoxedUnit;

@ScalaSignature(bytes = "\006\001\005\035u!B\001\003\021\003i\021AB!F+RLGN\003\002\004\t\0051\021\r\0359f]\036T!!\002\004\002\027%tG/Z4sCRLwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\001\001C\001\b\020\033\005\021a!\002\t\003\021\003\t\"AB!F+RLGn\005\002\020%A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\017qy!\031!C\001;\005\001c/\032:tS>t7oV5uQ:+w/\023;f[\022+g-\0338ji&|g.\021)J+\005q\002CA\020+\033\005\001#BA\021#\003)1XM]:j_:Lgn\032\006\003G\021\naaY8n[>t'BA\023'\003\r1W\016\034\006\003O!\nA!\\8eg*\t\021&A\002da^L!a\013\021\003\031Y+'o]5p]J\013gnZ3\t\r5z\001\025!\003\037\003\0052XM]:j_:\034x+\033;i\035\026<\030\n^3n\t\0264\027N\\5uS>t\027\tU%!\021\025ys\002\"\0011\003])8/\032(fo&#X-\034#fM&t\027\016^5p]\006\003\026*F\0012!\t\031\"'\003\0024)\t9!i\\8mK\006t\007\"B\033\020\t\003\001\024AE1sK\016C\027M\0348fYN,e.\0312mK\022DQaN\b\005\nA\nQ#\031:f\007\"\fgN\\3mg\026s\027M\0317fI:+w\017C\003:\037\021%\001'A\013be\026\034\005.\0318oK2\034XI\\1cY\026$w\n\0343\t\013mzA\021\001\037\002\037\r|g\016\036:pY2,'o\0217bgN,\022!\020\031\003}\035\0032a\020\"F\035\t\031\002)\003\002B)\0051\001K]3eK\032L!a\021#\003\013\rc\027m]:\013\005\005#\002C\001$H\031\001!\021\002\023\036\002\002\003\005)\021A%\003\007}#\023'\005\002K\033B\0211cS\005\003\031R\021qAT8uQ&tw\r\005\002\024\035&\021q\n\006\002\004\003:L\b\"B)\020\t\023\021\026AE2p]R\024x\016\0347fe\016c\027m]:OK^,\022a\025\031\003)Z\0032a\020\"V!\t1e\013B\005X!\006\005\t\021!B\001\023\n\031q\f\n\032\t\013e{A\021\002.\002%\r|g\016\036:pY2,'o\0217bgN|E\016Z\013\0027B\022AL\030\t\004\tk\006C\001$_\t%y\006,!A\001\002\013\005\021JA\002`IQBQ!Y\b\005\002\t\fA\"[:D_:$(o\0347mKJ$\"!M2\t\013\021\004\007\031A3\002\013M$\030mY6\021\005\031lW\"A4\013\005!L\027\001B5uK6T!A[6\002\0235Lg.Z2sC\032$(\"\0017\002\0079,G/\003\002oO\nI\021\n^3n'R\f7m\033\005\006a>!I!]\001\020SN\034uN\034;s_2dWM\035(foR\021\021G\035\005\006I>\004\r!\032\005\006i>!I!^\001\020SN\034uN\034;s_2dWM](mIR\021\021G\036\005\006IN\004\r!\032\005\006q>!\t!_\001\fSN,\005\020]8si\n+8\017\006\0022u\")Am\036a\001K\")Ap\004C\005{\006q\021n]#ya>\024HOQ;t\035\026<HCA\031\021\025!7\0201\001f\021\035\t\ta\004C\005\003\007\ta\"[:FqB|'\017\036\"vg>cG\rF\0022\003\013AQ\001Z@A\002\025Dq!!\003\020\t\003\tY!A\006jg&k\007o\034:u\005V\034HcA\031\002\016!1A-a\002A\002\025Dq!!\005\020\t\023\t\031\"\001\bjg&k\007o\034:u\005V\034h*Z<\025\007E\n)\002\003\004e\003\037\001\r!\032\005\b\0033yA\021BA\016\0039I7/S7q_J$()^:PY\022$2!MA\017\021\031!\027q\003a\001K\"9\021\021E\b\005\002\005\r\022\001E5t\0052|7m[%oi\026\024h-Y2f)\r\t\024Q\005\005\007I\006}\001\031A3\t\017\005%r\002\"\003\002,\005\031\022n\035\"m_\016\\\027J\034;fe\032\f7-\032(foR\031\021'!\f\t\r\021\f9\0031\001f\021\035\t\td\004C\005\003g\t1#[:CY>\0347.\0238uKJ4\027mY3PY\022$2!MA\033\021\031!\027q\006a\001K\"9\021\021H\b\005\002\005m\022aD5t!\006\024H/\0238uKJ4\027mY3\025\007E\ni\004\003\004e\003o\001\r!\032\005\b\003\003zA\021BA\"\003II7\017U1si&sG/\032:gC\016,g*Z<\025\007E\n)\005\003\004e\003\001\r!\032\005\b\003\023zA\021BA&\003II7\017U1si&sG/\032:gC\016,w\n\0343\025\007E\ni\005\003\004e\003\017\002\r!\032\005\b\003#zA\021AA*\003\035I7OU8c_R$2!MA+\021\031!\027q\na\001K\"9\021\021L\b\005\002\005m\023aB5t\tJ|g.\032\013\004c\005u\003B\0023\002X\001\007Q\rC\004\002b=!\t!a\031\002+\035,G/Q#Va\036\024\030\rZ3D_6\004xN\\3oiR\031Q-!\032\t\021\005\035\024q\fa\001\003S\nQA]8c_R\004B!a\033\002v5\021\021Q\016\006\005\003_\n\t(\001\003eCR\f'b\0015\002t)\0211EB\005\005\003o\niGA\005S_\n|G\017R1uC\"9\021\021M\b\005\002\005mDcA3\002~!A\021qPA=\001\004\t\t)A\003ee>tW\r\005\003\002l\005\r\025\002BAC\003[\022\021\002\022:p]\026$\025\r^1")
public final class AEUtil {
  public static ItemStack getAEUpgradeComponent(DroneData paramDroneData) {
    return AEUtil$.MODULE$.getAEUpgradeComponent(paramDroneData);
  }
  
  public static ItemStack getAEUpgradeComponent(RobotData paramRobotData) {
    return AEUtil$.MODULE$.getAEUpgradeComponent(paramRobotData);
  }
  
  public static boolean isDrone(ItemStack paramItemStack) {
    return AEUtil$.MODULE$.isDrone(paramItemStack);
  }
  
  public static boolean isRobot(ItemStack paramItemStack) {
    return AEUtil$.MODULE$.isRobot(paramItemStack);
  }
  
  public static boolean isPartInterface(ItemStack paramItemStack) {
    return AEUtil$.MODULE$.isPartInterface(paramItemStack);
  }
  
  public static boolean isBlockInterface(ItemStack paramItemStack) {
    return AEUtil$.MODULE$.isBlockInterface(paramItemStack);
  }
  
  public static boolean isImportBus(ItemStack paramItemStack) {
    return AEUtil$.MODULE$.isImportBus(paramItemStack);
  }
  
  public static boolean isExportBus(ItemStack paramItemStack) {
    return AEUtil$.MODULE$.isExportBus(paramItemStack);
  }
  
  public static boolean isController(ItemStack paramItemStack) {
    return AEUtil$.MODULE$.isController(paramItemStack);
  }
  
  public static Class<?> controllerClass() {
    return AEUtil$.MODULE$.controllerClass();
  }
  
  public static boolean areChannelsEnabled() {
    return AEUtil$.MODULE$.areChannelsEnabled();
  }
  
  public static boolean useNewItemDefinitionAPI() {
    return AEUtil$.MODULE$.useNewItemDefinitionAPI();
  }
  
  public static VersionRange versionsWithNewItemDefinitionAPI() {
    return AEUtil$.MODULE$.versionsWithNewItemDefinitionAPI();
  }
  
  public final class AEUtil$$anonfun$getAEUpgradeComponent$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
    public static final long serialVersionUID = 0L;
    
    private final Object nonLocalReturnKey1$1;
    
    public AEUtil$$anonfun$getAEUpgradeComponent$1(Object nonLocalReturnKey1$1) {}
    
    public final void apply(ItemStack component) {
      // Byte code:
      //   0: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
      //   3: aload_1
      //   4: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
      //   7: astore_2
      //   8: aload_2
      //   9: instanceof scala/Some
      //   12: ifeq -> 43
      //   15: aload_2
      //   16: checkcast scala/Some
      //   19: astore_3
      //   20: aload_3
      //   21: invokevirtual x : ()Ljava/lang/Object;
      //   24: instanceof li/cil/oc/integration/appeng/ItemUpgradeAE
      //   27: ifeq -> 43
      //   30: new scala/runtime/NonLocalReturnControl
      //   33: dup
      //   34: aload_0
      //   35: getfield nonLocalReturnKey1$1 : Ljava/lang/Object;
      //   38: aload_1
      //   39: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
      //   42: athrow
      //   43: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
      //   46: astore #4
      //   48: return
      // Line number table:
      //   Java source line number -> byte code offset
      //   #133	-> 0
      //   #134	-> 8
      //   #133	-> 20
      //   #134	-> 21
      //   #135	-> 43
      //   #133	-> 48
      // Local variable table:
      //   start	length	slot	name	descriptor
      //   0	49	0	this	Lli/cil/oc/integration/appeng/AEUtil$$anonfun$getAEUpgradeComponent$1;
      //   0	49	1	component	Lnet/minecraft/item/ItemStack;
    }
  }
  
  public final class AEUtil$$anonfun$getAEUpgradeComponent$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
    public static final long serialVersionUID = 0L;
    
    private final Object nonLocalReturnKey2$1;
    
    public AEUtil$$anonfun$getAEUpgradeComponent$2(Object nonLocalReturnKey2$1) {}
    
    public final void apply(ItemStack component) {
      // Byte code:
      //   0: getstatic li/cil/oc/common/item/Delegator$.MODULE$ : Lli/cil/oc/common/item/Delegator$;
      //   3: aload_1
      //   4: invokevirtual subItem : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
      //   7: astore_2
      //   8: aload_2
      //   9: instanceof scala/Some
      //   12: ifeq -> 43
      //   15: aload_2
      //   16: checkcast scala/Some
      //   19: astore_3
      //   20: aload_3
      //   21: invokevirtual x : ()Ljava/lang/Object;
      //   24: instanceof li/cil/oc/integration/appeng/ItemUpgradeAE
      //   27: ifeq -> 43
      //   30: new scala/runtime/NonLocalReturnControl
      //   33: dup
      //   34: aload_0
      //   35: getfield nonLocalReturnKey2$1 : Ljava/lang/Object;
      //   38: aload_1
      //   39: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
      //   42: athrow
      //   43: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
      //   46: astore #4
      //   48: return
      // Line number table:
      //   Java source line number -> byte code offset
      //   #143	-> 0
      //   #144	-> 8
      //   #143	-> 20
      //   #144	-> 21
      //   #145	-> 43
      //   #143	-> 48
      // Local variable table:
      //   start	length	slot	name	descriptor
      //   0	49	0	this	Lli/cil/oc/integration/appeng/AEUtil$$anonfun$getAEUpgradeComponent$2;
      //   0	49	1	component	Lnet/minecraft/item/ItemStack;
    }
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\AEUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */