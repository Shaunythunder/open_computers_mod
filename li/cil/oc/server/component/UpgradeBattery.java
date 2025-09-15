/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.network.Connector;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001m3A!\001\002\001\033\tqQ\013]4sC\022,')\031;uKJL(BA\002\005\003%\031w.\0349p]\026tGO\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\ta\001\035:fM\006\024'BA\n\007\003\r\t\007/[\005\003+A\021!#T1oC\036,G-\0228wSJ|g.\\3oiB\021qCG\007\0021)\021\021DE\001\007IJLg/\032:\n\005mA\"A\003#fm&\034W-\0238g_\"AQ\004\001BC\002\023\005a$\001\003uS\026\024X#A\020\021\005\001\032S\"A\021\013\003\t\nQa]2bY\006L!\001J\021\003\007%sG\017\003\005'\001\t\005\t\025!\003 \003\025!\030.\032:!\021\025A\003\001\"\001*\003\031a\024N\\5u}Q\021!\006\f\t\003W\001i\021A\001\005\006;\035\002\ra\b\005\b]\001\021\r\021\"\0210\003\021qw\016Z3\026\003A\002\"!\r\033\016\003IR!a\r\n\002\0179,Go^8sW&\021QG\r\002\n\007>tg.Z2u_JDaa\016\001!\002\023\001\024!\0028pI\026\004\003\002C\035\001\021\013\007IQ\002\036\002\025\021,g/[2f\023:4w.F\001<!\021a\024iQ\"\016\003uR!AP \002\023%lW.\036;bE2,'B\001!\"\003)\031w\016\0347fGRLwN\\\005\003\005v\0221!T1q!\t!\025*D\001F\025\t1u)\001\003mC:<'\"\001%\002\t)\fg/Y\005\003\025\026\023aa\025;sS:<\007\002\003'\001\021\003\005\013UB\036\002\027\021,g/[2f\023:4w\016\t\005\006\035\002!\teT\001\016O\026$H)\032<jG\026LeNZ8\025\003A\003B!\025+V+6\t!K\003\002T\017\006!Q\017^5m\023\t\021%\013\005\002W3:\021\001eV\005\0031\006\na\001\025:fI\0264\027B\001&[\025\tA\026\005")
/*    */ public class UpgradeBattery extends ManagedEnvironment implements DeviceInfo {
/*    */   private final int tier;
/*    */   private final Connector node;
/*    */   
/* 16 */   public int tier() { return this.tier; } private Map<String, String> deviceInfo; private volatile boolean bitmap$0; public UpgradeBattery(int tier) {
/* 17 */     this.node = (Connector)Network.newNode((Environment)this, Visibility.Network)
/* 18 */       .withConnector(Settings$.MODULE$.get().bufferCapacitorUpgrades()[tier])
/* 19 */       .create(); }
/*    */   public Connector node() { return this.node; }
/* 21 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/* 22 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "power");
/* 23 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Battery");
/* 24 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 25 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Unlimited Power (Almost Ed.)");
/* 26 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToDouble(Settings$.MODULE$.get().bufferCapacitorUpgrades()[tier()]).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*    */        return this.deviceInfo; }
/*    */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/* 29 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeBattery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */