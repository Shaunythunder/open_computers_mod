/*    */ package li.cil.oc.server.component;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Network;
/*    */ import li.cil.oc.api.network.Connector;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.api.prefab.ManagedEnvironment;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.collection.immutable.Map;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001%4A!\001\002\001\033\taQ\013]4sC\022,'+\023+F\017*\0211\001B\001\nG>l\007o\0348f]RT!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\031\001(/\0324bE*\0211CB\001\004CBL\027BA\013\021\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\021\005]QR\"\001\r\013\005e\021\022A\0023sSZ,'/\003\002\0341\tQA)\032<jG\026LeNZ8\t\021u\001!Q1A\005\002y\tA\001[8tiV\tq\004\005\002!G5\t\021E\003\002#%\0059a.\032;x_J\\\027B\001\023\"\005=)eN^5s_:lWM\034;I_N$\b\002\003\024\001\005\003\005\013\021B\020\002\013!|7\017\036\021\t\013!\002A\021A\025\002\rqJg.\033;?)\tQC\006\005\002,\0015\t!\001C\003\036O\001\007q\004C\004/\001\t\007I\021I\030\002\t9|G-Z\013\002aA\021\001%M\005\003e\005\022\021bQ8o]\026\034Go\034:\t\rQ\002\001\025!\0031\003\025qw\016Z3!\021!1\004\001#b\001\n\0339\024A\0033fm&\034W-\0238g_V\t\001\b\005\003:\001\n\023U\"\001\036\013\005mb\024!C5n[V$\030M\0317f\025\tid(\001\006d_2dWm\031;j_:T\021aP\001\006g\016\fG.Y\005\003\003j\0221!T1q!\t\031\005*D\001E\025\t)e)\001\003mC:<'\"A$\002\t)\fg/Y\005\003\023\022\023aa\025;sS:<\007\002C&\001\021\003\005\013U\002\035\002\027\021,g/[2f\023:4w\016\t\005\006\033\002!\tET\001\016O\026$H)\032<jG\026LeNZ8\025\003=\003B\001U*U)6\t\021K\003\002S\r\006!Q\017^5m\023\t\t\025\013\005\002V3:\021akV\007\002}%\021\001LP\001\007!J,G-\0324\n\005%S&B\001-?\021\035a\006A1A\005Bu\013\021bY1o+B$\027\r^3\026\003y\003\"AV0\n\005\001t$a\002\"p_2,\027M\034\005\007E\002\001\013\021\0020\002\025\r\fg.\0269eCR,\007\005C\003e\001\021\005S-\001\004va\022\fG/\032\013\002MB\021akZ\005\003Qz\022A!\0268ji\002")
/*    */ public class UpgradeRITEG extends ManagedEnvironment implements DeviceInfo {
/*    */   private final EnvironmentHost host;
/*    */   
/*    */   public EnvironmentHost host() {
/* 17 */     return this.host;
/* 18 */   } private final Connector node = (Connector)Network.newNode((Environment)this, Visibility.Network)
/* 19 */     .withConnector()
/* 20 */     .create(); private Map<String, String> deviceInfo;
/*    */   public Connector node() { return this.node; }
/* 22 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/* 23 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "power");
/* 24 */         (new scala.Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Radioisotope thermoelectric generator");
/* 25 */         (new scala.Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 26 */         (new scala.Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Hazmat protection not included"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[4])); this.bitmap$0 = true; }
/*    */       
/*    */       return this.deviceInfo; }
/* 29 */      } public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */    private final Map<String, String> deviceInfo() {
/*    */     return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute();
/*    */   } private final boolean canUpdate = true; private volatile boolean bitmap$0; public boolean canUpdate() {
/* 33 */     return this.canUpdate;
/*    */   }
/*    */   public void update() {
/* 36 */     super.update();
/*    */     
/* 38 */     node().changeBuffer(Settings$.MODULE$.get().ritegUpgradeEfficiency());
/*    */   }
/*    */   
/*    */   public UpgradeRITEG(EnvironmentHost host) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\UpgradeRITEG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */