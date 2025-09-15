/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001m3A!\001\002\001\033\t\0311\tU+\013\005\r!\021!C2p[B|g.\0328u\025\t)a!\001\004tKJ4XM\035\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017-A\021q\002F\007\002!)\021\021CE\001\007aJ,g-\0312\013\005M1\021aA1qS&\021Q\003\005\002\023\033\006t\027mZ3e\013:4\030N]8o[\026tG\017\005\002\03055\t\001D\003\002\032%\0051AM]5wKJL!a\007\r\003\025\021+g/[2f\023:4w\016\003\005\036\001\t\025\r\021\"\001\037\003\021!\030.\032:\026\003}\001\"\001I\022\016\003\005R\021AI\001\006g\016\fG.Y\005\003I\005\0221!\0238u\021!1\003A!A!\002\023y\022!\002;jKJ\004\003\"\002\025\001\t\003I\023A\002\037j]&$h\b\006\002+YA\0211\006A\007\002\005!)Qd\na\001?!9a\006\001b\001\n\003z\023\001\0028pI\026,\022\001\r\t\003cQj\021A\r\006\003gI\tqA\\3uo>\0248.\003\0026e\t!aj\0343f\021\0319\004\001)A\005a\005)an\0343fA!A\021\b\001EC\002\0235!(\001\006eKZL7-Z%oM>,\022a\017\t\005y\005\0335)D\001>\025\tqt(A\005j[6,H/\0312mK*\021\001)I\001\013G>dG.Z2uS>t\027B\001\">\005\ri\025\r\035\t\003\t&k\021!\022\006\003\r\036\013A\001\\1oO*\t\001*\001\003kCZ\f\027B\001&F\005\031\031FO]5oO\"AA\n\001E\001B\00361(A\006eKZL7-Z%oM>\004\003\"\002(\001\t\003z\025!D4fi\022+g/[2f\023:4w\016F\001Q!\021\tF+V+\016\003IS!aU$\002\tU$\030\016\\\005\003\005J\003\"AV-\017\005\001:\026B\001-\"\003\031\001&/\0323fM&\021!J\027\006\0031\006\002")
/*    */ public class CPU extends ManagedEnvironment implements DeviceInfo {
/* 16 */   public int tier() { return this.tier; } private final int tier; public Node node() {
/* 17 */     return this.node; } private final Node node = Network.newNode((Environment)this, Visibility.Neighbors)
/* 18 */     .create(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0;
/*    */   
/* 20 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/* 21 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "processor");
/* 22 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "CPU");
/* 23 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 24 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), (new StringBuilder()).append("FlexiArch ").append(BoxesRunTime.boxToInteger(tier() + 1).toString()).append(" Processor").toString());
/* 25 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("clock"), BoxesRunTime.boxToInteger((int)(Settings$.MODULE$.get().callBudgets()[tier()] * 'Ϩ')).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*    */        return this.deviceInfo; }
/*    */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/* 28 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */   
/*    */   public CPU(int tier) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\CPU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */