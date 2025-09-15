/*    */ package li.cil.oc.server.component;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.driver.DeviceInfo;
/*    */ import li.cil.oc.api.network.Environment;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001m3A!\001\002\001\033\t1Q*Z7pefT!a\001\003\002\023\r|W\016]8oK:$(BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\0051\001O]3gC\nT!a\005\004\002\007\005\004\030.\003\002\026!\t\021R*\0318bO\026$WI\034<je>tW.\0328u!\t9\"$D\001\031\025\tI\"#\001\004ee&4XM]\005\0037a\021!\002R3wS\016,\027J\0344p\021!i\002A!b\001\n\003q\022\001\002;jKJ,\022a\b\t\003A\rj\021!\t\006\002E\005)1oY1mC&\021A%\t\002\004\023:$\b\002\003\024\001\005\003\005\013\021B\020\002\013QLWM\035\021\t\013!\002A\021A\025\002\rqJg.\033;?)\tQC\006\005\002,\0015\t!\001C\003\036O\001\007q\004C\004/\001\t\007I\021I\030\002\t9|G-Z\013\002aA\021\021\007N\007\002e)\0211GE\001\b]\026$xo\034:l\023\t)$G\001\003O_\022,\007BB\034\001A\003%\001'A\003o_\022,\007\005\003\005:\001!\025\r\021\"\004;\003)!WM^5dK&sgm\\\013\002wA!A(Q\"D\033\005i$B\001 @\003%IW.\\;uC\ndWM\003\002AC\005Q1m\0347mK\016$\030n\0348\n\005\tk$aA'baB\021A)S\007\002\013*\021aiR\001\005Y\006twMC\001I\003\021Q\027M^1\n\005)+%AB*ue&tw\r\003\005M\001!\005\t\025)\004<\003-!WM^5dK&sgm\034\021\t\0139\003A\021I(\002\033\035,G\017R3wS\016,\027J\0344p)\005\001\006\003B)U+Vk\021A\025\006\003'\036\013A!\036;jY&\021!I\025\t\003-fs!\001I,\n\005a\013\023A\002)sK\022,g-\003\002K5*\021\001,\t")
/*    */ public class Memory extends ManagedEnvironment implements DeviceInfo {
/* 16 */   public int tier() { return this.tier; } private final int tier; public Node node() {
/* 17 */     return this.node; } private final Node node = Network.newNode((Environment)this, Visibility.Neighbors)
/* 18 */     .create(); private Map<String, String> deviceInfo; private volatile boolean bitmap$0;
/*    */   
/* 20 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/* 21 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "memory");
/* 22 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Memory bank");
/* 23 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 24 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Multipurpose RAM Type");
/* 25 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("clock"), BoxesRunTime.boxToInteger((int)(Settings$.MODULE$.get().callBudgets()[tier()] * 'Ϩ')).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 28 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */ 
/*    */   
/*    */   private final Map<String, String> deviceInfo() {
/*    */     return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute();
/*    */   }
/*    */   
/*    */   public Memory(int tier) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Memory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */